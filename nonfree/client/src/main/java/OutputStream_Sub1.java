import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jp")
public final class OutputStream_Sub1 extends OutputStream {

	@OriginalMember(owner = "client!jp", name = "e", descriptor = "[J")
	public static final long[] aLongArray19 = new long[11];

	@OriginalMember(owner = "client!jp", name = "f", descriptor = "[[J")
	public static final long[][] aLongArrayArray1 = new long[8][256];

	static {
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(17) char local17 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ\u2e4b﹗ᕷ㟥\u9ff0䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c\ufd4d鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(local10 / 2);
			@Pc(33) long local33 = (long) ((local10 & 0x1) == 0 ? local17 >>> 8 : local17 & 0xFF);
			@Pc(37) long local37 = local33 << 1;
			if (local37 >= 256L) {
				local37 ^= 0x11DL;
			}
			@Pc(49) long local49 = local37 << 1;
			if (local49 >= 256L) {
				local49 ^= 0x11DL;
			}
			@Pc(63) long local63 = local49 ^ local33;
			@Pc(67) long local67 = local49 << 1;
			if (local67 >= 256L) {
				local67 ^= 0x11DL;
			}
			@Pc(81) long local81 = local67 ^ local33;
			aLongArrayArray1[0][local10] = Static517.method7321(local81, Static517.method7321(local37 << 8, Static517.method7321(local63 << 16, Static517.method7321(local67 << 24, Static517.method7321(Static517.method7321(Static517.method7321(local33 << 56, local33 << 48), local49 << 40), local33 << 32)))));
			for (@Pc(117) int local117 = 1; local117 < 8; local117++) {
				aLongArrayArray1[local117][local10] = Static517.method7321(aLongArrayArray1[local117 - 1][local10] >>> 8, aLongArrayArray1[local117 - 1][local10] << 56);
			}
		}
		aLongArray19[0] = 0L;
		for (@Pc(158) int local158 = 1; local158 <= 10; local158++) {
			@Pc(165) int local165 = local158 * 8 - 8;
			aLongArray19[local158] = Static650.method8720(Static650.method8720(Static494.method7083(65280L, aLongArrayArray1[6][local165 + 6]), Static650.method8720(Static650.method8720(Static494.method7083(aLongArrayArray1[4][local165 + 4], 4278190080L), Static650.method8720(Static650.method8720(Static494.method7083(aLongArrayArray1[2][local165 + 2], 280375465082880L), Static650.method8720(Static494.method7083(71776119061217280L, aLongArrayArray1[1][local165 + 1]), Static494.method7083(aLongArrayArray1[0][local165], -72057594037927936L))), Static494.method7083(1095216660480L, aLongArrayArray1[3][local165 + 3]))), Static494.method7083(16711680L, aLongArrayArray1[5][local165 + 5]))), Static494.method7083(255L, aLongArrayArray1[7][local165 + 7]));
		}
	}

	@OriginalMember(owner = "client!jp", name = "write", descriptor = "(I)V")
	@Override
	public void write(@OriginalArg(0) int arg0) throws IOException {
		throw new IOException();
	}
}
