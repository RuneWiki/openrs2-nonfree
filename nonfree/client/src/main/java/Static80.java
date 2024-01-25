import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "I")
	public static int anInt1719;

	@OriginalMember(owner = "client!dr", name = "f", descriptor = "I")
	public static int anInt1722;

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "I")
	public static int anInt1720 = -1;

	@OriginalMember(owner = "client!dr", name = "i", descriptor = "Z")
	public static boolean aBoolean137 = false;

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method1411(@OriginalArg(1) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < local6; local15++) {
			@Pc(20) char local20 = arg0.charAt(local15);
			if (local20 == '<' || local20 == '>') {
				local13 += 3;
			}
		}
		@Pc(46) StringBuffer local46 = new StringBuffer(local13 + local6);
		for (@Pc(48) int local48 = 0; local48 < local6; local48++) {
			@Pc(53) char local53 = arg0.charAt(local48);
			if (local53 == '<') {
				local46.append("<lt>");
			} else if (local53 == '>') {
				local46.append("<gt>");
			} else {
				local46.append(local53);
			}
		}
		return local46.toString();
	}
}
