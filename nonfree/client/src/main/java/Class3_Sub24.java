import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class3_Sub24 extends Class3 {

	@OriginalMember(owner = "client!gi", name = "v", descriptor = "I")
	private int anInt3505;

	@OriginalMember(owner = "client!gi", name = "A", descriptor = "Lclient!mt;")
	private final Class51_Sub3 aClass51_Sub3_3;

	@OriginalMember(owner = "client!gi", name = "D", descriptor = "Lclient!wh;")
	private final Class3_Sub16 aClass3_Sub16_2;

	@OriginalMember(owner = "client!gi", name = "g", descriptor = "Lclient!kw;")
	private final Class5_Sub2 aClass5_Sub2_15;

	@OriginalMember(owner = "client!gi", name = "y", descriptor = "I")
	private final int anInt3508;

	@OriginalMember(owner = "client!gi", name = "q", descriptor = "I")
	private final int anInt3503;

	@OriginalMember(owner = "client!gi", name = "C", descriptor = "I")
	private final int anInt3509;

	@OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
	private final int anInt3500;

	@OriginalMember(owner = "client!gi", name = "r", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!gi", name = "E", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!gi", name = "F", descriptor = "[[F")
	private float[][] aFloatArrayArray9;

	@OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
	private int anInt3501;

	@OriginalMember(owner = "client!gi", name = "l", descriptor = "Lclient!sl;")
	private Class3_Sub3 aClass3_Sub3_1;

	@OriginalMember(owner = "client!gi", name = "p", descriptor = "Lclient!ag;")
	private Class3_Sub3_Sub1 aClass3_Sub3_Sub1_1;

	@OriginalMember(owner = "client!gi", name = "z", descriptor = "Lclient!qp;")
	private Class280 aClass280_19;

	@OriginalMember(owner = "client!gi", name = "u", descriptor = "Lclient!lo;")
	private final Interface15 anInterface15_3;

	@OriginalMember(owner = "client!gi", name = "m", descriptor = "Lclient!lca;")
	private final Interface14 anInterface14_2;

	@OriginalMember(owner = "client!gi", name = "B", descriptor = "Lclient!jaa;")
	private final Class164 aClass164_7;

	@OriginalMember(owner = "client!gi", name = "t", descriptor = "Lclient!jaa;")
	private final Class164 aClass164_6;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lclient!kw;Lclient!mt;Lclient!wh;[I)V")
	public Class3_Sub24(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) Class51_Sub3 arg1, @OriginalArg(2) Class3_Sub16 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass51_Sub3_3 = arg1;
		this.aClass3_Sub16_2 = arg2;
		this.aClass5_Sub2_15 = arg0;
		@Pc(22) int local22 = this.aClass3_Sub16_2.method4781() - (arg1.anInt9118 >> 1);
		this.anInt3508 = this.aClass3_Sub16_2.method4778() - local22 >> arg1.anInt9117;
		this.anInt3503 = this.aClass3_Sub16_2.method4778() + local22 >> arg1.anInt9117;
		this.anInt3509 = this.aClass3_Sub16_2.method4783() - local22 >> arg1.anInt9117;
		this.anInt3500 = this.aClass3_Sub16_2.method4783() + local22 >> arg1.anInt9117;
		@Pc(77) int local77 = this.anInt3503 + 1 - this.anInt3508;
		@Pc(86) int local86 = this.anInt3500 + 1 - this.anInt3509;
		this.aFloatArrayArray7 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray8 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray9 = new float[local77 + 1][local86 + 1];
		@Pc(123) int local123;
		@Pc(137) int local137;
		@Pc(144) int local144;
		@Pc(176) int local176;
		@Pc(193) int local193;
		for (@Pc(115) int local115 = 0; local115 <= local86; local115++) {
			local123 = local115 + this.anInt3509;
			if (local123 > 0 && local123 < this.aClass51_Sub3_3.anInt9115 - 1) {
				for (local137 = 0; local137 <= local77; local137++) {
					local144 = this.anInt3508 + local137;
					if (local144 > 0 && this.aClass51_Sub3_3.anInt9121 - 1 > local144) {
						local176 = arg1.method7835(local144 + 1, local123) - arg1.method7835(local144 - 1, local123);
						local193 = arg1.method7835(local144, local123 + 1) - arg1.method7835(local144, local123 - 1);
						@Pc(209) float local209 = (float) (1.0D / Math.sqrt((double) (local176 * local176 + local193 * local193 + 65536)));
						this.aFloatArrayArray9[local137][local115] = local209 * (float) local176;
						this.aFloatArrayArray7[local137][local115] = local209 * -256.0F;
						this.aFloatArrayArray8[local137][local115] = local209 * (float) local193;
					}
				}
			}
		}
		local123 = 0;
		@Pc(316) int local316;
		for (local137 = this.anInt3509; local137 <= this.anInt3500; local137++) {
			if (local137 >= 0 && local137 < arg1.anInt9115) {
				for (local144 = this.anInt3508; local144 <= this.anInt3503; local144++) {
					if (local144 >= 0 && local144 < arg1.anInt9121) {
						local176 = arg3[local123];
						@Pc(302) int[] local302 = arg1.anIntArrayArrayArray16[local144][local137];
						if (local302 != null && local176 != 0) {
							if (local176 == 1) {
								local316 = 0;
								while (local316 < local302.length) {
									if (local302[local316++] != -1 && local302[local316++] != -1 && local302[local316++] != -1) {
										this.anInt3501 += 3;
									}
								}
							} else {
								this.anInt3501 += 3;
							}
						}
					}
					local123++;
				}
			} else {
				local123 += this.anInt3503 - this.anInt3508;
			}
		}
		if (this.anInt3501 > 0) {
			this.aClass3_Sub3_1 = new Class3_Sub3(this.anInt3501 * 2);
			this.aClass3_Sub3_Sub1_1 = new Class3_Sub3_Sub1(this.anInt3501 * 16);
			this.aClass280_19 = new Class280(Static109.method2234(this.anInt3501));
			local123 = 0;
			local144 = 0;
			for (local176 = this.anInt3509; local176 <= this.anInt3500; local176++) {
				if (local176 >= 0 && arg1.anInt9115 > local176) {
					local193 = 0;
					for (local316 = this.anInt3508; local316 <= this.anInt3503; local316++) {
						if (local316 >= 0 && local316 < arg1.anInt9121) {
							@Pc(439) int local439 = arg3[local123];
							@Pc(446) int[] local446 = arg1.anIntArrayArrayArray16[local316][local176];
							if (local446 != null && local439 != 0) {
								if (local439 == 1) {
									@Pc(463) int[] local463 = arg1.anIntArrayArrayArray14[local316][local176];
									@Pc(470) int[] local470 = arg1.anIntArrayArrayArray15[local316][local176];
									@Pc(472) int local472 = 0;
									label107: while (true) {
										while (true) {
											if (local446.length <= local472) {
												break label107;
											}
											if (local446[local472] == -1 || local446[local472 + 1] == -1 || local446[local472 + 2] == -1) {
												local472 += 3;
											} else {
												this.method3159(local144, local463[local472], local193, local176, local316, local470[local472]);
												local472++;
												this.method3159(local144, local463[local472], local193, local176, local316, local470[local472]);
												local472++;
												this.method3159(local144, local463[local472], local193, local176, local316, local470[local472]);
												local472++;
											}
										}
									}
								} else if (local439 == 3) {
									this.method3159(local144, 0, local193, local176, local316, 0);
									this.method3159(local144, arg1.anInt9118, local193, local176, local316, 0);
									this.method3159(local144, 0, local193, local176, local316, arg1.anInt9118);
								} else if (local439 == 2) {
									this.method3159(local144, arg1.anInt9118, local193, local176, local316, 0);
									this.method3159(local144, arg1.anInt9118, local193, local176, local316, arg1.anInt9118);
									this.method3159(local144, 0, local193, local176, local316, 0);
								} else if (local439 == 5) {
									this.method3159(local144, arg1.anInt9118, local193, local176, local316, arg1.anInt9118);
									this.method3159(local144, 0, local193, local176, local316, arg1.anInt9118);
									this.method3159(local144, arg1.anInt9118, local193, local176, local316, 0);
								} else if (local439 == 4) {
									this.method3159(local144, 0, local193, local176, local316, arg1.anInt9118);
									this.method3159(local144, 0, local193, local176, local316, 0);
									this.method3159(local144, arg1.anInt9118, local193, local176, local316, arg1.anInt9118);
								}
							}
						}
						local193++;
						local123++;
					}
				} else {
					local123 += this.anInt3503 - this.anInt3508;
				}
				local144++;
			}
			this.anInterface15_3 = this.aClass5_Sub2_15.method4972(this.aClass3_Sub3_1.anInt4736, false, this.aClass3_Sub3_1.aByteArray54);
			this.anInterface14_2 = this.aClass5_Sub2_15.method5011(false, this.aClass3_Sub3_Sub1_1.anInt4736, this.aClass3_Sub3_Sub1_1.aByteArray54, 16);
			this.aClass164_7 = new Class164(this.anInterface14_2, 5126, 3, 0);
			this.aClass164_6 = new Class164(this.anInterface14_2, 5121, 4, 12);
		} else {
			this.aClass164_7 = null;
			this.anInterface14_2 = null;
			this.aClass164_6 = null;
			this.anInterface15_3 = null;
		}
		this.aClass3_Sub3_Sub1_1 = null;
		this.aClass280_19 = null;
		this.aClass3_Sub3_1 = null;
		this.aFloatArrayArray9 = this.aFloatArrayArray7 = this.aFloatArrayArray8 = null;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(BS)V")
	private void method3158(@OriginalArg(1) short arg0) {
		if (this.aClass5_Sub2_15.aBoolean387) {
			this.aClass3_Sub3_1.method4201(arg0);
		} else {
			this.aClass3_Sub3_1.method4257(arg0);
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIIII)V")
	private void method3159(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = arg1 + (arg4 << this.aClass51_Sub3_3.anInt9117);
		@Pc(24) int local24 = arg5 + (arg3 << this.aClass51_Sub3_3.anInt9117);
		@Pc(31) int local31 = this.aClass51_Sub3_3.method7839(local15, local24);
		if ((arg1 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			local7 = 0xFFFFL << 16 & (long) local24 << 16 | (long) local15 & 0xFFFFL;
			@Pc(59) Class3 local59 = this.aClass280_19.method7107(local7);
			if (local59 != null) {
				this.method3158(((Class3_Sub26) local59).aShort45);
				return;
			}
		}
		@Pc(77) short local77 = (short) this.anInt3505++;
		if (local7 != -1L) {
			this.aClass280_19.method7109(new Class3_Sub26(local77), local7);
		}
		@Pc(120) float local120;
		@Pc(106) float local106;
		@Pc(113) float local113;
		@Pc(208) float local208;
		@Pc(216) float local216;
		@Pc(223) float local223;
		@Pc(230) float local230;
		@Pc(237) float local237;
		@Pc(246) float local246;
		@Pc(255) float local255;
		@Pc(296) float local296;
		if (arg1 == 0 && arg5 == 0) {
			local106 = this.aFloatArrayArray7[arg2][arg0];
			local113 = this.aFloatArrayArray8[arg2][arg0];
			local120 = this.aFloatArrayArray9[arg2][arg0];
		} else if (this.aClass51_Sub3_3.anInt9118 == arg1 && arg5 == 0) {
			local120 = this.aFloatArrayArray9[arg2 + 1][arg0];
			local113 = this.aFloatArrayArray8[arg2 + 1][arg0];
			local106 = this.aFloatArrayArray7[arg2 + 1][arg0];
		} else if (this.aClass51_Sub3_3.anInt9118 == arg1 && arg5 == this.aClass51_Sub3_3.anInt9118) {
			local106 = this.aFloatArrayArray7[arg2 + 1][arg0 + 1];
			local120 = this.aFloatArrayArray9[arg2 + 1][arg0 + 1];
			local113 = this.aFloatArrayArray8[arg2 + 1][arg0 + 1];
		} else if (arg1 == 0 && this.aClass51_Sub3_3.anInt9118 == arg5) {
			local106 = this.aFloatArrayArray7[arg2][arg0 + 1];
			local120 = this.aFloatArrayArray9[arg2][arg0 + 1];
			local113 = this.aFloatArrayArray8[arg2][arg0 + 1];
		} else {
			local208 = (float) arg1 / (float) this.aClass51_Sub3_3.anInt9118;
			local216 = (float) arg5 / (float) this.aClass51_Sub3_3.anInt9118;
			local223 = this.aFloatArrayArray9[arg2][arg0];
			local230 = this.aFloatArrayArray7[arg2][arg0];
			local237 = this.aFloatArrayArray8[arg2][arg0];
			local246 = this.aFloatArrayArray9[arg2 + 1][arg0];
			local255 = this.aFloatArrayArray7[arg2 + 1][arg0];
			@Pc(272) float local272 = local246 + (this.aFloatArrayArray9[arg2 + 1][arg0 + 1] - local246) * local208;
			@Pc(287) float local287 = local237 + (this.aFloatArrayArray8[arg2][arg0 + 1] - local237) * local208;
			local296 = this.aFloatArrayArray8[arg2 + 1][arg0];
			@Pc(311) float local311 = local230 + (this.aFloatArrayArray7[arg2][arg0 + 1] - local230) * local208;
			@Pc(329) float local329 = local255 + (this.aFloatArrayArray7[arg2 + 1][arg0 + 1] - local255) * local208;
			@Pc(344) float local344 = local223 + (this.aFloatArrayArray9[arg2][arg0 + 1] - local223) * local208;
			local120 = local344 + (local272 - local344) * local216;
			local106 = (local329 - local311) * local216 + local311;
			@Pc(378) float local378 = local296 + local208 * (this.aFloatArrayArray8[arg2 + 1][arg0 + 1] - local296);
			local113 = local287 + local216 * (local378 - local287);
		}
		local208 = this.aClass3_Sub16_2.method4778() - local15;
		local216 = this.aClass3_Sub16_2.method4777() - local31;
		local223 = this.aClass3_Sub16_2.method4783() - local24;
		local230 = (float) Math.sqrt((double) (local223 * local223 + local216 * local216 + local208 * local208));
		local237 = 1.0F / local230;
		local223 *= local237;
		local208 *= local237;
		local216 *= local237;
		local246 = local230 / (float) this.aClass3_Sub16_2.method4781();
		local255 = 1.0F - local246 * local246;
		if (local255 < 0.0F) {
			local255 = 0.0F;
		}
		local296 = local120 * local208 + local106 * local216 + local113 * local223;
		if (local296 < 0.0F) {
			local296 = 0.0F;
		}
		@Pc(547) float local547 = local296 * local255 * 2.0F;
		if (local547 > (float) 1) {
			local547 = 1.0F;
		}
		@Pc(559) int local559 = this.aClass3_Sub16_2.method4776();
		@Pc(569) int local569 = (int) ((float) (local559 >> 16 & 0xFF) * local547);
		if (local569 > 255) {
			local569 = 255;
		}
		@Pc(584) int local584 = (int) ((float) (local559 >> 8 & 0xFF) * local547);
		if (local584 > 255) {
			local584 = 255;
		}
		@Pc(599) int local599 = (int) ((float) (local559 & 0xFF) * local547);
		if (this.aClass5_Sub2_15.aBoolean387) {
			this.aClass3_Sub3_Sub1_1.method834((float) local15);
			this.aClass3_Sub3_Sub1_1.method834((float) local31);
			this.aClass3_Sub3_Sub1_1.method834((float) local24);
		} else {
			this.aClass3_Sub3_Sub1_1.method833((float) local15);
			this.aClass3_Sub3_Sub1_1.method833((float) local31);
			this.aClass3_Sub3_Sub1_1.method833((float) local24);
		}
		if (local599 > 255) {
			local599 = 255;
		}
		this.aClass3_Sub3_Sub1_1.method4220(local569);
		this.aClass3_Sub3_Sub1_1.method4220(local584);
		this.aClass3_Sub3_Sub1_1.method4220(local599);
		this.aClass3_Sub3_Sub1_1.method4220(255);
		this.method3158(local77);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIZI[[Z)V")
	public void method3163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean[][] arg3) {
		if (this.anInterface15_3 == null || (this.anInt3508 > arg0 + arg2 || (this.anInt3503 < arg0 - arg2 || (arg2 + arg1 < this.anInt3509 || arg1 - arg2 > this.anInt3500)))) {
			return;
		}
		for (@Pc(57) int local57 = this.anInt3509; local57 <= this.anInt3500; local57++) {
			for (@Pc(62) int local62 = this.anInt3508; local62 <= this.anInt3503; local62++) {
				@Pc(69) int local69 = local62 - arg0;
				@Pc(74) int local74 = local57 - arg1;
				if (local69 > -arg2 && local69 < arg2 && local74 > -arg2 && local74 < arg2 && arg3[arg2 + local69][arg2 + local74]) {
					this.aClass5_Sub2_15.method4956((int) (this.aClass3_Sub16_2.method4785() * 255.0F) << 24);
					this.aClass5_Sub2_15.method4967(this.aClass164_7, this.aClass164_6, null, null);
					this.aClass5_Sub2_15.method4968(this.anInterface15_3, 0, this.anInt3501);
					return;
				}
			}
		}
	}
}
