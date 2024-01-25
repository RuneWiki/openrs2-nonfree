import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class6_Sub37 extends Class6 {

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
	private int anInt6781;

	@OriginalMember(owner = "client!pc", name = "D", descriptor = "Lclient!iq;")
	private final Class59_Sub2 aClass59_Sub2_3;

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "Lclient!bj;")
	private final Class6_Sub7 aClass6_Sub7_2;

	@OriginalMember(owner = "client!pc", name = "x", descriptor = "Lclient!kea;")
	private final Class14_Sub2 aClass14_Sub2_12;

	@OriginalMember(owner = "client!pc", name = "B", descriptor = "I")
	private final int anInt6790;

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
	private final int anInt6780;

	@OriginalMember(owner = "client!pc", name = "r", descriptor = "I")
	private final int anInt6783;

	@OriginalMember(owner = "client!pc", name = "z", descriptor = "I")
	private final int anInt6788;

	@OriginalMember(owner = "client!pc", name = "s", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!pc", name = "A", descriptor = "I")
	private int anInt6789;

	@OriginalMember(owner = "client!pc", name = "p", descriptor = "Lclient!hd;")
	private Class128 aClass128_31;

	@OriginalMember(owner = "client!pc", name = "E", descriptor = "Lclient!vl;")
	private final Interface23 anInterface23_4;

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream4;

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream5;

	@OriginalMember(owner = "client!pc", name = "o", descriptor = "Lclient!ii;")
	private final Interface13 anInterface13_10;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lclient!kea;Lclient!iq;Lclient!bj;[I)V")
	public Class6_Sub37(@OriginalArg(0) Class14_Sub2 arg0, @OriginalArg(1) Class59_Sub2 arg1, @OriginalArg(2) Class6_Sub7 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass59_Sub2_3 = arg1;
		this.aClass6_Sub7_2 = arg2;
		this.aClass14_Sub2_12 = arg0;
		@Pc(22) int local22 = this.aClass6_Sub7_2.method4283() - (arg1.anInt9641 >> 1);
		this.anInt6790 = this.aClass6_Sub7_2.method4292() - local22 >> arg1.anInt9638;
		this.anInt6780 = this.aClass6_Sub7_2.method4292() + local22 >> arg1.anInt9638;
		this.anInt6783 = this.aClass6_Sub7_2.method4286() - local22 >> arg1.anInt9638;
		this.anInt6788 = this.aClass6_Sub7_2.method4286() + local22 >> arg1.anInt9638;
		@Pc(76) int local76 = this.anInt6780 + 1 - this.anInt6790;
		@Pc(85) int local85 = this.anInt6788 + 1 - this.anInt6783;
		this.aFloatArrayArray7 = new float[local76 + 1][local85 + 1];
		this.aFloatArrayArray6 = new float[local76 + 1][local85 + 1];
		this.aFloatArrayArray5 = new float[local76 + 1][local85 + 1];
		@Pc(121) int local121;
		@Pc(139) int local139;
		@Pc(146) int local146;
		@Pc(177) int local177;
		@Pc(192) int local192;
		for (@Pc(114) int local114 = 0; local114 <= local85; local114++) {
			local121 = local114 + this.anInt6783;
			if (local121 > 0 && local121 < this.aClass59_Sub2_3.anInt9639 - 1) {
				for (local139 = 0; local139 <= local76; local139++) {
					local146 = this.anInt6790 + local139;
					if (local146 > 0 && this.aClass59_Sub2_3.anInt9640 - 1 > local146) {
						local177 = arg1.JA(local146 + 1, local121) - arg1.JA(local146 - 1, local121);
						local192 = arg1.JA(local146, local121 + 1) - arg1.JA(local146, local121 - 1);
						@Pc(208) float local208 = (float) (1.0D / Math.sqrt((double) (local177 * local177 + local192 * local192 + 65536)));
						this.aFloatArrayArray5[local139][local114] = local208 * (float) local177;
						this.aFloatArrayArray7[local139][local114] = local208 * -256.0F;
						this.aFloatArrayArray6[local139][local114] = (float) local192 * local208;
					}
				}
			}
		}
		local121 = 0;
		@Pc(312) int local312;
		for (local139 = this.anInt6783; local139 <= this.anInt6788; local139++) {
			if (local139 >= 0 && local139 < arg1.anInt9639) {
				for (local146 = this.anInt6790; local146 <= this.anInt6780; local146++) {
					if (local146 >= 0 && arg1.anInt9640 > local146) {
						local177 = arg3[local121];
						@Pc(290) int[] local290 = arg1.anIntArrayArrayArray8[local146][local139];
						if (local290 != null && local177 != 0) {
							if (local177 == 1) {
								local312 = 0;
								while (local312 < local290.length) {
									if (local290[local312++] != -1 && local290[local312++] != -1 && local290[local312++] != -1) {
										this.anInt6789 += 3;
									}
								}
							} else {
								this.anInt6789 += 3;
							}
						}
					}
					local121++;
				}
			} else {
				local121 += this.anInt6780 - this.anInt6790;
			}
		}
		if (this.anInt6789 > 0) {
			this.aClass128_31 = new Class128(Static253.method4296(this.anInt6789));
			this.anInterface23_4 = this.aClass14_Sub2_12.method7005(false);
			this.anInterface23_4.method4092(this.anInt6789);
			@Pc(415) NativeHeapBuffer local415 = this.aClass14_Sub2_12.method6936(false, this.anInt6789 * 16);
			this.aStream4 = new Stream(local415);
			while (true) {
				@Pc(427) Buffer local427;
				do {
					local427 = this.anInterface23_4.method4095();
				} while (local427 == null);
				this.aStream5 = new Stream(local427);
				local192 = 0;
				local121 = 0;
				for (local312 = this.anInt6783; local312 <= this.anInt6788; local312++) {
					if (local312 >= 0 && arg1.anInt9639 > local312) {
						@Pc(462) int local462 = 0;
						for (@Pc(465) int local465 = this.anInt6790; local465 <= this.anInt6780; local465++) {
							if (local465 >= 0 && local465 < arg1.anInt9640) {
								@Pc(477) int local477 = arg3[local121];
								@Pc(484) int[] local484 = arg1.anIntArrayArrayArray8[local465][local312];
								if (local484 != null && local477 != 0) {
									if (local477 == 1) {
										@Pc(501) int[] local501 = arg1.anIntArrayArrayArray10[local465][local312];
										@Pc(508) int[] local508 = arg1.anIntArrayArrayArray7[local465][local312];
										@Pc(510) int local510 = 0;
										label118: while (true) {
											while (true) {
												if (local484.length <= local510) {
													break label118;
												}
												if (local484[local510] == -1 || local484[local510 + 1] == -1 || local484[local510 + 2] == -1) {
													local510 += 3;
												} else {
													this.method5703(local465, local508[local510], local312, local501[local510], local462, local192);
													local510++;
													this.method5703(local465, local508[local510], local312, local501[local510], local462, local192);
													local510++;
													this.method5703(local465, local508[local510], local312, local501[local510], local462, local192);
													local510++;
												}
											}
										}
									} else if (local477 == 3) {
										this.method5703(local465, 0, local312, 0, local462, local192);
										this.method5703(local465, 0, local312, arg1.anInt9641, local462, local192);
										this.method5703(local465, arg1.anInt9641, local312, 0, local462, local192);
									} else if (local477 == 2) {
										this.method5703(local465, 0, local312, arg1.anInt9641, local462, local192);
										this.method5703(local465, arg1.anInt9641, local312, arg1.anInt9641, local462, local192);
										this.method5703(local465, 0, local312, 0, local462, local192);
									} else if (local477 == 5) {
										this.method5703(local465, arg1.anInt9641, local312, arg1.anInt9641, local462, local192);
										this.method5703(local465, arg1.anInt9641, local312, 0, local462, local192);
										this.method5703(local465, 0, local312, arg1.anInt9641, local462, local192);
									} else if (local477 == 4) {
										this.method5703(local465, arg1.anInt9641, local312, 0, local462, local192);
										this.method5703(local465, 0, local312, 0, local462, local192);
										this.method5703(local465, arg1.anInt9641, local312, arg1.anInt9641, local462, local192);
									}
								}
							}
							local462++;
							local121++;
						}
					} else {
						local121 += this.anInt6780 - this.anInt6790;
					}
					local192++;
				}
				this.aStream5.c();
				if (this.anInterface23_4.method4094()) {
					this.aStream4.c();
					this.anInterface13_10 = this.aClass14_Sub2_12.method7004(false);
					this.anInterface13_10.method1883(local415, 16, this.anInt6781 * 16);
					break;
				}
				this.aStream4.e(0);
				this.aClass128_31.method3274();
			}
		} else {
			this.anInterface23_4 = null;
			this.anInterface13_10 = null;
		}
		this.aFloatArrayArray5 = this.aFloatArrayArray7 = this.aFloatArrayArray6 = null;
		this.aClass128_31 = null;
		this.aStream4 = null;
		this.aStream5 = null;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IS)V")
	private void method5701(@OriginalArg(1) short arg0) {
		if (Stream.b()) {
			this.aStream5.c(arg0);
		} else {
			this.aStream5.a(arg0);
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "([[ZIIII)V")
	public void method5702(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInterface23_4 == null || (this.anInt6790 > arg2 + arg1 || (arg2 - arg1 > this.anInt6780 || (arg1 + arg3 < this.anInt6783 || this.anInt6788 < arg3 - arg1)))) {
			return;
		}
		for (@Pc(54) int local54 = this.anInt6783; local54 <= this.anInt6788; local54++) {
			for (@Pc(59) int local59 = this.anInt6790; local59 <= this.anInt6780; local59++) {
				@Pc(66) int local66 = local59 - arg2;
				@Pc(71) int local71 = local54 - arg3;
				if (-arg1 < local66 && arg1 > local66 && local71 > -arg1 && local71 < arg1 && arg0[local66 + arg1][local71 + arg1]) {
					this.aClass14_Sub2_12.method6919((byte) (this.aClass6_Sub7_2.method4284() * 255.0F));
					this.aClass14_Sub2_12.method6994(0, this.anInterface13_10);
					this.aClass14_Sub2_12.method6944(this.aClass14_Sub2_12.aClass28_16);
					this.aClass14_Sub2_12.method7026(0, 0, this.anInt6781, this.anInt6789 / 3, Static181.aClass311_4, this.anInterface23_4);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIIII)V")
	private void method5703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg0 << this.aClass59_Sub2_3.anInt9638) + arg3;
		@Pc(23) int local23 = (arg2 << this.aClass59_Sub2_3.anInt9638) + arg1;
		@Pc(29) int local29 = this.aClass59_Sub2_3.sa(local15, local23);
		if ((arg3 & 0x7F) == 0 || (arg1 & 0x7F) == 0) {
			local7 = 0xFFFFL << 16 & (long) local23 << 16 | (long) local15 & 0xFFFFL;
			@Pc(63) Class6 local63 = this.aClass128_31.method3263(local7);
			if (local63 != null) {
				this.method5701(((Class6_Sub36) local63).aShort82);
				return;
			}
		}
		@Pc(81) short local81 = (short) this.anInt6781++;
		if (local7 != -1L) {
			this.aClass128_31.method3267(new Class6_Sub36(local81), local7);
		}
		@Pc(144) float local144;
		@Pc(135) float local135;
		@Pc(126) float local126;
		@Pc(217) float local217;
		@Pc(225) float local225;
		@Pc(232) float local232;
		@Pc(239) float local239;
		@Pc(246) float local246;
		@Pc(255) float local255;
		@Pc(264) float local264;
		@Pc(273) float local273;
		if (arg3 == 0 && arg1 == 0) {
			local135 = this.aFloatArrayArray7[arg4][arg5];
			local126 = this.aFloatArrayArray6[arg4][arg5];
			local144 = this.aFloatArrayArray5[arg4][arg5];
		} else if (this.aClass59_Sub2_3.anInt9641 == arg3 && arg1 == 0) {
			local126 = this.aFloatArrayArray6[arg4 + 1][arg5];
			local135 = this.aFloatArrayArray7[arg4 + 1][arg5];
			local144 = this.aFloatArrayArray5[arg4 + 1][arg5];
		} else if (this.aClass59_Sub2_3.anInt9641 == arg3 && this.aClass59_Sub2_3.anInt9641 == arg1) {
			local126 = this.aFloatArrayArray6[arg4 + 1][arg5 + 1];
			local135 = this.aFloatArrayArray7[arg4 + 1][arg5 + 1];
			local144 = this.aFloatArrayArray5[arg4 + 1][arg5 + 1];
		} else if (arg3 == 0 && arg1 == this.aClass59_Sub2_3.anInt9641) {
			local135 = this.aFloatArrayArray7[arg4][arg5 + 1];
			local126 = this.aFloatArrayArray6[arg4][arg5 + 1];
			local144 = this.aFloatArrayArray5[arg4][arg5 + 1];
		} else {
			local217 = (float) arg3 / (float) this.aClass59_Sub2_3.anInt9641;
			local225 = (float) arg1 / (float) this.aClass59_Sub2_3.anInt9641;
			local232 = this.aFloatArrayArray5[arg4][arg5];
			local239 = this.aFloatArrayArray7[arg4][arg5];
			local246 = this.aFloatArrayArray6[arg4][arg5];
			local255 = this.aFloatArrayArray5[arg4 + 1][arg5];
			local264 = this.aFloatArrayArray7[arg4 + 1][arg5];
			local273 = this.aFloatArrayArray6[arg4 + 1][arg5];
			@Pc(288) float local288 = local239 + local217 * (this.aFloatArrayArray7[arg4][arg5 + 1] - local239);
			@Pc(303) float local303 = local232 + (this.aFloatArrayArray5[arg4][arg5 + 1] - local232) * local217;
			@Pc(320) float local320 = local264 + (this.aFloatArrayArray7[arg4 + 1][arg5 + 1] - local264) * local217;
			@Pc(336) float local336 = local246 + local217 * (this.aFloatArrayArray6[arg4][arg5 + 1] - local246);
			@Pc(353) float local353 = local255 + (this.aFloatArrayArray5[arg4 + 1][arg5 + 1] - local255) * local217;
			local144 = local303 + (local353 - local303) * local225;
			@Pc(378) float local378 = local273 + local217 * (this.aFloatArrayArray6[arg4 + 1][arg5 + 1] - local273);
			local135 = local225 * (local320 - local288) + local288;
			local126 = local336 + (local378 - local336) * local225;
		}
		local217 = this.aClass6_Sub7_2.method4292() - local15;
		local225 = this.aClass6_Sub7_2.method4291() - local29;
		local232 = this.aClass6_Sub7_2.method4286() - local23;
		local239 = (float) Math.sqrt((double) (local217 * local217 + local225 * local225 + local232 * local232));
		local246 = 1.0F / local239;
		local225 *= local246;
		local217 *= local246;
		local232 *= local246;
		local255 = local239 / (float) this.aClass6_Sub7_2.method4283();
		local264 = 1.0F - local255 * local255;
		if (local264 < 0.0F) {
			local264 = 0.0F;
		}
		local273 = local135 * local225 + local217 * local144 + local232 * local126;
		if (local273 < 0.0F) {
			local273 = 0.0F;
		}
		@Pc(554) float local554 = local264 * local273 * 2.0F;
		if (local554 > 1.0F) {
			local554 = 1.0F;
		}
		@Pc(565) int local565 = this.aClass6_Sub7_2.method4288();
		@Pc(575) int local575 = (int) ((float) (local565 >> 16 & 0xFF) * local554);
		if (local575 > 255) {
			local575 = 255;
		}
		@Pc(592) int local592 = (int) (local554 * (float) (local565 >> 8 & 0xFF));
		if (local592 > 255) {
			local592 = 255;
		}
		@Pc(605) int local605 = (int) ((float) (local565 & 0xFF) * local554);
		if (local605 > 255) {
			local605 = 255;
		}
		if (Stream.b()) {
			this.aStream4.a((float) local15);
			this.aStream4.a((float) local29);
			this.aStream4.a((float) local23);
		} else {
			this.aStream4.b((float) local15);
			this.aStream4.b((float) local29);
			this.aStream4.b((float) local23);
		}
		if (this.aClass14_Sub2_12.anInt8602 == 0) {
			this.aStream4.b(local605);
			this.aStream4.b(local592);
			this.aStream4.b(local575);
		} else {
			this.aStream4.b(local575);
			this.aStream4.b(local592);
			this.aStream4.b(local605);
		}
		this.aStream4.b(255);
		this.method5701(local81);
	}
}
