import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aga")
public final class Class4_Sub3 extends Class4 {

	@OriginalMember(owner = "client!aga", name = "A", descriptor = "I")
	private int anInt222;

	@OriginalMember(owner = "client!aga", name = "i", descriptor = "Lclient!an;")
	private final Class16_Sub1 aClass16_Sub1_1;

	@OriginalMember(owner = "client!aga", name = "v", descriptor = "Lclient!ej;")
	private final Class66_Sub1 aClass66_Sub1_1;

	@OriginalMember(owner = "client!aga", name = "F", descriptor = "Lclient!pv;")
	private final Class4_Sub32 aClass4_Sub32_1;

	@OriginalMember(owner = "client!aga", name = "n", descriptor = "I")
	private final int anInt216;

	@OriginalMember(owner = "client!aga", name = "E", descriptor = "I")
	private final int anInt224;

	@OriginalMember(owner = "client!aga", name = "r", descriptor = "I")
	private final int anInt219;

	@OriginalMember(owner = "client!aga", name = "p", descriptor = "I")
	private final int anInt218;

	@OriginalMember(owner = "client!aga", name = "q", descriptor = "[[F")
	private float[][] aFloatArrayArray1;

	@OriginalMember(owner = "client!aga", name = "u", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!aga", name = "y", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!aga", name = "G", descriptor = "I")
	private int anInt225;

	@OriginalMember(owner = "client!aga", name = "j", descriptor = "Lclient!eu;")
	private final Interface4 anInterface4_3;

	@OriginalMember(owner = "client!aga", name = "k", descriptor = "Lclient!ft;")
	private final Interface8 anInterface8_2;

	@OriginalMember(owner = "client!aga", name = "m", descriptor = "Lclient!jw;")
	private Class183 aClass183_1;

	@OriginalMember(owner = "client!aga", name = "s", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream1;

	@OriginalMember(owner = "client!aga", name = "w", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream2;

	@OriginalMember(owner = "client!aga", name = "<init>", descriptor = "(Lclient!ej;Lclient!an;Lclient!pv;[I)V")
	public Class4_Sub3(@OriginalArg(0) Class66_Sub1 arg0, @OriginalArg(1) Class16_Sub1 arg1, @OriginalArg(2) Class4_Sub32 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass16_Sub1_1 = arg1;
		this.aClass66_Sub1_1 = arg0;
		this.aClass4_Sub32_1 = arg2;
		@Pc(23) int local23 = this.aClass4_Sub32_1.method6621() - (arg1.anInt9841 >> 1);
		this.anInt216 = this.aClass4_Sub32_1.method6614() - local23 >> arg1.anInt9837;
		this.anInt224 = this.aClass4_Sub32_1.method6614() + local23 >> arg1.anInt9837;
		this.anInt219 = this.aClass4_Sub32_1.method6617() - local23 >> arg1.anInt9837;
		this.anInt218 = this.aClass4_Sub32_1.method6617() + local23 >> arg1.anInt9837;
		@Pc(79) int local79 = this.anInt224 + 1 - this.anInt216;
		@Pc(87) int local87 = this.anInt218 + 1 - this.anInt219;
		this.aFloatArrayArray1 = new float[local79 + 1][local87 + 1];
		this.aFloatArrayArray2 = new float[local79 + 1][local87 + 1];
		this.aFloatArrayArray3 = new float[local79 + 1][local87 + 1];
		@Pc(123) int local123;
		@Pc(134) int local134;
		@Pc(142) int local142;
		@Pc(172) int local172;
		@Pc(186) int local186;
		for (@Pc(116) int local116 = 0; local116 <= local87; local116++) {
			local123 = this.anInt219 + local116;
			if (local123 > 0 && this.aClass16_Sub1_1.anInt9839 - 1 > local123) {
				for (local134 = 0; local134 <= local79; local134++) {
					local142 = local134 + this.anInt216;
					if (local142 > 0 && local142 < this.aClass16_Sub1_1.anInt9838 - 1) {
						local172 = arg1.JA(local142 + 1, local123) - arg1.JA(local142 - 1, local123);
						local186 = arg1.JA(local142, local123 + 1) - arg1.JA(local142, local123 - 1);
						@Pc(201) float local201 = (float) (1.0D / Math.sqrt((double) (local186 * local186 + local172 * local172 + 65536)));
						this.aFloatArrayArray3[local134][local116] = (float) local172 * local201;
						this.aFloatArrayArray2[local134][local116] = -256.0F * local201;
						this.aFloatArrayArray1[local134][local116] = local201 * (float) local186;
					}
				}
			}
		}
		local123 = 0;
		@Pc(296) int local296;
		for (local134 = this.anInt219; local134 <= this.anInt218; local134++) {
			if (local134 >= 0 && local134 < arg1.anInt9839) {
				for (local142 = this.anInt216; local142 <= this.anInt224; local142++) {
					if (local142 >= 0 && arg1.anInt9838 > local142) {
						local172 = arg3[local123];
						@Pc(284) int[] local284 = arg1.anIntArrayArrayArray3[local142][local134];
						if (local284 != null && local172 != 0) {
							if (local172 == 1) {
								local296 = 0;
								while (local284.length > local296) {
									if (local284[local296++] != -1 && local284[local296++] != -1 && local284[local296++] != -1) {
										this.anInt225 += 3;
									}
								}
							} else {
								this.anInt225 += 3;
							}
						}
					}
					local123++;
				}
			} else {
				local123 += this.anInt224 - this.anInt216;
			}
		}
		if (this.anInt225 <= 0) {
			this.anInterface4_3 = null;
			this.anInterface8_2 = null;
		} else {
			this.aClass183_1 = new Class183(Static514.method7261(this.anInt225));
			this.anInterface8_2 = this.aClass66_Sub1_1.method6859(false);
			this.anInterface8_2.method7148(this.anInt225);
			@Pc(407) NativeHeapBuffer local407 = this.aClass66_Sub1_1.method6900(this.anInt225 * 16, false);
			this.aStream1 = new Stream(local407);
			while (true) {
				@Pc(419) Buffer local419;
				do {
					local419 = this.anInterface8_2.method7149();
				} while (local419 == null);
				this.aStream2 = new Stream(local419);
				local123 = 0;
				local186 = 0;
				for (local296 = this.anInt219; local296 <= this.anInt218; local296++) {
					if (local296 >= 0 && arg1.anInt9839 > local296) {
						@Pc(458) int local458 = 0;
						for (@Pc(461) int local461 = this.anInt216; local461 <= this.anInt224; local461++) {
							if (local461 >= 0 && local461 < arg1.anInt9838) {
								@Pc(477) int local477 = arg3[local123];
								@Pc(484) int[] local484 = arg1.anIntArrayArrayArray3[local461][local296];
								if (local484 != null && local477 != 0) {
									if (local477 == 1) {
										@Pc(645) int[] local645 = arg1.anIntArrayArrayArray8[local461][local296];
										@Pc(652) int[] local652 = arg1.anIntArrayArrayArray4[local461][local296];
										@Pc(654) int local654 = 0;
										label118: while (true) {
											while (true) {
												if (local654 >= local484.length) {
													break label118;
												}
												if (local484[local654] == -1 || local484[local654 + 1] == -1 || local484[local654 + 2] == -1) {
													local654 += 3;
												} else {
													this.method264(local461, local458, local296, local645[local654], local186, local652[local654]);
													local654++;
													this.method264(local461, local458, local296, local645[local654], local186, local652[local654]);
													local654++;
													this.method264(local461, local458, local296, local645[local654], local186, local652[local654]);
													local654++;
												}
											}
										}
									} else if (local477 == 3) {
										this.method264(local461, local458, local296, 0, local186, 0);
										this.method264(local461, local458, local296, arg1.anInt9841, local186, 0);
										this.method264(local461, local458, local296, 0, local186, arg1.anInt9841);
									} else if (local477 == 2) {
										this.method264(local461, local458, local296, arg1.anInt9841, local186, 0);
										this.method264(local461, local458, local296, arg1.anInt9841, local186, arg1.anInt9841);
										this.method264(local461, local458, local296, 0, local186, 0);
									} else if (local477 == 5) {
										this.method264(local461, local458, local296, arg1.anInt9841, local186, arg1.anInt9841);
										this.method264(local461, local458, local296, 0, local186, arg1.anInt9841);
										this.method264(local461, local458, local296, arg1.anInt9841, local186, 0);
									} else if (local477 == 4) {
										this.method264(local461, local458, local296, 0, local186, arg1.anInt9841);
										this.method264(local461, local458, local296, 0, local186, 0);
										this.method264(local461, local458, local296, arg1.anInt9841, local186, arg1.anInt9841);
									}
								}
							}
							local123++;
							local458++;
						}
					} else {
						local123 += this.anInt224 - this.anInt216;
					}
					local186++;
				}
				this.aStream2.c();
				if (this.anInterface8_2.method7150()) {
					this.aStream1.c();
					this.anInterface4_3 = this.aClass66_Sub1_1.method6931(false);
					this.anInterface4_3.method3561(16, this.anInt222 * 16, local407);
					break;
				}
				this.aStream1.d(0);
				this.aClass183_1.method4287();
			}
		}
		this.aStream2 = null;
		this.aFloatArrayArray3 = this.aFloatArrayArray2 = this.aFloatArrayArray1 = null;
		this.aClass183_1 = null;
		this.aStream1 = null;
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(IIIIIII)V")
	private void method264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg0 << this.aClass16_Sub1_1.anInt9837) + arg3;
		@Pc(23) int local23 = (arg2 << this.aClass16_Sub1_1.anInt9837) + arg5;
		@Pc(29) int local29 = this.aClass16_Sub1_1.sa(local15, local23);
		if ((arg3 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			local7 = ((long) local23 & 0xFFFFL) << 16 | (long) local15 & 0xFFFFL;
			@Pc(55) Class4 local55 = this.aClass183_1.method4289(local7);
			if (local55 != null) {
				this.method267(((Class4_Sub52) local55).aShort126);
				return;
			}
		}
		@Pc(75) short local75 = (short) this.anInt222++;
		if (local7 != -1L) {
			this.aClass183_1.method4282(local7, new Class4_Sub52(local75));
		}
		@Pc(109) float local109;
		@Pc(102) float local102;
		@Pc(116) float local116;
		@Pc(216) float local216;
		@Pc(224) float local224;
		@Pc(231) float local231;
		@Pc(238) float local238;
		@Pc(245) float local245;
		@Pc(254) float local254;
		@Pc(263) float local263;
		@Pc(287) float local287;
		if (arg3 == 0 && arg5 == 0) {
			local102 = this.aFloatArrayArray2[arg1][arg4];
			local109 = this.aFloatArrayArray3[arg1][arg4];
			local116 = this.aFloatArrayArray1[arg1][arg4];
		} else if (arg3 == this.aClass16_Sub1_1.anInt9841 && arg5 == 0) {
			local109 = this.aFloatArrayArray3[arg1 + 1][arg4];
			local116 = this.aFloatArrayArray1[arg1 + 1][arg4];
			local102 = this.aFloatArrayArray2[arg1 + 1][arg4];
		} else if (this.aClass16_Sub1_1.anInt9841 == arg3 && this.aClass16_Sub1_1.anInt9841 == arg5) {
			local109 = this.aFloatArrayArray3[arg1 + 1][arg4 + 1];
			local102 = this.aFloatArrayArray2[arg1 + 1][arg4 + 1];
			local116 = this.aFloatArrayArray1[arg1 + 1][arg4 + 1];
		} else if (arg3 == 0 && arg5 == this.aClass16_Sub1_1.anInt9841) {
			local102 = this.aFloatArrayArray2[arg1][arg4 + 1];
			local116 = this.aFloatArrayArray1[arg1][arg4 + 1];
			local109 = this.aFloatArrayArray3[arg1][arg4 + 1];
		} else {
			local216 = (float) arg3 / (float) this.aClass16_Sub1_1.anInt9841;
			local224 = (float) arg5 / (float) this.aClass16_Sub1_1.anInt9841;
			local231 = this.aFloatArrayArray3[arg1][arg4];
			local238 = this.aFloatArrayArray2[arg1][arg4];
			local245 = this.aFloatArrayArray1[arg1][arg4];
			local254 = this.aFloatArrayArray3[arg1 + 1][arg4];
			local263 = this.aFloatArrayArray2[arg1 + 1][arg4];
			@Pc(278) float local278 = local245 + local216 * (this.aFloatArrayArray1[arg1][arg4 + 1] - local245);
			local287 = this.aFloatArrayArray1[arg1 + 1][arg4];
			@Pc(304) float local304 = local254 + (this.aFloatArrayArray3[arg1 + 1][arg4 + 1] - local254) * local216;
			@Pc(322) float local322 = local263 + (this.aFloatArrayArray2[arg1 + 1][arg4 + 1] - local263) * local216;
			@Pc(338) float local338 = local238 + (this.aFloatArrayArray2[arg1][arg4 + 1] - local238) * local216;
			@Pc(354) float local354 = local231 + (this.aFloatArrayArray3[arg1][arg4 + 1] - local231) * local216;
			local109 = (local304 - local354) * local224 + local354;
			@Pc(380) float local380 = local287 + (this.aFloatArrayArray1[arg1 + 1][arg4 + 1] - local287) * local216;
			local102 = local338 + local224 * (local322 - local338);
			local116 = local278 + (local380 - local278) * local224;
		}
		local216 = this.aClass4_Sub32_1.method6614() - local15;
		local224 = this.aClass4_Sub32_1.method6615(-18736) - local29;
		local231 = this.aClass4_Sub32_1.method6617() - local23;
		local238 = (float) Math.sqrt((double) (local231 * local231 + local224 * local224 + local216 * local216));
		local245 = 1.0F / local238;
		local216 *= local245;
		local224 *= local245;
		local231 *= local245;
		local254 = local238 / (float) this.aClass4_Sub32_1.method6621();
		local263 = (float) 1 - local254 * local254;
		if (local263 < 0.0F) {
			local263 = 0.0F;
		}
		local287 = local116 * local231 + local109 * local216 + local102 * local224;
		if (local287 < 0.0F) {
			local287 = 0.0F;
		}
		@Pc(538) float local538 = local287 * 2.0F * local263;
		if (local538 > 1.0F) {
			local538 = 1.0F;
		}
		@Pc(549) int local549 = this.aClass4_Sub32_1.method6613(86);
		@Pc(559) int local559 = (int) (local538 * (float) (local549 >> 16 & 0xFF));
		if (local559 > 255) {
			local559 = 255;
		}
		@Pc(576) int local576 = (int) (local538 * (float) (local549 >> 8 & 0xFF));
		if (local576 > 255) {
			local576 = 255;
		}
		@Pc(589) int local589 = (int) (local538 * (float) (local549 & 0xFF));
		if (local589 > 255) {
			local589 = 255;
		}
		if (Stream.b()) {
			this.aStream1.b((float) local15);
			this.aStream1.b((float) local29);
			this.aStream1.b((float) local23);
		} else {
			this.aStream1.a((float) local15);
			this.aStream1.a((float) local29);
			this.aStream1.a((float) local23);
		}
		if (this.aClass66_Sub1_1.anInt8418 == 0) {
			this.aStream1.f(local589);
			this.aStream1.f(local576);
			this.aStream1.f(local559);
		} else {
			this.aStream1.f(local559);
			this.aStream1.f(local576);
			this.aStream1.f(local589);
		}
		this.aStream1.f(255);
		this.method267(local75);
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(SI)V")
	private void method267(@OriginalArg(0) short arg0) {
		if (Stream.b()) {
			this.aStream2.c(arg0);
		} else {
			this.aStream2.e(arg0);
		}
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(II[[ZIB)V")
	public void method268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[][] arg2, @OriginalArg(3) int arg3) {
		if (this.anInterface8_2 == null || (arg3 + arg1 < this.anInt216 || (this.anInt224 < arg3 - arg1 || (arg1 + arg0 < this.anInt219 || arg0 - arg1 > this.anInt218)))) {
			return;
		}
		for (@Pc(54) int local54 = this.anInt219; local54 <= this.anInt218; local54++) {
			for (@Pc(59) int local59 = this.anInt216; local59 <= this.anInt224; local59++) {
				@Pc(66) int local66 = local59 - arg3;
				@Pc(71) int local71 = local54 - arg0;
				if (-arg1 < local66 && arg1 > local66 && -arg1 < local71 && local71 < arg1 && arg2[local66 + arg1][local71 + arg1]) {
					this.aClass66_Sub1_1.method6918((byte) (this.aClass4_Sub32_1.method6618() * 255.0F));
					this.aClass66_Sub1_1.method6941(this.anInterface4_3, 0);
					this.aClass66_Sub1_1.method6890(this.aClass66_Sub1_1.aClass321_19);
					this.aClass66_Sub1_1.method6917(0, Static453.aClass247_5, this.anInterface8_2, 0, this.anInt222, this.anInt225 / 3);
					return;
				}
			}
		}
	}
}
