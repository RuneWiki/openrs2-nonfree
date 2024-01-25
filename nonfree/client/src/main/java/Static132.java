import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!hi", name = "l", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!hi", name = "q", descriptor = "I")
	public static int anInt2871;

	@OriginalMember(owner = "client!hi", name = "r", descriptor = "[I")
	public static int[] anIntArray220;

	@OriginalMember(owner = "client!hi", name = "t", descriptor = "[[B")
	public static byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
	public static int anInt2862 = 0;

	@OriginalMember(owner = "client!hi", name = "i", descriptor = "[I")
	public static final int[] anIntArray219 = new int[50];

	@OriginalMember(owner = "client!hi", name = "p", descriptor = "I")
	public static int anInt2870 = 0;

	@OriginalMember(owner = "client!hi", name = "s", descriptor = "I")
	public static int anInt2872 = 0;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public static int method2297(@OriginalArg(0) String arg0) {
		for (@Pc(14) int local14 = 0; local14 < Static358.aStringArray42.length; local14++) {
			if (Static358.aStringArray42[local14].equalsIgnoreCase(arg0)) {
				return local14;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!kd;BLjava/lang/Object;)V")
	public static void method2299(@OriginalArg(0) Class123 arg0, @OriginalArg(2) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < 50 && arg0.anEventQueue1.peekEvent() != null; local15++) {
			Static215.method3855(1L);
		}
		if (arg1 != null) {
			arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
		}
	}
}
