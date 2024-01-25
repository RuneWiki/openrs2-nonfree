import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wba")
public final class Class259_Sub3 extends Class259 {

	@OriginalMember(owner = "client!wba", name = "fb", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray20;

	@OriginalMember(owner = "client!wba", name = "E", descriptor = "I")
	private int anInt10964;

	@OriginalMember(owner = "client!wba", name = "j", descriptor = "I")
	private int anInt10967;

	@OriginalMember(owner = "client!wba", name = "V", descriptor = "I")
	private int anInt10969;

	@OriginalMember(owner = "client!wba", name = "A", descriptor = "Lclient!pe;")
	public Class287 aClass287_13;

	@OriginalMember(owner = "client!wba", name = "B", descriptor = "Lclient!pe;")
	public Class287 aClass287_14;

	@OriginalMember(owner = "client!wba", name = "m", descriptor = "I")
	private int anInt10970;

	@OriginalMember(owner = "client!wba", name = "P", descriptor = "Lclient!pe;")
	private Class287 aClass287_15;

	@OriginalMember(owner = "client!wba", name = "W", descriptor = "Lclient!pe;")
	public Class287 aClass287_16;

	@OriginalMember(owner = "client!wba", name = "r", descriptor = "Lclient!lm;")
	private Interface13 anInterface13_7;

	@OriginalMember(owner = "client!wba", name = "db", descriptor = "[Lclient!th;")
	private Class3_Sub54[] aClass3_Sub54Array1;

	@OriginalMember(owner = "client!wba", name = "Q", descriptor = "Lclient!sja;")
	private final Class342 aClass342_93 = new Class342();

	@OriginalMember(owner = "client!wba", name = "H", descriptor = "I")
	private final int anInt10968 = this.anInt10943 - 2;

	@OriginalMember(owner = "client!wba", name = "v", descriptor = "Lclient!aq;")
	public final Class22_Sub1 aClass22_Sub1_42;

	@OriginalMember(owner = "client!wba", name = "ib", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!wba", name = "eb", descriptor = "[[F")
	private float[][] aFloatArrayArray18;

	@OriginalMember(owner = "client!wba", name = "t", descriptor = "[[B")
	private final byte[][] aByteArrayArray24;

	@OriginalMember(owner = "client!wba", name = "R", descriptor = "[[F")
	private float[][] aFloatArrayArray17;

	@OriginalMember(owner = "client!wba", name = "l", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!wba", name = "bb", descriptor = "[[B")
	private byte[][] aByteArrayArray25;

	@OriginalMember(owner = "client!wba", name = "M", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray17;

	@OriginalMember(owner = "client!wba", name = "gb", descriptor = "I")
	private final int anInt10959;

	@OriginalMember(owner = "client!wba", name = "p", descriptor = "I")
	public final int anInt10956;

	@OriginalMember(owner = "client!wba", name = "X", descriptor = "[[[Lclient!th;")
	private Class3_Sub54[][][] aClass3_Sub54ArrayArrayArray1;

	@OriginalMember(owner = "client!wba", name = "T", descriptor = "[[F")
	private float[][] aFloatArrayArray16;

	@OriginalMember(owner = "client!wba", name = "Y", descriptor = "[[S")
	public final short[][] aShortArrayArray6;

	@OriginalMember(owner = "client!wba", name = "q", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray18;

	@OriginalMember(owner = "client!wba", name = "n", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray19;

	@OriginalMember(owner = "client!wba", name = "S", descriptor = "Lclient!qn;")
	private Class313 aClass313_44;

	@OriginalMember(owner = "client!wba", name = "C", descriptor = "Lclient!aaa;")
	private Class2 aClass2_2;

	@OriginalMember(owner = "client!wba", name = "<init>", descriptor = "(Lclient!aq;IIII[[I[[II)V")
	public Class259_Sub3(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass22_Sub1_42 = arg0;
		this.anIntArrayArrayArray15 = new int[arg3][arg4][];
		this.aFloatArrayArray18 = new float[super.anInt10949 + 1][super.anInt10946 + 1];
		this.aByteArrayArray24 = new byte[arg3][arg4];
		this.aFloatArrayArray17 = new float[super.anInt10949 + 1][super.anInt10946 + 1];
		this.anIntArrayArrayArray16 = new int[arg3][arg4][];
		this.aByteArrayArray25 = new byte[arg3 + 1][arg4 + 1];
		this.anIntArrayArrayArray17 = new int[arg3][arg4][];
		this.anInt10959 = 0x1 << this.anInt10968;
		this.anInt10956 = arg2;
		this.aClass3_Sub54ArrayArrayArray1 = new Class3_Sub54[arg3][arg4][];
		this.aFloatArrayArray16 = new float[super.anInt10949 + 1][super.anInt10946 + 1];
		this.aShortArrayArray6 = new short[arg4 * arg3][];
		this.anIntArrayArrayArray18 = new int[arg3][arg4][];
		this.anIntArrayArrayArray19 = new int[arg3][arg4][];
		for (@Pc(115) int local115 = 1; local115 < super.anInt10946; local115++) {
			for (@Pc(121) int local121 = 1; local121 < super.anInt10949; local121++) {
				@Pc(140) int local140 = arg6[local121 + 1][local115] - arg6[local121 - 1][local115];
				@Pc(156) int local156 = arg6[local121][local115 + 1] - arg6[local121][local115 - 1];
				@Pc(175) float local175 = (float) (1.0D / Math.sqrt((double) (local156 * local156 + arg7 * 4 * arg7 + local140 * local140)));
				this.aFloatArrayArray17[local121][local115] = local175 * (float) local140;
				this.aFloatArrayArray16[local121][local115] = local175 * (float) (-arg7 * 2);
				this.aFloatArrayArray18[local121][local115] = local175 * (float) local156;
			}
		}
		this.aClass313_44 = new Class313(128);
		if ((this.anInt10956 & 0x10) != 0) {
			this.aClass2_2 = new Class2(this.aClass22_Sub1_42, this);
		}
	}

	@OriginalMember(owner = "client!wba", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class3_Sub7_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass2_2 != null && arg0 != null) {
			@Pc(26) int local26 = arg1 - (arg2 * this.aClass22_Sub1_42.anInt1007 >> 8) >> this.aClass22_Sub1_42.anInt994;
			@Pc(41) int local41 = arg3 - (this.aClass22_Sub1_42.anInt1021 * arg2 >> 8) >> this.aClass22_Sub1_42.anInt994;
			this.aClass2_2.method21(local41, arg0, local26);
		}
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(Lclient!jw;[I)V")
	@Override
	public void method9296(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass342_93.method7654(new Class3_Sub36(this.aClass22_Sub1_42, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method9292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		@Pc(8) int local8 = arg9.length;
		@Pc(13) int[] local13 = new int[local8 * 3];
		@Pc(18) int[] local18 = new int[local8 * 3];
		@Pc(23) int[] local23 = new int[local8 * 3];
		@Pc(28) int[] local28 = new int[local8 * 3];
		@Pc(33) int[] local33 = new int[local8 * 3];
		@Pc(38) int[] local38 = new int[local8 * 3];
		@Pc(48) int[] local48 = arg3 == null ? null : new int[local8 * 3];
		@Pc(58) int[] local58 = arg5 == null ? null : new int[local8 * 3];
		@Pc(60) int local60 = 0;
		for (@Pc(62) int local62 = 0; local62 < local8; local62++) {
			@Pc(68) int local68 = arg6[local62];
			@Pc(72) int local72 = arg7[local62];
			@Pc(76) int local76 = arg8[local62];
			local13[local60] = arg2[local68];
			local18[local60] = arg4[local68];
			local23[local60] = arg9[local62];
			local33[local60] = arg11[local62];
			local38[local60] = arg12[local62];
			local28[local60] = arg10 == null ? arg9[local62] : arg10[local62];
			if (arg3 != null) {
				local48[local60] = arg3[local68];
			}
			if (arg5 != null) {
				local58[local60] = arg5[local68];
			}
			local60++;
			local13[local60] = arg2[local72];
			local18[local60] = arg4[local72];
			local23[local60] = arg9[local62];
			local33[local60] = arg11[local62];
			local38[local60] = arg12[local62];
			local28[local60] = arg10 == null ? arg9[local62] : arg10[local62];
			if (arg3 != null) {
				local48[local60] = arg3[local72];
			}
			if (arg5 != null) {
				local58[local60] = arg5[local72];
			}
			local60++;
			local13[local60] = arg2[local76];
			local18[local60] = arg4[local76];
			local23[local60] = arg9[local62];
			local33[local60] = arg11[local62];
			local38[local60] = arg12[local62];
			local28[local60] = arg10 == null ? arg9[local62] : arg10[local62];
			if (arg3 != null) {
				local48[local60] = arg3[local76];
			}
			if (arg5 != null) {
				local58[local60] = arg5[local76];
			}
			local60++;
		}
		this.U(arg0, arg1, local13, local48, local18, local58, local23, local28, local33, local38, arg13, arg14, arg15, false);
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method9300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method9303(arg6, arg0, arg2, arg5, arg1, arg4, arg3);
	}

	@OriginalMember(owner = "client!wba", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.anInt10970 <= 0) {
			this.aClass2_2 = null;
		} else {
			@Pc(21) byte[][] local21 = new byte[super.anInt10949 + 1][super.anInt10946 + 1];
			@Pc(27) int local27;
			for (@Pc(23) int local23 = 1; super.anInt10949 > local23; local23++) {
				for (local27 = 1; local27 < super.anInt10946; local27++) {
					local21[local23][local27] = (byte) ((this.aByteArrayArray25[local23][local27] >> 1) + (this.aByteArrayArray25[local23][local27 - 1] >> 2) + (this.aByteArrayArray25[local23 + -1][local27] >> 2) + (this.aByteArrayArray25[local23 - -1][local27] >> 3) + (this.aByteArrayArray25[local23][local27 + 1] >> 3));
				}
			}
			this.aClass3_Sub54Array1 = new Class3_Sub54[this.aClass313_44.method7108()];
			this.aClass313_44.method7105(this.aClass3_Sub54Array1);
			for (local27 = 0; local27 < this.aClass3_Sub54Array1.length; local27++) {
				this.aClass3_Sub54Array1[local27].method7967(this.anInt10970);
			}
			@Pc(149) int local149 = 24;
			if (this.anIntArrayArrayArray20 != null) {
				local149 += 4;
			}
			if ((this.anInt10956 & 0x7) != 0) {
				local149 += 12;
			}
			@Pc(175) NativeHeapBuffer local175 = this.aClass22_Sub1_42.aNativeHeap1.a(local149 * this.anInt10970, false);
			@Pc(180) Stream local180 = new Stream(local175);
			@Pc(184) Class3_Sub54[] local184 = new Class3_Sub54[this.anInt10970];
			@Pc(191) int local191 = Static70.method3137(this.anInt10970 / 4);
			if (local191 < 1) {
				local191 = 1;
			}
			@Pc(203) Class313 local203 = new Class313(local191);
			@Pc(207) Class3_Sub54[] local207 = new Class3_Sub54[this.anInt10969];
			@Pc(213) int local213;
			for (@Pc(209) int local209 = 0; super.anInt10949 > local209; local209++) {
				for (local213 = 0; local213 < super.anInt10946; local213++) {
					if (this.anIntArrayArrayArray19[local209][local213] != null) {
						@Pc(231) Class3_Sub54[] local231 = this.aClass3_Sub54ArrayArrayArray1[local209][local213];
						@Pc(238) int[] local238 = this.anIntArrayArrayArray18[local209][local213];
						@Pc(245) int[] local245 = this.anIntArrayArrayArray16[local209][local213];
						@Pc(252) int[] local252 = this.anIntArrayArrayArray15[local209][local213];
						@Pc(259) int[] local259 = this.anIntArrayArrayArray19[local209][local213];
						@Pc(272) int[] local272 = this.anIntArrayArrayArray17 == null ? null : this.anIntArrayArrayArray17[local209][local213];
						@Pc(285) int[] local285 = this.anIntArrayArrayArray20 == null ? null : this.anIntArrayArrayArray20[local209][local213];
						if (local252 == null) {
							local252 = local259;
						}
						@Pc(296) float local296 = this.aFloatArrayArray17[local209][local213];
						@Pc(303) float local303 = this.aFloatArrayArray16[local209][local213];
						@Pc(310) float local310 = this.aFloatArrayArray18[local209][local213];
						@Pc(319) float local319 = this.aFloatArrayArray17[local209][local213 + 1];
						@Pc(328) float local328 = this.aFloatArrayArray16[local209][local213 + 1];
						@Pc(337) float local337 = this.aFloatArrayArray18[local209][local213 + 1];
						@Pc(348) float local348 = this.aFloatArrayArray17[local209 + 1][local213 + 1];
						@Pc(359) float local359 = this.aFloatArrayArray16[local209 + 1][local213 + 1];
						@Pc(370) float local370 = this.aFloatArrayArray18[local209 + 1][local213 + 1];
						@Pc(379) float local379 = this.aFloatArrayArray17[local209 + 1][local213];
						@Pc(388) float local388 = this.aFloatArrayArray16[local209 + 1][local213];
						@Pc(397) float local397 = this.aFloatArrayArray18[local209 + 1][local213];
						@Pc(405) int local405 = local21[local209][local213] & 0xFF;
						@Pc(415) int local415 = local21[local209][local213 + 1] & 0xFF;
						@Pc(427) int local427 = local21[local209 + 1][local213 + 1] & 0xFF;
						@Pc(437) int local437 = local21[local209 + 1][local213] & 0xFF;
						@Pc(439) int local439 = 0;
						@Pc(451) int local451;
						label337: for (@Pc(441) int local441 = 0; local441 < local259.length; local441++) {
							@Pc(449) Class3_Sub54 local449 = local231[local441];
							for (local451 = 0; local451 < local439; local451++) {
								if (local449 == local207[local451]) {
									continue label337;
								}
							}
							local207[local439++] = local449;
						}
						@Pc(504) short[] local504 = this.aShortArrayArray6[local209 + super.anInt10949 * local213] = new short[local259.length];
						for (local451 = 0; local451 < local259.length; local451++) {
							@Pc(517) int local517 = (local209 << super.anInt10943) + local238[local451];
							@Pc(527) int local527 = (local213 << super.anInt10943) + local245[local451];
							@Pc(532) int local532 = local517 >> this.anInt10968;
							@Pc(537) int local537 = local527 >> this.anInt10968;
							@Pc(541) int local541 = local259[local451];
							@Pc(545) int local545 = local252[local451];
							@Pc(554) int local554 = local272 == null ? 0 : local272[local451];
							@Pc(572) long local572 = (long) (local532 << 16) | (long) local541 << 32 | (long) local545 << 48 | (long) local537;
							@Pc(576) int local576 = local238[local451];
							@Pc(580) int local580 = local245[local451];
							@Pc(582) byte local582 = 74;
							@Pc(584) int local584 = 0;
							@Pc(586) float local586 = 1.0F;
							@Pc(605) float local605;
							@Pc(603) float local603;
							@Pc(597) float local597;
							@Pc(701) float local701;
							@Pc(601) int local601;
							if (local576 == 0 && local580 == 0) {
								local597 = local310;
								local601 = local582 - local405;
								local603 = local303;
								local605 = local296;
							} else if (local576 == 0 && local580 == super.anInt10947) {
								local597 = local337;
								local601 = local582 - local415;
								local605 = local319;
								local603 = local328;
							} else if (super.anInt10947 == local576 && local580 == super.anInt10947) {
								local603 = local359;
								local601 = local582 - local427;
								local605 = local348;
								local597 = local370;
							} else if (super.anInt10947 == local576 && local580 == 0) {
								local603 = local388;
								local605 = local379;
								local601 = local582 - local437;
								local597 = local397;
							} else {
								@Pc(677) float local677 = (float) local576 / (float) super.anInt10947;
								@Pc(684) float local684 = (float) local580 / (float) super.anInt10947;
								@Pc(692) float local692 = (local379 - local296) * local677 + local296;
								local701 = local303 + (local388 - local303) * local677;
								@Pc(709) float local709 = (local397 - local310) * local677 + local310;
								@Pc(717) float local717 = (local348 - local319) * local677 + local319;
								@Pc(725) float local725 = local677 * (local359 - local328) + local328;
								@Pc(734) float local734 = local337 + (local370 - local337) * local677;
								local603 = local701 + (local725 - local701) * local684;
								local605 = local692 + (local717 - local692) * local684;
								local597 = local684 * (local734 - local709) + local709;
								@Pc(771) int local771 = local405 + (local576 * (local437 - local405) >> super.anInt10943);
								@Pc(783) int local783 = local415 + (local576 * (local427 - local415) >> super.anInt10943);
								local601 = local582 - ((local783 - local771) * local580 >> super.anInt10943) - local771;
							}
							if (local541 != -1) {
								@Pc(821) int local821 = (local541 & 0x7F) * local601 >> 7;
								if (local821 < 2) {
									local821 = 2;
								} else if (local821 > 126) {
									local821 = 126;
								}
								if ((this.anInt10956 & 0x7) == 0) {
									local586 = this.aClass22_Sub1_42.aFloatArray4[2] * local597 + this.aClass22_Sub1_42.aFloatArray4[1] * local603 + local605 * this.aClass22_Sub1_42.aFloatArray4[0];
									local586 = (local586 > 0.0F ? this.aClass22_Sub1_42.aFloat24 : this.aClass22_Sub1_42.aFloat22) * local586 + this.aClass22_Sub1_42.aFloat21;
								}
								local584 = Static537.anIntArray601[local821 | local541 & 0xFF80];
							}
							@Pc(896) Class3 local896 = null;
							if ((this.anInt10959 - 1 & local517) == 0 && (local527 & this.anInt10959 - 1) == 0) {
								local896 = local203.method7104(local572);
							}
							@Pc(934) int local934;
							@Pc(998) int local998;
							if (local896 == null) {
								if (local545 == local541) {
									local998 = local584;
								} else {
									@Pc(972) int local972 = local601 * (local545 & 0x7F) >> 7;
									if (local972 < 2) {
										local972 = 2;
									} else if (local972 > 126) {
										local972 = 126;
									}
									local998 = Static537.anIntArray601[local545 & 0xFF80 | local972];
									if ((this.anInt10956 & 0x7) == 0) {
										local701 = this.aClass22_Sub1_42.aFloatArray4[2] * local597 + local603 * this.aClass22_Sub1_42.aFloatArray4[1] + this.aClass22_Sub1_42.aFloatArray4[0] * local605;
										local701 = (local586 > 0.0F ? this.aClass22_Sub1_42.aFloat24 : this.aClass22_Sub1_42.aFloat22) * local586 + this.aClass22_Sub1_42.aFloat21;
										@Pc(1052) int local1052 = local998 >> 16 & 0xFF;
										@Pc(1058) int local1058 = local998 >> 8 & 0xFF;
										local1052 = (int) ((float) local1052 * local701);
										@Pc(1068) int local1068 = local998 & 0xFF;
										local1058 = (int) ((float) local1058 * local701);
										if (local1052 < 0) {
											local1052 = 0;
										} else if (local1052 > 255) {
											local1052 = 255;
										}
										local1068 = (int) ((float) local1068 * local701);
										if (local1058 < 0) {
											local1058 = 0;
										} else if (local1058 > 255) {
											local1058 = 255;
										}
										if (local1068 < 0) {
											local1068 = 0;
										} else if (local1068 > 255) {
											local1068 = 255;
										}
										local998 = local1068 | local1058 << 8 | local1052 << 16;
									}
								}
								if (this.aClass22_Sub1_42.aBoolean60) {
									local180.a((float) local517);
									local180.a((float) (this.method9294(local527, local517) + local554));
									local180.a((float) local527);
									local180.f((byte) (local998 >> 16));
									local180.f((byte) (local998 >> 8));
									local180.f((byte) local998);
									local180.f(-1);
									local180.a((float) local517);
									local180.a((float) local527);
									if (this.anIntArrayArrayArray20 != null) {
										local180.a((float) (local285 == null ? 0 : local285[local451] - 1));
									}
									if ((this.anInt10956 & 0x7) != 0) {
										local180.a(local605);
										local180.a(local603);
										local180.a(local597);
									}
								} else {
									local180.b((float) local517);
									local180.b((float) (this.method9294(local527, local517) + local554));
									local180.b((float) local527);
									local180.f((byte) (local998 >> 16));
									local180.f((byte) (local998 >> 8));
									local180.f((byte) local998);
									local180.f(-1);
									local180.b((float) local517);
									local180.b((float) local527);
									if (this.anIntArrayArrayArray20 != null) {
										local180.b((float) (local285 == null ? 0 : local285[local451] - 1));
									}
									if ((this.anInt10956 & 0x7) != 0) {
										local180.b(local605);
										local180.b(local603);
										local180.b(local597);
									}
								}
								local934 = this.anInt10967++;
								local504[local451] = (short) local934;
								if (local541 != -1) {
									local184[local934] = local231[local451];
								}
								local203.method7107(local572, new Class3_Sub11(local504[local451]));
							} else {
								local504[local451] = ((Class3_Sub11) local896).aShort25;
								local934 = local504[local451] & 0xFFFF;
								if (local541 != -1 && local184[local934].aLong345 > local231[local451].aLong345) {
									local184[local934] = local231[local451];
								}
							}
							for (local998 = 0; local998 < local439; local998++) {
								local207[local998].method7964(local584, local601, local586, local934);
							}
							this.anInt10964++;
						}
					}
				}
			}
			for (local213 = 0; local213 < this.anInt10967; local213++) {
				@Pc(1400) Class3_Sub54 local1400 = local184[local213];
				if (local1400 != null) {
					local1400.method7963(local213);
				}
			}
			@Pc(1439) int local1439;
			for (@Pc(1419) int local1419 = 0; local1419 < super.anInt10949; local1419++) {
				for (@Pc(1423) int local1423 = 0; local1423 < super.anInt10946; local1423++) {
					@Pc(1435) short[] local1435 = this.aShortArrayArray6[local1419 + local1423 * super.anInt10949];
					if (local1435 != null) {
						local1439 = 0;
						@Pc(1441) int local1441 = 0;
						while (local1441 < local1435.length) {
							@Pc(1450) int local1450 = local1435[local1441++] & 0xFFFF;
							@Pc(1457) int local1457 = local1435[local1441++] & 0xFFFF;
							@Pc(1464) int local1464 = local1435[local1441++] & 0xFFFF;
							@Pc(1468) Class3_Sub54 local1468 = local184[local1450];
							@Pc(1472) Class3_Sub54 local1472 = local184[local1457];
							@Pc(1476) Class3_Sub54 local1476 = local184[local1464];
							@Pc(1478) Class3_Sub54 local1478 = null;
							if (local1468 != null) {
								local1468.method7966(local1439, local1423, local1419);
								local1478 = local1468;
							}
							if (local1472 != null) {
								local1472.method7966(local1439, local1423, local1419);
								if (local1478 == null || local1472.aLong345 < local1478.aLong345) {
									local1478 = local1472;
								}
							}
							if (local1476 != null) {
								local1476.method7966(local1439, local1423, local1419);
								if (local1478 == null || local1476.aLong345 < local1478.aLong345) {
									local1478 = local1476;
								}
							}
							if (local1478 != null) {
								if (local1468 != null) {
									local1478.method7963(local1450);
								}
								if (local1472 != null) {
									local1478.method7963(local1457);
								}
								if (local1476 != null) {
									local1478.method7963(local1464);
								}
								local1478.method7966(local1439, local1423, local1419);
							}
							local1439++;
						}
					}
				}
			}
			local180.b();
			this.anInterface13_7 = this.aClass22_Sub1_42.method967(local149, local180.a(), local175);
			this.aClass287_16 = new Class287(this.anInterface13_7, 5126, 3, 0);
			this.aClass287_15 = new Class287(this.anInterface13_7, 5121, 4, 12);
			@Pc(1639) byte local1639;
			if (this.anIntArrayArrayArray20 == null) {
				this.aClass287_14 = new Class287(this.anInterface13_7, 5126, 2, 16);
				local1639 = 24;
			} else {
				local1639 = 28;
				this.aClass287_14 = new Class287(this.anInterface13_7, 5126, 3, 16);
			}
			if ((this.anInt10956 & 0x7) != 0) {
				this.aClass287_13 = new Class287(this.anInterface13_7, 5126, 3, local1639);
			}
			@Pc(1678) long[] local1678 = new long[this.aClass3_Sub54Array1.length];
			for (local1439 = 0; local1439 < this.aClass3_Sub54Array1.length; local1439++) {
				@Pc(1689) Class3_Sub54 local1689 = this.aClass3_Sub54Array1[local1439];
				local1678[local1439] = local1689.aLong345;
				local1689.method7961(this.anInt10967);
			}
			Static191.method2978(this.aClass3_Sub54Array1, local1678);
			if (this.aClass2_2 != null) {
				this.aClass2_2.method25();
			}
		}
		this.aClass313_44 = null;
		this.anIntArrayArrayArray15 = null;
		this.anIntArrayArrayArray20 = null;
		this.anIntArrayArrayArray17 = null;
		this.aByteArrayArray25 = null;
		this.anIntArrayArrayArray18 = this.anIntArrayArrayArray16 = null;
		this.aClass3_Sub54ArrayArrayArray1 = null;
		this.aFloatArrayArray17 = this.aFloatArrayArray16 = this.aFloatArrayArray18 = null;
		this.anIntArrayArrayArray19 = null;
	}

	@OriginalMember(owner = "client!wba", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray25[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray25[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!wba", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class3_Sub7_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass2_2 != null && arg0 != null) {
			@Pc(26) int local26 = arg1 - (this.aClass22_Sub1_42.anInt1007 * arg2 >> 8) >> this.aClass22_Sub1_42.anInt994;
			@Pc(41) int local41 = arg3 - (this.aClass22_Sub1_42.anInt1021 * arg2 >> 8) >> this.aClass22_Sub1_42.anInt994;
			this.aClass2_2.method18(local41, arg0, local26);
		}
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(IIIIIIZ[[Z)V")
	private void method9303(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) boolean[][] arg6) {
		if (this.aClass3_Sub54Array1 == null) {
			return;
		}
		@Pc(20) int local20 = arg2 + arg2 + 1;
		@Pc(24) int local24 = local20 * local20;
		if (this.aClass22_Sub1_42.anIntArray54.length < local24) {
			this.aClass22_Sub1_42.anIntArray54 = new int[local24];
		}
		if (this.aClass22_Sub1_42.aClass3_Sub2_Sub2_1.aByteArray20.length < this.anInt10964 * 2) {
			this.aClass22_Sub1_42.aClass3_Sub2_Sub2_1 = new Class3_Sub2_Sub2(this.anInt10964 * 2);
		}
		@Pc(72) int local72 = arg1 - arg2;
		@Pc(74) int local74 = local72;
		if (local72 < 0) {
			local72 = 0;
		}
		@Pc(83) int local83 = arg4 - arg2;
		@Pc(85) int local85 = local83;
		if (local83 < 0) {
			local83 = 0;
		}
		@Pc(97) int local97 = arg1 + arg2;
		if (local97 > super.anInt10949 - 1) {
			local97 = super.anInt10949 - 1;
		}
		@Pc(116) int local116 = arg2 + arg4;
		if (super.anInt10946 - 1 < local116) {
			local116 = super.anInt10946 - 1;
		}
		@Pc(133) int local133 = 0;
		@Pc(137) int[] local137 = this.aClass22_Sub1_42.anIntArray54;
		@Pc(150) int local150;
		for (@Pc(139) int local139 = local72; local139 <= local97; local139++) {
			@Pc(148) boolean[] local148 = arg6[local139 - local74];
			for (local150 = local83; local150 <= local116; local150++) {
				if (local148[local150 - local85]) {
					local137[local133++] = super.anInt10949 * local150 + local139;
				}
			}
		}
		if (arg3 == -1) {
			this.aClass22_Sub1_42.method956();
		} else {
			this.aClass22_Sub1_42.method950((float) arg3);
			this.aClass22_Sub1_42.method941();
		}
		this.aClass22_Sub1_42.method949((this.anInt10956 & 0x7) != 0);
		for (@Pc(232) int local232 = 0; local232 < this.aClass3_Sub54Array1.length; local232++) {
			this.aClass3_Sub54Array1[local232].method7965(local133, local137);
		}
		if (!this.aClass342_93.method7652()) {
			local150 = this.aClass22_Sub1_42.anInt1036;
			@Pc(271) int local271 = this.aClass22_Sub1_42.anInt1020;
			this.aClass22_Sub1_42.L(0, local271, this.aClass22_Sub1_42.anInt1026);
			this.aClass22_Sub1_42.method949(false);
			this.aClass22_Sub1_42.method902(false);
			this.aClass22_Sub1_42.method964(128);
			this.aClass22_Sub1_42.method939(-2);
			this.aClass22_Sub1_42.method955(this.aClass22_Sub1_42.aClass125_Sub1_1);
			this.aClass22_Sub1_42.method900(7681, 8448);
			this.aClass22_Sub1_42.method935(770, 0, 34166);
			this.aClass22_Sub1_42.method963(0, 34167);
			for (@Pc(337) Class3 local337 = this.aClass342_93.method7644(); local337 != null; local337 = this.aClass342_93.method7650()) {
				@Pc(342) Class3_Sub36 local342 = (Class3_Sub36) local337;
				local342.method4993(arg6, arg2, arg1, arg4);
			}
			this.aClass22_Sub1_42.method935(768, 0, 5890);
			this.aClass22_Sub1_42.method963(0, 5890);
			this.aClass22_Sub1_42.method955((Class125) null);
			this.aClass22_Sub1_42.L(local150, local271, this.aClass22_Sub1_42.anInt1026);
		}
		if (this.aClass2_2 == null) {
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		this.aClass22_Sub1_42.method919(this.aClass287_16, (Class287) null, this.aClass287_14, (Class287) null);
		this.aClass2_2.method19(arg2, arg4, arg1, arg5, arg6);
		OpenGL.glPopMatrix();
		return;
	}

	@OriginalMember(owner = "client!wba", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class3_Sub7_Sub17 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub7_Sub17 arg2) {
		if ((this.aByteArrayArray24[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(25) int local25 = super.anInt10947 >> this.aClass22_Sub1_42.anInt994;
		@Pc(28) Class3_Sub7_Sub17_Sub2 local28 = (Class3_Sub7_Sub17_Sub2) arg2;
		@Pc(46) Class3_Sub7_Sub17_Sub2 local46;
		if (local28 != null && local28.method8475(local25, local25)) {
			local46 = local28;
			local28.method8473();
		} else {
			local46 = new Class3_Sub7_Sub17_Sub2(this.aClass22_Sub1_42, local25, local25);
		}
		local46.method8471(local25, 0, 0, local25);
		this.method9304(arg1, local46, arg0);
		return local46;
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(ILclient!uc;BI)V")
	private void method9304(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7_Sub17_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(19) int[] local19 = this.anIntArrayArrayArray18[arg2][arg0];
		@Pc(26) int[] local26 = this.anIntArrayArrayArray16[arg2][arg0];
		@Pc(29) int local29 = local19.length;
		if (local29 > this.aClass22_Sub1_42.anIntArray55.length) {
			this.aClass22_Sub1_42.anIntArray55 = new int[local29];
			this.aClass22_Sub1_42.anIntArray53 = new int[local29];
		}
		@Pc(51) int[] local51 = this.aClass22_Sub1_42.anIntArray55;
		@Pc(55) int[] local55 = this.aClass22_Sub1_42.anIntArray53;
		for (@Pc(57) int local57 = 0; local57 < local29; local57++) {
			local51[local57] = local19[local57] >> this.aClass22_Sub1_42.anInt994;
			local55[local57] = local26[local57] >> this.aClass22_Sub1_42.anInt994;
		}
		@Pc(91) int local91 = 0;
		while (local29 > local91) {
			@Pc(99) int local99 = local51[local91];
			@Pc(104) int local104 = local55[local91++];
			@Pc(108) int local108 = local51[local91];
			@Pc(113) int local113 = local55[local91++];
			@Pc(117) int local117 = local51[local91];
			@Pc(122) int local122 = local55[local91++];
			if (-((local113 - local104) * (-local108 + local117)) + (local99 - local108) * (local113 - local122) > 0) {
				arg1.method8472(local113, local104, local117, local99, local108, local122);
			}
		}
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(II)V")
	@Override
	public void method9298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method9297(@OriginalArg(0) Class3_Sub7_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass2_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(28) int local28 = arg1 - (this.aClass22_Sub1_42.anInt1007 * arg2 >> 8) >> this.aClass22_Sub1_42.anInt994;
			@Pc(43) int local43 = arg3 - (arg2 * this.aClass22_Sub1_42.anInt1021 >> 8) >> this.aClass22_Sub1_42.anInt994;
			return this.aClass2_2.method24(local43, local28, arg0);
		}
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method9293(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt10970 <= 0) {
			return;
		}
		this.aClass22_Sub1_42.method893();
		this.aClass22_Sub1_42.method940(false);
		this.aClass22_Sub1_42.method949(false);
		this.aClass22_Sub1_42.method912(false);
		this.aClass22_Sub1_42.method902(false);
		this.aClass22_Sub1_42.method964(0);
		this.aClass22_Sub1_42.method939(-2);
		this.aClass22_Sub1_42.method955((Class125) null);
		Static348.aFloatArray41[1] = 0.0F;
		Static348.aFloatArray41[9] = 0.0F;
		Static348.aFloatArray41[2] = 0.0F;
		Static348.aFloatArray41[5] = (float) 1024 / ((float) super.anInt10947 * 128.0F * (float) this.aClass22_Sub1_42.anInt833);
		Static348.aFloatArray41[4] = 0.0F;
		Static348.aFloatArray41[12] = -1.0F - ((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass22_Sub1_42.anInt973;
		Static348.aFloatArray41[8] = 0.0F;
		Static348.aFloatArray41[6] = 0.0F;
		Static348.aFloatArray41[14] = 0.0F;
		Static348.aFloatArray41[10] = 0.0F;
		Static348.aFloatArray41[7] = 0.0F;
		Static348.aFloatArray41[15] = 1.0F;
		Static348.aFloatArray41[0] = (float) 1024 / ((float) this.aClass22_Sub1_42.anInt973 * 128.0F * (float) super.anInt10947);
		Static348.aFloatArray41[11] = 0.0F;
		Static348.aFloatArray41[3] = 0.0F;
		Static348.aFloatArray41[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass22_Sub1_42.anInt833;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static348.aFloatArray41, 0);
		Static348.aFloatArray41[12] = 0.0F;
		Static348.aFloatArray41[1] = 0.0F;
		Static348.aFloatArray41[14] = 0.0F;
		Static348.aFloatArray41[9] = 1.0F;
		Static348.aFloatArray41[0] = 1.0F;
		Static348.aFloatArray41[7] = 0.0F;
		Static348.aFloatArray41[2] = 0.0F;
		Static348.aFloatArray41[5] = 0.0F;
		Static348.aFloatArray41[13] = 0.0F;
		Static348.aFloatArray41[3] = 0.0F;
		Static348.aFloatArray41[4] = 0.0F;
		Static348.aFloatArray41[11] = 0.0F;
		Static348.aFloatArray41[15] = 1.0F;
		Static348.aFloatArray41[10] = 0.0F;
		Static348.aFloatArray41[8] = 0.0F;
		Static348.aFloatArray41[6] = 1.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static348.aFloatArray41, 0);
		if ((this.anInt10956 & 0x7) == 0) {
			this.aClass22_Sub1_42.method949(false);
		} else {
			this.aClass22_Sub1_42.method949(true);
			this.aClass22_Sub1_42.method907();
		}
		this.aClass22_Sub1_42.method919(this.aClass287_16, this.aClass287_13, this.aClass287_14, this.aClass287_15);
		if (this.aClass22_Sub1_42.aClass3_Sub2_Sub2_1.aByteArray20.length < this.anInt10964 * 2) {
			this.aClass22_Sub1_42.aClass3_Sub2_Sub2_1 = new Class3_Sub2_Sub2(this.anInt10964 * 2);
		} else {
			this.aClass22_Sub1_42.aClass3_Sub2_Sub2_1.anInt2178 = 0;
		}
		@Pc(322) int local322 = 0;
		@Pc(326) Class3_Sub2_Sub2 local326 = this.aClass22_Sub1_42.aClass3_Sub2_Sub2_1;
		@Pc(332) int local332;
		@Pc(342) int local342;
		@Pc(344) int local344;
		@Pc(364) short[] local364;
		@Pc(368) int local368;
		if (this.aClass22_Sub1_42.aBoolean60) {
			for (local332 = arg1; local332 < arg3; local332++) {
				local342 = super.anInt10949 * local332 + arg0;
				for (local344 = arg0; local344 < arg2; local344++) {
					if (arg4[local344 - arg0][local332 - arg1]) {
						local364 = this.aShortArrayArray6[local342];
						if (local364 != null) {
							for (local368 = 0; local368 < local364.length; local368++) {
								local326.method2032(local364[local368] & 0xFFFF);
								local322++;
							}
						}
					}
					local342++;
				}
			}
		} else {
			for (local332 = arg1; local332 < arg3; local332++) {
				local342 = arg0 + local332 * super.anInt10949;
				for (local344 = arg0; local344 < arg2; local344++) {
					if (arg4[local344 - arg0][local332 - arg1]) {
						local364 = this.aShortArrayArray6[local342];
						if (local364 != null) {
							for (local368 = 0; local368 < local364.length; local368++) {
								local322++;
								local326.method2070(local364[local368] & 0xFFFF);
							}
						}
					}
					local342++;
				}
			}
		}
		if (local322 > 0) {
			@Pc(501) Class188_Sub2 local501 = new Class188_Sub2(this.aClass22_Sub1_42, 5123, local326.aByteArray20, local326.anInt2178);
			this.aClass22_Sub1_42.method957(0, local501, local322);
		}
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method9301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method9303(arg5, arg0, arg2, -1, arg1, arg4, arg3);
	}

	@OriginalMember(owner = "client!wba", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray20 == null) {
			this.anIntArrayArrayArray20 = new int[super.anInt10949][super.anInt10946][];
		}
		if (arg3 != null && this.anIntArrayArrayArray17 == null) {
			this.anIntArrayArrayArray17 = new int[super.anInt10949][super.anInt10946][];
		}
		@Pc(41) Interface4 local41 = this.aClass22_Sub1_42.anInterface4_14;
		this.anIntArrayArrayArray18[arg0][arg1] = arg2;
		this.anIntArrayArrayArray16[arg0][arg1] = arg4;
		this.anIntArrayArrayArray19[arg0][arg1] = arg6;
		this.anIntArrayArrayArray15[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray20 != null) {
			this.anIntArrayArrayArray20[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray17 != null) {
			this.anIntArrayArrayArray17[arg0][arg1] = arg3;
		}
		@Pc(104) Class3_Sub54[] local104 = this.aClass3_Sub54ArrayArrayArray1[arg0][arg1] = new Class3_Sub54[arg6.length];
		for (@Pc(106) int local106 = 0; local106 < arg6.length; local106++) {
			@Pc(114) int local114 = arg8[local106];
			@Pc(118) int local118 = arg9[local106];
			if ((this.anInt10956 & 0x20) != 0 && local114 != -1 && local41.method5761(local114).aBoolean761) {
				local118 = 128;
				local114 = -1;
			}
			@Pc(167) long local167 = (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48 | (long) (local118 << 14) | (long) local114;
			@Pc(173) Class3 local173;
			for (local173 = this.aClass313_44.method7104(local167); local173 != null; local173 = this.aClass313_44.method7106()) {
				@Pc(180) Class3_Sub54 local180 = (Class3_Sub54) local173;
				if (local180.anInt9399 == local114 && local180.aFloat142 == (float) local118 && arg10 == local180.anInt9400 && arg11 == local180.anInt9392 && local180.anInt9393 == arg12) {
					break;
				}
			}
			if (local173 == null) {
				local104[local106] = new Class3_Sub54(this, local114, local118, arg10, arg11, arg12);
				this.aClass313_44.method7107(local167, local104[local106]);
			} else {
				local104[local106] = (Class3_Sub54) local173;
			}
		}
		if (arg13) {
			this.aByteArrayArray24[arg0][arg1] = (byte) (this.aByteArrayArray24[arg0][arg1] | 0x1);
		}
		if (this.anInt10969 < arg6.length) {
			this.anInt10969 = arg6.length;
		}
		this.anInt10970 += arg6.length;
	}
}
