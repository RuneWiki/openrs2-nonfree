import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uea")
public final class Class112_Sub3 extends Class112 {

	@OriginalMember(owner = "client!uea", name = "x", descriptor = "I")
	private int anInt9356;

	@OriginalMember(owner = "client!uea", name = "I", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!uea", name = "J", descriptor = "I")
	private int anInt9365;

	@OriginalMember(owner = "client!uea", name = "T", descriptor = "[Lclient!jia;")
	private Class2_Sub28[] aClass2_Sub28Array1;

	@OriginalMember(owner = "client!uea", name = "U", descriptor = "Lclient!tda;")
	private Interface23 anInterface23_7;

	@OriginalMember(owner = "client!uea", name = "W", descriptor = "Lclient!dda;")
	private Class66 aClass66_13;

	@OriginalMember(owner = "client!uea", name = "X", descriptor = "Lclient!dda;")
	public Class66 aClass66_14;

	@OriginalMember(owner = "client!uea", name = "Y", descriptor = "I")
	private int anInt9370;

	@OriginalMember(owner = "client!uea", name = "bb", descriptor = "I")
	private int anInt9371;

	@OriginalMember(owner = "client!uea", name = "cb", descriptor = "Lclient!dda;")
	public Class66 aClass66_15;

	@OriginalMember(owner = "client!uea", name = "fb", descriptor = "Lclient!dda;")
	public Class66 aClass66_16;

	@OriginalMember(owner = "client!uea", name = "F", descriptor = "Lclient!nt;")
	private final Class238 aClass238_63 = new Class238();

	@OriginalMember(owner = "client!uea", name = "t", descriptor = "Lclient!oea;")
	public final Class87_Sub2 aClass87_Sub2_40;

	@OriginalMember(owner = "client!uea", name = "K", descriptor = "I")
	private final int anInt9366;

	@OriginalMember(owner = "client!uea", name = "R", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray18;

	@OriginalMember(owner = "client!uea", name = "n", descriptor = "[[S")
	public final short[][] aShortArrayArray30;

	@OriginalMember(owner = "client!uea", name = "db", descriptor = "[[B")
	private byte[][] aByteArrayArray25;

	@OriginalMember(owner = "client!uea", name = "P", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray17;

	@OriginalMember(owner = "client!uea", name = "eb", descriptor = "[[F")
	private float[][] aFloatArrayArray16;

	@OriginalMember(owner = "client!uea", name = "B", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!uea", name = "w", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!uea", name = "ab", descriptor = "[[F")
	private float[][] aFloatArrayArray15;

	@OriginalMember(owner = "client!uea", name = "H", descriptor = "I")
	public final int anInt9364;

	@OriginalMember(owner = "client!uea", name = "S", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray19;

	@OriginalMember(owner = "client!uea", name = "Z", descriptor = "[[F")
	private float[][] aFloatArrayArray14;

	@OriginalMember(owner = "client!uea", name = "r", descriptor = "I")
	private final int anInt9353;

	@OriginalMember(owner = "client!uea", name = "l", descriptor = "[[[Lclient!jia;")
	private Class2_Sub28[][][] aClass2_Sub28ArrayArrayArray1;

	@OriginalMember(owner = "client!uea", name = "s", descriptor = "[[B")
	private final byte[][] aByteArrayArray24;

	@OriginalMember(owner = "client!uea", name = "V", descriptor = "Lclient!mp;")
	private Class222 aClass222_37;

	@OriginalMember(owner = "client!uea", name = "O", descriptor = "Lclient!pia;")
	private Class260 aClass260_2;

	@OriginalMember(owner = "client!uea", name = "<init>", descriptor = "(Lclient!oea;IIII[[I[[II)V")
	public Class112_Sub3(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass87_Sub2_40 = arg0;
		this.anInt9366 = super.anInt9341 - 2;
		this.anIntArrayArrayArray18 = new int[arg3][arg4][];
		this.aShortArrayArray30 = new short[arg3 * arg4][];
		this.aByteArrayArray25 = new byte[arg3 + 1][arg4 + 1];
		this.anIntArrayArrayArray17 = new int[arg3][arg4][];
		this.aFloatArrayArray16 = new float[super.anInt9348 + 1][super.anInt9340 + 1];
		this.anIntArrayArrayArray15 = new int[arg3][arg4][];
		this.anIntArrayArrayArray14 = new int[arg3][arg4][];
		this.aFloatArrayArray15 = new float[super.anInt9348 + 1][super.anInt9340 + 1];
		this.anInt9364 = arg2;
		this.anIntArrayArrayArray19 = new int[arg3][arg4][];
		this.aFloatArrayArray14 = new float[super.anInt9348 + 1][super.anInt9340 + 1];
		this.anInt9353 = 0x1 << this.anInt9366;
		this.aClass2_Sub28ArrayArrayArray1 = new Class2_Sub28[arg3][arg4][];
		this.aByteArrayArray24 = new byte[arg3][arg4];
		for (@Pc(115) int local115 = 1; local115 < super.anInt9340; local115++) {
			for (@Pc(119) int local119 = 1; super.anInt9348 > local119; local119++) {
				@Pc(138) int local138 = arg6[local119 + 1][local115] - arg6[local119 - 1][local115];
				@Pc(155) int local155 = arg6[local119][local115 + 1] - arg6[local119][local115 - 1];
				@Pc(174) float local174 = (float) (1.0D / Math.sqrt((double) (arg7 * 4 * arg7 + local138 * local138 + local155 * local155)));
				this.aFloatArrayArray16[local119][local115] = (float) local138 * local174;
				this.aFloatArrayArray14[local119][local115] = (float) (-arg7 * 2) * local174;
				this.aFloatArrayArray15[local119][local115] = (float) local155 * local174;
			}
		}
		this.aClass222_37 = new Class222(128);
		if ((this.anInt9364 & 0x10) != 0) {
			this.aClass260_2 = new Class260(this.aClass87_Sub2_40, this);
		}
	}

	@OriginalMember(owner = "client!uea", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class2_Sub5_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass260_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass87_Sub2_40.anInt7392 * arg2 >> 8) >> this.aClass87_Sub2_40.anInt7367;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass87_Sub2_40.anInt7381 >> 8) >> this.aClass87_Sub2_40.anInt7367;
			this.aClass260_2.method6479(arg0, local24, local39);
		}
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7821(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt9371 <= 0) {
			return;
		}
		this.aClass87_Sub2_40.method6181();
		this.aClass87_Sub2_40.method6156(false);
		this.aClass87_Sub2_40.method6205(false);
		this.aClass87_Sub2_40.method6217(false);
		this.aClass87_Sub2_40.method6225(false);
		this.aClass87_Sub2_40.method6196(0);
		this.aClass87_Sub2_40.method6228(-2);
		this.aClass87_Sub2_40.method6167(null);
		Static568.aFloatArray72[15] = 1.0F;
		Static568.aFloatArray72[11] = 0.0F;
		Static568.aFloatArray72[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass87_Sub2_40.anInt7352;
		Static568.aFloatArray72[4] = 0.0F;
		Static568.aFloatArray72[10] = 0.0F;
		Static568.aFloatArray72[1] = 0.0F;
		Static568.aFloatArray72[12] = -1.0F - ((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass87_Sub2_40.anInt7358;
		Static568.aFloatArray72[8] = 0.0F;
		Static568.aFloatArray72[3] = 0.0F;
		Static568.aFloatArray72[9] = 0.0F;
		Static568.aFloatArray72[14] = 0.0F;
		Static568.aFloatArray72[6] = 0.0F;
		Static568.aFloatArray72[0] = (float) 1024 / ((float) super.anInt9344 * 128.0F * (float) this.aClass87_Sub2_40.anInt7358);
		Static568.aFloatArray72[7] = 0.0F;
		Static568.aFloatArray72[5] = (float) 1024 / ((float) super.anInt9344 * 128.0F * (float) this.aClass87_Sub2_40.anInt7352);
		Static568.aFloatArray72[2] = 0.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static568.aFloatArray72, 0);
		Static568.aFloatArray72[0] = 1.0F;
		Static568.aFloatArray72[3] = 0.0F;
		Static568.aFloatArray72[6] = 1.0F;
		Static568.aFloatArray72[8] = 0.0F;
		Static568.aFloatArray72[15] = 1.0F;
		Static568.aFloatArray72[13] = 0.0F;
		Static568.aFloatArray72[2] = 0.0F;
		Static568.aFloatArray72[10] = 0.0F;
		Static568.aFloatArray72[11] = 0.0F;
		Static568.aFloatArray72[12] = 0.0F;
		Static568.aFloatArray72[4] = 0.0F;
		Static568.aFloatArray72[1] = 0.0F;
		Static568.aFloatArray72[14] = 0.0F;
		Static568.aFloatArray72[7] = 0.0F;
		Static568.aFloatArray72[5] = 0.0F;
		Static568.aFloatArray72[9] = 1.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static568.aFloatArray72, 0);
		if ((this.anInt9364 & 0x7) == 0) {
			this.aClass87_Sub2_40.method6205(false);
		} else {
			this.aClass87_Sub2_40.method6205(true);
			this.aClass87_Sub2_40.method6219();
		}
		this.aClass87_Sub2_40.method6151(this.aClass66_14, this.aClass66_15, this.aClass66_13, this.aClass66_16);
		if (this.anInt9365 * 2 > this.aClass87_Sub2_40.aClass2_Sub34_Sub1_3.aByteArray77.length) {
			this.aClass87_Sub2_40.aClass2_Sub34_Sub1_3 = new Class2_Sub34_Sub1(this.anInt9365 * 2);
		} else {
			this.aClass87_Sub2_40.aClass2_Sub34_Sub1_3.anInt8188 = 0;
		}
		@Pc(314) int local314 = 0;
		@Pc(318) Class2_Sub34_Sub1 local318 = this.aClass87_Sub2_40.aClass2_Sub34_Sub1_3;
		@Pc(324) int local324;
		@Pc(333) int local333;
		@Pc(335) int local335;
		@Pc(354) short[] local354;
		@Pc(358) int local358;
		if (this.aClass87_Sub2_40.aBoolean559) {
			for (local324 = arg1; local324 < arg3; local324++) {
				local333 = arg0 + local324 * super.anInt9348;
				for (local335 = arg0; local335 < arg2; local335++) {
					if (arg4[local335 - arg0][local324 - arg1]) {
						local354 = this.aShortArrayArray30[local333];
						if (local354 != null) {
							for (local358 = 0; local358 < local354.length; local358++) {
								local314++;
								local318.method6854(local354[local358] & 0xFFFF);
							}
						}
					}
					local333++;
				}
			}
		} else {
			for (local324 = arg1; local324 < arg3; local324++) {
				local333 = arg0 + super.anInt9348 * local324;
				for (local335 = arg0; local335 < arg2; local335++) {
					if (arg4[local335 - arg0][local324 - arg1]) {
						local354 = this.aShortArrayArray30[local333];
						if (local354 != null) {
							for (local358 = 0; local358 < local354.length; local358++) {
								local314++;
								local318.method6868(local354[local358] & 0xFFFF);
							}
						}
					}
					local333++;
				}
			}
		}
		if (local314 > 0) {
			@Pc(475) Class232_Sub2 local475 = new Class232_Sub2(this.aClass87_Sub2_40, 5123, local318.aByteArray77, local318.anInt8188);
			this.aClass87_Sub2_40.method6162(local314, local475, 0);
		}
	}

	@OriginalMember(owner = "client!uea", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray25[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray25[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(ILclient!ss;IB)V")
	private void method7827(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub5_Sub12_Sub2 arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray17[arg2][arg0];
		@Pc(32) int[] local32 = this.anIntArrayArrayArray18[arg2][arg0];
		@Pc(35) int local35 = local12.length;
		if (this.aClass87_Sub2_40.anIntArray497.length < local35) {
			this.aClass87_Sub2_40.anIntArray499 = new int[local35];
			this.aClass87_Sub2_40.anIntArray497 = new int[local35];
		}
		@Pc(55) int[] local55 = this.aClass87_Sub2_40.anIntArray497;
		@Pc(59) int[] local59 = this.aClass87_Sub2_40.anIntArray499;
		for (@Pc(61) int local61 = 0; local61 < local35; local61++) {
			local55[local61] = local12[local61] >> this.aClass87_Sub2_40.anInt7367;
			local59[local61] = local32[local61] >> this.aClass87_Sub2_40.anInt7367;
		}
		@Pc(93) int local93 = 0;
		while (local35 > local93) {
			@Pc(99) int local99 = local55[local93];
			@Pc(104) int local104 = local59[local93++];
			@Pc(108) int local108 = local55[local93];
			@Pc(113) int local113 = local59[local93++];
			@Pc(117) int local117 = local55[local93];
			@Pc(122) int local122 = local59[local93++];
			if ((local99 - local108) * (local113 - local122) - (local117 - local108) * (-local104 + local113) > 0) {
				arg1.method7393(local104, local122, local117, local113, local108, local99);
			}
		}
	}

	@OriginalMember(owner = "client!uea", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.anInt9371 > 0) {
			@Pc(14) byte[][] local14 = new byte[super.anInt9348 + 1][super.anInt9340 + 1];
			@Pc(20) int local20;
			for (@Pc(16) int local16 = 1; super.anInt9348 > local16; local16++) {
				for (local20 = 1; super.anInt9340 > local20; local20++) {
					local14[local16][local20] = (byte) ((this.aByteArrayArray25[local16][local20] >> 1) + (this.aByteArrayArray25[local16][local20 + 1] >> 3) + (this.aByteArrayArray25[local16 + -1][local20] >> 2) + (this.aByteArrayArray25[local16 + 1][local20] >> 3) + (this.aByteArrayArray25[local16][local20 - 1] >> 2));
				}
			}
			this.aClass2_Sub28Array1 = new Class2_Sub28[this.aClass222_37.method5473()];
			this.aClass222_37.method5466(this.aClass2_Sub28Array1);
			for (local20 = 0; local20 < this.aClass2_Sub28Array1.length; local20++) {
				this.aClass2_Sub28Array1[local20].method4309(this.anInt9371);
			}
			@Pc(128) int local128 = 24;
			if (this.anIntArrayArrayArray16 != null) {
				local128 += 4;
			}
			if ((this.anInt9364 & 0x7) != 0) {
				local128 += 12;
			}
			@Pc(151) NativeHeapBuffer local151 = this.aClass87_Sub2_40.aNativeHeap5.a(this.anInt9371 * local128, false);
			@Pc(156) Stream local156 = new Stream(local151);
			@Pc(160) Class2_Sub28[] local160 = new Class2_Sub28[this.anInt9371];
			@Pc(167) int local167 = Static291.method4549(this.anInt9371 / 4);
			if (local167 < 1) {
				local167 = 1;
			}
			@Pc(177) Class222 local177 = new Class222(local167);
			@Pc(181) Class2_Sub28[] local181 = new Class2_Sub28[this.anInt9370];
			@Pc(187) int local187;
			for (@Pc(183) int local183 = 0; super.anInt9348 > local183; local183++) {
				for (local187 = 0; local187 < super.anInt9340; local187++) {
					if (this.anIntArrayArrayArray19[local183][local187] != null) {
						@Pc(203) Class2_Sub28[] local203 = this.aClass2_Sub28ArrayArrayArray1[local183][local187];
						@Pc(210) int[] local210 = this.anIntArrayArrayArray17[local183][local187];
						@Pc(217) int[] local217 = this.anIntArrayArrayArray18[local183][local187];
						@Pc(224) int[] local224 = this.anIntArrayArrayArray14[local183][local187];
						@Pc(231) int[] local231 = this.anIntArrayArrayArray19[local183][local187];
						@Pc(243) int[] local243 = this.anIntArrayArrayArray15 == null ? null : this.anIntArrayArrayArray15[local183][local187];
						@Pc(255) int[] local255 = this.anIntArrayArrayArray16 == null ? null : this.anIntArrayArrayArray16[local183][local187];
						if (local224 == null) {
							local224 = local231;
						}
						@Pc(266) float local266 = this.aFloatArrayArray16[local183][local187];
						@Pc(273) float local273 = this.aFloatArrayArray14[local183][local187];
						@Pc(280) float local280 = this.aFloatArrayArray15[local183][local187];
						@Pc(289) float local289 = this.aFloatArrayArray16[local183][local187 + 1];
						@Pc(298) float local298 = this.aFloatArrayArray14[local183][local187 + 1];
						@Pc(307) float local307 = this.aFloatArrayArray15[local183][local187 + 1];
						@Pc(318) float local318 = this.aFloatArrayArray16[local183 + 1][local187 + 1];
						@Pc(329) float local329 = this.aFloatArrayArray14[local183 + 1][local187 + 1];
						@Pc(340) float local340 = this.aFloatArrayArray15[local183 + 1][local187 + 1];
						@Pc(349) float local349 = this.aFloatArrayArray16[local183 + 1][local187];
						@Pc(358) float local358 = this.aFloatArrayArray14[local183 + 1][local187];
						@Pc(367) float local367 = this.aFloatArrayArray15[local183 + 1][local187];
						@Pc(375) int local375 = local14[local183][local187] & 0xFF;
						@Pc(385) int local385 = local14[local183][local187 + 1] & 0xFF;
						@Pc(397) int local397 = local14[local183 + 1][local187 + 1] & 0xFF;
						@Pc(407) int local407 = local14[local183 + 1][local187] & 0xFF;
						@Pc(409) int local409 = 0;
						@Pc(419) int local419;
						label337: for (@Pc(411) int local411 = 0; local411 < local231.length; local411++) {
							@Pc(417) Class2_Sub28 local417 = local203[local411];
							for (local419 = 0; local419 < local409; local419++) {
								if (local181[local419] == local417) {
									continue label337;
								}
							}
							local181[local409++] = local417;
						}
						@Pc(465) short[] local465 = this.aShortArrayArray30[local187 * super.anInt9348 + local183] = new short[local231.length];
						for (local419 = 0; local419 < local231.length; local419++) {
							@Pc(479) int local479 = (local183 << super.anInt9341) + local210[local419];
							@Pc(488) int local488 = (local187 << super.anInt9341) + local217[local419];
							@Pc(493) int local493 = local479 >> this.anInt9366;
							@Pc(498) int local498 = local488 >> this.anInt9366;
							@Pc(502) int local502 = local231[local419];
							@Pc(506) int local506 = local224[local419];
							@Pc(514) int local514 = local243 == null ? 0 : local243[local419];
							@Pc(532) long local532 = (long) local498 | (long) local506 << 48 | (long) local502 << 32 | (long) (local493 << 16);
							@Pc(536) int local536 = local210[local419];
							@Pc(540) int local540 = local217[local419];
							@Pc(542) byte local542 = 74;
							@Pc(544) int local544 = 0;
							@Pc(546) float local546 = 1.0F;
							@Pc(593) float local593;
							@Pc(589) float local589;
							@Pc(591) float local591;
							@Pc(631) float local631;
							@Pc(597) int local597;
							if (local536 == 0 && local540 == 0) {
								local589 = local273;
								local593 = local266;
								local597 = local542 - local375;
								local591 = local280;
							} else if (local536 == 0 && super.anInt9344 == local540) {
								local597 = local542 - local385;
								local589 = local298;
								local593 = local289;
								local591 = local307;
							} else if (local536 == super.anInt9344 && super.anInt9344 == local540) {
								local591 = local340;
								local593 = local318;
								local589 = local329;
								local597 = local542 - local397;
							} else if (super.anInt9344 == local536 && local540 == 0) {
								local589 = local358;
								local591 = local367;
								local593 = local349;
								local597 = local542 - local407;
							} else {
								@Pc(606) float local606 = (float) local536 / (float) super.anInt9344;
								@Pc(613) float local613 = (float) local540 / (float) super.anInt9344;
								@Pc(622) float local622 = local266 + (local349 - local266) * local606;
								local631 = local273 + (local358 - local273) * local606;
								@Pc(640) float local640 = local606 * (local367 - local280) + local280;
								@Pc(649) float local649 = (local318 - local289) * local606 + local289;
								@Pc(658) float local658 = (local329 - local298) * local606 + local298;
								local589 = local631 + local613 * (local658 - local631);
								local593 = local622 + local613 * (local649 - local622);
								@Pc(684) float local684 = local307 + (local340 - local307) * local606;
								local591 = local613 * (local684 - local640) + local640;
								@Pc(705) int local705 = (local536 * (local407 - local375) >> super.anInt9341) + local375;
								@Pc(717) int local717 = (local536 * (local397 - local385) >> super.anInt9341) + local385;
								local597 = local542 - ((local717 - local705) * local540 >> super.anInt9341) - local705;
							}
							if (local502 != -1) {
								@Pc(777) int local777 = local597 * (local502 & 0x7F) >> 7;
								if (local777 < 2) {
									local777 = 2;
								} else if (local777 > 126) {
									local777 = 126;
								}
								if ((this.anInt9364 & 0x7) == 0) {
									local546 = local591 * this.aClass87_Sub2_40.aFloatArray62[2] + this.aClass87_Sub2_40.aFloatArray62[0] * local593 + local589 * this.aClass87_Sub2_40.aFloatArray62[1];
									local546 = (local546 > 0.0F ? this.aClass87_Sub2_40.aFloat177 : this.aClass87_Sub2_40.aFloat165) * local546 + this.aClass87_Sub2_40.aFloat174;
								}
								local544 = Static349.anIntArray394[local502 & 0xFF80 | local777];
							}
							@Pc(851) Class2 local851 = null;
							if ((local479 & this.anInt9353 - 1) == 0 && (local488 & this.anInt9353 - 1) == 0) {
								local851 = local177.method5468(local532);
							}
							@Pc(887) int local887;
							@Pc(952) int local952;
							if (local851 == null) {
								if (local506 == local502) {
									local952 = local544;
								} else {
									@Pc(928) int local928 = local597 * (local506 & 0x7F) >> 7;
									if (local928 < 2) {
										local928 = 2;
									} else if (local928 > 126) {
										local928 = 126;
									}
									local952 = Static349.anIntArray394[local928 | local506 & 0xFF80];
									if ((this.anInt9364 & 0x7) == 0) {
										@Pc(980) float local980 = local593 * this.aClass87_Sub2_40.aFloatArray62[0] + this.aClass87_Sub2_40.aFloatArray62[1] * local589 + this.aClass87_Sub2_40.aFloatArray62[2] * local591;
										local631 = this.aClass87_Sub2_40.aFloat174 + (local546 > 0.0F ? this.aClass87_Sub2_40.aFloat177 : this.aClass87_Sub2_40.aFloat165) * local546;
										@Pc(1005) int local1005 = local952 >> 16 & 0xFF;
										@Pc(1011) int local1011 = local952 >> 8 & 0xFF;
										@Pc(1015) int local1015 = local952 & 0xFF;
										local1005 = (int) ((float) local1005 * local631);
										local1011 = (int) ((float) local1011 * local631);
										if (local1005 < 0) {
											local1005 = 0;
										} else if (local1005 > 255) {
											local1005 = 255;
										}
										if (local1011 < 0) {
											local1011 = 0;
										} else if (local1011 > 255) {
											local1011 = 255;
										}
										local1015 = (int) ((float) local1015 * local631);
										if (local1015 < 0) {
											local1015 = 0;
										} else if (local1015 > 255) {
											local1015 = 255;
										}
										local952 = local1011 << 8 | local1005 << 16 | local1015;
									}
								}
								if (this.aClass87_Sub2_40.aBoolean559) {
									local156.b((float) local479);
									local156.b((float) (this.method7826(local479, local488) + local514));
									local156.b((float) local488);
									local156.e((byte) (local952 >> 16));
									local156.e((byte) (local952 >> 8));
									local156.e((byte) local952);
									local156.e(-1);
									local156.b((float) local479);
									local156.b((float) local488);
									if (this.anIntArrayArrayArray16 != null) {
										local156.b((float) (local255 == null ? 0 : local255[local419] - 1));
									}
									if ((this.anInt9364 & 0x7) != 0) {
										local156.b(local593);
										local156.b(local589);
										local156.b(local591);
									}
								} else {
									local156.a((float) local479);
									local156.a((float) (local514 + this.method7826(local479, local488)));
									local156.a((float) local488);
									local156.e((byte) (local952 >> 16));
									local156.e((byte) (local952 >> 8));
									local156.e((byte) local952);
									local156.e(-1);
									local156.a((float) local479);
									local156.a((float) local488);
									if (this.anIntArrayArrayArray16 != null) {
										local156.a((float) (local255 == null ? 0 : local255[local419] - 1));
									}
									if ((this.anInt9364 & 0x7) != 0) {
										local156.a(local593);
										local156.a(local589);
										local156.a(local591);
									}
								}
								local887 = this.anInt9356++;
								local465[local419] = (short) local887;
								if (local502 != -1) {
									local160[local887] = local203[local419];
								}
								local177.method5476(new Class2_Sub19(local465[local419]), local532);
							} else {
								local465[local419] = ((Class2_Sub19) local851).aShort41;
								local887 = local465[local419] & 0xFFFF;
								if (local502 != -1 && local203[local419].aLong287 < local160[local887].aLong287) {
									local160[local887] = local203[local419];
								}
							}
							for (local952 = 0; local952 < local409; local952++) {
								local181[local952].method4300(local887, local546, local597, local544);
							}
							this.anInt9365++;
						}
					}
				}
			}
			for (local187 = 0; local187 < this.anInt9356; local187++) {
				@Pc(1339) Class2_Sub28 local1339 = local160[local187];
				if (local1339 != null) {
					local1339.method4301(local187);
				}
			}
			@Pc(1376) int local1376;
			for (@Pc(1356) int local1356 = 0; super.anInt9348 > local1356; local1356++) {
				for (@Pc(1360) int local1360 = 0; super.anInt9340 > local1360; local1360++) {
					@Pc(1372) short[] local1372 = this.aShortArrayArray30[local1356 + local1360 * super.anInt9348];
					if (local1372 != null) {
						local1376 = 0;
						@Pc(1378) int local1378 = 0;
						while (local1372.length > local1378) {
							@Pc(1387) int local1387 = local1372[local1378++] & 0xFFFF;
							@Pc(1394) int local1394 = local1372[local1378++] & 0xFFFF;
							@Pc(1401) int local1401 = local1372[local1378++] & 0xFFFF;
							@Pc(1405) Class2_Sub28 local1405 = local160[local1387];
							@Pc(1409) Class2_Sub28 local1409 = local160[local1394];
							@Pc(1413) Class2_Sub28 local1413 = local160[local1401];
							@Pc(1415) Class2_Sub28 local1415 = null;
							if (local1405 != null) {
								local1405.method4308(local1360, local1376, local1356);
								local1415 = local1405;
							}
							if (local1409 != null) {
								local1409.method4308(local1360, local1376, local1356);
								if (local1415 == null || local1415.aLong287 > local1409.aLong287) {
									local1415 = local1409;
								}
							}
							if (local1413 != null) {
								local1413.method4308(local1360, local1376, local1356);
								if (local1415 == null || local1415.aLong287 > local1413.aLong287) {
									local1415 = local1413;
								}
							}
							if (local1415 != null) {
								if (local1405 != null) {
									local1415.method4301(local1387);
								}
								if (local1409 != null) {
									local1415.method4301(local1394);
								}
								if (local1413 != null) {
									local1415.method4301(local1401);
								}
								local1415.method4308(local1360, local1376, local1356);
							}
							local1376++;
						}
					}
				}
			}
			local156.a();
			this.anInterface23_7 = this.aClass87_Sub2_40.method6224(local151, local156.c(), local128);
			this.aClass66_14 = new Class66(this.anInterface23_7, 5126, 3, 0);
			this.aClass66_13 = new Class66(this.anInterface23_7, 5121, 4, 12);
			@Pc(1558) byte local1558;
			if (this.anIntArrayArrayArray16 == null) {
				this.aClass66_16 = new Class66(this.anInterface23_7, 5126, 2, 16);
				local1558 = 24;
			} else {
				this.aClass66_16 = new Class66(this.anInterface23_7, 5126, 3, 16);
				local1558 = 28;
			}
			if ((this.anInt9364 & 0x7) != 0) {
				this.aClass66_15 = new Class66(this.anInterface23_7, 5126, 3, local1558);
			}
			@Pc(1592) long[] local1592 = new long[this.aClass2_Sub28Array1.length];
			for (local1376 = 0; local1376 < this.aClass2_Sub28Array1.length; local1376++) {
				@Pc(1601) Class2_Sub28 local1601 = this.aClass2_Sub28Array1[local1376];
				local1592[local1376] = local1601.aLong287;
				local1601.method4306(this.anInt9356);
			}
			Static14.method292(local1592, this.aClass2_Sub28Array1);
			if (this.aClass260_2 != null) {
				this.aClass260_2.method6476();
			}
		} else {
			this.aClass260_2 = null;
		}
		this.aByteArrayArray25 = null;
		this.aClass222_37 = null;
		this.aClass2_Sub28ArrayArrayArray1 = null;
		this.anIntArrayArrayArray17 = this.anIntArrayArrayArray18 = null;
		this.aFloatArrayArray16 = this.aFloatArrayArray14 = this.aFloatArrayArray15 = null;
		this.anIntArrayArrayArray15 = null;
		this.anIntArrayArrayArray14 = null;
		this.anIntArrayArrayArray19 = null;
		this.anIntArrayArrayArray16 = null;
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(II)V")
	@Override
	public void method7815(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method7823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method7830(arg1, arg3, arg5, arg2, arg0, arg6, arg4);
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method7822(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method7824(@OriginalArg(0) Class2_Sub5_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass260_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(25) int local25 = arg1 - (this.aClass87_Sub2_40.anInt7392 * arg2 >> 8) >> this.aClass87_Sub2_40.anInt7367;
			@Pc(40) int local40 = arg3 - (this.aClass87_Sub2_40.anInt7381 * arg2 >> 8) >> this.aClass87_Sub2_40.anInt7367;
			return this.aClass260_2.method6481(local25, local40, arg0);
		}
	}

	@OriginalMember(owner = "client!uea", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class2_Sub5_Sub12 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub5_Sub12 arg2) {
		if ((this.aByteArrayArray24[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt9344 >> this.aClass87_Sub2_40.anInt7367;
		@Pc(27) Class2_Sub5_Sub12_Sub2 local27 = (Class2_Sub5_Sub12_Sub2) arg2;
		@Pc(43) Class2_Sub5_Sub12_Sub2 local43;
		if (local27 != null && local27.method7388(local24, local24)) {
			local43 = local27;
			local27.method7389();
		} else {
			local43 = new Class2_Sub5_Sub12_Sub2(this.aClass87_Sub2_40, local24, local24);
		}
		local43.method7392(0, local24, 0, local24);
		this.method7827(arg1, local43, arg0);
		return local43;
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method7817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method7830(arg1, arg3, -1, arg2, arg0, arg5, arg4);
	}

	@OriginalMember(owner = "client!uea", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray16 == null) {
			this.anIntArrayArrayArray16 = new int[super.anInt9348][super.anInt9340][];
		}
		if (arg3 != null && this.anIntArrayArrayArray15 == null) {
			this.anIntArrayArrayArray15 = new int[super.anInt9348][super.anInt9340][];
		}
		@Pc(33) Interface6 local33 = this.aClass87_Sub2_40.anInterface6_11;
		this.anIntArrayArrayArray17[arg0][arg1] = arg2;
		this.anIntArrayArrayArray18[arg0][arg1] = arg4;
		this.anIntArrayArrayArray19[arg0][arg1] = arg6;
		this.anIntArrayArrayArray14[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray16 != null) {
			this.anIntArrayArrayArray16[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray15 != null) {
			this.anIntArrayArrayArray15[arg0][arg1] = arg3;
		}
		@Pc(92) Class2_Sub28[] local92 = this.aClass2_Sub28ArrayArrayArray1[arg0][arg1] = new Class2_Sub28[arg6.length];
		for (@Pc(94) int local94 = 0; local94 < arg6.length; local94++) {
			@Pc(100) int local100 = arg8[local94];
			@Pc(104) int local104 = arg9[local94];
			if ((this.anInt9364 & 0x20) != 0 && local100 != -1 && local33.method6357(local100).aBoolean427) {
				local100 = -1;
				local104 = 128;
			}
			@Pc(149) long local149 = (long) local100 | (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28 | (long) (local104 << 14);
			@Pc(155) Class2 local155;
			for (local155 = this.aClass222_37.method5468(local149); local155 != null; local155 = this.aClass222_37.method5475()) {
				@Pc(160) Class2_Sub28 local160 = (Class2_Sub28) local155;
				if (local100 == local160.anInt5159 && (float) local104 == local160.aFloat122 && arg10 == local160.anInt5154 && arg11 == local160.anInt5152 && arg12 == local160.anInt5149) {
					break;
				}
			}
			if (local155 == null) {
				local92[local94] = new Class2_Sub28(this, local100, local104, arg10, arg11, arg12);
				this.aClass222_37.method5476(local92[local94], local149);
			} else {
				local92[local94] = (Class2_Sub28) local155;
			}
		}
		if (arg13) {
			this.aByteArrayArray24[arg0][arg1] = (byte) (this.aByteArrayArray24[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt9370) {
			this.anInt9370 = arg6.length;
		}
		this.anInt9371 += arg6.length;
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(IB[[ZIIIIZ)V")
	private void method7830(@OriginalArg(0) int arg0, @OriginalArg(2) boolean[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6) {
		if (this.aClass2_Sub28Array1 == null) {
			return;
		}
		@Pc(22) int local22 = arg3 + arg3 + 1;
		@Pc(26) int local26 = local22 * local22;
		if (this.aClass87_Sub2_40.anIntArray498.length < local26) {
			this.aClass87_Sub2_40.anIntArray498 = new int[local26];
		}
		if (this.aClass87_Sub2_40.aClass2_Sub34_Sub1_3.aByteArray77.length < this.anInt9365 * 2) {
			this.aClass87_Sub2_40.aClass2_Sub34_Sub1_3 = new Class2_Sub34_Sub1(this.anInt9365 * 2);
		}
		@Pc(65) int local65 = arg4 - arg3;
		@Pc(67) int local67 = local65;
		if (local65 < 0) {
			local65 = 0;
		}
		@Pc(78) int local78 = arg0 - arg3;
		@Pc(80) int local80 = local78;
		if (local78 < 0) {
			local78 = 0;
		}
		@Pc(92) int local92 = arg4 + arg3;
		if (super.anInt9348 - 1 < local92) {
			local92 = super.anInt9348 - 1;
		}
		@Pc(107) int local107 = arg0 + arg3;
		if (local107 > super.anInt9340 - 1) {
			local107 = super.anInt9340 - 1;
		}
		@Pc(124) int local124 = 0;
		@Pc(128) int[] local128 = this.aClass87_Sub2_40.anIntArray498;
		@Pc(140) int local140;
		for (@Pc(130) int local130 = local65; local130 <= local92; local130++) {
			@Pc(138) boolean[] local138 = arg1[local130 - local67];
			for (local140 = local78; local140 <= local107; local140++) {
				if (local138[local140 - local80]) {
					local128[local124++] = local130 + local140 * super.anInt9348;
				}
			}
		}
		if (arg2 == -1) {
			this.aClass87_Sub2_40.method6146();
		} else {
			this.aClass87_Sub2_40.method6166((float) arg2);
			this.aClass87_Sub2_40.method6169();
		}
		this.aClass87_Sub2_40.method6205((this.anInt9364 & 0x7) != 0);
		for (@Pc(201) int local201 = 0; local201 < this.aClass2_Sub28Array1.length; local201++) {
			this.aClass2_Sub28Array1[local201].method4307(local124, local128);
		}
		if (!this.aClass238_63.method5839()) {
			local140 = this.aClass87_Sub2_40.anInt7378;
			@Pc(230) int local230 = this.aClass87_Sub2_40.anInt7405;
			this.aClass87_Sub2_40.L(0, local230, this.aClass87_Sub2_40.anInt7388);
			this.aClass87_Sub2_40.method6205(false);
			this.aClass87_Sub2_40.method6225(false);
			this.aClass87_Sub2_40.method6196(128);
			this.aClass87_Sub2_40.method6228(-2);
			this.aClass87_Sub2_40.method6167(this.aClass87_Sub2_40.aClass88_Sub2_2);
			this.aClass87_Sub2_40.method6227(8448, 7681);
			this.aClass87_Sub2_40.method6206(0, 770, 34166);
			this.aClass87_Sub2_40.method6195(34167, 0);
			for (@Pc(290) Class2 local290 = this.aClass238_63.method5833(); local290 != null; local290 = this.aClass238_63.method5838()) {
				@Pc(295) Class2_Sub17 local295 = (Class2_Sub17) local290;
				local295.method1759(arg4, arg3, arg0, arg1);
			}
			this.aClass87_Sub2_40.method6206(0, 768, 5890);
			this.aClass87_Sub2_40.method6195(5890, 0);
			this.aClass87_Sub2_40.method6167(null);
			this.aClass87_Sub2_40.L(local140, local230, this.aClass87_Sub2_40.anInt7388);
		}
		if (this.aClass260_2 == null) {
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		this.aClass87_Sub2_40.method6151(this.aClass66_14, null, null, this.aClass66_16);
		this.aClass260_2.method6480(arg0, arg3, arg4, arg6, arg1);
		OpenGL.glPopMatrix();
		return;
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(Lclient!bh;[I)V")
	@Override
	public void method7820(@OriginalArg(0) Class2_Sub4 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass238_63.method5837(new Class2_Sub17(this.aClass87_Sub2_40, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!uea", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class2_Sub5_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass260_2 != null && arg0 != null) {
			@Pc(23) int local23 = arg1 - (this.aClass87_Sub2_40.anInt7392 * arg2 >> 8) >> this.aClass87_Sub2_40.anInt7367;
			@Pc(38) int local38 = arg3 - (this.aClass87_Sub2_40.anInt7381 * arg2 >> 8) >> this.aClass87_Sub2_40.anInt7367;
			this.aClass260_2.method6475(arg0, local38, local23);
		}
	}
}
