import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mea")
public final class Class34_Sub3 extends Class34 {

	@OriginalMember(owner = "client!mea", name = "o", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!mea", name = "w", descriptor = "I")
	private int anInt5498;

	@OriginalMember(owner = "client!mea", name = "E", descriptor = "I")
	private int anInt5502;

	@OriginalMember(owner = "client!mea", name = "ab", descriptor = "Lclient!hea;")
	public Class126 aClass126_9;

	@OriginalMember(owner = "client!mea", name = "db", descriptor = "Lclient!hea;")
	private Class126 aClass126_10;

	@OriginalMember(owner = "client!mea", name = "eb", descriptor = "Lclient!ut;")
	private Interface21 anInterface21_4;

	@OriginalMember(owner = "client!mea", name = "fb", descriptor = "I")
	private int anInt5517;

	@OriginalMember(owner = "client!mea", name = "hb", descriptor = "I")
	private int anInt5518;

	@OriginalMember(owner = "client!mea", name = "ib", descriptor = "Lclient!hea;")
	public Class126 aClass126_11;

	@OriginalMember(owner = "client!mea", name = "lb", descriptor = "[Lclient!ac;")
	private Class3_Sub2[] lb;

	@OriginalMember(owner = "client!mea", name = "mb", descriptor = "Lclient!hea;")
	public Class126 aClass126_12;

	@OriginalMember(owner = "client!mea", name = "x", descriptor = "Lclient!gk;")
	private final Class112 aClass112_37 = new Class112();

	@OriginalMember(owner = "client!mea", name = "G", descriptor = "Lclient!vj;")
	public final Class45_Sub3 aClass45_Sub3_34;

	@OriginalMember(owner = "client!mea", name = "y", descriptor = "I")
	private final int anInt5499;

	@OriginalMember(owner = "client!mea", name = "z", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!mea", name = "q", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!mea", name = "n", descriptor = "I")
	private final int anInt5492;

	@OriginalMember(owner = "client!mea", name = "P", descriptor = "[[[Lclient!ac;")
	private Class3_Sub2[][][] aClass3_Sub2ArrayArrayArray1;

	@OriginalMember(owner = "client!mea", name = "cb", descriptor = "[[F")
	private float[][] aFloatArrayArray9;

	@OriginalMember(owner = "client!mea", name = "R", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!mea", name = "s", descriptor = "[[S")
	public final short[][] aShortArrayArray20;

	@OriginalMember(owner = "client!mea", name = "r", descriptor = "I")
	public final int anInt5494;

	@OriginalMember(owner = "client!mea", name = "jb", descriptor = "[[B")
	private byte[][] aByteArrayArray16;

	@OriginalMember(owner = "client!mea", name = "bb", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!mea", name = "J", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!mea", name = "nb", descriptor = "[[F")
	private float[][] aFloatArrayArray10;

	@OriginalMember(owner = "client!mea", name = "X", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!mea", name = "C", descriptor = "[[B")
	private final byte[][] aByteArrayArray15;

	@OriginalMember(owner = "client!mea", name = "kb", descriptor = "Lclient!wa;")
	private Class354 aClass354_28;

	@OriginalMember(owner = "client!mea", name = "B", descriptor = "Lclient!haa;")
	private Class121 aClass121_2;

	@OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(Lclient!vj;IIII[[I[[II)V")
	public Class34_Sub3(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass45_Sub3_34 = arg0;
		this.anInt5499 = super.anInt7856 - 2;
		this.anIntArrayArrayArray12 = new int[arg3][arg4][];
		this.anIntArrayArrayArray11 = new int[arg3][arg4][];
		this.anInt5492 = 0x1 << this.anInt5499;
		this.aClass3_Sub2ArrayArrayArray1 = new Class3_Sub2[arg3][arg4][];
		this.aFloatArrayArray9 = new float[super.anInt7854 + 1][super.anInt7852 + 1];
		this.anIntArrayArrayArray14 = new int[arg3][arg4][];
		this.aShortArrayArray20 = new short[arg3 * arg4][];
		this.anInt5494 = arg2;
		this.aByteArrayArray16 = new byte[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray8 = new float[super.anInt7854 + 1][super.anInt7852 + 1];
		this.anIntArrayArrayArray13 = new int[arg3][arg4][];
		this.aFloatArrayArray10 = new float[super.anInt7854 + 1][super.anInt7852 + 1];
		this.anIntArrayArrayArray15 = new int[arg3][arg4][];
		this.aByteArrayArray15 = new byte[arg3][arg4];
		for (@Pc(115) int local115 = 1; local115 < super.anInt7852; local115++) {
			for (@Pc(119) int local119 = 1; super.anInt7854 > local119; local119++) {
				@Pc(137) int local137 = arg6[local119 + 1][local115] - arg6[local119 - 1][local115];
				@Pc(154) int local154 = arg6[local119][local115 + 1] - arg6[local119][local115 - 1];
				@Pc(173) float local173 = (float) (1.0D / Math.sqrt((double) (arg7 * arg7 * 4 + local137 * local137 + local154 * local154)));
				this.aFloatArrayArray9[local119][local115] = local173 * (float) local137;
				this.aFloatArrayArray10[local119][local115] = local173 * (float) (-arg7 * 2);
				this.aFloatArrayArray8[local119][local115] = local173 * (float) local154;
			}
		}
		this.aClass354_28 = new Class354(128);
		if ((this.anInt5494 & 0x10) != 0) {
			this.aClass121_2 = new Class121(this.aClass45_Sub3_34, this);
		}
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method6526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method4709(-1, arg4, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(ILclient!og;ZI)V")
	private void method4706(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7_Sub13_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray12[arg0][arg2];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray14[arg0][arg2];
		@Pc(22) int local22 = local12.length;
		if (local22 > this.aClass45_Sub3_34.anIntArray583.length) {
			this.aClass45_Sub3_34.anIntArray582 = new int[local22];
			this.aClass45_Sub3_34.anIntArray583 = new int[local22];
		}
		@Pc(46) int[] local46 = this.aClass45_Sub3_34.anIntArray583;
		@Pc(50) int[] local50 = this.aClass45_Sub3_34.anIntArray582;
		for (@Pc(52) int local52 = 0; local52 < local22; local52++) {
			local46[local52] = local12[local52] >> this.aClass45_Sub3_34.anInt9043;
			local50[local52] = local19[local52] >> this.aClass45_Sub3_34.anInt9043;
		}
		@Pc(90) int local90 = 0;
		while (local22 > local90) {
			@Pc(96) int local96 = local46[local90];
			@Pc(101) int local101 = local50[local90++];
			@Pc(105) int local105 = local46[local90];
			@Pc(110) int local110 = local50[local90++];
			@Pc(114) int local114 = local46[local90];
			@Pc(119) int local119 = local50[local90++];
			if (-((local114 - local105) * (local110 + -local101)) + (local96 - local105) * (local110 - local119) > 0) {
				arg1.method5561(local101, local96, local114, local110, local119, local105);
			}
		}
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method6532(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt5517 <= 0) {
			return;
		}
		this.aClass45_Sub3_34.method7519();
		this.aClass45_Sub3_34.method7481(false);
		this.aClass45_Sub3_34.method7489(false);
		this.aClass45_Sub3_34.method7461(false);
		this.aClass45_Sub3_34.method7437(false);
		this.aClass45_Sub3_34.method7465(0);
		this.aClass45_Sub3_34.method7505(-2);
		this.aClass45_Sub3_34.method7475(null);
		Static78.aFloatArray113[1] = 0.0F;
		Static78.aFloatArray113[6] = 0.0F;
		Static78.aFloatArray113[7] = 0.0F;
		Static78.aFloatArray113[0] = (float) 1024 / ((float) this.aClass45_Sub3_34.anInt8994 * (float) super.anInt7850 * 128.0F);
		Static78.aFloatArray113[4] = 0.0F;
		Static78.aFloatArray113[5] = (float) 1024 / ((float) this.aClass45_Sub3_34.anInt9000 * 128.0F * (float) super.anInt7850);
		Static78.aFloatArray113[12] = -(((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass45_Sub3_34.anInt8994) - 1.0F;
		Static78.aFloatArray113[11] = 0.0F;
		Static78.aFloatArray113[14] = 0.0F;
		Static78.aFloatArray113[15] = 1.0F;
		Static78.aFloatArray113[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass45_Sub3_34.anInt9000;
		Static78.aFloatArray113[8] = 0.0F;
		Static78.aFloatArray113[9] = 0.0F;
		Static78.aFloatArray113[3] = 0.0F;
		Static78.aFloatArray113[2] = 0.0F;
		Static78.aFloatArray113[10] = 0.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static78.aFloatArray113, 0);
		Static78.aFloatArray113[10] = 0.0F;
		Static78.aFloatArray113[15] = 1.0F;
		Static78.aFloatArray113[1] = 0.0F;
		Static78.aFloatArray113[11] = 0.0F;
		Static78.aFloatArray113[14] = 0.0F;
		Static78.aFloatArray113[4] = 0.0F;
		Static78.aFloatArray113[0] = 1.0F;
		Static78.aFloatArray113[3] = 0.0F;
		Static78.aFloatArray113[5] = 0.0F;
		Static78.aFloatArray113[12] = 0.0F;
		Static78.aFloatArray113[13] = 0.0F;
		Static78.aFloatArray113[6] = 1.0F;
		Static78.aFloatArray113[9] = 1.0F;
		Static78.aFloatArray113[7] = 0.0F;
		Static78.aFloatArray113[8] = 0.0F;
		Static78.aFloatArray113[2] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static78.aFloatArray113, 0);
		if ((this.anInt5494 & 0x7) == 0) {
			this.aClass45_Sub3_34.method7489(false);
		} else {
			this.aClass45_Sub3_34.method7489(true);
			this.aClass45_Sub3_34.method7454();
		}
		this.aClass45_Sub3_34.method7498(this.aClass126_11, this.aClass126_10, this.aClass126_9, this.aClass126_12);
		if (this.anInt5502 * 2 > this.aClass45_Sub3_34.aClass3_Sub11_Sub2_3.aByteArray62.length) {
			this.aClass45_Sub3_34.aClass3_Sub11_Sub2_3 = new Class3_Sub11_Sub2(this.anInt5502 * 2);
		} else {
			this.aClass45_Sub3_34.aClass3_Sub11_Sub2_3.anInt6128 = 0;
		}
		@Pc(316) int local316 = 0;
		@Pc(320) Class3_Sub11_Sub2 local320 = this.aClass45_Sub3_34.aClass3_Sub11_Sub2_3;
		@Pc(326) int local326;
		@Pc(336) int local336;
		@Pc(338) int local338;
		@Pc(357) short[] local357;
		@Pc(361) int local361;
		if (this.aClass45_Sub3_34.aBoolean687) {
			for (local326 = arg1; local326 < arg3; local326++) {
				local336 = local326 * super.anInt7854 + arg0;
				for (local338 = arg0; local338 < arg2; local338++) {
					if (arg4[local338 - arg0][local326 - arg1]) {
						local357 = this.aShortArrayArray20[local336];
						if (local357 != null) {
							for (local361 = 0; local361 < local357.length; local361++) {
								local320.method5200(local357[local361] & 0xFFFF);
								local316++;
							}
						}
					}
					local336++;
				}
			}
		} else {
			for (local326 = arg1; local326 < arg3; local326++) {
				local336 = super.anInt7854 * local326 + arg0;
				for (local338 = arg0; local338 < arg2; local338++) {
					if (arg4[local338 - arg0][local326 - arg1]) {
						local357 = this.aShortArrayArray20[local336];
						if (local357 != null) {
							for (local361 = 0; local361 < local357.length; local361++) {
								local320.method5222(local357[local361] & 0xFFFF);
								local316++;
							}
						}
					}
					local336++;
				}
			}
		}
		if (local316 > 0) {
			@Pc(478) Class111_Sub1 local478 = new Class111_Sub1(this.aClass45_Sub3_34, 5123, local320.aByteArray62, local320.anInt6128);
			this.aClass45_Sub3_34.method7482(local478, 0, local316);
		}
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(III)V")
	@Override
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray16[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray16[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method6529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method4709(arg5, arg4, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(Lclient!eq;[I)V")
	@Override
	public void method6535(@OriginalArg(0) Class3_Sub10 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass112_37.method3079(new Class3_Sub35(this.aClass45_Sub3_34, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(II)V")
	@Override
	public void method6527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!mea", name = "DA", descriptor = "(Lclient!ha;IIIIZ)V")
	@Override
	public void DA(@OriginalArg(0) Class3_Sub7_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass121_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass45_Sub3_34.anInt9057 >> 8) >> this.aClass45_Sub3_34.anInt9043;
			@Pc(38) int local38 = arg3 - (arg2 * this.aClass45_Sub3_34.anInt9061 >> 8) >> this.aClass45_Sub3_34.anInt9043;
			this.aClass121_2.method3213(local38, arg0, local24);
		}
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(IZIIII[[Z)V")
	private void method4709(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean[][] arg5) {
		if (this.lb == null) {
			return;
		}
		@Pc(10) int local10 = arg4 + arg4 + 1;
		@Pc(14) int local14 = local10 * local10;
		if (local14 > this.aClass45_Sub3_34.anIntArray584.length) {
			this.aClass45_Sub3_34.anIntArray584 = new int[local14];
		}
		if (this.anInt5502 * 2 > this.aClass45_Sub3_34.aClass3_Sub11_Sub2_3.aByteArray62.length) {
			this.aClass45_Sub3_34.aClass3_Sub11_Sub2_3 = new Class3_Sub11_Sub2(this.anInt5502 * 2);
		}
		@Pc(58) int local58 = arg2 - arg4;
		@Pc(60) int local60 = local58;
		if (local58 < 0) {
			local58 = 0;
		}
		@Pc(69) int local69 = arg3 - arg4;
		@Pc(71) int local71 = local69;
		if (local69 < 0) {
			local69 = 0;
		}
		@Pc(83) int local83 = arg2 + arg4;
		if (local83 > super.anInt7854 - 1) {
			local83 = super.anInt7854 - 1;
		}
		@Pc(98) int local98 = arg4 + arg3;
		if (super.anInt7852 - 1 < local98) {
			local98 = super.anInt7852 - 1;
		}
		@Pc(115) int local115 = 0;
		@Pc(119) int[] local119 = this.aClass45_Sub3_34.anIntArray584;
		@Pc(132) int local132;
		for (@Pc(121) int local121 = local58; local121 <= local83; local121++) {
			@Pc(130) boolean[] local130 = arg5[local121 - local60];
			for (local132 = local69; local132 <= local98; local132++) {
				if (local130[local132 - local71]) {
					local119[local115++] = local132 * super.anInt7854 + local121;
				}
			}
		}
		if (arg0 == -1) {
			this.aClass45_Sub3_34.method7493();
		} else {
			this.aClass45_Sub3_34.method7455((float) arg0);
			this.aClass45_Sub3_34.method7511();
		}
		this.aClass45_Sub3_34.method7489((this.anInt5494 & 0x7) != 0);
		for (@Pc(197) int local197 = 0; local197 < this.lb.length; local197++) {
			this.lb[local197].method84(local115, local119);
		}
		if (!this.aClass112_37.method3093()) {
			local132 = this.aClass45_Sub3_34.anInt9087;
			@Pc(226) int local226 = this.aClass45_Sub3_34.anInt9085;
			this.aClass45_Sub3_34.pa(0, local226, this.aClass45_Sub3_34.anInt9075);
			this.aClass45_Sub3_34.method7489(false);
			this.aClass45_Sub3_34.method7437(false);
			this.aClass45_Sub3_34.method7465(128);
			this.aClass45_Sub3_34.method7505(-2);
			this.aClass45_Sub3_34.method7475(this.aClass45_Sub3_34.aClass24_Sub1_6);
			this.aClass45_Sub3_34.method7491(8448, 7681);
			this.aClass45_Sub3_34.method7507(770, 34166, 0);
			this.aClass45_Sub3_34.method7450(0, 34167);
			for (@Pc(286) Class3 local286 = this.aClass112_37.method3088(); local286 != null; local286 = this.aClass112_37.method3084()) {
				@Pc(291) Class3_Sub35 local291 = (Class3_Sub35) local286;
				local291.method5087(arg4, arg2, arg5, arg3);
			}
			this.aClass45_Sub3_34.method7507(768, 5890, 0);
			this.aClass45_Sub3_34.method7450(0, 5890);
			this.aClass45_Sub3_34.method7475(null);
			this.aClass45_Sub3_34.pa(local132, local226, this.aClass45_Sub3_34.anInt9075);
		}
		if (this.aClass121_2 == null) {
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		this.aClass45_Sub3_34.method7498(this.aClass126_11, null, this.aClass126_9, null);
		this.aClass121_2.method3217(arg5, arg1, arg4, arg2, arg3);
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!mea", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray10 == null) {
			this.anIntArrayArrayArray10 = new int[super.anInt7854][super.anInt7852][];
		}
		if (arg3 != null && this.anIntArrayArrayArray11 == null) {
			this.anIntArrayArrayArray11 = new int[super.anInt7854][super.anInt7852][];
		}
		this.anIntArrayArrayArray12[arg0][arg1] = arg2;
		this.anIntArrayArrayArray14[arg0][arg1] = arg4;
		this.anIntArrayArrayArray15[arg0][arg1] = arg6;
		this.anIntArrayArrayArray13[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray10 != null) {
			this.anIntArrayArrayArray10[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray11 != null) {
			this.anIntArrayArrayArray11[arg0][arg1] = arg3;
		}
		@Pc(88) Class3_Sub2[] local88 = this.aClass3_Sub2ArrayArrayArray1[arg0][arg1] = new Class3_Sub2[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) (arg9[local90] << 14) | (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42 | (long) arg8[local90];
			@Pc(125) Class3 local125;
			for (local125 = this.aClass354_28.method7689(local119); local125 != null; local125 = this.aClass354_28.method7693()) {
				@Pc(130) Class3_Sub2 local130 = (Class3_Sub2) local125;
				if (local130.anInt117 == arg8[local90] && local130.aFloat1 == (float) arg9[local90] && arg10 == local130.anInt106 && local130.anInt109 == arg11 && local130.anInt119 == arg12) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class3_Sub2(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass354_28.method7691(local88[local90], local119);
			} else {
				local88[local90] = (Class3_Sub2) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray15[arg0][arg1] = (byte) (this.aByteArrayArray15[arg0][arg1] | 0x1);
		}
		if (this.anInt5518 < arg6.length) {
			this.anInt5518 = arg6.length;
		}
		this.anInt5517 += arg6.length;
	}

	@OriginalMember(owner = "client!mea", name = "v", descriptor = "(IILclient!ha;)Lclient!ha;")
	@Override
	public Class3_Sub7_Sub13 v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub7_Sub13 arg2) {
		if ((this.aByteArrayArray15[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt7850 >> this.aClass45_Sub3_34.anInt9043;
		@Pc(27) Class3_Sub7_Sub13_Sub1 local27 = (Class3_Sub7_Sub13_Sub1) arg2;
		@Pc(37) Class3_Sub7_Sub13_Sub1 local37;
		if (local27 != null && local27.method5562(local24, local24)) {
			local37 = local27;
			local27.method5564();
		} else {
			local37 = new Class3_Sub7_Sub13_Sub1(this.aClass45_Sub3_34, local24, local24);
		}
		local37.method5567(local24, 0, local24, 0);
		this.method4706(arg0, local37, arg1);
		return local37;
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(Lclient!ha;IIIIZ)Z")
	@Override
	public boolean method6534(@OriginalArg(0) Class3_Sub7_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass121_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass45_Sub3_34.anInt9057 >> 8) >> this.aClass45_Sub3_34.anInt9043;
			@Pc(39) int local39 = arg3 - (this.aClass45_Sub3_34.anInt9061 * arg2 >> 8) >> this.aClass45_Sub3_34.anInt9043;
			return this.aClass121_2.method3210(local24, local39, arg0);
		}
	}

	@OriginalMember(owner = "client!mea", name = "E", descriptor = "(Lclient!ha;IIIIZ)V")
	@Override
	public void E(@OriginalArg(0) Class3_Sub7_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass121_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass45_Sub3_34.anInt9057 >> 8) >> this.aClass45_Sub3_34.anInt9043;
			@Pc(39) int local39 = arg3 - (this.aClass45_Sub3_34.anInt9061 * arg2 >> 8) >> this.aClass45_Sub3_34.anInt9043;
			this.aClass121_2.method3215(local39, arg0, local24);
		}
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
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

	@OriginalMember(owner = "client!mea", name = "BA", descriptor = "()V")
	@Override
	public void BA() {
		if (this.anInt5517 <= 0) {
			this.aClass121_2 = null;
		} else {
			@Pc(22) byte[][] local22 = new byte[super.anInt7854 + 1][super.anInt7852 + 1];
			@Pc(28) int local28;
			for (@Pc(24) int local24 = 1; local24 < super.anInt7854; local24++) {
				for (local28 = 1; super.anInt7852 > local28; local28++) {
					local22[local24][local28] = (byte) ((this.aByteArrayArray16[local24][local28] >> 1) + (this.aByteArrayArray16[local24][local28 + 1] >> 3) + (this.aByteArrayArray16[local24 + 1][local28] >> 3) + (this.aByteArrayArray16[local24 + -1][local28] >> 2) + (this.aByteArrayArray16[local24][local28 + -1] >> 2));
				}
			}
			this.lb = new Class3_Sub2[this.aClass354_28.method7688()];
			this.aClass354_28.method7695(this.lb);
			for (local28 = 0; local28 < this.lb.length; local28++) {
				this.lb[local28].method85(this.anInt5517);
			}
			@Pc(132) int local132 = 24;
			if (this.anIntArrayArrayArray10 != null) {
				local132 += 4;
			}
			if ((this.anInt5494 & 0x7) != 0) {
				local132 += 12;
			}
			@Pc(152) NativeHeapBuffer local152 = this.aClass45_Sub3_34.aNativeHeap6.a(local132 * this.anInt5517, false);
			@Pc(157) Stream local157 = new Stream(local152);
			@Pc(161) Class3_Sub2[] local161 = new Class3_Sub2[this.anInt5517];
			@Pc(168) int local168 = Static489.method6617(this.anInt5517 / 4);
			if (local168 < 1) {
				local168 = 1;
			}
			@Pc(180) Class354 local180 = new Class354(local168);
			@Pc(184) Class3_Sub2[] local184 = new Class3_Sub2[this.anInt5518];
			@Pc(190) int local190;
			for (@Pc(186) int local186 = 0; local186 < super.anInt7854; local186++) {
				for (local190 = 0; local190 < super.anInt7852; local190++) {
					if (this.anIntArrayArrayArray15[local186][local190] != null) {
						@Pc(206) Class3_Sub2[] local206 = this.aClass3_Sub2ArrayArrayArray1[local186][local190];
						@Pc(213) int[] local213 = this.anIntArrayArrayArray12[local186][local190];
						@Pc(220) int[] local220 = this.anIntArrayArrayArray14[local186][local190];
						@Pc(227) int[] local227 = this.anIntArrayArrayArray13[local186][local190];
						@Pc(234) int[] local234 = this.anIntArrayArrayArray15[local186][local190];
						@Pc(246) int[] local246 = this.anIntArrayArrayArray11 == null ? null : this.anIntArrayArrayArray11[local186][local190];
						@Pc(258) int[] local258 = this.anIntArrayArrayArray10 == null ? null : this.anIntArrayArrayArray10[local186][local190];
						if (local227 == null) {
							local227 = local234;
						}
						@Pc(269) float local269 = this.aFloatArrayArray9[local186][local190];
						@Pc(276) float local276 = this.aFloatArrayArray10[local186][local190];
						@Pc(283) float local283 = this.aFloatArrayArray8[local186][local190];
						@Pc(292) float local292 = this.aFloatArrayArray9[local186][local190 + 1];
						@Pc(301) float local301 = this.aFloatArrayArray10[local186][local190 + 1];
						@Pc(310) float local310 = this.aFloatArrayArray8[local186][local190 + 1];
						@Pc(321) float local321 = this.aFloatArrayArray9[local186 + 1][local190 + 1];
						@Pc(332) float local332 = this.aFloatArrayArray10[local186 + 1][local190 + 1];
						@Pc(343) float local343 = this.aFloatArrayArray8[local186 + 1][local190 + 1];
						@Pc(352) float local352 = this.aFloatArrayArray9[local186 + 1][local190];
						@Pc(361) float local361 = this.aFloatArrayArray10[local186 + 1][local190];
						@Pc(370) float local370 = this.aFloatArrayArray8[local186 + 1][local190];
						@Pc(378) int local378 = local22[local186][local190] & 0xFF;
						@Pc(388) int local388 = local22[local186][local190 + 1] & 0xFF;
						@Pc(400) int local400 = local22[local186 + 1][local190 + 1] & 0xFF;
						@Pc(410) int local410 = local22[local186 + 1][local190] & 0xFF;
						@Pc(412) int local412 = 0;
						@Pc(422) int local422;
						label337: for (@Pc(414) int local414 = 0; local414 < local234.length; local414++) {
							@Pc(420) Class3_Sub2 local420 = local206[local414];
							for (local422 = 0; local422 < local412; local422++) {
								if (local184[local422] == local420) {
									continue label337;
								}
							}
							local184[local412++] = local420;
						}
						@Pc(460) short[] local460 = this.aShortArrayArray20[local190 * super.anInt7854 + local186] = new short[local234.length];
						for (local422 = 0; local422 < local234.length; local422++) {
							@Pc(473) int local473 = (local186 << super.anInt7856) + local213[local422];
							@Pc(483) int local483 = (local190 << super.anInt7856) + local220[local422];
							@Pc(488) int local488 = local473 >> this.anInt5499;
							@Pc(493) int local493 = local483 >> this.anInt5499;
							@Pc(497) int local497 = local234[local422];
							@Pc(501) int local501 = local227[local422];
							@Pc(509) int local509 = local246 == null ? 0 : local246[local422];
							@Pc(527) long local527 = (long) (local488 << 16) | (long) local501 << 48 | (long) local497 << 32 | (long) local493;
							@Pc(531) int local531 = local213[local422];
							@Pc(535) int local535 = local220[local422];
							@Pc(537) byte local537 = 74;
							@Pc(539) int local539 = 0;
							@Pc(553) float local553;
							@Pc(551) float local551;
							@Pc(559) float local559;
							@Pc(648) float local648;
							@Pc(557) int local557;
							if (local531 == 0 && local535 == 0) {
								local551 = local276;
								local553 = local269;
								local557 = local537 - local378;
								local559 = local283;
							} else if (local531 == 0 && local535 == super.anInt7850) {
								local553 = local292;
								local557 = local537 - local388;
								local559 = local310;
								local551 = local301;
							} else if (local531 == super.anInt7850 && super.anInt7850 == local535) {
								local551 = local332;
								local559 = local343;
								local557 = local537 - local400;
								local553 = local321;
							} else if (super.anInt7850 == local531 && local535 == 0) {
								local559 = local370;
								local553 = local352;
								local557 = local537 - local410;
								local551 = local361;
							} else {
								@Pc(623) float local623 = (float) local531 / (float) super.anInt7850;
								@Pc(630) float local630 = (float) local535 / (float) super.anInt7850;
								@Pc(639) float local639 = local269 + (local352 - local269) * local623;
								local648 = local276 + local623 * (local361 - local276);
								@Pc(656) float local656 = local283 + (local370 - local283) * local623;
								@Pc(664) float local664 = local623 * (local321 - local292) + local292;
								@Pc(673) float local673 = (local332 - local301) * local623 + local301;
								local553 = (local664 - local639) * local630 + local639;
								local551 = (local673 - local648) * local630 + local648;
								@Pc(699) float local699 = local310 + (local343 - local310) * local623;
								local559 = local656 + local630 * (local699 - local656);
								@Pc(718) int local718 = local378 + ((local410 - local378) * local531 >> super.anInt7856);
								@Pc(731) int local731 = local388 + ((local400 - local388) * local531 >> super.anInt7856);
								local557 = local537 - local718 - ((local731 - local718) * local535 >> super.anInt7856);
							}
							@Pc(760) float local760 = 1.0F;
							if (local497 != -1) {
								@Pc(772) int local772 = local557 * (local497 & 0x7F) >> 7;
								if (local772 < 2) {
									local772 = 2;
								} else if (local772 > 126) {
									local772 = 126;
								}
								if ((this.anInt5494 & 0x7) == 0) {
									local760 = this.aClass45_Sub3_34.aFloatArray98[2] * local559 + this.aClass45_Sub3_34.aFloatArray98[1] * local551 + this.aClass45_Sub3_34.aFloatArray98[0] * local553;
									local760 = this.aClass45_Sub3_34.aFloat197 + (local760 > 0.0F ? this.aClass45_Sub3_34.aFloat194 : this.aClass45_Sub3_34.aFloat181) * local760;
								}
								local539 = Static214.anIntArray203[local497 & 0xFF80 | local772];
							}
							@Pc(843) Class3 local843 = null;
							if ((this.anInt5492 - 1 & local473) == 0 && (local483 & this.anInt5492 - 1) == 0) {
								local843 = local180.method7689(local527);
							}
							@Pc(1202) int local1202;
							@Pc(875) int local875;
							if (local843 == null) {
								if (local501 == local497) {
									local875 = local539;
								} else {
									@Pc(885) int local885 = local557 * (local501 & 0x7F) >> 7;
									if (local885 < 2) {
										local885 = 2;
									} else if (local885 > 126) {
										local885 = 126;
									}
									local875 = Static214.anIntArray203[local501 & 0xFF80 | local885];
									if ((this.anInt5494 & 0x7) == 0) {
										@Pc(937) float local937 = this.aClass45_Sub3_34.aFloatArray98[0] * local553 + this.aClass45_Sub3_34.aFloatArray98[1] * local551 + this.aClass45_Sub3_34.aFloatArray98[2] * local559;
										local648 = (local760 > 0.0F ? this.aClass45_Sub3_34.aFloat194 : this.aClass45_Sub3_34.aFloat181) * local760 + this.aClass45_Sub3_34.aFloat197;
										@Pc(962) int local962 = local875 >> 16 & 0xFF;
										@Pc(968) int local968 = local875 >> 8 & 0xFF;
										local962 = (int) ((float) local962 * local648);
										@Pc(978) int local978 = local875 & 0xFF;
										local968 = (int) ((float) local968 * local648);
										if (local962 < 0) {
											local962 = 0;
										} else if (local962 > 255) {
											local962 = 255;
										}
										local978 = (int) ((float) local978 * local648);
										if (local968 < 0) {
											local968 = 0;
										} else if (local968 > 255) {
											local968 = 255;
										}
										if (local978 < 0) {
											local978 = 0;
										} else if (local978 > 255) {
											local978 = 255;
										}
										local875 = local962 << 16 | local968 << 8 | local978;
									}
								}
								if (this.aClass45_Sub3_34.aBoolean687) {
									local157.a((float) local473);
									local157.a((float) (this.method6530(local473, local483) + local509));
									local157.a((float) local483);
									local157.d((byte) (local875 >> 16));
									local157.d((byte) (local875 >> 8));
									local157.d((byte) local875);
									local157.d(-1);
									local157.a((float) local473);
									local157.a((float) local483);
									if (this.anIntArrayArrayArray10 != null) {
										local157.a((float) (local258 == null ? 0 : local258[local422] - 1));
									}
									if ((this.anInt5494 & 0x7) != 0) {
										local157.a(local553);
										local157.a(local551);
										local157.a(local559);
									}
								} else {
									local157.b((float) local473);
									local157.b((float) (local509 + this.method6530(local473, local483)));
									local157.b((float) local483);
									local157.d((byte) (local875 >> 16));
									local157.d((byte) (local875 >> 8));
									local157.d((byte) local875);
									local157.d(-1);
									local157.b((float) local473);
									local157.b((float) local483);
									if (this.anIntArrayArrayArray10 != null) {
										local157.b((float) (local258 == null ? 0 : local258[local422] - 1));
									}
									if ((this.anInt5494 & 0x7) != 0) {
										local157.b(local553);
										local157.b(local551);
										local157.b(local559);
									}
								}
								local1202 = this.anInt5498++;
								local460[local422] = (short) local1202;
								if (local497 != -1) {
									local161[local1202] = local206[local422];
								}
								local180.method7691(new Class3_Sub40(local460[local422]), local527);
							} else {
								local460[local422] = ((Class3_Sub40) local843).aShort116;
								local1202 = local460[local422] & 0xFFFF;
								if (local497 != -1 && local161[local1202].aLong273 > local206[local422].aLong273) {
									local161[local1202] = local206[local422];
								}
							}
							for (local875 = 0; local875 < local412; local875++) {
								local184[local875].method80(local760, local539, local557, local1202);
							}
							this.anInt5502++;
						}
					}
				}
			}
			for (local190 = 0; local190 < this.anInt5498; local190++) {
				@Pc(1319) Class3_Sub2 local1319 = local161[local190];
				if (local1319 != null) {
					local1319.method87(local190);
				}
			}
			@Pc(1352) int local1352;
			for (@Pc(1332) int local1332 = 0; local1332 < super.anInt7854; local1332++) {
				for (@Pc(1336) int local1336 = 0; super.anInt7852 > local1336; local1336++) {
					@Pc(1348) short[] local1348 = this.aShortArrayArray20[super.anInt7854 * local1336 + local1332];
					if (local1348 != null) {
						local1352 = 0;
						@Pc(1354) int local1354 = 0;
						while (local1354 < local1348.length) {
							@Pc(1363) int local1363 = local1348[local1354++] & 0xFFFF;
							@Pc(1370) int local1370 = local1348[local1354++] & 0xFFFF;
							@Pc(1377) int local1377 = local1348[local1354++] & 0xFFFF;
							@Pc(1381) Class3_Sub2 local1381 = local161[local1363];
							@Pc(1385) Class3_Sub2 local1385 = local161[local1370];
							@Pc(1389) Class3_Sub2 local1389 = local161[local1377];
							@Pc(1391) Class3_Sub2 local1391 = null;
							if (local1381 != null) {
								local1391 = local1381;
								local1381.method82(local1336, local1332, local1352);
							}
							if (local1385 != null) {
								local1385.method82(local1336, local1332, local1352);
								if (local1391 == null || local1391.aLong273 > local1385.aLong273) {
									local1391 = local1385;
								}
							}
							if (local1389 != null) {
								local1389.method82(local1336, local1332, local1352);
								if (local1391 == null || local1391.aLong273 > local1389.aLong273) {
									local1391 = local1389;
								}
							}
							if (local1391 != null) {
								if (local1381 != null) {
									local1391.method87(local1363);
								}
								if (local1385 != null) {
									local1391.method87(local1370);
								}
								if (local1389 != null) {
									local1391.method87(local1377);
								}
								local1391.method82(local1336, local1332, local1352);
							}
							local1352++;
						}
					}
				}
			}
			local157.a();
			this.anInterface21_4 = this.aClass45_Sub3_34.method7485(local157.b(), local152, local132);
			this.aClass126_11 = new Class126(this.anInterface21_4, 5126, 3, 0);
			this.aClass126_10 = new Class126(this.anInterface21_4, 5121, 4, 12);
			@Pc(1534) byte local1534;
			if (this.anIntArrayArrayArray10 == null) {
				this.aClass126_9 = new Class126(this.anInterface21_4, 5126, 2, 16);
				local1534 = 24;
			} else {
				local1534 = 28;
				this.aClass126_9 = new Class126(this.anInterface21_4, 5126, 3, 16);
			}
			if ((this.anInt5494 & 0x7) != 0) {
				this.aClass126_12 = new Class126(this.anInterface21_4, 5126, 3, local1534);
			}
			@Pc(1568) long[] local1568 = new long[this.lb.length];
			for (local1352 = 0; local1352 < this.lb.length; local1352++) {
				@Pc(1577) Class3_Sub2 local1577 = this.lb[local1352];
				local1568[local1352] = local1577.aLong273;
				local1577.method83(this.anInt5498);
			}
			Static535.method7131(local1568, this.lb);
			if (this.aClass121_2 != null) {
				this.aClass121_2.method3208();
			}
		}
		this.anIntArrayArrayArray13 = null;
		this.aClass354_28 = null;
		this.anIntArrayArrayArray10 = null;
		this.anIntArrayArrayArray15 = null;
		this.aByteArrayArray16 = null;
		this.aFloatArrayArray9 = this.aFloatArrayArray10 = this.aFloatArrayArray8 = null;
		this.aClass3_Sub2ArrayArrayArray1 = null;
		this.anIntArrayArrayArray12 = this.anIntArrayArrayArray14 = null;
		this.anIntArrayArrayArray11 = null;
	}
}
