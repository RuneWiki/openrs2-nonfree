import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static382 {

	@OriginalMember(owner = "client!tc", name = "J", descriptor = "F")
	public static float aFloat99;

	@OriginalMember(owner = "client!tc", name = "L", descriptor = "Lclient!qs;")
	public static Class211 aClass211_77;

	@OriginalMember(owner = "client!tc", name = "Q", descriptor = "Lclient!qs;")
	public static Class211 aClass211_78;

	@OriginalMember(owner = "client!tc", name = "T", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray41;

	@OriginalMember(owner = "client!tc", name = "U", descriptor = "[C")
	public static final char[] aCharArray5 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!ec;ZIIJLclient!ta;III)V")
	public static void method5277(@OriginalArg(0) Class68 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) long arg3, @OriginalArg(5) Class24 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) int local11 = arg6 * arg6 + arg7 * arg7;
		if ((long) local11 > arg3) {
			return;
		}
		@Pc(32) int local32 = Math.min(arg0.anInt2107 / 2, arg0.anInt2149 / 2);
		if (local32 * local32 >= local11) {
			Static16.method313(arg1, arg7, arg2, Static247.aClass137Array10[arg5], arg4, arg6, arg0);
			return;
		}
		local32 -= 10;
		@Pc(50) int local50;
		if (Static21.anInt6762 == 4) {
			local50 = (int) Static267.aFloat83 & 0x3FFF;
		} else {
			local50 = Static217.anInt4366 + (int) Static267.aFloat83 & 0x3FFF;
		}
		@Pc(63) int local63 = Class90_Sub1.anIntArray304[local50];
		@Pc(67) int local67 = Class90_Sub1.anIntArray303[local50];
		if (Static21.anInt6762 != 4) {
			local67 = local67 * 256 / (Static135.anInt3022 + 256);
			local63 = local63 * 256 / (Static135.anInt3022 + 256);
		}
		@Pc(98) int local98 = arg6 * local63 + local67 * arg7 >> 15;
		@Pc(109) int local109 = local67 * arg6 - arg7 * local63 >> 15;
		@Pc(115) double local115 = Math.atan2((double) local98, (double) local109);
		@Pc(122) int local122 = (int) (Math.sin(local115) * (double) local32);
		@Pc(129) int local129 = (int) (Math.cos(local115) * (double) local32);
		Static339.aClass137Array14[arg5].method5701((float) local122 + (float) arg0.anInt2107 / 2.0F + (float) arg1, (float) arg2 + (float) arg0.anInt2149 / 2.0F - (float) local129, 4096, (int) (-local115 / 6.283185307179586D * 65535.0D));
	}
}
