import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class65_Sub2 extends Class65 {

	@OriginalMember(owner = "client!ed", name = "w", descriptor = "I")
	private int anInt3157;

	@OriginalMember(owner = "client!ed", name = "C", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!ed", name = "H", descriptor = "I")
	private int anInt3165;

	@OriginalMember(owner = "client!ed", name = "Y", descriptor = "Lclient!nh;")
	private Class223 aClass223_1;

	@OriginalMember(owner = "client!ed", name = "Z", descriptor = "Lclient!nh;")
	public Class223 aClass223_2;

	@OriginalMember(owner = "client!ed", name = "ab", descriptor = "Lclient!nh;")
	public Class223 aClass223_3;

	@OriginalMember(owner = "client!ed", name = "bb", descriptor = "Lclient!nh;")
	public Class223 aClass223_4;

	@OriginalMember(owner = "client!ed", name = "db", descriptor = "Lclient!hca;")
	private Interface11 anInterface11_1;

	@OriginalMember(owner = "client!ed", name = "eb", descriptor = "I")
	private int anInt3174;

	@OriginalMember(owner = "client!ed", name = "gb", descriptor = "[Lclient!jn;")
	private Class2_Sub30[] aClass2_Sub30Array1;

	@OriginalMember(owner = "client!ed", name = "ib", descriptor = "I")
	private int anInt3175;

	@OriginalMember(owner = "client!ed", name = "G", descriptor = "Lclient!uh;")
	private final Class341 aClass341_31 = new Class341();

	@OriginalMember(owner = "client!ed", name = "W", descriptor = "Lclient!qo;")
	public final Class20_Sub3 aClass20_Sub3_12;

	@OriginalMember(owner = "client!ed", name = "O", descriptor = "I")
	private final int anInt3171;

	@OriginalMember(owner = "client!ed", name = "v", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!ed", name = "q", descriptor = "[[B")
	private final byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!ed", name = "S", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!ed", name = "D", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!ed", name = "jb", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!ed", name = "t", descriptor = "[[[Lclient!jn;")
	private Class2_Sub30[][][] aClass2_Sub30ArrayArrayArray1;

	@OriginalMember(owner = "client!ed", name = "I", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!ed", name = "fb", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!ed", name = "X", descriptor = "[[B")
	private byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!ed", name = "R", descriptor = "[[S")
	public final short[][] aShortArrayArray10;

	@OriginalMember(owner = "client!ed", name = "K", descriptor = "I")
	private final int anInt3167;

	@OriginalMember(owner = "client!ed", name = "k", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!ed", name = "hb", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
	public final int anInt3150;

	@OriginalMember(owner = "client!ed", name = "cb", descriptor = "Lclient!eq;")
	private Class99 aClass99_27;

	@OriginalMember(owner = "client!ed", name = "Q", descriptor = "Lclient!mha;")
	private Class209 aClass209_1;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lclient!qo;IIII[[I[[II)V")
	public Class65_Sub2(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass20_Sub3_12 = arg0;
		this.anInt3171 = super.anInt9616 - 2;
		this.anIntArrayArrayArray3 = new int[arg3][arg4][];
		this.aByteArrayArray8 = new byte[arg3][arg4];
		this.anIntArrayArrayArray7 = new int[arg3][arg4][];
		this.anIntArrayArrayArray5 = new int[arg3][arg4][];
		this.aFloatArrayArray4 = new float[super.anInt9615 + 1][super.anInt9618 + 1];
		this.aClass2_Sub30ArrayArrayArray1 = new Class2_Sub30[arg3][arg4][];
		this.anIntArrayArrayArray6 = new int[arg3][arg4][];
		this.aFloatArrayArray2 = new float[super.anInt9615 + 1][super.anInt9618 + 1];
		this.aByteArrayArray9 = new byte[arg3 + 1][arg4 + 1];
		this.aShortArrayArray10 = new short[arg4 * arg3][];
		this.anInt3167 = 0x1 << this.anInt3171;
		this.anIntArrayArrayArray2 = new int[arg3][arg4][];
		this.aFloatArrayArray3 = new float[super.anInt9615 + 1][super.anInt9618 + 1];
		this.anInt3150 = arg2;
		for (@Pc(115) int local115 = 1; super.anInt9618 > local115; local115++) {
			for (@Pc(119) int local119 = 1; super.anInt9615 > local119; local119++) {
				@Pc(138) int local138 = arg6[local119 + 1][local115] - arg6[local119 - 1][local115];
				@Pc(155) int local155 = arg6[local119][local115 + 1] - arg6[local119][local115 - 1];
				@Pc(174) float local174 = (float) (1.0D / Math.sqrt((double) (local155 * local155 + arg7 * arg7 * 4 + local138 * local138)));
				this.aFloatArrayArray4[local119][local115] = local174 * (float) local138;
				this.aFloatArrayArray2[local119][local115] = local174 * (float) (-arg7 * 2);
				this.aFloatArrayArray3[local119][local115] = (float) local155 * local174;
			}
		}
		this.aClass99_27 = new Class99(128);
		if ((this.anInt3150 & 0x10) != 0) {
			this.aClass209_1 = new Class209(this.aClass20_Sub3_12, this);
		}
	}

	@OriginalMember(owner = "client!ed", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class2_Sub6_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass209_1 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (this.aClass20_Sub3_12.anInt8785 * arg2 >> 8) >> this.aClass20_Sub3_12.anInt8771;
			@Pc(38) int local38 = arg3 - (arg2 * this.aClass20_Sub3_12.anInt8787 >> 8) >> this.aClass20_Sub3_12.anInt8771;
			this.aClass209_1.method5938(arg0, local23, local38);
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method7991(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!ed", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.anInt3175 <= 0) {
			this.aClass209_1 = null;
		} else {
			@Pc(22) byte[][] local22 = new byte[super.anInt9615 + 1][super.anInt9618 + 1];
			@Pc(28) int local28;
			for (@Pc(24) int local24 = 1; super.anInt9615 > local24; local24++) {
				for (local28 = 1; local28 < super.anInt9618; local28++) {
					local22[local24][local28] = (byte) ((this.aByteArrayArray9[local24][local28 + 1] >> 3) + (this.aByteArrayArray9[local24][local28 - 1] >> 2) + (this.aByteArrayArray9[local24 + 1][local28] >> 3) + (this.aByteArrayArray9[local24 - 1][local28] >> 2) + (this.aByteArrayArray9[local24][local28] >> 1));
				}
			}
			this.aClass2_Sub30Array1 = new Class2_Sub30[this.aClass99_27.method3050()];
			this.aClass99_27.method3053(this.aClass2_Sub30Array1);
			for (local28 = 0; local28 < this.aClass2_Sub30Array1.length; local28++) {
				this.aClass2_Sub30Array1[local28].method4945(this.anInt3175);
			}
			@Pc(136) int local136 = 24;
			if (this.anIntArrayArrayArray4 != null) {
				local136 += 4;
			}
			if ((this.anInt3150 & 0x7) != 0) {
				local136 += 12;
			}
			@Pc(156) NativeHeapBuffer local156 = this.aClass20_Sub3_12.aNativeHeap6.a(this.anInt3175 * local136, false);
			@Pc(161) Stream local161 = new Stream(local156);
			@Pc(165) Class2_Sub30[] local165 = new Class2_Sub30[this.anInt3175];
			@Pc(172) int local172 = Static14.method293(this.anInt3175 / 4);
			if (local172 < 1) {
				local172 = 1;
			}
			@Pc(184) Class99 local184 = new Class99(local172);
			@Pc(188) Class2_Sub30[] local188 = new Class2_Sub30[this.anInt3174];
			@Pc(194) int local194;
			for (@Pc(190) int local190 = 0; local190 < super.anInt9615; local190++) {
				for (local194 = 0; local194 < super.anInt9618; local194++) {
					if (this.anIntArrayArrayArray5[local190][local194] != null) {
						@Pc(210) Class2_Sub30[] local210 = this.aClass2_Sub30ArrayArrayArray1[local190][local194];
						@Pc(217) int[] local217 = this.anIntArrayArrayArray7[local190][local194];
						@Pc(224) int[] local224 = this.anIntArrayArrayArray2[local190][local194];
						@Pc(231) int[] local231 = this.anIntArrayArrayArray3[local190][local194];
						@Pc(238) int[] local238 = this.anIntArrayArrayArray5[local190][local194];
						@Pc(250) int[] local250 = this.anIntArrayArrayArray6 == null ? null : this.anIntArrayArrayArray6[local190][local194];
						if (local231 == null) {
							local231 = local238;
						}
						@Pc(266) int[] local266 = this.anIntArrayArrayArray4 == null ? null : this.anIntArrayArrayArray4[local190][local194];
						@Pc(273) float local273 = this.aFloatArrayArray4[local190][local194];
						@Pc(280) float local280 = this.aFloatArrayArray2[local190][local194];
						@Pc(287) float local287 = this.aFloatArrayArray3[local190][local194];
						@Pc(296) float local296 = this.aFloatArrayArray4[local190][local194 + 1];
						@Pc(305) float local305 = this.aFloatArrayArray2[local190][local194 + 1];
						@Pc(314) float local314 = this.aFloatArrayArray3[local190][local194 + 1];
						@Pc(325) float local325 = this.aFloatArrayArray4[local190 + 1][local194 + 1];
						@Pc(336) float local336 = this.aFloatArrayArray2[local190 + 1][local194 + 1];
						@Pc(347) float local347 = this.aFloatArrayArray3[local190 + 1][local194 + 1];
						@Pc(356) float local356 = this.aFloatArrayArray4[local190 + 1][local194];
						@Pc(365) float local365 = this.aFloatArrayArray2[local190 + 1][local194];
						@Pc(374) float local374 = this.aFloatArrayArray3[local190 + 1][local194];
						@Pc(382) int local382 = local22[local190][local194] & 0xFF;
						@Pc(392) int local392 = local22[local190][local194 + 1] & 0xFF;
						@Pc(404) int local404 = local22[local190 + 1][local194 + 1] & 0xFF;
						@Pc(414) int local414 = local22[local190 + 1][local194] & 0xFF;
						@Pc(416) int local416 = 0;
						@Pc(426) int local426;
						label337: for (@Pc(418) int local418 = 0; local418 < local238.length; local418++) {
							@Pc(424) Class2_Sub30 local424 = local210[local418];
							for (local426 = 0; local426 < local416; local426++) {
								if (local188[local426] == local424) {
									continue label337;
								}
							}
							local188[local416++] = local424;
						}
						@Pc(463) short[] local463 = this.aShortArrayArray10[super.anInt9615 * local194 + local190] = new short[local238.length];
						for (local426 = 0; local426 < local238.length; local426++) {
							@Pc(476) int local476 = (local190 << super.anInt9616) + local217[local426];
							@Pc(486) int local486 = (local194 << super.anInt9616) + local224[local426];
							@Pc(491) int local491 = local476 >> this.anInt3171;
							@Pc(496) int local496 = local486 >> this.anInt3171;
							@Pc(500) int local500 = local238[local426];
							@Pc(504) int local504 = local231[local426];
							@Pc(512) int local512 = local250 == null ? 0 : local250[local426];
							@Pc(530) long local530 = (long) (local491 << 16) | (long) local500 << 32 | (long) local504 << 48 | (long) local496;
							@Pc(534) int local534 = local217[local426];
							@Pc(538) int local538 = local224[local426];
							@Pc(540) byte local540 = 74;
							@Pc(542) int local542 = 0;
							@Pc(589) float local589;
							@Pc(585) float local585;
							@Pc(587) float local587;
							@Pc(626) float local626;
							@Pc(593) int local593;
							if (local534 == 0 && local538 == 0) {
								local585 = local280;
								local589 = local273;
								local593 = local540 - local382;
								local587 = local287;
							} else if (local534 == 0 && local538 == super.anInt9620) {
								local587 = local314;
								local585 = local305;
								local593 = local540 - local392;
								local589 = local296;
							} else if (super.anInt9620 == local534 && local538 == super.anInt9620) {
								local589 = local325;
								local585 = local336;
								local587 = local347;
								local593 = local540 - local404;
							} else if (super.anInt9620 == local534 && local538 == 0) {
								local585 = local365;
								local587 = local374;
								local589 = local356;
								local593 = local540 - local414;
							} else {
								@Pc(602) float local602 = (float) local534 / (float) super.anInt9620;
								@Pc(609) float local609 = (float) local538 / (float) super.anInt9620;
								@Pc(618) float local618 = (local356 - local273) * local602 + local273;
								local626 = (local365 - local280) * local602 + local280;
								@Pc(635) float local635 = local602 * (local374 - local287) + local287;
								@Pc(643) float local643 = local602 * (local325 - local296) + local296;
								@Pc(652) float local652 = local305 + (local336 - local305) * local602;
								@Pc(660) float local660 = (local347 - local314) * local602 + local314;
								local585 = local626 + (local652 - local626) * local609;
								local589 = local609 * (local643 - local618) + local618;
								local587 = local635 + (local660 - local635) * local609;
								@Pc(698) int local698 = ((local414 - local382) * local534 >> super.anInt9616) + local382;
								@Pc(710) int local710 = (local534 * (local404 - local392) >> super.anInt9616) + local392;
								local593 = local540 - local698 - ((local710 - local698) * local538 >> super.anInt9616);
							}
							@Pc(763) float local763 = 1.0F;
							if (local500 != -1) {
								@Pc(775) int local775 = (local500 & 0x7F) * local593 >> 7;
								if (local775 < 2) {
									local775 = 2;
								} else if (local775 > 126) {
									local775 = 126;
								}
								if ((this.anInt3150 & 0x7) == 0) {
									local763 = this.aClass20_Sub3_12.aFloatArray75[2] * local587 + local589 * this.aClass20_Sub3_12.aFloatArray75[0] + local585 * this.aClass20_Sub3_12.aFloatArray75[1];
									local763 = this.aClass20_Sub3_12.aFloat175 + (local763 > 0.0F ? this.aClass20_Sub3_12.aFloat185 : this.aClass20_Sub3_12.aFloat192) * local763;
								}
								local542 = Static195.anIntArray226[local500 & 0xFF80 | local775];
							}
							@Pc(849) Class2 local849 = null;
							if ((local476 & this.anInt3167 - 1) == 0 && (this.anInt3167 - 1 & local486) == 0) {
								local849 = local184.method3056(local530);
							}
							@Pc(882) int local882;
							@Pc(937) int local937;
							if (local849 == null) {
								if (local500 == local504) {
									local937 = local542;
								} else {
									@Pc(915) int local915 = (local504 & 0x7F) * local593 >> 7;
									if (local915 < 2) {
										local915 = 2;
									} else if (local915 > 126) {
										local915 = 126;
									}
									local937 = Static195.anIntArray226[local504 & 0xFF80 | local915];
									if ((this.anInt3150 & 0x7) == 0) {
										local626 = this.aClass20_Sub3_12.aFloatArray75[0] * local589 + local585 * this.aClass20_Sub3_12.aFloatArray75[1] + local587 * this.aClass20_Sub3_12.aFloatArray75[2];
										local626 = (local763 > 0.0F ? this.aClass20_Sub3_12.aFloat185 : this.aClass20_Sub3_12.aFloat192) * local763 + this.aClass20_Sub3_12.aFloat175;
										@Pc(993) int local993 = local937 >> 16 & 0xFF;
										@Pc(999) int local999 = local937 >> 8 & 0xFF;
										@Pc(1003) int local1003 = local937 & 0xFF;
										local993 = (int) ((float) local993 * local626);
										local999 = (int) ((float) local999 * local626);
										if (local993 < 0) {
											local993 = 0;
										} else if (local993 > 255) {
											local993 = 255;
										}
										if (local999 < 0) {
											local999 = 0;
										} else if (local999 > 255) {
											local999 = 255;
										}
										local1003 = (int) ((float) local1003 * local626);
										if (local1003 < 0) {
											local1003 = 0;
										} else if (local1003 > 255) {
											local1003 = 255;
										}
										local937 = local993 << 16 | local999 << 8 | local1003;
									}
								}
								if (this.aClass20_Sub3_12.aBoolean616) {
									local161.a((float) local476);
									local161.a((float) (this.method7999(local476, local486) + local512));
									local161.a((float) local486);
									local161.f((byte) (local937 >> 16));
									local161.f((byte) (local937 >> 8));
									local161.f((byte) local937);
									local161.f(-1);
									local161.a((float) local476);
									local161.a((float) local486);
									if (this.anIntArrayArrayArray4 != null) {
										local161.a((float) (local266 == null ? 0 : local266[local426] - 1));
									}
									if ((this.anInt3150 & 0x7) != 0) {
										local161.a(local589);
										local161.a(local585);
										local161.a(local587);
									}
								} else {
									local161.b((float) local476);
									local161.b((float) (this.method7999(local476, local486) + local512));
									local161.b((float) local486);
									local161.f((byte) (local937 >> 16));
									local161.f((byte) (local937 >> 8));
									local161.f((byte) local937);
									local161.f(-1);
									local161.b((float) local476);
									local161.b((float) local486);
									if (this.anIntArrayArrayArray4 != null) {
										local161.b((float) (local266 == null ? 0 : local266[local426] - 1));
									}
									if ((this.anInt3150 & 0x7) != 0) {
										local161.b(local589);
										local161.b(local585);
										local161.b(local587);
									}
								}
								local882 = this.anInt3157++;
								local463[local426] = (short) local882;
								if (local500 != -1) {
									local165[local882] = local210[local426];
								}
								local184.method3059(local530, new Class2_Sub39(local463[local426]));
							} else {
								local463[local426] = ((Class2_Sub39) local849).aShort87;
								local882 = local463[local426] & 0xFFFF;
								if (local500 != -1 && local165[local882].aLong278 > local210[local426].aLong278) {
									local165[local882] = local210[local426];
								}
							}
							for (local937 = 0; local937 < local416; local937++) {
								local188[local937].method4948(local882, local593, local542, local763);
							}
							this.anInt3165++;
						}
					}
				}
			}
			for (local194 = 0; local194 < this.anInt3157; local194++) {
				@Pc(1327) Class2_Sub30 local1327 = local165[local194];
				if (local1327 != null) {
					local1327.method4950(local194);
				}
			}
			@Pc(1360) int local1360;
			for (@Pc(1340) int local1340 = 0; local1340 < super.anInt9615; local1340++) {
				for (@Pc(1344) int local1344 = 0; local1344 < super.anInt9618; local1344++) {
					@Pc(1356) short[] local1356 = this.aShortArrayArray10[local1344 * super.anInt9615 + local1340];
					if (local1356 != null) {
						local1360 = 0;
						@Pc(1362) int local1362 = 0;
						while (local1356.length > local1362) {
							@Pc(1371) int local1371 = local1356[local1362++] & 0xFFFF;
							@Pc(1378) int local1378 = local1356[local1362++] & 0xFFFF;
							@Pc(1385) int local1385 = local1356[local1362++] & 0xFFFF;
							@Pc(1389) Class2_Sub30 local1389 = local165[local1371];
							@Pc(1393) Class2_Sub30 local1393 = local165[local1378];
							@Pc(1397) Class2_Sub30 local1397 = local165[local1385];
							@Pc(1399) Class2_Sub30 local1399 = null;
							if (local1389 != null) {
								local1389.method4944(local1340, local1344, local1360);
								local1399 = local1389;
							}
							if (local1393 != null) {
								local1393.method4944(local1340, local1344, local1360);
								if (local1399 == null || local1399.aLong278 > local1393.aLong278) {
									local1399 = local1393;
								}
							}
							if (local1397 != null) {
								local1397.method4944(local1340, local1344, local1360);
								if (local1399 == null || local1397.aLong278 < local1399.aLong278) {
									local1399 = local1397;
								}
							}
							if (local1399 != null) {
								if (local1389 != null) {
									local1399.method4950(local1371);
								}
								if (local1393 != null) {
									local1399.method4950(local1378);
								}
								if (local1397 != null) {
									local1399.method4950(local1385);
								}
								local1399.method4944(local1340, local1344, local1360);
							}
							local1360++;
						}
					}
				}
			}
			local161.a();
			this.anInterface11_1 = this.aClass20_Sub3_12.method7326(local156, local136, local161.b());
			this.aClass223_3 = new Class223(this.anInterface11_1, 5126, 3, 0);
			this.aClass223_1 = new Class223(this.anInterface11_1, 5121, 4, 12);
			@Pc(1528) byte local1528;
			if (this.anIntArrayArrayArray4 == null) {
				local1528 = 24;
				this.aClass223_4 = new Class223(this.anInterface11_1, 5126, 2, 16);
			} else {
				local1528 = 28;
				this.aClass223_4 = new Class223(this.anInterface11_1, 5126, 3, 16);
			}
			if ((this.anInt3150 & 0x7) != 0) {
				this.aClass223_2 = new Class223(this.anInterface11_1, 5126, 3, local1528);
			}
			@Pc(1572) long[] local1572 = new long[this.aClass2_Sub30Array1.length];
			for (local1360 = 0; local1360 < this.aClass2_Sub30Array1.length; local1360++) {
				@Pc(1581) Class2_Sub30 local1581 = this.aClass2_Sub30Array1[local1360];
				local1572[local1360] = local1581.aLong278;
				local1581.method4951(this.anInt3157);
			}
			Static114.method2848(this.aClass2_Sub30Array1, local1572);
			if (this.aClass209_1 != null) {
				this.aClass209_1.method5944();
			}
		}
		this.anIntArrayArrayArray6 = null;
		this.aFloatArrayArray4 = this.aFloatArrayArray2 = this.aFloatArrayArray3 = null;
		this.anIntArrayArrayArray4 = null;
		this.aClass2_Sub30ArrayArrayArray1 = null;
		this.anIntArrayArrayArray5 = null;
		this.aByteArrayArray9 = null;
		this.aClass99_27 = null;
		this.anIntArrayArrayArray3 = null;
		this.anIntArrayArrayArray7 = this.anIntArrayArrayArray2 = null;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(BIILclient!uc;)V")
	private void method2924(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub6_Sub7_Sub2 arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray7[arg0][arg1];
		@Pc(26) int[] local26 = this.anIntArrayArrayArray2[arg0][arg1];
		@Pc(29) int local29 = local12.length;
		if (this.aClass20_Sub3_12.anIntArray559.length < local29) {
			this.aClass20_Sub3_12.anIntArray561 = new int[local29];
			this.aClass20_Sub3_12.anIntArray559 = new int[local29];
		}
		@Pc(49) int[] local49 = this.aClass20_Sub3_12.anIntArray559;
		@Pc(53) int[] local53 = this.aClass20_Sub3_12.anIntArray561;
		for (@Pc(55) int local55 = 0; local55 < local29; local55++) {
			local49[local55] = local12[local55] >> this.aClass20_Sub3_12.anInt8771;
			local53[local55] = local26[local55] >> this.aClass20_Sub3_12.anInt8771;
		}
		@Pc(83) int local83 = 0;
		while (local83 < local29) {
			@Pc(89) int local89 = local49[local83];
			@Pc(94) int local94 = local53[local83++];
			@Pc(98) int local98 = local49[local83];
			@Pc(103) int local103 = local53[local83++];
			@Pc(107) int local107 = local49[local83];
			@Pc(112) int local112 = local53[local83++];
			if ((local89 - local98) * (local103 - local112) - (local107 - local98) * (local103 - local94) > 0) {
				arg2.method8455(local107, local89, local94, local98, local112, local103);
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)V")
	@Override
	public void method7992(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ed", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class2_Sub6_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass209_1 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (arg2 * this.aClass20_Sub3_12.anInt8785 >> 8) >> this.aClass20_Sub3_12.anInt8771;
			@Pc(38) int local38 = arg3 - (this.aClass20_Sub3_12.anInt8787 * arg2 >> 8) >> this.aClass20_Sub3_12.anInt8771;
			this.aClass209_1.method5946(local23, local38, arg0);
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method8002(@OriginalArg(0) Class2_Sub6_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass209_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (arg2 * this.aClass20_Sub3_12.anInt8785 >> 8) >> this.aClass20_Sub3_12.anInt8771;
			@Pc(40) int local40 = arg3 - (this.aClass20_Sub3_12.anInt8787 * arg2 >> 8) >> this.aClass20_Sub3_12.anInt8771;
			return this.aClass209_1.method5941(local25, local40, arg0);
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method7996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method2929(-1, arg2, arg4, arg0, arg5, arg3, arg1);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method8000(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt3175 <= 0) {
			return;
		}
		this.aClass20_Sub3_12.method7342();
		this.aClass20_Sub3_12.method7394(false);
		this.aClass20_Sub3_12.method7315(false);
		this.aClass20_Sub3_12.method7339(false);
		this.aClass20_Sub3_12.method7335(false);
		this.aClass20_Sub3_12.method7340(0);
		this.aClass20_Sub3_12.method7344(-2);
		this.aClass20_Sub3_12.method7358(null);
		Static298.aFloatArray55[0] = (float) 1024 / ((float) this.aClass20_Sub3_12.anInt8737 * (float) super.anInt9620 * 128.0F);
		Static298.aFloatArray55[8] = 0.0F;
		Static298.aFloatArray55[13] = 1.0F - ((float) (arg3 * 1024) / 128.0F + (float) 0) / (float) this.aClass20_Sub3_12.anInt8691;
		Static298.aFloatArray55[7] = 0.0F;
		Static298.aFloatArray55[6] = 0.0F;
		Static298.aFloatArray55[5] = (float) 1024 / ((float) this.aClass20_Sub3_12.anInt8691 * (float) super.anInt9620 * 128.0F);
		Static298.aFloatArray55[1] = 0.0F;
		Static298.aFloatArray55[4] = 0.0F;
		Static298.aFloatArray55[14] = 0.0F;
		Static298.aFloatArray55[12] = -(((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass20_Sub3_12.anInt8737) - 1.0F;
		Static298.aFloatArray55[10] = 0.0F;
		Static298.aFloatArray55[15] = 1.0F;
		Static298.aFloatArray55[3] = 0.0F;
		Static298.aFloatArray55[2] = 0.0F;
		Static298.aFloatArray55[9] = 0.0F;
		Static298.aFloatArray55[11] = 0.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static298.aFloatArray55, 0);
		Static298.aFloatArray55[12] = 0.0F;
		Static298.aFloatArray55[4] = 0.0F;
		Static298.aFloatArray55[0] = 1.0F;
		Static298.aFloatArray55[14] = 0.0F;
		Static298.aFloatArray55[6] = 1.0F;
		Static298.aFloatArray55[8] = 0.0F;
		Static298.aFloatArray55[11] = 0.0F;
		Static298.aFloatArray55[13] = 0.0F;
		Static298.aFloatArray55[7] = 0.0F;
		Static298.aFloatArray55[5] = 0.0F;
		Static298.aFloatArray55[15] = 1.0F;
		Static298.aFloatArray55[2] = 0.0F;
		Static298.aFloatArray55[3] = 0.0F;
		Static298.aFloatArray55[9] = 1.0F;
		Static298.aFloatArray55[10] = 0.0F;
		Static298.aFloatArray55[1] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static298.aFloatArray55, 0);
		if ((this.anInt3150 & 0x7) == 0) {
			this.aClass20_Sub3_12.method7315(false);
		} else {
			this.aClass20_Sub3_12.method7315(true);
			this.aClass20_Sub3_12.method7383();
		}
		this.aClass20_Sub3_12.method7381(this.aClass223_3, this.aClass223_1, this.aClass223_4, this.aClass223_2);
		if (this.anInt3165 * 2 > this.aClass20_Sub3_12.aClass2_Sub11_Sub1_1.aByteArray128.length) {
			this.aClass20_Sub3_12.aClass2_Sub11_Sub1_1 = new Class2_Sub11_Sub1(this.anInt3165 * 2);
		} else {
			this.aClass20_Sub3_12.aClass2_Sub11_Sub1_1.anInt10066 = 0;
		}
		@Pc(314) int local314 = 0;
		@Pc(318) Class2_Sub11_Sub1 local318 = this.aClass20_Sub3_12.aClass2_Sub11_Sub1_1;
		@Pc(324) int local324;
		@Pc(333) int local333;
		@Pc(335) int local335;
		@Pc(354) short[] local354;
		@Pc(358) int local358;
		if (this.aClass20_Sub3_12.aBoolean616) {
			for (local324 = arg1; local324 < arg3; local324++) {
				local333 = local324 * super.anInt9615 + arg0;
				for (local335 = arg0; local335 < arg2; local335++) {
					if (arg4[local335 - arg0][local324 - arg1]) {
						local354 = this.aShortArrayArray10[local333];
						if (local354 != null) {
							for (local358 = 0; local358 < local354.length; local358++) {
								local318.method8333(local354[local358] & 0xFFFF);
								local314++;
							}
						}
					}
					local333++;
				}
			}
		} else {
			for (local324 = arg1; local324 < arg3; local324++) {
				local333 = arg0 + local324 * super.anInt9615;
				for (local335 = arg0; local335 < arg2; local335++) {
					if (arg4[local335 - arg0][local324 - arg1]) {
						local354 = this.aShortArrayArray10[local333];
						if (local354 != null) {
							for (local358 = 0; local358 < local354.length; local358++) {
								local318.method8393(local354[local358] & 0xFFFF);
								local314++;
							}
						}
					}
					local333++;
				}
			}
		}
		if (local314 > 0) {
			@Pc(470) Class67_Sub2 local470 = new Class67_Sub2(this.aClass20_Sub3_12, 5123, local318.aByteArray128, local318.anInt10066);
			this.aClass20_Sub3_12.method7346(local314, local470, 0);
		}
	}

	@OriginalMember(owner = "client!ed", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class2_Sub6_Sub7 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub6_Sub7 arg2) {
		if ((this.aByteArrayArray8[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt9620 >> this.aClass20_Sub3_12.anInt8771;
		@Pc(27) Class2_Sub6_Sub7_Sub2 local27 = (Class2_Sub6_Sub7_Sub2) arg2;
		@Pc(43) Class2_Sub6_Sub7_Sub2 local43;
		if (local27 != null && local27.method8457(local24, local24)) {
			local43 = local27;
			local27.method8454();
		} else {
			local43 = new Class2_Sub6_Sub7_Sub2(this.aClass20_Sub3_12, local24, local24);
		}
		local43.method8453(local24, local24, 0, 0);
		this.method2924(arg0, arg1, local43);
		return local43;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method7997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method2929(arg5, arg2, arg4, arg0, arg6, arg3, arg1);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!ab;[I)V")
	@Override
	public void method7994(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass341_31.method8528(new Class2_Sub41(this.aClass20_Sub3_12, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!ed", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg3 != null && this.anIntArrayArrayArray6 == null) {
			this.anIntArrayArrayArray6 = new int[super.anInt9615][super.anInt9618][];
		}
		@Pc(21) Interface4 local21 = this.aClass20_Sub3_12.anInterface4_12;
		if (arg5 != null && this.anIntArrayArrayArray4 == null) {
			this.anIntArrayArrayArray4 = new int[super.anInt9615][super.anInt9618][];
		}
		this.anIntArrayArrayArray7[arg0][arg1] = arg2;
		this.anIntArrayArrayArray2[arg0][arg1] = arg4;
		this.anIntArrayArrayArray5[arg0][arg1] = arg6;
		this.anIntArrayArrayArray3[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray4 != null) {
			this.anIntArrayArrayArray4[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray6 != null) {
			this.anIntArrayArrayArray6[arg0][arg1] = arg3;
		}
		@Pc(92) Class2_Sub30[] local92 = this.aClass2_Sub30ArrayArrayArray1[arg0][arg1] = new Class2_Sub30[arg6.length];
		for (@Pc(94) int local94 = 0; local94 < arg6.length; local94++) {
			@Pc(100) int local100 = arg8[local94];
			@Pc(104) int local104 = arg9[local94];
			if ((this.anInt3150 & 0x20) != 0 && local100 != -1 && local21.method8048(local100).aBoolean338) {
				local100 = -1;
				local104 = 128;
			}
			@Pc(148) long local148 = (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48 | (long) (local104 << 14) | (long) local100;
			@Pc(154) Class2 local154;
			for (local154 = this.aClass99_27.method3056(local148); local154 != null; local154 = this.aClass99_27.method3052()) {
				@Pc(159) Class2_Sub30 local159 = (Class2_Sub30) local154;
				if (local100 == local159.anInt5725 && local159.aFloat151 == (float) local104 && local159.anInt5715 == arg10 && arg11 == local159.anInt5720 && arg12 == local159.anInt5716) {
					break;
				}
			}
			if (local154 == null) {
				local92[local94] = new Class2_Sub30(this, local100, local104, arg10, arg11, arg12);
				this.aClass99_27.method3059(local148, local92[local94]);
			} else {
				local92[local94] = (Class2_Sub30) local154;
			}
		}
		if (arg13) {
			this.aByteArrayArray8[arg0][arg1] = (byte) (this.aByteArrayArray8[arg0][arg1] | 0x1);
		}
		if (this.anInt3174 < arg6.length) {
			this.anInt3174 = arg6.length;
		}
		this.anInt3175 += arg6.length;
	}

	@OriginalMember(owner = "client!ed", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray9[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray9[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIZIII[[ZI)V")
	private void method2929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean[][] arg5, @OriginalArg(7) int arg6) {
		if (this.aClass2_Sub30Array1 == null) {
			return;
		}
		@Pc(20) int local20 = arg1 + arg1 + 1;
		@Pc(24) int local24 = local20 * local20;
		if (this.aClass20_Sub3_12.anIntArray560.length < local24) {
			this.aClass20_Sub3_12.anIntArray560 = new int[local24];
		}
		if (this.aClass20_Sub3_12.aClass2_Sub11_Sub1_1.aByteArray128.length < this.anInt3165 * 2) {
			this.aClass20_Sub3_12.aClass2_Sub11_Sub1_1 = new Class2_Sub11_Sub1(this.anInt3165 * 2);
		}
		@Pc(64) int local64 = arg3 - arg1;
		@Pc(66) int local66 = local64;
		if (local64 < 0) {
			local64 = 0;
		}
		@Pc(74) int local74 = arg6 - arg1;
		@Pc(76) int local76 = local74;
		if (local74 < 0) {
			local74 = 0;
		}
		@Pc(87) int local87 = arg1 + arg3;
		if (local87 > super.anInt9615 - 1) {
			local87 = super.anInt9615 - 1;
		}
		@Pc(102) int local102 = arg6 + arg1;
		if (local102 > super.anInt9618 - 1) {
			local102 = super.anInt9618 - 1;
		}
		@Pc(119) int local119 = 0;
		@Pc(123) int[] local123 = this.aClass20_Sub3_12.anIntArray560;
		@Pc(136) int local136;
		for (@Pc(125) int local125 = local64; local125 <= local87; local125++) {
			@Pc(134) boolean[] local134 = arg5[local125 - local66];
			for (local136 = local74; local136 <= local102; local136++) {
				if (local134[local136 - local76]) {
					local123[local119++] = local125 + local136 * super.anInt9615;
				}
			}
		}
		if (arg0 == -1) {
			this.aClass20_Sub3_12.method7371();
		} else {
			this.aClass20_Sub3_12.method7376((float) arg0);
			this.aClass20_Sub3_12.method7347();
		}
		this.aClass20_Sub3_12.method7315((this.anInt3150 & 0x7) != 0);
		for (@Pc(207) int local207 = 0; local207 < this.aClass2_Sub30Array1.length; local207++) {
			this.aClass2_Sub30Array1[local207].method4947(local119, local123);
		}
		if (!this.aClass341_31.method8531()) {
			local136 = this.aClass20_Sub3_12.anInt8810;
			@Pc(236) int local236 = this.aClass20_Sub3_12.anInt8788;
			this.aClass20_Sub3_12.L(0, local236, this.aClass20_Sub3_12.anInt8802);
			this.aClass20_Sub3_12.method7315(false);
			this.aClass20_Sub3_12.method7335(false);
			this.aClass20_Sub3_12.method7340(128);
			this.aClass20_Sub3_12.method7344(-2);
			this.aClass20_Sub3_12.method7358(this.aClass20_Sub3_12.aClass85_Sub1_3);
			this.aClass20_Sub3_12.method7316(8448, 7681);
			this.aClass20_Sub3_12.method7349(34166, 770, 0);
			this.aClass20_Sub3_12.method7362(0, 34167);
			for (@Pc(296) Class2 local296 = this.aClass341_31.method8524(); local296 != null; local296 = this.aClass341_31.method8519()) {
				@Pc(301) Class2_Sub41 local301 = (Class2_Sub41) local296;
				local301.method7459(arg5, arg3, arg6, arg1);
			}
			this.aClass20_Sub3_12.method7349(5890, 768, 0);
			this.aClass20_Sub3_12.method7362(0, 5890);
			this.aClass20_Sub3_12.method7358(null);
			this.aClass20_Sub3_12.L(local136, local236, this.aClass20_Sub3_12.anInt8802);
		}
		if (this.aClass209_1 == null) {
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		this.aClass20_Sub3_12.method7381(this.aClass223_3, null, this.aClass223_4, null);
		this.aClass209_1.method5943(arg2, arg5, arg1, arg6, arg3);
		OpenGL.glPopMatrix();
		return;
	}
}
