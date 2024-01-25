import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pp")
public final class Class70_Sub2 extends Class70 {

	@OriginalMember(owner = "client!pp", name = "y", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray98;

	@OriginalMember(owner = "client!pp", name = "L", descriptor = "I")
	private int anInt5273;

	@OriginalMember(owner = "client!pp", name = "Q", descriptor = "I")
	private int anInt5276;

	@OriginalMember(owner = "client!pp", name = "V", descriptor = "Lclient!wt;")
	private Class267 aClass267_9;

	@OriginalMember(owner = "client!pp", name = "W", descriptor = "[Lclient!kr;")
	private Class1_Sub26[] aClass1_Sub26Array1;

	@OriginalMember(owner = "client!pp", name = "X", descriptor = "Lclient!uv;")
	private Interface12 anInterface12_3;

	@OriginalMember(owner = "client!pp", name = "Y", descriptor = "Lclient!wt;")
	public Class267 aClass267_10;

	@OriginalMember(owner = "client!pp", name = "cb", descriptor = "Lclient!wt;")
	public Class267 aClass267_11;

	@OriginalMember(owner = "client!pp", name = "db", descriptor = "I")
	private int anInt5280;

	@OriginalMember(owner = "client!pp", name = "eb", descriptor = "I")
	private int anInt5281;

	@OriginalMember(owner = "client!pp", name = "fb", descriptor = "Lclient!wt;")
	public Class267 aClass267_12;

	@OriginalMember(owner = "client!pp", name = "l", descriptor = "Lclient!ko;")
	private final Class142 aClass142_33 = new Class142();

	@OriginalMember(owner = "client!pp", name = "R", descriptor = "Lclient!qg;")
	public final Class121_Sub2 aClass121_Sub2_29;

	@OriginalMember(owner = "client!pp", name = "O", descriptor = "[[I")
	private final int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!pp", name = "U", descriptor = "I")
	private final int anInt5279;

	@OriginalMember(owner = "client!pp", name = "I", descriptor = "I")
	private final int anInt5270;

	@OriginalMember(owner = "client!pp", name = "G", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray100;

	@OriginalMember(owner = "client!pp", name = "E", descriptor = "I")
	public final int anInt5268;

	@OriginalMember(owner = "client!pp", name = "w", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray97;

	@OriginalMember(owner = "client!pp", name = "gb", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!pp", name = "n", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray96;

	@OriginalMember(owner = "client!pp", name = "j", descriptor = "[[B")
	private final byte[][] aByteArrayArray20;

	@OriginalMember(owner = "client!pp", name = "v", descriptor = "[[[Lclient!kr;")
	private Class1_Sub26[][][] aClass1_Sub26ArrayArrayArray1;

	@OriginalMember(owner = "client!pp", name = "N", descriptor = "[[S")
	public final short[][] aShortArrayArray6;

	@OriginalMember(owner = "client!pp", name = "m", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray95;

	@OriginalMember(owner = "client!pp", name = "hb", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!pp", name = "bb", descriptor = "[[B")
	private byte[][] aByteArrayArray21;

	@OriginalMember(owner = "client!pp", name = "F", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray99;

	@OriginalMember(owner = "client!pp", name = "Z", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!pp", name = "ab", descriptor = "Lclient!cv;")
	private Class51 aClass51_17;

	@OriginalMember(owner = "client!pp", name = "z", descriptor = "Lclient!ab;")
	private Class3 aClass3_2;

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lclient!qg;IIII[[I[[II)V")
	public Class70_Sub2(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.aClass121_Sub2_29 = arg0;
		this.anIntArrayArray40 = arg5;
		this.anInt5279 = super.anInt5253 - 2;
		this.anInt5270 = 0x1 << this.anInt5279;
		this.anIntArrayArrayArray100 = new int[arg3][arg4][];
		this.anInt5268 = arg2;
		this.anIntArrayArrayArray97 = new int[arg3][arg4][];
		this.aFloatArrayArray4 = new float[super.anInt5251 + 1][super.anInt5250 + 1];
		this.anIntArrayArrayArray96 = new int[arg3][arg4][];
		this.aByteArrayArray20 = new byte[arg3][arg4];
		this.aClass1_Sub26ArrayArrayArray1 = new Class1_Sub26[arg3][arg4][];
		this.aShortArrayArray6 = new short[arg4 * arg3][];
		this.anIntArrayArrayArray95 = new int[arg3][arg4][];
		this.aFloatArrayArray5 = new float[super.anInt5251 + 1][super.anInt5250 + 1];
		this.aByteArrayArray21 = new byte[arg3 + 1][arg4 + 1];
		this.anIntArrayArrayArray99 = new int[arg3][arg4][];
		this.aFloatArrayArray3 = new float[super.anInt5251 + 1][super.anInt5250 + 1];
		for (@Pc(117) int local117 = 1; super.anInt5250 > local117; local117++) {
			for (@Pc(121) int local121 = 1; local121 < super.anInt5251; local121++) {
				@Pc(140) int local140 = arg6[local121 + 1][local117] - arg6[local121 - 1][local117];
				@Pc(157) int local157 = arg6[local121][local117 + 1] - arg6[local121][local117 - 1];
				@Pc(177) float local177 = (float) (1.0D / Math.sqrt((double) (local140 * local140 + arg7 * 4 * arg7 + local157 * local157)));
				this.aFloatArrayArray4[local121][local117] = local177 * (float) local140;
				this.aFloatArrayArray5[local121][local117] = local177 * (float) (-arg7 * 2);
				this.aFloatArrayArray3[local121][local117] = local177 * (float) local157;
			}
		}
		this.aClass51_17 = new Class51(128);
		if ((this.anInt5268 & 0x10) != 0) {
			this.aClass3_2 = new Class3(this.aClass121_Sub2_29, this);
		}
	}

	@OriginalMember(owner = "client!pp", name = "JA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg3 != null && this.anIntArrayArrayArray97 == null) {
			this.anIntArrayArrayArray97 = new int[super.anInt5251][super.anInt5250][];
		}
		if (arg5 != null && this.anIntArrayArrayArray98 == null) {
			this.anIntArrayArrayArray98 = new int[super.anInt5251][super.anInt5250][];
		}
		this.anIntArrayArrayArray96[arg0][arg1] = arg2;
		this.anIntArrayArrayArray100[arg0][arg1] = arg4;
		this.anIntArrayArrayArray99[arg0][arg1] = arg6;
		this.anIntArrayArrayArray95[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray98 != null) {
			this.anIntArrayArrayArray98[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray97 != null) {
			this.anIntArrayArrayArray97[arg0][arg1] = arg3;
		}
		@Pc(88) Class1_Sub26[] local88 = this.aClass1_Sub26ArrayArrayArray1[arg0][arg1] = new Class1_Sub26[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) arg8[local90] | (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42 | (long) (arg9[local90] << 14);
			@Pc(125) Class1 local125;
			for (local125 = this.aClass51_17.method930(local119); local125 != null; local125 = this.aClass51_17.method925()) {
				@Pc(130) Class1_Sub26 local130 = (Class1_Sub26) local125;
				if (arg8[local90] == local130.anInt3848 && (float) arg9[local90] == local130.aFloat66 && local130.anInt3851 == arg10 && arg11 == local130.anInt3850 && local130.anInt3844 == arg12) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class1_Sub26(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass51_17.method931(local88[local90], local119);
			} else {
				local88[local90] = (Class1_Sub26) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray20[arg0][arg1] = (byte) (this.aByteArrayArray20[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt5280) {
			this.anInt5280 = arg6.length;
		}
		this.anInt5281 += arg6.length;
	}

	@OriginalMember(owner = "client!pp", name = "f", descriptor = "()V")
	@Override
	public void f() {
		if (this.anInt5281 > 0) {
			@Pc(14) byte[][] local14 = new byte[super.anInt5251 + 1][super.anInt5250 + 1];
			@Pc(20) int local20;
			for (@Pc(16) int local16 = 1; super.anInt5251 > local16; local16++) {
				for (local20 = 1; local20 < super.anInt5250; local20++) {
					local14[local16][local20] = (byte) ((this.aByteArrayArray21[local16][local20 + 1] >> 3) + (this.aByteArrayArray21[local16][local20 - 1] >> 2) + (this.aByteArrayArray21[local16 + 1][local20] >> 3) + (this.aByteArrayArray21[local16 - 1][local20] >> 2) + (this.aByteArrayArray21[local16][local20] >> 1));
				}
			}
			this.aClass1_Sub26Array1 = new Class1_Sub26[this.aClass51_17.method927()];
			this.aClass51_17.method923(this.aClass1_Sub26Array1);
			for (local20 = 0; local20 < this.aClass1_Sub26Array1.length; local20++) {
				this.aClass1_Sub26Array1[local20].method3231(this.anInt5281);
			}
			@Pc(136) int local136 = 24;
			if (this.anIntArrayArrayArray98 != null) {
				local136 += 4;
			}
			if ((this.anInt5268 & 0x7) != 0) {
				local136 += 12;
			}
			@Pc(158) NativeBuffer local158 = this.aClass121_Sub2_29.aNativeHeap1.a(local136 * this.anInt5281);
			@Pc(163) NativeStream local163 = new NativeStream(local158);
			@Pc(167) Class1_Sub26[] local167 = new Class1_Sub26[this.anInt5281];
			@Pc(174) int local174 = Static81.method1178(this.anInt5281 / 4);
			if (local174 < 1) {
				local174 = 1;
			}
			@Pc(184) Class51 local184 = new Class51(local174);
			@Pc(188) Class1_Sub26[] local188 = new Class1_Sub26[this.anInt5280];
			@Pc(194) int local194;
			for (@Pc(190) int local190 = 0; local190 < super.anInt5251; local190++) {
				for (local194 = 0; super.anInt5250 > local194; local194++) {
					if (this.anIntArrayArrayArray99[local190][local194] != null) {
						@Pc(210) Class1_Sub26[] local210 = this.aClass1_Sub26ArrayArrayArray1[local190][local194];
						@Pc(217) int[] local217 = this.anIntArrayArrayArray96[local190][local194];
						@Pc(224) int[] local224 = this.anIntArrayArrayArray100[local190][local194];
						@Pc(231) int[] local231 = this.anIntArrayArrayArray95[local190][local194];
						@Pc(238) int[] local238 = this.anIntArrayArrayArray99[local190][local194];
						@Pc(250) int[] local250 = this.anIntArrayArrayArray97 == null ? null : this.anIntArrayArrayArray97[local190][local194];
						if (local231 == null) {
							local231 = local238;
						}
						@Pc(266) int[] local266 = this.anIntArrayArrayArray98 == null ? null : this.anIntArrayArrayArray98[local190][local194];
						@Pc(273) float local273 = this.aFloatArrayArray4[local190][local194];
						@Pc(280) float local280 = this.aFloatArrayArray5[local190][local194];
						@Pc(287) float local287 = this.aFloatArrayArray3[local190][local194];
						@Pc(296) float local296 = this.aFloatArrayArray4[local190][local194 + 1];
						@Pc(305) float local305 = this.aFloatArrayArray5[local190][local194 + 1];
						@Pc(314) float local314 = this.aFloatArrayArray3[local190][local194 + 1];
						@Pc(325) float local325 = this.aFloatArrayArray4[local190 + 1][local194 + 1];
						@Pc(336) float local336 = this.aFloatArrayArray5[local190 + 1][local194 + 1];
						@Pc(347) float local347 = this.aFloatArrayArray3[local190 + 1][local194 + 1];
						@Pc(356) float local356 = this.aFloatArrayArray4[local190 + 1][local194];
						@Pc(365) float local365 = this.aFloatArrayArray5[local190 + 1][local194];
						@Pc(374) float local374 = this.aFloatArrayArray3[local190 + 1][local194];
						@Pc(382) int local382 = local14[local190][local194] & 0xFF;
						@Pc(392) int local392 = local14[local190][local194 + 1] & 0xFF;
						@Pc(404) int local404 = local14[local190 + 1][local194 + 1] & 0xFF;
						@Pc(414) int local414 = local14[local190 + 1][local194] & 0xFF;
						@Pc(416) int local416 = 0;
						@Pc(426) int local426;
						label337: for (@Pc(418) int local418 = 0; local418 < local238.length; local418++) {
							@Pc(424) Class1_Sub26 local424 = local210[local418];
							for (local426 = 0; local426 < local416; local426++) {
								if (local424 == local188[local426]) {
									continue label337;
								}
							}
							local188[local416++] = local424;
						}
						@Pc(463) short[] local463 = this.aShortArrayArray6[local190 + super.anInt5251 * local194] = new short[local238.length];
						for (local426 = 0; local426 < local238.length; local426++) {
							@Pc(476) int local476 = (local190 << super.anInt5253) + local217[local426];
							@Pc(486) int local486 = (local194 << super.anInt5253) + local224[local426];
							@Pc(491) int local491 = local476 >> this.anInt5279;
							@Pc(496) int local496 = local486 >> this.anInt5279;
							@Pc(500) int local500 = local238[local426];
							@Pc(504) int local504 = local231[local426];
							@Pc(512) int local512 = local250 == null ? 0 : local250[local426];
							@Pc(530) long local530 = (long) local504 << 48 | (long) local500 << 32 | (long) (local491 << 16) | (long) local496;
							@Pc(534) int local534 = local217[local426];
							@Pc(538) int local538 = local224[local426];
							@Pc(540) byte local540 = 74;
							@Pc(542) int local542 = 0;
							@Pc(544) float local544 = 1.0F;
							@Pc(592) float local592;
							@Pc(590) float local590;
							@Pc(584) float local584;
							@Pc(626) float local626;
							@Pc(588) int local588;
							if (local534 == 0 && local538 == 0) {
								local588 = local540 - local382;
								local592 = local273;
								local584 = local287;
								local590 = local280;
							} else if (local534 == 0 && super.anInt5252 == local538) {
								local584 = local314;
								local592 = local296;
								local590 = local305;
								local588 = local540 - local392;
							} else if (local534 == super.anInt5252 && local538 == super.anInt5252) {
								local590 = local336;
								local584 = local347;
								local592 = local325;
								local588 = local540 - local404;
							} else if (local534 == super.anInt5252 && local538 == 0) {
								local584 = local374;
								local588 = local540 - local414;
								local590 = local365;
								local592 = local356;
							} else {
								@Pc(601) float local601 = (float) local534 / (float) super.anInt5252;
								@Pc(608) float local608 = (float) local538 / (float) super.anInt5252;
								@Pc(617) float local617 = local273 + local601 * (local356 - local273);
								local626 = local280 + (local365 - local280) * local601;
								@Pc(635) float local635 = local287 + (local374 - local287) * local601;
								@Pc(643) float local643 = local296 + (local325 - local296) * local601;
								@Pc(652) float local652 = local305 + (local336 - local305) * local601;
								local592 = local617 + local608 * (local643 - local617);
								@Pc(668) float local668 = (local347 - local314) * local601 + local314;
								local590 = local626 + (local652 - local626) * local608;
								local584 = (local668 - local635) * local608 + local635;
								@Pc(698) int local698 = local382 + (local534 * (local414 - local382) >> super.anInt5253);
								@Pc(709) int local709 = ((local404 - local392) * local534 >> super.anInt5253) + local392;
								local588 = local540 - ((local709 - local698) * local538 >> super.anInt5253) - local698;
							}
							if (local500 != -1) {
								@Pc(771) int local771 = local588 * (local500 & 0x7F) >> 7;
								if (local771 < 2) {
									local771 = 2;
								} else if (local771 > 126) {
									local771 = 126;
								}
								if ((this.anInt5268 & 0x7) == 0) {
									local544 = this.aClass121_Sub2_29.aFloatArray36[2] * local584 + local590 * this.aClass121_Sub2_29.aFloatArray36[1] + local592 * this.aClass121_Sub2_29.aFloatArray36[0];
									local544 = this.aClass121_Sub2_29.aFloat95 + (local544 > 0.0F ? this.aClass121_Sub2_29.aFloat86 : this.aClass121_Sub2_29.aFloat98) * local544;
								}
								local542 = Static302.anIntArray386[local771 | local500 & 0xFF80];
							}
							@Pc(845) Class1 local845 = null;
							if ((local476 & this.anInt5270 - 1) == 0 && (local486 & this.anInt5270 - 1) == 0) {
								local845 = local184.method930(local530);
							}
							@Pc(1207) int local1207;
							@Pc(878) int local878;
							if (local845 == null) {
								if (local500 == local504) {
									local878 = local542;
								} else {
									@Pc(888) int local888 = local588 * (local504 & 0x7F) >> 7;
									if (local888 < 2) {
										local888 = 2;
									} else if (local888 > 126) {
										local888 = 126;
									}
									local878 = Static302.anIntArray386[local888 | local504 & 0xFF80];
									if ((this.anInt5268 & 0x7) == 0) {
										local626 = this.aClass121_Sub2_29.aFloatArray36[2] * local584 + local592 * this.aClass121_Sub2_29.aFloatArray36[0] + local590 * this.aClass121_Sub2_29.aFloatArray36[1];
										local626 = this.aClass121_Sub2_29.aFloat95 + (local544 > 0.0F ? this.aClass121_Sub2_29.aFloat86 : this.aClass121_Sub2_29.aFloat98) * local544;
										@Pc(966) int local966 = local878 >> 16 & 0xFF;
										@Pc(972) int local972 = local878 >> 8 & 0xFF;
										local966 = (int) ((float) local966 * local626);
										@Pc(982) int local982 = local878 & 0xFF;
										local972 = (int) ((float) local972 * local626);
										if (local966 < 0) {
											local966 = 0;
										} else if (local966 > 255) {
											local966 = 255;
										}
										if (local972 < 0) {
											local972 = 0;
										} else if (local972 > 255) {
											local972 = 255;
										}
										local982 = (int) ((float) local982 * local626);
										if (local982 < 0) {
											local982 = 0;
										} else if (local982 > 255) {
											local982 = 255;
										}
										local878 = local972 << 8 | local966 << 16 | local982;
									}
								}
								if (this.aClass121_Sub2_29.aBoolean471) {
									local163.b((float) local476);
									local163.b((float) (local512 + this.va(local476, local486)));
									local163.b((float) local486);
									local163.b((byte) (local878 >> 16));
									local163.b((byte) (local878 >> 8));
									local163.b((byte) local878);
									local163.b(-1);
									local163.b((float) local476);
									local163.b((float) local486);
									if (this.anIntArrayArrayArray98 != null) {
										local163.b((float) (local266 == null ? 0 : local266[local426] - 1));
									}
									if ((this.anInt5268 & 0x7) != 0) {
										local163.b(local592);
										local163.b(local590);
										local163.b(local584);
									}
								} else {
									local163.a((float) local476);
									local163.a((float) (this.va(local476, local486) + local512));
									local163.a((float) local486);
									local163.b((byte) (local878 >> 16));
									local163.b((byte) (local878 >> 8));
									local163.b((byte) local878);
									local163.b(-1);
									local163.a((float) local476);
									local163.a((float) local486);
									if (this.anIntArrayArrayArray98 != null) {
										local163.a((float) (local266 == null ? 0 : local266[local426] - 1));
									}
									if ((this.anInt5268 & 0x7) != 0) {
										local163.a(local592);
										local163.a(local590);
										local163.a(local584);
									}
								}
								local1207 = this.anInt5273++;
								local463[local426] = (short) local1207;
								if (local500 != -1) {
									local167[local1207] = local210[local426];
								}
								local184.method931(new Class1_Sub31(local463[local426]), local530);
							} else {
								local463[local426] = ((Class1_Sub31) local845).aShort74;
								local1207 = local463[local426] & 0xFFFF;
								if (local500 != -1 && local167[local1207].aLong237 > local210[local426].aLong237) {
									local167[local1207] = local210[local426];
								}
							}
							for (local878 = 0; local878 < local416; local878++) {
								local188[local878].method3234(local1207, local544, local588, local542);
							}
							this.anInt5276++;
						}
					}
				}
			}
			for (local194 = 0; local194 < this.anInt5273; local194++) {
				@Pc(1318) Class1_Sub26 local1318 = local167[local194];
				if (local1318 != null) {
					local1318.method3233(local194);
				}
			}
			@Pc(1355) int local1355;
			for (@Pc(1335) int local1335 = 0; local1335 < super.anInt5251; local1335++) {
				for (@Pc(1339) int local1339 = 0; local1339 < super.anInt5250; local1339++) {
					@Pc(1351) short[] local1351 = this.aShortArrayArray6[local1335 + super.anInt5251 * local1339];
					if (local1351 != null) {
						local1355 = 0;
						@Pc(1357) int local1357 = 0;
						while (local1351.length > local1357) {
							@Pc(1366) int local1366 = local1351[local1357++] & 0xFFFF;
							@Pc(1373) int local1373 = local1351[local1357++] & 0xFFFF;
							@Pc(1380) int local1380 = local1351[local1357++] & 0xFFFF;
							@Pc(1384) Class1_Sub26 local1384 = local167[local1366];
							@Pc(1388) Class1_Sub26 local1388 = local167[local1373];
							@Pc(1392) Class1_Sub26 local1392 = local167[local1380];
							@Pc(1394) Class1_Sub26 local1394 = null;
							if (local1384 != null) {
								local1394 = local1384;
								local1384.method3237(local1335, local1355, local1339);
							}
							if (local1388 != null) {
								local1388.method3237(local1335, local1355, local1339);
								if (local1394 == null || local1388.aLong237 < local1394.aLong237) {
									local1394 = local1388;
								}
							}
							if (local1392 != null) {
								local1392.method3237(local1335, local1355, local1339);
								if (local1394 == null || local1392.aLong237 < local1394.aLong237) {
									local1394 = local1392;
								}
							}
							if (local1394 != null) {
								if (local1384 != null) {
									local1394.method3233(local1366);
								}
								if (local1388 != null) {
									local1394.method3233(local1373);
								}
								if (local1392 != null) {
									local1394.method3233(local1380);
								}
								local1394.method3237(local1335, local1355, local1339);
							}
							local1355++;
						}
					}
				}
			}
			local163.c();
			this.anInterface12_3 = this.aClass121_Sub2_29.method4662(local158, local136, local163.a());
			this.aClass267_12 = new Class267(this.anInterface12_3, 5126, 3, 0);
			this.aClass267_9 = new Class267(this.anInterface12_3, 5121, 4, 12);
			@Pc(1535) byte local1535;
			if (this.anIntArrayArrayArray98 == null) {
				local1535 = 24;
				this.aClass267_10 = new Class267(this.anInterface12_3, 5126, 2, 16);
			} else {
				local1535 = 28;
				this.aClass267_10 = new Class267(this.anInterface12_3, 5126, 3, 16);
			}
			if ((this.anInt5268 & 0x7) != 0) {
				this.aClass267_11 = new Class267(this.anInterface12_3, 5126, 3, local1535);
			}
			@Pc(1579) long[] local1579 = new long[this.aClass1_Sub26Array1.length];
			for (local1355 = 0; local1355 < this.aClass1_Sub26Array1.length; local1355++) {
				@Pc(1588) Class1_Sub26 local1588 = this.aClass1_Sub26Array1[local1355];
				local1579[local1355] = local1588.aLong237;
				local1588.method3235(this.anInt5273);
			}
			Static110.method1732(this.aClass1_Sub26Array1, local1579);
			if (this.aClass3_2 != null) {
				this.aClass3_2.method39();
			}
		} else {
			this.aClass3_2 = null;
		}
		this.aClass51_17 = null;
		this.aClass1_Sub26ArrayArrayArray1 = null;
		this.aByteArrayArray21 = null;
		this.aFloatArrayArray4 = this.aFloatArrayArray5 = this.aFloatArrayArray3 = null;
		this.anIntArrayArrayArray97 = null;
		this.anIntArrayArrayArray99 = null;
		this.anIntArrayArrayArray98 = null;
		this.anIntArrayArrayArray96 = this.anIntArrayArrayArray100 = null;
		this.anIntArrayArrayArray95 = null;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method4261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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
		this.JA(arg0, arg1, local13, local47, local18, local56, local23, local28, local33, local38, arg13, arg14, arg15, false);
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lclient!j;IIIIZ)Z")
	@Override
	public boolean method4262(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass3_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass121_Sub2_29.anInt5970 >> 8) >> this.aClass121_Sub2_29.anInt5936;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass121_Sub2_29.anInt5955 >> 8) >> this.aClass121_Sub2_29.anInt5936;
			return this.aClass3_2.method45(arg0, local39, local24);
		}
	}

	@OriginalMember(owner = "client!pp", name = "O", descriptor = "(IILclient!j;)Lclient!j;")
	@Override
	public Class1_Sub1_Sub3 O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub3 arg2) {
		if ((this.aByteArrayArray20[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(21) int local21 = super.anInt5252 >> this.aClass121_Sub2_29.anInt5936;
		@Pc(24) Class1_Sub1_Sub3_Sub1 local24 = (Class1_Sub1_Sub3_Sub1) arg2;
		@Pc(34) Class1_Sub1_Sub3_Sub1 local34;
		if (local24 != null && local24.method615(local21, local21)) {
			local34 = local24;
			local24.method614();
		} else {
			local34 = new Class1_Sub1_Sub3_Sub1(this.aClass121_Sub2_29, local21, local21);
		}
		local34.method612(0, local21, 0, local21);
		this.method4271(arg0, local34, arg1);
		return local34;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method4267(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt5281 <= 0) {
			return;
		}
		this.aClass121_Sub2_29.method4682();
		this.aClass121_Sub2_29.method4657(false);
		this.aClass121_Sub2_29.method4663(false);
		this.aClass121_Sub2_29.method4655(false);
		this.aClass121_Sub2_29.method4691(false);
		this.aClass121_Sub2_29.method4700(0);
		this.aClass121_Sub2_29.method4647(-2);
		this.aClass121_Sub2_29.method4681(null);
		Static338.aFloatArray39[11] = 0.0F;
		Static338.aFloatArray39[10] = 0.0F;
		Static338.aFloatArray39[6] = 0.0F;
		Static338.aFloatArray39[0] = (float) 1024 / ((float) super.anInt5252 * 128.0F * (float) this.aClass121_Sub2_29.anInt5911);
		Static338.aFloatArray39[2] = 0.0F;
		Static338.aFloatArray39[4] = 0.0F;
		Static338.aFloatArray39[7] = 0.0F;
		Static338.aFloatArray39[8] = 0.0F;
		Static338.aFloatArray39[14] = 0.0F;
		Static338.aFloatArray39[12] = -(((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass121_Sub2_29.anInt5911) - 1.0F;
		Static338.aFloatArray39[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass121_Sub2_29.anInt5900;
		Static338.aFloatArray39[15] = 1.0F;
		Static338.aFloatArray39[5] = (float) 1024 / ((float) this.aClass121_Sub2_29.anInt5900 * (float) super.anInt5252 * 128.0F);
		Static338.aFloatArray39[1] = 0.0F;
		Static338.aFloatArray39[9] = 0.0F;
		Static338.aFloatArray39[3] = 0.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static338.aFloatArray39, 0);
		Static338.aFloatArray39[11] = 0.0F;
		Static338.aFloatArray39[0] = 1.0F;
		Static338.aFloatArray39[7] = 0.0F;
		Static338.aFloatArray39[1] = 0.0F;
		Static338.aFloatArray39[8] = 0.0F;
		Static338.aFloatArray39[12] = 0.0F;
		Static338.aFloatArray39[13] = 0.0F;
		Static338.aFloatArray39[4] = 0.0F;
		Static338.aFloatArray39[2] = 0.0F;
		Static338.aFloatArray39[14] = 0.0F;
		Static338.aFloatArray39[15] = 1.0F;
		Static338.aFloatArray39[9] = 1.0F;
		Static338.aFloatArray39[10] = 0.0F;
		Static338.aFloatArray39[6] = 1.0F;
		Static338.aFloatArray39[3] = 0.0F;
		Static338.aFloatArray39[5] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static338.aFloatArray39, 0);
		if ((this.anInt5268 & 0x7) == 0) {
			this.aClass121_Sub2_29.method4663(false);
		} else {
			this.aClass121_Sub2_29.method4663(true);
			this.aClass121_Sub2_29.method4729();
		}
		this.aClass121_Sub2_29.method4724(this.aClass267_12, this.aClass267_11, this.aClass267_10, this.aClass267_9);
		if (Static53.aClass1_Sub14_1.aByteArray65.length < this.anInt5276 * 2) {
			Static53.aClass1_Sub14_1 = new Class1_Sub14(this.anInt5276 * 2);
		} else {
			Static53.aClass1_Sub14_1.anInt5695 = 0;
		}
		@Pc(308) int local308 = 0;
		@Pc(314) int local314;
		@Pc(323) int local323;
		@Pc(325) int local325;
		@Pc(344) short[] local344;
		@Pc(348) int local348;
		if (this.aClass121_Sub2_29.aBoolean471) {
			for (local314 = arg1; local314 < arg3; local314++) {
				local323 = super.anInt5251 * local314 + arg0;
				for (local325 = arg0; local325 < arg2; local325++) {
					if (arg4[local325 - arg0][local314 - arg1]) {
						local344 = this.aShortArrayArray6[local323];
						if (local344 != null) {
							for (local348 = 0; local348 < local344.length; local348++) {
								local308++;
								Static53.aClass1_Sub14_1.method4504(local344[local348] & 0xFFFF);
							}
						}
					}
					local323++;
				}
			}
		} else {
			for (local314 = arg1; local314 < arg3; local314++) {
				local323 = arg0 + super.anInt5251 * local314;
				for (local325 = arg0; local325 < arg2; local325++) {
					if (arg4[local325 - arg0][local314 - arg1]) {
						local344 = this.aShortArrayArray6[local323];
						if (local344 != null) {
							for (local348 = 0; local348 < local344.length; local348++) {
								local308++;
								Static53.aClass1_Sub14_1.method4493(local344[local348] & 0xFFFF);
							}
						}
					}
					local323++;
				}
			}
		}
		if (local308 > 0) {
			@Pc(456) Class28_Sub2 local456 = new Class28_Sub2(this.aClass121_Sub2_29, 5123, Static53.aClass1_Sub14_1.aByteArray65, Static53.aClass1_Sub14_1.anInt5695);
			this.aClass121_Sub2_29.method4725(local308, local456, 0);
		}
	}

	@OriginalMember(owner = "client!pp", name = "U", descriptor = "(Lclient!j;IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass3_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass121_Sub2_29.anInt5970 * arg2 >> 8) >> this.aClass121_Sub2_29.anInt5936;
			@Pc(38) int local38 = arg3 - (arg2 * this.aClass121_Sub2_29.anInt5955 >> 8) >> this.aClass121_Sub2_29.anInt5936;
			this.aClass3_2.method42(local38, arg0, local24);
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIBII[[ZZ)V")
	private void method4269(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) boolean[][] arg3, @OriginalArg(6) boolean arg4) {
		if (this.aClass1_Sub26Array1 == null) {
			return;
		}
		@Pc(8) float local8 = this.aClass121_Sub2_29.aFloat106;
		@Pc(12) float local12 = this.aClass121_Sub2_29.aFloat92;
		@Pc(19) int local19 = arg1 + arg1 + 1;
		@Pc(23) int local23 = local19 * local19;
		if (local23 > Static24.anIntArray27.length) {
			Static24.anIntArray27 = new int[local23];
		}
		if (this.anInt5276 * 2 > Static53.aClass1_Sub14_1.aByteArray65.length) {
			Static53.aClass1_Sub14_1 = new Class1_Sub14(this.anInt5276 * 2);
		}
		@Pc(51) int local51 = arg2 - arg1;
		@Pc(53) int local53 = local51;
		if (local51 < 0) {
			local51 = 0;
		}
		@Pc(64) int local64 = arg0 - arg1;
		@Pc(66) int local66 = local64;
		if (local64 < 0) {
			local64 = 0;
		}
		@Pc(77) int local77 = arg1 + arg2;
		if (super.anInt5251 - 1 < local77) {
			local77 = super.anInt5251 - 1;
		}
		@Pc(97) int local97 = arg0 + arg1;
		if (super.anInt5250 - 1 < local97) {
			local97 = super.anInt5250 - 1;
		}
		Static142.anInt2560 = 0;
		@Pc(127) int local127;
		for (@Pc(116) int local116 = local51; local116 <= local77; local116++) {
			@Pc(125) boolean[] local125 = arg3[local116 - local53];
			for (local127 = local64; local127 <= local97; local127++) {
				if (local125[local127 - local66]) {
					Static24.anIntArray27[Static142.anInt2560++] = local116 + super.anInt5251 * local127;
				}
			}
		}
		this.aClass121_Sub2_29.method4666();
		this.aClass121_Sub2_29.method4663((this.anInt5268 & 0x7) != 0);
		for (@Pc(195) int local195 = 0; local195 < this.aClass1_Sub26Array1.length; local195++) {
			this.aClass1_Sub26Array1[local195].method3238(Static142.anInt2560, Static24.anIntArray27);
		}
		if (!this.aClass142_33.method3210()) {
			local127 = this.aClass121_Sub2_29.anInt5979;
			@Pc(228) int local228 = this.aClass121_Sub2_29.anInt5945;
			this.aClass121_Sub2_29.V(0, local228, this.aClass121_Sub2_29.anInt5953);
			this.aClass121_Sub2_29.o(local12, local8 - 4.0F);
			this.aClass121_Sub2_29.method4663(false);
			this.aClass121_Sub2_29.method4691(false);
			this.aClass121_Sub2_29.method4700(128);
			this.aClass121_Sub2_29.method4647(-2);
			this.aClass121_Sub2_29.method4681(this.aClass121_Sub2_29.aClass21_Sub2_3);
			this.aClass121_Sub2_29.method4709(7681, 8448);
			this.aClass121_Sub2_29.method4692(0, 34166, 770);
			this.aClass121_Sub2_29.method4673(0, 34167);
			for (@Pc(295) Class1 local295 = this.aClass142_33.method3199(); local295 != null; local295 = this.aClass142_33.method3198()) {
				@Pc(300) Class1_Sub40 local300 = (Class1_Sub40) local295;
				local300.method5175(arg1, arg3, arg0, arg2);
			}
			this.aClass121_Sub2_29.method4692(0, 5890, 768);
			this.aClass121_Sub2_29.method4673(0, 5890);
			this.aClass121_Sub2_29.method4681(null);
			this.aClass121_Sub2_29.V(local127, local228, this.aClass121_Sub2_29.anInt5953);
		}
		if (this.aClass3_2 != null) {
			this.aClass121_Sub2_29.o(local12, local8 - 8.0F);
			this.aClass121_Sub2_29.method4666();
			this.aClass121_Sub2_29.method4724(this.aClass267_12, null, this.aClass267_10, null);
			this.aClass3_2.method43(arg2, arg3, arg1, arg4, arg0);
		}
		this.aClass121_Sub2_29.o(local12, local8);
	}

	@OriginalMember(owner = "client!pp", name = "SA", descriptor = "(Lclient!j;IIIIZ)V")
	@Override
	public void SA(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass3_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass121_Sub2_29.anInt5970 * arg2 >> 8) >> this.aClass121_Sub2_29.anInt5936;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass121_Sub2_29.anInt5955 >> 8) >> this.aClass121_Sub2_29.anInt5936;
			this.aClass3_2.method44(local39, local24, arg0);
		}
	}

	@OriginalMember(owner = "client!pp", name = "I", descriptor = "(II)I")
	@Override
	public int I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray40[arg0][arg1];
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(BILclient!cd;I)V")
	private void method4271(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub3_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray96[arg0][arg2];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray100[arg0][arg2];
		@Pc(26) int local26 = local12.length;
		if (Static218.anIntArray302.length < local26) {
			Static218.anIntArray302 = new int[local26];
			Static411.anIntArray544 = new int[local26];
		}
		for (@Pc(42) int local42 = 0; local42 < local26; local42++) {
			Static218.anIntArray302[local42] = (local12[local42] & 0xFF) >> this.aClass121_Sub2_29.anInt5936;
			Static411.anIntArray544[local42] = (local19[local42] & 0xFF) >> this.aClass121_Sub2_29.anInt5936;
		}
		@Pc(78) int local78 = 0;
		while (local26 > local78) {
			@Pc(84) int local84 = Static218.anIntArray302[local78];
			@Pc(89) int local89 = Static411.anIntArray544[local78++];
			@Pc(93) int local93 = Static218.anIntArray302[local78];
			@Pc(98) int local98 = Static411.anIntArray544[local78++];
			@Pc(102) int local102 = Static218.anIntArray302[local78];
			@Pc(107) int local107 = Static411.anIntArray544[local78++];
			if (-((local102 - local93) * (-local89 + local98)) + (local98 - local107) * (local84 - local93) > 0) {
				arg1.method609(local84, local93, local107, local89, local102, local98);
			}
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lclient!tj;[I)V")
	@Override
	public void method4265(@OriginalArg(0) Class1_Sub12 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass142_33.method3212(new Class1_Sub40(this.aClass121_Sub2_29, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!pp", name = "QA", descriptor = "(III)V")
	@Override
	public void QA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray21[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray21[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(II)V")
	@Override
	public void method4263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!pp", name = "va", descriptor = "(II)I")
	@Override
	public int va(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 >> super.anInt5253;
		@Pc(13) int local13 = arg1 >> super.anInt5253;
		if (local8 < 0 || local13 < 0 || super.anInt5251 - 1 < local8 || super.anInt5250 - 1 < local13) {
			return 0;
		}
		@Pc(41) int local41 = super.anInt5252 - 1 & arg0;
		@Pc(48) int local48 = arg1 & super.anInt5252 - 1;
		@Pc(75) int local75 = local41 * this.anIntArrayArray40[local8 + 1][local13] + this.anIntArrayArray40[local8][local13] * (super.anInt5252 - local41) >> super.anInt5253;
		@Pc(106) int local106 = this.anIntArrayArray40[local8 + 1][local13 + 1] * local41 + this.anIntArrayArray40[local8][local13 + 1] * (super.anInt5252 - local41) >> super.anInt5253;
		return (super.anInt5252 - local48) * local75 + local48 * local106 >> super.anInt5253;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method4266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method4269(arg1, arg2, arg0, arg3, arg4);
	}
}
