import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public final class Class14_Sub31 extends Class14 {

	@OriginalMember(owner = "client!nn", name = "m", descriptor = "I")
	private int anInt7155;

	@OriginalMember(owner = "client!nn", name = "A", descriptor = "Lclient!lja;")
	private final Class159_Sub2 aClass159_Sub2_2;

	@OriginalMember(owner = "client!nn", name = "n", descriptor = "Lclient!pi;")
	private final Class144_Sub3 aClass144_Sub3_30;

	@OriginalMember(owner = "client!nn", name = "q", descriptor = "Lclient!rfa;")
	private final Class14_Sub18 aClass14_Sub18_1;

	@OriginalMember(owner = "client!nn", name = "G", descriptor = "I")
	private final int anInt7154;

	@OriginalMember(owner = "client!nn", name = "o", descriptor = "I")
	private final int anInt7156;

	@OriginalMember(owner = "client!nn", name = "w", descriptor = "I")
	private final int anInt7157;

	@OriginalMember(owner = "client!nn", name = "p", descriptor = "I")
	private final int anInt7153;

	@OriginalMember(owner = "client!nn", name = "r", descriptor = "[[F")
	private float[][] aFloatArrayArray14;

	@OriginalMember(owner = "client!nn", name = "z", descriptor = "[[F")
	private float[][] aFloatArrayArray12;

	@OriginalMember(owner = "client!nn", name = "D", descriptor = "[[F")
	private float[][] aFloatArrayArray13;

	@OriginalMember(owner = "client!nn", name = "u", descriptor = "I")
	private int anInt7151;

	@OriginalMember(owner = "client!nn", name = "H", descriptor = "Lclient!jc;")
	private Class14_Sub21 aClass14_Sub21_8;

	@OriginalMember(owner = "client!nn", name = "v", descriptor = "Lclient!pr;")
	private Class14_Sub21_Sub1 aClass14_Sub21_Sub1_1;

	@OriginalMember(owner = "client!nn", name = "s", descriptor = "Lclient!fw;")
	private Class125 aClass125_28;

	@OriginalMember(owner = "client!nn", name = "t", descriptor = "Lclient!fb;")
	private final Interface6 anInterface6_3;

	@OriginalMember(owner = "client!nn", name = "B", descriptor = "Lclient!ku;")
	private final Interface12 anInterface12_3;

	@OriginalMember(owner = "client!nn", name = "l", descriptor = "Lclient!vm;")
	private final Class380 aClass380_9;

	@OriginalMember(owner = "client!nn", name = "y", descriptor = "Lclient!vm;")
	private final Class380 aClass380_10;

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Lclient!pi;Lclient!lja;Lclient!rfa;[I)V")
	public Class14_Sub31(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) Class159_Sub2 arg1, @OriginalArg(2) Class14_Sub18 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass159_Sub2_2 = arg1;
		this.aClass144_Sub3_30 = arg0;
		this.aClass14_Sub18_1 = arg2;
		@Pc(23) int local23 = this.aClass14_Sub18_1.method8343() - (arg1.anInt9502 >> 1);
		this.anInt7154 = this.aClass14_Sub18_1.method8342() - local23 >> arg1.anInt9501;
		this.anInt7156 = local23 + this.aClass14_Sub18_1.method8342() >> arg1.anInt9501;
		this.anInt7157 = this.aClass14_Sub18_1.method8341() - local23 >> arg1.anInt9501;
		this.anInt7153 = local23 + this.aClass14_Sub18_1.method8341() >> arg1.anInt9501;
		@Pc(78) int local78 = this.anInt7156 + 1 - this.anInt7154;
		@Pc(87) int local87 = this.anInt7153 + 1 - this.anInt7157;
		this.aFloatArrayArray14 = new float[local78 + 1][local87 + 1];
		this.aFloatArrayArray12 = new float[local78 + 1][local87 + 1];
		this.aFloatArrayArray13 = new float[local78 + 1][local87 + 1];
		@Pc(124) int local124;
		@Pc(137) int local137;
		@Pc(144) int local144;
		@Pc(175) int local175;
		@Pc(192) int local192;
		for (@Pc(116) int local116 = 0; local116 <= local87; local116++) {
			local124 = local116 + this.anInt7157;
			if (local124 > 0 && this.aClass159_Sub2_2.anInt9506 - 1 > local124) {
				for (local137 = 0; local137 <= local78; local137++) {
					local144 = this.anInt7154 + local137;
					if (local144 > 0 && this.aClass159_Sub2_2.anInt9504 - 1 > local144) {
						local175 = arg1.method8207(local124, local144 + 1) - arg1.method8207(local124, local144 - 1);
						local192 = arg1.method8207(local124 + 1, local144) - arg1.method8207(local124 - 1, local144);
						@Pc(207) float local207 = (float) (1.0D / Math.sqrt((double) (local192 * local192 + local175 * local175 + 65536)));
						this.aFloatArrayArray12[local137][local116] = local207 * (float) local175;
						this.aFloatArrayArray14[local137][local116] = -256.0F * local207;
						this.aFloatArrayArray13[local137][local116] = local207 * (float) local192;
					}
				}
			}
		}
		local124 = 0;
		@Pc(321) int local321;
		for (local137 = this.anInt7157; local137 <= this.anInt7153; local137++) {
			if (local137 >= 0 && arg1.anInt9506 > local137) {
				for (local144 = this.anInt7154; local144 <= this.anInt7156; local144++) {
					if (local144 >= 0 && arg1.anInt9504 > local144) {
						local175 = arg3[local124];
						@Pc(298) int[] local298 = arg1.anIntArrayArrayArray11[local144][local137];
						if (local298 != null && local175 != 0) {
							if (local175 == 1) {
								local321 = 0;
								while (local321 < local298.length) {
									if (local298[local321++] != -1 && local298[local321++] != -1 && local298[local321++] != -1) {
										this.anInt7151 += 3;
									}
								}
							} else {
								this.anInt7151 += 3;
							}
						}
					}
					local124++;
				}
			} else {
				local124 += this.anInt7156 - this.anInt7154;
			}
		}
		if (this.anInt7151 > 0) {
			this.aClass14_Sub21_8 = new Class14_Sub21(this.anInt7151 * 2);
			this.aClass14_Sub21_Sub1_1 = new Class14_Sub21_Sub1(this.anInt7151 * 16);
			this.aClass125_28 = new Class125(Static255.method4294(this.anInt7151));
			local144 = 0;
			local124 = 0;
			for (local175 = this.anInt7157; local175 <= this.anInt7153; local175++) {
				if (local175 >= 0 && local175 < arg1.anInt9506) {
					local192 = 0;
					for (local321 = this.anInt7154; local321 <= this.anInt7156; local321++) {
						if (local321 >= 0 && arg1.anInt9504 > local321) {
							@Pc(479) int local479 = arg3[local124];
							@Pc(486) int[] local486 = arg1.anIntArrayArrayArray11[local321][local175];
							if (local486 != null && local479 != 0) {
								if (local479 == 1) {
									@Pc(664) int[] local664 = arg1.anIntArrayArrayArray10[local321][local175];
									@Pc(671) int[] local671 = arg1.anIntArrayArrayArray15[local321][local175];
									@Pc(673) int local673 = 0;
									label105: while (true) {
										while (true) {
											if (local673 >= local486.length) {
												break label105;
											}
											if (local486[local673] == -1 || local486[local673 + 1] == -1 || local486[local673 + 2] == -1) {
												local673 += 3;
											} else {
												this.method6260(local671[local673], local175, local144, local321, local192, local664[local673]);
												local673++;
												this.method6260(local671[local673], local175, local144, local321, local192, local664[local673]);
												local673++;
												this.method6260(local671[local673], local175, local144, local321, local192, local664[local673]);
												local673++;
											}
										}
									}
								} else if (local479 == 3) {
									this.method6260(0, local175, local144, local321, local192, 0);
									this.method6260(0, local175, local144, local321, local192, arg1.anInt9502);
									this.method6260(arg1.anInt9502, local175, local144, local321, local192, 0);
								} else if (local479 == 2) {
									this.method6260(0, local175, local144, local321, local192, arg1.anInt9502);
									this.method6260(arg1.anInt9502, local175, local144, local321, local192, arg1.anInt9502);
									this.method6260(0, local175, local144, local321, local192, 0);
								} else if (local479 == 5) {
									this.method6260(arg1.anInt9502, local175, local144, local321, local192, arg1.anInt9502);
									this.method6260(arg1.anInt9502, local175, local144, local321, local192, 0);
									this.method6260(0, local175, local144, local321, local192, arg1.anInt9502);
								} else if (local479 == 4) {
									this.method6260(arg1.anInt9502, local175, local144, local321, local192, 0);
									this.method6260(0, local175, local144, local321, local192, 0);
									this.method6260(arg1.anInt9502, local175, local144, local321, local192, arg1.anInt9502);
								}
							}
						}
						local124++;
						local192++;
					}
				} else {
					local124 += this.anInt7156 - this.anInt7154;
				}
				local144++;
			}
			this.anInterface6_3 = this.aClass144_Sub3_30.method6991(false, this.aClass14_Sub21_8.aByteArray99, this.aClass14_Sub21_8.anInt8936);
			this.anInterface12_3 = this.aClass144_Sub3_30.method7037(false, 16, this.aClass14_Sub21_Sub1_1.aByteArray99, this.aClass14_Sub21_Sub1_1.anInt8936);
			this.aClass380_9 = new Class380(this.anInterface12_3, 5126, 3, 0);
			this.aClass380_10 = new Class380(this.anInterface12_3, 5121, 4, 12);
		} else {
			this.anInterface12_3 = null;
			this.aClass380_9 = null;
			this.aClass380_10 = null;
			this.anInterface6_3 = null;
		}
		this.aClass125_28 = null;
		this.aClass14_Sub21_Sub1_1 = null;
		this.aFloatArrayArray12 = this.aFloatArrayArray14 = this.aFloatArrayArray13 = null;
		this.aClass14_Sub21_8 = null;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(SI)V")
	private void method6257(@OriginalArg(0) short arg0) {
		if (this.aClass144_Sub3_30.aBoolean557) {
			this.aClass14_Sub21_8.method7751(arg0);
		} else {
			this.aClass14_Sub21_8.method7722(arg0);
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(I[[ZZII)V")
	public void method6259(@OriginalArg(0) int arg0, @OriginalArg(1) boolean[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface6_3 == null || (arg3 + arg0 < this.anInt7154 || (this.anInt7156 < arg3 - arg0 || (arg0 + arg2 < this.anInt7157 || arg2 - arg0 > this.anInt7153)))) {
			return;
		}
		for (@Pc(64) int local64 = this.anInt7157; local64 <= this.anInt7153; local64++) {
			for (@Pc(69) int local69 = this.anInt7154; local69 <= this.anInt7156; local69++) {
				@Pc(76) int local76 = local69 - arg3;
				@Pc(81) int local81 = local64 - arg2;
				if (-arg0 < local76 && local76 < arg0 && local81 > -arg0 && arg0 > local81 && arg1[arg0 + local76][arg0 + local81]) {
					this.aClass144_Sub3_30.method7043((int) (this.aClass14_Sub18_1.method8339() * 255.0F) << 24);
					this.aClass144_Sub3_30.method6978((Class380) null, this.aClass380_9, (Class380) null, this.aClass380_10);
					this.aClass144_Sub3_30.method7029(this.anInterface6_3, this.anInt7151, 0);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIIIIII)V")
	private void method6260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg3 << this.aClass159_Sub2_2.anInt9501) + arg5;
		@Pc(23) int local23 = (arg1 << this.aClass159_Sub2_2.anInt9501) + arg0;
		@Pc(30) int local30 = this.aClass159_Sub2_2.method8209(local15, local23);
		if ((arg5 & 0x7F) == 0 || (arg0 & 0x7F) == 0) {
			local7 = 0xFFFFL << 16 & (long) local23 << 16 | (long) local15 & 0xFFFFL;
			@Pc(66) Class14 local66 = this.aClass125_28.method2630(local7);
			if (local66 != null) {
				this.method6257(((Class14_Sub33) local66).aShort72);
				return;
			}
		}
		@Pc(85) short local85 = (short) this.anInt7155++;
		if (local7 != -1L) {
			this.aClass125_28.method2626(new Class14_Sub33(local85), local7);
		}
		@Pc(120) float local120;
		@Pc(113) float local113;
		@Pc(127) float local127;
		@Pc(209) float local209;
		@Pc(217) float local217;
		@Pc(224) float local224;
		@Pc(231) float local231;
		@Pc(238) float local238;
		@Pc(247) float local247;
		@Pc(256) float local256;
		@Pc(314) float local314;
		if (arg5 == 0 && arg0 == 0) {
			local113 = this.aFloatArrayArray14[arg4][arg2];
			local120 = this.aFloatArrayArray12[arg4][arg2];
			local127 = this.aFloatArrayArray13[arg4][arg2];
		} else if (arg5 == this.aClass159_Sub2_2.anInt9502 && arg0 == 0) {
			local120 = this.aFloatArrayArray12[arg4 + 1][arg2];
			local127 = this.aFloatArrayArray13[arg4 + 1][arg2];
			local113 = this.aFloatArrayArray14[arg4 + 1][arg2];
		} else if (this.aClass159_Sub2_2.anInt9502 == arg5 && this.aClass159_Sub2_2.anInt9502 == arg0) {
			local113 = this.aFloatArrayArray14[arg4 + 1][arg2 + 1];
			local120 = this.aFloatArrayArray12[arg4 + 1][arg2 + 1];
			local127 = this.aFloatArrayArray13[arg4 + 1][arg2 + 1];
		} else if (arg5 == 0 && this.aClass159_Sub2_2.anInt9502 == arg0) {
			local120 = this.aFloatArrayArray12[arg4][arg2 + 1];
			local113 = this.aFloatArrayArray14[arg4][arg2 + 1];
			local127 = this.aFloatArrayArray13[arg4][arg2 + 1];
		} else {
			local209 = (float) arg5 / (float) this.aClass159_Sub2_2.anInt9502;
			local217 = (float) arg0 / (float) this.aClass159_Sub2_2.anInt9502;
			local224 = this.aFloatArrayArray12[arg4][arg2];
			local231 = this.aFloatArrayArray14[arg4][arg2];
			local238 = this.aFloatArrayArray13[arg4][arg2];
			local247 = this.aFloatArrayArray12[arg4 + 1][arg2];
			local256 = this.aFloatArrayArray14[arg4 + 1][arg2];
			@Pc(272) float local272 = local238 + (this.aFloatArrayArray13[arg4][arg2 + 1] - local238) * local209;
			@Pc(288) float local288 = local231 + local209 * (this.aFloatArrayArray14[arg4][arg2 + 1] - local231);
			@Pc(305) float local305 = local247 + local209 * (this.aFloatArrayArray12[arg4 + 1][arg2 + 1] - local247);
			local314 = this.aFloatArrayArray13[arg4 + 1][arg2];
			@Pc(330) float local330 = local224 + local209 * (this.aFloatArrayArray12[arg4][arg2 + 1] - local224);
			@Pc(347) float local347 = local256 + local209 * (this.aFloatArrayArray14[arg4 + 1][arg2 + 1] - local256);
			local120 = local330 + local217 * (local305 - local330);
			@Pc(374) float local374 = local314 + (this.aFloatArrayArray13[arg4 + 1][arg2 + 1] - local314) * local209;
			local113 = (local347 - local288) * local217 + local288;
			local127 = local272 + (local374 - local272) * local217;
		}
		local209 = (float) (this.aClass14_Sub18_1.method8342() - local15);
		local217 = (float) (this.aClass14_Sub18_1.method8344() - local30);
		local224 = (float) (this.aClass14_Sub18_1.method8341() - local23);
		local231 = (float) Math.sqrt((double) (local217 * local217 + local209 * local209 + local224 * local224));
		local238 = 1.0F / local231;
		local217 *= local238;
		local224 *= local238;
		local209 *= local238;
		local247 = local231 / (float) this.aClass14_Sub18_1.method8343();
		local256 = 1.0F - local247 * local247;
		if (local256 < 0.0F) {
			local256 = 0.0F;
		}
		local314 = local120 * local209 + local217 * local113 + local127 * local224;
		if (local314 < 0.0F) {
			local314 = 0.0F;
		}
		@Pc(557) float local557 = local256 * 2.0F * local314;
		if (local557 > 1.0F) {
			local557 = 1.0F;
		}
		@Pc(568) int local568 = this.aClass14_Sub18_1.method8345();
		@Pc(578) int local578 = (int) ((float) (local568 >> 16 & 0xFF) * local557);
		if (local578 > 255) {
			local578 = 255;
		}
		@Pc(593) int local593 = (int) (local557 * (float) (local568 >> 8 & 0xFF));
		if (local593 > 255) {
			local593 = 255;
		}
		@Pc(608) int local608 = (int) (local557 * (float) (local568 & 0xFF));
		if (local608 > 255) {
			local608 = 255;
		}
		if (this.aClass144_Sub3_30.aBoolean557) {
			this.aClass14_Sub21_Sub1_1.method7246((float) local15);
			this.aClass14_Sub21_Sub1_1.method7246((float) local30);
			this.aClass14_Sub21_Sub1_1.method7246((float) local23);
		} else {
			this.aClass14_Sub21_Sub1_1.method7248((float) local15);
			this.aClass14_Sub21_Sub1_1.method7248((float) local30);
			this.aClass14_Sub21_Sub1_1.method7248((float) local23);
		}
		this.aClass14_Sub21_Sub1_1.method7747(local578);
		this.aClass14_Sub21_Sub1_1.method7747(local593);
		this.aClass14_Sub21_Sub1_1.method7747(local608);
		this.aClass14_Sub21_Sub1_1.method7747(255);
		this.method6257(local85);
	}
}
