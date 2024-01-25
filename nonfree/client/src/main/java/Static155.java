import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "Lclient!me;")
	public static final Class211 aClass211_17 = new Class211(20);

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "Z")
	public static boolean aBoolean262 = false;

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
	public static int anInt3389 = 0;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method2984(@OriginalArg(1) int arg0) {
		@Pc(6) String local6 = Integer.toString(arg0);
		for (@Pc(19) int local19 = local6.length() - 3; local19 > 0; local19 -= 3) {
			local6 = local6.substring(0, local19) + "," + local6.substring(local19);
		}
		if (local6.length() > 9) {
			return " <col=00ff80>" + local6.substring(0, local6.length() - 8) + Static139.aClass101_32.method2841(Static126.anInt2904) + " (" + local6 + ")</col>";
		} else if (local6.length() > 6) {
			return " <col=ffffff>" + local6.substring(0, local6.length() - 4) + Static139.aClass101_34.method2841(Static126.anInt2904) + " (" + local6 + ")</col>";
		} else {
			return " <col=ffff00>" + local6 + "</col>";
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIILclient!pe;)Lclient!sga;")
	public static Class297 method2986(@OriginalArg(2) int arg0, @OriginalArg(3) Class254 arg1) {
		@Pc(9) byte[] local9 = arg1.method6401(arg0, 0);
		return local9 == null ? null : new Class297(local9);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(FFFII)F")
	public static float method2987(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) int arg3) {
		@Pc(15) float[] local15 = Static17.aFloatArrayArray6[arg3];
		return arg2 * local15[0] + local15[1] * arg0 + local15[2] * arg1;
	}
}
