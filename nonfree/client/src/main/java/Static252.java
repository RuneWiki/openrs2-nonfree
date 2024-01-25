import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_140 = new Class208(47, -1);

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method4379(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(18) char local18 = arg0.charAt(local12);
			if (local18 == '<' || local18 == '>') {
				local10 += 3;
			}
		}
		@Pc(36) StringBuffer local36 = new StringBuffer(local10 + local8);
		for (@Pc(38) int local38 = 0; local38 < local8; local38++) {
			@Pc(49) char local49 = arg0.charAt(local38);
			if (local49 == '<') {
				local36.append("<lt>");
			} else if (local49 == '>') {
				local36.append("<gt>");
			} else {
				local36.append(local49);
			}
		}
		return local36.toString();
	}
}
