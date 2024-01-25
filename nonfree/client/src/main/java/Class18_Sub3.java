import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public final class Class18_Sub3 extends Class18 {

	@OriginalMember(owner = "client!sl", name = "n", descriptor = "I")
	private int anInt9626;

	@OriginalMember(owner = "client!sl", name = "Q", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray19;

	@OriginalMember(owner = "client!sl", name = "V", descriptor = "I")
	private int anInt9644;

	@OriginalMember(owner = "client!sl", name = "ab", descriptor = "Lclient!ija;")
	public Class167 aClass167_23;

	@OriginalMember(owner = "client!sl", name = "bb", descriptor = "I")
	private int anInt9648;

	@OriginalMember(owner = "client!sl", name = "eb", descriptor = "Lclient!wba;")
	private Interface25 anInterface25_17;

	@OriginalMember(owner = "client!sl", name = "fb", descriptor = "Lclient!wba;")
	private Interface25 anInterface25_18;

	@OriginalMember(owner = "client!sl", name = "gb", descriptor = "I")
	private int anInt9649;

	@OriginalMember(owner = "client!sl", name = "ib", descriptor = "[Lclient!bk;")
	private Class2_Sub10[] aClass2_Sub10Array1;

	@OriginalMember(owner = "client!sl", name = "v", descriptor = "F")
	private float aFloat181 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!sl", name = "C", descriptor = "F")
	private float aFloat182 = -3.4028235E38F;

	@OriginalMember(owner = "client!sl", name = "E", descriptor = "Lclient!ow;")
	private final Class271 aClass271_59 = new Class271();

	@OriginalMember(owner = "client!sl", name = "A", descriptor = "Lclient!mj;")
	public final Class101_Sub1 aClass101_Sub1_21;

	@OriginalMember(owner = "client!sl", name = "Y", descriptor = "I")
	private final int anInt9647;

	@OriginalMember(owner = "client!sl", name = "t", descriptor = "I")
	public final int anInt9630;

	@OriginalMember(owner = "client!sl", name = "m", descriptor = "I")
	private final int anInt9625;

	@OriginalMember(owner = "client!sl", name = "S", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray20;

	@OriginalMember(owner = "client!sl", name = "hb", descriptor = "[[B")
	private byte[][] aByteArrayArray23;

	@OriginalMember(owner = "client!sl", name = "s", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!sl", name = "D", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray17;

	@OriginalMember(owner = "client!sl", name = "L", descriptor = "[[B")
	private final byte[][] aByteArrayArray22;

	@OriginalMember(owner = "client!sl", name = "db", descriptor = "[[F")
	private float[][] aFloatArrayArray17;

	@OriginalMember(owner = "client!sl", name = "Z", descriptor = "[[F")
	private float[][] aFloatArrayArray15;

	@OriginalMember(owner = "client!sl", name = "z", descriptor = "[[[Lclient!bk;")
	private Class2_Sub10[][][] aClass2_Sub10ArrayArrayArray1;

	@OriginalMember(owner = "client!sl", name = "U", descriptor = "[[S")
	public final short[][] aShortArrayArray18;

	@OriginalMember(owner = "client!sl", name = "cb", descriptor = "[[F")
	private float[][] aFloatArrayArray16;

	@OriginalMember(owner = "client!sl", name = "P", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray18;

	@OriginalMember(owner = "client!sl", name = "o", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!sl", name = "jb", descriptor = "Lclient!si;")
	private Class335 aClass335_41;

	@OriginalMember(owner = "client!sl", name = "O", descriptor = "Lclient!kda;")
	private Class194 aClass194_2;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Lclient!mj;IIII[[I[[II)V")
	public Class18_Sub3(@OriginalArg(0) Class101_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass101_Sub1_21 = arg0;
		this.anInt9647 = super.anInt9740 - 2;
		this.anInt9630 = arg2;
		this.anInt9625 = 0x1 << this.anInt9647;
		this.anIntArrayArrayArray20 = new int[arg3][arg4][];
		this.aByteArrayArray23 = new byte[arg3 + 1][arg4 + 1];
		this.anIntArrayArrayArray16 = new int[arg3][arg4][];
		this.anIntArrayArrayArray17 = new int[arg3][arg4][];
		this.aByteArrayArray22 = new byte[arg3][arg4];
		this.aFloatArrayArray17 = new float[super.anInt9741 + 1][super.anInt9742 + 1];
		this.aFloatArrayArray15 = new float[super.anInt9741 + 1][super.anInt9742 + 1];
		this.aClass2_Sub10ArrayArrayArray1 = new Class2_Sub10[arg3][arg4][];
		this.aShortArrayArray18 = new short[arg3 * arg4][];
		this.aFloatArrayArray16 = new float[super.anInt9741 + 1][super.anInt9742 + 1];
		this.anIntArrayArrayArray18 = new int[arg3][arg4][];
		this.anIntArrayArrayArray15 = new int[arg3][arg4][];
		for (@Pc(121) int local121 = 0; super.anInt9742 >= local121; local121++) {
			for (@Pc(125) int local125 = 0; super.anInt9741 >= local125; local125++) {
				@Pc(134) int local134 = super.anIntArrayArray51[local125][local121];
				if (this.aFloat181 > (float) local134) {
					this.aFloat181 = (float) local134;
				}
				if (this.aFloat182 < (float) local134) {
					this.aFloat182 = (float) local134;
				}
				if (local125 > 0 && local121 > 0 && super.anInt9741 > local125 && local121 < super.anInt9742) {
					@Pc(191) int local191 = arg6[local125 + 1][local121] - arg6[local125 - 1][local121];
					@Pc(208) int local208 = arg6[local125][local121 + 1] - arg6[local125][local121 - 1];
					@Pc(227) float local227 = (float) (1.0D / Math.sqrt((double) (local208 * local208 + arg7 * arg7 * 4 + local191 * local191)));
					this.aFloatArrayArray17[local125][local121] = local227 * (float) local191;
					this.aFloatArrayArray15[local125][local121] = (float) (-arg7 * 2) * local227;
					this.aFloatArrayArray16[local125][local121] = local227 * (float) local208;
				}
			}
		}
		this.aFloat181--;
		this.aFloat182++;
		this.aClass335_41 = new Class335(128);
		if ((this.anInt9630 & 0x10) != 0) {
			this.aClass194_2 = new Class194(this.aClass101_Sub1_21, this);
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method8538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method8450(arg2, arg3, arg4, -1, arg5, arg1, arg0);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method8535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method8450(arg2, arg3, arg4, arg5, arg6, arg1, arg0);
	}

	@OriginalMember(owner = "client!sl", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.anInt9648 > 0) {
			@Pc(18) byte[][] local18 = new byte[super.anInt9741 + 1][super.anInt9742 + 1];
			for (@Pc(20) int local20 = 1; local20 < super.anInt9741; local20++) {
				for (@Pc(24) int local24 = 1; super.anInt9742 > local24; local24++) {
					local18[local20][local24] = (byte) ((this.aByteArrayArray23[local20][local24 + 1] >> 3) + (this.aByteArrayArray23[local20 - 1][local24] >> 2) + (this.aByteArrayArray23[local20 + 1][local24] >> 3) + (this.aByteArrayArray23[local20][local24 + -1] >> 2) + (this.aByteArrayArray23[local20][local24] >> 1));
				}
			}
			@Pc(104) Class2_Sub10[] local104 = new Class2_Sub10[this.aClass335_41.method8361()];
			this.aClass335_41.method8360(local104);
			for (@Pc(112) int local112 = 0; local112 < local104.length; local112++) {
				local104[local112].method1034(this.anInt9648);
			}
			@Pc(128) int local128 = 20;
			if (this.anIntArrayArrayArray19 != null) {
				local128 += 4;
			}
			if ((this.anInt9630 & 0x7) != 0) {
				local128 += 12;
			}
			@Pc(148) NativeHeapBuffer local148 = this.aClass101_Sub1_21.aNativeHeap6.a(this.anInt9648 * 4, false);
			@Pc(158) NativeHeapBuffer local158 = this.aClass101_Sub1_21.aNativeHeap6.a(local128 * this.anInt9648, false);
			@Pc(163) Stream local163 = new Stream(local158);
			@Pc(168) Stream local168 = new Stream(local148);
			@Pc(172) Class2_Sub10[] local172 = new Class2_Sub10[this.anInt9648];
			@Pc(179) int local179 = Static427.method7013(this.anInt9648 / 4);
			if (local179 < 1) {
				local179 = 1;
			}
			@Pc(189) Class335 local189 = new Class335(local179);
			@Pc(193) Class2_Sub10[] local193 = new Class2_Sub10[this.anInt9649];
			@Pc(199) int local199;
			for (@Pc(195) int local195 = 0; local195 < super.anInt9741; local195++) {
				for (local199 = 0; local199 < super.anInt9742; local199++) {
					if (this.anIntArrayArrayArray20[local195][local199] != null) {
						@Pc(215) Class2_Sub10[] local215 = this.aClass2_Sub10ArrayArrayArray1[local195][local199];
						@Pc(222) int[] local222 = this.anIntArrayArrayArray18[local195][local199];
						@Pc(229) int[] local229 = this.anIntArrayArrayArray17[local195][local199];
						@Pc(236) int[] local236 = this.anIntArrayArrayArray16[local195][local199];
						@Pc(243) int[] local243 = this.anIntArrayArrayArray20[local195][local199];
						@Pc(255) int[] local255 = this.anIntArrayArrayArray15 == null ? null : this.anIntArrayArrayArray15[local195][local199];
						if (local236 == null) {
							local236 = local243;
						}
						@Pc(271) int[] local271 = this.anIntArrayArrayArray19 == null ? null : this.anIntArrayArrayArray19[local195][local199];
						@Pc(278) float local278 = this.aFloatArrayArray17[local195][local199];
						@Pc(285) float local285 = this.aFloatArrayArray15[local195][local199];
						@Pc(292) float local292 = this.aFloatArrayArray16[local195][local199];
						@Pc(301) float local301 = this.aFloatArrayArray17[local195][local199 + 1];
						@Pc(310) float local310 = this.aFloatArrayArray15[local195][local199 + 1];
						@Pc(319) float local319 = this.aFloatArrayArray16[local195][local199 + 1];
						@Pc(330) float local330 = this.aFloatArrayArray17[local195 + 1][local199 + 1];
						@Pc(341) float local341 = this.aFloatArrayArray15[local195 + 1][local199 + 1];
						@Pc(352) float local352 = this.aFloatArrayArray16[local195 + 1][local199 + 1];
						@Pc(361) float local361 = this.aFloatArrayArray17[local195 + 1][local199];
						@Pc(370) float local370 = this.aFloatArrayArray15[local195 + 1][local199];
						@Pc(379) float local379 = this.aFloatArrayArray16[local195 + 1][local199];
						@Pc(387) int local387 = local18[local195][local199] & 0xFF;
						@Pc(397) int local397 = local18[local195][local199 + 1] & 0xFF;
						@Pc(409) int local409 = local18[local195 + 1][local199 + 1] & 0xFF;
						@Pc(419) int local419 = local18[local195 + 1][local199] & 0xFF;
						@Pc(421) int local421 = 0;
						@Pc(431) int local431;
						label357: for (@Pc(423) int local423 = 0; local423 < local243.length; local423++) {
							@Pc(429) Class2_Sub10 local429 = local215[local423];
							for (local431 = 0; local431 < local421; local431++) {
								if (local193[local431] == local429) {
									continue label357;
								}
							}
							local193[local421++] = local429;
						}
						@Pc(473) short[] local473 = this.aShortArrayArray18[super.anInt9741 * local199 + local195] = new short[local243.length];
						for (local431 = 0; local431 < local243.length; local431++) {
							@Pc(487) int local487 = (local195 << super.anInt9740) + local222[local431];
							@Pc(497) int local497 = (local199 << super.anInt9740) + local229[local431];
							@Pc(502) int local502 = local487 >> this.anInt9647;
							@Pc(507) int local507 = local497 >> this.anInt9647;
							@Pc(511) int local511 = local243[local431];
							@Pc(515) int local515 = local236[local431];
							@Pc(523) int local523 = local255 == null ? 0 : local255[local431];
							@Pc(541) long local541 = (long) local507 | (long) (local502 << 16) | (long) local511 << 32 | (long) local515 << 48;
							@Pc(545) int local545 = local222[local431];
							@Pc(549) int local549 = local229[local431];
							@Pc(551) byte local551 = 74;
							@Pc(553) int local553 = 0;
							@Pc(564) float local564;
							@Pc(562) float local562;
							@Pc(570) float local570;
							@Pc(674) float local674;
							@Pc(568) int local568;
							if (local545 == 0 && local549 == 0) {
								local562 = local285;
								local564 = local278;
								local568 = local551 - local387;
								local570 = local292;
							} else if (local545 == 0 && local549 == super.anInt9739) {
								local564 = local301;
								local568 = local551 - local397;
								local570 = local319;
								local562 = local310;
							} else if (local545 == super.anInt9739 && local549 == super.anInt9739) {
								local564 = local330;
								local570 = local352;
								local568 = local551 - local409;
								local562 = local341;
							} else if (local545 == super.anInt9739 && local549 == 0) {
								local562 = local370;
								local568 = local551 - local419;
								local570 = local379;
								local564 = local361;
							} else {
								@Pc(650) float local650 = (float) local545 / (float) super.anInt9739;
								@Pc(657) float local657 = (float) local549 / (float) super.anInt9739;
								@Pc(666) float local666 = (local361 - local278) * local650 + local278;
								local674 = (local370 - local285) * local650 + local285;
								@Pc(683) float local683 = local650 * (local379 - local292) + local292;
								@Pc(691) float local691 = local301 + (local330 - local301) * local650;
								@Pc(700) float local700 = (local341 - local310) * local650 + local310;
								@Pc(708) float local708 = (local352 - local319) * local650 + local319;
								local564 = local666 + (local691 - local666) * local657;
								local562 = local674 + local657 * (local700 - local674);
								local570 = local683 + local657 * (local708 - local683);
								@Pc(745) int local745 = local387 + ((local419 - local387) * local545 >> super.anInt9740);
								@Pc(757) int local757 = ((local409 - local397) * local545 >> super.anInt9740) + local397;
								local568 = local551 - local745 - (local549 * (local757 - local745) >> super.anInt9740);
							}
							@Pc(773) float local773 = 1.0F;
							if (local511 != -1) {
								@Pc(784) int local784 = (local511 & 0x7F) * local568 >> 7;
								if (local784 < 2) {
									local784 = 2;
								} else if (local784 > 126) {
									local784 = 126;
								}
								if ((this.anInt9630 & 0x7) == 0) {
									local773 = this.aClass101_Sub1_21.aFloatArray47[1] * local562 + this.aClass101_Sub1_21.aFloatArray47[0] * local564 + this.aClass101_Sub1_21.aFloatArray47[2] * local570;
									local773 = this.aClass101_Sub1_21.aFloat150 + (local773 > 0.0F ? this.aClass101_Sub1_21.aFloat151 : this.aClass101_Sub1_21.aFloat156) * local773;
								}
								local553 = Static101.anIntArray92[local784 | local511 & 0xFF80];
							}
							@Pc(855) Class2 local855 = null;
							if ((this.anInt9625 - 1 & local487) == 0 && (local497 & this.anInt9625 - 1) == 0) {
								local855 = local189.method8357(local541);
							}
							@Pc(894) int local894;
							@Pc(928) int local928;
							if (local855 == null) {
								if (local511 == local515) {
									local928 = local553;
								} else {
									@Pc(938) int local938 = (local515 & 0x7F) * local568 >> 7;
									if (local938 < 2) {
										local938 = 2;
									} else if (local938 > 126) {
										local938 = 126;
									}
									local928 = Static101.anIntArray92[local938 | local515 & 0xFF80];
									if ((this.anInt9630 & 0x7) == 0) {
										local674 = local570 * this.aClass101_Sub1_21.aFloatArray47[2] + local564 * this.aClass101_Sub1_21.aFloatArray47[0] + local562 * this.aClass101_Sub1_21.aFloatArray47[1];
										local674 = (local773 > 0.0F ? this.aClass101_Sub1_21.aFloat151 : this.aClass101_Sub1_21.aFloat156) * local773 + this.aClass101_Sub1_21.aFloat150;
										@Pc(1013) int local1013 = local928 >> 16 & 0xFF;
										@Pc(1019) int local1019 = local928 >> 8 & 0xFF;
										local1013 = (int) ((float) local1013 * local674);
										@Pc(1029) int local1029 = local928 & 0xFF;
										local1019 = (int) ((float) local1019 * local674);
										if (local1013 < 0) {
											local1013 = 0;
										} else if (local1013 > 255) {
											local1013 = 255;
										}
										if (local1019 < 0) {
											local1019 = 0;
										} else if (local1019 > 255) {
											local1019 = 255;
										}
										local1029 = (int) ((float) local1029 * local674);
										if (local1029 < 0) {
											local1029 = 0;
										} else if (local1029 > 255) {
											local1029 = 255;
										}
										local928 = local1029 | local1013 << 16 | local1019 << 8;
									}
								}
								if (Stream.c()) {
									local163.a((float) local487);
									local163.a((float) (local523 + this.method8542(local497, local487)));
									local163.a((float) local497);
									local163.a((float) local487);
									local163.a((float) local497);
									if (this.anIntArrayArrayArray19 != null) {
										local163.a((float) (local271 == null ? 0 : local271[local431] - 1));
									}
									if ((this.anInt9630 & 0x7) != 0) {
										local163.a(local564);
										local163.a(local562);
										local163.a(local570);
									}
								} else {
									local163.b((float) local487);
									local163.b((float) (local523 + this.method8542(local497, local487)));
									local163.b((float) local497);
									local163.b((float) local487);
									local163.b((float) local497);
									if (this.anIntArrayArrayArray19 != null) {
										local163.b((float) (local271 == null ? 0 : local271[local431] - 1));
									}
									if ((this.anInt9630 & 0x7) != 0) {
										local163.b(local564);
										local163.b(local562);
										local163.b(local570);
									}
								}
								if (this.aClass101_Sub1_21.anInt6641 == 0) {
									local168.d(local928 | 0xFF000000);
								} else {
									local168.f(local928 | 0xFF000000);
								}
								local894 = this.anInt9644++;
								local473[local431] = (short) local894;
								if (local511 != -1) {
									local172[local894] = local215[local431];
								}
								local189.method8356(new Class2_Sub32(local473[local431]), local541);
							} else {
								local473[local431] = ((Class2_Sub32) local855).aShort54;
								local894 = local473[local431] & 0xFFFF;
								if (local511 != -1 && local172[local894].aLong313 > local215[local431].aLong313) {
									local172[local894] = local215[local431];
								}
							}
							for (local928 = 0; local928 < local421; local928++) {
								local193[local928].method1036(local894, local553, local568, local773);
							}
							this.anInt9626++;
						}
					}
				}
			}
			for (local199 = 0; local199 < this.anInt9644; local199++) {
				@Pc(1312) Class2_Sub10 local1312 = local172[local199];
				if (local1312 != null) {
					local1312.method1031(local199);
				}
			}
			@Pc(1333) int local1333;
			@Pc(1351) int local1351;
			for (@Pc(1329) int local1329 = 0; local1329 < super.anInt9741; local1329++) {
				for (local1333 = 0; super.anInt9742 > local1333; local1333++) {
					@Pc(1345) short[] local1345 = this.aShortArrayArray18[local1329 + local1333 * super.anInt9741];
					if (local1345 != null) {
						@Pc(1349) int local1349 = 0;
						local1351 = 0;
						while (local1351 < local1345.length) {
							@Pc(1360) int local1360 = local1345[local1351++] & 0xFFFF;
							@Pc(1367) int local1367 = local1345[local1351++] & 0xFFFF;
							@Pc(1374) int local1374 = local1345[local1351++] & 0xFFFF;
							@Pc(1378) Class2_Sub10 local1378 = local172[local1360];
							@Pc(1382) Class2_Sub10 local1382 = local172[local1367];
							@Pc(1386) Class2_Sub10 local1386 = local172[local1374];
							@Pc(1388) Class2_Sub10 local1388 = null;
							if (local1378 != null) {
								local1388 = local1378;
								local1378.method1038(local1333, local1349, local1329);
							}
							if (local1382 != null) {
								local1382.method1038(local1333, local1349, local1329);
								if (local1388 == null || local1388.aLong313 > local1382.aLong313) {
									local1388 = local1382;
								}
							}
							if (local1386 != null) {
								local1386.method1038(local1333, local1349, local1329);
								if (local1388 == null || local1388.aLong313 > local1386.aLong313) {
									local1388 = local1386;
								}
							}
							if (local1388 != null) {
								if (local1378 != null) {
									local1388.method1031(local1360);
								}
								if (local1382 != null) {
									local1388.method1031(local1367);
								}
								if (local1386 != null) {
									local1388.method1031(local1374);
								}
								local1388.method1038(local1333, local1349, local1329);
							}
							local1349++;
						}
					}
				}
			}
			local163.a();
			local168.a();
			this.anInterface25_17 = this.aClass101_Sub1_21.method5856(false);
			this.anInterface25_17.method9042(4, local148, this.anInt9644 * 4);
			this.anInterface25_18 = this.aClass101_Sub1_21.method5856(false);
			this.anInterface25_18.method9042(local128, local158, local128 * this.anInt9644);
			if ((this.anInt9630 & 0x7) == 0) {
				if (this.anIntArrayArrayArray19 == null) {
					this.aClass167_23 = this.aClass101_Sub1_21.method5871(new Class280[] { new Class280(new Class354[] { Static591.aClass354_1, Static591.aClass354_5 }), new Class280(Static591.aClass354_3) });
				} else {
					this.aClass167_23 = this.aClass101_Sub1_21.method5871(new Class280[] { new Class280(new Class354[] { Static591.aClass354_1, Static591.aClass354_5, Static591.aClass354_4 }), new Class280(Static591.aClass354_3) });
				}
			} else if (this.anIntArrayArrayArray19 == null) {
				this.aClass167_23 = this.aClass101_Sub1_21.method5871(new Class280[] { new Class280(new Class354[] { Static591.aClass354_1, Static591.aClass354_5, Static591.aClass354_2 }), new Class280(Static591.aClass354_3) });
			} else {
				this.aClass167_23 = this.aClass101_Sub1_21.method5871(new Class280[] { new Class280(new Class354[] { Static591.aClass354_1, Static591.aClass354_5, Static591.aClass354_4, Static591.aClass354_2 }), new Class280(Static591.aClass354_3) });
			}
			local1333 = 0;
			for (@Pc(1696) int local1696 = 0; local1696 < local104.length; local1696++) {
				if (local104[local1696].anInt1044 > 0) {
					local104[local1333++] = local104[local1696];
				}
			}
			this.aClass2_Sub10Array1 = new Class2_Sub10[local1333];
			@Pc(1726) long[] local1726 = new long[local1333];
			for (local1351 = 0; local1351 < local1333; local1351++) {
				@Pc(1734) Class2_Sub10 local1734 = local104[local1351];
				local1726[local1351] = local1734.aLong313;
				this.aClass2_Sub10Array1[local1351] = local1734;
				local1734.method1039(this.anInt9644);
			}
			Static77.method1382(this.aClass2_Sub10Array1, local1726);
			if (this.aClass194_2 != null) {
				this.aClass194_2.method5021();
			}
		} else {
			this.aClass194_2 = null;
		}
		this.anIntArrayArrayArray15 = null;
		this.anIntArrayArrayArray19 = null;
		this.aClass335_41 = null;
		this.anIntArrayArrayArray18 = this.anIntArrayArrayArray17 = null;
		this.aFloatArrayArray17 = this.aFloatArrayArray15 = this.aFloatArrayArray16 = null;
		this.anIntArrayArrayArray20 = null;
		this.aByteArrayArray23 = null;
		this.anIntArrayArrayArray16 = null;
		this.aClass2_Sub10ArrayArrayArray1 = null;
	}

	@OriginalMember(owner = "client!sl", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray23[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray23[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)V")
	@Override
	public void method8533(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(I[[ZZIIIII)V")
	private void method8450(@OriginalArg(0) int arg0, @OriginalArg(1) boolean[][] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (this.aClass2_Sub10Array1 == null) {
			return;
		}
		@Pc(19) int local19 = arg0 + arg0 + 1;
		@Pc(23) int local23 = local19 * local19;
		if (local23 > Static206.anIntArray197.length) {
			Static206.anIntArray197 = new int[local23];
		}
		@Pc(39) int local39 = arg6 - arg0;
		@Pc(41) int local41 = local39;
		if (local39 < 0) {
			local39 = 0;
		}
		@Pc(49) int local49 = arg5 - arg0;
		@Pc(51) int local51 = local49;
		if (local49 < 0) {
			local49 = 0;
		}
		@Pc(62) int local62 = arg0 + arg6;
		if (super.anInt9741 - 1 < local62) {
			local62 = super.anInt9741 - 1;
		}
		@Pc(78) int local78 = arg5 + arg0;
		if (local78 > super.anInt9742 - 1) {
			local78 = super.anInt9742 - 1;
		}
		Static268.anInt5072 = 0;
		for (@Pc(97) int local97 = local39; local97 <= local62; local97++) {
			@Pc(106) boolean[] local106 = arg1[local97 - local41];
			for (@Pc(108) int local108 = local49; local108 <= local78; local108++) {
				if (local106[local108 - local51]) {
					Static206.anIntArray197[Static268.anInt5072++] = local97 + local108 * super.anInt9741;
				}
			}
		}
		if (arg3 == -1) {
			this.aClass101_Sub1_21.method5911();
		} else {
			this.aClass101_Sub1_21.method5879((float) arg3);
			this.aClass101_Sub1_21.method5852();
		}
		this.aClass101_Sub1_21.method5895();
		this.aClass101_Sub1_21.method5836((this.anInt9630 & 0x7) != 0);
		this.aClass101_Sub1_21.method5873(-1, false, false);
		this.aClass101_Sub1_21.method5953(0, this.anInterface25_18);
		for (@Pc(197) int local197 = 0; local197 < this.aClass2_Sub10Array1.length; local197++) {
			this.aClass2_Sub10Array1[local197].method1032(Static268.anInt5072, Static206.anIntArray197);
		}
		@Pc(222) Class76_Sub2 local222 = this.aClass101_Sub1_21.method5829();
		local222.method9639(0, -1, 0);
		this.aClass101_Sub1_21.method5944();
		if (!this.aClass271_59.method7169()) {
			@Pc(240) int local240 = this.aClass101_Sub1_21.anInt6649;
			@Pc(244) int local244 = this.aClass101_Sub1_21.anInt6650;
			this.aClass101_Sub1_21.L(0, local244, this.aClass101_Sub1_21.anInt6638);
			this.aClass101_Sub1_21.method5836(false);
			this.aClass101_Sub1_21.method5864(false);
			this.aClass101_Sub1_21.method5963(128);
			this.aClass101_Sub1_21.method5873(-2, false, false);
			this.aClass101_Sub1_21.method5909(this.aClass101_Sub1_21.anInterface5_3);
			this.aClass101_Sub1_21.method5891(Static175.aClass381_3, Static512.aClass381_5);
			this.aClass101_Sub1_21.method5954(0, Static660.aClass118_5);
			this.aClass101_Sub1_21.method5890(0, Static312.aClass118_3);
			for (@Pc(304) Class2 local304 = this.aClass271_59.method7177(); local304 != null; local304 = this.aClass271_59.method7175()) {
				@Pc(309) Class2_Sub27 local309 = (Class2_Sub27) local304;
				local309.method2586(arg6, arg5, arg0, arg1);
			}
			this.aClass101_Sub1_21.method5954(0, Static44.aClass118_1);
			this.aClass101_Sub1_21.method5890(0, Static44.aClass118_1);
			this.aClass101_Sub1_21.method5909((Interface5) null);
			this.aClass101_Sub1_21.L(local240, local244, this.aClass101_Sub1_21.anInt6638);
		}
		if (this.aClass194_2 == null) {
			return;
		}
		this.aClass101_Sub1_21.method5953(0, this.anInterface25_18);
		this.aClass101_Sub1_21.method5953(1, this.anInterface25_17);
		this.aClass101_Sub1_21.method5938(this.aClass167_23);
		this.aClass194_2.method5024(arg0, arg1, arg2, arg6, arg5);
		return;
	}

	@OriginalMember(owner = "client!sl", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class2_Sub1_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass194_2 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (this.aClass101_Sub1_21.anInt6616 * arg2 >> 8) >> this.aClass101_Sub1_21.anInt6632;
			@Pc(38) int local38 = arg3 - (this.aClass101_Sub1_21.anInt6626 * arg2 >> 8) >> this.aClass101_Sub1_21.anInt6632;
			this.aClass194_2.method5025(arg0, local23, local38);
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method8541(@OriginalArg(0) Class2_Sub1_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass194_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (this.aClass101_Sub1_21.anInt6616 * arg2 >> 8) >> this.aClass101_Sub1_21.anInt6632;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass101_Sub1_21.anInt6626 >> 8) >> this.aClass101_Sub1_21.anInt6632;
			return this.aClass194_2.method5027(local25, local39, arg0);
		}
	}

	@OriginalMember(owner = "client!sl", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class2_Sub1_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass194_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass101_Sub1_21.anInt6616 >> 8) >> this.aClass101_Sub1_21.anInt6632;
			@Pc(39) int local39 = arg3 - (this.aClass101_Sub1_21.anInt6626 * arg2 >> 8) >> this.aClass101_Sub1_21.anInt6632;
			this.aClass194_2.method5026(local39, local24, arg0);
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method8540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!sl", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		@Pc(9) Interface3 local9 = this.aClass101_Sub1_21.anInterface3_12;
		if (arg5 != null && this.anIntArrayArrayArray19 == null) {
			this.anIntArrayArrayArray19 = new int[super.anInt9741][super.anInt9742][];
		}
		if (arg3 != null && this.anIntArrayArrayArray15 == null) {
			this.anIntArrayArrayArray15 = new int[super.anInt9741][super.anInt9742][];
		}
		this.anIntArrayArrayArray18[arg0][arg1] = arg2;
		this.anIntArrayArrayArray17[arg0][arg1] = arg4;
		this.anIntArrayArrayArray20[arg0][arg1] = arg6;
		this.anIntArrayArrayArray16[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray19 != null) {
			this.anIntArrayArrayArray19[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray15 != null) {
			this.anIntArrayArrayArray15[arg0][arg1] = arg3;
		}
		@Pc(92) Class2_Sub10[] local92 = this.aClass2_Sub10ArrayArrayArray1[arg0][arg1] = new Class2_Sub10[arg6.length];
		for (@Pc(94) int local94 = 0; local94 < arg6.length; local94++) {
			@Pc(100) int local100 = arg8[local94];
			@Pc(104) int local104 = arg9[local94];
			if ((this.anInt9630 & 0x20) != 0 && local100 != -1 && local9.method1941(local100).aBoolean329) {
				local104 = 128;
				local100 = -1;
			}
			@Pc(148) long local148 = (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48 | (long) (local104 << 14) | (long) local100;
			@Pc(154) Class2 local154;
			for (local154 = this.aClass335_41.method8357(local148); local154 != null; local154 = this.aClass335_41.method8352()) {
				@Pc(159) Class2_Sub10 local159 = (Class2_Sub10) local154;
				if (local159.anInt1042 == local100 && (float) local104 == local159.aFloat7 && local159.anInt1043 == arg10 && arg11 == local159.anInt1046 && arg12 == local159.anInt1047) {
					break;
				}
			}
			if (local154 == null) {
				local92[local94] = new Class2_Sub10(this, local100, local104, arg10, arg11, arg12);
				this.aClass335_41.method8356(local92[local94], local148);
			} else {
				local92[local94] = (Class2_Sub10) local154;
			}
		}
		if (arg13) {
			this.aByteArrayArray22[arg0][arg1] = (byte) (this.aByteArrayArray22[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt9649) {
			this.anInt9649 = arg6.length;
		}
		this.anInt9648 += arg6.length;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIILclient!sb;)V")
	private void method8452(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub1_Sub11_Sub2 arg2) {
		@Pc(16) int[] local16 = this.anIntArrayArrayArray18[arg1][arg0];
		@Pc(23) int[] local23 = this.anIntArrayArrayArray17[arg1][arg0];
		@Pc(26) int local26 = local16.length;
		if (local26 > Static154.anIntArray164.length) {
			Static499.anIntArray450 = new int[local26];
			Static154.anIntArray164 = new int[local26];
		}
		for (@Pc(38) int local38 = 0; local38 < local26; local38++) {
			Static154.anIntArray164[local38] = local16[local38] >> this.aClass101_Sub1_21.anInt6632;
			Static499.anIntArray450[local38] = local23[local38] >> this.aClass101_Sub1_21.anInt6632;
		}
		@Pc(70) int local70 = 0;
		while (local70 < local26) {
			@Pc(76) int local76 = Static154.anIntArray164[local70];
			@Pc(81) int local81 = Static499.anIntArray450[local70++];
			@Pc(85) int local85 = Static154.anIntArray164[local70];
			@Pc(90) int local90 = Static499.anIntArray450[local70++];
			@Pc(94) int local94 = Static154.anIntArray164[local70];
			@Pc(99) int local99 = Static499.anIntArray450[local70++];
			if (-((local94 - local85) * (-local81 + local90)) + (local76 - local85) * (local90 - local99) > 0) {
				arg2.method8247(local81, local94, local85, local99, local76, local90);
			}
		}
	}

	@OriginalMember(owner = "client!sl", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class2_Sub1_Sub11 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub1_Sub11 arg2) {
		if ((this.aByteArrayArray22[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt9739 >> this.aClass101_Sub1_21.anInt6632;
		@Pc(27) Class2_Sub1_Sub11_Sub2 local27 = (Class2_Sub1_Sub11_Sub2) arg2;
		@Pc(37) Class2_Sub1_Sub11_Sub2 local37;
		if (local27 != null && local27.method8250(local24, local24)) {
			local37 = local27;
			local27.method8246();
		} else {
			local37 = new Class2_Sub1_Sub11_Sub2(this.aClass101_Sub1_21, local24, local24);
		}
		local37.method8248(local24, local24, 0, 0);
		this.method8452(arg1, arg0, local37);
		return local37;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lclient!mfa;[I)V")
	@Override
	public void method8543(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass271_59.method7174(new Class2_Sub27(this.aClass101_Sub1_21, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method8534(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt9648 <= 0) {
			return;
		}
		@Pc(16) Interface24 local16 = this.aClass101_Sub1_21.method5830(this.anInt9626);
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = 32767;
		@Pc(22) int local22 = -32768;
		for (@Pc(24) int local24 = 0; local24 < 4; local24++) {
			local18 = 0;
			@Pc(33) Buffer local33 = local16.method6460();
			if (local33 != null) {
				@Pc(41) Stream local41 = this.aClass101_Sub1_21.method5942(local33);
				@Pc(45) int local45;
				@Pc(55) int local55;
				@Pc(57) int local57;
				@Pc(75) short[] local75;
				@Pc(79) int local79;
				@Pc(87) int local87;
				if (Stream.c()) {
					for (local45 = arg1; local45 < arg3; local45++) {
						local55 = arg0 + super.anInt9741 * local45;
						for (local57 = arg0; local57 < arg2; local57++) {
							if (arg4[local57 - arg0][local45 - arg1]) {
								local75 = this.aShortArrayArray18[local55];
								if (local75 != null) {
									for (local79 = 0; local79 < local75.length; local79++) {
										local87 = local75[local79] & 0xFFFF;
										if (local87 > local22) {
											local22 = local87;
										}
										local41.c(local87);
										if (local87 < local20) {
											local20 = local87;
										}
										local18++;
									}
								}
							}
							local55++;
						}
					}
				} else {
					for (local45 = arg1; local45 < arg3; local45++) {
						local55 = super.anInt9741 * local45 + arg0;
						for (local57 = arg0; local57 < arg2; local57++) {
							if (arg4[local57 - arg0][local45 - arg1]) {
								local75 = this.aShortArrayArray18[local55];
								if (local75 != null) {
									for (local79 = 0; local79 < local75.length; local79++) {
										local87 = local75[local79] & 0xFFFF;
										local41.a(local87);
										if (local87 < local20) {
											local20 = local87;
										}
										if (local87 > local22) {
											local22 = local87;
										}
										local18++;
									}
								}
							}
							local55++;
						}
					}
				}
				local41.a();
				if (local16.method6459()) {
					break;
				}
			}
		}
		if (local18 <= 0) {
			return;
		}
		this.aClass101_Sub1_21.method5842();
		this.aClass101_Sub1_21.method5921(false);
		this.aClass101_Sub1_21.method5836(false);
		this.aClass101_Sub1_21.method5837(false);
		this.aClass101_Sub1_21.method5864(false);
		this.aClass101_Sub1_21.method5963(0);
		this.aClass101_Sub1_21.method5873(-2, false, false);
		this.aClass101_Sub1_21.method5909((Interface5) null);
		@Pc(282) Class76_Sub2 local282 = this.aClass101_Sub1_21.method5829();
		@Pc(287) float[] local287 = this.aClass101_Sub1_21.method5887();
		local287[5] = (float) 1024 / ((float) this.aClass101_Sub1_21.anInt6599 * (float) super.anInt9739 * 128.0F);
		local287[14] = -this.aFloat181 / (this.aFloat182 - this.aFloat181);
		local287[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass101_Sub1_21.anInt6599;
		local287[12] = -(((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass101_Sub1_21.anInt6608) - 1.0F;
		local287[11] = 0.0F;
		local287[15] = 1.0F;
		local287[2] = 0.0F;
		local287[0] = (float) 1024 / ((float) super.anInt9739 * 128.0F * (float) this.aClass101_Sub1_21.anInt6608);
		local287[9] = 0.0F;
		local287[1] = 0.0F;
		local287[6] = 0.0F;
		local287[3] = 0.0F;
		local287[7] = 0.0F;
		local287[10] = 1.0F / (this.aFloat182 - this.aFloat181);
		local287[8] = 0.0F;
		local287[4] = 0.0F;
		local282.method7346(0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F);
		this.aClass101_Sub1_21.method5897();
		this.aClass101_Sub1_21.method5944();
		if ((this.anInt9630 & 0x7) == 0) {
			this.aClass101_Sub1_21.method5836(false);
		} else {
			this.aClass101_Sub1_21.method5836(true);
			this.aClass101_Sub1_21.method5843();
		}
		this.aClass101_Sub1_21.method5907(false);
		this.aClass101_Sub1_21.method5953(0, this.anInterface25_18);
		this.aClass101_Sub1_21.method5953(1, this.anInterface25_17);
		this.aClass101_Sub1_21.method5938(this.aClass167_23);
		this.aClass101_Sub1_21.method5947(local20, local22 + 1 - local20, local16, Static627.aClass320_6, 0, local18 / 3);
		this.aClass101_Sub1_21.method5907(true);
	}
}
