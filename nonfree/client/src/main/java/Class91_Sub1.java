import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class91_Sub1 extends Class91 {

	@OriginalMember(owner = "client!ed", name = "G", descriptor = "I")
	private int anInt2631;

	@OriginalMember(owner = "client!ed", name = "R", descriptor = "I")
	private int anInt2639;

	@OriginalMember(owner = "client!ed", name = "Y", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!ed", name = "bb", descriptor = "Lclient!ju;")
	private Interface14 anInterface14_3;

	@OriginalMember(owner = "client!ed", name = "eb", descriptor = "Lclient!uo;")
	public Class352 aClass352_3;

	@OriginalMember(owner = "client!ed", name = "fb", descriptor = "Lclient!uo;")
	public Class352 aClass352_4;

	@OriginalMember(owner = "client!ed", name = "gb", descriptor = "Lclient!uo;")
	public Class352 aClass352_5;

	@OriginalMember(owner = "client!ed", name = "ib", descriptor = "I")
	private int anInt2644;

	@OriginalMember(owner = "client!ed", name = "jb", descriptor = "Lclient!uo;")
	private Class352 aClass352_6;

	@OriginalMember(owner = "client!ed", name = "kb", descriptor = "[Lclient!kw;")
	private Class2_Sub29[] aClass2_Sub29Array1;

	@OriginalMember(owner = "client!ed", name = "nb", descriptor = "I")
	private int anInt2645;

	@OriginalMember(owner = "client!ed", name = "V", descriptor = "Lclient!fh;")
	private final Class114 aClass114_14 = new Class114();

	@OriginalMember(owner = "client!ed", name = "W", descriptor = "Lclient!bi;")
	public final Class13_Sub2 aClass13_Sub2_9;

	@OriginalMember(owner = "client!ed", name = "M", descriptor = "I")
	private final int anInt2635;

	@OriginalMember(owner = "client!ed", name = "db", descriptor = "[[F")
	private float[][] aFloatArrayArray1;

	@OriginalMember(owner = "client!ed", name = "x", descriptor = "I")
	private final int anInt2625;

	@OriginalMember(owner = "client!ed", name = "S", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!ed", name = "X", descriptor = "I")
	public final int anInt2641;

	@OriginalMember(owner = "client!ed", name = "t", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!ed", name = "ob", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!ed", name = "mb", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!ed", name = "J", descriptor = "[[[Lclient!kw;")
	private Class2_Sub29[][][] aClass2_Sub29ArrayArrayArray1;

	@OriginalMember(owner = "client!ed", name = "z", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!ed", name = "u", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!ed", name = "U", descriptor = "[[S")
	public final short[][] aShortArrayArray3;

	@OriginalMember(owner = "client!ed", name = "I", descriptor = "[[B")
	private final byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!ed", name = "cb", descriptor = "[[B")
	private byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!ed", name = "P", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!ed", name = "lb", descriptor = "Lclient!tba;")
	private Class323 lb;

	@OriginalMember(owner = "client!ed", name = "F", descriptor = "Lclient!nr;")
	private Class244 aClass244_1;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lclient!bi;IIII[[I[[II)V")
	public Class91_Sub1(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass13_Sub2_9 = arg0;
		this.anInt2635 = super.anInt8641 - 2;
		this.aFloatArrayArray1 = new float[super.anInt8650 + 1][super.anInt8645 + 1];
		this.anInt2625 = 0x1 << this.anInt2635;
		this.anIntArrayArrayArray6 = new int[arg3][arg4][];
		this.anInt2641 = arg2;
		this.anIntArrayArrayArray2 = new int[arg3][arg4][];
		this.aFloatArrayArray3 = new float[super.anInt8650 + 1][super.anInt8645 + 1];
		this.aFloatArrayArray2 = new float[super.anInt8650 + 1][super.anInt8645 + 1];
		this.aClass2_Sub29ArrayArrayArray1 = new Class2_Sub29[arg3][arg4][];
		this.anIntArrayArrayArray4 = new int[arg3][arg4][];
		this.anIntArrayArrayArray3 = new int[arg3][arg4][];
		this.aShortArrayArray3 = new short[arg3 * arg4][];
		this.aByteArrayArray6 = new byte[arg3][arg4];
		this.aByteArrayArray7 = new byte[arg3 + 1][arg4 + 1];
		this.anIntArrayArrayArray5 = new int[arg3][arg4][];
		for (@Pc(115) int local115 = 1; super.anInt8645 > local115; local115++) {
			for (@Pc(119) int local119 = 1; local119 < super.anInt8650; local119++) {
				@Pc(137) int local137 = arg6[local119 + 1][local115] - arg6[local119 - 1][local115];
				@Pc(153) int local153 = arg6[local119][local115 + 1] - arg6[local119][local115 - 1];
				@Pc(172) float local172 = (float) (1.0D / Math.sqrt((double) (local153 * local153 + arg7 * 4 * arg7 + local137 * local137)));
				this.aFloatArrayArray1[local119][local115] = local172 * (float) local137;
				this.aFloatArrayArray3[local119][local115] = local172 * (float) (-arg7 * 2);
				this.aFloatArrayArray2[local119][local115] = local172 * (float) local153;
			}
		}
		this.lb = new Class323(128);
		if ((this.anInt2641 & 0x10) != 0) {
			this.aClass244_1 = new Class244(this.aClass13_Sub2_9, this);
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)V")
	@Override
	public void method7448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method7444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method7445(@OriginalArg(0) Class2_Sub7_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass244_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (this.aClass13_Sub2_9.anInt1112 * arg2 >> 8) >> this.aClass13_Sub2_9.anInt1075;
			@Pc(40) int local40 = arg3 - (arg2 * this.aClass13_Sub2_9.anInt1092 >> 8) >> this.aClass13_Sub2_9.anInt1075;
			return this.aClass244_1.method5756(local40, arg0, local25);
		}
	}

	@OriginalMember(owner = "client!ed", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class2_Sub7_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass244_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass13_Sub2_9.anInt1112 * arg2 >> 8) >> this.aClass13_Sub2_9.anInt1075;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass13_Sub2_9.anInt1092 >> 8) >> this.aClass13_Sub2_9.anInt1075;
			this.aClass244_1.method5759(arg0, local39, local24);
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILclient!uu;BI)V")
	private void method2237(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub7_Sub17_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray3[arg2][arg0];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray5[arg2][arg0];
		@Pc(22) int local22 = local12.length;
		if (this.aClass13_Sub2_9.anIntArray65.length < local22) {
			this.aClass13_Sub2_9.anIntArray66 = new int[local22];
			this.aClass13_Sub2_9.anIntArray65 = new int[local22];
		}
		@Pc(42) int[] local42 = this.aClass13_Sub2_9.anIntArray65;
		@Pc(46) int[] local46 = this.aClass13_Sub2_9.anIntArray66;
		for (@Pc(48) int local48 = 0; local48 < local22; local48++) {
			local42[local48] = local12[local48] >> this.aClass13_Sub2_9.anInt1075;
			local46[local48] = local19[local48] >> this.aClass13_Sub2_9.anInt1075;
		}
		@Pc(80) int local80 = 0;
		while (local22 > local80) {
			@Pc(98) int local98 = local42[local80];
			@Pc(103) int local103 = local46[local80++];
			@Pc(107) int local107 = local42[local80];
			@Pc(112) int local112 = local46[local80++];
			@Pc(116) int local116 = local42[local80];
			@Pc(121) int local121 = local46[local80++];
			if ((local112 - local121) * (local98 - local107) - (local112 - local103) * (local116 - local107) > 0) {
				arg1.method8388(local107, local116, local112, local121, local98, local103);
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class2_Sub7_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass244_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass13_Sub2_9.anInt1112 >> 8) >> this.aClass13_Sub2_9.anInt1075;
			@Pc(39) int local39 = arg3 - (this.aClass13_Sub2_9.anInt1092 * arg2 >> 8) >> this.aClass13_Sub2_9.anInt1075;
			this.aClass244_1.method5762(local39, local24, arg0);
		}
	}

	@OriginalMember(owner = "client!ed", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.anInt2644 <= 0) {
			this.aClass244_1 = null;
		} else {
			@Pc(23) byte[][] local23 = new byte[super.anInt8650 + 1][super.anInt8645 + 1];
			@Pc(29) int local29;
			for (@Pc(25) int local25 = 1; local25 < super.anInt8650; local25++) {
				for (local29 = 1; super.anInt8645 > local29; local29++) {
					local23[local25][local29] = (byte) ((this.aByteArrayArray7[local25][local29 - 1] >> 2) + (this.aByteArrayArray7[local25 - 1][local29] >> 2) + (this.aByteArrayArray7[local25 - -1][local29] >> 3) + (this.aByteArrayArray7[local25][local29 + 1] >> 3) + (this.aByteArrayArray7[local25][local29] >> 1));
				}
			}
			this.aClass2_Sub29Array1 = new Class2_Sub29[this.lb.method7483()];
			this.lb.method7476(this.aClass2_Sub29Array1);
			for (local29 = 0; local29 < this.aClass2_Sub29Array1.length; local29++) {
				this.aClass2_Sub29Array1[local29].method4837(this.anInt2644);
			}
			@Pc(137) int local137 = 24;
			if (this.anIntArrayArrayArray7 != null) {
				local137 += 4;
			}
			if ((this.anInt2641 & 0x7) != 0) {
				local137 += 12;
			}
			@Pc(160) NativeHeapBuffer local160 = this.aClass13_Sub2_9.aNativeHeap1.a(this.anInt2644 * local137, false);
			@Pc(165) Stream local165 = new Stream(local160);
			@Pc(169) Class2_Sub29[] local169 = new Class2_Sub29[this.anInt2644];
			@Pc(176) int local176 = Static276.method7580(this.anInt2644 / 4);
			if (local176 < 1) {
				local176 = 1;
			}
			@Pc(188) Class323 local188 = new Class323(local176);
			@Pc(192) Class2_Sub29[] local192 = new Class2_Sub29[this.anInt2645];
			@Pc(198) int local198;
			for (@Pc(194) int local194 = 0; super.anInt8650 > local194; local194++) {
				for (local198 = 0; local198 < super.anInt8645; local198++) {
					if (this.anIntArrayArrayArray6[local194][local198] != null) {
						@Pc(214) Class2_Sub29[] local214 = this.aClass2_Sub29ArrayArrayArray1[local194][local198];
						@Pc(221) int[] local221 = this.anIntArrayArrayArray3[local194][local198];
						@Pc(228) int[] local228 = this.anIntArrayArrayArray5[local194][local198];
						@Pc(235) int[] local235 = this.anIntArrayArrayArray2[local194][local198];
						@Pc(242) int[] local242 = this.anIntArrayArrayArray6[local194][local198];
						@Pc(254) int[] local254 = this.anIntArrayArrayArray4 == null ? null : this.anIntArrayArrayArray4[local194][local198];
						if (local235 == null) {
							local235 = local242;
						}
						@Pc(270) int[] local270 = this.anIntArrayArrayArray7 == null ? null : this.anIntArrayArrayArray7[local194][local198];
						@Pc(277) float local277 = this.aFloatArrayArray1[local194][local198];
						@Pc(284) float local284 = this.aFloatArrayArray3[local194][local198];
						@Pc(291) float local291 = this.aFloatArrayArray2[local194][local198];
						@Pc(300) float local300 = this.aFloatArrayArray1[local194][local198 + 1];
						@Pc(309) float local309 = this.aFloatArrayArray3[local194][local198 + 1];
						@Pc(318) float local318 = this.aFloatArrayArray2[local194][local198 + 1];
						@Pc(329) float local329 = this.aFloatArrayArray1[local194 + 1][local198 + 1];
						@Pc(340) float local340 = this.aFloatArrayArray3[local194 + 1][local198 + 1];
						@Pc(351) float local351 = this.aFloatArrayArray2[local194 + 1][local198 + 1];
						@Pc(360) float local360 = this.aFloatArrayArray1[local194 + 1][local198];
						@Pc(369) float local369 = this.aFloatArrayArray3[local194 + 1][local198];
						@Pc(378) float local378 = this.aFloatArrayArray2[local194 + 1][local198];
						@Pc(386) int local386 = local23[local194][local198] & 0xFF;
						@Pc(396) int local396 = local23[local194][local198 + 1] & 0xFF;
						@Pc(408) int local408 = local23[local194 + 1][local198 + 1] & 0xFF;
						@Pc(418) int local418 = local23[local194 + 1][local198] & 0xFF;
						@Pc(420) int local420 = 0;
						@Pc(430) int local430;
						label335: for (@Pc(422) int local422 = 0; local422 < local242.length; local422++) {
							@Pc(428) Class2_Sub29 local428 = local214[local422];
							for (local430 = 0; local430 < local420; local430++) {
								if (local428 == local192[local430]) {
									continue label335;
								}
							}
							local192[local420++] = local428;
						}
						@Pc(475) short[] local475 = this.aShortArrayArray3[local194 + local198 * super.anInt8650] = new short[local242.length];
						for (local430 = 0; local430 < local242.length; local430++) {
							@Pc(488) int local488 = (local194 << super.anInt8641) + local221[local430];
							@Pc(498) int local498 = (local198 << super.anInt8641) + local228[local430];
							@Pc(503) int local503 = local488 >> this.anInt2635;
							@Pc(508) int local508 = local498 >> this.anInt2635;
							@Pc(512) int local512 = local242[local430];
							@Pc(516) int local516 = local235[local430];
							@Pc(524) int local524 = local254 == null ? 0 : local254[local430];
							@Pc(542) long local542 = (long) local508 | (long) (local503 << 16) | (long) local516 << 48 | (long) local512 << 32;
							@Pc(546) int local546 = local221[local430];
							@Pc(550) int local550 = local228[local430];
							@Pc(552) byte local552 = 74;
							@Pc(554) int local554 = 0;
							@Pc(574) float local574;
							@Pc(566) float local566;
							@Pc(572) float local572;
							@Pc(659) float local659;
							@Pc(570) int local570;
							if (local546 == 0 && local550 == 0) {
								local566 = local284;
								local570 = local552 - local386;
								local572 = local291;
								local574 = local277;
							} else if (local546 == 0 && super.anInt8647 == local550) {
								local566 = local309;
								local570 = local552 - local396;
								local572 = local318;
								local574 = local300;
							} else if (super.anInt8647 == local546 && local550 == super.anInt8647) {
								local574 = local329;
								local566 = local340;
								local572 = local351;
								local570 = local552 - local408;
							} else if (local546 == super.anInt8647 && local550 == 0) {
								local570 = local552 - local418;
								local566 = local369;
								local574 = local360;
								local572 = local378;
							} else {
								@Pc(634) float local634 = (float) local546 / (float) super.anInt8647;
								@Pc(641) float local641 = (float) local550 / (float) super.anInt8647;
								@Pc(650) float local650 = (local360 - local277) * local634 + local277;
								local659 = local284 + local634 * (local369 - local284);
								@Pc(668) float local668 = local291 + (local378 - local291) * local634;
								@Pc(676) float local676 = local300 + local634 * (local329 - local300);
								@Pc(684) float local684 = local309 + (local340 - local309) * local634;
								local574 = (local676 - local650) * local641 + local650;
								@Pc(700) float local700 = local634 * (local351 - local318) + local318;
								local566 = local659 + (local684 - local659) * local641;
								local572 = (local700 - local668) * local641 + local668;
								@Pc(730) int local730 = local386 + (local546 * (local418 - local386) >> super.anInt8641);
								@Pc(743) int local743 = local396 + ((local408 - local396) * local546 >> super.anInt8641);
								local570 = local552 - (local550 * (local743 - local730) >> super.anInt8641) - local730;
							}
							@Pc(770) float local770 = 1.0F;
							if (local512 != -1) {
								@Pc(781) int local781 = (local512 & 0x7F) * local570 >> 7;
								if (local781 < 2) {
									local781 = 2;
								} else if (local781 > 126) {
									local781 = 126;
								}
								local554 = Static347.anIntArray701[local781 | local512 & 0xFF80];
								if ((this.anInt2641 & 0x7) == 0) {
									local770 = this.aClass13_Sub2_9.aFloatArray10[2] * local572 + this.aClass13_Sub2_9.aFloatArray10[1] * local566 + local574 * this.aClass13_Sub2_9.aFloatArray10[0];
									local770 = this.aClass13_Sub2_9.aFloat13 + local770 * (local770 > 0.0F ? this.aClass13_Sub2_9.aFloat28 : this.aClass13_Sub2_9.aFloat17);
								}
							}
							@Pc(854) Class2 local854 = null;
							if ((local488 & this.anInt2625 - 1) == 0 && (this.anInt2625 - 1 & local498) == 0) {
								local854 = local188.method7484(local542);
							}
							@Pc(890) int local890;
							@Pc(951) int local951;
							if (local854 == null) {
								if (local512 == local516) {
									local951 = local554;
								} else {
									@Pc(931) int local931 = local570 * (local516 & 0x7F) >> 7;
									if (local931 < 2) {
										local931 = 2;
									} else if (local931 > 126) {
										local931 = 126;
									}
									local951 = Static347.anIntArray701[local516 & 0xFF80 | local931];
									if ((this.anInt2641 & 0x7) == 0) {
										local659 = this.aClass13_Sub2_9.aFloatArray10[2] * local572 + this.aClass13_Sub2_9.aFloatArray10[0] * local574 + this.aClass13_Sub2_9.aFloatArray10[1] * local566;
										local659 = this.aClass13_Sub2_9.aFloat13 + local770 * (local770 > 0.0F ? this.aClass13_Sub2_9.aFloat28 : this.aClass13_Sub2_9.aFloat17);
										@Pc(1007) int local1007 = local951 >> 16 & 0xFF;
										@Pc(1013) int local1013 = local951 >> 8 & 0xFF;
										local1007 = (int) ((float) local1007 * local659);
										@Pc(1023) int local1023 = local951 & 0xFF;
										if (local1007 < 0) {
											local1007 = 0;
										} else if (local1007 > 255) {
											local1007 = 255;
										}
										local1013 = (int) ((float) local1013 * local659);
										if (local1013 < 0) {
											local1013 = 0;
										} else if (local1013 > 255) {
											local1013 = 255;
										}
										local1023 = (int) ((float) local1023 * local659);
										if (local1023 < 0) {
											local1023 = 0;
										} else if (local1023 > 255) {
											local1023 = 255;
										}
										local951 = local1023 | local1013 << 8 | local1007 << 16;
									}
								}
								if (this.aClass13_Sub2_9.aBoolean102) {
									local165.b((float) local488);
									local165.b((float) (local524 + this.method7446(local488, local498)));
									local165.b((float) local498);
									local165.d((byte) (local951 >> 16));
									local165.d((byte) (local951 >> 8));
									local165.d((byte) local951);
									local165.d(-1);
									local165.b((float) local488);
									local165.b((float) local498);
									if (this.anIntArrayArrayArray7 != null) {
										local165.b((float) (local270 == null ? 0 : local270[local430] - 1));
									}
									if ((this.anInt2641 & 0x7) != 0) {
										local165.b(local574);
										local165.b(local566);
										local165.b(local572);
									}
								} else {
									local165.a((float) local488);
									local165.a((float) (this.method7446(local488, local498) + local524));
									local165.a((float) local498);
									local165.d((byte) (local951 >> 16));
									local165.d((byte) (local951 >> 8));
									local165.d((byte) local951);
									local165.d(-1);
									local165.a((float) local488);
									local165.a((float) local498);
									if (this.anIntArrayArrayArray7 != null) {
										local165.a((float) (local270 == null ? 0 : local270[local430] - 1));
									}
									if ((this.anInt2641 & 0x7) != 0) {
										local165.a(local574);
										local165.a(local566);
										local165.a(local572);
									}
								}
								local890 = this.anInt2631++;
								local475[local430] = (short) local890;
								if (local512 != -1) {
									local169[local890] = local214[local430];
								}
								local188.method7477(new Class2_Sub22(local475[local430]), local542);
							} else {
								local475[local430] = ((Class2_Sub22) local854).aShort63;
								local890 = local475[local430] & 0xFFFF;
								if (local512 != -1 && local214[local430].aLong278 < local169[local890].aLong278) {
									local169[local890] = local214[local430];
								}
							}
							for (local951 = 0; local951 < local420; local951++) {
								local192[local951].method4835(local554, local570, local890, local770);
							}
							this.anInt2639++;
						}
					}
				}
			}
			for (local198 = 0; local198 < this.anInt2631; local198++) {
				@Pc(1328) Class2_Sub29 local1328 = local169[local198];
				if (local1328 != null) {
					local1328.method4834(local198);
				}
			}
			@Pc(1366) int local1366;
			for (@Pc(1345) int local1345 = 0; super.anInt8650 > local1345; local1345++) {
				for (@Pc(1349) int local1349 = 0; super.anInt8645 > local1349; local1349++) {
					@Pc(1362) short[] local1362 = this.aShortArrayArray3[local1349 * super.anInt8650 + local1345];
					if (local1362 != null) {
						local1366 = 0;
						@Pc(1368) int local1368 = 0;
						while (local1368 < local1362.length) {
							@Pc(1377) int local1377 = local1362[local1368++] & 0xFFFF;
							@Pc(1384) int local1384 = local1362[local1368++] & 0xFFFF;
							@Pc(1391) int local1391 = local1362[local1368++] & 0xFFFF;
							@Pc(1395) Class2_Sub29 local1395 = local169[local1377];
							@Pc(1399) Class2_Sub29 local1399 = local169[local1384];
							@Pc(1403) Class2_Sub29 local1403 = local169[local1391];
							@Pc(1405) Class2_Sub29 local1405 = null;
							if (local1395 != null) {
								local1405 = local1395;
								local1395.method4836(local1349, local1366, local1345);
							}
							if (local1399 != null) {
								local1399.method4836(local1349, local1366, local1345);
								if (local1405 == null || local1405.aLong278 > local1399.aLong278) {
									local1405 = local1399;
								}
							}
							if (local1403 != null) {
								local1403.method4836(local1349, local1366, local1345);
								if (local1405 == null || local1403.aLong278 < local1405.aLong278) {
									local1405 = local1403;
								}
							}
							if (local1405 != null) {
								if (local1395 != null) {
									local1405.method4834(local1377);
								}
								if (local1399 != null) {
									local1405.method4834(local1384);
								}
								if (local1403 != null) {
									local1405.method4834(local1391);
								}
								local1405.method4836(local1349, local1366, local1345);
							}
							local1366++;
						}
					}
				}
			}
			local165.b();
			this.anInterface14_3 = this.aClass13_Sub2_9.method1056(local137, local160, local165.a());
			this.aClass352_4 = new Class352(this.anInterface14_3, 5126, 3, 0);
			this.aClass352_6 = new Class352(this.anInterface14_3, 5121, 4, 12);
			@Pc(1548) byte local1548;
			if (this.anIntArrayArrayArray7 == null) {
				this.aClass352_3 = new Class352(this.anInterface14_3, 5126, 2, 16);
				local1548 = 24;
			} else {
				this.aClass352_3 = new Class352(this.anInterface14_3, 5126, 3, 16);
				local1548 = 28;
			}
			if ((this.anInt2641 & 0x7) != 0) {
				this.aClass352_5 = new Class352(this.anInterface14_3, 5126, 3, local1548);
			}
			@Pc(1585) long[] local1585 = new long[this.aClass2_Sub29Array1.length];
			for (local1366 = 0; local1366 < this.aClass2_Sub29Array1.length; local1366++) {
				@Pc(1594) Class2_Sub29 local1594 = this.aClass2_Sub29Array1[local1366];
				local1585[local1366] = local1594.aLong278;
				local1594.method4832(this.anInt2631);
			}
			Static92.method1886(local1585, this.aClass2_Sub29Array1);
			if (this.aClass244_1 != null) {
				this.aClass244_1.method5761();
			}
		}
		this.aClass2_Sub29ArrayArrayArray1 = null;
		this.aByteArrayArray7 = null;
		this.aFloatArrayArray1 = this.aFloatArrayArray3 = this.aFloatArrayArray2 = null;
		this.anIntArrayArrayArray7 = null;
		this.anIntArrayArrayArray3 = this.anIntArrayArrayArray5 = null;
		this.anIntArrayArrayArray2 = null;
		this.anIntArrayArrayArray6 = null;
		this.anIntArrayArrayArray4 = null;
		this.lb = null;
	}

	@OriginalMember(owner = "client!ed", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray7[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray7[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method7451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method2242(arg2, -1, arg3, arg4, arg0, arg1, arg5);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7456(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt2644 <= 0) {
			return;
		}
		this.aClass13_Sub2_9.method1031();
		this.aClass13_Sub2_9.method1035(false);
		this.aClass13_Sub2_9.method1022(false);
		this.aClass13_Sub2_9.method1047(false);
		this.aClass13_Sub2_9.method1062(false);
		this.aClass13_Sub2_9.method1090(0);
		this.aClass13_Sub2_9.method1023(-2);
		this.aClass13_Sub2_9.method1096((Class10) null);
		Static175.aFloatArray22[8] = 0.0F;
		Static175.aFloatArray22[11] = 0.0F;
		Static175.aFloatArray22[3] = 0.0F;
		Static175.aFloatArray22[6] = 0.0F;
		Static175.aFloatArray22[1] = 0.0F;
		Static175.aFloatArray22[12] = -(((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass13_Sub2_9.anInt990) - 1.0F;
		Static175.aFloatArray22[2] = 0.0F;
		Static175.aFloatArray22[13] = 1.0F - ((float) (arg3 * 1024) / 128.0F + (float) 0) / (float) this.aClass13_Sub2_9.anInt980;
		Static175.aFloatArray22[15] = 1.0F;
		Static175.aFloatArray22[4] = 0.0F;
		Static175.aFloatArray22[5] = (float) 1024 / ((float) this.aClass13_Sub2_9.anInt980 * (float) super.anInt8647 * 128.0F);
		Static175.aFloatArray22[14] = 0.0F;
		Static175.aFloatArray22[9] = 0.0F;
		Static175.aFloatArray22[10] = 0.0F;
		Static175.aFloatArray22[0] = (float) 1024 / ((float) super.anInt8647 * 128.0F * (float) this.aClass13_Sub2_9.anInt990);
		Static175.aFloatArray22[7] = 0.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static175.aFloatArray22, 0);
		Static175.aFloatArray22[4] = 0.0F;
		Static175.aFloatArray22[5] = 0.0F;
		Static175.aFloatArray22[1] = 0.0F;
		Static175.aFloatArray22[2] = 0.0F;
		Static175.aFloatArray22[11] = 0.0F;
		Static175.aFloatArray22[14] = 0.0F;
		Static175.aFloatArray22[10] = 0.0F;
		Static175.aFloatArray22[9] = 1.0F;
		Static175.aFloatArray22[8] = 0.0F;
		Static175.aFloatArray22[6] = 1.0F;
		Static175.aFloatArray22[12] = 0.0F;
		Static175.aFloatArray22[0] = 1.0F;
		Static175.aFloatArray22[7] = 0.0F;
		Static175.aFloatArray22[15] = 1.0F;
		Static175.aFloatArray22[3] = 0.0F;
		Static175.aFloatArray22[13] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static175.aFloatArray22, 0);
		if ((this.anInt2641 & 0x7) == 0) {
			this.aClass13_Sub2_9.method1022(false);
		} else {
			this.aClass13_Sub2_9.method1022(true);
			this.aClass13_Sub2_9.method1099();
		}
		this.aClass13_Sub2_9.method1067(this.aClass352_5, this.aClass352_4, this.aClass352_6, this.aClass352_3);
		if (this.anInt2639 * 2 > this.aClass13_Sub2_9.aClass2_Sub17_Sub2_1.aByteArray26.length) {
			this.aClass13_Sub2_9.aClass2_Sub17_Sub2_1 = new Class2_Sub17_Sub2(this.anInt2639 * 2);
		} else {
			this.aClass13_Sub2_9.aClass2_Sub17_Sub2_1.anInt3378 = 0;
		}
		@Pc(315) int local315 = 0;
		@Pc(319) Class2_Sub17_Sub2 local319 = this.aClass13_Sub2_9.aClass2_Sub17_Sub2_1;
		@Pc(325) int local325;
		@Pc(334) int local334;
		@Pc(336) int local336;
		@Pc(355) short[] local355;
		@Pc(359) int local359;
		if (this.aClass13_Sub2_9.aBoolean102) {
			for (local325 = arg1; local325 < arg3; local325++) {
				local334 = arg0 + local325 * super.anInt8650;
				for (local336 = arg0; local336 < arg2; local336++) {
					if (arg4[local336 - arg0][local325 - arg1]) {
						local355 = this.aShortArrayArray3[local334];
						if (local355 != null) {
							for (local359 = 0; local359 < local355.length; local359++) {
								local319.method2879(local355[local359] & 0xFFFF);
								local315++;
							}
						}
					}
					local334++;
				}
			}
		} else {
			for (local325 = arg1; local325 < arg3; local325++) {
				local334 = local325 * super.anInt8650 + arg0;
				for (local336 = arg0; local336 < arg2; local336++) {
					if (arg4[local336 - arg0][local325 - arg1]) {
						local355 = this.aShortArrayArray3[local334];
						if (local355 != null) {
							for (local359 = 0; local359 < local355.length; local359++) {
								local315++;
								local319.method2878(local355[local359] & 0xFFFF);
							}
						}
					}
					local334++;
				}
			}
		}
		if (local315 > 0) {
			@Pc(465) Class130_Sub2 local465 = new Class130_Sub2(this.aClass13_Sub2_9, 5123, local319.aByteArray26, local319.anInt3378);
			this.aClass13_Sub2_9.method1100(0, local315, local465);
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!laa;[I)V")
	@Override
	public void method7455(@OriginalArg(0) Class2_Sub12 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass114_14.method2771(new Class2_Sub44(this.aClass13_Sub2_9, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!ed", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class2_Sub7_Sub17 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub7_Sub17 arg2) {
		if ((this.aByteArrayArray6[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt8647 >> this.aClass13_Sub2_9.anInt1075;
		@Pc(27) Class2_Sub7_Sub17_Sub1 local27 = (Class2_Sub7_Sub17_Sub1) arg2;
		@Pc(43) Class2_Sub7_Sub17_Sub1 local43;
		if (local27 != null && local27.method8391(local24, local24)) {
			local43 = local27;
			local27.method8389();
		} else {
			local43 = new Class2_Sub7_Sub17_Sub1(this.aClass13_Sub2_9, local24, local24);
		}
		local43.method8392(local24, 0, 0, local24);
		this.method2237(arg1, local43, arg0);
		return local43;
	}

	@OriginalMember(owner = "client!ed", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray7 == null) {
			this.anIntArrayArrayArray7 = new int[super.anInt8650][super.anInt8645][];
		}
		if (arg3 != null && this.anIntArrayArrayArray4 == null) {
			this.anIntArrayArrayArray4 = new int[super.anInt8650][super.anInt8645][];
		}
		@Pc(33) Interface2 local33 = this.aClass13_Sub2_9.anInterface2_12;
		this.anIntArrayArrayArray3[arg0][arg1] = arg2;
		this.anIntArrayArrayArray5[arg0][arg1] = arg4;
		this.anIntArrayArrayArray6[arg0][arg1] = arg6;
		this.anIntArrayArrayArray2[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray7 != null) {
			this.anIntArrayArrayArray7[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray4 != null) {
			this.anIntArrayArrayArray4[arg0][arg1] = arg3;
		}
		@Pc(92) Class2_Sub29[] local92 = this.aClass2_Sub29ArrayArrayArray1[arg0][arg1] = new Class2_Sub29[arg6.length];
		for (@Pc(94) int local94 = 0; local94 < arg6.length; local94++) {
			@Pc(100) int local100 = arg8[local94];
			@Pc(104) int local104 = arg9[local94];
			if ((this.anInt2641 & 0x20) != 0 && local100 != -1 && local33.method6027(local100).aBoolean514) {
				local104 = 128;
				local100 = -1;
			}
			@Pc(149) long local149 = (long) (local104 << 14) | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28 | (long) local100;
			@Pc(155) Class2 local155;
			for (local155 = this.lb.method7484(local149); local155 != null; local155 = this.lb.method7486()) {
				@Pc(160) Class2_Sub29 local160 = (Class2_Sub29) local155;
				if (local160.anInt5533 == local100 && local160.aFloat113 == (float) local104 && local160.anInt5536 == arg10 && arg11 == local160.anInt5541 && arg12 == local160.anInt5539) {
					break;
				}
			}
			if (local155 == null) {
				local92[local94] = new Class2_Sub29(this, local100, local104, arg10, arg11, arg12);
				this.lb.method7477(local92[local94], local149);
			} else {
				local92[local94] = (Class2_Sub29) local155;
			}
		}
		if (arg13) {
			this.aByteArrayArray6[arg0][arg1] = (byte) (this.aByteArrayArray6[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt2645) {
			this.anInt2645 = arg6.length;
		}
		this.anInt2644 += arg6.length;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(III[[ZZIII)V")
	private void method2242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean[][] arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (this.aClass2_Sub29Array1 == null) {
			return;
		}
		@Pc(23) int local23 = arg0 + arg0 + 1;
		@Pc(27) int local27 = local23 * local23;
		if (this.aClass13_Sub2_9.anIntArray64.length < local27) {
			this.aClass13_Sub2_9.anIntArray64 = new int[local27];
		}
		if (this.anInt2639 * 2 > this.aClass13_Sub2_9.aClass2_Sub17_Sub2_1.aByteArray26.length) {
			this.aClass13_Sub2_9.aClass2_Sub17_Sub2_1 = new Class2_Sub17_Sub2(this.anInt2639 * 2);
		}
		@Pc(71) int local71 = arg4 - arg0;
		@Pc(73) int local73 = local71;
		if (local71 < 0) {
			local71 = 0;
		}
		@Pc(82) int local82 = arg5 - arg0;
		@Pc(84) int local84 = local82;
		if (local82 < 0) {
			local82 = 0;
		}
		@Pc(92) int local92 = arg4 + arg0;
		if (local92 > super.anInt8650 - 1) {
			local92 = super.anInt8650 - 1;
		}
		@Pc(107) int local107 = arg5 + arg0;
		if (local107 > super.anInt8645 - 1) {
			local107 = super.anInt8645 - 1;
		}
		@Pc(124) int local124 = 0;
		@Pc(128) int[] local128 = this.aClass13_Sub2_9.anIntArray64;
		@Pc(141) int local141;
		for (@Pc(130) int local130 = local71; local130 <= local92; local130++) {
			@Pc(139) boolean[] local139 = arg2[local130 - local73];
			for (local141 = local82; local141 <= local107; local141++) {
				if (local139[local141 - local84]) {
					local128[local124++] = local130 + super.anInt8650 * local141;
				}
			}
		}
		if (arg1 == -1) {
			this.aClass13_Sub2_9.method1030();
		} else {
			this.aClass13_Sub2_9.method1054((float) arg1);
			this.aClass13_Sub2_9.method1043();
		}
		this.aClass13_Sub2_9.method1022((this.anInt2641 & 0x7) != 0);
		for (@Pc(212) int local212 = 0; local212 < this.aClass2_Sub29Array1.length; local212++) {
			this.aClass2_Sub29Array1[local212].method4833(local124, local128);
		}
		if (!this.aClass114_14.method2767()) {
			local141 = this.aClass13_Sub2_9.anInt1104;
			@Pc(245) int local245 = this.aClass13_Sub2_9.anInt1088;
			this.aClass13_Sub2_9.L(0, local245, this.aClass13_Sub2_9.anInt1102);
			this.aClass13_Sub2_9.method1022(false);
			this.aClass13_Sub2_9.method1062(false);
			this.aClass13_Sub2_9.method1090(128);
			this.aClass13_Sub2_9.method1023(-2);
			this.aClass13_Sub2_9.method1096(this.aClass13_Sub2_9.aClass10_Sub2_1);
			this.aClass13_Sub2_9.method1045(8448, 7681);
			this.aClass13_Sub2_9.method1021(34166, 770, 0);
			this.aClass13_Sub2_9.method1034(34167, 0);
			for (@Pc(305) Class2 local305 = this.aClass114_14.method2772(); local305 != null; local305 = this.aClass114_14.method2762()) {
				@Pc(310) Class2_Sub44 local310 = (Class2_Sub44) local305;
				local310.method8004(arg4, arg5, arg2, arg0);
			}
			this.aClass13_Sub2_9.method1021(5890, 768, 0);
			this.aClass13_Sub2_9.method1034(5890, 0);
			this.aClass13_Sub2_9.method1096((Class10) null);
			this.aClass13_Sub2_9.L(local141, local245, this.aClass13_Sub2_9.anInt1102);
		}
		if (this.aClass244_1 == null) {
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		this.aClass13_Sub2_9.method1067((Class352) null, this.aClass352_4, (Class352) null, this.aClass352_3);
		this.aClass244_1.method5758(arg2, arg3, arg5, arg4, arg0);
		OpenGL.glPopMatrix();
		return;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method7450(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method2242(arg2, arg5, arg3, arg4, arg0, arg1, arg6);
	}
}
