import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public final class Class16_Sub3 extends Class16 {

	@OriginalMember(owner = "client!sm", name = "lb", descriptor = "Lclient!tb;")
	public static Class309 lb;

	@OriginalMember(owner = "client!sm", name = "n", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!sm", name = "u", descriptor = "I")
	private int anInt8178;

	@OriginalMember(owner = "client!sm", name = "F", descriptor = "I")
	private int anInt8184;

	@OriginalMember(owner = "client!sm", name = "V", descriptor = "Lclient!gb;")
	private Interface10 anInterface10_7;

	@OriginalMember(owner = "client!sm", name = "W", descriptor = "I")
	private int anInt8194;

	@OriginalMember(owner = "client!sm", name = "X", descriptor = "Lclient!gda;")
	public Class117 aClass117_13;

	@OriginalMember(owner = "client!sm", name = "Y", descriptor = "[Lclient!gn;")
	private Class4_Sub21[] aClass4_Sub21Array1;

	@OriginalMember(owner = "client!sm", name = "ab", descriptor = "I")
	private int anInt8195;

	@OriginalMember(owner = "client!sm", name = "bb", descriptor = "Lclient!gda;")
	public Class117 aClass117_14;

	@OriginalMember(owner = "client!sm", name = "hb", descriptor = "Lclient!gda;")
	public Class117 aClass117_15;

	@OriginalMember(owner = "client!sm", name = "ib", descriptor = "Lclient!gda;")
	private Class117 aClass117_16;

	@OriginalMember(owner = "client!sm", name = "B", descriptor = "Lclient!gj;")
	private final Class124 aClass124_54 = new Class124();

	@OriginalMember(owner = "client!sm", name = "t", descriptor = "I")
	private final int anInt8177 = this.anInt9837 - 2;

	@OriginalMember(owner = "client!sm", name = "N", descriptor = "Lclient!no;")
	public final Class66_Sub3 aClass66_Sub3_35;

	@OriginalMember(owner = "client!sm", name = "x", descriptor = "[[I")
	private final int[][] anIntArrayArray70;

	@OriginalMember(owner = "client!sm", name = "jb", descriptor = "[[F")
	private float[][] aFloatArrayArray15;

	@OriginalMember(owner = "client!sm", name = "C", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray17;

	@OriginalMember(owner = "client!sm", name = "o", descriptor = "[[[Lclient!gn;")
	private Class4_Sub21[][][] aClass4_Sub21ArrayArrayArray1;

	@OriginalMember(owner = "client!sm", name = "G", descriptor = "[[B")
	private final byte[][] aByteArrayArray35;

	@OriginalMember(owner = "client!sm", name = "db", descriptor = "[[F")
	private float[][] aFloatArrayArray14;

	@OriginalMember(owner = "client!sm", name = "J", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray18;

	@OriginalMember(owner = "client!sm", name = "r", descriptor = "[[S")
	public final short[][] aShortArrayArray32;

	@OriginalMember(owner = "client!sm", name = "P", descriptor = "I")
	private final int anInt8189;

	@OriginalMember(owner = "client!sm", name = "w", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!sm", name = "cb", descriptor = "[[B")
	private byte[][] aByteArrayArray36;

	@OriginalMember(owner = "client!sm", name = "l", descriptor = "I")
	public final int anInt8173;

	@OriginalMember(owner = "client!sm", name = "Z", descriptor = "[[F")
	private float[][] aFloatArrayArray13;

	@OriginalMember(owner = "client!sm", name = "U", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray20;

	@OriginalMember(owner = "client!sm", name = "L", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray19;

	@OriginalMember(owner = "client!sm", name = "eb", descriptor = "Lclient!jw;")
	private Class183 aClass183_33;

	@OriginalMember(owner = "client!sm", name = "A", descriptor = "Lclient!waa;")
	private Class351 aClass351_1;

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Lclient!no;IIII[[I[[II)V")
	public Class16_Sub3(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.aClass66_Sub3_35 = arg0;
		this.anIntArrayArray70 = arg5;
		this.aFloatArrayArray15 = new float[super.anInt9838 + 1][super.anInt9839 + 1];
		this.anIntArrayArrayArray17 = new int[arg3][arg4][];
		this.aClass4_Sub21ArrayArrayArray1 = new Class4_Sub21[arg3][arg4][];
		this.aByteArrayArray35 = new byte[arg3][arg4];
		this.aFloatArrayArray14 = new float[super.anInt9838 + 1][super.anInt9839 + 1];
		this.anIntArrayArrayArray18 = new int[arg3][arg4][];
		this.aShortArrayArray32 = new short[arg3 * arg4][];
		this.anInt8189 = 0x1 << this.anInt8177;
		this.anIntArrayArrayArray16 = new int[arg3][arg4][];
		this.aByteArrayArray36 = new byte[arg3 + 1][arg4 + 1];
		this.anInt8173 = arg2;
		this.aFloatArrayArray13 = new float[super.anInt9838 + 1][super.anInt9839 + 1];
		this.anIntArrayArrayArray20 = new int[arg3][arg4][];
		this.anIntArrayArrayArray19 = new int[arg3][arg4][];
		for (@Pc(117) int local117 = 1; super.anInt9839 > local117; local117++) {
			for (@Pc(121) int local121 = 1; local121 < super.anInt9838; local121++) {
				@Pc(140) int local140 = arg6[local121 + 1][local117] - arg6[local121 - 1][local117];
				@Pc(157) int local157 = arg6[local121][local117 + 1] - arg6[local121][local117 - 1];
				@Pc(176) float local176 = (float) (1.0D / Math.sqrt((double) (local157 * local157 + local140 * local140 + arg7 * arg7 * 4)));
				this.aFloatArrayArray15[local121][local117] = local176 * (float) local140;
				this.aFloatArrayArray13[local121][local117] = (float) (-arg7 * 2) * local176;
				this.aFloatArrayArray14[local121][local117] = local176 * (float) local157;
			}
		}
		this.aClass183_33 = new Class183(128);
		if ((this.anInt8173 & 0x10) != 0) {
			this.aClass351_1 = new Class351(this.aClass66_Sub3_35, this);
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)V")
	@Override
	public void method8044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "(IILclient!w;)Lclient!w;")
	@Override
	public Class4_Sub7_Sub3 c(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub7_Sub3 arg2) {
		if ((this.aByteArrayArray35[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt9841 >> this.aClass66_Sub3_35.anInt6443;
		@Pc(27) Class4_Sub7_Sub3_Sub2 local27 = (Class4_Sub7_Sub3_Sub2) arg2;
		@Pc(43) Class4_Sub7_Sub3_Sub2 local43;
		if (local27 != null && local27.method5512(local24, local24)) {
			local43 = local27;
			local27.method5507();
		} else {
			local43 = new Class4_Sub7_Sub3_Sub2(this.aClass66_Sub3_35, local24, local24);
		}
		local43.method5508(0, local24, 0, local24);
		this.method6753(local43, arg1, arg0);
		return local43;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!nw;IBI)V")
	private void method6753(@OriginalArg(0) Class4_Sub7_Sub3_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(20) int[] local20 = this.anIntArrayArrayArray16[arg2][arg1];
		@Pc(27) int[] local27 = this.anIntArrayArrayArray17[arg2][arg1];
		@Pc(30) int local30 = local20.length;
		if (local30 > this.aClass66_Sub3_35.anIntArray515.length) {
			this.aClass66_Sub3_35.anIntArray517 = new int[local30];
			this.aClass66_Sub3_35.anIntArray515 = new int[local30];
		}
		@Pc(54) int[] local54 = this.aClass66_Sub3_35.anIntArray515;
		@Pc(58) int[] local58 = this.aClass66_Sub3_35.anIntArray517;
		for (@Pc(60) int local60 = 0; local60 < local30; local60++) {
			local54[local60] = local20[local60] >> this.aClass66_Sub3_35.anInt6443;
			local58[local60] = local27[local60] >> this.aClass66_Sub3_35.anInt6443;
		}
		@Pc(92) int local92 = 0;
		while (local92 < local30) {
			@Pc(98) int local98 = local54[local92];
			@Pc(103) int local103 = local58[local92++];
			@Pc(107) int local107 = local54[local92];
			@Pc(112) int local112 = local58[local92++];
			@Pc(116) int local116 = local54[local92];
			@Pc(121) int local121 = local58[local92++];
			if (-((local116 - local107) * (local112 + -local103)) + (local112 - local121) * (local98 - local107) > 0) {
				arg0.method5511(local107, local121, local103, local112, local116, local98);
			}
		}
	}

	@OriginalMember(owner = "client!sm", name = "JA", descriptor = "(II)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray70[arg0][arg1];
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method8041(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method6756(arg2, arg0, arg3, arg4, arg1);
	}

	@OriginalMember(owner = "client!sm", name = "EA", descriptor = "(III)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray36[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray36[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method8040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method8039(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt8195 <= 0) {
			return;
		}
		this.aClass66_Sub3_35.method5365();
		this.aClass66_Sub3_35.method5371(false);
		this.aClass66_Sub3_35.method5405(false);
		this.aClass66_Sub3_35.method5384(false);
		this.aClass66_Sub3_35.method5432(false);
		this.aClass66_Sub3_35.method5398(0);
		this.aClass66_Sub3_35.method5431(-2);
		this.aClass66_Sub3_35.method5382(null);
		Static517.aFloatArray63[5] = (float) 1024 / ((float) super.anInt9841 * 128.0F * (float) this.aClass66_Sub3_35.anInt6320);
		Static517.aFloatArray63[1] = 0.0F;
		Static517.aFloatArray63[2] = 0.0F;
		Static517.aFloatArray63[8] = 0.0F;
		Static517.aFloatArray63[0] = (float) 1024 / ((float) super.anInt9841 * 128.0F * (float) this.aClass66_Sub3_35.anInt6340);
		Static517.aFloatArray63[3] = 0.0F;
		Static517.aFloatArray63[10] = 0.0F;
		Static517.aFloatArray63[7] = 0.0F;
		Static517.aFloatArray63[14] = 0.0F;
		Static517.aFloatArray63[6] = 0.0F;
		Static517.aFloatArray63[12] = -(((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass66_Sub3_35.anInt6340) - 1.0F;
		Static517.aFloatArray63[9] = 0.0F;
		Static517.aFloatArray63[4] = 0.0F;
		Static517.aFloatArray63[15] = 1.0F;
		Static517.aFloatArray63[11] = 0.0F;
		Static517.aFloatArray63[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass66_Sub3_35.anInt6320;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static517.aFloatArray63, 0);
		Static517.aFloatArray63[15] = 1.0F;
		Static517.aFloatArray63[0] = 1.0F;
		Static517.aFloatArray63[3] = 0.0F;
		Static517.aFloatArray63[8] = 0.0F;
		Static517.aFloatArray63[14] = 0.0F;
		Static517.aFloatArray63[4] = 0.0F;
		Static517.aFloatArray63[1] = 0.0F;
		Static517.aFloatArray63[10] = 0.0F;
		Static517.aFloatArray63[2] = 0.0F;
		Static517.aFloatArray63[9] = 1.0F;
		Static517.aFloatArray63[11] = 0.0F;
		Static517.aFloatArray63[7] = 0.0F;
		Static517.aFloatArray63[5] = 0.0F;
		Static517.aFloatArray63[12] = 0.0F;
		Static517.aFloatArray63[6] = 1.0F;
		Static517.aFloatArray63[13] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static517.aFloatArray63, 0);
		if ((this.anInt8173 & 0x7) == 0) {
			this.aClass66_Sub3_35.method5405(false);
		} else {
			this.aClass66_Sub3_35.method5405(true);
			this.aClass66_Sub3_35.method5403();
		}
		this.aClass66_Sub3_35.method5413(this.aClass117_16, this.aClass117_15, this.aClass117_13, this.aClass117_14);
		if (this.anInt8184 * 2 > this.aClass66_Sub3_35.aClass4_Sub9_Sub2_2.aByteArray97.length) {
			this.aClass66_Sub3_35.aClass4_Sub9_Sub2_2 = new Class4_Sub9_Sub2(this.anInt8184 * 2);
		} else {
			this.aClass66_Sub3_35.aClass4_Sub9_Sub2_2.anInt7219 = 0;
		}
		@Pc(314) int local314 = 0;
		@Pc(318) Class4_Sub9_Sub2 local318 = this.aClass66_Sub3_35.aClass4_Sub9_Sub2_2;
		@Pc(324) int local324;
		@Pc(333) int local333;
		@Pc(335) int local335;
		@Pc(353) short[] local353;
		@Pc(357) int local357;
		if (this.aClass66_Sub3_35.aBoolean476) {
			for (local324 = arg1; local324 < arg3; local324++) {
				local333 = super.anInt9838 * local324 + arg0;
				for (local335 = arg0; local335 < arg2; local335++) {
					if (arg4[local335 - arg0][local324 - arg1]) {
						local353 = this.aShortArrayArray32[local333];
						if (local353 != null) {
							for (local357 = 0; local357 < local353.length; local357++) {
								local314++;
								local318.method6012(local353[local357] & 0xFFFF);
							}
						}
					}
					local333++;
				}
			}
		} else {
			for (local324 = arg1; local324 < arg3; local324++) {
				local333 = local324 * super.anInt9838 + arg0;
				for (local335 = arg0; local335 < arg2; local335++) {
					if (arg4[local335 - arg0][local324 - arg1]) {
						local353 = this.aShortArrayArray32[local333];
						if (local353 != null) {
							for (local357 = 0; local357 < local353.length; local357++) {
								local318.method5989(local353[local357] & 0xFFFF);
								local314++;
							}
						}
					}
					local333++;
				}
			}
		}
		if (local314 > 0) {
			@Pc(477) Class20_Sub2 local477 = new Class20_Sub2(this.aClass66_Sub3_35, 5123, local318.aByteArray97, local318.anInt7219);
			this.aClass66_Sub3_35.method5357(0, local477, local314);
		}
	}

	@OriginalMember(owner = "client!sm", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray15 == null) {
			this.anIntArrayArrayArray15 = new int[super.anInt9838][super.anInt9839][];
		}
		if (arg3 != null && this.anIntArrayArrayArray18 == null) {
			this.anIntArrayArrayArray18 = new int[super.anInt9838][super.anInt9839][];
		}
		this.anIntArrayArrayArray16[arg0][arg1] = arg2;
		this.anIntArrayArrayArray17[arg0][arg1] = arg4;
		this.anIntArrayArrayArray20[arg0][arg1] = arg6;
		this.anIntArrayArrayArray19[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray15 != null) {
			this.anIntArrayArrayArray15[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray18 != null) {
			this.anIntArrayArrayArray18[arg0][arg1] = arg3;
		}
		@Pc(88) Class4_Sub21[] local88 = this.aClass4_Sub21ArrayArrayArray1[arg0][arg1] = new Class4_Sub21[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) (arg9[local90] << 14) | (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28 | (long) arg8[local90];
			@Pc(125) Class4 local125;
			for (local125 = this.aClass183_33.method4289(local119); local125 != null; local125 = this.aClass183_33.method4290()) {
				@Pc(130) Class4_Sub21 local130 = (Class4_Sub21) local125;
				if (local130.anInt3721 == arg8[local90] && (float) arg9[local90] == local130.aFloat63 && local130.anInt3722 == arg10 && arg11 == local130.anInt3725 && local130.anInt3723 == arg12) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class4_Sub21(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass183_33.method4282(local119, local88[local90]);
			} else {
				local88[local90] = (Class4_Sub21) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray35[arg0][arg1] = (byte) (this.aByteArrayArray35[arg0][arg1] | 0x1);
		}
		if (this.anInt8194 < arg6.length) {
			this.anInt8194 = arg6.length;
		}
		this.anInt8195 += arg6.length;
	}

	@OriginalMember(owner = "client!sm", name = "FA", descriptor = "(Lclient!w;IIIIZ)V")
	@Override
	public void FA(@OriginalArg(0) Class4_Sub7_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass351_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass66_Sub3_35.anInt6461 * arg2 >> 8) >> this.aClass66_Sub3_35.anInt6443;
			@Pc(39) int local39 = arg3 - (this.aClass66_Sub3_35.anInt6452 * arg2 >> 8) >> this.aClass66_Sub3_35.anInt6443;
			this.aClass351_1.method7835(local24, local39, arg0);
		}
	}

	@OriginalMember(owner = "client!sm", name = "aa", descriptor = "(Lclient!w;IIIIZ)V")
	@Override
	public void aa(@OriginalArg(0) Class4_Sub7_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass351_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass66_Sub3_35.anInt6461 * arg2 >> 8) >> this.aClass66_Sub3_35.anInt6443;
			@Pc(38) int local38 = arg3 - (arg2 * this.aClass66_Sub3_35.anInt6452 >> 8) >> this.aClass66_Sub3_35.anInt6443;
			this.aClass351_1.method7837(local38, arg0, local24);
		}
	}

	@OriginalMember(owner = "client!sm", name = "ba", descriptor = "()V")
	@Override
	public void ba() {
		if (this.anInt8195 > 0) {
			@Pc(17) byte[][] local17 = new byte[super.anInt9838 + 1][super.anInt9839 + 1];
			@Pc(23) int local23;
			for (@Pc(19) int local19 = 1; local19 < super.anInt9838; local19++) {
				for (local23 = 1; local23 < super.anInt9839; local23++) {
					local17[local19][local23] = (byte) ((this.aByteArrayArray36[local19][local23 - 1] >> 2) + (this.aByteArrayArray36[local19 + 1][local23] >> 3) + (this.aByteArrayArray36[local19 + -1][local23] >> 2) + (this.aByteArrayArray36[local19][local23 + 1] >> 3) + (this.aByteArrayArray36[local19][local23] >> 1));
				}
			}
			this.aClass4_Sub21Array1 = new Class4_Sub21[this.aClass183_33.method4291()];
			this.aClass183_33.method4284(this.aClass4_Sub21Array1);
			for (local23 = 0; local23 < this.aClass4_Sub21Array1.length; local23++) {
				this.aClass4_Sub21Array1[local23].method3306(this.anInt8195);
			}
			@Pc(139) int local139 = 24;
			if (this.anIntArrayArrayArray15 != null) {
				local139 += 4;
			}
			if ((this.anInt8173 & 0x7) != 0) {
				local139 += 12;
			}
			@Pc(162) NativeHeapBuffer local162 = this.aClass66_Sub3_35.aNativeHeap4.a(this.anInt8195 * local139, false);
			@Pc(167) Stream local167 = new Stream(local162);
			@Pc(171) Class4_Sub21[] local171 = new Class4_Sub21[this.anInt8195];
			@Pc(178) int local178 = Static337.method5028(this.anInt8195 / 4);
			if (local178 < 1) {
				local178 = 1;
			}
			@Pc(190) Class183 local190 = new Class183(local178);
			@Pc(194) Class4_Sub21[] local194 = new Class4_Sub21[this.anInt8194];
			@Pc(200) int local200;
			for (@Pc(196) int local196 = 0; local196 < super.anInt9838; local196++) {
				for (local200 = 0; super.anInt9839 > local200; local200++) {
					if (this.anIntArrayArrayArray20[local196][local200] != null) {
						@Pc(216) Class4_Sub21[] local216 = this.aClass4_Sub21ArrayArrayArray1[local196][local200];
						@Pc(223) int[] local223 = this.anIntArrayArrayArray16[local196][local200];
						@Pc(230) int[] local230 = this.anIntArrayArrayArray17[local196][local200];
						@Pc(237) int[] local237 = this.anIntArrayArrayArray19[local196][local200];
						@Pc(244) int[] local244 = this.anIntArrayArrayArray20[local196][local200];
						@Pc(256) int[] local256 = this.anIntArrayArrayArray18 == null ? null : this.anIntArrayArrayArray18[local196][local200];
						if (local237 == null) {
							local237 = local244;
						}
						@Pc(272) int[] local272 = this.anIntArrayArrayArray15 == null ? null : this.anIntArrayArrayArray15[local196][local200];
						@Pc(279) float local279 = this.aFloatArrayArray15[local196][local200];
						@Pc(286) float local286 = this.aFloatArrayArray13[local196][local200];
						@Pc(293) float local293 = this.aFloatArrayArray14[local196][local200];
						@Pc(302) float local302 = this.aFloatArrayArray15[local196][local200 + 1];
						@Pc(311) float local311 = this.aFloatArrayArray13[local196][local200 + 1];
						@Pc(320) float local320 = this.aFloatArrayArray14[local196][local200 + 1];
						@Pc(331) float local331 = this.aFloatArrayArray15[local196 + 1][local200 + 1];
						@Pc(342) float local342 = this.aFloatArrayArray13[local196 + 1][local200 + 1];
						@Pc(353) float local353 = this.aFloatArrayArray14[local196 + 1][local200 + 1];
						@Pc(362) float local362 = this.aFloatArrayArray15[local196 + 1][local200];
						@Pc(371) float local371 = this.aFloatArrayArray13[local196 + 1][local200];
						@Pc(380) float local380 = this.aFloatArrayArray14[local196 + 1][local200];
						@Pc(388) int local388 = local17[local196][local200] & 0xFF;
						@Pc(398) int local398 = local17[local196][local200 + 1] & 0xFF;
						@Pc(410) int local410 = local17[local196 + 1][local200 + 1] & 0xFF;
						@Pc(420) int local420 = local17[local196 + 1][local200] & 0xFF;
						@Pc(422) int local422 = 0;
						@Pc(432) int local432;
						label335: for (@Pc(424) int local424 = 0; local424 < local244.length; local424++) {
							@Pc(430) Class4_Sub21 local430 = local216[local424];
							for (local432 = 0; local432 < local422; local432++) {
								if (local194[local432] == local430) {
									continue label335;
								}
							}
							local194[local422++] = local430;
						}
						@Pc(474) short[] local474 = this.aShortArrayArray32[super.anInt9838 * local200 + local196] = new short[local244.length];
						for (local432 = 0; local432 < local244.length; local432++) {
							@Pc(488) int local488 = (local196 << super.anInt9837) + local223[local432];
							@Pc(498) int local498 = (local200 << super.anInt9837) + local230[local432];
							@Pc(503) int local503 = local488 >> this.anInt8177;
							@Pc(508) int local508 = local498 >> this.anInt8177;
							@Pc(512) int local512 = local244[local432];
							@Pc(516) int local516 = local237[local432];
							@Pc(524) int local524 = local256 == null ? 0 : local256[local432];
							@Pc(542) long local542 = (long) local508 | (long) local516 << 48 | (long) local512 << 32 | (long) (local503 << 16);
							@Pc(546) int local546 = local223[local432];
							@Pc(550) int local550 = local230[local432];
							@Pc(552) byte local552 = 74;
							@Pc(554) int local554 = 0;
							@Pc(556) float local556 = 1.0F;
							@Pc(598) float local598;
							@Pc(592) float local592;
							@Pc(590) float local590;
							@Pc(636) float local636;
							@Pc(596) int local596;
							if (local546 == 0 && local550 == 0) {
								local590 = local293;
								local598 = local279;
								local596 = local552 - local388;
								local592 = local286;
							} else if (local546 == 0 && local550 == super.anInt9841) {
								local596 = local552 - local398;
								local592 = local311;
								local598 = local302;
								local590 = local320;
							} else if (local546 == super.anInt9841 && local550 == super.anInt9841) {
								local590 = local353;
								local592 = local342;
								local596 = local552 - local410;
								local598 = local331;
							} else if (super.anInt9841 == local546 && local550 == 0) {
								local592 = local371;
								local598 = local362;
								local590 = local380;
								local596 = local552 - local420;
							} else {
								@Pc(613) float local613 = (float) local546 / (float) super.anInt9841;
								@Pc(620) float local620 = (float) local550 / (float) super.anInt9841;
								@Pc(628) float local628 = local279 + (local362 - local279) * local613;
								local636 = (local371 - local286) * local613 + local286;
								@Pc(644) float local644 = local293 + (local380 - local293) * local613;
								@Pc(652) float local652 = local613 * (local331 - local302) + local302;
								@Pc(660) float local660 = local311 + local613 * (local342 - local311);
								local592 = local620 * (local660 - local636) + local636;
								@Pc(678) float local678 = local320 + local613 * (local353 - local320);
								local598 = local628 + (local652 - local628) * local620;
								local590 = local644 + local620 * (local678 - local644);
								@Pc(706) int local706 = local388 + (local546 * (local420 - local388) >> super.anInt9837);
								@Pc(718) int local718 = (local546 * (local410 - local398) >> super.anInt9837) + local398;
								local596 = local552 - ((local718 - local706) * local550 >> super.anInt9837) - local706;
							}
							if (local512 != -1) {
								@Pc(780) int local780 = local596 * (local512 & 0x7F) >> 7;
								if (local780 < 2) {
									local780 = 2;
								} else if (local780 > 126) {
									local780 = 126;
								}
								local554 = Static170.anIntArray696[local512 & 0xFF80 | local780];
								if ((this.anInt8173 & 0x7) == 0) {
									local556 = local592 * this.aClass66_Sub3_35.aFloatArray41[1] + this.aClass66_Sub3_35.aFloatArray41[0] * local598 + this.aClass66_Sub3_35.aFloatArray41[2] * local590;
									local556 = local556 * (local556 > 0.0F ? this.aClass66_Sub3_35.aFloat111 : this.aClass66_Sub3_35.aFloat114) + this.aClass66_Sub3_35.aFloat128;
								}
							}
							@Pc(852) Class4 local852 = null;
							if ((this.anInt8189 - 1 & local488) == 0 && (local498 & this.anInt8189 - 1) == 0) {
								local852 = local190.method4289(local542);
							}
							@Pc(1207) int local1207;
							@Pc(878) int local878;
							if (local852 == null) {
								if (local512 == local516) {
									local878 = local554;
								} else {
									@Pc(888) int local888 = local596 * (local516 & 0x7F) >> 7;
									if (local888 < 2) {
										local888 = 2;
									} else if (local888 > 126) {
										local888 = 126;
									}
									local878 = Static170.anIntArray696[local516 & 0xFF80 | local888];
									if ((this.anInt8173 & 0x7) == 0) {
										local636 = this.aClass66_Sub3_35.aFloatArray41[2] * local590 + local592 * this.aClass66_Sub3_35.aFloatArray41[1] + this.aClass66_Sub3_35.aFloatArray41[0] * local598;
										local636 = this.aClass66_Sub3_35.aFloat128 + (local556 > 0.0F ? this.aClass66_Sub3_35.aFloat111 : this.aClass66_Sub3_35.aFloat114) * local556;
										@Pc(966) int local966 = local878 >> 16 & 0xFF;
										@Pc(972) int local972 = local878 >> 8 & 0xFF;
										local966 = (int) ((float) local966 * local636);
										@Pc(982) int local982 = local878 & 0xFF;
										local972 = (int) ((float) local972 * local636);
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
										local982 = (int) ((float) local982 * local636);
										if (local982 < 0) {
											local982 = 0;
										} else if (local982 > 255) {
											local982 = 255;
										}
										local878 = local966 << 16 | local972 << 8 | local982;
									}
								}
								if (this.aClass66_Sub3_35.aBoolean476) {
									local167.b((float) local488);
									local167.b((float) (local524 + this.sa(local488, local498)));
									local167.b((float) local498);
									local167.f((byte) (local878 >> 16));
									local167.f((byte) (local878 >> 8));
									local167.f((byte) local878);
									local167.f(-1);
									local167.b((float) local488);
									local167.b((float) local498);
									if (this.anIntArrayArrayArray15 != null) {
										local167.b((float) (local272 == null ? 0 : local272[local432] - 1));
									}
									if ((this.anInt8173 & 0x7) != 0) {
										local167.b(local598);
										local167.b(local592);
										local167.b(local590);
									}
								} else {
									local167.a((float) local488);
									local167.a((float) (local524 + this.sa(local488, local498)));
									local167.a((float) local498);
									local167.f((byte) (local878 >> 16));
									local167.f((byte) (local878 >> 8));
									local167.f((byte) local878);
									local167.f(-1);
									local167.a((float) local488);
									local167.a((float) local498);
									if (this.anIntArrayArrayArray15 != null) {
										local167.a((float) (local272 == null ? 0 : local272[local432] - 1));
									}
									if ((this.anInt8173 & 0x7) != 0) {
										local167.a(local598);
										local167.a(local592);
										local167.a(local590);
									}
								}
								local1207 = this.anInt8178++;
								local474[local432] = (short) local1207;
								if (local512 != -1) {
									local171[local1207] = local216[local432];
								}
								local190.method4282(local542, new Class4_Sub52(local474[local432]));
							} else {
								local474[local432] = ((Class4_Sub52) local852).aShort126;
								local1207 = local474[local432] & 0xFFFF;
								if (local512 != -1 && local216[local432].aLong307 < local171[local1207].aLong307) {
									local171[local1207] = local216[local432];
								}
							}
							for (local878 = 0; local878 < local422; local878++) {
								local194[local878].method3308(local554, local596, local556, local1207);
							}
							this.anInt8184++;
						}
					}
				}
			}
			for (local200 = 0; local200 < this.anInt8178; local200++) {
				@Pc(1315) Class4_Sub21 local1315 = local171[local200];
				if (local1315 != null) {
					local1315.method3311(local200);
				}
			}
			@Pc(1348) int local1348;
			for (@Pc(1328) int local1328 = 0; local1328 < super.anInt9838; local1328++) {
				for (@Pc(1332) int local1332 = 0; local1332 < super.anInt9839; local1332++) {
					@Pc(1344) short[] local1344 = this.aShortArrayArray32[local1328 + super.anInt9838 * local1332];
					if (local1344 != null) {
						local1348 = 0;
						@Pc(1350) int local1350 = 0;
						while (local1350 < local1344.length) {
							@Pc(1359) int local1359 = local1344[local1350++] & 0xFFFF;
							@Pc(1366) int local1366 = local1344[local1350++] & 0xFFFF;
							@Pc(1373) int local1373 = local1344[local1350++] & 0xFFFF;
							@Pc(1377) Class4_Sub21 local1377 = local171[local1359];
							@Pc(1381) Class4_Sub21 local1381 = local171[local1366];
							@Pc(1385) Class4_Sub21 local1385 = local171[local1373];
							@Pc(1387) Class4_Sub21 local1387 = null;
							if (local1377 != null) {
								local1377.method3305(local1348, local1328, local1332);
								local1387 = local1377;
							}
							if (local1381 != null) {
								local1381.method3305(local1348, local1328, local1332);
								if (local1387 == null || local1387.aLong307 > local1381.aLong307) {
									local1387 = local1381;
								}
							}
							if (local1385 != null) {
								local1385.method3305(local1348, local1328, local1332);
								if (local1387 == null || local1385.aLong307 < local1387.aLong307) {
									local1387 = local1385;
								}
							}
							if (local1387 != null) {
								if (local1377 != null) {
									local1387.method3311(local1359);
								}
								if (local1381 != null) {
									local1387.method3311(local1366);
								}
								if (local1385 != null) {
									local1387.method3311(local1373);
								}
								local1387.method3305(local1348, local1328, local1332);
							}
							local1348++;
						}
					}
				}
			}
			local167.c();
			this.anInterface10_7 = this.aClass66_Sub3_35.method5360(local167.a(), local139, local162);
			this.aClass117_15 = new Class117(this.anInterface10_7, 5126, 3, 0);
			this.aClass117_16 = new Class117(this.anInterface10_7, 5121, 4, 12);
			@Pc(1538) byte local1538;
			if (this.anIntArrayArrayArray15 == null) {
				this.aClass117_14 = new Class117(this.anInterface10_7, 5126, 2, 16);
				local1538 = 24;
			} else {
				this.aClass117_14 = new Class117(this.anInterface10_7, 5126, 3, 16);
				local1538 = 28;
			}
			if ((this.anInt8173 & 0x7) != 0) {
				this.aClass117_13 = new Class117(this.anInterface10_7, 5126, 3, local1538);
			}
			@Pc(1572) long[] local1572 = new long[this.aClass4_Sub21Array1.length];
			for (local1348 = 0; local1348 < this.aClass4_Sub21Array1.length; local1348++) {
				@Pc(1581) Class4_Sub21 local1581 = this.aClass4_Sub21Array1[local1348];
				local1572[local1348] = local1581.aLong307;
				local1581.method3309(this.anInt8178);
			}
			Static366.method5525(this.aClass4_Sub21Array1, local1572);
			if (this.aClass351_1 != null) {
				this.aClass351_1.method7829();
			}
		} else {
			this.aClass351_1 = null;
		}
		this.anIntArrayArrayArray16 = this.anIntArrayArrayArray17 = null;
		this.anIntArrayArrayArray20 = null;
		this.aFloatArrayArray15 = this.aFloatArrayArray13 = this.aFloatArrayArray14 = null;
		this.aByteArrayArray36 = null;
		this.anIntArrayArrayArray19 = null;
		this.aClass4_Sub21ArrayArrayArray1 = null;
		this.aClass183_33 = null;
		this.anIntArrayArrayArray15 = null;
		this.anIntArrayArrayArray18 = null;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!w;IIIIZ)Z")
	@Override
	public boolean method8043(@OriginalArg(0) Class4_Sub7_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass351_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (this.aClass66_Sub3_35.anInt6461 * arg2 >> 8) >> this.aClass66_Sub3_35.anInt6443;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass66_Sub3_35.anInt6452 >> 8) >> this.aClass66_Sub3_35.anInt6443;
			return this.aClass351_1.method7833(arg0, local39, local25);
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!pv;[I)V")
	@Override
	public void method8042(@OriginalArg(0) Class4_Sub32 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass124_54.method3275(new Class4_Sub11(this.aClass66_Sub3_35, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(II[[ZZIII)V")
	private void method6756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[][] arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		if (this.aClass4_Sub21Array1 == null) {
			return;
		}
		@Pc(11) int local11 = arg0 + arg0 + 1;
		@Pc(15) int local15 = local11 * local11;
		if (this.aClass66_Sub3_35.anIntArray516.length < local15) {
			this.aClass66_Sub3_35.anIntArray516 = new int[local15];
		}
		if (this.aClass66_Sub3_35.aClass4_Sub9_Sub2_2.aByteArray97.length < this.anInt8184 * 2) {
			this.aClass66_Sub3_35.aClass4_Sub9_Sub2_2 = new Class4_Sub9_Sub2(this.anInt8184 * 2);
		}
		@Pc(51) int local51 = arg1 - arg0;
		@Pc(53) int local53 = local51;
		if (local51 < 0) {
			local51 = 0;
		}
		@Pc(65) int local65 = arg4 - arg0;
		@Pc(67) int local67 = local65;
		if (local65 < 0) {
			local65 = 0;
		}
		@Pc(78) int local78 = arg0 + arg1;
		if (super.anInt9838 - 1 < local78) {
			local78 = super.anInt9838 - 1;
		}
		@Pc(97) int local97 = arg4 + arg0;
		if (super.anInt9839 - 1 < local97) {
			local97 = super.anInt9839 - 1;
		}
		@Pc(110) int local110 = 0;
		@Pc(114) int[] local114 = this.aClass66_Sub3_35.anIntArray516;
		@Pc(127) int local127;
		for (@Pc(116) int local116 = local51; local116 <= local78; local116++) {
			@Pc(125) boolean[] local125 = arg2[local116 - local53];
			for (local127 = local65; local127 <= local97; local127++) {
				if (local125[local127 - local67]) {
					local114[local110++] = local116 + super.anInt9838 * local127;
				}
			}
		}
		this.aClass66_Sub3_35.method5412();
		this.aClass66_Sub3_35.method5405((this.anInt8173 & 0x7) != 0);
		for (@Pc(194) int local194 = 0; local194 < this.aClass4_Sub21Array1.length; local194++) {
			this.aClass4_Sub21Array1[local194].method3310(local114, local110);
		}
		if (!this.aClass124_54.method3264()) {
			local127 = this.aClass66_Sub3_35.anInt6470;
			@Pc(229) int local229 = this.aClass66_Sub3_35.anInt6486;
			this.aClass66_Sub3_35.X(0, local229, this.aClass66_Sub3_35.anInt6451);
			this.aClass66_Sub3_35.method5405(false);
			this.aClass66_Sub3_35.method5432(false);
			this.aClass66_Sub3_35.method5398(128);
			this.aClass66_Sub3_35.method5431(-2);
			this.aClass66_Sub3_35.method5382(this.aClass66_Sub3_35.aClass114_Sub1_3);
			this.aClass66_Sub3_35.method5396(7681, 8448);
			this.aClass66_Sub3_35.method5361(770, 0, 34166);
			this.aClass66_Sub3_35.method5424(0, 34167);
			for (@Pc(293) Class4 local293 = this.aClass124_54.method3267(); local293 != null; local293 = this.aClass124_54.method3273()) {
				@Pc(298) Class4_Sub11 local298 = (Class4_Sub11) local293;
				local298.method1074(arg1, arg0, arg4, arg2);
			}
			this.aClass66_Sub3_35.method5361(768, 0, 5890);
			this.aClass66_Sub3_35.method5424(0, 5890);
			this.aClass66_Sub3_35.method5382(null);
			this.aClass66_Sub3_35.X(local127, local229, this.aClass66_Sub3_35.anInt6451);
		}
		if (this.aClass351_1 != null) {
			this.aClass66_Sub3_35.method5413(null, this.aClass117_15, null, this.aClass117_14);
			this.aClass351_1.method7830(arg1, arg0, arg2, arg4, arg3);
		}
	}

	@OriginalMember(owner = "client!sm", name = "sa", descriptor = "(II)I")
	@Override
	public int sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 >> super.anInt9837;
		@Pc(13) int local13 = arg1 >> super.anInt9837;
		if (local8 < 0 || local13 < 0 || super.anInt9838 - 1 < local8 || local13 > super.anInt9839 - 1) {
			return 0;
		}
		@Pc(44) int local44 = super.anInt9841 - 1 & arg0;
		@Pc(51) int local51 = super.anInt9841 - 1 & arg1;
		@Pc(77) int local77 = local44 * this.anIntArrayArray70[local8 + 1][local13] + (super.anInt9841 - local44) * this.anIntArrayArray70[local8][local13] >> super.anInt9837;
		@Pc(108) int local108 = this.anIntArrayArray70[local8 + 1][local13 + 1] * local44 + this.anIntArrayArray70[local8][local13 + 1] * (super.anInt9841 - local44) >> super.anInt9837;
		return local108 * local51 + (super.anInt9841 - local51) * local77 >> super.anInt9837;
	}
}
