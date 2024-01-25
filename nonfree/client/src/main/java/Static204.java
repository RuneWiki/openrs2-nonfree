import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!he", name = "d", descriptor = "Lclient!jt;")
	public static final Class166 aClass166_21 = new Class166(20);

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
	public static void method3552() {
		aClass166_21.method4811();
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(II)Z")
	public static boolean method3559(@OriginalArg(1) int arg0) {
		for (@Pc(10) Class6_Sub2_Sub4 local10 = (Class6_Sub2_Sub4) Static298.aClass8_34.method149(); local10 != null; local10 = (Class6_Sub2_Sub4) Static298.aClass8_34.method155()) {
			if (Static74.method1294(local10.anInt1738) && (long) arg0 == local10.aLong42) {
				return true;
			}
		}
		return false;
	}
}
