import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class86_Sub1 extends Class86 {

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
	private int anInt2577;

	@OriginalMember(owner = "client!gb", name = "J", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!gb", name = "T", descriptor = "I")
	private int anInt2598;

	@OriginalMember(owner = "client!gb", name = "X", descriptor = "I")
	private int anInt2601;

	@OriginalMember(owner = "client!gb", name = "Y", descriptor = "Lclient!bh;")
	public Class23 aClass23_4;

	@OriginalMember(owner = "client!gb", name = "Z", descriptor = "Lclient!bh;")
	public Class23 aClass23_5;

	@OriginalMember(owner = "client!gb", name = "ab", descriptor = "I")
	private int anInt2602;

	@OriginalMember(owner = "client!gb", name = "bb", descriptor = "Lclient!bh;")
	private Class23 aClass23_6;

	@OriginalMember(owner = "client!gb", name = "eb", descriptor = "[Lclient!io;")
	private Class6_Sub18[] aClass6_Sub18Array1;

	@OriginalMember(owner = "client!gb", name = "fb", descriptor = "Lclient!bh;")
	public Class23 aClass23_7;

	@OriginalMember(owner = "client!gb", name = "jb", descriptor = "Lclient!ms;")
	private Interface5 anInterface5_3;

	@OriginalMember(owner = "client!gb", name = "Q", descriptor = "Lclient!um;")
	private final Class244 aClass244_14 = new Class244();

	@OriginalMember(owner = "client!gb", name = "S", descriptor = "Lclient!rl;")
	public final Class66_Sub2 aClass66_Sub2_11;

	@OriginalMember(owner = "client!gb", name = "V", descriptor = "[[I")
	private final int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!gb", name = "v", descriptor = "I")
	private final int anInt2586;

	@OriginalMember(owner = "client!gb", name = "u", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!gb", name = "P", descriptor = "[[[Lclient!io;")
	private Class6_Sub18[][][] aClass6_Sub18ArrayArrayArray1;

	@OriginalMember(owner = "client!gb", name = "N", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!gb", name = "cb", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!gb", name = "db", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!gb", name = "gb", descriptor = "[[B")
	private byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!gb", name = "o", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!gb", name = "p", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!gb", name = "F", descriptor = "I")
	public final int anInt2593;

	@OriginalMember(owner = "client!gb", name = "L", descriptor = "[[B")
	private final byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!gb", name = "t", descriptor = "[[S")
	public final short[][] aShortArrayArray6;

	@OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
	private final int anInt2582;

	@OriginalMember(owner = "client!gb", name = "hb", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!gb", name = "G", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!gb", name = "ib", descriptor = "Lclient!fe;")
	private Class74 aClass74_13;

	@OriginalMember(owner = "client!gb", name = "M", descriptor = "Lclient!m;")
	private Class159 aClass159_2;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lclient!rl;IIII[[I[[II)V")
	public Class86_Sub1(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.aClass66_Sub2_11 = arg0;
		this.anIntArrayArray13 = arg5;
		this.anInt2586 = super.anInt8051 - 2;
		this.anIntArrayArrayArray3 = new int[arg3][arg4][];
		this.aClass6_Sub18ArrayArrayArray1 = new Class6_Sub18[arg3][arg4][];
		this.anIntArrayArrayArray6 = new int[arg3][arg4][];
		this.aFloatArrayArray3 = new float[super.anInt8047 + 1][super.anInt8049 + 1];
		this.aFloatArrayArray4 = new float[super.anInt8047 + 1][super.anInt8049 + 1];
		this.aByteArrayArray9 = new byte[arg3 + 1][arg4 + 1];
		this.anIntArrayArrayArray1 = new int[arg3][arg4][];
		this.anIntArrayArrayArray2 = new int[arg3][arg4][];
		this.anInt2593 = arg2;
		this.aByteArrayArray8 = new byte[arg3][arg4];
		this.aShortArrayArray6 = new short[arg4 * arg3][];
		this.anInt2582 = 0x1 << this.anInt2586;
		this.aFloatArrayArray5 = new float[super.anInt8047 + 1][super.anInt8049 + 1];
		this.anIntArrayArrayArray4 = new int[arg3][arg4][];
		for (@Pc(117) int local117 = 1; local117 < super.anInt8049; local117++) {
			for (@Pc(121) int local121 = 1; local121 < super.anInt8047; local121++) {
				@Pc(140) int local140 = arg6[local121 + 1][local117] - arg6[local121 - 1][local117];
				@Pc(157) int local157 = arg6[local121][local117 + 1] - arg6[local121][local117 - 1];
				@Pc(177) float local177 = (float) (1.0D / Math.sqrt((double) (arg7 * 4 * arg7 + local140 * local140 + local157 * local157)));
				this.aFloatArrayArray5[local121][local117] = (float) local140 * local177;
				this.aFloatArrayArray4[local121][local117] = (float) (-arg7 * 2) * local177;
				this.aFloatArrayArray3[local121][local117] = (float) local157 * local177;
			}
		}
		this.aClass74_13 = new Class74(128);
		if ((this.anInt2593 & 0x10) != 0) {
			this.aClass159_2 = new Class159(this.aClass66_Sub2_11, this);
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "()V")
	@Override
	public void method6582() {
		if (this.anInt2601 > 0) {
			@Pc(21) byte[][] local21 = new byte[super.anInt8047 + 1][super.anInt8049 + 1];
			@Pc(27) int local27;
			for (@Pc(23) int local23 = 1; super.anInt8047 > local23; local23++) {
				for (local27 = 1; super.anInt8049 > local27; local27++) {
					local21[local23][local27] = (byte) ((this.aByteArrayArray9[local23 - 1][local27] >> 2) + (this.aByteArrayArray9[local23 + 1][local27] >> 3) + (this.aByteArrayArray9[local23][local27 + -1] >> 2) + (this.aByteArrayArray9[local23][local27 + 1] >> 3) + (this.aByteArrayArray9[local23][local27] >> 1));
				}
			}
			this.aClass6_Sub18Array1 = new Class6_Sub18[this.aClass74_13.method1887()];
			this.aClass74_13.method1891(this.aClass6_Sub18Array1);
			for (local27 = 0; local27 < this.aClass6_Sub18Array1.length; local27++) {
				this.aClass6_Sub18Array1[local27].method2875(this.anInt2601);
			}
			@Pc(143) int local143 = 24;
			if (this.anIntArrayArrayArray5 != null) {
				local143 += 4;
			}
			if ((this.anInt2593 & 0x7) != 0) {
				local143 += 12;
			}
			@Pc(162) NativeBuffer local162 = this.aClass66_Sub2_11.aNativeHeap2.a(this.anInt2601 * local143);
			@Pc(167) NativeStream local167 = new NativeStream(local162);
			@Pc(171) Class6_Sub18[] local171 = new Class6_Sub18[this.anInt2601];
			@Pc(179) Class74 local179 = new Class74(Static31.method761(this.anInt2601));
			@Pc(183) Class6_Sub18[] local183 = new Class6_Sub18[this.anInt2602];
			@Pc(189) int local189;
			for (@Pc(185) int local185 = 0; local185 < super.anInt8047; local185++) {
				for (local189 = 0; super.anInt8049 > local189; local189++) {
					if (this.anIntArrayArrayArray6[local185][local189] != null) {
						@Pc(205) Class6_Sub18[] local205 = this.aClass6_Sub18ArrayArrayArray1[local185][local189];
						@Pc(212) int[] local212 = this.anIntArrayArrayArray1[local185][local189];
						@Pc(219) int[] local219 = this.anIntArrayArrayArray2[local185][local189];
						@Pc(226) int[] local226 = this.anIntArrayArrayArray3[local185][local189];
						@Pc(233) int[] local233 = this.anIntArrayArrayArray6[local185][local189];
						@Pc(245) int[] local245 = this.anIntArrayArrayArray4 == null ? null : this.anIntArrayArrayArray4[local185][local189];
						@Pc(257) int[] local257 = this.anIntArrayArrayArray5 == null ? null : this.anIntArrayArrayArray5[local185][local189];
						if (local226 == null) {
							local226 = local233;
						}
						@Pc(268) float local268 = this.aFloatArrayArray5[local185][local189];
						@Pc(275) float local275 = this.aFloatArrayArray4[local185][local189];
						@Pc(282) float local282 = this.aFloatArrayArray3[local185][local189];
						@Pc(291) float local291 = this.aFloatArrayArray5[local185][local189 + 1];
						@Pc(300) float local300 = this.aFloatArrayArray4[local185][local189 + 1];
						@Pc(309) float local309 = this.aFloatArrayArray3[local185][local189 + 1];
						@Pc(320) float local320 = this.aFloatArrayArray5[local185 + 1][local189 + 1];
						@Pc(331) float local331 = this.aFloatArrayArray4[local185 + 1][local189 + 1];
						@Pc(342) float local342 = this.aFloatArrayArray3[local185 + 1][local189 + 1];
						@Pc(351) float local351 = this.aFloatArrayArray5[local185 + 1][local189];
						@Pc(360) float local360 = this.aFloatArrayArray4[local185 + 1][local189];
						@Pc(369) float local369 = this.aFloatArrayArray3[local185 + 1][local189];
						@Pc(377) int local377 = local21[local185][local189] & 0xFF;
						@Pc(387) int local387 = local21[local185][local189 + 1] & 0xFF;
						@Pc(399) int local399 = local21[local185 + 1][local189 + 1] & 0xFF;
						@Pc(409) int local409 = local21[local185 + 1][local189] & 0xFF;
						@Pc(411) int local411 = 0;
						@Pc(421) int local421;
						label331: for (@Pc(413) int local413 = 0; local413 < local233.length; local413++) {
							@Pc(419) Class6_Sub18 local419 = local205[local413];
							for (local421 = 0; local421 < local411; local421++) {
								if (local183[local421] == local419) {
									continue label331;
								}
							}
							local183[local411++] = local419;
						}
						@Pc(458) short[] local458 = this.aShortArrayArray6[super.anInt8047 * local189 + local185] = new short[local233.length];
						for (local421 = 0; local421 < local233.length; local421++) {
							@Pc(472) int local472 = (local185 << super.anInt8051) + local212[local421];
							@Pc(482) int local482 = (local189 << super.anInt8051) + local219[local421];
							@Pc(487) int local487 = local472 >> this.anInt2586;
							@Pc(492) int local492 = local482 >> this.anInt2586;
							@Pc(496) int local496 = local233[local421];
							@Pc(500) int local500 = local226[local421];
							@Pc(508) int local508 = local245 == null ? 0 : local245[local421];
							@Pc(526) long local526 = (long) local492 | (long) local496 << 32 | (long) local500 << 48 | (long) (local487 << 16);
							@Pc(530) int local530 = local212[local421];
							@Pc(534) int local534 = local219[local421];
							@Pc(538) int local538 = 0;
							@Pc(540) float local540 = 1.0F;
							@Pc(550) int local550;
							@Pc(552) float local552;
							@Pc(546) float local546;
							@Pc(554) float local554;
							@Pc(608) float local608;
							if (local530 == 0 && local534 == 0) {
								local546 = local275;
								local550 = 74 - local377;
								local552 = local268;
								local554 = local282;
							} else if (local530 == 0 && local534 == super.anInt8050) {
								local546 = local300;
								local550 = 74 - local387;
								local552 = local291;
								local554 = local309;
							} else if (super.anInt8050 == local530 && local534 == super.anInt8050) {
								local552 = local320;
								local546 = local331;
								local550 = 74 - local399;
								local554 = local342;
							} else if (local530 == super.anInt8050 && local534 == 0) {
								local552 = local351;
								local554 = local369;
								local546 = local360;
								local550 = 74 - local409;
							} else {
								@Pc(583) float local583 = (float) local530 / (float) super.anInt8050;
								@Pc(590) float local590 = (float) local534 / (float) super.anInt8050;
								@Pc(599) float local599 = (local351 - local268) * local583 + local268;
								local608 = local583 * (local360 - local275) + local275;
								@Pc(617) float local617 = local282 + local583 * (local369 - local282);
								@Pc(625) float local625 = local583 * (local320 - local291) + local291;
								@Pc(634) float local634 = local300 + (local331 - local300) * local583;
								local552 = local599 + (local625 - local599) * local590;
								local546 = local608 + (local634 - local608) * local590;
								@Pc(659) float local659 = local583 * (local342 - local309) + local309;
								local554 = local617 + local590 * (local659 - local617);
								@Pc(680) int local680 = ((local409 - local377) * local530 >> super.anInt8051) + local377;
								@Pc(692) int local692 = ((local399 - local387) * local530 >> super.anInt8051) + local387;
								local550 = 74 - local680 - ((local692 - local680) * local534 >> super.anInt8051);
							}
							if (local496 != -1) {
								@Pc(753) int local753 = local550 * (local496 & 0x7F) >> 7;
								if (local753 < 2) {
									local753 = 2;
								} else if (local753 > 126) {
									local753 = 126;
								}
								local538 = Static427.anIntArray525[local753 | local496 & 0xFF80];
								if ((this.anInt2593 & 0x7) == 0) {
									local540 = this.aClass66_Sub2_11.aFloatArray21[1] * local546 + local552 * this.aClass66_Sub2_11.aFloatArray21[0] + this.aClass66_Sub2_11.aFloatArray21[2] * local554;
									local540 = this.aClass66_Sub2_11.aFloat77 + (local540 > 0.0F ? this.aClass66_Sub2_11.aFloat81 : this.aClass66_Sub2_11.aFloat75) * local540;
								}
							}
							@Pc(824) Class6 local824 = null;
							if ((this.anInt2582 - 1 & local472) == 0 && (local482 & this.anInt2582 - 1) == 0) {
								local824 = local179.method1883(local526);
							}
							@Pc(860) int local860;
							@Pc(923) int local923;
							if (local824 == null) {
								if (local500 == local496) {
									local923 = local538;
								} else {
									@Pc(901) int local901 = (local500 & 0x7F) * local550 >> 7;
									if (local901 < 2) {
										local901 = 2;
									} else if (local901 > 126) {
										local901 = 126;
									}
									local923 = Static427.anIntArray525[local901 | local500 & 0xFF80];
									if ((this.anInt2593 & 0x7) == 0) {
										local608 = local552 * this.aClass66_Sub2_11.aFloatArray21[0] + local546 * this.aClass66_Sub2_11.aFloatArray21[1] + local554 * this.aClass66_Sub2_11.aFloatArray21[2];
										local608 = this.aClass66_Sub2_11.aFloat77 + (local540 > 0.0F ? this.aClass66_Sub2_11.aFloat81 : this.aClass66_Sub2_11.aFloat75) * local540;
										@Pc(976) int local976 = local923 >> 16 & 0xFF;
										@Pc(982) int local982 = local923 >> 8 & 0xFF;
										@Pc(986) int local986 = local923 & 0xFF;
										local976 = (int) ((float) local976 * local608);
										if (local976 < 0) {
											local976 = 0;
										} else if (local976 > 255) {
											local976 = 255;
										}
										local982 = (int) ((float) local982 * local608);
										if (local982 < 0) {
											local982 = 0;
										} else if (local982 > 255) {
											local982 = 255;
										}
										local986 = (int) ((float) local986 * local608);
										if (local986 < 0) {
											local986 = 0;
										} else if (local986 > 255) {
											local986 = 255;
										}
										local923 = local976 << 16 | local982 << 8 | local986;
									}
								}
								if (this.aClass66_Sub2_11.aBoolean373) {
									local167.a((float) local472);
									local167.a((float) (this.method6590(local472, local482) + local508));
									local167.a((float) local482);
									local167.a((byte) (local923 >> 16));
									local167.a((byte) (local923 >> 8));
									local167.a((byte) local923);
									local167.a(-1);
									local167.a((float) local472);
									local167.a((float) local482);
									if (this.anIntArrayArrayArray5 != null) {
										local167.a((float) (local257 == null ? 0 : local257[local421] - 1));
									}
									if ((this.anInt2593 & 0x7) != 0) {
										local167.a(local552);
										local167.a(local546);
										local167.a(local554);
									}
								} else {
									local167.b((float) local472);
									local167.b((float) (this.method6590(local472, local482) + local508));
									local167.b((float) local482);
									local167.a((byte) (local923 >> 16));
									local167.a((byte) (local923 >> 8));
									local167.a((byte) local923);
									local167.a(-1);
									local167.b((float) local472);
									local167.b((float) local482);
									if (this.anIntArrayArrayArray5 != null) {
										local167.b((float) (local257 == null ? 0 : local257[local421] - 1));
									}
									if ((this.anInt2593 & 0x7) != 0) {
										local167.b(local552);
										local167.b(local546);
										local167.b(local554);
									}
								}
								local860 = this.anInt2577++;
								local458[local421] = (short) local860;
								if (local496 != -1) {
									local171[local860] = local205[local421];
								}
								local179.method1890(local526, new Class6_Sub44(local458[local421]));
							} else {
								local458[local421] = ((Class6_Sub44) local824).aShort103;
								local860 = local458[local421] & 0xFFFF;
								if (local496 != -1 && local171[local860].aLong229 > local205[local421].aLong229) {
									local171[local860] = local205[local421];
								}
							}
							for (local923 = 0; local923 < local411; local923++) {
								local183[local923].method2878(local860, local538, local550, local540);
							}
							this.anInt2598++;
						}
					}
				}
			}
			for (local189 = 0; local189 < this.anInt2577; local189++) {
				@Pc(1300) Class6_Sub18 local1300 = local171[local189];
				if (local1300 != null) {
					local1300.method2882(local189);
				}
			}
			@Pc(1337) int local1337;
			for (@Pc(1317) int local1317 = 0; super.anInt8047 > local1317; local1317++) {
				for (@Pc(1321) int local1321 = 0; local1321 < super.anInt8049; local1321++) {
					@Pc(1333) short[] local1333 = this.aShortArrayArray6[local1317 + super.anInt8047 * local1321];
					if (local1333 != null) {
						local1337 = 0;
						@Pc(1339) int local1339 = 0;
						while (local1339 < local1333.length) {
							@Pc(1348) int local1348 = local1333[local1339++] & 0xFFFF;
							@Pc(1355) int local1355 = local1333[local1339++] & 0xFFFF;
							@Pc(1362) int local1362 = local1333[local1339++] & 0xFFFF;
							@Pc(1366) Class6_Sub18 local1366 = local171[local1348];
							@Pc(1370) Class6_Sub18 local1370 = local171[local1355];
							@Pc(1374) Class6_Sub18 local1374 = local171[local1362];
							@Pc(1376) Class6_Sub18 local1376 = null;
							if (local1366 != null) {
								local1366.method2876(local1321, local1337, local1317);
								local1376 = local1366;
							}
							if (local1370 != null) {
								local1370.method2876(local1321, local1337, local1317);
								if (local1376 == null || local1370.aLong229 < local1376.aLong229) {
									local1376 = local1370;
								}
							}
							if (local1374 != null) {
								local1374.method2876(local1321, local1337, local1317);
								if (local1376 == null || local1374.aLong229 < local1376.aLong229) {
									local1376 = local1374;
								}
							}
							if (local1376 != null) {
								if (local1366 != null) {
									local1376.method2882(local1348);
								}
								if (local1370 != null) {
									local1376.method2882(local1355);
								}
								if (local1374 != null) {
									local1376.method2882(local1362);
								}
								local1376.method2876(local1321, local1337, local1317);
							}
							local1337++;
						}
					}
				}
			}
			local167.c();
			this.anInterface5_3 = this.aClass66_Sub2_11.method5088(local167.b(), local162, local143);
			this.aClass23_5 = new Class23(this.aClass66_Sub2_11, this.anInterface5_3, 5126, 3, 0);
			this.aClass23_6 = new Class23(this.aClass66_Sub2_11, this.anInterface5_3, 5121, 4, 12);
			@Pc(1509) byte local1509;
			if (this.anIntArrayArrayArray5 == null) {
				local1509 = 24;
				this.aClass23_7 = new Class23(this.aClass66_Sub2_11, this.anInterface5_3, 5126, 2, 16);
			} else {
				this.aClass23_7 = new Class23(this.aClass66_Sub2_11, this.anInterface5_3, 5126, 3, 16);
				local1509 = 28;
			}
			if ((this.anInt2593 & 0x7) != 0) {
				this.aClass23_4 = new Class23(this.aClass66_Sub2_11, this.anInterface5_3, 5126, 3, local1509);
			}
			@Pc(1559) long[] local1559 = new long[this.aClass6_Sub18Array1.length];
			for (local1337 = 0; local1337 < this.aClass6_Sub18Array1.length; local1337++) {
				@Pc(1568) Class6_Sub18 local1568 = this.aClass6_Sub18Array1[local1337];
				local1559[local1337] = local1568.aLong229;
				local1568.method2884(this.anInt2577);
			}
			Static76.method6394(this.aClass6_Sub18Array1, local1559);
			if (this.aClass159_2 != null) {
				this.aClass159_2.method3670();
			}
		} else {
			this.aClass159_2 = null;
		}
		this.anIntArrayArrayArray4 = null;
		this.aClass74_13 = null;
		this.anIntArrayArrayArray3 = null;
		this.aByteArrayArray9 = null;
		this.anIntArrayArrayArray1 = this.anIntArrayArrayArray2 = null;
		this.anIntArrayArrayArray6 = null;
		this.aFloatArrayArray5 = this.aFloatArrayArray4 = this.aFloatArrayArray3 = null;
		this.anIntArrayArrayArray5 = null;
		this.aClass6_Sub18ArrayArrayArray1 = null;
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(II)I")
	@Override
	public int method6594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray13[arg0][arg1];
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(Lclient!ss;IIIIZ)V")
	@Override
	public void method6588(@OriginalArg(0) Class6_Sub2_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass159_2 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (this.aClass66_Sub2_11.anInt6183 * arg2 >> 8) >> this.aClass66_Sub2_11.anInt6141;
			@Pc(38) int local38 = arg3 - (arg2 * this.aClass66_Sub2_11.anInt6153 >> 8) >> this.aClass66_Sub2_11.anInt6141;
			this.aClass159_2.method3674(arg0, local38, local23);
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(BIILclient!ln;)V")
	private void method2158(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6_Sub2_Sub10_Sub1 arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray1[arg1][arg0];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray2[arg1][arg0];
		@Pc(32) int local32 = local12.length;
		if (Static220.anIntArray288.length < local32) {
			Static220.anIntArray288 = new int[local32];
			Static228.anIntArray298 = new int[local32];
		}
		for (@Pc(48) int local48 = 0; local48 < local32; local48++) {
			Static220.anIntArray288[local48] = (local12[local48] & 0xFF) >> this.aClass66_Sub2_11.anInt6141;
			Static228.anIntArray298[local48] = (local19[local48] & 0xFF) >> this.aClass66_Sub2_11.anInt6141;
		}
		@Pc(80) int local80 = 0;
		while (local80 < local32) {
			@Pc(86) int local86 = Static220.anIntArray288[local80];
			@Pc(91) int local91 = Static228.anIntArray298[local80++];
			@Pc(95) int local95 = Static220.anIntArray288[local80];
			@Pc(100) int local100 = Static228.anIntArray298[local80++];
			@Pc(104) int local104 = Static220.anIntArray288[local80];
			@Pc(109) int local109 = Static228.anIntArray298[local80++];
			if ((local86 - local95) * (local100 - local109) - (local100 - local91) * (local104 - local95) > 0) {
				arg2.method3614(local104, local86, local100, local95, local109, local91);
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)V")
	@Override
	public void method6584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method6597(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt2601 <= 0) {
			return;
		}
		this.aClass66_Sub2_11.method5127();
		this.aClass66_Sub2_11.method5106(false);
		this.aClass66_Sub2_11.method5110(false);
		this.aClass66_Sub2_11.method5094(false);
		this.aClass66_Sub2_11.method5134(false);
		this.aClass66_Sub2_11.method5078(0);
		this.aClass66_Sub2_11.method5093(-2);
		this.aClass66_Sub2_11.method5109(null);
		Static42.aFloatArray5[7] = 0.0F;
		Static42.aFloatArray5[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass66_Sub2_11.anInt6028;
		Static42.aFloatArray5[2] = 0.0F;
		Static42.aFloatArray5[0] = (float) 1024 / ((float) super.anInt8050 * 128.0F * (float) this.aClass66_Sub2_11.anInt6041);
		Static42.aFloatArray5[12] = -(((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass66_Sub2_11.anInt6041) - 1.0F;
		Static42.aFloatArray5[5] = (float) 1024 / ((float) this.aClass66_Sub2_11.anInt6028 * (float) super.anInt8050 * 128.0F);
		Static42.aFloatArray5[14] = 0.0F;
		Static42.aFloatArray5[9] = 0.0F;
		Static42.aFloatArray5[11] = 0.0F;
		Static42.aFloatArray5[15] = 1.0F;
		Static42.aFloatArray5[1] = 0.0F;
		Static42.aFloatArray5[10] = 0.0F;
		Static42.aFloatArray5[4] = 0.0F;
		Static42.aFloatArray5[6] = 0.0F;
		Static42.aFloatArray5[8] = 0.0F;
		Static42.aFloatArray5[3] = 0.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static42.aFloatArray5, 0);
		Static42.aFloatArray5[3] = 0.0F;
		Static42.aFloatArray5[14] = 0.0F;
		Static42.aFloatArray5[10] = 0.0F;
		Static42.aFloatArray5[11] = 0.0F;
		Static42.aFloatArray5[2] = 0.0F;
		Static42.aFloatArray5[8] = 0.0F;
		Static42.aFloatArray5[7] = 0.0F;
		Static42.aFloatArray5[5] = 0.0F;
		Static42.aFloatArray5[13] = 0.0F;
		Static42.aFloatArray5[6] = 1.0F;
		Static42.aFloatArray5[1] = 0.0F;
		Static42.aFloatArray5[15] = 1.0F;
		Static42.aFloatArray5[0] = 1.0F;
		Static42.aFloatArray5[12] = 0.0F;
		Static42.aFloatArray5[9] = 1.0F;
		Static42.aFloatArray5[4] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static42.aFloatArray5, 0);
		if ((this.anInt2593 & 0x7) == 0) {
			this.aClass66_Sub2_11.method5110(false);
		} else {
			this.aClass66_Sub2_11.method5110(true);
			this.aClass66_Sub2_11.method5097();
		}
		this.aClass66_Sub2_11.method5087(this.aClass23_6, this.aClass23_5, this.aClass23_4, this.aClass23_7);
		if (Static196.aClass6_Sub1_1.aByteArray96.length >= this.anInt2598 * 2) {
			Static196.aClass6_Sub1_1.anInt7898 = 0;
		} else {
			Static196.aClass6_Sub1_1 = new Class6_Sub1(this.anInt2598 * 2);
		}
		@Pc(311) int local311 = 0;
		@Pc(317) int local317;
		@Pc(326) int local326;
		@Pc(328) int local328;
		@Pc(345) short[] local345;
		@Pc(349) int local349;
		if (this.aClass66_Sub2_11.aBoolean373) {
			for (local317 = arg1; local317 < arg3; local317++) {
				local326 = arg0 + super.anInt8047 * local317;
				for (local328 = arg0; local328 < arg2; local328++) {
					if (arg4[local328 - arg0][local317 - arg1]) {
						local345 = this.aShortArrayArray6[local326];
						if (local345 != null) {
							for (local349 = 0; local349 < local345.length; local349++) {
								Static196.aClass6_Sub1_1.method6453(local345[local349] & 0xFFFF);
								local311++;
							}
						}
					}
					local326++;
				}
			}
		} else {
			for (local317 = arg1; local317 < arg3; local317++) {
				local326 = arg0 + super.anInt8047 * local317;
				for (local328 = arg0; local328 < arg2; local328++) {
					if (arg4[local328 - arg0][local317 - arg1]) {
						local345 = this.aShortArrayArray6[local326];
						if (local345 != null) {
							for (local349 = 0; local349 < local345.length; local349++) {
								Static196.aClass6_Sub1_1.method6480(local345[local349] & 0xFFFF);
								local311++;
							}
						}
					}
					local326++;
				}
			}
		}
		if (local311 > 0) {
			@Pc(454) Class90_Sub2 local454 = new Class90_Sub2(this.aClass66_Sub2_11, 5123, Static196.aClass6_Sub1_1.aByteArray96, Static196.aClass6_Sub1_1.anInt7898);
			this.aClass66_Sub2_11.method5155(local311, 0, local454);
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!dq;[I)V")
	@Override
	public void method6585(@OriginalArg(0) Class6_Sub11 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass244_14.method5966(new Class6_Sub41(this.aClass66_Sub2_11, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(II)I")
	@Override
	public int method6590(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 >> super.anInt8051;
		@Pc(13) int local13 = arg1 >> super.anInt8051;
		if (local8 < 0 || local13 < 0 || super.anInt8047 - 1 < local8 || local13 > super.anInt8049 - 1) {
			return 0;
		}
		@Pc(42) int local42 = arg0 & super.anInt8050 - 1;
		@Pc(49) int local49 = arg1 & super.anInt8050 - 1;
		@Pc(76) int local76 = this.anIntArrayArray13[local8][local13] * (super.anInt8050 - local42) + this.anIntArrayArray13[local8 + 1][local13] * local42 >> super.anInt8051;
		@Pc(107) int local107 = local42 * this.anIntArrayArray13[local8 + 1][local13 + 1] + this.anIntArrayArray13[local8][local13 + 1] * (super.anInt8050 - local42) >> super.anInt8051;
		return local49 * local107 + (super.anInt8050 - local49) * local76 >> super.anInt8051;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(III[[ZIBZ)V")
	private void method2160(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(6) boolean arg4) {
		if (this.aClass6_Sub18Array1 == null) {
			return;
		}
		@Pc(14) float local14 = this.aClass66_Sub2_11.aFloat82;
		@Pc(18) float local18 = this.aClass66_Sub2_11.aFloat71;
		@Pc(24) int local24 = arg3 + arg3 + 1;
		@Pc(28) int local28 = local24 * local24;
		if (Static207.anIntArray278.length < local28) {
			Static207.anIntArray278 = new int[local28];
		}
		if (Static196.aClass6_Sub1_1.aByteArray96.length < this.anInt2598 * 2) {
			Static196.aClass6_Sub1_1 = new Class6_Sub1(this.anInt2598 * 2);
		}
		@Pc(60) int local60 = arg0 - arg3;
		@Pc(62) int local62 = local60;
		if (local60 < 0) {
			local60 = 0;
		}
		@Pc(70) int local70 = arg1 - arg3;
		@Pc(72) int local72 = local70;
		if (local70 < 0) {
			local70 = 0;
		}
		@Pc(83) int local83 = arg0 + arg3;
		if (super.anInt8047 - 1 < local83) {
			local83 = super.anInt8047 - 1;
		}
		@Pc(102) int local102 = arg3 + arg1;
		Static81.anInt1998 = 0;
		if (local102 > super.anInt8049 - 1) {
			local102 = super.anInt8049 - 1;
		}
		@Pc(128) int local128;
		for (@Pc(117) int local117 = local60; local117 <= local83; local117++) {
			@Pc(126) boolean[] local126 = arg2[local117 - local62];
			for (local128 = local70; local128 <= local102; local128++) {
				if (local126[local128 - local72]) {
					Static207.anIntArray278[Static81.anInt1998++] = local117 + local128 * super.anInt8047;
				}
			}
		}
		this.aClass66_Sub2_11.method5117();
		this.aClass66_Sub2_11.method5110((this.anInt2593 & 0x7) != 0);
		for (@Pc(195) int local195 = 0; local195 < this.aClass6_Sub18Array1.length; local195++) {
			this.aClass6_Sub18Array1[local195].method2877(Static81.anInt1998, Static207.anIntArray278);
		}
		if (!this.aClass244_14.method5970()) {
			local128 = this.aClass66_Sub2_11.anInt6165;
			@Pc(224) int local224 = this.aClass66_Sub2_11.anInt6182;
			this.aClass66_Sub2_11.method5009(0, local224, this.aClass66_Sub2_11.anInt6151);
			this.aClass66_Sub2_11.method5055(local18, local14 - 4.0F);
			this.aClass66_Sub2_11.method5110(false);
			this.aClass66_Sub2_11.method5134(false);
			this.aClass66_Sub2_11.method5078(128);
			this.aClass66_Sub2_11.method5093(-2);
			this.aClass66_Sub2_11.method5109(this.aClass66_Sub2_11.aClass19_Sub4_5);
			this.aClass66_Sub2_11.method5145(7681, 8448);
			this.aClass66_Sub2_11.method5081(0, 34166, 770);
			this.aClass66_Sub2_11.method5102(0, 34167);
			for (@Pc(291) Class6 local291 = this.aClass244_14.method5976(); local291 != null; local291 = this.aClass244_14.method5964()) {
				@Pc(296) Class6_Sub41 local296 = (Class6_Sub41) local291;
				local296.method5692(arg3, arg1, arg0, arg2);
			}
			this.aClass66_Sub2_11.method5081(0, 5890, 768);
			this.aClass66_Sub2_11.method5102(0, 5890);
			this.aClass66_Sub2_11.method5109(null);
			this.aClass66_Sub2_11.method5009(local128, local224, this.aClass66_Sub2_11.anInt6151);
		}
		if (this.aClass159_2 != null) {
			this.aClass66_Sub2_11.method5055(local18, local14 - 8.0F);
			this.aClass66_Sub2_11.method5117();
			this.aClass66_Sub2_11.method5087(null, this.aClass23_5, null, this.aClass23_7);
			this.aClass159_2.method3668(arg4, arg2, arg3, arg1, arg0);
		}
		this.aClass66_Sub2_11.method5055(local18, local14);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!ss;IIIIZ)V")
	@Override
	public void method6583(@OriginalArg(0) Class6_Sub2_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass159_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass66_Sub2_11.anInt6183 * arg2 >> 8) >> this.aClass66_Sub2_11.anInt6141;
			@Pc(39) int local39 = arg3 - (this.aClass66_Sub2_11.anInt6153 * arg2 >> 8) >> this.aClass66_Sub2_11.anInt6141;
			this.aClass159_2.method3669(local39, local24, arg0);
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(Lclient!ss;IIIIZ)Z")
	@Override
	public boolean method6586(@OriginalArg(0) Class6_Sub2_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass159_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (arg2 * this.aClass66_Sub2_11.anInt6183 >> 8) >> this.aClass66_Sub2_11.anInt6141;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass66_Sub2_11.anInt6153 >> 8) >> this.aClass66_Sub2_11.anInt6141;
			return this.aClass159_2.method3673(arg0, local25, local39);
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method6595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method2160(arg0, arg1, arg3, arg2, arg4);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IILclient!ss;)Lclient!ss;")
	@Override
	public Class6_Sub2_Sub10 method6591(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub2_Sub10 arg2) {
		if ((this.aByteArrayArray8[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(21) int local21 = super.anInt8050 >> this.aClass66_Sub2_11.anInt6141;
		@Pc(24) Class6_Sub2_Sub10_Sub1 local24 = (Class6_Sub2_Sub10_Sub1) arg2;
		@Pc(40) Class6_Sub2_Sub10_Sub1 local40;
		if (local24 != null && local24.method3617(local21, local21)) {
			local40 = local24;
			local24.method3615();
		} else {
			local40 = new Class6_Sub2_Sub10_Sub1(this.aClass66_Sub2_11, local21, local21);
		}
		local40.method3618(local21, 0, 0, local21);
		this.method2158(arg1, arg0, local40);
		return local40;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method6592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg3 != null && this.anIntArrayArrayArray4 == null) {
			this.anIntArrayArrayArray4 = new int[super.anInt8047][super.anInt8049][];
		}
		if (arg5 != null && this.anIntArrayArrayArray5 == null) {
			this.anIntArrayArrayArray5 = new int[super.anInt8047][super.anInt8049][];
		}
		this.anIntArrayArrayArray1[arg0][arg1] = arg2;
		this.anIntArrayArrayArray2[arg0][arg1] = arg4;
		this.anIntArrayArrayArray6[arg0][arg1] = arg6;
		this.anIntArrayArrayArray3[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray5 != null) {
			this.anIntArrayArrayArray5[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray4 != null) {
			this.anIntArrayArrayArray4[arg0][arg1] = arg3;
		}
		@Pc(88) Class6_Sub18[] local88 = this.aClass6_Sub18ArrayArrayArray1[arg0][arg1] = new Class6_Sub18[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) arg8[local90] | (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48 | (long) (arg9[local90] << 14);
			@Pc(125) Class6 local125;
			for (local125 = this.aClass74_13.method1883(local119); local125 != null; local125 = this.aClass74_13.method1882()) {
				@Pc(130) Class6_Sub18 local130 = (Class6_Sub18) local125;
				if (arg8[local90] == local130.anInt3472 && (float) arg9[local90] == local130.aFloat31 && local130.anInt3473 == arg10 && local130.anInt3475 == arg11 && arg12 == local130.anInt3479) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class6_Sub18(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass74_13.method1890(local119, local88[local90]);
			} else {
				local88[local90] = (Class6_Sub18) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray8[arg0][arg1] = (byte) (this.aByteArrayArray8[arg0][arg1] | 0x1);
		}
		if (this.anInt2602 < arg6.length) {
			this.anInt2602 = arg6.length;
		}
		this.anInt2601 += arg6.length;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(III)V")
	@Override
	public void method6593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray9[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray9[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method6596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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
		this.method6592(arg0, arg1, local13, local47, local18, local56, local23, local28, local33, local38, arg13, arg14, arg15, false);
	}
}
