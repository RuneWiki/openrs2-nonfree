import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!op")
public final class Class1_Sub29 extends Class1 {

	@OriginalMember(owner = "client!op", name = "y", descriptor = "I")
	private int anInt4504;

	@OriginalMember(owner = "client!op", name = "z", descriptor = "I")
	private int anInt4505;

	@OriginalMember(owner = "client!op", name = "x", descriptor = "Lclient!dl;")
	private final Class41_Sub1 aClass41_Sub1_2;

	@OriginalMember(owner = "client!op", name = "D", descriptor = "Lclient!hj;")
	private final Class2_Sub1 aClass2_Sub1_25;

	@OriginalMember(owner = "client!op", name = "B", descriptor = "Lclient!vb;")
	private final Class1_Sub31 aClass1_Sub31_1;

	@OriginalMember(owner = "client!op", name = "A", descriptor = "I")
	private final int anInt4506;

	@OriginalMember(owner = "client!op", name = "E", descriptor = "I")
	private final int anInt4507;

	@OriginalMember(owner = "client!op", name = "o", descriptor = "I")
	private final int anInt4502;

	@OriginalMember(owner = "client!op", name = "u", descriptor = "I")
	private final int anInt4503;

	@OriginalMember(owner = "client!op", name = "s", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!op", name = "w", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!op", name = "t", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!op", name = "v", descriptor = "Lclient!ln;")
	private final Class120 aClass120_7;

	@OriginalMember(owner = "client!op", name = "q", descriptor = "Lclient!ln;")
	private final Class120 aClass120_6;

	@OriginalMember(owner = "client!op", name = "n", descriptor = "Lclient!sg;")
	private final Interface6 anInterface6_4;

	@OriginalMember(owner = "client!op", name = "C", descriptor = "Lclient!oc;")
	private final Interface4 anInterface4_3;

	@OriginalMember(owner = "client!op", name = "r", descriptor = "Lclient!eb;")
	private Class1_Sub7 aClass1_Sub7_7;

	@OriginalMember(owner = "client!op", name = "p", descriptor = "Lclient!kg;")
	private Class1_Sub7_Sub2 aClass1_Sub7_Sub2_1;

	@OriginalMember(owner = "client!op", name = "m", descriptor = "Lclient!br;")
	private Class26 aClass26_23;

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Lclient!hj;Lclient!dl;Lclient!vb;[I)V")
	public Class1_Sub29(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) Class41_Sub1 arg1, @OriginalArg(2) Class1_Sub31 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass41_Sub1_2 = arg1;
		this.aClass2_Sub1_25 = arg0;
		this.aClass1_Sub31_1 = arg2;
		@Pc(20) int local20 = this.aClass1_Sub31_1.anInt4688 - (arg1.anInt1387 >> 1);
		this.anInt4506 = this.aClass1_Sub31_1.anInt4687 - local20 >> arg1.anInt1388;
		this.anInt4507 = this.aClass1_Sub31_1.anInt4687 + local20 >> arg1.anInt1388;
		this.anInt4502 = this.aClass1_Sub31_1.anInt4693 - local20 >> arg1.anInt1388;
		this.anInt4503 = local20 + this.aClass1_Sub31_1.anInt4693 >> arg1.anInt1388;
		@Pc(70) int local70 = this.anInt4507 + 1 - this.anInt4506;
		@Pc(79) int local79 = this.anInt4503 + 1 - this.anInt4502;
		this.aFloatArrayArray5 = new float[local70 + 1][local79 + 1];
		this.aFloatArrayArray7 = new float[local70 + 1][local79 + 1];
		this.aFloatArrayArray6 = new float[local70 + 1][local79 + 1];
		@Pc(108) int local108;
		@Pc(120) int local120;
		@Pc(131) int local131;
		@Pc(144) int local144;
		@Pc(171) int local171;
		@Pc(185) int local185;
		for (local108 = 0; local108 <= local79; local108++) {
			local120 = this.anInt4502 + local108;
			if (local120 > 0 && this.aClass41_Sub1_2.anInt6185 - 1 > local120) {
				for (local131 = 0; local131 <= local70; local131++) {
					local144 = local131 + this.anInt4506;
					if (local144 > 0 && this.aClass41_Sub1_2.anInt6179 - 1 > local144) {
						local171 = arg1.method5434(local144 + 1, local120) - arg1.method5434(local144 - 1, local120);
						local185 = arg1.method5434(local144, local120 + 1) - arg1.method5434(local144, local120 - 1);
						@Pc(200) float local200 = (float) (1.0D / Math.sqrt((double) (local185 * local185 + local171 * local171 + 65536)));
						this.aFloatArrayArray7[local131][local108] = (float) local171 * local200;
						this.aFloatArrayArray5[local131][local108] = -256.0F * local200;
						this.aFloatArrayArray6[local131][local108] = local200 * (float) local185;
					}
				}
			}
		}
		local108 = 0;
		local120 = 0;
		for (local131 = this.anInt4502; local131 <= this.anInt4503; local131++) {
			if (local131 >= 0 && arg1.anInt6185 > local131) {
				for (local144 = this.anInt4506; local144 <= this.anInt4507; local144++) {
					if (local144 >= 0 && local144 < arg1.anInt6179) {
						local171 = arg3[local120];
						@Pc(295) int[] local295 = arg1.anIntArrayArrayArray2[local144][local131];
						if (local295 != null && local171 != 0) {
							if (local171 == 1) {
								local108 += local295.length;
							} else {
								local108 += 3;
							}
						}
					}
					local120++;
				}
			} else {
				local120 += this.anInt4507 - this.anInt4506;
			}
		}
		if (local108 <= 0) {
			this.aClass120_7 = null;
			this.aClass120_6 = null;
			this.anInterface6_4 = null;
			this.anInterface4_3 = null;
		} else {
			this.aClass1_Sub7_7 = new Class1_Sub7(local108 * 2);
			this.aClass1_Sub7_Sub2_1 = new Class1_Sub7_Sub2(local108 * 16);
			this.aClass26_23 = new Class26(Static339.method5608(local108));
			local120 = 0;
			local131 = 0;
			for (local144 = this.anInt4502; local144 <= this.anInt4503; local144++) {
				if (local144 >= 0 && local144 < arg1.anInt6185) {
					local171 = 0;
					for (local185 = this.anInt4506; local185 <= this.anInt4507; local185++) {
						if (local185 >= 0 && local185 < arg1.anInt6179) {
							@Pc(403) int local403 = arg3[local120];
							@Pc(410) int[] local410 = arg1.anIntArrayArrayArray2[local185][local144];
							@Pc(417) int[] local417 = arg1.anIntArrayArrayArray5[local185][local144];
							if (local410 != null && local403 != 0) {
								if (local403 == 1) {
									for (@Pc(573) int local573 = 0; local573 < local410.length; local573++) {
										this.method4146(local144, local410[local573], local417[local573], local185, local171, local131);
									}
								} else if (local403 == 3) {
									this.method4146(local144, 0, 0, local185, local171, local131);
									this.method4146(local144, arg1.anInt1387, 0, local185, local171, local131);
									this.method4146(local144, 0, arg1.anInt1387, local185, local171, local131);
								} else if (local403 == 2) {
									this.method4146(local144, arg1.anInt1387, 0, local185, local171, local131);
									this.method4146(local144, arg1.anInt1387, arg1.anInt1387, local185, local171, local131);
									this.method4146(local144, 0, 0, local185, local171, local131);
								} else if (local403 == 5) {
									this.method4146(local144, arg1.anInt1387, arg1.anInt1387, local185, local171, local131);
									this.method4146(local144, 0, arg1.anInt1387, local185, local171, local131);
									this.method4146(local144, arg1.anInt1387, 0, local185, local171, local131);
								} else if (local403 == 4) {
									this.method4146(local144, 0, arg1.anInt1387, local185, local171, local131);
									this.method4146(local144, 0, 0, local185, local171, local131);
									this.method4146(local144, arg1.anInt1387, arg1.anInt1387, local185, local171, local131);
								}
							}
						}
						local171++;
						local120++;
					}
				} else {
					local120 += this.anInt4507 - this.anInt4506;
				}
				local131++;
			}
			this.anInterface4_3 = this.aClass2_Sub1_25.method2318(this.aClass1_Sub7_7.aByteArray58, this.aClass1_Sub7_7.anInt3368, false);
			this.anInterface6_4 = this.aClass2_Sub1_25.method2330(16, this.aClass1_Sub7_Sub2_1.aByteArray58, this.aClass1_Sub7_Sub2_1.anInt3368, false);
			this.aClass120_6 = new Class120(this.aClass2_Sub1_25, this.anInterface6_4, 5126, 3, 0);
			this.aClass120_7 = new Class120(this.aClass2_Sub1_25, this.anInterface6_4, 5121, 4, 12);
		}
		this.aClass26_23 = null;
		this.aClass1_Sub7_7 = null;
		this.aFloatArrayArray7 = this.aFloatArrayArray5 = this.aFloatArrayArray6 = null;
		this.aClass1_Sub7_Sub2_1 = null;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IS)V")
	private void method4144(@OriginalArg(1) short arg0) {
		if (this.aClass2_Sub1_25.aBoolean204) {
			this.aClass1_Sub7_7.method3128(arg0);
		} else {
			this.aClass1_Sub7_7.method3138(arg0);
		}
		this.anInt4505++;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IIII[[Z)V")
	public void method4145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean[][] arg3) {
		if (this.anInterface4_3 == null || (this.anInt4506 > arg2 + arg0 || (this.anInt4507 < arg2 - arg0 || (arg0 + arg1 < this.anInt4502 || this.anInt4503 < arg1 - arg0)))) {
			return;
		}
		for (@Pc(63) int local63 = this.anInt4502; local63 <= this.anInt4503; local63++) {
			for (@Pc(74) int local74 = this.anInt4506; local74 <= this.anInt4507; local74++) {
				@Pc(87) int local87 = local74 - arg2;
				@Pc(92) int local92 = local63 - arg1;
				if (local87 > -arg0 && local87 < arg0 && local92 > -arg0 && arg0 > local92 && arg3[local87 + arg0][local92 + arg0]) {
					this.aClass2_Sub1_25.method2377((int) (this.aClass1_Sub31_1.aFloat89 * 255.0F) << 24);
					this.aClass2_Sub1_25.method2369(this.aClass120_6, null, this.aClass120_7, null);
					this.aClass2_Sub1_25.method2371(this.anInterface4_3, 0, this.anInt4505);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IBIIIII)V")
	private void method4146(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(1) long local1 = -1L;
		@Pc(9) int local9 = arg1 + (arg3 << this.aClass41_Sub1_2.anInt1388);
		@Pc(17) int local17 = (arg0 << this.aClass41_Sub1_2.anInt1388) + arg2;
		@Pc(23) int local23 = this.aClass41_Sub1_2.method5433(local9, local17);
		if ((arg1 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
			local1 = ((long) local17 & 0xFFFFL) << 16 | (long) local9 & 0xFFFFL;
			@Pc(53) Class1 local53 = this.aClass26_23.method870(local1);
			if (local53 != null) {
				this.method4144(((Class1_Sub33) local53).aShort79);
				return;
			}
		}
		@Pc(72) short local72 = (short) this.anInt4504++;
		if (local1 != -1L) {
			this.aClass26_23.method877(local1, new Class1_Sub33(local72));
		}
		@Pc(290) float local290;
		@Pc(299) float local299;
		@Pc(324) float local324;
		@Pc(142) float local142;
		@Pc(150) float local150;
		@Pc(157) float local157;
		@Pc(164) float local164;
		@Pc(171) float local171;
		@Pc(180) float local180;
		@Pc(189) float local189;
		@Pc(250) float local250;
		if (arg1 == 0 && arg2 == 0) {
			local324 = this.aFloatArrayArray6[arg4][arg5];
			local290 = this.aFloatArrayArray7[arg4][arg5];
			local299 = this.aFloatArrayArray5[arg4][arg5];
		} else if (arg1 == this.aClass41_Sub1_2.anInt1387 && arg2 == 0) {
			local324 = this.aFloatArrayArray6[arg4 + 1][arg5];
			local299 = this.aFloatArrayArray5[arg4 + 1][arg5];
			local290 = this.aFloatArrayArray7[arg4 + 1][arg5];
		} else if (this.aClass41_Sub1_2.anInt1387 == arg1 && arg2 == this.aClass41_Sub1_2.anInt1387) {
			local299 = this.aFloatArrayArray5[arg4 + 1][arg5 + 1];
			local324 = this.aFloatArrayArray6[arg4 + 1][arg5 + 1];
			local290 = this.aFloatArrayArray7[arg4 + 1][arg5 + 1];
		} else if (arg1 == 0 && arg2 == this.aClass41_Sub1_2.anInt1387) {
			local290 = this.aFloatArrayArray7[arg4][arg5 + 1];
			local324 = this.aFloatArrayArray6[arg4][arg5 + 1];
			local299 = this.aFloatArrayArray5[arg4][arg5 + 1];
		} else {
			local142 = (float) arg1 / (float) this.aClass41_Sub1_2.anInt1387;
			local150 = (float) arg2 / (float) this.aClass41_Sub1_2.anInt1387;
			local157 = this.aFloatArrayArray7[arg4][arg5];
			local164 = this.aFloatArrayArray5[arg4][arg5];
			local171 = this.aFloatArrayArray6[arg4][arg5];
			local180 = this.aFloatArrayArray7[arg4 + 1][arg5];
			local189 = this.aFloatArrayArray5[arg4 + 1][arg5];
			@Pc(207) float local207 = local180 + (this.aFloatArrayArray7[arg4 + 1][arg5 + 1] - local180) * local142;
			@Pc(225) float local225 = local189 + local142 * (this.aFloatArrayArray5[arg4 + 1][arg5 + 1] - local189);
			@Pc(241) float local241 = local171 + (this.aFloatArrayArray6[arg4][arg5 + 1] - local171) * local142;
			local250 = this.aFloatArrayArray6[arg4 + 1][arg5];
			@Pc(266) float local266 = local157 + local142 * (this.aFloatArrayArray7[arg4][arg5 + 1] - local157);
			@Pc(281) float local281 = local164 + (this.aFloatArrayArray5[arg4][arg5 + 1] - local164) * local142;
			local290 = (local207 - local266) * local150 + local266;
			local299 = local281 + (local225 - local281) * local150;
			@Pc(316) float local316 = local250 + (this.aFloatArrayArray6[arg4 + 1][arg5 + 1] - local250) * local142;
			local324 = local150 * (local316 - local241) + local241;
		}
		local142 = this.aClass1_Sub31_1.anInt4687 - local9;
		local150 = this.aClass1_Sub31_1.anInt4691 - local23;
		local157 = this.aClass1_Sub31_1.anInt4693 - local17;
		local164 = (float) Math.sqrt((double) (local157 * local157 + local142 * local142 + local150 * local150));
		local171 = 1.0F / local164;
		local157 *= local171;
		local142 *= local171;
		local150 *= local171;
		local180 = local164 / (float) this.aClass1_Sub31_1.anInt4688;
		local189 = 1.0F - local180 * local180;
		if (local189 < 0.0F) {
			local189 = 0.0F;
		}
		local250 = local290 * local142 + local299 * local150 + local324 * local157;
		if (local250 < 0.0F) {
			local250 = 0.0F;
		}
		@Pc(542) float local542 = local250 * 2.0F * local189;
		if (local542 > 1.0F) {
			local542 = 1.0F;
		}
		@Pc(553) int local553 = this.aClass1_Sub31_1.anInt4690;
		@Pc(563) int local563 = (int) (local542 * (float) (local553 >> 16 & 0xFF));
		if (local563 > 255) {
			local563 = 255;
		}
		@Pc(581) int local581 = (int) (local542 * (float) (local553 >> 8 & 0xFF));
		if (local581 > 255) {
			local581 = 255;
		}
		@Pc(596) int local596 = (int) (local542 * (float) (local553 & 0xFF));
		if (local596 > 255) {
			local596 = 255;
		}
		if (this.aClass2_Sub1_25.aBoolean204) {
			this.aClass1_Sub7_Sub2_1.method3152((float) local9);
			this.aClass1_Sub7_Sub2_1.method3152((float) local23);
			this.aClass1_Sub7_Sub2_1.method3152((float) local17);
		} else {
			this.aClass1_Sub7_Sub2_1.method3151((float) local9);
			this.aClass1_Sub7_Sub2_1.method3151((float) local23);
			this.aClass1_Sub7_Sub2_1.method3151((float) local17);
		}
		this.aClass1_Sub7_Sub2_1.method3108(local563);
		this.aClass1_Sub7_Sub2_1.method3108(local581);
		this.aClass1_Sub7_Sub2_1.method3108(local596);
		this.aClass1_Sub7_Sub2_1.method3108(255);
		this.method4144(local72);
	}
}
