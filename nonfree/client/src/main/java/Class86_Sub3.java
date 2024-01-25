import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!um")
public final class Class86_Sub3 extends Class86 {

	@OriginalMember(owner = "client!um", name = "B", descriptor = "I")
	private int anInt9968;

	@OriginalMember(owner = "client!um", name = "L", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray17;

	@OriginalMember(owner = "client!um", name = "T", descriptor = "I")
	private int anInt9978;

	@OriginalMember(owner = "client!um", name = "Y", descriptor = "I")
	private int anInt9983;

	@OriginalMember(owner = "client!um", name = "ab", descriptor = "[Lclient!o;")
	private Class8_Sub37[] aClass8_Sub37Array1;

	@OriginalMember(owner = "client!um", name = "cb", descriptor = "Lclient!f;")
	public Class94 aClass94_23;

	@OriginalMember(owner = "client!um", name = "db", descriptor = "I")
	private int anInt9984;

	@OriginalMember(owner = "client!um", name = "eb", descriptor = "Lclient!el;")
	private Interface4 anInterface4_17;

	@OriginalMember(owner = "client!um", name = "gb", descriptor = "Lclient!el;")
	private Interface4 anInterface4_18;

	@OriginalMember(owner = "client!um", name = "C", descriptor = "F")
	private float aFloat192 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!um", name = "p", descriptor = "F")
	private float aFloat191 = -3.4028235E38F;

	@OriginalMember(owner = "client!um", name = "s", descriptor = "Lclient!bq;")
	private final Class43 aClass43_62 = new Class43();

	@OriginalMember(owner = "client!um", name = "X", descriptor = "I")
	private final int anInt9982 = this.anInt9954 - 2;

	@OriginalMember(owner = "client!um", name = "A", descriptor = "Lclient!ln;")
	public final Class16_Sub1 aClass16_Sub1_22;

	@OriginalMember(owner = "client!um", name = "E", descriptor = "I")
	public final int anInt9970;

	@OriginalMember(owner = "client!um", name = "F", descriptor = "[[[Lclient!o;")
	private Class8_Sub37[][][] aClass8_Sub37ArrayArrayArray1;

	@OriginalMember(owner = "client!um", name = "Z", descriptor = "[[F")
	private float[][] aFloatArrayArray19;

	@OriginalMember(owner = "client!um", name = "t", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!um", name = "r", descriptor = "I")
	private final int anInt9965;

	@OriginalMember(owner = "client!um", name = "fb", descriptor = "[[F")
	private float[][] aFloatArrayArray20;

	@OriginalMember(owner = "client!um", name = "J", descriptor = "[[B")
	private final byte[][] aByteArrayArray159;

	@OriginalMember(owner = "client!um", name = "y", descriptor = "[[S")
	public final short[][] aShortArrayArray12;

	@OriginalMember(owner = "client!um", name = "M", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray18;

	@OriginalMember(owner = "client!um", name = "G", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!um", name = "hb", descriptor = "[[F")
	private float[][] aFloatArrayArray21;

	@OriginalMember(owner = "client!um", name = "z", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!um", name = "ib", descriptor = "[[B")
	private byte[][] aByteArrayArray160;

	@OriginalMember(owner = "client!um", name = "x", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!um", name = "bb", descriptor = "Lclient!pfa;")
	private Class253 aClass253_40;

	@OriginalMember(owner = "client!um", name = "w", descriptor = "Lclient!nw;")
	private Class231 aClass231_2;

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lclient!ln;IIII[[I[[II)V")
	public Class86_Sub3(@OriginalArg(0) Class16_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass16_Sub1_22 = arg0;
		this.anInt9970 = arg2;
		this.aClass8_Sub37ArrayArrayArray1 = new Class8_Sub37[arg3][arg4][];
		this.aFloatArrayArray19 = new float[super.anInt9955 + 1][super.anInt9953 + 1];
		this.anIntArrayArrayArray13 = new int[arg3][arg4][];
		this.anInt9965 = 0x1 << this.anInt9982;
		this.aFloatArrayArray20 = new float[super.anInt9955 + 1][super.anInt9953 + 1];
		this.aByteArrayArray159 = new byte[arg3][arg4];
		this.aShortArrayArray12 = new short[arg3 * arg4][];
		this.anIntArrayArrayArray18 = new int[arg3][arg4][];
		this.anIntArrayArrayArray16 = new int[arg3][arg4][];
		this.aFloatArrayArray21 = new float[super.anInt9955 + 1][super.anInt9953 + 1];
		this.anIntArrayArrayArray15 = new int[arg3][arg4][];
		this.aByteArrayArray160 = new byte[arg3 + 1][arg4 + 1];
		this.anIntArrayArrayArray14 = new int[arg3][arg4][];
		for (@Pc(121) int local121 = 0; local121 <= super.anInt9953; local121++) {
			for (@Pc(125) int local125 = 0; local125 <= super.anInt9955; local125++) {
				@Pc(134) int local134 = super.anIntArrayArray60[local125][local121];
				if ((float) local134 > this.aFloat191) {
					this.aFloat191 = local134;
				}
				if ((float) local134 < this.aFloat192) {
					this.aFloat192 = local134;
				}
				if (local125 > 0 && local121 > 0 && local125 < super.anInt9955 && local121 < super.anInt9953) {
					@Pc(193) int local193 = arg6[local125 + 1][local121] - arg6[local125 - 1][local121];
					@Pc(210) int local210 = arg6[local125][local121 + 1] - arg6[local125][local121 - 1];
					@Pc(229) float local229 = (float) (1.0D / Math.sqrt((double) (arg7 * arg7 * 4 + local193 * local193 + local210 * local210)));
					this.aFloatArrayArray20[local125][local121] = (float) local193 * local229;
					this.aFloatArrayArray21[local125][local121] = local229 * (float) (-arg7 * 2);
					this.aFloatArrayArray19[local125][local121] = local229 * (float) local210;
				}
			}
		}
		this.aFloat192--;
		this.aFloat191++;
		this.aClass253_40 = new Class253(128);
		if ((this.anInt9970 & 0x10) != 0) {
			this.aClass231_2 = new Class231(this.aClass16_Sub1_22, this);
		}
	}

	@OriginalMember(owner = "client!um", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray17 == null) {
			this.anIntArrayArrayArray17 = new int[super.anInt9955][super.anInt9953][];
		}
		if (arg3 != null && this.anIntArrayArrayArray16 == null) {
			this.anIntArrayArrayArray16 = new int[super.anInt9955][super.anInt9953][];
		}
		@Pc(33) Interface2 local33 = this.aClass16_Sub1_22.anInterface2_12;
		this.anIntArrayArrayArray18[arg0][arg1] = arg2;
		this.anIntArrayArrayArray14[arg0][arg1] = arg4;
		this.anIntArrayArrayArray13[arg0][arg1] = arg6;
		this.anIntArrayArrayArray15[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray17 != null) {
			this.anIntArrayArrayArray17[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray16 != null) {
			this.anIntArrayArrayArray16[arg0][arg1] = arg3;
		}
		@Pc(92) Class8_Sub37[] local92 = this.aClass8_Sub37ArrayArrayArray1[arg0][arg1] = new Class8_Sub37[arg6.length];
		for (@Pc(94) int local94 = 0; local94 < arg6.length; local94++) {
			@Pc(100) int local100 = arg8[local94];
			@Pc(104) int local104 = arg9[local94];
			if ((this.anInt9970 & 0x20) != 0 && local100 != -1 && local33.method4027(local100).aBoolean471) {
				local100 = -1;
				local104 = 128;
			}
			@Pc(145) long local145 = (long) (local104 << 14) | (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42 | (long) local100;
			@Pc(151) Class8 local151;
			for (local151 = this.aClass253_40.method6594(local145); local151 != null; local151 = this.aClass253_40.method6599()) {
				@Pc(156) Class8_Sub37 local156 = (Class8_Sub37) local151;
				if (local156.anInt7412 == local100 && (float) local104 == local156.aFloat170 && arg10 == local156.anInt7407 && arg11 == local156.anInt7409 && arg12 == local156.anInt7413) {
					break;
				}
			}
			if (local151 == null) {
				local92[local94] = new Class8_Sub37(this, local100, local104, arg10, arg11, arg12);
				this.aClass253_40.method6591(local92[local94], local145);
			} else {
				local92[local94] = (Class8_Sub37) local151;
			}
		}
		if (arg13) {
			this.aByteArrayArray159[arg0][arg1] = (byte) (this.aByteArrayArray159[arg0][arg1] | 0x1);
		}
		if (this.anInt9984 < arg6.length) {
			this.anInt9984 = arg6.length;
		}
		this.anInt9983 += arg6.length;
	}

	@OriginalMember(owner = "client!um", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class8_Sub5_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass231_2 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (this.aClass16_Sub1_22.anInt4928 * arg2 >> 8) >> this.aClass16_Sub1_22.anInt4909;
			@Pc(37) int local37 = arg3 - (this.aClass16_Sub1_22.anInt4902 * arg2 >> 8) >> this.aClass16_Sub1_22.anInt4909;
			this.aClass231_2.method6037(local23, arg0, local37);
		}
	}

	@OriginalMember(owner = "client!um", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray160[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray160[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method8082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method8092(arg2, -1, arg0, arg4, arg5, arg1, arg3);
	}

	@OriginalMember(owner = "client!um", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class8_Sub5_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass231_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass16_Sub1_22.anInt4928 * arg2 >> 8) >> this.aClass16_Sub1_22.anInt4909;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass16_Sub1_22.anInt4902 >> 8) >> this.aClass16_Sub1_22.anInt4909;
			this.aClass231_2.method6030(local24, local39, arg0);
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(II)V")
	@Override
	public void method8087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!um", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class8_Sub5_Sub11 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8_Sub5_Sub11 arg2) {
		if ((this.aByteArrayArray159[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(21) int local21 = super.anInt9958 >> this.aClass16_Sub1_22.anInt4909;
		@Pc(24) Class8_Sub5_Sub11_Sub2 local24 = (Class8_Sub5_Sub11_Sub2) arg2;
		@Pc(40) Class8_Sub5_Sub11_Sub2 local40;
		if (local24 != null && local24.method7261(local21, local21)) {
			local40 = local24;
			local24.method7269();
		} else {
			local40 = new Class8_Sub5_Sub11_Sub2(this.aClass16_Sub1_22, local21, local21);
		}
		local40.method7264(local21, 0, 0, local21);
		this.method8091(arg1, arg0, local40);
		return local40;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IIILclient!ru;)V")
	private void method8091(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class8_Sub5_Sub11_Sub2 arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray18[arg1][arg0];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray14[arg1][arg0];
		@Pc(22) int local22 = local12.length;
		if (local22 > Static497.anIntArray607.length) {
			Static112.anIntArray150 = new int[local22];
			Static497.anIntArray607 = new int[local22];
		}
		for (@Pc(34) int local34 = 0; local34 < local22; local34++) {
			Static497.anIntArray607[local34] = local12[local34] >> this.aClass16_Sub1_22.anInt4909;
			Static112.anIntArray150[local34] = local19[local34] >> this.aClass16_Sub1_22.anInt4909;
		}
		@Pc(66) int local66 = 0;
		while (local22 > local66) {
			@Pc(72) int local72 = Static497.anIntArray607[local66];
			@Pc(77) int local77 = Static112.anIntArray150[local66++];
			@Pc(81) int local81 = Static497.anIntArray607[local66];
			@Pc(86) int local86 = Static112.anIntArray150[local66++];
			@Pc(90) int local90 = Static497.anIntArray607[local66];
			@Pc(95) int local95 = Static112.anIntArray150[local66++];
			if (-((local86 - local77) * (-local81 + local90)) + (local86 - local95) * (local72 - local81) > 0) {
				arg2.method7267(local90, local81, local72, local86, local77, local95);
			}
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!ada;[I)V")
	@Override
	public void method8083(@OriginalArg(0) Class8_Sub1 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass43_62.method1424(new Class8_Sub12(this.aClass16_Sub1_22, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method8081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIZZII[[Z)V")
	private void method8092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean[][] arg6) {
		if (this.aClass8_Sub37Array1 == null) {
			return;
		}
		@Pc(10) int local10 = arg0 + arg0 + 1;
		@Pc(14) int local14 = local10 * local10;
		if (Static192.anIntArray246.length < local14) {
			Static192.anIntArray246 = new int[local14];
		}
		@Pc(26) int local26 = arg2 - arg0;
		@Pc(28) int local28 = local26;
		if (local26 < 0) {
			local26 = 0;
		}
		@Pc(40) int local40 = arg5 - arg0;
		@Pc(42) int local42 = local40;
		if (local40 < 0) {
			local40 = 0;
		}
		@Pc(50) int local50 = arg0 + arg2;
		if (super.anInt9955 - 1 < local50) {
			local50 = super.anInt9955 - 1;
		}
		@Pc(69) int local69 = arg0 + arg5;
		Static151.anInt3719 = 0;
		if (super.anInt9953 - 1 < local69) {
			local69 = super.anInt9953 - 1;
		}
		for (@Pc(88) int local88 = local26; local88 <= local50; local88++) {
			@Pc(97) boolean[] local97 = arg6[local88 - local28];
			for (@Pc(99) int local99 = local40; local99 <= local69; local99++) {
				if (local97[local99 - local42]) {
					Static192.anIntArray246[Static151.anInt3719++] = local88 + super.anInt9955 * local99;
				}
			}
		}
		if (arg1 == -1) {
			this.aClass16_Sub1_22.method3938();
		} else {
			this.aClass16_Sub1_22.method3894((float) arg1);
			this.aClass16_Sub1_22.method3900();
		}
		this.aClass16_Sub1_22.method3976();
		this.aClass16_Sub1_22.method3966((this.anInt9970 & 0x7) != 0);
		this.aClass16_Sub1_22.method3957(false, false, -1);
		this.aClass16_Sub1_22.method3983(this.anInterface4_17, 0);
		for (@Pc(181) int local181 = 0; local181 < this.aClass8_Sub37Array1.length; local181++) {
			this.aClass8_Sub37Array1[local181].method6047(Static151.anInt3719, Static192.anIntArray246);
		}
		@Pc(202) Class54_Sub3 local202 = this.aClass16_Sub1_22.method3945();
		local202.method5128(0, -1, 0);
		this.aClass16_Sub1_22.method3986();
		if (!this.aClass43_62.method1420()) {
			@Pc(220) int local220 = this.aClass16_Sub1_22.anInt4915;
			@Pc(224) int local224 = this.aClass16_Sub1_22.anInt4903;
			this.aClass16_Sub1_22.L(0, local224, this.aClass16_Sub1_22.anInt4922);
			this.aClass16_Sub1_22.method3966(false);
			this.aClass16_Sub1_22.method3916(false);
			this.aClass16_Sub1_22.method3956(128);
			this.aClass16_Sub1_22.method3957(false, false, -2);
			this.aClass16_Sub1_22.method3889(this.aClass16_Sub1_22.anInterface12_3);
			this.aClass16_Sub1_22.method3924(Static428.aClass34_5, Static402.aClass34_4);
			this.aClass16_Sub1_22.method3946(0, Static190.aClass265_8);
			this.aClass16_Sub1_22.method3950(0, Static303.aClass265_5);
			for (@Pc(284) Class8 local284 = this.aClass43_62.method1422(); local284 != null; local284 = this.aClass43_62.method1426()) {
				@Pc(289) Class8_Sub12 local289 = (Class8_Sub12) local284;
				local289.method1732(arg6, arg2, arg0, arg5);
			}
			this.aClass16_Sub1_22.method3946(0, Static625.aClass265_10);
			this.aClass16_Sub1_22.method3950(0, Static625.aClass265_10);
			this.aClass16_Sub1_22.method3889(null);
			this.aClass16_Sub1_22.L(local220, local224, this.aClass16_Sub1_22.anInt4922);
		}
		if (this.aClass231_2 != null) {
			this.aClass16_Sub1_22.method3983(this.anInterface4_17, 0);
			this.aClass16_Sub1_22.method3983(this.anInterface4_18, 1);
			this.aClass16_Sub1_22.method3967(this.aClass94_23);
			this.aClass231_2.method6032(arg3, arg0, arg5, arg6, arg2);
		}
	}

	@OriginalMember(owner = "client!um", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.anInt9983 > 0) {
			@Pc(18) byte[][] local18 = new byte[super.anInt9955 + 1][super.anInt9953 + 1];
			for (@Pc(20) int local20 = 1; super.anInt9955 > local20; local20++) {
				for (@Pc(24) int local24 = 1; local24 < super.anInt9953; local24++) {
					local18[local20][local24] = (byte) ((this.aByteArrayArray160[local20][local24 - 1] >> 2) + (this.aByteArrayArray160[local20 + 1][local24] >> 3) + (this.aByteArrayArray160[local20 + -1][local24] >> 2) + (this.aByteArrayArray160[local20][local24 + 1] >> 3) + (this.aByteArrayArray160[local20][local24] >> 1));
				}
			}
			@Pc(108) Class8_Sub37[] local108 = new Class8_Sub37[this.aClass253_40.method6592()];
			this.aClass253_40.method6590(local108);
			for (@Pc(116) int local116 = 0; local116 < local108.length; local116++) {
				local108[local116].method6045(this.anInt9983);
			}
			@Pc(136) int local136 = 20;
			if (this.anIntArrayArrayArray17 != null) {
				local136 += 4;
			}
			if ((this.anInt9970 & 0x7) != 0) {
				local136 += 12;
			}
			@Pc(156) NativeHeapBuffer local156 = this.aClass16_Sub1_22.aNativeHeap3.a(this.anInt9983 * 4, false);
			@Pc(166) NativeHeapBuffer local166 = this.aClass16_Sub1_22.aNativeHeap3.a(local136 * this.anInt9983, false);
			@Pc(171) Stream local171 = new Stream(local166);
			@Pc(176) Stream local176 = new Stream(local156);
			@Pc(180) Class8_Sub37[] local180 = new Class8_Sub37[this.anInt9983];
			@Pc(187) int local187 = Static258.method4554(this.anInt9983 / 4);
			if (local187 < 1) {
				local187 = 1;
			}
			@Pc(197) Class253 local197 = new Class253(local187);
			@Pc(201) Class8_Sub37[] local201 = new Class8_Sub37[this.anInt9984];
			@Pc(207) int local207;
			for (@Pc(203) int local203 = 0; super.anInt9955 > local203; local203++) {
				for (local207 = 0; super.anInt9953 > local207; local207++) {
					if (this.anIntArrayArrayArray13[local203][local207] != null) {
						@Pc(223) Class8_Sub37[] local223 = this.aClass8_Sub37ArrayArrayArray1[local203][local207];
						@Pc(230) int[] local230 = this.anIntArrayArrayArray18[local203][local207];
						@Pc(237) int[] local237 = this.anIntArrayArrayArray14[local203][local207];
						@Pc(244) int[] local244 = this.anIntArrayArrayArray15[local203][local207];
						@Pc(251) int[] local251 = this.anIntArrayArrayArray13[local203][local207];
						@Pc(263) int[] local263 = this.anIntArrayArrayArray16 == null ? null : this.anIntArrayArrayArray16[local203][local207];
						@Pc(275) int[] local275 = this.anIntArrayArrayArray17 == null ? null : this.anIntArrayArrayArray17[local203][local207];
						if (local244 == null) {
							local244 = local251;
						}
						@Pc(286) float local286 = this.aFloatArrayArray20[local203][local207];
						@Pc(293) float local293 = this.aFloatArrayArray21[local203][local207];
						@Pc(300) float local300 = this.aFloatArrayArray19[local203][local207];
						@Pc(309) float local309 = this.aFloatArrayArray20[local203][local207 + 1];
						@Pc(318) float local318 = this.aFloatArrayArray21[local203][local207 + 1];
						@Pc(327) float local327 = this.aFloatArrayArray19[local203][local207 + 1];
						@Pc(338) float local338 = this.aFloatArrayArray20[local203 + 1][local207 + 1];
						@Pc(349) float local349 = this.aFloatArrayArray21[local203 + 1][local207 + 1];
						@Pc(360) float local360 = this.aFloatArrayArray19[local203 + 1][local207 + 1];
						@Pc(369) float local369 = this.aFloatArrayArray20[local203 + 1][local207];
						@Pc(378) float local378 = this.aFloatArrayArray21[local203 + 1][local207];
						@Pc(387) float local387 = this.aFloatArrayArray19[local203 + 1][local207];
						@Pc(395) int local395 = local18[local203][local207] & 0xFF;
						@Pc(405) int local405 = local18[local203][local207 + 1] & 0xFF;
						@Pc(417) int local417 = local18[local203 + 1][local207 + 1] & 0xFF;
						@Pc(427) int local427 = local18[local203 + 1][local207] & 0xFF;
						@Pc(429) int local429 = 0;
						@Pc(439) int local439;
						label355: for (@Pc(431) int local431 = 0; local431 < local251.length; local431++) {
							@Pc(437) Class8_Sub37 local437 = local223[local431];
							for (local439 = 0; local439 < local429; local439++) {
								if (local437 == local201[local439]) {
									continue label355;
								}
							}
							local201[local429++] = local437;
						}
						@Pc(484) short[] local484 = this.aShortArrayArray12[local203 + local207 * super.anInt9955] = new short[local251.length];
						for (local439 = 0; local439 < local251.length; local439++) {
							@Pc(497) int local497 = (local203 << super.anInt9954) + local230[local439];
							@Pc(507) int local507 = (local207 << super.anInt9954) + local237[local439];
							@Pc(512) int local512 = local497 >> this.anInt9982;
							@Pc(517) int local517 = local507 >> this.anInt9982;
							@Pc(521) int local521 = local251[local439];
							@Pc(525) int local525 = local244[local439];
							@Pc(533) int local533 = local263 == null ? 0 : local263[local439];
							@Pc(551) long local551 = (long) local517 | (long) local521 << 32 | (long) local525 << 48 | (long) (local512 << 16);
							@Pc(555) int local555 = local230[local439];
							@Pc(559) int local559 = local237[local439];
							@Pc(561) byte local561 = 74;
							@Pc(563) int local563 = 0;
							@Pc(581) float local581;
							@Pc(587) float local587;
							@Pc(579) float local579;
							@Pc(638) float local638;
							@Pc(585) int local585;
							if (local555 == 0 && local559 == 0) {
								local579 = local300;
								local585 = local561 - local395;
								local581 = local286;
								local587 = local293;
							} else if (local555 == 0 && local559 == super.anInt9958) {
								local579 = local327;
								local581 = local309;
								local585 = local561 - local405;
								local587 = local318;
							} else if (super.anInt9958 == local555 && local559 == super.anInt9958) {
								local585 = local561 - local417;
								local581 = local338;
								local587 = local349;
								local579 = local360;
							} else if (local555 == super.anInt9958 && local559 == 0) {
								local585 = local561 - local427;
								local579 = local387;
								local581 = local369;
								local587 = local378;
							} else {
								@Pc(614) float local614 = (float) local555 / (float) super.anInt9958;
								@Pc(621) float local621 = (float) local559 / (float) super.anInt9958;
								@Pc(629) float local629 = local286 + (local369 - local286) * local614;
								local638 = local614 * (local378 - local293) + local293;
								@Pc(647) float local647 = local614 * (local387 - local300) + local300;
								@Pc(655) float local655 = (local338 - local309) * local614 + local309;
								@Pc(663) float local663 = local614 * (local349 - local318) + local318;
								@Pc(672) float local672 = (local360 - local327) * local614 + local327;
								local587 = local638 + (local663 - local638) * local621;
								local581 = local629 + (local655 - local629) * local621;
								local579 = local647 + (local672 - local647) * local621;
								@Pc(709) int local709 = (local555 * (local427 - local395) >> super.anInt9954) + local395;
								@Pc(720) int local720 = (local555 * (local417 - local405) >> super.anInt9954) + local405;
								local585 = local561 - (local559 * (local720 - local709) >> super.anInt9954) - local709;
							}
							@Pc(772) float local772 = 1.0F;
							if (local521 != -1) {
								@Pc(784) int local784 = local585 * (local521 & 0x7F) >> 7;
								if (local784 < 2) {
									local784 = 2;
								} else if (local784 > 126) {
									local784 = 126;
								}
								local563 = Static77.anIntArray92[local521 & 0xFF80 | local784];
								if ((this.anInt9970 & 0x7) == 0) {
									local772 = this.aClass16_Sub1_22.aFloatArray45[2] * local579 + this.aClass16_Sub1_22.aFloatArray45[0] * local581 + this.aClass16_Sub1_22.aFloatArray45[1] * local587;
									local772 = this.aClass16_Sub1_22.aFloat93 + local772 * (local772 > 0.0F ? this.aClass16_Sub1_22.aFloat89 : this.aClass16_Sub1_22.aFloat90);
								}
							}
							@Pc(858) Class8 local858 = null;
							if ((local497 & this.anInt9965 - 1) == 0 && (this.anInt9965 - 1 & local507) == 0) {
								local858 = local197.method6594(local551);
							}
							@Pc(897) int local897;
							@Pc(957) int local957;
							if (local858 == null) {
								if (local521 == local525) {
									local957 = local563;
								} else {
									@Pc(933) int local933 = (local525 & 0x7F) * local585 >> 7;
									if (local933 < 2) {
										local933 = 2;
									} else if (local933 > 126) {
										local933 = 126;
									}
									local957 = Static77.anIntArray92[local933 | local525 & 0xFF80];
									if ((this.anInt9970 & 0x7) == 0) {
										local638 = local579 * this.aClass16_Sub1_22.aFloatArray45[2] + this.aClass16_Sub1_22.aFloatArray45[1] * local587 + this.aClass16_Sub1_22.aFloatArray45[0] * local581;
										local638 = this.aClass16_Sub1_22.aFloat93 + local772 * (local772 > 0.0F ? this.aClass16_Sub1_22.aFloat89 : this.aClass16_Sub1_22.aFloat90);
										@Pc(1010) int local1010 = local957 >> 16 & 0xFF;
										@Pc(1016) int local1016 = local957 >> 8 & 0xFF;
										@Pc(1020) int local1020 = local957 & 0xFF;
										local1010 = (int) ((float) local1010 * local638);
										if (local1010 < 0) {
											local1010 = 0;
										} else if (local1010 > 255) {
											local1010 = 255;
										}
										local1016 = (int) ((float) local1016 * local638);
										if (local1016 < 0) {
											local1016 = 0;
										} else if (local1016 > 255) {
											local1016 = 255;
										}
										local1020 = (int) ((float) local1020 * local638);
										if (local1020 < 0) {
											local1020 = 0;
										} else if (local1020 > 255) {
											local1020 = 255;
										}
										local957 = local1010 << 16 | local1016 << 8 | local1020;
									}
								}
								if (Stream.c()) {
									local171.a((float) local497);
									local171.a((float) (this.method8088(local507, local497) + local533));
									local171.a((float) local507);
									local171.a((float) local497);
									local171.a((float) local507);
									if (this.anIntArrayArrayArray17 != null) {
										local171.a((float) (local275 == null ? 0 : local275[local439] - 1));
									}
									if ((this.anInt9970 & 0x7) != 0) {
										local171.a(local581);
										local171.a(local587);
										local171.a(local579);
									}
								} else {
									local171.b((float) local497);
									local171.b((float) (this.method8088(local507, local497) + local533));
									local171.b((float) local507);
									local171.b((float) local497);
									local171.b((float) local507);
									if (this.anIntArrayArrayArray17 != null) {
										local171.b((float) (local275 == null ? 0 : local275[local439] - 1));
									}
									if ((this.anInt9970 & 0x7) != 0) {
										local171.b(local581);
										local171.b(local587);
										local171.b(local579);
									}
								}
								if (this.aClass16_Sub1_22.anInt4898 == 0) {
									local176.d(local957 | 0xFF000000);
								} else {
									local176.e(local957 | 0xFF000000);
								}
								local897 = this.anInt9978++;
								local484[local439] = (short) local897;
								if (local521 != -1) {
									local180[local897] = local223[local439];
								}
								local197.method6591(new Class8_Sub38(local484[local439]), local551);
							} else {
								local484[local439] = ((Class8_Sub38) local858).aShort79;
								local897 = local484[local439] & 0xFFFF;
								if (local521 != -1 && local223[local439].aLong285 < local180[local897].aLong285) {
									local180[local897] = local223[local439];
								}
							}
							for (local957 = 0; local957 < local429; local957++) {
								local201[local957].method6050(local585, local772, local897, local563);
							}
							this.anInt9968++;
						}
					}
				}
			}
			for (local207 = 0; local207 < this.anInt9978; local207++) {
				@Pc(1317) Class8_Sub37 local1317 = local180[local207];
				if (local1317 != null) {
					local1317.method6049(local207);
				}
			}
			@Pc(1338) int local1338;
			@Pc(1356) int local1356;
			for (@Pc(1334) int local1334 = 0; super.anInt9955 > local1334; local1334++) {
				for (local1338 = 0; local1338 < super.anInt9953; local1338++) {
					@Pc(1350) short[] local1350 = this.aShortArrayArray12[local1334 + local1338 * super.anInt9955];
					if (local1350 != null) {
						@Pc(1354) int local1354 = 0;
						local1356 = 0;
						while (local1356 < local1350.length) {
							@Pc(1365) int local1365 = local1350[local1356++] & 0xFFFF;
							@Pc(1372) int local1372 = local1350[local1356++] & 0xFFFF;
							@Pc(1379) int local1379 = local1350[local1356++] & 0xFFFF;
							@Pc(1383) Class8_Sub37 local1383 = local180[local1365];
							@Pc(1387) Class8_Sub37 local1387 = local180[local1372];
							@Pc(1391) Class8_Sub37 local1391 = local180[local1379];
							@Pc(1393) Class8_Sub37 local1393 = null;
							if (local1383 != null) {
								local1383.method6044(local1334, local1354, local1338);
								local1393 = local1383;
							}
							if (local1387 != null) {
								local1387.method6044(local1334, local1354, local1338);
								if (local1393 == null || local1387.aLong285 < local1393.aLong285) {
									local1393 = local1387;
								}
							}
							if (local1391 != null) {
								local1391.method6044(local1334, local1354, local1338);
								if (local1393 == null || local1391.aLong285 < local1393.aLong285) {
									local1393 = local1391;
								}
							}
							if (local1393 != null) {
								if (local1383 != null) {
									local1393.method6049(local1365);
								}
								if (local1387 != null) {
									local1393.method6049(local1372);
								}
								if (local1391 != null) {
									local1393.method6049(local1379);
								}
								local1393.method6044(local1334, local1354, local1338);
							}
							local1354++;
						}
					}
				}
			}
			local171.b();
			local176.b();
			this.anInterface4_18 = this.aClass16_Sub1_22.method3988(false);
			this.anInterface4_18.method6504(local156, 4, this.anInt9978 * 4);
			this.anInterface4_17 = this.aClass16_Sub1_22.method3988(false);
			this.anInterface4_17.method6504(local166, local136, local136 * this.anInt9978);
			if ((this.anInt9970 & 0x7) == 0) {
				if (this.anIntArrayArrayArray17 == null) {
					this.aClass94_23 = this.aClass16_Sub1_22.method3994(new Class325[] { new Class325(new Class349[] { Static589.aClass349_1, Static589.aClass349_5 }), new Class325(Static589.aClass349_3) });
				} else {
					this.aClass94_23 = this.aClass16_Sub1_22.method3994(new Class325[] { new Class325(new Class349[] { Static589.aClass349_1, Static589.aClass349_5, Static589.aClass349_4 }), new Class325(Static589.aClass349_3) });
				}
			} else if (this.anIntArrayArrayArray17 == null) {
				this.aClass94_23 = this.aClass16_Sub1_22.method3994(new Class325[] { new Class325(new Class349[] { Static589.aClass349_1, Static589.aClass349_5, Static589.aClass349_2 }), new Class325(Static589.aClass349_3) });
			} else {
				this.aClass94_23 = this.aClass16_Sub1_22.method3994(new Class325[] { new Class325(new Class349[] { Static589.aClass349_1, Static589.aClass349_5, Static589.aClass349_4, Static589.aClass349_2 }), new Class325(Static589.aClass349_3) });
			}
			local1338 = 0;
			for (@Pc(1696) int local1696 = 0; local1696 < local108.length; local1696++) {
				if (local108[local1696].anInt7411 > 0) {
					local108[local1338++] = local108[local1696];
				}
			}
			this.aClass8_Sub37Array1 = new Class8_Sub37[local1338];
			@Pc(1722) long[] local1722 = new long[local1338];
			for (local1356 = 0; local1356 < local1338; local1356++) {
				@Pc(1730) Class8_Sub37 local1730 = local108[local1356];
				local1722[local1356] = local1730.aLong285;
				this.aClass8_Sub37Array1[local1356] = local1730;
				local1730.method6046(this.anInt9978);
			}
			Static213.method4050(this.aClass8_Sub37Array1, local1722);
			if (this.aClass231_2 != null) {
				this.aClass231_2.method6039();
			}
		} else {
			this.aClass231_2 = null;
		}
		this.aByteArrayArray160 = null;
		this.anIntArrayArrayArray13 = null;
		this.anIntArrayArrayArray15 = null;
		this.aClass8_Sub37ArrayArrayArray1 = null;
		this.anIntArrayArrayArray18 = this.anIntArrayArrayArray14 = null;
		this.aFloatArrayArray20 = this.aFloatArrayArray21 = this.aFloatArrayArray19 = null;
		this.anIntArrayArrayArray16 = null;
		this.aClass253_40 = null;
		this.anIntArrayArrayArray17 = null;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method8085(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method8092(arg2, arg5, arg0, arg4, arg6, arg1, arg3);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method8084(@OriginalArg(0) Class8_Sub5_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass231_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(24) int local24 = arg1 - (this.aClass16_Sub1_22.anInt4928 * arg2 >> 8) >> this.aClass16_Sub1_22.anInt4909;
			@Pc(39) int local39 = arg3 - (this.aClass16_Sub1_22.anInt4902 * arg2 >> 8) >> this.aClass16_Sub1_22.anInt4909;
			return this.aClass231_2.method6036(local24, arg0, local39);
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method8079(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt9983 <= 0) {
			return;
		}
		@Pc(16) Interface13 local16 = this.aClass16_Sub1_22.method3970(this.anInt9968);
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = 32767;
		@Pc(22) int local22 = -32768;
		for (@Pc(24) int local24 = 0; local24 < 4; local24++) {
			local18 = 0;
			@Pc(33) Buffer local33 = local16.method4654();
			if (local33 != null) {
				@Pc(41) Stream local41 = this.aClass16_Sub1_22.method3981(local33);
				@Pc(45) int local45;
				@Pc(54) int local54;
				@Pc(56) int local56;
				@Pc(75) short[] local75;
				@Pc(79) int local79;
				@Pc(87) int local87;
				if (Stream.c()) {
					for (local45 = arg1; local45 < arg3; local45++) {
						local54 = arg0 + super.anInt9955 * local45;
						for (local56 = arg0; local56 < arg2; local56++) {
							if (arg4[local56 - arg0][local45 - arg1]) {
								local75 = this.aShortArrayArray12[local54];
								if (local75 != null) {
									for (local79 = 0; local79 < local75.length; local79++) {
										local87 = local75[local79] & 0xFFFF;
										if (local87 < local20) {
											local20 = local87;
										}
										local41.f(local87);
										if (local22 < local87) {
											local22 = local87;
										}
										local18++;
									}
								}
							}
							local54++;
						}
					}
				} else {
					for (local45 = arg1; local45 < arg3; local45++) {
						local54 = arg0 + super.anInt9955 * local45;
						for (local56 = arg0; local56 < arg2; local56++) {
							if (arg4[local56 - arg0][local45 - arg1]) {
								local75 = this.aShortArrayArray12[local54];
								if (local75 != null) {
									for (local79 = 0; local79 < local75.length; local79++) {
										local87 = local75[local79] & 0xFFFF;
										local41.c(local87);
										local18++;
										if (local20 > local87) {
											local20 = local87;
										}
										if (local87 > local22) {
											local22 = local87;
										}
									}
								}
							}
							local54++;
						}
					}
				}
				local41.b();
				if (local16.method4655()) {
					break;
				}
			}
		}
		if (local18 <= 0) {
			return;
		}
		this.aClass16_Sub1_22.method3972();
		this.aClass16_Sub1_22.method3903(false);
		this.aClass16_Sub1_22.method3966(false);
		this.aClass16_Sub1_22.method3933(false);
		this.aClass16_Sub1_22.method3916(false);
		this.aClass16_Sub1_22.method3956(0);
		this.aClass16_Sub1_22.method3957(false, false, -2);
		this.aClass16_Sub1_22.method3889(null);
		@Pc(266) Class54_Sub3 local266 = this.aClass16_Sub1_22.method3945();
		@Pc(271) float[] local271 = this.aClass16_Sub1_22.method3989();
		local271[3] = 0.0F;
		local271[15] = 1.0F;
		local271[8] = 0.0F;
		local271[12] = -1.0F - ((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass16_Sub1_22.anInt4765;
		local271[7] = 0.0F;
		local271[0] = (float) 1024 / ((float) super.anInt9958 * 128.0F * (float) this.aClass16_Sub1_22.anInt4765);
		local271[2] = 0.0F;
		local271[11] = 0.0F;
		local271[10] = 1.0F / (this.aFloat191 - this.aFloat192);
		local271[4] = 0.0F;
		local271[9] = 0.0F;
		local271[14] = -this.aFloat192 / (this.aFloat191 - this.aFloat192);
		local271[5] = (float) 1024 / ((float) super.anInt9958 * 128.0F * (float) this.aClass16_Sub1_22.anInt4732);
		local271[1] = 0.0F;
		local271[6] = 0.0F;
		local271[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass16_Sub1_22.anInt4732;
		local266.method5168(0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F);
		this.aClass16_Sub1_22.method3888();
		this.aClass16_Sub1_22.method3986();
		if ((this.anInt9970 & 0x7) == 0) {
			this.aClass16_Sub1_22.method3966(false);
		} else {
			this.aClass16_Sub1_22.method3966(true);
			this.aClass16_Sub1_22.method3999();
		}
		this.aClass16_Sub1_22.method3919(false);
		this.aClass16_Sub1_22.method3983(this.anInterface4_17, 0);
		this.aClass16_Sub1_22.method3983(this.anInterface4_18, 1);
		this.aClass16_Sub1_22.method3967(this.aClass94_23);
		this.aClass16_Sub1_22.method3977(Static525.aClass342_3, local16, local20, local18 / 3, 0, local22 + 1 - local20);
		this.aClass16_Sub1_22.method3919(true);
	}
}
