import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!or", name = "y", descriptor = "I")
	public static int anInt4928;

	@OriginalMember(owner = "client!or", name = "H", descriptor = "I")
	public static int anInt4935;

	@OriginalMember(owner = "client!or", name = "x", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_88 = new Class231("slide:", "gleiten:", "glissement:", "deslizamento:");

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method4364(@OriginalArg(0) String arg0) {
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
			@Pc(44) char local44 = arg0.charAt(local38);
			if (local44 == '<') {
				local36.append("<lt>");
			} else if (local44 == '>') {
				local36.append("<gt>");
			} else {
				local36.append(local44);
			}
		}
		return local36.toString();
	}
}
