import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rj")
public final class Class133_Sub3 extends Class133 {

	@OriginalMember(owner = "client!rj", name = "N", descriptor = "I")
	private int anInt8716;

	@OriginalMember(owner = "client!rj", name = "D", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray22;

	@OriginalMember(owner = "client!rj", name = "Z", descriptor = "I")
	private int anInt8727;

	@OriginalMember(owner = "client!rj", name = "p", descriptor = "Lclient!uh;")
	private Interface24 anInterface24_14;

	@OriginalMember(owner = "client!rj", name = "z", descriptor = "I")
	private int anInt8731;

	@OriginalMember(owner = "client!rj", name = "Q", descriptor = "Lclient!oka;")
	public Class277 aClass277_16;

	@OriginalMember(owner = "client!rj", name = "k", descriptor = "Lclient!uh;")
	private Interface24 anInterface24_15;

	@OriginalMember(owner = "client!rj", name = "U", descriptor = "I")
	private int anInt8732;

	@OriginalMember(owner = "client!rj", name = "T", descriptor = "[Lclient!cg;")
	private Class2_Sub13[] aClass2_Sub13Array1;

	@OriginalMember(owner = "client!rj", name = "o", descriptor = "F")
	private float aFloat144 = -3.4028235E38F;

	@OriginalMember(owner = "client!rj", name = "I", descriptor = "F")
	private float aFloat143 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!rj", name = "X", descriptor = "Lclient!cga;")
	private final Class60 aClass60_178 = new Class60();

	@OriginalMember(owner = "client!rj", name = "q", descriptor = "I")
	private final int anInt8723 = this.anInt9317 - 2;

	@OriginalMember(owner = "client!rj", name = "F", descriptor = "Lclient!lb;")
	public final Class145_Sub1 aClass145_Sub1_20;

	@OriginalMember(owner = "client!rj", name = "W", descriptor = "[[F")
	private float[][] aFloatArrayArray17;

	@OriginalMember(owner = "client!rj", name = "v", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray24;

	@OriginalMember(owner = "client!rj", name = "M", descriptor = "[[F")
	private float[][] aFloatArrayArray18;

	@OriginalMember(owner = "client!rj", name = "r", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray23;

	@OriginalMember(owner = "client!rj", name = "n", descriptor = "[[[Lclient!cg;")
	private Class2_Sub13[][][] aClass2_Sub13ArrayArrayArray1;

	@OriginalMember(owner = "client!rj", name = "S", descriptor = "I")
	private final int anInt8715;

	@OriginalMember(owner = "client!rj", name = "s", descriptor = "I")
	public final int anInt8728;

	@OriginalMember(owner = "client!rj", name = "V", descriptor = "[[B")
	private byte[][] aByteArrayArray20;

	@OriginalMember(owner = "client!rj", name = "B", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray19;

	@OriginalMember(owner = "client!rj", name = "C", descriptor = "[[B")
	private final byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!rj", name = "E", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray20;

	@OriginalMember(owner = "client!rj", name = "y", descriptor = "[[F")
	private float[][] aFloatArrayArray19;

	@OriginalMember(owner = "client!rj", name = "l", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray21;

	@OriginalMember(owner = "client!rj", name = "O", descriptor = "[[S")
	public final short[][] aShortArrayArray5;

	@OriginalMember(owner = "client!rj", name = "fb", descriptor = "Lclient!lba;")
	private Class218 aClass218_40;

	@OriginalMember(owner = "client!rj", name = "cb", descriptor = "Lclient!jp;")
	private Class201 aClass201_1;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lclient!lb;IIII[[I[[II)V")
	public Class133_Sub3(@OriginalArg(0) Class145_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass145_Sub1_20 = arg0;
		this.aFloatArrayArray17 = new float[super.anInt9318 + 1][super.anInt9315 + 1];
		this.anIntArrayArrayArray24 = new int[arg3][arg4][];
		this.aFloatArrayArray18 = new float[super.anInt9318 + 1][super.anInt9315 + 1];
		this.anIntArrayArrayArray23 = new int[arg3][arg4][];
		this.aClass2_Sub13ArrayArrayArray1 = new Class2_Sub13[arg3][arg4][];
		this.anInt8715 = 0x1 << this.anInt8723;
		this.anInt8728 = arg2;
		this.aByteArrayArray20 = new byte[arg3 + 1][arg4 + 1];
		this.anIntArrayArrayArray19 = new int[arg3][arg4][];
		this.aByteArrayArray19 = new byte[arg3][arg4];
		this.anIntArrayArrayArray20 = new int[arg3][arg4][];
		this.aFloatArrayArray19 = new float[super.anInt9318 + 1][super.anInt9315 + 1];
		this.anIntArrayArrayArray21 = new int[arg3][arg4][];
		this.aShortArrayArray5 = new short[arg3 * arg4][];
		for (@Pc(121) int local121 = 0; super.anInt9315 >= local121; local121++) {
			for (@Pc(127) int local127 = 0; super.anInt9318 >= local127; local127++) {
				@Pc(136) int local136 = super.anIntArrayArray60[local127][local121];
				if ((float) local136 > this.aFloat144) {
					this.aFloat144 = (float) local136;
				}
				if (this.aFloat143 > (float) local136) {
					this.aFloat143 = (float) local136;
				}
				if (local127 > 0 && local121 > 0 && local127 < super.anInt9318 && local121 < super.anInt9315) {
					@Pc(201) int local201 = arg6[local127 + 1][local121] - arg6[local127 - 1][local121];
					@Pc(218) int local218 = arg6[local127][local121 + 1] - arg6[local127][local121 - 1];
					@Pc(237) float local237 = (float) (1.0D / Math.sqrt((double) (local218 * local218 + arg7 * 4 * arg7 + local201 * local201)));
					this.aFloatArrayArray19[local127][local121] = (float) local201 * local237;
					this.aFloatArrayArray17[local127][local121] = (float) (-arg7 * 2) * local237;
					this.aFloatArrayArray18[local127][local121] = local237 * (float) local218;
				}
			}
		}
		this.aFloat144++;
		this.aFloat143--;
		this.aClass218_40 = new Class218(128);
		if ((this.anInt8728 & 0x10) != 0) {
			this.aClass201_1 = new Class201(this.aClass145_Sub1_20, this);
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method8213(@OriginalArg(0) Class2_Sub6_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass201_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(28) int local28 = arg1 - (arg2 * this.aClass145_Sub1_20.anInt11251 >> 8) >> this.aClass145_Sub1_20.anInt11265;
			@Pc(43) int local43 = arg3 - (arg2 * this.aClass145_Sub1_20.anInt11275 >> 8) >> this.aClass145_Sub1_20.anInt11265;
			return this.aClass201_1.method4327(local43, arg0, local28);
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method8216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!rj", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray20[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray20[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method8218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method7728(arg3, arg2, -1, arg0, arg5, arg4, arg1);
	}

	@OriginalMember(owner = "client!rj", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class2_Sub6_Sub9 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub6_Sub9 arg2) {
		if ((this.aByteArrayArray19[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(25) int local25 = super.anInt9321 >> this.aClass145_Sub1_20.anInt11265;
		@Pc(28) Class2_Sub6_Sub9_Sub2 local28 = (Class2_Sub6_Sub9_Sub2) arg2;
		@Pc(46) Class2_Sub6_Sub9_Sub2 local46;
		if (local28 != null && local28.method4757(local25, local25)) {
			local46 = local28;
			local28.method4759();
		} else {
			local46 = new Class2_Sub6_Sub9_Sub2(this.aClass145_Sub1_20, local25, local25);
		}
		local46.method4758(0, 0, local25, local25);
		this.method7730(arg1, arg0, local46);
		return local46;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)V")
	@Override
	public void method8223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method8219(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt8731 <= 0) {
			return;
		}
		@Pc(20) Interface15 local20 = this.aClass145_Sub1_20.method9824(this.anInt8727);
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 32767;
		@Pc(26) int local26 = -32768;
		for (@Pc(28) int local28 = 0; local28 < 4; local28++) {
			local22 = 0;
			@Pc(39) Buffer local39 = local20.method4689();
			if (local39 != null) {
				@Pc(47) Stream local47 = this.aClass145_Sub1_20.method9844(local39);
				@Pc(51) int local51;
				@Pc(60) int local60;
				@Pc(62) int local62;
				@Pc(82) short[] local82;
				@Pc(86) int local86;
				@Pc(94) int local94;
				if (Stream.b()) {
					for (local51 = arg1; local51 < arg3; local51++) {
						local60 = local51 * super.anInt9318 + arg0;
						for (local62 = arg0; local62 < arg2; local62++) {
							if (arg4[local62 - arg0][local51 - arg1]) {
								local82 = this.aShortArrayArray5[local60];
								if (local82 != null) {
									for (local86 = 0; local86 < local82.length; local86++) {
										local94 = local82[local86] & 0xFFFF;
										if (local24 > local94) {
											local24 = local94;
										}
										if (local26 < local94) {
											local26 = local94;
										}
										local47.d(local94);
										local22++;
									}
								}
							}
							local60++;
						}
					}
				} else {
					for (local51 = arg1; local51 < arg3; local51++) {
						local60 = arg0 + local51 * super.anInt9318;
						for (local62 = arg0; local62 < arg2; local62++) {
							if (arg4[local62 - arg0][local51 - arg1]) {
								local82 = this.aShortArrayArray5[local60];
								if (local82 != null) {
									for (local86 = 0; local86 < local82.length; local86++) {
										local94 = local82[local86] & 0xFFFF;
										if (local26 < local94) {
											local26 = local94;
										}
										if (local94 < local24) {
											local24 = local94;
										}
										local47.b(local94);
										local22++;
									}
								}
							}
							local60++;
						}
					}
				}
				local47.a();
				if (local20.method4691()) {
					break;
				}
			}
		}
		if (local22 <= 0) {
			return;
		}
		this.aClass145_Sub1_20.method9763();
		this.aClass145_Sub1_20.method9768(false);
		this.aClass145_Sub1_20.method9801(false);
		this.aClass145_Sub1_20.method9839(false);
		this.aClass145_Sub1_20.method9822(false);
		this.aClass145_Sub1_20.method9832(0);
		this.aClass145_Sub1_20.method9724(-2, false, false);
		this.aClass145_Sub1_20.method9754((Interface9) null);
		@Pc(318) Class86_Sub2 local318 = this.aClass145_Sub1_20.method9835();
		@Pc(323) float[] local323 = this.aClass145_Sub1_20.method9744();
		local323[10] = 1.0F / (this.aFloat144 - this.aFloat143);
		local323[14] = -this.aFloat143 / (this.aFloat144 - this.aFloat143);
		local323[7] = 0.0F;
		local323[0] = (float) 1024 / ((float) this.aClass145_Sub1_20.anInt11157 * 128.0F * (float) super.anInt9321);
		local323[5] = (float) 1024 / ((float) this.aClass145_Sub1_20.anInt11144 * 128.0F * (float) super.anInt9321);
		local323[11] = 0.0F;
		local323[6] = 0.0F;
		local323[12] = -(((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass145_Sub1_20.anInt11157) - 1.0F;
		local323[8] = 0.0F;
		local323[3] = 0.0F;
		local323[9] = 0.0F;
		local323[2] = 0.0F;
		local323[15] = 1.0F;
		local323[1] = 0.0F;
		local323[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass145_Sub1_20.anInt11144;
		local323[4] = 0.0F;
		local318.method2735(1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F);
		this.aClass145_Sub1_20.method9798();
		this.aClass145_Sub1_20.method9786();
		if ((this.anInt8728 & 0x7) == 0) {
			this.aClass145_Sub1_20.method9801(false);
		} else {
			this.aClass145_Sub1_20.method9801(true);
			this.aClass145_Sub1_20.method9854(true);
		}
		this.aClass145_Sub1_20.method9767(false);
		this.aClass145_Sub1_20.method9800(0, this.anInterface24_14);
		this.aClass145_Sub1_20.method9800(1, this.anInterface24_15);
		this.aClass145_Sub1_20.method9766(this.aClass277_16);
		this.aClass145_Sub1_20.method9778(0, Static601.aClass317_8, local22 / 3, local24, local26 + 1 - local24, local20);
		this.aClass145_Sub1_20.method9767(true);
	}

	@OriginalMember(owner = "client!rj", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class2_Sub6_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass201_1 != null && arg0 != null) {
			@Pc(26) int local26 = arg1 - (this.aClass145_Sub1_20.anInt11251 * arg2 >> 8) >> this.aClass145_Sub1_20.anInt11265;
			@Pc(41) int local41 = arg3 - (this.aClass145_Sub1_20.anInt11275 * arg2 >> 8) >> this.aClass145_Sub1_20.anInt11265;
			this.aClass201_1.method4322(local26, arg0, local41);
		}
	}

	@OriginalMember(owner = "client!rj", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class2_Sub6_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass201_1 != null && arg0 != null) {
			@Pc(27) int local27 = arg1 - (arg2 * this.aClass145_Sub1_20.anInt11251 >> 8) >> this.aClass145_Sub1_20.anInt11265;
			@Pc(42) int local42 = arg3 - (this.aClass145_Sub1_20.anInt11275 * arg2 >> 8) >> this.aClass145_Sub1_20.anInt11265;
			this.aClass201_1.method4323(local42, arg0, local27);
		}
	}

	@OriginalMember(owner = "client!rj", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg3 != null && this.anIntArrayArrayArray19 == null) {
			this.anIntArrayArrayArray19 = new int[super.anInt9318][super.anInt9315][];
		}
		@Pc(25) Interface3 local25 = this.aClass145_Sub1_20.anInterface3_12;
		if (arg5 != null && this.anIntArrayArrayArray22 == null) {
			this.anIntArrayArrayArray22 = new int[super.anInt9318][super.anInt9315][];
		}
		this.anIntArrayArrayArray23[arg0][arg1] = arg2;
		this.anIntArrayArrayArray24[arg0][arg1] = arg4;
		this.anIntArrayArrayArray21[arg0][arg1] = arg6;
		this.anIntArrayArrayArray20[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray22 != null) {
			this.anIntArrayArrayArray22[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray19 != null) {
			this.anIntArrayArrayArray19[arg0][arg1] = arg3;
		}
		@Pc(104) Class2_Sub13[] local104 = this.aClass2_Sub13ArrayArrayArray1[arg0][arg1] = new Class2_Sub13[arg6.length];
		for (@Pc(106) int local106 = 0; local106 < arg6.length; local106++) {
			@Pc(114) int local114 = arg8[local106];
			@Pc(118) int local118 = arg9[local106];
			if ((this.anInt8728 & 0x20) != 0 && local114 != -1 && local25.method2857(local114).aBoolean32) {
				local118 = 128;
				local114 = -1;
			}
			@Pc(164) long local164 = (long) local114 | (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28 | (long) (local118 << 14);
			@Pc(170) Class2 local170;
			for (local170 = this.aClass218_40.method5095(local164, 0); local170 != null; local170 = this.aClass218_40.method5100((byte) 64)) {
				@Pc(177) Class2_Sub13 local177 = (Class2_Sub13) local170;
				if (local114 == local177.anInt1386 && local177.aFloat4 == (float) local118 && arg10 == local177.anInt1392 && local177.anInt1382 == arg11 && arg12 == local177.anInt1381) {
					break;
				}
			}
			if (local170 == null) {
				local104[local106] = new Class2_Sub13(this, local114, local118, arg10, arg11, arg12);
				this.aClass218_40.method5099(local104[local106], local164);
			} else {
				local104[local106] = (Class2_Sub13) local170;
			}
		}
		if (arg13) {
			this.aByteArrayArray19[arg0][arg1] = (byte) (this.aByteArrayArray19[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt8732) {
			this.anInt8732 = arg6.length;
		}
		this.anInt8731 += arg6.length;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method8222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method7728(arg3, arg2, arg5, arg0, arg6, arg4, arg1);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "([[ZIIIBIZI)V")
	private void method7728(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6) {
		if (this.aClass2_Sub13Array1 == null) {
			return;
		}
		@Pc(11) int local11 = arg1 + arg1 + 1;
		@Pc(15) int local15 = local11 * local11;
		if (Static156.anIntArray195.length < local15) {
			Static156.anIntArray195 = new int[local15];
		}
		@Pc(32) int local32 = arg3 - arg1;
		@Pc(34) int local34 = local32;
		if (local32 < 0) {
			local32 = 0;
		}
		@Pc(43) int local43 = arg6 - arg1;
		@Pc(45) int local45 = local43;
		if (local43 < 0) {
			local43 = 0;
		}
		@Pc(54) int local54 = arg3 + arg1;
		if (super.anInt9318 - 1 < local54) {
			local54 = super.anInt9318 - 1;
		}
		@Pc(70) int local70 = arg6 + arg1;
		Static524.anInt8315 = 0;
		if (local70 > super.anInt9315 - 1) {
			local70 = super.anInt9315 - 1;
		}
		for (@Pc(89) int local89 = local32; local89 <= local54; local89++) {
			@Pc(97) boolean[] local97 = arg0[local89 - local34];
			for (@Pc(99) int local99 = local43; local99 <= local70; local99++) {
				if (local97[local99 - local45]) {
					Static156.anIntArray195[Static524.anInt8315++] = super.anInt9318 * local99 + local89;
				}
			}
		}
		if (arg2 == -1) {
			this.aClass145_Sub1_20.method9831();
		} else {
			this.aClass145_Sub1_20.method9777((float) arg2);
			this.aClass145_Sub1_20.method9792();
		}
		this.aClass145_Sub1_20.method9730();
		this.aClass145_Sub1_20.method9801((this.anInt8728 & 0x7) != 0);
		this.aClass145_Sub1_20.method9724(-1, false, false);
		this.aClass145_Sub1_20.method9800(0, this.anInterface24_14);
		for (@Pc(198) int local198 = 0; local198 < this.aClass2_Sub13Array1.length; local198++) {
			this.aClass2_Sub13Array1[local198].method1215(Static524.anInt8315, Static156.anIntArray195);
		}
		@Pc(221) Class86_Sub2 local221 = this.aClass145_Sub1_20.method9835();
		local221.method7026(0, -1, 0);
		this.aClass145_Sub1_20.method9786();
		if (!this.aClass60_178.method1221()) {
			@Pc(241) int local241 = this.aClass145_Sub1_20.anInt11257;
			@Pc(245) int local245 = this.aClass145_Sub1_20.anInt11261;
			this.aClass145_Sub1_20.L(0, local245, this.aClass145_Sub1_20.anInt11259);
			this.aClass145_Sub1_20.method9801(false);
			this.aClass145_Sub1_20.method9822(false);
			this.aClass145_Sub1_20.method9832(128);
			this.aClass145_Sub1_20.method9724(-2, false, false);
			this.aClass145_Sub1_20.method9754(this.aClass145_Sub1_20.anInterface9_3);
			this.aClass145_Sub1_20.method9725(Static105.aClass293_3, Static162.aClass293_4);
			this.aClass145_Sub1_20.method9813(Static45.aClass352_1, 0);
			this.aClass145_Sub1_20.method9795(0, Static150.aClass352_4);
			for (@Pc(305) Class2 local305 = this.aClass60_178.method1226(7); local305 != null; local305 = this.aClass60_178.method1228()) {
				@Pc(310) Class2_Sub5 local310 = (Class2_Sub5) local305;
				local310.method304(arg6, arg0, arg3, arg1);
			}
			this.aClass145_Sub1_20.method9813(Static231.aClass352_5, 0);
			this.aClass145_Sub1_20.method9795(0, Static231.aClass352_5);
			this.aClass145_Sub1_20.method9754((Interface9) null);
			this.aClass145_Sub1_20.L(local241, local245, this.aClass145_Sub1_20.anInt11259);
		}
		if (this.aClass201_1 != null) {
			this.aClass145_Sub1_20.method9800(0, this.anInterface24_14);
			this.aClass145_Sub1_20.method9800(1, this.anInterface24_15);
			this.aClass145_Sub1_20.method9766(this.aClass277_16);
			this.aClass201_1.method4324(arg3, arg6, arg5, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!rj", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.anInt8731 > 0) {
			@Pc(18) byte[][] local18 = new byte[super.anInt9318 + 1][super.anInt9315 + 1];
			for (@Pc(20) int local20 = 1; super.anInt9318 > local20; local20++) {
				for (@Pc(26) int local26 = 1; super.anInt9315 > local26; local26++) {
					local18[local20][local26] = (byte) ((this.aByteArrayArray20[local20][local26 - 1] >> 2) + (this.aByteArrayArray20[local20 - 1][local26] >> 2) + (this.aByteArrayArray20[local20 + 1][local26] >> 3) + (this.aByteArrayArray20[local20][local26 + 1] >> 3) + (this.aByteArrayArray20[local20][local26] >> 1));
				}
			}
			@Pc(112) Class2_Sub13[] local112 = new Class2_Sub13[this.aClass218_40.method5094()];
			this.aClass218_40.method5091(local112);
			for (@Pc(122) int local122 = 0; local122 < local112.length; local122++) {
				local112[local122].method1218(this.anInt8731);
			}
			@Pc(144) int local144 = 20;
			if (this.anIntArrayArrayArray22 != null) {
				local144 += 4;
			}
			if ((this.anInt8728 & 0x7) != 0) {
				local144 += 12;
			}
			@Pc(170) NativeHeapBuffer local170 = this.aClass145_Sub1_20.aNativeHeap6.a(this.anInt8731 * 4, false);
			@Pc(180) NativeHeapBuffer local180 = this.aClass145_Sub1_20.aNativeHeap6.a(local144 * this.anInt8731, false);
			@Pc(185) Stream local185 = new Stream(local180);
			@Pc(190) Stream local190 = new Stream(local170);
			@Pc(194) Class2_Sub13[] local194 = new Class2_Sub13[this.anInt8731];
			@Pc(201) int local201 = Static457.method6640(this.anInt8731 / 4);
			if (local201 < 1) {
				local201 = 1;
			}
			@Pc(213) Class218 local213 = new Class218(local201);
			@Pc(217) Class2_Sub13[] local217 = new Class2_Sub13[this.anInt8732];
			@Pc(223) int local223;
			for (@Pc(219) int local219 = 0; super.anInt9318 > local219; local219++) {
				for (local223 = 0; local223 < super.anInt9315; local223++) {
					if (this.anIntArrayArrayArray21[local219][local223] != null) {
						@Pc(241) Class2_Sub13[] local241 = this.aClass2_Sub13ArrayArrayArray1[local219][local223];
						@Pc(248) int[] local248 = this.anIntArrayArrayArray23[local219][local223];
						@Pc(255) int[] local255 = this.anIntArrayArrayArray24[local219][local223];
						@Pc(262) int[] local262 = this.anIntArrayArrayArray20[local219][local223];
						@Pc(269) int[] local269 = this.anIntArrayArrayArray21[local219][local223];
						@Pc(282) int[] local282 = this.anIntArrayArrayArray19 == null ? null : this.anIntArrayArrayArray19[local219][local223];
						@Pc(295) int[] local295 = this.anIntArrayArrayArray22 == null ? null : this.anIntArrayArrayArray22[local219][local223];
						if (local262 == null) {
							local262 = local269;
						}
						@Pc(306) float local306 = this.aFloatArrayArray19[local219][local223];
						@Pc(313) float local313 = this.aFloatArrayArray17[local219][local223];
						@Pc(320) float local320 = this.aFloatArrayArray18[local219][local223];
						@Pc(329) float local329 = this.aFloatArrayArray19[local219][local223 + 1];
						@Pc(338) float local338 = this.aFloatArrayArray17[local219][local223 + 1];
						@Pc(347) float local347 = this.aFloatArrayArray18[local219][local223 + 1];
						@Pc(358) float local358 = this.aFloatArrayArray19[local219 + 1][local223 + 1];
						@Pc(369) float local369 = this.aFloatArrayArray17[local219 + 1][local223 + 1];
						@Pc(380) float local380 = this.aFloatArrayArray18[local219 + 1][local223 + 1];
						@Pc(389) float local389 = this.aFloatArrayArray19[local219 + 1][local223];
						@Pc(398) float local398 = this.aFloatArrayArray17[local219 + 1][local223];
						@Pc(407) float local407 = this.aFloatArrayArray18[local219 + 1][local223];
						@Pc(415) int local415 = local18[local219][local223] & 0xFF;
						@Pc(425) int local425 = local18[local219][local223 + 1] & 0xFF;
						@Pc(437) int local437 = local18[local219 + 1][local223 + 1] & 0xFF;
						@Pc(447) int local447 = local18[local219 + 1][local223] & 0xFF;
						@Pc(449) int local449 = 0;
						@Pc(459) int local459;
						label355: for (@Pc(451) int local451 = 0; local451 < local269.length; local451++) {
							@Pc(457) Class2_Sub13 local457 = local241[local451];
							for (local459 = 0; local459 < local449; local459++) {
								if (local217[local459] == local457) {
									continue label355;
								}
							}
							local217[local449++] = local457;
						}
						@Pc(511) short[] local511 = this.aShortArrayArray5[local223 * super.anInt9318 + local219] = new short[local269.length];
						for (local459 = 0; local459 < local269.length; local459++) {
							@Pc(525) int local525 = (local219 << super.anInt9317) + local248[local459];
							@Pc(534) int local534 = (local223 << super.anInt9317) + local255[local459];
							@Pc(539) int local539 = local525 >> this.anInt8723;
							@Pc(544) int local544 = local534 >> this.anInt8723;
							@Pc(548) int local548 = local269[local459];
							@Pc(552) int local552 = local262[local459];
							@Pc(561) int local561 = local282 == null ? 0 : local282[local459];
							@Pc(579) long local579 = (long) local544 | (long) (local539 << 16) | (long) local552 << 48 | (long) local548 << 32;
							@Pc(583) int local583 = local248[local459];
							@Pc(587) int local587 = local255[local459];
							@Pc(589) byte local589 = 74;
							@Pc(591) int local591 = 0;
							@Pc(612) float local612;
							@Pc(618) float local618;
							@Pc(620) float local620;
							@Pc(706) float local706;
							@Pc(616) int local616;
							if (local583 == 0 && local587 == 0) {
								local618 = local313;
								local620 = local320;
								local612 = local306;
								local616 = local589 - local415;
							} else if (local583 == 0 && super.anInt9321 == local587) {
								local612 = local329;
								local616 = local589 - local425;
								local618 = local338;
								local620 = local347;
							} else if (local583 == super.anInt9321 && local587 == super.anInt9321) {
								local618 = local369;
								local616 = local589 - local437;
								local612 = local358;
								local620 = local380;
							} else if (local583 == super.anInt9321 && local587 == 0) {
								local618 = local398;
								local620 = local407;
								local612 = local389;
								local616 = local589 - local447;
							} else {
								@Pc(682) float local682 = (float) local583 / (float) super.anInt9321;
								@Pc(689) float local689 = (float) local587 / (float) super.anInt9321;
								@Pc(697) float local697 = (local389 - local306) * local682 + local306;
								local706 = (local398 - local313) * local682 + local313;
								@Pc(714) float local714 = local320 + (local407 - local320) * local682;
								@Pc(723) float local723 = (local358 - local329) * local682 + local329;
								@Pc(732) float local732 = local338 + local682 * (local369 - local338);
								local612 = local689 * (local723 - local697) + local697;
								local618 = (local732 - local706) * local689 + local706;
								@Pc(758) float local758 = local682 * (local380 - local347) + local347;
								local620 = local714 + (local758 - local714) * local689;
								@Pc(779) int local779 = local415 + ((local447 - local415) * local583 >> super.anInt9317);
								@Pc(791) int local791 = local425 + ((local437 - local425) * local583 >> super.anInt9317);
								local616 = local589 - (local587 * (local791 - local779) >> super.anInt9317) - local779;
							}
							@Pc(819) float local819 = 1.0F;
							if (local548 != -1) {
								@Pc(831) int local831 = local616 * (local548 & 0x7F) >> 7;
								if (local831 < 2) {
									local831 = 2;
								} else if (local831 > 126) {
									local831 = 126;
								}
								local591 = Static555.anIntArray633[local548 & 0xFF80 | local831];
								if ((this.anInt8728 & 0x7) == 0) {
									local819 = local618 * this.aClass145_Sub1_20.aFloatArray74[1] + local612 * this.aClass145_Sub1_20.aFloatArray74[0] + local620 * this.aClass145_Sub1_20.aFloatArray74[2];
									local819 = this.aClass145_Sub1_20.aFloat194 + local819 * (local819 > 0.0F ? this.aClass145_Sub1_20.aFloat191 : this.aClass145_Sub1_20.aFloat195);
								}
							}
							@Pc(908) Class2 local908 = null;
							if ((this.anInt8715 - 1 & local525) == 0 && (local534 & this.anInt8715 - 1) == 0) {
								local908 = local213.method5095(local579, 0);
							}
							@Pc(946) int local946;
							@Pc(982) int local982;
							if (local908 == null) {
								if (local552 == local548) {
									local982 = local591;
								} else {
									@Pc(992) int local992 = local616 * (local552 & 0x7F) >> 7;
									if (local992 < 2) {
										local992 = 2;
									} else if (local992 > 126) {
										local992 = 126;
									}
									local982 = Static555.anIntArray633[local552 & 0xFF80 | local992];
									if ((this.anInt8728 & 0x7) == 0) {
										local706 = this.aClass145_Sub1_20.aFloatArray74[2] * local620 + this.aClass145_Sub1_20.aFloatArray74[1] * local618 + local612 * this.aClass145_Sub1_20.aFloatArray74[0];
										local706 = local819 * (local819 > 0.0F ? this.aClass145_Sub1_20.aFloat191 : this.aClass145_Sub1_20.aFloat195) + this.aClass145_Sub1_20.aFloat194;
										@Pc(1070) int local1070 = local982 >> 16 & 0xFF;
										@Pc(1076) int local1076 = local982 >> 8 & 0xFF;
										@Pc(1080) int local1080 = local982 & 0xFF;
										local1070 = (int) ((float) local1070 * local706);
										local1076 = (int) ((float) local1076 * local706);
										if (local1070 < 0) {
											local1070 = 0;
										} else if (local1070 > 255) {
											local1070 = 255;
										}
										local1080 = (int) ((float) local1080 * local706);
										if (local1076 < 0) {
											local1076 = 0;
										} else if (local1076 > 255) {
											local1076 = 255;
										}
										if (local1080 < 0) {
											local1080 = 0;
										} else if (local1080 > 255) {
											local1080 = 255;
										}
										local982 = local1080 | local1070 << 16 | local1076 << 8;
									}
								}
								if (Stream.b()) {
									local185.b((float) local525);
									local185.b((float) (local561 + this.method8214(local525, local534)));
									local185.b((float) local534);
									local185.b((float) local525);
									local185.b((float) local534);
									if (this.anIntArrayArrayArray22 != null) {
										local185.b((float) (local295 == null ? 0 : local295[local459] - 1));
									}
									if ((this.anInt8728 & 0x7) != 0) {
										local185.b(local612);
										local185.b(local618);
										local185.b(local620);
									}
								} else {
									local185.a((float) local525);
									local185.a((float) (local561 + this.method8214(local525, local534)));
									local185.a((float) local534);
									local185.a((float) local525);
									local185.a((float) local534);
									if (this.anIntArrayArrayArray22 != null) {
										local185.a((float) (local295 == null ? 0 : local295[local459] - 1));
									}
									if ((this.anInt8728 & 0x7) != 0) {
										local185.a(local612);
										local185.a(local618);
										local185.a(local620);
									}
								}
								if (this.aClass145_Sub1_20.anInt11268 == 0) {
									local190.f(local982 | 0xFF000000);
								} else {
									local190.e(local982 | 0xFF000000);
								}
								local946 = this.anInt8716++;
								local511[local459] = (short) local946;
								if (local548 != -1) {
									local194[local946] = local241[local459];
								}
								local213.method5099(new Class2_Sub16(local511[local459]), local579);
							} else {
								local511[local459] = ((Class2_Sub16) local908).aShort38;
								local946 = local511[local459] & 0xFFFF;
								if (local548 != -1 && local241[local459].aLong352 < local194[local946].aLong352) {
									local194[local946] = local241[local459];
								}
							}
							for (local982 = 0; local982 < local449; local982++) {
								local217[local982].method1217(local819, local591, local616, local946);
							}
							this.anInt8727++;
						}
					}
				}
			}
			for (local223 = 0; local223 < this.anInt8716; local223++) {
				@Pc(1403) Class2_Sub13 local1403 = local194[local223];
				if (local1403 != null) {
					local1403.method1216(local223);
				}
			}
			@Pc(1428) int local1428;
			@Pc(1446) int local1446;
			for (@Pc(1422) int local1422 = 0; super.anInt9318 > local1422; local1422++) {
				for (local1428 = 0; local1428 < super.anInt9315; local1428++) {
					@Pc(1440) short[] local1440 = this.aShortArrayArray5[super.anInt9318 * local1428 + local1422];
					if (local1440 != null) {
						@Pc(1444) int local1444 = 0;
						local1446 = 0;
						while (local1440.length > local1446) {
							@Pc(1455) int local1455 = local1440[local1446++] & 0xFFFF;
							@Pc(1462) int local1462 = local1440[local1446++] & 0xFFFF;
							@Pc(1469) int local1469 = local1440[local1446++] & 0xFFFF;
							@Pc(1473) Class2_Sub13 local1473 = local194[local1455];
							@Pc(1477) Class2_Sub13 local1477 = local194[local1462];
							@Pc(1481) Class2_Sub13 local1481 = local194[local1469];
							@Pc(1483) Class2_Sub13 local1483 = null;
							if (local1473 != null) {
								local1483 = local1473;
								local1473.method1213(local1428, local1444, local1422);
							}
							if (local1477 != null) {
								local1477.method1213(local1428, local1444, local1422);
								if (local1483 == null || local1477.aLong352 < local1483.aLong352) {
									local1483 = local1477;
								}
							}
							if (local1481 != null) {
								local1481.method1213(local1428, local1444, local1422);
								if (local1483 == null || local1481.aLong352 < local1483.aLong352) {
									local1483 = local1481;
								}
							}
							if (local1483 != null) {
								if (local1473 != null) {
									local1483.method1216(local1455);
								}
								if (local1477 != null) {
									local1483.method1216(local1462);
								}
								if (local1481 != null) {
									local1483.method1216(local1469);
								}
								local1483.method1213(local1428, local1444, local1422);
							}
							local1444++;
						}
					}
				}
			}
			local185.a();
			local190.a();
			this.anInterface24_15 = this.aClass145_Sub1_20.method9825(false);
			this.anInterface24_15.method9229(4, local170, this.anInt8716 * 4);
			this.anInterface24_14 = this.aClass145_Sub1_20.method9825(false);
			this.anInterface24_14.method9229(local144, local180, this.anInt8716 * local144);
			if ((this.anInt8728 & 0x7) == 0) {
				if (this.anIntArrayArrayArray22 == null) {
					this.aClass277_16 = this.aClass145_Sub1_20.method9830(new Class243[] { new Class243(new Class115[] { Static169.aClass115_1, Static169.aClass115_5 }), new Class243(Static169.aClass115_3) });
				} else {
					this.aClass277_16 = this.aClass145_Sub1_20.method9830(new Class243[] { new Class243(new Class115[] { Static169.aClass115_1, Static169.aClass115_5, Static169.aClass115_4 }), new Class243(Static169.aClass115_3) });
				}
			} else if (this.anIntArrayArrayArray22 == null) {
				this.aClass277_16 = this.aClass145_Sub1_20.method9830(new Class243[] { new Class243(new Class115[] { Static169.aClass115_1, Static169.aClass115_5, Static169.aClass115_2 }), new Class243(Static169.aClass115_3) });
			} else {
				this.aClass277_16 = this.aClass145_Sub1_20.method9830(new Class243[] { new Class243(new Class115[] { Static169.aClass115_1, Static169.aClass115_5, Static169.aClass115_4, Static169.aClass115_2 }), new Class243(Static169.aClass115_3) });
			}
			local1428 = 0;
			for (@Pc(1815) int local1815 = 0; local1815 < local112.length; local1815++) {
				if (local112[local1815].anInt1384 > 0) {
					local112[local1428++] = local112[local1815];
				}
			}
			this.aClass2_Sub13Array1 = new Class2_Sub13[local1428];
			@Pc(1848) long[] local1848 = new long[local1428];
			for (local1446 = 0; local1446 < local1428; local1446++) {
				@Pc(1858) Class2_Sub13 local1858 = local112[local1446];
				local1848[local1446] = local1858.aLong352;
				this.aClass2_Sub13Array1[local1446] = local1858;
				local1858.method1214(this.anInt8716);
			}
			Static118.method1732(local1848, this.aClass2_Sub13Array1);
			if (this.aClass201_1 != null) {
				this.aClass201_1.method4329();
			}
		} else {
			this.aClass201_1 = null;
		}
		this.aClass218_40 = null;
		this.anIntArrayArrayArray22 = null;
		this.anIntArrayArrayArray20 = null;
		this.aByteArrayArray20 = null;
		this.anIntArrayArrayArray23 = this.anIntArrayArrayArray24 = null;
		this.anIntArrayArrayArray21 = null;
		this.anIntArrayArrayArray19 = null;
		this.aFloatArrayArray19 = this.aFloatArrayArray17 = this.aFloatArrayArray18 = null;
		this.aClass2_Sub13ArrayArrayArray1 = null;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!bba;[I)V")
	@Override
	public void method8215(@OriginalArg(0) Class2_Sub7 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass60_178.method1233(new Class2_Sub5(this.aClass145_Sub1_20, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIILclient!ko;)V")
	private void method7730(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub6_Sub9_Sub2 arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray23[arg1][arg0];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray24[arg1][arg0];
		@Pc(22) int local22 = local12.length;
		if (Static364.anIntArray383.length < local22) {
			Static64.anIntArray99 = new int[local22];
			Static364.anIntArray383 = new int[local22];
		}
		for (@Pc(36) int local36 = 0; local36 < local22; local36++) {
			Static364.anIntArray383[local36] = local12[local36] >> this.aClass145_Sub1_20.anInt11265;
			Static64.anIntArray99[local36] = local19[local36] >> this.aClass145_Sub1_20.anInt11265;
		}
		@Pc(77) int local77 = 0;
		while (local77 < local22) {
			@Pc(85) int local85 = Static364.anIntArray383[local77];
			@Pc(90) int local90 = Static64.anIntArray99[local77++];
			@Pc(94) int local94 = Static364.anIntArray383[local77];
			@Pc(99) int local99 = Static64.anIntArray99[local77++];
			@Pc(103) int local103 = Static364.anIntArray383[local77];
			@Pc(108) int local108 = Static64.anIntArray99[local77++];
			if ((local99 - local108) * (local85 - local94) - (local99 - local90) * (-local94 + local103) > 0) {
				arg2.method4761(local85, local103, local90, local99, local108, local94);
			}
		}
	}
}
