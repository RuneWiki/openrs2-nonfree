import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public final class Class5_Sub5 extends Class5 {

	@OriginalMember(owner = "client!ap", name = "n", descriptor = "I")
	private int anInt280;

	@OriginalMember(owner = "client!ap", name = "D", descriptor = "Lclient!ih;")
	private final Class5_Sub12 aClass5_Sub12_1;

	@OriginalMember(owner = "client!ap", name = "w", descriptor = "Lclient!gca;")
	private final Class100_Sub1 aClass100_Sub1_1;

	@OriginalMember(owner = "client!ap", name = "u", descriptor = "Lclient!kb;")
	private final Class84_Sub2 aClass84_Sub2_1;

	@OriginalMember(owner = "client!ap", name = "l", descriptor = "I")
	private final int anInt290;

	@OriginalMember(owner = "client!ap", name = "z", descriptor = "I")
	private final int anInt287;

	@OriginalMember(owner = "client!ap", name = "G", descriptor = "I")
	private final int anInt288;

	@OriginalMember(owner = "client!ap", name = "r", descriptor = "I")
	private final int anInt283;

	@OriginalMember(owner = "client!ap", name = "m", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!ap", name = "J", descriptor = "[[F")
	private float[][] aFloatArrayArray1;

	@OriginalMember(owner = "client!ap", name = "p", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!ap", name = "o", descriptor = "I")
	private int anInt286;

	@OriginalMember(owner = "client!ap", name = "H", descriptor = "Lclient!fk;")
	private final Interface15 anInterface15_3;

	@OriginalMember(owner = "client!ap", name = "q", descriptor = "Lclient!lp;")
	private final Interface20 anInterface20_2;

	@OriginalMember(owner = "client!ap", name = "s", descriptor = "Lclient!qr;")
	private Class306 aClass306_3;

	@OriginalMember(owner = "client!ap", name = "C", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream2;

	@OriginalMember(owner = "client!ap", name = "v", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream1;

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Lclient!gca;Lclient!kb;Lclient!ih;[I)V")
	public Class5_Sub5(@OriginalArg(0) Class100_Sub1 arg0, @OriginalArg(1) Class84_Sub2 arg1, @OriginalArg(2) Class5_Sub12 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass5_Sub12_1 = arg2;
		this.aClass100_Sub1_1 = arg0;
		this.aClass84_Sub2_1 = arg1;
		@Pc(22) int local22 = this.aClass5_Sub12_1.method4531() - (arg1.anInt8881 >> 1);
		this.anInt290 = this.aClass5_Sub12_1.method4537() - local22 >> arg1.anInt8885;
		this.anInt287 = this.aClass5_Sub12_1.method4537() + local22 >> arg1.anInt8885;
		this.anInt288 = this.aClass5_Sub12_1.method4534() - local22 >> arg1.anInt8885;
		this.anInt283 = local22 + this.aClass5_Sub12_1.method4534() >> arg1.anInt8885;
		@Pc(75) int local75 = this.anInt287 + 1 - this.anInt290;
		@Pc(84) int local84 = this.anInt283 + 1 - this.anInt288;
		this.aFloatArrayArray3 = new float[local75 + 1][local84 + 1];
		this.aFloatArrayArray1 = new float[local75 + 1][local84 + 1];
		this.aFloatArrayArray2 = new float[local75 + 1][local84 + 1];
		@Pc(120) int local120;
		@Pc(137) int local137;
		@Pc(144) int local144;
		@Pc(172) int local172;
		@Pc(189) int local189;
		for (@Pc(113) int local113 = 0; local113 <= local84; local113++) {
			local120 = this.anInt288 + local113;
			if (local120 > 0 && local120 < this.aClass84_Sub2_1.anInt8878 - 1) {
				for (local137 = 0; local137 <= local75; local137++) {
					local144 = this.anInt290 + local137;
					if (local144 > 0 && this.aClass84_Sub2_1.anInt8883 - 1 > local144) {
						local172 = arg1.method7620(local120, local144 + 1) - arg1.method7620(local120, local144 - 1);
						local189 = arg1.method7620(local120 + 1, local144) - arg1.method7620(local120 - 1, local144);
						@Pc(204) float local204 = (float) (1.0D / Math.sqrt((double) (local189 * local189 + local172 * local172 + 65536)));
						this.aFloatArrayArray1[local137][local113] = (float) local172 * local204;
						this.aFloatArrayArray2[local137][local113] = -256.0F * local204;
						this.aFloatArrayArray3[local137][local113] = local204 * (float) local189;
					}
				}
			}
		}
		local120 = 0;
		@Pc(324) int local324;
		for (local137 = this.anInt288; local137 <= this.anInt283; local137++) {
			if (local137 >= 0 && arg1.anInt8878 > local137) {
				for (local144 = this.anInt290; local144 <= this.anInt287; local144++) {
					if (local144 >= 0 && local144 < arg1.anInt8883) {
						local172 = arg3[local120];
						@Pc(306) int[] local306 = arg1.anIntArrayArrayArray15[local144][local137];
						if (local306 != null && local172 != 0) {
							if (local172 == 1) {
								local324 = 0;
								while (local324 < local306.length) {
									if (local306[local324++] != -1 && local306[local324++] != -1 && local306[local324++] != -1) {
										this.anInt286 += 3;
									}
								}
							} else {
								this.anInt286 += 3;
							}
						}
					}
					local120++;
				}
			} else {
				local120 += this.anInt287 - this.anInt290;
			}
		}
		if (this.anInt286 <= 0) {
			this.anInterface15_3 = null;
			this.anInterface20_2 = null;
		} else {
			this.aClass306_3 = new Class306(Static146.method2737(this.anInt286));
			this.anInterface20_2 = this.aClass100_Sub1_1.method7882(false);
			this.anInterface20_2.method7350(this.anInt286);
			@Pc(443) NativeHeapBuffer local443 = this.aClass100_Sub1_1.method7892(false, this.anInt286 * 16);
			this.aStream2 = new Stream(local443);
			while (true) {
				@Pc(455) Buffer local455;
				do {
					local455 = this.anInterface20_2.method7347();
				} while (local455 == null);
				this.aStream1 = new Stream(local455);
				local189 = 0;
				local120 = 0;
				for (local324 = this.anInt288; local324 <= this.anInt283; local324++) {
					if (local324 >= 0 && arg1.anInt8878 > local324) {
						@Pc(488) int local488 = 0;
						for (@Pc(491) int local491 = this.anInt290; local491 <= this.anInt287; local491++) {
							if (local491 >= 0 && local491 < arg1.anInt8883) {
								@Pc(510) int local510 = arg3[local120];
								@Pc(517) int[] local517 = arg1.anIntArrayArrayArray15[local491][local324];
								if (local517 != null && local510 != 0) {
									if (local510 == 1) {
										@Pc(700) int[] local700 = arg1.anIntArrayArrayArray13[local491][local324];
										@Pc(707) int[] local707 = arg1.anIntArrayArrayArray10[local491][local324];
										@Pc(709) int local709 = 0;
										label119: while (true) {
											while (true) {
												if (local709 >= local517.length) {
													break label119;
												}
												if (local517[local709] == -1 || local517[local709 + 1] == -1 || local517[local709 + 2] == -1) {
													local709 += 3;
												} else {
													this.method342(local491, local707[local709], local488, local700[local709], local324, local189);
													local709++;
													this.method342(local491, local707[local709], local488, local700[local709], local324, local189);
													local709++;
													this.method342(local491, local707[local709], local488, local700[local709], local324, local189);
													local709++;
												}
											}
										}
									} else if (local510 == 3) {
										this.method342(local491, 0, local488, 0, local324, local189);
										this.method342(local491, 0, local488, arg1.anInt8881, local324, local189);
										this.method342(local491, arg1.anInt8881, local488, 0, local324, local189);
									} else if (local510 == 2) {
										this.method342(local491, 0, local488, arg1.anInt8881, local324, local189);
										this.method342(local491, arg1.anInt8881, local488, arg1.anInt8881, local324, local189);
										this.method342(local491, 0, local488, 0, local324, local189);
									} else if (local510 == 5) {
										this.method342(local491, arg1.anInt8881, local488, arg1.anInt8881, local324, local189);
										this.method342(local491, arg1.anInt8881, local488, 0, local324, local189);
										this.method342(local491, 0, local488, arg1.anInt8881, local324, local189);
									} else if (local510 == 4) {
										this.method342(local491, arg1.anInt8881, local488, 0, local324, local189);
										this.method342(local491, 0, local488, 0, local324, local189);
										this.method342(local491, arg1.anInt8881, local488, arg1.anInt8881, local324, local189);
									}
								}
							}
							local488++;
							local120++;
						}
					} else {
						local120 += this.anInt287 - this.anInt290;
					}
					local189++;
				}
				this.aStream1.b();
				if (this.anInterface20_2.method7349()) {
					this.aStream2.b();
					this.anInterface15_3 = this.aClass100_Sub1_1.method7920(false);
					this.anInterface15_3.method5732(16, this.anInt280 * 16, local443);
					break;
				}
				this.aStream2.d(0);
				this.aClass306_3.method6936();
			}
		}
		this.aFloatArrayArray1 = this.aFloatArrayArray2 = this.aFloatArrayArray3 = null;
		this.aStream2 = null;
		this.aClass306_3 = null;
		this.aStream1 = null;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIIIIZ)V")
	private void method342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg0 << this.aClass84_Sub2_1.anInt8885) + arg3;
		@Pc(24) int local24 = arg1 + (arg4 << this.aClass84_Sub2_1.anInt8885);
		@Pc(31) int local31 = this.aClass84_Sub2_1.method7625(local15, local24);
		if ((arg3 & 0x7F) == 0 || (arg1 & 0x7F) == 0) {
			local7 = 0xFFFFL << 16 & (long) local24 << 16 | (long) local15 & 0xFFFFL;
			@Pc(68) Class5 local68 = this.aClass306_3.method6943(local7);
			if (local68 != null) {
				this.method344(((Class5_Sub54) local68).aShort127);
				return;
			}
		}
		@Pc(87) short local87 = (short) this.anInt280++;
		if (local7 != -1L) {
			this.aClass306_3.method6944(new Class5_Sub54(local87), local7, -12002);
		}
		@Pc(161) float local161;
		@Pc(143) float local143;
		@Pc(152) float local152;
		@Pc(260) float local260;
		@Pc(268) float local268;
		@Pc(275) float local275;
		@Pc(282) float local282;
		@Pc(289) float local289;
		@Pc(298) float local298;
		@Pc(307) float local307;
		@Pc(381) float local381;
		if (arg3 == 0 && arg1 == 0) {
			local161 = this.aFloatArrayArray1[arg2][arg5];
			local152 = this.aFloatArrayArray3[arg2][arg5];
			local143 = this.aFloatArrayArray2[arg2][arg5];
		} else if (arg3 == this.aClass84_Sub2_1.anInt8881 && arg1 == 0) {
			local143 = this.aFloatArrayArray2[arg2 + 1][arg5];
			local152 = this.aFloatArrayArray3[arg2 + 1][arg5];
			local161 = this.aFloatArrayArray1[arg2 + 1][arg5];
		} else if (arg3 == this.aClass84_Sub2_1.anInt8881 && arg1 == this.aClass84_Sub2_1.anInt8881) {
			local143 = this.aFloatArrayArray2[arg2 + 1][arg5 + 1];
			local161 = this.aFloatArrayArray1[arg2 + 1][arg5 + 1];
			local152 = this.aFloatArrayArray3[arg2 + 1][arg5 + 1];
		} else if (arg3 == 0 && arg1 == this.aClass84_Sub2_1.anInt8881) {
			local152 = this.aFloatArrayArray3[arg2][arg5 + 1];
			local143 = this.aFloatArrayArray2[arg2][arg5 + 1];
			local161 = this.aFloatArrayArray1[arg2][arg5 + 1];
		} else {
			local260 = (float) arg3 / (float) this.aClass84_Sub2_1.anInt8881;
			local268 = (float) arg1 / (float) this.aClass84_Sub2_1.anInt8881;
			local275 = this.aFloatArrayArray1[arg2][arg5];
			local282 = this.aFloatArrayArray2[arg2][arg5];
			local289 = this.aFloatArrayArray3[arg2][arg5];
			local298 = this.aFloatArrayArray1[arg2 + 1][arg5];
			local307 = this.aFloatArrayArray2[arg2 + 1][arg5];
			@Pc(324) float local324 = local307 + local260 * (this.aFloatArrayArray2[arg2 + 1][arg5 + 1] - local307);
			@Pc(339) float local339 = local282 + (this.aFloatArrayArray2[arg2][arg5 + 1] - local282) * local260;
			@Pc(355) float local355 = local275 + (this.aFloatArrayArray1[arg2][arg5 + 1] - local275) * local260;
			@Pc(372) float local372 = local298 + (this.aFloatArrayArray1[arg2 + 1][arg5 + 1] - local298) * local260;
			local381 = this.aFloatArrayArray3[arg2 + 1][arg5];
			@Pc(396) float local396 = local289 + (this.aFloatArrayArray3[arg2][arg5 + 1] - local289) * local260;
			@Pc(414) float local414 = local381 + local260 * (this.aFloatArrayArray3[arg2 + 1][arg5 + 1] - local381);
			local161 = local355 + local268 * (local372 - local355);
			local143 = local339 + local268 * (local324 - local339);
			local152 = local268 * (local414 - local396) + local396;
		}
		local260 = (float) (this.aClass5_Sub12_1.method4537() - local15);
		local268 = (float) (this.aClass5_Sub12_1.method4533() - local31);
		local275 = (float) (this.aClass5_Sub12_1.method4534() - local24);
		local282 = (float) Math.sqrt((double) (local260 * local260 + local268 * local268 + local275 * local275));
		local289 = 1.0F / local282;
		local260 *= local289;
		local268 *= local289;
		local275 *= local289;
		local298 = local282 / (float) this.aClass5_Sub12_1.method4531();
		local307 = 1.0F - local298 * local298;
		if (local307 < 0.0F) {
			local307 = 0.0F;
		}
		local381 = local275 * local152 + local161 * local260 + local268 * local143;
		if (local381 < 0.0F) {
			local381 = 0.0F;
		}
		@Pc(565) float local565 = local381 * local307 * 2.0F;
		if (local565 > 1.0F) {
			local565 = 1.0F;
		}
		@Pc(576) int local576 = this.aClass5_Sub12_1.method4530();
		@Pc(586) int local586 = (int) ((float) (local576 >> 16 & 0xFF) * local565);
		if (local586 > 255) {
			local586 = 255;
		}
		@Pc(601) int local601 = (int) ((float) (local576 >> 8 & 0xFF) * local565);
		if (local601 > 255) {
			local601 = 255;
		}
		@Pc(616) int local616 = (int) (local565 * (float) (local576 & 0xFF));
		if (local616 > 255) {
			local616 = 255;
		}
		if (Stream.c()) {
			this.aStream2.b((float) local15);
			this.aStream2.b((float) local31);
			this.aStream2.b((float) local24);
		} else {
			this.aStream2.a((float) local15);
			this.aStream2.a((float) local31);
			this.aStream2.a((float) local24);
		}
		if (this.aClass100_Sub1_1.anInt9227 == 0) {
			this.aStream2.e(local616);
			this.aStream2.e(local601);
			this.aStream2.e(local586);
		} else {
			this.aStream2.e(local586);
			this.aStream2.e(local601);
			this.aStream2.e(local616);
		}
		this.aStream2.e(255);
		this.method344(local87);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(SI)V")
	private void method344(@OriginalArg(0) short arg0) {
		if (Stream.c()) {
			this.aStream1.c(arg0);
		} else {
			this.aStream1.f(arg0);
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(I[[ZIBI)V")
	public void method346(@OriginalArg(0) int arg0, @OriginalArg(1) boolean[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface20_2 == null || (arg2 + arg3 < this.anInt290 || (arg2 - arg3 > this.anInt287 || (this.anInt288 > arg3 + arg0 || arg0 - arg3 > this.anInt283)))) {
			return;
		}
		for (@Pc(68) int local68 = this.anInt288; local68 <= this.anInt283; local68++) {
			for (@Pc(73) int local73 = this.anInt290; local73 <= this.anInt287; local73++) {
				@Pc(80) int local80 = local73 - arg2;
				@Pc(85) int local85 = local68 - arg0;
				if (local80 > -arg3 && arg3 > local80 && local85 > -arg3 && arg3 > local85 && arg1[arg3 + local80][local85 + arg3]) {
					this.aClass100_Sub1_1.method7979((byte) (int) (this.aClass5_Sub12_1.method4536() * 255.0F));
					this.aClass100_Sub1_1.method7868(this.anInterface15_3, 0);
					this.aClass100_Sub1_1.method7921(this.aClass100_Sub1_1.aClass124_22);
					this.aClass100_Sub1_1.method7948(this.anInt280, 0, 0, Static649.aClass187_6, this.anInterface20_2, this.anInt286 / 3);
					return;
				}
			}
		}
	}
}
