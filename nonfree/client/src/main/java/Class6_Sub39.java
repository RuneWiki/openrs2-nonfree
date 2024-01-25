import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qt")
public final class Class6_Sub39 extends Class6 {

	@OriginalMember(owner = "client!qt", name = "m", descriptor = "I")
	private int anInt8273;

	@OriginalMember(owner = "client!qt", name = "x", descriptor = "Lclient!wu;")
	private final Class100_Sub1 aClass100_Sub1_21;

	@OriginalMember(owner = "client!qt", name = "u", descriptor = "Lclient!raa;")
	private final Class6_Sub1 aClass6_Sub1_3;

	@OriginalMember(owner = "client!qt", name = "F", descriptor = "Lclient!lw;")
	private final Class199_Sub1 aClass199_Sub1_2;

	@OriginalMember(owner = "client!qt", name = "J", descriptor = "I")
	private final int anInt8283;

	@OriginalMember(owner = "client!qt", name = "C", descriptor = "I")
	private final int anInt8281;

	@OriginalMember(owner = "client!qt", name = "s", descriptor = "I")
	private final int anInt8276;

	@OriginalMember(owner = "client!qt", name = "v", descriptor = "I")
	private final int anInt8278;

	@OriginalMember(owner = "client!qt", name = "y", descriptor = "[[F")
	private float[][] aFloatArrayArray15;

	@OriginalMember(owner = "client!qt", name = "D", descriptor = "[[F")
	private float[][] aFloatArrayArray17;

	@OriginalMember(owner = "client!qt", name = "B", descriptor = "[[F")
	private float[][] aFloatArrayArray16;

	@OriginalMember(owner = "client!qt", name = "A", descriptor = "I")
	private int anInt8280;

	@OriginalMember(owner = "client!qt", name = "o", descriptor = "Lclient!jf;")
	private final Interface11 anInterface11_8;

	@OriginalMember(owner = "client!qt", name = "p", descriptor = "Lclient!ll;")
	private final Interface17 anInterface17_17;

	@OriginalMember(owner = "client!qt", name = "I", descriptor = "Lclient!he;")
	private Class128 aClass128_36;

	@OriginalMember(owner = "client!qt", name = "z", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream6;

	@OriginalMember(owner = "client!qt", name = "r", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream5;

	@OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(Lclient!wu;Lclient!lw;Lclient!raa;[I)V")
	public Class6_Sub39(@OriginalArg(0) Class100_Sub1 arg0, @OriginalArg(1) Class199_Sub1 arg1, @OriginalArg(2) Class6_Sub1 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass100_Sub1_21 = arg0;
		this.aClass6_Sub1_3 = arg2;
		this.aClass199_Sub1_2 = arg1;
		@Pc(22) int local22 = this.aClass6_Sub1_3.method8268() - (arg1.anInt10112 >> 1);
		this.anInt8283 = this.aClass6_Sub1_3.method8264() - local22 >> arg1.anInt10104;
		this.anInt8281 = local22 + this.aClass6_Sub1_3.method8264() >> arg1.anInt10104;
		this.anInt8276 = this.aClass6_Sub1_3.method8260() - local22 >> arg1.anInt10104;
		this.anInt8278 = local22 + this.aClass6_Sub1_3.method8260() >> arg1.anInt10104;
		@Pc(76) int local76 = this.anInt8281 + 1 - this.anInt8283;
		@Pc(84) int local84 = this.anInt8278 + 1 - this.anInt8276;
		this.aFloatArrayArray15 = new float[local76 + 1][local84 + 1];
		this.aFloatArrayArray17 = new float[local76 + 1][local84 + 1];
		this.aFloatArrayArray16 = new float[local76 + 1][local84 + 1];
		@Pc(120) int local120;
		@Pc(131) int local131;
		@Pc(138) int local138;
		@Pc(170) int local170;
		@Pc(187) int local187;
		for (@Pc(113) int local113 = 0; local113 <= local84; local113++) {
			local120 = local113 + this.anInt8276;
			if (local120 > 0 && local120 < this.aClass199_Sub1_2.anInt10110 - 1) {
				for (local131 = 0; local131 <= local76; local131++) {
					local138 = this.anInt8283 + local131;
					if (local138 > 0 && this.aClass199_Sub1_2.anInt10111 - 1 > local138) {
						local170 = arg1.method8532(local138 + 1, local120) - arg1.method8532(local138 - 1, local120);
						local187 = arg1.method8532(local138, local120 + 1) - arg1.method8532(local138, local120 - 1);
						@Pc(202) float local202 = (float) (1.0D / Math.sqrt((double) (local187 * local187 + local170 * local170 + 65536)));
						this.aFloatArrayArray16[local131][local113] = local202 * (float) local170;
						this.aFloatArrayArray15[local131][local113] = local202 * -256.0F;
						this.aFloatArrayArray17[local131][local113] = (float) local187 * local202;
					}
				}
			}
		}
		local120 = 0;
		@Pc(303) int local303;
		for (local131 = this.anInt8276; local131 <= this.anInt8278; local131++) {
			if (local131 >= 0 && local131 < arg1.anInt10110) {
				for (local138 = this.anInt8283; local138 <= this.anInt8281; local138++) {
					if (local138 >= 0 && local138 < arg1.anInt10111) {
						local170 = arg3[local120];
						@Pc(289) int[] local289 = arg1.anIntArrayArrayArray4[local138][local131];
						if (local289 != null && local170 != 0) {
							if (local170 == 1) {
								local303 = 0;
								while (local289.length > local303) {
									if (local289[local303++] != -1 && local289[local303++] != -1 && local289[local303++] != -1) {
										this.anInt8280 += 3;
									}
								}
							} else {
								this.anInt8280 += 3;
							}
						}
					}
					local120++;
				}
			} else {
				local120 += this.anInt8281 - this.anInt8283;
			}
		}
		if (this.anInt8280 <= 0) {
			this.anInterface11_8 = null;
			this.anInterface17_17 = null;
		} else {
			this.aClass128_36 = new Class128(Static567.method8129(this.anInt8280));
			this.anInterface11_8 = this.aClass100_Sub1_21.method6101(false);
			this.anInterface11_8.method8437(this.anInt8280);
			@Pc(404) NativeHeapBuffer local404 = this.aClass100_Sub1_21.method6081(this.anInt8280 * 16, false);
			this.aStream6 = new Stream(local404);
			while (true) {
				@Pc(416) Buffer local416;
				do {
					local416 = this.anInterface11_8.method3077();
				} while (local416 == null);
				this.aStream5 = new Stream(local416);
				local120 = 0;
				local187 = 0;
				for (local303 = this.anInt8276; local303 <= this.anInt8278; local303++) {
					if (local303 >= 0 && arg1.anInt10110 > local303) {
						@Pc(448) int local448 = 0;
						for (@Pc(451) int local451 = this.anInt8283; local451 <= this.anInt8281; local451++) {
							if (local451 >= 0 && local451 < arg1.anInt10111) {
								@Pc(467) int local467 = arg3[local120];
								@Pc(474) int[] local474 = arg1.anIntArrayArrayArray4[local451][local303];
								if (local474 != null && local467 != 0) {
									if (local467 == 1) {
										@Pc(630) int[] local630 = arg1.anIntArrayArrayArray5[local451][local303];
										@Pc(637) int[] local637 = arg1.anIntArrayArrayArray7[local451][local303];
										@Pc(639) int local639 = 0;
										label118: while (true) {
											while (true) {
												if (local474.length <= local639) {
													break label118;
												}
												if (local474[local639] == -1 || local474[local639 + 1] == -1 || local474[local639 + 2] == -1) {
													local639 += 3;
												} else {
													this.method7141(local451, local448, local630[local639], local303, local187, local637[local639]);
													local639++;
													this.method7141(local451, local448, local630[local639], local303, local187, local637[local639]);
													local639++;
													this.method7141(local451, local448, local630[local639], local303, local187, local637[local639]);
													local639++;
												}
											}
										}
									} else if (local467 == 3) {
										this.method7141(local451, local448, 0, local303, local187, 0);
										this.method7141(local451, local448, arg1.anInt10112, local303, local187, 0);
										this.method7141(local451, local448, 0, local303, local187, arg1.anInt10112);
									} else if (local467 == 2) {
										this.method7141(local451, local448, arg1.anInt10112, local303, local187, 0);
										this.method7141(local451, local448, arg1.anInt10112, local303, local187, arg1.anInt10112);
										this.method7141(local451, local448, 0, local303, local187, 0);
									} else if (local467 == 5) {
										this.method7141(local451, local448, arg1.anInt10112, local303, local187, arg1.anInt10112);
										this.method7141(local451, local448, 0, local303, local187, arg1.anInt10112);
										this.method7141(local451, local448, arg1.anInt10112, local303, local187, 0);
									} else if (local467 == 4) {
										this.method7141(local451, local448, 0, local303, local187, arg1.anInt10112);
										this.method7141(local451, local448, 0, local303, local187, 0);
										this.method7141(local451, local448, arg1.anInt10112, local303, local187, arg1.anInt10112);
									}
								}
							}
							local448++;
							local120++;
						}
					} else {
						local120 += this.anInt8281 - this.anInt8283;
					}
					local187++;
				}
				this.aStream5.c();
				if (this.anInterface11_8.method3078()) {
					this.aStream6.c();
					this.anInterface17_17 = this.aClass100_Sub1_21.method6123(false);
					this.anInterface17_17.method8441(16, local404, this.anInt8273 * 16);
					break;
				}
				this.aStream6.b(0);
				this.aClass128_36.method3562();
			}
		}
		this.aStream5 = null;
		this.aStream6 = null;
		this.aClass128_36 = null;
		this.aFloatArrayArray16 = this.aFloatArrayArray15 = this.aFloatArrayArray17 = null;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIIIIII)V")
	private void method7141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg0 << this.aClass199_Sub1_2.anInt10104) + arg2;
		@Pc(23) int local23 = (arg3 << this.aClass199_Sub1_2.anInt10104) + arg5;
		@Pc(30) int local30 = this.aClass199_Sub1_2.method8531(local23, local15);
		if ((arg2 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			local7 = (long) local15 & 0xFFFFL | 0xFFFFL << 16 & (long) local23 << 16;
			@Pc(61) Class6 local61 = this.aClass128_36.method3560(local7);
			if (local61 != null) {
				this.method7143(((Class6_Sub36) local61).aShort92);
				return;
			}
		}
		@Pc(79) short local79 = (short) this.anInt8273++;
		if (local7 != -1L) {
			this.aClass128_36.method3551(local7, new Class6_Sub36(local79));
		}
		@Pc(125) float local125;
		@Pc(111) float local111;
		@Pc(118) float local118;
		@Pc(195) float local195;
		@Pc(203) float local203;
		@Pc(210) float local210;
		@Pc(217) float local217;
		@Pc(224) float local224;
		@Pc(233) float local233;
		@Pc(242) float local242;
		@Pc(251) float local251;
		if (arg2 == 0 && arg5 == 0) {
			local111 = this.aFloatArrayArray15[arg1][arg4];
			local118 = this.aFloatArrayArray17[arg1][arg4];
			local125 = this.aFloatArrayArray16[arg1][arg4];
		} else if (this.aClass199_Sub1_2.anInt10112 == arg2 && arg5 == 0) {
			local111 = this.aFloatArrayArray15[arg1 + 1][arg4];
			local125 = this.aFloatArrayArray16[arg1 + 1][arg4];
			local118 = this.aFloatArrayArray17[arg1 + 1][arg4];
		} else if (arg2 == this.aClass199_Sub1_2.anInt10112 && this.aClass199_Sub1_2.anInt10112 == arg5) {
			local111 = this.aFloatArrayArray15[arg1 + 1][arg4 + 1];
			local125 = this.aFloatArrayArray16[arg1 + 1][arg4 + 1];
			local118 = this.aFloatArrayArray17[arg1 + 1][arg4 + 1];
		} else if (arg2 == 0 && this.aClass199_Sub1_2.anInt10112 == arg5) {
			local111 = this.aFloatArrayArray15[arg1][arg4 + 1];
			local125 = this.aFloatArrayArray16[arg1][arg4 + 1];
			local118 = this.aFloatArrayArray17[arg1][arg4 + 1];
		} else {
			local195 = (float) arg2 / (float) this.aClass199_Sub1_2.anInt10112;
			local203 = (float) arg5 / (float) this.aClass199_Sub1_2.anInt10112;
			local210 = this.aFloatArrayArray16[arg1][arg4];
			local217 = this.aFloatArrayArray15[arg1][arg4];
			local224 = this.aFloatArrayArray17[arg1][arg4];
			local233 = this.aFloatArrayArray16[arg1 + 1][arg4];
			local242 = this.aFloatArrayArray15[arg1 + 1][arg4];
			local251 = this.aFloatArrayArray17[arg1 + 1][arg4];
			@Pc(266) float local266 = local217 + (this.aFloatArrayArray15[arg1][arg4 + 1] - local217) * local195;
			@Pc(281) float local281 = local224 + (this.aFloatArrayArray17[arg1][arg4 + 1] - local224) * local195;
			@Pc(298) float local298 = local233 + (this.aFloatArrayArray16[arg1 + 1][arg4 + 1] - local233) * local195;
			@Pc(314) float local314 = local210 + (this.aFloatArrayArray16[arg1][arg4 + 1] - local210) * local195;
			@Pc(331) float local331 = local242 + local195 * (this.aFloatArrayArray15[arg1 + 1][arg4 + 1] - local242);
			@Pc(349) float local349 = local251 + (this.aFloatArrayArray17[arg1 + 1][arg4 + 1] - local251) * local195;
			local125 = local314 + (local298 - local314) * local203;
			local111 = local266 + (local331 - local266) * local203;
			local118 = local281 + (local349 - local281) * local203;
		}
		local195 = (float) (this.aClass6_Sub1_3.method8264() - local15);
		local203 = (float) (this.aClass6_Sub1_3.method8267() - local30);
		local210 = (float) (this.aClass6_Sub1_3.method8260() - local23);
		local217 = (float) Math.sqrt((double) (local195 * local195 + local203 * local203 + local210 * local210));
		local224 = 1.0F / local217;
		local195 *= local224;
		local210 *= local224;
		local203 *= local224;
		local233 = local217 / (float) this.aClass6_Sub1_3.method8268();
		local242 = 1.0F - local233 * local233;
		if (local242 < 0.0F) {
			local242 = 0.0F;
		}
		local251 = local210 * local118 + local195 * local125 + local203 * local111;
		if (local251 < 0.0F) {
			local251 = 0.0F;
		}
		@Pc(551) float local551 = local242 * 2.0F * local251;
		if (local551 > 1.0F) {
			local551 = 1.0F;
		}
		@Pc(562) int local562 = this.aClass6_Sub1_3.method8265();
		@Pc(572) int local572 = (int) (local551 * (float) (local562 >> 16 & 0xFF));
		if (local572 > 255) {
			local572 = 255;
		}
		@Pc(589) int local589 = (int) (local551 * (float) (local562 >> 8 & 0xFF));
		if (local589 > 255) {
			local589 = 255;
		}
		@Pc(602) int local602 = (int) (local551 * (float) (local562 & 0xFF));
		if (local602 > 255) {
			local602 = 255;
		}
		if (Stream.b()) {
			this.aStream6.a((float) local15);
			this.aStream6.a((float) local30);
			this.aStream6.a((float) local23);
		} else {
			this.aStream6.b((float) local15);
			this.aStream6.b((float) local30);
			this.aStream6.b((float) local23);
		}
		if (this.aClass100_Sub1_21.anInt7154 == 0) {
			this.aStream6.f(local602);
			this.aStream6.f(local589);
			this.aStream6.f(local572);
		} else {
			this.aStream6.f(local572);
			this.aStream6.f(local589);
			this.aStream6.f(local602);
		}
		this.aStream6.f(255);
		this.method7143(local79);
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(II[[ZIB)V")
	public void method7142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[][] arg2, @OriginalArg(3) int arg3) {
		if (this.anInterface11_8 == null || (this.anInt8283 > arg0 + arg3 || (arg3 - arg0 > this.anInt8281 || (this.anInt8276 > arg0 + arg1 || this.anInt8278 < arg1 - arg0)))) {
			return;
		}
		for (@Pc(50) int local50 = this.anInt8276; local50 <= this.anInt8278; local50++) {
			for (@Pc(55) int local55 = this.anInt8283; local55 <= this.anInt8281; local55++) {
				@Pc(62) int local62 = local55 - arg3;
				@Pc(66) int local66 = local50 - arg1;
				if (-arg0 < local62 && arg0 > local62 && local66 > -arg0 && arg0 > local66 && arg2[local62 + arg0][arg0 + local66]) {
					this.aClass100_Sub1_21.method6110((byte) (int) (this.aClass6_Sub1_3.method8266() * 255.0F));
					this.aClass100_Sub1_21.method6128(0, this.anInterface17_17);
					this.aClass100_Sub1_21.method6107(this.aClass100_Sub1_21.aClass293_18);
					this.aClass100_Sub1_21.method6064(this.anInt8280 / 3, 0, this.anInt8273, 0, this.anInterface11_8, Static295.aClass77_2);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IS)V")
	private void method7143(@OriginalArg(1) short arg0) {
		if (Stream.b()) {
			this.aStream5.d(arg0);
		} else {
			this.aStream5.a(arg0);
		}
	}
}
