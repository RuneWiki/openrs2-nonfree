import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!fca", name = "d", descriptor = "Lclient!hu;")
	public static Class44 aClass44_9;

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "Lclient!mha;")
	public static final Class228 aClass228_1 = new Class228(4, 1);

	@OriginalMember(owner = "client!fca", name = "c", descriptor = "Lclient!kg;")
	public static final Class186 aClass186_5 = new Class186(7, 0, 1, 1);

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(BZ)V")
	public static void method2174(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static302.anInt4813 != -1) {
				Static194.method3066(Static302.anInt4813);
			}
			for (@Pc(18) Class5_Sub15 local18 = (Class5_Sub15) Static183.aClass81_27.method1608(); local18 != null; local18 = (Class5_Sub15) Static183.aClass81_27.method1610()) {
				if (!local18.method8913()) {
					local18 = (Class5_Sub15) Static183.aClass81_27.method1608();
					if (local18 == null) {
						break;
					}
				}
				Static177.method2689(false, true, local18);
			}
			Static302.anInt4813 = -1;
			Static183.aClass81_27 = new Class81(8);
			Static292.method4308();
			Static302.anInt4813 = Static274.anInt10336;
			Static627.method8697(false);
			Static101.method1476();
			Static82.method1319(Static302.anInt4813);
		}
		Static577.aBoolean768 = true;
	}
}
