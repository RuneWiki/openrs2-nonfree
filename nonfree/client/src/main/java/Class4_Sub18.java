import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fq")
public final class Class4_Sub18 extends Class4 {

	@OriginalMember(owner = "client!fq", name = "s", descriptor = "I")
	private int anInt3198;

	@OriginalMember(owner = "client!fq", name = "x", descriptor = "Lclient!fw;")
	private final Class115_Sub1 aClass115_Sub1_2;

	@OriginalMember(owner = "client!fq", name = "F", descriptor = "Lclient!am;")
	private final Class4_Sub3 aClass4_Sub3_2;

	@OriginalMember(owner = "client!fq", name = "q", descriptor = "Lclient!kfa;")
	private final Class7_Sub2 aClass7_Sub2_15;

	@OriginalMember(owner = "client!fq", name = "I", descriptor = "I")
	private final int anInt3205;

	@OriginalMember(owner = "client!fq", name = "M", descriptor = "I")
	private final int anInt3206;

	@OriginalMember(owner = "client!fq", name = "t", descriptor = "I")
	private final int anInt3199;

	@OriginalMember(owner = "client!fq", name = "A", descriptor = "I")
	private final int anInt3203;

	@OriginalMember(owner = "client!fq", name = "N", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!fq", name = "B", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!fq", name = "G", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!fq", name = "w", descriptor = "I")
	private int anInt3201;

	@OriginalMember(owner = "client!fq", name = "E", descriptor = "Lclient!mn;")
	private final Interface14 anInterface14_2;

	@OriginalMember(owner = "client!fq", name = "K", descriptor = "Lclient!mba;")
	private final Class209 aClass209_6;

	@OriginalMember(owner = "client!fq", name = "C", descriptor = "Lclient!nu;")
	private final Interface16 anInterface16_2;

	@OriginalMember(owner = "client!fq", name = "D", descriptor = "Lclient!mba;")
	private final Class209 aClass209_5;

	@OriginalMember(owner = "client!fq", name = "L", descriptor = "Lclient!ek;")
	private Class4_Sub13 aClass4_Sub13_5;

	@OriginalMember(owner = "client!fq", name = "z", descriptor = "Lclient!ij;")
	private Class4_Sub13_Sub1 aClass4_Sub13_Sub1_2;

	@OriginalMember(owner = "client!fq", name = "v", descriptor = "Lclient!mo;")
	private Class221 aClass221_7;

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lclient!kfa;Lclient!fw;Lclient!am;[I)V")
	public Class4_Sub18(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) Class115_Sub1 arg1, @OriginalArg(2) Class4_Sub3 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass115_Sub1_2 = arg1;
		this.aClass4_Sub3_2 = arg2;
		this.aClass7_Sub2_15 = arg0;
		@Pc(22) int local22 = this.aClass4_Sub3_2.method4950() - (arg1.anInt10333 >> 1);
		this.anInt3205 = this.aClass4_Sub3_2.method4954() - local22 >> arg1.anInt10331;
		this.anInt3206 = this.aClass4_Sub3_2.method4954() + local22 >> arg1.anInt10331;
		this.anInt3199 = this.aClass4_Sub3_2.method4949() - local22 >> arg1.anInt10331;
		this.anInt3203 = this.aClass4_Sub3_2.method4949() + local22 >> arg1.anInt10331;
		@Pc(77) int local77 = this.anInt3206 + 1 - this.anInt3205;
		@Pc(86) int local86 = this.anInt3203 + 1 - this.anInt3199;
		this.aFloatArrayArray4 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray2 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray3 = new float[local77 + 1][local86 + 1];
		@Pc(123) int local123;
		@Pc(138) int local138;
		@Pc(145) int local145;
		@Pc(170) int local170;
		@Pc(186) int local186;
		for (@Pc(115) int local115 = 0; local115 <= local86; local115++) {
			local123 = local115 + this.anInt3199;
			if (local123 > 0 && local123 < this.aClass115_Sub1_2.anInt10327 - 1) {
				for (local138 = 0; local138 <= local77; local138++) {
					local145 = this.anInt3205 + local138;
					if (local145 > 0 && this.aClass115_Sub1_2.anInt10330 - 1 > local145) {
						local170 = arg1.method8055(local123, local145 + 1) - arg1.method8055(local123, local145 - 1);
						local186 = arg1.method8055(local123 + 1, local145) - arg1.method8055(local123 - 1, local145);
						@Pc(201) float local201 = (float) (1.0D / Math.sqrt((double) (local186 * local186 + local170 * local170 + 65536)));
						this.aFloatArrayArray2[local138][local115] = local201 * (float) local170;
						this.aFloatArrayArray3[local138][local115] = -256.0F * local201;
						this.aFloatArrayArray4[local138][local115] = local201 * (float) local186;
					}
				}
			}
		}
		local123 = 0;
		@Pc(285) int local285;
		for (local138 = this.anInt3199; local138 <= this.anInt3203; local138++) {
			if (local138 >= 0 && arg1.anInt10327 > local138) {
				for (local145 = this.anInt3205; local145 <= this.anInt3206; local145++) {
					if (local145 >= 0 && local145 < arg1.anInt10330) {
						local170 = arg3[local123];
						@Pc(276) int[] local276 = arg1.anIntArrayArrayArray9[local145][local138];
						if (local276 != null && local170 != 0) {
							if (local170 == 1) {
								local285 = 0;
								while (local285 < local276.length) {
									if (local276[local285++] != -1 && local276[local285++] != -1 && local276[local285++] != -1) {
										this.anInt3201 += 3;
									}
								}
							} else {
								this.anInt3201 += 3;
							}
						}
					}
					local123++;
				}
			} else {
				local123 += this.anInt3206 - this.anInt3205;
			}
		}
		if (this.anInt3201 <= 0) {
			this.anInterface14_2 = null;
			this.aClass209_6 = null;
			this.anInterface16_2 = null;
			this.aClass209_5 = null;
		} else {
			this.aClass4_Sub13_5 = new Class4_Sub13(this.anInt3201 * 2);
			this.aClass4_Sub13_Sub1_2 = new Class4_Sub13_Sub1(this.anInt3201 * 16);
			this.aClass221_7 = new Class221(Static488.method7100(this.anInt3201));
			local123 = 0;
			local145 = 0;
			for (local170 = this.anInt3199; local170 <= this.anInt3203; local170++) {
				if (local170 >= 0 && arg1.anInt10327 > local170) {
					local186 = 0;
					for (local285 = this.anInt3205; local285 <= this.anInt3206; local285++) {
						if (local285 >= 0 && local285 < arg1.anInt10330) {
							@Pc(437) int local437 = arg3[local123];
							@Pc(444) int[] local444 = arg1.anIntArrayArrayArray9[local285][local170];
							if (local444 != null && local437 != 0) {
								if (local437 == 1) {
									@Pc(458) int[] local458 = arg1.anIntArrayArrayArray7[local285][local170];
									@Pc(465) int[] local465 = arg1.anIntArrayArrayArray11[local285][local170];
									@Pc(467) int local467 = 0;
									label108: while (true) {
										while (true) {
											if (local444.length <= local467) {
												break label108;
											}
											if (local444[local467] == -1 || local444[local467 + 1] == -1 || local444[local467 + 2] == -1) {
												local467 += 3;
											} else {
												this.method2579(local186, local465[local467], local285, local170, local145, local458[local467]);
												local467++;
												this.method2579(local186, local465[local467], local285, local170, local145, local458[local467]);
												local467++;
												this.method2579(local186, local465[local467], local285, local170, local145, local458[local467]);
												local467++;
											}
										}
									}
								} else if (local437 == 3) {
									this.method2579(local186, 0, local285, local170, local145, 0);
									this.method2579(local186, 0, local285, local170, local145, arg1.anInt10333);
									this.method2579(local186, arg1.anInt10333, local285, local170, local145, 0);
								} else if (local437 == 2) {
									this.method2579(local186, 0, local285, local170, local145, arg1.anInt10333);
									this.method2579(local186, arg1.anInt10333, local285, local170, local145, arg1.anInt10333);
									this.method2579(local186, 0, local285, local170, local145, 0);
								} else if (local437 == 5) {
									this.method2579(local186, arg1.anInt10333, local285, local170, local145, arg1.anInt10333);
									this.method2579(local186, arg1.anInt10333, local285, local170, local145, 0);
									this.method2579(local186, 0, local285, local170, local145, arg1.anInt10333);
								} else if (local437 == 4) {
									this.method2579(local186, arg1.anInt10333, local285, local170, local145, 0);
									this.method2579(local186, 0, local285, local170, local145, 0);
									this.method2579(local186, arg1.anInt10333, local285, local170, local145, arg1.anInt10333);
								}
							}
						}
						local123++;
						local186++;
					}
				} else {
					local123 += this.anInt3206 - this.anInt3205;
				}
				local145++;
			}
			this.anInterface14_2 = this.aClass7_Sub2_15.method4314(this.aClass4_Sub13_5.anInt9170, false, this.aClass4_Sub13_5.aByteArray88);
			this.anInterface16_2 = this.aClass7_Sub2_15.method4301(this.aClass4_Sub13_Sub1_2.aByteArray88, 16, false, this.aClass4_Sub13_Sub1_2.anInt9170);
			this.aClass209_5 = new Class209(this.anInterface16_2, 5126, 3, 0);
			this.aClass209_6 = new Class209(this.anInterface16_2, 5121, 4, 12);
		}
		this.aFloatArrayArray2 = this.aFloatArrayArray3 = this.aFloatArrayArray4 = null;
		this.aClass4_Sub13_5 = null;
		this.aClass221_7 = null;
		this.aClass4_Sub13_Sub1_2 = null;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IS)V")
	private void method2577(@OriginalArg(1) short arg0) {
		if (this.aClass7_Sub2_15.aBoolean388) {
			this.aClass4_Sub13_5.method7038(arg0);
		} else {
			this.aClass4_Sub13_5.method7041(arg0);
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIBIIII)V")
	private void method2579(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(16) int local16 = arg5 + (arg2 << this.aClass115_Sub1_2.anInt10331);
		@Pc(24) int local24 = (arg3 << this.aClass115_Sub1_2.anInt10331) + arg1;
		@Pc(31) int local31 = this.aClass115_Sub1_2.method8064(local16, local24);
		if ((arg5 & 0x7F) == 0 || (arg1 & 0x7F) == 0) {
			local7 = (long) local24 << 16 & 0xFFFFL << 16 | (long) local16 & 0xFFFFL;
			@Pc(62) Class4 local62 = this.aClass221_7.method5075(local7);
			if (local62 != null) {
				this.method2577(((Class4_Sub49) local62).aShort123);
				return;
			}
		}
		@Pc(80) short local80 = (short) this.anInt3198++;
		if (local7 != -1L) {
			this.aClass221_7.method5073(new Class4_Sub49(local80), local7);
		}
		@Pc(126) float local126;
		@Pc(119) float local119;
		@Pc(112) float local112;
		@Pc(221) float local221;
		@Pc(229) float local229;
		@Pc(236) float local236;
		@Pc(243) float local243;
		@Pc(250) float local250;
		@Pc(259) float local259;
		@Pc(268) float local268;
		@Pc(277) float local277;
		if (arg5 == 0 && arg1 == 0) {
			local112 = this.aFloatArrayArray4[arg0][arg4];
			local119 = this.aFloatArrayArray3[arg0][arg4];
			local126 = this.aFloatArrayArray2[arg0][arg4];
		} else if (arg5 == this.aClass115_Sub1_2.anInt10333 && arg1 == 0) {
			local126 = this.aFloatArrayArray2[arg0 + 1][arg4];
			local112 = this.aFloatArrayArray4[arg0 + 1][arg4];
			local119 = this.aFloatArrayArray3[arg0 + 1][arg4];
		} else if (arg5 == this.aClass115_Sub1_2.anInt10333 && arg1 == this.aClass115_Sub1_2.anInt10333) {
			local119 = this.aFloatArrayArray3[arg0 + 1][arg4 + 1];
			local126 = this.aFloatArrayArray2[arg0 + 1][arg4 + 1];
			local112 = this.aFloatArrayArray4[arg0 + 1][arg4 + 1];
		} else if (arg5 == 0 && this.aClass115_Sub1_2.anInt10333 == arg1) {
			local126 = this.aFloatArrayArray2[arg0][arg4 + 1];
			local112 = this.aFloatArrayArray4[arg0][arg4 + 1];
			local119 = this.aFloatArrayArray3[arg0][arg4 + 1];
		} else {
			local221 = (float) arg5 / (float) this.aClass115_Sub1_2.anInt10333;
			local229 = (float) arg1 / (float) this.aClass115_Sub1_2.anInt10333;
			local236 = this.aFloatArrayArray2[arg0][arg4];
			local243 = this.aFloatArrayArray3[arg0][arg4];
			local250 = this.aFloatArrayArray4[arg0][arg4];
			local259 = this.aFloatArrayArray2[arg0 + 1][arg4];
			local268 = this.aFloatArrayArray3[arg0 + 1][arg4];
			local277 = this.aFloatArrayArray4[arg0 + 1][arg4];
			@Pc(293) float local293 = local236 + (this.aFloatArrayArray2[arg0][arg4 + 1] - local236) * local221;
			@Pc(308) float local308 = local243 + (this.aFloatArrayArray3[arg0][arg4 + 1] - local243) * local221;
			@Pc(325) float local325 = local268 + local221 * (this.aFloatArrayArray3[arg0 + 1][arg4 + 1] - local268);
			@Pc(340) float local340 = local250 + (this.aFloatArrayArray4[arg0][arg4 + 1] - local250) * local221;
			@Pc(358) float local358 = local259 + local221 * (this.aFloatArrayArray2[arg0 + 1][arg4 + 1] - local259);
			local119 = local229 * (local325 - local308) + local308;
			@Pc(384) float local384 = local277 + (this.aFloatArrayArray4[arg0 + 1][arg4 + 1] - local277) * local221;
			local126 = (local358 - local293) * local229 + local293;
			local112 = local340 + local229 * (local384 - local340);
		}
		local221 = this.aClass4_Sub3_2.method4954() - local16;
		local229 = this.aClass4_Sub3_2.method4953() - local31;
		local236 = this.aClass4_Sub3_2.method4949() - local24;
		local243 = (float) Math.sqrt((double) (local236 * local236 + local229 * local229 + local221 * local221));
		local250 = 1.0F / local243;
		local236 *= local250;
		local221 *= local250;
		local229 *= local250;
		local259 = local243 / (float) this.aClass4_Sub3_2.method4950();
		local268 = 1.0F - local259 * local259;
		if (local268 < 0.0F) {
			local268 = 0.0F;
		}
		local277 = local229 * local119 + local221 * local126 + local112 * local236;
		if (local277 < 0.0F) {
			local277 = 0.0F;
		}
		@Pc(542) float local542 = local268 * local277 * 2.0F;
		if (local542 > 1.0F) {
			local542 = 1.0F;
		}
		@Pc(553) int local553 = this.aClass4_Sub3_2.method4952();
		@Pc(563) int local563 = (int) (local542 * (float) (local553 >> 16 & 0xFF));
		if (local563 > 255) {
			local563 = 255;
		}
		@Pc(580) int local580 = (int) (local542 * (float) (local553 >> 8 & 0xFF));
		if (local580 > 255) {
			local580 = 255;
		}
		@Pc(595) int local595 = (int) (local542 * (float) (local553 & 0xFF));
		if (local595 > 255) {
			local595 = 255;
		}
		if (this.aClass7_Sub2_15.aBoolean388) {
			this.aClass4_Sub13_Sub1_2.method3608((float) local16);
			this.aClass4_Sub13_Sub1_2.method3608((float) local31);
			this.aClass4_Sub13_Sub1_2.method3608((float) local24);
		} else {
			this.aClass4_Sub13_Sub1_2.method3607((float) local16);
			this.aClass4_Sub13_Sub1_2.method3607((float) local31);
			this.aClass4_Sub13_Sub1_2.method3607((float) local24);
		}
		this.aClass4_Sub13_Sub1_2.method7052(local563);
		this.aClass4_Sub13_Sub1_2.method7052(local580);
		this.aClass4_Sub13_Sub1_2.method7052(local595);
		this.aClass4_Sub13_Sub1_2.method7052(255);
		this.method2577(local80);
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIII[[Z)V")
	public void method2581(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean[][] arg3) {
		if (this.anInterface14_2 == null || (this.anInt3205 > arg0 + arg2 || (this.anInt3206 < arg2 - arg0 || (this.anInt3199 > arg0 + arg1 || arg1 - arg0 > this.anInt3203)))) {
			return;
		}
		for (@Pc(56) int local56 = this.anInt3199; local56 <= this.anInt3203; local56++) {
			for (@Pc(61) int local61 = this.anInt3205; local61 <= this.anInt3206; local61++) {
				@Pc(67) int local67 = local61 - arg2;
				@Pc(72) int local72 = local56 - arg1;
				if (local67 > -arg0 && arg0 > local67 && -arg0 < local72 && local72 < arg0 && arg3[local67 + arg0][arg0 + local72]) {
					this.aClass7_Sub2_15.method4315((int) (this.aClass4_Sub3_2.method4955() * 255.0F) << 24);
					this.aClass7_Sub2_15.method4354(null, this.aClass209_5, this.aClass209_6, null);
					this.aClass7_Sub2_15.method4338(0, this.anInt3201, this.anInterface14_2);
					return;
				}
			}
		}
	}
}
