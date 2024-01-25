import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mu")
public final class Class40_Sub2 extends Class40 {

	@OriginalMember(owner = "client!mu", name = "G", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!mu", name = "N", descriptor = "I")
	private int anInt6419;

	@OriginalMember(owner = "client!mu", name = "R", descriptor = "I")
	private int anInt6422;

	@OriginalMember(owner = "client!mu", name = "X", descriptor = "I")
	private int anInt6425;

	@OriginalMember(owner = "client!mu", name = "Y", descriptor = "Lclient!im;")
	public Class159 aClass159_5;

	@OriginalMember(owner = "client!mu", name = "Z", descriptor = "Lclient!im;")
	public Class159 aClass159_6;

	@OriginalMember(owner = "client!mu", name = "ab", descriptor = "I")
	private int anInt6426;

	@OriginalMember(owner = "client!mu", name = "bb", descriptor = "Lclient!im;")
	private Class159 aClass159_7;

	@OriginalMember(owner = "client!mu", name = "db", descriptor = "Lclient!cs;")
	private Interface7 anInterface7_3;

	@OriginalMember(owner = "client!mu", name = "hb", descriptor = "Lclient!im;")
	public Class159 aClass159_8;

	@OriginalMember(owner = "client!mu", name = "jb", descriptor = "[Lclient!aia;")
	private Class5_Sub3[] aClass5_Sub3Array1;

	@OriginalMember(owner = "client!mu", name = "I", descriptor = "Lclient!ro;")
	private final Class306 aClass306_31 = new Class306();

	@OriginalMember(owner = "client!mu", name = "Q", descriptor = "Lclient!rda;")
	public final Class126_Sub3 aClass126_Sub3_21;

	@OriginalMember(owner = "client!mu", name = "o", descriptor = "I")
	private final int anInt6404;

	@OriginalMember(owner = "client!mu", name = "J", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!mu", name = "W", descriptor = "I")
	private final int anInt6424;

	@OriginalMember(owner = "client!mu", name = "K", descriptor = "[[S")
	public final short[][] aShortArrayArray10;

	@OriginalMember(owner = "client!mu", name = "V", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!mu", name = "B", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!mu", name = "T", descriptor = "I")
	public final int anInt6423;

	@OriginalMember(owner = "client!mu", name = "ib", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!mu", name = "x", descriptor = "[[B")
	private final byte[][] aByteArrayArray11;

	@OriginalMember(owner = "client!mu", name = "cb", descriptor = "[[B")
	private byte[][] aByteArrayArray12;

	@OriginalMember(owner = "client!mu", name = "q", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!mu", name = "v", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!mu", name = "t", descriptor = "[[[Lclient!aia;")
	private Class5_Sub3[][][] aClass5_Sub3ArrayArrayArray1;

	@OriginalMember(owner = "client!mu", name = "eb", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!mu", name = "fb", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!mu", name = "gb", descriptor = "Lclient!du;")
	private Class81 aClass81_47;

	@OriginalMember(owner = "client!mu", name = "U", descriptor = "Lclient!jl;")
	private Class174 aClass174_1;

	@OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Lclient!rda;IIII[[I[[II)V")
	public Class40_Sub2(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass126_Sub3_21 = arg0;
		this.anInt6404 = super.anInt9919 - 2;
		this.anIntArrayArrayArray8 = new int[arg3][arg4][];
		this.anInt6424 = 0x1 << this.anInt6404;
		this.aShortArrayArray10 = new short[arg3 * arg4][];
		this.anIntArrayArrayArray9 = new int[arg3][arg4][];
		this.anIntArrayArrayArray6 = new int[arg3][arg4][];
		this.anInt6423 = arg2;
		this.aFloatArrayArray7 = new float[super.anInt9920 + 1][super.anInt9923 + 1];
		this.aByteArrayArray11 = new byte[arg3][arg4];
		this.aByteArrayArray12 = new byte[arg3 + 1][arg4 + 1];
		this.anIntArrayArrayArray4 = new int[arg3][arg4][];
		this.anIntArrayArrayArray5 = new int[arg3][arg4][];
		this.aClass5_Sub3ArrayArrayArray1 = new Class5_Sub3[arg3][arg4][];
		this.aFloatArrayArray5 = new float[super.anInt9920 + 1][super.anInt9923 + 1];
		this.aFloatArrayArray6 = new float[super.anInt9920 + 1][super.anInt9923 + 1];
		for (@Pc(115) int local115 = 1; local115 < super.anInt9923; local115++) {
			for (@Pc(119) int local119 = 1; super.anInt9920 > local119; local119++) {
				@Pc(138) int local138 = arg6[local119 + 1][local115] - arg6[local119 - 1][local115];
				@Pc(155) int local155 = arg6[local119][local115 + 1] - arg6[local119][local115 - 1];
				@Pc(174) float local174 = (float) (1.0D / Math.sqrt((double) (arg7 * arg7 * 4 + local138 * local138 + local155 * local155)));
				this.aFloatArrayArray6[local119][local115] = local174 * (float) local138;
				this.aFloatArrayArray5[local119][local115] = local174 * (float) (-arg7 * 2);
				this.aFloatArrayArray7[local119][local115] = local174 * (float) local155;
			}
		}
		this.aClass81_47 = new Class81(128);
		if ((this.anInt6423 & 0x10) != 0) {
			this.aClass174_1 = new Class174(this.aClass126_Sub3_21, this);
		}
	}

	@OriginalMember(owner = "client!mu", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.anInt6426 <= 0) {
			this.aClass174_1 = null;
		} else {
			@Pc(19) byte[][] local19 = new byte[super.anInt9920 + 1][super.anInt9923 + 1];
			@Pc(25) int local25;
			for (@Pc(21) int local21 = 1; super.anInt9920 > local21; local21++) {
				for (local25 = 1; super.anInt9923 > local25; local25++) {
					local19[local21][local25] = (byte) ((this.aByteArrayArray12[local21][local25 - 1] >> 2) + (this.aByteArrayArray12[local21 + 1][local25] >> 3) + (this.aByteArrayArray12[local21 + -1][local25] >> 2) + (this.aByteArrayArray12[local21][local25 + 1] >> 3) + (this.aByteArrayArray12[local21][local25] >> 1));
				}
			}
			this.aClass5_Sub3Array1 = new Class5_Sub3[this.aClass81_47.method1611()];
			this.aClass81_47.method1606(this.aClass5_Sub3Array1);
			for (local25 = 0; local25 < this.aClass5_Sub3Array1.length; local25++) {
				this.aClass5_Sub3Array1[local25].method434(this.anInt6426);
			}
			@Pc(137) int local137 = 24;
			if (this.anIntArrayArrayArray7 != null) {
				local137 += 4;
			}
			if ((this.anInt6423 & 0x7) != 0) {
				local137 += 12;
			}
			@Pc(160) NativeHeapBuffer local160 = this.aClass126_Sub3_21.aNativeHeap5.a(this.anInt6426 * local137, false);
			@Pc(165) Stream local165 = new Stream(local160);
			@Pc(169) Class5_Sub3[] local169 = new Class5_Sub3[this.anInt6426];
			@Pc(176) int local176 = Static473.method6912(this.anInt6426 / 4);
			if (local176 < 1) {
				local176 = 1;
			}
			@Pc(186) Class81 local186 = new Class81(local176);
			@Pc(190) Class5_Sub3[] local190 = new Class5_Sub3[this.anInt6425];
			@Pc(196) int local196;
			for (@Pc(192) int local192 = 0; super.anInt9920 > local192; local192++) {
				for (local196 = 0; super.anInt9923 > local196; local196++) {
					if (this.anIntArrayArrayArray6[local192][local196] != null) {
						@Pc(212) Class5_Sub3[] local212 = this.aClass5_Sub3ArrayArrayArray1[local192][local196];
						@Pc(219) int[] local219 = this.anIntArrayArrayArray5[local192][local196];
						@Pc(226) int[] local226 = this.anIntArrayArrayArray4[local192][local196];
						@Pc(233) int[] local233 = this.anIntArrayArrayArray9[local192][local196];
						@Pc(240) int[] local240 = this.anIntArrayArrayArray6[local192][local196];
						@Pc(252) int[] local252 = this.anIntArrayArrayArray8 == null ? null : this.anIntArrayArrayArray8[local192][local196];
						if (local233 == null) {
							local233 = local240;
						}
						@Pc(268) int[] local268 = this.anIntArrayArrayArray7 == null ? null : this.anIntArrayArrayArray7[local192][local196];
						@Pc(275) float local275 = this.aFloatArrayArray6[local192][local196];
						@Pc(282) float local282 = this.aFloatArrayArray5[local192][local196];
						@Pc(289) float local289 = this.aFloatArrayArray7[local192][local196];
						@Pc(298) float local298 = this.aFloatArrayArray6[local192][local196 + 1];
						@Pc(307) float local307 = this.aFloatArrayArray5[local192][local196 + 1];
						@Pc(316) float local316 = this.aFloatArrayArray7[local192][local196 + 1];
						@Pc(327) float local327 = this.aFloatArrayArray6[local192 + 1][local196 + 1];
						@Pc(338) float local338 = this.aFloatArrayArray5[local192 + 1][local196 + 1];
						@Pc(349) float local349 = this.aFloatArrayArray7[local192 + 1][local196 + 1];
						@Pc(358) float local358 = this.aFloatArrayArray6[local192 + 1][local196];
						@Pc(367) float local367 = this.aFloatArrayArray5[local192 + 1][local196];
						@Pc(376) float local376 = this.aFloatArrayArray7[local192 + 1][local196];
						@Pc(384) int local384 = local19[local192][local196] & 0xFF;
						@Pc(394) int local394 = local19[local192][local196 + 1] & 0xFF;
						@Pc(406) int local406 = local19[local192 + 1][local196 + 1] & 0xFF;
						@Pc(416) int local416 = local19[local192 + 1][local196] & 0xFF;
						@Pc(418) int local418 = 0;
						@Pc(428) int local428;
						label335: for (@Pc(420) int local420 = 0; local420 < local240.length; local420++) {
							@Pc(426) Class5_Sub3 local426 = local212[local420];
							for (local428 = 0; local428 < local418; local428++) {
								if (local426 == local190[local428]) {
									continue label335;
								}
							}
							local190[local418++] = local426;
						}
						@Pc(465) short[] local465 = this.aShortArrayArray10[local192 + super.anInt9920 * local196] = new short[local240.length];
						for (local428 = 0; local428 < local240.length; local428++) {
							@Pc(478) int local478 = (local192 << super.anInt9919) + local219[local428];
							@Pc(488) int local488 = (local196 << super.anInt9919) + local226[local428];
							@Pc(493) int local493 = local478 >> this.anInt6404;
							@Pc(498) int local498 = local488 >> this.anInt6404;
							@Pc(502) int local502 = local240[local428];
							@Pc(506) int local506 = local233[local428];
							@Pc(514) int local514 = local252 == null ? 0 : local252[local428];
							@Pc(532) long local532 = (long) (local493 << 16) | (long) local502 << 32 | (long) local506 << 48 | (long) local498;
							@Pc(536) int local536 = local219[local428];
							@Pc(540) int local540 = local226[local428];
							@Pc(542) byte local542 = 74;
							@Pc(544) int local544 = 0;
							@Pc(554) float local554;
							@Pc(556) float local556;
							@Pc(558) float local558;
							@Pc(652) float local652;
							@Pc(552) int local552;
							if (local536 == 0 && local540 == 0) {
								local552 = local542 - local384;
								local554 = local275;
								local556 = local282;
								local558 = local289;
							} else if (local536 == 0 && super.anInt9918 == local540) {
								local556 = local307;
								local552 = local542 - local394;
								local554 = local298;
								local558 = local316;
							} else if (local536 == super.anInt9918 && local540 == super.anInt9918) {
								local556 = local338;
								local558 = local349;
								local552 = local542 - local406;
								local554 = local327;
							} else if (local536 == super.anInt9918 && local540 == 0) {
								local556 = local367;
								local554 = local358;
								local552 = local542 - local416;
								local558 = local376;
							} else {
								@Pc(629) float local629 = (float) local536 / (float) super.anInt9918;
								@Pc(636) float local636 = (float) local540 / (float) super.anInt9918;
								@Pc(644) float local644 = (local358 - local275) * local629 + local275;
								local652 = local282 + (local367 - local282) * local629;
								@Pc(660) float local660 = (local376 - local289) * local629 + local289;
								@Pc(669) float local669 = local298 + local629 * (local327 - local298);
								@Pc(677) float local677 = local629 * (local338 - local307) + local307;
								local554 = local644 + (local669 - local644) * local636;
								local556 = local652 + local636 * (local677 - local652);
								@Pc(702) float local702 = local316 + local629 * (local349 - local316);
								local558 = local660 + local636 * (local702 - local660);
								@Pc(724) int local724 = local384 + (local536 * (local416 - local384) >> super.anInt9919);
								@Pc(736) int local736 = local394 + (local536 * (local406 - local394) >> super.anInt9919);
								local552 = local542 - (local540 * (local736 - local724) >> super.anInt9919) - local724;
							}
							@Pc(751) float local751 = 1.0F;
							if (local502 != -1) {
								@Pc(763) int local763 = local552 * (local502 & 0x7F) >> 7;
								if (local763 < 2) {
									local763 = 2;
								} else if (local763 > 126) {
									local763 = 126;
								}
								local544 = Static643.anIntArray836[local502 & 0xFF80 | local763];
								if ((this.anInt6423 & 0x7) == 0) {
									local751 = local558 * this.aClass126_Sub3_21.aFloatArray65[2] + this.aClass126_Sub3_21.aFloatArray65[0] * local554 + local556 * this.aClass126_Sub3_21.aFloatArray65[1];
									local751 = (local751 > 0.0F ? this.aClass126_Sub3_21.aFloat156 : this.aClass126_Sub3_21.aFloat159) * local751 + this.aClass126_Sub3_21.aFloat163;
								}
							}
							@Pc(834) Class5 local834 = null;
							if ((this.anInt6424 - 1 & local478) == 0 && (local488 & this.anInt6424 - 1) == 0) {
								local834 = local186.method1599(local532);
							}
							@Pc(1198) int local1198;
							@Pc(890) int local890;
							if (local834 == null) {
								if (local506 == local502) {
									local890 = local544;
								} else {
									@Pc(870) int local870 = local552 * (local506 & 0x7F) >> 7;
									if (local870 < 2) {
										local870 = 2;
									} else if (local870 > 126) {
										local870 = 126;
									}
									local890 = Static643.anIntArray836[local870 | local506 & 0xFF80];
									if ((this.anInt6423 & 0x7) == 0) {
										@Pc(921) float local921 = this.aClass126_Sub3_21.aFloatArray65[0] * local554 + local556 * this.aClass126_Sub3_21.aFloatArray65[1] + this.aClass126_Sub3_21.aFloatArray65[2] * local558;
										local652 = (local751 > 0.0F ? this.aClass126_Sub3_21.aFloat156 : this.aClass126_Sub3_21.aFloat159) * local751 + this.aClass126_Sub3_21.aFloat163;
										@Pc(946) int local946 = local890 >> 16 & 0xFF;
										@Pc(952) int local952 = local890 >> 8 & 0xFF;
										@Pc(956) int local956 = local890 & 0xFF;
										local946 = (int) ((float) local946 * local652);
										if (local946 < 0) {
											local946 = 0;
										} else if (local946 > 255) {
											local946 = 255;
										}
										local952 = (int) ((float) local952 * local652);
										local956 = (int) ((float) local956 * local652);
										if (local952 < 0) {
											local952 = 0;
										} else if (local952 > 255) {
											local952 = 255;
										}
										if (local956 < 0) {
											local956 = 0;
										} else if (local956 > 255) {
											local956 = 255;
										}
										local890 = local956 | local952 << 8 | local946 << 16;
									}
								}
								if (this.aClass126_Sub3_21.aBoolean674) {
									local165.a((float) local478);
									local165.a((float) (this.method8447(local478, local488) + local514));
									local165.a((float) local488);
									local165.f((byte) (local890 >> 16));
									local165.f((byte) (local890 >> 8));
									local165.f((byte) local890);
									local165.f(-1);
									local165.a((float) local478);
									local165.a((float) local488);
									if (this.anIntArrayArrayArray7 != null) {
										local165.a((float) (local268 == null ? 0 : local268[local428] - 1));
									}
									if ((this.anInt6423 & 0x7) != 0) {
										local165.a(local554);
										local165.a(local556);
										local165.a(local558);
									}
								} else {
									local165.b((float) local478);
									local165.b((float) (local514 + this.method8447(local478, local488)));
									local165.b((float) local488);
									local165.f((byte) (local890 >> 16));
									local165.f((byte) (local890 >> 8));
									local165.f((byte) local890);
									local165.f(-1);
									local165.b((float) local478);
									local165.b((float) local488);
									if (this.anIntArrayArrayArray7 != null) {
										local165.b((float) (local268 == null ? 0 : local268[local428] - 1));
									}
									if ((this.anInt6423 & 0x7) != 0) {
										local165.b(local554);
										local165.b(local556);
										local165.b(local558);
									}
								}
								local1198 = this.anInt6419++;
								local465[local428] = (short) local1198;
								if (local502 != -1) {
									local169[local1198] = local212[local428];
								}
								local186.method1607(new Class5_Sub6(local465[local428]), local532);
							} else {
								local465[local428] = ((Class5_Sub6) local834).aShort17;
								local1198 = local465[local428] & 0xFFFF;
								if (local502 != -1 && local212[local428].aLong282 < local169[local1198].aLong282) {
									local169[local1198] = local212[local428];
								}
							}
							for (local890 = 0; local890 < local418; local890++) {
								local190[local890].method436(local1198, local552, local751, local544);
							}
							this.anInt6422++;
						}
					}
				}
			}
			for (local196 = 0; local196 < this.anInt6419; local196++) {
				@Pc(1314) Class5_Sub3 local1314 = local169[local196];
				if (local1314 != null) {
					local1314.method438(local196);
				}
			}
			@Pc(1347) int local1347;
			for (@Pc(1327) int local1327 = 0; super.anInt9920 > local1327; local1327++) {
				for (@Pc(1331) int local1331 = 0; local1331 < super.anInt9923; local1331++) {
					@Pc(1343) short[] local1343 = this.aShortArrayArray10[local1327 + super.anInt9920 * local1331];
					if (local1343 != null) {
						local1347 = 0;
						@Pc(1349) int local1349 = 0;
						while (local1343.length > local1349) {
							@Pc(1358) int local1358 = local1343[local1349++] & 0xFFFF;
							@Pc(1365) int local1365 = local1343[local1349++] & 0xFFFF;
							@Pc(1372) int local1372 = local1343[local1349++] & 0xFFFF;
							@Pc(1376) Class5_Sub3 local1376 = local169[local1358];
							@Pc(1380) Class5_Sub3 local1380 = local169[local1365];
							@Pc(1384) Class5_Sub3 local1384 = local169[local1372];
							@Pc(1386) Class5_Sub3 local1386 = null;
							if (local1376 != null) {
								local1386 = local1376;
								local1376.method430(local1331, local1347, local1327);
							}
							if (local1380 != null) {
								local1380.method430(local1331, local1347, local1327);
								if (local1386 == null || local1386.aLong282 > local1380.aLong282) {
									local1386 = local1380;
								}
							}
							if (local1384 != null) {
								local1384.method430(local1331, local1347, local1327);
								if (local1386 == null || local1386.aLong282 > local1384.aLong282) {
									local1386 = local1384;
								}
							}
							if (local1386 != null) {
								if (local1376 != null) {
									local1386.method438(local1358);
								}
								if (local1380 != null) {
									local1386.method438(local1365);
								}
								if (local1384 != null) {
									local1386.method438(local1372);
								}
								local1386.method430(local1331, local1347, local1327);
							}
							local1347++;
						}
					}
				}
			}
			local165.a();
			this.anInterface7_3 = this.aClass126_Sub3_21.method7129(local137, local160, local165.c());
			this.aClass159_8 = new Class159(this.anInterface7_3, 5126, 3, 0);
			this.aClass159_7 = new Class159(this.anInterface7_3, 5121, 4, 12);
			@Pc(1529) byte local1529;
			if (this.anIntArrayArrayArray7 == null) {
				local1529 = 24;
				this.aClass159_6 = new Class159(this.anInterface7_3, 5126, 2, 16);
			} else {
				this.aClass159_6 = new Class159(this.anInterface7_3, 5126, 3, 16);
				local1529 = 28;
			}
			if ((this.anInt6423 & 0x7) != 0) {
				this.aClass159_5 = new Class159(this.anInterface7_3, 5126, 3, local1529);
			}
			@Pc(1563) long[] local1563 = new long[this.aClass5_Sub3Array1.length];
			for (local1347 = 0; local1347 < this.aClass5_Sub3Array1.length; local1347++) {
				@Pc(1572) Class5_Sub3 local1572 = this.aClass5_Sub3Array1[local1347];
				local1563[local1347] = local1572.aLong282;
				local1572.method433(this.anInt6419);
			}
			Static593.method8309(local1563, this.aClass5_Sub3Array1);
			if (this.aClass174_1 != null) {
				this.aClass174_1.method4036();
			}
		}
		this.anIntArrayArrayArray8 = null;
		this.anIntArrayArrayArray5 = this.anIntArrayArrayArray4 = null;
		this.aFloatArrayArray6 = this.aFloatArrayArray5 = this.aFloatArrayArray7 = null;
		this.aClass5_Sub3ArrayArrayArray1 = null;
		this.anIntArrayArrayArray7 = null;
		this.anIntArrayArrayArray9 = null;
		this.aByteArrayArray12 = null;
		this.anIntArrayArrayArray6 = null;
		this.aClass81_47 = null;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method8439(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt6426 <= 0) {
			return;
		}
		this.aClass126_Sub3_21.method7108();
		this.aClass126_Sub3_21.method7123(false);
		this.aClass126_Sub3_21.method7102(false);
		this.aClass126_Sub3_21.method7137(false);
		this.aClass126_Sub3_21.method7094(false);
		this.aClass126_Sub3_21.method7109(0);
		this.aClass126_Sub3_21.method7106(-2);
		this.aClass126_Sub3_21.method7113((Class24) null);
		Static552.aFloatArray70[13] = 1.0F - ((float) (arg3 * 1024) / 128.0F + (float) 0) / (float) this.aClass126_Sub3_21.anInt8084;
		Static552.aFloatArray70[2] = 0.0F;
		Static552.aFloatArray70[0] = (float) 1024 / ((float) this.aClass126_Sub3_21.anInt8178 * 128.0F * (float) super.anInt9918);
		Static552.aFloatArray70[1] = 0.0F;
		Static552.aFloatArray70[15] = 1.0F;
		Static552.aFloatArray70[7] = 0.0F;
		Static552.aFloatArray70[12] = -1.0F - ((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass126_Sub3_21.anInt8178;
		Static552.aFloatArray70[8] = 0.0F;
		Static552.aFloatArray70[9] = 0.0F;
		Static552.aFloatArray70[4] = 0.0F;
		Static552.aFloatArray70[14] = 0.0F;
		Static552.aFloatArray70[11] = 0.0F;
		Static552.aFloatArray70[10] = 0.0F;
		Static552.aFloatArray70[6] = 0.0F;
		Static552.aFloatArray70[5] = (float) 1024 / ((float) super.anInt9918 * 128.0F * (float) this.aClass126_Sub3_21.anInt8084);
		Static552.aFloatArray70[3] = 0.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static552.aFloatArray70, 0);
		Static552.aFloatArray70[13] = 0.0F;
		Static552.aFloatArray70[14] = 0.0F;
		Static552.aFloatArray70[7] = 0.0F;
		Static552.aFloatArray70[8] = 0.0F;
		Static552.aFloatArray70[9] = 1.0F;
		Static552.aFloatArray70[12] = 0.0F;
		Static552.aFloatArray70[6] = 1.0F;
		Static552.aFloatArray70[3] = 0.0F;
		Static552.aFloatArray70[0] = 1.0F;
		Static552.aFloatArray70[2] = 0.0F;
		Static552.aFloatArray70[11] = 0.0F;
		Static552.aFloatArray70[10] = 0.0F;
		Static552.aFloatArray70[15] = 1.0F;
		Static552.aFloatArray70[4] = 0.0F;
		Static552.aFloatArray70[1] = 0.0F;
		Static552.aFloatArray70[5] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static552.aFloatArray70, 0);
		if ((this.anInt6423 & 0x7) == 0) {
			this.aClass126_Sub3_21.method7102(false);
		} else {
			this.aClass126_Sub3_21.method7102(true);
			this.aClass126_Sub3_21.method7079();
		}
		this.aClass126_Sub3_21.method7067(this.aClass159_6, this.aClass159_8, this.aClass159_5, this.aClass159_7);
		if (this.anInt6422 * 2 <= this.aClass126_Sub3_21.aClass5_Sub12_Sub1_2.aByteArray104.length) {
			this.aClass126_Sub3_21.aClass5_Sub12_Sub1_2.anInt10154 = 0;
		} else {
			this.aClass126_Sub3_21.aClass5_Sub12_Sub1_2 = new Class5_Sub12_Sub1(this.anInt6422 * 2);
		}
		@Pc(313) int local313 = 0;
		@Pc(317) Class5_Sub12_Sub1 local317 = this.aClass126_Sub3_21.aClass5_Sub12_Sub1_2;
		@Pc(323) int local323;
		@Pc(333) int local333;
		@Pc(335) int local335;
		@Pc(354) short[] local354;
		@Pc(358) int local358;
		if (this.aClass126_Sub3_21.aBoolean674) {
			for (local323 = arg1; local323 < arg3; local323++) {
				local333 = arg0 + local323 * super.anInt9920;
				for (local335 = arg0; local335 < arg2; local335++) {
					if (arg4[local335 - arg0][local323 - arg1]) {
						local354 = this.aShortArrayArray10[local333];
						if (local354 != null) {
							for (local358 = 0; local358 < local354.length; local358++) {
								local313++;
								local317.method8655(local354[local358] & 0xFFFF);
							}
						}
					}
					local333++;
				}
			}
		} else {
			for (local323 = arg1; local323 < arg3; local323++) {
				local333 = super.anInt9920 * local323 + arg0;
				for (local335 = arg0; local335 < arg2; local335++) {
					if (arg4[local335 - arg0][local323 - arg1]) {
						local354 = this.aShortArrayArray10[local333];
						if (local354 != null) {
							for (local358 = 0; local358 < local354.length; local358++) {
								local317.method8643(local354[local358] & 0xFFFF);
								local313++;
							}
						}
					}
					local333++;
				}
			}
		}
		if (local313 > 0) {
			@Pc(474) Class215_Sub2 local474 = new Class215_Sub2(this.aClass126_Sub3_21, 5123, local317.aByteArray104, local317.anInt10154);
			this.aClass126_Sub3_21.method7121(local474, 0, local313);
		}
	}

	@OriginalMember(owner = "client!mu", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class5_Sub4_Sub10 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub4_Sub10 arg2) {
		if ((this.aByteArrayArray11[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(21) int local21 = super.anInt9918 >> this.aClass126_Sub3_21.anInt8271;
		@Pc(24) Class5_Sub4_Sub10_Sub1 local24 = (Class5_Sub4_Sub10_Sub1) arg2;
		@Pc(34) Class5_Sub4_Sub10_Sub1 local34;
		if (local24 != null && local24.method3390(local21, local21)) {
			local34 = local24;
			local24.method3388();
		} else {
			local34 = new Class5_Sub4_Sub10_Sub1(this.aClass126_Sub3_21, local21, local21);
		}
		local34.method3389(local21, 0, local21, 0);
		this.method5681(local34, arg1, arg0);
		return local34;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lclient!tn;[I)V")
	@Override
	public void method8438(@OriginalArg(0) Class5_Sub27 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass306_31.method7303(new Class5_Sub47(this.aClass126_Sub3_21, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(ZZII[[ZIII)V")
	private void method5680(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (this.aClass5_Sub3Array1 == null) {
			return;
		}
		@Pc(15) int local15 = arg4 + arg4 + 1;
		@Pc(19) int local19 = local15 * local15;
		if (this.aClass126_Sub3_21.anIntArray650.length < local19) {
			this.aClass126_Sub3_21.anIntArray650 = new int[local19];
		}
		if (this.aClass126_Sub3_21.aClass5_Sub12_Sub1_2.aByteArray104.length < this.anInt6422 * 2) {
			this.aClass126_Sub3_21.aClass5_Sub12_Sub1_2 = new Class5_Sub12_Sub1(this.anInt6422 * 2);
		}
		@Pc(62) int local62 = arg6 - arg4;
		@Pc(64) int local64 = local62;
		if (local62 < 0) {
			local62 = 0;
		}
		@Pc(76) int local76 = arg2 - arg4;
		@Pc(78) int local78 = local76;
		if (local76 < 0) {
			local76 = 0;
		}
		@Pc(86) int local86 = arg4 + arg6;
		if (local86 > super.anInt9920 - 1) {
			local86 = super.anInt9920 - 1;
		}
		@Pc(106) int local106 = arg2 + arg4;
		if (local106 > super.anInt9923 - 1) {
			local106 = super.anInt9923 - 1;
		}
		@Pc(119) int local119 = 0;
		@Pc(123) int[] local123 = this.aClass126_Sub3_21.anIntArray650;
		@Pc(135) int local135;
		for (@Pc(125) int local125 = local62; local125 <= local86; local125++) {
			@Pc(133) boolean[] local133 = arg3[local125 - local64];
			for (local135 = local76; local135 <= local106; local135++) {
				if (local133[local135 - local78]) {
					local123[local119++] = local125 + local135 * super.anInt9920;
				}
			}
		}
		if (arg1 == -1) {
			this.aClass126_Sub3_21.method7087();
		} else {
			this.aClass126_Sub3_21.method7091((float) arg1);
			this.aClass126_Sub3_21.method7078();
		}
		this.aClass126_Sub3_21.method7102((this.anInt6423 & 0x7) != 0);
		for (@Pc(198) int local198 = 0; local198 < this.aClass5_Sub3Array1.length; local198++) {
			this.aClass5_Sub3Array1[local198].method431(local119, local123);
		}
		if (!this.aClass306_31.method7309()) {
			local135 = this.aClass126_Sub3_21.anInt8296;
			@Pc(231) int local231 = this.aClass126_Sub3_21.anInt8308;
			this.aClass126_Sub3_21.L(0, local231, this.aClass126_Sub3_21.anInt8299);
			this.aClass126_Sub3_21.method7102(false);
			this.aClass126_Sub3_21.method7094(false);
			this.aClass126_Sub3_21.method7109(128);
			this.aClass126_Sub3_21.method7106(-2);
			this.aClass126_Sub3_21.method7113(this.aClass126_Sub3_21.aClass24_Sub4_2);
			this.aClass126_Sub3_21.method7082(7681, 8448);
			this.aClass126_Sub3_21.method7135(770, 34166, 0);
			this.aClass126_Sub3_21.method7073(0, 34167);
			for (@Pc(291) Class5 local291 = this.aClass306_31.method7313(); local291 != null; local291 = this.aClass306_31.method7301()) {
				@Pc(296) Class5_Sub47 local296 = (Class5_Sub47) local291;
				local296.method8307(arg4, arg2, arg6, arg3);
			}
			this.aClass126_Sub3_21.method7135(768, 5890, 0);
			this.aClass126_Sub3_21.method7073(0, 5890);
			this.aClass126_Sub3_21.method7113((Class24) null);
			this.aClass126_Sub3_21.L(local135, local231, this.aClass126_Sub3_21.anInt8299);
		}
		if (this.aClass174_1 == null) {
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		this.aClass126_Sub3_21.method7067(this.aClass159_6, this.aClass159_8, (Class159) null, (Class159) null);
		this.aClass174_1.method4037(arg3, arg4, arg0, arg2, arg6);
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!mu", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray12[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray12[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method8440(@OriginalArg(0) Class5_Sub4_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass174_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (arg2 * this.aClass126_Sub3_21.anInt8291 >> 8) >> this.aClass126_Sub3_21.anInt8271;
			@Pc(40) int local40 = arg3 - (arg2 * this.aClass126_Sub3_21.anInt8315 >> 8) >> this.aClass126_Sub3_21.anInt8271;
			return this.aClass174_1.method4034(local25, local40, arg0);
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(II)V")
	@Override
	public void method8445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!mu", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		@Pc(9) Interface8 local9 = this.aClass126_Sub3_21.anInterface8_10;
		if (arg3 != null && this.anIntArrayArrayArray8 == null) {
			this.anIntArrayArrayArray8 = new int[super.anInt9920][super.anInt9923][];
		}
		if (arg5 != null && this.anIntArrayArrayArray7 == null) {
			this.anIntArrayArrayArray7 = new int[super.anInt9920][super.anInt9923][];
		}
		this.anIntArrayArrayArray5[arg0][arg1] = arg2;
		this.anIntArrayArrayArray4[arg0][arg1] = arg4;
		this.anIntArrayArrayArray6[arg0][arg1] = arg6;
		this.anIntArrayArrayArray9[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray7 != null) {
			this.anIntArrayArrayArray7[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray8 != null) {
			this.anIntArrayArrayArray8[arg0][arg1] = arg3;
		}
		@Pc(92) Class5_Sub3[] local92 = this.aClass5_Sub3ArrayArrayArray1[arg0][arg1] = new Class5_Sub3[arg6.length];
		for (@Pc(94) int local94 = 0; local94 < arg6.length; local94++) {
			@Pc(100) int local100 = arg8[local94];
			@Pc(104) int local104 = arg9[local94];
			if ((this.anInt6423 & 0x20) != 0 && local100 != -1 && local9.method7813(local100).aBoolean724) {
				local104 = 128;
				local100 = -1;
			}
			@Pc(149) long local149 = (long) (local104 << 14) | (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42 | (long) local100;
			@Pc(155) Class5 local155;
			for (local155 = this.aClass81_47.method1599(local149); local155 != null; local155 = this.aClass81_47.method1605()) {
				@Pc(160) Class5_Sub3 local160 = (Class5_Sub3) local155;
				if (local160.anInt392 == local100 && local160.aFloat6 == (float) local104 && arg10 == local160.anInt391 && local160.anInt384 == arg11 && local160.anInt390 == arg12) {
					break;
				}
			}
			if (local155 == null) {
				local92[local94] = new Class5_Sub3(this, local100, local104, arg10, arg11, arg12);
				this.aClass81_47.method1607(local92[local94], local149);
			} else {
				local92[local94] = (Class5_Sub3) local155;
			}
		}
		if (arg13) {
			this.aByteArrayArray11[arg0][arg1] = (byte) (this.aByteArrayArray11[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt6425) {
			this.anInt6425 = arg6.length;
		}
		this.anInt6426 += arg6.length;
	}

	@OriginalMember(owner = "client!mu", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class5_Sub4_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass174_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass126_Sub3_21.anInt8291 >> 8) >> this.aClass126_Sub3_21.anInt8271;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass126_Sub3_21.anInt8315 >> 8) >> this.aClass126_Sub3_21.anInt8271;
			this.aClass174_1.method4035(arg0, local24, local39);
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method8446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method5680(arg4, -1, arg1, arg3, arg2, arg5, arg0);
	}

	@OriginalMember(owner = "client!mu", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class5_Sub4_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass174_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass126_Sub3_21.anInt8291 >> 8) >> this.aClass126_Sub3_21.anInt8271;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass126_Sub3_21.anInt8315 >> 8) >> this.aClass126_Sub3_21.anInt8271;
			this.aClass174_1.method4033(arg0, local39, local24);
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lclient!hs;III)V")
	private void method5681(@OriginalArg(0) Class5_Sub4_Sub10_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray5[arg2][arg1];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray4[arg2][arg1];
		@Pc(22) int local22 = local12.length;
		if (this.aClass126_Sub3_21.anIntArray651.length < local22) {
			this.aClass126_Sub3_21.anIntArray649 = new int[local22];
			this.aClass126_Sub3_21.anIntArray651 = new int[local22];
		}
		@Pc(46) int[] local46 = this.aClass126_Sub3_21.anIntArray651;
		@Pc(50) int[] local50 = this.aClass126_Sub3_21.anIntArray649;
		for (@Pc(74) int local74 = 0; local74 < local22; local74++) {
			local46[local74] = local12[local74] >> this.aClass126_Sub3_21.anInt8271;
			local50[local74] = local19[local74] >> this.aClass126_Sub3_21.anInt8271;
		}
		@Pc(106) int local106 = 0;
		while (local22 > local106) {
			@Pc(112) int local112 = local46[local106];
			@Pc(117) int local117 = local50[local106++];
			@Pc(121) int local121 = local46[local106];
			@Pc(126) int local126 = local50[local106++];
			@Pc(130) int local130 = local46[local106];
			@Pc(135) int local135 = local50[local106++];
			if ((local112 - local121) * (local126 - local135) - (local126 - local117) * (local130 - local121) > 0) {
				arg0.method3387(local121, local117, local112, local135, local130, local126);
			}
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method8437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method8441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method5680(arg4, arg5, arg1, arg3, arg2, arg6, arg0);
	}
}
