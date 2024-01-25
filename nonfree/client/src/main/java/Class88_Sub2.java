import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class88_Sub2 extends Class88 {

	@OriginalMember(owner = "client!mg", name = "o", descriptor = "I")
	private int anInt6370;

	@OriginalMember(owner = "client!mg", name = "t", descriptor = "I")
	private int anInt6375;

	@OriginalMember(owner = "client!mg", name = "w", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!mg", name = "Z", descriptor = "I")
	private int anInt6390;

	@OriginalMember(owner = "client!mg", name = "ab", descriptor = "Lclient!bw;")
	public Class48 aClass48_16;

	@OriginalMember(owner = "client!mg", name = "bb", descriptor = "Lclient!fka;")
	private Interface6 anInterface6_12;

	@OriginalMember(owner = "client!mg", name = "eb", descriptor = "I")
	private int anInt6391;

	@OriginalMember(owner = "client!mg", name = "gb", descriptor = "[Lclient!eaa;")
	private Class5_Sub20[] aClass5_Sub20Array1;

	@OriginalMember(owner = "client!mg", name = "hb", descriptor = "Lclient!fka;")
	private Interface6 anInterface6_13;

	@OriginalMember(owner = "client!mg", name = "m", descriptor = "F")
	private float aFloat121 = -3.4028235E38F;

	@OriginalMember(owner = "client!mg", name = "O", descriptor = "F")
	private float aFloat122 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!mg", name = "Q", descriptor = "Lclient!ga;")
	private final Class124 aClass124_63 = new Class124();

	@OriginalMember(owner = "client!mg", name = "A", descriptor = "Lclient!wk;")
	public final Class143_Sub1 aClass143_Sub1_11;

	@OriginalMember(owner = "client!mg", name = "W", descriptor = "I")
	private final int anInt6389;

	@OriginalMember(owner = "client!mg", name = "p", descriptor = "I")
	public final int anInt6371;

	@OriginalMember(owner = "client!mg", name = "D", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!mg", name = "R", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!mg", name = "P", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!mg", name = "X", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!mg", name = "q", descriptor = "I")
	private final int anInt6372;

	@OriginalMember(owner = "client!mg", name = "cb", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!mg", name = "db", descriptor = "[[F")
	private float[][] aFloatArrayArray9;

	@OriginalMember(owner = "client!mg", name = "Y", descriptor = "[[B")
	private byte[][] aByteArrayArray14;

	@OriginalMember(owner = "client!mg", name = "L", descriptor = "[[S")
	public final short[][] aShortArrayArray14;

	@OriginalMember(owner = "client!mg", name = "H", descriptor = "[[B")
	private final byte[][] aByteArrayArray13;

	@OriginalMember(owner = "client!mg", name = "C", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!mg", name = "M", descriptor = "[[[Lclient!eaa;")
	private Class5_Sub20[][][] aClass5_Sub20ArrayArrayArray1;

	@OriginalMember(owner = "client!mg", name = "x", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!mg", name = "fb", descriptor = "Lclient!tga;")
	private Class335 aClass335_27;

	@OriginalMember(owner = "client!mg", name = "y", descriptor = "Lclient!ht;")
	private Class159 aClass159_2;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lclient!wk;IIII[[I[[II)V")
	public Class88_Sub2(@OriginalArg(0) Class143_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass143_Sub1_11 = arg0;
		this.anInt6389 = super.anInt10547 - 2;
		this.anInt6371 = arg2;
		this.anIntArrayArrayArray11 = new int[arg3][arg4][];
		this.anIntArrayArrayArray13 = new int[arg3][arg4][];
		this.anIntArrayArrayArray12 = new int[arg3][arg4][];
		this.aFloatArrayArray7 = new float[super.anInt10541 + 1][super.anInt10545 + 1];
		this.anInt6372 = 0x1 << this.anInt6389;
		this.aFloatArrayArray8 = new float[super.anInt10541 + 1][super.anInt10545 + 1];
		this.aFloatArrayArray9 = new float[super.anInt10541 + 1][super.anInt10545 + 1];
		this.aByteArrayArray14 = new byte[arg3 + 1][arg4 + 1];
		this.aShortArrayArray14 = new short[arg4 * arg3][];
		this.aByteArrayArray13 = new byte[arg3][arg4];
		this.anIntArrayArrayArray10 = new int[arg3][arg4][];
		this.aClass5_Sub20ArrayArrayArray1 = new Class5_Sub20[arg3][arg4][];
		this.anIntArrayArrayArray9 = new int[arg3][arg4][];
		for (@Pc(121) int local121 = 0; local121 <= super.anInt10545; local121++) {
			for (@Pc(125) int local125 = 0; local125 <= super.anInt10541; local125++) {
				@Pc(134) int local134 = super.anIntArrayArray92[local125][local121];
				if (this.aFloat122 > (float) local134) {
					this.aFloat122 = (float) local134;
				}
				if ((float) local134 > this.aFloat121) {
					this.aFloat121 = (float) local134;
				}
				if (local125 > 0 && local121 > 0 && super.anInt10541 > local125 && local121 < super.anInt10545) {
					@Pc(193) int local193 = arg6[local125 + 1][local121] - arg6[local125 - 1][local121];
					@Pc(210) int local210 = arg6[local125][local121 + 1] - arg6[local125][local121 - 1];
					@Pc(229) float local229 = (float) (1.0D / Math.sqrt((double) (local210 * local210 + arg7 * 4 * arg7 + local193 * local193)));
					this.aFloatArrayArray9[local125][local121] = (float) local193 * local229;
					this.aFloatArrayArray8[local125][local121] = (float) (-arg7 * 2) * local229;
					this.aFloatArrayArray7[local125][local121] = (float) local210 * local229;
				}
			}
		}
		this.aFloat122--;
		this.aFloat121++;
		this.aClass335_27 = new Class335(128);
		if ((this.anInt6371 & 0x10) != 0) {
			this.aClass159_2 = new Class159(this.aClass143_Sub1_11, this);
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)V")
	@Override
	public void method8750(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!mg", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.anInt6391 > 0) {
			@Pc(17) byte[][] local17 = new byte[super.anInt10541 + 1][super.anInt10545 + 1];
			for (@Pc(19) int local19 = 1; local19 < super.anInt10541; local19++) {
				for (@Pc(23) int local23 = 1; local23 < super.anInt10545; local23++) {
					local17[local19][local23] = (byte) ((this.aByteArrayArray14[local19][local23 + 1] >> 3) + (this.aByteArrayArray14[local19][local23 - 1] >> 2) + (this.aByteArrayArray14[local19 + 1][local23] >> 3) + (this.aByteArrayArray14[local19 + -1][local23] >> 2) + (this.aByteArrayArray14[local19][local23] >> 1));
				}
			}
			@Pc(103) Class5_Sub20[] local103 = new Class5_Sub20[this.aClass335_27.method7767()];
			this.aClass335_27.method7771(local103);
			for (@Pc(111) int local111 = 0; local111 < local103.length; local111++) {
				local103[local111].method1900(this.anInt6391);
			}
			@Pc(131) int local131 = 20;
			if (this.anIntArrayArrayArray8 != null) {
				local131 += 4;
			}
			if ((this.anInt6371 & 0x7) != 0) {
				local131 += 12;
			}
			@Pc(154) NativeHeapBuffer local154 = this.aClass143_Sub1_11.aNativeHeap6.a(this.anInt6391 * 4, false);
			@Pc(164) NativeHeapBuffer local164 = this.aClass143_Sub1_11.aNativeHeap6.a(local131 * this.anInt6391, false);
			@Pc(169) Stream local169 = new Stream(local164);
			@Pc(174) Stream local174 = new Stream(local154);
			@Pc(178) Class5_Sub20[] local178 = new Class5_Sub20[this.anInt6391];
			@Pc(185) int local185 = Static630.method8378(this.anInt6391 / 4);
			if (local185 < 1) {
				local185 = 1;
			}
			@Pc(195) Class335 local195 = new Class335(local185);
			@Pc(199) Class5_Sub20[] local199 = new Class5_Sub20[this.anInt6390];
			@Pc(205) int local205;
			for (@Pc(201) int local201 = 0; local201 < super.anInt10541; local201++) {
				for (local205 = 0; super.anInt10545 > local205; local205++) {
					if (this.anIntArrayArrayArray9[local201][local205] != null) {
						@Pc(221) Class5_Sub20[] local221 = this.aClass5_Sub20ArrayArrayArray1[local201][local205];
						@Pc(228) int[] local228 = this.anIntArrayArrayArray10[local201][local205];
						@Pc(235) int[] local235 = this.anIntArrayArrayArray11[local201][local205];
						@Pc(242) int[] local242 = this.anIntArrayArrayArray13[local201][local205];
						@Pc(249) int[] local249 = this.anIntArrayArrayArray9[local201][local205];
						@Pc(261) int[] local261 = this.anIntArrayArrayArray12 == null ? null : this.anIntArrayArrayArray12[local201][local205];
						@Pc(273) int[] local273 = this.anIntArrayArrayArray8 == null ? null : this.anIntArrayArrayArray8[local201][local205];
						if (local242 == null) {
							local242 = local249;
						}
						@Pc(284) float local284 = this.aFloatArrayArray9[local201][local205];
						@Pc(291) float local291 = this.aFloatArrayArray8[local201][local205];
						@Pc(298) float local298 = this.aFloatArrayArray7[local201][local205];
						@Pc(307) float local307 = this.aFloatArrayArray9[local201][local205 + 1];
						@Pc(316) float local316 = this.aFloatArrayArray8[local201][local205 + 1];
						@Pc(325) float local325 = this.aFloatArrayArray7[local201][local205 + 1];
						@Pc(336) float local336 = this.aFloatArrayArray9[local201 + 1][local205 + 1];
						@Pc(347) float local347 = this.aFloatArrayArray8[local201 + 1][local205 + 1];
						@Pc(358) float local358 = this.aFloatArrayArray7[local201 + 1][local205 + 1];
						@Pc(367) float local367 = this.aFloatArrayArray9[local201 + 1][local205];
						@Pc(376) float local376 = this.aFloatArrayArray8[local201 + 1][local205];
						@Pc(385) float local385 = this.aFloatArrayArray7[local201 + 1][local205];
						@Pc(393) int local393 = local17[local201][local205] & 0xFF;
						@Pc(403) int local403 = local17[local201][local205 + 1] & 0xFF;
						@Pc(415) int local415 = local17[local201 + 1][local205 + 1] & 0xFF;
						@Pc(425) int local425 = local17[local201 + 1][local205] & 0xFF;
						@Pc(427) int local427 = 0;
						@Pc(437) int local437;
						label357: for (@Pc(429) int local429 = 0; local429 < local249.length; local429++) {
							@Pc(435) Class5_Sub20 local435 = local221[local429];
							for (local437 = 0; local437 < local427; local437++) {
								if (local199[local437] == local435) {
									continue label357;
								}
							}
							local199[local427++] = local435;
						}
						@Pc(478) short[] local478 = this.aShortArrayArray14[local201 + local205 * super.anInt10541] = new short[local249.length];
						for (local437 = 0; local437 < local249.length; local437++) {
							@Pc(492) int local492 = (local201 << super.anInt10547) + local228[local437];
							@Pc(501) int local501 = (local205 << super.anInt10547) + local235[local437];
							@Pc(506) int local506 = local492 >> this.anInt6389;
							@Pc(511) int local511 = local501 >> this.anInt6389;
							@Pc(515) int local515 = local249[local437];
							@Pc(519) int local519 = local242[local437];
							@Pc(527) int local527 = local261 == null ? 0 : local261[local437];
							@Pc(545) long local545 = (long) (local506 << 16) | (long) local519 << 48 | (long) local515 << 32 | (long) local511;
							@Pc(549) int local549 = local228[local437];
							@Pc(553) int local553 = local235[local437];
							@Pc(555) byte local555 = 74;
							@Pc(557) int local557 = 0;
							@Pc(559) float local559 = 1.0F;
							@Pc(672) float local672;
							@Pc(690) float local690;
							@Pc(698) float local698;
							@Pc(639) float local639;
							@Pc(737) int local737;
							if (local549 == 0 && local553 == 0) {
								local672 = local284;
								local737 = local555 - local393;
								local698 = local298;
								local690 = local291;
							} else if (local549 == 0 && local553 == super.anInt10540) {
								local690 = local316;
								local737 = local555 - local403;
								local672 = local307;
								local698 = local325;
							} else if (super.anInt10540 == local549 && super.anInt10540 == local553) {
								local698 = local358;
								local737 = local555 - local415;
								local690 = local347;
								local672 = local336;
							} else if (super.anInt10540 == local549 && local553 == 0) {
								local698 = local385;
								local737 = local555 - local425;
								local690 = local376;
								local672 = local367;
							} else {
								@Pc(615) float local615 = (float) local549 / (float) super.anInt10540;
								@Pc(622) float local622 = (float) local553 / (float) super.anInt10540;
								@Pc(630) float local630 = local284 + (local367 - local284) * local615;
								local639 = local291 + local615 * (local376 - local291);
								@Pc(647) float local647 = local298 + (local385 - local298) * local615;
								@Pc(656) float local656 = local307 + local615 * (local336 - local307);
								@Pc(664) float local664 = (local347 - local316) * local615 + local316;
								local672 = local630 + local622 * (local656 - local630);
								@Pc(681) float local681 = local325 + local615 * (local358 - local325);
								local690 = local639 + (local664 - local639) * local622;
								local698 = local647 + local622 * (local681 - local647);
								@Pc(710) int local710 = (local549 * (local425 - local393) >> super.anInt10547) + local393;
								@Pc(723) int local723 = local403 + ((local415 - local403) * local549 >> super.anInt10547);
								local737 = local555 - ((local723 - local710) * local553 >> super.anInt10547) - local710;
							}
							if (local515 != -1) {
								@Pc(797) int local797 = local737 * (local515 & 0x7F) >> 7;
								if (local797 < 2) {
									local797 = 2;
								} else if (local797 > 126) {
									local797 = 126;
								}
								if ((this.anInt6371 & 0x7) == 0) {
									local559 = this.aClass143_Sub1_11.aFloatArray55[2] * local698 + local690 * this.aClass143_Sub1_11.aFloatArray55[1] + this.aClass143_Sub1_11.aFloatArray55[0] * local672;
									local559 = this.aClass143_Sub1_11.aFloat136 + local559 * (local559 > 0.0F ? this.aClass143_Sub1_11.aFloat142 : this.aClass143_Sub1_11.aFloat135);
								}
								local557 = Static6.anIntArray6[local797 | local515 & 0xFF80];
							}
							@Pc(871) Class5 local871 = null;
							if ((this.anInt6372 - 1 & local492) == 0 && (this.anInt6372 - 1 & local501) == 0) {
								local871 = local195.method7766(local545);
							}
							@Pc(910) int local910;
							@Pc(971) int local971;
							if (local871 == null) {
								if (local519 == local515) {
									local971 = local557;
								} else {
									@Pc(951) int local951 = local737 * (local519 & 0x7F) >> 7;
									if (local951 < 2) {
										local951 = 2;
									} else if (local951 > 126) {
										local951 = 126;
									}
									local971 = Static6.anIntArray6[local951 | local519 & 0xFF80];
									if ((this.anInt6371 & 0x7) == 0) {
										local639 = this.aClass143_Sub1_11.aFloatArray55[2] * local698 + this.aClass143_Sub1_11.aFloatArray55[1] * local690 + local672 * this.aClass143_Sub1_11.aFloatArray55[0];
										local639 = this.aClass143_Sub1_11.aFloat136 + local559 * (local559 > 0.0F ? this.aClass143_Sub1_11.aFloat142 : this.aClass143_Sub1_11.aFloat135);
										@Pc(1027) int local1027 = local971 >> 16 & 0xFF;
										@Pc(1033) int local1033 = local971 >> 8 & 0xFF;
										local1027 = (int) ((float) local1027 * local639);
										@Pc(1043) int local1043 = local971 & 0xFF;
										if (local1027 < 0) {
											local1027 = 0;
										} else if (local1027 > 255) {
											local1027 = 255;
										}
										local1033 = (int) ((float) local1033 * local639);
										local1043 = (int) ((float) local1043 * local639);
										if (local1033 < 0) {
											local1033 = 0;
										} else if (local1033 > 255) {
											local1033 = 255;
										}
										if (local1043 < 0) {
											local1043 = 0;
										} else if (local1043 > 255) {
											local1043 = 255;
										}
										local971 = local1043 | local1027 << 16 | local1033 << 8;
									}
								}
								if (Stream.a()) {
									local169.b((float) local492);
									local169.b((float) (local527 + this.method8753(local492, local501)));
									local169.b((float) local501);
									local169.b((float) local492);
									local169.b((float) local501);
									if (this.anIntArrayArrayArray8 != null) {
										local169.b((float) (local273 == null ? 0 : local273[local437] - 1));
									}
									if ((this.anInt6371 & 0x7) != 0) {
										local169.b(local672);
										local169.b(local690);
										local169.b(local698);
									}
								} else {
									local169.a((float) local492);
									local169.a((float) (this.method8753(local492, local501) + local527));
									local169.a((float) local501);
									local169.a((float) local492);
									local169.a((float) local501);
									if (this.anIntArrayArrayArray8 != null) {
										local169.a((float) (local273 == null ? 0 : local273[local437] - 1));
									}
									if ((this.anInt6371 & 0x7) != 0) {
										local169.a(local672);
										local169.a(local690);
										local169.a(local698);
									}
								}
								if (this.aClass143_Sub1_11.anInt7376 == 0) {
									local174.a(local971 | 0xFF000000);
								} else {
									local174.e(local971 | 0xFF000000);
								}
								local910 = this.anInt6370++;
								local478[local437] = (short) local910;
								if (local515 != -1) {
									local178[local910] = local221[local437];
								}
								local195.method7770(local545, new Class5_Sub19(local478[local437]));
							} else {
								local478[local437] = ((Class5_Sub19) local871).aShort26;
								local910 = local478[local437] & 0xFFFF;
								if (local515 != -1 && local221[local437].aLong329 < local178[local910].aLong329) {
									local178[local910] = local221[local437];
								}
							}
							for (local971 = 0; local971 < local427; local971++) {
								local199[local971].method1897(local910, local737, local557, local559);
							}
							this.anInt6375++;
						}
					}
				}
			}
			for (local205 = 0; local205 < this.anInt6370; local205++) {
				@Pc(1333) Class5_Sub20 local1333 = local178[local205];
				if (local1333 != null) {
					local1333.method1901(local205);
				}
			}
			@Pc(1354) int local1354;
			@Pc(1372) int local1372;
			for (@Pc(1350) int local1350 = 0; local1350 < super.anInt10541; local1350++) {
				for (local1354 = 0; super.anInt10545 > local1354; local1354++) {
					@Pc(1366) short[] local1366 = this.aShortArrayArray14[local1350 + local1354 * super.anInt10541];
					if (local1366 != null) {
						@Pc(1370) int local1370 = 0;
						local1372 = 0;
						while (local1366.length > local1372) {
							@Pc(1381) int local1381 = local1366[local1372++] & 0xFFFF;
							@Pc(1388) int local1388 = local1366[local1372++] & 0xFFFF;
							@Pc(1395) int local1395 = local1366[local1372++] & 0xFFFF;
							@Pc(1399) Class5_Sub20 local1399 = local178[local1381];
							@Pc(1403) Class5_Sub20 local1403 = local178[local1388];
							@Pc(1407) Class5_Sub20 local1407 = local178[local1395];
							@Pc(1409) Class5_Sub20 local1409 = null;
							if (local1399 != null) {
								local1409 = local1399;
								local1399.method1902(local1370, local1354, local1350);
							}
							if (local1403 != null) {
								local1403.method1902(local1370, local1354, local1350);
								if (local1409 == null || local1409.aLong329 > local1403.aLong329) {
									local1409 = local1403;
								}
							}
							if (local1407 != null) {
								local1407.method1902(local1370, local1354, local1350);
								if (local1409 == null || local1409.aLong329 > local1407.aLong329) {
									local1409 = local1407;
								}
							}
							if (local1409 != null) {
								if (local1399 != null) {
									local1409.method1901(local1381);
								}
								if (local1403 != null) {
									local1409.method1901(local1388);
								}
								if (local1407 != null) {
									local1409.method1901(local1395);
								}
								local1409.method1902(local1370, local1354, local1350);
							}
							local1370++;
						}
					}
				}
			}
			local169.c();
			local174.c();
			this.anInterface6_13 = this.aClass143_Sub1_11.method6373(false);
			this.anInterface6_13.method3122(4, this.anInt6370 * 4, local154);
			this.anInterface6_12 = this.aClass143_Sub1_11.method6373(false);
			this.anInterface6_12.method3122(local131, this.anInt6370 * local131, local164);
			if ((this.anInt6371 & 0x7) == 0) {
				if (this.anIntArrayArrayArray8 == null) {
					this.aClass48_16 = this.aClass143_Sub1_11.method6320(new Class284[] { new Class284(new Class137[] { Static199.aClass137_1, Static199.aClass137_5 }), new Class284(Static199.aClass137_3) });
				} else {
					this.aClass48_16 = this.aClass143_Sub1_11.method6320(new Class284[] { new Class284(new Class137[] { Static199.aClass137_1, Static199.aClass137_5, Static199.aClass137_4 }), new Class284(Static199.aClass137_3) });
				}
			} else if (this.anIntArrayArrayArray8 == null) {
				this.aClass48_16 = this.aClass143_Sub1_11.method6320(new Class284[] { new Class284(new Class137[] { Static199.aClass137_1, Static199.aClass137_5, Static199.aClass137_2 }), new Class284(Static199.aClass137_3) });
			} else {
				this.aClass48_16 = this.aClass143_Sub1_11.method6320(new Class284[] { new Class284(new Class137[] { Static199.aClass137_1, Static199.aClass137_5, Static199.aClass137_4, Static199.aClass137_2 }), new Class284(Static199.aClass137_3) });
			}
			local1354 = 0;
			for (@Pc(1708) int local1708 = 0; local1708 < local103.length; local1708++) {
				if (local103[local1708].anInt2087 > 0) {
					local103[local1354++] = local103[local1708];
				}
			}
			this.aClass5_Sub20Array1 = new Class5_Sub20[local1354];
			@Pc(1737) long[] local1737 = new long[local1354];
			for (local1372 = 0; local1372 < local1354; local1372++) {
				@Pc(1745) Class5_Sub20 local1745 = local103[local1372];
				local1737[local1372] = local1745.aLong329;
				this.aClass5_Sub20Array1[local1372] = local1745;
				local1745.method1906(this.anInt6370);
			}
			Static335.method5152(this.aClass5_Sub20Array1, local1737);
			if (this.aClass159_2 != null) {
				this.aClass159_2.method3351();
			}
		} else {
			this.aClass159_2 = null;
		}
		this.anIntArrayArrayArray13 = null;
		this.aClass335_27 = null;
		this.aByteArrayArray14 = null;
		this.anIntArrayArrayArray10 = this.anIntArrayArrayArray11 = null;
		this.aFloatArrayArray9 = this.aFloatArrayArray8 = this.aFloatArrayArray7 = null;
		this.aClass5_Sub20ArrayArrayArray1 = null;
		this.anIntArrayArrayArray8 = null;
		this.anIntArrayArrayArray12 = null;
		this.anIntArrayArrayArray9 = null;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
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

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method8755(@OriginalArg(0) Class5_Sub2_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass159_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(24) int local24 = arg1 - (this.aClass143_Sub1_11.anInt7380 * arg2 >> 8) >> this.aClass143_Sub1_11.anInt7392;
			@Pc(39) int local39 = arg3 - (this.aClass143_Sub1_11.anInt7387 * arg2 >> 8) >> this.aClass143_Sub1_11.anInt7392;
			return this.aClass159_2.method3353(local24, arg0, local39);
		}
	}

	@OriginalMember(owner = "client!mg", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		@Pc(9) Interface3 local9 = this.aClass143_Sub1_11.anInterface3_11;
		if (arg5 != null && this.anIntArrayArrayArray8 == null) {
			this.anIntArrayArrayArray8 = new int[super.anInt10541][super.anInt10545][];
		}
		if (arg3 != null && this.anIntArrayArrayArray12 == null) {
			this.anIntArrayArrayArray12 = new int[super.anInt10541][super.anInt10545][];
		}
		this.anIntArrayArrayArray10[arg0][arg1] = arg2;
		this.anIntArrayArrayArray11[arg0][arg1] = arg4;
		this.anIntArrayArrayArray9[arg0][arg1] = arg6;
		this.anIntArrayArrayArray13[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray8 != null) {
			this.anIntArrayArrayArray8[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray12 != null) {
			this.anIntArrayArrayArray12[arg0][arg1] = arg3;
		}
		@Pc(92) Class5_Sub20[] local92 = this.aClass5_Sub20ArrayArrayArray1[arg0][arg1] = new Class5_Sub20[arg6.length];
		for (@Pc(94) int local94 = 0; local94 < arg6.length; local94++) {
			@Pc(100) int local100 = arg8[local94];
			@Pc(104) int local104 = arg9[local94];
			if ((this.anInt6371 & 0x20) != 0 && local100 != -1 && local9.method8501(local100).aBoolean660) {
				local104 = 128;
				local100 = -1;
			}
			@Pc(146) long local146 = (long) (local104 << 14) | (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42 | (long) local100;
			@Pc(152) Class5 local152;
			for (local152 = this.aClass335_27.method7766(local146); local152 != null; local152 = this.aClass335_27.method7769()) {
				@Pc(157) Class5_Sub20 local157 = (Class5_Sub20) local152;
				if (local100 == local157.anInt2082 && local157.aFloat45 == (float) local104 && local157.anInt2084 == arg10 && local157.anInt2075 == arg11 && arg12 == local157.anInt2083) {
					break;
				}
			}
			if (local152 == null) {
				local92[local94] = new Class5_Sub20(this, local100, local104, arg10, arg11, arg12);
				this.aClass335_27.method7770(local146, local92[local94]);
			} else {
				local92[local94] = (Class5_Sub20) local152;
			}
		}
		if (arg13) {
			this.aByteArrayArray13[arg0][arg1] = (byte) (this.aByteArrayArray13[arg0][arg1] | 0x1);
		}
		if (this.anInt6390 < arg6.length) {
			this.anInt6390 = arg6.length;
		}
		this.anInt6391 += arg6.length;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILclient!gg;II)V")
	private void method5368(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub2_Sub7_Sub1 arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray10[arg2][arg0];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray11[arg2][arg0];
		@Pc(22) int local22 = local12.length;
		if (local22 > Static237.anIntArray237.length) {
			Static221.anIntArray196 = new int[local22];
			Static237.anIntArray237 = new int[local22];
		}
		for (@Pc(38) int local38 = 0; local38 < local22; local38++) {
			Static237.anIntArray237[local38] = local12[local38] >> this.aClass143_Sub1_11.anInt7392;
			Static221.anIntArray196[local38] = local19[local38] >> this.aClass143_Sub1_11.anInt7392;
		}
		@Pc(70) int local70 = 0;
		while (local70 < local22) {
			@Pc(76) int local76 = Static237.anIntArray237[local70];
			@Pc(81) int local81 = Static221.anIntArray196[local70++];
			@Pc(85) int local85 = Static237.anIntArray237[local70];
			@Pc(90) int local90 = Static221.anIntArray196[local70++];
			@Pc(94) int local94 = Static237.anIntArray237[local70];
			@Pc(99) int local99 = Static221.anIntArray196[local70++];
			if ((local76 - local85) * (local90 - local99) - (local94 - local85) * (local90 - local81) > 0) {
				arg1.method2720(local99, local85, local90, local81, local94, local76);
			}
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method8744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method5369(arg3, -1, arg5, arg2, arg0, arg4, arg1);
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method8745(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt6391 <= 0) {
			return;
		}
		@Pc(19) Interface16 local19 = this.aClass143_Sub1_11.method6387(this.anInt6375);
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = 32767;
		@Pc(25) int local25 = -32768;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			local21 = 0;
			@Pc(36) Buffer local36 = local19.method7864();
			if (local36 != null) {
				@Pc(44) Stream local44 = this.aClass143_Sub1_11.method6361(local36);
				@Pc(48) int local48;
				@Pc(57) int local57;
				@Pc(59) int local59;
				@Pc(78) short[] local78;
				@Pc(82) int local82;
				@Pc(90) int local90;
				if (Stream.a()) {
					for (local48 = arg1; local48 < arg3; local48++) {
						local57 = arg0 + super.anInt10541 * local48;
						for (local59 = arg0; local59 < arg2; local59++) {
							if (arg4[local59 - arg0][local48 - arg1]) {
								local78 = this.aShortArrayArray14[local57];
								if (local78 != null) {
									for (local82 = 0; local82 < local78.length; local82++) {
										local90 = local78[local82] & 0xFFFF;
										if (local90 < local23) {
											local23 = local90;
										}
										local21++;
										local44.b(local90);
										if (local25 < local90) {
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
						local57 = local48 * super.anInt10541 + arg0;
						for (local59 = arg0; local59 < arg2; local59++) {
							if (arg4[local59 - arg0][local48 - arg1]) {
								local78 = this.aShortArrayArray14[local57];
								if (local78 != null) {
									for (local82 = 0; local82 < local78.length; local82++) {
										local90 = local78[local82] & 0xFFFF;
										if (local90 < local23) {
											local23 = local90;
										}
										local44.f(local90);
										if (local25 < local90) {
											local25 = local90;
										}
										local21++;
									}
								}
							}
							local57++;
						}
					}
				}
				local44.c();
				if (local19.method7862()) {
					break;
				}
			}
		}
		if (local21 <= 0) {
			return;
		}
		this.aClass143_Sub1_11.method6355();
		this.aClass143_Sub1_11.method6380(false);
		this.aClass143_Sub1_11.method6288(false);
		this.aClass143_Sub1_11.method6362(false);
		this.aClass143_Sub1_11.method6405(false);
		this.aClass143_Sub1_11.method6321(0);
		this.aClass143_Sub1_11.method6312(false, false, -2);
		this.aClass143_Sub1_11.method6338((Interface4) null);
		@Pc(272) Class56_Sub2 local272 = this.aClass143_Sub1_11.method6349();
		@Pc(277) float[] local277 = this.aClass143_Sub1_11.method6335();
		local277[6] = 0.0F;
		local277[0] = (float) 1024 / ((float) this.aClass143_Sub1_11.anInt7221 * (float) super.anInt10540 * 128.0F);
		local277[3] = 0.0F;
		local277[12] = -1.0F - ((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass143_Sub1_11.anInt7221;
		local277[5] = (float) 1024 / ((float) this.aClass143_Sub1_11.anInt7257 * (float) super.anInt10540 * 128.0F);
		local277[10] = 1.0F / (this.aFloat121 - this.aFloat122);
		local277[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass143_Sub1_11.anInt7257;
		local277[11] = 0.0F;
		local277[4] = 0.0F;
		local277[2] = 0.0F;
		local277[9] = 0.0F;
		local277[14] = -this.aFloat122 / (this.aFloat121 - this.aFloat122);
		local277[7] = 0.0F;
		local277[8] = 0.0F;
		local277[15] = 1.0F;
		local277[1] = 0.0F;
		local272.method6831(1.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
		this.aClass143_Sub1_11.method6357();
		this.aClass143_Sub1_11.method6356();
		if ((this.anInt6371 & 0x7) == 0) {
			this.aClass143_Sub1_11.method6288(false);
		} else {
			this.aClass143_Sub1_11.method6288(true);
			this.aClass143_Sub1_11.method6326();
		}
		this.aClass143_Sub1_11.method6323(false);
		this.aClass143_Sub1_11.method6325(0, this.anInterface6_12);
		this.aClass143_Sub1_11.method6325(1, this.anInterface6_13);
		this.aClass143_Sub1_11.method6333(this.aClass48_16);
		this.aClass143_Sub1_11.method6367(Static536.aClass323_4, local23, local19, 0, local25 + 1 - local23, local21 / 3);
		this.aClass143_Sub1_11.method6323(true);
	}

	@OriginalMember(owner = "client!mg", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray14[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray14[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "([[ZIIIIBZI)V")
	private void method5369(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6) {
		if (this.aClass5_Sub20Array1 == null) {
			return;
		}
		@Pc(15) int local15 = arg3 + arg3 + 1;
		@Pc(19) int local19 = local15 * local15;
		if (local19 > Static314.anIntArray310.length) {
			Static314.anIntArray310 = new int[local19];
		}
		@Pc(34) int local34 = arg4 - arg3;
		@Pc(36) int local36 = local34;
		if (local34 < 0) {
			local34 = 0;
		}
		@Pc(45) int local45 = arg6 - arg3;
		@Pc(47) int local47 = local45;
		if (local45 < 0) {
			local45 = 0;
		}
		@Pc(58) int local58 = arg4 + arg3;
		if (super.anInt10541 - 1 < local58) {
			local58 = super.anInt10541 - 1;
		}
		@Pc(74) int local74 = arg6 + arg3;
		Static283.anInt4413 = 0;
		if (super.anInt10545 - 1 < local74) {
			local74 = super.anInt10545 - 1;
		}
		for (@Pc(89) int local89 = local34; local89 <= local58; local89++) {
			@Pc(98) boolean[] local98 = arg0[local89 - local36];
			for (@Pc(100) int local100 = local45; local100 <= local74; local100++) {
				if (local98[local100 - local47]) {
					Static314.anIntArray310[Static283.anInt4413++] = super.anInt10541 * local100 + local89;
				}
			}
		}
		if (arg1 == -1) {
			this.aClass143_Sub1_11.method6365();
		} else {
			this.aClass143_Sub1_11.method6354((float) arg1);
			this.aClass143_Sub1_11.method6347();
		}
		this.aClass143_Sub1_11.method6313();
		this.aClass143_Sub1_11.method6288((this.anInt6371 & 0x7) != 0);
		this.aClass143_Sub1_11.method6312(false, false, -1);
		this.aClass143_Sub1_11.method6325(0, this.anInterface6_12);
		for (@Pc(185) int local185 = 0; local185 < this.aClass5_Sub20Array1.length; local185++) {
			this.aClass5_Sub20Array1[local185].method1898(Static283.anInt4413, Static314.anIntArray310);
		}
		@Pc(206) Class56_Sub2 local206 = this.aClass143_Sub1_11.method6349();
		local206.method8395(0, -1, 0);
		this.aClass143_Sub1_11.method6356();
		if (!this.aClass124_63.method2577()) {
			@Pc(224) int local224 = this.aClass143_Sub1_11.anInt7399;
			@Pc(228) int local228 = this.aClass143_Sub1_11.anInt7407;
			this.aClass143_Sub1_11.L(0, local228, this.aClass143_Sub1_11.anInt7390);
			this.aClass143_Sub1_11.method6288(false);
			this.aClass143_Sub1_11.method6405(false);
			this.aClass143_Sub1_11.method6321(128);
			this.aClass143_Sub1_11.method6312(false, false, -2);
			this.aClass143_Sub1_11.method6338(this.aClass143_Sub1_11.anInterface4_3);
			this.aClass143_Sub1_11.method6370(Static600.aClass6_4, Static371.aClass6_2);
			this.aClass143_Sub1_11.method6290(Static85.aClass90_1, 0);
			this.aClass143_Sub1_11.method6391(0, Static619.aClass90_3);
			for (@Pc(288) Class5 local288 = this.aClass124_63.method2572(); local288 != null; local288 = this.aClass124_63.method2569()) {
				@Pc(293) Class5_Sub39 local293 = (Class5_Sub39) local288;
				local293.method5676(arg4, arg0, arg6, arg3);
			}
			this.aClass143_Sub1_11.method6290(Static663.aClass90_4, 0);
			this.aClass143_Sub1_11.method6391(0, Static663.aClass90_4);
			this.aClass143_Sub1_11.method6338((Interface4) null);
			this.aClass143_Sub1_11.L(local224, local228, this.aClass143_Sub1_11.anInt7390);
		}
		if (this.aClass159_2 != null) {
			this.aClass143_Sub1_11.method6325(0, this.anInterface6_12);
			this.aClass143_Sub1_11.method6325(1, this.anInterface6_13);
			this.aClass143_Sub1_11.method6333(this.aClass48_16);
			this.aClass159_2.method3350(arg5, arg6, arg4, arg0, arg3);
		}
	}

	@OriginalMember(owner = "client!mg", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class5_Sub2_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass159_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass143_Sub1_11.anInt7380 >> 8) >> this.aClass143_Sub1_11.anInt7392;
			@Pc(38) int local38 = arg3 - (this.aClass143_Sub1_11.anInt7387 * arg2 >> 8) >> this.aClass143_Sub1_11.anInt7392;
			this.aClass159_2.method3354(local38, local24, arg0);
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!jw;[I)V")
	@Override
	public void method8752(@OriginalArg(0) Class5_Sub3 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass124_63.method2574(new Class5_Sub39(this.aClass143_Sub1_11, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!mg", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class5_Sub2_Sub7 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub2_Sub7 arg2) {
		if ((this.aByteArrayArray13[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt10540 >> this.aClass143_Sub1_11.anInt7392;
		@Pc(27) Class5_Sub2_Sub7_Sub1 local27 = (Class5_Sub2_Sub7_Sub1) arg2;
		@Pc(37) Class5_Sub2_Sub7_Sub1 local37;
		if (local27 != null && local27.method2719(local24, local24)) {
			local37 = local27;
			local27.method2715();
		} else {
			local37 = new Class5_Sub2_Sub7_Sub1(this.aClass143_Sub1_11, local24, local24);
		}
		local37.method2718(0, local24, local24, 0);
		this.method5368(arg1, local37, arg0);
		return local37;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method8751(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method5369(arg3, arg5, arg6, arg2, arg0, arg4, arg1);
	}

	@OriginalMember(owner = "client!mg", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class5_Sub2_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass159_2 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (arg2 * this.aClass143_Sub1_11.anInt7380 >> 8) >> this.aClass143_Sub1_11.anInt7392;
			@Pc(38) int local38 = arg3 - (this.aClass143_Sub1_11.anInt7387 * arg2 >> 8) >> this.aClass143_Sub1_11.anInt7392;
			this.aClass159_2.method3352(local23, local38, arg0);
		}
	}
}
