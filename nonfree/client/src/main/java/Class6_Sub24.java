import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tk")
public final class Class6_Sub24 extends Class6 {

	@OriginalMember(owner = "client!tk", name = "m", descriptor = "[J")
	public static final long[] aLongArray45 = new long[11];

	@OriginalMember(owner = "client!tk", name = "i", descriptor = "[[J")
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
			@Pc(61) long local61 = local31 ^ local47;
			@Pc(65) long local65 = local47 << 1;
			if (local65 >= 256L) {
				local65 ^= 0x11DL;
			}
			@Pc(79) long local79 = local31 ^ local65;
			aLongArrayArray1[0][local8] = Static151.method2244(local79, Static151.method2244(local35 << 8, Static151.method2244(local61 << 16, Static151.method2244(local65 << 24, Static151.method2244(Static151.method2244(local47 << 40, Static151.method2244(local31 << 56, local31 << 48)), local31 << 32)))));
			for (@Pc(115) int local115 = 1; local115 < 8; local115++) {
				aLongArrayArray1[local115][local8] = Static151.method2244(aLongArrayArray1[local115 - 1][local8] >>> 8, aLongArrayArray1[local115 - 1][local8] << 56);
			}
		}
		aLongArray45[0] = 0L;
		for (@Pc(156) int local156 = 1; local156 <= 10; local156++) {
			@Pc(163) int local163 = (local156 - 1) * 8;
			aLongArray45[local156] = Static49.method7190(Static49.method7190(Static452.method6141(aLongArrayArray1[6][local163 + 6], 65280L), Static49.method7190(Static452.method6141(16711680L, aLongArrayArray1[5][local163 + 5]), Static49.method7190(Static49.method7190(Static452.method6141(aLongArrayArray1[3][local163 + 3], 1095216660480L), Static49.method7190(Static49.method7190(Static452.method6141(aLongArrayArray1[1][local163 + 1], 71776119061217280L), Static452.method6141(aLongArrayArray1[0][local163], -72057594037927936L)), Static452.method6141(280375465082880L, aLongArrayArray1[2][local163 + 2]))), Static452.method6141(aLongArrayArray1[4][local163 + 4], 4278190080L)))), Static452.method6141(255L, aLongArrayArray1[7][local163 + 7]));
		}
	}

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(ILclient!ah;)V")
	public Class6_Sub24(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub5 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lclient!ah;)V")
	public Class6_Sub24(@OriginalArg(0) Class2_Sub5 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(Z)Z")
	public boolean method7572() {
		return !super.aClass2_Sub5_50.method179();
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z)V")
	@Override
	public void method8576() {
		if (super.aClass2_Sub5_50.method179()) {
			super.anInt10283 = 0;
		}
		if (super.anInt10283 < 0 || super.anInt10283 > 2) {
			super.anInt10283 = this.method8572();
		}
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(II)V")
	@Override
	protected void method8577(@OriginalArg(0) int arg0) {
		super.anInt10283 = arg0;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)I")
	@Override
	public int method8573(@OriginalArg(0) int arg0) {
		return super.aClass2_Sub5_50.method179() ? 3 : 1;
	}

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "(I)I")
	public int method7575() {
		return super.anInt10283;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)I")
	@Override
	protected int method8572() {
		return 2;
	}
}
