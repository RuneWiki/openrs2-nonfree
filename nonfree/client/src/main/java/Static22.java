import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static22 {

	@OriginalMember(owner = "client!ap", name = "D", descriptor = "I")
	public static int anInt329;

	@OriginalMember(owner = "client!ap", name = "F", descriptor = "Lclient!uu;")
	public static Class343 aClass343_17;

	@OriginalMember(owner = "client!ap", name = "r", descriptor = "Lclient!st;")
	public static final Class314 aClass314_6 = new Class314(34, 8);

	@OriginalMember(owner = "client!ap", name = "y", descriptor = "[C")
	public static final char[] aCharArray4 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!ap", name = "E", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_12 = new Class194(11, 4);

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "(III)I")
	public static int method318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}
}
