import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!bda", name = "B", descriptor = "Lclient!bc;")
	public static final Class25 aClass25_5 = new Class25(64);

	@OriginalMember(owner = "client!bda", name = "F", descriptor = "Lclient!fl;")
	public static final Class103 aClass103_2 = new Class103(2, 2);

	@OriginalMember(owner = "client!bda", name = "G", descriptor = "[Z")
	public static final boolean[] aBooleanArray1 = new boolean[8];

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(IIIII)V")
	public static void method982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) int local10 = 0; local10 < Static377.anInt7315; local10++) {
			@Pc(15) Rectangle local15 = Class43.aRectangleArray6[local10];
			if (local15.x + local15.width > arg0 && arg2 + arg0 > local15.x && local15.height + local15.y > arg1 && arg1 + arg3 > local15.y) {
				Static518.aBooleanArray37[local10] = true;
			}
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(ZLjava/lang/String;II)Z")
	public static boolean method983(@OriginalArg(1) String arg0) {
		@Pc(26) boolean local26 = false;
		@Pc(33) boolean local33 = false;
		@Pc(35) int local35 = 0;
		@Pc(38) int local38 = arg0.length();
		for (@Pc(40) int local40 = 0; local40 < local38; local40++) {
			@Pc(45) char local45 = arg0.charAt(local40);
			if (local40 == 0) {
				if (local45 == '-') {
					local26 = true;
					continue;
				}
				if (local45 == '+') {
					continue;
				}
			}
			@Pc(77) int local77;
			if (local45 >= '0' && local45 <= '9') {
				local77 = local45 - '0';
			} else if (local45 >= 'A' && local45 <= 'Z') {
				local77 = local45 - '7';
			} else if (local45 >= 'a' && local45 <= 'z') {
				local77 = local45 - 'W';
			} else {
				return false;
			}
			if (local77 >= 10) {
				return false;
			}
			if (local26) {
				local77 = -local77;
			}
			@Pc(117) int local117 = local77 + local35 * 10;
			if (local117 / 10 != local35) {
				return false;
			}
			local35 = local117;
			local33 = true;
		}
		return local33;
	}
}
