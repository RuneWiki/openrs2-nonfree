import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!po", name = "B", descriptor = "[C")
	public static final char[] aCharArray46 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!po", name = "G", descriptor = "I")
	public static int anInt6967 = 0;

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IIZ)I")
	public static int method6005(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(22) int local22 = (arg0 & 0x7F) * 96 >> 7;
		if (local22 < 2) {
			local22 = 2;
		} else if (local22 > 126) {
			local22 = 126;
		}
		return local22 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IIIIBI)V")
	public static void method6012(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static11.method912(arg1, Static38.anInt945, Static131.anInt2843);
		@Pc(17) int local17 = Static11.method912(arg0, Static38.anInt945, Static131.anInt2843);
		@Pc(23) int local23 = Static11.method912(arg3, Static122.anInt1360, Static93.anInt5014);
		@Pc(29) int local29 = Static11.method912(arg4, Static122.anInt1360, Static93.anInt5014);
		for (@Pc(39) int local39 = local11; local39 <= local17; local39++) {
			Static367.method6081(arg2, local23, Static43.anIntArrayArray57[local39], local29);
		}
	}
}
