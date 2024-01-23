import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!pj", name = "R", descriptor = "Lclient!pk;")
	public static Class132 aClass132_68;

	@OriginalMember(owner = "client!pj", name = "S", descriptor = "[Lclient!p;")
	public static Class126[] aClass126Array1;

	@OriginalMember(owner = "client!pj", name = "M", descriptor = "Lclient!gd;")
	public static Class61 aClass61_37 = new Class61(5);

	@OriginalMember(owner = "client!pj", name = "P", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray64 = new String[100];

	@OriginalMember(owner = "client!pj", name = "T", descriptor = "Ljava/lang/String;")
	public static String aString148 = "Continue";

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIZ)V")
	public static void method3158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class8_Sub1_Sub6 local4 = Static181.method2779(7, arg0);
		local4.method931();
		local4.anInt1284 = arg1;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)Lclient!fj;")
	public static Class55 method3160(@OriginalArg(0) int arg0) {
		@Pc(16) Class55 local16 = (Class55) Static114.aClass61_18.method1384((long) arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(27) byte[] local27 = Static249.aClass132_87.method3194(3, arg0);
		local16 = new Class55();
		if (local27 != null) {
			local16.method1285(new Class8_Sub2(local27));
		}
		Static114.aClass61_18.method1377((long) arg0, local16);
		return local16;
	}

	@OriginalMember(owner = "client!pj", name = "f", descriptor = "(I)V")
	public static void method3161() {
		Static62.aClass61_48.method1379();
	}
}
