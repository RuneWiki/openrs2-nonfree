import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class14_Sub38 extends Class14 {

	@OriginalMember(owner = "client!oe", name = "v", descriptor = "I")
	private int anInt7557;

	@OriginalMember(owner = "client!oe", name = "q", descriptor = "Lclient!qm;")
	private final Class14_Sub37 aClass14_Sub37_1;

	@OriginalMember(owner = "client!oe", name = "y", descriptor = "Lclient!re;")
	private final Class51_Sub3 aClass51_Sub3_3;

	@OriginalMember(owner = "client!oe", name = "u", descriptor = "Lclient!qfa;")
	private final Class137_Sub3 aClass137_Sub3_29;

	@OriginalMember(owner = "client!oe", name = "L", descriptor = "I")
	private final int anInt7562;

	@OriginalMember(owner = "client!oe", name = "p", descriptor = "I")
	private final int anInt7554;

	@OriginalMember(owner = "client!oe", name = "C", descriptor = "I")
	private final int anInt7559;

	@OriginalMember(owner = "client!oe", name = "E", descriptor = "I")
	private final int anInt7560;

	@OriginalMember(owner = "client!oe", name = "z", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!oe", name = "x", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!oe", name = "A", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!oe", name = "w", descriptor = "I")
	private int anInt7558;

	@OriginalMember(owner = "client!oe", name = "K", descriptor = "Lclient!so;")
	private Class14_Sub29 aClass14_Sub29_8;

	@OriginalMember(owner = "client!oe", name = "n", descriptor = "Lclient!nga;")
	private Class14_Sub29_Sub2 aClass14_Sub29_Sub2_1;

	@OriginalMember(owner = "client!oe", name = "D", descriptor = "Lclient!jo;")
	private Class187 aClass187_52;

	@OriginalMember(owner = "client!oe", name = "F", descriptor = "Lclient!kda;")
	private final Interface12 anInterface12_2;

	@OriginalMember(owner = "client!oe", name = "I", descriptor = "Lclient!gda;")
	private final Interface8 anInterface8_3;

	@OriginalMember(owner = "client!oe", name = "r", descriptor = "Lclient!ei;")
	private final Class91 aClass91_7;

	@OriginalMember(owner = "client!oe", name = "o", descriptor = "Lclient!ei;")
	private final Class91 aClass91_6;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lclient!qfa;Lclient!re;Lclient!qm;[I)V")
	public Class14_Sub38(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) Class51_Sub3 arg1, @OriginalArg(2) Class14_Sub37 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass14_Sub37_1 = arg2;
		this.aClass51_Sub3_3 = arg1;
		this.aClass137_Sub3_29 = arg0;
		@Pc(23) int local23 = this.aClass14_Sub37_1.method7819() - (arg1.anInt9506 >> 1);
		this.anInt7562 = this.aClass14_Sub37_1.method7827() - local23 >> arg1.anInt9507;
		this.anInt7554 = local23 + this.aClass14_Sub37_1.method7827() >> arg1.anInt9507;
		this.anInt7559 = this.aClass14_Sub37_1.method7826() - local23 >> arg1.anInt9507;
		this.anInt7560 = local23 + this.aClass14_Sub37_1.method7826() >> arg1.anInt9507;
		@Pc(77) int local77 = this.anInt7554 + 1 - this.anInt7562;
		@Pc(86) int local86 = this.anInt7560 + 1 - this.anInt7559;
		this.aFloatArrayArray7 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray6 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray8 = new float[local77 + 1][local86 + 1];
		@Pc(122) int local122;
		@Pc(133) int local133;
		@Pc(140) int local140;
		@Pc(169) int local169;
		@Pc(185) int local185;
		for (@Pc(115) int local115 = 0; local115 <= local86; local115++) {
			local122 = this.anInt7559 + local115;
			if (local122 > 0 && this.aClass51_Sub3_3.anInt9512 - 1 > local122) {
				for (local133 = 0; local133 <= local77; local133++) {
					local140 = local133 + this.anInt7562;
					if (local140 > 0 && local140 < this.aClass51_Sub3_3.anInt9511 - 1) {
						local169 = arg1.method7857(local122, local140 + 1) - arg1.method7857(local122, local140 - 1);
						local185 = arg1.method7857(local122 + 1, local140) - arg1.method7857(local122 - 1, local140);
						@Pc(200) float local200 = (float) (1.0D / Math.sqrt((double) (local169 * local169 + local185 * local185 + 65536)));
						this.aFloatArrayArray6[local133][local115] = (float) local169 * local200;
						this.aFloatArrayArray8[local133][local115] = local200 * -256.0F;
						this.aFloatArrayArray7[local133][local115] = local200 * (float) local185;
					}
				}
			}
		}
		local122 = 0;
		@Pc(293) int local293;
		for (local133 = this.anInt7559; local133 <= this.anInt7560; local133++) {
			if (local133 >= 0 && arg1.anInt9512 > local133) {
				for (local140 = this.anInt7562; local140 <= this.anInt7554; local140++) {
					if (local140 >= 0 && local140 < arg1.anInt9511) {
						local169 = arg3[local122];
						@Pc(279) int[] local279 = arg1.anIntArrayArrayArray16[local140][local133];
						if (local279 != null && local169 != 0) {
							if (local169 == 1) {
								local293 = 0;
								while (local279.length > local293) {
									if (local279[local293++] != -1 && local279[local293++] != -1 && local279[local293++] != -1) {
										this.anInt7558 += 3;
									}
								}
							} else {
								this.anInt7558 += 3;
							}
						}
					}
					local122++;
				}
			} else {
				local122 += this.anInt7554 - this.anInt7562;
			}
		}
		if (this.anInt7558 > 0) {
			this.aClass14_Sub29_8 = new Class14_Sub29(this.anInt7558 * 2);
			this.aClass14_Sub29_Sub2_1 = new Class14_Sub29_Sub2(this.anInt7558 * 16);
			this.aClass187_52 = new Class187(Static330.method5181(this.anInt7558));
			local140 = 0;
			local122 = 0;
			for (local169 = this.anInt7559; local169 <= this.anInt7560; local169++) {
				if (local169 >= 0 && arg1.anInt9512 > local169) {
					local185 = 0;
					for (local293 = this.anInt7562; local293 <= this.anInt7554; local293++) {
						if (local293 >= 0 && local293 < arg1.anInt9511) {
							@Pc(428) int local428 = arg3[local122];
							@Pc(435) int[] local435 = arg1.anIntArrayArrayArray16[local293][local169];
							if (local435 != null && local428 != 0) {
								if (local428 == 1) {
									@Pc(452) int[] local452 = arg1.anIntArrayArrayArray13[local293][local169];
									@Pc(459) int[] local459 = arg1.anIntArrayArrayArray14[local293][local169];
									@Pc(461) int local461 = 0;
									label108: while (true) {
										while (true) {
											if (local461 >= local435.length) {
												break label108;
											}
											if (local435[local461] == -1 || local435[local461 + 1] == -1 || local435[local461 + 2] == -1) {
												local461 += 3;
											} else {
												this.method6219(local459[local461], local293, local452[local461], local185, local140, local169);
												local461++;
												this.method6219(local459[local461], local293, local452[local461], local185, local140, local169);
												local461++;
												this.method6219(local459[local461], local293, local452[local461], local185, local140, local169);
												local461++;
											}
										}
									}
								} else if (local428 == 3) {
									this.method6219(0, local293, 0, local185, local140, local169);
									this.method6219(0, local293, arg1.anInt9506, local185, local140, local169);
									this.method6219(arg1.anInt9506, local293, 0, local185, local140, local169);
								} else if (local428 == 2) {
									this.method6219(0, local293, arg1.anInt9506, local185, local140, local169);
									this.method6219(arg1.anInt9506, local293, arg1.anInt9506, local185, local140, local169);
									this.method6219(0, local293, 0, local185, local140, local169);
								} else if (local428 == 5) {
									this.method6219(arg1.anInt9506, local293, arg1.anInt9506, local185, local140, local169);
									this.method6219(arg1.anInt9506, local293, 0, local185, local140, local169);
									this.method6219(0, local293, arg1.anInt9506, local185, local140, local169);
								} else if (local428 == 4) {
									this.method6219(arg1.anInt9506, local293, 0, local185, local140, local169);
									this.method6219(0, local293, 0, local185, local140, local169);
									this.method6219(arg1.anInt9506, local293, arg1.anInt9506, local185, local140, local169);
								}
							}
						}
						local122++;
						local185++;
					}
				} else {
					local122 += this.anInt7554 - this.anInt7562;
				}
				local140++;
			}
			this.anInterface12_2 = this.aClass137_Sub3_29.method7075(this.aClass14_Sub29_8.aByteArray84, this.aClass14_Sub29_8.anInt7264, false);
			this.anInterface8_3 = this.aClass137_Sub3_29.method7076(16, false, this.aClass14_Sub29_Sub2_1.aByteArray84, this.aClass14_Sub29_Sub2_1.anInt7264);
			this.aClass91_7 = new Class91(this.anInterface8_3, 5126, 3, 0);
			this.aClass91_6 = new Class91(this.anInterface8_3, 5121, 4, 12);
		} else {
			this.aClass91_7 = null;
			this.anInterface12_2 = null;
			this.aClass91_6 = null;
			this.anInterface8_3 = null;
		}
		this.aClass14_Sub29_Sub2_1 = null;
		this.aClass14_Sub29_8 = null;
		this.aClass187_52 = null;
		this.aFloatArrayArray6 = this.aFloatArrayArray8 = this.aFloatArrayArray7 = null;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(III[[ZB)V")
	public void method6214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3) {
		if (this.anInterface12_2 == null || (this.anInt7562 > arg2 + arg1 || (this.anInt7554 < arg1 - arg2 || (this.anInt7559 > arg0 + arg2 || arg0 - arg2 > this.anInt7560)))) {
			return;
		}
		for (@Pc(59) int local59 = this.anInt7559; local59 <= this.anInt7560; local59++) {
			for (@Pc(64) int local64 = this.anInt7562; local64 <= this.anInt7554; local64++) {
				@Pc(71) int local71 = local64 - arg1;
				@Pc(76) int local76 = local59 - arg0;
				if (local71 > -arg2 && arg2 > local71 && local76 > -arg2 && local76 < arg2 && arg3[arg2 + local71][arg2 + local76]) {
					this.aClass137_Sub3_29.method7070((int) (this.aClass14_Sub37_1.method7825() * 255.0F) << 24);
					this.aClass137_Sub3_29.method7036(this.aClass91_6, (Class91) null, this.aClass91_7, (Class91) null);
					this.aClass137_Sub3_29.method7063(0, this.anInterface12_2, this.anInt7558);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(SI)V")
	private void method6215(@OriginalArg(0) short arg0) {
		if (this.aClass137_Sub3_29.aBoolean594) {
			this.aClass14_Sub29_8.method5859(arg0);
		} else {
			this.aClass14_Sub29_8.method5867(arg0);
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIIII)V")
	private void method6219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg1 << this.aClass51_Sub3_3.anInt9507) + arg2;
		@Pc(23) int local23 = arg0 + (arg5 << this.aClass51_Sub3_3.anInt9507);
		@Pc(30) int local30 = this.aClass51_Sub3_3.method7866(local15, local23);
		if ((arg2 & 0x7F) == 0 || (arg0 & 0x7F) == 0) {
			local7 = (long) local15 & 0xFFFFL | ((long) local23 & 0xFFFFL) << 16;
			@Pc(56) Class14 local56 = this.aClass187_52.method4078(local7);
			if (local56 != null) {
				this.method6215(((Class14_Sub49) local56).aShort95);
				return;
			}
		}
		@Pc(74) short local74 = (short) this.anInt7557++;
		if (local7 != -1L) {
			this.aClass187_52.method4077(local7, new Class14_Sub49(local74));
		}
		@Pc(119) float local119;
		@Pc(137) float local137;
		@Pc(128) float local128;
		@Pc(176) float local176;
		@Pc(184) float local184;
		@Pc(191) float local191;
		@Pc(198) float local198;
		@Pc(205) float local205;
		@Pc(214) float local214;
		@Pc(223) float local223;
		@Pc(267) float local267;
		if (arg2 == 0 && arg0 == 0) {
			local119 = this.aFloatArrayArray6[arg3][arg4];
			local137 = this.aFloatArrayArray8[arg3][arg4];
			local128 = this.aFloatArrayArray7[arg3][arg4];
		} else if (arg2 == this.aClass51_Sub3_3.anInt9506 && arg0 == 0) {
			local119 = this.aFloatArrayArray6[arg3 + 1][arg4];
			local128 = this.aFloatArrayArray7[arg3 + 1][arg4];
			local137 = this.aFloatArrayArray8[arg3 + 1][arg4];
		} else if (this.aClass51_Sub3_3.anInt9506 == arg2 && arg0 == this.aClass51_Sub3_3.anInt9506) {
			local128 = this.aFloatArrayArray7[arg3 + 1][arg4 + 1];
			local137 = this.aFloatArrayArray8[arg3 + 1][arg4 + 1];
			local119 = this.aFloatArrayArray6[arg3 + 1][arg4 + 1];
		} else if (arg2 == 0 && arg0 == this.aClass51_Sub3_3.anInt9506) {
			local137 = this.aFloatArrayArray8[arg3][arg4 + 1];
			local119 = this.aFloatArrayArray6[arg3][arg4 + 1];
			local128 = this.aFloatArrayArray7[arg3][arg4 + 1];
		} else {
			local176 = (float) arg2 / (float) this.aClass51_Sub3_3.anInt9506;
			local184 = (float) arg0 / (float) this.aClass51_Sub3_3.anInt9506;
			local191 = this.aFloatArrayArray6[arg3][arg4];
			local198 = this.aFloatArrayArray8[arg3][arg4];
			local205 = this.aFloatArrayArray7[arg3][arg4];
			local214 = this.aFloatArrayArray6[arg3 + 1][arg4];
			local223 = this.aFloatArrayArray8[arg3 + 1][arg4];
			@Pc(240) float local240 = local214 + (this.aFloatArrayArray6[arg3 + 1][arg4 + 1] - local214) * local176;
			@Pc(258) float local258 = local223 + local176 * (this.aFloatArrayArray8[arg3 + 1][arg4 + 1] - local223);
			local267 = this.aFloatArrayArray7[arg3 + 1][arg4];
			@Pc(283) float local283 = local191 + local176 * (this.aFloatArrayArray6[arg3][arg4 + 1] - local191);
			@Pc(298) float local298 = local205 + (this.aFloatArrayArray7[arg3][arg4 + 1] - local205) * local176;
			@Pc(314) float local314 = local198 + local176 * (this.aFloatArrayArray8[arg3][arg4 + 1] - local198);
			@Pc(332) float local332 = local267 + local176 * (this.aFloatArrayArray7[arg3 + 1][arg4 + 1] - local267);
			local137 = local314 + (local258 - local314) * local184;
			local119 = local283 + local184 * (local240 - local283);
			local128 = local298 + local184 * (local332 - local298);
		}
		local176 = (float) (this.aClass14_Sub37_1.method7827() - local15);
		local184 = (float) (this.aClass14_Sub37_1.method7823() - local30);
		local191 = (float) (this.aClass14_Sub37_1.method7826() - local23);
		local198 = (float) Math.sqrt((double) (local191 * local191 + local184 * local184 + local176 * local176));
		local205 = 1.0F / local198;
		local176 *= local205;
		local191 *= local205;
		local184 *= local205;
		local214 = local198 / (float) this.aClass14_Sub37_1.method7819();
		local223 = 1.0F - local214 * local214;
		if (local223 < 0.0F) {
			local223 = 0.0F;
		}
		local267 = local191 * local128 + local119 * local176 + local184 * local137;
		if (local267 < 0.0F) {
			local267 = 0.0F;
		}
		@Pc(549) float local549 = local223 * 2.0F * local267;
		if (local549 > 1.0F) {
			local549 = 1.0F;
		}
		@Pc(573) int local573 = this.aClass14_Sub37_1.method7820();
		@Pc(583) int local583 = (int) ((float) (local573 >> 16 & 0xFF) * local549);
		if (local583 > 255) {
			local583 = 255;
		}
		@Pc(598) int local598 = (int) (local549 * (float) (local573 >> 8 & 0xFF));
		if (local598 > 255) {
			local598 = 255;
		}
		@Pc(613) int local613 = (int) (local549 * (float) (local573 & 0xFF));
		if (local613 > 255) {
			local613 = 255;
		}
		if (this.aClass137_Sub3_29.aBoolean594) {
			this.aClass14_Sub29_Sub2_1.method5908((float) local15);
			this.aClass14_Sub29_Sub2_1.method5908((float) local30);
			this.aClass14_Sub29_Sub2_1.method5908((float) local23);
		} else {
			this.aClass14_Sub29_Sub2_1.method5911((float) local15);
			this.aClass14_Sub29_Sub2_1.method5911((float) local30);
			this.aClass14_Sub29_Sub2_1.method5911((float) local23);
		}
		this.aClass14_Sub29_Sub2_1.method5854(local583);
		this.aClass14_Sub29_Sub2_1.method5854(local598);
		this.aClass14_Sub29_Sub2_1.method5854(local613);
		this.aClass14_Sub29_Sub2_1.method5854(255);
		this.method6215(local74);
	}
}
