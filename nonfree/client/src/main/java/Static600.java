import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static600 {

	@OriginalMember(owner = "client!uea", name = "e", descriptor = "Lclient!us;")
	public static Class366 aClass366_3;

	@OriginalMember(owner = "client!uea", name = "k", descriptor = "[I")
	public static int[] anIntArray615;

	@OriginalMember(owner = "client!uea", name = "g", descriptor = "Lclient!mo;")
	public static final Class239 aClass239_12 = new Class239("", 18);

	@OriginalMember(owner = "client!uea", name = "j", descriptor = "Lclient!ju;")
	public static final Class201 aClass201_22 = new Class201(14, -1);

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(IZ)Lclient!om;")
	public static Class265 method7989(@OriginalArg(0) int arg0) {
		@Pc(10) Class265 local10 = (Class265) Static236.aClass279_22.method6631((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(27) byte[] local27 = Static76.aClass143_17.method3125(arg0, 1);
		local10 = new Class265();
		local10.anInt7618 = arg0;
		if (local27 != null) {
			local10.method6374(new Class3_Sub17(local27));
		}
		local10.method6370();
		if (local10.anInt7613 == 2 && Static314.aClass62_29.method1682((long) arg0) == null) {
			Static314.aClass62_29.method1686((long) arg0, new Class3_Sub53(Static123.anInt2399));
			Static264.aClass265Array1[Static123.anInt2399++] = local10;
		}
		Static236.aClass279_22.method6635(local10, (long) arg0);
		return local10;
	}
}
