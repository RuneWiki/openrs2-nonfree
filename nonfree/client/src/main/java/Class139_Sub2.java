import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!us")
public final class Class139_Sub2 extends Class139 {

	@OriginalMember(owner = "client!us", name = "z", descriptor = "I")
	private int anInt6769;

	@OriginalMember(owner = "client!us", name = "R", descriptor = "I")
	private int anInt6780;

	@OriginalMember(owner = "client!us", name = "Y", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!us", name = "ab", descriptor = "Lclient!ff;")
	public Class80 aClass80_13;

	@OriginalMember(owner = "client!us", name = "cb", descriptor = "[Lclient!fm;")
	private Class1_Sub13[] aClass1_Sub13Array1;

	@OriginalMember(owner = "client!us", name = "fb", descriptor = "Lclient!tg;")
	private Interface9 anInterface9_7;

	@OriginalMember(owner = "client!us", name = "gb", descriptor = "Lclient!ff;")
	private Class80 aClass80_14;

	@OriginalMember(owner = "client!us", name = "hb", descriptor = "I")
	private int anInt6785;

	@OriginalMember(owner = "client!us", name = "jb", descriptor = "Lclient!ff;")
	public Class80 aClass80_15;

	@OriginalMember(owner = "client!us", name = "kb", descriptor = "Lclient!ff;")
	public Class80 aClass80_16;

	@OriginalMember(owner = "client!us", name = "lb", descriptor = "I")
	private int lb;

	@OriginalMember(owner = "client!us", name = "u", descriptor = "Lclient!am;")
	private final Class14 aClass14_47 = new Class14();

	@OriginalMember(owner = "client!us", name = "A", descriptor = "Lclient!ih;")
	public final Class117_Sub1 aClass117_Sub1_41;

	@OriginalMember(owner = "client!us", name = "X", descriptor = "[[I")
	private final int[][] anIntArrayArray51;

	@OriginalMember(owner = "client!us", name = "U", descriptor = "I")
	private final int anInt6783;

	@OriginalMember(owner = "client!us", name = "o", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!us", name = "I", descriptor = "[[S")
	public final short[][] aShortArrayArray8;

	@OriginalMember(owner = "client!us", name = "C", descriptor = "I")
	public final int anInt6771;

	@OriginalMember(owner = "client!us", name = "mb", descriptor = "[[F")
	private float[][] aFloatArrayArray9;

	@OriginalMember(owner = "client!us", name = "N", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!us", name = "p", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!us", name = "F", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!us", name = "w", descriptor = "[[B")
	private final byte[][] aByteArrayArray134;

	@OriginalMember(owner = "client!us", name = "ib", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!us", name = "x", descriptor = "[[[Lclient!fm;")
	private Class1_Sub13[][][] aClass1_Sub13ArrayArrayArray1;

	@OriginalMember(owner = "client!us", name = "r", descriptor = "I")
	private final int anInt6764;

	@OriginalMember(owner = "client!us", name = "m", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!us", name = "eb", descriptor = "[[B")
	private byte[][] aByteArrayArray135;

	@OriginalMember(owner = "client!us", name = "db", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!us", name = "bb", descriptor = "Lclient!qi;")
	private Class208 aClass208_38;

	@OriginalMember(owner = "client!us", name = "D", descriptor = "Lclient!bl;")
	private Class30 aClass30_2;

	static {
		new Class142("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "(Lclient!ih;IIII[[I[[II)V")
	public Class139_Sub2(@OriginalArg(0) Class117_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.aClass117_Sub1_41 = arg0;
		this.anIntArrayArray51 = arg5;
		this.anInt6783 = super.anInt6759 - 2;
		this.anIntArrayArrayArray10 = new int[arg3][arg4][];
		this.aShortArrayArray8 = new short[arg3 * arg4][];
		this.anInt6771 = arg2;
		this.aFloatArrayArray9 = new float[super.anInt6757 + 1][super.anInt6758 + 1];
		this.anIntArrayArrayArray13 = new int[arg3][arg4][];
		this.anIntArrayArrayArray11 = new int[arg3][arg4][];
		this.anIntArrayArrayArray12 = new int[arg3][arg4][];
		this.aByteArrayArray134 = new byte[arg3][arg4];
		this.aFloatArrayArray8 = new float[super.anInt6757 + 1][super.anInt6758 + 1];
		this.aClass1_Sub13ArrayArrayArray1 = new Class1_Sub13[arg3][arg4][];
		this.anInt6764 = 0x1 << this.anInt6783;
		this.anIntArrayArrayArray9 = new int[arg3][arg4][];
		this.aByteArrayArray135 = new byte[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray7 = new float[super.anInt6757 + 1][super.anInt6758 + 1];
		for (@Pc(117) int local117 = 1; super.anInt6758 > local117; local117++) {
			for (@Pc(121) int local121 = 1; super.anInt6757 > local121; local121++) {
				@Pc(140) int local140 = arg6[local121 + 1][local117] - arg6[local121 - 1][local117];
				@Pc(157) int local157 = arg6[local121][local117 + 1] - arg6[local121][local117 - 1];
				@Pc(176) float local176 = (float) (1.0D / Math.sqrt((double) (arg7 * 4 * arg7 + local140 * local140 + local157 * local157)));
				this.aFloatArrayArray8[local121][local117] = local176 * (float) local140;
				this.aFloatArrayArray7[local121][local117] = local176 * (float) (-arg7 * 2);
				this.aFloatArrayArray9[local121][local117] = (float) local157 * local176;
			}
		}
		this.aClass208_38 = new Class208(128);
		if ((this.anInt6771 & 0x10) != 0) {
			this.aClass30_2 = new Class30(this.aClass117_Sub1_41, this);
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ZIZIII[[Z)V")
	private void method5371(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) boolean[][] arg4) {
		if (this.aClass1_Sub13Array1 == null) {
			return;
		}
		@Pc(12) float local12 = this.aClass117_Sub1_41.aFloat35;
		@Pc(16) float local16 = this.aClass117_Sub1_41.aFloat41;
		@Pc(22) int local22 = arg2 + arg2 + 1;
		@Pc(26) int local26 = local22 * local22;
		if (this.aClass117_Sub1_41.anIntArray230.length < local26) {
			this.aClass117_Sub1_41.anIntArray230 = new int[local26];
		}
		if (this.aClass117_Sub1_41.aClass1_Sub19_Sub1_2.aByteArray38.length < this.anInt6769 * 2) {
			this.aClass117_Sub1_41.aClass1_Sub19_Sub1_2 = new Class1_Sub19_Sub1(this.anInt6769 * 2);
		}
		@Pc(69) int local69 = arg3 - arg2;
		@Pc(71) int local71 = local69;
		if (local69 < 0) {
			local69 = 0;
		}
		@Pc(83) int local83 = arg0 - arg2;
		@Pc(85) int local85 = local83;
		if (local83 < 0) {
			local83 = 0;
		}
		@Pc(96) int local96 = arg2 + arg3;
		if (super.anInt6757 - 1 < local96) {
			local96 = super.anInt6757 - 1;
		}
		@Pc(115) int local115 = arg2 + arg0;
		if (local115 > super.anInt6758 - 1) {
			local115 = super.anInt6758 - 1;
		}
		@Pc(128) int local128 = 0;
		@Pc(132) int[] local132 = this.aClass117_Sub1_41.anIntArray230;
		@Pc(144) int local144;
		for (@Pc(134) int local134 = local69; local134 <= local96; local134++) {
			@Pc(142) boolean[] local142 = arg4[local134 - local71];
			for (local144 = local83; local144 <= local115; local144++) {
				if (local142[local144 - local85]) {
					local132[local128++] = local144 * super.anInt6757 + local134;
				}
			}
		}
		this.aClass117_Sub1_41.method2522();
		this.aClass117_Sub1_41.method2498((this.anInt6771 & 0x7) != 0);
		for (@Pc(208) int local208 = 0; local208 < this.aClass1_Sub13Array1.length; local208++) {
			this.aClass1_Sub13Array1[local208].method1477(local128, local132);
		}
		if (!this.aClass14_47.method209()) {
			local144 = this.aClass117_Sub1_41.anInt3112;
			@Pc(237) int local237 = this.aClass117_Sub1_41.anInt3135;
			this.aClass117_Sub1_41.Q(0, local237, this.aClass117_Sub1_41.anInt3127);
			this.aClass117_Sub1_41.da(local16, local12 - 4.0F);
			this.aClass117_Sub1_41.method2498(false);
			this.aClass117_Sub1_41.method2469(false);
			this.aClass117_Sub1_41.method2503(128);
			this.aClass117_Sub1_41.method2531(-2);
			this.aClass117_Sub1_41.method2504(this.aClass117_Sub1_41.aClass23_Sub3_3);
			this.aClass117_Sub1_41.method2471(7681, 8448);
			this.aClass117_Sub1_41.method2505(0, 34166, 770);
			this.aClass117_Sub1_41.method2492(34167, 0);
			for (@Pc(304) Class1 local304 = this.aClass14_47.method203(); local304 != null; local304 = this.aClass14_47.method208()) {
				@Pc(309) Class1_Sub5 local309 = (Class1_Sub5) local304;
				local309.method420(arg3, arg4, arg2, arg0);
			}
			this.aClass117_Sub1_41.method2505(0, 5890, 768);
			this.aClass117_Sub1_41.method2492(5890, 0);
			this.aClass117_Sub1_41.method2504(null);
			this.aClass117_Sub1_41.Q(local144, local237, this.aClass117_Sub1_41.anInt3127);
		}
		if (this.aClass30_2 != null) {
			this.aClass117_Sub1_41.da(local16, local12 - 8.0F);
			this.aClass117_Sub1_41.method2522();
			this.aClass117_Sub1_41.method2475(this.aClass80_13, null, null, this.aClass80_16);
			this.aClass30_2.method469(arg4, arg0, arg3, arg2, arg1);
		}
		this.aClass117_Sub1_41.da(local16, local12);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method5362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method5371(arg1, arg4, arg2, arg0, arg3);
	}

	@OriginalMember(owner = "client!us", name = "H", descriptor = "(Lclient!i;IIIIZ)V")
	@Override
	public void H(@OriginalArg(0) Class1_Sub3_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass30_2 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (arg2 * this.aClass117_Sub1_41.anInt3117 >> 8) >> this.aClass117_Sub1_41.anInt3091;
			@Pc(37) int local37 = arg3 - (this.aClass117_Sub1_41.anInt3105 * arg2 >> 8) >> this.aClass117_Sub1_41.anInt3091;
			this.aClass30_2.method470(arg0, local37, local23);
		}
	}

	@OriginalMember(owner = "client!us", name = "aa", descriptor = "()V")
	@Override
	public void aa() {
		if (this.lb <= 0) {
			this.aClass30_2 = null;
		} else {
			@Pc(19) byte[][] local19 = new byte[super.anInt6757 + 1][super.anInt6758 + 1];
			@Pc(25) int local25;
			for (@Pc(21) int local21 = 1; local21 < super.anInt6757; local21++) {
				for (local25 = 1; super.anInt6758 > local25; local25++) {
					local19[local21][local25] = (byte) ((this.aByteArrayArray135[local21][local25 + 1] >> 3) + (this.aByteArrayArray135[local21 + 1][local25] >> 3) + (this.aByteArrayArray135[local21 - 1][local25] >> 2) + (this.aByteArrayArray135[local21][local25 + -1] >> 2) + (this.aByteArrayArray135[local21][local25] >> 1));
				}
			}
			this.aClass1_Sub13Array1 = new Class1_Sub13[this.aClass208_38.method4406()];
			this.aClass208_38.method4407(this.aClass1_Sub13Array1);
			for (local25 = 0; local25 < this.aClass1_Sub13Array1.length; local25++) {
				this.aClass1_Sub13Array1[local25].method1482(this.lb);
			}
			@Pc(137) int local137 = 24;
			if (this.anIntArrayArrayArray14 != null) {
				local137 += 4;
			}
			if ((this.anInt6771 & 0x7) != 0) {
				local137 += 12;
			}
			@Pc(159) NativeBuffer local159 = this.aClass117_Sub1_41.aNativeHeap2.a(local137 * this.lb);
			@Pc(164) NativeStream local164 = new NativeStream(local159);
			@Pc(168) Class1_Sub13[] local168 = new Class1_Sub13[this.lb];
			@Pc(175) int local175 = Static235.method3355(this.lb / 4);
			if (local175 < 1) {
				local175 = 1;
			}
			@Pc(185) Class208 local185 = new Class208(local175);
			@Pc(189) Class1_Sub13[] local189 = new Class1_Sub13[this.anInt6785];
			@Pc(195) int local195;
			for (@Pc(191) int local191 = 0; super.anInt6757 > local191; local191++) {
				for (local195 = 0; super.anInt6758 > local195; local195++) {
					if (this.anIntArrayArrayArray12[local191][local195] != null) {
						@Pc(211) Class1_Sub13[] local211 = this.aClass1_Sub13ArrayArrayArray1[local191][local195];
						@Pc(218) int[] local218 = this.anIntArrayArrayArray10[local191][local195];
						@Pc(225) int[] local225 = this.anIntArrayArrayArray9[local191][local195];
						@Pc(232) int[] local232 = this.anIntArrayArrayArray13[local191][local195];
						@Pc(239) int[] local239 = this.anIntArrayArrayArray12[local191][local195];
						@Pc(251) int[] local251 = this.anIntArrayArrayArray11 == null ? null : this.anIntArrayArrayArray11[local191][local195];
						if (local232 == null) {
							local232 = local239;
						}
						@Pc(267) int[] local267 = this.anIntArrayArrayArray14 == null ? null : this.anIntArrayArrayArray14[local191][local195];
						@Pc(274) float local274 = this.aFloatArrayArray8[local191][local195];
						@Pc(281) float local281 = this.aFloatArrayArray7[local191][local195];
						@Pc(288) float local288 = this.aFloatArrayArray9[local191][local195];
						@Pc(297) float local297 = this.aFloatArrayArray8[local191][local195 + 1];
						@Pc(306) float local306 = this.aFloatArrayArray7[local191][local195 + 1];
						@Pc(315) float local315 = this.aFloatArrayArray9[local191][local195 + 1];
						@Pc(326) float local326 = this.aFloatArrayArray8[local191 + 1][local195 + 1];
						@Pc(337) float local337 = this.aFloatArrayArray7[local191 + 1][local195 + 1];
						@Pc(348) float local348 = this.aFloatArrayArray9[local191 + 1][local195 + 1];
						@Pc(357) float local357 = this.aFloatArrayArray8[local191 + 1][local195];
						@Pc(366) float local366 = this.aFloatArrayArray7[local191 + 1][local195];
						@Pc(375) float local375 = this.aFloatArrayArray9[local191 + 1][local195];
						@Pc(383) int local383 = local19[local191][local195] & 0xFF;
						@Pc(393) int local393 = local19[local191][local195 + 1] & 0xFF;
						@Pc(405) int local405 = local19[local191 + 1][local195 + 1] & 0xFF;
						@Pc(415) int local415 = local19[local191 + 1][local195] & 0xFF;
						@Pc(417) int local417 = 0;
						@Pc(427) int local427;
						label335: for (@Pc(419) int local419 = 0; local419 < local239.length; local419++) {
							@Pc(425) Class1_Sub13 local425 = local211[local419];
							for (local427 = 0; local427 < local417; local427++) {
								if (local189[local427] == local425) {
									continue label335;
								}
							}
							local189[local417++] = local425;
						}
						@Pc(468) short[] local468 = this.aShortArrayArray8[super.anInt6757 * local195 + local191] = new short[local239.length];
						for (local427 = 0; local427 < local239.length; local427++) {
							@Pc(482) int local482 = (local191 << super.anInt6759) + local218[local427];
							@Pc(492) int local492 = (local195 << super.anInt6759) + local225[local427];
							@Pc(497) int local497 = local482 >> this.anInt6783;
							@Pc(502) int local502 = local492 >> this.anInt6783;
							@Pc(506) int local506 = local239[local427];
							@Pc(510) int local510 = local232[local427];
							@Pc(518) int local518 = local251 == null ? 0 : local251[local427];
							@Pc(536) long local536 = (long) (local497 << 16) | (long) local510 << 48 | (long) local506 << 32 | (long) local502;
							@Pc(540) int local540 = local218[local427];
							@Pc(544) int local544 = local225[local427];
							@Pc(546) byte local546 = 74;
							@Pc(548) int local548 = 0;
							@Pc(550) float local550 = 1.0F;
							@Pc(556) float local556;
							@Pc(558) float local558;
							@Pc(560) float local560;
							@Pc(644) float local644;
							@Pc(564) int local564;
							if (local540 == 0 && local544 == 0) {
								local556 = local274;
								local558 = local281;
								local560 = local288;
								local564 = local546 - local383;
							} else if (local540 == 0 && local544 == super.anInt6760) {
								local564 = local546 - local393;
								local556 = local297;
								local558 = local306;
								local560 = local315;
							} else if (super.anInt6760 == local540 && super.anInt6760 == local544) {
								local564 = local546 - local405;
								local560 = local348;
								local556 = local326;
								local558 = local337;
							} else if (super.anInt6760 == local540 && local544 == 0) {
								local558 = local366;
								local556 = local357;
								local560 = local375;
								local564 = local546 - local415;
							} else {
								@Pc(620) float local620 = (float) local540 / (float) super.anInt6760;
								@Pc(627) float local627 = (float) local544 / (float) super.anInt6760;
								@Pc(636) float local636 = (local357 - local274) * local620 + local274;
								local644 = (local366 - local281) * local620 + local281;
								@Pc(653) float local653 = local288 + (local375 - local288) * local620;
								@Pc(661) float local661 = (local326 - local297) * local620 + local297;
								@Pc(669) float local669 = local306 + local620 * (local337 - local306);
								local558 = local644 + local627 * (local669 - local644);
								local556 = local627 * (local661 - local636) + local636;
								@Pc(694) float local694 = local315 + local620 * (local348 - local315);
								local560 = (local694 - local653) * local627 + local653;
								@Pc(714) int local714 = (local540 * (local415 - local383) >> super.anInt6759) + local383;
								@Pc(726) int local726 = local393 + (local540 * (local405 - local393) >> super.anInt6759);
								local564 = local546 - ((local726 - local714) * local544 >> super.anInt6759) - local714;
							}
							if (local506 != -1) {
								@Pc(774) int local774 = local564 * (local506 & 0x7F) >> 7;
								if (local774 < 2) {
									local774 = 2;
								} else if (local774 > 126) {
									local774 = 126;
								}
								local548 = Static134.anIntArray182[local774 | local506 & 0xFF80];
								if ((this.anInt6771 & 0x7) == 0) {
									local550 = local556 * this.aClass117_Sub1_41.aFloatArray12[0] + this.aClass117_Sub1_41.aFloatArray12[1] * local558 + local560 * this.aClass117_Sub1_41.aFloatArray12[2];
									local550 = (local550 > 0.0F ? this.aClass117_Sub1_41.aFloat50 : this.aClass117_Sub1_41.aFloat44) * local550 + this.aClass117_Sub1_41.aFloat31;
								}
							}
							@Pc(847) Class1 local847 = null;
							if ((local482 & this.anInt6764 - 1) == 0 && (this.anInt6764 - 1 & local492) == 0) {
								local847 = local185.method4405(local536);
							}
							@Pc(1211) int local1211;
							@Pc(909) int local909;
							if (local847 == null) {
								if (local510 == local506) {
									local909 = local548;
								} else {
									@Pc(889) int local889 = local564 * (local510 & 0x7F) >> 7;
									if (local889 < 2) {
										local889 = 2;
									} else if (local889 > 126) {
										local889 = 126;
									}
									local909 = Static134.anIntArray182[local510 & 0xFF80 | local889];
									if ((this.anInt6771 & 0x7) == 0) {
										local644 = this.aClass117_Sub1_41.aFloatArray12[2] * local560 + this.aClass117_Sub1_41.aFloatArray12[0] * local556 + this.aClass117_Sub1_41.aFloatArray12[1] * local558;
										local644 = local550 * (local550 > 0.0F ? this.aClass117_Sub1_41.aFloat50 : this.aClass117_Sub1_41.aFloat44) + this.aClass117_Sub1_41.aFloat31;
										@Pc(965) int local965 = local909 >> 16 & 0xFF;
										@Pc(971) int local971 = local909 >> 8 & 0xFF;
										local965 = (int) ((float) local965 * local644);
										@Pc(981) int local981 = local909 & 0xFF;
										if (local965 < 0) {
											local965 = 0;
										} else if (local965 > 255) {
											local965 = 255;
										}
										local971 = (int) ((float) local971 * local644);
										if (local971 < 0) {
											local971 = 0;
										} else if (local971 > 255) {
											local971 = 255;
										}
										local981 = (int) ((float) local981 * local644);
										if (local981 < 0) {
											local981 = 0;
										} else if (local981 > 255) {
											local981 = 255;
										}
										local909 = local965 << 16 | local971 << 8 | local981;
									}
								}
								if (this.aClass117_Sub1_41.aBoolean291) {
									local164.a((float) local482);
									local164.a((float) (local518 + this.ca(local482, local492)));
									local164.a((float) local492);
									local164.b((byte) (local909 >> 16));
									local164.b((byte) (local909 >> 8));
									local164.b((byte) local909);
									local164.b(-1);
									local164.a((float) local482);
									local164.a((float) local492);
									if (this.anIntArrayArrayArray14 != null) {
										local164.a((float) (local267 == null ? 0 : local267[local427] - 1));
									}
									if ((this.anInt6771 & 0x7) != 0) {
										local164.a(local556);
										local164.a(local558);
										local164.a(local560);
									}
								} else {
									local164.b((float) local482);
									local164.b((float) (local518 + this.ca(local482, local492)));
									local164.b((float) local492);
									local164.b((byte) (local909 >> 16));
									local164.b((byte) (local909 >> 8));
									local164.b((byte) local909);
									local164.b(-1);
									local164.b((float) local482);
									local164.b((float) local492);
									if (this.anIntArrayArrayArray14 != null) {
										local164.b((float) (local267 == null ? 0 : local267[local427] - 1));
									}
									if ((this.anInt6771 & 0x7) != 0) {
										local164.b(local556);
										local164.b(local558);
										local164.b(local560);
									}
								}
								local1211 = this.anInt6780++;
								local468[local427] = (short) local1211;
								if (local506 != -1) {
									local168[local1211] = local211[local427];
								}
								local185.method4413(local536, new Class1_Sub31(local468[local427]));
							} else {
								local468[local427] = ((Class1_Sub31) local847).aShort61;
								local1211 = local468[local427] & 0xFFFF;
								if (local506 != -1 && local168[local1211].aLong236 > local211[local427].aLong236) {
									local168[local1211] = local211[local427];
								}
							}
							for (local909 = 0; local909 < local417; local909++) {
								local189[local909].method1481(local564, local550, local548, local1211);
							}
							this.anInt6769++;
						}
					}
				}
			}
			for (local195 = 0; local195 < this.anInt6780; local195++) {
				@Pc(1323) Class1_Sub13 local1323 = local168[local195];
				if (local1323 != null) {
					local1323.method1480(local195);
				}
			}
			@Pc(1356) int local1356;
			for (@Pc(1336) int local1336 = 0; local1336 < super.anInt6757; local1336++) {
				for (@Pc(1340) int local1340 = 0; local1340 < super.anInt6758; local1340++) {
					@Pc(1352) short[] local1352 = this.aShortArrayArray8[local1336 + local1340 * super.anInt6757];
					if (local1352 != null) {
						local1356 = 0;
						@Pc(1358) int local1358 = 0;
						while (local1352.length > local1358) {
							@Pc(1367) int local1367 = local1352[local1358++] & 0xFFFF;
							@Pc(1374) int local1374 = local1352[local1358++] & 0xFFFF;
							@Pc(1381) int local1381 = local1352[local1358++] & 0xFFFF;
							@Pc(1385) Class1_Sub13 local1385 = local168[local1367];
							@Pc(1389) Class1_Sub13 local1389 = local168[local1374];
							@Pc(1393) Class1_Sub13 local1393 = local168[local1381];
							@Pc(1395) Class1_Sub13 local1395 = null;
							if (local1385 != null) {
								local1385.method1484(local1356, local1340, local1336);
								local1395 = local1385;
							}
							if (local1389 != null) {
								local1389.method1484(local1356, local1340, local1336);
								if (local1395 == null || local1395.aLong236 > local1389.aLong236) {
									local1395 = local1389;
								}
							}
							if (local1393 != null) {
								local1393.method1484(local1356, local1340, local1336);
								if (local1395 == null || local1393.aLong236 < local1395.aLong236) {
									local1395 = local1393;
								}
							}
							if (local1395 != null) {
								if (local1385 != null) {
									local1395.method1480(local1367);
								}
								if (local1389 != null) {
									local1395.method1480(local1374);
								}
								if (local1393 != null) {
									local1395.method1480(local1381);
								}
								local1395.method1484(local1356, local1340, local1336);
							}
							local1356++;
						}
					}
				}
			}
			local164.a();
			this.anInterface9_7 = this.aClass117_Sub1_41.method2521(local159, local137, local164.b());
			this.aClass80_16 = new Class80(this.anInterface9_7, 5126, 3, 0);
			this.aClass80_14 = new Class80(this.anInterface9_7, 5121, 4, 12);
			@Pc(1542) byte local1542;
			if (this.anIntArrayArrayArray14 == null) {
				this.aClass80_13 = new Class80(this.anInterface9_7, 5126, 2, 16);
				local1542 = 24;
			} else {
				local1542 = 28;
				this.aClass80_13 = new Class80(this.anInterface9_7, 5126, 3, 16);
			}
			if ((this.anInt6771 & 0x7) != 0) {
				this.aClass80_15 = new Class80(this.anInterface9_7, 5126, 3, local1542);
			}
			@Pc(1579) long[] local1579 = new long[this.aClass1_Sub13Array1.length];
			for (local1356 = 0; local1356 < this.aClass1_Sub13Array1.length; local1356++) {
				@Pc(1588) Class1_Sub13 local1588 = this.aClass1_Sub13Array1[local1356];
				local1579[local1356] = local1588.aLong236;
				local1588.method1479(this.anInt6780);
			}
			Static50.method668(local1579, this.aClass1_Sub13Array1);
			if (this.aClass30_2 != null) {
				this.aClass30_2.method467();
			}
		}
		this.anIntArrayArrayArray14 = null;
		this.anIntArrayArrayArray10 = this.anIntArrayArrayArray9 = null;
		this.aByteArrayArray135 = null;
		this.anIntArrayArrayArray12 = null;
		this.anIntArrayArrayArray11 = null;
		this.anIntArrayArrayArray13 = null;
		this.aClass1_Sub13ArrayArrayArray1 = null;
		this.aClass208_38 = null;
		this.aFloatArrayArray8 = this.aFloatArrayArray7 = this.aFloatArrayArray9 = null;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method5369(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!ls;[I)V")
	@Override
	public void method5365(@OriginalArg(0) Class1_Sub29 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass14_47.method205(new Class1_Sub5(this.aClass117_Sub1_41, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IIILclient!kr;)V")
	private void method5372(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub3_Sub11_Sub1 arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray10[arg0][arg1];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray9[arg0][arg1];
		@Pc(22) int local22 = local12.length;
		if (this.aClass117_Sub1_41.anIntArray232.length < local22) {
			this.aClass117_Sub1_41.anIntArray231 = new int[local22];
			this.aClass117_Sub1_41.anIntArray232 = new int[local22];
		}
		@Pc(42) int[] local42 = this.aClass117_Sub1_41.anIntArray232;
		@Pc(46) int[] local46 = this.aClass117_Sub1_41.anIntArray231;
		for (@Pc(48) int local48 = 0; local48 < local22; local48++) {
			local42[local48] = (local12[local48] & 0xFF) >> this.aClass117_Sub1_41.anInt3091;
			local46[local48] = (local19[local48] & 0xFF) >> this.aClass117_Sub1_41.anInt3091;
		}
		@Pc(90) int local90 = 0;
		while (local22 > local90) {
			@Pc(96) int local96 = local42[local90];
			@Pc(101) int local101 = local46[local90++];
			@Pc(105) int local105 = local42[local90];
			@Pc(110) int local110 = local46[local90++];
			@Pc(114) int local114 = local42[local90];
			@Pc(119) int local119 = local46[local90++];
			if ((local110 - local119) * (local96 + -local105) - (local110 - local101) * (local114 - local105) > 0) {
				arg2.method3207(local110, local96, local101, local105, local119, local114);
			}
		}
	}

	@OriginalMember(owner = "client!us", name = "ba", descriptor = "(Lclient!i;IIIIZ)V")
	@Override
	public void ba(@OriginalArg(0) Class1_Sub3_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass30_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass117_Sub1_41.anInt3117 >> 8) >> this.aClass117_Sub1_41.anInt3091;
			@Pc(39) int local39 = arg3 - (this.aClass117_Sub1_41.anInt3105 * arg2 >> 8) >> this.aClass117_Sub1_41.anInt3091;
			this.aClass30_2.method466(arg0, local24, local39);
		}
	}

	@OriginalMember(owner = "client!us", name = "qa", descriptor = "(III)V")
	@Override
	public void qa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray135[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray135[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!us", name = "ua", descriptor = "(II)I")
	@Override
	public int ua(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray51[arg0][arg1];
	}

	@OriginalMember(owner = "client!us", name = "ca", descriptor = "(II)I")
	@Override
	public int ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 >> super.anInt6759;
		@Pc(13) int local13 = arg1 >> super.anInt6759;
		if (local8 < 0 || local13 < 0 || super.anInt6757 - 1 < local8 || super.anInt6758 - 1 < local13) {
			return 0;
		}
		@Pc(41) int local41 = arg0 & super.anInt6760 - 1;
		@Pc(48) int local48 = super.anInt6760 - 1 & arg1;
		@Pc(75) int local75 = local41 * this.anIntArrayArray51[local8 + 1][local13] + (super.anInt6760 - local41) * this.anIntArrayArray51[local8][local13] >> super.anInt6759;
		@Pc(106) int local106 = (super.anInt6760 - local41) * this.anIntArrayArray51[local8][local13 + 1] + this.anIntArrayArray51[local8 + 1][local13 + 1] * local41 >> super.anInt6759;
		return local106 * local48 + local75 * (super.anInt6760 - local48) >> super.anInt6759;
	}

	@OriginalMember(owner = "client!us", name = "pa", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray14 == null) {
			this.anIntArrayArrayArray14 = new int[super.anInt6757][super.anInt6758][];
		}
		if (arg3 != null && this.anIntArrayArrayArray11 == null) {
			this.anIntArrayArrayArray11 = new int[super.anInt6757][super.anInt6758][];
		}
		this.anIntArrayArrayArray10[arg0][arg1] = arg2;
		this.anIntArrayArrayArray9[arg0][arg1] = arg4;
		this.anIntArrayArrayArray12[arg0][arg1] = arg6;
		this.anIntArrayArrayArray13[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray14 != null) {
			this.anIntArrayArrayArray14[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray11 != null) {
			this.anIntArrayArrayArray11[arg0][arg1] = arg3;
		}
		@Pc(88) Class1_Sub13[] local88 = this.aClass1_Sub13ArrayArrayArray1[arg0][arg1] = new Class1_Sub13[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48 | (long) (arg9[local90] << 14) | (long) arg8[local90];
			@Pc(125) Class1 local125;
			for (local125 = this.aClass208_38.method4405(local119); local125 != null; local125 = this.aClass208_38.method4415()) {
				@Pc(130) Class1_Sub13 local130 = (Class1_Sub13) local125;
				if (local130.anInt1791 == arg8[local90] && (float) arg9[local90] == local130.aFloat12 && arg10 == local130.anInt1798 && local130.anInt1802 == arg11 && local130.anInt1793 == arg12) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class1_Sub13(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass208_38.method4413(local119, local88[local90]);
			} else {
				local88[local90] = (Class1_Sub13) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray134[arg0][arg1] = (byte) (this.aByteArrayArray134[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt6785) {
			this.anInt6785 = arg6.length;
		}
		this.lb += arg6.length;
	}

	@OriginalMember(owner = "client!us", name = "OA", descriptor = "(IILclient!i;)Lclient!i;")
	@Override
	public Class1_Sub3_Sub11 OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub3_Sub11 arg2) {
		if ((this.aByteArrayArray134[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(21) int local21 = super.anInt6760 >> this.aClass117_Sub1_41.anInt3091;
		@Pc(24) Class1_Sub3_Sub11_Sub1 local24 = (Class1_Sub3_Sub11_Sub1) arg2;
		@Pc(40) Class1_Sub3_Sub11_Sub1 local40;
		if (local24 != null && local24.method3201(local21, local21)) {
			local40 = local24;
			local24.method3202();
		} else {
			local40 = new Class1_Sub3_Sub11_Sub1(this.aClass117_Sub1_41, local21, local21);
		}
		local40.method3206(local21, 0, 0, local21);
		this.method5372(arg0, arg1, local40);
		return local40;
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(II)V")
	@Override
	public void method5364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!i;IIIIZ)Z")
	@Override
	public boolean method5367(@OriginalArg(0) Class1_Sub3_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass30_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (this.aClass117_Sub1_41.anInt3117 * arg2 >> 8) >> this.aClass117_Sub1_41.anInt3091;
			@Pc(39) int local39 = arg3 - (this.aClass117_Sub1_41.anInt3105 * arg2 >> 8) >> this.aClass117_Sub1_41.anInt3091;
			return this.aClass30_2.method468(local39, local25, arg0);
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method5368(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.lb <= 0) {
			return;
		}
		this.aClass117_Sub1_41.method2481();
		this.aClass117_Sub1_41.method2513(false);
		this.aClass117_Sub1_41.method2498(false);
		this.aClass117_Sub1_41.method2462(false);
		this.aClass117_Sub1_41.method2469(false);
		this.aClass117_Sub1_41.method2503(0);
		this.aClass117_Sub1_41.method2531(-2);
		this.aClass117_Sub1_41.method2504(null);
		Static115.aFloatArray4[9] = 0.0F;
		Static115.aFloatArray4[4] = 0.0F;
		Static115.aFloatArray4[13] = 1.0F - ((float) (arg3 * 1024) / 128.0F + (float) 0) / (float) this.aClass117_Sub1_41.anInt3052;
		Static115.aFloatArray4[15] = 1.0F;
		Static115.aFloatArray4[12] = -(((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass117_Sub1_41.anInt3049) - 1.0F;
		Static115.aFloatArray4[5] = (float) 1024 / ((float) this.aClass117_Sub1_41.anInt3052 * (float) super.anInt6760 * 128.0F);
		Static115.aFloatArray4[7] = 0.0F;
		Static115.aFloatArray4[11] = 0.0F;
		Static115.aFloatArray4[14] = 0.0F;
		Static115.aFloatArray4[6] = 0.0F;
		Static115.aFloatArray4[0] = (float) 1024 / ((float) super.anInt6760 * 128.0F * (float) this.aClass117_Sub1_41.anInt3049);
		Static115.aFloatArray4[8] = 0.0F;
		Static115.aFloatArray4[2] = 0.0F;
		Static115.aFloatArray4[3] = 0.0F;
		Static115.aFloatArray4[10] = 0.0F;
		Static115.aFloatArray4[1] = 0.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static115.aFloatArray4, 0);
		Static115.aFloatArray4[6] = 1.0F;
		Static115.aFloatArray4[11] = 0.0F;
		Static115.aFloatArray4[3] = 0.0F;
		Static115.aFloatArray4[14] = 0.0F;
		Static115.aFloatArray4[8] = 0.0F;
		Static115.aFloatArray4[2] = 0.0F;
		Static115.aFloatArray4[9] = 1.0F;
		Static115.aFloatArray4[1] = 0.0F;
		Static115.aFloatArray4[13] = 0.0F;
		Static115.aFloatArray4[12] = 0.0F;
		Static115.aFloatArray4[15] = 1.0F;
		Static115.aFloatArray4[0] = 1.0F;
		Static115.aFloatArray4[7] = 0.0F;
		Static115.aFloatArray4[4] = 0.0F;
		Static115.aFloatArray4[5] = 0.0F;
		Static115.aFloatArray4[10] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static115.aFloatArray4, 0);
		if ((this.anInt6771 & 0x7) == 0) {
			this.aClass117_Sub1_41.method2498(false);
		} else {
			this.aClass117_Sub1_41.method2498(true);
			this.aClass117_Sub1_41.method2517();
		}
		this.aClass117_Sub1_41.method2475(this.aClass80_13, this.aClass80_15, this.aClass80_14, this.aClass80_16);
		if (this.anInt6769 * 2 <= this.aClass117_Sub1_41.aClass1_Sub19_Sub1_2.aByteArray38.length) {
			this.aClass117_Sub1_41.aClass1_Sub19_Sub1_2.anInt3698 = 0;
		} else {
			this.aClass117_Sub1_41.aClass1_Sub19_Sub1_2 = new Class1_Sub19_Sub1(this.anInt6769 * 2);
		}
		@Pc(308) int local308 = 0;
		@Pc(312) Class1_Sub19_Sub1 local312 = this.aClass117_Sub1_41.aClass1_Sub19_Sub1_2;
		@Pc(318) int local318;
		@Pc(327) int local327;
		@Pc(329) int local329;
		@Pc(348) short[] local348;
		@Pc(352) int local352;
		if (this.aClass117_Sub1_41.aBoolean291) {
			for (local318 = arg1; local318 < arg3; local318++) {
				local327 = arg0 + super.anInt6757 * local318;
				for (local329 = arg0; local329 < arg2; local329++) {
					if (arg4[local329 - arg0][local318 - arg1]) {
						local348 = this.aShortArrayArray8[local327];
						if (local348 != null) {
							for (local352 = 0; local352 < local348.length; local352++) {
								local312.method2930(local348[local352] & 0xFFFF);
								local308++;
							}
						}
					}
					local327++;
				}
			}
		} else {
			for (local318 = arg1; local318 < arg3; local318++) {
				local327 = arg0 + super.anInt6757 * local318;
				for (local329 = arg0; local329 < arg2; local329++) {
					if (arg4[local329 - arg0][local318 - arg1]) {
						local348 = this.aShortArrayArray8[local327];
						if (local348 != null) {
							for (local352 = 0; local352 < local348.length; local352++) {
								local312.method2936(local348[local352] & 0xFFFF);
								local308++;
							}
						}
					}
					local327++;
				}
			}
		}
		if (local308 > 0) {
			@Pc(468) Class72_Sub1 local468 = new Class72_Sub1(this.aClass117_Sub1_41, 5123, local312.aByteArray38, local312.anInt3698);
			this.aClass117_Sub1_41.method2534(0, local468, local308);
		}
	}
}
