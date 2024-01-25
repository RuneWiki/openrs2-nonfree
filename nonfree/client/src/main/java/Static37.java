import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "[[B")
	public static byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "Lclient!si;")
	public static final Class335 aClass335_5 = new Class335(32);

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BI)V")
	public static void method625(@OriginalArg(1) int arg0) {
		for (@Pc(9) Class2 local9 = Static375.aClass335_19.method8358(); local9 != null; local9 = Static375.aClass335_19.method8355()) {
			if ((local9.aLong313 >> 48 & 0xFFFFL) == (long) arg0) {
				local9.method9825();
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)Z")
	public static boolean method626(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}
}
