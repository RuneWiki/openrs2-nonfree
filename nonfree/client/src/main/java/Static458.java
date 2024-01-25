import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static458 {

	@OriginalMember(owner = "client!su", name = "a", descriptor = "Lclient!os;")
	public static Class1_Sub17 aClass1_Sub17_8;

	@OriginalMember(owner = "client!su", name = "b", descriptor = "[I")
	public static final int[] anIntArray733 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!su", name = "d", descriptor = "Z")
	public static boolean aBoolean588 = false;

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(III)I")
	public static int method7006(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static33.anIntArray649[arg0 & 0x3] : Static360.anIntArray634[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Z)I")
	public static int method7007() {
		if ((double) Static335.aFloat104 == 3.0D) {
			return 37;
		} else if ((double) Static335.aFloat104 == 4.0D) {
			return 50;
		} else if ((double) Static335.aFloat104 == 6.0D) {
			return 75;
		} else if ((double) Static335.aFloat104 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}
}
