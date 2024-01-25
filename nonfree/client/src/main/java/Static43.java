import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
	public static int anInt768;

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
	public static int anInt770;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIZ)Ljava/lang/String;")
	public static String method788(@OriginalArg(0) int arg0, @OriginalArg(3) boolean arg1) {
		if (!arg1 || arg0 < 0) {
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

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(III)Z")
	public static boolean method789(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x100) != 0;
	}
}
