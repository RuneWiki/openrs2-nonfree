import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mt")
public final class Class51_Sub3 extends Class51 {

	@OriginalMember(owner = "client!mt", name = "t", descriptor = "I")
	private int anInt6845;

	@OriginalMember(owner = "client!mt", name = "x", descriptor = "I")
	private int anInt6848;

	@OriginalMember(owner = "client!mt", name = "F", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray17;

	@OriginalMember(owner = "client!mt", name = "V", descriptor = "Lclient!jaa;")
	public Class164 aClass164_13;

	@OriginalMember(owner = "client!mt", name = "X", descriptor = "I")
	private int anInt6862;

	@OriginalMember(owner = "client!mt", name = "Y", descriptor = "Lclient!lca;")
	private Interface14 anInterface14_7;

	@OriginalMember(owner = "client!mt", name = "Z", descriptor = "Lclient!jaa;")
	private Class164 aClass164_14;

	@OriginalMember(owner = "client!mt", name = "ab", descriptor = "Lclient!jaa;")
	public Class164 aClass164_15;

	@OriginalMember(owner = "client!mt", name = "bb", descriptor = "[Lclient!ct;")
	private Class3_Sub9[] aClass3_Sub9Array1;

	@OriginalMember(owner = "client!mt", name = "eb", descriptor = "Lclient!jaa;")
	public Class164 aClass164_16;

	@OriginalMember(owner = "client!mt", name = "fb", descriptor = "I")
	private int anInt6863;

	@OriginalMember(owner = "client!mt", name = "S", descriptor = "Lclient!mr;")
	private final Class223 aClass223_41 = new Class223();

	@OriginalMember(owner = "client!mt", name = "n", descriptor = "Lclient!kw;")
	public final Class5_Sub2 aClass5_Sub2_28;

	@OriginalMember(owner = "client!mt", name = "O", descriptor = "I")
	private final int anInt6858;

	@OriginalMember(owner = "client!mt", name = "db", descriptor = "[[F")
	private float[][] aFloatArrayArray17;

	@OriginalMember(owner = "client!mt", name = "H", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray18;

	@OriginalMember(owner = "client!mt", name = "L", descriptor = "[[[Lclient!ct;")
	private Class3_Sub9[][][] aClass3_Sub9ArrayArrayArray1;

	@OriginalMember(owner = "client!mt", name = "w", descriptor = "I")
	public final int anInt6847;

	@OriginalMember(owner = "client!mt", name = "u", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!mt", name = "U", descriptor = "[[B")
	private byte[][] aByteArrayArray21;

	@OriginalMember(owner = "client!mt", name = "cb", descriptor = "[[F")
	private float[][] aFloatArrayArray16;

	@OriginalMember(owner = "client!mt", name = "o", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!mt", name = "B", descriptor = "I")
	private final int anInt6852;

	@OriginalMember(owner = "client!mt", name = "p", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!mt", name = "M", descriptor = "[[S")
	public final short[][] aShortArrayArray12;

	@OriginalMember(owner = "client!mt", name = "C", descriptor = "[[B")
	private final byte[][] aByteArrayArray20;

	@OriginalMember(owner = "client!mt", name = "W", descriptor = "[[F")
	private float[][] aFloatArrayArray15;

	@OriginalMember(owner = "client!mt", name = "J", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray19;

	@OriginalMember(owner = "client!mt", name = "T", descriptor = "Lclient!qp;")
	private Class280 aClass280_30;

	@OriginalMember(owner = "client!mt", name = "G", descriptor = "Lclient!cea;")
	private Class47 aClass47_1;

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Lclient!kw;IIII[[I[[II)V")
	public Class51_Sub3(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass5_Sub2_28 = arg0;
		this.anInt6858 = super.anInt9117 - 2;
		this.aFloatArrayArray17 = new float[super.anInt9121 + 1][super.anInt9115 + 1];
		this.anIntArrayArrayArray18 = new int[arg3][arg4][];
		this.aClass3_Sub9ArrayArrayArray1 = new Class3_Sub9[arg3][arg4][];
		this.anInt6847 = arg2;
		this.anIntArrayArrayArray16 = new int[arg3][arg4][];
		this.aByteArrayArray21 = new byte[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray16 = new float[super.anInt9121 + 1][super.anInt9115 + 1];
		this.anIntArrayArrayArray14 = new int[arg3][arg4][];
		this.anInt6852 = 0x1 << this.anInt6858;
		this.anIntArrayArrayArray15 = new int[arg3][arg4][];
		this.aShortArrayArray12 = new short[arg4 * arg3][];
		this.aByteArrayArray20 = new byte[arg3][arg4];
		this.aFloatArrayArray15 = new float[super.anInt9121 + 1][super.anInt9115 + 1];
		this.anIntArrayArrayArray19 = new int[arg3][arg4][];
		for (@Pc(115) int local115 = 1; local115 < super.anInt9115; local115++) {
			for (@Pc(119) int local119 = 1; local119 < super.anInt9121; local119++) {
				@Pc(138) int local138 = arg6[local119 + 1][local115] - arg6[local119 - 1][local115];
				@Pc(154) int local154 = arg6[local119][local115 + 1] - arg6[local119][local115 - 1];
				@Pc(173) float local173 = (float) (1.0D / Math.sqrt((double) (local154 * local154 + local138 * local138 + arg7 * 4 * arg7)));
				this.aFloatArrayArray15[local119][local115] = (float) local138 * local173;
				this.aFloatArrayArray16[local119][local115] = local173 * (float) (-arg7 * 2);
				this.aFloatArrayArray17[local119][local115] = (float) local154 * local173;
			}
		}
		this.aClass280_30 = new Class280(128);
		if ((this.anInt6847 & 0x10) != 0) {
			this.aClass47_1 = new Class47(this.aClass5_Sub2_28, this);
		}
	}

	@OriginalMember(owner = "client!mt", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class3_Sub4_Sub5 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub4_Sub5 arg2) {
		if ((this.aByteArrayArray20[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt9118 >> this.aClass5_Sub2_28.anInt5644;
		@Pc(27) Class3_Sub4_Sub5_Sub1 local27 = (Class3_Sub4_Sub5_Sub1) arg2;
		@Pc(37) Class3_Sub4_Sub5_Sub1 local37;
		if (local27 != null && local27.method2492(local24, local24)) {
			local37 = local27;
			local27.method2493();
		} else {
			local37 = new Class3_Sub4_Sub5_Sub1(this.aClass5_Sub2_28, local24, local24);
		}
		local37.method2497(local24, 0, 0, local24);
		this.method5893(arg1, local37, arg0);
		return local37;
	}

	@OriginalMember(owner = "client!mt", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray21[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray21[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7840(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt6862 <= 0) {
			return;
		}
		this.aClass5_Sub2_28.method4970();
		this.aClass5_Sub2_28.method5023(false);
		this.aClass5_Sub2_28.method4975(false);
		this.aClass5_Sub2_28.method5013(false);
		this.aClass5_Sub2_28.method4993(false);
		this.aClass5_Sub2_28.method4971(0);
		this.aClass5_Sub2_28.method5009(-2);
		this.aClass5_Sub2_28.method4997(null);
		Static621.aFloatArray80[6] = 0.0F;
		Static621.aFloatArray80[2] = 0.0F;
		Static621.aFloatArray80[12] = -1.0F - ((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass5_Sub2_28.anInt5529;
		Static621.aFloatArray80[15] = 1.0F;
		Static621.aFloatArray80[1] = 0.0F;
		Static621.aFloatArray80[9] = 0.0F;
		Static621.aFloatArray80[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass5_Sub2_28.anInt5457;
		Static621.aFloatArray80[3] = 0.0F;
		Static621.aFloatArray80[8] = 0.0F;
		Static621.aFloatArray80[7] = 0.0F;
		Static621.aFloatArray80[11] = 0.0F;
		Static621.aFloatArray80[4] = 0.0F;
		Static621.aFloatArray80[10] = 0.0F;
		Static621.aFloatArray80[5] = (float) 1024 / ((float) super.anInt9118 * 128.0F * (float) this.aClass5_Sub2_28.anInt5457);
		Static621.aFloatArray80[0] = (float) 1024 / ((float) this.aClass5_Sub2_28.anInt5529 * 128.0F * (float) super.anInt9118);
		Static621.aFloatArray80[14] = 0.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static621.aFloatArray80, 0);
		Static621.aFloatArray80[5] = 0.0F;
		Static621.aFloatArray80[4] = 0.0F;
		Static621.aFloatArray80[12] = 0.0F;
		Static621.aFloatArray80[9] = 1.0F;
		Static621.aFloatArray80[10] = 0.0F;
		Static621.aFloatArray80[8] = 0.0F;
		Static621.aFloatArray80[11] = 0.0F;
		Static621.aFloatArray80[13] = 0.0F;
		Static621.aFloatArray80[6] = 1.0F;
		Static621.aFloatArray80[7] = 0.0F;
		Static621.aFloatArray80[2] = 0.0F;
		Static621.aFloatArray80[1] = 0.0F;
		Static621.aFloatArray80[0] = 1.0F;
		Static621.aFloatArray80[15] = 1.0F;
		Static621.aFloatArray80[14] = 0.0F;
		Static621.aFloatArray80[3] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static621.aFloatArray80, 0);
		if ((this.anInt6847 & 0x7) == 0) {
			this.aClass5_Sub2_28.method4975(false);
		} else {
			this.aClass5_Sub2_28.method4975(true);
			this.aClass5_Sub2_28.method4966();
		}
		this.aClass5_Sub2_28.method4967(this.aClass164_13, this.aClass164_14, this.aClass164_16, this.aClass164_15);
		if (this.aClass5_Sub2_28.aClass3_Sub3_Sub1_3.aByteArray54.length < this.anInt6845 * 2) {
			this.aClass5_Sub2_28.aClass3_Sub3_Sub1_3 = new Class3_Sub3_Sub1(this.anInt6845 * 2);
		} else {
			this.aClass5_Sub2_28.aClass3_Sub3_Sub1_3.anInt4736 = 0;
		}
		@Pc(309) int local309 = 0;
		@Pc(313) Class3_Sub3_Sub1 local313 = this.aClass5_Sub2_28.aClass3_Sub3_Sub1_3;
		@Pc(319) int local319;
		@Pc(329) int local329;
		@Pc(331) int local331;
		@Pc(350) short[] local350;
		@Pc(354) int local354;
		if (this.aClass5_Sub2_28.aBoolean387) {
			for (local319 = arg1; local319 < arg3; local319++) {
				local329 = arg0 + local319 * super.anInt9121;
				for (local331 = arg0; local331 < arg2; local331++) {
					if (arg4[local331 - arg0][local319 - arg1]) {
						local350 = this.aShortArrayArray12[local329];
						if (local350 != null) {
							for (local354 = 0; local354 < local350.length; local354++) {
								local309++;
								local313.method4201(local350[local354] & 0xFFFF);
							}
						}
					}
					local329++;
				}
			}
		} else {
			for (local319 = arg1; local319 < arg3; local319++) {
				local329 = super.anInt9121 * local319 + arg0;
				for (local331 = arg0; local331 < arg2; local331++) {
					if (arg4[local331 - arg0][local319 - arg1]) {
						local350 = this.aShortArrayArray12[local329];
						if (local350 != null) {
							for (local354 = 0; local354 < local350.length; local354++) {
								local313.method4257(local350[local354] & 0xFFFF);
								local309++;
							}
						}
					}
					local329++;
				}
			}
		}
		if (local309 > 0) {
			@Pc(459) Class19_Sub2 local459 = new Class19_Sub2(this.aClass5_Sub2_28, 5123, local313.aByteArray54, local313.anInt4736);
			this.aClass5_Sub2_28.method4968(local459, 0, local309);
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method7836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method7837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method5894(arg3, arg0, arg4, arg2, arg5, arg1, arg6);
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(Lclient!wh;[I)V")
	@Override
	public void method7834(@OriginalArg(0) Class3_Sub16 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass223_41.method5868(new Class3_Sub24(this.aClass5_Sub2_28, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method7833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method5894(arg3, arg0, arg4, arg2, -1, arg1, arg5);
	}

	@OriginalMember(owner = "client!mt", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg3 != null && this.anIntArrayArrayArray19 == null) {
			this.anIntArrayArrayArray19 = new int[super.anInt9121][super.anInt9115][];
		}
		if (arg5 != null && this.anIntArrayArrayArray17 == null) {
			this.anIntArrayArrayArray17 = new int[super.anInt9121][super.anInt9115][];
		}
		@Pc(33) Interface7 local33 = this.aClass5_Sub2_28.anInterface7_15;
		this.anIntArrayArrayArray14[arg0][arg1] = arg2;
		this.anIntArrayArrayArray15[arg0][arg1] = arg4;
		this.anIntArrayArrayArray16[arg0][arg1] = arg6;
		this.anIntArrayArrayArray18[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray17 != null) {
			this.anIntArrayArrayArray17[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray19 != null) {
			this.anIntArrayArrayArray19[arg0][arg1] = arg3;
		}
		@Pc(92) Class3_Sub9[] local92 = this.aClass3_Sub9ArrayArrayArray1[arg0][arg1] = new Class3_Sub9[arg6.length];
		for (@Pc(94) int local94 = 0; local94 < arg6.length; local94++) {
			@Pc(100) int local100 = arg8[local94];
			@Pc(104) int local104 = arg9[local94];
			if ((this.anInt6847 & 0x20) != 0 && local100 != -1 && local33.method8118(local100).aBoolean365) {
				local100 = -1;
				local104 = 128;
			}
			@Pc(145) long local145 = (long) local100 | (long) (local104 << 14) | (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28;
			@Pc(151) Class3 local151;
			for (local151 = this.aClass280_30.method7107(local145); local151 != null; local151 = this.aClass280_30.method7105()) {
				@Pc(156) Class3_Sub9 local156 = (Class3_Sub9) local151;
				if (local156.anInt2067 == local100 && local156.aFloat68 == (float) local104 && arg10 == local156.anInt2073 && local156.anInt2060 == arg11 && local156.anInt2072 == arg12) {
					break;
				}
			}
			if (local151 == null) {
				local92[local94] = new Class3_Sub9(this, local100, local104, arg10, arg11, arg12);
				this.aClass280_30.method7109(local92[local94], local145);
			} else {
				local92[local94] = (Class3_Sub9) local151;
			}
		}
		if (arg13) {
			this.aByteArrayArray20[arg0][arg1] = (byte) (this.aByteArrayArray20[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt6863) {
			this.anInt6863 = arg6.length;
		}
		this.anInt6862 += arg6.length;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method7831(@OriginalArg(0) Class3_Sub4_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass47_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (this.aClass5_Sub2_28.anInt5675 * arg2 >> 8) >> this.aClass5_Sub2_28.anInt5644;
			@Pc(40) int local40 = arg3 - (arg2 * this.aClass5_Sub2_28.anInt5688 >> 8) >> this.aClass5_Sub2_28.anInt5644;
			return this.aClass47_1.method1670(local40, local25, arg0);
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(II)V")
	@Override
	public void method7830(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!mt", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class3_Sub4_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass47_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass5_Sub2_28.anInt5675 >> 8) >> this.aClass5_Sub2_28.anInt5644;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass5_Sub2_28.anInt5688 >> 8) >> this.aClass5_Sub2_28.anInt5644;
			this.aClass47_1.method1676(local24, arg0, local39);
		}
	}

	@OriginalMember(owner = "client!mt", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class3_Sub4_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass47_1 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (arg2 * this.aClass5_Sub2_28.anInt5675 >> 8) >> this.aClass5_Sub2_28.anInt5644;
			@Pc(38) int local38 = arg3 - (this.aClass5_Sub2_28.anInt5688 * arg2 >> 8) >> this.aClass5_Sub2_28.anInt5644;
			this.aClass47_1.method1673(arg0, local38, local23);
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(ILclient!eh;II)V")
	private void method5893(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4_Sub5_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray14[arg2][arg0];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray15[arg2][arg0];
		@Pc(22) int local22 = local12.length;
		if (local22 > this.aClass5_Sub2_28.anIntArray300.length) {
			this.aClass5_Sub2_28.anIntArray300 = new int[local22];
			this.aClass5_Sub2_28.anIntArray301 = new int[local22];
		}
		@Pc(46) int[] local46 = this.aClass5_Sub2_28.anIntArray300;
		@Pc(50) int[] local50 = this.aClass5_Sub2_28.anIntArray301;
		for (@Pc(52) int local52 = 0; local52 < local22; local52++) {
			local46[local52] = local12[local52] >> this.aClass5_Sub2_28.anInt5644;
			local50[local52] = local19[local52] >> this.aClass5_Sub2_28.anInt5644;
		}
		@Pc(84) int local84 = 0;
		while (local22 > local84) {
			@Pc(90) int local90 = local46[local84];
			@Pc(95) int local95 = local50[local84++];
			@Pc(99) int local99 = local46[local84];
			@Pc(104) int local104 = local50[local84++];
			@Pc(108) int local108 = local46[local84];
			@Pc(113) int local113 = local50[local84++];
			if ((local90 - local99) * (local104 - local113) - (local104 - local95) * (-local99 + local108) > 0) {
				arg1.method2494(local99, local108, local104, local113, local95, local90);
			}
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "([[ZIZIIIII)V")
	private void method5894(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (this.aClass3_Sub9Array1 == null) {
			return;
		}
		@Pc(18) int local18 = arg3 + arg3 + 1;
		@Pc(22) int local22 = local18 * local18;
		if (this.aClass5_Sub2_28.anIntArray299.length < local22) {
			this.aClass5_Sub2_28.anIntArray299 = new int[local22];
		}
		if (this.anInt6845 * 2 > this.aClass5_Sub2_28.aClass3_Sub3_Sub1_3.aByteArray54.length) {
			this.aClass5_Sub2_28.aClass3_Sub3_Sub1_3 = new Class3_Sub3_Sub1(this.anInt6845 * 2);
		}
		@Pc(58) int local58 = arg1 - arg3;
		@Pc(60) int local60 = local58;
		if (local58 < 0) {
			local58 = 0;
		}
		@Pc(72) int local72 = arg5 - arg3;
		@Pc(74) int local74 = local72;
		if (local72 < 0) {
			local72 = 0;
		}
		@Pc(82) int local82 = arg1 + arg3;
		if (local82 > super.anInt9121 - 1) {
			local82 = super.anInt9121 - 1;
		}
		@Pc(101) int local101 = arg3 + arg5;
		if (super.anInt9115 - 1 < local101) {
			local101 = super.anInt9115 - 1;
		}
		@Pc(118) int local118 = 0;
		@Pc(122) int[] local122 = this.aClass5_Sub2_28.anIntArray299;
		@Pc(135) int local135;
		for (@Pc(124) int local124 = local58; local124 <= local82; local124++) {
			@Pc(133) boolean[] local133 = arg0[local124 - local60];
			for (local135 = local72; local135 <= local101; local135++) {
				if (local133[local135 - local74]) {
					local122[local118++] = local124 + super.anInt9121 * local135;
				}
			}
		}
		if (arg4 == -1) {
			this.aClass5_Sub2_28.method5012();
		} else {
			this.aClass5_Sub2_28.method5022((float) arg4);
			this.aClass5_Sub2_28.method5020();
		}
		this.aClass5_Sub2_28.method4975((this.anInt6847 & 0x7) != 0);
		for (@Pc(206) int local206 = 0; local206 < this.aClass3_Sub9Array1.length; local206++) {
			this.aClass3_Sub9Array1[local206].method1946(local122, local118);
		}
		if (!this.aClass223_41.method5864()) {
			local135 = this.aClass5_Sub2_28.anInt5661;
			@Pc(235) int local235 = this.aClass5_Sub2_28.anInt5686;
			this.aClass5_Sub2_28.L(0, local235, this.aClass5_Sub2_28.anInt5684);
			this.aClass5_Sub2_28.method4975(false);
			this.aClass5_Sub2_28.method4993(false);
			this.aClass5_Sub2_28.method4971(128);
			this.aClass5_Sub2_28.method5009(-2);
			this.aClass5_Sub2_28.method4997(this.aClass5_Sub2_28.aClass76_Sub3_2);
			this.aClass5_Sub2_28.method4982(7681, 8448);
			this.aClass5_Sub2_28.method5000(34166, 770, 0);
			this.aClass5_Sub2_28.method4969(34167, 0);
			for (@Pc(295) Class3 local295 = this.aClass223_41.method5874(); local295 != null; local295 = this.aClass223_41.method5870()) {
				@Pc(300) Class3_Sub24 local300 = (Class3_Sub24) local295;
				local300.method3163(arg1, arg5, arg3, arg0);
			}
			this.aClass5_Sub2_28.method5000(5890, 768, 0);
			this.aClass5_Sub2_28.method4969(5890, 0);
			this.aClass5_Sub2_28.method4997(null);
			this.aClass5_Sub2_28.L(local135, local235, this.aClass5_Sub2_28.anInt5684);
		}
		if (this.aClass47_1 == null) {
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		this.aClass5_Sub2_28.method4967(this.aClass164_13, null, this.aClass164_16, null);
		this.aClass47_1.method1674(arg1, arg2, arg0, arg3, arg5);
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!mt", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.anInt6862 <= 0) {
			this.aClass47_1 = null;
		} else {
			@Pc(19) byte[][] local19 = new byte[super.anInt9121 + 1][super.anInt9115 + 1];
			@Pc(25) int local25;
			for (@Pc(21) int local21 = 1; local21 < super.anInt9121; local21++) {
				for (local25 = 1; local25 < super.anInt9115; local25++) {
					local19[local21][local25] = (byte) ((this.aByteArrayArray21[local21][local25] >> 1) + (this.aByteArrayArray21[local21 - 1][local25] >> 2) + (this.aByteArrayArray21[local21 + 1][local25] >> 3) + (this.aByteArrayArray21[local21][local25 + -1] >> 2) + (this.aByteArrayArray21[local21][local25 - -1] >> 3));
				}
			}
			this.aClass3_Sub9Array1 = new Class3_Sub9[this.aClass280_30.method7106()];
			this.aClass280_30.method7104(this.aClass3_Sub9Array1);
			for (local25 = 0; local25 < this.aClass3_Sub9Array1.length; local25++) {
				this.aClass3_Sub9Array1[local25].method1944(this.anInt6862);
			}
			@Pc(133) int local133 = 24;
			if (this.anIntArrayArrayArray17 != null) {
				local133 += 4;
			}
			if ((this.anInt6847 & 0x7) != 0) {
				local133 += 12;
			}
			@Pc(153) NativeHeapBuffer local153 = this.aClass5_Sub2_28.aNativeHeap4.a(local133 * this.anInt6862, false);
			@Pc(158) Stream local158 = new Stream(local153);
			@Pc(162) Class3_Sub9[] local162 = new Class3_Sub9[this.anInt6862];
			@Pc(169) int local169 = Static274.method4478(this.anInt6862 / 4);
			if (local169 < 1) {
				local169 = 1;
			}
			@Pc(181) Class280 local181 = new Class280(local169);
			@Pc(185) Class3_Sub9[] local185 = new Class3_Sub9[this.anInt6863];
			@Pc(191) int local191;
			for (@Pc(187) int local187 = 0; super.anInt9121 > local187; local187++) {
				for (local191 = 0; local191 < super.anInt9115; local191++) {
					if (this.anIntArrayArrayArray16[local187][local191] != null) {
						@Pc(207) Class3_Sub9[] local207 = this.aClass3_Sub9ArrayArrayArray1[local187][local191];
						@Pc(214) int[] local214 = this.anIntArrayArrayArray14[local187][local191];
						@Pc(221) int[] local221 = this.anIntArrayArrayArray15[local187][local191];
						@Pc(228) int[] local228 = this.anIntArrayArrayArray18[local187][local191];
						@Pc(235) int[] local235 = this.anIntArrayArrayArray16[local187][local191];
						@Pc(247) int[] local247 = this.anIntArrayArrayArray19 == null ? null : this.anIntArrayArrayArray19[local187][local191];
						if (local228 == null) {
							local228 = local235;
						}
						@Pc(263) int[] local263 = this.anIntArrayArrayArray17 == null ? null : this.anIntArrayArrayArray17[local187][local191];
						@Pc(270) float local270 = this.aFloatArrayArray15[local187][local191];
						@Pc(277) float local277 = this.aFloatArrayArray16[local187][local191];
						@Pc(284) float local284 = this.aFloatArrayArray17[local187][local191];
						@Pc(293) float local293 = this.aFloatArrayArray15[local187][local191 + 1];
						@Pc(302) float local302 = this.aFloatArrayArray16[local187][local191 + 1];
						@Pc(311) float local311 = this.aFloatArrayArray17[local187][local191 + 1];
						@Pc(322) float local322 = this.aFloatArrayArray15[local187 + 1][local191 + 1];
						@Pc(333) float local333 = this.aFloatArrayArray16[local187 + 1][local191 + 1];
						@Pc(344) float local344 = this.aFloatArrayArray17[local187 + 1][local191 + 1];
						@Pc(353) float local353 = this.aFloatArrayArray15[local187 + 1][local191];
						@Pc(362) float local362 = this.aFloatArrayArray16[local187 + 1][local191];
						@Pc(371) float local371 = this.aFloatArrayArray17[local187 + 1][local191];
						@Pc(379) int local379 = local19[local187][local191] & 0xFF;
						@Pc(389) int local389 = local19[local187][local191 + 1] & 0xFF;
						@Pc(401) int local401 = local19[local187 + 1][local191 + 1] & 0xFF;
						@Pc(411) int local411 = local19[local187 + 1][local191] & 0xFF;
						@Pc(413) int local413 = 0;
						@Pc(423) int local423;
						label335: for (@Pc(415) int local415 = 0; local415 < local235.length; local415++) {
							@Pc(421) Class3_Sub9 local421 = local207[local415];
							for (local423 = 0; local423 < local413; local423++) {
								if (local185[local423] == local421) {
									continue label335;
								}
							}
							local185[local413++] = local421;
						}
						@Pc(464) short[] local464 = this.aShortArrayArray12[local187 + super.anInt9121 * local191] = new short[local235.length];
						for (local423 = 0; local423 < local235.length; local423++) {
							@Pc(477) int local477 = (local187 << super.anInt9117) + local214[local423];
							@Pc(487) int local487 = (local191 << super.anInt9117) + local221[local423];
							@Pc(492) int local492 = local477 >> this.anInt6858;
							@Pc(497) int local497 = local487 >> this.anInt6858;
							@Pc(501) int local501 = local235[local423];
							@Pc(505) int local505 = local228[local423];
							@Pc(513) int local513 = local247 == null ? 0 : local247[local423];
							@Pc(531) long local531 = (long) local501 << 32 | (long) local505 << 48 | (long) (local492 << 16) | (long) local497;
							@Pc(535) int local535 = local214[local423];
							@Pc(539) int local539 = local221[local423];
							@Pc(541) byte local541 = 74;
							@Pc(543) int local543 = 0;
							@Pc(545) float local545 = 1.0F;
							@Pc(563) float local563;
							@Pc(561) float local561;
							@Pc(565) float local565;
							@Pc(642) float local642;
							@Pc(559) int local559;
							if (local535 == 0 && local539 == 0) {
								local559 = local541 - local379;
								local561 = local277;
								local563 = local270;
								local565 = local284;
							} else if (local535 == 0 && local539 == super.anInt9118) {
								local565 = local311;
								local559 = local541 - local389;
								local563 = local293;
								local561 = local302;
							} else if (super.anInt9118 == local535 && super.anInt9118 == local539) {
								local561 = local333;
								local559 = local541 - local401;
								local563 = local322;
								local565 = local344;
							} else if (super.anInt9118 == local535 && local539 == 0) {
								local565 = local371;
								local563 = local353;
								local559 = local541 - local411;
								local561 = local362;
							} else {
								@Pc(617) float local617 = (float) local535 / (float) super.anInt9118;
								@Pc(624) float local624 = (float) local539 / (float) super.anInt9118;
								@Pc(633) float local633 = local617 * (local353 - local270) + local270;
								local642 = local617 * (local362 - local277) + local277;
								@Pc(651) float local651 = (local371 - local284) * local617 + local284;
								@Pc(659) float local659 = local293 + (local322 - local293) * local617;
								@Pc(667) float local667 = local617 * (local333 - local302) + local302;
								local563 = (local659 - local633) * local624 + local633;
								local561 = local642 + local624 * (local667 - local642);
								@Pc(691) float local691 = local311 + (local344 - local311) * local617;
								local565 = local651 + (local691 - local651) * local624;
								@Pc(710) int local710 = local379 + ((local411 - local379) * local535 >> super.anInt9117);
								@Pc(722) int local722 = ((local401 - local389) * local535 >> super.anInt9117) + local389;
								local559 = local541 - local710 - (local539 * (local722 - local710) >> super.anInt9117);
							}
							if (local501 != -1) {
								@Pc(772) int local772 = local559 * (local501 & 0x7F) >> 7;
								if (local772 < 2) {
									local772 = 2;
								} else if (local772 > 126) {
									local772 = 126;
								}
								local543 = Static159.anIntArray159[local501 & 0xFF80 | local772];
								if ((this.anInt6847 & 0x7) == 0) {
									local545 = local565 * this.aClass5_Sub2_28.aFloatArray38[2] + local563 * this.aClass5_Sub2_28.aFloatArray38[0] + this.aClass5_Sub2_28.aFloatArray38[1] * local561;
									local545 = this.aClass5_Sub2_28.aFloat118 + local545 * (local545 > 0.0F ? this.aClass5_Sub2_28.aFloat129 : this.aClass5_Sub2_28.aFloat112);
								}
							}
							@Pc(843) Class3 local843 = null;
							if ((local477 & this.anInt6852 - 1) == 0 && (local487 & this.anInt6852 - 1) == 0) {
								local843 = local181.method7107(local531);
							}
							@Pc(1207) int local1207;
							@Pc(879) int local879;
							if (local843 == null) {
								if (local501 == local505) {
									local879 = local543;
								} else {
									@Pc(889) int local889 = (local505 & 0x7F) * local559 >> 7;
									if (local889 < 2) {
										local889 = 2;
									} else if (local889 > 126) {
										local889 = 126;
									}
									local879 = Static159.anIntArray159[local889 | local505 & 0xFF80];
									if ((this.anInt6847 & 0x7) == 0) {
										local642 = local565 * this.aClass5_Sub2_28.aFloatArray38[2] + local563 * this.aClass5_Sub2_28.aFloatArray38[0] + this.aClass5_Sub2_28.aFloatArray38[1] * local561;
										local642 = this.aClass5_Sub2_28.aFloat118 + local545 * (local545 > 0.0F ? this.aClass5_Sub2_28.aFloat129 : this.aClass5_Sub2_28.aFloat112);
										@Pc(967) int local967 = local879 >> 16 & 0xFF;
										@Pc(973) int local973 = local879 >> 8 & 0xFF;
										local967 = (int) ((float) local967 * local642);
										@Pc(983) int local983 = local879 & 0xFF;
										if (local967 < 0) {
											local967 = 0;
										} else if (local967 > 255) {
											local967 = 255;
										}
										local973 = (int) ((float) local973 * local642);
										if (local973 < 0) {
											local973 = 0;
										} else if (local973 > 255) {
											local973 = 255;
										}
										local983 = (int) ((float) local983 * local642);
										if (local983 < 0) {
											local983 = 0;
										} else if (local983 > 255) {
											local983 = 255;
										}
										local879 = local983 | local967 << 16 | local973 << 8;
									}
								}
								if (this.aClass5_Sub2_28.aBoolean387) {
									local158.a((float) local477);
									local158.a((float) (this.method7839(local477, local487) + local513));
									local158.a((float) local487);
									local158.c((byte) (local879 >> 16));
									local158.c((byte) (local879 >> 8));
									local158.c((byte) local879);
									local158.c(-1);
									local158.a((float) local477);
									local158.a((float) local487);
									if (this.anIntArrayArrayArray17 != null) {
										local158.a((float) (local263 == null ? 0 : local263[local423] - 1));
									}
									if ((this.anInt6847 & 0x7) != 0) {
										local158.a(local563);
										local158.a(local561);
										local158.a(local565);
									}
								} else {
									local158.b((float) local477);
									local158.b((float) (this.method7839(local477, local487) + local513));
									local158.b((float) local487);
									local158.c((byte) (local879 >> 16));
									local158.c((byte) (local879 >> 8));
									local158.c((byte) local879);
									local158.c(-1);
									local158.b((float) local477);
									local158.b((float) local487);
									if (this.anIntArrayArrayArray17 != null) {
										local158.b((float) (local263 == null ? 0 : local263[local423] - 1));
									}
									if ((this.anInt6847 & 0x7) != 0) {
										local158.b(local563);
										local158.b(local561);
										local158.b(local565);
									}
								}
								local1207 = this.anInt6848++;
								local464[local423] = (short) local1207;
								if (local501 != -1) {
									local162[local1207] = local207[local423];
								}
								local181.method7109(new Class3_Sub26(local464[local423]), local531);
							} else {
								local464[local423] = ((Class3_Sub26) local843).aShort45;
								local1207 = local464[local423] & 0xFFFF;
								if (local501 != -1 && local207[local423].aLong276 < local162[local1207].aLong276) {
									local162[local1207] = local207[local423];
								}
							}
							for (local879 = 0; local879 < local413; local879++) {
								local185[local879].method1949(local543, local545, local1207, local559);
							}
							this.anInt6845++;
						}
					}
				}
			}
			for (local191 = 0; local191 < this.anInt6848; local191++) {
				@Pc(1314) Class3_Sub9 local1314 = local162[local191];
				if (local1314 != null) {
					local1314.method1948(local191);
				}
			}
			@Pc(1347) int local1347;
			for (@Pc(1327) int local1327 = 0; super.anInt9121 > local1327; local1327++) {
				for (@Pc(1331) int local1331 = 0; local1331 < super.anInt9115; local1331++) {
					@Pc(1343) short[] local1343 = this.aShortArrayArray12[local1327 + super.anInt9121 * local1331];
					if (local1343 != null) {
						local1347 = 0;
						@Pc(1349) int local1349 = 0;
						while (local1349 < local1343.length) {
							@Pc(1358) int local1358 = local1343[local1349++] & 0xFFFF;
							@Pc(1365) int local1365 = local1343[local1349++] & 0xFFFF;
							@Pc(1372) int local1372 = local1343[local1349++] & 0xFFFF;
							@Pc(1376) Class3_Sub9 local1376 = local162[local1358];
							@Pc(1380) Class3_Sub9 local1380 = local162[local1365];
							@Pc(1384) Class3_Sub9 local1384 = local162[local1372];
							@Pc(1386) Class3_Sub9 local1386 = null;
							if (local1376 != null) {
								local1376.method1945(local1331, local1327, local1347);
								local1386 = local1376;
							}
							if (local1380 != null) {
								local1380.method1945(local1331, local1327, local1347);
								if (local1386 == null || local1380.aLong276 < local1386.aLong276) {
									local1386 = local1380;
								}
							}
							if (local1384 != null) {
								local1384.method1945(local1331, local1327, local1347);
								if (local1386 == null || local1386.aLong276 > local1384.aLong276) {
									local1386 = local1384;
								}
							}
							if (local1386 != null) {
								if (local1376 != null) {
									local1386.method1948(local1358);
								}
								if (local1380 != null) {
									local1386.method1948(local1365);
								}
								if (local1384 != null) {
									local1386.method1948(local1372);
								}
								local1386.method1945(local1331, local1327, local1347);
							}
							local1347++;
						}
					}
				}
			}
			local158.b();
			this.anInterface14_7 = this.aClass5_Sub2_28.method5001(local133, local158.c(), local153);
			this.aClass164_13 = new Class164(this.anInterface14_7, 5126, 3, 0);
			this.aClass164_14 = new Class164(this.anInterface14_7, 5121, 4, 12);
			@Pc(1527) byte local1527;
			if (this.anIntArrayArrayArray17 == null) {
				local1527 = 24;
				this.aClass164_16 = new Class164(this.anInterface14_7, 5126, 2, 16);
			} else {
				local1527 = 28;
				this.aClass164_16 = new Class164(this.anInterface14_7, 5126, 3, 16);
			}
			if ((this.anInt6847 & 0x7) != 0) {
				this.aClass164_15 = new Class164(this.anInterface14_7, 5126, 3, local1527);
			}
			@Pc(1574) long[] local1574 = new long[this.aClass3_Sub9Array1.length];
			for (local1347 = 0; local1347 < this.aClass3_Sub9Array1.length; local1347++) {
				@Pc(1583) Class3_Sub9 local1583 = this.aClass3_Sub9Array1[local1347];
				local1574[local1347] = local1583.aLong276;
				local1583.method1950(this.anInt6848);
			}
			Static205.method3536(local1574, this.aClass3_Sub9Array1);
			if (this.aClass47_1 != null) {
				this.aClass47_1.method1669();
			}
		}
		this.aClass280_30 = null;
		this.anIntArrayArrayArray17 = null;
		this.anIntArrayArrayArray14 = this.anIntArrayArrayArray15 = null;
		this.aClass3_Sub9ArrayArrayArray1 = null;
		this.anIntArrayArrayArray18 = null;
		this.aFloatArrayArray15 = this.aFloatArrayArray16 = this.aFloatArrayArray17 = null;
		this.anIntArrayArrayArray16 = null;
		this.anIntArrayArrayArray19 = null;
		this.aByteArrayArray21 = null;
	}
}
