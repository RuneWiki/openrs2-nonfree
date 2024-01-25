import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static438 {

	@OriginalMember(owner = "client!om", name = "t", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!om", name = "w", descriptor = "Lclient!of;")
	public static Class264 aClass264_1;

	@OriginalMember(owner = "client!om", name = "v", descriptor = "I")
	public static int anInt7120 = 104;

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(III)I")
	public static int method5982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "([J[II)V")
	public static void method5985(@OriginalArg(0) long[] arg0, @OriginalArg(1) int[] arg1) {
		Static218.method3193(arg0, arg0.length - 1, 0, arg1);
	}
}
