import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class19_Sub1_Sub2 extends Class19_Sub1 {

	@OriginalMember(owner = "client!vc", name = "pc", descriptor = "Lclient!gj;")
	private Class105 aClass105_1;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lclient!aw;[Lclient!vc;)V")
	public Class19_Sub1_Sub2(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) Class19_Sub1_Sub2[] arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lclient!aw;)V")
	public Class19_Sub1_Sub2(@OriginalArg(0) Class9_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lclient!aw;Lclient!fd;IIII)V")
	public Class19_Sub1_Sub2(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
	@Override
	protected void method7265(@OriginalArg(0) int arg0) {
		this.aClass105_1.aBoolean219 = (arg0 & 0x1) == 0;
		this.aClass105_1.aBoolean221 = false;
	}

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "(I)V")
	@Override
	protected void method7284(@OriginalArg(0) int arg0) {
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
		if (!super.aClass9_Sub2_17.aBoolean368) {
			local8 = super.aShortArray164[arg0];
			local13 = super.aShortArray159[arg0];
			local18 = super.aShortArray162[arg0];
			local27 = super.anIntArray699[local8] - super.aClass9_Sub2_17.anInt5331;
			if (local27 > 255) {
				local27 = 255;
			} else if (local27 < 0) {
				local27 = 0;
			}
			local46 = super.anIntArray699[local13] - super.aClass9_Sub2_17.anInt5331;
			if (local46 > 255) {
				local46 = 255;
			} else if (local46 < 0) {
				local46 = 0;
			}
			local65 = super.anIntArray699[local18] - super.aClass9_Sub2_17.anInt5331;
			if (local65 > 255) {
				local65 = 255;
			} else if (local65 < 0) {
				local65 = 0;
			}
			local81 = local27 + local46 + local65;
			if (local81 != 765) {
				if (local81 == 0) {
					this.method7277(arg0);
				} else {
					if (super.aByteArray110 == null) {
						this.aClass105_1.anInt3529 = 0;
					} else {
						this.aClass105_1.anInt3529 = super.aByteArray110[arg0] & 0xFF;
					}
					this.aClass105_1.aBoolean220 = super.aBooleanArray34[arg0];
					if (super.aShortArray160 != null && super.aShortArray160[arg0] != -1) {
						if (super.aByteArray109 == null || super.aByteArray109[arg0] == -1) {
							local333 = local8;
							local338 = local13;
							local343 = local18;
						} else {
							@Pc(328) int local328 = super.aByteArray109[arg0] & 0xFF;
							local333 = super.anIntArray706[local328];
							local338 = super.anIntArray710[local328];
							local343 = super.anIntArray718[local328];
						}
						if (super.anIntArray728[arg0] == -1) {
							this.aClass105_1.method3171(super.anIntArray723[local8], super.anIntArray723[local13], super.anIntArray723[local18], super.lb[local8], super.lb[local13], super.lb[local18], super.anIntArray699[local8], super.anIntArray699[local13], super.anIntArray699[local18], super.aClass9_Sub2_17.anInt5344, local27, local46, local65, super.anIntArray733[arg0], super.anIntArray733[arg0], super.anIntArray733[arg0], super.anIntArray715[local333], super.anIntArray715[local338], super.anIntArray715[local343], super.anIntArray703[local333], super.anIntArray703[local338], super.anIntArray703[local343], super.anIntArray704[local333], super.anIntArray704[local338], super.anIntArray704[local343], super.aShortArray160[arg0]);
						} else {
							this.aClass105_1.method3171(super.anIntArray723[local8], super.anIntArray723[local13], super.anIntArray723[local18], super.lb[local8], super.lb[local13], super.lb[local18], super.anIntArray699[local8], super.anIntArray699[local13], super.anIntArray699[local18], super.aClass9_Sub2_17.anInt5344, local27, local46, local65, super.anIntArray733[arg0], super.anIntArray726[arg0], super.anIntArray728[arg0], super.anIntArray715[local333], super.anIntArray715[local338], super.anIntArray715[local343], super.anIntArray703[local333], super.anIntArray703[local338], super.anIntArray703[local343], super.anIntArray704[local333], super.anIntArray704[local338], super.anIntArray704[local343], super.aShortArray160[arg0]);
						}
					} else if (super.anIntArray728[arg0] == -1) {
						this.aClass105_1.method3173(super.anIntArray723[local8], super.anIntArray723[local13], super.anIntArray723[local18], super.lb[local8], super.lb[local13], super.lb[local18], super.anIntArray699[local8], super.anIntArray699[local13], super.anIntArray699[local18], Static102.method2277(local27 << 24 | super.aClass9_Sub2_17.anInt5344, Static180.anIntArray297[super.anIntArray733[arg0] & 0xFFFF]), Static102.method2277(local46 << 24 | super.aClass9_Sub2_17.anInt5344, Static180.anIntArray297[super.anIntArray733[arg0] & 0xFFFF]), Static102.method2277(local65 << 24 | super.aClass9_Sub2_17.anInt5344, Static180.anIntArray297[super.anIntArray733[arg0] & 0xFFFF]));
					} else {
						this.aClass105_1.method3173(super.anIntArray723[local8], super.anIntArray723[local13], super.anIntArray723[local18], super.lb[local8], super.lb[local13], super.lb[local18], super.anIntArray699[local8], super.anIntArray699[local13], super.anIntArray699[local18], Static102.method2277(local27 << 24 | super.aClass9_Sub2_17.anInt5344, Static180.anIntArray297[super.anIntArray733[arg0] & 0xFFFF]), Static102.method2277(local46 << 24 | super.aClass9_Sub2_17.anInt5344, Static180.anIntArray297[super.anIntArray726[arg0] & 0xFFFF]), Static102.method2277(local65 << 24 | super.aClass9_Sub2_17.anInt5344, Static180.anIntArray297[super.anIntArray728[arg0] & 0xFFFF]));
					}
				}
			}
		} else if (!super.aBooleanArray35[arg0]) {
			local8 = super.aShortArray164[arg0];
			local13 = super.aShortArray159[arg0];
			local18 = super.aShortArray162[arg0];
			local27 = 0;
			local46 = 0;
			local65 = 0;
			if (super.anIntArray702[local8] > super.aClass9_Sub2_17.anInt5340) {
				local27 = 255;
			} else if (super.anIntArray702[local8] > super.aClass9_Sub2_17.anInt5342) {
				local27 = (super.aClass9_Sub2_17.anInt5342 - super.anIntArray702[local8]) * 255 / (super.aClass9_Sub2_17.anInt5342 - super.aClass9_Sub2_17.anInt5340);
			}
			if (super.anIntArray702[local13] > super.aClass9_Sub2_17.anInt5340) {
				local46 = 255;
			} else if (super.anIntArray702[local13] > super.aClass9_Sub2_17.anInt5342) {
				local46 = (super.aClass9_Sub2_17.anInt5342 - super.anIntArray702[local13]) * 255 / (super.aClass9_Sub2_17.anInt5342 - super.aClass9_Sub2_17.anInt5340);
			}
			if (super.anIntArray702[local18] > super.aClass9_Sub2_17.anInt5340) {
				local65 = 255;
			} else if (super.anIntArray702[local18] > super.aClass9_Sub2_17.anInt5342) {
				local65 = (super.aClass9_Sub2_17.anInt5342 - super.anIntArray702[local18]) * 255 / (super.aClass9_Sub2_17.anInt5342 - super.aClass9_Sub2_17.anInt5340);
			}
			if (super.aByteArray110 == null) {
				this.aClass105_1.anInt3529 = 0;
			} else {
				this.aClass105_1.anInt3529 = super.aByteArray110[arg0] & 0xFF;
			}
			this.aClass105_1.aBoolean220 = super.aBooleanArray34[arg0];
			if (super.aShortArray160 != null && super.aShortArray160[arg0] != -1) {
				if (super.aByteArray109 == null || super.aByteArray109[arg0] == -1) {
					local81 = local8;
					local333 = local13;
					local338 = local18;
				} else {
					local343 = super.aByteArray109[arg0] & 0xFF;
					local81 = super.anIntArray706[local343];
					local333 = super.anIntArray710[local343];
					local338 = super.anIntArray718[local343];
				}
				if (super.anIntArray728[arg0] == -1) {
					this.aClass105_1.method3171(super.anIntArray723[local8], super.anIntArray723[local13], super.anIntArray723[local18], super.lb[local8], super.lb[local13], super.lb[local18], super.anIntArray699[local8], super.anIntArray699[local13], super.anIntArray699[local18], super.aClass9_Sub2_17.anInt5344, local27, local46, local65, super.anIntArray733[arg0], super.anIntArray733[arg0], super.anIntArray733[arg0], super.anIntArray715[local81], super.anIntArray715[local333], super.anIntArray715[local338], super.anIntArray703[local81], super.anIntArray703[local333], super.anIntArray703[local338], super.anIntArray704[local81], super.anIntArray704[local333], super.anIntArray704[local338], super.aShortArray160[arg0]);
				} else {
					this.aClass105_1.method3171(super.anIntArray723[local8], super.anIntArray723[local13], super.anIntArray723[local18], super.lb[local8], super.lb[local13], super.lb[local18], super.anIntArray699[local8], super.anIntArray699[local13], super.anIntArray699[local18], super.aClass9_Sub2_17.anInt5344, local27, local46, local65, super.anIntArray733[arg0], super.anIntArray726[arg0], super.anIntArray728[arg0], super.anIntArray715[local81], super.anIntArray715[local333], super.anIntArray715[local338], super.anIntArray703[local81], super.anIntArray703[local333], super.anIntArray703[local338], super.anIntArray704[local81], super.anIntArray704[local333], super.anIntArray704[local338], super.aShortArray160[arg0]);
				}
			} else if (super.anIntArray728[arg0] == -1) {
				this.aClass105_1.method3173(super.anIntArray723[local8], super.anIntArray723[local13], super.anIntArray723[local18], super.lb[local8], super.lb[local13], super.lb[local18], super.anIntArray699[local8], super.anIntArray699[local13], super.anIntArray699[local18], Static102.method2277(local27 << 24 | super.aClass9_Sub2_17.anInt5344, Static180.anIntArray297[super.anIntArray733[arg0] & 0xFFFF]), Static102.method2277(local46 << 24 | super.aClass9_Sub2_17.anInt5344, Static180.anIntArray297[super.anIntArray733[arg0] & 0xFFFF]), Static102.method2277(local65 << 24 | super.aClass9_Sub2_17.anInt5344, Static180.anIntArray297[super.anIntArray733[arg0] & 0xFFFF]));
			} else {
				this.aClass105_1.method3173(super.anIntArray723[local8], super.anIntArray723[local13], super.anIntArray723[local18], super.lb[local8], super.lb[local13], super.lb[local18], super.anIntArray699[local8], super.anIntArray699[local13], super.anIntArray699[local18], Static102.method2277(local27 << 24 | super.aClass9_Sub2_17.anInt5344, Static180.anIntArray297[super.anIntArray733[arg0] & 0xFFFF]), Static102.method2277(local46 << 24 | super.aClass9_Sub2_17.anInt5344, Static180.anIntArray297[super.anIntArray726[arg0] & 0xFFFF]), Static102.method2277(local65 << 24 | super.aClass9_Sub2_17.anInt5344, Static180.anIntArray297[super.anIntArray728[arg0] & 0xFFFF]));
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(Ljava/lang/Thread;)V")
	@Override
	protected void method7289(@OriginalArg(0) Thread arg0) {
		super.method7289(arg0);
		@Pc(8) Class253_Sub2 local8 = (Class253_Sub2) super.aClass9_Sub2_17.method4655(arg0);
		this.aClass105_1 = local8.aClass105_2;
	}

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "(I)V")
	@Override
	protected void method7277(@OriginalArg(0) int arg0) {
		if (super.aBooleanArray35[arg0]) {
			this.method7291(arg0);
			return;
		}
		@Pc(13) short local13 = super.aShortArray164[arg0];
		@Pc(18) short local18 = super.aShortArray159[arg0];
		@Pc(23) short local23 = super.aShortArray162[arg0];
		this.aClass105_1.aBoolean220 = super.aBooleanArray34[arg0];
		if (super.aByteArray110 == null) {
			this.aClass105_1.anInt3529 = 0;
		} else {
			this.aClass105_1.anInt3529 = super.aByteArray110[arg0] & 0xFF;
		}
		if (super.aShortArray160 != null && super.aShortArray160[arg0] != -1) {
			@Pc(189) int local189;
			@Pc(194) int local194;
			@Pc(199) int local199;
			if (super.aByteArray109 == null || super.aByteArray109[arg0] == -1) {
				local189 = local13;
				local194 = local18;
				local199 = local23;
			} else {
				@Pc(184) int local184 = super.aByteArray109[arg0] & 0xFF;
				local189 = super.anIntArray706[local184];
				local194 = super.anIntArray710[local184];
				local199 = super.anIntArray718[local184];
			}
			if (super.anIntArray728[arg0] == -1) {
				this.aClass105_1.method3182(super.anIntArray723[local13], super.anIntArray723[local18], super.anIntArray723[local23], super.lb[local13], super.lb[local18], super.lb[local23], super.anIntArray699[local13], super.anIntArray699[local18], super.anIntArray699[local23], super.anIntArray733[arg0], super.anIntArray733[arg0], super.anIntArray733[arg0], super.anIntArray715[local189], super.anIntArray715[local194], super.anIntArray715[local199], super.anIntArray703[local189], super.anIntArray703[local194], super.anIntArray703[local199], super.anIntArray704[local189], super.anIntArray704[local194], super.anIntArray704[local199], super.aShortArray160[arg0]);
			} else {
				this.aClass105_1.method3182(super.anIntArray723[local13], super.anIntArray723[local18], super.anIntArray723[local23], super.lb[local13], super.lb[local18], super.lb[local23], super.anIntArray699[local13], super.anIntArray699[local18], super.anIntArray699[local23], super.anIntArray733[arg0], super.anIntArray726[arg0], super.anIntArray728[arg0], super.anIntArray715[local189], super.anIntArray715[local194], super.anIntArray715[local199], super.anIntArray703[local189], super.anIntArray703[local194], super.anIntArray703[local199], super.anIntArray704[local189], super.anIntArray704[local194], super.anIntArray704[local199], super.aShortArray160[arg0]);
			}
		} else if (super.anIntArray728[arg0] == -1) {
			this.aClass105_1.method3178(super.anIntArray723[local13], super.anIntArray723[local18], super.anIntArray723[local23], super.lb[local13], super.lb[local18], super.lb[local23], super.anIntArray699[local13], super.anIntArray699[local18], super.anIntArray699[local23], Static180.anIntArray297[super.anIntArray733[arg0] & 0xFFFF]);
		} else {
			this.aClass105_1.method3187(super.anIntArray723[local13], super.anIntArray723[local18], super.anIntArray723[local23], super.lb[local13], super.lb[local18], super.lb[local23], super.anIntArray699[local13], super.anIntArray699[local18], super.anIntArray699[local23], super.anIntArray733[arg0] & 0xFFFF, super.anIntArray726[arg0] & 0xFFFF, super.anIntArray728[arg0] & 0xFFFF);
		}
	}

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "(I)V")
	private void method7291(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = super.aClass9_Sub2_17.anInt5338;
		@Pc(10) short local10 = super.aShortArray164[arg0];
		@Pc(15) short local15 = super.aShortArray159[arg0];
		@Pc(20) short local20 = super.aShortArray162[arg0];
		@Pc(25) int local25 = super.anIntArray704[local10];
		@Pc(30) int local30 = super.anIntArray704[local15];
		@Pc(35) int local35 = super.anIntArray704[local20];
		if (super.aByteArray110 == null) {
			this.aClass105_1.anInt3529 = 0;
		} else {
			this.aClass105_1.anInt3529 = super.aByteArray110[arg0] & 0xFF;
		}
		@Pc(88) int local88;
		@Pc(93) int local93;
		@Pc(100) int local100;
		@Pc(113) int local113;
		if (local25 >= local5) {
			super.anIntArray732[0] = super.lb[local10];
			super.anIntArray722[0] = super.anIntArray723[local10];
			local1++;
			super.anIntArray713[0] = super.anIntArray733[arg0] & 0xFFFF;
		} else {
			local88 = super.anIntArray715[local10];
			local93 = super.anIntArray703[local10];
			local100 = super.anIntArray733[arg0] & 0xFFFF;
			if (local35 >= local5) {
				local113 = (local5 - local25) * Class19_Sub1.anIntArray729[local35 - local25];
				super.anIntArray732[0] = super.aClass253_6.anInt9343 + (local88 + ((super.anIntArray715[local20] - local88) * local113 >> 16)) * super.aClass9_Sub2_17.anInt5337 / local5;
				super.anIntArray722[0] = super.aClass253_6.anInt9342 + (local93 + ((super.anIntArray703[local20] - local93) * local113 >> 16)) * super.aClass9_Sub2_17.anInt5322 / local5;
				local1++;
				super.anIntArray713[0] = local100 + (((super.anIntArray728[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
			if (local30 >= local5) {
				local113 = (local5 - local25) * Class19_Sub1.anIntArray729[local30 - local25];
				super.anIntArray732[local1] = super.aClass253_6.anInt9343 + (local88 + ((super.anIntArray715[local15] - local88) * local113 >> 16)) * super.aClass9_Sub2_17.anInt5337 / local5;
				super.anIntArray722[local1] = super.aClass253_6.anInt9342 + (local93 + ((super.anIntArray703[local15] - local93) * local113 >> 16)) * super.aClass9_Sub2_17.anInt5322 / local5;
				super.anIntArray713[local1++] = local100 + (((super.anIntArray726[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
		}
		if (local30 >= local5) {
			super.anIntArray732[local1] = super.lb[local15];
			super.anIntArray722[local1] = super.anIntArray723[local15];
			super.anIntArray713[local1++] = super.anIntArray726[arg0] & 0xFFFF;
		} else {
			local88 = super.anIntArray715[local15];
			local93 = super.anIntArray703[local15];
			local100 = super.anIntArray726[arg0] & 0xFFFF;
			if (local25 >= local5) {
				local113 = (local5 - local30) * Class19_Sub1.anIntArray729[local25 - local30];
				super.anIntArray732[local1] = super.aClass253_6.anInt9343 + (local88 + ((super.anIntArray715[local10] - local88) * local113 >> 16)) * super.aClass9_Sub2_17.anInt5337 / local5;
				super.anIntArray722[local1] = super.aClass253_6.anInt9342 + (local93 + ((super.anIntArray703[local10] - local93) * local113 >> 16)) * super.aClass9_Sub2_17.anInt5322 / local5;
				super.anIntArray713[local1++] = local100 + (((super.anIntArray733[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
			if (local35 >= local5) {
				local113 = (local5 - local30) * Class19_Sub1.anIntArray729[local35 - local30];
				super.anIntArray732[local1] = super.aClass253_6.anInt9343 + (local88 + ((super.anIntArray715[local20] - local88) * local113 >> 16)) * super.aClass9_Sub2_17.anInt5337 / local5;
				super.anIntArray722[local1] = super.aClass253_6.anInt9342 + (local93 + ((super.anIntArray703[local20] - local93) * local113 >> 16)) * super.aClass9_Sub2_17.anInt5322 / local5;
				super.anIntArray713[local1++] = local100 + (((super.anIntArray728[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
		}
		if (local35 >= local5) {
			super.anIntArray732[local1] = super.lb[local20];
			super.anIntArray722[local1] = super.anIntArray723[local20];
			super.anIntArray713[local1++] = super.anIntArray728[arg0] & 0xFFFF;
		} else {
			local88 = super.anIntArray715[local20];
			local93 = super.anIntArray703[local20];
			local100 = super.anIntArray728[arg0] & 0xFFFF;
			if (local30 >= local5) {
				local113 = (local5 - local35) * Class19_Sub1.anIntArray729[local30 - local35];
				super.anIntArray732[local1] = super.aClass253_6.anInt9343 + (local88 + ((super.anIntArray715[local15] - local88) * local113 >> 16)) * super.aClass9_Sub2_17.anInt5337 / local5;
				super.anIntArray722[local1] = super.aClass253_6.anInt9342 + (local93 + ((super.anIntArray703[local15] - local93) * local113 >> 16)) * super.aClass9_Sub2_17.anInt5322 / local5;
				super.anIntArray713[local1++] = local100 + (((super.anIntArray726[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
			if (local25 >= local5) {
				local113 = (local5 - local35) * Class19_Sub1.anIntArray729[local25 - local35];
				super.anIntArray732[local1] = super.aClass253_6.anInt9343 + (local88 + ((super.anIntArray715[local10] - local88) * local113 >> 16)) * super.aClass9_Sub2_17.anInt5337 / local5;
				super.anIntArray722[local1] = super.aClass253_6.anInt9342 + (local93 + ((super.anIntArray703[local10] - local93) * local113 >> 16)) * super.aClass9_Sub2_17.anInt5322 / local5;
				super.anIntArray713[local1++] = local100 + (((super.anIntArray733[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
		}
		local88 = super.anIntArray732[0];
		local93 = super.anIntArray732[1];
		local100 = super.anIntArray732[2];
		this.aClass105_1.aBoolean220 = false;
		@Pc(766) boolean local766;
		if (local1 == 3) {
			if (local88 < 0 || local93 < 0 || local100 < 0 || local88 > super.aClass253_6.anInt9341 || local93 > super.aClass253_6.anInt9341 || local100 > super.aClass253_6.anInt9341) {
				this.aClass105_1.aBoolean220 = true;
			}
			if (super.aShortArray160 != null && super.aShortArray160[arg0] != -1) {
				if (super.aByteArray109 == null || super.aByteArray109[arg0] == -1) {
					local766 = false;
				} else {
					local766 = true;
				}
			}
		}
		if (local1 != 4) {
			return;
		}
		if (local88 < 0 || local93 < 0 || local100 < 0 || local88 > super.aClass253_6.anInt9341 || local93 > super.aClass253_6.anInt9341 || local100 > super.aClass253_6.anInt9341 || super.anIntArray732[3] < 0 || super.anIntArray732[3] > super.aClass253_6.anInt9341) {
			this.aClass105_1.aBoolean220 = true;
		}
		if (super.aShortArray160 == null || super.aShortArray160[arg0] == -1) {
			return;
		}
		if (super.aByteArray109 == null || super.aByteArray109[arg0] == -1) {
			local766 = false;
		} else {
			local766 = true;
		}
	}

	@OriginalMember(owner = "client!vc", name = "q", descriptor = "()V")
	@Override
	protected void method7283() {
		this.aClass105_1 = null;
	}

	@OriginalMember(owner = "client!vc", name = "s", descriptor = "()V")
	@Override
	protected void method7290() {
		super.aClass253_6.anInt9341 = this.aClass105_1.anInt3527;
		super.aClass253_6.anInt9343 = this.aClass105_1.anInt3530;
		super.aClass253_6.anInt9342 = this.aClass105_1.anInt3531;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(BIZ)Lclient!r;")
	@Override
	public Class19 method7260(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.method7281(Thread.currentThread());
		@Pc(11) Class19_Sub1 local11;
		@Pc(8) Class19_Sub1 local8;
		if (arg0 == 1) {
			local8 = super.aClass19_Sub1_50;
			local11 = super.aClass19_Sub1_46;
		} else if (arg0 == 2) {
			local8 = super.aClass19_Sub1_44;
			local11 = super.aClass19_Sub1_42;
		} else if (arg0 == 3) {
			local8 = super.aClass19_Sub1_48;
			local11 = super.aClass19_Sub1_49;
		} else if (arg0 == 4) {
			local8 = super.aClass19_Sub1_43;
			local11 = super.aClass19_Sub1_47;
		} else if (arg0 == 5) {
			local8 = super.aClass19_Sub1_41;
			local11 = super.aClass19_Sub1_45;
		} else {
			local11 = local8 = new Class19_Sub1_Sub2(super.aClass9_Sub2_17);
		}
		return this.method7274(local11, local8, arg1, arg0 != 0, arg2);
	}
}
