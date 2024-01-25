import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public final class Class22_Sub2 extends Class22 {

	@OriginalMember(owner = "client!hk", name = "A", descriptor = "I")
	private int anInt2833;

	@OriginalMember(owner = "client!hk", name = "C", descriptor = "I")
	private int anInt2835;

	@OriginalMember(owner = "client!hk", name = "I", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!hk", name = "S", descriptor = "Lclient!db;")
	private Class47 aClass47_1;

	@OriginalMember(owner = "client!hk", name = "W", descriptor = "I")
	private int anInt2841;

	@OriginalMember(owner = "client!hk", name = "X", descriptor = "Lclient!db;")
	public Class47 aClass47_2;

	@OriginalMember(owner = "client!hk", name = "Y", descriptor = "Lclient!db;")
	public Class47 aClass47_3;

	@OriginalMember(owner = "client!hk", name = "Z", descriptor = "Lclient!ui;")
	private Interface12 anInterface12_2;

	@OriginalMember(owner = "client!hk", name = "bb", descriptor = "Lclient!db;")
	public Class47 aClass47_4;

	@OriginalMember(owner = "client!hk", name = "cb", descriptor = "I")
	private int anInt2842;

	@OriginalMember(owner = "client!hk", name = "db", descriptor = "[Lclient!oj;")
	private Class2_Sub31[] aClass2_Sub31Array1;

	@OriginalMember(owner = "client!hk", name = "N", descriptor = "Lclient!nj;")
	private final Class181 aClass181_11 = new Class181();

	@OriginalMember(owner = "client!hk", name = "H", descriptor = "I")
	private final int anInt2838 = this.anInt2817 - 2;

	@OriginalMember(owner = "client!hk", name = "x", descriptor = "Lclient!na;")
	public final Class75_Sub2 aClass75_Sub2_13;

	@OriginalMember(owner = "client!hk", name = "O", descriptor = "[[I")
	private final int[][] anIntArrayArray67;

	@OriginalMember(owner = "client!hk", name = "o", descriptor = "[[S")
	public final short[][] aShortArrayArray4;

	@OriginalMember(owner = "client!hk", name = "V", descriptor = "[[B")
	private byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!hk", name = "G", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!hk", name = "t", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!hk", name = "U", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!hk", name = "T", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!hk", name = "j", descriptor = "[[[Lclient!oj;")
	private Class2_Sub31[][][] aClass2_Sub31ArrayArrayArray1;

	@OriginalMember(owner = "client!hk", name = "r", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!hk", name = "E", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!hk", name = "i", descriptor = "[[B")
	private final byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!hk", name = "Q", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!hk", name = "v", descriptor = "I")
	public final int anInt2829;

	@OriginalMember(owner = "client!hk", name = "K", descriptor = "I")
	private final int anInt2839;

	@OriginalMember(owner = "client!hk", name = "ab", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!hk", name = "R", descriptor = "Lclient!ru;")
	private Class220 aClass220_18;

	@OriginalMember(owner = "client!hk", name = "J", descriptor = "Lclient!tj;")
	private Class238 aClass238_1;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lclient!na;IIII[[I[[II)V")
	public Class22_Sub2(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.aClass75_Sub2_13 = arg0;
		this.anIntArrayArray67 = arg5;
		this.aShortArrayArray4 = new short[arg3 * arg4][];
		this.aByteArrayArray9 = new byte[arg3 + 1][arg4 + 1];
		this.anIntArrayArrayArray10 = new int[arg3][arg4][];
		this.anIntArrayArrayArray8 = new int[arg3][arg4][];
		this.aFloatArrayArray3 = new float[super.anInt2819 + 1][super.anInt2816 + 1];
		this.aFloatArrayArray2 = new float[super.anInt2819 + 1][super.anInt2816 + 1];
		this.aClass2_Sub31ArrayArrayArray1 = new Class2_Sub31[arg3][arg4][];
		this.anIntArrayArrayArray7 = new int[arg3][arg4][];
		this.anIntArrayArrayArray9 = new int[arg3][arg4][];
		this.aByteArrayArray8 = new byte[arg3][arg4];
		this.anIntArrayArrayArray12 = new int[arg3][arg4][];
		this.anInt2829 = arg2;
		this.anInt2839 = 0x1 << this.anInt2838;
		this.aFloatArrayArray4 = new float[super.anInt2819 + 1][super.anInt2816 + 1];
		for (@Pc(117) int local117 = 1; local117 < super.anInt2816; local117++) {
			for (@Pc(121) int local121 = 1; local121 < super.anInt2819; local121++) {
				@Pc(140) int local140 = arg6[local121 + 1][local117] - arg6[local121 - 1][local117];
				@Pc(157) int local157 = arg6[local121][local117 + 1] - arg6[local121][local117 - 1];
				@Pc(177) float local177 = (float) (1.0D / Math.sqrt((double) (arg7 * 4 * arg7 + local140 * local140 + local157 * local157)));
				this.aFloatArrayArray4[local121][local117] = local177 * (float) local140;
				this.aFloatArrayArray3[local121][local117] = local177 * (float) (-arg7 * 2);
				this.aFloatArrayArray2[local121][local117] = local177 * (float) local157;
			}
		}
		this.aClass220_18 = new Class220(128);
		if ((this.anInt2829 & 0x10) != 0) {
			this.aClass238_1 = new Class238(this.aClass75_Sub2_13, this);
		}
	}

	@OriginalMember(owner = "client!hk", name = "qa", descriptor = "(III)V")
	@Override
	public void qa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray9[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray9[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!hk", name = "ba", descriptor = "(Lclient!i;IIIIZ)V")
	@Override
	public void ba(@OriginalArg(0) Class2_Sub1_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass238_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass75_Sub2_13.anInt4875 >> 8) >> this.aClass75_Sub2_13.anInt4859;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass75_Sub2_13.anInt4891 >> 8) >> this.aClass75_Sub2_13.anInt4859;
			this.aClass238_1.method5430(arg0, local24, local39);
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method2326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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
		this.pa(arg0, arg1, local13, local47, local18, local56, local23, local28, local33, local38, arg13, arg14, arg15, false);
	}

	@OriginalMember(owner = "client!hk", name = "pa", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray11 == null) {
			this.anIntArrayArrayArray11 = new int[super.anInt2819][super.anInt2816][];
		}
		if (arg3 != null && this.anIntArrayArrayArray9 == null) {
			this.anIntArrayArrayArray9 = new int[super.anInt2819][super.anInt2816][];
		}
		this.anIntArrayArrayArray8[arg0][arg1] = arg2;
		this.anIntArrayArrayArray7[arg0][arg1] = arg4;
		this.anIntArrayArrayArray12[arg0][arg1] = arg6;
		this.anIntArrayArrayArray10[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray11 != null) {
			this.anIntArrayArrayArray11[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray9 != null) {
			this.anIntArrayArrayArray9[arg0][arg1] = arg3;
		}
		@Pc(88) Class2_Sub31[] local88 = this.aClass2_Sub31ArrayArrayArray1[arg0][arg1] = new Class2_Sub31[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48 | (long) (arg9[local90] << 14) | (long) arg8[local90];
			@Pc(125) Class2 local125;
			for (local125 = this.aClass220_18.method5099(local119); local125 != null; local125 = this.aClass220_18.method5101()) {
				@Pc(130) Class2_Sub31 local130 = (Class2_Sub31) local125;
				if (arg8[local90] == local130.anInt5306 && local130.aFloat76 == (float) arg9[local90] && local130.anInt5302 == arg10 && arg11 == local130.anInt5305 && local130.anInt5297 == arg12) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class2_Sub31(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass220_18.method5104(local88[local90], local119);
			} else {
				local88[local90] = (Class2_Sub31) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray8[arg0][arg1] = (byte) (this.aByteArrayArray8[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt2841) {
			this.anInt2841 = arg6.length;
		}
		this.anInt2842 += arg6.length;
	}

	@OriginalMember(owner = "client!hk", name = "ua", descriptor = "(II)I")
	@Override
	public int ua(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray67[arg0][arg1];
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method2328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method2330(arg1, arg2, arg3, arg4, arg0);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method2325(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt2842 <= 0) {
			return;
		}
		this.aClass75_Sub2_13.method3865();
		this.aClass75_Sub2_13.method3867(false);
		this.aClass75_Sub2_13.method3808(false);
		this.aClass75_Sub2_13.method3876(false);
		this.aClass75_Sub2_13.method3875(false);
		this.aClass75_Sub2_13.method3870(0);
		this.aClass75_Sub2_13.method3857(-2);
		this.aClass75_Sub2_13.method3844(null);
		Static354.aFloatArray15[9] = 0.0F;
		Static354.aFloatArray15[8] = 0.0F;
		Static354.aFloatArray15[11] = 0.0F;
		Static354.aFloatArray15[15] = 1.0F;
		Static354.aFloatArray15[1] = 0.0F;
		Static354.aFloatArray15[5] = (float) 1024 / ((float) super.anInt2818 * 128.0F * (float) this.aClass75_Sub2_13.anInt4822);
		Static354.aFloatArray15[3] = 0.0F;
		Static354.aFloatArray15[10] = 0.0F;
		Static354.aFloatArray15[4] = 0.0F;
		Static354.aFloatArray15[0] = (float) 1024 / ((float) super.anInt2818 * 128.0F * (float) this.aClass75_Sub2_13.anInt4760);
		Static354.aFloatArray15[6] = 0.0F;
		Static354.aFloatArray15[7] = 0.0F;
		Static354.aFloatArray15[12] = -1.0F - ((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass75_Sub2_13.anInt4760;
		Static354.aFloatArray15[2] = 0.0F;
		Static354.aFloatArray15[13] = 1.0F - ((float) (arg3 * 1024) / 128.0F + (float) 0) / (float) this.aClass75_Sub2_13.anInt4822;
		Static354.aFloatArray15[14] = 0.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static354.aFloatArray15, 0);
		Static354.aFloatArray15[0] = 1.0F;
		Static354.aFloatArray15[8] = 0.0F;
		Static354.aFloatArray15[5] = 0.0F;
		Static354.aFloatArray15[4] = 0.0F;
		Static354.aFloatArray15[11] = 0.0F;
		Static354.aFloatArray15[7] = 0.0F;
		Static354.aFloatArray15[3] = 0.0F;
		Static354.aFloatArray15[9] = 1.0F;
		Static354.aFloatArray15[13] = 0.0F;
		Static354.aFloatArray15[6] = 1.0F;
		Static354.aFloatArray15[12] = 0.0F;
		Static354.aFloatArray15[2] = 0.0F;
		Static354.aFloatArray15[15] = 1.0F;
		Static354.aFloatArray15[10] = 0.0F;
		Static354.aFloatArray15[1] = 0.0F;
		Static354.aFloatArray15[14] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static354.aFloatArray15, 0);
		if ((this.anInt2829 & 0x7) == 0) {
			this.aClass75_Sub2_13.method3808(false);
		} else {
			this.aClass75_Sub2_13.method3808(true);
			this.aClass75_Sub2_13.method3836();
		}
		this.aClass75_Sub2_13.method3852(this.aClass47_1, this.aClass47_4, this.aClass47_2, this.aClass47_3);
		if (this.anInt2833 * 2 > this.aClass75_Sub2_13.aClass2_Sub17_Sub2_1.aByteArray94.length) {
			this.aClass75_Sub2_13.aClass2_Sub17_Sub2_1 = new Class2_Sub17_Sub2(this.anInt2833 * 2);
		} else {
			this.aClass75_Sub2_13.aClass2_Sub17_Sub2_1.anInt7523 = 0;
		}
		@Pc(314) int local314 = 0;
		@Pc(318) Class2_Sub17_Sub2 local318 = this.aClass75_Sub2_13.aClass2_Sub17_Sub2_1;
		@Pc(324) int local324;
		@Pc(333) int local333;
		@Pc(335) int local335;
		@Pc(353) short[] local353;
		@Pc(357) int local357;
		if (this.aClass75_Sub2_13.aBoolean349) {
			for (local324 = arg1; local324 < arg3; local324++) {
				local333 = super.anInt2819 * local324 + arg0;
				for (local335 = arg0; local335 < arg2; local335++) {
					if (arg4[local335 - arg0][local324 - arg1]) {
						local353 = this.aShortArrayArray4[local333];
						if (local353 != null) {
							for (local357 = 0; local357 < local353.length; local357++) {
								local318.method6130(local353[local357] & 0xFFFF);
								local314++;
							}
						}
					}
					local333++;
				}
			}
		} else {
			for (local324 = arg1; local324 < arg3; local324++) {
				local333 = arg0 + super.anInt2819 * local324;
				for (local335 = arg0; local335 < arg2; local335++) {
					if (arg4[local335 - arg0][local324 - arg1]) {
						local353 = this.aShortArrayArray4[local333];
						if (local353 != null) {
							for (local357 = 0; local357 < local353.length; local357++) {
								local314++;
								local318.method6160(local353[local357] & 0xFFFF);
							}
						}
					}
					local333++;
				}
			}
		}
		if (local314 > 0) {
			@Pc(473) Class170_Sub2 local473 = new Class170_Sub2(this.aClass75_Sub2_13, 5123, local318.aByteArray94, local318.anInt7523);
			this.aClass75_Sub2_13.method3841(local473, 0, local314);
		}
	}

	@OriginalMember(owner = "client!hk", name = "ca", descriptor = "(II)I")
	@Override
	public int ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 >> super.anInt2817;
		@Pc(13) int local13 = arg1 >> super.anInt2817;
		if (local8 < 0 || local13 < 0 || super.anInt2819 - 1 < local8 || super.anInt2816 - 1 < local13) {
			return 0;
		}
		@Pc(45) int local45 = super.anInt2818 - 1 & arg0;
		@Pc(52) int local52 = super.anInt2818 - 1 & arg1;
		@Pc(79) int local79 = local45 * this.anIntArrayArray67[local8 + 1][local13] + this.anIntArrayArray67[local8][local13] * (super.anInt2818 - local45) >> super.anInt2817;
		@Pc(110) int local110 = (super.anInt2818 - local45) * this.anIntArrayArray67[local8][local13 - -1] + local45 * this.anIntArrayArray67[local8 + 1][local13 + 1] >> super.anInt2817;
		return local110 * local52 + local79 * (super.anInt2818 - local52) >> super.anInt2817;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(II[[ZIZIB)V")
	private void method2330(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[][] arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		if (this.aClass2_Sub31Array1 == null) {
			return;
		}
		@Pc(8) float local8 = this.aClass75_Sub2_13.aFloat39;
		@Pc(12) float local12 = this.aClass75_Sub2_13.aFloat43;
		@Pc(18) int local18 = arg1 + arg1 + 1;
		@Pc(22) int local22 = local18 * local18;
		if (this.aClass75_Sub2_13.anIntArray404.length < local22) {
			this.aClass75_Sub2_13.anIntArray404 = new int[local22];
		}
		if (this.anInt2833 * 2 > this.aClass75_Sub2_13.aClass2_Sub17_Sub2_1.aByteArray94.length) {
			this.aClass75_Sub2_13.aClass2_Sub17_Sub2_1 = new Class2_Sub17_Sub2(this.anInt2833 * 2);
		}
		@Pc(58) int local58 = arg4 - arg1;
		@Pc(60) int local60 = local58;
		if (local58 < 0) {
			local58 = 0;
		}
		@Pc(72) int local72 = arg0 - arg1;
		@Pc(74) int local74 = local72;
		if (local72 < 0) {
			local72 = 0;
		}
		@Pc(86) int local86 = arg4 + arg1;
		if (local86 > super.anInt2819 - 1) {
			local86 = super.anInt2819 - 1;
		}
		@Pc(106) int local106 = arg0 + arg1;
		if (super.anInt2816 - 1 < local106) {
			local106 = super.anInt2816 - 1;
		}
		@Pc(119) int local119 = 0;
		@Pc(123) int[] local123 = this.aClass75_Sub2_13.anIntArray404;
		@Pc(136) int local136;
		for (@Pc(125) int local125 = local58; local125 <= local86; local125++) {
			@Pc(134) boolean[] local134 = arg2[local125 - local60];
			for (local136 = local72; local136 <= local106; local136++) {
				if (local134[local136 - local74]) {
					local123[local119++] = local125 + local136 * super.anInt2819;
				}
			}
		}
		this.aClass75_Sub2_13.method3863();
		this.aClass75_Sub2_13.method3808((this.anInt2829 & 0x7) != 0);
		for (@Pc(197) int local197 = 0; local197 < this.aClass2_Sub31Array1.length; local197++) {
			this.aClass2_Sub31Array1[local197].method4224(local119, local123);
		}
		if (!this.aClass181_11.method3971()) {
			local136 = this.aClass75_Sub2_13.anInt4869;
			@Pc(226) int local226 = this.aClass75_Sub2_13.anInt4885;
			this.aClass75_Sub2_13.Q(0, local226, this.aClass75_Sub2_13.anInt4886);
			this.aClass75_Sub2_13.da(local12, local8 - 4.0F);
			this.aClass75_Sub2_13.method3808(false);
			this.aClass75_Sub2_13.method3875(false);
			this.aClass75_Sub2_13.method3870(128);
			this.aClass75_Sub2_13.method3857(-2);
			this.aClass75_Sub2_13.method3844(this.aClass75_Sub2_13.aClass64_Sub4_4);
			this.aClass75_Sub2_13.method3872(7681, 8448);
			this.aClass75_Sub2_13.method3802(0, 34166, 770);
			this.aClass75_Sub2_13.method3843(0, 34167);
			for (@Pc(293) Class2 local293 = this.aClass181_11.method3972(); local293 != null; local293 = this.aClass181_11.method3975()) {
				@Pc(298) Class2_Sub40 local298 = (Class2_Sub40) local293;
				local298.method5615(arg0, arg2, arg4, arg1);
			}
			this.aClass75_Sub2_13.method3802(0, 5890, 768);
			this.aClass75_Sub2_13.method3843(0, 5890);
			this.aClass75_Sub2_13.method3844(null);
			this.aClass75_Sub2_13.Q(local136, local226, this.aClass75_Sub2_13.anInt4886);
		}
		if (this.aClass238_1 != null) {
			this.aClass75_Sub2_13.da(local12, local8 - 8.0F);
			this.aClass75_Sub2_13.method3863();
			this.aClass75_Sub2_13.method3852(null, this.aClass47_4, this.aClass47_2, null);
			this.aClass238_1.method5429(arg0, arg3, arg1, arg4, arg2);
		}
		this.aClass75_Sub2_13.da(local12, local8);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!as;[I)V")
	@Override
	public void method2321(@OriginalArg(0) Class2_Sub4 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass181_11.method3973(new Class2_Sub40(this.aClass75_Sub2_13, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!rr;III)V")
	private void method2331(@OriginalArg(0) Class2_Sub1_Sub5_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray8[arg1][arg2];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray7[arg1][arg2];
		@Pc(22) int local22 = local12.length;
		if (local22 > this.aClass75_Sub2_13.anIntArray406.length) {
			this.aClass75_Sub2_13.anIntArray405 = new int[local22];
			this.aClass75_Sub2_13.anIntArray406 = new int[local22];
		}
		@Pc(46) int[] local46 = this.aClass75_Sub2_13.anIntArray406;
		@Pc(50) int[] local50 = this.aClass75_Sub2_13.anIntArray405;
		for (@Pc(58) int local58 = 0; local58 < local22; local58++) {
			local46[local58] = (local12[local58] & 0xFF) >> this.aClass75_Sub2_13.anInt4859;
			local50[local58] = (local19[local58] & 0xFF) >> this.aClass75_Sub2_13.anInt4859;
		}
		@Pc(90) int local90 = 0;
		while (local90 < local22) {
			@Pc(96) int local96 = local46[local90];
			@Pc(101) int local101 = local50[local90++];
			@Pc(105) int local105 = local46[local90];
			@Pc(110) int local110 = local50[local90++];
			@Pc(114) int local114 = local46[local90];
			@Pc(119) int local119 = local50[local90++];
			if ((local96 - local105) * (local110 - local119) - (local114 - local105) * (local110 + -local101) > 0) {
				arg0.method5044(local101, local114, local119, local105, local96, local110);
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!i;IIIIZ)Z")
	@Override
	public boolean method2323(@OriginalArg(0) Class2_Sub1_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass238_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(24) int local24 = arg1 - (this.aClass75_Sub2_13.anInt4875 * arg2 >> 8) >> this.aClass75_Sub2_13.anInt4859;
			@Pc(39) int local39 = arg3 - (this.aClass75_Sub2_13.anInt4891 * arg2 >> 8) >> this.aClass75_Sub2_13.anInt4859;
			return this.aClass238_1.method5431(local39, local24, arg0);
		}
	}

	@OriginalMember(owner = "client!hk", name = "OA", descriptor = "(IILclient!i;)Lclient!i;")
	@Override
	public Class2_Sub1_Sub5 OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub1_Sub5 arg2) {
		if ((this.aByteArrayArray8[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt2818 >> this.aClass75_Sub2_13.anInt4859;
		@Pc(27) Class2_Sub1_Sub5_Sub1 local27 = (Class2_Sub1_Sub5_Sub1) arg2;
		@Pc(43) Class2_Sub1_Sub5_Sub1 local43;
		if (local27 != null && local27.method5041(local24, local24)) {
			local43 = local27;
			local27.method5042();
		} else {
			local43 = new Class2_Sub1_Sub5_Sub1(this.aClass75_Sub2_13, local24, local24);
		}
		local43.method5043(0, local24, local24, 0);
		this.method2331(local43, arg0, arg1);
		return local43;
	}

	@OriginalMember(owner = "client!hk", name = "H", descriptor = "(Lclient!i;IIIIZ)V")
	@Override
	public void H(@OriginalArg(0) Class2_Sub1_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass238_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass75_Sub2_13.anInt4875 >> 8) >> this.aClass75_Sub2_13.anInt4859;
			@Pc(39) int local39 = arg3 - (this.aClass75_Sub2_13.anInt4891 * arg2 >> 8) >> this.aClass75_Sub2_13.anInt4859;
			this.aClass238_1.method5425(arg0, local39, local24);
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)V")
	@Override
	public void method2327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!hk", name = "aa", descriptor = "()V")
	@Override
	public void aa() {
		if (this.anInt2842 <= 0) {
			this.aClass238_1 = null;
		} else {
			@Pc(23) byte[][] local23 = new byte[super.anInt2819 + 1][super.anInt2816 + 1];
			@Pc(29) int local29;
			for (@Pc(25) int local25 = 1; super.anInt2819 > local25; local25++) {
				for (local29 = 1; super.anInt2816 > local29; local29++) {
					local23[local25][local29] = (byte) ((this.aByteArrayArray9[local25][local29] >> 1) + (this.aByteArrayArray9[local25][local29 - 1] >> 2) + (this.aByteArrayArray9[local25 - 1][local29] >> 2) + (this.aByteArrayArray9[local25 + 1][local29] >> 3) + (this.aByteArrayArray9[local25][local29 - -1] >> 3));
				}
			}
			this.aClass2_Sub31Array1 = new Class2_Sub31[this.aClass220_18.method5103()];
			this.aClass220_18.method5097(this.aClass2_Sub31Array1);
			for (local29 = 0; local29 < this.aClass2_Sub31Array1.length; local29++) {
				this.aClass2_Sub31Array1[local29].method4226(this.anInt2842);
			}
			@Pc(137) int local137 = 24;
			if (this.anIntArrayArrayArray11 != null) {
				local137 += 4;
			}
			if ((this.anInt2829 & 0x7) != 0) {
				local137 += 12;
			}
			@Pc(156) NativeBuffer local156 = this.aClass75_Sub2_13.aNativeHeap2.a(local137 * this.anInt2842);
			@Pc(161) NativeStream local161 = new NativeStream(local156);
			@Pc(165) Class2_Sub31[] local165 = new Class2_Sub31[this.anInt2842];
			@Pc(172) int local172 = Static14.method326(this.anInt2842 / 4);
			if (local172 < 1) {
				local172 = 1;
			}
			@Pc(182) Class220 local182 = new Class220(local172);
			@Pc(186) Class2_Sub31[] local186 = new Class2_Sub31[this.anInt2841];
			@Pc(192) int local192;
			for (@Pc(188) int local188 = 0; super.anInt2819 > local188; local188++) {
				for (local192 = 0; local192 < super.anInt2816; local192++) {
					if (this.anIntArrayArrayArray12[local188][local192] != null) {
						@Pc(208) Class2_Sub31[] local208 = this.aClass2_Sub31ArrayArrayArray1[local188][local192];
						@Pc(215) int[] local215 = this.anIntArrayArrayArray8[local188][local192];
						@Pc(222) int[] local222 = this.anIntArrayArrayArray7[local188][local192];
						@Pc(229) int[] local229 = this.anIntArrayArrayArray10[local188][local192];
						@Pc(236) int[] local236 = this.anIntArrayArrayArray12[local188][local192];
						@Pc(248) int[] local248 = this.anIntArrayArrayArray9 == null ? null : this.anIntArrayArrayArray9[local188][local192];
						@Pc(260) int[] local260 = this.anIntArrayArrayArray11 == null ? null : this.anIntArrayArrayArray11[local188][local192];
						if (local229 == null) {
							local229 = local236;
						}
						@Pc(271) float local271 = this.aFloatArrayArray4[local188][local192];
						@Pc(278) float local278 = this.aFloatArrayArray3[local188][local192];
						@Pc(285) float local285 = this.aFloatArrayArray2[local188][local192];
						@Pc(294) float local294 = this.aFloatArrayArray4[local188][local192 + 1];
						@Pc(303) float local303 = this.aFloatArrayArray3[local188][local192 + 1];
						@Pc(312) float local312 = this.aFloatArrayArray2[local188][local192 + 1];
						@Pc(323) float local323 = this.aFloatArrayArray4[local188 + 1][local192 + 1];
						@Pc(334) float local334 = this.aFloatArrayArray3[local188 + 1][local192 + 1];
						@Pc(345) float local345 = this.aFloatArrayArray2[local188 + 1][local192 + 1];
						@Pc(354) float local354 = this.aFloatArrayArray4[local188 + 1][local192];
						@Pc(363) float local363 = this.aFloatArrayArray3[local188 + 1][local192];
						@Pc(372) float local372 = this.aFloatArrayArray2[local188 + 1][local192];
						@Pc(380) int local380 = local23[local188][local192] & 0xFF;
						@Pc(390) int local390 = local23[local188][local192 + 1] & 0xFF;
						@Pc(402) int local402 = local23[local188 + 1][local192 + 1] & 0xFF;
						@Pc(412) int local412 = local23[local188 + 1][local192] & 0xFF;
						@Pc(414) int local414 = 0;
						@Pc(424) int local424;
						label335: for (@Pc(416) int local416 = 0; local416 < local236.length; local416++) {
							@Pc(422) Class2_Sub31 local422 = local208[local416];
							for (local424 = 0; local424 < local414; local424++) {
								if (local186[local424] == local422) {
									continue label335;
								}
							}
							local186[local414++] = local422;
						}
						@Pc(465) short[] local465 = this.aShortArrayArray4[local188 + super.anInt2819 * local192] = new short[local236.length];
						for (local424 = 0; local424 < local236.length; local424++) {
							@Pc(478) int local478 = (local188 << super.anInt2817) + local215[local424];
							@Pc(488) int local488 = (local192 << super.anInt2817) + local222[local424];
							@Pc(493) int local493 = local478 >> this.anInt2838;
							@Pc(498) int local498 = local488 >> this.anInt2838;
							@Pc(502) int local502 = local236[local424];
							@Pc(506) int local506 = local229[local424];
							@Pc(514) int local514 = local248 == null ? 0 : local248[local424];
							@Pc(532) long local532 = (long) local498 | (long) local506 << 48 | (long) local502 << 32 | (long) (local493 << 16);
							@Pc(536) int local536 = local215[local424];
							@Pc(540) int local540 = local222[local424];
							@Pc(542) byte local542 = 74;
							@Pc(544) int local544 = 0;
							@Pc(546) float local546 = 1.0F;
							@Pc(645) float local645;
							@Pc(653) float local653;
							@Pc(669) float local669;
							@Pc(610) float local610;
							@Pc(705) int local705;
							if (local536 == 0 && local540 == 0) {
								local705 = local542 - local380;
								local669 = local285;
								local653 = local278;
								local645 = local271;
							} else if (local536 == 0 && local540 == super.anInt2818) {
								local705 = local542 - local390;
								local653 = local303;
								local645 = local294;
								local669 = local312;
							} else if (local536 == super.anInt2818 && local540 == super.anInt2818) {
								local705 = local542 - local402;
								local669 = local345;
								local645 = local323;
								local653 = local334;
							} else if (super.anInt2818 == local536 && local540 == 0) {
								local669 = local372;
								local653 = local363;
								local705 = local542 - local412;
								local645 = local354;
							} else {
								@Pc(587) float local587 = (float) local536 / (float) super.anInt2818;
								@Pc(594) float local594 = (float) local540 / (float) super.anInt2818;
								@Pc(602) float local602 = local587 * (local354 - local271) + local271;
								local610 = local587 * (local363 - local278) + local278;
								@Pc(618) float local618 = local285 + (local372 - local285) * local587;
								@Pc(627) float local627 = (local323 - local294) * local587 + local294;
								@Pc(636) float local636 = local303 + local587 * (local334 - local303);
								local645 = local602 + (local627 - local602) * local594;
								local653 = local610 + local594 * (local636 - local610);
								@Pc(661) float local661 = (local345 - local312) * local587 + local312;
								local669 = local594 * (local661 - local618) + local618;
								@Pc(680) int local680 = (local536 * (local412 - local380) >> super.anInt2817) + local380;
								@Pc(691) int local691 = ((local402 - local390) * local536 >> super.anInt2817) + local390;
								local705 = local542 - local680 - ((local691 - local680) * local540 >> super.anInt2817);
							}
							if (local502 != -1) {
								@Pc(765) int local765 = local705 * (local502 & 0x7F) >> 7;
								if (local765 < 2) {
									local765 = 2;
								} else if (local765 > 126) {
									local765 = 126;
								}
								local544 = Static64.anIntArray85[local765 | local502 & 0xFF80];
								if ((this.anInt2829 & 0x7) == 0) {
									local546 = this.aClass75_Sub2_13.aFloatArray9[1] * local653 + local645 * this.aClass75_Sub2_13.aFloatArray9[0] + this.aClass75_Sub2_13.aFloatArray9[2] * local669;
									local546 = this.aClass75_Sub2_13.aFloat57 + local546 * (local546 > 0.0F ? this.aClass75_Sub2_13.aFloat55 : this.aClass75_Sub2_13.aFloat47);
								}
							}
							@Pc(841) Class2 local841 = null;
							if ((local478 & this.anInt2839 - 1) == 0 && (local488 & this.anInt2839 - 1) == 0) {
								local841 = local182.method5099(local532);
							}
							@Pc(877) int local877;
							@Pc(935) int local935;
							if (local841 == null) {
								if (local506 == local502) {
									local935 = local544;
								} else {
									@Pc(913) int local913 = local705 * (local506 & 0x7F) >> 7;
									if (local913 < 2) {
										local913 = 2;
									} else if (local913 > 126) {
										local913 = 126;
									}
									local935 = Static64.anIntArray85[local506 & 0xFF80 | local913];
									if ((this.anInt2829 & 0x7) == 0) {
										local610 = local669 * this.aClass75_Sub2_13.aFloatArray9[2] + local645 * this.aClass75_Sub2_13.aFloatArray9[0] + this.aClass75_Sub2_13.aFloatArray9[1] * local653;
										local610 = (local546 > 0.0F ? this.aClass75_Sub2_13.aFloat55 : this.aClass75_Sub2_13.aFloat47) * local546 + this.aClass75_Sub2_13.aFloat57;
										@Pc(988) int local988 = local935 >> 16 & 0xFF;
										@Pc(994) int local994 = local935 >> 8 & 0xFF;
										local988 = (int) ((float) local988 * local610);
										@Pc(1004) int local1004 = local935 & 0xFF;
										local994 = (int) ((float) local994 * local610);
										if (local988 < 0) {
											local988 = 0;
										} else if (local988 > 255) {
											local988 = 255;
										}
										local1004 = (int) ((float) local1004 * local610);
										if (local994 < 0) {
											local994 = 0;
										} else if (local994 > 255) {
											local994 = 255;
										}
										if (local1004 < 0) {
											local1004 = 0;
										} else if (local1004 > 255) {
											local1004 = 255;
										}
										local935 = local1004 | local988 << 16 | local994 << 8;
									}
								}
								if (this.aClass75_Sub2_13.aBoolean349) {
									local161.a((float) local478);
									local161.a((float) (local514 + this.ca(local478, local488)));
									local161.a((float) local488);
									local161.b((byte) (local935 >> 16));
									local161.b((byte) (local935 >> 8));
									local161.b((byte) local935);
									local161.b(-1);
									local161.a((float) local478);
									local161.a((float) local488);
									if (this.anIntArrayArrayArray11 != null) {
										local161.a((float) (local260 == null ? 0 : local260[local424] - 1));
									}
									if ((this.anInt2829 & 0x7) != 0) {
										local161.a(local645);
										local161.a(local653);
										local161.a(local669);
									}
								} else {
									local161.b((float) local478);
									local161.b((float) (this.ca(local478, local488) + local514));
									local161.b((float) local488);
									local161.b((byte) (local935 >> 16));
									local161.b((byte) (local935 >> 8));
									local161.b((byte) local935);
									local161.b(-1);
									local161.b((float) local478);
									local161.b((float) local488);
									if (this.anIntArrayArrayArray11 != null) {
										local161.b((float) (local260 == null ? 0 : local260[local424] - 1));
									}
									if ((this.anInt2829 & 0x7) != 0) {
										local161.b(local645);
										local161.b(local653);
										local161.b(local669);
									}
								}
								local877 = this.anInt2835++;
								local465[local424] = (short) local877;
								if (local502 != -1) {
									local165[local877] = local208[local424];
								}
								local182.method5104(new Class2_Sub19(local465[local424]), local532);
							} else {
								local465[local424] = ((Class2_Sub19) local841).aShort37;
								local877 = local465[local424] & 0xFFFF;
								if (local502 != -1 && local208[local424].aLong401 < local165[local877].aLong401) {
									local165[local877] = local208[local424];
								}
							}
							for (local935 = 0; local935 < local414; local935++) {
								local186[local935].method4220(local877, local546, local544, local705);
							}
							this.anInt2833++;
						}
					}
				}
			}
			for (local192 = 0; local192 < this.anInt2835; local192++) {
				@Pc(1313) Class2_Sub31 local1313 = local165[local192];
				if (local1313 != null) {
					local1313.method4227(local192);
				}
			}
			@Pc(1350) int local1350;
			for (@Pc(1330) int local1330 = 0; local1330 < super.anInt2819; local1330++) {
				for (@Pc(1334) int local1334 = 0; super.anInt2816 > local1334; local1334++) {
					@Pc(1346) short[] local1346 = this.aShortArrayArray4[local1330 + local1334 * super.anInt2819];
					if (local1346 != null) {
						local1350 = 0;
						@Pc(1352) int local1352 = 0;
						while (local1352 < local1346.length) {
							@Pc(1361) int local1361 = local1346[local1352++] & 0xFFFF;
							@Pc(1368) int local1368 = local1346[local1352++] & 0xFFFF;
							@Pc(1375) int local1375 = local1346[local1352++] & 0xFFFF;
							@Pc(1379) Class2_Sub31 local1379 = local165[local1361];
							@Pc(1383) Class2_Sub31 local1383 = local165[local1368];
							@Pc(1387) Class2_Sub31 local1387 = local165[local1375];
							@Pc(1389) Class2_Sub31 local1389 = null;
							if (local1379 != null) {
								local1379.method4219(local1350, local1330, local1334);
								local1389 = local1379;
							}
							if (local1383 != null) {
								local1383.method4219(local1350, local1330, local1334);
								if (local1389 == null || local1389.aLong401 > local1383.aLong401) {
									local1389 = local1383;
								}
							}
							if (local1387 != null) {
								local1387.method4219(local1350, local1330, local1334);
								if (local1389 == null || local1387.aLong401 < local1389.aLong401) {
									local1389 = local1387;
								}
							}
							if (local1389 != null) {
								if (local1379 != null) {
									local1389.method4227(local1361);
								}
								if (local1383 != null) {
									local1389.method4227(local1368);
								}
								if (local1387 != null) {
									local1389.method4227(local1375);
								}
								local1389.method4219(local1350, local1330, local1334);
							}
							local1350++;
						}
					}
				}
			}
			local161.b();
			this.anInterface12_2 = this.aClass75_Sub2_13.method3806(local161.c(), local156, local137);
			this.aClass47_4 = new Class47(this.anInterface12_2, 5126, 3, 0);
			this.aClass47_1 = new Class47(this.anInterface12_2, 5121, 4, 12);
			@Pc(1532) byte local1532;
			if (this.anIntArrayArrayArray11 == null) {
				this.aClass47_2 = new Class47(this.anInterface12_2, 5126, 2, 16);
				local1532 = 24;
			} else {
				this.aClass47_2 = new Class47(this.anInterface12_2, 5126, 3, 16);
				local1532 = 28;
			}
			if ((this.anInt2829 & 0x7) != 0) {
				this.aClass47_3 = new Class47(this.anInterface12_2, 5126, 3, local1532);
			}
			@Pc(1566) long[] local1566 = new long[this.aClass2_Sub31Array1.length];
			for (local1350 = 0; local1350 < this.aClass2_Sub31Array1.length; local1350++) {
				@Pc(1575) Class2_Sub31 local1575 = this.aClass2_Sub31Array1[local1350];
				local1566[local1350] = local1575.aLong401;
				local1575.method4222(this.anInt2835);
			}
			Static239.method3260(local1566, this.aClass2_Sub31Array1);
			if (this.aClass238_1 != null) {
				this.aClass238_1.method5426();
			}
		}
		this.anIntArrayArrayArray8 = this.anIntArrayArrayArray7 = null;
		this.aByteArrayArray9 = null;
		this.anIntArrayArrayArray9 = null;
		this.anIntArrayArrayArray10 = null;
		this.aClass2_Sub31ArrayArrayArray1 = null;
		this.aFloatArrayArray4 = this.aFloatArrayArray3 = this.aFloatArrayArray2 = null;
		this.aClass220_18 = null;
		this.anIntArrayArrayArray11 = null;
		this.anIntArrayArrayArray12 = null;
	}
}
