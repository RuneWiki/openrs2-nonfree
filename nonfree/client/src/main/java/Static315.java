import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(BII)Z")
	public static boolean method4550(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class216 local8 = Static362.aClass290_2.method5799(arg1);
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local8.method4554(arg0);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method4559(@OriginalArg(0) String arg0) {
		@Pc(16) int local16 = arg0.length();
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < local16; local20++) {
			@Pc(26) char local26 = arg0.charAt(local20);
			if (local26 == '<' || local26 == '>') {
				local18 += 3;
			}
		}
		@Pc(44) StringBuffer local44 = new StringBuffer(local18 + local16);
		for (@Pc(46) int local46 = 0; local46 < local16; local46++) {
			@Pc(52) char local52 = arg0.charAt(local46);
			if (local52 == '<') {
				local44.append("<lt>");
			} else if (local52 == '>') {
				local44.append("<gt>");
			} else {
				local44.append(local52);
			}
		}
		return local44.toString();
	}
}
