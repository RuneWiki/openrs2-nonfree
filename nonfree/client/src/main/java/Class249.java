import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nl")
public final class Class249 {

	@OriginalMember(owner = "client!nl", name = "n", descriptor = "[J")
	public static final long[] aLongArray17 = new long[11];

	@OriginalMember(owner = "client!nl", name = "m", descriptor = "[[J")
	public static final long[][] aLongArrayArray1 = new long[8][256];

	@OriginalMember(owner = "client!nl", name = "k", descriptor = "[I")
	public int[] anIntArray535;

	@OriginalMember(owner = "client!nl", name = "e", descriptor = "I")
	public int anInt7384 = -1;

	@OriginalMember(owner = "client!nl", name = "j", descriptor = "I")
	public int anInt7387 = -1;

	static {
		for (@Pc(24) int local24 = 0; local24 < 256; local24++) {
			@Pc(31) char local31 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ\u2e4b﹗ᕷ㟥\u9ff0䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c\ufd4d鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(local24 / 2);
			@Pc(47) long local47 = (long) ((local24 & 0x1) == 0 ? local31 >>> 8 : local31 & 0xFF);
			@Pc(51) long local51 = local47 << 1;
			if (local51 >= 256L) {
				local51 ^= 0x11DL;
			}
			@Pc(63) long local63 = local51 << 1;
			if (local63 >= 256L) {
				local63 ^= 0x11DL;
			}
			@Pc(75) long local75 = local47 ^ local63;
			@Pc(79) long local79 = local63 << 1;
			if (local79 >= 256L) {
				local79 ^= 0x11DL;
			}
			@Pc(91) long local91 = local79 ^ local47;
			aLongArrayArray1[0][local24] = Static277.method4024(local91, Static277.method4024(local51 << 8, Static277.method4024(local75 << 16, Static277.method4024(local79 << 24, Static277.method4024(local47 << 32, Static277.method4024(local63 << 40, Static277.method4024(local47 << 56, local47 << 48)))))));
			for (@Pc(127) int local127 = 1; local127 < 8; local127++) {
				aLongArrayArray1[local127][local24] = Static277.method4024(aLongArrayArray1[local127 - 1][local24] >>> 8, aLongArrayArray1[local127 - 1][local24] << 56);
			}
		}
		aLongArray17[0] = 0L;
		for (@Pc(166) int local166 = 1; local166 <= 10; local166++) {
			@Pc(173) int local173 = (local166 - 1) * 8;
			aLongArray17[local166] = Static136.method2177(Static136.method2177(Static136.method2177(Static315.method5005(16711680L, aLongArrayArray1[5][local173 + 5]), Static136.method2177(Static315.method5005(4278190080L, aLongArrayArray1[4][local173 + 4]), Static136.method2177(Static136.method2177(Static136.method2177(Static315.method5005(aLongArrayArray1[1][local173 + 1], 71776119061217280L), Static315.method5005(aLongArrayArray1[0][local173], -72057594037927936L)), Static315.method5005(aLongArrayArray1[2][local173 + 2], 280375465082880L)), Static315.method5005(aLongArrayArray1[3][local173 + 3], 1095216660480L)))), Static315.method5005(aLongArrayArray1[6][local173 + 6], 65280L)), Static315.method5005(255L, aLongArrayArray1[7][local173 + 7]));
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(BLclient!so;)V")
	public void method5991(@OriginalArg(1) Class14_Sub29 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5866();
			if (local9 == 0) {
				return;
			}
			this.method5992(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(BILclient!so;)V")
	private void method5992(@OriginalArg(1) int arg0, @OriginalArg(2) Class14_Sub29 arg1) {
		if (arg0 == 1) {
			this.anInt7387 = arg1.method5900();
		} else if (arg0 == 2) {
			this.anIntArray535 = new int[arg1.method5866()];
			for (@Pc(36) int local36 = 0; local36 < this.anIntArray535.length; local36++) {
				this.anIntArray535[local36] = arg1.method5900();
			}
		} else if (arg0 == 3) {
			this.anInt7384 = arg1.method5866();
		}
	}
}
