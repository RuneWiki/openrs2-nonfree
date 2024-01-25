import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gn")
public final class Class127_Sub1_Sub1 extends Class127_Sub1 {

	@OriginalMember(owner = "client!gn", name = "Q", descriptor = "[[J")
	public static final long[][] aLongArrayArray1 = new long[8][256];

	@OriginalMember(owner = "client!gn", name = "R", descriptor = "[J")
	public static final long[] aLongArray5 = new long[11];

	@OriginalMember(owner = "client!gn", name = "P", descriptor = "[B")
	private byte[] aByteArray38;

	static {
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(26) char local26 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ\u2e4b﹗ᕷ㟥\u9ff0䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c\ufd4d鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(local19 / 2);
			@Pc(39) long local39 = (long) ((local19 & 0x1) == 0 ? local26 >>> 8 : local26 & 0xFF);
			@Pc(43) long local43 = local39 << 1;
			if (local43 >= 256L) {
				local43 ^= 0x11DL;
			}
			@Pc(57) long local57 = local43 << 1;
			if (local57 >= 256L) {
				local57 ^= 0x11DL;
			}
			@Pc(71) long local71 = local39 ^ local57;
			@Pc(75) long local75 = local57 << 1;
			if (local75 >= 256L) {
				local75 ^= 0x11DL;
			}
			@Pc(89) long local89 = local75 ^ local39;
			aLongArrayArray1[0][local19] = Static347.method5186(Static347.method5186(Static347.method5186(Static347.method5186(Static347.method5186(Static347.method5186(Static347.method5186(local39 << 56, local39 << 48), local57 << 40), local39 << 32), local75 << 24), local71 << 16), local43 << 8), local89);
			for (@Pc(125) int local125 = 1; local125 < 8; local125++) {
				aLongArrayArray1[local125][local19] = Static347.method5186(aLongArrayArray1[local125 - 1][local19] >>> 8, aLongArrayArray1[local125 - 1][local19] << 56);
			}
		}
		aLongArray5[0] = 0L;
		for (@Pc(168) int local168 = 1; local168 <= 10; local168++) {
			@Pc(175) int local175 = local168 * 8 - 8;
			aLongArray5[local168] = Static295.method7106(Static114.method1696(255L, aLongArrayArray1[7][local175 + 7]), Static295.method7106(Static114.method1696(65280L, aLongArrayArray1[6][local175 + 6]), Static295.method7106(Static295.method7106(Static295.method7106(Static114.method1696(1095216660480L, aLongArrayArray1[3][local175 + 3]), Static295.method7106(Static295.method7106(Static114.method1696(-72057594037927936L, aLongArrayArray1[0][local175]), Static114.method1696(aLongArrayArray1[1][local175 + 1], 71776119061217280L)), Static114.method1696(280375465082880L, aLongArrayArray1[2][local175 + 2]))), Static114.method1696(4278190080L, aLongArrayArray1[4][local175 + 4])), Static114.method1696(aLongArrayArray1[5][local175 + 5], 16711680L))));
		}
	}

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "()V")
	public Class127_Sub1_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIII)[B")
	public byte[] method3055() {
		this.aByteArray38 = new byte[524288];
		this.method7972();
		return this.aByteArray38;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(BIZ)V")
	@Override
	protected void method4131(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg1 * 2;
		@Pc(16) int local16 = arg0 & 0xFF;
		@Pc(19) int local19 = local12;
		@Pc(20) int local20 = local12 + 1;
		this.aByteArray38[local19] = (byte) (local16 * 3 >> 5);
		this.aByteArray38[local20] = (byte) (local16 * 3 >> 5);
	}
}
