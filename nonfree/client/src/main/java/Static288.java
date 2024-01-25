import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static288 {

	@OriginalMember(owner = "client!kw", name = "w", descriptor = "F")
	public static float aFloat112;

	@OriginalMember(owner = "client!kw", name = "L", descriptor = "[Lclient!vr;")
	public static Class9_Sub1_Sub1[] aClass9_Sub1_Sub1Array1;

	@OriginalMember(owner = "client!kw", name = "j", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_159 = new Class272(51, -1);

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(ILclient!om;)V")
	public static void method4545(@OriginalArg(1) Class246 arg0) {
		Static40.anInt4550 = arg0.method5665("p11_full");
		Static304.anInt5516 = arg0.method5665("p12_full");
		Static356.anInt6158 = arg0.method5665("b12_full");
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(CB)Z")
	public static boolean method4547(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}
}
