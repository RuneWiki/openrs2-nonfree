import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class151_Sub1 extends Class151 {

	@OriginalMember(owner = "client!om", name = "l", descriptor = "I")
	private int anInt6435;

	@OriginalMember(owner = "client!om", name = "v", descriptor = "I")
	private int anInt6441;

	@OriginalMember(owner = "client!om", name = "H", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!om", name = "ab", descriptor = "I")
	private int anInt6458;

	@OriginalMember(owner = "client!om", name = "bb", descriptor = "I")
	private int anInt6459;

	@OriginalMember(owner = "client!om", name = "eb", descriptor = "[Lclient!rp;")
	private Class2_Sub42[] aClass2_Sub42Array1;

	@OriginalMember(owner = "client!om", name = "ib", descriptor = "Lclient!ega;")
	private Interface8 anInterface8_11;

	@OriginalMember(owner = "client!om", name = "jb", descriptor = "Lclient!ega;")
	private Interface8 anInterface8_12;

	@OriginalMember(owner = "client!om", name = "kb", descriptor = "Lclient!cl;")
	public Class59 aClass59_19;

	@OriginalMember(owner = "client!om", name = "r", descriptor = "F")
	private float aFloat182 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!om", name = "K", descriptor = "F")
	private float aFloat183 = -3.4028235E38F;

	@OriginalMember(owner = "client!om", name = "J", descriptor = "Lclient!dc;")
	private final Class70 aClass70_42 = new Class70();

	@OriginalMember(owner = "client!om", name = "P", descriptor = "Lclient!um;")
	public final Class162_Sub1 aClass162_Sub1_17;

	@OriginalMember(owner = "client!om", name = "A", descriptor = "I")
	private final int anInt6445;

	@OriginalMember(owner = "client!om", name = "Y", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!om", name = "Z", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!om", name = "m", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!om", name = "n", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!om", name = "O", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!om", name = "cb", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!om", name = "db", descriptor = "[[B")
	private byte[][] aByteArrayArray14;

	@OriginalMember(owner = "client!om", name = "G", descriptor = "[[[Lclient!rp;")
	private Class2_Sub42[][][] aClass2_Sub42ArrayArrayArray1;

	@OriginalMember(owner = "client!om", name = "z", descriptor = "I")
	private final int anInt6444;

	@OriginalMember(owner = "client!om", name = "Q", descriptor = "[[S")
	public final short[][] aShortArrayArray13;

	@OriginalMember(owner = "client!om", name = "w", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!om", name = "X", descriptor = "[[B")
	private final byte[][] aByteArrayArray13;

	@OriginalMember(owner = "client!om", name = "hb", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!om", name = "V", descriptor = "I")
	public final int anInt6457;

	@OriginalMember(owner = "client!om", name = "fb", descriptor = "Lclient!efa;")
	private Class90 aClass90_21;

	@OriginalMember(owner = "client!om", name = "W", descriptor = "Lclient!cba;")
	private Class47 aClass47_1;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lclient!um;IIII[[I[[II)V")
	public Class151_Sub1(@OriginalArg(0) Class162_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass162_Sub1_17 = arg0;
		this.anInt6445 = super.anInt9568 - 2;
		this.anIntArrayArrayArray13 = new int[arg3][arg4][];
		this.aFloatArrayArray5 = new float[super.anInt9572 + 1][super.anInt9574 + 1];
		this.anIntArrayArrayArray8 = new int[arg3][arg4][];
		this.anIntArrayArrayArray9 = new int[arg3][arg4][];
		this.anIntArrayArrayArray12 = new int[arg3][arg4][];
		this.aFloatArrayArray6 = new float[super.anInt9572 + 1][super.anInt9574 + 1];
		this.aByteArrayArray14 = new byte[arg3 + 1][arg4 + 1];
		this.aClass2_Sub42ArrayArrayArray1 = new Class2_Sub42[arg3][arg4][];
		this.anInt6444 = 0x1 << this.anInt6445;
		this.aShortArrayArray13 = new short[arg3 * arg4][];
		this.anIntArrayArrayArray10 = new int[arg3][arg4][];
		this.aByteArrayArray13 = new byte[arg3][arg4];
		this.aFloatArrayArray7 = new float[super.anInt9572 + 1][super.anInt9574 + 1];
		this.anInt6457 = arg2;
		for (@Pc(121) int local121 = 0; super.anInt9574 >= local121; local121++) {
			for (@Pc(125) int local125 = 0; super.anInt9572 >= local125; local125++) {
				@Pc(134) int local134 = super.anIntArrayArray65[local125][local121];
				if ((float) local134 > this.aFloat183) {
					this.aFloat183 = local134;
				}
				if (this.aFloat182 > (float) local134) {
					this.aFloat182 = local134;
				}
				if (local125 > 0 && local121 > 0 && super.anInt9572 > local125 && local121 < super.anInt9574) {
					@Pc(186) int local186 = arg6[local125 + 1][local121] - arg6[local125 - 1][local121];
					@Pc(203) int local203 = arg6[local125][local121 + 1] - arg6[local125][local121 - 1];
					@Pc(222) float local222 = (float) (1.0D / Math.sqrt((double) (arg7 * arg7 * 4 + local186 * local186 + local203 * local203)));
					this.aFloatArrayArray6[local125][local121] = local222 * (float) local186;
					this.aFloatArrayArray7[local125][local121] = (float) (-arg7 * 2) * local222;
					this.aFloatArrayArray5[local125][local121] = (float) local203 * local222;
				}
			}
		}
		this.aFloat183++;
		this.aFloat182--;
		this.aClass90_21 = new Class90(128);
		if ((this.anInt6457 & 0x10) != 0) {
			this.aClass47_1 = new Class47(this.aClass162_Sub1_17, this);
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method7673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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
		this.O(arg0, arg1, local13, local47, local18, local56, local23, local28, local33, local38, arg13, arg14, arg15, false);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method7678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method5388(arg1, arg4, arg3, arg2, arg5, arg0);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7677(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt6459 <= 0) {
			return;
		}
		@Pc(19) Interface13 local19 = this.aClass162_Sub1_17.method3860(this.anInt6441);
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = 32767;
		@Pc(25) int local25 = -32768;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			local21 = 0;
			@Pc(36) Buffer local36 = local19.method7034();
			if (local36 != null) {
				@Pc(44) Stream local44 = this.aClass162_Sub1_17.method3907(local36);
				@Pc(48) int local48;
				@Pc(57) int local57;
				@Pc(59) int local59;
				@Pc(77) short[] local77;
				@Pc(81) int local81;
				@Pc(89) int local89;
				if (Stream.b()) {
					for (local48 = arg1; local48 < arg3; local48++) {
						local57 = arg0 + super.anInt9572 * local48;
						for (local59 = arg0; local59 < arg2; local59++) {
							if (arg4[local59 - arg0][local48 - arg1]) {
								local77 = this.aShortArrayArray13[local57];
								if (local77 != null) {
									for (local81 = 0; local81 < local77.length; local81++) {
										local89 = local77[local81] & 0xFFFF;
										if (local25 < local89) {
											local25 = local89;
										}
										local21++;
										if (local23 > local89) {
											local23 = local89;
										}
										local44.e(local89);
									}
								}
							}
							local57++;
						}
					}
				} else {
					for (local48 = arg1; local48 < arg3; local48++) {
						local57 = arg0 + local48 * super.anInt9572;
						for (local59 = arg0; local59 < arg2; local59++) {
							if (arg4[local59 - arg0][local48 - arg1]) {
								local77 = this.aShortArrayArray13[local57];
								if (local77 != null) {
									for (local81 = 0; local81 < local77.length; local81++) {
										local89 = local77[local81] & 0xFFFF;
										local44.b(local89);
										local21++;
										if (local23 > local89) {
											local23 = local89;
										}
										if (local25 < local89) {
											local25 = local89;
										}
									}
								}
							}
							local57++;
						}
					}
				}
				local44.c();
				if (local19.method7033()) {
					break;
				}
			}
		}
		if (local21 <= 0) {
			return;
		}
		this.aClass162_Sub1_17.method3858();
		this.aClass162_Sub1_17.method3958(false);
		this.aClass162_Sub1_17.method3836(false);
		this.aClass162_Sub1_17.method3829(false);
		this.aClass162_Sub1_17.method3940(false);
		this.aClass162_Sub1_17.method3957(0);
		this.aClass162_Sub1_17.method3943(false, -2, false);
		this.aClass162_Sub1_17.method3865(null);
		@Pc(267) Class25_Sub2 local267 = this.aClass162_Sub1_17.method3868();
		@Pc(272) float[] local272 = this.aClass162_Sub1_17.method3923();
		local272[15] = 1.0F;
		local272[12] = -1.0F - ((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass162_Sub1_17.anInt4500;
		local272[8] = 0.0F;
		local272[10] = 1.0F / (this.aFloat183 - this.aFloat182);
		local272[5] = (float) 1024 / ((float) this.aClass162_Sub1_17.anInt4487 * 128.0F * (float) super.anInt9573);
		local272[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass162_Sub1_17.anInt4487;
		local272[2] = 0.0F;
		local272[11] = 0.0F;
		local272[9] = 0.0F;
		local272[6] = 0.0F;
		local272[1] = 0.0F;
		local272[0] = (float) 1024 / ((float) super.anInt9573 * 128.0F * (float) this.aClass162_Sub1_17.anInt4500);
		local272[4] = 0.0F;
		local272[7] = 0.0F;
		local272[14] = -this.aFloat182 / (this.aFloat183 - this.aFloat182);
		local272[3] = 0.0F;
		local267.method2702(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
		this.aClass162_Sub1_17.method3915();
		this.aClass162_Sub1_17.method3825();
		if ((this.anInt6457 & 0x7) == 0) {
			this.aClass162_Sub1_17.method3836(false);
		} else {
			this.aClass162_Sub1_17.method3836(true);
			this.aClass162_Sub1_17.method3933();
		}
		this.aClass162_Sub1_17.method3894(false);
		this.aClass162_Sub1_17.method3954(this.anInterface8_12, 0);
		this.aClass162_Sub1_17.method3954(this.anInterface8_11, 1);
		this.aClass162_Sub1_17.method3882(this.aClass59_19);
		this.aClass162_Sub1_17.method3892(0, local25 + 1 - local23, Static523.aClass155_6, local21 / 3, local19, local23);
		this.aClass162_Sub1_17.method3894(true);
	}

	@OriginalMember(owner = "client!om", name = "v", descriptor = "(IILclient!ha;)Lclient!ha;")
	@Override
	public Class2_Sub2_Sub8 v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub2_Sub8 arg2) {
		if ((this.aByteArrayArray13[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt9573 >> this.aClass162_Sub1_17.anInt4621;
		@Pc(27) Class2_Sub2_Sub8_Sub1 local27 = (Class2_Sub2_Sub8_Sub1) arg2;
		@Pc(37) Class2_Sub2_Sub8_Sub1 local37;
		if (local27 != null && local27.method6468(local24, local24)) {
			local37 = local27;
			local27.method6472();
		} else {
			local37 = new Class2_Sub2_Sub8_Sub1(this.aClass162_Sub1_17, local24, local24);
		}
		local37.method6465(local24, 0, local24, 0);
		this.method5392(arg1, local37, arg0);
		return local37;
	}

	@OriginalMember(owner = "client!om", name = "E", descriptor = "(Lclient!ha;IIIIZ)V")
	@Override
	public void E(@OriginalArg(0) Class2_Sub2_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass47_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass162_Sub1_17.anInt4609 >> 8) >> this.aClass162_Sub1_17.anInt4621;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass162_Sub1_17.anInt4597 >> 8) >> this.aClass162_Sub1_17.anInt4621;
			this.aClass47_1.method949(arg0, local24, local39);
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method7681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method5388(arg1, arg4, arg3, arg2, -1, arg0);
	}

	@OriginalMember(owner = "client!om", name = "BA", descriptor = "()V")
	@Override
	public void BA() {
		if (this.anInt6459 > 0) {
			@Pc(21) byte[][] local21 = new byte[super.anInt9572 + 1][super.anInt9574 + 1];
			for (@Pc(23) int local23 = 1; local23 < super.anInt9572; local23++) {
				for (@Pc(27) int local27 = 1; super.anInt9574 > local27; local27++) {
					local21[local23][local27] = (byte) ((this.aByteArrayArray14[local23][local27] >> 1) + (this.aByteArrayArray14[local23][local27 + 1] >> 3) + (this.aByteArrayArray14[local23 + -1][local27] >> 2) + (this.aByteArrayArray14[local23 + 1][local27] >> 3) + (this.aByteArrayArray14[local23][local27 - 1] >> 2));
				}
			}
			@Pc(107) Class2_Sub42[] local107 = new Class2_Sub42[this.aClass90_21.method1679()];
			this.aClass90_21.method1677(local107);
			for (@Pc(115) int local115 = 0; local115 < local107.length; local115++) {
				local107[local115].method6070(this.anInt6459);
			}
			@Pc(131) int local131 = 20;
			if (this.anIntArrayArrayArray11 != null) {
				local131 += 4;
			}
			if ((this.anInt6457 & 0x7) != 0) {
				local131 += 12;
			}
			@Pc(154) NativeHeapBuffer local154 = this.aClass162_Sub1_17.aNativeHeap5.a(this.anInt6459 * 4, false);
			@Pc(164) NativeHeapBuffer local164 = this.aClass162_Sub1_17.aNativeHeap5.a(this.anInt6459 * local131, false);
			@Pc(169) Stream local169 = new Stream(local164);
			@Pc(174) Stream local174 = new Stream(local154);
			@Pc(178) Class2_Sub42[] local178 = new Class2_Sub42[this.anInt6459];
			@Pc(185) int local185 = Static511.method7273(this.anInt6459 / 4);
			if (local185 < 1) {
				local185 = 1;
			}
			@Pc(195) Class90 local195 = new Class90(local185);
			@Pc(199) Class2_Sub42[] local199 = new Class2_Sub42[this.anInt6458];
			@Pc(205) int local205;
			for (@Pc(201) int local201 = 0; local201 < super.anInt9572; local201++) {
				for (local205 = 0; super.anInt9574 > local205; local205++) {
					if (this.anIntArrayArrayArray12[local201][local205] != null) {
						@Pc(221) Class2_Sub42[] local221 = this.aClass2_Sub42ArrayArrayArray1[local201][local205];
						@Pc(228) int[] local228 = this.anIntArrayArrayArray8[local201][local205];
						@Pc(235) int[] local235 = this.anIntArrayArrayArray13[local201][local205];
						@Pc(242) int[] local242 = this.anIntArrayArrayArray9[local201][local205];
						@Pc(249) int[] local249 = this.anIntArrayArrayArray12[local201][local205];
						@Pc(261) int[] local261 = this.anIntArrayArrayArray10 == null ? null : this.anIntArrayArrayArray10[local201][local205];
						if (local242 == null) {
							local242 = local249;
						}
						@Pc(277) int[] local277 = this.anIntArrayArrayArray11 == null ? null : this.anIntArrayArrayArray11[local201][local205];
						@Pc(284) float local284 = this.aFloatArrayArray6[local201][local205];
						@Pc(291) float local291 = this.aFloatArrayArray7[local201][local205];
						@Pc(298) float local298 = this.aFloatArrayArray5[local201][local205];
						@Pc(307) float local307 = this.aFloatArrayArray6[local201][local205 + 1];
						@Pc(316) float local316 = this.aFloatArrayArray7[local201][local205 + 1];
						@Pc(325) float local325 = this.aFloatArrayArray5[local201][local205 + 1];
						@Pc(336) float local336 = this.aFloatArrayArray6[local201 + 1][local205 + 1];
						@Pc(347) float local347 = this.aFloatArrayArray7[local201 + 1][local205 + 1];
						@Pc(358) float local358 = this.aFloatArrayArray5[local201 + 1][local205 + 1];
						@Pc(367) float local367 = this.aFloatArrayArray6[local201 + 1][local205];
						@Pc(376) float local376 = this.aFloatArrayArray7[local201 + 1][local205];
						@Pc(385) float local385 = this.aFloatArrayArray5[local201 + 1][local205];
						@Pc(393) int local393 = local21[local201][local205] & 0xFF;
						@Pc(403) int local403 = local21[local201][local205 + 1] & 0xFF;
						@Pc(415) int local415 = local21[local201 + 1][local205 + 1] & 0xFF;
						@Pc(425) int local425 = local21[local201 + 1][local205] & 0xFF;
						@Pc(427) int local427 = 0;
						@Pc(437) int local437;
						label355: for (@Pc(429) int local429 = 0; local429 < local249.length; local429++) {
							@Pc(435) Class2_Sub42 local435 = local221[local429];
							for (local437 = 0; local437 < local427; local437++) {
								if (local435 == local199[local437]) {
									continue label355;
								}
							}
							local199[local427++] = local435;
						}
						@Pc(478) short[] local478 = this.aShortArrayArray13[local201 + local205 * super.anInt9572] = new short[local249.length];
						for (local437 = 0; local437 < local249.length; local437++) {
							@Pc(491) int local491 = (local201 << super.anInt9568) + local228[local437];
							@Pc(500) int local500 = (local205 << super.anInt9568) + local235[local437];
							@Pc(505) int local505 = local491 >> this.anInt6445;
							@Pc(510) int local510 = local500 >> this.anInt6445;
							@Pc(514) int local514 = local249[local437];
							@Pc(518) int local518 = local242[local437];
							@Pc(526) int local526 = local261 == null ? 0 : local261[local437];
							@Pc(544) long local544 = (long) local510 | (long) (local505 << 16) | (long) local514 << 32 | (long) local518 << 48;
							@Pc(548) int local548 = local228[local437];
							@Pc(552) int local552 = local235[local437];
							@Pc(554) byte local554 = 74;
							@Pc(556) int local556 = 0;
							@Pc(571) float local571;
							@Pc(573) float local573;
							@Pc(569) float local569;
							@Pc(665) float local665;
							@Pc(567) int local567;
							if (local548 == 0 && local552 == 0) {
								local567 = local554 - local393;
								local569 = local298;
								local571 = local284;
								local573 = local291;
							} else if (local548 == 0 && local552 == super.anInt9573) {
								local571 = local307;
								local567 = local554 - local403;
								local569 = local325;
								local573 = local316;
							} else if (super.anInt9573 == local548 && super.anInt9573 == local552) {
								local569 = local358;
								local571 = local336;
								local573 = local347;
								local567 = local554 - local415;
							} else if (super.anInt9573 == local548 && local552 == 0) {
								local571 = local367;
								local573 = local376;
								local567 = local554 - local425;
								local569 = local385;
							} else {
								@Pc(641) float local641 = (float) local548 / (float) super.anInt9573;
								@Pc(648) float local648 = (float) local552 / (float) super.anInt9573;
								@Pc(657) float local657 = local641 * (local367 - local284) + local284;
								local665 = local641 * (local376 - local291) + local291;
								@Pc(673) float local673 = local298 + (local385 - local298) * local641;
								@Pc(681) float local681 = (local336 - local307) * local641 + local307;
								@Pc(689) float local689 = local316 + (local347 - local316) * local641;
								local573 = local665 + local648 * (local689 - local665);
								@Pc(705) float local705 = local325 + (local358 - local325) * local641;
								local571 = local657 + local648 * (local681 - local657);
								local569 = local648 * (local705 - local673) + local673;
								@Pc(732) int local732 = ((local425 - local393) * local548 >> super.anInt9568) + local393;
								@Pc(743) int local743 = ((local415 - local403) * local548 >> super.anInt9568) + local403;
								local567 = local554 - ((local743 - local732) * local552 >> super.anInt9568) - local732;
							}
							@Pc(771) float local771 = 1.0F;
							if (local514 != -1) {
								@Pc(782) int local782 = local567 * (local514 & 0x7F) >> 7;
								if (local782 < 2) {
									local782 = 2;
								} else if (local782 > 126) {
									local782 = 126;
								}
								local556 = Static142.anIntArray365[local782 | local514 & 0xFF80];
								if ((this.anInt6457 & 0x7) == 0) {
									local771 = local571 * this.aClass162_Sub1_17.aFloatArray39[0] + local573 * this.aClass162_Sub1_17.aFloatArray39[1] + this.aClass162_Sub1_17.aFloatArray39[2] * local569;
									local771 = this.aClass162_Sub1_17.aFloat144 + (local771 > 0.0F ? this.aClass162_Sub1_17.aFloat140 : this.aClass162_Sub1_17.aFloat142) * local771;
								}
							}
							@Pc(856) Class2 local856 = null;
							if ((local491 & this.anInt6444 - 1) == 0 && (local500 & this.anInt6444 - 1) == 0) {
								local856 = local195.method1685(local544);
							}
							@Pc(892) int local892;
							@Pc(922) int local922;
							if (local856 == null) {
								if (local514 == local518) {
									local922 = local556;
								} else {
									@Pc(932) int local932 = local567 * (local518 & 0x7F) >> 7;
									if (local932 < 2) {
										local932 = 2;
									} else if (local932 > 126) {
										local932 = 126;
									}
									local922 = Static142.anIntArray365[local518 & 0xFF80 | local932];
									if ((this.anInt6457 & 0x7) == 0) {
										@Pc(987) float local987 = this.aClass162_Sub1_17.aFloatArray39[1] * local573 + this.aClass162_Sub1_17.aFloatArray39[0] * local571 + this.aClass162_Sub1_17.aFloatArray39[2] * local569;
										local665 = (local771 > 0.0F ? this.aClass162_Sub1_17.aFloat140 : this.aClass162_Sub1_17.aFloat142) * local771 + this.aClass162_Sub1_17.aFloat144;
										@Pc(1012) int local1012 = local922 >> 16 & 0xFF;
										@Pc(1018) int local1018 = local922 >> 8 & 0xFF;
										@Pc(1022) int local1022 = local922 & 0xFF;
										local1012 = (int) ((float) local1012 * local665);
										local1018 = (int) ((float) local1018 * local665);
										if (local1012 < 0) {
											local1012 = 0;
										} else if (local1012 > 255) {
											local1012 = 255;
										}
										local1022 = (int) ((float) local1022 * local665);
										if (local1018 < 0) {
											local1018 = 0;
										} else if (local1018 > 255) {
											local1018 = 255;
										}
										if (local1022 < 0) {
											local1022 = 0;
										} else if (local1022 > 255) {
											local1022 = 255;
										}
										local922 = local1018 << 8 | local1012 << 16 | local1022;
									}
								}
								if (Stream.b()) {
									local169.a((float) local491);
									local169.a((float) (this.method7680(local491, local500) + local526));
									local169.a((float) local500);
									local169.a((float) local491);
									local169.a((float) local500);
									if (this.anIntArrayArrayArray11 != null) {
										local169.a((float) (local277 == null ? 0 : local277[local437] - 1));
									}
									if ((this.anInt6457 & 0x7) != 0) {
										local169.a(local571);
										local169.a(local573);
										local169.a(local569);
									}
								} else {
									local169.b((float) local491);
									local169.b((float) (this.method7680(local491, local500) + local526));
									local169.b((float) local500);
									local169.b((float) local491);
									local169.b((float) local500);
									if (this.anIntArrayArrayArray11 != null) {
										local169.b((float) (local277 == null ? 0 : local277[local437] - 1));
									}
									if ((this.anInt6457 & 0x7) != 0) {
										local169.b(local571);
										local169.b(local573);
										local169.b(local569);
									}
								}
								if (this.aClass162_Sub1_17.anInt4620 == 0) {
									local174.f(local922 | 0xFF000000);
								} else {
									local174.c(local922 | 0xFF000000);
								}
								local892 = this.anInt6435++;
								local478[local437] = (short) local892;
								if (local514 != -1) {
									local178[local892] = local221[local437];
								}
								local195.method1684(new Class2_Sub43(local478[local437]), local544);
							} else {
								local478[local437] = ((Class2_Sub43) local856).aShort96;
								local892 = local478[local437] & 0xFFFF;
								if (local514 != -1 && local178[local892].aLong268 > local221[local437].aLong268) {
									local178[local892] = local221[local437];
								}
							}
							for (local922 = 0; local922 < local427; local922++) {
								local199[local922].method6074(local771, local892, local556, local567);
							}
							this.anInt6441++;
						}
					}
				}
			}
			for (local205 = 0; local205 < this.anInt6435; local205++) {
				@Pc(1311) Class2_Sub42 local1311 = local178[local205];
				if (local1311 != null) {
					local1311.method6067(local205);
				}
			}
			@Pc(1328) int local1328;
			@Pc(1346) int local1346;
			for (@Pc(1324) int local1324 = 0; local1324 < super.anInt9572; local1324++) {
				for (local1328 = 0; super.anInt9574 > local1328; local1328++) {
					@Pc(1340) short[] local1340 = this.aShortArrayArray13[local1324 + super.anInt9572 * local1328];
					if (local1340 != null) {
						@Pc(1344) int local1344 = 0;
						local1346 = 0;
						while (local1340.length > local1346) {
							@Pc(1355) int local1355 = local1340[local1346++] & 0xFFFF;
							@Pc(1362) int local1362 = local1340[local1346++] & 0xFFFF;
							@Pc(1369) int local1369 = local1340[local1346++] & 0xFFFF;
							@Pc(1373) Class2_Sub42 local1373 = local178[local1355];
							@Pc(1377) Class2_Sub42 local1377 = local178[local1362];
							@Pc(1381) Class2_Sub42 local1381 = local178[local1369];
							@Pc(1383) Class2_Sub42 local1383 = null;
							if (local1373 != null) {
								local1373.method6066(local1324, local1344, local1328);
								local1383 = local1373;
							}
							if (local1377 != null) {
								local1377.method6066(local1324, local1344, local1328);
								if (local1383 == null || local1377.aLong268 < local1383.aLong268) {
									local1383 = local1377;
								}
							}
							if (local1381 != null) {
								local1381.method6066(local1324, local1344, local1328);
								if (local1383 == null || local1383.aLong268 > local1381.aLong268) {
									local1383 = local1381;
								}
							}
							if (local1383 != null) {
								if (local1373 != null) {
									local1383.method6067(local1355);
								}
								if (local1377 != null) {
									local1383.method6067(local1362);
								}
								if (local1381 != null) {
									local1383.method6067(local1369);
								}
								local1383.method6066(local1324, local1344, local1328);
							}
							local1344++;
						}
					}
				}
			}
			local169.c();
			local174.c();
			this.anInterface8_11 = this.aClass162_Sub1_17.method3826(false);
			this.anInterface8_11.method5366(4, local154, this.anInt6435 * 4);
			this.anInterface8_12 = this.aClass162_Sub1_17.method3826(false);
			this.anInterface8_12.method5366(local131, local164, this.anInt6435 * local131);
			if ((this.anInt6457 & 0x7) == 0) {
				if (this.anIntArrayArrayArray11 == null) {
					this.aClass59_19 = this.aClass162_Sub1_17.method3935(new Class76[] { new Class76(new Class341[] { Static545.aClass341_1, Static545.aClass341_5 }), new Class76(Static545.aClass341_3) });
				} else {
					this.aClass59_19 = this.aClass162_Sub1_17.method3935(new Class76[] { new Class76(new Class341[] { Static545.aClass341_1, Static545.aClass341_5, Static545.aClass341_4 }), new Class76(Static545.aClass341_3) });
				}
			} else if (this.anIntArrayArrayArray11 == null) {
				this.aClass59_19 = this.aClass162_Sub1_17.method3935(new Class76[] { new Class76(new Class341[] { Static545.aClass341_1, Static545.aClass341_5, Static545.aClass341_2 }), new Class76(Static545.aClass341_3) });
			} else {
				this.aClass59_19 = this.aClass162_Sub1_17.method3935(new Class76[] { new Class76(new Class341[] { Static545.aClass341_1, Static545.aClass341_5, Static545.aClass341_4, Static545.aClass341_2 }), new Class76(Static545.aClass341_3) });
			}
			local1328 = 0;
			for (@Pc(1682) int local1682 = 0; local1682 < local107.length; local1682++) {
				if (local107[local1682].anInt7544 > 0) {
					local107[local1328++] = local107[local1682];
				}
			}
			this.aClass2_Sub42Array1 = new Class2_Sub42[local1328];
			@Pc(1708) long[] local1708 = new long[local1328];
			for (local1346 = 0; local1346 < local1328; local1346++) {
				@Pc(1716) Class2_Sub42 local1716 = local107[local1346];
				local1708[local1346] = local1716.aLong268;
				this.aClass2_Sub42Array1[local1346] = local1716;
				local1716.method6069(this.anInt6435);
			}
			Static517.method6674(this.aClass2_Sub42Array1, local1708);
			if (this.aClass47_1 != null) {
				this.aClass47_1.method946();
			}
		} else {
			this.aClass47_1 = null;
		}
		this.aClass2_Sub42ArrayArrayArray1 = null;
		this.aByteArrayArray14 = null;
		this.anIntArrayArrayArray10 = null;
		this.anIntArrayArrayArray12 = null;
		this.anIntArrayArrayArray9 = null;
		this.aFloatArrayArray6 = this.aFloatArrayArray7 = this.aFloatArrayArray5 = null;
		this.anIntArrayArrayArray11 = null;
		this.anIntArrayArrayArray8 = this.anIntArrayArrayArray13 = null;
		this.aClass90_21 = null;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!ha;IIIIZ)Z")
	@Override
	public boolean method7675(@OriginalArg(0) Class2_Sub2_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass47_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (this.aClass162_Sub1_17.anInt4609 * arg2 >> 8) >> this.aClass162_Sub1_17.anInt4621;
			@Pc(40) int local40 = arg3 - (arg2 * this.aClass162_Sub1_17.anInt4597 >> 8) >> this.aClass162_Sub1_17.anInt4621;
			return this.aClass47_1.method945(local40, local25, arg0);
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIZ[[ZIII)V")
	private void method5388(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (this.aClass2_Sub42Array1 == null) {
			return;
		}
		@Pc(19) int local19 = arg3 + arg3 + 1;
		@Pc(23) int local23 = local19 * local19;
		if (Static13.anIntArray417.length < local23) {
			Static13.anIntArray417 = new int[local23];
		}
		@Pc(39) int local39 = arg5 - arg3;
		@Pc(41) int local41 = local39;
		if (local39 < 0) {
			local39 = 0;
		}
		@Pc(50) int local50 = arg0 - arg3;
		@Pc(52) int local52 = local50;
		if (local50 < 0) {
			local50 = 0;
		}
		@Pc(64) int local64 = arg5 + arg3;
		if (super.anInt9572 - 1 < local64) {
			local64 = super.anInt9572 - 1;
		}
		@Pc(79) int local79 = arg3 + arg0;
		if (super.anInt9574 - 1 < local79) {
			local79 = super.anInt9574 - 1;
		}
		Static95.anInt1700 = 0;
		for (@Pc(94) int local94 = local39; local94 <= local64; local94++) {
			@Pc(103) boolean[] local103 = arg2[local94 - local41];
			for (@Pc(105) int local105 = local50; local105 <= local79; local105++) {
				if (local103[local105 - local52]) {
					Static13.anIntArray417[Static95.anInt1700++] = super.anInt9572 * local105 + local94;
				}
			}
		}
		if (arg4 == -1) {
			this.aClass162_Sub1_17.method3832();
		} else {
			this.aClass162_Sub1_17.method3905((float) arg4);
			this.aClass162_Sub1_17.method3914();
		}
		this.aClass162_Sub1_17.method3952();
		this.aClass162_Sub1_17.method3836((this.anInt6457 & 0x7) != 0);
		this.aClass162_Sub1_17.method3943(false, -1, false);
		this.aClass162_Sub1_17.method3954(this.anInterface8_12, 0);
		for (@Pc(193) int local193 = 0; local193 < this.aClass2_Sub42Array1.length; local193++) {
			this.aClass2_Sub42Array1[local193].method6073(Static95.anInt1700, Static13.anIntArray417);
		}
		@Pc(216) Class25_Sub2 local216 = this.aClass162_Sub1_17.method3868();
		local216.NA(0, -1, 0);
		this.aClass162_Sub1_17.method3825();
		if (!this.aClass70_42.method1263()) {
			@Pc(236) int local236 = this.aClass162_Sub1_17.anInt4625;
			@Pc(240) int local240 = this.aClass162_Sub1_17.anInt4604;
			this.aClass162_Sub1_17.pa(0, local240, this.aClass162_Sub1_17.anInt4608);
			this.aClass162_Sub1_17.method3836(false);
			this.aClass162_Sub1_17.method3940(false);
			this.aClass162_Sub1_17.method3957(128);
			this.aClass162_Sub1_17.method3943(false, -2, false);
			this.aClass162_Sub1_17.method3865(this.aClass162_Sub1_17.anInterface20_3);
			this.aClass162_Sub1_17.method3867(Static460.aClass247_4, Static317.aClass247_2);
			this.aClass162_Sub1_17.method3885(Static504.aClass263_4, 0);
			this.aClass162_Sub1_17.method3877(0, Static491.aClass263_3);
			for (@Pc(300) Class2 local300 = this.aClass70_42.method1264(); local300 != null; local300 = this.aClass70_42.method1261()) {
				@Pc(305) Class2_Sub19 local305 = (Class2_Sub19) local300;
				local305.method2510(arg3, arg2, arg5, arg0);
			}
			this.aClass162_Sub1_17.method3885(Static191.aClass263_2, 0);
			this.aClass162_Sub1_17.method3877(0, Static191.aClass263_2);
			this.aClass162_Sub1_17.method3865(null);
			this.aClass162_Sub1_17.pa(local236, local240, this.aClass162_Sub1_17.anInt4608);
		}
		if (this.aClass47_1 == null) {
			return;
		}
		this.aClass162_Sub1_17.method3954(this.anInterface8_12, 0);
		this.aClass162_Sub1_17.method3954(this.anInterface8_11, 1);
		this.aClass162_Sub1_17.method3882(this.aClass59_19);
		this.aClass47_1.method950(arg0, arg5, arg3, arg2, arg1);
		return;
	}

	@OriginalMember(owner = "client!om", name = "DA", descriptor = "(Lclient!ha;IIIIZ)V")
	@Override
	public void DA(@OriginalArg(0) Class2_Sub2_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass47_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass162_Sub1_17.anInt4609 * arg2 >> 8) >> this.aClass162_Sub1_17.anInt4621;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass162_Sub1_17.anInt4597 >> 8) >> this.aClass162_Sub1_17.anInt4621;
			this.aClass47_1.method951(local24, arg0, local39);
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(II)V")
	@Override
	public void method7682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(III)V")
	@Override
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray14[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray14[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!om", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray11 == null) {
			this.anIntArrayArrayArray11 = new int[super.anInt9572][super.anInt9574][];
		}
		if (arg3 != null && this.anIntArrayArrayArray10 == null) {
			this.anIntArrayArrayArray10 = new int[super.anInt9572][super.anInt9574][];
		}
		this.anIntArrayArrayArray8[arg0][arg1] = arg2;
		this.anIntArrayArrayArray13[arg0][arg1] = arg4;
		this.anIntArrayArrayArray12[arg0][arg1] = arg6;
		this.anIntArrayArrayArray9[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray11 != null) {
			this.anIntArrayArrayArray11[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray10 != null) {
			this.anIntArrayArrayArray10[arg0][arg1] = arg3;
		}
		@Pc(88) Class2_Sub42[] local88 = this.aClass2_Sub42ArrayArrayArray1[arg0][arg1] = new Class2_Sub42[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) arg8[local90] | (long) (arg9[local90] << 14) | (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28;
			@Pc(125) Class2 local125;
			for (local125 = this.aClass90_21.method1685(local119); local125 != null; local125 = this.aClass90_21.method1682()) {
				@Pc(130) Class2_Sub42 local130 = (Class2_Sub42) local125;
				if (arg8[local90] == local130.anInt7555 && local130.aFloat193 == (float) arg9[local90] && arg10 == local130.anInt7547 && local130.anInt7546 == arg11 && arg12 == local130.anInt7551) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class2_Sub42(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass90_21.method1684(local88[local90], local119);
			} else {
				local88[local90] = (Class2_Sub42) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray13[arg0][arg1] = (byte) (this.aByteArrayArray13[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt6458) {
			this.anInt6458 = arg6.length;
		}
		this.anInt6459 += arg6.length;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!tg;[I)V")
	@Override
	public void method7674(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass70_42.method1269(new Class2_Sub19(this.aClass162_Sub1_17, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ILclient!sw;BI)V")
	private void method5392(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub2_Sub8_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray8[arg2][arg0];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray13[arg2][arg0];
		@Pc(22) int local22 = local12.length;
		if (local22 > Static388.anIntArray411.length) {
			Static388.anIntArray411 = new int[local22];
			Static562.anIntArray596 = new int[local22];
		}
		for (@Pc(38) int local38 = 0; local38 < local22; local38++) {
			Static388.anIntArray411[local38] = local12[local38] >> this.aClass162_Sub1_17.anInt4621;
			Static562.anIntArray596[local38] = local19[local38] >> this.aClass162_Sub1_17.anInt4621;
		}
		@Pc(66) int local66 = 0;
		while (local22 > local66) {
			@Pc(72) int local72 = Static388.anIntArray411[local66];
			@Pc(77) int local77 = Static562.anIntArray596[local66++];
			@Pc(81) int local81 = Static388.anIntArray411[local66];
			@Pc(86) int local86 = Static562.anIntArray596[local66++];
			@Pc(90) int local90 = Static388.anIntArray411[local66];
			@Pc(95) int local95 = Static562.anIntArray596[local66++];
			if (-((local86 - local77) * (local90 + -local81)) + (local72 - local81) * (local86 - local95) > 0) {
				arg1.method6467(local77, local81, local90, local72, local95, local86);
			}
		}
	}
}
