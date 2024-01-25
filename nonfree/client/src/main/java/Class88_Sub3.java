import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wr")
public final class Class88_Sub3 extends Class88 {

	@OriginalMember(owner = "client!wr", name = "n", descriptor = "I")
	private int anInt10549;

	@OriginalMember(owner = "client!wr", name = "s", descriptor = "I")
	private int anInt10552;

	@OriginalMember(owner = "client!wr", name = "S", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray19;

	@OriginalMember(owner = "client!wr", name = "X", descriptor = "Lclient!ic;")
	private Interface8 anInterface8_6;

	@OriginalMember(owner = "client!wr", name = "Z", descriptor = "I")
	private int anInt10570;

	@OriginalMember(owner = "client!wr", name = "bb", descriptor = "Lclient!kb;")
	private Class194 aClass194_9;

	@OriginalMember(owner = "client!wr", name = "db", descriptor = "Lclient!kb;")
	public Class194 aClass194_10;

	@OriginalMember(owner = "client!wr", name = "fb", descriptor = "Lclient!kb;")
	public Class194 aClass194_11;

	@OriginalMember(owner = "client!wr", name = "gb", descriptor = "I")
	private int anInt10571;

	@OriginalMember(owner = "client!wr", name = "ib", descriptor = "Lclient!kb;")
	public Class194 aClass194_12;

	@OriginalMember(owner = "client!wr", name = "jb", descriptor = "[Lclient!cfa;")
	private Class5_Sub12[] aClass5_Sub12Array1;

	@OriginalMember(owner = "client!wr", name = "m", descriptor = "Lclient!ga;")
	private final Class124 aClass124_107 = new Class124();

	@OriginalMember(owner = "client!wr", name = "N", descriptor = "Lclient!kv;")
	public final Class143_Sub2 aClass143_Sub2_42;

	@OriginalMember(owner = "client!wr", name = "q", descriptor = "I")
	private final int anInt10551;

	@OriginalMember(owner = "client!wr", name = "W", descriptor = "[[S")
	public final short[][] aShortArrayArray18;

	@OriginalMember(owner = "client!wr", name = "V", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray20;

	@OriginalMember(owner = "client!wr", name = "hb", descriptor = "[[F")
	private float[][] aFloatArrayArray18;

	@OriginalMember(owner = "client!wr", name = "J", descriptor = "[[B")
	private final byte[][] aByteArrayArray25;

	@OriginalMember(owner = "client!wr", name = "cb", descriptor = "[[F")
	private float[][] aFloatArrayArray17;

	@OriginalMember(owner = "client!wr", name = "K", descriptor = "[[[Lclient!cfa;")
	private Class5_Sub12[][][] aClass5_Sub12ArrayArrayArray1;

	@OriginalMember(owner = "client!wr", name = "o", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!wr", name = "T", descriptor = "I")
	public final int anInt10568;

	@OriginalMember(owner = "client!wr", name = "C", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray18;

	@OriginalMember(owner = "client!wr", name = "u", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray17;

	@OriginalMember(owner = "client!wr", name = "t", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!wr", name = "l", descriptor = "I")
	private final int anInt10548;

	@OriginalMember(owner = "client!wr", name = "ab", descriptor = "[[F")
	private float[][] aFloatArrayArray16;

	@OriginalMember(owner = "client!wr", name = "eb", descriptor = "[[B")
	private byte[][] aByteArrayArray26;

	@OriginalMember(owner = "client!wr", name = "Y", descriptor = "Lclient!tga;")
	private Class335 aClass335_48;

	@OriginalMember(owner = "client!wr", name = "r", descriptor = "Lclient!at;")
	private Class22 aClass22_2;

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Lclient!kv;IIII[[I[[II)V")
	public Class88_Sub3(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass143_Sub2_42 = arg0;
		this.anInt10551 = super.anInt10547 - 2;
		this.aShortArrayArray18 = new short[arg4 * arg3][];
		this.anIntArrayArrayArray20 = new int[arg3][arg4][];
		this.aFloatArrayArray18 = new float[super.anInt10541 + 1][super.anInt10545 + 1];
		this.aByteArrayArray25 = new byte[arg3][arg4];
		this.aFloatArrayArray17 = new float[super.anInt10541 + 1][super.anInt10545 + 1];
		this.aClass5_Sub12ArrayArrayArray1 = new Class5_Sub12[arg3][arg4][];
		this.anIntArrayArrayArray15 = new int[arg3][arg4][];
		this.anInt10568 = arg2;
		this.anIntArrayArrayArray18 = new int[arg3][arg4][];
		this.anIntArrayArrayArray17 = new int[arg3][arg4][];
		this.anIntArrayArrayArray16 = new int[arg3][arg4][];
		this.anInt10548 = 0x1 << this.anInt10551;
		this.aFloatArrayArray16 = new float[super.anInt10541 + 1][super.anInt10545 + 1];
		this.aByteArrayArray26 = new byte[arg3 + 1][arg4 + 1];
		for (@Pc(115) int local115 = 1; local115 < super.anInt10545; local115++) {
			for (@Pc(119) int local119 = 1; local119 < super.anInt10541; local119++) {
				@Pc(137) int local137 = arg6[local119 + 1][local115] - arg6[local119 - 1][local115];
				@Pc(154) int local154 = arg6[local119][local115 + 1] - arg6[local119][local115 - 1];
				@Pc(174) float local174 = (float) (1.0D / Math.sqrt((double) (local154 * local154 + local137 * local137 + arg7 * 4 * arg7)));
				this.aFloatArrayArray18[local119][local115] = local174 * (float) local137;
				this.aFloatArrayArray17[local119][local115] = local174 * (float) (-arg7 * 2);
				this.aFloatArrayArray16[local119][local115] = (float) local154 * local174;
			}
		}
		this.aClass335_48 = new Class335(128);
		if ((this.anInt10568 & 0x10) != 0) {
			this.aClass22_2 = new Class22(this.aClass143_Sub2_42, this);
		}
	}

	@OriginalMember(owner = "client!wr", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.anInt10570 <= 0) {
			this.aClass22_2 = null;
		} else {
			@Pc(19) byte[][] local19 = new byte[super.anInt10541 + 1][super.anInt10545 + 1];
			@Pc(25) int local25;
			for (@Pc(21) int local21 = 1; super.anInt10541 > local21; local21++) {
				for (local25 = 1; super.anInt10545 > local25; local25++) {
					local19[local21][local25] = (byte) ((this.aByteArrayArray26[local21][local25] >> 1) + (this.aByteArrayArray26[local21][local25 - 1] >> 2) + (this.aByteArrayArray26[local21 + -1][local25] >> 2) + (this.aByteArrayArray26[local21 + 1][local25] >> 3) + (this.aByteArrayArray26[local21][local25 + 1] >> 3));
				}
			}
			this.aClass5_Sub12Array1 = new Class5_Sub12[this.aClass335_48.method7767()];
			this.aClass335_48.method7771(this.aClass5_Sub12Array1);
			for (local25 = 0; local25 < this.aClass5_Sub12Array1.length; local25++) {
				this.aClass5_Sub12Array1[local25].method1043(this.anInt10570);
			}
			@Pc(133) int local133 = 24;
			if (this.anIntArrayArrayArray19 != null) {
				local133 += 4;
			}
			if ((this.anInt10568 & 0x7) != 0) {
				local133 += 12;
			}
			@Pc(156) NativeHeapBuffer local156 = this.aClass143_Sub2_42.aNativeHeap4.a(local133 * this.anInt10570, false);
			@Pc(161) Stream local161 = new Stream(local156);
			@Pc(165) Class5_Sub12[] local165 = new Class5_Sub12[this.anInt10570];
			@Pc(172) int local172 = Static630.method8378(this.anInt10570 / 4);
			if (local172 < 1) {
				local172 = 1;
			}
			@Pc(184) Class335 local184 = new Class335(local172);
			@Pc(188) Class5_Sub12[] local188 = new Class5_Sub12[this.anInt10571];
			@Pc(194) int local194;
			for (@Pc(190) int local190 = 0; super.anInt10541 > local190; local190++) {
				for (local194 = 0; super.anInt10545 > local194; local194++) {
					if (this.anIntArrayArrayArray16[local190][local194] != null) {
						@Pc(210) Class5_Sub12[] local210 = this.aClass5_Sub12ArrayArrayArray1[local190][local194];
						@Pc(217) int[] local217 = this.anIntArrayArrayArray18[local190][local194];
						@Pc(224) int[] local224 = this.anIntArrayArrayArray17[local190][local194];
						@Pc(231) int[] local231 = this.anIntArrayArrayArray20[local190][local194];
						@Pc(238) int[] local238 = this.anIntArrayArrayArray16[local190][local194];
						@Pc(250) int[] local250 = this.anIntArrayArrayArray15 == null ? null : this.anIntArrayArrayArray15[local190][local194];
						@Pc(262) int[] local262 = this.anIntArrayArrayArray19 == null ? null : this.anIntArrayArrayArray19[local190][local194];
						if (local231 == null) {
							local231 = local238;
						}
						@Pc(273) float local273 = this.aFloatArrayArray18[local190][local194];
						@Pc(280) float local280 = this.aFloatArrayArray17[local190][local194];
						@Pc(287) float local287 = this.aFloatArrayArray16[local190][local194];
						@Pc(296) float local296 = this.aFloatArrayArray18[local190][local194 + 1];
						@Pc(305) float local305 = this.aFloatArrayArray17[local190][local194 + 1];
						@Pc(314) float local314 = this.aFloatArrayArray16[local190][local194 + 1];
						@Pc(325) float local325 = this.aFloatArrayArray18[local190 + 1][local194 + 1];
						@Pc(336) float local336 = this.aFloatArrayArray17[local190 + 1][local194 + 1];
						@Pc(347) float local347 = this.aFloatArrayArray16[local190 + 1][local194 + 1];
						@Pc(356) float local356 = this.aFloatArrayArray18[local190 + 1][local194];
						@Pc(365) float local365 = this.aFloatArrayArray17[local190 + 1][local194];
						@Pc(374) float local374 = this.aFloatArrayArray16[local190 + 1][local194];
						@Pc(382) int local382 = local19[local190][local194] & 0xFF;
						@Pc(392) int local392 = local19[local190][local194 + 1] & 0xFF;
						@Pc(404) int local404 = local19[local190 + 1][local194 + 1] & 0xFF;
						@Pc(414) int local414 = local19[local190 + 1][local194] & 0xFF;
						@Pc(416) int local416 = 0;
						@Pc(426) int local426;
						label337: for (@Pc(418) int local418 = 0; local418 < local238.length; local418++) {
							@Pc(424) Class5_Sub12 local424 = local210[local418];
							for (local426 = 0; local426 < local416; local426++) {
								if (local188[local426] == local424) {
									continue label337;
								}
							}
							local188[local416++] = local424;
						}
						@Pc(463) short[] local463 = this.aShortArrayArray18[super.anInt10541 * local194 + local190] = new short[local238.length];
						for (local426 = 0; local426 < local238.length; local426++) {
							@Pc(477) int local477 = (local190 << super.anInt10547) + local217[local426];
							@Pc(486) int local486 = (local194 << super.anInt10547) + local224[local426];
							@Pc(491) int local491 = local477 >> this.anInt10551;
							@Pc(496) int local496 = local486 >> this.anInt10551;
							@Pc(500) int local500 = local238[local426];
							@Pc(504) int local504 = local231[local426];
							@Pc(512) int local512 = local250 == null ? 0 : local250[local426];
							@Pc(530) long local530 = (long) local504 << 48 | (long) local500 << 32 | (long) (local491 << 16) | (long) local496;
							@Pc(534) int local534 = local217[local426];
							@Pc(538) int local538 = local224[local426];
							@Pc(540) byte local540 = 74;
							@Pc(542) int local542 = 0;
							@Pc(544) float local544 = 1.0F;
							@Pc(561) float local561;
							@Pc(559) float local559;
							@Pc(553) float local553;
							@Pc(638) float local638;
							@Pc(557) int local557;
							if (local534 == 0 && local538 == 0) {
								local553 = local287;
								local557 = local540 - local382;
								local559 = local280;
								local561 = local273;
							} else if (local534 == 0 && local538 == super.anInt10540) {
								local561 = local296;
								local557 = local540 - local392;
								local553 = local314;
								local559 = local305;
							} else if (super.anInt10540 == local534 && local538 == super.anInt10540) {
								local553 = local347;
								local561 = local325;
								local559 = local336;
								local557 = local540 - local404;
							} else if (super.anInt10540 == local534 && local538 == 0) {
								local561 = local356;
								local557 = local540 - local414;
								local559 = local365;
								local553 = local374;
							} else {
								@Pc(614) float local614 = (float) local534 / (float) super.anInt10540;
								@Pc(621) float local621 = (float) local538 / (float) super.anInt10540;
								@Pc(629) float local629 = local273 + (local356 - local273) * local614;
								local638 = local280 + local614 * (local365 - local280);
								@Pc(646) float local646 = local287 + (local374 - local287) * local614;
								@Pc(655) float local655 = local296 + local614 * (local325 - local296);
								@Pc(663) float local663 = local614 * (local336 - local305) + local305;
								@Pc(672) float local672 = local314 + local614 * (local347 - local314);
								local561 = (local655 - local629) * local621 + local629;
								local559 = local638 + (local663 - local638) * local621;
								local553 = (local672 - local646) * local621 + local646;
								@Pc(710) int local710 = local382 + ((local414 - local382) * local534 >> super.anInt10547);
								@Pc(722) int local722 = ((local404 - local392) * local534 >> super.anInt10547) + local392;
								local557 = local540 - ((local722 - local710) * local538 >> super.anInt10547) - local710;
							}
							if (local500 != -1) {
								@Pc(759) int local759 = local557 * (local500 & 0x7F) >> 7;
								if (local759 < 2) {
									local759 = 2;
								} else if (local759 > 126) {
									local759 = 126;
								}
								if ((this.anInt10568 & 0x7) == 0) {
									local544 = local553 * this.aClass143_Sub2_42.aFloatArray40[2] + local559 * this.aClass143_Sub2_42.aFloatArray40[1] + local561 * this.aClass143_Sub2_42.aFloatArray40[0];
									local544 = local544 * (local544 > 0.0F ? this.aClass143_Sub2_42.aFloat97 : this.aClass143_Sub2_42.aFloat108) + this.aClass143_Sub2_42.aFloat105;
								}
								local542 = Static6.anIntArray6[local500 & 0xFF80 | local759];
							}
							@Pc(828) Class5 local828 = null;
							if ((this.anInt10548 - 1 & local477) == 0 && (this.anInt10548 - 1 & local486) == 0) {
								local828 = local184.method7766(local530);
							}
							@Pc(1186) int local1186;
							@Pc(858) int local858;
							if (local828 == null) {
								if (local504 == local500) {
									local858 = local542;
								} else {
									@Pc(868) int local868 = (local504 & 0x7F) * local557 >> 7;
									if (local868 < 2) {
										local868 = 2;
									} else if (local868 > 126) {
										local868 = 126;
									}
									local858 = Static6.anIntArray6[local504 & 0xFF80 | local868];
									if ((this.anInt10568 & 0x7) == 0) {
										local638 = this.aClass143_Sub2_42.aFloatArray40[2] * local553 + this.aClass143_Sub2_42.aFloatArray40[1] * local559 + local561 * this.aClass143_Sub2_42.aFloatArray40[0];
										local638 = this.aClass143_Sub2_42.aFloat105 + local544 * (local544 > 0.0F ? this.aClass143_Sub2_42.aFloat97 : this.aClass143_Sub2_42.aFloat108);
										@Pc(943) int local943 = local858 >> 16 & 0xFF;
										@Pc(949) int local949 = local858 >> 8 & 0xFF;
										local943 = (int) ((float) local943 * local638);
										@Pc(959) int local959 = local858 & 0xFF;
										local949 = (int) ((float) local949 * local638);
										if (local943 < 0) {
											local943 = 0;
										} else if (local943 > 255) {
											local943 = 255;
										}
										local959 = (int) ((float) local959 * local638);
										if (local949 < 0) {
											local949 = 0;
										} else if (local949 > 255) {
											local949 = 255;
										}
										if (local959 < 0) {
											local959 = 0;
										} else if (local959 > 255) {
											local959 = 255;
										}
										local858 = local949 << 8 | local943 << 16 | local959;
									}
								}
								if (this.aClass143_Sub2_42.aBoolean408) {
									local161.b((float) local477);
									local161.b((float) (local512 + this.method8753(local477, local486)));
									local161.b((float) local486);
									local161.c((byte) (local858 >> 16));
									local161.c((byte) (local858 >> 8));
									local161.c((byte) local858);
									local161.c(-1);
									local161.b((float) local477);
									local161.b((float) local486);
									if (this.anIntArrayArrayArray19 != null) {
										local161.b((float) (local262 == null ? 0 : local262[local426] - 1));
									}
									if ((this.anInt10568 & 0x7) != 0) {
										local161.b(local561);
										local161.b(local559);
										local161.b(local553);
									}
								} else {
									local161.a((float) local477);
									local161.a((float) (this.method8753(local477, local486) + local512));
									local161.a((float) local486);
									local161.c((byte) (local858 >> 16));
									local161.c((byte) (local858 >> 8));
									local161.c((byte) local858);
									local161.c(-1);
									local161.a((float) local477);
									local161.a((float) local486);
									if (this.anIntArrayArrayArray19 != null) {
										local161.a((float) (local262 == null ? 0 : local262[local426] - 1));
									}
									if ((this.anInt10568 & 0x7) != 0) {
										local161.a(local561);
										local161.a(local559);
										local161.a(local553);
									}
								}
								local1186 = this.anInt10552++;
								local463[local426] = (short) local1186;
								if (local500 != -1) {
									local165[local1186] = local210[local426];
								}
								local184.method7770(local530, new Class5_Sub19(local463[local426]));
							} else {
								local463[local426] = ((Class5_Sub19) local828).aShort26;
								local1186 = local463[local426] & 0xFFFF;
								if (local500 != -1 && local165[local1186].aLong329 > local210[local426].aLong329) {
									local165[local1186] = local210[local426];
								}
							}
							for (local858 = 0; local858 < local416; local858++) {
								local188[local858].method1041(local542, local557, local1186, local544);
							}
							this.anInt10549++;
						}
					}
				}
			}
			for (local194 = 0; local194 < this.anInt10552; local194++) {
				@Pc(1301) Class5_Sub12 local1301 = local165[local194];
				if (local1301 != null) {
					local1301.method1040(local194);
				}
			}
			@Pc(1338) int local1338;
			for (@Pc(1318) int local1318 = 0; super.anInt10541 > local1318; local1318++) {
				for (@Pc(1322) int local1322 = 0; super.anInt10545 > local1322; local1322++) {
					@Pc(1334) short[] local1334 = this.aShortArrayArray18[super.anInt10541 * local1322 + local1318];
					if (local1334 != null) {
						local1338 = 0;
						@Pc(1340) int local1340 = 0;
						while (local1334.length > local1340) {
							@Pc(1349) int local1349 = local1334[local1340++] & 0xFFFF;
							@Pc(1356) int local1356 = local1334[local1340++] & 0xFFFF;
							@Pc(1363) int local1363 = local1334[local1340++] & 0xFFFF;
							@Pc(1367) Class5_Sub12 local1367 = local165[local1349];
							@Pc(1371) Class5_Sub12 local1371 = local165[local1356];
							@Pc(1375) Class5_Sub12 local1375 = local165[local1363];
							@Pc(1377) Class5_Sub12 local1377 = null;
							if (local1367 != null) {
								local1367.method1039(local1322, local1318, local1338);
								local1377 = local1367;
							}
							if (local1371 != null) {
								local1371.method1039(local1322, local1318, local1338);
								if (local1377 == null || local1371.aLong329 < local1377.aLong329) {
									local1377 = local1371;
								}
							}
							if (local1375 != null) {
								local1375.method1039(local1322, local1318, local1338);
								if (local1377 == null || local1377.aLong329 > local1375.aLong329) {
									local1377 = local1375;
								}
							}
							if (local1377 != null) {
								if (local1367 != null) {
									local1377.method1040(local1349);
								}
								if (local1371 != null) {
									local1377.method1040(local1356);
								}
								if (local1375 != null) {
									local1377.method1040(local1363);
								}
								local1377.method1039(local1322, local1318, local1338);
							}
							local1338++;
						}
					}
				}
			}
			local161.c();
			this.anInterface8_6 = this.aClass143_Sub2_42.method4927(local161.b(), local133, local156);
			this.aClass194_10 = new Class194(this.anInterface8_6, 5126, 3, 0);
			this.aClass194_9 = new Class194(this.anInterface8_6, 5121, 4, 12);
			@Pc(1506) byte local1506;
			if (this.anIntArrayArrayArray19 == null) {
				this.aClass194_12 = new Class194(this.anInterface8_6, 5126, 2, 16);
				local1506 = 24;
			} else {
				local1506 = 28;
				this.aClass194_12 = new Class194(this.anInterface8_6, 5126, 3, 16);
			}
			if ((this.anInt10568 & 0x7) != 0) {
				this.aClass194_11 = new Class194(this.anInterface8_6, 5126, 3, local1506);
			}
			@Pc(1553) long[] local1553 = new long[this.aClass5_Sub12Array1.length];
			for (local1338 = 0; local1338 < this.aClass5_Sub12Array1.length; local1338++) {
				@Pc(1562) Class5_Sub12 local1562 = this.aClass5_Sub12Array1[local1338];
				local1553[local1338] = local1562.aLong329;
				local1562.method1045(this.anInt10552);
			}
			Static335.method5152(this.aClass5_Sub12Array1, local1553);
			if (this.aClass22_2 != null) {
				this.aClass22_2.method372();
			}
		}
		this.anIntArrayArrayArray19 = null;
		this.aByteArrayArray26 = null;
		this.anIntArrayArrayArray16 = null;
		this.aClass335_48 = null;
		this.aFloatArrayArray18 = this.aFloatArrayArray17 = this.aFloatArrayArray16 = null;
		this.aClass5_Sub12ArrayArrayArray1 = null;
		this.anIntArrayArrayArray15 = null;
		this.anIntArrayArrayArray18 = this.anIntArrayArrayArray17 = null;
		this.anIntArrayArrayArray20 = null;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method8756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!wr", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class5_Sub2_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass22_2 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (this.aClass143_Sub2_42.anInt5863 * arg2 >> 8) >> this.aClass143_Sub2_42.anInt5821;
			@Pc(38) int local38 = arg3 - (this.aClass143_Sub2_42.anInt5843 * arg2 >> 8) >> this.aClass143_Sub2_42.anInt5821;
			this.aClass22_2.method381(local23, local38, arg0);
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method8745(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt10570 <= 0) {
			return;
		}
		this.aClass143_Sub2_42.method4992();
		this.aClass143_Sub2_42.method4976(false);
		this.aClass143_Sub2_42.method4993(false);
		this.aClass143_Sub2_42.method4997(false);
		this.aClass143_Sub2_42.method4931(false);
		this.aClass143_Sub2_42.method4922(0);
		this.aClass143_Sub2_42.method4978(-2);
		this.aClass143_Sub2_42.method4945((Class44) null);
		Static55.aFloatArray3[10] = 0.0F;
		Static55.aFloatArray3[0] = (float) 1024 / ((float) super.anInt10540 * 128.0F * (float) this.aClass143_Sub2_42.anInt5794);
		Static55.aFloatArray3[11] = 0.0F;
		Static55.aFloatArray3[15] = 1.0F;
		Static55.aFloatArray3[2] = 0.0F;
		Static55.aFloatArray3[5] = (float) 1024 / ((float) this.aClass143_Sub2_42.anInt5737 * 128.0F * (float) super.anInt10540);
		Static55.aFloatArray3[9] = 0.0F;
		Static55.aFloatArray3[4] = 0.0F;
		Static55.aFloatArray3[12] = -(((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass143_Sub2_42.anInt5794) - 1.0F;
		Static55.aFloatArray3[7] = 0.0F;
		Static55.aFloatArray3[14] = 0.0F;
		Static55.aFloatArray3[3] = 0.0F;
		Static55.aFloatArray3[8] = 0.0F;
		Static55.aFloatArray3[6] = 0.0F;
		Static55.aFloatArray3[1] = 0.0F;
		Static55.aFloatArray3[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass143_Sub2_42.anInt5737;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static55.aFloatArray3, 0);
		Static55.aFloatArray3[8] = 0.0F;
		Static55.aFloatArray3[7] = 0.0F;
		Static55.aFloatArray3[2] = 0.0F;
		Static55.aFloatArray3[3] = 0.0F;
		Static55.aFloatArray3[9] = 1.0F;
		Static55.aFloatArray3[0] = 1.0F;
		Static55.aFloatArray3[11] = 0.0F;
		Static55.aFloatArray3[5] = 0.0F;
		Static55.aFloatArray3[13] = 0.0F;
		Static55.aFloatArray3[4] = 0.0F;
		Static55.aFloatArray3[10] = 0.0F;
		Static55.aFloatArray3[12] = 0.0F;
		Static55.aFloatArray3[6] = 1.0F;
		Static55.aFloatArray3[1] = 0.0F;
		Static55.aFloatArray3[14] = 0.0F;
		Static55.aFloatArray3[15] = 1.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static55.aFloatArray3, 0);
		if ((this.anInt10568 & 0x7) == 0) {
			this.aClass143_Sub2_42.method4993(false);
		} else {
			this.aClass143_Sub2_42.method4993(true);
			this.aClass143_Sub2_42.method4924();
		}
		this.aClass143_Sub2_42.method4970(this.aClass194_10, this.aClass194_12, this.aClass194_9, this.aClass194_11);
		if (this.aClass143_Sub2_42.aClass5_Sub15_Sub1_3.aByteArray45.length >= this.anInt10549 * 2) {
			this.aClass143_Sub2_42.aClass5_Sub15_Sub1_3.anInt4144 = 0;
		} else {
			this.aClass143_Sub2_42.aClass5_Sub15_Sub1_3 = new Class5_Sub15_Sub1(this.anInt10549 * 2);
		}
		@Pc(312) int local312 = 0;
		@Pc(316) Class5_Sub15_Sub1 local316 = this.aClass143_Sub2_42.aClass5_Sub15_Sub1_3;
		@Pc(322) int local322;
		@Pc(331) int local331;
		@Pc(333) int local333;
		@Pc(352) short[] local352;
		@Pc(356) int local356;
		if (this.aClass143_Sub2_42.aBoolean408) {
			for (local322 = arg1; local322 < arg3; local322++) {
				local331 = arg0 + super.anInt10541 * local322;
				for (local333 = arg0; local333 < arg2; local333++) {
					if (arg4[local333 - arg0][local322 - arg1]) {
						local352 = this.aShortArrayArray18[local331];
						if (local352 != null) {
							for (local356 = 0; local356 < local352.length; local356++) {
								local312++;
								local316.method3660(local352[local356] & 0xFFFF);
							}
						}
					}
					local331++;
				}
			}
		} else {
			for (local322 = arg1; local322 < arg3; local322++) {
				local331 = local322 * super.anInt10541 + arg0;
				for (local333 = arg0; local333 < arg2; local333++) {
					if (arg4[local333 - arg0][local322 - arg1]) {
						local352 = this.aShortArrayArray18[local331];
						if (local352 != null) {
							for (local356 = 0; local356 < local352.length; local356++) {
								local316.method3668(local352[local356] & 0xFFFF);
								local312++;
							}
						}
					}
					local331++;
				}
			}
		}
		if (local312 > 0) {
			@Pc(472) Class292_Sub1 local472 = new Class292_Sub1(this.aClass143_Sub2_42, 5123, local316.aByteArray45, local316.anInt4144);
			this.aClass143_Sub2_42.method5004(local472, local312, 0);
		}
	}

	@OriginalMember(owner = "client!wr", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class5_Sub2_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass22_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass143_Sub2_42.anInt5863 >> 8) >> this.aClass143_Sub2_42.anInt5821;
			@Pc(39) int local39 = arg3 - (this.aClass143_Sub2_42.anInt5843 * arg2 >> 8) >> this.aClass143_Sub2_42.anInt5821;
			this.aClass22_2.method382(local24, local39, arg0);
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILclient!mi;II)V")
	private void method8759(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub2_Sub7_Sub2 arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray18[arg2][arg0];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray17[arg2][arg0];
		@Pc(22) int local22 = local12.length;
		if (local22 > this.aClass143_Sub2_42.anIntArray314.length) {
			this.aClass143_Sub2_42.anIntArray314 = new int[local22];
			this.aClass143_Sub2_42.anIntArray315 = new int[local22];
		}
		@Pc(46) int[] local46 = this.aClass143_Sub2_42.anIntArray314;
		@Pc(50) int[] local50 = this.aClass143_Sub2_42.anIntArray315;
		for (@Pc(52) int local52 = 0; local52 < local22; local52++) {
			local46[local52] = local12[local52] >> this.aClass143_Sub2_42.anInt5821;
			local50[local52] = local19[local52] >> this.aClass143_Sub2_42.anInt5821;
		}
		@Pc(84) int local84 = 0;
		while (local22 > local84) {
			@Pc(90) int local90 = local46[local84];
			@Pc(95) int local95 = local50[local84++];
			@Pc(99) int local99 = local46[local84];
			@Pc(104) int local104 = local50[local84++];
			@Pc(108) int local108 = local46[local84];
			@Pc(113) int local113 = local50[local84++];
			if ((local90 - local99) * (local104 - local113) - (local104 - local95) * (-local99 + local108) > 0) {
				arg1.method5402(local90, local113, local108, local95, local99, local104);
			}
		}
	}

	@OriginalMember(owner = "client!wr", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray26[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray26[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!jw;[I)V")
	@Override
	public void method8752(@OriginalArg(0) Class5_Sub3 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass124_107.method2574(new Class5_Sub7(this.aClass143_Sub2_42, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!wr", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray19 == null) {
			this.anIntArrayArrayArray19 = new int[super.anInt10541][super.anInt10545][];
		}
		@Pc(21) Interface3 local21 = this.aClass143_Sub2_42.anInterface3_11;
		if (arg3 != null && this.anIntArrayArrayArray15 == null) {
			this.anIntArrayArrayArray15 = new int[super.anInt10541][super.anInt10545][];
		}
		this.anIntArrayArrayArray18[arg0][arg1] = arg2;
		this.anIntArrayArrayArray17[arg0][arg1] = arg4;
		this.anIntArrayArrayArray16[arg0][arg1] = arg6;
		this.anIntArrayArrayArray20[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray19 != null) {
			this.anIntArrayArrayArray19[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray15 != null) {
			this.anIntArrayArrayArray15[arg0][arg1] = arg3;
		}
		@Pc(92) Class5_Sub12[] local92 = this.aClass5_Sub12ArrayArrayArray1[arg0][arg1] = new Class5_Sub12[arg6.length];
		for (@Pc(94) int local94 = 0; local94 < arg6.length; local94++) {
			@Pc(100) int local100 = arg8[local94];
			@Pc(104) int local104 = arg9[local94];
			if ((this.anInt10568 & 0x20) != 0 && local100 != -1 && local21.method8501(local100).aBoolean660) {
				local100 = -1;
				local104 = 128;
			}
			@Pc(145) long local145 = (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48 | (long) (local104 << 14) | (long) local100;
			@Pc(151) Class5 local151;
			for (local151 = this.aClass335_48.method7766(local145); local151 != null; local151 = this.aClass335_48.method7769()) {
				@Pc(156) Class5_Sub12 local156 = (Class5_Sub12) local151;
				if (local100 == local156.anInt1103 && local156.aFloat27 == (float) local104 && local156.anInt1108 == arg10 && local156.anInt1101 == arg11 && local156.anInt1110 == arg12) {
					break;
				}
			}
			if (local151 == null) {
				local92[local94] = new Class5_Sub12(this, local100, local104, arg10, arg11, arg12);
				this.aClass335_48.method7770(local145, local92[local94]);
			} else {
				local92[local94] = (Class5_Sub12) local151;
			}
		}
		if (arg13) {
			this.aByteArrayArray25[arg0][arg1] = (byte) (this.aByteArrayArray25[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt10571) {
			this.anInt10571 = arg6.length;
		}
		this.anInt10570 += arg6.length;
	}

	@OriginalMember(owner = "client!wr", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class5_Sub2_Sub7 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub2_Sub7 arg2) {
		if ((this.aByteArrayArray25[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt10540 >> this.aClass143_Sub2_42.anInt5821;
		@Pc(27) Class5_Sub2_Sub7_Sub2 local27 = (Class5_Sub2_Sub7_Sub2) arg2;
		@Pc(37) Class5_Sub2_Sub7_Sub2 local37;
		if (local27 != null && local27.method5404(local24, local24)) {
			local37 = local27;
			local27.method5405();
		} else {
			local37 = new Class5_Sub2_Sub7_Sub2(this.aClass143_Sub2_42, local24, local24);
		}
		local37.method5408(local24, local24, 0, 0);
		this.method8759(arg1, local37, arg0);
		return local37;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method8744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method8760(arg5, arg4, -1, arg3, arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method8751(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method8760(arg6, arg4, arg5, arg3, arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(BIZI[[ZIII)V")
	private void method8760(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (this.aClass5_Sub12Array1 == null) {
			return;
		}
		@Pc(21) int local21 = arg5 + arg5 + 1;
		@Pc(25) int local25 = local21 * local21;
		if (local25 > this.aClass143_Sub2_42.anIntArray313.length) {
			this.aClass143_Sub2_42.anIntArray313 = new int[local25];
		}
		if (this.anInt10549 * 2 > this.aClass143_Sub2_42.aClass5_Sub15_Sub1_3.aByteArray45.length) {
			this.aClass143_Sub2_42.aClass5_Sub15_Sub1_3 = new Class5_Sub15_Sub1(this.anInt10549 * 2);
		}
		@Pc(61) int local61 = arg6 - arg5;
		@Pc(63) int local63 = local61;
		if (local61 < 0) {
			local61 = 0;
		}
		@Pc(72) int local72 = arg4 - arg5;
		@Pc(74) int local74 = local72;
		if (local72 < 0) {
			local72 = 0;
		}
		@Pc(85) int local85 = arg6 + arg5;
		if (super.anInt10541 - 1 < local85) {
			local85 = super.anInt10541 - 1;
		}
		@Pc(105) int local105 = arg4 + arg5;
		if (local105 > super.anInt10545 - 1) {
			local105 = super.anInt10545 - 1;
		}
		@Pc(118) int local118 = 0;
		@Pc(122) int[] local122 = this.aClass143_Sub2_42.anIntArray313;
		@Pc(134) int local134;
		for (@Pc(124) int local124 = local61; local124 <= local85; local124++) {
			@Pc(132) boolean[] local132 = arg3[local124 - local63];
			for (local134 = local72; local134 <= local105; local134++) {
				if (local132[local134 - local74]) {
					local122[local118++] = local134 * super.anInt10541 + local124;
				}
			}
		}
		if (arg2 == -1) {
			this.aClass143_Sub2_42.method4932();
		} else {
			this.aClass143_Sub2_42.method5000((float) arg2);
			this.aClass143_Sub2_42.method5005();
		}
		this.aClass143_Sub2_42.method4993((this.anInt10568 & 0x7) != 0);
		for (@Pc(201) int local201 = 0; local201 < this.aClass5_Sub12Array1.length; local201++) {
			this.aClass5_Sub12Array1[local201].method1037(local118, local122);
		}
		if (!this.aClass124_107.method2577()) {
			local134 = this.aClass143_Sub2_42.anInt5846;
			@Pc(230) int local230 = this.aClass143_Sub2_42.anInt5838;
			this.aClass143_Sub2_42.L(0, local230, this.aClass143_Sub2_42.anInt5848);
			this.aClass143_Sub2_42.method4993(false);
			this.aClass143_Sub2_42.method4931(false);
			this.aClass143_Sub2_42.method4922(128);
			this.aClass143_Sub2_42.method4978(-2);
			this.aClass143_Sub2_42.method4945(this.aClass143_Sub2_42.aClass44_Sub1_6);
			this.aClass143_Sub2_42.method4940(8448, 7681);
			this.aClass143_Sub2_42.method4947(770, 0, 34166);
			this.aClass143_Sub2_42.method4933(34167, 0);
			for (@Pc(292) Class5 local292 = this.aClass124_107.method2572(); local292 != null; local292 = this.aClass124_107.method2569()) {
				@Pc(297) Class5_Sub7 local297 = (Class5_Sub7) local292;
				local297.method392(arg3, arg4, arg5, arg6);
			}
			this.aClass143_Sub2_42.method4947(768, 0, 5890);
			this.aClass143_Sub2_42.method4933(5890, 0);
			this.aClass143_Sub2_42.method4945((Class44) null);
			this.aClass143_Sub2_42.L(local134, local230, this.aClass143_Sub2_42.anInt5848);
		}
		if (this.aClass22_2 == null) {
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		this.aClass143_Sub2_42.method4970(this.aClass194_10, this.aClass194_12, (Class194) null, (Class194) null);
		this.aClass22_2.method379(arg1, arg4, arg5, arg6, arg3);
		OpenGL.glPopMatrix();
		return;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(II)V")
	@Override
	public void method8750(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method8755(@OriginalArg(0) Class5_Sub2_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass22_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass143_Sub2_42.anInt5863 >> 8) >> this.aClass143_Sub2_42.anInt5821;
			@Pc(39) int local39 = arg3 - (this.aClass143_Sub2_42.anInt5843 * arg2 >> 8) >> this.aClass143_Sub2_42.anInt5821;
			return this.aClass22_2.method373(local39, arg0, local24);
		}
	}
}
