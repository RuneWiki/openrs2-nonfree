import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class97_Sub1_Sub2 extends Class97_Sub1 {

	@OriginalMember(owner = "client!nh", name = "sc", descriptor = "Lclient!uv;")
	private Class298 aClass298_1;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lclient!hr;)V")
	public Class97_Sub1_Sub2(@OriginalArg(0) Class4_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lclient!hr;Lclient!ei;IIII)V")
	public Class97_Sub1_Sub2(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lclient!hr;[Lclient!nh;)V")
	public Class97_Sub1_Sub2(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) Class97_Sub1_Sub2[] arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
	@Override
	protected void method5531(@OriginalArg(0) int arg0) {
		if (super.aBooleanArray23[arg0]) {
			this.method5551(arg0);
			return;
		}
		@Pc(13) short local13 = super.aShortArray99[arg0];
		@Pc(18) short local18 = super.aShortArray104[arg0];
		@Pc(23) short local23 = super.aShortArray100[arg0];
		this.aClass298_1.aBoolean665 = super.aBooleanArray24[arg0];
		if (super.aByteArray81 == null) {
			this.aClass298_1.anInt8806 = 0;
		} else {
			this.aClass298_1.anInt8806 = super.aByteArray81[arg0] & 0xFF;
		}
		if (super.aShortArray102 != null && super.aShortArray102[arg0] != -1) {
			@Pc(189) int local189;
			@Pc(194) int local194;
			@Pc(199) int local199;
			if (super.aByteArray82 == null || super.aByteArray82[arg0] == -1) {
				local189 = local13;
				local194 = local18;
				local199 = local23;
			} else {
				@Pc(184) int local184 = super.aByteArray82[arg0] & 0xFF;
				local189 = super.anIntArray487[local184];
				local194 = super.anIntArray486[local184];
				local199 = super.anIntArray512[local184];
			}
			if (super.anIntArray511[arg0] == -1) {
				this.aClass298_1.method7692(super.anIntArray503[local13], super.anIntArray503[local18], super.anIntArray503[local23], super.anIntArray508[local13], super.anIntArray508[local18], super.anIntArray508[local23], super.anIntArray484[local13], super.anIntArray484[local18], super.anIntArray484[local23], super.anIntArray510[arg0], super.anIntArray510[arg0], super.anIntArray510[arg0], super.anIntArray482[local189], super.anIntArray482[local194], super.anIntArray482[local199], super.anIntArray495[local189], super.anIntArray495[local194], super.anIntArray495[local199], super.anIntArray505[local189], super.anIntArray505[local194], super.anIntArray505[local199], super.aShortArray102[arg0]);
			} else {
				this.aClass298_1.method7692(super.anIntArray503[local13], super.anIntArray503[local18], super.anIntArray503[local23], super.anIntArray508[local13], super.anIntArray508[local18], super.anIntArray508[local23], super.anIntArray484[local13], super.anIntArray484[local18], super.anIntArray484[local23], super.anIntArray510[arg0], super.anIntArray492[arg0], super.anIntArray511[arg0], super.anIntArray482[local189], super.anIntArray482[local194], super.anIntArray482[local199], super.anIntArray495[local189], super.anIntArray495[local194], super.anIntArray495[local199], super.anIntArray505[local189], super.anIntArray505[local194], super.anIntArray505[local199], super.aShortArray102[arg0]);
			}
		} else if (super.anIntArray511[arg0] == -1) {
			this.aClass298_1.method7693(super.anIntArray503[local13], super.anIntArray503[local18], super.anIntArray503[local23], super.anIntArray508[local13], super.anIntArray508[local18], super.anIntArray508[local23], super.anIntArray484[local13], super.anIntArray484[local18], super.anIntArray484[local23], Static19.anIntArray30[super.anIntArray510[arg0] & 0xFFFF]);
		} else {
			this.aClass298_1.method7691(super.anIntArray503[local13], super.anIntArray503[local18], super.anIntArray503[local23], super.anIntArray508[local13], super.anIntArray508[local18], super.anIntArray508[local23], super.anIntArray484[local13], super.anIntArray484[local18], super.anIntArray484[local23], super.anIntArray510[arg0] & 0xFFFF, super.anIntArray492[arg0] & 0xFFFF, super.anIntArray511[arg0] & 0xFFFF);
		}
	}

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)V")
	@Override
	protected void method5533(@OriginalArg(0) int arg0) {
		this.aClass298_1.aBoolean664 = (arg0 & 0x1) == 0;
		this.aClass298_1.aBoolean663 = false;
	}

	@OriginalMember(owner = "client!nh", name = "h", descriptor = "()V")
	@Override
	protected void method5529() {
		super.aClass200_6.anInt6158 = this.aClass298_1.anInt8805;
		super.aClass200_6.anInt6157 = this.aClass298_1.anInt8809;
		super.aClass200_6.anInt6159 = this.aClass298_1.anInt8808;
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(Ljava/lang/Thread;)V")
	@Override
	protected void method5549(@OriginalArg(0) Thread arg0) {
		super.method5549(arg0);
		@Pc(8) Class200_Sub1 local8 = (Class200_Sub1) super.aClass4_Sub1_11.method2741(arg0);
		this.aClass298_1 = local8.aClass298_2;
	}

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "(I)V")
	private void method5551(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = super.aClass4_Sub1_11.anInt2868;
		@Pc(10) short local10 = super.aShortArray99[arg0];
		@Pc(15) short local15 = super.aShortArray104[arg0];
		@Pc(20) short local20 = super.aShortArray100[arg0];
		@Pc(25) int local25 = super.anIntArray505[local10];
		@Pc(30) int local30 = super.anIntArray505[local15];
		@Pc(35) int local35 = super.anIntArray505[local20];
		if (super.aByteArray81 == null) {
			this.aClass298_1.anInt8806 = 0;
		} else {
			this.aClass298_1.anInt8806 = super.aByteArray81[arg0] & 0xFF;
		}
		@Pc(88) int local88;
		@Pc(93) int local93;
		@Pc(100) int local100;
		@Pc(113) int local113;
		if (local25 >= local5) {
			super.anIntArray500[0] = super.anIntArray508[local10];
			super.anIntArray515[0] = super.anIntArray503[local10];
			local1++;
			super.anIntArray497[0] = super.anIntArray510[arg0] & 0xFFFF;
		} else {
			local88 = super.anIntArray482[local10];
			local93 = super.anIntArray495[local10];
			local100 = super.anIntArray510[arg0] & 0xFFFF;
			if (local35 >= local5) {
				local113 = (local5 - local25) * Class97_Sub1.anIntArray514[local35 - local25];
				super.anIntArray500[0] = super.aClass200_6.anInt6157 + (local88 + ((super.anIntArray482[local20] - local88) * local113 >> 16)) * super.aClass4_Sub1_11.anInt2890 / local5;
				super.anIntArray515[0] = super.aClass200_6.anInt6159 + (local93 + ((super.anIntArray495[local20] - local93) * local113 >> 16)) * super.aClass4_Sub1_11.anInt2897 / local5;
				local1++;
				super.anIntArray497[0] = local100 + (((super.anIntArray511[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
			if (local30 >= local5) {
				local113 = (local5 - local25) * Class97_Sub1.anIntArray514[local30 - local25];
				super.anIntArray500[local1] = super.aClass200_6.anInt6157 + (local88 + ((super.anIntArray482[local15] - local88) * local113 >> 16)) * super.aClass4_Sub1_11.anInt2890 / local5;
				super.anIntArray515[local1] = super.aClass200_6.anInt6159 + (local93 + ((super.anIntArray495[local15] - local93) * local113 >> 16)) * super.aClass4_Sub1_11.anInt2897 / local5;
				super.anIntArray497[local1++] = local100 + (((super.anIntArray492[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
		}
		if (local30 >= local5) {
			super.anIntArray500[local1] = super.anIntArray508[local15];
			super.anIntArray515[local1] = super.anIntArray503[local15];
			super.anIntArray497[local1++] = super.anIntArray492[arg0] & 0xFFFF;
		} else {
			local88 = super.anIntArray482[local15];
			local93 = super.anIntArray495[local15];
			local100 = super.anIntArray492[arg0] & 0xFFFF;
			if (local25 >= local5) {
				local113 = (local5 - local30) * Class97_Sub1.anIntArray514[local25 - local30];
				super.anIntArray500[local1] = super.aClass200_6.anInt6157 + (local88 + ((super.anIntArray482[local10] - local88) * local113 >> 16)) * super.aClass4_Sub1_11.anInt2890 / local5;
				super.anIntArray515[local1] = super.aClass200_6.anInt6159 + (local93 + ((super.anIntArray495[local10] - local93) * local113 >> 16)) * super.aClass4_Sub1_11.anInt2897 / local5;
				super.anIntArray497[local1++] = local100 + (((super.anIntArray510[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
			if (local35 >= local5) {
				local113 = (local5 - local30) * Class97_Sub1.anIntArray514[local35 - local30];
				super.anIntArray500[local1] = super.aClass200_6.anInt6157 + (local88 + ((super.anIntArray482[local20] - local88) * local113 >> 16)) * super.aClass4_Sub1_11.anInt2890 / local5;
				super.anIntArray515[local1] = super.aClass200_6.anInt6159 + (local93 + ((super.anIntArray495[local20] - local93) * local113 >> 16)) * super.aClass4_Sub1_11.anInt2897 / local5;
				super.anIntArray497[local1++] = local100 + (((super.anIntArray511[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
		}
		if (local35 >= local5) {
			super.anIntArray500[local1] = super.anIntArray508[local20];
			super.anIntArray515[local1] = super.anIntArray503[local20];
			super.anIntArray497[local1++] = super.anIntArray511[arg0] & 0xFFFF;
		} else {
			local88 = super.anIntArray482[local20];
			local93 = super.anIntArray495[local20];
			local100 = super.anIntArray511[arg0] & 0xFFFF;
			if (local30 >= local5) {
				local113 = (local5 - local35) * Class97_Sub1.anIntArray514[local30 - local35];
				super.anIntArray500[local1] = super.aClass200_6.anInt6157 + (local88 + ((super.anIntArray482[local15] - local88) * local113 >> 16)) * super.aClass4_Sub1_11.anInt2890 / local5;
				super.anIntArray515[local1] = super.aClass200_6.anInt6159 + (local93 + ((super.anIntArray495[local15] - local93) * local113 >> 16)) * super.aClass4_Sub1_11.anInt2897 / local5;
				super.anIntArray497[local1++] = local100 + (((super.anIntArray492[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
			if (local25 >= local5) {
				local113 = (local5 - local35) * Class97_Sub1.anIntArray514[local25 - local35];
				super.anIntArray500[local1] = super.aClass200_6.anInt6157 + (local88 + ((super.anIntArray482[local10] - local88) * local113 >> 16)) * super.aClass4_Sub1_11.anInt2890 / local5;
				super.anIntArray515[local1] = super.aClass200_6.anInt6159 + (local93 + ((super.anIntArray495[local10] - local93) * local113 >> 16)) * super.aClass4_Sub1_11.anInt2897 / local5;
				super.anIntArray497[local1++] = local100 + (((super.anIntArray510[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
		}
		local88 = super.anIntArray500[0];
		local93 = super.anIntArray500[1];
		local100 = super.anIntArray500[2];
		this.aClass298_1.aBoolean665 = false;
		@Pc(766) boolean local766;
		if (local1 == 3) {
			if (local88 < 0 || local93 < 0 || local100 < 0 || local88 > super.aClass200_6.anInt6158 || local93 > super.aClass200_6.anInt6158 || local100 > super.aClass200_6.anInt6158) {
				this.aClass298_1.aBoolean665 = true;
			}
			if (super.aShortArray102 != null && super.aShortArray102[arg0] != -1) {
				if (super.aByteArray82 == null || super.aByteArray82[arg0] == -1) {
					local766 = false;
				} else {
					local766 = true;
				}
			}
		}
		if (local1 != 4) {
			return;
		}
		if (local88 < 0 || local93 < 0 || local100 < 0 || local88 > super.aClass200_6.anInt6158 || local93 > super.aClass200_6.anInt6158 || local100 > super.aClass200_6.anInt6158 || super.anIntArray500[3] < 0 || super.anIntArray500[3] > super.aClass200_6.anInt6158) {
			this.aClass298_1.aBoolean665 = true;
		}
		if (super.aShortArray102 == null || super.aShortArray102[arg0] == -1) {
			return;
		}
		if (super.aByteArray82 == null || super.aByteArray82[arg0] == -1) {
			local766 = false;
		} else {
			local766 = true;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(BIZ)Lclient!r;")
	@Override
	public Class97 method6770(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.method5525(Thread.currentThread());
		@Pc(11) Class97_Sub1 local11;
		@Pc(8) Class97_Sub1 local8;
		if (arg0 == 1) {
			local8 = super.aClass97_Sub1_29;
			local11 = super.aClass97_Sub1_25;
		} else if (arg0 == 2) {
			local8 = super.aClass97_Sub1_28;
			local11 = super.aClass97_Sub1_30;
		} else if (arg0 == 3) {
			local8 = super.aClass97_Sub1_22;
			local11 = super.aClass97_Sub1_27;
		} else if (arg0 == 4) {
			local8 = super.aClass97_Sub1_26;
			local11 = super.aClass97_Sub1_24;
		} else if (arg0 == 5) {
			local8 = super.aClass97_Sub1_21;
			local11 = super.aClass97_Sub1_23;
		} else {
			local11 = local8 = new Class97_Sub1_Sub2(super.aClass4_Sub1_11);
		}
		return this.method5528(local11, local8, arg1, arg0 != 0, arg2);
	}

	@OriginalMember(owner = "client!nh", name = "p", descriptor = "()V")
	@Override
	protected void method5545() {
		this.aClass298_1 = null;
	}

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "(I)V")
	@Override
	protected void method5538(@OriginalArg(0) int arg0) {
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
		if (!super.aClass4_Sub1_11.aBoolean245) {
			local8 = super.aShortArray99[arg0];
			local13 = super.aShortArray104[arg0];
			local18 = super.aShortArray100[arg0];
			local27 = super.anIntArray484[local8] - super.aClass4_Sub1_11.anInt2880;
			if (local27 > 255) {
				local27 = 255;
			} else if (local27 < 0) {
				local27 = 0;
			}
			local46 = super.anIntArray484[local13] - super.aClass4_Sub1_11.anInt2880;
			if (local46 > 255) {
				local46 = 255;
			} else if (local46 < 0) {
				local46 = 0;
			}
			local65 = super.anIntArray484[local18] - super.aClass4_Sub1_11.anInt2880;
			if (local65 > 255) {
				local65 = 255;
			} else if (local65 < 0) {
				local65 = 0;
			}
			local81 = local27 + local46 + local65;
			if (local81 != 765) {
				if (local81 == 0) {
					this.method5531(arg0);
				} else {
					if (super.aByteArray81 == null) {
						this.aClass298_1.anInt8806 = 0;
					} else {
						this.aClass298_1.anInt8806 = super.aByteArray81[arg0] & 0xFF;
					}
					this.aClass298_1.aBoolean665 = super.aBooleanArray24[arg0];
					if (super.aShortArray102 != null && super.aShortArray102[arg0] != -1) {
						if (super.aByteArray82 == null || super.aByteArray82[arg0] == -1) {
							local333 = local8;
							local338 = local13;
							local343 = local18;
						} else {
							@Pc(328) int local328 = super.aByteArray82[arg0] & 0xFF;
							local333 = super.anIntArray487[local328];
							local338 = super.anIntArray486[local328];
							local343 = super.anIntArray512[local328];
						}
						if (super.anIntArray511[arg0] == -1) {
							this.aClass298_1.method7696(super.anIntArray503[local8], super.anIntArray503[local13], super.anIntArray503[local18], super.anIntArray508[local8], super.anIntArray508[local13], super.anIntArray508[local18], super.anIntArray484[local8], super.anIntArray484[local13], super.anIntArray484[local18], super.aClass4_Sub1_11.anInt2889, local27, local46, local65, super.anIntArray510[arg0], super.anIntArray510[arg0], super.anIntArray510[arg0], super.anIntArray482[local333], super.anIntArray482[local338], super.anIntArray482[local343], super.anIntArray495[local333], super.anIntArray495[local338], super.anIntArray495[local343], super.anIntArray505[local333], super.anIntArray505[local338], super.anIntArray505[local343], super.aShortArray102[arg0]);
						} else {
							this.aClass298_1.method7696(super.anIntArray503[local8], super.anIntArray503[local13], super.anIntArray503[local18], super.anIntArray508[local8], super.anIntArray508[local13], super.anIntArray508[local18], super.anIntArray484[local8], super.anIntArray484[local13], super.anIntArray484[local18], super.aClass4_Sub1_11.anInt2889, local27, local46, local65, super.anIntArray510[arg0], super.anIntArray492[arg0], super.anIntArray511[arg0], super.anIntArray482[local333], super.anIntArray482[local338], super.anIntArray482[local343], super.anIntArray495[local333], super.anIntArray495[local338], super.anIntArray495[local343], super.anIntArray505[local333], super.anIntArray505[local338], super.anIntArray505[local343], super.aShortArray102[arg0]);
						}
					} else if (super.anIntArray511[arg0] == -1) {
						this.aClass298_1.method7694(super.anIntArray503[local8], super.anIntArray503[local13], super.anIntArray503[local18], super.anIntArray508[local8], super.anIntArray508[local13], super.anIntArray508[local18], super.anIntArray484[local8], super.anIntArray484[local13], super.anIntArray484[local18], Static342.method5736(local27 << 24 | super.aClass4_Sub1_11.anInt2889, Static19.anIntArray30[super.anIntArray510[arg0] & 0xFFFF]), Static342.method5736(local46 << 24 | super.aClass4_Sub1_11.anInt2889, Static19.anIntArray30[super.anIntArray510[arg0] & 0xFFFF]), Static342.method5736(local65 << 24 | super.aClass4_Sub1_11.anInt2889, Static19.anIntArray30[super.anIntArray510[arg0] & 0xFFFF]));
					} else {
						this.aClass298_1.method7694(super.anIntArray503[local8], super.anIntArray503[local13], super.anIntArray503[local18], super.anIntArray508[local8], super.anIntArray508[local13], super.anIntArray508[local18], super.anIntArray484[local8], super.anIntArray484[local13], super.anIntArray484[local18], Static342.method5736(local27 << 24 | super.aClass4_Sub1_11.anInt2889, Static19.anIntArray30[super.anIntArray510[arg0] & 0xFFFF]), Static342.method5736(local46 << 24 | super.aClass4_Sub1_11.anInt2889, Static19.anIntArray30[super.anIntArray492[arg0] & 0xFFFF]), Static342.method5736(local65 << 24 | super.aClass4_Sub1_11.anInt2889, Static19.anIntArray30[super.anIntArray511[arg0] & 0xFFFF]));
					}
				}
			}
		} else if (!super.aBooleanArray23[arg0]) {
			local8 = super.aShortArray99[arg0];
			local13 = super.aShortArray104[arg0];
			local18 = super.aShortArray100[arg0];
			local27 = 0;
			local46 = 0;
			local65 = 0;
			if (super.anIntArray488[local8] > super.aClass4_Sub1_11.anInt2895) {
				local27 = 255;
			} else if (super.anIntArray488[local8] > super.aClass4_Sub1_11.anInt2876) {
				local27 = (super.aClass4_Sub1_11.anInt2876 - super.anIntArray488[local8]) * 255 / (super.aClass4_Sub1_11.anInt2876 - super.aClass4_Sub1_11.anInt2895);
			}
			if (super.anIntArray488[local13] > super.aClass4_Sub1_11.anInt2895) {
				local46 = 255;
			} else if (super.anIntArray488[local13] > super.aClass4_Sub1_11.anInt2876) {
				local46 = (super.aClass4_Sub1_11.anInt2876 - super.anIntArray488[local13]) * 255 / (super.aClass4_Sub1_11.anInt2876 - super.aClass4_Sub1_11.anInt2895);
			}
			if (super.anIntArray488[local18] > super.aClass4_Sub1_11.anInt2895) {
				local65 = 255;
			} else if (super.anIntArray488[local18] > super.aClass4_Sub1_11.anInt2876) {
				local65 = (super.aClass4_Sub1_11.anInt2876 - super.anIntArray488[local18]) * 255 / (super.aClass4_Sub1_11.anInt2876 - super.aClass4_Sub1_11.anInt2895);
			}
			if (super.aByteArray81 == null) {
				this.aClass298_1.anInt8806 = 0;
			} else {
				this.aClass298_1.anInt8806 = super.aByteArray81[arg0] & 0xFF;
			}
			this.aClass298_1.aBoolean665 = super.aBooleanArray24[arg0];
			if (super.aShortArray102 != null && super.aShortArray102[arg0] != -1) {
				if (super.aByteArray82 == null || super.aByteArray82[arg0] == -1) {
					local81 = local8;
					local333 = local13;
					local338 = local18;
				} else {
					local343 = super.aByteArray82[arg0] & 0xFF;
					local81 = super.anIntArray487[local343];
					local333 = super.anIntArray486[local343];
					local338 = super.anIntArray512[local343];
				}
				if (super.anIntArray511[arg0] == -1) {
					this.aClass298_1.method7696(super.anIntArray503[local8], super.anIntArray503[local13], super.anIntArray503[local18], super.anIntArray508[local8], super.anIntArray508[local13], super.anIntArray508[local18], super.anIntArray484[local8], super.anIntArray484[local13], super.anIntArray484[local18], super.aClass4_Sub1_11.anInt2889, local27, local46, local65, super.anIntArray510[arg0], super.anIntArray510[arg0], super.anIntArray510[arg0], super.anIntArray482[local81], super.anIntArray482[local333], super.anIntArray482[local338], super.anIntArray495[local81], super.anIntArray495[local333], super.anIntArray495[local338], super.anIntArray505[local81], super.anIntArray505[local333], super.anIntArray505[local338], super.aShortArray102[arg0]);
				} else {
					this.aClass298_1.method7696(super.anIntArray503[local8], super.anIntArray503[local13], super.anIntArray503[local18], super.anIntArray508[local8], super.anIntArray508[local13], super.anIntArray508[local18], super.anIntArray484[local8], super.anIntArray484[local13], super.anIntArray484[local18], super.aClass4_Sub1_11.anInt2889, local27, local46, local65, super.anIntArray510[arg0], super.anIntArray492[arg0], super.anIntArray511[arg0], super.anIntArray482[local81], super.anIntArray482[local333], super.anIntArray482[local338], super.anIntArray495[local81], super.anIntArray495[local333], super.anIntArray495[local338], super.anIntArray505[local81], super.anIntArray505[local333], super.anIntArray505[local338], super.aShortArray102[arg0]);
				}
			} else if (super.anIntArray511[arg0] == -1) {
				this.aClass298_1.method7694(super.anIntArray503[local8], super.anIntArray503[local13], super.anIntArray503[local18], super.anIntArray508[local8], super.anIntArray508[local13], super.anIntArray508[local18], super.anIntArray484[local8], super.anIntArray484[local13], super.anIntArray484[local18], Static342.method5736(local27 << 24 | super.aClass4_Sub1_11.anInt2889, Static19.anIntArray30[super.anIntArray510[arg0] & 0xFFFF]), Static342.method5736(local46 << 24 | super.aClass4_Sub1_11.anInt2889, Static19.anIntArray30[super.anIntArray510[arg0] & 0xFFFF]), Static342.method5736(local65 << 24 | super.aClass4_Sub1_11.anInt2889, Static19.anIntArray30[super.anIntArray510[arg0] & 0xFFFF]));
			} else {
				this.aClass298_1.method7694(super.anIntArray503[local8], super.anIntArray503[local13], super.anIntArray503[local18], super.anIntArray508[local8], super.anIntArray508[local13], super.anIntArray508[local18], super.anIntArray484[local8], super.anIntArray484[local13], super.anIntArray484[local18], Static342.method5736(local27 << 24 | super.aClass4_Sub1_11.anInt2889, Static19.anIntArray30[super.anIntArray510[arg0] & 0xFFFF]), Static342.method5736(local46 << 24 | super.aClass4_Sub1_11.anInt2889, Static19.anIntArray30[super.anIntArray492[arg0] & 0xFFFF]), Static342.method5736(local65 << 24 | super.aClass4_Sub1_11.anInt2889, Static19.anIntArray30[super.anIntArray511[arg0] & 0xFFFF]));
			}
		}
	}
}
