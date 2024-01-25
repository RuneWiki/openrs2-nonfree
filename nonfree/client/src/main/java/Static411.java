import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static411 {

	@OriginalMember(owner = "client!mk", name = "j", descriptor = "Lclient!qh;")
	public static final Class309 aClass309_7 = new Class309("game4", "Game 4", 3);

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method5495(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(8) int local8 = arg1.length();
		if (arg0 != -4712) {
			return null;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < local8; local18++) {
			@Pc(26) char local26 = arg1.charAt(local18);
			if (local26 == '<' || local26 == '>') {
				local16 += 3;
			}
		}
		@Pc(51) StringBuffer local51 = new StringBuffer(local8 + local16);
		for (@Pc(55) int local55 = 0; local55 < local8; local55++) {
			@Pc(63) char local63 = arg1.charAt(local55);
			if (local63 == '<') {
				local51.append("<lt>");
			} else if (local63 == '>') {
				local51.append("<gt>");
			} else {
				local51.append(local63);
			}
		}
		return local51.toString();
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method5499(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(8) int local8 = arg1.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) + arg1.charAt(local12) - local10;
		}
		if (arg0 <= 85) {
			method5495(59, (String) null);
		}
		return local10;
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(II)I")
	public static int method5502(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}
}
