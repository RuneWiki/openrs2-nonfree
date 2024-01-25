import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static555 {

	@OriginalMember(owner = "client!u", name = "o", descriptor = "I")
	public static int anInt9375;

	@OriginalMember(owner = "client!u", name = "q", descriptor = "I")
	public static int anInt9377;

	@OriginalMember(owner = "client!u", name = "k", descriptor = "[C")
	public static final char[] aCharArray6 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!u", name = "l", descriptor = "I")
	public static int anInt9372 = -1;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ZB)V")
	public static void method8083(@OriginalArg(0) boolean arg0) {
		Static302.method4724(arg0, Static337.anInt5727, Static408.anInt7118, Static345.anInt5827);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IBIII)V")
	public static void method8084(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(12) int local12 = -arg3;
		@Pc(14) int local14 = -1;
		@Pc(22) int local22 = Static361.method8001(Static275.anInt4919, Static529.anInt9089, arg2 + arg3);
		@Pc(31) int local31 = Static361.method8001(Static275.anInt4919, Static529.anInt9089, arg2 - arg3);
		Static491.method7219(Static249.anIntArrayArray23[arg1], local31, arg0, local22);
		while (local7 < local9) {
			local14 += 2;
			local12 += local14;
			@Pc(63) int local63;
			@Pc(68) int local68;
			@Pc(82) int local82;
			@Pc(90) int local90;
			if (local12 > 0) {
				local9--;
				local12 -= local9 << 1;
				local63 = arg1 - local9;
				local68 = arg1 + local9;
				if (Static554.anInt9362 <= local68 && Static62.anInt1300 >= local63) {
					local82 = Static361.method8001(Static275.anInt4919, Static529.anInt9089, local7 + arg2);
					local90 = Static361.method8001(Static275.anInt4919, Static529.anInt9089, arg2 - local7);
					if (Static62.anInt1300 >= local68) {
						Static491.method7219(Static249.anIntArrayArray23[local68], local90, arg0, local82);
					}
					if (local63 >= Static554.anInt9362) {
						Static491.method7219(Static249.anIntArrayArray23[local63], local90, arg0, local82);
					}
				}
			}
			local7++;
			local63 = arg1 - local7;
			local68 = arg1 + local7;
			if (local68 >= Static554.anInt9362 && Static62.anInt1300 >= local63) {
				local82 = Static361.method8001(Static275.anInt4919, Static529.anInt9089, local9 + arg2);
				local90 = Static361.method8001(Static275.anInt4919, Static529.anInt9089, arg2 - local9);
				if (Static62.anInt1300 >= local68) {
					Static491.method7219(Static249.anIntArrayArray23[local68], local90, arg0, local82);
				}
				if (Static554.anInt9362 <= local63) {
					Static491.method7219(Static249.anIntArrayArray23[local63], local90, arg0, local82);
				}
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IZI)V")
	public static void method8086(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) Class5_Sub38 local8 = Static478.method7058(arg0, arg1);
		if (local8 != null) {
			local8.method9047();
		}
	}
}
