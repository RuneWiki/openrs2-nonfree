import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nt")
public final class Class262 {

	@OriginalMember(owner = "client!nt", name = "c", descriptor = "[[J")
	public static final long[][] aLongArrayArray1 = new long[8][256];

	@OriginalMember(owner = "client!nt", name = "t", descriptor = "[J")
	public static final long[] aLongArray20 = new long[11];

	@OriginalMember(owner = "client!nt", name = "k", descriptor = "Lclient!au;")
	public Class19_Sub1_Sub1 aClass19_Sub1_Sub1_1;

	@OriginalMember(owner = "client!nt", name = "m", descriptor = "Lclient!qca;")
	public Class19_Sub1_Sub2 aClass19_Sub1_Sub2_1;

	@OriginalMember(owner = "client!nt", name = "v", descriptor = "Lclient!au;")
	public Class19_Sub1_Sub1 aClass19_Sub1_Sub1_2;

	@OriginalMember(owner = "client!nt", name = "u", descriptor = "S")
	public short aShort98;

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "S")
	public short aShort99;

	@OriginalMember(owner = "client!nt", name = "l", descriptor = "Lclient!jg;")
	public Class19_Sub1_Sub4 aClass19_Sub1_Sub4_1;

	@OriginalMember(owner = "client!nt", name = "n", descriptor = "S")
	public short aShort100;

	@OriginalMember(owner = "client!nt", name = "f", descriptor = "Lclient!wha;")
	public Class19_Sub1_Sub5 aClass19_Sub1_Sub5_1;

	@OriginalMember(owner = "client!nt", name = "e", descriptor = "Lclient!qca;")
	public Class19_Sub1_Sub2 aClass19_Sub1_Sub2_2;

	@OriginalMember(owner = "client!nt", name = "r", descriptor = "S")
	public short aShort101;

	@OriginalMember(owner = "client!nt", name = "p", descriptor = "Lclient!nt;")
	public Class262 aClass262_1;

	@OriginalMember(owner = "client!nt", name = "h", descriptor = "Lclient!sla;")
	public Class343 aClass343_2;

	@OriginalMember(owner = "client!nt", name = "d", descriptor = "B")
	public byte aByte113;

	static {
		for (@Pc(77) int local77 = 0; local77 < 256; local77++) {
			@Pc(86) char local86 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ\u2e4b﹗ᕷ㟥\u9ff0䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c\ufd4d鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(local77 / 2);
			@Pc(100) long local100 = (long) ((local77 & 0x1) == 0 ? local86 >>> 8 : local86 & 0xFF);
			@Pc(104) long local104 = local100 << 1;
			if (local104 >= 256L) {
				local104 ^= 0x11DL;
			}
			@Pc(118) long local118 = local104 << 1;
			if (local118 >= 256L) {
				local118 ^= 0x11DL;
			}
			@Pc(130) long local130 = local118 ^ local100;
			@Pc(134) long local134 = local118 << 1;
			if (local134 >= 256L) {
				local134 ^= 0x11DL;
			}
			@Pc(148) long local148 = local134 ^ local100;
			aLongArrayArray1[0][local77] = Static339.method4994(local148, Static339.method4994(Static339.method4994(Static339.method4994(local134 << 24, Static339.method4994(local100 << 32, Static339.method4994(local118 << 40, Static339.method4994(local100 << 56, local100 << 48)))), local130 << 16), local104 << 8));
			for (@Pc(184) int local184 = 1; local184 < 8; local184++) {
				aLongArrayArray1[local184][local77] = Static339.method4994(aLongArrayArray1[local184 - 1][local77] >>> 8, aLongArrayArray1[local184 - 1][local77] << 56);
			}
		}
		aLongArray20[0] = 0L;
		for (@Pc(225) int local225 = 1; local225 <= 10; local225++) {
			@Pc(232) int local232 = (local225 - 1) * 8;
			aLongArray20[local225] = Static364.method5204(Static590.method8099(aLongArrayArray1[7][local232 + 7], 255L), Static364.method5204(Static590.method8099(aLongArrayArray1[6][local232 + 6], 65280L), Static364.method5204(Static590.method8099(aLongArrayArray1[5][local232 + 5], 16711680L), Static364.method5204(Static590.method8099(aLongArrayArray1[4][local232 + 4], 4278190080L), Static364.method5204(Static590.method8099(aLongArrayArray1[3][local232 + 3], 1095216660480L), Static364.method5204(Static590.method8099(280375465082880L, aLongArrayArray1[2][local232 + 2]), Static364.method5204(Static590.method8099(aLongArrayArray1[0][local232], -72057594037927936L), Static590.method8099(aLongArrayArray1[1][local232 + 1], 71776119061217280L))))))));
		}
	}

	@OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(I)V")
	public Class262(@OriginalArg(0) int arg0) {
		this.aByte113 = (byte) arg0;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(B)V")
	public void method6396() {
		while (this.aClass343_2 != null) {
			@Pc(7) Class343 local7 = this.aClass343_2.aClass343_4;
			this.aClass343_2.method8101();
			this.aClass343_2 = local7;
		}
	}
}
