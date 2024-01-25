import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ow")
public final class Class62_Sub3 extends Class62 {

	@OriginalMember(owner = "client!ow", name = "n", descriptor = "I")
	private int anInt7147;

	@OriginalMember(owner = "client!ow", name = "u", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray18;

	@OriginalMember(owner = "client!ow", name = "x", descriptor = "I")
	private int anInt7152;

	@OriginalMember(owner = "client!ow", name = "bb", descriptor = "Lclient!tfa;")
	private Interface20 anInterface20_10;

	@OriginalMember(owner = "client!ow", name = "cb", descriptor = "Lclient!eh;")
	public Class88 aClass88_19;

	@OriginalMember(owner = "client!ow", name = "db", descriptor = "I")
	private int anInt7169;

	@OriginalMember(owner = "client!ow", name = "ib", descriptor = "[Lclient!ii;")
	private Class6_Sub27[] aClass6_Sub27Array1;

	@OriginalMember(owner = "client!ow", name = "kb", descriptor = "Lclient!tfa;")
	private Interface20 anInterface20_11;

	@OriginalMember(owner = "client!ow", name = "lb", descriptor = "I")
	private int lb;

	@OriginalMember(owner = "client!ow", name = "C", descriptor = "F")
	private float aFloat155 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!ow", name = "K", descriptor = "F")
	private float aFloat156 = -3.4028235E38F;

	@OriginalMember(owner = "client!ow", name = "z", descriptor = "Lclient!mfa;")
	private final Class211 aClass211_60 = new Class211();

	@OriginalMember(owner = "client!ow", name = "s", descriptor = "[[I")
	private final int[][] anIntArrayArray48;

	@OriginalMember(owner = "client!ow", name = "V", descriptor = "Lclient!fo;")
	public final Class9_Sub3 aClass9_Sub3_15;

	@OriginalMember(owner = "client!ow", name = "y", descriptor = "I")
	private final int anInt7153;

	@OriginalMember(owner = "client!ow", name = "J", descriptor = "I")
	public final int anInt7159;

	@OriginalMember(owner = "client!ow", name = "l", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!ow", name = "eb", descriptor = "[[F")
	private float[][] aFloatArrayArray9;

	@OriginalMember(owner = "client!ow", name = "D", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray19;

	@OriginalMember(owner = "client!ow", name = "jb", descriptor = "[[F")
	private float[][] aFloatArrayArray11;

	@OriginalMember(owner = "client!ow", name = "W", descriptor = "[[S")
	public final short[][] aShortArrayArray9;

	@OriginalMember(owner = "client!ow", name = "Y", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray21;

	@OriginalMember(owner = "client!ow", name = "Q", descriptor = "I")
	private final int anInt7164;

	@OriginalMember(owner = "client!ow", name = "S", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray20;

	@OriginalMember(owner = "client!ow", name = "fb", descriptor = "[[F")
	private float[][] aFloatArrayArray10;

	@OriginalMember(owner = "client!ow", name = "r", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray17;

	@OriginalMember(owner = "client!ow", name = "Z", descriptor = "[[B")
	private final byte[][] aByteArrayArray23;

	@OriginalMember(owner = "client!ow", name = "G", descriptor = "[[[Lclient!ii;")
	private Class6_Sub27[][][] aClass6_Sub27ArrayArrayArray1;

	@OriginalMember(owner = "client!ow", name = "mb", descriptor = "[[B")
	private byte[][] aByteArrayArray24;

	@OriginalMember(owner = "client!ow", name = "gb", descriptor = "Lclient!tq;")
	private Class305 aClass305_30;

	@OriginalMember(owner = "client!ow", name = "q", descriptor = "Lclient!vh;")
	private Class331 aClass331_2;

	@OriginalMember(owner = "client!ow", name = "<init>", descriptor = "(Lclient!fo;IIII[[I[[II)V")
	public Class62_Sub3(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.anIntArrayArray48 = arg5;
		this.aClass9_Sub3_15 = arg0;
		this.anInt7153 = super.anInt9883 - 2;
		this.anInt7159 = arg2;
		this.anIntArrayArrayArray16 = new int[arg3][arg4][];
		this.aFloatArrayArray9 = new float[super.anInt9881 + 1][super.anInt9885 + 1];
		this.anIntArrayArrayArray19 = new int[arg3][arg4][];
		this.aFloatArrayArray11 = new float[super.anInt9881 + 1][super.anInt9885 + 1];
		this.aShortArrayArray9 = new short[arg3 * arg4][];
		this.anIntArrayArrayArray21 = new int[arg3][arg4][];
		this.anInt7164 = 0x1 << this.anInt7153;
		this.anIntArrayArrayArray20 = new int[arg3][arg4][];
		this.aFloatArrayArray10 = new float[super.anInt9881 + 1][super.anInt9885 + 1];
		this.anIntArrayArrayArray17 = new int[arg3][arg4][];
		this.aByteArrayArray23 = new byte[arg3][arg4];
		this.aClass6_Sub27ArrayArrayArray1 = new Class6_Sub27[arg3][arg4][];
		this.aByteArrayArray24 = new byte[arg3 + 1][arg4 + 1];
		for (@Pc(123) int local123 = 0; local123 <= super.anInt9885; local123++) {
			for (@Pc(127) int local127 = 0; local127 <= super.anInt9881; local127++) {
				@Pc(136) int local136 = this.anIntArrayArray48[local127][local123];
				if (this.aFloat155 > (float) local136) {
					this.aFloat155 = local136;
				}
				if ((float) local136 > this.aFloat156) {
					this.aFloat156 = local136;
				}
				if (local127 > 0 && local123 > 0 && local127 < super.anInt9881 && super.anInt9885 > local123) {
					@Pc(188) int local188 = arg6[local127 + 1][local123] - arg6[local127 - 1][local123];
					@Pc(205) int local205 = arg6[local127][local123 + 1] - arg6[local127][local123 - 1];
					@Pc(225) float local225 = (float) (1.0D / Math.sqrt((double) (local188 * local188 + arg7 * 4 * arg7 + local205 * local205)));
					this.aFloatArrayArray11[local127][local123] = (float) local188 * local225;
					this.aFloatArrayArray10[local127][local123] = local225 * (float) (-arg7 * 2);
					this.aFloatArrayArray9[local127][local123] = (float) local205 * local225;
				}
			}
		}
		this.aFloat156++;
		this.aFloat155--;
		this.aClass305_30 = new Class305(128);
		if ((this.anInt7159 & 0x10) != 0) {
			this.aClass331_2 = new Class331(this.aClass9_Sub3_15, this);
		}
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(Lclient!w;IIIIZ)Z")
	@Override
	public boolean method8207(@OriginalArg(0) Class6_Sub4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass331_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (arg2 * this.aClass9_Sub3_15.anInt6564 >> 8) >> this.aClass9_Sub3_15.anInt6529;
			@Pc(40) int local40 = arg3 - (this.aClass9_Sub3_15.anInt6558 * arg2 >> 8) >> this.aClass9_Sub3_15.anInt6529;
			return this.aClass331_2.method7803(local25, local40, arg0);
		}
	}

	@OriginalMember(owner = "client!ow", name = "ba", descriptor = "()V")
	@Override
	public void ba() {
		if (this.lb <= 0) {
			this.aClass331_2 = null;
		} else {
			@Pc(19) byte[][] local19 = new byte[super.anInt9881 + 1][super.anInt9885 + 1];
			for (@Pc(21) int local21 = 1; local21 < super.anInt9881; local21++) {
				for (@Pc(25) int local25 = 1; local25 < super.anInt9885; local25++) {
					local19[local21][local25] = (byte) ((this.aByteArrayArray24[local21][local25 - 1] >> 2) + (this.aByteArrayArray24[local21 + 1][local25] >> 3) + (this.aByteArrayArray24[local21 + -1][local25] >> 2) + (this.aByteArrayArray24[local21][local25 + 1] >> 3) + (this.aByteArrayArray24[local21][local25] >> 1));
				}
			}
			@Pc(101) Class6_Sub27[] local101 = new Class6_Sub27[this.aClass305_30.method7443()];
			this.aClass305_30.method7442(local101);
			for (@Pc(109) int local109 = 0; local109 < local101.length; local109++) {
				local101[local109].method4012(this.lb);
			}
			@Pc(125) int local125 = 20;
			if (this.anIntArrayArrayArray18 != null) {
				local125 += 4;
			}
			if ((this.anInt7159 & 0x7) != 0) {
				local125 += 12;
			}
			@Pc(145) NativeHeapBuffer local145 = this.aClass9_Sub3_15.aNativeHeap4.a(this.lb * 4, false);
			@Pc(155) NativeHeapBuffer local155 = this.aClass9_Sub3_15.aNativeHeap4.a(local125 * this.lb, false);
			@Pc(160) Stream local160 = new Stream(local155);
			@Pc(165) Stream local165 = new Stream(local145);
			@Pc(169) Class6_Sub27[] local169 = new Class6_Sub27[this.lb];
			@Pc(176) int local176 = Static479.method7316(this.lb / 4);
			if (local176 < 1) {
				local176 = 1;
			}
			@Pc(186) Class305 local186 = new Class305(local176);
			@Pc(190) Class6_Sub27[] local190 = new Class6_Sub27[this.anInt7169];
			@Pc(196) int local196;
			for (@Pc(192) int local192 = 0; super.anInt9881 > local192; local192++) {
				for (local196 = 0; local196 < super.anInt9885; local196++) {
					if (this.anIntArrayArrayArray17[local192][local196] != null) {
						@Pc(212) Class6_Sub27[] local212 = this.aClass6_Sub27ArrayArrayArray1[local192][local196];
						@Pc(219) int[] local219 = this.anIntArrayArrayArray19[local192][local196];
						@Pc(226) int[] local226 = this.anIntArrayArrayArray16[local192][local196];
						@Pc(233) int[] local233 = this.anIntArrayArrayArray20[local192][local196];
						@Pc(240) int[] local240 = this.anIntArrayArrayArray17[local192][local196];
						@Pc(252) int[] local252 = this.anIntArrayArrayArray21 == null ? null : this.anIntArrayArrayArray21[local192][local196];
						if (local233 == null) {
							local233 = local240;
						}
						@Pc(268) int[] local268 = this.anIntArrayArrayArray18 == null ? null : this.anIntArrayArrayArray18[local192][local196];
						@Pc(275) float local275 = this.aFloatArrayArray11[local192][local196];
						@Pc(282) float local282 = this.aFloatArrayArray10[local192][local196];
						@Pc(289) float local289 = this.aFloatArrayArray9[local192][local196];
						@Pc(298) float local298 = this.aFloatArrayArray11[local192][local196 + 1];
						@Pc(307) float local307 = this.aFloatArrayArray10[local192][local196 + 1];
						@Pc(316) float local316 = this.aFloatArrayArray9[local192][local196 + 1];
						@Pc(327) float local327 = this.aFloatArrayArray11[local192 + 1][local196 + 1];
						@Pc(338) float local338 = this.aFloatArrayArray10[local192 + 1][local196 + 1];
						@Pc(349) float local349 = this.aFloatArrayArray9[local192 + 1][local196 + 1];
						@Pc(358) float local358 = this.aFloatArrayArray11[local192 + 1][local196];
						@Pc(367) float local367 = this.aFloatArrayArray10[local192 + 1][local196];
						@Pc(376) float local376 = this.aFloatArrayArray9[local192 + 1][local196];
						@Pc(384) int local384 = local19[local192][local196] & 0xFF;
						@Pc(394) int local394 = local19[local192][local196 + 1] & 0xFF;
						@Pc(406) int local406 = local19[local192 + 1][local196 + 1] & 0xFF;
						@Pc(416) int local416 = local19[local192 + 1][local196] & 0xFF;
						@Pc(418) int local418 = 0;
						@Pc(428) int local428;
						label357: for (@Pc(420) int local420 = 0; local420 < local240.length; local420++) {
							@Pc(426) Class6_Sub27 local426 = local212[local420];
							for (local428 = 0; local428 < local418; local428++) {
								if (local190[local428] == local426) {
									continue label357;
								}
							}
							local190[local418++] = local426;
						}
						@Pc(469) short[] local469 = this.aShortArrayArray9[local192 + super.anInt9881 * local196] = new short[local240.length];
						for (local428 = 0; local428 < local240.length; local428++) {
							@Pc(482) int local482 = (local192 << super.anInt9883) + local219[local428];
							@Pc(492) int local492 = (local196 << super.anInt9883) + local226[local428];
							@Pc(497) int local497 = local482 >> this.anInt7153;
							@Pc(502) int local502 = local492 >> this.anInt7153;
							@Pc(506) int local506 = local240[local428];
							@Pc(510) int local510 = local233[local428];
							@Pc(518) int local518 = local252 == null ? 0 : local252[local428];
							@Pc(536) long local536 = (long) local502 | (long) local510 << 48 | (long) local506 << 32 | (long) (local497 << 16);
							@Pc(540) int local540 = local219[local428];
							@Pc(544) int local544 = local226[local428];
							@Pc(546) byte local546 = 74;
							@Pc(548) int local548 = 0;
							@Pc(557) float local557;
							@Pc(559) float local559;
							@Pc(565) float local565;
							@Pc(657) float local657;
							@Pc(563) int local563;
							if (local540 == 0 && local544 == 0) {
								local557 = local275;
								local559 = local282;
								local563 = local546 - local384;
								local565 = local289;
							} else if (local540 == 0 && local544 == super.anInt9884) {
								local563 = local546 - local394;
								local559 = local307;
								local565 = local316;
								local557 = local298;
							} else if (super.anInt9884 == local540 && super.anInt9884 == local544) {
								local565 = local349;
								local559 = local338;
								local557 = local327;
								local563 = local546 - local406;
							} else if (local540 == super.anInt9884 && local544 == 0) {
								local565 = local376;
								local559 = local367;
								local563 = local546 - local416;
								local557 = local358;
							} else {
								@Pc(633) float local633 = (float) local540 / (float) super.anInt9884;
								@Pc(640) float local640 = (float) local544 / (float) super.anInt9884;
								@Pc(649) float local649 = local633 * (local358 - local275) + local275;
								local657 = local282 + local633 * (local367 - local282);
								@Pc(666) float local666 = (local376 - local289) * local633 + local289;
								@Pc(674) float local674 = (local327 - local298) * local633 + local298;
								@Pc(683) float local683 = local633 * (local338 - local307) + local307;
								local559 = (local683 - local657) * local640 + local657;
								@Pc(700) float local700 = (local349 - local316) * local633 + local316;
								local557 = local640 * (local674 - local649) + local649;
								local565 = local666 + local640 * (local700 - local666);
								@Pc(727) int local727 = local384 + (local540 * (local416 - local384) >> super.anInt9883);
								@Pc(739) int local739 = (local540 * (local406 - local394) >> super.anInt9883) + local394;
								local563 = local546 - local727 - (local544 * (local739 - local727) >> super.anInt9883);
							}
							@Pc(767) float local767 = 1.0F;
							if (local506 != -1) {
								@Pc(778) int local778 = (local506 & 0x7F) * local563 >> 7;
								if (local778 < 2) {
									local778 = 2;
								} else if (local778 > 126) {
									local778 = 126;
								}
								if ((this.anInt7159 & 0x7) == 0) {
									local767 = local565 * this.aClass9_Sub3_15.aFloatArray40[2] + this.aClass9_Sub3_15.aFloatArray40[1] * local559 + this.aClass9_Sub3_15.aFloatArray40[0] * local557;
									local767 = this.aClass9_Sub3_15.aFloat148 + (local767 > 0.0F ? this.aClass9_Sub3_15.aFloat143 : this.aClass9_Sub3_15.aFloat142) * local767;
								}
								local548 = Static223.anIntArray301[local778 | local506 & 0xFF80];
							}
							@Pc(849) Class6 local849 = null;
							if ((local482 & this.anInt7164 - 1) == 0 && (this.anInt7164 - 1 & local492) == 0) {
								local849 = local186.method7447(local536);
							}
							@Pc(885) int local885;
							@Pc(912) int local912;
							if (local849 == null) {
								if (local510 == local506) {
									local912 = local548;
								} else {
									@Pc(922) int local922 = (local510 & 0x7F) * local563 >> 7;
									if (local922 < 2) {
										local922 = 2;
									} else if (local922 > 126) {
										local922 = 126;
									}
									local912 = Static223.anIntArray301[local510 & 0xFF80 | local922];
									if ((this.anInt7159 & 0x7) == 0) {
										local657 = this.aClass9_Sub3_15.aFloatArray40[0] * local557 + this.aClass9_Sub3_15.aFloatArray40[1] * local559 + local565 * this.aClass9_Sub3_15.aFloatArray40[2];
										local657 = local767 * (local767 > 0.0F ? this.aClass9_Sub3_15.aFloat143 : this.aClass9_Sub3_15.aFloat142) + this.aClass9_Sub3_15.aFloat148;
										@Pc(997) int local997 = local912 >> 16 & 0xFF;
										@Pc(1003) int local1003 = local912 >> 8 & 0xFF;
										@Pc(1007) int local1007 = local912 & 0xFF;
										local997 = (int) ((float) local997 * local657);
										if (local997 < 0) {
											local997 = 0;
										} else if (local997 > 255) {
											local997 = 255;
										}
										local1003 = (int) ((float) local1003 * local657);
										local1007 = (int) ((float) local1007 * local657);
										if (local1003 < 0) {
											local1003 = 0;
										} else if (local1003 > 255) {
											local1003 = 255;
										}
										if (local1007 < 0) {
											local1007 = 0;
										} else if (local1007 > 255) {
											local1007 = 255;
										}
										local912 = local1007 | local1003 << 8 | local997 << 16;
									}
								}
								if (Stream.c()) {
									local160.a((float) local482);
									local160.a((float) (this.sa(local482, local492) + local518));
									local160.a((float) local492);
									local160.a((float) local482);
									local160.a((float) local492);
									if (this.anIntArrayArrayArray18 != null) {
										local160.a((float) (local268 == null ? 0 : local268[local428] - 1));
									}
									if ((this.anInt7159 & 0x7) != 0) {
										local160.a(local557);
										local160.a(local559);
										local160.a(local565);
									}
								} else {
									local160.b((float) local482);
									local160.b((float) (local518 + this.sa(local482, local492)));
									local160.b((float) local492);
									local160.b((float) local482);
									local160.b((float) local492);
									if (this.anIntArrayArrayArray18 != null) {
										local160.b((float) (local268 == null ? 0 : local268[local428] - 1));
									}
									if ((this.anInt7159 & 0x7) != 0) {
										local160.b(local557);
										local160.b(local559);
										local160.b(local565);
									}
								}
								if (this.aClass9_Sub3_15.anInt6542 == 0) {
									local165.b(local912 | 0xFF000000);
								} else {
									local165.e(local912 | 0xFF000000);
								}
								local885 = this.anInt7147++;
								local469[local428] = (short) local885;
								if (local506 != -1) {
									local169[local885] = local212[local428];
								}
								local186.method7448(local536, new Class6_Sub16(local469[local428]));
							} else {
								local469[local428] = ((Class6_Sub16) local849).aShort28;
								local885 = local469[local428] & 0xFFFF;
								if (local506 != -1 && local212[local428].aLong252 < local169[local885].aLong252) {
									local169[local885] = local212[local428];
								}
							}
							for (local912 = 0; local912 < local418; local912++) {
								local190[local912].method4016(local885, local563, local548, local767);
							}
							this.anInt7152++;
						}
					}
				}
			}
			for (local196 = 0; local196 < this.anInt7147; local196++) {
				@Pc(1290) Class6_Sub27 local1290 = local169[local196];
				if (local1290 != null) {
					local1290.method4013(local196);
				}
			}
			@Pc(1307) int local1307;
			@Pc(1325) int local1325;
			for (@Pc(1303) int local1303 = 0; super.anInt9881 > local1303; local1303++) {
				for (local1307 = 0; super.anInt9885 > local1307; local1307++) {
					@Pc(1319) short[] local1319 = this.aShortArrayArray9[super.anInt9881 * local1307 + local1303];
					if (local1319 != null) {
						@Pc(1323) int local1323 = 0;
						local1325 = 0;
						while (local1319.length > local1325) {
							@Pc(1334) int local1334 = local1319[local1325++] & 0xFFFF;
							@Pc(1341) int local1341 = local1319[local1325++] & 0xFFFF;
							@Pc(1348) int local1348 = local1319[local1325++] & 0xFFFF;
							@Pc(1352) Class6_Sub27 local1352 = local169[local1334];
							@Pc(1356) Class6_Sub27 local1356 = local169[local1341];
							@Pc(1360) Class6_Sub27 local1360 = local169[local1348];
							@Pc(1362) Class6_Sub27 local1362 = null;
							if (local1352 != null) {
								local1362 = local1352;
								local1352.method4010(local1307, local1323, local1303);
							}
							if (local1356 != null) {
								local1356.method4010(local1307, local1323, local1303);
								if (local1362 == null || local1356.aLong252 < local1362.aLong252) {
									local1362 = local1356;
								}
							}
							if (local1360 != null) {
								local1360.method4010(local1307, local1323, local1303);
								if (local1362 == null || local1362.aLong252 > local1360.aLong252) {
									local1362 = local1360;
								}
							}
							if (local1362 != null) {
								if (local1352 != null) {
									local1362.method4013(local1334);
								}
								if (local1356 != null) {
									local1362.method4013(local1341);
								}
								if (local1360 != null) {
									local1362.method4013(local1348);
								}
								local1362.method4010(local1307, local1323, local1303);
							}
							local1323++;
						}
					}
				}
			}
			local160.a();
			local165.a();
			this.anInterface20_11 = this.aClass9_Sub3_15.method5528(false);
			this.anInterface20_11.method6522(local145, 4, this.anInt7147 * 4);
			this.anInterface20_10 = this.aClass9_Sub3_15.method5528(false);
			this.anInterface20_10.method6522(local155, local125, local125 * this.anInt7147);
			if ((this.anInt7159 & 0x7) == 0) {
				if (this.anIntArrayArrayArray18 == null) {
					this.aClass88_19 = this.aClass9_Sub3_15.method5510(new Class7[] { new Class7(new Class13[] { Static11.aClass13_1, Static11.aClass13_5 }), new Class7(Static11.aClass13_3) });
				} else {
					this.aClass88_19 = this.aClass9_Sub3_15.method5510(new Class7[] { new Class7(new Class13[] { Static11.aClass13_1, Static11.aClass13_5, Static11.aClass13_4 }), new Class7(Static11.aClass13_3) });
				}
			} else if (this.anIntArrayArrayArray18 == null) {
				this.aClass88_19 = this.aClass9_Sub3_15.method5510(new Class7[] { new Class7(new Class13[] { Static11.aClass13_1, Static11.aClass13_5, Static11.aClass13_2 }), new Class7(Static11.aClass13_3) });
			} else {
				this.aClass88_19 = this.aClass9_Sub3_15.method5510(new Class7[] { new Class7(new Class13[] { Static11.aClass13_1, Static11.aClass13_5, Static11.aClass13_4, Static11.aClass13_2 }), new Class7(Static11.aClass13_3) });
			}
			local1307 = 0;
			for (@Pc(1665) int local1665 = 0; local1665 < local101.length; local1665++) {
				if (local101[local1665].anInt4671 > 0) {
					local101[local1307++] = local101[local1665];
				}
			}
			this.aClass6_Sub27Array1 = new Class6_Sub27[local1307];
			@Pc(1691) long[] local1691 = new long[local1307];
			for (local1325 = 0; local1325 < local1307; local1325++) {
				@Pc(1699) Class6_Sub27 local1699 = local101[local1325];
				local1691[local1325] = local1699.aLong252;
				this.aClass6_Sub27Array1[local1325] = local1699;
				local1699.method4018(this.anInt7147);
			}
			Static379.method5984(this.aClass6_Sub27Array1, local1691);
			if (this.aClass331_2 != null) {
				this.aClass331_2.method7805();
			}
		}
		this.aByteArrayArray24 = null;
		this.anIntArrayArrayArray20 = null;
		this.aClass305_30 = null;
		this.anIntArrayArrayArray17 = null;
		this.aClass6_Sub27ArrayArrayArray1 = null;
		this.anIntArrayArrayArray21 = null;
		this.aFloatArrayArray11 = this.aFloatArrayArray10 = this.aFloatArrayArray9 = null;
		this.anIntArrayArrayArray18 = null;
		this.anIntArrayArrayArray19 = this.anIntArrayArrayArray16 = null;
	}

	@OriginalMember(owner = "client!ow", name = "c", descriptor = "(IILclient!w;)Lclient!w;")
	@Override
	public Class6_Sub4_Sub2 c(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub4_Sub2 arg2) {
		if ((this.aByteArrayArray23[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(21) int local21 = super.anInt9884 >> this.aClass9_Sub3_15.anInt6529;
		@Pc(24) Class6_Sub4_Sub2_Sub2 local24 = (Class6_Sub4_Sub2_Sub2) arg2;
		@Pc(34) Class6_Sub4_Sub2_Sub2 local34;
		if (local24 != null && local24.method7651(local21, local21)) {
			local34 = local24;
			local24.method7648();
		} else {
			local34 = new Class6_Sub4_Sub2_Sub2(this.aClass9_Sub3_15, local21, local21);
		}
		local34.method7650(local21, 0, 0, local21);
		this.method6022(arg1, arg0, local34);
		return local34;
	}

	@OriginalMember(owner = "client!ow", name = "EA", descriptor = "(III)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray24[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray24[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!ow", name = "sa", descriptor = "(II)I")
	@Override
	public int sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 >> super.anInt9883;
		@Pc(13) int local13 = arg1 >> super.anInt9883;
		if (local8 < 0 || local13 < 0 || super.anInt9881 - 1 < local8 || super.anInt9885 - 1 < local13) {
			return 0;
		}
		@Pc(42) int local42 = super.anInt9884 - 1 & arg0;
		@Pc(49) int local49 = super.anInt9884 - 1 & arg1;
		@Pc(77) int local77 = (super.anInt9884 - local42) * this.anIntArrayArray48[local8][local13] + local42 * this.anIntArrayArray48[local8 + 1][local13] >> super.anInt9883;
		@Pc(108) int local108 = (super.anInt9884 - local42) * this.anIntArrayArray48[local8][local13 + 1] + local42 * this.anIntArrayArray48[local8 + 1][local13 + 1] >> super.anInt9883;
		return local77 * (super.anInt9884 - local49) + local49 * local108 >> super.anInt9883;
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(BIIII[[ZZ)V")
	private void method6021(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) boolean[][] arg3, @OriginalArg(6) boolean arg4) {
		if (this.aClass6_Sub27Array1 == null) {
			return;
		}
		@Pc(16) int local16 = arg2 + arg2 + 1;
		@Pc(20) int local20 = local16 * local16;
		if (Static553.anIntArray816.length < local20) {
			Static553.anIntArray816 = new int[local20];
		}
		@Pc(36) int local36 = arg0 - arg2;
		@Pc(38) int local38 = local36;
		if (local36 < 0) {
			local36 = 0;
		}
		@Pc(46) int local46 = arg1 - arg2;
		@Pc(48) int local48 = local46;
		if (local46 < 0) {
			local46 = 0;
		}
		@Pc(57) int local57 = arg0 + arg2;
		if (super.anInt9881 - 1 < local57) {
			local57 = super.anInt9881 - 1;
		}
		@Pc(72) int local72 = arg2 + arg1;
		if (local72 > super.anInt9885 - 1) {
			local72 = super.anInt9885 - 1;
		}
		Static430.anInt869 = 0;
		for (@Pc(91) int local91 = local36; local91 <= local57; local91++) {
			@Pc(100) boolean[] local100 = arg3[local91 - local38];
			for (@Pc(102) int local102 = local46; local102 <= local72; local102++) {
				if (local100[local102 - local48]) {
					Static553.anIntArray816[Static430.anInt869++] = local91 + local102 * super.anInt9881;
				}
			}
		}
		this.aClass9_Sub3_15.method5495();
		this.aClass9_Sub3_15.method5522();
		this.aClass9_Sub3_15.method5502((this.anInt7159 & 0x7) != 0);
		this.aClass9_Sub3_15.method5559(-1, false, false);
		this.aClass9_Sub3_15.method5513(0, this.anInterface20_10);
		for (@Pc(187) int local187 = 0; local187 < this.aClass6_Sub27Array1.length; local187++) {
			this.aClass6_Sub27Array1[local187].method4014(Static430.anInt869, Static553.anIntArray816);
		}
		@Pc(212) Class8_Sub3 local212 = this.aClass9_Sub3_15.method5590();
		local212.GA(0, -1, 0);
		this.aClass9_Sub3_15.method5487();
		if (!this.aClass211_60.method5170()) {
			@Pc(230) int local230 = this.aClass9_Sub3_15.anInt6537;
			@Pc(234) int local234 = this.aClass9_Sub3_15.anInt6531;
			this.aClass9_Sub3_15.X(0, local234, this.aClass9_Sub3_15.anInt6556);
			this.aClass9_Sub3_15.method5502(false);
			this.aClass9_Sub3_15.method5526(false);
			this.aClass9_Sub3_15.method5587(128);
			this.aClass9_Sub3_15.method5559(-2, false, false);
			this.aClass9_Sub3_15.method5494(this.aClass9_Sub3_15.anInterface10_3);
			this.aClass9_Sub3_15.method5598(Static410.aClass238_3, Static477.aClass238_4);
			this.aClass9_Sub3_15.method5596(Static140.aClass50_2, 0);
			this.aClass9_Sub3_15.method5543(Static237.aClass50_3, 0);
			for (@Pc(294) Class6 local294 = this.aClass211_60.method5183(); local294 != null; local294 = this.aClass211_60.method5177()) {
				@Pc(299) Class6_Sub23 local299 = (Class6_Sub23) local294;
				local299.method3515(arg0, arg1, arg2, arg3);
			}
			this.aClass9_Sub3_15.method5596(Static503.aClass50_4, 0);
			this.aClass9_Sub3_15.method5543(Static503.aClass50_4, 0);
			this.aClass9_Sub3_15.method5494(null);
			this.aClass9_Sub3_15.X(local230, local234, this.aClass9_Sub3_15.anInt6556);
		}
		if (this.aClass331_2 != null) {
			this.aClass9_Sub3_15.method5513(0, this.anInterface20_10);
			this.aClass9_Sub3_15.method5513(1, this.anInterface20_11);
			this.aClass9_Sub3_15.method5535(this.aClass88_19);
			this.aClass331_2.method7800(arg0, arg3, arg2, arg4, arg1);
		}
	}

	@OriginalMember(owner = "client!ow", name = "FA", descriptor = "(Lclient!w;IIIIZ)V")
	@Override
	public void FA(@OriginalArg(0) Class6_Sub4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass331_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass9_Sub3_15.anInt6564 * arg2 >> 8) >> this.aClass9_Sub3_15.anInt6529;
			@Pc(39) int local39 = arg3 - (this.aClass9_Sub3_15.anInt6558 * arg2 >> 8) >> this.aClass9_Sub3_15.anInt6529;
			this.aClass331_2.method7801(local24, arg0, local39);
		}
	}

	@OriginalMember(owner = "client!ow", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg3 != null && this.anIntArrayArrayArray21 == null) {
			this.anIntArrayArrayArray21 = new int[super.anInt9881][super.anInt9885][];
		}
		if (arg5 != null && this.anIntArrayArrayArray18 == null) {
			this.anIntArrayArrayArray18 = new int[super.anInt9881][super.anInt9885][];
		}
		this.anIntArrayArrayArray19[arg0][arg1] = arg2;
		this.anIntArrayArrayArray16[arg0][arg1] = arg4;
		this.anIntArrayArrayArray17[arg0][arg1] = arg6;
		this.anIntArrayArrayArray20[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray18 != null) {
			this.anIntArrayArrayArray18[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray21 != null) {
			this.anIntArrayArrayArray21[arg0][arg1] = arg3;
		}
		@Pc(88) Class6_Sub27[] local88 = this.aClass6_Sub27ArrayArrayArray1[arg0][arg1] = new Class6_Sub27[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) arg8[local90] | (long) (arg9[local90] << 14) | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28;
			@Pc(125) Class6 local125;
			for (local125 = this.aClass305_30.method7447(local119); local125 != null; local125 = this.aClass305_30.method7446()) {
				@Pc(130) Class6_Sub27 local130 = (Class6_Sub27) local125;
				if (arg8[local90] == local130.anInt4675 && (float) arg9[local90] == local130.aFloat103 && arg10 == local130.anInt4666 && arg11 == local130.anInt4664 && arg12 == local130.anInt4663) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class6_Sub27(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass305_30.method7448(local119, local88[local90]);
			} else {
				local88[local90] = (Class6_Sub27) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray23[arg0][arg1] = (byte) (this.aByteArrayArray23[arg0][arg1] | 0x1);
		}
		if (this.anInt7169 < arg6.length) {
			this.anInt7169 = arg6.length;
		}
		this.lb += arg6.length;
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method8208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method6021(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ow", name = "JA", descriptor = "(II)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray48[arg0][arg1];
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(IIILclient!ur;)V")
	private void method6022(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6_Sub4_Sub2_Sub2 arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray19[arg1][arg0];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray16[arg1][arg0];
		@Pc(26) int local26 = local12.length;
		if (local26 > Static358.anIntArray487.length) {
			Static358.anIntArray487 = new int[local26];
			Static329.anIntArray457 = new int[local26];
		}
		for (@Pc(38) int local38 = 0; local38 < local26; local38++) {
			Static358.anIntArray487[local38] = local12[local38] >> this.aClass9_Sub3_15.anInt6529;
			Static329.anIntArray457[local38] = local19[local38] >> this.aClass9_Sub3_15.anInt6529;
		}
		@Pc(66) int local66 = 0;
		while (local66 < local26) {
			@Pc(72) int local72 = Static358.anIntArray487[local66];
			@Pc(77) int local77 = Static329.anIntArray457[local66++];
			@Pc(81) int local81 = Static358.anIntArray487[local66];
			@Pc(86) int local86 = Static329.anIntArray457[local66++];
			@Pc(90) int local90 = Static358.anIntArray487[local66];
			@Pc(95) int local95 = Static329.anIntArray457[local66++];
			if (-((local90 - local81) * (-local77 + local86)) + (local86 - local95) * (local72 - local81) > 0) {
				arg2.method7647(local90, local72, local95, local81, local86, local77);
			}
		}
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(II)V")
	@Override
	public void method8204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method8201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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
		this.BA(arg0, arg1, local13, local47, local18, local56, local23, local28, local33, local38, arg13, arg14, arg15, false);
	}

	@OriginalMember(owner = "client!ow", name = "aa", descriptor = "(Lclient!w;IIIIZ)V")
	@Override
	public void aa(@OriginalArg(0) Class6_Sub4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass331_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass9_Sub3_15.anInt6564 * arg2 >> 8) >> this.aClass9_Sub3_15.anInt6529;
			@Pc(39) int local39 = arg3 - (this.aClass9_Sub3_15.anInt6558 * arg2 >> 8) >> this.aClass9_Sub3_15.anInt6529;
			this.aClass331_2.method7804(arg0, local39, local24);
		}
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(Lclient!od;[I)V")
	@Override
	public void method8203(@OriginalArg(0) Class6_Sub29 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass211_60.method5173(new Class6_Sub23(this.aClass9_Sub3_15, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method8205(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.lb <= 0) {
			return;
		}
		@Pc(19) Interface21 local19 = this.aClass9_Sub3_15.method5497(this.anInt7152);
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = 32767;
		@Pc(25) int local25 = -32768;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			local21 = 0;
			@Pc(36) Buffer local36 = local19.method6521();
			if (local36 != null) {
				@Pc(44) Stream local44 = this.aClass9_Sub3_15.method5524(local36);
				@Pc(48) int local48;
				@Pc(57) int local57;
				@Pc(59) int local59;
				@Pc(78) short[] local78;
				@Pc(82) int local82;
				@Pc(90) int local90;
				if (Stream.c()) {
					for (local48 = arg1; local48 < arg3; local48++) {
						local57 = arg0 + super.anInt9881 * local48;
						for (local59 = arg0; local59 < arg2; local59++) {
							if (arg4[local59 - arg0][local48 - arg1]) {
								local78 = this.aShortArrayArray9[local57];
								if (local78 != null) {
									for (local82 = 0; local82 < local78.length; local82++) {
										local90 = local78[local82] & 0xFFFF;
										local21++;
										if (local90 < local23) {
											local23 = local90;
										}
										if (local25 < local90) {
											local25 = local90;
										}
										local44.c(local90);
									}
								}
							}
							local57++;
						}
					}
				} else {
					for (local48 = arg1; local48 < arg3; local48++) {
						local57 = local48 * super.anInt9881 + arg0;
						for (local59 = arg0; local59 < arg2; local59++) {
							if (arg4[local59 - arg0][local48 - arg1]) {
								local78 = this.aShortArrayArray9[local57];
								if (local78 != null) {
									for (local82 = 0; local82 < local78.length; local82++) {
										local90 = local78[local82] & 0xFFFF;
										if (local90 < local23) {
											local23 = local90;
										}
										if (local25 < local90) {
											local25 = local90;
										}
										local21++;
										local44.d(local90);
									}
								}
							}
							local57++;
						}
					}
				}
				local44.a();
				if (local19.method6524()) {
					break;
				}
			}
		}
		if (local21 <= 0) {
			return;
		}
		this.aClass9_Sub3_15.method5577();
		this.aClass9_Sub3_15.method5594(false);
		this.aClass9_Sub3_15.method5502(false);
		this.aClass9_Sub3_15.method5547(false);
		this.aClass9_Sub3_15.method5526(false);
		this.aClass9_Sub3_15.method5587(0);
		this.aClass9_Sub3_15.method5559(-2, false, false);
		this.aClass9_Sub3_15.method5494(null);
		@Pc(282) Class8_Sub3 local282 = this.aClass9_Sub3_15.method5590();
		@Pc(287) float[] local287 = this.aClass9_Sub3_15.method5580();
		local287[0] = (float) 1024 / ((float) super.anInt9884 * 128.0F * (float) this.aClass9_Sub3_15.anInt6442);
		local287[15] = 1.0F;
		local287[10] = 1.0F / (this.aFloat156 - this.aFloat155);
		local287[3] = 0.0F;
		local287[11] = 0.0F;
		local287[6] = 0.0F;
		local287[4] = 0.0F;
		local287[9] = 0.0F;
		local287[5] = (float) 1024 / ((float) super.anInt9884 * 128.0F * (float) this.aClass9_Sub3_15.anInt6381);
		local287[7] = 0.0F;
		local287[12] = -(((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass9_Sub3_15.anInt6442) - 1.0F;
		local287[8] = 0.0F;
		local287[2] = 0.0F;
		local287[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass9_Sub3_15.anInt6381;
		local287[1] = 0.0F;
		local287[14] = -this.aFloat155 / (this.aFloat156 - this.aFloat155);
		local282.method8181(0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
		this.aClass9_Sub3_15.method5499();
		this.aClass9_Sub3_15.method5487();
		if ((this.anInt7159 & 0x7) == 0) {
			this.aClass9_Sub3_15.method5502(false);
		} else {
			this.aClass9_Sub3_15.method5502(true);
			this.aClass9_Sub3_15.method5566();
		}
		this.aClass9_Sub3_15.method5538(false);
		this.aClass9_Sub3_15.method5513(0, this.anInterface20_10);
		this.aClass9_Sub3_15.method5513(1, this.anInterface20_11);
		this.aClass9_Sub3_15.method5535(this.aClass88_19);
		this.aClass9_Sub3_15.method5539(0, local23, Static492.aClass328_6, local19, local21 / 3, local25 + 1 - local23);
		this.aClass9_Sub3_15.method5538(true);
	}
}
