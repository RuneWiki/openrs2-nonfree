import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class96_Sub2 extends Class96 {

	@OriginalMember(owner = "client!qd", name = "cb", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray19;

	@OriginalMember(owner = "client!qd", name = "hb", descriptor = "I")
	private int anInt8202;

	@OriginalMember(owner = "client!qd", name = "P", descriptor = "I")
	private int anInt8210;

	@OriginalMember(owner = "client!qd", name = "kb", descriptor = "[Lclient!ki;")
	private Class6_Sub28[] aClass6_Sub28Array1;

	@OriginalMember(owner = "client!qd", name = "gb", descriptor = "I")
	private int anInt8218;

	@OriginalMember(owner = "client!qd", name = "J", descriptor = "Lclient!so;")
	public Class332 aClass332_10;

	@OriginalMember(owner = "client!qd", name = "F", descriptor = "Lclient!aj;")
	private Interface2 anInterface2_5;

	@OriginalMember(owner = "client!qd", name = "q", descriptor = "Lclient!so;")
	public Class332 aClass332_11;

	@OriginalMember(owner = "client!qd", name = "p", descriptor = "I")
	private int anInt8219;

	@OriginalMember(owner = "client!qd", name = "E", descriptor = "Lclient!so;")
	public Class332 aClass332_12;

	@OriginalMember(owner = "client!qd", name = "bb", descriptor = "Lclient!so;")
	private Class332 aClass332_13;

	@OriginalMember(owner = "client!qd", name = "db", descriptor = "Lclient!tf;")
	private final Class340 aClass340_63 = new Class340();

	@OriginalMember(owner = "client!qd", name = "t", descriptor = "Lclient!ml;")
	public final Class75_Sub3 aClass75_Sub3_33;

	@OriginalMember(owner = "client!qd", name = "I", descriptor = "I")
	private final int anInt8206;

	@OriginalMember(owner = "client!qd", name = "G", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray18;

	@OriginalMember(owner = "client!qd", name = "v", descriptor = "[[B")
	private byte[][] aByteArrayArray147;

	@OriginalMember(owner = "client!qd", name = "r", descriptor = "I")
	private final int anInt8197;

	@OriginalMember(owner = "client!qd", name = "H", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray20;

	@OriginalMember(owner = "client!qd", name = "s", descriptor = "[[B")
	private final byte[][] aByteArrayArray146;

	@OriginalMember(owner = "client!qd", name = "lb", descriptor = "[[F")
	private float[][] lb;

	@OriginalMember(owner = "client!qd", name = "Z", descriptor = "[[S")
	public final short[][] aShortArrayArray12;

	@OriginalMember(owner = "client!qd", name = "fb", descriptor = "I")
	public final int anInt8215;

	@OriginalMember(owner = "client!qd", name = "K", descriptor = "[[F")
	private float[][] aFloatArrayArray12;

	@OriginalMember(owner = "client!qd", name = "ib", descriptor = "[[F")
	private float[][] aFloatArrayArray13;

	@OriginalMember(owner = "client!qd", name = "M", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray21;

	@OriginalMember(owner = "client!qd", name = "X", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!qd", name = "z", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray17;

	@OriginalMember(owner = "client!qd", name = "Q", descriptor = "[[[Lclient!ki;")
	private Class6_Sub28[][][] aClass6_Sub28ArrayArrayArray1;

	@OriginalMember(owner = "client!qd", name = "W", descriptor = "Lclient!dfa;")
	private Class74 aClass74_56;

	@OriginalMember(owner = "client!qd", name = "D", descriptor = "Lclient!ko;")
	private Class213 aClass213_2;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lclient!ml;IIII[[I[[II)V")
	public Class96_Sub2(@OriginalArg(0) Class75_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass75_Sub3_33 = arg0;
		this.anInt8206 = super.anInt9248 - 2;
		this.anIntArrayArrayArray18 = new int[arg3][arg4][];
		this.aByteArrayArray147 = new byte[arg3 + 1][arg4 + 1];
		this.anInt8197 = 0x1 << this.anInt8206;
		this.anIntArrayArrayArray20 = new int[arg3][arg4][];
		this.aByteArrayArray146 = new byte[arg3][arg4];
		this.lb = new float[super.anInt9255 + 1][super.anInt9257 + 1];
		this.aShortArrayArray12 = new short[arg4 * arg3][];
		this.anInt8215 = arg2;
		this.aFloatArrayArray12 = new float[super.anInt9255 + 1][super.anInt9257 + 1];
		this.aFloatArrayArray13 = new float[super.anInt9255 + 1][super.anInt9257 + 1];
		this.anIntArrayArrayArray21 = new int[arg3][arg4][];
		this.anIntArrayArrayArray16 = new int[arg3][arg4][];
		this.anIntArrayArrayArray17 = new int[arg3][arg4][];
		this.aClass6_Sub28ArrayArrayArray1 = new Class6_Sub28[arg3][arg4][];
		for (@Pc(115) int local115 = 1; local115 < super.anInt9257; local115++) {
			for (@Pc(121) int local121 = 1; super.anInt9255 > local121; local121++) {
				@Pc(140) int local140 = arg6[local121 + 1][local115] - arg6[local121 - 1][local115];
				@Pc(157) int local157 = arg6[local121][local115 + 1] - arg6[local121][local115 - 1];
				@Pc(177) float local177 = (float) (1.0D / Math.sqrt((double) (local140 * local140 + arg7 * 4 * arg7 + local157 * local157)));
				this.aFloatArrayArray13[local121][local115] = local177 * (float) local140;
				this.lb[local121][local115] = local177 * (float) (-arg7 * 2);
				this.aFloatArrayArray12[local121][local115] = local177 * (float) local157;
			}
		}
		this.aClass74_56 = new Class74(128);
		if ((this.anInt8215 & 0x10) != 0) {
			this.aClass213_2 = new Class213(this.aClass75_Sub3_33, this);
		}
	}

	@OriginalMember(owner = "client!qd", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray147[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray147[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method8081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!qd", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class6_Sub2_Sub18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass213_2 != null && arg0 != null) {
			@Pc(26) int local26 = arg1 - (arg2 * this.aClass75_Sub3_33.anInt6572 >> 8) >> this.aClass75_Sub3_33.anInt6531;
			@Pc(41) int local41 = arg3 - (arg2 * this.aClass75_Sub3_33.anInt6557 >> 8) >> this.aClass75_Sub3_33.anInt6531;
			this.aClass213_2.method5034(arg0, local26, local41);
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)V")
	@Override
	public void method8071(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!qd", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		@Pc(9) Interface11 local9 = this.aClass75_Sub3_33.anInterface11_10;
		if (arg5 != null && this.anIntArrayArrayArray19 == null) {
			this.anIntArrayArrayArray19 = new int[super.anInt9255][super.anInt9257][];
		}
		if (arg3 != null && this.anIntArrayArrayArray21 == null) {
			this.anIntArrayArrayArray21 = new int[super.anInt9255][super.anInt9257][];
		}
		this.anIntArrayArrayArray17[arg0][arg1] = arg2;
		this.anIntArrayArrayArray18[arg0][arg1] = arg4;
		this.anIntArrayArrayArray16[arg0][arg1] = arg6;
		this.anIntArrayArrayArray20[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray19 != null) {
			this.anIntArrayArrayArray19[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray21 != null) {
			this.anIntArrayArrayArray21[arg0][arg1] = arg3;
		}
		@Pc(104) Class6_Sub28[] local104 = this.aClass6_Sub28ArrayArrayArray1[arg0][arg1] = new Class6_Sub28[arg6.length];
		for (@Pc(106) int local106 = 0; local106 < arg6.length; local106++) {
			@Pc(114) int local114 = arg8[local106];
			@Pc(118) int local118 = arg9[local106];
			if ((this.anInt8215 & 0x20) != 0 && local114 != -1 && local9.method6027(local114).aBoolean625) {
				local118 = 128;
				local114 = -1;
			}
			@Pc(167) long local167 = (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42 | (long) (local118 << 14) | (long) local114;
			@Pc(173) Class6 local173;
			for (local173 = this.aClass74_56.method1401(local167); local173 != null; local173 = this.aClass74_56.method1407()) {
				@Pc(180) Class6_Sub28 local180 = (Class6_Sub28) local173;
				if (local180.anInt5444 == local114 && (float) local118 == local180.aFloat103 && arg10 == local180.anInt5439 && local180.anInt5440 == arg11 && local180.anInt5442 == arg12) {
					break;
				}
			}
			if (local173 == null) {
				local104[local106] = new Class6_Sub28(this, local114, local118, arg10, arg11, arg12);
				this.aClass74_56.method1399(local104[local106], local167);
			} else {
				local104[local106] = (Class6_Sub28) local173;
			}
		}
		if (arg13) {
			this.aByteArrayArray146[arg0][arg1] = (byte) (this.aByteArrayArray146[arg0][arg1] | 0x1);
		}
		if (this.anInt8219 < arg6.length) {
			this.anInt8219 = arg6.length;
		}
		this.anInt8218 += arg6.length;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method8079(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method7187(arg0, arg4, arg5, arg3, arg1, arg6, arg2);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method8072(@OriginalArg(0) Class6_Sub2_Sub18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass213_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(28) int local28 = arg1 - (this.aClass75_Sub3_33.anInt6572 * arg2 >> 8) >> this.aClass75_Sub3_33.anInt6531;
			@Pc(42) int local42 = arg3 - (this.aClass75_Sub3_33.anInt6557 * arg2 >> 8) >> this.aClass75_Sub3_33.anInt6531;
			return this.aClass213_2.method5041(arg0, local28, local42);
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method8082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method7187(arg0, arg4, -1, arg3, arg1, arg5, arg2);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!ta;[I)V")
	@Override
	public void method8075(@OriginalArg(0) Class6_Sub10 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass340_63.method8131(new Class6_Sub31(this.aClass75_Sub3_33, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!qd", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.anInt8218 > 0) {
			@Pc(21) byte[][] local21 = new byte[super.anInt9255 + 1][super.anInt9257 + 1];
			@Pc(27) int local27;
			for (@Pc(23) int local23 = 1; super.anInt9255 > local23; local23++) {
				for (local27 = 1; super.anInt9257 > local27; local27++) {
					local21[local23][local27] = (byte) ((this.aByteArrayArray147[local23][local27 + 1] >> 3) + (this.aByteArrayArray147[local23 - 1][local27] >> 2) + (this.aByteArrayArray147[local23 + 1][local27] >> 3) + (this.aByteArrayArray147[local23][local27 + -1] >> 2) + (this.aByteArrayArray147[local23][local27] >> 1));
				}
			}
			this.aClass6_Sub28Array1 = new Class6_Sub28[this.aClass74_56.method1400()];
			this.aClass74_56.method1402(this.aClass6_Sub28Array1);
			for (local27 = 0; local27 < this.aClass6_Sub28Array1.length; local27++) {
				this.aClass6_Sub28Array1[local27].method4967(this.anInt8218);
			}
			@Pc(149) int local149 = 24;
			if (this.anIntArrayArrayArray19 != null) {
				local149 += 4;
			}
			if ((this.anInt8215 & 0x7) != 0) {
				local149 += 12;
			}
			@Pc(178) NativeHeapBuffer local178 = this.aClass75_Sub3_33.aNativeHeap4.a(this.anInt8218 * local149, false);
			@Pc(183) Stream local183 = new Stream(local178);
			@Pc(187) Class6_Sub28[] local187 = new Class6_Sub28[this.anInt8218];
			@Pc(194) int local194 = Static468.method7064(this.anInt8218 / 4);
			if (local194 < 1) {
				local194 = 1;
			}
			@Pc(206) Class74 local206 = new Class74(local194);
			@Pc(210) Class6_Sub28[] local210 = new Class6_Sub28[this.anInt8219];
			@Pc(216) int local216;
			for (@Pc(212) int local212 = 0; local212 < super.anInt9255; local212++) {
				for (local216 = 0; local216 < super.anInt9257; local216++) {
					if (this.anIntArrayArrayArray16[local212][local216] != null) {
						@Pc(234) Class6_Sub28[] local234 = this.aClass6_Sub28ArrayArrayArray1[local212][local216];
						@Pc(241) int[] local241 = this.anIntArrayArrayArray17[local212][local216];
						@Pc(248) int[] local248 = this.anIntArrayArrayArray18[local212][local216];
						@Pc(255) int[] local255 = this.anIntArrayArrayArray20[local212][local216];
						@Pc(262) int[] local262 = this.anIntArrayArrayArray16[local212][local216];
						@Pc(275) int[] local275 = this.anIntArrayArrayArray21 == null ? null : this.anIntArrayArrayArray21[local212][local216];
						if (local255 == null) {
							local255 = local262;
						}
						@Pc(292) int[] local292 = this.anIntArrayArrayArray19 == null ? null : this.anIntArrayArrayArray19[local212][local216];
						@Pc(299) float local299 = this.aFloatArrayArray13[local212][local216];
						@Pc(306) float local306 = this.lb[local212][local216];
						@Pc(313) float local313 = this.aFloatArrayArray12[local212][local216];
						@Pc(322) float local322 = this.aFloatArrayArray13[local212][local216 + 1];
						@Pc(331) float local331 = this.lb[local212][local216 + 1];
						@Pc(340) float local340 = this.aFloatArrayArray12[local212][local216 + 1];
						@Pc(351) float local351 = this.aFloatArrayArray13[local212 + 1][local216 + 1];
						@Pc(362) float local362 = this.lb[local212 + 1][local216 + 1];
						@Pc(373) float local373 = this.aFloatArrayArray12[local212 + 1][local216 + 1];
						@Pc(382) float local382 = this.aFloatArrayArray13[local212 + 1][local216];
						@Pc(391) float local391 = this.lb[local212 + 1][local216];
						@Pc(400) float local400 = this.aFloatArrayArray12[local212 + 1][local216];
						@Pc(408) int local408 = local21[local212][local216] & 0xFF;
						@Pc(418) int local418 = local21[local212][local216 + 1] & 0xFF;
						@Pc(430) int local430 = local21[local212 + 1][local216 + 1] & 0xFF;
						@Pc(440) int local440 = local21[local212 + 1][local216] & 0xFF;
						@Pc(442) int local442 = 0;
						@Pc(452) int local452;
						label337: for (@Pc(444) int local444 = 0; local444 < local262.length; local444++) {
							@Pc(450) Class6_Sub28 local450 = local234[local444];
							for (local452 = 0; local452 < local442; local452++) {
								if (local210[local452] == local450) {
									continue label337;
								}
							}
							local210[local442++] = local450;
						}
						@Pc(503) short[] local503 = this.aShortArrayArray12[super.anInt9255 * local216 + local212] = new short[local262.length];
						for (local452 = 0; local452 < local262.length; local452++) {
							@Pc(517) int local517 = (local212 << super.anInt9248) + local241[local452];
							@Pc(526) int local526 = (local216 << super.anInt9248) + local248[local452];
							@Pc(531) int local531 = local517 >> this.anInt8206;
							@Pc(536) int local536 = local526 >> this.anInt8206;
							@Pc(540) int local540 = local262[local452];
							@Pc(544) int local544 = local255[local452];
							@Pc(553) int local553 = local275 == null ? 0 : local275[local452];
							@Pc(571) long local571 = (long) local540 << 32 | (long) local544 << 48 | (long) (local531 << 16) | (long) local536;
							@Pc(575) int local575 = local241[local452];
							@Pc(579) int local579 = local248[local452];
							@Pc(581) byte local581 = 74;
							@Pc(583) int local583 = 0;
							@Pc(585) float local585 = 1.0F;
							@Pc(607) float local607;
							@Pc(603) float local603;
							@Pc(605) float local605;
							@Pc(691) float local691;
							@Pc(601) int local601;
							if (local575 == 0 && local579 == 0) {
								local601 = local581 - local408;
								local603 = local306;
								local605 = local313;
								local607 = local299;
							} else if (local575 == 0 && super.anInt9246 == local579) {
								local603 = local331;
								local601 = local581 - local418;
								local605 = local340;
								local607 = local322;
							} else if (super.anInt9246 == local575 && super.anInt9246 == local579) {
								local607 = local351;
								local603 = local362;
								local601 = local581 - local430;
								local605 = local373;
							} else if (local575 == super.anInt9246 && local579 == 0) {
								local607 = local382;
								local601 = local581 - local440;
								local605 = local400;
								local603 = local391;
							} else {
								@Pc(667) float local667 = (float) local575 / (float) super.anInt9246;
								@Pc(674) float local674 = (float) local579 / (float) super.anInt9246;
								@Pc(683) float local683 = local667 * (local382 - local299) + local299;
								local691 = local306 + (local391 - local306) * local667;
								@Pc(700) float local700 = (local400 - local313) * local667 + local313;
								@Pc(709) float local709 = local667 * (local351 - local322) + local322;
								@Pc(717) float local717 = (local362 - local331) * local667 + local331;
								@Pc(725) float local725 = local340 + local667 * (local373 - local340);
								local607 = (local709 - local683) * local674 + local683;
								local603 = (local717 - local691) * local674 + local691;
								local605 = (local725 - local700) * local674 + local700;
								@Pc(760) int local760 = (local575 * (local440 - local408) >> super.anInt9248) + local408;
								@Pc(771) int local771 = local418 + ((local430 - local418) * local575 >> super.anInt9248);
								local601 = local581 - local760 - ((local771 - local760) * local579 >> super.anInt9248);
							}
							if (local540 != -1) {
								@Pc(833) int local833 = local601 * (local540 & 0x7F) >> 7;
								if (local833 < 2) {
									local833 = 2;
								} else if (local833 > 126) {
									local833 = 126;
								}
								if ((this.anInt8215 & 0x7) == 0) {
									local585 = local605 * this.aClass75_Sub3_33.aFloatArray51[2] + this.aClass75_Sub3_33.aFloatArray51[1] * local603 + this.aClass75_Sub3_33.aFloatArray51[0] * local607;
									local585 = (local585 > 0.0F ? this.aClass75_Sub3_33.aFloat131 : this.aClass75_Sub3_33.aFloat115) * local585 + this.aClass75_Sub3_33.aFloat132;
								}
								local583 = Static229.anIntArray228[local540 & 0xFF80 | local833];
							}
							@Pc(910) Class6 local910 = null;
							if ((this.anInt8197 - 1 & local517) == 0 && (this.anInt8197 - 1 & local526) == 0) {
								local910 = local206.method1401(local571);
							}
							@Pc(1308) int local1308;
							@Pc(975) int local975;
							if (local910 == null) {
								if (local540 == local544) {
									local975 = local583;
								} else {
									@Pc(953) int local953 = (local544 & 0x7F) * local601 >> 7;
									if (local953 < 2) {
										local953 = 2;
									} else if (local953 > 126) {
										local953 = 126;
									}
									local975 = Static229.anIntArray228[local953 | local544 & 0xFF80];
									if ((this.anInt8215 & 0x7) == 0) {
										local691 = local605 * this.aClass75_Sub3_33.aFloatArray51[2] + local607 * this.aClass75_Sub3_33.aFloatArray51[0] + this.aClass75_Sub3_33.aFloatArray51[1] * local603;
										local691 = this.aClass75_Sub3_33.aFloat132 + (local585 > 0.0F ? this.aClass75_Sub3_33.aFloat131 : this.aClass75_Sub3_33.aFloat115) * local585;
										@Pc(1032) int local1032 = local975 >> 16 & 0xFF;
										@Pc(1038) int local1038 = local975 >> 8 & 0xFF;
										@Pc(1042) int local1042 = local975 & 0xFF;
										local1032 = (int) ((float) local1032 * local691);
										if (local1032 < 0) {
											local1032 = 0;
										} else if (local1032 > 255) {
											local1032 = 255;
										}
										local1038 = (int) ((float) local1038 * local691);
										if (local1038 < 0) {
											local1038 = 0;
										} else if (local1038 > 255) {
											local1038 = 255;
										}
										local1042 = (int) ((float) local1042 * local691);
										if (local1042 < 0) {
											local1042 = 0;
										} else if (local1042 > 255) {
											local1042 = 255;
										}
										local975 = local1042 | local1038 << 8 | local1032 << 16;
									}
								}
								if (this.aClass75_Sub3_33.aBoolean480) {
									local183.a((float) local517);
									local183.a((float) (local553 + this.method8077(local517, local526)));
									local183.a((float) local526);
									local183.c((byte) (local975 >> 16));
									local183.c((byte) (local975 >> 8));
									local183.c((byte) local975);
									local183.c(-1);
									local183.a((float) local517);
									local183.a((float) local526);
									if (this.anIntArrayArrayArray19 != null) {
										local183.a((float) (local292 == null ? 0 : local292[local452] - 1));
									}
									if ((this.anInt8215 & 0x7) != 0) {
										local183.a(local607);
										local183.a(local603);
										local183.a(local605);
									}
								} else {
									local183.b((float) local517);
									local183.b((float) (this.method8077(local517, local526) + local553));
									local183.b((float) local526);
									local183.c((byte) (local975 >> 16));
									local183.c((byte) (local975 >> 8));
									local183.c((byte) local975);
									local183.c(-1);
									local183.b((float) local517);
									local183.b((float) local526);
									if (this.anIntArrayArrayArray19 != null) {
										local183.b((float) (local292 == null ? 0 : local292[local452] - 1));
									}
									if ((this.anInt8215 & 0x7) != 0) {
										local183.b(local607);
										local183.b(local603);
										local183.b(local605);
									}
								}
								local1308 = this.anInt8202++;
								local503[local452] = (short) local1308;
								if (local540 != -1) {
									local187[local1308] = local234[local452];
								}
								local206.method1399(new Class6_Sub52(local503[local452]), local571);
							} else {
								local503[local452] = ((Class6_Sub52) local910).aShort130;
								local1308 = local503[local452] & 0xFFFF;
								if (local540 != -1 && local187[local1308].aLong346 > local234[local452].aLong346) {
									local187[local1308] = local234[local452];
								}
							}
							for (local975 = 0; local975 < local442; local975++) {
								local210[local975].method4968(local1308, local585, local583, local601);
							}
							this.anInt8210++;
						}
					}
				}
			}
			for (local216 = 0; local216 < this.anInt8202; local216++) {
				@Pc(1438) Class6_Sub28 local1438 = local187[local216];
				if (local1438 != null) {
					local1438.method4961(local216);
				}
			}
			@Pc(1473) int local1473;
			for (@Pc(1453) int local1453 = 0; super.anInt9255 > local1453; local1453++) {
				for (@Pc(1457) int local1457 = 0; super.anInt9257 > local1457; local1457++) {
					@Pc(1469) short[] local1469 = this.aShortArrayArray12[super.anInt9255 * local1457 + local1453];
					if (local1469 != null) {
						local1473 = 0;
						@Pc(1475) int local1475 = 0;
						while (local1469.length > local1475) {
							@Pc(1484) int local1484 = local1469[local1475++] & 0xFFFF;
							@Pc(1491) int local1491 = local1469[local1475++] & 0xFFFF;
							@Pc(1498) int local1498 = local1469[local1475++] & 0xFFFF;
							@Pc(1502) Class6_Sub28 local1502 = local187[local1484];
							@Pc(1506) Class6_Sub28 local1506 = local187[local1491];
							@Pc(1510) Class6_Sub28 local1510 = local187[local1498];
							@Pc(1512) Class6_Sub28 local1512 = null;
							if (local1502 != null) {
								local1512 = local1502;
								local1502.method4964(local1473, local1457, local1453);
							}
							if (local1506 != null) {
								local1506.method4964(local1473, local1457, local1453);
								if (local1512 == null || local1506.aLong346 < local1512.aLong346) {
									local1512 = local1506;
								}
							}
							if (local1510 != null) {
								local1510.method4964(local1473, local1457, local1453);
								if (local1512 == null || local1510.aLong346 < local1512.aLong346) {
									local1512 = local1510;
								}
							}
							if (local1512 != null) {
								if (local1502 != null) {
									local1512.method4961(local1484);
								}
								if (local1506 != null) {
									local1512.method4961(local1491);
								}
								if (local1510 != null) {
									local1512.method4961(local1498);
								}
								local1512.method4964(local1473, local1457, local1453);
							}
							local1473++;
						}
					}
				}
			}
			local183.a();
			this.anInterface2_5 = this.aClass75_Sub3_33.method5773(local183.c(), local149, local178);
			this.aClass332_11 = new Class332(this.anInterface2_5, 5126, 3, 0);
			this.aClass332_13 = new Class332(this.anInterface2_5, 5121, 4, 12);
			@Pc(1681) byte local1681;
			if (this.anIntArrayArrayArray19 == null) {
				this.aClass332_10 = new Class332(this.anInterface2_5, 5126, 2, 16);
				local1681 = 24;
			} else {
				local1681 = 28;
				this.aClass332_10 = new Class332(this.anInterface2_5, 5126, 3, 16);
			}
			if ((this.anInt8215 & 0x7) != 0) {
				this.aClass332_12 = new Class332(this.anInterface2_5, 5126, 3, local1681);
			}
			@Pc(1717) long[] local1717 = new long[this.aClass6_Sub28Array1.length];
			for (local1473 = 0; local1473 < this.aClass6_Sub28Array1.length; local1473++) {
				@Pc(1728) Class6_Sub28 local1728 = this.aClass6_Sub28Array1[local1473];
				local1717[local1473] = local1728.aLong346;
				local1728.method4962(this.anInt8202);
			}
			Static487.method8938(this.aClass6_Sub28Array1, local1717);
			if (this.aClass213_2 != null) {
				this.aClass213_2.method5039(-124);
			}
		} else {
			this.aClass213_2 = null;
		}
		this.anIntArrayArrayArray19 = null;
		this.anIntArrayArrayArray20 = null;
		this.anIntArrayArrayArray16 = null;
		this.aClass74_56 = null;
		this.anIntArrayArrayArray21 = null;
		this.anIntArrayArrayArray17 = this.anIntArrayArrayArray18 = null;
		this.aFloatArrayArray13 = this.lb = this.aFloatArrayArray12 = null;
		this.aByteArrayArray147 = null;
		this.aClass6_Sub28ArrayArrayArray1 = null;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IILclient!sc;I)V")
	private void method7186(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub2_Sub18_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray17[arg2][arg0];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray18[arg2][arg0];
		@Pc(22) int local22 = local12.length;
		if (this.aClass75_Sub3_33.anIntArray371.length < local22) {
			this.aClass75_Sub3_33.anIntArray372 = new int[local22];
			this.aClass75_Sub3_33.anIntArray371 = new int[local22];
		}
		@Pc(56) int[] local56 = this.aClass75_Sub3_33.anIntArray371;
		@Pc(60) int[] local60 = this.aClass75_Sub3_33.anIntArray372;
		for (@Pc(62) int local62 = 0; local62 < local22; local62++) {
			local56[local62] = local12[local62] >> this.aClass75_Sub3_33.anInt6531;
			local60[local62] = local19[local62] >> this.aClass75_Sub3_33.anInt6531;
		}
		@Pc(92) int local92 = 0;
		while (local22 > local92) {
			@Pc(100) int local100 = local56[local92];
			@Pc(105) int local105 = local60[local92++];
			@Pc(109) int local109 = local56[local92];
			@Pc(114) int local114 = local60[local92++];
			@Pc(118) int local118 = local56[local92];
			@Pc(123) int local123 = local60[local92++];
			if (-((local114 - local105) * (local118 + -local109)) + (local114 - local123) * (local100 + -local109) > 0) {
				arg1.method7741(local100, local118, local114, local109, local105, local123);
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class6_Sub2_Sub18 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub2_Sub18 arg2) {
		if ((this.aByteArrayArray146[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(22) int local22 = super.anInt9246 >> this.aClass75_Sub3_33.anInt6531;
		@Pc(25) Class6_Sub2_Sub18_Sub1 local25 = (Class6_Sub2_Sub18_Sub1) arg2;
		@Pc(43) Class6_Sub2_Sub18_Sub1 local43;
		if (local25 != null && local25.method7744(local22, local22)) {
			local43 = local25;
			local25.method7742();
		} else {
			local43 = new Class6_Sub2_Sub18_Sub1(this.aClass75_Sub3_33, local22, local22);
		}
		local43.method7738(0, local22, local22, 0);
		this.method7186(arg1, local43, arg0);
		return local43;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IZI[[ZIIZI)V")
	private void method7187(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (this.aClass6_Sub28Array1 == null) {
			return;
		}
		@Pc(23) int local23 = arg6 + arg6 + 1;
		@Pc(27) int local27 = local23 * local23;
		if (local27 > this.aClass75_Sub3_33.anIntArray373.length) {
			this.aClass75_Sub3_33.anIntArray373 = new int[local27];
		}
		if (this.anInt8210 * 2 > this.aClass75_Sub3_33.aClass6_Sub15_Sub2_2.aByteArray20.length) {
			this.aClass75_Sub3_33.aClass6_Sub15_Sub2_2 = new Class6_Sub15_Sub2(this.anInt8210 * 2);
		}
		@Pc(71) int local71 = arg0 - arg6;
		@Pc(73) int local73 = local71;
		if (local71 < 0) {
			local71 = 0;
		}
		@Pc(82) int local82 = arg4 - arg6;
		@Pc(84) int local84 = local82;
		if (local82 < 0) {
			local82 = 0;
		}
		@Pc(92) int local92 = arg6 + arg0;
		if (super.anInt9255 - 1 < local92) {
			local92 = super.anInt9255 - 1;
		}
		@Pc(112) int local112 = arg4 + arg6;
		if (super.anInt9257 - 1 < local112) {
			local112 = super.anInt9257 - 1;
		}
		@Pc(125) int local125 = 0;
		@Pc(129) int[] local129 = this.aClass75_Sub3_33.anIntArray373;
		@Pc(142) int local142;
		for (@Pc(131) int local131 = local71; local131 <= local92; local131++) {
			@Pc(140) boolean[] local140 = arg3[local131 - local73];
			for (local142 = local82; local142 <= local112; local142++) {
				if (local140[local142 - local84]) {
					local129[local125++] = local131 + local142 * super.anInt9255;
				}
			}
		}
		if (arg2 == -1) {
			this.aClass75_Sub3_33.method5792();
		} else {
			this.aClass75_Sub3_33.method5808((float) arg2);
			this.aClass75_Sub3_33.method5842();
		}
		this.aClass75_Sub3_33.method5840((this.anInt8215 & 0x7) != 0);
		for (@Pc(221) int local221 = 0; local221 < this.aClass6_Sub28Array1.length; local221++) {
			this.aClass6_Sub28Array1[local221].method4969(local125, local129);
		}
		if (!this.aClass340_63.method8121()) {
			local142 = this.aClass75_Sub3_33.anInt6553;
			@Pc(260) int local260 = this.aClass75_Sub3_33.anInt6554;
			this.aClass75_Sub3_33.L(0, local260, this.aClass75_Sub3_33.anInt6564);
			this.aClass75_Sub3_33.method5840(false);
			this.aClass75_Sub3_33.method5788(false);
			this.aClass75_Sub3_33.method5826(128);
			this.aClass75_Sub3_33.method5781(-2);
			this.aClass75_Sub3_33.method5774(this.aClass75_Sub3_33.aClass44_Sub1_3);
			this.aClass75_Sub3_33.method5784(7681, 8448);
			this.aClass75_Sub3_33.method5825(770, 0, 34166);
			this.aClass75_Sub3_33.method5806(0, 34167);
			for (@Pc(320) Class6 local320 = this.aClass340_63.method8124(); local320 != null; local320 = this.aClass340_63.method8134()) {
				@Pc(325) Class6_Sub31 local325 = (Class6_Sub31) local320;
				local325.method5169(arg3, arg4, arg0, arg6);
			}
			this.aClass75_Sub3_33.method5825(768, 0, 5890);
			this.aClass75_Sub3_33.method5806(0, 5890);
			this.aClass75_Sub3_33.method5774((Class44) null);
			this.aClass75_Sub3_33.L(local142, local260, this.aClass75_Sub3_33.anInt6564);
		}
		if (this.aClass213_2 == null) {
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		this.aClass75_Sub3_33.method5809((Class332) null, this.aClass332_10, (Class332) null, this.aClass332_11);
		this.aClass213_2.method5040(arg4, arg0, arg3, arg6, arg1);
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!qd", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class6_Sub2_Sub18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass213_2 != null && arg0 != null) {
			@Pc(27) int local27 = arg1 - (arg2 * this.aClass75_Sub3_33.anInt6572 >> 8) >> this.aClass75_Sub3_33.anInt6531;
			@Pc(41) int local41 = arg3 - (this.aClass75_Sub3_33.anInt6557 * arg2 >> 8) >> this.aClass75_Sub3_33.anInt6531;
			this.aClass213_2.method5037(local27, local41, arg0);
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method8069(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt8218 <= 0) {
			return;
		}
		this.aClass75_Sub3_33.method5772();
		this.aClass75_Sub3_33.method5829(false);
		this.aClass75_Sub3_33.method5840(false);
		this.aClass75_Sub3_33.method5796(false);
		this.aClass75_Sub3_33.method5788(false);
		this.aClass75_Sub3_33.method5826(0);
		this.aClass75_Sub3_33.method5781(-2);
		this.aClass75_Sub3_33.method5774((Class44) null);
		Static322.aFloatArray50[12] = -(((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass75_Sub3_33.anInt6517) - 1.0F;
		Static322.aFloatArray50[7] = 0.0F;
		Static322.aFloatArray50[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass75_Sub3_33.anInt6525;
		Static322.aFloatArray50[10] = 0.0F;
		Static322.aFloatArray50[15] = 1.0F;
		Static322.aFloatArray50[4] = 0.0F;
		Static322.aFloatArray50[14] = 0.0F;
		Static322.aFloatArray50[8] = 0.0F;
		Static322.aFloatArray50[9] = 0.0F;
		Static322.aFloatArray50[11] = 0.0F;
		Static322.aFloatArray50[3] = 0.0F;
		Static322.aFloatArray50[6] = 0.0F;
		Static322.aFloatArray50[5] = (float) 1024 / ((float) this.aClass75_Sub3_33.anInt6525 * 128.0F * (float) super.anInt9246);
		Static322.aFloatArray50[1] = 0.0F;
		Static322.aFloatArray50[0] = (float) 1024 / ((float) this.aClass75_Sub3_33.anInt6517 * 128.0F * (float) super.anInt9246);
		Static322.aFloatArray50[2] = 0.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static322.aFloatArray50, 0);
		Static322.aFloatArray50[0] = 1.0F;
		Static322.aFloatArray50[6] = 1.0F;
		Static322.aFloatArray50[1] = 0.0F;
		Static322.aFloatArray50[2] = 0.0F;
		Static322.aFloatArray50[4] = 0.0F;
		Static322.aFloatArray50[7] = 0.0F;
		Static322.aFloatArray50[13] = 0.0F;
		Static322.aFloatArray50[5] = 0.0F;
		Static322.aFloatArray50[11] = 0.0F;
		Static322.aFloatArray50[10] = 0.0F;
		Static322.aFloatArray50[15] = 1.0F;
		Static322.aFloatArray50[8] = 0.0F;
		Static322.aFloatArray50[9] = 1.0F;
		Static322.aFloatArray50[3] = 0.0F;
		Static322.aFloatArray50[12] = 0.0F;
		Static322.aFloatArray50[14] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static322.aFloatArray50, 0);
		if ((this.anInt8215 & 0x7) == 0) {
			this.aClass75_Sub3_33.method5840(false);
		} else {
			this.aClass75_Sub3_33.method5840(true);
			this.aClass75_Sub3_33.method5777();
		}
		this.aClass75_Sub3_33.method5809(this.aClass332_13, this.aClass332_10, this.aClass332_12, this.aClass332_11);
		if (this.aClass75_Sub3_33.aClass6_Sub15_Sub2_2.aByteArray20.length >= this.anInt8210 * 2) {
			this.aClass75_Sub3_33.aClass6_Sub15_Sub2_2.anInt3174 = 0;
		} else {
			this.aClass75_Sub3_33.aClass6_Sub15_Sub2_2 = new Class6_Sub15_Sub2(this.anInt8210 * 2);
		}
		@Pc(321) int local321 = 0;
		@Pc(325) Class6_Sub15_Sub2 local325 = this.aClass75_Sub3_33.aClass6_Sub15_Sub2_2;
		@Pc(331) int local331;
		@Pc(340) int local340;
		@Pc(342) int local342;
		@Pc(363) short[] local363;
		@Pc(367) int local367;
		if (this.aClass75_Sub3_33.aBoolean480) {
			for (local331 = arg1; local331 < arg3; local331++) {
				local340 = super.anInt9255 * local331 + arg0;
				for (local342 = arg0; local342 < arg2; local342++) {
					if (arg4[local342 - arg0][local331 - arg1]) {
						local363 = this.aShortArrayArray12[local340];
						if (local363 != null) {
							for (local367 = 0; local367 < local363.length; local367++) {
								local325.method3040(local363[local367] & 0xFFFF);
								local321++;
							}
						}
					}
					local340++;
				}
			}
		} else {
			for (local331 = arg1; local331 < arg3; local331++) {
				local340 = arg0 + local331 * super.anInt9255;
				for (local342 = arg0; local342 < arg2; local342++) {
					if (arg4[local342 - arg0][local331 - arg1]) {
						local363 = this.aShortArrayArray12[local340];
						if (local363 != null) {
							for (local367 = 0; local367 < local363.length; local367++) {
								local321++;
								local325.method3008(local363[local367] & 0xFFFF);
							}
						}
					}
					local340++;
				}
			}
		}
		if (local321 > 0) {
			@Pc(502) Class59_Sub1 local502 = new Class59_Sub1(this.aClass75_Sub3_33, 5123, local325.aByteArray20, local325.anInt3174);
			this.aClass75_Sub3_33.method5803(0, local321, local502);
		}
	}
}
