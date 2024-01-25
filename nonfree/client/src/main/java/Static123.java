import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "[I")
	public static final int[] anIntArray442 = new int[4096];

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
	public static int anInt6260 = 0;

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
	public static int anInt6262 = 0;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method4868(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(16) int local16 = 0;
		@Pc(19) int local19 = arg0.length();
		while (local19 > local16 && Static233.method3481(arg0.charAt(local16))) {
			local16++;
		}
		while (local19 > local16 && Static233.method3481(arg0.charAt(local19 - 1))) {
			local19--;
		}
		@Pc(54) int local54 = local19 - local16;
		if (local54 < 1 || local54 > 12) {
			return null;
		}
		@Pc(71) StringBuffer local71 = new StringBuffer(local54);
		for (@Pc(73) int local73 = local16; local73 < local19; local73++) {
			@Pc(79) char local79 = arg0.charAt(local73);
			if (Static210.method3198(local79)) {
				@Pc(87) char local87 = Static147.method2459(local79);
				if (local87 != '\u0000') {
					local71.append(local87);
				}
			}
		}
		if (local71.length() == 0) {
			return null;
		} else {
			return local71.toString();
		}
	}
}
