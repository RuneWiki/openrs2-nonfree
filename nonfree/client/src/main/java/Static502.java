import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static502 {

	@OriginalMember(owner = "client!tfa", name = "D", descriptor = "Z")
	public static boolean aBoolean605 = true;

	@OriginalMember(owner = "client!tfa", name = "b", descriptor = "(II)Lclient!ae;")
	public static Class7_Sub1 method7167(@OriginalArg(1) int arg0) {
		return Static524.aBoolean616 && Static333.anInt5925 <= arg0 && Static359.anInt6234 >= arg0 ? Static286.aClass7_Sub1Array5[arg0 - Static333.anInt5925] : null;
	}
}
