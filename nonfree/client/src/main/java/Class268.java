import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!os")
public final class Class268 {

	@OriginalMember(owner = "client!os", name = "d", descriptor = "[I")
	private final int[] anIntArray433 = new int[64];

	@OriginalMember(owner = "client!os", name = "m", descriptor = "[[Lclient!nh;")
	private final Class8_Sub8_Sub1[][] aClass8_Sub8_Sub1ArrayArray3 = new Class8_Sub8_Sub1[1600][64];

	@OriginalMember(owner = "client!os", name = "i", descriptor = "[I")
	private final int[] anIntArray432 = new int[1600];

	@OriginalMember(owner = "client!os", name = "h", descriptor = "[[Lclient!nh;")
	private final Class8_Sub8_Sub1[][] aClass8_Sub8_Sub1ArrayArray4 = new Class8_Sub8_Sub1[64][768];

	@OriginalMember(owner = "client!os", name = "c", descriptor = "[I")
	private final int[] anIntArray434 = new int[8191];

	@OriginalMember(owner = "client!os", name = "j", descriptor = "I")
	private int anInt7371 = 0;

	@OriginalMember(owner = "client!os", name = "n", descriptor = "Lclient!gn;")
	private final Class147 aClass147_9;

	@OriginalMember(owner = "client!os", name = "f", descriptor = "Lclient!sfa;")
	private final Interface25 anInterface25_11;

	@OriginalMember(owner = "client!os", name = "e", descriptor = "Lclient!sfa;")
	private final Interface25 anInterface25_10;

	@OriginalMember(owner = "client!os", name = "l", descriptor = "Lclient!je;")
	private final Interface9 anInterface9_5;

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "(Lclient!kd;)V")
	public Class268(@OriginalArg(0) Class57_Sub3 arg0) {
		this.aClass147_9 = arg0.method7825(new Class14[] { new Class14(new Class384[] { Static662.aClass384_1, Static662.aClass384_3, Static662.aClass384_5 }), new Class14(Static662.aClass384_2) });
		this.anInterface25_11 = arg0.method7784(true);
		this.anInterface25_10 = arg0.method7784(false);
		this.anInterface25_10.method2907(12, 393168);
		this.anInterface9_5 = arg0.method7762(false);
		this.anInterface9_5.method2925(49146);
		@Pc(98) Buffer local98 = this.anInterface9_5.method2926();
		@Pc(115) int local115;
		if (local98 != null) {
			@Pc(105) Stream local105 = arg0.method7826(local98);
			@Pc(109) int local109;
			if (Stream.b()) {
				for (local109 = 0; local109 < 8191; local109++) {
					local115 = local109 * 4;
					local105.d(local115);
					local105.d(local115 + 1);
					local105.d(local115 + 2);
					local105.d(local115 + 2);
					local105.d(local115 + 3);
					local105.d(local115);
				}
			} else {
				for (local109 = 0; local109 < 8191; local109++) {
					local115 = local109 * 4;
					local105.c(local115);
					local105.c(local115 + 1);
					local105.c(local115 + 2);
					local105.c(local115 + 2);
					local105.c(local115 + 3);
					local105.c(local115);
				}
			}
			local105.c();
			this.anInterface9_5.method2927();
		}
		@Pc(206) Buffer local206 = this.anInterface25_10.method2909();
		if (local206 != null) {
			@Pc(213) Stream local213 = arg0.method7826(local206);
			if (Stream.b()) {
				for (local115 = 0; local115 < 8191; local115++) {
					local213.b(0.0F);
					local213.b(-1.0F);
					local213.b(0.0F);
					local213.b(0.0F);
					local213.b(-1.0F);
					local213.b(0.0F);
					local213.b(0.0F);
					local213.b(-1.0F);
					local213.b(0.0F);
					local213.b(0.0F);
					local213.b(-1.0F);
					local213.b(0.0F);
				}
			} else {
				for (local115 = 0; local115 < 8191; local115++) {
					local213.a(0.0F);
					local213.a(-1.0F);
					local213.a(0.0F);
					local213.a(0.0F);
					local213.a(-1.0F);
					local213.a(0.0F);
					local213.a(0.0F);
					local213.a(-1.0F);
					local213.a(0.0F);
					local213.a(0.0F);
					local213.a(-1.0F);
					local213.a(0.0F);
				}
			}
			local213.c();
			this.anInterface25_10.method2908();
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(B)V")
	public void method6355() {
		this.anInterface25_11.method2921();
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ILclient!kd;)V")
	private void method6357(@OriginalArg(1) Class57_Sub3 arg0) {
		arg0.method7821(true);
		arg0.method7742(true);
		if (Static655.aFloat206 != arg0.aFloat171) {
			arg0.xa(Static655.aFloat206);
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ILclient!jw;Lclient!kd;I)V")
	public void method6359(@OriginalArg(0) int arg0, @OriginalArg(1) Class193 arg1, @OriginalArg(2) Class57_Sub3 arg2) {
		if (arg2.aClass203_Sub1_16 == null) {
			return;
		}
		if (arg0 >= 0) {
			this.method6362(arg0, arg2);
		} else {
			this.method6361(arg2);
		}
		@Pc(31) float local31 = arg2.aClass203_Sub1_16.aFloat90;
		@Pc(35) float local35 = arg2.aClass203_Sub1_16.aFloat98;
		@Pc(39) float local39 = arg2.aClass203_Sub1_16.aFloat91;
		@Pc(43) float local43 = arg2.aClass203_Sub1_16.aFloat89;
		try {
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = Integer.MAX_VALUE;
			@Pc(49) int local49 = 0;
			@Pc(53) Class8_Sub8 local53 = arg1.aClass154_1.aClass8_Sub8_1;
			@Pc(67) Class8_Sub8 local67;
			@Pc(99) int local99;
			for (local67 = local53.aClass8_Sub8_10; local67 != local53; local67 = local67.aClass8_Sub8_10) {
				@Pc(72) Class8_Sub8_Sub1 local72 = (Class8_Sub8_Sub1) local67;
				local99 = (int) (local43 + local31 * (float) (local72.anInt7345 >> 12) + local35 * (float) (local72.anInt7350 >> 12) + local39 * (float) (local72.anInt7349 >> 12));
				if (local49 < local99) {
					local49 = local99;
				}
				if (local47 > local99) {
					local47 = local99;
				}
				this.anIntArray434[local45++] = local99;
			}
			@Pc(130) int local130 = local49 - local47;
			if (local130 + 2 > 1600) {
				local99 = Static197.method8882(local130) + 1 - Static247.anInt4255;
				local130 = (local130 >> local99) + 2;
			} else {
				local99 = 0;
				local130 += 2;
			}
			local45 = 0;
			local67 = local53.aClass8_Sub8_10;
			@Pc(162) int local162 = -2;
			@Pc(164) boolean local164 = true;
			@Pc(166) boolean local166 = true;
			while (local67 != local53) {
				this.anInt7371 = 0;
				for (@Pc(175) int local175 = 0; local175 < local130; local175++) {
					this.anIntArray432[local175] = 0;
				}
				for (@Pc(190) int local190 = 0; local190 < 64; local190++) {
					this.anIntArray433[local190] = 0;
				}
				while (local67 != local53) {
					@Pc(216) Class8_Sub8_Sub1 local216 = (Class8_Sub8_Sub1) local67;
					if (local166) {
						local164 = local216.aBoolean565;
						local166 = false;
						local162 = local216.anInt7342;
					}
					if (local45 > 0 && (local162 != local216.anInt7342 || local164 != local216.aBoolean565)) {
						local166 = true;
						break;
					}
					@Pc(264) int local264 = this.anIntArray434[local45++] - local47 >> local99;
					if (local264 < 1600) {
						if (this.anIntArray432[local264] < 64) {
							this.aClass8_Sub8_Sub1ArrayArray3[local264][this.anIntArray432[local264]++] = local216;
						} else {
							label101: {
								if (this.anIntArray432[local264] == 64) {
									if (this.anInt7371 == 64) {
										break label101;
									}
									this.anIntArray432[local264] += this.anInt7371++ + 1;
								}
								this.aClass8_Sub8_Sub1ArrayArray4[this.anIntArray432[local264] - 1 - 64][this.anIntArray433[this.anIntArray432[local264] - 64 - 1]++] = local216;
							}
						}
					}
					local67 = local67.aClass8_Sub8_10;
				}
				arg2.method7827(false, local162 < 0 ? -1 : local162, false);
				if (local164 && arg2.aFloat171 != Static655.aFloat206) {
					arg2.xa(Static655.aFloat206);
				} else if (arg2.aFloat171 != 1.0F) {
					arg2.xa(1.0F);
				}
				this.method6360(arg2, local130);
			}
		} catch (@Pc(418) Exception local418) {
		}
		this.method6357(arg2);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!kd;II)V")
	private void method6360(@OriginalArg(0) Class57_Sub3 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class203_Sub1 local11 = arg0.method7865();
		@Pc(14) float local14 = local11.aFloat92;
		@Pc(17) float local17 = local11.aFloat94;
		@Pc(20) float local20 = local11.aFloat95;
		@Pc(23) float local23 = local11.aFloat96;
		@Pc(26) float local26 = local11.aFloat93;
		@Pc(29) float local29 = local11.aFloat87;
		@Pc(33) float local33 = local23 + local14;
		@Pc(46) float local46 = local17 + local26;
		@Pc(50) float local50 = local29 + local20;
		@Pc(55) float local55 = local14 - local23;
		@Pc(59) float local59 = local17 - local26;
		@Pc(64) float local64 = local20 - local29;
		@Pc(68) float local68 = local23 - local14;
		@Pc(72) float local72 = local26 - local17;
		@Pc(77) float local77 = local29 - local20;
		@Pc(83) Buffer local83 = this.anInterface25_11.method2909();
		if (local83 == null) {
			return;
		}
		@Pc(92) Stream local92 = arg0.method7826(local83);
		@Pc(98) int local98;
		@Pc(118) int local118;
		@Pc(127) int local127;
		@Pc(138) Class8_Sub8_Sub1 local138;
		@Pc(141) int local141;
		@Pc(146) byte local146;
		@Pc(151) byte local151;
		@Pc(154) byte local154;
		@Pc(159) byte local159;
		@Pc(165) float local165;
		@Pc(171) float local171;
		@Pc(177) float local177;
		@Pc(182) int local182;
		@Pc(476) float local476;
		@Pc(481) int local481;
		@Pc(421) int local421;
		@Pc(437) Class8_Sub8_Sub1 local437;
		@Pc(440) int local440;
		@Pc(453) byte local453;
		@Pc(458) byte local458;
		@Pc(470) float local470;
		if (Stream.b()) {
			for (local98 = arg1 - 1; local98 >= 0; local98--) {
				local118 = this.anIntArray432[local98] <= 64 ? this.anIntArray432[local98] : 64;
				if (local118 > 0) {
					for (local127 = local118 - 1; local127 >= 0; local127--) {
						local138 = this.aClass8_Sub8_Sub1ArrayArray3[local98][local127];
						local141 = local138.anInt7344;
						local146 = (byte) (local141 >> 16);
						local151 = (byte) (local141 >> 8);
						local154 = (byte) local141;
						local159 = (byte) (local141 >>> 24);
						local165 = (float) (local138.anInt7345 >> 12);
						local171 = (float) (local138.anInt7350 >> 12);
						local177 = (float) (local138.anInt7349 >> 12);
						local182 = local138.anInt7348 >> 12;
						local92.b(local165 + local33 * (float) -local182);
						local92.b(local46 * (float) -local182 + local171);
						local92.b(local177 + local50 * (float) -local182);
						if (arg0.anInt9165 == 0) {
							local92.a(local146, local151, local154, local159);
						} else {
							local92.b(local146, local151, local154, local159);
						}
						local92.b(0.0F);
						local92.b(0.0F);
						local92.b(local165 + (float) local182 * local55);
						local92.b(local171 + (float) local182 * local59);
						local92.b(local177 + local64 * (float) local182);
						if (arg0.anInt9165 == 0) {
							local92.a(local146, local151, local154, local159);
						} else {
							local92.b(local146, local151, local154, local159);
						}
						local92.b(1.0F);
						local92.b(0.0F);
						local92.b(local165 + (float) local182 * local33);
						local92.b(local171 + local46 * (float) local182);
						local92.b(local50 * (float) local182 + local177);
						if (arg0.anInt9165 == 0) {
							local92.a(local146, local151, local154, local159);
						} else {
							local92.b(local146, local151, local154, local159);
						}
						local92.b(1.0F);
						local92.b(1.0F);
						local92.b(local165 + (float) local182 * local68);
						local92.b(local72 * (float) local182 + local171);
						local92.b((float) local182 * local77 + local177);
						if (arg0.anInt9165 == 0) {
							local92.a(local146, local151, local154, local159);
						} else {
							local92.b(local146, local151, local154, local159);
						}
						local92.b(0.0F);
						local7++;
						local92.b(1.0F);
					}
					if (this.anIntArray432[local98] > 64) {
						local421 = this.anIntArray432[local98] - 1 - 64;
						for (local141 = this.anIntArray433[local421] - 1; local141 >= 0; local141--) {
							local437 = this.aClass8_Sub8_Sub1ArrayArray4[local421][local141];
							local440 = local437.anInt7344;
							local154 = (byte) (local440 >> 16);
							local159 = (byte) (local440 >> 8);
							local453 = (byte) local440;
							local458 = (byte) (local440 >>> 24);
							local177 = (float) (local437.anInt7345 >> 12);
							local470 = (float) (local437.anInt7350 >> 12);
							local476 = (float) (local437.anInt7349 >> 12);
							local481 = local437.anInt7348 >> 12;
							local92.b((float) -local481 * local33 + local177);
							local92.b(local470 + (float) -local481 * local46);
							local92.b(local50 * (float) -local481 + local476);
							if (arg0.anInt9165 == 0) {
								local92.a(local154, local159, local453, local458);
							} else {
								local92.b(local154, local159, local453, local458);
							}
							local92.b(0.0F);
							local92.b(0.0F);
							local92.b(local177 + (float) local481 * local55);
							local92.b(local470 + local59 * (float) local481);
							local92.b(local476 + (float) local481 * local64);
							if (arg0.anInt9165 == 0) {
								local92.a(local154, local159, local453, local458);
							} else {
								local92.b(local154, local159, local453, local458);
							}
							local92.b(1.0F);
							local92.b(0.0F);
							local92.b(local33 * (float) local481 + local177);
							local92.b(local46 * (float) local481 + local470);
							local92.b((float) local481 * local50 + local476);
							if (arg0.anInt9165 == 0) {
								local92.a(local154, local159, local453, local458);
							} else {
								local92.b(local154, local159, local453, local458);
							}
							local92.b(1.0F);
							local92.b(1.0F);
							local92.b((float) local481 * local68 + local177);
							local92.b(local470 + (float) local481 * local72);
							local92.b(local77 * (float) local481 + local476);
							if (arg0.anInt9165 == 0) {
								local92.a(local154, local159, local453, local458);
							} else {
								local92.b(local154, local159, local453, local458);
							}
							local92.b(0.0F);
							local92.b(1.0F);
							local7++;
						}
					}
				}
			}
		} else {
			for (local98 = arg1 - 1; local98 >= 0; local98--) {
				local118 = this.anIntArray432[local98] <= 64 ? this.anIntArray432[local98] : 64;
				if (local118 > 0) {
					for (local127 = local118 - 1; local127 >= 0; local127--) {
						local138 = this.aClass8_Sub8_Sub1ArrayArray3[local98][local127];
						local141 = local138.anInt7344;
						local146 = (byte) (local141 >> 16);
						local151 = (byte) (local141 >> 8);
						local154 = (byte) local141;
						local159 = (byte) (local141 >>> 24);
						local165 = (float) (local138.anInt7345 >> 12);
						local171 = (float) (local138.anInt7350 >> 12);
						local177 = (float) (local138.anInt7349 >> 12);
						local182 = local138.anInt7348 >> 12;
						local92.a(local33 * (float) -local182 + local165);
						local92.a(local171 + local46 * (float) -local182);
						local92.a((float) -local182 * local50 + local177);
						if (arg0.anInt9165 == 0) {
							local92.a(local146, local151, local154, local159);
						} else {
							local92.b(local146, local151, local154, local159);
						}
						local92.a(0.0F);
						local92.a(0.0F);
						local92.a((float) local182 * local55 + local165);
						local92.a(local171 + local59 * (float) local182);
						local92.a(local177 + (float) local182 * local64);
						if (arg0.anInt9165 == 0) {
							local92.a(local146, local151, local154, local159);
						} else {
							local92.b(local146, local151, local154, local159);
						}
						local92.a(1.0F);
						local92.a(0.0F);
						local92.a(local165 + local33 * (float) local182);
						local92.a((float) local182 * local46 + local171);
						local92.a(local50 * (float) local182 + local177);
						if (arg0.anInt9165 == 0) {
							local92.a(local146, local151, local154, local159);
						} else {
							local92.b(local146, local151, local154, local159);
						}
						local92.a(1.0F);
						local92.a(1.0F);
						local92.a(local165 + (float) local182 * local68);
						local92.a(local171 + (float) local182 * local72);
						local92.a(local177 + (float) local182 * local77);
						if (arg0.anInt9165 == 0) {
							local92.a(local146, local151, local154, local159);
						} else {
							local92.b(local146, local151, local154, local159);
						}
						local92.a(0.0F);
						local7++;
						local92.a(1.0F);
					}
					if (this.anIntArray432[local98] > 64) {
						local421 = this.anIntArray432[local98] - 1 - 64;
						for (local141 = this.anIntArray433[local421] - 1; local141 >= 0; local141--) {
							local437 = this.aClass8_Sub8_Sub1ArrayArray4[local421][local141];
							local440 = local437.anInt7344;
							local154 = (byte) (local440 >> 16);
							local159 = (byte) (local440 >> 8);
							local453 = (byte) local440;
							local458 = (byte) (local440 >>> 24);
							local177 = (float) (local437.anInt7345 >> 12);
							local470 = (float) (local437.anInt7350 >> 12);
							local476 = (float) (local437.anInt7349 >> 12);
							local481 = local437.anInt7348 >> 12;
							local92.a((float) -local481 * local33 + local177);
							local92.a(local46 * (float) -local481 + local470);
							local92.a(local50 * (float) -local481 + local476);
							if (arg0.anInt9165 == 0) {
								local92.a(local154, local159, local453, local458);
							} else {
								local92.b(local154, local159, local453, local458);
							}
							local92.a(0.0F);
							local92.a(0.0F);
							local92.a(local177 + local55 * (float) local481);
							local92.a(local470 + (float) local481 * local59);
							local92.a(local476 + local64 * (float) local481);
							if (arg0.anInt9165 == 0) {
								local92.a(local154, local159, local453, local458);
							} else {
								local92.b(local154, local159, local453, local458);
							}
							local92.a(1.0F);
							local92.a(0.0F);
							local92.a(local33 * (float) local481 + local177);
							local92.a(local470 + (float) local481 * local46);
							local92.a(local476 + local50 * (float) local481);
							if (arg0.anInt9165 == 0) {
								local92.a(local154, local159, local453, local458);
							} else {
								local92.b(local154, local159, local453, local458);
							}
							local92.a(1.0F);
							local92.a(1.0F);
							local92.a(local68 * (float) local481 + local177);
							local92.a((float) local481 * local72 + local470);
							local92.a(local476 + local77 * (float) local481);
							if (arg0.anInt9165 == 0) {
								local92.a(local154, local159, local453, local458);
							} else {
								local92.b(local154, local159, local453, local458);
							}
							local92.a(0.0F);
							local92.a(1.0F);
							local7++;
						}
					}
				}
			}
		}
		local92.c();
		if (this.anInterface25_11.method2908()) {
			arg0.method7807(0, this.anInterface25_11);
			arg0.method7807(1, this.anInterface25_10);
			arg0.method7745(this.aClass147_9);
			arg0.method7814(local7 * 4, this.anInterface9_5, 0, 0, Static175.aClass85_1, local7 * 2);
		}
	}

	@OriginalMember(owner = "client!os", name = "c", descriptor = "(ILclient!kd;)V")
	private void method6361(@OriginalArg(1) Class57_Sub3 arg0) {
		Static655.aFloat206 = arg0.aFloat171;
		arg0.method7842();
		arg0.method7742(false);
		arg0.method7821(false);
		arg0.method7861();
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ILclient!kd;I)V")
	private void method6362(@OriginalArg(0) int arg0, @OriginalArg(1) Class57_Sub3 arg1) {
		Static655.aFloat206 = arg1.aFloat171;
		arg1.method7817((float) arg0);
		arg1.method7801();
		arg1.method7742(false);
		arg1.method7821(false);
		arg1.method7861();
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(ILclient!kd;)V")
	public void method6363(@OriginalArg(1) Class57_Sub3 arg0) {
		this.anInterface25_11.method2907(24, 786336);
	}
}
