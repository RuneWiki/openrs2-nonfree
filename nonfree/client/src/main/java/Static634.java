import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static634 {

	@OriginalMember(owner = "client!wf", name = "s", descriptor = "Lclient!de;")
	public static final Class69 aClass69_73 = new Class69(4);

	@OriginalMember(owner = "client!wf", name = "t", descriptor = "Z")
	public static boolean aBoolean746 = false;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILclient!aca;Z)V")
	public static void method8744(@OriginalArg(1) Class2_Sub2 arg0, @OriginalArg(2) boolean arg1) {
		if (arg0.aBoolean18) {
			if (arg0.anInt128 < 0 || Static347.method8439(arg0.anInt128, arg0.anInt124)) {
				if (arg1) {
					Static282.method6615(arg0.anInt119, arg0.anInt120, arg0.anInt125, (Class326) null, arg0.anInt129);
				} else {
					Static108.method1985(arg0.anInt125, arg0.anInt119, arg0.anInt120, arg0.anInt128, arg0.anInt121, arg0.anInt124, -1, arg0.anInt129);
				}
				arg0.method8920();
			}
		} else if (arg0.aBoolean17 && arg0.anInt129 >= 1 && arg0.anInt119 >= 1 && Static456.anInt7428 - 2 >= arg0.anInt129 && Static5.anInt112 - 2 >= arg0.anInt119 && (arg0.anInt118 < 0 || Static347.method8439(arg0.anInt118, arg0.anInt126))) {
			if (arg1) {
				Static282.method6615(arg0.anInt119, arg0.anInt120, arg0.anInt125, arg0.aClass326_1, arg0.anInt129);
			} else {
				Static108.method1985(arg0.anInt125, arg0.anInt119, arg0.anInt120, arg0.anInt118, arg0.anInt117, arg0.anInt126, -1, arg0.anInt129);
			}
			arg0.aBoolean17 = false;
			if (!arg1 && arg0.anInt118 == arg0.anInt128 && arg0.anInt128 == -1) {
				arg0.method8920();
			} else if (!arg1 && arg0.anInt118 == arg0.anInt128 && arg0.anInt117 == arg0.anInt121 && arg0.anInt124 == arg0.anInt126) {
				arg0.method8920();
			}
		}
	}
}
