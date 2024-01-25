import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static377 {

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "I")
	public static int anInt6828 = 999999;

	@OriginalMember(owner = "client!nia", name = "c", descriptor = "Z")
	public static final boolean aBoolean496 = true;

	@OriginalMember(owner = "client!nia", name = "g", descriptor = "[I")
	public static final int[] anIntArray401 = new int[14];

	@OriginalMember(owner = "client!nia", name = "i", descriptor = "Z")
	public static boolean aBoolean497 = false;

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(IZLjava/lang/String;B)I")
	public static int method5950(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(35) int local35 = 0;
		@Pc(38) int local38 = arg1.length();
		for (@Pc(40) int local40 = 0; local40 < local38; local40++) {
			@Pc(46) char local46 = arg1.charAt(local40);
			if (local40 == 0) {
				if (local46 == '-') {
					local26 = true;
					continue;
				}
				if (local46 == '+') {
					continue;
				}
			}
			@Pc(75) int local75;
			if (local46 >= '0' && local46 <= '9') {
				local75 = local46 - '0';
			} else if (local46 >= 'A' && local46 <= 'Z') {
				local75 = local46 - '7';
			} else if (local46 >= 'a' && local46 <= 'z') {
				local75 = local46 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg0 <= local75) {
				throw new NumberFormatException();
			}
			if (local26) {
				local75 = -local75;
			}
			@Pc(125) int local125 = local75 + arg0 * local35;
			if (local125 / arg0 != local35) {
				throw new NumberFormatException();
			}
			local28 = true;
			local35 = local125;
		}
		if (!local28) {
			throw new NumberFormatException();
		}
		return local35;
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(CI)Z")
	public static boolean method5951(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(27) char[] local27 = Static22.aCharArray4;
			for (@Pc(29) int local29 = 0; local29 < local27.length; local29++) {
				@Pc(35) char local35 = local27[local29];
				if (arg0 == local35) {
					return true;
				}
			}
		}
		return false;
	}
}
