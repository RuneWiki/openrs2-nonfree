import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uo")
public final class Class205_Sub3 extends Class205 {

	@OriginalMember(owner = "client!uo", name = "r", descriptor = "I")
	private int anInt8186;

	@OriginalMember(owner = "client!uo", name = "A", descriptor = "I")
	private int anInt8191;

	@OriginalMember(owner = "client!uo", name = "W", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray20;

	@OriginalMember(owner = "client!uo", name = "ab", descriptor = "Lclient!kq;")
	public Class170 aClass170_20;

	@OriginalMember(owner = "client!uo", name = "bb", descriptor = "Lclient!lca;")
	private Interface5 anInterface5_14;

	@OriginalMember(owner = "client!uo", name = "eb", descriptor = "[Lclient!ml;")
	private Class1_Sub32[] aClass1_Sub32Array1;

	@OriginalMember(owner = "client!uo", name = "gb", descriptor = "I")
	private int anInt8204;

	@OriginalMember(owner = "client!uo", name = "hb", descriptor = "Lclient!lca;")
	private Interface5 anInterface5_15;

	@OriginalMember(owner = "client!uo", name = "jb", descriptor = "I")
	private int anInt8205;

	@OriginalMember(owner = "client!uo", name = "R", descriptor = "F")
	private float aFloat158 = -3.4028235E38F;

	@OriginalMember(owner = "client!uo", name = "X", descriptor = "F")
	private float aFloat159 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!uo", name = "i", descriptor = "Lclient!bv;")
	private final Class37 aClass37_90 = new Class37();

	@OriginalMember(owner = "client!uo", name = "x", descriptor = "Lclient!re;")
	public final Class122_Sub2 aClass122_Sub2_19;

	@OriginalMember(owner = "client!uo", name = "K", descriptor = "I")
	private final int anInt8195;

	@OriginalMember(owner = "client!uo", name = "I", descriptor = "[[I")
	private final int[][] anIntArrayArray109;

	@OriginalMember(owner = "client!uo", name = "s", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!uo", name = "z", descriptor = "I")
	public final int anInt8190;

	@OriginalMember(owner = "client!uo", name = "J", descriptor = "[[[Lclient!ml;")
	private Class1_Sub32[][][] aClass1_Sub32ArrayArrayArray1;

	@OriginalMember(owner = "client!uo", name = "ib", descriptor = "[[F")
	private float[][] aFloatArrayArray15;

	@OriginalMember(owner = "client!uo", name = "O", descriptor = "[[S")
	public final short[][] aShortArrayArray9;

	@OriginalMember(owner = "client!uo", name = "t", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!uo", name = "db", descriptor = "[[B")
	private byte[][] aByteArrayArray30;

	@OriginalMember(owner = "client!uo", name = "C", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray18;

	@OriginalMember(owner = "client!uo", name = "j", descriptor = "[[B")
	private final byte[][] aByteArrayArray29;

	@OriginalMember(owner = "client!uo", name = "fb", descriptor = "[[F")
	private float[][] aFloatArrayArray14;

	@OriginalMember(owner = "client!uo", name = "cb", descriptor = "[[F")
	private float[][] aFloatArrayArray13;

	@OriginalMember(owner = "client!uo", name = "F", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray19;

	@OriginalMember(owner = "client!uo", name = "w", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray17;

	@OriginalMember(owner = "client!uo", name = "Y", descriptor = "I")
	private final int anInt8203;

	@OriginalMember(owner = "client!uo", name = "Z", descriptor = "Lclient!ba;")
	private Class17 aClass17_37;

	@OriginalMember(owner = "client!uo", name = "D", descriptor = "Lclient!la;")
	private Class176 aClass176_2;

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Lclient!re;IIII[[I[[II)V")
	public Class205_Sub3(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.aClass122_Sub2_19 = arg0;
		this.anInt8195 = super.anInt8176 - 2;
		this.anIntArrayArray109 = arg5;
		this.anIntArrayArrayArray15 = new int[arg3][arg4][];
		this.anInt8190 = arg2;
		this.aClass1_Sub32ArrayArrayArray1 = new Class1_Sub32[arg3][arg4][];
		this.aFloatArrayArray15 = new float[super.anInt8174 + 1][super.anInt8177 + 1];
		this.aShortArrayArray9 = new short[arg4 * arg3][];
		this.anIntArrayArrayArray16 = new int[arg3][arg4][];
		this.aByteArrayArray30 = new byte[arg3 + 1][arg4 + 1];
		this.anIntArrayArrayArray18 = new int[arg3][arg4][];
		this.aByteArrayArray29 = new byte[arg3][arg4];
		this.aFloatArrayArray14 = new float[super.anInt8174 + 1][super.anInt8177 + 1];
		this.aFloatArrayArray13 = new float[super.anInt8174 + 1][super.anInt8177 + 1];
		this.anIntArrayArrayArray19 = new int[arg3][arg4][];
		this.anIntArrayArrayArray17 = new int[arg3][arg4][];
		this.anInt8203 = 0x1 << this.anInt8195;
		for (@Pc(123) int local123 = 0; super.anInt8177 >= local123; local123++) {
			for (@Pc(127) int local127 = 0; super.anInt8174 >= local127; local127++) {
				@Pc(136) int local136 = this.anIntArrayArray109[local127][local123];
				if ((float) local136 < this.aFloat159) {
					this.aFloat159 = local136;
				}
				if ((float) local136 > this.aFloat158) {
					this.aFloat158 = local136;
				}
				if (local127 > 0 && local123 > 0 && local127 < super.anInt8174 && super.anInt8177 > local123) {
					@Pc(185) int local185 = arg6[local127 + 1][local123] - arg6[local127 - 1][local123];
					@Pc(202) int local202 = arg6[local127][local123 + 1] - arg6[local127][local123 - 1];
					@Pc(222) float local222 = (float) (1.0D / Math.sqrt((double) (local185 * local185 + arg7 * 4 * arg7 + local202 * local202)));
					this.aFloatArrayArray14[local127][local123] = (float) local185 * local222;
					this.aFloatArrayArray15[local127][local123] = (float) (-arg7 * 2) * local222;
					this.aFloatArrayArray13[local127][local123] = (float) local202 * local222;
				}
			}
		}
		this.aFloat158++;
		this.aFloat159--;
		this.aClass17_37 = new Class17(128);
		if ((this.anInt8190 & 0x10) != 0) {
			this.aClass176_2 = new Class176(this.aClass122_Sub2_19, this);
		}
	}

	@OriginalMember(owner = "client!uo", name = "ba", descriptor = "(II)I")
	@Override
	public int ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray109[arg0][arg1];
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!ww;[I)V")
	@Override
	public void method6747(@OriginalArg(0) Class1_Sub2 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass37_90.method970(new Class1_Sub42(this.aClass122_Sub2_19, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!k;IIIIZ)Z")
	@Override
	public boolean method6746(@OriginalArg(0) Class1_Sub1_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass176_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (arg2 * this.aClass122_Sub2_19.anInt6697 >> 8) >> this.aClass122_Sub2_19.anInt6714;
			@Pc(40) int local40 = arg3 - (arg2 * this.aClass122_Sub2_19.anInt6710 >> 8) >> this.aClass122_Sub2_19.anInt6714;
			return this.aClass176_2.method4402(local25, arg0, local40);
		}
	}

	@OriginalMember(owner = "client!uo", name = "X", descriptor = "(IILclient!k;)Lclient!k;")
	@Override
	public Class1_Sub1_Sub9 X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub9 arg2) {
		if ((this.aByteArrayArray29[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt8175 >> this.aClass122_Sub2_19.anInt6714;
		@Pc(27) Class1_Sub1_Sub9_Sub2 local27 = (Class1_Sub1_Sub9_Sub2) arg2;
		@Pc(37) Class1_Sub1_Sub9_Sub2 local37;
		if (local27 != null && local27.method5130(local24, local24)) {
			local37 = local27;
			local27.method5132();
		} else {
			local37 = new Class1_Sub1_Sub9_Sub2(this.aClass122_Sub2_19, local24, local24);
		}
		local37.method5135(0, local24, local24, 0);
		this.method6753(arg1, local37, arg0);
		return local37;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(ZILclient!oca;I)V")
	private void method6753(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub9_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray16[arg2][arg0];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray19[arg2][arg0];
		@Pc(22) int local22 = local12.length;
		if (Static73.anIntArray155.length < local22) {
			Static188.anIntArray313 = new int[local22];
			Static73.anIntArray155 = new int[local22];
		}
		for (@Pc(38) int local38 = 0; local38 < local22; local38++) {
			Static73.anIntArray155[local38] = local12[local38] >> this.aClass122_Sub2_19.anInt6714;
			Static188.anIntArray313[local38] = local19[local38] >> this.aClass122_Sub2_19.anInt6714;
		}
		@Pc(74) int local74 = 0;
		while (local22 > local74) {
			@Pc(80) int local80 = Static73.anIntArray155[local74];
			@Pc(85) int local85 = Static188.anIntArray313[local74++];
			@Pc(89) int local89 = Static73.anIntArray155[local74];
			@Pc(94) int local94 = Static188.anIntArray313[local74++];
			@Pc(98) int local98 = Static73.anIntArray155[local74];
			@Pc(103) int local103 = Static188.anIntArray313[local74++];
			if (-((local98 - local89) * (-local85 + local94)) + (local80 - local89) * (local94 - local103) > 0) {
				arg1.method5136(local85, local94, local98, local89, local80, local103);
			}
		}
	}

	@OriginalMember(owner = "client!uo", name = "ya", descriptor = "(Lclient!k;IIIIZ)V")
	@Override
	public void ya(@OriginalArg(0) Class1_Sub1_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass176_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass122_Sub2_19.anInt6697 >> 8) >> this.aClass122_Sub2_19.anInt6714;
			@Pc(39) int local39 = arg3 - (this.aClass122_Sub2_19.anInt6710 * arg2 >> 8) >> this.aClass122_Sub2_19.anInt6714;
			this.aClass176_2.method4400(local39, arg0, local24);
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(II)V")
	@Override
	public void method6748(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!uo", name = "aa", descriptor = "(II)I")
	@Override
	public int aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 >> super.anInt8176;
		@Pc(13) int local13 = arg1 >> super.anInt8176;
		if (local8 < 0 || local13 < 0 || super.anInt8174 - 1 < local8 || local13 > super.anInt8177 - 1) {
			return 0;
		}
		@Pc(48) int local48 = super.anInt8175 - 1 & arg0;
		@Pc(55) int local55 = super.anInt8175 - 1 & arg1;
		@Pc(81) int local81 = this.anIntArrayArray109[local8 + 1][local13] * local48 + this.anIntArrayArray109[local8][local13] * (super.anInt8175 - local48) >> super.anInt8176;
		@Pc(111) int local111 = local48 * this.anIntArrayArray109[local8 + 1][local13 + 1] + this.anIntArrayArray109[local8][local13 + 1] * (super.anInt8175 - local48) >> super.anInt8176;
		return local111 * local55 + local81 * (super.anInt8175 - local55) >> super.anInt8176;
	}

	@OriginalMember(owner = "client!uo", name = "F", descriptor = "(Lclient!k;IIIIZ)V")
	@Override
	public void F(@OriginalArg(0) Class1_Sub1_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass176_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass122_Sub2_19.anInt6697 >> 8) >> this.aClass122_Sub2_19.anInt6714;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass122_Sub2_19.anInt6710 >> 8) >> this.aClass122_Sub2_19.anInt6714;
			this.aClass176_2.method4398(local39, arg0, local24);
		}
	}

	@OriginalMember(owner = "client!uo", name = "IA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray20 == null) {
			this.anIntArrayArrayArray20 = new int[super.anInt8174][super.anInt8177][];
		}
		if (arg3 != null && this.anIntArrayArrayArray18 == null) {
			this.anIntArrayArrayArray18 = new int[super.anInt8174][super.anInt8177][];
		}
		this.anIntArrayArrayArray16[arg0][arg1] = arg2;
		this.anIntArrayArrayArray19[arg0][arg1] = arg4;
		this.anIntArrayArrayArray15[arg0][arg1] = arg6;
		this.anIntArrayArrayArray17[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray20 != null) {
			this.anIntArrayArrayArray20[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray18 != null) {
			this.anIntArrayArrayArray18[arg0][arg1] = arg3;
		}
		@Pc(88) Class1_Sub32[] local88 = this.aClass1_Sub32ArrayArrayArray1[arg0][arg1] = new Class1_Sub32[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) arg8[local90] | (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28 | (long) (arg9[local90] << 14);
			@Pc(125) Class1 local125;
			for (local125 = this.aClass17_37.method738(local119); local125 != null; local125 = this.aClass17_37.method743()) {
				@Pc(130) Class1_Sub32 local130 = (Class1_Sub32) local125;
				if (arg8[local90] == local130.anInt5589 && local130.aFloat115 == (float) arg9[local90] && local130.anInt5585 == arg10 && local130.anInt5582 == arg11 && local130.anInt5592 == arg12) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class1_Sub32(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass17_37.method737(local88[local90], local119);
			} else {
				local88[local90] = (Class1_Sub32) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray29[arg0][arg1] = (byte) (this.aByteArrayArray29[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt8204) {
			this.anInt8204 = arg6.length;
		}
		this.anInt8205 += arg6.length;
	}

	@OriginalMember(owner = "client!uo", name = "Q", descriptor = "(III)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray30[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray30[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method6750(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method6757(arg4, arg1, arg0, arg2, arg3);
	}

	@OriginalMember(owner = "client!uo", name = "N", descriptor = "()V")
	@Override
	public void N() {
		if (this.anInt8205 <= 0) {
			this.aClass176_2 = null;
		} else {
			@Pc(26) byte[][] local26 = new byte[super.anInt8174 + 1][super.anInt8177 + 1];
			for (@Pc(28) int local28 = 1; super.anInt8174 > local28; local28++) {
				for (@Pc(32) int local32 = 1; super.anInt8177 > local32; local32++) {
					local26[local28][local32] = (byte) ((this.aByteArrayArray30[local28][local32] >> 1) + (this.aByteArrayArray30[local28][local32 + 1] >> 3) + (this.aByteArrayArray30[local28 - -1][local32] >> 3) + (this.aByteArrayArray30[local28 + -1][local32] >> 2) + (this.aByteArrayArray30[local28][local32 - 1] >> 2));
				}
			}
			@Pc(112) Class1_Sub32[] local112 = new Class1_Sub32[this.aClass17_37.method742()];
			this.aClass17_37.method739(local112);
			for (@Pc(120) int local120 = 0; local120 < local112.length; local120++) {
				local112[local120].method4783(this.anInt8205);
			}
			@Pc(136) int local136 = 20;
			if (this.anIntArrayArrayArray20 != null) {
				local136 += 4;
			}
			if ((this.anInt8190 & 0x7) != 0) {
				local136 += 12;
			}
			@Pc(156) NativeHeapBuffer local156 = this.aClass122_Sub2_19.aNativeHeap4.a(this.anInt8205 * 4, false);
			@Pc(166) NativeHeapBuffer local166 = this.aClass122_Sub2_19.aNativeHeap4.a(local136 * this.anInt8205, false);
			@Pc(171) Stream local171 = new Stream(local166);
			@Pc(176) Stream local176 = new Stream(local156);
			@Pc(180) Class1_Sub32[] local180 = new Class1_Sub32[this.anInt8205];
			@Pc(187) int local187 = Static59.method1111(this.anInt8205 / 4);
			if (local187 < 1) {
				local187 = 1;
			}
			@Pc(199) Class17 local199 = new Class17(local187);
			@Pc(203) Class1_Sub32[] local203 = new Class1_Sub32[this.anInt8204];
			@Pc(209) int local209;
			for (@Pc(205) int local205 = 0; local205 < super.anInt8174; local205++) {
				for (local209 = 0; local209 < super.anInt8177; local209++) {
					if (this.anIntArrayArrayArray15[local205][local209] != null) {
						@Pc(225) Class1_Sub32[] local225 = this.aClass1_Sub32ArrayArrayArray1[local205][local209];
						@Pc(232) int[] local232 = this.anIntArrayArrayArray16[local205][local209];
						@Pc(239) int[] local239 = this.anIntArrayArrayArray19[local205][local209];
						@Pc(246) int[] local246 = this.anIntArrayArrayArray17[local205][local209];
						@Pc(253) int[] local253 = this.anIntArrayArrayArray15[local205][local209];
						@Pc(265) int[] local265 = this.anIntArrayArrayArray18 == null ? null : this.anIntArrayArrayArray18[local205][local209];
						if (local246 == null) {
							local246 = local253;
						}
						@Pc(281) int[] local281 = this.anIntArrayArrayArray20 == null ? null : this.anIntArrayArrayArray20[local205][local209];
						@Pc(288) float local288 = this.aFloatArrayArray14[local205][local209];
						@Pc(295) float local295 = this.aFloatArrayArray15[local205][local209];
						@Pc(302) float local302 = this.aFloatArrayArray13[local205][local209];
						@Pc(311) float local311 = this.aFloatArrayArray14[local205][local209 + 1];
						@Pc(320) float local320 = this.aFloatArrayArray15[local205][local209 + 1];
						@Pc(329) float local329 = this.aFloatArrayArray13[local205][local209 + 1];
						@Pc(340) float local340 = this.aFloatArrayArray14[local205 + 1][local209 + 1];
						@Pc(351) float local351 = this.aFloatArrayArray15[local205 + 1][local209 + 1];
						@Pc(362) float local362 = this.aFloatArrayArray13[local205 + 1][local209 + 1];
						@Pc(371) float local371 = this.aFloatArrayArray14[local205 + 1][local209];
						@Pc(380) float local380 = this.aFloatArrayArray15[local205 + 1][local209];
						@Pc(389) float local389 = this.aFloatArrayArray13[local205 + 1][local209];
						@Pc(397) int local397 = local26[local205][local209] & 0xFF;
						@Pc(407) int local407 = local26[local205][local209 + 1] & 0xFF;
						@Pc(419) int local419 = local26[local205 + 1][local209 + 1] & 0xFF;
						@Pc(429) int local429 = local26[local205 + 1][local209] & 0xFF;
						@Pc(431) int local431 = 0;
						@Pc(441) int local441;
						label355: for (@Pc(433) int local433 = 0; local433 < local253.length; local433++) {
							@Pc(439) Class1_Sub32 local439 = local225[local433];
							for (local441 = 0; local441 < local431; local441++) {
								if (local439 == local203[local441]) {
									continue label355;
								}
							}
							local203[local431++] = local439;
						}
						@Pc(482) short[] local482 = this.aShortArrayArray9[local205 + local209 * super.anInt8174] = new short[local253.length];
						for (local441 = 0; local441 < local253.length; local441++) {
							@Pc(495) int local495 = (local205 << super.anInt8176) + local232[local441];
							@Pc(505) int local505 = (local209 << super.anInt8176) + local239[local441];
							@Pc(510) int local510 = local495 >> this.anInt8195;
							@Pc(515) int local515 = local505 >> this.anInt8195;
							@Pc(519) int local519 = local253[local441];
							@Pc(523) int local523 = local246[local441];
							@Pc(531) int local531 = local265 == null ? 0 : local265[local441];
							@Pc(549) long local549 = (long) local515 | (long) local519 << 32 | (long) local523 << 48 | (long) (local510 << 16);
							@Pc(553) int local553 = local232[local441];
							@Pc(557) int local557 = local239[local441];
							@Pc(559) byte local559 = 74;
							@Pc(561) int local561 = 0;
							@Pc(570) float local570;
							@Pc(572) float local572;
							@Pc(578) float local578;
							@Pc(649) float local649;
							@Pc(576) int local576;
							if (local553 == 0 && local557 == 0) {
								local570 = local288;
								local572 = local295;
								local576 = local559 - local397;
								local578 = local302;
							} else if (local553 == 0 && local557 == super.anInt8175) {
								local576 = local559 - local407;
								local570 = local311;
								local572 = local320;
								local578 = local329;
							} else if (local553 == super.anInt8175 && local557 == super.anInt8175) {
								local578 = local362;
								local576 = local559 - local419;
								local570 = local340;
								local572 = local351;
							} else if (super.anInt8175 == local553 && local557 == 0) {
								local578 = local389;
								local572 = local380;
								local576 = local559 - local429;
								local570 = local371;
							} else {
								@Pc(626) float local626 = (float) local553 / (float) super.anInt8175;
								@Pc(633) float local633 = (float) local557 / (float) super.anInt8175;
								@Pc(641) float local641 = local626 * (local371 - local288) + local288;
								local649 = local626 * (local380 - local295) + local295;
								@Pc(657) float local657 = (local389 - local302) * local626 + local302;
								@Pc(666) float local666 = local311 + (local340 - local311) * local626;
								@Pc(674) float local674 = local320 + (local351 - local320) * local626;
								@Pc(683) float local683 = (local362 - local329) * local626 + local329;
								local570 = local641 + local633 * (local666 - local641);
								local572 = local649 + (local674 - local649) * local633;
								local578 = local657 + (local683 - local657) * local633;
								@Pc(720) int local720 = local397 + ((local429 - local397) * local553 >> super.anInt8176);
								@Pc(732) int local732 = (local553 * (local419 - local407) >> super.anInt8176) + local407;
								local576 = local559 - ((local732 - local720) * local557 >> super.anInt8176) - local720;
							}
							@Pc(772) float local772 = 1.0F;
							if (local519 != -1) {
								@Pc(784) int local784 = local576 * (local519 & 0x7F) >> 7;
								if (local784 < 2) {
									local784 = 2;
								} else if (local784 > 126) {
									local784 = 126;
								}
								local561 = Static212.anIntArray347[local784 | local519 & 0xFF80];
								if ((this.anInt8190 & 0x7) == 0) {
									local772 = this.aClass122_Sub2_19.aFloatArray49[2] * local578 + this.aClass122_Sub2_19.aFloatArray49[1] * local572 + local570 * this.aClass122_Sub2_19.aFloatArray49[0];
									local772 = local772 * (local772 > 0.0F ? this.aClass122_Sub2_19.aFloat136 : this.aClass122_Sub2_19.aFloat130) + this.aClass122_Sub2_19.aFloat131;
								}
							}
							@Pc(855) Class1 local855 = null;
							if ((local495 & this.anInt8203 - 1) == 0 && (local505 & this.anInt8203 - 1) == 0) {
								local855 = local199.method738(local549);
							}
							@Pc(888) int local888;
							@Pc(919) int local919;
							if (local855 == null) {
								if (local523 == local519) {
									local919 = local561;
								} else {
									@Pc(929) int local929 = (local523 & 0x7F) * local576 >> 7;
									if (local929 < 2) {
										local929 = 2;
									} else if (local929 > 126) {
										local929 = 126;
									}
									local919 = Static212.anIntArray347[local929 | local523 & 0xFF80];
									if ((this.anInt8190 & 0x7) == 0) {
										local649 = this.aClass122_Sub2_19.aFloatArray49[1] * local572 + local570 * this.aClass122_Sub2_19.aFloatArray49[0] + local578 * this.aClass122_Sub2_19.aFloatArray49[2];
										local649 = this.aClass122_Sub2_19.aFloat131 + local772 * (local772 > 0.0F ? this.aClass122_Sub2_19.aFloat136 : this.aClass122_Sub2_19.aFloat130);
										@Pc(1004) int local1004 = local919 >> 16 & 0xFF;
										@Pc(1010) int local1010 = local919 >> 8 & 0xFF;
										local1004 = (int) ((float) local1004 * local649);
										@Pc(1020) int local1020 = local919 & 0xFF;
										if (local1004 < 0) {
											local1004 = 0;
										} else if (local1004 > 255) {
											local1004 = 255;
										}
										local1010 = (int) ((float) local1010 * local649);
										if (local1010 < 0) {
											local1010 = 0;
										} else if (local1010 > 255) {
											local1010 = 255;
										}
										local1020 = (int) ((float) local1020 * local649);
										if (local1020 < 0) {
											local1020 = 0;
										} else if (local1020 > 255) {
											local1020 = 255;
										}
										local919 = local1010 << 8 | local1004 << 16 | local1020;
									}
								}
								if (Stream.c()) {
									local171.a((float) local495);
									local171.a((float) (this.aa(local495, local505) + local531));
									local171.a((float) local505);
									local171.a((float) local495);
									local171.a((float) local505);
									if (this.anIntArrayArrayArray20 != null) {
										local171.a((float) (local281 == null ? 0 : local281[local441] - 1));
									}
									if ((this.anInt8190 & 0x7) != 0) {
										local171.a(local570);
										local171.a(local572);
										local171.a(local578);
									}
								} else {
									local171.b((float) local495);
									local171.b((float) (this.aa(local495, local505) + local531));
									local171.b((float) local505);
									local171.b((float) local495);
									local171.b((float) local505);
									if (this.anIntArrayArrayArray20 != null) {
										local171.b((float) (local281 == null ? 0 : local281[local441] - 1));
									}
									if ((this.anInt8190 & 0x7) != 0) {
										local171.b(local570);
										local171.b(local572);
										local171.b(local578);
									}
								}
								if (this.aClass122_Sub2_19.anInt6720 == 0) {
									local176.b(local919 | 0xFF000000);
								} else {
									local176.c(local919 | 0xFF000000);
								}
								local888 = this.anInt8186++;
								local482[local441] = (short) local888;
								if (local519 != -1) {
									local180[local888] = local225[local441];
								}
								local199.method737(new Class1_Sub29(local482[local441]), local549);
							} else {
								local482[local441] = ((Class1_Sub29) local855).aShort76;
								local888 = local482[local441] & 0xFFFF;
								if (local519 != -1 && local180[local888].aLong392 > local225[local441].aLong392) {
									local180[local888] = local225[local441];
								}
							}
							for (local919 = 0; local919 < local431; local919++) {
								local203[local919].method4786(local576, local772, local561, local888);
							}
							this.anInt8191++;
						}
					}
				}
			}
			for (local209 = 0; local209 < this.anInt8186; local209++) {
				@Pc(1303) Class1_Sub32 local1303 = local180[local209];
				if (local1303 != null) {
					local1303.method4782(local209);
				}
			}
			@Pc(1320) int local1320;
			@Pc(1338) int local1338;
			for (@Pc(1316) int local1316 = 0; local1316 < super.anInt8174; local1316++) {
				for (local1320 = 0; local1320 < super.anInt8177; local1320++) {
					@Pc(1332) short[] local1332 = this.aShortArrayArray9[super.anInt8174 * local1320 + local1316];
					if (local1332 != null) {
						@Pc(1336) int local1336 = 0;
						local1338 = 0;
						while (local1332.length > local1338) {
							@Pc(1347) int local1347 = local1332[local1338++] & 0xFFFF;
							@Pc(1354) int local1354 = local1332[local1338++] & 0xFFFF;
							@Pc(1361) int local1361 = local1332[local1338++] & 0xFFFF;
							@Pc(1365) Class1_Sub32 local1365 = local180[local1347];
							@Pc(1369) Class1_Sub32 local1369 = local180[local1354];
							@Pc(1373) Class1_Sub32 local1373 = local180[local1361];
							@Pc(1375) Class1_Sub32 local1375 = null;
							if (local1365 != null) {
								local1365.method4787(local1316, local1336, local1320);
								local1375 = local1365;
							}
							if (local1369 != null) {
								local1369.method4787(local1316, local1336, local1320);
								if (local1375 == null || local1369.aLong392 < local1375.aLong392) {
									local1375 = local1369;
								}
							}
							if (local1373 != null) {
								local1373.method4787(local1316, local1336, local1320);
								if (local1375 == null || local1373.aLong392 < local1375.aLong392) {
									local1375 = local1373;
								}
							}
							if (local1375 != null) {
								if (local1365 != null) {
									local1375.method4782(local1347);
								}
								if (local1369 != null) {
									local1375.method4782(local1354);
								}
								if (local1373 != null) {
									local1375.method4782(local1361);
								}
								local1375.method4787(local1316, local1336, local1320);
							}
							local1336++;
						}
					}
				}
			}
			local171.b();
			local176.b();
			this.anInterface5_15 = this.aClass122_Sub2_19.method5671(false);
			this.anInterface5_15.method5731(local156, this.anInt8186 * 4, 4);
			this.anInterface5_14 = this.aClass122_Sub2_19.method5671(false);
			this.anInterface5_14.method5731(local166, local136 * this.anInt8186, local136);
			if ((this.anInt8190 & 0x7) == 0) {
				if (this.anIntArrayArrayArray20 == null) {
					this.aClass170_20 = this.aClass122_Sub2_19.method5674(new Class293[] { new Class293(new Class107[] { Static160.aClass107_1, Static160.aClass107_5 }), new Class293(Static160.aClass107_3) });
				} else {
					this.aClass170_20 = this.aClass122_Sub2_19.method5674(new Class293[] { new Class293(new Class107[] { Static160.aClass107_1, Static160.aClass107_5, Static160.aClass107_4 }), new Class293(Static160.aClass107_3) });
				}
			} else if (this.anIntArrayArrayArray20 == null) {
				this.aClass170_20 = this.aClass122_Sub2_19.method5674(new Class293[] { new Class293(new Class107[] { Static160.aClass107_1, Static160.aClass107_5, Static160.aClass107_2 }), new Class293(Static160.aClass107_3) });
			} else {
				this.aClass170_20 = this.aClass122_Sub2_19.method5674(new Class293[] { new Class293(new Class107[] { Static160.aClass107_1, Static160.aClass107_5, Static160.aClass107_4, Static160.aClass107_2 }), new Class293(Static160.aClass107_3) });
			}
			local1320 = 0;
			for (@Pc(1678) int local1678 = 0; local1678 < local112.length; local1678++) {
				if (local112[local1678].anInt5583 > 0) {
					local112[local1320++] = local112[local1678];
				}
			}
			this.aClass1_Sub32Array1 = new Class1_Sub32[local1320];
			@Pc(1707) long[] local1707 = new long[local1320];
			for (local1338 = 0; local1338 < local1320; local1338++) {
				@Pc(1715) Class1_Sub32 local1715 = local112[local1338];
				local1707[local1338] = local1715.aLong392;
				this.aClass1_Sub32Array1[local1338] = local1715;
				local1715.method4784(this.anInt8186);
			}
			Static78.method1339(this.aClass1_Sub32Array1, local1707);
			if (this.aClass176_2 != null) {
				this.aClass176_2.method4399();
			}
		}
		this.aClass17_37 = null;
		this.anIntArrayArrayArray18 = null;
		this.aClass1_Sub32ArrayArrayArray1 = null;
		this.aFloatArrayArray14 = this.aFloatArrayArray15 = this.aFloatArrayArray13 = null;
		this.anIntArrayArrayArray20 = null;
		this.anIntArrayArrayArray17 = null;
		this.anIntArrayArrayArray16 = this.anIntArrayArrayArray19 = null;
		this.aByteArrayArray30 = null;
		this.anIntArrayArrayArray15 = null;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method6751(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt8205 <= 0) {
			return;
		}
		@Pc(19) Interface1 local19 = this.aClass122_Sub2_19.method5576(this.anInt8191);
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = 32767;
		@Pc(25) int local25 = -32768;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			local21 = 0;
			@Pc(36) Buffer local36 = local19.method5729();
			if (local36 != null) {
				@Pc(44) Stream local44 = this.aClass122_Sub2_19.method5555(local36);
				@Pc(48) int local48;
				@Pc(58) int local58;
				@Pc(60) int local60;
				@Pc(79) short[] local79;
				@Pc(83) int local83;
				@Pc(91) int local91;
				if (Stream.c()) {
					for (local48 = arg1; local48 < arg3; local48++) {
						local58 = arg0 + local48 * super.anInt8174;
						for (local60 = arg0; local60 < arg2; local60++) {
							if (arg4[local60 - arg0][local48 - arg1]) {
								local79 = this.aShortArrayArray9[local58];
								if (local79 != null) {
									for (local83 = 0; local83 < local79.length; local83++) {
										local91 = local79[local83] & 0xFFFF;
										local21++;
										if (local23 > local91) {
											local23 = local91;
										}
										if (local91 > local25) {
											local25 = local91;
										}
										local44.a(local91);
									}
								}
							}
							local58++;
						}
					}
				} else {
					for (local48 = arg1; local48 < arg3; local48++) {
						local58 = local48 * super.anInt8174 + arg0;
						for (local60 = arg0; local60 < arg2; local60++) {
							if (arg4[local60 - arg0][local48 - arg1]) {
								local79 = this.aShortArrayArray9[local58];
								if (local79 != null) {
									for (local83 = 0; local83 < local79.length; local83++) {
										local91 = local79[local83] & 0xFFFF;
										if (local23 > local91) {
											local23 = local91;
										}
										if (local25 < local91) {
											local25 = local91;
										}
										local44.d(local91);
										local21++;
									}
								}
							}
							local58++;
						}
					}
				}
				local44.b();
				if (local19.method5730()) {
					break;
				}
			}
		}
		if (local21 <= 0) {
			return;
		}
		this.aClass122_Sub2_19.method5568();
		this.aClass122_Sub2_19.method5611(false);
		this.aClass122_Sub2_19.method5633(false);
		this.aClass122_Sub2_19.method5624(false);
		this.aClass122_Sub2_19.method5551(false);
		this.aClass122_Sub2_19.method5650(0);
		this.aClass122_Sub2_19.method5622(false, false, -2);
		this.aClass122_Sub2_19.method5651(null);
		@Pc(271) Class118_Sub3 local271 = this.aClass122_Sub2_19.method5654();
		@Pc(276) float[] local276 = this.aClass122_Sub2_19.method5645();
		local276[5] = (float) 1024 / ((float) this.aClass122_Sub2_19.anInt6649 * 128.0F * (float) super.anInt8175);
		local276[15] = 1.0F;
		local276[14] = -this.aFloat159 / (this.aFloat158 - this.aFloat159);
		local276[3] = 0.0F;
		local276[0] = (float) 1024 / ((float) this.aClass122_Sub2_19.anInt6621 * (float) super.anInt8175 * 128.0F);
		local276[9] = 0.0F;
		local276[2] = 0.0F;
		local276[1] = 0.0F;
		local276[4] = 0.0F;
		local276[7] = 0.0F;
		local276[12] = -(((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass122_Sub2_19.anInt6621) - 1.0F;
		local276[10] = 1.0F / (this.aFloat158 - this.aFloat159);
		local276[11] = 0.0F;
		local276[13] = 1.0F - ((float) (arg3 * 1024) / 128.0F + (float) 0) / (float) this.aClass122_Sub2_19.anInt6649;
		local276[8] = 0.0F;
		local276[6] = 0.0F;
		local271.method6970(1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
		this.aClass122_Sub2_19.method5583();
		this.aClass122_Sub2_19.method5638();
		if ((this.anInt8190 & 0x7) == 0) {
			this.aClass122_Sub2_19.method5633(false);
		} else {
			this.aClass122_Sub2_19.method5633(true);
			this.aClass122_Sub2_19.method5647();
		}
		this.aClass122_Sub2_19.method5572(false);
		this.aClass122_Sub2_19.method5665(this.anInterface5_14, 0);
		this.aClass122_Sub2_19.method5665(this.anInterface5_15, 1);
		this.aClass122_Sub2_19.method5573(this.aClass170_20);
		this.aClass122_Sub2_19.method5669(Static354.aClass22_4, local19, local25 + 1 - local23, local23, local21 / 3, 0);
		this.aClass122_Sub2_19.method5572(true);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method6745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		@Pc(8) int local8 = arg9.length;
		@Pc(13) int[] local13 = new int[local8 * 3];
		@Pc(18) int[] local18 = new int[local8 * 3];
		@Pc(23) int[] local23 = new int[local8 * 3];
		@Pc(28) int[] local28 = new int[local8 * 3];
		@Pc(33) int[] local33 = new int[local8 * 3];
		@Pc(38) int[] local38 = new int[local8 * 3];
		@Pc(47) int[] local47 = arg3 == null ? null : new int[local8 * 3];
		@Pc(56) int[] local56 = arg5 == null ? null : new int[local8 * 3];
		@Pc(58) int local58 = 0;
		for (@Pc(60) int local60 = 0; local60 < local8; local60++) {
			@Pc(66) int local66 = arg6[local60];
			@Pc(70) int local70 = arg7[local60];
			@Pc(74) int local74 = arg8[local60];
			local13[local58] = arg2[local66];
			local18[local58] = arg4[local66];
			local23[local58] = arg9[local60];
			local33[local58] = arg11[local60];
			local38[local58] = arg12[local60];
			if (arg10 != null) {
				local28[local58] = arg10[local60];
			}
			if (arg3 != null) {
				local47[local58] = arg3[local66];
			}
			if (arg5 != null) {
				local56[local58] = arg5[local66];
			}
			local58++;
			local13[local58] = arg2[local70];
			local18[local58] = arg4[local70];
			local23[local58] = arg9[local60];
			local33[local58] = arg11[local60];
			local38[local58] = arg12[local60];
			if (arg10 != null) {
				local28[local58] = arg10[local60];
			}
			if (arg3 != null) {
				local47[local58] = arg3[local70];
			}
			if (arg5 != null) {
				local56[local58] = arg5[local70];
			}
			local58++;
			local13[local58] = arg2[local74];
			local18[local58] = arg4[local74];
			local23[local58] = arg9[local60];
			local33[local58] = arg11[local60];
			local38[local58] = arg12[local60];
			if (arg10 != null) {
				local28[local58] = arg10[local60];
			}
			if (arg3 != null) {
				local47[local58] = arg3[local74];
			}
			if (arg5 != null) {
				local56[local58] = arg5[local74];
			}
			local58++;
		}
		this.IA(arg0, arg1, local13, local47, local18, local56, local23, local28, local33, local38, arg13, arg14, arg15, false);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(ZIIIII[[Z)V")
	private void method6757(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) boolean[][] arg4) {
		if (this.aClass1_Sub32Array1 == null) {
			return;
		}
		@Pc(19) int local19 = arg3 + arg3 + 1;
		@Pc(23) int local23 = local19 * local19;
		if (local23 > Static66.anIntArray151.length) {
			Static66.anIntArray151 = new int[local23];
		}
		@Pc(38) int local38 = arg2 - arg3;
		@Pc(40) int local40 = local38;
		if (local38 < 0) {
			local38 = 0;
		}
		@Pc(51) int local51 = arg1 - arg3;
		@Pc(53) int local53 = local51;
		if (local51 < 0) {
			local51 = 0;
		}
		@Pc(65) int local65 = arg2 + arg3;
		if (local65 > super.anInt8174 - 1) {
			local65 = super.anInt8174 - 1;
		}
		@Pc(81) int local81 = arg1 + arg3;
		if (local81 > super.anInt8177 - 1) {
			local81 = super.anInt8177 - 1;
		}
		Static229.anInt4586 = 0;
		for (@Pc(96) int local96 = local38; local96 <= local65; local96++) {
			@Pc(105) boolean[] local105 = arg4[local96 - local40];
			for (@Pc(107) int local107 = local51; local107 <= local81; local107++) {
				if (local105[local107 - local53]) {
					Static66.anIntArray151[Static229.anInt4586++] = super.anInt8174 * local107 + local96;
				}
			}
		}
		this.aClass122_Sub2_19.method5639();
		this.aClass122_Sub2_19.method5629();
		this.aClass122_Sub2_19.method5633((this.anInt8190 & 0x7) != 0);
		this.aClass122_Sub2_19.method5622(false, false, -1);
		this.aClass122_Sub2_19.method5665(this.anInterface5_14, 0);
		for (@Pc(191) int local191 = 0; local191 < this.aClass1_Sub32Array1.length; local191++) {
			this.aClass1_Sub32Array1[local191].method4780(Static66.anIntArray151, Static229.anInt4586);
		}
		@Pc(216) Class118_Sub3 local216 = this.aClass122_Sub2_19.method5654();
		local216.oa(0, -1, 0);
		this.aClass122_Sub2_19.method5638();
		if (!this.aClass37_90.method968()) {
			@Pc(234) int local234 = this.aClass122_Sub2_19.anInt6692;
			@Pc(238) int local238 = this.aClass122_Sub2_19.anInt6702;
			this.aClass122_Sub2_19.E(0, local238, this.aClass122_Sub2_19.anInt6691);
			this.aClass122_Sub2_19.method5633(false);
			this.aClass122_Sub2_19.method5551(false);
			this.aClass122_Sub2_19.method5650(128);
			this.aClass122_Sub2_19.method5622(false, false, -2);
			this.aClass122_Sub2_19.method5651(this.aClass122_Sub2_19.anInterface15_3);
			this.aClass122_Sub2_19.method5605(Static449.aClass271_4, Static486.aClass271_5);
			this.aClass122_Sub2_19.method5575(0, Static312.aClass181_4);
			this.aClass122_Sub2_19.method5585(Static30.aClass181_1, 0);
			for (@Pc(298) Class1 local298 = this.aClass37_90.method977(); local298 != null; local298 = this.aClass37_90.method971()) {
				@Pc(303) Class1_Sub42 local303 = (Class1_Sub42) local298;
				local303.method6519(arg1, arg2, arg3, arg4);
			}
			this.aClass122_Sub2_19.method5575(0, Static162.aClass181_2);
			this.aClass122_Sub2_19.method5585(Static162.aClass181_2, 0);
			this.aClass122_Sub2_19.method5651(null);
			this.aClass122_Sub2_19.E(local234, local238, this.aClass122_Sub2_19.anInt6691);
		}
		if (this.aClass176_2 != null) {
			this.aClass122_Sub2_19.method5665(this.anInterface5_14, 0);
			this.aClass122_Sub2_19.method5665(this.anInterface5_15, 1);
			this.aClass122_Sub2_19.method5573(this.aClass170_20);
			this.aClass176_2.method4397(arg2, arg4, arg3, arg1, arg0);
		}
	}
}
