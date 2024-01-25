import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dv")
public final class Class63_Sub1_Sub1 extends Class63_Sub1 {

	@OriginalMember(owner = "client!dv", name = "jc", descriptor = "Lclient!ida;")
	private Class128 aClass128_1;

	@OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(Lclient!fg;)V")
	public Class63_Sub1_Sub1(@OriginalArg(0) Class39_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(Lclient!fg;[Lclient!dv;)V")
	public Class63_Sub1_Sub1(@OriginalArg(0) Class39_Sub1 arg0, @OriginalArg(1) Class63_Sub1_Sub1[] arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(Lclient!fg;Lclient!bt;IIII)V")
	public Class63_Sub1_Sub1(@OriginalArg(0) Class39_Sub1 arg0, @OriginalArg(1) Class29 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!dv", name = "g", descriptor = "()V")
	@Override
	protected void method7712() {
		super.aClass76_5.anInt6891 = this.aClass128_1.anInt3632;
		super.aClass76_5.anInt6890 = this.aClass128_1.anInt3635;
		super.aClass76_5.anInt6889 = this.aClass128_1.anInt3634;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(BIZ)Lclient!r;")
	@Override
	public Class63 method7706(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.method7717(Thread.currentThread());
		@Pc(11) Class63_Sub1 local11;
		@Pc(8) Class63_Sub1 local8;
		if (arg0 == 1) {
			local8 = super.aClass63_Sub1_52;
			local11 = super.aClass63_Sub1_53;
		} else if (arg0 == 2) {
			local8 = super.aClass63_Sub1_54;
			local11 = super.aClass63_Sub1_48;
		} else if (arg0 == 3) {
			local8 = super.aClass63_Sub1_51;
			local11 = super.aClass63_Sub1_57;
		} else if (arg0 == 4) {
			local8 = super.aClass63_Sub1_56;
			local11 = super.aClass63_Sub1_50;
		} else if (arg0 == 5) {
			local8 = super.aClass63_Sub1_55;
			local11 = super.aClass63_Sub1_49;
		} else {
			local11 = local8 = new Class63_Sub1_Sub1(super.aClass39_Sub1_18);
		}
		return this.method7715(local11, local8, arg1, arg0 != 0, arg2);
	}

	@OriginalMember(owner = "client!dv", name = "d", descriptor = "(I)V")
	@Override
	protected void method7726(@OriginalArg(0) int arg0) {
		this.aClass128_1.aBoolean278 = (arg0 & 0x1) == 0;
		this.aClass128_1.aBoolean276 = false;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)V")
	@Override
	protected void method7711(@OriginalArg(0) int arg0) {
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
		if (!super.aClass39_Sub1_18.aBoolean155) {
			local8 = super.aShortArray137[arg0];
			local13 = super.aShortArray142[arg0];
			local18 = super.aShortArray139[arg0];
			local27 = super.anIntArray751[local8] - super.aClass39_Sub1_18.anInt2076;
			if (local27 > 255) {
				local27 = 255;
			} else if (local27 < 0) {
				local27 = 0;
			}
			local46 = super.anIntArray751[local13] - super.aClass39_Sub1_18.anInt2076;
			if (local46 > 255) {
				local46 = 255;
			} else if (local46 < 0) {
				local46 = 0;
			}
			local65 = super.anIntArray751[local18] - super.aClass39_Sub1_18.anInt2076;
			if (local65 > 255) {
				local65 = 255;
			} else if (local65 < 0) {
				local65 = 0;
			}
			local81 = local27 + local46 + local65;
			if (local81 != 765) {
				if (local81 == 0) {
					this.method7725(arg0);
				} else {
					if (super.aByteArray122 == null) {
						this.aClass128_1.anInt3633 = 0;
					} else {
						this.aClass128_1.anInt3633 = super.aByteArray122[arg0] & 0xFF;
					}
					this.aClass128_1.aBoolean280 = super.aBooleanArray39[arg0];
					if (super.aShortArray140 != null && super.aShortArray140[arg0] != -1) {
						if (super.aByteArray123 == null || super.aByteArray123[arg0] == -1) {
							local309 = local8;
							local314 = local13;
							local319 = local18;
						} else {
							@Pc(304) int local304 = super.aByteArray123[arg0] & 0xFF;
							local309 = super.anIntArray740[local304];
							local314 = super.anIntArray717[local304];
							local319 = super.anIntArray720[local304];
						}
						if (super.anIntArray747[arg0] == -1) {
							this.aClass128_1.method3245(super.anIntArray727[local8], super.anIntArray727[local13], super.anIntArray727[local18], super.anIntArray745[local8], super.anIntArray745[local13], super.anIntArray745[local18], super.aClass39_Sub1_18.anInt2085, local27, local46, local65, super.anIntArray746[arg0], super.anIntArray746[arg0], super.anIntArray746[arg0], super.anIntArray743[local309], super.anIntArray743[local314], super.anIntArray743[local319], super.anIntArray750[local309], super.anIntArray750[local314], super.anIntArray750[local319], super.anIntArray722[local309], super.anIntArray722[local314], super.anIntArray722[local319], super.aShortArray140[arg0]);
						} else {
							this.aClass128_1.method3245(super.anIntArray727[local8], super.anIntArray727[local13], super.anIntArray727[local18], super.anIntArray745[local8], super.anIntArray745[local13], super.anIntArray745[local18], super.aClass39_Sub1_18.anInt2085, local27, local46, local65, super.anIntArray746[arg0], super.anIntArray737[arg0], super.anIntArray747[arg0], super.anIntArray743[local309], super.anIntArray743[local314], super.anIntArray743[local319], super.anIntArray750[local309], super.anIntArray750[local314], super.anIntArray750[local319], super.anIntArray722[local309], super.anIntArray722[local314], super.anIntArray722[local319], super.aShortArray140[arg0]);
						}
					} else if (super.anIntArray747[arg0] == -1) {
						this.aClass128_1.method3237(super.anIntArray727[local8], super.anIntArray727[local13], super.anIntArray727[local18], super.anIntArray745[local8], super.anIntArray745[local13], super.anIntArray745[local18], Static114.method2231(local27 << 24 | super.aClass39_Sub1_18.anInt2085, Static77.anIntArray130[super.anIntArray746[arg0] & 0xFFFF]), Static114.method2231(local46 << 24 | super.aClass39_Sub1_18.anInt2085, Static77.anIntArray130[super.anIntArray746[arg0] & 0xFFFF]), Static114.method2231(local65 << 24 | super.aClass39_Sub1_18.anInt2085, Static77.anIntArray130[super.anIntArray746[arg0] & 0xFFFF]));
					} else {
						this.aClass128_1.method3237(super.anIntArray727[local8], super.anIntArray727[local13], super.anIntArray727[local18], super.anIntArray745[local8], super.anIntArray745[local13], super.anIntArray745[local18], Static114.method2231(local27 << 24 | super.aClass39_Sub1_18.anInt2085, Static77.anIntArray130[super.anIntArray746[arg0] & 0xFFFF]), Static114.method2231(local46 << 24 | super.aClass39_Sub1_18.anInt2085, Static77.anIntArray130[super.anIntArray737[arg0] & 0xFFFF]), Static114.method2231(local65 << 24 | super.aClass39_Sub1_18.anInt2085, Static77.anIntArray130[super.anIntArray747[arg0] & 0xFFFF]));
					}
				}
			}
		} else if (!super.aBooleanArray40[arg0]) {
			local8 = super.aShortArray137[arg0];
			local13 = super.aShortArray142[arg0];
			local18 = super.aShortArray139[arg0];
			local27 = 0;
			local46 = 0;
			local65 = 0;
			if (super.anIntArray729[local8] > super.aClass39_Sub1_18.anInt2075) {
				local27 = 255;
			} else if (super.anIntArray729[local8] > super.aClass39_Sub1_18.anInt2081) {
				local27 = (super.aClass39_Sub1_18.anInt2081 - super.anIntArray729[local8]) * 255 / (super.aClass39_Sub1_18.anInt2081 - super.aClass39_Sub1_18.anInt2075);
			}
			if (super.anIntArray729[local13] > super.aClass39_Sub1_18.anInt2075) {
				local46 = 255;
			} else if (super.anIntArray729[local13] > super.aClass39_Sub1_18.anInt2081) {
				local46 = (super.aClass39_Sub1_18.anInt2081 - super.anIntArray729[local13]) * 255 / (super.aClass39_Sub1_18.anInt2081 - super.aClass39_Sub1_18.anInt2075);
			}
			if (super.anIntArray729[local18] > super.aClass39_Sub1_18.anInt2075) {
				local65 = 255;
			} else if (super.anIntArray729[local18] > super.aClass39_Sub1_18.anInt2081) {
				local65 = (super.aClass39_Sub1_18.anInt2081 - super.anIntArray729[local18]) * 255 / (super.aClass39_Sub1_18.anInt2081 - super.aClass39_Sub1_18.anInt2075);
			}
			if (super.aByteArray122 == null) {
				this.aClass128_1.anInt3633 = 0;
			} else {
				this.aClass128_1.anInt3633 = super.aByteArray122[arg0] & 0xFF;
			}
			this.aClass128_1.aBoolean280 = super.aBooleanArray39[arg0];
			if (super.aShortArray140 != null && super.aShortArray140[arg0] != -1) {
				if (super.aByteArray123 == null || super.aByteArray123[arg0] == -1) {
					local81 = local8;
					local309 = local13;
					local314 = local18;
				} else {
					local319 = super.aByteArray123[arg0] & 0xFF;
					local81 = super.anIntArray740[local319];
					local309 = super.anIntArray717[local319];
					local314 = super.anIntArray720[local319];
				}
				if (super.anIntArray747[arg0] == -1) {
					this.aClass128_1.method3245(super.anIntArray727[local8], super.anIntArray727[local13], super.anIntArray727[local18], super.anIntArray745[local8], super.anIntArray745[local13], super.anIntArray745[local18], super.aClass39_Sub1_18.anInt2085, local27, local46, local65, super.anIntArray746[arg0], super.anIntArray746[arg0], super.anIntArray746[arg0], super.anIntArray743[local81], super.anIntArray743[local309], super.anIntArray743[local314], super.anIntArray750[local81], super.anIntArray750[local309], super.anIntArray750[local314], super.anIntArray722[local81], super.anIntArray722[local309], super.anIntArray722[local314], super.aShortArray140[arg0]);
				} else {
					this.aClass128_1.method3245(super.anIntArray727[local8], super.anIntArray727[local13], super.anIntArray727[local18], super.anIntArray745[local8], super.anIntArray745[local13], super.anIntArray745[local18], super.aClass39_Sub1_18.anInt2085, local27, local46, local65, super.anIntArray746[arg0], super.anIntArray737[arg0], super.anIntArray747[arg0], super.anIntArray743[local81], super.anIntArray743[local309], super.anIntArray743[local314], super.anIntArray750[local81], super.anIntArray750[local309], super.anIntArray750[local314], super.anIntArray722[local81], super.anIntArray722[local309], super.anIntArray722[local314], super.aShortArray140[arg0]);
				}
			} else if (super.anIntArray747[arg0] == -1) {
				this.aClass128_1.method3237(super.anIntArray727[local8], super.anIntArray727[local13], super.anIntArray727[local18], super.anIntArray745[local8], super.anIntArray745[local13], super.anIntArray745[local18], Static114.method2231(local27 << 24 | super.aClass39_Sub1_18.anInt2085, Static77.anIntArray130[super.anIntArray746[arg0] & 0xFFFF]), Static114.method2231(local46 << 24 | super.aClass39_Sub1_18.anInt2085, Static77.anIntArray130[super.anIntArray746[arg0] & 0xFFFF]), Static114.method2231(local65 << 24 | super.aClass39_Sub1_18.anInt2085, Static77.anIntArray130[super.anIntArray746[arg0] & 0xFFFF]));
			} else {
				this.aClass128_1.method3237(super.anIntArray727[local8], super.anIntArray727[local13], super.anIntArray727[local18], super.anIntArray745[local8], super.anIntArray745[local13], super.anIntArray745[local18], Static114.method2231(local27 << 24 | super.aClass39_Sub1_18.anInt2085, Static77.anIntArray130[super.anIntArray746[arg0] & 0xFFFF]), Static114.method2231(local46 << 24 | super.aClass39_Sub1_18.anInt2085, Static77.anIntArray130[super.anIntArray737[arg0] & 0xFFFF]), Static114.method2231(local65 << 24 | super.aClass39_Sub1_18.anInt2085, Static77.anIntArray130[super.anIntArray747[arg0] & 0xFFFF]));
			}
		}
	}

	@OriginalMember(owner = "client!dv", name = "f", descriptor = "(I)V")
	private void method1875(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = super.aClass39_Sub1_18.anInt2059;
		@Pc(10) short local10 = super.aShortArray137[arg0];
		@Pc(15) short local15 = super.aShortArray142[arg0];
		@Pc(20) short local20 = super.aShortArray139[arg0];
		@Pc(25) int local25 = super.anIntArray722[local10];
		@Pc(30) int local30 = super.anIntArray722[local15];
		@Pc(35) int local35 = super.anIntArray722[local20];
		if (super.aByteArray122 == null) {
			this.aClass128_1.anInt3633 = 0;
		} else {
			this.aClass128_1.anInt3633 = super.aByteArray122[arg0] & 0xFF;
		}
		@Pc(88) int local88;
		@Pc(93) int local93;
		@Pc(100) int local100;
		@Pc(113) int local113;
		if (local25 >= local5) {
			super.anIntArray725[0] = super.anIntArray745[local10];
			super.anIntArray719[0] = super.anIntArray727[local10];
			local1++;
			super.anIntArray742[0] = super.anIntArray746[arg0] & 0xFFFF;
		} else {
			local88 = super.anIntArray743[local10];
			local93 = super.anIntArray750[local10];
			local100 = super.anIntArray746[arg0] & 0xFFFF;
			if (local35 >= local5) {
				local113 = (local5 - local25) * Class63_Sub1.anIntArray752[local35 - local25];
				super.anIntArray725[0] = super.aClass76_5.anInt6890 + (local88 + ((super.anIntArray743[local20] - local88) * local113 >> 16)) * super.aClass39_Sub1_18.anInt2078 / local5;
				super.anIntArray719[0] = super.aClass76_5.anInt6889 + (local93 + ((super.anIntArray750[local20] - local93) * local113 >> 16)) * super.aClass39_Sub1_18.anInt2064 / local5;
				local1++;
				super.anIntArray742[0] = local100 + (((super.anIntArray747[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
			if (local30 >= local5) {
				local113 = (local5 - local25) * Class63_Sub1.anIntArray752[local30 - local25];
				super.anIntArray725[local1] = super.aClass76_5.anInt6890 + (local88 + ((super.anIntArray743[local15] - local88) * local113 >> 16)) * super.aClass39_Sub1_18.anInt2078 / local5;
				super.anIntArray719[local1] = super.aClass76_5.anInt6889 + (local93 + ((super.anIntArray750[local15] - local93) * local113 >> 16)) * super.aClass39_Sub1_18.anInt2064 / local5;
				super.anIntArray742[local1++] = local100 + (((super.anIntArray737[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
		}
		if (local30 >= local5) {
			super.anIntArray725[local1] = super.anIntArray745[local15];
			super.anIntArray719[local1] = super.anIntArray727[local15];
			super.anIntArray742[local1++] = super.anIntArray737[arg0] & 0xFFFF;
		} else {
			local88 = super.anIntArray743[local15];
			local93 = super.anIntArray750[local15];
			local100 = super.anIntArray737[arg0] & 0xFFFF;
			if (local25 >= local5) {
				local113 = (local5 - local30) * Class63_Sub1.anIntArray752[local25 - local30];
				super.anIntArray725[local1] = super.aClass76_5.anInt6890 + (local88 + ((super.anIntArray743[local10] - local88) * local113 >> 16)) * super.aClass39_Sub1_18.anInt2078 / local5;
				super.anIntArray719[local1] = super.aClass76_5.anInt6889 + (local93 + ((super.anIntArray750[local10] - local93) * local113 >> 16)) * super.aClass39_Sub1_18.anInt2064 / local5;
				super.anIntArray742[local1++] = local100 + (((super.anIntArray746[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
			if (local35 >= local5) {
				local113 = (local5 - local30) * Class63_Sub1.anIntArray752[local35 - local30];
				super.anIntArray725[local1] = super.aClass76_5.anInt6890 + (local88 + ((super.anIntArray743[local20] - local88) * local113 >> 16)) * super.aClass39_Sub1_18.anInt2078 / local5;
				super.anIntArray719[local1] = super.aClass76_5.anInt6889 + (local93 + ((super.anIntArray750[local20] - local93) * local113 >> 16)) * super.aClass39_Sub1_18.anInt2064 / local5;
				super.anIntArray742[local1++] = local100 + (((super.anIntArray747[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
		}
		if (local35 >= local5) {
			super.anIntArray725[local1] = super.anIntArray745[local20];
			super.anIntArray719[local1] = super.anIntArray727[local20];
			super.anIntArray742[local1++] = super.anIntArray747[arg0] & 0xFFFF;
		} else {
			local88 = super.anIntArray743[local20];
			local93 = super.anIntArray750[local20];
			local100 = super.anIntArray747[arg0] & 0xFFFF;
			if (local30 >= local5) {
				local113 = (local5 - local35) * Class63_Sub1.anIntArray752[local30 - local35];
				super.anIntArray725[local1] = super.aClass76_5.anInt6890 + (local88 + ((super.anIntArray743[local15] - local88) * local113 >> 16)) * super.aClass39_Sub1_18.anInt2078 / local5;
				super.anIntArray719[local1] = super.aClass76_5.anInt6889 + (local93 + ((super.anIntArray750[local15] - local93) * local113 >> 16)) * super.aClass39_Sub1_18.anInt2064 / local5;
				super.anIntArray742[local1++] = local100 + (((super.anIntArray737[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
			if (local25 >= local5) {
				local113 = (local5 - local35) * Class63_Sub1.anIntArray752[local25 - local35];
				super.anIntArray725[local1] = super.aClass76_5.anInt6890 + (local88 + ((super.anIntArray743[local10] - local88) * local113 >> 16)) * super.aClass39_Sub1_18.anInt2078 / local5;
				super.anIntArray719[local1] = super.aClass76_5.anInt6889 + (local93 + ((super.anIntArray750[local10] - local93) * local113 >> 16)) * super.aClass39_Sub1_18.anInt2064 / local5;
				super.anIntArray742[local1++] = local100 + (((super.anIntArray746[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
		}
		local88 = super.anIntArray725[0];
		local93 = super.anIntArray725[1];
		local100 = super.anIntArray725[2];
		local113 = super.anIntArray719[0];
		@Pc(725) int local725 = super.anIntArray719[1];
		@Pc(730) int local730 = super.anIntArray719[2];
		this.aClass128_1.aBoolean280 = false;
		@Pc(838) int local838;
		@Pc(843) int local843;
		@Pc(848) int local848;
		@Pc(833) int local833;
		if (local1 == 3) {
			if (local88 < 0 || local93 < 0 || local100 < 0 || local88 > super.aClass76_5.anInt6891 || local93 > super.aClass76_5.anInt6891 || local100 > super.aClass76_5.anInt6891) {
				this.aClass128_1.aBoolean280 = true;
			}
			if (super.aShortArray140 != null && super.aShortArray140[arg0] != -1) {
				if (super.aByteArray123 == null || super.aByteArray123[arg0] == -1) {
					local838 = local10;
					local843 = local15;
					local848 = local20;
				} else {
					local833 = super.aByteArray123[arg0] & 0xFF;
					local838 = super.anIntArray740[local833];
					local843 = super.anIntArray717[local833];
					local848 = super.anIntArray720[local833];
				}
				if (super.anIntArray747[arg0] == -1) {
					this.aClass128_1.method3238(local113, local725, local730, local88, local93, local100, super.anIntArray746[arg0], super.anIntArray746[arg0], super.anIntArray746[arg0], super.anIntArray743[local838], super.anIntArray743[local843], super.anIntArray743[local848], super.anIntArray750[local838], super.anIntArray750[local843], super.anIntArray750[local848], super.anIntArray722[local838], super.anIntArray722[local843], super.anIntArray722[local848], super.aShortArray140[arg0]);
				} else {
					this.aClass128_1.method3238(local113, local725, local730, local88, local93, local100, super.anIntArray742[0], super.anIntArray742[1], super.anIntArray742[2], super.anIntArray743[local838], super.anIntArray743[local843], super.anIntArray743[local848], super.anIntArray750[local838], super.anIntArray750[local843], super.anIntArray750[local848], super.anIntArray722[local838], super.anIntArray722[local843], super.anIntArray722[local848], super.aShortArray140[arg0]);
				}
			} else if (super.anIntArray747[arg0] == -1) {
				this.aClass128_1.method3246(local113, local725, local730, local88, local93, local100, Static77.anIntArray130[super.anIntArray746[arg0] & 0xFFFF]);
			} else {
				this.aClass128_1.method3241(local113, local725, local730, local88, local93, local100, super.anIntArray742[0], super.anIntArray742[1], super.anIntArray742[2]);
			}
		}
		if (local1 != 4) {
			return;
		}
		if (local88 < 0 || local93 < 0 || local100 < 0 || local88 > super.aClass76_5.anInt6891 || local93 > super.aClass76_5.anInt6891 || local100 > super.aClass76_5.anInt6891 || super.anIntArray725[3] < 0 || super.anIntArray725[3] > super.aClass76_5.anInt6891) {
			this.aClass128_1.aBoolean280 = true;
		}
		if (super.aShortArray140 == null || super.aShortArray140[arg0] == -1) {
			if (super.anIntArray747[arg0] == -1) {
				local838 = Static77.anIntArray130[super.anIntArray746[arg0] & 0xFFFF];
				this.aClass128_1.method3246(local113, local725, local730, local88, local93, local100, local838);
				this.aClass128_1.method3246(local113, local730, super.anIntArray719[3], local88, local100, super.anIntArray725[3], local838);
				return;
			}
			this.aClass128_1.method3241(local113, local725, local730, local88, local93, local100, super.anIntArray742[0], super.anIntArray742[1], super.anIntArray742[2]);
			this.aClass128_1.method3241(local113, local730, super.anIntArray719[3], local88, local100, super.anIntArray725[3], super.anIntArray742[0], super.anIntArray742[2], super.anIntArray742[3]);
			return;
		}
		if (super.aByteArray123 == null || super.aByteArray123[arg0] == -1) {
			local838 = local10;
			local843 = local15;
			local848 = local20;
		} else {
			local833 = super.aByteArray123[arg0] & 0xFF;
			local838 = super.anIntArray740[local833];
			local843 = super.anIntArray717[local833];
			local848 = super.anIntArray720[local833];
		}
		@Pc(1168) short local1168 = super.aShortArray140[arg0];
		if (super.anIntArray747[arg0] == -1) {
			this.aClass128_1.method3238(local113, local725, local730, local88, local93, local100, super.anIntArray746[arg0], super.anIntArray746[arg0], super.anIntArray746[arg0], super.anIntArray743[local838], super.anIntArray743[local843], super.anIntArray743[local848], super.anIntArray750[local838], super.anIntArray750[local843], super.anIntArray750[local848], super.anIntArray722[local838], super.anIntArray722[local843], super.anIntArray722[local848], local1168);
			this.aClass128_1.method3238(local113, local730, super.anIntArray719[3], local88, local100, super.anIntArray725[3], super.anIntArray746[arg0], super.anIntArray746[arg0], super.anIntArray746[arg0], super.anIntArray743[local838], super.anIntArray743[local843], super.anIntArray743[local848], super.anIntArray750[local838], super.anIntArray750[local843], super.anIntArray750[local848], super.anIntArray722[local838], super.anIntArray722[local843], super.anIntArray722[local848], local1168);
			return;
		}
		this.aClass128_1.method3238(local113, local725, local730, local88, local93, local100, super.anIntArray742[0], super.anIntArray742[1], super.anIntArray742[2], super.anIntArray743[local838], super.anIntArray743[local843], super.anIntArray743[local848], super.anIntArray750[local838], super.anIntArray750[local843], super.anIntArray750[local848], super.anIntArray722[local838], super.anIntArray722[local843], super.anIntArray722[local848], local1168);
		this.aClass128_1.method3238(local113, local730, super.anIntArray719[3], local88, local100, super.anIntArray725[3], super.anIntArray742[0], super.anIntArray742[2], super.anIntArray742[3], super.anIntArray743[local838], super.anIntArray743[local843], super.anIntArray743[local848], super.anIntArray750[local838], super.anIntArray750[local843], super.anIntArray750[local848], super.anIntArray722[local838], super.anIntArray722[local843], super.anIntArray722[local848], local1168);
	}

	@OriginalMember(owner = "client!dv", name = "h", descriptor = "()V")
	@Override
	protected void method7714() {
		this.aClass128_1 = null;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(Ljava/lang/Thread;)V")
	@Override
	protected void method7710(@OriginalArg(0) Thread arg0) {
		super.method7710(arg0);
		@Pc(8) Class76_Sub2 local8 = (Class76_Sub2) super.aClass39_Sub1_18.method2050(arg0);
		this.aClass128_1 = local8.aClass128_2;
	}

	@OriginalMember(owner = "client!dv", name = "c", descriptor = "(I)V")
	@Override
	protected void method7725(@OriginalArg(0) int arg0) {
		if (super.aBooleanArray40[arg0]) {
			this.method1875(arg0);
			return;
		}
		@Pc(13) short local13 = super.aShortArray137[arg0];
		@Pc(18) short local18 = super.aShortArray142[arg0];
		@Pc(23) short local23 = super.aShortArray139[arg0];
		this.aClass128_1.aBoolean280 = super.aBooleanArray39[arg0];
		if (super.aByteArray122 == null) {
			this.aClass128_1.anInt3633 = 0;
		} else {
			this.aClass128_1.anInt3633 = super.aByteArray122[arg0] & 0xFF;
		}
		if (super.aShortArray140 != null && super.aShortArray140[arg0] != -1) {
			@Pc(165) int local165;
			@Pc(170) int local170;
			@Pc(175) int local175;
			if (super.aByteArray123 == null || super.aByteArray123[arg0] == -1) {
				local165 = local13;
				local170 = local18;
				local175 = local23;
			} else {
				@Pc(160) int local160 = super.aByteArray123[arg0] & 0xFF;
				local165 = super.anIntArray740[local160];
				local170 = super.anIntArray717[local160];
				local175 = super.anIntArray720[local160];
			}
			if (super.anIntArray747[arg0] == -1) {
				this.aClass128_1.method3238(super.anIntArray727[local13], super.anIntArray727[local18], super.anIntArray727[local23], super.anIntArray745[local13], super.anIntArray745[local18], super.anIntArray745[local23], super.anIntArray746[arg0], super.anIntArray746[arg0], super.anIntArray746[arg0], super.anIntArray743[local165], super.anIntArray743[local170], super.anIntArray743[local175], super.anIntArray750[local165], super.anIntArray750[local170], super.anIntArray750[local175], super.anIntArray722[local165], super.anIntArray722[local170], super.anIntArray722[local175], super.aShortArray140[arg0]);
			} else {
				this.aClass128_1.method3238(super.anIntArray727[local13], super.anIntArray727[local18], super.anIntArray727[local23], super.anIntArray745[local13], super.anIntArray745[local18], super.anIntArray745[local23], super.anIntArray746[arg0], super.anIntArray737[arg0], super.anIntArray747[arg0], super.anIntArray743[local165], super.anIntArray743[local170], super.anIntArray743[local175], super.anIntArray750[local165], super.anIntArray750[local170], super.anIntArray750[local175], super.anIntArray722[local165], super.anIntArray722[local170], super.anIntArray722[local175], super.aShortArray140[arg0]);
			}
		} else if (super.anIntArray747[arg0] == -1) {
			this.aClass128_1.method3246(super.anIntArray727[local13], super.anIntArray727[local18], super.anIntArray727[local23], super.anIntArray745[local13], super.anIntArray745[local18], super.anIntArray745[local23], Static77.anIntArray130[super.anIntArray746[arg0] & 0xFFFF]);
		} else {
			this.aClass128_1.method3241(super.anIntArray727[local13], super.anIntArray727[local18], super.anIntArray727[local23], super.anIntArray745[local13], super.anIntArray745[local18], super.anIntArray745[local23], super.anIntArray746[arg0] & 0xFFFF, super.anIntArray737[arg0] & 0xFFFF, super.anIntArray747[arg0] & 0xFFFF);
		}
	}
}
