import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class2_Sub1_Sub2 extends Class2_Sub1 {

	@OriginalMember(owner = "client!pe", name = "vc", descriptor = "Lclient!caa;")
	private Class40 aClass40_1;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lclient!fk;[Lclient!pe;)V")
	public Class2_Sub1_Sub2(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) Class2_Sub1_Sub2[] arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lclient!fk;Lclient!or;IIII)V")
	public Class2_Sub1_Sub2(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) Class222 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lclient!fk;)V")
	public Class2_Sub1_Sub2(@OriginalArg(0) Class5_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)V")
	@Override
	protected void method5813(@OriginalArg(0) int arg0) {
		this.aClass40_1.aBoolean82 = (arg0 & 0x1) == 0;
		this.aClass40_1.aBoolean86 = false;
	}

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "(I)V")
	@Override
	protected void method5815(@OriginalArg(0) int arg0) {
		if (super.aBooleanArray33[arg0]) {
			this.method5816(arg0);
			return;
		}
		@Pc(13) short local13 = super.aShortArray167[arg0];
		@Pc(18) short local18 = super.aShortArray168[arg0];
		@Pc(23) short local23 = super.aShortArray163[arg0];
		this.aClass40_1.aBoolean84 = super.aBooleanArray32[arg0];
		if (super.aByteArray77 == null) {
			this.aClass40_1.anInt1115 = 0;
		} else {
			this.aClass40_1.anInt1115 = super.aByteArray77[arg0] & 0xFF;
		}
		if (super.aShortArray164 != null && super.aShortArray164[arg0] != -1) {
			@Pc(189) int local189;
			@Pc(194) int local194;
			@Pc(199) int local199;
			if (super.aByteArray78 == null || super.aByteArray78[arg0] == -1) {
				local189 = local13;
				local194 = local18;
				local199 = local23;
			} else {
				@Pc(184) int local184 = super.aByteArray78[arg0] & 0xFF;
				local189 = super.anIntArray599[local184];
				local194 = super.anIntArray600[local184];
				local199 = super.anIntArray609[local184];
			}
			if (super.anIntArray590[arg0] == -1) {
				this.aClass40_1.method1046(super.anIntArray601[local13], super.anIntArray601[local18], super.anIntArray601[local23], super.anIntArray584[local13], super.anIntArray584[local18], super.anIntArray584[local23], super.anIntArray618[local13], super.anIntArray618[local18], super.anIntArray618[local23], super.anIntArray594[arg0], super.anIntArray594[arg0], super.anIntArray594[arg0], super.anIntArray611[local189], super.anIntArray611[local194], super.anIntArray611[local199], super.anIntArray616[local189], super.anIntArray616[local194], super.anIntArray616[local199], super.anIntArray592[local189], super.anIntArray592[local194], super.anIntArray592[local199], super.aShortArray164[arg0]);
			} else {
				this.aClass40_1.method1046(super.anIntArray601[local13], super.anIntArray601[local18], super.anIntArray601[local23], super.anIntArray584[local13], super.anIntArray584[local18], super.anIntArray584[local23], super.anIntArray618[local13], super.anIntArray618[local18], super.anIntArray618[local23], super.anIntArray594[arg0], super.anIntArray617[arg0], super.anIntArray590[arg0], super.anIntArray611[local189], super.anIntArray611[local194], super.anIntArray611[local199], super.anIntArray616[local189], super.anIntArray616[local194], super.anIntArray616[local199], super.anIntArray592[local189], super.anIntArray592[local194], super.anIntArray592[local199], super.aShortArray164[arg0]);
			}
		} else if (super.anIntArray590[arg0] == -1) {
			this.aClass40_1.method1047(super.anIntArray601[local13], super.anIntArray601[local18], super.anIntArray601[local23], super.anIntArray584[local13], super.anIntArray584[local18], super.anIntArray584[local23], super.anIntArray618[local13], super.anIntArray618[local18], super.anIntArray618[local23], Static457.anIntArray710[super.anIntArray594[arg0] & 0xFFFF]);
		} else {
			this.aClass40_1.method1041(super.anIntArray601[local13], super.anIntArray601[local18], super.anIntArray601[local23], super.anIntArray584[local13], super.anIntArray584[local18], super.anIntArray584[local23], super.anIntArray618[local13], super.anIntArray618[local18], super.anIntArray618[local23], super.anIntArray594[arg0] & 0xFFFF, super.anIntArray617[arg0] & 0xFFFF, super.anIntArray590[arg0] & 0xFFFF);
		}
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V")
	@Override
	protected void method5812(@OriginalArg(0) int arg0) {
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
		if (!super.aClass5_Sub2_15.aBoolean669) {
			local8 = super.aShortArray167[arg0];
			local13 = super.aShortArray168[arg0];
			local18 = super.aShortArray163[arg0];
			local27 = super.anIntArray618[local8] - super.aClass5_Sub2_15.anInt9062;
			if (local27 > 255) {
				local27 = 255;
			} else if (local27 < 0) {
				local27 = 0;
			}
			local46 = super.anIntArray618[local13] - super.aClass5_Sub2_15.anInt9062;
			if (local46 > 255) {
				local46 = 255;
			} else if (local46 < 0) {
				local46 = 0;
			}
			local65 = super.anIntArray618[local18] - super.aClass5_Sub2_15.anInt9062;
			if (local65 > 255) {
				local65 = 255;
			} else if (local65 < 0) {
				local65 = 0;
			}
			local81 = local27 + local46 + local65;
			if (local81 != 765) {
				if (local81 == 0) {
					this.method5815(arg0);
				} else {
					if (super.aByteArray77 == null) {
						this.aClass40_1.anInt1115 = 0;
					} else {
						this.aClass40_1.anInt1115 = super.aByteArray77[arg0] & 0xFF;
					}
					this.aClass40_1.aBoolean84 = super.aBooleanArray32[arg0];
					if (super.aShortArray164 != null && super.aShortArray164[arg0] != -1) {
						if (super.aByteArray78 == null || super.aByteArray78[arg0] == -1) {
							local333 = local8;
							local338 = local13;
							local343 = local18;
						} else {
							@Pc(328) int local328 = super.aByteArray78[arg0] & 0xFF;
							local333 = super.anIntArray599[local328];
							local338 = super.anIntArray600[local328];
							local343 = super.anIntArray609[local328];
						}
						if (super.anIntArray590[arg0] == -1) {
							this.aClass40_1.method1043(super.anIntArray601[local8], super.anIntArray601[local13], super.anIntArray601[local18], super.anIntArray584[local8], super.anIntArray584[local13], super.anIntArray584[local18], super.anIntArray618[local8], super.anIntArray618[local13], super.anIntArray618[local18], super.aClass5_Sub2_15.anInt9059, local27, local46, local65, super.anIntArray594[arg0], super.anIntArray594[arg0], super.anIntArray594[arg0], super.anIntArray611[local333], super.anIntArray611[local338], super.anIntArray611[local343], super.anIntArray616[local333], super.anIntArray616[local338], super.anIntArray616[local343], super.anIntArray592[local333], super.anIntArray592[local338], super.anIntArray592[local343], super.aShortArray164[arg0]);
						} else {
							this.aClass40_1.method1043(super.anIntArray601[local8], super.anIntArray601[local13], super.anIntArray601[local18], super.anIntArray584[local8], super.anIntArray584[local13], super.anIntArray584[local18], super.anIntArray618[local8], super.anIntArray618[local13], super.anIntArray618[local18], super.aClass5_Sub2_15.anInt9059, local27, local46, local65, super.anIntArray594[arg0], super.anIntArray617[arg0], super.anIntArray590[arg0], super.anIntArray611[local333], super.anIntArray611[local338], super.anIntArray611[local343], super.anIntArray616[local333], super.anIntArray616[local338], super.anIntArray616[local343], super.anIntArray592[local333], super.anIntArray592[local338], super.anIntArray592[local343], super.aShortArray164[arg0]);
						}
					} else if (super.anIntArray590[arg0] == -1) {
						this.aClass40_1.method1050(super.anIntArray601[local8], super.anIntArray601[local13], super.anIntArray601[local18], super.anIntArray584[local8], super.anIntArray584[local13], super.anIntArray584[local18], super.anIntArray618[local8], super.anIntArray618[local13], super.anIntArray618[local18], Static499.method3120(Static457.anIntArray710[super.anIntArray594[arg0] & 0xFFFF], local27 << 24 | super.aClass5_Sub2_15.anInt9059), Static499.method3120(Static457.anIntArray710[super.anIntArray594[arg0] & 0xFFFF], local46 << 24 | super.aClass5_Sub2_15.anInt9059), Static499.method3120(Static457.anIntArray710[super.anIntArray594[arg0] & 0xFFFF], local65 << 24 | super.aClass5_Sub2_15.anInt9059));
					} else {
						this.aClass40_1.method1050(super.anIntArray601[local8], super.anIntArray601[local13], super.anIntArray601[local18], super.anIntArray584[local8], super.anIntArray584[local13], super.anIntArray584[local18], super.anIntArray618[local8], super.anIntArray618[local13], super.anIntArray618[local18], Static499.method3120(Static457.anIntArray710[super.anIntArray594[arg0] & 0xFFFF], local27 << 24 | super.aClass5_Sub2_15.anInt9059), Static499.method3120(Static457.anIntArray710[super.anIntArray617[arg0] & 0xFFFF], local46 << 24 | super.aClass5_Sub2_15.anInt9059), Static499.method3120(Static457.anIntArray710[super.anIntArray590[arg0] & 0xFFFF], local65 << 24 | super.aClass5_Sub2_15.anInt9059));
					}
				}
			}
		} else if (!super.aBooleanArray33[arg0]) {
			local8 = super.aShortArray167[arg0];
			local13 = super.aShortArray168[arg0];
			local18 = super.aShortArray163[arg0];
			local27 = 0;
			local46 = 0;
			local65 = 0;
			if (super.anIntArray593[local8] > super.aClass5_Sub2_15.anInt9063) {
				local27 = 255;
			} else if (super.anIntArray593[local8] > super.aClass5_Sub2_15.anInt9077) {
				local27 = (super.aClass5_Sub2_15.anInt9077 - super.anIntArray593[local8]) * 255 / (super.aClass5_Sub2_15.anInt9077 - super.aClass5_Sub2_15.anInt9063);
			}
			if (super.anIntArray593[local13] > super.aClass5_Sub2_15.anInt9063) {
				local46 = 255;
			} else if (super.anIntArray593[local13] > super.aClass5_Sub2_15.anInt9077) {
				local46 = (super.aClass5_Sub2_15.anInt9077 - super.anIntArray593[local13]) * 255 / (super.aClass5_Sub2_15.anInt9077 - super.aClass5_Sub2_15.anInt9063);
			}
			if (super.anIntArray593[local18] > super.aClass5_Sub2_15.anInt9063) {
				local65 = 255;
			} else if (super.anIntArray593[local18] > super.aClass5_Sub2_15.anInt9077) {
				local65 = (super.aClass5_Sub2_15.anInt9077 - super.anIntArray593[local18]) * 255 / (super.aClass5_Sub2_15.anInt9077 - super.aClass5_Sub2_15.anInt9063);
			}
			if (super.aByteArray77 == null) {
				this.aClass40_1.anInt1115 = 0;
			} else {
				this.aClass40_1.anInt1115 = super.aByteArray77[arg0] & 0xFF;
			}
			this.aClass40_1.aBoolean84 = super.aBooleanArray32[arg0];
			if (super.aShortArray164 != null && super.aShortArray164[arg0] != -1) {
				if (super.aByteArray78 == null || super.aByteArray78[arg0] == -1) {
					local81 = local8;
					local333 = local13;
					local338 = local18;
				} else {
					local343 = super.aByteArray78[arg0] & 0xFF;
					local81 = super.anIntArray599[local343];
					local333 = super.anIntArray600[local343];
					local338 = super.anIntArray609[local343];
				}
				if (super.anIntArray590[arg0] == -1) {
					this.aClass40_1.method1043(super.anIntArray601[local8], super.anIntArray601[local13], super.anIntArray601[local18], super.anIntArray584[local8], super.anIntArray584[local13], super.anIntArray584[local18], super.anIntArray618[local8], super.anIntArray618[local13], super.anIntArray618[local18], super.aClass5_Sub2_15.anInt9059, local27, local46, local65, super.anIntArray594[arg0], super.anIntArray594[arg0], super.anIntArray594[arg0], super.anIntArray611[local81], super.anIntArray611[local333], super.anIntArray611[local338], super.anIntArray616[local81], super.anIntArray616[local333], super.anIntArray616[local338], super.anIntArray592[local81], super.anIntArray592[local333], super.anIntArray592[local338], super.aShortArray164[arg0]);
				} else {
					this.aClass40_1.method1043(super.anIntArray601[local8], super.anIntArray601[local13], super.anIntArray601[local18], super.anIntArray584[local8], super.anIntArray584[local13], super.anIntArray584[local18], super.anIntArray618[local8], super.anIntArray618[local13], super.anIntArray618[local18], super.aClass5_Sub2_15.anInt9059, local27, local46, local65, super.anIntArray594[arg0], super.anIntArray617[arg0], super.anIntArray590[arg0], super.anIntArray611[local81], super.anIntArray611[local333], super.anIntArray611[local338], super.anIntArray616[local81], super.anIntArray616[local333], super.anIntArray616[local338], super.anIntArray592[local81], super.anIntArray592[local333], super.anIntArray592[local338], super.aShortArray164[arg0]);
				}
			} else if (super.anIntArray590[arg0] == -1) {
				this.aClass40_1.method1050(super.anIntArray601[local8], super.anIntArray601[local13], super.anIntArray601[local18], super.anIntArray584[local8], super.anIntArray584[local13], super.anIntArray584[local18], super.anIntArray618[local8], super.anIntArray618[local13], super.anIntArray618[local18], Static499.method3120(Static457.anIntArray710[super.anIntArray594[arg0] & 0xFFFF], local27 << 24 | super.aClass5_Sub2_15.anInt9059), Static499.method3120(Static457.anIntArray710[super.anIntArray594[arg0] & 0xFFFF], local46 << 24 | super.aClass5_Sub2_15.anInt9059), Static499.method3120(Static457.anIntArray710[super.anIntArray594[arg0] & 0xFFFF], local65 << 24 | super.aClass5_Sub2_15.anInt9059));
			} else {
				this.aClass40_1.method1050(super.anIntArray601[local8], super.anIntArray601[local13], super.anIntArray601[local18], super.anIntArray584[local8], super.anIntArray584[local13], super.anIntArray584[local18], super.anIntArray618[local8], super.anIntArray618[local13], super.anIntArray618[local18], Static499.method3120(Static457.anIntArray710[super.anIntArray594[arg0] & 0xFFFF], local27 << 24 | super.aClass5_Sub2_15.anInt9059), Static499.method3120(Static457.anIntArray710[super.anIntArray617[arg0] & 0xFFFF], local46 << 24 | super.aClass5_Sub2_15.anInt9059), Static499.method3120(Static457.anIntArray710[super.anIntArray590[arg0] & 0xFFFF], local65 << 24 | super.aClass5_Sub2_15.anInt9059));
			}
		}
	}

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)V")
	private void method5816(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = super.aClass5_Sub2_15.anInt9075;
		@Pc(10) short local10 = super.aShortArray167[arg0];
		@Pc(15) short local15 = super.aShortArray168[arg0];
		@Pc(20) short local20 = super.aShortArray163[arg0];
		@Pc(25) int local25 = super.anIntArray592[local10];
		@Pc(30) int local30 = super.anIntArray592[local15];
		@Pc(35) int local35 = super.anIntArray592[local20];
		if (super.aByteArray77 == null) {
			this.aClass40_1.anInt1115 = 0;
		} else {
			this.aClass40_1.anInt1115 = super.aByteArray77[arg0] & 0xFF;
		}
		@Pc(88) int local88;
		@Pc(93) int local93;
		@Pc(100) int local100;
		@Pc(113) int local113;
		if (local25 >= local5) {
			super.anIntArray588[0] = super.anIntArray584[local10];
			super.anIntArray608[0] = super.anIntArray601[local10];
			local1++;
			super.anIntArray613[0] = super.anIntArray594[arg0] & 0xFFFF;
		} else {
			local88 = super.anIntArray611[local10];
			local93 = super.anIntArray616[local10];
			local100 = super.anIntArray594[arg0] & 0xFFFF;
			if (local35 >= local5) {
				local113 = (local5 - local25) * Class2_Sub1.anIntArray619[local35 - local25];
				super.anIntArray588[0] = super.aClass99_6.anInt5662 + (local88 + ((super.anIntArray611[local20] - local88) * local113 >> 16)) * super.aClass5_Sub2_15.anInt9056 / local5;
				super.anIntArray608[0] = super.aClass99_6.anInt5663 + (local93 + ((super.anIntArray616[local20] - local93) * local113 >> 16)) * super.aClass5_Sub2_15.anInt9053 / local5;
				local1++;
				super.anIntArray613[0] = local100 + (((super.anIntArray590[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
			if (local30 >= local5) {
				local113 = (local5 - local25) * Class2_Sub1.anIntArray619[local30 - local25];
				super.anIntArray588[local1] = super.aClass99_6.anInt5662 + (local88 + ((super.anIntArray611[local15] - local88) * local113 >> 16)) * super.aClass5_Sub2_15.anInt9056 / local5;
				super.anIntArray608[local1] = super.aClass99_6.anInt5663 + (local93 + ((super.anIntArray616[local15] - local93) * local113 >> 16)) * super.aClass5_Sub2_15.anInt9053 / local5;
				super.anIntArray613[local1++] = local100 + (((super.anIntArray617[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
		}
		if (local30 >= local5) {
			super.anIntArray588[local1] = super.anIntArray584[local15];
			super.anIntArray608[local1] = super.anIntArray601[local15];
			super.anIntArray613[local1++] = super.anIntArray617[arg0] & 0xFFFF;
		} else {
			local88 = super.anIntArray611[local15];
			local93 = super.anIntArray616[local15];
			local100 = super.anIntArray617[arg0] & 0xFFFF;
			if (local25 >= local5) {
				local113 = (local5 - local30) * Class2_Sub1.anIntArray619[local25 - local30];
				super.anIntArray588[local1] = super.aClass99_6.anInt5662 + (local88 + ((super.anIntArray611[local10] - local88) * local113 >> 16)) * super.aClass5_Sub2_15.anInt9056 / local5;
				super.anIntArray608[local1] = super.aClass99_6.anInt5663 + (local93 + ((super.anIntArray616[local10] - local93) * local113 >> 16)) * super.aClass5_Sub2_15.anInt9053 / local5;
				super.anIntArray613[local1++] = local100 + (((super.anIntArray594[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
			if (local35 >= local5) {
				local113 = (local5 - local30) * Class2_Sub1.anIntArray619[local35 - local30];
				super.anIntArray588[local1] = super.aClass99_6.anInt5662 + (local88 + ((super.anIntArray611[local20] - local88) * local113 >> 16)) * super.aClass5_Sub2_15.anInt9056 / local5;
				super.anIntArray608[local1] = super.aClass99_6.anInt5663 + (local93 + ((super.anIntArray616[local20] - local93) * local113 >> 16)) * super.aClass5_Sub2_15.anInt9053 / local5;
				super.anIntArray613[local1++] = local100 + (((super.anIntArray590[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
		}
		if (local35 >= local5) {
			super.anIntArray588[local1] = super.anIntArray584[local20];
			super.anIntArray608[local1] = super.anIntArray601[local20];
			super.anIntArray613[local1++] = super.anIntArray590[arg0] & 0xFFFF;
		} else {
			local88 = super.anIntArray611[local20];
			local93 = super.anIntArray616[local20];
			local100 = super.anIntArray590[arg0] & 0xFFFF;
			if (local30 >= local5) {
				local113 = (local5 - local35) * Class2_Sub1.anIntArray619[local30 - local35];
				super.anIntArray588[local1] = super.aClass99_6.anInt5662 + (local88 + ((super.anIntArray611[local15] - local88) * local113 >> 16)) * super.aClass5_Sub2_15.anInt9056 / local5;
				super.anIntArray608[local1] = super.aClass99_6.anInt5663 + (local93 + ((super.anIntArray616[local15] - local93) * local113 >> 16)) * super.aClass5_Sub2_15.anInt9053 / local5;
				super.anIntArray613[local1++] = local100 + (((super.anIntArray617[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
			if (local25 >= local5) {
				local113 = (local5 - local35) * Class2_Sub1.anIntArray619[local25 - local35];
				super.anIntArray588[local1] = super.aClass99_6.anInt5662 + (local88 + ((super.anIntArray611[local10] - local88) * local113 >> 16)) * super.aClass5_Sub2_15.anInt9056 / local5;
				super.anIntArray608[local1] = super.aClass99_6.anInt5663 + (local93 + ((super.anIntArray616[local10] - local93) * local113 >> 16)) * super.aClass5_Sub2_15.anInt9053 / local5;
				super.anIntArray613[local1++] = local100 + (((super.anIntArray594[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
		}
		local88 = super.anIntArray588[0];
		local93 = super.anIntArray588[1];
		local100 = super.anIntArray588[2];
		this.aClass40_1.aBoolean84 = false;
		@Pc(766) boolean local766;
		if (local1 == 3) {
			if (local88 < 0 || local93 < 0 || local100 < 0 || local88 > super.aClass99_6.anInt5661 || local93 > super.aClass99_6.anInt5661 || local100 > super.aClass99_6.anInt5661) {
				this.aClass40_1.aBoolean84 = true;
			}
			if (super.aShortArray164 != null && super.aShortArray164[arg0] != -1) {
				if (super.aByteArray78 == null || super.aByteArray78[arg0] == -1) {
					local766 = false;
				} else {
					local766 = true;
				}
			}
		}
		if (local1 != 4) {
			return;
		}
		if (local88 < 0 || local93 < 0 || local100 < 0 || local88 > super.aClass99_6.anInt5661 || local93 > super.aClass99_6.anInt5661 || local100 > super.aClass99_6.anInt5661 || super.anIntArray588[3] < 0 || super.anIntArray588[3] > super.aClass99_6.anInt5661) {
			this.aClass40_1.aBoolean84 = true;
		}
		if (super.aShortArray164 == null || super.aShortArray164[arg0] == -1) {
			return;
		}
		if (super.aByteArray78 == null || super.aByteArray78[arg0] == -1) {
			local766 = false;
		} else {
			local766 = true;
		}
	}

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "()V")
	@Override
	protected void method5791() {
		super.aClass99_6.anInt5661 = this.aClass40_1.anInt1114;
		super.aClass99_6.anInt5662 = this.aClass40_1.anInt1111;
		super.aClass99_6.anInt5663 = this.aClass40_1.anInt1113;
	}

	@OriginalMember(owner = "client!pe", name = "k", descriptor = "()V")
	@Override
	protected void method5802() {
		this.aClass40_1 = null;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/lang/Thread;)V")
	@Override
	protected void method5796(@OriginalArg(0) Thread arg0) {
		super.method5796(arg0);
		@Pc(8) Class99_Sub1 local8 = (Class99_Sub1) super.aClass5_Sub2_15.method7497(arg0);
		this.aClass40_1 = local8.lb;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BIZ)Lclient!ba;")
	@Override
	public Class2 method5775(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.method5801(Thread.currentThread());
		@Pc(11) Class2_Sub1 local11;
		@Pc(8) Class2_Sub1 local8;
		if (arg0 == 1) {
			local8 = super.aClass2_Sub1_58;
			local11 = super.aClass2_Sub1_55;
		} else if (arg0 == 2) {
			local8 = super.aClass2_Sub1_51;
			local11 = super.aClass2_Sub1_59;
		} else if (arg0 == 3) {
			local8 = super.aClass2_Sub1_52;
			local11 = super.aClass2_Sub1_54;
		} else if (arg0 == 4) {
			local8 = super.aClass2_Sub1_56;
			local11 = super.aClass2_Sub1_57;
		} else if (arg0 == 5) {
			local8 = super.aClass2_Sub1_60;
			local11 = super.aClass2_Sub1_53;
		} else {
			local11 = local8 = new Class2_Sub1_Sub2(super.aClass5_Sub2_15);
		}
		return this.method5794(local11, local8, arg1, arg0 != 0, arg2);
	}
}
