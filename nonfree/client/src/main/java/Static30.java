import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!bc", name = "Q", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray6;

	@OriginalMember(owner = "client!bc", name = "R", descriptor = "Lclient!cr;")
	public static Class51 aClass51_1;

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)V")
	public static void method663() {
		Static115.aClass352_20.method7659();
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method665(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(18) char local18 = arg0.charAt(local12);
			if (local18 == '<' || local18 == '>') {
				local10 += 3;
			}
		}
		@Pc(51) StringBuffer local51 = new StringBuffer(local8 + local10);
		for (@Pc(53) int local53 = 0; local53 < local8; local53++) {
			@Pc(59) char local59 = arg0.charAt(local53);
			if (local59 == '<') {
				local51.append("<lt>");
			} else if (local59 == '>') {
				local51.append("<gt>");
			} else {
				local51.append(local59);
			}
		}
		return local51.toString();
	}
}
