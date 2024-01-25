import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oq")
public final class Class65_Sub2 extends Class65 {

	@OriginalMember(owner = "client!oq", name = "r", descriptor = "I")
	private int anInt5270;

	@OriginalMember(owner = "client!oq", name = "z", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!oq", name = "K", descriptor = "I")
	private int anInt5280;

	@OriginalMember(owner = "client!oq", name = "W", descriptor = "Lclient!pc;")
	private Class177 aClass177_13;

	@OriginalMember(owner = "client!oq", name = "X", descriptor = "Lclient!pc;")
	public Class177 aClass177_14;

	@OriginalMember(owner = "client!oq", name = "Y", descriptor = "Lclient!vd;")
	private Interface11 anInterface11_6;

	@OriginalMember(owner = "client!oq", name = "Z", descriptor = "I")
	private int anInt5287;

	@OriginalMember(owner = "client!oq", name = "ab", descriptor = "Lclient!pc;")
	public Class177 aClass177_15;

	@OriginalMember(owner = "client!oq", name = "fb", descriptor = "I")
	private int anInt5288;

	@OriginalMember(owner = "client!oq", name = "gb", descriptor = "Lclient!pc;")
	public Class177 aClass177_16;

	@OriginalMember(owner = "client!oq", name = "ib", descriptor = "[Lclient!dw;")
	private Class4_Sub16[] aClass4_Sub16Array1;

	@OriginalMember(owner = "client!oq", name = "F", descriptor = "Lclient!pk;")
	private final Class183 aClass183_37 = new Class183();

	@OriginalMember(owner = "client!oq", name = "u", descriptor = "[[I")
	private final int[][] anIntArrayArray44;

	@OriginalMember(owner = "client!oq", name = "D", descriptor = "Lclient!fd;")
	public final Class19_Sub2 aClass19_Sub2_30;

	@OriginalMember(owner = "client!oq", name = "v", descriptor = "I")
	private final int anInt5272;

	@OriginalMember(owner = "client!oq", name = "U", descriptor = "[[S")
	public final short[][] aShortArrayArray9;

	@OriginalMember(owner = "client!oq", name = "H", descriptor = "[[B")
	private final byte[][] aByteArrayArray22;

	@OriginalMember(owner = "client!oq", name = "T", descriptor = "I")
	public final int anInt5285;

	@OriginalMember(owner = "client!oq", name = "y", descriptor = "I")
	private final int anInt5275;

	@OriginalMember(owner = "client!oq", name = "P", descriptor = "[[[Lclient!dw;")
	private Class4_Sub16[][][] aClass4_Sub16ArrayArrayArray1;

	@OriginalMember(owner = "client!oq", name = "t", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!oq", name = "M", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!oq", name = "q", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!oq", name = "I", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!oq", name = "db", descriptor = "[[B")
	private byte[][] aByteArrayArray23;

	@OriginalMember(owner = "client!oq", name = "bb", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!oq", name = "cb", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!oq", name = "hb", descriptor = "[[F")
	private float[][] aFloatArrayArray9;

	@OriginalMember(owner = "client!oq", name = "p", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!oq", name = "eb", descriptor = "Lclient!ib;")
	private Class102 aClass102_27;

	@OriginalMember(owner = "client!oq", name = "E", descriptor = "Lclient!uf;")
	private Class236 aClass236_2;

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(Lclient!fd;IIII[[I[[II)V")
	public Class65_Sub2(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.anIntArrayArray44 = arg5;
		this.aClass19_Sub2_30 = arg0;
		this.anInt5272 = super.anInt5256 - 2;
		this.aShortArrayArray9 = new short[arg3 * arg4][];
		this.aByteArrayArray22 = new byte[arg3][arg4];
		this.anInt5285 = arg2;
		this.anInt5275 = 0x1 << this.anInt5272;
		this.aClass4_Sub16ArrayArrayArray1 = new Class4_Sub16[arg3][arg4][];
		this.anIntArrayArrayArray8 = new int[arg3][arg4][];
		this.anIntArrayArrayArray11 = new int[arg3][arg4][];
		this.anIntArrayArrayArray7 = new int[arg3][arg4][];
		this.anIntArrayArrayArray10 = new int[arg3][arg4][];
		this.aByteArrayArray23 = new byte[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray7 = new float[super.anInt5262 + 1][super.anInt5258 + 1];
		this.aFloatArrayArray8 = new float[super.anInt5262 + 1][super.anInt5258 + 1];
		this.aFloatArrayArray9 = new float[super.anInt5262 + 1][super.anInt5258 + 1];
		this.anIntArrayArrayArray6 = new int[arg3][arg4][];
		for (@Pc(117) int local117 = 1; local117 < super.anInt5258; local117++) {
			for (@Pc(121) int local121 = 1; super.anInt5262 > local121; local121++) {
				@Pc(139) int local139 = arg6[local121 + 1][local117] - arg6[local121 - 1][local117];
				@Pc(156) int local156 = arg6[local121][local117 + 1] - arg6[local121][local117 - 1];
				@Pc(177) float local177 = (float) (1.0D / Math.sqrt((double) (local139 * local139 + arg7 * arg7 * 4 + local156 * local156)));
				this.aFloatArrayArray9[local121][local117] = local177 * (float) local139;
				this.aFloatArrayArray7[local121][local117] = local177 * (float) (-arg7 * 2);
				this.aFloatArrayArray8[local121][local117] = (float) local156 * local177;
			}
		}
		this.aClass102_27 = new Class102(128);
		if ((this.anInt5285 & 0x10) != 0) {
			this.aClass236_2 = new Class236(this.aClass19_Sub2_30, this);
		}
	}

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "(II)V")
	@Override
	public void method4028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!oq", name = "i", descriptor = "(III)V")
	@Override
	public void i(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray23[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray23[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!oq", name = "p", descriptor = "(Lclient!ba;IIIIZ)V")
	@Override
	public void p(@OriginalArg(0) Class4_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass236_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass19_Sub2_30.anInt2289 >> 8) >> this.aClass19_Sub2_30.anInt2275;
			@Pc(39) int local39 = arg3 - (this.aClass19_Sub2_30.anInt2311 * arg2 >> 8) >> this.aClass19_Sub2_30.anInt2275;
			this.aClass236_2.method5194(local39, local24, arg0);
		}
	}

	@OriginalMember(owner = "client!oq", name = "k", descriptor = "(IILclient!ba;)Lclient!ba;")
	@Override
	public Class4_Sub1_Sub4 k(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub1_Sub4 arg2) {
		if ((this.aByteArrayArray22[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt5261 >> this.aClass19_Sub2_30.anInt2275;
		@Pc(27) Class4_Sub1_Sub4_Sub1 local27 = (Class4_Sub1_Sub4_Sub1) arg2;
		@Pc(43) Class4_Sub1_Sub4_Sub1 local43;
		if (local27 != null && local27.method2301(local24, local24)) {
			local43 = local27;
			local27.method2304();
		} else {
			local43 = new Class4_Sub1_Sub4_Sub1(this.aClass19_Sub2_30, local24, local24);
		}
		local43.method2299(0, 0, local24, local24);
		this.method4032(local43, arg0, arg1);
		return local43;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method4025(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt5288 <= 0) {
			return;
		}
		this.aClass19_Sub2_30.method1898();
		this.aClass19_Sub2_30.method1918(false);
		this.aClass19_Sub2_30.method1906(false);
		this.aClass19_Sub2_30.method1951(false);
		this.aClass19_Sub2_30.method1911(false);
		this.aClass19_Sub2_30.method1958(0);
		this.aClass19_Sub2_30.method1957(-2);
		this.aClass19_Sub2_30.method1905(null);
		Static370.aFloatArray28[7] = 0.0F;
		Static370.aFloatArray28[5] = (float) 1024 / ((float) this.aClass19_Sub2_30.anInt2138 * 128.0F * (float) super.anInt5261);
		Static370.aFloatArray28[6] = 0.0F;
		Static370.aFloatArray28[9] = 0.0F;
		Static370.aFloatArray28[1] = 0.0F;
		Static370.aFloatArray28[3] = 0.0F;
		Static370.aFloatArray28[10] = 0.0F;
		Static370.aFloatArray28[15] = 1.0F;
		Static370.aFloatArray28[14] = 0.0F;
		Static370.aFloatArray28[2] = 0.0F;
		Static370.aFloatArray28[0] = (float) 1024 / ((float) this.aClass19_Sub2_30.anInt2240 * 128.0F * (float) super.anInt5261);
		Static370.aFloatArray28[12] = -1.0F - ((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass19_Sub2_30.anInt2240;
		Static370.aFloatArray28[4] = 0.0F;
		Static370.aFloatArray28[8] = 0.0F;
		Static370.aFloatArray28[11] = 0.0F;
		Static370.aFloatArray28[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass19_Sub2_30.anInt2138;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static370.aFloatArray28, 0);
		Static370.aFloatArray28[8] = 0.0F;
		Static370.aFloatArray28[3] = 0.0F;
		Static370.aFloatArray28[12] = 0.0F;
		Static370.aFloatArray28[5] = 0.0F;
		Static370.aFloatArray28[9] = 1.0F;
		Static370.aFloatArray28[0] = 1.0F;
		Static370.aFloatArray28[10] = 0.0F;
		Static370.aFloatArray28[2] = 0.0F;
		Static370.aFloatArray28[1] = 0.0F;
		Static370.aFloatArray28[6] = 1.0F;
		Static370.aFloatArray28[4] = 0.0F;
		Static370.aFloatArray28[13] = 0.0F;
		Static370.aFloatArray28[15] = 1.0F;
		Static370.aFloatArray28[11] = 0.0F;
		Static370.aFloatArray28[14] = 0.0F;
		Static370.aFloatArray28[7] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static370.aFloatArray28, 0);
		if ((this.anInt5285 & 0x7) == 0) {
			this.aClass19_Sub2_30.method1906(false);
		} else {
			this.aClass19_Sub2_30.method1906(true);
			this.aClass19_Sub2_30.method1914();
		}
		this.aClass19_Sub2_30.method1934(this.aClass177_13, this.aClass177_16, this.aClass177_14, this.aClass177_15);
		if (Static383.aClass4_Sub12_7.aByteArray36.length < this.anInt5270 * 2) {
			Static383.aClass4_Sub12_7 = new Class4_Sub12(this.anInt5270 * 2);
		} else {
			Static383.aClass4_Sub12_7.anInt2997 = 0;
		}
		@Pc(305) int local305 = 0;
		@Pc(311) int local311;
		@Pc(321) int local321;
		@Pc(323) int local323;
		@Pc(342) short[] local342;
		@Pc(346) int local346;
		if (this.aClass19_Sub2_30.aBoolean215) {
			for (local311 = arg1; local311 < arg3; local311++) {
				local321 = arg0 + local311 * super.anInt5262;
				for (local323 = arg0; local323 < arg2; local323++) {
					if (arg4[local323 - arg0][local311 - arg1]) {
						local342 = this.aShortArrayArray9[local321];
						if (local342 != null) {
							for (local346 = 0; local346 < local342.length; local346++) {
								Static383.aClass4_Sub12_7.method2524(local342[local346] & 0xFFFF);
								local305++;
							}
						}
					}
					local321++;
				}
			}
		} else {
			for (local311 = arg1; local311 < arg3; local311++) {
				local321 = super.anInt5262 * local311 + arg0;
				for (local323 = arg0; local323 < arg2; local323++) {
					if (arg4[local323 - arg0][local311 - arg1]) {
						local342 = this.aShortArrayArray9[local321];
						if (local342 != null) {
							for (local346 = 0; local346 < local342.length; local346++) {
								local305++;
								Static383.aClass4_Sub12_7.method2541(local342[local346] & 0xFFFF);
							}
						}
					}
					local321++;
				}
			}
		}
		if (local305 > 0) {
			@Pc(470) Class64_Sub1 local470 = new Class64_Sub1(this.aClass19_Sub2_30, 5123, Static383.aClass4_Sub12_7.aByteArray36, Static383.aClass4_Sub12_7.anInt2997);
			this.aClass19_Sub2_30.method1967(0, local305, local470);
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lclient!vp;[I)V")
	@Override
	public void method4024(@OriginalArg(0) Class4_Sub21 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass183_37.method4137(new Class4_Sub24(this.aClass19_Sub2_30, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lclient!ba;IIIIZ)Z")
	@Override
	public boolean method4022(@OriginalArg(0) Class4_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass236_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(24) int local24 = arg1 - (this.aClass19_Sub2_30.anInt2289 * arg2 >> 8) >> this.aClass19_Sub2_30.anInt2275;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass19_Sub2_30.anInt2311 >> 8) >> this.aClass19_Sub2_30.anInt2275;
			return this.aClass236_2.method5190(arg0, local39, local24);
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method4023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "(Lclient!ba;IIIIZ)V")
	@Override
	public void b(@OriginalArg(0) Class4_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass236_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass19_Sub2_30.anInt2289 >> 8) >> this.aClass19_Sub2_30.anInt2275;
			@Pc(39) int local39 = arg3 - (this.aClass19_Sub2_30.anInt2311 * arg2 >> 8) >> this.aClass19_Sub2_30.anInt2275;
			this.aClass236_2.method5195(local39, local24, arg0);
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method4029(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method4034(arg0, arg4, arg3, arg1, arg2);
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lclient!gm;IBI)V")
	private void method4032(@OriginalArg(0) Class4_Sub1_Sub4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray6[arg1][arg2];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray7[arg1][arg2];
		@Pc(22) int local22 = local12.length;
		if (local22 > Static227.anIntArray293.length) {
			Static227.anIntArray293 = new int[local22];
			Static321.anIntArray387 = new int[local22];
		}
		for (@Pc(34) int local34 = 0; local34 < local22; local34++) {
			Static227.anIntArray293[local34] = (local12[local34] & 0xFF) >> this.aClass19_Sub2_30.anInt2275;
			Static321.anIntArray387[local34] = (local19[local34] & 0xFF) >> this.aClass19_Sub2_30.anInt2275;
		}
		@Pc(74) int local74 = 0;
		while (local22 > local74) {
			@Pc(80) int local80 = Static227.anIntArray293[local74];
			@Pc(85) int local85 = Static321.anIntArray387[local74++];
			@Pc(89) int local89 = Static227.anIntArray293[local74];
			@Pc(94) int local94 = Static321.anIntArray387[local74++];
			@Pc(98) int local98 = Static227.anIntArray293[local74];
			@Pc(103) int local103 = Static321.anIntArray387[local74++];
			if (-((local98 - local89) * (-local85 + local94)) + (local94 - local103) * (local80 - local89) > 0) {
				arg0.method2303(local80, local94, local85, local89, local103, local98);
			}
		}
	}

	@OriginalMember(owner = "client!oq", name = "l", descriptor = "(II)I")
	@Override
	public int l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray44[arg0][arg1];
	}

	@OriginalMember(owner = "client!oq", name = "B", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray9 == null) {
			this.anIntArrayArrayArray9 = new int[super.anInt5262][super.anInt5258][];
		}
		if (arg3 != null && this.anIntArrayArrayArray8 == null) {
			this.anIntArrayArrayArray8 = new int[super.anInt5262][super.anInt5258][];
		}
		this.anIntArrayArrayArray6[arg0][arg1] = arg2;
		this.anIntArrayArrayArray7[arg0][arg1] = arg4;
		this.anIntArrayArrayArray11[arg0][arg1] = arg6;
		this.anIntArrayArrayArray10[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray9 != null) {
			this.anIntArrayArrayArray9[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray8 != null) {
			this.anIntArrayArrayArray8[arg0][arg1] = arg3;
		}
		@Pc(88) Class4_Sub16[] local88 = this.aClass4_Sub16ArrayArrayArray1[arg0][arg1] = new Class4_Sub16[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42 | (long) (arg9[local90] << 14) | (long) arg8[local90];
			@Pc(125) Class4 local125;
			for (local125 = this.aClass102_27.method2700(local119); local125 != null; local125 = this.aClass102_27.method2697()) {
				@Pc(130) Class4_Sub16 local130 = (Class4_Sub16) local125;
				if (arg8[local90] == local130.anInt1647 && local130.aFloat46 == (float) arg9[local90] && local130.anInt1641 == arg10 && local130.anInt1640 == arg11 && local130.anInt1645 == arg12) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class4_Sub16(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass102_27.method2703(local119, local88[local90]);
			} else {
				local88[local90] = (Class4_Sub16) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray22[arg0][arg1] = (byte) (this.aByteArrayArray22[arg0][arg1] | 0x1);
		}
		if (this.anInt5287 < arg6.length) {
			this.anInt5287 = arg6.length;
		}
		this.anInt5288 += arg6.length;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(II)I")
	@Override
	public int a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 >> super.anInt5256;
		@Pc(13) int local13 = arg1 >> super.anInt5256;
		if (local8 < 0 || local13 < 0 || super.anInt5262 - 1 < local8 || super.anInt5258 - 1 < local13) {
			return 0;
		}
		@Pc(44) int local44 = super.anInt5261 - 1 & arg0;
		@Pc(51) int local51 = super.anInt5261 - 1 & arg1;
		@Pc(78) int local78 = this.anIntArrayArray44[local8 + 1][local13] * local44 + this.anIntArrayArray44[local8][local13] * (super.anInt5261 - local44) >> super.anInt5256;
		@Pc(110) int local110 = (super.anInt5261 - local44) * this.anIntArrayArray44[local8][local13 + 1] + local44 * this.anIntArrayArray44[local8 + 1][local13 + 1] >> super.anInt5256;
		return local78 * (super.anInt5261 - local51) + local110 * local51 >> super.anInt5256;
	}

	@OriginalMember(owner = "client!oq", name = "ca", descriptor = "()V")
	@Override
	public void ca() {
		if (this.anInt5288 <= 0) {
			this.aClass236_2 = null;
		} else {
			@Pc(23) byte[][] local23 = new byte[super.anInt5262 + 1][super.anInt5258 + 1];
			@Pc(29) int local29;
			for (@Pc(25) int local25 = 1; local25 < super.anInt5262; local25++) {
				for (local29 = 1; super.anInt5258 > local29; local29++) {
					local23[local25][local29] = (byte) ((this.aByteArrayArray23[local25 + 1][local29] >> 3) + (this.aByteArrayArray23[local25 - 1][local29] >> 2) + (this.aByteArrayArray23[local25][local29 - 1] >> 2) + (this.aByteArrayArray23[local25][local29 + 1] >> 3) + (this.aByteArrayArray23[local25][local29] >> 1));
				}
			}
			this.aClass4_Sub16Array1 = new Class4_Sub16[this.aClass102_27.method2698()];
			this.aClass102_27.method2708(this.aClass4_Sub16Array1);
			for (local29 = 0; local29 < this.aClass4_Sub16Array1.length; local29++) {
				this.aClass4_Sub16Array1[local29].method1466(this.anInt5288);
			}
			@Pc(141) int local141 = 24;
			if (this.anIntArrayArrayArray9 != null) {
				local141 += 4;
			}
			if ((this.anInt5285 & 0x7) != 0) {
				local141 += 12;
			}
			@Pc(163) NativeBuffer local163 = this.aClass19_Sub2_30.aNativeHeap2.a(local141 * this.anInt5288);
			@Pc(168) NativeStream local168 = new NativeStream(local163);
			@Pc(172) Class4_Sub16[] local172 = new Class4_Sub16[this.anInt5288];
			@Pc(179) int local179 = Static159.method2696(this.anInt5288 / 4);
			if (local179 < 1) {
				local179 = 1;
			}
			@Pc(189) Class102 local189 = new Class102(local179);
			@Pc(193) Class4_Sub16[] local193 = new Class4_Sub16[this.anInt5287];
			@Pc(199) int local199;
			for (@Pc(195) int local195 = 0; super.anInt5262 > local195; local195++) {
				for (local199 = 0; local199 < super.anInt5258; local199++) {
					if (this.anIntArrayArrayArray11[local195][local199] != null) {
						@Pc(215) Class4_Sub16[] local215 = this.aClass4_Sub16ArrayArrayArray1[local195][local199];
						@Pc(222) int[] local222 = this.anIntArrayArrayArray6[local195][local199];
						@Pc(229) int[] local229 = this.anIntArrayArrayArray7[local195][local199];
						@Pc(236) int[] local236 = this.anIntArrayArrayArray10[local195][local199];
						@Pc(243) int[] local243 = this.anIntArrayArrayArray11[local195][local199];
						@Pc(255) int[] local255 = this.anIntArrayArrayArray8 == null ? null : this.anIntArrayArrayArray8[local195][local199];
						@Pc(267) int[] local267 = this.anIntArrayArrayArray9 == null ? null : this.anIntArrayArrayArray9[local195][local199];
						if (local236 == null) {
							local236 = local243;
						}
						@Pc(278) float local278 = this.aFloatArrayArray9[local195][local199];
						@Pc(285) float local285 = this.aFloatArrayArray7[local195][local199];
						@Pc(292) float local292 = this.aFloatArrayArray8[local195][local199];
						@Pc(301) float local301 = this.aFloatArrayArray9[local195][local199 + 1];
						@Pc(310) float local310 = this.aFloatArrayArray7[local195][local199 + 1];
						@Pc(319) float local319 = this.aFloatArrayArray8[local195][local199 + 1];
						@Pc(330) float local330 = this.aFloatArrayArray9[local195 + 1][local199 + 1];
						@Pc(341) float local341 = this.aFloatArrayArray7[local195 + 1][local199 + 1];
						@Pc(352) float local352 = this.aFloatArrayArray8[local195 + 1][local199 + 1];
						@Pc(361) float local361 = this.aFloatArrayArray9[local195 + 1][local199];
						@Pc(370) float local370 = this.aFloatArrayArray7[local195 + 1][local199];
						@Pc(379) float local379 = this.aFloatArrayArray8[local195 + 1][local199];
						@Pc(387) int local387 = local23[local195][local199] & 0xFF;
						@Pc(397) int local397 = local23[local195][local199 + 1] & 0xFF;
						@Pc(409) int local409 = local23[local195 + 1][local199 + 1] & 0xFF;
						@Pc(419) int local419 = local23[local195 + 1][local199] & 0xFF;
						@Pc(421) int local421 = 0;
						@Pc(431) int local431;
						label335: for (@Pc(423) int local423 = 0; local423 < local243.length; local423++) {
							@Pc(429) Class4_Sub16 local429 = local215[local423];
							for (local431 = 0; local431 < local421; local431++) {
								if (local193[local431] == local429) {
									continue label335;
								}
							}
							local193[local421++] = local429;
						}
						@Pc(473) short[] local473 = this.aShortArrayArray9[local199 * super.anInt5262 + local195] = new short[local243.length];
						for (local431 = 0; local431 < local243.length; local431++) {
							@Pc(487) int local487 = (local195 << super.anInt5256) + local222[local431];
							@Pc(496) int local496 = (local199 << super.anInt5256) + local229[local431];
							@Pc(501) int local501 = local487 >> this.anInt5272;
							@Pc(506) int local506 = local496 >> this.anInt5272;
							@Pc(510) int local510 = local243[local431];
							@Pc(514) int local514 = local236[local431];
							@Pc(522) int local522 = local255 == null ? 0 : local255[local431];
							@Pc(540) long local540 = (long) local506 | (long) local510 << 32 | (long) local514 << 48 | (long) (local501 << 16);
							@Pc(544) int local544 = local222[local431];
							@Pc(548) int local548 = local229[local431];
							@Pc(550) byte local550 = 74;
							@Pc(552) int local552 = 0;
							@Pc(586) float local586;
							@Pc(588) float local588;
							@Pc(590) float local590;
							@Pc(636) float local636;
							@Pc(594) int local594;
							if (local544 == 0 && local548 == 0) {
								local588 = local285;
								local590 = local292;
								local594 = local550 - local387;
								local586 = local278;
							} else if (local544 == 0 && super.anInt5261 == local548) {
								local594 = local550 - local397;
								local586 = local301;
								local588 = local310;
								local590 = local319;
							} else if (local544 == super.anInt5261 && local548 == super.anInt5261) {
								local586 = local330;
								local588 = local341;
								local590 = local352;
								local594 = local550 - local409;
							} else if (super.anInt5261 == local544 && local548 == 0) {
								local590 = local379;
								local588 = local370;
								local586 = local361;
								local594 = local550 - local419;
							} else {
								@Pc(612) float local612 = (float) local544 / (float) super.anInt5261;
								@Pc(619) float local619 = (float) local548 / (float) super.anInt5261;
								@Pc(627) float local627 = local278 + local612 * (local361 - local278);
								local636 = local285 + local612 * (local370 - local285);
								@Pc(645) float local645 = local292 + (local379 - local292) * local612;
								@Pc(653) float local653 = (local330 - local301) * local612 + local301;
								@Pc(661) float local661 = local310 + local612 * (local341 - local310);
								local588 = local636 + local619 * (local661 - local636);
								@Pc(679) float local679 = (local352 - local319) * local612 + local319;
								local586 = (local653 - local627) * local619 + local627;
								local590 = local645 + local619 * (local679 - local645);
								@Pc(709) int local709 = local387 + (local544 * (local419 - local387) >> super.anInt5256);
								@Pc(721) int local721 = (local544 * (local409 - local397) >> super.anInt5256) + local397;
								local594 = local550 - local709 - ((local721 - local709) * local548 >> super.anInt5256);
							}
							@Pc(774) float local774 = 1.0F;
							if (local510 != -1) {
								@Pc(785) int local785 = (local510 & 0x7F) * local594 >> 7;
								if (local785 < 2) {
									local785 = 2;
								} else if (local785 > 126) {
									local785 = 126;
								}
								local552 = Static72.anIntArray115[local785 | local510 & 0xFF80];
								if ((this.anInt5285 & 0x7) == 0) {
									local774 = this.aClass19_Sub2_30.aFloatArray19[1] * local588 + local586 * this.aClass19_Sub2_30.aFloatArray19[0] + local590 * this.aClass19_Sub2_30.aFloatArray19[2];
									local774 = local774 * (local774 > 0.0F ? this.aClass19_Sub2_30.aFloat73 : this.aClass19_Sub2_30.aFloat65) + this.aClass19_Sub2_30.aFloat70;
								}
							}
							@Pc(861) Class4 local861 = null;
							if ((this.anInt5275 - 1 & local487) == 0 && (local496 & this.anInt5275 - 1) == 0) {
								local861 = local189.method2700(local540);
							}
							@Pc(1229) int local1229;
							@Pc(894) int local894;
							if (local861 == null) {
								if (local510 == local514) {
									local894 = local552;
								} else {
									@Pc(904) int local904 = local594 * (local514 & 0x7F) >> 7;
									if (local904 < 2) {
										local904 = 2;
									} else if (local904 > 126) {
										local904 = 126;
									}
									local894 = Static72.anIntArray115[local514 & 0xFF80 | local904];
									if ((this.anInt5285 & 0x7) == 0) {
										local636 = this.aClass19_Sub2_30.aFloatArray19[2] * local590 + this.aClass19_Sub2_30.aFloatArray19[0] * local586 + this.aClass19_Sub2_30.aFloatArray19[1] * local588;
										local636 = this.aClass19_Sub2_30.aFloat70 + (local774 > 0.0F ? this.aClass19_Sub2_30.aFloat73 : this.aClass19_Sub2_30.aFloat65) * local774;
										@Pc(982) int local982 = local894 >> 16 & 0xFF;
										@Pc(988) int local988 = local894 >> 8 & 0xFF;
										@Pc(992) int local992 = local894 & 0xFF;
										local982 = (int) ((float) local982 * local636);
										if (local982 < 0) {
											local982 = 0;
										} else if (local982 > 255) {
											local982 = 255;
										}
										local988 = (int) ((float) local988 * local636);
										local992 = (int) ((float) local992 * local636);
										if (local988 < 0) {
											local988 = 0;
										} else if (local988 > 255) {
											local988 = 255;
										}
										if (local992 < 0) {
											local992 = 0;
										} else if (local992 > 255) {
											local992 = 255;
										}
										local894 = local992 | local988 << 8 | local982 << 16;
									}
								}
								if (this.aClass19_Sub2_30.aBoolean215) {
									local168.a((float) local487);
									local168.a((float) (this.a(local487, local496) + local522));
									local168.a((float) local496);
									local168.b((byte) (local894 >> 16));
									local168.b((byte) (local894 >> 8));
									local168.b((byte) local894);
									local168.b(-1);
									local168.a((float) local487);
									local168.a((float) local496);
									if (this.anIntArrayArrayArray9 != null) {
										local168.a((float) (local267 == null ? 0 : local267[local431] - 1));
									}
									if ((this.anInt5285 & 0x7) != 0) {
										local168.a(local586);
										local168.a(local588);
										local168.a(local590);
									}
								} else {
									local168.b((float) local487);
									local168.b((float) (local522 + this.a(local487, local496)));
									local168.b((float) local496);
									local168.b((byte) (local894 >> 16));
									local168.b((byte) (local894 >> 8));
									local168.b((byte) local894);
									local168.b(-1);
									local168.b((float) local487);
									local168.b((float) local496);
									if (this.anIntArrayArrayArray9 != null) {
										local168.b((float) (local267 == null ? 0 : local267[local431] - 1));
									}
									if ((this.anInt5285 & 0x7) != 0) {
										local168.b(local586);
										local168.b(local588);
										local168.b(local590);
									}
								}
								local1229 = this.anInt5280++;
								local473[local431] = (short) local1229;
								if (local510 != -1) {
									local172[local1229] = local215[local431];
								}
								local189.method2703(local540, new Class4_Sub31(local473[local431]));
							} else {
								local473[local431] = ((Class4_Sub31) local861).aShort62;
								local1229 = local473[local431] & 0xFFFF;
								if (local510 != -1 && local172[local1229].aLong224 > local215[local431].aLong224) {
									local172[local1229] = local215[local431];
								}
							}
							for (local894 = 0; local894 < local421; local894++) {
								local193[local894].method1465(local594, local1229, local552, local774);
							}
							this.anInt5270++;
						}
					}
				}
			}
			for (local199 = 0; local199 < this.anInt5280; local199++) {
				@Pc(1337) Class4_Sub16 local1337 = local172[local199];
				if (local1337 != null) {
					local1337.method1467(local199);
				}
			}
			@Pc(1370) int local1370;
			for (@Pc(1350) int local1350 = 0; super.anInt5262 > local1350; local1350++) {
				for (@Pc(1354) int local1354 = 0; local1354 < super.anInt5258; local1354++) {
					@Pc(1366) short[] local1366 = this.aShortArrayArray9[local1354 * super.anInt5262 + local1350];
					if (local1366 != null) {
						local1370 = 0;
						@Pc(1372) int local1372 = 0;
						while (local1372 < local1366.length) {
							@Pc(1381) int local1381 = local1366[local1372++] & 0xFFFF;
							@Pc(1388) int local1388 = local1366[local1372++] & 0xFFFF;
							@Pc(1395) int local1395 = local1366[local1372++] & 0xFFFF;
							@Pc(1399) Class4_Sub16 local1399 = local172[local1381];
							@Pc(1403) Class4_Sub16 local1403 = local172[local1388];
							@Pc(1407) Class4_Sub16 local1407 = local172[local1395];
							@Pc(1409) Class4_Sub16 local1409 = null;
							if (local1399 != null) {
								local1399.method1464(local1354, local1370, local1350);
								local1409 = local1399;
							}
							if (local1403 != null) {
								local1403.method1464(local1354, local1370, local1350);
								if (local1409 == null || local1409.aLong224 > local1403.aLong224) {
									local1409 = local1403;
								}
							}
							if (local1407 != null) {
								local1407.method1464(local1354, local1370, local1350);
								if (local1409 == null || local1409.aLong224 > local1407.aLong224) {
									local1409 = local1407;
								}
							}
							if (local1409 != null) {
								if (local1399 != null) {
									local1409.method1467(local1381);
								}
								if (local1403 != null) {
									local1409.method1467(local1388);
								}
								if (local1407 != null) {
									local1409.method1467(local1395);
								}
								local1409.method1464(local1354, local1370, local1350);
							}
							local1370++;
						}
					}
				}
			}
			local168.b();
			this.anInterface11_6 = this.aClass19_Sub2_30.method1902(local163, local168.a(), local141);
			this.aClass177_15 = new Class177(this.anInterface11_6, 5126, 3, 0);
			this.aClass177_13 = new Class177(this.anInterface11_6, 5121, 4, 12);
			@Pc(1542) byte local1542;
			if (this.anIntArrayArrayArray9 == null) {
				local1542 = 24;
				this.aClass177_14 = new Class177(this.anInterface11_6, 5126, 2, 16);
			} else {
				local1542 = 28;
				this.aClass177_14 = new Class177(this.anInterface11_6, 5126, 3, 16);
			}
			if ((this.anInt5285 & 0x7) != 0) {
				this.aClass177_16 = new Class177(this.anInterface11_6, 5126, 3, local1542);
			}
			@Pc(1586) long[] local1586 = new long[this.aClass4_Sub16Array1.length];
			for (local1370 = 0; local1370 < this.aClass4_Sub16Array1.length; local1370++) {
				@Pc(1595) Class4_Sub16 local1595 = this.aClass4_Sub16Array1[local1370];
				local1586[local1370] = local1595.aLong224;
				local1595.method1461(this.anInt5280);
			}
			Static321.method4335(this.aClass4_Sub16Array1, local1586);
			if (this.aClass236_2 != null) {
				this.aClass236_2.method5193();
			}
		}
		this.anIntArrayArrayArray8 = null;
		this.anIntArrayArrayArray9 = null;
		this.anIntArrayArrayArray10 = null;
		this.aClass102_27 = null;
		this.aClass4_Sub16ArrayArrayArray1 = null;
		this.aFloatArrayArray9 = this.aFloatArrayArray7 = this.aFloatArrayArray8 = null;
		this.anIntArrayArrayArray6 = this.anIntArrayArrayArray7 = null;
		this.aByteArrayArray23 = null;
		this.anIntArrayArrayArray11 = null;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IBZ[[ZIII)V")
	private void method4034(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		if (this.aClass4_Sub16Array1 == null) {
			return;
		}
		@Pc(8) float local8 = this.aClass19_Sub2_30.aFloat67;
		@Pc(12) float local12 = this.aClass19_Sub2_30.aFloat63;
		@Pc(19) int local19 = arg4 + arg4 + 1;
		@Pc(23) int local23 = local19 * local19;
		if (local23 > Static192.anIntArray239.length) {
			Static192.anIntArray239 = new int[local23];
		}
		if (Static383.aClass4_Sub12_7.aByteArray36.length < this.anInt5270 * 2) {
			Static383.aClass4_Sub12_7 = new Class4_Sub12(this.anInt5270 * 2);
		}
		@Pc(59) int local59 = arg0 - arg4;
		@Pc(61) int local61 = local59;
		if (local59 < 0) {
			local59 = 0;
		}
		@Pc(70) int local70 = arg3 - arg4;
		@Pc(72) int local72 = local70;
		if (local70 < 0) {
			local70 = 0;
		}
		@Pc(81) int local81 = arg0 + arg4;
		if (local81 > super.anInt5262 - 1) {
			local81 = super.anInt5262 - 1;
		}
		@Pc(100) int local100 = arg4 + arg3;
		if (super.anInt5258 - 1 < local100) {
			local100 = super.anInt5258 - 1;
		}
		Static356.anInt6220 = 0;
		@Pc(130) int local130;
		for (@Pc(119) int local119 = local59; local119 <= local81; local119++) {
			@Pc(128) boolean[] local128 = arg2[local119 - local61];
			for (local130 = local70; local130 <= local100; local130++) {
				if (local128[local130 - local72]) {
					Static192.anIntArray239[Static356.anInt6220++] = local130 * super.anInt5262 + local119;
				}
			}
		}
		this.aClass19_Sub2_30.method1904();
		this.aClass19_Sub2_30.method1906((this.anInt5285 & 0x7) != 0);
		for (@Pc(194) int local194 = 0; local194 < this.aClass4_Sub16Array1.length; local194++) {
			this.aClass4_Sub16Array1[local194].method1462(Static192.anIntArray239, Static356.anInt6220);
		}
		if (!this.aClass183_37.method4147()) {
			local130 = this.aClass19_Sub2_30.anInt2302;
			@Pc(227) int local227 = this.aClass19_Sub2_30.anInt2315;
			this.aClass19_Sub2_30.UA(0, local227, this.aClass19_Sub2_30.anInt2282);
			this.aClass19_Sub2_30.g(local12, local8 - 4.0F);
			this.aClass19_Sub2_30.method1906(false);
			this.aClass19_Sub2_30.method1911(false);
			this.aClass19_Sub2_30.method1958(128);
			this.aClass19_Sub2_30.method1957(-2);
			this.aClass19_Sub2_30.method1905(this.aClass19_Sub2_30.aClass6_Sub1_3);
			this.aClass19_Sub2_30.method1912(8448, 7681);
			this.aClass19_Sub2_30.method1945(0, 770, 34166);
			this.aClass19_Sub2_30.method1954(34167, 0);
			for (@Pc(294) Class4 local294 = this.aClass183_37.method4140(); local294 != null; local294 = this.aClass183_37.method4144()) {
				@Pc(299) Class4_Sub24 local299 = (Class4_Sub24) local294;
				local299.method2842(arg4, arg0, arg3, arg2);
			}
			this.aClass19_Sub2_30.method1945(0, 768, 5890);
			this.aClass19_Sub2_30.method1954(5890, 0);
			this.aClass19_Sub2_30.method1905(null);
			this.aClass19_Sub2_30.UA(local130, local227, this.aClass19_Sub2_30.anInt2282);
		}
		if (this.aClass236_2 != null) {
			this.aClass19_Sub2_30.g(local12, local8 - 8.0F);
			this.aClass19_Sub2_30.method1904();
			this.aClass19_Sub2_30.method1934(null, null, this.aClass177_14, this.aClass177_15);
			this.aClass236_2.method5191(arg1, arg3, arg0, arg2, arg4);
		}
		this.aClass19_Sub2_30.g(local12, local8);
	}
}
