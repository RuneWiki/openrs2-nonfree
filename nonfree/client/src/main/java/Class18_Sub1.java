import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class Class18_Sub1 extends Class18 {

	@OriginalMember(owner = "client!al", name = "K", descriptor = "I")
	private int anInt427;

	@OriginalMember(owner = "client!al", name = "P", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!al", name = "T", descriptor = "I")
	private int anInt430;

	@OriginalMember(owner = "client!al", name = "X", descriptor = "Lclient!pc;")
	public Class274 aClass274_1;

	@OriginalMember(owner = "client!al", name = "Y", descriptor = "Lclient!pc;")
	public Class274 aClass274_2;

	@OriginalMember(owner = "client!al", name = "ab", descriptor = "[Lclient!dia;")
	private Class2_Sub21[] aClass2_Sub21Array1;

	@OriginalMember(owner = "client!al", name = "bb", descriptor = "I")
	private int anInt432;

	@OriginalMember(owner = "client!al", name = "cb", descriptor = "Lclient!cq;")
	private Interface2 anInterface2_1;

	@OriginalMember(owner = "client!al", name = "db", descriptor = "Lclient!pc;")
	private Class274 aClass274_3;

	@OriginalMember(owner = "client!al", name = "fb", descriptor = "Lclient!pc;")
	public Class274 aClass274_4;

	@OriginalMember(owner = "client!al", name = "gb", descriptor = "I")
	private int anInt433;

	@OriginalMember(owner = "client!al", name = "L", descriptor = "Lclient!ow;")
	private final Class271 aClass271_3 = new Class271();

	@OriginalMember(owner = "client!al", name = "o", descriptor = "I")
	private final int anInt410 = this.anInt9740 - 2;

	@OriginalMember(owner = "client!al", name = "l", descriptor = "Lclient!lea;")
	public final Class101_Sub2 aClass101_Sub2_1;

	@OriginalMember(owner = "client!al", name = "eb", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!al", name = "V", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!al", name = "ib", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!al", name = "t", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!al", name = "hb", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!al", name = "x", descriptor = "I")
	private final int anInt415;

	@OriginalMember(owner = "client!al", name = "N", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!al", name = "m", descriptor = "[[S")
	public final short[][] aShortArrayArray1;

	@OriginalMember(owner = "client!al", name = "p", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!al", name = "S", descriptor = "[[B")
	private final byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!al", name = "q", descriptor = "[[[Lclient!dia;")
	private Class2_Sub21[][][] aClass2_Sub21ArrayArrayArray1;

	@OriginalMember(owner = "client!al", name = "O", descriptor = "I")
	public final int anInt428;

	@OriginalMember(owner = "client!al", name = "Q", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!al", name = "Z", descriptor = "[[B")
	private byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!al", name = "W", descriptor = "Lclient!si;")
	private Class335 aClass335_3;

	@OriginalMember(owner = "client!al", name = "s", descriptor = "Lclient!pga;")
	private Class281 aClass281_1;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lclient!lea;IIII[[I[[II)V")
	public Class18_Sub1(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass101_Sub2_1 = arg0;
		this.aFloatArrayArray3 = new float[super.anInt9741 + 1][super.anInt9742 + 1];
		this.anIntArrayArrayArray7 = new int[arg3][arg4][];
		this.aFloatArrayArray5 = new float[super.anInt9741 + 1][super.anInt9742 + 1];
		this.anIntArrayArrayArray3 = new int[arg3][arg4][];
		this.aFloatArrayArray4 = new float[super.anInt9741 + 1][super.anInt9742 + 1];
		this.anInt415 = 0x1 << this.anInt410;
		this.anIntArrayArrayArray4 = new int[arg3][arg4][];
		this.aShortArrayArray1 = new short[arg4 * arg3][];
		this.anIntArrayArrayArray2 = new int[arg3][arg4][];
		this.aByteArrayArray1 = new byte[arg3][arg4];
		this.aClass2_Sub21ArrayArrayArray1 = new Class2_Sub21[arg3][arg4][];
		this.anInt428 = arg2;
		this.anIntArrayArrayArray6 = new int[arg3][arg4][];
		this.aByteArrayArray2 = new byte[arg3 + 1][arg4 + 1];
		for (@Pc(115) int local115 = 1; local115 < super.anInt9742; local115++) {
			for (@Pc(119) int local119 = 1; super.anInt9741 > local119; local119++) {
				@Pc(138) int local138 = arg6[local119 + 1][local115] - arg6[local119 - 1][local115];
				@Pc(154) int local154 = arg6[local119][local115 + 1] - arg6[local119][local115 - 1];
				@Pc(173) float local173 = (float) (1.0D / Math.sqrt((double) (local154 * local154 + arg7 * 4 * arg7 + local138 * local138)));
				this.aFloatArrayArray5[local119][local115] = local173 * (float) local138;
				this.aFloatArrayArray4[local119][local115] = (float) (-arg7 * 2) * local173;
				this.aFloatArrayArray3[local119][local115] = local173 * (float) local154;
			}
		}
		this.aClass335_3 = new Class335(128);
		if ((this.anInt428 & 0x10) != 0) {
			this.aClass281_1 = new Class281(this.aClass101_Sub2_1, this);
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ZIIIIII[[Z)V")
	private void method430(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean[][] arg6) {
		if (this.aClass2_Sub21Array1 == null) {
			return;
		}
		@Pc(22) int local22 = arg3 + arg3 + 1;
		@Pc(26) int local26 = local22 * local22;
		if (this.aClass101_Sub2_1.anIntArray306.length < local26) {
			this.aClass101_Sub2_1.anIntArray306 = new int[local26];
		}
		if (this.aClass101_Sub2_1.aClass2_Sub8_Sub1_2.lb.length < this.anInt430 * 2) {
			this.aClass101_Sub2_1.aClass2_Sub8_Sub1_2 = new Class2_Sub8_Sub1(this.anInt430 * 2);
		}
		@Pc(66) int local66 = arg1 - arg3;
		@Pc(68) int local68 = local66;
		if (local66 < 0) {
			local66 = 0;
		}
		@Pc(77) int local77 = arg2 - arg3;
		@Pc(79) int local79 = local77;
		if (local77 < 0) {
			local77 = 0;
		}
		@Pc(91) int local91 = arg1 + arg3;
		if (local91 > super.anInt9741 - 1) {
			local91 = super.anInt9741 - 1;
		}
		@Pc(107) int local107 = arg2 + arg3;
		if (super.anInt9742 - 1 < local107) {
			local107 = super.anInt9742 - 1;
		}
		@Pc(120) int local120 = 0;
		@Pc(124) int[] local124 = this.aClass101_Sub2_1.anIntArray306;
		@Pc(137) int local137;
		for (@Pc(126) int local126 = local66; local126 <= local91; local126++) {
			@Pc(135) boolean[] local135 = arg6[local126 - local68];
			for (local137 = local77; local137 <= local107; local137++) {
				if (local135[local137 - local79]) {
					local124[local120++] = local126 + super.anInt9741 * local137;
				}
			}
		}
		if (arg4 == -1) {
			this.aClass101_Sub2_1.method5620();
		} else {
			this.aClass101_Sub2_1.method5625((float) arg4);
			this.aClass101_Sub2_1.method5666();
		}
		this.aClass101_Sub2_1.method5691((this.anInt428 & 0x7) != 0);
		for (@Pc(204) int local204 = 0; local204 < this.aClass2_Sub21Array1.length; local204++) {
			this.aClass2_Sub21Array1[local204].method1877(local124, local120);
		}
		if (!this.aClass271_3.method7169()) {
			local137 = this.aClass101_Sub2_1.anInt6352;
			@Pc(233) int local233 = this.aClass101_Sub2_1.anInt6350;
			this.aClass101_Sub2_1.L(0, local233, this.aClass101_Sub2_1.anInt6328);
			this.aClass101_Sub2_1.method5691(false);
			this.aClass101_Sub2_1.method5683(false);
			this.aClass101_Sub2_1.method5614(128);
			this.aClass101_Sub2_1.method5670(-2);
			this.aClass101_Sub2_1.method5690(this.aClass101_Sub2_1.aClass50_Sub4_1);
			this.aClass101_Sub2_1.method5665(8448, 7681);
			this.aClass101_Sub2_1.method5657(770, 0, 34166);
			this.aClass101_Sub2_1.method5680(0, 34167);
			for (@Pc(293) Class2 local293 = this.aClass271_3.method7177(); local293 != null; local293 = this.aClass271_3.method7175()) {
				@Pc(298) Class2_Sub24 local298 = (Class2_Sub24) local293;
				local298.method2387(arg2, arg1, arg3, arg6);
			}
			this.aClass101_Sub2_1.method5657(768, 0, 5890);
			this.aClass101_Sub2_1.method5680(0, 5890);
			this.aClass101_Sub2_1.method5690((Class50) null);
			this.aClass101_Sub2_1.L(local137, local233, this.aClass101_Sub2_1.anInt6328);
		}
		if (this.aClass281_1 == null) {
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		this.aClass101_Sub2_1.method5650((Class274) null, this.aClass274_4, (Class274) null, this.aClass274_2);
		this.aClass281_1.method7355(arg1, arg2, arg6, arg0, arg3);
		OpenGL.glPopMatrix();
		return;
	}

	@OriginalMember(owner = "client!al", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class2_Sub1_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass281_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass101_Sub2_1.anInt6341 >> 8) >> this.aClass101_Sub2_1.anInt6315;
			@Pc(39) int local39 = arg3 - (this.aClass101_Sub2_1.anInt6337 * arg2 >> 8) >> this.aClass101_Sub2_1.anInt6315;
			this.aClass281_1.method7354(local39, local24, arg0);
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method8540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Lclient!mfa;[I)V")
	@Override
	public void method8543(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass271_3.method7174(new Class2_Sub24(this.aClass101_Sub2_1, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!al", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class2_Sub1_Sub11 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub1_Sub11 arg2) {
		if ((this.aByteArrayArray1[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(21) int local21 = super.anInt9739 >> this.aClass101_Sub2_1.anInt6315;
		@Pc(24) Class2_Sub1_Sub11_Sub1 local24 = (Class2_Sub1_Sub11_Sub1) arg2;
		@Pc(34) Class2_Sub1_Sub11_Sub1 local34;
		if (local24 != null && local24.method5411(local21, local21)) {
			local34 = local24;
			local24.method5409();
		} else {
			local34 = new Class2_Sub1_Sub11_Sub1(this.aClass101_Sub2_1, local21, local21);
		}
		local34.method5407(local21, local21, 0, 0);
		this.method435(arg1, arg0, local34);
		return local34;
	}

	@OriginalMember(owner = "client!al", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray2[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray2[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method8538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method430(arg4, arg0, arg1, arg2, -1, arg5, arg3);
	}

	@OriginalMember(owner = "client!al", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg3 != null && this.anIntArrayArrayArray2 == null) {
			this.anIntArrayArrayArray2 = new int[super.anInt9741][super.anInt9742][];
		}
		@Pc(21) Interface3 local21 = this.aClass101_Sub2_1.anInterface3_12;
		if (arg5 != null && this.anIntArrayArrayArray5 == null) {
			this.anIntArrayArrayArray5 = new int[super.anInt9741][super.anInt9742][];
		}
		this.anIntArrayArrayArray7[arg0][arg1] = arg2;
		this.anIntArrayArrayArray3[arg0][arg1] = arg4;
		this.anIntArrayArrayArray4[arg0][arg1] = arg6;
		this.anIntArrayArrayArray6[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray5 != null) {
			this.anIntArrayArrayArray5[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray2 != null) {
			this.anIntArrayArrayArray2[arg0][arg1] = arg3;
		}
		@Pc(92) Class2_Sub21[] local92 = this.aClass2_Sub21ArrayArrayArray1[arg0][arg1] = new Class2_Sub21[arg6.length];
		for (@Pc(94) int local94 = 0; local94 < arg6.length; local94++) {
			@Pc(100) int local100 = arg8[local94];
			@Pc(104) int local104 = arg9[local94];
			if ((this.anInt428 & 0x20) != 0 && local100 != -1 && local21.method1941(local100).aBoolean329) {
				local100 = -1;
				local104 = 128;
			}
			@Pc(149) long local149 = (long) local100 | (long) (local104 << 14) | (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48;
			@Pc(155) Class2 local155;
			for (local155 = this.aClass335_3.method8357(local149); local155 != null; local155 = this.aClass335_3.method8352()) {
				@Pc(160) Class2_Sub21 local160 = (Class2_Sub21) local155;
				if (local100 == local160.anInt1913 && local160.aFloat29 == (float) local104 && local160.anInt1917 == arg10 && arg11 == local160.anInt1909 && arg12 == local160.anInt1912) {
					break;
				}
			}
			if (local155 == null) {
				local92[local94] = new Class2_Sub21(this, local100, local104, arg10, arg11, arg12);
				this.aClass335_3.method8356(local92[local94], local149);
			} else {
				local92[local94] = (Class2_Sub21) local155;
			}
		}
		if (arg13) {
			this.aByteArrayArray1[arg0][arg1] = (byte) (this.aByteArrayArray1[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt433) {
			this.anInt433 = arg6.length;
		}
		this.anInt432 += arg6.length;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(II)V")
	@Override
	public void method8533(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!al", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.anInt432 > 0) {
			@Pc(17) byte[][] local17 = new byte[super.anInt9741 + 1][super.anInt9742 + 1];
			@Pc(23) int local23;
			for (@Pc(19) int local19 = 1; local19 < super.anInt9741; local19++) {
				for (local23 = 1; local23 < super.anInt9742; local23++) {
					local17[local19][local23] = (byte) ((this.aByteArrayArray2[local19][local23] >> 1) + (this.aByteArrayArray2[local19 - 1][local23] >> 2) + (this.aByteArrayArray2[local19 + 1][local23] >> 3) + (this.aByteArrayArray2[local19][local23 + -1] >> 2) + (this.aByteArrayArray2[local19][local23 + 1] >> 3));
				}
			}
			this.aClass2_Sub21Array1 = new Class2_Sub21[this.aClass335_3.method8361()];
			this.aClass335_3.method8360(this.aClass2_Sub21Array1);
			for (local23 = 0; local23 < this.aClass2_Sub21Array1.length; local23++) {
				this.aClass2_Sub21Array1[local23].method1881(this.anInt432);
			}
			@Pc(131) int local131 = 24;
			if (this.anIntArrayArrayArray5 != null) {
				local131 += 4;
			}
			if ((this.anInt428 & 0x7) != 0) {
				local131 += 12;
			}
			@Pc(151) NativeHeapBuffer local151 = this.aClass101_Sub2_1.aNativeHeap5.a(this.anInt432 * local131, false);
			@Pc(156) Stream local156 = new Stream(local151);
			@Pc(160) Class2_Sub21[] local160 = new Class2_Sub21[this.anInt432];
			@Pc(167) int local167 = Static427.method7013(this.anInt432 / 4);
			if (local167 < 1) {
				local167 = 1;
			}
			@Pc(177) Class335 local177 = new Class335(local167);
			@Pc(181) Class2_Sub21[] local181 = new Class2_Sub21[this.anInt433];
			@Pc(187) int local187;
			for (@Pc(183) int local183 = 0; super.anInt9741 > local183; local183++) {
				for (local187 = 0; local187 < super.anInt9742; local187++) {
					if (this.anIntArrayArrayArray4[local183][local187] != null) {
						@Pc(203) Class2_Sub21[] local203 = this.aClass2_Sub21ArrayArrayArray1[local183][local187];
						@Pc(210) int[] local210 = this.anIntArrayArrayArray7[local183][local187];
						@Pc(217) int[] local217 = this.anIntArrayArrayArray3[local183][local187];
						@Pc(224) int[] local224 = this.anIntArrayArrayArray6[local183][local187];
						@Pc(231) int[] local231 = this.anIntArrayArrayArray4[local183][local187];
						@Pc(243) int[] local243 = this.anIntArrayArrayArray2 == null ? null : this.anIntArrayArrayArray2[local183][local187];
						@Pc(255) int[] local255 = this.anIntArrayArrayArray5 == null ? null : this.anIntArrayArrayArray5[local183][local187];
						if (local224 == null) {
							local224 = local231;
						}
						@Pc(266) float local266 = this.aFloatArrayArray5[local183][local187];
						@Pc(273) float local273 = this.aFloatArrayArray4[local183][local187];
						@Pc(280) float local280 = this.aFloatArrayArray3[local183][local187];
						@Pc(289) float local289 = this.aFloatArrayArray5[local183][local187 + 1];
						@Pc(298) float local298 = this.aFloatArrayArray4[local183][local187 + 1];
						@Pc(307) float local307 = this.aFloatArrayArray3[local183][local187 + 1];
						@Pc(318) float local318 = this.aFloatArrayArray5[local183 + 1][local187 + 1];
						@Pc(329) float local329 = this.aFloatArrayArray4[local183 + 1][local187 + 1];
						@Pc(340) float local340 = this.aFloatArrayArray3[local183 + 1][local187 + 1];
						@Pc(349) float local349 = this.aFloatArrayArray5[local183 + 1][local187];
						@Pc(358) float local358 = this.aFloatArrayArray4[local183 + 1][local187];
						@Pc(367) float local367 = this.aFloatArrayArray3[local183 + 1][local187];
						@Pc(375) int local375 = local17[local183][local187] & 0xFF;
						@Pc(385) int local385 = local17[local183][local187 + 1] & 0xFF;
						@Pc(397) int local397 = local17[local183 + 1][local187 + 1] & 0xFF;
						@Pc(407) int local407 = local17[local183 + 1][local187] & 0xFF;
						@Pc(409) int local409 = 0;
						@Pc(419) int local419;
						label337: for (@Pc(411) int local411 = 0; local411 < local231.length; local411++) {
							@Pc(417) Class2_Sub21 local417 = local203[local411];
							for (local419 = 0; local419 < local409; local419++) {
								if (local417 == local181[local419]) {
									continue label337;
								}
							}
							local181[local409++] = local417;
						}
						@Pc(460) short[] local460 = this.aShortArrayArray1[local183 + super.anInt9741 * local187] = new short[local231.length];
						for (local419 = 0; local419 < local231.length; local419++) {
							@Pc(474) int local474 = (local183 << super.anInt9740) + local210[local419];
							@Pc(484) int local484 = (local187 << super.anInt9740) + local217[local419];
							@Pc(489) int local489 = local474 >> this.anInt410;
							@Pc(494) int local494 = local484 >> this.anInt410;
							@Pc(498) int local498 = local231[local419];
							@Pc(502) int local502 = local224[local419];
							@Pc(510) int local510 = local243 == null ? 0 : local243[local419];
							@Pc(528) long local528 = (long) local494 | (long) local498 << 32 | (long) local502 << 48 | (long) (local489 << 16);
							@Pc(532) int local532 = local210[local419];
							@Pc(536) int local536 = local217[local419];
							@Pc(538) byte local538 = 74;
							@Pc(540) int local540 = 0;
							@Pc(548) float local548;
							@Pc(546) float local546;
							@Pc(554) float local554;
							@Pc(633) float local633;
							@Pc(552) int local552;
							if (local532 == 0 && local536 == 0) {
								local546 = local273;
								local548 = local266;
								local552 = local538 - local375;
								local554 = local280;
							} else if (local532 == 0 && super.anInt9739 == local536) {
								local554 = local307;
								local548 = local289;
								local552 = local538 - local385;
								local546 = local298;
							} else if (local532 == super.anInt9739 && super.anInt9739 == local536) {
								local546 = local329;
								local554 = local340;
								local548 = local318;
								local552 = local538 - local397;
							} else if (local532 == super.anInt9739 && local536 == 0) {
								local552 = local538 - local407;
								local548 = local349;
								local546 = local358;
								local554 = local367;
							} else {
								@Pc(609) float local609 = (float) local532 / (float) super.anInt9739;
								@Pc(616) float local616 = (float) local536 / (float) super.anInt9739;
								@Pc(625) float local625 = local609 * (local349 - local266) + local266;
								local633 = local609 * (local358 - local273) + local273;
								@Pc(641) float local641 = local280 + (local367 - local280) * local609;
								@Pc(650) float local650 = local289 + local609 * (local318 - local289);
								@Pc(658) float local658 = local298 + local609 * (local329 - local298);
								@Pc(667) float local667 = (local340 - local307) * local609 + local307;
								local548 = local625 + local616 * (local650 - local625);
								local546 = local633 + (local658 - local633) * local616;
								local554 = local616 * (local667 - local641) + local641;
								@Pc(704) int local704 = local375 + ((local407 - local375) * local532 >> super.anInt9740);
								@Pc(716) int local716 = ((local397 - local385) * local532 >> super.anInt9740) + local385;
								local552 = local538 - (local536 * (local716 - local704) >> super.anInt9740) - local704;
							}
							@Pc(756) float local756 = 1.0F;
							if (local498 != -1) {
								@Pc(767) int local767 = local552 * (local498 & 0x7F) >> 7;
								if (local767 < 2) {
									local767 = 2;
								} else if (local767 > 126) {
									local767 = 126;
								}
								if ((this.anInt428 & 0x7) == 0) {
									local756 = local554 * this.aClass101_Sub2_1.aFloatArray38[2] + this.aClass101_Sub2_1.aFloatArray38[0] * local548 + local546 * this.aClass101_Sub2_1.aFloatArray38[1];
									local756 = this.aClass101_Sub2_1.aFloat133 + local756 * (local756 > 0.0F ? this.aClass101_Sub2_1.aFloat122 : this.aClass101_Sub2_1.aFloat137);
								}
								local540 = Static101.anIntArray92[local767 | local498 & 0xFF80];
							}
							@Pc(841) Class2 local841 = null;
							if ((local474 & this.anInt415 - 1) == 0 && (local484 & this.anInt415 - 1) == 0) {
								local841 = local177.method8357(local528);
							}
							@Pc(1199) int local1199;
							@Pc(902) int local902;
							if (local841 == null) {
								if (local502 == local498) {
									local902 = local540;
								} else {
									@Pc(880) int local880 = local552 * (local502 & 0x7F) >> 7;
									if (local880 < 2) {
										local880 = 2;
									} else if (local880 > 126) {
										local880 = 126;
									}
									local902 = Static101.anIntArray92[local880 | local502 & 0xFF80];
									if ((this.anInt428 & 0x7) == 0) {
										local633 = this.aClass101_Sub2_1.aFloatArray38[1] * local546 + local548 * this.aClass101_Sub2_1.aFloatArray38[0] + local554 * this.aClass101_Sub2_1.aFloatArray38[2];
										local633 = local756 * (local756 > 0.0F ? this.aClass101_Sub2_1.aFloat122 : this.aClass101_Sub2_1.aFloat137) + this.aClass101_Sub2_1.aFloat133;
										@Pc(955) int local955 = local902 >> 16 & 0xFF;
										@Pc(961) int local961 = local902 >> 8 & 0xFF;
										local955 = (int) ((float) local955 * local633);
										@Pc(971) int local971 = local902 & 0xFF;
										local961 = (int) ((float) local961 * local633);
										if (local955 < 0) {
											local955 = 0;
										} else if (local955 > 255) {
											local955 = 255;
										}
										if (local961 < 0) {
											local961 = 0;
										} else if (local961 > 255) {
											local961 = 255;
										}
										local971 = (int) ((float) local971 * local633);
										if (local971 < 0) {
											local971 = 0;
										} else if (local971 > 255) {
											local971 = 255;
										}
										local902 = local971 | local961 << 8 | local955 << 16;
									}
								}
								if (this.aClass101_Sub2_1.aBoolean470) {
									local156.a((float) local474);
									local156.a((float) (local510 + this.method8542(local484, local474)));
									local156.a((float) local484);
									local156.b((byte) (local902 >> 16));
									local156.b((byte) (local902 >> 8));
									local156.b((byte) local902);
									local156.b(-1);
									local156.a((float) local474);
									local156.a((float) local484);
									if (this.anIntArrayArrayArray5 != null) {
										local156.a((float) (local255 == null ? 0 : local255[local419] - 1));
									}
									if ((this.anInt428 & 0x7) != 0) {
										local156.a(local548);
										local156.a(local546);
										local156.a(local554);
									}
								} else {
									local156.b((float) local474);
									local156.b((float) (local510 + this.method8542(local484, local474)));
									local156.b((float) local484);
									local156.b((byte) (local902 >> 16));
									local156.b((byte) (local902 >> 8));
									local156.b((byte) local902);
									local156.b(-1);
									local156.b((float) local474);
									local156.b((float) local484);
									if (this.anIntArrayArrayArray5 != null) {
										local156.b((float) (local255 == null ? 0 : local255[local419] - 1));
									}
									if ((this.anInt428 & 0x7) != 0) {
										local156.b(local548);
										local156.b(local546);
										local156.b(local554);
									}
								}
								local1199 = this.anInt427++;
								local460[local419] = (short) local1199;
								if (local498 != -1) {
									local160[local1199] = local203[local419];
								}
								local177.method8356(new Class2_Sub32(local460[local419]), local528);
							} else {
								local460[local419] = ((Class2_Sub32) local841).aShort54;
								local1199 = local460[local419] & 0xFFFF;
								if (local498 != -1 && local203[local419].aLong313 < local160[local1199].aLong313) {
									local160[local1199] = local203[local419];
								}
							}
							for (local902 = 0; local902 < local409; local902++) {
								local181[local902].method1874(local552, local540, local756, local1199);
							}
							this.anInt430++;
						}
					}
				}
			}
			for (local187 = 0; local187 < this.anInt427; local187++) {
				@Pc(1319) Class2_Sub21 local1319 = local160[local187];
				if (local1319 != null) {
					local1319.method1878(local187);
				}
			}
			@Pc(1352) int local1352;
			for (@Pc(1332) int local1332 = 0; super.anInt9741 > local1332; local1332++) {
				for (@Pc(1336) int local1336 = 0; local1336 < super.anInt9742; local1336++) {
					@Pc(1348) short[] local1348 = this.aShortArrayArray1[local1332 + super.anInt9741 * local1336];
					if (local1348 != null) {
						local1352 = 0;
						@Pc(1354) int local1354 = 0;
						while (local1348.length > local1354) {
							@Pc(1363) int local1363 = local1348[local1354++] & 0xFFFF;
							@Pc(1370) int local1370 = local1348[local1354++] & 0xFFFF;
							@Pc(1377) int local1377 = local1348[local1354++] & 0xFFFF;
							@Pc(1381) Class2_Sub21 local1381 = local160[local1363];
							@Pc(1385) Class2_Sub21 local1385 = local160[local1370];
							@Pc(1389) Class2_Sub21 local1389 = local160[local1377];
							@Pc(1391) Class2_Sub21 local1391 = null;
							if (local1381 != null) {
								local1381.method1876(local1352, local1336, local1332);
								local1391 = local1381;
							}
							if (local1385 != null) {
								local1385.method1876(local1352, local1336, local1332);
								if (local1391 == null || local1385.aLong313 < local1391.aLong313) {
									local1391 = local1385;
								}
							}
							if (local1389 != null) {
								local1389.method1876(local1352, local1336, local1332);
								if (local1391 == null || local1391.aLong313 > local1389.aLong313) {
									local1391 = local1389;
								}
							}
							if (local1391 != null) {
								if (local1381 != null) {
									local1391.method1878(local1363);
								}
								if (local1385 != null) {
									local1391.method1878(local1370);
								}
								if (local1389 != null) {
									local1391.method1878(local1377);
								}
								local1391.method1876(local1352, local1336, local1332);
							}
							local1352++;
						}
					}
				}
			}
			local156.a();
			this.anInterface2_1 = this.aClass101_Sub2_1.method5676(local151, local131, local156.b());
			this.aClass274_4 = new Class274(this.anInterface2_1, 5126, 3, 0);
			this.aClass274_3 = new Class274(this.anInterface2_1, 5121, 4, 12);
			@Pc(1542) byte local1542;
			if (this.anIntArrayArrayArray5 == null) {
				this.aClass274_2 = new Class274(this.anInterface2_1, 5126, 2, 16);
				local1542 = 24;
			} else {
				this.aClass274_2 = new Class274(this.anInterface2_1, 5126, 3, 16);
				local1542 = 28;
			}
			if ((this.anInt428 & 0x7) != 0) {
				this.aClass274_1 = new Class274(this.anInterface2_1, 5126, 3, local1542);
			}
			@Pc(1579) long[] local1579 = new long[this.aClass2_Sub21Array1.length];
			for (local1352 = 0; local1352 < this.aClass2_Sub21Array1.length; local1352++) {
				@Pc(1588) Class2_Sub21 local1588 = this.aClass2_Sub21Array1[local1352];
				local1579[local1352] = local1588.aLong313;
				local1588.method1880(this.anInt427);
			}
			Static77.method1382(this.aClass2_Sub21Array1, local1579);
			if (this.aClass281_1 != null) {
				this.aClass281_1.method7352();
			}
		} else {
			this.aClass281_1 = null;
		}
		this.anIntArrayArrayArray6 = null;
		this.anIntArrayArrayArray4 = null;
		this.anIntArrayArrayArray2 = null;
		this.anIntArrayArrayArray7 = this.anIntArrayArrayArray3 = null;
		this.aByteArrayArray2 = null;
		this.aClass335_3 = null;
		this.aFloatArrayArray5 = this.aFloatArrayArray4 = this.aFloatArrayArray3 = null;
		this.anIntArrayArrayArray5 = null;
		this.aClass2_Sub21ArrayArrayArray1 = null;
	}

	@OriginalMember(owner = "client!al", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class2_Sub1_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass281_1 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (arg2 * this.aClass101_Sub2_1.anInt6341 >> 8) >> this.aClass101_Sub2_1.anInt6315;
			@Pc(37) int local37 = arg3 - (arg2 * this.aClass101_Sub2_1.anInt6337 >> 8) >> this.aClass101_Sub2_1.anInt6315;
			this.aClass281_1.method7356(local23, local37, arg0);
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method8541(@OriginalArg(0) Class2_Sub1_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass281_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (arg2 * this.aClass101_Sub2_1.anInt6341 >> 8) >> this.aClass101_Sub2_1.anInt6315;
			@Pc(39) int local39 = arg3 - (this.aClass101_Sub2_1.anInt6337 * arg2 >> 8) >> this.aClass101_Sub2_1.anInt6315;
			return this.aClass281_1.method7357(local25, local39, arg0);
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IZILclient!kw;)V")
	private void method435(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub1_Sub11_Sub1 arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray7[arg1][arg0];
		@Pc(23) int[] local23 = this.anIntArrayArrayArray3[arg1][arg0];
		@Pc(26) int local26 = local12.length;
		if (this.aClass101_Sub2_1.anIntArray304.length < local26) {
			this.aClass101_Sub2_1.anIntArray304 = new int[local26];
			this.aClass101_Sub2_1.anIntArray305 = new int[local26];
		}
		@Pc(50) int[] local50 = this.aClass101_Sub2_1.anIntArray304;
		@Pc(54) int[] local54 = this.aClass101_Sub2_1.anIntArray305;
		for (@Pc(56) int local56 = 0; local56 < local26; local56++) {
			local50[local56] = local12[local56] >> this.aClass101_Sub2_1.anInt6315;
			local54[local56] = local23[local56] >> this.aClass101_Sub2_1.anInt6315;
		}
		@Pc(84) int local84 = 0;
		while (local26 > local84) {
			@Pc(90) int local90 = local50[local84];
			@Pc(95) int local95 = local54[local84++];
			@Pc(99) int local99 = local50[local84];
			@Pc(104) int local104 = local54[local84++];
			@Pc(108) int local108 = local50[local84];
			@Pc(113) int local113 = local54[local84++];
			if (-((local108 - local99) * (local104 + -local95)) + (local104 - local113) * (local90 - local99) > 0) {
				arg2.method5410(local104, local95, local108, local90, local113, local99);
			}
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method8534(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt432 <= 0) {
			return;
		}
		this.aClass101_Sub2_1.method5646();
		this.aClass101_Sub2_1.method5632(false);
		this.aClass101_Sub2_1.method5691(false);
		this.aClass101_Sub2_1.method5693(false);
		this.aClass101_Sub2_1.method5683(false);
		this.aClass101_Sub2_1.method5614(0);
		this.aClass101_Sub2_1.method5670(-2);
		this.aClass101_Sub2_1.method5690((Class50) null);
		Static264.aFloatArray27[14] = 0.0F;
		Static264.aFloatArray27[3] = 0.0F;
		Static264.aFloatArray27[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass101_Sub2_1.anInt6211;
		Static264.aFloatArray27[9] = 0.0F;
		Static264.aFloatArray27[11] = 0.0F;
		Static264.aFloatArray27[12] = -1.0F - ((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass101_Sub2_1.anInt6186;
		Static264.aFloatArray27[6] = 0.0F;
		Static264.aFloatArray27[7] = 0.0F;
		Static264.aFloatArray27[2] = 0.0F;
		Static264.aFloatArray27[8] = 0.0F;
		Static264.aFloatArray27[5] = (float) 1024 / ((float) this.aClass101_Sub2_1.anInt6211 * 128.0F * (float) super.anInt9739);
		Static264.aFloatArray27[10] = 0.0F;
		Static264.aFloatArray27[0] = (float) 1024 / ((float) super.anInt9739 * 128.0F * (float) this.aClass101_Sub2_1.anInt6186);
		Static264.aFloatArray27[1] = 0.0F;
		Static264.aFloatArray27[4] = 0.0F;
		Static264.aFloatArray27[15] = 1.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static264.aFloatArray27, 0);
		Static264.aFloatArray27[7] = 0.0F;
		Static264.aFloatArray27[1] = 0.0F;
		Static264.aFloatArray27[8] = 0.0F;
		Static264.aFloatArray27[9] = 1.0F;
		Static264.aFloatArray27[3] = 0.0F;
		Static264.aFloatArray27[2] = 0.0F;
		Static264.aFloatArray27[6] = 1.0F;
		Static264.aFloatArray27[12] = 0.0F;
		Static264.aFloatArray27[11] = 0.0F;
		Static264.aFloatArray27[13] = 0.0F;
		Static264.aFloatArray27[4] = 0.0F;
		Static264.aFloatArray27[15] = 1.0F;
		Static264.aFloatArray27[5] = 0.0F;
		Static264.aFloatArray27[10] = 0.0F;
		Static264.aFloatArray27[14] = 0.0F;
		Static264.aFloatArray27[0] = 1.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static264.aFloatArray27, 0);
		if ((this.anInt428 & 0x7) == 0) {
			this.aClass101_Sub2_1.method5691(false);
		} else {
			this.aClass101_Sub2_1.method5691(true);
			this.aClass101_Sub2_1.method5689();
		}
		this.aClass101_Sub2_1.method5650(this.aClass274_1, this.aClass274_4, this.aClass274_3, this.aClass274_2);
		if (this.anInt430 * 2 > this.aClass101_Sub2_1.aClass2_Sub8_Sub1_2.lb.length) {
			this.aClass101_Sub2_1.aClass2_Sub8_Sub1_2 = new Class2_Sub8_Sub1(this.anInt430 * 2);
		} else {
			this.aClass101_Sub2_1.aClass2_Sub8_Sub1_2.anInt5725 = 0;
		}
		@Pc(310) int local310 = 0;
		@Pc(314) Class2_Sub8_Sub1 local314 = this.aClass101_Sub2_1.aClass2_Sub8_Sub1_2;
		@Pc(320) int local320;
		@Pc(329) int local329;
		@Pc(331) int local331;
		@Pc(349) short[] local349;
		@Pc(353) int local353;
		if (this.aClass101_Sub2_1.aBoolean470) {
			for (local320 = arg1; local320 < arg3; local320++) {
				local329 = arg0 + local320 * super.anInt9741;
				for (local331 = arg0; local331 < arg2; local331++) {
					if (arg4[local331 - arg0][local320 - arg1]) {
						local349 = this.aShortArrayArray1[local329];
						if (local349 != null) {
							for (local353 = 0; local353 < local349.length; local353++) {
								local310++;
								local314.method5192(local349[local353] & 0xFFFF);
							}
						}
					}
					local329++;
				}
			}
		} else {
			for (local320 = arg1; local320 < arg3; local320++) {
				local329 = arg0 + super.anInt9741 * local320;
				for (local331 = arg0; local331 < arg2; local331++) {
					if (arg4[local331 - arg0][local320 - arg1]) {
						local349 = this.aShortArrayArray1[local329];
						if (local349 != null) {
							for (local353 = 0; local353 < local349.length; local353++) {
								local310++;
								local314.method5228(local349[local353] & 0xFFFF);
							}
						}
					}
					local329++;
				}
			}
		}
		if (local310 > 0) {
			@Pc(466) Class55_Sub2 local466 = new Class55_Sub2(this.aClass101_Sub2_1, 5123, local314.lb, local314.anInt5725);
			this.aClass101_Sub2_1.method5645(local310, 0, local466);
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method8535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method430(arg4, arg0, arg1, arg2, arg5, arg6, arg3);
	}
}
