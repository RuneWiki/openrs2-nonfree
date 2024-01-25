import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hga")
public final class Class2_Sub19 extends Class2 {

	@OriginalMember(owner = "client!hga", name = "p", descriptor = "I")
	private int anInt2922;

	@OriginalMember(owner = "client!hga", name = "q", descriptor = "Lclient!um;")
	private final Class162_Sub1 aClass162_Sub1_10;

	@OriginalMember(owner = "client!hga", name = "x", descriptor = "Lclient!om;")
	private final Class151_Sub1 aClass151_Sub1_2;

	@OriginalMember(owner = "client!hga", name = "v", descriptor = "Lclient!tg;")
	private final Class2_Sub11 aClass2_Sub11_2;

	@OriginalMember(owner = "client!hga", name = "l", descriptor = "I")
	private final int anInt2920;

	@OriginalMember(owner = "client!hga", name = "C", descriptor = "I")
	private final int anInt2928;

	@OriginalMember(owner = "client!hga", name = "t", descriptor = "I")
	private final int anInt2924;

	@OriginalMember(owner = "client!hga", name = "D", descriptor = "I")
	private final int anInt2929;

	@OriginalMember(owner = "client!hga", name = "j", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!hga", name = "n", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!hga", name = "A", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!hga", name = "k", descriptor = "I")
	private int anInt2919;

	@OriginalMember(owner = "client!hga", name = "y", descriptor = "Lclient!ega;")
	private final Interface8 anInterface8_3;

	@OriginalMember(owner = "client!hga", name = "m", descriptor = "Lclient!ip;")
	private final Interface13 anInterface13_1;

	@OriginalMember(owner = "client!hga", name = "r", descriptor = "Lclient!efa;")
	private Class90 aClass90_8;

	@OriginalMember(owner = "client!hga", name = "i", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream2;

	@OriginalMember(owner = "client!hga", name = "z", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream3;

	@OriginalMember(owner = "client!hga", name = "<init>", descriptor = "(Lclient!um;Lclient!om;Lclient!tg;[I)V")
	public Class2_Sub19(@OriginalArg(0) Class162_Sub1 arg0, @OriginalArg(1) Class151_Sub1 arg1, @OriginalArg(2) Class2_Sub11 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass162_Sub1_10 = arg0;
		this.aClass151_Sub1_2 = arg1;
		this.aClass2_Sub11_2 = arg2;
		@Pc(22) int local22 = this.aClass2_Sub11_2.method7277() - (arg1.anInt9573 >> 1);
		this.anInt2920 = this.aClass2_Sub11_2.method7276() - local22 >> arg1.anInt9568;
		this.anInt2928 = local22 + this.aClass2_Sub11_2.method7276() >> arg1.anInt9568;
		this.anInt2924 = this.aClass2_Sub11_2.method7271() - local22 >> arg1.anInt9568;
		this.anInt2929 = this.aClass2_Sub11_2.method7271() + local22 >> arg1.anInt9568;
		@Pc(76) int local76 = this.anInt2928 + 1 - this.anInt2920;
		@Pc(85) int local85 = this.anInt2929 + 1 - this.anInt2924;
		this.aFloatArrayArray2 = new float[local76 + 1][local85 + 1];
		this.aFloatArrayArray3 = new float[local76 + 1][local85 + 1];
		this.aFloatArrayArray4 = new float[local76 + 1][local85 + 1];
		@Pc(122) int local122;
		@Pc(133) int local133;
		@Pc(140) int local140;
		@Pc(172) int local172;
		@Pc(189) int local189;
		for (@Pc(114) int local114 = 0; local114 <= local85; local114++) {
			local122 = local114 + this.anInt2924;
			if (local122 > 0 && local122 < this.aClass151_Sub1_2.anInt9574 - 1) {
				for (local133 = 0; local133 <= local76; local133++) {
					local140 = this.anInt2920 + local133;
					if (local140 > 0 && this.aClass151_Sub1_2.anInt9572 - 1 > local140) {
						local172 = arg1.method7676(local122, local140 + 1) - arg1.method7676(local122, local140 - 1);
						local189 = arg1.method7676(local122 + 1, local140) - arg1.method7676(local122 - 1, local140);
						@Pc(204) float local204 = (float) (1.0D / Math.sqrt((double) (local189 * local189 + local172 * local172 + 65536)));
						this.aFloatArrayArray2[local133][local114] = (float) local172 * local204;
						this.aFloatArrayArray4[local133][local114] = local204 * -256.0F;
						this.aFloatArrayArray3[local133][local114] = local204 * (float) local189;
					}
				}
			}
		}
		local122 = 0;
		@Pc(306) int local306;
		for (local133 = this.anInt2924; local133 <= this.anInt2929; local133++) {
			if (local133 >= 0 && arg1.anInt9574 > local133) {
				for (local140 = this.anInt2920; local140 <= this.anInt2928; local140++) {
					if (local140 >= 0 && arg1.anInt9572 > local140) {
						local172 = arg3[local122];
						@Pc(287) int[] local287 = arg1.anIntArrayArrayArray12[local140][local133];
						if (local287 != null && local172 != 0) {
							if (local172 == 1) {
								local306 = 0;
								while (local287.length > local306) {
									if (local287[local306++] != -1 && local287[local306++] != -1 && local287[local306++] != -1) {
										this.anInt2919 += 3;
									}
								}
							} else {
								this.anInt2919 += 3;
							}
						}
					}
					local122++;
				}
			} else {
				local122 += this.anInt2928 - this.anInt2920;
			}
		}
		if (this.anInt2919 <= 0) {
			this.anInterface8_3 = null;
			this.anInterface13_1 = null;
		} else {
			this.aClass90_8 = new Class90(Static355.method5078(this.anInt2919));
			this.anInterface13_1 = this.aClass162_Sub1_10.method3889(false);
			this.anInterface13_1.method7035(this.anInt2919);
			@Pc(408) NativeHeapBuffer local408 = this.aClass162_Sub1_10.method3839(false, this.anInt2919 * 16);
			this.aStream2 = new Stream(local408);
			while (true) {
				@Pc(420) Buffer local420;
				do {
					local420 = this.anInterface13_1.method7034();
				} while (local420 == null);
				this.aStream3 = new Stream(local420);
				local122 = 0;
				local189 = 0;
				for (local306 = this.anInt2924; local306 <= this.anInt2929; local306++) {
					if (local306 >= 0 && arg1.anInt9574 > local306) {
						@Pc(456) int local456 = 0;
						for (@Pc(459) int local459 = this.anInt2920; local459 <= this.anInt2928; local459++) {
							if (local459 >= 0 && local459 < arg1.anInt9572) {
								@Pc(471) int local471 = arg3[local122];
								@Pc(478) int[] local478 = arg1.anIntArrayArrayArray12[local459][local306];
								if (local478 != null && local471 != 0) {
									if (local471 == 1) {
										@Pc(495) int[] local495 = arg1.anIntArrayArrayArray8[local459][local306];
										@Pc(502) int[] local502 = arg1.anIntArrayArrayArray13[local459][local306];
										@Pc(504) int local504 = 0;
										label119: while (true) {
											while (true) {
												if (local478.length <= local504) {
													break label119;
												}
												if (local478[local504] == -1 || local478[local504 + 1] == -1 || local478[local504 + 2] == -1) {
													local504 += 3;
												} else {
													this.method2512(local459, local306, local189, local456, local495[local504], local502[local504]);
													local504++;
													this.method2512(local459, local306, local189, local456, local495[local504], local502[local504]);
													local504++;
													this.method2512(local459, local306, local189, local456, local495[local504], local502[local504]);
													local504++;
												}
											}
										}
									} else if (local471 == 3) {
										this.method2512(local459, local306, local189, local456, 0, 0);
										this.method2512(local459, local306, local189, local456, arg1.anInt9573, 0);
										this.method2512(local459, local306, local189, local456, 0, arg1.anInt9573);
									} else if (local471 == 2) {
										this.method2512(local459, local306, local189, local456, arg1.anInt9573, 0);
										this.method2512(local459, local306, local189, local456, arg1.anInt9573, arg1.anInt9573);
										this.method2512(local459, local306, local189, local456, 0, 0);
									} else if (local471 == 5) {
										this.method2512(local459, local306, local189, local456, arg1.anInt9573, arg1.anInt9573);
										this.method2512(local459, local306, local189, local456, 0, arg1.anInt9573);
										this.method2512(local459, local306, local189, local456, arg1.anInt9573, 0);
									} else if (local471 == 4) {
										this.method2512(local459, local306, local189, local456, 0, arg1.anInt9573);
										this.method2512(local459, local306, local189, local456, 0, 0);
										this.method2512(local459, local306, local189, local456, arg1.anInt9573, arg1.anInt9573);
									}
								}
							}
							local456++;
							local122++;
						}
					} else {
						local122 += this.anInt2928 - this.anInt2920;
					}
					local189++;
				}
				this.aStream3.c();
				if (this.anInterface13_1.method7033()) {
					this.aStream2.c();
					this.anInterface8_3 = this.aClass162_Sub1_10.method3826(false);
					this.anInterface8_3.method5366(16, local408, this.anInt2922 * 16);
					break;
				}
				this.aStream2.a(0);
				this.aClass90_8.method1678();
			}
		}
		this.aClass90_8 = null;
		this.aStream2 = null;
		this.aStream3 = null;
		this.aFloatArrayArray2 = this.aFloatArrayArray4 = this.aFloatArrayArray3 = null;
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(SI)V")
	private void method2509(@OriginalArg(0) short arg0) {
		if (Stream.b()) {
			this.aStream3.e(arg0);
		} else {
			this.aStream3.b(arg0);
		}
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(I[[ZIII)V")
	public void method2510(@OriginalArg(0) int arg0, @OriginalArg(1) boolean[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface13_1 == null || (arg2 + arg0 < this.anInt2920 || (arg2 - arg0 > this.anInt2928 || (arg3 + arg0 < this.anInt2924 || arg3 - arg0 > this.anInt2929)))) {
			return;
		}
		for (@Pc(60) int local60 = this.anInt2924; local60 <= this.anInt2929; local60++) {
			for (@Pc(65) int local65 = this.anInt2920; local65 <= this.anInt2928; local65++) {
				@Pc(71) int local71 = local65 - arg2;
				@Pc(76) int local76 = local60 - arg3;
				if (-arg0 < local71 && arg0 > local71 && -arg0 < local76 && arg0 > local76 && arg1[local71 + arg0][local76 + arg0]) {
					this.aClass162_Sub1_10.method3840((byte) (this.aClass2_Sub11_2.method7280() * 255.0F));
					this.aClass162_Sub1_10.method3954(this.anInterface8_3, 0);
					this.aClass162_Sub1_10.method3882(this.aClass162_Sub1_10.aClass59_17);
					this.aClass162_Sub1_10.method3892(0, this.anInt2922, Static523.aClass155_6, this.anInt2919 / 3, this.anInterface13_1, 0);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(IIIIBII)V")
	private void method2512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg0 << this.aClass151_Sub1_2.anInt9568) + arg4;
		@Pc(23) int local23 = (arg1 << this.aClass151_Sub1_2.anInt9568) + arg5;
		@Pc(30) int local30 = this.aClass151_Sub1_2.method7680(local15, local23);
		if ((arg4 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			local7 = ((long) local23 & 0xFFFFL) << 16 | (long) local15 & 0xFFFFL;
			@Pc(59) Class2 local59 = this.aClass90_8.method1685(local7);
			if (local59 != null) {
				this.method2509(((Class2_Sub43) local59).aShort96);
				return;
			}
		}
		@Pc(77) short local77 = (short) this.anInt2922++;
		if (local7 != -1L) {
			this.aClass90_8.method1684(new Class2_Sub43(local77), local7);
		}
		@Pc(117) float local117;
		@Pc(135) float local135;
		@Pc(126) float local126;
		@Pc(208) float local208;
		@Pc(216) float local216;
		@Pc(223) float local223;
		@Pc(230) float local230;
		@Pc(237) float local237;
		@Pc(246) float local246;
		@Pc(255) float local255;
		@Pc(298) float local298;
		if (arg4 == 0 && arg5 == 0) {
			local117 = this.aFloatArrayArray2[arg3][arg2];
			local135 = this.aFloatArrayArray4[arg3][arg2];
			local126 = this.aFloatArrayArray3[arg3][arg2];
		} else if (this.aClass151_Sub1_2.anInt9573 == arg4 && arg5 == 0) {
			local117 = this.aFloatArrayArray2[arg3 + 1][arg2];
			local126 = this.aFloatArrayArray3[arg3 + 1][arg2];
			local135 = this.aFloatArrayArray4[arg3 + 1][arg2];
		} else if (this.aClass151_Sub1_2.anInt9573 == arg4 && arg5 == this.aClass151_Sub1_2.anInt9573) {
			local126 = this.aFloatArrayArray3[arg3 + 1][arg2 + 1];
			local117 = this.aFloatArrayArray2[arg3 + 1][arg2 + 1];
			local135 = this.aFloatArrayArray4[arg3 + 1][arg2 + 1];
		} else if (arg4 == 0 && this.aClass151_Sub1_2.anInt9573 == arg5) {
			local117 = this.aFloatArrayArray2[arg3][arg2 + 1];
			local126 = this.aFloatArrayArray3[arg3][arg2 + 1];
			local135 = this.aFloatArrayArray4[arg3][arg2 + 1];
		} else {
			local208 = (float) arg4 / (float) this.aClass151_Sub1_2.anInt9573;
			local216 = (float) arg5 / (float) this.aClass151_Sub1_2.anInt9573;
			local223 = this.aFloatArrayArray2[arg3][arg2];
			local230 = this.aFloatArrayArray4[arg3][arg2];
			local237 = this.aFloatArrayArray3[arg3][arg2];
			local246 = this.aFloatArrayArray2[arg3 + 1][arg2];
			local255 = this.aFloatArrayArray4[arg3 + 1][arg2];
			@Pc(273) float local273 = local255 + (this.aFloatArrayArray4[arg3 + 1][arg2 + 1] - local255) * local208;
			@Pc(289) float local289 = local230 + (this.aFloatArrayArray4[arg3][arg2 + 1] - local230) * local208;
			local298 = this.aFloatArrayArray3[arg3 + 1][arg2];
			@Pc(313) float local313 = local237 + (this.aFloatArrayArray3[arg3][arg2 + 1] - local237) * local208;
			@Pc(329) float local329 = local223 + local208 * (this.aFloatArrayArray2[arg3][arg2 + 1] - local223);
			@Pc(347) float local347 = local246 + (this.aFloatArrayArray2[arg3 + 1][arg2 + 1] - local246) * local208;
			@Pc(365) float local365 = local298 + (this.aFloatArrayArray3[arg3 + 1][arg2 + 1] - local298) * local208;
			local117 = local329 + (local347 - local329) * local216;
			local135 = local289 + (local273 - local289) * local216;
			local126 = local313 + local216 * (local365 - local313);
		}
		local208 = this.aClass2_Sub11_2.method7276() - local15;
		local216 = this.aClass2_Sub11_2.method7270() - local30;
		local223 = this.aClass2_Sub11_2.method7271() - local23;
		local230 = (float) Math.sqrt((double) (local223 * local223 + local208 * local208 + local216 * local216));
		local237 = 1.0F / local230;
		local223 *= local237;
		local208 *= local237;
		local216 *= local237;
		local246 = local230 / (float) this.aClass2_Sub11_2.method7277();
		local255 = 1.0F - local246 * local246;
		if (local255 < 0.0F) {
			local255 = 0.0F;
		}
		local298 = local126 * local223 + local135 * local216 + local117 * local208;
		if (local298 < 0.0F) {
			local298 = 0.0F;
		}
		@Pc(546) float local546 = local298 * 2.0F * local255;
		if (local546 > 1.0F) {
			local546 = 1.0F;
		}
		@Pc(559) int local559 = this.aClass2_Sub11_2.method7274();
		@Pc(569) int local569 = (int) ((float) (local559 >> 16 & 0xFF) * local546);
		if (local569 > 255) {
			local569 = 255;
		}
		@Pc(584) int local584 = (int) (local546 * (float) (local559 >> 8 & 0xFF));
		if (local584 > 255) {
			local584 = 255;
		}
		@Pc(603) int local603 = (int) (local546 * (float) (local559 & 0xFF));
		if (local603 > 255) {
			local603 = 255;
		}
		if (Stream.b()) {
			this.aStream2.a((float) local15);
			this.aStream2.a((float) local30);
			this.aStream2.a((float) local23);
		} else {
			this.aStream2.b((float) local15);
			this.aStream2.b((float) local30);
			this.aStream2.b((float) local23);
		}
		if (this.aClass162_Sub1_10.anInt4620 == 0) {
			this.aStream2.d(local603);
			this.aStream2.d(local584);
			this.aStream2.d(local569);
		} else {
			this.aStream2.d(local569);
			this.aStream2.d(local584);
			this.aStream2.d(local603);
		}
		this.aStream2.d(255);
		this.method2509(local77);
	}
}
