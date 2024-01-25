import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!g", name = "i", descriptor = "[C")
	public static final char[] aCharArray3 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method1850(@OriginalArg(1) String arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static365.aStringArray35.length; local12++) {
			if (Static365.aStringArray35[local12].equalsIgnoreCase(arg0)) {
				return local12;
			}
		}
		return -1;
	}
}
