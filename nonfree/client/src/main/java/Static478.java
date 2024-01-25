import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static478 {

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "Lclient!ll;")
	public static Class198 aClass198_11;

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "Lclient!vo;")
	public static Class348 aClass348_112;

	@OriginalMember(owner = "client!sf", name = "h", descriptor = "[Lclient!f;")
	public static Class88[] aClass88Array12;

	@OriginalMember(owner = "client!sf", name = "i", descriptor = "Lclient!vo;")
	public static Class348 aClass348_114;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "([BI)Z")
	public static boolean method6939(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class4_Sub13 local8 = new Class4_Sub13(arg0);
		@Pc(12) int local12 = local8.method7004();
		if (local12 != 2) {
			return false;
		}
		@Pc(31) boolean local31 = local8.method7004() == 1;
		if (local31) {
			Static343.method5249(local8);
		}
		Static128.method2311(local8);
		return true;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)V")
	public static void method6940() {
		if (Static245.aBoolean358) {
			return;
		}
		Static76.method1606(Static175.aClass182ArrayArrayArray1);
		if (Static288.aClass182ArrayArrayArray2 != null) {
			Static76.method1606(Static288.aClass182ArrayArrayArray2);
		}
		Static245.aBoolean358 = true;
	}
}
