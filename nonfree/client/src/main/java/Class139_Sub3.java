import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tr")
public final class Class139_Sub3 extends Class139 {

	@OriginalMember(owner = "client!tr", name = "p", descriptor = "I")
	private int anInt8186;

	@OriginalMember(owner = "client!tr", name = "z", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray17;

	@OriginalMember(owner = "client!tr", name = "T", descriptor = "I")
	private int anInt8204;

	@OriginalMember(owner = "client!tr", name = "bb", descriptor = "Lclient!wl;")
	private Interface24 anInterface24_14;

	@OriginalMember(owner = "client!tr", name = "db", descriptor = "Lclient!kr;")
	public Class48 aClass48_20;

	@OriginalMember(owner = "client!tr", name = "eb", descriptor = "Lclient!wl;")
	private Interface24 anInterface24_15;

	@OriginalMember(owner = "client!tr", name = "fb", descriptor = "I")
	private int anInt8207;

	@OriginalMember(owner = "client!tr", name = "hb", descriptor = "I")
	private int anInt8208;

	@OriginalMember(owner = "client!tr", name = "kb", descriptor = "[Lclient!rfa;")
	private Class3_Sub43[] aClass3_Sub43Array1;

	@OriginalMember(owner = "client!tr", name = "N", descriptor = "F")
	private float aFloat179 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!tr", name = "Z", descriptor = "F")
	private float aFloat180 = -3.4028235E38F;

	@OriginalMember(owner = "client!tr", name = "I", descriptor = "Lclient!hga;")
	private final Class130 aClass130_52 = new Class130();

	@OriginalMember(owner = "client!tr", name = "B", descriptor = "Lclient!cf;")
	public final Class43_Sub1 aClass43_Sub1_22;

	@OriginalMember(owner = "client!tr", name = "q", descriptor = "I")
	private final int anInt8187;

	@OriginalMember(owner = "client!tr", name = "ab", descriptor = "[[[Lclient!rfa;")
	private Class3_Sub43[][][] aClass3_Sub43ArrayArrayArray1;

	@OriginalMember(owner = "client!tr", name = "gb", descriptor = "[[F")
	private float[][] aFloatArrayArray13;

	@OriginalMember(owner = "client!tr", name = "F", descriptor = "I")
	private final int anInt8196;

	@OriginalMember(owner = "client!tr", name = "v", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!tr", name = "jb", descriptor = "[[B")
	private byte[][] aByteArrayArray28;

	@OriginalMember(owner = "client!tr", name = "Y", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray20;

	@OriginalMember(owner = "client!tr", name = "G", descriptor = "[[S")
	public final short[][] aShortArrayArray79;

	@OriginalMember(owner = "client!tr", name = "K", descriptor = "[[B")
	private final byte[][] aByteArrayArray27;

	@OriginalMember(owner = "client!tr", name = "u", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!tr", name = "ib", descriptor = "[[F")
	private float[][] aFloatArrayArray14;

	@OriginalMember(owner = "client!tr", name = "E", descriptor = "I")
	public final int anInt8195;

	@OriginalMember(owner = "client!tr", name = "D", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray18;

	@OriginalMember(owner = "client!tr", name = "lb", descriptor = "[[F")
	private float[][] lb;

	@OriginalMember(owner = "client!tr", name = "X", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray19;

	@OriginalMember(owner = "client!tr", name = "cb", descriptor = "Lclient!sl;")
	private Class310 aClass310_34;

	@OriginalMember(owner = "client!tr", name = "x", descriptor = "Lclient!ev;")
	private Class87 aClass87_2;

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(Lclient!cf;IIII[[I[[II)V")
	public Class139_Sub3(@OriginalArg(0) Class43_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass43_Sub1_22 = arg0;
		this.anInt8187 = super.anInt8176 - 2;
		this.aClass3_Sub43ArrayArrayArray1 = new Class3_Sub43[arg3][arg4][];
		this.aFloatArrayArray13 = new float[super.anInt8179 + 1][super.anInt8180 + 1];
		this.anInt8196 = 0x1 << this.anInt8187;
		this.anIntArrayArrayArray16 = new int[arg3][arg4][];
		this.aByteArrayArray28 = new byte[arg3 + 1][arg4 + 1];
		this.anIntArrayArrayArray20 = new int[arg3][arg4][];
		this.aShortArrayArray79 = new short[arg4 * arg3][];
		this.aByteArrayArray27 = new byte[arg3][arg4];
		this.anIntArrayArrayArray15 = new int[arg3][arg4][];
		this.aFloatArrayArray14 = new float[super.anInt8179 + 1][super.anInt8180 + 1];
		this.anInt8195 = arg2;
		this.anIntArrayArrayArray18 = new int[arg3][arg4][];
		this.lb = new float[super.anInt8179 + 1][super.anInt8180 + 1];
		this.anIntArrayArrayArray19 = new int[arg3][arg4][];
		for (@Pc(121) int local121 = 0; super.anInt8180 >= local121; local121++) {
			for (@Pc(125) int local125 = 0; local125 <= super.anInt8179; local125++) {
				@Pc(134) int local134 = super.anIntArrayArray63[local125][local121];
				if ((float) local134 < this.aFloat179) {
					this.aFloat179 = local134;
				}
				if ((float) local134 > this.aFloat180) {
					this.aFloat180 = local134;
				}
				if (local125 > 0 && local121 > 0 && local125 < super.anInt8179 && super.anInt8180 > local121) {
					@Pc(186) int local186 = arg6[local125 + 1][local121] - arg6[local125 - 1][local121];
					@Pc(203) int local203 = arg6[local125][local121 + 1] - arg6[local125][local121 - 1];
					@Pc(223) float local223 = (float) (1.0D / Math.sqrt((double) (local203 * local203 + local186 * local186 + arg7 * 4 * arg7)));
					this.lb[local125][local121] = local223 * (float) local186;
					this.aFloatArrayArray14[local125][local121] = local223 * (float) (-arg7 * 2);
					this.aFloatArrayArray13[local125][local121] = local223 * (float) local203;
				}
			}
		}
		this.aFloat180++;
		this.aFloat179--;
		this.aClass310_34 = new Class310(128);
		if ((this.anInt8195 & 0x10) != 0) {
			this.aClass87_2 = new Class87(this.aClass43_Sub1_22, this);
		}
	}

	@OriginalMember(owner = "client!tr", name = "E", descriptor = "(Lclient!ha;IIIIZ)V")
	@Override
	public void E(@OriginalArg(0) Class3_Sub3_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass87_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass43_Sub1_22.anInt4811 >> 8) >> this.aClass43_Sub1_22.anInt4816;
			@Pc(39) int local39 = arg3 - (this.aClass43_Sub1_22.anInt4810 * arg2 >> 8) >> this.aClass43_Sub1_22.anInt4816;
			this.aClass87_2.method2561(local24, local39, arg0);
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method6891(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt8207 <= 0) {
			return;
		}
		@Pc(16) Interface17 local16 = this.aClass43_Sub1_22.method4281(this.anInt8204);
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = 32767;
		@Pc(22) int local22 = -32768;
		for (@Pc(24) int local24 = 0; local24 < 4; local24++) {
			local18 = 0;
			@Pc(33) Buffer local33 = local16.method6938();
			if (local33 != null) {
				@Pc(41) Stream local41 = this.aClass43_Sub1_22.method4233(local33);
				@Pc(45) int local45;
				@Pc(55) int local55;
				@Pc(57) int local57;
				@Pc(76) short[] local76;
				@Pc(80) int local80;
				@Pc(88) int local88;
				if (Stream.c()) {
					for (local45 = arg1; local45 < arg3; local45++) {
						local55 = local45 * super.anInt8179 + arg0;
						for (local57 = arg0; local57 < arg2; local57++) {
							if (arg4[local57 - arg0][local45 - arg1]) {
								local76 = this.aShortArrayArray79[local55];
								if (local76 != null) {
									for (local80 = 0; local80 < local76.length; local80++) {
										local88 = local76[local80] & 0xFFFF;
										if (local20 > local88) {
											local20 = local88;
										}
										local18++;
										if (local22 < local88) {
											local22 = local88;
										}
										local41.d(local88);
									}
								}
							}
							local55++;
						}
					}
				} else {
					for (local45 = arg1; local45 < arg3; local45++) {
						local55 = arg0 + local45 * super.anInt8179;
						for (local57 = arg0; local57 < arg2; local57++) {
							if (arg4[local57 - arg0][local45 - arg1]) {
								local76 = this.aShortArrayArray79[local55];
								if (local76 != null) {
									for (local80 = 0; local80 < local76.length; local80++) {
										local88 = local76[local80] & 0xFFFF;
										local41.f(local88);
										if (local88 > local22) {
											local22 = local88;
										}
										local18++;
										if (local88 < local20) {
											local20 = local88;
										}
									}
								}
							}
							local55++;
						}
					}
				}
				local41.a();
				if (local16.method6941()) {
					break;
				}
			}
		}
		if (local18 <= 0) {
			return;
		}
		this.aClass43_Sub1_22.method4228();
		this.aClass43_Sub1_22.method4193(false);
		this.aClass43_Sub1_22.method4301(false);
		this.aClass43_Sub1_22.method4261(false);
		this.aClass43_Sub1_22.method4278(false);
		this.aClass43_Sub1_22.method4273(0);
		this.aClass43_Sub1_22.method4237(-2, false, false);
		this.aClass43_Sub1_22.method4298(null);
		@Pc(275) Class109_Sub3 local275 = this.aClass43_Sub1_22.method4172();
		@Pc(280) float[] local280 = this.aClass43_Sub1_22.method4222();
		local280[5] = (float) 1024 / ((float) super.anInt8178 * 128.0F * (float) this.aClass43_Sub1_22.anInt4635);
		local280[9] = 0.0F;
		local280[6] = 0.0F;
		local280[1] = 0.0F;
		local280[3] = 0.0F;
		local280[8] = 0.0F;
		local280[7] = 0.0F;
		local280[2] = 0.0F;
		local280[4] = 0.0F;
		local280[11] = 0.0F;
		local280[12] = -1.0F - ((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass43_Sub1_22.anInt4728;
		local280[10] = 1.0F / (this.aFloat180 - this.aFloat179);
		local280[15] = 1.0F;
		local280[13] = 1.0F - ((float) (arg3 * 1024) / 128.0F + (float) 0) / (float) this.aClass43_Sub1_22.anInt4635;
		local280[14] = -this.aFloat179 / (this.aFloat180 - this.aFloat179);
		local280[0] = (float) 1024 / ((float) super.anInt8178 * 128.0F * (float) this.aClass43_Sub1_22.anInt4728);
		local275.method7105(0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
		this.aClass43_Sub1_22.method4272();
		this.aClass43_Sub1_22.method4287();
		if ((this.anInt8195 & 0x7) == 0) {
			this.aClass43_Sub1_22.method4301(false);
		} else {
			this.aClass43_Sub1_22.method4301(true);
			this.aClass43_Sub1_22.method4218();
		}
		this.aClass43_Sub1_22.method4209(false);
		this.aClass43_Sub1_22.method4181(0, this.anInterface24_15);
		this.aClass43_Sub1_22.method4181(1, this.anInterface24_14);
		this.aClass43_Sub1_22.method4196(this.aClass48_20);
		this.aClass43_Sub1_22.method4232(Static534.aClass319_7, local20, local22 + 1 - local20, 0, local18 / 3, local16);
		this.aClass43_Sub1_22.method4209(true);
	}

	@OriginalMember(owner = "client!tr", name = "BA", descriptor = "()V")
	@Override
	public void BA() {
		if (this.anInt8207 > 0) {
			@Pc(14) byte[][] local14 = new byte[super.anInt8179 + 1][super.anInt8180 + 1];
			for (@Pc(16) int local16 = 1; local16 < super.anInt8179; local16++) {
				for (@Pc(20) int local20 = 1; local20 < super.anInt8180; local20++) {
					local14[local16][local20] = (byte) ((this.aByteArrayArray28[local16][local20] >> 1) + (this.aByteArrayArray28[local16][local20 + 1] >> 3) + (this.aByteArrayArray28[local16 + -1][local20] >> 2) + (this.aByteArrayArray28[local16 + 1][local20] >> 3) + (this.aByteArrayArray28[local16][local20 + -1] >> 2));
				}
			}
			@Pc(104) Class3_Sub43[] local104 = new Class3_Sub43[this.aClass310_34.method6608()];
			this.aClass310_34.method6604(local104);
			for (@Pc(112) int local112 = 0; local112 < local104.length; local112++) {
				local104[local112].method6300(this.anInt8207);
			}
			@Pc(128) int local128 = 20;
			if (this.anIntArrayArrayArray17 != null) {
				local128 += 4;
			}
			if ((this.anInt8195 & 0x7) != 0) {
				local128 += 12;
			}
			@Pc(151) NativeHeapBuffer local151 = this.aClass43_Sub1_22.aNativeHeap3.a(this.anInt8207 * 4, false);
			@Pc(161) NativeHeapBuffer local161 = this.aClass43_Sub1_22.aNativeHeap3.a(this.anInt8207 * local128, false);
			@Pc(166) Stream local166 = new Stream(local161);
			@Pc(171) Stream local171 = new Stream(local151);
			@Pc(175) Class3_Sub43[] local175 = new Class3_Sub43[this.anInt8207];
			@Pc(182) int local182 = Static247.method4032(this.anInt8207 / 4);
			if (local182 < 1) {
				local182 = 1;
			}
			@Pc(194) Class310 local194 = new Class310(local182);
			@Pc(198) Class3_Sub43[] local198 = new Class3_Sub43[this.anInt8208];
			@Pc(204) int local204;
			for (@Pc(200) int local200 = 0; local200 < super.anInt8179; local200++) {
				for (local204 = 0; super.anInt8180 > local204; local204++) {
					if (this.anIntArrayArrayArray19[local200][local204] != null) {
						@Pc(220) Class3_Sub43[] local220 = this.aClass3_Sub43ArrayArrayArray1[local200][local204];
						@Pc(227) int[] local227 = this.anIntArrayArrayArray15[local200][local204];
						@Pc(234) int[] local234 = this.anIntArrayArrayArray20[local200][local204];
						@Pc(241) int[] local241 = this.anIntArrayArrayArray16[local200][local204];
						@Pc(248) int[] local248 = this.anIntArrayArrayArray19[local200][local204];
						@Pc(260) int[] local260 = this.anIntArrayArrayArray18 == null ? null : this.anIntArrayArrayArray18[local200][local204];
						if (local241 == null) {
							local241 = local248;
						}
						@Pc(276) int[] local276 = this.anIntArrayArrayArray17 == null ? null : this.anIntArrayArrayArray17[local200][local204];
						@Pc(283) float local283 = this.lb[local200][local204];
						@Pc(290) float local290 = this.aFloatArrayArray14[local200][local204];
						@Pc(297) float local297 = this.aFloatArrayArray13[local200][local204];
						@Pc(306) float local306 = this.lb[local200][local204 + 1];
						@Pc(315) float local315 = this.aFloatArrayArray14[local200][local204 + 1];
						@Pc(324) float local324 = this.aFloatArrayArray13[local200][local204 + 1];
						@Pc(335) float local335 = this.lb[local200 + 1][local204 + 1];
						@Pc(346) float local346 = this.aFloatArrayArray14[local200 + 1][local204 + 1];
						@Pc(357) float local357 = this.aFloatArrayArray13[local200 + 1][local204 + 1];
						@Pc(366) float local366 = this.lb[local200 + 1][local204];
						@Pc(375) float local375 = this.aFloatArrayArray14[local200 + 1][local204];
						@Pc(384) float local384 = this.aFloatArrayArray13[local200 + 1][local204];
						@Pc(392) int local392 = local14[local200][local204] & 0xFF;
						@Pc(402) int local402 = local14[local200][local204 + 1] & 0xFF;
						@Pc(414) int local414 = local14[local200 + 1][local204 + 1] & 0xFF;
						@Pc(424) int local424 = local14[local200 + 1][local204] & 0xFF;
						@Pc(426) int local426 = 0;
						@Pc(436) int local436;
						label357: for (@Pc(428) int local428 = 0; local428 < local248.length; local428++) {
							@Pc(434) Class3_Sub43 local434 = local220[local428];
							for (local436 = 0; local436 < local426; local436++) {
								if (local434 == local198[local436]) {
									continue label357;
								}
							}
							local198[local426++] = local434;
						}
						@Pc(473) short[] local473 = this.aShortArrayArray79[local200 + super.anInt8179 * local204] = new short[local248.length];
						for (local436 = 0; local436 < local248.length; local436++) {
							@Pc(487) int local487 = (local200 << super.anInt8176) + local227[local436];
							@Pc(496) int local496 = (local204 << super.anInt8176) + local234[local436];
							@Pc(501) int local501 = local487 >> this.anInt8187;
							@Pc(506) int local506 = local496 >> this.anInt8187;
							@Pc(510) int local510 = local248[local436];
							@Pc(514) int local514 = local241[local436];
							@Pc(522) int local522 = local260 == null ? 0 : local260[local436];
							@Pc(540) long local540 = (long) local514 << 48 | (long) local510 << 32 | (long) (local501 << 16) | (long) local506;
							@Pc(544) int local544 = local227[local436];
							@Pc(548) int local548 = local234[local436];
							@Pc(550) byte local550 = 74;
							@Pc(552) int local552 = 0;
							@Pc(554) float local554 = 1.0F;
							@Pc(667) float local667;
							@Pc(651) float local651;
							@Pc(676) float local676;
							@Pc(619) float local619;
							@Pc(715) int local715;
							if (local544 == 0 && local548 == 0) {
								local676 = local297;
								local715 = local550 - local392;
								local667 = local283;
								local651 = local290;
							} else if (local544 == 0 && super.anInt8178 == local548) {
								local676 = local324;
								local667 = local306;
								local715 = local550 - local402;
								local651 = local315;
							} else if (super.anInt8178 == local544 && super.anInt8178 == local548) {
								local715 = local550 - local414;
								local667 = local335;
								local676 = local357;
								local651 = local346;
							} else if (local544 == super.anInt8178 && local548 == 0) {
								local676 = local384;
								local667 = local366;
								local651 = local375;
								local715 = local550 - local424;
							} else {
								@Pc(596) float local596 = (float) local544 / (float) super.anInt8178;
								@Pc(603) float local603 = (float) local548 / (float) super.anInt8178;
								@Pc(611) float local611 = local283 + local596 * (local366 - local283);
								local619 = local290 + local596 * (local375 - local290);
								@Pc(627) float local627 = local297 + (local384 - local297) * local596;
								@Pc(635) float local635 = (local335 - local306) * local596 + local306;
								@Pc(643) float local643 = local315 + local596 * (local346 - local315);
								local651 = (local643 - local619) * local603 + local619;
								@Pc(659) float local659 = local324 + (local357 - local324) * local596;
								local667 = local611 + (local635 - local611) * local603;
								local676 = local603 * (local659 - local627) + local627;
								@Pc(689) int local689 = local392 + (local544 * (local424 - local392) >> super.anInt8176);
								@Pc(701) int local701 = local402 + (local544 * (local414 - local402) >> super.anInt8176);
								local715 = local550 - local689 - (local548 * (local701 - local689) >> super.anInt8176);
							}
							if (local510 != -1) {
								@Pc(775) int local775 = (local510 & 0x7F) * local715 >> 7;
								if (local775 < 2) {
									local775 = 2;
								} else if (local775 > 126) {
									local775 = 126;
								}
								if ((this.anInt8195 & 0x7) == 0) {
									local554 = local651 * this.aClass43_Sub1_22.aFloatArray28[1] + this.aClass43_Sub1_22.aFloatArray28[0] * local667 + this.aClass43_Sub1_22.aFloatArray28[2] * local676;
									local554 = (local554 > 0.0F ? this.aClass43_Sub1_22.aFloat105 : this.aClass43_Sub1_22.aFloat102) * local554 + this.aClass43_Sub1_22.aFloat97;
								}
								local552 = Static213.anIntArray342[local775 | local510 & 0xFF80];
							}
							@Pc(844) Class3 local844 = null;
							if ((local487 & this.anInt8196 - 1) == 0 && (local496 & this.anInt8196 - 1) == 0) {
								local844 = local194.method6601(local540);
							}
							@Pc(1190) int local1190;
							@Pc(877) int local877;
							if (local844 == null) {
								if (local510 == local514) {
									local877 = local552;
								} else {
									@Pc(887) int local887 = local715 * (local514 & 0x7F) >> 7;
									if (local887 < 2) {
										local887 = 2;
									} else if (local887 > 126) {
										local887 = 126;
									}
									local877 = Static213.anIntArray342[local514 & 0xFF80 | local887];
									if ((this.anInt8195 & 0x7) == 0) {
										@Pc(940) float local940 = local651 * this.aClass43_Sub1_22.aFloatArray28[1] + this.aClass43_Sub1_22.aFloatArray28[0] * local667 + this.aClass43_Sub1_22.aFloatArray28[2] * local676;
										local619 = local554 * (local554 > 0.0F ? this.aClass43_Sub1_22.aFloat105 : this.aClass43_Sub1_22.aFloat102) + this.aClass43_Sub1_22.aFloat97;
										@Pc(965) int local965 = local877 >> 16 & 0xFF;
										@Pc(971) int local971 = local877 >> 8 & 0xFF;
										@Pc(975) int local975 = local877 & 0xFF;
										local965 = (int) ((float) local965 * local619);
										if (local965 < 0) {
											local965 = 0;
										} else if (local965 > 255) {
											local965 = 255;
										}
										local971 = (int) ((float) local971 * local619);
										if (local971 < 0) {
											local971 = 0;
										} else if (local971 > 255) {
											local971 = 255;
										}
										local975 = (int) ((float) local975 * local619);
										if (local975 < 0) {
											local975 = 0;
										} else if (local975 > 255) {
											local975 = 255;
										}
										local877 = local971 << 8 | local965 << 16 | local975;
									}
								}
								if (Stream.c()) {
									local166.a((float) local487);
									local166.a((float) (this.method6890(local487, local496) + local522));
									local166.a((float) local496);
									local166.a((float) local487);
									local166.a((float) local496);
									if (this.anIntArrayArrayArray17 != null) {
										local166.a((float) (local276 == null ? 0 : local276[local436] - 1));
									}
									if ((this.anInt8195 & 0x7) != 0) {
										local166.a(local667);
										local166.a(local651);
										local166.a(local676);
									}
								} else {
									local166.b((float) local487);
									local166.b((float) (local522 + this.method6890(local487, local496)));
									local166.b((float) local496);
									local166.b((float) local487);
									local166.b((float) local496);
									if (this.anIntArrayArrayArray17 != null) {
										local166.b((float) (local276 == null ? 0 : local276[local436] - 1));
									}
									if ((this.anInt8195 & 0x7) != 0) {
										local166.b(local667);
										local166.b(local651);
										local166.b(local676);
									}
								}
								if (this.aClass43_Sub1_22.anInt4823 == 0) {
									local171.c(local877 | 0xFF000000);
								} else {
									local171.e(local877 | 0xFF000000);
								}
								local1190 = this.anInt8186++;
								local473[local436] = (short) local1190;
								if (local510 != -1) {
									local175[local1190] = local220[local436];
								}
								local194.method6603(new Class3_Sub26(local473[local436]), local540);
							} else {
								local473[local436] = ((Class3_Sub26) local844).aShort53;
								local1190 = local473[local436] & 0xFFFF;
								if (local510 != -1 && local220[local436].aLong273 < local175[local1190].aLong273) {
									local175[local1190] = local220[local436];
								}
							}
							for (local877 = 0; local877 < local426; local877++) {
								local198[local877].method6291(local552, local715, local554, local1190);
							}
							this.anInt8204++;
						}
					}
				}
			}
			for (local204 = 0; local204 < this.anInt8186; local204++) {
				@Pc(1303) Class3_Sub43 local1303 = local175[local204];
				if (local1303 != null) {
					local1303.method6302(local204);
				}
			}
			@Pc(1324) int local1324;
			@Pc(1342) int local1342;
			for (@Pc(1320) int local1320 = 0; local1320 < super.anInt8179; local1320++) {
				for (local1324 = 0; local1324 < super.anInt8180; local1324++) {
					@Pc(1336) short[] local1336 = this.aShortArrayArray79[local1320 + local1324 * super.anInt8179];
					if (local1336 != null) {
						@Pc(1340) int local1340 = 0;
						local1342 = 0;
						while (local1342 < local1336.length) {
							@Pc(1351) int local1351 = local1336[local1342++] & 0xFFFF;
							@Pc(1358) int local1358 = local1336[local1342++] & 0xFFFF;
							@Pc(1365) int local1365 = local1336[local1342++] & 0xFFFF;
							@Pc(1369) Class3_Sub43 local1369 = local175[local1351];
							@Pc(1373) Class3_Sub43 local1373 = local175[local1358];
							@Pc(1377) Class3_Sub43 local1377 = local175[local1365];
							@Pc(1379) Class3_Sub43 local1379 = null;
							if (local1369 != null) {
								local1379 = local1369;
								local1369.method6301(local1340, local1324, local1320);
							}
							if (local1373 != null) {
								local1373.method6301(local1340, local1324, local1320);
								if (local1379 == null || local1373.aLong273 < local1379.aLong273) {
									local1379 = local1373;
								}
							}
							if (local1377 != null) {
								local1377.method6301(local1340, local1324, local1320);
								if (local1379 == null || local1379.aLong273 > local1377.aLong273) {
									local1379 = local1377;
								}
							}
							if (local1379 != null) {
								if (local1369 != null) {
									local1379.method6302(local1351);
								}
								if (local1373 != null) {
									local1379.method6302(local1358);
								}
								if (local1377 != null) {
									local1379.method6302(local1365);
								}
								local1379.method6301(local1340, local1324, local1320);
							}
							local1340++;
						}
					}
				}
			}
			local166.a();
			local171.a();
			this.anInterface24_14 = this.aClass43_Sub1_22.method4188(false);
			this.anInterface24_14.method4800(4, this.anInt8186 * 4, local151);
			this.anInterface24_15 = this.aClass43_Sub1_22.method4188(false);
			this.anInterface24_15.method4800(local128, local128 * this.anInt8186, local161);
			if ((this.anInt8195 & 0x7) == 0) {
				if (this.anIntArrayArrayArray17 == null) {
					this.aClass48_20 = this.aClass43_Sub1_22.method4290(new Class289[] { new Class289(new Class68[] { Static100.aClass68_1, Static100.aClass68_5 }), new Class289(Static100.aClass68_3) });
				} else {
					this.aClass48_20 = this.aClass43_Sub1_22.method4290(new Class289[] { new Class289(new Class68[] { Static100.aClass68_1, Static100.aClass68_5, Static100.aClass68_4 }), new Class289(Static100.aClass68_3) });
				}
			} else if (this.anIntArrayArrayArray17 == null) {
				this.aClass48_20 = this.aClass43_Sub1_22.method4290(new Class289[] { new Class289(new Class68[] { Static100.aClass68_1, Static100.aClass68_5, Static100.aClass68_2 }), new Class289(Static100.aClass68_3) });
			} else {
				this.aClass48_20 = this.aClass43_Sub1_22.method4290(new Class289[] { new Class289(new Class68[] { Static100.aClass68_1, Static100.aClass68_5, Static100.aClass68_4, Static100.aClass68_2 }), new Class289(Static100.aClass68_3) });
			}
			local1324 = 0;
			for (@Pc(1678) int local1678 = 0; local1678 < local104.length; local1678++) {
				if (local104[local1678].anInt7423 > 0) {
					local104[local1324++] = local104[local1678];
				}
			}
			this.aClass3_Sub43Array1 = new Class3_Sub43[local1324];
			@Pc(1708) long[] local1708 = new long[local1324];
			for (local1342 = 0; local1342 < local1324; local1342++) {
				@Pc(1716) Class3_Sub43 local1716 = local104[local1342];
				local1708[local1342] = local1716.aLong273;
				this.aClass3_Sub43Array1[local1342] = local1716;
				local1716.method6297(this.anInt8186);
			}
			Static234.method3940(this.aClass3_Sub43Array1, local1708);
			if (this.aClass87_2 != null) {
				this.aClass87_2.method2554();
			}
		} else {
			this.aClass87_2 = null;
		}
		this.anIntArrayArrayArray16 = null;
		this.aClass3_Sub43ArrayArrayArray1 = null;
		this.lb = this.aFloatArrayArray14 = this.aFloatArrayArray13 = null;
		this.aByteArrayArray28 = null;
		this.anIntArrayArrayArray19 = null;
		this.aClass310_34 = null;
		this.anIntArrayArrayArray17 = null;
		this.anIntArrayArrayArray15 = this.anIntArrayArrayArray20 = null;
		this.anIntArrayArrayArray18 = null;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(II)V")
	@Override
	public void method6885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!tr", name = "v", descriptor = "(IILclient!ha;)Lclient!ha;")
	@Override
	public Class3_Sub3_Sub10 v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub3_Sub10 arg2) {
		if ((this.aByteArrayArray27[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(21) int local21 = super.anInt8178 >> this.aClass43_Sub1_22.anInt4816;
		@Pc(24) Class3_Sub3_Sub10_Sub2 local24 = (Class3_Sub3_Sub10_Sub2) arg2;
		@Pc(40) Class3_Sub3_Sub10_Sub2 local40;
		if (local24 != null && local24.method2992(local21, local21)) {
			local40 = local24;
			local24.method2993();
		} else {
			local40 = new Class3_Sub3_Sub10_Sub2(this.aClass43_Sub1_22, local21, local21);
		}
		local40.method2990(0, local21, 0, local21);
		this.method6894(arg0, local40, arg1);
		return local40;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(III)V")
	@Override
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray28[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray28[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method6882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method6893(arg0, arg3, arg2, -1, arg4, arg1);
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lclient!ha;IIIIZ)Z")
	@Override
	public boolean method6881(@OriginalArg(0) Class3_Sub3_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass87_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (this.aClass43_Sub1_22.anInt4811 * arg2 >> 8) >> this.aClass43_Sub1_22.anInt4816;
			@Pc(40) int local40 = arg3 - (this.aClass43_Sub1_22.anInt4810 * arg2 >> 8) >> this.aClass43_Sub1_22.anInt4816;
			return this.aClass87_2.method2558(arg0, local40, local25);
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
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

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(I[[ZIBIZI)V")
	private void method6893(@OriginalArg(0) int arg0, @OriginalArg(1) boolean[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (this.aClass3_Sub43Array1 == null) {
			return;
		}
		@Pc(18) int local18 = arg2 + arg2 + 1;
		@Pc(22) int local22 = local18 * local18;
		if (Static255.anIntArray371.length < local22) {
			Static255.anIntArray371 = new int[local22];
		}
		@Pc(34) int local34 = arg0 - arg2;
		@Pc(36) int local36 = local34;
		if (local34 < 0) {
			local34 = 0;
		}
		@Pc(45) int local45 = arg5 - arg2;
		@Pc(47) int local47 = local45;
		if (local45 < 0) {
			local45 = 0;
		}
		@Pc(58) int local58 = arg2 + arg0;
		if (super.anInt8179 - 1 < local58) {
			local58 = super.anInt8179 - 1;
		}
		@Pc(73) int local73 = arg2 + arg5;
		Static80.anInt9028 = 0;
		if (super.anInt8180 - 1 < local73) {
			local73 = super.anInt8180 - 1;
		}
		for (@Pc(88) int local88 = local34; local88 <= local58; local88++) {
			@Pc(97) boolean[] local97 = arg1[local88 - local36];
			for (@Pc(99) int local99 = local45; local99 <= local73; local99++) {
				if (local97[local99 - local47]) {
					Static255.anIntArray371[Static80.anInt9028++] = local88 + super.anInt8179 * local99;
				}
			}
		}
		if (arg3 == -1) {
			this.aClass43_Sub1_22.method4203();
		} else {
			this.aClass43_Sub1_22.method4221((float) arg3);
			this.aClass43_Sub1_22.method4249();
		}
		this.aClass43_Sub1_22.method4263();
		this.aClass43_Sub1_22.method4301((this.anInt8195 & 0x7) != 0);
		this.aClass43_Sub1_22.method4237(-1, false, false);
		this.aClass43_Sub1_22.method4181(0, this.anInterface24_15);
		for (@Pc(183) int local183 = 0; local183 < this.aClass3_Sub43Array1.length; local183++) {
			this.aClass3_Sub43Array1[local183].method6293(Static80.anInt9028, Static255.anIntArray371);
		}
		@Pc(204) Class109_Sub3 local204 = this.aClass43_Sub1_22.method4172();
		local204.NA(0, -1, 0);
		this.aClass43_Sub1_22.method4287();
		if (!this.aClass130_52.method3542()) {
			@Pc(222) int local222 = this.aClass43_Sub1_22.anInt4820;
			@Pc(226) int local226 = this.aClass43_Sub1_22.anInt4832;
			this.aClass43_Sub1_22.pa(0, local226, this.aClass43_Sub1_22.anInt4802);
			this.aClass43_Sub1_22.method4301(false);
			this.aClass43_Sub1_22.method4278(false);
			this.aClass43_Sub1_22.method4273(128);
			this.aClass43_Sub1_22.method4237(-2, false, false);
			this.aClass43_Sub1_22.method4298(this.aClass43_Sub1_22.anInterface11_3);
			this.aClass43_Sub1_22.method4253(Static106.aClass37_2, Static587.aClass37_5);
			this.aClass43_Sub1_22.method4251(0, Static88.aClass252_2);
			this.aClass43_Sub1_22.method4241(0, Static525.aClass252_4);
			for (@Pc(286) Class3 local286 = this.aClass130_52.method3543(); local286 != null; local286 = this.aClass130_52.method3551()) {
				@Pc(291) Class3_Sub15 local291 = (Class3_Sub15) local286;
				local291.method2100(arg1, arg5, arg2, arg0);
			}
			this.aClass43_Sub1_22.method4251(0, Static74.aClass252_1);
			this.aClass43_Sub1_22.method4241(0, Static74.aClass252_1);
			this.aClass43_Sub1_22.method4298(null);
			this.aClass43_Sub1_22.pa(local222, local226, this.aClass43_Sub1_22.anInt4802);
		}
		if (this.aClass87_2 == null) {
			return;
		}
		this.aClass43_Sub1_22.method4181(0, this.anInterface24_15);
		this.aClass43_Sub1_22.method4181(1, this.anInterface24_14);
		this.aClass43_Sub1_22.method4196(this.aClass48_20);
		this.aClass87_2.method2560(arg2, arg5, arg0, arg4, arg1);
		return;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(ILclient!gk;BI)V")
	private void method6894(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub3_Sub10_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray15[arg0][arg2];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray20[arg0][arg2];
		@Pc(22) int local22 = local12.length;
		if (local22 > Static586.anIntArray694.length) {
			Static514.anIntArray625 = new int[local22];
			Static586.anIntArray694 = new int[local22];
		}
		for (@Pc(34) int local34 = 0; local34 < local22; local34++) {
			Static586.anIntArray694[local34] = local12[local34] >> this.aClass43_Sub1_22.anInt4816;
			Static514.anIntArray625[local34] = local19[local34] >> this.aClass43_Sub1_22.anInt4816;
		}
		@Pc(74) int local74 = 0;
		while (local22 > local74) {
			@Pc(80) int local80 = Static586.anIntArray694[local74];
			@Pc(85) int local85 = Static514.anIntArray625[local74++];
			@Pc(89) int local89 = Static586.anIntArray694[local74];
			@Pc(94) int local94 = Static514.anIntArray625[local74++];
			@Pc(98) int local98 = Static586.anIntArray694[local74];
			@Pc(103) int local103 = Static514.anIntArray625[local74++];
			if ((local80 - local89) * (-local103 + local94) - (local98 - local89) * (local94 - local85) > 0) {
				arg1.method2994(local80, local89, local85, local103, local94, local98);
			}
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lclient!ff;[I)V")
	@Override
	public void method6883(@OriginalArg(0) Class3_Sub22 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass130_52.method3548(new Class3_Sub15(this.aClass43_Sub1_22, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!tr", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg3 != null && this.anIntArrayArrayArray18 == null) {
			this.anIntArrayArrayArray18 = new int[super.anInt8179][super.anInt8180][];
		}
		if (arg5 != null && this.anIntArrayArrayArray17 == null) {
			this.anIntArrayArrayArray17 = new int[super.anInt8179][super.anInt8180][];
		}
		this.anIntArrayArrayArray15[arg0][arg1] = arg2;
		this.anIntArrayArrayArray20[arg0][arg1] = arg4;
		this.anIntArrayArrayArray19[arg0][arg1] = arg6;
		this.anIntArrayArrayArray16[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray17 != null) {
			this.anIntArrayArrayArray17[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray18 != null) {
			this.anIntArrayArrayArray18[arg0][arg1] = arg3;
		}
		@Pc(88) Class3_Sub43[] local88 = this.aClass3_Sub43ArrayArrayArray1[arg0][arg1] = new Class3_Sub43[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42 | (long) (arg9[local90] << 14) | (long) arg8[local90];
			@Pc(125) Class3 local125;
			for (local125 = this.aClass310_34.method6601(local119); local125 != null; local125 = this.aClass310_34.method6600()) {
				@Pc(130) Class3_Sub43 local130 = (Class3_Sub43) local125;
				if (arg8[local90] == local130.anInt7417 && (float) arg9[local90] == local130.aFloat154 && local130.anInt7418 == arg10 && arg11 == local130.anInt7425 && local130.anInt7416 == arg12) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class3_Sub43(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass310_34.method6603(local88[local90], local119);
			} else {
				local88[local90] = (Class3_Sub43) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray27[arg0][arg1] = (byte) (this.aByteArrayArray27[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt8208) {
			this.anInt8208 = arg6.length;
		}
		this.anInt8207 += arg6.length;
	}

	@OriginalMember(owner = "client!tr", name = "DA", descriptor = "(Lclient!ha;IIIIZ)V")
	@Override
	public void DA(@OriginalArg(0) Class3_Sub3_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass87_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass43_Sub1_22.anInt4811 >> 8) >> this.aClass43_Sub1_22.anInt4816;
			@Pc(38) int local38 = arg3 - (this.aClass43_Sub1_22.anInt4810 * arg2 >> 8) >> this.aClass43_Sub1_22.anInt4816;
			this.aClass87_2.method2555(local24, arg0, local38);
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method6887(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method6893(arg0, arg3, arg2, arg5, arg4, arg1);
	}
}
