import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public final class Class3_Sub13 extends Class3 {

	@OriginalMember(owner = "client!di", name = "l", descriptor = "I")
	private int anInt2244;

	@OriginalMember(owner = "client!di", name = "h", descriptor = "Lclient!ch;")
	private final Class5_Sub1 aClass5_Sub1_6;

	@OriginalMember(owner = "client!di", name = "x", descriptor = "Lclient!cj;")
	private final Class51_Sub1 aClass51_Sub1_1;

	@OriginalMember(owner = "client!di", name = "A", descriptor = "Lclient!wh;")
	private final Class3_Sub16 aClass3_Sub16_1;

	@OriginalMember(owner = "client!di", name = "t", descriptor = "I")
	private final int anInt2249;

	@OriginalMember(owner = "client!di", name = "s", descriptor = "I")
	private final int anInt2248;

	@OriginalMember(owner = "client!di", name = "j", descriptor = "I")
	private final int anInt2243;

	@OriginalMember(owner = "client!di", name = "B", descriptor = "I")
	private final int anInt2251;

	@OriginalMember(owner = "client!di", name = "y", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!di", name = "p", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!di", name = "n", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!di", name = "u", descriptor = "I")
	private int anInt2250;

	@OriginalMember(owner = "client!di", name = "o", descriptor = "Lclient!fg;")
	private final Interface11 anInterface11_11;

	@OriginalMember(owner = "client!di", name = "i", descriptor = "Lclient!rr;")
	private final Interface19 anInterface19_4;

	@OriginalMember(owner = "client!di", name = "v", descriptor = "Lclient!qp;")
	private Class280 aClass280_8;

	@OriginalMember(owner = "client!di", name = "k", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream4;

	@OriginalMember(owner = "client!di", name = "w", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream5;

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Lclient!ch;Lclient!cj;Lclient!wh;[I)V")
	public Class3_Sub13(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) Class51_Sub1 arg1, @OriginalArg(2) Class3_Sub16 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass5_Sub1_6 = arg0;
		this.aClass51_Sub1_1 = arg1;
		this.aClass3_Sub16_1 = arg2;
		@Pc(22) int local22 = this.aClass3_Sub16_1.method4781() - (arg1.anInt9118 >> 1);
		this.anInt2249 = this.aClass3_Sub16_1.method4778() - local22 >> arg1.anInt9117;
		this.anInt2248 = this.aClass3_Sub16_1.method4778() + local22 >> arg1.anInt9117;
		this.anInt2243 = this.aClass3_Sub16_1.method4783() - local22 >> arg1.anInt9117;
		this.anInt2251 = this.aClass3_Sub16_1.method4783() + local22 >> arg1.anInt9117;
		@Pc(78) int local78 = this.anInt2248 + 1 - this.anInt2249;
		@Pc(87) int local87 = this.anInt2251 + 1 - this.anInt2243;
		this.aFloatArrayArray6 = new float[local78 + 1][local87 + 1];
		this.aFloatArrayArray5 = new float[local78 + 1][local87 + 1];
		this.aFloatArrayArray4 = new float[local78 + 1][local87 + 1];
		@Pc(123) int local123;
		@Pc(134) int local134;
		@Pc(142) int local142;
		@Pc(171) int local171;
		@Pc(188) int local188;
		for (@Pc(116) int local116 = 0; local116 <= local87; local116++) {
			local123 = this.anInt2243 + local116;
			if (local123 > 0 && local123 < this.aClass51_Sub1_1.anInt9115 - 1) {
				for (local134 = 0; local134 <= local78; local134++) {
					local142 = local134 + this.anInt2249;
					if (local142 > 0 && this.aClass51_Sub1_1.anInt9121 - 1 > local142) {
						local171 = arg1.method7835(local142 + 1, local123) - arg1.method7835(local142 - 1, local123);
						local188 = arg1.method7835(local142, local123 + 1) - arg1.method7835(local142, local123 - 1);
						@Pc(203) float local203 = (float) (1.0D / Math.sqrt((double) (local171 * local171 + local188 * local188 + 65536)));
						this.aFloatArrayArray4[local134][local116] = (float) local171 * local203;
						this.aFloatArrayArray5[local134][local116] = -256.0F * local203;
						this.aFloatArrayArray6[local134][local116] = (float) local188 * local203;
					}
				}
			}
		}
		local123 = 0;
		@Pc(302) int local302;
		for (local134 = this.anInt2243; local134 <= this.anInt2251; local134++) {
			if (local134 >= 0 && local134 < arg1.anInt9115) {
				for (local142 = this.anInt2249; local142 <= this.anInt2248; local142++) {
					if (local142 >= 0 && arg1.anInt9121 > local142) {
						local171 = arg3[local123];
						@Pc(282) int[] local282 = arg1.anIntArrayArrayArray2[local142][local134];
						if (local282 != null && local171 != 0) {
							if (local171 == 1) {
								local302 = 0;
								while (local282.length > local302) {
									if (local282[local302++] != -1 && local282[local302++] != -1 && local282[local302++] != -1) {
										this.anInt2250 += 3;
									}
								}
							} else {
								this.anInt2250 += 3;
							}
						}
					}
					local123++;
				}
			} else {
				local123 += this.anInt2248 - this.anInt2249;
			}
		}
		if (this.anInt2250 <= 0) {
			this.anInterface11_11 = null;
			this.anInterface19_4 = null;
		} else {
			this.aClass280_8 = new Class280(Static109.method2234(this.anInt2250));
			this.anInterface19_4 = this.aClass5_Sub1_6.method5671(false);
			this.anInterface19_4.method7981(this.anInt2250);
			@Pc(408) NativeHeapBuffer local408 = this.aClass5_Sub1_6.method5663(false, this.anInt2250 * 16);
			this.aStream4 = new Stream(local408);
			while (true) {
				@Pc(420) Buffer local420;
				do {
					local420 = this.anInterface19_4.method7984();
				} while (local420 == null);
				this.aStream5 = new Stream(local420);
				local188 = 0;
				local123 = 0;
				for (local302 = this.anInt2243; local302 <= this.anInt2251; local302++) {
					if (local302 >= 0 && local302 < arg1.anInt9115) {
						@Pc(460) int local460 = 0;
						for (@Pc(463) int local463 = this.anInt2249; local463 <= this.anInt2248; local463++) {
							if (local463 >= 0 && local463 < arg1.anInt9121) {
								@Pc(482) int local482 = arg3[local123];
								@Pc(489) int[] local489 = arg1.anIntArrayArrayArray2[local463][local302];
								if (local489 != null && local482 != 0) {
									if (local482 == 1) {
										@Pc(651) int[] local651 = arg1.anIntArrayArrayArray1[local463][local302];
										@Pc(658) int[] local658 = arg1.anIntArrayArrayArray5[local463][local302];
										@Pc(660) int local660 = 0;
										label118: while (true) {
											while (true) {
												if (local489.length <= local660) {
													break label118;
												}
												if (local489[local660] == -1 || local489[local660 + 1] == -1 || local489[local660 + 2] == -1) {
													local660 += 3;
												} else {
													this.method2126(local463, local302, local658[local660], local460, local188, local651[local660]);
													local660++;
													this.method2126(local463, local302, local658[local660], local460, local188, local651[local660]);
													local660++;
													this.method2126(local463, local302, local658[local660], local460, local188, local651[local660]);
													local660++;
												}
											}
										}
									} else if (local482 == 3) {
										this.method2126(local463, local302, 0, local460, local188, 0);
										this.method2126(local463, local302, 0, local460, local188, arg1.anInt9118);
										this.method2126(local463, local302, arg1.anInt9118, local460, local188, 0);
									} else if (local482 == 2) {
										this.method2126(local463, local302, 0, local460, local188, arg1.anInt9118);
										this.method2126(local463, local302, arg1.anInt9118, local460, local188, arg1.anInt9118);
										this.method2126(local463, local302, 0, local460, local188, 0);
									} else if (local482 == 5) {
										this.method2126(local463, local302, arg1.anInt9118, local460, local188, arg1.anInt9118);
										this.method2126(local463, local302, arg1.anInt9118, local460, local188, 0);
										this.method2126(local463, local302, 0, local460, local188, arg1.anInt9118);
									} else if (local482 == 4) {
										this.method2126(local463, local302, arg1.anInt9118, local460, local188, 0);
										this.method2126(local463, local302, 0, local460, local188, 0);
										this.method2126(local463, local302, arg1.anInt9118, local460, local188, arg1.anInt9118);
									}
								}
							}
							local123++;
							local460++;
						}
					} else {
						local123 += this.anInt2248 - this.anInt2249;
					}
					local188++;
				}
				this.aStream5.b();
				if (this.anInterface19_4.method7985()) {
					this.aStream4.b();
					this.anInterface11_11 = this.aClass5_Sub1_6.method5649(false);
					this.anInterface11_11.method6376(this.anInt2244 * 16, local408, 16);
					break;
				}
				this.aStream4.b(0);
				this.aClass280_8.method7100();
			}
		}
		this.aClass280_8 = null;
		this.aFloatArrayArray4 = this.aFloatArrayArray5 = this.aFloatArrayArray6 = null;
		this.aStream5 = null;
		this.aStream4 = null;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IBIIIII)V")
	private void method2126(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(16) int local16 = arg5 + (arg0 << this.aClass51_Sub1_1.anInt9117);
		@Pc(24) int local24 = (arg1 << this.aClass51_Sub1_1.anInt9117) + arg2;
		@Pc(31) int local31 = this.aClass51_Sub1_1.method7839(local16, local24);
		if ((arg5 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
			local7 = (long) local16 & 0xFFFFL | 0xFFFFL << 16 & (long) local24 << 16;
			@Pc(62) Class3 local62 = this.aClass280_8.method7107(local7);
			if (local62 != null) {
				this.method2129(((Class3_Sub26) local62).aShort45);
				return;
			}
		}
		@Pc(80) short local80 = (short) this.anInt2244++;
		if (local7 != -1L) {
			this.aClass280_8.method7109(new Class3_Sub26(local80), local7);
		}
		@Pc(123) float local123;
		@Pc(130) float local130;
		@Pc(116) float local116;
		@Pc(265) float local265;
		@Pc(273) float local273;
		@Pc(280) float local280;
		@Pc(287) float local287;
		@Pc(294) float local294;
		@Pc(303) float local303;
		@Pc(312) float local312;
		@Pc(387) float local387;
		if (arg5 == 0 && arg2 == 0) {
			local116 = this.aFloatArrayArray6[arg3][arg4];
			local123 = this.aFloatArrayArray4[arg3][arg4];
			local130 = this.aFloatArrayArray5[arg3][arg4];
		} else if (this.aClass51_Sub1_1.anInt9118 == arg5 && arg2 == 0) {
			local123 = this.aFloatArrayArray4[arg3 + 1][arg4];
			local130 = this.aFloatArrayArray5[arg3 + 1][arg4];
			local116 = this.aFloatArrayArray6[arg3 + 1][arg4];
		} else if (this.aClass51_Sub1_1.anInt9118 == arg5 && arg2 == this.aClass51_Sub1_1.anInt9118) {
			local116 = this.aFloatArrayArray6[arg3 + 1][arg4 + 1];
			local123 = this.aFloatArrayArray4[arg3 + 1][arg4 + 1];
			local130 = this.aFloatArrayArray5[arg3 + 1][arg4 + 1];
		} else if (arg5 == 0 && arg2 == this.aClass51_Sub1_1.anInt9118) {
			local130 = this.aFloatArrayArray5[arg3][arg4 + 1];
			local116 = this.aFloatArrayArray6[arg3][arg4 + 1];
			local123 = this.aFloatArrayArray4[arg3][arg4 + 1];
		} else {
			local265 = (float) arg5 / (float) this.aClass51_Sub1_1.anInt9118;
			local273 = (float) arg2 / (float) this.aClass51_Sub1_1.anInt9118;
			local280 = this.aFloatArrayArray4[arg3][arg4];
			local287 = this.aFloatArrayArray5[arg3][arg4];
			local294 = this.aFloatArrayArray6[arg3][arg4];
			local303 = this.aFloatArrayArray4[arg3 + 1][arg4];
			local312 = this.aFloatArrayArray5[arg3 + 1][arg4];
			@Pc(328) float local328 = local287 + (this.aFloatArrayArray5[arg3][arg4 + 1] - local287) * local265;
			@Pc(345) float local345 = local303 + (this.aFloatArrayArray4[arg3 + 1][arg4 + 1] - local303) * local265;
			@Pc(360) float local360 = local294 + (this.aFloatArrayArray6[arg3][arg4 + 1] - local294) * local265;
			@Pc(378) float local378 = local312 + local265 * (this.aFloatArrayArray5[arg3 + 1][arg4 + 1] - local312);
			local387 = this.aFloatArrayArray6[arg3 + 1][arg4];
			@Pc(403) float local403 = local280 + (this.aFloatArrayArray4[arg3][arg4 + 1] - local280) * local265;
			@Pc(421) float local421 = local387 + local265 * (this.aFloatArrayArray6[arg3 + 1][arg4 + 1] - local387);
			local130 = local328 + (local378 - local328) * local273;
			local123 = (local345 - local403) * local273 + local403;
			local116 = local360 + local273 * (local421 - local360);
		}
		local265 = this.aClass3_Sub16_1.method4778() - local16;
		local273 = this.aClass3_Sub16_1.method4777() - local31;
		local280 = this.aClass3_Sub16_1.method4783() - local24;
		local287 = (float) Math.sqrt((double) (local265 * local265 + local273 * local273 + local280 * local280));
		local294 = 1.0F / local287;
		local273 *= local294;
		local265 *= local294;
		local280 *= local294;
		local303 = local287 / (float) this.aClass3_Sub16_1.method4781();
		local312 = 1.0F - local303 * local303;
		if (local312 < 0.0F) {
			local312 = 0.0F;
		}
		local387 = local123 * local265 + local273 * local130 + local280 * local116;
		if (local387 < 0.0F) {
			local387 = 0.0F;
		}
		@Pc(548) float local548 = local387 * local312 * 2.0F;
		if (local548 > 1.0F) {
			local548 = 1.0F;
		}
		@Pc(559) int local559 = this.aClass3_Sub16_1.method4776();
		@Pc(569) int local569 = (int) (local548 * (float) (local559 >> 16 & 0xFF));
		if (local569 > 255) {
			local569 = 255;
		}
		@Pc(586) int local586 = (int) ((float) (local559 >> 8 & 0xFF) * local548);
		if (local586 > 255) {
			local586 = 255;
		}
		@Pc(599) int local599 = (int) (local548 * (float) (local559 & 0xFF));
		if (Stream.a()) {
			this.aStream4.a((float) local16);
			this.aStream4.a((float) local31);
			this.aStream4.a((float) local24);
		} else {
			this.aStream4.b((float) local16);
			this.aStream4.b((float) local31);
			this.aStream4.b((float) local24);
		}
		if (local599 > 255) {
			local599 = 255;
		}
		if (this.aClass5_Sub1_6.anInt6532 == 0) {
			this.aStream4.c(local599);
			this.aStream4.c(local586);
			this.aStream4.c(local569);
		} else {
			this.aStream4.c(local569);
			this.aStream4.c(local586);
			this.aStream4.c(local599);
		}
		this.aStream4.c(255);
		this.method2129(local80);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIII[[Z)V")
	public void method2128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean[][] arg3) {
		if (this.anInterface19_4 == null || (this.anInt2249 > arg2 + arg0 || (arg0 - arg2 > this.anInt2248 || (this.anInt2243 > arg2 + arg1 || arg1 - arg2 > this.anInt2251)))) {
			return;
		}
		for (@Pc(51) int local51 = this.anInt2243; local51 <= this.anInt2251; local51++) {
			for (@Pc(56) int local56 = this.anInt2249; local56 <= this.anInt2248; local56++) {
				@Pc(63) int local63 = local56 - arg0;
				@Pc(67) int local67 = local51 - arg1;
				if (local63 > -arg2 && local63 < arg2 && -arg2 < local67 && arg2 > local67 && arg3[local63 + arg2][arg2 + local67]) {
					this.aClass5_Sub1_6.method5642((byte) (this.aClass3_Sub16_1.method4785() * 255.0F));
					this.aClass5_Sub1_6.method5692(this.anInterface11_11, 0);
					this.aClass5_Sub1_6.method5610(this.aClass5_Sub1_6.aClass46_18);
					this.aClass5_Sub1_6.method5665(Static67.aClass292_2, 0, this.anInt2244, this.anInterface19_4, this.anInt2250 / 3, 0);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(SZ)V")
	private void method2129(@OriginalArg(0) short arg0) {
		if (Stream.a()) {
			this.aStream5.e(arg0);
		} else {
			this.aStream5.d(arg0);
		}
	}
}
