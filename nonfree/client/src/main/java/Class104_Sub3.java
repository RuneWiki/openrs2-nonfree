import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vca")
public final class Class104_Sub3 extends Class104 {

	@OriginalMember(owner = "client!vca", name = "q", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!vca", name = "A", descriptor = "I")
	private int anInt9732;

	@OriginalMember(owner = "client!vca", name = "P", descriptor = "I")
	private int anInt9741;

	@OriginalMember(owner = "client!vca", name = "S", descriptor = "[Lclient!jh;")
	private Class3_Sub27[] aClass3_Sub27Array1;

	@OriginalMember(owner = "client!vca", name = "U", descriptor = "Lclient!nba;")
	public Class243 aClass243_13;

	@OriginalMember(owner = "client!vca", name = "W", descriptor = "Lclient!nba;")
	private Class243 aClass243_14;

	@OriginalMember(owner = "client!vca", name = "X", descriptor = "I")
	private int anInt9744;

	@OriginalMember(owner = "client!vca", name = "Y", descriptor = "Lclient!wfa;")
	private Interface26 anInterface26_7;

	@OriginalMember(owner = "client!vca", name = "Z", descriptor = "Lclient!nba;")
	public Class243 aClass243_15;

	@OriginalMember(owner = "client!vca", name = "cb", descriptor = "I")
	private int anInt9745;

	@OriginalMember(owner = "client!vca", name = "eb", descriptor = "Lclient!nba;")
	public Class243 aClass243_16;

	@OriginalMember(owner = "client!vca", name = "w", descriptor = "Lclient!jia;")
	private final Class193 aClass193_67 = new Class193();

	@OriginalMember(owner = "client!vca", name = "k", descriptor = "I")
	private final int anInt9723 = this.anInt9717 - 2;

	@OriginalMember(owner = "client!vca", name = "J", descriptor = "Lclient!hk;")
	public final Class16_Sub2 aClass16_Sub2_38;

	@OriginalMember(owner = "client!vca", name = "T", descriptor = "[[F")
	private float[][] aFloatArrayArray17;

	@OriginalMember(owner = "client!vca", name = "v", descriptor = "[[S")
	public final short[][] aShortArrayArray22;

	@OriginalMember(owner = "client!vca", name = "R", descriptor = "[[F")
	private float[][] aFloatArrayArray16;

	@OriginalMember(owner = "client!vca", name = "E", descriptor = "[[[Lclient!jh;")
	private Class3_Sub27[][][] aClass3_Sub27ArrayArrayArray1;

	@OriginalMember(owner = "client!vca", name = "m", descriptor = "I")
	public final int anInt9724;

	@OriginalMember(owner = "client!vca", name = "i", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!vca", name = "O", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray19;

	@OriginalMember(owner = "client!vca", name = "bb", descriptor = "[[B")
	private byte[][] aByteArrayArray26;

	@OriginalMember(owner = "client!vca", name = "B", descriptor = "I")
	private final int anInt9733;

	@OriginalMember(owner = "client!vca", name = "ab", descriptor = "[[F")
	private float[][] aFloatArrayArray18;

	@OriginalMember(owner = "client!vca", name = "G", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray17;

	@OriginalMember(owner = "client!vca", name = "K", descriptor = "[[B")
	private final byte[][] aByteArrayArray25;

	@OriginalMember(owner = "client!vca", name = "N", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray18;

	@OriginalMember(owner = "client!vca", name = "l", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!vca", name = "db", descriptor = "Lclient!cja;")
	private Class62 aClass62_49;

	@OriginalMember(owner = "client!vca", name = "t", descriptor = "Lclient!pk;")
	private Class280 aClass280_2;

	@OriginalMember(owner = "client!vca", name = "<init>", descriptor = "(Lclient!hk;IIII[[I[[II)V")
	public Class104_Sub3(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass16_Sub2_38 = arg0;
		this.aFloatArrayArray17 = new float[super.anInt9718 + 1][super.anInt9715 + 1];
		this.aShortArrayArray22 = new short[arg3 * arg4][];
		this.aFloatArrayArray16 = new float[super.anInt9718 + 1][super.anInt9715 + 1];
		this.aClass3_Sub27ArrayArrayArray1 = new Class3_Sub27[arg3][arg4][];
		this.anInt9724 = arg2;
		this.anIntArrayArrayArray14 = new int[arg3][arg4][];
		this.anIntArrayArrayArray19 = new int[arg3][arg4][];
		this.aByteArrayArray26 = new byte[arg3 + 1][arg4 + 1];
		this.anInt9733 = 0x1 << this.anInt9723;
		this.aFloatArrayArray18 = new float[super.anInt9718 + 1][super.anInt9715 + 1];
		this.anIntArrayArrayArray17 = new int[arg3][arg4][];
		this.aByteArrayArray25 = new byte[arg3][arg4];
		this.anIntArrayArrayArray18 = new int[arg3][arg4][];
		this.anIntArrayArrayArray15 = new int[arg3][arg4][];
		for (@Pc(115) int local115 = 1; local115 < super.anInt9715; local115++) {
			for (@Pc(119) int local119 = 1; super.anInt9718 > local119; local119++) {
				@Pc(138) int local138 = arg6[local119 + 1][local115] - arg6[local119 - 1][local115];
				@Pc(155) int local155 = arg6[local119][local115 + 1] - arg6[local119][local115 - 1];
				@Pc(174) float local174 = (float) (1.0D / Math.sqrt((double) (local155 * local155 + local138 * local138 + arg7 * 4 * arg7)));
				this.aFloatArrayArray17[local119][local115] = (float) local138 * local174;
				this.aFloatArrayArray16[local119][local115] = (float) (-arg7 * 2) * local174;
				this.aFloatArrayArray18[local119][local115] = local174 * (float) local155;
			}
		}
		this.aClass62_49 = new Class62(128);
		if ((this.anInt9724 & 0x10) != 0) {
			this.aClass280_2 = new Class280(this.aClass16_Sub2_38, this);
		}
	}

	@OriginalMember(owner = "client!vca", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class3_Sub6_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass280_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass16_Sub2_38.anInt4376 >> 8) >> this.aClass16_Sub2_38.anInt4364;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass16_Sub2_38.anInt4402 >> 8) >> this.aClass16_Sub2_38.anInt4364;
			this.aClass280_2.method6646(local39, arg0, local24);
		}
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method8281(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt9745 <= 0) {
			return;
		}
		this.aClass16_Sub2_38.method3665();
		this.aClass16_Sub2_38.method3681(false);
		this.aClass16_Sub2_38.method3637(false);
		this.aClass16_Sub2_38.method3631(false);
		this.aClass16_Sub2_38.method3617(false);
		this.aClass16_Sub2_38.method3654(0);
		this.aClass16_Sub2_38.method3687(-2);
		this.aClass16_Sub2_38.method3620((Class39) null);
		Static98.aFloatArray30[7] = 0.0F;
		Static98.aFloatArray30[6] = 0.0F;
		Static98.aFloatArray30[13] = 1.0F - ((float) (arg3 * 1024) / 128.0F + (float) 0) / (float) this.aClass16_Sub2_38.anInt4359;
		Static98.aFloatArray30[8] = 0.0F;
		Static98.aFloatArray30[1] = 0.0F;
		Static98.aFloatArray30[10] = 0.0F;
		Static98.aFloatArray30[11] = 0.0F;
		Static98.aFloatArray30[4] = 0.0F;
		Static98.aFloatArray30[9] = 0.0F;
		Static98.aFloatArray30[2] = 0.0F;
		Static98.aFloatArray30[12] = -1.0F - ((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass16_Sub2_38.anInt4256;
		Static98.aFloatArray30[14] = 0.0F;
		Static98.aFloatArray30[3] = 0.0F;
		Static98.aFloatArray30[5] = (float) 1024 / ((float) this.aClass16_Sub2_38.anInt4359 * 128.0F * (float) super.anInt9716);
		Static98.aFloatArray30[15] = 1.0F;
		Static98.aFloatArray30[0] = (float) 1024 / ((float) super.anInt9716 * 128.0F * (float) this.aClass16_Sub2_38.anInt4256);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static98.aFloatArray30, 0);
		Static98.aFloatArray30[13] = 0.0F;
		Static98.aFloatArray30[12] = 0.0F;
		Static98.aFloatArray30[7] = 0.0F;
		Static98.aFloatArray30[0] = 1.0F;
		Static98.aFloatArray30[4] = 0.0F;
		Static98.aFloatArray30[11] = 0.0F;
		Static98.aFloatArray30[9] = 1.0F;
		Static98.aFloatArray30[3] = 0.0F;
		Static98.aFloatArray30[6] = 1.0F;
		Static98.aFloatArray30[8] = 0.0F;
		Static98.aFloatArray30[5] = 0.0F;
		Static98.aFloatArray30[15] = 1.0F;
		Static98.aFloatArray30[1] = 0.0F;
		Static98.aFloatArray30[10] = 0.0F;
		Static98.aFloatArray30[2] = 0.0F;
		Static98.aFloatArray30[14] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static98.aFloatArray30, 0);
		if ((this.anInt9724 & 0x7) == 0) {
			this.aClass16_Sub2_38.method3637(false);
		} else {
			this.aClass16_Sub2_38.method3637(true);
			this.aClass16_Sub2_38.method3689();
		}
		this.aClass16_Sub2_38.method3629(this.aClass243_15, this.aClass243_13, this.aClass243_16, this.aClass243_14);
		if (this.anInt9741 * 2 > this.aClass16_Sub2_38.aClass3_Sub17_Sub1_1.aByteArray59.length) {
			this.aClass16_Sub2_38.aClass3_Sub17_Sub1_1 = new Class3_Sub17_Sub1(this.anInt9741 * 2);
		} else {
			this.aClass16_Sub2_38.aClass3_Sub17_Sub1_1.lb = 0;
		}
		@Pc(314) int local314 = 0;
		@Pc(318) Class3_Sub17_Sub1 local318 = this.aClass16_Sub2_38.aClass3_Sub17_Sub1_1;
		@Pc(324) int local324;
		@Pc(333) int local333;
		@Pc(335) int local335;
		@Pc(353) short[] local353;
		@Pc(357) int local357;
		if (this.aClass16_Sub2_38.aBoolean322) {
			for (local324 = arg1; local324 < arg3; local324++) {
				local333 = local324 * super.anInt9718 + arg0;
				for (local335 = arg0; local335 < arg2; local335++) {
					if (arg4[local335 - arg0][local324 - arg1]) {
						local353 = this.aShortArrayArray22[local333];
						if (local353 != null) {
							for (local357 = 0; local357 < local353.length; local357++) {
								local318.method4876(local353[local357] & 0xFFFF);
								local314++;
							}
						}
					}
					local333++;
				}
			}
		} else {
			for (local324 = arg1; local324 < arg3; local324++) {
				local333 = local324 * super.anInt9718 + arg0;
				for (local335 = arg0; local335 < arg2; local335++) {
					if (arg4[local335 - arg0][local324 - arg1]) {
						local353 = this.aShortArrayArray22[local333];
						if (local353 != null) {
							for (local357 = 0; local357 < local353.length; local357++) {
								local318.method4843(local353[local357] & 0xFFFF);
								local314++;
							}
						}
					}
					local333++;
				}
			}
		}
		if (local314 > 0) {
			@Pc(470) Class127_Sub2 local470 = new Class127_Sub2(this.aClass16_Sub2_38, 5123, local318.aByteArray59, local318.lb);
			this.aClass16_Sub2_38.method3632(0, local470, local314);
		}
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method8285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method8289(arg2, arg6, arg0, arg5, arg3, arg4, arg1);
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method8280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(IIII[[ZBZI)V")
	private void method8289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[][] arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6) {
		if (this.aClass3_Sub27Array1 == null) {
			return;
		}
		@Pc(11) int local11 = arg0 + arg0 + 1;
		@Pc(15) int local15 = local11 * local11;
		if (local15 > this.aClass16_Sub2_38.anIntArray289.length) {
			this.aClass16_Sub2_38.anIntArray289 = new int[local15];
		}
		if (this.aClass16_Sub2_38.aClass3_Sub17_Sub1_1.aByteArray59.length < this.anInt9741 * 2) {
			this.aClass16_Sub2_38.aClass3_Sub17_Sub1_1 = new Class3_Sub17_Sub1(this.anInt9741 * 2);
		}
		@Pc(55) int local55 = arg2 - arg0;
		@Pc(57) int local57 = local55;
		if (local55 < 0) {
			local55 = 0;
		}
		@Pc(66) int local66 = arg6 - arg0;
		@Pc(68) int local68 = local66;
		if (local66 < 0) {
			local66 = 0;
		}
		@Pc(76) int local76 = arg0 + arg2;
		if (super.anInt9718 - 1 < local76) {
			local76 = super.anInt9718 - 1;
		}
		@Pc(92) int local92 = arg6 + arg0;
		if (local92 > super.anInt9715 - 1) {
			local92 = super.anInt9715 - 1;
		}
		@Pc(105) int local105 = 0;
		@Pc(109) int[] local109 = this.aClass16_Sub2_38.anIntArray289;
		@Pc(122) int local122;
		for (@Pc(111) int local111 = local55; local111 <= local76; local111++) {
			@Pc(120) boolean[] local120 = arg4[local111 - local57];
			for (local122 = local66; local122 <= local92; local122++) {
				if (local120[local122 - local68]) {
					local109[local105++] = local122 * super.anInt9718 + local111;
				}
			}
		}
		if (arg3 == -1) {
			this.aClass16_Sub2_38.method3690();
		} else {
			this.aClass16_Sub2_38.method3695((float) arg3);
			this.aClass16_Sub2_38.method3666();
		}
		this.aClass16_Sub2_38.method3637((this.anInt9724 & 0x7) != 0);
		for (@Pc(184) int local184 = 0; local184 < this.aClass3_Sub27Array1.length; local184++) {
			this.aClass3_Sub27Array1[local184].method4434(local105, local109);
		}
		if (!this.aClass193_67.method4454()) {
			local122 = this.aClass16_Sub2_38.anInt4405;
			@Pc(213) int local213 = this.aClass16_Sub2_38.anInt4386;
			this.aClass16_Sub2_38.L(0, local213, this.aClass16_Sub2_38.anInt4393);
			this.aClass16_Sub2_38.method3637(false);
			this.aClass16_Sub2_38.method3617(false);
			this.aClass16_Sub2_38.method3654(128);
			this.aClass16_Sub2_38.method3687(-2);
			this.aClass16_Sub2_38.method3620(this.aClass16_Sub2_38.aClass39_Sub4_1);
			this.aClass16_Sub2_38.method3671(8448, 7681);
			this.aClass16_Sub2_38.method3669(34166, 0, 770);
			this.aClass16_Sub2_38.method3661(0, 34167);
			for (@Pc(273) Class3 local273 = this.aClass193_67.method4457(); local273 != null; local273 = this.aClass193_67.method4459()) {
				@Pc(278) Class3_Sub26 local278 = (Class3_Sub26) local273;
				local278.method3967(arg6, arg2, arg0, arg4);
			}
			this.aClass16_Sub2_38.method3669(5890, 0, 768);
			this.aClass16_Sub2_38.method3661(0, 5890);
			this.aClass16_Sub2_38.method3620((Class39) null);
			this.aClass16_Sub2_38.L(local122, local213, this.aClass16_Sub2_38.anInt4393);
		}
		if (this.aClass280_2 == null) {
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		this.aClass16_Sub2_38.method3629(this.aClass243_15, (Class243) null, this.aClass243_16, (Class243) null);
		this.aClass280_2.method6641(arg4, arg2, arg5, arg0, arg6);
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method8278(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method8289(arg2, arg5, arg0, -1, arg3, arg4, arg1);
	}

	@OriginalMember(owner = "client!vca", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray16 == null) {
			this.anIntArrayArrayArray16 = new int[super.anInt9718][super.anInt9715][];
		}
		@Pc(21) Interface5 local21 = this.aClass16_Sub2_38.anInterface5_12;
		if (arg3 != null && this.anIntArrayArrayArray14 == null) {
			this.anIntArrayArrayArray14 = new int[super.anInt9718][super.anInt9715][];
		}
		this.anIntArrayArrayArray18[arg0][arg1] = arg2;
		this.anIntArrayArrayArray17[arg0][arg1] = arg4;
		this.anIntArrayArrayArray19[arg0][arg1] = arg6;
		this.anIntArrayArrayArray15[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray16 != null) {
			this.anIntArrayArrayArray16[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray14 != null) {
			this.anIntArrayArrayArray14[arg0][arg1] = arg3;
		}
		@Pc(92) Class3_Sub27[] local92 = this.aClass3_Sub27ArrayArrayArray1[arg0][arg1] = new Class3_Sub27[arg6.length];
		for (@Pc(94) int local94 = 0; local94 < arg6.length; local94++) {
			@Pc(100) int local100 = arg8[local94];
			@Pc(104) int local104 = arg9[local94];
			if ((this.anInt9724 & 0x20) != 0 && local100 != -1 && local21.method5193(local100).aBoolean693) {
				local104 = 128;
				local100 = -1;
			}
			@Pc(148) long local148 = (long) local100 | (long) (local104 << 14) | (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48;
			@Pc(154) Class3 local154;
			for (local154 = this.aClass62_49.method1682(local148); local154 != null; local154 = this.aClass62_49.method1689()) {
				@Pc(159) Class3_Sub27 local159 = (Class3_Sub27) local154;
				if (local100 == local159.anInt5220 && local159.aFloat132 == (float) local104 && arg10 == local159.anInt5229 && arg11 == local159.anInt5225 && arg12 == local159.anInt5219) {
					break;
				}
			}
			if (local154 == null) {
				local92[local94] = new Class3_Sub27(this, local100, local104, arg10, arg11, arg12);
				this.aClass62_49.method1686(local148, local92[local94]);
			} else {
				local92[local94] = (Class3_Sub27) local154;
			}
		}
		if (arg13) {
			this.aByteArrayArray25[arg0][arg1] = (byte) (this.aByteArrayArray25[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt9744) {
			this.anInt9744 = arg6.length;
		}
		this.anInt9745 += arg6.length;
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(II)V")
	@Override
	public void method8284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(IIILclient!vg;)V")
	private void method8290(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub6_Sub12_Sub2 arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray18[arg1][arg0];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray17[arg1][arg0];
		@Pc(22) int local22 = local12.length;
		if (local22 > this.aClass16_Sub2_38.anIntArray288.length) {
			this.aClass16_Sub2_38.anIntArray287 = new int[local22];
			this.aClass16_Sub2_38.anIntArray288 = new int[local22];
		}
		@Pc(42) int[] local42 = this.aClass16_Sub2_38.anIntArray288;
		@Pc(46) int[] local46 = this.aClass16_Sub2_38.anIntArray287;
		for (@Pc(48) int local48 = 0; local48 < local22; local48++) {
			local42[local48] = local12[local48] >> this.aClass16_Sub2_38.anInt4364;
			local46[local48] = local19[local48] >> this.aClass16_Sub2_38.anInt4364;
		}
		@Pc(76) int local76 = 0;
		while (local22 > local76) {
			@Pc(82) int local82 = local42[local76];
			@Pc(87) int local87 = local46[local76++];
			@Pc(91) int local91 = local42[local76];
			@Pc(96) int local96 = local46[local76++];
			@Pc(100) int local100 = local42[local76];
			@Pc(105) int local105 = local46[local76++];
			if ((local96 - local105) * (local82 - local91) - (local100 - local91) * (-local87 + local96) > 0) {
				arg2.method8349(local91, local100, local87, local105, local96, local82);
			}
		}
	}

	@OriginalMember(owner = "client!vca", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class3_Sub6_Sub12 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub6_Sub12 arg2) {
		if ((this.aByteArrayArray25[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt9716 >> this.aClass16_Sub2_38.anInt4364;
		@Pc(27) Class3_Sub6_Sub12_Sub2 local27 = (Class3_Sub6_Sub12_Sub2) arg2;
		@Pc(43) Class3_Sub6_Sub12_Sub2 local43;
		if (local27 != null && local27.method8346(local24, local24)) {
			local43 = local27;
			local27.method8348();
		} else {
			local43 = new Class3_Sub6_Sub12_Sub2(this.aClass16_Sub2_38, local24, local24);
		}
		local43.method8345(0, local24, local24, 0);
		this.method8290(arg1, arg0, local43);
		return local43;
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method8283(@OriginalArg(0) Class3_Sub6_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass280_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (arg2 * this.aClass16_Sub2_38.anInt4376 >> 8) >> this.aClass16_Sub2_38.anInt4364;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass16_Sub2_38.anInt4402 >> 8) >> this.aClass16_Sub2_38.anInt4364;
			return this.aClass280_2.method6648(local25, local39, arg0);
		}
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(Lclient!bq;[I)V")
	@Override
	public void method8282(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass193_67.method4462(new Class3_Sub26(this.aClass16_Sub2_38, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!vca", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class3_Sub6_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass280_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass16_Sub2_38.anInt4376 >> 8) >> this.aClass16_Sub2_38.anInt4364;
			@Pc(38) int local38 = arg3 - (arg2 * this.aClass16_Sub2_38.anInt4402 >> 8) >> this.aClass16_Sub2_38.anInt4364;
			this.aClass280_2.method6645(local38, local24, arg0);
		}
	}

	@OriginalMember(owner = "client!vca", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.anInt9745 > 0) {
			@Pc(17) byte[][] local17 = new byte[super.anInt9718 + 1][super.anInt9715 + 1];
			@Pc(23) int local23;
			for (@Pc(19) int local19 = 1; local19 < super.anInt9718; local19++) {
				for (local23 = 1; local23 < super.anInt9715; local23++) {
					local17[local19][local23] = (byte) ((this.aByteArrayArray26[local19][local23] >> 1) + (this.aByteArrayArray26[local19][local23 + 1] >> 3) + (this.aByteArrayArray26[local19 - -1][local23] >> 3) + (this.aByteArrayArray26[local19 + -1][local23] >> 2) + (this.aByteArrayArray26[local19][local23 + -1] >> 2));
				}
			}
			this.aClass3_Sub27Array1 = new Class3_Sub27[this.aClass62_49.method1688()];
			this.aClass62_49.method1687(this.aClass3_Sub27Array1);
			for (local23 = 0; local23 < this.aClass3_Sub27Array1.length; local23++) {
				this.aClass3_Sub27Array1[local23].method4433(this.anInt9745);
			}
			@Pc(139) int local139 = 24;
			if (this.anIntArrayArrayArray16 != null) {
				local139 += 4;
			}
			if ((this.anInt9724 & 0x7) != 0) {
				local139 += 12;
			}
			@Pc(159) NativeHeapBuffer local159 = this.aClass16_Sub2_38.aNativeHeap4.a(this.anInt9745 * local139, false);
			@Pc(164) Stream local164 = new Stream(local159);
			@Pc(168) Class3_Sub27[] local168 = new Class3_Sub27[this.anInt9745];
			@Pc(175) int local175 = Static675.method8723(this.anInt9745 / 4);
			if (local175 < 1) {
				local175 = 1;
			}
			@Pc(185) Class62 local185 = new Class62(local175);
			@Pc(189) Class3_Sub27[] local189 = new Class3_Sub27[this.anInt9744];
			@Pc(195) int local195;
			for (@Pc(191) int local191 = 0; local191 < super.anInt9718; local191++) {
				for (local195 = 0; local195 < super.anInt9715; local195++) {
					if (this.anIntArrayArrayArray19[local191][local195] != null) {
						@Pc(211) Class3_Sub27[] local211 = this.aClass3_Sub27ArrayArrayArray1[local191][local195];
						@Pc(218) int[] local218 = this.anIntArrayArrayArray18[local191][local195];
						@Pc(225) int[] local225 = this.anIntArrayArrayArray17[local191][local195];
						@Pc(232) int[] local232 = this.anIntArrayArrayArray15[local191][local195];
						@Pc(239) int[] local239 = this.anIntArrayArrayArray19[local191][local195];
						@Pc(251) int[] local251 = this.anIntArrayArrayArray14 == null ? null : this.anIntArrayArrayArray14[local191][local195];
						if (local232 == null) {
							local232 = local239;
						}
						@Pc(267) int[] local267 = this.anIntArrayArrayArray16 == null ? null : this.anIntArrayArrayArray16[local191][local195];
						@Pc(274) float local274 = this.aFloatArrayArray17[local191][local195];
						@Pc(281) float local281 = this.aFloatArrayArray16[local191][local195];
						@Pc(288) float local288 = this.aFloatArrayArray18[local191][local195];
						@Pc(297) float local297 = this.aFloatArrayArray17[local191][local195 + 1];
						@Pc(306) float local306 = this.aFloatArrayArray16[local191][local195 + 1];
						@Pc(315) float local315 = this.aFloatArrayArray18[local191][local195 + 1];
						@Pc(326) float local326 = this.aFloatArrayArray17[local191 + 1][local195 + 1];
						@Pc(337) float local337 = this.aFloatArrayArray16[local191 + 1][local195 + 1];
						@Pc(348) float local348 = this.aFloatArrayArray18[local191 + 1][local195 + 1];
						@Pc(357) float local357 = this.aFloatArrayArray17[local191 + 1][local195];
						@Pc(366) float local366 = this.aFloatArrayArray16[local191 + 1][local195];
						@Pc(375) float local375 = this.aFloatArrayArray18[local191 + 1][local195];
						@Pc(383) int local383 = local17[local191][local195] & 0xFF;
						@Pc(393) int local393 = local17[local191][local195 + 1] & 0xFF;
						@Pc(405) int local405 = local17[local191 + 1][local195 + 1] & 0xFF;
						@Pc(415) int local415 = local17[local191 + 1][local195] & 0xFF;
						@Pc(417) int local417 = 0;
						@Pc(427) int local427;
						label337: for (@Pc(419) int local419 = 0; local419 < local239.length; local419++) {
							@Pc(425) Class3_Sub27 local425 = local211[local419];
							for (local427 = 0; local427 < local417; local427++) {
								if (local425 == local189[local427]) {
									continue label337;
								}
							}
							local189[local417++] = local425;
						}
						@Pc(464) short[] local464 = this.aShortArrayArray22[super.anInt9718 * local195 + local191] = new short[local239.length];
						for (local427 = 0; local427 < local239.length; local427++) {
							@Pc(477) int local477 = (local191 << super.anInt9717) + local218[local427];
							@Pc(486) int local486 = (local195 << super.anInt9717) + local225[local427];
							@Pc(491) int local491 = local477 >> this.anInt9723;
							@Pc(496) int local496 = local486 >> this.anInt9723;
							@Pc(500) int local500 = local239[local427];
							@Pc(504) int local504 = local232[local427];
							@Pc(512) int local512 = local251 == null ? 0 : local251[local427];
							@Pc(530) long local530 = (long) local496 | (long) local504 << 48 | (long) local500 << 32 | (long) (local491 << 16);
							@Pc(534) int local534 = local218[local427];
							@Pc(538) int local538 = local225[local427];
							@Pc(540) byte local540 = 74;
							@Pc(542) int local542 = 0;
							@Pc(554) float local554;
							@Pc(548) float local548;
							@Pc(556) float local556;
							@Pc(628) float local628;
							@Pc(552) int local552;
							if (local534 == 0 && local538 == 0) {
								local548 = local281;
								local552 = local540 - local383;
								local554 = local274;
								local556 = local288;
							} else if (local534 == 0 && local538 == super.anInt9716) {
								local552 = local540 - local393;
								local548 = local306;
								local554 = local297;
								local556 = local315;
							} else if (super.anInt9716 == local534 && super.anInt9716 == local538) {
								local554 = local326;
								local552 = local540 - local405;
								local548 = local337;
								local556 = local348;
							} else if (local534 == super.anInt9716 && local538 == 0) {
								local552 = local540 - local415;
								local554 = local357;
								local556 = local375;
								local548 = local366;
							} else {
								@Pc(603) float local603 = (float) local534 / (float) super.anInt9716;
								@Pc(610) float local610 = (float) local538 / (float) super.anInt9716;
								@Pc(619) float local619 = local274 + (local357 - local274) * local603;
								local628 = local281 + local603 * (local366 - local281);
								@Pc(637) float local637 = local288 + local603 * (local375 - local288);
								@Pc(646) float local646 = local297 + (local326 - local297) * local603;
								@Pc(655) float local655 = local603 * (local337 - local306) + local306;
								local554 = local610 * (local646 - local619) + local619;
								local548 = local628 + (local655 - local628) * local610;
								@Pc(679) float local679 = (local348 - local315) * local603 + local315;
								local556 = local610 * (local679 - local637) + local637;
								@Pc(700) int local700 = local383 + (local534 * (local415 - local383) >> super.anInt9717);
								@Pc(712) int local712 = local393 + (local534 * (local405 - local393) >> super.anInt9717);
								local552 = local540 - (local538 * (local712 - local700) >> super.anInt9717) - local700;
							}
							@Pc(752) float local752 = 1.0F;
							if (local500 != -1) {
								@Pc(764) int local764 = local552 * (local500 & 0x7F) >> 7;
								if (local764 < 2) {
									local764 = 2;
								} else if (local764 > 126) {
									local764 = 126;
								}
								if ((this.anInt9724 & 0x7) == 0) {
									local752 = this.aClass16_Sub2_38.aFloatArray42[2] * local556 + local554 * this.aClass16_Sub2_38.aFloatArray42[0] + local548 * this.aClass16_Sub2_38.aFloatArray42[1];
									local752 = (local752 > 0.0F ? this.aClass16_Sub2_38.aFloat93 : this.aClass16_Sub2_38.aFloat101) * local752 + this.aClass16_Sub2_38.aFloat86;
								}
								local542 = Static274.anIntArray337[local500 & 0xFF80 | local764];
							}
							@Pc(833) Class3 local833 = null;
							if ((this.anInt9733 - 1 & local477) == 0 && (local486 & this.anInt9733 - 1) == 0) {
								local833 = local185.method1682(local530);
							}
							@Pc(1187) int local1187;
							@Pc(866) int local866;
							if (local833 == null) {
								if (local500 == local504) {
									local866 = local542;
								} else {
									@Pc(876) int local876 = (local504 & 0x7F) * local552 >> 7;
									if (local876 < 2) {
										local876 = 2;
									} else if (local876 > 126) {
										local876 = 126;
									}
									local866 = Static274.anIntArray337[local504 & 0xFF80 | local876];
									if ((this.anInt9724 & 0x7) == 0) {
										local628 = this.aClass16_Sub2_38.aFloatArray42[2] * local556 + this.aClass16_Sub2_38.aFloatArray42[0] * local554 + this.aClass16_Sub2_38.aFloatArray42[1] * local548;
										local628 = this.aClass16_Sub2_38.aFloat86 + local752 * (local752 > 0.0F ? this.aClass16_Sub2_38.aFloat93 : this.aClass16_Sub2_38.aFloat101);
										@Pc(954) int local954 = local866 >> 16 & 0xFF;
										@Pc(960) int local960 = local866 >> 8 & 0xFF;
										local954 = (int) ((float) local954 * local628);
										@Pc(970) int local970 = local866 & 0xFF;
										local960 = (int) ((float) local960 * local628);
										if (local954 < 0) {
											local954 = 0;
										} else if (local954 > 255) {
											local954 = 255;
										}
										local970 = (int) ((float) local970 * local628);
										if (local960 < 0) {
											local960 = 0;
										} else if (local960 > 255) {
											local960 = 255;
										}
										if (local970 < 0) {
											local970 = 0;
										} else if (local970 > 255) {
											local970 = 255;
										}
										local866 = local970 | local960 << 8 | local954 << 16;
									}
								}
								if (this.aClass16_Sub2_38.aBoolean322) {
									local164.b((float) local477);
									local164.b((float) (local512 + this.method8286(local477, local486)));
									local164.b((float) local486);
									local164.d((byte) (local866 >> 16));
									local164.d((byte) (local866 >> 8));
									local164.d((byte) local866);
									local164.d(-1);
									local164.b((float) local477);
									local164.b((float) local486);
									if (this.anIntArrayArrayArray16 != null) {
										local164.b((float) (local267 == null ? 0 : local267[local427] - 1));
									}
									if ((this.anInt9724 & 0x7) != 0) {
										local164.b(local554);
										local164.b(local548);
										local164.b(local556);
									}
								} else {
									local164.a((float) local477);
									local164.a((float) (local512 + this.method8286(local477, local486)));
									local164.a((float) local486);
									local164.d((byte) (local866 >> 16));
									local164.d((byte) (local866 >> 8));
									local164.d((byte) local866);
									local164.d(-1);
									local164.a((float) local477);
									local164.a((float) local486);
									if (this.anIntArrayArrayArray16 != null) {
										local164.a((float) (local267 == null ? 0 : local267[local427] - 1));
									}
									if ((this.anInt9724 & 0x7) != 0) {
										local164.a(local554);
										local164.a(local548);
										local164.a(local556);
									}
								}
								local1187 = this.anInt9732++;
								local464[local427] = (short) local1187;
								if (local500 != -1) {
									local168[local1187] = local211[local427];
								}
								local185.method1686(local530, new Class3_Sub33(local464[local427]));
							} else {
								local464[local427] = ((Class3_Sub33) local833).aShort76;
								local1187 = local464[local427] & 0xFFFF;
								if (local500 != -1 && local211[local427].aLong309 < local168[local1187].aLong309) {
									local168[local1187] = local211[local427];
								}
							}
							for (local866 = 0; local866 < local417; local866++) {
								local189[local866].method4431(local752, local552, local1187, local542);
							}
							this.anInt9741++;
						}
					}
				}
			}
			for (local195 = 0; local195 < this.anInt9732; local195++) {
				@Pc(1296) Class3_Sub27 local1296 = local168[local195];
				if (local1296 != null) {
					local1296.method4432(local195);
				}
			}
			@Pc(1334) int local1334;
			for (@Pc(1313) int local1313 = 0; local1313 < super.anInt9718; local1313++) {
				for (@Pc(1317) int local1317 = 0; local1317 < super.anInt9715; local1317++) {
					@Pc(1330) short[] local1330 = this.aShortArrayArray22[super.anInt9718 * local1317 + local1313];
					if (local1330 != null) {
						local1334 = 0;
						@Pc(1336) int local1336 = 0;
						while (local1330.length > local1336) {
							@Pc(1345) int local1345 = local1330[local1336++] & 0xFFFF;
							@Pc(1352) int local1352 = local1330[local1336++] & 0xFFFF;
							@Pc(1359) int local1359 = local1330[local1336++] & 0xFFFF;
							@Pc(1363) Class3_Sub27 local1363 = local168[local1345];
							@Pc(1367) Class3_Sub27 local1367 = local168[local1352];
							@Pc(1371) Class3_Sub27 local1371 = local168[local1359];
							@Pc(1373) Class3_Sub27 local1373 = null;
							if (local1363 != null) {
								local1373 = local1363;
								local1363.method4435(local1313, local1317, local1334);
							}
							if (local1367 != null) {
								local1367.method4435(local1313, local1317, local1334);
								if (local1373 == null || local1367.aLong309 < local1373.aLong309) {
									local1373 = local1367;
								}
							}
							if (local1371 != null) {
								local1371.method4435(local1313, local1317, local1334);
								if (local1373 == null || local1373.aLong309 > local1371.aLong309) {
									local1373 = local1371;
								}
							}
							if (local1373 != null) {
								if (local1363 != null) {
									local1373.method4432(local1345);
								}
								if (local1367 != null) {
									local1373.method4432(local1352);
								}
								if (local1371 != null) {
									local1373.method4432(local1359);
								}
								local1373.method4435(local1313, local1317, local1334);
							}
							local1334++;
						}
					}
				}
			}
			local164.b();
			this.anInterface26_7 = this.aClass16_Sub2_38.method3692(local164.a(), local159, local139);
			this.aClass243_15 = new Class243(this.anInterface26_7, 5126, 3, 0);
			this.aClass243_14 = new Class243(this.anInterface26_7, 5121, 4, 12);
			@Pc(1524) byte local1524;
			if (this.anIntArrayArrayArray16 == null) {
				this.aClass243_16 = new Class243(this.anInterface26_7, 5126, 2, 16);
				local1524 = 24;
			} else {
				this.aClass243_16 = new Class243(this.anInterface26_7, 5126, 3, 16);
				local1524 = 28;
			}
			if ((this.anInt9724 & 0x7) != 0) {
				this.aClass243_13 = new Class243(this.anInterface26_7, 5126, 3, local1524);
			}
			@Pc(1561) long[] local1561 = new long[this.aClass3_Sub27Array1.length];
			for (local1334 = 0; local1334 < this.aClass3_Sub27Array1.length; local1334++) {
				@Pc(1570) Class3_Sub27 local1570 = this.aClass3_Sub27Array1[local1334];
				local1561[local1334] = local1570.aLong309;
				local1570.method4430(this.anInt9732);
			}
			Static448.method6467(local1561, this.aClass3_Sub27Array1);
			if (this.aClass280_2 != null) {
				this.aClass280_2.method6647();
			}
		} else {
			this.aClass280_2 = null;
		}
		this.anIntArrayArrayArray19 = null;
		this.aClass3_Sub27ArrayArrayArray1 = null;
		this.anIntArrayArrayArray16 = null;
		this.aFloatArrayArray17 = this.aFloatArrayArray16 = this.aFloatArrayArray18 = null;
		this.anIntArrayArrayArray14 = null;
		this.anIntArrayArrayArray18 = this.anIntArrayArrayArray17 = null;
		this.aClass62_49 = null;
		this.aByteArrayArray26 = null;
		this.anIntArrayArrayArray15 = null;
	}

	@OriginalMember(owner = "client!vca", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray26[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray26[arg0][arg1] = (byte) arg2;
		}
	}
}
