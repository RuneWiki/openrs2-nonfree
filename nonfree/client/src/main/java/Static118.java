import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static118 {

	@OriginalMember(owner = "client!eo", name = "q", descriptor = "Lclient!pfa;")
	public static Class251 aClass251_30;

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ZI)Lclient!saa;")
	public static Class299_Sub1 method2498(@OriginalArg(1) int arg0) {
		return Static357.aBoolean444 && arg0 >= Static233.anInt4737 && arg0 <= Static158.anInt3361 ? Static109.aClass299_Sub1Array1[arg0 - Static233.anInt4737] : null;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ZLclient!lh;)Z")
	public static boolean method2499(@OriginalArg(1) Class194 arg0) {
		return arg0 == Static561.aClass194_6 || arg0 == Static427.aClass194_3 || Static530.aClass194_4 == arg0 || Static7.aClass194_2 == arg0;
	}
}
