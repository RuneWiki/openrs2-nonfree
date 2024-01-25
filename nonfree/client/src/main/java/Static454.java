import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static454 {

	@OriginalMember(owner = "client!pja", name = "z", descriptor = "[C")
	public static final char[] aCharArray6 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(IILclient!ha;)Lclient!hw;")
	public static Class151 method6566(@OriginalArg(0) int arg0, @OriginalArg(2) Class132 arg1) {
		@Pc(17) Class290 local17 = Static27.method6634(true, arg0, arg1);
		return local17 == null ? null : local17.aClass151_13;
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(III)Z")
	public static boolean method6568(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static479.method7014(arg1, arg0)) {
			return Static440.method6454(arg1, arg0) | (arg0 & 0x9000) != 0 | Static153.method2167(arg1, arg0) ? true : (arg1 & 0x37) == 0 & (Static76.method1319(arg0, arg1) | (arg0 & 0x2000) != 0 | Static214.method3114(arg1, arg0));
		} else {
			return false;
		}
	}
}
