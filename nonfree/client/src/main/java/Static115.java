import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!er", name = "t", descriptor = "I")
	public static int anInt2347 = 0;

	@OriginalMember(owner = "client!er", name = "C", descriptor = "Lclient!cu;")
	public static final Class54 aClass54_9 = new Class54(6, 19);

	@OriginalMember(owner = "client!er", name = "E", descriptor = "[C")
	public static final char[] aCharArray5 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IIIZ[BI)V")
	public static void method2259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) int arg3) {
		if (arg1 >= arg3) {
			return;
		}
		arg0 += arg1;
		@Pc(28) int local28 = arg3 - arg1 >> 2;
		while (true) {
			local28--;
			if (local28 < 0) {
				local28 = arg3 - arg1 & 0x3;
				while (true) {
					local28--;
					if (local28 < 0) {
						return;
					}
					arg2[arg0++] = 1;
				}
			}
			@Pc(33) int local33 = arg0 + 1;
			arg2[arg0] = 1;
			@Pc(38) int local38 = local33 + 1;
			arg2[local33] = 1;
			@Pc(43) int local43 = local38 + 1;
			arg2[local38] = 1;
			arg0 = local43 + 1;
			arg2[local43] = 1;
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method2266(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}
}
