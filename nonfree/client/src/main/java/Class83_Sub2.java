import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jda")
public final class Class83_Sub2 extends Class83 {

	@OriginalMember(owner = "client!jda", name = "F", descriptor = "I")
	private int anInt4290;

	@OriginalMember(owner = "client!jda", name = "J", descriptor = "I")
	private int anInt4292;

	@OriginalMember(owner = "client!jda", name = "O", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!jda", name = "gb", descriptor = "Lclient!el;")
	private Interface9 anInterface9_8;

	@OriginalMember(owner = "client!jda", name = "ib", descriptor = "[Lclient!vl;")
	private Class4_Sub49[] aClass4_Sub49Array1;

	@OriginalMember(owner = "client!jda", name = "kb", descriptor = "I")
	private int anInt4304;

	@OriginalMember(owner = "client!jda", name = "nb", descriptor = "Lclient!el;")
	private Interface9 anInterface9_9;

	@OriginalMember(owner = "client!jda", name = "ob", descriptor = "I")
	private int anInt4305;

	@OriginalMember(owner = "client!jda", name = "pb", descriptor = "Lclient!fj;")
	public Class3 aClass3_14;

	@OriginalMember(owner = "client!jda", name = "S", descriptor = "F")
	private float aFloat134 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!jda", name = "cb", descriptor = "F")
	private float aFloat135 = -3.4028235E38F;

	@OriginalMember(owner = "client!jda", name = "V", descriptor = "Lclient!oe;")
	private final Class244 aClass244_36 = new Class244();

	@OriginalMember(owner = "client!jda", name = "t", descriptor = "Lclient!ifa;")
	public final Class44_Sub2 aClass44_Sub2_8;

	@OriginalMember(owner = "client!jda", name = "D", descriptor = "I")
	private final int anInt4288;

	@OriginalMember(owner = "client!jda", name = "X", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!jda", name = "lb", descriptor = "[[F")
	private float[][] lb;

	@OriginalMember(owner = "client!jda", name = "U", descriptor = "I")
	public final int anInt4297;

	@OriginalMember(owner = "client!jda", name = "z", descriptor = "[[B")
	private final byte[][] aByteArrayArray15;

	@OriginalMember(owner = "client!jda", name = "E", descriptor = "I")
	private final int anInt4289;

	@OriginalMember(owner = "client!jda", name = "q", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!jda", name = "jb", descriptor = "[[B")
	private byte[][] aByteArrayArray16;

	@OriginalMember(owner = "client!jda", name = "fb", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!jda", name = "hb", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!jda", name = "L", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!jda", name = "mb", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!jda", name = "P", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!jda", name = "G", descriptor = "[[[Lclient!vl;")
	private Class4_Sub49[][][] aClass4_Sub49ArrayArrayArray1;

	@OriginalMember(owner = "client!jda", name = "T", descriptor = "[[S")
	public final short[][] aShortArrayArray2;

	@OriginalMember(owner = "client!jda", name = "qb", descriptor = "Lclient!waa;")
	private Class350 aClass350_18;

	@OriginalMember(owner = "client!jda", name = "Y", descriptor = "Lclient!qs;")
	private Class278 aClass278_1;

	@OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(Lclient!ifa;IIII[[I[[II)V")
	public Class83_Sub2(@OriginalArg(0) Class44_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass44_Sub2_8 = arg0;
		this.anInt4288 = super.anInt8825 - 2;
		this.anIntArrayArrayArray9 = new int[arg3][arg4][];
		this.lb = new float[super.anInt8829 + 1][super.anInt8830 + 1];
		this.anInt4297 = arg2;
		this.aByteArrayArray15 = new byte[arg3][arg4];
		this.anInt4289 = 0x1 << this.anInt4288;
		this.anIntArrayArrayArray5 = new int[arg3][arg4][];
		this.aByteArrayArray16 = new byte[arg3 + 1][arg4 + 1];
		this.anIntArrayArrayArray10 = new int[arg3][arg4][];
		this.aFloatArrayArray4 = new float[super.anInt8829 + 1][super.anInt8830 + 1];
		this.anIntArrayArrayArray6 = new int[arg3][arg4][];
		this.aFloatArrayArray5 = new float[super.anInt8829 + 1][super.anInt8830 + 1];
		this.anIntArrayArrayArray8 = new int[arg3][arg4][];
		this.aClass4_Sub49ArrayArrayArray1 = new Class4_Sub49[arg3][arg4][];
		this.aShortArrayArray2 = new short[arg3 * arg4][];
		for (@Pc(121) int local121 = 0; super.anInt8830 >= local121; local121++) {
			for (@Pc(125) int local125 = 0; super.anInt8829 >= local125; local125++) {
				@Pc(134) int local134 = super.anIntArrayArray54[local125][local121];
				if (this.aFloat134 > (float) local134) {
					this.aFloat134 = local134;
				}
				if (this.aFloat135 < (float) local134) {
					this.aFloat135 = local134;
				}
				if (local125 > 0 && local121 > 0 && super.anInt8829 > local125 && super.anInt8830 > local121) {
					@Pc(190) int local190 = arg6[local125 + 1][local121] - arg6[local125 - 1][local121];
					@Pc(207) int local207 = arg6[local125][local121 + 1] - arg6[local125][local121 - 1];
					@Pc(226) float local226 = (float) (1.0D / Math.sqrt((double) (local207 * local207 + arg7 * 4 * arg7 + local190 * local190)));
					this.aFloatArrayArray5[local125][local121] = (float) local190 * local226;
					this.aFloatArrayArray4[local125][local121] = (float) (-arg7 * 2) * local226;
					this.lb[local125][local121] = local226 * (float) local207;
				}
			}
		}
		this.aFloat135++;
		this.aFloat134--;
		this.aClass350_18 = new Class350(128);
		if ((this.anInt4297 & 0x10) != 0) {
			this.aClass278_1 = new Class278(this.aClass44_Sub2_8, this);
		}
	}

	@OriginalMember(owner = "client!jda", name = "DA", descriptor = "(Lclient!ha;IIIIZ)V")
	@Override
	public void DA(@OriginalArg(0) Class4_Sub5_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass278_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass44_Sub2_8.anInt4945 * arg2 >> 8) >> this.aClass44_Sub2_8.anInt4939;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass44_Sub2_8.anInt4941 >> 8) >> this.aClass44_Sub2_8.anInt4939;
			this.aClass278_1.method6789(arg0, local24, local39);
		}
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lclient!ul;[I)V")
	@Override
	public void method7211(@OriginalArg(0) Class4_Sub24 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass244_36.method5960(new Class4_Sub35(this.aClass44_Sub2_8, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!jda", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray7 == null) {
			this.anIntArrayArrayArray7 = new int[super.anInt8829][super.anInt8830][];
		}
		if (arg3 != null && this.anIntArrayArrayArray10 == null) {
			this.anIntArrayArrayArray10 = new int[super.anInt8829][super.anInt8830][];
		}
		this.anIntArrayArrayArray6[arg0][arg1] = arg2;
		this.anIntArrayArrayArray8[arg0][arg1] = arg4;
		this.anIntArrayArrayArray9[arg0][arg1] = arg6;
		this.anIntArrayArrayArray5[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray7 != null) {
			this.anIntArrayArrayArray7[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray10 != null) {
			this.anIntArrayArrayArray10[arg0][arg1] = arg3;
		}
		@Pc(88) Class4_Sub49[] local88 = this.aClass4_Sub49ArrayArrayArray1[arg0][arg1] = new Class4_Sub49[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) arg8[local90] | (long) (arg9[local90] << 14) | (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48;
			@Pc(125) Class4 local125;
			for (local125 = this.aClass350_18.method8207(local119); local125 != null; local125 = this.aClass350_18.method8200()) {
				@Pc(130) Class4_Sub49 local130 = (Class4_Sub49) local125;
				if (local130.anInt9897 == arg8[local90] && local130.aFloat226 == (float) arg9[local90] && arg10 == local130.anInt9903 && arg11 == local130.anInt9893 && arg12 == local130.anInt9891) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class4_Sub49(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass350_18.method8199(local119, local88[local90]);
			} else {
				local88[local90] = (Class4_Sub49) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray15[arg0][arg1] = (byte) (this.aByteArrayArray15[arg0][arg1] | 0x1);
		}
		if (this.anInt4305 < arg6.length) {
			this.anInt4305 = arg6.length;
		}
		this.anInt4304 += arg6.length;
	}

	@OriginalMember(owner = "client!jda", name = "BA", descriptor = "()V")
	@Override
	public void BA() {
		if (this.anInt4304 > 0) {
			@Pc(17) byte[][] local17 = new byte[super.anInt8829 + 1][super.anInt8830 + 1];
			for (@Pc(19) int local19 = 1; super.anInt8829 > local19; local19++) {
				for (@Pc(23) int local23 = 1; super.anInt8830 > local23; local23++) {
					local17[local19][local23] = (byte) ((this.aByteArrayArray16[local19 + 1][local23] >> 3) + (this.aByteArrayArray16[local19 - 1][local23] >> 2) + (this.aByteArrayArray16[local19][local23 + -1] >> 2) + (this.aByteArrayArray16[local19][local23 + 1] >> 3) + (this.aByteArrayArray16[local19][local23] >> 1));
				}
			}
			@Pc(107) Class4_Sub49[] local107 = new Class4_Sub49[this.aClass350_18.method8202()];
			this.aClass350_18.method8204(local107);
			for (@Pc(115) int local115 = 0; local115 < local107.length; local115++) {
				local107[local115].method8073(this.anInt4304);
			}
			@Pc(135) int local135 = 20;
			if (this.anIntArrayArrayArray7 != null) {
				local135 += 4;
			}
			if ((this.anInt4297 & 0x7) != 0) {
				local135 += 12;
			}
			@Pc(158) NativeHeapBuffer local158 = this.aClass44_Sub2_8.aNativeHeap5.a(this.anInt4304 * 4, false);
			@Pc(168) NativeHeapBuffer local168 = this.aClass44_Sub2_8.aNativeHeap5.a(this.anInt4304 * local135, false);
			@Pc(173) Stream local173 = new Stream(local168);
			@Pc(178) Stream local178 = new Stream(local158);
			@Pc(182) Class4_Sub49[] local182 = new Class4_Sub49[this.anInt4304];
			@Pc(189) int local189 = Static563.method8072(this.anInt4304 / 4);
			if (local189 < 1) {
				local189 = 1;
			}
			@Pc(201) Class350 local201 = new Class350(local189);
			@Pc(205) Class4_Sub49[] local205 = new Class4_Sub49[this.anInt4305];
			@Pc(211) int local211;
			for (@Pc(207) int local207 = 0; super.anInt8829 > local207; local207++) {
				for (local211 = 0; local211 < super.anInt8830; local211++) {
					if (this.anIntArrayArrayArray9[local207][local211] != null) {
						@Pc(227) Class4_Sub49[] local227 = this.aClass4_Sub49ArrayArrayArray1[local207][local211];
						@Pc(234) int[] local234 = this.anIntArrayArrayArray6[local207][local211];
						@Pc(241) int[] local241 = this.anIntArrayArrayArray8[local207][local211];
						@Pc(248) int[] local248 = this.anIntArrayArrayArray5[local207][local211];
						@Pc(255) int[] local255 = this.anIntArrayArrayArray9[local207][local211];
						@Pc(267) int[] local267 = this.anIntArrayArrayArray10 == null ? null : this.anIntArrayArrayArray10[local207][local211];
						if (local248 == null) {
							local248 = local255;
						}
						@Pc(283) int[] local283 = this.anIntArrayArrayArray7 == null ? null : this.anIntArrayArrayArray7[local207][local211];
						@Pc(290) float local290 = this.aFloatArrayArray5[local207][local211];
						@Pc(297) float local297 = this.aFloatArrayArray4[local207][local211];
						@Pc(304) float local304 = this.lb[local207][local211];
						@Pc(313) float local313 = this.aFloatArrayArray5[local207][local211 + 1];
						@Pc(322) float local322 = this.aFloatArrayArray4[local207][local211 + 1];
						@Pc(331) float local331 = this.lb[local207][local211 + 1];
						@Pc(342) float local342 = this.aFloatArrayArray5[local207 + 1][local211 + 1];
						@Pc(353) float local353 = this.aFloatArrayArray4[local207 + 1][local211 + 1];
						@Pc(364) float local364 = this.lb[local207 + 1][local211 + 1];
						@Pc(373) float local373 = this.aFloatArrayArray5[local207 + 1][local211];
						@Pc(382) float local382 = this.aFloatArrayArray4[local207 + 1][local211];
						@Pc(391) float local391 = this.lb[local207 + 1][local211];
						@Pc(399) int local399 = local17[local207][local211] & 0xFF;
						@Pc(409) int local409 = local17[local207][local211 + 1] & 0xFF;
						@Pc(421) int local421 = local17[local207 + 1][local211 + 1] & 0xFF;
						@Pc(431) int local431 = local17[local207 + 1][local211] & 0xFF;
						@Pc(433) int local433 = 0;
						@Pc(443) int local443;
						label355: for (@Pc(435) int local435 = 0; local435 < local255.length; local435++) {
							@Pc(441) Class4_Sub49 local441 = local227[local435];
							for (local443 = 0; local443 < local433; local443++) {
								if (local205[local443] == local441) {
									continue label355;
								}
							}
							local205[local433++] = local441;
						}
						@Pc(484) short[] local484 = this.aShortArrayArray2[local211 * super.anInt8829 + local207] = new short[local255.length];
						for (local443 = 0; local443 < local255.length; local443++) {
							@Pc(497) int local497 = (local207 << super.anInt8825) + local234[local443];
							@Pc(506) int local506 = (local211 << super.anInt8825) + local241[local443];
							@Pc(511) int local511 = local497 >> this.anInt4288;
							@Pc(516) int local516 = local506 >> this.anInt4288;
							@Pc(520) int local520 = local255[local443];
							@Pc(524) int local524 = local248[local443];
							@Pc(532) int local532 = local267 == null ? 0 : local267[local443];
							@Pc(550) long local550 = (long) local516 | (long) local524 << 48 | (long) local520 << 32 | (long) (local511 << 16);
							@Pc(554) int local554 = local234[local443];
							@Pc(558) int local558 = local241[local443];
							@Pc(560) byte local560 = 74;
							@Pc(562) int local562 = 0;
							@Pc(568) float local568;
							@Pc(576) float local576;
							@Pc(574) float local574;
							@Pc(665) float local665;
							@Pc(572) int local572;
							if (local554 == 0 && local558 == 0) {
								local568 = local290;
								local572 = local560 - local399;
								local574 = local304;
								local576 = local297;
							} else if (local554 == 0 && local558 == super.anInt8824) {
								local572 = local560 - local409;
								local568 = local313;
								local574 = local331;
								local576 = local322;
							} else if (local554 == super.anInt8824 && super.anInt8824 == local558) {
								local574 = local364;
								local572 = local560 - local421;
								local568 = local342;
								local576 = local353;
							} else if (super.anInt8824 == local554 && local558 == 0) {
								local572 = local560 - local431;
								local576 = local382;
								local568 = local373;
								local574 = local391;
							} else {
								@Pc(640) float local640 = (float) local554 / (float) super.anInt8824;
								@Pc(647) float local647 = (float) local558 / (float) super.anInt8824;
								@Pc(656) float local656 = local640 * (local373 - local290) + local290;
								local665 = local297 + (local382 - local297) * local640;
								@Pc(673) float local673 = local304 + (local391 - local304) * local640;
								@Pc(682) float local682 = local313 + (local342 - local313) * local640;
								@Pc(691) float local691 = (local353 - local322) * local640 + local322;
								@Pc(699) float local699 = (local364 - local331) * local640 + local331;
								local568 = local656 + local647 * (local682 - local656);
								local576 = local665 + local647 * (local691 - local665);
								local574 = (local699 - local673) * local647 + local673;
								@Pc(737) int local737 = local399 + ((local431 - local399) * local554 >> super.anInt8825);
								@Pc(749) int local749 = (local554 * (local421 - local409) >> super.anInt8825) + local409;
								local572 = local560 - local737 - (local558 * (local749 - local737) >> super.anInt8825);
							}
							@Pc(778) float local778 = 1.0F;
							if (local520 != -1) {
								@Pc(790) int local790 = (local520 & 0x7F) * local572 >> 7;
								if (local790 < 2) {
									local790 = 2;
								} else if (local790 > 126) {
									local790 = 126;
								}
								local562 = Static15.anIntArray11[local520 & 0xFF80 | local790];
								if ((this.anInt4297 & 0x7) == 0) {
									local778 = this.aClass44_Sub2_8.aFloatArray35[2] * local574 + this.aClass44_Sub2_8.aFloatArray35[1] * local576 + this.aClass44_Sub2_8.aFloatArray35[0] * local568;
									local778 = local778 * (local778 > 0.0F ? this.aClass44_Sub2_8.aFloat155 : this.aClass44_Sub2_8.aFloat146) + this.aClass44_Sub2_8.aFloat153;
								}
							}
							@Pc(864) Class4 local864 = null;
							if ((local497 & this.anInt4289 - 1) == 0 && (local506 & this.anInt4289 - 1) == 0) {
								local864 = local201.method8207(local550);
							}
							@Pc(900) int local900;
							@Pc(960) int local960;
							if (local864 == null) {
								if (local520 == local524) {
									local960 = local562;
								} else {
									@Pc(936) int local936 = (local524 & 0x7F) * local572 >> 7;
									if (local936 < 2) {
										local936 = 2;
									} else if (local936 > 126) {
										local936 = 126;
									}
									local960 = Static15.anIntArray11[local524 & 0xFF80 | local936];
									if ((this.anInt4297 & 0x7) == 0) {
										local665 = local576 * this.aClass44_Sub2_8.aFloatArray35[1] + local568 * this.aClass44_Sub2_8.aFloatArray35[0] + local574 * this.aClass44_Sub2_8.aFloatArray35[2];
										local665 = (local778 > 0.0F ? this.aClass44_Sub2_8.aFloat155 : this.aClass44_Sub2_8.aFloat146) * local778 + this.aClass44_Sub2_8.aFloat153;
										@Pc(1013) int local1013 = local960 >> 16 & 0xFF;
										@Pc(1019) int local1019 = local960 >> 8 & 0xFF;
										local1013 = (int) ((float) local1013 * local665);
										@Pc(1029) int local1029 = local960 & 0xFF;
										local1019 = (int) ((float) local1019 * local665);
										if (local1013 < 0) {
											local1013 = 0;
										} else if (local1013 > 255) {
											local1013 = 255;
										}
										local1029 = (int) ((float) local1029 * local665);
										if (local1019 < 0) {
											local1019 = 0;
										} else if (local1019 > 255) {
											local1019 = 255;
										}
										if (local1029 < 0) {
											local1029 = 0;
										} else if (local1029 > 255) {
											local1029 = 255;
										}
										local960 = local1013 << 16 | local1019 << 8 | local1029;
									}
								}
								if (Stream.b()) {
									local173.b((float) local497);
									local173.b((float) (this.method7213(local497, local506) + local532));
									local173.b((float) local506);
									local173.b((float) local497);
									local173.b((float) local506);
									if (this.anIntArrayArrayArray7 != null) {
										local173.b((float) (local283 == null ? 0 : local283[local443] - 1));
									}
									if ((this.anInt4297 & 0x7) != 0) {
										local173.b(local568);
										local173.b(local576);
										local173.b(local574);
									}
								} else {
									local173.a((float) local497);
									local173.a((float) (local532 + this.method7213(local497, local506)));
									local173.a((float) local506);
									local173.a((float) local497);
									local173.a((float) local506);
									if (this.anIntArrayArrayArray7 != null) {
										local173.a((float) (local283 == null ? 0 : local283[local443] - 1));
									}
									if ((this.anInt4297 & 0x7) != 0) {
										local173.a(local568);
										local173.a(local576);
										local173.a(local574);
									}
								}
								if (this.aClass44_Sub2_8.anInt4940 == 0) {
									local178.a(local960 | 0xFF000000);
								} else {
									local178.b(local960 | 0xFF000000);
								}
								local900 = this.anInt4292++;
								local484[local443] = (short) local900;
								if (local520 != -1) {
									local182[local900] = local227[local443];
								}
								local201.method8199(local550, new Class4_Sub30(local484[local443]));
							} else {
								local484[local443] = ((Class4_Sub30) local864).aShort82;
								local900 = local484[local443] & 0xFFFF;
								if (local520 != -1 && local182[local900].aLong268 > local227[local443].aLong268) {
									local182[local900] = local227[local443];
								}
							}
							for (local960 = 0; local960 < local433; local960++) {
								local205[local960].method8075(local778, local900, local562, local572);
							}
							this.anInt4290++;
						}
					}
				}
			}
			for (local211 = 0; local211 < this.anInt4292; local211++) {
				@Pc(1317) Class4_Sub49 local1317 = local182[local211];
				if (local1317 != null) {
					local1317.method8071(local211);
				}
			}
			@Pc(1334) int local1334;
			@Pc(1352) int local1352;
			for (@Pc(1330) int local1330 = 0; local1330 < super.anInt8829; local1330++) {
				for (local1334 = 0; local1334 < super.anInt8830; local1334++) {
					@Pc(1346) short[] local1346 = this.aShortArrayArray2[local1330 + super.anInt8829 * local1334];
					if (local1346 != null) {
						@Pc(1350) int local1350 = 0;
						local1352 = 0;
						while (local1352 < local1346.length) {
							@Pc(1361) int local1361 = local1346[local1352++] & 0xFFFF;
							@Pc(1368) int local1368 = local1346[local1352++] & 0xFFFF;
							@Pc(1375) int local1375 = local1346[local1352++] & 0xFFFF;
							@Pc(1379) Class4_Sub49 local1379 = local182[local1361];
							@Pc(1383) Class4_Sub49 local1383 = local182[local1368];
							@Pc(1387) Class4_Sub49 local1387 = local182[local1375];
							@Pc(1389) Class4_Sub49 local1389 = null;
							if (local1379 != null) {
								local1389 = local1379;
								local1379.method8079(local1334, local1330, local1350);
							}
							if (local1383 != null) {
								local1383.method8079(local1334, local1330, local1350);
								if (local1389 == null || local1389.aLong268 > local1383.aLong268) {
									local1389 = local1383;
								}
							}
							if (local1387 != null) {
								local1387.method8079(local1334, local1330, local1350);
								if (local1389 == null || local1387.aLong268 < local1389.aLong268) {
									local1389 = local1387;
								}
							}
							if (local1389 != null) {
								if (local1379 != null) {
									local1389.method8071(local1361);
								}
								if (local1383 != null) {
									local1389.method8071(local1368);
								}
								if (local1387 != null) {
									local1389.method8071(local1375);
								}
								local1389.method8079(local1334, local1330, local1350);
							}
							local1350++;
						}
					}
				}
			}
			local173.a();
			local178.a();
			this.anInterface9_9 = this.aClass44_Sub2_8.method4286(false);
			this.anInterface9_9.method5103(this.anInt4292 * 4, 4, local158);
			this.anInterface9_8 = this.aClass44_Sub2_8.method4286(false);
			this.anInterface9_8.method5103(local135 * this.anInt4292, local135, local168);
			if ((this.anInt4297 & 0x7) == 0) {
				if (this.anIntArrayArrayArray7 == null) {
					this.aClass3_14 = this.aClass44_Sub2_8.method4314(new Class220[] { new Class220(new Class326[] { Static525.aClass326_1, Static525.aClass326_5 }), new Class220(Static525.aClass326_3) });
				} else {
					this.aClass3_14 = this.aClass44_Sub2_8.method4314(new Class220[] { new Class220(new Class326[] { Static525.aClass326_1, Static525.aClass326_5, Static525.aClass326_4 }), new Class220(Static525.aClass326_3) });
				}
			} else if (this.anIntArrayArrayArray7 == null) {
				this.aClass3_14 = this.aClass44_Sub2_8.method4314(new Class220[] { new Class220(new Class326[] { Static525.aClass326_1, Static525.aClass326_5, Static525.aClass326_2 }), new Class220(Static525.aClass326_3) });
			} else {
				this.aClass3_14 = this.aClass44_Sub2_8.method4314(new Class220[] { new Class220(new Class326[] { Static525.aClass326_1, Static525.aClass326_5, Static525.aClass326_4, Static525.aClass326_2 }), new Class220(Static525.aClass326_3) });
			}
			local1334 = 0;
			for (@Pc(1680) int local1680 = 0; local1680 < local107.length; local1680++) {
				if (local107[local1680].anInt9899 > 0) {
					local107[local1334++] = local107[local1680];
				}
			}
			this.aClass4_Sub49Array1 = new Class4_Sub49[local1334];
			@Pc(1706) long[] local1706 = new long[local1334];
			for (local1352 = 0; local1352 < local1334; local1352++) {
				@Pc(1714) Class4_Sub49 local1714 = local107[local1352];
				local1706[local1352] = local1714.aLong268;
				this.aClass4_Sub49Array1[local1352] = local1714;
				local1714.method8076(this.anInt4292);
			}
			Static553.method8012(this.aClass4_Sub49Array1, local1706);
			if (this.aClass278_1 != null) {
				this.aClass278_1.method6786();
			}
		} else {
			this.aClass278_1 = null;
		}
		this.anIntArrayArrayArray7 = null;
		this.aByteArrayArray16 = null;
		this.anIntArrayArrayArray6 = this.anIntArrayArrayArray8 = null;
		this.aFloatArrayArray5 = this.aFloatArrayArray4 = this.lb = null;
		this.anIntArrayArrayArray9 = null;
		this.anIntArrayArrayArray5 = null;
		this.anIntArrayArrayArray10 = null;
		this.aClass350_18 = null;
		this.aClass4_Sub49ArrayArrayArray1 = null;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(BZII[[ZII)V")
	private void method3813(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (this.aClass4_Sub49Array1 == null) {
			return;
		}
		@Pc(21) int local21 = arg4 + arg4 + 1;
		@Pc(25) int local25 = local21 * local21;
		if (Static479.anIntArray479.length < local25) {
			Static479.anIntArray479 = new int[local25];
		}
		@Pc(41) int local41 = arg2 - arg4;
		@Pc(43) int local43 = local41;
		if (local41 < 0) {
			local41 = 0;
		}
		@Pc(52) int local52 = arg1 - arg4;
		@Pc(54) int local54 = local52;
		if (local52 < 0) {
			local52 = 0;
		}
		@Pc(65) int local65 = arg4 + arg2;
		if (local65 > super.anInt8829 - 1) {
			local65 = super.anInt8829 - 1;
		}
		@Pc(85) int local85 = arg1 + arg4;
		if (super.anInt8830 - 1 < local85) {
			local85 = super.anInt8830 - 1;
		}
		Static306.anInt6140 = 0;
		for (@Pc(100) int local100 = local41; local100 <= local65; local100++) {
			@Pc(109) boolean[] local109 = arg3[local100 - local43];
			for (@Pc(111) int local111 = local52; local111 <= local85; local111++) {
				if (local109[local111 - local54]) {
					Static479.anIntArray479[Static306.anInt6140++] = local111 * super.anInt8829 + local100;
				}
			}
		}
		if (arg5 == -1) {
			this.aClass44_Sub2_8.method4278();
		} else {
			this.aClass44_Sub2_8.method4372((float) arg5);
			this.aClass44_Sub2_8.method4251();
		}
		this.aClass44_Sub2_8.method4273();
		this.aClass44_Sub2_8.method4244((this.anInt4297 & 0x7) != 0);
		this.aClass44_Sub2_8.method4272(-1, false, false);
		this.aClass44_Sub2_8.method4358(0, this.anInterface9_8);
		for (@Pc(199) int local199 = 0; local199 < this.aClass4_Sub49Array1.length; local199++) {
			this.aClass4_Sub49Array1[local199].method8078(Static306.anInt6140, Static479.anIntArray479);
		}
		@Pc(224) Class8_Sub3 local224 = this.aClass44_Sub2_8.method4281();
		local224.NA(0, -1, 0);
		this.aClass44_Sub2_8.method4275();
		if (!this.aClass244_36.method5961()) {
			@Pc(242) int local242 = this.aClass44_Sub2_8.anInt4950;
			@Pc(246) int local246 = this.aClass44_Sub2_8.anInt4943;
			this.aClass44_Sub2_8.pa(0, local246, this.aClass44_Sub2_8.anInt4953);
			this.aClass44_Sub2_8.method4244(false);
			this.aClass44_Sub2_8.method4248(false);
			this.aClass44_Sub2_8.method4321(128);
			this.aClass44_Sub2_8.method4272(-2, false, false);
			this.aClass44_Sub2_8.method4265(this.aClass44_Sub2_8.anInterface16_3);
			this.aClass44_Sub2_8.method4243(Static379.aClass117_7, Static573.aClass117_9);
			this.aClass44_Sub2_8.method4241(0, Static447.aClass328_3);
			this.aClass44_Sub2_8.method4312(0, Static233.aClass328_1);
			for (@Pc(306) Class4 local306 = this.aClass244_36.method5963(); local306 != null; local306 = this.aClass244_36.method5965()) {
				@Pc(311) Class4_Sub35 local311 = (Class4_Sub35) local306;
				local311.method6485(arg2, arg1, arg4, arg3);
			}
			this.aClass44_Sub2_8.method4241(0, Static519.aClass328_4);
			this.aClass44_Sub2_8.method4312(0, Static519.aClass328_4);
			this.aClass44_Sub2_8.method4265(null);
			this.aClass44_Sub2_8.pa(local242, local246, this.aClass44_Sub2_8.anInt4953);
		}
		if (this.aClass278_1 == null) {
			return;
		}
		this.aClass44_Sub2_8.method4358(0, this.anInterface9_8);
		this.aClass44_Sub2_8.method4358(1, this.anInterface9_9);
		this.aClass44_Sub2_8.method4374(this.aClass3_14);
		this.aClass278_1.method6788(arg2, arg1, arg3, arg4, arg0);
		return;
	}

	@OriginalMember(owner = "client!jda", name = "v", descriptor = "(IILclient!ha;)Lclient!ha;")
	@Override
	public Class4_Sub5_Sub6 v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub5_Sub6 arg2) {
		if ((this.aByteArrayArray15[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(21) int local21 = super.anInt8824 >> this.aClass44_Sub2_8.anInt4939;
		@Pc(24) Class4_Sub5_Sub6_Sub1 local24 = (Class4_Sub5_Sub6_Sub1) arg2;
		@Pc(34) Class4_Sub5_Sub6_Sub1 local34;
		if (local24 != null && local24.method7039(local21, local21)) {
			local34 = local24;
			local24.method7042();
		} else {
			local34 = new Class4_Sub5_Sub6_Sub1(this.aClass44_Sub2_8, local21, local21);
		}
		local34.method7043(local21, 0, 0, local21);
		this.method3815(arg0, arg1, local34);
		return local34;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(II)V")
	@Override
	public void method7209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lclient!ha;IIIIZ)Z")
	@Override
	public boolean method7212(@OriginalArg(0) Class4_Sub5_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass278_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (this.aClass44_Sub2_8.anInt4945 * arg2 >> 8) >> this.aClass44_Sub2_8.anInt4939;
			@Pc(40) int local40 = arg3 - (this.aClass44_Sub2_8.anInt4941 * arg2 >> 8) >> this.aClass44_Sub2_8.anInt4939;
			return this.aClass278_1.method6793(local40, arg0, local25);
		}
	}

	@OriginalMember(owner = "client!jda", name = "E", descriptor = "(Lclient!ha;IIIIZ)V")
	@Override
	public void E(@OriginalArg(0) Class4_Sub5_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass278_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass44_Sub2_8.anInt4945 >> 8) >> this.aClass44_Sub2_8.anInt4939;
			@Pc(39) int local39 = arg3 - (this.aClass44_Sub2_8.anInt4941 * arg2 >> 8) >> this.aClass44_Sub2_8.anInt4939;
			this.aClass278_1.method6791(local39, arg0, local24);
		}
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method7216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method3813(arg4, arg1, arg0, arg3, arg2, -1);
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method7210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(III)V")
	@Override
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray16[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray16[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(IIILclient!rr;)V")
	private void method3815(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class4_Sub5_Sub6_Sub1 arg2) {
		@Pc(21) int[] local21 = this.anIntArrayArrayArray6[arg0][arg1];
		@Pc(28) int[] local28 = this.anIntArrayArrayArray8[arg0][arg1];
		@Pc(31) int local31 = local21.length;
		if (local31 > Static48.anIntArray25.length) {
			Static72.anIntArray415 = new int[local31];
			Static48.anIntArray25 = new int[local31];
		}
		for (@Pc(43) int local43 = 0; local43 < local31; local43++) {
			Static48.anIntArray25[local43] = local21[local43] >> this.aClass44_Sub2_8.anInt4939;
			Static72.anIntArray415[local43] = local28[local43] >> this.aClass44_Sub2_8.anInt4939;
		}
		@Pc(71) int local71 = 0;
		while (local31 > local71) {
			@Pc(77) int local77 = Static48.anIntArray25[local71];
			@Pc(82) int local82 = Static72.anIntArray415[local71++];
			@Pc(86) int local86 = Static48.anIntArray25[local71];
			@Pc(91) int local91 = Static72.anIntArray415[local71++];
			@Pc(95) int local95 = Static48.anIntArray25[local71];
			@Pc(100) int local100 = Static72.anIntArray415[local71++];
			if ((local91 - local100) * (local77 - local86) - (local95 - local86) * (-local82 + local91) > 0) {
				arg2.method7040(local82, local86, local100, local91, local95, local77);
			}
		}
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method7215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method3813(arg4, arg1, arg0, arg3, arg2, arg5);
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7207(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt4304 <= 0) {
			return;
		}
		@Pc(19) Interface3 local19 = this.aClass44_Sub2_8.method4326(this.anInt4290);
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = 32767;
		@Pc(25) int local25 = -32768;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			local21 = 0;
			@Pc(36) Buffer local36 = local19.method5235();
			if (local36 != null) {
				@Pc(44) Stream local44 = this.aClass44_Sub2_8.method4315(local36);
				@Pc(48) int local48;
				@Pc(57) int local57;
				@Pc(59) int local59;
				@Pc(76) short[] local76;
				@Pc(80) int local80;
				@Pc(88) int local88;
				if (Stream.b()) {
					for (local48 = arg1; local48 < arg3; local48++) {
						local57 = arg0 + super.anInt8829 * local48;
						for (local59 = arg0; local59 < arg2; local59++) {
							if (arg4[local59 - arg0][local48 - arg1]) {
								local76 = this.aShortArrayArray2[local57];
								if (local76 != null) {
									for (local80 = 0; local80 < local76.length; local80++) {
										local88 = local76[local80] & 0xFFFF;
										if (local25 < local88) {
											local25 = local88;
										}
										local44.e(local88);
										local21++;
										if (local23 > local88) {
											local23 = local88;
										}
									}
								}
							}
							local57++;
						}
					}
				} else {
					for (local48 = arg1; local48 < arg3; local48++) {
						local57 = arg0 + local48 * super.anInt8829;
						for (local59 = arg0; local59 < arg2; local59++) {
							if (arg4[local59 - arg0][local48 - arg1]) {
								local76 = this.aShortArrayArray2[local57];
								if (local76 != null) {
									for (local80 = 0; local80 < local76.length; local80++) {
										local88 = local76[local80] & 0xFFFF;
										local21++;
										if (local23 > local88) {
											local23 = local88;
										}
										if (local88 > local25) {
											local25 = local88;
										}
										local44.f(local88);
									}
								}
							}
							local57++;
						}
					}
				}
				local44.a();
				if (local19.method5237()) {
					break;
				}
			}
		}
		if (local21 <= 0) {
			return;
		}
		this.aClass44_Sub2_8.method4242();
		this.aClass44_Sub2_8.method4270(false);
		this.aClass44_Sub2_8.method4244(false);
		this.aClass44_Sub2_8.method4269(false);
		this.aClass44_Sub2_8.method4248(false);
		this.aClass44_Sub2_8.method4321(0);
		this.aClass44_Sub2_8.method4272(-2, false, false);
		this.aClass44_Sub2_8.method4265(null);
		@Pc(271) Class8_Sub3 local271 = this.aClass44_Sub2_8.method4281();
		@Pc(276) float[] local276 = this.aClass44_Sub2_8.method4276();
		local276[10] = 1.0F / (this.aFloat135 - this.aFloat134);
		local276[0] = (float) 1024 / ((float) this.aClass44_Sub2_8.anInt4914 * 128.0F * (float) super.anInt8824);
		local276[15] = 1.0F;
		local276[7] = 0.0F;
		local276[2] = 0.0F;
		local276[12] = -1.0F - ((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass44_Sub2_8.anInt4914;
		local276[14] = -this.aFloat134 / (this.aFloat135 - this.aFloat134);
		local276[5] = (float) 1024 / ((float) super.anInt8824 * 128.0F * (float) this.aClass44_Sub2_8.anInt4807);
		local276[11] = 0.0F;
		local276[6] = 0.0F;
		local276[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass44_Sub2_8.anInt4807;
		local276[8] = 0.0F;
		local276[3] = 0.0F;
		local276[1] = 0.0F;
		local276[9] = 0.0F;
		local276[4] = 0.0F;
		local271.method1571(1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
		this.aClass44_Sub2_8.method4316();
		this.aClass44_Sub2_8.method4275();
		if ((this.anInt4297 & 0x7) == 0) {
			this.aClass44_Sub2_8.method4244(false);
		} else {
			this.aClass44_Sub2_8.method4244(true);
			this.aClass44_Sub2_8.method4240();
		}
		this.aClass44_Sub2_8.method4290(false);
		this.aClass44_Sub2_8.method4358(0, this.anInterface9_8);
		this.aClass44_Sub2_8.method4358(1, this.anInterface9_9);
		this.aClass44_Sub2_8.method4374(this.aClass3_14);
		this.aClass44_Sub2_8.method4361(0, Static262.aClass271_5, local21 / 3, local23, local25 + 1 - local23, local19);
		this.aClass44_Sub2_8.method4290(true);
	}
}
