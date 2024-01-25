import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_47 = new Class98(1, 0);

	@OriginalMember(owner = "client!hfa", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString36 = null;

	@OriginalMember(owner = "client!hfa", name = "g", descriptor = "I")
	public static int anInt3802 = 0;

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(IIIZ)Ljava/lang/String;")
	public static String method3297(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(37) int local37 = 2;
		@Pc(46) int local46 = arg0 / 10;
		while (local46 != 0) {
			local46 /= 10;
			local37++;
		}
		@Pc(58) char[] local58 = new char[local37];
		local58[0] = '+';
		for (@Pc(66) int local66 = local37 - 1; local66 > 0; local66--) {
			@Pc(70) int local70 = arg0;
			arg0 /= 10;
			@Pc(81) int local81 = local70 - arg0 * 10;
			if (local81 < 10) {
				local58[local66] = (char) (local81 + 48);
			} else {
				local58[local66] = (char) (local81 + 87);
			}
		}
		return new String(local58);
	}
}
