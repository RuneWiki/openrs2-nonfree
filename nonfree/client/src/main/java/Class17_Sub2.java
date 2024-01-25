import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class17_Sub2 extends Class17 {

	@OriginalMember(owner = "client!od", name = "m", descriptor = "[[J")
	public static final long[][] aLongArrayArray1 = new long[8][256];

	@OriginalMember(owner = "client!od", name = "db", descriptor = "[J")
	public static final long[] aLongArray15 = new long[11];

	@OriginalMember(owner = "client!od", name = "g", descriptor = "F")
	public float aFloat126;

	@OriginalMember(owner = "client!od", name = "h", descriptor = "F")
	public float aFloat127;

	@OriginalMember(owner = "client!od", name = "p", descriptor = "F")
	public float aFloat128;

	@OriginalMember(owner = "client!od", name = "u", descriptor = "F")
	public float aFloat129;

	@OriginalMember(owner = "client!od", name = "w", descriptor = "F")
	public float aFloat130;

	@OriginalMember(owner = "client!od", name = "x", descriptor = "F")
	public float aFloat131;

	@OriginalMember(owner = "client!od", name = "H", descriptor = "F")
	public float aFloat132;

	@OriginalMember(owner = "client!od", name = "K", descriptor = "F")
	public float aFloat133;

	@OriginalMember(owner = "client!od", name = "N", descriptor = "F")
	public float aFloat134;

	@OriginalMember(owner = "client!od", name = "P", descriptor = "F")
	public float aFloat135;

	@OriginalMember(owner = "client!od", name = "Q", descriptor = "F")
	public float aFloat136;

	@OriginalMember(owner = "client!od", name = "X", descriptor = "F")
	public float aFloat137;

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
			@Pc(56) long local56 = local44 ^ local28;
			@Pc(60) long local60 = local44 << 1;
			if (local60 >= 256L) {
				local60 ^= 0x11DL;
			}
			@Pc(74) long local74 = local60 ^ local28;
			aLongArrayArray1[0][local8] = Static454.method6133(local74, Static454.method6133(local32 << 8, Static454.method6133(local56 << 16, Static454.method6133(local60 << 24, Static454.method6133(local28 << 32, Static454.method6133(Static454.method6133(local28 << 56, local28 << 48), local44 << 40))))));
			for (@Pc(110) int local110 = 1; local110 < 8; local110++) {
				aLongArrayArray1[local110][local8] = Static454.method6133(aLongArrayArray1[local110 - 1][local8] << 56, aLongArrayArray1[local110 - 1][local8] >>> 8);
			}
		}
		aLongArray15[0] = 0L;
		for (@Pc(151) int local151 = 1; local151 <= 10; local151++) {
			@Pc(158) int local158 = local151 * 8 - 8;
			aLongArray15[local151] = Static136.method2279(Static136.method2279(Static248.method4093(65280L, aLongArrayArray1[6][local158 + 6]), Static136.method2279(Static248.method4093(aLongArrayArray1[5][local158 + 5], 16711680L), Static136.method2279(Static248.method4093(aLongArrayArray1[4][local158 + 4], 4278190080L), Static136.method2279(Static136.method2279(Static136.method2279(Static248.method4093(aLongArrayArray1[1][local158 + 1], 71776119061217280L), Static248.method4093(-72057594037927936L, aLongArrayArray1[0][local158])), Static248.method4093(280375465082880L, aLongArrayArray1[2][local158 + 2])), Static248.method4093(aLongArrayArray1[3][local158 + 3], 1095216660480L))))), Static248.method4093(255L, aLongArrayArray1[7][local158 + 7]));
		}
	}

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
	public Class17_Sub2() {
		this.method6239();
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!al;Lclient!al;)V")
	public void method5835(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class17 arg1) {
		@Pc(6) Class17_Sub2 local6 = (Class17_Sub2) arg0;
		@Pc(9) Class17_Sub2 local9 = (Class17_Sub2) arg1;
		this.aFloat137 = local6.aFloat137 * local9.aFloat137 + local9.aFloat133 * local6.aFloat128 + local9.aFloat132 * local6.aFloat126;
		this.aFloat133 = local6.aFloat133 * local9.aFloat137 + local6.aFloat130 * local9.aFloat133 + local9.aFloat132 * local6.aFloat135;
		this.aFloat128 = local9.aFloat130 * local6.aFloat128 + local9.aFloat128 * local6.aFloat137 + local9.aFloat129 * local6.aFloat126;
		this.aFloat132 = local6.aFloat132 * local9.aFloat137 + local6.aFloat129 * local9.aFloat133 + local6.aFloat134 * local9.aFloat132;
		this.aFloat130 = local6.aFloat130 * local9.aFloat130 + local6.aFloat133 * local9.aFloat128 + local9.aFloat129 * local6.aFloat135;
		this.aFloat129 = local9.aFloat129 * local6.aFloat134 + local9.aFloat130 * local6.aFloat129 + local6.aFloat132 * local9.aFloat128;
		this.aFloat126 = local6.aFloat128 * local9.aFloat135 + local6.aFloat137 * local9.aFloat126 + local9.aFloat134 * local6.aFloat126;
		this.aFloat135 = local6.aFloat135 * local9.aFloat134 + local9.aFloat126 * local6.aFloat133 + local9.aFloat135 * local6.aFloat130;
		this.aFloat134 = local6.aFloat134 * local9.aFloat134 + local9.aFloat135 * local6.aFloat129 + local9.aFloat126 * local6.aFloat132;
		this.aFloat136 = local6.aFloat136 + local6.aFloat137 * local9.aFloat136 + local9.aFloat127 * local6.aFloat128 + local6.aFloat126 * local9.aFloat131;
		this.aFloat127 = local6.aFloat127 + local9.aFloat136 * local6.aFloat133 + local9.aFloat127 * local6.aFloat130 + local6.aFloat135 * local9.aFloat131;
		this.aFloat131 = local9.aFloat131 * local6.aFloat134 + local6.aFloat129 * local9.aFloat127 + local6.aFloat132 * local9.aFloat136 + local6.aFloat131;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IFFF)F")
	public float method5836(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat127 + this.aFloat130 * arg0 + arg2 * this.aFloat133 + this.aFloat135 * arg1;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILclient!al;)V")
	public void method5838(@OriginalArg(1) Class17 arg0) {
		@Pc(6) Class17_Sub2 local6 = (Class17_Sub2) arg0;
		this.aFloat128 = local6.aFloat133;
		this.aFloat126 = local6.aFloat132;
		this.aFloat137 = local6.aFloat137;
		this.aFloat132 = local6.aFloat126;
		this.aFloat130 = local6.aFloat130;
		this.aFloat135 = local6.aFloat129;
		this.aFloat133 = local6.aFloat128;
		this.aFloat134 = local6.aFloat134;
		this.aFloat136 = -(local6.aFloat131 * this.aFloat126 + local6.aFloat136 * this.aFloat137 + this.aFloat128 * local6.aFloat127);
		this.aFloat129 = local6.aFloat135;
		this.aFloat127 = -(this.aFloat130 * local6.aFloat127 + local6.aFloat136 * this.aFloat133 + this.aFloat135 * local6.aFloat131);
		this.aFloat131 = -(local6.aFloat136 * this.aFloat132 + this.aFloat129 * local6.aFloat127 + local6.aFloat131 * this.aFloat134);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "([I)V")
	@Override
	public void method6226(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat136;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat127;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat131;
		arg0[0] = (int) (local29 * this.aFloat132 + this.aFloat137 * local12 + this.aFloat133 * local20);
		arg0[1] = (int) (this.aFloat129 * local29 + this.aFloat128 * local12 + this.aFloat130 * local20);
		arg0[2] = (int) (this.aFloat134 * local29 + local12 * this.aFloat126 + this.aFloat135 * local20);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "([FI)[F")
	public float[] method5840(@OriginalArg(0) float[] arg0) {
		arg0[0] = this.aFloat137;
		arg0[9] = this.aFloat135;
		arg0[15] = 1.0F;
		arg0[3] = 0.0F;
		arg0[13] = this.aFloat127;
		arg0[7] = 0.0F;
		arg0[8] = this.aFloat126;
		arg0[10] = this.aFloat134;
		arg0[4] = this.aFloat128;
		arg0[11] = 0.0F;
		arg0[12] = this.aFloat136;
		arg0[2] = this.aFloat132;
		arg0[1] = this.aFloat133;
		arg0[5] = this.aFloat130;
		arg0[14] = this.aFloat131;
		arg0[6] = this.aFloat129;
		return arg0;
	}

	@OriginalMember(owner = "client!od", name = "e", descriptor = "(I)V")
	@Override
	public void method6238(@OriginalArg(0) int arg0) {
		this.aFloat134 = 1.0F;
		this.aFloat137 = this.aFloat130 = Class117.aFloatArray21[arg0 & 0x3FFF];
		this.aFloat133 = Class117.aFloatArray22[arg0 & 0x3FFF];
		this.aFloat126 = this.aFloat136 = this.aFloat135 = this.aFloat127 = this.aFloat132 = this.aFloat129 = this.aFloat131 = 0.0F;
		this.aFloat128 = -this.aFloat133;
	}

	@OriginalMember(owner = "client!od", name = "f", descriptor = "(I)V")
	@Override
	public void method6241(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class117.aFloatArray21[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class117.aFloatArray22[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat137;
		@Pc(21) float local21 = this.aFloat128;
		@Pc(24) float local24 = this.aFloat126;
		@Pc(27) float local27 = this.aFloat136;
		this.aFloat137 = local18 * local9 - local15 * this.aFloat133;
		this.aFloat128 = local21 * local9 - this.aFloat130 * local15;
		this.aFloat133 = local15 * local18 + local9 * this.aFloat133;
		this.aFloat126 = local24 * local9 - local15 * this.aFloat135;
		this.aFloat130 = local15 * local21 + local9 * this.aFloat130;
		this.aFloat136 = local27 * local9 - this.aFloat127 * local15;
		this.aFloat135 = this.aFloat135 * local9 + local15 * local24;
		this.aFloat127 = local27 * local15 + this.aFloat127 * local9;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(FFIF)V")
	public void method5842(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat137 *= arg0;
		this.aFloat134 *= arg2;
		this.aFloat135 *= arg1;
		this.aFloat128 *= arg0;
		this.aFloat129 *= arg2;
		this.aFloat127 *= arg1;
		this.aFloat130 *= arg1;
		this.aFloat126 *= arg0;
		this.aFloat132 *= arg2;
		this.aFloat131 *= arg2;
		this.aFloat133 *= arg1;
		this.aFloat136 *= arg0;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "()Lclient!al;")
	@Override
	public Class17 method6230() {
		@Pc(7) Class17_Sub2 local7 = new Class17_Sub2();
		local7.aFloat129 = this.aFloat129;
		local7.aFloat133 = this.aFloat133;
		local7.aFloat136 = this.aFloat136;
		local7.aFloat130 = this.aFloat130;
		local7.aFloat134 = this.aFloat134;
		local7.aFloat131 = this.aFloat131;
		local7.aFloat126 = this.aFloat126;
		local7.aFloat132 = this.aFloat132;
		local7.aFloat127 = this.aFloat127;
		local7.aFloat135 = this.aFloat135;
		local7.aFloat137 = this.aFloat137;
		local7.aFloat128 = this.aFloat128;
		return local7;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(FFFB)V")
	public void method5843(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat136 = 0.0F;
		this.aFloat134 = arg2;
		this.aFloat137 = arg1;
		this.aFloat135 = 0.0F;
		this.aFloat129 = 0.0F;
		this.aFloat133 = 0.0F;
		this.aFloat126 = 0.0F;
		this.aFloat128 = 0.0F;
		this.aFloat132 = 0.0F;
		this.aFloat131 = 0.0F;
		this.aFloat130 = arg0;
		this.aFloat127 = 0.0F;
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
	@Override
	public void method6228(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class117.aFloatArray21[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class117.aFloatArray22[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat133;
		@Pc(21) float local21 = this.aFloat130;
		@Pc(24) float local24 = this.aFloat135;
		@Pc(27) float local27 = this.aFloat127;
		this.aFloat133 = local18 * local9 - this.aFloat132 * local15;
		this.aFloat130 = local21 * local9 - this.aFloat129 * local15;
		this.aFloat132 = local18 * local15 + local9 * this.aFloat132;
		this.aFloat129 = local9 * this.aFloat129 + local21 * local15;
		this.aFloat135 = local9 * local24 - local15 * this.aFloat134;
		this.aFloat134 = local9 * this.aFloat134 + local24 * local15;
		this.aFloat127 = local27 * local9 - this.aFloat131 * local15;
		this.aFloat131 = this.aFloat131 * local9 + local27 * local15;
	}

	@OriginalMember(owner = "client!od", name = "g", descriptor = "(I)V")
	@Override
	public void method6242(@OriginalArg(0) int arg0) {
		this.aFloat137 = 1.0F;
		this.aFloat130 = this.aFloat134 = Class117.aFloatArray21[arg0 & 0x3FFF];
		this.aFloat129 = Class117.aFloatArray22[arg0 & 0x3FFF];
		this.aFloat135 = -this.aFloat129;
		this.aFloat128 = this.aFloat126 = this.aFloat136 = this.aFloat133 = this.aFloat127 = this.aFloat132 = this.aFloat131 = 0.0F;
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "([FI)[F")
	public float[] method5844(@OriginalArg(0) float[] arg0) {
		arg0[6] = 0.0F;
		arg0[3] = 0.0F;
		arg0[14] = 0.0F;
		arg0[7] = 0.0F;
		arg0[4] = this.aFloat128;
		arg0[5] = this.aFloat130;
		arg0[9] = this.aFloat127;
		arg0[8] = this.aFloat136;
		arg0[13] = 0.0F;
		arg0[1] = this.aFloat133;
		arg0[10] = this.aFloat131;
		arg0[0] = this.aFloat137;
		arg0[11] = 0.0F;
		arg0[2] = 0.0F;
		arg0[15] = 1.0F;
		arg0[12] = 0.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(III[I)V")
	@Override
	public void method6237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat136 + this.aFloat126 * (float) arg2 + this.aFloat137 * (float) arg0 + this.aFloat128 * (float) arg1);
		arg3[1] = (int) ((float) arg2 * this.aFloat135 + (float) arg1 * this.aFloat130 + (float) arg0 * this.aFloat133 + this.aFloat127);
		arg3[2] = (int) (this.aFloat131 + (float) arg2 * this.aFloat134 + (float) arg1 * this.aFloat129 + (float) arg0 * this.aFloat132);
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(Z)V")
	public void method5845() {
		this.aFloat134 = -this.aFloat134;
		this.aFloat131 = -this.aFloat131;
		this.aFloat135 = -this.aFloat135;
		this.aFloat130 = -this.aFloat130;
		this.aFloat132 = -this.aFloat132;
		this.aFloat127 = -this.aFloat127;
		this.aFloat129 = -this.aFloat129;
		this.aFloat133 = -this.aFloat133;
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(FFFB)V")
	public void method5846(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat136 = arg1;
		this.aFloat127 = arg2;
		this.aFloat133 = this.aFloat132 = this.aFloat128 = this.aFloat129 = this.aFloat126 = this.aFloat135 = 0.0F;
		this.aFloat137 = this.aFloat130 = this.aFloat134 = 1.0F;
		this.aFloat131 = arg0;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!al;)V")
	@Override
	public void method6233(@OriginalArg(0) Class17 arg0) {
		@Pc(6) Class17_Sub2 local6 = (Class17_Sub2) arg0;
		this.aFloat129 = local6.aFloat129;
		this.aFloat134 = local6.aFloat134;
		this.aFloat132 = local6.aFloat132;
		this.aFloat126 = local6.aFloat126;
		this.aFloat137 = local6.aFloat137;
		this.aFloat136 = local6.aFloat136;
		this.aFloat135 = local6.aFloat135;
		this.aFloat130 = local6.aFloat130;
		this.aFloat131 = local6.aFloat131;
		this.aFloat128 = local6.aFloat128;
		this.aFloat133 = local6.aFloat133;
		this.aFloat127 = local6.aFloat127;
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(III)V")
	@Override
	public void method6235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat131 += (float) arg2;
		this.aFloat136 += (float) arg0;
		this.aFloat127 += (float) arg1;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(FIF[FF)V")
	public void method5847(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) float arg3) {
		arg2[1] = arg1 * this.aFloat135 + arg3 * this.aFloat133 + this.aFloat130 * arg0;
		arg2[2] = arg3 * this.aFloat132 + this.aFloat129 * arg0 + arg1 * this.aFloat134;
		arg2[0] = this.aFloat126 * arg1 + this.aFloat137 * arg3 + arg0 * this.aFloat128;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(III)V")
	@Override
	public void method6231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat136 = (float) arg0;
		this.aFloat127 = (float) arg1;
		this.aFloat137 = this.aFloat130 = this.aFloat134 = 1.0F;
		this.aFloat131 = (float) arg2;
		this.aFloat133 = this.aFloat132 = this.aFloat128 = this.aFloat129 = this.aFloat126 = this.aFloat135 = 0.0F;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BLclient!al;)V")
	public void method5848(@OriginalArg(1) Class17 arg0) {
		@Pc(6) Class17_Sub2 local6 = (Class17_Sub2) arg0;
		this.aFloat134 = local6.aFloat134;
		this.aFloat127 = 0.0F;
		this.aFloat133 = local6.aFloat133;
		this.aFloat135 = local6.aFloat135;
		this.aFloat137 = local6.aFloat137;
		this.aFloat136 = 0.0F;
		this.aFloat130 = local6.aFloat130;
		this.aFloat132 = local6.aFloat132;
		this.aFloat126 = local6.aFloat126;
		this.aFloat128 = local6.aFloat128;
		this.aFloat131 = 0.0F;
		this.aFloat129 = local6.aFloat129;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(FIIIFBF)V")
	public void method5849(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(6) float arg5) {
		if (arg3 == 0) {
			this.aFloat136 = arg5 - (float) arg1;
			this.aFloat131 = arg0;
			this.aFloat133 = this.aFloat132 = this.aFloat128 = this.aFloat129 = this.aFloat126 = this.aFloat135 = 0.0F;
			this.aFloat134 = 1.0F;
			this.aFloat127 = (float) -arg2 + arg4;
			this.aFloat130 = (float) (arg2 * 2);
			this.aFloat137 = (float) (arg1 * 2);
			return;
		}
		@Pc(69) float local69 = Class117.aFloatArray21[arg3 & 0x3FFF];
		@Pc(75) float local75 = Class117.aFloatArray22[arg3 & 0x3FFF];
		this.aFloat133 = local75 * 2.0F * (float) arg1;
		this.aFloat137 = local69 * 2.0F * (float) arg1;
		this.aFloat130 = (float) arg2 * local69 * 2.0F;
		this.aFloat131 = arg0;
		this.aFloat136 = (local75 * 0.5F - local69 * 0.5F) * (float) (arg1 * 2) + arg5;
		this.aFloat134 = 1.0F;
		this.aFloat128 = (float) arg2 * -2.0F * local75;
		this.aFloat127 = (float) (arg2 * 2) * (local75 * -0.5F - local69 * 0.5F) + arg4;
		this.aFloat132 = this.aFloat129 = this.aFloat126 = this.aFloat135 = 0.0F;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!al;I)V")
	public void method5850(@OriginalArg(0) Class17 arg0) {
		@Pc(6) Class17_Sub2 local6 = (Class17_Sub2) arg0;
		@Pc(9) float local9 = this.aFloat137;
		@Pc(12) float local12 = this.aFloat133;
		@Pc(15) float local15 = this.aFloat128;
		@Pc(18) float local18 = this.aFloat130;
		@Pc(21) float local21 = this.aFloat126;
		@Pc(28) float local28 = this.aFloat135;
		@Pc(31) float local31 = this.aFloat136;
		@Pc(34) float local34 = this.aFloat127;
		this.aFloat137 = local6.aFloat137 * local9 + local12 * local6.aFloat128 + local6.aFloat126 * this.aFloat132;
		this.aFloat133 = this.aFloat132 * local6.aFloat135 + local6.aFloat133 * local9 + local6.aFloat130 * local12;
		this.aFloat130 = local6.aFloat135 * this.aFloat129 + local6.aFloat130 * local18 + local15 * local6.aFloat133;
		this.aFloat132 = this.aFloat132 * local6.aFloat134 + local6.aFloat129 * local12 + local9 * local6.aFloat132;
		this.aFloat128 = this.aFloat129 * local6.aFloat126 + local15 * local6.aFloat137 + local6.aFloat128 * local18;
		this.aFloat135 = local28 * local6.aFloat130 + local21 * local6.aFloat133 + local6.aFloat135 * this.aFloat134;
		this.aFloat129 = local6.aFloat134 * this.aFloat129 + local6.aFloat129 * local18 + local15 * local6.aFloat132;
		this.aFloat126 = local6.aFloat126 * this.aFloat134 + local6.aFloat137 * local21 + local6.aFloat128 * local28;
		this.aFloat136 = local31 * local6.aFloat137 + local6.aFloat128 * local34 + local6.aFloat126 * this.aFloat131 + local6.aFloat136;
		this.aFloat134 = local6.aFloat134 * this.aFloat134 + local21 * local6.aFloat132 + local28 * local6.aFloat129;
		this.aFloat127 = local34 * local6.aFloat130 + local31 * local6.aFloat133 + local6.aFloat135 * this.aFloat131 + local6.aFloat127;
		this.aFloat131 = local6.aFloat131 + local31 * local6.aFloat132 + local6.aFloat129 * local34 + this.aFloat131 * local6.aFloat134;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(I[F)[F")
	public float[] method5851(@OriginalArg(1) float[] arg0) {
		arg0[3] = 0.0F;
		arg0[7] = 0.0F;
		arg0[0] = this.aFloat137;
		arg0[9] = this.aFloat129;
		arg0[11] = 0.0F;
		arg0[14] = 0.0F;
		arg0[13] = 0.0F;
		arg0[1] = this.aFloat128;
		arg0[15] = 0.0F;
		arg0[12] = 0.0F;
		arg0[2] = this.aFloat126;
		arg0[10] = this.aFloat134;
		arg0[5] = this.aFloat130;
		arg0[4] = this.aFloat133;
		arg0[6] = this.aFloat135;
		arg0[8] = this.aFloat132;
		return arg0;
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "([FI)[F")
	public float[] method5852(@OriginalArg(0) float[] arg0) {
		arg0[6] = this.aFloat135;
		arg0[2] = this.aFloat126;
		arg0[5] = this.aFloat130;
		arg0[7] = this.aFloat127;
		arg0[4] = this.aFloat133;
		arg0[0] = this.aFloat137;
		arg0[3] = this.aFloat136;
		arg0[1] = this.aFloat128;
		return arg0;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(III[I)V")
	@Override
	public void method6229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) ((float) arg0 * this.aFloat137 + this.aFloat128 * (float) arg1 + this.aFloat126 * (float) arg2);
		arg3[2] = (int) (this.aFloat132 * (float) arg0 + this.aFloat129 * (float) arg1 + (float) arg2 * this.aFloat134);
		arg3[1] = (int) (this.aFloat135 * (float) arg2 + this.aFloat133 * (float) arg0 + this.aFloat130 * (float) arg1);
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(I)V")
	@Override
	public void method6234(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class117.aFloatArray21[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class117.aFloatArray22[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat137;
		@Pc(21) float local21 = this.aFloat128;
		@Pc(24) float local24 = this.aFloat126;
		this.aFloat137 = local18 * local9 + this.aFloat132 * local15;
		@Pc(37) float local37 = this.aFloat136;
		this.aFloat128 = local15 * this.aFloat129 + local9 * local21;
		this.aFloat132 = local9 * this.aFloat132 - local15 * local18;
		this.aFloat129 = this.aFloat129 * local9 - local15 * local21;
		this.aFloat126 = local9 * local24 + local15 * this.aFloat134;
		this.aFloat134 = this.aFloat134 * local9 - local24 * local15;
		this.aFloat136 = local15 * this.aFloat131 + local9 * local37;
		this.aFloat131 = local9 * this.aFloat131 - local37 * local15;
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(III[I)V")
	@Override
	public void method6232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg0 - this.aFloat136);
		@Pc(13) int local13 = (int) ((float) arg2 - this.aFloat131);
		@Pc(24) int local24 = (int) ((float) arg1 - this.aFloat127);
		arg3[1] = (int) ((float) local6 * this.aFloat128 + (float) local24 * this.aFloat130 + this.aFloat129 * (float) local13);
		arg3[2] = (int) ((float) local24 * this.aFloat135 + (float) local6 * this.aFloat126 + (float) local13 * this.aFloat134);
		arg3[0] = (int) ((float) local6 * this.aFloat137 + (float) local24 * this.aFloat133 + (float) local13 * this.aFloat132);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(FFFFFFFIFF)V")
	public void method5853(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(8) float arg7, @OriginalArg(9) float arg8) {
		this.aFloat127 = 0.0F;
		this.aFloat133 = arg5;
		this.aFloat130 = arg8;
		this.aFloat137 = arg1;
		this.aFloat128 = arg2;
		this.aFloat132 = arg6;
		this.aFloat126 = arg4;
		this.aFloat129 = arg0;
		this.aFloat135 = arg7;
		this.aFloat136 = 0.0F;
		this.aFloat134 = arg3;
		this.aFloat131 = 0.0F;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "([FZ)[F")
	public float[] method5854(@OriginalArg(0) float[] arg0) {
		arg0[9] = this.aFloat129;
		arg0[6] = this.aFloat135;
		arg0[14] = 0.0F;
		arg0[10] = this.aFloat134;
		arg0[4] = this.aFloat133;
		arg0[3] = this.aFloat136;
		arg0[1] = this.aFloat128;
		arg0[13] = 0.0F;
		arg0[5] = this.aFloat130;
		arg0[15] = 1.0F;
		arg0[12] = 0.0F;
		arg0[8] = this.aFloat132;
		arg0[11] = this.aFloat131;
		arg0[2] = this.aFloat126;
		arg0[0] = this.aFloat137;
		arg0[7] = this.aFloat127;
		return arg0;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
	@Override
	public void method6227(@OriginalArg(0) int arg0) {
		this.aFloat130 = 1.0F;
		this.aFloat137 = this.aFloat134 = Class117.aFloatArray21[arg0 & 0x3FFF];
		this.aFloat126 = Class117.aFloatArray22[arg0 & 0x3FFF];
		this.aFloat128 = this.aFloat136 = this.aFloat133 = this.aFloat135 = this.aFloat127 = this.aFloat129 = this.aFloat131 = 0.0F;
		this.aFloat132 = -this.aFloat126;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(FFFI)F")
	public float method5855(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return arg0 * this.aFloat126 + this.aFloat137 * arg1 + arg2 * this.aFloat128 + this.aFloat136;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method6240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class117.aFloatArray21[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class117.aFloatArray22[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class117.aFloatArray21[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class117.aFloatArray22[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class117.aFloatArray21[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class117.aFloatArray22[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat134 = local9 * local21;
		this.aFloat130 = local33 * local9;
		this.aFloat128 = local9 * local39;
		this.aFloat132 = local9 * local27;
		this.aFloat129 = -local15;
		this.aFloat137 = local33 * local21 + local27 * local47;
		this.aFloat135 = local39 * local27 + local21 * local43;
		this.aFloat126 = -local27 * local33 + local21 * local47;
		this.aFloat133 = local43 * local27 + -local21 * local39;
		this.aFloat131 = (float) -arg0 * this.aFloat132 - this.aFloat129 * (float) arg1 - this.aFloat134 * (float) arg2;
		this.aFloat136 = -((float) arg2 * this.aFloat126) + this.aFloat137 * (float) -arg0 - this.aFloat128 * (float) arg1;
		this.aFloat127 = -((float) arg1 * this.aFloat130) + this.aFloat133 * (float) -arg0 - (float) arg2 * this.aFloat135;
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(FFIF)V")
	public void method5856(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat127 += arg2;
		this.aFloat131 += arg1;
		this.aFloat136 += arg0;
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(FFFI)F")
	public float method5857(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return this.aFloat131 + arg2 * this.aFloat134 + arg1 * this.aFloat129 + this.aFloat132 * arg0;
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "()V")
	@Override
	public void method6239() {
		this.aFloat133 = this.aFloat132 = this.aFloat128 = this.aFloat129 = this.aFloat126 = this.aFloat135 = this.aFloat136 = this.aFloat127 = this.aFloat131 = 0.0F;
		this.aFloat137 = this.aFloat130 = this.aFloat134 = 1.0F;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "([FFFFFB)V")
	public void method5858(@OriginalArg(0) float[] arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		arg0[0] = arg1 * this.aFloat128 + arg4 * this.aFloat137 + arg3 * this.aFloat126;
		arg0[2] = arg1 * this.aFloat129 + arg4 * this.aFloat132 + this.aFloat134 * arg3;
		arg0[1] = this.aFloat130 * arg1 + this.aFloat133 * arg4 + arg3 * this.aFloat135;
		@Pc(85) float local85;
		@Pc(101) float local101;
		@Pc(93) float local93;
		@Pc(77) float local77;
		if (arg4 > 0.00390625F || arg4 < -0.00390625F) {
			local77 = -arg2 / arg4;
			local85 = this.aFloat136 + local77 * this.aFloat137;
			local93 = this.aFloat132 * local77 + this.aFloat131;
			local101 = this.aFloat127 + this.aFloat133 * local77;
		} else if (arg1 > 0.00390625F || arg1 < -0.00390625F) {
			local77 = -arg2 / arg1;
			local101 = this.aFloat130 * local77 + this.aFloat127;
			local93 = this.aFloat129 * local77 + this.aFloat131;
			local85 = this.aFloat136 + this.aFloat128 * local77;
		} else {
			local77 = -arg2 / arg3;
			local85 = this.aFloat136 + local77 * this.aFloat126;
			local93 = local77 * this.aFloat134 + this.aFloat131;
			local101 = this.aFloat127 + local77 * this.aFloat135;
		}
		arg0[3] = -(local85 * arg0[0] + arg0[1] * local101 + arg0[2] * local93);
	}
}
