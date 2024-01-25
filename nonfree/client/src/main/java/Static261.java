import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!mp", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString40;

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_62 = new Class208(40, 3);

	@OriginalMember(owner = "client!mp", name = "d", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_109 = new Class25(10, -2);

	@OriginalMember(owner = "client!mp", name = "e", descriptor = "Lclient!ru;")
	public static final Class220 aClass220_23 = new Class220(32);

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(ZI)Lclient!mo;")
	public static Class172 method3685(@OriginalArg(1) int arg0) {
		@Pc(10) Class172 local10 = (Class172) Static151.aClass188_29.method4158((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static404.aClass171_39.method3658(0, arg0);
		local10 = new Class172();
		if (local25 != null) {
			local10.method3683(arg0, new Class2_Sub17(local25));
		}
		Static151.aClass188_29.method4155((long) arg0, local10);
		return local10;
	}
}
