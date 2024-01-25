import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ds")
public final class Class2_Sub18 extends Class2 {

	@OriginalMember(owner = "client!ds", name = "x", descriptor = "[F")
	public static final float[] aFloatArray13 = new float[16384];

	@OriginalMember(owner = "client!ds", name = "I", descriptor = "[F")
	public static final float[] aFloatArray14 = new float[16384];

	@OriginalMember(owner = "client!ds", name = "v", descriptor = "I")
	private int anInt2102;

	@OriginalMember(owner = "client!ds", name = "s", descriptor = "Lclient!gt;")
	private final Class87_Sub1 aClass87_Sub1_5;

	@OriginalMember(owner = "client!ds", name = "D", descriptor = "Lclient!ov;")
	private final Class112_Sub2 aClass112_Sub2_2;

	@OriginalMember(owner = "client!ds", name = "l", descriptor = "Lclient!bh;")
	private final Class2_Sub4 aClass2_Sub4_2;

	@OriginalMember(owner = "client!ds", name = "t", descriptor = "I")
	private final int anInt2101;

	@OriginalMember(owner = "client!ds", name = "n", descriptor = "I")
	private final int anInt2099;

	@OriginalMember(owner = "client!ds", name = "j", descriptor = "I")
	private final int anInt2097;

	@OriginalMember(owner = "client!ds", name = "o", descriptor = "I")
	private final int anInt2100;

	@OriginalMember(owner = "client!ds", name = "q", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!ds", name = "w", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!ds", name = "z", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!ds", name = "E", descriptor = "I")
	private int anInt2107;

	@OriginalMember(owner = "client!ds", name = "u", descriptor = "Lclient!mp;")
	private Class222 aClass222_8;

	@OriginalMember(owner = "client!ds", name = "m", descriptor = "Lclient!ida;")
	private final Interface10 anInterface10_4;

	@OriginalMember(owner = "client!ds", name = "G", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream3;

	@OriginalMember(owner = "client!ds", name = "h", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream2;

	@OriginalMember(owner = "client!ds", name = "r", descriptor = "Lclient!caa;")
	private final Interface3 anInterface3_4;

	static {
		@Pc(9) double local9 = 3.834951969714103E-4D;
		for (@Pc(11) int local11 = 0; local11 < 16384; local11++) {
			aFloatArray13[local11] = (float) Math.sin(local9 * (double) local11);
			aFloatArray14[local11] = (float) Math.cos(local9 * (double) local11);
		}
	}

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lclient!gt;Lclient!ov;Lclient!bh;[I)V")
	public Class2_Sub18(@OriginalArg(0) Class87_Sub1 arg0, @OriginalArg(1) Class112_Sub2 arg1, @OriginalArg(2) Class2_Sub4 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass87_Sub1_5 = arg0;
		this.aClass112_Sub2_2 = arg1;
		this.aClass2_Sub4_2 = arg2;
		@Pc(23) int local23 = this.aClass2_Sub4_2.method8154() - (arg1.anInt9344 >> 1);
		this.anInt2101 = this.aClass2_Sub4_2.method8150() - local23 >> arg1.anInt9341;
		this.anInt2099 = this.aClass2_Sub4_2.method8150() + local23 >> arg1.anInt9341;
		this.anInt2097 = this.aClass2_Sub4_2.method8151() - local23 >> arg1.anInt9341;
		this.anInt2100 = local23 + this.aClass2_Sub4_2.method8151() >> arg1.anInt9341;
		@Pc(78) int local78 = this.anInt2099 + 1 - this.anInt2101;
		@Pc(86) int local86 = this.anInt2100 + 1 - this.anInt2097;
		this.aFloatArrayArray6 = new float[local78 + 1][local86 + 1];
		this.aFloatArrayArray7 = new float[local78 + 1][local86 + 1];
		this.aFloatArrayArray8 = new float[local78 + 1][local86 + 1];
		@Pc(122) int local122;
		@Pc(136) int local136;
		@Pc(143) int local143;
		@Pc(172) int local172;
		@Pc(188) int local188;
		for (@Pc(115) int local115 = 0; local115 <= local86; local115++) {
			local122 = local115 + this.anInt2097;
			if (local122 > 0 && local122 < this.aClass112_Sub2_2.anInt9340 - 1) {
				for (local136 = 0; local136 <= local78; local136++) {
					local143 = local136 + this.anInt2101;
					if (local143 > 0 && this.aClass112_Sub2_2.anInt9348 - 1 > local143) {
						local172 = arg1.method7819(local122, local143 + 1) - arg1.method7819(local122, local143 - 1);
						local188 = arg1.method7819(local122 + 1, local143) - arg1.method7819(local122 - 1, local143);
						@Pc(203) float local203 = (float) (1.0D / Math.sqrt((double) (local188 * local188 + local172 * local172 + 65536)));
						this.aFloatArrayArray8[local136][local115] = local203 * (float) local172;
						this.aFloatArrayArray7[local136][local115] = local203 * -256.0F;
						this.aFloatArrayArray6[local136][local115] = (float) local188 * local203;
					}
				}
			}
		}
		local122 = 0;
		@Pc(308) int local308;
		for (local136 = this.anInt2097; local136 <= this.anInt2100; local136++) {
			if (local136 >= 0 && arg1.anInt9340 > local136) {
				for (local143 = this.anInt2101; local143 <= this.anInt2099; local143++) {
					if (local143 >= 0 && local143 < arg1.anInt9348) {
						local172 = arg3[local122];
						@Pc(286) int[] local286 = arg1.anIntArrayArrayArray6[local143][local136];
						if (local286 != null && local172 != 0) {
							if (local172 == 1) {
								local308 = 0;
								while (local308 < local286.length) {
									if (local286[local308++] != -1 && local286[local308++] != -1 && local286[local308++] != -1) {
										this.anInt2107 += 3;
									}
								}
							} else {
								this.anInt2107 += 3;
							}
						}
					}
					local122++;
				}
			} else {
				local122 += this.anInt2099 - this.anInt2101;
			}
		}
		if (this.anInt2107 > 0) {
			this.aClass222_8 = new Class222(Static347.method5404(this.anInt2107));
			this.anInterface10_4 = this.aClass87_Sub1_5.method5087(false);
			this.anInterface10_4.method7675(this.anInt2107);
			@Pc(404) NativeHeapBuffer local404 = this.aClass87_Sub1_5.method5130(this.anInt2107 * 16, false);
			this.aStream3 = new Stream(local404);
			while (true) {
				@Pc(416) Buffer local416;
				do {
					local416 = this.anInterface10_4.method7682();
				} while (local416 == null);
				this.aStream2 = new Stream(local416);
				local122 = 0;
				local188 = 0;
				for (local308 = this.anInt2097; local308 <= this.anInt2100; local308++) {
					if (local308 >= 0 && local308 < arg1.anInt9340) {
						@Pc(444) int local444 = 0;
						for (@Pc(447) int local447 = this.anInt2101; local447 <= this.anInt2099; local447++) {
							if (local447 >= 0 && local447 < arg1.anInt9348) {
								@Pc(463) int local463 = arg3[local122];
								@Pc(470) int[] local470 = arg1.anIntArrayArrayArray6[local447][local308];
								if (local470 != null && local463 != 0) {
									if (local463 == 1) {
										@Pc(487) int[] local487 = arg1.anIntArrayArrayArray7[local447][local308];
										@Pc(494) int[] local494 = arg1.anIntArrayArrayArray5[local447][local308];
										@Pc(496) int local496 = 0;
										label119: while (true) {
											while (true) {
												if (local496 >= local470.length) {
													break label119;
												}
												if (local470[local496] == -1 || local470[local496 + 1] == -1 || local470[local496 + 2] == -1) {
													local496 += 3;
												} else {
													this.method1766(local308, local447, local444, local188, local494[local496], local487[local496]);
													local496++;
													this.method1766(local308, local447, local444, local188, local494[local496], local487[local496]);
													local496++;
													this.method1766(local308, local447, local444, local188, local494[local496], local487[local496]);
													local496++;
												}
											}
										}
									} else if (local463 == 3) {
										this.method1766(local308, local447, local444, local188, 0, 0);
										this.method1766(local308, local447, local444, local188, 0, arg1.anInt9344);
										this.method1766(local308, local447, local444, local188, arg1.anInt9344, 0);
									} else if (local463 == 2) {
										this.method1766(local308, local447, local444, local188, 0, arg1.anInt9344);
										this.method1766(local308, local447, local444, local188, arg1.anInt9344, arg1.anInt9344);
										this.method1766(local308, local447, local444, local188, 0, 0);
									} else if (local463 == 5) {
										this.method1766(local308, local447, local444, local188, arg1.anInt9344, arg1.anInt9344);
										this.method1766(local308, local447, local444, local188, arg1.anInt9344, 0);
										this.method1766(local308, local447, local444, local188, 0, arg1.anInt9344);
									} else if (local463 == 4) {
										this.method1766(local308, local447, local444, local188, arg1.anInt9344, 0);
										this.method1766(local308, local447, local444, local188, 0, 0);
										this.method1766(local308, local447, local444, local188, arg1.anInt9344, arg1.anInt9344);
									}
								}
							}
							local122++;
							local444++;
						}
					} else {
						local122 += this.anInt2099 - this.anInt2101;
					}
					local188++;
				}
				this.aStream2.a();
				if (this.anInterface10_4.method7683()) {
					this.aStream3.a();
					this.anInterface3_4 = this.aClass87_Sub1_5.method5043(false);
					this.anInterface3_4.method7188(local404, 16, this.anInt2102 * 16);
					break;
				}
				this.aStream3.f(0);
				this.aClass222_8.method5469();
			}
		} else {
			this.anInterface10_4 = null;
			this.anInterface3_4 = null;
		}
		this.aStream2 = null;
		this.aStream3 = null;
		this.aClass222_8 = null;
		this.aFloatArrayArray8 = this.aFloatArrayArray7 = this.aFloatArrayArray6 = null;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIII[[Z)V")
	public void method1764(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean[][] arg3) {
		if (this.anInterface10_4 == null || (arg1 + arg0 < this.anInt2101 || (this.anInt2099 < arg0 - arg1 || (this.anInt2097 > arg2 + arg1 || this.anInt2100 < arg2 - arg1)))) {
			return;
		}
		for (@Pc(61) int local61 = this.anInt2097; local61 <= this.anInt2100; local61++) {
			for (@Pc(66) int local66 = this.anInt2101; local66 <= this.anInt2099; local66++) {
				@Pc(73) int local73 = local66 - arg0;
				@Pc(77) int local77 = local61 - arg2;
				if (local73 > -arg1 && arg1 > local73 && local77 > -arg1 && arg1 > local77 && arg3[local73 + arg1][local77 + arg1]) {
					this.aClass87_Sub1_5.method5055((byte) (this.aClass2_Sub4_2.method8156() * 255.0F));
					this.aClass87_Sub1_5.method5148(this.anInterface3_4, 0);
					this.aClass87_Sub1_5.method5110(this.aClass87_Sub1_5.aClass147_16);
					this.aClass87_Sub1_5.method5136(0, this.anInt2102, this.anInterface10_4, this.anInt2107 / 3, Static562.aClass334_7, 0);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(BS)V")
	private void method1765(@OriginalArg(1) short arg0) {
		if (Stream.b()) {
			this.aStream2.c(arg0);
		} else {
			this.aStream2.d(arg0);
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIZIIII)V")
	private void method1766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) long local11 = -1L;
		@Pc(19) int local19 = (arg1 << this.aClass112_Sub2_2.anInt9341) + arg5;
		@Pc(28) int local28 = arg4 + (arg0 << this.aClass112_Sub2_2.anInt9341);
		@Pc(35) int local35 = this.aClass112_Sub2_2.method7826(local19, local28);
		if ((arg5 & 0x7F) == 0 || (arg4 & 0x7F) == 0) {
			local11 = (long) local19 & 0xFFFFL | ((long) local28 & 0xFFFFL) << 16;
			@Pc(61) Class2 local61 = this.aClass222_8.method5468(local11);
			if (local61 != null) {
				this.method1765(((Class2_Sub19) local61).aShort41);
				return;
			}
		}
		@Pc(79) short local79 = (short) this.anInt2102++;
		if (local11 != -1L) {
			this.aClass222_8.method5476(new Class2_Sub19(local79), local11);
		}
		@Pc(122) float local122;
		@Pc(115) float local115;
		@Pc(108) float local108;
		@Pc(195) float local195;
		@Pc(203) float local203;
		@Pc(210) float local210;
		@Pc(217) float local217;
		@Pc(224) float local224;
		@Pc(233) float local233;
		@Pc(242) float local242;
		@Pc(332) float local332;
		if (arg5 == 0 && arg4 == 0) {
			local108 = this.aFloatArrayArray6[arg2][arg3];
			local115 = this.aFloatArrayArray7[arg2][arg3];
			local122 = this.aFloatArrayArray8[arg2][arg3];
		} else if (arg5 == this.aClass112_Sub2_2.anInt9344 && arg4 == 0) {
			local108 = this.aFloatArrayArray6[arg2 + 1][arg3];
			local115 = this.aFloatArrayArray7[arg2 + 1][arg3];
			local122 = this.aFloatArrayArray8[arg2 + 1][arg3];
		} else if (this.aClass112_Sub2_2.anInt9344 == arg5 && arg4 == this.aClass112_Sub2_2.anInt9344) {
			local115 = this.aFloatArrayArray7[arg2 + 1][arg3 + 1];
			local122 = this.aFloatArrayArray8[arg2 + 1][arg3 + 1];
			local108 = this.aFloatArrayArray6[arg2 + 1][arg3 + 1];
		} else if (arg5 == 0 && this.aClass112_Sub2_2.anInt9344 == arg4) {
			local108 = this.aFloatArrayArray6[arg2][arg3 + 1];
			local115 = this.aFloatArrayArray7[arg2][arg3 + 1];
			local122 = this.aFloatArrayArray8[arg2][arg3 + 1];
		} else {
			local195 = (float) arg5 / (float) this.aClass112_Sub2_2.anInt9344;
			local203 = (float) arg4 / (float) this.aClass112_Sub2_2.anInt9344;
			local210 = this.aFloatArrayArray8[arg2][arg3];
			local217 = this.aFloatArrayArray7[arg2][arg3];
			local224 = this.aFloatArrayArray6[arg2][arg3];
			local233 = this.aFloatArrayArray8[arg2 + 1][arg3];
			local242 = this.aFloatArrayArray7[arg2 + 1][arg3];
			@Pc(257) float local257 = local224 + (this.aFloatArrayArray6[arg2][arg3 + 1] - local224) * local195;
			@Pc(275) float local275 = local242 + local195 * (this.aFloatArrayArray7[arg2 + 1][arg3 + 1] - local242);
			@Pc(290) float local290 = local217 + (this.aFloatArrayArray7[arg2][arg3 + 1] - local217) * local195;
			@Pc(306) float local306 = local210 + (this.aFloatArrayArray8[arg2][arg3 + 1] - local210) * local195;
			@Pc(323) float local323 = local233 + (this.aFloatArrayArray8[arg2 + 1][arg3 + 1] - local233) * local195;
			local332 = this.aFloatArrayArray6[arg2 + 1][arg3];
			local122 = local306 + local203 * (local323 - local306);
			local115 = local290 + local203 * (local275 - local290);
			@Pc(367) float local367 = local332 + (this.aFloatArrayArray6[arg2 + 1][arg3 + 1] - local332) * local195;
			local108 = local203 * (local367 - local257) + local257;
		}
		local195 = this.aClass2_Sub4_2.method8150() - local19;
		local203 = this.aClass2_Sub4_2.method8158() - local35;
		local210 = this.aClass2_Sub4_2.method8151() - local28;
		local217 = (float) Math.sqrt((double) (local210 * local210 + local203 * local203 + local195 * local195));
		local224 = 1.0F / local217;
		local210 *= local224;
		local195 *= local224;
		local203 *= local224;
		local233 = local217 / (float) this.aClass2_Sub4_2.method8154();
		local242 = 1.0F - local233 * local233;
		if (local242 < 0.0F) {
			local242 = 0.0F;
		}
		local332 = local203 * local115 + local195 * local122 + local210 * local108;
		if (local332 < 0.0F) {
			local332 = 0.0F;
		}
		@Pc(546) float local546 = local332 * local242 * 2.0F;
		if (local546 > 1.0F) {
			local546 = 1.0F;
		}
		@Pc(557) int local557 = this.aClass2_Sub4_2.method8152();
		@Pc(567) int local567 = (int) ((float) (local557 >> 16 & 0xFF) * local546);
		if (local567 > 255) {
			local567 = 255;
		}
		@Pc(584) int local584 = (int) (local546 * (float) (local557 >> 8 & 0xFF));
		if (local584 > 255) {
			local584 = 255;
		}
		@Pc(597) int local597 = (int) (local546 * (float) (local557 & 0xFF));
		if (Stream.b()) {
			this.aStream3.b((float) local19);
			this.aStream3.b((float) local35);
			this.aStream3.b((float) local28);
		} else {
			this.aStream3.a((float) local19);
			this.aStream3.a((float) local35);
			this.aStream3.a((float) local28);
		}
		if (local597 > 255) {
			local597 = 255;
		}
		if (this.aClass87_Sub1_5.anInt6133 == 0) {
			this.aStream3.e(local597);
			this.aStream3.e(local584);
			this.aStream3.e(local567);
		} else {
			this.aStream3.e(local567);
			this.aStream3.e(local584);
			this.aStream3.e(local597);
		}
		this.aStream3.e(255);
		this.method1765(local79);
	}
}
