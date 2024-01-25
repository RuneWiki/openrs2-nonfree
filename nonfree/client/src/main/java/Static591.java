import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static591 {

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "I")
	public static int anInt9579;

	@OriginalMember(owner = "client!wr", name = "e", descriptor = "I")
	public static int anInt9580;

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_130 = new Class154(54, 15);

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "Lclient!pb;")
	public static final Class262 aClass262_18 = new Class262(9, 7);

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(BIZI)Ljava/lang/String;")
	public static String method7691(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(36) int local36 = 2;
		for (@Pc(40) int local40 = arg0 / 10; local40 != 0; local40 /= 10) {
			local36++;
		}
		@Pc(57) char[] local57 = new char[local36];
		local57[0] = '+';
		for (@Pc(65) int local65 = local36 - 1; local65 > 0; local65--) {
			@Pc(69) int local69 = arg0;
			arg0 /= 10;
			@Pc(80) int local80 = local69 - arg0 * 10;
			if (local80 < 10) {
				local57[local65] = (char) (local80 + 48);
			} else {
				local57[local65] = (char) (local80 + 87);
			}
		}
		return new String(local57);
	}
}
