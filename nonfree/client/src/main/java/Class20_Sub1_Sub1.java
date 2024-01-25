import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jp")
public final class Class20_Sub1_Sub1 extends Class20_Sub1 {

	@OriginalMember(owner = "client!jp", name = "lc", descriptor = "Lclient!lca;")
	private Class188 aClass188_2;

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(Lclient!lea;)V")
	public Class20_Sub1_Sub1(@OriginalArg(0) Class14_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(Lclient!lea;Lclient!nj;IIII)V")
	public Class20_Sub1_Sub1(@OriginalArg(0) Class14_Sub1 arg0, @OriginalArg(1) Class220 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)V")
	@Override
	protected void method7292(@OriginalArg(0) int arg0) {
		this.aClass188_2.aBoolean376 = (arg0 & 0x1) == 0;
		this.aClass188_2.aBoolean377 = false;
	}

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "(I)V")
	private void method4193(@OriginalArg(0) int arg0) {
		@Pc(4) short local4 = super.aShortArray140[arg0];
		@Pc(9) short local9 = super.aShortArray138[arg0];
		@Pc(14) short local14 = super.aShortArray137[arg0];
		this.aClass188_2.aBoolean378 = super.aBooleanArray39[arg0];
		if (super.lb == null) {
			this.aClass188_2.anInt5283 = 0;
		} else {
			this.aClass188_2.anInt5283 = super.lb[arg0] & 0xFF;
		}
		if (super.aShortArray143 != null && super.aShortArray143[arg0] != -1) {
			@Pc(180) int local180;
			@Pc(185) int local185;
			@Pc(190) int local190;
			if (super.aByteArray112 == null || super.aByteArray112[arg0] == -1) {
				local180 = local4;
				local185 = local9;
				local190 = local14;
			} else {
				@Pc(175) int local175 = super.aByteArray112[arg0] & 0xFF;
				local180 = super.anIntArray660[local175];
				local185 = super.anIntArray683[local175];
				local190 = super.anIntArray672[local175];
			}
			if (super.anIntArray651[arg0] == -1) {
				this.aClass188_2.method4571(super.anIntArray667[local4], super.anIntArray667[local9], super.anIntArray667[local14], super.anIntArray675[local4], super.anIntArray675[local9], super.anIntArray675[local14], super.anIntArray680[local4], super.anIntArray680[local9], super.anIntArray680[local14], super.anIntArray652[arg0], super.anIntArray652[arg0], super.anIntArray652[arg0], super.anIntArray687[local180], super.anIntArray687[local185], super.anIntArray687[local190], super.anIntArray664[local180], super.anIntArray664[local185], super.anIntArray664[local190], super.anIntArray659[local180], super.anIntArray659[local185], super.anIntArray659[local190], super.aShortArray143[arg0]);
			} else {
				this.aClass188_2.method4571(super.anIntArray667[local4], super.anIntArray667[local9], super.anIntArray667[local14], super.anIntArray675[local4], super.anIntArray675[local9], super.anIntArray675[local14], super.anIntArray680[local4], super.anIntArray680[local9], super.anIntArray680[local14], super.anIntArray652[arg0], super.anIntArray668[arg0], super.anIntArray651[arg0], super.anIntArray687[local180], super.anIntArray687[local185], super.anIntArray687[local190], super.anIntArray664[local180], super.anIntArray664[local185], super.anIntArray664[local190], super.anIntArray659[local180], super.anIntArray659[local185], super.anIntArray659[local190], super.aShortArray143[arg0]);
			}
		} else if (super.anIntArray651[arg0] == -1) {
			this.aClass188_2.method4567(super.anIntArray667[local4], super.anIntArray667[local9], super.anIntArray667[local14], super.anIntArray675[local4], super.anIntArray675[local9], super.anIntArray675[local14], super.anIntArray680[local4], super.anIntArray680[local9], super.anIntArray680[local14], Static50.anIntArray51[super.anIntArray652[arg0] & 0xFFFF]);
		} else {
			this.aClass188_2.method4568(super.anIntArray667[local4], super.anIntArray667[local9], super.anIntArray667[local14], super.anIntArray675[local4], super.anIntArray675[local9], super.anIntArray675[local14], super.anIntArray680[local4], super.anIntArray680[local9], super.anIntArray680[local14], super.anIntArray652[arg0] & 0xFFFF, super.anIntArray668[arg0] & 0xFFFF, super.anIntArray651[arg0] & 0xFFFF);
		}
	}

	@OriginalMember(owner = "client!jp", name = "d", descriptor = "(I)V")
	private void method4194(@OriginalArg(0) int arg0) {
		@Pc(8) short local8;
		@Pc(13) short local13;
		@Pc(18) short local18;
		@Pc(27) int local27;
		@Pc(46) int local46;
		@Pc(65) int local65;
		@Pc(81) int local81;
		@Pc(333) int local333;
		@Pc(338) int local338;
		@Pc(343) int local343;
		if (!super.aClass14_Sub1_15.aBoolean409) {
			local8 = super.aShortArray140[arg0];
			local13 = super.aShortArray138[arg0];
			local18 = super.aShortArray137[arg0];
			local27 = super.anIntArray680[local8] - super.aClass14_Sub1_15.anInt5845;
			if (local27 > 255) {
				local27 = 255;
			} else if (local27 < 0) {
				local27 = 0;
			}
			local46 = super.anIntArray680[local13] - super.aClass14_Sub1_15.anInt5845;
			if (local46 > 255) {
				local46 = 255;
			} else if (local46 < 0) {
				local46 = 0;
			}
			local65 = super.anIntArray680[local18] - super.aClass14_Sub1_15.anInt5845;
			if (local65 > 255) {
				local65 = 255;
			} else if (local65 < 0) {
				local65 = 0;
			}
			local81 = local27 + local46 + local65;
			if (local81 != 765) {
				if (local81 == 0) {
					this.method4193(arg0);
				} else {
					if (super.lb == null) {
						this.aClass188_2.anInt5283 = 0;
					} else {
						this.aClass188_2.anInt5283 = super.lb[arg0] & 0xFF;
					}
					this.aClass188_2.aBoolean378 = super.aBooleanArray39[arg0];
					if (super.aShortArray143 != null && super.aShortArray143[arg0] != -1) {
						if (super.aByteArray112 == null || super.aByteArray112[arg0] == -1) {
							local333 = local8;
							local338 = local13;
							local343 = local18;
						} else {
							@Pc(328) int local328 = super.aByteArray112[arg0] & 0xFF;
							local333 = super.anIntArray660[local328];
							local338 = super.anIntArray683[local328];
							local343 = super.anIntArray672[local328];
						}
						if (super.anIntArray651[arg0] == -1) {
							this.aClass188_2.method4572(super.anIntArray667[local8], super.anIntArray667[local13], super.anIntArray667[local18], super.anIntArray675[local8], super.anIntArray675[local13], super.anIntArray675[local18], super.anIntArray680[local8], super.anIntArray680[local13], super.anIntArray680[local18], super.aClass14_Sub1_15.anInt5842, local27, local46, local65, super.anIntArray652[arg0], super.anIntArray652[arg0], super.anIntArray652[arg0], super.anIntArray687[local333], super.anIntArray687[local338], super.anIntArray687[local343], super.anIntArray664[local333], super.anIntArray664[local338], super.anIntArray664[local343], super.anIntArray659[local333], super.anIntArray659[local338], super.anIntArray659[local343], super.aShortArray143[arg0]);
						} else {
							this.aClass188_2.method4572(super.anIntArray667[local8], super.anIntArray667[local13], super.anIntArray667[local18], super.anIntArray675[local8], super.anIntArray675[local13], super.anIntArray675[local18], super.anIntArray680[local8], super.anIntArray680[local13], super.anIntArray680[local18], super.aClass14_Sub1_15.anInt5842, local27, local46, local65, super.anIntArray652[arg0], super.anIntArray668[arg0], super.anIntArray651[arg0], super.anIntArray687[local333], super.anIntArray687[local338], super.anIntArray687[local343], super.anIntArray664[local333], super.anIntArray664[local338], super.anIntArray664[local343], super.anIntArray659[local333], super.anIntArray659[local338], super.anIntArray659[local343], super.aShortArray143[arg0]);
						}
					} else if (super.anIntArray651[arg0] == -1) {
						this.aClass188_2.method4585(super.anIntArray667[local8], super.anIntArray667[local13], super.anIntArray667[local18], super.anIntArray675[local8], super.anIntArray675[local13], super.anIntArray675[local18], super.anIntArray680[local8], super.anIntArray680[local13], super.anIntArray680[local18], Static412.method5964(local27 << 24 | super.aClass14_Sub1_15.anInt5842, Static50.anIntArray51[super.anIntArray652[arg0] & 0xFFFF]), Static412.method5964(local46 << 24 | super.aClass14_Sub1_15.anInt5842, Static50.anIntArray51[super.anIntArray652[arg0] & 0xFFFF]), Static412.method5964(local65 << 24 | super.aClass14_Sub1_15.anInt5842, Static50.anIntArray51[super.anIntArray652[arg0] & 0xFFFF]));
					} else {
						this.aClass188_2.method4585(super.anIntArray667[local8], super.anIntArray667[local13], super.anIntArray667[local18], super.anIntArray675[local8], super.anIntArray675[local13], super.anIntArray675[local18], super.anIntArray680[local8], super.anIntArray680[local13], super.anIntArray680[local18], Static412.method5964(local27 << 24 | super.aClass14_Sub1_15.anInt5842, Static50.anIntArray51[super.anIntArray652[arg0] & 0xFFFF]), Static412.method5964(local46 << 24 | super.aClass14_Sub1_15.anInt5842, Static50.anIntArray51[super.anIntArray668[arg0] & 0xFFFF]), Static412.method5964(local65 << 24 | super.aClass14_Sub1_15.anInt5842, Static50.anIntArray51[super.anIntArray651[arg0] & 0xFFFF]));
					}
				}
			}
		} else if (!super.aBooleanArray38[arg0]) {
			local8 = super.aShortArray140[arg0];
			local13 = super.aShortArray138[arg0];
			local18 = super.aShortArray137[arg0];
			local27 = 0;
			local46 = 0;
			local65 = 0;
			if (super.anIntArray662[local8] > super.aClass14_Sub1_15.anInt5828) {
				local27 = 255;
			} else if (super.anIntArray662[local8] > super.aClass14_Sub1_15.anInt5819) {
				local27 = (super.aClass14_Sub1_15.anInt5819 - super.anIntArray662[local8]) * 255 / (super.aClass14_Sub1_15.anInt5819 - super.aClass14_Sub1_15.anInt5828);
			}
			if (super.anIntArray662[local13] > super.aClass14_Sub1_15.anInt5828) {
				local46 = 255;
			} else if (super.anIntArray662[local13] > super.aClass14_Sub1_15.anInt5819) {
				local46 = (super.aClass14_Sub1_15.anInt5819 - super.anIntArray662[local13]) * 255 / (super.aClass14_Sub1_15.anInt5819 - super.aClass14_Sub1_15.anInt5828);
			}
			if (super.anIntArray662[local18] > super.aClass14_Sub1_15.anInt5828) {
				local65 = 255;
			} else if (super.anIntArray662[local18] > super.aClass14_Sub1_15.anInt5819) {
				local65 = (super.aClass14_Sub1_15.anInt5819 - super.anIntArray662[local18]) * 255 / (super.aClass14_Sub1_15.anInt5819 - super.aClass14_Sub1_15.anInt5828);
			}
			if (super.lb == null) {
				this.aClass188_2.anInt5283 = 0;
			} else {
				this.aClass188_2.anInt5283 = super.lb[arg0] & 0xFF;
			}
			this.aClass188_2.aBoolean378 = super.aBooleanArray39[arg0];
			if (super.aShortArray143 != null && super.aShortArray143[arg0] != -1) {
				if (super.aByteArray112 == null || super.aByteArray112[arg0] == -1) {
					local81 = local8;
					local333 = local13;
					local338 = local18;
				} else {
					local343 = super.aByteArray112[arg0] & 0xFF;
					local81 = super.anIntArray660[local343];
					local333 = super.anIntArray683[local343];
					local338 = super.anIntArray672[local343];
				}
				if (super.anIntArray651[arg0] == -1) {
					this.aClass188_2.method4572(super.anIntArray667[local8], super.anIntArray667[local13], super.anIntArray667[local18], super.anIntArray675[local8], super.anIntArray675[local13], super.anIntArray675[local18], super.anIntArray680[local8], super.anIntArray680[local13], super.anIntArray680[local18], super.aClass14_Sub1_15.anInt5842, local27, local46, local65, super.anIntArray652[arg0], super.anIntArray652[arg0], super.anIntArray652[arg0], super.anIntArray687[local81], super.anIntArray687[local333], super.anIntArray687[local338], super.anIntArray664[local81], super.anIntArray664[local333], super.anIntArray664[local338], super.anIntArray659[local81], super.anIntArray659[local333], super.anIntArray659[local338], super.aShortArray143[arg0]);
				} else {
					this.aClass188_2.method4572(super.anIntArray667[local8], super.anIntArray667[local13], super.anIntArray667[local18], super.anIntArray675[local8], super.anIntArray675[local13], super.anIntArray675[local18], super.anIntArray680[local8], super.anIntArray680[local13], super.anIntArray680[local18], super.aClass14_Sub1_15.anInt5842, local27, local46, local65, super.anIntArray652[arg0], super.anIntArray668[arg0], super.anIntArray651[arg0], super.anIntArray687[local81], super.anIntArray687[local333], super.anIntArray687[local338], super.anIntArray664[local81], super.anIntArray664[local333], super.anIntArray664[local338], super.anIntArray659[local81], super.anIntArray659[local333], super.anIntArray659[local338], super.aShortArray143[arg0]);
				}
			} else if (super.anIntArray651[arg0] == -1) {
				this.aClass188_2.method4585(super.anIntArray667[local8], super.anIntArray667[local13], super.anIntArray667[local18], super.anIntArray675[local8], super.anIntArray675[local13], super.anIntArray675[local18], super.anIntArray680[local8], super.anIntArray680[local13], super.anIntArray680[local18], Static412.method5964(local27 << 24 | super.aClass14_Sub1_15.anInt5842, Static50.anIntArray51[super.anIntArray652[arg0] & 0xFFFF]), Static412.method5964(local46 << 24 | super.aClass14_Sub1_15.anInt5842, Static50.anIntArray51[super.anIntArray652[arg0] & 0xFFFF]), Static412.method5964(local65 << 24 | super.aClass14_Sub1_15.anInt5842, Static50.anIntArray51[super.anIntArray652[arg0] & 0xFFFF]));
			} else {
				this.aClass188_2.method4585(super.anIntArray667[local8], super.anIntArray667[local13], super.anIntArray667[local18], super.anIntArray675[local8], super.anIntArray675[local13], super.anIntArray675[local18], super.anIntArray680[local8], super.anIntArray680[local13], super.anIntArray680[local18], Static412.method5964(local27 << 24 | super.aClass14_Sub1_15.anInt5842, Static50.anIntArray51[super.anIntArray652[arg0] & 0xFFFF]), Static412.method5964(local46 << 24 | super.aClass14_Sub1_15.anInt5842, Static50.anIntArray51[super.anIntArray668[arg0] & 0xFFFF]), Static412.method5964(local65 << 24 | super.aClass14_Sub1_15.anInt5842, Static50.anIntArray51[super.anIntArray651[arg0] & 0xFFFF]));
			}
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(ZZIIZI)V")
	@Override
	protected void method7283(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(4) int local4;
		if (super.aClass157Array3 != null) {
			local4 = 0;
			while (local4 < super.anInt8866) {
				@Pc(10) Class157 local10 = super.aClass157Array3[local4];
				super.anIntArray666[local10.anInt4740] = local4++;
			}
		}
		for (local4 = 0; local4 < super.anInt8879; local4++) {
			if (super.lb == null || super.lb[local4] == 0) {
				this.method4195(local4, arg0, arg1);
			}
		}
		@Pc(50) int local50;
		if (super.aBoolean643) {
			if (super.aByteArray113 == null) {
				for (local50 = 0; local50 < super.anInt8879; local50++) {
					if (super.lb == null || super.lb[local50] != 0) {
						this.method4195(local50, arg0, arg1);
					}
				}
			} else {
				for (local50 = 0; local50 < 12; local50++) {
					for (@Pc(75) int local75 = 0; local75 < super.anInt8879; local75++) {
						if ((super.lb == null || super.lb[local75] != 0) && super.aByteArray113[local75] == local50) {
							this.method4195(local75, arg0, arg1);
						}
					}
				}
			}
		}
		if (!arg4) {
			return;
		}
		for (local50 = 0; local50 < arg5; local50++) {
			@Pc(114) Class98_Sub1_Sub1 local114 = super.aClass98_Sub1_Sub1Array6[local50];
			@Pc(119) int local119 = super.anIntArray658[local50];
			if (local119 == 0) {
				local119 = 1;
			}
			super.aClass14_Sub1_15.method5059(local114, super.anIntArray681[local50], super.anIntArray677[local50], local119, (local114.anInt9516 * super.aClass14_Sub1_15.anInt5818 >> 12) / local119);
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(BIZ)Lclient!ba;")
	@Override
	public Class20 method7264(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.method7285(Thread.currentThread());
		@Pc(11) Class20_Sub1 local11;
		@Pc(8) Class20_Sub1 local8;
		if (arg0 == 1) {
			local8 = super.aClass20_Sub1_58;
			local11 = super.aClass20_Sub1_57;
		} else if (arg0 == 2) {
			local8 = super.aClass20_Sub1_51;
			local11 = super.aClass20_Sub1_59;
		} else if (arg0 == 3) {
			local8 = super.aClass20_Sub1_54;
			local11 = super.aClass20_Sub1_53;
		} else if (arg0 == 4) {
			local8 = super.aClass20_Sub1_56;
			local11 = super.aClass20_Sub1_52;
		} else if (arg0 == 5) {
			local8 = super.aClass20_Sub1_60;
			local11 = super.aClass20_Sub1_55;
		} else {
			local11 = local8 = new Class20_Sub1_Sub1(super.aClass14_Sub1_15);
		}
		return this.method7290(local11, local8, arg1, arg0 != 0, arg2);
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Ljava/lang/Thread;)V")
	@Override
	protected void method7279(@OriginalArg(0) Thread arg0) {
		super.method7279(arg0);
		@Pc(8) Class44_Sub1 local8 = (Class44_Sub1) super.aClass14_Sub1_15.method5048(arg0);
		this.aClass188_2 = local8.aClass188_1;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IZZ)V")
	private void method4195(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (super.anIntArray651[arg0] == -2) {
			return;
		}
		@Pc(11) short local11 = super.aShortArray140[arg0];
		@Pc(16) short local16 = super.aShortArray138[arg0];
		@Pc(21) short local21 = super.aShortArray137[arg0];
		@Pc(26) int local26 = super.anIntArray675[local11];
		@Pc(31) int local31 = super.anIntArray675[local16];
		@Pc(36) int local36 = super.anIntArray675[local21];
		@Pc(52) int local52;
		if (arg1 && (local26 == -5000 || local31 == -5000 || local36 == -5000)) {
			local52 = super.anIntArray687[local11];
			@Pc(57) int local57 = super.anIntArray687[local16];
			@Pc(62) int local62 = super.anIntArray687[local21];
			@Pc(67) int local67 = super.anIntArray664[local11];
			@Pc(72) int local72 = super.anIntArray664[local16];
			@Pc(77) int local77 = super.anIntArray664[local21];
			@Pc(82) int local82 = super.anIntArray659[local11];
			@Pc(87) int local87 = super.anIntArray659[local16];
			@Pc(92) int local92 = super.anIntArray659[local21];
			@Pc(96) int local96 = local52 - local57;
			@Pc(100) int local100 = local62 - local57;
			@Pc(104) int local104 = local67 - local72;
			@Pc(108) int local108 = local77 - local72;
			@Pc(112) int local112 = local82 - local87;
			@Pc(116) int local116 = local92 - local87;
			@Pc(124) int local124 = local104 * local116 - local112 * local108;
			@Pc(132) int local132 = local112 * local100 - local96 * local116;
			@Pc(140) int local140 = local96 * local108 - local104 * local100;
			if (local57 * local124 + local72 * local132 + local87 * local140 > 0) {
				this.method4196(arg0);
				return;
			}
		} else if (super.anIntArray666[arg0] != -1 || (local26 - local31) * (super.anIntArray667[local21] - super.anIntArray667[local16]) - (super.anIntArray667[local11] - super.anIntArray667[local16]) * (local36 - local31) > 0) {
			if (local26 >= 0 && local31 >= 0 && local36 >= 0 && local26 <= super.aClass44_6.anInt8343 && local31 <= super.aClass44_6.anInt8343 && local36 <= super.aClass44_6.anInt8343) {
				super.aBooleanArray39[arg0] = false;
			} else {
				super.aBooleanArray39[arg0] = true;
			}
			if (arg2) {
				local52 = super.anIntArray666[arg0];
				if (local52 == -1 || !super.aClass157Array3[local52].aBoolean324) {
					this.method4194(arg0);
				}
				return;
			}
			local52 = super.anIntArray666[arg0];
			if (local52 != -1) {
				@Pc(255) Class157 local255 = super.aClass157Array3[local52];
				@Pc(260) Class133 local260 = super.aClass133Array3[local52];
				if (!local255.aBoolean324) {
					this.method4193(arg0);
				}
				super.aClass14_Sub1_15.method5054(local260.anInt3877, local260.anInt3881, local260.anInt3880, local260.anInt3876, local260.anInt3870, local260.anInt3873, local255.aShort43 & 0xFFFF, local260.anInt3871, local255.aByte38, local255.aByte39);
				return;
			}
			this.method4193(arg0);
		}
	}

	@OriginalMember(owner = "client!jp", name = "e", descriptor = "(I)V")
	private void method4196(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = super.aClass14_Sub1_15.anInt5826;
		@Pc(10) short local10 = super.aShortArray140[arg0];
		@Pc(15) short local15 = super.aShortArray138[arg0];
		@Pc(20) short local20 = super.aShortArray137[arg0];
		@Pc(25) int local25 = super.anIntArray659[local10];
		@Pc(30) int local30 = super.anIntArray659[local15];
		@Pc(35) int local35 = super.anIntArray659[local20];
		if (super.lb == null) {
			this.aClass188_2.anInt5283 = 0;
		} else {
			this.aClass188_2.anInt5283 = super.lb[arg0] & 0xFF;
		}
		@Pc(96) int local96;
		@Pc(101) int local101;
		@Pc(108) int local108;
		@Pc(121) int local121;
		if (local25 >= local5) {
			super.anIntArray656[0] = super.anIntArray675[local10];
			super.anIntArray661[0] = super.anIntArray667[local10];
			super.anIntArray684[0] = super.anIntArray680[local10];
			local1++;
			super.anIntArray670[0] = super.anIntArray652[arg0] & 0xFFFF;
		} else {
			local96 = super.anIntArray687[local10];
			local101 = super.anIntArray664[local10];
			local108 = super.anIntArray652[arg0] & 0xFFFF;
			if (local35 >= local5) {
				local121 = (local5 - local25) * Class20_Sub1.anIntArray686[local35 - local25];
				super.anIntArray656[0] = super.aClass44_6.anInt8342 + (local96 + ((super.anIntArray687[local20] - local96) * local121 >> 16)) * super.aClass14_Sub1_15.anInt5818 / local5;
				super.anIntArray661[0] = super.aClass44_6.anInt8341 + (local101 + ((super.anIntArray664[local20] - local101) * local121 >> 16)) * super.aClass14_Sub1_15.anInt5835 / local5;
				super.anIntArray684[0] = local5;
				local1++;
				super.anIntArray670[0] = local108 + (((super.anIntArray651[arg0] & 0xFFFF) - local108) * local121 >> 16);
			}
			if (local30 >= local5) {
				local121 = (local5 - local25) * Class20_Sub1.anIntArray686[local30 - local25];
				super.anIntArray656[local1] = super.aClass44_6.anInt8342 + (local96 + ((super.anIntArray687[local15] - local96) * local121 >> 16)) * super.aClass14_Sub1_15.anInt5818 / local5;
				super.anIntArray661[local1] = super.aClass44_6.anInt8341 + (local101 + ((super.anIntArray664[local15] - local101) * local121 >> 16)) * super.aClass14_Sub1_15.anInt5835 / local5;
				super.anIntArray684[local1] = local5;
				super.anIntArray670[local1++] = local108 + (((super.anIntArray668[arg0] & 0xFFFF) - local108) * local121 >> 16);
			}
		}
		if (local30 >= local5) {
			super.anIntArray656[local1] = super.anIntArray675[local15];
			super.anIntArray661[local1] = super.anIntArray667[local15];
			super.anIntArray684[local1] = super.anIntArray680[local15];
			super.anIntArray670[local1++] = super.anIntArray668[arg0] & 0xFFFF;
		} else {
			local96 = super.anIntArray687[local15];
			local101 = super.anIntArray664[local15];
			local108 = super.anIntArray668[arg0] & 0xFFFF;
			if (local25 >= local5) {
				local121 = (local5 - local30) * Class20_Sub1.anIntArray686[local25 - local30];
				super.anIntArray656[local1] = super.aClass44_6.anInt8342 + (local96 + ((super.anIntArray687[local10] - local96) * local121 >> 16)) * super.aClass14_Sub1_15.anInt5818 / local5;
				super.anIntArray661[local1] = super.aClass44_6.anInt8341 + (local101 + ((super.anIntArray664[local10] - local101) * local121 >> 16)) * super.aClass14_Sub1_15.anInt5835 / local5;
				super.anIntArray684[local1] = local5;
				super.anIntArray670[local1++] = local108 + (((super.anIntArray652[arg0] & 0xFFFF) - local108) * local121 >> 16);
			}
			if (local35 >= local5) {
				local121 = (local5 - local30) * Class20_Sub1.anIntArray686[local35 - local30];
				super.anIntArray656[local1] = super.aClass44_6.anInt8342 + (local96 + ((super.anIntArray687[local20] - local96) * local121 >> 16)) * super.aClass14_Sub1_15.anInt5818 / local5;
				super.anIntArray661[local1] = super.aClass44_6.anInt8341 + (local101 + ((super.anIntArray664[local20] - local101) * local121 >> 16)) * super.aClass14_Sub1_15.anInt5835 / local5;
				super.anIntArray684[local1] = local5;
				super.anIntArray670[local1++] = local108 + (((super.anIntArray651[arg0] & 0xFFFF) - local108) * local121 >> 16);
			}
		}
		if (local35 >= local5) {
			super.anIntArray656[local1] = super.anIntArray675[local20];
			super.anIntArray661[local1] = super.anIntArray667[local20];
			super.anIntArray684[local1] = super.anIntArray680[local20];
			super.anIntArray670[local1++] = super.anIntArray651[arg0] & 0xFFFF;
		} else {
			local96 = super.anIntArray687[local20];
			local101 = super.anIntArray664[local20];
			local108 = super.anIntArray651[arg0] & 0xFFFF;
			if (local30 >= local5) {
				local121 = (local5 - local35) * Class20_Sub1.anIntArray686[local30 - local35];
				super.anIntArray656[local1] = super.aClass44_6.anInt8342 + (local96 + ((super.anIntArray687[local15] - local96) * local121 >> 16)) * super.aClass14_Sub1_15.anInt5818 / local5;
				super.anIntArray661[local1] = super.aClass44_6.anInt8341 + (local101 + ((super.anIntArray664[local15] - local101) * local121 >> 16)) * super.aClass14_Sub1_15.anInt5835 / local5;
				super.anIntArray684[local1] = local5;
				super.anIntArray670[local1++] = local108 + (((super.anIntArray668[arg0] & 0xFFFF) - local108) * local121 >> 16);
			}
			if (local25 >= local5) {
				local121 = (local5 - local35) * Class20_Sub1.anIntArray686[local25 - local35];
				super.anIntArray656[local1] = super.aClass44_6.anInt8342 + (local96 + ((super.anIntArray687[local10] - local96) * local121 >> 16)) * super.aClass14_Sub1_15.anInt5818 / local5;
				super.anIntArray661[local1] = super.aClass44_6.anInt8341 + (local101 + ((super.anIntArray664[local10] - local101) * local121 >> 16)) * super.aClass14_Sub1_15.anInt5835 / local5;
				super.anIntArray684[local1] = local5;
				super.anIntArray670[local1++] = local108 + (((super.anIntArray652[arg0] & 0xFFFF) - local108) * local121 >> 16);
			}
		}
		local96 = super.anIntArray656[0];
		local101 = super.anIntArray656[1];
		local108 = super.anIntArray656[2];
		local121 = super.anIntArray661[0];
		@Pc(779) int local779 = super.anIntArray661[1];
		@Pc(784) int local784 = super.anIntArray661[2];
		local25 = super.anIntArray684[0];
		local30 = super.anIntArray684[1];
		local35 = super.anIntArray684[2];
		this.aClass188_2.aBoolean378 = false;
		@Pc(913) int local913;
		@Pc(918) int local918;
		@Pc(923) int local923;
		@Pc(908) int local908;
		if (local1 == 3) {
			if (local96 < 0 || local101 < 0 || local108 < 0 || local96 > super.aClass44_6.anInt8343 || local101 > super.aClass44_6.anInt8343 || local108 > super.aClass44_6.anInt8343) {
				this.aClass188_2.aBoolean378 = true;
			}
			if (super.aShortArray143 != null && super.aShortArray143[arg0] != -1) {
				if (super.aByteArray112 == null || super.aByteArray112[arg0] == -1) {
					local913 = local10;
					local918 = local15;
					local923 = local20;
				} else {
					local908 = super.aByteArray112[arg0] & 0xFF;
					local913 = super.anIntArray660[local908];
					local918 = super.anIntArray683[local908];
					local923 = super.anIntArray672[local908];
				}
				if (super.anIntArray651[arg0] == -1) {
					this.aClass188_2.method4571(local121, local779, local784, local96, local101, local108, local25, local30, local35, super.anIntArray652[arg0], super.anIntArray652[arg0], super.anIntArray652[arg0], super.anIntArray687[local913], super.anIntArray687[local918], super.anIntArray687[local923], super.anIntArray664[local913], super.anIntArray664[local918], super.anIntArray664[local923], super.anIntArray659[local913], super.anIntArray659[local918], super.anIntArray659[local923], super.aShortArray143[arg0]);
				} else {
					this.aClass188_2.method4571(local121, local779, local784, local96, local101, local108, local25, local30, local35, super.anIntArray670[0], super.anIntArray670[1], super.anIntArray670[2], super.anIntArray687[local913], super.anIntArray687[local918], super.anIntArray687[local923], super.anIntArray664[local913], super.anIntArray664[local918], super.anIntArray664[local923], super.anIntArray659[local913], super.anIntArray659[local918], super.anIntArray659[local923], super.aShortArray143[arg0]);
				}
			} else if (super.anIntArray651[arg0] == -1) {
				this.aClass188_2.method4567(local121, local779, local784, local96, local101, local108, local25, local30, local35, Static50.anIntArray51[super.anIntArray652[arg0] & 0xFFFF]);
			} else {
				this.aClass188_2.method4568(local121, local779, local784, local96, local101, local108, local25, local30, local35, super.anIntArray670[0], super.anIntArray670[1], super.anIntArray670[2]);
			}
		}
		if (local1 != 4) {
			return;
		}
		if (local96 < 0 || local101 < 0 || local108 < 0 || local96 > super.aClass44_6.anInt8343 || local101 > super.aClass44_6.anInt8343 || local108 > super.aClass44_6.anInt8343 || super.anIntArray656[3] < 0 || super.anIntArray656[3] > super.aClass44_6.anInt8343) {
			this.aClass188_2.aBoolean378 = true;
		}
		if (super.aShortArray143 == null || super.aShortArray143[arg0] == -1) {
			if (super.anIntArray651[arg0] == -1) {
				local913 = Static50.anIntArray51[super.anIntArray652[arg0] & 0xFFFF];
				this.aClass188_2.method4567(local121, local779, local784, local96, local101, local108, local25, local30, local35, local913);
				this.aClass188_2.method4567(local121, local784, super.anIntArray661[3], local96, local108, super.anIntArray656[3], local25, local30, super.anIntArray684[3], local913);
				return;
			}
			this.aClass188_2.method4568(local121, local779, local784, local96, local101, local108, local25, local30, local35, super.anIntArray670[0], super.anIntArray670[1], super.anIntArray670[2]);
			this.aClass188_2.method4568(local121, local784, super.anIntArray661[3], local96, local108, super.anIntArray656[3], local25, local30, super.anIntArray684[3], super.anIntArray670[0], super.anIntArray670[2], super.anIntArray670[3]);
			return;
		}
		if (super.aByteArray112 == null || super.aByteArray112[arg0] == -1) {
			local913 = local10;
			local918 = local15;
			local923 = local20;
		} else {
			local908 = super.aByteArray112[arg0] & 0xFF;
			local913 = super.anIntArray660[local908];
			local918 = super.anIntArray683[local908];
			local923 = super.anIntArray672[local908];
		}
		@Pc(1267) short local1267 = super.aShortArray143[arg0];
		if (super.anIntArray651[arg0] == -1) {
			this.aClass188_2.method4571(local121, local779, local784, local96, local101, local108, local25, local30, local35, super.anIntArray652[arg0], super.anIntArray652[arg0], super.anIntArray652[arg0], super.anIntArray687[local913], super.anIntArray687[local918], super.anIntArray687[local923], super.anIntArray664[local913], super.anIntArray664[local918], super.anIntArray664[local923], super.anIntArray659[local913], super.anIntArray659[local918], super.anIntArray659[local923], local1267);
			this.aClass188_2.method4571(local121, local784, super.anIntArray661[3], local96, local108, super.anIntArray656[3], local25, local30, super.anIntArray684[3], super.anIntArray652[arg0], super.anIntArray652[arg0], super.anIntArray652[arg0], super.anIntArray687[local913], super.anIntArray687[local918], super.anIntArray687[local923], super.anIntArray664[local913], super.anIntArray664[local918], super.anIntArray664[local923], super.anIntArray659[local913], super.anIntArray659[local918], super.anIntArray659[local923], local1267);
			return;
		}
		this.aClass188_2.method4571(local121, local779, local784, local96, local101, local108, local25, local30, local35, super.anIntArray670[0], super.anIntArray670[1], super.anIntArray670[2], super.anIntArray687[local913], super.anIntArray687[local918], super.anIntArray687[local923], super.anIntArray664[local913], super.anIntArray664[local918], super.anIntArray664[local923], super.anIntArray659[local913], super.anIntArray659[local918], super.anIntArray659[local923], local1267);
		this.aClass188_2.method4571(local121, local784, super.anIntArray661[3], local96, local108, super.anIntArray656[3], local25, local30, super.anIntArray684[3], super.anIntArray670[0], super.anIntArray670[2], super.anIntArray670[3], super.anIntArray687[local913], super.anIntArray687[local918], super.anIntArray687[local923], super.anIntArray664[local913], super.anIntArray664[local918], super.anIntArray664[local923], super.anIntArray659[local913], super.anIntArray659[local918], super.anIntArray659[local923], local1267);
	}

	@OriginalMember(owner = "client!jp", name = "j", descriptor = "()V")
	@Override
	protected void method7278() {
		super.aClass44_6.anInt8343 = this.aClass188_2.anInt5281;
		super.aClass44_6.anInt8342 = this.aClass188_2.anInt5285;
		super.aClass44_6.anInt8341 = this.aClass188_2.anInt5282;
	}

	@OriginalMember(owner = "client!jp", name = "l", descriptor = "()V")
	@Override
	protected void method7281() {
		this.aClass188_2 = null;
	}
}
