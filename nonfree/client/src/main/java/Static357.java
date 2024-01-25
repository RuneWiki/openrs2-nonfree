import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static357 {

	@OriginalMember(owner = "client!lr", name = "d", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray4 = new Color[] { new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381) };

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "J")
	public static long aLong204 = -1L;

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(BILclient!ha;I)V")
	public static void method5435(@OriginalArg(1) int arg0, @OriginalArg(2) Class75 arg1, @OriginalArg(3) int arg2) {
		Static473.aClass75_14 = arg1;
		Static401.aClass304ArrayArray1 = new Class304[arg2][arg0];
		if (Static592.anIntArray612 != null) {
			Static522.aClass81_2 = Static9.method121(Static592.anIntArray612[0], Static592.anIntArray612[5], Static592.anIntArray612[4], Static592.anIntArray612[1], Static592.anIntArray612[3], Static592.anIntArray612[2]);
		}
		Static652.aClass277_8 = null;
		Static167.aClass304_1 = new Class304();
		Static221.method4014();
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)I")
	public static int method5436() {
		return Static290.anInt10204 == 1 ? Static367.anInt6186 : Static334.anInt5734;
	}
}
