import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public final class Class3_Sub15 extends Class3 {

	@OriginalMember(owner = "client!dn", name = "q", descriptor = "I")
	private int anInt2339;

	@OriginalMember(owner = "client!dn", name = "F", descriptor = "Lclient!tr;")
	private final Class139_Sub3 aClass139_Sub3_1;

	@OriginalMember(owner = "client!dn", name = "w", descriptor = "Lclient!cf;")
	private final Class43_Sub1 aClass43_Sub1_4;

	@OriginalMember(owner = "client!dn", name = "z", descriptor = "Lclient!ff;")
	private final Class3_Sub22 aClass3_Sub22_1;

	@OriginalMember(owner = "client!dn", name = "n", descriptor = "I")
	private final int anInt2338;

	@OriginalMember(owner = "client!dn", name = "s", descriptor = "I")
	private final int anInt2341;

	@OriginalMember(owner = "client!dn", name = "j", descriptor = "I")
	private final int anInt2336;

	@OriginalMember(owner = "client!dn", name = "r", descriptor = "I")
	private final int anInt2340;

	@OriginalMember(owner = "client!dn", name = "A", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!dn", name = "p", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!dn", name = "m", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!dn", name = "k", descriptor = "I")
	private int anInt2337;

	@OriginalMember(owner = "client!dn", name = "C", descriptor = "Lclient!or;")
	private final Interface17 anInterface17_2;

	@OriginalMember(owner = "client!dn", name = "y", descriptor = "Lclient!wl;")
	private final Interface24 anInterface24_5;

	@OriginalMember(owner = "client!dn", name = "o", descriptor = "Lclient!sl;")
	private Class310 aClass310_7;

	@OriginalMember(owner = "client!dn", name = "u", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream3;

	@OriginalMember(owner = "client!dn", name = "l", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream2;

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Lclient!cf;Lclient!tr;Lclient!ff;[I)V")
	public Class3_Sub15(@OriginalArg(0) Class43_Sub1 arg0, @OriginalArg(1) Class139_Sub3 arg1, @OriginalArg(2) Class3_Sub22 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass139_Sub3_1 = arg1;
		this.aClass43_Sub1_4 = arg0;
		this.aClass3_Sub22_1 = arg2;
		@Pc(22) int local22 = this.aClass3_Sub22_1.method6729() - (arg1.anInt8178 >> 1);
		this.anInt2338 = this.aClass3_Sub22_1.method6731() - local22 >> arg1.anInt8176;
		this.anInt2341 = local22 + this.aClass3_Sub22_1.method6731() >> arg1.anInt8176;
		this.anInt2336 = this.aClass3_Sub22_1.method6725() - local22 >> arg1.anInt8176;
		this.anInt2340 = local22 + this.aClass3_Sub22_1.method6725() >> arg1.anInt8176;
		@Pc(77) int local77 = this.anInt2341 + 1 - this.anInt2338;
		@Pc(86) int local86 = this.anInt2340 + 1 - this.anInt2336;
		this.aFloatArrayArray4 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray3 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray2 = new float[local77 + 1][local86 + 1];
		@Pc(123) int local123;
		@Pc(134) int local134;
		@Pc(141) int local141;
		@Pc(167) int local167;
		@Pc(183) int local183;
		for (@Pc(115) int local115 = 0; local115 <= local86; local115++) {
			local123 = local115 + this.anInt2336;
			if (local123 > 0 && this.aClass139_Sub3_1.anInt8180 - 1 > local123) {
				for (local134 = 0; local134 <= local77; local134++) {
					local141 = local134 + this.anInt2338;
					if (local141 > 0 && this.aClass139_Sub3_1.anInt8179 - 1 > local141) {
						local167 = arg1.method6889(local141 + 1, local123) - arg1.method6889(local141 - 1, local123);
						local183 = arg1.method6889(local141, local123 + 1) - arg1.method6889(local141, local123 - 1);
						@Pc(199) float local199 = (float) (1.0D / Math.sqrt((double) (local167 * local167 + local183 * local183 + 65536)));
						this.aFloatArrayArray3[local134][local115] = local199 * (float) local167;
						this.aFloatArrayArray4[local134][local115] = local199 * -256.0F;
						this.aFloatArrayArray2[local134][local115] = (float) local183 * local199;
					}
				}
			}
		}
		local123 = 0;
		@Pc(303) int local303;
		for (local134 = this.anInt2336; local134 <= this.anInt2340; local134++) {
			if (local134 >= 0 && arg1.anInt8180 > local134) {
				for (local141 = this.anInt2338; local141 <= this.anInt2341; local141++) {
					if (local141 >= 0 && arg1.anInt8179 > local141) {
						local167 = arg3[local123];
						@Pc(286) int[] local286 = arg1.anIntArrayArrayArray19[local141][local134];
						if (local286 != null && local167 != 0) {
							if (local167 == 1) {
								local303 = 0;
								while (local286.length > local303) {
									if (local286[local303++] != -1 && local286[local303++] != -1 && local286[local303++] != -1) {
										this.anInt2337 += 3;
									}
								}
							} else {
								this.anInt2337 += 3;
							}
						}
					}
					local123++;
				}
			} else {
				local123 += this.anInt2341 - this.anInt2338;
			}
		}
		if (this.anInt2337 <= 0) {
			this.anInterface17_2 = null;
			this.anInterface24_5 = null;
		} else {
			this.aClass310_7 = new Class310(Static114.method2375(this.anInt2337));
			this.anInterface17_2 = this.aClass43_Sub1_4.method4258(false);
			this.anInterface17_2.method6942(this.anInt2337);
			@Pc(403) NativeHeapBuffer local403 = this.aClass43_Sub1_4.method4271(false, this.anInt2337 * 16);
			this.aStream3 = new Stream(local403);
			while (true) {
				@Pc(415) Buffer local415;
				do {
					local415 = this.anInterface17_2.method6938();
				} while (local415 == null);
				this.aStream2 = new Stream(local415);
				local183 = 0;
				local123 = 0;
				for (local303 = this.anInt2336; local303 <= this.anInt2340; local303++) {
					if (local303 >= 0 && local303 < arg1.anInt8180) {
						@Pc(447) int local447 = 0;
						for (@Pc(450) int local450 = this.anInt2338; local450 <= this.anInt2341; local450++) {
							if (local450 >= 0 && local450 < arg1.anInt8179) {
								@Pc(466) int local466 = arg3[local123];
								@Pc(473) int[] local473 = arg1.anIntArrayArrayArray19[local450][local303];
								if (local473 != null && local466 != 0) {
									if (local466 == 1) {
										@Pc(636) int[] local636 = arg1.anIntArrayArrayArray15[local450][local303];
										@Pc(643) int[] local643 = arg1.anIntArrayArrayArray20[local450][local303];
										@Pc(645) int local645 = 0;
										label118: while (true) {
											while (true) {
												if (local473.length <= local645) {
													break label118;
												}
												if (local473[local645] == -1 || local473[local645 + 1] == -1 || local473[local645 + 2] == -1) {
													local645 += 3;
												} else {
													this.method2102(local450, local183, local636[local645], local447, local643[local645], local303);
													local645++;
													this.method2102(local450, local183, local636[local645], local447, local643[local645], local303);
													local645++;
													this.method2102(local450, local183, local636[local645], local447, local643[local645], local303);
													local645++;
												}
											}
										}
									} else if (local466 == 3) {
										this.method2102(local450, local183, 0, local447, 0, local303);
										this.method2102(local450, local183, arg1.anInt8178, local447, 0, local303);
										this.method2102(local450, local183, 0, local447, arg1.anInt8178, local303);
									} else if (local466 == 2) {
										this.method2102(local450, local183, arg1.anInt8178, local447, 0, local303);
										this.method2102(local450, local183, arg1.anInt8178, local447, arg1.anInt8178, local303);
										this.method2102(local450, local183, 0, local447, 0, local303);
									} else if (local466 == 5) {
										this.method2102(local450, local183, arg1.anInt8178, local447, arg1.anInt8178, local303);
										this.method2102(local450, local183, 0, local447, arg1.anInt8178, local303);
										this.method2102(local450, local183, arg1.anInt8178, local447, 0, local303);
									} else if (local466 == 4) {
										this.method2102(local450, local183, 0, local447, arg1.anInt8178, local303);
										this.method2102(local450, local183, 0, local447, 0, local303);
										this.method2102(local450, local183, arg1.anInt8178, local447, arg1.anInt8178, local303);
									}
								}
							}
							local447++;
							local123++;
						}
					} else {
						local123 += this.anInt2341 - this.anInt2338;
					}
					local183++;
				}
				this.aStream2.a();
				if (this.anInterface17_2.method6941()) {
					this.aStream3.a();
					this.anInterface24_5 = this.aClass43_Sub1_4.method4188(false);
					this.anInterface24_5.method4800(16, this.anInt2339 * 16, local403);
					break;
				}
				this.aStream3.b(0);
				this.aClass310_7.method6605();
			}
		}
		this.aFloatArrayArray3 = this.aFloatArrayArray4 = this.aFloatArrayArray2 = null;
		this.aClass310_7 = null;
		this.aStream2 = null;
		this.aStream3 = null;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IS)V")
	private void method2098(@OriginalArg(1) short arg0) {
		if (Stream.c()) {
			this.aStream2.d(arg0);
		} else {
			this.aStream2.f(arg0);
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "([[ZIIIB)V")
	public void method2100(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInterface17_2 == null || (this.anInt2338 > arg2 + arg3 || (arg3 - arg2 > this.anInt2341 || (this.anInt2336 > arg2 + arg1 || arg1 - arg2 > this.anInt2340)))) {
			return;
		}
		for (@Pc(53) int local53 = this.anInt2336; local53 <= this.anInt2340; local53++) {
			for (@Pc(58) int local58 = this.anInt2338; local58 <= this.anInt2341; local58++) {
				@Pc(65) int local65 = local58 - arg3;
				@Pc(70) int local70 = local53 - arg1;
				if (-arg2 < local65 && arg2 > local65 && -arg2 < local70 && local70 < arg2 && arg0[arg2 + local65][local70 + arg2]) {
					this.aClass43_Sub1_4.method4269((byte) (this.aClass3_Sub22_1.method6732() * 255.0F));
					this.aClass43_Sub1_4.method4181(0, this.anInterface24_5);
					this.aClass43_Sub1_4.method4196(this.aClass43_Sub1_4.aClass48_15);
					this.aClass43_Sub1_4.method4232(Static534.aClass319_7, 0, this.anInt2339, 0, this.anInt2337 / 3, this.anInterface17_2);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIIIII)V")
	private void method2102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(16) int local16 = arg2 + (arg0 << this.aClass139_Sub3_1.anInt8176);
		@Pc(24) int local24 = (arg5 << this.aClass139_Sub3_1.anInt8176) + arg4;
		@Pc(33) int local33 = this.aClass139_Sub3_1.method6890(local16, local24);
		if ((arg2 & 0x7F) == 0 || (arg4 & 0x7F) == 0) {
			local7 = (long) local16 & 0xFFFFL | (long) local24 << 16 & 0xFFFFL << 16;
			@Pc(64) Class3 local64 = this.aClass310_7.method6601(local7);
			if (local64 != null) {
				this.method2098(((Class3_Sub26) local64).aShort53);
				return;
			}
		}
		@Pc(82) short local82 = (short) this.anInt2339++;
		if (local7 != -1L) {
			this.aClass310_7.method6603(new Class3_Sub26(local82), local7);
		}
		@Pc(132) float local132;
		@Pc(123) float local123;
		@Pc(141) float local141;
		@Pc(207) float local207;
		@Pc(215) float local215;
		@Pc(222) float local222;
		@Pc(229) float local229;
		@Pc(236) float local236;
		@Pc(245) float local245;
		@Pc(254) float local254;
		@Pc(263) float local263;
		if (arg2 == 0 && arg4 == 0) {
			local132 = this.aFloatArrayArray3[arg3][arg1];
			local141 = this.aFloatArrayArray2[arg3][arg1];
			local123 = this.aFloatArrayArray4[arg3][arg1];
		} else if (arg2 == this.aClass139_Sub3_1.anInt8178 && arg4 == 0) {
			local123 = this.aFloatArrayArray4[arg3 + 1][arg1];
			local132 = this.aFloatArrayArray3[arg3 + 1][arg1];
			local141 = this.aFloatArrayArray2[arg3 + 1][arg1];
		} else if (this.aClass139_Sub3_1.anInt8178 == arg2 && this.aClass139_Sub3_1.anInt8178 == arg4) {
			local141 = this.aFloatArrayArray2[arg3 + 1][arg1 + 1];
			local132 = this.aFloatArrayArray3[arg3 + 1][arg1 + 1];
			local123 = this.aFloatArrayArray4[arg3 + 1][arg1 + 1];
		} else if (arg2 == 0 && arg4 == this.aClass139_Sub3_1.anInt8178) {
			local123 = this.aFloatArrayArray4[arg3][arg1 + 1];
			local132 = this.aFloatArrayArray3[arg3][arg1 + 1];
			local141 = this.aFloatArrayArray2[arg3][arg1 + 1];
		} else {
			local207 = (float) arg2 / (float) this.aClass139_Sub3_1.anInt8178;
			local215 = (float) arg4 / (float) this.aClass139_Sub3_1.anInt8178;
			local222 = this.aFloatArrayArray3[arg3][arg1];
			local229 = this.aFloatArrayArray4[arg3][arg1];
			local236 = this.aFloatArrayArray2[arg3][arg1];
			local245 = this.aFloatArrayArray3[arg3 + 1][arg1];
			local254 = this.aFloatArrayArray4[arg3 + 1][arg1];
			local263 = this.aFloatArrayArray2[arg3 + 1][arg1];
			@Pc(278) float local278 = local236 + (this.aFloatArrayArray2[arg3][arg1 + 1] - local236) * local207;
			@Pc(294) float local294 = local222 + local207 * (this.aFloatArrayArray3[arg3][arg1 + 1] - local222);
			@Pc(312) float local312 = local245 + local207 * (this.aFloatArrayArray3[arg3 + 1][arg1 + 1] - local245);
			@Pc(328) float local328 = local229 + (this.aFloatArrayArray4[arg3][arg1 + 1] - local229) * local207;
			@Pc(346) float local346 = local254 + (this.aFloatArrayArray4[arg3 + 1][arg1 + 1] - local254) * local207;
			local132 = local215 * (local312 - local294) + local294;
			@Pc(373) float local373 = local263 + local207 * (this.aFloatArrayArray2[arg3 + 1][arg1 + 1] - local263);
			local123 = local328 + local215 * (local346 - local328);
			local141 = local215 * (local373 - local278) + local278;
		}
		local207 = this.aClass3_Sub22_1.method6731() - local16;
		local215 = this.aClass3_Sub22_1.method6728() - local33;
		local222 = this.aClass3_Sub22_1.method6725() - local24;
		local229 = (float) Math.sqrt((double) (local215 * local215 + local207 * local207 + local222 * local222));
		local236 = 1.0F / local229;
		local222 *= local236;
		local207 *= local236;
		local215 *= local236;
		local245 = local229 / (float) this.aClass3_Sub22_1.method6729();
		local254 = 1.0F - local245 * local245;
		if (local254 < 0.0F) {
			local254 = 0.0F;
		}
		local263 = local207 * local132 + local123 * local215 + local141 * local222;
		if (local263 < 0.0F) {
			local263 = 0.0F;
		}
		@Pc(541) float local541 = local254 * 2.0F * local263;
		if (local541 > 1.0F) {
			local541 = 1.0F;
		}
		@Pc(552) int local552 = this.aClass3_Sub22_1.method6724();
		@Pc(562) int local562 = (int) ((float) (local552 >> 16 & 0xFF) * local541);
		if (local562 > 255) {
			local562 = 255;
		}
		@Pc(577) int local577 = (int) ((float) (local552 >> 8 & 0xFF) * local541);
		if (local577 > 255) {
			local577 = 255;
		}
		@Pc(592) int local592 = (int) (local541 * (float) (local552 & 0xFF));
		if (local592 > 255) {
			local592 = 255;
		}
		if (Stream.c()) {
			this.aStream3.a((float) local16);
			this.aStream3.a((float) local33);
			this.aStream3.a((float) local24);
		} else {
			this.aStream3.b((float) local16);
			this.aStream3.b((float) local33);
			this.aStream3.b((float) local24);
		}
		if (this.aClass43_Sub1_4.anInt4823 == 0) {
			this.aStream3.a(local592);
			this.aStream3.a(local577);
			this.aStream3.a(local562);
		} else {
			this.aStream3.a(local562);
			this.aStream3.a(local577);
			this.aStream3.a(local592);
		}
		this.aStream3.a(255);
		this.method2098(local82);
	}
}
