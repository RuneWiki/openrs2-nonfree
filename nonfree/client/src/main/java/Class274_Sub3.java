import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!up")
public final class Class274_Sub3 extends Class274 {

	@OriginalMember(owner = "client!up", name = "p", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!up", name = "N", descriptor = "I")
	private int anInt9745;

	@OriginalMember(owner = "client!up", name = "T", descriptor = "I")
	private int anInt9751;

	@OriginalMember(owner = "client!up", name = "Y", descriptor = "Lclient!mia;")
	public Class34 aClass34_23;

	@OriginalMember(owner = "client!up", name = "Z", descriptor = "Lclient!u;")
	private Interface26 anInterface26_17;

	@OriginalMember(owner = "client!up", name = "cb", descriptor = "I")
	private int anInt9754;

	@OriginalMember(owner = "client!up", name = "eb", descriptor = "I")
	private int anInt9755;

	@OriginalMember(owner = "client!up", name = "hb", descriptor = "Lclient!u;")
	private Interface26 anInterface26_18;

	@OriginalMember(owner = "client!up", name = "ib", descriptor = "[Lclient!ok;")
	private Class3_Sub31[] aClass3_Sub31Array1;

	@OriginalMember(owner = "client!up", name = "l", descriptor = "F")
	private float aFloat268 = -3.4028235E38F;

	@OriginalMember(owner = "client!up", name = "D", descriptor = "F")
	private float aFloat269 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!up", name = "L", descriptor = "Lclient!qia;")
	private final Class276 aClass276_60 = new Class276();

	@OriginalMember(owner = "client!up", name = "X", descriptor = "Lclient!bm;")
	public final Class33_Sub1 aClass33_Sub1_21;

	@OriginalMember(owner = "client!up", name = "y", descriptor = "I")
	private final int anInt9737;

	@OriginalMember(owner = "client!up", name = "t", descriptor = "I")
	private final int anInt9732;

	@OriginalMember(owner = "client!up", name = "E", descriptor = "[[B")
	private final byte[][] aByteArrayArray25;

	@OriginalMember(owner = "client!up", name = "db", descriptor = "[[F")
	private float[][] aFloatArrayArray15;

	@OriginalMember(owner = "client!up", name = "B", descriptor = "I")
	public final int anInt9740;

	@OriginalMember(owner = "client!up", name = "ab", descriptor = "[[B")
	private byte[][] aByteArrayArray26;

	@OriginalMember(owner = "client!up", name = "V", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray20;

	@OriginalMember(owner = "client!up", name = "fb", descriptor = "[[F")
	private float[][] aFloatArrayArray16;

	@OriginalMember(owner = "client!up", name = "J", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray19;

	@OriginalMember(owner = "client!up", name = "gb", descriptor = "[[F")
	private float[][] aFloatArrayArray17;

	@OriginalMember(owner = "client!up", name = "n", descriptor = "[[[Lclient!ok;")
	private Class3_Sub31[][][] aClass3_Sub31ArrayArrayArray1;

	@OriginalMember(owner = "client!up", name = "q", descriptor = "[[S")
	public final short[][] aShortArrayArray20;

	@OriginalMember(owner = "client!up", name = "G", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray18;

	@OriginalMember(owner = "client!up", name = "m", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!up", name = "F", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray17;

	@OriginalMember(owner = "client!up", name = "bb", descriptor = "Lclient!sga;")
	private Class307 aClass307_50;

	@OriginalMember(owner = "client!up", name = "K", descriptor = "Lclient!jga;")
	private Class158 aClass158_2;

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Lclient!bm;IIII[[I[[II)V")
	public Class274_Sub3(@OriginalArg(0) Class33_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass33_Sub1_21 = arg0;
		this.anInt9737 = super.anInt9727 - 2;
		this.anInt9732 = 0x1 << this.anInt9737;
		this.aByteArrayArray25 = new byte[arg3][arg4];
		this.aFloatArrayArray15 = new float[super.anInt9726 + 1][super.anInt9723 + 1];
		this.anInt9740 = arg2;
		this.aByteArrayArray26 = new byte[arg3 + 1][arg4 + 1];
		this.anIntArrayArrayArray20 = new int[arg3][arg4][];
		this.aFloatArrayArray16 = new float[super.anInt9726 + 1][super.anInt9723 + 1];
		this.anIntArrayArrayArray19 = new int[arg3][arg4][];
		this.aFloatArrayArray17 = new float[super.anInt9726 + 1][super.anInt9723 + 1];
		this.aClass3_Sub31ArrayArrayArray1 = new Class3_Sub31[arg3][arg4][];
		this.aShortArrayArray20 = new short[arg3 * arg4][];
		this.anIntArrayArrayArray18 = new int[arg3][arg4][];
		this.anIntArrayArrayArray15 = new int[arg3][arg4][];
		this.anIntArrayArrayArray17 = new int[arg3][arg4][];
		for (@Pc(121) int local121 = 0; super.anInt9723 >= local121; local121++) {
			for (@Pc(125) int local125 = 0; super.anInt9726 >= local125; local125++) {
				@Pc(134) int local134 = super.anIntArrayArray99[local125][local121];
				if (this.aFloat268 < (float) local134) {
					this.aFloat268 = local134;
				}
				if (this.aFloat269 > (float) local134) {
					this.aFloat269 = local134;
				}
				if (local125 > 0 && local121 > 0 && super.anInt9726 > local125 && super.anInt9723 > local121) {
					@Pc(193) int local193 = arg6[local125 + 1][local121] - arg6[local125 - 1][local121];
					@Pc(210) int local210 = arg6[local125][local121 + 1] - arg6[local125][local121 - 1];
					@Pc(229) float local229 = (float) (1.0D / Math.sqrt((double) (local210 * local210 + arg7 * 4 * arg7 + local193 * local193)));
					this.aFloatArrayArray17[local125][local121] = (float) local193 * local229;
					this.aFloatArrayArray15[local125][local121] = (float) (-arg7 * 2) * local229;
					this.aFloatArrayArray16[local125][local121] = local229 * (float) local210;
				}
			}
		}
		this.aFloat269--;
		this.aFloat268++;
		this.aClass307_50 = new Class307(128);
		if ((this.anInt9740 & 0x10) != 0) {
			this.aClass158_2 = new Class158(this.aClass33_Sub1_21, this);
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(III[[ZIIIZ)V")
	private void method8045(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6) {
		if (this.aClass3_Sub31Array1 == null) {
			return;
		}
		@Pc(11) int local11 = arg0 + arg0 + 1;
		@Pc(15) int local15 = local11 * local11;
		if (local15 > Static235.anIntArray309.length) {
			Static235.anIntArray309 = new int[local15];
		}
		@Pc(31) int local31 = arg5 - arg0;
		@Pc(33) int local33 = local31;
		if (local31 < 0) {
			local31 = 0;
		}
		@Pc(42) int local42 = arg3 - arg0;
		@Pc(44) int local44 = local42;
		if (local42 < 0) {
			local42 = 0;
		}
		@Pc(55) int local55 = arg0 + arg5;
		if (super.anInt9726 - 1 < local55) {
			local55 = super.anInt9726 - 1;
		}
		@Pc(75) int local75 = arg3 + arg0;
		Static122.anInt3105 = 0;
		if (local75 > super.anInt9723 - 1) {
			local75 = super.anInt9723 - 1;
		}
		for (@Pc(90) int local90 = local31; local90 <= local55; local90++) {
			@Pc(99) boolean[] local99 = arg2[local90 - local33];
			for (@Pc(101) int local101 = local42; local101 <= local75; local101++) {
				if (local99[local101 - local44]) {
					Static235.anIntArray309[Static122.anInt3105++] = super.anInt9726 * local101 + local90;
				}
			}
		}
		if (arg4 == -1) {
			this.aClass33_Sub1_21.method2031();
		} else {
			this.aClass33_Sub1_21.method2011((float) arg4);
			this.aClass33_Sub1_21.method2004();
		}
		this.aClass33_Sub1_21.method2014();
		this.aClass33_Sub1_21.method2044((this.anInt9740 & 0x7) != 0);
		this.aClass33_Sub1_21.method2012(false, -1, false);
		this.aClass33_Sub1_21.method2046(this.anInterface26_18, 0);
		for (@Pc(189) int local189 = 0; local189 < this.aClass3_Sub31Array1.length; local189++) {
			this.aClass3_Sub31Array1[local189].method6416(Static235.anIntArray309, Static122.anInt3105);
		}
		@Pc(214) Class47_Sub3 local214 = this.aClass33_Sub1_21.method2052();
		local214.method7863(0, -1, 0);
		this.aClass33_Sub1_21.method2042();
		if (!this.aClass276_60.method6908()) {
			@Pc(232) int local232 = this.aClass33_Sub1_21.anInt2166;
			@Pc(236) int local236 = this.aClass33_Sub1_21.anInt2170;
			this.aClass33_Sub1_21.L(0, local236, this.aClass33_Sub1_21.anInt2197);
			this.aClass33_Sub1_21.method2044(false);
			this.aClass33_Sub1_21.method2080(false);
			this.aClass33_Sub1_21.method2032(128);
			this.aClass33_Sub1_21.method2012(false, -2, false);
			this.aClass33_Sub1_21.method1987(this.aClass33_Sub1_21.anInterface3_3);
			this.aClass33_Sub1_21.method1983(Static64.aClass363_7, Static25.aClass363_1);
			this.aClass33_Sub1_21.method2098(0, Static139.aClass371_3);
			this.aClass33_Sub1_21.method1991(Static133.aClass371_2, 0);
			for (@Pc(296) Class3 local296 = this.aClass276_60.method6907(); local296 != null; local296 = this.aClass276_60.method6912()) {
				@Pc(301) Class3_Sub18 local301 = (Class3_Sub18) local296;
				local301.method2797(arg3, arg5, arg2, arg0);
			}
			this.aClass33_Sub1_21.method2098(0, Static419.aClass371_4);
			this.aClass33_Sub1_21.method1991(Static419.aClass371_4, 0);
			this.aClass33_Sub1_21.method1987(null);
			this.aClass33_Sub1_21.L(local232, local236, this.aClass33_Sub1_21.anInt2197);
		}
		if (this.aClass158_2 != null) {
			this.aClass33_Sub1_21.method2046(this.anInterface26_18, 0);
			this.aClass33_Sub1_21.method2046(this.anInterface26_17, 1);
			this.aClass33_Sub1_21.method2003(this.aClass34_23);
			this.aClass158_2.method4853(arg3, arg5, arg0, arg6, arg2);
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method8039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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
		this.U(arg0, arg1, local13, local47, local18, local56, local23, local28, local33, local38, arg13, arg14, arg15, false);
	}

	@OriginalMember(owner = "client!up", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.anInt9754 <= 0) {
			this.aClass158_2 = null;
		} else {
			@Pc(23) byte[][] local23 = new byte[super.anInt9726 + 1][super.anInt9723 + 1];
			for (@Pc(25) int local25 = 1; super.anInt9726 > local25; local25++) {
				for (@Pc(29) int local29 = 1; local29 < super.anInt9723; local29++) {
					local23[local25][local29] = (byte) ((this.aByteArrayArray26[local25][local29 + 1] >> 3) + (this.aByteArrayArray26[local25][local29 - 1] >> 2) + (this.aByteArrayArray26[local25 + 1][local29] >> 3) + (this.aByteArrayArray26[local25 + -1][local29] >> 2) + (this.aByteArrayArray26[local25][local29] >> 1));
				}
			}
			@Pc(113) Class3_Sub31[] local113 = new Class3_Sub31[this.aClass307_50.method7420()];
			this.aClass307_50.method7426(local113);
			for (@Pc(121) int local121 = 0; local121 < local113.length; local121++) {
				local113[local121].method6419(this.anInt9754);
			}
			@Pc(137) int local137 = 20;
			if (this.anIntArrayArrayArray16 != null) {
				local137 += 4;
			}
			if ((this.anInt9740 & 0x7) != 0) {
				local137 += 12;
			}
			@Pc(160) NativeHeapBuffer local160 = this.aClass33_Sub1_21.aNativeHeap4.a(this.anInt9754 * 4, false);
			@Pc(170) NativeHeapBuffer local170 = this.aClass33_Sub1_21.aNativeHeap4.a(this.anInt9754 * local137, false);
			@Pc(175) Stream local175 = new Stream(local170);
			@Pc(180) Stream local180 = new Stream(local160);
			@Pc(184) Class3_Sub31[] local184 = new Class3_Sub31[this.anInt9754];
			@Pc(191) int local191 = Static51.method1165(this.anInt9754 / 4);
			if (local191 < 1) {
				local191 = 1;
			}
			@Pc(201) Class307 local201 = new Class307(local191);
			@Pc(205) Class3_Sub31[] local205 = new Class3_Sub31[this.anInt9755];
			@Pc(211) int local211;
			for (@Pc(207) int local207 = 0; local207 < super.anInt9726; local207++) {
				for (local211 = 0; local211 < super.anInt9723; local211++) {
					if (this.anIntArrayArrayArray18[local207][local211] != null) {
						@Pc(227) Class3_Sub31[] local227 = this.aClass3_Sub31ArrayArrayArray1[local207][local211];
						@Pc(234) int[] local234 = this.anIntArrayArrayArray17[local207][local211];
						@Pc(241) int[] local241 = this.anIntArrayArrayArray15[local207][local211];
						@Pc(248) int[] local248 = this.anIntArrayArrayArray20[local207][local211];
						@Pc(255) int[] local255 = this.anIntArrayArrayArray18[local207][local211];
						@Pc(267) int[] local267 = this.anIntArrayArrayArray19 == null ? null : this.anIntArrayArrayArray19[local207][local211];
						if (local248 == null) {
							local248 = local255;
						}
						@Pc(283) int[] local283 = this.anIntArrayArrayArray16 == null ? null : this.anIntArrayArrayArray16[local207][local211];
						@Pc(290) float local290 = this.aFloatArrayArray17[local207][local211];
						@Pc(297) float local297 = this.aFloatArrayArray15[local207][local211];
						@Pc(304) float local304 = this.aFloatArrayArray16[local207][local211];
						@Pc(313) float local313 = this.aFloatArrayArray17[local207][local211 + 1];
						@Pc(322) float local322 = this.aFloatArrayArray15[local207][local211 + 1];
						@Pc(331) float local331 = this.aFloatArrayArray16[local207][local211 + 1];
						@Pc(342) float local342 = this.aFloatArrayArray17[local207 + 1][local211 + 1];
						@Pc(353) float local353 = this.aFloatArrayArray15[local207 + 1][local211 + 1];
						@Pc(364) float local364 = this.aFloatArrayArray16[local207 + 1][local211 + 1];
						@Pc(373) float local373 = this.aFloatArrayArray17[local207 + 1][local211];
						@Pc(382) float local382 = this.aFloatArrayArray15[local207 + 1][local211];
						@Pc(391) float local391 = this.aFloatArrayArray16[local207 + 1][local211];
						@Pc(399) int local399 = local23[local207][local211] & 0xFF;
						@Pc(409) int local409 = local23[local207][local211 + 1] & 0xFF;
						@Pc(421) int local421 = local23[local207 + 1][local211 + 1] & 0xFF;
						@Pc(431) int local431 = local23[local207 + 1][local211] & 0xFF;
						@Pc(433) int local433 = 0;
						@Pc(443) int local443;
						label357: for (@Pc(435) int local435 = 0; local435 < local255.length; local435++) {
							@Pc(441) Class3_Sub31 local441 = local227[local435];
							for (local443 = 0; local443 < local433; local443++) {
								if (local205[local443] == local441) {
									continue label357;
								}
							}
							local205[local433++] = local441;
						}
						@Pc(485) short[] local485 = this.aShortArrayArray20[local211 * super.anInt9726 + local207] = new short[local255.length];
						for (local443 = 0; local443 < local255.length; local443++) {
							@Pc(499) int local499 = (local207 << super.anInt9727) + local234[local443];
							@Pc(509) int local509 = (local211 << super.anInt9727) + local241[local443];
							@Pc(514) int local514 = local499 >> this.anInt9737;
							@Pc(519) int local519 = local509 >> this.anInt9737;
							@Pc(523) int local523 = local255[local443];
							@Pc(527) int local527 = local248[local443];
							@Pc(535) int local535 = local267 == null ? 0 : local267[local443];
							@Pc(553) long local553 = (long) local519 | (long) local523 << 32 | (long) local527 << 48 | (long) (local514 << 16);
							@Pc(557) int local557 = local234[local443];
							@Pc(561) int local561 = local241[local443];
							@Pc(563) byte local563 = 74;
							@Pc(565) int local565 = 0;
							@Pc(574) float local574;
							@Pc(576) float local576;
							@Pc(578) float local578;
							@Pc(658) float local658;
							@Pc(582) int local582;
							if (local557 == 0 && local561 == 0) {
								local574 = local290;
								local576 = local297;
								local578 = local304;
								local582 = local563 - local399;
							} else if (local557 == 0 && super.anInt9722 == local561) {
								local578 = local331;
								local574 = local313;
								local582 = local563 - local409;
								local576 = local322;
							} else if (super.anInt9722 == local557 && local561 == super.anInt9722) {
								local582 = local563 - local421;
								local574 = local342;
								local578 = local364;
								local576 = local353;
							} else if (local557 == super.anInt9722 && local561 == 0) {
								local578 = local391;
								local576 = local382;
								local582 = local563 - local431;
								local574 = local373;
							} else {
								@Pc(634) float local634 = (float) local557 / (float) super.anInt9722;
								@Pc(641) float local641 = (float) local561 / (float) super.anInt9722;
								@Pc(650) float local650 = local634 * (local373 - local290) + local290;
								local658 = local634 * (local382 - local297) + local297;
								@Pc(666) float local666 = (local391 - local304) * local634 + local304;
								@Pc(674) float local674 = local313 + (local342 - local313) * local634;
								@Pc(683) float local683 = local322 + local634 * (local353 - local322);
								local576 = (local683 - local658) * local641 + local658;
								local574 = local650 + local641 * (local674 - local650);
								@Pc(708) float local708 = local634 * (local364 - local331) + local331;
								local578 = local666 + (local708 - local666) * local641;
								@Pc(727) int local727 = ((local431 - local399) * local557 >> super.anInt9727) + local399;
								@Pc(740) int local740 = local409 + (local557 * (local421 - local409) >> super.anInt9727);
								local582 = local563 - local727 - (local561 * (local740 - local727) >> super.anInt9727);
							}
							@Pc(780) float local780 = 1.0F;
							if (local523 != -1) {
								@Pc(791) int local791 = local582 * (local523 & 0x7F) >> 7;
								if (local791 < 2) {
									local791 = 2;
								} else if (local791 > 126) {
									local791 = 126;
								}
								if ((this.anInt9740 & 0x7) == 0) {
									local780 = this.aClass33_Sub1_21.aFloatArray29[0] * local574 + this.aClass33_Sub1_21.aFloatArray29[1] * local576 + local578 * this.aClass33_Sub1_21.aFloatArray29[2];
									local780 = this.aClass33_Sub1_21.aFloat85 + (local780 > 0.0F ? this.aClass33_Sub1_21.aFloat84 : this.aClass33_Sub1_21.aFloat79) * local780;
								}
								local565 = Static120.anIntArray152[local523 & 0xFF80 | local791];
							}
							@Pc(863) Class3 local863 = null;
							if ((this.anInt9732 - 1 & local499) == 0 && (this.anInt9732 - 1 & local509) == 0) {
								local863 = local201.method7424(local553);
							}
							@Pc(902) int local902;
							@Pc(962) int local962;
							if (local863 == null) {
								if (local527 == local523) {
									local962 = local565;
								} else {
									@Pc(942) int local942 = local582 * (local527 & 0x7F) >> 7;
									if (local942 < 2) {
										local942 = 2;
									} else if (local942 > 126) {
										local942 = 126;
									}
									local962 = Static120.anIntArray152[local527 & 0xFF80 | local942];
									if ((this.anInt9740 & 0x7) == 0) {
										@Pc(993) float local993 = this.aClass33_Sub1_21.aFloatArray29[1] * local576 + local574 * this.aClass33_Sub1_21.aFloatArray29[0] + this.aClass33_Sub1_21.aFloatArray29[2] * local578;
										local658 = (local780 > 0.0F ? this.aClass33_Sub1_21.aFloat84 : this.aClass33_Sub1_21.aFloat79) * local780 + this.aClass33_Sub1_21.aFloat85;
										@Pc(1018) int local1018 = local962 >> 16 & 0xFF;
										@Pc(1024) int local1024 = local962 >> 8 & 0xFF;
										@Pc(1028) int local1028 = local962 & 0xFF;
										local1018 = (int) ((float) local1018 * local658);
										if (local1018 < 0) {
											local1018 = 0;
										} else if (local1018 > 255) {
											local1018 = 255;
										}
										local1024 = (int) ((float) local1024 * local658);
										if (local1024 < 0) {
											local1024 = 0;
										} else if (local1024 > 255) {
											local1024 = 255;
										}
										local1028 = (int) ((float) local1028 * local658);
										if (local1028 < 0) {
											local1028 = 0;
										} else if (local1028 > 255) {
											local1028 = 255;
										}
										local962 = local1018 << 16 | local1024 << 8 | local1028;
									}
								}
								if (Stream.b()) {
									local175.a((float) local499);
									local175.a((float) (this.method8043(local509, local499) + local535));
									local175.a((float) local509);
									local175.a((float) local499);
									local175.a((float) local509);
									if (this.anIntArrayArrayArray16 != null) {
										local175.a((float) (local283 == null ? 0 : local283[local443] - 1));
									}
									if ((this.anInt9740 & 0x7) != 0) {
										local175.a(local574);
										local175.a(local576);
										local175.a(local578);
									}
								} else {
									local175.b((float) local499);
									local175.b((float) (this.method8043(local509, local499) + local535));
									local175.b((float) local509);
									local175.b((float) local499);
									local175.b((float) local509);
									if (this.anIntArrayArrayArray16 != null) {
										local175.b((float) (local283 == null ? 0 : local283[local443] - 1));
									}
									if ((this.anInt9740 & 0x7) != 0) {
										local175.b(local574);
										local175.b(local576);
										local175.b(local578);
									}
								}
								if (this.aClass33_Sub1_21.anInt2178 == 0) {
									local180.d(local962 | 0xFF000000);
								} else {
									local180.b(local962 | 0xFF000000);
								}
								local902 = this.anInt9745++;
								local485[local443] = (short) local902;
								if (local523 != -1) {
									local184[local902] = local227[local443];
								}
								local201.method7425(local553, new Class3_Sub43(local485[local443]));
							} else {
								local485[local443] = ((Class3_Sub43) local863).aShort110;
								local902 = local485[local443] & 0xFFFF;
								if (local523 != -1 && local227[local443].aLong277 < local184[local902].aLong277) {
									local184[local902] = local227[local443];
								}
							}
							for (local962 = 0; local962 < local433; local962++) {
								local205[local962].method6418(local902, local565, local582, local780);
							}
							this.anInt9751++;
						}
					}
				}
			}
			for (local211 = 0; local211 < this.anInt9745; local211++) {
				@Pc(1313) Class3_Sub31 local1313 = local184[local211];
				if (local1313 != null) {
					local1313.method6420(local211);
				}
			}
			@Pc(1334) int local1334;
			@Pc(1352) int local1352;
			for (@Pc(1330) int local1330 = 0; super.anInt9726 > local1330; local1330++) {
				for (local1334 = 0; local1334 < super.anInt9723; local1334++) {
					@Pc(1346) short[] local1346 = this.aShortArrayArray20[local1330 + super.anInt9726 * local1334];
					if (local1346 != null) {
						@Pc(1350) int local1350 = 0;
						local1352 = 0;
						while (local1352 < local1346.length) {
							@Pc(1361) int local1361 = local1346[local1352++] & 0xFFFF;
							@Pc(1368) int local1368 = local1346[local1352++] & 0xFFFF;
							@Pc(1375) int local1375 = local1346[local1352++] & 0xFFFF;
							@Pc(1379) Class3_Sub31 local1379 = local184[local1361];
							@Pc(1383) Class3_Sub31 local1383 = local184[local1368];
							@Pc(1387) Class3_Sub31 local1387 = local184[local1375];
							@Pc(1389) Class3_Sub31 local1389 = null;
							if (local1379 != null) {
								local1389 = local1379;
								local1379.method6415(local1330, local1334, local1350);
							}
							if (local1383 != null) {
								local1383.method6415(local1330, local1334, local1350);
								if (local1389 == null || local1389.aLong277 > local1383.aLong277) {
									local1389 = local1383;
								}
							}
							if (local1387 != null) {
								local1387.method6415(local1330, local1334, local1350);
								if (local1389 == null || local1389.aLong277 > local1387.aLong277) {
									local1389 = local1387;
								}
							}
							if (local1389 != null) {
								if (local1379 != null) {
									local1389.method6420(local1361);
								}
								if (local1383 != null) {
									local1389.method6420(local1368);
								}
								if (local1387 != null) {
									local1389.method6420(local1375);
								}
								local1389.method6415(local1330, local1334, local1350);
							}
							local1350++;
						}
					}
				}
			}
			local175.a();
			local180.a();
			this.anInterface26_17 = this.aClass33_Sub1_21.method2008(false);
			this.anInterface26_17.method7634(this.anInt9745 * 4, 4, local160);
			this.anInterface26_18 = this.aClass33_Sub1_21.method2008(false);
			this.anInterface26_18.method7634(local137 * this.anInt9745, local137, local170);
			if ((this.anInt9740 & 0x7) == 0) {
				if (this.anIntArrayArrayArray16 == null) {
					this.aClass34_23 = this.aClass33_Sub1_21.method2090(new Class151[] { new Class151(new Class333[] { Static570.aClass333_1, Static570.aClass333_5 }), new Class151(Static570.aClass333_3) });
				} else {
					this.aClass34_23 = this.aClass33_Sub1_21.method2090(new Class151[] { new Class151(new Class333[] { Static570.aClass333_1, Static570.aClass333_5, Static570.aClass333_4 }), new Class151(Static570.aClass333_3) });
				}
			} else if (this.anIntArrayArrayArray16 == null) {
				this.aClass34_23 = this.aClass33_Sub1_21.method2090(new Class151[] { new Class151(new Class333[] { Static570.aClass333_1, Static570.aClass333_5, Static570.aClass333_2 }), new Class151(Static570.aClass333_3) });
			} else {
				this.aClass34_23 = this.aClass33_Sub1_21.method2090(new Class151[] { new Class151(new Class333[] { Static570.aClass333_1, Static570.aClass333_5, Static570.aClass333_4, Static570.aClass333_2 }), new Class151(Static570.aClass333_3) });
			}
			local1334 = 0;
			for (@Pc(1696) int local1696 = 0; local1696 < local113.length; local1696++) {
				if (local113[local1696].anInt7669 > 0) {
					local113[local1334++] = local113[local1696];
				}
			}
			this.aClass3_Sub31Array1 = new Class3_Sub31[local1334];
			@Pc(1726) long[] local1726 = new long[local1334];
			for (local1352 = 0; local1352 < local1334; local1352++) {
				@Pc(1734) Class3_Sub31 local1734 = local113[local1352];
				local1726[local1352] = local1734.aLong277;
				this.aClass3_Sub31Array1[local1352] = local1734;
				local1734.method6421(this.anInt9745);
			}
			Static35.method696(this.aClass3_Sub31Array1, local1726);
			if (this.aClass158_2 != null) {
				this.aClass158_2.method4857();
			}
		}
		this.anIntArrayArrayArray18 = null;
		this.aClass307_50 = null;
		this.aByteArrayArray26 = null;
		this.aFloatArrayArray17 = this.aFloatArrayArray15 = this.aFloatArrayArray16 = null;
		this.anIntArrayArrayArray19 = null;
		this.anIntArrayArrayArray16 = null;
		this.aClass3_Sub31ArrayArrayArray1 = null;
		this.anIntArrayArrayArray17 = this.anIntArrayArrayArray15 = null;
		this.anIntArrayArrayArray20 = null;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method8044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method8045(arg2, arg5, arg3, arg1, -1, arg0, arg4);
	}

	@OriginalMember(owner = "client!up", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class3_Sub1_Sub6 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub6 arg2) {
		if ((this.aByteArrayArray25[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(21) int local21 = super.anInt9722 >> this.aClass33_Sub1_21.anInt2165;
		@Pc(24) Class3_Sub1_Sub6_Sub1 local24 = (Class3_Sub1_Sub6_Sub1) arg2;
		@Pc(40) Class3_Sub1_Sub6_Sub1 local40;
		if (local24 != null && local24.method4162(local21, local21)) {
			local40 = local24;
			local24.method4164();
		} else {
			local40 = new Class3_Sub1_Sub6_Sub1(this.aClass33_Sub1_21, local21, local21);
		}
		local40.method4157(local21, 0, 0, local21);
		this.method8048(arg1, arg0, local40);
		return local40;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(II)V")
	@Override
	public void method8037(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!up", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		@Pc(9) Interface5 local9 = this.aClass33_Sub1_21.anInterface5_11;
		if (arg5 != null && this.anIntArrayArrayArray16 == null) {
			this.anIntArrayArrayArray16 = new int[super.anInt9726][super.anInt9723][];
		}
		if (arg3 != null && this.anIntArrayArrayArray19 == null) {
			this.anIntArrayArrayArray19 = new int[super.anInt9726][super.anInt9723][];
		}
		this.anIntArrayArrayArray17[arg0][arg1] = arg2;
		this.anIntArrayArrayArray15[arg0][arg1] = arg4;
		this.anIntArrayArrayArray18[arg0][arg1] = arg6;
		this.anIntArrayArrayArray20[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray16 != null) {
			this.anIntArrayArrayArray16[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray19 != null) {
			this.anIntArrayArrayArray19[arg0][arg1] = arg3;
		}
		@Pc(92) Class3_Sub31[] local92 = this.aClass3_Sub31ArrayArrayArray1[arg0][arg1] = new Class3_Sub31[arg6.length];
		for (@Pc(94) int local94 = 0; local94 < arg6.length; local94++) {
			@Pc(100) int local100 = arg8[local94];
			@Pc(104) int local104 = arg9[local94];
			if ((this.anInt9740 & 0x20) != 0 && local100 != -1 && local9.method6869(local100).aBoolean497) {
				local100 = -1;
				local104 = 128;
			}
			@Pc(146) long local146 = (long) local100 | (long) (local104 << 14) | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28;
			@Pc(152) Class3 local152;
			for (local152 = this.aClass307_50.method7424(local146); local152 != null; local152 = this.aClass307_50.method7422()) {
				@Pc(157) Class3_Sub31 local157 = (Class3_Sub31) local152;
				if (local157.anInt7665 == local100 && local157.aFloat207 == (float) local104 && local157.anInt7658 == arg10 && local157.anInt7667 == arg11 && local157.anInt7657 == arg12) {
					break;
				}
			}
			if (local152 == null) {
				local92[local94] = new Class3_Sub31(this, local100, local104, arg10, arg11, arg12);
				this.aClass307_50.method7425(local146, local92[local94]);
			} else {
				local92[local94] = (Class3_Sub31) local152;
			}
		}
		if (arg13) {
			this.aByteArrayArray25[arg0][arg1] = (byte) (this.aByteArrayArray25[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt9755) {
			this.anInt9755 = arg6.length;
		}
		this.anInt9754 += arg6.length;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method8042(@OriginalArg(0) Class3_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass158_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (this.aClass33_Sub1_21.anInt2176 * arg2 >> 8) >> this.aClass33_Sub1_21.anInt2165;
			@Pc(40) int local40 = arg3 - (arg2 * this.aClass33_Sub1_21.anInt2158 >> 8) >> this.aClass33_Sub1_21.anInt2165;
			return this.aClass158_2.method4861(arg0, local40, local25);
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method8036(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt9754 <= 0) {
			return;
		}
		@Pc(16) Interface23 local16 = this.aClass33_Sub1_21.method1990(this.anInt9751);
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = 32767;
		@Pc(22) int local22 = -32768;
		for (@Pc(24) int local24 = 0; local24 < 4; local24++) {
			local18 = 0;
			@Pc(33) Buffer local33 = local16.method4807();
			if (local33 != null) {
				@Pc(41) Stream local41 = this.aClass33_Sub1_21.method2092(local33);
				@Pc(45) int local45;
				@Pc(55) int local55;
				@Pc(57) int local57;
				@Pc(75) short[] local75;
				@Pc(79) int local79;
				@Pc(87) int local87;
				if (Stream.b()) {
					for (local45 = arg1; local45 < arg3; local45++) {
						local55 = super.anInt9726 * local45 + arg0;
						for (local57 = arg0; local57 < arg2; local57++) {
							if (arg4[local57 - arg0][local45 - arg1]) {
								local75 = this.aShortArrayArray20[local55];
								if (local75 != null) {
									for (local79 = 0; local79 < local75.length; local79++) {
										local87 = local75[local79] & 0xFFFF;
										local41.e(local87);
										if (local87 > local22) {
											local22 = local87;
										}
										local18++;
										if (local20 > local87) {
											local20 = local87;
										}
									}
								}
							}
							local55++;
						}
					}
				} else {
					for (local45 = arg1; local45 < arg3; local45++) {
						local55 = super.anInt9726 * local45 + arg0;
						for (local57 = arg0; local57 < arg2; local57++) {
							if (arg4[local57 - arg0][local45 - arg1]) {
								local75 = this.aShortArrayArray20[local55];
								if (local75 != null) {
									for (local79 = 0; local79 < local75.length; local79++) {
										local87 = local75[local79] & 0xFFFF;
										if (local87 > local22) {
											local22 = local87;
										}
										local41.a(local87);
										if (local87 < local20) {
											local20 = local87;
										}
										local18++;
									}
								}
							}
							local55++;
						}
					}
				}
				local41.a();
				if (local16.method4806()) {
					break;
				}
			}
		}
		if (local18 <= 0) {
			return;
		}
		this.aClass33_Sub1_21.method2069();
		this.aClass33_Sub1_21.method2021(false);
		this.aClass33_Sub1_21.method2044(false);
		this.aClass33_Sub1_21.method2002(false);
		this.aClass33_Sub1_21.method2080(false);
		this.aClass33_Sub1_21.method2032(0);
		this.aClass33_Sub1_21.method2012(false, -2, false);
		this.aClass33_Sub1_21.method1987(null);
		@Pc(271) Class47_Sub3 local271 = this.aClass33_Sub1_21.method2052();
		@Pc(276) float[] local276 = this.aClass33_Sub1_21.method2024();
		local276[12] = -(((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass33_Sub1_21.anInt2113) - 1.0F;
		local276[14] = -this.aFloat269 / (this.aFloat268 - this.aFloat269);
		local276[6] = 0.0F;
		local276[7] = 0.0F;
		local276[13] = 1.0F - ((float) (arg3 * 1024) / 128.0F + (float) 0) / (float) this.aClass33_Sub1_21.anInt2117;
		local276[10] = 1.0F / (this.aFloat268 - this.aFloat269);
		local276[9] = 0.0F;
		local276[15] = 1.0F;
		local276[5] = (float) 1024 / ((float) this.aClass33_Sub1_21.anInt2117 * 128.0F * (float) super.anInt9722);
		local276[8] = 0.0F;
		local276[4] = 0.0F;
		local276[11] = 0.0F;
		local276[1] = 0.0F;
		local276[3] = 0.0F;
		local276[2] = 0.0F;
		local276[0] = (float) 1024 / ((float) super.anInt9722 * 128.0F * (float) this.aClass33_Sub1_21.anInt2113);
		local271.method7904(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F);
		this.aClass33_Sub1_21.method2062();
		this.aClass33_Sub1_21.method2042();
		if ((this.anInt9740 & 0x7) == 0) {
			this.aClass33_Sub1_21.method2044(false);
		} else {
			this.aClass33_Sub1_21.method2044(true);
			this.aClass33_Sub1_21.method2089();
		}
		this.aClass33_Sub1_21.method2102(false);
		this.aClass33_Sub1_21.method2046(this.anInterface26_18, 0);
		this.aClass33_Sub1_21.method2046(this.anInterface26_17, 1);
		this.aClass33_Sub1_21.method2003(this.aClass34_23);
		this.aClass33_Sub1_21.method2091(local20, Static338.aClass304_5, 0, local18 / 3, local16, local22 + 1 - local20);
		this.aClass33_Sub1_21.method2102(true);
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method8035(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method8045(arg2, arg6, arg3, arg1, arg5, arg0, arg4);
	}

	@OriginalMember(owner = "client!up", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray26[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray26[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!up", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class3_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass158_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass33_Sub1_21.anInt2176 >> 8) >> this.aClass33_Sub1_21.anInt2165;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass33_Sub1_21.anInt2158 >> 8) >> this.aClass33_Sub1_21.anInt2165;
			this.aClass158_2.method4858(local39, arg0, local24);
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Lclient!pk;[I)V")
	@Override
	public void method8040(@OriginalArg(0) Class3_Sub27 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass276_60.method6906(new Class3_Sub18(this.aClass33_Sub1_21, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!up", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class3_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass158_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass33_Sub1_21.anInt2176 * arg2 >> 8) >> this.aClass33_Sub1_21.anInt2165;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass33_Sub1_21.anInt2158 >> 8) >> this.aClass33_Sub1_21.anInt2165;
			this.aClass158_2.method4856(local24, arg0, local39);
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IIBLclient!hj;)V")
	private void method8048(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class3_Sub1_Sub6_Sub1 arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray17[arg1][arg0];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray15[arg1][arg0];
		@Pc(22) int local22 = local12.length;
		if (Static18.anIntArray15.length < local22) {
			Static630.anIntArray622 = new int[local22];
			Static18.anIntArray15 = new int[local22];
		}
		for (@Pc(38) int local38 = 0; local38 < local22; local38++) {
			Static18.anIntArray15[local38] = local12[local38] >> this.aClass33_Sub1_21.anInt2165;
			Static630.anIntArray622[local38] = local19[local38] >> this.aClass33_Sub1_21.anInt2165;
		}
		@Pc(77) int local77 = 0;
		while (local77 < local22) {
			@Pc(83) int local83 = Static18.anIntArray15[local77];
			@Pc(88) int local88 = Static630.anIntArray622[local77++];
			@Pc(92) int local92 = Static18.anIntArray15[local77];
			@Pc(97) int local97 = Static630.anIntArray622[local77++];
			@Pc(101) int local101 = Static18.anIntArray15[local77];
			@Pc(106) int local106 = Static630.anIntArray622[local77++];
			if ((local83 - local92) * (local97 - local106) - (local101 - local92) * (-local88 + local97) > 0) {
				arg2.method4158(local101, local88, local92, local97, local106, local83);
			}
		}
	}
}
