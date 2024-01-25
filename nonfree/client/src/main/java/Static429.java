import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static429 {

	@OriginalMember(owner = "client!qk", name = "x", descriptor = "[[I")
	public static int[][] anIntArrayArray47;

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "Lclient!gfa;")
	public static final Class116 aClass116_10 = new Class116(13, 0, 1, 0);

	@OriginalMember(owner = "client!qk", name = "e", descriptor = "Z")
	public static boolean aBoolean557 = false;

	@OriginalMember(owner = "client!qk", name = "g", descriptor = "Z")
	public static boolean aBoolean558 = false;

	@OriginalMember(owner = "client!qk", name = "p", descriptor = "[I")
	public static final int[] anIntArray422 = new int[256];

	@OriginalMember(owner = "client!qk", name = "t", descriptor = "F")
	public static float aFloat208 = 0.0F;

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lclient!eaa;I)V")
	public static void method6713(@OriginalArg(0) Class76 arg0) {
		Static48.aClass76_1 = arg0;
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V")
	public static void method6717() {
		Static370.aClass217_1 = new Class217(8);
		Static517.anInt9274 = 0;
		for (@Pc(17) Class1_Sub2 local17 = (Class1_Sub2) Static128.aClass136_4.method3288(); local17 != null; local17 = (Class1_Sub2) Static128.aClass136_4.method3286()) {
			local17.method341();
		}
	}

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)Ljava/lang/String;")
	public static String method6720() {
		return Static49.aBoolean36 || Static577.aClass4_Sub39_3 == null ? "" : Static577.aClass4_Sub39_3.aString80;
	}
}
