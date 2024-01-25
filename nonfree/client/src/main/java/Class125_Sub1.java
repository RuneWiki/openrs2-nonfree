import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jk")
public final class Class125_Sub1 extends Class125 {

	@OriginalMember(owner = "client!jk", name = "n", descriptor = "I")
	private int anInt3299;

	@OriginalMember(owner = "client!jk", name = "q", descriptor = "I")
	private int anInt3302;

	@OriginalMember(owner = "client!jk", name = "J", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!jk", name = "V", descriptor = "Lclient!pp;")
	public Class195 aClass195_4;

	@OriginalMember(owner = "client!jk", name = "X", descriptor = "I")
	private int anInt3318;

	@OriginalMember(owner = "client!jk", name = "Y", descriptor = "[Lclient!gh;")
	private Class5_Sub16[] aClass5_Sub16Array1;

	@OriginalMember(owner = "client!jk", name = "ab", descriptor = "Lclient!pp;")
	public Class195 aClass195_5;

	@OriginalMember(owner = "client!jk", name = "db", descriptor = "Lclient!pp;")
	private Class195 aClass195_6;

	@OriginalMember(owner = "client!jk", name = "eb", descriptor = "Lclient!ql;")
	private Interface12 anInterface12_2;

	@OriginalMember(owner = "client!jk", name = "gb", descriptor = "I")
	private int anInt3321;

	@OriginalMember(owner = "client!jk", name = "hb", descriptor = "Lclient!pp;")
	public Class195 aClass195_7;

	@OriginalMember(owner = "client!jk", name = "A", descriptor = "Lclient!nv;")
	private final Class177 aClass177_18 = new Class177();

	@OriginalMember(owner = "client!jk", name = "x", descriptor = "Lclient!tt;")
	public final Class200_Sub2 aClass200_Sub2_26;

	@OriginalMember(owner = "client!jk", name = "w", descriptor = "[[I")
	private final int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!jk", name = "D", descriptor = "I")
	private final int anInt3308;

	@OriginalMember(owner = "client!jk", name = "W", descriptor = "[[F")
	private float[][] aFloatArrayArray9;

	@OriginalMember(owner = "client!jk", name = "T", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!jk", name = "l", descriptor = "[[S")
	public final short[][] aShortArrayArray7;

	@OriginalMember(owner = "client!jk", name = "M", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!jk", name = "y", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!jk", name = "u", descriptor = "[[[Lclient!gh;")
	private Class5_Sub16[][][] aClass5_Sub16ArrayArrayArray1;

	@OriginalMember(owner = "client!jk", name = "m", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!jk", name = "cb", descriptor = "[[B")
	private byte[][] aByteArrayArray11;

	@OriginalMember(owner = "client!jk", name = "i", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!jk", name = "h", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!jk", name = "z", descriptor = "[[B")
	private final byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!jk", name = "P", descriptor = "I")
	public final int anInt3315;

	@OriginalMember(owner = "client!jk", name = "s", descriptor = "I")
	private final int anInt3304;

	@OriginalMember(owner = "client!jk", name = "S", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!jk", name = "fb", descriptor = "Lclient!vg;")
	private Class252 aClass252_21;

	@OriginalMember(owner = "client!jk", name = "E", descriptor = "Lclient!hm;")
	private Class103 aClass103_1;

	static {
		new Class198("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
	}

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Lclient!tt;IIII[[I[[II)V")
	public Class125_Sub1(@OriginalArg(0) Class200_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.aClass200_Sub2_26 = arg0;
		this.anIntArrayArray22 = arg5;
		this.anInt3308 = super.anInt6300 - 2;
		this.aFloatArrayArray9 = new float[super.anInt6301 + 1][super.anInt6299 + 1];
		this.aFloatArrayArray8 = new float[super.anInt6301 + 1][super.anInt6299 + 1];
		this.aShortArrayArray7 = new short[arg4 * arg3][];
		this.anIntArrayArrayArray9 = new int[arg3][arg4][];
		this.anIntArrayArrayArray7 = new int[arg3][arg4][];
		this.aClass5_Sub16ArrayArrayArray1 = new Class5_Sub16[arg3][arg4][];
		this.anIntArrayArrayArray6 = new int[arg3][arg4][];
		this.aByteArrayArray11 = new byte[arg3 + 1][arg4 + 1];
		this.anIntArrayArrayArray5 = new int[arg3][arg4][];
		this.anIntArrayArrayArray4 = new int[arg3][arg4][];
		this.aByteArrayArray10 = new byte[arg3][arg4];
		this.anInt3315 = arg2;
		this.anInt3304 = 0x1 << this.anInt3308;
		this.aFloatArrayArray7 = new float[super.anInt6301 + 1][super.anInt6299 + 1];
		for (@Pc(117) int local117 = 1; super.anInt6299 > local117; local117++) {
			for (@Pc(121) int local121 = 1; super.anInt6301 > local121; local121++) {
				@Pc(140) int local140 = arg6[local121 + 1][local117] - arg6[local121 - 1][local117];
				@Pc(156) int local156 = arg6[local121][local117 + 1] - arg6[local121][local117 - 1];
				@Pc(175) float local175 = (float) (1.0D / Math.sqrt((double) (local156 * local156 + arg7 * arg7 * 4 + local140 * local140)));
				this.aFloatArrayArray8[local121][local117] = (float) local140 * local175;
				this.aFloatArrayArray9[local121][local117] = local175 * (float) (-arg7 * 2);
				this.aFloatArrayArray7[local121][local117] = local175 * (float) local156;
			}
		}
		this.aClass252_21 = new Class252(128);
		if ((this.anInt3315 & 0x10) != 0) {
			this.aClass103_1 = new Class103(this.aClass200_Sub2_26, this);
		}
	}

	@OriginalMember(owner = "client!jk", name = "ba", descriptor = "(Lclient!i;IIIIZ)V")
	@Override
	public void ba(@OriginalArg(0) Class5_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass103_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass200_Sub2_26.anInt6731 * arg2 >> 8) >> this.aClass200_Sub2_26.anInt6721;
			@Pc(39) int local39 = arg3 - (this.aClass200_Sub2_26.anInt6737 * arg2 >> 8) >> this.aClass200_Sub2_26.anInt6721;
			this.aClass103_1.method2225(local39, local24, arg0);
		}
	}

	@OriginalMember(owner = "client!jk", name = "OA", descriptor = "(IILclient!i;)Lclient!i;")
	@Override
	public Class5_Sub2_Sub1 OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub2_Sub1 arg2) {
		if ((this.aByteArrayArray10[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(21) int local21 = super.anInt6303 >> this.aClass200_Sub2_26.anInt6721;
		@Pc(24) Class5_Sub2_Sub1_Sub1 local24 = (Class5_Sub2_Sub1_Sub1) arg2;
		@Pc(34) Class5_Sub2_Sub1_Sub1 local34;
		if (local24 != null && local24.method144(local21, local21)) {
			local34 = local24;
			local24.method150();
		} else {
			local34 = new Class5_Sub2_Sub1_Sub1(this.aClass200_Sub2_26, local21, local21);
		}
		local34.method147(local21, local21, 0, 0);
		this.method2659(arg0, local34, arg1);
		return local34;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lclient!i;IIIIZ)Z")
	@Override
	public boolean method4991(@OriginalArg(0) Class5_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass103_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (this.aClass200_Sub2_26.anInt6731 * arg2 >> 8) >> this.aClass200_Sub2_26.anInt6721;
			@Pc(40) int local40 = arg3 - (this.aClass200_Sub2_26.anInt6737 * arg2 >> 8) >> this.aClass200_Sub2_26.anInt6721;
			return this.aClass103_1.method2220(local40, local25, arg0);
		}
	}

	@OriginalMember(owner = "client!jk", name = "H", descriptor = "(Lclient!i;IIIIZ)V")
	@Override
	public void H(@OriginalArg(0) Class5_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass103_1 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (this.aClass200_Sub2_26.anInt6731 * arg2 >> 8) >> this.aClass200_Sub2_26.anInt6721;
			@Pc(38) int local38 = arg3 - (this.aClass200_Sub2_26.anInt6737 * arg2 >> 8) >> this.aClass200_Sub2_26.anInt6721;
			this.aClass103_1.method2217(arg0, local38, local23);
		}
	}

	@OriginalMember(owner = "client!jk", name = "ca", descriptor = "(II)I")
	@Override
	public int ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 >> super.anInt6300;
		@Pc(13) int local13 = arg1 >> super.anInt6300;
		if (local8 < 0 || local13 < 0 || local8 > super.anInt6301 - 1 || local13 > super.anInt6299 - 1) {
			return 0;
		}
		@Pc(38) int local38 = arg0 & super.anInt6303 - 1;
		@Pc(45) int local45 = arg1 & super.anInt6303 - 1;
		@Pc(72) int local72 = this.anIntArrayArray22[local8][local13] * (super.anInt6303 - local38) + this.anIntArrayArray22[local8 + 1][local13] * local38 >> super.anInt6300;
		@Pc(102) int local102 = local38 * this.anIntArrayArray22[local8 + 1][local13 + 1] + this.anIntArrayArray22[local8][local13 + 1] * (super.anInt6303 - local38) >> super.anInt6300;
		return local45 * local102 + local72 * (super.anInt6303 - local45) >> super.anInt6300;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method4992(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method2658(arg1, arg0, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)V")
	@Override
	public void method4993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!jk", name = "aa", descriptor = "()V")
	@Override
	public void aa() {
		if (this.anInt3318 <= 0) {
			this.aClass103_1 = null;
		} else {
			@Pc(26) byte[][] local26 = new byte[super.anInt6301 + 1][super.anInt6299 + 1];
			@Pc(32) int local32;
			for (@Pc(28) int local28 = 1; local28 < super.anInt6301; local28++) {
				for (local32 = 1; super.anInt6299 > local32; local32++) {
					local26[local28][local32] = (byte) ((this.aByteArrayArray11[local28][local32 + 1] >> 3) + (this.aByteArrayArray11[local28 + 1][local32] >> 3) + (this.aByteArrayArray11[local28 + -1][local32] >> 2) + (this.aByteArrayArray11[local28][local32 + -1] >> 2) + (this.aByteArrayArray11[local28][local32] >> 1));
				}
			}
			this.aClass5_Sub16Array1 = new Class5_Sub16[this.aClass252_21.method5665()];
			this.aClass252_21.method5662(this.aClass5_Sub16Array1);
			for (local32 = 0; local32 < this.aClass5_Sub16Array1.length; local32++) {
				this.aClass5_Sub16Array1[local32].method1931(this.anInt3318);
			}
			@Pc(136) int local136 = 24;
			if (this.anIntArrayArrayArray8 != null) {
				local136 += 4;
			}
			if ((this.anInt3315 & 0x7) != 0) {
				local136 += 12;
			}
			@Pc(155) NativeBuffer local155 = this.aClass200_Sub2_26.aNativeHeap2.a(this.anInt3318 * local136);
			@Pc(160) NativeStream local160 = new NativeStream(local155);
			@Pc(164) Class5_Sub16[] local164 = new Class5_Sub16[this.anInt3318];
			@Pc(171) int local171 = Static313.method4879(this.anInt3318 / 4);
			if (local171 < 1) {
				local171 = 1;
			}
			@Pc(181) Class252 local181 = new Class252(local171);
			@Pc(185) Class5_Sub16[] local185 = new Class5_Sub16[this.anInt3321];
			@Pc(191) int local191;
			for (@Pc(187) int local187 = 0; super.anInt6301 > local187; local187++) {
				for (local191 = 0; local191 < super.anInt6299; local191++) {
					if (this.anIntArrayArrayArray9[local187][local191] != null) {
						@Pc(207) Class5_Sub16[] local207 = this.aClass5_Sub16ArrayArrayArray1[local187][local191];
						@Pc(214) int[] local214 = this.anIntArrayArrayArray6[local187][local191];
						@Pc(221) int[] local221 = this.anIntArrayArrayArray4[local187][local191];
						@Pc(228) int[] local228 = this.anIntArrayArrayArray7[local187][local191];
						@Pc(235) int[] local235 = this.anIntArrayArrayArray9[local187][local191];
						@Pc(247) int[] local247 = this.anIntArrayArrayArray5 == null ? null : this.anIntArrayArrayArray5[local187][local191];
						@Pc(259) int[] local259 = this.anIntArrayArrayArray8 == null ? null : this.anIntArrayArrayArray8[local187][local191];
						if (local228 == null) {
							local228 = local235;
						}
						@Pc(270) float local270 = this.aFloatArrayArray8[local187][local191];
						@Pc(277) float local277 = this.aFloatArrayArray9[local187][local191];
						@Pc(284) float local284 = this.aFloatArrayArray7[local187][local191];
						@Pc(293) float local293 = this.aFloatArrayArray8[local187][local191 + 1];
						@Pc(302) float local302 = this.aFloatArrayArray9[local187][local191 + 1];
						@Pc(311) float local311 = this.aFloatArrayArray7[local187][local191 + 1];
						@Pc(322) float local322 = this.aFloatArrayArray8[local187 + 1][local191 + 1];
						@Pc(333) float local333 = this.aFloatArrayArray9[local187 + 1][local191 + 1];
						@Pc(344) float local344 = this.aFloatArrayArray7[local187 + 1][local191 + 1];
						@Pc(353) float local353 = this.aFloatArrayArray8[local187 + 1][local191];
						@Pc(362) float local362 = this.aFloatArrayArray9[local187 + 1][local191];
						@Pc(371) float local371 = this.aFloatArrayArray7[local187 + 1][local191];
						@Pc(379) int local379 = local26[local187][local191] & 0xFF;
						@Pc(389) int local389 = local26[local187][local191 + 1] & 0xFF;
						@Pc(401) int local401 = local26[local187 + 1][local191 + 1] & 0xFF;
						@Pc(411) int local411 = local26[local187 + 1][local191] & 0xFF;
						@Pc(413) int local413 = 0;
						@Pc(423) int local423;
						label337: for (@Pc(415) int local415 = 0; local415 < local235.length; local415++) {
							@Pc(421) Class5_Sub16 local421 = local207[local415];
							for (local423 = 0; local423 < local413; local423++) {
								if (local421 == local185[local423]) {
									continue label337;
								}
							}
							local185[local413++] = local421;
						}
						@Pc(468) short[] local468 = this.aShortArrayArray7[local187 + super.anInt6301 * local191] = new short[local235.length];
						for (local423 = 0; local423 < local235.length; local423++) {
							@Pc(482) int local482 = (local187 << super.anInt6300) + local214[local423];
							@Pc(492) int local492 = (local191 << super.anInt6300) + local221[local423];
							@Pc(497) int local497 = local482 >> this.anInt3308;
							@Pc(502) int local502 = local492 >> this.anInt3308;
							@Pc(506) int local506 = local235[local423];
							@Pc(510) int local510 = local228[local423];
							@Pc(518) int local518 = local247 == null ? 0 : local247[local423];
							@Pc(536) long local536 = (long) (local497 << 16) | (long) local510 << 48 | (long) local506 << 32 | (long) local502;
							@Pc(540) int local540 = local214[local423];
							@Pc(544) int local544 = local221[local423];
							@Pc(546) byte local546 = 74;
							@Pc(548) int local548 = 0;
							@Pc(550) float local550 = 1.0F;
							@Pc(608) float local608;
							@Pc(600) float local600;
							@Pc(606) float local606;
							@Pc(641) float local641;
							@Pc(604) int local604;
							if (local540 == 0 && local544 == 0) {
								local600 = local277;
								local606 = local284;
								local604 = local546 - local379;
								local608 = local270;
							} else if (local540 == 0 && super.anInt6303 == local544) {
								local604 = local546 - local389;
								local608 = local293;
								local606 = local311;
								local600 = local302;
							} else if (super.anInt6303 == local540 && local544 == super.anInt6303) {
								local606 = local344;
								local600 = local333;
								local608 = local322;
								local604 = local546 - local401;
							} else if (local540 == super.anInt6303 && local544 == 0) {
								local600 = local362;
								local604 = local546 - local411;
								local606 = local371;
								local608 = local353;
							} else {
								@Pc(617) float local617 = (float) local540 / (float) super.anInt6303;
								@Pc(624) float local624 = (float) local544 / (float) super.anInt6303;
								@Pc(632) float local632 = local270 + local617 * (local353 - local270);
								local641 = local277 + (local362 - local277) * local617;
								@Pc(650) float local650 = local284 + (local371 - local284) * local617;
								@Pc(659) float local659 = local293 + local617 * (local322 - local293);
								@Pc(667) float local667 = (local333 - local302) * local617 + local302;
								local608 = (local659 - local632) * local624 + local632;
								@Pc(685) float local685 = (local344 - local311) * local617 + local311;
								local600 = (local667 - local641) * local624 + local641;
								local606 = (local685 - local650) * local624 + local650;
								@Pc(714) int local714 = local379 + ((local411 - local379) * local540 >> super.anInt6300);
								@Pc(726) int local726 = (local540 * (local401 - local389) >> super.anInt6300) + local389;
								local604 = local546 - ((local726 - local714) * local544 >> super.anInt6300) - local714;
							}
							if (local506 != -1) {
								@Pc(788) int local788 = (local506 & 0x7F) * local604 >> 7;
								if (local788 < 2) {
									local788 = 2;
								} else if (local788 > 126) {
									local788 = 126;
								}
								if ((this.anInt3315 & 0x7) == 0) {
									local550 = local600 * this.aClass200_Sub2_26.aFloatArray19[1] + this.aClass200_Sub2_26.aFloatArray19[0] * local608 + local606 * this.aClass200_Sub2_26.aFloatArray19[2];
									local550 = this.aClass200_Sub2_26.aFloat154 + (local550 > 0.0F ? this.aClass200_Sub2_26.aFloat157 : this.aClass200_Sub2_26.aFloat162) * local550;
								}
								local548 = Static219.anIntArray223[local788 | local506 & 0xFF80];
							}
							@Pc(861) Class5 local861 = null;
							if ((this.anInt3304 - 1 & local482) == 0 && (local492 & this.anInt3304 - 1) == 0) {
								local861 = local181.method5659(local536);
							}
							@Pc(1227) int local1227;
							@Pc(925) int local925;
							if (local861 == null) {
								if (local510 == local506) {
									local925 = local548;
								} else {
									@Pc(903) int local903 = (local510 & 0x7F) * local604 >> 7;
									if (local903 < 2) {
										local903 = 2;
									} else if (local903 > 126) {
										local903 = 126;
									}
									local925 = Static219.anIntArray223[local510 & 0xFF80 | local903];
									if ((this.anInt3315 & 0x7) == 0) {
										local641 = local606 * this.aClass200_Sub2_26.aFloatArray19[2] + this.aClass200_Sub2_26.aFloatArray19[1] * local600 + local608 * this.aClass200_Sub2_26.aFloatArray19[0];
										local641 = (local550 > 0.0F ? this.aClass200_Sub2_26.aFloat157 : this.aClass200_Sub2_26.aFloat162) * local550 + this.aClass200_Sub2_26.aFloat154;
										@Pc(981) int local981 = local925 >> 16 & 0xFF;
										@Pc(987) int local987 = local925 >> 8 & 0xFF;
										@Pc(991) int local991 = local925 & 0xFF;
										local981 = (int) ((float) local981 * local641);
										local987 = (int) ((float) local987 * local641);
										if (local981 < 0) {
											local981 = 0;
										} else if (local981 > 255) {
											local981 = 255;
										}
										if (local987 < 0) {
											local987 = 0;
										} else if (local987 > 255) {
											local987 = 255;
										}
										local991 = (int) ((float) local991 * local641);
										if (local991 < 0) {
											local991 = 0;
										} else if (local991 > 255) {
											local991 = 255;
										}
										local925 = local987 << 8 | local981 << 16 | local991;
									}
								}
								if (this.aClass200_Sub2_26.aBoolean433) {
									local160.b((float) local482);
									local160.b((float) (this.ca(local482, local492) + local518));
									local160.b((float) local492);
									local160.a((byte) (local925 >> 16));
									local160.a((byte) (local925 >> 8));
									local160.a((byte) local925);
									local160.a(-1);
									local160.b((float) local482);
									local160.b((float) local492);
									if (this.anIntArrayArrayArray8 != null) {
										local160.b((float) (local259 == null ? 0 : local259[local423] - 1));
									}
									if ((this.anInt3315 & 0x7) != 0) {
										local160.b(local608);
										local160.b(local600);
										local160.b(local606);
									}
								} else {
									local160.a((float) local482);
									local160.a((float) (local518 + this.ca(local482, local492)));
									local160.a((float) local492);
									local160.a((byte) (local925 >> 16));
									local160.a((byte) (local925 >> 8));
									local160.a((byte) local925);
									local160.a(-1);
									local160.a((float) local482);
									local160.a((float) local492);
									if (this.anIntArrayArrayArray8 != null) {
										local160.a((float) (local259 == null ? 0 : local259[local423] - 1));
									}
									if ((this.anInt3315 & 0x7) != 0) {
										local160.a(local608);
										local160.a(local600);
										local160.a(local606);
									}
								}
								local1227 = this.anInt3302++;
								local468[local423] = (short) local1227;
								if (local506 != -1) {
									local164[local1227] = local207[local423];
								}
								local181.method5658(new Class5_Sub46(local468[local423]), local536);
							} else {
								local468[local423] = ((Class5_Sub46) local861).aShort103;
								local1227 = local468[local423] & 0xFFFF;
								if (local506 != -1 && local207[local423].aLong234 < local164[local1227].aLong234) {
									local164[local1227] = local207[local423];
								}
							}
							for (local925 = 0; local925 < local413; local925++) {
								local185[local925].method1932(local550, local604, local548, local1227);
							}
							this.anInt3299++;
						}
					}
				}
			}
			for (local191 = 0; local191 < this.anInt3302; local191++) {
				@Pc(1344) Class5_Sub16 local1344 = local164[local191];
				if (local1344 != null) {
					local1344.method1928(local191);
				}
			}
			@Pc(1377) int local1377;
			for (@Pc(1357) int local1357 = 0; super.anInt6301 > local1357; local1357++) {
				for (@Pc(1361) int local1361 = 0; local1361 < super.anInt6299; local1361++) {
					@Pc(1373) short[] local1373 = this.aShortArrayArray7[local1357 + super.anInt6301 * local1361];
					if (local1373 != null) {
						local1377 = 0;
						@Pc(1379) int local1379 = 0;
						while (local1373.length > local1379) {
							@Pc(1388) int local1388 = local1373[local1379++] & 0xFFFF;
							@Pc(1395) int local1395 = local1373[local1379++] & 0xFFFF;
							@Pc(1402) int local1402 = local1373[local1379++] & 0xFFFF;
							@Pc(1406) Class5_Sub16 local1406 = local164[local1388];
							@Pc(1410) Class5_Sub16 local1410 = local164[local1395];
							@Pc(1414) Class5_Sub16 local1414 = local164[local1402];
							@Pc(1416) Class5_Sub16 local1416 = null;
							if (local1406 != null) {
								local1406.method1927(local1357, local1377, local1361);
								local1416 = local1406;
							}
							if (local1410 != null) {
								local1410.method1927(local1357, local1377, local1361);
								if (local1416 == null || local1416.aLong234 > local1410.aLong234) {
									local1416 = local1410;
								}
							}
							if (local1414 != null) {
								local1414.method1927(local1357, local1377, local1361);
								if (local1416 == null || local1414.aLong234 < local1416.aLong234) {
									local1416 = local1414;
								}
							}
							if (local1416 != null) {
								if (local1406 != null) {
									local1416.method1928(local1388);
								}
								if (local1410 != null) {
									local1416.method1928(local1395);
								}
								if (local1414 != null) {
									local1416.method1928(local1402);
								}
								local1416.method1927(local1357, local1377, local1361);
							}
							local1377++;
						}
					}
				}
			}
			local160.c();
			this.anInterface12_2 = this.aClass200_Sub2_26.method5331(local136, local155, local160.a());
			this.aClass195_7 = new Class195(this.anInterface12_2, 5126, 3, 0);
			this.aClass195_6 = new Class195(this.anInterface12_2, 5121, 4, 12);
			@Pc(1563) byte local1563;
			if (this.anIntArrayArrayArray8 == null) {
				this.aClass195_5 = new Class195(this.anInterface12_2, 5126, 2, 16);
				local1563 = 24;
			} else {
				this.aClass195_5 = new Class195(this.anInterface12_2, 5126, 3, 16);
				local1563 = 28;
			}
			if ((this.anInt3315 & 0x7) != 0) {
				this.aClass195_4 = new Class195(this.anInterface12_2, 5126, 3, local1563);
			}
			@Pc(1600) long[] local1600 = new long[this.aClass5_Sub16Array1.length];
			for (local1377 = 0; local1377 < this.aClass5_Sub16Array1.length; local1377++) {
				@Pc(1609) Class5_Sub16 local1609 = this.aClass5_Sub16Array1[local1377];
				local1600[local1377] = local1609.aLong234;
				local1609.method1933(this.anInt3302);
			}
			Static133.method1860(local1600, this.aClass5_Sub16Array1);
			if (this.aClass103_1 != null) {
				this.aClass103_1.method2219();
			}
		}
		this.anIntArrayArrayArray6 = this.anIntArrayArrayArray4 = null;
		this.aFloatArrayArray8 = this.aFloatArrayArray9 = this.aFloatArrayArray7 = null;
		this.aByteArrayArray11 = null;
		this.anIntArrayArrayArray9 = null;
		this.anIntArrayArrayArray5 = null;
		this.anIntArrayArrayArray8 = null;
		this.anIntArrayArrayArray7 = null;
		this.aClass252_21 = null;
		this.aClass5_Sub16ArrayArrayArray1 = null;
	}

	@OriginalMember(owner = "client!jk", name = "ua", descriptor = "(II)I")
	@Override
	public int ua(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray22[arg0][arg1];
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIII[[ZZ)V")
	private void method2658(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) boolean[][] arg3, @OriginalArg(6) boolean arg4) {
		if (this.aClass5_Sub16Array1 == null) {
			return;
		}
		@Pc(12) float local12 = this.aClass200_Sub2_26.aFloat173;
		@Pc(16) float local16 = this.aClass200_Sub2_26.aFloat172;
		@Pc(22) int local22 = arg2 + arg2 + 1;
		@Pc(26) int local26 = local22 * local22;
		if (local26 > this.aClass200_Sub2_26.anIntArray463.length) {
			this.aClass200_Sub2_26.anIntArray463 = new int[local26];
		}
		if (this.anInt3299 * 2 > this.aClass200_Sub2_26.aClass5_Sub15_Sub1_2.aByteArray93.length) {
			this.aClass200_Sub2_26.aClass5_Sub15_Sub1_2 = new Class5_Sub15_Sub1(this.anInt3299 * 2);
		}
		@Pc(70) int local70 = arg1 - arg2;
		@Pc(72) int local72 = local70;
		if (local70 < 0) {
			local70 = 0;
		}
		@Pc(80) int local80 = arg0 - arg2;
		@Pc(82) int local82 = local80;
		if (local80 < 0) {
			local80 = 0;
		}
		@Pc(90) int local90 = arg2 + arg1;
		if (super.anInt6301 - 1 < local90) {
			local90 = super.anInt6301 - 1;
		}
		@Pc(109) int local109 = arg0 + arg2;
		if (super.anInt6299 - 1 < local109) {
			local109 = super.anInt6299 - 1;
		}
		@Pc(126) int local126 = 0;
		@Pc(130) int[] local130 = this.aClass200_Sub2_26.anIntArray463;
		@Pc(142) int local142;
		for (@Pc(132) int local132 = local70; local132 <= local90; local132++) {
			@Pc(140) boolean[] local140 = arg3[local132 - local72];
			for (local142 = local80; local142 <= local109; local142++) {
				if (local140[local142 - local82]) {
					local130[local126++] = local142 * super.anInt6301 + local132;
				}
			}
		}
		this.aClass200_Sub2_26.method5287();
		this.aClass200_Sub2_26.method5271((this.anInt3315 & 0x7) != 0);
		for (@Pc(207) int local207 = 0; local207 < this.aClass5_Sub16Array1.length; local207++) {
			this.aClass5_Sub16Array1[local207].method1930(local126, local130);
		}
		if (!this.aClass177_18.method3616()) {
			local142 = this.aClass200_Sub2_26.anInt6764;
			@Pc(240) int local240 = this.aClass200_Sub2_26.anInt6746;
			this.aClass200_Sub2_26.Q(0, local240, this.aClass200_Sub2_26.anInt6747);
			this.aClass200_Sub2_26.da(local16, local12 - 4.0F);
			this.aClass200_Sub2_26.method5271(false);
			this.aClass200_Sub2_26.method5269(false);
			this.aClass200_Sub2_26.method5295(128);
			this.aClass200_Sub2_26.method5288(-2);
			this.aClass200_Sub2_26.method5312(this.aClass200_Sub2_26.aClass31_Sub1_3);
			this.aClass200_Sub2_26.method5304(8448, 7681);
			this.aClass200_Sub2_26.method5343(770, 34166, 0);
			this.aClass200_Sub2_26.method5341(34167, 0);
			for (@Pc(307) Class5 local307 = this.aClass177_18.method3618(); local307 != null; local307 = this.aClass177_18.method3619()) {
				@Pc(312) Class5_Sub18 local312 = (Class5_Sub18) local307;
				local312.method2142(arg2, arg1, arg0, arg3);
			}
			this.aClass200_Sub2_26.method5343(768, 5890, 0);
			this.aClass200_Sub2_26.method5341(5890, 0);
			this.aClass200_Sub2_26.method5312(null);
			this.aClass200_Sub2_26.Q(local142, local240, this.aClass200_Sub2_26.anInt6747);
		}
		if (this.aClass103_1 != null) {
			this.aClass200_Sub2_26.da(local16, local12 - 8.0F);
			this.aClass200_Sub2_26.method5287();
			this.aClass200_Sub2_26.method5311(null, this.aClass195_5, null, this.aClass195_7);
			this.aClass103_1.method2226(arg2, arg0, arg3, arg4, arg1);
		}
		this.aClass200_Sub2_26.da(local16, local12);
	}

	@OriginalMember(owner = "client!jk", name = "qa", descriptor = "(III)V")
	@Override
	public void qa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray11[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray11[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method4989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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
		this.pa(arg0, arg1, local13, local47, local18, local56, local23, local28, local33, local38, arg13, arg14, arg15, false);
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(ILclient!ag;ZI)V")
	private void method2659(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub2_Sub1_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray6[arg0][arg2];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray4[arg0][arg2];
		@Pc(22) int local22 = local12.length;
		if (this.aClass200_Sub2_26.anIntArray462.length < local22) {
			this.aClass200_Sub2_26.anIntArray462 = new int[local22];
			this.aClass200_Sub2_26.anIntArray464 = new int[local22];
		}
		@Pc(42) int[] local42 = this.aClass200_Sub2_26.anIntArray462;
		@Pc(46) int[] local46 = this.aClass200_Sub2_26.anIntArray464;
		for (@Pc(48) int local48 = 0; local48 < local22; local48++) {
			local42[local48] = (local12[local48] & 0xFF) >> this.aClass200_Sub2_26.anInt6721;
			local46[local48] = (local19[local48] & 0xFF) >> this.aClass200_Sub2_26.anInt6721;
		}
		@Pc(80) int local80 = 0;
		while (local80 < local22) {
			@Pc(86) int local86 = local42[local80];
			@Pc(91) int local91 = local46[local80++];
			@Pc(95) int local95 = local42[local80];
			@Pc(100) int local100 = local46[local80++];
			@Pc(104) int local104 = local42[local80];
			@Pc(109) int local109 = local46[local80++];
			if ((local100 - local109) * (-local95 + local86) - (local100 - local91) * (local104 - local95) > 0) {
				arg1.method143(local91, local109, local104, local86, local100, local95);
			}
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method4988(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt3318 <= 0) {
			return;
		}
		this.aClass200_Sub2_26.method5347();
		this.aClass200_Sub2_26.method5338(false);
		this.aClass200_Sub2_26.method5271(false);
		this.aClass200_Sub2_26.method5302(false);
		this.aClass200_Sub2_26.method5269(false);
		this.aClass200_Sub2_26.method5295(0);
		this.aClass200_Sub2_26.method5288(-2);
		this.aClass200_Sub2_26.method5312(null);
		Static273.aFloatArray8[11] = 0.0F;
		Static273.aFloatArray8[7] = 0.0F;
		Static273.aFloatArray8[14] = 0.0F;
		Static273.aFloatArray8[2] = 0.0F;
		Static273.aFloatArray8[3] = 0.0F;
		Static273.aFloatArray8[15] = 1.0F;
		Static273.aFloatArray8[1] = 0.0F;
		Static273.aFloatArray8[13] = 1.0F - ((float) (arg3 * 1024) / 128.0F + (float) 0) / (float) this.aClass200_Sub2_26.anInt6597;
		Static273.aFloatArray8[6] = 0.0F;
		Static273.aFloatArray8[10] = 0.0F;
		Static273.aFloatArray8[12] = -(((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass200_Sub2_26.anInt6572) - 1.0F;
		Static273.aFloatArray8[8] = 0.0F;
		Static273.aFloatArray8[5] = (float) 1024 / ((float) this.aClass200_Sub2_26.anInt6597 * 128.0F * (float) super.anInt6303);
		Static273.aFloatArray8[4] = 0.0F;
		Static273.aFloatArray8[0] = (float) 1024 / ((float) this.aClass200_Sub2_26.anInt6572 * 128.0F * (float) super.anInt6303);
		Static273.aFloatArray8[9] = 0.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static273.aFloatArray8, 0);
		Static273.aFloatArray8[3] = 0.0F;
		Static273.aFloatArray8[5] = 0.0F;
		Static273.aFloatArray8[8] = 0.0F;
		Static273.aFloatArray8[11] = 0.0F;
		Static273.aFloatArray8[6] = 1.0F;
		Static273.aFloatArray8[10] = 0.0F;
		Static273.aFloatArray8[12] = 0.0F;
		Static273.aFloatArray8[2] = 0.0F;
		Static273.aFloatArray8[1] = 0.0F;
		Static273.aFloatArray8[15] = 1.0F;
		Static273.aFloatArray8[14] = 0.0F;
		Static273.aFloatArray8[9] = 1.0F;
		Static273.aFloatArray8[4] = 0.0F;
		Static273.aFloatArray8[13] = 0.0F;
		Static273.aFloatArray8[7] = 0.0F;
		Static273.aFloatArray8[0] = 1.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static273.aFloatArray8, 0);
		if ((this.anInt3315 & 0x7) == 0) {
			this.aClass200_Sub2_26.method5271(false);
		} else {
			this.aClass200_Sub2_26.method5271(true);
			this.aClass200_Sub2_26.method5337();
		}
		this.aClass200_Sub2_26.method5311(this.aClass195_6, this.aClass195_5, this.aClass195_4, this.aClass195_7);
		if (this.aClass200_Sub2_26.aClass5_Sub15_Sub1_2.aByteArray93.length >= this.anInt3299 * 2) {
			this.aClass200_Sub2_26.aClass5_Sub15_Sub1_2.anInt7013 = 0;
		} else {
			this.aClass200_Sub2_26.aClass5_Sub15_Sub1_2 = new Class5_Sub15_Sub1(this.anInt3299 * 2);
		}
		@Pc(312) int local312 = 0;
		@Pc(316) Class5_Sub15_Sub1 local316 = this.aClass200_Sub2_26.aClass5_Sub15_Sub1_2;
		@Pc(322) int local322;
		@Pc(331) int local331;
		@Pc(333) int local333;
		@Pc(352) short[] local352;
		@Pc(356) int local356;
		if (this.aClass200_Sub2_26.aBoolean433) {
			for (local322 = arg1; local322 < arg3; local322++) {
				local331 = arg0 + super.anInt6301 * local322;
				for (local333 = arg0; local333 < arg2; local333++) {
					if (arg4[local333 - arg0][local322 - arg1]) {
						local352 = this.aShortArrayArray7[local331];
						if (local352 != null) {
							for (local356 = 0; local356 < local352.length; local356++) {
								local312++;
								local316.method5566(local352[local356] & 0xFFFF);
							}
						}
					}
					local331++;
				}
			}
		} else {
			for (local322 = arg1; local322 < arg3; local322++) {
				local331 = arg0 + local322 * super.anInt6301;
				for (local333 = arg0; local333 < arg2; local333++) {
					if (arg4[local333 - arg0][local322 - arg1]) {
						local352 = this.aShortArrayArray7[local331];
						if (local352 != null) {
							for (local356 = 0; local356 < local352.length; local356++) {
								local316.method5568(local352[local356] & 0xFFFF);
								local312++;
							}
						}
					}
					local331++;
				}
			}
		}
		if (local312 > 0) {
			@Pc(467) Class15_Sub1 local467 = new Class15_Sub1(this.aClass200_Sub2_26, 5123, local316.aByteArray93, local316.anInt7013);
			this.aClass200_Sub2_26.method5325(0, local467, local312);
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lclient!rd;[I)V")
	@Override
	public void method4987(@OriginalArg(0) Class5_Sub19 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass177_18.method3615(new Class5_Sub18(this.aClass200_Sub2_26, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!jk", name = "pa", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray8 == null) {
			this.anIntArrayArrayArray8 = new int[super.anInt6301][super.anInt6299][];
		}
		if (arg3 != null && this.anIntArrayArrayArray5 == null) {
			this.anIntArrayArrayArray5 = new int[super.anInt6301][super.anInt6299][];
		}
		this.anIntArrayArrayArray6[arg0][arg1] = arg2;
		this.anIntArrayArrayArray4[arg0][arg1] = arg4;
		this.anIntArrayArrayArray9[arg0][arg1] = arg6;
		this.anIntArrayArrayArray7[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray8 != null) {
			this.anIntArrayArrayArray8[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray5 != null) {
			this.anIntArrayArrayArray5[arg0][arg1] = arg3;
		}
		@Pc(88) Class5_Sub16[] local88 = this.aClass5_Sub16ArrayArrayArray1[arg0][arg1] = new Class5_Sub16[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) arg8[local90] | (long) (arg9[local90] << 14) | (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48;
			@Pc(125) Class5 local125;
			for (local125 = this.aClass252_21.method5659(local119); local125 != null; local125 = this.aClass252_21.method5667()) {
				@Pc(130) Class5_Sub16 local130 = (Class5_Sub16) local125;
				if (arg8[local90] == local130.anInt2380 && local130.aFloat47 == (float) arg9[local90] && local130.anInt2383 == arg10 && arg11 == local130.anInt2390 && arg12 == local130.anInt2391) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class5_Sub16(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass252_21.method5658(local88[local90], local119);
			} else {
				local88[local90] = (Class5_Sub16) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray10[arg0][arg1] = (byte) (this.aByteArrayArray10[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt3321) {
			this.anInt3321 = arg6.length;
		}
		this.anInt3318 += arg6.length;
	}
}
