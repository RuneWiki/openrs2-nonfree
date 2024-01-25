import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aca")
public final class Class6 implements Runnable {

	@OriginalMember(owner = "client!aca", name = "i", descriptor = "[[J")
	public static final long[][] aLongArrayArray1 = new long[8][256];

	@OriginalMember(owner = "client!aca", name = "k", descriptor = "[J")
	public static final long[] aLongArray1 = new long[11];

	@OriginalMember(owner = "client!aca", name = "f", descriptor = "Lclient!tga;")
	public Class349 aClass349_1;

	@OriginalMember(owner = "client!aca", name = "e", descriptor = "[Lclient!eca;")
	public final Class45[] aClass45Array1 = new Class45[2];

	@OriginalMember(owner = "client!aca", name = "m", descriptor = "Z")
	public volatile boolean aBoolean7 = false;

	@OriginalMember(owner = "client!aca", name = "h", descriptor = "Z")
	public volatile boolean aBoolean8 = false;

	static {
		for (@Pc(93) int local93 = 0; local93 < 256; local93++) {
			@Pc(102) char local102 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ\u2e4b﹗ᕷ㟥\u9ff0䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c\ufd4d鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(local93 / 2);
			@Pc(119) long local119 = (long) ((local93 & 0x1) == 0 ? local102 >>> 8 : local102 & 0xFF);
			@Pc(123) long local123 = local119 << 1;
			if (local123 >= 256L) {
				local123 ^= 0x11DL;
			}
			@Pc(137) long local137 = local123 << 1;
			if (local137 >= 256L) {
				local137 ^= 0x11DL;
			}
			@Pc(149) long local149 = local119 ^ local137;
			@Pc(153) long local153 = local137 << 1;
			if (local153 >= 256L) {
				local153 ^= 0x11DL;
			}
			@Pc(165) long local165 = local119 ^ local153;
			aLongArrayArray1[0][local93] = Static248.method3974(local165, Static248.method3974(Static248.method3974(local149 << 16, Static248.method3974(local153 << 24, Static248.method3974(local119 << 32, Static248.method3974(Static248.method3974(local119 << 48, local119 << 56), local137 << 40)))), local123 << 8));
			for (@Pc(201) int local201 = 1; local201 < 8; local201++) {
				aLongArrayArray1[local201][local93] = Static248.method3974(aLongArrayArray1[local201 - 1][local93] >>> 8, aLongArrayArray1[local201 - 1][local93] << 56);
			}
		}
		aLongArray1[0] = 0L;
		for (@Pc(242) int local242 = 1; local242 <= 10; local242++) {
			@Pc(249) int local249 = local242 * 8 - 8;
			aLongArray1[local242] = Static92.method8232(Static646.method8929(aLongArrayArray1[7][local249 + 7], 255L), Static92.method8232(Static92.method8232(Static646.method8929(aLongArrayArray1[5][local249 + 5], 16711680L), Static92.method8232(Static646.method8929(aLongArrayArray1[4][local249 + 4], 4278190080L), Static92.method8232(Static646.method8929(aLongArrayArray1[3][local249 + 3], 1095216660480L), Static92.method8232(Static646.method8929(280375465082880L, aLongArrayArray1[2][local249 + 2]), Static92.method8232(Static646.method8929(-72057594037927936L, aLongArrayArray1[0][local249]), Static646.method8929(aLongArrayArray1[1][local249 + 1], 71776119061217280L)))))), Static646.method8929(aLongArrayArray1[6][local249 + 6], 65280L)));
		}
	}

	@OriginalMember(owner = "client!aca", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean8 = true;
		try {
			while (!this.aBoolean7) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(21) Class45 local21 = this.aClass45Array1[local12];
					if (local21 != null) {
						local21.method7454();
					}
				}
				Static620.method7045(-4, 10L);
				Static266.method4313(this.aClass349_1, (Object) null);
			}
		} catch (@Pc(49) Exception local49) {
			Static522.method7115(local49, (String) null);
		} finally {
			@Pc(59) Object local59 = null;
			this.aBoolean8 = false;
		}
	}
}
