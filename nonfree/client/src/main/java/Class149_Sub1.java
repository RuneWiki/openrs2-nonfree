import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lk")
public final class Class149_Sub1 extends Class149 {

	@OriginalMember(owner = "client!lk", name = "z", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!lk", name = "C", descriptor = "I")
	private int anInt4105;

	@OriginalMember(owner = "client!lk", name = "Y", descriptor = "I")
	private int anInt4120;

	@OriginalMember(owner = "client!lk", name = "ab", descriptor = "Lclient!gi;")
	public Class89 aClass89_3;

	@OriginalMember(owner = "client!lk", name = "bb", descriptor = "Lclient!gi;")
	private Class89 aClass89_4;

	@OriginalMember(owner = "client!lk", name = "cb", descriptor = "I")
	private int anInt4121;

	@OriginalMember(owner = "client!lk", name = "db", descriptor = "Lclient!wu;")
	private Interface12 anInterface12_4;

	@OriginalMember(owner = "client!lk", name = "eb", descriptor = "I")
	private int anInt4122;

	@OriginalMember(owner = "client!lk", name = "fb", descriptor = "Lclient!gi;")
	public Class89 aClass89_5;

	@OriginalMember(owner = "client!lk", name = "gb", descriptor = "Lclient!gi;")
	public Class89 aClass89_6;

	@OriginalMember(owner = "client!lk", name = "jb", descriptor = "[Lclient!rh;")
	private Class1_Sub37[] aClass1_Sub37Array1;

	@OriginalMember(owner = "client!lk", name = "B", descriptor = "Lclient!oe;")
	private final Class181 aClass181_42 = new Class181();

	@OriginalMember(owner = "client!lk", name = "W", descriptor = "I")
	private final int anInt4118 = this.anInt4316 - 2;

	@OriginalMember(owner = "client!lk", name = "R", descriptor = "[[I")
	private final int[][] anIntArrayArray42;

	@OriginalMember(owner = "client!lk", name = "T", descriptor = "Lclient!kd;")
	public final Class39_Sub2 aClass39_Sub2_24;

	@OriginalMember(owner = "client!lk", name = "F", descriptor = "[[[Lclient!rh;")
	private Class1_Sub37[][][] aClass1_Sub37ArrayArrayArray1;

	@OriginalMember(owner = "client!lk", name = "y", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!lk", name = "u", descriptor = "I")
	private final int anInt4102;

	@OriginalMember(owner = "client!lk", name = "m", descriptor = "[[B")
	private final byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!lk", name = "I", descriptor = "[[S")
	public final short[][] aShortArrayArray6;

	@OriginalMember(owner = "client!lk", name = "A", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!lk", name = "S", descriptor = "I")
	public final int anInt4115;

	@OriginalMember(owner = "client!lk", name = "Z", descriptor = "[[B")
	private byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!lk", name = "M", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!lk", name = "p", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!lk", name = "hb", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!lk", name = "lb", descriptor = "[[F")
	private float[][] lb;

	@OriginalMember(owner = "client!lk", name = "ib", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!lk", name = "q", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!lk", name = "kb", descriptor = "Lclient!gu;")
	private Class96 aClass96_26;

	@OriginalMember(owner = "client!lk", name = "N", descriptor = "Lclient!er;")
	private Class67 aClass67_2;

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Lclient!kd;IIII[[I[[II)V")
	public Class149_Sub1(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.anIntArrayArray42 = arg5;
		this.aClass39_Sub2_24 = arg0;
		this.aClass1_Sub37ArrayArrayArray1 = new Class1_Sub37[arg3][arg4][];
		this.anIntArrayArrayArray7 = new int[arg3][arg4][];
		this.anInt4102 = 0x1 << this.anInt4118;
		this.aByteArrayArray9 = new byte[arg3][arg4];
		this.aShortArrayArray6 = new short[arg3 * arg4][];
		this.anIntArrayArrayArray9 = new int[arg3][arg4][];
		this.anInt4115 = arg2;
		this.aByteArrayArray10 = new byte[arg3 + 1][arg4 + 1];
		this.anIntArrayArrayArray10 = new int[arg3][arg4][];
		this.anIntArrayArrayArray5 = new int[arg3][arg4][];
		this.aFloatArrayArray3 = new float[super.anInt4317 + 1][super.anInt4319 + 1];
		this.lb = new float[super.anInt4317 + 1][super.anInt4319 + 1];
		this.aFloatArrayArray4 = new float[super.anInt4317 + 1][super.anInt4319 + 1];
		this.anIntArrayArrayArray6 = new int[arg3][arg4][];
		for (@Pc(117) int local117 = 1; super.anInt4319 > local117; local117++) {
			for (@Pc(121) int local121 = 1; super.anInt4317 > local121; local121++) {
				@Pc(140) int local140 = arg6[local121 + 1][local117] - arg6[local121 - 1][local117];
				@Pc(156) int local156 = arg6[local121][local117 + 1] - arg6[local121][local117 - 1];
				@Pc(176) float local176 = (float) (1.0D / Math.sqrt((double) (local156 * local156 + local140 * local140 + arg7 * 4 * arg7)));
				this.aFloatArrayArray3[local121][local117] = (float) local140 * local176;
				this.lb[local121][local117] = local176 * (float) (-arg7 * 2);
				this.aFloatArrayArray4[local121][local117] = (float) local156 * local176;
			}
		}
		this.aClass96_26 = new Class96(128);
		if ((this.anInt4115 & 0x10) != 0) {
			this.aClass67_2 = new Class67(this.aClass39_Sub2_24, this);
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!qp;[I)V")
	@Override
	public void method3571(@OriginalArg(0) Class1_Sub31 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass181_42.method4102(new Class1_Sub33(this.aClass39_Sub2_24, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(II)V")
	@Override
	public void method3572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(Lclient!ba;IIIIZ)V")
	@Override
	public void b(@OriginalArg(0) Class1_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass67_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass39_Sub2_24.anInt3819 >> 8) >> this.aClass39_Sub2_24.anInt3777;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass39_Sub2_24.anInt3808 >> 8) >> this.aClass39_Sub2_24.anInt3777;
			this.aClass67_2.method1837(arg0, local24, local39);
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)I")
	@Override
	public int a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 >> super.anInt4316;
		@Pc(13) int local13 = arg1 >> super.anInt4316;
		if (local8 < 0 || local13 < 0 || local8 > super.anInt4317 - 1 || super.anInt4319 - 1 < local13) {
			return 0;
		}
		@Pc(48) int local48 = arg0 & super.anInt4318 - 1;
		@Pc(55) int local55 = arg1 & super.anInt4318 - 1;
		@Pc(81) int local81 = this.anIntArrayArray42[local8 + 1][local13] * local48 + (super.anInt4318 - local48) * this.anIntArrayArray42[local8][local13] >> super.anInt4316;
		@Pc(113) int local113 = (super.anInt4318 - local48) * this.anIntArrayArray42[local8][local13 - -1] + local48 * this.anIntArrayArray42[local8 + 1][local13 + 1] >> super.anInt4316;
		return local113 * local55 + (super.anInt4318 - local55) * local81 >> super.anInt4316;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(II[[ZZIII)V")
	private void method3454(@OriginalArg(0) int arg0, @OriginalArg(2) boolean[][] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (this.aClass1_Sub37Array1 == null) {
			return;
		}
		@Pc(15) float local15 = this.aClass39_Sub2_24.aFloat55;
		@Pc(19) float local19 = this.aClass39_Sub2_24.aFloat39;
		@Pc(25) int local25 = arg0 + arg0 + 1;
		@Pc(29) int local29 = local25 * local25;
		if (this.aClass39_Sub2_24.anIntArray314.length < local29) {
			this.aClass39_Sub2_24.anIntArray314 = new int[local29];
		}
		if (this.aClass39_Sub2_24.aClass1_Sub5_Sub2_1.aByteArray89.length < this.anInt4120 * 2) {
			this.aClass39_Sub2_24.aClass1_Sub5_Sub2_1 = new Class1_Sub5_Sub2(this.anInt4120 * 2);
		}
		@Pc(72) int local72 = arg3 - arg0;
		@Pc(74) int local74 = local72;
		if (local72 < 0) {
			local72 = 0;
		}
		@Pc(83) int local83 = arg4 - arg0;
		@Pc(85) int local85 = local83;
		if (local83 < 0) {
			local83 = 0;
		}
		@Pc(96) int local96 = arg0 + arg3;
		if (local96 > super.anInt4317 - 1) {
			local96 = super.anInt4317 - 1;
		}
		@Pc(111) int local111 = arg4 + arg0;
		if (super.anInt4319 - 1 < local111) {
			local111 = super.anInt4319 - 1;
		}
		@Pc(128) int local128 = 0;
		@Pc(132) int[] local132 = this.aClass39_Sub2_24.anIntArray314;
		@Pc(145) int local145;
		for (@Pc(134) int local134 = local72; local134 <= local96; local134++) {
			@Pc(143) boolean[] local143 = arg1[local134 - local74];
			for (local145 = local83; local145 <= local111; local145++) {
				if (local143[local145 - local85]) {
					local132[local128++] = local145 * super.anInt4317 + local134;
				}
			}
		}
		this.aClass39_Sub2_24.method3185();
		this.aClass39_Sub2_24.method3186((this.anInt4115 & 0x7) != 0);
		for (@Pc(209) int local209 = 0; local209 < this.aClass1_Sub37Array1.length; local209++) {
			this.aClass1_Sub37Array1[local209].method4835(local128, local132);
		}
		if (!this.aClass181_42.method4113()) {
			local145 = this.aClass39_Sub2_24.anInt3789;
			@Pc(238) int local238 = this.aClass39_Sub2_24.anInt3797;
			this.aClass39_Sub2_24.UA(0, local238, this.aClass39_Sub2_24.anInt3784);
			this.aClass39_Sub2_24.g(local19, local15 - 4.0F);
			this.aClass39_Sub2_24.method3186(false);
			this.aClass39_Sub2_24.method3208(false);
			this.aClass39_Sub2_24.method3205(128);
			this.aClass39_Sub2_24.method3218(-2);
			this.aClass39_Sub2_24.method3203(this.aClass39_Sub2_24.bf);
			this.aClass39_Sub2_24.method3156(7681, 8448);
			this.aClass39_Sub2_24.method3180(770, 0, 34166);
			this.aClass39_Sub2_24.method3210(34167, 0);
			for (@Pc(311) Class1 local311 = this.aClass181_42.method4112(); local311 != null; local311 = this.aClass181_42.method4104()) {
				@Pc(316) Class1_Sub33 local316 = (Class1_Sub33) local311;
				local316.method4026(arg1, arg0, arg4, arg3);
			}
			this.aClass39_Sub2_24.method3180(768, 0, 5890);
			this.aClass39_Sub2_24.method3210(5890, 0);
			this.aClass39_Sub2_24.method3203(null);
			this.aClass39_Sub2_24.UA(local145, local238, this.aClass39_Sub2_24.anInt3784);
		}
		if (this.aClass67_2 != null) {
			this.aClass39_Sub2_24.g(local19, local15 - 8.0F);
			this.aClass39_Sub2_24.method3185();
			this.aClass39_Sub2_24.method3181(null, this.aClass89_3, this.aClass89_6, null);
			this.aClass67_2.method1839(arg2, arg1, arg3, arg0, arg4);
		}
		this.aClass39_Sub2_24.g(local19, local15);
	}

	@OriginalMember(owner = "client!lk", name = "ca", descriptor = "()V")
	@Override
	public void ca() {
		if (this.anInt4121 <= 0) {
			this.aClass67_2 = null;
		} else {
			@Pc(19) byte[][] local19 = new byte[super.anInt4317 + 1][super.anInt4319 + 1];
			@Pc(25) int local25;
			for (@Pc(21) int local21 = 1; super.anInt4317 > local21; local21++) {
				for (local25 = 1; super.anInt4319 > local25; local25++) {
					local19[local21][local25] = (byte) ((this.aByteArrayArray10[local21 - 1][local25] >> 2) + (this.aByteArrayArray10[local21 + 1][local25] >> 3) + (this.aByteArrayArray10[local21][local25 + -1] >> 2) + (this.aByteArrayArray10[local21][local25 + 1] >> 3) + (this.aByteArrayArray10[local21][local25] >> 1));
				}
			}
			this.aClass1_Sub37Array1 = new Class1_Sub37[this.aClass96_26.method2343()];
			this.aClass96_26.method2334(this.aClass1_Sub37Array1);
			for (local25 = 0; local25 < this.aClass1_Sub37Array1.length; local25++) {
				this.aClass1_Sub37Array1[local25].method4836(this.anInt4121);
			}
			@Pc(133) int local133 = 24;
			if (this.anIntArrayArrayArray8 != null) {
				local133 += 4;
			}
			if ((this.anInt4115 & 0x7) != 0) {
				local133 += 12;
			}
			@Pc(152) NativeBuffer local152 = this.aClass39_Sub2_24.aNativeHeap1.a(local133 * this.anInt4121);
			@Pc(157) NativeStream local157 = new NativeStream(local152);
			@Pc(161) Class1_Sub37[] local161 = new Class1_Sub37[this.anInt4121];
			@Pc(168) int local168 = Static434.method5757(this.anInt4121 / 4);
			if (local168 < 1) {
				local168 = 1;
			}
			@Pc(178) Class96 local178 = new Class96(local168);
			@Pc(182) Class1_Sub37[] local182 = new Class1_Sub37[this.anInt4122];
			@Pc(188) int local188;
			for (@Pc(184) int local184 = 0; local184 < super.anInt4317; local184++) {
				for (local188 = 0; local188 < super.anInt4319; local188++) {
					if (this.anIntArrayArrayArray10[local184][local188] != null) {
						@Pc(204) Class1_Sub37[] local204 = this.aClass1_Sub37ArrayArrayArray1[local184][local188];
						@Pc(211) int[] local211 = this.anIntArrayArrayArray9[local184][local188];
						@Pc(218) int[] local218 = this.anIntArrayArrayArray7[local184][local188];
						@Pc(225) int[] local225 = this.anIntArrayArrayArray5[local184][local188];
						@Pc(232) int[] local232 = this.anIntArrayArrayArray10[local184][local188];
						@Pc(244) int[] local244 = this.anIntArrayArrayArray6 == null ? null : this.anIntArrayArrayArray6[local184][local188];
						if (local225 == null) {
							local225 = local232;
						}
						@Pc(260) int[] local260 = this.anIntArrayArrayArray8 == null ? null : this.anIntArrayArrayArray8[local184][local188];
						@Pc(267) float local267 = this.aFloatArrayArray3[local184][local188];
						@Pc(274) float local274 = this.lb[local184][local188];
						@Pc(281) float local281 = this.aFloatArrayArray4[local184][local188];
						@Pc(290) float local290 = this.aFloatArrayArray3[local184][local188 + 1];
						@Pc(299) float local299 = this.lb[local184][local188 + 1];
						@Pc(308) float local308 = this.aFloatArrayArray4[local184][local188 + 1];
						@Pc(319) float local319 = this.aFloatArrayArray3[local184 + 1][local188 + 1];
						@Pc(330) float local330 = this.lb[local184 + 1][local188 + 1];
						@Pc(341) float local341 = this.aFloatArrayArray4[local184 + 1][local188 + 1];
						@Pc(350) float local350 = this.aFloatArrayArray3[local184 + 1][local188];
						@Pc(359) float local359 = this.lb[local184 + 1][local188];
						@Pc(368) float local368 = this.aFloatArrayArray4[local184 + 1][local188];
						@Pc(376) int local376 = local19[local184][local188] & 0xFF;
						@Pc(386) int local386 = local19[local184][local188 + 1] & 0xFF;
						@Pc(398) int local398 = local19[local184 + 1][local188 + 1] & 0xFF;
						@Pc(408) int local408 = local19[local184 + 1][local188] & 0xFF;
						@Pc(410) int local410 = 0;
						@Pc(420) int local420;
						label337: for (@Pc(412) int local412 = 0; local412 < local232.length; local412++) {
							@Pc(418) Class1_Sub37 local418 = local204[local412];
							for (local420 = 0; local420 < local410; local420++) {
								if (local418 == local182[local420]) {
									continue label337;
								}
							}
							local182[local410++] = local418;
						}
						@Pc(457) short[] local457 = this.aShortArrayArray6[local184 + super.anInt4317 * local188] = new short[local232.length];
						for (local420 = 0; local420 < local232.length; local420++) {
							@Pc(471) int local471 = (local184 << super.anInt4316) + local211[local420];
							@Pc(480) int local480 = (local188 << super.anInt4316) + local218[local420];
							@Pc(485) int local485 = local471 >> this.anInt4118;
							@Pc(490) int local490 = local480 >> this.anInt4118;
							@Pc(494) int local494 = local232[local420];
							@Pc(498) int local498 = local225[local420];
							@Pc(506) int local506 = local244 == null ? 0 : local244[local420];
							@Pc(524) long local524 = (long) local498 << 48 | (long) local494 << 32 | (long) (local485 << 16) | (long) local490;
							@Pc(528) int local528 = local211[local420];
							@Pc(532) int local532 = local218[local420];
							@Pc(534) byte local534 = 74;
							@Pc(536) int local536 = 0;
							@Pc(538) float local538 = 1.0F;
							@Pc(631) float local631;
							@Pc(640) float local640;
							@Pc(657) float local657;
							@Pc(597) float local597;
							@Pc(695) int local695;
							if (local528 == 0 && local532 == 0) {
								local657 = local281;
								local640 = local274;
								local631 = local267;
								local695 = local534 - local376;
							} else if (local528 == 0 && super.anInt4318 == local532) {
								local631 = local290;
								local695 = local534 - local386;
								local657 = local308;
								local640 = local299;
							} else if (local528 == super.anInt4318 && local532 == super.anInt4318) {
								local657 = local341;
								local695 = local534 - local398;
								local631 = local319;
								local640 = local330;
							} else if (super.anInt4318 == local528 && local532 == 0) {
								local640 = local359;
								local631 = local350;
								local695 = local534 - local408;
								local657 = local368;
							} else {
								@Pc(573) float local573 = (float) local528 / (float) super.anInt4318;
								@Pc(580) float local580 = (float) local532 / (float) super.anInt4318;
								@Pc(588) float local588 = local573 * (local350 - local267) + local267;
								local597 = (local359 - local274) * local573 + local274;
								@Pc(606) float local606 = local281 + local573 * (local368 - local281);
								@Pc(615) float local615 = local290 + (local319 - local290) * local573;
								@Pc(623) float local623 = (local330 - local299) * local573 + local299;
								local631 = local588 + (local615 - local588) * local580;
								local640 = local580 * (local623 - local597) + local597;
								@Pc(649) float local649 = local308 + (local341 - local308) * local573;
								local657 = local606 + local580 * (local649 - local606);
								@Pc(669) int local669 = local376 + ((local408 - local376) * local528 >> super.anInt4316);
								@Pc(680) int local680 = local386 + (local528 * (local398 - local386) >> super.anInt4316);
								local695 = local534 - local669 - ((local680 - local669) * local532 >> super.anInt4316);
							}
							if (local494 != -1) {
								@Pc(754) int local754 = local695 * (local494 & 0x7F) >> 7;
								if (local754 < 2) {
									local754 = 2;
								} else if (local754 > 126) {
									local754 = 126;
								}
								if ((this.anInt4115 & 0x7) == 0) {
									local538 = local631 * this.aClass39_Sub2_24.aFloatArray11[0] + local640 * this.aClass39_Sub2_24.aFloatArray11[1] + this.aClass39_Sub2_24.aFloatArray11[2] * local657;
									local538 = this.aClass39_Sub2_24.aFloat49 + local538 * (local538 > 0.0F ? this.aClass39_Sub2_24.aFloat46 : this.aClass39_Sub2_24.aFloat37);
								}
								local536 = Static337.anIntArray223[local494 & 0xFF80 | local754];
							}
							@Pc(827) Class1 local827 = null;
							if ((local471 & this.anInt4102 - 1) == 0 && (this.anInt4102 - 1 & local480) == 0) {
								local827 = local178.method2335(local524);
							}
							@Pc(1192) int local1192;
							@Pc(860) int local860;
							if (local827 == null) {
								if (local494 == local498) {
									local860 = local536;
								} else {
									@Pc(870) int local870 = local695 * (local498 & 0x7F) >> 7;
									if (local870 < 2) {
										local870 = 2;
									} else if (local870 > 126) {
										local870 = 126;
									}
									local860 = Static337.anIntArray223[local498 & 0xFF80 | local870];
									if ((this.anInt4115 & 0x7) == 0) {
										local597 = local657 * this.aClass39_Sub2_24.aFloatArray11[2] + this.aClass39_Sub2_24.aFloatArray11[1] * local640 + local631 * this.aClass39_Sub2_24.aFloatArray11[0];
										local597 = local538 * (local538 > 0.0F ? this.aClass39_Sub2_24.aFloat46 : this.aClass39_Sub2_24.aFloat37) + this.aClass39_Sub2_24.aFloat49;
										@Pc(950) int local950 = local860 >> 16 & 0xFF;
										@Pc(956) int local956 = local860 >> 8 & 0xFF;
										local950 = (int) ((float) local950 * local597);
										@Pc(966) int local966 = local860 & 0xFF;
										local956 = (int) ((float) local956 * local597);
										if (local950 < 0) {
											local950 = 0;
										} else if (local950 > 255) {
											local950 = 255;
										}
										if (local956 < 0) {
											local956 = 0;
										} else if (local956 > 255) {
											local956 = 255;
										}
										local966 = (int) ((float) local966 * local597);
										if (local966 < 0) {
											local966 = 0;
										} else if (local966 > 255) {
											local966 = 255;
										}
										local860 = local966 | local950 << 16 | local956 << 8;
									}
								}
								if (this.aClass39_Sub2_24.aBoolean250) {
									local157.b((float) local471);
									local157.b((float) (this.a(local471, local480) + local506));
									local157.b((float) local480);
									local157.a((byte) (local860 >> 16));
									local157.a((byte) (local860 >> 8));
									local157.a((byte) local860);
									local157.a(-1);
									local157.b((float) local471);
									local157.b((float) local480);
									if (this.anIntArrayArrayArray8 != null) {
										local157.b((float) (local260 == null ? 0 : local260[local420] - 1));
									}
									if ((this.anInt4115 & 0x7) != 0) {
										local157.b(local631);
										local157.b(local640);
										local157.b(local657);
									}
								} else {
									local157.a((float) local471);
									local157.a((float) (this.a(local471, local480) + local506));
									local157.a((float) local480);
									local157.a((byte) (local860 >> 16));
									local157.a((byte) (local860 >> 8));
									local157.a((byte) local860);
									local157.a(-1);
									local157.a((float) local471);
									local157.a((float) local480);
									if (this.anIntArrayArrayArray8 != null) {
										local157.a((float) (local260 == null ? 0 : local260[local420] - 1));
									}
									if ((this.anInt4115 & 0x7) != 0) {
										local157.a(local631);
										local157.a(local640);
										local157.a(local657);
									}
								}
								local1192 = this.anInt4105++;
								local457[local420] = (short) local1192;
								if (local494 != -1) {
									local161[local1192] = local204[local420];
								}
								local178.method2341(local524, new Class1_Sub45(local457[local420]));
							} else {
								local457[local420] = ((Class1_Sub45) local827).aShort97;
								local1192 = local457[local420] & 0xFFFF;
								if (local494 != -1 && local161[local1192].aLong222 > local204[local420].aLong222) {
									local161[local1192] = local204[local420];
								}
							}
							for (local860 = 0; local860 < local410; local860++) {
								local182[local860].method4841(local536, local1192, local695, local538);
							}
							this.anInt4120++;
						}
					}
				}
			}
			for (local188 = 0; local188 < this.anInt4105; local188++) {
				@Pc(1312) Class1_Sub37 local1312 = local161[local188];
				if (local1312 != null) {
					local1312.method4838(local188);
				}
			}
			@Pc(1349) int local1349;
			for (@Pc(1329) int local1329 = 0; local1329 < super.anInt4317; local1329++) {
				for (@Pc(1333) int local1333 = 0; super.anInt4319 > local1333; local1333++) {
					@Pc(1345) short[] local1345 = this.aShortArrayArray6[local1329 + super.anInt4317 * local1333];
					if (local1345 != null) {
						local1349 = 0;
						@Pc(1351) int local1351 = 0;
						while (local1345.length > local1351) {
							@Pc(1360) int local1360 = local1345[local1351++] & 0xFFFF;
							@Pc(1367) int local1367 = local1345[local1351++] & 0xFFFF;
							@Pc(1374) int local1374 = local1345[local1351++] & 0xFFFF;
							@Pc(1378) Class1_Sub37 local1378 = local161[local1360];
							@Pc(1382) Class1_Sub37 local1382 = local161[local1367];
							@Pc(1386) Class1_Sub37 local1386 = local161[local1374];
							@Pc(1388) Class1_Sub37 local1388 = null;
							if (local1378 != null) {
								local1378.method4842(local1349, local1329, local1333);
								local1388 = local1378;
							}
							if (local1382 != null) {
								local1382.method4842(local1349, local1329, local1333);
								if (local1388 == null || local1382.aLong222 < local1388.aLong222) {
									local1388 = local1382;
								}
							}
							if (local1386 != null) {
								local1386.method4842(local1349, local1329, local1333);
								if (local1388 == null || local1386.aLong222 < local1388.aLong222) {
									local1388 = local1386;
								}
							}
							if (local1388 != null) {
								if (local1378 != null) {
									local1388.method4838(local1360);
								}
								if (local1382 != null) {
									local1388.method4838(local1367);
								}
								if (local1386 != null) {
									local1388.method4838(local1374);
								}
								local1388.method4842(local1349, local1329, local1333);
							}
							local1349++;
						}
					}
				}
			}
			local157.b();
			this.anInterface12_4 = this.aClass39_Sub2_24.method3216(local133, local152, local157.a());
			this.aClass89_6 = new Class89(this.anInterface12_4, 5126, 3, 0);
			this.aClass89_4 = new Class89(this.anInterface12_4, 5121, 4, 12);
			@Pc(1525) byte local1525;
			if (this.anIntArrayArrayArray8 == null) {
				local1525 = 24;
				this.aClass89_3 = new Class89(this.anInterface12_4, 5126, 2, 16);
			} else {
				local1525 = 28;
				this.aClass89_3 = new Class89(this.anInterface12_4, 5126, 3, 16);
			}
			if ((this.anInt4115 & 0x7) != 0) {
				this.aClass89_5 = new Class89(this.anInterface12_4, 5126, 3, local1525);
			}
			@Pc(1572) long[] local1572 = new long[this.aClass1_Sub37Array1.length];
			for (local1349 = 0; local1349 < this.aClass1_Sub37Array1.length; local1349++) {
				@Pc(1581) Class1_Sub37 local1581 = this.aClass1_Sub37Array1[local1349];
				local1572[local1349] = local1581.aLong222;
				local1581.method4840(this.anInt4105);
			}
			Static433.method5753(this.aClass1_Sub37Array1, local1572);
			if (this.aClass67_2 != null) {
				this.aClass67_2.method1836();
			}
		}
		this.anIntArrayArrayArray8 = null;
		this.anIntArrayArrayArray5 = null;
		this.aClass1_Sub37ArrayArrayArray1 = null;
		this.anIntArrayArrayArray6 = null;
		this.aByteArrayArray10 = null;
		this.anIntArrayArrayArray9 = this.anIntArrayArrayArray7 = null;
		this.aFloatArrayArray3 = this.lb = this.aFloatArrayArray4 = null;
		this.aClass96_26 = null;
		this.anIntArrayArrayArray10 = null;
	}

	@OriginalMember(owner = "client!lk", name = "B", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray8 == null) {
			this.anIntArrayArrayArray8 = new int[super.anInt4317][super.anInt4319][];
		}
		if (arg3 != null && this.anIntArrayArrayArray6 == null) {
			this.anIntArrayArrayArray6 = new int[super.anInt4317][super.anInt4319][];
		}
		this.anIntArrayArrayArray9[arg0][arg1] = arg2;
		this.anIntArrayArrayArray7[arg0][arg1] = arg4;
		this.anIntArrayArrayArray10[arg0][arg1] = arg6;
		this.anIntArrayArrayArray5[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray8 != null) {
			this.anIntArrayArrayArray8[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray6 != null) {
			this.anIntArrayArrayArray6[arg0][arg1] = arg3;
		}
		@Pc(88) Class1_Sub37[] local88 = this.aClass1_Sub37ArrayArrayArray1[arg0][arg1] = new Class1_Sub37[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) arg8[local90] | (long) (arg9[local90] << 14) | (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48;
			@Pc(125) Class1 local125;
			for (local125 = this.aClass96_26.method2335(local119); local125 != null; local125 = this.aClass96_26.method2340()) {
				@Pc(130) Class1_Sub37 local130 = (Class1_Sub37) local125;
				if (local130.anInt5808 == arg8[local90] && local130.aFloat91 == (float) arg9[local90] && arg10 == local130.anInt5796 && arg11 == local130.anInt5800 && arg12 == local130.anInt5802) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class1_Sub37(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass96_26.method2341(local119, local88[local90]);
			} else {
				local88[local90] = (Class1_Sub37) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray9[arg0][arg1] = (byte) (this.aByteArrayArray9[arg0][arg1] | 0x1);
		}
		if (this.anInt4122 < arg6.length) {
			this.anInt4122 = arg6.length;
		}
		this.anInt4121 += arg6.length;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method3569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method3454(arg2, arg3, arg4, arg0, arg1);
	}

	@OriginalMember(owner = "client!lk", name = "p", descriptor = "(Lclient!ba;IIIIZ)V")
	@Override
	public void p(@OriginalArg(0) Class1_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass67_2 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (this.aClass39_Sub2_24.anInt3819 * arg2 >> 8) >> this.aClass39_Sub2_24.anInt3777;
			@Pc(37) int local37 = arg3 - (this.aClass39_Sub2_24.anInt3808 * arg2 >> 8) >> this.aClass39_Sub2_24.anInt3777;
			this.aClass67_2.method1841(local37, arg0, local23);
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!ba;IIIIZ)Z")
	@Override
	public boolean method3567(@OriginalArg(0) Class1_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass67_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (this.aClass39_Sub2_24.anInt3819 * arg2 >> 8) >> this.aClass39_Sub2_24.anInt3777;
			@Pc(40) int local40 = arg3 - (arg2 * this.aClass39_Sub2_24.anInt3808 >> 8) >> this.aClass39_Sub2_24.anInt3777;
			return this.aClass67_2.method1838(arg0, local40, local25);
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method3565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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
		this.B(arg0, arg1, local13, local47, local18, local56, local23, local28, local33, local38, arg13, arg14, arg15, false);
	}

	@OriginalMember(owner = "client!lk", name = "k", descriptor = "(IILclient!ba;)Lclient!ba;")
	@Override
	public Class1_Sub2_Sub1 k(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub2_Sub1 arg2) {
		if ((this.aByteArrayArray9[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt4318 >> this.aClass39_Sub2_24.anInt3777;
		@Pc(27) Class1_Sub2_Sub1_Sub1 local27 = (Class1_Sub2_Sub1_Sub1) arg2;
		@Pc(37) Class1_Sub2_Sub1_Sub1 local37;
		if (local27 != null && local27.method61(local24, local24)) {
			local37 = local27;
			local27.method60();
		} else {
			local37 = new Class1_Sub2_Sub1_Sub1(this.aClass39_Sub2_24, local24, local24);
		}
		local37.method62(0, local24, local24, 0);
		this.method3458(arg0, arg1, local37);
		return local37;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IILclient!aa;I)V")
	private void method3458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub2_Sub1_Sub1 arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray9[arg0][arg1];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray7[arg0][arg1];
		@Pc(22) int local22 = local12.length;
		if (this.aClass39_Sub2_24.anIntArray313.length < local22) {
			this.aClass39_Sub2_24.anIntArray313 = new int[local22];
			this.aClass39_Sub2_24.anIntArray315 = new int[local22];
		}
		@Pc(46) int[] local46 = this.aClass39_Sub2_24.anIntArray313;
		@Pc(50) int[] local50 = this.aClass39_Sub2_24.anIntArray315;
		for (@Pc(52) int local52 = 0; local52 < local22; local52++) {
			local46[local52] = (local12[local52] & 0xFF) >> this.aClass39_Sub2_24.anInt3777;
			local50[local52] = (local19[local52] & 0xFF) >> this.aClass39_Sub2_24.anInt3777;
		}
		@Pc(88) int local88 = 0;
		while (local22 > local88) {
			@Pc(94) int local94 = local46[local88];
			@Pc(99) int local99 = local50[local88++];
			@Pc(103) int local103 = local46[local88];
			@Pc(108) int local108 = local50[local88++];
			@Pc(112) int local112 = local46[local88];
			@Pc(117) int local117 = local50[local88++];
			if (-((local112 - local103) * (local108 - local99)) + (local108 - local117) * (local94 - local103) > 0) {
				arg2.method59(local99, local108, local117, local112, local103, local94);
			}
		}
	}

	@OriginalMember(owner = "client!lk", name = "l", descriptor = "(II)I")
	@Override
	public int l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray42[arg0][arg1];
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method3564(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt4121 <= 0) {
			return;
		}
		this.aClass39_Sub2_24.method3201();
		this.aClass39_Sub2_24.method3217(false);
		this.aClass39_Sub2_24.method3186(false);
		this.aClass39_Sub2_24.method3213(false);
		this.aClass39_Sub2_24.method3208(false);
		this.aClass39_Sub2_24.method3205(0);
		this.aClass39_Sub2_24.method3218(-2);
		this.aClass39_Sub2_24.method3203(null);
		Static359.aFloatArray27[4] = 0.0F;
		Static359.aFloatArray27[9] = 0.0F;
		Static359.aFloatArray27[12] = -1.0F - ((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass39_Sub2_24.anInt3771;
		Static359.aFloatArray27[1] = 0.0F;
		Static359.aFloatArray27[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass39_Sub2_24.anInt3750;
		Static359.aFloatArray27[10] = 0.0F;
		Static359.aFloatArray27[14] = 0.0F;
		Static359.aFloatArray27[8] = 0.0F;
		Static359.aFloatArray27[11] = 0.0F;
		Static359.aFloatArray27[7] = 0.0F;
		Static359.aFloatArray27[0] = (float) 1024 / ((float) super.anInt4318 * 128.0F * (float) this.aClass39_Sub2_24.anInt3771);
		Static359.aFloatArray27[15] = 1.0F;
		Static359.aFloatArray27[6] = 0.0F;
		Static359.aFloatArray27[3] = 0.0F;
		Static359.aFloatArray27[2] = 0.0F;
		Static359.aFloatArray27[5] = (float) 1024 / ((float) super.anInt4318 * 128.0F * (float) this.aClass39_Sub2_24.anInt3750);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static359.aFloatArray27, 0);
		Static359.aFloatArray27[14] = 0.0F;
		Static359.aFloatArray27[11] = 0.0F;
		Static359.aFloatArray27[2] = 0.0F;
		Static359.aFloatArray27[10] = 0.0F;
		Static359.aFloatArray27[4] = 0.0F;
		Static359.aFloatArray27[9] = 1.0F;
		Static359.aFloatArray27[3] = 0.0F;
		Static359.aFloatArray27[7] = 0.0F;
		Static359.aFloatArray27[8] = 0.0F;
		Static359.aFloatArray27[6] = 1.0F;
		Static359.aFloatArray27[12] = 0.0F;
		Static359.aFloatArray27[15] = 1.0F;
		Static359.aFloatArray27[0] = 1.0F;
		Static359.aFloatArray27[5] = 0.0F;
		Static359.aFloatArray27[1] = 0.0F;
		Static359.aFloatArray27[13] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static359.aFloatArray27, 0);
		if ((this.anInt4115 & 0x7) == 0) {
			this.aClass39_Sub2_24.method3186(false);
		} else {
			this.aClass39_Sub2_24.method3186(true);
			this.aClass39_Sub2_24.method3219();
		}
		this.aClass39_Sub2_24.method3181(this.aClass89_5, this.aClass89_3, this.aClass89_6, this.aClass89_4);
		if (this.aClass39_Sub2_24.aClass1_Sub5_Sub2_1.aByteArray89.length >= this.anInt4120 * 2) {
			this.aClass39_Sub2_24.aClass1_Sub5_Sub2_1.anInt6475 = 0;
		} else {
			this.aClass39_Sub2_24.aClass1_Sub5_Sub2_1 = new Class1_Sub5_Sub2(this.anInt4120 * 2);
		}
		@Pc(313) int local313 = 0;
		@Pc(317) Class1_Sub5_Sub2 local317 = this.aClass39_Sub2_24.aClass1_Sub5_Sub2_1;
		@Pc(323) int local323;
		@Pc(332) int local332;
		@Pc(334) int local334;
		@Pc(353) short[] local353;
		@Pc(357) int local357;
		if (this.aClass39_Sub2_24.aBoolean250) {
			for (local323 = arg1; local323 < arg3; local323++) {
				local332 = local323 * super.anInt4317 + arg0;
				for (local334 = arg0; local334 < arg2; local334++) {
					if (arg4[local334 - arg0][local323 - arg1]) {
						local353 = this.aShortArrayArray6[local332];
						if (local353 != null) {
							for (local357 = 0; local357 < local353.length; local357++) {
								local313++;
								local317.method5393(local353[local357] & 0xFFFF);
							}
						}
					}
					local332++;
				}
			}
		} else {
			for (local323 = arg1; local323 < arg3; local323++) {
				local332 = local323 * super.anInt4317 + arg0;
				for (local334 = arg0; local334 < arg2; local334++) {
					if (arg4[local334 - arg0][local323 - arg1]) {
						local353 = this.aShortArrayArray6[local332];
						if (local353 != null) {
							for (local357 = 0; local357 < local353.length; local357++) {
								local317.method5355(local353[local357] & 0xFFFF);
								local313++;
							}
						}
					}
					local332++;
				}
			}
		}
		if (local313 > 0) {
			@Pc(470) Class76_Sub1 local470 = new Class76_Sub1(this.aClass39_Sub2_24, 5123, local317.aByteArray89, local317.anInt6475);
			this.aClass39_Sub2_24.method3184(local470, local313, 0);
		}
	}

	@OriginalMember(owner = "client!lk", name = "i", descriptor = "(III)V")
	@Override
	public void i(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray10[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray10[arg0][arg1] = (byte) arg2;
		}
	}
}
