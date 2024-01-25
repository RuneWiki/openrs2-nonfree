import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static603 {

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "I")
	public static int anInt7122;

	@OriginalMember(owner = "client!vi", name = "i", descriptor = "Lclient!ma;")
	public static Class2_Sub8_Sub3 aClass2_Sub8_Sub3_5;

	@OriginalMember(owner = "client!vi", name = "t", descriptor = "Lclient!cs;")
	public static Class66 aClass66_6;

	@OriginalMember(owner = "client!vi", name = "g", descriptor = "Z")
	public static final boolean aBoolean518 = false;

	@OriginalMember(owner = "client!vi", name = "j", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray33 = new String[200];

	@OriginalMember(owner = "client!vi", name = "s", descriptor = "I")
	public static int anInt7133 = 0;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(FIFIF)F")
	public static float method6069(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3) {
		@Pc(17) float[] local17 = Static112.aFloatArrayArray1[arg1];
		return local17[1] * arg0 + arg3 * local17[0] + local17[2] * arg2;
	}
}
