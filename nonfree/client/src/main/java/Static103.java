import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!uc", name = "i", descriptor = "Lclient!fc;")
	public static Class21 aClass21_22;

	@OriginalMember(owner = "client!uc", name = "l", descriptor = "Lclient!fc;")
	public static Class21 aClass21_23;

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "Lclient!rc;")
	private static Class55 aClass55_1276 = Static34.method846("New User");

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1275 = aClass55_1276;

	@OriginalMember(owner = "client!uc", name = "g", descriptor = "Lclient!ab;")
	public static Class3 aClass3_9 = new Class3();

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1277 = Static34.method846("@gr1@");

	@OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
	public static int anInt3042 = -1;

	@OriginalMember(owner = "client!uc", name = "k", descriptor = "Lclient!rc;")
	private static Class55 aClass55_1278 = Static34.method846("Private chat");

	@OriginalMember(owner = "client!uc", name = "m", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1279 = Static34.method846(":0");

	@OriginalMember(owner = "client!uc", name = "n", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1280 = aClass55_1278;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!ib;")
	public static RuntimeException_Sub1 method1958(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString8 = local12.aString8 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V")
	public static void method1959() {
		aClass21_22 = null;
		aClass55_1275 = null;
		aClass55_1276 = null;
		aClass55_1278 = null;
		aClass3_9 = null;
		aClass21_23 = null;
		aClass55_1280 = null;
		aClass55_1277 = null;
		aClass55_1279 = null;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IILclient!pb;I)Lclient!bd;")
	public static Class6_Sub2_Sub2_Sub1 method1960(@OriginalArg(0) int arg0, @OriginalArg(2) Class40 arg1, @OriginalArg(3) int arg2) {
		return Static44.method1829(arg0, arg2, arg1) ? Static43.method984() : null;
	}
}
