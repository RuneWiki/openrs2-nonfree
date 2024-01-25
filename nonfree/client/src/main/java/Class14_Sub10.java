import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ds")
public final class Class14_Sub10 extends Class14 {

	@OriginalMember(owner = "client!ds", name = "o", descriptor = "I")
	private int anInt1556;

	@OriginalMember(owner = "client!ds", name = "s", descriptor = "I")
	private int anInt1558;

	@OriginalMember(owner = "client!ds", name = "t", descriptor = "Lclient!kg;")
	private final Class114_Sub1 aClass114_Sub1_1;

	@OriginalMember(owner = "client!ds", name = "A", descriptor = "Lclient!sq;")
	private final Class46_Sub2 aClass46_Sub2_10;

	@OriginalMember(owner = "client!ds", name = "n", descriptor = "Lclient!ej;")
	private final Class14_Sub13 aClass14_Sub13_1;

	@OriginalMember(owner = "client!ds", name = "v", descriptor = "I")
	private final int anInt1559;

	@OriginalMember(owner = "client!ds", name = "y", descriptor = "I")
	private final int anInt1560;

	@OriginalMember(owner = "client!ds", name = "C", descriptor = "I")
	private final int anInt1561;

	@OriginalMember(owner = "client!ds", name = "r", descriptor = "I")
	private final int anInt1557;

	@OriginalMember(owner = "client!ds", name = "B", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!ds", name = "w", descriptor = "[[F")
	private float[][] aFloatArrayArray1;

	@OriginalMember(owner = "client!ds", name = "x", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!ds", name = "m", descriptor = "Lclient!jg;")
	private Class14_Sub4 aClass14_Sub4_3;

	@OriginalMember(owner = "client!ds", name = "p", descriptor = "Lclient!bh;")
	private Class14_Sub4_Sub1 aClass14_Sub4_Sub1_2;

	@OriginalMember(owner = "client!ds", name = "u", descriptor = "Lclient!bn;")
	private Class25 aClass25_2;

	@OriginalMember(owner = "client!ds", name = "D", descriptor = "Lclient!mq;")
	private final Interface5 anInterface5_2;

	@OriginalMember(owner = "client!ds", name = "z", descriptor = "Lclient!eb;")
	private final Interface3 anInterface3_2;

	@OriginalMember(owner = "client!ds", name = "q", descriptor = "Lclient!qd;")
	private final Class168 aClass168_6;

	@OriginalMember(owner = "client!ds", name = "l", descriptor = "Lclient!qd;")
	private final Class168 aClass168_5;

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lclient!sq;Lclient!kg;Lclient!ej;[I)V")
	public Class14_Sub10(@OriginalArg(0) Class46_Sub2 arg0, @OriginalArg(1) Class114_Sub1 arg1, @OriginalArg(2) Class14_Sub13 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass114_Sub1_1 = arg1;
		this.aClass46_Sub2_10 = arg0;
		this.aClass14_Sub13_1 = arg2;
		@Pc(20) int local20 = this.aClass14_Sub13_1.anInt5639 - (arg1.anInt3432 >> 1);
		this.anInt1559 = this.aClass14_Sub13_1.anInt5640 - local20 >> arg1.anInt3433;
		this.anInt1560 = this.aClass14_Sub13_1.anInt5640 + local20 >> arg1.anInt3433;
		this.anInt1561 = this.aClass14_Sub13_1.anInt5638 - local20 >> arg1.anInt3433;
		this.anInt1557 = local20 + this.aClass14_Sub13_1.anInt5638 >> arg1.anInt3433;
		@Pc(69) int local69 = this.anInt1560 + 1 - this.anInt1559;
		@Pc(78) int local78 = this.anInt1557 + 1 - this.anInt1561;
		this.aFloatArrayArray3 = new float[local69 + 1][local78 + 1];
		this.aFloatArrayArray1 = new float[local69 + 1][local78 + 1];
		this.aFloatArrayArray2 = new float[local69 + 1][local78 + 1];
		@Pc(107) int local107;
		@Pc(119) int local119;
		@Pc(138) int local138;
		@Pc(146) int local146;
		@Pc(171) int local171;
		@Pc(185) int local185;
		for (local107 = 0; local107 <= local78; local107++) {
			local119 = local107 + this.anInt1561;
			if (local119 > 0 && this.aClass114_Sub1_1.anInt3873 - 1 > local119) {
				for (local138 = 0; local138 <= local69; local138++) {
					local146 = local138 + this.anInt1559;
					if (local146 > 0 && local146 < this.aClass114_Sub1_1.anInt3871 - 1) {
						local171 = arg1.method3610(local146 + 1, local119) - arg1.method3610(local146 - 1, local119);
						local185 = arg1.method3610(local146, local119 + 1) - arg1.method3610(local146, local119 - 1);
						@Pc(200) float local200 = (float) (1.0D / Math.sqrt((double) (local185 * local185 + local171 * local171 + 65536)));
						this.aFloatArrayArray2[local138][local107] = (float) local171 * local200;
						this.aFloatArrayArray1[local138][local107] = -256.0F * local200;
						this.aFloatArrayArray3[local138][local107] = (float) local185 * local200;
					}
				}
			}
		}
		local107 = 0;
		local119 = 0;
		for (local138 = this.anInt1561; local138 <= this.anInt1557; local138++) {
			if (local138 >= 0 && local138 < arg1.anInt3873) {
				for (local146 = this.anInt1559; local146 <= this.anInt1560; local146++) {
					if (local146 >= 0 && arg1.anInt3871 > local146) {
						local171 = arg3[local119];
						@Pc(292) int[] local292 = arg1.anIntArrayArrayArray6[local146][local138];
						if (local292 != null && local171 != 0) {
							if (local171 == 1) {
								local107 += local292.length;
							} else {
								local107 += 3;
							}
						}
					}
					local119++;
				}
			} else {
				local119 += this.anInt1560 - this.anInt1559;
			}
		}
		if (local107 > 0) {
			this.aClass14_Sub4_3 = new Class14_Sub4(local107 * 2);
			this.aClass14_Sub4_Sub1_2 = new Class14_Sub4_Sub1(local107 * 16);
			this.aClass25_2 = new Class25(Static224.method4011(local107));
			local138 = 0;
			local119 = 0;
			for (local146 = this.anInt1561; local146 <= this.anInt1557; local146++) {
				if (local146 >= 0 && local146 < arg1.anInt3873) {
					local171 = 0;
					for (local185 = this.anInt1559; local185 <= this.anInt1560; local185++) {
						if (local185 >= 0 && local185 < arg1.anInt3871) {
							@Pc(404) int local404 = arg3[local119];
							@Pc(411) int[] local411 = arg1.anIntArrayArrayArray6[local185][local146];
							@Pc(418) int[] local418 = arg1.anIntArrayArrayArray9[local185][local146];
							if (local411 != null && local404 != 0) {
								if (local404 == 1) {
									for (@Pc(433) int local433 = 0; local433 < local411.length; local433++) {
										this.method1520(local185, local171, local138, local411[local433], local418[local433], local146);
									}
								} else if (local404 == 3) {
									this.method1520(local185, local171, local138, 0, 0, local146);
									this.method1520(local185, local171, local138, arg1.anInt3432, 0, local146);
									this.method1520(local185, local171, local138, 0, arg1.anInt3432, local146);
								} else if (local404 == 2) {
									this.method1520(local185, local171, local138, arg1.anInt3432, 0, local146);
									this.method1520(local185, local171, local138, arg1.anInt3432, arg1.anInt3432, local146);
									this.method1520(local185, local171, local138, 0, 0, local146);
								} else if (local404 == 5) {
									this.method1520(local185, local171, local138, arg1.anInt3432, arg1.anInt3432, local146);
									this.method1520(local185, local171, local138, 0, arg1.anInt3432, local146);
									this.method1520(local185, local171, local138, arg1.anInt3432, 0, local146);
								} else if (local404 == 4) {
									this.method1520(local185, local171, local138, 0, arg1.anInt3432, local146);
									this.method1520(local185, local171, local138, 0, 0, local146);
									this.method1520(local185, local171, local138, arg1.anInt3432, arg1.anInt3432, local146);
								}
							}
						}
						local119++;
						local171++;
					}
				} else {
					local119 += this.anInt1560 - this.anInt1559;
				}
				local138++;
			}
			this.anInterface5_2 = this.aClass46_Sub2_10.method5234(this.aClass14_Sub4_3.aByteArray74, this.aClass14_Sub4_3.anInt2637, false);
			this.anInterface3_2 = this.aClass46_Sub2_10.method5229(16, this.aClass14_Sub4_Sub1_2.aByteArray74, this.aClass14_Sub4_Sub1_2.anInt2637, false);
			this.aClass168_6 = new Class168(this.aClass46_Sub2_10, this.anInterface3_2, 5126, 3, 0);
			this.aClass168_5 = new Class168(this.aClass46_Sub2_10, this.anInterface3_2, 5121, 4, 12);
		} else {
			this.anInterface3_2 = null;
			this.anInterface5_2 = null;
			this.aClass168_5 = null;
			this.aClass168_6 = null;
		}
		this.aClass14_Sub4_3 = null;
		this.aClass14_Sub4_Sub1_2 = null;
		this.aClass25_2 = null;
		this.aFloatArrayArray2 = this.aFloatArrayArray1 = this.aFloatArrayArray3 = null;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(BIIIIII)V")
	private void method1520(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(1) long local1 = -1L;
		@Pc(9) int local9 = arg3 + (arg0 << this.aClass114_Sub1_1.anInt3433);
		@Pc(17) int local17 = (arg5 << this.aClass114_Sub1_1.anInt3433) + arg4;
		@Pc(23) int local23 = this.aClass114_Sub1_1.method3607(local9, local17);
		if ((arg3 & 0x7F) == 0 || (arg4 & 0x7F) == 0) {
			local1 = ((long) local17 & 0xFFFFL) << 16 | (long) local9 & 0xFFFFL;
			@Pc(53) Class14 local53 = this.aClass25_2.method691(local1);
			if (local53 != null) {
				this.method1521(((Class14_Sub31) local53).aShort77);
				return;
			}
		}
		@Pc(73) short local73 = (short) this.anInt1558++;
		if (local1 != -1L) {
			this.aClass25_2.method687(local1, new Class14_Sub31(local73));
		}
		@Pc(145) float local145;
		@Pc(134) float local134;
		@Pc(123) float local123;
		@Pc(193) float local193;
		@Pc(201) float local201;
		@Pc(208) float local208;
		@Pc(215) float local215;
		@Pc(222) float local222;
		@Pc(231) float local231;
		@Pc(240) float local240;
		@Pc(329) float local329;
		if (arg3 == 0 && arg4 == 0) {
			local134 = this.aFloatArrayArray1[arg1][arg2];
			local145 = this.aFloatArrayArray2[arg1][arg2];
			local123 = this.aFloatArrayArray3[arg1][arg2];
		} else if (this.aClass114_Sub1_1.anInt3432 == arg3 && arg4 == 0) {
			local134 = this.aFloatArrayArray1[arg1 + 1][arg2];
			local145 = this.aFloatArrayArray2[arg1 + 1][arg2];
			local123 = this.aFloatArrayArray3[arg1 + 1][arg2];
		} else if (this.aClass114_Sub1_1.anInt3432 == arg3 && arg4 == this.aClass114_Sub1_1.anInt3432) {
			local123 = this.aFloatArrayArray3[arg1 + 1][arg2 + 1];
			local134 = this.aFloatArrayArray1[arg1 + 1][arg2 + 1];
			local145 = this.aFloatArrayArray2[arg1 + 1][arg2 + 1];
		} else if (arg3 == 0 && arg4 == this.aClass114_Sub1_1.anInt3432) {
			local134 = this.aFloatArrayArray1[arg1][arg2 + 1];
			local145 = this.aFloatArrayArray2[arg1][arg2 + 1];
			local123 = this.aFloatArrayArray3[arg1][arg2 + 1];
		} else {
			local193 = (float) arg3 / (float) this.aClass114_Sub1_1.anInt3432;
			local201 = (float) arg4 / (float) this.aClass114_Sub1_1.anInt3432;
			local208 = this.aFloatArrayArray2[arg1][arg2];
			local215 = this.aFloatArrayArray1[arg1][arg2];
			local222 = this.aFloatArrayArray3[arg1][arg2];
			local231 = this.aFloatArrayArray2[arg1 + 1][arg2];
			local240 = this.aFloatArrayArray1[arg1 + 1][arg2];
			@Pc(257) float local257 = local231 + (this.aFloatArrayArray2[arg1 + 1][arg2 + 1] - local231) * local193;
			@Pc(272) float local272 = local208 + (this.aFloatArrayArray2[arg1][arg2 + 1] - local208) * local193;
			@Pc(287) float local287 = local222 + (this.aFloatArrayArray3[arg1][arg2 + 1] - local222) * local193;
			@Pc(302) float local302 = local215 + local193 * (this.aFloatArrayArray1[arg1][arg2 + 1] - local215);
			@Pc(320) float local320 = local240 + local193 * (this.aFloatArrayArray1[arg1 + 1][arg2 + 1] - local240);
			local329 = this.aFloatArrayArray3[arg1 + 1][arg2];
			local145 = (local257 - local272) * local201 + local272;
			local134 = local201 * (local320 - local302) + local302;
			@Pc(363) float local363 = local329 + (this.aFloatArrayArray3[arg1 + 1][arg2 + 1] - local329) * local193;
			local123 = local201 * (local363 - local287) + local287;
		}
		local193 = this.aClass14_Sub13_1.anInt5640 - local9;
		local201 = this.aClass14_Sub13_1.anInt5635 - local23;
		local208 = this.aClass14_Sub13_1.anInt5638 - local17;
		local215 = (float) Math.sqrt((double) (local201 * local201 + local193 * local193 + local208 * local208));
		local222 = 1.0F / local215;
		local201 *= local222;
		local208 *= local222;
		local193 *= local222;
		local231 = local215 / (float) this.aClass14_Sub13_1.anInt5639;
		local240 = 1.0F - local231 * local231;
		if (local240 < 0.0F) {
			local240 = 0.0F;
		}
		local329 = local208 * local123 + local193 * local145 + local134 * local201;
		if (local329 < 0.0F) {
			local329 = 0.0F;
		}
		@Pc(527) float local527 = local240 * local329 * 2.0F;
		if (local527 > 1.0F) {
			local527 = 1.0F;
		}
		@Pc(538) int local538 = this.aClass14_Sub13_1.anInt5637;
		@Pc(548) int local548 = (int) (local527 * (float) (local538 >> 16 & 0xFF));
		if (local548 > 255) {
			local548 = 255;
		}
		@Pc(563) int local563 = (int) ((float) (local538 >> 8 & 0xFF) * local527);
		if (local563 > 255) {
			local563 = 255;
		}
		@Pc(577) int local577 = (int) (local527 * (float) (local538 & 0xFF));
		if (this.aClass46_Sub2_10.aBoolean397) {
			this.aClass14_Sub4_Sub1_2.method646((float) local9);
			this.aClass14_Sub4_Sub1_2.method646((float) local23);
			this.aClass14_Sub4_Sub1_2.method646((float) local17);
		} else {
			this.aClass14_Sub4_Sub1_2.method647((float) local9);
			this.aClass14_Sub4_Sub1_2.method647((float) local23);
			this.aClass14_Sub4_Sub1_2.method647((float) local17);
		}
		if (local577 > 255) {
			local577 = 255;
		}
		this.aClass14_Sub4_Sub1_2.method2538(local548);
		this.aClass14_Sub4_Sub1_2.method2538(local563);
		this.aClass14_Sub4_Sub1_2.method2538(local577);
		this.aClass14_Sub4_Sub1_2.method2538(255);
		this.method1521(local73);
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(SI)V")
	private void method1521(@OriginalArg(0) short arg0) {
		if (this.aClass46_Sub2_10.aBoolean397) {
			this.aClass14_Sub4_3.method2509(arg0);
		} else {
			this.aClass14_Sub4_3.method2545(arg0);
		}
		this.anInt1556++;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "([[ZIIII)V")
	public void method1522(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface5_2 == null || (this.anInt1559 > arg3 + arg2 || (arg2 - arg3 > this.anInt1560 || (arg1 + arg3 < this.anInt1561 || this.anInt1557 < arg1 - arg3)))) {
			return;
		}
		for (@Pc(55) int local55 = this.anInt1561; local55 <= this.anInt1557; local55++) {
			for (@Pc(62) int local62 = this.anInt1559; local62 <= this.anInt1560; local62++) {
				@Pc(74) int local74 = local62 - arg2;
				@Pc(79) int local79 = local55 - arg1;
				if (-arg3 < local74 && arg3 > local74 && -arg3 < local79 && local79 < arg3 && arg0[arg3 + local74][arg3 + local79]) {
					this.aClass46_Sub2_10.method5212((int) (this.aClass14_Sub13_1.aFloat105 * 255.0F) << 24);
					this.aClass46_Sub2_10.method5217(this.aClass168_6, null, this.aClass168_5, null);
					this.aClass46_Sub2_10.method5231(this.anInterface5_2, 0, this.anInt1556);
					return;
				}
			}
		}
	}
}
