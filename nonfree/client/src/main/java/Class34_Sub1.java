import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class34_Sub1 extends Class34 {

	@OriginalMember(owner = "client!bh", name = "n", descriptor = "I")
	private int anInt784;

	@OriginalMember(owner = "client!bh", name = "t", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!bh", name = "y", descriptor = "I")
	private int anInt790;

	@OriginalMember(owner = "client!bh", name = "W", descriptor = "I")
	private int anInt803;

	@OriginalMember(owner = "client!bh", name = "X", descriptor = "Lclient!ada;")
	public Class7 aClass7_1;

	@OriginalMember(owner = "client!bh", name = "Z", descriptor = "Lclient!su;")
	private Interface19 anInterface19_1;

	@OriginalMember(owner = "client!bh", name = "ab", descriptor = "Lclient!su;")
	private Interface19 anInterface19_2;

	@OriginalMember(owner = "client!bh", name = "bb", descriptor = "[Lclient!dn;")
	private Class3_Sub13[] aClass3_Sub13Array1;

	@OriginalMember(owner = "client!bh", name = "hb", descriptor = "I")
	private int anInt805;

	@OriginalMember(owner = "client!bh", name = "v", descriptor = "F")
	private float aFloat18 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!bh", name = "U", descriptor = "F")
	private float aFloat19 = -3.4028235E38F;

	@OriginalMember(owner = "client!bh", name = "H", descriptor = "Lclient!gk;")
	private final Class112 aClass112_11 = new Class112();

	@OriginalMember(owner = "client!bh", name = "Q", descriptor = "Lclient!mj;")
	public final Class45_Sub2 aClass45_Sub2_2;

	@OriginalMember(owner = "client!bh", name = "K", descriptor = "I")
	private final int anInt797;

	@OriginalMember(owner = "client!bh", name = "eb", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!bh", name = "J", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!bh", name = "o", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!bh", name = "z", descriptor = "I")
	public final int anInt791;

	@OriginalMember(owner = "client!bh", name = "L", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!bh", name = "A", descriptor = "[[[Lclient!dn;")
	private Class3_Sub13[][][] aClass3_Sub13ArrayArrayArray1;

	@OriginalMember(owner = "client!bh", name = "B", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!bh", name = "cb", descriptor = "[[B")
	private byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!bh", name = "Y", descriptor = "[[F")
	private float[][] aFloatArrayArray1;

	@OriginalMember(owner = "client!bh", name = "N", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!bh", name = "gb", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!bh", name = "P", descriptor = "I")
	private final int anInt800;

	@OriginalMember(owner = "client!bh", name = "s", descriptor = "[[S")
	public final short[][] aShortArrayArray1;

	@OriginalMember(owner = "client!bh", name = "R", descriptor = "[[B")
	private final byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!bh", name = "db", descriptor = "Lclient!wa;")
	private Class354 aClass354_5;

	@OriginalMember(owner = "client!bh", name = "E", descriptor = "Lclient!ws;")
	private Class363 aClass363_1;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lclient!mj;IIII[[I[[II)V")
	public Class34_Sub1(@OriginalArg(0) Class45_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass45_Sub2_2 = arg0;
		this.anInt797 = super.anInt7856 - 2;
		this.aFloatArrayArray2 = new float[super.anInt7854 + 1][super.anInt7852 + 1];
		this.anIntArrayArrayArray5 = new int[arg3][arg4][];
		this.anIntArrayArrayArray2 = new int[arg3][arg4][];
		this.anInt791 = arg2;
		this.anIntArrayArrayArray6 = new int[arg3][arg4][];
		this.aClass3_Sub13ArrayArrayArray1 = new Class3_Sub13[arg3][arg4][];
		this.anIntArrayArrayArray4 = new int[arg3][arg4][];
		this.aByteArrayArray2 = new byte[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray1 = new float[super.anInt7854 + 1][super.anInt7852 + 1];
		this.anIntArrayArrayArray7 = new int[arg3][arg4][];
		this.aFloatArrayArray3 = new float[super.anInt7854 + 1][super.anInt7852 + 1];
		this.anInt800 = 0x1 << this.anInt797;
		this.aShortArrayArray1 = new short[arg3 * arg4][];
		this.aByteArrayArray1 = new byte[arg3][arg4];
		for (@Pc(121) int local121 = 0; super.anInt7852 >= local121; local121++) {
			for (@Pc(125) int local125 = 0; local125 <= super.anInt7854; local125++) {
				@Pc(134) int local134 = super.anIntArrayArray172[local125][local121];
				if (this.aFloat18 > (float) local134) {
					this.aFloat18 = local134;
				}
				if ((float) local134 > this.aFloat19) {
					this.aFloat19 = local134;
				}
				if (local125 > 0 && local121 > 0 && local125 < super.anInt7854 && local121 < super.anInt7852) {
					@Pc(190) int local190 = arg6[local125 + 1][local121] - arg6[local125 - 1][local121];
					@Pc(207) int local207 = arg6[local125][local121 + 1] - arg6[local125][local121 - 1];
					@Pc(226) float local226 = (float) (1.0D / Math.sqrt((double) (local207 * local207 + local190 * local190 + arg7 * 4 * arg7)));
					this.aFloatArrayArray1[local125][local121] = local226 * (float) local190;
					this.aFloatArrayArray2[local125][local121] = (float) (-arg7 * 2) * local226;
					this.aFloatArrayArray3[local125][local121] = (float) local207 * local226;
				}
			}
		}
		this.aFloat18--;
		this.aFloat19++;
		this.aClass354_5 = new Class354(128);
		if ((this.anInt791 & 0x10) != 0) {
			this.aClass363_1 = new Class363(this.aClass45_Sub2_2, this);
		}
	}

	@OriginalMember(owner = "client!bh", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray3 == null) {
			this.anIntArrayArrayArray3 = new int[super.anInt7854][super.anInt7852][];
		}
		if (arg3 != null && this.anIntArrayArrayArray2 == null) {
			this.anIntArrayArrayArray2 = new int[super.anInt7854][super.anInt7852][];
		}
		this.anIntArrayArrayArray6[arg0][arg1] = arg2;
		this.anIntArrayArrayArray5[arg0][arg1] = arg4;
		this.anIntArrayArrayArray4[arg0][arg1] = arg6;
		this.anIntArrayArrayArray7[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray3 != null) {
			this.anIntArrayArrayArray3[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray2 != null) {
			this.anIntArrayArrayArray2[arg0][arg1] = arg3;
		}
		@Pc(88) Class3_Sub13[] local88 = this.aClass3_Sub13ArrayArrayArray1[arg0][arg1] = new Class3_Sub13[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) arg8[local90] | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28 | (long) (arg9[local90] << 14);
			@Pc(125) Class3 local125;
			for (local125 = this.aClass354_5.method7689(local119); local125 != null; local125 = this.aClass354_5.method7693()) {
				@Pc(130) Class3_Sub13 local130 = (Class3_Sub13) local125;
				if (arg8[local90] == local130.anInt2011 && local130.aFloat45 == (float) arg9[local90] && local130.anInt2016 == arg10 && arg11 == local130.anInt2015 && local130.anInt2014 == arg12) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class3_Sub13(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass354_5.method7691(local88[local90], local119);
			} else {
				local88[local90] = (Class3_Sub13) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray1[arg0][arg1] = (byte) (this.aByteArrayArray1[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt803) {
			this.anInt803 = arg6.length;
		}
		this.anInt805 += arg6.length;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)V")
	@Override
	public void method6527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!bh", name = "BA", descriptor = "()V")
	@Override
	public void BA() {
		if (this.anInt805 > 0) {
			@Pc(21) byte[][] local21 = new byte[super.anInt7854 + 1][super.anInt7852 + 1];
			for (@Pc(23) int local23 = 1; super.anInt7854 > local23; local23++) {
				for (@Pc(27) int local27 = 1; super.anInt7852 > local27; local27++) {
					local21[local23][local27] = (byte) ((this.aByteArrayArray2[local23][local27 + 1] >> 3) + (this.aByteArrayArray2[local23][local27 - 1] >> 2) + (this.aByteArrayArray2[local23 + -1][local27] >> 2) + (this.aByteArrayArray2[local23 - -1][local27] >> 3) + (this.aByteArrayArray2[local23][local27] >> 1));
				}
			}
			@Pc(111) Class3_Sub13[] local111 = new Class3_Sub13[this.aClass354_5.method7688()];
			this.aClass354_5.method7695(local111);
			for (@Pc(119) int local119 = 0; local119 < local111.length; local119++) {
				local111[local119].method1827(this.anInt805);
			}
			@Pc(135) int local135 = 20;
			if (this.anIntArrayArrayArray3 != null) {
				local135 += 4;
			}
			if ((this.anInt791 & 0x7) != 0) {
				local135 += 12;
			}
			@Pc(155) NativeHeapBuffer local155 = this.aClass45_Sub2_2.aNativeHeap4.a(this.anInt805 * 4, false);
			@Pc(165) NativeHeapBuffer local165 = this.aClass45_Sub2_2.aNativeHeap4.a(this.anInt805 * local135, false);
			@Pc(170) Stream local170 = new Stream(local165);
			@Pc(175) Stream local175 = new Stream(local155);
			@Pc(179) Class3_Sub13[] local179 = new Class3_Sub13[this.anInt805];
			@Pc(186) int local186 = Static489.method6617(this.anInt805 / 4);
			if (local186 < 1) {
				local186 = 1;
			}
			@Pc(198) Class354 local198 = new Class354(local186);
			@Pc(202) Class3_Sub13[] local202 = new Class3_Sub13[this.anInt803];
			@Pc(208) int local208;
			for (@Pc(204) int local204 = 0; local204 < super.anInt7854; local204++) {
				for (local208 = 0; local208 < super.anInt7852; local208++) {
					if (this.anIntArrayArrayArray4[local204][local208] != null) {
						@Pc(224) Class3_Sub13[] local224 = this.aClass3_Sub13ArrayArrayArray1[local204][local208];
						@Pc(231) int[] local231 = this.anIntArrayArrayArray6[local204][local208];
						@Pc(238) int[] local238 = this.anIntArrayArrayArray5[local204][local208];
						@Pc(245) int[] local245 = this.anIntArrayArrayArray7[local204][local208];
						@Pc(252) int[] local252 = this.anIntArrayArrayArray4[local204][local208];
						@Pc(264) int[] local264 = this.anIntArrayArrayArray2 == null ? null : this.anIntArrayArrayArray2[local204][local208];
						if (local245 == null) {
							local245 = local252;
						}
						@Pc(280) int[] local280 = this.anIntArrayArrayArray3 == null ? null : this.anIntArrayArrayArray3[local204][local208];
						@Pc(287) float local287 = this.aFloatArrayArray1[local204][local208];
						@Pc(294) float local294 = this.aFloatArrayArray2[local204][local208];
						@Pc(301) float local301 = this.aFloatArrayArray3[local204][local208];
						@Pc(310) float local310 = this.aFloatArrayArray1[local204][local208 + 1];
						@Pc(319) float local319 = this.aFloatArrayArray2[local204][local208 + 1];
						@Pc(328) float local328 = this.aFloatArrayArray3[local204][local208 + 1];
						@Pc(339) float local339 = this.aFloatArrayArray1[local204 + 1][local208 + 1];
						@Pc(350) float local350 = this.aFloatArrayArray2[local204 + 1][local208 + 1];
						@Pc(361) float local361 = this.aFloatArrayArray3[local204 + 1][local208 + 1];
						@Pc(370) float local370 = this.aFloatArrayArray1[local204 + 1][local208];
						@Pc(379) float local379 = this.aFloatArrayArray2[local204 + 1][local208];
						@Pc(388) float local388 = this.aFloatArrayArray3[local204 + 1][local208];
						@Pc(396) int local396 = local21[local204][local208] & 0xFF;
						@Pc(406) int local406 = local21[local204][local208 + 1] & 0xFF;
						@Pc(418) int local418 = local21[local204 + 1][local208 + 1] & 0xFF;
						@Pc(428) int local428 = local21[local204 + 1][local208] & 0xFF;
						@Pc(430) int local430 = 0;
						@Pc(440) int local440;
						label357: for (@Pc(432) int local432 = 0; local432 < local252.length; local432++) {
							@Pc(438) Class3_Sub13 local438 = local224[local432];
							for (local440 = 0; local440 < local430; local440++) {
								if (local438 == local202[local440]) {
									continue label357;
								}
							}
							local202[local430++] = local438;
						}
						@Pc(481) short[] local481 = this.aShortArrayArray1[local204 + local208 * super.anInt7854] = new short[local252.length];
						for (local440 = 0; local440 < local252.length; local440++) {
							@Pc(494) int local494 = (local204 << super.anInt7856) + local231[local440];
							@Pc(504) int local504 = (local208 << super.anInt7856) + local238[local440];
							@Pc(509) int local509 = local494 >> this.anInt797;
							@Pc(514) int local514 = local504 >> this.anInt797;
							@Pc(518) int local518 = local252[local440];
							@Pc(522) int local522 = local245[local440];
							@Pc(530) int local530 = local264 == null ? 0 : local264[local440];
							@Pc(548) long local548 = (long) local518 << 32 | (long) local522 << 48 | (long) (local509 << 16) | (long) local514;
							@Pc(552) int local552 = local231[local440];
							@Pc(556) int local556 = local238[local440];
							@Pc(558) byte local558 = 74;
							@Pc(560) int local560 = 0;
							@Pc(562) float local562 = 1.0F;
							@Pc(568) float local568;
							@Pc(570) float local570;
							@Pc(572) float local572;
							@Pc(655) float local655;
							@Pc(576) int local576;
							if (local552 == 0 && local556 == 0) {
								local568 = local287;
								local570 = local294;
								local572 = local301;
								local576 = local558 - local396;
							} else if (local552 == 0 && local556 == super.anInt7850) {
								local576 = local558 - local406;
								local570 = local319;
								local568 = local310;
								local572 = local328;
							} else if (super.anInt7850 == local552 && local556 == super.anInt7850) {
								local568 = local339;
								local570 = local350;
								local576 = local558 - local418;
								local572 = local361;
							} else if (super.anInt7850 == local552 && local556 == 0) {
								local570 = local379;
								local568 = local370;
								local576 = local558 - local428;
								local572 = local388;
							} else {
								@Pc(632) float local632 = (float) local552 / (float) super.anInt7850;
								@Pc(639) float local639 = (float) local556 / (float) super.anInt7850;
								@Pc(647) float local647 = local287 + (local370 - local287) * local632;
								local655 = (local379 - local294) * local632 + local294;
								@Pc(664) float local664 = local301 + local632 * (local388 - local301);
								@Pc(673) float local673 = local632 * (local339 - local310) + local310;
								@Pc(682) float local682 = local319 + (local350 - local319) * local632;
								@Pc(691) float local691 = local328 + (local361 - local328) * local632;
								local568 = local639 * (local673 - local647) + local647;
								local570 = local655 + (local682 - local655) * local639;
								local572 = local664 + (local691 - local664) * local639;
								@Pc(729) int local729 = ((local428 - local396) * local552 >> super.anInt7856) + local396;
								@Pc(741) int local741 = ((local418 - local406) * local552 >> super.anInt7856) + local406;
								local576 = local558 - local729 - ((local741 - local729) * local556 >> super.anInt7856);
							}
							if (local518 != -1) {
								@Pc(791) int local791 = local576 * (local518 & 0x7F) >> 7;
								if (local791 < 2) {
									local791 = 2;
								} else if (local791 > 126) {
									local791 = 126;
								}
								if ((this.anInt791 & 0x7) == 0) {
									local562 = this.aClass45_Sub2_2.aFloatArray66[2] * local572 + this.aClass45_Sub2_2.aFloatArray66[1] * local570 + local568 * this.aClass45_Sub2_2.aFloatArray66[0];
									local562 = local562 * (local562 > 0.0F ? this.aClass45_Sub2_2.aFloat135 : this.aClass45_Sub2_2.aFloat133) + this.aClass45_Sub2_2.aFloat134;
								}
								local560 = Static214.anIntArray203[local791 | local518 & 0xFF80];
							}
							@Pc(864) Class3 local864 = null;
							if ((local494 & this.anInt800 - 1) == 0 && (local504 & this.anInt800 - 1) == 0) {
								local864 = local198.method7689(local548);
							}
							@Pc(1194) int local1194;
							@Pc(894) int local894;
							if (local864 == null) {
								if (local522 == local518) {
									local894 = local560;
								} else {
									@Pc(904) int local904 = (local522 & 0x7F) * local576 >> 7;
									if (local904 < 2) {
										local904 = 2;
									} else if (local904 > 126) {
										local904 = 126;
									}
									local894 = Static214.anIntArray203[local904 | local522 & 0xFF80];
									if ((this.anInt791 & 0x7) == 0) {
										local655 = local572 * this.aClass45_Sub2_2.aFloatArray66[2] + local570 * this.aClass45_Sub2_2.aFloatArray66[1] + local568 * this.aClass45_Sub2_2.aFloatArray66[0];
										local655 = (local562 > 0.0F ? this.aClass45_Sub2_2.aFloat135 : this.aClass45_Sub2_2.aFloat133) * local562 + this.aClass45_Sub2_2.aFloat134;
										@Pc(980) int local980 = local894 >> 16 & 0xFF;
										@Pc(986) int local986 = local894 >> 8 & 0xFF;
										@Pc(990) int local990 = local894 & 0xFF;
										local980 = (int) ((float) local980 * local655);
										local986 = (int) ((float) local986 * local655);
										if (local980 < 0) {
											local980 = 0;
										} else if (local980 > 255) {
											local980 = 255;
										}
										local990 = (int) ((float) local990 * local655);
										if (local986 < 0) {
											local986 = 0;
										} else if (local986 > 255) {
											local986 = 255;
										}
										if (local990 < 0) {
											local990 = 0;
										} else if (local990 > 255) {
											local990 = 255;
										}
										local894 = local986 << 8 | local980 << 16 | local990;
									}
								}
								if (Stream.c()) {
									local170.a((float) local494);
									local170.a((float) (local530 + this.method6530(local494, local504)));
									local170.a((float) local504);
									local170.a((float) local494);
									local170.a((float) local504);
									if (this.anIntArrayArrayArray3 != null) {
										local170.a((float) (local280 == null ? 0 : local280[local440] - 1));
									}
									if ((this.anInt791 & 0x7) != 0) {
										local170.a(local568);
										local170.a(local570);
										local170.a(local572);
									}
								} else {
									local170.b((float) local494);
									local170.b((float) (local530 + this.method6530(local494, local504)));
									local170.b((float) local504);
									local170.b((float) local494);
									local170.b((float) local504);
									if (this.anIntArrayArrayArray3 != null) {
										local170.b((float) (local280 == null ? 0 : local280[local440] - 1));
									}
									if ((this.anInt791 & 0x7) != 0) {
										local170.b(local568);
										local170.b(local570);
										local170.b(local572);
									}
								}
								if (this.aClass45_Sub2_2.anInt5834 == 0) {
									local175.c(local894 | 0xFF000000);
								} else {
									local175.a(local894 | 0xFF000000);
								}
								local1194 = this.anInt790++;
								local481[local440] = (short) local1194;
								if (local518 != -1) {
									local179[local1194] = local224[local440];
								}
								local198.method7691(new Class3_Sub40(local481[local440]), local548);
							} else {
								local481[local440] = ((Class3_Sub40) local864).aShort116;
								local1194 = local481[local440] & 0xFFFF;
								if (local518 != -1 && local179[local1194].aLong273 > local224[local440].aLong273) {
									local179[local1194] = local224[local440];
								}
							}
							for (local894 = 0; local894 < local430; local894++) {
								local202[local894].method1825(local576, local562, local1194, local560);
							}
							this.anInt784++;
						}
					}
				}
			}
			for (local208 = 0; local208 < this.anInt790; local208++) {
				@Pc(1306) Class3_Sub13 local1306 = local179[local208];
				if (local1306 != null) {
					local1306.method1823(local208);
				}
			}
			@Pc(1327) int local1327;
			@Pc(1345) int local1345;
			for (@Pc(1323) int local1323 = 0; super.anInt7854 > local1323; local1323++) {
				for (local1327 = 0; super.anInt7852 > local1327; local1327++) {
					@Pc(1339) short[] local1339 = this.aShortArrayArray1[local1327 * super.anInt7854 + local1323];
					if (local1339 != null) {
						@Pc(1343) int local1343 = 0;
						local1345 = 0;
						while (local1339.length > local1345) {
							@Pc(1354) int local1354 = local1339[local1345++] & 0xFFFF;
							@Pc(1361) int local1361 = local1339[local1345++] & 0xFFFF;
							@Pc(1368) int local1368 = local1339[local1345++] & 0xFFFF;
							@Pc(1372) Class3_Sub13 local1372 = local179[local1354];
							@Pc(1376) Class3_Sub13 local1376 = local179[local1361];
							@Pc(1380) Class3_Sub13 local1380 = local179[local1368];
							@Pc(1382) Class3_Sub13 local1382 = null;
							if (local1372 != null) {
								local1382 = local1372;
								local1372.method1826(local1343, local1323, local1327);
							}
							if (local1376 != null) {
								local1376.method1826(local1343, local1323, local1327);
								if (local1382 == null || local1382.aLong273 > local1376.aLong273) {
									local1382 = local1376;
								}
							}
							if (local1380 != null) {
								local1380.method1826(local1343, local1323, local1327);
								if (local1382 == null || local1382.aLong273 > local1380.aLong273) {
									local1382 = local1380;
								}
							}
							if (local1382 != null) {
								if (local1372 != null) {
									local1382.method1823(local1354);
								}
								if (local1376 != null) {
									local1382.method1823(local1361);
								}
								if (local1380 != null) {
									local1382.method1823(local1368);
								}
								local1382.method1826(local1343, local1323, local1327);
							}
							local1343++;
						}
					}
				}
			}
			local170.a();
			local175.a();
			this.anInterface19_1 = this.aClass45_Sub2_2.method5009(false);
			this.anInterface19_1.method6254(4, local155, this.anInt790 * 4);
			this.anInterface19_2 = this.aClass45_Sub2_2.method5009(false);
			this.anInterface19_2.method6254(local135, local165, local135 * this.anInt790);
			if ((this.anInt791 & 0x7) == 0) {
				if (this.anIntArrayArrayArray3 == null) {
					this.aClass7_1 = this.aClass45_Sub2_2.method5002(new Class332[] { new Class332(new Class147[] { Static227.aClass147_1, Static227.aClass147_5 }), new Class332(Static227.aClass147_3) });
				} else {
					this.aClass7_1 = this.aClass45_Sub2_2.method5002(new Class332[] { new Class332(new Class147[] { Static227.aClass147_1, Static227.aClass147_5, Static227.aClass147_4 }), new Class332(Static227.aClass147_3) });
				}
			} else if (this.anIntArrayArrayArray3 == null) {
				this.aClass7_1 = this.aClass45_Sub2_2.method5002(new Class332[] { new Class332(new Class147[] { Static227.aClass147_1, Static227.aClass147_5, Static227.aClass147_2 }), new Class332(Static227.aClass147_3) });
			} else {
				this.aClass7_1 = this.aClass45_Sub2_2.method5002(new Class332[] { new Class332(new Class147[] { Static227.aClass147_1, Static227.aClass147_5, Static227.aClass147_4, Static227.aClass147_2 }), new Class332(Static227.aClass147_3) });
			}
			local1327 = 0;
			for (@Pc(1685) int local1685 = 0; local1685 < local111.length; local1685++) {
				if (local111[local1685].anInt2008 > 0) {
					local111[local1327++] = local111[local1685];
				}
			}
			this.aClass3_Sub13Array1 = new Class3_Sub13[local1327];
			@Pc(1715) long[] local1715 = new long[local1327];
			for (local1345 = 0; local1345 < local1327; local1345++) {
				@Pc(1723) Class3_Sub13 local1723 = local111[local1345];
				local1715[local1345] = local1723.aLong273;
				this.aClass3_Sub13Array1[local1345] = local1723;
				local1723.method1822(this.anInt790);
			}
			Static535.method7131(local1715, this.aClass3_Sub13Array1);
			if (this.aClass363_1 != null) {
				this.aClass363_1.method7917();
			}
		} else {
			this.aClass363_1 = null;
		}
		this.anIntArrayArrayArray4 = null;
		this.aClass3_Sub13ArrayArrayArray1 = null;
		this.aFloatArrayArray1 = this.aFloatArrayArray2 = this.aFloatArrayArray3 = null;
		this.anIntArrayArrayArray6 = this.anIntArrayArrayArray5 = null;
		this.anIntArrayArrayArray7 = null;
		this.anIntArrayArrayArray2 = null;
		this.anIntArrayArrayArray3 = null;
		this.aClass354_5 = null;
		this.aByteArrayArray2 = null;
	}

	@OriginalMember(owner = "client!bh", name = "E", descriptor = "(Lclient!ha;IIIIZ)V")
	@Override
	public void E(@OriginalArg(0) Class3_Sub7_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass363_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass45_Sub2_2.anInt5850 * arg2 >> 8) >> this.aClass45_Sub2_2.anInt5858;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass45_Sub2_2.anInt5867 >> 8) >> this.aClass45_Sub2_2.anInt5858;
			this.aClass363_1.method7911(local24, arg0, local39);
		}
	}

	@OriginalMember(owner = "client!bh", name = "DA", descriptor = "(Lclient!ha;IIIIZ)V")
	@Override
	public void DA(@OriginalArg(0) Class3_Sub7_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass363_1 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (arg2 * this.aClass45_Sub2_2.anInt5850 >> 8) >> this.aClass45_Sub2_2.anInt5858;
			@Pc(38) int local38 = arg3 - (this.aClass45_Sub2_2.anInt5867 * arg2 >> 8) >> this.aClass45_Sub2_2.anInt5858;
			this.aClass363_1.method7913(local23, local38, arg0);
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method6531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILclient!re;II)V")
	private void method688(@OriginalArg(1) Class3_Sub7_Sub13_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray6[arg2][arg1];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray5[arg2][arg1];
		@Pc(22) int local22 = local12.length;
		if (local22 > Static556.anIntArray580.length) {
			Static556.anIntArray580 = new int[local22];
			Static4.anIntArray578 = new int[local22];
		}
		for (@Pc(34) int local34 = 0; local34 < local22; local34++) {
			Static556.anIntArray580[local34] = local12[local34] >> this.aClass45_Sub2_2.anInt5858;
			Static4.anIntArray578[local34] = local19[local34] >> this.aClass45_Sub2_2.anInt5858;
		}
		@Pc(62) int local62 = 0;
		while (local22 > local62) {
			@Pc(68) int local68 = Static556.anIntArray580[local62];
			@Pc(73) int local73 = Static4.anIntArray578[local62++];
			@Pc(77) int local77 = Static556.anIntArray580[local62];
			@Pc(82) int local82 = Static4.anIntArray578[local62++];
			@Pc(86) int local86 = Static556.anIntArray580[local62];
			@Pc(91) int local91 = Static4.anIntArray578[local62++];
			if ((local68 - local77) * (local82 - local91) - (local86 - local77) * (local82 - local73) > 0) {
				arg0.method6387(local73, local77, local91, local68, local82, local86);
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method6526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method689(arg2, arg3, arg0, arg4, -1, arg1);
	}

	@OriginalMember(owner = "client!bh", name = "v", descriptor = "(IILclient!ha;)Lclient!ha;")
	@Override
	public Class3_Sub7_Sub13 v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub7_Sub13 arg2) {
		if ((this.aByteArrayArray1[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(21) int local21 = super.anInt7850 >> this.aClass45_Sub2_2.anInt5858;
		@Pc(24) Class3_Sub7_Sub13_Sub2 local24 = (Class3_Sub7_Sub13_Sub2) arg2;
		@Pc(34) Class3_Sub7_Sub13_Sub2 local34;
		if (local24 != null && local24.method6386(local21, local21)) {
			local34 = local24;
			local24.method6389();
		} else {
			local34 = new Class3_Sub7_Sub13_Sub2(this.aClass45_Sub2_2, local21, local21);
		}
		local34.method6391(local21, 0, 0, local21);
		this.method688(local34, arg1, arg0);
		return local34;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method6532(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt805 <= 0) {
			return;
		}
		@Pc(16) Interface13 local16 = this.aClass45_Sub2_2.method4914(this.anInt784);
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = 32767;
		@Pc(22) int local22 = -32768;
		for (@Pc(24) int local24 = 0; local24 < 4; local24++) {
			local18 = 0;
			@Pc(33) Buffer local33 = local16.method6437();
			if (local33 != null) {
				@Pc(41) Stream local41 = this.aClass45_Sub2_2.method4901(local33);
				@Pc(45) int local45;
				@Pc(55) int local55;
				@Pc(57) int local57;
				@Pc(75) short[] local75;
				@Pc(79) int local79;
				@Pc(87) int local87;
				if (Stream.c()) {
					for (local45 = arg1; local45 < arg3; local45++) {
						local55 = arg0 + super.anInt7854 * local45;
						for (local57 = arg0; local57 < arg2; local57++) {
							if (arg4[local57 - arg0][local45 - arg1]) {
								local75 = this.aShortArrayArray1[local55];
								if (local75 != null) {
									for (local79 = 0; local79 < local75.length; local79++) {
										local87 = local75[local79] & 0xFFFF;
										if (local87 < local20) {
											local20 = local87;
										}
										if (local87 > local22) {
											local22 = local87;
										}
										local18++;
										local41.b(local87);
									}
								}
							}
							local55++;
						}
					}
				} else {
					for (local45 = arg1; local45 < arg3; local45++) {
						local55 = super.anInt7854 * local45 + arg0;
						for (local57 = arg0; local57 < arg2; local57++) {
							if (arg4[local57 - arg0][local45 - arg1]) {
								local75 = this.aShortArrayArray1[local55];
								if (local75 != null) {
									for (local79 = 0; local79 < local75.length; local79++) {
										local87 = local75[local79] & 0xFFFF;
										local41.e(local87);
										local18++;
										if (local87 < local20) {
											local20 = local87;
										}
										if (local22 < local87) {
											local22 = local87;
										}
									}
								}
							}
							local55++;
						}
					}
				}
				local41.a();
				if (local16.method6433()) {
					break;
				}
			}
		}
		if (local18 <= 0) {
			return;
		}
		this.aClass45_Sub2_2.method4968();
		this.aClass45_Sub2_2.method4978(false);
		this.aClass45_Sub2_2.method4905(false);
		this.aClass45_Sub2_2.method4936(false);
		this.aClass45_Sub2_2.method4981(false);
		this.aClass45_Sub2_2.method5019(0);
		this.aClass45_Sub2_2.method4947(false, -2, false);
		this.aClass45_Sub2_2.method4926(null);
		@Pc(268) Class11_Sub1 local268 = this.aClass45_Sub2_2.method4960();
		@Pc(273) float[] local273 = this.aClass45_Sub2_2.method4916();
		local273[7] = 0.0F;
		local273[5] = (float) 1024 / ((float) super.anInt7850 * 128.0F * (float) this.aClass45_Sub2_2.anInt5786);
		local273[3] = 0.0F;
		local273[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass45_Sub2_2.anInt5786;
		local273[15] = 1.0F;
		local273[11] = 0.0F;
		local273[9] = 0.0F;
		local273[4] = 0.0F;
		local273[14] = -this.aFloat18 / (this.aFloat19 - this.aFloat18);
		local273[2] = 0.0F;
		local273[0] = (float) 1024 / ((float) this.aClass45_Sub2_2.anInt5668 * 128.0F * (float) super.anInt7850);
		local273[1] = 0.0F;
		local273[6] = 0.0F;
		local273[10] = 1.0F / (this.aFloat19 - this.aFloat18);
		local273[12] = -1.0F - ((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass45_Sub2_2.anInt5668;
		local273[8] = 0.0F;
		local268.method176(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
		this.aClass45_Sub2_2.method5001();
		this.aClass45_Sub2_2.method4992();
		if ((this.anInt791 & 0x7) == 0) {
			this.aClass45_Sub2_2.method4905(false);
		} else {
			this.aClass45_Sub2_2.method4905(true);
			this.aClass45_Sub2_2.method4986();
		}
		this.aClass45_Sub2_2.method4918(false);
		this.aClass45_Sub2_2.method4910(this.anInterface19_2, 0);
		this.aClass45_Sub2_2.method4910(this.anInterface19_1, 1);
		this.aClass45_Sub2_2.method4957(this.aClass7_1);
		this.aClass45_Sub2_2.method4967(0, local18 / 3, local22 + 1 - local20, Static379.aClass40_9, local16, local20);
		this.aClass45_Sub2_2.method4918(true);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!ha;IIIIZ)Z")
	@Override
	public boolean method6534(@OriginalArg(0) Class3_Sub7_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass363_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (arg2 * this.aClass45_Sub2_2.anInt5850 >> 8) >> this.aClass45_Sub2_2.anInt5858;
			@Pc(39) int local39 = arg3 - (this.aClass45_Sub2_2.anInt5867 * arg2 >> 8) >> this.aClass45_Sub2_2.anInt5858;
			return this.aClass363_1.method7915(local25, arg0, local39);
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(III)V")
	@Override
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray2[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray2[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(I[[ZBIZII)V")
	private void method689(@OriginalArg(0) int arg0, @OriginalArg(1) boolean[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (this.aClass3_Sub13Array1 == null) {
			return;
		}
		@Pc(10) int local10 = arg0 + arg0 + 1;
		@Pc(14) int local14 = local10 * local10;
		if (Static545.anIntArray267.length < local14) {
			Static545.anIntArray267 = new int[local14];
		}
		@Pc(29) int local29 = arg2 - arg0;
		@Pc(31) int local31 = local29;
		if (local29 < 0) {
			local29 = 0;
		}
		@Pc(43) int local43 = arg5 - arg0;
		@Pc(45) int local45 = local43;
		if (local43 < 0) {
			local43 = 0;
		}
		@Pc(53) int local53 = arg0 + arg2;
		if (local53 > super.anInt7854 - 1) {
			local53 = super.anInt7854 - 1;
		}
		@Pc(68) int local68 = arg0 + arg5;
		if (super.anInt7852 - 1 < local68) {
			local68 = super.anInt7852 - 1;
		}
		Static353.anInt6190 = 0;
		for (@Pc(83) int local83 = local29; local83 <= local53; local83++) {
			@Pc(92) boolean[] local92 = arg1[local83 - local31];
			for (@Pc(94) int local94 = local43; local94 <= local68; local94++) {
				if (local92[local94 - local45]) {
					Static545.anIntArray267[Static353.anInt6190++] = local83 + local94 * super.anInt7854;
				}
			}
		}
		if (arg4 == -1) {
			this.aClass45_Sub2_2.method4971();
		} else {
			this.aClass45_Sub2_2.method4962((float) arg4);
			this.aClass45_Sub2_2.method4938();
		}
		this.aClass45_Sub2_2.method4952();
		this.aClass45_Sub2_2.method4905((this.anInt791 & 0x7) != 0);
		this.aClass45_Sub2_2.method4947(false, -1, false);
		this.aClass45_Sub2_2.method4910(this.anInterface19_2, 0);
		for (@Pc(175) int local175 = 0; local175 < this.aClass3_Sub13Array1.length; local175++) {
			this.aClass3_Sub13Array1[local175].method1821(Static545.anIntArray267, Static353.anInt6190);
		}
		@Pc(200) Class11_Sub1 local200 = this.aClass45_Sub2_2.method4960();
		local200.NA(0, -1, 0);
		this.aClass45_Sub2_2.method4992();
		if (!this.aClass112_11.method3093()) {
			@Pc(218) int local218 = this.aClass45_Sub2_2.anInt5847;
			@Pc(222) int local222 = this.aClass45_Sub2_2.anInt5837;
			this.aClass45_Sub2_2.pa(0, local222, this.aClass45_Sub2_2.anInt5848);
			this.aClass45_Sub2_2.method4905(false);
			this.aClass45_Sub2_2.method4981(false);
			this.aClass45_Sub2_2.method5019(128);
			this.aClass45_Sub2_2.method4947(false, -2, false);
			this.aClass45_Sub2_2.method4926(this.aClass45_Sub2_2.anInterface11_3);
			this.aClass45_Sub2_2.method4921(Static534.aClass307_7, Static19.aClass307_1);
			this.aClass45_Sub2_2.method4953(0, Static62.aClass108_1);
			this.aClass45_Sub2_2.method4900(0, Static425.aClass108_4);
			for (@Pc(282) Class3 local282 = this.aClass112_11.method3088(); local282 != null; local282 = this.aClass112_11.method3084()) {
				@Pc(287) Class3_Sub12 local287 = (Class3_Sub12) local282;
				local287.method1718(arg0, arg5, arg1, arg2);
			}
			this.aClass45_Sub2_2.method4953(0, Static164.aClass108_3);
			this.aClass45_Sub2_2.method4900(0, Static164.aClass108_3);
			this.aClass45_Sub2_2.method4926(null);
			this.aClass45_Sub2_2.pa(local218, local222, this.aClass45_Sub2_2.anInt5848);
		}
		if (this.aClass363_1 != null) {
			this.aClass45_Sub2_2.method4910(this.anInterface19_2, 0);
			this.aClass45_Sub2_2.method4910(this.anInterface19_1, 1);
			this.aClass45_Sub2_2.method4957(this.aClass7_1);
			this.aClass363_1.method7914(arg2, arg3, arg0, arg5, arg1);
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!eq;[I)V")
	@Override
	public void method6535(@OriginalArg(0) Class3_Sub10 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass112_11.method3079(new Class3_Sub12(this.aClass45_Sub2_2, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method6529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method689(arg2, arg3, arg0, arg4, arg5, arg1);
	}
}
