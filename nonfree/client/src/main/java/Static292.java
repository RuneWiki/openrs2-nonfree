import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!qq", name = "f", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_180 = new Class48(56, -1);

	@OriginalMember(owner = "client!qq", name = "i", descriptor = "Lclient!j;")
	public static final Class113 aClass113_13 = new Class113(13, 4);

	@OriginalMember(owner = "client!qq", name = "j", descriptor = "Z")
	public static boolean aBoolean478 = false;

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method4433(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			@Pc(23) char local23 = arg0.charAt(local17);
			if (local23 == '<' || local23 == '>') {
				local10 += 3;
			}
		}
		@Pc(41) StringBuffer local41 = new StringBuffer(local10 + local8);
		for (@Pc(43) int local43 = 0; local43 < local8; local43++) {
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
