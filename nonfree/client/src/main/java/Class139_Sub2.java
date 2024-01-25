import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public final class Class139_Sub2 extends Class139 {

	@OriginalMember(owner = "client!oj", name = "A", descriptor = "I")
	private int anInt6567;

	@OriginalMember(owner = "client!oj", name = "C", descriptor = "I")
	private int anInt6568;

	@OriginalMember(owner = "client!oj", name = "J", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!oj", name = "W", descriptor = "Lclient!rca;")
	private Class280 aClass280_9;

	@OriginalMember(owner = "client!oj", name = "Y", descriptor = "[Lclient!eea;")
	private Class3_Sub21[] aClass3_Sub21Array1;

	@OriginalMember(owner = "client!oj", name = "ab", descriptor = "Lclient!rca;")
	public Class280 aClass280_10;

	@OriginalMember(owner = "client!oj", name = "bb", descriptor = "Lclient!rca;")
	public Class280 aClass280_11;

	@OriginalMember(owner = "client!oj", name = "kb", descriptor = "Lclient!rca;")
	public Class280 aClass280_12;

	@OriginalMember(owner = "client!oj", name = "lb", descriptor = "I")
	private int lb;

	@OriginalMember(owner = "client!oj", name = "mb", descriptor = "Lclient!el;")
	private Interface7 anInterface7_3;

	@OriginalMember(owner = "client!oj", name = "ob", descriptor = "I")
	private int anInt6582;

	@OriginalMember(owner = "client!oj", name = "O", descriptor = "Lclient!hga;")
	private final Class130 aClass130_39 = new Class130();

	@OriginalMember(owner = "client!oj", name = "M", descriptor = "I")
	private final int anInt6572 = this.anInt8176 - 2;

	@OriginalMember(owner = "client!oj", name = "s", descriptor = "Lclient!us;")
	public final Class43_Sub3 aClass43_Sub3_27;

	@OriginalMember(owner = "client!oj", name = "X", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!oj", name = "z", descriptor = "I")
	private final int anInt6566;

	@OriginalMember(owner = "client!oj", name = "eb", descriptor = "[[F")
	private float[][] aFloatArrayArray9;

	@OriginalMember(owner = "client!oj", name = "db", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!oj", name = "L", descriptor = "[[S")
	public final short[][] aShortArrayArray66;

	@OriginalMember(owner = "client!oj", name = "t", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!oj", name = "u", descriptor = "[[B")
	private final byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!oj", name = "G", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!oj", name = "K", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!oj", name = "D", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!oj", name = "I", descriptor = "I")
	public final int anInt6571;

	@OriginalMember(owner = "client!oj", name = "E", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!oj", name = "B", descriptor = "[[[Lclient!eea;")
	private Class3_Sub21[][][] aClass3_Sub21ArrayArrayArray1;

	@OriginalMember(owner = "client!oj", name = "jb", descriptor = "[[B")
	private byte[][] aByteArrayArray20;

	@OriginalMember(owner = "client!oj", name = "ib", descriptor = "Lclient!sl;")
	private Class310 aClass310_26;

	@OriginalMember(owner = "client!oj", name = "w", descriptor = "Lclient!pj;")
	private Class261 aClass261_1;

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lclient!us;IIII[[I[[II)V")
	public Class139_Sub2(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass43_Sub3_27 = arg0;
		this.aFloatArrayArray7 = new float[super.anInt8179 + 1][super.anInt8180 + 1];
		this.anInt6566 = 0x1 << this.anInt6572;
		this.aFloatArrayArray9 = new float[super.anInt8179 + 1][super.anInt8180 + 1];
		this.aFloatArrayArray8 = new float[super.anInt8179 + 1][super.anInt8180 + 1];
		this.aShortArrayArray66 = new short[arg3 * arg4][];
		this.anIntArrayArrayArray8 = new int[arg3][arg4][];
		this.aByteArrayArray19 = new byte[arg3][arg4];
		this.anIntArrayArrayArray11 = new int[arg3][arg4][];
		this.anIntArrayArrayArray13 = new int[arg3][arg4][];
		this.anIntArrayArrayArray9 = new int[arg3][arg4][];
		this.anInt6571 = arg2;
		this.anIntArrayArrayArray10 = new int[arg3][arg4][];
		this.aClass3_Sub21ArrayArrayArray1 = new Class3_Sub21[arg3][arg4][];
		this.aByteArrayArray20 = new byte[arg3 + 1][arg4 + 1];
		for (@Pc(115) int local115 = 1; local115 < super.anInt8180; local115++) {
			for (@Pc(119) int local119 = 1; super.anInt8179 > local119; local119++) {
				@Pc(137) int local137 = arg6[local119 + 1][local115] - arg6[local119 - 1][local115];
				@Pc(154) int local154 = arg6[local119][local115 + 1] - arg6[local119][local115 - 1];
				@Pc(173) float local173 = (float) (1.0D / Math.sqrt((double) (local154 * local154 + arg7 * 4 * arg7 + local137 * local137)));
				this.aFloatArrayArray9[local119][local115] = local173 * (float) local137;
				this.aFloatArrayArray7[local119][local115] = local173 * (float) (-arg7 * 2);
				this.aFloatArrayArray8[local119][local115] = (float) local154 * local173;
			}
		}
		this.aClass310_26 = new Class310(128);
		if ((this.anInt6571 & 0x10) != 0) {
			this.aClass261_1 = new Class261(this.aClass43_Sub3_27, this);
		}
	}

	@OriginalMember(owner = "client!oj", name = "E", descriptor = "(Lclient!ha;IIIIZ)V")
	@Override
	public void E(@OriginalArg(0) Class3_Sub3_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass261_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass43_Sub3_27.anInt8772 >> 8) >> this.aClass43_Sub3_27.anInt8734;
			@Pc(38) int local38 = arg3 - (this.aClass43_Sub3_27.anInt8771 * arg2 >> 8) >> this.aClass43_Sub3_27.anInt8734;
			this.aClass261_1.method5898(local24, local38, arg0);
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)V")
	@Override
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray20[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray20[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!oj", name = "v", descriptor = "(IILclient!ha;)Lclient!ha;")
	@Override
	public Class3_Sub3_Sub10 v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub3_Sub10 arg2) {
		if ((this.aByteArrayArray19[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt8178 >> this.aClass43_Sub3_27.anInt8734;
		@Pc(27) Class3_Sub3_Sub10_Sub1 local27 = (Class3_Sub3_Sub10_Sub1) arg2;
		@Pc(43) Class3_Sub3_Sub10_Sub1 local43;
		if (local27 != null && local27.method2711(local24, local24)) {
			local43 = local27;
			local27.method2715();
		} else {
			local43 = new Class3_Sub3_Sub10_Sub1(this.aClass43_Sub3_27, local24, local24);
		}
		local43.method2712(0, local24, 0, local24);
		this.method5636(arg1, local43, arg0);
		return local43;
	}

	@OriginalMember(owner = "client!oj", name = "DA", descriptor = "(Lclient!ha;IIIIZ)V")
	@Override
	public void DA(@OriginalArg(0) Class3_Sub3_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass261_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass43_Sub3_27.anInt8772 >> 8) >> this.aClass43_Sub3_27.anInt8734;
			@Pc(39) int local39 = arg3 - (this.aClass43_Sub3_27.anInt8771 * arg2 >> 8) >> this.aClass43_Sub3_27.anInt8734;
			this.aClass261_1.method5893(local24, arg0, local39);
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IBLclient!ffa;I)V")
	private void method5636(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub3_Sub10_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray8[arg2][arg0];
		@Pc(23) int[] local23 = this.anIntArrayArrayArray10[arg2][arg0];
		@Pc(26) int local26 = local12.length;
		if (this.aClass43_Sub3_27.anIntArray643.length < local26) {
			this.aClass43_Sub3_27.anIntArray642 = new int[local26];
			this.aClass43_Sub3_27.anIntArray643 = new int[local26];
		}
		@Pc(50) int[] local50 = this.aClass43_Sub3_27.anIntArray643;
		@Pc(54) int[] local54 = this.aClass43_Sub3_27.anIntArray642;
		for (@Pc(56) int local56 = 0; local56 < local26; local56++) {
			local50[local56] = local12[local56] >> this.aClass43_Sub3_27.anInt8734;
			local54[local56] = local23[local56] >> this.aClass43_Sub3_27.anInt8734;
		}
		@Pc(88) int local88 = 0;
		while (local26 > local88) {
			@Pc(94) int local94 = local50[local88];
			@Pc(99) int local99 = local54[local88++];
			@Pc(103) int local103 = local50[local88];
			@Pc(108) int local108 = local54[local88++];
			@Pc(112) int local112 = local50[local88];
			@Pc(117) int local117 = local54[local88++];
			if (-((local112 - local103) * (local108 + -local99)) + (local94 - local103) * (local108 + -local117) > 0) {
				arg1.method2710(local108, local94, local99, local117, local112, local103);
			}
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)V")
	@Override
	public void method6885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!oj", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg3 != null && this.anIntArrayArrayArray9 == null) {
			this.anIntArrayArrayArray9 = new int[super.anInt8179][super.anInt8180][];
		}
		if (arg5 != null && this.anIntArrayArrayArray12 == null) {
			this.anIntArrayArrayArray12 = new int[super.anInt8179][super.anInt8180][];
		}
		this.anIntArrayArrayArray8[arg0][arg1] = arg2;
		this.anIntArrayArrayArray10[arg0][arg1] = arg4;
		this.anIntArrayArrayArray11[arg0][arg1] = arg6;
		this.anIntArrayArrayArray13[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray12 != null) {
			this.anIntArrayArrayArray12[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray9 != null) {
			this.anIntArrayArrayArray9[arg0][arg1] = arg3;
		}
		@Pc(88) Class3_Sub21[] local88 = this.aClass3_Sub21ArrayArrayArray1[arg0][arg1] = new Class3_Sub21[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) arg8[local90] | (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42 | (long) (arg9[local90] << 14);
			@Pc(125) Class3 local125;
			for (local125 = this.aClass310_26.method6601(local119); local125 != null; local125 = this.aClass310_26.method6600()) {
				@Pc(130) Class3_Sub21 local130 = (Class3_Sub21) local125;
				if (local130.anInt2631 == arg8[local90] && local130.aFloat40 == (float) arg9[local90] && arg10 == local130.anInt2625 && local130.anInt2632 == arg11 && local130.anInt2634 == arg12) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class3_Sub21(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass310_26.method6603(local88[local90], local119);
			} else {
				local88[local90] = (Class3_Sub21) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray19[arg0][arg1] = (byte) (this.aByteArrayArray19[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.lb) {
			this.lb = arg6.length;
		}
		this.anInt6582 += arg6.length;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "([[ZZIBIII)V")
	private void method5637(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (this.aClass3_Sub21Array1 == null) {
			return;
		}
		@Pc(14) int local14 = arg3 + arg3 + 1;
		@Pc(18) int local18 = local14 * local14;
		if (local18 > this.aClass43_Sub3_27.anIntArray644.length) {
			this.aClass43_Sub3_27.anIntArray644 = new int[local18];
		}
		if (this.aClass43_Sub3_27.aClass3_Sub11_Sub2_3.aByteArray36.length < this.anInt6568 * 2) {
			this.aClass43_Sub3_27.aClass3_Sub11_Sub2_3 = new Class3_Sub11_Sub2(this.anInt6568 * 2);
		}
		@Pc(62) int local62 = arg2 - arg3;
		@Pc(64) int local64 = local62;
		if (local62 < 0) {
			local62 = 0;
		}
		@Pc(73) int local73 = arg4 - arg3;
		@Pc(75) int local75 = local73;
		if (local73 < 0) {
			local73 = 0;
		}
		@Pc(83) int local83 = arg3 + arg2;
		if (local83 > super.anInt8179 - 1) {
			local83 = super.anInt8179 - 1;
		}
		@Pc(103) int local103 = arg4 + arg3;
		if (local103 > super.anInt8180 - 1) {
			local103 = super.anInt8180 - 1;
		}
		@Pc(120) int local120 = 0;
		@Pc(124) int[] local124 = this.aClass43_Sub3_27.anIntArray644;
		@Pc(137) int local137;
		for (@Pc(126) int local126 = local62; local126 <= local83; local126++) {
			@Pc(135) boolean[] local135 = arg0[local126 - local64];
			for (local137 = local73; local137 <= local103; local137++) {
				if (local135[local137 - local75]) {
					local124[local120++] = local126 + local137 * super.anInt8179;
				}
			}
		}
		if (arg5 == -1) {
			this.aClass43_Sub3_27.method7223();
		} else {
			this.aClass43_Sub3_27.method7256((float) arg5);
			this.aClass43_Sub3_27.method7219();
		}
		this.aClass43_Sub3_27.method7298((this.anInt6571 & 0x7) != 0);
		for (@Pc(207) int local207 = 0; local207 < this.aClass3_Sub21Array1.length; local207++) {
			this.aClass3_Sub21Array1[local207].method2373(local124, local120);
		}
		if (!this.aClass130_39.method3542()) {
			local137 = this.aClass43_Sub3_27.anInt8766;
			@Pc(240) int local240 = this.aClass43_Sub3_27.anInt8746;
			this.aClass43_Sub3_27.pa(0, local240, this.aClass43_Sub3_27.anInt8767);
			this.aClass43_Sub3_27.method7298(false);
			this.aClass43_Sub3_27.method7239(false);
			this.aClass43_Sub3_27.method7222(128);
			this.aClass43_Sub3_27.method7294(-2);
			this.aClass43_Sub3_27.method7220(this.aClass43_Sub3_27.aClass34_Sub2_5);
			this.aClass43_Sub3_27.method7287(7681, 8448);
			this.aClass43_Sub3_27.method7225(0, 770, 34166);
			this.aClass43_Sub3_27.method7282(34167, 0);
			for (@Pc(300) Class3 local300 = this.aClass130_39.method3543(); local300 != null; local300 = this.aClass130_39.method3551()) {
				@Pc(305) Class3_Sub38 local305 = (Class3_Sub38) local300;
				local305.method6030(arg0, arg2, arg3, arg4);
			}
			this.aClass43_Sub3_27.method7225(0, 768, 5890);
			this.aClass43_Sub3_27.method7282(5890, 0);
			this.aClass43_Sub3_27.method7220(null);
			this.aClass43_Sub3_27.pa(local137, local240, this.aClass43_Sub3_27.anInt8767);
		}
		if (this.aClass261_1 == null) {
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		this.aClass43_Sub3_27.method7303(this.aClass280_12, this.aClass280_10, null, null);
		this.aClass261_1.method5897(arg1, arg2, arg3, arg4, arg0);
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!oj", name = "BA", descriptor = "()V")
	@Override
	public void BA() {
		if (this.anInt6582 > 0) {
			@Pc(18) byte[][] local18 = new byte[super.anInt8179 + 1][super.anInt8180 + 1];
			@Pc(24) int local24;
			for (@Pc(20) int local20 = 1; super.anInt8179 > local20; local20++) {
				for (local24 = 1; local24 < super.anInt8180; local24++) {
					local18[local20][local24] = (byte) ((this.aByteArrayArray20[local20][local24] >> 1) + (this.aByteArrayArray20[local20 - 1][local24] >> 2) + (this.aByteArrayArray20[local20 + 1][local24] >> 3) + (this.aByteArrayArray20[local20][local24 - 1] >> 2) + (this.aByteArrayArray20[local20][local24 + 1] >> 3));
				}
			}
			this.aClass3_Sub21Array1 = new Class3_Sub21[this.aClass310_26.method6608()];
			this.aClass310_26.method6604(this.aClass3_Sub21Array1);
			for (local24 = 0; local24 < this.aClass3_Sub21Array1.length; local24++) {
				this.aClass3_Sub21Array1[local24].method2369(this.anInt6582);
			}
			@Pc(132) int local132 = 24;
			if (this.anIntArrayArrayArray12 != null) {
				local132 += 4;
			}
			if ((this.anInt6571 & 0x7) != 0) {
				local132 += 12;
			}
			@Pc(155) NativeHeapBuffer local155 = this.aClass43_Sub3_27.aNativeHeap5.a(local132 * this.anInt6582, false);
			@Pc(160) Stream local160 = new Stream(local155);
			@Pc(164) Class3_Sub21[] local164 = new Class3_Sub21[this.anInt6582];
			@Pc(171) int local171 = Static247.method4032(this.anInt6582 / 4);
			if (local171 < 1) {
				local171 = 1;
			}
			@Pc(183) Class310 local183 = new Class310(local171);
			@Pc(187) Class3_Sub21[] local187 = new Class3_Sub21[this.lb];
			@Pc(193) int local193;
			for (@Pc(189) int local189 = 0; local189 < super.anInt8179; local189++) {
				for (local193 = 0; super.anInt8180 > local193; local193++) {
					if (this.anIntArrayArrayArray11[local189][local193] != null) {
						@Pc(209) Class3_Sub21[] local209 = this.aClass3_Sub21ArrayArrayArray1[local189][local193];
						@Pc(216) int[] local216 = this.anIntArrayArrayArray8[local189][local193];
						@Pc(223) int[] local223 = this.anIntArrayArrayArray10[local189][local193];
						@Pc(230) int[] local230 = this.anIntArrayArrayArray13[local189][local193];
						@Pc(237) int[] local237 = this.anIntArrayArrayArray11[local189][local193];
						@Pc(249) int[] local249 = this.anIntArrayArrayArray9 == null ? null : this.anIntArrayArrayArray9[local189][local193];
						if (local230 == null) {
							local230 = local237;
						}
						@Pc(265) int[] local265 = this.anIntArrayArrayArray12 == null ? null : this.anIntArrayArrayArray12[local189][local193];
						@Pc(272) float local272 = this.aFloatArrayArray9[local189][local193];
						@Pc(279) float local279 = this.aFloatArrayArray7[local189][local193];
						@Pc(286) float local286 = this.aFloatArrayArray8[local189][local193];
						@Pc(295) float local295 = this.aFloatArrayArray9[local189][local193 + 1];
						@Pc(304) float local304 = this.aFloatArrayArray7[local189][local193 + 1];
						@Pc(313) float local313 = this.aFloatArrayArray8[local189][local193 + 1];
						@Pc(324) float local324 = this.aFloatArrayArray9[local189 + 1][local193 + 1];
						@Pc(335) float local335 = this.aFloatArrayArray7[local189 + 1][local193 + 1];
						@Pc(346) float local346 = this.aFloatArrayArray8[local189 + 1][local193 + 1];
						@Pc(355) float local355 = this.aFloatArrayArray9[local189 + 1][local193];
						@Pc(364) float local364 = this.aFloatArrayArray7[local189 + 1][local193];
						@Pc(373) float local373 = this.aFloatArrayArray8[local189 + 1][local193];
						@Pc(381) int local381 = local18[local189][local193] & 0xFF;
						@Pc(391) int local391 = local18[local189][local193 + 1] & 0xFF;
						@Pc(403) int local403 = local18[local189 + 1][local193 + 1] & 0xFF;
						@Pc(413) int local413 = local18[local189 + 1][local193] & 0xFF;
						@Pc(415) int local415 = 0;
						@Pc(425) int local425;
						label337: for (@Pc(417) int local417 = 0; local417 < local237.length; local417++) {
							@Pc(423) Class3_Sub21 local423 = local209[local417];
							for (local425 = 0; local425 < local415; local425++) {
								if (local423 == local187[local425]) {
									continue label337;
								}
							}
							local187[local415++] = local423;
						}
						@Pc(466) short[] local466 = this.aShortArrayArray66[local189 + local193 * super.anInt8179] = new short[local237.length];
						for (local425 = 0; local425 < local237.length; local425++) {
							@Pc(480) int local480 = (local189 << super.anInt8176) + local216[local425];
							@Pc(489) int local489 = (local193 << super.anInt8176) + local223[local425];
							@Pc(494) int local494 = local480 >> this.anInt6572;
							@Pc(499) int local499 = local489 >> this.anInt6572;
							@Pc(503) int local503 = local237[local425];
							@Pc(507) int local507 = local230[local425];
							@Pc(515) int local515 = local249 == null ? 0 : local249[local425];
							@Pc(533) long local533 = (long) (local494 << 16) | (long) local507 << 48 | (long) local503 << 32 | (long) local499;
							@Pc(537) int local537 = local216[local425];
							@Pc(541) int local541 = local223[local425];
							@Pc(543) byte local543 = 74;
							@Pc(545) int local545 = 0;
							@Pc(547) float local547 = 1.0F;
							@Pc(570) float local570;
							@Pc(574) float local574;
							@Pc(572) float local572;
							@Pc(648) float local648;
							@Pc(568) int local568;
							if (local537 == 0 && local541 == 0) {
								local572 = local286;
								local570 = local272;
								local574 = local279;
								local568 = local543 - local381;
							} else if (local537 == 0 && super.anInt8178 == local541) {
								local568 = local543 - local391;
								local570 = local295;
								local572 = local313;
								local574 = local304;
							} else if (local537 == super.anInt8178 && super.anInt8178 == local541) {
								local572 = local346;
								local574 = local335;
								local568 = local543 - local403;
								local570 = local324;
							} else if (local537 == super.anInt8178 && local541 == 0) {
								local570 = local355;
								local568 = local543 - local413;
								local572 = local373;
								local574 = local364;
							} else {
								@Pc(624) float local624 = (float) local537 / (float) super.anInt8178;
								@Pc(631) float local631 = (float) local541 / (float) super.anInt8178;
								@Pc(640) float local640 = (local355 - local272) * local624 + local272;
								local648 = (local364 - local279) * local624 + local279;
								@Pc(657) float local657 = (local373 - local286) * local624 + local286;
								@Pc(666) float local666 = local295 + local624 * (local324 - local295);
								@Pc(675) float local675 = (local335 - local304) * local624 + local304;
								local574 = local648 + local631 * (local675 - local648);
								@Pc(693) float local693 = local313 + local624 * (local346 - local313);
								local570 = local631 * (local666 - local640) + local640;
								local572 = local657 + (local693 - local657) * local631;
								@Pc(723) int local723 = local381 + (local537 * (local413 - local381) >> super.anInt8176);
								@Pc(735) int local735 = local391 + ((local403 - local391) * local537 >> super.anInt8176);
								local568 = local543 - (local541 * (local735 - local723) >> super.anInt8176) - local723;
							}
							if (local503 != -1) {
								@Pc(771) int local771 = (local503 & 0x7F) * local568 >> 7;
								if (local771 < 2) {
									local771 = 2;
								} else if (local771 > 126) {
									local771 = 126;
								}
								if ((this.anInt6571 & 0x7) == 0) {
									local547 = this.aClass43_Sub3_27.aFloatArray64[0] * local570 + this.aClass43_Sub3_27.aFloatArray64[1] * local574 + this.aClass43_Sub3_27.aFloatArray64[2] * local572;
									local547 = local547 * (local547 > 0.0F ? this.aClass43_Sub3_27.aFloat210 : this.aClass43_Sub3_27.aFloat219) + this.aClass43_Sub3_27.aFloat208;
								}
								local545 = Static213.anIntArray342[local503 & 0xFF80 | local771];
							}
							@Pc(844) Class3 local844 = null;
							if ((this.anInt6566 - 1 & local480) == 0 && (local489 & this.anInt6566 - 1) == 0) {
								local844 = local183.method6601(local533);
							}
							@Pc(877) int local877;
							@Pc(941) int local941;
							if (local844 == null) {
								if (local507 == local503) {
									local941 = local545;
								} else {
									@Pc(917) int local917 = local568 * (local507 & 0x7F) >> 7;
									if (local917 < 2) {
										local917 = 2;
									} else if (local917 > 126) {
										local917 = 126;
									}
									local941 = Static213.anIntArray342[local507 & 0xFF80 | local917];
									if ((this.anInt6571 & 0x7) == 0) {
										local648 = this.aClass43_Sub3_27.aFloatArray64[0] * local570 + local574 * this.aClass43_Sub3_27.aFloatArray64[1] + local572 * this.aClass43_Sub3_27.aFloatArray64[2];
										local648 = (local547 > 0.0F ? this.aClass43_Sub3_27.aFloat210 : this.aClass43_Sub3_27.aFloat219) * local547 + this.aClass43_Sub3_27.aFloat208;
										@Pc(994) int local994 = local941 >> 16 & 0xFF;
										@Pc(1000) int local1000 = local941 >> 8 & 0xFF;
										@Pc(1004) int local1004 = local941 & 0xFF;
										local994 = (int) ((float) local994 * local648);
										local1000 = (int) ((float) local1000 * local648);
										if (local994 < 0) {
											local994 = 0;
										} else if (local994 > 255) {
											local994 = 255;
										}
										local1004 = (int) ((float) local1004 * local648);
										if (local1000 < 0) {
											local1000 = 0;
										} else if (local1000 > 255) {
											local1000 = 255;
										}
										if (local1004 < 0) {
											local1004 = 0;
										} else if (local1004 > 255) {
											local1004 = 255;
										}
										local941 = local1004 | local1000 << 8 | local994 << 16;
									}
								}
								if (this.aClass43_Sub3_27.aBoolean671) {
									local160.a((float) local480);
									local160.a((float) (this.method6890(local480, local489) + local515));
									local160.a((float) local489);
									local160.a((byte) (local941 >> 16));
									local160.a((byte) (local941 >> 8));
									local160.a((byte) local941);
									local160.a(-1);
									local160.a((float) local480);
									local160.a((float) local489);
									if (this.anIntArrayArrayArray12 != null) {
										local160.a((float) (local265 == null ? 0 : local265[local425] - 1));
									}
									if ((this.anInt6571 & 0x7) != 0) {
										local160.a(local570);
										local160.a(local574);
										local160.a(local572);
									}
								} else {
									local160.b((float) local480);
									local160.b((float) (this.method6890(local480, local489) + local515));
									local160.b((float) local489);
									local160.a((byte) (local941 >> 16));
									local160.a((byte) (local941 >> 8));
									local160.a((byte) local941);
									local160.a(-1);
									local160.b((float) local480);
									local160.b((float) local489);
									if (this.anIntArrayArrayArray12 != null) {
										local160.b((float) (local265 == null ? 0 : local265[local425] - 1));
									}
									if ((this.anInt6571 & 0x7) != 0) {
										local160.b(local570);
										local160.b(local574);
										local160.b(local572);
									}
								}
								local877 = this.anInt6567++;
								local466[local425] = (short) local877;
								if (local503 != -1) {
									local164[local877] = local209[local425];
								}
								local183.method6603(new Class3_Sub26(local466[local425]), local533);
							} else {
								local466[local425] = ((Class3_Sub26) local844).aShort53;
								local877 = local466[local425] & 0xFFFF;
								if (local503 != -1 && local164[local877].aLong273 > local209[local425].aLong273) {
									local164[local877] = local209[local425];
								}
							}
							for (local941 = 0; local941 < local415; local941++) {
								local187[local941].method2371(local877, local568, local547, local545);
							}
							this.anInt6568++;
						}
					}
				}
			}
			for (local193 = 0; local193 < this.anInt6567; local193++) {
				@Pc(1316) Class3_Sub21 local1316 = local164[local193];
				if (local1316 != null) {
					local1316.method2366(local193);
				}
			}
			@Pc(1353) int local1353;
			for (@Pc(1333) int local1333 = 0; super.anInt8179 > local1333; local1333++) {
				for (@Pc(1337) int local1337 = 0; local1337 < super.anInt8180; local1337++) {
					@Pc(1349) short[] local1349 = this.aShortArrayArray66[super.anInt8179 * local1337 + local1333];
					if (local1349 != null) {
						local1353 = 0;
						@Pc(1355) int local1355 = 0;
						while (local1349.length > local1355) {
							@Pc(1364) int local1364 = local1349[local1355++] & 0xFFFF;
							@Pc(1371) int local1371 = local1349[local1355++] & 0xFFFF;
							@Pc(1378) int local1378 = local1349[local1355++] & 0xFFFF;
							@Pc(1382) Class3_Sub21 local1382 = local164[local1364];
							@Pc(1386) Class3_Sub21 local1386 = local164[local1371];
							@Pc(1390) Class3_Sub21 local1390 = local164[local1378];
							@Pc(1392) Class3_Sub21 local1392 = null;
							if (local1382 != null) {
								local1392 = local1382;
								local1382.method2367(local1333, local1353, local1337);
							}
							if (local1386 != null) {
								local1386.method2367(local1333, local1353, local1337);
								if (local1392 == null || local1392.aLong273 > local1386.aLong273) {
									local1392 = local1386;
								}
							}
							if (local1390 != null) {
								local1390.method2367(local1333, local1353, local1337);
								if (local1392 == null || local1390.aLong273 < local1392.aLong273) {
									local1392 = local1390;
								}
							}
							if (local1392 != null) {
								if (local1382 != null) {
									local1392.method2366(local1364);
								}
								if (local1386 != null) {
									local1392.method2366(local1371);
								}
								if (local1390 != null) {
									local1392.method2366(local1378);
								}
								local1392.method2367(local1333, local1353, local1337);
							}
							local1353++;
						}
					}
				}
			}
			local160.a();
			this.anInterface7_3 = this.aClass43_Sub3_27.method7302(local160.b(), local132, local155);
			this.aClass280_10 = new Class280(this.anInterface7_3, 5126, 3, 0);
			this.aClass280_9 = new Class280(this.anInterface7_3, 5121, 4, 12);
			@Pc(1543) byte local1543;
			if (this.anIntArrayArrayArray12 == null) {
				this.aClass280_12 = new Class280(this.anInterface7_3, 5126, 2, 16);
				local1543 = 24;
			} else {
				this.aClass280_12 = new Class280(this.anInterface7_3, 5126, 3, 16);
				local1543 = 28;
			}
			if ((this.anInt6571 & 0x7) != 0) {
				this.aClass280_11 = new Class280(this.anInterface7_3, 5126, 3, local1543);
			}
			@Pc(1580) long[] local1580 = new long[this.aClass3_Sub21Array1.length];
			for (local1353 = 0; local1353 < this.aClass3_Sub21Array1.length; local1353++) {
				@Pc(1589) Class3_Sub21 local1589 = this.aClass3_Sub21Array1[local1353];
				local1580[local1353] = local1589.aLong273;
				local1589.method2370(this.anInt6567);
			}
			Static234.method3940(this.aClass3_Sub21Array1, local1580);
			if (this.aClass261_1 != null) {
				this.aClass261_1.method5899();
			}
		} else {
			this.aClass261_1 = null;
		}
		this.anIntArrayArrayArray8 = this.anIntArrayArrayArray10 = null;
		this.anIntArrayArrayArray13 = null;
		this.aClass3_Sub21ArrayArrayArray1 = null;
		this.anIntArrayArrayArray11 = null;
		this.aClass310_26 = null;
		this.aByteArrayArray20 = null;
		this.anIntArrayArrayArray12 = null;
		this.aFloatArrayArray9 = this.aFloatArrayArray7 = this.aFloatArrayArray8 = null;
		this.anIntArrayArrayArray9 = null;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!ff;[I)V")
	@Override
	public void method6883(@OriginalArg(0) Class3_Sub22 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass130_39.method3548(new Class3_Sub38(this.aClass43_Sub3_27, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method6884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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
			local28[local58] = arg10 == null ? arg9[local60] : arg10[local60];
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
			local28[local58] = arg10 == null ? arg9[local60] : arg10[local60];
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
			local28[local58] = arg10 == null ? arg9[local60] : arg10[local60];
			if (arg3 != null) {
				local47[local58] = arg3[local74];
			}
			if (arg5 != null) {
				local56[local58] = arg5[local74];
			}
			local58++;
		}
		this.O(arg0, arg1, local13, local47, local18, local56, local23, local28, local33, local38, arg13, arg14, arg15, false);
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method6891(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt6582 <= 0) {
			return;
		}
		this.aClass43_Sub3_27.method7278();
		this.aClass43_Sub3_27.method7248(false);
		this.aClass43_Sub3_27.method7298(false);
		this.aClass43_Sub3_27.method7245(false);
		this.aClass43_Sub3_27.method7239(false);
		this.aClass43_Sub3_27.method7222(0);
		this.aClass43_Sub3_27.method7294(-2);
		this.aClass43_Sub3_27.method7220(null);
		Static40.aFloatArray27[12] = -(((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass43_Sub3_27.anInt8666) - 1.0F;
		Static40.aFloatArray27[9] = 0.0F;
		Static40.aFloatArray27[3] = 0.0F;
		Static40.aFloatArray27[5] = (float) 1024 / ((float) super.anInt8178 * 128.0F * (float) this.aClass43_Sub3_27.anInt8564);
		Static40.aFloatArray27[1] = 0.0F;
		Static40.aFloatArray27[15] = 1.0F;
		Static40.aFloatArray27[7] = 0.0F;
		Static40.aFloatArray27[2] = 0.0F;
		Static40.aFloatArray27[11] = 0.0F;
		Static40.aFloatArray27[8] = 0.0F;
		Static40.aFloatArray27[0] = (float) 1024 / ((float) this.aClass43_Sub3_27.anInt8666 * (float) super.anInt8178 * 128.0F);
		Static40.aFloatArray27[14] = 0.0F;
		Static40.aFloatArray27[13] = 1.0F - ((float) (arg3 * 1024) / 128.0F + (float) 0) / (float) this.aClass43_Sub3_27.anInt8564;
		Static40.aFloatArray27[4] = 0.0F;
		Static40.aFloatArray27[6] = 0.0F;
		Static40.aFloatArray27[10] = 0.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static40.aFloatArray27, 0);
		Static40.aFloatArray27[14] = 0.0F;
		Static40.aFloatArray27[4] = 0.0F;
		Static40.aFloatArray27[1] = 0.0F;
		Static40.aFloatArray27[8] = 0.0F;
		Static40.aFloatArray27[6] = 1.0F;
		Static40.aFloatArray27[5] = 0.0F;
		Static40.aFloatArray27[11] = 0.0F;
		Static40.aFloatArray27[9] = 1.0F;
		Static40.aFloatArray27[2] = 0.0F;
		Static40.aFloatArray27[12] = 0.0F;
		Static40.aFloatArray27[3] = 0.0F;
		Static40.aFloatArray27[7] = 0.0F;
		Static40.aFloatArray27[15] = 1.0F;
		Static40.aFloatArray27[13] = 0.0F;
		Static40.aFloatArray27[0] = 1.0F;
		Static40.aFloatArray27[10] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static40.aFloatArray27, 0);
		if ((this.anInt6571 & 0x7) == 0) {
			this.aClass43_Sub3_27.method7298(false);
		} else {
			this.aClass43_Sub3_27.method7298(true);
			this.aClass43_Sub3_27.method7228();
		}
		this.aClass43_Sub3_27.method7303(this.aClass280_12, this.aClass280_10, this.aClass280_9, this.aClass280_11);
		if (this.aClass43_Sub3_27.aClass3_Sub11_Sub2_3.aByteArray36.length >= this.anInt6568 * 2) {
			this.aClass43_Sub3_27.aClass3_Sub11_Sub2_3.anInt3520 = 0;
		} else {
			this.aClass43_Sub3_27.aClass3_Sub11_Sub2_3 = new Class3_Sub11_Sub2(this.anInt6568 * 2);
		}
		@Pc(315) int local315 = 0;
		@Pc(319) Class3_Sub11_Sub2 local319 = this.aClass43_Sub3_27.aClass3_Sub11_Sub2_3;
		@Pc(325) int local325;
		@Pc(335) int local335;
		@Pc(337) int local337;
		@Pc(356) short[] local356;
		@Pc(360) int local360;
		if (this.aClass43_Sub3_27.aBoolean671) {
			for (local325 = arg1; local325 < arg3; local325++) {
				local335 = local325 * super.anInt8179 + arg0;
				for (local337 = arg0; local337 < arg2; local337++) {
					if (arg4[local337 - arg0][local325 - arg1]) {
						local356 = this.aShortArrayArray66[local335];
						if (local356 != null) {
							for (local360 = 0; local360 < local356.length; local360++) {
								local319.method3131(local356[local360] & 0xFFFF);
								local315++;
							}
						}
					}
					local335++;
				}
			}
		} else {
			for (local325 = arg1; local325 < arg3; local325++) {
				local335 = super.anInt8179 * local325 + arg0;
				for (local337 = arg0; local337 < arg2; local337++) {
					if (arg4[local337 - arg0][local325 - arg1]) {
						local356 = this.aShortArrayArray66[local335];
						if (local356 != null) {
							for (local360 = 0; local360 < local356.length; local360++) {
								local315++;
								local319.method3075(local356[local360] & 0xFFFF);
							}
						}
					}
					local335++;
				}
			}
		}
		if (local315 > 0) {
			@Pc(468) Class28_Sub1 local468 = new Class28_Sub1(this.aClass43_Sub3_27, 5123, local319.aByteArray36, local319.anInt3520);
			this.aClass43_Sub3_27.method7224(local468, 0, local315);
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method6887(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method5637(arg3, arg4, arg0, arg2, arg1, arg5);
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!ha;IIIIZ)Z")
	@Override
	public boolean method6881(@OriginalArg(0) Class3_Sub3_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass261_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (arg2 * this.aClass43_Sub3_27.anInt8772 >> 8) >> this.aClass43_Sub3_27.anInt8734;
			@Pc(40) int local40 = arg3 - (arg2 * this.aClass43_Sub3_27.anInt8771 >> 8) >> this.aClass43_Sub3_27.anInt8734;
			return this.aClass261_1.method5895(local25, local40, arg0);
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method6882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method5637(arg3, arg4, arg0, arg2, arg1, -1);
	}
}
