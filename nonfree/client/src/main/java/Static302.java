import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!ko", name = "n", descriptor = "Lclient!in;")
	public static Class157 aClass157_149;

	@OriginalMember(owner = "client!ko", name = "u", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray26;

	@OriginalMember(owner = "client!ko", name = "v", descriptor = "I")
	public static int anInt6299;

	@OriginalMember(owner = "client!ko", name = "j", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_125 = new Class215(37, 7);

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIZ)Ljava/lang/String;")
	public static String method5354(@OriginalArg(2) int arg0, @OriginalArg(3) boolean arg1) {
		if (!arg1 || arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(35) int local35 = 2;
		@Pc(39) int local39 = arg0 / 10;
		while (local39 != 0) {
			local39 /= 10;
			local35++;
		}
		@Pc(51) char[] local51 = new char[local35];
		local51[0] = '+';
		for (@Pc(59) int local59 = local35 - 1; local59 > 0; local59--) {
			@Pc(66) int local66 = arg0;
			arg0 /= 10;
			@Pc(77) int local77 = local66 - arg0 * 10;
			if (local77 < 10) {
				local51[local59] = (char) (local77 + 48);
			} else {
				local51[local59] = (char) (local77 + 87);
			}
		}
		return new String(local51);
	}
}
