import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static486 {

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "[J")
	public static long[] aLongArray13;

	@OriginalMember(owner = "client!tea", name = "c", descriptor = "I")
	public static int anInt8128;

	@OriginalMember(owner = "client!tea", name = "e", descriptor = "[C")
	public static final char[] aCharArray9 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(II)Lclient!uw;")
	public static Class6_Sub1_Sub17 method6717(@OriginalArg(1) int arg0) {
		@Pc(10) Class6_Sub1_Sub17 local10 = (Class6_Sub1_Sub17) Static523.aClass284_4.method6449((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static58.aClass251_21.method5860(arg0, 0);
		if (local20 == null || local20.length <= 1) {
			return null;
		} else {
			local10 = Static144.method2159(local20);
			Static523.aClass284_4.method6450((long) arg0, local10);
			return local10;
		}
	}
}
