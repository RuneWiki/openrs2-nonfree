import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static432 {

	@OriginalMember(owner = "client!vj", name = "f", descriptor = "[I")
	public static int[] anIntArray485 = new int[2];

	@OriginalMember(owner = "client!vj", name = "j", descriptor = "[I")
	public static final int[] anIntArray486 = new int[5];

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method5703(@OriginalArg(0) String arg0) {
		@Pc(14) String local14 = Static95.method1333(Static83.method1230(arg0));
		if (local14 == null) {
			local14 = "";
		}
		return local14;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZIII)Ljava/lang/String;")
	public static String method5705(@OriginalArg(2) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(32) int local32 = 2;
		for (@Pc(36) int local36 = arg0 / 10; local36 != 0; local36 /= 10) {
			local32++;
		}
		@Pc(48) char[] local48 = new char[local32];
		local48[0] = '+';
		for (@Pc(61) int local61 = local32 - 1; local61 > 0; local61--) {
			@Pc(65) int local65 = arg0;
			arg0 /= 10;
			@Pc(76) int local76 = local65 - arg0 * 10;
			if (local76 < 10) {
				local48[local61] = (char) (local76 + 48);
			} else {
				local48[local61] = (char) (local76 + 87);
			}
		}
		return new String(local48);
	}
}
