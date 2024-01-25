import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "b", descriptor = "I")
	public static int anInt1;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "Lclient!mt;")
	public static final Class164 aClass164_1 = new Class164(8);

	@OriginalMember(owner = "client!a", name = "d", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_1 = new Class2(76, 7);

	@OriginalMember(owner = "client!a", name = "e", descriptor = "Lclient!fr;")
	public static Class85 aClass85_1 = new Class85();

	@OriginalMember(owner = "client!a", name = "f", descriptor = "Lclient!fr;")
	public static final Class85 aClass85_2 = new Class85();

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method2(@OriginalArg(0) String arg0) {
		if (!arg0.equals("")) {
			Static81.method1414(Static226.aClass2_64);
			Static255.aClass7_Sub14_Sub1_2.method3970(Static268.method3593(arg0));
			Static255.aClass7_Sub14_Sub1_2.method3947(arg0);
		}
	}
}
