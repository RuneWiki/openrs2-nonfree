import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public final class Class104_Sub1 extends Class104 {

	@OriginalMember(owner = "client!ek", name = "n", descriptor = "I")
	private int anInt2630;

	@OriginalMember(owner = "client!ek", name = "q", descriptor = "I")
	private int anInt2633;

	@OriginalMember(owner = "client!ek", name = "C", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!ek", name = "V", descriptor = "I")
	private int anInt2648;

	@OriginalMember(owner = "client!ek", name = "X", descriptor = "I")
	private int anInt2649;

	@OriginalMember(owner = "client!ek", name = "ab", descriptor = "[Lclient!fk;")
	private Class3_Sub19[] aClass3_Sub19Array1;

	@OriginalMember(owner = "client!ek", name = "bb", descriptor = "Lclient!mha;")
	private Interface16 anInterface16_9;

	@OriginalMember(owner = "client!ek", name = "cb", descriptor = "Lclient!wp;")
	public Class277 aClass277_15;

	@OriginalMember(owner = "client!ek", name = "db", descriptor = "Lclient!mha;")
	private Interface16 anInterface16_10;

	@OriginalMember(owner = "client!ek", name = "s", descriptor = "F")
	private float aFloat76 = -3.4028235E38F;

	@OriginalMember(owner = "client!ek", name = "D", descriptor = "F")
	private float aFloat77 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!ek", name = "E", descriptor = "Lclient!jia;")
	private final Class193 aClass193_15 = new Class193();

	@OriginalMember(owner = "client!ek", name = "k", descriptor = "Lclient!sf;")
	public final Class16_Sub1 aClass16_Sub1_7;

	@OriginalMember(owner = "client!ek", name = "J", descriptor = "I")
	private final int anInt2644;

	@OriginalMember(owner = "client!ek", name = "Q", descriptor = "[[B")
	private final byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!ek", name = "S", descriptor = "[[[Lclient!fk;")
	private Class3_Sub19[][][] aClass3_Sub19ArrayArrayArray1;

	@OriginalMember(owner = "client!ek", name = "A", descriptor = "I")
	private final int anInt2640;

	@OriginalMember(owner = "client!ek", name = "U", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!ek", name = "Z", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!ek", name = "N", descriptor = "[[S")
	public final short[][] aShortArrayArray7;

	@OriginalMember(owner = "client!ek", name = "P", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!ek", name = "eb", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!ek", name = "R", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!ek", name = "M", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!ek", name = "Y", descriptor = "[[B")
	private byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!ek", name = "w", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!ek", name = "K", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!ek", name = "O", descriptor = "I")
	public final int anInt2646;

	@OriginalMember(owner = "client!ek", name = "W", descriptor = "Lclient!cja;")
	private Class62 aClass62_16;

	@OriginalMember(owner = "client!ek", name = "B", descriptor = "Lclient!cm;")
	private Class63 aClass63_1;

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lclient!sf;IIII[[I[[II)V")
	public Class104_Sub1(@OriginalArg(0) Class16_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass16_Sub1_7 = arg0;
		this.anInt2644 = super.anInt9717 - 2;
		this.aByteArrayArray2 = new byte[arg3][arg4];
		this.aClass3_Sub19ArrayArrayArray1 = new Class3_Sub19[arg3][arg4][];
		this.anInt2640 = 0x1 << this.anInt2644;
		this.aFloatArrayArray2 = new float[super.anInt9718 + 1][super.anInt9715 + 1];
		this.aFloatArrayArray3 = new float[super.anInt9718 + 1][super.anInt9715 + 1];
		this.aShortArrayArray7 = new short[arg4 * arg3][];
		this.anIntArrayArrayArray8 = new int[arg3][arg4][];
		this.aFloatArrayArray4 = new float[super.anInt9718 + 1][super.anInt9715 + 1];
		this.anIntArrayArrayArray9 = new int[arg3][arg4][];
		this.anIntArrayArrayArray7 = new int[arg3][arg4][];
		this.aByteArrayArray3 = new byte[arg3 + 1][arg4 + 1];
		this.anIntArrayArrayArray4 = new int[arg3][arg4][];
		this.anIntArrayArrayArray6 = new int[arg3][arg4][];
		this.anInt2646 = arg2;
		for (@Pc(121) int local121 = 0; local121 <= super.anInt9715; local121++) {
			for (@Pc(125) int local125 = 0; local125 <= super.anInt9718; local125++) {
				@Pc(134) int local134 = super.anIntArrayArray102[local125][local121];
				if ((float) local134 > this.aFloat76) {
					this.aFloat76 = (float) local134;
				}
				if (this.aFloat77 > (float) local134) {
					this.aFloat77 = (float) local134;
				}
				if (local125 > 0 && local121 > 0 && super.anInt9718 > local125 && local121 < super.anInt9715) {
					@Pc(187) int local187 = arg6[local125 + 1][local121] - arg6[local125 - 1][local121];
					@Pc(203) int local203 = arg6[local125][local121 + 1] - arg6[local125][local121 - 1];
					@Pc(223) float local223 = (float) (1.0D / Math.sqrt((double) (local187 * local187 + arg7 * arg7 * 4 + local203 * local203)));
					this.aFloatArrayArray4[local125][local121] = local223 * (float) local187;
					this.aFloatArrayArray3[local125][local121] = (float) (-arg7 * 2) * local223;
					this.aFloatArrayArray2[local125][local121] = local223 * (float) local203;
				}
			}
		}
		this.aFloat76++;
		this.aFloat77--;
		this.aClass62_16 = new Class62(128);
		if ((this.anInt2646 & 0x10) != 0) {
			this.aClass63_1 = new Class63(this.aClass16_Sub1_7, this);
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method8280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(BIZIIII[[Z)V")
	private void method2417(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean[][] arg6) {
		if (this.aClass3_Sub19Array1 == null) {
			return;
		}
		@Pc(14) int local14 = arg3 + arg3 + 1;
		@Pc(18) int local18 = local14 * local14;
		if (Static553.anIntArray583.length < local18) {
			Static553.anIntArray583 = new int[local18];
		}
		@Pc(33) int local33 = arg0 - arg3;
		@Pc(35) int local35 = local33;
		if (local33 < 0) {
			local33 = 0;
		}
		@Pc(44) int local44 = arg4 - arg3;
		@Pc(46) int local46 = local44;
		if (local44 < 0) {
			local44 = 0;
		}
		@Pc(54) int local54 = arg3 + arg0;
		if (local54 > super.anInt9718 - 1) {
			local54 = super.anInt9718 - 1;
		}
		@Pc(73) int local73 = arg4 + arg3;
		if (super.anInt9715 - 1 < local73) {
			local73 = super.anInt9715 - 1;
		}
		Static50.anInt1347 = 0;
		for (@Pc(92) int local92 = local33; local92 <= local54; local92++) {
			@Pc(101) boolean[] local101 = arg6[local92 - local35];
			for (@Pc(103) int local103 = local44; local103 <= local73; local103++) {
				if (local101[local103 - local46]) {
					Static553.anIntArray583[Static50.anInt1347++] = local92 + super.anInt9718 * local103;
				}
			}
		}
		if (arg5 == -1) {
			this.aClass16_Sub1_7.method6267();
		} else {
			this.aClass16_Sub1_7.method6286((float) arg5);
			this.aClass16_Sub1_7.method6290();
		}
		this.aClass16_Sub1_7.method6279();
		this.aClass16_Sub1_7.method6260((this.anInt2646 & 0x7) != 0);
		this.aClass16_Sub1_7.method6264(-1, false, false);
		this.aClass16_Sub1_7.method6257(0, this.anInterface16_10);
		for (@Pc(193) int local193 = 0; local193 < this.aClass3_Sub19Array1.length; local193++) {
			this.aClass3_Sub19Array1[local193].method2801(Static553.anIntArray583, Static50.anInt1347);
		}
		@Pc(214) Class25_Sub3 local214 = this.aClass16_Sub1_7.method6207();
		local214.method4303(0, -1, 0);
		this.aClass16_Sub1_7.method6256();
		if (!this.aClass193_15.method4454()) {
			@Pc(234) int local234 = this.aClass16_Sub1_7.anInt7449;
			@Pc(238) int local238 = this.aClass16_Sub1_7.anInt7457;
			this.aClass16_Sub1_7.L(0, local238, this.aClass16_Sub1_7.anInt7455);
			this.aClass16_Sub1_7.method6260(false);
			this.aClass16_Sub1_7.method6232(false);
			this.aClass16_Sub1_7.method6239(128);
			this.aClass16_Sub1_7.method6264(-2, false, false);
			this.aClass16_Sub1_7.method6197(this.aClass16_Sub1_7.anInterface3_3);
			this.aClass16_Sub1_7.method6241(Static19.aClass11_1, Static458.aClass11_4);
			this.aClass16_Sub1_7.method6284(Static262.aClass188_2, 0);
			this.aClass16_Sub1_7.method6326(0, Static317.aClass188_3);
			for (@Pc(298) Class3 local298 = this.aClass193_15.method4457(); local298 != null; local298 = this.aClass193_15.method4459()) {
				@Pc(303) Class3_Sub30 local303 = (Class3_Sub30) local298;
				local303.method4710(arg6, arg4, arg0, arg3);
			}
			this.aClass16_Sub1_7.method6284(Static70.aClass188_1, 0);
			this.aClass16_Sub1_7.method6326(0, Static70.aClass188_1);
			this.aClass16_Sub1_7.method6197((Interface3) null);
			this.aClass16_Sub1_7.L(local234, local238, this.aClass16_Sub1_7.anInt7455);
		}
		if (this.aClass63_1 != null) {
			this.aClass16_Sub1_7.method6257(0, this.anInterface16_10);
			this.aClass16_Sub1_7.method6257(1, this.anInterface16_9);
			this.aClass16_Sub1_7.method6287(this.aClass277_15);
			this.aClass63_1.method1769(arg6, arg4, arg3, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method8285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method2417(arg0, arg4, arg6, arg2, arg1, arg5, arg3);
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method8281(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt2649 <= 0) {
			return;
		}
		@Pc(16) Interface22 local16 = this.aClass16_Sub1_7.method6273(this.anInt2633);
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = 32767;
		@Pc(22) int local22 = -32768;
		for (@Pc(24) int local24 = 0; local24 < 4; local24++) {
			local18 = 0;
			@Pc(33) Buffer local33 = local16.method7739();
			if (local33 != null) {
				@Pc(41) Stream local41 = this.aClass16_Sub1_7.method6328(local33);
				@Pc(45) int local45;
				@Pc(55) int local55;
				@Pc(57) int local57;
				@Pc(76) short[] local76;
				@Pc(80) int local80;
				@Pc(88) int local88;
				if (Stream.c()) {
					for (local45 = arg1; local45 < arg3; local45++) {
						local55 = super.anInt9718 * local45 + arg0;
						for (local57 = arg0; local57 < arg2; local57++) {
							if (arg4[local57 - arg0][local45 - arg1]) {
								local76 = this.aShortArrayArray7[local55];
								if (local76 != null) {
									for (local80 = 0; local80 < local76.length; local80++) {
										local88 = local76[local80] & 0xFFFF;
										local18++;
										if (local88 < local20) {
											local20 = local88;
										}
										local41.e(local88);
										if (local88 > local22) {
											local22 = local88;
										}
									}
								}
							}
							local55++;
						}
					}
				} else {
					for (local45 = arg1; local45 < arg3; local45++) {
						local55 = arg0 + super.anInt9718 * local45;
						for (local57 = arg0; local57 < arg2; local57++) {
							if (arg4[local57 - arg0][local45 - arg1]) {
								local76 = this.aShortArrayArray7[local55];
								if (local76 != null) {
									for (local80 = 0; local80 < local76.length; local80++) {
										local88 = local76[local80] & 0xFFFF;
										if (local88 < local20) {
											local20 = local88;
										}
										local18++;
										if (local88 > local22) {
											local22 = local88;
										}
										local41.a(local88);
									}
								}
							}
							local55++;
						}
					}
				}
				local41.b();
				if (local16.method7738()) {
					break;
				}
			}
		}
		if (local18 <= 0) {
			return;
		}
		this.aClass16_Sub1_7.method6307();
		this.aClass16_Sub1_7.method6311(false);
		this.aClass16_Sub1_7.method6260(false);
		this.aClass16_Sub1_7.method6199(false);
		this.aClass16_Sub1_7.method6232(false);
		this.aClass16_Sub1_7.method6239(0);
		this.aClass16_Sub1_7.method6264(-2, false, false);
		this.aClass16_Sub1_7.method6197((Interface3) null);
		@Pc(277) Class25_Sub3 local277 = this.aClass16_Sub1_7.method6207();
		@Pc(282) float[] local282 = this.aClass16_Sub1_7.method6294();
		local282[9] = 0.0F;
		local282[10] = 1.0F / (this.aFloat76 - this.aFloat77);
		local282[7] = 0.0F;
		local282[11] = 0.0F;
		local282[1] = 0.0F;
		local282[4] = 0.0F;
		local282[6] = 0.0F;
		local282[12] = -1.0F - ((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass16_Sub1_7.anInt7431;
		local282[2] = 0.0F;
		local282[3] = 0.0F;
		local282[5] = (float) 1024 / ((float) super.anInt9716 * 128.0F * (float) this.aClass16_Sub1_7.anInt7430);
		local282[14] = -this.aFloat77 / (this.aFloat76 - this.aFloat77);
		local282[0] = (float) 1024 / ((float) this.aClass16_Sub1_7.anInt7431 * 128.0F * (float) super.anInt9716);
		local282[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass16_Sub1_7.anInt7430;
		local282[15] = 1.0F;
		local282[8] = 0.0F;
		local277.method4305(0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
		this.aClass16_Sub1_7.method6202();
		this.aClass16_Sub1_7.method6256();
		if ((this.anInt2646 & 0x7) == 0) {
			this.aClass16_Sub1_7.method6260(false);
		} else {
			this.aClass16_Sub1_7.method6260(true);
			this.aClass16_Sub1_7.method6223();
		}
		this.aClass16_Sub1_7.method6305(false);
		this.aClass16_Sub1_7.method6257(0, this.anInterface16_10);
		this.aClass16_Sub1_7.method6257(1, this.anInterface16_9);
		this.aClass16_Sub1_7.method6287(this.aClass277_15);
		this.aClass16_Sub1_7.method6306(local22 + 1 - local20, local16, Static425.aClass44_5, local18 / 3, local20, 0);
		this.aClass16_Sub1_7.method6305(true);
	}

	@OriginalMember(owner = "client!ek", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.anInt2649 <= 0) {
			this.aClass63_1 = null;
		} else {
			@Pc(23) byte[][] local23 = new byte[super.anInt9718 + 1][super.anInt9715 + 1];
			for (@Pc(25) int local25 = 1; local25 < super.anInt9718; local25++) {
				for (@Pc(29) int local29 = 1; super.anInt9715 > local29; local29++) {
					local23[local25][local29] = (byte) ((this.aByteArrayArray3[local25][local29] >> 1) + (this.aByteArrayArray3[local25][local29 + 1] >> 3) + (this.aByteArrayArray3[local25][local29 + -1] >> 2) + (this.aByteArrayArray3[local25 + 1][local29] >> 3) + (this.aByteArrayArray3[local25 + -1][local29] >> 2));
				}
			}
			@Pc(105) Class3_Sub19[] local105 = new Class3_Sub19[this.aClass62_16.method1688()];
			this.aClass62_16.method1687(local105);
			for (@Pc(113) int local113 = 0; local113 < local105.length; local113++) {
				local105[local113].method2796(this.anInt2649);
			}
			@Pc(129) int local129 = 20;
			if (this.anIntArrayArrayArray5 != null) {
				local129 += 4;
			}
			if ((this.anInt2646 & 0x7) != 0) {
				local129 += 12;
			}
			@Pc(152) NativeHeapBuffer local152 = this.aClass16_Sub1_7.aNativeHeap6.a(this.anInt2649 * 4, false);
			@Pc(162) NativeHeapBuffer local162 = this.aClass16_Sub1_7.aNativeHeap6.a(local129 * this.anInt2649, false);
			@Pc(167) Stream local167 = new Stream(local162);
			@Pc(172) Stream local172 = new Stream(local152);
			@Pc(176) Class3_Sub19[] local176 = new Class3_Sub19[this.anInt2649];
			@Pc(183) int local183 = Static675.method8723(this.anInt2649 / 4);
			if (local183 < 1) {
				local183 = 1;
			}
			@Pc(195) Class62 local195 = new Class62(local183);
			@Pc(199) Class3_Sub19[] local199 = new Class3_Sub19[this.anInt2648];
			@Pc(205) int local205;
			for (@Pc(201) int local201 = 0; super.anInt9718 > local201; local201++) {
				for (local205 = 0; super.anInt9715 > local205; local205++) {
					if (this.anIntArrayArrayArray6[local201][local205] != null) {
						@Pc(221) Class3_Sub19[] local221 = this.aClass3_Sub19ArrayArrayArray1[local201][local205];
						@Pc(228) int[] local228 = this.anIntArrayArrayArray9[local201][local205];
						@Pc(235) int[] local235 = this.anIntArrayArrayArray7[local201][local205];
						@Pc(242) int[] local242 = this.anIntArrayArrayArray4[local201][local205];
						@Pc(249) int[] local249 = this.anIntArrayArrayArray6[local201][local205];
						@Pc(261) int[] local261 = this.anIntArrayArrayArray8 == null ? null : this.anIntArrayArrayArray8[local201][local205];
						if (local242 == null) {
							local242 = local249;
						}
						@Pc(277) int[] local277 = this.anIntArrayArrayArray5 == null ? null : this.anIntArrayArrayArray5[local201][local205];
						@Pc(284) float local284 = this.aFloatArrayArray4[local201][local205];
						@Pc(291) float local291 = this.aFloatArrayArray3[local201][local205];
						@Pc(298) float local298 = this.aFloatArrayArray2[local201][local205];
						@Pc(307) float local307 = this.aFloatArrayArray4[local201][local205 + 1];
						@Pc(316) float local316 = this.aFloatArrayArray3[local201][local205 + 1];
						@Pc(325) float local325 = this.aFloatArrayArray2[local201][local205 + 1];
						@Pc(336) float local336 = this.aFloatArrayArray4[local201 + 1][local205 + 1];
						@Pc(347) float local347 = this.aFloatArrayArray3[local201 + 1][local205 + 1];
						@Pc(358) float local358 = this.aFloatArrayArray2[local201 + 1][local205 + 1];
						@Pc(367) float local367 = this.aFloatArrayArray4[local201 + 1][local205];
						@Pc(376) float local376 = this.aFloatArrayArray3[local201 + 1][local205];
						@Pc(385) float local385 = this.aFloatArrayArray2[local201 + 1][local205];
						@Pc(393) int local393 = local23[local201][local205] & 0xFF;
						@Pc(403) int local403 = local23[local201][local205 + 1] & 0xFF;
						@Pc(415) int local415 = local23[local201 + 1][local205 + 1] & 0xFF;
						@Pc(425) int local425 = local23[local201 + 1][local205] & 0xFF;
						@Pc(427) int local427 = 0;
						@Pc(437) int local437;
						label357: for (@Pc(429) int local429 = 0; local429 < local249.length; local429++) {
							@Pc(435) Class3_Sub19 local435 = local221[local429];
							for (local437 = 0; local437 < local427; local437++) {
								if (local435 == local199[local437]) {
									continue label357;
								}
							}
							local199[local427++] = local435;
						}
						@Pc(482) short[] local482 = this.aShortArrayArray7[super.anInt9718 * local205 + local201] = new short[local249.length];
						for (local437 = 0; local437 < local249.length; local437++) {
							@Pc(495) int local495 = (local201 << super.anInt9717) + local228[local437];
							@Pc(505) int local505 = (local205 << super.anInt9717) + local235[local437];
							@Pc(510) int local510 = local495 >> this.anInt2644;
							@Pc(515) int local515 = local505 >> this.anInt2644;
							@Pc(519) int local519 = local249[local437];
							@Pc(523) int local523 = local242[local437];
							@Pc(531) int local531 = local261 == null ? 0 : local261[local437];
							@Pc(549) long local549 = (long) local515 | (long) (local510 << 16) | (long) local523 << 48 | (long) local519 << 32;
							@Pc(553) int local553 = local228[local437];
							@Pc(557) int local557 = local235[local437];
							@Pc(559) byte local559 = 74;
							@Pc(561) int local561 = 0;
							@Pc(574) float local574;
							@Pc(570) float local570;
							@Pc(572) float local572;
							@Pc(646) float local646;
							@Pc(578) int local578;
							if (local553 == 0 && local557 == 0) {
								local570 = local291;
								local572 = local298;
								local574 = local284;
								local578 = local559 - local393;
							} else if (local553 == 0 && super.anInt9716 == local557) {
								local574 = local307;
								local572 = local325;
								local578 = local559 - local403;
								local570 = local316;
							} else if (local553 == super.anInt9716 && local557 == super.anInt9716) {
								local578 = local559 - local415;
								local572 = local358;
								local570 = local347;
								local574 = local336;
							} else if (super.anInt9716 == local553 && local557 == 0) {
								local572 = local385;
								local574 = local367;
								local570 = local376;
								local578 = local559 - local425;
							} else {
								@Pc(622) float local622 = (float) local553 / (float) super.anInt9716;
								@Pc(629) float local629 = (float) local557 / (float) super.anInt9716;
								@Pc(638) float local638 = local284 + local622 * (local367 - local284);
								local646 = (local376 - local291) * local622 + local291;
								@Pc(654) float local654 = local298 + (local385 - local298) * local622;
								@Pc(662) float local662 = local307 + local622 * (local336 - local307);
								@Pc(670) float local670 = local622 * (local347 - local316) + local316;
								local570 = local646 + (local670 - local646) * local629;
								local574 = local638 + local629 * (local662 - local638);
								@Pc(696) float local696 = (local358 - local325) * local622 + local325;
								local572 = local654 + local629 * (local696 - local654);
								@Pc(716) int local716 = (local553 * (local425 - local393) >> super.anInt9717) + local393;
								@Pc(727) int local727 = (local553 * (local415 - local403) >> super.anInt9717) + local403;
								local578 = local559 - (local557 * (local727 - local716) >> super.anInt9717) - local716;
							}
							@Pc(766) float local766 = 1.0F;
							if (local519 != -1) {
								@Pc(777) int local777 = (local519 & 0x7F) * local578 >> 7;
								if (local777 < 2) {
									local777 = 2;
								} else if (local777 > 126) {
									local777 = 126;
								}
								if ((this.anInt2646 & 0x7) == 0) {
									local766 = local570 * this.aClass16_Sub1_7.aFloatArray57[1] + this.aClass16_Sub1_7.aFloatArray57[0] * local574 + this.aClass16_Sub1_7.aFloatArray57[2] * local572;
									local766 = this.aClass16_Sub1_7.aFloat157 + local766 * (local766 > 0.0F ? this.aClass16_Sub1_7.aFloat164 : this.aClass16_Sub1_7.aFloat166);
								}
								local561 = Static274.anIntArray337[local777 | local519 & 0xFF80];
							}
							@Pc(851) Class3 local851 = null;
							if ((this.anInt2640 - 1 & local495) == 0 && (local505 & this.anInt2640 - 1) == 0) {
								local851 = local195.method1682(local549);
							}
							@Pc(887) int local887;
							@Pc(914) int local914;
							if (local851 == null) {
								if (local519 == local523) {
									local914 = local561;
								} else {
									@Pc(924) int local924 = (local523 & 0x7F) * local578 >> 7;
									if (local924 < 2) {
										local924 = 2;
									} else if (local924 > 126) {
										local924 = 126;
									}
									local914 = Static274.anIntArray337[local523 & 0xFF80 | local924];
									if ((this.anInt2646 & 0x7) == 0) {
										local646 = this.aClass16_Sub1_7.aFloatArray57[2] * local572 + local574 * this.aClass16_Sub1_7.aFloatArray57[0] + this.aClass16_Sub1_7.aFloatArray57[1] * local570;
										local646 = this.aClass16_Sub1_7.aFloat157 + local766 * (local766 > 0.0F ? this.aClass16_Sub1_7.aFloat164 : this.aClass16_Sub1_7.aFloat166);
										@Pc(1001) int local1001 = local914 >> 16 & 0xFF;
										@Pc(1007) int local1007 = local914 >> 8 & 0xFF;
										@Pc(1011) int local1011 = local914 & 0xFF;
										local1001 = (int) ((float) local1001 * local646);
										if (local1001 < 0) {
											local1001 = 0;
										} else if (local1001 > 255) {
											local1001 = 255;
										}
										local1007 = (int) ((float) local1007 * local646);
										if (local1007 < 0) {
											local1007 = 0;
										} else if (local1007 > 255) {
											local1007 = 255;
										}
										local1011 = (int) ((float) local1011 * local646);
										if (local1011 < 0) {
											local1011 = 0;
										} else if (local1011 > 255) {
											local1011 = 255;
										}
										local914 = local1011 | local1001 << 16 | local1007 << 8;
									}
								}
								if (Stream.c()) {
									local167.b((float) local495);
									local167.b((float) (this.method8286(local495, local505) + local531));
									local167.b((float) local505);
									local167.b((float) local495);
									local167.b((float) local505);
									if (this.anIntArrayArrayArray5 != null) {
										local167.b((float) (local277 == null ? 0 : local277[local437] - 1));
									}
									if ((this.anInt2646 & 0x7) != 0) {
										local167.b(local574);
										local167.b(local570);
										local167.b(local572);
									}
								} else {
									local167.a((float) local495);
									local167.a((float) (local531 + this.method8286(local495, local505)));
									local167.a((float) local505);
									local167.a((float) local495);
									local167.a((float) local505);
									if (this.anIntArrayArrayArray5 != null) {
										local167.a((float) (local277 == null ? 0 : local277[local437] - 1));
									}
									if ((this.anInt2646 & 0x7) != 0) {
										local167.a(local574);
										local167.a(local570);
										local167.a(local572);
									}
								}
								if (this.aClass16_Sub1_7.anInt7441 == 0) {
									local172.f(local914 | 0xFF000000);
								} else {
									local172.c(local914 | 0xFF000000);
								}
								local887 = this.anInt2630++;
								local482[local437] = (short) local887;
								if (local519 != -1) {
									local176[local887] = local221[local437];
								}
								local195.method1686(local549, new Class3_Sub33(local482[local437]));
							} else {
								local482[local437] = ((Class3_Sub33) local851).aShort76;
								local887 = local482[local437] & 0xFFFF;
								if (local519 != -1 && local221[local437].aLong309 < local176[local887].aLong309) {
									local176[local887] = local221[local437];
								}
							}
							for (local914 = 0; local914 < local427; local914++) {
								local199[local914].method2800(local561, local766, local887, local578);
							}
							this.anInt2633++;
						}
					}
				}
			}
			for (local205 = 0; local205 < this.anInt2630; local205++) {
				@Pc(1305) Class3_Sub19 local1305 = local176[local205];
				if (local1305 != null) {
					local1305.method2794(local205);
				}
			}
			@Pc(1322) int local1322;
			@Pc(1340) int local1340;
			for (@Pc(1318) int local1318 = 0; super.anInt9718 > local1318; local1318++) {
				for (local1322 = 0; local1322 < super.anInt9715; local1322++) {
					@Pc(1334) short[] local1334 = this.aShortArrayArray7[local1318 + super.anInt9718 * local1322];
					if (local1334 != null) {
						@Pc(1338) int local1338 = 0;
						local1340 = 0;
						while (local1334.length > local1340) {
							@Pc(1349) int local1349 = local1334[local1340++] & 0xFFFF;
							@Pc(1356) int local1356 = local1334[local1340++] & 0xFFFF;
							@Pc(1363) int local1363 = local1334[local1340++] & 0xFFFF;
							@Pc(1367) Class3_Sub19 local1367 = local176[local1349];
							@Pc(1371) Class3_Sub19 local1371 = local176[local1356];
							@Pc(1375) Class3_Sub19 local1375 = local176[local1363];
							@Pc(1377) Class3_Sub19 local1377 = null;
							if (local1367 != null) {
								local1367.method2799(local1318, local1338, local1322);
								local1377 = local1367;
							}
							if (local1371 != null) {
								local1371.method2799(local1318, local1338, local1322);
								if (local1377 == null || local1377.aLong309 > local1371.aLong309) {
									local1377 = local1371;
								}
							}
							if (local1375 != null) {
								local1375.method2799(local1318, local1338, local1322);
								if (local1377 == null || local1375.aLong309 < local1377.aLong309) {
									local1377 = local1375;
								}
							}
							if (local1377 != null) {
								if (local1367 != null) {
									local1377.method2794(local1349);
								}
								if (local1371 != null) {
									local1377.method2794(local1356);
								}
								if (local1375 != null) {
									local1377.method2794(local1363);
								}
								local1377.method2799(local1318, local1338, local1322);
							}
							local1338++;
						}
					}
				}
			}
			local167.b();
			local172.b();
			this.anInterface16_9 = this.aClass16_Sub1_7.method6244(false);
			this.anInterface16_9.method6038(local152, 4, this.anInt2630 * 4);
			this.anInterface16_10 = this.aClass16_Sub1_7.method6244(false);
			this.anInterface16_10.method6038(local162, local129, this.anInt2630 * local129);
			if ((this.anInt2646 & 0x7) == 0) {
				if (this.anIntArrayArrayArray5 == null) {
					this.aClass277_15 = this.aClass16_Sub1_7.method6271(new Class355[] { new Class355(new Class37[] { Static45.aClass37_1, Static45.aClass37_5 }), new Class355(Static45.aClass37_3) });
				} else {
					this.aClass277_15 = this.aClass16_Sub1_7.method6271(new Class355[] { new Class355(new Class37[] { Static45.aClass37_1, Static45.aClass37_5, Static45.aClass37_4 }), new Class355(Static45.aClass37_3) });
				}
			} else if (this.anIntArrayArrayArray5 == null) {
				this.aClass277_15 = this.aClass16_Sub1_7.method6271(new Class355[] { new Class355(new Class37[] { Static45.aClass37_1, Static45.aClass37_5, Static45.aClass37_2 }), new Class355(Static45.aClass37_3) });
			} else {
				this.aClass277_15 = this.aClass16_Sub1_7.method6271(new Class355[] { new Class355(new Class37[] { Static45.aClass37_1, Static45.aClass37_5, Static45.aClass37_4, Static45.aClass37_2 }), new Class355(Static45.aClass37_3) });
			}
			local1322 = 0;
			for (@Pc(1669) int local1669 = 0; local1669 < local105.length; local1669++) {
				if (local105[local1669].anInt3067 > 0) {
					local105[local1322++] = local105[local1669];
				}
			}
			this.aClass3_Sub19Array1 = new Class3_Sub19[local1322];
			@Pc(1698) long[] local1698 = new long[local1322];
			for (local1340 = 0; local1340 < local1322; local1340++) {
				@Pc(1706) Class3_Sub19 local1706 = local105[local1340];
				local1698[local1340] = local1706.aLong309;
				this.aClass3_Sub19Array1[local1340] = local1706;
				local1706.method2797(this.anInt2630);
			}
			Static448.method6467(local1698, this.aClass3_Sub19Array1);
			if (this.aClass63_1 != null) {
				this.aClass63_1.method1774();
			}
		}
		this.aFloatArrayArray4 = this.aFloatArrayArray3 = this.aFloatArrayArray2 = null;
		this.aClass3_Sub19ArrayArrayArray1 = null;
		this.anIntArrayArrayArray9 = this.anIntArrayArrayArray7 = null;
		this.anIntArrayArrayArray6 = null;
		this.anIntArrayArrayArray5 = null;
		this.aByteArrayArray3 = null;
		this.anIntArrayArrayArray4 = null;
		this.anIntArrayArrayArray8 = null;
		this.aClass62_16 = null;
	}

	@OriginalMember(owner = "client!ek", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class3_Sub6_Sub12 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub6_Sub12 arg2) {
		if ((this.aByteArrayArray2[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(21) int local21 = super.anInt9716 >> this.aClass16_Sub1_7.anInt7446;
		@Pc(24) Class3_Sub6_Sub12_Sub1 local24 = (Class3_Sub6_Sub12_Sub1) arg2;
		@Pc(40) Class3_Sub6_Sub12_Sub1 local40;
		if (local24 != null && local24.method4121(local21, local21)) {
			local40 = local24;
			local24.method4119();
		} else {
			local40 = new Class3_Sub6_Sub12_Sub1(this.aClass16_Sub1_7, local21, local21);
		}
		local40.method4122(local21, local21, 0, 0);
		this.method2418(arg0, arg1, local40);
		return local40;
	}

	@OriginalMember(owner = "client!ek", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class3_Sub6_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass63_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass16_Sub1_7.anInt7439 * arg2 >> 8) >> this.aClass16_Sub1_7.anInt7446;
			@Pc(39) int local39 = arg3 - (this.aClass16_Sub1_7.anInt7463 * arg2 >> 8) >> this.aClass16_Sub1_7.anInt7446;
			this.aClass63_1.method1777(local24, arg0, local39);
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIILclient!ip;)V")
	private void method2418(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub6_Sub12_Sub1 arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray9[arg0][arg1];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray7[arg0][arg1];
		@Pc(22) int local22 = local12.length;
		if (local22 > Static253.anIntArray318.length) {
			Static253.anIntArray318 = new int[local22];
			Static530.anIntArray559 = new int[local22];
		}
		for (@Pc(34) int local34 = 0; local34 < local22; local34++) {
			Static253.anIntArray318[local34] = local12[local34] >> this.aClass16_Sub1_7.anInt7446;
			Static530.anIntArray559[local34] = local19[local34] >> this.aClass16_Sub1_7.anInt7446;
		}
		@Pc(68) int local68 = 0;
		while (local68 < local22) {
			@Pc(74) int local74 = Static253.anIntArray318[local68];
			@Pc(79) int local79 = Static530.anIntArray559[local68++];
			@Pc(83) int local83 = Static253.anIntArray318[local68];
			@Pc(88) int local88 = Static530.anIntArray559[local68++];
			@Pc(92) int local92 = Static253.anIntArray318[local68];
			@Pc(97) int local97 = Static530.anIntArray559[local68++];
			if (-((local92 - local83) * (local88 - local79)) + (local74 - local83) * (local88 + -local97) > 0) {
				arg2.method4117(local92, local74, local97, local79, local88, local83);
			}
		}
	}

	@OriginalMember(owner = "client!ek", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class3_Sub6_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass63_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass16_Sub1_7.anInt7439 * arg2 >> 8) >> this.aClass16_Sub1_7.anInt7446;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass16_Sub1_7.anInt7463 >> 8) >> this.aClass16_Sub1_7.anInt7446;
			this.aClass63_1.method1773(arg0, local24, local39);
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)V")
	@Override
	public void method8284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method8278(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method2417(arg0, arg4, arg5, arg2, arg1, -1, arg3);
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lclient!bq;[I)V")
	@Override
	public void method8282(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass193_15.method4462(new Class3_Sub30(this.aClass16_Sub1_7, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method8283(@OriginalArg(0) Class3_Sub6_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass63_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (arg2 * this.aClass16_Sub1_7.anInt7439 >> 8) >> this.aClass16_Sub1_7.anInt7446;
			@Pc(40) int local40 = arg3 - (arg2 * this.aClass16_Sub1_7.anInt7463 >> 8) >> this.aClass16_Sub1_7.anInt7446;
			return this.aClass63_1.method1770(local25, local40, arg0);
		}
	}

	@OriginalMember(owner = "client!ek", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray3[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray3[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!ek", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray5 == null) {
			this.anIntArrayArrayArray5 = new int[super.anInt9718][super.anInt9715][];
		}
		if (arg3 != null && this.anIntArrayArrayArray8 == null) {
			this.anIntArrayArrayArray8 = new int[super.anInt9718][super.anInt9715][];
		}
		@Pc(33) Interface5 local33 = this.aClass16_Sub1_7.anInterface5_12;
		this.anIntArrayArrayArray9[arg0][arg1] = arg2;
		this.anIntArrayArrayArray7[arg0][arg1] = arg4;
		this.anIntArrayArrayArray6[arg0][arg1] = arg6;
		this.anIntArrayArrayArray4[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray5 != null) {
			this.anIntArrayArrayArray5[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray8 != null) {
			this.anIntArrayArrayArray8[arg0][arg1] = arg3;
		}
		@Pc(92) Class3_Sub19[] local92 = this.aClass3_Sub19ArrayArrayArray1[arg0][arg1] = new Class3_Sub19[arg6.length];
		for (@Pc(94) int local94 = 0; local94 < arg6.length; local94++) {
			@Pc(100) int local100 = arg8[local94];
			@Pc(104) int local104 = arg9[local94];
			if ((this.anInt2646 & 0x20) != 0 && local100 != -1 && local33.method5193(local100).aBoolean693) {
				local104 = 128;
				local100 = -1;
			}
			@Pc(148) long local148 = (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42 | (long) (local104 << 14) | (long) local100;
			@Pc(154) Class3 local154;
			for (local154 = this.aClass62_16.method1682(local148); local154 != null; local154 = this.aClass62_16.method1689()) {
				@Pc(159) Class3_Sub19 local159 = (Class3_Sub19) local154;
				if (local100 == local159.anInt3057 && local159.aFloat80 == (float) local104 && arg10 == local159.anInt3061 && arg11 == local159.anInt3066 && arg12 == local159.anInt3060) {
					break;
				}
			}
			if (local154 == null) {
				local92[local94] = new Class3_Sub19(this, local100, local104, arg10, arg11, arg12);
				this.aClass62_16.method1686(local148, local92[local94]);
			} else {
				local92[local94] = (Class3_Sub19) local154;
			}
		}
		if (arg13) {
			this.aByteArrayArray2[arg0][arg1] = (byte) (this.aByteArrayArray2[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt2648) {
			this.anInt2648 = arg6.length;
		}
		this.anInt2649 += arg6.length;
	}
}
