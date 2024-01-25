import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dea")
public final class Class28_Sub2 extends Class28 {

	@OriginalMember(owner = "client!dea", name = "q", descriptor = "[[J")
	public static final long[][] aLongArrayArray1 = new long[8][256];

	@OriginalMember(owner = "client!dea", name = "r", descriptor = "[J")
	public static final long[] aLongArray9 = new long[11];

	@OriginalMember(owner = "client!dea", name = "m", descriptor = "Lclient!eea;")
	public final Interface5 anInterface5_2;

	static {
		for (@Pc(22) int local22 = 0; local22 < 256; local22++) {
			@Pc(29) char local29 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ\u2e4b﹗ᕷ㟥\u9ff0䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c\ufd4d鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(local22 / 2);
			@Pc(42) long local42 = (long) ((local22 & 0x1) == 0 ? local29 >>> 8 : local29 & 0xFF);
			@Pc(46) long local46 = local42 << 1;
			if (local46 >= 256L) {
				local46 ^= 0x11DL;
			}
			@Pc(58) long local58 = local46 << 1;
			if (local58 >= 256L) {
				local58 ^= 0x11DL;
			}
			@Pc(72) long local72 = local42 ^ local58;
			@Pc(76) long local76 = local58 << 1;
			if (local76 >= 256L) {
				local76 ^= 0x11DL;
			}
			@Pc(88) long local88 = local42 ^ local76;
			aLongArrayArray1[0][local22] = Static296.method6442(Static296.method6442(local46 << 8, Static296.method6442(local72 << 16, Static296.method6442(local76 << 24, Static296.method6442(Static296.method6442(local58 << 40, Static296.method6442(local42 << 56, local42 << 48)), local42 << 32)))), local88);
			for (@Pc(124) int local124 = 1; local124 < 8; local124++) {
				aLongArrayArray1[local124][local22] = Static296.method6442(aLongArrayArray1[local124 - 1][local22] << 56, aLongArrayArray1[local124 - 1][local22] >>> 8);
			}
		}
		aLongArray9[0] = 0L;
		for (@Pc(167) int local167 = 1; local167 <= 10; local167++) {
			@Pc(174) int local174 = local167 * 8 - 8;
			aLongArray9[local167] = Static293.method7804(Static293.method7804(Static180.method3527(65280L, aLongArrayArray1[6][local174 + 6]), Static293.method7804(Static180.method3527(aLongArrayArray1[5][local174 + 5], 16711680L), Static293.method7804(Static293.method7804(Static293.method7804(Static293.method7804(Static180.method3527(-72057594037927936L, aLongArrayArray1[0][local174]), Static180.method3527(71776119061217280L, aLongArrayArray1[1][local174 + 1])), Static180.method3527(aLongArrayArray1[2][local174 + 2], 280375465082880L)), Static180.method3527(aLongArrayArray1[3][local174 + 3], 1095216660480L)), Static180.method3527(aLongArrayArray1[4][local174 + 4], 4278190080L)))), Static180.method3527(255L, aLongArrayArray1[7][local174 + 7]));
		}
	}

	@OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(Lclient!bda;II[B)V")
	public Class28_Sub2(@OriginalArg(0) Class4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface5_2 = arg0.method7347(arg2, arg3, false, Static504.aClass110_22, arg1);
		this.anInterface5_2.method7769(false, false);
	}

	@OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(Lclient!bda;II[I)V")
	public Class28_Sub2(@OriginalArg(0) Class4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface5_2 = arg0.method7271(arg3, arg2, arg1, false);
		this.anInterface5_2.method7769(false, false);
	}
}
