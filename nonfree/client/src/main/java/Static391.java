import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static391 {

	@OriginalMember(owner = "client!tk", name = "o", descriptor = "[I")
	public static final int[] anIntArray640 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method5206(@OriginalArg(0) String arg0) {
		@Pc(15) int local15 = arg0.length();
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < local15; local19++) {
			@Pc(25) char local25 = arg0.charAt(local19);
			if (local25 == '<' || local25 == '>') {
				local17 += 3;
			}
		}
		@Pc(47) StringBuffer local47 = new StringBuffer(local17 + local15);
		for (@Pc(49) int local49 = 0; local49 < local15; local49++) {
			@Pc(55) char local55 = arg0.charAt(local49);
			if (local55 == '<') {
				local47.append("<lt>");
			} else if (local55 == '>') {
				local47.append("<gt>");
			} else {
				local47.append(local55);
			}
		}
		return local47.toString();
	}
}
