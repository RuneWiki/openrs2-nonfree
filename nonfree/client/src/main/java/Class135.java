import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gu")
public final class Class135 {

	@OriginalMember(owner = "client!gu", name = "m", descriptor = "[[J")
	public static final long[][] aLongArrayArray1 = new long[8][256];

	@OriginalMember(owner = "client!gu", name = "h", descriptor = "[J")
	public static final long[] aLongArray6 = new long[11];

	@OriginalMember(owner = "client!gu", name = "p", descriptor = "I")
	public int anInt3633;

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "Lclient!gw;")
	private final Class136 aClass136_28 = new Class136(64);

	@OriginalMember(owner = "client!gu", name = "n", descriptor = "Lclient!gw;")
	public final Class136 aClass136_29 = new Class136(60);

	@OriginalMember(owner = "client!gu", name = "e", descriptor = "Lclient!uu;")
	private final Class343 aClass343_99;

	@OriginalMember(owner = "client!gu", name = "l", descriptor = "Lclient!uu;")
	public final Class343 aClass343_100;

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
			@Pc(58) long local58 = local28 ^ local46;
			@Pc(62) long local62 = local46 << 1;
			if (local62 >= 256L) {
				local62 ^= 0x11DL;
			}
			@Pc(74) long local74 = local28 ^ local62;
			aLongArrayArray1[0][local8] = Static175.method2893(Static175.method2893(Static175.method2893(Static175.method2893(local62 << 24, Static175.method2893(Static175.method2893(local46 << 40, Static175.method2893(local28 << 48, local28 << 56)), local28 << 32)), local58 << 16), local32 << 8), local74);
			for (@Pc(110) int local110 = 1; local110 < 8; local110++) {
				aLongArrayArray1[local110][local8] = Static175.method2893(aLongArrayArray1[local110 - 1][local8] >>> 8, aLongArrayArray1[local110 - 1][local8] << 56);
			}
		}
		aLongArray6[0] = 0L;
		for (@Pc(151) int local151 = 1; local151 <= 10; local151++) {
			@Pc(158) int local158 = (local151 - 1) * 8;
			aLongArray6[local151] = Static356.method5753(Static465.method6887(255L, aLongArrayArray1[7][local158 + 7]), Static356.method5753(Static465.method6887(aLongArrayArray1[6][local158 + 6], 65280L), Static356.method5753(Static356.method5753(Static356.method5753(Static356.method5753(Static356.method5753(Static465.method6887(aLongArrayArray1[1][local158 + 1], 71776119061217280L), Static465.method6887(-72057594037927936L, aLongArrayArray1[0][local158])), Static465.method6887(280375465082880L, aLongArrayArray1[2][local158 + 2])), Static465.method6887(aLongArrayArray1[3][local158 + 3], 1095216660480L)), Static465.method6887(4278190080L, aLongArrayArray1[4][local158 + 4])), Static465.method6887(16711680L, aLongArrayArray1[5][local158 + 5]))));
		}
	}

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Lclient!gp;ILclient!uu;Lclient!uu;)V")
	public Class135(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class343 arg2, @OriginalArg(3) Class343 arg3) {
		this.aClass343_99 = arg2;
		this.aClass343_100 = arg3;
		@Pc(26) int local26 = this.aClass343_99.method8144() - 1;
		this.aClass343_99.method8157(local26);
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(I)V")
	public void method3102() {
		@Pc(10) Class136 local10 = this.aClass136_28;
		synchronized (this.aClass136_28) {
			this.aClass136_28.method3142();
		}
		local10 = this.aClass136_29;
		synchronized (this.aClass136_29) {
			this.aClass136_29.method3142();
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IB)V")
	public void method3103(@OriginalArg(0) int arg0) {
		this.anInt3633 = arg0;
		@Pc(9) Class136 local9 = this.aClass136_29;
		synchronized (this.aClass136_29) {
			this.aClass136_29.method3142();
		}
	}

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "(I)V")
	public void method3104() {
		@Pc(10) Class136 local10 = this.aClass136_28;
		synchronized (this.aClass136_28) {
			this.aClass136_28.method3138();
		}
		local10 = this.aClass136_29;
		synchronized (this.aClass136_29) {
			this.aClass136_29.method3138();
		}
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(IB)V")
	public void method3106() {
		@Pc(2) Class136 local2 = this.aClass136_28;
		synchronized (this.aClass136_28) {
			this.aClass136_28.method3132(5);
		}
		local2 = this.aClass136_29;
		synchronized (this.aClass136_29) {
			this.aClass136_29.method3132(5);
		}
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(II)Lclient!ll;")
	public Class207 method3108(@OriginalArg(1) int arg0) {
		@Pc(6) Class136 local6 = this.aClass136_28;
		@Pc(16) Class207 local16;
		synchronized (this.aClass136_28) {
			local16 = (Class207) this.aClass136_28.method3134((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class343 local29 = this.aClass343_99;
		@Pc(44) byte[] local44;
		synchronized (this.aClass343_99) {
			local44 = this.aClass343_99.method8132(Static459.method6827(arg0), Static585.method8124(arg0));
		}
		local16 = new Class207();
		local16.aClass135_2 = this;
		local16.anInt6224 = arg0;
		if (local44 != null) {
			local16.method5374(new Class3_Sub9(local44));
		}
		@Pc(72) Class136 local72 = this.aClass136_28;
		synchronized (this.aClass136_28) {
			this.aClass136_28.method3135(local16, (long) arg0);
			return local16;
		}
	}
}
