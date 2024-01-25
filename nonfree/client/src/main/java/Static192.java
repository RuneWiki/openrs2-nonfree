import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static192 {

	@OriginalMember(owner = "client!jf", name = "k", descriptor = "[Z")
	public static boolean[] aBooleanArray75;

	@OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
	public static int anInt3532;

	@OriginalMember(owner = "client!jf", name = "m", descriptor = "I")
	public static int anInt3533;

	@OriginalMember(owner = "client!jf", name = "v", descriptor = "Lclient!oi;")
	public static Class185 aClass185_57;

	@OriginalMember(owner = "client!jf", name = "p", descriptor = "[F")
	public static final float[] aFloatArray16 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!jf", name = "u", descriptor = "Lclient!hm;")
	public static Class107 aClass107_9 = null;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!oi;I)V")
	public static void method2775(@OriginalArg(0) Class185 arg0) {
		Static388.anInt6814 = 0;
		Static221.anInt4063 = 0;
		Static242.aClass63_5 = new Class63();
		Static65.aClass111_Sub1_Sub2_Sub1Array1 = new Class111_Sub1_Sub2_Sub1[1024];
		Static177.method2574(arg0);
		Static460.method5929(arg0);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IB)Z")
	public static boolean method2777(@OriginalArg(0) int arg0) {
		Static101.aBoolean155 = true;
		Static382.anInt4998 = arg0 + 1 & 0xFFFF;
		return true;
	}
}
