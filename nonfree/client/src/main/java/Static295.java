import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static295 {

	@OriginalMember(owner = "client!os", name = "I", descriptor = "I")
	public static int anInt4939;

	@OriginalMember(owner = "client!os", name = "N", descriptor = "[S")
	public static short[] aShortArray83;

	@OriginalMember(owner = "client!os", name = "J", descriptor = "[I")
	public static final int[] anIntArray380 = new int[250];

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!ks;Z)V")
	public static void method4032(@OriginalArg(0) Class36_Sub4 arg0) {
		arg0.aClass47_Sub1_Sub5_1 = null;
		if (Static188.anInt3477 < 20) {
			Static129.aClass242_1.method5501(arg0);
			Static188.anInt3477++;
		}
	}
}
