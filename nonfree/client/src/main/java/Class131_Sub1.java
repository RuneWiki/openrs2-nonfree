import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hm")
public final class Class131_Sub1 extends Class131 {

	@OriginalMember(owner = "client!hm", name = "o", descriptor = "I")
	private int anInt3620;

	@OriginalMember(owner = "client!hm", name = "u", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!hm", name = "K", descriptor = "I")
	private int anInt3634;

	@OriginalMember(owner = "client!hm", name = "X", descriptor = "Lclient!up;")
	private Interface16 anInterface16_8;

	@OriginalMember(owner = "client!hm", name = "ab", descriptor = "I")
	private int anInt3641;

	@OriginalMember(owner = "client!hm", name = "bb", descriptor = "Lclient!ws;")
	public Class318 aClass318_14;

	@OriginalMember(owner = "client!hm", name = "cb", descriptor = "[Lclient!es;")
	private Class5_Sub13[] aClass5_Sub13Array1;

	@OriginalMember(owner = "client!hm", name = "eb", descriptor = "I")
	private int anInt3642;

	@OriginalMember(owner = "client!hm", name = "gb", descriptor = "Lclient!up;")
	private Interface16 anInterface16_9;

	@OriginalMember(owner = "client!hm", name = "R", descriptor = "I")
	private int anInt3639 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!hm", name = "S", descriptor = "I")
	private int anInt3640 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!hm", name = "T", descriptor = "Lclient!fea;")
	private final Class99 aClass99_24 = new Class99();

	@OriginalMember(owner = "client!hm", name = "A", descriptor = "[[I")
	private final int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!hm", name = "U", descriptor = "Lclient!nd;")
	public final Class62_Sub1 aClass62_Sub1_9;

	@OriginalMember(owner = "client!hm", name = "O", descriptor = "I")
	private final int anInt3637;

	@OriginalMember(owner = "client!hm", name = "B", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!hm", name = "m", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!hm", name = "y", descriptor = "[[B")
	private final byte[][] aByteArrayArray18;

	@OriginalMember(owner = "client!hm", name = "V", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!hm", name = "j", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!hm", name = "M", descriptor = "[[S")
	public final short[][] aShortArrayArray6;

	@OriginalMember(owner = "client!hm", name = "Q", descriptor = "I")
	public final int anInt3638;

	@OriginalMember(owner = "client!hm", name = "D", descriptor = "I")
	private final int anInt3629;

	@OriginalMember(owner = "client!hm", name = "n", descriptor = "[[[Lclient!es;")
	private Class5_Sub13[][][] aClass5_Sub13ArrayArrayArray1;

	@OriginalMember(owner = "client!hm", name = "E", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!hm", name = "Z", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!hm", name = "Y", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!hm", name = "p", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!hm", name = "db", descriptor = "[[B")
	private byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!hm", name = "W", descriptor = "Lclient!cb;")
	private Class42 aClass42_12;

	@OriginalMember(owner = "client!hm", name = "G", descriptor = "Lclient!hg;")
	private Class128 aClass128_2;

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lclient!nd;IIII[[I[[II)V")
	public Class131_Sub1(@OriginalArg(0) Class62_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.anIntArrayArray24 = arg5;
		this.aClass62_Sub1_9 = arg0;
		this.anInt3637 = super.anInt8869 - 2;
		this.anIntArrayArrayArray7 = new int[arg3][arg4][];
		this.anIntArrayArrayArray4 = new int[arg3][arg4][];
		this.aByteArrayArray18 = new byte[arg3][arg4];
		this.aFloatArrayArray4 = new float[super.anInt8873 + 1][super.anInt8871 + 1];
		this.anIntArrayArrayArray3 = new int[arg3][arg4][];
		this.aShortArrayArray6 = new short[arg3 * arg4][];
		this.anInt3638 = arg2;
		this.anInt3629 = 0x1 << this.anInt3637;
		this.aClass5_Sub13ArrayArrayArray1 = new Class5_Sub13[arg3][arg4][];
		this.anIntArrayArrayArray8 = new int[arg3][arg4][];
		this.aFloatArrayArray6 = new float[super.anInt8873 + 1][super.anInt8871 + 1];
		this.aFloatArrayArray5 = new float[super.anInt8873 + 1][super.anInt8871 + 1];
		this.anIntArrayArrayArray5 = new int[arg3][arg4][];
		this.aByteArrayArray19 = new byte[arg3 + 1][arg4 + 1];
		for (@Pc(123) int local123 = 0; super.anInt8871 >= local123; local123++) {
			for (@Pc(127) int local127 = 0; local127 <= super.anInt8873; local127++) {
				@Pc(136) int local136 = this.anIntArrayArray24[local127][local123];
				if (local136 < this.anInt3639) {
					this.anInt3639 = local136;
				}
				if (local136 > this.anInt3640) {
					this.anInt3640 = local136;
				}
				if (local127 > 0 && local123 > 0 && super.anInt8873 > local127 && local123 < super.anInt8871) {
					@Pc(196) int local196 = arg6[local127 + 1][local123] - arg6[local127 - 1][local123];
					@Pc(213) int local213 = arg6[local127][local123 + 1] - arg6[local127][local123 - 1];
					@Pc(233) float local233 = (float) (1.0D / Math.sqrt((double) (local213 * local213 + local196 * local196 + arg7 * 4 * arg7)));
					this.aFloatArrayArray5[local127][local123] = (float) local196 * local233;
					this.aFloatArrayArray6[local127][local123] = local233 * (float) (-arg7 * 2);
					this.aFloatArrayArray4[local127][local123] = (float) local213 * local233;
				}
			}
		}
		this.aClass42_12 = new Class42(128);
		if ((this.anInt3638 & 0x10) != 0) {
			this.aClass128_2 = new Class128(this.aClass62_Sub1_9, this);
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7182(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt3642 <= 0) {
			return;
		}
		@Pc(16) Interface13 local16 = this.aClass62_Sub1_9.method4770(this.anInt3634);
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = 32767;
		@Pc(22) int local22 = -32768;
		for (@Pc(24) int local24 = 0; local24 < 4; local24++) {
			local18 = 0;
			@Pc(33) Buffer local33 = local16.method3487();
			if (local33 != null) {
				@Pc(41) Stream local41 = this.aClass62_Sub1_9.method4693(local33);
				@Pc(45) int local45;
				@Pc(54) int local54;
				@Pc(56) int local56;
				@Pc(75) short[] local75;
				@Pc(79) int local79;
				@Pc(87) int local87;
				if (Stream.c()) {
					for (local45 = arg1; local45 < arg3; local45++) {
						local54 = arg0 + super.anInt8873 * local45;
						for (local56 = arg0; local56 < arg2; local56++) {
							if (arg4[local56 - arg0][local45 - arg1]) {
								local75 = this.aShortArrayArray6[local54];
								if (local75 != null) {
									for (local79 = 0; local79 < local75.length; local79++) {
										local87 = local75[local79] & 0xFFFF;
										if (local87 > local22) {
											local22 = local87;
										}
										local41.e(local87);
										if (local20 > local87) {
											local20 = local87;
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
						local54 = arg0 + super.anInt8873 * local45;
						for (local56 = arg0; local56 < arg2; local56++) {
							if (arg4[local56 - arg0][local45 - arg1]) {
								local75 = this.aShortArrayArray6[local54];
								if (local75 != null) {
									for (local79 = 0; local79 < local75.length; local79++) {
										local87 = local75[local79] & 0xFFFF;
										local41.a(local87);
										if (local22 < local87) {
											local22 = local87;
										}
										local18++;
										if (local87 < local20) {
											local20 = local87;
										}
									}
								}
							}
							local54++;
						}
					}
				}
				local41.b();
				if (local16.method3492()) {
					break;
				}
			}
		}
		if (local18 <= 0) {
			return;
		}
		this.aClass62_Sub1_9.method4709();
		this.aClass62_Sub1_9.method4721(false);
		this.aClass62_Sub1_9.method4760(false);
		this.aClass62_Sub1_9.method4751(false);
		this.aClass62_Sub1_9.method4752(false);
		this.aClass62_Sub1_9.method4754(0);
		this.aClass62_Sub1_9.method4656(-2, false, false);
		this.aClass62_Sub1_9.method4676(null);
		@Pc(271) Class78_Sub1 local271 = this.aClass62_Sub1_9.method4744();
		@Pc(276) float[] local276 = this.aClass62_Sub1_9.method4787();
		local276[8] = 0.0F;
		local276[11] = 0.0F;
		local276[6] = 0.0F;
		local276[3] = 0.0F;
		local276[4] = 0.0F;
		local276[2] = 0.0F;
		local276[13] = 1.0F - ((float) (arg3 * 1024) / 128.0F + (float) 0) / (float) this.aClass62_Sub1_9.anInt5509;
		local276[5] = (float) 1024 / ((float) super.anInt8874 * 128.0F * (float) this.aClass62_Sub1_9.anInt5509);
		local276[0] = (float) 1024 / ((float) super.anInt8874 * 128.0F * (float) this.aClass62_Sub1_9.anInt5584);
		local276[10] = 1.0F / (float) (this.anInt3640 - this.anInt3639);
		local276[7] = 0.0F;
		local276[9] = 0.0F;
		local276[12] = -(((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass62_Sub1_9.anInt5584) - 1.0F;
		local276[14] = -this.anInt3639 / (this.anInt3640 - this.anInt3639);
		local276[1] = 0.0F;
		local276[15] = 1.0F;
		local271.method2185(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 0.0F);
		this.aClass62_Sub1_9.method4718();
		this.aClass62_Sub1_9.method4679();
		if ((this.anInt3638 & 0x7) == 0) {
			this.aClass62_Sub1_9.method4760(false);
		} else {
			this.aClass62_Sub1_9.method4760(true);
			this.aClass62_Sub1_9.method4779();
		}
		this.aClass62_Sub1_9.method4784(false);
		this.aClass62_Sub1_9.method4673(0, this.anInterface16_9);
		this.aClass62_Sub1_9.method4673(1, this.anInterface16_8);
		this.aClass62_Sub1_9.method4713(this.aClass318_14);
		this.aClass62_Sub1_9.method4727(Static403.aClass228_7, 0, local22 + 1 - local20, local18 / 3, local16, local20);
		this.aClass62_Sub1_9.method4784(true);
	}

	@OriginalMember(owner = "client!hm", name = "IA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg3 != null && this.anIntArrayArrayArray3 == null) {
			this.anIntArrayArrayArray3 = new int[super.anInt8873][super.anInt8871][];
		}
		if (arg5 != null && this.anIntArrayArrayArray6 == null) {
			this.anIntArrayArrayArray6 = new int[super.anInt8873][super.anInt8871][];
		}
		this.anIntArrayArrayArray4[arg0][arg1] = arg2;
		this.anIntArrayArrayArray8[arg0][arg1] = arg4;
		this.anIntArrayArrayArray7[arg0][arg1] = arg6;
		this.anIntArrayArrayArray5[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray6 != null) {
			this.anIntArrayArrayArray6[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray3 != null) {
			this.anIntArrayArrayArray3[arg0][arg1] = arg3;
		}
		@Pc(88) Class5_Sub13[] local88 = this.aClass5_Sub13ArrayArrayArray1[arg0][arg1] = new Class5_Sub13[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) arg8[local90] | (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48 | (long) (arg9[local90] << 14);
			@Pc(125) Class5 local125;
			for (local125 = this.aClass42_12.method1109(local119); local125 != null; local125 = this.aClass42_12.method1110()) {
				@Pc(130) Class5_Sub13 local130 = (Class5_Sub13) local125;
				if (arg8[local90] == local130.anInt2596 && (float) arg9[local90] == local130.aFloat136 && arg10 == local130.anInt2587 && local130.anInt2598 == arg11 && arg12 == local130.anInt2593) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class5_Sub13(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass42_12.method1106(local119, local88[local90]);
			} else {
				local88[local90] = (Class5_Sub13) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray18[arg0][arg1] = (byte) (this.aByteArrayArray18[arg0][arg1] | 0x1);
		}
		if (this.anInt3641 < arg6.length) {
			this.anInt3641 = arg6.length;
		}
		this.anInt3642 += arg6.length;
	}

	@OriginalMember(owner = "client!hm", name = "F", descriptor = "(Lclient!k;IIIIZ)V")
	@Override
	public void F(@OriginalArg(0) Class5_Sub2_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass128_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass62_Sub1_9.anInt5664 * arg2 >> 8) >> this.aClass62_Sub1_9.anInt5686;
			@Pc(38) int local38 = arg3 - (arg2 * this.aClass62_Sub1_9.anInt5691 >> 8) >> this.aClass62_Sub1_9.anInt5686;
			this.aClass128_2.method3087(local38, local24, arg0);
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method7186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!hm", name = "X", descriptor = "(IILclient!k;)Lclient!k;")
	@Override
	public Class5_Sub2_Sub13 X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub2_Sub13 arg2) {
		if ((this.aByteArrayArray18[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt8874 >> this.aClass62_Sub1_9.anInt5686;
		@Pc(27) Class5_Sub2_Sub13_Sub2 local27 = (Class5_Sub2_Sub13_Sub2) arg2;
		@Pc(43) Class5_Sub2_Sub13_Sub2 local43;
		if (local27 != null && local27.method4851(local24, local24)) {
			local43 = local27;
			local27.method4848();
		} else {
			local43 = new Class5_Sub2_Sub13_Sub2(this.aClass62_Sub1_9, local24, local24);
		}
		local43.method4854(0, 0, local24, local24);
		this.method3175(local43, arg1, arg0);
		return local43;
	}

	@OriginalMember(owner = "client!hm", name = "N", descriptor = "()V")
	@Override
	public void N() {
		if (this.anInt3642 <= 0) {
			this.aClass128_2 = null;
		} else {
			@Pc(22) byte[][] local22 = new byte[super.anInt8873 + 1][super.anInt8871 + 1];
			for (@Pc(24) int local24 = 1; super.anInt8873 > local24; local24++) {
				for (@Pc(28) int local28 = 1; super.anInt8871 > local28; local28++) {
					local22[local24][local28] = (byte) ((this.aByteArrayArray19[local24][local28 - 1] >> 2) + (this.aByteArrayArray19[local24 + 1][local28] >> 3) + (this.aByteArrayArray19[local24 - 1][local28] >> 2) + (this.aByteArrayArray19[local24][local28 + 1] >> 3) + (this.aByteArrayArray19[local24][local28] >> 1));
				}
			}
			@Pc(108) Class5_Sub13[] local108 = new Class5_Sub13[this.aClass42_12.method1111()];
			this.aClass42_12.method1113(local108);
			for (@Pc(116) int local116 = 0; local116 < local108.length; local116++) {
				local108[local116].method2328(this.anInt3642);
			}
			@Pc(132) int local132 = 20;
			if (this.anIntArrayArrayArray6 != null) {
				local132 += 4;
			}
			if ((this.anInt3638 & 0x7) != 0) {
				local132 += 12;
			}
			@Pc(155) NativeHeapBuffer local155 = this.aClass62_Sub1_9.aNativeHeap5.a(this.anInt3642 * 4, false);
			@Pc(165) NativeHeapBuffer local165 = this.aClass62_Sub1_9.aNativeHeap5.a(local132 * this.anInt3642, false);
			@Pc(170) Stream local170 = new Stream(local165);
			@Pc(175) Stream local175 = new Stream(local155);
			@Pc(179) Class5_Sub13[] local179 = new Class5_Sub13[this.anInt3642];
			@Pc(186) int local186 = Static7.method265(this.anInt3642 / 4);
			if (local186 < 1) {
				local186 = 1;
			}
			@Pc(198) Class42 local198 = new Class42(local186);
			@Pc(202) Class5_Sub13[] local202 = new Class5_Sub13[this.anInt3641];
			@Pc(208) int local208;
			for (@Pc(204) int local204 = 0; local204 < super.anInt8873; local204++) {
				for (local208 = 0; super.anInt8871 > local208; local208++) {
					if (this.anIntArrayArrayArray7[local204][local208] != null) {
						@Pc(224) Class5_Sub13[] local224 = this.aClass5_Sub13ArrayArrayArray1[local204][local208];
						@Pc(231) int[] local231 = this.anIntArrayArrayArray4[local204][local208];
						@Pc(238) int[] local238 = this.anIntArrayArrayArray8[local204][local208];
						@Pc(245) int[] local245 = this.anIntArrayArrayArray5[local204][local208];
						@Pc(252) int[] local252 = this.anIntArrayArrayArray7[local204][local208];
						@Pc(264) int[] local264 = this.anIntArrayArrayArray3 == null ? null : this.anIntArrayArrayArray3[local204][local208];
						@Pc(276) int[] local276 = this.anIntArrayArrayArray6 == null ? null : this.anIntArrayArrayArray6[local204][local208];
						if (local245 == null) {
							local245 = local252;
						}
						@Pc(287) float local287 = this.aFloatArrayArray5[local204][local208];
						@Pc(294) float local294 = this.aFloatArrayArray6[local204][local208];
						@Pc(301) float local301 = this.aFloatArrayArray4[local204][local208];
						@Pc(310) float local310 = this.aFloatArrayArray5[local204][local208 + 1];
						@Pc(319) float local319 = this.aFloatArrayArray6[local204][local208 + 1];
						@Pc(328) float local328 = this.aFloatArrayArray4[local204][local208 + 1];
						@Pc(339) float local339 = this.aFloatArrayArray5[local204 + 1][local208 + 1];
						@Pc(350) float local350 = this.aFloatArrayArray6[local204 + 1][local208 + 1];
						@Pc(361) float local361 = this.aFloatArrayArray4[local204 + 1][local208 + 1];
						@Pc(370) float local370 = this.aFloatArrayArray5[local204 + 1][local208];
						@Pc(379) float local379 = this.aFloatArrayArray6[local204 + 1][local208];
						@Pc(388) float local388 = this.aFloatArrayArray4[local204 + 1][local208];
						@Pc(396) int local396 = local22[local204][local208] & 0xFF;
						@Pc(406) int local406 = local22[local204][local208 + 1] & 0xFF;
						@Pc(418) int local418 = local22[local204 + 1][local208 + 1] & 0xFF;
						@Pc(428) int local428 = local22[local204 + 1][local208] & 0xFF;
						@Pc(430) int local430 = 0;
						@Pc(440) int local440;
						label357: for (@Pc(432) int local432 = 0; local432 < local252.length; local432++) {
							@Pc(438) Class5_Sub13 local438 = local224[local432];
							for (local440 = 0; local440 < local430; local440++) {
								if (local202[local440] == local438) {
									continue label357;
								}
							}
							local202[local430++] = local438;
						}
						@Pc(482) short[] local482 = this.aShortArrayArray6[local208 * super.anInt8873 + local204] = new short[local252.length];
						for (local440 = 0; local440 < local252.length; local440++) {
							@Pc(495) int local495 = (local204 << super.anInt8869) + local231[local440];
							@Pc(504) int local504 = (local208 << super.anInt8869) + local238[local440];
							@Pc(509) int local509 = local495 >> this.anInt3637;
							@Pc(514) int local514 = local504 >> this.anInt3637;
							@Pc(518) int local518 = local252[local440];
							@Pc(522) int local522 = local245[local440];
							@Pc(530) int local530 = local264 == null ? 0 : local264[local440];
							@Pc(548) long local548 = (long) local514 | (long) (local509 << 16) | (long) local518 << 32 | (long) local522 << 48;
							@Pc(552) int local552 = local231[local440];
							@Pc(556) int local556 = local238[local440];
							@Pc(558) byte local558 = 74;
							@Pc(560) int local560 = 0;
							@Pc(603) float local603;
							@Pc(605) float local605;
							@Pc(601) float local601;
							@Pc(638) float local638;
							@Pc(599) int local599;
							if (local552 == 0 && local556 == 0) {
								local603 = local287;
								local601 = local301;
								local599 = local558 - local396;
								local605 = local294;
							} else if (local552 == 0 && super.anInt8874 == local556) {
								local601 = local328;
								local605 = local319;
								local603 = local310;
								local599 = local558 - local406;
							} else if (local552 == super.anInt8874 && super.anInt8874 == local556) {
								local603 = local339;
								local601 = local361;
								local605 = local350;
								local599 = local558 - local418;
							} else if (local552 == super.anInt8874 && local556 == 0) {
								local599 = local558 - local428;
								local601 = local388;
								local603 = local370;
								local605 = local379;
							} else {
								@Pc(614) float local614 = (float) local552 / (float) super.anInt8874;
								@Pc(621) float local621 = (float) local556 / (float) super.anInt8874;
								@Pc(630) float local630 = local287 + local614 * (local370 - local287);
								local638 = local294 + (local379 - local294) * local614;
								@Pc(646) float local646 = local301 + (local388 - local301) * local614;
								@Pc(654) float local654 = local310 + local614 * (local339 - local310);
								@Pc(662) float local662 = local319 + local614 * (local350 - local319);
								local603 = (local654 - local630) * local621 + local630;
								@Pc(680) float local680 = local328 + (local361 - local328) * local614;
								local605 = (local662 - local638) * local621 + local638;
								local601 = (local680 - local646) * local621 + local646;
								@Pc(711) int local711 = local396 + ((local428 - local396) * local552 >> super.anInt8869);
								@Pc(723) int local723 = local406 + (local552 * (local418 - local406) >> super.anInt8869);
								local599 = local558 - local711 - ((local723 - local711) * local556 >> super.anInt8869);
							}
							@Pc(776) float local776 = 1.0F;
							if (local518 != -1) {
								@Pc(787) int local787 = (local518 & 0x7F) * local599 >> 7;
								if (local787 < 2) {
									local787 = 2;
								} else if (local787 > 126) {
									local787 = 126;
								}
								if ((this.anInt3638 & 0x7) == 0) {
									local776 = local601 * this.aClass62_Sub1_9.aFloatArray41[2] + local603 * this.aClass62_Sub1_9.aFloatArray41[0] + this.aClass62_Sub1_9.aFloatArray41[1] * local605;
									local776 = this.aClass62_Sub1_9.aFloat241 + (local776 > 0.0F ? this.aClass62_Sub1_9.aFloat236 : this.aClass62_Sub1_9.aFloat235) * local776;
								}
								local560 = Static444.anIntArray587[local787 | local518 & 0xFF80];
							}
							@Pc(859) Class5 local859 = null;
							if ((this.anInt3629 - 1 & local495) == 0 && (local504 & this.anInt3629 - 1) == 0) {
								local859 = local198.method1109(local548);
							}
							@Pc(1195) int local1195;
							@Pc(891) int local891;
							if (local859 == null) {
								if (local518 == local522) {
									local891 = local560;
								} else {
									@Pc(901) int local901 = (local522 & 0x7F) * local599 >> 7;
									if (local901 < 2) {
										local901 = 2;
									} else if (local901 > 126) {
										local901 = 126;
									}
									local891 = Static444.anIntArray587[local522 & 0xFF80 | local901];
									if ((this.anInt3638 & 0x7) == 0) {
										@Pc(949) float local949 = local603 * this.aClass62_Sub1_9.aFloatArray41[0] + local605 * this.aClass62_Sub1_9.aFloatArray41[1] + this.aClass62_Sub1_9.aFloatArray41[2] * local601;
										local638 = this.aClass62_Sub1_9.aFloat241 + local776 * (local776 > 0.0F ? this.aClass62_Sub1_9.aFloat236 : this.aClass62_Sub1_9.aFloat235);
										@Pc(974) int local974 = local891 >> 16 & 0xFF;
										@Pc(980) int local980 = local891 >> 8 & 0xFF;
										local974 = (int) ((float) local974 * local638);
										@Pc(990) int local990 = local891 & 0xFF;
										local980 = (int) ((float) local980 * local638);
										if (local974 < 0) {
											local974 = 0;
										} else if (local974 > 255) {
											local974 = 255;
										}
										if (local980 < 0) {
											local980 = 0;
										} else if (local980 > 255) {
											local980 = 255;
										}
										local990 = (int) ((float) local990 * local638);
										if (local990 < 0) {
											local990 = 0;
										} else if (local990 > 255) {
											local990 = 255;
										}
										local891 = local990 | local974 << 16 | local980 << 8;
									}
								}
								if (Stream.c()) {
									local170.b((float) local495);
									local170.b((float) (this.aa(local495, local504) + local530));
									local170.b((float) local504);
									local170.b((float) local495);
									local170.b((float) local504);
									if (this.anIntArrayArrayArray6 != null) {
										local170.b((float) (local276 == null ? 0 : local276[local440] - 1));
									}
									if ((this.anInt3638 & 0x7) != 0) {
										local170.b(local603);
										local170.b(local605);
										local170.b(local601);
									}
								} else {
									local170.a((float) local495);
									local170.a((float) (this.aa(local495, local504) + local530));
									local170.a((float) local504);
									local170.a((float) local495);
									local170.a((float) local504);
									if (this.anIntArrayArrayArray6 != null) {
										local170.a((float) (local276 == null ? 0 : local276[local440] - 1));
									}
									if ((this.anInt3638 & 0x7) != 0) {
										local170.a(local603);
										local170.a(local605);
										local170.a(local601);
									}
								}
								if (this.aClass62_Sub1_9.anInt5684 == 0) {
									local175.b(local891 | 0xFF000000);
								} else {
									local175.f(local891 | 0xFF000000);
								}
								local1195 = this.anInt3620++;
								local482[local440] = (short) local1195;
								if (local518 != -1) {
									local179[local1195] = local224[local440];
								}
								local198.method1106(local548, new Class5_Sub35(local482[local440]));
							} else {
								local482[local440] = ((Class5_Sub35) local859).aShort88;
								local1195 = local482[local440] & 0xFFFF;
								if (local518 != -1 && local179[local1195].aLong253 > local224[local440].aLong253) {
									local179[local1195] = local224[local440];
								}
							}
							for (local891 = 0; local891 < local430; local891++) {
								local202[local891].method2327(local599, local1195, local776, local560);
							}
							this.anInt3634++;
						}
					}
				}
			}
			for (local208 = 0; local208 < this.anInt3620; local208++) {
				@Pc(1306) Class5_Sub13 local1306 = local179[local208];
				if (local1306 != null) {
					local1306.method2329(local208);
				}
			}
			@Pc(1323) int local1323;
			@Pc(1341) int local1341;
			for (@Pc(1319) int local1319 = 0; local1319 < super.anInt8873; local1319++) {
				for (local1323 = 0; super.anInt8871 > local1323; local1323++) {
					@Pc(1335) short[] local1335 = this.aShortArrayArray6[local1319 + local1323 * super.anInt8873];
					if (local1335 != null) {
						@Pc(1339) int local1339 = 0;
						local1341 = 0;
						while (local1341 < local1335.length) {
							@Pc(1350) int local1350 = local1335[local1341++] & 0xFFFF;
							@Pc(1357) int local1357 = local1335[local1341++] & 0xFFFF;
							@Pc(1364) int local1364 = local1335[local1341++] & 0xFFFF;
							@Pc(1368) Class5_Sub13 local1368 = local179[local1350];
							@Pc(1372) Class5_Sub13 local1372 = local179[local1357];
							@Pc(1376) Class5_Sub13 local1376 = local179[local1364];
							@Pc(1378) Class5_Sub13 local1378 = null;
							if (local1368 != null) {
								local1378 = local1368;
								local1368.method2323(local1323, local1319, local1339);
							}
							if (local1372 != null) {
								local1372.method2323(local1323, local1319, local1339);
								if (local1378 == null || local1372.aLong253 < local1378.aLong253) {
									local1378 = local1372;
								}
							}
							if (local1376 != null) {
								local1376.method2323(local1323, local1319, local1339);
								if (local1378 == null || local1376.aLong253 < local1378.aLong253) {
									local1378 = local1376;
								}
							}
							if (local1378 != null) {
								if (local1368 != null) {
									local1378.method2329(local1350);
								}
								if (local1372 != null) {
									local1378.method2329(local1357);
								}
								if (local1376 != null) {
									local1378.method2329(local1364);
								}
								local1378.method2323(local1323, local1319, local1339);
							}
							local1339++;
						}
					}
				}
			}
			local170.b();
			local175.b();
			this.anInterface16_8 = this.aClass62_Sub1_9.method4702(false);
			this.anInterface16_8.method3463(local155, this.anInt3620 * 4, 4);
			this.anInterface16_9 = this.aClass62_Sub1_9.method4702(false);
			this.anInterface16_9.method3463(local165, local132 * this.anInt3620, local132);
			if ((this.anInt3638 & 0x7) == 0) {
				if (this.anIntArrayArrayArray6 == null) {
					this.aClass318_14 = this.aClass62_Sub1_9.method4782(new Class313[] { new Class313(new Class253[] { Static422.aClass253_1, Static422.aClass253_5 }), new Class313(Static422.aClass253_3) });
				} else {
					this.aClass318_14 = this.aClass62_Sub1_9.method4782(new Class313[] { new Class313(new Class253[] { Static422.aClass253_1, Static422.aClass253_5, Static422.aClass253_4 }), new Class313(Static422.aClass253_3) });
				}
			} else if (this.anIntArrayArrayArray6 == null) {
				this.aClass318_14 = this.aClass62_Sub1_9.method4782(new Class313[] { new Class313(new Class253[] { Static422.aClass253_1, Static422.aClass253_5, Static422.aClass253_2 }), new Class313(Static422.aClass253_3) });
			} else {
				this.aClass318_14 = this.aClass62_Sub1_9.method4782(new Class313[] { new Class313(new Class253[] { Static422.aClass253_1, Static422.aClass253_5, Static422.aClass253_4, Static422.aClass253_2 }), new Class313(Static422.aClass253_3) });
			}
			local1323 = 0;
			for (@Pc(1673) int local1673 = 0; local1673 < local108.length; local1673++) {
				if (local108[local1673].anInt2597 > 0) {
					local108[local1323++] = local108[local1673];
				}
			}
			this.aClass5_Sub13Array1 = new Class5_Sub13[local1323];
			@Pc(1702) long[] local1702 = new long[local1323];
			for (local1341 = 0; local1341 < local1323; local1341++) {
				@Pc(1710) Class5_Sub13 local1710 = local108[local1341];
				local1702[local1341] = local1710.aLong253;
				this.aClass5_Sub13Array1[local1341] = local1710;
				local1710.method2324(this.anInt3620);
			}
			Static501.method6902(local1702, this.aClass5_Sub13Array1);
			if (this.aClass128_2 != null) {
				this.aClass128_2.method3091();
			}
		}
		this.anIntArrayArrayArray3 = null;
		this.anIntArrayArrayArray5 = null;
		this.anIntArrayArrayArray7 = null;
		this.anIntArrayArrayArray4 = this.anIntArrayArrayArray8 = null;
		this.aClass5_Sub13ArrayArrayArray1 = null;
		this.anIntArrayArrayArray6 = null;
		this.aFloatArrayArray5 = this.aFloatArrayArray6 = this.aFloatArrayArray4 = null;
		this.aClass42_12 = null;
		this.aByteArrayArray19 = null;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lclient!uca;[I)V")
	@Override
	public void method7187(@OriginalArg(0) Class5_Sub10 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass99_24.method2513(new Class5_Sub16(this.aClass62_Sub1_9, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!hm", name = "Q", descriptor = "(III)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray19[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray19[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method7190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method3177(arg0, arg4, arg2, arg1, arg3);
	}

	@OriginalMember(owner = "client!hm", name = "ba", descriptor = "(II)I")
	@Override
	public int ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray24[arg0][arg1];
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(BLclient!lo;II)V")
	private void method3175(@OriginalArg(1) Class5_Sub2_Sub13_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray4[arg2][arg1];
		@Pc(25) int[] local25 = this.anIntArrayArrayArray8[arg2][arg1];
		@Pc(28) int local28 = local12.length;
		if (Static19.anIntArray575.length < local28) {
			Static214.anIntArray284 = new int[local28];
			Static19.anIntArray575 = new int[local28];
		}
		for (@Pc(40) int local40 = 0; local40 < local28; local40++) {
			Static19.anIntArray575[local40] = local12[local40] >> this.aClass62_Sub1_9.anInt5686;
			Static214.anIntArray284[local40] = local25[local40] >> this.aClass62_Sub1_9.anInt5686;
		}
		@Pc(72) int local72 = 0;
		while (local72 < local28) {
			@Pc(78) int local78 = Static19.anIntArray575[local72];
			@Pc(83) int local83 = Static214.anIntArray284[local72++];
			@Pc(87) int local87 = Static19.anIntArray575[local72];
			@Pc(92) int local92 = Static214.anIntArray284[local72++];
			@Pc(96) int local96 = Static19.anIntArray575[local72];
			@Pc(101) int local101 = Static214.anIntArray284[local72++];
			if (-((local96 - local87) * (local92 + -local83)) + (local92 - local101) * (local78 - local87) > 0) {
				arg0.method4850(local83, local96, local92, local101, local87, local78);
			}
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIZII[[Z)V")
	private void method3177(@OriginalArg(1) int arg0, @OriginalArg(3) boolean arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) boolean[][] arg4) {
		if (this.aClass5_Sub13Array1 == null) {
			return;
		}
		@Pc(11) int local11 = arg2 + arg2 + 1;
		@Pc(15) int local15 = local11 * local11;
		if (Static298.anIntArray407.length < local15) {
			Static298.anIntArray407 = new int[local15];
		}
		@Pc(31) int local31 = arg0 - arg2;
		@Pc(33) int local33 = local31;
		if (local31 < 0) {
			local31 = 0;
		}
		@Pc(45) int local45 = arg3 - arg2;
		@Pc(47) int local47 = local45;
		if (local45 < 0) {
			local45 = 0;
		}
		@Pc(58) int local58 = arg0 + arg2;
		if (super.anInt8873 - 1 < local58) {
			local58 = super.anInt8873 - 1;
		}
		@Pc(77) int local77 = arg2 + arg3;
		Static127.anInt2677 = 0;
		if (local77 > super.anInt8871 - 1) {
			local77 = super.anInt8871 - 1;
		}
		for (@Pc(96) int local96 = local31; local96 <= local58; local96++) {
			@Pc(104) boolean[] local104 = arg4[local96 - local33];
			for (@Pc(106) int local106 = local45; local106 <= local77; local106++) {
				if (local104[local106 - local47]) {
					Static298.anIntArray407[Static127.anInt2677++] = local106 * super.anInt8873 + local96;
				}
			}
		}
		this.aClass62_Sub1_9.method4704();
		this.aClass62_Sub1_9.method4750();
		this.aClass62_Sub1_9.method4760((this.anInt3638 & 0x7) != 0);
		this.aClass62_Sub1_9.method4656(-1, false, false);
		this.aClass62_Sub1_9.method4673(0, this.anInterface16_9);
		for (@Pc(190) int local190 = 0; local190 < this.aClass5_Sub13Array1.length; local190++) {
			this.aClass5_Sub13Array1[local190].method2325(Static298.anIntArray407, Static127.anInt2677);
		}
		@Pc(211) Class78_Sub1 local211 = this.aClass62_Sub1_9.method4744();
		local211.oa(0, -1, 0);
		this.aClass62_Sub1_9.method4679();
		if (!this.aClass99_24.method2523()) {
			@Pc(229) int local229 = this.aClass62_Sub1_9.anInt5673;
			@Pc(233) int local233 = this.aClass62_Sub1_9.anInt5689;
			this.aClass62_Sub1_9.E(0, local233, this.aClass62_Sub1_9.anInt5662);
			this.aClass62_Sub1_9.method4760(false);
			this.aClass62_Sub1_9.method4752(false);
			this.aClass62_Sub1_9.method4754(128);
			this.aClass62_Sub1_9.method4656(-2, false, false);
			this.aClass62_Sub1_9.method4676(this.aClass62_Sub1_9.anInterface12_3);
			this.aClass62_Sub1_9.method4685(Static165.aClass98_2, Static148.aClass98_1);
			this.aClass62_Sub1_9.method4715(Static429.aClass63_6, 0);
			this.aClass62_Sub1_9.method4661(Static44.aClass63_2, 0);
			for (@Pc(295) Class5 local295 = this.aClass99_24.method2526(); local295 != null; local295 = this.aClass99_24.method2519()) {
				@Pc(300) Class5_Sub16 local300 = (Class5_Sub16) local295;
				local300.method2510(arg0, arg2, arg4, arg3);
			}
			this.aClass62_Sub1_9.method4715(Static24.aClass63_4, 0);
			this.aClass62_Sub1_9.method4661(Static24.aClass63_4, 0);
			this.aClass62_Sub1_9.method4676(null);
			this.aClass62_Sub1_9.E(local229, local233, this.aClass62_Sub1_9.anInt5662);
		}
		if (this.aClass128_2 != null) {
			this.aClass62_Sub1_9.method4673(0, this.anInterface16_9);
			this.aClass62_Sub1_9.method4673(1, this.anInterface16_8);
			this.aClass62_Sub1_9.method4713(this.aClass318_14);
			this.aClass128_2.method3090(arg2, arg3, arg0, arg4, arg1);
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(II)V")
	@Override
	public void method7183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!hm", name = "aa", descriptor = "(II)I")
	@Override
	public int aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 >> super.anInt8869;
		@Pc(13) int local13 = arg1 >> super.anInt8869;
		if (local8 < 0 || local13 < 0 || super.anInt8873 - 1 < local8 || local13 > super.anInt8871 - 1) {
			return 0;
		}
		@Pc(48) int local48 = arg0 & super.anInt8874 - 1;
		@Pc(55) int local55 = arg1 & super.anInt8874 - 1;
		@Pc(82) int local82 = this.anIntArrayArray24[local8 + 1][local13] * local48 + (super.anInt8874 - local48) * this.anIntArrayArray24[local8][local13] >> super.anInt8869;
		@Pc(113) int local113 = this.anIntArrayArray24[local8 + 1][local13 + 1] * local48 + this.anIntArrayArray24[local8][local13 + 1] * (super.anInt8874 - local48) >> super.anInt8869;
		return local113 * local55 + (super.anInt8874 - local55) * local82 >> super.anInt8869;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lclient!k;IIIIZ)Z")
	@Override
	public boolean method7185(@OriginalArg(0) Class5_Sub2_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass128_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (this.aClass62_Sub1_9.anInt5664 * arg2 >> 8) >> this.aClass62_Sub1_9.anInt5686;
			@Pc(40) int local40 = arg3 - (arg2 * this.aClass62_Sub1_9.anInt5691 >> 8) >> this.aClass62_Sub1_9.anInt5686;
			return this.aClass128_2.method3089(local25, local40, arg0);
		}
	}

	@OriginalMember(owner = "client!hm", name = "ya", descriptor = "(Lclient!k;IIIIZ)V")
	@Override
	public void ya(@OriginalArg(0) Class5_Sub2_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass128_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass62_Sub1_9.anInt5664 * arg2 >> 8) >> this.aClass62_Sub1_9.anInt5686;
			@Pc(39) int local39 = arg3 - (this.aClass62_Sub1_9.anInt5691 * arg2 >> 8) >> this.aClass62_Sub1_9.anInt5686;
			this.aClass128_2.method3088(local24, arg0, local39);
		}
	}
}
