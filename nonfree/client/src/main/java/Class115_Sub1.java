import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fw")
public final class Class115_Sub1 extends Class115 {

	@OriginalMember(owner = "client!fw", name = "t", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!fw", name = "z", descriptor = "I")
	private int anInt3297;

	@OriginalMember(owner = "client!fw", name = "L", descriptor = "I")
	private int anInt3307;

	@OriginalMember(owner = "client!fw", name = "Y", descriptor = "[Lclient!dd;")
	private Class4_Sub9[] aClass4_Sub9Array1;

	@OriginalMember(owner = "client!fw", name = "ab", descriptor = "Lclient!mba;")
	public Class209 aClass209_7;

	@OriginalMember(owner = "client!fw", name = "bb", descriptor = "I")
	private int anInt3313;

	@OriginalMember(owner = "client!fw", name = "db", descriptor = "Lclient!mba;")
	private Class209 aClass209_8;

	@OriginalMember(owner = "client!fw", name = "gb", descriptor = "I")
	private int anInt3314;

	@OriginalMember(owner = "client!fw", name = "hb", descriptor = "Lclient!mba;")
	public Class209 aClass209_9;

	@OriginalMember(owner = "client!fw", name = "jb", descriptor = "Lclient!mba;")
	public Class209 aClass209_10;

	@OriginalMember(owner = "client!fw", name = "kb", descriptor = "Lclient!nu;")
	private Interface16 anInterface16_3;

	@OriginalMember(owner = "client!fw", name = "o", descriptor = "Lclient!au;")
	private final Class22 aClass22_19 = new Class22();

	@OriginalMember(owner = "client!fw", name = "v", descriptor = "Lclient!kfa;")
	public final Class7_Sub2 aClass7_Sub2_18;

	@OriginalMember(owner = "client!fw", name = "P", descriptor = "I")
	private final int anInt3309;

	@OriginalMember(owner = "client!fw", name = "w", descriptor = "[[B")
	private final byte[][] aByteArrayArray13;

	@OriginalMember(owner = "client!fw", name = "u", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!fw", name = "O", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!fw", name = "fb", descriptor = "[[B")
	private byte[][] aByteArrayArray14;

	@OriginalMember(owner = "client!fw", name = "p", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!fw", name = "lb", descriptor = "[[F")
	private float[][] lb;

	@OriginalMember(owner = "client!fw", name = "S", descriptor = "I")
	private final int anInt3310;

	@OriginalMember(owner = "client!fw", name = "n", descriptor = "[[[Lclient!dd;")
	private Class4_Sub9[][][] aClass4_Sub9ArrayArrayArray1;

	@OriginalMember(owner = "client!fw", name = "Q", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!fw", name = "R", descriptor = "[[S")
	public final short[][] aShortArrayArray10;

	@OriginalMember(owner = "client!fw", name = "ib", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!fw", name = "D", descriptor = "I")
	public final int anInt3301;

	@OriginalMember(owner = "client!fw", name = "cb", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!fw", name = "M", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!fw", name = "eb", descriptor = "Lclient!mo;")
	private Class221 aClass221_8;

	@OriginalMember(owner = "client!fw", name = "E", descriptor = "Lclient!oi;")
	private Class248 aClass248_2;

	@OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(Lclient!kfa;IIII[[I[[II)V")
	public Class115_Sub1(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass7_Sub2_18 = arg0;
		this.anInt3309 = super.anInt10331 - 2;
		this.aByteArrayArray13 = new byte[arg3][arg4];
		this.anIntArrayArrayArray9 = new int[arg3][arg4][];
		this.anIntArrayArrayArray11 = new int[arg3][arg4][];
		this.aByteArrayArray14 = new byte[arg3 + 1][arg4 + 1];
		this.anIntArrayArrayArray7 = new int[arg3][arg4][];
		this.lb = new float[super.anInt10330 + 1][super.anInt10327 + 1];
		this.anInt3310 = 0x1 << this.anInt3309;
		this.aClass4_Sub9ArrayArrayArray1 = new Class4_Sub9[arg3][arg4][];
		this.anIntArrayArrayArray12 = new int[arg3][arg4][];
		this.aShortArrayArray10 = new short[arg4 * arg3][];
		this.aFloatArrayArray6 = new float[super.anInt10330 + 1][super.anInt10327 + 1];
		this.anInt3301 = arg2;
		this.aFloatArrayArray5 = new float[super.anInt10330 + 1][super.anInt10327 + 1];
		this.anIntArrayArrayArray10 = new int[arg3][arg4][];
		for (@Pc(115) int local115 = 1; local115 < super.anInt10327; local115++) {
			for (@Pc(119) int local119 = 1; local119 < super.anInt10330; local119++) {
				@Pc(138) int local138 = arg6[local119 + 1][local115] - arg6[local119 - 1][local115];
				@Pc(154) int local154 = arg6[local119][local115 + 1] - arg6[local119][local115 - 1];
				@Pc(173) float local173 = (float) (1.0D / Math.sqrt((double) (arg7 * 4 * arg7 + local138 * local138 + local154 * local154)));
				this.lb[local119][local115] = local173 * (float) local138;
				this.aFloatArrayArray5[local119][local115] = (float) (-arg7 * 2) * local173;
				this.aFloatArrayArray6[local119][local115] = (float) local154 * local173;
			}
		}
		this.aClass221_8 = new Class221(128);
		if ((this.anInt3301 & 0x10) != 0) {
			this.aClass248_2 = new Class248(this.aClass7_Sub2_18, this);
		}
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method8058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!fw", name = "BA", descriptor = "()V")
	@Override
	public void BA() {
		if (this.anInt3314 <= 0) {
			this.aClass248_2 = null;
		} else {
			@Pc(19) byte[][] local19 = new byte[super.anInt10330 + 1][super.anInt10327 + 1];
			@Pc(25) int local25;
			for (@Pc(21) int local21 = 1; local21 < super.anInt10330; local21++) {
				for (local25 = 1; super.anInt10327 > local25; local25++) {
					local19[local21][local25] = (byte) ((this.aByteArrayArray14[local21 + 1][local25] >> 3) + (this.aByteArrayArray14[local21 - 1][local25] >> 2) + (this.aByteArrayArray14[local21][local25 + -1] >> 2) + (this.aByteArrayArray14[local21][local25 + 1] >> 3) + (this.aByteArrayArray14[local21][local25] >> 1));
				}
			}
			this.aClass4_Sub9Array1 = new Class4_Sub9[this.aClass221_8.method5070()];
			this.aClass221_8.method5074(this.aClass4_Sub9Array1);
			for (local25 = 0; local25 < this.aClass4_Sub9Array1.length; local25++) {
				this.aClass4_Sub9Array1[local25].method1803(this.anInt3314);
			}
			@Pc(137) int local137 = 24;
			if (this.anIntArrayArrayArray8 != null) {
				local137 += 4;
			}
			if ((this.anInt3301 & 0x7) != 0) {
				local137 += 12;
			}
			@Pc(160) NativeHeapBuffer local160 = this.aClass7_Sub2_18.aNativeHeap4.a(this.anInt3314 * local137, false);
			@Pc(165) Stream local165 = new Stream(local160);
			@Pc(169) Class4_Sub9[] local169 = new Class4_Sub9[this.anInt3314];
			@Pc(176) int local176 = Static205.method3349(this.anInt3314 / 4);
			if (local176 < 1) {
				local176 = 1;
			}
			@Pc(186) Class221 local186 = new Class221(local176);
			@Pc(190) Class4_Sub9[] local190 = new Class4_Sub9[this.anInt3313];
			@Pc(196) int local196;
			for (@Pc(192) int local192 = 0; super.anInt10330 > local192; local192++) {
				for (local196 = 0; local196 < super.anInt10327; local196++) {
					if (this.anIntArrayArrayArray9[local192][local196] != null) {
						@Pc(212) Class4_Sub9[] local212 = this.aClass4_Sub9ArrayArrayArray1[local192][local196];
						@Pc(219) int[] local219 = this.anIntArrayArrayArray7[local192][local196];
						@Pc(226) int[] local226 = this.anIntArrayArrayArray11[local192][local196];
						@Pc(233) int[] local233 = this.anIntArrayArrayArray12[local192][local196];
						@Pc(240) int[] local240 = this.anIntArrayArrayArray9[local192][local196];
						@Pc(252) int[] local252 = this.anIntArrayArrayArray10 == null ? null : this.anIntArrayArrayArray10[local192][local196];
						if (local233 == null) {
							local233 = local240;
						}
						@Pc(268) int[] local268 = this.anIntArrayArrayArray8 == null ? null : this.anIntArrayArrayArray8[local192][local196];
						@Pc(275) float local275 = this.lb[local192][local196];
						@Pc(282) float local282 = this.aFloatArrayArray5[local192][local196];
						@Pc(289) float local289 = this.aFloatArrayArray6[local192][local196];
						@Pc(298) float local298 = this.lb[local192][local196 + 1];
						@Pc(307) float local307 = this.aFloatArrayArray5[local192][local196 + 1];
						@Pc(316) float local316 = this.aFloatArrayArray6[local192][local196 + 1];
						@Pc(327) float local327 = this.lb[local192 + 1][local196 + 1];
						@Pc(338) float local338 = this.aFloatArrayArray5[local192 + 1][local196 + 1];
						@Pc(349) float local349 = this.aFloatArrayArray6[local192 + 1][local196 + 1];
						@Pc(358) float local358 = this.lb[local192 + 1][local196];
						@Pc(367) float local367 = this.aFloatArrayArray5[local192 + 1][local196];
						@Pc(376) float local376 = this.aFloatArrayArray6[local192 + 1][local196];
						@Pc(384) int local384 = local19[local192][local196] & 0xFF;
						@Pc(394) int local394 = local19[local192][local196 + 1] & 0xFF;
						@Pc(406) int local406 = local19[local192 + 1][local196 + 1] & 0xFF;
						@Pc(416) int local416 = local19[local192 + 1][local196] & 0xFF;
						@Pc(418) int local418 = 0;
						@Pc(428) int local428;
						label337: for (@Pc(420) int local420 = 0; local420 < local240.length; local420++) {
							@Pc(426) Class4_Sub9 local426 = local212[local420];
							for (local428 = 0; local428 < local418; local428++) {
								if (local190[local428] == local426) {
									continue label337;
								}
							}
							local190[local418++] = local426;
						}
						@Pc(469) short[] local469 = this.aShortArrayArray10[super.anInt10330 * local196 + local192] = new short[local240.length];
						for (local428 = 0; local428 < local240.length; local428++) {
							@Pc(482) int local482 = (local192 << super.anInt10331) + local219[local428];
							@Pc(491) int local491 = (local196 << super.anInt10331) + local226[local428];
							@Pc(496) int local496 = local482 >> this.anInt3309;
							@Pc(501) int local501 = local491 >> this.anInt3309;
							@Pc(505) int local505 = local240[local428];
							@Pc(509) int local509 = local233[local428];
							@Pc(517) int local517 = local252 == null ? 0 : local252[local428];
							@Pc(535) long local535 = (long) (local496 << 16) | (long) local509 << 48 | (long) local505 << 32 | (long) local501;
							@Pc(539) int local539 = local219[local428];
							@Pc(543) int local543 = local226[local428];
							@Pc(545) byte local545 = 74;
							@Pc(547) int local547 = 0;
							@Pc(565) float local565;
							@Pc(569) float local569;
							@Pc(567) float local567;
							@Pc(628) float local628;
							@Pc(573) int local573;
							if (local539 == 0 && local543 == 0) {
								local569 = local282;
								local573 = local545 - local384;
								local565 = local275;
								local567 = local289;
							} else if (local539 == 0 && super.anInt10333 == local543) {
								local565 = local298;
								local567 = local316;
								local569 = local307;
								local573 = local545 - local394;
							} else if (super.anInt10333 == local539 && local543 == super.anInt10333) {
								local567 = local349;
								local573 = local545 - local406;
								local569 = local338;
								local565 = local327;
							} else if (super.anInt10333 == local539 && local543 == 0) {
								local567 = local376;
								local565 = local358;
								local569 = local367;
								local573 = local545 - local416;
							} else {
								@Pc(604) float local604 = (float) local539 / (float) super.anInt10333;
								@Pc(611) float local611 = (float) local543 / (float) super.anInt10333;
								@Pc(619) float local619 = local275 + (local358 - local275) * local604;
								local628 = local604 * (local367 - local282) + local282;
								@Pc(636) float local636 = local289 + (local376 - local289) * local604;
								@Pc(644) float local644 = (local327 - local298) * local604 + local298;
								@Pc(653) float local653 = local307 + (local338 - local307) * local604;
								local569 = (local653 - local628) * local611 + local628;
								@Pc(669) float local669 = local316 + (local349 - local316) * local604;
								local565 = local619 + local611 * (local644 - local619);
								local567 = (local669 - local636) * local611 + local636;
								@Pc(697) int local697 = ((local416 - local384) * local539 >> super.anInt10331) + local384;
								@Pc(708) int local708 = (local539 * (local406 - local394) >> super.anInt10331) + local394;
								local573 = local545 - local697 - ((local708 - local697) * local543 >> super.anInt10331);
							}
							@Pc(760) float local760 = 1.0F;
							if (local505 != -1) {
								@Pc(772) int local772 = local573 * (local505 & 0x7F) >> 7;
								if (local772 < 2) {
									local772 = 2;
								} else if (local772 > 126) {
									local772 = 126;
								}
								if ((this.anInt3301 & 0x7) == 0) {
									local760 = this.aClass7_Sub2_18.aFloatArray43[0] * local565 + local569 * this.aClass7_Sub2_18.aFloatArray43[1] + this.aClass7_Sub2_18.aFloatArray43[2] * local567;
									local760 = local760 * (local760 > 0.0F ? this.aClass7_Sub2_18.aFloat144 : this.aClass7_Sub2_18.aFloat142) + this.aClass7_Sub2_18.aFloat127;
								}
								local547 = Static394.anIntArray413[local772 | local505 & 0xFF80];
							}
							@Pc(844) Class4 local844 = null;
							if ((local482 & this.anInt3310 - 1) == 0 && (this.anInt3310 - 1 & local491) == 0) {
								local844 = local186.method5075(local535);
							}
							@Pc(880) int local880;
							@Pc(915) int local915;
							if (local844 == null) {
								if (local505 == local509) {
									local915 = local547;
								} else {
									@Pc(925) int local925 = local573 * (local509 & 0x7F) >> 7;
									if (local925 < 2) {
										local925 = 2;
									} else if (local925 > 126) {
										local925 = 126;
									}
									local915 = Static394.anIntArray413[local509 & 0xFF80 | local925];
									if ((this.anInt3301 & 0x7) == 0) {
										local628 = local567 * this.aClass7_Sub2_18.aFloatArray43[2] + local565 * this.aClass7_Sub2_18.aFloatArray43[0] + local569 * this.aClass7_Sub2_18.aFloatArray43[1];
										local628 = local760 * (local760 > 0.0F ? this.aClass7_Sub2_18.aFloat144 : this.aClass7_Sub2_18.aFloat142) + this.aClass7_Sub2_18.aFloat127;
										@Pc(1000) int local1000 = local915 >> 16 & 0xFF;
										@Pc(1006) int local1006 = local915 >> 8 & 0xFF;
										@Pc(1010) int local1010 = local915 & 0xFF;
										local1000 = (int) ((float) local1000 * local628);
										if (local1000 < 0) {
											local1000 = 0;
										} else if (local1000 > 255) {
											local1000 = 255;
										}
										local1006 = (int) ((float) local1006 * local628);
										local1010 = (int) ((float) local1010 * local628);
										if (local1006 < 0) {
											local1006 = 0;
										} else if (local1006 > 255) {
											local1006 = 255;
										}
										if (local1010 < 0) {
											local1010 = 0;
										} else if (local1010 > 255) {
											local1010 = 255;
										}
										local915 = local1010 | local1006 << 8 | local1000 << 16;
									}
								}
								if (this.aClass7_Sub2_18.aBoolean388) {
									local165.b((float) local482);
									local165.b((float) (this.method8064(local482, local491) + local517));
									local165.b((float) local491);
									local165.a((byte) (local915 >> 16));
									local165.a((byte) (local915 >> 8));
									local165.a((byte) local915);
									local165.a(-1);
									local165.b((float) local482);
									local165.b((float) local491);
									if (this.anIntArrayArrayArray8 != null) {
										local165.b((float) (local268 == null ? 0 : local268[local428] - 1));
									}
									if ((this.anInt3301 & 0x7) != 0) {
										local165.b(local565);
										local165.b(local569);
										local165.b(local567);
									}
								} else {
									local165.a((float) local482);
									local165.a((float) (local517 + this.method8064(local482, local491)));
									local165.a((float) local491);
									local165.a((byte) (local915 >> 16));
									local165.a((byte) (local915 >> 8));
									local165.a((byte) local915);
									local165.a(-1);
									local165.a((float) local482);
									local165.a((float) local491);
									if (this.anIntArrayArrayArray8 != null) {
										local165.a((float) (local268 == null ? 0 : local268[local428] - 1));
									}
									if ((this.anInt3301 & 0x7) != 0) {
										local165.a(local565);
										local165.a(local569);
										local165.a(local567);
									}
								}
								local880 = this.anInt3297++;
								local469[local428] = (short) local880;
								if (local505 != -1) {
									local169[local880] = local212[local428];
								}
								local186.method5073(new Class4_Sub49(local469[local428]), local535);
							} else {
								local469[local428] = ((Class4_Sub49) local844).aShort123;
								local880 = local469[local428] & 0xFFFF;
								if (local505 != -1 && local212[local428].aLong295 < local169[local880].aLong295) {
									local169[local880] = local212[local428];
								}
							}
							for (local915 = 0; local915 < local418; local915++) {
								local190[local915].method1810(local547, local880, local760, local573);
							}
							this.anInt3307++;
						}
					}
				}
			}
			for (local196 = 0; local196 < this.anInt3297; local196++) {
				@Pc(1311) Class4_Sub9 local1311 = local169[local196];
				if (local1311 != null) {
					local1311.method1811(local196);
				}
			}
			@Pc(1348) int local1348;
			for (@Pc(1328) int local1328 = 0; local1328 < super.anInt10330; local1328++) {
				for (@Pc(1332) int local1332 = 0; local1332 < super.anInt10327; local1332++) {
					@Pc(1344) short[] local1344 = this.aShortArrayArray10[super.anInt10330 * local1332 + local1328];
					if (local1344 != null) {
						local1348 = 0;
						@Pc(1350) int local1350 = 0;
						while (local1350 < local1344.length) {
							@Pc(1359) int local1359 = local1344[local1350++] & 0xFFFF;
							@Pc(1366) int local1366 = local1344[local1350++] & 0xFFFF;
							@Pc(1373) int local1373 = local1344[local1350++] & 0xFFFF;
							@Pc(1377) Class4_Sub9 local1377 = local169[local1359];
							@Pc(1381) Class4_Sub9 local1381 = local169[local1366];
							@Pc(1385) Class4_Sub9 local1385 = local169[local1373];
							@Pc(1387) Class4_Sub9 local1387 = null;
							if (local1377 != null) {
								local1387 = local1377;
								local1377.method1807(local1332, local1348, local1328);
							}
							if (local1381 != null) {
								local1381.method1807(local1332, local1348, local1328);
								if (local1387 == null || local1387.aLong295 > local1381.aLong295) {
									local1387 = local1381;
								}
							}
							if (local1385 != null) {
								local1385.method1807(local1332, local1348, local1328);
								if (local1387 == null || local1387.aLong295 > local1385.aLong295) {
									local1387 = local1385;
								}
							}
							if (local1387 != null) {
								if (local1377 != null) {
									local1387.method1811(local1359);
								}
								if (local1381 != null) {
									local1387.method1811(local1366);
								}
								if (local1385 != null) {
									local1387.method1811(local1373);
								}
								local1387.method1807(local1332, local1348, local1328);
							}
							local1348++;
						}
					}
				}
			}
			local165.a();
			this.anInterface16_3 = this.aClass7_Sub2_18.method4312(local137, local165.b(), local160);
			this.aClass209_7 = new Class209(this.anInterface16_3, 5126, 3, 0);
			this.aClass209_8 = new Class209(this.anInterface16_3, 5121, 4, 12);
			@Pc(1520) byte local1520;
			if (this.anIntArrayArrayArray8 == null) {
				local1520 = 24;
				this.aClass209_10 = new Class209(this.anInterface16_3, 5126, 2, 16);
			} else {
				local1520 = 28;
				this.aClass209_10 = new Class209(this.anInterface16_3, 5126, 3, 16);
			}
			if ((this.anInt3301 & 0x7) != 0) {
				this.aClass209_9 = new Class209(this.anInterface16_3, 5126, 3, local1520);
			}
			@Pc(1567) long[] local1567 = new long[this.aClass4_Sub9Array1.length];
			for (local1348 = 0; local1348 < this.aClass4_Sub9Array1.length; local1348++) {
				@Pc(1576) Class4_Sub9 local1576 = this.aClass4_Sub9Array1[local1348];
				local1567[local1348] = local1576.aLong295;
				local1576.method1805(this.anInt3297);
			}
			Static417.method4089(this.aClass4_Sub9Array1, local1567);
			if (this.aClass248_2 != null) {
				this.aClass248_2.method5880();
			}
		}
		this.aClass4_Sub9ArrayArrayArray1 = null;
		this.aByteArrayArray14 = null;
		this.lb = this.aFloatArrayArray5 = this.aFloatArrayArray6 = null;
		this.anIntArrayArrayArray9 = null;
		this.anIntArrayArrayArray12 = null;
		this.anIntArrayArrayArray7 = this.anIntArrayArrayArray11 = null;
		this.anIntArrayArrayArray8 = null;
		this.anIntArrayArrayArray10 = null;
		this.aClass221_8 = null;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method8053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method2650(arg0, arg4, arg3, arg1, arg2, -1);
	}

	@OriginalMember(owner = "client!fw", name = "E", descriptor = "(Lclient!ha;IIIIZ)V")
	@Override
	public void E(@OriginalArg(0) Class4_Sub6_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass248_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass7_Sub2_18.anInt5636 * arg2 >> 8) >> this.aClass7_Sub2_18.anInt5598;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass7_Sub2_18.anInt5640 >> 8) >> this.aClass7_Sub2_18.anInt5598;
			this.aClass248_2.method5883(local39, arg0, local24);
		}
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(IZ[[ZIIIZ)V")
	private void method2650(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aClass4_Sub9Array1 == null) {
			return;
		}
		@Pc(18) int local18 = arg4 + arg4 + 1;
		@Pc(22) int local22 = local18 * local18;
		if (local22 > this.aClass7_Sub2_18.anIntArray295.length) {
			this.aClass7_Sub2_18.anIntArray295 = new int[local22];
		}
		if (this.anInt3307 * 2 > this.aClass7_Sub2_18.aClass4_Sub13_Sub1_3.aByteArray88.length) {
			this.aClass7_Sub2_18.aClass4_Sub13_Sub1_3 = new Class4_Sub13_Sub1(this.anInt3307 * 2);
		}
		@Pc(62) int local62 = arg0 - arg4;
		@Pc(64) int local64 = local62;
		if (local62 < 0) {
			local62 = 0;
		}
		@Pc(73) int local73 = arg3 - arg4;
		@Pc(75) int local75 = local73;
		if (local73 < 0) {
			local73 = 0;
		}
		@Pc(86) int local86 = arg4 + arg0;
		if (super.anInt10330 - 1 < local86) {
			local86 = super.anInt10330 - 1;
		}
		@Pc(106) int local106 = arg3 + arg4;
		if (super.anInt10327 - 1 < local106) {
			local106 = super.anInt10327 - 1;
		}
		@Pc(123) int local123 = 0;
		@Pc(127) int[] local127 = this.aClass7_Sub2_18.anIntArray295;
		@Pc(140) int local140;
		for (@Pc(129) int local129 = local62; local129 <= local86; local129++) {
			@Pc(138) boolean[] local138 = arg2[local129 - local64];
			for (local140 = local73; local140 <= local106; local140++) {
				if (local138[local140 - local75]) {
					local127[local123++] = super.anInt10330 * local140 + local129;
				}
			}
		}
		if (arg5 == -1) {
			this.aClass7_Sub2_18.method4329();
		} else {
			this.aClass7_Sub2_18.method4277((float) arg5);
			this.aClass7_Sub2_18.method4287();
		}
		this.aClass7_Sub2_18.method4290((this.anInt3301 & 0x7) != 0);
		for (@Pc(213) int local213 = 0; local213 < this.aClass4_Sub9Array1.length; local213++) {
			this.aClass4_Sub9Array1[local213].method1804(local123, local127);
		}
		if (!this.aClass22_19.method893()) {
			local140 = this.aClass7_Sub2_18.anInt5620;
			@Pc(242) int local242 = this.aClass7_Sub2_18.anInt5616;
			this.aClass7_Sub2_18.pa(0, local242, this.aClass7_Sub2_18.anInt5630);
			this.aClass7_Sub2_18.method4290(false);
			this.aClass7_Sub2_18.method4293(false);
			this.aClass7_Sub2_18.method4343(128);
			this.aClass7_Sub2_18.method4339(-2);
			this.aClass7_Sub2_18.method4313(this.aClass7_Sub2_18.aClass3_Sub2_2);
			this.aClass7_Sub2_18.method4346(8448, 7681);
			this.aClass7_Sub2_18.method4280(34166, 0, 770);
			this.aClass7_Sub2_18.method4276(34167, 0);
			for (@Pc(302) Class4 local302 = this.aClass22_19.method895(); local302 != null; local302 = this.aClass22_19.method889()) {
				@Pc(307) Class4_Sub18 local307 = (Class4_Sub18) local302;
				local307.method2581(arg4, arg3, arg0, arg2);
			}
			this.aClass7_Sub2_18.method4280(5890, 0, 768);
			this.aClass7_Sub2_18.method4276(5890, 0);
			this.aClass7_Sub2_18.method4313(null);
			this.aClass7_Sub2_18.pa(local140, local242, this.aClass7_Sub2_18.anInt5630);
		}
		if (this.aClass248_2 == null) {
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		this.aClass7_Sub2_18.method4354(null, this.aClass209_7, null, this.aClass209_10);
		this.aClass248_2.method5877(arg1, arg4, arg3, arg0, arg2);
		OpenGL.glPopMatrix();
		return;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method8056(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method2650(arg0, arg4, arg3, arg1, arg2, arg5);
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method8059(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt3314 <= 0) {
			return;
		}
		this.aClass7_Sub2_18.method4302();
		this.aClass7_Sub2_18.method4321(false);
		this.aClass7_Sub2_18.method4290(false);
		this.aClass7_Sub2_18.method4300(false);
		this.aClass7_Sub2_18.method4293(false);
		this.aClass7_Sub2_18.method4343(0);
		this.aClass7_Sub2_18.method4339(-2);
		this.aClass7_Sub2_18.method4313(null);
		Static307.aFloatArray46[7] = 0.0F;
		Static307.aFloatArray46[12] = -1.0F - ((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass7_Sub2_18.anInt5412;
		Static307.aFloatArray46[10] = 0.0F;
		Static307.aFloatArray46[0] = (float) 1024 / ((float) super.anInt10333 * 128.0F * (float) this.aClass7_Sub2_18.anInt5412);
		Static307.aFloatArray46[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass7_Sub2_18.anInt5447;
		Static307.aFloatArray46[4] = 0.0F;
		Static307.aFloatArray46[3] = 0.0F;
		Static307.aFloatArray46[8] = 0.0F;
		Static307.aFloatArray46[9] = 0.0F;
		Static307.aFloatArray46[15] = 1.0F;
		Static307.aFloatArray46[14] = 0.0F;
		Static307.aFloatArray46[6] = 0.0F;
		Static307.aFloatArray46[5] = (float) 1024 / ((float) this.aClass7_Sub2_18.anInt5447 * 128.0F * (float) super.anInt10333);
		Static307.aFloatArray46[1] = 0.0F;
		Static307.aFloatArray46[2] = 0.0F;
		Static307.aFloatArray46[11] = 0.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static307.aFloatArray46, 0);
		Static307.aFloatArray46[15] = 1.0F;
		Static307.aFloatArray46[2] = 0.0F;
		Static307.aFloatArray46[7] = 0.0F;
		Static307.aFloatArray46[5] = 0.0F;
		Static307.aFloatArray46[6] = 1.0F;
		Static307.aFloatArray46[8] = 0.0F;
		Static307.aFloatArray46[0] = 1.0F;
		Static307.aFloatArray46[12] = 0.0F;
		Static307.aFloatArray46[4] = 0.0F;
		Static307.aFloatArray46[3] = 0.0F;
		Static307.aFloatArray46[9] = 1.0F;
		Static307.aFloatArray46[10] = 0.0F;
		Static307.aFloatArray46[1] = 0.0F;
		Static307.aFloatArray46[11] = 0.0F;
		Static307.aFloatArray46[14] = 0.0F;
		Static307.aFloatArray46[13] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static307.aFloatArray46, 0);
		if ((this.anInt3301 & 0x7) == 0) {
			this.aClass7_Sub2_18.method4290(false);
		} else {
			this.aClass7_Sub2_18.method4290(true);
			this.aClass7_Sub2_18.method4330();
		}
		this.aClass7_Sub2_18.method4354(this.aClass209_9, this.aClass209_7, this.aClass209_8, this.aClass209_10);
		if (this.aClass7_Sub2_18.aClass4_Sub13_Sub1_3.aByteArray88.length >= this.anInt3307 * 2) {
			this.aClass7_Sub2_18.aClass4_Sub13_Sub1_3.anInt9170 = 0;
		} else {
			this.aClass7_Sub2_18.aClass4_Sub13_Sub1_3 = new Class4_Sub13_Sub1(this.anInt3307 * 2);
		}
		@Pc(307) int local307 = 0;
		@Pc(311) Class4_Sub13_Sub1 local311 = this.aClass7_Sub2_18.aClass4_Sub13_Sub1_3;
		@Pc(317) int local317;
		@Pc(326) int local326;
		@Pc(328) int local328;
		@Pc(346) short[] local346;
		@Pc(350) int local350;
		if (this.aClass7_Sub2_18.aBoolean388) {
			for (local317 = arg1; local317 < arg3; local317++) {
				local326 = local317 * super.anInt10330 + arg0;
				for (local328 = arg0; local328 < arg2; local328++) {
					if (arg4[local328 - arg0][local317 - arg1]) {
						local346 = this.aShortArrayArray10[local326];
						if (local346 != null) {
							for (local350 = 0; local350 < local346.length; local350++) {
								local311.method7038(local346[local350] & 0xFFFF);
								local307++;
							}
						}
					}
					local326++;
				}
			}
		} else {
			for (local317 = arg1; local317 < arg3; local317++) {
				local326 = arg0 + super.anInt10330 * local317;
				for (local328 = arg0; local328 < arg2; local328++) {
					if (arg4[local328 - arg0][local317 - arg1]) {
						local346 = this.aShortArrayArray10[local326];
						if (local346 != null) {
							for (local350 = 0; local350 < local346.length; local350++) {
								local311.method7041(local346[local350] & 0xFFFF);
								local307++;
							}
						}
					}
					local326++;
				}
			}
		}
		if (local307 > 0) {
			@Pc(467) Class114_Sub2 local467 = new Class114_Sub2(this.aClass7_Sub2_18, 5123, local311.aByteArray88, local311.anInt9170);
			this.aClass7_Sub2_18.method4338(0, local307, local467);
		}
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(III)V")
	@Override
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray14[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray14[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(IILclient!hk;I)V")
	private void method2653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub6_Sub7_Sub1 arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray7[arg1][arg0];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray11[arg1][arg0];
		@Pc(22) int local22 = local12.length;
		if (local22 > this.aClass7_Sub2_18.anIntArray294.length) {
			this.aClass7_Sub2_18.anIntArray294 = new int[local22];
			this.aClass7_Sub2_18.anIntArray293 = new int[local22];
		}
		@Pc(46) int[] local46 = this.aClass7_Sub2_18.anIntArray294;
		@Pc(50) int[] local50 = this.aClass7_Sub2_18.anIntArray293;
		for (@Pc(52) int local52 = 0; local52 < local22; local52++) {
			local46[local52] = local12[local52] >> this.aClass7_Sub2_18.anInt5598;
			local50[local52] = local19[local52] >> this.aClass7_Sub2_18.anInt5598;
		}
		@Pc(84) int local84 = 0;
		while (local84 < local22) {
			@Pc(95) int local95 = local46[local84];
			@Pc(100) int local100 = local50[local84++];
			@Pc(104) int local104 = local46[local84];
			@Pc(109) int local109 = local50[local84++];
			@Pc(113) int local113 = local46[local84];
			@Pc(118) int local118 = local50[local84++];
			if ((local109 - local118) * (local95 - local104) - (local109 - local100) * (-local104 + local113) > 0) {
				arg2.method3193(local109, local118, local95, local100, local113, local104);
			}
		}
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lclient!ha;IIIIZ)Z")
	@Override
	public boolean method8062(@OriginalArg(0) Class4_Sub6_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass248_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(24) int local24 = arg1 - (this.aClass7_Sub2_18.anInt5636 * arg2 >> 8) >> this.aClass7_Sub2_18.anInt5598;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass7_Sub2_18.anInt5640 >> 8) >> this.aClass7_Sub2_18.anInt5598;
			return this.aClass248_2.method5885(local39, arg0, local24);
		}
	}

	@OriginalMember(owner = "client!fw", name = "v", descriptor = "(IILclient!ha;)Lclient!ha;")
	@Override
	public Class4_Sub6_Sub7 v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub6_Sub7 arg2) {
		if ((this.aByteArrayArray13[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt10333 >> this.aClass7_Sub2_18.anInt5598;
		@Pc(27) Class4_Sub6_Sub7_Sub1 local27 = (Class4_Sub6_Sub7_Sub1) arg2;
		@Pc(43) Class4_Sub6_Sub7_Sub1 local43;
		if (local27 != null && local27.method3192(local24, local24)) {
			local43 = local27;
			local27.method3195();
		} else {
			local43 = new Class4_Sub6_Sub7_Sub1(this.aClass7_Sub2_18, local24, local24);
		}
		local43.method3196(local24, 0, 0, local24);
		this.method2653(arg1, arg0, local43);
		return local43;
	}

	@OriginalMember(owner = "client!fw", name = "DA", descriptor = "(Lclient!ha;IIIIZ)V")
	@Override
	public void DA(@OriginalArg(0) Class4_Sub6_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass248_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass7_Sub2_18.anInt5636 >> 8) >> this.aClass7_Sub2_18.anInt5598;
			@Pc(39) int local39 = arg3 - (this.aClass7_Sub2_18.anInt5640 * arg2 >> 8) >> this.aClass7_Sub2_18.anInt5598;
			this.aClass248_2.method5879(arg0, local39, local24);
		}
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lclient!am;[I)V")
	@Override
	public void method8057(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass22_19.method894(new Class4_Sub18(this.aClass7_Sub2_18, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(II)V")
	@Override
	public void method8061(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!fw", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg3 != null && this.anIntArrayArrayArray10 == null) {
			this.anIntArrayArrayArray10 = new int[super.anInt10330][super.anInt10327][];
		}
		if (arg5 != null && this.anIntArrayArrayArray8 == null) {
			this.anIntArrayArrayArray8 = new int[super.anInt10330][super.anInt10327][];
		}
		this.anIntArrayArrayArray7[arg0][arg1] = arg2;
		this.anIntArrayArrayArray11[arg0][arg1] = arg4;
		this.anIntArrayArrayArray9[arg0][arg1] = arg6;
		this.anIntArrayArrayArray12[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray8 != null) {
			this.anIntArrayArrayArray8[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray10 != null) {
			this.anIntArrayArrayArray10[arg0][arg1] = arg3;
		}
		@Pc(88) Class4_Sub9[] local88 = this.aClass4_Sub9ArrayArrayArray1[arg0][arg1] = new Class4_Sub9[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) (arg9[local90] << 14) | (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28 | (long) arg8[local90];
			@Pc(125) Class4 local125;
			for (local125 = this.aClass221_8.method5075(local119); local125 != null; local125 = this.aClass221_8.method5067()) {
				@Pc(130) Class4_Sub9 local130 = (Class4_Sub9) local125;
				if (arg8[local90] == local130.anInt2276 && (float) arg9[local90] == local130.aFloat53 && local130.anInt2282 == arg10 && local130.anInt2283 == arg11 && local130.anInt2279 == arg12) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class4_Sub9(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass221_8.method5073(local88[local90], local119);
			} else {
				local88[local90] = (Class4_Sub9) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray13[arg0][arg1] = (byte) (this.aByteArrayArray13[arg0][arg1] | 0x1);
		}
		if (this.anInt3313 < arg6.length) {
			this.anInt3313 = arg6.length;
		}
		this.anInt3314 += arg6.length;
	}
}
