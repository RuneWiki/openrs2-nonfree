import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aq")
public final class Class22_Sub1 extends Class22 {

	@OriginalMember(owner = "client!aq", name = "C", descriptor = "[I")
	public static final int[] anIntArray30 = new int[4096];

	@OriginalMember(owner = "client!aq", name = "E", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!aq", name = "s", descriptor = "I")
	private int anInt383;

	@OriginalMember(owner = "client!aq", name = "T", descriptor = "I")
	private int anInt392;

	@OriginalMember(owner = "client!aq", name = "r", descriptor = "Lclient!uo;")
	public Class356 aClass356_1;

	@OriginalMember(owner = "client!aq", name = "N", descriptor = "Lclient!uo;")
	private Class356 aClass356_2;

	@OriginalMember(owner = "client!aq", name = "o", descriptor = "I")
	private int anInt398;

	@OriginalMember(owner = "client!aq", name = "J", descriptor = "I")
	private int anInt399;

	@OriginalMember(owner = "client!aq", name = "y", descriptor = "Lclient!uo;")
	public Class356 aClass356_3;

	@OriginalMember(owner = "client!aq", name = "n", descriptor = "[Lclient!jm;")
	private Class5_Sub27[] aClass5_Sub27Array1;

	@OriginalMember(owner = "client!aq", name = "fb", descriptor = "Lclient!ml;")
	private Interface15 anInterface15_1;

	@OriginalMember(owner = "client!aq", name = "p", descriptor = "Lclient!uo;")
	public Class356 aClass356_4;

	@OriginalMember(owner = "client!aq", name = "db", descriptor = "Lclient!ef;")
	private final Class102 aClass102_5 = new Class102();

	@OriginalMember(owner = "client!aq", name = "M", descriptor = "Lclient!ffa;")
	public final Class57_Sub2 aClass57_Sub2_1;

	@OriginalMember(owner = "client!aq", name = "Z", descriptor = "I")
	private final int anInt375;

	@OriginalMember(owner = "client!aq", name = "k", descriptor = "[[F")
	private float[][] aFloatArrayArray1;

	@OriginalMember(owner = "client!aq", name = "R", descriptor = "I")
	public final int anInt378;

	@OriginalMember(owner = "client!aq", name = "Q", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!aq", name = "hb", descriptor = "[[B")
	private final byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!aq", name = "D", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!aq", name = "A", descriptor = "I")
	private final int anInt379;

	@OriginalMember(owner = "client!aq", name = "u", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!aq", name = "F", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!aq", name = "eb", descriptor = "[[S")
	public final short[][] aShortArrayArray1;

	@OriginalMember(owner = "client!aq", name = "v", descriptor = "[[B")
	private byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!aq", name = "w", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!aq", name = "bb", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!aq", name = "q", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!aq", name = "L", descriptor = "[[[Lclient!jm;")
	private Class5_Sub27[][][] aClass5_Sub27ArrayArrayArray1;

	@OriginalMember(owner = "client!aq", name = "Y", descriptor = "Lclient!qha;")
	private Class291 aClass291_1;

	@OriginalMember(owner = "client!aq", name = "K", descriptor = "Lclient!pc;")
	private Class275 aClass275_1;

	static {
		for (@Pc(135) int local135 = 0; local135 < 4096; local135++) {
			anIntArray30[local135] = Static53.method803(local135);
		}
	}

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(Lclient!ffa;IIII[[I[[II)V")
	public Class22_Sub1(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass57_Sub2_1 = arg0;
		this.anInt375 = super.anInt9378 - 2;
		this.aFloatArrayArray1 = new float[super.anInt9376 + 1][super.anInt9375 + 1];
		this.anInt378 = arg2;
		this.anIntArrayArrayArray2 = new int[arg3][arg4][];
		this.aByteArrayArray1 = new byte[arg3][arg4];
		this.anIntArrayArrayArray5 = new int[arg3][arg4][];
		this.anInt379 = 0x1 << this.anInt375;
		this.anIntArrayArrayArray6 = new int[arg3][arg4][];
		this.aFloatArrayArray3 = new float[super.anInt9376 + 1][super.anInt9375 + 1];
		this.aShortArrayArray1 = new short[arg3 * arg4][];
		this.aByteArrayArray2 = new byte[arg3 + 1][arg4 + 1];
		this.anIntArrayArrayArray4 = new int[arg3][arg4][];
		this.anIntArrayArrayArray1 = new int[arg3][arg4][];
		this.aFloatArrayArray2 = new float[super.anInt9376 + 1][super.anInt9375 + 1];
		this.aClass5_Sub27ArrayArrayArray1 = new Class5_Sub27[arg3][arg4][];
		for (@Pc(115) int local115 = 1; local115 < super.anInt9375; local115++) {
			for (@Pc(121) int local121 = 1; super.anInt9376 > local121; local121++) {
				@Pc(139) int local139 = arg6[local121 + 1][local115] - arg6[local121 - 1][local115];
				@Pc(156) int local156 = arg6[local121][local115 + 1] - arg6[local121][local115 - 1];
				@Pc(176) float local176 = (float) (1.0D / Math.sqrt((double) (arg7 * 4 * arg7 + local139 * local139 + local156 * local156)));
				this.aFloatArrayArray2[local121][local115] = local176 * (float) local139;
				this.aFloatArrayArray3[local121][local115] = (float) (-arg7 * 2) * local176;
				this.aFloatArrayArray1[local121][local115] = (float) local156 * local176;
			}
		}
		this.aClass291_1 = new Class291(128);
		if ((this.anInt378 & 0x10) != 0) {
			this.aClass275_1 = new Class275(this.aClass57_Sub2_1, this);
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!uf;[I)V")
	@Override
	public void method8043(@OriginalArg(0) Class5_Sub43 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass102_5.method1921(new Class5_Sub41(this.aClass57_Sub2_1, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!aq", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.anInt398 > 0) {
			@Pc(21) byte[][] local21 = new byte[super.anInt9376 + 1][super.anInt9375 + 1];
			@Pc(27) int local27;
			for (@Pc(23) int local23 = 1; super.anInt9376 > local23; local23++) {
				for (local27 = 1; local27 < super.anInt9375; local27++) {
					local21[local23][local27] = (byte) ((this.aByteArrayArray2[local23 + 1][local27] >> 3) + (this.aByteArrayArray2[local23 - 1][local27] >> 2) + (this.aByteArrayArray2[local23][local27 + -1] >> 2) + (this.aByteArrayArray2[local23][local27 + 1] >> 3) + (this.aByteArrayArray2[local23][local27] >> 1));
				}
			}
			this.aClass5_Sub27Array1 = new Class5_Sub27[this.aClass291_1.method6995()];
			this.aClass291_1.method6990(this.aClass5_Sub27Array1);
			for (local27 = 0; local27 < this.aClass5_Sub27Array1.length; local27++) {
				this.aClass5_Sub27Array1[local27].method4163(this.anInt398);
			}
			@Pc(141) int local141 = 24;
			if (this.anIntArrayArrayArray3 != null) {
				local141 += 4;
			}
			if ((this.anInt378 & 0x7) != 0) {
				local141 += 12;
			}
			@Pc(167) NativeHeapBuffer local167 = this.aClass57_Sub2_1.aNativeHeap2.a(local141 * this.anInt398, false);
			@Pc(172) Stream local172 = new Stream(local167);
			@Pc(176) Class5_Sub27[] local176 = new Class5_Sub27[this.anInt398];
			@Pc(183) int local183 = Static228.method3242(this.anInt398 / 4);
			if (local183 < 1) {
				local183 = 1;
			}
			@Pc(195) Class291 local195 = new Class291(local183);
			@Pc(199) Class5_Sub27[] local199 = new Class5_Sub27[this.anInt399];
			@Pc(205) int local205;
			for (@Pc(201) int local201 = 0; super.anInt9376 > local201; local201++) {
				for (local205 = 0; super.anInt9375 > local205; local205++) {
					if (this.anIntArrayArrayArray1[local201][local205] != null) {
						@Pc(223) Class5_Sub27[] local223 = this.aClass5_Sub27ArrayArrayArray1[local201][local205];
						@Pc(230) int[] local230 = this.anIntArrayArrayArray4[local201][local205];
						@Pc(237) int[] local237 = this.anIntArrayArrayArray6[local201][local205];
						@Pc(244) int[] local244 = this.anIntArrayArrayArray2[local201][local205];
						@Pc(251) int[] local251 = this.anIntArrayArrayArray1[local201][local205];
						@Pc(264) int[] local264 = this.anIntArrayArrayArray5 == null ? null : this.anIntArrayArrayArray5[local201][local205];
						@Pc(277) int[] local277 = this.anIntArrayArrayArray3 == null ? null : this.anIntArrayArrayArray3[local201][local205];
						if (local244 == null) {
							local244 = local251;
						}
						@Pc(288) float local288 = this.aFloatArrayArray2[local201][local205];
						@Pc(295) float local295 = this.aFloatArrayArray3[local201][local205];
						@Pc(302) float local302 = this.aFloatArrayArray1[local201][local205];
						@Pc(311) float local311 = this.aFloatArrayArray2[local201][local205 + 1];
						@Pc(320) float local320 = this.aFloatArrayArray3[local201][local205 + 1];
						@Pc(329) float local329 = this.aFloatArrayArray1[local201][local205 + 1];
						@Pc(340) float local340 = this.aFloatArrayArray2[local201 + 1][local205 + 1];
						@Pc(351) float local351 = this.aFloatArrayArray3[local201 + 1][local205 + 1];
						@Pc(362) float local362 = this.aFloatArrayArray1[local201 + 1][local205 + 1];
						@Pc(371) float local371 = this.aFloatArrayArray2[local201 + 1][local205];
						@Pc(380) float local380 = this.aFloatArrayArray3[local201 + 1][local205];
						@Pc(389) float local389 = this.aFloatArrayArray1[local201 + 1][local205];
						@Pc(397) int local397 = local21[local201][local205] & 0xFF;
						@Pc(407) int local407 = local21[local201][local205 + 1] & 0xFF;
						@Pc(419) int local419 = local21[local201 + 1][local205 + 1] & 0xFF;
						@Pc(429) int local429 = local21[local201 + 1][local205] & 0xFF;
						@Pc(431) int local431 = 0;
						@Pc(443) int local443;
						label337: for (@Pc(433) int local433 = 0; local433 < local251.length; local433++) {
							@Pc(441) Class5_Sub27 local441 = local223[local433];
							for (local443 = 0; local443 < local431; local443++) {
								if (local441 == local199[local443]) {
									continue label337;
								}
							}
							local199[local431++] = local441;
						}
						@Pc(493) short[] local493 = this.aShortArrayArray1[super.anInt9376 * local205 + local201] = new short[local251.length];
						for (local443 = 0; local443 < local251.length; local443++) {
							@Pc(507) int local507 = (local201 << super.anInt9378) + local230[local443];
							@Pc(517) int local517 = (local205 << super.anInt9378) + local237[local443];
							@Pc(522) int local522 = local507 >> this.anInt375;
							@Pc(527) int local527 = local517 >> this.anInt375;
							@Pc(531) int local531 = local251[local443];
							@Pc(535) int local535 = local244[local443];
							@Pc(544) int local544 = local264 == null ? 0 : local264[local443];
							@Pc(562) long local562 = (long) (local522 << 16) | (long) local535 << 48 | (long) local531 << 32 | (long) local527;
							@Pc(566) int local566 = local230[local443];
							@Pc(570) int local570 = local237[local443];
							@Pc(572) byte local572 = 74;
							@Pc(574) int local574 = 0;
							@Pc(597) float local597;
							@Pc(595) float local595;
							@Pc(603) float local603;
							@Pc(674) float local674;
							@Pc(601) int local601;
							if (local566 == 0 && local570 == 0) {
								local603 = local302;
								local595 = local295;
								local597 = local288;
								local601 = local572 - local397;
							} else if (local566 == 0 && super.anInt9377 == local570) {
								local595 = local320;
								local597 = local311;
								local601 = local572 - local407;
								local603 = local329;
							} else if (local566 == super.anInt9377 && super.anInt9377 == local570) {
								local597 = local340;
								local601 = local572 - local419;
								local603 = local362;
								local595 = local351;
							} else if (super.anInt9377 == local566 && local570 == 0) {
								local601 = local572 - local429;
								local597 = local371;
								local595 = local380;
								local603 = local389;
							} else {
								@Pc(650) float local650 = (float) local566 / (float) super.anInt9377;
								@Pc(657) float local657 = (float) local570 / (float) super.anInt9377;
								@Pc(665) float local665 = local288 + (local371 - local288) * local650;
								local674 = local650 * (local380 - local295) + local295;
								@Pc(682) float local682 = (local389 - local302) * local650 + local302;
								@Pc(690) float local690 = (local340 - local311) * local650 + local311;
								@Pc(698) float local698 = (local351 - local320) * local650 + local320;
								local595 = local674 + local657 * (local698 - local674);
								local597 = (local690 - local665) * local657 + local665;
								@Pc(722) float local722 = local329 + local650 * (local362 - local329);
								local603 = (local722 - local682) * local657 + local682;
								@Pc(742) int local742 = (local566 * (local429 - local397) >> super.anInt9378) + local397;
								@Pc(755) int local755 = local407 + ((local419 - local407) * local566 >> super.anInt9378);
								local601 = local572 - local742 - (local570 * (local755 - local742) >> super.anInt9378);
							}
							@Pc(795) float local795 = 1.0F;
							if (local531 != -1) {
								@Pc(807) int local807 = local601 * (local531 & 0x7F) >> 7;
								if (local807 < 2) {
									local807 = 2;
								} else if (local807 > 126) {
									local807 = 126;
								}
								if ((this.anInt378 & 0x7) == 0) {
									local795 = local603 * this.aClass57_Sub2_1.lb[2] + this.aClass57_Sub2_1.lb[0] * local597 + this.aClass57_Sub2_1.lb[1] * local595;
									local795 = this.aClass57_Sub2_1.aFloat43 + local795 * (local795 > 0.0F ? this.aClass57_Sub2_1.aFloat42 : this.aClass57_Sub2_1.aFloat36);
								}
								local574 = Static560.anIntArray534[local807 | local531 & 0xFF80];
							}
							@Pc(884) Class5 local884 = null;
							if ((this.anInt379 - 1 & local507) == 0 && (local517 & this.anInt379 - 1) == 0) {
								local884 = local195.method6993(local562, 1);
							}
							@Pc(919) int local919;
							@Pc(956) int local956;
							if (local884 == null) {
								if (local535 == local531) {
									local956 = local574;
								} else {
									@Pc(966) int local966 = local601 * (local535 & 0x7F) >> 7;
									if (local966 < 2) {
										local966 = 2;
									} else if (local966 > 126) {
										local966 = 126;
									}
									local956 = Static560.anIntArray534[local966 | local535 & 0xFF80];
									if ((this.anInt378 & 0x7) == 0) {
										local674 = local603 * this.aClass57_Sub2_1.lb[2] + local595 * this.aClass57_Sub2_1.lb[1] + local597 * this.aClass57_Sub2_1.lb[0];
										local674 = this.aClass57_Sub2_1.aFloat43 + (local795 > 0.0F ? this.aClass57_Sub2_1.aFloat42 : this.aClass57_Sub2_1.aFloat36) * local795;
										@Pc(1047) int local1047 = local956 >> 16 & 0xFF;
										@Pc(1053) int local1053 = local956 >> 8 & 0xFF;
										@Pc(1057) int local1057 = local956 & 0xFF;
										local1047 = (int) ((float) local1047 * local674);
										if (local1047 < 0) {
											local1047 = 0;
										} else if (local1047 > 255) {
											local1047 = 255;
										}
										local1053 = (int) ((float) local1053 * local674);
										local1057 = (int) ((float) local1057 * local674);
										if (local1053 < 0) {
											local1053 = 0;
										} else if (local1053 > 255) {
											local1053 = 255;
										}
										if (local1057 < 0) {
											local1057 = 0;
										} else if (local1057 > 255) {
											local1057 = 255;
										}
										local956 = local1053 << 8 | local1047 << 16 | local1057;
									}
								}
								if (this.aClass57_Sub2_1.aBoolean216) {
									local172.b((float) local507);
									local172.b((float) (local544 + this.method8032(local507, local517)));
									local172.b((float) local517);
									local172.a((byte) (local956 >> 16));
									local172.a((byte) (local956 >> 8));
									local172.a((byte) local956);
									local172.a(-1);
									local172.b((float) local507);
									local172.b((float) local517);
									if (this.anIntArrayArrayArray3 != null) {
										local172.b((float) (local277 == null ? 0 : local277[local443] - 1));
									}
									if ((this.anInt378 & 0x7) != 0) {
										local172.b(local597);
										local172.b(local595);
										local172.b(local603);
									}
								} else {
									local172.a((float) local507);
									local172.a((float) (local544 + this.method8032(local507, local517)));
									local172.a((float) local517);
									local172.a((byte) (local956 >> 16));
									local172.a((byte) (local956 >> 8));
									local172.a((byte) local956);
									local172.a(-1);
									local172.a((float) local507);
									local172.a((float) local517);
									if (this.anIntArrayArrayArray3 != null) {
										local172.a((float) (local277 == null ? 0 : local277[local443] - 1));
									}
									if ((this.anInt378 & 0x7) != 0) {
										local172.a(local597);
										local172.a(local595);
										local172.a(local603);
									}
								}
								local919 = this.anInt383++;
								local493[local443] = (short) local919;
								if (local531 != -1) {
									local176[local919] = local223[local443];
								}
								local195.method6984(local562, new Class5_Sub17(local493[local443]));
							} else {
								local493[local443] = ((Class5_Sub17) local884).aShort35;
								local919 = local493[local443] & 0xFFFF;
								if (local531 != -1 && local176[local919].aLong314 > local223[local443].aLong314) {
									local176[local919] = local223[local443];
								}
							}
							for (local956 = 0; local956 < local431; local956++) {
								local199[local956].method4160(local919, local574, local795, local601);
							}
							this.anInt392++;
						}
					}
				}
			}
			for (local205 = 0; local205 < this.anInt383; local205++) {
				@Pc(1402) Class5_Sub27 local1402 = local176[local205];
				if (local1402 != null) {
					local1402.method4164(local205);
				}
			}
			@Pc(1437) int local1437;
			for (@Pc(1417) int local1417 = 0; super.anInt9376 > local1417; local1417++) {
				for (@Pc(1421) int local1421 = 0; super.anInt9375 > local1421; local1421++) {
					@Pc(1433) short[] local1433 = this.aShortArrayArray1[local1417 + local1421 * super.anInt9376];
					if (local1433 != null) {
						local1437 = 0;
						@Pc(1439) int local1439 = 0;
						while (local1433.length > local1439) {
							@Pc(1448) int local1448 = local1433[local1439++] & 0xFFFF;
							@Pc(1455) int local1455 = local1433[local1439++] & 0xFFFF;
							@Pc(1462) int local1462 = local1433[local1439++] & 0xFFFF;
							@Pc(1466) Class5_Sub27 local1466 = local176[local1448];
							@Pc(1470) Class5_Sub27 local1470 = local176[local1455];
							@Pc(1474) Class5_Sub27 local1474 = local176[local1462];
							@Pc(1476) Class5_Sub27 local1476 = null;
							if (local1466 != null) {
								local1466.method4159(local1421, local1417, local1437);
								local1476 = local1466;
							}
							if (local1470 != null) {
								local1470.method4159(local1421, local1417, local1437);
								if (local1476 == null || local1470.aLong314 < local1476.aLong314) {
									local1476 = local1470;
								}
							}
							if (local1474 != null) {
								local1474.method4159(local1421, local1417, local1437);
								if (local1476 == null || local1476.aLong314 > local1474.aLong314) {
									local1476 = local1474;
								}
							}
							if (local1476 != null) {
								if (local1466 != null) {
									local1476.method4164(local1448);
								}
								if (local1470 != null) {
									local1476.method4164(local1455);
								}
								if (local1474 != null) {
									local1476.method4164(local1462);
								}
								local1476.method4159(local1421, local1417, local1437);
							}
							local1437++;
						}
					}
				}
			}
			local172.c();
			this.anInterface15_1 = this.aClass57_Sub2_1.method2344(local167, local172.a(), local141);
			this.aClass356_1 = new Class356(this.anInterface15_1, 5126, 3, 0);
			this.aClass356_2 = new Class356(this.anInterface15_1, 5121, 4, 12);
			@Pc(1635) byte local1635;
			if (this.anIntArrayArrayArray3 == null) {
				local1635 = 24;
				this.aClass356_3 = new Class356(this.anInterface15_1, 5126, 2, 16);
			} else {
				local1635 = 28;
				this.aClass356_3 = new Class356(this.anInterface15_1, 5126, 3, 16);
			}
			if ((this.anInt378 & 0x7) != 0) {
				this.aClass356_4 = new Class356(this.anInterface15_1, 5126, 3, local1635);
			}
			@Pc(1684) long[] local1684 = new long[this.aClass5_Sub27Array1.length];
			for (local1437 = 0; local1437 < this.aClass5_Sub27Array1.length; local1437++) {
				@Pc(1695) Class5_Sub27 local1695 = this.aClass5_Sub27Array1[local1437];
				local1684[local1437] = local1695.aLong314;
				local1695.method4162(this.anInt383);
			}
			Static289.method9261(local1684, this.aClass5_Sub27Array1);
			if (this.aClass275_1 != null) {
				this.aClass275_1.method6511();
			}
		} else {
			this.aClass275_1 = null;
		}
		this.anIntArrayArrayArray2 = null;
		this.anIntArrayArrayArray4 = this.anIntArrayArrayArray6 = null;
		this.aClass5_Sub27ArrayArrayArray1 = null;
		this.anIntArrayArrayArray1 = null;
		this.anIntArrayArrayArray3 = null;
		this.aFloatArrayArray2 = this.aFloatArrayArray3 = this.aFloatArrayArray1 = null;
		this.aByteArrayArray2 = null;
		this.aClass291_1 = null;
		this.anIntArrayArrayArray5 = null;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method8037(@OriginalArg(0) Class5_Sub5_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass275_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(28) int local28 = arg1 - (arg2 * this.aClass57_Sub2_1.anInt2769 >> 8) >> this.aClass57_Sub2_1.anInt2749;
			@Pc(43) int local43 = arg3 - (arg2 * this.aClass57_Sub2_1.anInt2793 >> 8) >> this.aClass57_Sub2_1.anInt2749;
			return this.aClass275_1.method6510(local43, arg0, local28);
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IILclient!fi;I)V")
	private void method375(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub5_Sub4_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray4[arg0][arg2];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray6[arg0][arg2];
		@Pc(22) int local22 = local12.length;
		if (this.aClass57_Sub2_1.anIntArray145.length < local22) {
			this.aClass57_Sub2_1.anIntArray145 = new int[local22];
			this.aClass57_Sub2_1.anIntArray146 = new int[local22];
		}
		@Pc(48) int[] local48 = this.aClass57_Sub2_1.anIntArray145;
		@Pc(52) int[] local52 = this.aClass57_Sub2_1.anIntArray146;
		for (@Pc(54) int local54 = 0; local54 < local22; local54++) {
			local48[local54] = local12[local54] >> this.aClass57_Sub2_1.anInt2749;
			local52[local54] = local19[local54] >> this.aClass57_Sub2_1.anInt2749;
		}
		@Pc(84) int local84 = 0;
		while (local22 > local84) {
			@Pc(92) int local92 = local48[local84];
			@Pc(97) int local97 = local52[local84++];
			@Pc(101) int local101 = local48[local84];
			@Pc(106) int local106 = local52[local84++];
			@Pc(110) int local110 = local48[local84];
			@Pc(115) int local115 = local52[local84++];
			if ((local106 - local115) * (local92 - local101) - (local110 - local101) * (local106 - local97) > 0) {
				arg1.method2483(local106, local110, local115, local97, local92, local101);
			}
		}
	}

	@OriginalMember(owner = "client!aq", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg3 != null && this.anIntArrayArrayArray5 == null) {
			this.anIntArrayArrayArray5 = new int[super.anInt9376][super.anInt9375][];
		}
		@Pc(25) Interface1 local25 = this.aClass57_Sub2_1.anInterface1_11;
		if (arg5 != null && this.anIntArrayArrayArray3 == null) {
			this.anIntArrayArrayArray3 = new int[super.anInt9376][super.anInt9375][];
		}
		this.anIntArrayArrayArray4[arg0][arg1] = arg2;
		this.anIntArrayArrayArray6[arg0][arg1] = arg4;
		this.anIntArrayArrayArray1[arg0][arg1] = arg6;
		this.anIntArrayArrayArray2[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray3 != null) {
			this.anIntArrayArrayArray3[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray5 != null) {
			this.anIntArrayArrayArray5[arg0][arg1] = arg3;
		}
		@Pc(104) Class5_Sub27[] local104 = this.aClass5_Sub27ArrayArrayArray1[arg0][arg1] = new Class5_Sub27[arg6.length];
		for (@Pc(106) int local106 = 0; local106 < arg6.length; local106++) {
			@Pc(114) int local114 = arg8[local106];
			@Pc(118) int local118 = arg9[local106];
			if ((this.anInt378 & 0x20) != 0 && local114 != -1 && local25.method2863(local114).aBoolean482) {
				local114 = -1;
				local118 = 128;
			}
			@Pc(164) long local164 = (long) local114 | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28 | (long) (local118 << 14);
			@Pc(170) Class5 local170;
			for (local170 = this.aClass291_1.method6993(local164, 1); local170 != null; local170 = this.aClass291_1.method6985(-77)) {
				@Pc(177) Class5_Sub27 local177 = (Class5_Sub27) local170;
				if (local114 == local177.anInt4914 && local177.aFloat66 == (float) local118 && local177.anInt4912 == arg10 && local177.anInt4909 == arg11 && arg12 == local177.anInt4908) {
					break;
				}
			}
			if (local170 == null) {
				local104[local106] = new Class5_Sub27(this, local114, local118, arg10, arg11, arg12);
				this.aClass291_1.method6984(local164, local104[local106]);
			} else {
				local104[local106] = (Class5_Sub27) local170;
			}
		}
		if (arg13) {
			this.aByteArrayArray1[arg0][arg1] = (byte) (this.aByteArrayArray1[arg0][arg1] | 0x1);
		}
		if (this.anInt399 < arg6.length) {
			this.anInt399 = arg6.length;
		}
		this.anInt398 += arg6.length;
	}

	@OriginalMember(owner = "client!aq", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class5_Sub5_Sub4 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub5_Sub4 arg2) {
		if ((this.aByteArrayArray1[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(22) int local22 = super.anInt9377 >> this.aClass57_Sub2_1.anInt2749;
		@Pc(25) Class5_Sub5_Sub4_Sub1 local25 = (Class5_Sub5_Sub4_Sub1) arg2;
		@Pc(37) Class5_Sub5_Sub4_Sub1 local37;
		if (local25 != null && local25.method2487(local22, local22)) {
			local37 = local25;
			local25.method2485();
		} else {
			local37 = new Class5_Sub5_Sub4_Sub1(this.aClass57_Sub2_1, local22, local22);
		}
		local37.method2482(local22, 0, local22, 0);
		this.method375(arg0, local37, arg1);
		return local37;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(II)V")
	@Override
	public void method8033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method8039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		@Pc(8) int local8 = arg9.length;
		@Pc(13) int[] local13 = new int[local8 * 3];
		@Pc(18) int[] local18 = new int[local8 * 3];
		@Pc(23) int[] local23 = new int[local8 * 3];
		@Pc(28) int[] local28 = new int[local8 * 3];
		@Pc(33) int[] local33 = new int[local8 * 3];
		@Pc(38) int[] local38 = new int[local8 * 3];
		@Pc(48) int[] local48 = arg3 == null ? null : new int[local8 * 3];
		@Pc(58) int[] local58 = arg5 == null ? null : new int[local8 * 3];
		@Pc(60) int local60 = 0;
		for (@Pc(62) int local62 = 0; local62 < local8; local62++) {
			@Pc(68) int local68 = arg6[local62];
			@Pc(72) int local72 = arg7[local62];
			@Pc(76) int local76 = arg8[local62];
			local13[local60] = arg2[local68];
			local18[local60] = arg4[local68];
			local23[local60] = arg9[local62];
			local33[local60] = arg11[local62];
			local38[local60] = arg12[local62];
			local28[local60] = arg10 == null ? arg9[local62] : arg10[local62];
			if (arg3 != null) {
				local48[local60] = arg3[local68];
			}
			if (arg5 != null) {
				local58[local60] = arg5[local68];
			}
			local60++;
			local13[local60] = arg2[local72];
			local18[local60] = arg4[local72];
			local23[local60] = arg9[local62];
			local33[local60] = arg11[local62];
			local38[local60] = arg12[local62];
			local28[local60] = arg10 == null ? arg9[local62] : arg10[local62];
			if (arg3 != null) {
				local48[local60] = arg3[local72];
			}
			if (arg5 != null) {
				local58[local60] = arg5[local72];
			}
			local60++;
			local13[local60] = arg2[local76];
			local18[local60] = arg4[local76];
			local23[local60] = arg9[local62];
			local33[local60] = arg11[local62];
			local38[local60] = arg12[local62];
			local28[local60] = arg10 == null ? arg9[local62] : arg10[local62];
			if (arg3 != null) {
				local48[local60] = arg3[local76];
			}
			if (arg5 != null) {
				local58[local60] = arg5[local76];
			}
			local60++;
		}
		this.U(arg0, arg1, local13, local48, local18, local58, local23, local28, local33, local38, arg13, arg14, arg15, false);
	}

	@OriginalMember(owner = "client!aq", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class5_Sub5_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass275_1 != null && arg0 != null) {
			@Pc(27) int local27 = arg1 - (arg2 * this.aClass57_Sub2_1.anInt2769 >> 8) >> this.aClass57_Sub2_1.anInt2749;
			@Pc(42) int local42 = arg3 - (this.aClass57_Sub2_1.anInt2793 * arg2 >> 8) >> this.aClass57_Sub2_1.anInt2749;
			this.aClass275_1.method6505(local27, local42, arg0);
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IZIIIII[[Z)V")
	private void method376(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean[][] arg6) {
		if (this.aClass5_Sub27Array1 == null) {
			return;
		}
		@Pc(10) int local10 = arg3 + arg3 + 1;
		@Pc(14) int local14 = local10 * local10;
		if (local14 > this.aClass57_Sub2_1.anIntArray147.length) {
			this.aClass57_Sub2_1.anIntArray147 = new int[local14];
		}
		if (this.anInt392 * 2 > this.aClass57_Sub2_1.aClass5_Sub23_Sub1_1.aByteArray102.length) {
			this.aClass57_Sub2_1.aClass5_Sub23_Sub1_1 = new Class5_Sub23_Sub1(this.anInt392 * 2);
		}
		@Pc(58) int local58 = arg4 - arg3;
		@Pc(60) int local60 = local58;
		if (local58 < 0) {
			local58 = 0;
		}
		@Pc(69) int local69 = arg0 - arg3;
		@Pc(71) int local71 = local69;
		if (local69 < 0) {
			local69 = 0;
		}
		@Pc(82) int local82 = arg3 + arg4;
		if (super.anInt9376 - 1 < local82) {
			local82 = super.anInt9376 - 1;
		}
		@Pc(102) int local102 = arg0 + arg3;
		if (super.anInt9375 - 1 < local102) {
			local102 = super.anInt9375 - 1;
		}
		@Pc(115) int local115 = 0;
		@Pc(119) int[] local119 = this.aClass57_Sub2_1.anIntArray147;
		@Pc(132) int local132;
		for (@Pc(121) int local121 = local58; local121 <= local82; local121++) {
			@Pc(130) boolean[] local130 = arg6[local121 - local60];
			for (local132 = local69; local132 <= local102; local132++) {
				if (local130[local132 - local71]) {
					local119[local115++] = local121 + local132 * super.anInt9376;
				}
			}
		}
		if (arg5 == -1) {
			this.aClass57_Sub2_1.method2333();
		} else {
			this.aClass57_Sub2_1.method2383((float) arg5);
			this.aClass57_Sub2_1.method2326();
		}
		this.aClass57_Sub2_1.method2335((this.anInt378 & 0x7) != 0);
		for (@Pc(211) int local211 = 0; local211 < this.aClass5_Sub27Array1.length; local211++) {
			this.aClass5_Sub27Array1[local211].method4161(local119, local115);
		}
		if (!this.aClass102_5.method1926()) {
			local132 = this.aClass57_Sub2_1.anInt2785;
			@Pc(250) int local250 = this.aClass57_Sub2_1.anInt2766;
			this.aClass57_Sub2_1.L(0, local250, this.aClass57_Sub2_1.anInt2765);
			this.aClass57_Sub2_1.method2335(false);
			this.aClass57_Sub2_1.method2309(false);
			this.aClass57_Sub2_1.method2372(128);
			this.aClass57_Sub2_1.method2358(-2);
			this.aClass57_Sub2_1.method2362(this.aClass57_Sub2_1.aClass32_Sub1_2);
			this.aClass57_Sub2_1.method2313(7681, 8448);
			this.aClass57_Sub2_1.method2368(34166, 0, 770);
			this.aClass57_Sub2_1.method2312(34167, 0);
			for (@Pc(310) Class5 local310 = this.aClass102_5.method1916(); local310 != null; local310 = this.aClass102_5.method1915()) {
				@Pc(315) Class5_Sub41 local315 = (Class5_Sub41) local310;
				local315.method6731(arg4, arg0, arg3, arg6);
			}
			this.aClass57_Sub2_1.method2368(5890, 0, 768);
			this.aClass57_Sub2_1.method2312(5890, 0);
			this.aClass57_Sub2_1.method2362((Class32) null);
			this.aClass57_Sub2_1.L(local132, local250, this.aClass57_Sub2_1.anInt2765);
		}
		if (this.aClass275_1 == null) {
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		this.aClass57_Sub2_1.method2353((Class356) null, this.aClass356_1, (Class356) null, this.aClass356_3);
		this.aClass275_1.method6507(arg6, arg1, arg4, arg3, arg0);
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!aq", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray2[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray2[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method8035(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt398 <= 0) {
			return;
		}
		this.aClass57_Sub2_1.method2314();
		this.aClass57_Sub2_1.method2327(false);
		this.aClass57_Sub2_1.method2335(false);
		this.aClass57_Sub2_1.method2310(false);
		this.aClass57_Sub2_1.method2309(false);
		this.aClass57_Sub2_1.method2372(0);
		this.aClass57_Sub2_1.method2358(-2);
		this.aClass57_Sub2_1.method2362((Class32) null);
		Static569.aFloatArray104[11] = 0.0F;
		Static569.aFloatArray104[15] = 1.0F;
		Static569.aFloatArray104[12] = -(((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass57_Sub2_1.anInt2652) - 1.0F;
		Static569.aFloatArray104[13] = 1.0F - ((float) (arg3 * 1024) / 128.0F + (float) 0) / (float) this.aClass57_Sub2_1.anInt2598;
		Static569.aFloatArray104[9] = 0.0F;
		Static569.aFloatArray104[1] = 0.0F;
		Static569.aFloatArray104[10] = 0.0F;
		Static569.aFloatArray104[6] = 0.0F;
		Static569.aFloatArray104[2] = 0.0F;
		Static569.aFloatArray104[5] = (float) 1024 / ((float) this.aClass57_Sub2_1.anInt2598 * (float) super.anInt9377 * 128.0F);
		Static569.aFloatArray104[7] = 0.0F;
		Static569.aFloatArray104[14] = 0.0F;
		Static569.aFloatArray104[4] = 0.0F;
		Static569.aFloatArray104[8] = 0.0F;
		Static569.aFloatArray104[3] = 0.0F;
		Static569.aFloatArray104[0] = (float) 1024 / ((float) this.aClass57_Sub2_1.anInt2652 * 128.0F * (float) super.anInt9377);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static569.aFloatArray104, 0);
		Static569.aFloatArray104[5] = 0.0F;
		Static569.aFloatArray104[12] = 0.0F;
		Static569.aFloatArray104[11] = 0.0F;
		Static569.aFloatArray104[4] = 0.0F;
		Static569.aFloatArray104[6] = 1.0F;
		Static569.aFloatArray104[2] = 0.0F;
		Static569.aFloatArray104[15] = 1.0F;
		Static569.aFloatArray104[14] = 0.0F;
		Static569.aFloatArray104[9] = 1.0F;
		Static569.aFloatArray104[10] = 0.0F;
		Static569.aFloatArray104[1] = 0.0F;
		Static569.aFloatArray104[0] = 1.0F;
		Static569.aFloatArray104[3] = 0.0F;
		Static569.aFloatArray104[8] = 0.0F;
		Static569.aFloatArray104[7] = 0.0F;
		Static569.aFloatArray104[13] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static569.aFloatArray104, 0);
		if ((this.anInt378 & 0x7) == 0) {
			this.aClass57_Sub2_1.method2335(false);
		} else {
			this.aClass57_Sub2_1.method2335(true);
			this.aClass57_Sub2_1.method2367();
		}
		this.aClass57_Sub2_1.method2353(this.aClass356_4, this.aClass356_1, this.aClass356_2, this.aClass356_3);
		if (this.anInt392 * 2 <= this.aClass57_Sub2_1.aClass5_Sub23_Sub1_1.aByteArray102.length) {
			this.aClass57_Sub2_1.aClass5_Sub23_Sub1_1.anInt9869 = 0;
		} else {
			this.aClass57_Sub2_1.aClass5_Sub23_Sub1_1 = new Class5_Sub23_Sub1(this.anInt392 * 2);
		}
		@Pc(324) int local324 = 0;
		@Pc(328) Class5_Sub23_Sub1 local328 = this.aClass57_Sub2_1.aClass5_Sub23_Sub1_1;
		@Pc(334) int local334;
		@Pc(343) int local343;
		@Pc(345) int local345;
		@Pc(365) short[] local365;
		@Pc(369) int local369;
		if (this.aClass57_Sub2_1.aBoolean216) {
			for (local334 = arg1; local334 < arg3; local334++) {
				local343 = local334 * super.anInt9376 + arg0;
				for (local345 = arg0; local345 < arg2; local345++) {
					if (arg4[local345 - arg0][local334 - arg1]) {
						local365 = this.aShortArrayArray1[local343];
						if (local365 != null) {
							for (local369 = 0; local369 < local365.length; local369++) {
								local328.method8480(local365[local369] & 0xFFFF);
								local324++;
							}
						}
					}
					local343++;
				}
			}
		} else {
			for (local334 = arg1; local334 < arg3; local334++) {
				local343 = arg0 + local334 * super.anInt9376;
				for (local345 = arg0; local345 < arg2; local345++) {
					if (arg4[local345 - arg0][local334 - arg1]) {
						local365 = this.aShortArrayArray1[local343];
						if (local365 != null) {
							for (local369 = 0; local369 < local365.length; local369++) {
								local328.method8539(local365[local369] & 0xFFFF);
								local324++;
							}
						}
					}
					local343++;
				}
			}
		}
		if (local324 > 0) {
			@Pc(508) Class38_Sub2 local508 = new Class38_Sub2(this.aClass57_Sub2_1, 5123, local328.aByteArray102, local328.anInt9869);
			this.aClass57_Sub2_1.method2323(local508, local324, 0);
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method8040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method376(arg1, arg4, arg5, arg2, arg0, -1, arg3);
	}

	@OriginalMember(owner = "client!aq", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class5_Sub5_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass275_1 != null && arg0 != null) {
			@Pc(27) int local27 = arg1 - (this.aClass57_Sub2_1.anInt2769 * arg2 >> 8) >> this.aClass57_Sub2_1.anInt2749;
			@Pc(42) int local42 = arg3 - (this.aClass57_Sub2_1.anInt2793 * arg2 >> 8) >> this.aClass57_Sub2_1.anInt2749;
			this.aClass275_1.method6506(local27, arg0, local42);
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method8042(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method376(arg1, arg4, arg6, arg2, arg0, arg5, arg3);
	}
}
