import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!cn", name = "g", descriptor = "Lclient!mv;")
	public static Class229 aClass229_20;

	@OriginalMember(owner = "client!cn", name = "e", descriptor = "[I")
	public static final int[] anIntArray123 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(II[BI)Ljava/lang/String;")
	public static String method1195(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(8) char[] local8 = new char[arg2];
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < arg2; local19++) {
			@Pc(29) int local29 = arg1[arg0 + local19] & 0xFF;
			if (local29 != 0) {
				if (local29 >= 128 && local29 < 160) {
					@Pc(48) char local48 = Static279.aCharArray4[local29 - 128];
					if (local48 == '\u0000') {
						local48 = '?';
					}
					local29 = local48;
				}
				local8[local17++] = (char) local29;
			}
		}
		return new String(local8, 0, local17);
	}
}
