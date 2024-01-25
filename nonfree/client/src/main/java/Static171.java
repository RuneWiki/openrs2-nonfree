import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_50 = new Class100(69, -1);

	@OriginalMember(owner = "client!fu", name = "h", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_65 = new Class44(29, 6);

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(II)V")
	public static void method2775(@OriginalArg(1) int arg0) {
		Static114.anInt2294 = arg0;
		@Pc(7) Class264 local7 = Static263.aClass264_31;
		synchronized (Static263.aClass264_31) {
			Static263.aClass264_31.method6360();
		}
		local7 = Static324.aClass264_38;
		synchronized (Static324.aClass264_38) {
			Static324.aClass264_38.method6360();
		}
	}
}
