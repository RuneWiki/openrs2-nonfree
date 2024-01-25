import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static381 {

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(ZC)Z")
	public static boolean method5568(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(29) char[] local29 = Static361.aCharArray16;
			for (@Pc(31) int local31 = 0; local31 < local29.length; local31++) {
				@Pc(37) char local37 = local29[local31];
				if (arg0 == local37) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public static int method5573(@OriginalArg(0) String arg0) {
		@Pc(15) int local15 = arg0.length();
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < local15; local19++) {
			local17 = (local17 << 5) + arg0.charAt(local19) - local17;
		}
		return local17;
	}
}
