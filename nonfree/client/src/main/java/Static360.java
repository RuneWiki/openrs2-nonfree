import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!nt", name = "c", descriptor = "I")
	public static int anInt6985;

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "Lclient!sk;")
	public static Class4_Sub42 aClass4_Sub42_1 = null;

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method5813(@OriginalArg(1) String arg0) {
		@Pc(9) String local9 = Static89.method2077(Static518.method7584(arg0));
		if (local9 == null) {
			local9 = "";
		}
		return local9;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(II)V")
	public static void method5814(@OriginalArg(0) int arg0) {
		Static294.anInt3996 = arg0;
		Static379.aClass223_51.method5398();
	}
}
