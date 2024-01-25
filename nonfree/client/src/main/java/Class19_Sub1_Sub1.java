import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!at")
public final class Class19_Sub1_Sub1 extends Class19_Sub1 {

	@OriginalMember(owner = "client!at", name = "pc", descriptor = "Lclient!oo;")
	private Class221 aClass221_1;

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Lclient!aw;[Lclient!at;)V")
	public Class19_Sub1_Sub1(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) Class19_Sub1_Sub1[] arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Lclient!aw;Lclient!fd;IIII)V")
	public Class19_Sub1_Sub1(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Lclient!aw;)V")
	public Class19_Sub1_Sub1(@OriginalArg(0) Class9_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!at", name = "s", descriptor = "()V")
	@Override
	protected void method7290() {
		super.aClass253_6.anInt9341 = this.aClass221_1.anInt6419;
		super.aClass253_6.anInt9343 = this.aClass221_1.anInt6422;
		super.aClass253_6.anInt9342 = this.aClass221_1.anInt6424;
	}

	@OriginalMember(owner = "client!at", name = "d", descriptor = "(I)V")
	@Override
	protected void method7277(@OriginalArg(0) int arg0) {
		if (super.aBooleanArray35[arg0]) {
			this.method985(arg0);
			return;
		}
		@Pc(13) short local13 = super.aShortArray164[arg0];
		@Pc(18) short local18 = super.aShortArray159[arg0];
		@Pc(23) short local23 = super.aShortArray162[arg0];
		this.aClass221_1.aBoolean429 = super.aBooleanArray34[arg0];
		if (super.aByteArray110 == null) {
			this.aClass221_1.anInt6421 = 0;
		} else {
			this.aClass221_1.anInt6421 = super.aByteArray110[arg0] & 0xFF;
		}
		if (super.aShortArray160 != null && super.aShortArray160[arg0] != -1) {
			@Pc(165) int local165;
			@Pc(170) int local170;
			@Pc(175) int local175;
			if (super.aByteArray109 == null || super.aByteArray109[arg0] == -1) {
				local165 = local13;
				local170 = local18;
				local175 = local23;
			} else {
				@Pc(160) int local160 = super.aByteArray109[arg0] & 0xFF;
				local165 = super.anIntArray706[local160];
				local170 = super.anIntArray710[local160];
				local175 = super.anIntArray718[local160];
			}
			if (super.anIntArray728[arg0] == -1) {
				this.aClass221_1.method5573(super.anIntArray723[local13], super.anIntArray723[local18], super.anIntArray723[local23], super.lb[local13], super.lb[local18], super.lb[local23], super.anIntArray733[arg0], super.anIntArray733[arg0], super.anIntArray733[arg0], super.anIntArray715[local165], super.anIntArray715[local170], super.anIntArray715[local175], super.anIntArray703[local165], super.anIntArray703[local170], super.anIntArray703[local175], super.anIntArray704[local165], super.anIntArray704[local170], super.anIntArray704[local175], super.aShortArray160[arg0]);
			} else {
				this.aClass221_1.method5573(super.anIntArray723[local13], super.anIntArray723[local18], super.anIntArray723[local23], super.lb[local13], super.lb[local18], super.lb[local23], super.anIntArray733[arg0], super.anIntArray726[arg0], super.anIntArray728[arg0], super.anIntArray715[local165], super.anIntArray715[local170], super.anIntArray715[local175], super.anIntArray703[local165], super.anIntArray703[local170], super.anIntArray703[local175], super.anIntArray704[local165], super.anIntArray704[local170], super.anIntArray704[local175], super.aShortArray160[arg0]);
			}
		} else if (super.anIntArray728[arg0] == -1) {
			this.aClass221_1.method5582(super.anIntArray723[local13], super.anIntArray723[local18], super.anIntArray723[local23], super.lb[local13], super.lb[local18], super.lb[local23], Static180.anIntArray297[super.anIntArray733[arg0] & 0xFFFF]);
		} else {
			this.aClass221_1.method5577(super.anIntArray723[local13], super.anIntArray723[local18], super.anIntArray723[local23], super.lb[local13], super.lb[local18], super.lb[local23], super.anIntArray733[arg0] & 0xFFFF, super.anIntArray726[arg0] & 0xFFFF, super.anIntArray728[arg0] & 0xFFFF);
		}
	}

	@OriginalMember(owner = "client!at", name = "e", descriptor = "(I)V")
	@Override
	protected void method7284(@OriginalArg(0) int arg0) {
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
						this.aClass221_1.anInt6421 = 0;
					} else {
						this.aClass221_1.anInt6421 = super.aByteArray110[arg0] & 0xFF;
					}
					this.aClass221_1.aBoolean429 = super.aBooleanArray34[arg0];
					if (super.aShortArray160 != null && super.aShortArray160[arg0] != -1) {
						if (super.aByteArray109 == null || super.aByteArray109[arg0] == -1) {
							local309 = local8;
							local314 = local13;
							local319 = local18;
						} else {
							@Pc(304) int local304 = super.aByteArray109[arg0] & 0xFF;
							local309 = super.anIntArray706[local304];
							local314 = super.anIntArray710[local304];
							local319 = super.anIntArray718[local304];
						}
						if (super.anIntArray728[arg0] == -1) {
							this.aClass221_1.method5571(super.anIntArray723[local8], super.anIntArray723[local13], super.anIntArray723[local18], super.lb[local8], super.lb[local13], super.lb[local18], super.aClass9_Sub2_17.anInt5344, local27, local46, local65, super.anIntArray733[arg0], super.anIntArray733[arg0], super.anIntArray733[arg0], super.anIntArray715[local309], super.anIntArray715[local314], super.anIntArray715[local319], super.anIntArray703[local309], super.anIntArray703[local314], super.anIntArray703[local319], super.anIntArray704[local309], super.anIntArray704[local314], super.anIntArray704[local319], super.aShortArray160[arg0]);
						} else {
							this.aClass221_1.method5571(super.anIntArray723[local8], super.anIntArray723[local13], super.anIntArray723[local18], super.lb[local8], super.lb[local13], super.lb[local18], super.aClass9_Sub2_17.anInt5344, local27, local46, local65, super.anIntArray733[arg0], super.anIntArray726[arg0], super.anIntArray728[arg0], super.anIntArray715[local309], super.anIntArray715[local314], super.anIntArray715[local319], super.anIntArray703[local309], super.anIntArray703[local314], super.anIntArray703[local319], super.anIntArray704[local309], super.anIntArray704[local314], super.anIntArray704[local319], super.aShortArray160[arg0]);
						}
					} else if (super.anIntArray728[arg0] == -1) {
						this.aClass221_1.method5574(super.anIntArray723[local8], super.anIntArray723[local13], super.anIntArray723[local18], super.lb[local8], super.lb[local13], super.lb[local18], Static102.method2277(local27 << 24 | super.aClass9_Sub2_17.anInt5344, Static180.anIntArray297[super.anIntArray733[arg0] & 0xFFFF]), Static102.method2277(local46 << 24 | super.aClass9_Sub2_17.anInt5344, Static180.anIntArray297[super.anIntArray733[arg0] & 0xFFFF]), Static102.method2277(local65 << 24 | super.aClass9_Sub2_17.anInt5344, Static180.anIntArray297[super.anIntArray733[arg0] & 0xFFFF]));
					} else {
						this.aClass221_1.method5574(super.anIntArray723[local8], super.anIntArray723[local13], super.anIntArray723[local18], super.lb[local8], super.lb[local13], super.lb[local18], Static102.method2277(local27 << 24 | super.aClass9_Sub2_17.anInt5344, Static180.anIntArray297[super.anIntArray733[arg0] & 0xFFFF]), Static102.method2277(local46 << 24 | super.aClass9_Sub2_17.anInt5344, Static180.anIntArray297[super.anIntArray726[arg0] & 0xFFFF]), Static102.method2277(local65 << 24 | super.aClass9_Sub2_17.anInt5344, Static180.anIntArray297[super.anIntArray728[arg0] & 0xFFFF]));
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
				this.aClass221_1.anInt6421 = 0;
			} else {
				this.aClass221_1.anInt6421 = super.aByteArray110[arg0] & 0xFF;
			}
			this.aClass221_1.aBoolean429 = super.aBooleanArray34[arg0];
			if (super.aShortArray160 != null && super.aShortArray160[arg0] != -1) {
				if (super.aByteArray109 == null || super.aByteArray109[arg0] == -1) {
					local81 = local8;
					local309 = local13;
					local314 = local18;
				} else {
					local319 = super.aByteArray109[arg0] & 0xFF;
					local81 = super.anIntArray706[local319];
					local309 = super.anIntArray710[local319];
					local314 = super.anIntArray718[local319];
				}
				if (super.anIntArray728[arg0] == -1) {
					this.aClass221_1.method5571(super.anIntArray723[local8], super.anIntArray723[local13], super.anIntArray723[local18], super.lb[local8], super.lb[local13], super.lb[local18], super.aClass9_Sub2_17.anInt5344, local27, local46, local65, super.anIntArray733[arg0], super.anIntArray733[arg0], super.anIntArray733[arg0], super.anIntArray715[local81], super.anIntArray715[local309], super.anIntArray715[local314], super.anIntArray703[local81], super.anIntArray703[local309], super.anIntArray703[local314], super.anIntArray704[local81], super.anIntArray704[local309], super.anIntArray704[local314], super.aShortArray160[arg0]);
				} else {
					this.aClass221_1.method5571(super.anIntArray723[local8], super.anIntArray723[local13], super.anIntArray723[local18], super.lb[local8], super.lb[local13], super.lb[local18], super.aClass9_Sub2_17.anInt5344, local27, local46, local65, super.anIntArray733[arg0], super.anIntArray726[arg0], super.anIntArray728[arg0], super.anIntArray715[local81], super.anIntArray715[local309], super.anIntArray715[local314], super.anIntArray703[local81], super.anIntArray703[local309], super.anIntArray703[local314], super.anIntArray704[local81], super.anIntArray704[local309], super.anIntArray704[local314], super.aShortArray160[arg0]);
				}
			} else if (super.anIntArray728[arg0] == -1) {
				this.aClass221_1.method5574(super.anIntArray723[local8], super.anIntArray723[local13], super.anIntArray723[local18], super.lb[local8], super.lb[local13], super.lb[local18], Static102.method2277(local27 << 24 | super.aClass9_Sub2_17.anInt5344, Static180.anIntArray297[super.anIntArray733[arg0] & 0xFFFF]), Static102.method2277(local46 << 24 | super.aClass9_Sub2_17.anInt5344, Static180.anIntArray297[super.anIntArray733[arg0] & 0xFFFF]), Static102.method2277(local65 << 24 | super.aClass9_Sub2_17.anInt5344, Static180.anIntArray297[super.anIntArray733[arg0] & 0xFFFF]));
			} else {
				this.aClass221_1.method5574(super.anIntArray723[local8], super.anIntArray723[local13], super.anIntArray723[local18], super.lb[local8], super.lb[local13], super.lb[local18], Static102.method2277(local27 << 24 | super.aClass9_Sub2_17.anInt5344, Static180.anIntArray297[super.anIntArray733[arg0] & 0xFFFF]), Static102.method2277(local46 << 24 | super.aClass9_Sub2_17.anInt5344, Static180.anIntArray297[super.anIntArray726[arg0] & 0xFFFF]), Static102.method2277(local65 << 24 | super.aClass9_Sub2_17.anInt5344, Static180.anIntArray297[super.anIntArray728[arg0] & 0xFFFF]));
			}
		}
	}

	@OriginalMember(owner = "client!at", name = "f", descriptor = "(I)V")
	private void method985(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = super.aClass9_Sub2_17.anInt5338;
		@Pc(10) short local10 = super.aShortArray164[arg0];
		@Pc(15) short local15 = super.aShortArray159[arg0];
		@Pc(20) short local20 = super.aShortArray162[arg0];
		@Pc(25) int local25 = super.anIntArray704[local10];
		@Pc(30) int local30 = super.anIntArray704[local15];
		@Pc(35) int local35 = super.anIntArray704[local20];
		if (super.aByteArray110 == null) {
			this.aClass221_1.anInt6421 = 0;
		} else {
			this.aClass221_1.anInt6421 = super.aByteArray110[arg0] & 0xFF;
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
		local113 = super.anIntArray722[0];
		@Pc(725) int local725 = super.anIntArray722[1];
		@Pc(730) int local730 = super.anIntArray722[2];
		this.aClass221_1.aBoolean429 = false;
		@Pc(838) int local838;
		@Pc(843) int local843;
		@Pc(848) int local848;
		@Pc(833) int local833;
		if (local1 == 3) {
			if (local88 < 0 || local93 < 0 || local100 < 0 || local88 > super.aClass253_6.anInt9341 || local93 > super.aClass253_6.anInt9341 || local100 > super.aClass253_6.anInt9341) {
				this.aClass221_1.aBoolean429 = true;
			}
			if (super.aShortArray160 != null && super.aShortArray160[arg0] != -1) {
				if (super.aByteArray109 == null || super.aByteArray109[arg0] == -1) {
					local838 = local10;
					local843 = local15;
					local848 = local20;
				} else {
					local833 = super.aByteArray109[arg0] & 0xFF;
					local838 = super.anIntArray706[local833];
					local843 = super.anIntArray710[local833];
					local848 = super.anIntArray718[local833];
				}
				if (super.anIntArray728[arg0] == -1) {
					this.aClass221_1.method5573(local113, local725, local730, local88, local93, local100, super.anIntArray733[arg0], super.anIntArray733[arg0], super.anIntArray733[arg0], super.anIntArray715[local838], super.anIntArray715[local843], super.anIntArray715[local848], super.anIntArray703[local838], super.anIntArray703[local843], super.anIntArray703[local848], super.anIntArray704[local838], super.anIntArray704[local843], super.anIntArray704[local848], super.aShortArray160[arg0]);
				} else {
					this.aClass221_1.method5573(local113, local725, local730, local88, local93, local100, super.anIntArray713[0], super.anIntArray713[1], super.anIntArray713[2], super.anIntArray715[local838], super.anIntArray715[local843], super.anIntArray715[local848], super.anIntArray703[local838], super.anIntArray703[local843], super.anIntArray703[local848], super.anIntArray704[local838], super.anIntArray704[local843], super.anIntArray704[local848], super.aShortArray160[arg0]);
				}
			} else if (super.anIntArray728[arg0] == -1) {
				this.aClass221_1.method5582(local113, local725, local730, local88, local93, local100, Static180.anIntArray297[super.anIntArray733[arg0] & 0xFFFF]);
			} else {
				this.aClass221_1.method5577(local113, local725, local730, local88, local93, local100, super.anIntArray713[0], super.anIntArray713[1], super.anIntArray713[2]);
			}
		}
		if (local1 != 4) {
			return;
		}
		if (local88 < 0 || local93 < 0 || local100 < 0 || local88 > super.aClass253_6.anInt9341 || local93 > super.aClass253_6.anInt9341 || local100 > super.aClass253_6.anInt9341 || super.anIntArray732[3] < 0 || super.anIntArray732[3] > super.aClass253_6.anInt9341) {
			this.aClass221_1.aBoolean429 = true;
		}
		if (super.aShortArray160 == null || super.aShortArray160[arg0] == -1) {
			if (super.anIntArray728[arg0] == -1) {
				local838 = Static180.anIntArray297[super.anIntArray733[arg0] & 0xFFFF];
				this.aClass221_1.method5582(local113, local725, local730, local88, local93, local100, local838);
				this.aClass221_1.method5582(local113, local730, super.anIntArray722[3], local88, local100, super.anIntArray732[3], local838);
				return;
			}
			this.aClass221_1.method5577(local113, local725, local730, local88, local93, local100, super.anIntArray713[0], super.anIntArray713[1], super.anIntArray713[2]);
			this.aClass221_1.method5577(local113, local730, super.anIntArray722[3], local88, local100, super.anIntArray732[3], super.anIntArray713[0], super.anIntArray713[2], super.anIntArray713[3]);
			return;
		}
		if (super.aByteArray109 == null || super.aByteArray109[arg0] == -1) {
			local838 = local10;
			local843 = local15;
			local848 = local20;
		} else {
			local833 = super.aByteArray109[arg0] & 0xFF;
			local838 = super.anIntArray706[local833];
			local843 = super.anIntArray710[local833];
			local848 = super.anIntArray718[local833];
		}
		@Pc(1168) short local1168 = super.aShortArray160[arg0];
		if (super.anIntArray728[arg0] == -1) {
			this.aClass221_1.method5573(local113, local725, local730, local88, local93, local100, super.anIntArray733[arg0], super.anIntArray733[arg0], super.anIntArray733[arg0], super.anIntArray715[local838], super.anIntArray715[local843], super.anIntArray715[local848], super.anIntArray703[local838], super.anIntArray703[local843], super.anIntArray703[local848], super.anIntArray704[local838], super.anIntArray704[local843], super.anIntArray704[local848], local1168);
			this.aClass221_1.method5573(local113, local730, super.anIntArray722[3], local88, local100, super.anIntArray732[3], super.anIntArray733[arg0], super.anIntArray733[arg0], super.anIntArray733[arg0], super.anIntArray715[local838], super.anIntArray715[local843], super.anIntArray715[local848], super.anIntArray703[local838], super.anIntArray703[local843], super.anIntArray703[local848], super.anIntArray704[local838], super.anIntArray704[local843], super.anIntArray704[local848], local1168);
			return;
		}
		this.aClass221_1.method5573(local113, local725, local730, local88, local93, local100, super.anIntArray713[0], super.anIntArray713[1], super.anIntArray713[2], super.anIntArray715[local838], super.anIntArray715[local843], super.anIntArray715[local848], super.anIntArray703[local838], super.anIntArray703[local843], super.anIntArray703[local848], super.anIntArray704[local838], super.anIntArray704[local843], super.anIntArray704[local848], local1168);
		this.aClass221_1.method5573(local113, local730, super.anIntArray722[3], local88, local100, super.anIntArray732[3], super.anIntArray713[0], super.anIntArray713[2], super.anIntArray713[3], super.anIntArray715[local838], super.anIntArray715[local843], super.anIntArray715[local848], super.anIntArray703[local838], super.anIntArray703[local843], super.anIntArray703[local848], super.anIntArray704[local838], super.anIntArray704[local843], super.anIntArray704[local848], local1168);
	}

	@OriginalMember(owner = "client!at", name = "q", descriptor = "()V")
	@Override
	protected void method7283() {
		this.aClass221_1 = null;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(I)V")
	@Override
	protected void method7265(@OriginalArg(0) int arg0) {
		this.aClass221_1.aBoolean427 = (arg0 & 0x1) == 0;
		this.aClass221_1.aBoolean426 = false;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(BIZ)Lclient!r;")
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
			local11 = local8 = new Class19_Sub1_Sub1(super.aClass9_Sub2_17);
		}
		return this.method7274(local11, local8, arg1, arg0 != 0, arg2);
	}

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(Ljava/lang/Thread;)V")
	@Override
	protected void method7289(@OriginalArg(0) Thread arg0) {
		super.method7289(arg0);
		@Pc(8) Class253_Sub1 local8 = (Class253_Sub1) super.aClass9_Sub2_17.method4655(arg0);
		this.aClass221_1 = local8.aClass221_2;
	}
}
