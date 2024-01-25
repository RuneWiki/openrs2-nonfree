import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class7_Sub1 extends Class7 {

	@OriginalMember(owner = "client!ae", name = "t", descriptor = "I")
	private int anInt184;

	@OriginalMember(owner = "client!ae", name = "E", descriptor = "I")
	private int anInt189;

	@OriginalMember(owner = "client!ae", name = "J", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!ae", name = "U", descriptor = "I")
	private int anInt199;

	@OriginalMember(owner = "client!ae", name = "Y", descriptor = "Lclient!ro;")
	public Class258 aClass258_1;

	@OriginalMember(owner = "client!ae", name = "Z", descriptor = "Lclient!qo;")
	private Interface15 anInterface15_1;

	@OriginalMember(owner = "client!ae", name = "bb", descriptor = "Lclient!ro;")
	public Class258 aClass258_2;

	@OriginalMember(owner = "client!ae", name = "cb", descriptor = "Lclient!ro;")
	private Class258 aClass258_3;

	@OriginalMember(owner = "client!ae", name = "db", descriptor = "[Lclient!or;")
	private Class1_Sub43[] aClass1_Sub43Array1;

	@OriginalMember(owner = "client!ae", name = "fb", descriptor = "I")
	private int anInt200;

	@OriginalMember(owner = "client!ae", name = "hb", descriptor = "Lclient!ro;")
	public Class258 aClass258_4;

	@OriginalMember(owner = "client!ae", name = "u", descriptor = "Lclient!ui;")
	private final Class295 aClass295_2 = new Class295();

	@OriginalMember(owner = "client!ae", name = "H", descriptor = "[[I")
	private final int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!ae", name = "D", descriptor = "Lclient!mh;")
	public final Class4_Sub3 aClass4_Sub3_1;

	@OriginalMember(owner = "client!ae", name = "O", descriptor = "I")
	private final int anInt195;

	@OriginalMember(owner = "client!ae", name = "V", descriptor = "[[F")
	private float[][] aFloatArrayArray1;

	@OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
	public final int anInt183;

	@OriginalMember(owner = "client!ae", name = "B", descriptor = "[[B")
	private final byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!ae", name = "P", descriptor = "I")
	private final int anInt196;

	@OriginalMember(owner = "client!ae", name = "i", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!ae", name = "ab", descriptor = "[[B")
	private byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!ae", name = "l", descriptor = "[[[Lclient!or;")
	private Class1_Sub43[][][] aClass1_Sub43ArrayArrayArray1;

	@OriginalMember(owner = "client!ae", name = "eb", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!ae", name = "C", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!ae", name = "I", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!ae", name = "n", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!ae", name = "X", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!ae", name = "o", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!ae", name = "m", descriptor = "[[S")
	public final short[][] aShortArrayArray1;

	@OriginalMember(owner = "client!ae", name = "T", descriptor = "Lclient!pt;")
	private Class230 aClass230_5;

	@OriginalMember(owner = "client!ae", name = "v", descriptor = "Lclient!dc;")
	private Class61 aClass61_1;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lclient!mh;IIII[[I[[II)V")
	public Class7_Sub1(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.anIntArrayArray2 = arg5;
		this.aClass4_Sub3_1 = arg0;
		this.anInt195 = super.anInt9573 - 2;
		this.aFloatArrayArray1 = new float[super.anInt9577 + 1][super.anInt9575 + 1];
		this.anInt183 = arg2;
		this.aByteArrayArray1 = new byte[arg3][arg4];
		this.anInt196 = 0x1 << this.anInt195;
		this.anIntArrayArrayArray1 = new int[arg3][arg4][];
		this.aByteArrayArray2 = new byte[arg3 + 1][arg4 + 1];
		this.aClass1_Sub43ArrayArrayArray1 = new Class1_Sub43[arg3][arg4][];
		this.aFloatArrayArray3 = new float[super.anInt9577 + 1][super.anInt9575 + 1];
		this.anIntArrayArrayArray4 = new int[arg3][arg4][];
		this.anIntArrayArrayArray5 = new int[arg3][arg4][];
		this.anIntArrayArrayArray2 = new int[arg3][arg4][];
		this.aFloatArrayArray2 = new float[super.anInt9577 + 1][super.anInt9575 + 1];
		this.anIntArrayArrayArray3 = new int[arg3][arg4][];
		this.aShortArrayArray1 = new short[arg3 * arg4][];
		for (@Pc(117) int local117 = 1; local117 < super.anInt9575; local117++) {
			for (@Pc(121) int local121 = 1; local121 < super.anInt9577; local121++) {
				@Pc(139) int local139 = arg6[local121 + 1][local117] - arg6[local121 - 1][local117];
				@Pc(156) int local156 = arg6[local121][local117 + 1] - arg6[local121][local117 - 1];
				@Pc(175) float local175 = (float) (1.0D / Math.sqrt((double) (local156 * local156 + arg7 * 4 * arg7 + local139 * local139)));
				this.aFloatArrayArray1[local121][local117] = (float) local139 * local175;
				this.aFloatArrayArray3[local121][local117] = local175 * (float) (-arg7 * 2);
				this.aFloatArrayArray2[local121][local117] = (float) local156 * local175;
			}
		}
		this.aClass230_5 = new Class230(128);
		if ((this.anInt183 & 0x10) != 0) {
			this.aClass61_1 = new Class61(this.aClass4_Sub3_1, this);
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method8248(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!ae", name = "ya", descriptor = "(Lclient!k;IIIIZ)V")
	@Override
	public void ya(@OriginalArg(0) Class1_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass61_1 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (arg2 * this.aClass4_Sub3_1.anInt5820 >> 8) >> this.aClass4_Sub3_1.anInt5795;
			@Pc(38) int local38 = arg3 - (arg2 * this.aClass4_Sub3_1.anInt5815 >> 8) >> this.aClass4_Sub3_1.anInt5795;
			this.aClass61_1.method1764(local23, local38, arg0);
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IILclient!qba;I)V")
	private void method393(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub2_Sub2_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray4[arg2][arg0];
		@Pc(30) int[] local30 = this.anIntArrayArrayArray1[arg2][arg0];
		@Pc(33) int local33 = local12.length;
		if (this.aClass4_Sub3_1.anIntArray454.length < local33) {
			this.aClass4_Sub3_1.anIntArray452 = new int[local33];
			this.aClass4_Sub3_1.anIntArray454 = new int[local33];
		}
		@Pc(57) int[] local57 = this.aClass4_Sub3_1.anIntArray454;
		@Pc(61) int[] local61 = this.aClass4_Sub3_1.anIntArray452;
		for (@Pc(63) int local63 = 0; local63 < local33; local63++) {
			local57[local63] = local12[local63] >> this.aClass4_Sub3_1.anInt5795;
			local61[local63] = local30[local63] >> this.aClass4_Sub3_1.anInt5795;
		}
		@Pc(95) int local95 = 0;
		while (local95 < local33) {
			@Pc(101) int local101 = local57[local95];
			@Pc(106) int local106 = local61[local95++];
			@Pc(110) int local110 = local57[local95];
			@Pc(115) int local115 = local61[local95++];
			@Pc(119) int local119 = local57[local95];
			@Pc(124) int local124 = local61[local95++];
			if (-((local115 - local106) * (local119 - local110)) + (local101 - local110) * (local115 - local124) > 0) {
				arg1.method6203(local115, local124, local101, local119, local106, local110);
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method8249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method395(arg3, arg2, arg4, arg1, arg0);
	}

	@OriginalMember(owner = "client!ae", name = "F", descriptor = "(Lclient!k;IIIIZ)V")
	@Override
	public void F(@OriginalArg(0) Class1_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass61_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass4_Sub3_1.anInt5820 >> 8) >> this.aClass4_Sub3_1.anInt5795;
			@Pc(38) int local38 = arg3 - (this.aClass4_Sub3_1.anInt5815 * arg2 >> 8) >> this.aClass4_Sub3_1.anInt5795;
			this.aClass61_1.method1772(local24, local38, arg0);
		}
	}

	@OriginalMember(owner = "client!ae", name = "X", descriptor = "(IILclient!k;)Lclient!k;")
	@Override
	public Class1_Sub2_Sub2 X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub2_Sub2 arg2) {
		if ((this.aByteArrayArray1[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(21) int local21 = super.anInt9576 >> this.aClass4_Sub3_1.anInt5795;
		@Pc(24) Class1_Sub2_Sub2_Sub2 local24 = (Class1_Sub2_Sub2_Sub2) arg2;
		@Pc(40) Class1_Sub2_Sub2_Sub2 local40;
		if (local24 != null && local24.method6202(local21, local21)) {
			local40 = local24;
			local24.method6200();
		} else {
			local40 = new Class1_Sub2_Sub2_Sub2(this.aClass4_Sub3_1, local21, local21);
		}
		local40.method6205(0, 0, local21, local21);
		this.method393(arg1, local40, arg0);
		return local40;
	}

	@OriginalMember(owner = "client!ae", name = "N", descriptor = "()V")
	@Override
	public void N() {
		if (this.anInt200 <= 0) {
			this.aClass61_1 = null;
		} else {
			@Pc(19) byte[][] local19 = new byte[super.anInt9577 + 1][super.anInt9575 + 1];
			@Pc(25) int local25;
			for (@Pc(21) int local21 = 1; local21 < super.anInt9577; local21++) {
				for (local25 = 1; local25 < super.anInt9575; local25++) {
					local19[local21][local25] = (byte) ((this.aByteArrayArray2[local21][local25] >> 1) + (this.aByteArrayArray2[local21][local25 - 1] >> 2) + (this.aByteArrayArray2[local21 + 1][local25] >> 3) + (this.aByteArrayArray2[local21 + -1][local25] >> 2) + (this.aByteArrayArray2[local21][local25 + 1] >> 3));
				}
			}
			this.aClass1_Sub43Array1 = new Class1_Sub43[this.aClass230_5.method6138()];
			this.aClass230_5.method6143(this.aClass1_Sub43Array1);
			for (local25 = 0; local25 < this.aClass1_Sub43Array1.length; local25++) {
				this.aClass1_Sub43Array1[local25].method5834(this.anInt200);
			}
			@Pc(133) int local133 = 24;
			if (this.anIntArrayArrayArray6 != null) {
				local133 += 4;
			}
			if ((this.anInt183 & 0x7) != 0) {
				local133 += 12;
			}
			@Pc(156) NativeHeapBuffer local156 = this.aClass4_Sub3_1.aNativeHeap4.a(local133 * this.anInt200, false);
			@Pc(161) Stream local161 = new Stream(local156);
			@Pc(165) Class1_Sub43[] local165 = new Class1_Sub43[this.anInt200];
			@Pc(172) int local172 = Static513.method7859(this.anInt200 / 4);
			if (local172 < 1) {
				local172 = 1;
			}
			@Pc(184) Class230 local184 = new Class230(local172);
			@Pc(188) Class1_Sub43[] local188 = new Class1_Sub43[this.anInt199];
			@Pc(194) int local194;
			for (@Pc(190) int local190 = 0; local190 < super.anInt9577; local190++) {
				for (local194 = 0; local194 < super.anInt9575; local194++) {
					if (this.anIntArrayArrayArray5[local190][local194] != null) {
						@Pc(210) Class1_Sub43[] local210 = this.aClass1_Sub43ArrayArrayArray1[local190][local194];
						@Pc(217) int[] local217 = this.anIntArrayArrayArray4[local190][local194];
						@Pc(224) int[] local224 = this.anIntArrayArrayArray1[local190][local194];
						@Pc(231) int[] local231 = this.anIntArrayArrayArray2[local190][local194];
						@Pc(238) int[] local238 = this.anIntArrayArrayArray5[local190][local194];
						@Pc(250) int[] local250 = this.anIntArrayArrayArray3 == null ? null : this.anIntArrayArrayArray3[local190][local194];
						if (local231 == null) {
							local231 = local238;
						}
						@Pc(266) int[] local266 = this.anIntArrayArrayArray6 == null ? null : this.anIntArrayArrayArray6[local190][local194];
						@Pc(273) float local273 = this.aFloatArrayArray1[local190][local194];
						@Pc(280) float local280 = this.aFloatArrayArray3[local190][local194];
						@Pc(287) float local287 = this.aFloatArrayArray2[local190][local194];
						@Pc(296) float local296 = this.aFloatArrayArray1[local190][local194 + 1];
						@Pc(305) float local305 = this.aFloatArrayArray3[local190][local194 + 1];
						@Pc(314) float local314 = this.aFloatArrayArray2[local190][local194 + 1];
						@Pc(325) float local325 = this.aFloatArrayArray1[local190 + 1][local194 + 1];
						@Pc(336) float local336 = this.aFloatArrayArray3[local190 + 1][local194 + 1];
						@Pc(347) float local347 = this.aFloatArrayArray2[local190 + 1][local194 + 1];
						@Pc(356) float local356 = this.aFloatArrayArray1[local190 + 1][local194];
						@Pc(365) float local365 = this.aFloatArrayArray3[local190 + 1][local194];
						@Pc(374) float local374 = this.aFloatArrayArray2[local190 + 1][local194];
						@Pc(382) int local382 = local19[local190][local194] & 0xFF;
						@Pc(392) int local392 = local19[local190][local194 + 1] & 0xFF;
						@Pc(404) int local404 = local19[local190 + 1][local194 + 1] & 0xFF;
						@Pc(414) int local414 = local19[local190 + 1][local194] & 0xFF;
						@Pc(416) int local416 = 0;
						@Pc(426) int local426;
						label337: for (@Pc(418) int local418 = 0; local418 < local238.length; local418++) {
							@Pc(424) Class1_Sub43 local424 = local210[local418];
							for (local426 = 0; local426 < local416; local426++) {
								if (local424 == local188[local426]) {
									continue label337;
								}
							}
							local188[local416++] = local424;
						}
						@Pc(463) short[] local463 = this.aShortArrayArray1[local190 + super.anInt9577 * local194] = new short[local238.length];
						for (local426 = 0; local426 < local238.length; local426++) {
							@Pc(477) int local477 = (local190 << super.anInt9573) + local217[local426];
							@Pc(486) int local486 = (local194 << super.anInt9573) + local224[local426];
							@Pc(491) int local491 = local477 >> this.anInt195;
							@Pc(496) int local496 = local486 >> this.anInt195;
							@Pc(500) int local500 = local238[local426];
							@Pc(504) int local504 = local231[local426];
							@Pc(512) int local512 = local250 == null ? 0 : local250[local426];
							@Pc(530) long local530 = (long) (local491 << 16) | (long) local504 << 48 | (long) local500 << 32 | (long) local496;
							@Pc(534) int local534 = local217[local426];
							@Pc(538) int local538 = local224[local426];
							@Pc(540) byte local540 = 74;
							@Pc(542) int local542 = 0;
							@Pc(558) float local558;
							@Pc(556) float local556;
							@Pc(554) float local554;
							@Pc(621) float local621;
							@Pc(562) int local562;
							if (local534 == 0 && local538 == 0) {
								local562 = local540 - local382;
								local556 = local280;
								local558 = local273;
								local554 = local287;
							} else if (local534 == 0 && local538 == super.anInt9576) {
								local554 = local314;
								local556 = local305;
								local558 = local296;
								local562 = local540 - local392;
							} else if (local534 == super.anInt9576 && super.anInt9576 == local538) {
								local562 = local540 - local404;
								local558 = local325;
								local554 = local347;
								local556 = local336;
							} else if (local534 == super.anInt9576 && local538 == 0) {
								local558 = local356;
								local562 = local540 - local414;
								local556 = local365;
								local554 = local374;
							} else {
								@Pc(597) float local597 = (float) local534 / (float) super.anInt9576;
								@Pc(604) float local604 = (float) local538 / (float) super.anInt9576;
								@Pc(612) float local612 = (local356 - local273) * local597 + local273;
								local621 = (local365 - local280) * local597 + local280;
								@Pc(630) float local630 = local287 + (local374 - local287) * local597;
								@Pc(638) float local638 = local597 * (local325 - local296) + local296;
								@Pc(647) float local647 = local305 + local597 * (local336 - local305);
								local558 = local604 * (local638 - local612) + local612;
								local556 = local621 + (local647 - local621) * local604;
								@Pc(672) float local672 = (local347 - local314) * local597 + local314;
								local554 = local604 * (local672 - local630) + local630;
								@Pc(692) int local692 = local382 + (local534 * (local414 - local382) >> super.anInt9573);
								@Pc(704) int local704 = local392 + ((local404 - local392) * local534 >> super.anInt9573);
								local562 = local540 - local692 - ((local704 - local692) * local538 >> super.anInt9573);
							}
							@Pc(756) float local756 = 1.0F;
							if (local500 != -1) {
								@Pc(768) int local768 = (local500 & 0x7F) * local562 >> 7;
								if (local768 < 2) {
									local768 = 2;
								} else if (local768 > 126) {
									local768 = 126;
								}
								if ((this.anInt183 & 0x7) == 0) {
									local756 = local558 * this.aClass4_Sub3_1.aFloatArray52[0] + local556 * this.aClass4_Sub3_1.aFloatArray52[1] + this.aClass4_Sub3_1.aFloatArray52[2] * local554;
									local756 = this.aClass4_Sub3_1.aFloat121 + (local756 > 0.0F ? this.aClass4_Sub3_1.aFloat114 : this.aClass4_Sub3_1.aFloat117) * local756;
								}
								local542 = Static107.anIntArray176[local768 | local500 & 0xFF80];
							}
							@Pc(840) Class1 local840 = null;
							if ((local477 & this.anInt196 - 1) == 0 && (this.anInt196 - 1 & local486) == 0) {
								local840 = local184.method6144(local530);
							}
							@Pc(1200) int local1200;
							@Pc(901) int local901;
							if (local840 == null) {
								if (local504 == local500) {
									local901 = local542;
								} else {
									@Pc(879) int local879 = local562 * (local504 & 0x7F) >> 7;
									if (local879 < 2) {
										local879 = 2;
									} else if (local879 > 126) {
										local879 = 126;
									}
									local901 = Static107.anIntArray176[local504 & 0xFF80 | local879];
									if ((this.anInt183 & 0x7) == 0) {
										@Pc(932) float local932 = local558 * this.aClass4_Sub3_1.aFloatArray52[0] + local556 * this.aClass4_Sub3_1.aFloatArray52[1] + this.aClass4_Sub3_1.aFloatArray52[2] * local554;
										local621 = this.aClass4_Sub3_1.aFloat121 + (local756 > 0.0F ? this.aClass4_Sub3_1.aFloat114 : this.aClass4_Sub3_1.aFloat117) * local756;
										@Pc(957) int local957 = local901 >> 16 & 0xFF;
										@Pc(963) int local963 = local901 >> 8 & 0xFF;
										@Pc(967) int local967 = local901 & 0xFF;
										local957 = (int) ((float) local957 * local621);
										if (local957 < 0) {
											local957 = 0;
										} else if (local957 > 255) {
											local957 = 255;
										}
										local963 = (int) ((float) local963 * local621);
										local967 = (int) ((float) local967 * local621);
										if (local963 < 0) {
											local963 = 0;
										} else if (local963 > 255) {
											local963 = 255;
										}
										if (local967 < 0) {
											local967 = 0;
										} else if (local967 > 255) {
											local967 = 255;
										}
										local901 = local967 | local957 << 16 | local963 << 8;
									}
								}
								if (this.aClass4_Sub3_1.aBoolean421) {
									local161.b((float) local477);
									local161.b((float) (local512 + this.aa(local477, local486)));
									local161.b((float) local486);
									local161.a((byte) (local901 >> 16));
									local161.a((byte) (local901 >> 8));
									local161.a((byte) local901);
									local161.a(-1);
									local161.b((float) local477);
									local161.b((float) local486);
									if (this.anIntArrayArrayArray6 != null) {
										local161.b((float) (local266 == null ? 0 : local266[local426] - 1));
									}
									if ((this.anInt183 & 0x7) != 0) {
										local161.b(local558);
										local161.b(local556);
										local161.b(local554);
									}
								} else {
									local161.a((float) local477);
									local161.a((float) (local512 + this.aa(local477, local486)));
									local161.a((float) local486);
									local161.a((byte) (local901 >> 16));
									local161.a((byte) (local901 >> 8));
									local161.a((byte) local901);
									local161.a(-1);
									local161.a((float) local477);
									local161.a((float) local486);
									if (this.anIntArrayArrayArray6 != null) {
										local161.a((float) (local266 == null ? 0 : local266[local426] - 1));
									}
									if ((this.anInt183 & 0x7) != 0) {
										local161.a(local558);
										local161.a(local556);
										local161.a(local554);
									}
								}
								local1200 = this.anInt184++;
								local463[local426] = (short) local1200;
								if (local500 != -1) {
									local165[local1200] = local210[local426];
								}
								local184.method6139(local530, new Class1_Sub49(local463[local426]));
							} else {
								local463[local426] = ((Class1_Sub49) local840).aShort117;
								local1200 = local463[local426] & 0xFFFF;
								if (local500 != -1 && local210[local426].aLong251 < local165[local1200].aLong251) {
									local165[local1200] = local210[local426];
								}
							}
							for (local901 = 0; local901 < local416; local901++) {
								local188[local901].method5837(local756, local1200, local542, local562);
							}
							this.anInt189++;
						}
					}
				}
			}
			for (local194 = 0; local194 < this.anInt184; local194++) {
				@Pc(1311) Class1_Sub43 local1311 = local165[local194];
				if (local1311 != null) {
					local1311.method5835(local194);
				}
			}
			@Pc(1348) int local1348;
			for (@Pc(1328) int local1328 = 0; local1328 < super.anInt9577; local1328++) {
				for (@Pc(1332) int local1332 = 0; local1332 < super.anInt9575; local1332++) {
					@Pc(1344) short[] local1344 = this.aShortArrayArray1[local1328 + local1332 * super.anInt9577];
					if (local1344 != null) {
						local1348 = 0;
						@Pc(1350) int local1350 = 0;
						while (local1344.length > local1350) {
							@Pc(1359) int local1359 = local1344[local1350++] & 0xFFFF;
							@Pc(1366) int local1366 = local1344[local1350++] & 0xFFFF;
							@Pc(1373) int local1373 = local1344[local1350++] & 0xFFFF;
							@Pc(1377) Class1_Sub43 local1377 = local165[local1359];
							@Pc(1381) Class1_Sub43 local1381 = local165[local1366];
							@Pc(1385) Class1_Sub43 local1385 = local165[local1373];
							@Pc(1387) Class1_Sub43 local1387 = null;
							if (local1377 != null) {
								local1377.method5836(local1328, local1332, local1348);
								local1387 = local1377;
							}
							if (local1381 != null) {
								local1381.method5836(local1328, local1332, local1348);
								if (local1387 == null || local1387.aLong251 > local1381.aLong251) {
									local1387 = local1381;
								}
							}
							if (local1385 != null) {
								local1385.method5836(local1328, local1332, local1348);
								if (local1387 == null || local1387.aLong251 > local1385.aLong251) {
									local1387 = local1385;
								}
							}
							if (local1387 != null) {
								if (local1377 != null) {
									local1387.method5835(local1359);
								}
								if (local1381 != null) {
									local1387.method5835(local1366);
								}
								if (local1385 != null) {
									local1387.method5835(local1373);
								}
								local1387.method5836(local1328, local1332, local1348);
							}
							local1348++;
						}
					}
				}
			}
			local161.b();
			this.anInterface15_1 = this.aClass4_Sub3_1.method5253(local161.c(), local156, local133);
			this.aClass258_4 = new Class258(this.anInterface15_1, 5126, 3, 0);
			this.aClass258_3 = new Class258(this.anInterface15_1, 5121, 4, 12);
			@Pc(1520) byte local1520;
			if (this.anIntArrayArrayArray6 == null) {
				local1520 = 24;
				this.aClass258_1 = new Class258(this.anInterface15_1, 5126, 2, 16);
			} else {
				local1520 = 28;
				this.aClass258_1 = new Class258(this.anInterface15_1, 5126, 3, 16);
			}
			if ((this.anInt183 & 0x7) != 0) {
				this.aClass258_2 = new Class258(this.anInterface15_1, 5126, 3, local1520);
			}
			@Pc(1564) long[] local1564 = new long[this.aClass1_Sub43Array1.length];
			for (local1348 = 0; local1348 < this.aClass1_Sub43Array1.length; local1348++) {
				@Pc(1573) Class1_Sub43 local1573 = this.aClass1_Sub43Array1[local1348];
				local1564[local1348] = local1573.aLong251;
				local1573.method5838(this.anInt184);
			}
			Static316.method5450(this.aClass1_Sub43Array1, local1564);
			if (this.aClass61_1 != null) {
				this.aClass61_1.method1771();
			}
		}
		this.aFloatArrayArray1 = this.aFloatArrayArray3 = this.aFloatArrayArray2 = null;
		this.aByteArrayArray2 = null;
		this.anIntArrayArrayArray6 = null;
		this.aClass230_5 = null;
		this.anIntArrayArrayArray3 = null;
		this.anIntArrayArrayArray4 = this.anIntArrayArrayArray1 = null;
		this.anIntArrayArrayArray2 = null;
		this.aClass1_Sub43ArrayArrayArray1 = null;
		this.anIntArrayArrayArray5 = null;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!cba;[I)V")
	@Override
	public void method8246(@OriginalArg(0) Class1_Sub5 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass295_2.method7533(new Class1_Sub26(this.aClass4_Sub3_1, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!ae", name = "aa", descriptor = "(II)I")
	@Override
	public int aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 >> super.anInt9573;
		@Pc(13) int local13 = arg1 >> super.anInt9573;
		if (local8 < 0 || local13 < 0 || local8 > super.anInt9577 - 1 || super.anInt9575 - 1 < local13) {
			return 0;
		}
		@Pc(46) int local46 = super.anInt9576 - 1 & arg0;
		@Pc(53) int local53 = arg1 & super.anInt9576 - 1;
		@Pc(79) int local79 = this.anIntArrayArray2[local8][local13] * (super.anInt9576 - local46) + this.anIntArrayArray2[local8 + 1][local13] * local46 >> super.anInt9573;
		@Pc(109) int local109 = local46 * this.anIntArrayArray2[local8 + 1][local13 + 1] + this.anIntArrayArray2[local8][local13 + 1] * (super.anInt9576 - local46) >> super.anInt9573;
		return local79 * (super.anInt9576 - local53) + local109 * local53 >> super.anInt9573;
	}

	@OriginalMember(owner = "client!ae", name = "IA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray6 == null) {
			this.anIntArrayArrayArray6 = new int[super.anInt9577][super.anInt9575][];
		}
		if (arg3 != null && this.anIntArrayArrayArray3 == null) {
			this.anIntArrayArrayArray3 = new int[super.anInt9577][super.anInt9575][];
		}
		this.anIntArrayArrayArray4[arg0][arg1] = arg2;
		this.anIntArrayArrayArray1[arg0][arg1] = arg4;
		this.anIntArrayArrayArray5[arg0][arg1] = arg6;
		this.anIntArrayArrayArray2[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray6 != null) {
			this.anIntArrayArrayArray6[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray3 != null) {
			this.anIntArrayArrayArray3[arg0][arg1] = arg3;
		}
		@Pc(88) Class1_Sub43[] local88 = this.aClass1_Sub43ArrayArrayArray1[arg0][arg1] = new Class1_Sub43[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) arg8[local90] | (long) (arg9[local90] << 14) | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28;
			@Pc(125) Class1 local125;
			for (local125 = this.aClass230_5.method6144(local119); local125 != null; local125 = this.aClass230_5.method6145()) {
				@Pc(130) Class1_Sub43 local130 = (Class1_Sub43) local125;
				if (local130.anInt6473 == arg8[local90] && (float) arg9[local90] == local130.aFloat139 && arg10 == local130.anInt6476 && arg11 == local130.anInt6478 && arg12 == local130.anInt6469) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class1_Sub43(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass230_5.method6139(local119, local88[local90]);
			} else {
				local88[local90] = (Class1_Sub43) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray1[arg0][arg1] = (byte) (this.aByteArrayArray1[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt199) {
			this.anInt199 = arg6.length;
		}
		this.anInt200 += arg6.length;
	}

	@OriginalMember(owner = "client!ae", name = "Q", descriptor = "(III)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray2[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray2[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!ae", name = "ba", descriptor = "(II)I")
	@Override
	public int ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray2[arg0][arg1];
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(B[[ZIZIII)V")
	private void method395(@OriginalArg(1) boolean[][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (this.aClass1_Sub43Array1 == null) {
			return;
		}
		@Pc(34) float local34 = this.aClass4_Sub3_1.aFloat127;
		@Pc(38) float local38 = this.aClass4_Sub3_1.aFloat123;
		@Pc(45) int local45 = arg1 + arg1 + 1;
		@Pc(49) int local49 = local45 * local45;
		if (local49 > this.aClass4_Sub3_1.anIntArray453.length) {
			this.aClass4_Sub3_1.anIntArray453 = new int[local49];
		}
		if (this.aClass4_Sub3_1.aClass1_Sub17_Sub1_2.aByteArray58.length < this.anInt189 * 2) {
			this.aClass4_Sub3_1.aClass1_Sub17_Sub1_2 = new Class1_Sub17_Sub1(this.anInt189 * 2);
		}
		@Pc(89) int local89 = arg4 - arg1;
		@Pc(91) int local91 = local89;
		if (local89 < 0) {
			local89 = 0;
		}
		@Pc(102) int local102 = arg3 - arg1;
		@Pc(104) int local104 = local102;
		if (local102 < 0) {
			local102 = 0;
		}
		@Pc(112) int local112 = arg1 + arg4;
		if (local112 > super.anInt9577 - 1) {
			local112 = super.anInt9577 - 1;
		}
		@Pc(127) int local127 = arg1 + arg3;
		if (local127 > super.anInt9575 - 1) {
			local127 = super.anInt9575 - 1;
		}
		@Pc(140) int local140 = 0;
		@Pc(144) int[] local144 = this.aClass4_Sub3_1.anIntArray453;
		@Pc(157) int local157;
		for (@Pc(146) int local146 = local89; local146 <= local112; local146++) {
			@Pc(155) boolean[] local155 = arg0[local146 - local91];
			for (local157 = local102; local157 <= local127; local157++) {
				if (local155[local157 - local104]) {
					local144[local140++] = local146 + super.anInt9577 * local157;
				}
			}
		}
		this.aClass4_Sub3_1.method5254();
		this.aClass4_Sub3_1.method5273((this.anInt183 & 0x7) != 0);
		for (@Pc(224) int local224 = 0; local224 < this.aClass1_Sub43Array1.length; local224++) {
			this.aClass1_Sub43Array1[local224].method5830(local144, local140);
		}
		if (!this.aClass295_2.method7536()) {
			local157 = this.aClass4_Sub3_1.anInt5819;
			@Pc(253) int local253 = this.aClass4_Sub3_1.anInt5812;
			this.aClass4_Sub3_1.E(0, local253, this.aClass4_Sub3_1.bf);
			this.aClass4_Sub3_1.la(local38, local34 - 4.0F);
			this.aClass4_Sub3_1.method5273(false);
			this.aClass4_Sub3_1.method5268(false);
			this.aClass4_Sub3_1.method5225(128);
			this.aClass4_Sub3_1.method5238(-2);
			this.aClass4_Sub3_1.method5250(this.aClass4_Sub3_1.aClass164_Sub3_5);
			this.aClass4_Sub3_1.method5266(7681, 8448);
			this.aClass4_Sub3_1.method5293(0, 770, 34166);
			this.aClass4_Sub3_1.method5265(0, 34167);
			for (@Pc(320) Class1 local320 = this.aClass295_2.method7543(); local320 != null; local320 = this.aClass295_2.method7540()) {
				@Pc(325) Class1_Sub26 local325 = (Class1_Sub26) local320;
				local325.method4101(arg1, arg3, arg4, arg0);
			}
			this.aClass4_Sub3_1.method5293(0, 768, 5890);
			this.aClass4_Sub3_1.method5265(0, 5890);
			this.aClass4_Sub3_1.method5250(null);
			this.aClass4_Sub3_1.E(local157, local253, this.aClass4_Sub3_1.bf);
		}
		if (this.aClass61_1 != null) {
			this.aClass4_Sub3_1.la(local38, local34 - 8.0F);
			this.aClass4_Sub3_1.method5254();
			this.aClass4_Sub3_1.method5298(this.aClass258_1, null, this.aClass258_4, null);
			this.aClass61_1.method1766(arg0, arg2, arg4, arg1, arg3);
		}
		this.aClass4_Sub3_1.la(local38, local34);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method8245(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt200 <= 0) {
			return;
		}
		this.aClass4_Sub3_1.method5246();
		this.aClass4_Sub3_1.method5270(false);
		this.aClass4_Sub3_1.method5273(false);
		this.aClass4_Sub3_1.method5241(false);
		this.aClass4_Sub3_1.method5268(false);
		this.aClass4_Sub3_1.method5225(0);
		this.aClass4_Sub3_1.method5238(-2);
		this.aClass4_Sub3_1.method5250(null);
		Static119.aFloatArray17[4] = 0.0F;
		Static119.aFloatArray17[8] = 0.0F;
		Static119.aFloatArray17[15] = 1.0F;
		Static119.aFloatArray17[1] = 0.0F;
		Static119.aFloatArray17[0] = (float) 1024 / ((float) super.anInt9576 * 128.0F * (float) this.aClass4_Sub3_1.anInt5651);
		Static119.aFloatArray17[7] = 0.0F;
		Static119.aFloatArray17[6] = 0.0F;
		Static119.aFloatArray17[2] = 0.0F;
		Static119.aFloatArray17[9] = 0.0F;
		Static119.aFloatArray17[11] = 0.0F;
		Static119.aFloatArray17[10] = 0.0F;
		Static119.aFloatArray17[13] = 1.0F - ((float) (arg3 * 1024) / 128.0F + (float) 0) / (float) this.aClass4_Sub3_1.anInt5633;
		Static119.aFloatArray17[5] = (float) 1024 / ((float) this.aClass4_Sub3_1.anInt5633 * 128.0F * (float) super.anInt9576);
		Static119.aFloatArray17[12] = -1.0F - ((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass4_Sub3_1.anInt5651;
		Static119.aFloatArray17[14] = 0.0F;
		Static119.aFloatArray17[3] = 0.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static119.aFloatArray17, 0);
		Static119.aFloatArray17[14] = 0.0F;
		Static119.aFloatArray17[1] = 0.0F;
		Static119.aFloatArray17[13] = 0.0F;
		Static119.aFloatArray17[3] = 0.0F;
		Static119.aFloatArray17[12] = 0.0F;
		Static119.aFloatArray17[5] = 0.0F;
		Static119.aFloatArray17[15] = 1.0F;
		Static119.aFloatArray17[8] = 0.0F;
		Static119.aFloatArray17[4] = 0.0F;
		Static119.aFloatArray17[6] = 1.0F;
		Static119.aFloatArray17[7] = 0.0F;
		Static119.aFloatArray17[10] = 0.0F;
		Static119.aFloatArray17[11] = 0.0F;
		Static119.aFloatArray17[9] = 1.0F;
		Static119.aFloatArray17[2] = 0.0F;
		Static119.aFloatArray17[0] = 1.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static119.aFloatArray17, 0);
		if ((this.anInt183 & 0x7) == 0) {
			this.aClass4_Sub3_1.method5273(false);
		} else {
			this.aClass4_Sub3_1.method5273(true);
			this.aClass4_Sub3_1.method5283();
		}
		this.aClass4_Sub3_1.method5298(this.aClass258_1, this.aClass258_3, this.aClass258_4, this.aClass258_2);
		if (this.aClass4_Sub3_1.aClass1_Sub17_Sub1_2.aByteArray58.length >= this.anInt189 * 2) {
			this.aClass4_Sub3_1.aClass1_Sub17_Sub1_2.anInt4872 = 0;
		} else {
			this.aClass4_Sub3_1.aClass1_Sub17_Sub1_2 = new Class1_Sub17_Sub1(this.anInt189 * 2);
		}
		@Pc(317) int local317 = 0;
		@Pc(321) Class1_Sub17_Sub1 local321 = this.aClass4_Sub3_1.aClass1_Sub17_Sub1_2;
		@Pc(327) int local327;
		@Pc(336) int local336;
		@Pc(338) int local338;
		@Pc(357) short[] local357;
		@Pc(361) int local361;
		if (this.aClass4_Sub3_1.aBoolean421) {
			for (local327 = arg1; local327 < arg3; local327++) {
				local336 = arg0 + local327 * super.anInt9577;
				for (local338 = arg0; local338 < arg2; local338++) {
					if (arg4[local338 - arg0][local327 - arg1]) {
						local357 = this.aShortArrayArray1[local336];
						if (local357 != null) {
							for (local361 = 0; local361 < local357.length; local361++) {
								local321.method4473(local357[local361] & 0xFFFF);
								local317++;
							}
						}
					}
					local336++;
				}
			}
		} else {
			for (local327 = arg1; local327 < arg3; local327++) {
				local336 = local327 * super.anInt9577 + arg0;
				for (local338 = arg0; local338 < arg2; local338++) {
					if (arg4[local338 - arg0][local327 - arg1]) {
						local357 = this.aShortArrayArray1[local336];
						if (local357 != null) {
							for (local361 = 0; local361 < local357.length; local361++) {
								local317++;
								local321.method4455(local357[local361] & 0xFFFF);
							}
						}
					}
					local336++;
				}
			}
		}
		if (local317 > 0) {
			@Pc(470) Class138_Sub2 local470 = new Class138_Sub2(this.aClass4_Sub3_1, 5123, local321.aByteArray58, local321.anInt4872);
			this.aClass4_Sub3_1.method5287(local317, local470, 0);
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!k;IIIIZ)Z")
	@Override
	public boolean method8250(@OriginalArg(0) Class1_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass61_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (arg2 * this.aClass4_Sub3_1.anInt5820 >> 8) >> this.aClass4_Sub3_1.anInt5795;
			@Pc(40) int local40 = arg3 - (this.aClass4_Sub3_1.anInt5815 * arg2 >> 8) >> this.aClass4_Sub3_1.anInt5795;
			return this.aClass61_1.method1767(local40, arg0, local25);
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)V")
	@Override
	public void method8247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
