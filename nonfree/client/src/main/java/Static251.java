import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)Lclient!hr;")
	public static Class85 method4730(@OriginalArg(1) int arg0) {
		@Pc(10) Class85 local10 = (Class85) Static112.aClass21_72.method854((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static83.aClass30_22.method1161(arg0, 34);
		local10 = new Class85();
		if (local20 != null) {
			local10.method2631(new Class1_Sub7(local20), arg0);
		}
		Static112.aClass21_72.method843(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)V")
	public static void method4732() {
		Static31.method824();
		for (@Pc(12) int local12 = 0; local12 < 4; local12++) {
			Static11.aClass196Array2[local12].method5327();
		}
		Static161.method3064();
		Static96.method2069();
		System.gc();
	}
}
