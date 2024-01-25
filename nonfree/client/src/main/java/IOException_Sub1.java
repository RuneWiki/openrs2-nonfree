import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public final class IOException_Sub1 extends IOException {

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "[J")
	public static final long[] aLongArray22 = new long[11];

	@OriginalMember(owner = "client!ur", name = "e", descriptor = "[[J")
	public static final long[][] aLongArrayArray1 = new long[8][256];

	static {
		for (@Pc(8) int local8 = 0; local8 < 256; local8++) {
			@Pc(15) char local15 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ\u2e4b﹗ᕷ㟥\u9ff0䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c\ufd4d鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(local8 / 2);
			@Pc(31) long local31 = (long) ((local8 & 0x1) == 0 ? local15 >>> 8 : local15 & 0xFF);
			@Pc(35) long local35 = local31 << 1;
			if (local35 >= 256L) {
				local35 ^= 0x11DL;
			}
			@Pc(47) long local47 = local35 << 1;
			if (local47 >= 256L) {
				local47 ^= 0x11DL;
			}
			@Pc(59) long local59 = local47 ^ local31;
			@Pc(63) long local63 = local47 << 1;
			if (local63 >= 256L) {
				local63 ^= 0x11DL;
			}
			@Pc(75) long local75 = local31 ^ local63;
			aLongArrayArray1[0][local8] = Static129.method2250(local75, Static129.method2250(local35 << 8, Static129.method2250(local59 << 16, Static129.method2250(Static129.method2250(local31 << 32, Static129.method2250(local47 << 40, Static129.method2250(local31 << 48, local31 << 56))), local63 << 24))));
			for (@Pc(111) int local111 = 1; local111 < 8; local111++) {
				aLongArrayArray1[local111][local8] = Static129.method2250(aLongArrayArray1[local111 - 1][local8] << 56, aLongArrayArray1[local111 - 1][local8] >>> 8);
			}
		}
		aLongArray22[0] = 0L;
		for (@Pc(152) int local152 = 1; local152 <= 10; local152++) {
			@Pc(159) int local159 = (local152 - 1) * 8;
			aLongArray22[local152] = Static403.method5755(Static403.method5755(Static206.method3267(65280L, aLongArrayArray1[6][local159 + 6]), Static403.method5755(Static403.method5755(Static206.method3267(4278190080L, aLongArrayArray1[4][local159 + 4]), Static403.method5755(Static206.method3267(1095216660480L, aLongArrayArray1[3][local159 + 3]), Static403.method5755(Static403.method5755(Static206.method3267(71776119061217280L, aLongArrayArray1[1][local159 + 1]), Static206.method3267(-72057594037927936L, aLongArrayArray1[0][local159])), Static206.method3267(aLongArrayArray1[2][local159 + 2], 280375465082880L)))), Static206.method3267(aLongArrayArray1[5][local159 + 5], 16711680L))), Static206.method3267(aLongArrayArray1[7][local159 + 7], 255L));
		}
	}

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public IOException_Sub1(@OriginalArg(0) String arg0) {
		super(arg0);
	}
}
