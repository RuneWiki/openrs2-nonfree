import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!mea", name = "gd", descriptor = "Lclient!hn;")
	public static Class147 aClass147_1;

	@OriginalMember(owner = "client!mea", name = "x", descriptor = "Lclient!wv;")
	public static final Class395 aClass395_10 = new Class395(11, 8);

	@OriginalMember(owner = "client!mea", name = "Kc", descriptor = "Lclient!cfa;")
	public static final Class54 aClass54_5 = new Class54();

	@OriginalMember(owner = "client!mea", name = "Qc", descriptor = "[Lclient!aaa;")
	public static final Class2[] aClass2Array1 = new Class2[2048];

	@OriginalMember(owner = "client!mea", name = "wd", descriptor = "I")
	public static int anInt6730 = -1;

	@OriginalMember(owner = "client!mea", name = "zd", descriptor = "I")
	public static int anInt6733 = 0;

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(ILjava/lang/String;ZI)Z")
	public static boolean method5459(@OriginalArg(1) String arg0) {
		@Pc(28) boolean local28 = false;
		@Pc(30) boolean local30 = false;
		@Pc(32) int local32 = 0;
		@Pc(44) int local44 = arg0.length();
		for (@Pc(46) int local46 = 0; local46 < local44; local46++) {
			@Pc(52) char local52 = arg0.charAt(local46);
			if (local46 == 0) {
				if (local52 == '-') {
					local28 = true;
					continue;
				}
				if (local52 == '+') {
					continue;
				}
			}
			@Pc(84) int local84;
			if (local52 >= '0' && local52 <= '9') {
				local84 = local52 - '0';
			} else if (local52 >= 'A' && local52 <= 'Z') {
				local84 = local52 - '7';
			} else if (local52 >= 'a' && local52 <= 'z') {
				local84 = local52 - 'W';
			} else {
				return false;
			}
			if (local84 >= 10) {
				return false;
			}
			if (local28) {
				local84 = -local84;
			}
			@Pc(124) int local124 = local32 * 10 + local84;
			if (local32 != local124 / 10) {
				return false;
			}
			local32 = local124;
			local30 = true;
		}
		return local30;
	}
}
