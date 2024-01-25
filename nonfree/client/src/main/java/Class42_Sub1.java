import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cea")
public final class Class42_Sub1 extends Class42 {

	@OriginalMember(owner = "client!cea", name = "r", descriptor = "I")
	private int anInt1387;

	@OriginalMember(owner = "client!cea", name = "D", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!cea", name = "P", descriptor = "I")
	private int anInt1402;

	@OriginalMember(owner = "client!cea", name = "X", descriptor = "Lclient!sf;")
	public Class327 aClass327_3;

	@OriginalMember(owner = "client!cea", name = "Y", descriptor = "[Lclient!wda;")
	private Class4_Sub52[] aClass4_Sub52Array1;

	@OriginalMember(owner = "client!cea", name = "bb", descriptor = "Lclient!sf;")
	private Class327 aClass327_4;

	@OriginalMember(owner = "client!cea", name = "db", descriptor = "I")
	private int anInt1407;

	@OriginalMember(owner = "client!cea", name = "eb", descriptor = "Lclient!en;")
	private Interface11 anInterface11_2;

	@OriginalMember(owner = "client!cea", name = "gb", descriptor = "Lclient!sf;")
	public Class327 aClass327_5;

	@OriginalMember(owner = "client!cea", name = "hb", descriptor = "I")
	private int anInt1408;

	@OriginalMember(owner = "client!cea", name = "jb", descriptor = "Lclient!sf;")
	public Class327 aClass327_6;

	@OriginalMember(owner = "client!cea", name = "G", descriptor = "Lclient!ifa;")
	private final Class163 aClass163_12 = new Class163();

	@OriginalMember(owner = "client!cea", name = "M", descriptor = "Lclient!pc;")
	public final Class33_Sub3 aClass33_Sub3_3;

	@OriginalMember(owner = "client!cea", name = "V", descriptor = "I")
	private final int anInt1406;

	@OriginalMember(owner = "client!cea", name = "ab", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!cea", name = "m", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!cea", name = "fb", descriptor = "[[B")
	private byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!cea", name = "W", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!cea", name = "z", descriptor = "I")
	private final int anInt1392;

	@OriginalMember(owner = "client!cea", name = "cb", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!cea", name = "A", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!cea", name = "o", descriptor = "[[S")
	public final short[][] aShortArrayArray5;

	@OriginalMember(owner = "client!cea", name = "L", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!cea", name = "x", descriptor = "[[[Lclient!wda;")
	private Class4_Sub52[][][] aClass4_Sub52ArrayArrayArray1;

	@OriginalMember(owner = "client!cea", name = "w", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!cea", name = "R", descriptor = "[[B")
	private final byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!cea", name = "J", descriptor = "I")
	public final int anInt1398;

	@OriginalMember(owner = "client!cea", name = "Z", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!cea", name = "ib", descriptor = "Lclient!dj;")
	private Class66 aClass66_8;

	@OriginalMember(owner = "client!cea", name = "t", descriptor = "Lclient!mj;")
	private Class233 aClass233_1;

	@OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(Lclient!pc;IIII[[I[[II)V")
	public Class42_Sub1(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass33_Sub3_3 = arg0;
		this.anInt1406 = super.anInt8635 - 2;
		this.aFloatArrayArray6 = new float[super.anInt8638 + 1][super.anInt8630 + 1];
		this.anIntArrayArrayArray1 = new int[arg3][arg4][];
		this.aByteArrayArray5 = new byte[arg3 + 1][arg4 + 1];
		this.anIntArrayArrayArray6 = new int[arg3][arg4][];
		this.anInt1392 = 0x1 << this.anInt1406;
		this.aFloatArrayArray7 = new float[super.anInt8638 + 1][super.anInt8630 + 1];
		this.anIntArrayArrayArray3 = new int[arg3][arg4][];
		this.aShortArrayArray5 = new short[arg3 * arg4][];
		this.anIntArrayArrayArray5 = new int[arg3][arg4][];
		this.aClass4_Sub52ArrayArrayArray1 = new Class4_Sub52[arg3][arg4][];
		this.anIntArrayArrayArray2 = new int[arg3][arg4][];
		this.aByteArrayArray4 = new byte[arg3][arg4];
		this.anInt1398 = arg2;
		this.aFloatArrayArray5 = new float[super.anInt8638 + 1][super.anInt8630 + 1];
		for (@Pc(115) int local115 = 1; super.anInt8630 > local115; local115++) {
			for (@Pc(119) int local119 = 1; super.anInt8638 > local119; local119++) {
				@Pc(138) int local138 = arg6[local119 + 1][local115] - arg6[local119 - 1][local115];
				@Pc(155) int local155 = arg6[local119][local115 + 1] - arg6[local119][local115 - 1];
				@Pc(175) float local175 = (float) (1.0D / Math.sqrt((double) (arg7 * 4 * arg7 + local138 * local138 + local155 * local155)));
				this.aFloatArrayArray6[local119][local115] = local175 * (float) local138;
				this.aFloatArrayArray5[local119][local115] = local175 * (float) (-arg7 * 2);
				this.aFloatArrayArray7[local119][local115] = local175 * (float) local155;
			}
		}
		this.aClass66_8 = new Class66(128);
		if ((this.anInt1398 & 0x10) != 0) {
			this.aClass233_1 = new Class233(this.aClass33_Sub3_3, this);
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method7455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method1420(arg4, arg0, arg3, arg1, -1, arg5, arg2);
	}

	@OriginalMember(owner = "client!cea", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.anInt1407 > 0) {
			@Pc(17) byte[][] local17 = new byte[super.anInt8638 + 1][super.anInt8630 + 1];
			@Pc(23) int local23;
			for (@Pc(19) int local19 = 1; local19 < super.anInt8638; local19++) {
				for (local23 = 1; local23 < super.anInt8630; local23++) {
					local17[local19][local23] = (byte) ((this.aByteArrayArray5[local19][local23] >> 1) + (this.aByteArrayArray5[local19][local23 - 1] >> 2) + (this.aByteArrayArray5[local19 + -1][local23] >> 2) + (this.aByteArrayArray5[local19 + 1][local23] >> 3) + (this.aByteArrayArray5[local19][local23 + 1] >> 3));
				}
			}
			this.aClass4_Sub52Array1 = new Class4_Sub52[this.aClass66_8.method1990()];
			this.aClass66_8.method1986(this.aClass4_Sub52Array1);
			for (local23 = 0; local23 < this.aClass4_Sub52Array1.length; local23++) {
				this.aClass4_Sub52Array1[local23].method8756(this.anInt1407);
			}
			@Pc(127) int local127 = 24;
			if (this.anIntArrayArrayArray4 != null) {
				local127 += 4;
			}
			if ((this.anInt1398 & 0x7) != 0) {
				local127 += 12;
			}
			@Pc(150) NativeHeapBuffer local150 = this.aClass33_Sub3_3.aNativeHeap4.a(local127 * this.anInt1407, false);
			@Pc(155) Stream local155 = new Stream(local150);
			@Pc(159) Class4_Sub52[] local159 = new Class4_Sub52[this.anInt1407];
			@Pc(166) int local166 = Static125.method2245(this.anInt1407 / 4);
			if (local166 < 1) {
				local166 = 1;
			}
			@Pc(176) Class66 local176 = new Class66(local166);
			@Pc(180) Class4_Sub52[] local180 = new Class4_Sub52[this.anInt1408];
			@Pc(186) int local186;
			for (@Pc(182) int local182 = 0; super.anInt8638 > local182; local182++) {
				for (local186 = 0; super.anInt8630 > local186; local186++) {
					if (this.anIntArrayArrayArray2[local182][local186] != null) {
						@Pc(202) Class4_Sub52[] local202 = this.aClass4_Sub52ArrayArrayArray1[local182][local186];
						@Pc(209) int[] local209 = this.anIntArrayArrayArray3[local182][local186];
						@Pc(216) int[] local216 = this.anIntArrayArrayArray5[local182][local186];
						@Pc(223) int[] local223 = this.anIntArrayArrayArray1[local182][local186];
						@Pc(230) int[] local230 = this.anIntArrayArrayArray2[local182][local186];
						@Pc(242) int[] local242 = this.anIntArrayArrayArray6 == null ? null : this.anIntArrayArrayArray6[local182][local186];
						if (local223 == null) {
							local223 = local230;
						}
						@Pc(258) int[] local258 = this.anIntArrayArrayArray4 == null ? null : this.anIntArrayArrayArray4[local182][local186];
						@Pc(265) float local265 = this.aFloatArrayArray6[local182][local186];
						@Pc(272) float local272 = this.aFloatArrayArray5[local182][local186];
						@Pc(279) float local279 = this.aFloatArrayArray7[local182][local186];
						@Pc(288) float local288 = this.aFloatArrayArray6[local182][local186 + 1];
						@Pc(297) float local297 = this.aFloatArrayArray5[local182][local186 + 1];
						@Pc(306) float local306 = this.aFloatArrayArray7[local182][local186 + 1];
						@Pc(317) float local317 = this.aFloatArrayArray6[local182 + 1][local186 + 1];
						@Pc(328) float local328 = this.aFloatArrayArray5[local182 + 1][local186 + 1];
						@Pc(339) float local339 = this.aFloatArrayArray7[local182 + 1][local186 + 1];
						@Pc(348) float local348 = this.aFloatArrayArray6[local182 + 1][local186];
						@Pc(357) float local357 = this.aFloatArrayArray5[local182 + 1][local186];
						@Pc(366) float local366 = this.aFloatArrayArray7[local182 + 1][local186];
						@Pc(374) int local374 = local17[local182][local186] & 0xFF;
						@Pc(384) int local384 = local17[local182][local186 + 1] & 0xFF;
						@Pc(396) int local396 = local17[local182 + 1][local186 + 1] & 0xFF;
						@Pc(406) int local406 = local17[local182 + 1][local186] & 0xFF;
						@Pc(408) int local408 = 0;
						@Pc(418) int local418;
						label337: for (@Pc(410) int local410 = 0; local410 < local230.length; local410++) {
							@Pc(416) Class4_Sub52 local416 = local202[local410];
							for (local418 = 0; local418 < local408; local418++) {
								if (local416 == local180[local418]) {
									continue label337;
								}
							}
							local180[local408++] = local416;
						}
						@Pc(459) short[] local459 = this.aShortArrayArray5[local182 + super.anInt8638 * local186] = new short[local230.length];
						for (local418 = 0; local418 < local230.length; local418++) {
							@Pc(473) int local473 = (local182 << super.anInt8635) + local209[local418];
							@Pc(482) int local482 = (local186 << super.anInt8635) + local216[local418];
							@Pc(487) int local487 = local473 >> this.anInt1406;
							@Pc(492) int local492 = local482 >> this.anInt1406;
							@Pc(496) int local496 = local230[local418];
							@Pc(500) int local500 = local223[local418];
							@Pc(508) int local508 = local242 == null ? 0 : local242[local418];
							@Pc(526) long local526 = (long) (local487 << 16) | (long) local496 << 32 | (long) local500 << 48 | (long) local492;
							@Pc(530) int local530 = local209[local418];
							@Pc(534) int local534 = local216[local418];
							@Pc(536) byte local536 = 74;
							@Pc(538) int local538 = 0;
							@Pc(540) float local540 = 1.0F;
							@Pc(552) float local552;
							@Pc(554) float local554;
							@Pc(546) float local546;
							@Pc(654) float local654;
							@Pc(550) int local550;
							if (local530 == 0 && local534 == 0) {
								local546 = local279;
								local550 = local536 - local374;
								local552 = local265;
								local554 = local272;
							} else if (local530 == 0 && local534 == super.anInt8631) {
								local550 = local536 - local384;
								local552 = local288;
								local554 = local297;
								local546 = local306;
							} else if (super.anInt8631 == local530 && local534 == super.anInt8631) {
								local552 = local317;
								local546 = local339;
								local550 = local536 - local396;
								local554 = local328;
							} else if (super.anInt8631 == local530 && local534 == 0) {
								local546 = local366;
								local554 = local357;
								local550 = local536 - local406;
								local552 = local348;
							} else {
								@Pc(629) float local629 = (float) local530 / (float) super.anInt8631;
								@Pc(636) float local636 = (float) local534 / (float) super.anInt8631;
								@Pc(645) float local645 = local265 + (local348 - local265) * local629;
								local654 = local629 * (local357 - local272) + local272;
								@Pc(662) float local662 = (local366 - local279) * local629 + local279;
								@Pc(671) float local671 = (local317 - local288) * local629 + local288;
								@Pc(679) float local679 = (local328 - local297) * local629 + local297;
								@Pc(687) float local687 = (local339 - local306) * local629 + local306;
								local554 = local654 + (local679 - local654) * local636;
								local552 = local645 + (local671 - local645) * local636;
								local546 = local636 * (local687 - local662) + local662;
								@Pc(723) int local723 = local374 + (local530 * (local406 - local374) >> super.anInt8635);
								@Pc(735) int local735 = (local530 * (local396 - local384) >> super.anInt8635) + local384;
								local550 = local536 - local723 - (local534 * (local735 - local723) >> super.anInt8635);
							}
							if (local496 != -1) {
								@Pc(761) int local761 = local550 * (local496 & 0x7F) >> 7;
								if (local761 < 2) {
									local761 = 2;
								} else if (local761 > 126) {
									local761 = 126;
								}
								if ((this.anInt1398 & 0x7) == 0) {
									local540 = this.aClass33_Sub3_3.aFloatArray54[2] * local546 + local552 * this.aClass33_Sub3_3.aFloatArray54[0] + local554 * this.aClass33_Sub3_3.aFloatArray54[1];
									local540 = this.aClass33_Sub3_3.aFloat176 + local540 * (local540 > 0.0F ? this.aClass33_Sub3_3.aFloat174 : this.aClass33_Sub3_3.aFloat166);
								}
								local538 = Static411.anIntArray448[local761 | local496 & 0xFF80];
							}
							@Pc(832) Class4 local832 = null;
							if ((local473 & this.anInt1392 - 1) == 0 && (local482 & this.anInt1392 - 1) == 0) {
								local832 = local176.method1994(local526);
							}
							@Pc(865) int local865;
							@Pc(896) int local896;
							if (local832 == null) {
								if (local496 == local500) {
									local896 = local538;
								} else {
									@Pc(906) int local906 = (local500 & 0x7F) * local550 >> 7;
									if (local906 < 2) {
										local906 = 2;
									} else if (local906 > 126) {
										local906 = 126;
									}
									local896 = Static411.anIntArray448[local500 & 0xFF80 | local906];
									if ((this.anInt1398 & 0x7) == 0) {
										local654 = local552 * this.aClass33_Sub3_3.aFloatArray54[0] + this.aClass33_Sub3_3.aFloatArray54[1] * local554 + local546 * this.aClass33_Sub3_3.aFloatArray54[2];
										local654 = this.aClass33_Sub3_3.aFloat176 + (local540 > 0.0F ? this.aClass33_Sub3_3.aFloat174 : this.aClass33_Sub3_3.aFloat166) * local540;
										@Pc(984) int local984 = local896 >> 16 & 0xFF;
										@Pc(990) int local990 = local896 >> 8 & 0xFF;
										@Pc(994) int local994 = local896 & 0xFF;
										local984 = (int) ((float) local984 * local654);
										if (local984 < 0) {
											local984 = 0;
										} else if (local984 > 255) {
											local984 = 255;
										}
										local990 = (int) ((float) local990 * local654);
										local994 = (int) ((float) local994 * local654);
										if (local990 < 0) {
											local990 = 0;
										} else if (local990 > 255) {
											local990 = 255;
										}
										if (local994 < 0) {
											local994 = 0;
										} else if (local994 > 255) {
											local994 = 255;
										}
										local896 = local994 | local990 << 8 | local984 << 16;
									}
								}
								if (this.aClass33_Sub3_3.aBoolean555) {
									local155.a((float) local473);
									local155.a((float) (local508 + this.method7453(local473, local482)));
									local155.a((float) local482);
									local155.a((byte) (local896 >> 16));
									local155.a((byte) (local896 >> 8));
									local155.a((byte) local896);
									local155.a(-1);
									local155.a((float) local473);
									local155.a((float) local482);
									if (this.anIntArrayArrayArray4 != null) {
										local155.a((float) (local258 == null ? 0 : local258[local418] - 1));
									}
									if ((this.anInt1398 & 0x7) != 0) {
										local155.a(local552);
										local155.a(local554);
										local155.a(local546);
									}
								} else {
									local155.b((float) local473);
									local155.b((float) (local508 + this.method7453(local473, local482)));
									local155.b((float) local482);
									local155.a((byte) (local896 >> 16));
									local155.a((byte) (local896 >> 8));
									local155.a((byte) local896);
									local155.a(-1);
									local155.b((float) local473);
									local155.b((float) local482);
									if (this.anIntArrayArrayArray4 != null) {
										local155.b((float) (local258 == null ? 0 : local258[local418] - 1));
									}
									if ((this.anInt1398 & 0x7) != 0) {
										local155.b(local552);
										local155.b(local554);
										local155.b(local546);
									}
								}
								local865 = this.anInt1402++;
								local459[local418] = (short) local865;
								if (local496 != -1) {
									local159[local865] = local202[local418];
								}
								local176.method1985(new Class4_Sub36(local459[local418]), local526);
							} else {
								local459[local418] = ((Class4_Sub36) local832).aShort90;
								local865 = local459[local418] & 0xFFFF;
								if (local496 != -1 && local202[local418].aLong307 < local159[local865].aLong307) {
									local159[local865] = local202[local418];
								}
							}
							for (local896 = 0; local896 < local408; local896++) {
								local180[local896].method8752(local550, local538, local865, local540);
							}
							this.anInt1387++;
						}
					}
				}
			}
			for (local186 = 0; local186 < this.anInt1402; local186++) {
				@Pc(1302) Class4_Sub52 local1302 = local159[local186];
				if (local1302 != null) {
					local1302.method8755(local186);
				}
			}
			@Pc(1340) int local1340;
			for (@Pc(1319) int local1319 = 0; local1319 < super.anInt8638; local1319++) {
				for (@Pc(1323) int local1323 = 0; super.anInt8630 > local1323; local1323++) {
					@Pc(1336) short[] local1336 = this.aShortArrayArray5[super.anInt8638 * local1323 + local1319];
					if (local1336 != null) {
						local1340 = 0;
						@Pc(1342) int local1342 = 0;
						while (local1342 < local1336.length) {
							@Pc(1351) int local1351 = local1336[local1342++] & 0xFFFF;
							@Pc(1358) int local1358 = local1336[local1342++] & 0xFFFF;
							@Pc(1365) int local1365 = local1336[local1342++] & 0xFFFF;
							@Pc(1369) Class4_Sub52 local1369 = local159[local1351];
							@Pc(1373) Class4_Sub52 local1373 = local159[local1358];
							@Pc(1377) Class4_Sub52 local1377 = local159[local1365];
							@Pc(1379) Class4_Sub52 local1379 = null;
							if (local1369 != null) {
								local1379 = local1369;
								local1369.method8757(local1340, local1323, local1319);
							}
							if (local1373 != null) {
								local1373.method8757(local1340, local1323, local1319);
								if (local1379 == null || local1373.aLong307 < local1379.aLong307) {
									local1379 = local1373;
								}
							}
							if (local1377 != null) {
								local1377.method8757(local1340, local1323, local1319);
								if (local1379 == null || local1379.aLong307 > local1377.aLong307) {
									local1379 = local1377;
								}
							}
							if (local1379 != null) {
								if (local1369 != null) {
									local1379.method8755(local1351);
								}
								if (local1373 != null) {
									local1379.method8755(local1358);
								}
								if (local1377 != null) {
									local1379.method8755(local1365);
								}
								local1379.method8757(local1340, local1323, local1319);
							}
							local1340++;
						}
					}
				}
			}
			local155.c();
			this.anInterface11_2 = this.aClass33_Sub3_3.method6330(local150, local127, local155.a());
			this.aClass327_5 = new Class327(this.anInterface11_2, 5126, 3, 0);
			this.aClass327_4 = new Class327(this.anInterface11_2, 5121, 4, 12);
			@Pc(1516) byte local1516;
			if (this.anIntArrayArrayArray4 == null) {
				this.aClass327_3 = new Class327(this.anInterface11_2, 5126, 2, 16);
				local1516 = 24;
			} else {
				local1516 = 28;
				this.aClass327_3 = new Class327(this.anInterface11_2, 5126, 3, 16);
			}
			if ((this.anInt1398 & 0x7) != 0) {
				this.aClass327_6 = new Class327(this.anInterface11_2, 5126, 3, local1516);
			}
			@Pc(1563) long[] local1563 = new long[this.aClass4_Sub52Array1.length];
			for (local1340 = 0; local1340 < this.aClass4_Sub52Array1.length; local1340++) {
				@Pc(1572) Class4_Sub52 local1572 = this.aClass4_Sub52Array1[local1340];
				local1563[local1340] = local1572.aLong307;
				local1572.method8751(this.anInt1402);
			}
			Static87.method1774(local1563, this.aClass4_Sub52Array1);
			if (this.aClass233_1 != null) {
				this.aClass233_1.method4937();
			}
		} else {
			this.aClass233_1 = null;
		}
		this.aClass66_8 = null;
		this.anIntArrayArrayArray2 = null;
		this.anIntArrayArrayArray4 = null;
		this.anIntArrayArrayArray3 = this.anIntArrayArrayArray5 = null;
		this.anIntArrayArrayArray1 = null;
		this.aClass4_Sub52ArrayArrayArray1 = null;
		this.aByteArrayArray5 = null;
		this.aFloatArrayArray6 = this.aFloatArrayArray5 = this.aFloatArrayArray7 = null;
		this.anIntArrayArrayArray6 = null;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method7456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method1420(arg4, arg0, arg3, arg1, arg5, arg6, arg2);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(II)V")
	@Override
	public void method7449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(ZI[[ZIIIII)V")
	private void method1420(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (this.aClass4_Sub52Array1 == null) {
			return;
		}
		@Pc(19) int local19 = arg6 + arg6 + 1;
		@Pc(23) int local23 = local19 * local19;
		if (this.aClass33_Sub3_3.anIntArray490.length < local23) {
			this.aClass33_Sub3_3.anIntArray490 = new int[local23];
		}
		if (this.anInt1387 * 2 > this.aClass33_Sub3_3.aClass4_Sub11_Sub2_3.aByteArray107.length) {
			this.aClass33_Sub3_3.aClass4_Sub11_Sub2_3 = new Class4_Sub11_Sub2(this.anInt1387 * 2);
		}
		@Pc(62) int local62 = arg1 - arg6;
		@Pc(64) int local64 = local62;
		if (local62 < 0) {
			local62 = 0;
		}
		@Pc(75) int local75 = arg3 - arg6;
		@Pc(77) int local77 = local75;
		if (local75 < 0) {
			local75 = 0;
		}
		@Pc(88) int local88 = arg1 + arg6;
		if (local88 > super.anInt8638 - 1) {
			local88 = super.anInt8638 - 1;
		}
		@Pc(107) int local107 = arg3 + arg6;
		if (super.anInt8630 - 1 < local107) {
			local107 = super.anInt8630 - 1;
		}
		@Pc(120) int local120 = 0;
		@Pc(124) int[] local124 = this.aClass33_Sub3_3.anIntArray490;
		@Pc(137) int local137;
		for (@Pc(126) int local126 = local62; local126 <= local88; local126++) {
			@Pc(135) boolean[] local135 = arg2[local126 - local64];
			for (local137 = local75; local137 <= local107; local137++) {
				if (local135[local137 - local77]) {
					local124[local120++] = local126 + local137 * super.anInt8638;
				}
			}
		}
		if (arg4 == -1) {
			this.aClass33_Sub3_3.method6346();
		} else {
			this.aClass33_Sub3_3.method6362((float) arg4);
			this.aClass33_Sub3_3.method6338();
		}
		this.aClass33_Sub3_3.method6296((this.anInt1398 & 0x7) != 0);
		for (@Pc(208) int local208 = 0; local208 < this.aClass4_Sub52Array1.length; local208++) {
			this.aClass4_Sub52Array1[local208].method8754(local120, local124);
		}
		if (!this.aClass163_12.method3638()) {
			local137 = this.aClass33_Sub3_3.anInt7301;
			@Pc(237) int local237 = this.aClass33_Sub3_3.anInt7305;
			this.aClass33_Sub3_3.L(0, local237, this.aClass33_Sub3_3.anInt7291);
			this.aClass33_Sub3_3.method6296(false);
			this.aClass33_Sub3_3.method6312(false);
			this.aClass33_Sub3_3.method6292(128);
			this.aClass33_Sub3_3.method6305(-2);
			this.aClass33_Sub3_3.method6340(this.aClass33_Sub3_3.aClass116_Sub2_5);
			this.aClass33_Sub3_3.method6365(7681, 8448);
			this.aClass33_Sub3_3.method6307(34166, 0, 770);
			this.aClass33_Sub3_3.method6335(0, 34167);
			for (@Pc(297) Class4 local297 = this.aClass163_12.method3639(); local297 != null; local297 = this.aClass163_12.method3640()) {
				@Pc(302) Class4_Sub8 local302 = (Class4_Sub8) local297;
				local302.method746(arg2, arg3, arg6, arg1);
			}
			this.aClass33_Sub3_3.method6307(5890, 0, 768);
			this.aClass33_Sub3_3.method6335(0, 5890);
			this.aClass33_Sub3_3.method6340((Class116) null);
			this.aClass33_Sub3_3.L(local137, local237, this.aClass33_Sub3_3.anInt7291);
		}
		if (this.aClass233_1 == null) {
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		this.aClass33_Sub3_3.method6339(this.aClass327_3, this.aClass327_5, (Class327) null, (Class327) null);
		this.aClass233_1.method4936(arg3, arg6, arg1, arg2, arg0);
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method7448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(IIILclient!nfa;)V")
	private void method1422(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class4_Sub5_Sub9_Sub2 arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray3[arg0][arg1];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray5[arg0][arg1];
		@Pc(22) int local22 = local12.length;
		if (local22 > this.aClass33_Sub3_3.anIntArray489.length) {
			this.aClass33_Sub3_3.anIntArray491 = new int[local22];
			this.aClass33_Sub3_3.anIntArray489 = new int[local22];
		}
		@Pc(42) int[] local42 = this.aClass33_Sub3_3.anIntArray489;
		@Pc(46) int[] local46 = this.aClass33_Sub3_3.anIntArray491;
		for (@Pc(48) int local48 = 0; local48 < local22; local48++) {
			local42[local48] = local12[local48] >> this.aClass33_Sub3_3.anInt7265;
			local46[local48] = local19[local48] >> this.aClass33_Sub3_3.anInt7265;
		}
		@Pc(88) int local88 = 0;
		while (local88 < local22) {
			@Pc(94) int local94 = local42[local88];
			@Pc(99) int local99 = local46[local88++];
			@Pc(103) int local103 = local42[local88];
			@Pc(108) int local108 = local46[local88++];
			@Pc(112) int local112 = local42[local88];
			@Pc(117) int local117 = local46[local88++];
			if (-((local112 - local103) * (local108 + -local99)) + (local94 - local103) * (local108 + -local117) > 0) {
				arg2.method5116(local108, local112, local99, local103, local117, local94);
			}
		}
	}

	@OriginalMember(owner = "client!cea", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class4_Sub5_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass233_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass33_Sub3_3.anInt7282 >> 8) >> this.aClass33_Sub3_3.anInt7265;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass33_Sub3_3.anInt7283 >> 8) >> this.aClass33_Sub3_3.anInt7265;
			this.aClass233_1.method4934(local39, arg0, local24);
		}
	}

	@OriginalMember(owner = "client!cea", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class4_Sub5_Sub9 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub5_Sub9 arg2) {
		if ((this.aByteArrayArray4[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(21) int local21 = super.anInt8631 >> this.aClass33_Sub3_3.anInt7265;
		@Pc(24) Class4_Sub5_Sub9_Sub2 local24 = (Class4_Sub5_Sub9_Sub2) arg2;
		@Pc(34) Class4_Sub5_Sub9_Sub2 local34;
		if (local24 != null && local24.method5118(local21, local21)) {
			local34 = local24;
			local24.method5117();
		} else {
			local34 = new Class4_Sub5_Sub9_Sub2(this.aClass33_Sub3_3, local21, local21);
		}
		local34.method5115(local21, 0, local21, 0);
		this.method1422(arg0, arg1, local34);
		return local34;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lclient!kp;[I)V")
	@Override
	public void method7451(@OriginalArg(0) Class4_Sub29 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass163_12.method3646(new Class4_Sub8(this.aClass33_Sub3_3, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!cea", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class4_Sub5_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass233_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass33_Sub3_3.anInt7282 * arg2 >> 8) >> this.aClass33_Sub3_3.anInt7265;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass33_Sub3_3.anInt7283 >> 8) >> this.aClass33_Sub3_3.anInt7265;
			this.aClass233_1.method4943(arg0, local24, local39);
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method7461(@OriginalArg(0) Class4_Sub5_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass233_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (arg2 * this.aClass33_Sub3_3.anInt7282 >> 8) >> this.aClass33_Sub3_3.anInt7265;
			@Pc(40) int local40 = arg3 - (arg2 * this.aClass33_Sub3_3.anInt7283 >> 8) >> this.aClass33_Sub3_3.anInt7265;
			return this.aClass233_1.method4941(local40, local25, arg0);
		}
	}

	@OriginalMember(owner = "client!cea", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray4 == null) {
			this.anIntArrayArrayArray4 = new int[super.anInt8638][super.anInt8630][];
		}
		if (arg3 != null && this.anIntArrayArrayArray6 == null) {
			this.anIntArrayArrayArray6 = new int[super.anInt8638][super.anInt8630][];
		}
		@Pc(33) Interface9 local33 = this.aClass33_Sub3_3.anInterface9_12;
		this.anIntArrayArrayArray3[arg0][arg1] = arg2;
		this.anIntArrayArrayArray5[arg0][arg1] = arg4;
		this.anIntArrayArrayArray2[arg0][arg1] = arg6;
		this.anIntArrayArrayArray1[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray4 != null) {
			this.anIntArrayArrayArray4[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray6 != null) {
			this.anIntArrayArrayArray6[arg0][arg1] = arg3;
		}
		@Pc(92) Class4_Sub52[] local92 = this.aClass4_Sub52ArrayArrayArray1[arg0][arg1] = new Class4_Sub52[arg6.length];
		for (@Pc(94) int local94 = 0; local94 < arg6.length; local94++) {
			@Pc(100) int local100 = arg8[local94];
			@Pc(104) int local104 = arg9[local94];
			if ((this.anInt1398 & 0x20) != 0 && local100 != -1 && local33.method1558(local100).aBoolean241) {
				local100 = -1;
				local104 = 128;
			}
			@Pc(146) long local146 = (long) local100 | (long) (local104 << 14) | (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48;
			@Pc(152) Class4 local152;
			for (local152 = this.aClass66_8.method1994(local146); local152 != null; local152 = this.aClass66_8.method1991()) {
				@Pc(157) Class4_Sub52 local157 = (Class4_Sub52) local152;
				if (local100 == local157.anInt10365 && local157.aFloat235 == (float) local104 && local157.anInt10364 == arg10 && local157.anInt10360 == arg11 && arg12 == local157.anInt10359) {
					break;
				}
			}
			if (local152 == null) {
				local92[local94] = new Class4_Sub52(this, local100, local104, arg10, arg11, arg12);
				this.aClass66_8.method1985(local92[local94], local146);
			} else {
				local92[local94] = (Class4_Sub52) local152;
			}
		}
		if (arg13) {
			this.aByteArrayArray4[arg0][arg1] = (byte) (this.aByteArrayArray4[arg0][arg1] | 0x1);
		}
		if (this.anInt1408 < arg6.length) {
			this.anInt1408 = arg6.length;
		}
		this.anInt1407 += arg6.length;
	}

	@OriginalMember(owner = "client!cea", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.aByteArrayArray5[arg0][arg1] & 0xFF) < arg2) {
			this.aByteArrayArray5[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7454(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt1407 <= 0) {
			return;
		}
		this.aClass33_Sub3_3.method6316();
		this.aClass33_Sub3_3.method6317(false);
		this.aClass33_Sub3_3.method6296(false);
		this.aClass33_Sub3_3.method6310(false);
		this.aClass33_Sub3_3.method6312(false);
		this.aClass33_Sub3_3.method6292(0);
		this.aClass33_Sub3_3.method6305(-2);
		this.aClass33_Sub3_3.method6340((Class116) null);
		Static347.aFloatArray27[15] = 1.0F;
		Static347.aFloatArray27[4] = 0.0F;
		Static347.aFloatArray27[9] = 0.0F;
		Static347.aFloatArray27[6] = 0.0F;
		Static347.aFloatArray27[2] = 0.0F;
		Static347.aFloatArray27[1] = 0.0F;
		Static347.aFloatArray27[14] = 0.0F;
		Static347.aFloatArray27[11] = 0.0F;
		Static347.aFloatArray27[5] = (float) 1024 / ((float) super.anInt8631 * 128.0F * (float) this.aClass33_Sub3_3.anInt7088);
		Static347.aFloatArray27[3] = 0.0F;
		Static347.aFloatArray27[10] = 0.0F;
		Static347.aFloatArray27[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass33_Sub3_3.anInt7088;
		Static347.aFloatArray27[12] = -(((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass33_Sub3_3.anInt7157) - 1.0F;
		Static347.aFloatArray27[7] = 0.0F;
		Static347.aFloatArray27[8] = 0.0F;
		Static347.aFloatArray27[0] = (float) 1024 / ((float) this.aClass33_Sub3_3.anInt7157 * (float) super.anInt8631 * 128.0F);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static347.aFloatArray27, 0);
		Static347.aFloatArray27[10] = 0.0F;
		Static347.aFloatArray27[15] = 1.0F;
		Static347.aFloatArray27[5] = 0.0F;
		Static347.aFloatArray27[13] = 0.0F;
		Static347.aFloatArray27[12] = 0.0F;
		Static347.aFloatArray27[9] = 1.0F;
		Static347.aFloatArray27[1] = 0.0F;
		Static347.aFloatArray27[4] = 0.0F;
		Static347.aFloatArray27[8] = 0.0F;
		Static347.aFloatArray27[6] = 1.0F;
		Static347.aFloatArray27[0] = 1.0F;
		Static347.aFloatArray27[3] = 0.0F;
		Static347.aFloatArray27[14] = 0.0F;
		Static347.aFloatArray27[2] = 0.0F;
		Static347.aFloatArray27[7] = 0.0F;
		Static347.aFloatArray27[11] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static347.aFloatArray27, 0);
		if ((this.anInt1398 & 0x7) == 0) {
			this.aClass33_Sub3_3.method6296(false);
		} else {
			this.aClass33_Sub3_3.method6296(true);
			this.aClass33_Sub3_3.method6298();
		}
		this.aClass33_Sub3_3.method6339(this.aClass327_3, this.aClass327_5, this.aClass327_4, this.aClass327_6);
		if (this.aClass33_Sub3_3.aClass4_Sub11_Sub2_3.aByteArray107.length < this.anInt1387 * 2) {
			this.aClass33_Sub3_3.aClass4_Sub11_Sub2_3 = new Class4_Sub11_Sub2(this.anInt1387 * 2);
		} else {
			this.aClass33_Sub3_3.aClass4_Sub11_Sub2_3.anInt10466 = 0;
		}
		@Pc(312) int local312 = 0;
		@Pc(316) Class4_Sub11_Sub2 local316 = this.aClass33_Sub3_3.aClass4_Sub11_Sub2_3;
		@Pc(322) int local322;
		@Pc(331) int local331;
		@Pc(333) int local333;
		@Pc(350) short[] local350;
		@Pc(354) int local354;
		if (this.aClass33_Sub3_3.aBoolean555) {
			for (local322 = arg1; local322 < arg3; local322++) {
				local331 = arg0 + local322 * super.anInt8638;
				for (local333 = arg0; local333 < arg2; local333++) {
					if (arg4[local333 - arg0][local322 - arg1]) {
						local350 = this.aShortArrayArray5[local331];
						if (local350 != null) {
							for (local354 = 0; local354 < local350.length; local354++) {
								local312++;
								local316.method8838(local350[local354] & 0xFFFF);
							}
						}
					}
					local331++;
				}
			}
		} else {
			for (local322 = arg1; local322 < arg3; local322++) {
				local331 = super.anInt8638 * local322 + arg0;
				for (local333 = arg0; local333 < arg2; local333++) {
					if (arg4[local333 - arg0][local322 - arg1]) {
						local350 = this.aShortArrayArray5[local331];
						if (local350 != null) {
							for (local354 = 0; local354 < local350.length; local354++) {
								local312++;
								local316.method8848(local350[local354] & 0xFFFF);
							}
						}
					}
					local331++;
				}
			}
		}
		if (local312 > 0) {
			@Pc(474) Class322_Sub2 local474 = new Class322_Sub2(this.aClass33_Sub3_3, 5123, local316.aByteArray107, local316.anInt10466);
			this.aClass33_Sub3_3.method6348(0, local312, local474);
		}
	}
}
