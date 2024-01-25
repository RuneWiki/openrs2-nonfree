import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static445 {

	@OriginalMember(owner = "client!wl", name = "i", descriptor = "[[B")
	public static byte[][] aByteArrayArray25;

	@OriginalMember(owner = "client!wl", name = "l", descriptor = "Lclient!dn;")
	public static Class56 aClass56_99;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "[I")
	public static final int[] anIntArray575 = new int[1];

	@OriginalMember(owner = "client!wl", name = "h", descriptor = "[I")
	public static final int[] anIntArray576 = new int[200];

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!qa;B)V")
	public static void method5915(@OriginalArg(0) Class75 arg0) {
		if (Static126.aBoolean275) {
			Static303.method4481(arg0);
		} else {
			Static400.method5405(arg0);
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)V")
	public static void method5917() {
		for (@Pc(5) int local5 = 0; local5 < Static125.aClass14ArrayArray2.length; local5++) {
			for (@Pc(8) int local8 = 0; local8 < Static125.aClass14ArrayArray2[local5].length; local8++) {
				Static125.aClass14ArrayArray2[local5][local8] = Static311.aClass14_2;
			}
		}
	}
}
