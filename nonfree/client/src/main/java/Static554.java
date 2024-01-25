import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static554 {

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "[Lclient!xa;")
	public static Class37[] aClass37Array13;

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "Lclient!xa;")
	public static Class37 aClass37_42;

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "Z")
	public static boolean aBoolean827 = false;

	@OriginalMember(owner = "client!vf", name = "i", descriptor = "I")
	public static int anInt9953 = 0;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
	public static void method8083() {
		Static198.aClass211_25.method5535();
		Static402.aClass211_65.method5535();
		Static228.aClass211_33.method5535();
		Static237.aClass211_36.method5535();
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIZI)I")
	public static int method8085(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(8) Class3_Sub29 local8 = Static535.method7881(arg2, arg0);
		if (local8 == null) {
			return -1;
		} else if (arg1 >= 0 && local8.anIntArray328.length > arg1) {
			return local8.anIntArray328[arg1];
		} else {
			return -1;
		}
	}
}
