import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static444 {

	@OriginalMember(owner = "client!wl", name = "d", descriptor = "Lclient!pc;")
	public static Class188 aClass188_128;

	@OriginalMember(owner = "client!wl", name = "t", descriptor = "Lclient!qa;")
	public static Class26 aClass26_11;

	@OriginalMember(owner = "client!wl", name = "j", descriptor = "I")
	public static int anInt7747 = 0;

	@OriginalMember(owner = "client!wl", name = "l", descriptor = "Lclient!ok;")
	public static final Class180 aClass180_15 = new Class180(7, 18);

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(BIZ)Ljava/lang/String;")
	public static String method6000(@OriginalArg(1) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static254.method5477(arg0);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(BFFIF)F")
	public static float method6004(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3) {
		@Pc(12) float[] local12 = Static326.aFloatArrayArray6[arg2];
		return local12[2] * arg1 + arg0 * local12[0] + local12[1] * arg3;
	}
}
