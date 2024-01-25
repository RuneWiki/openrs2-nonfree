import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uja")
public final class Class107_Sub4 extends Class107 implements Interface10 {

	@OriginalMember(owner = "client!uja", name = "G", descriptor = "[J")
	public static final long[] aLongArray21 = new long[11];

	@OriginalMember(owner = "client!uja", name = "P", descriptor = "[[J")
	public static final long[][] aLongArrayArray1 = new long[8][256];

	@OriginalMember(owner = "client!uja", name = "O", descriptor = "I")
	private final int anInt10626;

	@OriginalMember(owner = "client!uja", name = "E", descriptor = "I")
	private final int anInt10618;

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
			@Pc(61) long local61 = local47 ^ local31;
			@Pc(65) long local65 = local47 << 1;
			if (local65 >= 256L) {
				local65 ^= 0x11DL;
			}
			@Pc(79) long local79 = local65 ^ local31;
			aLongArrayArray1[0][local8] = Static408.method6720(local79, Static408.method6720(Static408.method6720(local61 << 16, Static408.method6720(Static408.method6720(Static408.method6720(local47 << 40, Static408.method6720(local31 << 48, local31 << 56)), local31 << 32), local65 << 24)), local35 << 8));
			for (@Pc(115) int local115 = 1; local115 < 8; local115++) {
				aLongArrayArray1[local115][local8] = Static408.method6720(aLongArrayArray1[local115 - 1][local8] >>> 8, aLongArrayArray1[local115 - 1][local8] << 56);
			}
		}
		aLongArray21[0] = 0L;
		for (@Pc(158) int local158 = 1; local158 <= 10; local158++) {
			@Pc(165) int local165 = local158 * 8 - 8;
			aLongArray21[local158] = Static578.method6235(Static430.method7040(255L, aLongArrayArray1[7][local165 + 7]), Static578.method6235(Static430.method7040(65280L, aLongArrayArray1[6][local165 + 6]), Static578.method6235(Static578.method6235(Static430.method7040(aLongArrayArray1[4][local165 + 4], 4278190080L), Static578.method6235(Static578.method6235(Static578.method6235(Static430.method7040(-72057594037927936L, aLongArrayArray1[0][local165]), Static430.method7040(aLongArrayArray1[1][local165 + 1], 71776119061217280L)), Static430.method7040(aLongArrayArray1[2][local165 + 2], 280375465082880L)), Static430.method7040(1095216660480L, aLongArrayArray1[3][local165 + 3]))), Static430.method7040(aLongArrayArray1[5][local165 + 5], 16711680L))));
		}
	}

	@OriginalMember(owner = "client!uja", name = "<init>", descriptor = "(Lclient!fc;Lclient!nea;IIZ[FII)V")
	public Class107_Sub4(@OriginalArg(0) Class101_Sub1_Sub1 arg0, @OriginalArg(1) Class244 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static114.aClass79_11, arg3 * arg2, arg4);
		this.anInt10626 = arg3;
		this.anInt10618 = arg2;
		super.aClass101_Sub1_Sub1_12.method5909(this);
		if (arg4) {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(super.anInt10614, 0, this.method9092(), arg2, arg3, 0, Static410.method6767(super.aClass244_14), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else {
			this.method9095(arg3, arg2, super.anInt10614, arg5);
		}
	}

	@OriginalMember(owner = "client!uja", name = "<init>", descriptor = "(Lclient!fc;IIZ[III)V")
	public Class107_Sub4(@OriginalArg(0) Class101_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 3553, Static584.aClass244_9, Static114.aClass79_7, arg1 * arg2, arg3);
		this.anInt10626 = arg2;
		this.anInt10618 = arg1;
		super.aClass101_Sub1_Sub1_12.method5909(this);
		if (arg3 && arg6 == 0) {
			this.method9098(arg1, super.anInt10614, arg4, arg2);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(super.anInt10614, 0, 6408, this.anInt10618, this.anInt10626, 0, 32993, super.aClass101_Sub1_Sub1_12.anInt3368, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!uja", name = "<init>", descriptor = "(Lclient!fc;Lclient!nea;Lclient!dr;II)V")
	public Class107_Sub4(@OriginalArg(0) Class101_Sub1_Sub1 arg0, @OriginalArg(1) Class244 arg1, @OriginalArg(2) Class79 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
		this.anInt10626 = arg4;
		this.anInt10618 = arg3;
		super.aClass101_Sub1_Sub1_12.method5909(this);
		OpenGL.glTexImage2Dub(super.anInt10614, 0, this.method9092(), arg3, arg4, 0, Static410.method6767(super.aClass244_14), Static139.method2439(super.aClass79_19), (byte[]) null, 0);
	}

	@OriginalMember(owner = "client!uja", name = "<init>", descriptor = "(Lclient!fc;Lclient!nea;IIZ[BII)V")
	public Class107_Sub4(@OriginalArg(0) Class101_Sub1_Sub1 arg0, @OriginalArg(1) Class244 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static114.aClass79_7, arg2 * arg3, arg4);
		this.anInt10626 = arg3;
		this.anInt10618 = arg2;
		super.aClass101_Sub1_Sub1_12.method5909(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4) {
			this.method9097(arg2, arg5, super.anInt10614, arg3);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Dub(super.anInt10614, 0, this.method9092(), arg2, arg3, 0, Static410.method6767(super.aClass244_14), 5121, arg5, arg6);
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(III[IIII)V")
	@Override
	public void method9100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(12) int[] local12 = new int[this.anInt10618 * this.anInt10626];
		super.aClass101_Sub1_Sub1_12.method5909(this);
		OpenGL.glGetTexImagei(super.anInt10614, 0, 32993, 5121, local12, 0);
		for (@Pc(27) int local27 = 0; local27 < arg0; local27++) {
			Static679.method4128(local12, (arg0 - local27 - 1) * this.anInt10618, arg2, local27 * arg1, arg1);
		}
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "([FIIIIIIILclient!nea;)V")
	public void method9110(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(8) Class244 arg3) {
		super.aClass101_Sub1_Sub1_12.method5909(this);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glTexSubImage2Df(super.anInt10614, 0, 0, 0, arg1, arg2, Static410.method6767(arg3), 5121, arg0, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(IZLclient!nea;I[BIIII)V")
	@Override
	public void method9106(@OriginalArg(2) Class244 arg0, @OriginalArg(4) byte[] arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(8) int arg4) {
		super.aClass101_Sub1_Sub1_12.method5909(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg2);
		OpenGL.glTexSubImage2Dub(super.anInt10614, 0, 0, 0, arg3, arg4, Static410.method6767(arg0), 5121, arg1, 0);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(II[IIIIII)V")
	@Override
	public void method9108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.aClass101_Sub1_Sub1_12.method5909(this);
		OpenGL.glPixelStorei(3314, arg0);
		OpenGL.glTexSubImage2Di(super.anInt10614, 0, arg5, arg1, arg4, arg3, 32993, super.aClass101_Sub1_Sub1_12.anInt3368, arg2, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!uja", name = "b", descriptor = "(I)I")
	@Override
	public int method9101() {
		return this.anInt10626;
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(FI)F")
	@Override
	public float method9104(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt10626;
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(ZZI)V")
	@Override
	public void method9107(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		super.aClass101_Sub1_Sub1_12.method5909(this);
		OpenGL.glTexParameteri(super.anInt10614, 10242, arg0 ? 10497 : 33071);
		OpenGL.glTexParameteri(super.anInt10614, 10243, arg1 ? 10497 : 33071);
	}

	@OriginalMember(owner = "client!uja", name = "b", descriptor = "(B)I")
	@Override
	public int method9105() {
		return this.anInt10618;
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(IF)F")
	@Override
	public float method9102(@OriginalArg(1) float arg0) {
		return arg0 / (float) this.anInt10618;
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9103() {
		return true;
	}
}
