import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vu")
public final class Class3_Sub6_Sub38 extends Class3_Sub6 {

	@OriginalMember(owner = "client!vu", name = "C", descriptor = "[J")
	public static final long[] aLongArray16 = new long[11];

	@OriginalMember(owner = "client!vu", name = "G", descriptor = "[[J")
	public static final long[][] aLongArrayArray1 = new long[8][256];

	@OriginalMember(owner = "client!vu", name = "D", descriptor = "I")
	private int anInt9252;

	static {
		for (@Pc(8) int local8 = 0; local8 < 256; local8++) {
			@Pc(15) char local15 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ\u2e4b﹗ᕷ㟥\u9ff0䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c\ufd4d鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(local8 / 2);
			@Pc(28) long local28 = (long) ((local8 & 0x1) == 0 ? local15 >>> 8 : local15 & 0xFF);
			@Pc(32) long local32 = local28 << 1;
			if (local32 >= 256L) {
				local32 ^= 0x11DL;
			}
			@Pc(44) long local44 = local32 << 1;
			if (local44 >= 256L) {
				local44 ^= 0x11DL;
			}
			@Pc(58) long local58 = local44 ^ local28;
			@Pc(62) long local62 = local44 << 1;
			if (local62 >= 256L) {
				local62 ^= 0x11DL;
			}
			@Pc(76) long local76 = local62 ^ local28;
			aLongArrayArray1[0][local8] = Static315.method4620(local76, Static315.method4620(Static315.method4620(Static315.method4620(Static315.method4620(local28 << 32, Static315.method4620(Static315.method4620(local28 << 48, local28 << 56), local44 << 40)), local62 << 24), local58 << 16), local32 << 8));
			for (@Pc(112) int local112 = 1; local112 < 8; local112++) {
				aLongArrayArray1[local112][local8] = Static315.method4620(aLongArrayArray1[local112 - 1][local8] >>> 8, aLongArrayArray1[local112 - 1][local8] << 56);
			}
		}
		aLongArray16[0] = 0L;
		for (@Pc(153) int local153 = 1; local153 <= 10; local153++) {
			@Pc(160) int local160 = (local153 - 1) * 8;
			aLongArray16[local153] = Static581.method6765(Static581.method6765(Static504.method6795(65280L, aLongArrayArray1[6][local160 + 6]), Static581.method6765(Static581.method6765(Static504.method6795(4278190080L, aLongArrayArray1[4][local160 + 4]), Static581.method6765(Static581.method6765(Static504.method6795(aLongArrayArray1[2][local160 + 2], 280375465082880L), Static581.method6765(Static504.method6795(-72057594037927936L, aLongArrayArray1[0][local160]), Static504.method6795(aLongArrayArray1[1][local160 + 1], 71776119061217280L))), Static504.method6795(1095216660480L, aLongArrayArray1[3][local160 + 3]))), Static504.method6795(16711680L, aLongArrayArray1[5][local160 + 5]))), Static504.method6795(255L, aLongArrayArray1[7][local160 + 7]));
		}
	}

	@OriginalMember(owner = "client!vu", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub38() {
		this(4096);
	}

	@OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(I)V")
	public Class3_Sub6_Sub38(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt9252 = 4096;
		this.anInt9252 = arg0;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(ILclient!np;I)V")
	@Override
	public void method7771(@OriginalArg(1) Class3_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt9252 = (arg0.method5175() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7775(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass213_41.method4803(arg0);
		if (super.aClass213_41.aBoolean407) {
			Static601.method2820(local9, 0, Static521.anInt8383, this.anInt9252);
		}
		return local9;
	}
}
