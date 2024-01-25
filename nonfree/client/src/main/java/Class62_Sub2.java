import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class62_Sub2 extends Class62 {

	@OriginalMember(owner = "client!mh", name = "u", descriptor = "I")
	private int anInt6089;

	@OriginalMember(owner = "client!mh", name = "D", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!mh", name = "N", descriptor = "I")
	private int anInt6098;

	@OriginalMember(owner = "client!mh", name = "Y", descriptor = "I")
	private int anInt6104;

	@OriginalMember(owner = "client!mh", name = "Z", descriptor = "Lclient!jl;")
	public Class166 aClass166_6;

	@OriginalMember(owner = "client!mh", name = "bb", descriptor = "[Lclient!wl;")
	private Class6_Sub50[] aClass6_Sub50Array1;

	@OriginalMember(owner = "client!mh", name = "db", descriptor = "I")
	private int anInt6105;

	@OriginalMember(owner = "client!mh", name = "eb", descriptor = "Lclient!jl;")
	public Class166 aClass166_7;

	@OriginalMember(owner = "client!mh", name = "fb", descriptor = "Lclient!jl;")
	public Class166 aClass166_8;

	@OriginalMember(owner = "client!mh", name = "ib", descriptor = "Lclient!rl;")
	private Interface18 anInterface18_5;

	@OriginalMember(owner = "client!mh", name = "kb", descriptor = "Lclient!jl;")
	private Class166 aClass166_9;

	@OriginalMember(owner = "client!mh", name = "H", descriptor = "Lclient!mfa;")
	private final Class211 aClass211_45 = new Class211();

	@OriginalMember(owner = "client!mh", name = "C", descriptor = "[[I")
	private final int[][] anIntArrayArray42;

	@OriginalMember(owner = "client!mh", name = "G", descriptor = "Lclient!ap;")
	public final Class9_Sub2 aClass9_Sub2_21;

	@OriginalMember(owner = "client!mh", name = "V", descriptor = "I")
	private final int anInt6103;

	@OriginalMember(owner = "client!mh", name = "t", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!mh", name = "W", descriptor = "[[S")
	public final short[][] aShortArrayArray5;

	@OriginalMember(owner = "client!mh", name = "w", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!mh", name = "l", descriptor = "I")
	public final int anInt6082;

	@OriginalMember(owner = "client!mh", name = "p", descriptor = "[[B")
	private final byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!mh", name = "P", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!mh", name = "jb", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!mh", name = "gb", descriptor = "[[B")
	private byte[][] aByteArrayArray20;

	@OriginalMember(owner = "client!mh", name = "cb", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!mh", name = "ab", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!mh", name = "s", descriptor = "I")
	private final int anInt6088;

	@OriginalMember(owner = "client!mh", name = "Q", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!mh", name = "S", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!mh", name = "X", descriptor = "[[[Lclient!wl;")
	private Class6_Sub50[][][] aClass6_Sub50ArrayArrayArray1;

	@OriginalMember(owner = "client!mh", name = "hb", descriptor = "Lclient!tq;")
	private Class305 aClass305_27;

	@OriginalMember(owner = "client!mh", name = "A", descriptor = "Lclient!mw;")
	private Class218 aClass218_2;

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Lclient!ap;IIII[[I[[II)V")
	public Class62_Sub2(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.anIntArrayArray42 = arg5;
		this.aClass9_Sub2_21 = arg0;
		this.anInt6103 = super.anInt9883 - 2;
		this.anIntArrayArrayArray9 = new int[arg3][arg4][];
		this.aShortArrayArray5 = new short[arg3 * arg4][];
		this.anIntArrayArrayArray10 = new int[arg3][arg4][];
		this.anInt6082 = arg2;
		this.aByteArrayArray19 = new byte[arg3][arg4];
		this.anIntArrayArrayArray12 = new int[arg3][arg4][];
		this.aFloatArrayArray7 = new float[super.anInt9881 + 1][super.anInt9885 + 1];
		this.aByteArrayArray20 = new byte[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray6 = new float[super.anInt9881 + 1][super.anInt9885 + 1];
		this.aFloatArrayArray5 = new float[super.anInt9881 + 1][super.anInt9885 + 1];
		this.anInt6088 = 0x1 << this.anInt6103;
		this.anIntArrayArrayArray13 = new int[arg3][arg4][];
		this.anIntArrayArrayArray14 = new int[arg3][arg4][];
		this.aClass6_Sub50ArrayArrayArray1 = new Class6_Sub50[arg3][arg4][];
		for (@Pc(117) int local117 = 1; super.anInt9885 > local117; local117++) {
			for (@Pc(121) int local121 = 1; super.anInt9881 > local121; local121++) {
				@Pc(139) int local139 = arg6[local121 + 1][local117] - arg6[local121 - 1][local117];
				@Pc(156) int local156 = arg6[local121][local117 + 1] - arg6[local121][local117 - 1];
				@Pc(176) float local176 = (float) (1.0D / Math.sqrt((double) (local156 * local156 + local139 * local139 + arg7 * arg7 * 4)));
				this.aFloatArrayArray5[local121][local117] = (float) local139 * local176;
				this.aFloatArrayArray6[local121][local117] = (float) (-arg7 * 2) * local176;
				this.aFloatArrayArray7[local121][local117] = (float) local156 * local176;
			}
		}
		this.aClass305_27 = new Class305(128);
		if ((this.anInt6082 & 0x10) != 0) {
			this.aClass218_2 = new Class218(this.aClass9_Sub2_21, this);
		}
	}

	@OriginalMember(owner = "client!mh", name = "sa", descriptor = "(II)I")
	@Override
	public int sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 >> super.anInt9883;
		@Pc(13) int local13 = arg1 >> super.anInt9883;
		if (local8 < 0 || local13 < 0 || local8 > super.anInt9881 - 1 || local13 > super.anInt9885 - 1) {
			return 0;
		}
		@Pc(42) int local42 = super.anInt9884 - 1 & arg0;
		@Pc(49) int local49 = super.anInt9884 - 1 & arg1;
		@Pc(75) int local75 = this.anIntArrayArray42[local8 + 1][local13] * local42 + this.anIntArrayArray42[local8][local13] * (super.anInt9884 - local42) >> super.anInt9883;
		@Pc(106) int local106 = this.anIntArrayArray42[local8][local13 + 1] * (super.anInt9884 - local42) + this.anIntArrayArray42[local8 + 1][local13 + 1] * local42 >> super.anInt9883;
		return local106 * local49 + local75 * (super.anInt9884 - local49) >> super.anInt9883;
	}

	@OriginalMember(owner = "client!mh", name = "ba", descriptor = "()V")
	@Override
	public void ba() {
		if (this.anInt6105 <= 0) {
			this.aClass218_2 = null;
		} else {
			@Pc(23) byte[][] local23 = new byte[super.anInt9881 + 1][super.anInt9885 + 1];
			@Pc(29) int local29;
			for (@Pc(25) int local25 = 1; super.anInt9881 > local25; local25++) {
				for (local29 = 1; local29 < super.anInt9885; local29++) {
					local23[local25][local29] = (byte) ((this.aByteArrayArray20[local25][local29] >> 1) + (this.aByteArrayArray20[local25][local29 + 1] >> 3) + (this.aByteArrayArray20[local25 - -1][local29] >> 3) + (this.aByteArrayArray20[local25 + -1][local29] >> 2) + (this.aByteArrayArray20[local25][local29 - 1] >> 2));
				}
			}
			this.aClass6_Sub50Array1 = new Class6_Sub50[this.aClass305_27.method7443()];
			this.aClass305_27.method7442(this.aClass6_Sub50Array1);
			for (local29 = 0; local29 < this.aClass6_Sub50Array1.length; local29++) {
				this.aClass6_Sub50Array1[local29].method8080(this.anInt6105);
			}
			@Pc(141) int local141 = 24;
			if (this.anIntArrayArrayArray11 != null) {
				local141 += 4;
			}
			if ((this.anInt6082 & 0x7) != 0) {
				local141 += 12;
			}
			@Pc(164) NativeHeapBuffer local164 = this.aClass9_Sub2_21.aNativeHeap1.a(local141 * this.anInt6105, false);
			@Pc(169) Stream local169 = new Stream(local164);
			@Pc(173) Class6_Sub50[] local173 = new Class6_Sub50[this.anInt6105];
			@Pc(180) int local180 = Static479.method7316(this.anInt6105 / 4);
			if (local180 < 1) {
				local180 = 1;
			}
			@Pc(190) Class305 local190 = new Class305(local180);
			@Pc(194) Class6_Sub50[] local194 = new Class6_Sub50[this.anInt6104];
			@Pc(200) int local200;
			for (@Pc(196) int local196 = 0; super.anInt9881 > local196; local196++) {
				for (local200 = 0; local200 < super.anInt9885; local200++) {
					if (this.anIntArrayArrayArray14[local196][local200] != null) {
						@Pc(216) Class6_Sub50[] local216 = this.aClass6_Sub50ArrayArrayArray1[local196][local200];
						@Pc(223) int[] local223 = this.anIntArrayArrayArray10[local196][local200];
						@Pc(230) int[] local230 = this.anIntArrayArrayArray13[local196][local200];
						@Pc(237) int[] local237 = this.anIntArrayArrayArray9[local196][local200];
						@Pc(244) int[] local244 = this.anIntArrayArrayArray14[local196][local200];
						@Pc(256) int[] local256 = this.anIntArrayArrayArray12 == null ? null : this.anIntArrayArrayArray12[local196][local200];
						if (local237 == null) {
							local237 = local244;
						}
						@Pc(272) int[] local272 = this.anIntArrayArrayArray11 == null ? null : this.anIntArrayArrayArray11[local196][local200];
						@Pc(279) float local279 = this.aFloatArrayArray5[local196][local200];
						@Pc(286) float local286 = this.aFloatArrayArray6[local196][local200];
						@Pc(293) float local293 = this.aFloatArrayArray7[local196][local200];
						@Pc(302) float local302 = this.aFloatArrayArray5[local196][local200 + 1];
						@Pc(311) float local311 = this.aFloatArrayArray6[local196][local200 + 1];
						@Pc(320) float local320 = this.aFloatArrayArray7[local196][local200 + 1];
						@Pc(331) float local331 = this.aFloatArrayArray5[local196 + 1][local200 + 1];
						@Pc(342) float local342 = this.aFloatArrayArray6[local196 + 1][local200 + 1];
						@Pc(353) float local353 = this.aFloatArrayArray7[local196 + 1][local200 + 1];
						@Pc(362) float local362 = this.aFloatArrayArray5[local196 + 1][local200];
						@Pc(371) float local371 = this.aFloatArrayArray6[local196 + 1][local200];
						@Pc(380) float local380 = this.aFloatArrayArray7[local196 + 1][local200];
						@Pc(388) int local388 = local23[local196][local200] & 0xFF;
						@Pc(398) int local398 = local23[local196][local200 + 1] & 0xFF;
						@Pc(410) int local410 = local23[local196 + 1][local200 + 1] & 0xFF;
						@Pc(420) int local420 = local23[local196 + 1][local200] & 0xFF;
						@Pc(422) int local422 = 0;
						@Pc(432) int local432;
						label335: for (@Pc(424) int local424 = 0; local424 < local244.length; local424++) {
							@Pc(430) Class6_Sub50 local430 = local216[local424];
							for (local432 = 0; local432 < local422; local432++) {
								if (local194[local432] == local430) {
									continue label335;
								}
							}
							local194[local422++] = local430;
						}
						@Pc(469) short[] local469 = this.aShortArrayArray5[local196 + super.anInt9881 * local200] = new short[local244.length];
						for (local432 = 0; local432 < local244.length; local432++) {
							@Pc(483) int local483 = (local196 << super.anInt9883) + local223[local432];
							@Pc(493) int local493 = (local200 << super.anInt9883) + local230[local432];
							@Pc(498) int local498 = local483 >> this.anInt6103;
							@Pc(503) int local503 = local493 >> this.anInt6103;
							@Pc(507) int local507 = local244[local432];
							@Pc(511) int local511 = local237[local432];
							@Pc(519) int local519 = local256 == null ? 0 : local256[local432];
							@Pc(537) long local537 = (long) (local498 << 16) | (long) local507 << 32 | (long) local511 << 48 | (long) local503;
							@Pc(541) int local541 = local223[local432];
							@Pc(545) int local545 = local230[local432];
							@Pc(547) byte local547 = 74;
							@Pc(549) int local549 = 0;
							@Pc(551) float local551 = 1.0F;
							@Pc(658) float local658;
							@Pc(650) float local650;
							@Pc(675) float local675;
							@Pc(617) float local617;
							@Pc(712) int local712;
							if (local541 == 0 && local545 == 0) {
								local650 = local286;
								local712 = local547 - local388;
								local658 = local279;
								local675 = local293;
							} else if (local541 == 0 && local545 == super.anInt9884) {
								local650 = local311;
								local658 = local302;
								local675 = local320;
								local712 = local547 - local398;
							} else if (local541 == super.anInt9884 && super.anInt9884 == local545) {
								local675 = local353;
								local650 = local342;
								local712 = local547 - local410;
								local658 = local331;
							} else if (local541 == super.anInt9884 && local545 == 0) {
								local675 = local380;
								local712 = local547 - local420;
								local650 = local371;
								local658 = local362;
							} else {
								@Pc(593) float local593 = (float) local541 / (float) super.anInt9884;
								@Pc(600) float local600 = (float) local545 / (float) super.anInt9884;
								@Pc(609) float local609 = (local362 - local279) * local593 + local279;
								local617 = local286 + local593 * (local371 - local286);
								@Pc(625) float local625 = local293 + local593 * (local380 - local293);
								@Pc(633) float local633 = local302 + (local331 - local302) * local593;
								@Pc(641) float local641 = (local342 - local311) * local593 + local311;
								local650 = local617 + (local641 - local617) * local600;
								local658 = (local633 - local609) * local600 + local609;
								@Pc(666) float local666 = local320 + local593 * (local353 - local320);
								local675 = local625 + local600 * (local666 - local625);
								@Pc(687) int local687 = local388 + (local541 * (local420 - local388) >> super.anInt9883);
								@Pc(698) int local698 = local398 + (local541 * (local410 - local398) >> super.anInt9883);
								local712 = local547 - local687 - ((local698 - local687) * local545 >> super.anInt9883);
							}
							if (local507 != -1) {
								@Pc(771) int local771 = (local507 & 0x7F) * local712 >> 7;
								if (local771 < 2) {
									local771 = 2;
								} else if (local771 > 126) {
									local771 = 126;
								}
								local549 = Static223.anIntArray301[local507 & 0xFF80 | local771];
								if ((this.anInt6082 & 0x7) == 0) {
									local551 = this.aClass9_Sub2_21.aFloatArray3[0] * local658 + local650 * this.aClass9_Sub2_21.aFloatArray3[1] + local675 * this.aClass9_Sub2_21.aFloatArray3[2];
									local551 = local551 * (local551 > 0.0F ? this.aClass9_Sub2_21.aFloat35 : this.aClass9_Sub2_21.aFloat14) + this.aClass9_Sub2_21.aFloat33;
								}
							}
							@Pc(843) Class6 local843 = null;
							if ((this.anInt6088 - 1 & local483) == 0 && (this.anInt6088 - 1 & local493) == 0) {
								local843 = local190.method7447(local537);
							}
							@Pc(879) int local879;
							@Pc(942) int local942;
							if (local843 == null) {
								if (local507 == local511) {
									local942 = local549;
								} else {
									@Pc(920) int local920 = (local511 & 0x7F) * local712 >> 7;
									if (local920 < 2) {
										local920 = 2;
									} else if (local920 > 126) {
										local920 = 126;
									}
									local942 = Static223.anIntArray301[local920 | local511 & 0xFF80];
									if ((this.anInt6082 & 0x7) == 0) {
										local617 = this.aClass9_Sub2_21.aFloatArray3[1] * local650 + this.aClass9_Sub2_21.aFloatArray3[0] * local658 + local675 * this.aClass9_Sub2_21.aFloatArray3[2];
										local617 = local551 * (local551 > 0.0F ? this.aClass9_Sub2_21.aFloat35 : this.aClass9_Sub2_21.aFloat14) + this.aClass9_Sub2_21.aFloat33;
										@Pc(998) int local998 = local942 >> 16 & 0xFF;
										@Pc(1004) int local1004 = local942 >> 8 & 0xFF;
										@Pc(1008) int local1008 = local942 & 0xFF;
										local998 = (int) ((float) local998 * local617);
										local1004 = (int) ((float) local1004 * local617);
										if (local998 < 0) {
											local998 = 0;
										} else if (local998 > 255) {
											local998 = 255;
										}
										local1008 = (int) ((float) local1008 * local617);
										if (local1004 < 0) {
											local1004 = 0;
										} else if (local1004 > 255) {
											local1004 = 255;
										}
										if (local1008 < 0) {
											local1008 = 0;
										} else if (local1008 > 255) {
											local1008 = 255;
										}
										local942 = local1008 | local998 << 16 | local1004 << 8;
									}
								}
								if (this.aClass9_Sub2_21.aBoolean65) {
									local169.a((float) local483);
									local169.a((float) (local519 + this.sa(local483, local493)));
									local169.a((float) local493);
									local169.f((byte) (local942 >> 16));
									local169.f((byte) (local942 >> 8));
									local169.f((byte) local942);
									local169.f(-1);
									local169.a((float) local483);
									local169.a((float) local493);
									if (this.anIntArrayArrayArray11 != null) {
										local169.a((float) (local272 == null ? 0 : local272[local432] - 1));
									}
									if ((this.anInt6082 & 0x7) != 0) {
										local169.a(local658);
										local169.a(local650);
										local169.a(local675);
									}
								} else {
									local169.b((float) local483);
									local169.b((float) (local519 + this.sa(local483, local493)));
									local169.b((float) local493);
									local169.f((byte) (local942 >> 16));
									local169.f((byte) (local942 >> 8));
									local169.f((byte) local942);
									local169.f(-1);
									local169.b((float) local483);
									local169.b((float) local493);
									if (this.anIntArrayArrayArray11 != null) {
										local169.b((float) (local272 == null ? 0 : local272[local432] - 1));
									}
									if ((this.anInt6082 & 0x7) != 0) {
										local169.b(local658);
										local169.b(local650);
										local169.b(local675);
									}
								}
								local879 = this.anInt6089++;
								local469[local432] = (short) local879;
								if (local507 != -1) {
									local173[local879] = local216[local432];
								}
								local190.method7448(local537, new Class6_Sub16(local469[local432]));
							} else {
								local469[local432] = ((Class6_Sub16) local843).aShort28;
								local879 = local469[local432] & 0xFFFF;
								if (local507 != -1 && local216[local432].aLong252 < local173[local879].aLong252) {
									local173[local879] = local216[local432];
								}
							}
							for (local942 = 0; local942 < local422; local942++) {
								local194[local942].method8081(local551, local712, local879, local549);
							}
							this.anInt6098++;
						}
					}
				}
			}
			for (local200 = 0; local200 < this.anInt6089; local200++) {
				@Pc(1321) Class6_Sub50 local1321 = local173[local200];
				if (local1321 != null) {
					local1321.method8084(local200);
				}
			}
			@Pc(1355) int local1355;
			for (@Pc(1334) int local1334 = 0; super.anInt9881 > local1334; local1334++) {
				for (@Pc(1338) int local1338 = 0; super.anInt9885 > local1338; local1338++) {
					@Pc(1351) short[] local1351 = this.aShortArrayArray5[super.anInt9881 * local1338 + local1334];
					if (local1351 != null) {
						local1355 = 0;
						@Pc(1357) int local1357 = 0;
						while (local1357 < local1351.length) {
							@Pc(1366) int local1366 = local1351[local1357++] & 0xFFFF;
							@Pc(1373) int local1373 = local1351[local1357++] & 0xFFFF;
							@Pc(1380) int local1380 = local1351[local1357++] & 0xFFFF;
							@Pc(1384) Class6_Sub50 local1384 = local173[local1366];
							@Pc(1388) Class6_Sub50 local1388 = local173[local1373];
							@Pc(1392) Class6_Sub50 local1392 = local173[local1380];
							@Pc(1394) Class6_Sub50 local1394 = null;
							if (local1384 != null) {
								local1384.method8089(local1338, local1334, local1355);
								local1394 = local1384;
							}
							if (local1388 != null) {
								local1388.method8089(local1338, local1334, local1355);
								if (local1394 == null || local1388.aLong252 < local1394.aLong252) {
									local1394 = local1388;
								}
							}
							if (local1392 != null) {
								local1392.method8089(local1338, local1334, local1355);
								if (local1394 == null || local1394.aLong252 > local1392.aLong252) {
									local1394 = local1392;
								}
							}
							if (local1394 != null) {
								if (local1384 != null) {
									local1394.method8084(local1366);
								}
								if (local1388 != null) {
									local1394.method8084(local1373);
								}
								if (local1392 != null) {
									local1394.method8084(local1380);
								}
								local1394.method8089(local1338, local1334, local1355);
							}
							local1355++;
						}
					}
				}
			}
			local169.a();
			this.anInterface18_5 = this.aClass9_Sub2_21.method773(local164, local141, local169.b());
			this.aClass166_8 = new Class166(this.anInterface18_5, 5126, 3, 0);
			this.aClass166_9 = new Class166(this.anInterface18_5, 5121, 4, 12);
			@Pc(1535) byte local1535;
			if (this.anIntArrayArrayArray11 == null) {
				local1535 = 24;
				this.aClass166_7 = new Class166(this.anInterface18_5, 5126, 2, 16);
			} else {
				this.aClass166_7 = new Class166(this.anInterface18_5, 5126, 3, 16);
				local1535 = 28;
			}
			if ((this.anInt6082 & 0x7) != 0) {
				this.aClass166_6 = new Class166(this.anInterface18_5, 5126, 3, local1535);
			}
			@Pc(1579) long[] local1579 = new long[this.aClass6_Sub50Array1.length];
			for (local1355 = 0; local1355 < this.aClass6_Sub50Array1.length; local1355++) {
				@Pc(1588) Class6_Sub50 local1588 = this.aClass6_Sub50Array1[local1355];
				local1579[local1355] = local1588.aLong252;
				local1588.method8083(this.anInt6089);
			}
			Static379.method5984(this.aClass6_Sub50Array1, local1579);
			if (this.aClass218_2 != null) {
				this.aClass218_2.method5294();
			}
		}
		this.anIntArrayArrayArray10 = this.anIntArrayArrayArray13 = null;
		this.anIntArrayArrayArray9 = null;
		this.anIntArrayArrayArray11 = null;
		this.aFloatArrayArray5 = this.aFloatArrayArray6 = this.aFloatArrayArray7 = null;
		this.aByteArrayArray20 = null;
		this.anIntArrayArrayArray12 = null;
		this.aClass305_27 = null;
		this.aClass6_Sub50ArrayArrayArray1 = null;
		this.anIntArrayArrayArray14 = null;
	}

	@OriginalMember(owner = "client!mh", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray11 == null) {
			this.anIntArrayArrayArray11 = new int[super.anInt9881][super.anInt9885][];
		}
		if (arg3 != null && this.anIntArrayArrayArray12 == null) {
			this.anIntArrayArrayArray12 = new int[super.anInt9881][super.anInt9885][];
		}
		this.anIntArrayArrayArray10[arg0][arg1] = arg2;
		this.anIntArrayArrayArray13[arg0][arg1] = arg4;
		this.anIntArrayArrayArray14[arg0][arg1] = arg6;
		this.anIntArrayArrayArray9[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray11 != null) {
			this.anIntArrayArrayArray11[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray12 != null) {
			this.anIntArrayArrayArray12[arg0][arg1] = arg3;
		}
		@Pc(88) Class6_Sub50[] local88 = this.aClass6_Sub50ArrayArrayArray1[arg0][arg1] = new Class6_Sub50[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) (arg9[local90] << 14) | (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42 | (long) arg8[local90];
			@Pc(125) Class6 local125;
			for (local125 = this.aClass305_27.method7447(local119); local125 != null; local125 = this.aClass305_27.method7446()) {
				@Pc(130) Class6_Sub50 local130 = (Class6_Sub50) local125;
				if (local130.anInt9701 == arg8[local90] && (float) arg9[local90] == local130.aFloat197 && local130.anInt9697 == arg10 && arg11 == local130.anInt9705 && arg12 == local130.anInt9699) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class6_Sub50(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass305_27.method7448(local119, local88[local90]);
			} else {
				local88[local90] = (Class6_Sub50) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray19[arg0][arg1] = (byte) (this.aByteArrayArray19[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt6104) {
			this.anInt6104 = arg6.length;
		}
		this.anInt6105 += arg6.length;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILclient!caa;IB)V")
	private void method5202(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub4_Sub2_Sub1 arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray10[arg2][arg0];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray13[arg2][arg0];
		@Pc(22) int local22 = local12.length;
		if (this.aClass9_Sub2_21.anIntArray52.length < local22) {
			this.aClass9_Sub2_21.anIntArray52 = new int[local22];
			this.aClass9_Sub2_21.anIntArray50 = new int[local22];
		}
		@Pc(42) int[] local42 = this.aClass9_Sub2_21.anIntArray52;
		@Pc(46) int[] local46 = this.aClass9_Sub2_21.anIntArray50;
		for (@Pc(48) int local48 = 0; local48 < local22; local48++) {
			local42[local48] = local12[local48] >> this.aClass9_Sub2_21.anInt811;
			local46[local48] = local19[local48] >> this.aClass9_Sub2_21.anInt811;
		}
		@Pc(84) int local84 = 0;
		while (local84 < local22) {
			@Pc(90) int local90 = local42[local84];
			@Pc(95) int local95 = local46[local84++];
			@Pc(99) int local99 = local42[local84];
			@Pc(104) int local104 = local46[local84++];
			@Pc(108) int local108 = local42[local84];
			@Pc(113) int local113 = local46[local84++];
			if (-((local108 - local99) * (local104 + -local95)) + (local90 - local99) * (-local113 + local104) > 0) {
				arg1.method1260(local104, local99, local90, local95, local108, local113);
			}
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!od;[I)V")
	@Override
	public void method8203(@OriginalArg(0) Class6_Sub29 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass211_45.method5173(new Class6_Sub51(this.aClass9_Sub2_21, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method8205(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt6105 <= 0) {
			return;
		}
		this.aClass9_Sub2_21.method801();
		this.aClass9_Sub2_21.method803(false);
		this.aClass9_Sub2_21.method826(false);
		this.aClass9_Sub2_21.method812(false);
		this.aClass9_Sub2_21.method808(false);
		this.aClass9_Sub2_21.method804(0);
		this.aClass9_Sub2_21.method747(-2);
		this.aClass9_Sub2_21.method814(null);
		Static533.aFloatArray67[0] = (float) 1024 / ((float) this.aClass9_Sub2_21.anInt702 * 128.0F * (float) super.anInt9884);
		Static533.aFloatArray67[6] = 0.0F;
		Static533.aFloatArray67[8] = 0.0F;
		Static533.aFloatArray67[3] = 0.0F;
		Static533.aFloatArray67[15] = 1.0F;
		Static533.aFloatArray67[14] = 0.0F;
		Static533.aFloatArray67[4] = 0.0F;
		Static533.aFloatArray67[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass9_Sub2_21.anInt799;
		Static533.aFloatArray67[1] = 0.0F;
		Static533.aFloatArray67[7] = 0.0F;
		Static533.aFloatArray67[12] = -(((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass9_Sub2_21.anInt702) - 1.0F;
		Static533.aFloatArray67[11] = 0.0F;
		Static533.aFloatArray67[10] = 0.0F;
		Static533.aFloatArray67[5] = (float) 1024 / ((float) this.aClass9_Sub2_21.anInt799 * 128.0F * (float) super.anInt9884);
		Static533.aFloatArray67[9] = 0.0F;
		Static533.aFloatArray67[2] = 0.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static533.aFloatArray67, 0);
		Static533.aFloatArray67[1] = 0.0F;
		Static533.aFloatArray67[3] = 0.0F;
		Static533.aFloatArray67[13] = 0.0F;
		Static533.aFloatArray67[4] = 0.0F;
		Static533.aFloatArray67[15] = 1.0F;
		Static533.aFloatArray67[10] = 0.0F;
		Static533.aFloatArray67[8] = 0.0F;
		Static533.aFloatArray67[14] = 0.0F;
		Static533.aFloatArray67[12] = 0.0F;
		Static533.aFloatArray67[6] = 1.0F;
		Static533.aFloatArray67[7] = 0.0F;
		Static533.aFloatArray67[9] = 1.0F;
		Static533.aFloatArray67[2] = 0.0F;
		Static533.aFloatArray67[5] = 0.0F;
		Static533.aFloatArray67[11] = 0.0F;
		Static533.aFloatArray67[0] = 1.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static533.aFloatArray67, 0);
		if ((this.anInt6082 & 0x7) == 0) {
			this.aClass9_Sub2_21.method826(false);
		} else {
			this.aClass9_Sub2_21.method826(true);
			this.aClass9_Sub2_21.method825();
		}
		this.aClass9_Sub2_21.method805(this.aClass166_8, this.aClass166_7, this.aClass166_9, this.aClass166_6);
		if (this.aClass9_Sub2_21.aClass6_Sub26_Sub1_1.aByteArray65.length >= this.anInt6098 * 2) {
			this.aClass9_Sub2_21.aClass6_Sub26_Sub1_1.anInt5769 = 0;
		} else {
			this.aClass9_Sub2_21.aClass6_Sub26_Sub1_1 = new Class6_Sub26_Sub1(this.anInt6098 * 2);
		}
		@Pc(308) int local308 = 0;
		@Pc(312) Class6_Sub26_Sub1 local312 = this.aClass9_Sub2_21.aClass6_Sub26_Sub1_1;
		@Pc(318) int local318;
		@Pc(327) int local327;
		@Pc(329) int local329;
		@Pc(348) short[] local348;
		@Pc(352) int local352;
		if (this.aClass9_Sub2_21.aBoolean65) {
			for (local318 = arg1; local318 < arg3; local318++) {
				local327 = arg0 + super.anInt9881 * local318;
				for (local329 = arg0; local329 < arg2; local329++) {
					if (arg4[local329 - arg0][local318 - arg1]) {
						local348 = this.aShortArrayArray5[local327];
						if (local348 != null) {
							for (local352 = 0; local352 < local348.length; local352++) {
								local312.method4962(local348[local352] & 0xFFFF);
								local308++;
							}
						}
					}
					local327++;
				}
			}
		} else {
			for (local318 = arg1; local318 < arg3; local318++) {
				local327 = arg0 + local318 * super.anInt9881;
				for (local329 = arg0; local329 < arg2; local329++) {
					if (arg4[local329 - arg0][local318 - arg1]) {
						local348 = this.aShortArrayArray5[local327];
						if (local348 != null) {
							for (local352 = 0; local352 < local348.length; local352++) {
								local312.method4993(local348[local352] & 0xFFFF);
								local308++;
							}
						}
					}
					local327++;
				}
			}
		}
		if (local308 > 0) {
			@Pc(468) Class14_Sub2 local468 = new Class14_Sub2(this.aClass9_Sub2_21, 5123, local312.aByteArray65, local312.anInt5769);
			this.aClass9_Sub2_21.method790(local308, 0, local468);
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!w;IIIIZ)Z")
	@Override
	public boolean method8207(@OriginalArg(0) Class6_Sub4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass218_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (arg2 * this.aClass9_Sub2_21.anInt848 >> 8) >> this.aClass9_Sub2_21.anInt811;
			@Pc(40) int local40 = arg3 - (this.aClass9_Sub2_21.anInt842 * arg2 >> 8) >> this.aClass9_Sub2_21.anInt811;
			return this.aClass218_2.method5295(arg0, local25, local40);
		}
	}

	@OriginalMember(owner = "client!mh", name = "FA", descriptor = "(Lclient!w;IIIIZ)V")
	@Override
	public void FA(@OriginalArg(0) Class6_Sub4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass218_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass9_Sub2_21.anInt848 >> 8) >> this.aClass9_Sub2_21.anInt811;
			@Pc(39) int local39 = arg3 - (this.aClass9_Sub2_21.anInt842 * arg2 >> 8) >> this.aClass9_Sub2_21.anInt811;
			this.aClass218_2.method5296(local39, local24, arg0);
		}
	}

	@OriginalMember(owner = "client!mh", name = "EA", descriptor = "(III)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray20[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray20[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "(IILclient!w;)Lclient!w;")
	@Override
	public Class6_Sub4_Sub2 c(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub4_Sub2 arg2) {
		if ((this.aByteArrayArray19[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt9884 >> this.aClass9_Sub2_21.anInt811;
		@Pc(27) Class6_Sub4_Sub2_Sub1 local27 = (Class6_Sub4_Sub2_Sub1) arg2;
		@Pc(37) Class6_Sub4_Sub2_Sub1 local37;
		if (local27 != null && local27.method1262(local24, local24)) {
			local37 = local27;
			local27.method1265();
		} else {
			local37 = new Class6_Sub4_Sub2_Sub1(this.aClass9_Sub2_21, local24, local24);
		}
		local37.method1259(0, local24, local24, 0);
		this.method5202(arg1, local37, arg0);
		return local37;
	}

	@OriginalMember(owner = "client!mh", name = "aa", descriptor = "(Lclient!w;IIIIZ)V")
	@Override
	public void aa(@OriginalArg(0) Class6_Sub4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass218_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass9_Sub2_21.anInt848 * arg2 >> 8) >> this.aClass9_Sub2_21.anInt811;
			@Pc(38) int local38 = arg3 - (arg2 * this.aClass9_Sub2_21.anInt842 >> 8) >> this.aClass9_Sub2_21.anInt811;
			this.aClass218_2.method5297(local24, arg0, local38);
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)V")
	@Override
	public void method8204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!mh", name = "JA", descriptor = "(II)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray42[arg0][arg1];
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method8208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method5205(arg1, arg4, arg3, arg0, arg2);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
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

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIZ[[ZIII)V")
	private void method5205(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (this.aClass6_Sub50Array1 == null) {
			return;
		}
		@Pc(10) int local10 = arg4 + arg4 + 1;
		@Pc(14) int local14 = local10 * local10;
		if (local14 > this.aClass9_Sub2_21.anIntArray51.length) {
			this.aClass9_Sub2_21.anIntArray51 = new int[local14];
		}
		if (this.aClass9_Sub2_21.aClass6_Sub26_Sub1_1.aByteArray65.length < this.anInt6098 * 2) {
			this.aClass9_Sub2_21.aClass6_Sub26_Sub1_1 = new Class6_Sub26_Sub1(this.anInt6098 * 2);
		}
		@Pc(53) int local53 = arg3 - arg4;
		@Pc(55) int local55 = local53;
		if (local53 < 0) {
			local53 = 0;
		}
		@Pc(64) int local64 = arg0 - arg4;
		@Pc(66) int local66 = local64;
		if (local64 < 0) {
			local64 = 0;
		}
		@Pc(77) int local77 = arg4 + arg3;
		if (local77 > super.anInt9881 - 1) {
			local77 = super.anInt9881 - 1;
		}
		@Pc(96) int local96 = arg4 + arg0;
		if (local96 > super.anInt9885 - 1) {
			local96 = super.anInt9885 - 1;
		}
		@Pc(113) int local113 = 0;
		@Pc(117) int[] local117 = this.aClass9_Sub2_21.anIntArray51;
		@Pc(130) int local130;
		for (@Pc(119) int local119 = local53; local119 <= local77; local119++) {
			@Pc(128) boolean[] local128 = arg2[local119 - local55];
			for (local130 = local64; local130 <= local96; local130++) {
				if (local128[local130 - local66]) {
					local117[local113++] = local119 + local130 * super.anInt9881;
				}
			}
		}
		this.aClass9_Sub2_21.method791();
		this.aClass9_Sub2_21.method826((this.anInt6082 & 0x7) != 0);
		for (@Pc(197) int local197 = 0; local197 < this.aClass6_Sub50Array1.length; local197++) {
			this.aClass6_Sub50Array1[local197].method8085(local117, local113);
		}
		if (!this.aClass211_45.method5170()) {
			local130 = this.aClass9_Sub2_21.anInt832;
			@Pc(230) int local230 = this.aClass9_Sub2_21.anInt827;
			this.aClass9_Sub2_21.X(0, local230, this.aClass9_Sub2_21.anInt831);
			this.aClass9_Sub2_21.method826(false);
			this.aClass9_Sub2_21.method808(false);
			this.aClass9_Sub2_21.method804(128);
			this.aClass9_Sub2_21.method747(-2);
			this.aClass9_Sub2_21.method814(this.aClass9_Sub2_21.aClass132_Sub1_2);
			this.aClass9_Sub2_21.method797(8448, 7681);
			this.aClass9_Sub2_21.method798(0, 770, 34166);
			this.aClass9_Sub2_21.method816(34167, 0);
			for (@Pc(290) Class6 local290 = this.aClass211_45.method5183(); local290 != null; local290 = this.aClass211_45.method5177()) {
				@Pc(295) Class6_Sub51 local295 = (Class6_Sub51) local290;
				local295.method8145(arg2, arg4, arg3, arg0);
			}
			this.aClass9_Sub2_21.method798(0, 768, 5890);
			this.aClass9_Sub2_21.method816(5890, 0);
			this.aClass9_Sub2_21.method814(null);
			this.aClass9_Sub2_21.X(local130, local230, this.aClass9_Sub2_21.anInt831);
		}
		if (this.aClass218_2 != null) {
			this.aClass9_Sub2_21.method805(this.aClass166_8, this.aClass166_7, null, null);
			this.aClass218_2.method5300(arg3, arg1, arg0, arg4, arg2);
		}
	}
}
