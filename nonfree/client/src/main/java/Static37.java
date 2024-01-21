import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "Lclient!jg;")
	public static Class44 aClass44_5;

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString1;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "Lclient!kb;")
	private static Class46 aClass46_288 = Static65.method1172("Please try again)3");

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "Lclient!kb;")
	public static Class46 aClass46_289 = Static65.method1172(")4l");

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
	public static int anInt1034 = 0;

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "Lclient!kb;")
	public static Class46 aClass46_290 = Static65.method1172(": ");

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "Lclient!kb;")
	public static Class46 aClass46_291 = aClass46_288;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method656(@OriginalArg(0) int arg0) {
		@Pc(26) byte[] local26;
		if (arg0 == 100 && Static50.anInt1372 > 0) {
			local26 = Static91.aByteArrayArray10[--Static50.anInt1372];
			Static91.aByteArrayArray10[Static50.anInt1372] = null;
			return local26;
		} else if (arg0 == 5000 && Static79.anInt1991 > 0) {
			local26 = Static54.aByteArrayArray9[--Static79.anInt1991];
			Static54.aByteArrayArray9[Static79.anInt1991] = null;
			return local26;
		} else if (arg0 == 30000 && Static181.anInt3976 > 0) {
			local26 = Static43.aByteArrayArray7[--Static181.anInt3976];
			Static43.aByteArrayArray7[Static181.anInt3976] = null;
			return local26;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V")
	public static void method657() {
		aString1 = null;
		aClass44_5 = null;
		aClass46_290 = null;
		aClass46_289 = null;
		aClass46_288 = null;
		aClass46_291 = null;
	}
}
