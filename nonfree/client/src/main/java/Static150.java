import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!hl", name = "L", descriptor = "F")
	public static float aFloat103;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIZ)V")
	public static void method2573(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) Class4_Sub25 local8 = Static175.method2834(arg1, arg0);
		if (local8 != null) {
			local8.method5684();
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(BI)V")
	public static void method2574(@OriginalArg(1) int arg0) {
		Static207.anInt5454 = arg0;
		@Pc(7) Class68 local7 = Static221.aClass68_24;
		synchronized (Static221.aClass68_24) {
			Static221.aClass68_24.method1777();
		}
	}

	@OriginalMember(owner = "client!hl", name = "g", descriptor = "(B)Lclient!ie;")
	public static Class105 method2575() {
		try {
			return (Class105) Class.forName("Class105_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
