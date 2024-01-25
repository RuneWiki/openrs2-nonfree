import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!via")
public final class Class40_Sub3 extends Class40 {

	@OriginalMember(owner = "client!via", name = "q", descriptor = "I")
	private int anInt9926;

	@OriginalMember(owner = "client!via", name = "r", descriptor = "I")
	private int anInt9927;

	@OriginalMember(owner = "client!via", name = "B", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!via", name = "Y", descriptor = "Lclient!ld;")
	public Class203 aClass203_23;

	@OriginalMember(owner = "client!via", name = "Z", descriptor = "Lclient!am;")
	private Interface1 anInterface1_17;

	@OriginalMember(owner = "client!via", name = "ab", descriptor = "[Lclient!jv;")
	private Class5_Sub24[] aClass5_Sub24Array1;

	@OriginalMember(owner = "client!via", name = "eb", descriptor = "I")
	private int anInt9948;

	@OriginalMember(owner = "client!via", name = "hb", descriptor = "Lclient!am;")
	private Interface1 anInterface1_18;

	@OriginalMember(owner = "client!via", name = "jb", descriptor = "I")
	private int anInt9950;

	@OriginalMember(owner = "client!via", name = "A", descriptor = "F")
	private float aFloat201 = -3.4028235E38F;

	@OriginalMember(owner = "client!via", name = "x", descriptor = "F")
	private float aFloat200 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!via", name = "p", descriptor = "Lclient!ro;")
	private final Class306 aClass306_62 = new Class306();

	@OriginalMember(owner = "client!via", name = "n", descriptor = "I")
	private final int anInt9925 = this.anInt9919 - 2;

	@OriginalMember(owner = "client!via", name = "o", descriptor = "Lclient!rv;")
	public final Class126_Sub2 aClass126_Sub2_21;

	@OriginalMember(owner = "client!via", name = "H", descriptor = "I")
	private final int anInt9937;

	@OriginalMember(owner = "client!via", name = "z", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!via", name = "v", descriptor = "[[S")
	public final short[][] aShortArrayArray21;

	@OriginalMember(owner = "client!via", name = "W", descriptor = "[[[Lclient!jv;")
	private Class5_Sub24[][][] aClass5_Sub24ArrayArrayArray1;

	@OriginalMember(owner = "client!via", name = "bb", descriptor = "[[F")
	private float[][] aFloatArrayArray15;

	@OriginalMember(owner = "client!via", name = "Q", descriptor = "[[B")
	private final byte[][] aByteArrayArray24;

	@OriginalMember(owner = "client!via", name = "I", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!via", name = "w", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!via", name = "ib", descriptor = "[[B")
	private byte[][] aByteArrayArray25;

	@OriginalMember(owner = "client!via", name = "V", descriptor = "I")
	public final int anInt9946;

	@OriginalMember(owner = "client!via", name = "cb", descriptor = "[[F")
	private float[][] aFloatArrayArray16;

	@OriginalMember(owner = "client!via", name = "K", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray17;

	@OriginalMember(owner = "client!via", name = "db", descriptor = "[[F")
	private float[][] aFloatArrayArray17;

	@OriginalMember(owner = "client!via", name = "l", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!via", name = "fb", descriptor = "Lclient!du;")
	private Class81 aClass81_72;

	@OriginalMember(owner = "client!via", name = "U", descriptor = "Lclient!qw;")
	private Class296 aClass296_2;

	@OriginalMember(owner = "client!via", name = "<init>", descriptor = "(Lclient!rv;IIII[[I[[II)V")
	public Class40_Sub3(@OriginalArg(0) Class126_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass126_Sub2_21 = arg0;
		this.anInt9937 = 0x1 << this.anInt9925;
		this.anIntArrayArrayArray14 = new int[arg3][arg4][];
		this.aShortArrayArray21 = new short[arg3 * arg4][];
		this.aClass5_Sub24ArrayArrayArray1 = new Class5_Sub24[arg3][arg4][];
		this.aFloatArrayArray15 = new float[super.anInt9920 + 1][super.anInt9923 + 1];
		this.aByteArrayArray24 = new byte[arg3][arg4];
		this.anIntArrayArrayArray16 = new int[arg3][arg4][];
		this.anIntArrayArrayArray13 = new int[arg3][arg4][];
		this.aByteArrayArray25 = new byte[arg3 + 1][arg4 + 1];
		this.anInt9946 = arg2;
		this.aFloatArrayArray16 = new float[super.anInt9920 + 1][super.anInt9923 + 1];
		this.anIntArrayArrayArray17 = new int[arg3][arg4][];
		this.aFloatArrayArray17 = new float[super.anInt9920 + 1][super.anInt9923 + 1];
		this.anIntArrayArrayArray12 = new int[arg3][arg4][];
		for (@Pc(121) int local121 = 0; super.anInt9923 >= local121; local121++) {
			for (@Pc(125) int local125 = 0; local125 <= super.anInt9920; local125++) {
				@Pc(134) int local134 = super.anIntArrayArray60[local125][local121];
				if (this.aFloat200 > (float) local134) {
					this.aFloat200 = (float) local134;
				}
				if (this.aFloat201 < (float) local134) {
					this.aFloat201 = (float) local134;
				}
				if (local125 > 0 && local121 > 0 && super.anInt9920 > local125 && super.anInt9923 > local121) {
					@Pc(191) int local191 = arg6[local125 + 1][local121] - arg6[local125 - 1][local121];
					@Pc(207) int local207 = arg6[local125][local121 + 1] - arg6[local125][local121 - 1];
					@Pc(226) float local226 = (float) (1.0D / Math.sqrt((double) (local207 * local207 + arg7 * 4 * arg7 + local191 * local191)));
					this.aFloatArrayArray15[local125][local121] = local226 * (float) local191;
					this.aFloatArrayArray16[local125][local121] = local226 * (float) (-arg7 * 2);
					this.aFloatArrayArray17[local125][local121] = (float) local207 * local226;
				}
			}
		}
		this.aFloat201++;
		this.aFloat200--;
		this.aClass81_72 = new Class81(128);
		if ((this.anInt9946 & 0x10) != 0) {
			this.aClass296_2 = new Class296(this.aClass126_Sub2_21, this);
		}
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method8441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method8451(arg5, arg2, arg0, arg1, arg4, arg3, arg6);
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(II)V")
	@Override
	public void method8445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!via", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class5_Sub4_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass296_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass126_Sub2_21.anInt6276 * arg2 >> 8) >> this.aClass126_Sub2_21.anInt6254;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass126_Sub2_21.anInt6261 >> 8) >> this.aClass126_Sub2_21.anInt6254;
			this.aClass296_2.method6946(arg0, local24, local39);
		}
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(Lclient!tn;[I)V")
	@Override
	public void method8438(@OriginalArg(0) Class5_Sub27 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass306_62.method7303(new Class5_Sub20(this.aClass126_Sub2_21, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!via", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.anInt9948 <= 0) {
			this.aClass296_2 = null;
		} else {
			@Pc(26) byte[][] local26 = new byte[super.anInt9920 + 1][super.anInt9923 + 1];
			for (@Pc(28) int local28 = 1; super.anInt9920 > local28; local28++) {
				for (@Pc(32) int local32 = 1; local32 < super.anInt9923; local32++) {
					local26[local28][local32] = (byte) ((this.aByteArrayArray25[local28][local32 + 1] >> 3) + (this.aByteArrayArray25[local28][local32 - 1] >> 2) + (this.aByteArrayArray25[local28 + -1][local32] >> 2) + (this.aByteArrayArray25[local28 + 1][local32] >> 3) + (this.aByteArrayArray25[local28][local32] >> 1));
				}
			}
			@Pc(112) Class5_Sub24[] local112 = new Class5_Sub24[this.aClass81_72.method1611()];
			this.aClass81_72.method1606(local112);
			for (@Pc(120) int local120 = 0; local120 < local112.length; local120++) {
				local112[local120].method4151(this.anInt9948);
			}
			@Pc(140) int local140 = 20;
			if (this.anIntArrayArrayArray15 != null) {
				local140 += 4;
			}
			if ((this.anInt9946 & 0x7) != 0) {
				local140 += 12;
			}
			@Pc(160) NativeHeapBuffer local160 = this.aClass126_Sub2_21.aNativeHeap4.a(this.anInt9948 * 4, false);
			@Pc(170) NativeHeapBuffer local170 = this.aClass126_Sub2_21.aNativeHeap4.a(local140 * this.anInt9948, false);
			@Pc(175) Stream local175 = new Stream(local170);
			@Pc(180) Stream local180 = new Stream(local160);
			@Pc(184) Class5_Sub24[] local184 = new Class5_Sub24[this.anInt9948];
			@Pc(191) int local191 = Static473.method6912(this.anInt9948 / 4);
			if (local191 < 1) {
				local191 = 1;
			}
			@Pc(203) Class81 local203 = new Class81(local191);
			@Pc(207) Class5_Sub24[] local207 = new Class5_Sub24[this.anInt9950];
			@Pc(213) int local213;
			for (@Pc(209) int local209 = 0; super.anInt9920 > local209; local209++) {
				for (local213 = 0; super.anInt9923 > local213; local213++) {
					if (this.anIntArrayArrayArray17[local209][local213] != null) {
						@Pc(229) Class5_Sub24[] local229 = this.aClass5_Sub24ArrayArrayArray1[local209][local213];
						@Pc(236) int[] local236 = this.anIntArrayArrayArray14[local209][local213];
						@Pc(243) int[] local243 = this.anIntArrayArrayArray16[local209][local213];
						@Pc(250) int[] local250 = this.anIntArrayArrayArray12[local209][local213];
						@Pc(257) int[] local257 = this.anIntArrayArrayArray17[local209][local213];
						@Pc(269) int[] local269 = this.anIntArrayArrayArray13 == null ? null : this.anIntArrayArrayArray13[local209][local213];
						@Pc(281) int[] local281 = this.anIntArrayArrayArray15 == null ? null : this.anIntArrayArrayArray15[local209][local213];
						if (local250 == null) {
							local250 = local257;
						}
						@Pc(292) float local292 = this.aFloatArrayArray15[local209][local213];
						@Pc(299) float local299 = this.aFloatArrayArray16[local209][local213];
						@Pc(306) float local306 = this.aFloatArrayArray17[local209][local213];
						@Pc(315) float local315 = this.aFloatArrayArray15[local209][local213 + 1];
						@Pc(324) float local324 = this.aFloatArrayArray16[local209][local213 + 1];
						@Pc(333) float local333 = this.aFloatArrayArray17[local209][local213 + 1];
						@Pc(344) float local344 = this.aFloatArrayArray15[local209 + 1][local213 + 1];
						@Pc(355) float local355 = this.aFloatArrayArray16[local209 + 1][local213 + 1];
						@Pc(366) float local366 = this.aFloatArrayArray17[local209 + 1][local213 + 1];
						@Pc(375) float local375 = this.aFloatArrayArray15[local209 + 1][local213];
						@Pc(384) float local384 = this.aFloatArrayArray16[local209 + 1][local213];
						@Pc(393) float local393 = this.aFloatArrayArray17[local209 + 1][local213];
						@Pc(401) int local401 = local26[local209][local213] & 0xFF;
						@Pc(411) int local411 = local26[local209][local213 + 1] & 0xFF;
						@Pc(423) int local423 = local26[local209 + 1][local213 + 1] & 0xFF;
						@Pc(433) int local433 = local26[local209 + 1][local213] & 0xFF;
						@Pc(435) int local435 = 0;
						@Pc(445) int local445;
						label355: for (@Pc(437) int local437 = 0; local437 < local257.length; local437++) {
							@Pc(443) Class5_Sub24 local443 = local229[local437];
							for (local445 = 0; local445 < local435; local445++) {
								if (local443 == local207[local445]) {
									continue label355;
								}
							}
							local207[local435++] = local443;
						}
						@Pc(490) short[] local490 = this.aShortArrayArray21[local209 + super.anInt9920 * local213] = new short[local257.length];
						for (local445 = 0; local445 < local257.length; local445++) {
							@Pc(504) int local504 = (local209 << super.anInt9919) + local236[local445];
							@Pc(514) int local514 = (local213 << super.anInt9919) + local243[local445];
							@Pc(519) int local519 = local504 >> this.anInt9925;
							@Pc(524) int local524 = local514 >> this.anInt9925;
							@Pc(528) int local528 = local257[local445];
							@Pc(532) int local532 = local250[local445];
							@Pc(540) int local540 = local269 == null ? 0 : local269[local445];
							@Pc(558) long local558 = (long) (local519 << 16) | (long) local528 << 32 | (long) local532 << 48 | (long) local524;
							@Pc(562) int local562 = local236[local445];
							@Pc(566) int local566 = local243[local445];
							@Pc(568) byte local568 = 74;
							@Pc(570) int local570 = 0;
							@Pc(584) float local584;
							@Pc(582) float local582;
							@Pc(576) float local576;
							@Pc(672) float local672;
							@Pc(580) int local580;
							if (local562 == 0 && local566 == 0) {
								local576 = local306;
								local580 = local568 - local401;
								local582 = local299;
								local584 = local292;
							} else if (local562 == 0 && super.anInt9918 == local566) {
								local584 = local315;
								local580 = local568 - local411;
								local576 = local333;
								local582 = local324;
							} else if (super.anInt9918 == local562 && super.anInt9918 == local566) {
								local580 = local568 - local423;
								local584 = local344;
								local576 = local366;
								local582 = local355;
							} else if (super.anInt9918 == local562 && local566 == 0) {
								local576 = local393;
								local582 = local384;
								local584 = local375;
								local580 = local568 - local433;
							} else {
								@Pc(648) float local648 = (float) local562 / (float) super.anInt9918;
								@Pc(655) float local655 = (float) local566 / (float) super.anInt9918;
								@Pc(663) float local663 = local292 + (local375 - local292) * local648;
								local672 = local299 + (local384 - local299) * local648;
								@Pc(680) float local680 = (local393 - local306) * local648 + local306;
								@Pc(689) float local689 = (local344 - local315) * local648 + local315;
								@Pc(697) float local697 = local648 * (local355 - local324) + local324;
								local584 = local655 * (local689 - local663) + local663;
								local582 = local655 * (local697 - local672) + local672;
								@Pc(722) float local722 = (local366 - local333) * local648 + local333;
								local576 = local680 + (local722 - local680) * local655;
								@Pc(743) int local743 = ((local433 - local401) * local562 >> super.anInt9919) + local401;
								@Pc(755) int local755 = (local562 * (local423 - local411) >> super.anInt9919) + local411;
								local580 = local568 - ((local755 - local743) * local566 >> super.anInt9919) - local743;
							}
							@Pc(782) float local782 = 1.0F;
							if (local528 != -1) {
								@Pc(794) int local794 = local580 * (local528 & 0x7F) >> 7;
								if (local794 < 2) {
									local794 = 2;
								} else if (local794 > 126) {
									local794 = 126;
								}
								local570 = Static643.anIntArray836[local528 & 0xFF80 | local794];
								if ((this.anInt9946 & 0x7) == 0) {
									local782 = local582 * this.aClass126_Sub2_21.aFloatArray37[1] + local584 * this.aClass126_Sub2_21.aFloatArray37[0] + local576 * this.aClass126_Sub2_21.aFloatArray37[2];
									local782 = this.aClass126_Sub2_21.aFloat119 + (local782 > 0.0F ? this.aClass126_Sub2_21.aFloat131 : this.aClass126_Sub2_21.aFloat132) * local782;
								}
							}
							@Pc(870) Class5 local870 = null;
							if ((local504 & this.anInt9937 - 1) == 0 && (local514 & this.anInt9937 - 1) == 0) {
								local870 = local203.method1599(local558);
							}
							@Pc(1208) int local1208;
							@Pc(903) int local903;
							if (local870 == null) {
								if (local528 == local532) {
									local903 = local570;
								} else {
									@Pc(913) int local913 = local580 * (local532 & 0x7F) >> 7;
									if (local913 < 2) {
										local913 = 2;
									} else if (local913 > 126) {
										local913 = 126;
									}
									local903 = Static643.anIntArray836[local913 | local532 & 0xFF80];
									if ((this.anInt9946 & 0x7) == 0) {
										local672 = local576 * this.aClass126_Sub2_21.aFloatArray37[2] + this.aClass126_Sub2_21.aFloatArray37[0] * local584 + local582 * this.aClass126_Sub2_21.aFloatArray37[1];
										local672 = this.aClass126_Sub2_21.aFloat119 + local782 * (local782 > 0.0F ? this.aClass126_Sub2_21.aFloat131 : this.aClass126_Sub2_21.aFloat132);
										@Pc(988) int local988 = local903 >> 16 & 0xFF;
										@Pc(994) int local994 = local903 >> 8 & 0xFF;
										local988 = (int) ((float) local988 * local672);
										@Pc(1004) int local1004 = local903 & 0xFF;
										local994 = (int) ((float) local994 * local672);
										if (local988 < 0) {
											local988 = 0;
										} else if (local988 > 255) {
											local988 = 255;
										}
										if (local994 < 0) {
											local994 = 0;
										} else if (local994 > 255) {
											local994 = 255;
										}
										local1004 = (int) ((float) local1004 * local672);
										if (local1004 < 0) {
											local1004 = 0;
										} else if (local1004 > 255) {
											local1004 = 255;
										}
										local903 = local988 << 16 | local994 << 8 | local1004;
									}
								}
								if (Stream.b()) {
									local175.a((float) local504);
									local175.a((float) (local540 + this.method8447(local504, local514)));
									local175.a((float) local514);
									local175.a((float) local504);
									local175.a((float) local514);
									if (this.anIntArrayArrayArray15 != null) {
										local175.a((float) (local281 == null ? 0 : local281[local445] - 1));
									}
									if ((this.anInt9946 & 0x7) != 0) {
										local175.a(local584);
										local175.a(local582);
										local175.a(local576);
									}
								} else {
									local175.b((float) local504);
									local175.b((float) (local540 + this.method8447(local504, local514)));
									local175.b((float) local514);
									local175.b((float) local504);
									local175.b((float) local514);
									if (this.anIntArrayArrayArray15 != null) {
										local175.b((float) (local281 == null ? 0 : local281[local445] - 1));
									}
									if ((this.anInt9946 & 0x7) != 0) {
										local175.b(local584);
										local175.b(local582);
										local175.b(local576);
									}
								}
								if (this.aClass126_Sub2_21.anInt6290 == 0) {
									local180.a(local903 | 0xFF000000);
								} else {
									local180.c(local903 | 0xFF000000);
								}
								local1208 = this.anInt9926++;
								local490[local445] = (short) local1208;
								if (local528 != -1) {
									local184[local1208] = local229[local445];
								}
								local203.method1607(new Class5_Sub6(local490[local445]), local558);
							} else {
								local490[local445] = ((Class5_Sub6) local870).aShort17;
								local1208 = local490[local445] & 0xFFFF;
								if (local528 != -1 && local184[local1208].aLong282 > local229[local445].aLong282) {
									local184[local1208] = local229[local445];
								}
							}
							for (local903 = 0; local903 < local435; local903++) {
								local207[local903].method4150(local1208, local580, local782, local570);
							}
							this.anInt9927++;
						}
					}
				}
			}
			for (local213 = 0; local213 < this.anInt9926; local213++) {
				@Pc(1324) Class5_Sub24 local1324 = local184[local213];
				if (local1324 != null) {
					local1324.method4152(local213);
				}
			}
			@Pc(1341) int local1341;
			@Pc(1359) int local1359;
			for (@Pc(1337) int local1337 = 0; super.anInt9920 > local1337; local1337++) {
				for (local1341 = 0; super.anInt9923 > local1341; local1341++) {
					@Pc(1353) short[] local1353 = this.aShortArrayArray21[local1341 * super.anInt9920 + local1337];
					if (local1353 != null) {
						@Pc(1357) int local1357 = 0;
						local1359 = 0;
						while (local1353.length > local1359) {
							@Pc(1368) int local1368 = local1353[local1359++] & 0xFFFF;
							@Pc(1375) int local1375 = local1353[local1359++] & 0xFFFF;
							@Pc(1382) int local1382 = local1353[local1359++] & 0xFFFF;
							@Pc(1386) Class5_Sub24 local1386 = local184[local1368];
							@Pc(1390) Class5_Sub24 local1390 = local184[local1375];
							@Pc(1394) Class5_Sub24 local1394 = local184[local1382];
							@Pc(1396) Class5_Sub24 local1396 = null;
							if (local1386 != null) {
								local1386.method4146(local1337, local1341, local1357);
								local1396 = local1386;
							}
							if (local1390 != null) {
								local1390.method4146(local1337, local1341, local1357);
								if (local1396 == null || local1390.aLong282 < local1396.aLong282) {
									local1396 = local1390;
								}
							}
							if (local1394 != null) {
								local1394.method4146(local1337, local1341, local1357);
								if (local1396 == null || local1396.aLong282 > local1394.aLong282) {
									local1396 = local1394;
								}
							}
							if (local1396 != null) {
								if (local1386 != null) {
									local1396.method4152(local1368);
								}
								if (local1390 != null) {
									local1396.method4152(local1375);
								}
								if (local1394 != null) {
									local1396.method4152(local1382);
								}
								local1396.method4146(local1337, local1341, local1357);
							}
							local1357++;
						}
					}
				}
			}
			local175.a();
			local180.a();
			this.anInterface1_18 = this.aClass126_Sub2_21.method5530(false);
			this.anInterface1_18.method7718(this.anInt9926 * 4, local160, 4);
			this.anInterface1_17 = this.aClass126_Sub2_21.method5530(false);
			this.anInterface1_17.method7718(this.anInt9926 * local140, local170, local140);
			if ((this.anInt9946 & 0x7) == 0) {
				if (this.anIntArrayArrayArray15 == null) {
					this.aClass203_23 = this.aClass126_Sub2_21.method5525(new Class212[] { new Class212(new Class106[] { Static150.aClass106_1, Static150.aClass106_5 }), new Class212(Static150.aClass106_3) });
				} else {
					this.aClass203_23 = this.aClass126_Sub2_21.method5525(new Class212[] { new Class212(new Class106[] { Static150.aClass106_1, Static150.aClass106_5, Static150.aClass106_4 }), new Class212(Static150.aClass106_3) });
				}
			} else if (this.anIntArrayArrayArray15 == null) {
				this.aClass203_23 = this.aClass126_Sub2_21.method5525(new Class212[] { new Class212(new Class106[] { Static150.aClass106_1, Static150.aClass106_5, Static150.aClass106_2 }), new Class212(Static150.aClass106_3) });
			} else {
				this.aClass203_23 = this.aClass126_Sub2_21.method5525(new Class212[] { new Class212(new Class106[] { Static150.aClass106_1, Static150.aClass106_5, Static150.aClass106_4, Static150.aClass106_2 }), new Class212(Static150.aClass106_3) });
			}
			local1341 = 0;
			for (@Pc(1692) int local1692 = 0; local1692 < local112.length; local1692++) {
				if (local112[local1692].anInt4521 > 0) {
					local112[local1341++] = local112[local1692];
				}
			}
			this.aClass5_Sub24Array1 = new Class5_Sub24[local1341];
			@Pc(1718) long[] local1718 = new long[local1341];
			for (local1359 = 0; local1359 < local1341; local1359++) {
				@Pc(1726) Class5_Sub24 local1726 = local112[local1359];
				local1718[local1359] = local1726.aLong282;
				this.aClass5_Sub24Array1[local1359] = local1726;
				local1726.method4153(this.anInt9926);
			}
			Static593.method8309(local1718, this.aClass5_Sub24Array1);
			if (this.aClass296_2 != null) {
				this.aClass296_2.method6953();
			}
		}
		this.aClass5_Sub24ArrayArrayArray1 = null;
		this.anIntArrayArrayArray15 = null;
		this.aFloatArrayArray15 = this.aFloatArrayArray16 = this.aFloatArrayArray17 = null;
		this.aByteArrayArray25 = null;
		this.anIntArrayArrayArray12 = null;
		this.anIntArrayArrayArray14 = this.anIntArrayArrayArray16 = null;
		this.anIntArrayArrayArray17 = null;
		this.anIntArrayArrayArray13 = null;
		this.aClass81_72 = null;
	}

	@OriginalMember(owner = "client!via", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class5_Sub4_Sub10 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub4_Sub10 arg2) {
		if ((this.aByteArrayArray24[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(21) int local21 = super.anInt9918 >> this.aClass126_Sub2_21.anInt6254;
		@Pc(24) Class5_Sub4_Sub10_Sub2 local24 = (Class5_Sub4_Sub10_Sub2) arg2;
		@Pc(34) Class5_Sub4_Sub10_Sub2 local34;
		if (local24 != null && local24.method3410(local21, local21)) {
			local34 = local24;
			local24.method3416();
		} else {
			local34 = new Class5_Sub4_Sub10_Sub2(this.aClass126_Sub2_21, local21, local21);
		}
		local34.method3418(local21, 0, local21, 0);
		this.method8450(arg0, arg1, local34);
		return local34;
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method8439(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt9948 <= 0) {
			return;
		}
		@Pc(16) Interface21 local16 = this.aClass126_Sub2_21.method5481(this.anInt9927);
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = 32767;
		@Pc(22) int local22 = -32768;
		for (@Pc(24) int local24 = 0; local24 < 4; local24++) {
			local18 = 0;
			@Pc(33) Buffer local33 = local16.method5730();
			if (local33 != null) {
				@Pc(41) Stream local41 = this.aClass126_Sub2_21.method5446(local33);
				@Pc(45) int local45;
				@Pc(54) int local54;
				@Pc(56) int local56;
				@Pc(75) short[] local75;
				@Pc(79) int local79;
				@Pc(87) int local87;
				if (Stream.b()) {
					for (local45 = arg1; local45 < arg3; local45++) {
						local54 = arg0 + local45 * super.anInt9920;
						for (local56 = arg0; local56 < arg2; local56++) {
							if (arg4[local56 - arg0][local45 - arg1]) {
								local75 = this.aShortArrayArray21[local54];
								if (local75 != null) {
									for (local79 = 0; local79 < local75.length; local79++) {
										local87 = local75[local79] & 0xFFFF;
										local18++;
										if (local20 > local87) {
											local20 = local87;
										}
										if (local22 < local87) {
											local22 = local87;
										}
										local41.b(local87);
									}
								}
							}
							local54++;
						}
					}
				} else {
					for (local45 = arg1; local45 < arg3; local45++) {
						local54 = arg0 + local45 * super.anInt9920;
						for (local56 = arg0; local56 < arg2; local56++) {
							if (arg4[local56 - arg0][local45 - arg1]) {
								local75 = this.aShortArrayArray21[local54];
								if (local75 != null) {
									for (local79 = 0; local79 < local75.length; local79++) {
										local87 = local75[local79] & 0xFFFF;
										if (local22 < local87) {
											local22 = local87;
										}
										if (local20 > local87) {
											local20 = local87;
										}
										local41.d(local87);
										local18++;
									}
								}
							}
							local54++;
						}
					}
				}
				local41.a();
				if (local16.method5734()) {
					break;
				}
			}
		}
		if (local18 <= 0) {
			return;
		}
		this.aClass126_Sub2_21.method5518();
		this.aClass126_Sub2_21.method5514(false);
		this.aClass126_Sub2_21.method5443(false);
		this.aClass126_Sub2_21.method5549(false);
		this.aClass126_Sub2_21.method5470(false);
		this.aClass126_Sub2_21.method5462(0);
		this.aClass126_Sub2_21.method5482(-2, false, false);
		this.aClass126_Sub2_21.method5449((Interface27) null);
		@Pc(261) Class117_Sub2 local261 = this.aClass126_Sub2_21.method5472();
		@Pc(266) float[] local266 = this.aClass126_Sub2_21.method5529();
		local266[5] = (float) 1024 / ((float) this.aClass126_Sub2_21.anInt6075 * (float) super.anInt9918 * 128.0F);
		local266[2] = 0.0F;
		local266[1] = 0.0F;
		local266[10] = 1.0F / (this.aFloat201 - this.aFloat200);
		local266[0] = (float) 1024 / ((float) super.anInt9918 * 128.0F * (float) this.aClass126_Sub2_21.anInt6105);
		local266[15] = 1.0F;
		local266[11] = 0.0F;
		local266[6] = 0.0F;
		local266[4] = 0.0F;
		local266[8] = 0.0F;
		local266[9] = 0.0F;
		local266[7] = 0.0F;
		local266[3] = 0.0F;
		local266[12] = -1.0F - ((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass126_Sub2_21.anInt6105;
		local266[14] = -this.aFloat200 / (this.aFloat201 - this.aFloat200);
		local266[13] = 1.0F - ((float) (arg3 * 1024) / 128.0F + (float) 0) / (float) this.aClass126_Sub2_21.anInt6075;
		local261.method3871(1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F);
		this.aClass126_Sub2_21.method5545();
		this.aClass126_Sub2_21.method5468();
		if ((this.anInt9946 & 0x7) == 0) {
			this.aClass126_Sub2_21.method5443(false);
		} else {
			this.aClass126_Sub2_21.method5443(true);
			this.aClass126_Sub2_21.method5485();
		}
		this.aClass126_Sub2_21.method5520(false);
		this.aClass126_Sub2_21.method5451(0, this.anInterface1_17);
		this.aClass126_Sub2_21.method5451(1, this.anInterface1_18);
		this.aClass126_Sub2_21.method5524(this.aClass203_23);
		this.aClass126_Sub2_21.method5526(local16, Static370.aClass23_7, local18 / 3, 0, local22 + 1 - local20, local20);
		this.aClass126_Sub2_21.method5520(true);
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method8440(@OriginalArg(0) Class5_Sub4_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass296_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (this.aClass126_Sub2_21.anInt6276 * arg2 >> 8) >> this.aClass126_Sub2_21.anInt6254;
			@Pc(40) int local40 = arg3 - (arg2 * this.aClass126_Sub2_21.anInt6261 >> 8) >> this.aClass126_Sub2_21.anInt6254;
			return this.aClass296_2.method6944(local40, arg0, local25);
		}
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(IBILclient!hv;)V")
	private void method8450(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5_Sub4_Sub10_Sub2 arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray14[arg0][arg1];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray16[arg0][arg1];
		@Pc(22) int local22 = local12.length;
		if (local22 > Static57.anIntArray73.length) {
			Static57.anIntArray73 = new int[local22];
			Static358.anIntArray644 = new int[local22];
		}
		for (@Pc(40) int local40 = 0; local40 < local22; local40++) {
			Static57.anIntArray73[local40] = local12[local40] >> this.aClass126_Sub2_21.anInt6254;
			Static358.anIntArray644[local40] = local19[local40] >> this.aClass126_Sub2_21.anInt6254;
		}
		@Pc(72) int local72 = 0;
		while (local72 < local22) {
			@Pc(78) int local78 = Static57.anIntArray73[local72];
			@Pc(83) int local83 = Static358.anIntArray644[local72++];
			@Pc(87) int local87 = Static57.anIntArray73[local72];
			@Pc(92) int local92 = Static358.anIntArray644[local72++];
			@Pc(96) int local96 = Static57.anIntArray73[local72];
			@Pc(101) int local101 = Static358.anIntArray644[local72++];
			if (-((local92 - local83) * (local96 - local87)) + (local92 - local101) * (local78 + -local87) > 0) {
				arg2.method3415(local78, local87, local92, local101, local83, local96);
			}
		}
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
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

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method8446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method8451(-1, arg2, arg0, arg1, arg4, arg3, arg5);
	}

	@OriginalMember(owner = "client!via", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg3 != null && this.anIntArrayArrayArray13 == null) {
			this.anIntArrayArrayArray13 = new int[super.anInt9920][super.anInt9923][];
		}
		@Pc(21) Interface8 local21 = this.aClass126_Sub2_21.anInterface8_10;
		if (arg5 != null && this.anIntArrayArrayArray15 == null) {
			this.anIntArrayArrayArray15 = new int[super.anInt9920][super.anInt9923][];
		}
		this.anIntArrayArrayArray14[arg0][arg1] = arg2;
		this.anIntArrayArrayArray16[arg0][arg1] = arg4;
		this.anIntArrayArrayArray17[arg0][arg1] = arg6;
		this.anIntArrayArrayArray12[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray15 != null) {
			this.anIntArrayArrayArray15[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray13 != null) {
			this.anIntArrayArrayArray13[arg0][arg1] = arg3;
		}
		@Pc(92) Class5_Sub24[] local92 = this.aClass5_Sub24ArrayArrayArray1[arg0][arg1] = new Class5_Sub24[arg6.length];
		for (@Pc(94) int local94 = 0; local94 < arg6.length; local94++) {
			@Pc(100) int local100 = arg8[local94];
			@Pc(104) int local104 = arg9[local94];
			if ((this.anInt9946 & 0x20) != 0 && local100 != -1 && local21.method7813(local100).aBoolean724) {
				local104 = 128;
				local100 = -1;
			}
			@Pc(149) long local149 = (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28 | (long) (local104 << 14) | (long) local100;
			@Pc(155) Class5 local155;
			for (local155 = this.aClass81_72.method1599(local149); local155 != null; local155 = this.aClass81_72.method1605()) {
				@Pc(160) Class5_Sub24 local160 = (Class5_Sub24) local155;
				if (local160.anInt4524 == local100 && local160.aFloat68 == (float) local104 && arg10 == local160.anInt4529 && local160.anInt4516 == arg11 && local160.anInt4528 == arg12) {
					break;
				}
			}
			if (local155 == null) {
				local92[local94] = new Class5_Sub24(this, local100, local104, arg10, arg11, arg12);
				this.aClass81_72.method1607(local92[local94], local149);
			} else {
				local92[local94] = (Class5_Sub24) local155;
			}
		}
		if (arg13) {
			this.aByteArrayArray24[arg0][arg1] = (byte) (this.aByteArrayArray24[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt9950) {
			this.anInt9950 = arg6.length;
		}
		this.anInt9948 += arg6.length;
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(IIIIZ[[ZII)V")
	private void method8451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean[][] arg5, @OriginalArg(7) int arg6) {
		if (this.aClass5_Sub24Array1 == null) {
			return;
		}
		@Pc(11) int local11 = arg1 + arg1 + 1;
		@Pc(15) int local15 = local11 * local11;
		if (Static65.anIntArray89.length < local15) {
			Static65.anIntArray89 = new int[local15];
		}
		@Pc(31) int local31 = arg2 - arg1;
		@Pc(33) int local33 = local31;
		if (local31 < 0) {
			local31 = 0;
		}
		@Pc(45) int local45 = arg3 - arg1;
		@Pc(47) int local47 = local45;
		if (local45 < 0) {
			local45 = 0;
		}
		@Pc(58) int local58 = arg1 + arg2;
		if (local58 > super.anInt9920 - 1) {
			local58 = super.anInt9920 - 1;
		}
		@Pc(73) int local73 = arg3 + arg1;
		if (local73 > super.anInt9923 - 1) {
			local73 = super.anInt9923 - 1;
		}
		Static156.anInt2730 = 0;
		for (@Pc(88) int local88 = local31; local88 <= local58; local88++) {
			@Pc(97) boolean[] local97 = arg5[local88 - local33];
			for (@Pc(99) int local99 = local45; local99 <= local73; local99++) {
				if (local97[local99 - local47]) {
					Static65.anIntArray89[Static156.anInt2730++] = local99 * super.anInt9920 + local88;
				}
			}
		}
		if (arg0 == -1) {
			this.aClass126_Sub2_21.method5570();
		} else {
			this.aClass126_Sub2_21.method5497((float) arg0);
			this.aClass126_Sub2_21.method5572();
		}
		this.aClass126_Sub2_21.method5523();
		this.aClass126_Sub2_21.method5443((this.anInt9946 & 0x7) != 0);
		this.aClass126_Sub2_21.method5482(-1, false, false);
		this.aClass126_Sub2_21.method5451(0, this.anInterface1_17);
		for (@Pc(179) int local179 = 0; local179 < this.aClass5_Sub24Array1.length; local179++) {
			this.aClass5_Sub24Array1[local179].method4149(Static156.anInt2730, Static65.anIntArray89);
		}
		@Pc(204) Class117_Sub2 local204 = this.aClass126_Sub2_21.method5472();
		local204.method7244(0, -1, 0);
		this.aClass126_Sub2_21.method5468();
		if (!this.aClass306_62.method7309()) {
			@Pc(222) int local222 = this.aClass126_Sub2_21.anInt6277;
			@Pc(226) int local226 = this.aClass126_Sub2_21.anInt6255;
			this.aClass126_Sub2_21.L(0, local226, this.aClass126_Sub2_21.anInt6280);
			this.aClass126_Sub2_21.method5443(false);
			this.aClass126_Sub2_21.method5470(false);
			this.aClass126_Sub2_21.method5462(128);
			this.aClass126_Sub2_21.method5482(-2, false, false);
			this.aClass126_Sub2_21.method5449(this.aClass126_Sub2_21.anInterface27_3);
			this.aClass126_Sub2_21.method5475(Static247.aClass10_4, Static101.aClass10_2);
			this.aClass126_Sub2_21.method5466(0, Static645.aClass294_5);
			this.aClass126_Sub2_21.method5471(Static18.aClass294_1, 0);
			for (@Pc(286) Class5 local286 = this.aClass306_62.method7313(); local286 != null; local286 = this.aClass306_62.method7301()) {
				@Pc(291) Class5_Sub20 local291 = (Class5_Sub20) local286;
				local291.method3629(arg2, arg5, arg3, arg1);
			}
			this.aClass126_Sub2_21.method5466(0, Static256.aClass294_4);
			this.aClass126_Sub2_21.method5471(Static256.aClass294_4, 0);
			this.aClass126_Sub2_21.method5449((Interface27) null);
			this.aClass126_Sub2_21.L(local222, local226, this.aClass126_Sub2_21.anInt6280);
		}
		if (this.aClass296_2 != null) {
			this.aClass126_Sub2_21.method5451(0, this.anInterface1_17);
			this.aClass126_Sub2_21.method5451(1, this.anInterface1_18);
			this.aClass126_Sub2_21.method5524(this.aClass203_23);
			this.aClass296_2.method6945(arg5, arg1, arg2, arg4, arg3);
		}
	}

	@OriginalMember(owner = "client!via", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray25[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray25[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!via", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class5_Sub4_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass296_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass126_Sub2_21.anInt6276 * arg2 >> 8) >> this.aClass126_Sub2_21.anInt6254;
			@Pc(39) int local39 = arg3 - (this.aClass126_Sub2_21.anInt6261 * arg2 >> 8) >> this.aClass126_Sub2_21.anInt6254;
			this.aClass296_2.method6950(local39, local24, arg0);
		}
	}
}
