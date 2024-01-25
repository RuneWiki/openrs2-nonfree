import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static550 {

	@OriginalMember(owner = "client!ur", name = "X", descriptor = "Lclient!lk;")
	public static Class189 aClass189_3;

	@OriginalMember(owner = "client!ur", name = "gb", descriptor = "Ljava/lang/String;")
	public static String aString250;

	@OriginalMember(owner = "client!ur", name = "u", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_305 = new Class123(2, 2);

	@OriginalMember(owner = "client!ur", name = "U", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_306 = new Class123(102, -1);

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IBIZ)Ljava/lang/String;")
	public static String method7539(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(42) int local42 = 2;
		for (@Pc(46) int local46 = arg0 / 10; local46 != 0; local46 /= 10) {
			local42++;
		}
		@Pc(58) char[] local58 = new char[local42];
		local58[0] = '+';
		for (@Pc(66) int local66 = local42 - 1; local66 > 0; local66--) {
			@Pc(70) int local70 = arg0;
			arg0 /= 10;
			@Pc(81) int local81 = local70 - arg0 * 10;
			if (local81 >= 10) {
				local58[local66] = (char) (local81 + 87);
			} else {
				local58[local66] = (char) (local81 + 48);
			}
		}
		return new String(local58);
	}
}
