import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!jea", name = "q", descriptor = "J")
	public static long aLong128;

	@OriginalMember(owner = "client!jea", name = "r", descriptor = "[Lclient!pga;")
	public static Class32[] aClass32Array13;

	@OriginalMember(owner = "client!jea", name = "p", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_43 = new Class208(43, 3);

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method4611(@OriginalArg(0) String arg0) {
		@Pc(15) int local15 = arg0.length();
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < local15; local19++) {
			@Pc(25) char local25 = arg0.charAt(local19);
			if (local25 == '<' || local25 == '>') {
				local17 += 3;
			}
		}
		@Pc(47) StringBuffer local47 = new StringBuffer(local15 + local17);
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
