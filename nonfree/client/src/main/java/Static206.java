import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static206 {

	@OriginalMember(owner = "client!ki", name = "i", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray16;

	@OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
	public static int anInt3920;

	@OriginalMember(owner = "client!ki", name = "k", descriptor = "Lclient!et;")
	public static Class66 aClass66_4;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "Lclient!pk;")
	public static final Class183 aClass183_28 = new Class183();

	@OriginalMember(owner = "client!ki", name = "l", descriptor = "[F")
	public static final float[] aFloatArray23 = new float[4];

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IB)Lclient!kf;")
	public static Class78_Sub1 method3192(@OriginalArg(0) int arg0) {
		return Static94.aBoolean176 && arg0 >= Static396.anInt4816 && arg0 <= Static339.anInt5874 ? Static407.aClass78_Sub1Array2[arg0 - Static396.anInt4816] : null;
	}
}
