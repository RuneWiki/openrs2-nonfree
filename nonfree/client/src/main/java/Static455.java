import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static455 {

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "Lclient!qa;")
	public static Class4 aClass4_11;

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_121 = new Class252(53, 4);

	@OriginalMember(owner = "client!sr", name = "f", descriptor = "I")
	public static int anInt7936 = 0;

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!et;B)Ljava/lang/String;")
	public static String method6992(@OriginalArg(0) Class91 arg0) {
		if (Static63.method1580(arg0).method1741() == 0) {
			return null;
		} else if (arg0.aString52 == null || arg0.aString52.trim().length() == 0) {
			return Static428.aBoolean561 ? "Hidden-use" : null;
		} else {
			return arg0.aString52;
		}
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(I)Z")
	public static boolean method6993() {
		@Pc(7) Class1 local7 = Static105.aClass295_10.aClass1_260.aClass1_284;
		if (local7 == null || Static105.aClass295_10.aClass1_260 == local7) {
			return false;
		}
		@Pc(18) Class1_Sub25 local18 = (Class1_Sub25) local7;
		if (local18.anInt4365 >= 2000) {
			local18.anInt4365 -= 2000;
		}
		return local18.anInt4365 == 1009;
	}
}
