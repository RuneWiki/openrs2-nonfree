import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gw")
public final class Class43_Sub10 extends Class43 {

	@OriginalMember(owner = "client!gw", name = "k", descriptor = "[J")
	public static final long[] aLongArray14 = new long[11];

	@OriginalMember(owner = "client!gw", name = "l", descriptor = "[[J")
	public static final long[][] aLongArrayArray1 = new long[8][256];

	static {
		for (@Pc(71) int local71 = 0; local71 < 256; local71++) {
			@Pc(80) char local80 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ\u2e4b﹗ᕷ㟥\u9ff0䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c\ufd4d鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(local71 / 2);
			@Pc(97) long local97 = (long) ((local71 & 0x1) == 0 ? local80 >>> 8 : local80 & 0xFF);
			@Pc(101) long local101 = local97 << 1;
			if (local101 >= 256L) {
				local101 ^= 0x11DL;
			}
			@Pc(113) long local113 = local101 << 1;
			if (local113 >= 256L) {
				local113 ^= 0x11DL;
			}
			@Pc(127) long local127 = local97 ^ local113;
			@Pc(131) long local131 = local113 << 1;
			if (local131 >= 256L) {
				local131 ^= 0x11DL;
			}
			@Pc(143) long local143 = local131 ^ local97;
			aLongArrayArray1[0][local71] = Static93.method1576(local143, Static93.method1576(Static93.method1576(local127 << 16, Static93.method1576(Static93.method1576(local97 << 32, Static93.method1576(local113 << 40, Static93.method1576(local97 << 56, local97 << 48))), local131 << 24)), local101 << 8));
			for (@Pc(179) int local179 = 1; local179 < 8; local179++) {
				aLongArrayArray1[local179][local71] = Static93.method1576(aLongArrayArray1[local179 - 1][local71] >>> 8, aLongArrayArray1[local179 - 1][local71] << 56);
			}
		}
		aLongArray14[0] = 0L;
		for (@Pc(224) int local224 = 1; local224 <= 10; local224++) {
			@Pc(231) int local231 = (local224 - 1) * 8;
			aLongArray14[local224] = Static669.method9281(Static669.method9281(Static669.method9281(Static669.method9281(Static669.method9281(Static669.method9281(Static669.method9281(Static190.method2833(-72057594037927936L, aLongArrayArray1[0][local231]), Static190.method2833(aLongArrayArray1[1][local231 + 1], 71776119061217280L)), Static190.method2833(280375465082880L, aLongArrayArray1[2][local231 + 2])), Static190.method2833(aLongArrayArray1[3][local231 + 3], 1095216660480L)), Static190.method2833(aLongArrayArray1[4][local231 + 4], 4278190080L)), Static190.method2833(16711680L, aLongArrayArray1[5][local231 + 5])), Static190.method2833(aLongArrayArray1[6][local231 + 6], 65280L)), Static190.method2833(aLongArrayArray1[7][local231 + 7], 255L));
		}
	}

	@OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(ILclient!lha;)V")
	public Class43_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub26 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(Lclient!lha;)V")
	public Class43_Sub10(@OriginalArg(0) Class14_Sub26 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Z)I")
	public int method3094() {
		return super.anInt10397;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(II)V")
	@Override
	protected void method8893(@OriginalArg(1) int arg0) {
		super.anInt10397 = arg0;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)I")
	@Override
	protected int method8889() {
		return 1;
	}

	@OriginalMember(owner = "client!gw", name = "c", descriptor = "(II)I")
	@Override
	public int method8894(@OriginalArg(0) int arg0) {
		return Static461.method6793(super.aClass14_Sub26_32.aClass43_Sub1_1.method801()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "(I)Z")
	public boolean method3096() {
		return Static461.method6793(super.aClass14_Sub26_32.aClass43_Sub1_1.method801());
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "(B)V")
	@Override
	public void method8892() {
		if (super.anInt10397 < 0 || super.anInt10397 > 1) {
			super.anInt10397 = this.method8889();
		}
	}
}
