import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rv")
public final class Class21_Sub1_Sub2 extends Class21_Sub1 {

	@OriginalMember(owner = "client!rv", name = "tc", descriptor = "Lclient!jb;")
	private Class165 aClass165_2;

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Lclient!ql;Lclient!fca;IIII)V")
	public Class21_Sub1_Sub2(@OriginalArg(0) Class15_Sub1 arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Lclient!ql;)V")
	public Class21_Sub1_Sub2(@OriginalArg(0) Class15_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(ZZIIZI)V")
	@Override
	protected void method7160(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(4) int local4;
		if (super.aClass299Array3 != null) {
			local4 = 0;
			while (local4 < super.anInt8717) {
				@Pc(10) Class299 local10 = super.aClass299Array3[local4];
				super.anIntArray538[local10.anInt9027] = local4++;
			}
		}
		for (local4 = 0; local4 < super.anInt8719; local4++) {
			if (super.aByteArray96 == null || super.aByteArray96[local4] == 0) {
				this.method7177(local4, arg0, arg1);
			}
		}
		@Pc(50) int local50;
		if (super.aBoolean720) {
			if (super.aByteArray97 == null) {
				for (local50 = 0; local50 < super.anInt8719; local50++) {
					if (super.aByteArray96 == null || super.aByteArray96[local50] != 0) {
						this.method7177(local50, arg0, arg1);
					}
				}
			} else {
				for (local50 = 0; local50 < 12; local50++) {
					for (@Pc(75) int local75 = 0; local75 < super.anInt8719; local75++) {
						if ((super.aByteArray96 == null || super.aByteArray96[local75] != 0) && super.aByteArray97[local75] == local50) {
							this.method7177(local75, arg0, arg1);
						}
					}
				}
			}
		}
		if (!arg4) {
			return;
		}
		for (local50 = 0; local50 < arg5; local50++) {
			@Pc(114) Class55_Sub2_Sub1 local114 = super.aClass55_Sub2_Sub1Array6[local50];
			@Pc(119) int local119 = super.anIntArray545[local50];
			if (local119 == 0) {
				local119 = 1;
			}
			super.aClass15_Sub1_17.method4275(local114, super.anIntArray548[local50], super.anIntArray561[local50], local119, (local114.anInt2865 * super.aClass15_Sub1_17.anInt5032 >> 12) / local119);
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(BIZ)Lclient!ba;")
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
			local11 = local8 = new Class21_Sub1_Sub2(super.aClass15_Sub1_17);
		}
		return this.method7153(local11, local8, arg1, arg0 != 0, arg2);
	}

	@OriginalMember(owner = "client!rv", name = "i", descriptor = "()V")
	@Override
	protected void method7155() {
		this.aClass165_2 = null;
	}

	@OriginalMember(owner = "client!rv", name = "f", descriptor = "(I)V")
	private void method7174(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = super.aClass15_Sub1_17.anInt5035;
		@Pc(10) short local10 = super.aShortArray140[arg0];
		@Pc(15) short local15 = super.aShortArray138[arg0];
		@Pc(20) short local20 = super.aShortArray139[arg0];
		@Pc(25) int local25 = super.anIntArray533[local10];
		@Pc(30) int local30 = super.anIntArray533[local15];
		@Pc(35) int local35 = super.anIntArray533[local20];
		if (super.aByteArray96 == null) {
			this.aClass165_2.anInt4832 = 0;
		} else {
			this.aClass165_2.anInt4832 = super.aByteArray96[arg0] & 0xFF;
		}
		@Pc(96) int local96;
		@Pc(101) int local101;
		@Pc(108) int local108;
		@Pc(121) int local121;
		if (local25 >= local5) {
			super.anIntArray535[0] = super.anIntArray557[local10];
			super.anIntArray553[0] = super.anIntArray543[local10];
			super.anIntArray539[0] = super.anIntArray554[local10];
			local1++;
			super.anIntArray541[0] = super.anIntArray552[arg0] & 0xFFFF;
		} else {
			local96 = super.anIntArray562[local10];
			local101 = super.anIntArray567[local10];
			local108 = super.anIntArray552[arg0] & 0xFFFF;
			if (local35 >= local5) {
				local121 = (local5 - local25) * Class21_Sub1.anIntArray566[local35 - local25];
				super.anIntArray535[0] = super.aClass91_5.anInt3722 + (local96 + ((super.anIntArray562[local20] - local96) * local121 >> 16)) * super.aClass15_Sub1_17.anInt5032 / local5;
				super.anIntArray553[0] = super.aClass91_5.anInt3720 + (local101 + ((super.anIntArray567[local20] - local101) * local121 >> 16)) * super.aClass15_Sub1_17.anInt5040 / local5;
				super.anIntArray539[0] = local5;
				local1++;
				super.anIntArray541[0] = local108 + (((super.anIntArray569[arg0] & 0xFFFF) - local108) * local121 >> 16);
			}
			if (local30 >= local5) {
				local121 = (local5 - local25) * Class21_Sub1.anIntArray566[local30 - local25];
				super.anIntArray535[local1] = super.aClass91_5.anInt3722 + (local96 + ((super.anIntArray562[local15] - local96) * local121 >> 16)) * super.aClass15_Sub1_17.anInt5032 / local5;
				super.anIntArray553[local1] = super.aClass91_5.anInt3720 + (local101 + ((super.anIntArray567[local15] - local101) * local121 >> 16)) * super.aClass15_Sub1_17.anInt5040 / local5;
				super.anIntArray539[local1] = local5;
				super.anIntArray541[local1++] = local108 + (((super.anIntArray560[arg0] & 0xFFFF) - local108) * local121 >> 16);
			}
		}
		if (local30 >= local5) {
			super.anIntArray535[local1] = super.anIntArray557[local15];
			super.anIntArray553[local1] = super.anIntArray543[local15];
			super.anIntArray539[local1] = super.anIntArray554[local15];
			super.anIntArray541[local1++] = super.anIntArray560[arg0] & 0xFFFF;
		} else {
			local96 = super.anIntArray562[local15];
			local101 = super.anIntArray567[local15];
			local108 = super.anIntArray560[arg0] & 0xFFFF;
			if (local25 >= local5) {
				local121 = (local5 - local30) * Class21_Sub1.anIntArray566[local25 - local30];
				super.anIntArray535[local1] = super.aClass91_5.anInt3722 + (local96 + ((super.anIntArray562[local10] - local96) * local121 >> 16)) * super.aClass15_Sub1_17.anInt5032 / local5;
				super.anIntArray553[local1] = super.aClass91_5.anInt3720 + (local101 + ((super.anIntArray567[local10] - local101) * local121 >> 16)) * super.aClass15_Sub1_17.anInt5040 / local5;
				super.anIntArray539[local1] = local5;
				super.anIntArray541[local1++] = local108 + (((super.anIntArray552[arg0] & 0xFFFF) - local108) * local121 >> 16);
			}
			if (local35 >= local5) {
				local121 = (local5 - local30) * Class21_Sub1.anIntArray566[local35 - local30];
				super.anIntArray535[local1] = super.aClass91_5.anInt3722 + (local96 + ((super.anIntArray562[local20] - local96) * local121 >> 16)) * super.aClass15_Sub1_17.anInt5032 / local5;
				super.anIntArray553[local1] = super.aClass91_5.anInt3720 + (local101 + ((super.anIntArray567[local20] - local101) * local121 >> 16)) * super.aClass15_Sub1_17.anInt5040 / local5;
				super.anIntArray539[local1] = local5;
				super.anIntArray541[local1++] = local108 + (((super.anIntArray569[arg0] & 0xFFFF) - local108) * local121 >> 16);
			}
		}
		if (local35 >= local5) {
			super.anIntArray535[local1] = super.anIntArray557[local20];
			super.anIntArray553[local1] = super.anIntArray543[local20];
			super.anIntArray539[local1] = super.anIntArray554[local20];
			super.anIntArray541[local1++] = super.anIntArray569[arg0] & 0xFFFF;
		} else {
			local96 = super.anIntArray562[local20];
			local101 = super.anIntArray567[local20];
			local108 = super.anIntArray569[arg0] & 0xFFFF;
			if (local30 >= local5) {
				local121 = (local5 - local35) * Class21_Sub1.anIntArray566[local30 - local35];
				super.anIntArray535[local1] = super.aClass91_5.anInt3722 + (local96 + ((super.anIntArray562[local15] - local96) * local121 >> 16)) * super.aClass15_Sub1_17.anInt5032 / local5;
				super.anIntArray553[local1] = super.aClass91_5.anInt3720 + (local101 + ((super.anIntArray567[local15] - local101) * local121 >> 16)) * super.aClass15_Sub1_17.anInt5040 / local5;
				super.anIntArray539[local1] = local5;
				super.anIntArray541[local1++] = local108 + (((super.anIntArray560[arg0] & 0xFFFF) - local108) * local121 >> 16);
			}
			if (local25 >= local5) {
				local121 = (local5 - local35) * Class21_Sub1.anIntArray566[local25 - local35];
				super.anIntArray535[local1] = super.aClass91_5.anInt3722 + (local96 + ((super.anIntArray562[local10] - local96) * local121 >> 16)) * super.aClass15_Sub1_17.anInt5032 / local5;
				super.anIntArray553[local1] = super.aClass91_5.anInt3720 + (local101 + ((super.anIntArray567[local10] - local101) * local121 >> 16)) * super.aClass15_Sub1_17.anInt5040 / local5;
				super.anIntArray539[local1] = local5;
				super.anIntArray541[local1++] = local108 + (((super.anIntArray552[arg0] & 0xFFFF) - local108) * local121 >> 16);
			}
		}
		local96 = super.anIntArray535[0];
		local101 = super.anIntArray535[1];
		local108 = super.anIntArray535[2];
		local121 = super.anIntArray553[0];
		@Pc(779) int local779 = super.anIntArray553[1];
		@Pc(784) int local784 = super.anIntArray553[2];
		local25 = super.anIntArray539[0];
		local30 = super.anIntArray539[1];
		local35 = super.anIntArray539[2];
		this.aClass165_2.aBoolean408 = false;
		@Pc(913) int local913;
		@Pc(918) int local918;
		@Pc(923) int local923;
		@Pc(908) int local908;
		if (local1 == 3) {
			if (local96 < 0 || local101 < 0 || local108 < 0 || local96 > super.aClass91_5.anInt3721 || local101 > super.aClass91_5.anInt3721 || local108 > super.aClass91_5.anInt3721) {
				this.aClass165_2.aBoolean408 = true;
			}
			if (super.aShortArray137 != null && super.aShortArray137[arg0] != -1) {
				if (super.aByteArray95 == null || super.aByteArray95[arg0] == -1) {
					local913 = local10;
					local918 = local15;
					local923 = local20;
				} else {
					local908 = super.aByteArray95[arg0] & 0xFF;
					local913 = super.anIntArray537[local908];
					local918 = super.anIntArray556[local908];
					local923 = super.anIntArray549[local908];
				}
				if (super.anIntArray569[arg0] == -1) {
					this.aClass165_2.method4078(local121, local779, local784, local96, local101, local108, local25, local30, local35, super.anIntArray552[arg0], super.anIntArray552[arg0], super.anIntArray552[arg0], super.anIntArray562[local913], super.anIntArray562[local918], super.anIntArray562[local923], super.anIntArray567[local913], super.anIntArray567[local918], super.anIntArray567[local923], super.anIntArray533[local913], super.anIntArray533[local918], super.anIntArray533[local923], super.aShortArray137[arg0]);
				} else {
					this.aClass165_2.method4078(local121, local779, local784, local96, local101, local108, local25, local30, local35, super.anIntArray541[0], super.anIntArray541[1], super.anIntArray541[2], super.anIntArray562[local913], super.anIntArray562[local918], super.anIntArray562[local923], super.anIntArray567[local913], super.anIntArray567[local918], super.anIntArray567[local923], super.anIntArray533[local913], super.anIntArray533[local918], super.anIntArray533[local923], super.aShortArray137[arg0]);
				}
			} else if (super.anIntArray569[arg0] == -1) {
				this.aClass165_2.method4064(local121, local779, local784, local96, local101, local108, local25, local30, local35, Static373.anIntArray469[super.anIntArray552[arg0] & 0xFFFF]);
			} else {
				this.aClass165_2.method4062(local121, local779, local784, local96, local101, local108, local25, local30, local35, super.anIntArray541[0], super.anIntArray541[1], super.anIntArray541[2]);
			}
		}
		if (local1 != 4) {
			return;
		}
		if (local96 < 0 || local101 < 0 || local108 < 0 || local96 > super.aClass91_5.anInt3721 || local101 > super.aClass91_5.anInt3721 || local108 > super.aClass91_5.anInt3721 || super.anIntArray535[3] < 0 || super.anIntArray535[3] > super.aClass91_5.anInt3721) {
			this.aClass165_2.aBoolean408 = true;
		}
		if (super.aShortArray137 == null || super.aShortArray137[arg0] == -1) {
			if (super.anIntArray569[arg0] == -1) {
				local913 = Static373.anIntArray469[super.anIntArray552[arg0] & 0xFFFF];
				this.aClass165_2.method4064(local121, local779, local784, local96, local101, local108, local25, local30, local35, local913);
				this.aClass165_2.method4064(local121, local784, super.anIntArray553[3], local96, local108, super.anIntArray535[3], local25, local30, super.anIntArray539[3], local913);
				return;
			}
			this.aClass165_2.method4062(local121, local779, local784, local96, local101, local108, local25, local30, local35, super.anIntArray541[0], super.anIntArray541[1], super.anIntArray541[2]);
			this.aClass165_2.method4062(local121, local784, super.anIntArray553[3], local96, local108, super.anIntArray535[3], local25, local30, super.anIntArray539[3], super.anIntArray541[0], super.anIntArray541[2], super.anIntArray541[3]);
			return;
		}
		if (super.aByteArray95 == null || super.aByteArray95[arg0] == -1) {
			local913 = local10;
			local918 = local15;
			local923 = local20;
		} else {
			local908 = super.aByteArray95[arg0] & 0xFF;
			local913 = super.anIntArray537[local908];
			local918 = super.anIntArray556[local908];
			local923 = super.anIntArray549[local908];
		}
		@Pc(1267) short local1267 = super.aShortArray137[arg0];
		if (super.anIntArray569[arg0] == -1) {
			this.aClass165_2.method4078(local121, local779, local784, local96, local101, local108, local25, local30, local35, super.anIntArray552[arg0], super.anIntArray552[arg0], super.anIntArray552[arg0], super.anIntArray562[local913], super.anIntArray562[local918], super.anIntArray562[local923], super.anIntArray567[local913], super.anIntArray567[local918], super.anIntArray567[local923], super.anIntArray533[local913], super.anIntArray533[local918], super.anIntArray533[local923], local1267);
			this.aClass165_2.method4078(local121, local784, super.anIntArray553[3], local96, local108, super.anIntArray535[3], local25, local30, super.anIntArray539[3], super.anIntArray552[arg0], super.anIntArray552[arg0], super.anIntArray552[arg0], super.anIntArray562[local913], super.anIntArray562[local918], super.anIntArray562[local923], super.anIntArray567[local913], super.anIntArray567[local918], super.anIntArray567[local923], super.anIntArray533[local913], super.anIntArray533[local918], super.anIntArray533[local923], local1267);
			return;
		}
		this.aClass165_2.method4078(local121, local779, local784, local96, local101, local108, local25, local30, local35, super.anIntArray541[0], super.anIntArray541[1], super.anIntArray541[2], super.anIntArray562[local913], super.anIntArray562[local918], super.anIntArray562[local923], super.anIntArray567[local913], super.anIntArray567[local918], super.anIntArray567[local923], super.anIntArray533[local913], super.anIntArray533[local918], super.anIntArray533[local923], local1267);
		this.aClass165_2.method4078(local121, local784, super.anIntArray553[3], local96, local108, super.anIntArray535[3], local25, local30, super.anIntArray539[3], super.anIntArray541[0], super.anIntArray541[2], super.anIntArray541[3], super.anIntArray562[local913], super.anIntArray562[local918], super.anIntArray562[local923], super.anIntArray567[local913], super.anIntArray567[local918], super.anIntArray567[local923], super.anIntArray533[local913], super.anIntArray533[local918], super.anIntArray533[local923], local1267);
	}

	@OriginalMember(owner = "client!rv", name = "g", descriptor = "(I)V")
	private void method7175(@OriginalArg(0) int arg0) {
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
					this.method7176(arg0);
				} else {
					if (super.aByteArray96 == null) {
						this.aClass165_2.anInt4832 = 0;
					} else {
						this.aClass165_2.anInt4832 = super.aByteArray96[arg0] & 0xFF;
					}
					this.aClass165_2.aBoolean408 = super.aBooleanArray35[arg0];
					if (super.aShortArray137 != null && super.aShortArray137[arg0] != -1) {
						if (super.aByteArray95 == null || super.aByteArray95[arg0] == -1) {
							local333 = local8;
							local338 = local13;
							local343 = local18;
						} else {
							@Pc(328) int local328 = super.aByteArray95[arg0] & 0xFF;
							local333 = super.anIntArray537[local328];
							local338 = super.anIntArray556[local328];
							local343 = super.anIntArray549[local328];
						}
						if (super.anIntArray569[arg0] == -1) {
							this.aClass165_2.method4079(super.anIntArray543[local8], super.anIntArray543[local13], super.anIntArray543[local18], super.anIntArray557[local8], super.anIntArray557[local13], super.anIntArray557[local18], super.anIntArray554[local8], super.anIntArray554[local13], super.anIntArray554[local18], super.aClass15_Sub1_17.anInt5044, local27, local46, local65, super.anIntArray552[arg0], super.anIntArray552[arg0], super.anIntArray552[arg0], super.anIntArray562[local333], super.anIntArray562[local338], super.anIntArray562[local343], super.anIntArray567[local333], super.anIntArray567[local338], super.anIntArray567[local343], super.anIntArray533[local333], super.anIntArray533[local338], super.anIntArray533[local343], super.aShortArray137[arg0]);
						} else {
							this.aClass165_2.method4079(super.anIntArray543[local8], super.anIntArray543[local13], super.anIntArray543[local18], super.anIntArray557[local8], super.anIntArray557[local13], super.anIntArray557[local18], super.anIntArray554[local8], super.anIntArray554[local13], super.anIntArray554[local18], super.aClass15_Sub1_17.anInt5044, local27, local46, local65, super.anIntArray552[arg0], super.anIntArray560[arg0], super.anIntArray569[arg0], super.anIntArray562[local333], super.anIntArray562[local338], super.anIntArray562[local343], super.anIntArray567[local333], super.anIntArray567[local338], super.anIntArray567[local343], super.anIntArray533[local333], super.anIntArray533[local338], super.anIntArray533[local343], super.aShortArray137[arg0]);
						}
					} else if (super.anIntArray569[arg0] == -1) {
						this.aClass165_2.method4066(super.anIntArray543[local8], super.anIntArray543[local13], super.anIntArray543[local18], super.anIntArray557[local8], super.anIntArray557[local13], super.anIntArray557[local18], super.anIntArray554[local8], super.anIntArray554[local13], super.anIntArray554[local18], Static364.method6010(local27 << 24 | super.aClass15_Sub1_17.anInt5044, Static373.anIntArray469[super.anIntArray552[arg0] & 0xFFFF]), Static364.method6010(local46 << 24 | super.aClass15_Sub1_17.anInt5044, Static373.anIntArray469[super.anIntArray552[arg0] & 0xFFFF]), Static364.method6010(local65 << 24 | super.aClass15_Sub1_17.anInt5044, Static373.anIntArray469[super.anIntArray552[arg0] & 0xFFFF]));
					} else {
						this.aClass165_2.method4066(super.anIntArray543[local8], super.anIntArray543[local13], super.anIntArray543[local18], super.anIntArray557[local8], super.anIntArray557[local13], super.anIntArray557[local18], super.anIntArray554[local8], super.anIntArray554[local13], super.anIntArray554[local18], Static364.method6010(local27 << 24 | super.aClass15_Sub1_17.anInt5044, Static373.anIntArray469[super.anIntArray552[arg0] & 0xFFFF]), Static364.method6010(local46 << 24 | super.aClass15_Sub1_17.anInt5044, Static373.anIntArray469[super.anIntArray560[arg0] & 0xFFFF]), Static364.method6010(local65 << 24 | super.aClass15_Sub1_17.anInt5044, Static373.anIntArray469[super.anIntArray569[arg0] & 0xFFFF]));
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
				this.aClass165_2.anInt4832 = 0;
			} else {
				this.aClass165_2.anInt4832 = super.aByteArray96[arg0] & 0xFF;
			}
			this.aClass165_2.aBoolean408 = super.aBooleanArray35[arg0];
			if (super.aShortArray137 != null && super.aShortArray137[arg0] != -1) {
				if (super.aByteArray95 == null || super.aByteArray95[arg0] == -1) {
					local81 = local8;
					local333 = local13;
					local338 = local18;
				} else {
					local343 = super.aByteArray95[arg0] & 0xFF;
					local81 = super.anIntArray537[local343];
					local333 = super.anIntArray556[local343];
					local338 = super.anIntArray549[local343];
				}
				if (super.anIntArray569[arg0] == -1) {
					this.aClass165_2.method4079(super.anIntArray543[local8], super.anIntArray543[local13], super.anIntArray543[local18], super.anIntArray557[local8], super.anIntArray557[local13], super.anIntArray557[local18], super.anIntArray554[local8], super.anIntArray554[local13], super.anIntArray554[local18], super.aClass15_Sub1_17.anInt5044, local27, local46, local65, super.anIntArray552[arg0], super.anIntArray552[arg0], super.anIntArray552[arg0], super.anIntArray562[local81], super.anIntArray562[local333], super.anIntArray562[local338], super.anIntArray567[local81], super.anIntArray567[local333], super.anIntArray567[local338], super.anIntArray533[local81], super.anIntArray533[local333], super.anIntArray533[local338], super.aShortArray137[arg0]);
				} else {
					this.aClass165_2.method4079(super.anIntArray543[local8], super.anIntArray543[local13], super.anIntArray543[local18], super.anIntArray557[local8], super.anIntArray557[local13], super.anIntArray557[local18], super.anIntArray554[local8], super.anIntArray554[local13], super.anIntArray554[local18], super.aClass15_Sub1_17.anInt5044, local27, local46, local65, super.anIntArray552[arg0], super.anIntArray560[arg0], super.anIntArray569[arg0], super.anIntArray562[local81], super.anIntArray562[local333], super.anIntArray562[local338], super.anIntArray567[local81], super.anIntArray567[local333], super.anIntArray567[local338], super.anIntArray533[local81], super.anIntArray533[local333], super.anIntArray533[local338], super.aShortArray137[arg0]);
				}
			} else if (super.anIntArray569[arg0] == -1) {
				this.aClass165_2.method4066(super.anIntArray543[local8], super.anIntArray543[local13], super.anIntArray543[local18], super.anIntArray557[local8], super.anIntArray557[local13], super.anIntArray557[local18], super.anIntArray554[local8], super.anIntArray554[local13], super.anIntArray554[local18], Static364.method6010(local27 << 24 | super.aClass15_Sub1_17.anInt5044, Static373.anIntArray469[super.anIntArray552[arg0] & 0xFFFF]), Static364.method6010(local46 << 24 | super.aClass15_Sub1_17.anInt5044, Static373.anIntArray469[super.anIntArray552[arg0] & 0xFFFF]), Static364.method6010(local65 << 24 | super.aClass15_Sub1_17.anInt5044, Static373.anIntArray469[super.anIntArray552[arg0] & 0xFFFF]));
			} else {
				this.aClass165_2.method4066(super.anIntArray543[local8], super.anIntArray543[local13], super.anIntArray543[local18], super.anIntArray557[local8], super.anIntArray557[local13], super.anIntArray557[local18], super.anIntArray554[local8], super.anIntArray554[local13], super.anIntArray554[local18], Static364.method6010(local27 << 24 | super.aClass15_Sub1_17.anInt5044, Static373.anIntArray469[super.anIntArray552[arg0] & 0xFFFF]), Static364.method6010(local46 << 24 | super.aClass15_Sub1_17.anInt5044, Static373.anIntArray469[super.anIntArray560[arg0] & 0xFFFF]), Static364.method6010(local65 << 24 | super.aClass15_Sub1_17.anInt5044, Static373.anIntArray469[super.anIntArray569[arg0] & 0xFFFF]));
			}
		}
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(Ljava/lang/Thread;)V")
	@Override
	protected void method7173(@OriginalArg(0) Thread arg0) {
		super.method7173(arg0);
		@Pc(8) Class91_Sub2 local8 = (Class91_Sub2) super.aClass15_Sub1_17.method4266(arg0);
		this.aClass165_2 = local8.aClass165_1;
	}

	@OriginalMember(owner = "client!rv", name = "h", descriptor = "(I)V")
	private void method7176(@OriginalArg(0) int arg0) {
		@Pc(4) short local4 = super.aShortArray140[arg0];
		@Pc(9) short local9 = super.aShortArray138[arg0];
		@Pc(14) short local14 = super.aShortArray139[arg0];
		this.aClass165_2.aBoolean408 = super.aBooleanArray35[arg0];
		if (super.aByteArray96 == null) {
			this.aClass165_2.anInt4832 = 0;
		} else {
			this.aClass165_2.anInt4832 = super.aByteArray96[arg0] & 0xFF;
		}
		if (super.aShortArray137 != null && super.aShortArray137[arg0] != -1) {
			@Pc(180) int local180;
			@Pc(185) int local185;
			@Pc(190) int local190;
			if (super.aByteArray95 == null || super.aByteArray95[arg0] == -1) {
				local180 = local4;
				local185 = local9;
				local190 = local14;
			} else {
				@Pc(175) int local175 = super.aByteArray95[arg0] & 0xFF;
				local180 = super.anIntArray537[local175];
				local185 = super.anIntArray556[local175];
				local190 = super.anIntArray549[local175];
			}
			if (super.anIntArray569[arg0] == -1) {
				this.aClass165_2.method4078(super.anIntArray543[local4], super.anIntArray543[local9], super.anIntArray543[local14], super.anIntArray557[local4], super.anIntArray557[local9], super.anIntArray557[local14], super.anIntArray554[local4], super.anIntArray554[local9], super.anIntArray554[local14], super.anIntArray552[arg0], super.anIntArray552[arg0], super.anIntArray552[arg0], super.anIntArray562[local180], super.anIntArray562[local185], super.anIntArray562[local190], super.anIntArray567[local180], super.anIntArray567[local185], super.anIntArray567[local190], super.anIntArray533[local180], super.anIntArray533[local185], super.anIntArray533[local190], super.aShortArray137[arg0]);
			} else {
				this.aClass165_2.method4078(super.anIntArray543[local4], super.anIntArray543[local9], super.anIntArray543[local14], super.anIntArray557[local4], super.anIntArray557[local9], super.anIntArray557[local14], super.anIntArray554[local4], super.anIntArray554[local9], super.anIntArray554[local14], super.anIntArray552[arg0], super.anIntArray560[arg0], super.anIntArray569[arg0], super.anIntArray562[local180], super.anIntArray562[local185], super.anIntArray562[local190], super.anIntArray567[local180], super.anIntArray567[local185], super.anIntArray567[local190], super.anIntArray533[local180], super.anIntArray533[local185], super.anIntArray533[local190], super.aShortArray137[arg0]);
			}
		} else if (super.anIntArray569[arg0] == -1) {
			this.aClass165_2.method4064(super.anIntArray543[local4], super.anIntArray543[local9], super.anIntArray543[local14], super.anIntArray557[local4], super.anIntArray557[local9], super.anIntArray557[local14], super.anIntArray554[local4], super.anIntArray554[local9], super.anIntArray554[local14], Static373.anIntArray469[super.anIntArray552[arg0] & 0xFFFF]);
		} else {
			this.aClass165_2.method4062(super.anIntArray543[local4], super.anIntArray543[local9], super.anIntArray543[local14], super.anIntArray557[local4], super.anIntArray557[local9], super.anIntArray557[local14], super.anIntArray554[local4], super.anIntArray554[local9], super.anIntArray554[local14], super.anIntArray552[arg0] & 0xFFFF, super.anIntArray560[arg0] & 0xFFFF, super.anIntArray569[arg0] & 0xFFFF);
		}
	}

	@OriginalMember(owner = "client!rv", name = "l", descriptor = "()V")
	@Override
	protected void method7158() {
		super.aClass91_5.anInt3721 = this.aClass165_2.anInt4833;
		super.aClass91_5.anInt3722 = this.aClass165_2.anInt4834;
		super.aClass91_5.anInt3720 = this.aClass165_2.anInt4831;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IZZ)V")
	private void method7177(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (super.anIntArray569[arg0] == -2) {
			return;
		}
		@Pc(11) short local11 = super.aShortArray140[arg0];
		@Pc(16) short local16 = super.aShortArray138[arg0];
		@Pc(21) short local21 = super.aShortArray139[arg0];
		@Pc(26) int local26 = super.anIntArray557[local11];
		@Pc(31) int local31 = super.anIntArray557[local16];
		@Pc(36) int local36 = super.anIntArray557[local21];
		@Pc(52) int local52;
		if (arg1 && (local26 == -5000 || local31 == -5000 || local36 == -5000)) {
			local52 = super.anIntArray562[local11];
			@Pc(57) int local57 = super.anIntArray562[local16];
			@Pc(62) int local62 = super.anIntArray562[local21];
			@Pc(67) int local67 = super.anIntArray567[local11];
			@Pc(72) int local72 = super.anIntArray567[local16];
			@Pc(77) int local77 = super.anIntArray567[local21];
			@Pc(82) int local82 = super.anIntArray533[local11];
			@Pc(87) int local87 = super.anIntArray533[local16];
			@Pc(92) int local92 = super.anIntArray533[local21];
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
				this.method7174(arg0);
				return;
			}
		} else if (super.anIntArray538[arg0] != -1 || (local26 - local31) * (super.anIntArray543[local21] - super.anIntArray543[local16]) - (super.anIntArray543[local11] - super.anIntArray543[local16]) * (local36 - local31) > 0) {
			if (local26 >= 0 && local31 >= 0 && local36 >= 0 && local26 <= super.aClass91_5.anInt3721 && local31 <= super.aClass91_5.anInt3721 && local36 <= super.aClass91_5.anInt3721) {
				super.aBooleanArray35[arg0] = false;
			} else {
				super.aBooleanArray35[arg0] = true;
			}
			if (arg2) {
				local52 = super.anIntArray538[arg0];
				if (local52 == -1 || !super.aClass299Array3[local52].aBoolean751) {
					this.method7175(arg0);
				}
				return;
			}
			local52 = super.anIntArray538[arg0];
			if (local52 != -1) {
				@Pc(255) Class299 local255 = super.aClass299Array3[local52];
				@Pc(260) Class206 local260 = super.aClass206Array3[local52];
				if (!local255.aBoolean751) {
					this.method7176(arg0);
				}
				super.aClass15_Sub1_17.method4273(local260.anInt6179, local260.anInt6177, local260.anInt6181, local260.anInt6183, local260.anInt6173, local260.anInt6171, local255.aShort119 & 0xFFFF, local260.anInt6174, local255.aByte97, local255.aByte96);
				return;
			}
			this.method7176(arg0);
		}
	}

	@OriginalMember(owner = "client!rv", name = "d", descriptor = "(I)V")
	@Override
	protected void method7161(@OriginalArg(0) int arg0) {
		this.aClass165_2.aBoolean406 = (arg0 & 0x1) == 0;
		this.aClass165_2.aBoolean405 = false;
	}
}
