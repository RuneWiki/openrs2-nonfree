import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lo")
public final class Class21_Sub1_Sub1 extends Class21_Sub1 {

	@OriginalMember(owner = "client!lo", name = "tc", descriptor = "Lclient!lr;")
	private Class204 aClass204_2;

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lclient!ql;[Lclient!lo;)V")
	public Class21_Sub1_Sub1(@OriginalArg(0) Class15_Sub1 arg0, @OriginalArg(1) Class21_Sub1_Sub1[] arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lclient!ql;)V")
	public Class21_Sub1_Sub1(@OriginalArg(0) Class15_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lclient!ql;Lclient!fca;IIII)V")
	public Class21_Sub1_Sub1(@OriginalArg(0) Class15_Sub1 arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!lo", name = "f", descriptor = "(I)V")
	private void method5097(@OriginalArg(0) int arg0) {
		@Pc(8) short local8;
		@Pc(13) short local13;
		@Pc(18) short local18;
		@Pc(27) int local27;
		@Pc(46) int local46;
		@Pc(65) int local65;
		@Pc(81) int local81;
		@Pc(309) int local309;
		@Pc(314) int local314;
		@Pc(319) int local319;
		if (!super.aClass15_Sub1_17.aBoolean427) {
			local8 = super.aShortArray140[arg0];
			local13 = super.aShortArray138[arg0];
			local18 = super.aShortArray139[arg0];
			local27 = super.anIntArray554[local8] - super.aClass15_Sub1_17.anInt5027;
			if (local27 > 255) {
				local27 = 255;
			} else if (local27 < 0) {
				local27 = 0;
			}
			local46 = super.anIntArray554[local13] - super.aClass15_Sub1_17.anInt5027;
			if (local46 > 255) {
				local46 = 255;
			} else if (local46 < 0) {
				local46 = 0;
			}
			local65 = super.anIntArray554[local18] - super.aClass15_Sub1_17.anInt5027;
			if (local65 > 255) {
				local65 = 255;
			} else if (local65 < 0) {
				local65 = 0;
			}
			local81 = local27 + local46 + local65;
			if (local81 != 765) {
				if (local81 == 0) {
					this.method5098(arg0);
				} else {
					if (super.aByteArray96 == null) {
						this.aClass204_2.anInt6164 = 0;
					} else {
						this.aClass204_2.anInt6164 = super.aByteArray96[arg0] & 0xFF;
					}
					this.aClass204_2.aBoolean527 = super.aBooleanArray35[arg0];
					if (super.aShortArray137 != null && super.aShortArray137[arg0] != -1) {
						if (super.aByteArray95 == null || super.aByteArray95[arg0] == -1) {
							local309 = local8;
							local314 = local13;
							local319 = local18;
						} else {
							@Pc(304) int local304 = super.aByteArray95[arg0] & 0xFF;
							local309 = super.anIntArray537[local304];
							local314 = super.anIntArray556[local304];
							local319 = super.anIntArray549[local304];
						}
						if (super.anIntArray569[arg0] == -1) {
							this.aClass204_2.method5144(super.anIntArray543[local8], super.anIntArray543[local13], super.anIntArray543[local18], super.anIntArray557[local8], super.anIntArray557[local13], super.anIntArray557[local18], super.aClass15_Sub1_17.anInt5044, local27, local46, local65, super.anIntArray552[arg0], super.anIntArray552[arg0], super.anIntArray552[arg0], super.anIntArray562[local309], super.anIntArray562[local314], super.anIntArray562[local319], super.anIntArray567[local309], super.anIntArray567[local314], super.anIntArray567[local319], super.anIntArray533[local309], super.anIntArray533[local314], super.anIntArray533[local319], super.aShortArray137[arg0]);
						} else {
							this.aClass204_2.method5144(super.anIntArray543[local8], super.anIntArray543[local13], super.anIntArray543[local18], super.anIntArray557[local8], super.anIntArray557[local13], super.anIntArray557[local18], super.aClass15_Sub1_17.anInt5044, local27, local46, local65, super.anIntArray552[arg0], super.anIntArray560[arg0], super.anIntArray569[arg0], super.anIntArray562[local309], super.anIntArray562[local314], super.anIntArray562[local319], super.anIntArray567[local309], super.anIntArray567[local314], super.anIntArray567[local319], super.anIntArray533[local309], super.anIntArray533[local314], super.anIntArray533[local319], super.aShortArray137[arg0]);
						}
					} else if (super.anIntArray569[arg0] == -1) {
						this.aClass204_2.method5141(super.anIntArray543[local8], super.anIntArray543[local13], super.anIntArray543[local18], super.anIntArray557[local8], super.anIntArray557[local13], super.anIntArray557[local18], Static364.method6010(local27 << 24 | super.aClass15_Sub1_17.anInt5044, Static373.anIntArray469[super.anIntArray552[arg0] & 0xFFFF]), Static364.method6010(local46 << 24 | super.aClass15_Sub1_17.anInt5044, Static373.anIntArray469[super.anIntArray552[arg0] & 0xFFFF]), Static364.method6010(local65 << 24 | super.aClass15_Sub1_17.anInt5044, Static373.anIntArray469[super.anIntArray552[arg0] & 0xFFFF]));
					} else {
						this.aClass204_2.method5141(super.anIntArray543[local8], super.anIntArray543[local13], super.anIntArray543[local18], super.anIntArray557[local8], super.anIntArray557[local13], super.anIntArray557[local18], Static364.method6010(local27 << 24 | super.aClass15_Sub1_17.anInt5044, Static373.anIntArray469[super.anIntArray552[arg0] & 0xFFFF]), Static364.method6010(local46 << 24 | super.aClass15_Sub1_17.anInt5044, Static373.anIntArray469[super.anIntArray560[arg0] & 0xFFFF]), Static364.method6010(local65 << 24 | super.aClass15_Sub1_17.anInt5044, Static373.anIntArray469[super.anIntArray569[arg0] & 0xFFFF]));
					}
				}
			}
		} else if (!super.aBooleanArray34[arg0]) {
			local8 = super.aShortArray140[arg0];
			local13 = super.aShortArray138[arg0];
			local18 = super.aShortArray139[arg0];
			local27 = 0;
			local46 = 0;
			local65 = 0;
			if (super.anIntArray558[local8] > super.aClass15_Sub1_17.anInt5036) {
				local27 = 255;
			} else if (super.anIntArray558[local8] > super.aClass15_Sub1_17.anInt5029) {
				local27 = (super.aClass15_Sub1_17.anInt5029 - super.anIntArray558[local8]) * 255 / (super.aClass15_Sub1_17.anInt5029 - super.aClass15_Sub1_17.anInt5036);
			}
			if (super.anIntArray558[local13] > super.aClass15_Sub1_17.anInt5036) {
				local46 = 255;
			} else if (super.anIntArray558[local13] > super.aClass15_Sub1_17.anInt5029) {
				local46 = (super.aClass15_Sub1_17.anInt5029 - super.anIntArray558[local13]) * 255 / (super.aClass15_Sub1_17.anInt5029 - super.aClass15_Sub1_17.anInt5036);
			}
			if (super.anIntArray558[local18] > super.aClass15_Sub1_17.anInt5036) {
				local65 = 255;
			} else if (super.anIntArray558[local18] > super.aClass15_Sub1_17.anInt5029) {
				local65 = (super.aClass15_Sub1_17.anInt5029 - super.anIntArray558[local18]) * 255 / (super.aClass15_Sub1_17.anInt5029 - super.aClass15_Sub1_17.anInt5036);
			}
			if (super.aByteArray96 == null) {
				this.aClass204_2.anInt6164 = 0;
			} else {
				this.aClass204_2.anInt6164 = super.aByteArray96[arg0] & 0xFF;
			}
			this.aClass204_2.aBoolean527 = super.aBooleanArray35[arg0];
			if (super.aShortArray137 != null && super.aShortArray137[arg0] != -1) {
				if (super.aByteArray95 == null || super.aByteArray95[arg0] == -1) {
					local81 = local8;
					local309 = local13;
					local314 = local18;
				} else {
					local319 = super.aByteArray95[arg0] & 0xFF;
					local81 = super.anIntArray537[local319];
					local309 = super.anIntArray556[local319];
					local314 = super.anIntArray549[local319];
				}
				if (super.anIntArray569[arg0] == -1) {
					this.aClass204_2.method5144(super.anIntArray543[local8], super.anIntArray543[local13], super.anIntArray543[local18], super.anIntArray557[local8], super.anIntArray557[local13], super.anIntArray557[local18], super.aClass15_Sub1_17.anInt5044, local27, local46, local65, super.anIntArray552[arg0], super.anIntArray552[arg0], super.anIntArray552[arg0], super.anIntArray562[local81], super.anIntArray562[local309], super.anIntArray562[local314], super.anIntArray567[local81], super.anIntArray567[local309], super.anIntArray567[local314], super.anIntArray533[local81], super.anIntArray533[local309], super.anIntArray533[local314], super.aShortArray137[arg0]);
				} else {
					this.aClass204_2.method5144(super.anIntArray543[local8], super.anIntArray543[local13], super.anIntArray543[local18], super.anIntArray557[local8], super.anIntArray557[local13], super.anIntArray557[local18], super.aClass15_Sub1_17.anInt5044, local27, local46, local65, super.anIntArray552[arg0], super.anIntArray560[arg0], super.anIntArray569[arg0], super.anIntArray562[local81], super.anIntArray562[local309], super.anIntArray562[local314], super.anIntArray567[local81], super.anIntArray567[local309], super.anIntArray567[local314], super.anIntArray533[local81], super.anIntArray533[local309], super.anIntArray533[local314], super.aShortArray137[arg0]);
				}
			} else if (super.anIntArray569[arg0] == -1) {
				this.aClass204_2.method5141(super.anIntArray543[local8], super.anIntArray543[local13], super.anIntArray543[local18], super.anIntArray557[local8], super.anIntArray557[local13], super.anIntArray557[local18], Static364.method6010(local27 << 24 | super.aClass15_Sub1_17.anInt5044, Static373.anIntArray469[super.anIntArray552[arg0] & 0xFFFF]), Static364.method6010(local46 << 24 | super.aClass15_Sub1_17.anInt5044, Static373.anIntArray469[super.anIntArray552[arg0] & 0xFFFF]), Static364.method6010(local65 << 24 | super.aClass15_Sub1_17.anInt5044, Static373.anIntArray469[super.anIntArray552[arg0] & 0xFFFF]));
			} else {
				this.aClass204_2.method5141(super.anIntArray543[local8], super.anIntArray543[local13], super.anIntArray543[local18], super.anIntArray557[local8], super.anIntArray557[local13], super.anIntArray557[local18], Static364.method6010(local27 << 24 | super.aClass15_Sub1_17.anInt5044, Static373.anIntArray469[super.anIntArray552[arg0] & 0xFFFF]), Static364.method6010(local46 << 24 | super.aClass15_Sub1_17.anInt5044, Static373.anIntArray469[super.anIntArray560[arg0] & 0xFFFF]), Static364.method6010(local65 << 24 | super.aClass15_Sub1_17.anInt5044, Static373.anIntArray469[super.anIntArray569[arg0] & 0xFFFF]));
			}
		}
	}

	@OriginalMember(owner = "client!lo", name = "i", descriptor = "()V")
	@Override
	protected void method7155() {
		this.aClass204_2 = null;
	}

	@OriginalMember(owner = "client!lo", name = "g", descriptor = "(I)V")
	private void method5098(@OriginalArg(0) int arg0) {
		if (super.aBooleanArray34[arg0]) {
			this.method5100(arg0);
			return;
		}
		@Pc(13) short local13 = super.aShortArray140[arg0];
		@Pc(18) short local18 = super.aShortArray138[arg0];
		@Pc(23) short local23 = super.aShortArray139[arg0];
		this.aClass204_2.aBoolean527 = super.aBooleanArray35[arg0];
		if (super.aByteArray96 == null) {
			this.aClass204_2.anInt6164 = 0;
		} else {
			this.aClass204_2.anInt6164 = super.aByteArray96[arg0] & 0xFF;
		}
		if (super.aShortArray137 != null && super.aShortArray137[arg0] != -1) {
			@Pc(165) int local165;
			@Pc(170) int local170;
			@Pc(175) int local175;
			if (super.aByteArray95 == null || super.aByteArray95[arg0] == -1) {
				local165 = local13;
				local170 = local18;
				local175 = local23;
			} else {
				@Pc(160) int local160 = super.aByteArray95[arg0] & 0xFF;
				local165 = super.anIntArray537[local160];
				local170 = super.anIntArray556[local160];
				local175 = super.anIntArray549[local160];
			}
			if (super.anIntArray569[arg0] == -1) {
				this.aClass204_2.method5145(super.anIntArray543[local13], super.anIntArray543[local18], super.anIntArray543[local23], super.anIntArray557[local13], super.anIntArray557[local18], super.anIntArray557[local23], super.anIntArray552[arg0], super.anIntArray552[arg0], super.anIntArray552[arg0], super.anIntArray562[local165], super.anIntArray562[local170], super.anIntArray562[local175], super.anIntArray567[local165], super.anIntArray567[local170], super.anIntArray567[local175], super.anIntArray533[local165], super.anIntArray533[local170], super.anIntArray533[local175], super.aShortArray137[arg0]);
			} else {
				this.aClass204_2.method5145(super.anIntArray543[local13], super.anIntArray543[local18], super.anIntArray543[local23], super.anIntArray557[local13], super.anIntArray557[local18], super.anIntArray557[local23], super.anIntArray552[arg0], super.anIntArray560[arg0], super.anIntArray569[arg0], super.anIntArray562[local165], super.anIntArray562[local170], super.anIntArray562[local175], super.anIntArray567[local165], super.anIntArray567[local170], super.anIntArray567[local175], super.anIntArray533[local165], super.anIntArray533[local170], super.anIntArray533[local175], super.aShortArray137[arg0]);
			}
		} else if (super.anIntArray569[arg0] == -1) {
			this.aClass204_2.method5139(super.anIntArray543[local13], super.anIntArray543[local18], super.anIntArray543[local23], super.anIntArray557[local13], super.anIntArray557[local18], super.anIntArray557[local23], Static373.anIntArray469[super.anIntArray552[arg0] & 0xFFFF]);
		} else {
			this.aClass204_2.method5140(super.anIntArray543[local13], super.anIntArray543[local18], super.anIntArray543[local23], super.anIntArray557[local13], super.anIntArray557[local18], super.anIntArray557[local23], super.anIntArray552[arg0] & 0xFFFF, super.anIntArray560[arg0] & 0xFFFF, super.anIntArray569[arg0] & 0xFFFF);
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(BIZ)Lclient!ba;")
	@Override
	public Class21 method7131(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.method7165(Thread.currentThread());
		@Pc(11) Class21_Sub1 local11;
		@Pc(8) Class21_Sub1 local8;
		if (arg0 == 1) {
			local8 = super.aClass21_Sub1_53;
			local11 = super.aClass21_Sub1_54;
		} else if (arg0 == 2) {
			local8 = super.aClass21_Sub1_55;
			local11 = super.aClass21_Sub1_52;
		} else if (arg0 == 3) {
			local8 = super.aClass21_Sub1_59;
			local11 = super.aClass21_Sub1_51;
		} else if (arg0 == 4) {
			local8 = super.aClass21_Sub1_56;
			local11 = super.aClass21_Sub1_60;
		} else if (arg0 == 5) {
			local8 = super.aClass21_Sub1_58;
			local11 = super.aClass21_Sub1_57;
		} else {
			local11 = local8 = new Class21_Sub1_Sub1(super.aClass15_Sub1_17);
		}
		return this.method7153(local11, local8, arg1, arg0 != 0, arg2);
	}

	@OriginalMember(owner = "client!lo", name = "l", descriptor = "()V")
	@Override
	protected void method7158() {
		super.aClass91_5.anInt3721 = this.aClass204_2.anInt6162;
		super.aClass91_5.anInt3722 = this.aClass204_2.anInt6166;
		super.aClass91_5.anInt3720 = this.aClass204_2.anInt6163;
	}

	@OriginalMember(owner = "client!lo", name = "h", descriptor = "(I)V")
	private void method5100(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = super.aClass15_Sub1_17.anInt5035;
		@Pc(10) short local10 = super.aShortArray140[arg0];
		@Pc(15) short local15 = super.aShortArray138[arg0];
		@Pc(20) short local20 = super.aShortArray139[arg0];
		@Pc(25) int local25 = super.anIntArray533[local10];
		@Pc(30) int local30 = super.anIntArray533[local15];
		@Pc(35) int local35 = super.anIntArray533[local20];
		if (super.aByteArray96 == null) {
			this.aClass204_2.anInt6164 = 0;
		} else {
			this.aClass204_2.anInt6164 = super.aByteArray96[arg0] & 0xFF;
		}
		@Pc(88) int local88;
		@Pc(93) int local93;
		@Pc(100) int local100;
		@Pc(113) int local113;
		if (local25 >= local5) {
			super.anIntArray535[0] = super.anIntArray557[local10];
			super.anIntArray553[0] = super.anIntArray543[local10];
			local1++;
			super.anIntArray541[0] = super.anIntArray552[arg0] & 0xFFFF;
		} else {
			local88 = super.anIntArray562[local10];
			local93 = super.anIntArray567[local10];
			local100 = super.anIntArray552[arg0] & 0xFFFF;
			if (local35 >= local5) {
				local113 = (local5 - local25) * Class21_Sub1.anIntArray566[local35 - local25];
				super.anIntArray535[0] = super.aClass91_5.anInt3722 + (local88 + ((super.anIntArray562[local20] - local88) * local113 >> 16)) * super.aClass15_Sub1_17.anInt5032 / local5;
				super.anIntArray553[0] = super.aClass91_5.anInt3720 + (local93 + ((super.anIntArray567[local20] - local93) * local113 >> 16)) * super.aClass15_Sub1_17.anInt5040 / local5;
				local1++;
				super.anIntArray541[0] = local100 + (((super.anIntArray569[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
			if (local30 >= local5) {
				local113 = (local5 - local25) * Class21_Sub1.anIntArray566[local30 - local25];
				super.anIntArray535[local1] = super.aClass91_5.anInt3722 + (local88 + ((super.anIntArray562[local15] - local88) * local113 >> 16)) * super.aClass15_Sub1_17.anInt5032 / local5;
				super.anIntArray553[local1] = super.aClass91_5.anInt3720 + (local93 + ((super.anIntArray567[local15] - local93) * local113 >> 16)) * super.aClass15_Sub1_17.anInt5040 / local5;
				super.anIntArray541[local1++] = local100 + (((super.anIntArray560[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
		}
		if (local30 >= local5) {
			super.anIntArray535[local1] = super.anIntArray557[local15];
			super.anIntArray553[local1] = super.anIntArray543[local15];
			super.anIntArray541[local1++] = super.anIntArray560[arg0] & 0xFFFF;
		} else {
			local88 = super.anIntArray562[local15];
			local93 = super.anIntArray567[local15];
			local100 = super.anIntArray560[arg0] & 0xFFFF;
			if (local25 >= local5) {
				local113 = (local5 - local30) * Class21_Sub1.anIntArray566[local25 - local30];
				super.anIntArray535[local1] = super.aClass91_5.anInt3722 + (local88 + ((super.anIntArray562[local10] - local88) * local113 >> 16)) * super.aClass15_Sub1_17.anInt5032 / local5;
				super.anIntArray553[local1] = super.aClass91_5.anInt3720 + (local93 + ((super.anIntArray567[local10] - local93) * local113 >> 16)) * super.aClass15_Sub1_17.anInt5040 / local5;
				super.anIntArray541[local1++] = local100 + (((super.anIntArray552[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
			if (local35 >= local5) {
				local113 = (local5 - local30) * Class21_Sub1.anIntArray566[local35 - local30];
				super.anIntArray535[local1] = super.aClass91_5.anInt3722 + (local88 + ((super.anIntArray562[local20] - local88) * local113 >> 16)) * super.aClass15_Sub1_17.anInt5032 / local5;
				super.anIntArray553[local1] = super.aClass91_5.anInt3720 + (local93 + ((super.anIntArray567[local20] - local93) * local113 >> 16)) * super.aClass15_Sub1_17.anInt5040 / local5;
				super.anIntArray541[local1++] = local100 + (((super.anIntArray569[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
		}
		if (local35 >= local5) {
			super.anIntArray535[local1] = super.anIntArray557[local20];
			super.anIntArray553[local1] = super.anIntArray543[local20];
			super.anIntArray541[local1++] = super.anIntArray569[arg0] & 0xFFFF;
		} else {
			local88 = super.anIntArray562[local20];
			local93 = super.anIntArray567[local20];
			local100 = super.anIntArray569[arg0] & 0xFFFF;
			if (local30 >= local5) {
				local113 = (local5 - local35) * Class21_Sub1.anIntArray566[local30 - local35];
				super.anIntArray535[local1] = super.aClass91_5.anInt3722 + (local88 + ((super.anIntArray562[local15] - local88) * local113 >> 16)) * super.aClass15_Sub1_17.anInt5032 / local5;
				super.anIntArray553[local1] = super.aClass91_5.anInt3720 + (local93 + ((super.anIntArray567[local15] - local93) * local113 >> 16)) * super.aClass15_Sub1_17.anInt5040 / local5;
				super.anIntArray541[local1++] = local100 + (((super.anIntArray560[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
			if (local25 >= local5) {
				local113 = (local5 - local35) * Class21_Sub1.anIntArray566[local25 - local35];
				super.anIntArray535[local1] = super.aClass91_5.anInt3722 + (local88 + ((super.anIntArray562[local10] - local88) * local113 >> 16)) * super.aClass15_Sub1_17.anInt5032 / local5;
				super.anIntArray553[local1] = super.aClass91_5.anInt3720 + (local93 + ((super.anIntArray567[local10] - local93) * local113 >> 16)) * super.aClass15_Sub1_17.anInt5040 / local5;
				super.anIntArray541[local1++] = local100 + (((super.anIntArray552[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
		}
		local88 = super.anIntArray535[0];
		local93 = super.anIntArray535[1];
		local100 = super.anIntArray535[2];
		local113 = super.anIntArray553[0];
		@Pc(725) int local725 = super.anIntArray553[1];
		@Pc(730) int local730 = super.anIntArray553[2];
		this.aClass204_2.aBoolean527 = false;
		@Pc(838) int local838;
		@Pc(843) int local843;
		@Pc(848) int local848;
		@Pc(833) int local833;
		if (local1 == 3) {
			if (local88 < 0 || local93 < 0 || local100 < 0 || local88 > super.aClass91_5.anInt3721 || local93 > super.aClass91_5.anInt3721 || local100 > super.aClass91_5.anInt3721) {
				this.aClass204_2.aBoolean527 = true;
			}
			if (super.aShortArray137 != null && super.aShortArray137[arg0] != -1) {
				if (super.aByteArray95 == null || super.aByteArray95[arg0] == -1) {
					local838 = local10;
					local843 = local15;
					local848 = local20;
				} else {
					local833 = super.aByteArray95[arg0] & 0xFF;
					local838 = super.anIntArray537[local833];
					local843 = super.anIntArray556[local833];
					local848 = super.anIntArray549[local833];
				}
				if (super.anIntArray569[arg0] == -1) {
					this.aClass204_2.method5145(local113, local725, local730, local88, local93, local100, super.anIntArray552[arg0], super.anIntArray552[arg0], super.anIntArray552[arg0], super.anIntArray562[local838], super.anIntArray562[local843], super.anIntArray562[local848], super.anIntArray567[local838], super.anIntArray567[local843], super.anIntArray567[local848], super.anIntArray533[local838], super.anIntArray533[local843], super.anIntArray533[local848], super.aShortArray137[arg0]);
				} else {
					this.aClass204_2.method5145(local113, local725, local730, local88, local93, local100, super.anIntArray541[0], super.anIntArray541[1], super.anIntArray541[2], super.anIntArray562[local838], super.anIntArray562[local843], super.anIntArray562[local848], super.anIntArray567[local838], super.anIntArray567[local843], super.anIntArray567[local848], super.anIntArray533[local838], super.anIntArray533[local843], super.anIntArray533[local848], super.aShortArray137[arg0]);
				}
			} else if (super.anIntArray569[arg0] == -1) {
				this.aClass204_2.method5139(local113, local725, local730, local88, local93, local100, Static373.anIntArray469[super.anIntArray552[arg0] & 0xFFFF]);
			} else {
				this.aClass204_2.method5140(local113, local725, local730, local88, local93, local100, super.anIntArray541[0], super.anIntArray541[1], super.anIntArray541[2]);
			}
		}
		if (local1 != 4) {
			return;
		}
		if (local88 < 0 || local93 < 0 || local100 < 0 || local88 > super.aClass91_5.anInt3721 || local93 > super.aClass91_5.anInt3721 || local100 > super.aClass91_5.anInt3721 || super.anIntArray535[3] < 0 || super.anIntArray535[3] > super.aClass91_5.anInt3721) {
			this.aClass204_2.aBoolean527 = true;
		}
		if (super.aShortArray137 == null || super.aShortArray137[arg0] == -1) {
			if (super.anIntArray569[arg0] == -1) {
				local838 = Static373.anIntArray469[super.anIntArray552[arg0] & 0xFFFF];
				this.aClass204_2.method5139(local113, local725, local730, local88, local93, local100, local838);
				this.aClass204_2.method5139(local113, local730, super.anIntArray553[3], local88, local100, super.anIntArray535[3], local838);
				return;
			}
			this.aClass204_2.method5140(local113, local725, local730, local88, local93, local100, super.anIntArray541[0], super.anIntArray541[1], super.anIntArray541[2]);
			this.aClass204_2.method5140(local113, local730, super.anIntArray553[3], local88, local100, super.anIntArray535[3], super.anIntArray541[0], super.anIntArray541[2], super.anIntArray541[3]);
			return;
		}
		if (super.aByteArray95 == null || super.aByteArray95[arg0] == -1) {
			local838 = local10;
			local843 = local15;
			local848 = local20;
		} else {
			local833 = super.aByteArray95[arg0] & 0xFF;
			local838 = super.anIntArray537[local833];
			local843 = super.anIntArray556[local833];
			local848 = super.anIntArray549[local833];
		}
		@Pc(1168) short local1168 = super.aShortArray137[arg0];
		if (super.anIntArray569[arg0] == -1) {
			this.aClass204_2.method5145(local113, local725, local730, local88, local93, local100, super.anIntArray552[arg0], super.anIntArray552[arg0], super.anIntArray552[arg0], super.anIntArray562[local838], super.anIntArray562[local843], super.anIntArray562[local848], super.anIntArray567[local838], super.anIntArray567[local843], super.anIntArray567[local848], super.anIntArray533[local838], super.anIntArray533[local843], super.anIntArray533[local848], local1168);
			this.aClass204_2.method5145(local113, local730, super.anIntArray553[3], local88, local100, super.anIntArray535[3], super.anIntArray552[arg0], super.anIntArray552[arg0], super.anIntArray552[arg0], super.anIntArray562[local838], super.anIntArray562[local843], super.anIntArray562[local848], super.anIntArray567[local838], super.anIntArray567[local843], super.anIntArray567[local848], super.anIntArray533[local838], super.anIntArray533[local843], super.anIntArray533[local848], local1168);
			return;
		}
		this.aClass204_2.method5145(local113, local725, local730, local88, local93, local100, super.anIntArray541[0], super.anIntArray541[1], super.anIntArray541[2], super.anIntArray562[local838], super.anIntArray562[local843], super.anIntArray562[local848], super.anIntArray567[local838], super.anIntArray567[local843], super.anIntArray567[local848], super.anIntArray533[local838], super.anIntArray533[local843], super.anIntArray533[local848], local1168);
		this.aClass204_2.method5145(local113, local730, super.anIntArray553[3], local88, local100, super.anIntArray535[3], super.anIntArray541[0], super.anIntArray541[2], super.anIntArray541[3], super.anIntArray562[local838], super.anIntArray562[local843], super.anIntArray562[local848], super.anIntArray567[local838], super.anIntArray567[local843], super.anIntArray567[local848], super.anIntArray533[local838], super.anIntArray533[local843], super.anIntArray533[local848], local1168);
	}

	@OriginalMember(owner = "client!lo", name = "d", descriptor = "(I)V")
	@Override
	protected void method7161(@OriginalArg(0) int arg0) {
		this.aClass204_2.aBoolean526 = (arg0 & 0x1) == 0;
		this.aClass204_2.aBoolean528 = false;
	}

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(Ljava/lang/Thread;)V")
	@Override
	protected void method7173(@OriginalArg(0) Thread arg0) {
		super.method7173(arg0);
		@Pc(8) Class91_Sub1 local8 = (Class91_Sub1) super.aClass15_Sub1_17.method4266(arg0);
		this.aClass204_2 = local8.aClass204_1;
		super.anIntArray534 = local8.anIntArray188;
		super.anIntArray546 = local8.anIntArray187;
		super.anIntArrayArray63 = local8.anIntArrayArray26;
		super.anIntArray568 = local8.anIntArray190;
		super.anIntArrayArray68 = local8.anIntArrayArray27;
		super.anIntArray540 = local8.anIntArray186;
		super.anIntArrayArray67 = local8.anIntArrayArray25;
		super.anIntArray542 = local8.anIntArray189;
		super.anIntArray536 = local8.anIntArray185;
		super.anIntArray565 = local8.anIntArray191;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ZZIIZI)V")
	@Override
	protected void method7160(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(12) int local12;
		if (arg3 + 2 > 2200) {
			local12 = Static373.method6080(arg3) + 1 - Static31.anInt8714;
			arg3 = (arg3 >> local12) + 2;
		} else {
			local12 = 0;
			arg3 += 2;
		}
		for (@Pc(24) int local24 = 0; local24 < 2200; local24++) {
			super.anIntArray546[local24] = 0;
		}
		@Pc(36) int local36 = 0;
		@Pc(41) int local41;
		if (super.aClass299Array3 != null) {
			local41 = 0;
			while (local41 < super.anInt8717) {
				@Pc(47) Class299 local47 = super.aClass299Array3[local41];
				super.anIntArray538[local47.anInt9027] = local41++;
			}
		}
		@Pc(87) int local87;
		@Pc(92) int local92;
		@Pc(97) int local97;
		@Pc(113) int local113;
		@Pc(123) int local123;
		@Pc(128) int local128;
		@Pc(133) int local133;
		@Pc(138) int local138;
		@Pc(143) int local143;
		@Pc(148) int local148;
		@Pc(153) int local153;
		@Pc(193) int local193;
		for (local41 = 0; local41 < super.anInt8719; local41++) {
			if (super.anIntArray569[local41] != -2) {
				@Pc(72) short local72 = super.aShortArray140[local41];
				@Pc(77) short local77 = super.aShortArray138[local41];
				@Pc(82) short local82 = super.aShortArray139[local41];
				local87 = super.anIntArray557[local72];
				local92 = super.anIntArray557[local77];
				local97 = super.anIntArray557[local82];
				@Pc(118) int local118;
				if (arg0 && (local87 == -5000 || local92 == -5000 || local97 == -5000)) {
					local113 = super.anIntArray562[local72];
					local118 = super.anIntArray562[local77];
					local123 = super.anIntArray562[local82];
					local128 = super.anIntArray567[local72];
					local133 = super.anIntArray567[local77];
					local138 = super.anIntArray567[local82];
					local143 = super.anIntArray533[local72];
					local148 = super.anIntArray533[local77];
					local153 = super.anIntArray533[local82];
					@Pc(157) int local157 = local113 - local118;
					@Pc(161) int local161 = local123 - local118;
					@Pc(165) int local165 = local128 - local133;
					@Pc(169) int local169 = local138 - local133;
					@Pc(173) int local173 = local143 - local148;
					@Pc(177) int local177 = local153 - local148;
					@Pc(185) int local185 = local165 * local177 - local173 * local169;
					local193 = local173 * local161 - local157 * local177;
					@Pc(201) int local201 = local157 * local169 - local165 * local161;
					if (local118 * local185 + local133 * local193 + local148 * local201 > 0) {
						super.aBooleanArray34[local41] = true;
						@Pc(237) int local237 = (super.anIntArray534[local72] + super.anIntArray534[local77] + super.anIntArray534[local82]) / 3 >> local12;
						if (super.anIntArray546[local237] < 64) {
							super.anIntArrayArray63[local237][super.anIntArray546[local237]++] = local41;
						} else {
							@Pc(264) int local264 = super.anIntArray546[local237];
							if (local264 == 64) {
								if (local36 == 512) {
									continue;
								}
								super.anIntArray568[local36] = 0;
								super.anIntArray546[local237] = local264 = local36++ + 65;
							}
							local264 -= 65;
							super.anIntArrayArray68[local264][super.anIntArray568[local264]++] = local41;
						}
					}
				} else if (super.anIntArray538[local41] != -1 || (local87 - local92) * (super.anIntArray543[local82] - super.anIntArray543[local77]) - (super.anIntArray543[local72] - super.anIntArray543[local77]) * (local97 - local92) > 0) {
					super.aBooleanArray34[local41] = false;
					if (local87 >= 0 && local92 >= 0 && local97 >= 0 && local87 <= super.aClass91_5.anInt3721 && local92 <= super.aClass91_5.anInt3721 && local97 <= super.aClass91_5.anInt3721) {
						super.aBooleanArray35[local41] = false;
					} else {
						super.aBooleanArray35[local41] = true;
					}
					local113 = (super.anIntArray534[local72] + super.anIntArray534[local77] + super.anIntArray534[local82]) / 3 >> local12;
					if (super.anIntArray546[local113] < 64) {
						super.anIntArrayArray63[local113][super.anIntArray546[local113]++] = local41;
					} else {
						local118 = super.anIntArray546[local113];
						if (local118 == 64) {
							if (local36 == 512) {
								continue;
							}
							super.anIntArray568[local36] = 0;
							super.anIntArray546[local113] = local118 = local36++ + 65;
						}
						local118 -= 65;
						super.anIntArrayArray68[local118][super.anIntArray568[local118]++] = local41;
					}
				}
			}
		}
		@Pc(467) int local467;
		@Pc(477) int local477;
		@Pc(513) int local513;
		if (arg4) {
			for (local467 = 0; local467 < arg5; local467++) {
				local477 = super.anIntArray545[local467] - arg2 >> local12;
				if (local477 >= 0 && local477 < 2200) {
					if (super.anIntArray546[local477] < 64) {
						super.anIntArrayArray63[local477][super.anIntArray546[local477]++] = local467 + 1 << 16;
					} else {
						local513 = super.anIntArray546[local477];
						if (local513 == 64) {
							if (local36 == 512) {
								continue;
							}
							super.anIntArray568[local36] = 0;
							super.anIntArray546[local477] = local513 = local36++ + 65;
						}
						local513 -= 65;
						super.anIntArrayArray68[local513][super.anIntArray568[local513]++] = local467 + 1 << 16;
					}
				}
			}
		}
		if (super.aByteArray97 == null) {
			@Pc(593) int[] local593;
			if (!arg4 && super.aClass299Array3 == null) {
				if (arg1) {
					for (local467 = arg3 - 1; local467 >= 0; local467--) {
						local477 = super.anIntArray546[local467];
						if (local477 > 0) {
							local513 = local477 > 64 ? 64 : local477;
							local593 = super.anIntArrayArray63[local467];
							for (local92 = 0; local92 < local513; local92++) {
								this.method5097(local593[local92]);
							}
						}
						if (local477 > 64) {
							local513 = super.anIntArray546[local467] - 64 - 1;
							local593 = super.anIntArrayArray68[local513];
							for (local92 = 0; local92 < super.anIntArray568[local513]; local92++) {
								this.method5097(local593[local92]);
							}
						}
					}
				} else {
					for (local467 = arg3 - 1; local467 >= 0; local467--) {
						local477 = super.anIntArray546[local467];
						if (local477 > 0) {
							local513 = local477 > 64 ? 64 : local477;
							local593 = super.anIntArrayArray63[local467];
							for (local92 = 0; local92 < local513; local92++) {
								this.method5098(local593[local92]);
							}
						}
						if (local477 > 64) {
							local513 = super.anIntArray546[local467] - 64 - 1;
							local593 = super.anIntArrayArray68[local513];
							for (local92 = 0; local92 < super.anIntArray568[local513]; local92++) {
								this.method5098(local593[local92]);
							}
						}
					}
				}
			} else if (arg1) {
				for (local467 = arg3 - 1; local467 >= 0; local467--) {
					local477 = super.anIntArray546[local467];
					if (local477 > 0) {
						local513 = local477 > 64 ? 64 : local477;
						local593 = super.anIntArrayArray63[local467];
						for (local92 = 0; local92 < local513; local92++) {
							local97 = local593[local92];
							if (local97 < 65536) {
								local113 = super.anIntArray538[local97];
								if (local113 == -1 || !super.aClass299Array3[local113].aBoolean751) {
									this.method5097(local97);
								}
							}
						}
					}
					if (local477 > 64) {
						local513 = super.anIntArray546[local467] - 64 - 1;
						local593 = super.anIntArrayArray68[local513];
						for (local92 = 0; local92 < super.anIntArray568[local513]; local92++) {
							local97 = local593[local92];
							if (local97 < 65536) {
								local113 = super.anIntArray538[local97];
								if (local113 == -1 || !super.aClass299Array3[local113].aBoolean751) {
									this.method5097(local97);
								}
							}
						}
					}
				}
			} else {
				for (local467 = arg3 - 1; local467 >= 0; local467--) {
					local477 = super.anIntArray546[local467];
					@Pc(726) Class299 local726;
					@Pc(780) Class55_Sub2_Sub1 local780;
					@Pc(731) Class206 local731;
					if (local477 > 0) {
						local513 = local477 > 64 ? 64 : local477;
						local593 = super.anIntArrayArray63[local467];
						for (local92 = 0; local92 < local513; local92++) {
							local97 = local593[local92];
							if (local97 < 65536) {
								local113 = super.anIntArray538[local97];
								if (local113 == -1) {
									this.method5098(local593[local92]);
								} else {
									local726 = super.aClass299Array3[local113];
									local731 = super.aClass206Array3[local113];
									if (!local726.aBoolean751) {
										this.method5098(local97);
									}
									super.aClass15_Sub1_17.method4273(local731.anInt6179, local731.anInt6177, local731.anInt6181, local731.anInt6183, local731.anInt6173, local731.anInt6171, local726.aShort119 & 0xFFFF, local731.anInt6174, local726.aByte97, local726.aByte96);
								}
							} else {
								local113 = (local97 >> 16) - 1;
								local780 = super.aClass55_Sub2_Sub1Array6[local113];
								local123 = super.anIntArray545[local113];
								if (local123 == 0) {
									local123 = 1;
								}
								super.aClass15_Sub1_17.method4275(local780, super.anIntArray548[local113], super.anIntArray561[local113], local123, (local780.anInt2865 * super.aClass15_Sub1_17.anInt5032 >> 12) / local123);
							}
						}
					}
					if (local477 > 64) {
						local513 = super.anIntArray546[local467] - 64 - 1;
						local593 = super.anIntArrayArray68[local513];
						for (local92 = 0; local92 < super.anIntArray568[local513]; local92++) {
							local97 = local593[local92];
							if (local97 < 65536) {
								local113 = super.anIntArray538[local97];
								if (local113 == -1) {
									this.method5098(local593[local92]);
								} else {
									local726 = super.aClass299Array3[local113];
									local731 = super.aClass206Array3[local113];
									if (!local726.aBoolean751) {
										this.method5098(local97);
									}
									super.aClass15_Sub1_17.method4273(local731.anInt6179, local731.anInt6177, local731.anInt6181, local731.anInt6183, local731.anInt6173, local731.anInt6171, local726.aShort119 & 0xFFFF, local731.anInt6174, local726.aByte97, local726.aByte96);
								}
							} else {
								local113 = (local97 >> 16) - 1;
								local780 = super.aClass55_Sub2_Sub1Array6[local113];
								local123 = super.anIntArray545[local113];
								if (local123 == 0) {
									local123 = 1;
								}
								super.aClass15_Sub1_17.method4275(local780, super.anIntArray548[local113], super.anIntArray561[local113], local123, (local780.anInt2865 * super.aClass15_Sub1_17.anInt5032 >> 12) / local123);
							}
						}
					}
				}
			}
			return;
		}
		for (local467 = 0; local467 < 12; local467++) {
			super.anIntArray540[local467] = 0;
			super.anIntArray565[local467] = 0;
		}
		@Pc(1143) int[] local1143;
		@Pc(1158) byte local1158;
		if (arg4) {
			for (local477 = arg3 - 1; local477 >= 0; local477--) {
				local513 = super.anIntArray546[local477];
				if (local513 > 0) {
					if (local513 > 64) {
						local87 = 64;
					} else {
						local87 = local513;
					}
					local1143 = super.anIntArrayArray63[local477];
					for (local97 = 0; local97 < local87; local97++) {
						local113 = local1143[local97];
						if (local113 < 65536) {
							local1158 = super.aByteArray97[local113];
							local123 = super.anIntArray540[local1158]++;
							super.anIntArrayArray67[local1158][local123] = local113;
							if (local1158 < 10) {
								super.anIntArray565[local1158] += local477;
							} else if (local1158 == 10) {
								super.anIntArray542[local123] = local477;
							} else {
								super.anIntArray536[local123] = local477;
							}
						} else {
							local1158 = super.aClass55_Sub2_Sub1Array6[(local113 >> 16) - 1].aByte26;
							local123 = super.anIntArray540[local1158]++;
							super.anIntArrayArray67[local1158][local123] = local113;
							if (local1158 < 10) {
								super.anIntArray565[local1158] += local477;
							} else if (local1158 == 10) {
								super.anIntArray542[local123] = local477;
							} else {
								super.anIntArray536[local123] = local477;
							}
						}
					}
				}
				if (local513 > 64) {
					local87 = super.anIntArray546[local477] - 64 - 1;
					local1143 = super.anIntArrayArray68[local87];
					for (local97 = 0; local97 < super.anIntArray568[local87]; local97++) {
						local113 = local1143[local97];
						if (local113 < 65536) {
							local1158 = super.aByteArray97[local113];
							local123 = super.anIntArray540[local1158]++;
							super.anIntArrayArray67[local1158][local123] = local113;
							if (local1158 < 10) {
								super.anIntArray565[local1158] += local477;
							} else if (local1158 == 10) {
								super.anIntArray542[local123] = local477;
							} else {
								super.anIntArray536[local123] = local477;
							}
						} else {
							local1158 = super.aClass55_Sub2_Sub1Array6[(local113 >> 16) - 1].aByte26;
							local123 = super.anIntArray540[local1158]++;
							super.anIntArrayArray67[local1158][local123] = local113;
							if (local1158 < 10) {
								super.anIntArray565[local1158] += local477;
							} else if (local1158 == 10) {
								super.anIntArray542[local123] = local477;
							} else {
								super.anIntArray536[local123] = local477;
							}
						}
					}
				}
			}
		} else {
			for (local477 = arg3 - 1; local477 >= 0; local477--) {
				local513 = super.anIntArray546[local477];
				if (local513 > 0) {
					if (local513 > 64) {
						local87 = 64;
					} else {
						local87 = local513;
					}
					local1143 = super.anIntArrayArray63[local477];
					for (local97 = 0; local97 < local87; local97++) {
						local113 = local1143[local97];
						local1158 = super.aByteArray97[local113];
						local123 = super.anIntArray540[local1158]++;
						super.anIntArrayArray67[local1158][local123] = local113;
						if (local1158 < 10) {
							super.anIntArray565[local1158] += local477;
						} else if (local1158 == 10) {
							super.anIntArray542[local123] = local477;
						} else {
							super.anIntArray536[local123] = local477;
						}
					}
				}
				if (local513 > 64) {
					local87 = super.anIntArray546[local477] - 64 - 1;
					local1143 = super.anIntArrayArray68[local87];
					for (local97 = 0; local97 < super.anIntArray568[local87]; local97++) {
						local113 = local1143[local97];
						local1158 = super.aByteArray97[local113];
						local123 = super.anIntArray540[local1158]++;
						super.anIntArrayArray67[local1158][local123] = local113;
						if (local1158 < 10) {
							super.anIntArray565[local1158] += local477;
						} else if (local1158 == 10) {
							super.anIntArray542[local123] = local477;
						} else {
							super.anIntArray536[local123] = local477;
						}
					}
				}
			}
		}
		local477 = 0;
		if (super.anIntArray540[1] > 0 || super.anIntArray540[2] > 0) {
			local477 = (super.anIntArray565[1] + super.anIntArray565[2]) / (super.anIntArray540[1] + super.anIntArray540[2]);
		}
		local513 = 0;
		if (super.anIntArray540[3] > 0 || super.anIntArray540[4] > 0) {
			local513 = (super.anIntArray565[3] + super.anIntArray565[4]) / (super.anIntArray540[3] + super.anIntArray540[4]);
		}
		local87 = 0;
		if (super.anIntArray540[6] > 0 || super.anIntArray540[8] > 0) {
			local87 = (super.anIntArray565[6] + super.anIntArray565[8]) / (super.anIntArray540[6] + super.anIntArray540[8]);
		}
		local97 = 0;
		local113 = super.anIntArray540[10];
		@Pc(1673) int[] local1673 = super.anIntArrayArray67[10];
		@Pc(1676) int[] local1676 = super.anIntArray542;
		if (local113 == 0) {
			local97 = 0;
			local113 = super.anIntArray540[11];
			local1673 = super.anIntArrayArray67[11];
			local1676 = super.anIntArray536;
		}
		if (local113 > 0) {
			local92 = local1676[0];
		} else {
			local92 = -1000;
		}
		@Pc(1928) Class299 local1928;
		@Pc(1980) Class55_Sub2_Sub1 local1980;
		@Pc(1933) Class206 local1933;
		for (local128 = 0; local128 < 10; local128++) {
			if (arg1) {
				while (local128 == 0 && local92 > local477) {
					local133 = local1673[local97++];
					if (local133 < 65536) {
						local138 = super.anIntArray538[local133];
						if (local138 == -1 || !super.aClass299Array3[local138].aBoolean751) {
							this.method5097(local133);
						}
					}
					if (local97 == local113 && local1673 != super.anIntArrayArray67[11]) {
						local97 = 0;
						local113 = super.anIntArray540[11];
						local1673 = super.anIntArrayArray67[11];
						local1676 = super.anIntArray536;
					}
					if (local97 < local113) {
						local92 = local1676[local97];
					} else {
						local92 = -1000;
					}
				}
				while (local128 == 3 && local92 > local513) {
					local133 = local1673[local97++];
					if (local133 < 65536) {
						local138 = super.anIntArray538[local133];
						if (local138 == -1 || !super.aClass299Array3[local138].aBoolean751) {
							this.method5097(local133);
						}
					}
					if (local97 == local113 && local1673 != super.anIntArrayArray67[11]) {
						local97 = 0;
						local113 = super.anIntArray540[11];
						local1673 = super.anIntArrayArray67[11];
						local1676 = super.anIntArray536;
					}
					if (local97 < local113) {
						local92 = local1676[local97];
					} else {
						local92 = -1000;
					}
				}
				while (local128 == 5 && local92 > local87) {
					local133 = local1673[local97++];
					if (local133 < 65536) {
						local138 = super.anIntArray538[local133];
						if (local138 == -1 || !super.aClass299Array3[local138].aBoolean751) {
							this.method5097(local133);
						}
					}
					if (local97 == local113 && local1673 != super.anIntArrayArray67[11]) {
						local97 = 0;
						local113 = super.anIntArray540[11];
						local1673 = super.anIntArrayArray67[11];
						local1676 = super.anIntArray536;
					}
					if (local97 < local113) {
						local92 = local1676[local97];
					} else {
						local92 = -1000;
					}
				}
			} else {
				while (local128 == 0 && local92 > local477) {
					local133 = local1673[local97++];
					if (local133 < 65536) {
						local138 = super.anIntArray538[local133];
						if (local138 == -1) {
							this.method5098(local133);
						} else {
							local1928 = super.aClass299Array3[local138];
							local1933 = super.aClass206Array3[local138];
							if (!local1928.aBoolean751) {
								this.method5098(local133);
							}
							super.aClass15_Sub1_17.method4273(local1933.anInt6179, local1933.anInt6177, local1933.anInt6181, local1933.anInt6183, local1933.anInt6173, local1933.anInt6171, local1928.aShort119 & 0xFFFF, local1933.anInt6174, local1928.aByte97, local1928.aByte96);
						}
					} else {
						local138 = (local133 >> 16) - 1;
						local1980 = super.aClass55_Sub2_Sub1Array6[local138];
						local148 = super.anIntArray545[local138];
						if (local148 == 0) {
							local148 = 1;
						}
						super.aClass15_Sub1_17.method4275(local1980, super.anIntArray548[local138], super.anIntArray561[local138], local148, (local1980.anInt2865 * super.aClass15_Sub1_17.anInt5032 >> 12) / local148);
					}
					if (local97 == local113 && local1673 != super.anIntArrayArray67[11]) {
						local97 = 0;
						local113 = super.anIntArray540[11];
						local1673 = super.anIntArrayArray67[11];
						local1676 = super.anIntArray536;
					}
					if (local97 < local113) {
						local92 = local1676[local97];
					} else {
						local92 = -1000;
					}
				}
				while (local128 == 3 && local92 > local513) {
					local133 = local1673[local97++];
					if (local133 < 65536) {
						local138 = super.anIntArray538[local133];
						if (local138 == -1) {
							this.method5098(local133);
						} else {
							local1928 = super.aClass299Array3[local138];
							local1933 = super.aClass206Array3[local138];
							if (!local1928.aBoolean751) {
								this.method5098(local133);
							}
							super.aClass15_Sub1_17.method4273(local1933.anInt6179, local1933.anInt6177, local1933.anInt6181, local1933.anInt6183, local1933.anInt6173, local1933.anInt6171, local1928.aShort119 & 0xFFFF, local1933.anInt6174, local1928.aByte97, local1928.aByte96);
						}
					} else {
						local138 = (local133 >> 16) - 1;
						local1980 = super.aClass55_Sub2_Sub1Array6[local138];
						local148 = super.anIntArray545[local138];
						if (local148 == 0) {
							local148 = 1;
						}
						super.aClass15_Sub1_17.method4275(local1980, super.anIntArray548[local138], super.anIntArray561[local138], local148, (local1980.anInt2865 * super.aClass15_Sub1_17.anInt5032 >> 12) / local148);
					}
					if (local97 == local113 && local1673 != super.anIntArrayArray67[11]) {
						local97 = 0;
						local113 = super.anIntArray540[11];
						local1673 = super.anIntArrayArray67[11];
						local1676 = super.anIntArray536;
					}
					if (local97 < local113) {
						local92 = local1676[local97];
					} else {
						local92 = -1000;
					}
				}
				while (local128 == 5 && local92 > local87) {
					local133 = local1673[local97++];
					if (local133 < 65536) {
						local138 = super.anIntArray538[local133];
						if (local138 == -1) {
							this.method5098(local133);
						} else {
							local1928 = super.aClass299Array3[local138];
							local1933 = super.aClass206Array3[local138];
							if (!local1928.aBoolean751) {
								this.method5098(local133);
							}
							super.aClass15_Sub1_17.method4273(local1933.anInt6179, local1933.anInt6177, local1933.anInt6181, local1933.anInt6183, local1933.anInt6173, local1933.anInt6171, local1928.aShort119 & 0xFFFF, local1933.anInt6174, local1928.aByte97, local1928.aByte96);
						}
					} else {
						local138 = (local133 >> 16) - 1;
						local1980 = super.aClass55_Sub2_Sub1Array6[local138];
						local148 = super.anIntArray545[local138];
						if (local148 == 0) {
							local148 = 1;
						}
						super.aClass15_Sub1_17.method4275(local1980, super.anIntArray548[local138], super.anIntArray561[local138], local148, (local1980.anInt2865 * super.aClass15_Sub1_17.anInt5032 >> 12) / local148);
					}
					if (local97 == local113 && local1673 != super.anIntArrayArray67[11]) {
						local97 = 0;
						local113 = super.anIntArray540[11];
						local1673 = super.anIntArrayArray67[11];
						local1676 = super.anIntArray536;
					}
					if (local97 < local113) {
						local92 = local1676[local97];
					} else {
						local92 = -1000;
					}
				}
			}
			local133 = super.anIntArray540[local128];
			@Pc(2353) int[] local2353 = super.anIntArrayArray67[local128];
			if (!arg4 && super.aClass299Array3 == null) {
				if (arg1) {
					for (local143 = 0; local143 < local133; local143++) {
						this.method5097(local2353[local143]);
					}
				} else {
					for (local143 = 0; local143 < local133; local143++) {
						this.method5098(local2353[local143]);
					}
				}
			} else if (arg1) {
				for (local143 = 0; local143 < local133; local143++) {
					local148 = local2353[local143];
					if (local148 < 65536) {
						local153 = super.anIntArray538[local148];
						if (local153 == -1 || !super.aClass299Array3[local153].aBoolean751) {
							this.method5097(local148);
						}
					}
				}
			} else {
				for (local143 = 0; local143 < local133; local143++) {
					local148 = local2353[local143];
					if (local148 < 65536) {
						local153 = super.anIntArray538[local148];
						if (local153 == -1) {
							this.method5098(local148);
						} else {
							@Pc(2415) Class299 local2415 = super.aClass299Array3[local153];
							@Pc(2420) Class206 local2420 = super.aClass206Array3[local153];
							if (!local2415.aBoolean751) {
								this.method5098(local148);
							}
							super.aClass15_Sub1_17.method4273(local2420.anInt6179, local2420.anInt6177, local2420.anInt6181, local2420.anInt6183, local2420.anInt6173, local2420.anInt6171, local2415.aShort119 & 0xFFFF, local2420.anInt6174, local2415.aByte97, local2415.aByte96);
						}
					} else {
						local153 = (local148 >> 16) - 1;
						@Pc(2467) Class55_Sub2_Sub1 local2467 = super.aClass55_Sub2_Sub1Array6[local153];
						local193 = super.anIntArray545[local153];
						if (local193 == 0) {
							local193 = 1;
						}
						super.aClass15_Sub1_17.method4275(local2467, super.anIntArray548[local153], super.anIntArray561[local153], local193, (local2467.anInt2865 * super.aClass15_Sub1_17.anInt5032 >> 12) / local193);
					}
				}
			}
		}
		if (!arg4 && super.aClass299Array3 == null) {
			if (arg1) {
				while (local92 != -1000) {
					this.method5097(local1673[local97++]);
					if (local97 == local113 && local1673 != super.anIntArrayArray67[11]) {
						local97 = 0;
						local1673 = super.anIntArrayArray67[11];
						local113 = super.anIntArray540[11];
						local1676 = super.anIntArray536;
					}
					if (local97 < local113) {
						local92 = local1676[local97];
					} else {
						local92 = -1000;
					}
				}
			} else {
				while (local92 != -1000) {
					this.method5098(local1673[local97++]);
					if (local97 == local113 && local1673 != super.anIntArrayArray67[11]) {
						local97 = 0;
						local1673 = super.anIntArrayArray67[11];
						local113 = super.anIntArray540[11];
						local1676 = super.anIntArray536;
					}
					if (local97 < local113) {
						local92 = local1676[local97];
					} else {
						local92 = -1000;
					}
				}
			}
		} else if (arg1) {
			while (local92 != -1000) {
				local133 = local1673[local97++];
				if (local133 < 65536) {
					local138 = super.anIntArray538[local133];
					if (local138 == -1 || !super.aClass299Array3[local138].aBoolean751) {
						this.method5097(local133);
					}
				}
				if (local97 == local113 && local1673 != super.anIntArrayArray67[11]) {
					local97 = 0;
					local1673 = super.anIntArrayArray67[11];
					local113 = super.anIntArray540[11];
					local1676 = super.anIntArray536;
				}
				if (local97 < local113) {
					local92 = local1676[local97];
				} else {
					local92 = -1000;
				}
			}
		} else {
			while (local92 != -1000) {
				local133 = local1673[local97++];
				if (local133 < 65536) {
					local138 = super.anIntArray538[local133];
					if (local138 == -1) {
						this.method5098(local133);
					} else {
						local1928 = super.aClass299Array3[local138];
						local1933 = super.aClass206Array3[local138];
						if (!local1928.aBoolean751) {
							this.method5098(local133);
						}
						super.aClass15_Sub1_17.method4273(local1933.anInt6179, local1933.anInt6177, local1933.anInt6181, local1933.anInt6183, local1933.anInt6173, local1933.anInt6171, local1928.aShort119 & 0xFFFF, local1933.anInt6174, local1928.aByte97, local1928.aByte96);
					}
				} else {
					local138 = (local133 >> 16) - 1;
					local1980 = super.aClass55_Sub2_Sub1Array6[local138];
					local148 = super.anIntArray545[local138];
					if (local148 == 0) {
						local148 = 1;
					}
					super.aClass15_Sub1_17.method4275(local1980, super.anIntArray548[local138], super.anIntArray561[local138], local148, (local1980.anInt2865 * super.aClass15_Sub1_17.anInt5032 >> 12) / local148);
				}
				if (local97 == local113 && local1673 != super.anIntArrayArray67[11]) {
					local97 = 0;
					local1673 = super.anIntArrayArray67[11];
					local113 = super.anIntArray540[11];
					local1676 = super.anIntArray536;
				}
				if (local97 < local113) {
					local92 = local1676[local97];
				} else {
					local92 = -1000;
				}
			}
		}
	}
}
