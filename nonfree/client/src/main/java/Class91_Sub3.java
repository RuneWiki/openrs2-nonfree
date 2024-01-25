import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rq")
public final class Class91_Sub3 extends Class91 {

	@OriginalMember(owner = "client!rq", name = "v", descriptor = "I")
	private int anInt8452;

	@OriginalMember(owner = "client!rq", name = "O", descriptor = "I")
	private int anInt8464;

	@OriginalMember(owner = "client!rq", name = "Q", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray32;

	@OriginalMember(owner = "client!rq", name = "U", descriptor = "I")
	private int anInt8467;

	@OriginalMember(owner = "client!rq", name = "W", descriptor = "Lclient!ss;")
	public Class313 aClass313_13;

	@OriginalMember(owner = "client!rq", name = "X", descriptor = "Lclient!ss;")
	public Class313 aClass313_14;

	@OriginalMember(owner = "client!rq", name = "Z", descriptor = "I")
	private int anInt8468;

	@OriginalMember(owner = "client!rq", name = "bb", descriptor = "Lclient!ss;")
	public Class313 aClass313_15;

	@OriginalMember(owner = "client!rq", name = "cb", descriptor = "Lclient!bia;")
	private Interface3 anInterface3_6;

	@OriginalMember(owner = "client!rq", name = "fb", descriptor = "Lclient!ss;")
	private Class313 aClass313_16;

	@OriginalMember(owner = "client!rq", name = "gb", descriptor = "[Lclient!dr;")
	private Class3_Sub13[] aClass3_Sub13Array1;

	@OriginalMember(owner = "client!rq", name = "w", descriptor = "Lclient!mba;")
	private final Class216 aClass216_58 = new Class216();

	@OriginalMember(owner = "client!rq", name = "p", descriptor = "I")
	private final int anInt8448 = this.anInt8988 - 2;

	@OriginalMember(owner = "client!rq", name = "r", descriptor = "Lclient!dw;")
	public final Class82_Sub1 aClass82_Sub1_36;

	@OriginalMember(owner = "client!rq", name = "V", descriptor = "[[F")
	private float[][] aFloatArrayArray15;

	@OriginalMember(owner = "client!rq", name = "S", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray33;

	@OriginalMember(owner = "client!rq", name = "m", descriptor = "I")
	public final int anInt8447;

	@OriginalMember(owner = "client!rq", name = "hb", descriptor = "[[F")
	private float[][] aFloatArrayArray17;

	@OriginalMember(owner = "client!rq", name = "C", descriptor = "I")
	private final int anInt8456;

	@OriginalMember(owner = "client!rq", name = "eb", descriptor = "[[F")
	private float[][] aFloatArrayArray16;

	@OriginalMember(owner = "client!rq", name = "B", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray30;

	@OriginalMember(owner = "client!rq", name = "n", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray28;

	@OriginalMember(owner = "client!rq", name = "o", descriptor = "[[B")
	private final byte[][] aByteArrayArray22;

	@OriginalMember(owner = "client!rq", name = "Y", descriptor = "[[B")
	private byte[][] aByteArrayArray23;

	@OriginalMember(owner = "client!rq", name = "P", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray31;

	@OriginalMember(owner = "client!rq", name = "q", descriptor = "[[S")
	public final short[][] aShortArrayArray17;

	@OriginalMember(owner = "client!rq", name = "H", descriptor = "[[[Lclient!dr;")
	private Class3_Sub13[][][] aClass3_Sub13ArrayArrayArray1;

	@OriginalMember(owner = "client!rq", name = "x", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray29;

	@OriginalMember(owner = "client!rq", name = "ab", descriptor = "Lclient!baa;")
	private Class25 aClass25_37;

	@OriginalMember(owner = "client!rq", name = "N", descriptor = "Lclient!eq;")
	private Class97 aClass97_2;

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lclient!dw;IIII[[I[[II)V")
	public Class91_Sub3(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass82_Sub1_36 = arg0;
		this.aFloatArrayArray15 = new float[super.anInt8983 + 1][super.anInt8985 + 1];
		this.anIntArrayArrayArray33 = new int[arg3][arg4][];
		this.anInt8447 = arg2;
		this.aFloatArrayArray17 = new float[super.anInt8983 + 1][super.anInt8985 + 1];
		this.anInt8456 = 0x1 << this.anInt8448;
		this.aFloatArrayArray16 = new float[super.anInt8983 + 1][super.anInt8985 + 1];
		this.anIntArrayArrayArray30 = new int[arg3][arg4][];
		this.anIntArrayArrayArray28 = new int[arg3][arg4][];
		this.aByteArrayArray22 = new byte[arg3][arg4];
		this.aByteArrayArray23 = new byte[arg3 + 1][arg4 + 1];
		this.anIntArrayArrayArray31 = new int[arg3][arg4][];
		this.aShortArrayArray17 = new short[arg4 * arg3][];
		this.aClass3_Sub13ArrayArrayArray1 = new Class3_Sub13[arg3][arg4][];
		this.anIntArrayArrayArray29 = new int[arg3][arg4][];
		for (@Pc(115) int local115 = 1; local115 < super.anInt8985; local115++) {
			for (@Pc(119) int local119 = 1; local119 < super.anInt8983; local119++) {
				@Pc(138) int local138 = arg6[local119 + 1][local115] - arg6[local119 - 1][local115];
				@Pc(154) int local154 = arg6[local119][local115 + 1] - arg6[local119][local115 - 1];
				@Pc(173) float local173 = (float) (1.0D / Math.sqrt((double) (local154 * local154 + local138 * local138 + arg7 * 4 * arg7)));
				this.aFloatArrayArray17[local119][local115] = local173 * (float) local138;
				this.aFloatArrayArray15[local119][local115] = local173 * (float) (-arg7 * 2);
				this.aFloatArrayArray16[local119][local115] = (float) local154 * local173;
			}
		}
		this.aClass25_37 = new Class25(128);
		if ((this.anInt8447 & 0x10) != 0) {
			this.aClass97_2 = new Class97(this.aClass82_Sub1_36, this);
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7721(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt8467 <= 0) {
			return;
		}
		this.aClass82_Sub1_36.method2062();
		this.aClass82_Sub1_36.method2051(false);
		this.aClass82_Sub1_36.method2028(false);
		this.aClass82_Sub1_36.method2055(false);
		this.aClass82_Sub1_36.method2032(false);
		this.aClass82_Sub1_36.method2085(0);
		this.aClass82_Sub1_36.method2057(-2);
		this.aClass82_Sub1_36.method2029((Class94) null);
		Static450.aFloatArray81[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass82_Sub1_36.anInt2450;
		Static450.aFloatArray81[11] = 0.0F;
		Static450.aFloatArray81[12] = -(((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass82_Sub1_36.anInt2300) - 1.0F;
		Static450.aFloatArray81[2] = 0.0F;
		Static450.aFloatArray81[5] = (float) 1024 / ((float) this.aClass82_Sub1_36.anInt2450 * (float) super.anInt8986 * 128.0F);
		Static450.aFloatArray81[4] = 0.0F;
		Static450.aFloatArray81[3] = 0.0F;
		Static450.aFloatArray81[10] = 0.0F;
		Static450.aFloatArray81[14] = 0.0F;
		Static450.aFloatArray81[9] = 0.0F;
		Static450.aFloatArray81[1] = 0.0F;
		Static450.aFloatArray81[0] = (float) 1024 / ((float) super.anInt8986 * 128.0F * (float) this.aClass82_Sub1_36.anInt2300);
		Static450.aFloatArray81[7] = 0.0F;
		Static450.aFloatArray81[6] = 0.0F;
		Static450.aFloatArray81[15] = 1.0F;
		Static450.aFloatArray81[8] = 0.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static450.aFloatArray81, 0);
		Static450.aFloatArray81[10] = 0.0F;
		Static450.aFloatArray81[5] = 0.0F;
		Static450.aFloatArray81[7] = 0.0F;
		Static450.aFloatArray81[14] = 0.0F;
		Static450.aFloatArray81[1] = 0.0F;
		Static450.aFloatArray81[6] = 1.0F;
		Static450.aFloatArray81[2] = 0.0F;
		Static450.aFloatArray81[8] = 0.0F;
		Static450.aFloatArray81[3] = 0.0F;
		Static450.aFloatArray81[12] = 0.0F;
		Static450.aFloatArray81[11] = 0.0F;
		Static450.aFloatArray81[4] = 0.0F;
		Static450.aFloatArray81[15] = 1.0F;
		Static450.aFloatArray81[9] = 1.0F;
		Static450.aFloatArray81[0] = 1.0F;
		Static450.aFloatArray81[13] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static450.aFloatArray81, 0);
		if ((this.anInt8447 & 0x7) == 0) {
			this.aClass82_Sub1_36.method2028(false);
		} else {
			this.aClass82_Sub1_36.method2028(true);
			this.aClass82_Sub1_36.method2092();
		}
		this.aClass82_Sub1_36.method2073(this.aClass313_16, this.aClass313_13, this.aClass313_14, this.aClass313_15);
		if (this.aClass82_Sub1_36.aClass3_Sub9_Sub1_2.aByteArray51.length < this.anInt8452 * 2) {
			this.aClass82_Sub1_36.aClass3_Sub9_Sub1_2 = new Class3_Sub9_Sub1(this.anInt8452 * 2);
		} else {
			this.aClass82_Sub1_36.aClass3_Sub9_Sub1_2.anInt6453 = 0;
		}
		@Pc(314) int local314 = 0;
		@Pc(318) Class3_Sub9_Sub1 local318 = this.aClass82_Sub1_36.aClass3_Sub9_Sub1_2;
		@Pc(324) int local324;
		@Pc(333) int local333;
		@Pc(335) int local335;
		@Pc(354) short[] local354;
		@Pc(358) int local358;
		if (this.aClass82_Sub1_36.aBoolean174) {
			for (local324 = arg1; local324 < arg3; local324++) {
				local333 = super.anInt8983 * local324 + arg0;
				for (local335 = arg0; local335 < arg2; local335++) {
					if (arg4[local335 - arg0][local324 - arg1]) {
						local354 = this.aShortArrayArray17[local333];
						if (local354 != null) {
							for (local358 = 0; local358 < local354.length; local358++) {
								local314++;
								local318.method5620(local354[local358] & 0xFFFF);
							}
						}
					}
					local333++;
				}
			}
		} else {
			for (local324 = arg1; local324 < arg3; local324++) {
				local333 = local324 * super.anInt8983 + arg0;
				for (local335 = arg0; local335 < arg2; local335++) {
					if (arg4[local335 - arg0][local324 - arg1]) {
						local354 = this.aShortArrayArray17[local333];
						if (local354 != null) {
							for (local358 = 0; local358 < local354.length; local358++) {
								local318.method5627(local354[local358] & 0xFFFF);
								local314++;
							}
						}
					}
					local333++;
				}
			}
		}
		if (local314 > 0) {
			@Pc(476) Class41_Sub1 local476 = new Class41_Sub1(this.aClass82_Sub1_36, 5123, local318.aByteArray51, local318.anInt6453);
			this.aClass82_Sub1_36.method2036(0, local314, local476);
		}
	}

	@OriginalMember(owner = "client!rq", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class3_Sub7_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass97_2 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (this.aClass82_Sub1_36.anInt2490 * arg2 >> 8) >> this.aClass82_Sub1_36.anInt2464;
			@Pc(38) int local38 = arg3 - (this.aClass82_Sub1_36.anInt2498 * arg2 >> 8) >> this.aClass82_Sub1_36.anInt2464;
			this.aClass97_2.method2366(arg0, local38, local23);
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method7718(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!rq", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class3_Sub7_Sub17 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub7_Sub17 arg2) {
		if ((this.aByteArrayArray22[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt8986 >> this.aClass82_Sub1_36.anInt2464;
		@Pc(27) Class3_Sub7_Sub17_Sub2 local27 = (Class3_Sub7_Sub17_Sub2) arg2;
		@Pc(43) Class3_Sub7_Sub17_Sub2 local43;
		if (local27 != null && local27.method6556(local24, local24)) {
			local43 = local27;
			local27.method6559();
		} else {
			local43 = new Class3_Sub7_Sub17_Sub2(this.aClass82_Sub1_36, local24, local24);
		}
		local43.method6561(local24, local24, 0, 0);
		this.method7303(arg1, arg0, local43);
		return local43;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(II)V")
	@Override
	public void method7717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIILclient!pfa;)V")
	private void method7303(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class3_Sub7_Sub17_Sub2 arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray28[arg1][arg0];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray31[arg1][arg0];
		@Pc(26) int local26 = local12.length;
		if (local26 > this.aClass82_Sub1_36.anIntArray158.length) {
			this.aClass82_Sub1_36.anIntArray158 = new int[local26];
			this.aClass82_Sub1_36.anIntArray159 = new int[local26];
		}
		@Pc(46) int[] local46 = this.aClass82_Sub1_36.anIntArray158;
		@Pc(50) int[] local50 = this.aClass82_Sub1_36.anIntArray159;
		for (@Pc(52) int local52 = 0; local52 < local26; local52++) {
			local46[local52] = local12[local52] >> this.aClass82_Sub1_36.anInt2464;
			local50[local52] = local19[local52] >> this.aClass82_Sub1_36.anInt2464;
		}
		@Pc(80) int local80 = 0;
		while (local26 > local80) {
			@Pc(86) int local86 = local46[local80];
			@Pc(91) int local91 = local50[local80++];
			@Pc(95) int local95 = local46[local80];
			@Pc(100) int local100 = local50[local80++];
			@Pc(104) int local104 = local46[local80];
			@Pc(109) int local109 = local50[local80++];
			if ((local86 - local95) * (-local109 + local100) - (local100 - local91) * (local104 + -local95) > 0) {
				arg2.method6557(local109, local104, local91, local95, local86, local100);
			}
		}
	}

	@OriginalMember(owner = "client!rq", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray23[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray23[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!rq", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class3_Sub7_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass97_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass82_Sub1_36.anInt2490 >> 8) >> this.aClass82_Sub1_36.anInt2464;
			@Pc(39) int local39 = arg3 - (this.aClass82_Sub1_36.anInt2498 * arg2 >> 8) >> this.aClass82_Sub1_36.anInt2464;
			this.aClass97_2.method2368(local39, arg0, local24);
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method7716(@OriginalArg(0) Class3_Sub7_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass97_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(24) int local24 = arg1 - (this.aClass82_Sub1_36.anInt2490 * arg2 >> 8) >> this.aClass82_Sub1_36.anInt2464;
			@Pc(38) int local38 = arg3 - (arg2 * this.aClass82_Sub1_36.anInt2498 >> 8) >> this.aClass82_Sub1_36.anInt2464;
			return this.aClass97_2.method2372(local38, arg0, local24);
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method7719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method7305(arg5, arg1, arg2, arg3, -1, arg0, arg4);
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method7714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method7305(arg6, arg1, arg2, arg3, arg5, arg0, arg4);
	}

	@OriginalMember(owner = "client!rq", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray32 == null) {
			this.anIntArrayArrayArray32 = new int[super.anInt8983][super.anInt8985][];
		}
		@Pc(21) Interface5 local21 = this.aClass82_Sub1_36.anInterface5_9;
		if (arg3 != null && this.anIntArrayArrayArray33 == null) {
			this.anIntArrayArrayArray33 = new int[super.anInt8983][super.anInt8985][];
		}
		this.anIntArrayArrayArray28[arg0][arg1] = arg2;
		this.anIntArrayArrayArray31[arg0][arg1] = arg4;
		this.anIntArrayArrayArray30[arg0][arg1] = arg6;
		this.anIntArrayArrayArray29[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray32 != null) {
			this.anIntArrayArrayArray32[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray33 != null) {
			this.anIntArrayArrayArray33[arg0][arg1] = arg3;
		}
		@Pc(92) Class3_Sub13[] local92 = this.aClass3_Sub13ArrayArrayArray1[arg0][arg1] = new Class3_Sub13[arg6.length];
		for (@Pc(94) int local94 = 0; local94 < arg6.length; local94++) {
			@Pc(100) int local100 = arg8[local94];
			@Pc(104) int local104 = arg9[local94];
			if ((this.anInt8447 & 0x20) != 0 && local100 != -1 && local21.method4129(local100).aBoolean743) {
				local100 = -1;
				local104 = 128;
			}
			@Pc(145) long local145 = (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48 | (long) (local104 << 14) | (long) local100;
			@Pc(151) Class3 local151;
			for (local151 = this.aClass25_37.method426(local145); local151 != null; local151 = this.aClass25_37.method429()) {
				@Pc(156) Class3_Sub13 local156 = (Class3_Sub13) local151;
				if (local156.anInt2187 == local100 && local156.aFloat27 == (float) local104 && arg10 == local156.anInt2189 && local156.anInt2193 == arg11 && local156.anInt2198 == arg12) {
					break;
				}
			}
			if (local151 == null) {
				local92[local94] = new Class3_Sub13(this, local100, local104, arg10, arg11, arg12);
				this.aClass25_37.method434(local145, local92[local94]);
			} else {
				local92[local94] = (Class3_Sub13) local151;
			}
		}
		if (arg13) {
			this.aByteArrayArray22[arg0][arg1] = (byte) (this.aByteArrayArray22[arg0][arg1] | 0x1);
		}
		if (this.anInt8468 < arg6.length) {
			this.anInt8468 = arg6.length;
		}
		this.anInt8467 += arg6.length;
	}

	@OriginalMember(owner = "client!rq", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.anInt8467 > 0) {
			@Pc(14) byte[][] local14 = new byte[super.anInt8983 + 1][super.anInt8985 + 1];
			@Pc(20) int local20;
			for (@Pc(16) int local16 = 1; super.anInt8983 > local16; local16++) {
				for (local20 = 1; local20 < super.anInt8985; local20++) {
					local14[local16][local20] = (byte) ((this.aByteArrayArray23[local16][local20] >> 1) + (this.aByteArrayArray23[local16][local20 + 1] >> 3) + (this.aByteArrayArray23[local16 - 1][local20] >> 2) + (this.aByteArrayArray23[local16 - -1][local20] >> 3) + (this.aByteArrayArray23[local16][local20 - 1] >> 2));
				}
			}
			this.aClass3_Sub13Array1 = new Class3_Sub13[this.aClass25_37.method430()];
			this.aClass25_37.method431(this.aClass3_Sub13Array1);
			for (local20 = 0; local20 < this.aClass3_Sub13Array1.length; local20++) {
				this.aClass3_Sub13Array1[local20].method1808(this.anInt8467);
			}
			@Pc(132) int local132 = 24;
			if (this.anIntArrayArrayArray32 != null) {
				local132 += 4;
			}
			if ((this.anInt8447 & 0x7) != 0) {
				local132 += 12;
			}
			@Pc(155) NativeHeapBuffer local155 = this.aClass82_Sub1_36.aNativeHeap1.a(this.anInt8467 * local132, false);
			@Pc(160) Stream local160 = new Stream(local155);
			@Pc(164) Class3_Sub13[] local164 = new Class3_Sub13[this.anInt8467];
			@Pc(171) int local171 = Static107.method1798(this.anInt8467 / 4);
			if (local171 < 1) {
				local171 = 1;
			}
			@Pc(183) Class25 local183 = new Class25(local171);
			@Pc(187) Class3_Sub13[] local187 = new Class3_Sub13[this.anInt8468];
			@Pc(193) int local193;
			for (@Pc(189) int local189 = 0; local189 < super.anInt8983; local189++) {
				for (local193 = 0; local193 < super.anInt8985; local193++) {
					if (this.anIntArrayArrayArray30[local189][local193] != null) {
						@Pc(209) Class3_Sub13[] local209 = this.aClass3_Sub13ArrayArrayArray1[local189][local193];
						@Pc(216) int[] local216 = this.anIntArrayArrayArray28[local189][local193];
						@Pc(223) int[] local223 = this.anIntArrayArrayArray31[local189][local193];
						@Pc(230) int[] local230 = this.anIntArrayArrayArray29[local189][local193];
						@Pc(237) int[] local237 = this.anIntArrayArrayArray30[local189][local193];
						@Pc(249) int[] local249 = this.anIntArrayArrayArray33 == null ? null : this.anIntArrayArrayArray33[local189][local193];
						if (local230 == null) {
							local230 = local237;
						}
						@Pc(265) int[] local265 = this.anIntArrayArrayArray32 == null ? null : this.anIntArrayArrayArray32[local189][local193];
						@Pc(272) float local272 = this.aFloatArrayArray17[local189][local193];
						@Pc(279) float local279 = this.aFloatArrayArray15[local189][local193];
						@Pc(286) float local286 = this.aFloatArrayArray16[local189][local193];
						@Pc(295) float local295 = this.aFloatArrayArray17[local189][local193 + 1];
						@Pc(304) float local304 = this.aFloatArrayArray15[local189][local193 + 1];
						@Pc(313) float local313 = this.aFloatArrayArray16[local189][local193 + 1];
						@Pc(324) float local324 = this.aFloatArrayArray17[local189 + 1][local193 + 1];
						@Pc(335) float local335 = this.aFloatArrayArray15[local189 + 1][local193 + 1];
						@Pc(346) float local346 = this.aFloatArrayArray16[local189 + 1][local193 + 1];
						@Pc(355) float local355 = this.aFloatArrayArray17[local189 + 1][local193];
						@Pc(364) float local364 = this.aFloatArrayArray15[local189 + 1][local193];
						@Pc(373) float local373 = this.aFloatArrayArray16[local189 + 1][local193];
						@Pc(381) int local381 = local14[local189][local193] & 0xFF;
						@Pc(391) int local391 = local14[local189][local193 + 1] & 0xFF;
						@Pc(403) int local403 = local14[local189 + 1][local193 + 1] & 0xFF;
						@Pc(413) int local413 = local14[local189 + 1][local193] & 0xFF;
						@Pc(415) int local415 = 0;
						@Pc(425) int local425;
						label335: for (@Pc(417) int local417 = 0; local417 < local237.length; local417++) {
							@Pc(423) Class3_Sub13 local423 = local209[local417];
							for (local425 = 0; local425 < local415; local425++) {
								if (local187[local425] == local423) {
									continue label335;
								}
							}
							local187[local415++] = local423;
						}
						@Pc(471) short[] local471 = this.aShortArrayArray17[super.anInt8983 * local193 + local189] = new short[local237.length];
						for (local425 = 0; local425 < local237.length; local425++) {
							@Pc(484) int local484 = (local189 << super.anInt8988) + local216[local425];
							@Pc(494) int local494 = (local193 << super.anInt8988) + local223[local425];
							@Pc(499) int local499 = local484 >> this.anInt8448;
							@Pc(504) int local504 = local494 >> this.anInt8448;
							@Pc(508) int local508 = local237[local425];
							@Pc(512) int local512 = local230[local425];
							@Pc(520) int local520 = local249 == null ? 0 : local249[local425];
							@Pc(538) long local538 = (long) local504 | (long) (local499 << 16) | (long) local508 << 32 | (long) local512 << 48;
							@Pc(542) int local542 = local216[local425];
							@Pc(546) int local546 = local223[local425];
							@Pc(548) byte local548 = 74;
							@Pc(550) int local550 = 0;
							@Pc(552) float local552 = 1.0F;
							@Pc(564) float local564;
							@Pc(566) float local566;
							@Pc(558) float local558;
							@Pc(645) float local645;
							@Pc(562) int local562;
							if (local542 == 0 && local546 == 0) {
								local558 = local286;
								local562 = local548 - local381;
								local564 = local272;
								local566 = local279;
							} else if (local542 == 0 && super.anInt8986 == local546) {
								local564 = local295;
								local558 = local313;
								local562 = local548 - local391;
								local566 = local304;
							} else if (local542 == super.anInt8986 && local546 == super.anInt8986) {
								local564 = local324;
								local566 = local335;
								local562 = local548 - local403;
								local558 = local346;
							} else if (local542 == super.anInt8986 && local546 == 0) {
								local562 = local548 - local413;
								local566 = local364;
								local558 = local373;
								local564 = local355;
							} else {
								@Pc(621) float local621 = (float) local542 / (float) super.anInt8986;
								@Pc(628) float local628 = (float) local546 / (float) super.anInt8986;
								@Pc(637) float local637 = (local355 - local272) * local621 + local272;
								local645 = (local364 - local279) * local621 + local279;
								@Pc(654) float local654 = local621 * (local373 - local286) + local286;
								@Pc(663) float local663 = local621 * (local324 - local295) + local295;
								@Pc(672) float local672 = local304 + local621 * (local335 - local304);
								@Pc(680) float local680 = local313 + (local346 - local313) * local621;
								local566 = local645 + (local672 - local645) * local628;
								local564 = (local663 - local637) * local628 + local637;
								local558 = local628 * (local680 - local654) + local654;
								@Pc(718) int local718 = ((local413 - local381) * local542 >> super.anInt8988) + local381;
								@Pc(729) int local729 = ((local403 - local391) * local542 >> super.anInt8988) + local391;
								local562 = local548 - local718 - (local546 * (local729 - local718) >> super.anInt8988);
							}
							if (local508 != -1) {
								@Pc(778) int local778 = (local508 & 0x7F) * local562 >> 7;
								if (local778 < 2) {
									local778 = 2;
								} else if (local778 > 126) {
									local778 = 126;
								}
								local550 = Static205.anIntArray530[local508 & 0xFF80 | local778];
								if ((this.anInt8447 & 0x7) == 0) {
									local552 = this.aClass82_Sub1_36.aFloatArray11[0] * local564 + local566 * this.aClass82_Sub1_36.aFloatArray11[1] + local558 * this.aClass82_Sub1_36.aFloatArray11[2];
									local552 = local552 * (local552 > 0.0F ? this.aClass82_Sub1_36.aFloat31 : this.aClass82_Sub1_36.aFloat47) + this.aClass82_Sub1_36.aFloat36;
								}
							}
							@Pc(849) Class3 local849 = null;
							if ((local484 & this.anInt8456 - 1) == 0 && (this.anInt8456 - 1 & local494) == 0) {
								local849 = local183.method426(local538);
							}
							@Pc(1208) int local1208;
							@Pc(910) int local910;
							if (local849 == null) {
								if (local512 == local508) {
									local910 = local550;
								} else {
									@Pc(888) int local888 = (local512 & 0x7F) * local562 >> 7;
									if (local888 < 2) {
										local888 = 2;
									} else if (local888 > 126) {
										local888 = 126;
									}
									local910 = Static205.anIntArray530[local888 | local512 & 0xFF80];
									if ((this.anInt8447 & 0x7) == 0) {
										local645 = this.aClass82_Sub1_36.aFloatArray11[2] * local558 + local566 * this.aClass82_Sub1_36.aFloatArray11[1] + this.aClass82_Sub1_36.aFloatArray11[0] * local564;
										local645 = this.aClass82_Sub1_36.aFloat36 + local552 * (local552 > 0.0F ? this.aClass82_Sub1_36.aFloat31 : this.aClass82_Sub1_36.aFloat47);
										@Pc(963) int local963 = local910 >> 16 & 0xFF;
										@Pc(969) int local969 = local910 >> 8 & 0xFF;
										local963 = (int) ((float) local963 * local645);
										@Pc(979) int local979 = local910 & 0xFF;
										if (local963 < 0) {
											local963 = 0;
										} else if (local963 > 255) {
											local963 = 255;
										}
										local969 = (int) ((float) local969 * local645);
										if (local969 < 0) {
											local969 = 0;
										} else if (local969 > 255) {
											local969 = 255;
										}
										local979 = (int) ((float) local979 * local645);
										if (local979 < 0) {
											local979 = 0;
										} else if (local979 > 255) {
											local979 = 255;
										}
										local910 = local969 << 8 | local963 << 16 | local979;
									}
								}
								if (this.aClass82_Sub1_36.aBoolean174) {
									local160.a((float) local484);
									local160.a((float) (local520 + this.method7725(local484, local494)));
									local160.a((float) local494);
									local160.b((byte) (local910 >> 16));
									local160.b((byte) (local910 >> 8));
									local160.b((byte) local910);
									local160.b(-1);
									local160.a((float) local484);
									local160.a((float) local494);
									if (this.anIntArrayArrayArray32 != null) {
										local160.a((float) (local265 == null ? 0 : local265[local425] - 1));
									}
									if ((this.anInt8447 & 0x7) != 0) {
										local160.a(local564);
										local160.a(local566);
										local160.a(local558);
									}
								} else {
									local160.b((float) local484);
									local160.b((float) (local520 + this.method7725(local484, local494)));
									local160.b((float) local494);
									local160.b((byte) (local910 >> 16));
									local160.b((byte) (local910 >> 8));
									local160.b((byte) local910);
									local160.b(-1);
									local160.b((float) local484);
									local160.b((float) local494);
									if (this.anIntArrayArrayArray32 != null) {
										local160.b((float) (local265 == null ? 0 : local265[local425] - 1));
									}
									if ((this.anInt8447 & 0x7) != 0) {
										local160.b(local564);
										local160.b(local566);
										local160.b(local558);
									}
								}
								local1208 = this.anInt8464++;
								local471[local425] = (short) local1208;
								if (local508 != -1) {
									local164[local1208] = local209[local425];
								}
								local183.method434(local538, new Class3_Sub8(local471[local425]));
							} else {
								local471[local425] = ((Class3_Sub8) local849).aShort1;
								local1208 = local471[local425] & 0xFFFF;
								if (local508 != -1 && local164[local1208].aLong277 > local209[local425].aLong277) {
									local164[local1208] = local209[local425];
								}
							}
							for (local910 = 0; local910 < local415; local910++) {
								local187[local910].method1814(local562, local1208, local552, local550);
							}
							this.anInt8452++;
						}
					}
				}
			}
			for (local193 = 0; local193 < this.anInt8464; local193++) {
				@Pc(1333) Class3_Sub13 local1333 = local164[local193];
				if (local1333 != null) {
					local1333.method1811(local193);
				}
			}
			@Pc(1366) int local1366;
			for (@Pc(1346) int local1346 = 0; super.anInt8983 > local1346; local1346++) {
				for (@Pc(1350) int local1350 = 0; local1350 < super.anInt8985; local1350++) {
					@Pc(1362) short[] local1362 = this.aShortArrayArray17[local1346 + local1350 * super.anInt8983];
					if (local1362 != null) {
						local1366 = 0;
						@Pc(1368) int local1368 = 0;
						while (local1368 < local1362.length) {
							@Pc(1377) int local1377 = local1362[local1368++] & 0xFFFF;
							@Pc(1384) int local1384 = local1362[local1368++] & 0xFFFF;
							@Pc(1391) int local1391 = local1362[local1368++] & 0xFFFF;
							@Pc(1395) Class3_Sub13 local1395 = local164[local1377];
							@Pc(1399) Class3_Sub13 local1399 = local164[local1384];
							@Pc(1403) Class3_Sub13 local1403 = local164[local1391];
							@Pc(1405) Class3_Sub13 local1405 = null;
							if (local1395 != null) {
								local1405 = local1395;
								local1395.method1812(local1346, local1366, local1350);
							}
							if (local1399 != null) {
								local1399.method1812(local1346, local1366, local1350);
								if (local1405 == null || local1399.aLong277 < local1405.aLong277) {
									local1405 = local1399;
								}
							}
							if (local1403 != null) {
								local1403.method1812(local1346, local1366, local1350);
								if (local1405 == null || local1405.aLong277 > local1403.aLong277) {
									local1405 = local1403;
								}
							}
							if (local1405 != null) {
								if (local1395 != null) {
									local1405.method1811(local1377);
								}
								if (local1399 != null) {
									local1405.method1811(local1384);
								}
								if (local1403 != null) {
									local1405.method1811(local1391);
								}
								local1405.method1812(local1346, local1366, local1350);
							}
							local1366++;
						}
					}
				}
			}
			local160.b();
			this.anInterface3_6 = this.aClass82_Sub1_36.method2019(local132, local155, local160.a());
			this.aClass313_15 = new Class313(this.anInterface3_6, 5126, 3, 0);
			this.aClass313_16 = new Class313(this.anInterface3_6, 5121, 4, 12);
			@Pc(1552) byte local1552;
			if (this.anIntArrayArrayArray32 == null) {
				local1552 = 24;
				this.aClass313_13 = new Class313(this.anInterface3_6, 5126, 2, 16);
			} else {
				this.aClass313_13 = new Class313(this.anInterface3_6, 5126, 3, 16);
				local1552 = 28;
			}
			if ((this.anInt8447 & 0x7) != 0) {
				this.aClass313_14 = new Class313(this.anInterface3_6, 5126, 3, local1552);
			}
			@Pc(1586) long[] local1586 = new long[this.aClass3_Sub13Array1.length];
			for (local1366 = 0; local1366 < this.aClass3_Sub13Array1.length; local1366++) {
				@Pc(1595) Class3_Sub13 local1595 = this.aClass3_Sub13Array1[local1366];
				local1586[local1366] = local1595.aLong277;
				local1595.method1813(this.anInt8464);
			}
			Static618.method8428(local1586, this.aClass3_Sub13Array1);
			if (this.aClass97_2 != null) {
				this.aClass97_2.method2370();
			}
		} else {
			this.aClass97_2 = null;
		}
		this.aClass25_37 = null;
		this.anIntArrayArrayArray28 = this.anIntArrayArrayArray31 = null;
		this.anIntArrayArrayArray29 = null;
		this.aFloatArrayArray17 = this.aFloatArrayArray15 = this.aFloatArrayArray16 = null;
		this.anIntArrayArrayArray30 = null;
		this.aByteArrayArray23 = null;
		this.anIntArrayArrayArray32 = null;
		this.aClass3_Sub13ArrayArrayArray1 = null;
		this.anIntArrayArrayArray33 = null;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lclient!tj;[I)V")
	@Override
	public void method7722(@OriginalArg(0) Class3_Sub22 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass216_58.method5449(new Class3_Sub37(this.aClass82_Sub1_36, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIII[[ZIIZ)V")
	private void method7305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6) {
		if (this.aClass3_Sub13Array1 == null) {
			return;
		}
		@Pc(11) int local11 = arg2 + arg2 + 1;
		@Pc(15) int local15 = local11 * local11;
		if (local15 > this.aClass82_Sub1_36.anIntArray157.length) {
			this.aClass82_Sub1_36.anIntArray157 = new int[local15];
		}
		if (this.aClass82_Sub1_36.aClass3_Sub9_Sub1_2.aByteArray51.length < this.anInt8452 * 2) {
			this.aClass82_Sub1_36.aClass3_Sub9_Sub1_2 = new Class3_Sub9_Sub1(this.anInt8452 * 2);
		}
		@Pc(55) int local55 = arg5 - arg2;
		@Pc(57) int local57 = local55;
		if (local55 < 0) {
			local55 = 0;
		}
		@Pc(69) int local69 = arg1 - arg2;
		@Pc(71) int local71 = local69;
		if (local69 < 0) {
			local69 = 0;
		}
		@Pc(80) int local80 = arg5 + arg2;
		if (local80 > super.anInt8983 - 1) {
			local80 = super.anInt8983 - 1;
		}
		@Pc(100) int local100 = arg1 + arg2;
		if (super.anInt8985 - 1 < local100) {
			local100 = super.anInt8985 - 1;
		}
		@Pc(117) int local117 = 0;
		@Pc(121) int[] local121 = this.aClass82_Sub1_36.anIntArray157;
		@Pc(133) int local133;
		for (@Pc(123) int local123 = local55; local123 <= local80; local123++) {
			@Pc(131) boolean[] local131 = arg3[local123 - local57];
			for (local133 = local69; local133 <= local100; local133++) {
				if (local131[local133 - local71]) {
					local121[local117++] = super.anInt8983 * local133 + local123;
				}
			}
		}
		if (arg4 == -1) {
			this.aClass82_Sub1_36.method2048();
		} else {
			this.aClass82_Sub1_36.method2054((float) arg4);
			this.aClass82_Sub1_36.method2088();
		}
		this.aClass82_Sub1_36.method2028((this.anInt8447 & 0x7) != 0);
		for (@Pc(196) int local196 = 0; local196 < this.aClass3_Sub13Array1.length; local196++) {
			this.aClass3_Sub13Array1[local196].method1807(local117, local121);
		}
		if (!this.aClass216_58.method5455()) {
			local133 = this.aClass82_Sub1_36.anInt2475;
			@Pc(229) int local229 = this.aClass82_Sub1_36.anInt2504;
			this.aClass82_Sub1_36.L(0, local229, this.aClass82_Sub1_36.anInt2492);
			this.aClass82_Sub1_36.method2028(false);
			this.aClass82_Sub1_36.method2032(false);
			this.aClass82_Sub1_36.method2085(128);
			this.aClass82_Sub1_36.method2057(-2);
			this.aClass82_Sub1_36.method2029(this.aClass82_Sub1_36.aClass94_Sub2_1);
			this.aClass82_Sub1_36.method2077(8448, 7681);
			this.aClass82_Sub1_36.method2066(34166, 770, 0);
			this.aClass82_Sub1_36.method2063(34167, 0);
			for (@Pc(291) Class3 local291 = this.aClass216_58.method5457(); local291 != null; local291 = this.aClass216_58.method5458()) {
				@Pc(296) Class3_Sub37 local296 = (Class3_Sub37) local291;
				local296.method6069(arg1, arg3, arg5, arg2);
			}
			this.aClass82_Sub1_36.method2066(5890, 768, 0);
			this.aClass82_Sub1_36.method2063(5890, 0);
			this.aClass82_Sub1_36.method2029((Class94) null);
			this.aClass82_Sub1_36.L(local133, local229, this.aClass82_Sub1_36.anInt2492);
		}
		if (this.aClass97_2 == null) {
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		this.aClass82_Sub1_36.method2073((Class313) null, this.aClass313_13, (Class313) null, this.aClass313_15);
		this.aClass97_2.method2365(arg5, arg6, arg2, arg3, arg1);
		OpenGL.glPopMatrix();
	}
}
