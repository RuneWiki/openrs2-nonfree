import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class12 {

	@OriginalMember(owner = "client!ag", name = "h", descriptor = "[[J")
	public static final long[][] aLongArrayArray1 = new long[8][256];

	@OriginalMember(owner = "client!ag", name = "g", descriptor = "[J")
	public static final long[] aLongArray6 = new long[11];

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "Lclient!ida;")
	public Interface10 anInterface10_1;

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "Lclient!ida;")
	public Interface10 anInterface10_2;

	@OriginalMember(owner = "client!ag", name = "i", descriptor = "Z")
	public boolean aBoolean23;

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "Z")
	public boolean aBoolean22;

	static {
		for (@Pc(8) int local8 = 0; local8 < 256; local8++) {
			@Pc(15) char local15 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ\u2e4b﹗ᕷ㟥\u9ff0䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c\ufd4d鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(local8 / 2);
			@Pc(28) long local28 = (long) ((local8 & 0x1) == 0 ? local15 >>> 8 : local15 & 0xFF);
			@Pc(32) long local32 = local28 << 1;
			if (local32 >= 256L) {
				local32 ^= 0x11DL;
			}
			@Pc(46) long local46 = local32 << 1;
			if (local46 >= 256L) {
				local46 ^= 0x11DL;
			}
			@Pc(60) long local60 = local46 ^ local28;
			@Pc(64) long local64 = local46 << 1;
			if (local64 >= 256L) {
				local64 ^= 0x11DL;
			}
			@Pc(76) long local76 = local28 ^ local64;
			aLongArrayArray1[0][local8] = Static515.method7241(local76, Static515.method7241(Static515.method7241(local60 << 16, Static515.method7241(Static515.method7241(local28 << 32, Static515.method7241(local46 << 40, Static515.method7241(local28 << 56, local28 << 48))), local64 << 24)), local32 << 8));
			for (@Pc(112) int local112 = 1; local112 < 8; local112++) {
				aLongArrayArray1[local112][local8] = Static515.method7241(aLongArrayArray1[local112 - 1][local8] >>> 8, aLongArrayArray1[local112 - 1][local8] << 56);
			}
		}
		aLongArray6[0] = 0L;
		for (@Pc(155) int local155 = 1; local155 <= 10; local155++) {
			@Pc(162) int local162 = (local155 - 1) * 8;
			aLongArray6[local155] = Static118.method2466(Static118.method2466(Static118.method2466(Static118.method2466(Static118.method2466(Static118.method2466(Static118.method2466(Static574.method7884(aLongArrayArray1[1][local162 + 1], 71776119061217280L), Static574.method7884(aLongArrayArray1[0][local162], -72057594037927936L)), Static574.method7884(280375465082880L, aLongArrayArray1[2][local162 + 2])), Static574.method7884(1095216660480L, aLongArrayArray1[3][local162 + 3])), Static574.method7884(4278190080L, aLongArrayArray1[4][local162 + 4])), Static574.method7884(16711680L, aLongArrayArray1[5][local162 + 5])), Static574.method7884(aLongArrayArray1[6][local162 + 6], 65280L)), Static574.method7884(255L, aLongArrayArray1[7][local162 + 7]));
		}
	}

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Z)V")
	public Class12(@OriginalArg(0) boolean arg0) {
		this.aBoolean22 = arg0;
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)V")
	public void method286() {
		if (this.anInterface10_1 != null) {
			this.anInterface10_1.method7671();
		}
		this.aBoolean23 = false;
	}

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "(I)Z")
	public boolean method287() {
		return this.aBoolean23 && !this.aBoolean22;
	}
}
