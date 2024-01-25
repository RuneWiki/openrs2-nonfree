import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vea")
public final class Class24_Sub1_Sub2 extends Class24_Sub1 {

	@OriginalMember(owner = "client!vea", name = "pc", descriptor = "Lclient!jf;")
	private Class153 aClass153_2;

	@OriginalMember(owner = "client!vea", name = "<init>", descriptor = "(Lclient!fv;Lclient!hn;IIII)V")
	public Class24_Sub1_Sub2(@OriginalArg(0) Class90_Sub2 arg0, @OriginalArg(1) Class134 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!vea", name = "<init>", descriptor = "(Lclient!fv;)V")
	public Class24_Sub1_Sub2(@OriginalArg(0) Class90_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!vea", name = "<init>", descriptor = "(Lclient!fv;[Lclient!vea;)V")
	public Class24_Sub1_Sub2(@OriginalArg(0) Class90_Sub2 arg0, @OriginalArg(1) Class24_Sub1_Sub2[] arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(I)V")
	@Override
	protected void method7403(@OriginalArg(0) int arg0) {
		this.aClass153_2.aBoolean329 = (arg0 & 0x1) == 0;
		this.aClass153_2.aBoolean332 = false;
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(BIZ)Lclient!ba;")
	@Override
	public Class24 method7398(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.method7414(Thread.currentThread());
		@Pc(11) Class24_Sub1 local11;
		@Pc(8) Class24_Sub1 local8;
		if (arg0 == 1) {
			local8 = super.aClass24_Sub1_58;
			local11 = super.aClass24_Sub1_51;
		} else if (arg0 == 2) {
			local8 = super.aClass24_Sub1_59;
			local11 = super.aClass24_Sub1_54;
		} else if (arg0 == 3) {
			local8 = super.aClass24_Sub1_57;
			local11 = super.aClass24_Sub1_55;
		} else if (arg0 == 4) {
			local8 = super.aClass24_Sub1_52;
			local11 = super.aClass24_Sub1_53;
		} else if (arg0 == 5) {
			local8 = super.aClass24_Sub1_56;
			local11 = super.aClass24_Sub1_60;
		} else {
			local11 = local8 = new Class24_Sub1_Sub2(super.aClass90_Sub2_16);
		}
		return this.method7409(local11, local8, arg1, arg0 != 0, arg2);
	}

	@OriginalMember(owner = "client!vea", name = "c", descriptor = "(I)V")
	private void method7426(@OriginalArg(0) int arg0) {
		if (super.aBooleanArray32[arg0]) {
			this.method7427(arg0);
			return;
		}
		@Pc(13) short local13 = super.aShortArray159[arg0];
		@Pc(18) short local18 = super.aShortArray157[arg0];
		@Pc(23) short local23 = super.aShortArray158[arg0];
		this.aClass153_2.aBoolean328 = super.aBooleanArray31[arg0];
		if (super.aByteArray111 == null) {
			this.aClass153_2.anInt4478 = 0;
		} else {
			this.aClass153_2.anInt4478 = super.aByteArray111[arg0] & 0xFF;
		}
		if (super.aShortArray161 != null && super.aShortArray161[arg0] != -1) {
			@Pc(165) int local165;
			@Pc(170) int local170;
			@Pc(175) int local175;
			if (super.aByteArray110 == null || super.aByteArray110[arg0] == -1) {
				local165 = local13;
				local170 = local18;
				local175 = local23;
			} else {
				@Pc(160) int local160 = super.aByteArray110[arg0] & 0xFF;
				local165 = super.lb[local160];
				local170 = super.anIntArray667[local160];
				local175 = super.anIntArray688[local160];
			}
			if (super.anIntArray676[arg0] == -1) {
				this.aClass153_2.method3807(super.anIntArray686[local13], super.anIntArray686[local18], super.anIntArray686[local23], super.anIntArray665[local13], super.anIntArray665[local18], super.anIntArray665[local23], super.anIntArray664[arg0], super.anIntArray664[arg0], super.anIntArray664[arg0], super.anIntArray673[local165], super.anIntArray673[local170], super.anIntArray673[local175], super.anIntArray684[local165], super.anIntArray684[local170], super.anIntArray684[local175], super.anIntArray668[local165], super.anIntArray668[local170], super.anIntArray668[local175], super.aShortArray161[arg0]);
			} else {
				this.aClass153_2.method3807(super.anIntArray686[local13], super.anIntArray686[local18], super.anIntArray686[local23], super.anIntArray665[local13], super.anIntArray665[local18], super.anIntArray665[local23], super.anIntArray664[arg0], super.anIntArray670[arg0], super.anIntArray676[arg0], super.anIntArray673[local165], super.anIntArray673[local170], super.anIntArray673[local175], super.anIntArray684[local165], super.anIntArray684[local170], super.anIntArray684[local175], super.anIntArray668[local165], super.anIntArray668[local170], super.anIntArray668[local175], super.aShortArray161[arg0]);
			}
		} else if (super.anIntArray676[arg0] == -1) {
			this.aClass153_2.method3800(super.anIntArray686[local13], super.anIntArray686[local18], super.anIntArray686[local23], super.anIntArray665[local13], super.anIntArray665[local18], super.anIntArray665[local23], Static246.anIntArray653[super.anIntArray664[arg0] & 0xFFFF]);
		} else {
			this.aClass153_2.method3802(super.anIntArray686[local13], super.anIntArray686[local18], super.anIntArray686[local23], super.anIntArray665[local13], super.anIntArray665[local18], super.anIntArray665[local23], super.anIntArray664[arg0] & 0xFFFF, super.anIntArray670[arg0] & 0xFFFF, super.anIntArray676[arg0] & 0xFFFF);
		}
	}

	@OriginalMember(owner = "client!vea", name = "n", descriptor = "()V")
	@Override
	protected void method7417() {
		super.aClass38_6.anInt7481 = this.aClass153_2.anInt4477;
		super.aClass38_6.anInt7480 = this.aClass153_2.anInt4479;
		super.aClass38_6.anInt7479 = this.aClass153_2.anInt4481;
	}

	@OriginalMember(owner = "client!vea", name = "d", descriptor = "(I)V")
	private void method7427(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = super.aClass90_Sub2_16.anInt8496;
		@Pc(10) short local10 = super.aShortArray159[arg0];
		@Pc(15) short local15 = super.aShortArray157[arg0];
		@Pc(20) short local20 = super.aShortArray158[arg0];
		@Pc(25) int local25 = super.anIntArray668[local10];
		@Pc(30) int local30 = super.anIntArray668[local15];
		@Pc(35) int local35 = super.anIntArray668[local20];
		if (super.aByteArray111 == null) {
			this.aClass153_2.anInt4478 = 0;
		} else {
			this.aClass153_2.anInt4478 = super.aByteArray111[arg0] & 0xFF;
		}
		@Pc(88) int local88;
		@Pc(93) int local93;
		@Pc(100) int local100;
		@Pc(113) int local113;
		if (local25 >= local5) {
			super.anIntArray685[0] = super.anIntArray665[local10];
			super.anIntArray681[0] = super.anIntArray686[local10];
			local1++;
			super.anIntArray675[0] = super.anIntArray664[arg0] & 0xFFFF;
		} else {
			local88 = super.anIntArray673[local10];
			local93 = super.anIntArray684[local10];
			local100 = super.anIntArray664[arg0] & 0xFFFF;
			if (local35 >= local5) {
				local113 = (local5 - local25) * Class24_Sub1.anIntArray693[local35 - local25];
				super.anIntArray685[0] = super.aClass38_6.anInt7480 + (local88 + ((super.anIntArray673[local20] - local88) * local113 >> 16)) * super.aClass90_Sub2_16.anInt8507 / local5;
				super.anIntArray681[0] = super.aClass38_6.anInt7479 + (local93 + ((super.anIntArray684[local20] - local93) * local113 >> 16)) * super.aClass90_Sub2_16.anInt8503 / local5;
				local1++;
				super.anIntArray675[0] = local100 + (((super.anIntArray676[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
			if (local30 >= local5) {
				local113 = (local5 - local25) * Class24_Sub1.anIntArray693[local30 - local25];
				super.anIntArray685[local1] = super.aClass38_6.anInt7480 + (local88 + ((super.anIntArray673[local15] - local88) * local113 >> 16)) * super.aClass90_Sub2_16.anInt8507 / local5;
				super.anIntArray681[local1] = super.aClass38_6.anInt7479 + (local93 + ((super.anIntArray684[local15] - local93) * local113 >> 16)) * super.aClass90_Sub2_16.anInt8503 / local5;
				super.anIntArray675[local1++] = local100 + (((super.anIntArray670[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
		}
		if (local30 >= local5) {
			super.anIntArray685[local1] = super.anIntArray665[local15];
			super.anIntArray681[local1] = super.anIntArray686[local15];
			super.anIntArray675[local1++] = super.anIntArray670[arg0] & 0xFFFF;
		} else {
			local88 = super.anIntArray673[local15];
			local93 = super.anIntArray684[local15];
			local100 = super.anIntArray670[arg0] & 0xFFFF;
			if (local25 >= local5) {
				local113 = (local5 - local30) * Class24_Sub1.anIntArray693[local25 - local30];
				super.anIntArray685[local1] = super.aClass38_6.anInt7480 + (local88 + ((super.anIntArray673[local10] - local88) * local113 >> 16)) * super.aClass90_Sub2_16.anInt8507 / local5;
				super.anIntArray681[local1] = super.aClass38_6.anInt7479 + (local93 + ((super.anIntArray684[local10] - local93) * local113 >> 16)) * super.aClass90_Sub2_16.anInt8503 / local5;
				super.anIntArray675[local1++] = local100 + (((super.anIntArray664[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
			if (local35 >= local5) {
				local113 = (local5 - local30) * Class24_Sub1.anIntArray693[local35 - local30];
				super.anIntArray685[local1] = super.aClass38_6.anInt7480 + (local88 + ((super.anIntArray673[local20] - local88) * local113 >> 16)) * super.aClass90_Sub2_16.anInt8507 / local5;
				super.anIntArray681[local1] = super.aClass38_6.anInt7479 + (local93 + ((super.anIntArray684[local20] - local93) * local113 >> 16)) * super.aClass90_Sub2_16.anInt8503 / local5;
				super.anIntArray675[local1++] = local100 + (((super.anIntArray676[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
		}
		if (local35 >= local5) {
			super.anIntArray685[local1] = super.anIntArray665[local20];
			super.anIntArray681[local1] = super.anIntArray686[local20];
			super.anIntArray675[local1++] = super.anIntArray676[arg0] & 0xFFFF;
		} else {
			local88 = super.anIntArray673[local20];
			local93 = super.anIntArray684[local20];
			local100 = super.anIntArray676[arg0] & 0xFFFF;
			if (local30 >= local5) {
				local113 = (local5 - local35) * Class24_Sub1.anIntArray693[local30 - local35];
				super.anIntArray685[local1] = super.aClass38_6.anInt7480 + (local88 + ((super.anIntArray673[local15] - local88) * local113 >> 16)) * super.aClass90_Sub2_16.anInt8507 / local5;
				super.anIntArray681[local1] = super.aClass38_6.anInt7479 + (local93 + ((super.anIntArray684[local15] - local93) * local113 >> 16)) * super.aClass90_Sub2_16.anInt8503 / local5;
				super.anIntArray675[local1++] = local100 + (((super.anIntArray670[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
			if (local25 >= local5) {
				local113 = (local5 - local35) * Class24_Sub1.anIntArray693[local25 - local35];
				super.anIntArray685[local1] = super.aClass38_6.anInt7480 + (local88 + ((super.anIntArray673[local10] - local88) * local113 >> 16)) * super.aClass90_Sub2_16.anInt8507 / local5;
				super.anIntArray681[local1] = super.aClass38_6.anInt7479 + (local93 + ((super.anIntArray684[local10] - local93) * local113 >> 16)) * super.aClass90_Sub2_16.anInt8503 / local5;
				super.anIntArray675[local1++] = local100 + (((super.anIntArray664[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
		}
		local88 = super.anIntArray685[0];
		local93 = super.anIntArray685[1];
		local100 = super.anIntArray685[2];
		local113 = super.anIntArray681[0];
		@Pc(725) int local725 = super.anIntArray681[1];
		@Pc(730) int local730 = super.anIntArray681[2];
		this.aClass153_2.aBoolean328 = false;
		@Pc(838) int local838;
		@Pc(843) int local843;
		@Pc(848) int local848;
		@Pc(833) int local833;
		if (local1 == 3) {
			if (local88 < 0 || local93 < 0 || local100 < 0 || local88 > super.aClass38_6.anInt7481 || local93 > super.aClass38_6.anInt7481 || local100 > super.aClass38_6.anInt7481) {
				this.aClass153_2.aBoolean328 = true;
			}
			if (super.aShortArray161 != null && super.aShortArray161[arg0] != -1) {
				if (super.aByteArray110 == null || super.aByteArray110[arg0] == -1) {
					local838 = local10;
					local843 = local15;
					local848 = local20;
				} else {
					local833 = super.aByteArray110[arg0] & 0xFF;
					local838 = super.lb[local833];
					local843 = super.anIntArray667[local833];
					local848 = super.anIntArray688[local833];
				}
				if (super.anIntArray676[arg0] == -1) {
					this.aClass153_2.method3807(local113, local725, local730, local88, local93, local100, super.anIntArray664[arg0], super.anIntArray664[arg0], super.anIntArray664[arg0], super.anIntArray673[local838], super.anIntArray673[local843], super.anIntArray673[local848], super.anIntArray684[local838], super.anIntArray684[local843], super.anIntArray684[local848], super.anIntArray668[local838], super.anIntArray668[local843], super.anIntArray668[local848], super.aShortArray161[arg0]);
				} else {
					this.aClass153_2.method3807(local113, local725, local730, local88, local93, local100, super.anIntArray675[0], super.anIntArray675[1], super.anIntArray675[2], super.anIntArray673[local838], super.anIntArray673[local843], super.anIntArray673[local848], super.anIntArray684[local838], super.anIntArray684[local843], super.anIntArray684[local848], super.anIntArray668[local838], super.anIntArray668[local843], super.anIntArray668[local848], super.aShortArray161[arg0]);
				}
			} else if (super.anIntArray676[arg0] == -1) {
				this.aClass153_2.method3800(local113, local725, local730, local88, local93, local100, Static246.anIntArray653[super.anIntArray664[arg0] & 0xFFFF]);
			} else {
				this.aClass153_2.method3802(local113, local725, local730, local88, local93, local100, super.anIntArray675[0], super.anIntArray675[1], super.anIntArray675[2]);
			}
		}
		if (local1 != 4) {
			return;
		}
		if (local88 < 0 || local93 < 0 || local100 < 0 || local88 > super.aClass38_6.anInt7481 || local93 > super.aClass38_6.anInt7481 || local100 > super.aClass38_6.anInt7481 || super.anIntArray685[3] < 0 || super.anIntArray685[3] > super.aClass38_6.anInt7481) {
			this.aClass153_2.aBoolean328 = true;
		}
		if (super.aShortArray161 == null || super.aShortArray161[arg0] == -1) {
			if (super.anIntArray676[arg0] == -1) {
				local838 = Static246.anIntArray653[super.anIntArray664[arg0] & 0xFFFF];
				this.aClass153_2.method3800(local113, local725, local730, local88, local93, local100, local838);
				this.aClass153_2.method3800(local113, local730, super.anIntArray681[3], local88, local100, super.anIntArray685[3], local838);
				return;
			}
			this.aClass153_2.method3802(local113, local725, local730, local88, local93, local100, super.anIntArray675[0], super.anIntArray675[1], super.anIntArray675[2]);
			this.aClass153_2.method3802(local113, local730, super.anIntArray681[3], local88, local100, super.anIntArray685[3], super.anIntArray675[0], super.anIntArray675[2], super.anIntArray675[3]);
			return;
		}
		if (super.aByteArray110 == null || super.aByteArray110[arg0] == -1) {
			local838 = local10;
			local843 = local15;
			local848 = local20;
		} else {
			local833 = super.aByteArray110[arg0] & 0xFF;
			local838 = super.lb[local833];
			local843 = super.anIntArray667[local833];
			local848 = super.anIntArray688[local833];
		}
		@Pc(1168) short local1168 = super.aShortArray161[arg0];
		if (super.anIntArray676[arg0] == -1) {
			this.aClass153_2.method3807(local113, local725, local730, local88, local93, local100, super.anIntArray664[arg0], super.anIntArray664[arg0], super.anIntArray664[arg0], super.anIntArray673[local838], super.anIntArray673[local843], super.anIntArray673[local848], super.anIntArray684[local838], super.anIntArray684[local843], super.anIntArray684[local848], super.anIntArray668[local838], super.anIntArray668[local843], super.anIntArray668[local848], local1168);
			this.aClass153_2.method3807(local113, local730, super.anIntArray681[3], local88, local100, super.anIntArray685[3], super.anIntArray664[arg0], super.anIntArray664[arg0], super.anIntArray664[arg0], super.anIntArray673[local838], super.anIntArray673[local843], super.anIntArray673[local848], super.anIntArray684[local838], super.anIntArray684[local843], super.anIntArray684[local848], super.anIntArray668[local838], super.anIntArray668[local843], super.anIntArray668[local848], local1168);
			return;
		}
		this.aClass153_2.method3807(local113, local725, local730, local88, local93, local100, super.anIntArray675[0], super.anIntArray675[1], super.anIntArray675[2], super.anIntArray673[local838], super.anIntArray673[local843], super.anIntArray673[local848], super.anIntArray684[local838], super.anIntArray684[local843], super.anIntArray684[local848], super.anIntArray668[local838], super.anIntArray668[local843], super.anIntArray668[local848], local1168);
		this.aClass153_2.method3807(local113, local730, super.anIntArray681[3], local88, local100, super.anIntArray685[3], super.anIntArray675[0], super.anIntArray675[2], super.anIntArray675[3], super.anIntArray673[local838], super.anIntArray673[local843], super.anIntArray673[local848], super.anIntArray684[local838], super.anIntArray684[local843], super.anIntArray684[local848], super.anIntArray668[local838], super.anIntArray668[local843], super.anIntArray668[local848], local1168);
	}

	@OriginalMember(owner = "client!vea", name = "j", descriptor = "()V")
	@Override
	protected void method7412() {
		this.aClass153_2 = null;
	}

	@OriginalMember(owner = "client!vea", name = "e", descriptor = "(I)V")
	private void method7428(@OriginalArg(0) int arg0) {
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
		if (!super.aClass90_Sub2_16.aBoolean551) {
			local8 = super.aShortArray159[arg0];
			local13 = super.aShortArray157[arg0];
			local18 = super.aShortArray158[arg0];
			local27 = super.anIntArray661[local8] - super.aClass90_Sub2_16.anInt8505;
			if (local27 > 255) {
				local27 = 255;
			} else if (local27 < 0) {
				local27 = 0;
			}
			local46 = super.anIntArray661[local13] - super.aClass90_Sub2_16.anInt8505;
			if (local46 > 255) {
				local46 = 255;
			} else if (local46 < 0) {
				local46 = 0;
			}
			local65 = super.anIntArray661[local18] - super.aClass90_Sub2_16.anInt8505;
			if (local65 > 255) {
				local65 = 255;
			} else if (local65 < 0) {
				local65 = 0;
			}
			local81 = local27 + local46 + local65;
			if (local81 != 765) {
				if (local81 == 0) {
					this.method7426(arg0);
				} else {
					if (super.aByteArray111 == null) {
						this.aClass153_2.anInt4478 = 0;
					} else {
						this.aClass153_2.anInt4478 = super.aByteArray111[arg0] & 0xFF;
					}
					this.aClass153_2.aBoolean328 = super.aBooleanArray31[arg0];
					if (super.aShortArray161 != null && super.aShortArray161[arg0] != -1) {
						if (super.aByteArray110 == null || super.aByteArray110[arg0] == -1) {
							local309 = local8;
							local314 = local13;
							local319 = local18;
						} else {
							@Pc(304) int local304 = super.aByteArray110[arg0] & 0xFF;
							local309 = super.lb[local304];
							local314 = super.anIntArray667[local304];
							local319 = super.anIntArray688[local304];
						}
						if (super.anIntArray676[arg0] == -1) {
							this.aClass153_2.method3801(super.anIntArray686[local8], super.anIntArray686[local13], super.anIntArray686[local18], super.anIntArray665[local8], super.anIntArray665[local13], super.anIntArray665[local18], super.aClass90_Sub2_16.anInt8499, local27, local46, local65, super.anIntArray664[arg0], super.anIntArray664[arg0], super.anIntArray664[arg0], super.anIntArray673[local309], super.anIntArray673[local314], super.anIntArray673[local319], super.anIntArray684[local309], super.anIntArray684[local314], super.anIntArray684[local319], super.anIntArray668[local309], super.anIntArray668[local314], super.anIntArray668[local319], super.aShortArray161[arg0]);
						} else {
							this.aClass153_2.method3801(super.anIntArray686[local8], super.anIntArray686[local13], super.anIntArray686[local18], super.anIntArray665[local8], super.anIntArray665[local13], super.anIntArray665[local18], super.aClass90_Sub2_16.anInt8499, local27, local46, local65, super.anIntArray664[arg0], super.anIntArray670[arg0], super.anIntArray676[arg0], super.anIntArray673[local309], super.anIntArray673[local314], super.anIntArray673[local319], super.anIntArray684[local309], super.anIntArray684[local314], super.anIntArray684[local319], super.anIntArray668[local309], super.anIntArray668[local314], super.anIntArray668[local319], super.aShortArray161[arg0]);
						}
					} else if (super.anIntArray676[arg0] == -1) {
						this.aClass153_2.method3809(super.anIntArray686[local8], super.anIntArray686[local13], super.anIntArray686[local18], super.anIntArray665[local8], super.anIntArray665[local13], super.anIntArray665[local18], Static277.method4166(local27 << 24 | super.aClass90_Sub2_16.anInt8499, Static246.anIntArray653[super.anIntArray664[arg0] & 0xFFFF]), Static277.method4166(local46 << 24 | super.aClass90_Sub2_16.anInt8499, Static246.anIntArray653[super.anIntArray664[arg0] & 0xFFFF]), Static277.method4166(local65 << 24 | super.aClass90_Sub2_16.anInt8499, Static246.anIntArray653[super.anIntArray664[arg0] & 0xFFFF]));
					} else {
						this.aClass153_2.method3809(super.anIntArray686[local8], super.anIntArray686[local13], super.anIntArray686[local18], super.anIntArray665[local8], super.anIntArray665[local13], super.anIntArray665[local18], Static277.method4166(local27 << 24 | super.aClass90_Sub2_16.anInt8499, Static246.anIntArray653[super.anIntArray664[arg0] & 0xFFFF]), Static277.method4166(local46 << 24 | super.aClass90_Sub2_16.anInt8499, Static246.anIntArray653[super.anIntArray670[arg0] & 0xFFFF]), Static277.method4166(local65 << 24 | super.aClass90_Sub2_16.anInt8499, Static246.anIntArray653[super.anIntArray676[arg0] & 0xFFFF]));
					}
				}
			}
		} else if (!super.aBooleanArray32[arg0]) {
			local8 = super.aShortArray159[arg0];
			local13 = super.aShortArray157[arg0];
			local18 = super.aShortArray158[arg0];
			local27 = 0;
			local46 = 0;
			local65 = 0;
			if (super.anIntArray683[local8] > super.aClass90_Sub2_16.anInt8510) {
				local27 = 255;
			} else if (super.anIntArray683[local8] > super.aClass90_Sub2_16.anInt8498) {
				local27 = (super.aClass90_Sub2_16.anInt8498 - super.anIntArray683[local8]) * 255 / (super.aClass90_Sub2_16.anInt8498 - super.aClass90_Sub2_16.anInt8510);
			}
			if (super.anIntArray683[local13] > super.aClass90_Sub2_16.anInt8510) {
				local46 = 255;
			} else if (super.anIntArray683[local13] > super.aClass90_Sub2_16.anInt8498) {
				local46 = (super.aClass90_Sub2_16.anInt8498 - super.anIntArray683[local13]) * 255 / (super.aClass90_Sub2_16.anInt8498 - super.aClass90_Sub2_16.anInt8510);
			}
			if (super.anIntArray683[local18] > super.aClass90_Sub2_16.anInt8510) {
				local65 = 255;
			} else if (super.anIntArray683[local18] > super.aClass90_Sub2_16.anInt8498) {
				local65 = (super.aClass90_Sub2_16.anInt8498 - super.anIntArray683[local18]) * 255 / (super.aClass90_Sub2_16.anInt8498 - super.aClass90_Sub2_16.anInt8510);
			}
			if (super.aByteArray111 == null) {
				this.aClass153_2.anInt4478 = 0;
			} else {
				this.aClass153_2.anInt4478 = super.aByteArray111[arg0] & 0xFF;
			}
			this.aClass153_2.aBoolean328 = super.aBooleanArray31[arg0];
			if (super.aShortArray161 != null && super.aShortArray161[arg0] != -1) {
				if (super.aByteArray110 == null || super.aByteArray110[arg0] == -1) {
					local81 = local8;
					local309 = local13;
					local314 = local18;
				} else {
					local319 = super.aByteArray110[arg0] & 0xFF;
					local81 = super.lb[local319];
					local309 = super.anIntArray667[local319];
					local314 = super.anIntArray688[local319];
				}
				if (super.anIntArray676[arg0] == -1) {
					this.aClass153_2.method3801(super.anIntArray686[local8], super.anIntArray686[local13], super.anIntArray686[local18], super.anIntArray665[local8], super.anIntArray665[local13], super.anIntArray665[local18], super.aClass90_Sub2_16.anInt8499, local27, local46, local65, super.anIntArray664[arg0], super.anIntArray664[arg0], super.anIntArray664[arg0], super.anIntArray673[local81], super.anIntArray673[local309], super.anIntArray673[local314], super.anIntArray684[local81], super.anIntArray684[local309], super.anIntArray684[local314], super.anIntArray668[local81], super.anIntArray668[local309], super.anIntArray668[local314], super.aShortArray161[arg0]);
				} else {
					this.aClass153_2.method3801(super.anIntArray686[local8], super.anIntArray686[local13], super.anIntArray686[local18], super.anIntArray665[local8], super.anIntArray665[local13], super.anIntArray665[local18], super.aClass90_Sub2_16.anInt8499, local27, local46, local65, super.anIntArray664[arg0], super.anIntArray670[arg0], super.anIntArray676[arg0], super.anIntArray673[local81], super.anIntArray673[local309], super.anIntArray673[local314], super.anIntArray684[local81], super.anIntArray684[local309], super.anIntArray684[local314], super.anIntArray668[local81], super.anIntArray668[local309], super.anIntArray668[local314], super.aShortArray161[arg0]);
				}
			} else if (super.anIntArray676[arg0] == -1) {
				this.aClass153_2.method3809(super.anIntArray686[local8], super.anIntArray686[local13], super.anIntArray686[local18], super.anIntArray665[local8], super.anIntArray665[local13], super.anIntArray665[local18], Static277.method4166(local27 << 24 | super.aClass90_Sub2_16.anInt8499, Static246.anIntArray653[super.anIntArray664[arg0] & 0xFFFF]), Static277.method4166(local46 << 24 | super.aClass90_Sub2_16.anInt8499, Static246.anIntArray653[super.anIntArray664[arg0] & 0xFFFF]), Static277.method4166(local65 << 24 | super.aClass90_Sub2_16.anInt8499, Static246.anIntArray653[super.anIntArray664[arg0] & 0xFFFF]));
			} else {
				this.aClass153_2.method3809(super.anIntArray686[local8], super.anIntArray686[local13], super.anIntArray686[local18], super.anIntArray665[local8], super.anIntArray665[local13], super.anIntArray665[local18], Static277.method4166(local27 << 24 | super.aClass90_Sub2_16.anInt8499, Static246.anIntArray653[super.anIntArray664[arg0] & 0xFFFF]), Static277.method4166(local46 << 24 | super.aClass90_Sub2_16.anInt8499, Static246.anIntArray653[super.anIntArray670[arg0] & 0xFFFF]), Static277.method4166(local65 << 24 | super.aClass90_Sub2_16.anInt8499, Static246.anIntArray653[super.anIntArray676[arg0] & 0xFFFF]));
			}
		}
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(ZZIIZI)V")
	@Override
	protected void method7422(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(12) int local12;
		if (arg3 + 2 > 2200) {
			local12 = Static1.method54(arg3) + 1 - Static136.anInt9344;
			arg3 = (arg3 >> local12) + 2;
		} else {
			local12 = 0;
			arg3 += 2;
		}
		for (@Pc(24) int local24 = 0; local24 < 2200; local24++) {
			super.anIntArray663[local24] = 0;
		}
		@Pc(36) int local36 = 0;
		@Pc(41) int local41;
		if (super.aClass2Array3 != null) {
			local41 = 0;
			while (local41 < super.anInt9347) {
				@Pc(47) Class2 local47 = super.aClass2Array3[local41];
				super.anIntArray666[local47.anInt41] = local41++;
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
		for (local41 = 0; local41 < super.anInt9349; local41++) {
			if (super.anIntArray676[local41] != -2) {
				@Pc(72) short local72 = super.aShortArray159[local41];
				@Pc(77) short local77 = super.aShortArray157[local41];
				@Pc(82) short local82 = super.aShortArray158[local41];
				local87 = super.anIntArray665[local72];
				local92 = super.anIntArray665[local77];
				local97 = super.anIntArray665[local82];
				@Pc(118) int local118;
				if (arg0 && (local87 == -5000 || local92 == -5000 || local97 == -5000)) {
					local113 = super.anIntArray673[local72];
					local118 = super.anIntArray673[local77];
					local123 = super.anIntArray673[local82];
					local128 = super.anIntArray684[local72];
					local133 = super.anIntArray684[local77];
					local138 = super.anIntArray684[local82];
					local143 = super.anIntArray668[local72];
					local148 = super.anIntArray668[local77];
					local153 = super.anIntArray668[local82];
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
						super.aBooleanArray32[local41] = true;
						@Pc(237) int local237 = (super.anIntArray658[local72] + super.anIntArray658[local77] + super.anIntArray658[local82]) / 3 >> local12;
						if (super.anIntArray663[local237] < 64) {
							super.anIntArrayArray81[local237][super.anIntArray663[local237]++] = local41;
						} else {
							@Pc(264) int local264 = super.anIntArray663[local237];
							if (local264 == 64) {
								if (local36 == 512) {
									continue;
								}
								super.anIntArray660[local36] = 0;
								super.anIntArray663[local237] = local264 = local36++ + 65;
							}
							local264 -= 65;
							super.anIntArrayArray80[local264][super.anIntArray660[local264]++] = local41;
						}
					}
				} else if (super.anIntArray666[local41] != -1 || (local87 - local92) * (super.anIntArray686[local82] - super.anIntArray686[local77]) - (super.anIntArray686[local72] - super.anIntArray686[local77]) * (local97 - local92) > 0) {
					super.aBooleanArray32[local41] = false;
					if (local87 >= 0 && local92 >= 0 && local97 >= 0 && local87 <= super.aClass38_6.anInt7481 && local92 <= super.aClass38_6.anInt7481 && local97 <= super.aClass38_6.anInt7481) {
						super.aBooleanArray31[local41] = false;
					} else {
						super.aBooleanArray31[local41] = true;
					}
					local113 = (super.anIntArray658[local72] + super.anIntArray658[local77] + super.anIntArray658[local82]) / 3 >> local12;
					if (super.anIntArray663[local113] < 64) {
						super.anIntArrayArray81[local113][super.anIntArray663[local113]++] = local41;
					} else {
						local118 = super.anIntArray663[local113];
						if (local118 == 64) {
							if (local36 == 512) {
								continue;
							}
							super.anIntArray660[local36] = 0;
							super.anIntArray663[local113] = local118 = local36++ + 65;
						}
						local118 -= 65;
						super.anIntArrayArray80[local118][super.anIntArray660[local118]++] = local41;
					}
				}
			}
		}
		@Pc(467) int local467;
		@Pc(477) int local477;
		@Pc(513) int local513;
		if (arg4) {
			for (local467 = 0; local467 < arg5; local467++) {
				local477 = super.anIntArray674[local467] - arg2 >> local12;
				if (local477 >= 0 && local477 < 2200) {
					if (super.anIntArray663[local477] < 64) {
						super.anIntArrayArray81[local477][super.anIntArray663[local477]++] = local467 + 1 << 16;
					} else {
						local513 = super.anIntArray663[local477];
						if (local513 == 64) {
							if (local36 == 512) {
								continue;
							}
							super.anIntArray660[local36] = 0;
							super.anIntArray663[local477] = local513 = local36++ + 65;
						}
						local513 -= 65;
						super.anIntArrayArray80[local513][super.anIntArray660[local513]++] = local467 + 1 << 16;
					}
				}
			}
		}
		if (super.aByteArray112 == null) {
			@Pc(593) int[] local593;
			if (!arg4 && super.aClass2Array3 == null) {
				if (arg1) {
					for (local467 = arg3 - 1; local467 >= 0; local467--) {
						local477 = super.anIntArray663[local467];
						if (local477 > 0) {
							local513 = local477 > 64 ? 64 : local477;
							local593 = super.anIntArrayArray81[local467];
							for (local92 = 0; local92 < local513; local92++) {
								this.method7428(local593[local92]);
							}
						}
						if (local477 > 64) {
							local513 = super.anIntArray663[local467] - 64 - 1;
							local593 = super.anIntArrayArray80[local513];
							for (local92 = 0; local92 < super.anIntArray660[local513]; local92++) {
								this.method7428(local593[local92]);
							}
						}
					}
				} else {
					for (local467 = arg3 - 1; local467 >= 0; local467--) {
						local477 = super.anIntArray663[local467];
						if (local477 > 0) {
							local513 = local477 > 64 ? 64 : local477;
							local593 = super.anIntArrayArray81[local467];
							for (local92 = 0; local92 < local513; local92++) {
								this.method7426(local593[local92]);
							}
						}
						if (local477 > 64) {
							local513 = super.anIntArray663[local467] - 64 - 1;
							local593 = super.anIntArrayArray80[local513];
							for (local92 = 0; local92 < super.anIntArray660[local513]; local92++) {
								this.method7426(local593[local92]);
							}
						}
					}
				}
			} else if (arg1) {
				for (local467 = arg3 - 1; local467 >= 0; local467--) {
					local477 = super.anIntArray663[local467];
					if (local477 > 0) {
						local513 = local477 > 64 ? 64 : local477;
						local593 = super.anIntArrayArray81[local467];
						for (local92 = 0; local92 < local513; local92++) {
							local97 = local593[local92];
							if (local97 < 65536) {
								local113 = super.anIntArray666[local97];
								if (local113 == -1 || !super.aClass2Array3[local113].aBoolean3) {
									this.method7428(local97);
								}
							}
						}
					}
					if (local477 > 64) {
						local513 = super.anIntArray663[local467] - 64 - 1;
						local593 = super.anIntArrayArray80[local513];
						for (local92 = 0; local92 < super.anIntArray660[local513]; local92++) {
							local97 = local593[local92];
							if (local97 < 65536) {
								local113 = super.anIntArray666[local97];
								if (local113 == -1 || !super.aClass2Array3[local113].aBoolean3) {
									this.method7428(local97);
								}
							}
						}
					}
				}
			} else {
				for (local467 = arg3 - 1; local467 >= 0; local467--) {
					local477 = super.anIntArray663[local467];
					@Pc(726) Class2 local726;
					@Pc(780) Class60_Sub1_Sub1 local780;
					@Pc(731) Class125 local731;
					if (local477 > 0) {
						local513 = local477 > 64 ? 64 : local477;
						local593 = super.anIntArrayArray81[local467];
						for (local92 = 0; local92 < local513; local92++) {
							local97 = local593[local92];
							if (local97 < 65536) {
								local113 = super.anIntArray666[local97];
								if (local113 == -1) {
									this.method7426(local593[local92]);
								} else {
									local726 = super.aClass2Array3[local113];
									local731 = super.aClass125Array3[local113];
									if (!local726.aBoolean3) {
										this.method7426(local97);
									}
									super.aClass90_Sub2_16.method6766(local731.anInt3765, local731.anInt3762, local731.anInt3758, local731.anInt3759, local731.anInt3755, local731.anInt3764, local726.aShort1 & 0xFFFF, local731.anInt3761, local726.aByte2, local726.aByte1);
								}
							} else {
								local113 = (local97 >> 16) - 1;
								local780 = super.aClass60_Sub1_Sub1Array6[local113];
								local123 = super.anIntArray674[local113];
								if (local123 == 0) {
									local123 = 1;
								}
								super.aClass90_Sub2_16.method6754(local780, super.anIntArray682[local113], super.anIntArray690[local113], local123, (local780.anInt2707 * super.aClass90_Sub2_16.anInt8507 >> 12) / local123);
							}
						}
					}
					if (local477 > 64) {
						local513 = super.anIntArray663[local467] - 64 - 1;
						local593 = super.anIntArrayArray80[local513];
						for (local92 = 0; local92 < super.anIntArray660[local513]; local92++) {
							local97 = local593[local92];
							if (local97 < 65536) {
								local113 = super.anIntArray666[local97];
								if (local113 == -1) {
									this.method7426(local593[local92]);
								} else {
									local726 = super.aClass2Array3[local113];
									local731 = super.aClass125Array3[local113];
									if (!local726.aBoolean3) {
										this.method7426(local97);
									}
									super.aClass90_Sub2_16.method6766(local731.anInt3765, local731.anInt3762, local731.anInt3758, local731.anInt3759, local731.anInt3755, local731.anInt3764, local726.aShort1 & 0xFFFF, local731.anInt3761, local726.aByte2, local726.aByte1);
								}
							} else {
								local113 = (local97 >> 16) - 1;
								local780 = super.aClass60_Sub1_Sub1Array6[local113];
								local123 = super.anIntArray674[local113];
								if (local123 == 0) {
									local123 = 1;
								}
								super.aClass90_Sub2_16.method6754(local780, super.anIntArray682[local113], super.anIntArray690[local113], local123, (local780.anInt2707 * super.aClass90_Sub2_16.anInt8507 >> 12) / local123);
							}
						}
					}
				}
			}
			return;
		}
		for (local467 = 0; local467 < 12; local467++) {
			super.anIntArray680[local467] = 0;
			super.anIntArray659[local467] = 0;
		}
		@Pc(1143) int[] local1143;
		@Pc(1158) byte local1158;
		if (arg4) {
			for (local477 = arg3 - 1; local477 >= 0; local477--) {
				local513 = super.anIntArray663[local477];
				if (local513 > 0) {
					if (local513 > 64) {
						local87 = 64;
					} else {
						local87 = local513;
					}
					local1143 = super.anIntArrayArray81[local477];
					for (local97 = 0; local97 < local87; local97++) {
						local113 = local1143[local97];
						if (local113 < 65536) {
							local1158 = super.aByteArray112[local113];
							local123 = super.anIntArray680[local1158]++;
							super.anIntArrayArray79[local1158][local123] = local113;
							if (local1158 < 10) {
								super.anIntArray659[local1158] += local477;
							} else if (local1158 == 10) {
								super.anIntArray678[local123] = local477;
							} else {
								super.anIntArray689[local123] = local477;
							}
						} else {
							local1158 = super.aClass60_Sub1_Sub1Array6[(local113 >> 16) - 1].aByte31;
							local123 = super.anIntArray680[local1158]++;
							super.anIntArrayArray79[local1158][local123] = local113;
							if (local1158 < 10) {
								super.anIntArray659[local1158] += local477;
							} else if (local1158 == 10) {
								super.anIntArray678[local123] = local477;
							} else {
								super.anIntArray689[local123] = local477;
							}
						}
					}
				}
				if (local513 > 64) {
					local87 = super.anIntArray663[local477] - 64 - 1;
					local1143 = super.anIntArrayArray80[local87];
					for (local97 = 0; local97 < super.anIntArray660[local87]; local97++) {
						local113 = local1143[local97];
						if (local113 < 65536) {
							local1158 = super.aByteArray112[local113];
							local123 = super.anIntArray680[local1158]++;
							super.anIntArrayArray79[local1158][local123] = local113;
							if (local1158 < 10) {
								super.anIntArray659[local1158] += local477;
							} else if (local1158 == 10) {
								super.anIntArray678[local123] = local477;
							} else {
								super.anIntArray689[local123] = local477;
							}
						} else {
							local1158 = super.aClass60_Sub1_Sub1Array6[(local113 >> 16) - 1].aByte31;
							local123 = super.anIntArray680[local1158]++;
							super.anIntArrayArray79[local1158][local123] = local113;
							if (local1158 < 10) {
								super.anIntArray659[local1158] += local477;
							} else if (local1158 == 10) {
								super.anIntArray678[local123] = local477;
							} else {
								super.anIntArray689[local123] = local477;
							}
						}
					}
				}
			}
		} else {
			for (local477 = arg3 - 1; local477 >= 0; local477--) {
				local513 = super.anIntArray663[local477];
				if (local513 > 0) {
					if (local513 > 64) {
						local87 = 64;
					} else {
						local87 = local513;
					}
					local1143 = super.anIntArrayArray81[local477];
					for (local97 = 0; local97 < local87; local97++) {
						local113 = local1143[local97];
						local1158 = super.aByteArray112[local113];
						local123 = super.anIntArray680[local1158]++;
						super.anIntArrayArray79[local1158][local123] = local113;
						if (local1158 < 10) {
							super.anIntArray659[local1158] += local477;
						} else if (local1158 == 10) {
							super.anIntArray678[local123] = local477;
						} else {
							super.anIntArray689[local123] = local477;
						}
					}
				}
				if (local513 > 64) {
					local87 = super.anIntArray663[local477] - 64 - 1;
					local1143 = super.anIntArrayArray80[local87];
					for (local97 = 0; local97 < super.anIntArray660[local87]; local97++) {
						local113 = local1143[local97];
						local1158 = super.aByteArray112[local113];
						local123 = super.anIntArray680[local1158]++;
						super.anIntArrayArray79[local1158][local123] = local113;
						if (local1158 < 10) {
							super.anIntArray659[local1158] += local477;
						} else if (local1158 == 10) {
							super.anIntArray678[local123] = local477;
						} else {
							super.anIntArray689[local123] = local477;
						}
					}
				}
			}
		}
		local477 = 0;
		if (super.anIntArray680[1] > 0 || super.anIntArray680[2] > 0) {
			local477 = (super.anIntArray659[1] + super.anIntArray659[2]) / (super.anIntArray680[1] + super.anIntArray680[2]);
		}
		local513 = 0;
		if (super.anIntArray680[3] > 0 || super.anIntArray680[4] > 0) {
			local513 = (super.anIntArray659[3] + super.anIntArray659[4]) / (super.anIntArray680[3] + super.anIntArray680[4]);
		}
		local87 = 0;
		if (super.anIntArray680[6] > 0 || super.anIntArray680[8] > 0) {
			local87 = (super.anIntArray659[6] + super.anIntArray659[8]) / (super.anIntArray680[6] + super.anIntArray680[8]);
		}
		local97 = 0;
		local113 = super.anIntArray680[10];
		@Pc(1673) int[] local1673 = super.anIntArrayArray79[10];
		@Pc(1676) int[] local1676 = super.anIntArray678;
		if (local113 == 0) {
			local97 = 0;
			local113 = super.anIntArray680[11];
			local1673 = super.anIntArrayArray79[11];
			local1676 = super.anIntArray689;
		}
		if (local113 > 0) {
			local92 = local1676[0];
		} else {
			local92 = -1000;
		}
		@Pc(1928) Class2 local1928;
		@Pc(1980) Class60_Sub1_Sub1 local1980;
		@Pc(1933) Class125 local1933;
		for (local128 = 0; local128 < 10; local128++) {
			if (arg1) {
				while (local128 == 0 && local92 > local477) {
					local133 = local1673[local97++];
					if (local133 < 65536) {
						local138 = super.anIntArray666[local133];
						if (local138 == -1 || !super.aClass2Array3[local138].aBoolean3) {
							this.method7428(local133);
						}
					}
					if (local97 == local113 && local1673 != super.anIntArrayArray79[11]) {
						local97 = 0;
						local113 = super.anIntArray680[11];
						local1673 = super.anIntArrayArray79[11];
						local1676 = super.anIntArray689;
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
						local138 = super.anIntArray666[local133];
						if (local138 == -1 || !super.aClass2Array3[local138].aBoolean3) {
							this.method7428(local133);
						}
					}
					if (local97 == local113 && local1673 != super.anIntArrayArray79[11]) {
						local97 = 0;
						local113 = super.anIntArray680[11];
						local1673 = super.anIntArrayArray79[11];
						local1676 = super.anIntArray689;
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
						local138 = super.anIntArray666[local133];
						if (local138 == -1 || !super.aClass2Array3[local138].aBoolean3) {
							this.method7428(local133);
						}
					}
					if (local97 == local113 && local1673 != super.anIntArrayArray79[11]) {
						local97 = 0;
						local113 = super.anIntArray680[11];
						local1673 = super.anIntArrayArray79[11];
						local1676 = super.anIntArray689;
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
						local138 = super.anIntArray666[local133];
						if (local138 == -1) {
							this.method7426(local133);
						} else {
							local1928 = super.aClass2Array3[local138];
							local1933 = super.aClass125Array3[local138];
							if (!local1928.aBoolean3) {
								this.method7426(local133);
							}
							super.aClass90_Sub2_16.method6766(local1933.anInt3765, local1933.anInt3762, local1933.anInt3758, local1933.anInt3759, local1933.anInt3755, local1933.anInt3764, local1928.aShort1 & 0xFFFF, local1933.anInt3761, local1928.aByte2, local1928.aByte1);
						}
					} else {
						local138 = (local133 >> 16) - 1;
						local1980 = super.aClass60_Sub1_Sub1Array6[local138];
						local148 = super.anIntArray674[local138];
						if (local148 == 0) {
							local148 = 1;
						}
						super.aClass90_Sub2_16.method6754(local1980, super.anIntArray682[local138], super.anIntArray690[local138], local148, (local1980.anInt2707 * super.aClass90_Sub2_16.anInt8507 >> 12) / local148);
					}
					if (local97 == local113 && local1673 != super.anIntArrayArray79[11]) {
						local97 = 0;
						local113 = super.anIntArray680[11];
						local1673 = super.anIntArrayArray79[11];
						local1676 = super.anIntArray689;
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
						local138 = super.anIntArray666[local133];
						if (local138 == -1) {
							this.method7426(local133);
						} else {
							local1928 = super.aClass2Array3[local138];
							local1933 = super.aClass125Array3[local138];
							if (!local1928.aBoolean3) {
								this.method7426(local133);
							}
							super.aClass90_Sub2_16.method6766(local1933.anInt3765, local1933.anInt3762, local1933.anInt3758, local1933.anInt3759, local1933.anInt3755, local1933.anInt3764, local1928.aShort1 & 0xFFFF, local1933.anInt3761, local1928.aByte2, local1928.aByte1);
						}
					} else {
						local138 = (local133 >> 16) - 1;
						local1980 = super.aClass60_Sub1_Sub1Array6[local138];
						local148 = super.anIntArray674[local138];
						if (local148 == 0) {
							local148 = 1;
						}
						super.aClass90_Sub2_16.method6754(local1980, super.anIntArray682[local138], super.anIntArray690[local138], local148, (local1980.anInt2707 * super.aClass90_Sub2_16.anInt8507 >> 12) / local148);
					}
					if (local97 == local113 && local1673 != super.anIntArrayArray79[11]) {
						local97 = 0;
						local113 = super.anIntArray680[11];
						local1673 = super.anIntArrayArray79[11];
						local1676 = super.anIntArray689;
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
						local138 = super.anIntArray666[local133];
						if (local138 == -1) {
							this.method7426(local133);
						} else {
							local1928 = super.aClass2Array3[local138];
							local1933 = super.aClass125Array3[local138];
							if (!local1928.aBoolean3) {
								this.method7426(local133);
							}
							super.aClass90_Sub2_16.method6766(local1933.anInt3765, local1933.anInt3762, local1933.anInt3758, local1933.anInt3759, local1933.anInt3755, local1933.anInt3764, local1928.aShort1 & 0xFFFF, local1933.anInt3761, local1928.aByte2, local1928.aByte1);
						}
					} else {
						local138 = (local133 >> 16) - 1;
						local1980 = super.aClass60_Sub1_Sub1Array6[local138];
						local148 = super.anIntArray674[local138];
						if (local148 == 0) {
							local148 = 1;
						}
						super.aClass90_Sub2_16.method6754(local1980, super.anIntArray682[local138], super.anIntArray690[local138], local148, (local1980.anInt2707 * super.aClass90_Sub2_16.anInt8507 >> 12) / local148);
					}
					if (local97 == local113 && local1673 != super.anIntArrayArray79[11]) {
						local97 = 0;
						local113 = super.anIntArray680[11];
						local1673 = super.anIntArrayArray79[11];
						local1676 = super.anIntArray689;
					}
					if (local97 < local113) {
						local92 = local1676[local97];
					} else {
						local92 = -1000;
					}
				}
			}
			local133 = super.anIntArray680[local128];
			@Pc(2353) int[] local2353 = super.anIntArrayArray79[local128];
			if (!arg4 && super.aClass2Array3 == null) {
				if (arg1) {
					for (local143 = 0; local143 < local133; local143++) {
						this.method7428(local2353[local143]);
					}
				} else {
					for (local143 = 0; local143 < local133; local143++) {
						this.method7426(local2353[local143]);
					}
				}
			} else if (arg1) {
				for (local143 = 0; local143 < local133; local143++) {
					local148 = local2353[local143];
					if (local148 < 65536) {
						local153 = super.anIntArray666[local148];
						if (local153 == -1 || !super.aClass2Array3[local153].aBoolean3) {
							this.method7428(local148);
						}
					}
				}
			} else {
				for (local143 = 0; local143 < local133; local143++) {
					local148 = local2353[local143];
					if (local148 < 65536) {
						local153 = super.anIntArray666[local148];
						if (local153 == -1) {
							this.method7426(local148);
						} else {
							@Pc(2415) Class2 local2415 = super.aClass2Array3[local153];
							@Pc(2420) Class125 local2420 = super.aClass125Array3[local153];
							if (!local2415.aBoolean3) {
								this.method7426(local148);
							}
							super.aClass90_Sub2_16.method6766(local2420.anInt3765, local2420.anInt3762, local2420.anInt3758, local2420.anInt3759, local2420.anInt3755, local2420.anInt3764, local2415.aShort1 & 0xFFFF, local2420.anInt3761, local2415.aByte2, local2415.aByte1);
						}
					} else {
						local153 = (local148 >> 16) - 1;
						@Pc(2467) Class60_Sub1_Sub1 local2467 = super.aClass60_Sub1_Sub1Array6[local153];
						local193 = super.anIntArray674[local153];
						if (local193 == 0) {
							local193 = 1;
						}
						super.aClass90_Sub2_16.method6754(local2467, super.anIntArray682[local153], super.anIntArray690[local153], local193, (local2467.anInt2707 * super.aClass90_Sub2_16.anInt8507 >> 12) / local193);
					}
				}
			}
		}
		if (!arg4 && super.aClass2Array3 == null) {
			if (arg1) {
				while (local92 != -1000) {
					this.method7428(local1673[local97++]);
					if (local97 == local113 && local1673 != super.anIntArrayArray79[11]) {
						local97 = 0;
						local1673 = super.anIntArrayArray79[11];
						local113 = super.anIntArray680[11];
						local1676 = super.anIntArray689;
					}
					if (local97 < local113) {
						local92 = local1676[local97];
					} else {
						local92 = -1000;
					}
				}
			} else {
				while (local92 != -1000) {
					this.method7426(local1673[local97++]);
					if (local97 == local113 && local1673 != super.anIntArrayArray79[11]) {
						local97 = 0;
						local1673 = super.anIntArrayArray79[11];
						local113 = super.anIntArray680[11];
						local1676 = super.anIntArray689;
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
					local138 = super.anIntArray666[local133];
					if (local138 == -1 || !super.aClass2Array3[local138].aBoolean3) {
						this.method7428(local133);
					}
				}
				if (local97 == local113 && local1673 != super.anIntArrayArray79[11]) {
					local97 = 0;
					local1673 = super.anIntArrayArray79[11];
					local113 = super.anIntArray680[11];
					local1676 = super.anIntArray689;
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
					local138 = super.anIntArray666[local133];
					if (local138 == -1) {
						this.method7426(local133);
					} else {
						local1928 = super.aClass2Array3[local138];
						local1933 = super.aClass125Array3[local138];
						if (!local1928.aBoolean3) {
							this.method7426(local133);
						}
						super.aClass90_Sub2_16.method6766(local1933.anInt3765, local1933.anInt3762, local1933.anInt3758, local1933.anInt3759, local1933.anInt3755, local1933.anInt3764, local1928.aShort1 & 0xFFFF, local1933.anInt3761, local1928.aByte2, local1928.aByte1);
					}
				} else {
					local138 = (local133 >> 16) - 1;
					local1980 = super.aClass60_Sub1_Sub1Array6[local138];
					local148 = super.anIntArray674[local138];
					if (local148 == 0) {
						local148 = 1;
					}
					super.aClass90_Sub2_16.method6754(local1980, super.anIntArray682[local138], super.anIntArray690[local138], local148, (local1980.anInt2707 * super.aClass90_Sub2_16.anInt8507 >> 12) / local148);
				}
				if (local97 == local113 && local1673 != super.anIntArrayArray79[11]) {
					local97 = 0;
					local1673 = super.anIntArrayArray79[11];
					local113 = super.anIntArray680[11];
					local1676 = super.anIntArray689;
				}
				if (local97 < local113) {
					local92 = local1676[local97];
				} else {
					local92 = -1000;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vea", name = "b", descriptor = "(Ljava/lang/Thread;)V")
	@Override
	protected void method7423(@OriginalArg(0) Thread arg0) {
		super.method7423(arg0);
		@Pc(8) Class38_Sub1 local8 = (Class38_Sub1) super.aClass90_Sub2_16.method6761(arg0);
		this.aClass153_2 = local8.aClass153_1;
		super.anIntArray658 = local8.anIntArray92;
		super.anIntArray663 = local8.anIntArray94;
		super.anIntArrayArray81 = local8.anIntArrayArray4;
		super.anIntArray660 = local8.lb;
		super.anIntArrayArray80 = local8.anIntArrayArray6;
		super.anIntArray680 = local8.anIntArray93;
		super.anIntArrayArray79 = local8.anIntArrayArray5;
		super.anIntArray678 = local8.anIntArray90;
		super.anIntArray689 = local8.anIntArray91;
		super.anIntArray659 = local8.anIntArray89;
	}
}
