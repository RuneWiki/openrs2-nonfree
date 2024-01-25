import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Z)V")
	public static void method352() {
		if (Static35.anInt639 <= 0) {
			Static274.aString32 = "";
			return;
		}
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static421.aStringArray28.length; local14++) {
			if (Static421.aStringArray28[local14].indexOf("--> ") != -1) {
				@Pc(26) int local26 = ~Static35.anInt639;
				local12++;
				if (local26 == ~local12) {
					Static274.aString32 = Static421.aStringArray28[local14].substring(Static421.aStringArray28[local14].indexOf(">") + 2);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ICLjava/lang/String;)I")
	public static int method353(@OriginalArg(1) char arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = arg1.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			if (arg1.charAt(local12) == arg0) {
				local7++;
			}
		}
		return local7;
	}
}
