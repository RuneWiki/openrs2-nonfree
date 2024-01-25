import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!cj", name = "d", descriptor = "Z")
	public static boolean aBoolean98 = false;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)V")
	public static void method1196() {
		@Pc(5) Class391 local5 = Static108.aClass391_10;
		synchronized (Static108.aClass391_10) {
			Static108.aClass391_10.method9274(5);
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!mca;BILjava/lang/String;)Lclient!vd;")
	public static Class366 method1197(@OriginalArg(0) Class230 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		return Static606.method8454(arg2, arg0, arg1, "openjs");
	}
}
