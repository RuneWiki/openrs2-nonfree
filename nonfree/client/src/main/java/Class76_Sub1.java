import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public final class Class76_Sub1 extends Class76 {

	@OriginalMember(owner = "client!dn", name = "U", descriptor = "[I")
	public static final int[] anIntArray138 = new int[32];

	@OriginalMember(owner = "client!dn", name = "H", descriptor = "I")
	private int anInt1962;

	@OriginalMember(owner = "client!dn", name = "P", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!dn", name = "R", descriptor = "I")
	private int anInt1967;

	@OriginalMember(owner = "client!dn", name = "V", descriptor = "I")
	private int anInt1969;

	@OriginalMember(owner = "client!dn", name = "Y", descriptor = "I")
	private int anInt1970;

	@OriginalMember(owner = "client!dn", name = "ab", descriptor = "Lclient!eca;")
	public Class82 aClass82_1;

	@OriginalMember(owner = "client!dn", name = "bb", descriptor = "[Lclient!lj;")
	private Class2_Sub27[] aClass2_Sub27Array1;

	@OriginalMember(owner = "client!dn", name = "db", descriptor = "Lclient!eca;")
	public Class82 aClass82_2;

	@OriginalMember(owner = "client!dn", name = "gb", descriptor = "Lclient!hu;")
	private Interface12 anInterface12_1;

	@OriginalMember(owner = "client!dn", name = "hb", descriptor = "Lclient!eca;")
	public Class82 aClass82_3;

	@OriginalMember(owner = "client!dn", name = "ib", descriptor = "Lclient!eca;")
	private Class82 aClass82_4;

	@OriginalMember(owner = "client!dn", name = "O", descriptor = "Lclient!fha;")
	private final Class109 aClass109_10 = new Class109();

	@OriginalMember(owner = "client!dn", name = "G", descriptor = "I")
	private final int anInt1961 = this.anInt8795 - 2;

	@OriginalMember(owner = "client!dn", name = "F", descriptor = "Lclient!ep;")
	public final Class95_Sub1 aClass95_Sub1_7;

	@OriginalMember(owner = "client!dn", name = "s", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!dn", name = "J", descriptor = "I")
	public final int anInt1963;

	@OriginalMember(owner = "client!dn", name = "A", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!dn", name = "t", descriptor = "I")
	private final int anInt1952;

	@OriginalMember(owner = "client!dn", name = "X", descriptor = "[[F")
	private float[][] aFloatArrayArray1;

	@OriginalMember(owner = "client!dn", name = "v", descriptor = "[[[Lclient!lj;")
	private Class2_Sub27[][][] aClass2_Sub27ArrayArrayArray1;

	@OriginalMember(owner = "client!dn", name = "fb", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!dn", name = "r", descriptor = "[[S")
	public final short[][] aShortArrayArray13;

	@OriginalMember(owner = "client!dn", name = "x", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!dn", name = "K", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!dn", name = "i", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!dn", name = "Z", descriptor = "[[B")
	private byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!dn", name = "T", descriptor = "[[B")
	private final byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!dn", name = "cb", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!dn", name = "W", descriptor = "Lclient!gca;")
	private Class118 aClass118_14;

	@OriginalMember(owner = "client!dn", name = "I", descriptor = "Lclient!em;")
	private Class93 aClass93_1;

	static {
		@Pc(10) int local10 = 2;
		for (@Pc(12) int local12 = 0; local12 < 32; local12++) {
			anIntArray138[local12] = local10 - 1;
			local10 += local10;
		}
	}

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Lclient!ep;IIII[[I[[II)V")
	public Class76_Sub1(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass95_Sub1_7 = arg0;
		this.anIntArrayArrayArray4 = new int[arg3][arg4][];
		this.anInt1963 = arg2;
		this.anIntArrayArrayArray6 = new int[arg3][arg4][];
		this.anInt1952 = 0x1 << this.anInt1961;
		this.aFloatArrayArray1 = new float[super.anInt8791 + 1][super.anInt8794 + 1];
		this.aClass2_Sub27ArrayArrayArray1 = new Class2_Sub27[arg3][arg4][];
		this.aFloatArrayArray3 = new float[super.anInt8791 + 1][super.anInt8794 + 1];
		this.aShortArrayArray13 = new short[arg3 * arg4][];
		this.anIntArrayArrayArray5 = new int[arg3][arg4][];
		this.anIntArrayArrayArray7 = new int[arg3][arg4][];
		this.anIntArrayArrayArray3 = new int[arg3][arg4][];
		this.aByteArrayArray7 = new byte[arg3 + 1][arg4 + 1];
		this.aByteArrayArray6 = new byte[arg3][arg4];
		this.aFloatArrayArray2 = new float[super.anInt8791 + 1][super.anInt8794 + 1];
		for (@Pc(115) int local115 = 1; super.anInt8794 > local115; local115++) {
			for (@Pc(119) int local119 = 1; super.anInt8791 > local119; local119++) {
				@Pc(137) int local137 = arg6[local119 + 1][local115] - arg6[local119 - 1][local115];
				@Pc(154) int local154 = arg6[local119][local115 + 1] - arg6[local119][local115 - 1];
				@Pc(174) float local174 = (float) (1.0D / Math.sqrt((double) (local137 * local137 + arg7 * 4 * arg7 + local154 * local154)));
				this.aFloatArrayArray2[local119][local115] = local174 * (float) local137;
				this.aFloatArrayArray1[local119][local115] = (float) (-arg7 * 2) * local174;
				this.aFloatArrayArray3[local119][local115] = (float) local154 * local174;
			}
		}
		this.aClass118_14 = new Class118(128);
		if ((this.anInt1963 & 0x10) != 0) {
			this.aClass93_1 = new Class93(this.aClass95_Sub1_7, this);
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method7397(@OriginalArg(0) Class2_Sub2_Sub19 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass93_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (arg2 * this.aClass95_Sub1_7.anInt2558 >> 8) >> this.aClass95_Sub1_7.anInt2515;
			@Pc(40) int local40 = arg3 - (arg2 * this.aClass95_Sub1_7.anInt2548 >> 8) >> this.aClass95_Sub1_7.anInt2515;
			return this.aClass93_1.method1856(arg0, local25, local40);
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lclient!kb;[I)V")
	@Override
	public void method7400(@OriginalArg(0) Class2_Sub24 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass109_10.method2323(new Class2_Sub10(this.aClass95_Sub1_7, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!dn", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray7[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray7[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7391(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt1969 <= 0) {
			return;
		}
		this.aClass95_Sub1_7.method2056();
		this.aClass95_Sub1_7.method2074(false);
		this.aClass95_Sub1_7.method2099(false);
		this.aClass95_Sub1_7.method2102(false);
		this.aClass95_Sub1_7.method2096(false);
		this.aClass95_Sub1_7.method2062(0);
		this.aClass95_Sub1_7.method2053(-2);
		this.aClass95_Sub1_7.method2077(null);
		Static487.aFloatArray65[11] = 0.0F;
		Static487.aFloatArray65[14] = 0.0F;
		Static487.aFloatArray65[1] = 0.0F;
		Static487.aFloatArray65[0] = (float) 1024 / ((float) super.anInt8792 * 128.0F * (float) this.aClass95_Sub1_7.anInt2397);
		Static487.aFloatArray65[10] = 0.0F;
		Static487.aFloatArray65[4] = 0.0F;
		Static487.aFloatArray65[7] = 0.0F;
		Static487.aFloatArray65[13] = 1.0F - ((float) (arg3 * 1024) / 128.0F + (float) 0) / (float) this.aClass95_Sub1_7.anInt2469;
		Static487.aFloatArray65[2] = 0.0F;
		Static487.aFloatArray65[6] = 0.0F;
		Static487.aFloatArray65[5] = (float) 1024 / ((float) super.anInt8792 * 128.0F * (float) this.aClass95_Sub1_7.anInt2469);
		Static487.aFloatArray65[15] = 1.0F;
		Static487.aFloatArray65[8] = 0.0F;
		Static487.aFloatArray65[3] = 0.0F;
		Static487.aFloatArray65[9] = 0.0F;
		Static487.aFloatArray65[12] = -(((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass95_Sub1_7.anInt2397) - 1.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static487.aFloatArray65, 0);
		Static487.aFloatArray65[8] = 0.0F;
		Static487.aFloatArray65[0] = 1.0F;
		Static487.aFloatArray65[13] = 0.0F;
		Static487.aFloatArray65[5] = 0.0F;
		Static487.aFloatArray65[12] = 0.0F;
		Static487.aFloatArray65[6] = 1.0F;
		Static487.aFloatArray65[4] = 0.0F;
		Static487.aFloatArray65[10] = 0.0F;
		Static487.aFloatArray65[7] = 0.0F;
		Static487.aFloatArray65[9] = 1.0F;
		Static487.aFloatArray65[2] = 0.0F;
		Static487.aFloatArray65[14] = 0.0F;
		Static487.aFloatArray65[3] = 0.0F;
		Static487.aFloatArray65[15] = 1.0F;
		Static487.aFloatArray65[1] = 0.0F;
		Static487.aFloatArray65[11] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static487.aFloatArray65, 0);
		if ((this.anInt1963 & 0x7) == 0) {
			this.aClass95_Sub1_7.method2099(false);
		} else {
			this.aClass95_Sub1_7.method2099(true);
			this.aClass95_Sub1_7.method2054();
		}
		this.aClass95_Sub1_7.method2086(this.aClass82_4, this.aClass82_2, this.aClass82_1, this.aClass82_3);
		if (this.anInt1967 * 2 > this.aClass95_Sub1_7.aClass2_Sub22_Sub1_1.aByteArray115.length) {
			this.aClass95_Sub1_7.aClass2_Sub22_Sub1_1 = new Class2_Sub22_Sub1(this.anInt1967 * 2);
		} else {
			this.aClass95_Sub1_7.aClass2_Sub22_Sub1_1.anInt10247 = 0;
		}
		@Pc(315) int local315 = 0;
		@Pc(319) Class2_Sub22_Sub1 local319 = this.aClass95_Sub1_7.aClass2_Sub22_Sub1_1;
		@Pc(325) int local325;
		@Pc(334) int local334;
		@Pc(336) int local336;
		@Pc(354) short[] local354;
		@Pc(358) int local358;
		if (this.aClass95_Sub1_7.aBoolean174) {
			for (local325 = arg1; local325 < arg3; local325++) {
				local334 = local325 * super.anInt8791 + arg0;
				for (local336 = arg0; local336 < arg2; local336++) {
					if (arg4[local336 - arg0][local325 - arg1]) {
						local354 = this.aShortArrayArray13[local334];
						if (local354 != null) {
							for (local358 = 0; local358 < local354.length; local358++) {
								local319.method8500(local354[local358] & 0xFFFF);
								local315++;
							}
						}
					}
					local334++;
				}
			}
		} else {
			for (local325 = arg1; local325 < arg3; local325++) {
				local334 = arg0 + local325 * super.anInt8791;
				for (local336 = arg0; local336 < arg2; local336++) {
					if (arg4[local336 - arg0][local325 - arg1]) {
						local354 = this.aShortArrayArray13[local334];
						if (local354 != null) {
							for (local358 = 0; local358 < local354.length; local358++) {
								local319.method8492(local354[local358] & 0xFFFF);
								local315++;
							}
						}
					}
					local334++;
				}
			}
		}
		if (local315 > 0) {
			@Pc(479) Class153_Sub1 local479 = new Class153_Sub1(this.aClass95_Sub1_7, 5123, local319.aByteArray115, local319.anInt10247);
			this.aClass95_Sub1_7.method2118(local315, 0, local479);
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method7393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method1601(arg5, arg1, -1, arg0, arg4, arg2, arg3);
	}

	@OriginalMember(owner = "client!dn", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray8 == null) {
			this.anIntArrayArrayArray8 = new int[super.anInt8791][super.anInt8794][];
		}
		if (arg3 != null && this.anIntArrayArrayArray3 == null) {
			this.anIntArrayArrayArray3 = new int[super.anInt8791][super.anInt8794][];
		}
		@Pc(33) Interface6 local33 = this.aClass95_Sub1_7.anInterface6_27;
		this.anIntArrayArrayArray6[arg0][arg1] = arg2;
		this.anIntArrayArrayArray7[arg0][arg1] = arg4;
		this.anIntArrayArrayArray5[arg0][arg1] = arg6;
		this.anIntArrayArrayArray4[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray8 != null) {
			this.anIntArrayArrayArray8[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray3 != null) {
			this.anIntArrayArrayArray3[arg0][arg1] = arg3;
		}
		@Pc(92) Class2_Sub27[] local92 = this.aClass2_Sub27ArrayArrayArray1[arg0][arg1] = new Class2_Sub27[arg6.length];
		for (@Pc(94) int local94 = 0; local94 < arg6.length; local94++) {
			@Pc(100) int local100 = arg8[local94];
			@Pc(104) int local104 = arg9[local94];
			if ((this.anInt1963 & 0x20) != 0 && local100 != -1 && local33.method1492(local100).aBoolean308) {
				local104 = 128;
				local100 = -1;
			}
			@Pc(146) long local146 = (long) (local104 << 14) | (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48 | (long) local100;
			@Pc(152) Class2 local152;
			for (local152 = this.aClass118_14.method2595(local146); local152 != null; local152 = this.aClass118_14.method2605()) {
				@Pc(157) Class2_Sub27 local157 = (Class2_Sub27) local152;
				if (local100 == local157.anInt5136 && local157.aFloat94 == (float) local104 && arg10 == local157.anInt5137 && arg11 == local157.anInt5138 && local157.anInt5149 == arg12) {
					break;
				}
			}
			if (local152 == null) {
				local92[local94] = new Class2_Sub27(this, local100, local104, arg10, arg11, arg12);
				this.aClass118_14.method2601(local92[local94], local146);
			} else {
				local92[local94] = (Class2_Sub27) local152;
			}
		}
		if (arg13) {
			this.aByteArrayArray6[arg0][arg1] = (byte) (this.aByteArrayArray6[arg0][arg1] | 0x1);
		}
		if (this.anInt1970 < arg6.length) {
			this.anInt1970 = arg6.length;
		}
		this.anInt1969 += arg6.length;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method7395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method1601(arg6, arg1, arg5, arg0, arg4, arg2, arg3);
	}

	@OriginalMember(owner = "client!dn", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class2_Sub2_Sub19 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass93_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass95_Sub1_7.anInt2558 * arg2 >> 8) >> this.aClass95_Sub1_7.anInt2515;
			@Pc(38) int local38 = arg3 - (arg2 * this.aClass95_Sub1_7.anInt2548 >> 8) >> this.aClass95_Sub1_7.anInt2515;
			this.aClass93_1.method1849(arg0, local38, local24);
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIBLclient!ov;)V")
	private void method1598(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub2_Sub19_Sub1 arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray6[arg0][arg1];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray7[arg0][arg1];
		@Pc(22) int local22 = local12.length;
		if (local22 > this.aClass95_Sub1_7.anIntArray168.length) {
			this.aClass95_Sub1_7.anIntArray167 = new int[local22];
			this.aClass95_Sub1_7.anIntArray168 = new int[local22];
		}
		@Pc(42) int[] local42 = this.aClass95_Sub1_7.anIntArray168;
		@Pc(46) int[] local46 = this.aClass95_Sub1_7.anIntArray167;
		for (@Pc(52) int local52 = 0; local52 < local22; local52++) {
			local42[local52] = local12[local52] >> this.aClass95_Sub1_7.anInt2515;
			local46[local52] = local19[local52] >> this.aClass95_Sub1_7.anInt2515;
		}
		@Pc(80) int local80 = 0;
		while (local80 < local22) {
			@Pc(86) int local86 = local42[local80];
			@Pc(91) int local91 = local46[local80++];
			@Pc(95) int local95 = local42[local80];
			@Pc(100) int local100 = local46[local80++];
			@Pc(104) int local104 = local42[local80];
			@Pc(109) int local109 = local46[local80++];
			if (-((local104 - local95) * (-local91 + local100)) + (local86 - local95) * (local100 - local109) > 0) {
				arg2.method5594(local104, local109, local100, local91, local95, local86);
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.anInt1969 > 0) {
			@Pc(18) byte[][] local18 = new byte[super.anInt8791 + 1][super.anInt8794 + 1];
			@Pc(24) int local24;
			for (@Pc(20) int local20 = 1; super.anInt8791 > local20; local20++) {
				for (local24 = 1; local24 < super.anInt8794; local24++) {
					local18[local20][local24] = (byte) ((this.aByteArrayArray7[local20][local24 - 1] >> 2) + (this.aByteArrayArray7[local20 - 1][local24] >> 2) + (this.aByteArrayArray7[local20 + 1][local24] >> 3) + (this.aByteArrayArray7[local20][local24 + 1] >> 3) + (this.aByteArrayArray7[local20][local24] >> 1));
				}
			}
			this.aClass2_Sub27Array1 = new Class2_Sub27[this.aClass118_14.method2602()];
			this.aClass118_14.method2598(this.aClass2_Sub27Array1);
			for (local24 = 0; local24 < this.aClass2_Sub27Array1.length; local24++) {
				this.aClass2_Sub27Array1[local24].method4329(this.anInt1969);
			}
			@Pc(140) int local140 = 24;
			if (this.anIntArrayArrayArray8 != null) {
				local140 += 4;
			}
			if ((this.anInt1963 & 0x7) != 0) {
				local140 += 12;
			}
			@Pc(160) NativeHeapBuffer local160 = this.aClass95_Sub1_7.aNativeHeap1.a(local140 * this.anInt1969, false);
			@Pc(165) Stream local165 = new Stream(local160);
			@Pc(169) Class2_Sub27[] local169 = new Class2_Sub27[this.anInt1969];
			@Pc(176) int local176 = Static285.method3974(this.anInt1969 / 4);
			if (local176 < 1) {
				local176 = 1;
			}
			@Pc(188) Class118 local188 = new Class118(local176);
			@Pc(192) Class2_Sub27[] local192 = new Class2_Sub27[this.anInt1970];
			@Pc(198) int local198;
			for (@Pc(194) int local194 = 0; super.anInt8791 > local194; local194++) {
				for (local198 = 0; super.anInt8794 > local198; local198++) {
					if (this.anIntArrayArrayArray5[local194][local198] != null) {
						@Pc(214) Class2_Sub27[] local214 = this.aClass2_Sub27ArrayArrayArray1[local194][local198];
						@Pc(221) int[] local221 = this.anIntArrayArrayArray6[local194][local198];
						@Pc(228) int[] local228 = this.anIntArrayArrayArray7[local194][local198];
						@Pc(235) int[] local235 = this.anIntArrayArrayArray4[local194][local198];
						@Pc(242) int[] local242 = this.anIntArrayArrayArray5[local194][local198];
						@Pc(254) int[] local254 = this.anIntArrayArrayArray3 == null ? null : this.anIntArrayArrayArray3[local194][local198];
						@Pc(266) int[] local266 = this.anIntArrayArrayArray8 == null ? null : this.anIntArrayArrayArray8[local194][local198];
						if (local235 == null) {
							local235 = local242;
						}
						@Pc(277) float local277 = this.aFloatArrayArray2[local194][local198];
						@Pc(284) float local284 = this.aFloatArrayArray1[local194][local198];
						@Pc(291) float local291 = this.aFloatArrayArray3[local194][local198];
						@Pc(300) float local300 = this.aFloatArrayArray2[local194][local198 + 1];
						@Pc(309) float local309 = this.aFloatArrayArray1[local194][local198 + 1];
						@Pc(318) float local318 = this.aFloatArrayArray3[local194][local198 + 1];
						@Pc(329) float local329 = this.aFloatArrayArray2[local194 + 1][local198 + 1];
						@Pc(340) float local340 = this.aFloatArrayArray1[local194 + 1][local198 + 1];
						@Pc(351) float local351 = this.aFloatArrayArray3[local194 + 1][local198 + 1];
						@Pc(360) float local360 = this.aFloatArrayArray2[local194 + 1][local198];
						@Pc(369) float local369 = this.aFloatArrayArray1[local194 + 1][local198];
						@Pc(378) float local378 = this.aFloatArrayArray3[local194 + 1][local198];
						@Pc(386) int local386 = local18[local194][local198] & 0xFF;
						@Pc(396) int local396 = local18[local194][local198 + 1] & 0xFF;
						@Pc(408) int local408 = local18[local194 + 1][local198 + 1] & 0xFF;
						@Pc(418) int local418 = local18[local194 + 1][local198] & 0xFF;
						@Pc(420) int local420 = 0;
						@Pc(430) int local430;
						label337: for (@Pc(422) int local422 = 0; local422 < local242.length; local422++) {
							@Pc(428) Class2_Sub27 local428 = local214[local422];
							for (local430 = 0; local430 < local420; local430++) {
								if (local428 == local192[local430]) {
									continue label337;
								}
							}
							local192[local420++] = local428;
						}
						@Pc(471) short[] local471 = this.aShortArrayArray13[super.anInt8791 * local198 + local194] = new short[local242.length];
						for (local430 = 0; local430 < local242.length; local430++) {
							@Pc(485) int local485 = (local194 << super.anInt8795) + local221[local430];
							@Pc(494) int local494 = (local198 << super.anInt8795) + local228[local430];
							@Pc(499) int local499 = local485 >> this.anInt1961;
							@Pc(504) int local504 = local494 >> this.anInt1961;
							@Pc(508) int local508 = local242[local430];
							@Pc(512) int local512 = local235[local430];
							@Pc(520) int local520 = local254 == null ? 0 : local254[local430];
							@Pc(538) long local538 = (long) local512 << 48 | (long) local508 << 32 | (long) (local499 << 16) | (long) local504;
							@Pc(542) int local542 = local221[local430];
							@Pc(546) int local546 = local228[local430];
							@Pc(548) byte local548 = 74;
							@Pc(550) int local550 = 0;
							@Pc(664) float local664;
							@Pc(655) float local655;
							@Pc(681) float local681;
							@Pc(619) float local619;
							@Pc(720) int local720;
							if (local542 == 0 && local546 == 0) {
								local720 = local548 - local386;
								local655 = local284;
								local664 = local277;
								local681 = local291;
							} else if (local542 == 0 && local546 == super.anInt8792) {
								local681 = local318;
								local720 = local548 - local396;
								local655 = local309;
								local664 = local300;
							} else if (local542 == super.anInt8792 && super.anInt8792 == local546) {
								local720 = local548 - local408;
								local681 = local351;
								local664 = local329;
								local655 = local340;
							} else if (super.anInt8792 == local542 && local546 == 0) {
								local664 = local360;
								local720 = local548 - local418;
								local655 = local369;
								local681 = local378;
							} else {
								@Pc(594) float local594 = (float) local542 / (float) super.anInt8792;
								@Pc(601) float local601 = (float) local546 / (float) super.anInt8792;
								@Pc(610) float local610 = local594 * (local360 - local277) + local277;
								local619 = local284 + (local369 - local284) * local594;
								@Pc(628) float local628 = local594 * (local378 - local291) + local291;
								@Pc(637) float local637 = local594 * (local329 - local300) + local300;
								@Pc(646) float local646 = local309 + (local340 - local309) * local594;
								local655 = (local646 - local619) * local601 + local619;
								local664 = local610 + (local637 - local610) * local601;
								@Pc(673) float local673 = local318 + local594 * (local351 - local318);
								local681 = local628 + (local673 - local628) * local601;
								@Pc(694) int local694 = local386 + (local542 * (local418 - local386) >> super.anInt8795);
								@Pc(706) int local706 = (local542 * (local408 - local396) >> super.anInt8795) + local396;
								local720 = local548 - (local546 * (local706 - local694) >> super.anInt8795) - local694;
							}
							@Pc(770) float local770 = 1.0F;
							if (local508 != -1) {
								@Pc(782) int local782 = local720 * (local508 & 0x7F) >> 7;
								if (local782 < 2) {
									local782 = 2;
								} else if (local782 > 126) {
									local782 = 126;
								}
								if ((this.anInt1963 & 0x7) == 0) {
									local770 = this.aClass95_Sub1_7.aFloatArray7[2] * local681 + local664 * this.aClass95_Sub1_7.aFloatArray7[0] + this.aClass95_Sub1_7.aFloatArray7[1] * local655;
									local770 = this.aClass95_Sub1_7.aFloat36 + (local770 > 0.0F ? this.aClass95_Sub1_7.aFloat25 : this.aClass95_Sub1_7.aFloat28) * local770;
								}
								local550 = Static343.anIntArray359[local508 & 0xFF80 | local782];
							}
							@Pc(851) Class2 local851 = null;
							if ((this.anInt1952 - 1 & local485) == 0 && (local494 & this.anInt1952 - 1) == 0) {
								local851 = local188.method2595(local538);
							}
							@Pc(1209) int local1209;
							@Pc(905) int local905;
							if (local851 == null) {
								if (local512 == local508) {
									local905 = local550;
								} else {
									@Pc(883) int local883 = (local512 & 0x7F) * local720 >> 7;
									if (local883 < 2) {
										local883 = 2;
									} else if (local883 > 126) {
										local883 = 126;
									}
									local905 = Static343.anIntArray359[local883 | local512 & 0xFF80];
									if ((this.anInt1963 & 0x7) == 0) {
										local619 = local681 * this.aClass95_Sub1_7.aFloatArray7[2] + local664 * this.aClass95_Sub1_7.aFloatArray7[0] + local655 * this.aClass95_Sub1_7.aFloatArray7[1];
										local619 = this.aClass95_Sub1_7.aFloat36 + local770 * (local770 > 0.0F ? this.aClass95_Sub1_7.aFloat25 : this.aClass95_Sub1_7.aFloat28);
										@Pc(958) int local958 = local905 >> 16 & 0xFF;
										@Pc(964) int local964 = local905 >> 8 & 0xFF;
										@Pc(968) int local968 = local905 & 0xFF;
										local958 = (int) ((float) local958 * local619);
										if (local958 < 0) {
											local958 = 0;
										} else if (local958 > 255) {
											local958 = 255;
										}
										local964 = (int) ((float) local964 * local619);
										local968 = (int) ((float) local968 * local619);
										if (local964 < 0) {
											local964 = 0;
										} else if (local964 > 255) {
											local964 = 255;
										}
										if (local968 < 0) {
											local968 = 0;
										} else if (local968 > 255) {
											local968 = 255;
										}
										local905 = local964 << 8 | local958 << 16 | local968;
									}
								}
								if (this.aClass95_Sub1_7.aBoolean174) {
									local165.b((float) local485);
									local165.b((float) (this.method7398(local485, local494) + local520));
									local165.b((float) local494);
									local165.a((byte) (local905 >> 16));
									local165.a((byte) (local905 >> 8));
									local165.a((byte) local905);
									local165.a(-1);
									local165.b((float) local485);
									local165.b((float) local494);
									if (this.anIntArrayArrayArray8 != null) {
										local165.b((float) (local266 == null ? 0 : local266[local430] - 1));
									}
									if ((this.anInt1963 & 0x7) != 0) {
										local165.b(local664);
										local165.b(local655);
										local165.b(local681);
									}
								} else {
									local165.a((float) local485);
									local165.a((float) (local520 + this.method7398(local485, local494)));
									local165.a((float) local494);
									local165.a((byte) (local905 >> 16));
									local165.a((byte) (local905 >> 8));
									local165.a((byte) local905);
									local165.a(-1);
									local165.a((float) local485);
									local165.a((float) local494);
									if (this.anIntArrayArrayArray8 != null) {
										local165.a((float) (local266 == null ? 0 : local266[local430] - 1));
									}
									if ((this.anInt1963 & 0x7) != 0) {
										local165.a(local664);
										local165.a(local655);
										local165.a(local681);
									}
								}
								local1209 = this.anInt1962++;
								local471[local430] = (short) local1209;
								if (local508 != -1) {
									local169[local1209] = local214[local430];
								}
								local188.method2601(new Class2_Sub16(local471[local430]), local538);
							} else {
								local471[local430] = ((Class2_Sub16) local851).aShort33;
								local1209 = local471[local430] & 0xFFFF;
								if (local508 != -1 && local169[local1209].aLong280 > local214[local430].aLong280) {
									local169[local1209] = local214[local430];
								}
							}
							for (local905 = 0; local905 < local420; local905++) {
								local192[local905].method4330(local550, local720, local770, local1209);
							}
							this.anInt1967++;
						}
					}
				}
			}
			for (local198 = 0; local198 < this.anInt1962; local198++) {
				@Pc(1317) Class2_Sub27 local1317 = local169[local198];
				if (local1317 != null) {
					local1317.method4335(local198);
				}
			}
			@Pc(1354) int local1354;
			for (@Pc(1334) int local1334 = 0; local1334 < super.anInt8791; local1334++) {
				for (@Pc(1338) int local1338 = 0; super.anInt8794 > local1338; local1338++) {
					@Pc(1350) short[] local1350 = this.aShortArrayArray13[local1334 + local1338 * super.anInt8791];
					if (local1350 != null) {
						local1354 = 0;
						@Pc(1356) int local1356 = 0;
						while (local1350.length > local1356) {
							@Pc(1365) int local1365 = local1350[local1356++] & 0xFFFF;
							@Pc(1372) int local1372 = local1350[local1356++] & 0xFFFF;
							@Pc(1379) int local1379 = local1350[local1356++] & 0xFFFF;
							@Pc(1383) Class2_Sub27 local1383 = local169[local1365];
							@Pc(1387) Class2_Sub27 local1387 = local169[local1372];
							@Pc(1391) Class2_Sub27 local1391 = local169[local1379];
							@Pc(1393) Class2_Sub27 local1393 = null;
							if (local1383 != null) {
								local1383.method4336(local1354, local1338, local1334);
								local1393 = local1383;
							}
							if (local1387 != null) {
								local1387.method4336(local1354, local1338, local1334);
								if (local1393 == null || local1393.aLong280 > local1387.aLong280) {
									local1393 = local1387;
								}
							}
							if (local1391 != null) {
								local1391.method4336(local1354, local1338, local1334);
								if (local1393 == null || local1391.aLong280 < local1393.aLong280) {
									local1393 = local1391;
								}
							}
							if (local1393 != null) {
								if (local1383 != null) {
									local1393.method4335(local1365);
								}
								if (local1387 != null) {
									local1393.method4335(local1372);
								}
								if (local1391 != null) {
									local1393.method4335(local1379);
								}
								local1393.method4336(local1354, local1338, local1334);
							}
							local1354++;
						}
					}
				}
			}
			local165.c();
			this.anInterface12_1 = this.aClass95_Sub1_7.method2042(local160, local165.b(), local140);
			this.aClass82_2 = new Class82(this.anInterface12_1, 5126, 3, 0);
			this.aClass82_4 = new Class82(this.anInterface12_1, 5121, 4, 12);
			@Pc(1544) byte local1544;
			if (this.anIntArrayArrayArray8 == null) {
				local1544 = 24;
				this.aClass82_1 = new Class82(this.anInterface12_1, 5126, 2, 16);
			} else {
				this.aClass82_1 = new Class82(this.anInterface12_1, 5126, 3, 16);
				local1544 = 28;
			}
			if ((this.anInt1963 & 0x7) != 0) {
				this.aClass82_3 = new Class82(this.anInterface12_1, 5126, 3, local1544);
			}
			@Pc(1578) long[] local1578 = new long[this.aClass2_Sub27Array1.length];
			for (local1354 = 0; local1354 < this.aClass2_Sub27Array1.length; local1354++) {
				@Pc(1587) Class2_Sub27 local1587 = this.aClass2_Sub27Array1[local1354];
				local1578[local1354] = local1587.aLong280;
				local1587.method4328(this.anInt1962);
			}
			Static72.method1003(local1578, this.aClass2_Sub27Array1);
			if (this.aClass93_1 != null) {
				this.aClass93_1.method1855();
			}
		} else {
			this.aClass93_1 = null;
		}
		this.aByteArrayArray7 = null;
		this.aClass2_Sub27ArrayArrayArray1 = null;
		this.anIntArrayArrayArray5 = null;
		this.anIntArrayArrayArray8 = null;
		this.aClass118_14 = null;
		this.anIntArrayArrayArray6 = this.anIntArrayArrayArray7 = null;
		this.anIntArrayArrayArray3 = null;
		this.anIntArrayArrayArray4 = null;
		this.aFloatArrayArray2 = this.aFloatArrayArray1 = this.aFloatArrayArray3 = null;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method7399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIIIZI[[Z)V")
	private void method1601(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean[][] arg6) {
		if (this.aClass2_Sub27Array1 == null) {
			return;
		}
		@Pc(10) int local10 = arg5 + arg5 + 1;
		@Pc(14) int local14 = local10 * local10;
		if (this.aClass95_Sub1_7.anIntArray166.length < local14) {
			this.aClass95_Sub1_7.anIntArray166 = new int[local14];
		}
		if (this.anInt1967 * 2 > this.aClass95_Sub1_7.aClass2_Sub22_Sub1_1.aByteArray115.length) {
			this.aClass95_Sub1_7.aClass2_Sub22_Sub1_1 = new Class2_Sub22_Sub1(this.anInt1967 * 2);
		}
		@Pc(49) int local49 = arg3 - arg5;
		@Pc(51) int local51 = local49;
		if (local49 < 0) {
			local49 = 0;
		}
		@Pc(60) int local60 = arg1 - arg5;
		@Pc(62) int local62 = local60;
		if (local60 < 0) {
			local60 = 0;
		}
		@Pc(73) int local73 = arg5 + arg3;
		if (local73 > super.anInt8791 - 1) {
			local73 = super.anInt8791 - 1;
		}
		@Pc(92) int local92 = arg5 + arg1;
		if (local92 > super.anInt8794 - 1) {
			local92 = super.anInt8794 - 1;
		}
		@Pc(105) int local105 = 0;
		@Pc(109) int[] local109 = this.aClass95_Sub1_7.anIntArray166;
		@Pc(122) int local122;
		for (@Pc(111) int local111 = local49; local111 <= local73; local111++) {
			@Pc(120) boolean[] local120 = arg6[local111 - local51];
			for (local122 = local60; local122 <= local92; local122++) {
				if (local120[local122 - local62]) {
					local109[local105++] = local111 + super.anInt8791 * local122;
				}
			}
		}
		if (arg2 == -1) {
			this.aClass95_Sub1_7.method2060();
		} else {
			this.aClass95_Sub1_7.method2040((float) arg2);
			this.aClass95_Sub1_7.method2063();
		}
		this.aClass95_Sub1_7.method2099((this.anInt1963 & 0x7) != 0);
		for (@Pc(188) int local188 = 0; local188 < this.aClass2_Sub27Array1.length; local188++) {
			this.aClass2_Sub27Array1[local188].method4333(local109, local105);
		}
		if (!this.aClass109_10.method2328()) {
			local122 = this.aClass95_Sub1_7.anInt2539;
			@Pc(217) int local217 = this.aClass95_Sub1_7.anInt2540;
			this.aClass95_Sub1_7.L(0, local217, this.aClass95_Sub1_7.anInt2541);
			this.aClass95_Sub1_7.method2099(false);
			this.aClass95_Sub1_7.method2096(false);
			this.aClass95_Sub1_7.method2062(128);
			this.aClass95_Sub1_7.method2053(-2);
			this.aClass95_Sub1_7.method2077(this.aClass95_Sub1_7.aClass65_Sub1_1);
			this.aClass95_Sub1_7.method2105(8448, 7681);
			this.aClass95_Sub1_7.method2101(770, 34166, 0);
			this.aClass95_Sub1_7.method2095(0, 34167);
			for (@Pc(277) Class2 local277 = this.aClass109_10.method2325(); local277 != null; local277 = this.aClass109_10.method2318()) {
				@Pc(282) Class2_Sub10 local282 = (Class2_Sub10) local277;
				local282.method2160(arg6, arg3, arg5, arg1);
			}
			this.aClass95_Sub1_7.method2101(768, 5890, 0);
			this.aClass95_Sub1_7.method2095(0, 5890);
			this.aClass95_Sub1_7.method2077(null);
			this.aClass95_Sub1_7.L(local122, local217, this.aClass95_Sub1_7.anInt2541);
		}
		if (this.aClass93_1 == null) {
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		this.aClass95_Sub1_7.method2086(null, this.aClass82_2, this.aClass82_1, null);
		this.aClass93_1.method1850(arg1, arg4, arg5, arg6, arg3);
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!dn", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class2_Sub2_Sub19 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass93_1 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (this.aClass95_Sub1_7.anInt2558 * arg2 >> 8) >> this.aClass95_Sub1_7.anInt2515;
			@Pc(37) int local37 = arg3 - (this.aClass95_Sub1_7.anInt2548 * arg2 >> 8) >> this.aClass95_Sub1_7.anInt2515;
			this.aClass93_1.method1852(local23, local37, arg0);
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)V")
	@Override
	public void method7394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!dn", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class2_Sub2_Sub19 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub2_Sub19 arg2) {
		if ((this.aByteArrayArray6[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt8792 >> this.aClass95_Sub1_7.anInt2515;
		@Pc(27) Class2_Sub2_Sub19_Sub1 local27 = (Class2_Sub2_Sub19_Sub1) arg2;
		@Pc(37) Class2_Sub2_Sub19_Sub1 local37;
		if (local27 != null && local27.method5596(local24, local24)) {
			local37 = local27;
			local27.method5595();
		} else {
			local37 = new Class2_Sub2_Sub19_Sub1(this.aClass95_Sub1_7, local24, local24);
		}
		local37.method5597(local24, 0, 0, local24);
		this.method1598(arg0, arg1, local37);
		return local37;
	}
}
