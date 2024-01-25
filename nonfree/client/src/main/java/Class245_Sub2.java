import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class245_Sub2 extends Class245 {

	@OriginalMember(owner = "client!si", name = "p", descriptor = "I")
	private int anInt9150;

	@OriginalMember(owner = "client!si", name = "H", descriptor = "I")
	private int anInt9162;

	@OriginalMember(owner = "client!si", name = "K", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray17;

	@OriginalMember(owner = "client!si", name = "R", descriptor = "I")
	private int anInt9166;

	@OriginalMember(owner = "client!si", name = "S", descriptor = "Lclient!tea;")
	private Interface26 anInterface26_17;

	@OriginalMember(owner = "client!si", name = "T", descriptor = "[Lclient!li;")
	private Class6_Sub35[] aClass6_Sub35Array1;

	@OriginalMember(owner = "client!si", name = "X", descriptor = "Lclient!tea;")
	private Interface26 anInterface26_18;

	@OriginalMember(owner = "client!si", name = "Y", descriptor = "I")
	private int anInt9168;

	@OriginalMember(owner = "client!si", name = "ab", descriptor = "Lclient!qa;")
	public Class270 aClass270_23;

	@OriginalMember(owner = "client!si", name = "J", descriptor = "F")
	private float aFloat165 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!si", name = "Q", descriptor = "F")
	private float aFloat166 = -3.4028235E38F;

	@OriginalMember(owner = "client!si", name = "u", descriptor = "Lclient!kba;")
	private final Class163 aClass163_54 = new Class163();

	@OriginalMember(owner = "client!si", name = "l", descriptor = "Lclient!uv;")
	public final Class5_Sub2 aClass5_Sub2_20;

	@OriginalMember(owner = "client!si", name = "r", descriptor = "I")
	private final int anInt9151;

	@OriginalMember(owner = "client!si", name = "B", descriptor = "[[B")
	private final byte[][] aByteArrayArray26;

	@OriginalMember(owner = "client!si", name = "P", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray20;

	@OriginalMember(owner = "client!si", name = "w", descriptor = "I")
	private final int anInt9154;

	@OriginalMember(owner = "client!si", name = "z", descriptor = "I")
	public final int anInt9157;

	@OriginalMember(owner = "client!si", name = "N", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray18;

	@OriginalMember(owner = "client!si", name = "G", descriptor = "[[[Lclient!li;")
	private Class6_Sub35[][][] aClass6_Sub35ArrayArrayArray1;

	@OriginalMember(owner = "client!si", name = "s", descriptor = "[[S")
	public final short[][] aShortArrayArray29;

	@OriginalMember(owner = "client!si", name = "W", descriptor = "[[F")
	private float[][] aFloatArrayArray15;

	@OriginalMember(owner = "client!si", name = "Z", descriptor = "[[F")
	private float[][] aFloatArrayArray16;

	@OriginalMember(owner = "client!si", name = "q", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!si", name = "n", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!si", name = "bb", descriptor = "[[B")
	private byte[][] aByteArrayArray27;

	@OriginalMember(owner = "client!si", name = "O", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray19;

	@OriginalMember(owner = "client!si", name = "cb", descriptor = "[[F")
	private float[][] aFloatArrayArray17;

	@OriginalMember(owner = "client!si", name = "U", descriptor = "Lclient!wr;")
	private Class380 aClass380_41;

	@OriginalMember(owner = "client!si", name = "F", descriptor = "Lclient!bba;")
	private Class23 aClass23_2;

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "(Lclient!uv;IIII[[I[[II)V")
	public Class245_Sub2(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass5_Sub2_20 = arg0;
		this.anInt9151 = super.anInt9286 - 2;
		this.aByteArrayArray26 = new byte[arg3][arg4];
		this.anIntArrayArrayArray20 = new int[arg3][arg4][];
		this.anInt9154 = 0x1 << this.anInt9151;
		this.anInt9157 = arg2;
		this.anIntArrayArrayArray18 = new int[arg3][arg4][];
		this.aClass6_Sub35ArrayArrayArray1 = new Class6_Sub35[arg3][arg4][];
		this.aShortArrayArray29 = new short[arg3 * arg4][];
		this.aFloatArrayArray15 = new float[super.anInt9289 + 1][super.anInt9290 + 1];
		this.aFloatArrayArray16 = new float[super.anInt9289 + 1][super.anInt9290 + 1];
		this.anIntArrayArrayArray16 = new int[arg3][arg4][];
		this.anIntArrayArrayArray15 = new int[arg3][arg4][];
		this.aByteArrayArray27 = new byte[arg3 + 1][arg4 + 1];
		this.anIntArrayArrayArray19 = new int[arg3][arg4][];
		this.aFloatArrayArray17 = new float[super.anInt9289 + 1][super.anInt9290 + 1];
		for (@Pc(121) int local121 = 0; local121 <= super.anInt9290; local121++) {
			for (@Pc(125) int local125 = 0; local125 <= super.anInt9289; local125++) {
				@Pc(134) int local134 = super.anIntArrayArray51[local125][local121];
				if (this.aFloat166 < (float) local134) {
					this.aFloat166 = (float) local134;
				}
				if ((float) local134 < this.aFloat165) {
					this.aFloat165 = (float) local134;
				}
				if (local125 > 0 && local121 > 0 && local125 < super.anInt9289 && local121 < super.anInt9290) {
					@Pc(185) int local185 = arg6[local125 + 1][local121] - arg6[local125 - 1][local121];
					@Pc(202) int local202 = arg6[local125][local121 + 1] - arg6[local125][local121 - 1];
					@Pc(221) float local221 = (float) (1.0D / Math.sqrt((double) (local185 * local185 + arg7 * 4 * arg7 + local202 * local202)));
					this.aFloatArrayArray16[local125][local121] = (float) local185 * local221;
					this.aFloatArrayArray15[local125][local121] = local221 * (float) (-arg7 * 2);
					this.aFloatArrayArray17[local125][local121] = local221 * (float) local202;
				}
			}
		}
		this.aFloat165--;
		this.aFloat166++;
		this.aClass380_41 = new Class380(128);
		if ((this.anInt9157 & 0x10) != 0) {
			this.aClass23_2 = new Class23(this.aClass5_Sub2_20, this);
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIZ[[ZIIB)V")
	private void method7472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean[][] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass6_Sub35Array1 == null) {
			return;
		}
		@Pc(10) int local10 = arg5 + arg5 + 1;
		@Pc(14) int local14 = local10 * local10;
		if (Static266.anIntArray244.length < local14) {
			Static266.anIntArray244 = new int[local14];
		}
		@Pc(30) int local30 = arg1 - arg5;
		@Pc(32) int local32 = local30;
		if (local30 < 0) {
			local30 = 0;
		}
		@Pc(43) int local43 = arg2 - arg5;
		@Pc(45) int local45 = local43;
		if (local43 < 0) {
			local43 = 0;
		}
		@Pc(53) int local53 = arg1 + arg5;
		if (local53 > super.anInt9289 - 1) {
			local53 = super.anInt9289 - 1;
		}
		@Pc(73) int local73 = arg2 + arg5;
		Static575.anInt2967 = 0;
		if (super.anInt9290 - 1 < local73) {
			local73 = super.anInt9290 - 1;
		}
		for (@Pc(88) int local88 = local30; local88 <= local53; local88++) {
			@Pc(97) boolean[] local97 = arg4[local88 - local32];
			for (@Pc(99) int local99 = local43; local99 <= local73; local99++) {
				if (local97[local99 - local45]) {
					Static266.anIntArray244[Static575.anInt2967++] = super.anInt9289 * local99 + local88;
				}
			}
		}
		if (arg6 == -1) {
			this.aClass5_Sub2_20.method3979();
		} else {
			this.aClass5_Sub2_20.method4059((float) arg6);
			this.aClass5_Sub2_20.method3940();
		}
		this.aClass5_Sub2_20.method3963();
		this.aClass5_Sub2_20.method3982((this.anInt9157 & 0x7) != 0);
		this.aClass5_Sub2_20.method4042(false, -1, false);
		this.aClass5_Sub2_20.method3974(0, this.anInterface26_18);
		for (@Pc(181) int local181 = 0; local181 < this.aClass6_Sub35Array1.length; local181++) {
			this.aClass6_Sub35Array1[local181].method5337(Static266.anIntArray244, Static575.anInt2967);
		}
		@Pc(202) Class115_Sub3 local202 = this.aClass5_Sub2_20.method3981();
		local202.method6290(0, -1, 0);
		this.aClass5_Sub2_20.method3938();
		if (!this.aClass163_54.method4968()) {
			@Pc(220) int local220 = this.aClass5_Sub2_20.anInt4891;
			@Pc(224) int local224 = this.aClass5_Sub2_20.anInt4869;
			this.aClass5_Sub2_20.L(0, local224, this.aClass5_Sub2_20.anInt4876);
			this.aClass5_Sub2_20.method3982(false);
			this.aClass5_Sub2_20.method4000(false);
			this.aClass5_Sub2_20.method4004(128);
			this.aClass5_Sub2_20.method4042(false, -2, false);
			this.aClass5_Sub2_20.method4008(this.aClass5_Sub2_20.anInterface4_3);
			this.aClass5_Sub2_20.method4022(Static503.aClass144_4, Static438.aClass144_3);
			this.aClass5_Sub2_20.method4054(0, Static347.aClass80_2);
			this.aClass5_Sub2_20.method3956(Static512.aClass80_3, 0);
			for (@Pc(284) Class6 local284 = this.aClass163_54.method4966(); local284 != null; local284 = this.aClass163_54.method4965()) {
				@Pc(289) Class6_Sub31 local289 = (Class6_Sub31) local284;
				local289.method4911(arg4, arg1, arg2, arg5);
			}
			this.aClass5_Sub2_20.method4054(0, Static522.aClass80_4);
			this.aClass5_Sub2_20.method3956(Static522.aClass80_4, 0);
			this.aClass5_Sub2_20.method4008((Interface4) null);
			this.aClass5_Sub2_20.L(local220, local224, this.aClass5_Sub2_20.anInt4876);
		}
		if (this.aClass23_2 != null) {
			this.aClass5_Sub2_20.method3974(0, this.anInterface26_18);
			this.aClass5_Sub2_20.method3974(1, this.anInterface26_17);
			this.aClass5_Sub2_20.method4045(this.aClass270_23);
			this.aClass23_2.method771(arg1, arg3, arg4, arg2, arg5);
		}
	}

	@OriginalMember(owner = "client!si", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.anInt9168 <= 0) {
			this.aClass23_2 = null;
		} else {
			@Pc(19) byte[][] local19 = new byte[super.anInt9289 + 1][super.anInt9290 + 1];
			for (@Pc(21) int local21 = 1; local21 < super.anInt9289; local21++) {
				for (@Pc(25) int local25 = 1; super.anInt9290 > local25; local25++) {
					local19[local21][local25] = (byte) ((this.aByteArrayArray27[local21 + 1][local25] >> 3) + (this.aByteArrayArray27[local21 - 1][local25] >> 2) + (this.aByteArrayArray27[local21][local25 + -1] >> 2) + (this.aByteArrayArray27[local21][local25 - -1] >> 3) + (this.aByteArrayArray27[local21][local25] >> 1));
				}
			}
			@Pc(109) Class6_Sub35[] local109 = new Class6_Sub35[this.aClass380_41.method8756()];
			this.aClass380_41.method8749(local109);
			for (@Pc(117) int local117 = 0; local117 < local109.length; local117++) {
				local109[local117].method5339(this.anInt9168);
			}
			@Pc(133) int local133 = 20;
			if (this.anIntArrayArrayArray17 != null) {
				local133 += 4;
			}
			if ((this.anInt9157 & 0x7) != 0) {
				local133 += 12;
			}
			@Pc(156) NativeHeapBuffer local156 = this.aClass5_Sub2_20.aNativeHeap5.a(this.anInt9168 * 4, false);
			@Pc(166) NativeHeapBuffer local166 = this.aClass5_Sub2_20.aNativeHeap5.a(this.anInt9168 * local133, false);
			@Pc(171) Stream local171 = new Stream(local166);
			@Pc(176) Stream local176 = new Stream(local156);
			@Pc(180) Class6_Sub35[] local180 = new Class6_Sub35[this.anInt9168];
			@Pc(187) int local187 = Static48.method1561(this.anInt9168 / 4);
			if (local187 < 1) {
				local187 = 1;
			}
			@Pc(197) Class380 local197 = new Class380(local187);
			@Pc(201) Class6_Sub35[] local201 = new Class6_Sub35[this.anInt9166];
			@Pc(207) int local207;
			for (@Pc(203) int local203 = 0; super.anInt9289 > local203; local203++) {
				for (local207 = 0; local207 < super.anInt9290; local207++) {
					if (this.anIntArrayArrayArray19[local203][local207] != null) {
						@Pc(223) Class6_Sub35[] local223 = this.aClass6_Sub35ArrayArrayArray1[local203][local207];
						@Pc(230) int[] local230 = this.anIntArrayArrayArray15[local203][local207];
						@Pc(237) int[] local237 = this.anIntArrayArrayArray18[local203][local207];
						@Pc(244) int[] local244 = this.anIntArrayArrayArray20[local203][local207];
						@Pc(251) int[] local251 = this.anIntArrayArrayArray19[local203][local207];
						@Pc(263) int[] local263 = this.anIntArrayArrayArray16 == null ? null : this.anIntArrayArrayArray16[local203][local207];
						if (local244 == null) {
							local244 = local251;
						}
						@Pc(279) int[] local279 = this.anIntArrayArrayArray17 == null ? null : this.anIntArrayArrayArray17[local203][local207];
						@Pc(286) float local286 = this.aFloatArrayArray16[local203][local207];
						@Pc(293) float local293 = this.aFloatArrayArray15[local203][local207];
						@Pc(300) float local300 = this.aFloatArrayArray17[local203][local207];
						@Pc(309) float local309 = this.aFloatArrayArray16[local203][local207 + 1];
						@Pc(318) float local318 = this.aFloatArrayArray15[local203][local207 + 1];
						@Pc(327) float local327 = this.aFloatArrayArray17[local203][local207 + 1];
						@Pc(338) float local338 = this.aFloatArrayArray16[local203 + 1][local207 + 1];
						@Pc(349) float local349 = this.aFloatArrayArray15[local203 + 1][local207 + 1];
						@Pc(360) float local360 = this.aFloatArrayArray17[local203 + 1][local207 + 1];
						@Pc(369) float local369 = this.aFloatArrayArray16[local203 + 1][local207];
						@Pc(378) float local378 = this.aFloatArrayArray15[local203 + 1][local207];
						@Pc(387) float local387 = this.aFloatArrayArray17[local203 + 1][local207];
						@Pc(395) int local395 = local19[local203][local207] & 0xFF;
						@Pc(405) int local405 = local19[local203][local207 + 1] & 0xFF;
						@Pc(417) int local417 = local19[local203 + 1][local207 + 1] & 0xFF;
						@Pc(427) int local427 = local19[local203 + 1][local207] & 0xFF;
						@Pc(429) int local429 = 0;
						@Pc(439) int local439;
						label357: for (@Pc(431) int local431 = 0; local431 < local251.length; local431++) {
							@Pc(437) Class6_Sub35 local437 = local223[local431];
							for (local439 = 0; local439 < local429; local439++) {
								if (local201[local439] == local437) {
									continue label357;
								}
							}
							local201[local429++] = local437;
						}
						@Pc(480) short[] local480 = this.aShortArrayArray29[local203 + super.anInt9289 * local207] = new short[local251.length];
						for (local439 = 0; local439 < local251.length; local439++) {
							@Pc(494) int local494 = (local203 << super.anInt9286) + local230[local439];
							@Pc(503) int local503 = (local207 << super.anInt9286) + local237[local439];
							@Pc(508) int local508 = local494 >> this.anInt9151;
							@Pc(513) int local513 = local503 >> this.anInt9151;
							@Pc(517) int local517 = local251[local439];
							@Pc(521) int local521 = local244[local439];
							@Pc(529) int local529 = local263 == null ? 0 : local263[local439];
							@Pc(547) long local547 = (long) local521 << 48 | (long) local517 << 32 | (long) (local508 << 16) | (long) local513;
							@Pc(551) int local551 = local230[local439];
							@Pc(555) int local555 = local237[local439];
							@Pc(557) byte local557 = 74;
							@Pc(559) int local559 = 0;
							@Pc(561) float local561 = 1.0F;
							@Pc(573) float local573;
							@Pc(581) float local581;
							@Pc(579) float local579;
							@Pc(677) float local677;
							@Pc(577) int local577;
							if (local551 == 0 && local555 == 0) {
								local573 = local286;
								local577 = local557 - local395;
								local579 = local300;
								local581 = local293;
							} else if (local551 == 0 && super.anInt9291 == local555) {
								local577 = local557 - local405;
								local581 = local318;
								local579 = local327;
								local573 = local309;
							} else if (local551 == super.anInt9291 && super.anInt9291 == local555) {
								local581 = local349;
								local573 = local338;
								local577 = local557 - local417;
								local579 = local360;
							} else if (super.anInt9291 == local551 && local555 == 0) {
								local581 = local378;
								local579 = local387;
								local577 = local557 - local427;
								local573 = local369;
							} else {
								@Pc(653) float local653 = (float) local551 / (float) super.anInt9291;
								@Pc(660) float local660 = (float) local555 / (float) super.anInt9291;
								@Pc(668) float local668 = (local369 - local286) * local653 + local286;
								local677 = local653 * (local378 - local293) + local293;
								@Pc(686) float local686 = (local387 - local300) * local653 + local300;
								@Pc(695) float local695 = (local338 - local309) * local653 + local309;
								@Pc(703) float local703 = local318 + (local349 - local318) * local653;
								local581 = local677 + (local703 - local677) * local660;
								@Pc(720) float local720 = local327 + local653 * (local360 - local327);
								local573 = local660 * (local695 - local668) + local668;
								local579 = (local720 - local686) * local660 + local686;
								@Pc(749) int local749 = ((local427 - local395) * local551 >> super.anInt9286) + local395;
								@Pc(761) int local761 = local405 + ((local417 - local405) * local551 >> super.anInt9286);
								local577 = local557 - local749 - ((local761 - local749) * local555 >> super.anInt9286);
							}
							if (local517 != -1) {
								@Pc(797) int local797 = local577 * (local517 & 0x7F) >> 7;
								if (local797 < 2) {
									local797 = 2;
								} else if (local797 > 126) {
									local797 = 126;
								}
								if ((this.anInt9157 & 0x7) == 0) {
									local561 = this.aClass5_Sub2_20.aFloatArray49[0] * local573 + this.aClass5_Sub2_20.aFloatArray49[1] * local581 + local579 * this.aClass5_Sub2_20.aFloatArray49[2];
									local561 = this.aClass5_Sub2_20.aFloat93 + local561 * (local561 > 0.0F ? this.aClass5_Sub2_20.aFloat101 : this.aClass5_Sub2_20.aFloat96);
								}
								local559 = Static376.anIntArray336[local797 | local517 & 0xFF80];
							}
							@Pc(871) Class6 local871 = null;
							if ((local494 & this.anInt9154 - 1) == 0 && (this.anInt9154 - 1 & local503) == 0) {
								local871 = local197.method8747(local547);
							}
							@Pc(1201) int local1201;
							@Pc(932) int local932;
							if (local871 == null) {
								if (local517 == local521) {
									local932 = local559;
								} else {
									@Pc(910) int local910 = (local521 & 0x7F) * local577 >> 7;
									if (local910 < 2) {
										local910 = 2;
									} else if (local910 > 126) {
										local910 = 126;
									}
									local932 = Static376.anIntArray336[local910 | local521 & 0xFF80];
									if ((this.anInt9157 & 0x7) == 0) {
										local677 = this.aClass5_Sub2_20.aFloatArray49[1] * local581 + local573 * this.aClass5_Sub2_20.aFloatArray49[0] + local579 * this.aClass5_Sub2_20.aFloatArray49[2];
										local677 = (local561 > 0.0F ? this.aClass5_Sub2_20.aFloat101 : this.aClass5_Sub2_20.aFloat96) * local561 + this.aClass5_Sub2_20.aFloat93;
										@Pc(985) int local985 = local932 >> 16 & 0xFF;
										@Pc(991) int local991 = local932 >> 8 & 0xFF;
										@Pc(995) int local995 = local932 & 0xFF;
										local985 = (int) ((float) local985 * local677);
										local991 = (int) ((float) local991 * local677);
										if (local985 < 0) {
											local985 = 0;
										} else if (local985 > 255) {
											local985 = 255;
										}
										if (local991 < 0) {
											local991 = 0;
										} else if (local991 > 255) {
											local991 = 255;
										}
										local995 = (int) ((float) local995 * local677);
										if (local995 < 0) {
											local995 = 0;
										} else if (local995 > 255) {
											local995 = 255;
										}
										local932 = local991 << 8 | local985 << 16 | local995;
									}
								}
								if (Stream.a()) {
									local171.b((float) local494);
									local171.b((float) (local529 + this.method7580(local494, local503)));
									local171.b((float) local503);
									local171.b((float) local494);
									local171.b((float) local503);
									if (this.anIntArrayArrayArray17 != null) {
										local171.b((float) (local279 == null ? 0 : local279[local439] - 1));
									}
									if ((this.anInt9157 & 0x7) != 0) {
										local171.b(local573);
										local171.b(local581);
										local171.b(local579);
									}
								} else {
									local171.a((float) local494);
									local171.a((float) (local529 + this.method7580(local494, local503)));
									local171.a((float) local503);
									local171.a((float) local494);
									local171.a((float) local503);
									if (this.anIntArrayArrayArray17 != null) {
										local171.a((float) (local279 == null ? 0 : local279[local439] - 1));
									}
									if ((this.anInt9157 & 0x7) != 0) {
										local171.a(local573);
										local171.a(local581);
										local171.a(local579);
									}
								}
								if (this.aClass5_Sub2_20.anInt4868 == 0) {
									local176.f(local932 | 0xFF000000);
								} else {
									local176.a(local932 | 0xFF000000);
								}
								local1201 = this.anInt9162++;
								local480[local439] = (short) local1201;
								if (local517 != -1) {
									local180[local1201] = local223[local439];
								}
								local197.method8753(new Class6_Sub43(local480[local439]), local547);
							} else {
								local480[local439] = ((Class6_Sub43) local871).aShort97;
								local1201 = local480[local439] & 0xFFFF;
								if (local517 != -1 && local223[local439].aLong278 < local180[local1201].aLong278) {
									local180[local1201] = local223[local439];
								}
							}
							for (local932 = 0; local932 < local429; local932++) {
								local201[local932].method5340(local1201, local577, local559, local561);
							}
							this.anInt9150++;
						}
					}
				}
			}
			for (local207 = 0; local207 < this.anInt9162; local207++) {
				@Pc(1314) Class6_Sub35 local1314 = local180[local207];
				if (local1314 != null) {
					local1314.method5335(local207);
				}
			}
			@Pc(1331) int local1331;
			@Pc(1350) int local1350;
			for (@Pc(1327) int local1327 = 0; local1327 < super.anInt9289; local1327++) {
				for (local1331 = 0; local1331 < super.anInt9290; local1331++) {
					@Pc(1344) short[] local1344 = this.aShortArrayArray29[local1331 * super.anInt9289 + local1327];
					if (local1344 != null) {
						@Pc(1348) int local1348 = 0;
						local1350 = 0;
						while (local1344.length > local1350) {
							@Pc(1359) int local1359 = local1344[local1350++] & 0xFFFF;
							@Pc(1366) int local1366 = local1344[local1350++] & 0xFFFF;
							@Pc(1373) int local1373 = local1344[local1350++] & 0xFFFF;
							@Pc(1377) Class6_Sub35 local1377 = local180[local1359];
							@Pc(1381) Class6_Sub35 local1381 = local180[local1366];
							@Pc(1385) Class6_Sub35 local1385 = local180[local1373];
							@Pc(1387) Class6_Sub35 local1387 = null;
							if (local1377 != null) {
								local1377.method5338(local1348, local1327, local1331);
								local1387 = local1377;
							}
							if (local1381 != null) {
								local1381.method5338(local1348, local1327, local1331);
								if (local1387 == null || local1381.aLong278 < local1387.aLong278) {
									local1387 = local1381;
								}
							}
							if (local1385 != null) {
								local1385.method5338(local1348, local1327, local1331);
								if (local1387 == null || local1385.aLong278 < local1387.aLong278) {
									local1387 = local1385;
								}
							}
							if (local1387 != null) {
								if (local1377 != null) {
									local1387.method5335(local1359);
								}
								if (local1381 != null) {
									local1387.method5335(local1366);
								}
								if (local1385 != null) {
									local1387.method5335(local1373);
								}
								local1387.method5338(local1348, local1327, local1331);
							}
							local1348++;
						}
					}
				}
			}
			local171.c();
			local176.c();
			this.anInterface26_17 = this.aClass5_Sub2_20.method4063(false);
			this.anInterface26_17.method8108(this.anInt9162 * 4, 4, local156);
			this.anInterface26_18 = this.aClass5_Sub2_20.method4063(false);
			this.anInterface26_18.method8108(local133 * this.anInt9162, local133, local166);
			if ((this.anInt9157 & 0x7) == 0) {
				if (this.anIntArrayArrayArray17 == null) {
					this.aClass270_23 = this.aClass5_Sub2_20.method3985(new Class63[] { new Class63(new Class183[] { Static315.aClass183_1, Static315.aClass183_5 }), new Class63(Static315.aClass183_3) });
				} else {
					this.aClass270_23 = this.aClass5_Sub2_20.method3985(new Class63[] { new Class63(new Class183[] { Static315.aClass183_1, Static315.aClass183_5, Static315.aClass183_4 }), new Class63(Static315.aClass183_3) });
				}
			} else if (this.anIntArrayArrayArray17 == null) {
				this.aClass270_23 = this.aClass5_Sub2_20.method3985(new Class63[] { new Class63(new Class183[] { Static315.aClass183_1, Static315.aClass183_5, Static315.aClass183_2 }), new Class63(Static315.aClass183_3) });
			} else {
				this.aClass270_23 = this.aClass5_Sub2_20.method3985(new Class63[] { new Class63(new Class183[] { Static315.aClass183_1, Static315.aClass183_5, Static315.aClass183_4, Static315.aClass183_2 }), new Class63(Static315.aClass183_3) });
			}
			local1331 = 0;
			for (@Pc(1683) int local1683 = 0; local1683 < local109.length; local1683++) {
				if (local109[local1683].anInt6380 > 0) {
					local109[local1331++] = local109[local1683];
				}
			}
			this.aClass6_Sub35Array1 = new Class6_Sub35[local1331];
			@Pc(1716) long[] local1716 = new long[local1331];
			for (local1350 = 0; local1350 < local1331; local1350++) {
				@Pc(1724) Class6_Sub35 local1724 = local109[local1350];
				local1716[local1350] = local1724.aLong278;
				this.aClass6_Sub35Array1[local1350] = local1724;
				local1724.method5336(this.anInt9162);
			}
			Static95.method2328(this.aClass6_Sub35Array1, local1716);
			if (this.aClass23_2 != null) {
				this.aClass23_2.method773();
			}
		}
		this.anIntArrayArrayArray17 = null;
		this.anIntArrayArrayArray16 = null;
		this.aClass380_41 = null;
		this.anIntArrayArrayArray19 = null;
		this.aByteArrayArray27 = null;
		this.aFloatArrayArray16 = this.aFloatArrayArray15 = this.aFloatArrayArray17 = null;
		this.aClass6_Sub35ArrayArrayArray1 = null;
		this.anIntArrayArrayArray20 = null;
		this.anIntArrayArrayArray15 = this.anIntArrayArrayArray18 = null;
	}

	@OriginalMember(owner = "client!si", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray27[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray27[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!si", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class6_Sub5_Sub10 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub5_Sub10 arg2) {
		if ((this.aByteArrayArray26[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(21) int local21 = super.anInt9291 >> this.aClass5_Sub2_20.anInt4864;
		@Pc(24) Class6_Sub5_Sub10_Sub2 local24 = (Class6_Sub5_Sub10_Sub2) arg2;
		@Pc(40) Class6_Sub5_Sub10_Sub2 local40;
		if (local24 != null && local24.method3509(local21, local21)) {
			local40 = local24;
			local24.method3511();
		} else {
			local40 = new Class6_Sub5_Sub10_Sub2(this.aClass5_Sub2_20, local21, local21);
		}
		local40.method3508(local21, 0, 0, local21);
		this.method7473(arg0, arg1, local40);
		return local40;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method7587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!si", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class6_Sub5_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass23_2 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (arg2 * this.aClass5_Sub2_20.anInt4862 >> 8) >> this.aClass5_Sub2_20.anInt4864;
			@Pc(37) int local37 = arg3 - (arg2 * this.aClass5_Sub2_20.anInt4857 >> 8) >> this.aClass5_Sub2_20.anInt4864;
			this.aClass23_2.method775(arg0, local23, local37);
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7585(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt9168 <= 0) {
			return;
		}
		@Pc(16) Interface27 local16 = this.aClass5_Sub2_20.method3966(this.anInt9150);
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = 32767;
		@Pc(22) int local22 = -32768;
		for (@Pc(24) int local24 = 0; local24 < 4; local24++) {
			local18 = 0;
			@Pc(33) Buffer local33 = local16.method7962();
			if (local33 != null) {
				@Pc(41) Stream local41 = this.aClass5_Sub2_20.method4046(local33);
				@Pc(45) int local45;
				@Pc(54) int local54;
				@Pc(56) int local56;
				@Pc(74) short[] local74;
				@Pc(78) int local78;
				@Pc(86) int local86;
				if (Stream.a()) {
					for (local45 = arg1; local45 < arg3; local45++) {
						local54 = arg0 + super.anInt9289 * local45;
						for (local56 = arg0; local56 < arg2; local56++) {
							if (arg4[local56 - arg0][local45 - arg1]) {
								local74 = this.aShortArrayArray29[local54];
								if (local74 != null) {
									for (local78 = 0; local78 < local74.length; local78++) {
										local86 = local74[local78] & 0xFFFF;
										local18++;
										if (local22 < local86) {
											local22 = local86;
										}
										local41.c(local86);
										if (local86 < local20) {
											local20 = local86;
										}
									}
								}
							}
							local54++;
						}
					}
				} else {
					for (local45 = arg1; local45 < arg3; local45++) {
						local54 = local45 * super.anInt9289 + arg0;
						for (local56 = arg0; local56 < arg2; local56++) {
							if (arg4[local56 - arg0][local45 - arg1]) {
								local74 = this.aShortArrayArray29[local54];
								if (local74 != null) {
									for (local78 = 0; local78 < local74.length; local78++) {
										local86 = local74[local78] & 0xFFFF;
										if (local22 < local86) {
											local22 = local86;
										}
										if (local20 > local86) {
											local20 = local86;
										}
										local41.d(local86);
										local18++;
									}
								}
							}
							local54++;
						}
					}
				}
				local41.c();
				if (local16.method7963()) {
					break;
				}
			}
		}
		if (local18 <= 0) {
			return;
		}
		this.aClass5_Sub2_20.method3995();
		this.aClass5_Sub2_20.method4031(false);
		this.aClass5_Sub2_20.method3982(false);
		this.aClass5_Sub2_20.method4016(false);
		this.aClass5_Sub2_20.method4000(false);
		this.aClass5_Sub2_20.method4004(0);
		this.aClass5_Sub2_20.method4042(false, -2, false);
		this.aClass5_Sub2_20.method4008((Interface4) null);
		@Pc(275) Class115_Sub3 local275 = this.aClass5_Sub2_20.method3981();
		@Pc(280) float[] local280 = this.aClass5_Sub2_20.method4037();
		local280[0] = (float) 1024 / ((float) this.aClass5_Sub2_20.anInt4743 * 128.0F * (float) super.anInt9291);
		local280[5] = (float) 1024 / ((float) super.anInt9291 * 128.0F * (float) this.aClass5_Sub2_20.anInt4786);
		local280[9] = 0.0F;
		local280[6] = 0.0F;
		local280[10] = 1.0F / (this.aFloat166 - this.aFloat165);
		local280[14] = -this.aFloat165 / (this.aFloat166 - this.aFloat165);
		local280[13] = 1.0F - ((float) (arg3 * 1024) / 128.0F + (float) 0) / (float) this.aClass5_Sub2_20.anInt4786;
		local280[7] = 0.0F;
		local280[2] = 0.0F;
		local280[8] = 0.0F;
		local280[11] = 0.0F;
		local280[1] = 0.0F;
		local280[15] = 1.0F;
		local280[4] = 0.0F;
		local280[3] = 0.0F;
		local280[12] = -1.0F - ((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass5_Sub2_20.anInt4743;
		local275.method6304(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F, 0.0F);
		this.aClass5_Sub2_20.method3943();
		this.aClass5_Sub2_20.method3938();
		if ((this.anInt9157 & 0x7) == 0) {
			this.aClass5_Sub2_20.method3982(false);
		} else {
			this.aClass5_Sub2_20.method3982(true);
			this.aClass5_Sub2_20.method4068();
		}
		this.aClass5_Sub2_20.method4062(false);
		this.aClass5_Sub2_20.method3974(0, this.anInterface26_18);
		this.aClass5_Sub2_20.method3974(1, this.anInterface26_17);
		this.aClass5_Sub2_20.method4045(this.aClass270_23);
		this.aClass5_Sub2_20.method3976(Static574.aClass248_11, local22 + 1 - local20, 0, local16, local20, local18 / 3);
		this.aClass5_Sub2_20.method4062(true);
	}

	@OriginalMember(owner = "client!si", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class6_Sub5_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass23_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass5_Sub2_20.anInt4862 * arg2 >> 8) >> this.aClass5_Sub2_20.anInt4864;
			@Pc(38) int local38 = arg3 - (this.aClass5_Sub2_20.anInt4857 * arg2 >> 8) >> this.aClass5_Sub2_20.anInt4864;
			this.aClass23_2.method776(arg0, local24, local38);
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method7581(@OriginalArg(0) Class6_Sub5_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass23_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (this.aClass5_Sub2_20.anInt4862 * arg2 >> 8) >> this.aClass5_Sub2_20.anInt4864;
			@Pc(40) int local40 = arg3 - (this.aClass5_Sub2_20.anInt4857 * arg2 >> 8) >> this.aClass5_Sub2_20.anInt4864;
			return this.aClass23_2.method778(local40, arg0, local25);
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ZIILclient!gl;)V")
	private void method7473(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6_Sub5_Sub10_Sub2 arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray15[arg0][arg1];
		@Pc(26) int[] local26 = this.anIntArrayArrayArray18[arg0][arg1];
		@Pc(29) int local29 = local12.length;
		if (local29 > Static638.anIntArray571.length) {
			Static85.anIntArray86 = new int[local29];
			Static638.anIntArray571 = new int[local29];
		}
		for (@Pc(41) int local41 = 0; local41 < local29; local41++) {
			Static638.anIntArray571[local41] = local12[local41] >> this.aClass5_Sub2_20.anInt4864;
			Static85.anIntArray86[local41] = local26[local41] >> this.aClass5_Sub2_20.anInt4864;
		}
		@Pc(69) int local69 = 0;
		while (local69 < local29) {
			@Pc(75) int local75 = Static638.anIntArray571[local69];
			@Pc(80) int local80 = Static85.anIntArray86[local69++];
			@Pc(84) int local84 = Static638.anIntArray571[local69];
			@Pc(89) int local89 = Static85.anIntArray86[local69++];
			@Pc(93) int local93 = Static638.anIntArray571[local69];
			@Pc(98) int local98 = Static85.anIntArray86[local69++];
			if (-((local89 - local80) * (-local84 + local93)) + (local89 - local98) * (local75 - local84) > 0) {
				arg2.method3510(local80, local75, local84, local93, local98, local89);
			}
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!cba;[I)V")
	@Override
	public void method7584(@OriginalArg(0) Class6_Sub10 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass163_54.method4967(new Class6_Sub31(this.aClass5_Sub2_20, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method7589(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method7472(arg5, arg0, arg1, arg4, arg3, arg2, -1);
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(II)V")
	@Override
	public void method7588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!si", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		@Pc(9) Interface7 local9 = this.aClass5_Sub2_20.anInterface7_10;
		if (arg5 != null && this.anIntArrayArrayArray17 == null) {
			this.anIntArrayArrayArray17 = new int[super.anInt9289][super.anInt9290][];
		}
		if (arg3 != null && this.anIntArrayArrayArray16 == null) {
			this.anIntArrayArrayArray16 = new int[super.anInt9289][super.anInt9290][];
		}
		this.anIntArrayArrayArray15[arg0][arg1] = arg2;
		this.anIntArrayArrayArray18[arg0][arg1] = arg4;
		this.anIntArrayArrayArray19[arg0][arg1] = arg6;
		this.anIntArrayArrayArray20[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray17 != null) {
			this.anIntArrayArrayArray17[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray16 != null) {
			this.anIntArrayArrayArray16[arg0][arg1] = arg3;
		}
		@Pc(92) Class6_Sub35[] local92 = this.aClass6_Sub35ArrayArrayArray1[arg0][arg1] = new Class6_Sub35[arg6.length];
		for (@Pc(94) int local94 = 0; local94 < arg6.length; local94++) {
			@Pc(100) int local100 = arg8[local94];
			@Pc(104) int local104 = arg9[local94];
			if ((this.anInt9157 & 0x20) != 0 && local100 != -1 && local9.method6931(local100).aBoolean618) {
				local104 = 128;
				local100 = -1;
			}
			@Pc(149) long local149 = (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42 | (long) (local104 << 14) | (long) local100;
			@Pc(155) Class6 local155;
			for (local155 = this.aClass380_41.method8747(local149); local155 != null; local155 = this.aClass380_41.method8750()) {
				@Pc(160) Class6_Sub35 local160 = (Class6_Sub35) local155;
				if (local160.anInt6368 == local100 && (float) local104 == local160.aFloat130 && arg10 == local160.anInt6374 && local160.anInt6373 == arg11 && arg12 == local160.anInt6370) {
					break;
				}
			}
			if (local155 == null) {
				local92[local94] = new Class6_Sub35(this, local100, local104, arg10, arg11, arg12);
				this.aClass380_41.method8753(local92[local94], local149);
			} else {
				local92[local94] = (Class6_Sub35) local155;
			}
		}
		if (arg13) {
			this.aByteArrayArray26[arg0][arg1] = (byte) (this.aByteArrayArray26[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt9166) {
			this.anInt9166 = arg6.length;
		}
		this.anInt9168 += arg6.length;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method7579(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method7472(arg6, arg0, arg1, arg4, arg3, arg2, arg5);
	}
}
