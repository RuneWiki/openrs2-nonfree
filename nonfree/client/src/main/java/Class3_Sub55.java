import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wp")
public final class Class3_Sub55 extends Class3 {

	@OriginalMember(owner = "client!wp", name = "K", descriptor = "I")
	private int anInt10888;

	@OriginalMember(owner = "client!wp", name = "o", descriptor = "Lclient!uaa;")
	private final Class3_Sub13 aClass3_Sub13_3;

	@OriginalMember(owner = "client!wp", name = "l", descriptor = "Lclient!lf;")
	private final Class95_Sub3 aClass95_Sub3_43;

	@OriginalMember(owner = "client!wp", name = "q", descriptor = "Lclient!bja;")
	private final Class35_Sub1 aClass35_Sub1_3;

	@OriginalMember(owner = "client!wp", name = "D", descriptor = "I")
	private final int anInt10884;

	@OriginalMember(owner = "client!wp", name = "v", descriptor = "I")
	private final int anInt10882;

	@OriginalMember(owner = "client!wp", name = "k", descriptor = "I")
	private final int anInt10877;

	@OriginalMember(owner = "client!wp", name = "r", descriptor = "I")
	private final int anInt10881;

	@OriginalMember(owner = "client!wp", name = "J", descriptor = "[[F")
	private float[][] aFloatArrayArray18;

	@OriginalMember(owner = "client!wp", name = "w", descriptor = "[[F")
	private float[][] aFloatArrayArray16;

	@OriginalMember(owner = "client!wp", name = "F", descriptor = "[[F")
	private float[][] aFloatArrayArray17;

	@OriginalMember(owner = "client!wp", name = "I", descriptor = "I")
	private int anInt10887;

	@OriginalMember(owner = "client!wp", name = "B", descriptor = "Lclient!dt;")
	private Class3_Sub4 aClass3_Sub4_10;

	@OriginalMember(owner = "client!wp", name = "u", descriptor = "Lclient!uba;")
	private Class3_Sub4_Sub2 aClass3_Sub4_Sub2_3;

	@OriginalMember(owner = "client!wp", name = "H", descriptor = "Lclient!tca;")
	private Class333 aClass333_45;

	@OriginalMember(owner = "client!wp", name = "A", descriptor = "Lclient!vv;")
	private final Interface27 anInterface27_5;

	@OriginalMember(owner = "client!wp", name = "z", descriptor = "Lclient!ot;")
	private final Interface21 anInterface21_7;

	@OriginalMember(owner = "client!wp", name = "s", descriptor = "Lclient!ut;")
	private final Class364 aClass364_15;

	@OriginalMember(owner = "client!wp", name = "t", descriptor = "Lclient!ut;")
	private final Class364 aClass364_16;

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(Lclient!lf;Lclient!bja;Lclient!uaa;[I)V")
	public Class3_Sub55(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) Class35_Sub1 arg1, @OriginalArg(2) Class3_Sub13 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass3_Sub13_3 = arg2;
		this.aClass95_Sub3_43 = arg0;
		this.aClass35_Sub1_3 = arg1;
		@Pc(23) int local23 = this.aClass3_Sub13_3.method5962() - (arg1.anInt9152 >> 1);
		this.anInt10884 = this.aClass3_Sub13_3.method5958() - local23 >> arg1.anInt9154;
		this.anInt10882 = this.aClass3_Sub13_3.method5958() + local23 >> arg1.anInt9154;
		this.anInt10877 = this.aClass3_Sub13_3.method5960() - local23 >> arg1.anInt9154;
		this.anInt10881 = local23 + this.aClass3_Sub13_3.method5960() >> arg1.anInt9154;
		@Pc(77) int local77 = this.anInt10882 + 1 - this.anInt10884;
		@Pc(86) int local86 = this.anInt10881 + 1 - this.anInt10877;
		this.aFloatArrayArray18 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray16 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray17 = new float[local77 + 1][local86 + 1];
		@Pc(123) int local123;
		@Pc(141) int local141;
		@Pc(148) int local148;
		@Pc(176) int local176;
		@Pc(193) int local193;
		for (@Pc(115) int local115 = 0; local115 <= local86; local115++) {
			local123 = local115 + this.anInt10877;
			if (local123 > 0 && local123 < this.aClass35_Sub1_3.anInt9148 - 1) {
				for (local141 = 0; local141 <= local77; local141++) {
					local148 = local141 + this.anInt10884;
					if (local148 > 0 && this.aClass35_Sub1_3.anInt9149 - 1 > local148) {
						local176 = arg1.method7461(local123, local148 + 1) - arg1.method7461(local123, local148 - 1);
						local193 = arg1.method7461(local123 + 1, local148) - arg1.method7461(local123 - 1, local148);
						@Pc(209) float local209 = (float) (1.0D / Math.sqrt((double) (local176 * local176 + local193 * local193 + 65536)));
						this.aFloatArrayArray17[local141][local115] = (float) local176 * local209;
						this.aFloatArrayArray18[local141][local115] = local209 * -256.0F;
						this.aFloatArrayArray16[local141][local115] = (float) local193 * local209;
					}
				}
			}
		}
		local123 = 0;
		@Pc(320) int local320;
		for (local141 = this.anInt10877; local141 <= this.anInt10881; local141++) {
			if (local141 >= 0 && local141 < arg1.anInt9148) {
				for (local148 = this.anInt10884; local148 <= this.anInt10882; local148++) {
					if (local148 >= 0 && arg1.anInt9149 > local148) {
						local176 = arg3[local123];
						@Pc(303) int[] local303 = arg1.anIntArrayArrayArray5[local148][local141];
						if (local303 != null && local176 != 0) {
							if (local176 == 1) {
								local320 = 0;
								while (local320 < local303.length) {
									if (local303[local320++] != -1 && local303[local320++] != -1 && local303[local320++] != -1) {
										this.anInt10887 += 3;
									}
								}
							} else {
								this.anInt10887 += 3;
							}
						}
					}
					local123++;
				}
			} else {
				local123 += this.anInt10882 - this.anInt10884;
			}
		}
		if (this.anInt10887 > 0) {
			this.aClass3_Sub4_10 = new Class3_Sub4(this.anInt10887 * 2);
			this.aClass3_Sub4_Sub2_3 = new Class3_Sub4_Sub2(this.anInt10887 * 16);
			this.aClass333_45 = new Class333(Static585.method7772(this.anInt10887));
			local123 = 0;
			local148 = 0;
			for (local176 = this.anInt10877; local176 <= this.anInt10881; local176++) {
				if (local176 >= 0 && local176 < arg1.anInt9148) {
					local193 = 0;
					for (local320 = this.anInt10884; local320 <= this.anInt10882; local320++) {
						if (local320 >= 0 && local320 < arg1.anInt9149) {
							@Pc(442) int local442 = arg3[local123];
							@Pc(449) int[] local449 = arg1.anIntArrayArrayArray5[local320][local176];
							if (local449 != null && local442 != 0) {
								if (local442 == 1) {
									@Pc(612) int[] local612 = arg1.anIntArrayArrayArray6[local320][local176];
									@Pc(619) int[] local619 = arg1.anIntArrayArrayArray1[local320][local176];
									@Pc(621) int local621 = 0;
									label105: while (true) {
										while (true) {
											if (local449.length <= local621) {
												break label105;
											}
											if (local449[local621] == -1 || local449[local621 + 1] == -1 || local449[local621 + 2] == -1) {
												local621 += 3;
											} else {
												this.method8971(local148, local619[local621], local612[local621], local176, local320, local193);
												local621++;
												this.method8971(local148, local619[local621], local612[local621], local176, local320, local193);
												local621++;
												this.method8971(local148, local619[local621], local612[local621], local176, local320, local193);
												local621++;
											}
										}
									}
								} else if (local442 == 3) {
									this.method8971(local148, 0, 0, local176, local320, local193);
									this.method8971(local148, 0, arg1.anInt9152, local176, local320, local193);
									this.method8971(local148, arg1.anInt9152, 0, local176, local320, local193);
								} else if (local442 == 2) {
									this.method8971(local148, 0, arg1.anInt9152, local176, local320, local193);
									this.method8971(local148, arg1.anInt9152, arg1.anInt9152, local176, local320, local193);
									this.method8971(local148, 0, 0, local176, local320, local193);
								} else if (local442 == 5) {
									this.method8971(local148, arg1.anInt9152, arg1.anInt9152, local176, local320, local193);
									this.method8971(local148, arg1.anInt9152, 0, local176, local320, local193);
									this.method8971(local148, 0, arg1.anInt9152, local176, local320, local193);
								} else if (local442 == 4) {
									this.method8971(local148, arg1.anInt9152, 0, local176, local320, local193);
									this.method8971(local148, 0, 0, local176, local320, local193);
									this.method8971(local148, arg1.anInt9152, arg1.anInt9152, local176, local320, local193);
								}
							}
						}
						local123++;
						local193++;
					}
				} else {
					local123 += this.anInt10882 - this.anInt10884;
				}
				local148++;
			}
			this.anInterface27_5 = this.aClass95_Sub3_43.method4884(this.aClass3_Sub4_10.aByteArray90, false, this.aClass3_Sub4_10.anInt9739);
			this.anInterface21_7 = this.aClass95_Sub3_43.method4847(this.aClass3_Sub4_Sub2_3.anInt9739, false, this.aClass3_Sub4_Sub2_3.aByteArray90, 16);
			this.aClass364_15 = new Class364(this.anInterface21_7, 5126, 3, 0);
			this.aClass364_16 = new Class364(this.anInterface21_7, 5121, 4, 12);
		} else {
			this.anInterface21_7 = null;
			this.anInterface27_5 = null;
			this.aClass364_15 = null;
			this.aClass364_16 = null;
		}
		this.aClass3_Sub4_Sub2_3 = null;
		this.aFloatArrayArray17 = this.aFloatArrayArray18 = this.aFloatArrayArray16 = null;
		this.aClass3_Sub4_10 = null;
		this.aClass333_45 = null;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIII[[Z)V")
	public void method8967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean[][] arg3) {
		if (this.anInterface27_5 == null || (this.anInt10884 > arg1 + arg0 || (this.anInt10882 < arg0 - arg1 || (arg1 + arg2 < this.anInt10877 || this.anInt10881 < arg2 - arg1)))) {
			return;
		}
		for (@Pc(54) int local54 = this.anInt10877; local54 <= this.anInt10881; local54++) {
			for (@Pc(59) int local59 = this.anInt10884; local59 <= this.anInt10882; local59++) {
				@Pc(65) int local65 = local59 - arg0;
				@Pc(70) int local70 = local54 - arg2;
				if (-arg1 < local65 && arg1 > local65 && local70 > -arg1 && local70 < arg1 && arg3[local65 + arg1][arg1 + local70]) {
					this.aClass95_Sub3_43.method4893((int) (this.aClass3_Sub13_3.method5961() * 255.0F) << 24);
					this.aClass95_Sub3_43.method4903((Class364) null, this.aClass364_15, this.aClass364_16, (Class364) null);
					this.aClass95_Sub3_43.method4837(0, this.anInt10887, this.anInterface27_5);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(BS)V")
	private void method8969(@OriginalArg(1) short arg0) {
		if (this.aClass95_Sub3_43.aBoolean369) {
			this.aClass3_Sub4_10.method7956(arg0);
		} else {
			this.aClass3_Sub4_10.method7942(arg0);
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIIIIII)V")
	private void method8971(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = arg2 + (arg4 << this.aClass35_Sub1_3.anInt9154);
		@Pc(24) int local24 = arg1 + (arg3 << this.aClass35_Sub1_3.anInt9154);
		@Pc(31) int local31 = this.aClass35_Sub1_3.method7452(local15, local24);
		if ((arg2 & 0x7F) == 0 || (arg1 & 0x7F) == 0) {
			local7 = 0xFFFFL << 16 & (long) local24 << 16 | (long) local15 & 0xFFFFL;
			@Pc(62) Class3 local62 = this.aClass333_45.method7489(local7);
			if (local62 != null) {
				this.method8969(((Class3_Sub29) local62).aShort48);
				return;
			}
		}
		@Pc(80) short local80 = (short) this.anInt10888++;
		if (local7 != -1L) {
			this.aClass333_45.method7488(local7, new Class3_Sub29(local80));
		}
		@Pc(156) float local156;
		@Pc(134) float local134;
		@Pc(145) float local145;
		@Pc(209) float local209;
		@Pc(217) float local217;
		@Pc(224) float local224;
		@Pc(231) float local231;
		@Pc(238) float local238;
		@Pc(247) float local247;
		@Pc(256) float local256;
		if (arg2 == 0 && arg1 == 0) {
			local156 = this.aFloatArrayArray17[arg5][arg0];
			local134 = this.aFloatArrayArray18[arg5][arg0];
			local145 = this.aFloatArrayArray16[arg5][arg0];
		} else if (this.aClass35_Sub1_3.anInt9152 == arg2 && arg1 == 0) {
			local156 = this.aFloatArrayArray17[arg5 + 1][arg0];
			local134 = this.aFloatArrayArray18[arg5 + 1][arg0];
			local145 = this.aFloatArrayArray16[arg5 + 1][arg0];
		} else if (this.aClass35_Sub1_3.anInt9152 == arg2 && arg1 == this.aClass35_Sub1_3.anInt9152) {
			local134 = this.aFloatArrayArray18[arg5 + 1][arg0 + 1];
			local145 = this.aFloatArrayArray16[arg5 + 1][arg0 + 1];
			local156 = this.aFloatArrayArray17[arg5 + 1][arg0 + 1];
		} else if (arg2 == 0 && arg1 == this.aClass35_Sub1_3.anInt9152) {
			local156 = this.aFloatArrayArray17[arg5][arg0 + 1];
			local134 = this.aFloatArrayArray18[arg5][arg0 + 1];
			local145 = this.aFloatArrayArray16[arg5][arg0 + 1];
		} else {
			local209 = (float) arg2 / (float) this.aClass35_Sub1_3.anInt9152;
			local217 = (float) arg1 / (float) this.aClass35_Sub1_3.anInt9152;
			local224 = this.aFloatArrayArray17[arg5][arg0];
			local231 = this.aFloatArrayArray18[arg5][arg0];
			local238 = this.aFloatArrayArray16[arg5][arg0];
			local247 = this.aFloatArrayArray17[arg5 + 1][arg0];
			local256 = this.aFloatArrayArray18[arg5 + 1][arg0];
			@Pc(272) float local272 = local224 + (this.aFloatArrayArray17[arg5][arg0 + 1] - local224) * local209;
			@Pc(289) float local289 = local247 + local209 * (this.aFloatArrayArray17[arg5 + 1][arg0 + 1] - local247);
			@Pc(298) float local298 = this.aFloatArrayArray16[arg5 + 1][arg0];
			@Pc(315) float local315 = local256 + (this.aFloatArrayArray18[arg5 + 1][arg0 + 1] - local256) * local209;
			@Pc(330) float local330 = local238 + (this.aFloatArrayArray16[arg5][arg0 + 1] - local238) * local209;
			@Pc(345) float local345 = local231 + (this.aFloatArrayArray18[arg5][arg0 + 1] - local231) * local209;
			@Pc(363) float local363 = local298 + (this.aFloatArrayArray16[arg5 + 1][arg0 + 1] - local298) * local209;
			local156 = (local289 - local272) * local217 + local272;
			local134 = local345 + local217 * (local315 - local345);
			local145 = local217 * (local363 - local330) + local330;
		}
		local209 = (float) (this.aClass3_Sub13_3.method5958() - local15);
		local217 = (float) (this.aClass3_Sub13_3.method5963() - local31);
		local224 = (float) (this.aClass3_Sub13_3.method5960() - local24);
		local231 = (float) Math.sqrt((double) (local217 * local217 + local209 * local209 + local224 * local224));
		local238 = 1.0F / local231;
		local224 *= local238;
		local209 *= local238;
		local217 *= local238;
		local247 = local231 / (float) this.aClass3_Sub13_3.method5962();
		local256 = 1.0F - local247 * local247;
		if (local256 < 0.0F) {
			local256 = 0.0F;
		}
		@Pc(539) float local539 = local156 * local209 + local134 * local217 + local145 * local224;
		if (local539 < 0.0F) {
			local539 = 0.0F;
		}
		@Pc(551) float local551 = local256 * 2.0F * local539;
		if (local551 > 1.0F) {
			local551 = 1.0F;
		}
		@Pc(562) int local562 = this.aClass3_Sub13_3.method5957();
		@Pc(572) int local572 = (int) ((float) (local562 >> 16 & 0xFF) * local551);
		if (local572 > 255) {
			local572 = 255;
		}
		@Pc(587) int local587 = (int) (local551 * (float) (local562 >> 8 & 0xFF));
		if (local587 > 255) {
			local587 = 255;
		}
		@Pc(600) int local600 = (int) (local551 * (float) (local562 & 0xFF));
		if (local600 > 255) {
			local600 = 255;
		}
		if (this.aClass95_Sub3_43.aBoolean369) {
			this.aClass3_Sub4_Sub2_3.method7962((float) local15);
			this.aClass3_Sub4_Sub2_3.method7962((float) local31);
			this.aClass3_Sub4_Sub2_3.method7962((float) local24);
		} else {
			this.aClass3_Sub4_Sub2_3.method7963((float) local15);
			this.aClass3_Sub4_Sub2_3.method7963((float) local31);
			this.aClass3_Sub4_Sub2_3.method7963((float) local24);
		}
		this.aClass3_Sub4_Sub2_3.method7948(local572);
		this.aClass3_Sub4_Sub2_3.method7948(local587);
		this.aClass3_Sub4_Sub2_3.method7948(local600);
		this.aClass3_Sub4_Sub2_3.method7948(255);
		this.method8969(local80);
	}
}
