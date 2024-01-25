import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class94_Sub1 extends Class94 implements Interface16 {

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "[J")
	public static final long[] aLongArray5 = new long[11];

	@OriginalMember(owner = "client!fb", name = "j", descriptor = "[[J")
	public static final long[][] aLongArrayArray1 = new long[8][256];

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
	private int anInt2934;

	static {
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			@Pc(20) char local20 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ\u2e4b﹗ᕷ㟥\u9ff0䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c\ufd4d鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(local13 / 2);
			@Pc(33) long local33 = (long) ((local13 & 0x1) == 0 ? local20 >>> 8 : local20 & 0xFF);
			@Pc(37) long local37 = local33 << 1;
			if (local37 >= 256L) {
				local37 ^= 0x11DL;
			}
			@Pc(49) long local49 = local37 << 1;
			if (local49 >= 256L) {
				local49 ^= 0x11DL;
			}
			@Pc(61) long local61 = local33 ^ local49;
			@Pc(65) long local65 = local49 << 1;
			if (local65 >= 256L) {
				local65 ^= 0x11DL;
			}
			@Pc(79) long local79 = local33 ^ local65;
			aLongArrayArray1[0][local13] = Static448.method7004(Static448.method7004(local37 << 8, Static448.method7004(Static448.method7004(Static448.method7004(Static448.method7004(Static448.method7004(local33 << 48, local33 << 56), local49 << 40), local33 << 32), local65 << 24), local61 << 16)), local79);
			for (@Pc(115) int local115 = 1; local115 < 8; local115++) {
				aLongArrayArray1[local115][local13] = Static448.method7004(aLongArrayArray1[local115 - 1][local13] << 56, aLongArrayArray1[local115 - 1][local13] >>> 8);
			}
		}
		aLongArray5[0] = 0L;
		for (@Pc(158) int local158 = 1; local158 <= 10; local158++) {
			@Pc(165) int local165 = (local158 - 1) * 8;
			aLongArray5[local158] = Static36.method1093(Static227.method3887(aLongArrayArray1[7][local165 + 7], 255L), Static36.method1093(Static227.method3887(65280L, aLongArrayArray1[6][local165 + 6]), Static36.method1093(Static227.method3887(aLongArrayArray1[5][local165 + 5], 16711680L), Static36.method1093(Static227.method3887(aLongArrayArray1[4][local165 + 4], 4278190080L), Static36.method1093(Static227.method3887(aLongArrayArray1[3][local165 + 3], 1095216660480L), Static36.method1093(Static36.method1093(Static227.method3887(-72057594037927936L, aLongArrayArray1[0][local165]), Static227.method3887(aLongArrayArray1[1][local165 + 1], 71776119061217280L)), Static227.method3887(aLongArrayArray1[2][local165 + 2], 280375465082880L)))))));
		}
	}

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lclient!ji;I[BI)V")
	public Class94_Sub1(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt2934 = arg1;
	}

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lclient!ji;ILclient!jaclib/memory/Buffer;)V")
	public Class94_Sub1(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt2934 = arg1;
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)J")
	@Override
	public long method7028() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)I")
	@Override
	public int method7025() {
		return this.anInt2934;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(II[BI)V")
	@Override
	public void method7026(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		this.method7915(arg1, arg0);
		this.anInt2934 = arg2;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)I")
	@Override
	public int method7027() {
		return 0;
	}
}
