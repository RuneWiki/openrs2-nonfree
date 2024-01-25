import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class1_Sub34 extends Class1 {

	@OriginalMember(owner = "client!te", name = "m", descriptor = "I")
	private int anInt5967;

	@OriginalMember(owner = "client!te", name = "w", descriptor = "I")
	private int anInt5970;

	@OriginalMember(owner = "client!te", name = "y", descriptor = "Lclient!si;")
	private final Class1_Sub30 aClass1_Sub30_1;

	@OriginalMember(owner = "client!te", name = "q", descriptor = "Lclient!h;")
	private final Class32_Sub2 aClass32_Sub2_37;

	@OriginalMember(owner = "client!te", name = "B", descriptor = "Lclient!ef;")
	private final Class53_Sub1 aClass53_Sub1_3;

	@OriginalMember(owner = "client!te", name = "A", descriptor = "I")
	private final int anInt5971;

	@OriginalMember(owner = "client!te", name = "C", descriptor = "I")
	private final int anInt5972;

	@OriginalMember(owner = "client!te", name = "r", descriptor = "I")
	private final int anInt5969;

	@OriginalMember(owner = "client!te", name = "n", descriptor = "I")
	private final int anInt5968;

	@OriginalMember(owner = "client!te", name = "t", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!te", name = "x", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!te", name = "p", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!te", name = "k", descriptor = "Lclient!ks;")
	private final Interface4 anInterface4_4;

	@OriginalMember(owner = "client!te", name = "v", descriptor = "Lclient!va;")
	private final Interface8 anInterface8_6;

	@OriginalMember(owner = "client!te", name = "u", descriptor = "Lclient!ig;")
	private final Class91 aClass91_14;

	@OriginalMember(owner = "client!te", name = "s", descriptor = "Lclient!ig;")
	private final Class91 aClass91_13;

	@OriginalMember(owner = "client!te", name = "l", descriptor = "Lclient!bg;")
	private Class1_Sub8 aClass1_Sub8_10;

	@OriginalMember(owner = "client!te", name = "z", descriptor = "Lclient!qd;")
	private Class1_Sub8_Sub2 aClass1_Sub8_Sub2_3;

	@OriginalMember(owner = "client!te", name = "o", descriptor = "Lclient!tm;")
	private Class197 aClass197_29;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lclient!h;Lclient!ef;Lclient!si;[I)V")
	public Class1_Sub34(@OriginalArg(0) Class32_Sub2 arg0, @OriginalArg(1) Class53_Sub1 arg1, @OriginalArg(2) Class1_Sub30 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass1_Sub30_1 = arg2;
		this.aClass32_Sub2_37 = arg0;
		this.aClass53_Sub1_3 = arg1;
		@Pc(20) int local20 = this.aClass1_Sub30_1.anInt5300 - (arg1.anInt1814 >> 1);
		this.anInt5971 = this.aClass1_Sub30_1.anInt5299 - local20 >> arg1.anInt1811;
		this.anInt5972 = this.aClass1_Sub30_1.anInt5299 + local20 >> arg1.anInt1811;
		this.anInt5969 = this.aClass1_Sub30_1.anInt5297 - local20 >> arg1.anInt1811;
		this.anInt5968 = this.aClass1_Sub30_1.anInt5297 + local20 >> arg1.anInt1811;
		@Pc(69) int local69 = this.anInt5972 + 1 - this.anInt5971;
		@Pc(78) int local78 = this.anInt5968 + 1 - this.anInt5969;
		this.aFloatArrayArray7 = new float[local69 + 1][local78 + 1];
		this.aFloatArrayArray8 = new float[local69 + 1][local78 + 1];
		this.aFloatArrayArray6 = new float[local69 + 1][local78 + 1];
		@Pc(107) int local107;
		@Pc(116) int local116;
		@Pc(128) int local128;
		@Pc(140) int local140;
		@Pc(167) int local167;
		@Pc(181) int local181;
		for (local107 = 0; local107 <= local78; local107++) {
			local116 = local107 + this.anInt5969;
			if (local116 > 0 && local116 < this.aClass53_Sub1_3.anInt3016 - 1) {
				for (local128 = 0; local128 <= local69; local128++) {
					local140 = this.anInt5971 + local128;
					if (local140 > 0 && local140 < this.aClass53_Sub1_3.anInt3017 - 1) {
						local167 = arg1.method2785(local140 + 1, local116) - arg1.method2785(local140 - 1, local116);
						local181 = arg1.method2785(local140, local116 + 1) - arg1.method2785(local140, local116 - 1);
						@Pc(197) float local197 = (float) (1.0D / Math.sqrt((double) (local167 * local167 + local181 * local181 + 65536)));
						this.aFloatArrayArray8[local128][local107] = local197 * (float) local167;
						this.aFloatArrayArray6[local128][local107] = -256.0F * local197;
						this.aFloatArrayArray7[local128][local107] = local197 * (float) local181;
					}
				}
			}
		}
		local107 = 0;
		local116 = 0;
		for (local128 = this.anInt5969; local128 <= this.anInt5968; local128++) {
			if (local128 >= 0 && local128 < arg1.anInt3016) {
				for (local140 = this.anInt5971; local140 <= this.anInt5972; local140++) {
					if (local140 >= 0 && arg1.anInt3017 > local140) {
						local167 = arg3[local116];
						@Pc(283) int[] local283 = arg1.anIntArrayArrayArray2[local140][local128];
						if (local283 != null && local167 != 0) {
							if (local167 == 1) {
								local107 += local283.length;
							} else {
								local107 += 3;
							}
						}
					}
					local116++;
				}
			} else {
				local116 += this.anInt5972 - this.anInt5971;
			}
		}
		if (local107 <= 0) {
			this.anInterface4_4 = null;
			this.anInterface8_6 = null;
			this.aClass91_14 = null;
			this.aClass91_13 = null;
		} else {
			this.aClass1_Sub8_10 = new Class1_Sub8(local107 * 2);
			this.aClass1_Sub8_Sub2_3 = new Class1_Sub8_Sub2(local107 * 16);
			this.aClass197_29 = new Class197(Static194.method3745(local107));
			local128 = 0;
			local116 = 0;
			for (local140 = this.anInt5969; local140 <= this.anInt5968; local140++) {
				if (local140 >= 0 && local140 < arg1.anInt3016) {
					local167 = 0;
					for (local181 = this.anInt5971; local181 <= this.anInt5972; local181++) {
						if (local181 >= 0 && local181 < arg1.anInt3017) {
							@Pc(421) int local421 = arg3[local116];
							@Pc(428) int[] local428 = arg1.anIntArrayArrayArray2[local181][local140];
							@Pc(435) int[] local435 = arg1.anIntArrayArrayArray5[local181][local140];
							if (local428 != null && local421 != 0) {
								if (local421 == 1) {
									for (@Pc(447) int local447 = 0; local447 < local428.length; local447++) {
										this.method5100(local428[local447], local140, local181, local128, local167, local435[local447]);
									}
								} else if (local421 == 3) {
									this.method5100(0, local140, local181, local128, local167, 0);
									this.method5100(arg1.anInt1814, local140, local181, local128, local167, 0);
									this.method5100(0, local140, local181, local128, local167, arg1.anInt1814);
								} else if (local421 == 2) {
									this.method5100(arg1.anInt1814, local140, local181, local128, local167, 0);
									this.method5100(arg1.anInt1814, local140, local181, local128, local167, arg1.anInt1814);
									this.method5100(0, local140, local181, local128, local167, 0);
								} else if (local421 == 5) {
									this.method5100(arg1.anInt1814, local140, local181, local128, local167, arg1.anInt1814);
									this.method5100(0, local140, local181, local128, local167, arg1.anInt1814);
									this.method5100(arg1.anInt1814, local140, local181, local128, local167, 0);
								} else if (local421 == 4) {
									this.method5100(0, local140, local181, local128, local167, arg1.anInt1814);
									this.method5100(0, local140, local181, local128, local167, 0);
									this.method5100(arg1.anInt1814, local140, local181, local128, local167, arg1.anInt1814);
								}
							}
						}
						local116++;
						local167++;
					}
				} else {
					local116 += this.anInt5972 - this.anInt5971;
				}
				local128++;
			}
			this.anInterface4_4 = this.aClass32_Sub2_37.method2301(this.aClass1_Sub8_10.aByteArray81, this.aClass1_Sub8_10.anInt5182, false);
			this.anInterface8_6 = this.aClass32_Sub2_37.method2305(16, this.aClass1_Sub8_Sub2_3.aByteArray81, this.aClass1_Sub8_Sub2_3.anInt5182, false);
			this.aClass91_14 = new Class91(this.aClass32_Sub2_37, this.anInterface8_6, 5126, 3, 0);
			this.aClass91_13 = new Class91(this.aClass32_Sub2_37, this.anInterface8_6, 5121, 4, 12);
		}
		this.aFloatArrayArray8 = this.aFloatArrayArray6 = this.aFloatArrayArray7 = null;
		this.aClass1_Sub8_Sub2_3 = null;
		this.aClass1_Sub8_10 = null;
		this.aClass197_29 = null;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIBII)V")
	private void method5100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(1) long local1 = -1L;
		@Pc(9) int local9 = (arg2 << this.aClass53_Sub1_3.anInt1811) + arg0;
		@Pc(18) int local18 = arg5 + (arg1 << this.aClass53_Sub1_3.anInt1811);
		@Pc(24) int local24 = this.aClass53_Sub1_3.method2792(local9, local18);
		if ((arg0 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			local1 = ((long) local18 & 0xFFFFL) << 16 | (long) local9 & 0xFFFFL;
			@Pc(51) Class1 local51 = this.aClass197_29.method5157(local1);
			if (local51 != null) {
				this.method5102(((Class1_Sub14) local51).aShort26);
				return;
			}
		}
		@Pc(69) short local69 = (short) this.anInt5970++;
		if (local1 != -1L) {
			this.aClass197_29.method5166(new Class1_Sub14(local69), local1);
		}
		@Pc(152) float local152;
		@Pc(161) float local161;
		@Pc(143) float local143;
		@Pc(170) float local170;
		@Pc(178) float local178;
		@Pc(185) float local185;
		@Pc(192) float local192;
		@Pc(199) float local199;
		@Pc(208) float local208;
		@Pc(217) float local217;
		@Pc(308) float local308;
		if (arg0 == 0 && arg5 == 0) {
			local152 = this.aFloatArrayArray8[arg4][arg3];
			local161 = this.aFloatArrayArray6[arg4][arg3];
			local143 = this.aFloatArrayArray7[arg4][arg3];
		} else if (this.aClass53_Sub1_3.anInt1814 == arg0 && arg5 == 0) {
			local152 = this.aFloatArrayArray8[arg4 + 1][arg3];
			local143 = this.aFloatArrayArray7[arg4 + 1][arg3];
			local161 = this.aFloatArrayArray6[arg4 + 1][arg3];
		} else if (arg0 == this.aClass53_Sub1_3.anInt1814 && arg5 == this.aClass53_Sub1_3.anInt1814) {
			local152 = this.aFloatArrayArray8[arg4 + 1][arg3 + 1];
			local161 = this.aFloatArrayArray6[arg4 + 1][arg3 + 1];
			local143 = this.aFloatArrayArray7[arg4 + 1][arg3 + 1];
		} else if (arg0 == 0 && arg5 == this.aClass53_Sub1_3.anInt1814) {
			local143 = this.aFloatArrayArray7[arg4][arg3 + 1];
			local152 = this.aFloatArrayArray8[arg4][arg3 + 1];
			local161 = this.aFloatArrayArray6[arg4][arg3 + 1];
		} else {
			local170 = (float) arg0 / (float) this.aClass53_Sub1_3.anInt1814;
			local178 = (float) arg5 / (float) this.aClass53_Sub1_3.anInt1814;
			local185 = this.aFloatArrayArray8[arg4][arg3];
			local192 = this.aFloatArrayArray6[arg4][arg3];
			local199 = this.aFloatArrayArray7[arg4][arg3];
			local208 = this.aFloatArrayArray8[arg4 + 1][arg3];
			local217 = this.aFloatArrayArray6[arg4 + 1][arg3];
			@Pc(234) float local234 = local208 + (this.aFloatArrayArray8[arg4 + 1][arg3 + 1] - local208) * local170;
			@Pc(250) float local250 = local199 + local170 * (this.aFloatArrayArray7[arg4][arg3 + 1] - local199);
			@Pc(265) float local265 = local192 + (this.aFloatArrayArray6[arg4][arg3 + 1] - local192) * local170;
			@Pc(283) float local283 = local217 + local170 * (this.aFloatArrayArray6[arg4 + 1][arg3 + 1] - local217);
			@Pc(299) float local299 = local185 + (this.aFloatArrayArray8[arg4][arg3 + 1] - local185) * local170;
			local308 = this.aFloatArrayArray7[arg4 + 1][arg3];
			local161 = local265 + (local283 - local265) * local178;
			local152 = (local234 - local299) * local178 + local299;
			@Pc(344) float local344 = local308 + local170 * (this.aFloatArrayArray7[arg4 + 1][arg3 + 1] - local308);
			local143 = local178 * (local344 - local250) + local250;
		}
		local170 = this.aClass1_Sub30_1.anInt5299 - local9;
		local178 = this.aClass1_Sub30_1.anInt5298 - local24;
		local185 = this.aClass1_Sub30_1.anInt5297 - local18;
		local192 = (float) Math.sqrt((double) (local185 * local185 + local170 * local170 + local178 * local178));
		local199 = 1.0F / local192;
		local170 *= local199;
		local178 *= local199;
		local185 *= local199;
		local208 = local192 / (float) this.aClass1_Sub30_1.anInt5300;
		local217 = 1.0F - local208 * local208;
		if (local217 < 0.0F) {
			local217 = 0.0F;
		}
		local308 = local170 * local152 + local178 * local161 + local143 * local185;
		if (local308 < 0.0F) {
			local308 = 0.0F;
		}
		@Pc(541) float local541 = local217 * 2.0F * local308;
		if (local541 > 1.0F) {
			local541 = 1.0F;
		}
		@Pc(551) int local551 = this.aClass1_Sub30_1.anInt5301;
		@Pc(561) int local561 = (int) ((float) (local551 >> 16 & 0xFF) * local541);
		if (local561 > 255) {
			local561 = 255;
		}
		@Pc(578) int local578 = (int) ((float) (local551 >> 8 & 0xFF) * local541);
		if (local578 > 255) {
			local578 = 255;
		}
		@Pc(594) int local594 = (int) ((float) (local551 & 0xFF) * local541);
		if (this.aClass32_Sub2_37.aBoolean240) {
			this.aClass1_Sub8_Sub2_3.method4567((float) local9);
			this.aClass1_Sub8_Sub2_3.method4567((float) local24);
			this.aClass1_Sub8_Sub2_3.method4567((float) local18);
		} else {
			this.aClass1_Sub8_Sub2_3.method4568((float) local9);
			this.aClass1_Sub8_Sub2_3.method4568((float) local24);
			this.aClass1_Sub8_Sub2_3.method4568((float) local18);
		}
		if (local594 > 255) {
			local594 = 255;
		}
		this.aClass1_Sub8_Sub2_3.method4562(local561);
		this.aClass1_Sub8_Sub2_3.method4562(local578);
		this.aClass1_Sub8_Sub2_3.method4562(local594);
		this.aClass1_Sub8_Sub2_3.method4562(255);
		this.method5102(local69);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "([[ZZIII)V")
	public void method5101(@OriginalArg(0) boolean[][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface4_4 == null || (this.anInt5971 > arg1 + arg2 || (arg1 - arg2 > this.anInt5972 || (arg3 + arg2 < this.anInt5969 || this.anInt5968 < arg3 - arg2)))) {
			return;
		}
		for (@Pc(52) int local52 = this.anInt5969; local52 <= this.anInt5968; local52++) {
			for (@Pc(63) int local63 = this.anInt5971; local63 <= this.anInt5972; local63++) {
				@Pc(72) int local72 = local63 - arg1;
				@Pc(77) int local77 = local52 - arg3;
				if (-arg2 < local72 && arg2 > local72 && -arg2 < local77 && local77 < arg2 && arg0[arg2 + local72][arg2 + local77]) {
					this.aClass32_Sub2_37.method2254((int) (this.aClass1_Sub30_1.aFloat74 * 255.0F) << 24);
					this.aClass32_Sub2_37.method2269(this.aClass91_14, null, this.aClass91_13, null);
					this.aClass32_Sub2_37.method2252(this.anInterface4_4, 0, this.anInt5967);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IS)V")
	private void method5102(@OriginalArg(1) short arg0) {
		if (this.aClass32_Sub2_37.aBoolean240) {
			this.aClass1_Sub8_10.method4542(arg0);
		} else {
			this.aClass1_Sub8_10.method4509(arg0);
		}
		this.anInt5967++;
	}
}
