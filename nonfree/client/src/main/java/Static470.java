import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static470 {

	@OriginalMember(owner = "client!th", name = "c", descriptor = "Z")
	public static boolean aBoolean575 = false;

	@OriginalMember(owner = "client!th", name = "d", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ILjava/lang/String;ZB)Z")
	public static boolean method6586(@OriginalArg(1) String arg0) {
		@Pc(32) boolean local32 = false;
		@Pc(34) boolean local34 = false;
		@Pc(36) int local36 = 0;
		@Pc(39) int local39 = arg0.length();
		for (@Pc(41) int local41 = 0; local41 < local39; local41++) {
			@Pc(47) char local47 = arg0.charAt(local41);
			if (local41 == 0) {
				if (local47 == '-') {
					local32 = true;
					continue;
				}
				if (local47 == '+') {
					continue;
				}
			}
			@Pc(80) int local80;
			if (local47 >= '0' && local47 <= '9') {
				local80 = local47 - '0';
			} else if (local47 >= 'A' && local47 <= 'Z') {
				local80 = local47 - '7';
			} else if (local47 >= 'a' && local47 <= 'z') {
				local80 = local47 - 'W';
			} else {
				return false;
			}
			if (local80 >= 10) {
				return false;
			}
			if (local32) {
				local80 = -local80;
			}
			@Pc(116) int local116 = local36 * 10 + local80;
			if (local36 != local116 / 10) {
				return false;
			}
			local36 = local116;
			local34 = true;
		}
		return local34;
	}
}
