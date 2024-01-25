import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lw")
public final class Class199_Sub1 extends Class199 {

	@OriginalMember(owner = "client!lw", name = "w", descriptor = "I")
	private int anInt6287;

	@OriginalMember(owner = "client!lw", name = "L", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!lw", name = "P", descriptor = "I")
	private int anInt6295;

	@OriginalMember(owner = "client!lw", name = "eb", descriptor = "I")
	private int anInt6307;

	@OriginalMember(owner = "client!lw", name = "hb", descriptor = "Lclient!ll;")
	private Interface17 anInterface17_12;

	@OriginalMember(owner = "client!lw", name = "ib", descriptor = "I")
	private int anInt6308;

	@OriginalMember(owner = "client!lw", name = "jb", descriptor = "Lclient!ll;")
	private Interface17 anInterface17_13;

	@OriginalMember(owner = "client!lw", name = "kb", descriptor = "[Lclient!uq;")
	private Class6_Sub51[] aClass6_Sub51Array1;

	@OriginalMember(owner = "client!lw", name = "lb", descriptor = "Lclient!sr;")
	public Class293 lb;

	@OriginalMember(owner = "client!lw", name = "v", descriptor = "F")
	private float aFloat120 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!lw", name = "B", descriptor = "F")
	private float aFloat121 = -3.4028235E38F;

	@OriginalMember(owner = "client!lw", name = "q", descriptor = "Lclient!ada;")
	private final Class8 aClass8_32 = new Class8();

	@OriginalMember(owner = "client!lw", name = "r", descriptor = "Lclient!wu;")
	public final Class100_Sub1 aClass100_Sub1_15;

	@OriginalMember(owner = "client!lw", name = "T", descriptor = "I")
	private final int anInt6298;

	@OriginalMember(owner = "client!lw", name = "bb", descriptor = "I")
	private final int anInt6306;

	@OriginalMember(owner = "client!lw", name = "M", descriptor = "[[B")
	private final byte[][] aByteArrayArray104;

	@OriginalMember(owner = "client!lw", name = "db", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!lw", name = "y", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!lw", name = "fb", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!lw", name = "R", descriptor = "[[[Lclient!uq;")
	private Class6_Sub51[][][] aClass6_Sub51ArrayArrayArray1;

	@OriginalMember(owner = "client!lw", name = "H", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!lw", name = "s", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!lw", name = "u", descriptor = "[[S")
	public final short[][] aShortArrayArray8;

	@OriginalMember(owner = "client!lw", name = "S", descriptor = "I")
	public final int anInt6297;

	@OriginalMember(owner = "client!lw", name = "cb", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!lw", name = "O", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!lw", name = "mb", descriptor = "[[B")
	private byte[][] aByteArrayArray105;

	@OriginalMember(owner = "client!lw", name = "G", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!lw", name = "gb", descriptor = "Lclient!he;")
	private Class128 aClass128_21;

	@OriginalMember(owner = "client!lw", name = "E", descriptor = "Lclient!oaa;")
	private Class232 aClass232_2;

	@OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(Lclient!wu;IIII[[I[[II)V")
	public Class199_Sub1(@OriginalArg(0) Class100_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass100_Sub1_15 = arg0;
		this.anInt6298 = super.anInt10104 - 2;
		this.anInt6306 = 0x1 << this.anInt6298;
		this.aByteArrayArray104 = new byte[arg3][arg4];
		this.aFloatArrayArray7 = new float[super.anInt10111 + 1][super.anInt10110 + 1];
		this.anIntArrayArrayArray5 = new int[arg3][arg4][];
		this.aFloatArrayArray8 = new float[super.anInt10111 + 1][super.anInt10110 + 1];
		this.aClass6_Sub51ArrayArrayArray1 = new Class6_Sub51[arg3][arg4][];
		this.anIntArrayArrayArray7 = new int[arg3][arg4][];
		this.anIntArrayArrayArray4 = new int[arg3][arg4][];
		this.aShortArrayArray8 = new short[arg3 * arg4][];
		this.anInt6297 = arg2;
		this.aFloatArrayArray6 = new float[super.anInt10111 + 1][super.anInt10110 + 1];
		this.anIntArrayArrayArray9 = new int[arg3][arg4][];
		this.aByteArrayArray105 = new byte[arg3 + 1][arg4 + 1];
		this.anIntArrayArrayArray6 = new int[arg3][arg4][];
		for (@Pc(121) int local121 = 0; super.anInt10110 >= local121; local121++) {
			for (@Pc(125) int local125 = 0; local125 <= super.anInt10111; local125++) {
				@Pc(134) int local134 = super.anIntArrayArray56[local125][local121];
				if ((float) local134 > this.aFloat121) {
					this.aFloat121 = (float) local134;
				}
				if (this.aFloat120 > (float) local134) {
					this.aFloat120 = (float) local134;
				}
				if (local125 > 0 && local121 > 0 && local125 < super.anInt10111 && local121 < super.anInt10110) {
					@Pc(189) int local189 = arg6[local125 + 1][local121] - arg6[local125 - 1][local121];
					@Pc(205) int local205 = arg6[local125][local121 + 1] - arg6[local125][local121 - 1];
					@Pc(224) float local224 = (float) (1.0D / Math.sqrt((double) (local205 * local205 + local189 * local189 + arg7 * arg7 * 4)));
					this.aFloatArrayArray6[local125][local121] = (float) local189 * local224;
					this.aFloatArrayArray7[local125][local121] = local224 * (float) (-arg7 * 2);
					this.aFloatArrayArray8[local125][local121] = (float) local205 * local224;
				}
			}
		}
		this.aFloat121++;
		this.aFloat120--;
		this.aClass128_21 = new Class128(128);
		if ((this.anInt6297 & 0x10) != 0) {
			this.aClass232_2 = new Class232(this.aClass100_Sub1_15, this);
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(ILclient!wga;II)V")
	private void method5474(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub2_Sub16_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray5[arg2][arg0];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray7[arg2][arg0];
		@Pc(22) int local22 = local12.length;
		if (Static556.anIntArray577.length < local22) {
			Static556.anIntArray577 = new int[local22];
			Static98.anIntArray127 = new int[local22];
		}
		for (@Pc(34) int local34 = 0; local34 < local22; local34++) {
			Static556.anIntArray577[local34] = local12[local34] >> this.aClass100_Sub1_15.anInt7124;
			Static98.anIntArray127[local34] = local19[local34] >> this.aClass100_Sub1_15.anInt7124;
		}
		@Pc(62) int local62 = 0;
		while (local62 < local22) {
			@Pc(68) int local68 = Static556.anIntArray577[local62];
			@Pc(73) int local73 = Static98.anIntArray127[local62++];
			@Pc(77) int local77 = Static556.anIntArray577[local62];
			@Pc(82) int local82 = Static98.anIntArray127[local62++];
			@Pc(86) int local86 = Static556.anIntArray577[local62];
			@Pc(91) int local91 = Static98.anIntArray127[local62++];
			if (-((local82 - local73) * (-local77 + local86)) + (local82 - local91) * (local68 - local77) > 0) {
				arg1.method8768(local68, local91, local82, local73, local86, local77);
			}
		}
	}

	@OriginalMember(owner = "client!lw", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		@Pc(9) Interface4 local9 = this.aClass100_Sub1_15.anInterface4_12;
		if (arg5 != null && this.anIntArrayArrayArray8 == null) {
			this.anIntArrayArrayArray8 = new int[super.anInt10111][super.anInt10110][];
		}
		if (arg3 != null && this.anIntArrayArrayArray6 == null) {
			this.anIntArrayArrayArray6 = new int[super.anInt10111][super.anInt10110][];
		}
		this.anIntArrayArrayArray5[arg0][arg1] = arg2;
		this.anIntArrayArrayArray7[arg0][arg1] = arg4;
		this.anIntArrayArrayArray4[arg0][arg1] = arg6;
		this.anIntArrayArrayArray9[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray8 != null) {
			this.anIntArrayArrayArray8[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray6 != null) {
			this.anIntArrayArrayArray6[arg0][arg1] = arg3;
		}
		@Pc(92) Class6_Sub51[] local92 = this.aClass6_Sub51ArrayArrayArray1[arg0][arg1] = new Class6_Sub51[arg6.length];
		for (@Pc(94) int local94 = 0; local94 < arg6.length; local94++) {
			@Pc(100) int local100 = arg8[local94];
			@Pc(104) int local104 = arg9[local94];
			if ((this.anInt6297 & 0x20) != 0 && local100 != -1 && local9.method895(local100).aBoolean636) {
				local100 = -1;
				local104 = 128;
			}
			@Pc(146) long local146 = (long) local100 | (long) (local104 << 14) | (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42;
			@Pc(152) Class6 local152;
			for (local152 = this.aClass128_21.method3560(local146); local152 != null; local152 = this.aClass128_21.method3553()) {
				@Pc(157) Class6_Sub51 local157 = (Class6_Sub51) local152;
				if (local157.anInt9816 == local100 && (float) local104 == local157.aFloat195 && arg10 == local157.anInt9818 && local157.anInt9815 == arg11 && local157.anInt9812 == arg12) {
					break;
				}
			}
			if (local152 == null) {
				local92[local94] = new Class6_Sub51(this, local100, local104, arg10, arg11, arg12);
				this.aClass128_21.method3551(local146, local92[local94]);
			} else {
				local92[local94] = (Class6_Sub51) local152;
			}
		}
		if (arg13) {
			this.aByteArrayArray104[arg0][arg1] = (byte) (this.aByteArrayArray104[arg0][arg1] | 0x1);
		}
		if (this.anInt6308 < arg6.length) {
			this.anInt6308 = arg6.length;
		}
		this.anInt6307 += arg6.length;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(II)V")
	@Override
	public void method8528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method8527(@OriginalArg(0) Class6_Sub2_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass232_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass100_Sub1_15.anInt7153 >> 8) >> this.aClass100_Sub1_15.anInt7124;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass100_Sub1_15.anInt7145 >> 8) >> this.aClass100_Sub1_15.anInt7124;
			return this.aClass232_2.method6340(local39, local24, arg0);
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method8523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method5476(arg3, arg1, arg4, arg2, arg5, -1, arg0);
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method8535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method5476(arg3, arg1, arg4, arg2, arg6, arg5, arg0);
	}

	@OriginalMember(owner = "client!lw", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class6_Sub2_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass232_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass100_Sub1_15.anInt7153 * arg2 >> 8) >> this.aClass100_Sub1_15.anInt7124;
			@Pc(38) int local38 = arg3 - (arg2 * this.aClass100_Sub1_15.anInt7145 >> 8) >> this.aClass100_Sub1_15.anInt7124;
			this.aClass232_2.method6341(local38, local24, arg0);
		}
	}

	@OriginalMember(owner = "client!lw", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class6_Sub2_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass232_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass100_Sub1_15.anInt7153 >> 8) >> this.aClass100_Sub1_15.anInt7124;
			@Pc(39) int local39 = arg3 - (this.aClass100_Sub1_15.anInt7145 * arg2 >> 8) >> this.aClass100_Sub1_15.anInt7124;
			this.aClass232_2.method6333(arg0, local24, local39);
		}
	}

	@OriginalMember(owner = "client!lw", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.anInt6307 <= 0) {
			this.aClass232_2 = null;
		} else {
			@Pc(26) byte[][] local26 = new byte[super.anInt10111 + 1][super.anInt10110 + 1];
			for (@Pc(28) int local28 = 1; local28 < super.anInt10111; local28++) {
				for (@Pc(32) int local32 = 1; local32 < super.anInt10110; local32++) {
					local26[local28][local32] = (byte) ((this.aByteArrayArray105[local28][local32 - 1] >> 2) + (this.aByteArrayArray105[local28 - 1][local32] >> 2) + (this.aByteArrayArray105[local28 - -1][local32] >> 3) + (this.aByteArrayArray105[local28][local32 + 1] >> 3) + (this.aByteArrayArray105[local28][local32] >> 1));
				}
			}
			@Pc(108) Class6_Sub51[] local108 = new Class6_Sub51[this.aClass128_21.method3554()];
			this.aClass128_21.method3561(local108);
			for (@Pc(116) int local116 = 0; local116 < local108.length; local116++) {
				local108[local116].method8287(this.anInt6307);
			}
			@Pc(132) int local132 = 20;
			if (this.anIntArrayArrayArray8 != null) {
				local132 += 4;
			}
			if ((this.anInt6297 & 0x7) != 0) {
				local132 += 12;
			}
			@Pc(152) NativeHeapBuffer local152 = this.aClass100_Sub1_15.aNativeHeap4.a(this.anInt6307 * 4, false);
			@Pc(162) NativeHeapBuffer local162 = this.aClass100_Sub1_15.aNativeHeap4.a(local132 * this.anInt6307, false);
			@Pc(167) Stream local167 = new Stream(local162);
			@Pc(172) Stream local172 = new Stream(local152);
			@Pc(176) Class6_Sub51[] local176 = new Class6_Sub51[this.anInt6307];
			@Pc(183) int local183 = Static600.method8449(this.anInt6307 / 4);
			if (local183 < 1) {
				local183 = 1;
			}
			@Pc(193) Class128 local193 = new Class128(local183);
			@Pc(197) Class6_Sub51[] local197 = new Class6_Sub51[this.anInt6308];
			@Pc(203) int local203;
			for (@Pc(199) int local199 = 0; super.anInt10111 > local199; local199++) {
				for (local203 = 0; super.anInt10110 > local203; local203++) {
					if (this.anIntArrayArrayArray4[local199][local203] != null) {
						@Pc(219) Class6_Sub51[] local219 = this.aClass6_Sub51ArrayArrayArray1[local199][local203];
						@Pc(226) int[] local226 = this.anIntArrayArrayArray5[local199][local203];
						@Pc(233) int[] local233 = this.anIntArrayArrayArray7[local199][local203];
						@Pc(240) int[] local240 = this.anIntArrayArrayArray9[local199][local203];
						@Pc(247) int[] local247 = this.anIntArrayArrayArray4[local199][local203];
						@Pc(259) int[] local259 = this.anIntArrayArrayArray6 == null ? null : this.anIntArrayArrayArray6[local199][local203];
						if (local240 == null) {
							local240 = local247;
						}
						@Pc(275) int[] local275 = this.anIntArrayArrayArray8 == null ? null : this.anIntArrayArrayArray8[local199][local203];
						@Pc(282) float local282 = this.aFloatArrayArray6[local199][local203];
						@Pc(289) float local289 = this.aFloatArrayArray7[local199][local203];
						@Pc(296) float local296 = this.aFloatArrayArray8[local199][local203];
						@Pc(305) float local305 = this.aFloatArrayArray6[local199][local203 + 1];
						@Pc(314) float local314 = this.aFloatArrayArray7[local199][local203 + 1];
						@Pc(323) float local323 = this.aFloatArrayArray8[local199][local203 + 1];
						@Pc(334) float local334 = this.aFloatArrayArray6[local199 + 1][local203 + 1];
						@Pc(345) float local345 = this.aFloatArrayArray7[local199 + 1][local203 + 1];
						@Pc(356) float local356 = this.aFloatArrayArray8[local199 + 1][local203 + 1];
						@Pc(365) float local365 = this.aFloatArrayArray6[local199 + 1][local203];
						@Pc(374) float local374 = this.aFloatArrayArray7[local199 + 1][local203];
						@Pc(383) float local383 = this.aFloatArrayArray8[local199 + 1][local203];
						@Pc(391) int local391 = local26[local199][local203] & 0xFF;
						@Pc(401) int local401 = local26[local199][local203 + 1] & 0xFF;
						@Pc(413) int local413 = local26[local199 + 1][local203 + 1] & 0xFF;
						@Pc(423) int local423 = local26[local199 + 1][local203] & 0xFF;
						@Pc(425) int local425 = 0;
						@Pc(435) int local435;
						label357: for (@Pc(427) int local427 = 0; local427 < local247.length; local427++) {
							@Pc(433) Class6_Sub51 local433 = local219[local427];
							for (local435 = 0; local435 < local425; local435++) {
								if (local433 == local197[local435]) {
									continue label357;
								}
							}
							local197[local425++] = local433;
						}
						@Pc(472) short[] local472 = this.aShortArrayArray8[local199 + local203 * super.anInt10111] = new short[local247.length];
						for (local435 = 0; local435 < local247.length; local435++) {
							@Pc(486) int local486 = (local199 << super.anInt10104) + local226[local435];
							@Pc(496) int local496 = (local203 << super.anInt10104) + local233[local435];
							@Pc(501) int local501 = local486 >> this.anInt6298;
							@Pc(506) int local506 = local496 >> this.anInt6298;
							@Pc(510) int local510 = local247[local435];
							@Pc(514) int local514 = local240[local435];
							@Pc(522) int local522 = local259 == null ? 0 : local259[local435];
							@Pc(540) long local540 = (long) (local501 << 16) | (long) local510 << 32 | (long) local514 << 48 | (long) local506;
							@Pc(544) int local544 = local226[local435];
							@Pc(548) int local548 = local233[local435];
							@Pc(550) byte local550 = 74;
							@Pc(552) int local552 = 0;
							@Pc(554) float local554 = 1.0F;
							@Pc(568) float local568;
							@Pc(562) float local562;
							@Pc(560) float local560;
							@Pc(667) float local667;
							@Pc(566) int local566;
							if (local544 == 0 && local548 == 0) {
								local560 = local296;
								local562 = local289;
								local566 = local550 - local391;
								local568 = local282;
							} else if (local544 == 0 && super.anInt10112 == local548) {
								local568 = local305;
								local560 = local323;
								local566 = local550 - local401;
								local562 = local314;
							} else if (local544 == super.anInt10112 && local548 == super.anInt10112) {
								local568 = local334;
								local562 = local345;
								local566 = local550 - local413;
								local560 = local356;
							} else if (local544 == super.anInt10112 && local548 == 0) {
								local566 = local550 - local423;
								local568 = local365;
								local562 = local374;
								local560 = local383;
							} else {
								@Pc(643) float local643 = (float) local544 / (float) super.anInt10112;
								@Pc(650) float local650 = (float) local548 / (float) super.anInt10112;
								@Pc(659) float local659 = local643 * (local365 - local282) + local282;
								local667 = (local374 - local289) * local643 + local289;
								@Pc(676) float local676 = local296 + (local383 - local296) * local643;
								@Pc(685) float local685 = (local334 - local305) * local643 + local305;
								@Pc(693) float local693 = local314 + local643 * (local345 - local314);
								local568 = local659 + (local685 - local659) * local650;
								local562 = local650 * (local693 - local667) + local667;
								@Pc(718) float local718 = local323 + local643 * (local356 - local323);
								local560 = local676 + (local718 - local676) * local650;
								@Pc(737) int local737 = local391 + (local544 * (local423 - local391) >> super.anInt10104);
								@Pc(750) int local750 = local401 + ((local413 - local401) * local544 >> super.anInt10104);
								local566 = local550 - ((local750 - local737) * local548 >> super.anInt10104) - local737;
							}
							if (local510 != -1) {
								@Pc(786) int local786 = (local510 & 0x7F) * local566 >> 7;
								if (local786 < 2) {
									local786 = 2;
								} else if (local786 > 126) {
									local786 = 126;
								}
								if ((this.anInt6297 & 0x7) == 0) {
									local554 = local560 * this.aClass100_Sub1_15.aFloatArray60[2] + this.aClass100_Sub1_15.aFloatArray60[0] * local568 + local562 * this.aClass100_Sub1_15.aFloatArray60[1];
									local554 = this.aClass100_Sub1_15.aFloat126 + local554 * (local554 > 0.0F ? this.aClass100_Sub1_15.aFloat132 : this.aClass100_Sub1_15.aFloat139);
								}
								local552 = Static91.anIntArray99[local510 & 0xFF80 | local786];
							}
							@Pc(860) Class6 local860 = null;
							if ((local486 & this.anInt6306 - 1) == 0 && (local496 & this.anInt6306 - 1) == 0) {
								local860 = local193.method3560(local540);
							}
							@Pc(896) int local896;
							@Pc(954) int local954;
							if (local860 == null) {
								if (local510 == local514) {
									local954 = local552;
								} else {
									@Pc(932) int local932 = (local514 & 0x7F) * local566 >> 7;
									if (local932 < 2) {
										local932 = 2;
									} else if (local932 > 126) {
										local932 = 126;
									}
									local954 = Static91.anIntArray99[local514 & 0xFF80 | local932];
									if ((this.anInt6297 & 0x7) == 0) {
										@Pc(982) float local982 = local568 * this.aClass100_Sub1_15.aFloatArray60[0] + local562 * this.aClass100_Sub1_15.aFloatArray60[1] + this.aClass100_Sub1_15.aFloatArray60[2] * local560;
										local667 = (local554 > 0.0F ? this.aClass100_Sub1_15.aFloat132 : this.aClass100_Sub1_15.aFloat139) * local554 + this.aClass100_Sub1_15.aFloat126;
										@Pc(1007) int local1007 = local954 >> 16 & 0xFF;
										@Pc(1013) int local1013 = local954 >> 8 & 0xFF;
										@Pc(1017) int local1017 = local954 & 0xFF;
										local1007 = (int) ((float) local1007 * local667);
										local1013 = (int) ((float) local1013 * local667);
										if (local1007 < 0) {
											local1007 = 0;
										} else if (local1007 > 255) {
											local1007 = 255;
										}
										local1017 = (int) ((float) local1017 * local667);
										if (local1013 < 0) {
											local1013 = 0;
										} else if (local1013 > 255) {
											local1013 = 255;
										}
										if (local1017 < 0) {
											local1017 = 0;
										} else if (local1017 > 255) {
											local1017 = 255;
										}
										local954 = local1007 << 16 | local1013 << 8 | local1017;
									}
								}
								if (Stream.b()) {
									local167.a((float) local486);
									local167.a((float) (local522 + this.method8531(local496, local486)));
									local167.a((float) local496);
									local167.a((float) local486);
									local167.a((float) local496);
									if (this.anIntArrayArrayArray8 != null) {
										local167.a((float) (local275 == null ? 0 : local275[local435] - 1));
									}
									if ((this.anInt6297 & 0x7) != 0) {
										local167.a(local568);
										local167.a(local562);
										local167.a(local560);
									}
								} else {
									local167.b((float) local486);
									local167.b((float) (this.method8531(local496, local486) + local522));
									local167.b((float) local496);
									local167.b((float) local486);
									local167.b((float) local496);
									if (this.anIntArrayArrayArray8 != null) {
										local167.b((float) (local275 == null ? 0 : local275[local435] - 1));
									}
									if ((this.anInt6297 & 0x7) != 0) {
										local167.b(local568);
										local167.b(local562);
										local167.b(local560);
									}
								}
								if (this.aClass100_Sub1_15.anInt7154 == 0) {
									local172.e(local954 | 0xFF000000);
								} else {
									local172.c(local954 | 0xFF000000);
								}
								local896 = this.anInt6287++;
								local472[local435] = (short) local896;
								if (local510 != -1) {
									local176[local896] = local219[local435];
								}
								local193.method3551(local540, new Class6_Sub36(local472[local435]));
							} else {
								local472[local435] = ((Class6_Sub36) local860).aShort92;
								local896 = local472[local435] & 0xFFFF;
								if (local510 != -1 && local176[local896].aLong278 > local219[local435].aLong278) {
									local176[local896] = local219[local435];
								}
							}
							for (local954 = 0; local954 < local425; local954++) {
								local197[local954].method8285(local552, local896, local566, local554);
							}
							this.anInt6295++;
						}
					}
				}
			}
			for (local203 = 0; local203 < this.anInt6287; local203++) {
				@Pc(1313) Class6_Sub51 local1313 = local176[local203];
				if (local1313 != null) {
					local1313.method8280(local203);
				}
			}
			@Pc(1334) int local1334;
			@Pc(1352) int local1352;
			for (@Pc(1330) int local1330 = 0; local1330 < super.anInt10111; local1330++) {
				for (local1334 = 0; super.anInt10110 > local1334; local1334++) {
					@Pc(1346) short[] local1346 = this.aShortArrayArray8[local1330 + local1334 * super.anInt10111];
					if (local1346 != null) {
						@Pc(1350) int local1350 = 0;
						local1352 = 0;
						while (local1352 < local1346.length) {
							@Pc(1361) int local1361 = local1346[local1352++] & 0xFFFF;
							@Pc(1368) int local1368 = local1346[local1352++] & 0xFFFF;
							@Pc(1375) int local1375 = local1346[local1352++] & 0xFFFF;
							@Pc(1379) Class6_Sub51 local1379 = local176[local1361];
							@Pc(1383) Class6_Sub51 local1383 = local176[local1368];
							@Pc(1387) Class6_Sub51 local1387 = local176[local1375];
							@Pc(1389) Class6_Sub51 local1389 = null;
							if (local1379 != null) {
								local1389 = local1379;
								local1379.method8282(local1350, local1330, local1334);
							}
							if (local1383 != null) {
								local1383.method8282(local1350, local1330, local1334);
								if (local1389 == null || local1383.aLong278 < local1389.aLong278) {
									local1389 = local1383;
								}
							}
							if (local1387 != null) {
								local1387.method8282(local1350, local1330, local1334);
								if (local1389 == null || local1387.aLong278 < local1389.aLong278) {
									local1389 = local1387;
								}
							}
							if (local1389 != null) {
								if (local1379 != null) {
									local1389.method8280(local1361);
								}
								if (local1383 != null) {
									local1389.method8280(local1368);
								}
								if (local1387 != null) {
									local1389.method8280(local1375);
								}
								local1389.method8282(local1350, local1330, local1334);
							}
							local1350++;
						}
					}
				}
			}
			local167.c();
			local172.c();
			this.anInterface17_12 = this.aClass100_Sub1_15.method6123(false);
			this.anInterface17_12.method8441(4, local152, this.anInt6287 * 4);
			this.anInterface17_13 = this.aClass100_Sub1_15.method6123(false);
			this.anInterface17_13.method8441(local132, local162, local132 * this.anInt6287);
			if ((this.anInt6297 & 0x7) == 0) {
				if (this.anIntArrayArrayArray8 == null) {
					this.lb = this.aClass100_Sub1_15.method6041(new Class41[] { new Class41(new Class362[] { Static610.aClass362_1, Static610.aClass362_5 }), new Class41(Static610.aClass362_3) });
				} else {
					this.lb = this.aClass100_Sub1_15.method6041(new Class41[] { new Class41(new Class362[] { Static610.aClass362_1, Static610.aClass362_5, Static610.aClass362_4 }), new Class41(Static610.aClass362_3) });
				}
			} else if (this.anIntArrayArrayArray8 == null) {
				this.lb = this.aClass100_Sub1_15.method6041(new Class41[] { new Class41(new Class362[] { Static610.aClass362_1, Static610.aClass362_5, Static610.aClass362_2 }), new Class41(Static610.aClass362_3) });
			} else {
				this.lb = this.aClass100_Sub1_15.method6041(new Class41[] { new Class41(new Class362[] { Static610.aClass362_1, Static610.aClass362_5, Static610.aClass362_4, Static610.aClass362_2 }), new Class41(Static610.aClass362_3) });
			}
			local1334 = 0;
			for (@Pc(1685) int local1685 = 0; local1685 < local108.length; local1685++) {
				if (local108[local1685].anInt9819 > 0) {
					local108[local1334++] = local108[local1685];
				}
			}
			this.aClass6_Sub51Array1 = new Class6_Sub51[local1334];
			@Pc(1711) long[] local1711 = new long[local1334];
			for (local1352 = 0; local1352 < local1334; local1352++) {
				@Pc(1719) Class6_Sub51 local1719 = local108[local1352];
				local1711[local1352] = local1719.aLong278;
				this.aClass6_Sub51Array1[local1352] = local1719;
				local1719.method8279(this.anInt6287);
			}
			Static571.method8295(local1711, this.aClass6_Sub51Array1);
			if (this.aClass232_2 != null) {
				this.aClass232_2.method6334();
			}
		}
		this.anIntArrayArrayArray4 = null;
		this.anIntArrayArrayArray6 = null;
		this.aByteArrayArray105 = null;
		this.anIntArrayArrayArray5 = this.anIntArrayArrayArray7 = null;
		this.aClass6_Sub51ArrayArrayArray1 = null;
		this.anIntArrayArrayArray8 = null;
		this.aFloatArrayArray6 = this.aFloatArrayArray7 = this.aFloatArrayArray8 = null;
		this.anIntArrayArrayArray9 = null;
		this.aClass128_21 = null;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lclient!raa;[I)V")
	@Override
	public void method8526(@OriginalArg(0) Class6_Sub1 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass8_32.method157(new Class6_Sub39(this.aClass100_Sub1_15, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(I[[ZIZIIII)V")
	private void method5476(@OriginalArg(1) boolean[][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (this.aClass6_Sub51Array1 == null) {
			return;
		}
		@Pc(22) int local22 = arg3 + arg3 + 1;
		@Pc(26) int local26 = local22 * local22;
		if (local26 > Static619.anIntArray616.length) {
			Static619.anIntArray616 = new int[local26];
		}
		@Pc(38) int local38 = arg6 - arg3;
		@Pc(40) int local40 = local38;
		if (local38 < 0) {
			local38 = 0;
		}
		@Pc(49) int local49 = arg1 - arg3;
		@Pc(51) int local51 = local49;
		if (local49 < 0) {
			local49 = 0;
		}
		@Pc(60) int local60 = arg6 + arg3;
		if (local60 > super.anInt10111 - 1) {
			local60 = super.anInt10111 - 1;
		}
		@Pc(80) int local80 = arg1 + arg3;
		if (local80 > super.anInt10110 - 1) {
			local80 = super.anInt10110 - 1;
		}
		Static475.anInt8299 = 0;
		for (@Pc(99) int local99 = local38; local99 <= local60; local99++) {
			@Pc(107) boolean[] local107 = arg0[local99 - local40];
			for (@Pc(109) int local109 = local49; local109 <= local80; local109++) {
				if (local107[local109 - local51]) {
					Static619.anIntArray616[Static475.anInt8299++] = local109 * super.anInt10111 + local99;
				}
			}
		}
		if (arg5 == -1) {
			this.aClass100_Sub1_15.method6150();
		} else {
			this.aClass100_Sub1_15.method6032((float) arg5);
			this.aClass100_Sub1_15.method6121();
		}
		this.aClass100_Sub1_15.method6096();
		this.aClass100_Sub1_15.method6075((this.anInt6297 & 0x7) != 0);
		this.aClass100_Sub1_15.method6137(false, false, -1);
		this.aClass100_Sub1_15.method6128(0, this.anInterface17_13);
		for (@Pc(194) int local194 = 0; local194 < this.aClass6_Sub51Array1.length; local194++) {
			this.aClass6_Sub51Array1[local194].method8286(Static619.anIntArray616, Static475.anInt8299);
		}
		@Pc(219) Class154_Sub2 local219 = this.aClass100_Sub1_15.method6073();
		local219.method6559(0, -1, 0);
		this.aClass100_Sub1_15.method6145();
		if (!this.aClass8_32.method151()) {
			@Pc(237) int local237 = this.aClass100_Sub1_15.anInt7158;
			@Pc(241) int local241 = this.aClass100_Sub1_15.anInt7148;
			this.aClass100_Sub1_15.L(0, local241, this.aClass100_Sub1_15.anInt7152);
			this.aClass100_Sub1_15.method6075(false);
			this.aClass100_Sub1_15.method6133(false);
			this.aClass100_Sub1_15.method6144(128);
			this.aClass100_Sub1_15.method6137(false, false, -2);
			this.aClass100_Sub1_15.method6033(this.aClass100_Sub1_15.anInterface1_3);
			this.aClass100_Sub1_15.method6039(Static436.aClass256_4, Static266.aClass256_3);
			this.aClass100_Sub1_15.method6068(0, Static456.aClass187_2);
			this.aClass100_Sub1_15.method6146(0, Static200.aClass187_1);
			for (@Pc(301) Class6 local301 = this.aClass8_32.method149(); local301 != null; local301 = this.aClass8_32.method155()) {
				@Pc(306) Class6_Sub39 local306 = (Class6_Sub39) local301;
				local306.method7142(arg3, arg1, arg0, arg6);
			}
			this.aClass100_Sub1_15.method6068(0, Static622.aClass187_4);
			this.aClass100_Sub1_15.method6146(0, Static622.aClass187_4);
			this.aClass100_Sub1_15.method6033((Interface1) null);
			this.aClass100_Sub1_15.L(local237, local241, this.aClass100_Sub1_15.anInt7152);
		}
		if (this.aClass232_2 == null) {
			return;
		}
		this.aClass100_Sub1_15.method6128(0, this.anInterface17_13);
		this.aClass100_Sub1_15.method6128(1, this.anInterface17_12);
		this.aClass100_Sub1_15.method6107(this.lb);
		this.aClass232_2.method6335(arg3, arg0, arg6, arg1, arg2);
		return;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method8529(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt6307 <= 0) {
			return;
		}
		@Pc(19) Interface11 local19 = this.aClass100_Sub1_15.method6143(this.anInt6295);
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = 32767;
		@Pc(25) int local25 = -32768;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			local21 = 0;
			@Pc(36) Buffer local36 = local19.method3077();
			if (local36 != null) {
				@Pc(44) Stream local44 = this.aClass100_Sub1_15.method6131(local36);
				@Pc(48) int local48;
				@Pc(57) int local57;
				@Pc(59) int local59;
				@Pc(78) short[] local78;
				@Pc(82) int local82;
				@Pc(90) int local90;
				if (Stream.b()) {
					for (local48 = arg1; local48 < arg3; local48++) {
						local57 = arg0 + local48 * super.anInt10111;
						for (local59 = arg0; local59 < arg2; local59++) {
							if (arg4[local59 - arg0][local48 - arg1]) {
								local78 = this.aShortArrayArray8[local57];
								if (local78 != null) {
									for (local82 = 0; local82 < local78.length; local82++) {
										local90 = local78[local82] & 0xFFFF;
										local44.d(local90);
										if (local90 > local25) {
											local25 = local90;
										}
										if (local90 < local23) {
											local23 = local90;
										}
										local21++;
									}
								}
							}
							local57++;
						}
					}
				} else {
					for (local48 = arg1; local48 < arg3; local48++) {
						local57 = super.anInt10111 * local48 + arg0;
						for (local59 = arg0; local59 < arg2; local59++) {
							if (arg4[local59 - arg0][local48 - arg1]) {
								local78 = this.aShortArrayArray8[local57];
								if (local78 != null) {
									for (local82 = 0; local82 < local78.length; local82++) {
										local90 = local78[local82] & 0xFFFF;
										if (local90 > local25) {
											local25 = local90;
										}
										local44.a(local90);
										local21++;
										if (local90 < local23) {
											local23 = local90;
										}
									}
								}
							}
							local57++;
						}
					}
				}
				local44.c();
				if (local19.method3078()) {
					break;
				}
			}
		}
		if (local21 <= 0) {
			return;
		}
		this.aClass100_Sub1_15.method6066();
		this.aClass100_Sub1_15.method6141(false);
		this.aClass100_Sub1_15.method6075(false);
		this.aClass100_Sub1_15.method6037(false);
		this.aClass100_Sub1_15.method6133(false);
		this.aClass100_Sub1_15.method6144(0);
		this.aClass100_Sub1_15.method6137(false, false, -2);
		this.aClass100_Sub1_15.method6033((Interface1) null);
		@Pc(274) Class154_Sub2 local274 = this.aClass100_Sub1_15.method6073();
		@Pc(279) float[] local279 = this.aClass100_Sub1_15.method6029();
		local279[6] = 0.0F;
		local279[7] = 0.0F;
		local279[3] = 0.0F;
		local279[13] = 1.0F - ((float) (arg3 * 1024) / 128.0F + (float) 0) / (float) this.aClass100_Sub1_15.anInt7091;
		local279[9] = 0.0F;
		local279[5] = (float) 1024 / ((float) this.aClass100_Sub1_15.anInt7091 * 128.0F * (float) super.anInt10112);
		local279[4] = 0.0F;
		local279[1] = 0.0F;
		local279[15] = 1.0F;
		local279[2] = 0.0F;
		local279[11] = 0.0F;
		local279[14] = -this.aFloat120 / (this.aFloat121 - this.aFloat120);
		local279[12] = -1.0F - ((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass100_Sub1_15.anInt7000;
		local279[0] = (float) 1024 / ((float) super.anInt10112 * 128.0F * (float) this.aClass100_Sub1_15.anInt7000);
		local279[8] = 0.0F;
		local279[10] = 1.0F / (this.aFloat121 - this.aFloat120);
		local274.method4513(0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F);
		this.aClass100_Sub1_15.method6134();
		this.aClass100_Sub1_15.method6145();
		if ((this.anInt6297 & 0x7) == 0) {
			this.aClass100_Sub1_15.method6075(false);
		} else {
			this.aClass100_Sub1_15.method6075(true);
			this.aClass100_Sub1_15.method6109();
		}
		this.aClass100_Sub1_15.method6071(false);
		this.aClass100_Sub1_15.method6128(0, this.anInterface17_13);
		this.aClass100_Sub1_15.method6128(1, this.anInterface17_12);
		this.aClass100_Sub1_15.method6107(this.lb);
		this.aClass100_Sub1_15.method6064(local21 / 3, 0, local25 + 1 - local23, local23, local19, Static295.aClass77_2);
		this.aClass100_Sub1_15.method6071(true);
	}

	@OriginalMember(owner = "client!lw", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray105[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray105[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!lw", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class6_Sub2_Sub16 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub2_Sub16 arg2) {
		if ((this.aByteArrayArray104[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(21) int local21 = super.anInt10112 >> this.aClass100_Sub1_15.anInt7124;
		@Pc(24) Class6_Sub2_Sub16_Sub2 local24 = (Class6_Sub2_Sub16_Sub2) arg2;
		@Pc(40) Class6_Sub2_Sub16_Sub2 local40;
		if (local24 != null && local24.method8763(local21, local21)) {
			local40 = local24;
			local24.method8766();
		} else {
			local40 = new Class6_Sub2_Sub16_Sub2(this.aClass100_Sub1_15, local21, local21);
		}
		local40.method8767(0, local21, 0, local21);
		this.method5474(arg1, local40, arg0);
		return local40;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method8530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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
}
