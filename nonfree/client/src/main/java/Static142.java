import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!fga", name = "G", descriptor = "Lclient!kca;")
	public static Class189 aClass189_4;

	@OriginalMember(owner = "client!fga", name = "I", descriptor = "Lclient!mga;")
	public static final Class223 aClass223_25 = new Class223(8);

	@OriginalMember(owner = "client!fga", name = "J", descriptor = "I")
	public static int anInt3184 = 0;

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method2868(@OriginalArg(0) String arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static463.aStringArray36.length; local7++) {
			if (Static463.aStringArray36[local7].equalsIgnoreCase(arg0)) {
				return local7;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method2869(@OriginalArg(1) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			@Pc(23) char local23 = arg0.charAt(local17);
			if (local23 <= '\u007f') {
				local15++;
			} else if (local23 > '\u07ff') {
				local15 += 3;
			} else {
				local15 += 2;
			}
		}
		return local15;
	}
}
