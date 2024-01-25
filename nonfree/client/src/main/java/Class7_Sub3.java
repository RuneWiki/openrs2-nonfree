import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ml")
public final class Class7_Sub3 extends Class7 {

	@OriginalMember(owner = "client!ml", name = "o", descriptor = "I")
	private int anInt5861;

	@OriginalMember(owner = "client!ml", name = "K", descriptor = "I")
	private int anInt5876;

	@OriginalMember(owner = "client!ml", name = "O", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray17;

	@OriginalMember(owner = "client!ml", name = "T", descriptor = "Lclient!rq;")
	private Interface16 anInterface16_7;

	@OriginalMember(owner = "client!ml", name = "Z", descriptor = "Lclient!vr;")
	public Class310 aClass310_14;

	@OriginalMember(owner = "client!ml", name = "ab", descriptor = "Lclient!vr;")
	private Class310 aClass310_15;

	@OriginalMember(owner = "client!ml", name = "cb", descriptor = "I")
	private int anInt5883;

	@OriginalMember(owner = "client!ml", name = "db", descriptor = "I")
	private int anInt5884;

	@OriginalMember(owner = "client!ml", name = "fb", descriptor = "[Lclient!uh;")
	private Class1_Sub48[] aClass1_Sub48Array1;

	@OriginalMember(owner = "client!ml", name = "y", descriptor = "Lclient!ui;")
	private final Class295 aClass295_31 = new Class295();

	@OriginalMember(owner = "client!ml", name = "j", descriptor = "Lclient!bda;")
	public final Class4_Sub2 aClass4_Sub2_10;

	@OriginalMember(owner = "client!ml", name = "F", descriptor = "[[I")
	private final int[][] anIntArrayArray65;

	@OriginalMember(owner = "client!ml", name = "R", descriptor = "I")
	private final int anInt5881;

	@OriginalMember(owner = "client!ml", name = "t", descriptor = "[[S")
	public final short[][] aShortArrayArray6;

	@OriginalMember(owner = "client!ml", name = "i", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!ml", name = "Y", descriptor = "[[F")
	private float[][] aFloatArrayArray11;

	@OriginalMember(owner = "client!ml", name = "B", descriptor = "I")
	private final int anInt5871;

	@OriginalMember(owner = "client!ml", name = "V", descriptor = "[[F")
	private float[][] aFloatArrayArray9;

	@OriginalMember(owner = "client!ml", name = "v", descriptor = "I")
	public final int anInt5866;

	@OriginalMember(owner = "client!ml", name = "J", descriptor = "[[[Lclient!uh;")
	private Class1_Sub48[][][] aClass1_Sub48ArrayArrayArray1;

	@OriginalMember(owner = "client!ml", name = "h", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!ml", name = "X", descriptor = "[[F")
	private float[][] aFloatArrayArray10;

	@OriginalMember(owner = "client!ml", name = "g", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!ml", name = "C", descriptor = "[[B")
	private final byte[][] aByteArrayArray17;

	@OriginalMember(owner = "client!ml", name = "q", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!ml", name = "U", descriptor = "[[B")
	private byte[][] aByteArrayArray18;

	@OriginalMember(owner = "client!ml", name = "G", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!ml", name = "eb", descriptor = "Lclient!pt;")
	private Class230 aClass230_34;

	@OriginalMember(owner = "client!ml", name = "S", descriptor = "Lclient!rt;")
	private Class260 aClass260_2;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lclient!bda;IIII[[I[[II)V")
	public Class7_Sub3(@OriginalArg(0) Class4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.aClass4_Sub2_10 = arg0;
		this.anIntArrayArray65 = arg5;
		this.anInt5881 = super.anInt9573 - 2;
		this.aShortArrayArray6 = new short[arg3 * arg4][];
		this.anIntArrayArrayArray14 = new int[arg3][arg4][];
		this.aFloatArrayArray11 = new float[super.anInt9577 + 1][super.anInt9575 + 1];
		this.anInt5871 = 0x1 << this.anInt5881;
		this.aFloatArrayArray9 = new float[super.anInt9577 + 1][super.anInt9575 + 1];
		this.anInt5866 = arg2;
		this.aClass1_Sub48ArrayArrayArray1 = new Class1_Sub48[arg3][arg4][];
		this.anIntArrayArrayArray13 = new int[arg3][arg4][];
		this.aFloatArrayArray10 = new float[super.anInt9577 + 1][super.anInt9575 + 1];
		this.anIntArrayArrayArray12 = new int[arg3][arg4][];
		this.aByteArrayArray17 = new byte[arg3][arg4];
		this.anIntArrayArrayArray15 = new int[arg3][arg4][];
		this.aByteArrayArray18 = new byte[arg3 + 1][arg4 + 1];
		this.anIntArrayArrayArray16 = new int[arg3][arg4][];
		for (@Pc(117) int local117 = 1; local117 < super.anInt9575; local117++) {
			for (@Pc(121) int local121 = 1; local121 < super.anInt9577; local121++) {
				@Pc(140) int local140 = arg6[local121 + 1][local117] - arg6[local121 - 1][local117];
				@Pc(157) int local157 = arg6[local121][local117 + 1] - arg6[local121][local117 - 1];
				@Pc(176) float local176 = (float) (1.0D / Math.sqrt((double) (local157 * local157 + local140 * local140 + arg7 * arg7 * 4)));
				this.aFloatArrayArray10[local121][local117] = (float) local140 * local176;
				this.aFloatArrayArray9[local121][local117] = local176 * (float) (-arg7 * 2);
				this.aFloatArrayArray11[local121][local117] = (float) local157 * local176;
			}
		}
		this.aClass230_34 = new Class230(128);
		if ((this.anInt5866 & 0x10) != 0) {
			this.aClass260_2 = new Class260(this.aClass4_Sub2_10, this);
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!k;IIIIZ)Z")
	@Override
	public boolean method8250(@OriginalArg(0) Class1_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass260_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass4_Sub2_10.anInt8302 >> 8) >> this.aClass4_Sub2_10.anInt8290;
			@Pc(39) int local39 = arg3 - (this.aClass4_Sub2_10.anInt8314 * arg2 >> 8) >> this.aClass4_Sub2_10.anInt8290;
			return this.aClass260_2.method6709(local39, local24, arg0);
		}
	}

	@OriginalMember(owner = "client!ml", name = "ba", descriptor = "(II)I")
	@Override
	public int ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray65[arg0][arg1];
	}

	@OriginalMember(owner = "client!ml", name = "N", descriptor = "()V")
	@Override
	public void N() {
		if (this.anInt5884 <= 0) {
			this.aClass260_2 = null;
		} else {
			@Pc(26) byte[][] local26 = new byte[super.anInt9577 + 1][super.anInt9575 + 1];
			for (@Pc(28) int local28 = 1; local28 < super.anInt9577; local28++) {
				for (@Pc(32) int local32 = 1; local32 < super.anInt9575; local32++) {
					local26[local28][local32] = (byte) ((this.aByteArrayArray18[local28][local32 - 1] >> 2) + (this.aByteArrayArray18[local28 + 1][local32] >> 3) + (this.aByteArrayArray18[local28 - 1][local32] >> 2) + (this.aByteArrayArray18[local28][local32 - -1] >> 3) + (this.aByteArrayArray18[local28][local32] >> 1));
				}
			}
			@Pc(112) Class1_Sub48[] local112 = new Class1_Sub48[this.aClass230_34.method6138()];
			this.aClass230_34.method6143(local112);
			for (@Pc(120) int local120 = 0; local120 < local112.length; local120++) {
				local112[local120].method7532(this.anInt5884);
			}
			@Pc(136) int local136 = 24;
			if (this.anIntArrayArrayArray17 != null) {
				local136 += 4;
			}
			if ((this.anInt5866 & 0x7) != 0) {
				local136 += 12;
			}
			@Pc(156) NativeHeapBuffer local156 = this.aClass4_Sub2_10.aNativeHeap6.a(this.anInt5884 * local136, false);
			@Pc(161) Stream local161 = new Stream(local156);
			@Pc(165) Class1_Sub48[] local165 = new Class1_Sub48[this.anInt5884];
			@Pc(172) int local172 = Static513.method7859(this.anInt5884 / 4);
			if (local172 < 1) {
				local172 = 1;
			}
			@Pc(182) Class230 local182 = new Class230(local172);
			@Pc(186) Class1_Sub48[] local186 = new Class1_Sub48[this.anInt5883];
			@Pc(192) int local192;
			for (@Pc(188) int local188 = 0; super.anInt9577 > local188; local188++) {
				for (local192 = 0; super.anInt9575 > local192; local192++) {
					if (this.anIntArrayArrayArray15[local188][local192] != null) {
						@Pc(208) Class1_Sub48[] local208 = this.aClass1_Sub48ArrayArrayArray1[local188][local192];
						@Pc(215) int[] local215 = this.anIntArrayArrayArray14[local188][local192];
						@Pc(222) int[] local222 = this.anIntArrayArrayArray12[local188][local192];
						@Pc(229) int[] local229 = this.anIntArrayArrayArray16[local188][local192];
						@Pc(236) int[] local236 = this.anIntArrayArrayArray15[local188][local192];
						@Pc(248) int[] local248 = this.anIntArrayArrayArray13 == null ? null : this.anIntArrayArrayArray13[local188][local192];
						@Pc(260) int[] local260 = this.anIntArrayArrayArray17 == null ? null : this.anIntArrayArrayArray17[local188][local192];
						if (local229 == null) {
							local229 = local236;
						}
						@Pc(271) float local271 = this.aFloatArrayArray10[local188][local192];
						@Pc(278) float local278 = this.aFloatArrayArray9[local188][local192];
						@Pc(285) float local285 = this.aFloatArrayArray11[local188][local192];
						@Pc(294) float local294 = this.aFloatArrayArray10[local188][local192 + 1];
						@Pc(303) float local303 = this.aFloatArrayArray9[local188][local192 + 1];
						@Pc(312) float local312 = this.aFloatArrayArray11[local188][local192 + 1];
						@Pc(323) float local323 = this.aFloatArrayArray10[local188 + 1][local192 + 1];
						@Pc(334) float local334 = this.aFloatArrayArray9[local188 + 1][local192 + 1];
						@Pc(345) float local345 = this.aFloatArrayArray11[local188 + 1][local192 + 1];
						@Pc(354) float local354 = this.aFloatArrayArray10[local188 + 1][local192];
						@Pc(363) float local363 = this.aFloatArrayArray9[local188 + 1][local192];
						@Pc(372) float local372 = this.aFloatArrayArray11[local188 + 1][local192];
						@Pc(380) int local380 = local26[local188][local192] & 0xFF;
						@Pc(390) int local390 = local26[local188][local192 + 1] & 0xFF;
						@Pc(402) int local402 = local26[local188 + 1][local192 + 1] & 0xFF;
						@Pc(412) int local412 = local26[local188 + 1][local192] & 0xFF;
						@Pc(414) int local414 = 0;
						@Pc(424) int local424;
						label357: for (@Pc(416) int local416 = 0; local416 < local236.length; local416++) {
							@Pc(422) Class1_Sub48 local422 = local208[local416];
							for (local424 = 0; local424 < local414; local424++) {
								if (local186[local424] == local422) {
									continue label357;
								}
							}
							local186[local414++] = local422;
						}
						@Pc(465) short[] local465 = this.aShortArrayArray6[super.anInt9577 * local192 + local188] = new short[local236.length];
						for (local424 = 0; local424 < local236.length; local424++) {
							@Pc(479) int local479 = (local188 << super.anInt9573) + local215[local424];
							@Pc(488) int local488 = (local192 << super.anInt9573) + local222[local424];
							@Pc(493) int local493 = local479 >> this.anInt5881;
							@Pc(498) int local498 = local488 >> this.anInt5881;
							@Pc(502) int local502 = local236[local424];
							@Pc(506) int local506 = local229[local424];
							@Pc(514) int local514 = local248 == null ? 0 : local248[local424];
							@Pc(532) long local532 = (long) local498 | (long) (local493 << 16) | (long) local506 << 48 | (long) local502 << 32;
							@Pc(536) int local536 = local215[local424];
							@Pc(540) int local540 = local222[local424];
							@Pc(542) byte local542 = 74;
							@Pc(544) int local544 = 0;
							@Pc(546) float local546 = 1.0F;
							@Pc(579) float local579;
							@Pc(571) float local571;
							@Pc(573) float local573;
							@Pc(645) float local645;
							@Pc(577) int local577;
							if (local536 == 0 && local540 == 0) {
								local579 = local271;
								local573 = local285;
								local577 = local542 - local380;
								local571 = local278;
							} else if (local536 == 0 && super.anInt9576 == local540) {
								local571 = local303;
								local573 = local312;
								local577 = local542 - local390;
								local579 = local294;
							} else if (local536 == super.anInt9576 && super.anInt9576 == local540) {
								local573 = local345;
								local577 = local542 - local402;
								local571 = local334;
								local579 = local323;
							} else if (super.anInt9576 == local536 && local540 == 0) {
								local577 = local542 - local412;
								local573 = local372;
								local571 = local363;
								local579 = local354;
							} else {
								@Pc(622) float local622 = (float) local536 / (float) super.anInt9576;
								@Pc(629) float local629 = (float) local540 / (float) super.anInt9576;
								@Pc(637) float local637 = local271 + (local354 - local271) * local622;
								local645 = local278 + (local363 - local278) * local622;
								@Pc(654) float local654 = (local372 - local285) * local622 + local285;
								@Pc(662) float local662 = local294 + (local323 - local294) * local622;
								@Pc(670) float local670 = (local334 - local303) * local622 + local303;
								local579 = local637 + (local662 - local637) * local629;
								local571 = local645 + (local670 - local645) * local629;
								@Pc(696) float local696 = local622 * (local345 - local312) + local312;
								local573 = (local696 - local654) * local629 + local654;
								@Pc(716) int local716 = ((local412 - local380) * local536 >> super.anInt9573) + local380;
								@Pc(728) int local728 = ((local402 - local390) * local536 >> super.anInt9573) + local390;
								local577 = local542 - local716 - ((local728 - local716) * local540 >> super.anInt9573);
							}
							if (local502 != -1) {
								@Pc(776) int local776 = (local502 & 0x7F) * local577 >> 7;
								if (local776 < 2) {
									local776 = 2;
								} else if (local776 > 126) {
									local776 = 126;
								}
								if ((this.anInt5866 & 0x7) == 0) {
									local546 = this.aClass4_Sub2_10.aFloatArray66[1] * local571 + this.aClass4_Sub2_10.aFloatArray66[0] * local579 + this.aClass4_Sub2_10.aFloatArray66[2] * local573;
									local546 = this.aClass4_Sub2_10.aFloat176 + local546 * (local546 > 0.0F ? this.aClass4_Sub2_10.aFloat174 : this.aClass4_Sub2_10.aFloat166);
								}
								local544 = Static107.anIntArray176[local502 & 0xFF80 | local776];
							}
							@Pc(847) Class1 local847 = null;
							if ((local479 & this.anInt5871 - 1) == 0 && (local488 & this.anInt5871 - 1) == 0) {
								local847 = local182.method6144(local532);
							}
							@Pc(1190) int local1190;
							@Pc(907) int local907;
							if (local847 == null) {
								if (local502 == local506) {
									local907 = local544;
								} else {
									@Pc(885) int local885 = (local506 & 0x7F) * local577 >> 7;
									if (local885 < 2) {
										local885 = 2;
									} else if (local885 > 126) {
										local885 = 126;
									}
									local907 = Static107.anIntArray176[local506 & 0xFF80 | local885];
									if ((this.anInt5866 & 0x7) == 0) {
										local645 = this.aClass4_Sub2_10.aFloatArray66[2] * local573 + local579 * this.aClass4_Sub2_10.aFloatArray66[0] + this.aClass4_Sub2_10.aFloatArray66[1] * local571;
										local645 = (local546 > 0.0F ? this.aClass4_Sub2_10.aFloat174 : this.aClass4_Sub2_10.aFloat166) * local546 + this.aClass4_Sub2_10.aFloat176;
										@Pc(960) int local960 = local907 >> 16 & 0xFF;
										@Pc(966) int local966 = local907 >> 8 & 0xFF;
										local960 = (int) ((float) local960 * local645);
										@Pc(976) int local976 = local907 & 0xFF;
										local966 = (int) ((float) local966 * local645);
										if (local960 < 0) {
											local960 = 0;
										} else if (local960 > 255) {
											local960 = 255;
										}
										local976 = (int) ((float) local976 * local645);
										if (local966 < 0) {
											local966 = 0;
										} else if (local966 > 255) {
											local966 = 255;
										}
										if (local976 < 0) {
											local976 = 0;
										} else if (local976 > 255) {
											local976 = 255;
										}
										local907 = local976 | local960 << 16 | local966 << 8;
									}
								}
								if (Stream.a()) {
									local161.b((float) local479);
									local161.b((float) (this.aa(local479, local488) + local514));
									local161.b((float) local488);
									local161.b((float) local479);
									local161.b((float) local488);
									if (this.anIntArrayArrayArray17 != null) {
										local161.b((float) (local260 == null ? 0 : local260[local424] - 1));
									}
									if ((this.anInt5866 & 0x7) != 0) {
										local161.b(local579);
										local161.b(local571);
										local161.b(local573);
									}
								} else {
									local161.a((float) local479);
									local161.a((float) (this.aa(local479, local488) + local514));
									local161.a((float) local488);
									local161.a((float) local479);
									local161.a((float) local488);
									if (this.anIntArrayArrayArray17 != null) {
										local161.a((float) (local260 == null ? 0 : local260[local424] - 1));
									}
									if ((this.anInt5866 & 0x7) != 0) {
										local161.a(local579);
										local161.a(local571);
										local161.a(local573);
									}
								}
								if (this.aClass4_Sub2_10.anInt8318 == 0) {
									local161.e(local907 | 0xFF000000);
								} else {
									local161.f(local907 | 0xFF000000);
								}
								local1190 = this.anInt5876++;
								local465[local424] = (short) local1190;
								if (local502 != -1) {
									local165[local1190] = local208[local424];
								}
								local182.method6139(local532, new Class1_Sub49(local465[local424]));
							} else {
								local465[local424] = ((Class1_Sub49) local847).aShort117;
								local1190 = local465[local424] & 0xFFFF;
								if (local502 != -1 && local208[local424].aLong251 < local165[local1190].aLong251) {
									local165[local1190] = local208[local424];
								}
							}
							for (local907 = 0; local907 < local414; local907++) {
								local186[local907].method7524(local577, local1190, local546, local544);
							}
							this.anInt5861++;
						}
					}
				}
			}
			for (local192 = 0; local192 < this.anInt5876; local192++) {
				@Pc(1301) Class1_Sub48 local1301 = local165[local192];
				if (local1301 != null) {
					local1301.method7526(local192);
				}
			}
			@Pc(1322) int local1322;
			@Pc(1340) int local1340;
			for (@Pc(1318) int local1318 = 0; super.anInt9577 > local1318; local1318++) {
				for (local1322 = 0; local1322 < super.anInt9575; local1322++) {
					@Pc(1334) short[] local1334 = this.aShortArrayArray6[local1318 + local1322 * super.anInt9577];
					if (local1334 != null) {
						@Pc(1338) int local1338 = 0;
						local1340 = 0;
						while (local1334.length > local1340) {
							@Pc(1349) int local1349 = local1334[local1340++] & 0xFFFF;
							@Pc(1356) int local1356 = local1334[local1340++] & 0xFFFF;
							@Pc(1363) int local1363 = local1334[local1340++] & 0xFFFF;
							@Pc(1367) Class1_Sub48 local1367 = local165[local1349];
							@Pc(1371) Class1_Sub48 local1371 = local165[local1356];
							@Pc(1375) Class1_Sub48 local1375 = local165[local1363];
							@Pc(1377) Class1_Sub48 local1377 = null;
							if (local1367 != null) {
								local1377 = local1367;
								local1367.method7527(local1318, local1322, local1338);
							}
							if (local1371 != null) {
								local1371.method7527(local1318, local1322, local1338);
								if (local1377 == null || local1377.aLong251 > local1371.aLong251) {
									local1377 = local1371;
								}
							}
							if (local1375 != null) {
								local1375.method7527(local1318, local1322, local1338);
								if (local1377 == null || local1375.aLong251 < local1377.aLong251) {
									local1377 = local1375;
								}
							}
							if (local1377 != null) {
								if (local1367 != null) {
									local1377.method7526(local1349);
								}
								if (local1371 != null) {
									local1377.method7526(local1356);
								}
								if (local1375 != null) {
									local1377.method7526(local1363);
								}
								local1377.method7527(local1318, local1322, local1338);
							}
							local1338++;
						}
					}
				}
			}
			local161.b();
			this.anInterface16_7 = this.aClass4_Sub2_10.method7250(false);
			this.anInterface16_7.method7615(this.anInt5876 * local136, local156, local136);
			if ((this.anInt5866 & 0x7) == 0) {
				if (this.anIntArrayArrayArray17 == null) {
					this.aClass310_15 = this.aClass4_Sub2_10.method7266(new Class154[] { new Class154(new Class313[] { Static525.aClass313_1, Static525.aClass313_5, Static525.aClass313_3 }) });
					this.aClass310_14 = this.aClass4_Sub2_10.method7266(new Class154[] { new Class154(new Class313[] { Static525.aClass313_1, Static525.aClass313_5 }), new Class154(Static525.aClass313_3) });
				} else {
					this.aClass310_15 = this.aClass4_Sub2_10.method7266(new Class154[] { new Class154(new Class313[] { Static525.aClass313_1, Static525.aClass313_5, Static525.aClass313_4, Static525.aClass313_3 }) });
					this.aClass310_14 = this.aClass4_Sub2_10.method7266(new Class154[] { new Class154(new Class313[] { Static525.aClass313_1, Static525.aClass313_5, Static525.aClass313_4 }), new Class154(Static525.aClass313_3) });
				}
			} else if (this.anIntArrayArrayArray17 == null) {
				this.aClass310_15 = this.aClass4_Sub2_10.method7266(new Class154[] { new Class154(new Class313[] { Static525.aClass313_1, Static525.aClass313_5, Static525.aClass313_2, Static525.aClass313_3 }) });
				this.aClass310_14 = this.aClass4_Sub2_10.method7266(new Class154[] { new Class154(new Class313[] { Static525.aClass313_1, Static525.aClass313_5, Static525.aClass313_2 }), new Class154(Static525.aClass313_3) });
			} else {
				this.aClass310_15 = this.aClass4_Sub2_10.method7266(new Class154[] { new Class154(new Class313[] { Static525.aClass313_1, Static525.aClass313_5, Static525.aClass313_4, Static525.aClass313_2, Static525.aClass313_3 }) });
				this.aClass310_14 = this.aClass4_Sub2_10.method7266(new Class154[] { new Class154(new Class313[] { Static525.aClass313_1, Static525.aClass313_5, Static525.aClass313_4, Static525.aClass313_2 }), new Class154(Static525.aClass313_3) });
			}
			local1322 = 0;
			for (@Pc(1784) int local1784 = 0; local1784 < local112.length; local1784++) {
				if (local112[local1784].anInt8612 > 0) {
					local112[local1322++] = local112[local1784];
				}
			}
			this.aClass1_Sub48Array1 = new Class1_Sub48[local1322];
			@Pc(1817) long[] local1817 = new long[local1322];
			for (local1340 = 0; local1340 < local1322; local1340++) {
				@Pc(1825) Class1_Sub48 local1825 = local112[local1340];
				local1817[local1340] = local1825.aLong251;
				this.aClass1_Sub48Array1[local1340] = local1825;
				local1825.method7529(this.anInt5876);
			}
			Static316.method5450(this.aClass1_Sub48Array1, local1817);
			if (this.aClass260_2 != null) {
				this.aClass260_2.method6705();
			}
		}
		this.aByteArrayArray18 = null;
		this.aFloatArrayArray10 = this.aFloatArrayArray9 = this.aFloatArrayArray11 = null;
		this.aClass1_Sub48ArrayArrayArray1 = null;
		this.anIntArrayArrayArray15 = null;
		this.anIntArrayArrayArray17 = null;
		this.anIntArrayArrayArray16 = null;
		this.anIntArrayArrayArray14 = this.anIntArrayArrayArray12 = null;
		this.anIntArrayArrayArray13 = null;
		this.aClass230_34 = null;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method8245(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt5884 <= 0) {
			return;
		}
		@Pc(16) Interface9 local16 = this.aClass4_Sub2_10.method7262(this.anInt5861);
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = 32767;
		@Pc(22) int local22 = -32768;
		for (@Pc(24) int local24 = 0; local24 < 4; local24++) {
			local18 = 0;
			@Pc(33) Buffer local33 = local16.method7613();
			if (local33 != null) {
				@Pc(41) Stream local41 = this.aClass4_Sub2_10.method7263(local33);
				@Pc(45) int local45;
				@Pc(54) int local54;
				@Pc(56) int local56;
				@Pc(74) short[] local74;
				@Pc(78) int local78;
				@Pc(86) int local86;
				if (Stream.a()) {
					for (local45 = arg1; local45 < arg3; local45++) {
						local54 = arg0 + super.anInt9577 * local45;
						for (local56 = arg0; local56 < arg2; local56++) {
							if (arg4[local56 - arg0][local45 - arg1]) {
								local74 = this.aShortArrayArray6[local54];
								if (local74 != null) {
									for (local78 = 0; local78 < local74.length; local78++) {
										local86 = local74[local78] & 0xFFFF;
										if (local86 > local22) {
											local22 = local86;
										}
										local41.c(local86);
										local18++;
										if (local20 > local86) {
											local20 = local86;
										}
									}
								}
							}
							local54++;
						}
					}
				} else {
					for (local45 = arg1; local45 < arg3; local45++) {
						local54 = local45 * super.anInt9577 + arg0;
						for (local56 = arg0; local56 < arg2; local56++) {
							if (arg4[local56 - arg0][local45 - arg1]) {
								local74 = this.aShortArrayArray6[local54];
								if (local74 != null) {
									for (local78 = 0; local78 < local74.length; local78++) {
										local86 = local74[local78] & 0xFFFF;
										if (local22 < local86) {
											local22 = local86;
										}
										if (local20 > local86) {
											local20 = local86;
										}
										local18++;
										local41.d(local86);
									}
								}
							}
							local54++;
						}
					}
				}
				local41.b();
				if (local16.method7614()) {
					break;
				}
			}
		}
		if (local18 <= 0) {
			return;
		}
		this.aClass4_Sub2_10.method7355();
		this.aClass4_Sub2_10.method7261(false);
		this.aClass4_Sub2_10.method7299(false);
		this.aClass4_Sub2_10.method7283(false);
		this.aClass4_Sub2_10.method7348(false);
		this.aClass4_Sub2_10.method7228(0);
		this.aClass4_Sub2_10.method7281(-2, false, false);
		this.aClass4_Sub2_10.method7316(null);
		@Pc(266) Class128_Sub3 local266 = this.aClass4_Sub2_10.method7338();
		@Pc(271) float[] local271 = this.aClass4_Sub2_10.method7259();
		local271[9] = 0.0F;
		local271[13] = 1.0F - ((float) (arg3 * 1024) / 128.0F + (float) 0) / (float) this.aClass4_Sub2_10.anInt8167;
		local271[3] = 0.0F;
		local271[10] = 0.0F;
		local271[1] = 0.0F;
		local271[0] = (float) 1024 / ((float) super.anInt9576 * 128.0F * (float) this.aClass4_Sub2_10.anInt8123);
		local271[8] = 0.0F;
		local271[5] = (float) 1024 / ((float) super.anInt9576 * 128.0F * (float) this.aClass4_Sub2_10.anInt8167);
		local271[2] = 0.0F;
		local271[15] = 1.0F;
		local271[4] = 0.0F;
		local271[11] = 0.0F;
		local271[6] = 0.0F;
		local271[12] = -(((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass4_Sub2_10.anInt8123) - 1.0F;
		local271[7] = 0.0F;
		local271[14] = 0.0F;
		local266.method6904(1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
		this.aClass4_Sub2_10.method7324();
		this.aClass4_Sub2_10.method7306();
		if ((this.anInt5866 & 0x7) == 0) {
			this.aClass4_Sub2_10.method7299(false);
		} else {
			this.aClass4_Sub2_10.method7299(true);
			this.aClass4_Sub2_10.method7312();
		}
		this.aClass4_Sub2_10.method7327(false);
		this.aClass4_Sub2_10.method7268(this.aClass310_15);
		this.aClass4_Sub2_10.method7251(this.anInterface16_7, 0);
		this.aClass4_Sub2_10.method7291(local20, local22 + 1 - local20, Static416.aClass263_5, local16, local18 / 3, 0);
		this.aClass4_Sub2_10.method7327(true);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!cba;[I)V")
	@Override
	public void method8246(@OriginalArg(0) Class1_Sub5 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass295_31.method7533(new Class1_Sub42(this.aClass4_Sub2_10, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!ml", name = "ya", descriptor = "(Lclient!k;IIIIZ)V")
	@Override
	public void ya(@OriginalArg(0) Class1_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass260_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass4_Sub2_10.anInt8302 >> 8) >> this.aClass4_Sub2_10.anInt8290;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass4_Sub2_10.anInt8314 >> 8) >> this.aClass4_Sub2_10.anInt8290;
			this.aClass260_2.method6708(local39, arg0, local24);
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)V")
	@Override
	public void method8247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIILclient!be;)V")
	private void method5327(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub2_Sub2_Sub1 arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray14[arg0][arg1];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray12[arg0][arg1];
		@Pc(22) int local22 = local12.length;
		if (local22 > Static34.anIntArray70.length) {
			Static34.anIntArray70 = new int[local22];
			Static316.anIntArray473 = new int[local22];
		}
		for (@Pc(38) int local38 = 0; local38 < local22; local38++) {
			Static34.anIntArray70[local38] = local12[local38] >> this.aClass4_Sub2_10.anInt8290;
			Static316.anIntArray473[local38] = local19[local38] >> this.aClass4_Sub2_10.anInt8290;
		}
		@Pc(75) int local75 = 0;
		while (local22 > local75) {
			@Pc(81) int local81 = Static34.anIntArray70[local75];
			@Pc(86) int local86 = Static316.anIntArray473[local75++];
			@Pc(90) int local90 = Static34.anIntArray70[local75];
			@Pc(95) int local95 = Static316.anIntArray473[local75++];
			@Pc(99) int local99 = Static34.anIntArray70[local75];
			@Pc(104) int local104 = Static316.anIntArray473[local75++];
			if (-((local95 - local86) * (-local90 + local99)) + (local95 - local104) * (local81 - local90) > 0) {
				arg2.method1059(local86, local90, local104, local99, local95, local81);
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "aa", descriptor = "(II)I")
	@Override
	public int aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 >> super.anInt9573;
		@Pc(13) int local13 = arg1 >> super.anInt9573;
		if (local8 < 0 || local13 < 0 || super.anInt9577 - 1 < local8 || local13 > super.anInt9575 - 1) {
			return 0;
		}
		@Pc(48) int local48 = super.anInt9576 - 1 & arg0;
		@Pc(55) int local55 = arg1 & super.anInt9576 - 1;
		@Pc(82) int local82 = this.anIntArrayArray65[local8][local13] * (super.anInt9576 - local48) + local48 * this.anIntArrayArray65[local8 + 1][local13] >> super.anInt9573;
		@Pc(113) int local113 = (super.anInt9576 - local48) * this.anIntArrayArray65[local8][local13 + 1] + this.anIntArrayArray65[local8 + 1][local13 + 1] * local48 >> super.anInt9573;
		return local82 * (super.anInt9576 - local55) + local113 * local55 >> super.anInt9573;
	}

	@OriginalMember(owner = "client!ml", name = "F", descriptor = "(Lclient!k;IIIIZ)V")
	@Override
	public void F(@OriginalArg(0) Class1_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass260_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass4_Sub2_10.anInt8302 >> 8) >> this.aClass4_Sub2_10.anInt8290;
			@Pc(38) int local38 = arg3 - (this.aClass4_Sub2_10.anInt8314 * arg2 >> 8) >> this.aClass4_Sub2_10.anInt8290;
			this.aClass260_2.method6707(local38, arg0, local24);
		}
	}

	@OriginalMember(owner = "client!ml", name = "IA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg3 != null && this.anIntArrayArrayArray13 == null) {
			this.anIntArrayArrayArray13 = new int[super.anInt9577][super.anInt9575][];
		}
		if (arg5 != null && this.anIntArrayArrayArray17 == null) {
			this.anIntArrayArrayArray17 = new int[super.anInt9577][super.anInt9575][];
		}
		this.anIntArrayArrayArray14[arg0][arg1] = arg2;
		this.anIntArrayArrayArray12[arg0][arg1] = arg4;
		this.anIntArrayArrayArray15[arg0][arg1] = arg6;
		this.anIntArrayArrayArray16[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray17 != null) {
			this.anIntArrayArrayArray17[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray13 != null) {
			this.anIntArrayArrayArray13[arg0][arg1] = arg3;
		}
		@Pc(88) Class1_Sub48[] local88 = this.aClass1_Sub48ArrayArrayArray1[arg0][arg1] = new Class1_Sub48[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) arg8[local90] | (long) (arg9[local90] << 14) | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28;
			@Pc(125) Class1 local125;
			for (local125 = this.aClass230_34.method6144(local119); local125 != null; local125 = this.aClass230_34.method6145()) {
				@Pc(130) Class1_Sub48 local130 = (Class1_Sub48) local125;
				if (local130.anInt8617 == arg8[local90] && (float) arg9[local90] == local130.aFloat184 && arg10 == local130.anInt8607 && local130.anInt8610 == arg11 && arg12 == local130.anInt8614) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class1_Sub48(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass230_34.method6139(local119, local88[local90]);
			} else {
				local88[local90] = (Class1_Sub48) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray17[arg0][arg1] = (byte) (this.aByteArrayArray17[arg0][arg1] | 0x1);
		}
		if (this.anInt5883 < arg6.length) {
			this.anInt5883 = arg6.length;
		}
		this.anInt5884 += arg6.length;
	}

	@OriginalMember(owner = "client!ml", name = "Q", descriptor = "(III)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray18[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray18[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method8248(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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
		this.IA(arg0, arg1, local13, local47, local18, local56, local23, local28, local33, local38, arg13, arg14, arg15, false);
	}

	@OriginalMember(owner = "client!ml", name = "X", descriptor = "(IILclient!k;)Lclient!k;")
	@Override
	public Class1_Sub2_Sub2 X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub2_Sub2 arg2) {
		if ((this.aByteArrayArray17[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(21) int local21 = super.anInt9576 >> this.aClass4_Sub2_10.anInt8290;
		@Pc(24) Class1_Sub2_Sub2_Sub1 local24 = (Class1_Sub2_Sub2_Sub1) arg2;
		@Pc(34) Class1_Sub2_Sub2_Sub1 local34;
		if (local24 != null && local24.method1056(local21, local21)) {
			local34 = local24;
			local24.method1060();
		} else {
			local34 = new Class1_Sub2_Sub2_Sub1(this.aClass4_Sub2_10, local21, local21);
		}
		local34.method1058(0, local21, 0, local21);
		this.method5327(arg0, arg1, local34);
		return local34;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZII[[ZIII)V")
	private void method5330(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(6) int arg4) {
		if (this.aClass1_Sub48Array1 == null) {
			return;
		}
		@Pc(10) int local10 = arg4 + arg4 + 1;
		@Pc(14) int local14 = local10 * local10;
		if (Static86.anIntArray131.length < local14) {
			Static86.anIntArray131 = new int[local14];
		}
		@Pc(29) int local29 = arg2 - arg4;
		@Pc(31) int local31 = local29;
		if (local29 < 0) {
			local29 = 0;
		}
		@Pc(43) int local43 = arg1 - arg4;
		@Pc(45) int local45 = local43;
		if (local43 < 0) {
			local43 = 0;
		}
		@Pc(57) int local57 = arg2 + arg4;
		if (super.anInt9577 - 1 < local57) {
			local57 = super.anInt9577 - 1;
		}
		@Pc(76) int local76 = arg4 + arg1;
		if (local76 > super.anInt9575 - 1) {
			local76 = super.anInt9575 - 1;
		}
		Static172.anInt3436 = 0;
		for (@Pc(91) int local91 = local29; local91 <= local57; local91++) {
			@Pc(100) boolean[] local100 = arg3[local91 - local31];
			for (@Pc(102) int local102 = local43; local102 <= local76; local102++) {
				if (local100[local102 - local45]) {
					Static86.anIntArray131[Static172.anInt3436++] = local102 * super.anInt9577 + local91;
				}
			}
		}
		this.aClass4_Sub2_10.method7240();
		this.aClass4_Sub2_10.method7274();
		this.aClass4_Sub2_10.method7299((this.anInt5866 & 0x7) != 0);
		this.aClass4_Sub2_10.method7281(-1, false, false);
		this.aClass4_Sub2_10.method7251(this.anInterface16_7, 0);
		for (@Pc(192) int local192 = 0; local192 < this.aClass1_Sub48Array1.length; local192++) {
			this.aClass1_Sub48Array1[local192].method7531(Static172.anInt3436, Static86.anIntArray131);
		}
		@Pc(217) Class128_Sub3 local217 = this.aClass4_Sub2_10.method7338();
		local217.oa(0, -1, 0);
		this.aClass4_Sub2_10.method7306();
		if (!this.aClass295_31.method7536()) {
			@Pc(235) int local235 = this.aClass4_Sub2_10.anInt8311;
			@Pc(239) int local239 = this.aClass4_Sub2_10.anInt8289;
			this.aClass4_Sub2_10.E(0, local239, this.aClass4_Sub2_10.anInt8327);
			this.aClass4_Sub2_10.method7299(false);
			this.aClass4_Sub2_10.method7348(false);
			this.aClass4_Sub2_10.method7228(128);
			this.aClass4_Sub2_10.method7281(-2, false, false);
			this.aClass4_Sub2_10.method7316(this.aClass4_Sub2_10.anInterface8_3);
			this.aClass4_Sub2_10.method7270(Static428.aClass246_3, Static459.aClass246_5);
			this.aClass4_Sub2_10.method7277(0, Static319.aClass27_4);
			this.aClass4_Sub2_10.method7330(Static503.aClass27_3, 0);
			for (@Pc(301) Class1 local301 = this.aClass295_31.method7543(); local301 != null; local301 = this.aClass295_31.method7540()) {
				@Pc(306) Class1_Sub42 local306 = (Class1_Sub42) local301;
				local306.method5812(arg4, arg1, arg2, arg3);
			}
			this.aClass4_Sub2_10.method7277(0, Static360.aClass27_5);
			this.aClass4_Sub2_10.method7330(Static360.aClass27_5, 0);
			this.aClass4_Sub2_10.method7316(null);
			this.aClass4_Sub2_10.E(local235, local239, this.aClass4_Sub2_10.anInt8327);
		}
		if (this.aClass260_2 != null) {
			this.aClass4_Sub2_10.method7251(this.anInterface16_7, 0);
			this.aClass4_Sub2_10.method7268(this.aClass310_15);
			this.aClass260_2.method6710(arg0, arg2, arg1, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method8249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method5330(arg4, arg1, arg0, arg3, arg2);
	}
}
