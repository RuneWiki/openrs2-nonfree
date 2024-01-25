import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class52_Sub3 extends Class52 {

	@OriginalMember(owner = "client!pf", name = "o", descriptor = "I")
	private int anInt6922;

	@OriginalMember(owner = "client!pf", name = "r", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!pf", name = "S", descriptor = "I")
	private int anInt6939;

	@OriginalMember(owner = "client!pf", name = "X", descriptor = "I")
	private int anInt6941;

	@OriginalMember(owner = "client!pf", name = "Y", descriptor = "Lclient!gr;")
	public Class112 aClass112_11;

	@OriginalMember(owner = "client!pf", name = "ab", descriptor = "Lclient!gr;")
	public Class112 aClass112_12;

	@OriginalMember(owner = "client!pf", name = "bb", descriptor = "I")
	private int anInt6942;

	@OriginalMember(owner = "client!pf", name = "cb", descriptor = "Lclient!gr;")
	public Class112 aClass112_13;

	@OriginalMember(owner = "client!pf", name = "db", descriptor = "Lclient!bo;")
	private Interface1 anInterface1_6;

	@OriginalMember(owner = "client!pf", name = "ib", descriptor = "Lclient!gr;")
	private Class112 aClass112_14;

	@OriginalMember(owner = "client!pf", name = "jb", descriptor = "[Lclient!nc;")
	private Class3_Sub34[] aClass3_Sub34Array1;

	@OriginalMember(owner = "client!pf", name = "z", descriptor = "Lclient!eea;")
	private final Class71 aClass71_55 = new Class71();

	@OriginalMember(owner = "client!pf", name = "O", descriptor = "Lclient!ad;")
	public final Class5_Sub1 aClass5_Sub1_28;

	@OriginalMember(owner = "client!pf", name = "J", descriptor = "[[I")
	private final int[][] anIntArrayArray68;

	@OriginalMember(owner = "client!pf", name = "q", descriptor = "I")
	private final int anInt6923;

	@OriginalMember(owner = "client!pf", name = "R", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray19;

	@OriginalMember(owner = "client!pf", name = "eb", descriptor = "[[F")
	private float[][] aFloatArrayArray16;

	@OriginalMember(owner = "client!pf", name = "U", descriptor = "[[[Lclient!nc;")
	private Class3_Sub34[][][] aClass3_Sub34ArrayArrayArray1;

	@OriginalMember(owner = "client!pf", name = "P", descriptor = "[[S")
	public final short[][] aShortArrayArray6;

	@OriginalMember(owner = "client!pf", name = "A", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray17;

	@OriginalMember(owner = "client!pf", name = "p", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!pf", name = "C", descriptor = "[[B")
	private final byte[][] aByteArrayArray20;

	@OriginalMember(owner = "client!pf", name = "v", descriptor = "I")
	public final int anInt6927;

	@OriginalMember(owner = "client!pf", name = "gb", descriptor = "[[B")
	private byte[][] aByteArrayArray21;

	@OriginalMember(owner = "client!pf", name = "fb", descriptor = "[[F")
	private float[][] aFloatArrayArray17;

	@OriginalMember(owner = "client!pf", name = "K", descriptor = "I")
	private final int anInt6935;

	@OriginalMember(owner = "client!pf", name = "B", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray18;

	@OriginalMember(owner = "client!pf", name = "w", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!pf", name = "Z", descriptor = "[[F")
	private float[][] aFloatArrayArray15;

	@OriginalMember(owner = "client!pf", name = "hb", descriptor = "Lclient!sd;")
	private Class267 aClass267_32;

	@OriginalMember(owner = "client!pf", name = "N", descriptor = "Lclient!qq;")
	private Class249 aClass249_1;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Lclient!ad;IIII[[I[[II)V")
	public Class52_Sub3(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.aClass5_Sub1_28 = arg0;
		this.anIntArrayArray68 = arg5;
		this.anInt6923 = super.anInt9494 - 2;
		this.anIntArrayArrayArray19 = new int[arg3][arg4][];
		this.aFloatArrayArray16 = new float[super.anInt9491 + 1][super.anInt9492 + 1];
		this.aClass3_Sub34ArrayArrayArray1 = new Class3_Sub34[arg3][arg4][];
		this.aShortArrayArray6 = new short[arg3 * arg4][];
		this.anIntArrayArrayArray17 = new int[arg3][arg4][];
		this.anIntArrayArrayArray14 = new int[arg3][arg4][];
		this.aByteArrayArray20 = new byte[arg3][arg4];
		this.anInt6927 = arg2;
		this.aByteArrayArray21 = new byte[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray17 = new float[super.anInt9491 + 1][super.anInt9492 + 1];
		this.anInt6935 = 0x1 << this.anInt6923;
		this.anIntArrayArrayArray18 = new int[arg3][arg4][];
		this.anIntArrayArrayArray16 = new int[arg3][arg4][];
		this.aFloatArrayArray15 = new float[super.anInt9491 + 1][super.anInt9492 + 1];
		for (@Pc(117) int local117 = 1; local117 < super.anInt9492; local117++) {
			for (@Pc(121) int local121 = 1; local121 < super.anInt9491; local121++) {
				@Pc(140) int local140 = arg6[local121 + 1][local117] - arg6[local121 - 1][local117];
				@Pc(157) int local157 = arg6[local121][local117 + 1] - arg6[local121][local117 - 1];
				@Pc(176) float local176 = (float) (1.0D / Math.sqrt((double) (local140 * local140 + arg7 * 4 * arg7 + local157 * local157)));
				this.aFloatArrayArray15[local121][local117] = local176 * (float) local140;
				this.aFloatArrayArray16[local121][local117] = local176 * (float) (-arg7 * 2);
				this.aFloatArrayArray17[local121][local117] = (float) local157 * local176;
			}
		}
		this.aClass267_32 = new Class267(128);
		if ((this.anInt6927 & 0x10) != 0) {
			this.aClass249_1 = new Class249(this.aClass5_Sub1_28, this);
		}
	}

	@OriginalMember(owner = "client!pf", name = "EA", descriptor = "(III)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray21[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray21[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)V")
	@Override
	public void method7830(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!pf", name = "JA", descriptor = "(II)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray68[arg0][arg1];
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILclient!wca;BI)V")
	private void method5827(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub10_Sub18_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray18[arg2][arg0];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray17[arg2][arg0];
		@Pc(28) int local28 = local12.length;
		if (this.aClass5_Sub1_28.anIntArray83.length < local28) {
			this.aClass5_Sub1_28.anIntArray83 = new int[local28];
			this.aClass5_Sub1_28.anIntArray82 = new int[local28];
		}
		@Pc(48) int[] local48 = this.aClass5_Sub1_28.anIntArray83;
		@Pc(52) int[] local52 = this.aClass5_Sub1_28.anIntArray82;
		for (@Pc(54) int local54 = 0; local54 < local28; local54++) {
			local48[local54] = local12[local54] >> this.aClass5_Sub1_28.anInt375;
			local52[local54] = local19[local54] >> this.aClass5_Sub1_28.anInt375;
		}
		@Pc(86) int local86 = 0;
		while (local28 > local86) {
			@Pc(92) int local92 = local48[local86];
			@Pc(97) int local97 = local52[local86++];
			@Pc(101) int local101 = local48[local86];
			@Pc(106) int local106 = local52[local86++];
			@Pc(110) int local110 = local48[local86];
			@Pc(115) int local115 = local52[local86++];
			if (-((local106 - local97) * (local110 - local101)) + (local92 - local101) * (local106 - local115) > 0) {
				arg1.method7647(local92, local106, local97, local115, local101, local110);
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method7828(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method5830(arg4, arg1, arg2, arg0, arg3);
	}

	@OriginalMember(owner = "client!pf", name = "aa", descriptor = "(Lclient!w;IIIIZ)V")
	@Override
	public void aa(@OriginalArg(0) Class3_Sub10_Sub18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass249_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass5_Sub1_28.anInt404 * arg2 >> 8) >> this.aClass5_Sub1_28.anInt375;
			@Pc(38) int local38 = arg3 - (arg2 * this.aClass5_Sub1_28.anInt417 >> 8) >> this.aClass5_Sub1_28.anInt375;
			this.aClass249_1.method6135(local24, arg0, local38);
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!w;IIIIZ)Z")
	@Override
	public boolean method7831(@OriginalArg(0) Class3_Sub10_Sub18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass249_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (this.aClass5_Sub1_28.anInt404 * arg2 >> 8) >> this.aClass5_Sub1_28.anInt375;
			@Pc(39) int local39 = arg3 - (this.aClass5_Sub1_28.anInt417 * arg2 >> 8) >> this.aClass5_Sub1_28.anInt375;
			return this.aClass249_1.method6130(arg0, local25, local39);
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7826(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt6941 <= 0) {
			return;
		}
		this.aClass5_Sub1_28.method412();
		this.aClass5_Sub1_28.method406(false);
		this.aClass5_Sub1_28.method454(false);
		this.aClass5_Sub1_28.method388(false);
		this.aClass5_Sub1_28.method413(false);
		this.aClass5_Sub1_28.method455(0);
		this.aClass5_Sub1_28.method414(-2);
		this.aClass5_Sub1_28.method423(null);
		Static143.aFloatArray11[2] = 0.0F;
		Static143.aFloatArray11[14] = 0.0F;
		Static143.aFloatArray11[4] = 0.0F;
		Static143.aFloatArray11[9] = 0.0F;
		Static143.aFloatArray11[10] = 0.0F;
		Static143.aFloatArray11[6] = 0.0F;
		Static143.aFloatArray11[15] = 1.0F;
		Static143.aFloatArray11[11] = 0.0F;
		Static143.aFloatArray11[0] = (float) 1024 / ((float) this.aClass5_Sub1_28.anInt264 * 128.0F * (float) super.anInt9493);
		Static143.aFloatArray11[1] = 0.0F;
		Static143.aFloatArray11[7] = 0.0F;
		Static143.aFloatArray11[3] = 0.0F;
		Static143.aFloatArray11[12] = -1.0F - ((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass5_Sub1_28.anInt264;
		Static143.aFloatArray11[8] = 0.0F;
		Static143.aFloatArray11[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass5_Sub1_28.anInt256;
		Static143.aFloatArray11[5] = (float) 1024 / ((float) super.anInt9493 * 128.0F * (float) this.aClass5_Sub1_28.anInt256);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static143.aFloatArray11, 0);
		Static143.aFloatArray11[8] = 0.0F;
		Static143.aFloatArray11[6] = 1.0F;
		Static143.aFloatArray11[13] = 0.0F;
		Static143.aFloatArray11[15] = 1.0F;
		Static143.aFloatArray11[1] = 0.0F;
		Static143.aFloatArray11[14] = 0.0F;
		Static143.aFloatArray11[7] = 0.0F;
		Static143.aFloatArray11[3] = 0.0F;
		Static143.aFloatArray11[10] = 0.0F;
		Static143.aFloatArray11[2] = 0.0F;
		Static143.aFloatArray11[9] = 1.0F;
		Static143.aFloatArray11[12] = 0.0F;
		Static143.aFloatArray11[11] = 0.0F;
		Static143.aFloatArray11[4] = 0.0F;
		Static143.aFloatArray11[0] = 1.0F;
		Static143.aFloatArray11[5] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static143.aFloatArray11, 0);
		if ((this.anInt6927 & 0x7) == 0) {
			this.aClass5_Sub1_28.method454(false);
		} else {
			this.aClass5_Sub1_28.method454(true);
			this.aClass5_Sub1_28.method449();
		}
		this.aClass5_Sub1_28.method383(this.aClass112_13, this.aClass112_12, this.aClass112_14, this.aClass112_11);
		if (this.aClass5_Sub1_28.aClass3_Sub27_Sub2_1.aByteArray114.length >= this.anInt6922 * 2) {
			this.aClass5_Sub1_28.aClass3_Sub27_Sub2_1.anInt9191 = 0;
		} else {
			this.aClass5_Sub1_28.aClass3_Sub27_Sub2_1 = new Class3_Sub27_Sub2(this.anInt6922 * 2);
		}
		@Pc(313) int local313 = 0;
		@Pc(317) Class3_Sub27_Sub2 local317 = this.aClass5_Sub1_28.aClass3_Sub27_Sub2_1;
		@Pc(323) int local323;
		@Pc(332) int local332;
		@Pc(334) int local334;
		@Pc(353) short[] local353;
		@Pc(357) int local357;
		if (this.aClass5_Sub1_28.aBoolean39) {
			for (local323 = arg1; local323 < arg3; local323++) {
				local332 = arg0 + super.anInt9491 * local323;
				for (local334 = arg0; local334 < arg2; local334++) {
					if (arg4[local334 - arg0][local323 - arg1]) {
						local353 = this.aShortArrayArray6[local332];
						if (local353 != null) {
							for (local357 = 0; local357 < local353.length; local357++) {
								local313++;
								local317.method7600(local353[local357] & 0xFFFF, 30364);
							}
						}
					}
					local332++;
				}
			}
		} else {
			for (local323 = arg1; local323 < arg3; local323++) {
				local332 = arg0 + super.anInt9491 * local323;
				for (local334 = arg0; local334 < arg2; local334++) {
					if (arg4[local334 - arg0][local323 - arg1]) {
						local353 = this.aShortArrayArray6[local332];
						if (local353 != null) {
							for (local357 = 0; local357 < local353.length; local357++) {
								local317.method7556(local353[local357] & 0xFFFF);
								local313++;
							}
						}
					}
					local332++;
				}
			}
		}
		if (local313 > 0) {
			@Pc(472) Class33_Sub2 local472 = new Class33_Sub2(this.aClass5_Sub1_28, 5123, local317.aByteArray114, local317.anInt9191);
			this.aClass5_Sub1_28.method391(0, local313, local472);
		}
	}

	@OriginalMember(owner = "client!pf", name = "sa", descriptor = "(II)I")
	@Override
	public int sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 >> super.anInt9494;
		@Pc(13) int local13 = arg1 >> super.anInt9494;
		if (local8 < 0 || local13 < 0 || local8 > super.anInt9491 - 1 || super.anInt9492 - 1 < local13) {
			return 0;
		}
		@Pc(48) int local48 = arg0 & super.anInt9493 - 1;
		@Pc(55) int local55 = super.anInt9493 - 1 & arg1;
		@Pc(83) int local83 = (super.anInt9493 - local48) * this.anIntArrayArray68[local8][local13] + local48 * this.anIntArrayArray68[local8 + 1][local13] >> super.anInt9494;
		@Pc(114) int local114 = this.anIntArrayArray68[local8][local13 + 1] * (super.anInt9493 - local48) + this.anIntArrayArray68[local8 + 1][local13 + 1] * local48 >> super.anInt9494;
		return local114 * local55 + (super.anInt9493 - local55) * local83 >> super.anInt9494;
	}

	@OriginalMember(owner = "client!pf", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray15 == null) {
			this.anIntArrayArrayArray15 = new int[super.anInt9491][super.anInt9492][];
		}
		if (arg3 != null && this.anIntArrayArrayArray16 == null) {
			this.anIntArrayArrayArray16 = new int[super.anInt9491][super.anInt9492][];
		}
		this.anIntArrayArrayArray18[arg0][arg1] = arg2;
		this.anIntArrayArrayArray17[arg0][arg1] = arg4;
		this.anIntArrayArrayArray19[arg0][arg1] = arg6;
		this.anIntArrayArrayArray14[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray15 != null) {
			this.anIntArrayArrayArray15[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray16 != null) {
			this.anIntArrayArrayArray16[arg0][arg1] = arg3;
		}
		@Pc(88) Class3_Sub34[] local88 = this.aClass3_Sub34ArrayArrayArray1[arg0][arg1] = new Class3_Sub34[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) arg8[local90] | (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28 | (long) (arg9[local90] << 14);
			@Pc(125) Class3 local125;
			for (local125 = this.aClass267_32.method6644(local119); local125 != null; local125 = this.aClass267_32.method6646()) {
				@Pc(130) Class3_Sub34 local130 = (Class3_Sub34) local125;
				if (arg8[local90] == local130.anInt6145 && (float) arg9[local90] == local130.aFloat178 && local130.anInt6147 == arg10 && arg11 == local130.anInt6151 && arg12 == local130.anInt6149) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class3_Sub34(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass267_32.method6640(local88[local90], local119);
			} else {
				local88[local90] = (Class3_Sub34) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray20[arg0][arg1] = (byte) (this.aByteArrayArray20[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt6942) {
			this.anInt6942 = arg6.length;
		}
		this.anInt6941 += arg6.length;
	}

	@OriginalMember(owner = "client!pf", name = "ba", descriptor = "()V")
	@Override
	public void ba() {
		if (this.anInt6941 > 0) {
			@Pc(17) byte[][] local17 = new byte[super.anInt9491 + 1][super.anInt9492 + 1];
			@Pc(23) int local23;
			for (@Pc(19) int local19 = 1; super.anInt9491 > local19; local19++) {
				for (local23 = 1; super.anInt9492 > local23; local23++) {
					local17[local19][local23] = (byte) ((this.aByteArrayArray21[local19][local23] >> 1) + (this.aByteArrayArray21[local19][local23 + 1] >> 3) + (this.aByteArrayArray21[local19][local23 + -1] >> 2) + (this.aByteArrayArray21[local19 + -1][local23] >> 2) + (this.aByteArrayArray21[local19 + 1][local23] >> 3));
				}
			}
			this.aClass3_Sub34Array1 = new Class3_Sub34[this.aClass267_32.method6641()];
			this.aClass267_32.method6639(this.aClass3_Sub34Array1);
			for (local23 = 0; local23 < this.aClass3_Sub34Array1.length; local23++) {
				this.aClass3_Sub34Array1[local23].method5145(this.anInt6941);
			}
			@Pc(131) int local131 = 24;
			if (this.anIntArrayArrayArray15 != null) {
				local131 += 4;
			}
			if ((this.anInt6927 & 0x7) != 0) {
				local131 += 12;
			}
			@Pc(154) NativeHeapBuffer local154 = this.aClass5_Sub1_28.aNativeHeap1.a(local131 * this.anInt6941, false);
			@Pc(159) Stream local159 = new Stream(local154);
			@Pc(163) Class3_Sub34[] local163 = new Class3_Sub34[this.anInt6941];
			@Pc(170) int local170 = Static27.method797(this.anInt6941 / 4);
			if (local170 < 1) {
				local170 = 1;
			}
			@Pc(182) Class267 local182 = new Class267(local170);
			@Pc(186) Class3_Sub34[] local186 = new Class3_Sub34[this.anInt6942];
			@Pc(192) int local192;
			for (@Pc(188) int local188 = 0; local188 < super.anInt9491; local188++) {
				for (local192 = 0; super.anInt9492 > local192; local192++) {
					if (this.anIntArrayArrayArray19[local188][local192] != null) {
						@Pc(208) Class3_Sub34[] local208 = this.aClass3_Sub34ArrayArrayArray1[local188][local192];
						@Pc(215) int[] local215 = this.anIntArrayArrayArray18[local188][local192];
						@Pc(222) int[] local222 = this.anIntArrayArrayArray17[local188][local192];
						@Pc(229) int[] local229 = this.anIntArrayArrayArray14[local188][local192];
						@Pc(236) int[] local236 = this.anIntArrayArrayArray19[local188][local192];
						@Pc(248) int[] local248 = this.anIntArrayArrayArray16 == null ? null : this.anIntArrayArrayArray16[local188][local192];
						@Pc(260) int[] local260 = this.anIntArrayArrayArray15 == null ? null : this.anIntArrayArrayArray15[local188][local192];
						if (local229 == null) {
							local229 = local236;
						}
						@Pc(271) float local271 = this.aFloatArrayArray15[local188][local192];
						@Pc(278) float local278 = this.aFloatArrayArray16[local188][local192];
						@Pc(285) float local285 = this.aFloatArrayArray17[local188][local192];
						@Pc(294) float local294 = this.aFloatArrayArray15[local188][local192 + 1];
						@Pc(303) float local303 = this.aFloatArrayArray16[local188][local192 + 1];
						@Pc(312) float local312 = this.aFloatArrayArray17[local188][local192 + 1];
						@Pc(323) float local323 = this.aFloatArrayArray15[local188 + 1][local192 + 1];
						@Pc(334) float local334 = this.aFloatArrayArray16[local188 + 1][local192 + 1];
						@Pc(345) float local345 = this.aFloatArrayArray17[local188 + 1][local192 + 1];
						@Pc(354) float local354 = this.aFloatArrayArray15[local188 + 1][local192];
						@Pc(363) float local363 = this.aFloatArrayArray16[local188 + 1][local192];
						@Pc(372) float local372 = this.aFloatArrayArray17[local188 + 1][local192];
						@Pc(380) int local380 = local17[local188][local192] & 0xFF;
						@Pc(390) int local390 = local17[local188][local192 + 1] & 0xFF;
						@Pc(402) int local402 = local17[local188 + 1][local192 + 1] & 0xFF;
						@Pc(412) int local412 = local17[local188 + 1][local192] & 0xFF;
						@Pc(414) int local414 = 0;
						@Pc(424) int local424;
						label337: for (@Pc(416) int local416 = 0; local416 < local236.length; local416++) {
							@Pc(422) Class3_Sub34 local422 = local208[local416];
							for (local424 = 0; local424 < local414; local424++) {
								if (local422 == local186[local424]) {
									continue label337;
								}
							}
							local186[local414++] = local422;
						}
						@Pc(461) short[] local461 = this.aShortArrayArray6[local188 + super.anInt9491 * local192] = new short[local236.length];
						for (local424 = 0; local424 < local236.length; local424++) {
							@Pc(474) int local474 = (local188 << super.anInt9494) + local215[local424];
							@Pc(483) int local483 = (local192 << super.anInt9494) + local222[local424];
							@Pc(488) int local488 = local474 >> this.anInt6923;
							@Pc(493) int local493 = local483 >> this.anInt6923;
							@Pc(497) int local497 = local236[local424];
							@Pc(501) int local501 = local229[local424];
							@Pc(509) int local509 = local248 == null ? 0 : local248[local424];
							@Pc(527) long local527 = (long) local493 | (long) (local488 << 16) | (long) local501 << 48 | (long) local497 << 32;
							@Pc(531) int local531 = local215[local424];
							@Pc(535) int local535 = local222[local424];
							@Pc(537) byte local537 = 74;
							@Pc(539) int local539 = 0;
							@Pc(541) float local541 = 1.0F;
							@Pc(558) float local558;
							@Pc(552) float local552;
							@Pc(550) float local550;
							@Pc(647) float local647;
							@Pc(556) int local556;
							if (local531 == 0 && local535 == 0) {
								local550 = local285;
								local552 = local278;
								local556 = local537 - local380;
								local558 = local271;
							} else if (local531 == 0 && local535 == super.anInt9493) {
								local556 = local537 - local390;
								local550 = local312;
								local552 = local303;
								local558 = local294;
							} else if (super.anInt9493 == local531 && super.anInt9493 == local535) {
								local558 = local323;
								local552 = local334;
								local550 = local345;
								local556 = local537 - local402;
							} else if (super.anInt9493 == local531 && local535 == 0) {
								local556 = local537 - local412;
								local550 = local372;
								local552 = local363;
								local558 = local354;
							} else {
								@Pc(622) float local622 = (float) local531 / (float) super.anInt9493;
								@Pc(629) float local629 = (float) local535 / (float) super.anInt9493;
								@Pc(638) float local638 = local271 + (local354 - local271) * local622;
								local647 = (local363 - local278) * local622 + local278;
								@Pc(656) float local656 = (local372 - local285) * local622 + local285;
								@Pc(664) float local664 = local622 * (local323 - local294) + local294;
								@Pc(673) float local673 = (local334 - local303) * local622 + local303;
								local558 = local638 + local629 * (local664 - local638);
								local552 = local647 + (local673 - local647) * local629;
								@Pc(698) float local698 = local622 * (local345 - local312) + local312;
								local550 = local629 * (local698 - local656) + local656;
								@Pc(719) int local719 = local380 + (local531 * (local412 - local380) >> super.anInt9494);
								@Pc(731) int local731 = (local531 * (local402 - local390) >> super.anInt9494) + local390;
								local556 = local537 - ((local731 - local719) * local535 >> super.anInt9494) - local719;
							}
							if (local497 != -1) {
								@Pc(768) int local768 = (local497 & 0x7F) * local556 >> 7;
								if (local768 < 2) {
									local768 = 2;
								} else if (local768 > 126) {
									local768 = 126;
								}
								if ((this.anInt6927 & 0x7) == 0) {
									local541 = this.aClass5_Sub1_28.bf[2] * local550 + this.aClass5_Sub1_28.bf[1] * local552 + this.aClass5_Sub1_28.bf[0] * local558;
									local541 = this.aClass5_Sub1_28.aFloat7 + (local541 > 0.0F ? this.aClass5_Sub1_28.aFloat27 : this.aClass5_Sub1_28.aFloat23) * local541;
								}
								local539 = Static393.anIntArray638[local768 | local497 & 0xFF80];
							}
							@Pc(841) Class3 local841 = null;
							if ((local474 & this.anInt6935 - 1) == 0 && (this.anInt6935 - 1 & local483) == 0) {
								local841 = local182.method6644(local527);
							}
							@Pc(1207) int local1207;
							@Pc(874) int local874;
							if (local841 == null) {
								if (local501 == local497) {
									local874 = local539;
								} else {
									@Pc(884) int local884 = (local501 & 0x7F) * local556 >> 7;
									if (local884 < 2) {
										local884 = 2;
									} else if (local884 > 126) {
										local884 = 126;
									}
									local874 = Static393.anIntArray638[local501 & 0xFF80 | local884];
									if ((this.anInt6927 & 0x7) == 0) {
										local647 = this.aClass5_Sub1_28.bf[2] * local550 + local558 * this.aClass5_Sub1_28.bf[0] + local552 * this.aClass5_Sub1_28.bf[1];
										local647 = local541 * (local541 > 0.0F ? this.aClass5_Sub1_28.aFloat27 : this.aClass5_Sub1_28.aFloat23) + this.aClass5_Sub1_28.aFloat7;
										@Pc(961) int local961 = local874 >> 16 & 0xFF;
										@Pc(967) int local967 = local874 >> 8 & 0xFF;
										local961 = (int) ((float) local961 * local647);
										@Pc(977) int local977 = local874 & 0xFF;
										if (local961 < 0) {
											local961 = 0;
										} else if (local961 > 255) {
											local961 = 255;
										}
										local967 = (int) ((float) local967 * local647);
										local977 = (int) ((float) local977 * local647);
										if (local967 < 0) {
											local967 = 0;
										} else if (local967 > 255) {
											local967 = 255;
										}
										if (local977 < 0) {
											local977 = 0;
										} else if (local977 > 255) {
											local977 = 255;
										}
										local874 = local977 | local967 << 8 | local961 << 16;
									}
								}
								if (this.aClass5_Sub1_28.aBoolean39) {
									local159.a((float) local474);
									local159.a((float) (this.sa(local474, local483) + local509));
									local159.a((float) local483);
									local159.a((byte) (local874 >> 16));
									local159.a((byte) (local874 >> 8));
									local159.a((byte) local874);
									local159.a(-1);
									local159.a((float) local474);
									local159.a((float) local483);
									if (this.anIntArrayArrayArray15 != null) {
										local159.a((float) (local260 == null ? 0 : local260[local424] - 1));
									}
									if ((this.anInt6927 & 0x7) != 0) {
										local159.a(local558);
										local159.a(local552);
										local159.a(local550);
									}
								} else {
									local159.b((float) local474);
									local159.b((float) (local509 + this.sa(local474, local483)));
									local159.b((float) local483);
									local159.a((byte) (local874 >> 16));
									local159.a((byte) (local874 >> 8));
									local159.a((byte) local874);
									local159.a(-1);
									local159.b((float) local474);
									local159.b((float) local483);
									if (this.anIntArrayArrayArray15 != null) {
										local159.b((float) (local260 == null ? 0 : local260[local424] - 1));
									}
									if ((this.anInt6927 & 0x7) != 0) {
										local159.b(local558);
										local159.b(local552);
										local159.b(local550);
									}
								}
								local1207 = this.anInt6939++;
								local461[local424] = (short) local1207;
								if (local497 != -1) {
									local163[local1207] = local208[local424];
								}
								local182.method6640(new Class3_Sub18(local461[local424]), local527);
							} else {
								local461[local424] = ((Class3_Sub18) local841).aShort44;
								local1207 = local461[local424] & 0xFFFF;
								if (local497 != -1 && local163[local1207].aLong285 > local208[local424].aLong285) {
									local163[local1207] = local208[local424];
								}
							}
							for (local874 = 0; local874 < local414; local874++) {
								local186[local874].method5149(local539, local556, local1207, local541);
							}
							this.anInt6922++;
						}
					}
				}
			}
			for (local192 = 0; local192 < this.anInt6939; local192++) {
				@Pc(1319) Class3_Sub34 local1319 = local163[local192];
				if (local1319 != null) {
					local1319.method5143(local192);
				}
			}
			@Pc(1356) int local1356;
			for (@Pc(1336) int local1336 = 0; super.anInt9491 > local1336; local1336++) {
				for (@Pc(1340) int local1340 = 0; local1340 < super.anInt9492; local1340++) {
					@Pc(1352) short[] local1352 = this.aShortArrayArray6[local1336 + super.anInt9491 * local1340];
					if (local1352 != null) {
						local1356 = 0;
						@Pc(1358) int local1358 = 0;
						while (local1358 < local1352.length) {
							@Pc(1367) int local1367 = local1352[local1358++] & 0xFFFF;
							@Pc(1374) int local1374 = local1352[local1358++] & 0xFFFF;
							@Pc(1381) int local1381 = local1352[local1358++] & 0xFFFF;
							@Pc(1385) Class3_Sub34 local1385 = local163[local1367];
							@Pc(1389) Class3_Sub34 local1389 = local163[local1374];
							@Pc(1393) Class3_Sub34 local1393 = local163[local1381];
							@Pc(1395) Class3_Sub34 local1395 = null;
							if (local1385 != null) {
								local1395 = local1385;
								local1385.method5148(local1356, local1336, local1340);
							}
							if (local1389 != null) {
								local1389.method5148(local1356, local1336, local1340);
								if (local1395 == null || local1395.aLong285 > local1389.aLong285) {
									local1395 = local1389;
								}
							}
							if (local1393 != null) {
								local1393.method5148(local1356, local1336, local1340);
								if (local1395 == null || local1393.aLong285 < local1395.aLong285) {
									local1395 = local1393;
								}
							}
							if (local1395 != null) {
								if (local1385 != null) {
									local1395.method5143(local1367);
								}
								if (local1389 != null) {
									local1395.method5143(local1374);
								}
								if (local1393 != null) {
									local1395.method5143(local1381);
								}
								local1395.method5148(local1356, local1336, local1340);
							}
							local1356++;
						}
					}
				}
			}
			local159.a();
			this.anInterface1_6 = this.aClass5_Sub1_28.method426(local159.b(), local154, local131);
			this.aClass112_13 = new Class112(this.anInterface1_6, 5126, 3, 0);
			this.aClass112_14 = new Class112(this.anInterface1_6, 5121, 4, 12);
			@Pc(1530) byte local1530;
			if (this.anIntArrayArrayArray15 == null) {
				local1530 = 24;
				this.aClass112_11 = new Class112(this.anInterface1_6, 5126, 2, 16);
			} else {
				this.aClass112_11 = new Class112(this.anInterface1_6, 5126, 3, 16);
				local1530 = 28;
			}
			if ((this.anInt6927 & 0x7) != 0) {
				this.aClass112_12 = new Class112(this.anInterface1_6, 5126, 3, local1530);
			}
			@Pc(1564) long[] local1564 = new long[this.aClass3_Sub34Array1.length];
			for (local1356 = 0; local1356 < this.aClass3_Sub34Array1.length; local1356++) {
				@Pc(1573) Class3_Sub34 local1573 = this.aClass3_Sub34Array1[local1356];
				local1564[local1356] = local1573.aLong285;
				local1573.method5141(this.anInt6939);
			}
			Static17.method3541(local1564, this.aClass3_Sub34Array1);
			if (this.aClass249_1 != null) {
				this.aClass249_1.method6132();
			}
		} else {
			this.aClass249_1 = null;
		}
		this.anIntArrayArrayArray16 = null;
		this.aFloatArrayArray15 = this.aFloatArrayArray16 = this.aFloatArrayArray17 = null;
		this.aClass3_Sub34ArrayArrayArray1 = null;
		this.anIntArrayArrayArray19 = null;
		this.aClass267_32 = null;
		this.anIntArrayArrayArray15 = null;
		this.anIntArrayArrayArray18 = this.anIntArrayArrayArray17 = null;
		this.anIntArrayArrayArray14 = null;
		this.aByteArrayArray21 = null;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method7833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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
		this.BA(arg0, arg1, local13, local47, local18, local56, local23, local28, local33, local38, arg13, arg14, arg15, false);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IZIIII[[Z)V")
	private void method5830(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) boolean[][] arg4) {
		if (this.aClass3_Sub34Array1 == null) {
			return;
		}
		@Pc(22) int local22 = arg2 + arg2 + 1;
		@Pc(26) int local26 = local22 * local22;
		if (local26 > this.aClass5_Sub1_28.anIntArray81.length) {
			this.aClass5_Sub1_28.anIntArray81 = new int[local26];
		}
		if (this.anInt6922 * 2 > this.aClass5_Sub1_28.aClass3_Sub27_Sub2_1.aByteArray114.length) {
			this.aClass5_Sub1_28.aClass3_Sub27_Sub2_1 = new Class3_Sub27_Sub2(this.anInt6922 * 2);
		}
		@Pc(70) int local70 = arg3 - arg2;
		@Pc(72) int local72 = local70;
		if (local70 < 0) {
			local70 = 0;
		}
		@Pc(84) int local84 = arg1 - arg2;
		@Pc(86) int local86 = local84;
		if (local84 < 0) {
			local84 = 0;
		}
		@Pc(94) int local94 = arg2 + arg3;
		if (super.anInt9491 - 1 < local94) {
			local94 = super.anInt9491 - 1;
		}
		@Pc(110) int local110 = arg1 + arg2;
		if (super.anInt9492 - 1 < local110) {
			local110 = super.anInt9492 - 1;
		}
		@Pc(123) int local123 = 0;
		@Pc(127) int[] local127 = this.aClass5_Sub1_28.anIntArray81;
		@Pc(140) int local140;
		for (@Pc(129) int local129 = local70; local129 <= local94; local129++) {
			@Pc(138) boolean[] local138 = arg4[local129 - local72];
			for (local140 = local84; local140 <= local110; local140++) {
				if (local138[local140 - local86]) {
					local127[local123++] = super.anInt9491 * local140 + local129;
				}
			}
		}
		this.aClass5_Sub1_28.method381();
		this.aClass5_Sub1_28.method454((this.anInt6927 & 0x7) != 0);
		for (@Pc(201) int local201 = 0; local201 < this.aClass3_Sub34Array1.length; local201++) {
			this.aClass3_Sub34Array1[local201].method5150(local127, local123);
		}
		if (!this.aClass71_55.method2085()) {
			local140 = this.aClass5_Sub1_28.anInt410;
			@Pc(234) int local234 = this.aClass5_Sub1_28.anInt398;
			this.aClass5_Sub1_28.X(0, local234, this.aClass5_Sub1_28.anInt391);
			this.aClass5_Sub1_28.method454(false);
			this.aClass5_Sub1_28.method413(false);
			this.aClass5_Sub1_28.method455(128);
			this.aClass5_Sub1_28.method414(-2);
			this.aClass5_Sub1_28.method423(this.aClass5_Sub1_28.aClass11_Sub1_1);
			this.aClass5_Sub1_28.method448(7681, 8448);
			this.aClass5_Sub1_28.method419(34166, 0, 770);
			this.aClass5_Sub1_28.method461(34167, 0);
			for (@Pc(294) Class3 local294 = this.aClass71_55.method2089(); local294 != null; local294 = this.aClass71_55.method2086()) {
				@Pc(299) Class3_Sub43 local299 = (Class3_Sub43) local294;
				local299.method6540(arg2, arg1, arg4, arg3);
			}
			this.aClass5_Sub1_28.method419(5890, 0, 768);
			this.aClass5_Sub1_28.method461(5890, 0);
			this.aClass5_Sub1_28.method423(null);
			this.aClass5_Sub1_28.X(local140, local234, this.aClass5_Sub1_28.anInt391);
		}
		if (this.aClass249_1 != null) {
			this.aClass5_Sub1_28.method383(this.aClass112_13, null, null, this.aClass112_11);
			this.aClass249_1.method6131(arg1, arg2, arg3, arg4, arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!oj;[I)V")
	@Override
	public void method7832(@OriginalArg(0) Class3_Sub30 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass71_55.method2076(new Class3_Sub43(this.aClass5_Sub1_28, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!pf", name = "FA", descriptor = "(Lclient!w;IIIIZ)V")
	@Override
	public void FA(@OriginalArg(0) Class3_Sub10_Sub18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass249_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass5_Sub1_28.anInt404 >> 8) >> this.aClass5_Sub1_28.anInt375;
			@Pc(39) int local39 = arg3 - (this.aClass5_Sub1_28.anInt417 * arg2 >> 8) >> this.aClass5_Sub1_28.anInt375;
			this.aClass249_1.method6136(arg0, local24, local39);
		}
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(IILclient!w;)Lclient!w;")
	@Override
	public Class3_Sub10_Sub18 c(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub10_Sub18 arg2) {
		if ((this.aByteArrayArray20[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(21) int local21 = super.anInt9493 >> this.aClass5_Sub1_28.anInt375;
		@Pc(24) Class3_Sub10_Sub18_Sub2 local24 = (Class3_Sub10_Sub18_Sub2) arg2;
		@Pc(34) Class3_Sub10_Sub18_Sub2 local34;
		if (local24 != null && local24.method7648(local21, local21)) {
			local34 = local24;
			local24.method7645();
		} else {
			local34 = new Class3_Sub10_Sub18_Sub2(this.aClass5_Sub1_28, local21, local21);
		}
		local34.method7649(local21, 0, local21, 0);
		this.method5827(arg1, local34, arg0);
		return local34;
	}
}
