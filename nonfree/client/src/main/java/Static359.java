import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!om", name = "i", descriptor = "F")
	public static float aFloat292;

	@OriginalMember(owner = "client!om", name = "f", descriptor = "[I")
	public static final int[] anIntArray505 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!om", name = "g", descriptor = "[I")
	public static final int[] anIntArray506 = new int[1000];

	@OriginalMember(owner = "client!om", name = "j", descriptor = "Z")
	public static boolean aBoolean477 = false;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public static boolean method5523(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static150.anInt3101; local11++) {
			if (arg0.equalsIgnoreCase(Static357.aStringArray30[local11])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static13.aStringArray6[local11])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
	public static boolean method5525(@OriginalArg(0) String arg0) {
		return Static470.method6586(arg0);
	}
}
