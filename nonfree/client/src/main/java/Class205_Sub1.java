import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public final class Class205_Sub1 extends Class205 {

	@OriginalMember(owner = "client!nk", name = "j", descriptor = "I")
	private int anInt5904;

	@OriginalMember(owner = "client!nk", name = "m", descriptor = "I")
	private int anInt5905;

	@OriginalMember(owner = "client!nk", name = "L", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!nk", name = "X", descriptor = "I")
	private int anInt5929;

	@OriginalMember(owner = "client!nk", name = "Z", descriptor = "[Lclient!ms;")
	private Class1_Sub33[] aClass1_Sub33Array1;

	@OriginalMember(owner = "client!nk", name = "ab", descriptor = "Lclient!cd;")
	public Class43 aClass43_8;

	@OriginalMember(owner = "client!nk", name = "bb", descriptor = "Lclient!cd;")
	private Class43 aClass43_9;

	@OriginalMember(owner = "client!nk", name = "eb", descriptor = "Lclient!ee;")
	private Interface2 anInterface2_4;

	@OriginalMember(owner = "client!nk", name = "gb", descriptor = "Lclient!cd;")
	public Class43 aClass43_10;

	@OriginalMember(owner = "client!nk", name = "hb", descriptor = "Lclient!cd;")
	public Class43 aClass43_11;

	@OriginalMember(owner = "client!nk", name = "ib", descriptor = "I")
	private int anInt5930;

	@OriginalMember(owner = "client!nk", name = "S", descriptor = "Lclient!bv;")
	private final Class37 aClass37_59 = new Class37();

	@OriginalMember(owner = "client!nk", name = "A", descriptor = "Lclient!uq;")
	public final Class122_Sub3 aClass122_Sub3_25;

	@OriginalMember(owner = "client!nk", name = "D", descriptor = "[[I")
	private final int[][] anIntArrayArray77;

	@OriginalMember(owner = "client!nk", name = "v", descriptor = "I")
	private final int anInt5911;

	@OriginalMember(owner = "client!nk", name = "u", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!nk", name = "I", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!nk", name = "W", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!nk", name = "N", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!nk", name = "H", descriptor = "I")
	private final int anInt5919;

	@OriginalMember(owner = "client!nk", name = "l", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!nk", name = "Y", descriptor = "[[B")
	private byte[][] aByteArrayArray15;

	@OriginalMember(owner = "client!nk", name = "V", descriptor = "[[S")
	public final short[][] aShortArrayArray5;

	@OriginalMember(owner = "client!nk", name = "db", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!nk", name = "k", descriptor = "[[[Lclient!ms;")
	private Class1_Sub33[][][] aClass1_Sub33ArrayArrayArray1;

	@OriginalMember(owner = "client!nk", name = "p", descriptor = "[[B")
	private final byte[][] aByteArrayArray14;

	@OriginalMember(owner = "client!nk", name = "fb", descriptor = "[[F")
	private float[][] aFloatArrayArray9;

	@OriginalMember(owner = "client!nk", name = "Q", descriptor = "I")
	public final int anInt5925;

	@OriginalMember(owner = "client!nk", name = "n", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!nk", name = "cb", descriptor = "Lclient!ba;")
	private Class17 aClass17_24;

	@OriginalMember(owner = "client!nk", name = "G", descriptor = "Lclient!sq;")
	private Class273 aClass273_1;

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lclient!uq;IIII[[I[[II)V")
	public Class205_Sub1(@OriginalArg(0) Class122_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.aClass122_Sub3_25 = arg0;
		this.anIntArrayArray77 = arg5;
		this.anInt5911 = super.anInt8176 - 2;
		this.anIntArrayArrayArray10 = new int[arg3][arg4][];
		this.anIntArrayArrayArray11 = new int[arg3][arg4][];
		this.aFloatArrayArray7 = new float[super.anInt8174 + 1][super.anInt8177 + 1];
		this.anIntArrayArrayArray13 = new int[arg3][arg4][];
		this.anInt5919 = 0x1 << this.anInt5911;
		this.anIntArrayArrayArray8 = new int[arg3][arg4][];
		this.aByteArrayArray15 = new byte[arg3 + 1][arg4 + 1];
		this.aShortArrayArray5 = new short[arg3 * arg4][];
		this.aFloatArrayArray8 = new float[super.anInt8174 + 1][super.anInt8177 + 1];
		this.aClass1_Sub33ArrayArrayArray1 = new Class1_Sub33[arg3][arg4][];
		this.aByteArrayArray14 = new byte[arg3][arg4];
		this.aFloatArrayArray9 = new float[super.anInt8174 + 1][super.anInt8177 + 1];
		this.anInt5925 = arg2;
		this.anIntArrayArrayArray9 = new int[arg3][arg4][];
		for (@Pc(117) int local117 = 1; super.anInt8177 > local117; local117++) {
			for (@Pc(121) int local121 = 1; super.anInt8174 > local121; local121++) {
				@Pc(140) int local140 = arg6[local121 + 1][local117] - arg6[local121 - 1][local117];
				@Pc(156) int local156 = arg6[local121][local117 + 1] - arg6[local121][local117 - 1];
				@Pc(175) float local175 = (float) (1.0D / Math.sqrt((double) (local156 * local156 + arg7 * 4 * arg7 + local140 * local140)));
				this.aFloatArrayArray7[local121][local117] = (float) local140 * local175;
				this.aFloatArrayArray9[local121][local117] = (float) (-arg7 * 2) * local175;
				this.aFloatArrayArray8[local121][local117] = (float) local156 * local175;
			}
		}
		this.aClass17_24 = new Class17(128);
		if ((this.anInt5925 & 0x10) != 0) {
			this.aClass273_1 = new Class273(this.aClass122_Sub3_25, this);
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)V")
	@Override
	public void method6748(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lclient!mda;III)V")
	private void method5012(@OriginalArg(0) Class1_Sub1_Sub9_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) int[] local18 = this.anIntArrayArrayArray8[arg1][arg2];
		@Pc(25) int[] local25 = this.anIntArrayArrayArray11[arg1][arg2];
		@Pc(28) int local28 = local18.length;
		if (local28 > this.aClass122_Sub3_25.anIntArray765.length) {
			this.aClass122_Sub3_25.anIntArray766 = new int[local28];
			this.aClass122_Sub3_25.anIntArray765 = new int[local28];
		}
		@Pc(48) int[] local48 = this.aClass122_Sub3_25.anIntArray765;
		@Pc(52) int[] local52 = this.aClass122_Sub3_25.anIntArray766;
		for (@Pc(54) int local54 = 0; local54 < local28; local54++) {
			local48[local54] = local18[local54] >> this.aClass122_Sub3_25.anInt8421;
			local52[local54] = local25[local54] >> this.aClass122_Sub3_25.anInt8421;
		}
		@Pc(82) int local82 = 0;
		while (local28 > local82) {
			@Pc(88) int local88 = local48[local82];
			@Pc(93) int local93 = local52[local82++];
			@Pc(97) int local97 = local48[local82];
			@Pc(102) int local102 = local52[local82++];
			@Pc(106) int local106 = local48[local82];
			@Pc(111) int local111 = local52[local82++];
			if (-((local102 - local93) * (local106 + -local97)) + (local88 - local97) * (local102 + -local111) > 0) {
				arg0.method4716(local106, local102, local111, local88, local97, local93);
			}
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method6751(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt5930 <= 0) {
			return;
		}
		this.aClass122_Sub3_25.method6881();
		this.aClass122_Sub3_25.method6928(false);
		this.aClass122_Sub3_25.method6896(false);
		this.aClass122_Sub3_25.method6916(false);
		this.aClass122_Sub3_25.method6915(false);
		this.aClass122_Sub3_25.method6871(0);
		this.aClass122_Sub3_25.method6926(-2);
		this.aClass122_Sub3_25.method6850(null);
		Static322.aFloatArray40[7] = 0.0F;
		Static322.aFloatArray40[14] = 0.0F;
		Static322.aFloatArray40[4] = 0.0F;
		Static322.aFloatArray40[8] = 0.0F;
		Static322.aFloatArray40[12] = -1.0F - ((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass122_Sub3_25.anInt8314;
		Static322.aFloatArray40[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass122_Sub3_25.anInt8238;
		Static322.aFloatArray40[3] = 0.0F;
		Static322.aFloatArray40[11] = 0.0F;
		Static322.aFloatArray40[9] = 0.0F;
		Static322.aFloatArray40[2] = 0.0F;
		Static322.aFloatArray40[0] = (float) 1024 / ((float) this.aClass122_Sub3_25.anInt8314 * (float) super.anInt8175 * 128.0F);
		Static322.aFloatArray40[15] = 1.0F;
		Static322.aFloatArray40[5] = (float) 1024 / ((float) super.anInt8175 * 128.0F * (float) this.aClass122_Sub3_25.anInt8238);
		Static322.aFloatArray40[1] = 0.0F;
		Static322.aFloatArray40[6] = 0.0F;
		Static322.aFloatArray40[10] = 0.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static322.aFloatArray40, 0);
		Static322.aFloatArray40[12] = 0.0F;
		Static322.aFloatArray40[10] = 0.0F;
		Static322.aFloatArray40[4] = 0.0F;
		Static322.aFloatArray40[3] = 0.0F;
		Static322.aFloatArray40[11] = 0.0F;
		Static322.aFloatArray40[13] = 0.0F;
		Static322.aFloatArray40[0] = 1.0F;
		Static322.aFloatArray40[1] = 0.0F;
		Static322.aFloatArray40[14] = 0.0F;
		Static322.aFloatArray40[5] = 0.0F;
		Static322.aFloatArray40[6] = 1.0F;
		Static322.aFloatArray40[8] = 0.0F;
		Static322.aFloatArray40[2] = 0.0F;
		Static322.aFloatArray40[7] = 0.0F;
		Static322.aFloatArray40[15] = 1.0F;
		Static322.aFloatArray40[9] = 1.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static322.aFloatArray40, 0);
		if ((this.anInt5925 & 0x7) == 0) {
			this.aClass122_Sub3_25.method6896(false);
		} else {
			this.aClass122_Sub3_25.method6896(true);
			this.aClass122_Sub3_25.method6859();
		}
		this.aClass122_Sub3_25.method6890(this.aClass43_11, this.aClass43_10, this.aClass43_8, this.aClass43_9);
		if (this.anInt5904 * 2 <= this.aClass122_Sub3_25.aClass1_Sub6_Sub1_3.aByteArray66.length) {
			this.aClass122_Sub3_25.aClass1_Sub6_Sub1_3.anInt4555 = 0;
		} else {
			this.aClass122_Sub3_25.aClass1_Sub6_Sub1_3 = new Class1_Sub6_Sub1(this.anInt5904 * 2);
		}
		@Pc(310) int local310 = 0;
		@Pc(314) Class1_Sub6_Sub1 local314 = this.aClass122_Sub3_25.aClass1_Sub6_Sub1_3;
		@Pc(320) int local320;
		@Pc(330) int local330;
		@Pc(332) int local332;
		@Pc(351) short[] local351;
		@Pc(355) int local355;
		if (this.aClass122_Sub3_25.aBoolean594) {
			for (local320 = arg1; local320 < arg3; local320++) {
				local330 = local320 * super.anInt8174 + arg0;
				for (local332 = arg0; local332 < arg2; local332++) {
					if (arg4[local332 - arg0][local320 - arg1]) {
						local351 = this.aShortArrayArray5[local330];
						if (local351 != null) {
							for (local355 = 0; local355 < local351.length; local355++) {
								local314.method3919(local351[local355] & 0xFFFF);
								local310++;
							}
						}
					}
					local330++;
				}
			}
		} else {
			for (local320 = arg1; local320 < arg3; local320++) {
				local330 = arg0 + local320 * super.anInt8174;
				for (local332 = arg0; local332 < arg2; local332++) {
					if (arg4[local332 - arg0][local320 - arg1]) {
						local351 = this.aShortArrayArray5[local330];
						if (local351 != null) {
							for (local355 = 0; local355 < local351.length; local355++) {
								local310++;
								local314.method3971(local351[local355] & 0xFFFF);
							}
						}
					}
					local330++;
				}
			}
		}
		if (local310 > 0) {
			@Pc(468) Class33_Sub2 local468 = new Class33_Sub2(this.aClass122_Sub3_25, 5123, local314.aByteArray66, local314.anInt4555);
			this.aClass122_Sub3_25.method6889(local310, local468, 0);
		}
	}

	@OriginalMember(owner = "client!nk", name = "X", descriptor = "(IILclient!k;)Lclient!k;")
	@Override
	public Class1_Sub1_Sub9 X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub9 arg2) {
		if ((this.aByteArrayArray14[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(21) int local21 = super.anInt8175 >> this.aClass122_Sub3_25.anInt8421;
		@Pc(24) Class1_Sub1_Sub9_Sub1 local24 = (Class1_Sub1_Sub9_Sub1) arg2;
		@Pc(40) Class1_Sub1_Sub9_Sub1 local40;
		if (local24 != null && local24.method4718(local21, local21)) {
			local40 = local24;
			local24.method4715();
		} else {
			local40 = new Class1_Sub1_Sub9_Sub1(this.aClass122_Sub3_25, local21, local21);
		}
		local40.method4712(0, local21, local21, 0);
		this.method5012(local40, arg0, arg1);
		return local40;
	}

	@OriginalMember(owner = "client!nk", name = "ba", descriptor = "(II)I")
	@Override
	public int ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray77[arg0][arg1];
	}

	@OriginalMember(owner = "client!nk", name = "aa", descriptor = "(II)I")
	@Override
	public int aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 >> super.anInt8176;
		@Pc(13) int local13 = arg1 >> super.anInt8176;
		if (local8 < 0 || local13 < 0 || super.anInt8174 - 1 < local8 || super.anInt8177 - 1 < local13) {
			return 0;
		}
		@Pc(46) int local46 = super.anInt8175 - 1 & arg0;
		@Pc(53) int local53 = arg1 & super.anInt8175 - 1;
		@Pc(80) int local80 = this.anIntArrayArray77[local8 + 1][local13] * local46 + this.anIntArrayArray77[local8][local13] * (super.anInt8175 - local46) >> super.anInt8176;
		@Pc(111) int local111 = (super.anInt8175 - local46) * this.anIntArrayArray77[local8][local13 + 1] + this.anIntArrayArray77[local8 + 1][local13 + 1] * local46 >> super.anInt8176;
		return (super.anInt8175 - local53) * local80 + local53 * local111 >> super.anInt8176;
	}

	@OriginalMember(owner = "client!nk", name = "IA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg3 != null && this.anIntArrayArrayArray10 == null) {
			this.anIntArrayArrayArray10 = new int[super.anInt8174][super.anInt8177][];
		}
		if (arg5 != null && this.anIntArrayArrayArray12 == null) {
			this.anIntArrayArrayArray12 = new int[super.anInt8174][super.anInt8177][];
		}
		this.anIntArrayArrayArray8[arg0][arg1] = arg2;
		this.anIntArrayArrayArray11[arg0][arg1] = arg4;
		this.anIntArrayArrayArray13[arg0][arg1] = arg6;
		this.anIntArrayArrayArray9[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray12 != null) {
			this.anIntArrayArrayArray12[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray10 != null) {
			this.anIntArrayArrayArray10[arg0][arg1] = arg3;
		}
		@Pc(88) Class1_Sub33[] local88 = this.aClass1_Sub33ArrayArrayArray1[arg0][arg1] = new Class1_Sub33[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) arg8[local90] | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28 | (long) (arg9[local90] << 14);
			@Pc(125) Class1 local125;
			for (local125 = this.aClass17_24.method738(local119); local125 != null; local125 = this.aClass17_24.method743()) {
				@Pc(130) Class1_Sub33 local130 = (Class1_Sub33) local125;
				if (local130.anInt5683 == arg8[local90] && (float) arg9[local90] == local130.aFloat117 && arg10 == local130.anInt5690 && local130.anInt5682 == arg11 && local130.anInt5679 == arg12) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class1_Sub33(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass17_24.method737(local88[local90], local119);
			} else {
				local88[local90] = (Class1_Sub33) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray14[arg0][arg1] = (byte) (this.aByteArrayArray14[arg0][arg1] | 0x1);
		}
		if (this.anInt5929 < arg6.length) {
			this.anInt5929 = arg6.length;
		}
		this.anInt5930 += arg6.length;
	}

	@OriginalMember(owner = "client!nk", name = "Q", descriptor = "(III)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray15[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray15[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!nk", name = "ya", descriptor = "(Lclient!k;IIIIZ)V")
	@Override
	public void ya(@OriginalArg(0) Class1_Sub1_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass273_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass122_Sub3_25.anInt8439 >> 8) >> this.aClass122_Sub3_25.anInt8421;
			@Pc(39) int local39 = arg3 - (this.aClass122_Sub3_25.anInt8460 * arg2 >> 8) >> this.aClass122_Sub3_25.anInt8421;
			this.aClass273_1.method6417(local24, local39, arg0);
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIII[[ZZI)V")
	private void method5015(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean[][] arg3, @OriginalArg(5) boolean arg4) {
		if (this.aClass1_Sub33Array1 == null) {
			return;
		}
		@Pc(15) int local15 = arg0 + arg0 + 1;
		@Pc(19) int local19 = local15 * local15;
		if (this.aClass122_Sub3_25.anIntArray767.length < local19) {
			this.aClass122_Sub3_25.anIntArray767 = new int[local19];
		}
		if (this.anInt5904 * 2 > this.aClass122_Sub3_25.aClass1_Sub6_Sub1_3.aByteArray66.length) {
			this.aClass122_Sub3_25.aClass1_Sub6_Sub1_3 = new Class1_Sub6_Sub1(this.anInt5904 * 2);
		}
		@Pc(59) int local59 = arg2 - arg0;
		@Pc(61) int local61 = local59;
		if (local59 < 0) {
			local59 = 0;
		}
		@Pc(73) int local73 = arg1 - arg0;
		@Pc(75) int local75 = local73;
		if (local73 < 0) {
			local73 = 0;
		}
		@Pc(83) int local83 = arg0 + arg2;
		if (super.anInt8174 - 1 < local83) {
			local83 = super.anInt8174 - 1;
		}
		@Pc(99) int local99 = arg1 + arg0;
		if (super.anInt8177 - 1 < local99) {
			local99 = super.anInt8177 - 1;
		}
		@Pc(112) int local112 = 0;
		@Pc(116) int[] local116 = this.aClass122_Sub3_25.anIntArray767;
		@Pc(128) int local128;
		for (@Pc(118) int local118 = local59; local118 <= local83; local118++) {
			@Pc(126) boolean[] local126 = arg3[local118 - local61];
			for (local128 = local73; local128 <= local99; local128++) {
				if (local126[local128 - local75]) {
					local116[local112++] = local118 + super.anInt8174 * local128;
				}
			}
		}
		this.aClass122_Sub3_25.method6891();
		this.aClass122_Sub3_25.method6896((this.anInt5925 & 0x7) != 0);
		for (@Pc(200) int local200 = 0; local200 < this.aClass1_Sub33Array1.length; local200++) {
			this.aClass1_Sub33Array1[local200].method4847(local116, local112);
		}
		if (!this.aClass37_59.method968()) {
			local128 = this.aClass122_Sub3_25.anInt8432;
			@Pc(235) int local235 = this.aClass122_Sub3_25.anInt8430;
			this.aClass122_Sub3_25.E(0, local235, this.aClass122_Sub3_25.anInt8444);
			this.aClass122_Sub3_25.method6896(false);
			this.aClass122_Sub3_25.method6915(false);
			this.aClass122_Sub3_25.method6871(128);
			this.aClass122_Sub3_25.method6926(-2);
			this.aClass122_Sub3_25.method6850(this.aClass122_Sub3_25.aClass73_Sub1_5);
			this.aClass122_Sub3_25.method6853(8448, 7681);
			this.aClass122_Sub3_25.method6899(770, 0, 34166);
			this.aClass122_Sub3_25.method6913(34167, 0);
			for (@Pc(297) Class1 local297 = this.aClass37_59.method977(); local297 != null; local297 = this.aClass37_59.method971()) {
				@Pc(302) Class1_Sub14 local302 = (Class1_Sub14) local297;
				local302.method1751(arg2, arg1, arg0, arg3);
			}
			this.aClass122_Sub3_25.method6899(768, 0, 5890);
			this.aClass122_Sub3_25.method6913(5890, 0);
			this.aClass122_Sub3_25.method6850(null);
			this.aClass122_Sub3_25.E(local128, local235, this.aClass122_Sub3_25.anInt8444);
		}
		if (this.aClass273_1 != null) {
			this.aClass122_Sub3_25.method6890(this.aClass43_11, this.aClass43_10, null, null);
			this.aClass273_1.method6408(arg0, arg4, arg3, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!nk", name = "F", descriptor = "(Lclient!k;IIIIZ)V")
	@Override
	public void F(@OriginalArg(0) Class1_Sub1_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass273_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass122_Sub3_25.anInt8439 >> 8) >> this.aClass122_Sub3_25.anInt8421;
			@Pc(38) int local38 = arg3 - (this.aClass122_Sub3_25.anInt8460 * arg2 >> 8) >> this.aClass122_Sub3_25.anInt8421;
			this.aClass273_1.method6416(arg0, local24, local38);
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method6745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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
		this.IA(arg0, arg1, local13, local47, local18, local56, local23, local28, local33, local38, arg13, arg14, arg15, false);
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method6750(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method5015(arg2, arg1, arg0, arg3, arg4);
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lclient!k;IIIIZ)Z")
	@Override
	public boolean method6746(@OriginalArg(0) Class1_Sub1_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass273_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (this.aClass122_Sub3_25.anInt8439 * arg2 >> 8) >> this.aClass122_Sub3_25.anInt8421;
			@Pc(40) int local40 = arg3 - (this.aClass122_Sub3_25.anInt8460 * arg2 >> 8) >> this.aClass122_Sub3_25.anInt8421;
			return this.aClass273_1.method6414(local40, local25, arg0);
		}
	}

	@OriginalMember(owner = "client!nk", name = "N", descriptor = "()V")
	@Override
	public void N() {
		if (this.anInt5930 <= 0) {
			this.aClass273_1 = null;
		} else {
			@Pc(23) byte[][] local23 = new byte[super.anInt8174 + 1][super.anInt8177 + 1];
			@Pc(29) int local29;
			for (@Pc(25) int local25 = 1; super.anInt8174 > local25; local25++) {
				for (local29 = 1; super.anInt8177 > local29; local29++) {
					local23[local25][local29] = (byte) ((this.aByteArrayArray15[local25][local29] >> 1) + (this.aByteArrayArray15[local25][local29 + 1] >> 3) + (this.aByteArrayArray15[local25 + 1][local29] >> 3) + (this.aByteArrayArray15[local25 + -1][local29] >> 2) + (this.aByteArrayArray15[local25][local29 + -1] >> 2));
				}
			}
			this.aClass1_Sub33Array1 = new Class1_Sub33[this.aClass17_24.method742()];
			this.aClass17_24.method739(this.aClass1_Sub33Array1);
			for (local29 = 0; local29 < this.aClass1_Sub33Array1.length; local29++) {
				this.aClass1_Sub33Array1[local29].method4851(this.anInt5930);
			}
			@Pc(137) int local137 = 24;
			if (this.anIntArrayArrayArray12 != null) {
				local137 += 4;
			}
			if ((this.anInt5925 & 0x7) != 0) {
				local137 += 12;
			}
			@Pc(157) NativeHeapBuffer local157 = this.aClass122_Sub3_25.aNativeHeap5.a(local137 * this.anInt5930, false);
			@Pc(162) Stream local162 = new Stream(local157);
			@Pc(166) Class1_Sub33[] local166 = new Class1_Sub33[this.anInt5930];
			@Pc(173) int local173 = Static59.method1111(this.anInt5930 / 4);
			if (local173 < 1) {
				local173 = 1;
			}
			@Pc(185) Class17 local185 = new Class17(local173);
			@Pc(189) Class1_Sub33[] local189 = new Class1_Sub33[this.anInt5929];
			@Pc(195) int local195;
			for (@Pc(191) int local191 = 0; local191 < super.anInt8174; local191++) {
				for (local195 = 0; local195 < super.anInt8177; local195++) {
					if (this.anIntArrayArrayArray13[local191][local195] != null) {
						@Pc(211) Class1_Sub33[] local211 = this.aClass1_Sub33ArrayArrayArray1[local191][local195];
						@Pc(218) int[] local218 = this.anIntArrayArrayArray8[local191][local195];
						@Pc(225) int[] local225 = this.anIntArrayArrayArray11[local191][local195];
						@Pc(232) int[] local232 = this.anIntArrayArrayArray9[local191][local195];
						@Pc(239) int[] local239 = this.anIntArrayArrayArray13[local191][local195];
						@Pc(251) int[] local251 = this.anIntArrayArrayArray10 == null ? null : this.anIntArrayArrayArray10[local191][local195];
						@Pc(263) int[] local263 = this.anIntArrayArrayArray12 == null ? null : this.anIntArrayArrayArray12[local191][local195];
						if (local232 == null) {
							local232 = local239;
						}
						@Pc(274) float local274 = this.aFloatArrayArray7[local191][local195];
						@Pc(281) float local281 = this.aFloatArrayArray9[local191][local195];
						@Pc(288) float local288 = this.aFloatArrayArray8[local191][local195];
						@Pc(297) float local297 = this.aFloatArrayArray7[local191][local195 + 1];
						@Pc(306) float local306 = this.aFloatArrayArray9[local191][local195 + 1];
						@Pc(315) float local315 = this.aFloatArrayArray8[local191][local195 + 1];
						@Pc(326) float local326 = this.aFloatArrayArray7[local191 + 1][local195 + 1];
						@Pc(337) float local337 = this.aFloatArrayArray9[local191 + 1][local195 + 1];
						@Pc(348) float local348 = this.aFloatArrayArray8[local191 + 1][local195 + 1];
						@Pc(357) float local357 = this.aFloatArrayArray7[local191 + 1][local195];
						@Pc(366) float local366 = this.aFloatArrayArray9[local191 + 1][local195];
						@Pc(375) float local375 = this.aFloatArrayArray8[local191 + 1][local195];
						@Pc(383) int local383 = local23[local191][local195] & 0xFF;
						@Pc(393) int local393 = local23[local191][local195 + 1] & 0xFF;
						@Pc(405) int local405 = local23[local191 + 1][local195 + 1] & 0xFF;
						@Pc(415) int local415 = local23[local191 + 1][local195] & 0xFF;
						@Pc(417) int local417 = 0;
						@Pc(427) int local427;
						label337: for (@Pc(419) int local419 = 0; local419 < local239.length; local419++) {
							@Pc(425) Class1_Sub33 local425 = local211[local419];
							for (local427 = 0; local427 < local417; local427++) {
								if (local425 == local189[local427]) {
									continue label337;
								}
							}
							local189[local417++] = local425;
						}
						@Pc(468) short[] local468 = this.aShortArrayArray5[local191 + super.anInt8174 * local195] = new short[local239.length];
						for (local427 = 0; local427 < local239.length; local427++) {
							@Pc(481) int local481 = (local191 << super.anInt8176) + local218[local427];
							@Pc(490) int local490 = (local195 << super.anInt8176) + local225[local427];
							@Pc(495) int local495 = local481 >> this.anInt5911;
							@Pc(500) int local500 = local490 >> this.anInt5911;
							@Pc(504) int local504 = local239[local427];
							@Pc(508) int local508 = local232[local427];
							@Pc(516) int local516 = local251 == null ? 0 : local251[local427];
							@Pc(534) long local534 = (long) (local495 << 16) | (long) local508 << 48 | (long) local504 << 32 | (long) local500;
							@Pc(538) int local538 = local218[local427];
							@Pc(542) int local542 = local225[local427];
							@Pc(544) byte local544 = 74;
							@Pc(546) int local546 = 0;
							@Pc(567) float local567;
							@Pc(565) float local565;
							@Pc(573) float local573;
							@Pc(643) float local643;
							@Pc(571) int local571;
							if (local538 == 0 && local542 == 0) {
								local565 = local281;
								local573 = local288;
								local567 = local274;
								local571 = local544 - local383;
							} else if (local538 == 0 && super.anInt8175 == local542) {
								local565 = local306;
								local567 = local297;
								local571 = local544 - local393;
								local573 = local315;
							} else if (super.anInt8175 == local538 && super.anInt8175 == local542) {
								local567 = local326;
								local565 = local337;
								local573 = local348;
								local571 = local544 - local405;
							} else if (super.anInt8175 == local538 && local542 == 0) {
								local573 = local375;
								local571 = local544 - local415;
								local567 = local357;
								local565 = local366;
							} else {
								@Pc(619) float local619 = (float) local538 / (float) super.anInt8175;
								@Pc(626) float local626 = (float) local542 / (float) super.anInt8175;
								@Pc(634) float local634 = local274 + local619 * (local357 - local274);
								local643 = local619 * (local366 - local281) + local281;
								@Pc(651) float local651 = (local375 - local288) * local619 + local288;
								@Pc(660) float local660 = local619 * (local326 - local297) + local297;
								@Pc(668) float local668 = (local337 - local306) * local619 + local306;
								@Pc(676) float local676 = local315 + (local348 - local315) * local619;
								local565 = local643 + (local668 - local643) * local626;
								local567 = local634 + local626 * (local660 - local634);
								local573 = local651 + local626 * (local676 - local651);
								@Pc(714) int local714 = local383 + (local538 * (local415 - local383) >> super.anInt8176);
								@Pc(726) int local726 = (local538 * (local405 - local393) >> super.anInt8176) + local393;
								local571 = local544 - (local542 * (local726 - local714) >> super.anInt8176) - local714;
							}
							@Pc(765) float local765 = 1.0F;
							if (local504 != -1) {
								@Pc(776) int local776 = (local504 & 0x7F) * local571 >> 7;
								if (local776 < 2) {
									local776 = 2;
								} else if (local776 > 126) {
									local776 = 126;
								}
								if ((this.anInt5925 & 0x7) == 0) {
									local765 = local573 * this.aClass122_Sub3_25.aFloatArray65[2] + this.aClass122_Sub3_25.aFloatArray65[0] * local567 + this.aClass122_Sub3_25.aFloatArray65[1] * local565;
									local765 = (local765 > 0.0F ? this.aClass122_Sub3_25.aFloat183 : this.aClass122_Sub3_25.aFloat179) * local765 + this.aClass122_Sub3_25.aFloat169;
								}
								local546 = Static212.anIntArray347[local776 | local504 & 0xFF80];
							}
							@Pc(847) Class1 local847 = null;
							if ((this.anInt5919 - 1 & local481) == 0 && (this.anInt5919 - 1 & local490) == 0) {
								local847 = local185.method738(local534);
							}
							@Pc(880) int local880;
							@Pc(910) int local910;
							if (local847 == null) {
								if (local508 == local504) {
									local910 = local546;
								} else {
									@Pc(920) int local920 = (local508 & 0x7F) * local571 >> 7;
									if (local920 < 2) {
										local920 = 2;
									} else if (local920 > 126) {
										local920 = 126;
									}
									local910 = Static212.anIntArray347[local920 | local508 & 0xFF80];
									if ((this.anInt5925 & 0x7) == 0) {
										local643 = local567 * this.aClass122_Sub3_25.aFloatArray65[0] + this.aClass122_Sub3_25.aFloatArray65[1] * local565 + local573 * this.aClass122_Sub3_25.aFloatArray65[2];
										local643 = this.aClass122_Sub3_25.aFloat169 + (local765 > 0.0F ? this.aClass122_Sub3_25.aFloat183 : this.aClass122_Sub3_25.aFloat179) * local765;
										@Pc(995) int local995 = local910 >> 16 & 0xFF;
										@Pc(1001) int local1001 = local910 >> 8 & 0xFF;
										@Pc(1005) int local1005 = local910 & 0xFF;
										local995 = (int) ((float) local995 * local643);
										local1001 = (int) ((float) local1001 * local643);
										if (local995 < 0) {
											local995 = 0;
										} else if (local995 > 255) {
											local995 = 255;
										}
										if (local1001 < 0) {
											local1001 = 0;
										} else if (local1001 > 255) {
											local1001 = 255;
										}
										local1005 = (int) ((float) local1005 * local643);
										if (local1005 < 0) {
											local1005 = 0;
										} else if (local1005 > 255) {
											local1005 = 255;
										}
										local910 = local1005 | local995 << 16 | local1001 << 8;
									}
								}
								if (this.aClass122_Sub3_25.aBoolean594) {
									local162.a((float) local481);
									local162.a((float) (local516 + this.aa(local481, local490)));
									local162.a((float) local490);
									local162.f((byte) (local910 >> 16));
									local162.f((byte) (local910 >> 8));
									local162.f((byte) local910);
									local162.f(-1);
									local162.a((float) local481);
									local162.a((float) local490);
									if (this.anIntArrayArrayArray12 != null) {
										local162.a((float) (local263 == null ? 0 : local263[local427] - 1));
									}
									if ((this.anInt5925 & 0x7) != 0) {
										local162.a(local567);
										local162.a(local565);
										local162.a(local573);
									}
								} else {
									local162.b((float) local481);
									local162.b((float) (this.aa(local481, local490) + local516));
									local162.b((float) local490);
									local162.f((byte) (local910 >> 16));
									local162.f((byte) (local910 >> 8));
									local162.f((byte) local910);
									local162.f(-1);
									local162.b((float) local481);
									local162.b((float) local490);
									if (this.anIntArrayArrayArray12 != null) {
										local162.b((float) (local263 == null ? 0 : local263[local427] - 1));
									}
									if ((this.anInt5925 & 0x7) != 0) {
										local162.b(local567);
										local162.b(local565);
										local162.b(local573);
									}
								}
								local880 = this.anInt5905++;
								local468[local427] = (short) local880;
								if (local504 != -1) {
									local166[local880] = local211[local427];
								}
								local185.method737(new Class1_Sub29(local468[local427]), local534);
							} else {
								local468[local427] = ((Class1_Sub29) local847).aShort76;
								local880 = local468[local427] & 0xFFFF;
								if (local504 != -1 && local166[local880].aLong392 > local211[local427].aLong392) {
									local166[local880] = local211[local427];
								}
							}
							for (local910 = 0; local910 < local417; local910++) {
								local189[local910].method4850(local880, local571, local546, local765);
							}
							this.anInt5904++;
						}
					}
				}
			}
			for (local195 = 0; local195 < this.anInt5905; local195++) {
				@Pc(1322) Class1_Sub33 local1322 = local166[local195];
				if (local1322 != null) {
					local1322.method4853(local195);
				}
			}
			@Pc(1356) int local1356;
			for (@Pc(1335) int local1335 = 0; local1335 < super.anInt8174; local1335++) {
				for (@Pc(1339) int local1339 = 0; super.anInt8177 > local1339; local1339++) {
					@Pc(1352) short[] local1352 = this.aShortArrayArray5[super.anInt8174 * local1339 + local1335];
					if (local1352 != null) {
						local1356 = 0;
						@Pc(1358) int local1358 = 0;
						while (local1358 < local1352.length) {
							@Pc(1367) int local1367 = local1352[local1358++] & 0xFFFF;
							@Pc(1374) int local1374 = local1352[local1358++] & 0xFFFF;
							@Pc(1381) int local1381 = local1352[local1358++] & 0xFFFF;
							@Pc(1385) Class1_Sub33 local1385 = local166[local1367];
							@Pc(1389) Class1_Sub33 local1389 = local166[local1374];
							@Pc(1393) Class1_Sub33 local1393 = local166[local1381];
							@Pc(1395) Class1_Sub33 local1395 = null;
							if (local1385 != null) {
								local1385.method4849(local1339, local1335, local1356);
								local1395 = local1385;
							}
							if (local1389 != null) {
								local1389.method4849(local1339, local1335, local1356);
								if (local1395 == null || local1395.aLong392 > local1389.aLong392) {
									local1395 = local1389;
								}
							}
							if (local1393 != null) {
								local1393.method4849(local1339, local1335, local1356);
								if (local1395 == null || local1395.aLong392 > local1393.aLong392) {
									local1395 = local1393;
								}
							}
							if (local1395 != null) {
								if (local1385 != null) {
									local1395.method4853(local1367);
								}
								if (local1389 != null) {
									local1395.method4853(local1374);
								}
								if (local1393 != null) {
									local1395.method4853(local1381);
								}
								local1395.method4849(local1339, local1335, local1356);
							}
							local1356++;
						}
					}
				}
			}
			local162.b();
			this.anInterface2_4 = this.aClass122_Sub3_25.method6924(local162.a(), local137, local157);
			this.aClass43_10 = new Class43(this.anInterface2_4, 5126, 3, 0);
			this.aClass43_9 = new Class43(this.anInterface2_4, 5121, 4, 12);
			@Pc(1530) byte local1530;
			if (this.anIntArrayArrayArray12 == null) {
				local1530 = 24;
				this.aClass43_11 = new Class43(this.anInterface2_4, 5126, 2, 16);
			} else {
				this.aClass43_11 = new Class43(this.anInterface2_4, 5126, 3, 16);
				local1530 = 28;
			}
			if ((this.anInt5925 & 0x7) != 0) {
				this.aClass43_8 = new Class43(this.anInterface2_4, 5126, 3, local1530);
			}
			@Pc(1564) long[] local1564 = new long[this.aClass1_Sub33Array1.length];
			for (local1356 = 0; local1356 < this.aClass1_Sub33Array1.length; local1356++) {
				@Pc(1573) Class1_Sub33 local1573 = this.aClass1_Sub33Array1[local1356];
				local1564[local1356] = local1573.aLong392;
				local1573.method4854(this.anInt5905);
			}
			Static78.method1339(this.aClass1_Sub33Array1, local1564);
			if (this.aClass273_1 != null) {
				this.aClass273_1.method6413();
			}
		}
		this.aFloatArrayArray7 = this.aFloatArrayArray9 = this.aFloatArrayArray8 = null;
		this.anIntArrayArrayArray10 = null;
		this.aClass1_Sub33ArrayArrayArray1 = null;
		this.anIntArrayArrayArray8 = this.anIntArrayArrayArray11 = null;
		this.aClass17_24 = null;
		this.aByteArrayArray15 = null;
		this.anIntArrayArrayArray12 = null;
		this.anIntArrayArrayArray13 = null;
		this.anIntArrayArrayArray9 = null;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lclient!ww;[I)V")
	@Override
	public void method6747(@OriginalArg(0) Class1_Sub2 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass37_59.method970(new Class1_Sub14(this.aClass122_Sub3_25, this, arg0, arg1));
	}
}
