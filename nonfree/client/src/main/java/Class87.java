import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tia")
public abstract class Class87 {

	@OriginalMember(owner = "client!tia", name = "e", descriptor = "[J")
	public static final long[] aLongArray19 = new long[11];

	@OriginalMember(owner = "client!tia", name = "d", descriptor = "[[J")
	public static final long[][] aLongArrayArray4 = new long[8][256];

	static {
		for (@Pc(35) int local35 = 0; local35 < 256; local35++) {
			@Pc(44) char local44 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ\u2e4b﹗ᕷ㟥\u9ff0䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c\ufd4d鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(local35 / 2);
			@Pc(58) long local58 = (long) ((local35 & 0x1) == 0 ? local44 >>> 8 : local44 & 0xFF);
			@Pc(62) long local62 = local58 << 1;
			if (local62 >= 256L) {
				local62 ^= 0x11DL;
			}
			@Pc(74) long local74 = local62 << 1;
			if (local74 >= 256L) {
				local74 ^= 0x11DL;
			}
			@Pc(86) long local86 = local58 ^ local74;
			@Pc(90) long local90 = local74 << 1;
			if (local90 >= 256L) {
				local90 ^= 0x11DL;
			}
			@Pc(104) long local104 = local90 ^ local58;
			aLongArrayArray4[0][local35] = Static441.method5860(Static441.method5860(Static441.method5860(Static441.method5860(Static441.method5860(Static441.method5860(Static441.method5860(local58 << 56, local58 << 48), local74 << 40), local58 << 32), local90 << 24), local86 << 16), local62 << 8), local104);
			for (@Pc(140) int local140 = 1; local140 < 8; local140++) {
				aLongArrayArray4[local140][local35] = Static441.method5860(aLongArrayArray4[local140 - 1][local35] << 56, aLongArrayArray4[local140 - 1][local35] >>> 8);
			}
		}
		aLongArray19[0] = 0L;
		for (@Pc(183) int local183 = 1; local183 <= 10; local183++) {
			@Pc(190) int local190 = local183 * 8 - 8;
			aLongArray19[local183] = Static83.method9515(Static83.method9515(Static582.method7519(aLongArrayArray4[6][local190 + 6], 65280L), Static83.method9515(Static582.method7519(aLongArrayArray4[5][local190 + 5], 16711680L), Static83.method9515(Static582.method7519(aLongArrayArray4[4][local190 + 4], 4278190080L), Static83.method9515(Static83.method9515(Static582.method7519(280375465082880L, aLongArrayArray4[2][local190 + 2]), Static83.method9515(Static582.method7519(aLongArrayArray4[1][local190 + 1], 71776119061217280L), Static582.method7519(-72057594037927936L, aLongArrayArray4[0][local190]))), Static582.method7519(aLongArrayArray4[3][local190 + 3], 1095216660480L))))), Static582.method7519(aLongArrayArray4[7][local190 + 7], 255L));
		}
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(JB)I")
	protected abstract int method6744(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(JZ)I")
	public final int method6746(@OriginalArg(0) long arg0) {
		@Pc(7) long local7 = this.method6749();
		if (local7 > 0L) {
			Static550.method7219(local7);
		}
		return this.method6744(arg0);
	}

	@OriginalMember(owner = "client!tia", name = "b", descriptor = "(I)V")
	public abstract void method6747();

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(Z)J")
	protected abstract long method6749();

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(I)J")
	public abstract long method6750();
}
