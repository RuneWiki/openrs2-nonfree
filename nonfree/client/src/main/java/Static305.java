import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!th", name = "i", descriptor = "Lclient!ra;")
	public static Class170 aClass170_102;

	@OriginalMember(owner = "client!th", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString337 = null;

	@OriginalMember(owner = "client!th", name = "s", descriptor = "I")
	public static int anInt5879 = 0;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIII)I")
	public static int method5225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(15) int local15 = 255 - arg2;
		@Pc(33) int local33 = ((arg0 & 0xFF00FF) * arg2 & 0xFF00FF00 | arg2 * (arg0 & 0xFF00) & 0xFF0000) >>> 8;
		return (((arg1 & 0xFF00) * local15 & 0xFF0000 | (arg1 & 0xFF00FF) * local15 & 0xFF00FF00) >>> 8) + local33;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(III)Lclient!jf;")
	public static Class96 method5232(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class96 local15 = Static121.method2396(arg1);
		if (arg0 == -1) {
			return local15;
		} else if (local15 == null || local15.aClass96Array1 == null || arg0 >= local15.aClass96Array1.length) {
			return null;
		} else {
			return local15.aClass96Array1[arg0];
		}
	}
}
