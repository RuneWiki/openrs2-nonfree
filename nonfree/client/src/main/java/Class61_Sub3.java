import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vha")
public final class Class61_Sub3 extends Class61 {

	@OriginalMember(owner = "client!vha", name = "T", descriptor = "I")
	private int anInt10054;

	@OriginalMember(owner = "client!vha", name = "U", descriptor = "I")
	private int anInt10055;

	@OriginalMember(owner = "client!vha", name = "W", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray19;

	@OriginalMember(owner = "client!vha", name = "ab", descriptor = "Lclient!fk;")
	public Class90 aClass90_23;

	@OriginalMember(owner = "client!vha", name = "bb", descriptor = "[Lclient!oh;")
	private Class5_Sub39[] aClass5_Sub39Array1;

	@OriginalMember(owner = "client!vha", name = "cb", descriptor = "Lclient!fb;")
	private Interface6 anInterface6_15;

	@OriginalMember(owner = "client!vha", name = "eb", descriptor = "Lclient!fb;")
	private Interface6 anInterface6_16;

	@OriginalMember(owner = "client!vha", name = "gb", descriptor = "I")
	private int anInt10057;

	@OriginalMember(owner = "client!vha", name = "kb", descriptor = "I")
	private int anInt10058;

	@OriginalMember(owner = "client!vha", name = "I", descriptor = "F")
	private float aFloat199 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!vha", name = "K", descriptor = "F")
	private float aFloat200 = -3.4028235E38F;

	@OriginalMember(owner = "client!vha", name = "m", descriptor = "Lclient!tg;")
	private final Class330 aClass330_60 = new Class330();

	@OriginalMember(owner = "client!vha", name = "O", descriptor = "Lclient!pj;")
	public final Class133_Sub1 aClass133_Sub1_19;

	@OriginalMember(owner = "client!vha", name = "y", descriptor = "I")
	private final int anInt10040;

	@OriginalMember(owner = "client!vha", name = "P", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray18;

	@OriginalMember(owner = "client!vha", name = "M", descriptor = "I")
	public final int anInt10050;

	@OriginalMember(owner = "client!vha", name = "db", descriptor = "[[F")
	private float[][] aFloatArrayArray16;

	@OriginalMember(owner = "client!vha", name = "q", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!vha", name = "X", descriptor = "[[S")
	public final short[][] aShortArrayArray39;

	@OriginalMember(owner = "client!vha", name = "fb", descriptor = "[[F")
	private float[][] aFloatArrayArray17;

	@OriginalMember(owner = "client!vha", name = "H", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray17;

	@OriginalMember(owner = "client!vha", name = "ib", descriptor = "[[B")
	private byte[][] aByteArrayArray29;

	@OriginalMember(owner = "client!vha", name = "u", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!vha", name = "Y", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray20;

	@OriginalMember(owner = "client!vha", name = "w", descriptor = "I")
	private final int anInt10039;

	@OriginalMember(owner = "client!vha", name = "S", descriptor = "[[[Lclient!oh;")
	private Class5_Sub39[][][] aClass5_Sub39ArrayArrayArray1;

	@OriginalMember(owner = "client!vha", name = "hb", descriptor = "[[F")
	private float[][] aFloatArrayArray18;

	@OriginalMember(owner = "client!vha", name = "r", descriptor = "[[B")
	private final byte[][] aByteArrayArray27;

	@OriginalMember(owner = "client!vha", name = "jb", descriptor = "Lclient!pl;")
	private Class273 aClass273_46;

	@OriginalMember(owner = "client!vha", name = "Z", descriptor = "Lclient!vda;")
	private Class358 aClass358_2;

	@OriginalMember(owner = "client!vha", name = "<init>", descriptor = "(Lclient!pj;IIII[[I[[II)V")
	public Class61_Sub3(@OriginalArg(0) Class133_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass133_Sub1_19 = arg0;
		this.anInt10040 = super.anInt10031 - 2;
		this.anIntArrayArrayArray18 = new int[arg3][arg4][];
		this.anInt10050 = arg2;
		this.aFloatArrayArray16 = new float[super.anInt10026 + 1][super.anInt10029 + 1];
		this.anIntArrayArrayArray15 = new int[arg3][arg4][];
		this.aShortArrayArray39 = new short[arg3 * arg4][];
		this.aFloatArrayArray17 = new float[super.anInt10026 + 1][super.anInt10029 + 1];
		this.anIntArrayArrayArray17 = new int[arg3][arg4][];
		this.aByteArrayArray29 = new byte[arg3 + 1][arg4 + 1];
		this.anIntArrayArrayArray16 = new int[arg3][arg4][];
		this.anIntArrayArrayArray20 = new int[arg3][arg4][];
		this.anInt10039 = 0x1 << this.anInt10040;
		this.aClass5_Sub39ArrayArrayArray1 = new Class5_Sub39[arg3][arg4][];
		this.aFloatArrayArray18 = new float[super.anInt10026 + 1][super.anInt10029 + 1];
		this.aByteArrayArray27 = new byte[arg3][arg4];
		for (@Pc(121) int local121 = 0; super.anInt10029 >= local121; local121++) {
			for (@Pc(125) int local125 = 0; super.anInt10026 >= local125; local125++) {
				@Pc(134) int local134 = super.anIntArrayArray71[local125][local121];
				if ((float) local134 < this.aFloat199) {
					this.aFloat199 = local134;
				}
				if ((float) local134 > this.aFloat200) {
					this.aFloat200 = local134;
				}
				if (local125 > 0 && local121 > 0 && super.anInt10026 > local125 && local121 < super.anInt10029) {
					@Pc(189) int local189 = arg6[local125 + 1][local121] - arg6[local125 - 1][local121];
					@Pc(206) int local206 = arg6[local125][local121 + 1] - arg6[local125][local121 - 1];
					@Pc(227) float local227 = (float) (1.0D / Math.sqrt((double) (local189 * local189 + arg7 * 4 * arg7 + local206 * local206)));
					this.aFloatArrayArray18[local125][local121] = (float) local189 * local227;
					this.aFloatArrayArray16[local125][local121] = (float) (-arg7 * 2) * local227;
					this.aFloatArrayArray17[local125][local121] = local227 * (float) local206;
				}
			}
		}
		this.aFloat200++;
		this.aFloat199--;
		this.aClass273_46 = new Class273(128);
		if ((this.anInt10050 & 0x10) != 0) {
			this.aClass358_2 = new Class358(this.aClass133_Sub1_19, this);
		}
	}

	@OriginalMember(owner = "client!vha", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.anInt10057 > 0) {
			@Pc(17) byte[][] local17 = new byte[super.anInt10026 + 1][super.anInt10029 + 1];
			for (@Pc(19) int local19 = 1; super.anInt10026 > local19; local19++) {
				for (@Pc(23) int local23 = 1; local23 < super.anInt10029; local23++) {
					local17[local19][local23] = (byte) ((this.aByteArrayArray29[local19][local23 + 1] >> 3) + (this.aByteArrayArray29[local19][local23 - 1] >> 2) + (this.aByteArrayArray29[local19 + -1][local23] >> 2) + (this.aByteArrayArray29[local19 + 1][local23] >> 3) + (this.aByteArrayArray29[local19][local23] >> 1));
				}
			}
			@Pc(107) Class5_Sub39[] local107 = new Class5_Sub39[this.aClass273_46.method6580()];
			this.aClass273_46.method6584(local107);
			for (@Pc(115) int local115 = 0; local115 < local107.length; local115++) {
				local107[local115].method5987(this.anInt10057);
			}
			@Pc(131) int local131 = 20;
			if (this.anIntArrayArrayArray19 != null) {
				local131 += 4;
			}
			if ((this.anInt10050 & 0x7) != 0) {
				local131 += 12;
			}
			@Pc(154) NativeHeapBuffer local154 = this.aClass133_Sub1_19.aNativeHeap4.a(this.anInt10057 * 4, false);
			@Pc(164) NativeHeapBuffer local164 = this.aClass133_Sub1_19.aNativeHeap4.a(local131 * this.anInt10057, false);
			@Pc(169) Stream local169 = new Stream(local164);
			@Pc(174) Stream local174 = new Stream(local154);
			@Pc(178) Class5_Sub39[] local178 = new Class5_Sub39[this.anInt10057];
			@Pc(185) int local185 = Static460.method6846(this.anInt10057 / 4);
			if (local185 < 1) {
				local185 = 1;
			}
			@Pc(195) Class273 local195 = new Class273(local185);
			@Pc(199) Class5_Sub39[] local199 = new Class5_Sub39[this.anInt10058];
			@Pc(205) int local205;
			for (@Pc(201) int local201 = 0; super.anInt10026 > local201; local201++) {
				for (local205 = 0; super.anInt10029 > local205; local205++) {
					if (this.anIntArrayArrayArray15[local201][local205] != null) {
						@Pc(221) Class5_Sub39[] local221 = this.aClass5_Sub39ArrayArrayArray1[local201][local205];
						@Pc(228) int[] local228 = this.anIntArrayArrayArray18[local201][local205];
						@Pc(235) int[] local235 = this.anIntArrayArrayArray17[local201][local205];
						@Pc(242) int[] local242 = this.anIntArrayArrayArray20[local201][local205];
						@Pc(249) int[] local249 = this.anIntArrayArrayArray15[local201][local205];
						@Pc(261) int[] local261 = this.anIntArrayArrayArray16 == null ? null : this.anIntArrayArrayArray16[local201][local205];
						if (local242 == null) {
							local242 = local249;
						}
						@Pc(277) int[] local277 = this.anIntArrayArrayArray19 == null ? null : this.anIntArrayArrayArray19[local201][local205];
						@Pc(284) float local284 = this.aFloatArrayArray18[local201][local205];
						@Pc(291) float local291 = this.aFloatArrayArray16[local201][local205];
						@Pc(298) float local298 = this.aFloatArrayArray17[local201][local205];
						@Pc(307) float local307 = this.aFloatArrayArray18[local201][local205 + 1];
						@Pc(316) float local316 = this.aFloatArrayArray16[local201][local205 + 1];
						@Pc(325) float local325 = this.aFloatArrayArray17[local201][local205 + 1];
						@Pc(336) float local336 = this.aFloatArrayArray18[local201 + 1][local205 + 1];
						@Pc(347) float local347 = this.aFloatArrayArray16[local201 + 1][local205 + 1];
						@Pc(358) float local358 = this.aFloatArrayArray17[local201 + 1][local205 + 1];
						@Pc(367) float local367 = this.aFloatArrayArray18[local201 + 1][local205];
						@Pc(376) float local376 = this.aFloatArrayArray16[local201 + 1][local205];
						@Pc(385) float local385 = this.aFloatArrayArray17[local201 + 1][local205];
						@Pc(393) int local393 = local17[local201][local205] & 0xFF;
						@Pc(403) int local403 = local17[local201][local205 + 1] & 0xFF;
						@Pc(415) int local415 = local17[local201 + 1][local205 + 1] & 0xFF;
						@Pc(425) int local425 = local17[local201 + 1][local205] & 0xFF;
						@Pc(427) int local427 = 0;
						@Pc(437) int local437;
						label357: for (@Pc(429) int local429 = 0; local429 < local249.length; local429++) {
							@Pc(435) Class5_Sub39 local435 = local221[local429];
							for (local437 = 0; local437 < local427; local437++) {
								if (local199[local437] == local435) {
									continue label357;
								}
							}
							local199[local427++] = local435;
						}
						@Pc(478) short[] local478 = this.aShortArrayArray39[local201 + super.anInt10026 * local205] = new short[local249.length];
						for (local437 = 0; local437 < local249.length; local437++) {
							@Pc(491) int local491 = (local201 << super.anInt10031) + local228[local437];
							@Pc(500) int local500 = (local205 << super.anInt10031) + local235[local437];
							@Pc(505) int local505 = local491 >> this.anInt10040;
							@Pc(510) int local510 = local500 >> this.anInt10040;
							@Pc(514) int local514 = local249[local437];
							@Pc(518) int local518 = local242[local437];
							@Pc(526) int local526 = local261 == null ? 0 : local261[local437];
							@Pc(544) long local544 = (long) (local505 << 16) | (long) local518 << 48 | (long) local514 << 32 | (long) local510;
							@Pc(548) int local548 = local228[local437];
							@Pc(552) int local552 = local235[local437];
							@Pc(554) byte local554 = 74;
							@Pc(556) int local556 = 0;
							@Pc(569) float local569;
							@Pc(571) float local571;
							@Pc(573) float local573;
							@Pc(664) float local664;
							@Pc(567) int local567;
							if (local548 == 0 && local552 == 0) {
								local567 = local554 - local393;
								local569 = local284;
								local571 = local291;
								local573 = local298;
							} else if (local548 == 0 && super.anInt10027 == local552) {
								local571 = local316;
								local567 = local554 - local403;
								local569 = local307;
								local573 = local325;
							} else if (local548 == super.anInt10027 && super.anInt10027 == local552) {
								local567 = local554 - local415;
								local569 = local336;
								local573 = local358;
								local571 = local347;
							} else if (local548 == super.anInt10027 && local552 == 0) {
								local573 = local385;
								local569 = local367;
								local567 = local554 - local425;
								local571 = local376;
							} else {
								@Pc(641) float local641 = (float) local548 / (float) super.anInt10027;
								@Pc(648) float local648 = (float) local552 / (float) super.anInt10027;
								@Pc(656) float local656 = local284 + local641 * (local367 - local284);
								local664 = local291 + (local376 - local291) * local641;
								@Pc(672) float local672 = local641 * (local385 - local298) + local298;
								@Pc(681) float local681 = local641 * (local336 - local307) + local307;
								@Pc(689) float local689 = local316 + local641 * (local347 - local316);
								local571 = local648 * (local689 - local664) + local664;
								local569 = (local681 - local656) * local648 + local656;
								@Pc(715) float local715 = (local358 - local325) * local641 + local325;
								local573 = local648 * (local715 - local672) + local672;
								@Pc(736) int local736 = (local548 * (local425 - local393) >> super.anInt10031) + local393;
								@Pc(749) int local749 = local403 + ((local415 - local403) * local548 >> super.anInt10031);
								local567 = local554 - local736 - (local552 * (local749 - local736) >> super.anInt10031);
							}
							@Pc(778) float local778 = 1.0F;
							if (local514 != -1) {
								@Pc(789) int local789 = (local514 & 0x7F) * local567 >> 7;
								if (local789 < 2) {
									local789 = 2;
								} else if (local789 > 126) {
									local789 = 126;
								}
								if ((this.anInt10050 & 0x7) == 0) {
									local778 = local573 * this.aClass133_Sub1_19.aFloatArray57[2] + this.aClass133_Sub1_19.aFloatArray57[1] * local571 + local569 * this.aClass133_Sub1_19.aFloatArray57[0];
									local778 = (local778 > 0.0F ? this.aClass133_Sub1_19.aFloat127 : this.aClass133_Sub1_19.aFloat124) * local778 + this.aClass133_Sub1_19.aFloat129;
								}
								local556 = Static349.anIntArray330[local514 & 0xFF80 | local789];
							}
							@Pc(863) Class5 local863 = null;
							if ((local491 & this.anInt10039 - 1) == 0 && (this.anInt10039 - 1 & local500) == 0) {
								local863 = local195.method6581(local544);
							}
							@Pc(896) int local896;
							@Pc(926) int local926;
							if (local863 == null) {
								if (local514 == local518) {
									local926 = local556;
								} else {
									@Pc(936) int local936 = local567 * (local518 & 0x7F) >> 7;
									if (local936 < 2) {
										local936 = 2;
									} else if (local936 > 126) {
										local936 = 126;
									}
									local926 = Static349.anIntArray330[local518 & 0xFF80 | local936];
									if ((this.anInt10050 & 0x7) == 0) {
										local664 = local573 * this.aClass133_Sub1_19.aFloatArray57[2] + local571 * this.aClass133_Sub1_19.aFloatArray57[1] + this.aClass133_Sub1_19.aFloatArray57[0] * local569;
										local664 = this.aClass133_Sub1_19.aFloat129 + local778 * (local778 > 0.0F ? this.aClass133_Sub1_19.aFloat127 : this.aClass133_Sub1_19.aFloat124);
										@Pc(1014) int local1014 = local926 >> 16 & 0xFF;
										@Pc(1020) int local1020 = local926 >> 8 & 0xFF;
										local1014 = (int) ((float) local1014 * local664);
										@Pc(1030) int local1030 = local926 & 0xFF;
										local1020 = (int) ((float) local1020 * local664);
										if (local1014 < 0) {
											local1014 = 0;
										} else if (local1014 > 255) {
											local1014 = 255;
										}
										local1030 = (int) ((float) local1030 * local664);
										if (local1020 < 0) {
											local1020 = 0;
										} else if (local1020 > 255) {
											local1020 = 255;
										}
										if (local1030 < 0) {
											local1030 = 0;
										} else if (local1030 > 255) {
											local1030 = 255;
										}
										local926 = local1030 | local1014 << 16 | local1020 << 8;
									}
								}
								if (Stream.a()) {
									local169.a((float) local491);
									local169.a((float) (local526 + this.method8584(local500, local491)));
									local169.a((float) local500);
									local169.a((float) local491);
									local169.a((float) local500);
									if (this.anIntArrayArrayArray19 != null) {
										local169.a((float) (local277 == null ? 0 : local277[local437] - 1));
									}
									if ((this.anInt10050 & 0x7) != 0) {
										local169.a(local569);
										local169.a(local571);
										local169.a(local573);
									}
								} else {
									local169.b((float) local491);
									local169.b((float) (this.method8584(local500, local491) + local526));
									local169.b((float) local500);
									local169.b((float) local491);
									local169.b((float) local500);
									if (this.anIntArrayArrayArray19 != null) {
										local169.b((float) (local277 == null ? 0 : local277[local437] - 1));
									}
									if ((this.anInt10050 & 0x7) != 0) {
										local169.b(local569);
										local169.b(local571);
										local169.b(local573);
									}
								}
								if (this.aClass133_Sub1_19.anInt7000 == 0) {
									local174.d(local926 | 0xFF000000);
								} else {
									local174.b(local926 | 0xFF000000);
								}
								local896 = this.anInt10055++;
								local478[local437] = (short) local896;
								if (local514 != -1) {
									local178[local896] = local221[local437];
								}
								local195.method6585(local544, new Class5_Sub12(local478[local437]));
							} else {
								local478[local437] = ((Class5_Sub12) local863).aShort32;
								local896 = local478[local437] & 0xFFFF;
								if (local514 != -1 && local221[local437].aLong278 < local178[local896].aLong278) {
									local178[local896] = local221[local437];
								}
							}
							for (local926 = 0; local926 < local427; local926++) {
								local199[local926].method5985(local778, local567, local896, local556);
							}
							this.anInt10054++;
						}
					}
				}
			}
			for (local205 = 0; local205 < this.anInt10055; local205++) {
				@Pc(1308) Class5_Sub39 local1308 = local178[local205];
				if (local1308 != null) {
					local1308.method5986(local205);
				}
			}
			@Pc(1329) int local1329;
			@Pc(1348) int local1348;
			for (@Pc(1325) int local1325 = 0; super.anInt10026 > local1325; local1325++) {
				for (local1329 = 0; local1329 < super.anInt10029; local1329++) {
					@Pc(1342) short[] local1342 = this.aShortArrayArray39[super.anInt10026 * local1329 + local1325];
					if (local1342 != null) {
						@Pc(1346) int local1346 = 0;
						local1348 = 0;
						while (local1342.length > local1348) {
							@Pc(1357) int local1357 = local1342[local1348++] & 0xFFFF;
							@Pc(1364) int local1364 = local1342[local1348++] & 0xFFFF;
							@Pc(1371) int local1371 = local1342[local1348++] & 0xFFFF;
							@Pc(1375) Class5_Sub39 local1375 = local178[local1357];
							@Pc(1379) Class5_Sub39 local1379 = local178[local1364];
							@Pc(1383) Class5_Sub39 local1383 = local178[local1371];
							@Pc(1385) Class5_Sub39 local1385 = null;
							if (local1375 != null) {
								local1375.method5984(local1329, local1325, local1346);
								local1385 = local1375;
							}
							if (local1379 != null) {
								local1379.method5984(local1329, local1325, local1346);
								if (local1385 == null || local1379.aLong278 < local1385.aLong278) {
									local1385 = local1379;
								}
							}
							if (local1383 != null) {
								local1383.method5984(local1329, local1325, local1346);
								if (local1385 == null || local1383.aLong278 < local1385.aLong278) {
									local1385 = local1383;
								}
							}
							if (local1385 != null) {
								if (local1375 != null) {
									local1385.method5986(local1357);
								}
								if (local1379 != null) {
									local1385.method5986(local1364);
								}
								if (local1383 != null) {
									local1385.method5986(local1371);
								}
								local1385.method5984(local1329, local1325, local1346);
							}
							local1346++;
						}
					}
				}
			}
			local169.b();
			local174.b();
			this.anInterface6_15 = this.aClass133_Sub1_19.method6196(false);
			this.anInterface6_15.method4125(local154, 4, this.anInt10055 * 4);
			this.anInterface6_16 = this.aClass133_Sub1_19.method6196(false);
			this.anInterface6_16.method4125(local164, local131, local131 * this.anInt10055);
			if ((this.anInt10050 & 0x7) == 0) {
				if (this.anIntArrayArrayArray19 == null) {
					this.aClass90_23 = this.aClass133_Sub1_19.method6154(new Class40[] { new Class40(new Class266[] { Static420.aClass266_1, Static420.aClass266_5 }), new Class40(Static420.aClass266_3) });
				} else {
					this.aClass90_23 = this.aClass133_Sub1_19.method6154(new Class40[] { new Class40(new Class266[] { Static420.aClass266_1, Static420.aClass266_5, Static420.aClass266_4 }), new Class40(Static420.aClass266_3) });
				}
			} else if (this.anIntArrayArrayArray19 == null) {
				this.aClass90_23 = this.aClass133_Sub1_19.method6154(new Class40[] { new Class40(new Class266[] { Static420.aClass266_1, Static420.aClass266_5, Static420.aClass266_2 }), new Class40(Static420.aClass266_3) });
			} else {
				this.aClass90_23 = this.aClass133_Sub1_19.method6154(new Class40[] { new Class40(new Class266[] { Static420.aClass266_1, Static420.aClass266_5, Static420.aClass266_4, Static420.aClass266_2 }), new Class40(Static420.aClass266_3) });
			}
			local1329 = 0;
			for (@Pc(1680) int local1680 = 0; local1680 < local107.length; local1680++) {
				if (local107[local1680].anInt6713 > 0) {
					local107[local1329++] = local107[local1680];
				}
			}
			this.aClass5_Sub39Array1 = new Class5_Sub39[local1329];
			@Pc(1706) long[] local1706 = new long[local1329];
			for (local1348 = 0; local1348 < local1329; local1348++) {
				@Pc(1714) Class5_Sub39 local1714 = local107[local1348];
				local1706[local1348] = local1714.aLong278;
				this.aClass5_Sub39Array1[local1348] = local1714;
				local1714.method5988(this.anInt10055);
			}
			Static619.method8812(local1706, this.aClass5_Sub39Array1);
			if (this.aClass358_2 != null) {
				this.aClass358_2.method8509();
			}
		} else {
			this.aClass358_2 = null;
		}
		this.anIntArrayArrayArray15 = null;
		this.anIntArrayArrayArray16 = null;
		this.anIntArrayArrayArray19 = null;
		this.aClass5_Sub39ArrayArrayArray1 = null;
		this.aByteArrayArray29 = null;
		this.aClass273_46 = null;
		this.anIntArrayArrayArray20 = null;
		this.anIntArrayArrayArray18 = this.anIntArrayArrayArray17 = null;
		this.aFloatArrayArray18 = this.aFloatArrayArray16 = this.aFloatArrayArray17 = null;
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(Lclient!vt;[I)V")
	@Override
	public void method8578(@OriginalArg(0) Class5_Sub11 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass330_60.method7917(new Class5_Sub4(this.aClass133_Sub1_19, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!vha", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class5_Sub5_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass358_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass133_Sub1_19.anInt6981 >> 8) >> this.aClass133_Sub1_19.anInt7012;
			@Pc(38) int local38 = arg3 - (this.aClass133_Sub1_19.anInt7017 * arg2 >> 8) >> this.aClass133_Sub1_19.anInt7012;
			this.aClass358_2.method8508(local38, arg0, local24);
		}
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method8576(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt10057 <= 0) {
			return;
		}
		@Pc(16) Interface14 local16 = this.aClass133_Sub1_19.method6155(this.anInt10054);
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = 32767;
		@Pc(22) int local22 = -32768;
		for (@Pc(24) int local24 = 0; local24 < 4; local24++) {
			local18 = 0;
			@Pc(33) Buffer local33 = local16.method6770();
			if (local33 != null) {
				@Pc(41) Stream local41 = this.aClass133_Sub1_19.method6242(local33);
				@Pc(45) int local45;
				@Pc(54) int local54;
				@Pc(56) int local56;
				@Pc(74) short[] local74;
				@Pc(78) int local78;
				@Pc(86) int local86;
				if (Stream.a()) {
					for (local45 = arg1; local45 < arg3; local45++) {
						local54 = arg0 + super.anInt10026 * local45;
						for (local56 = arg0; local56 < arg2; local56++) {
							if (arg4[local56 - arg0][local45 - arg1]) {
								local74 = this.aShortArrayArray39[local54];
								if (local74 != null) {
									for (local78 = 0; local78 < local74.length; local78++) {
										local86 = local74[local78] & 0xFFFF;
										local18++;
										if (local86 < local20) {
											local20 = local86;
										}
										local41.f(local86);
										if (local86 > local22) {
											local22 = local86;
										}
									}
								}
							}
							local54++;
						}
					}
				} else {
					for (local45 = arg1; local45 < arg3; local45++) {
						local54 = super.anInt10026 * local45 + arg0;
						for (local56 = arg0; local56 < arg2; local56++) {
							if (arg4[local56 - arg0][local45 - arg1]) {
								local74 = this.aShortArrayArray39[local54];
								if (local74 != null) {
									for (local78 = 0; local78 < local74.length; local78++) {
										local86 = local74[local78] & 0xFFFF;
										if (local20 > local86) {
											local20 = local86;
										}
										if (local22 < local86) {
											local22 = local86;
										}
										local18++;
										local41.e(local86);
									}
								}
							}
							local54++;
						}
					}
				}
				local41.b();
				if (local16.method6769()) {
					break;
				}
			}
		}
		if (local18 <= 0) {
			return;
		}
		this.aClass133_Sub1_19.method6179();
		this.aClass133_Sub1_19.method6162(false);
		this.aClass133_Sub1_19.method6252(false);
		this.aClass133_Sub1_19.method6178(false);
		this.aClass133_Sub1_19.method6259(false);
		this.aClass133_Sub1_19.method6208(0);
		this.aClass133_Sub1_19.method6277(false, -2, false);
		this.aClass133_Sub1_19.method6153(null);
		@Pc(274) Class113_Sub1 local274 = this.aClass133_Sub1_19.method6284();
		@Pc(279) float[] local279 = this.aClass133_Sub1_19.method6165();
		local279[2] = 0.0F;
		local279[6] = 0.0F;
		local279[1] = 0.0F;
		local279[11] = 0.0F;
		local279[15] = 1.0F;
		local279[0] = (float) 1024 / ((float) this.aClass133_Sub1_19.anInt6805 * (float) super.anInt10027 * 128.0F);
		local279[9] = 0.0F;
		local279[3] = 0.0F;
		local279[10] = 1.0F / (this.aFloat200 - this.aFloat199);
		local279[14] = -this.aFloat199 / (this.aFloat200 - this.aFloat199);
		local279[13] = 1.0F - ((float) (arg3 * 1024) / 128.0F + (float) 0) / (float) this.aClass133_Sub1_19.anInt6881;
		local279[4] = 0.0F;
		local279[8] = 0.0F;
		local279[7] = 0.0F;
		local279[5] = (float) 1024 / ((float) this.aClass133_Sub1_19.anInt6881 * (float) super.anInt10027 * 128.0F);
		local279[12] = -(((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass133_Sub1_19.anInt6805) - 1.0F;
		local274.method2476(0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
		this.aClass133_Sub1_19.method6255();
		this.aClass133_Sub1_19.method6204();
		if ((this.anInt10050 & 0x7) == 0) {
			this.aClass133_Sub1_19.method6252(false);
		} else {
			this.aClass133_Sub1_19.method6252(true);
			this.aClass133_Sub1_19.method6224();
		}
		this.aClass133_Sub1_19.method6260(false);
		this.aClass133_Sub1_19.method6215(this.anInterface6_16, 0);
		this.aClass133_Sub1_19.method6215(this.anInterface6_15, 1);
		this.aClass133_Sub1_19.method6217(this.aClass90_23);
		this.aClass133_Sub1_19.method6194(local18 / 3, local22 + 1 - local20, local20, local16, 0, Static68.aClass303_2);
		this.aClass133_Sub1_19.method6260(true);
	}

	@OriginalMember(owner = "client!vha", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class5_Sub5_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass358_2 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (this.aClass133_Sub1_19.anInt6981 * arg2 >> 8) >> this.aClass133_Sub1_19.anInt7012;
			@Pc(38) int local38 = arg3 - (arg2 * this.aClass133_Sub1_19.anInt7017 >> 8) >> this.aClass133_Sub1_19.anInt7012;
			this.aClass358_2.method8510(local23, local38, arg0);
		}
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(II)V")
	@Override
	public void method8577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!vha", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		@Pc(9) Interface3 local9 = this.aClass133_Sub1_19.anInterface3_12;
		if (arg3 != null && this.anIntArrayArrayArray16 == null) {
			this.anIntArrayArrayArray16 = new int[super.anInt10026][super.anInt10029][];
		}
		if (arg5 != null && this.anIntArrayArrayArray19 == null) {
			this.anIntArrayArrayArray19 = new int[super.anInt10026][super.anInt10029][];
		}
		this.anIntArrayArrayArray18[arg0][arg1] = arg2;
		this.anIntArrayArrayArray17[arg0][arg1] = arg4;
		this.anIntArrayArrayArray15[arg0][arg1] = arg6;
		this.anIntArrayArrayArray20[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray19 != null) {
			this.anIntArrayArrayArray19[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray16 != null) {
			this.anIntArrayArrayArray16[arg0][arg1] = arg3;
		}
		@Pc(92) Class5_Sub39[] local92 = this.aClass5_Sub39ArrayArrayArray1[arg0][arg1] = new Class5_Sub39[arg6.length];
		for (@Pc(94) int local94 = 0; local94 < arg6.length; local94++) {
			@Pc(100) int local100 = arg8[local94];
			@Pc(104) int local104 = arg9[local94];
			if ((this.anInt10050 & 0x20) != 0 && local100 != -1 && local9.method4656(local100).aBoolean291) {
				local104 = 128;
				local100 = -1;
			}
			@Pc(148) long local148 = (long) local100 | (long) (local104 << 14) | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28;
			@Pc(154) Class5 local154;
			for (local154 = this.aClass273_46.method6581(local148); local154 != null; local154 = this.aClass273_46.method6582()) {
				@Pc(159) Class5_Sub39 local159 = (Class5_Sub39) local154;
				if (local100 == local159.anInt6712 && (float) local104 == local159.aFloat114 && arg10 == local159.anInt6715 && local159.anInt6711 == arg11 && arg12 == local159.anInt6709) {
					break;
				}
			}
			if (local154 == null) {
				local92[local94] = new Class5_Sub39(this, local100, local104, arg10, arg11, arg12);
				this.aClass273_46.method6585(local148, local92[local94]);
			} else {
				local92[local94] = (Class5_Sub39) local154;
			}
		}
		if (arg13) {
			this.aByteArrayArray27[arg0][arg1] = (byte) (this.aByteArrayArray27[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt10058) {
			this.anInt10058 = arg6.length;
		}
		this.anInt10057 += arg6.length;
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method8581(@OriginalArg(0) Class5_Sub5_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass358_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (arg2 * this.aClass133_Sub1_19.anInt6981 >> 8) >> this.aClass133_Sub1_19.anInt7012;
			@Pc(40) int local40 = arg3 - (arg2 * this.aClass133_Sub1_19.anInt7017 >> 8) >> this.aClass133_Sub1_19.anInt7012;
			return this.aClass358_2.method8511(arg0, local25, local40);
		}
	}

	@OriginalMember(owner = "client!vha", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray29[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray29[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!vha", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class5_Sub5_Sub14 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub5_Sub14 arg2) {
		if ((this.aByteArrayArray27[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(21) int local21 = super.anInt10027 >> this.aClass133_Sub1_19.anInt7012;
		@Pc(24) Class5_Sub5_Sub14_Sub2 local24 = (Class5_Sub5_Sub14_Sub2) arg2;
		@Pc(40) Class5_Sub5_Sub14_Sub2 local40;
		if (local24 != null && local24.method7965(local21, local21)) {
			local40 = local24;
			local24.method7960();
		} else {
			local40 = new Class5_Sub5_Sub14_Sub2(this.aClass133_Sub1_19, local21, local21);
		}
		local40.method7962(local21, 0, local21, 0);
		this.method8591(arg1, arg0, local40);
		return local40;
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(B[[ZIIIIZI)V")
	private void method8590(@OriginalArg(1) boolean[][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6) {
		if (this.aClass5_Sub39Array1 == null) {
			return;
		}
		@Pc(11) int local11 = arg6 + arg6 + 1;
		@Pc(15) int local15 = local11 * local11;
		if (local15 > Static28.anIntArray13.length) {
			Static28.anIntArray13 = new int[local15];
		}
		@Pc(27) int local27 = arg3 - arg6;
		@Pc(29) int local29 = local27;
		if (local27 < 0) {
			local27 = 0;
		}
		@Pc(40) int local40 = arg2 - arg6;
		@Pc(42) int local42 = local40;
		if (local40 < 0) {
			local40 = 0;
		}
		@Pc(50) int local50 = arg6 + arg3;
		if (super.anInt10026 - 1 < local50) {
			local50 = super.anInt10026 - 1;
		}
		@Pc(69) int local69 = arg6 + arg2;
		Static87.anInt1747 = 0;
		if (local69 > super.anInt10029 - 1) {
			local69 = super.anInt10029 - 1;
		}
		for (@Pc(88) int local88 = local27; local88 <= local50; local88++) {
			@Pc(97) boolean[] local97 = arg0[local88 - local29];
			for (@Pc(99) int local99 = local40; local99 <= local69; local99++) {
				if (local97[local99 - local42]) {
					Static28.anIntArray13[Static87.anInt1747++] = local99 * super.anInt10026 + local88;
				}
			}
		}
		if (arg1 == -1) {
			this.aClass133_Sub1_19.method6221();
		} else {
			this.aClass133_Sub1_19.method6254((float) arg1);
			this.aClass133_Sub1_19.method6199();
		}
		this.aClass133_Sub1_19.method6285();
		this.aClass133_Sub1_19.method6252((this.anInt10050 & 0x7) != 0);
		this.aClass133_Sub1_19.method6277(false, -1, false);
		this.aClass133_Sub1_19.method6215(this.anInterface6_16, 0);
		for (@Pc(186) int local186 = 0; local186 < this.aClass5_Sub39Array1.length; local186++) {
			this.aClass5_Sub39Array1[local186].method5990(Static87.anInt1747, Static28.anIntArray13);
		}
		@Pc(207) Class113_Sub1 local207 = this.aClass133_Sub1_19.method6284();
		local207.method8458(0, -1, 0);
		this.aClass133_Sub1_19.method6204();
		if (!this.aClass330_60.method7918()) {
			@Pc(225) int local225 = this.aClass133_Sub1_19.anInt6997;
			@Pc(229) int local229 = this.aClass133_Sub1_19.anInt7003;
			this.aClass133_Sub1_19.L(0, local229, this.aClass133_Sub1_19.anInt7006);
			this.aClass133_Sub1_19.method6252(false);
			this.aClass133_Sub1_19.method6259(false);
			this.aClass133_Sub1_19.method6208(128);
			this.aClass133_Sub1_19.method6277(false, -2, false);
			this.aClass133_Sub1_19.method6153(this.aClass133_Sub1_19.anInterface8_3);
			this.aClass133_Sub1_19.method6239(Static524.aClass151_11, Static481.aClass151_8);
			this.aClass133_Sub1_19.method6211(Static105.aClass236_1, 0);
			this.aClass133_Sub1_19.method6159(0, Static273.aClass236_3);
			for (@Pc(291) Class5 local291 = this.aClass330_60.method7908(); local291 != null; local291 = this.aClass330_60.method7914()) {
				@Pc(296) Class5_Sub4 local296 = (Class5_Sub4) local291;
				local296.method296(arg3, arg2, arg6, arg0);
			}
			this.aClass133_Sub1_19.method6211(Static626.aClass236_6, 0);
			this.aClass133_Sub1_19.method6159(0, Static626.aClass236_6);
			this.aClass133_Sub1_19.method6153(null);
			this.aClass133_Sub1_19.L(local225, local229, this.aClass133_Sub1_19.anInt7006);
		}
		if (this.aClass358_2 != null) {
			this.aClass133_Sub1_19.method6215(this.anInterface6_16, 0);
			this.aClass133_Sub1_19.method6215(this.anInterface6_15, 1);
			this.aClass133_Sub1_19.method6217(this.aClass90_23);
			this.aClass358_2.method8514(arg2, arg6, arg0, arg3, arg5);
		}
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method8583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method8590(arg3, -1, arg1, arg0, arg5, arg4, arg2);
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(IZILclient!tj;)V")
	private void method8591(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5_Sub5_Sub14_Sub2 arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray18[arg1][arg0];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray17[arg1][arg0];
		@Pc(22) int local22 = local12.length;
		if (Static241.anIntArray221.length < local22) {
			Static607.anIntArray518 = new int[local22];
			Static241.anIntArray221 = new int[local22];
		}
		for (@Pc(47) int local47 = 0; local47 < local22; local47++) {
			Static241.anIntArray221[local47] = local12[local47] >> this.aClass133_Sub1_19.anInt7012;
			Static607.anIntArray518[local47] = local19[local47] >> this.aClass133_Sub1_19.anInt7012;
		}
		@Pc(75) int local75 = 0;
		while (local75 < local22) {
			@Pc(81) int local81 = Static241.anIntArray221[local75];
			@Pc(86) int local86 = Static607.anIntArray518[local75++];
			@Pc(90) int local90 = Static241.anIntArray221[local75];
			@Pc(95) int local95 = Static607.anIntArray518[local75++];
			@Pc(99) int local99 = Static241.anIntArray221[local75];
			@Pc(104) int local104 = Static607.anIntArray518[local75++];
			if ((local95 - local104) * (local81 - local90) - (local95 - local86) * (local99 - local90) > 0) {
				arg2.method7964(local99, local86, local104, local95, local90, local81);
			}
		}
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method8586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method8590(arg3, arg5, arg1, arg0, arg6, arg4, arg2);
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method8585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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
}
