import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class60_Sub2 extends Class60 {

	@OriginalMember(owner = "client!le", name = "B", descriptor = "I")
	private int anInt4648;

	@OriginalMember(owner = "client!le", name = "F", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!le", name = "J", descriptor = "I")
	private int anInt4653;

	@OriginalMember(owner = "client!le", name = "V", descriptor = "Lclient!cm;")
	public Class53 aClass53_10;

	@OriginalMember(owner = "client!le", name = "W", descriptor = "[Lclient!tw;")
	private Class6_Sub47[] aClass6_Sub47Array1;

	@OriginalMember(owner = "client!le", name = "Y", descriptor = "I")
	private int anInt4660;

	@OriginalMember(owner = "client!le", name = "Z", descriptor = "Lclient!cm;")
	public Class53 aClass53_11;

	@OriginalMember(owner = "client!le", name = "ab", descriptor = "Lclient!cm;")
	private Class53 aClass53_12;

	@OriginalMember(owner = "client!le", name = "db", descriptor = "I")
	private int anInt4661;

	@OriginalMember(owner = "client!le", name = "fb", descriptor = "Lclient!av;")
	private Interface2 anInterface2_5;

	@OriginalMember(owner = "client!le", name = "hb", descriptor = "Lclient!cm;")
	public Class53 aClass53_13;

	@OriginalMember(owner = "client!le", name = "T", descriptor = "Lclient!rh;")
	private final Class275 aClass275_94 = new Class275();

	@OriginalMember(owner = "client!le", name = "s", descriptor = "Lclient!pea;")
	public final Class121_Sub3 aClass121_Sub3_25;

	@OriginalMember(owner = "client!le", name = "w", descriptor = "[[I")
	private final int[][] anIntArrayArray55;

	@OriginalMember(owner = "client!le", name = "l", descriptor = "I")
	private final int anInt4639;

	@OriginalMember(owner = "client!le", name = "E", descriptor = "[[B")
	private final byte[][] aByteArrayArray16;

	@OriginalMember(owner = "client!le", name = "D", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!le", name = "X", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!le", name = "A", descriptor = "[[[Lclient!tw;")
	private Class6_Sub47[][][] aClass6_Sub47ArrayArrayArray1;

	@OriginalMember(owner = "client!le", name = "y", descriptor = "[[S")
	public final short[][] aShortArrayArray10;

	@OriginalMember(owner = "client!le", name = "bb", descriptor = "[[B")
	private byte[][] aByteArrayArray17;

	@OriginalMember(owner = "client!le", name = "gb", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!le", name = "u", descriptor = "I")
	private final int anInt4644;

	@OriginalMember(owner = "client!le", name = "Q", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!le", name = "n", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!le", name = "g", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!le", name = "H", descriptor = "I")
	public final int anInt4651;

	@OriginalMember(owner = "client!le", name = "t", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!le", name = "eb", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!le", name = "cb", descriptor = "Lclient!nj;")
	private Class212 aClass212_19;

	@OriginalMember(owner = "client!le", name = "N", descriptor = "Lclient!at;")
	private Class20 aClass20_2;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lclient!pea;IIII[[I[[II)V")
	public Class60_Sub2(@OriginalArg(0) Class121_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.aClass121_Sub3_25 = arg0;
		this.anIntArrayArray55 = arg5;
		this.anInt4639 = super.anInt9654 - 2;
		this.aByteArrayArray16 = new byte[arg3][arg4];
		this.anIntArrayArrayArray13 = new int[arg3][arg4][];
		this.aFloatArrayArray6 = new float[super.anInt9656 + 1][super.anInt9657 + 1];
		this.aClass6_Sub47ArrayArrayArray1 = new Class6_Sub47[arg3][arg4][];
		this.aShortArrayArray10 = new short[arg4 * arg3][];
		this.aByteArrayArray17 = new byte[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray8 = new float[super.anInt9656 + 1][super.anInt9657 + 1];
		this.anInt4644 = 0x1 << this.anInt4639;
		this.anIntArrayArrayArray15 = new int[arg3][arg4][];
		this.anIntArrayArrayArray11 = new int[arg3][arg4][];
		this.anIntArrayArrayArray10 = new int[arg3][arg4][];
		this.anInt4651 = arg2;
		this.anIntArrayArrayArray12 = new int[arg3][arg4][];
		this.aFloatArrayArray7 = new float[super.anInt9656 + 1][super.anInt9657 + 1];
		for (@Pc(117) int local117 = 1; super.anInt9657 > local117; local117++) {
			for (@Pc(121) int local121 = 1; super.anInt9656 > local121; local121++) {
				@Pc(140) int local140 = arg6[local121 + 1][local117] - arg6[local121 - 1][local117];
				@Pc(157) int local157 = arg6[local121][local117 + 1] - arg6[local121][local117 - 1];
				@Pc(176) float local176 = (float) (1.0D / Math.sqrt((double) (local157 * local157 + arg7 * 4 * arg7 + local140 * local140)));
				this.aFloatArrayArray8[local121][local117] = (float) local140 * local176;
				this.aFloatArrayArray6[local121][local117] = (float) (-arg7 * 2) * local176;
				this.aFloatArrayArray7[local121][local117] = (float) local157 * local176;
			}
		}
		this.aClass212_19 = new Class212(128);
		if ((this.anInt4651 & 0x10) != 0) {
			this.aClass20_2 = new Class20(this.aClass121_Sub3_25, this);
		}
	}

	@OriginalMember(owner = "client!le", name = "EA", descriptor = "(III)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray17[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray17[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!le", name = "ba", descriptor = "()V")
	@Override
	public void ba() {
		if (this.anInt4661 > 0) {
			@Pc(14) byte[][] local14 = new byte[super.anInt9656 + 1][super.anInt9657 + 1];
			@Pc(20) int local20;
			for (@Pc(16) int local16 = 1; local16 < super.anInt9656; local16++) {
				for (local20 = 1; super.anInt9657 > local20; local20++) {
					local14[local16][local20] = (byte) ((this.aByteArrayArray17[local16 - 1][local20] >> 2) + (this.aByteArrayArray17[local16 + 1][local20] >> 3) + (this.aByteArrayArray17[local16][local20 + -1] >> 2) + (this.aByteArrayArray17[local16][local20 - -1] >> 3) + (this.aByteArrayArray17[local16][local20] >> 1));
				}
			}
			this.aClass6_Sub47Array1 = new Class6_Sub47[this.aClass212_19.method5105()];
			this.aClass212_19.method5100(this.aClass6_Sub47Array1);
			for (local20 = 0; local20 < this.aClass6_Sub47Array1.length; local20++) {
				this.aClass6_Sub47Array1[local20].method6895(this.anInt4661);
			}
			@Pc(132) int local132 = 24;
			if (this.anIntArrayArrayArray14 != null) {
				local132 += 4;
			}
			if ((this.anInt4651 & 0x7) != 0) {
				local132 += 12;
			}
			@Pc(152) NativeHeapBuffer local152 = this.aClass121_Sub3_25.aNativeHeap5.a(this.anInt4661 * local132, false);
			@Pc(157) Stream local157 = new Stream(local152);
			@Pc(161) Class6_Sub47[] local161 = new Class6_Sub47[this.anInt4661];
			@Pc(168) int local168 = Static21.method292(this.anInt4661 / 4);
			if (local168 < 1) {
				local168 = 1;
			}
			@Pc(180) Class212 local180 = new Class212(local168);
			@Pc(184) Class6_Sub47[] local184 = new Class6_Sub47[this.anInt4660];
			@Pc(190) int local190;
			for (@Pc(186) int local186 = 0; super.anInt9656 > local186; local186++) {
				for (local190 = 0; local190 < super.anInt9657; local190++) {
					if (this.anIntArrayArrayArray15[local186][local190] != null) {
						@Pc(206) Class6_Sub47[] local206 = this.aClass6_Sub47ArrayArrayArray1[local186][local190];
						@Pc(213) int[] local213 = this.anIntArrayArrayArray12[local186][local190];
						@Pc(220) int[] local220 = this.anIntArrayArrayArray10[local186][local190];
						@Pc(227) int[] local227 = this.anIntArrayArrayArray11[local186][local190];
						@Pc(234) int[] local234 = this.anIntArrayArrayArray15[local186][local190];
						@Pc(246) int[] local246 = this.anIntArrayArrayArray13 == null ? null : this.anIntArrayArrayArray13[local186][local190];
						if (local227 == null) {
							local227 = local234;
						}
						@Pc(262) int[] local262 = this.anIntArrayArrayArray14 == null ? null : this.anIntArrayArrayArray14[local186][local190];
						@Pc(269) float local269 = this.aFloatArrayArray8[local186][local190];
						@Pc(276) float local276 = this.aFloatArrayArray6[local186][local190];
						@Pc(283) float local283 = this.aFloatArrayArray7[local186][local190];
						@Pc(292) float local292 = this.aFloatArrayArray8[local186][local190 + 1];
						@Pc(301) float local301 = this.aFloatArrayArray6[local186][local190 + 1];
						@Pc(310) float local310 = this.aFloatArrayArray7[local186][local190 + 1];
						@Pc(321) float local321 = this.aFloatArrayArray8[local186 + 1][local190 + 1];
						@Pc(332) float local332 = this.aFloatArrayArray6[local186 + 1][local190 + 1];
						@Pc(343) float local343 = this.aFloatArrayArray7[local186 + 1][local190 + 1];
						@Pc(352) float local352 = this.aFloatArrayArray8[local186 + 1][local190];
						@Pc(361) float local361 = this.aFloatArrayArray6[local186 + 1][local190];
						@Pc(370) float local370 = this.aFloatArrayArray7[local186 + 1][local190];
						@Pc(378) int local378 = local14[local186][local190] & 0xFF;
						@Pc(388) int local388 = local14[local186][local190 + 1] & 0xFF;
						@Pc(400) int local400 = local14[local186 + 1][local190 + 1] & 0xFF;
						@Pc(410) int local410 = local14[local186 + 1][local190] & 0xFF;
						@Pc(412) int local412 = 0;
						@Pc(422) int local422;
						label335: for (@Pc(414) int local414 = 0; local414 < local234.length; local414++) {
							@Pc(420) Class6_Sub47 local420 = local206[local414];
							for (local422 = 0; local422 < local412; local422++) {
								if (local184[local422] == local420) {
									continue label335;
								}
							}
							local184[local412++] = local420;
						}
						@Pc(467) short[] local467 = this.aShortArrayArray10[local186 + local190 * super.anInt9656] = new short[local234.length];
						for (local422 = 0; local422 < local234.length; local422++) {
							@Pc(481) int local481 = (local186 << super.anInt9654) + local213[local422];
							@Pc(491) int local491 = (local190 << super.anInt9654) + local220[local422];
							@Pc(496) int local496 = local481 >> this.anInt4639;
							@Pc(501) int local501 = local491 >> this.anInt4639;
							@Pc(505) int local505 = local234[local422];
							@Pc(509) int local509 = local227[local422];
							@Pc(517) int local517 = local246 == null ? 0 : local246[local422];
							@Pc(535) long local535 = (long) local509 << 48 | (long) local505 << 32 | (long) (local496 << 16) | (long) local501;
							@Pc(539) int local539 = local213[local422];
							@Pc(543) int local543 = local220[local422];
							@Pc(545) byte local545 = 74;
							@Pc(547) int local547 = 0;
							@Pc(549) float local549 = 1.0F;
							@Pc(563) float local563;
							@Pc(559) float local559;
							@Pc(561) float local561;
							@Pc(650) float local650;
							@Pc(557) int local557;
							if (local539 == 0 && local543 == 0) {
								local557 = local545 - local378;
								local559 = local276;
								local561 = local283;
								local563 = local269;
							} else if (local539 == 0 && super.anInt9652 == local543) {
								local557 = local545 - local388;
								local563 = local292;
								local561 = local310;
								local559 = local301;
							} else if (local539 == super.anInt9652 && super.anInt9652 == local543) {
								local557 = local545 - local400;
								local561 = local343;
								local559 = local332;
								local563 = local321;
							} else if (local539 == super.anInt9652 && local543 == 0) {
								local557 = local545 - local410;
								local559 = local361;
								local561 = local370;
								local563 = local352;
							} else {
								@Pc(627) float local627 = (float) local539 / (float) super.anInt9652;
								@Pc(634) float local634 = (float) local543 / (float) super.anInt9652;
								@Pc(642) float local642 = local269 + (local352 - local269) * local627;
								local650 = local276 + (local361 - local276) * local627;
								@Pc(659) float local659 = local627 * (local370 - local283) + local283;
								@Pc(667) float local667 = local627 * (local321 - local292) + local292;
								@Pc(676) float local676 = local301 + (local332 - local301) * local627;
								@Pc(685) float local685 = (local343 - local310) * local627 + local310;
								local559 = local634 * (local676 - local650) + local650;
								local563 = local642 + (local667 - local642) * local634;
								local561 = local659 + (local685 - local659) * local634;
								@Pc(724) int local724 = local378 + ((local410 - local378) * local539 >> super.anInt9654);
								@Pc(735) int local735 = local388 + (local539 * (local400 - local388) >> super.anInt9654);
								local557 = local545 - local724 - (local543 * (local735 - local724) >> super.anInt9654);
							}
							if (local505 != -1) {
								@Pc(774) int local774 = (local505 & 0x7F) * local557 >> 7;
								if (local774 < 2) {
									local774 = 2;
								} else if (local774 > 126) {
									local774 = 126;
								}
								local547 = Static101.anIntArray262[local505 & 0xFF80 | local774];
								if ((this.anInt4651 & 0x7) == 0) {
									local549 = this.aClass121_Sub3_25.aFloatArray41[2] * local561 + local563 * this.aClass121_Sub3_25.aFloatArray41[0] + this.aClass121_Sub3_25.aFloatArray41[1] * local559;
									local549 = this.aClass121_Sub3_25.aFloat150 + local549 * (local549 > 0.0F ? this.aClass121_Sub3_25.aFloat148 : this.aClass121_Sub3_25.aFloat158);
								}
							}
							@Pc(846) Class6 local846 = null;
							if ((this.anInt4644 - 1 & local481) == 0 && (local491 & this.anInt4644 - 1) == 0) {
								local846 = local180.method5106(local535);
							}
							@Pc(1205) int local1205;
							@Pc(876) int local876;
							if (local846 == null) {
								if (local509 == local505) {
									local876 = local547;
								} else {
									@Pc(886) int local886 = local557 * (local509 & 0x7F) >> 7;
									if (local886 < 2) {
										local886 = 2;
									} else if (local886 > 126) {
										local886 = 126;
									}
									local876 = Static101.anIntArray262[local886 | local509 & 0xFF80];
									if ((this.anInt4651 & 0x7) == 0) {
										local650 = this.aClass121_Sub3_25.aFloatArray41[2] * local561 + local559 * this.aClass121_Sub3_25.aFloatArray41[1] + this.aClass121_Sub3_25.aFloatArray41[0] * local563;
										local650 = this.aClass121_Sub3_25.aFloat150 + (local549 > 0.0F ? this.aClass121_Sub3_25.aFloat148 : this.aClass121_Sub3_25.aFloat158) * local549;
										@Pc(963) int local963 = local876 >> 16 & 0xFF;
										@Pc(969) int local969 = local876 >> 8 & 0xFF;
										@Pc(973) int local973 = local876 & 0xFF;
										local963 = (int) ((float) local963 * local650);
										if (local963 < 0) {
											local963 = 0;
										} else if (local963 > 255) {
											local963 = 255;
										}
										local969 = (int) ((float) local969 * local650);
										local973 = (int) ((float) local973 * local650);
										if (local969 < 0) {
											local969 = 0;
										} else if (local969 > 255) {
											local969 = 255;
										}
										if (local973 < 0) {
											local973 = 0;
										} else if (local973 > 255) {
											local973 = 255;
										}
										local876 = local969 << 8 | local963 << 16 | local973;
									}
								}
								if (this.aClass121_Sub3_25.aBoolean458) {
									local157.b((float) local481);
									local157.b((float) (local517 + this.sa(local481, local491)));
									local157.b((float) local491);
									local157.c((byte) (local876 >> 16));
									local157.c((byte) (local876 >> 8));
									local157.c((byte) local876);
									local157.c(-1);
									local157.b((float) local481);
									local157.b((float) local491);
									if (this.anIntArrayArrayArray14 != null) {
										local157.b((float) (local262 == null ? 0 : local262[local422] - 1));
									}
									if ((this.anInt4651 & 0x7) != 0) {
										local157.b(local563);
										local157.b(local559);
										local157.b(local561);
									}
								} else {
									local157.a((float) local481);
									local157.a((float) (this.sa(local481, local491) + local517));
									local157.a((float) local491);
									local157.c((byte) (local876 >> 16));
									local157.c((byte) (local876 >> 8));
									local157.c((byte) local876);
									local157.c(-1);
									local157.a((float) local481);
									local157.a((float) local491);
									if (this.anIntArrayArrayArray14 != null) {
										local157.a((float) (local262 == null ? 0 : local262[local422] - 1));
									}
									if ((this.anInt4651 & 0x7) != 0) {
										local157.a(local563);
										local157.a(local559);
										local157.a(local561);
									}
								}
								local1205 = this.anInt4648++;
								local467[local422] = (short) local1205;
								if (local505 != -1) {
									local161[local1205] = local206[local422];
								}
								local180.method5104(local535, new Class6_Sub26(local467[local422]));
							} else {
								local467[local422] = ((Class6_Sub26) local846).aShort73;
								local1205 = local467[local422] & 0xFFFF;
								if (local505 != -1 && local206[local422].aLong249 < local161[local1205].aLong249) {
									local161[local1205] = local206[local422];
								}
							}
							for (local876 = 0; local876 < local412; local876++) {
								local184[local876].method6900(local1205, local547, local549, local557);
							}
							this.anInt4653++;
						}
					}
				}
			}
			for (local190 = 0; local190 < this.anInt4648; local190++) {
				@Pc(1321) Class6_Sub47 local1321 = local161[local190];
				if (local1321 != null) {
					local1321.method6897(local190);
				}
			}
			@Pc(1358) int local1358;
			for (@Pc(1338) int local1338 = 0; local1338 < super.anInt9656; local1338++) {
				for (@Pc(1342) int local1342 = 0; local1342 < super.anInt9657; local1342++) {
					@Pc(1354) short[] local1354 = this.aShortArrayArray10[local1338 + local1342 * super.anInt9656];
					if (local1354 != null) {
						local1358 = 0;
						@Pc(1360) int local1360 = 0;
						while (local1360 < local1354.length) {
							@Pc(1369) int local1369 = local1354[local1360++] & 0xFFFF;
							@Pc(1376) int local1376 = local1354[local1360++] & 0xFFFF;
							@Pc(1383) int local1383 = local1354[local1360++] & 0xFFFF;
							@Pc(1387) Class6_Sub47 local1387 = local161[local1369];
							@Pc(1391) Class6_Sub47 local1391 = local161[local1376];
							@Pc(1395) Class6_Sub47 local1395 = local161[local1383];
							@Pc(1397) Class6_Sub47 local1397 = null;
							if (local1387 != null) {
								local1387.method6902(local1342, local1338, local1358);
								local1397 = local1387;
							}
							if (local1391 != null) {
								local1391.method6902(local1342, local1338, local1358);
								if (local1397 == null || local1397.aLong249 > local1391.aLong249) {
									local1397 = local1391;
								}
							}
							if (local1395 != null) {
								local1395.method6902(local1342, local1338, local1358);
								if (local1397 == null || local1395.aLong249 < local1397.aLong249) {
									local1397 = local1395;
								}
							}
							if (local1397 != null) {
								if (local1387 != null) {
									local1397.method6897(local1369);
								}
								if (local1391 != null) {
									local1397.method6897(local1376);
								}
								if (local1395 != null) {
									local1397.method6897(local1383);
								}
								local1397.method6902(local1342, local1338, local1358);
							}
							local1358++;
						}
					}
				}
			}
			local157.c();
			this.anInterface2_5 = this.aClass121_Sub3_25.method5705(local152, local157.b(), local132);
			this.aClass53_11 = new Class53(this.anInterface2_5, 5126, 3, 0);
			this.aClass53_12 = new Class53(this.anInterface2_5, 5121, 4, 12);
			@Pc(1526) byte local1526;
			if (this.anIntArrayArrayArray14 == null) {
				local1526 = 24;
				this.aClass53_13 = new Class53(this.anInterface2_5, 5126, 2, 16);
			} else {
				local1526 = 28;
				this.aClass53_13 = new Class53(this.anInterface2_5, 5126, 3, 16);
			}
			if ((this.anInt4651 & 0x7) != 0) {
				this.aClass53_10 = new Class53(this.anInterface2_5, 5126, 3, local1526);
			}
			@Pc(1570) long[] local1570 = new long[this.aClass6_Sub47Array1.length];
			for (local1358 = 0; local1358 < this.aClass6_Sub47Array1.length; local1358++) {
				@Pc(1579) Class6_Sub47 local1579 = this.aClass6_Sub47Array1[local1358];
				local1570[local1358] = local1579.aLong249;
				local1579.method6896(this.anInt4648);
			}
			Static296.method7808(local1570, this.aClass6_Sub47Array1);
			if (this.aClass20_2 != null) {
				this.aClass20_2.method294();
			}
		} else {
			this.aClass20_2 = null;
		}
		this.aByteArrayArray17 = null;
		this.anIntArrayArrayArray12 = this.anIntArrayArrayArray10 = null;
		this.anIntArrayArrayArray14 = null;
		this.anIntArrayArrayArray15 = null;
		this.aClass212_19 = null;
		this.anIntArrayArrayArray11 = null;
		this.anIntArrayArrayArray13 = null;
		this.aFloatArrayArray8 = this.aFloatArrayArray6 = this.aFloatArrayArray7 = null;
		this.aClass6_Sub47ArrayArrayArray1 = null;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(II)V")
	@Override
	public void method7892(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIZ[[ZII)V")
	private void method4008(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean[][] arg3, @OriginalArg(5) int arg4) {
		if (this.aClass6_Sub47Array1 == null) {
			return;
		}
		@Pc(10) int local10 = arg0 + arg0 + 1;
		@Pc(14) int local14 = local10 * local10;
		if (this.aClass121_Sub3_25.anIntArray558.length < local14) {
			this.aClass121_Sub3_25.anIntArray558 = new int[local14];
		}
		if (this.aClass121_Sub3_25.aClass6_Sub14_Sub1_3.aByteArray88.length < this.anInt4653 * 2) {
			this.aClass121_Sub3_25.aClass6_Sub14_Sub1_3 = new Class6_Sub14_Sub1(this.anInt4653 * 2);
		}
		@Pc(54) int local54 = arg4 - arg0;
		@Pc(56) int local56 = local54;
		if (local54 < 0) {
			local54 = 0;
		}
		@Pc(64) int local64 = arg1 - arg0;
		@Pc(66) int local66 = local64;
		if (local64 < 0) {
			local64 = 0;
		}
		@Pc(75) int local75 = arg4 + arg0;
		if (super.anInt9656 - 1 < local75) {
			local75 = super.anInt9656 - 1;
		}
		@Pc(94) int local94 = arg0 + arg1;
		if (local94 > super.anInt9657 - 1) {
			local94 = super.anInt9657 - 1;
		}
		@Pc(111) int local111 = 0;
		@Pc(115) int[] local115 = this.aClass121_Sub3_25.anIntArray558;
		@Pc(128) int local128;
		for (@Pc(117) int local117 = local54; local117 <= local75; local117++) {
			@Pc(126) boolean[] local126 = arg3[local117 - local56];
			for (local128 = local64; local128 <= local94; local128++) {
				if (local126[local128 - local66]) {
					local115[local111++] = local128 * super.anInt9656 + local117;
				}
			}
		}
		this.aClass121_Sub3_25.method5693();
		this.aClass121_Sub3_25.method5680((this.anInt4651 & 0x7) != 0);
		for (@Pc(191) int local191 = 0; local191 < this.aClass6_Sub47Array1.length; local191++) {
			this.aClass6_Sub47Array1[local191].method6899(local111, local115);
		}
		if (!this.aClass275_94.method6371()) {
			local128 = this.aClass121_Sub3_25.anInt6818;
			@Pc(222) int local222 = this.aClass121_Sub3_25.anInt6817;
			this.aClass121_Sub3_25.X(0, local222, this.aClass121_Sub3_25.anInt6811);
			this.aClass121_Sub3_25.method5680(false);
			this.aClass121_Sub3_25.method5665(false);
			this.aClass121_Sub3_25.method5707(128);
			this.aClass121_Sub3_25.method5690(-2);
			this.aClass121_Sub3_25.method5713(this.aClass121_Sub3_25.aClass35_Sub3_4);
			this.aClass121_Sub3_25.method5659(7681, 8448);
			this.aClass121_Sub3_25.method5685(770, 34166, 0);
			this.aClass121_Sub3_25.method5717(0, 34167);
			for (@Pc(286) Class6 local286 = this.aClass275_94.method6366(); local286 != null; local286 = this.aClass275_94.method6364()) {
				@Pc(291) Class6_Sub20 local291 = (Class6_Sub20) local286;
				local291.method2162(arg4, arg1, arg0, arg3);
			}
			this.aClass121_Sub3_25.method5685(768, 5890, 0);
			this.aClass121_Sub3_25.method5717(0, 5890);
			this.aClass121_Sub3_25.method5713(null);
			this.aClass121_Sub3_25.X(local128, local222, this.aClass121_Sub3_25.anInt6811);
		}
		if (this.aClass20_2 != null) {
			this.aClass121_Sub3_25.method5727(null, this.aClass53_13, this.aClass53_11, null);
			this.aClass20_2.method297(arg0, arg3, arg4, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!le", name = "FA", descriptor = "(Lclient!w;IIIIZ)V")
	@Override
	public void FA(@OriginalArg(0) Class6_Sub1_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass20_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass121_Sub3_25.anInt6826 >> 8) >> this.aClass121_Sub3_25.anInt6798;
			@Pc(39) int local39 = arg3 - (this.aClass121_Sub3_25.anInt6810 * arg2 >> 8) >> this.aClass121_Sub3_25.anInt6798;
			this.aClass20_2.method296(local24, arg0, local39);
		}
	}

	@OriginalMember(owner = "client!le", name = "JA", descriptor = "(II)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray55[arg0][arg1];
	}

	@OriginalMember(owner = "client!le", name = "sa", descriptor = "(II)I")
	@Override
	public int sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 >> super.anInt9654;
		@Pc(13) int local13 = arg1 >> super.anInt9654;
		if (local8 < 0 || local13 < 0 || local8 > super.anInt9656 - 1 || local13 > super.anInt9657 - 1) {
			return 0;
		}
		@Pc(41) int local41 = arg0 & super.anInt9652 - 1;
		@Pc(48) int local48 = super.anInt9652 - 1 & arg1;
		@Pc(76) int local76 = (super.anInt9652 - local41) * this.anIntArrayArray55[local8][local13] + local41 * this.anIntArrayArray55[local8 + 1][local13] >> super.anInt9654;
		@Pc(107) int local107 = this.anIntArrayArray55[local8 + 1][local13 + 1] * local41 + this.anIntArrayArray55[local8][local13 + 1] * (super.anInt9652 - local41) >> super.anInt9654;
		return local76 * (super.anInt9652 - local48) + local107 * local48 >> super.anInt9654;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method7889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!le", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray14 == null) {
			this.anIntArrayArrayArray14 = new int[super.anInt9656][super.anInt9657][];
		}
		if (arg3 != null && this.anIntArrayArrayArray13 == null) {
			this.anIntArrayArrayArray13 = new int[super.anInt9656][super.anInt9657][];
		}
		this.anIntArrayArrayArray12[arg0][arg1] = arg2;
		this.anIntArrayArrayArray10[arg0][arg1] = arg4;
		this.anIntArrayArrayArray15[arg0][arg1] = arg6;
		this.anIntArrayArrayArray11[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray14 != null) {
			this.anIntArrayArrayArray14[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray13 != null) {
			this.anIntArrayArrayArray13[arg0][arg1] = arg3;
		}
		@Pc(88) Class6_Sub47[] local88 = this.aClass6_Sub47ArrayArrayArray1[arg0][arg1] = new Class6_Sub47[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) arg8[local90] | (long) (arg9[local90] << 14) | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28;
			@Pc(125) Class6 local125;
			for (local125 = this.aClass212_19.method5106(local119); local125 != null; local125 = this.aClass212_19.method5107()) {
				@Pc(130) Class6_Sub47 local130 = (Class6_Sub47) local125;
				if (arg8[local90] == local130.anInt8324 && (float) arg9[local90] == local130.aFloat176 && arg10 == local130.anInt8325 && local130.anInt8327 == arg11 && arg12 == local130.anInt8317) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class6_Sub47(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass212_19.method5104(local119, local88[local90]);
			} else {
				local88[local90] = (Class6_Sub47) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray16[arg0][arg1] = (byte) (this.aByteArrayArray16[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt4660) {
			this.anInt4660 = arg6.length;
		}
		this.anInt4661 += arg6.length;
	}

	@OriginalMember(owner = "client!le", name = "aa", descriptor = "(Lclient!w;IIIIZ)V")
	@Override
	public void aa(@OriginalArg(0) Class6_Sub1_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass20_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass121_Sub3_25.anInt6826 >> 8) >> this.aClass121_Sub3_25.anInt6798;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass121_Sub3_25.anInt6810 >> 8) >> this.aClass121_Sub3_25.anInt6798;
			this.aClass20_2.method298(arg0, local39, local24);
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7894(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt4661 <= 0) {
			return;
		}
		this.aClass121_Sub3_25.method5726();
		this.aClass121_Sub3_25.method5729(false);
		this.aClass121_Sub3_25.method5680(false);
		this.aClass121_Sub3_25.method5645(false);
		this.aClass121_Sub3_25.method5665(false);
		this.aClass121_Sub3_25.method5707(0);
		this.aClass121_Sub3_25.method5690(-2);
		this.aClass121_Sub3_25.method5713(null);
		Static495.aFloatArray51[11] = 0.0F;
		Static495.aFloatArray51[12] = -1.0F - ((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass121_Sub3_25.anInt6758;
		Static495.aFloatArray51[5] = (float) 1024 / ((float) super.anInt9652 * 128.0F * (float) this.aClass121_Sub3_25.anInt6787);
		Static495.aFloatArray51[2] = 0.0F;
		Static495.aFloatArray51[4] = 0.0F;
		Static495.aFloatArray51[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass121_Sub3_25.anInt6787;
		Static495.aFloatArray51[14] = 0.0F;
		Static495.aFloatArray51[8] = 0.0F;
		Static495.aFloatArray51[1] = 0.0F;
		Static495.aFloatArray51[6] = 0.0F;
		Static495.aFloatArray51[7] = 0.0F;
		Static495.aFloatArray51[10] = 0.0F;
		Static495.aFloatArray51[0] = (float) 1024 / ((float) super.anInt9652 * 128.0F * (float) this.aClass121_Sub3_25.anInt6758);
		Static495.aFloatArray51[15] = 1.0F;
		Static495.aFloatArray51[9] = 0.0F;
		Static495.aFloatArray51[3] = 0.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static495.aFloatArray51, 0);
		Static495.aFloatArray51[11] = 0.0F;
		Static495.aFloatArray51[9] = 1.0F;
		Static495.aFloatArray51[15] = 1.0F;
		Static495.aFloatArray51[10] = 0.0F;
		Static495.aFloatArray51[1] = 0.0F;
		Static495.aFloatArray51[7] = 0.0F;
		Static495.aFloatArray51[4] = 0.0F;
		Static495.aFloatArray51[8] = 0.0F;
		Static495.aFloatArray51[3] = 0.0F;
		Static495.aFloatArray51[0] = 1.0F;
		Static495.aFloatArray51[12] = 0.0F;
		Static495.aFloatArray51[13] = 0.0F;
		Static495.aFloatArray51[6] = 1.0F;
		Static495.aFloatArray51[5] = 0.0F;
		Static495.aFloatArray51[2] = 0.0F;
		Static495.aFloatArray51[14] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static495.aFloatArray51, 0);
		if ((this.anInt4651 & 0x7) == 0) {
			this.aClass121_Sub3_25.method5680(false);
		} else {
			this.aClass121_Sub3_25.method5680(true);
			this.aClass121_Sub3_25.method5704();
		}
		this.aClass121_Sub3_25.method5727(this.aClass53_10, this.aClass53_13, this.aClass53_11, this.aClass53_12);
		if (this.aClass121_Sub3_25.aClass6_Sub14_Sub1_3.aByteArray88.length < this.anInt4653 * 2) {
			this.aClass121_Sub3_25.aClass6_Sub14_Sub1_3 = new Class6_Sub14_Sub1(this.anInt4653 * 2);
		} else {
			this.aClass121_Sub3_25.aClass6_Sub14_Sub1_3.anInt7244 = 0;
		}
		@Pc(314) int local314 = 0;
		@Pc(318) Class6_Sub14_Sub1 local318 = this.aClass121_Sub3_25.aClass6_Sub14_Sub1_3;
		@Pc(324) int local324;
		@Pc(334) int local334;
		@Pc(336) int local336;
		@Pc(355) short[] local355;
		@Pc(359) int local359;
		if (this.aClass121_Sub3_25.aBoolean458) {
			for (local324 = arg1; local324 < arg3; local324++) {
				local334 = super.anInt9656 * local324 + arg0;
				for (local336 = arg0; local336 < arg2; local336++) {
					if (arg4[local336 - arg0][local324 - arg1]) {
						local355 = this.aShortArrayArray10[local334];
						if (local355 != null) {
							for (local359 = 0; local359 < local355.length; local359++) {
								local314++;
								local318.method5999(local355[local359] & 0xFFFF);
							}
						}
					}
					local334++;
				}
			}
		} else {
			for (local324 = arg1; local324 < arg3; local324++) {
				local334 = local324 * super.anInt9656 + arg0;
				for (local336 = arg0; local336 < arg2; local336++) {
					if (arg4[local336 - arg0][local324 - arg1]) {
						local355 = this.aShortArrayArray10[local334];
						if (local355 != null) {
							for (local359 = 0; local359 < local355.length; local359++) {
								local318.method6038(local355[local359] & 0xFFFF);
								local314++;
							}
						}
					}
					local334++;
				}
			}
		}
		if (local314 > 0) {
			@Pc(480) Class113_Sub1 local480 = new Class113_Sub1(this.aClass121_Sub3_25, 5123, local318.aByteArray88, local318.anInt7244);
			this.aClass121_Sub3_25.method5657(local314, 0, local480);
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!hj;[I)V")
	@Override
	public void method7893(@OriginalArg(0) Class6_Sub7 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass275_94.method6370(new Class6_Sub20(this.aClass121_Sub3_25, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method7896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method4008(arg2, arg1, arg4, arg3, arg0);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!w;IIIIZ)Z")
	@Override
	public boolean method7890(@OriginalArg(0) Class6_Sub1_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass20_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (arg2 * this.aClass121_Sub3_25.anInt6826 >> 8) >> this.aClass121_Sub3_25.anInt6798;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass121_Sub3_25.anInt6810 >> 8) >> this.aClass121_Sub3_25.anInt6798;
			return this.aClass20_2.method299(arg0, local39, local25);
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIILclient!uh;)V")
	private void method4011(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6_Sub1_Sub12_Sub2 arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray12[arg0][arg1];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray10[arg0][arg1];
		@Pc(22) int local22 = local12.length;
		if (local22 > this.aClass121_Sub3_25.anIntArray560.length) {
			this.aClass121_Sub3_25.anIntArray559 = new int[local22];
			this.aClass121_Sub3_25.anIntArray560 = new int[local22];
		}
		@Pc(46) int[] local46 = this.aClass121_Sub3_25.anIntArray560;
		@Pc(50) int[] local50 = this.aClass121_Sub3_25.anIntArray559;
		for (@Pc(52) int local52 = 0; local52 < local22; local52++) {
			local46[local52] = local12[local52] >> this.aClass121_Sub3_25.anInt6798;
			local50[local52] = local19[local52] >> this.aClass121_Sub3_25.anInt6798;
		}
		@Pc(84) int local84 = 0;
		while (local84 < local22) {
			@Pc(90) int local90 = local46[local84];
			@Pc(95) int local95 = local50[local84++];
			@Pc(99) int local99 = local46[local84];
			@Pc(104) int local104 = local50[local84++];
			@Pc(108) int local108 = local46[local84];
			@Pc(113) int local113 = local50[local84++];
			if ((local104 - local113) * (local90 - local99) - (local108 - local99) * (local104 - local95) > 0) {
				arg2.method7078(local90, local108, local95, local113, local99, local104);
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(IILclient!w;)Lclient!w;")
	@Override
	public Class6_Sub1_Sub12 c(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub1_Sub12 arg2) {
		if ((this.aByteArrayArray16[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt9652 >> this.aClass121_Sub3_25.anInt6798;
		@Pc(27) Class6_Sub1_Sub12_Sub2 local27 = (Class6_Sub1_Sub12_Sub2) arg2;
		@Pc(37) Class6_Sub1_Sub12_Sub2 local37;
		if (local27 != null && local27.method7080(local24, local24)) {
			local37 = local27;
			local27.method7079();
		} else {
			local37 = new Class6_Sub1_Sub12_Sub2(this.aClass121_Sub3_25, local24, local24);
		}
		local37.method7075(0, local24, 0, local24);
		this.method4011(arg0, arg1, local37);
		return local37;
	}
}
