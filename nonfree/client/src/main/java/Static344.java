import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!ng", name = "d", descriptor = "Lclient!kk;")
	public static Class173 aClass173_1;

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
	public static int anInt6510;

	@OriginalMember(owner = "client!ng", name = "f", descriptor = "[I")
	public static final int[] anIntArray456 = new int[1];

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method5254(@OriginalArg(0) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			@Pc(23) char local23 = arg0.charAt(local17);
			if (local23 == '<' || local23 == '>') {
				local15 += 3;
			}
		}
		@Pc(41) StringBuffer local41 = new StringBuffer(local13 + local15);
		for (@Pc(43) int local43 = 0; local43 < local13; local43++) {
			@Pc(49) char local49 = arg0.charAt(local43);
			if (local49 == '<') {
				local41.append("<lt>");
			} else if (local49 == '>') {
				local41.append("<gt>");
			} else {
				local41.append(local49);
			}
		}
		return local41.toString();
	}
}
