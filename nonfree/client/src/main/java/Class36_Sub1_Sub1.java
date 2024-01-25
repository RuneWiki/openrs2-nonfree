import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bp")
public final class Class36_Sub1_Sub1 extends Class36_Sub1 {

	@OriginalMember(owner = "client!bp", name = "nc", descriptor = "Lclient!wq;")
	private Class317 aClass317_1;

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lclient!vda;)V")
	public Class36_Sub1_Sub1(@OriginalArg(0) Class62_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lclient!vda;[Lclient!bp;)V")
	public Class36_Sub1_Sub1(@OriginalArg(0) Class62_Sub2 arg0, @OriginalArg(1) Class36_Sub1_Sub1[] arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lclient!vda;Lclient!ld;IIII)V")
	public Class36_Sub1_Sub1(@OriginalArg(0) Class62_Sub2 arg0, @OriginalArg(1) Class184 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!bp", name = "h", descriptor = "(I)V")
	private void method1024(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = super.aClass62_Sub2_17.anInt8677;
		@Pc(10) short local10 = super.aShortArray148[arg0];
		@Pc(15) short local15 = super.aShortArray144[arg0];
		@Pc(20) short local20 = super.aShortArray147[arg0];
		@Pc(25) int local25 = super.anIntArray710[local10];
		@Pc(30) int local30 = super.anIntArray710[local15];
		@Pc(35) int local35 = super.anIntArray710[local20];
		if (super.aByteArray127 == null) {
			this.aClass317_1.anInt9123 = 0;
		} else {
			this.aClass317_1.anInt9123 = super.aByteArray127[arg0] & 0xFF;
		}
		@Pc(88) int local88;
		@Pc(93) int local93;
		@Pc(100) int local100;
		@Pc(113) int local113;
		if (local25 >= local5) {
			super.anIntArray708[0] = super.anIntArray705[local10];
			super.anIntArray698[0] = super.anIntArray715[local10];
			local1++;
			super.anIntArray724[0] = super.lb[arg0] & 0xFFFF;
		} else {
			local88 = super.anIntArray718[local10];
			local93 = super.anIntArray692[local10];
			local100 = super.lb[arg0] & 0xFFFF;
			if (local35 >= local5) {
				local113 = (local5 - local25) * Class36_Sub1.anIntArray725[local35 - local25];
				super.anIntArray708[0] = super.aClass178_6.anInt6944 + (local88 + ((super.anIntArray718[local20] - local88) * local113 >> 16)) * super.aClass62_Sub2_17.anInt8674 / local5;
				super.anIntArray698[0] = super.aClass178_6.anInt6943 + (local93 + ((super.anIntArray692[local20] - local93) * local113 >> 16)) * super.aClass62_Sub2_17.anInt8689 / local5;
				local1++;
				super.anIntArray724[0] = local100 + (((super.anIntArray711[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
			if (local30 >= local5) {
				local113 = (local5 - local25) * Class36_Sub1.anIntArray725[local30 - local25];
				super.anIntArray708[local1] = super.aClass178_6.anInt6944 + (local88 + ((super.anIntArray718[local15] - local88) * local113 >> 16)) * super.aClass62_Sub2_17.anInt8674 / local5;
				super.anIntArray698[local1] = super.aClass178_6.anInt6943 + (local93 + ((super.anIntArray692[local15] - local93) * local113 >> 16)) * super.aClass62_Sub2_17.anInt8689 / local5;
				super.anIntArray724[local1++] = local100 + (((super.anIntArray706[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
		}
		if (local30 >= local5) {
			super.anIntArray708[local1] = super.anIntArray705[local15];
			super.anIntArray698[local1] = super.anIntArray715[local15];
			super.anIntArray724[local1++] = super.anIntArray706[arg0] & 0xFFFF;
		} else {
			local88 = super.anIntArray718[local15];
			local93 = super.anIntArray692[local15];
			local100 = super.anIntArray706[arg0] & 0xFFFF;
			if (local25 >= local5) {
				local113 = (local5 - local30) * Class36_Sub1.anIntArray725[local25 - local30];
				super.anIntArray708[local1] = super.aClass178_6.anInt6944 + (local88 + ((super.anIntArray718[local10] - local88) * local113 >> 16)) * super.aClass62_Sub2_17.anInt8674 / local5;
				super.anIntArray698[local1] = super.aClass178_6.anInt6943 + (local93 + ((super.anIntArray692[local10] - local93) * local113 >> 16)) * super.aClass62_Sub2_17.anInt8689 / local5;
				super.anIntArray724[local1++] = local100 + (((super.lb[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
			if (local35 >= local5) {
				local113 = (local5 - local30) * Class36_Sub1.anIntArray725[local35 - local30];
				super.anIntArray708[local1] = super.aClass178_6.anInt6944 + (local88 + ((super.anIntArray718[local20] - local88) * local113 >> 16)) * super.aClass62_Sub2_17.anInt8674 / local5;
				super.anIntArray698[local1] = super.aClass178_6.anInt6943 + (local93 + ((super.anIntArray692[local20] - local93) * local113 >> 16)) * super.aClass62_Sub2_17.anInt8689 / local5;
				super.anIntArray724[local1++] = local100 + (((super.anIntArray711[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
		}
		if (local35 >= local5) {
			super.anIntArray708[local1] = super.anIntArray705[local20];
			super.anIntArray698[local1] = super.anIntArray715[local20];
			super.anIntArray724[local1++] = super.anIntArray711[arg0] & 0xFFFF;
		} else {
			local88 = super.anIntArray718[local20];
			local93 = super.anIntArray692[local20];
			local100 = super.anIntArray711[arg0] & 0xFFFF;
			if (local30 >= local5) {
				local113 = (local5 - local35) * Class36_Sub1.anIntArray725[local30 - local35];
				super.anIntArray708[local1] = super.aClass178_6.anInt6944 + (local88 + ((super.anIntArray718[local15] - local88) * local113 >> 16)) * super.aClass62_Sub2_17.anInt8674 / local5;
				super.anIntArray698[local1] = super.aClass178_6.anInt6943 + (local93 + ((super.anIntArray692[local15] - local93) * local113 >> 16)) * super.aClass62_Sub2_17.anInt8689 / local5;
				super.anIntArray724[local1++] = local100 + (((super.anIntArray706[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
			if (local25 >= local5) {
				local113 = (local5 - local35) * Class36_Sub1.anIntArray725[local25 - local35];
				super.anIntArray708[local1] = super.aClass178_6.anInt6944 + (local88 + ((super.anIntArray718[local10] - local88) * local113 >> 16)) * super.aClass62_Sub2_17.anInt8674 / local5;
				super.anIntArray698[local1] = super.aClass178_6.anInt6943 + (local93 + ((super.anIntArray692[local10] - local93) * local113 >> 16)) * super.aClass62_Sub2_17.anInt8689 / local5;
				super.anIntArray724[local1++] = local100 + (((super.lb[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
		}
		local88 = super.anIntArray708[0];
		local93 = super.anIntArray708[1];
		local100 = super.anIntArray708[2];
		this.aClass317_1.aBoolean669 = false;
		@Pc(766) boolean local766;
		if (local1 == 3) {
			if (local88 < 0 || local93 < 0 || local100 < 0 || local88 > super.aClass178_6.anInt6945 || local93 > super.aClass178_6.anInt6945 || local100 > super.aClass178_6.anInt6945) {
				this.aClass317_1.aBoolean669 = true;
			}
			if (super.aShortArray143 != null && super.aShortArray143[arg0] != -1) {
				if (super.aByteArray130 == null || super.aByteArray130[arg0] == -1) {
					local766 = false;
				} else {
					local766 = true;
				}
			}
		}
		if (local1 != 4) {
			return;
		}
		if (local88 < 0 || local93 < 0 || local100 < 0 || local88 > super.aClass178_6.anInt6945 || local93 > super.aClass178_6.anInt6945 || local100 > super.aClass178_6.anInt6945 || super.anIntArray708[3] < 0 || super.anIntArray708[3] > super.aClass178_6.anInt6945) {
			this.aClass317_1.aBoolean669 = true;
		}
		if (super.aShortArray143 == null || super.aShortArray143[arg0] == -1) {
			return;
		}
		if (super.aByteArray130 == null || super.aByteArray130[arg0] == -1) {
			local766 = false;
		} else {
			local766 = true;
		}
	}

	@OriginalMember(owner = "client!bp", name = "h", descriptor = "()V")
	@Override
	protected void method7366() {
		this.aClass317_1 = null;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(BIZ)Lclient!r;")
	@Override
	public Class36 method7356(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.method7363(Thread.currentThread());
		@Pc(11) Class36_Sub1 local11;
		@Pc(8) Class36_Sub1 local8;
		if (arg0 == 1) {
			local8 = super.aClass36_Sub1_60;
			local11 = super.aClass36_Sub1_51;
		} else if (arg0 == 2) {
			local8 = super.aClass36_Sub1_56;
			local11 = super.aClass36_Sub1_58;
		} else if (arg0 == 3) {
			local8 = super.aClass36_Sub1_59;
			local11 = super.aClass36_Sub1_53;
		} else if (arg0 == 4) {
			local8 = super.aClass36_Sub1_54;
			local11 = super.aClass36_Sub1_52;
		} else if (arg0 == 5) {
			local8 = super.aClass36_Sub1_55;
			local11 = super.aClass36_Sub1_57;
		} else {
			local11 = local8 = new Class36_Sub1_Sub1(super.aClass62_Sub2_17);
		}
		return this.method7373(local11, local8, arg1, arg0 != 0, arg2);
	}

	@OriginalMember(owner = "client!bp", name = "c", descriptor = "(I)V")
	@Override
	protected void method7372(@OriginalArg(0) int arg0) {
		this.aClass317_1.aBoolean667 = (arg0 & 0x1) == 0;
		this.aClass317_1.aBoolean666 = false;
	}

	@OriginalMember(owner = "client!bp", name = "o", descriptor = "()V")
	@Override
	protected void method7380() {
		super.aClass178_6.anInt6945 = this.aClass317_1.anInt9122;
		super.aClass178_6.anInt6944 = this.aClass317_1.anInt9121;
		super.aClass178_6.anInt6943 = this.aClass317_1.anInt9124;
	}

	@OriginalMember(owner = "client!bp", name = "e", descriptor = "(I)V")
	@Override
	protected void method7386(@OriginalArg(0) int arg0) {
		if (super.aBooleanArray38[arg0]) {
			this.method1024(arg0);
			return;
		}
		@Pc(13) short local13 = super.aShortArray148[arg0];
		@Pc(18) short local18 = super.aShortArray144[arg0];
		@Pc(23) short local23 = super.aShortArray147[arg0];
		this.aClass317_1.aBoolean669 = super.aBooleanArray39[arg0];
		if (super.aByteArray127 == null) {
			this.aClass317_1.anInt9123 = 0;
		} else {
			this.aClass317_1.anInt9123 = super.aByteArray127[arg0] & 0xFF;
		}
		if (super.aShortArray143 != null && super.aShortArray143[arg0] != -1) {
			@Pc(189) int local189;
			@Pc(194) int local194;
			@Pc(199) int local199;
			if (super.aByteArray130 == null || super.aByteArray130[arg0] == -1) {
				local189 = local13;
				local194 = local18;
				local199 = local23;
			} else {
				@Pc(184) int local184 = super.aByteArray130[arg0] & 0xFF;
				local189 = super.anIntArray713[local184];
				local194 = super.anIntArray722[local184];
				local199 = super.anIntArray696[local184];
			}
			if (super.anIntArray711[arg0] == -1) {
				this.aClass317_1.method7416(super.anIntArray715[local13], super.anIntArray715[local18], super.anIntArray715[local23], super.anIntArray705[local13], super.anIntArray705[local18], super.anIntArray705[local23], super.anIntArray703[local13], super.anIntArray703[local18], super.anIntArray703[local23], super.lb[arg0], super.lb[arg0], super.lb[arg0], super.anIntArray718[local189], super.anIntArray718[local194], super.anIntArray718[local199], super.anIntArray692[local189], super.anIntArray692[local194], super.anIntArray692[local199], super.anIntArray710[local189], super.anIntArray710[local194], super.anIntArray710[local199], super.aShortArray143[arg0]);
			} else {
				this.aClass317_1.method7416(super.anIntArray715[local13], super.anIntArray715[local18], super.anIntArray715[local23], super.anIntArray705[local13], super.anIntArray705[local18], super.anIntArray705[local23], super.anIntArray703[local13], super.anIntArray703[local18], super.anIntArray703[local23], super.lb[arg0], super.anIntArray706[arg0], super.anIntArray711[arg0], super.anIntArray718[local189], super.anIntArray718[local194], super.anIntArray718[local199], super.anIntArray692[local189], super.anIntArray692[local194], super.anIntArray692[local199], super.anIntArray710[local189], super.anIntArray710[local194], super.anIntArray710[local199], super.aShortArray143[arg0]);
			}
		} else if (super.anIntArray711[arg0] == -1) {
			this.aClass317_1.method7412(super.anIntArray715[local13], super.anIntArray715[local18], super.anIntArray715[local23], super.anIntArray705[local13], super.anIntArray705[local18], super.anIntArray705[local23], super.anIntArray703[local13], super.anIntArray703[local18], super.anIntArray703[local23], Static403.anIntArray560[super.lb[arg0] & 0xFFFF]);
		} else {
			this.aClass317_1.method7413(super.anIntArray715[local13], super.anIntArray715[local18], super.anIntArray715[local23], super.anIntArray705[local13], super.anIntArray705[local18], super.anIntArray705[local23], super.anIntArray703[local13], super.anIntArray703[local18], super.anIntArray703[local23], super.lb[arg0] & 0xFFFF, super.anIntArray706[arg0] & 0xFFFF, super.anIntArray711[arg0] & 0xFFFF);
		}
	}

	@OriginalMember(owner = "client!bp", name = "d", descriptor = "(I)V")
	@Override
	protected void method7382(@OriginalArg(0) int arg0) {
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
		if (!super.aClass62_Sub2_17.aBoolean631) {
			local8 = super.aShortArray148[arg0];
			local13 = super.aShortArray144[arg0];
			local18 = super.aShortArray147[arg0];
			local27 = super.anIntArray703[local8] - super.aClass62_Sub2_17.anInt8682;
			if (local27 > 255) {
				local27 = 255;
			} else if (local27 < 0) {
				local27 = 0;
			}
			local46 = super.anIntArray703[local13] - super.aClass62_Sub2_17.anInt8682;
			if (local46 > 255) {
				local46 = 255;
			} else if (local46 < 0) {
				local46 = 0;
			}
			local65 = super.anIntArray703[local18] - super.aClass62_Sub2_17.anInt8682;
			if (local65 > 255) {
				local65 = 255;
			} else if (local65 < 0) {
				local65 = 0;
			}
			local81 = local27 + local46 + local65;
			if (local81 != 765) {
				if (local81 == 0) {
					this.method7386(arg0);
				} else {
					if (super.aByteArray127 == null) {
						this.aClass317_1.anInt9123 = 0;
					} else {
						this.aClass317_1.anInt9123 = super.aByteArray127[arg0] & 0xFF;
					}
					this.aClass317_1.aBoolean669 = super.aBooleanArray39[arg0];
					if (super.aShortArray143 != null && super.aShortArray143[arg0] != -1) {
						if (super.aByteArray130 == null || super.aByteArray130[arg0] == -1) {
							local333 = local8;
							local338 = local13;
							local343 = local18;
						} else {
							@Pc(328) int local328 = super.aByteArray130[arg0] & 0xFF;
							local333 = super.anIntArray713[local328];
							local338 = super.anIntArray722[local328];
							local343 = super.anIntArray696[local328];
						}
						if (super.anIntArray711[arg0] == -1) {
							this.aClass317_1.method7408(super.anIntArray715[local8], super.anIntArray715[local13], super.anIntArray715[local18], super.anIntArray705[local8], super.anIntArray705[local13], super.anIntArray705[local18], super.anIntArray703[local8], super.anIntArray703[local13], super.anIntArray703[local18], super.aClass62_Sub2_17.anInt8684, local27, local46, local65, super.lb[arg0], super.lb[arg0], super.lb[arg0], super.anIntArray718[local333], super.anIntArray718[local338], super.anIntArray718[local343], super.anIntArray692[local333], super.anIntArray692[local338], super.anIntArray692[local343], super.anIntArray710[local333], super.anIntArray710[local338], super.anIntArray710[local343], super.aShortArray143[arg0]);
						} else {
							this.aClass317_1.method7408(super.anIntArray715[local8], super.anIntArray715[local13], super.anIntArray715[local18], super.anIntArray705[local8], super.anIntArray705[local13], super.anIntArray705[local18], super.anIntArray703[local8], super.anIntArray703[local13], super.anIntArray703[local18], super.aClass62_Sub2_17.anInt8684, local27, local46, local65, super.lb[arg0], super.anIntArray706[arg0], super.anIntArray711[arg0], super.anIntArray718[local333], super.anIntArray718[local338], super.anIntArray718[local343], super.anIntArray692[local333], super.anIntArray692[local338], super.anIntArray692[local343], super.anIntArray710[local333], super.anIntArray710[local338], super.anIntArray710[local343], super.aShortArray143[arg0]);
						}
					} else if (super.anIntArray711[arg0] == -1) {
						this.aClass317_1.method7405(super.anIntArray715[local8], super.anIntArray715[local13], super.anIntArray715[local18], super.anIntArray705[local8], super.anIntArray705[local13], super.anIntArray705[local18], super.anIntArray703[local8], super.anIntArray703[local13], super.anIntArray703[local18], Static75.method1354(local27 << 24 | super.aClass62_Sub2_17.anInt8684, Static403.anIntArray560[super.lb[arg0] & 0xFFFF]), Static75.method1354(local46 << 24 | super.aClass62_Sub2_17.anInt8684, Static403.anIntArray560[super.lb[arg0] & 0xFFFF]), Static75.method1354(local65 << 24 | super.aClass62_Sub2_17.anInt8684, Static403.anIntArray560[super.lb[arg0] & 0xFFFF]));
					} else {
						this.aClass317_1.method7405(super.anIntArray715[local8], super.anIntArray715[local13], super.anIntArray715[local18], super.anIntArray705[local8], super.anIntArray705[local13], super.anIntArray705[local18], super.anIntArray703[local8], super.anIntArray703[local13], super.anIntArray703[local18], Static75.method1354(local27 << 24 | super.aClass62_Sub2_17.anInt8684, Static403.anIntArray560[super.lb[arg0] & 0xFFFF]), Static75.method1354(local46 << 24 | super.aClass62_Sub2_17.anInt8684, Static403.anIntArray560[super.anIntArray706[arg0] & 0xFFFF]), Static75.method1354(local65 << 24 | super.aClass62_Sub2_17.anInt8684, Static403.anIntArray560[super.anIntArray711[arg0] & 0xFFFF]));
					}
				}
			}
		} else if (!super.aBooleanArray38[arg0]) {
			local8 = super.aShortArray148[arg0];
			local13 = super.aShortArray144[arg0];
			local18 = super.aShortArray147[arg0];
			local27 = 0;
			local46 = 0;
			local65 = 0;
			if (super.anIntArray701[local8] > super.aClass62_Sub2_17.anInt8675) {
				local27 = 255;
			} else if (super.anIntArray701[local8] > super.aClass62_Sub2_17.anInt8667) {
				local27 = (super.aClass62_Sub2_17.anInt8667 - super.anIntArray701[local8]) * 255 / (super.aClass62_Sub2_17.anInt8667 - super.aClass62_Sub2_17.anInt8675);
			}
			if (super.anIntArray701[local13] > super.aClass62_Sub2_17.anInt8675) {
				local46 = 255;
			} else if (super.anIntArray701[local13] > super.aClass62_Sub2_17.anInt8667) {
				local46 = (super.aClass62_Sub2_17.anInt8667 - super.anIntArray701[local13]) * 255 / (super.aClass62_Sub2_17.anInt8667 - super.aClass62_Sub2_17.anInt8675);
			}
			if (super.anIntArray701[local18] > super.aClass62_Sub2_17.anInt8675) {
				local65 = 255;
			} else if (super.anIntArray701[local18] > super.aClass62_Sub2_17.anInt8667) {
				local65 = (super.aClass62_Sub2_17.anInt8667 - super.anIntArray701[local18]) * 255 / (super.aClass62_Sub2_17.anInt8667 - super.aClass62_Sub2_17.anInt8675);
			}
			if (super.aByteArray127 == null) {
				this.aClass317_1.anInt9123 = 0;
			} else {
				this.aClass317_1.anInt9123 = super.aByteArray127[arg0] & 0xFF;
			}
			this.aClass317_1.aBoolean669 = super.aBooleanArray39[arg0];
			if (super.aShortArray143 != null && super.aShortArray143[arg0] != -1) {
				if (super.aByteArray130 == null || super.aByteArray130[arg0] == -1) {
					local81 = local8;
					local333 = local13;
					local338 = local18;
				} else {
					local343 = super.aByteArray130[arg0] & 0xFF;
					local81 = super.anIntArray713[local343];
					local333 = super.anIntArray722[local343];
					local338 = super.anIntArray696[local343];
				}
				if (super.anIntArray711[arg0] == -1) {
					this.aClass317_1.method7408(super.anIntArray715[local8], super.anIntArray715[local13], super.anIntArray715[local18], super.anIntArray705[local8], super.anIntArray705[local13], super.anIntArray705[local18], super.anIntArray703[local8], super.anIntArray703[local13], super.anIntArray703[local18], super.aClass62_Sub2_17.anInt8684, local27, local46, local65, super.lb[arg0], super.lb[arg0], super.lb[arg0], super.anIntArray718[local81], super.anIntArray718[local333], super.anIntArray718[local338], super.anIntArray692[local81], super.anIntArray692[local333], super.anIntArray692[local338], super.anIntArray710[local81], super.anIntArray710[local333], super.anIntArray710[local338], super.aShortArray143[arg0]);
				} else {
					this.aClass317_1.method7408(super.anIntArray715[local8], super.anIntArray715[local13], super.anIntArray715[local18], super.anIntArray705[local8], super.anIntArray705[local13], super.anIntArray705[local18], super.anIntArray703[local8], super.anIntArray703[local13], super.anIntArray703[local18], super.aClass62_Sub2_17.anInt8684, local27, local46, local65, super.lb[arg0], super.anIntArray706[arg0], super.anIntArray711[arg0], super.anIntArray718[local81], super.anIntArray718[local333], super.anIntArray718[local338], super.anIntArray692[local81], super.anIntArray692[local333], super.anIntArray692[local338], super.anIntArray710[local81], super.anIntArray710[local333], super.anIntArray710[local338], super.aShortArray143[arg0]);
				}
			} else if (super.anIntArray711[arg0] == -1) {
				this.aClass317_1.method7405(super.anIntArray715[local8], super.anIntArray715[local13], super.anIntArray715[local18], super.anIntArray705[local8], super.anIntArray705[local13], super.anIntArray705[local18], super.anIntArray703[local8], super.anIntArray703[local13], super.anIntArray703[local18], Static75.method1354(local27 << 24 | super.aClass62_Sub2_17.anInt8684, Static403.anIntArray560[super.lb[arg0] & 0xFFFF]), Static75.method1354(local46 << 24 | super.aClass62_Sub2_17.anInt8684, Static403.anIntArray560[super.lb[arg0] & 0xFFFF]), Static75.method1354(local65 << 24 | super.aClass62_Sub2_17.anInt8684, Static403.anIntArray560[super.lb[arg0] & 0xFFFF]));
			} else {
				this.aClass317_1.method7405(super.anIntArray715[local8], super.anIntArray715[local13], super.anIntArray715[local18], super.anIntArray705[local8], super.anIntArray705[local13], super.anIntArray705[local18], super.anIntArray703[local8], super.anIntArray703[local13], super.anIntArray703[local18], Static75.method1354(local27 << 24 | super.aClass62_Sub2_17.anInt8684, Static403.anIntArray560[super.lb[arg0] & 0xFFFF]), Static75.method1354(local46 << 24 | super.aClass62_Sub2_17.anInt8684, Static403.anIntArray560[super.anIntArray706[arg0] & 0xFFFF]), Static75.method1354(local65 << 24 | super.aClass62_Sub2_17.anInt8684, Static403.anIntArray560[super.anIntArray711[arg0] & 0xFFFF]));
			}
		}
	}

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(Ljava/lang/Thread;)V")
	@Override
	protected void method7376(@OriginalArg(0) Thread arg0) {
		super.method7376(arg0);
		@Pc(8) Class178_Sub1 local8 = (Class178_Sub1) super.aClass62_Sub2_17.method7071(arg0);
		this.aClass317_1 = local8.aClass317_2;
	}
}
