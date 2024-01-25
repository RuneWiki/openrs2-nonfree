import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static372 {

	@OriginalMember(owner = "client!mk", name = "l", descriptor = "Lclient!cb;")
	public static Class50 aClass50_106;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(III)I")
	public static int method5466(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8;
		if (arg0 > arg1) {
			local8 = arg1;
			arg1 = arg0;
			arg0 = local8;
		}
		while (arg0 != 0) {
			local8 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local8;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method5468(@OriginalArg(1) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < local6; local10++) {
			@Pc(15) char local15 = arg0.charAt(local10);
			if (local15 == '<' || local15 == '>') {
				local8 += 3;
			}
		}
		@Pc(37) StringBuffer local37 = new StringBuffer(local6 + local8);
		for (@Pc(44) int local44 = 0; local44 < local6; local44++) {
			@Pc(49) char local49 = arg0.charAt(local44);
			if (local49 == '<') {
				local37.append("<lt>");
			} else if (local49 == '>') {
				local37.append("<gt>");
			} else {
				local37.append(local49);
			}
		}
		return local37.toString();
	}
}
