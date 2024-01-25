import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!os")
public final class Class4_Sub2 extends Class4 {

	@OriginalMember(owner = "client!os", name = "w", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!os", name = "y", descriptor = "I")
	private int anInt7431;

	@OriginalMember(owner = "client!os", name = "M", descriptor = "I")
	private int anInt7441;

	@OriginalMember(owner = "client!os", name = "Z", descriptor = "Lclient!cu;")
	private Interface2 anInterface2_9;

	@OriginalMember(owner = "client!os", name = "ab", descriptor = "I")
	private int anInt7448;

	@OriginalMember(owner = "client!os", name = "bb", descriptor = "[Lclient!mb;")
	private Class3_Sub36[] aClass3_Sub36Array1;

	@OriginalMember(owner = "client!os", name = "cb", descriptor = "Lclient!cu;")
	private Interface2 anInterface2_10;

	@OriginalMember(owner = "client!os", name = "eb", descriptor = "I")
	private int anInt7449;

	@OriginalMember(owner = "client!os", name = "jb", descriptor = "Lclient!hj;")
	public Class142 aClass142_19;

	@OriginalMember(owner = "client!os", name = "z", descriptor = "F")
	private float aFloat155 = -3.4028235E38F;

	@OriginalMember(owner = "client!os", name = "p", descriptor = "F")
	private float aFloat154 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!os", name = "X", descriptor = "Lclient!ki;")
	private final Class183 aClass183_47 = new Class183();

	@OriginalMember(owner = "client!os", name = "A", descriptor = "I")
	private final int anInt7432 = this.anInt10463 - 2;

	@OriginalMember(owner = "client!os", name = "l", descriptor = "[[I")
	private final int[][] anIntArrayArray60;

	@OriginalMember(owner = "client!os", name = "I", descriptor = "Lclient!fc;")
	public final Class15_Sub2 aClass15_Sub2_14;

	@OriginalMember(owner = "client!os", name = "hb", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!os", name = "R", descriptor = "[[[Lclient!mb;")
	private Class3_Sub36[][][] aClass3_Sub36ArrayArrayArray1;

	@OriginalMember(owner = "client!os", name = "V", descriptor = "[[B")
	private final byte[][] aByteArrayArray23;

	@OriginalMember(owner = "client!os", name = "S", descriptor = "[[S")
	public final short[][] aShortArrayArray10;

	@OriginalMember(owner = "client!os", name = "s", descriptor = "I")
	public final int anInt7428;

	@OriginalMember(owner = "client!os", name = "j", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!os", name = "T", descriptor = "I")
	private final int anInt7444;

	@OriginalMember(owner = "client!os", name = "v", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!os", name = "r", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!os", name = "k", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!os", name = "ib", descriptor = "[[F")
	private float[][] aFloatArrayArray9;

	@OriginalMember(owner = "client!os", name = "fb", descriptor = "[[B")
	private byte[][] aByteArrayArray24;

	@OriginalMember(owner = "client!os", name = "gb", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!os", name = "L", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!os", name = "db", descriptor = "Lclient!bc;")
	private Class25 aClass25_31;

	@OriginalMember(owner = "client!os", name = "o", descriptor = "Lclient!rb;")
	private Class277 aClass277_2;

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "(Lclient!fc;IIII[[I[[II)V")
	public Class4_Sub2(@OriginalArg(0) Class15_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.anIntArrayArray60 = arg5;
		this.aClass15_Sub2_14 = arg0;
		this.aFloatArrayArray8 = new float[super.anInt10461 + 1][super.anInt10459 + 1];
		this.aClass3_Sub36ArrayArrayArray1 = new Class3_Sub36[arg3][arg4][];
		this.aByteArrayArray23 = new byte[arg3][arg4];
		this.aShortArrayArray10 = new short[arg4 * arg3][];
		this.anInt7428 = arg2;
		this.anIntArrayArrayArray10 = new int[arg3][arg4][];
		this.anInt7444 = 0x1 << this.anInt7432;
		this.anIntArrayArrayArray13 = new int[arg3][arg4][];
		this.anIntArrayArrayArray12 = new int[arg3][arg4][];
		this.anIntArrayArrayArray11 = new int[arg3][arg4][];
		this.aFloatArrayArray9 = new float[super.anInt10461 + 1][super.anInt10459 + 1];
		this.aByteArrayArray24 = new byte[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray7 = new float[super.anInt10461 + 1][super.anInt10459 + 1];
		this.anIntArrayArrayArray15 = new int[arg3][arg4][];
		for (@Pc(123) int local123 = 0; local123 <= super.anInt10459; local123++) {
			for (@Pc(127) int local127 = 0; local127 <= super.anInt10461; local127++) {
				@Pc(136) int local136 = this.anIntArrayArray60[local127][local123];
				if (this.aFloat155 < (float) local136) {
					this.aFloat155 = local136;
				}
				if ((float) local136 < this.aFloat154) {
					this.aFloat154 = local136;
				}
				if (local127 > 0 && local123 > 0 && super.anInt10461 > local127 && super.anInt10459 > local123) {
					@Pc(189) int local189 = arg6[local127 + 1][local123] - arg6[local127 - 1][local123];
					@Pc(206) int local206 = arg6[local127][local123 + 1] - arg6[local127][local123 - 1];
					@Pc(226) float local226 = (float) (1.0D / Math.sqrt((double) (local189 * local189 + arg7 * 4 * arg7 + local206 * local206)));
					this.aFloatArrayArray7[local127][local123] = local226 * (float) local189;
					this.aFloatArrayArray9[local127][local123] = local226 * (float) (-arg7 * 2);
					this.aFloatArrayArray8[local127][local123] = local226 * (float) local206;
				}
			}
		}
		this.aFloat155++;
		this.aFloat154--;
		this.aClass25_31 = new Class25(128);
		if ((this.anInt7428 & 0x10) != 0) {
			this.aClass277_2 = new Class277(this.aClass15_Sub2_14, this);
		}
	}

	@OriginalMember(owner = "client!os", name = "c", descriptor = "(IILclient!w;)Lclient!w;")
	@Override
	public Class3_Sub4_Sub2 c(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub4_Sub2 arg2) {
		if ((this.aByteArrayArray23[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(21) int local21 = super.anInt10458 >> this.aClass15_Sub2_14.anInt6526;
		@Pc(24) Class3_Sub4_Sub2_Sub2 local24 = (Class3_Sub4_Sub2_Sub2) arg2;
		@Pc(34) Class3_Sub4_Sub2_Sub2 local34;
		if (local24 != null && local24.method2948(local21, local21)) {
			local34 = local24;
			local24.method2947();
		} else {
			local34 = new Class3_Sub4_Sub2_Sub2(this.aClass15_Sub2_14, local21, local21);
		}
		local34.method2951(0, local21, local21, 0);
		this.method6198(arg1, arg0, local34);
		return local34;
	}

	@OriginalMember(owner = "client!os", name = "EA", descriptor = "(III)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray24[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray24[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!os", name = "ba", descriptor = "()V")
	@Override
	public void ba() {
		if (this.anInt7448 > 0) {
			@Pc(21) byte[][] local21 = new byte[super.anInt10461 + 1][super.anInt10459 + 1];
			for (@Pc(23) int local23 = 1; super.anInt10461 > local23; local23++) {
				for (@Pc(27) int local27 = 1; local27 < super.anInt10459; local27++) {
					local21[local23][local27] = (byte) ((this.aByteArrayArray24[local23][local27] >> 1) + (this.aByteArrayArray24[local23][local27 + 1] >> 3) + (this.aByteArrayArray24[local23 + -1][local27] >> 2) + (this.aByteArrayArray24[local23 - -1][local27] >> 3) + (this.aByteArrayArray24[local23][local27 + -1] >> 2));
				}
			}
			@Pc(111) Class3_Sub36[] local111 = new Class3_Sub36[this.aClass25_31.method950()];
			this.aClass25_31.method955(local111);
			for (@Pc(119) int local119 = 0; local119 < local111.length; local119++) {
				local111[local119].method5272(this.anInt7448);
			}
			@Pc(139) int local139 = 20;
			if (this.anIntArrayArrayArray14 != null) {
				local139 += 4;
			}
			if ((this.anInt7428 & 0x7) != 0) {
				local139 += 12;
			}
			@Pc(159) NativeHeapBuffer local159 = this.aClass15_Sub2_14.aNativeHeap5.a(this.anInt7448 * 4, false);
			@Pc(169) NativeHeapBuffer local169 = this.aClass15_Sub2_14.aNativeHeap5.a(local139 * this.anInt7448, false);
			@Pc(174) Stream local174 = new Stream(local169);
			@Pc(179) Stream local179 = new Stream(local159);
			@Pc(183) Class3_Sub36[] local183 = new Class3_Sub36[this.anInt7448];
			@Pc(190) int local190 = Static332.method5752(this.anInt7448 / 4);
			if (local190 < 1) {
				local190 = 1;
			}
			@Pc(200) Class25 local200 = new Class25(local190);
			@Pc(204) Class3_Sub36[] local204 = new Class3_Sub36[this.anInt7449];
			@Pc(210) int local210;
			for (@Pc(206) int local206 = 0; local206 < super.anInt10461; local206++) {
				for (local210 = 0; local210 < super.anInt10459; local210++) {
					if (this.anIntArrayArrayArray13[local206][local210] != null) {
						@Pc(226) Class3_Sub36[] local226 = this.aClass3_Sub36ArrayArrayArray1[local206][local210];
						@Pc(233) int[] local233 = this.anIntArrayArrayArray11[local206][local210];
						@Pc(240) int[] local240 = this.anIntArrayArrayArray10[local206][local210];
						@Pc(247) int[] local247 = this.anIntArrayArrayArray12[local206][local210];
						@Pc(254) int[] local254 = this.anIntArrayArrayArray13[local206][local210];
						@Pc(266) int[] local266 = this.anIntArrayArrayArray15 == null ? null : this.anIntArrayArrayArray15[local206][local210];
						@Pc(278) int[] local278 = this.anIntArrayArrayArray14 == null ? null : this.anIntArrayArrayArray14[local206][local210];
						if (local247 == null) {
							local247 = local254;
						}
						@Pc(289) float local289 = this.aFloatArrayArray7[local206][local210];
						@Pc(296) float local296 = this.aFloatArrayArray9[local206][local210];
						@Pc(303) float local303 = this.aFloatArrayArray8[local206][local210];
						@Pc(312) float local312 = this.aFloatArrayArray7[local206][local210 + 1];
						@Pc(321) float local321 = this.aFloatArrayArray9[local206][local210 + 1];
						@Pc(330) float local330 = this.aFloatArrayArray8[local206][local210 + 1];
						@Pc(341) float local341 = this.aFloatArrayArray7[local206 + 1][local210 + 1];
						@Pc(352) float local352 = this.aFloatArrayArray9[local206 + 1][local210 + 1];
						@Pc(363) float local363 = this.aFloatArrayArray8[local206 + 1][local210 + 1];
						@Pc(372) float local372 = this.aFloatArrayArray7[local206 + 1][local210];
						@Pc(381) float local381 = this.aFloatArrayArray9[local206 + 1][local210];
						@Pc(390) float local390 = this.aFloatArrayArray8[local206 + 1][local210];
						@Pc(398) int local398 = local21[local206][local210] & 0xFF;
						@Pc(408) int local408 = local21[local206][local210 + 1] & 0xFF;
						@Pc(420) int local420 = local21[local206 + 1][local210 + 1] & 0xFF;
						@Pc(430) int local430 = local21[local206 + 1][local210] & 0xFF;
						@Pc(432) int local432 = 0;
						@Pc(442) int local442;
						label355: for (@Pc(434) int local434 = 0; local434 < local254.length; local434++) {
							@Pc(440) Class3_Sub36 local440 = local226[local434];
							for (local442 = 0; local442 < local432; local442++) {
								if (local440 == local204[local442]) {
									continue label355;
								}
							}
							local204[local432++] = local440;
						}
						@Pc(479) short[] local479 = this.aShortArrayArray10[local210 * super.anInt10461 + local206] = new short[local254.length];
						for (local442 = 0; local442 < local254.length; local442++) {
							@Pc(493) int local493 = (local206 << super.anInt10463) + local233[local442];
							@Pc(503) int local503 = (local210 << super.anInt10463) + local240[local442];
							@Pc(508) int local508 = local493 >> this.anInt7432;
							@Pc(513) int local513 = local503 >> this.anInt7432;
							@Pc(517) int local517 = local254[local442];
							@Pc(521) int local521 = local247[local442];
							@Pc(529) int local529 = local266 == null ? 0 : local266[local442];
							@Pc(547) long local547 = (long) local513 | (long) (local508 << 16) | (long) local521 << 48 | (long) local517 << 32;
							@Pc(551) int local551 = local233[local442];
							@Pc(555) int local555 = local240[local442];
							@Pc(557) byte local557 = 74;
							@Pc(559) int local559 = 0;
							@Pc(561) float local561 = 1.0F;
							@Pc(593) float local593;
							@Pc(595) float local595;
							@Pc(597) float local597;
							@Pc(640) float local640;
							@Pc(601) int local601;
							if (local551 == 0 && local555 == 0) {
								local593 = local289;
								local595 = local296;
								local601 = local557 - local398;
								local597 = local303;
							} else if (local551 == 0 && super.anInt10458 == local555) {
								local593 = local312;
								local595 = local321;
								local597 = local330;
								local601 = local557 - local408;
							} else if (local551 == super.anInt10458 && local555 == super.anInt10458) {
								local593 = local341;
								local595 = local352;
								local597 = local363;
								local601 = local557 - local420;
							} else if (local551 == super.anInt10458 && local555 == 0) {
								local597 = local390;
								local601 = local557 - local430;
								local593 = local372;
								local595 = local381;
							} else {
								@Pc(616) float local616 = (float) local551 / (float) super.anInt10458;
								@Pc(623) float local623 = (float) local555 / (float) super.anInt10458;
								@Pc(631) float local631 = (local372 - local289) * local616 + local289;
								local640 = local296 + (local381 - local296) * local616;
								@Pc(648) float local648 = local303 + (local390 - local303) * local616;
								@Pc(656) float local656 = (local341 - local312) * local616 + local312;
								@Pc(664) float local664 = (local352 - local321) * local616 + local321;
								local595 = local640 + local623 * (local664 - local640);
								@Pc(681) float local681 = local330 + (local363 - local330) * local616;
								local593 = local631 + (local656 - local631) * local623;
								local597 = local623 * (local681 - local648) + local648;
								@Pc(710) int local710 = local398 + ((local430 - local398) * local551 >> super.anInt10463);
								@Pc(721) int local721 = ((local420 - local408) * local551 >> super.anInt10463) + local408;
								local601 = local557 - ((local721 - local710) * local555 >> super.anInt10463) - local710;
							}
							if (local517 != -1) {
								@Pc(782) int local782 = local601 * (local517 & 0x7F) >> 7;
								if (local782 < 2) {
									local782 = 2;
								} else if (local782 > 126) {
									local782 = 126;
								}
								local559 = Static331.anIntArray442[local517 & 0xFF80 | local782];
								if ((this.anInt7428 & 0x7) == 0) {
									local561 = local593 * this.aClass15_Sub2_14.aFloatArray56[0] + this.aClass15_Sub2_14.aFloatArray56[1] * local595 + this.aClass15_Sub2_14.aFloatArray56[2] * local597;
									local561 = this.aClass15_Sub2_14.aFloat126 + (local561 > 0.0F ? this.aClass15_Sub2_14.aFloat139 : this.aClass15_Sub2_14.aFloat140) * local561;
								}
							}
							@Pc(854) Class3 local854 = null;
							if ((this.anInt7444 - 1 & local493) == 0 && (local503 & this.anInt7444 - 1) == 0) {
								local854 = local200.method946(local547);
							}
							@Pc(1187) int local1187;
							@Pc(911) int local911;
							if (local854 == null) {
								if (local521 == local517) {
									local911 = local559;
								} else {
									@Pc(889) int local889 = local601 * (local521 & 0x7F) >> 7;
									if (local889 < 2) {
										local889 = 2;
									} else if (local889 > 126) {
										local889 = 126;
									}
									local911 = Static331.anIntArray442[local889 | local521 & 0xFF80];
									if ((this.anInt7428 & 0x7) == 0) {
										local640 = this.aClass15_Sub2_14.aFloatArray56[2] * local597 + local593 * this.aClass15_Sub2_14.aFloatArray56[0] + local595 * this.aClass15_Sub2_14.aFloatArray56[1];
										local640 = this.aClass15_Sub2_14.aFloat126 + (local561 > 0.0F ? this.aClass15_Sub2_14.aFloat139 : this.aClass15_Sub2_14.aFloat140) * local561;
										@Pc(964) int local964 = local911 >> 16 & 0xFF;
										@Pc(970) int local970 = local911 >> 8 & 0xFF;
										@Pc(974) int local974 = local911 & 0xFF;
										local964 = (int) ((float) local964 * local640);
										if (local964 < 0) {
											local964 = 0;
										} else if (local964 > 255) {
											local964 = 255;
										}
										local970 = (int) ((float) local970 * local640);
										local974 = (int) ((float) local974 * local640);
										if (local970 < 0) {
											local970 = 0;
										} else if (local970 > 255) {
											local970 = 255;
										}
										if (local974 < 0) {
											local974 = 0;
										} else if (local974 > 255) {
											local974 = 255;
										}
										local911 = local974 | local964 << 16 | local970 << 8;
									}
								}
								if (Stream.b()) {
									local174.b((float) local493);
									local174.b((float) (local529 + this.sa(local493, local503)));
									local174.b((float) local503);
									local174.b((float) local493);
									local174.b((float) local503);
									if (this.anIntArrayArrayArray14 != null) {
										local174.b((float) (local278 == null ? 0 : local278[local442] - 1));
									}
									if ((this.anInt7428 & 0x7) != 0) {
										local174.b(local593);
										local174.b(local595);
										local174.b(local597);
									}
								} else {
									local174.a((float) local493);
									local174.a((float) (this.sa(local493, local503) + local529));
									local174.a((float) local503);
									local174.a((float) local493);
									local174.a((float) local503);
									if (this.anIntArrayArrayArray14 != null) {
										local174.a((float) (local278 == null ? 0 : local278[local442] - 1));
									}
									if ((this.anInt7428 & 0x7) != 0) {
										local174.a(local593);
										local174.a(local595);
										local174.a(local597);
									}
								}
								if (this.aClass15_Sub2_14.anInt6540 == 0) {
									local179.a(local911 | 0xFF000000);
								} else {
									local179.e(local911 | 0xFF000000);
								}
								local1187 = this.anInt7431++;
								local479[local442] = (short) local1187;
								if (local517 != -1) {
									local183[local1187] = local226[local442];
								}
								local200.method945(new Class3_Sub39(local479[local442]), local547);
							} else {
								local479[local442] = ((Class3_Sub39) local854).aShort83;
								local1187 = local479[local442] & 0xFFFF;
								if (local517 != -1 && local226[local442].aLong262 < local183[local1187].aLong262) {
									local183[local1187] = local226[local442];
								}
							}
							for (local911 = 0; local911 < local432; local911++) {
								local204[local911].method5274(local561, local1187, local559, local601);
							}
							this.anInt7441++;
						}
					}
				}
			}
			for (local210 = 0; local210 < this.anInt7431; local210++) {
				@Pc(1299) Class3_Sub36 local1299 = local183[local210];
				if (local1299 != null) {
					local1299.method5268(local210);
				}
			}
			@Pc(1316) int local1316;
			@Pc(1334) int local1334;
			for (@Pc(1312) int local1312 = 0; local1312 < super.anInt10461; local1312++) {
				for (local1316 = 0; local1316 < super.anInt10459; local1316++) {
					@Pc(1328) short[] local1328 = this.aShortArrayArray10[local1312 + local1316 * super.anInt10461];
					if (local1328 != null) {
						@Pc(1332) int local1332 = 0;
						local1334 = 0;
						while (local1328.length > local1334) {
							@Pc(1343) int local1343 = local1328[local1334++] & 0xFFFF;
							@Pc(1350) int local1350 = local1328[local1334++] & 0xFFFF;
							@Pc(1357) int local1357 = local1328[local1334++] & 0xFFFF;
							@Pc(1361) Class3_Sub36 local1361 = local183[local1343];
							@Pc(1365) Class3_Sub36 local1365 = local183[local1350];
							@Pc(1369) Class3_Sub36 local1369 = local183[local1357];
							@Pc(1371) Class3_Sub36 local1371 = null;
							if (local1361 != null) {
								local1371 = local1361;
								local1361.method5270(local1316, local1312, local1332);
							}
							if (local1365 != null) {
								local1365.method5270(local1316, local1312, local1332);
								if (local1371 == null || local1365.aLong262 < local1371.aLong262) {
									local1371 = local1365;
								}
							}
							if (local1369 != null) {
								local1369.method5270(local1316, local1312, local1332);
								if (local1371 == null || local1369.aLong262 < local1371.aLong262) {
									local1371 = local1369;
								}
							}
							if (local1371 != null) {
								if (local1361 != null) {
									local1371.method5268(local1343);
								}
								if (local1365 != null) {
									local1371.method5268(local1350);
								}
								if (local1369 != null) {
									local1371.method5268(local1357);
								}
								local1371.method5270(local1316, local1312, local1332);
							}
							local1332++;
						}
					}
				}
			}
			local174.a();
			local179.a();
			this.anInterface2_10 = this.aClass15_Sub2_14.method5383(false);
			this.anInterface2_10.method5803(this.anInt7431 * 4, local159, 4);
			this.anInterface2_9 = this.aClass15_Sub2_14.method5383(false);
			this.anInterface2_9.method5803(local139 * this.anInt7431, local169, local139);
			if ((this.anInt7428 & 0x7) == 0) {
				if (this.anIntArrayArrayArray14 == null) {
					this.aClass142_19 = this.aClass15_Sub2_14.method5421(new Class78[] { new Class78(new Class164[] { Static231.aClass164_1, Static231.aClass164_5 }), new Class78(Static231.aClass164_3) });
				} else {
					this.aClass142_19 = this.aClass15_Sub2_14.method5421(new Class78[] { new Class78(new Class164[] { Static231.aClass164_1, Static231.aClass164_5, Static231.aClass164_4 }), new Class78(Static231.aClass164_3) });
				}
			} else if (this.anIntArrayArrayArray14 == null) {
				this.aClass142_19 = this.aClass15_Sub2_14.method5421(new Class78[] { new Class78(new Class164[] { Static231.aClass164_1, Static231.aClass164_5, Static231.aClass164_2 }), new Class78(Static231.aClass164_3) });
			} else {
				this.aClass142_19 = this.aClass15_Sub2_14.method5421(new Class78[] { new Class78(new Class164[] { Static231.aClass164_1, Static231.aClass164_5, Static231.aClass164_4, Static231.aClass164_2 }), new Class78(Static231.aClass164_3) });
			}
			local1316 = 0;
			for (@Pc(1671) int local1671 = 0; local1671 < local111.length; local1671++) {
				if (local111[local1671].anInt6321 > 0) {
					local111[local1316++] = local111[local1671];
				}
			}
			this.aClass3_Sub36Array1 = new Class3_Sub36[local1316];
			@Pc(1697) long[] local1697 = new long[local1316];
			for (local1334 = 0; local1334 < local1316; local1334++) {
				@Pc(1705) Class3_Sub36 local1705 = local111[local1334];
				local1697[local1334] = local1705.aLong262;
				this.aClass3_Sub36Array1[local1334] = local1705;
				local1705.method5273(this.anInt7431);
			}
			Static118.method7552(local1697, this.aClass3_Sub36Array1);
			if (this.aClass277_2 != null) {
				this.aClass277_2.method6916();
			}
		} else {
			this.aClass277_2 = null;
		}
		this.aFloatArrayArray7 = this.aFloatArrayArray9 = this.aFloatArrayArray8 = null;
		this.anIntArrayArrayArray15 = null;
		this.aByteArrayArray24 = null;
		this.anIntArrayArrayArray13 = null;
		this.anIntArrayArrayArray12 = null;
		this.aClass25_31 = null;
		this.aClass3_Sub36ArrayArrayArray1 = null;
		this.anIntArrayArrayArray11 = this.anIntArrayArrayArray10 = null;
		this.anIntArrayArrayArray14 = null;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method8444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!pn;[I)V")
	@Override
	public void method8448(@OriginalArg(0) Class3_Sub28 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass183_47.method4792(new Class3_Sub51(this.aClass15_Sub2_14, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method8446(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt7448 <= 0) {
			return;
		}
		@Pc(19) Interface20 local19 = this.aClass15_Sub2_14.method5474(this.anInt7441);
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = 32767;
		@Pc(25) int local25 = -32768;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			local21 = 0;
			@Pc(36) Buffer local36 = local19.method6243();
			if (local36 != null) {
				@Pc(44) Stream local44 = this.aClass15_Sub2_14.method5409(local36);
				@Pc(48) int local48;
				@Pc(57) int local57;
				@Pc(59) int local59;
				@Pc(78) short[] local78;
				@Pc(82) int local82;
				@Pc(90) int local90;
				if (Stream.b()) {
					for (local48 = arg1; local48 < arg3; local48++) {
						local57 = arg0 + super.anInt10461 * local48;
						for (local59 = arg0; local59 < arg2; local59++) {
							if (arg4[local59 - arg0][local48 - arg1]) {
								local78 = this.aShortArrayArray10[local57];
								if (local78 != null) {
									for (local82 = 0; local82 < local78.length; local82++) {
										local90 = local78[local82] & 0xFFFF;
										if (local90 < local23) {
											local23 = local90;
										}
										local44.f(local90);
										local21++;
										if (local90 > local25) {
											local25 = local90;
										}
									}
								}
							}
							local57++;
						}
					}
				} else {
					for (local48 = arg1; local48 < arg3; local48++) {
						local57 = super.anInt10461 * local48 + arg0;
						for (local59 = arg0; local59 < arg2; local59++) {
							if (arg4[local59 - arg0][local48 - arg1]) {
								local78 = this.aShortArrayArray10[local57];
								if (local78 != null) {
									for (local82 = 0; local82 < local78.length; local82++) {
										local90 = local78[local82] & 0xFFFF;
										local21++;
										if (local90 < local23) {
											local23 = local90;
										}
										if (local25 < local90) {
											local25 = local90;
										}
										local44.d(local90);
									}
								}
							}
							local57++;
						}
					}
				}
				local44.a();
				if (local19.method6241()) {
					break;
				}
			}
		}
		if (local21 <= 0) {
			return;
		}
		this.aClass15_Sub2_14.method5462();
		this.aClass15_Sub2_14.method5476(false);
		this.aClass15_Sub2_14.method5403(false);
		this.aClass15_Sub2_14.method5470(false);
		this.aClass15_Sub2_14.method5399(false);
		this.aClass15_Sub2_14.method5460(0);
		this.aClass15_Sub2_14.method5359(false, false, -2);
		this.aClass15_Sub2_14.method5414(null);
		@Pc(270) Class255_Sub3 local270 = this.aClass15_Sub2_14.method5431();
		@Pc(275) float[] local275 = this.aClass15_Sub2_14.method5370();
		local275[15] = 1.0F;
		local275[4] = 0.0F;
		local275[0] = (float) 1024 / ((float) super.anInt10458 * 128.0F * (float) this.aClass15_Sub2_14.anInt6395);
		local275[11] = 0.0F;
		local275[9] = 0.0F;
		local275[6] = 0.0F;
		local275[13] = 1.0F - ((float) (arg3 * 1024) / 128.0F + (float) 0) / (float) this.aClass15_Sub2_14.anInt6436;
		local275[10] = 1.0F / (this.aFloat155 - this.aFloat154);
		local275[3] = 0.0F;
		local275[14] = -this.aFloat154 / (this.aFloat155 - this.aFloat154);
		local275[8] = 0.0F;
		local275[1] = 0.0F;
		local275[2] = 0.0F;
		local275[7] = 0.0F;
		local275[12] = -1.0F - ((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass15_Sub2_14.anInt6395;
		local275[5] = (float) 1024 / ((float) super.anInt10458 * 128.0F * (float) this.aClass15_Sub2_14.anInt6436);
		local270.method8027(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
		this.aClass15_Sub2_14.method5434();
		this.aClass15_Sub2_14.method5445();
		if ((this.anInt7428 & 0x7) == 0) {
			this.aClass15_Sub2_14.method5403(false);
		} else {
			this.aClass15_Sub2_14.method5403(true);
			this.aClass15_Sub2_14.method5365();
		}
		this.aClass15_Sub2_14.method5393(false);
		this.aClass15_Sub2_14.method5376(0, this.anInterface2_9);
		this.aClass15_Sub2_14.method5376(1, this.anInterface2_10);
		this.aClass15_Sub2_14.method5391(this.aClass142_19);
		this.aClass15_Sub2_14.method5375(local23, Static18.aClass32_2, 0, local21 / 3, local25 + 1 - local23, local19);
		this.aClass15_Sub2_14.method5393(true);
	}

	@OriginalMember(owner = "client!os", name = "aa", descriptor = "(Lclient!w;IIIIZ)V")
	@Override
	public void aa(@OriginalArg(0) Class3_Sub4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass277_2 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (arg2 * this.aClass15_Sub2_14.anInt6525 >> 8) >> this.aClass15_Sub2_14.anInt6526;
			@Pc(38) int local38 = arg3 - (arg2 * this.aClass15_Sub2_14.anInt6527 >> 8) >> this.aClass15_Sub2_14.anInt6526;
			this.aClass277_2.method6918(arg0, local38, local23);
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IILclient!fw;I)V")
	private void method6198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub4_Sub2_Sub2 arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray11[arg1][arg0];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray10[arg1][arg0];
		@Pc(22) int local22 = local12.length;
		if (local22 > Static424.anIntArray505.length) {
			Static424.anIntArray505 = new int[local22];
			Static590.anIntArray675 = new int[local22];
		}
		for (@Pc(38) int local38 = 0; local38 < local22; local38++) {
			Static424.anIntArray505[local38] = local12[local38] >> this.aClass15_Sub2_14.anInt6526;
			Static590.anIntArray675[local38] = local19[local38] >> this.aClass15_Sub2_14.anInt6526;
		}
		@Pc(70) int local70 = 0;
		while (local22 > local70) {
			@Pc(76) int local76 = Static424.anIntArray505[local70];
			@Pc(81) int local81 = Static590.anIntArray675[local70++];
			@Pc(85) int local85 = Static424.anIntArray505[local70];
			@Pc(90) int local90 = Static590.anIntArray675[local70++];
			@Pc(94) int local94 = Static424.anIntArray505[local70];
			@Pc(99) int local99 = Static590.anIntArray675[local70++];
			if (-((local94 - local85) * (-local81 + local90)) + (local76 - local85) * (local90 - local99) > 0) {
				arg2.method2950(local81, local90, local94, local99, local76, local85);
			}
		}
	}

	@OriginalMember(owner = "client!os", name = "JA", descriptor = "(II)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray60[arg0][arg1];
	}

	@OriginalMember(owner = "client!os", name = "FA", descriptor = "(Lclient!w;IIIIZ)V")
	@Override
	public void FA(@OriginalArg(0) Class3_Sub4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass277_2 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (this.aClass15_Sub2_14.anInt6525 * arg2 >> 8) >> this.aClass15_Sub2_14.anInt6526;
			@Pc(38) int local38 = arg3 - (arg2 * this.aClass15_Sub2_14.anInt6527 >> 8) >> this.aClass15_Sub2_14.anInt6526;
			this.aClass277_2.method6920(local23, arg0, local38);
		}
	}

	@OriginalMember(owner = "client!os", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg3 != null && this.anIntArrayArrayArray15 == null) {
			this.anIntArrayArrayArray15 = new int[super.anInt10461][super.anInt10459][];
		}
		if (arg5 != null && this.anIntArrayArrayArray14 == null) {
			this.anIntArrayArrayArray14 = new int[super.anInt10461][super.anInt10459][];
		}
		this.anIntArrayArrayArray11[arg0][arg1] = arg2;
		this.anIntArrayArrayArray10[arg0][arg1] = arg4;
		this.anIntArrayArrayArray13[arg0][arg1] = arg6;
		this.anIntArrayArrayArray12[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray14 != null) {
			this.anIntArrayArrayArray14[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray15 != null) {
			this.anIntArrayArrayArray15[arg0][arg1] = arg3;
		}
		@Pc(88) Class3_Sub36[] local88 = this.aClass3_Sub36ArrayArrayArray1[arg0][arg1] = new Class3_Sub36[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42 | (long) (arg9[local90] << 14) | (long) arg8[local90];
			@Pc(125) Class3 local125;
			for (local125 = this.aClass25_31.method946(local119); local125 != null; local125 = this.aClass25_31.method953()) {
				@Pc(130) Class3_Sub36 local130 = (Class3_Sub36) local125;
				if (local130.anInt6329 == arg8[local90] && local130.aFloat125 == (float) arg9[local90] && arg10 == local130.anInt6328 && local130.anInt6322 == arg11 && local130.anInt6327 == arg12) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class3_Sub36(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass25_31.method945(local88[local90], local119);
			} else {
				local88[local90] = (Class3_Sub36) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray23[arg0][arg1] = (byte) (this.aByteArrayArray23[arg0][arg1] | 0x1);
		}
		if (this.anInt7449 < arg6.length) {
			this.anInt7449 = arg6.length;
		}
		this.anInt7448 += arg6.length;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(II)V")
	@Override
	public void method8442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Z[[ZIIBII)V")
	private void method6200(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (this.aClass3_Sub36Array1 == null) {
			return;
		}
		@Pc(10) int local10 = arg3 + arg3 + 1;
		@Pc(14) int local14 = local10 * local10;
		if (local14 > Static540.anIntArray650.length) {
			Static540.anIntArray650 = new int[local14];
		}
		@Pc(29) int local29 = arg4 - arg3;
		@Pc(31) int local31 = local29;
		if (local29 < 0) {
			local29 = 0;
		}
		@Pc(40) int local40 = arg2 - arg3;
		@Pc(42) int local42 = local40;
		if (local40 < 0) {
			local40 = 0;
		}
		@Pc(53) int local53 = arg4 + arg3;
		if (super.anInt10461 - 1 < local53) {
			local53 = super.anInt10461 - 1;
		}
		@Pc(72) int local72 = arg2 + arg3;
		if (local72 > super.anInt10459 - 1) {
			local72 = super.anInt10459 - 1;
		}
		Static432.anInt5804 = 0;
		for (@Pc(87) int local87 = local29; local87 <= local53; local87++) {
			@Pc(96) boolean[] local96 = arg1[local87 - local31];
			for (@Pc(98) int local98 = local40; local98 <= local72; local98++) {
				if (local96[local98 - local42]) {
					Static540.anIntArray650[Static432.anInt5804++] = local87 + local98 * super.anInt10461;
				}
			}
		}
		this.aClass15_Sub2_14.method5486();
		this.aClass15_Sub2_14.method5477();
		this.aClass15_Sub2_14.method5403((this.anInt7428 & 0x7) != 0);
		this.aClass15_Sub2_14.method5359(false, false, -1);
		this.aClass15_Sub2_14.method5376(0, this.anInterface2_9);
		for (@Pc(188) int local188 = 0; local188 < this.aClass3_Sub36Array1.length; local188++) {
			this.aClass3_Sub36Array1[local188].method5266(Static432.anInt5804, Static540.anIntArray650);
		}
		@Pc(215) Class255_Sub3 local215 = this.aClass15_Sub2_14.method5431();
		local215.GA(0, -1, 0);
		this.aClass15_Sub2_14.method5445();
		if (!this.aClass183_47.method4798()) {
			@Pc(233) int local233 = this.aClass15_Sub2_14.anInt6548;
			@Pc(237) int local237 = this.aClass15_Sub2_14.anInt6550;
			this.aClass15_Sub2_14.X(0, local237, this.aClass15_Sub2_14.anInt6534);
			this.aClass15_Sub2_14.method5403(false);
			this.aClass15_Sub2_14.method5399(false);
			this.aClass15_Sub2_14.method5460(128);
			this.aClass15_Sub2_14.method5359(false, false, -2);
			this.aClass15_Sub2_14.method5414(this.aClass15_Sub2_14.anInterface13_3);
			this.aClass15_Sub2_14.method5430(Static490.aClass120_5, Static65.aClass120_1);
			this.aClass15_Sub2_14.method5444(0, Static531.aClass85_5);
			this.aClass15_Sub2_14.method5488(Static454.aClass85_2, 0);
			for (@Pc(299) Class3 local299 = this.aClass183_47.method4795(); local299 != null; local299 = this.aClass183_47.method4793()) {
				@Pc(304) Class3_Sub51 local304 = (Class3_Sub51) local299;
				local304.method8205(arg3, arg4, arg2, arg1);
			}
			this.aClass15_Sub2_14.method5444(0, Static159.aClass85_1);
			this.aClass15_Sub2_14.method5488(Static159.aClass85_1, 0);
			this.aClass15_Sub2_14.method5414(null);
			this.aClass15_Sub2_14.X(local233, local237, this.aClass15_Sub2_14.anInt6534);
		}
		if (this.aClass277_2 != null) {
			this.aClass15_Sub2_14.method5376(0, this.anInterface2_9);
			this.aClass15_Sub2_14.method5376(1, this.anInterface2_10);
			this.aClass15_Sub2_14.method5391(this.aClass142_19);
			this.aClass277_2.method6922(arg4, arg3, arg1, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!os", name = "sa", descriptor = "(II)I")
	@Override
	public int sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 >> super.anInt10463;
		@Pc(13) int local13 = arg1 >> super.anInt10463;
		if (local8 < 0 || local13 < 0 || local8 > super.anInt10461 - 1 || local13 > super.anInt10459 - 1) {
			return 0;
		}
		@Pc(45) int local45 = arg0 & super.anInt10458 - 1;
		@Pc(52) int local52 = super.anInt10458 - 1 & arg1;
		@Pc(80) int local80 = this.anIntArrayArray60[local8][local13] * (super.anInt10458 - local45) + this.anIntArrayArray60[local8 + 1][local13] * local45 >> super.anInt10463;
		@Pc(110) int local110 = this.anIntArrayArray60[local8][local13 + 1] * (super.anInt10458 - local45) + local45 * this.anIntArrayArray60[local8 + 1][local13 + 1] >> super.anInt10463;
		return local110 * local52 + (super.anInt10458 - local52) * local80 >> super.anInt10463;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!w;IIIIZ)Z")
	@Override
	public boolean method8445(@OriginalArg(0) Class3_Sub4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass277_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (arg2 * this.aClass15_Sub2_14.anInt6525 >> 8) >> this.aClass15_Sub2_14.anInt6526;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass15_Sub2_14.anInt6527 >> 8) >> this.aClass15_Sub2_14.anInt6526;
			return this.aClass277_2.method6924(arg0, local25, local39);
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method8443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method6200(arg4, arg3, arg1, arg2, arg0);
	}
}
