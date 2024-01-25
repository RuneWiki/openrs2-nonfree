import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ot")
public final class Class46_Sub3 extends Class46 {

	@OriginalMember(owner = "client!ot", name = "y", descriptor = "I")
	private int anInt6990;

	@OriginalMember(owner = "client!ot", name = "C", descriptor = "I")
	private int anInt6994;

	@OriginalMember(owner = "client!ot", name = "G", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!ot", name = "X", descriptor = "I")
	private int anInt7003;

	@OriginalMember(owner = "client!ot", name = "Y", descriptor = "Lclient!pn;")
	private Interface14 anInterface14_6;

	@OriginalMember(owner = "client!ot", name = "db", descriptor = "Lclient!kca;")
	private Class166 aClass166_10;

	@OriginalMember(owner = "client!ot", name = "eb", descriptor = "Lclient!kca;")
	public Class166 aClass166_11;

	@OriginalMember(owner = "client!ot", name = "hb", descriptor = "Lclient!kca;")
	public Class166 aClass166_12;

	@OriginalMember(owner = "client!ot", name = "ib", descriptor = "I")
	private int anInt7006;

	@OriginalMember(owner = "client!ot", name = "jb", descriptor = "Lclient!kca;")
	public Class166 aClass166_13;

	@OriginalMember(owner = "client!ot", name = "kb", descriptor = "[Lclient!oq;")
	private Class6_Sub35[] aClass6_Sub35Array1;

	@OriginalMember(owner = "client!ot", name = "T", descriptor = "Lclient!su;")
	private final Class298 aClass298_146 = new Class298();

	@OriginalMember(owner = "client!ot", name = "H", descriptor = "Lclient!en;")
	public final Class90_Sub1 aClass90_Sub1_32;

	@OriginalMember(owner = "client!ot", name = "W", descriptor = "[[I")
	private final int[][] anIntArrayArray61;

	@OriginalMember(owner = "client!ot", name = "m", descriptor = "I")
	private final int anInt6981;

	@OriginalMember(owner = "client!ot", name = "E", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!ot", name = "x", descriptor = "[[B")
	private final byte[][] aByteArrayArray20;

	@OriginalMember(owner = "client!ot", name = "ab", descriptor = "[[F")
	private float[][] aFloatArrayArray13;

	@OriginalMember(owner = "client!ot", name = "t", descriptor = "[[[Lclient!oq;")
	private Class6_Sub35[][][] aClass6_Sub35ArrayArrayArray1;

	@OriginalMember(owner = "client!ot", name = "D", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!ot", name = "O", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray17;

	@OriginalMember(owner = "client!ot", name = "R", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray18;

	@OriginalMember(owner = "client!ot", name = "Z", descriptor = "[[F")
	private float[][] aFloatArrayArray12;

	@OriginalMember(owner = "client!ot", name = "fb", descriptor = "[[B")
	private byte[][] aByteArrayArray21;

	@OriginalMember(owner = "client!ot", name = "Q", descriptor = "[[S")
	public final short[][] aShortArrayArray22;

	@OriginalMember(owner = "client!ot", name = "L", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!ot", name = "s", descriptor = "I")
	private final int anInt6987;

	@OriginalMember(owner = "client!ot", name = "cb", descriptor = "[[F")
	private float[][] aFloatArrayArray14;

	@OriginalMember(owner = "client!ot", name = "K", descriptor = "I")
	public final int anInt6997;

	@OriginalMember(owner = "client!ot", name = "lb", descriptor = "Lclient!oj;")
	private Class234 lb;

	@OriginalMember(owner = "client!ot", name = "w", descriptor = "Lclient!mg;")
	private Class200 aClass200_2;

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Lclient!en;IIII[[I[[II)V")
	public Class46_Sub3(@OriginalArg(0) Class90_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.aClass90_Sub1_32 = arg0;
		this.anIntArrayArray61 = arg5;
		this.anInt6981 = super.anInt10000 - 2;
		this.anIntArrayArrayArray14 = new int[arg3][arg4][];
		this.aByteArrayArray20 = new byte[arg3][arg4];
		this.aFloatArrayArray13 = new float[super.anInt9997 + 1][super.anInt9995 + 1];
		this.aClass6_Sub35ArrayArrayArray1 = new Class6_Sub35[arg3][arg4][];
		this.anIntArrayArrayArray13 = new int[arg3][arg4][];
		this.anIntArrayArrayArray17 = new int[arg3][arg4][];
		this.anIntArrayArrayArray18 = new int[arg3][arg4][];
		this.aFloatArrayArray12 = new float[super.anInt9997 + 1][super.anInt9995 + 1];
		this.aByteArrayArray21 = new byte[arg3 + 1][arg4 + 1];
		this.aShortArrayArray22 = new short[arg3 * arg4][];
		this.anIntArrayArrayArray16 = new int[arg3][arg4][];
		this.anInt6987 = 0x1 << this.anInt6981;
		this.aFloatArrayArray14 = new float[super.anInt9997 + 1][super.anInt9995 + 1];
		this.anInt6997 = arg2;
		for (@Pc(117) int local117 = 1; super.anInt9995 > local117; local117++) {
			for (@Pc(121) int local121 = 1; local121 < super.anInt9997; local121++) {
				@Pc(140) int local140 = arg6[local121 + 1][local117] - arg6[local121 - 1][local117];
				@Pc(156) int local156 = arg6[local121][local117 + 1] - arg6[local121][local117 - 1];
				@Pc(175) float local175 = (float) (1.0D / Math.sqrt((double) (local156 * local156 + local140 * local140 + arg7 * 4 * arg7)));
				this.aFloatArrayArray14[local121][local117] = local175 * (float) local140;
				this.aFloatArrayArray12[local121][local117] = (float) (-arg7 * 2) * local175;
				this.aFloatArrayArray13[local121][local117] = (float) local156 * local175;
			}
		}
		this.lb = new Class234(128);
		if ((this.anInt6997 & 0x10) != 0) {
			this.aClass200_2 = new Class200(this.aClass90_Sub1_32, this);
		}
	}

	@OriginalMember(owner = "client!ot", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg3 != null && this.anIntArrayArrayArray14 == null) {
			this.anIntArrayArrayArray14 = new int[super.anInt9997][super.anInt9995][];
		}
		if (arg5 != null && this.anIntArrayArrayArray15 == null) {
			this.anIntArrayArrayArray15 = new int[super.anInt9997][super.anInt9995][];
		}
		this.anIntArrayArrayArray17[arg0][arg1] = arg2;
		this.anIntArrayArrayArray13[arg0][arg1] = arg4;
		this.anIntArrayArrayArray16[arg0][arg1] = arg6;
		this.anIntArrayArrayArray18[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray15 != null) {
			this.anIntArrayArrayArray15[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray14 != null) {
			this.anIntArrayArrayArray14[arg0][arg1] = arg3;
		}
		@Pc(88) Class6_Sub35[] local88 = this.aClass6_Sub35ArrayArrayArray1[arg0][arg1] = new Class6_Sub35[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) (arg9[local90] << 14) | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28 | (long) arg8[local90];
			@Pc(125) Class6 local125;
			for (local125 = this.lb.method5464(local119); local125 != null; local125 = this.lb.method5467()) {
				@Pc(130) Class6_Sub35 local130 = (Class6_Sub35) local125;
				if (local130.anInt6951 == arg8[local90] && (float) arg9[local90] == local130.aFloat160 && arg10 == local130.anInt6949 && arg11 == local130.anInt6942 && arg12 == local130.anInt6943) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class6_Sub35(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.lb.method5466(local119, local88[local90]);
			} else {
				local88[local90] = (Class6_Sub35) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray20[arg0][arg1] = (byte) (this.aByteArrayArray20[arg0][arg1] | 0x1);
		}
		if (this.anInt7006 < arg6.length) {
			this.anInt7006 = arg6.length;
		}
		this.anInt7003 += arg6.length;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method7967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method5594(arg3, arg4, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!ot", name = "aa", descriptor = "(Lclient!w;IIIIZ)V")
	@Override
	public void aa(@OriginalArg(0) Class6_Sub5_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass200_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass90_Sub1_32.anInt2478 * arg2 >> 8) >> this.aClass90_Sub1_32.anInt2433;
			@Pc(38) int local38 = arg3 - (arg2 * this.aClass90_Sub1_32.anInt2444 >> 8) >> this.aClass90_Sub1_32.anInt2433;
			this.aClass200_2.method4964(arg0, local24, local38);
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7964(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt7003 <= 0) {
			return;
		}
		this.aClass90_Sub1_32.method2071();
		this.aClass90_Sub1_32.method2100(false);
		this.aClass90_Sub1_32.method2099(false);
		this.aClass90_Sub1_32.method2101(false);
		this.aClass90_Sub1_32.method2127(false);
		this.aClass90_Sub1_32.method2090(0);
		this.aClass90_Sub1_32.method2111(-2);
		this.aClass90_Sub1_32.method2126(null);
		Static11.aFloatArray3[6] = 0.0F;
		Static11.aFloatArray3[2] = 0.0F;
		Static11.aFloatArray3[8] = 0.0F;
		Static11.aFloatArray3[1] = 0.0F;
		Static11.aFloatArray3[0] = (float) 1024 / ((float) super.anInt9998 * 128.0F * (float) this.aClass90_Sub1_32.anInt2336);
		Static11.aFloatArray3[12] = -1.0F - ((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass90_Sub1_32.anInt2336;
		Static11.aFloatArray3[14] = 0.0F;
		Static11.aFloatArray3[7] = 0.0F;
		Static11.aFloatArray3[15] = 1.0F;
		Static11.aFloatArray3[13] = 1.0F - ((float) (arg3 * 1024) / 128.0F + (float) 0) / (float) this.aClass90_Sub1_32.anInt2266;
		Static11.aFloatArray3[5] = (float) 1024 / ((float) this.aClass90_Sub1_32.anInt2266 * (float) super.anInt9998 * 128.0F);
		Static11.aFloatArray3[4] = 0.0F;
		Static11.aFloatArray3[10] = 0.0F;
		Static11.aFloatArray3[11] = 0.0F;
		Static11.aFloatArray3[9] = 0.0F;
		Static11.aFloatArray3[3] = 0.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static11.aFloatArray3, 0);
		Static11.aFloatArray3[12] = 0.0F;
		Static11.aFloatArray3[0] = 1.0F;
		Static11.aFloatArray3[5] = 0.0F;
		Static11.aFloatArray3[7] = 0.0F;
		Static11.aFloatArray3[8] = 0.0F;
		Static11.aFloatArray3[1] = 0.0F;
		Static11.aFloatArray3[4] = 0.0F;
		Static11.aFloatArray3[3] = 0.0F;
		Static11.aFloatArray3[10] = 0.0F;
		Static11.aFloatArray3[14] = 0.0F;
		Static11.aFloatArray3[9] = 1.0F;
		Static11.aFloatArray3[15] = 1.0F;
		Static11.aFloatArray3[13] = 0.0F;
		Static11.aFloatArray3[11] = 0.0F;
		Static11.aFloatArray3[6] = 1.0F;
		Static11.aFloatArray3[2] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static11.aFloatArray3, 0);
		if ((this.anInt6997 & 0x7) == 0) {
			this.aClass90_Sub1_32.method2099(false);
		} else {
			this.aClass90_Sub1_32.method2099(true);
			this.aClass90_Sub1_32.method2067();
		}
		this.aClass90_Sub1_32.method2066(this.aClass166_12, this.aClass166_13, this.aClass166_10, this.aClass166_11);
		if (this.aClass90_Sub1_32.aClass6_Sub12_Sub1_1.aByteArray97.length >= this.anInt6994 * 2) {
			this.aClass90_Sub1_32.aClass6_Sub12_Sub1_1.anInt7556 = 0;
		} else {
			this.aClass90_Sub1_32.aClass6_Sub12_Sub1_1 = new Class6_Sub12_Sub1(this.anInt6994 * 2);
		}
		@Pc(315) int local315 = 0;
		@Pc(319) Class6_Sub12_Sub1 local319 = this.aClass90_Sub1_32.aClass6_Sub12_Sub1_1;
		@Pc(325) int local325;
		@Pc(334) int local334;
		@Pc(336) int local336;
		@Pc(354) short[] local354;
		@Pc(358) int local358;
		if (this.aClass90_Sub1_32.aBoolean176) {
			for (local325 = arg1; local325 < arg3; local325++) {
				local334 = arg0 + local325 * super.anInt9997;
				for (local336 = arg0; local336 < arg2; local336++) {
					if (arg4[local336 - arg0][local325 - arg1]) {
						local354 = this.aShortArrayArray22[local334];
						if (local354 != null) {
							for (local358 = 0; local358 < local354.length; local358++) {
								local319.method6032(local354[local358] & 0xFFFF);
								local315++;
							}
						}
					}
					local334++;
				}
			}
		} else {
			for (local325 = arg1; local325 < arg3; local325++) {
				local334 = arg0 + local325 * super.anInt9997;
				for (local336 = arg0; local336 < arg2; local336++) {
					if (arg4[local336 - arg0][local325 - arg1]) {
						local354 = this.aShortArrayArray22[local334];
						if (local354 != null) {
							for (local358 = 0; local358 < local354.length; local358++) {
								local315++;
								local319.method6021(local354[local358] & 0xFFFF);
							}
						}
					}
					local334++;
				}
			}
		}
		if (local315 > 0) {
			@Pc(467) Class135_Sub1 local467 = new Class135_Sub1(this.aClass90_Sub1_32, 5123, local319.aByteArray97, local319.anInt7556);
			this.aClass90_Sub1_32.method2144(local315, local467, 0);
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lclient!mv;III)V")
	private void method5590(@OriginalArg(0) Class6_Sub5_Sub10_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray17[arg1][arg2];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray13[arg1][arg2];
		@Pc(22) int local22 = local12.length;
		if (this.aClass90_Sub1_32.anIntArray190.length < local22) {
			this.aClass90_Sub1_32.anIntArray190 = new int[local22];
			this.aClass90_Sub1_32.anIntArray188 = new int[local22];
		}
		@Pc(46) int[] local46 = this.aClass90_Sub1_32.anIntArray190;
		@Pc(54) int[] local54 = this.aClass90_Sub1_32.anIntArray188;
		for (@Pc(56) int local56 = 0; local56 < local22; local56++) {
			local46[local56] = local12[local56] >> this.aClass90_Sub1_32.anInt2433;
			local54[local56] = local19[local56] >> this.aClass90_Sub1_32.anInt2433;
		}
		@Pc(84) int local84 = 0;
		while (local22 > local84) {
			@Pc(90) int local90 = local46[local84];
			@Pc(95) int local95 = local54[local84++];
			@Pc(99) int local99 = local46[local84];
			@Pc(104) int local104 = local54[local84++];
			@Pc(108) int local108 = local46[local84];
			@Pc(113) int local113 = local54[local84++];
			if ((local104 - local113) * (local90 - local99) - (local104 - local95) * (local108 - local99) > 0) {
				arg0.method5063(local108, local113, local99, local104, local95, local90);
			}
		}
	}

	@OriginalMember(owner = "client!ot", name = "sa", descriptor = "(II)I")
	@Override
	public int sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 >> super.anInt10000;
		@Pc(13) int local13 = arg1 >> super.anInt10000;
		if (local8 < 0 || local13 < 0 || local8 > super.anInt9997 - 1 || local13 > super.anInt9995 - 1) {
			return 0;
		}
		@Pc(45) int local45 = arg0 & super.anInt9998 - 1;
		@Pc(52) int local52 = arg1 & super.anInt9998 - 1;
		@Pc(79) int local79 = (super.anInt9998 - local45) * this.anIntArrayArray61[local8][local13] + local45 * this.anIntArrayArray61[local8 + 1][local13] >> super.anInt10000;
		@Pc(110) int local110 = this.anIntArrayArray61[local8 + 1][local13 + 1] * local45 + (super.anInt9998 - local45) * this.anIntArrayArray61[local8][local13 - -1] >> super.anInt10000;
		return local110 * local52 + (super.anInt9998 - local52) * local79 >> super.anInt10000;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(II)V")
	@Override
	public void method7970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "(IILclient!w;)Lclient!w;")
	@Override
	public Class6_Sub5_Sub10 c(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub5_Sub10 arg2) {
		if ((this.aByteArrayArray20[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(21) int local21 = super.anInt9998 >> this.aClass90_Sub1_32.anInt2433;
		@Pc(24) Class6_Sub5_Sub10_Sub2 local24 = (Class6_Sub5_Sub10_Sub2) arg2;
		@Pc(34) Class6_Sub5_Sub10_Sub2 local34;
		if (local24 != null && local24.method5064(local21, local21)) {
			local34 = local24;
			local24.method5061();
		} else {
			local34 = new Class6_Sub5_Sub10_Sub2(this.aClass90_Sub1_32, local21, local21);
		}
		local34.method5065(local21, local21, 0, 0);
		this.method5590(local34, arg0, arg1);
		return local34;
	}

	@OriginalMember(owner = "client!ot", name = "EA", descriptor = "(III)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray21[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray21[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(I[[ZZBIII)V")
	private void method5594(@OriginalArg(1) boolean[][] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (this.aClass6_Sub35Array1 == null) {
			return;
		}
		@Pc(15) int local15 = arg3 + arg3 + 1;
		@Pc(19) int local19 = local15 * local15;
		if (this.aClass90_Sub1_32.anIntArray189.length < local19) {
			this.aClass90_Sub1_32.anIntArray189 = new int[local19];
		}
		if (this.aClass90_Sub1_32.aClass6_Sub12_Sub1_1.aByteArray97.length < this.anInt6994 * 2) {
			this.aClass90_Sub1_32.aClass6_Sub12_Sub1_1 = new Class6_Sub12_Sub1(this.anInt6994 * 2);
		}
		@Pc(63) int local63 = arg2 - arg3;
		@Pc(65) int local65 = local63;
		if (local63 < 0) {
			local63 = 0;
		}
		@Pc(77) int local77 = arg4 - arg3;
		@Pc(79) int local79 = local77;
		if (local77 < 0) {
			local77 = 0;
		}
		@Pc(90) int local90 = arg2 + arg3;
		if (super.anInt9997 - 1 < local90) {
			local90 = super.anInt9997 - 1;
		}
		@Pc(109) int local109 = arg3 + arg4;
		if (super.anInt9995 - 1 < local109) {
			local109 = super.anInt9995 - 1;
		}
		@Pc(122) int local122 = 0;
		@Pc(126) int[] local126 = this.aClass90_Sub1_32.anIntArray189;
		@Pc(139) int local139;
		for (@Pc(128) int local128 = local63; local128 <= local90; local128++) {
			@Pc(137) boolean[] local137 = arg0[local128 - local65];
			for (local139 = local77; local139 <= local109; local139++) {
				if (local137[local139 - local79]) {
					local126[local122++] = super.anInt9997 * local139 + local128;
				}
			}
		}
		this.aClass90_Sub1_32.method2122();
		this.aClass90_Sub1_32.method2099((this.anInt6997 & 0x7) != 0);
		for (@Pc(206) int local206 = 0; local206 < this.aClass6_Sub35Array1.length; local206++) {
			this.aClass6_Sub35Array1[local206].method5564(local122, local126);
		}
		if (!this.aClass298_146.method6813()) {
			local139 = this.aClass90_Sub1_32.anInt2474;
			@Pc(239) int local239 = this.aClass90_Sub1_32.anInt2455;
			this.aClass90_Sub1_32.X(0, local239, this.aClass90_Sub1_32.anInt2457);
			this.aClass90_Sub1_32.method2099(false);
			this.aClass90_Sub1_32.method2127(false);
			this.aClass90_Sub1_32.method2090(128);
			this.aClass90_Sub1_32.method2111(-2);
			this.aClass90_Sub1_32.method2126(this.aClass90_Sub1_32.aClass16_Sub1_1);
			this.aClass90_Sub1_32.method2120(7681, 8448);
			this.aClass90_Sub1_32.method2119(0, 770, 34166);
			this.aClass90_Sub1_32.method2133(0, 34167);
			for (@Pc(301) Class6 local301 = this.aClass298_146.method6809(); local301 != null; local301 = this.aClass298_146.method6821()) {
				@Pc(306) Class6_Sub27 local306 = (Class6_Sub27) local301;
				local306.method4532(arg0, arg2, arg3, arg4);
			}
			this.aClass90_Sub1_32.method2119(0, 768, 5890);
			this.aClass90_Sub1_32.method2133(0, 5890);
			this.aClass90_Sub1_32.method2126(null);
			this.aClass90_Sub1_32.X(local139, local239, this.aClass90_Sub1_32.anInt2457);
		}
		if (this.aClass200_2 != null) {
			this.aClass90_Sub1_32.method2066(this.aClass166_12, this.aClass166_13, null, null);
			this.aClass200_2.method4963(arg2, arg0, arg4, arg3, arg1);
		}
	}

	@OriginalMember(owner = "client!ot", name = "FA", descriptor = "(Lclient!w;IIIIZ)V")
	@Override
	public void FA(@OriginalArg(0) Class6_Sub5_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass200_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass90_Sub1_32.anInt2478 >> 8) >> this.aClass90_Sub1_32.anInt2433;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass90_Sub1_32.anInt2444 >> 8) >> this.aClass90_Sub1_32.anInt2433;
			this.aClass200_2.method4960(arg0, local24, local39);
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method7971(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!ot", name = "JA", descriptor = "(II)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray61[arg0][arg1];
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lclient!ld;[I)V")
	@Override
	public void method7965(@OriginalArg(0) Class6_Sub25 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass298_146.method6812(new Class6_Sub27(this.aClass90_Sub1_32, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lclient!w;IIIIZ)Z")
	@Override
	public boolean method7968(@OriginalArg(0) Class6_Sub5_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass200_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (arg2 * this.aClass90_Sub1_32.anInt2478 >> 8) >> this.aClass90_Sub1_32.anInt2433;
			@Pc(40) int local40 = arg3 - (this.aClass90_Sub1_32.anInt2444 * arg2 >> 8) >> this.aClass90_Sub1_32.anInt2433;
			return this.aClass200_2.method4955(local25, arg0, local40);
		}
	}

	@OriginalMember(owner = "client!ot", name = "ba", descriptor = "()V")
	@Override
	public void ba() {
		if (this.anInt7003 > 0) {
			@Pc(17) byte[][] local17 = new byte[super.anInt9997 + 1][super.anInt9995 + 1];
			@Pc(23) int local23;
			for (@Pc(19) int local19 = 1; super.anInt9997 > local19; local19++) {
				for (local23 = 1; local23 < super.anInt9995; local23++) {
					local17[local19][local23] = (byte) ((this.aByteArrayArray21[local19][local23] >> 1) + (this.aByteArrayArray21[local19 + 1][local23] >> 3) + (this.aByteArrayArray21[local19 - 1][local23] >> 2) + (this.aByteArrayArray21[local19][local23 + -1] >> 2) + (this.aByteArrayArray21[local19][local23 + 1] >> 3));
				}
			}
			this.aClass6_Sub35Array1 = new Class6_Sub35[this.lb.method5460()];
			this.lb.method5462(this.aClass6_Sub35Array1);
			for (local23 = 0; local23 < this.aClass6_Sub35Array1.length; local23++) {
				this.aClass6_Sub35Array1[local23].method5569(this.anInt7003);
			}
			@Pc(127) int local127 = 24;
			if (this.anIntArrayArrayArray15 != null) {
				local127 += 4;
			}
			if ((this.anInt6997 & 0x7) != 0) {
				local127 += 12;
			}
			@Pc(150) NativeHeapBuffer local150 = this.aClass90_Sub1_32.aNativeHeap2.a(local127 * this.anInt7003, false);
			@Pc(155) Stream local155 = new Stream(local150);
			@Pc(159) Class6_Sub35[] local159 = new Class6_Sub35[this.anInt7003];
			@Pc(166) int local166 = Static118.method7958(this.anInt7003 / 4);
			if (local166 < 1) {
				local166 = 1;
			}
			@Pc(176) Class234 local176 = new Class234(local166);
			@Pc(180) Class6_Sub35[] local180 = new Class6_Sub35[this.anInt7006];
			@Pc(186) int local186;
			for (@Pc(182) int local182 = 0; super.anInt9997 > local182; local182++) {
				for (local186 = 0; super.anInt9995 > local186; local186++) {
					if (this.anIntArrayArrayArray16[local182][local186] != null) {
						@Pc(202) Class6_Sub35[] local202 = this.aClass6_Sub35ArrayArrayArray1[local182][local186];
						@Pc(209) int[] local209 = this.anIntArrayArrayArray17[local182][local186];
						@Pc(216) int[] local216 = this.anIntArrayArrayArray13[local182][local186];
						@Pc(223) int[] local223 = this.anIntArrayArrayArray18[local182][local186];
						@Pc(230) int[] local230 = this.anIntArrayArrayArray16[local182][local186];
						@Pc(242) int[] local242 = this.anIntArrayArrayArray14 == null ? null : this.anIntArrayArrayArray14[local182][local186];
						@Pc(254) int[] local254 = this.anIntArrayArrayArray15 == null ? null : this.anIntArrayArrayArray15[local182][local186];
						if (local223 == null) {
							local223 = local230;
						}
						@Pc(265) float local265 = this.aFloatArrayArray14[local182][local186];
						@Pc(272) float local272 = this.aFloatArrayArray12[local182][local186];
						@Pc(279) float local279 = this.aFloatArrayArray13[local182][local186];
						@Pc(288) float local288 = this.aFloatArrayArray14[local182][local186 + 1];
						@Pc(297) float local297 = this.aFloatArrayArray12[local182][local186 + 1];
						@Pc(306) float local306 = this.aFloatArrayArray13[local182][local186 + 1];
						@Pc(317) float local317 = this.aFloatArrayArray14[local182 + 1][local186 + 1];
						@Pc(328) float local328 = this.aFloatArrayArray12[local182 + 1][local186 + 1];
						@Pc(339) float local339 = this.aFloatArrayArray13[local182 + 1][local186 + 1];
						@Pc(348) float local348 = this.aFloatArrayArray14[local182 + 1][local186];
						@Pc(357) float local357 = this.aFloatArrayArray12[local182 + 1][local186];
						@Pc(366) float local366 = this.aFloatArrayArray13[local182 + 1][local186];
						@Pc(374) int local374 = local17[local182][local186] & 0xFF;
						@Pc(384) int local384 = local17[local182][local186 + 1] & 0xFF;
						@Pc(396) int local396 = local17[local182 + 1][local186 + 1] & 0xFF;
						@Pc(406) int local406 = local17[local182 + 1][local186] & 0xFF;
						@Pc(408) int local408 = 0;
						@Pc(418) int local418;
						label337: for (@Pc(410) int local410 = 0; local410 < local230.length; local410++) {
							@Pc(416) Class6_Sub35 local416 = local202[local410];
							for (local418 = 0; local418 < local408; local418++) {
								if (local416 == local180[local418]) {
									continue label337;
								}
							}
							local180[local408++] = local416;
						}
						@Pc(460) short[] local460 = this.aShortArrayArray22[super.anInt9997 * local186 + local182] = new short[local230.length];
						for (local418 = 0; local418 < local230.length; local418++) {
							@Pc(474) int local474 = (local182 << super.anInt10000) + local209[local418];
							@Pc(484) int local484 = (local186 << super.anInt10000) + local216[local418];
							@Pc(489) int local489 = local474 >> this.anInt6981;
							@Pc(494) int local494 = local484 >> this.anInt6981;
							@Pc(498) int local498 = local230[local418];
							@Pc(502) int local502 = local223[local418];
							@Pc(510) int local510 = local242 == null ? 0 : local242[local418];
							@Pc(528) long local528 = (long) local502 << 48 | (long) local498 << 32 | (long) (local489 << 16) | (long) local494;
							@Pc(532) int local532 = local209[local418];
							@Pc(536) int local536 = local216[local418];
							@Pc(538) byte local538 = 74;
							@Pc(540) int local540 = 0;
							@Pc(542) float local542 = 1.0F;
							@Pc(669) float local669;
							@Pc(652) float local652;
							@Pc(677) float local677;
							@Pc(620) float local620;
							@Pc(714) int local714;
							if (local532 == 0 && local536 == 0) {
								local714 = local538 - local374;
								local669 = local265;
								local677 = local279;
								local652 = local272;
							} else if (local532 == 0 && super.anInt9998 == local536) {
								local669 = local288;
								local714 = local538 - local384;
								local677 = local306;
								local652 = local297;
							} else if (local532 == super.anInt9998 && local536 == super.anInt9998) {
								local677 = local339;
								local652 = local328;
								local714 = local538 - local396;
								local669 = local317;
							} else if (super.anInt9998 == local532 && local536 == 0) {
								local677 = local366;
								local714 = local538 - local406;
								local652 = local357;
								local669 = local348;
							} else {
								@Pc(595) float local595 = (float) local532 / (float) super.anInt9998;
								@Pc(602) float local602 = (float) local536 / (float) super.anInt9998;
								@Pc(611) float local611 = local265 + local595 * (local348 - local265);
								local620 = (local357 - local272) * local595 + local272;
								@Pc(628) float local628 = (local366 - local279) * local595 + local279;
								@Pc(636) float local636 = local288 + (local317 - local288) * local595;
								@Pc(644) float local644 = local297 + local595 * (local328 - local297);
								local652 = local602 * (local644 - local620) + local620;
								@Pc(660) float local660 = (local339 - local306) * local595 + local306;
								local669 = local602 * (local636 - local611) + local611;
								local677 = (local660 - local628) * local602 + local628;
								@Pc(688) int local688 = ((local406 - local374) * local532 >> super.anInt10000) + local374;
								@Pc(700) int local700 = local384 + ((local396 - local384) * local532 >> super.anInt10000);
								local714 = local538 - (local536 * (local700 - local688) >> super.anInt10000) - local688;
							}
							if (local498 != -1) {
								@Pc(774) int local774 = (local498 & 0x7F) * local714 >> 7;
								if (local774 < 2) {
									local774 = 2;
								} else if (local774 > 126) {
									local774 = 126;
								}
								if ((this.anInt6997 & 0x7) == 0) {
									local542 = local677 * this.aClass90_Sub1_32.aFloatArray16[2] + local669 * this.aClass90_Sub1_32.aFloatArray16[0] + local652 * this.aClass90_Sub1_32.aFloatArray16[1];
									local542 = (local542 > 0.0F ? this.aClass90_Sub1_32.aFloat48 : this.aClass90_Sub1_32.aFloat40) * local542 + this.aClass90_Sub1_32.aFloat49;
								}
								local540 = Static36.anIntArray31[local498 & 0xFF80 | local774];
							}
							@Pc(843) Class6 local843 = null;
							if ((local474 & this.anInt6987 - 1) == 0 && (this.anInt6987 - 1 & local484) == 0) {
								local843 = local176.method5464(local528);
							}
							@Pc(1201) int local1201;
							@Pc(879) int local879;
							if (local843 == null) {
								if (local498 == local502) {
									local879 = local540;
								} else {
									@Pc(889) int local889 = local714 * (local502 & 0x7F) >> 7;
									if (local889 < 2) {
										local889 = 2;
									} else if (local889 > 126) {
										local889 = 126;
									}
									local879 = Static36.anIntArray31[local502 & 0xFF80 | local889];
									if ((this.anInt6997 & 0x7) == 0) {
										@Pc(941) float local941 = this.aClass90_Sub1_32.aFloatArray16[1] * local652 + local669 * this.aClass90_Sub1_32.aFloatArray16[0] + this.aClass90_Sub1_32.aFloatArray16[2] * local677;
										local620 = local542 * (local542 > 0.0F ? this.aClass90_Sub1_32.aFloat48 : this.aClass90_Sub1_32.aFloat40) + this.aClass90_Sub1_32.aFloat49;
										@Pc(966) int local966 = local879 >> 16 & 0xFF;
										@Pc(972) int local972 = local879 >> 8 & 0xFF;
										local966 = (int) ((float) local966 * local620);
										@Pc(982) int local982 = local879 & 0xFF;
										local972 = (int) ((float) local972 * local620);
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
										local982 = (int) ((float) local982 * local620);
										if (local982 < 0) {
											local982 = 0;
										} else if (local982 > 255) {
											local982 = 255;
										}
										local879 = local972 << 8 | local966 << 16 | local982;
									}
								}
								if (this.aClass90_Sub1_32.aBoolean176) {
									local155.a((float) local474);
									local155.a((float) (this.sa(local474, local484) + local510));
									local155.a((float) local484);
									local155.c((byte) (local879 >> 16));
									local155.c((byte) (local879 >> 8));
									local155.c((byte) local879);
									local155.c(-1);
									local155.a((float) local474);
									local155.a((float) local484);
									if (this.anIntArrayArrayArray15 != null) {
										local155.a((float) (local254 == null ? 0 : local254[local418] - 1));
									}
									if ((this.anInt6997 & 0x7) != 0) {
										local155.a(local669);
										local155.a(local652);
										local155.a(local677);
									}
								} else {
									local155.b((float) local474);
									local155.b((float) (local510 + this.sa(local474, local484)));
									local155.b((float) local484);
									local155.c((byte) (local879 >> 16));
									local155.c((byte) (local879 >> 8));
									local155.c((byte) local879);
									local155.c(-1);
									local155.b((float) local474);
									local155.b((float) local484);
									if (this.anIntArrayArrayArray15 != null) {
										local155.b((float) (local254 == null ? 0 : local254[local418] - 1));
									}
									if ((this.anInt6997 & 0x7) != 0) {
										local155.b(local669);
										local155.b(local652);
										local155.b(local677);
									}
								}
								local1201 = this.anInt6990++;
								local460[local418] = (short) local1201;
								if (local498 != -1) {
									local159[local1201] = local202[local418];
								}
								local176.method5466(local528, new Class6_Sub31(local460[local418]));
							} else {
								local460[local418] = ((Class6_Sub31) local843).aShort85;
								local1201 = local460[local418] & 0xFFFF;
								if (local498 != -1 && local202[local418].aLong245 < local159[local1201].aLong245) {
									local159[local1201] = local202[local418];
								}
							}
							for (local879 = 0; local879 < local408; local879++) {
								local180[local879].method5571(local1201, local542, local540, local714);
							}
							this.anInt6994++;
						}
					}
				}
			}
			for (local186 = 0; local186 < this.anInt6990; local186++) {
				@Pc(1320) Class6_Sub35 local1320 = local159[local186];
				if (local1320 != null) {
					local1320.method5568(local186);
				}
			}
			@Pc(1354) int local1354;
			for (@Pc(1333) int local1333 = 0; super.anInt9997 > local1333; local1333++) {
				for (@Pc(1337) int local1337 = 0; super.anInt9995 > local1337; local1337++) {
					@Pc(1350) short[] local1350 = this.aShortArrayArray22[super.anInt9997 * local1337 + local1333];
					if (local1350 != null) {
						local1354 = 0;
						@Pc(1356) int local1356 = 0;
						while (local1356 < local1350.length) {
							@Pc(1365) int local1365 = local1350[local1356++] & 0xFFFF;
							@Pc(1372) int local1372 = local1350[local1356++] & 0xFFFF;
							@Pc(1379) int local1379 = local1350[local1356++] & 0xFFFF;
							@Pc(1383) Class6_Sub35 local1383 = local159[local1365];
							@Pc(1387) Class6_Sub35 local1387 = local159[local1372];
							@Pc(1391) Class6_Sub35 local1391 = local159[local1379];
							@Pc(1393) Class6_Sub35 local1393 = null;
							if (local1383 != null) {
								local1393 = local1383;
								local1383.method5567(local1337, local1354, local1333);
							}
							if (local1387 != null) {
								local1387.method5567(local1337, local1354, local1333);
								if (local1393 == null || local1393.aLong245 > local1387.aLong245) {
									local1393 = local1387;
								}
							}
							if (local1391 != null) {
								local1391.method5567(local1337, local1354, local1333);
								if (local1393 == null || local1391.aLong245 < local1393.aLong245) {
									local1393 = local1391;
								}
							}
							if (local1393 != null) {
								if (local1383 != null) {
									local1393.method5568(local1365);
								}
								if (local1387 != null) {
									local1393.method5568(local1372);
								}
								if (local1391 != null) {
									local1393.method5568(local1379);
								}
								local1393.method5567(local1337, local1354, local1333);
							}
							local1354++;
						}
					}
				}
			}
			local155.b();
			this.anInterface14_6 = this.aClass90_Sub1_32.method2116(local155.c(), local127, local150);
			this.aClass166_12 = new Class166(this.anInterface14_6, 5126, 3, 0);
			this.aClass166_10 = new Class166(this.anInterface14_6, 5121, 4, 12);
			@Pc(1526) byte local1526;
			if (this.anIntArrayArrayArray15 == null) {
				local1526 = 24;
				this.aClass166_13 = new Class166(this.anInterface14_6, 5126, 2, 16);
			} else {
				local1526 = 28;
				this.aClass166_13 = new Class166(this.anInterface14_6, 5126, 3, 16);
			}
			if ((this.anInt6997 & 0x7) != 0) {
				this.aClass166_11 = new Class166(this.anInterface14_6, 5126, 3, local1526);
			}
			@Pc(1570) long[] local1570 = new long[this.aClass6_Sub35Array1.length];
			for (local1354 = 0; local1354 < this.aClass6_Sub35Array1.length; local1354++) {
				@Pc(1579) Class6_Sub35 local1579 = this.aClass6_Sub35Array1[local1354];
				local1570[local1354] = local1579.aLong245;
				local1579.method5570(this.anInt6990);
			}
			Static141.method2335(this.aClass6_Sub35Array1, local1570);
			if (this.aClass200_2 != null) {
				this.aClass200_2.method4958();
			}
		} else {
			this.aClass200_2 = null;
		}
		this.lb = null;
		this.aClass6_Sub35ArrayArrayArray1 = null;
		this.anIntArrayArrayArray15 = null;
		this.anIntArrayArrayArray17 = this.anIntArrayArrayArray13 = null;
		this.aByteArrayArray21 = null;
		this.anIntArrayArrayArray18 = null;
		this.anIntArrayArrayArray16 = null;
		this.anIntArrayArrayArray14 = null;
		this.aFloatArrayArray14 = this.aFloatArrayArray12 = this.aFloatArrayArray13 = null;
	}
}
