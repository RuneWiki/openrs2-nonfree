import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lp")
public final class Class6_Sub27 extends Class6 {

	@OriginalMember(owner = "client!lp", name = "N", descriptor = "I")
	private int anInt5497;

	@OriginalMember(owner = "client!lp", name = "w", descriptor = "Lclient!ot;")
	private final Class46_Sub3 aClass46_Sub3_1;

	@OriginalMember(owner = "client!lp", name = "x", descriptor = "Lclient!en;")
	private final Class90_Sub1 aClass90_Sub1_25;

	@OriginalMember(owner = "client!lp", name = "z", descriptor = "Lclient!ld;")
	private final Class6_Sub25 aClass6_Sub25_1;

	@OriginalMember(owner = "client!lp", name = "K", descriptor = "I")
	private int anInt5495;

	@OriginalMember(owner = "client!lp", name = "D", descriptor = "I")
	private final int anInt5493;

	@OriginalMember(owner = "client!lp", name = "o", descriptor = "I")
	private final int anInt5487;

	@OriginalMember(owner = "client!lp", name = "n", descriptor = "I")
	private final int anInt5486;

	@OriginalMember(owner = "client!lp", name = "F", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!lp", name = "G", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!lp", name = "L", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!lp", name = "M", descriptor = "I")
	private int anInt5496;

	@OriginalMember(owner = "client!lp", name = "H", descriptor = "Lclient!kca;")
	private final Class166 aClass166_8;

	@OriginalMember(owner = "client!lp", name = "O", descriptor = "Lclient!pn;")
	private final Interface14 anInterface14_5;

	@OriginalMember(owner = "client!lp", name = "t", descriptor = "Lclient!qa;")
	private final Interface15 anInterface15_4;

	@OriginalMember(owner = "client!lp", name = "B", descriptor = "Lclient!kca;")
	private final Class166 aClass166_7;

	@OriginalMember(owner = "client!lp", name = "y", descriptor = "Lclient!jr;")
	private final Class6_Sub12 aClass6_Sub12_4;

	@OriginalMember(owner = "client!lp", name = "s", descriptor = "Lclient!dl;")
	private final Class6_Sub12_Sub1 aClass6_Sub12_Sub1_2;

	@OriginalMember(owner = "client!lp", name = "p", descriptor = "Lclient!oj;")
	private final Class234 aClass234_33;

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Lclient!en;Lclient!ot;Lclient!ld;[I)V")
	public Class6_Sub27(@OriginalArg(0) Class90_Sub1 arg0, @OriginalArg(1) Class46_Sub3 arg1, @OriginalArg(2) Class6_Sub25 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass46_Sub3_1 = arg1;
		this.aClass90_Sub1_25 = arg0;
		this.aClass6_Sub25_1 = arg2;
		@Pc(22) int local22 = this.aClass6_Sub25_1.method6398() - (arg1.anInt9998 >> 1);
		this.anInt5495 = this.aClass6_Sub25_1.method6405() - local22 >> arg1.anInt10000;
		this.anInt5493 = local22 + this.aClass6_Sub25_1.method6405() >> arg1.anInt10000;
		this.anInt5487 = this.aClass6_Sub25_1.method6400() - local22 >> arg1.anInt10000;
		this.anInt5486 = this.aClass6_Sub25_1.method6400() + local22 >> arg1.anInt10000;
		@Pc(78) int local78 = this.anInt5493 + 1 - this.anInt5495;
		@Pc(87) int local87 = this.anInt5486 + 1 - this.anInt5487;
		this.aFloatArrayArray5 = new float[local78 + 1][local87 + 1];
		this.aFloatArrayArray6 = new float[local78 + 1][local87 + 1];
		this.aFloatArrayArray7 = new float[local78 + 1][local87 + 1];
		@Pc(137) int local137;
		@Pc(144) int local144;
		@Pc(174) int local174;
		@Pc(188) int local188;
		for (@Pc(116) int local116 = 0; local116 <= local87; local116++) {
			@Pc(123) int local123 = this.anInt5487 + local116;
			if (local123 > 0 && this.aClass46_Sub3_1.anInt9995 - 1 > local123) {
				for (local137 = 0; local137 <= local78; local137++) {
					local144 = this.anInt5495 + local137;
					if (local144 > 0 && local144 < this.aClass46_Sub3_1.anInt9997 - 1) {
						local174 = arg1.JA(local144 + 1, local123) - arg1.JA(local144 - 1, local123);
						local188 = arg1.JA(local144, local123 + 1) - arg1.JA(local144, local123 - 1);
						@Pc(203) float local203 = (float) (1.0D / Math.sqrt((double) (local188 * local188 + local174 * local174 + 65536)));
						this.aFloatArrayArray7[local137][local116] = local203 * (float) local174;
						this.aFloatArrayArray6[local137][local116] = local203 * -256.0F;
						this.aFloatArrayArray5[local137][local116] = (float) local188 * local203;
					}
				}
			}
		}
		local137 = 0;
		for (local144 = this.anInt5487; local144 <= this.anInt5486; local144++) {
			if (local144 >= 0 && local144 < arg1.anInt9995) {
				for (local174 = this.anInt5495; local174 <= this.anInt5493; local174++) {
					if (local174 >= 0 && arg1.anInt9997 > local174) {
						local188 = arg3[local137];
						@Pc(291) int[] local291 = arg1.anIntArrayArrayArray16[local174][local144];
						if (local291 != null && local188 != 0) {
							if (local188 == 1) {
								@Pc(305) int local305 = 0;
								while (local305 < local291.length) {
									if (local291[local305++] != -1 && local291[local305++] != -1 && local291[local305++] != -1) {
										this.anInt5496 += 3;
									}
								}
							} else {
								this.anInt5496 += 3;
							}
						}
					}
					local137++;
				}
			} else {
				local137 += this.anInt5493 - this.anInt5495;
			}
		}
		this.aClass166_8 = null;
		this.anInterface14_5 = null;
		this.anInterface15_4 = null;
		this.aClass166_7 = null;
		this.aFloatArrayArray7 = this.aFloatArrayArray6 = this.aFloatArrayArray5 = null;
		this.aClass6_Sub12_Sub1_2 = null;
		this.aClass6_Sub12_4 = null;
		this.aClass234_33 = null;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(SI)V")
	private void method4529(@OriginalArg(0) short arg0, @OriginalArg(1) int arg1) {
		if (this.aClass90_Sub1_25.aBoolean176) {
			this.aClass6_Sub12_4.method6032(arg0);
		} else {
			this.aClass6_Sub12_4.method6021(arg0);
		}
		if (arg1 >= -112) {
			this.anInt5495 = -2;
		}
		this.anInt5496++;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIIIIIZ)V")
	private void method4530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(7) long local7 = -1L;
		@Pc(16) int local16 = arg1 + (arg0 << this.aClass46_Sub3_1.anInt10000);
		@Pc(24) int local24 = (arg2 << this.aClass46_Sub3_1.anInt10000) + arg3;
		@Pc(30) int local30 = this.aClass46_Sub3_1.sa(local16, local24);
		if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
			local7 = (long) local24 << 16 & 0xFFFFL << 16 | (long) local16 & 0xFFFFL;
			@Pc(64) Class6 local64 = this.aClass234_33.method5464(local7);
			if (local64 != null) {
				this.method4529(((Class6_Sub31) local64).aShort85, -127);
				return;
			}
		}
		@Pc(82) short local82 = (short) this.anInt5497++;
		if (local7 != -1L) {
			this.aClass234_33.method5466(local7, new Class6_Sub31(local82));
		}
		@Pc(150) float local150;
		@Pc(141) float local141;
		@Pc(159) float local159;
		@Pc(169) float local169;
		@Pc(177) float local177;
		@Pc(184) float local184;
		@Pc(191) float local191;
		@Pc(198) float local198;
		@Pc(207) float local207;
		@Pc(216) float local216;
		@Pc(259) float local259;
		if (arg1 == 0 && arg3 == 0) {
			local141 = this.aFloatArrayArray6[arg4][arg5];
			local159 = this.aFloatArrayArray5[arg4][arg5];
			local150 = this.aFloatArrayArray7[arg4][arg5];
		} else if (this.aClass46_Sub3_1.anInt9998 == arg1 && arg3 == 0) {
			local141 = this.aFloatArrayArray6[arg4 + 1][arg5];
			local159 = this.aFloatArrayArray5[arg4 + 1][arg5];
			local150 = this.aFloatArrayArray7[arg4 + 1][arg5];
		} else if (this.aClass46_Sub3_1.anInt9998 == arg1 && this.aClass46_Sub3_1.anInt9998 == arg3) {
			local159 = this.aFloatArrayArray5[arg4 + 1][arg5 + 1];
			local150 = this.aFloatArrayArray7[arg4 + 1][arg5 + 1];
			local141 = this.aFloatArrayArray6[arg4 + 1][arg5 + 1];
		} else if (arg1 == 0 && this.aClass46_Sub3_1.anInt9998 == arg3) {
			local141 = this.aFloatArrayArray6[arg4][arg5 + 1];
			local150 = this.aFloatArrayArray7[arg4][arg5 + 1];
			local159 = this.aFloatArrayArray5[arg4][arg5 + 1];
		} else {
			local169 = (float) arg1 / (float) this.aClass46_Sub3_1.anInt9998;
			local177 = (float) arg3 / (float) this.aClass46_Sub3_1.anInt9998;
			local184 = this.aFloatArrayArray7[arg4][arg5];
			local191 = this.aFloatArrayArray6[arg4][arg5];
			local198 = this.aFloatArrayArray5[arg4][arg5];
			local207 = this.aFloatArrayArray7[arg4 + 1][arg5];
			local216 = this.aFloatArrayArray6[arg4 + 1][arg5];
			@Pc(234) float local234 = local216 + local169 * (this.aFloatArrayArray6[arg4 + 1][arg5 + 1] - local216);
			@Pc(250) float local250 = local184 + (this.aFloatArrayArray7[arg4][arg5 + 1] - local184) * local169;
			local259 = this.aFloatArrayArray5[arg4 + 1][arg5];
			@Pc(274) float local274 = local191 + local169 * (this.aFloatArrayArray6[arg4][arg5 + 1] - local191);
			@Pc(292) float local292 = local207 + local169 * (this.aFloatArrayArray7[arg4 + 1][arg5 + 1] - local207);
			@Pc(307) float local307 = local198 + (this.aFloatArrayArray5[arg4][arg5 + 1] - local198) * local169;
			@Pc(325) float local325 = local259 + local169 * (this.aFloatArrayArray5[arg4 + 1][arg5 + 1] - local259);
			local141 = local177 * (local234 - local274) + local274;
			local150 = (local292 - local250) * local177 + local250;
			local159 = local177 * (local325 - local307) + local307;
		}
		local169 = this.aClass6_Sub25_1.method6405() - local16;
		local177 = this.aClass6_Sub25_1.method6402() - local30;
		local184 = this.aClass6_Sub25_1.method6400() - local24;
		local191 = (float) Math.sqrt((double) (local169 * local169 + local177 * local177 + local184 * local184));
		local198 = 1.0F / local191;
		local177 *= local198;
		local184 *= local198;
		local169 *= local198;
		local207 = local191 / (float) this.aClass6_Sub25_1.method6398();
		local216 = 1.0F - local207 * local207;
		if (local216 < 0.0F) {
			local216 = 0.0F;
		}
		local259 = local159 * local184 + local150 * local169 + local141 * local177;
		if (local259 < 0.0F) {
			local259 = 0.0F;
		}
		@Pc(540) float local540 = local216 * 2.0F * local259;
		if (local540 > 1.0F) {
			local540 = 1.0F;
		}
		@Pc(551) int local551 = this.aClass6_Sub25_1.method6409(arg6);
		@Pc(561) int local561 = (int) (local540 * (float) (local551 >> 16 & 0xFF));
		if (local561 > 255) {
			local561 = 255;
		}
		@Pc(578) int local578 = (int) ((float) (local551 >> 8 & 0xFF) * local540);
		if (local578 > 255) {
			local578 = 255;
		}
		@Pc(593) int local593 = (int) (local540 * (float) (local551 & 0xFF));
		if (this.aClass90_Sub1_25.aBoolean176) {
			this.aClass6_Sub12_Sub1_2.method1604((float) local16);
			this.aClass6_Sub12_Sub1_2.method1604((float) local30);
			this.aClass6_Sub12_Sub1_2.method1604((float) local24);
		} else {
			this.aClass6_Sub12_Sub1_2.method1602((float) local16);
			this.aClass6_Sub12_Sub1_2.method1602((float) local30);
			this.aClass6_Sub12_Sub1_2.method1602((float) local24);
		}
		if (local593 > 255) {
			local593 = 255;
		}
		this.aClass6_Sub12_Sub1_2.method6047(local561);
		this.aClass6_Sub12_Sub1_2.method6047(local578);
		this.aClass6_Sub12_Sub1_2.method6047(local593);
		this.aClass6_Sub12_Sub1_2.method6047(255);
		this.method4529(local82, -121);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "([[ZIIII)V")
	public void method4532(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInterface15_4 == null || (arg2 + arg1 < this.anInt5495 || (arg1 - arg2 > this.anInt5493 || (arg3 + arg2 < this.anInt5487 || this.anInt5486 < arg3 - arg2)))) {
			return;
		}
		for (@Pc(53) int local53 = this.anInt5487; local53 <= this.anInt5486; local53++) {
			for (@Pc(58) int local58 = this.anInt5495; local58 <= this.anInt5493; local58++) {
				@Pc(65) int local65 = local58 - arg1;
				@Pc(69) int local69 = local53 - arg3;
				if (-arg2 < local65 && arg2 > local65 && -arg2 < local69 && arg2 > local69 && arg0[local65 + arg2][local69 + arg2]) {
					this.aClass90_Sub1_25.method2083((int) (this.aClass6_Sub25_1.method6407() * 255.0F) << 24);
					this.aClass90_Sub1_25.method2066(this.aClass166_7, null, this.aClass166_8, null);
					this.aClass90_Sub1_25.method2144(this.anInt5496, this.anInterface15_4, 0);
					return;
				}
			}
		}
	}
}
