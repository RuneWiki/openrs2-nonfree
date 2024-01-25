import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static467 {

	@OriginalMember(owner = "client!to", name = "c", descriptor = "[I")
	public static int[] anIntArray624;

	@OriginalMember(owner = "client!to", name = "r", descriptor = "F")
	public static float aFloat176;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(II)Lclient!cu;")
	public static Class50_Sub1 method6823(@OriginalArg(0) int arg0) {
		return Static416.aBoolean479 && Static503.anInt8544 <= arg0 && Static137.anInt3222 >= arg0 ? Static437.aClass50_Sub1Array1[arg0 - Static503.anInt8544] : null;
	}
}
