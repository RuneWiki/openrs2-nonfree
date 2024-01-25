import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ct")
public final class Class21_Sub2 extends Class21 {

	@OriginalMember(owner = "client!ct", name = "u", descriptor = "I")
	private int anInt1697;

	@OriginalMember(owner = "client!ct", name = "H", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!ct", name = "U", descriptor = "I")
	private int anInt1713;

	@OriginalMember(owner = "client!ct", name = "ab", descriptor = "Lclient!fha;")
	private Interface9 anInterface9_1;

	@OriginalMember(owner = "client!ct", name = "bb", descriptor = "Lclient!we;")
	public Class381 aClass381_1;

	@OriginalMember(owner = "client!ct", name = "cb", descriptor = "I")
	private int anInt1718;

	@OriginalMember(owner = "client!ct", name = "db", descriptor = "Lclient!we;")
	private Class381 aClass381_2;

	@OriginalMember(owner = "client!ct", name = "gb", descriptor = "Lclient!we;")
	public Class381 aClass381_3;

	@OriginalMember(owner = "client!ct", name = "hb", descriptor = "Lclient!we;")
	public Class381 aClass381_4;

	@OriginalMember(owner = "client!ct", name = "kb", descriptor = "[Lclient!pd;")
	private Class3_Sub45[] aClass3_Sub45Array1;

	@OriginalMember(owner = "client!ct", name = "lb", descriptor = "I")
	private int lb;

	@OriginalMember(owner = "client!ct", name = "E", descriptor = "Lclient!tm;")
	private final Class338 aClass338_42 = new Class338();

	@OriginalMember(owner = "client!ct", name = "B", descriptor = "I")
	private final int anInt1702 = this.anInt9125 - 2;

	@OriginalMember(owner = "client!ct", name = "W", descriptor = "Lclient!dia;")
	public final Class13_Sub2 aClass13_Sub2_6;

	@OriginalMember(owner = "client!ct", name = "eb", descriptor = "[[F")
	private float[][] aFloatArrayArray1;

	@OriginalMember(owner = "client!ct", name = "q", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!ct", name = "F", descriptor = "I")
	private final int anInt1703;

	@OriginalMember(owner = "client!ct", name = "fb", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!ct", name = "p", descriptor = "[[[Lclient!pd;")
	private Class3_Sub45[][][] aClass3_Sub45ArrayArrayArray1;

	@OriginalMember(owner = "client!ct", name = "w", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!ct", name = "O", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!ct", name = "mb", descriptor = "[[B")
	private byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!ct", name = "C", descriptor = "[[B")
	private final byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!ct", name = "ib", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!ct", name = "R", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!ct", name = "m", descriptor = "[[S")
	public final short[][] aShortArrayArray3;

	@OriginalMember(owner = "client!ct", name = "D", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!ct", name = "Y", descriptor = "I")
	public final int anInt1716;

	@OriginalMember(owner = "client!ct", name = "jb", descriptor = "Lclient!ee;")
	private Class83 aClass83_5;

	@OriginalMember(owner = "client!ct", name = "M", descriptor = "Lclient!qga;")
	private Class284 aClass284_1;

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lclient!dia;IIII[[I[[II)V")
	public Class21_Sub2(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass13_Sub2_6 = arg0;
		this.aFloatArrayArray1 = new float[super.anInt9129 + 1][super.anInt9128 + 1];
		this.anIntArrayArrayArray1 = new int[arg3][arg4][];
		this.anInt1703 = 0x1 << this.anInt1702;
		this.aFloatArrayArray2 = new float[super.anInt9129 + 1][super.anInt9128 + 1];
		this.aClass3_Sub45ArrayArrayArray1 = new Class3_Sub45[arg3][arg4][];
		this.anIntArrayArrayArray2 = new int[arg3][arg4][];
		this.anIntArrayArrayArray5 = new int[arg3][arg4][];
		this.aByteArrayArray8 = new byte[arg3 + 1][arg4 + 1];
		this.aByteArrayArray7 = new byte[arg3][arg4];
		this.aFloatArrayArray3 = new float[super.anInt9129 + 1][super.anInt9128 + 1];
		this.anIntArrayArrayArray6 = new int[arg3][arg4][];
		this.aShortArrayArray3 = new short[arg3 * arg4][];
		this.anIntArrayArrayArray3 = new int[arg3][arg4][];
		this.anInt1716 = arg2;
		for (@Pc(115) int local115 = 1; local115 < super.anInt9128; local115++) {
			for (@Pc(119) int local119 = 1; local119 < super.anInt9129; local119++) {
				@Pc(138) int local138 = arg6[local119 + 1][local115] - arg6[local119 - 1][local115];
				@Pc(155) int local155 = arg6[local119][local115 + 1] - arg6[local119][local115 - 1];
				@Pc(175) float local175 = (float) (1.0D / Math.sqrt((double) (local155 * local155 + local138 * local138 + arg7 * 4 * arg7)));
				this.aFloatArrayArray2[local119][local115] = local175 * (float) local138;
				this.aFloatArrayArray1[local119][local115] = local175 * (float) (-arg7 * 2);
				this.aFloatArrayArray3[local119][local115] = (float) local155 * local175;
			}
		}
		this.aClass83_5 = new Class83(128);
		if ((this.anInt1716 & 0x10) != 0) {
			this.aClass284_1 = new Class284(this.aClass13_Sub2_6, this);
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IILclient!qa;I)V")
	private void method1651(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub11_Sub3_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(20) int[] local20 = this.anIntArrayArrayArray2[arg0][arg2];
		@Pc(27) int[] local27 = this.anIntArrayArrayArray1[arg0][arg2];
		@Pc(30) int local30 = local20.length;
		if (this.aClass13_Sub2_6.anIntArray163.length < local30) {
			this.aClass13_Sub2_6.anIntArray165 = new int[local30];
			this.aClass13_Sub2_6.anIntArray163 = new int[local30];
		}
		@Pc(54) int[] local54 = this.aClass13_Sub2_6.anIntArray163;
		@Pc(58) int[] local58 = this.aClass13_Sub2_6.anIntArray165;
		for (@Pc(60) int local60 = 0; local60 < local30; local60++) {
			local54[local60] = local20[local60] >> this.aClass13_Sub2_6.anInt2154;
			local58[local60] = local27[local60] >> this.aClass13_Sub2_6.anInt2154;
		}
		@Pc(88) int local88 = 0;
		while (local30 > local88) {
			@Pc(94) int local94 = local54[local88];
			@Pc(99) int local99 = local58[local88++];
			@Pc(103) int local103 = local54[local88];
			@Pc(108) int local108 = local58[local88++];
			@Pc(112) int local112 = local54[local88];
			@Pc(117) int local117 = local58[local88++];
			if (-((local108 - local99) * (local112 - local103)) + (local108 - local117) * (local94 - local103) > 0) {
				arg1.method6862(local108, local103, local112, local117, local94, local99);
			}
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method7978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method1652(arg3, arg6, arg4, arg1, arg2, arg0, arg5);
	}

	@OriginalMember(owner = "client!ct", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class3_Sub11_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass284_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass13_Sub2_6.anInt2165 >> 8) >> this.aClass13_Sub2_6.anInt2154;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass13_Sub2_6.anInt2177 >> 8) >> this.aClass13_Sub2_6.anInt2154;
			this.aClass284_1.method7046(arg0, local39, local24);
		}
	}

	@OriginalMember(owner = "client!ct", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.lb <= 0) {
			this.aClass284_1 = null;
		} else {
			@Pc(22) byte[][] local22 = new byte[super.anInt9129 + 1][super.anInt9128 + 1];
			@Pc(28) int local28;
			for (@Pc(24) int local24 = 1; super.anInt9129 > local24; local24++) {
				for (local28 = 1; super.anInt9128 > local28; local28++) {
					local22[local24][local28] = (byte) ((this.aByteArrayArray8[local24][local28] >> 1) + (this.aByteArrayArray8[local24][local28 - 1] >> 2) + (this.aByteArrayArray8[local24 + -1][local28] >> 2) + (this.aByteArrayArray8[local24 + 1][local28] >> 3) + (this.aByteArrayArray8[local24][local28 + 1] >> 3));
				}
			}
			this.aClass3_Sub45Array1 = new Class3_Sub45[this.aClass83_5.method2378()];
			this.aClass83_5.method2367(this.aClass3_Sub45Array1);
			for (local28 = 0; local28 < this.aClass3_Sub45Array1.length; local28++) {
				this.aClass3_Sub45Array1[local28].method6595(this.lb);
			}
			@Pc(140) int local140 = 24;
			if (this.anIntArrayArrayArray4 != null) {
				local140 += 4;
			}
			if ((this.anInt1716 & 0x7) != 0) {
				local140 += 12;
			}
			@Pc(160) NativeHeapBuffer local160 = this.aClass13_Sub2_6.aNativeHeap3.a(local140 * this.lb, false);
			@Pc(165) Stream local165 = new Stream(local160);
			@Pc(169) Class3_Sub45[] local169 = new Class3_Sub45[this.lb];
			@Pc(176) int local176 = Static677.method9371(this.lb / 4);
			if (local176 < 1) {
				local176 = 1;
			}
			@Pc(186) Class83 local186 = new Class83(local176);
			@Pc(190) Class3_Sub45[] local190 = new Class3_Sub45[this.anInt1718];
			@Pc(196) int local196;
			for (@Pc(192) int local192 = 0; local192 < super.anInt9129; local192++) {
				for (local196 = 0; local196 < super.anInt9128; local196++) {
					if (this.anIntArrayArrayArray5[local192][local196] != null) {
						@Pc(212) Class3_Sub45[] local212 = this.aClass3_Sub45ArrayArrayArray1[local192][local196];
						@Pc(219) int[] local219 = this.anIntArrayArrayArray2[local192][local196];
						@Pc(226) int[] local226 = this.anIntArrayArrayArray1[local192][local196];
						@Pc(233) int[] local233 = this.anIntArrayArrayArray3[local192][local196];
						@Pc(240) int[] local240 = this.anIntArrayArrayArray5[local192][local196];
						@Pc(252) int[] local252 = this.anIntArrayArrayArray6 == null ? null : this.anIntArrayArrayArray6[local192][local196];
						@Pc(264) int[] local264 = this.anIntArrayArrayArray4 == null ? null : this.anIntArrayArrayArray4[local192][local196];
						if (local233 == null) {
							local233 = local240;
						}
						@Pc(275) float local275 = this.aFloatArrayArray2[local192][local196];
						@Pc(282) float local282 = this.aFloatArrayArray1[local192][local196];
						@Pc(289) float local289 = this.aFloatArrayArray3[local192][local196];
						@Pc(298) float local298 = this.aFloatArrayArray2[local192][local196 + 1];
						@Pc(307) float local307 = this.aFloatArrayArray1[local192][local196 + 1];
						@Pc(316) float local316 = this.aFloatArrayArray3[local192][local196 + 1];
						@Pc(327) float local327 = this.aFloatArrayArray2[local192 + 1][local196 + 1];
						@Pc(338) float local338 = this.aFloatArrayArray1[local192 + 1][local196 + 1];
						@Pc(349) float local349 = this.aFloatArrayArray3[local192 + 1][local196 + 1];
						@Pc(358) float local358 = this.aFloatArrayArray2[local192 + 1][local196];
						@Pc(367) float local367 = this.aFloatArrayArray1[local192 + 1][local196];
						@Pc(376) float local376 = this.aFloatArrayArray3[local192 + 1][local196];
						@Pc(384) int local384 = local22[local192][local196] & 0xFF;
						@Pc(394) int local394 = local22[local192][local196 + 1] & 0xFF;
						@Pc(406) int local406 = local22[local192 + 1][local196 + 1] & 0xFF;
						@Pc(416) int local416 = local22[local192 + 1][local196] & 0xFF;
						@Pc(418) int local418 = 0;
						@Pc(428) int local428;
						label335: for (@Pc(420) int local420 = 0; local420 < local240.length; local420++) {
							@Pc(426) Class3_Sub45 local426 = local212[local420];
							for (local428 = 0; local428 < local418; local428++) {
								if (local190[local428] == local426) {
									continue label335;
								}
							}
							local190[local418++] = local426;
						}
						@Pc(469) short[] local469 = this.aShortArrayArray3[local192 + super.anInt9129 * local196] = new short[local240.length];
						for (local428 = 0; local428 < local240.length; local428++) {
							@Pc(482) int local482 = (local192 << super.anInt9125) + local219[local428];
							@Pc(491) int local491 = (local196 << super.anInt9125) + local226[local428];
							@Pc(496) int local496 = local482 >> this.anInt1702;
							@Pc(501) int local501 = local491 >> this.anInt1702;
							@Pc(505) int local505 = local240[local428];
							@Pc(509) int local509 = local233[local428];
							@Pc(517) int local517 = local252 == null ? 0 : local252[local428];
							@Pc(535) long local535 = (long) local505 << 32 | (long) local509 << 48 | (long) (local496 << 16) | (long) local501;
							@Pc(539) int local539 = local219[local428];
							@Pc(543) int local543 = local226[local428];
							@Pc(545) byte local545 = 74;
							@Pc(547) int local547 = 0;
							@Pc(549) float local549 = 1.0F;
							@Pc(560) float local560;
							@Pc(558) float local558;
							@Pc(566) float local566;
							@Pc(649) float local649;
							@Pc(564) int local564;
							if (local539 == 0 && local543 == 0) {
								local558 = local282;
								local560 = local275;
								local564 = local545 - local384;
								local566 = local289;
							} else if (local539 == 0 && super.anInt9123 == local543) {
								local558 = local307;
								local564 = local545 - local394;
								local560 = local298;
								local566 = local316;
							} else if (local539 == super.anInt9123 && super.anInt9123 == local543) {
								local560 = local327;
								local558 = local338;
								local564 = local545 - local406;
								local566 = local349;
							} else if (super.anInt9123 == local539 && local543 == 0) {
								local560 = local358;
								local558 = local367;
								local564 = local545 - local416;
								local566 = local376;
							} else {
								@Pc(626) float local626 = (float) local539 / (float) super.anInt9123;
								@Pc(633) float local633 = (float) local543 / (float) super.anInt9123;
								@Pc(641) float local641 = local626 * (local358 - local275) + local275;
								local649 = (local367 - local282) * local626 + local282;
								@Pc(658) float local658 = local289 + local626 * (local376 - local289);
								@Pc(666) float local666 = local298 + (local327 - local298) * local626;
								@Pc(675) float local675 = local307 + local626 * (local338 - local307);
								local560 = local641 + local633 * (local666 - local641);
								@Pc(693) float local693 = (local349 - local316) * local626 + local316;
								local558 = (local675 - local649) * local633 + local649;
								local566 = (local693 - local658) * local633 + local658;
								@Pc(723) int local723 = local384 + (local539 * (local416 - local384) >> super.anInt9125);
								@Pc(735) int local735 = local394 + ((local406 - local394) * local539 >> super.anInt9125);
								local564 = local545 - local723 - (local543 * (local735 - local723) >> super.anInt9125);
							}
							if (local505 != -1) {
								@Pc(772) int local772 = local564 * (local505 & 0x7F) >> 7;
								if (local772 < 2) {
									local772 = 2;
								} else if (local772 > 126) {
									local772 = 126;
								}
								local547 = Static363.anIntArray518[local772 | local505 & 0xFF80];
								if ((this.anInt1716 & 0x7) == 0) {
									local549 = local560 * this.aClass13_Sub2_6.aFloatArray17[0] + this.aClass13_Sub2_6.aFloatArray17[1] * local558 + this.aClass13_Sub2_6.aFloatArray17[2] * local566;
									local549 = local549 * (local549 > 0.0F ? this.aClass13_Sub2_6.aFloat60 : this.aClass13_Sub2_6.aFloat49) + this.aClass13_Sub2_6.aFloat61;
								}
							}
							@Pc(843) Class3 local843 = null;
							if ((local482 & this.anInt1703 - 1) == 0 && (this.anInt1703 - 1 & local491) == 0) {
								local843 = local186.method2368(local535);
							}
							@Pc(882) int local882;
							@Pc(943) int local943;
							if (local843 == null) {
								if (local509 == local505) {
									local943 = local547;
								} else {
									@Pc(923) int local923 = (local509 & 0x7F) * local564 >> 7;
									if (local923 < 2) {
										local923 = 2;
									} else if (local923 > 126) {
										local923 = 126;
									}
									local943 = Static363.anIntArray518[local509 & 0xFF80 | local923];
									if ((this.anInt1716 & 0x7) == 0) {
										local649 = local566 * this.aClass13_Sub2_6.aFloatArray17[2] + local560 * this.aClass13_Sub2_6.aFloatArray17[0] + this.aClass13_Sub2_6.aFloatArray17[1] * local558;
										local649 = this.aClass13_Sub2_6.aFloat61 + (local549 > 0.0F ? this.aClass13_Sub2_6.aFloat60 : this.aClass13_Sub2_6.aFloat49) * local549;
										@Pc(999) int local999 = local943 >> 16 & 0xFF;
										@Pc(1005) int local1005 = local943 >> 8 & 0xFF;
										@Pc(1009) int local1009 = local943 & 0xFF;
										local999 = (int) ((float) local999 * local649);
										if (local999 < 0) {
											local999 = 0;
										} else if (local999 > 255) {
											local999 = 255;
										}
										local1005 = (int) ((float) local1005 * local649);
										local1009 = (int) ((float) local1009 * local649);
										if (local1005 < 0) {
											local1005 = 0;
										} else if (local1005 > 255) {
											local1005 = 255;
										}
										if (local1009 < 0) {
											local1009 = 0;
										} else if (local1009 > 255) {
											local1009 = 255;
										}
										local943 = local999 << 16 | local1005 << 8 | local1009;
									}
								}
								if (this.aClass13_Sub2_6.aBoolean166) {
									local165.b((float) local482);
									local165.b((float) (local517 + this.method7980(local491, local482)));
									local165.b((float) local491);
									local165.a((byte) (local943 >> 16));
									local165.a((byte) (local943 >> 8));
									local165.a((byte) local943);
									local165.a(-1);
									local165.b((float) local482);
									local165.b((float) local491);
									if (this.anIntArrayArrayArray4 != null) {
										local165.b((float) (local264 == null ? 0 : local264[local428] - 1));
									}
									if ((this.anInt1716 & 0x7) != 0) {
										local165.b(local560);
										local165.b(local558);
										local165.b(local566);
									}
								} else {
									local165.a((float) local482);
									local165.a((float) (this.method7980(local491, local482) + local517));
									local165.a((float) local491);
									local165.a((byte) (local943 >> 16));
									local165.a((byte) (local943 >> 8));
									local165.a((byte) local943);
									local165.a(-1);
									local165.a((float) local482);
									local165.a((float) local491);
									if (this.anIntArrayArrayArray4 != null) {
										local165.a((float) (local264 == null ? 0 : local264[local428] - 1));
									}
									if ((this.anInt1716 & 0x7) != 0) {
										local165.a(local560);
										local165.a(local558);
										local165.a(local566);
									}
								}
								local882 = this.anInt1713++;
								local469[local428] = (short) local882;
								if (local505 != -1) {
									local169[local882] = local212[local428];
								}
								local186.method2377(local535, new Class3_Sub53(local469[local428]));
							} else {
								local469[local428] = ((Class3_Sub53) local843).aShort112;
								local882 = local469[local428] & 0xFFFF;
								if (local505 != -1 && local212[local428].aLong311 < local169[local882].aLong311) {
									local169[local882] = local212[local428];
								}
							}
							for (local943 = 0; local943 < local418; local943++) {
								local190[local943].method6594(local564, local882, local547, local549);
							}
							this.anInt1697++;
						}
					}
				}
			}
			for (local196 = 0; local196 < this.anInt1713; local196++) {
				@Pc(1333) Class3_Sub45 local1333 = local169[local196];
				if (local1333 != null) {
					local1333.method6592(local196);
				}
			}
			@Pc(1366) int local1366;
			for (@Pc(1346) int local1346 = 0; local1346 < super.anInt9129; local1346++) {
				for (@Pc(1350) int local1350 = 0; super.anInt9128 > local1350; local1350++) {
					@Pc(1362) short[] local1362 = this.aShortArrayArray3[local1346 + super.anInt9129 * local1350];
					if (local1362 != null) {
						local1366 = 0;
						@Pc(1368) int local1368 = 0;
						while (local1362.length > local1368) {
							@Pc(1377) int local1377 = local1362[local1368++] & 0xFFFF;
							@Pc(1384) int local1384 = local1362[local1368++] & 0xFFFF;
							@Pc(1391) int local1391 = local1362[local1368++] & 0xFFFF;
							@Pc(1395) Class3_Sub45 local1395 = local169[local1377];
							@Pc(1399) Class3_Sub45 local1399 = local169[local1384];
							@Pc(1403) Class3_Sub45 local1403 = local169[local1391];
							@Pc(1405) Class3_Sub45 local1405 = null;
							if (local1395 != null) {
								local1405 = local1395;
								local1395.method6591(local1366, local1346, local1350);
							}
							if (local1399 != null) {
								local1399.method6591(local1366, local1346, local1350);
								if (local1405 == null || local1405.aLong311 > local1399.aLong311) {
									local1405 = local1399;
								}
							}
							if (local1403 != null) {
								local1403.method6591(local1366, local1346, local1350);
								if (local1405 == null || local1403.aLong311 < local1405.aLong311) {
									local1405 = local1403;
								}
							}
							if (local1405 != null) {
								if (local1395 != null) {
									local1405.method6592(local1377);
								}
								if (local1399 != null) {
									local1405.method6592(local1384);
								}
								if (local1403 != null) {
									local1405.method6592(local1391);
								}
								local1405.method6591(local1366, local1346, local1350);
							}
							local1366++;
						}
					}
				}
			}
			local165.a();
			this.anInterface9_1 = this.aClass13_Sub2_6.method2027(local160, local165.b(), local140);
			this.aClass381_3 = new Class381(this.anInterface9_1, 5126, 3, 0);
			this.aClass381_2 = new Class381(this.anInterface9_1, 5121, 4, 12);
			@Pc(1544) byte local1544;
			if (this.anIntArrayArrayArray4 == null) {
				this.aClass381_4 = new Class381(this.anInterface9_1, 5126, 2, 16);
				local1544 = 24;
			} else {
				this.aClass381_4 = new Class381(this.anInterface9_1, 5126, 3, 16);
				local1544 = 28;
			}
			if ((this.anInt1716 & 0x7) != 0) {
				this.aClass381_1 = new Class381(this.anInterface9_1, 5126, 3, local1544);
			}
			@Pc(1578) long[] local1578 = new long[this.aClass3_Sub45Array1.length];
			for (local1366 = 0; local1366 < this.aClass3_Sub45Array1.length; local1366++) {
				@Pc(1587) Class3_Sub45 local1587 = this.aClass3_Sub45Array1[local1366];
				local1578[local1366] = local1587.aLong311;
				local1587.method6596(this.anInt1713);
			}
			Static476.method6889(this.aClass3_Sub45Array1, local1578);
			if (this.aClass284_1 != null) {
				this.aClass284_1.method7047();
			}
		}
		this.anIntArrayArrayArray4 = null;
		this.anIntArrayArrayArray3 = null;
		this.aClass3_Sub45ArrayArrayArray1 = null;
		this.aByteArrayArray8 = null;
		this.aFloatArrayArray2 = this.aFloatArrayArray1 = this.aFloatArrayArray3 = null;
		this.anIntArrayArrayArray5 = null;
		this.aClass83_5 = null;
		this.anIntArrayArrayArray6 = null;
		this.anIntArrayArrayArray2 = this.anIntArrayArrayArray1 = null;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(II)V")
	@Override
	public void method7979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lclient!uca;[I)V")
	@Override
	public void method7975(@OriginalArg(0) Class3_Sub15 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass338_42.method8171(new Class3_Sub54(this.aClass13_Sub2_6, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method7981(@OriginalArg(0) Class3_Sub11_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass284_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (this.aClass13_Sub2_6.anInt2165 * arg2 >> 8) >> this.aClass13_Sub2_6.anInt2154;
			@Pc(40) int local40 = arg3 - (this.aClass13_Sub2_6.anInt2177 * arg2 >> 8) >> this.aClass13_Sub2_6.anInt2154;
			return this.aClass284_1.method7042(arg0, local25, local40);
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "([[ZIZIIIII)V")
	private void method1652(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (this.aClass3_Sub45Array1 == null) {
			return;
		}
		@Pc(16) int local16 = arg4 + arg4 + 1;
		@Pc(20) int local20 = local16 * local16;
		if (local20 > this.aClass13_Sub2_6.anIntArray164.length) {
			this.aClass13_Sub2_6.anIntArray164 = new int[local20];
		}
		if (this.aClass13_Sub2_6.aClass3_Sub25_Sub2_1.aByteArray106.length < this.anInt1697 * 2) {
			this.aClass13_Sub2_6.aClass3_Sub25_Sub2_1 = new Class3_Sub25_Sub2(this.anInt1697 * 2);
		}
		@Pc(60) int local60 = arg5 - arg4;
		@Pc(62) int local62 = local60;
		if (local60 < 0) {
			local60 = 0;
		}
		@Pc(71) int local71 = arg3 - arg4;
		@Pc(73) int local73 = local71;
		if (local71 < 0) {
			local71 = 0;
		}
		@Pc(81) int local81 = arg4 + arg5;
		if (local81 > super.anInt9129 - 1) {
			local81 = super.anInt9129 - 1;
		}
		@Pc(96) int local96 = arg3 + arg4;
		if (super.anInt9128 - 1 < local96) {
			local96 = super.anInt9128 - 1;
		}
		@Pc(109) int local109 = 0;
		@Pc(113) int[] local113 = this.aClass13_Sub2_6.anIntArray164;
		@Pc(126) int local126;
		for (@Pc(115) int local115 = local60; local115 <= local81; local115++) {
			@Pc(124) boolean[] local124 = arg0[local115 - local62];
			for (local126 = local71; local126 <= local96; local126++) {
				if (local124[local126 - local73]) {
					local113[local109++] = local126 * super.anInt9129 + local115;
				}
			}
		}
		if (arg6 == -1) {
			this.aClass13_Sub2_6.method1959();
		} else {
			this.aClass13_Sub2_6.method1984((float) arg6);
			this.aClass13_Sub2_6.method2021();
		}
		this.aClass13_Sub2_6.method1988((this.anInt1716 & 0x7) != 0);
		for (@Pc(195) int local195 = 0; local195 < this.aClass3_Sub45Array1.length; local195++) {
			this.aClass3_Sub45Array1[local195].method6590(local113, local109);
		}
		if (!this.aClass338_42.method8166()) {
			local126 = this.aClass13_Sub2_6.anInt2169;
			@Pc(224) int local224 = this.aClass13_Sub2_6.anInt2167;
			this.aClass13_Sub2_6.L(0, local224, this.aClass13_Sub2_6.anInt2178);
			this.aClass13_Sub2_6.method1988(false);
			this.aClass13_Sub2_6.method1954(false);
			this.aClass13_Sub2_6.method2019(128);
			this.aClass13_Sub2_6.method2011(-2);
			this.aClass13_Sub2_6.method2024(this.aClass13_Sub2_6.aClass85_Sub3_3);
			this.aClass13_Sub2_6.method1993(7681, 8448);
			this.aClass13_Sub2_6.method2012(34166, 770, 0);
			this.aClass13_Sub2_6.method2028(0, 34167);
			for (@Pc(284) Class3 local284 = this.aClass338_42.method8177(); local284 != null; local284 = this.aClass338_42.method8168()) {
				@Pc(289) Class3_Sub54 local289 = (Class3_Sub54) local284;
				local289.method8931(arg4, arg0, arg5, arg3);
			}
			this.aClass13_Sub2_6.method2012(5890, 768, 0);
			this.aClass13_Sub2_6.method2028(0, 5890);
			this.aClass13_Sub2_6.method2024((Class85) null);
			this.aClass13_Sub2_6.L(local126, local224, this.aClass13_Sub2_6.anInt2178);
		}
		if (this.aClass284_1 == null) {
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		this.aClass13_Sub2_6.method1971((Class381) null, (Class381) null, this.aClass381_3, this.aClass381_4);
		this.aClass284_1.method7041(arg5, arg3, arg0, arg4, arg2);
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!ct", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg3 != null && this.anIntArrayArrayArray6 == null) {
			this.anIntArrayArrayArray6 = new int[super.anInt9129][super.anInt9128][];
		}
		if (arg5 != null && this.anIntArrayArrayArray4 == null) {
			this.anIntArrayArrayArray4 = new int[super.anInt9129][super.anInt9128][];
		}
		@Pc(33) Interface4 local33 = this.aClass13_Sub2_6.anInterface4_14;
		this.anIntArrayArrayArray2[arg0][arg1] = arg2;
		this.anIntArrayArrayArray1[arg0][arg1] = arg4;
		this.anIntArrayArrayArray5[arg0][arg1] = arg6;
		this.anIntArrayArrayArray3[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray4 != null) {
			this.anIntArrayArrayArray4[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray6 != null) {
			this.anIntArrayArrayArray6[arg0][arg1] = arg3;
		}
		@Pc(92) Class3_Sub45[] local92 = this.aClass3_Sub45ArrayArrayArray1[arg0][arg1] = new Class3_Sub45[arg6.length];
		for (@Pc(94) int local94 = 0; local94 < arg6.length; local94++) {
			@Pc(100) int local100 = arg8[local94];
			@Pc(104) int local104 = arg9[local94];
			if ((this.anInt1716 & 0x20) != 0 && local100 != -1 && local33.method4673(local100).aBoolean291) {
				local100 = -1;
				local104 = 128;
			}
			@Pc(146) long local146 = (long) (local104 << 14) | (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48 | (long) local100;
			@Pc(152) Class3 local152;
			for (local152 = this.aClass83_5.method2368(local146); local152 != null; local152 = this.aClass83_5.method2373()) {
				@Pc(157) Class3_Sub45 local157 = (Class3_Sub45) local152;
				if (local157.anInt7461 == local100 && (float) local104 == local157.aFloat155 && local157.anInt7459 == arg10 && local157.anInt7457 == arg11 && local157.anInt7460 == arg12) {
					break;
				}
			}
			if (local152 == null) {
				local92[local94] = new Class3_Sub45(this, local100, local104, arg10, arg11, arg12);
				this.aClass83_5.method2377(local146, local92[local94]);
			} else {
				local92[local94] = (Class3_Sub45) local152;
			}
		}
		if (arg13) {
			this.aByteArrayArray7[arg0][arg1] = (byte) (this.aByteArrayArray7[arg0][arg1] | 0x1);
		}
		if (this.anInt1718 < arg6.length) {
			this.anInt1718 = arg6.length;
		}
		this.lb += arg6.length;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method7972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method1652(arg3, arg5, arg4, arg1, arg2, arg0, -1);
	}

	@OriginalMember(owner = "client!ct", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class3_Sub11_Sub3 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub11_Sub3 arg2) {
		if ((this.aByteArrayArray7[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt9123 >> this.aClass13_Sub2_6.anInt2154;
		@Pc(27) Class3_Sub11_Sub3_Sub2 local27 = (Class3_Sub11_Sub3_Sub2) arg2;
		@Pc(43) Class3_Sub11_Sub3_Sub2 local43;
		if (local27 != null && local27.method6861(local24, local24)) {
			local43 = local27;
			local27.method6864();
		} else {
			local43 = new Class3_Sub11_Sub3_Sub2(this.aClass13_Sub2_6, local24, local24);
		}
		local43.method6865(0, local24, local24, 0);
		this.method1651(arg0, local43, arg1);
		return local43;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method7977(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!ct", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray8[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray8[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!ct", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class3_Sub11_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass284_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass13_Sub2_6.anInt2165 * arg2 >> 8) >> this.aClass13_Sub2_6.anInt2154;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass13_Sub2_6.anInt2177 >> 8) >> this.aClass13_Sub2_6.anInt2154;
			this.aClass284_1.method7045(local39, arg0, local24);
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7974(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.lb <= 0) {
			return;
		}
		this.aClass13_Sub2_6.method2000();
		this.aClass13_Sub2_6.method2013(false);
		this.aClass13_Sub2_6.method1988(false);
		this.aClass13_Sub2_6.method1958(false);
		this.aClass13_Sub2_6.method1954(false);
		this.aClass13_Sub2_6.method2019(0);
		this.aClass13_Sub2_6.method2011(-2);
		this.aClass13_Sub2_6.method2024((Class85) null);
		Static564.aFloatArray76[9] = 0.0F;
		Static564.aFloatArray76[13] = 1.0F - ((float) (arg3 * 1024) / 128.0F + (float) 0) / (float) this.aClass13_Sub2_6.anInt2132;
		Static564.aFloatArray76[12] = -1.0F - ((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass13_Sub2_6.anInt2076;
		Static564.aFloatArray76[2] = 0.0F;
		Static564.aFloatArray76[4] = 0.0F;
		Static564.aFloatArray76[0] = (float) 1024 / ((float) this.aClass13_Sub2_6.anInt2076 * 128.0F * (float) super.anInt9123);
		Static564.aFloatArray76[15] = 1.0F;
		Static564.aFloatArray76[11] = 0.0F;
		Static564.aFloatArray76[7] = 0.0F;
		Static564.aFloatArray76[5] = (float) 1024 / ((float) super.anInt9123 * 128.0F * (float) this.aClass13_Sub2_6.anInt2132);
		Static564.aFloatArray76[14] = 0.0F;
		Static564.aFloatArray76[6] = 0.0F;
		Static564.aFloatArray76[8] = 0.0F;
		Static564.aFloatArray76[3] = 0.0F;
		Static564.aFloatArray76[10] = 0.0F;
		Static564.aFloatArray76[1] = 0.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static564.aFloatArray76, 0);
		Static564.aFloatArray76[9] = 1.0F;
		Static564.aFloatArray76[11] = 0.0F;
		Static564.aFloatArray76[14] = 0.0F;
		Static564.aFloatArray76[1] = 0.0F;
		Static564.aFloatArray76[6] = 1.0F;
		Static564.aFloatArray76[12] = 0.0F;
		Static564.aFloatArray76[5] = 0.0F;
		Static564.aFloatArray76[10] = 0.0F;
		Static564.aFloatArray76[4] = 0.0F;
		Static564.aFloatArray76[8] = 0.0F;
		Static564.aFloatArray76[2] = 0.0F;
		Static564.aFloatArray76[15] = 1.0F;
		Static564.aFloatArray76[7] = 0.0F;
		Static564.aFloatArray76[3] = 0.0F;
		Static564.aFloatArray76[0] = 1.0F;
		Static564.aFloatArray76[13] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static564.aFloatArray76, 0);
		if ((this.anInt1716 & 0x7) == 0) {
			this.aClass13_Sub2_6.method1988(false);
		} else {
			this.aClass13_Sub2_6.method1988(true);
			this.aClass13_Sub2_6.method1973();
		}
		this.aClass13_Sub2_6.method1971(this.aClass381_1, this.aClass381_2, this.aClass381_3, this.aClass381_4);
		if (this.anInt1697 * 2 > this.aClass13_Sub2_6.aClass3_Sub25_Sub2_1.aByteArray106.length) {
			this.aClass13_Sub2_6.aClass3_Sub25_Sub2_1 = new Class3_Sub25_Sub2(this.anInt1697 * 2);
		} else {
			this.aClass13_Sub2_6.aClass3_Sub25_Sub2_1.anInt9765 = 0;
		}
		@Pc(310) int local310 = 0;
		@Pc(314) Class3_Sub25_Sub2 local314 = this.aClass13_Sub2_6.aClass3_Sub25_Sub2_1;
		@Pc(320) int local320;
		@Pc(329) int local329;
		@Pc(331) int local331;
		@Pc(350) short[] local350;
		@Pc(354) int local354;
		if (this.aClass13_Sub2_6.aBoolean166) {
			for (local320 = arg1; local320 < arg3; local320++) {
				local329 = local320 * super.anInt9129 + arg0;
				for (local331 = arg0; local331 < arg2; local331++) {
					if (arg4[local331 - arg0][local320 - arg1]) {
						local350 = this.aShortArrayArray3[local329];
						if (local350 != null) {
							for (local354 = 0; local354 < local350.length; local354++) {
								local314.method8649(local350[local354] & 0xFFFF);
								local310++;
							}
						}
					}
					local329++;
				}
			}
		} else {
			for (local320 = arg1; local320 < arg3; local320++) {
				local329 = super.anInt9129 * local320 + arg0;
				for (local331 = arg0; local331 < arg2; local331++) {
					if (arg4[local331 - arg0][local320 - arg1]) {
						local350 = this.aShortArrayArray3[local329];
						if (local350 != null) {
							for (local354 = 0; local354 < local350.length; local354++) {
								local314.method8602(local350[local354] & 0xFFFF);
								local310++;
							}
						}
					}
					local329++;
				}
			}
		}
		if (local310 > 0) {
			@Pc(471) Class17_Sub1 local471 = new Class17_Sub1(this.aClass13_Sub2_6, 5123, local314.aByteArray106, local314.anInt9765);
			this.aClass13_Sub2_6.method1957(local471, local310, 0);
		}
	}
}
