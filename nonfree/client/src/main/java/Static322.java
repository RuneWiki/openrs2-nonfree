import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!sk", name = "E", descriptor = "Lclient!j;")
	public static Class113 aClass113_1;

	@OriginalMember(owner = "client!sk", name = "G", descriptor = "Lclient!pq;")
	public static Class186 aClass186_1;

	@OriginalMember(owner = "client!sk", name = "L", descriptor = "F")
	public static float aFloat70;

	@OriginalMember(owner = "client!sk", name = "v", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_94 = new Class183(46, 0);

	@OriginalMember(owner = "client!sk", name = "z", descriptor = "[C")
	public static final char[] aCharArray6 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIII)I")
	public static int method5191(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 / arg2;
		@Pc(18) int local18 = arg1 & arg2 - 1;
		@Pc(22) int local22 = arg0 / arg2;
		@Pc(28) int local28 = arg0 & arg2 - 1;
		@Pc(33) int local33 = Static200.method3687(local22, local7);
		@Pc(40) int local40 = Static200.method3687(local22, local7 + 1);
		@Pc(47) int local47 = Static200.method3687(local22 + 1, local7);
		@Pc(56) int local56 = Static200.method3687(local22 + 1, local7 + 1);
		@Pc(63) int local63 = Static197.method3599(local18, local33, local40, arg2);
		@Pc(70) int local70 = Static197.method3599(local18, local47, local56, arg2);
		return Static197.method3599(local28, local63, local70, arg2);
	}
}
