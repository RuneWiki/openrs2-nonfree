import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "[I")
	public static final int[] anIntArray335 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "[I")
	public static final int[] anIntArray336 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "[I")
	public static final int[] anIntArray337 = new int[13];

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method4070(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(18) char local18 = arg0.charAt(local12);
			if (local18 == '<' || local18 == '>') {
				local10 += 3;
			}
		}
		@Pc(42) StringBuffer local42 = new StringBuffer(local10 + local8);
		for (@Pc(49) int local49 = 0; local49 < local8; local49++) {
			@Pc(55) char local55 = arg0.charAt(local49);
			if (local55 == '<') {
				local42.append("<lt>");
			} else if (local55 == '>') {
				local42.append("<gt>");
			} else {
				local42.append(local55);
			}
		}
		return local42.toString();
	}
}
