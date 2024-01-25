import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!la", name = "f", descriptor = "Lclient!tm;")
	public static Class10_Sub3_Sub3_Sub2 aClass10_Sub3_Sub3_Sub2_1;

	@OriginalMember(owner = "client!la", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString126 = "RuneScape is loading - please wait...";

	@OriginalMember(owner = "client!la", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString127 = "Hidden";

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II)V")
	public static void method3377(@OriginalArg(0) int arg0) {
		Static271.anInt5162 = arg0;
		@Pc(12) Class11 local12 = Static259.aClass11_113;
		synchronized (Static259.aClass11_113) {
			Static259.aClass11_113.method213();
		}
		local12 = Static93.aClass11_50;
		synchronized (Static93.aClass11_50) {
			Static93.aClass11_50.method213();
		}
	}
}
