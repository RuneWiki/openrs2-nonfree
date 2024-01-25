import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static401 {

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "Lclient!sf;")
	public static Class309 aClass309_4;

	@OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
	public static int anInt6603;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "[I")
	public static final int[] anIntArray420 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "[I")
	public static final int[] anIntArray421 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
	public static int anInt6601 = 0;

	@OriginalMember(owner = "client!pb", name = "g", descriptor = "[I")
	public static final int[] anIntArray422 = new int[1];

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method5487(@OriginalArg(1) String arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(19) int local19 = arg0.length();
		for (@Pc(21) int local21 = 0; local21 < local19; local21++) {
			@Pc(27) char local27 = arg0.charAt(local21);
			if (local27 == '%' && local21 + 2 < local19) {
				local27 = arg0.charAt(local21 + 1);
				@Pc(72) int local72;
				if (local27 >= '0' && local27 <= '9') {
					local72 = local27 - 48;
				} else if (local27 >= 'a' && local27 <= 'f') {
					local72 = local27 + '\n' - 97;
				} else {
					if (local27 < 'A' || local27 > 'F') {
						local9.append('%');
						continue;
					}
					local72 = local27 + 10 - 65;
				}
				local72 *= 16;
				local27 = arg0.charAt(local21 + 2);
				if (local27 >= '0' && local27 <= '9') {
					local72 += local27 - 48;
				} else if (local27 >= 'a' && local27 <= 'f') {
					local72 += local27 + '\n' - 97;
				} else {
					if (local27 < 'A' || local27 > 'F') {
						local9.append('%');
						continue;
					}
					local72 += local27 + '\n' - 65;
				}
				local21 += 2;
				if (local72 != 0 && Static19.method287((byte) local72)) {
					local9.append(Static581.method7528((byte) local72));
				}
			} else if (local27 == '+') {
				local9.append(' ');
			} else {
				local9.append(local27);
			}
		}
		return local9.toString();
	}
}
