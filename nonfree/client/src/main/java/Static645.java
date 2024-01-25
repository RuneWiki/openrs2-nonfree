import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static645 {

	@OriginalMember(owner = "client!ww", name = "p", descriptor = "D")
	public static double aDouble52;

	@OriginalMember(owner = "client!ww", name = "l", descriptor = "I")
	public static int anInt9916 = 0;

	@OriginalMember(owner = "client!ww", name = "b", descriptor = "(I)V")
	public static void method8269() {
		Static430.aClass32_75.method640();
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method8270(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(18) char local18 = arg0.charAt(local12);
			if (local18 == '<' || local18 == '>') {
				local10 += 3;
			}
		}
		@Pc(40) StringBuffer local40 = new StringBuffer(local10 + local8);
		for (@Pc(47) int local47 = 0; local47 < local8; local47++) {
			@Pc(53) char local53 = arg0.charAt(local47);
			if (local53 == '<') {
				local40.append("<lt>");
			} else if (local53 == '>') {
				local40.append("<gt>");
			} else {
				local40.append(local53);
			}
		}
		return local40.toString();
	}
}
