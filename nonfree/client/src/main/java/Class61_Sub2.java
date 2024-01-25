import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ru")
public final class Class61_Sub2 extends Class61 {

	@OriginalMember(owner = "client!ru", name = "N", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!ru", name = "S", descriptor = "I")
	private int anInt8624;

	@OriginalMember(owner = "client!ru", name = "X", descriptor = "I")
	private int anInt8627;

	@OriginalMember(owner = "client!ru", name = "fb", descriptor = "Lclient!ak;")
	private Class18 aClass18_9;

	@OriginalMember(owner = "client!ru", name = "gb", descriptor = "[Lclient!nea;")
	private Class5_Sub35[] aClass5_Sub35Array1;

	@OriginalMember(owner = "client!ru", name = "hb", descriptor = "I")
	private int anInt8631;

	@OriginalMember(owner = "client!ru", name = "ib", descriptor = "Lclient!ak;")
	public Class18 aClass18_10;

	@OriginalMember(owner = "client!ru", name = "kb", descriptor = "I")
	private int anInt8632;

	@OriginalMember(owner = "client!ru", name = "lb", descriptor = "Lclient!ak;")
	public Class18 lb;

	@OriginalMember(owner = "client!ru", name = "nb", descriptor = "Lclient!js;")
	private Interface10 anInterface10_6;

	@OriginalMember(owner = "client!ru", name = "ob", descriptor = "Lclient!ak;")
	public Class18 aClass18_11;

	@OriginalMember(owner = "client!ru", name = "E", descriptor = "Lclient!tg;")
	private final Class330 aClass330_54 = new Class330();

	@OriginalMember(owner = "client!ru", name = "o", descriptor = "Lclient!rs;")
	public final Class133_Sub3 aClass133_Sub3_27;

	@OriginalMember(owner = "client!ru", name = "H", descriptor = "I")
	private final int anInt8616;

	@OriginalMember(owner = "client!ru", name = "A", descriptor = "[[B")
	private final byte[][] aByteArrayArray20;

	@OriginalMember(owner = "client!ru", name = "qb", descriptor = "[[F")
	private float[][] aFloatArrayArray15;

	@OriginalMember(owner = "client!ru", name = "w", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!ru", name = "jb", descriptor = "[[F")
	private float[][] aFloatArrayArray13;

	@OriginalMember(owner = "client!ru", name = "I", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!ru", name = "db", descriptor = "[[S")
	public final short[][] aShortArrayArray26;

	@OriginalMember(owner = "client!ru", name = "B", descriptor = "[[[Lclient!nea;")
	private Class5_Sub35[][][] aClass5_Sub35ArrayArrayArray1;

	@OriginalMember(owner = "client!ru", name = "u", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!ru", name = "R", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!ru", name = "pb", descriptor = "[[F")
	private float[][] aFloatArrayArray14;

	@OriginalMember(owner = "client!ru", name = "V", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!ru", name = "C", descriptor = "I")
	public final int anInt8612;

	@OriginalMember(owner = "client!ru", name = "mb", descriptor = "[[B")
	private byte[][] aByteArrayArray21;

	@OriginalMember(owner = "client!ru", name = "cb", descriptor = "I")
	private final int anInt8630;

	@OriginalMember(owner = "client!ru", name = "eb", descriptor = "Lclient!pl;")
	private Class273 aClass273_38;

	@OriginalMember(owner = "client!ru", name = "t", descriptor = "Lclient!tv;")
	private Class342 aClass342_2;

	@OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Lclient!rs;IIII[[I[[II)V")
	public Class61_Sub2(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass133_Sub3_27 = arg0;
		this.anInt8616 = super.anInt10031 - 2;
		this.aByteArrayArray20 = new byte[arg3][arg4];
		this.aFloatArrayArray15 = new float[super.anInt10026 + 1][super.anInt10029 + 1];
		this.anIntArrayArrayArray8 = new int[arg3][arg4][];
		this.aFloatArrayArray13 = new float[super.anInt10026 + 1][super.anInt10029 + 1];
		this.anIntArrayArrayArray9 = new int[arg3][arg4][];
		this.aShortArrayArray26 = new short[arg3 * arg4][];
		this.aClass5_Sub35ArrayArrayArray1 = new Class5_Sub35[arg3][arg4][];
		this.anIntArrayArrayArray7 = new int[arg3][arg4][];
		this.anIntArrayArrayArray11 = new int[arg3][arg4][];
		this.aFloatArrayArray14 = new float[super.anInt10026 + 1][super.anInt10029 + 1];
		this.anIntArrayArrayArray12 = new int[arg3][arg4][];
		this.anInt8612 = arg2;
		this.aByteArrayArray21 = new byte[arg3 + 1][arg4 + 1];
		this.anInt8630 = 0x1 << this.anInt8616;
		for (@Pc(115) int local115 = 1; super.anInt10029 > local115; local115++) {
			for (@Pc(119) int local119 = 1; local119 < super.anInt10026; local119++) {
				@Pc(137) int local137 = arg6[local119 + 1][local115] - arg6[local119 - 1][local115];
				@Pc(154) int local154 = arg6[local119][local115 + 1] - arg6[local119][local115 - 1];
				@Pc(173) float local173 = (float) (1.0D / Math.sqrt((double) (arg7 * 4 * arg7 + local137 * local137 + local154 * local154)));
				this.aFloatArrayArray13[local119][local115] = (float) local137 * local173;
				this.aFloatArrayArray14[local119][local115] = (float) (-arg7 * 2) * local173;
				this.aFloatArrayArray15[local119][local115] = local173 * (float) local154;
			}
		}
		this.aClass273_38 = new Class273(128);
		if ((this.anInt8612 & 0x10) != 0) {
			this.aClass342_2 = new Class342(this.aClass133_Sub3_27, this);
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method8576(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt8632 <= 0) {
			return;
		}
		this.aClass133_Sub3_27.method7379();
		this.aClass133_Sub3_27.method7325(false);
		this.aClass133_Sub3_27.method7359(false);
		this.aClass133_Sub3_27.method7386(false);
		this.aClass133_Sub3_27.method7346(false);
		this.aClass133_Sub3_27.method7388(0);
		this.aClass133_Sub3_27.method7395(-2);
		this.aClass133_Sub3_27.method7375(null);
		Static272.aFloatArray75[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass133_Sub3_27.anInt8481;
		Static272.aFloatArray75[12] = -1.0F - ((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass133_Sub3_27.anInt8510;
		Static272.aFloatArray75[10] = 0.0F;
		Static272.aFloatArray75[6] = 0.0F;
		Static272.aFloatArray75[3] = 0.0F;
		Static272.aFloatArray75[0] = (float) 1024 / ((float) this.aClass133_Sub3_27.anInt8510 * 128.0F * (float) super.anInt10027);
		Static272.aFloatArray75[7] = 0.0F;
		Static272.aFloatArray75[8] = 0.0F;
		Static272.aFloatArray75[15] = 1.0F;
		Static272.aFloatArray75[2] = 0.0F;
		Static272.aFloatArray75[5] = (float) 1024 / ((float) this.aClass133_Sub3_27.anInt8481 * 128.0F * (float) super.anInt10027);
		Static272.aFloatArray75[11] = 0.0F;
		Static272.aFloatArray75[9] = 0.0F;
		Static272.aFloatArray75[1] = 0.0F;
		Static272.aFloatArray75[14] = 0.0F;
		Static272.aFloatArray75[4] = 0.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static272.aFloatArray75, 0);
		Static272.aFloatArray75[6] = 1.0F;
		Static272.aFloatArray75[10] = 0.0F;
		Static272.aFloatArray75[4] = 0.0F;
		Static272.aFloatArray75[11] = 0.0F;
		Static272.aFloatArray75[14] = 0.0F;
		Static272.aFloatArray75[3] = 0.0F;
		Static272.aFloatArray75[13] = 0.0F;
		Static272.aFloatArray75[9] = 1.0F;
		Static272.aFloatArray75[15] = 1.0F;
		Static272.aFloatArray75[7] = 0.0F;
		Static272.aFloatArray75[1] = 0.0F;
		Static272.aFloatArray75[12] = 0.0F;
		Static272.aFloatArray75[0] = 1.0F;
		Static272.aFloatArray75[5] = 0.0F;
		Static272.aFloatArray75[2] = 0.0F;
		Static272.aFloatArray75[8] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static272.aFloatArray75, 0);
		if ((this.anInt8612 & 0x7) == 0) {
			this.aClass133_Sub3_27.method7359(false);
		} else {
			this.aClass133_Sub3_27.method7359(true);
			this.aClass133_Sub3_27.method7393();
		}
		this.aClass133_Sub3_27.method7396(this.aClass18_10, this.aClass18_9, this.aClass18_11, this.lb);
		if (this.aClass133_Sub3_27.aClass5_Sub22_Sub2_3.aByteArray71.length < this.anInt8627 * 2) {
			this.aClass133_Sub3_27.aClass5_Sub22_Sub2_3 = new Class5_Sub22_Sub2(this.anInt8627 * 2);
		} else {
			this.aClass133_Sub3_27.aClass5_Sub22_Sub2_3.anInt6629 = 0;
		}
		@Pc(318) int local318 = 0;
		@Pc(322) Class5_Sub22_Sub2 local322 = this.aClass133_Sub3_27.aClass5_Sub22_Sub2_3;
		@Pc(328) int local328;
		@Pc(337) int local337;
		@Pc(339) int local339;
		@Pc(357) short[] local357;
		@Pc(361) int local361;
		if (this.aClass133_Sub3_27.aBoolean611) {
			for (local328 = arg1; local328 < arg3; local328++) {
				local337 = arg0 + super.anInt10026 * local328;
				for (local339 = arg0; local339 < arg2; local339++) {
					if (arg4[local339 - arg0][local328 - arg1]) {
						local357 = this.aShortArrayArray26[local337];
						if (local357 != null) {
							for (local361 = 0; local361 < local357.length; local361++) {
								local318++;
								local322.method5918(local357[local361] & 0xFFFF);
							}
						}
					}
					local337++;
				}
			}
		} else {
			for (local328 = arg1; local328 < arg3; local328++) {
				local337 = arg0 + super.anInt10026 * local328;
				for (local339 = arg0; local339 < arg2; local339++) {
					if (arg4[local339 - arg0][local328 - arg1]) {
						local357 = this.aShortArrayArray26[local337];
						if (local357 != null) {
							for (local361 = 0; local361 < local357.length; local361++) {
								local318++;
								local322.method5948(local357[local361] & 0xFFFF);
							}
						}
					}
					local337++;
				}
			}
		}
		if (local318 > 0) {
			@Pc(473) Class164_Sub2 local473 = new Class164_Sub2(this.aClass133_Sub3_27, 5123, local322.aByteArray71, local322.anInt6629);
			this.aClass133_Sub3_27.method7383(0, local318, local473);
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lclient!vt;[I)V")
	@Override
	public void method8578(@OriginalArg(0) Class5_Sub11 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass330_54.method7917(new Class5_Sub30(this.aClass133_Sub3_27, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!ru", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		@Pc(9) Interface3 local9 = this.aClass133_Sub3_27.anInterface3_12;
		if (arg3 != null && this.anIntArrayArrayArray9 == null) {
			this.anIntArrayArrayArray9 = new int[super.anInt10026][super.anInt10029][];
		}
		if (arg5 != null && this.anIntArrayArrayArray10 == null) {
			this.anIntArrayArrayArray10 = new int[super.anInt10026][super.anInt10029][];
		}
		this.anIntArrayArrayArray11[arg0][arg1] = arg2;
		this.anIntArrayArrayArray8[arg0][arg1] = arg4;
		this.anIntArrayArrayArray7[arg0][arg1] = arg6;
		this.anIntArrayArrayArray12[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray10 != null) {
			this.anIntArrayArrayArray10[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray9 != null) {
			this.anIntArrayArrayArray9[arg0][arg1] = arg3;
		}
		@Pc(92) Class5_Sub35[] local92 = this.aClass5_Sub35ArrayArrayArray1[arg0][arg1] = new Class5_Sub35[arg6.length];
		for (@Pc(94) int local94 = 0; local94 < arg6.length; local94++) {
			@Pc(100) int local100 = arg8[local94];
			@Pc(104) int local104 = arg9[local94];
			if ((this.anInt8612 & 0x20) != 0 && local100 != -1 && local9.method4656(local100).aBoolean291) {
				local104 = 128;
				local100 = -1;
			}
			@Pc(146) long local146 = (long) (local104 << 14) | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28 | (long) local100;
			@Pc(152) Class5 local152;
			for (local152 = this.aClass273_38.method6581(local146); local152 != null; local152 = this.aClass273_38.method6582()) {
				@Pc(157) Class5_Sub35 local157 = (Class5_Sub35) local152;
				if (local100 == local157.anInt6130 && (float) local104 == local157.aFloat97 && arg10 == local157.anInt6125 && arg11 == local157.anInt6129 && arg12 == local157.anInt6133) {
					break;
				}
			}
			if (local152 == null) {
				local92[local94] = new Class5_Sub35(this, local100, local104, arg10, arg11, arg12);
				this.aClass273_38.method6585(local146, local92[local94]);
			} else {
				local92[local94] = (Class5_Sub35) local152;
			}
		}
		if (arg13) {
			this.aByteArrayArray20[arg0][arg1] = (byte) (this.aByteArrayArray20[arg0][arg1] | 0x1);
		}
		if (this.anInt8631 < arg6.length) {
			this.anInt8631 = arg6.length;
		}
		this.anInt8632 += arg6.length;
	}

	@OriginalMember(owner = "client!ru", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.anInt8632 <= 0) {
			this.aClass342_2 = null;
		} else {
			@Pc(19) byte[][] local19 = new byte[super.anInt10026 + 1][super.anInt10029 + 1];
			@Pc(25) int local25;
			for (@Pc(21) int local21 = 1; local21 < super.anInt10026; local21++) {
				for (local25 = 1; super.anInt10029 > local25; local25++) {
					local19[local21][local25] = (byte) ((this.aByteArrayArray21[local21 - 1][local25] >> 2) + (this.aByteArrayArray21[local21 + 1][local25] >> 3) + (this.aByteArrayArray21[local21][local25 + -1] >> 2) + (this.aByteArrayArray21[local21][local25 + 1] >> 3) + (this.aByteArrayArray21[local21][local25] >> 1));
				}
			}
			this.aClass5_Sub35Array1 = new Class5_Sub35[this.aClass273_38.method6580()];
			this.aClass273_38.method6584(this.aClass5_Sub35Array1);
			for (local25 = 0; local25 < this.aClass5_Sub35Array1.length; local25++) {
				this.aClass5_Sub35Array1[local25].method5438(this.anInt8632);
			}
			@Pc(137) int local137 = 24;
			if (this.anIntArrayArrayArray10 != null) {
				local137 += 4;
			}
			if ((this.anInt8612 & 0x7) != 0) {
				local137 += 12;
			}
			@Pc(157) NativeHeapBuffer local157 = this.aClass133_Sub3_27.aNativeHeap5.a(local137 * this.anInt8632, false);
			@Pc(162) Stream local162 = new Stream(local157);
			@Pc(166) Class5_Sub35[] local166 = new Class5_Sub35[this.anInt8632];
			@Pc(173) int local173 = Static460.method6846(this.anInt8632 / 4);
			if (local173 < 1) {
				local173 = 1;
			}
			@Pc(185) Class273 local185 = new Class273(local173);
			@Pc(189) Class5_Sub35[] local189 = new Class5_Sub35[this.anInt8631];
			@Pc(195) int local195;
			for (@Pc(191) int local191 = 0; super.anInt10026 > local191; local191++) {
				for (local195 = 0; local195 < super.anInt10029; local195++) {
					if (this.anIntArrayArrayArray7[local191][local195] != null) {
						@Pc(211) Class5_Sub35[] local211 = this.aClass5_Sub35ArrayArrayArray1[local191][local195];
						@Pc(218) int[] local218 = this.anIntArrayArrayArray11[local191][local195];
						@Pc(225) int[] local225 = this.anIntArrayArrayArray8[local191][local195];
						@Pc(232) int[] local232 = this.anIntArrayArrayArray12[local191][local195];
						@Pc(239) int[] local239 = this.anIntArrayArrayArray7[local191][local195];
						@Pc(251) int[] local251 = this.anIntArrayArrayArray9 == null ? null : this.anIntArrayArrayArray9[local191][local195];
						@Pc(263) int[] local263 = this.anIntArrayArrayArray10 == null ? null : this.anIntArrayArrayArray10[local191][local195];
						if (local232 == null) {
							local232 = local239;
						}
						@Pc(274) float local274 = this.aFloatArrayArray13[local191][local195];
						@Pc(281) float local281 = this.aFloatArrayArray14[local191][local195];
						@Pc(288) float local288 = this.aFloatArrayArray15[local191][local195];
						@Pc(297) float local297 = this.aFloatArrayArray13[local191][local195 + 1];
						@Pc(306) float local306 = this.aFloatArrayArray14[local191][local195 + 1];
						@Pc(315) float local315 = this.aFloatArrayArray15[local191][local195 + 1];
						@Pc(326) float local326 = this.aFloatArrayArray13[local191 + 1][local195 + 1];
						@Pc(337) float local337 = this.aFloatArrayArray14[local191 + 1][local195 + 1];
						@Pc(348) float local348 = this.aFloatArrayArray15[local191 + 1][local195 + 1];
						@Pc(357) float local357 = this.aFloatArrayArray13[local191 + 1][local195];
						@Pc(366) float local366 = this.aFloatArrayArray14[local191 + 1][local195];
						@Pc(375) float local375 = this.aFloatArrayArray15[local191 + 1][local195];
						@Pc(383) int local383 = local19[local191][local195] & 0xFF;
						@Pc(393) int local393 = local19[local191][local195 + 1] & 0xFF;
						@Pc(405) int local405 = local19[local191 + 1][local195 + 1] & 0xFF;
						@Pc(415) int local415 = local19[local191 + 1][local195] & 0xFF;
						@Pc(417) int local417 = 0;
						@Pc(427) int local427;
						label335: for (@Pc(419) int local419 = 0; local419 < local239.length; local419++) {
							@Pc(425) Class5_Sub35 local425 = local211[local419];
							for (local427 = 0; local427 < local417; local427++) {
								if (local189[local427] == local425) {
									continue label335;
								}
							}
							local189[local417++] = local425;
						}
						@Pc(469) short[] local469 = this.aShortArrayArray26[super.anInt10026 * local195 + local191] = new short[local239.length];
						for (local427 = 0; local427 < local239.length; local427++) {
							@Pc(483) int local483 = (local191 << super.anInt10031) + local218[local427];
							@Pc(492) int local492 = (local195 << super.anInt10031) + local225[local427];
							@Pc(497) int local497 = local483 >> this.anInt8616;
							@Pc(502) int local502 = local492 >> this.anInt8616;
							@Pc(506) int local506 = local239[local427];
							@Pc(510) int local510 = local232[local427];
							@Pc(518) int local518 = local251 == null ? 0 : local251[local427];
							@Pc(536) long local536 = (long) local502 | (long) local510 << 48 | (long) local506 << 32 | (long) (local497 << 16);
							@Pc(540) int local540 = local218[local427];
							@Pc(544) int local544 = local225[local427];
							@Pc(546) byte local546 = 74;
							@Pc(548) int local548 = 0;
							@Pc(550) float local550 = 1.0F;
							@Pc(577) float local577;
							@Pc(579) float local579;
							@Pc(585) float local585;
							@Pc(625) float local625;
							@Pc(583) int local583;
							if (local540 == 0 && local544 == 0) {
								local583 = local546 - local383;
								local577 = local274;
								local585 = local288;
								local579 = local281;
							} else if (local540 == 0 && local544 == super.anInt10027) {
								local579 = local306;
								local583 = local546 - local393;
								local585 = local315;
								local577 = local297;
							} else if (local540 == super.anInt10027 && super.anInt10027 == local544) {
								local577 = local326;
								local579 = local337;
								local583 = local546 - local405;
								local585 = local348;
							} else if (local540 == super.anInt10027 && local544 == 0) {
								local577 = local357;
								local579 = local366;
								local585 = local375;
								local583 = local546 - local415;
							} else {
								@Pc(600) float local600 = (float) local540 / (float) super.anInt10027;
								@Pc(607) float local607 = (float) local544 / (float) super.anInt10027;
								@Pc(616) float local616 = local274 + local600 * (local357 - local274);
								local625 = local281 + (local366 - local281) * local600;
								@Pc(634) float local634 = local288 + (local375 - local288) * local600;
								@Pc(642) float local642 = (local326 - local297) * local600 + local297;
								@Pc(651) float local651 = local306 + local600 * (local337 - local306);
								@Pc(659) float local659 = local315 + (local348 - local315) * local600;
								local577 = local607 * (local642 - local616) + local616;
								local579 = (local651 - local625) * local607 + local625;
								local585 = local634 + (local659 - local634) * local607;
								@Pc(696) int local696 = (local540 * (local415 - local383) >> super.anInt10031) + local383;
								@Pc(709) int local709 = local393 + (local540 * (local405 - local393) >> super.anInt10031);
								local583 = local546 - ((local709 - local696) * local544 >> super.anInt10031) - local696;
							}
							if (local506 != -1) {
								@Pc(771) int local771 = (local506 & 0x7F) * local583 >> 7;
								if (local771 < 2) {
									local771 = 2;
								} else if (local771 > 126) {
									local771 = 126;
								}
								local548 = Static349.anIntArray330[local506 & 0xFF80 | local771];
								if ((this.anInt8612 & 0x7) == 0) {
									local550 = this.aClass133_Sub3_27.aFloatArray67[0] * local577 + local579 * this.aClass133_Sub3_27.aFloatArray67[1] + local585 * this.aClass133_Sub3_27.aFloatArray67[2];
									local550 = (local550 > 0.0F ? this.aClass133_Sub3_27.aFloat149 : this.aClass133_Sub3_27.aFloat163) * local550 + this.aClass133_Sub3_27.aFloat150;
								}
							}
							@Pc(840) Class5 local840 = null;
							if ((local483 & this.anInt8630 - 1) == 0 && (this.anInt8630 - 1 & local492) == 0) {
								local840 = local185.method6581(local536);
							}
							@Pc(1200) int local1200;
							@Pc(870) int local870;
							if (local840 == null) {
								if (local506 == local510) {
									local870 = local548;
								} else {
									@Pc(880) int local880 = local583 * (local510 & 0x7F) >> 7;
									if (local880 < 2) {
										local880 = 2;
									} else if (local880 > 126) {
										local880 = 126;
									}
									local870 = Static349.anIntArray330[local510 & 0xFF80 | local880];
									if ((this.anInt8612 & 0x7) == 0) {
										local625 = local585 * this.aClass133_Sub3_27.aFloatArray67[2] + this.aClass133_Sub3_27.aFloatArray67[0] * local577 + this.aClass133_Sub3_27.aFloatArray67[1] * local579;
										local625 = (local550 > 0.0F ? this.aClass133_Sub3_27.aFloat149 : this.aClass133_Sub3_27.aFloat163) * local550 + this.aClass133_Sub3_27.aFloat150;
										@Pc(957) int local957 = local870 >> 16 & 0xFF;
										@Pc(963) int local963 = local870 >> 8 & 0xFF;
										@Pc(967) int local967 = local870 & 0xFF;
										local957 = (int) ((float) local957 * local625);
										local963 = (int) ((float) local963 * local625);
										if (local957 < 0) {
											local957 = 0;
										} else if (local957 > 255) {
											local957 = 255;
										}
										if (local963 < 0) {
											local963 = 0;
										} else if (local963 > 255) {
											local963 = 255;
										}
										local967 = (int) ((float) local967 * local625);
										if (local967 < 0) {
											local967 = 0;
										} else if (local967 > 255) {
											local967 = 255;
										}
										local870 = local967 | local957 << 16 | local963 << 8;
									}
								}
								if (this.aClass133_Sub3_27.aBoolean611) {
									local162.a((float) local483);
									local162.a((float) (this.method8584(local492, local483) + local518));
									local162.a((float) local492);
									local162.a((byte) (local870 >> 16));
									local162.a((byte) (local870 >> 8));
									local162.a((byte) local870);
									local162.a(-1);
									local162.a((float) local483);
									local162.a((float) local492);
									if (this.anIntArrayArrayArray10 != null) {
										local162.a((float) (local263 == null ? 0 : local263[local427] - 1));
									}
									if ((this.anInt8612 & 0x7) != 0) {
										local162.a(local577);
										local162.a(local579);
										local162.a(local585);
									}
								} else {
									local162.b((float) local483);
									local162.b((float) (local518 + this.method8584(local492, local483)));
									local162.b((float) local492);
									local162.a((byte) (local870 >> 16));
									local162.a((byte) (local870 >> 8));
									local162.a((byte) local870);
									local162.a(-1);
									local162.b((float) local483);
									local162.b((float) local492);
									if (this.anIntArrayArrayArray10 != null) {
										local162.b((float) (local263 == null ? 0 : local263[local427] - 1));
									}
									if ((this.anInt8612 & 0x7) != 0) {
										local162.b(local577);
										local162.b(local579);
										local162.b(local585);
									}
								}
								local1200 = this.anInt8624++;
								local469[local427] = (short) local1200;
								if (local506 != -1) {
									local166[local1200] = local211[local427];
								}
								local185.method6585(local536, new Class5_Sub12(local469[local427]));
							} else {
								local469[local427] = ((Class5_Sub12) local840).aShort32;
								local1200 = local469[local427] & 0xFFFF;
								if (local506 != -1 && local211[local427].aLong278 < local166[local1200].aLong278) {
									local166[local1200] = local211[local427];
								}
							}
							for (local870 = 0; local870 < local417; local870++) {
								local189[local870].method5441(local550, local1200, local583, local548);
							}
							this.anInt8627++;
						}
					}
				}
			}
			for (local195 = 0; local195 < this.anInt8624; local195++) {
				@Pc(1308) Class5_Sub35 local1308 = local166[local195];
				if (local1308 != null) {
					local1308.method5439(local195);
				}
			}
			@Pc(1341) int local1341;
			for (@Pc(1321) int local1321 = 0; local1321 < super.anInt10026; local1321++) {
				for (@Pc(1325) int local1325 = 0; super.anInt10029 > local1325; local1325++) {
					@Pc(1337) short[] local1337 = this.aShortArrayArray26[local1325 * super.anInt10026 + local1321];
					if (local1337 != null) {
						local1341 = 0;
						@Pc(1343) int local1343 = 0;
						while (local1343 < local1337.length) {
							@Pc(1352) int local1352 = local1337[local1343++] & 0xFFFF;
							@Pc(1359) int local1359 = local1337[local1343++] & 0xFFFF;
							@Pc(1366) int local1366 = local1337[local1343++] & 0xFFFF;
							@Pc(1370) Class5_Sub35 local1370 = local166[local1352];
							@Pc(1374) Class5_Sub35 local1374 = local166[local1359];
							@Pc(1378) Class5_Sub35 local1378 = local166[local1366];
							@Pc(1380) Class5_Sub35 local1380 = null;
							if (local1370 != null) {
								local1380 = local1370;
								local1370.method5436(local1341, local1321, local1325);
							}
							if (local1374 != null) {
								local1374.method5436(local1341, local1321, local1325);
								if (local1380 == null || local1374.aLong278 < local1380.aLong278) {
									local1380 = local1374;
								}
							}
							if (local1378 != null) {
								local1378.method5436(local1341, local1321, local1325);
								if (local1380 == null || local1380.aLong278 > local1378.aLong278) {
									local1380 = local1378;
								}
							}
							if (local1380 != null) {
								if (local1370 != null) {
									local1380.method5439(local1352);
								}
								if (local1374 != null) {
									local1380.method5439(local1359);
								}
								if (local1378 != null) {
									local1380.method5439(local1366);
								}
								local1380.method5436(local1341, local1321, local1325);
							}
							local1341++;
						}
					}
				}
			}
			local162.b();
			this.anInterface10_6 = this.aClass133_Sub3_27.method7403(local137, local162.c(), local157);
			this.lb = new Class18(this.anInterface10_6, 5126, 3, 0);
			this.aClass18_9 = new Class18(this.anInterface10_6, 5121, 4, 12);
			@Pc(1513) byte local1513;
			if (this.anIntArrayArrayArray10 == null) {
				local1513 = 24;
				this.aClass18_11 = new Class18(this.anInterface10_6, 5126, 2, 16);
			} else {
				this.aClass18_11 = new Class18(this.anInterface10_6, 5126, 3, 16);
				local1513 = 28;
			}
			if ((this.anInt8612 & 0x7) != 0) {
				this.aClass18_10 = new Class18(this.anInterface10_6, 5126, 3, local1513);
			}
			@Pc(1560) long[] local1560 = new long[this.aClass5_Sub35Array1.length];
			for (local1341 = 0; local1341 < this.aClass5_Sub35Array1.length; local1341++) {
				@Pc(1569) Class5_Sub35 local1569 = this.aClass5_Sub35Array1[local1341];
				local1560[local1341] = local1569.aLong278;
				local1569.method5440(this.anInt8624);
			}
			Static619.method8812(local1560, this.aClass5_Sub35Array1);
			if (this.aClass342_2 != null) {
				this.aClass342_2.method8069();
			}
		}
		this.anIntArrayArrayArray9 = null;
		this.anIntArrayArrayArray11 = this.anIntArrayArrayArray8 = null;
		this.anIntArrayArrayArray7 = null;
		this.aFloatArrayArray13 = this.aFloatArrayArray14 = this.aFloatArrayArray15 = null;
		this.anIntArrayArrayArray10 = null;
		this.aClass273_38 = null;
		this.aClass5_Sub35ArrayArrayArray1 = null;
		this.anIntArrayArrayArray12 = null;
		this.aByteArrayArray21 = null;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lclient!nj;III)V")
	private void method7442(@OriginalArg(0) Class5_Sub5_Sub14_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray11[arg2][arg1];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray8[arg2][arg1];
		@Pc(22) int local22 = local12.length;
		if (local22 > this.aClass133_Sub3_27.anIntArray480.length) {
			this.aClass133_Sub3_27.anIntArray480 = new int[local22];
			this.aClass133_Sub3_27.anIntArray479 = new int[local22];
		}
		@Pc(46) int[] local46 = this.aClass133_Sub3_27.anIntArray480;
		@Pc(50) int[] local50 = this.aClass133_Sub3_27.anIntArray479;
		for (@Pc(52) int local52 = 0; local52 < local22; local52++) {
			local46[local52] = local12[local52] >> this.aClass133_Sub3_27.anInt8529;
			local50[local52] = local19[local52] >> this.aClass133_Sub3_27.anInt8529;
		}
		@Pc(84) int local84 = 0;
		while (local22 > local84) {
			@Pc(90) int local90 = local46[local84];
			@Pc(95) int local95 = local50[local84++];
			@Pc(99) int local99 = local46[local84];
			@Pc(104) int local104 = local50[local84++];
			@Pc(108) int local108 = local46[local84];
			@Pc(113) int local113 = local50[local84++];
			if ((local104 - local113) * (local90 - local99) - (local108 - local99) * (local104 - local95) > 0) {
				arg0.method5521(local95, local113, local99, local108, local104, local90);
			}
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method8583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method7443(-1, arg5, arg1, arg0, arg4, arg2, arg3);
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIIIZI[[ZB)V")
	private void method7443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean[][] arg6) {
		if (this.aClass5_Sub35Array1 == null) {
			return;
		}
		@Pc(10) int local10 = arg5 + arg5 + 1;
		@Pc(14) int local14 = local10 * local10;
		if (this.aClass133_Sub3_27.anIntArray478.length < local14) {
			this.aClass133_Sub3_27.anIntArray478 = new int[local14];
		}
		if (this.aClass133_Sub3_27.aClass5_Sub22_Sub2_3.aByteArray71.length < this.anInt8627 * 2) {
			this.aClass133_Sub3_27.aClass5_Sub22_Sub2_3 = new Class5_Sub22_Sub2(this.anInt8627 * 2);
		}
		@Pc(53) int local53 = arg3 - arg5;
		@Pc(55) int local55 = local53;
		if (local53 < 0) {
			local53 = 0;
		}
		@Pc(64) int local64 = arg2 - arg5;
		@Pc(66) int local66 = local64;
		if (local64 < 0) {
			local64 = 0;
		}
		@Pc(77) int local77 = arg5 + arg3;
		if (local77 > super.anInt10026 - 1) {
			local77 = super.anInt10026 - 1;
		}
		@Pc(93) int local93 = arg2 + arg5;
		if (local93 > super.anInt10029 - 1) {
			local93 = super.anInt10029 - 1;
		}
		@Pc(106) int local106 = 0;
		@Pc(110) int[] local110 = this.aClass133_Sub3_27.anIntArray478;
		@Pc(123) int local123;
		for (@Pc(112) int local112 = local53; local112 <= local77; local112++) {
			@Pc(121) boolean[] local121 = arg6[local112 - local55];
			for (local123 = local64; local123 <= local93; local123++) {
				if (local121[local123 - local66]) {
					local110[local106++] = super.anInt10026 * local123 + local112;
				}
			}
		}
		if (arg0 == -1) {
			this.aClass133_Sub3_27.method7398();
		} else {
			this.aClass133_Sub3_27.method7384((float) arg0);
			this.aClass133_Sub3_27.method7377();
		}
		this.aClass133_Sub3_27.method7359((this.anInt8612 & 0x7) != 0);
		for (@Pc(191) int local191 = 0; local191 < this.aClass5_Sub35Array1.length; local191++) {
			this.aClass5_Sub35Array1[local191].method5442(local110, local106);
		}
		if (!this.aClass330_54.method7918()) {
			local123 = this.aClass133_Sub3_27.anInt8569;
			@Pc(224) int local224 = this.aClass133_Sub3_27.anInt8573;
			this.aClass133_Sub3_27.L(0, local224, this.aClass133_Sub3_27.anInt8542);
			this.aClass133_Sub3_27.method7359(false);
			this.aClass133_Sub3_27.method7346(false);
			this.aClass133_Sub3_27.method7388(128);
			this.aClass133_Sub3_27.method7395(-2);
			this.aClass133_Sub3_27.method7375(this.aClass133_Sub3_27.aClass167_Sub3_4);
			this.aClass133_Sub3_27.method7342(7681, 8448);
			this.aClass133_Sub3_27.method7326(0, 34166, 770);
			this.aClass133_Sub3_27.method7347(34167, 0);
			for (@Pc(284) Class5 local284 = this.aClass330_54.method7908(); local284 != null; local284 = this.aClass330_54.method7914()) {
				@Pc(289) Class5_Sub30 local289 = (Class5_Sub30) local284;
				local289.method4579(arg3, arg5, arg2, arg6);
			}
			this.aClass133_Sub3_27.method7326(0, 5890, 768);
			this.aClass133_Sub3_27.method7347(5890, 0);
			this.aClass133_Sub3_27.method7375(null);
			this.aClass133_Sub3_27.L(local123, local224, this.aClass133_Sub3_27.anInt8542);
		}
		if (this.aClass342_2 == null) {
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		this.aClass133_Sub3_27.method7396(null, null, this.aClass18_11, this.lb);
		this.aClass342_2.method8072(arg3, arg5, arg4, arg2, arg6);
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method8581(@OriginalArg(0) Class5_Sub5_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass342_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass133_Sub3_27.anInt8568 >> 8) >> this.aClass133_Sub3_27.anInt8529;
			@Pc(39) int local39 = arg3 - (this.aClass133_Sub3_27.anInt8548 * arg2 >> 8) >> this.aClass133_Sub3_27.anInt8529;
			return this.aClass342_2.method8068(local39, local24, arg0);
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(II)V")
	@Override
	public void method8577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ru", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray21[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray21[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!ru", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class5_Sub5_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass342_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass133_Sub3_27.anInt8568 * arg2 >> 8) >> this.aClass133_Sub3_27.anInt8529;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass133_Sub3_27.anInt8548 >> 8) >> this.aClass133_Sub3_27.anInt8529;
			this.aClass342_2.method8073(local39, arg0, local24);
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method8585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!ru", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class5_Sub5_Sub14 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub5_Sub14 arg2) {
		if ((this.aByteArrayArray20[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt10027 >> this.aClass133_Sub3_27.anInt8529;
		@Pc(27) Class5_Sub5_Sub14_Sub1 local27 = (Class5_Sub5_Sub14_Sub1) arg2;
		@Pc(37) Class5_Sub5_Sub14_Sub1 local37;
		if (local27 != null && local27.method5526(local24, local24)) {
			local37 = local27;
			local27.method5522();
		} else {
			local37 = new Class5_Sub5_Sub14_Sub1(this.aClass133_Sub3_27, local24, local24);
		}
		local37.method5524(0, local24, 0, local24);
		this.method7442(local37, arg1, arg0);
		return local37;
	}

	@OriginalMember(owner = "client!ru", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class5_Sub5_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass342_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass133_Sub3_27.anInt8568 * arg2 >> 8) >> this.aClass133_Sub3_27.anInt8529;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass133_Sub3_27.anInt8548 >> 8) >> this.aClass133_Sub3_27.anInt8529;
			this.aClass342_2.method8074(local24, arg0, local39);
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method8586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method7443(arg5, arg6, arg1, arg0, arg4, arg2, arg3);
	}
}
