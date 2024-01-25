import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eha")
public final class Class91_Sub1 extends Class91 {

	@OriginalMember(owner = "client!eha", name = "l", descriptor = "I")
	private int anInt2714;

	@OriginalMember(owner = "client!eha", name = "q", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!eha", name = "U", descriptor = "I")
	private int anInt2735;

	@OriginalMember(owner = "client!eha", name = "gb", descriptor = "[Lclient!ld;")
	private Class3_Sub33[] aClass3_Sub33Array1;

	@OriginalMember(owner = "client!eha", name = "hb", descriptor = "Lclient!cc;")
	public Class43 aClass43_1;

	@OriginalMember(owner = "client!eha", name = "ib", descriptor = "I")
	private int anInt2739;

	@OriginalMember(owner = "client!eha", name = "kb", descriptor = "Lclient!rv;")
	private Interface22 anInterface22_1;

	@OriginalMember(owner = "client!eha", name = "lb", descriptor = "I")
	private int lb;

	@OriginalMember(owner = "client!eha", name = "mb", descriptor = "Lclient!rv;")
	private Interface22 anInterface22_2;

	@OriginalMember(owner = "client!eha", name = "A", descriptor = "F")
	private float aFloat49 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!eha", name = "W", descriptor = "F")
	private float aFloat50 = -3.4028235E38F;

	@OriginalMember(owner = "client!eha", name = "bb", descriptor = "Lclient!mba;")
	private final Class216 aClass216_20 = new Class216();

	@OriginalMember(owner = "client!eha", name = "v", descriptor = "I")
	private final int anInt2720 = this.anInt8988 - 2;

	@OriginalMember(owner = "client!eha", name = "H", descriptor = "Lclient!rl;")
	public final Class82_Sub3 aClass82_Sub3_5;

	@OriginalMember(owner = "client!eha", name = "E", descriptor = "I")
	public final int anInt2723;

	@OriginalMember(owner = "client!eha", name = "z", descriptor = "[[[Lclient!ld;")
	private Class3_Sub33[][][] aClass3_Sub33ArrayArrayArray1;

	@OriginalMember(owner = "client!eha", name = "G", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray17;

	@OriginalMember(owner = "client!eha", name = "o", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!eha", name = "cb", descriptor = "[[F")
	private float[][] aFloatArrayArray1;

	@OriginalMember(owner = "client!eha", name = "fb", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!eha", name = "B", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!eha", name = "m", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!eha", name = "db", descriptor = "[[B")
	private byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!eha", name = "M", descriptor = "[[S")
	public final short[][] aShortArrayArray3;

	@OriginalMember(owner = "client!eha", name = "D", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!eha", name = "ab", descriptor = "[[B")
	private final byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!eha", name = "K", descriptor = "I")
	private final int anInt2727;

	@OriginalMember(owner = "client!eha", name = "eb", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!eha", name = "jb", descriptor = "Lclient!baa;")
	private Class25 aClass25_9;

	@OriginalMember(owner = "client!eha", name = "y", descriptor = "Lclient!aca;")
	private Class5 aClass5_1;

	@OriginalMember(owner = "client!eha", name = "<init>", descriptor = "(Lclient!rl;IIII[[I[[II)V")
	public Class91_Sub1(@OriginalArg(0) Class82_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass82_Sub3_5 = arg0;
		this.anInt2723 = arg2;
		this.aClass3_Sub33ArrayArrayArray1 = new Class3_Sub33[arg3][arg4][];
		this.anIntArrayArrayArray17 = new int[arg3][arg4][];
		this.anIntArrayArrayArray13 = new int[arg3][arg4][];
		this.aFloatArrayArray1 = new float[super.anInt8983 + 1][super.anInt8985 + 1];
		this.aFloatArrayArray3 = new float[super.anInt8983 + 1][super.anInt8985 + 1];
		this.anIntArrayArrayArray15 = new int[arg3][arg4][];
		this.anIntArrayArrayArray12 = new int[arg3][arg4][];
		this.aByteArrayArray6 = new byte[arg3 + 1][arg4 + 1];
		this.aShortArrayArray3 = new short[arg3 * arg4][];
		this.anIntArrayArrayArray16 = new int[arg3][arg4][];
		this.aByteArrayArray5 = new byte[arg3][arg4];
		this.anInt2727 = 0x1 << this.anInt2720;
		this.aFloatArrayArray2 = new float[super.anInt8983 + 1][super.anInt8985 + 1];
		for (@Pc(121) int local121 = 0; local121 <= super.anInt8985; local121++) {
			for (@Pc(125) int local125 = 0; super.anInt8983 >= local125; local125++) {
				@Pc(134) int local134 = super.anIntArrayArray53[local125][local121];
				if (this.aFloat49 > (float) local134) {
					this.aFloat49 = (float) local134;
				}
				if (this.aFloat50 < (float) local134) {
					this.aFloat50 = (float) local134;
				}
				if (local125 > 0 && local121 > 0 && super.anInt8983 > local125 && local121 < super.anInt8985) {
					@Pc(196) int local196 = arg6[local125 + 1][local121] - arg6[local125 - 1][local121];
					@Pc(213) int local213 = arg6[local125][local121 + 1] - arg6[local125][local121 - 1];
					@Pc(233) float local233 = (float) (1.0D / Math.sqrt((double) (local196 * local196 + arg7 * 4 * arg7 + local213 * local213)));
					this.aFloatArrayArray2[local125][local121] = local233 * (float) local196;
					this.aFloatArrayArray3[local125][local121] = (float) (-arg7 * 2) * local233;
					this.aFloatArrayArray1[local125][local121] = local233 * (float) local213;
				}
			}
		}
		this.aFloat50++;
		this.aFloat49--;
		this.aClass25_9 = new Class25(128);
		if ((this.anInt2723 & 0x10) != 0) {
			this.aClass5_1 = new Class5(this.aClass82_Sub3_5, this);
		}
	}

	@OriginalMember(owner = "client!eha", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class3_Sub7_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass5_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass82_Sub3_5.anInt5841 * arg2 >> 8) >> this.aClass82_Sub3_5.anInt5857;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass82_Sub3_5.anInt5840 >> 8) >> this.aClass82_Sub3_5.anInt5857;
			this.aClass5_1.method90(local39, local24, arg0);
		}
	}

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(II)V")
	@Override
	public void method7717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method7719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method2277(arg1, -1, arg5, arg3, arg4, arg2, arg0);
	}

	@OriginalMember(owner = "client!eha", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.lb > 0) {
			@Pc(21) byte[][] local21 = new byte[super.anInt8983 + 1][super.anInt8985 + 1];
			for (@Pc(23) int local23 = 1; super.anInt8983 > local23; local23++) {
				for (@Pc(27) int local27 = 1; local27 < super.anInt8985; local27++) {
					local21[local23][local27] = (byte) ((this.aByteArrayArray6[local23][local27] >> 1) + (this.aByteArrayArray6[local23][local27 + 1] >> 3) + (this.aByteArrayArray6[local23 + 1][local27] >> 3) + (this.aByteArrayArray6[local23 + -1][local27] >> 2) + (this.aByteArrayArray6[local23][local27 - 1] >> 2));
				}
			}
			@Pc(111) Class3_Sub33[] local111 = new Class3_Sub33[this.aClass25_9.method430()];
			this.aClass25_9.method431(local111);
			for (@Pc(119) int local119 = 0; local119 < local111.length; local119++) {
				local111[local119].method5277(this.lb);
			}
			@Pc(139) int local139 = 20;
			if (this.anIntArrayArrayArray14 != null) {
				local139 += 4;
			}
			if ((this.anInt2723 & 0x7) != 0) {
				local139 += 12;
			}
			@Pc(159) NativeHeapBuffer local159 = this.aClass82_Sub3_5.aNativeHeap4.a(this.lb * 4, false);
			@Pc(169) NativeHeapBuffer local169 = this.aClass82_Sub3_5.aNativeHeap4.a(local139 * this.lb, false);
			@Pc(174) Stream local174 = new Stream(local169);
			@Pc(179) Stream local179 = new Stream(local159);
			@Pc(183) Class3_Sub33[] local183 = new Class3_Sub33[this.lb];
			@Pc(190) int local190 = Static107.method1798(this.lb / 4);
			if (local190 < 1) {
				local190 = 1;
			}
			@Pc(200) Class25 local200 = new Class25(local190);
			@Pc(204) Class3_Sub33[] local204 = new Class3_Sub33[this.anInt2739];
			@Pc(210) int local210;
			for (@Pc(206) int local206 = 0; local206 < super.anInt8983; local206++) {
				for (local210 = 0; super.anInt8985 > local210; local210++) {
					if (this.anIntArrayArrayArray12[local206][local210] != null) {
						@Pc(226) Class3_Sub33[] local226 = this.aClass3_Sub33ArrayArrayArray1[local206][local210];
						@Pc(233) int[] local233 = this.anIntArrayArrayArray17[local206][local210];
						@Pc(240) int[] local240 = this.anIntArrayArrayArray13[local206][local210];
						@Pc(247) int[] local247 = this.anIntArrayArrayArray15[local206][local210];
						@Pc(254) int[] local254 = this.anIntArrayArrayArray12[local206][local210];
						@Pc(266) int[] local266 = this.anIntArrayArrayArray16 == null ? null : this.anIntArrayArrayArray16[local206][local210];
						@Pc(278) int[] local278 = this.anIntArrayArrayArray14 == null ? null : this.anIntArrayArrayArray14[local206][local210];
						if (local247 == null) {
							local247 = local254;
						}
						@Pc(289) float local289 = this.aFloatArrayArray2[local206][local210];
						@Pc(296) float local296 = this.aFloatArrayArray3[local206][local210];
						@Pc(303) float local303 = this.aFloatArrayArray1[local206][local210];
						@Pc(312) float local312 = this.aFloatArrayArray2[local206][local210 + 1];
						@Pc(321) float local321 = this.aFloatArrayArray3[local206][local210 + 1];
						@Pc(330) float local330 = this.aFloatArrayArray1[local206][local210 + 1];
						@Pc(341) float local341 = this.aFloatArrayArray2[local206 + 1][local210 + 1];
						@Pc(352) float local352 = this.aFloatArrayArray3[local206 + 1][local210 + 1];
						@Pc(363) float local363 = this.aFloatArrayArray1[local206 + 1][local210 + 1];
						@Pc(372) float local372 = this.aFloatArrayArray2[local206 + 1][local210];
						@Pc(381) float local381 = this.aFloatArrayArray3[local206 + 1][local210];
						@Pc(390) float local390 = this.aFloatArrayArray1[local206 + 1][local210];
						@Pc(398) int local398 = local21[local206][local210] & 0xFF;
						@Pc(408) int local408 = local21[local206][local210 + 1] & 0xFF;
						@Pc(420) int local420 = local21[local206 + 1][local210 + 1] & 0xFF;
						@Pc(430) int local430 = local21[local206 + 1][local210] & 0xFF;
						@Pc(432) int local432 = 0;
						@Pc(442) int local442;
						label355: for (@Pc(434) int local434 = 0; local434 < local254.length; local434++) {
							@Pc(440) Class3_Sub33 local440 = local226[local434];
							for (local442 = 0; local442 < local432; local442++) {
								if (local440 == local204[local442]) {
									continue label355;
								}
							}
							local204[local432++] = local440;
						}
						@Pc(479) short[] local479 = this.aShortArrayArray3[local206 + local210 * super.anInt8983] = new short[local254.length];
						for (local442 = 0; local442 < local254.length; local442++) {
							@Pc(493) int local493 = (local206 << super.anInt8988) + local233[local442];
							@Pc(502) int local502 = (local210 << super.anInt8988) + local240[local442];
							@Pc(507) int local507 = local493 >> this.anInt2720;
							@Pc(512) int local512 = local502 >> this.anInt2720;
							@Pc(516) int local516 = local254[local442];
							@Pc(520) int local520 = local247[local442];
							@Pc(528) int local528 = local266 == null ? 0 : local266[local442];
							@Pc(546) long local546 = (long) local512 | (long) (local507 << 16) | (long) local520 << 48 | (long) local516 << 32;
							@Pc(550) int local550 = local233[local442];
							@Pc(554) int local554 = local240[local442];
							@Pc(556) byte local556 = 74;
							@Pc(558) int local558 = 0;
							@Pc(595) float local595;
							@Pc(593) float local593;
							@Pc(591) float local591;
							@Pc(639) float local639;
							@Pc(599) int local599;
							if (local550 == 0 && local554 == 0) {
								local591 = local303;
								local599 = local556 - local398;
								local595 = local289;
								local593 = local296;
							} else if (local550 == 0 && super.anInt8986 == local554) {
								local591 = local330;
								local593 = local321;
								local599 = local556 - local408;
								local595 = local312;
							} else if (super.anInt8986 == local550 && super.anInt8986 == local554) {
								local591 = local363;
								local593 = local352;
								local595 = local341;
								local599 = local556 - local420;
							} else if (super.anInt8986 == local550 && local554 == 0) {
								local593 = local381;
								local599 = local556 - local430;
								local595 = local372;
								local591 = local390;
							} else {
								@Pc(614) float local614 = (float) local550 / (float) super.anInt8986;
								@Pc(621) float local621 = (float) local554 / (float) super.anInt8986;
								@Pc(630) float local630 = local289 + (local372 - local289) * local614;
								local639 = (local381 - local296) * local614 + local296;
								@Pc(648) float local648 = local303 + (local390 - local303) * local614;
								@Pc(656) float local656 = local614 * (local341 - local312) + local312;
								@Pc(664) float local664 = local321 + (local352 - local321) * local614;
								local593 = local621 * (local664 - local639) + local639;
								local595 = local630 + local621 * (local656 - local630);
								@Pc(689) float local689 = local614 * (local363 - local330) + local330;
								local591 = (local689 - local648) * local621 + local648;
								@Pc(709) int local709 = ((local430 - local398) * local550 >> super.anInt8988) + local398;
								@Pc(720) int local720 = ((local420 - local408) * local550 >> super.anInt8988) + local408;
								local599 = local556 - local709 - ((local720 - local709) * local554 >> super.anInt8988);
							}
							@Pc(773) float local773 = 1.0F;
							if (local516 != -1) {
								@Pc(785) int local785 = (local516 & 0x7F) * local599 >> 7;
								if (local785 < 2) {
									local785 = 2;
								} else if (local785 > 126) {
									local785 = 126;
								}
								local558 = Static205.anIntArray530[local785 | local516 & 0xFF80];
								if ((this.anInt2723 & 0x7) == 0) {
									local773 = this.aClass82_Sub3_5.aFloatArray54[0] * local595 + local593 * this.aClass82_Sub3_5.aFloatArray54[1] + local591 * this.aClass82_Sub3_5.aFloatArray54[2];
									local773 = (local773 > 0.0F ? this.aClass82_Sub3_5.aFloat138 : this.aClass82_Sub3_5.aFloat136) * local773 + this.aClass82_Sub3_5.aFloat123;
								}
							}
							@Pc(858) Class3 local858 = null;
							if ((this.anInt2727 - 1 & local493) == 0 && (this.anInt2727 - 1 & local502) == 0) {
								local858 = local200.method426(local546);
							}
							@Pc(894) int local894;
							@Pc(951) int local951;
							if (local858 == null) {
								if (local516 == local520) {
									local951 = local558;
								} else {
									@Pc(927) int local927 = (local520 & 0x7F) * local599 >> 7;
									if (local927 < 2) {
										local927 = 2;
									} else if (local927 > 126) {
										local927 = 126;
									}
									local951 = Static205.anIntArray530[local927 | local520 & 0xFF80];
									if ((this.anInt2723 & 0x7) == 0) {
										local639 = local591 * this.aClass82_Sub3_5.aFloatArray54[2] + this.aClass82_Sub3_5.aFloatArray54[0] * local595 + local593 * this.aClass82_Sub3_5.aFloatArray54[1];
										local639 = this.aClass82_Sub3_5.aFloat123 + (local773 > 0.0F ? this.aClass82_Sub3_5.aFloat138 : this.aClass82_Sub3_5.aFloat136) * local773;
										@Pc(1007) int local1007 = local951 >> 16 & 0xFF;
										@Pc(1013) int local1013 = local951 >> 8 & 0xFF;
										local1007 = (int) ((float) local1007 * local639);
										@Pc(1023) int local1023 = local951 & 0xFF;
										if (local1007 < 0) {
											local1007 = 0;
										} else if (local1007 > 255) {
											local1007 = 255;
										}
										local1013 = (int) ((float) local1013 * local639);
										local1023 = (int) ((float) local1023 * local639);
										if (local1013 < 0) {
											local1013 = 0;
										} else if (local1013 > 255) {
											local1013 = 255;
										}
										if (local1023 < 0) {
											local1023 = 0;
										} else if (local1023 > 255) {
											local1023 = 255;
										}
										local951 = local1023 | local1013 << 8 | local1007 << 16;
									}
								}
								if (Stream.c()) {
									local174.a((float) local493);
									local174.a((float) (this.method7725(local493, local502) + local528));
									local174.a((float) local502);
									local174.a((float) local493);
									local174.a((float) local502);
									if (this.anIntArrayArrayArray14 != null) {
										local174.a((float) (local278 == null ? 0 : local278[local442] - 1));
									}
									if ((this.anInt2723 & 0x7) != 0) {
										local174.a(local595);
										local174.a(local593);
										local174.a(local591);
									}
								} else {
									local174.b((float) local493);
									local174.b((float) (this.method7725(local493, local502) + local528));
									local174.b((float) local502);
									local174.b((float) local493);
									local174.b((float) local502);
									if (this.anIntArrayArrayArray14 != null) {
										local174.b((float) (local278 == null ? 0 : local278[local442] - 1));
									}
									if ((this.anInt2723 & 0x7) != 0) {
										local174.b(local595);
										local174.b(local593);
										local174.b(local591);
									}
								}
								if (this.aClass82_Sub3_5.anInt5858 == 0) {
									local179.a(local951 | 0xFF000000);
								} else {
									local179.d(local951 | 0xFF000000);
								}
								local894 = this.anInt2735++;
								local479[local442] = (short) local894;
								if (local516 != -1) {
									local183[local894] = local226[local442];
								}
								local200.method434(local546, new Class3_Sub8(local479[local442]));
							} else {
								local479[local442] = ((Class3_Sub8) local858).aShort1;
								local894 = local479[local442] & 0xFFFF;
								if (local516 != -1 && local226[local442].aLong277 < local183[local894].aLong277) {
									local183[local894] = local226[local442];
								}
							}
							for (local951 = 0; local951 < local432; local951++) {
								local204[local951].method5274(local773, local558, local599, local894);
							}
							this.anInt2714++;
						}
					}
				}
			}
			for (local210 = 0; local210 < this.anInt2735; local210++) {
				@Pc(1315) Class3_Sub33 local1315 = local183[local210];
				if (local1315 != null) {
					local1315.method5276(local210);
				}
			}
			@Pc(1336) int local1336;
			@Pc(1354) int local1354;
			for (@Pc(1332) int local1332 = 0; local1332 < super.anInt8983; local1332++) {
				for (local1336 = 0; local1336 < super.anInt8985; local1336++) {
					@Pc(1348) short[] local1348 = this.aShortArrayArray3[local1336 * super.anInt8983 + local1332];
					if (local1348 != null) {
						@Pc(1352) int local1352 = 0;
						local1354 = 0;
						while (local1348.length > local1354) {
							@Pc(1363) int local1363 = local1348[local1354++] & 0xFFFF;
							@Pc(1370) int local1370 = local1348[local1354++] & 0xFFFF;
							@Pc(1377) int local1377 = local1348[local1354++] & 0xFFFF;
							@Pc(1381) Class3_Sub33 local1381 = local183[local1363];
							@Pc(1385) Class3_Sub33 local1385 = local183[local1370];
							@Pc(1389) Class3_Sub33 local1389 = local183[local1377];
							@Pc(1391) Class3_Sub33 local1391 = null;
							if (local1381 != null) {
								local1391 = local1381;
								local1381.method5278(local1332, local1352, local1336);
							}
							if (local1385 != null) {
								local1385.method5278(local1332, local1352, local1336);
								if (local1391 == null || local1391.aLong277 > local1385.aLong277) {
									local1391 = local1385;
								}
							}
							if (local1389 != null) {
								local1389.method5278(local1332, local1352, local1336);
								if (local1391 == null || local1389.aLong277 < local1391.aLong277) {
									local1391 = local1389;
								}
							}
							if (local1391 != null) {
								if (local1381 != null) {
									local1391.method5276(local1363);
								}
								if (local1385 != null) {
									local1391.method5276(local1370);
								}
								if (local1389 != null) {
									local1391.method5276(local1377);
								}
								local1391.method5278(local1332, local1352, local1336);
							}
							local1352++;
						}
					}
				}
			}
			local174.b();
			local179.b();
			this.anInterface22_2 = this.aClass82_Sub3_5.method4925(false);
			this.anInterface22_2.method1388(this.anInt2735 * 4, 4, local159);
			this.anInterface22_1 = this.aClass82_Sub3_5.method4925(false);
			this.anInterface22_1.method1388(local139 * this.anInt2735, local139, local169);
			if ((this.anInt2723 & 0x7) == 0) {
				if (this.anIntArrayArrayArray14 == null) {
					this.aClass43_1 = this.aClass82_Sub3_5.method4976(new Class268[] { new Class268(new Class279[] { Static458.aClass279_1, Static458.aClass279_5 }), new Class268(Static458.aClass279_3) });
				} else {
					this.aClass43_1 = this.aClass82_Sub3_5.method4976(new Class268[] { new Class268(new Class279[] { Static458.aClass279_1, Static458.aClass279_5, Static458.aClass279_4 }), new Class268(Static458.aClass279_3) });
				}
			} else if (this.anIntArrayArrayArray14 == null) {
				this.aClass43_1 = this.aClass82_Sub3_5.method4976(new Class268[] { new Class268(new Class279[] { Static458.aClass279_1, Static458.aClass279_5, Static458.aClass279_2 }), new Class268(Static458.aClass279_3) });
			} else {
				this.aClass43_1 = this.aClass82_Sub3_5.method4976(new Class268[] { new Class268(new Class279[] { Static458.aClass279_1, Static458.aClass279_5, Static458.aClass279_4, Static458.aClass279_2 }), new Class268(Static458.aClass279_3) });
			}
			local1336 = 0;
			for (@Pc(1687) int local1687 = 0; local1687 < local111.length; local1687++) {
				if (local111[local1687].anInt6100 > 0) {
					local111[local1336++] = local111[local1687];
				}
			}
			this.aClass3_Sub33Array1 = new Class3_Sub33[local1336];
			@Pc(1720) long[] local1720 = new long[local1336];
			for (local1354 = 0; local1354 < local1336; local1354++) {
				@Pc(1728) Class3_Sub33 local1728 = local111[local1354];
				local1720[local1354] = local1728.aLong277;
				this.aClass3_Sub33Array1[local1354] = local1728;
				local1728.method5271(this.anInt2735);
			}
			Static618.method8428(local1720, this.aClass3_Sub33Array1);
			if (this.aClass5_1 != null) {
				this.aClass5_1.method88();
			}
		} else {
			this.aClass5_1 = null;
		}
		this.anIntArrayArrayArray14 = null;
		this.aClass3_Sub33ArrayArrayArray1 = null;
		this.aClass25_9 = null;
		this.anIntArrayArrayArray17 = this.anIntArrayArrayArray13 = null;
		this.anIntArrayArrayArray16 = null;
		this.anIntArrayArrayArray15 = null;
		this.aByteArrayArray6 = null;
		this.aFloatArrayArray2 = this.aFloatArrayArray3 = this.aFloatArrayArray1 = null;
		this.anIntArrayArrayArray12 = null;
	}

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(Lclient!oca;III)V")
	private void method2276(@OriginalArg(0) Class3_Sub7_Sub17_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray17[arg2][arg1];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray13[arg2][arg1];
		@Pc(22) int local22 = local12.length;
		if (Static111.anIntArray151.length < local22) {
			Static344.anIntArray347 = new int[local22];
			Static111.anIntArray151 = new int[local22];
		}
		for (@Pc(34) int local34 = 0; local34 < local22; local34++) {
			Static111.anIntArray151[local34] = local12[local34] >> this.aClass82_Sub3_5.anInt5857;
			Static344.anIntArray347[local34] = local19[local34] >> this.aClass82_Sub3_5.anInt5857;
		}
		@Pc(68) int local68 = 0;
		while (local22 > local68) {
			@Pc(74) int local74 = Static111.anIntArray151[local68];
			@Pc(79) int local79 = Static344.anIntArray347[local68++];
			@Pc(83) int local83 = Static111.anIntArray151[local68];
			@Pc(88) int local88 = Static344.anIntArray347[local68++];
			@Pc(92) int local92 = Static111.anIntArray151[local68];
			@Pc(97) int local97 = Static344.anIntArray347[local68++];
			if ((local74 - local83) * (local88 - local97) - (local88 - local79) * (-local83 + local92) > 0) {
				arg0.method6245(local97, local88, local79, local83, local74, local92);
			}
		}
	}

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(III[[ZZZII)V")
	private void method2277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (this.aClass3_Sub33Array1 == null) {
			return;
		}
		@Pc(10) int local10 = arg5 + arg5 + 1;
		@Pc(14) int local14 = local10 * local10;
		if (Static528.anIntArray558.length < local14) {
			Static528.anIntArray558 = new int[local14];
		}
		@Pc(25) int local25 = arg6 - arg5;
		@Pc(27) int local27 = local25;
		if (local25 < 0) {
			local25 = 0;
		}
		@Pc(35) int local35 = arg0 - arg5;
		@Pc(37) int local37 = local35;
		if (local35 < 0) {
			local35 = 0;
		}
		@Pc(45) int local45 = arg6 + arg5;
		if (local45 > super.anInt8983 - 1) {
			local45 = super.anInt8983 - 1;
		}
		@Pc(64) int local64 = arg5 + arg0;
		Static360.anInt6650 = 0;
		if (super.anInt8985 - 1 < local64) {
			local64 = super.anInt8985 - 1;
		}
		for (@Pc(83) int local83 = local25; local83 <= local45; local83++) {
			@Pc(92) boolean[] local92 = arg3[local83 - local27];
			for (@Pc(94) int local94 = local35; local94 <= local64; local94++) {
				if (local92[local94 - local37]) {
					Static528.anIntArray558[Static360.anInt6650++] = local83 + super.anInt8983 * local94;
				}
			}
		}
		if (arg1 == -1) {
			this.aClass82_Sub3_5.method5002();
		} else {
			this.aClass82_Sub3_5.method5019((float) arg1);
			this.aClass82_Sub3_5.method5020();
		}
		this.aClass82_Sub3_5.method4941();
		this.aClass82_Sub3_5.method5029((this.anInt2723 & 0x7) != 0);
		this.aClass82_Sub3_5.method4988(false, false, -1);
		this.aClass82_Sub3_5.method4995(0, this.anInterface22_1);
		for (@Pc(186) int local186 = 0; local186 < this.aClass3_Sub33Array1.length; local186++) {
			this.aClass3_Sub33Array1[local186].method5275(Static528.anIntArray558, Static360.anInt6650);
		}
		@Pc(207) Class31_Sub2 local207 = this.aClass82_Sub3_5.method4944();
		local207.method7921(0, -1, 0);
		this.aClass82_Sub3_5.method4961();
		if (!this.aClass216_20.method5455()) {
			@Pc(225) int local225 = this.aClass82_Sub3_5.anInt5843;
			@Pc(229) int local229 = this.aClass82_Sub3_5.anInt5844;
			this.aClass82_Sub3_5.L(0, local229, this.aClass82_Sub3_5.anInt5830);
			this.aClass82_Sub3_5.method5029(false);
			this.aClass82_Sub3_5.method4968(false);
			this.aClass82_Sub3_5.method4939(128);
			this.aClass82_Sub3_5.method4988(false, false, -2);
			this.aClass82_Sub3_5.method4972(this.aClass82_Sub3_5.anInterface10_3);
			this.aClass82_Sub3_5.method4908(Static443.aClass88_3, Static131.aClass88_1);
			this.aClass82_Sub3_5.method4928(0, Static302.aClass165_1);
			this.aClass82_Sub3_5.method5028(Static309.aClass165_2, 0);
			for (@Pc(289) Class3 local289 = this.aClass216_20.method5457(); local289 != null; local289 = this.aClass216_20.method5458()) {
				@Pc(294) Class3_Sub20 local294 = (Class3_Sub20) local289;
				local294.method2894(arg6, arg0, arg5, arg3);
			}
			this.aClass82_Sub3_5.method4928(0, Static527.aClass165_4);
			this.aClass82_Sub3_5.method5028(Static527.aClass165_4, 0);
			this.aClass82_Sub3_5.method4972((Interface10) null);
			this.aClass82_Sub3_5.L(local225, local229, this.aClass82_Sub3_5.anInt5830);
		}
		if (this.aClass5_1 != null) {
			this.aClass82_Sub3_5.method4995(0, this.anInterface22_1);
			this.aClass82_Sub3_5.method4995(1, this.anInterface22_2);
			this.aClass82_Sub3_5.method4960(this.aClass43_1);
			this.aClass5_1.method89(arg6, arg0, arg3, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!eha", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class3_Sub7_Sub17 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub7_Sub17 arg2) {
		if ((this.aByteArrayArray5[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt8986 >> this.aClass82_Sub3_5.anInt5857;
		@Pc(27) Class3_Sub7_Sub17_Sub1 local27 = (Class3_Sub7_Sub17_Sub1) arg2;
		@Pc(43) Class3_Sub7_Sub17_Sub1 local43;
		if (local27 != null && local27.method6243(local24, local24)) {
			local43 = local27;
			local27.method6247();
		} else {
			local43 = new Class3_Sub7_Sub17_Sub1(this.aClass82_Sub3_5, local24, local24);
		}
		local43.method6244(local24, 0, 0, local24);
		this.method2276(local43, arg1, arg0);
		return local43;
	}

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method7718(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(Lclient!tj;[I)V")
	@Override
	public void method7722(@OriginalArg(0) Class3_Sub22 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass216_20.method5449(new Class3_Sub20(this.aClass82_Sub3_5, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!eha", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray6[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray6[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!eha", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		@Pc(9) Interface5 local9 = this.aClass82_Sub3_5.anInterface5_9;
		if (arg5 != null && this.anIntArrayArrayArray14 == null) {
			this.anIntArrayArrayArray14 = new int[super.anInt8983][super.anInt8985][];
		}
		if (arg3 != null && this.anIntArrayArrayArray16 == null) {
			this.anIntArrayArrayArray16 = new int[super.anInt8983][super.anInt8985][];
		}
		this.anIntArrayArrayArray17[arg0][arg1] = arg2;
		this.anIntArrayArrayArray13[arg0][arg1] = arg4;
		this.anIntArrayArrayArray12[arg0][arg1] = arg6;
		this.anIntArrayArrayArray15[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray14 != null) {
			this.anIntArrayArrayArray14[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray16 != null) {
			this.anIntArrayArrayArray16[arg0][arg1] = arg3;
		}
		@Pc(92) Class3_Sub33[] local92 = this.aClass3_Sub33ArrayArrayArray1[arg0][arg1] = new Class3_Sub33[arg6.length];
		for (@Pc(94) int local94 = 0; local94 < arg6.length; local94++) {
			@Pc(100) int local100 = arg8[local94];
			@Pc(104) int local104 = arg9[local94];
			if ((this.anInt2723 & 0x20) != 0 && local100 != -1 && local9.method4129(local100).aBoolean743) {
				local104 = 128;
				local100 = -1;
			}
			@Pc(146) long local146 = (long) (local104 << 14) | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28 | (long) local100;
			@Pc(152) Class3 local152;
			for (local152 = this.aClass25_9.method426(local146); local152 != null; local152 = this.aClass25_9.method429()) {
				@Pc(157) Class3_Sub33 local157 = (Class3_Sub33) local152;
				if (local157.anInt6103 == local100 && local157.aFloat140 == (float) local104 && arg10 == local157.anInt6093 && arg11 == local157.anInt6097 && local157.anInt6104 == arg12) {
					break;
				}
			}
			if (local152 == null) {
				local92[local94] = new Class3_Sub33(this, local100, local104, arg10, arg11, arg12);
				this.aClass25_9.method434(local146, local92[local94]);
			} else {
				local92[local94] = (Class3_Sub33) local152;
			}
		}
		if (arg13) {
			this.aByteArrayArray5[arg0][arg1] = (byte) (this.aByteArrayArray5[arg0][arg1] | 0x1);
		}
		if (this.anInt2739 < arg6.length) {
			this.anInt2739 = arg6.length;
		}
		this.lb += arg6.length;
	}

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method7716(@OriginalArg(0) Class3_Sub7_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass5_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(24) int local24 = arg1 - (this.aClass82_Sub3_5.anInt5841 * arg2 >> 8) >> this.aClass82_Sub3_5.anInt5857;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass82_Sub3_5.anInt5840 >> 8) >> this.aClass82_Sub3_5.anInt5857;
			return this.aClass5_1.method87(arg0, local24, local39);
		}
	}

	@OriginalMember(owner = "client!eha", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class3_Sub7_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass5_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass82_Sub3_5.anInt5841 * arg2 >> 8) >> this.aClass82_Sub3_5.anInt5857;
			@Pc(39) int local39 = arg3 - (this.aClass82_Sub3_5.anInt5840 * arg2 >> 8) >> this.aClass82_Sub3_5.anInt5857;
			this.aClass5_1.method91(arg0, local24, local39);
		}
	}

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method7714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method2277(arg1, arg5, arg6, arg3, arg4, arg2, arg0);
	}

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7721(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.lb <= 0) {
			return;
		}
		@Pc(16) Interface12 local16 = this.aClass82_Sub3_5.method5026(this.anInt2714);
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = 32767;
		@Pc(22) int local22 = -32768;
		for (@Pc(24) int local24 = 0; local24 < 4; local24++) {
			local18 = 0;
			@Pc(33) Buffer local33 = local16.method7573();
			if (local33 != null) {
				@Pc(41) Stream local41 = this.aClass82_Sub3_5.method4986(local33);
				@Pc(45) int local45;
				@Pc(54) int local54;
				@Pc(56) int local56;
				@Pc(75) short[] local75;
				@Pc(79) int local79;
				@Pc(87) int local87;
				if (Stream.c()) {
					for (local45 = arg1; local45 < arg3; local45++) {
						local54 = arg0 + local45 * super.anInt8983;
						for (local56 = arg0; local56 < arg2; local56++) {
							if (arg4[local56 - arg0][local45 - arg1]) {
								local75 = this.aShortArrayArray3[local54];
								if (local75 != null) {
									for (local79 = 0; local79 < local75.length; local79++) {
										local87 = local75[local79] & 0xFFFF;
										if (local20 > local87) {
											local20 = local87;
										}
										local18++;
										if (local87 > local22) {
											local22 = local87;
										}
										local41.c(local87);
									}
								}
							}
							local54++;
						}
					}
				} else {
					for (local45 = arg1; local45 < arg3; local45++) {
						local54 = local45 * super.anInt8983 + arg0;
						for (local56 = arg0; local56 < arg2; local56++) {
							if (arg4[local56 - arg0][local45 - arg1]) {
								local75 = this.aShortArrayArray3[local54];
								if (local75 != null) {
									for (local79 = 0; local79 < local75.length; local79++) {
										local87 = local75[local79] & 0xFFFF;
										if (local87 < local20) {
											local20 = local87;
										}
										local41.f(local87);
										local18++;
										if (local22 < local87) {
											local22 = local87;
										}
									}
								}
							}
							local54++;
						}
					}
				}
				local41.b();
				if (local16.method7574()) {
					break;
				}
			}
		}
		if (local18 <= 0) {
			return;
		}
		this.aClass82_Sub3_5.method4918();
		this.aClass82_Sub3_5.method4982(false);
		this.aClass82_Sub3_5.method5029(false);
		this.aClass82_Sub3_5.method4997(false);
		this.aClass82_Sub3_5.method4968(false);
		this.aClass82_Sub3_5.method4939(0);
		this.aClass82_Sub3_5.method4988(false, false, -2);
		this.aClass82_Sub3_5.method4972((Interface10) null);
		@Pc(264) Class31_Sub2 local264 = this.aClass82_Sub3_5.method4944();
		@Pc(269) float[] local269 = this.aClass82_Sub3_5.method4956();
		local269[1] = 0.0F;
		local269[9] = 0.0F;
		local269[10] = 1.0F / (this.aFloat50 - this.aFloat49);
		local269[11] = 0.0F;
		local269[7] = 0.0F;
		local269[12] = -(((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass82_Sub3_5.anInt5688) - 1.0F;
		local269[3] = 0.0F;
		local269[0] = (float) 1024 / ((float) super.anInt8986 * 128.0F * (float) this.aClass82_Sub3_5.anInt5688);
		local269[13] = 1.0F - ((float) (arg3 * 1024) / 128.0F + (float) 0) / (float) this.aClass82_Sub3_5.anInt5782;
		local269[8] = 0.0F;
		local269[15] = 1.0F;
		local269[14] = -this.aFloat49 / (this.aFloat50 - this.aFloat49);
		local269[5] = (float) 1024 / ((float) super.anInt8986 * 128.0F * (float) this.aClass82_Sub3_5.anInt5782);
		local269[6] = 0.0F;
		local269[4] = 0.0F;
		local269[2] = 0.0F;
		local264.method7670(1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F);
		this.aClass82_Sub3_5.method5041();
		this.aClass82_Sub3_5.method4961();
		if ((this.anInt2723 & 0x7) == 0) {
			this.aClass82_Sub3_5.method5029(false);
		} else {
			this.aClass82_Sub3_5.method5029(true);
			this.aClass82_Sub3_5.method4950();
		}
		this.aClass82_Sub3_5.method4920(false);
		this.aClass82_Sub3_5.method4995(0, this.anInterface22_1);
		this.aClass82_Sub3_5.method4995(1, this.anInterface22_2);
		this.aClass82_Sub3_5.method4960(this.aClass43_1);
		this.aClass82_Sub3_5.method4993(local22 + 1 - local20, local16, Static525.aClass376_6, local18 / 3, local20, 0);
		this.aClass82_Sub3_5.method4920(true);
	}
}
