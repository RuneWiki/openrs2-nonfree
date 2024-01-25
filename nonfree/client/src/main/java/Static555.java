import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static555 {

	@OriginalMember(owner = "client!vfa", name = "C", descriptor = "I")
	public static int anInt10135;

	@OriginalMember(owner = "client!vfa", name = "K", descriptor = "I")
	public static int anInt10137;

	@OriginalMember(owner = "client!vfa", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString220 = null;

	@OriginalMember(owner = "client!vfa", name = "G", descriptor = "Z")
	public static boolean aBoolean697 = false;

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IIII)I")
	public static int method7884(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return arg0;
		} else if (local3 == 2) {
			return 4095 - arg2;
		} else {
			return 4095 - arg0;
		}
	}
}
