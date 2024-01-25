import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static402 {

	@OriginalMember(owner = "client!tv", name = "e", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_111 = new Class198("Take", "Nehmen", "Prendre", "Pegar");

	@OriginalMember(owner = "client!tv", name = "g", descriptor = "J")
	public static long aLong208 = 0L;

	@OriginalMember(owner = "client!tv", name = "k", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_180 = new Class129(8, 3);

	@OriginalMember(owner = "client!tv", name = "l", descriptor = "Z")
	public static boolean aBoolean455 = false;

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(ZZ)V")
	public static void method5352(@OriginalArg(1) boolean arg0) {
		for (@Pc(10) Class5_Sub31 local10 = (Class5_Sub31) Static207.aClass177_20.method3618(); local10 != null; local10 = (Class5_Sub31) Static207.aClass177_20.method3619()) {
			if (local10.aClass5_Sub22_Sub2_4 != null) {
				Static119.aClass5_Sub22_Sub3_3.method3636(local10.aClass5_Sub22_Sub2_4);
				local10.aClass5_Sub22_Sub2_4 = null;
			}
			if (local10.aClass5_Sub22_Sub2_3 != null) {
				Static119.aClass5_Sub22_Sub3_3.method3636(local10.aClass5_Sub22_Sub2_3);
				local10.aClass5_Sub22_Sub2_3 = null;
			}
			local10.method6003();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(54) Class5_Sub31 local54 = (Class5_Sub31) Static45.aClass177_2.method3618(); local54 != null; local54 = (Class5_Sub31) Static45.aClass177_2.method3619()) {
			if (local54.aClass5_Sub22_Sub2_4 != null) {
				Static119.aClass5_Sub22_Sub3_3.method3636(local54.aClass5_Sub22_Sub2_4);
				local54.aClass5_Sub22_Sub2_4 = null;
			}
			local54.method6003();
		}
		for (@Pc(85) Class5_Sub31 local85 = (Class5_Sub31) Static464.aClass252_39.method5660(); local85 != null; local85 = (Class5_Sub31) Static464.aClass252_39.method5666()) {
			if (local85.aClass5_Sub22_Sub2_4 != null) {
				Static119.aClass5_Sub22_Sub3_3.method3636(local85.aClass5_Sub22_Sub2_4);
				local85.aClass5_Sub22_Sub2_4 = null;
			}
			local85.method6003();
		}
	}
}
