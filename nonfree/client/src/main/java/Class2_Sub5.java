import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class2_Sub5 extends Class2 {

	@OriginalMember(owner = "client!bg", name = "p", descriptor = "I")
	private int anInt575;

	@OriginalMember(owner = "client!bg", name = "z", descriptor = "I")
	private int anInt580;

	@OriginalMember(owner = "client!bg", name = "r", descriptor = "Lclient!or;")
	private final Class2_Sub7 aClass2_Sub7_1;

	@OriginalMember(owner = "client!bg", name = "F", descriptor = "Lclient!bo;")
	private final Class26_Sub1 aClass26_Sub1_2;

	@OriginalMember(owner = "client!bg", name = "A", descriptor = "Lclient!ui;")
	private final Class106_Sub2 aClass106_Sub2_1;

	@OriginalMember(owner = "client!bg", name = "x", descriptor = "I")
	private final int anInt579;

	@OriginalMember(owner = "client!bg", name = "N", descriptor = "I")
	private final int anInt585;

	@OriginalMember(owner = "client!bg", name = "K", descriptor = "I")
	private final int anInt583;

	@OriginalMember(owner = "client!bg", name = "v", descriptor = "I")
	private final int anInt577;

	@OriginalMember(owner = "client!bg", name = "I", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!bg", name = "L", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!bg", name = "E", descriptor = "[[F")
	private float[][] aFloatArrayArray1;

	@OriginalMember(owner = "client!bg", name = "o", descriptor = "Lclient!md;")
	private Class2_Sub20 aClass2_Sub20_1;

	@OriginalMember(owner = "client!bg", name = "J", descriptor = "Lclient!mm;")
	private Class2_Sub20_Sub2 aClass2_Sub20_Sub2_1;

	@OriginalMember(owner = "client!bg", name = "s", descriptor = "Lclient!ub;")
	private Class240 aClass240_1;

	@OriginalMember(owner = "client!bg", name = "H", descriptor = "Lclient!gb;")
	private final Interface4 anInterface4_1;

	@OriginalMember(owner = "client!bg", name = "D", descriptor = "Lclient!rg;")
	private final Interface12 anInterface12_1;

	@OriginalMember(owner = "client!bg", name = "q", descriptor = "Lclient!gs;")
	private final Class100 aClass100_1;

	@OriginalMember(owner = "client!bg", name = "y", descriptor = "Lclient!gs;")
	private final Class100 aClass100_2;

	static {
		new Class256("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
	}

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lclient!bo;Lclient!ui;Lclient!or;[I)V")
	public Class2_Sub5(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) Class106_Sub2 arg1, @OriginalArg(2) Class2_Sub7 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass2_Sub7_1 = arg2;
		this.aClass26_Sub1_2 = arg0;
		this.aClass106_Sub2_1 = arg1;
		@Pc(23) int local23 = this.aClass2_Sub7_1.method2992() - (arg1.anInt6997 >> 1);
		this.anInt579 = this.aClass2_Sub7_1.method2991() - local23 >> arg1.anInt7000;
		this.anInt585 = this.aClass2_Sub7_1.method2991() + local23 >> arg1.anInt7000;
		this.anInt583 = this.aClass2_Sub7_1.method2997() - local23 >> arg1.anInt7000;
		this.anInt577 = local23 + this.aClass2_Sub7_1.method2997() >> arg1.anInt7000;
		@Pc(77) int local77 = this.anInt585 + 1 - this.anInt579;
		@Pc(85) int local85 = this.anInt577 + 1 - this.anInt583;
		this.aFloatArrayArray2 = new float[local77 + 1][local85 + 1];
		this.aFloatArrayArray3 = new float[local77 + 1][local85 + 1];
		this.aFloatArrayArray1 = new float[local77 + 1][local85 + 1];
		@Pc(121) int local121;
		@Pc(136) int local136;
		@Pc(144) int local144;
		@Pc(175) int local175;
		@Pc(189) int local189;
		for (@Pc(114) int local114 = 0; local114 <= local85; local114++) {
			local121 = local114 + this.anInt583;
			if (local121 > 0 && this.aClass106_Sub2_1.anInt7001 - 1 > local121) {
				for (local136 = 0; local136 <= local77; local136++) {
					local144 = local136 + this.anInt579;
					if (local144 > 0 && this.aClass106_Sub2_1.anInt6999 - 1 > local144) {
						local175 = arg1.I(local144 + 1, local121) - arg1.I(local144 - 1, local121);
						local189 = arg1.I(local144, local121 + 1) - arg1.I(local144, local121 - 1);
						@Pc(205) float local205 = (float) (1.0D / Math.sqrt((double) (local175 * local175 + local189 * local189 + 65536)));
						this.aFloatArrayArray3[local136][local114] = local205 * (float) local175;
						this.aFloatArrayArray2[local136][local114] = -256.0F * local205;
						this.aFloatArrayArray1[local136][local114] = local205 * (float) local189;
					}
				}
			}
		}
		local121 = 0;
		local136 = 0;
		for (local144 = this.anInt583; local144 <= this.anInt577; local144++) {
			if (local144 >= 0 && local144 < arg1.anInt7001) {
				for (local175 = this.anInt579; local175 <= this.anInt585; local175++) {
					if (local175 >= 0 && local175 < arg1.anInt6999) {
						local189 = arg3[local136];
						@Pc(283) int[] local283 = arg1.anIntArrayArrayArray18[local175][local144];
						if (local283 != null && local189 != 0) {
							if (local189 == 1) {
								local121 += local283.length;
							} else {
								local121 += 3;
							}
						}
					}
					local136++;
				}
			} else {
				local136 += this.anInt585 - this.anInt579;
			}
		}
		if (local121 > 0) {
			this.aClass2_Sub20_1 = new Class2_Sub20(local121 * 2);
			this.aClass2_Sub20_Sub2_1 = new Class2_Sub20_Sub2(local121 * 16);
			this.aClass240_1 = new Class240(Static316.method4530(local121));
			local175 = 0;
			local136 = 0;
			for (local189 = this.anInt583; local189 <= this.anInt577; local189++) {
				if (local189 >= 0 && arg1.anInt7001 > local189) {
					@Pc(363) int local363 = 0;
					for (@Pc(366) int local366 = this.anInt579; local366 <= this.anInt585; local366++) {
						if (local366 >= 0 && arg1.anInt6999 > local366) {
							@Pc(381) int local381 = arg3[local136];
							@Pc(388) int[] local388 = arg1.anIntArrayArrayArray18[local366][local189];
							@Pc(395) int[] local395 = arg1.anIntArrayArrayArray15[local366][local189];
							if (local388 != null && local381 != 0) {
								if (local381 == 1) {
									for (@Pc(549) int local549 = 0; local549 < local388.length; local549++) {
										this.method390(local175, local395[local549], local363, local388[local549], local189, local366);
									}
								} else if (local381 == 3) {
									this.method390(local175, 0, local363, 0, local189, local366);
									this.method390(local175, 0, local363, arg1.anInt6997, local189, local366);
									this.method390(local175, arg1.anInt6997, local363, 0, local189, local366);
								} else if (local381 == 2) {
									this.method390(local175, 0, local363, arg1.anInt6997, local189, local366);
									this.method390(local175, arg1.anInt6997, local363, arg1.anInt6997, local189, local366);
									this.method390(local175, 0, local363, 0, local189, local366);
								} else if (local381 == 5) {
									this.method390(local175, arg1.anInt6997, local363, arg1.anInt6997, local189, local366);
									this.method390(local175, arg1.anInt6997, local363, 0, local189, local366);
									this.method390(local175, 0, local363, arg1.anInt6997, local189, local366);
								} else if (local381 == 4) {
									this.method390(local175, arg1.anInt6997, local363, 0, local189, local366);
									this.method390(local175, 0, local363, 0, local189, local366);
									this.method390(local175, arg1.anInt6997, local363, arg1.anInt6997, local189, local366);
								}
							}
						}
						local363++;
						local136++;
					}
				} else {
					local136 += this.anInt585 - this.anInt579;
				}
				local175++;
			}
			this.anInterface4_1 = this.aClass26_Sub1_2.method650(this.aClass2_Sub20_1.aByteArray136, this.aClass2_Sub20_1.anInt4608, false);
			this.anInterface12_1 = this.aClass26_Sub1_2.method692(16, false, this.aClass2_Sub20_Sub2_1.anInt4608, this.aClass2_Sub20_Sub2_1.aByteArray136);
			this.aClass100_1 = new Class100(this.aClass26_Sub1_2, this.anInterface12_1, 5126, 3, 0);
			this.aClass100_2 = new Class100(this.aClass26_Sub1_2, this.anInterface12_1, 5121, 4, 12);
		} else {
			this.aClass100_2 = null;
			this.anInterface12_1 = null;
			this.aClass100_1 = null;
			this.anInterface4_1 = null;
		}
		this.aFloatArrayArray3 = this.aFloatArrayArray2 = this.aFloatArrayArray1 = null;
		this.aClass2_Sub20_1 = null;
		this.aClass2_Sub20_Sub2_1 = null;
		this.aClass240_1 = null;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(II[[ZBI)V")
	public void method387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[][] arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface4_1 == null || (arg1 + arg0 < this.anInt579 || (arg1 - arg0 > this.anInt585 || (this.anInt583 > arg0 + arg3 || this.anInt577 < arg3 - arg0)))) {
			return;
		}
		for (@Pc(51) int local51 = this.anInt583; local51 <= this.anInt577; local51++) {
			for (@Pc(61) int local61 = this.anInt579; local61 <= this.anInt585; local61++) {
				@Pc(68) int local68 = local61 - arg1;
				@Pc(73) int local73 = local51 - arg3;
				if (local68 > -arg0 && arg0 > local68 && -arg0 < local73 && local73 < arg0 && arg2[local68 + arg0][local73 + arg0]) {
					this.aClass26_Sub1_2.method679((int) (this.aClass2_Sub7_1.method2994() * 255.0F) << 24);
					this.aClass26_Sub1_2.method668(null, this.aClass100_1, null, this.aClass100_2);
					this.aClass26_Sub1_2.method664(0, this.anInt580, this.anInterface4_1);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(SI)V")
	private void method388(@OriginalArg(0) short arg0) {
		if (this.aClass26_Sub1_2.aBoolean76) {
			this.aClass2_Sub20_1.method3745(arg0);
		} else {
			this.aClass2_Sub20_1.method3714(arg0);
		}
		this.anInt580++;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIIII)V")
	private void method390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = arg3 + (arg5 << this.aClass106_Sub2_1.anInt7000);
		@Pc(23) int local23 = (arg4 << this.aClass106_Sub2_1.anInt7000) + arg1;
		@Pc(29) int local29 = this.aClass106_Sub2_1.va(local15, local23);
		if ((arg3 & 0x7F) == 0 || (arg1 & 0x7F) == 0) {
			local7 = (long) local23 << 16 & 0xFFFFL << 16 | (long) local15 & 0xFFFFL;
			@Pc(57) Class2 local57 = this.aClass240_1.method5439(local7);
			if (local57 != null) {
				this.method388(((Class2_Sub33) local57).aShort69);
				return;
			}
		}
		@Pc(75) short local75 = (short) this.anInt575++;
		if (local7 != -1L) {
			this.aClass240_1.method5430(local7, new Class2_Sub33(local75));
		}
		@Pc(104) float local104;
		@Pc(111) float local111;
		@Pc(118) float local118;
		@Pc(264) float local264;
		@Pc(272) float local272;
		@Pc(279) float local279;
		@Pc(286) float local286;
		@Pc(302) float local302;
		@Pc(311) float local311;
		@Pc(336) float local336;
		if (arg3 == 0 && arg1 == 0) {
			local104 = this.aFloatArrayArray3[arg2][arg0];
			local111 = this.aFloatArrayArray2[arg2][arg0];
			local118 = this.aFloatArrayArray1[arg2][arg0];
		} else if (this.aClass106_Sub2_1.anInt6997 == arg3 && arg1 == 0) {
			local104 = this.aFloatArrayArray3[arg2 + 1][arg0];
			local111 = this.aFloatArrayArray2[arg2 + 1][arg0];
			local118 = this.aFloatArrayArray1[arg2 + 1][arg0];
		} else if (arg3 == this.aClass106_Sub2_1.anInt6997 && arg1 == this.aClass106_Sub2_1.anInt6997) {
			local104 = this.aFloatArrayArray3[arg2 + 1][arg0 + 1];
			local118 = this.aFloatArrayArray1[arg2 + 1][arg0 + 1];
			local111 = this.aFloatArrayArray2[arg2 + 1][arg0 + 1];
		} else if (arg3 == 0 && this.aClass106_Sub2_1.anInt6997 == arg1) {
			local111 = this.aFloatArrayArray2[arg2][arg0 + 1];
			local104 = this.aFloatArrayArray3[arg2][arg0 + 1];
			local118 = this.aFloatArrayArray1[arg2][arg0 + 1];
		} else {
			local264 = (float) arg3 / (float) this.aClass106_Sub2_1.anInt6997;
			local272 = (float) arg1 / (float) this.aClass106_Sub2_1.anInt6997;
			local279 = this.aFloatArrayArray3[arg2][arg0];
			local286 = this.aFloatArrayArray2[arg2][arg0];
			@Pc(293) float local293 = this.aFloatArrayArray1[arg2][arg0];
			local302 = this.aFloatArrayArray3[arg2 + 1][arg0];
			local311 = this.aFloatArrayArray2[arg2 + 1][arg0];
			@Pc(327) float local327 = local279 + (this.aFloatArrayArray3[arg2][arg0 + 1] - local279) * local264;
			local336 = this.aFloatArrayArray1[arg2 + 1][arg0];
			@Pc(352) float local352 = local286 + local264 * (this.aFloatArrayArray2[arg2][arg0 + 1] - local286);
			@Pc(369) float local369 = local302 + (this.aFloatArrayArray3[arg2 + 1][arg0 + 1] - local302) * local264;
			@Pc(386) float local386 = local311 + (this.aFloatArrayArray2[arg2 + 1][arg0 + 1] - local311) * local264;
			@Pc(402) float local402 = local293 + local264 * (this.aFloatArrayArray1[arg2][arg0 + 1] - local293);
			local104 = local327 + local272 * (local369 - local327);
			local111 = local352 + local272 * (local386 - local352);
			@Pc(436) float local436 = local336 + local264 * (this.aFloatArrayArray1[arg2 + 1][arg0 + 1] - local336);
			local118 = local402 + (local436 - local402) * local272;
		}
		local264 = this.aClass2_Sub7_1.method2991() - local15;
		local272 = this.aClass2_Sub7_1.method2996() - local29;
		local279 = this.aClass2_Sub7_1.method2997() - local23;
		local286 = (float) Math.sqrt((double) (local279 * local279 + local264 * local264 + local272 * local272));
		local302 = 1.0F / local286;
		local279 *= local302;
		local272 *= local302;
		local264 *= local302;
		local311 = local286 / (float) this.aClass2_Sub7_1.method2992();
		local336 = 1.0F - local311 * local311;
		if (local336 < 0.0F) {
			local336 = 0.0F;
		}
		@Pc(542) float local542 = local279 * local118 + local272 * local111 + local264 * local104;
		if (local542 < 0.0F) {
			local542 = 0.0F;
		}
		@Pc(554) float local554 = local542 * local336 * 2.0F;
		if (local554 > 1.0F) {
			local554 = 1.0F;
		}
		@Pc(565) int local565 = this.aClass2_Sub7_1.method2993();
		@Pc(575) int local575 = (int) (local554 * (float) (local565 >> 16 & 0xFF));
		if (local575 > 255) {
			local575 = 255;
		}
		@Pc(590) int local590 = (int) ((float) (local565 >> 8 & 0xFF) * local554);
		if (local590 > 255) {
			local590 = 255;
		}
		@Pc(605) int local605 = (int) ((float) (local565 & 0xFF) * local554);
		if (this.aClass26_Sub1_2.aBoolean76) {
			this.aClass2_Sub20_Sub2_1.method3750((float) local15);
			this.aClass2_Sub20_Sub2_1.method3750((float) local29);
			this.aClass2_Sub20_Sub2_1.method3750((float) local23);
		} else {
			this.aClass2_Sub20_Sub2_1.method3753((float) local15);
			this.aClass2_Sub20_Sub2_1.method3753((float) local29);
			this.aClass2_Sub20_Sub2_1.method3753((float) local23);
		}
		if (local605 > 255) {
			local605 = 255;
		}
		this.aClass2_Sub20_Sub2_1.method3699(local575);
		this.aClass2_Sub20_Sub2_1.method3699(local590);
		this.aClass2_Sub20_Sub2_1.method3699(local605);
		this.aClass2_Sub20_Sub2_1.method3699(255);
		this.method388(local75);
	}
}
