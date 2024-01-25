import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public final class Class113 {

	@OriginalMember(owner = "client!fm", name = "l", descriptor = "[J")
	public static final long[] aLongArray8 = new long[11];

	@OriginalMember(owner = "client!fm", name = "m", descriptor = "[[J")
	public static final long[][] aLongArrayArray1 = new long[8][256];

	@OriginalMember(owner = "client!fm", name = "j", descriptor = "I")
	public int anInt3144 = 0;

	@OriginalMember(owner = "client!fm", name = "g", descriptor = "I")
	public int anInt3141 = 0;

	@OriginalMember(owner = "client!fm", name = "d", descriptor = "Lclient!fba;")
	private final Class102 aClass102_20 = new Class102(64);

	@OriginalMember(owner = "client!fm", name = "n", descriptor = "Lclient!sd;")
	private Interface20 anInterface20_1 = null;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "Lclient!la;")
	private final Class196 aClass196_33;

	@OriginalMember(owner = "client!fm", name = "k", descriptor = "Lclient!la;")
	private final Class196 aClass196_34;

	static {
		for (@Pc(17) int local17 = 0; local17 < 256; local17++) {
			@Pc(24) char local24 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ\u2e4b﹗ᕷ㟥\u9ff0䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c\ufd4d鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(local17 / 2);
			@Pc(40) long local40 = (long) ((local17 & 0x1) == 0 ? local24 >>> 8 : local24 & 0xFF);
			@Pc(44) long local44 = local40 << 1;
			if (local44 >= 256L) {
				local44 ^= 0x11DL;
			}
			@Pc(58) long local58 = local44 << 1;
			if (local58 >= 256L) {
				local58 ^= 0x11DL;
			}
			@Pc(70) long local70 = local58 ^ local40;
			@Pc(74) long local74 = local58 << 1;
			if (local74 >= 256L) {
				local74 ^= 0x11DL;
			}
			@Pc(88) long local88 = local74 ^ local40;
			aLongArrayArray1[0][local17] = Static372.method3459(local88, Static372.method3459(local44 << 8, Static372.method3459(Static372.method3459(local74 << 24, Static372.method3459(Static372.method3459(local58 << 40, Static372.method3459(local40 << 48, local40 << 56)), local40 << 32)), local70 << 16)));
			for (@Pc(124) int local124 = 1; local124 < 8; local124++) {
				aLongArrayArray1[local124][local17] = Static372.method3459(aLongArrayArray1[local124 - 1][local17] >>> 8, aLongArrayArray1[local124 - 1][local17] << 56);
			}
		}
		aLongArray8[0] = 0L;
		for (@Pc(165) int local165 = 1; local165 <= 10; local165++) {
			@Pc(172) int local172 = (local165 - 1) * 8;
			aLongArray8[local165] = Static266.method4391(Static266.method4391(Static266.method4391(Static416.method6560(16711680L, aLongArrayArray1[5][local172 + 5]), Static266.method4391(Static416.method6560(aLongArrayArray1[4][local172 + 4], 4278190080L), Static266.method4391(Static416.method6560(aLongArrayArray1[3][local172 + 3], 1095216660480L), Static266.method4391(Static416.method6560(aLongArrayArray1[2][local172 + 2], 280375465082880L), Static266.method4391(Static416.method6560(aLongArrayArray1[1][local172 + 1], 71776119061217280L), Static416.method6560(-72057594037927936L, aLongArrayArray1[0][local172])))))), Static416.method6560(aLongArrayArray1[6][local172 + 6], 65280L)), Static416.method6560(255L, aLongArrayArray1[7][local172 + 7]));
		}
	}

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(ILclient!la;Lclient!la;Lclient!sd;)V")
	public Class113(@OriginalArg(0) int arg0, @OriginalArg(1) Class196 arg1, @OriginalArg(2) Class196 arg2, @OriginalArg(3) Interface20 arg3) {
		this.aClass196_33 = arg2;
		this.aClass196_34 = arg1;
		this.anInterface20_1 = arg3;
		if (this.aClass196_34 != null) {
			this.anInt3144 = this.aClass196_34.method5118(1);
		}
		if (this.aClass196_33 != null) {
			this.anInt3141 = this.aClass196_33.method5118(1);
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!dj;[IJB)Ljava/lang/String;")
	public String method2866(@OriginalArg(0) Class74 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) long arg2) {
		if (this.anInterface20_1 != null) {
			@Pc(14) String local14 = this.anInterface20_1.method2077(arg2, arg1, arg0);
			if (local14 != null) {
				return local14;
			}
		}
		return Long.toString(arg2);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)Lclient!ks;")
	public Class3_Sub4_Sub16 method2868(@OriginalArg(0) int arg0) {
		@Pc(11) Class3_Sub4_Sub16 local11 = (Class3_Sub4_Sub16) this.aClass102_20.method2677((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(25) byte[] local25;
		if (arg0 < 32768) {
			local25 = this.aClass196_34.method5102(1, arg0);
		} else {
			local25 = this.aClass196_33.method5102(1, arg0 & 0x7FFF);
		}
		local11 = new Class3_Sub4_Sub16();
		local11.aClass113_1 = this;
		if (local25 != null) {
			local11.method4830(new Class3_Sub3(local25));
		}
		if (arg0 >= 32768) {
			local11.method4831();
		}
		this.aClass102_20.method2674((long) arg0, local11);
		return local11;
	}
}
