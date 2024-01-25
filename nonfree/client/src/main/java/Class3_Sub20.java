import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ir")
public final class Class3_Sub20 extends Class3 {

	@OriginalMember(owner = "client!ir", name = "D", descriptor = "I")
	private int anInt3541;

	@OriginalMember(owner = "client!ir", name = "K", descriptor = "I")
	private int anInt3544;

	@OriginalMember(owner = "client!ir", name = "x", descriptor = "Lclient!fk;")
	private final Class3_Sub8 aClass3_Sub8_1;

	@OriginalMember(owner = "client!ir", name = "G", descriptor = "Lclient!si;")
	private final Class159_Sub2 aClass159_Sub2_1;

	@OriginalMember(owner = "client!ir", name = "z", descriptor = "Lclient!vj;")
	private final Class172_Sub2 aClass172_Sub2_14;

	@OriginalMember(owner = "client!ir", name = "u", descriptor = "I")
	private final int anInt3536;

	@OriginalMember(owner = "client!ir", name = "n", descriptor = "I")
	private final int anInt3533;

	@OriginalMember(owner = "client!ir", name = "w", descriptor = "I")
	private final int anInt3537;

	@OriginalMember(owner = "client!ir", name = "A", descriptor = "I")
	private final int anInt3539;

	@OriginalMember(owner = "client!ir", name = "o", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!ir", name = "O", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!ir", name = "t", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!ir", name = "p", descriptor = "Lclient!nh;")
	private final Interface6 anInterface6_1;

	@OriginalMember(owner = "client!ir", name = "I", descriptor = "Lclient!kd;")
	private final Class127 aClass127_2;

	@OriginalMember(owner = "client!ir", name = "E", descriptor = "Lclient!u;")
	private final Interface10 anInterface10_2;

	@OriginalMember(owner = "client!ir", name = "F", descriptor = "Lclient!kd;")
	private final Class127 aClass127_1;

	@OriginalMember(owner = "client!ir", name = "v", descriptor = "Lclient!cu;")
	private Class3_Sub7 aClass3_Sub7_1;

	@OriginalMember(owner = "client!ir", name = "l", descriptor = "Lclient!ht;")
	private Class3_Sub7_Sub2 aClass3_Sub7_Sub2_1;

	@OriginalMember(owner = "client!ir", name = "m", descriptor = "Lclient!an;")
	private Class11 aClass11_22;

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Lclient!vj;Lclient!si;Lclient!fk;[I)V")
	public Class3_Sub20(@OriginalArg(0) Class172_Sub2 arg0, @OriginalArg(1) Class159_Sub2 arg1, @OriginalArg(2) Class3_Sub8 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass3_Sub8_1 = arg2;
		this.aClass159_Sub2_1 = arg1;
		this.aClass172_Sub2_14 = arg0;
		@Pc(23) int local23 = this.aClass3_Sub8_1.method4400() - (arg1.anInt6190 >> 1);
		this.anInt3536 = this.aClass3_Sub8_1.method4404() - local23 >> arg1.anInt6193;
		this.anInt3533 = this.aClass3_Sub8_1.method4404() + local23 >> arg1.anInt6193;
		this.anInt3537 = this.aClass3_Sub8_1.method4395() - local23 >> arg1.anInt6193;
		this.anInt3539 = local23 + this.aClass3_Sub8_1.method4395() >> arg1.anInt6193;
		@Pc(77) int local77 = this.anInt3533 + 1 - this.anInt3536;
		@Pc(85) int local85 = this.anInt3539 + 1 - this.anInt3537;
		this.aFloatArrayArray2 = new float[local77 + 1][local85 + 1];
		this.aFloatArrayArray4 = new float[local77 + 1][local85 + 1];
		this.aFloatArrayArray3 = new float[local77 + 1][local85 + 1];
		@Pc(121) int local121;
		@Pc(136) int local136;
		@Pc(144) int local144;
		@Pc(174) int local174;
		@Pc(189) int local189;
		for (@Pc(114) int local114 = 0; local114 <= local85; local114++) {
			local121 = local114 + this.anInt3537;
			if (local121 > 0 && this.aClass159_Sub2_1.anInt6192 - 1 > local121) {
				for (local136 = 0; local136 <= local77; local136++) {
					local144 = local136 + this.anInt3536;
					if (local144 > 0 && local144 < this.aClass159_Sub2_1.anInt6189 - 1) {
						local174 = arg1.I(local144 + 1, local121) - arg1.I(local144 - 1, local121);
						local189 = arg1.I(local144, local121 + 1) - arg1.I(local144, local121 - 1);
						@Pc(204) float local204 = (float) (1.0D / Math.sqrt((double) (local189 * local189 + local174 * local174 + 65536)));
						this.aFloatArrayArray4[local136][local114] = local204 * (float) local174;
						this.aFloatArrayArray3[local136][local114] = local204 * -256.0F;
						this.aFloatArrayArray2[local136][local114] = (float) local189 * local204;
					}
				}
			}
		}
		local121 = 0;
		local136 = 0;
		for (local144 = this.anInt3537; local144 <= this.anInt3539; local144++) {
			if (local144 >= 0 && local144 < arg1.anInt6192) {
				for (local174 = this.anInt3536; local174 <= this.anInt3533; local174++) {
					if (local174 >= 0 && arg1.anInt6189 > local174) {
						local189 = arg3[local136];
						@Pc(303) int[] local303 = arg1.anIntArrayArrayArray9[local174][local144];
						if (local303 != null && local189 != 0) {
							if (local189 == 1) {
								local121 += local303.length;
							} else {
								local121 += 3;
							}
						}
					}
					local136++;
				}
			} else {
				local136 += this.anInt3533 - this.anInt3536;
			}
		}
		if (local121 <= 0) {
			this.anInterface6_1 = null;
			this.aClass127_2 = null;
			this.anInterface10_2 = null;
			this.aClass127_1 = null;
		} else {
			this.aClass3_Sub7_1 = new Class3_Sub7(local121 * 2);
			this.aClass3_Sub7_Sub2_1 = new Class3_Sub7_Sub2(local121 * 16);
			this.aClass11_22 = new Class11(Static288.method4088(local121));
			local174 = 0;
			local136 = 0;
			for (local189 = this.anInt3537; local189 <= this.anInt3539; local189++) {
				if (local189 >= 0 && arg1.anInt6192 > local189) {
					@Pc(417) int local417 = 0;
					for (@Pc(420) int local420 = this.anInt3536; local420 <= this.anInt3533; local420++) {
						if (local420 >= 0 && arg1.anInt6189 > local420) {
							@Pc(435) int local435 = arg3[local136];
							@Pc(442) int[] local442 = arg1.anIntArrayArrayArray9[local420][local189];
							@Pc(449) int[] local449 = arg1.anIntArrayArrayArray12[local420][local189];
							if (local442 != null && local435 != 0) {
								if (local435 == 1) {
									for (@Pc(460) int local460 = 0; local460 < local442.length; local460++) {
										this.method2830(local189, local174, local449[local460], local442[local460], local417, local420);
									}
								} else if (local435 == 3) {
									this.method2830(local189, local174, 0, 0, local417, local420);
									this.method2830(local189, local174, 0, arg1.anInt6190, local417, local420);
									this.method2830(local189, local174, arg1.anInt6190, 0, local417, local420);
								} else if (local435 == 2) {
									this.method2830(local189, local174, 0, arg1.anInt6190, local417, local420);
									this.method2830(local189, local174, arg1.anInt6190, arg1.anInt6190, local417, local420);
									this.method2830(local189, local174, 0, 0, local417, local420);
								} else if (local435 == 5) {
									this.method2830(local189, local174, arg1.anInt6190, arg1.anInt6190, local417, local420);
									this.method2830(local189, local174, arg1.anInt6190, 0, local417, local420);
									this.method2830(local189, local174, 0, arg1.anInt6190, local417, local420);
								} else if (local435 == 4) {
									this.method2830(local189, local174, arg1.anInt6190, 0, local417, local420);
									this.method2830(local189, local174, 0, 0, local417, local420);
									this.method2830(local189, local174, arg1.anInt6190, arg1.anInt6190, local417, local420);
								}
							}
						}
						local136++;
						local417++;
					}
				} else {
					local136 += this.anInt3533 - this.anInt3536;
				}
				local174++;
			}
			this.anInterface10_2 = this.aClass172_Sub2_14.method5560(this.aClass3_Sub7_1.anInt3235, this.aClass3_Sub7_1.aByteArray46, false);
			this.anInterface6_1 = this.aClass172_Sub2_14.method5586(false, this.aClass3_Sub7_Sub2_1.anInt3235, this.aClass3_Sub7_Sub2_1.aByteArray46, 16);
			this.aClass127_2 = new Class127(this.anInterface6_1, 5126, 3, 0);
			this.aClass127_1 = new Class127(this.anInterface6_1, 5121, 4, 12);
		}
		this.aClass3_Sub7_Sub2_1 = null;
		this.aClass3_Sub7_1 = null;
		this.aClass11_22 = null;
		this.aFloatArrayArray4 = this.aFloatArrayArray3 = this.aFloatArrayArray2 = null;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIZIIII)V")
	private void method2830(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg5 << this.aClass159_Sub2_1.anInt6193) + arg3;
		@Pc(23) int local23 = (arg0 << this.aClass159_Sub2_1.anInt6193) + arg2;
		@Pc(29) int local29 = this.aClass159_Sub2_1.va(local15, local23);
		if ((arg3 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
			local7 = (long) local15 & 0xFFFFL | ((long) local23 & 0xFFFFL) << 16;
			@Pc(61) Class3 local61 = this.aClass11_22.method324(local7);
			if (local61 != null) {
				this.method2832(((Class3_Sub37) local61).aShort87);
				return;
			}
		}
		@Pc(79) short local79 = (short) this.anInt3544++;
		if (local7 != -1L) {
			this.aClass11_22.method319(new Class3_Sub37(local79), local7);
		}
		@Pc(115) float local115;
		@Pc(108) float local108;
		@Pc(122) float local122;
		@Pc(260) float local260;
		@Pc(268) float local268;
		@Pc(275) float local275;
		@Pc(282) float local282;
		@Pc(289) float local289;
		@Pc(298) float local298;
		@Pc(307) float local307;
		@Pc(316) float local316;
		if (arg3 == 0 && arg2 == 0) {
			local108 = this.aFloatArrayArray3[arg4][arg1];
			local115 = this.aFloatArrayArray4[arg4][arg1];
			local122 = this.aFloatArrayArray2[arg4][arg1];
		} else if (arg3 == this.aClass159_Sub2_1.anInt6190 && arg2 == 0) {
			local115 = this.aFloatArrayArray4[arg4 + 1][arg1];
			local122 = this.aFloatArrayArray2[arg4 + 1][arg1];
			local108 = this.aFloatArrayArray3[arg4 + 1][arg1];
		} else if (this.aClass159_Sub2_1.anInt6190 == arg3 && this.aClass159_Sub2_1.anInt6190 == arg2) {
			local122 = this.aFloatArrayArray2[arg4 + 1][arg1 + 1];
			local115 = this.aFloatArrayArray4[arg4 + 1][arg1 + 1];
			local108 = this.aFloatArrayArray3[arg4 + 1][arg1 + 1];
		} else if (arg3 == 0 && this.aClass159_Sub2_1.anInt6190 == arg2) {
			local115 = this.aFloatArrayArray4[arg4][arg1 + 1];
			local122 = this.aFloatArrayArray2[arg4][arg1 + 1];
			local108 = this.aFloatArrayArray3[arg4][arg1 + 1];
		} else {
			local260 = (float) arg3 / (float) this.aClass159_Sub2_1.anInt6190;
			local268 = (float) arg2 / (float) this.aClass159_Sub2_1.anInt6190;
			local275 = this.aFloatArrayArray4[arg4][arg1];
			local282 = this.aFloatArrayArray3[arg4][arg1];
			local289 = this.aFloatArrayArray2[arg4][arg1];
			local298 = this.aFloatArrayArray4[arg4 + 1][arg1];
			local307 = this.aFloatArrayArray3[arg4 + 1][arg1];
			local316 = this.aFloatArrayArray2[arg4 + 1][arg1];
			@Pc(332) float local332 = local282 + (this.aFloatArrayArray3[arg4][arg1 + 1] - local282) * local260;
			@Pc(350) float local350 = local298 + local260 * (this.aFloatArrayArray4[arg4 + 1][arg1 + 1] - local298);
			@Pc(365) float local365 = local275 + local260 * (this.aFloatArrayArray4[arg4][arg1 + 1] - local275);
			@Pc(380) float local380 = local289 + (this.aFloatArrayArray2[arg4][arg1 + 1] - local289) * local260;
			@Pc(398) float local398 = local307 + local260 * (this.aFloatArrayArray3[arg4 + 1][arg1 + 1] - local307);
			local115 = (local350 - local365) * local268 + local365;
			@Pc(423) float local423 = local316 + (this.aFloatArrayArray2[arg4 + 1][arg1 + 1] - local316) * local260;
			local108 = (local398 - local332) * local268 + local332;
			local122 = local380 + (local423 - local380) * local268;
		}
		local260 = this.aClass3_Sub8_1.method4404() - local15;
		local268 = this.aClass3_Sub8_1.method4397() - local29;
		local275 = this.aClass3_Sub8_1.method4395() - local23;
		local282 = (float) Math.sqrt((double) (local275 * local275 + local260 * local260 + local268 * local268));
		local289 = 1.0F / local282;
		local260 *= local289;
		local275 *= local289;
		local268 *= local289;
		local298 = local282 / (float) this.aClass3_Sub8_1.method4400();
		local307 = 1.0F - local298 * local298;
		if (local307 < 0.0F) {
			local307 = 0.0F;
		}
		local316 = local275 * local122 + local260 * local115 + local268 * local108;
		if (local316 < 0.0F) {
			local316 = 0.0F;
		}
		@Pc(544) float local544 = local307 * 2.0F * local316;
		if (local544 > 1.0F) {
			local544 = 1.0F;
		}
		@Pc(555) int local555 = this.aClass3_Sub8_1.method4402();
		@Pc(565) int local565 = (int) (local544 * (float) (local555 >> 16 & 0xFF));
		if (local565 > 255) {
			local565 = 255;
		}
		@Pc(580) int local580 = (int) (local544 * (float) (local555 >> 8 & 0xFF));
		if (local580 > 255) {
			local580 = 255;
		}
		@Pc(595) int local595 = (int) ((float) (local555 & 0xFF) * local544);
		if (local595 > 255) {
			local595 = 255;
		}
		if (this.aClass172_Sub2_14.aBoolean621) {
			this.aClass3_Sub7_Sub2_1.method2645((float) local15);
			this.aClass3_Sub7_Sub2_1.method2645((float) local29);
			this.aClass3_Sub7_Sub2_1.method2645((float) local23);
		} else {
			this.aClass3_Sub7_Sub2_1.method2643((float) local15);
			this.aClass3_Sub7_Sub2_1.method2643((float) local29);
			this.aClass3_Sub7_Sub2_1.method2643((float) local23);
		}
		this.aClass3_Sub7_Sub2_1.method2628(local565);
		this.aClass3_Sub7_Sub2_1.method2628(local580);
		this.aClass3_Sub7_Sub2_1.method2628(local595);
		this.aClass3_Sub7_Sub2_1.method2628(255);
		this.method2832(local79);
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(BS)V")
	private void method2832(@OriginalArg(1) short arg0) {
		if (this.aClass172_Sub2_14.aBoolean621) {
			this.aClass3_Sub7_1.method2613(arg0);
		} else {
			this.aClass3_Sub7_1.method2585(arg0);
		}
		this.anInt3541++;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "([[ZIIII)V")
	public void method2833(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface10_2 == null || (arg2 + arg1 < this.anInt3536 || (this.anInt3533 < arg1 - arg2 || (this.anInt3537 > arg3 + arg2 || this.anInt3539 < arg3 - arg2)))) {
			return;
		}
		for (@Pc(50) int local50 = this.anInt3537; local50 <= this.anInt3539; local50++) {
			for (@Pc(61) int local61 = this.anInt3536; local61 <= this.anInt3533; local61++) {
				@Pc(68) int local68 = local61 - arg1;
				@Pc(73) int local73 = local50 - arg3;
				if (local68 > -arg2 && local68 < arg2 && local73 > -arg2 && local73 < arg2 && arg0[local68 + arg2][arg2 + local73]) {
					this.aClass172_Sub2_14.method5593((int) (this.aClass3_Sub8_1.method4399() * 255.0F) << 24);
					this.aClass172_Sub2_14.method5622(this.aClass127_1, null, this.aClass127_2, null);
					this.aClass172_Sub2_14.method5628(this.anInt3541, this.anInterface10_2, 0);
					return;
				}
			}
		}
	}
}
