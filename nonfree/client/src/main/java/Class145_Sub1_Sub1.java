import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iu")
public final class Class145_Sub1_Sub1 extends Class145_Sub1 {

	@OriginalMember(owner = "client!iu", name = "rc", descriptor = "Lclient!eda;")
	private Class77 aClass77_2;

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(Lclient!jba;[Lclient!iu;)V")
	public Class145_Sub1_Sub1(@OriginalArg(0) Class122_Sub1 arg0, @OriginalArg(1) Class145_Sub1_Sub1[] arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(Lclient!jba;Lclient!fp;IIII)V")
	public Class145_Sub1_Sub1(@OriginalArg(0) Class122_Sub1 arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(Lclient!jba;)V")
	public Class145_Sub1_Sub1(@OriginalArg(0) Class122_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!iu", name = "f", descriptor = "(I)V")
	@Override
	protected void method4283(@OriginalArg(0) int arg0) {
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
		if (!super.aClass122_Sub1_11.aBoolean620) {
			local8 = super.aShortArray88[arg0];
			local13 = super.aShortArray89[arg0];
			local18 = super.aShortArray91[arg0];
			local27 = super.anIntArray479[local8] - super.aClass122_Sub1_11.lb;
			if (local27 > 255) {
				local27 = 255;
			} else if (local27 < 0) {
				local27 = 0;
			}
			local46 = super.anIntArray479[local13] - super.aClass122_Sub1_11.lb;
			if (local46 > 255) {
				local46 = 255;
			} else if (local46 < 0) {
				local46 = 0;
			}
			local65 = super.anIntArray479[local18] - super.aClass122_Sub1_11.lb;
			if (local65 > 255) {
				local65 = 255;
			} else if (local65 < 0) {
				local65 = 0;
			}
			local81 = local27 + local46 + local65;
			if (local81 != 765) {
				if (local81 == 0) {
					this.method4262(arg0);
				} else {
					if (super.aByteArray74 == null) {
						this.aClass77_2.anInt2141 = 0;
					} else {
						this.aClass77_2.anInt2141 = super.aByteArray74[arg0] & 0xFF;
					}
					this.aClass77_2.aBoolean133 = super.aBooleanArray32[arg0];
					if (super.aShortArray86 != null && super.aShortArray86[arg0] != -1) {
						if (super.aByteArray75 == null || super.aByteArray75[arg0] == -1) {
							local333 = local8;
							local338 = local13;
							local343 = local18;
						} else {
							@Pc(328) int local328 = super.aByteArray75[arg0] & 0xFF;
							local333 = super.anIntArray493[local328];
							local338 = super.anIntArray503[local328];
							local343 = super.anIntArray508[local328];
						}
						if (super.anIntArray485[arg0] == -1) {
							this.aClass77_2.method1800(super.anIntArray512[local8], super.anIntArray512[local13], super.anIntArray512[local18], super.anIntArray494[local8], super.anIntArray494[local13], super.anIntArray494[local18], super.anIntArray479[local8], super.anIntArray479[local13], super.anIntArray479[local18], super.aClass122_Sub1_11.anInt8846, local27, local46, local65, super.anIntArray504[arg0], super.anIntArray504[arg0], super.anIntArray504[arg0], super.anIntArray488[local333], super.anIntArray488[local338], super.anIntArray488[local343], super.anIntArray492[local333], super.anIntArray492[local338], super.anIntArray492[local343], super.anIntArray511[local333], super.anIntArray511[local338], super.anIntArray511[local343], super.aShortArray86[arg0]);
						} else {
							this.aClass77_2.method1800(super.anIntArray512[local8], super.anIntArray512[local13], super.anIntArray512[local18], super.anIntArray494[local8], super.anIntArray494[local13], super.anIntArray494[local18], super.anIntArray479[local8], super.anIntArray479[local13], super.anIntArray479[local18], super.aClass122_Sub1_11.anInt8846, local27, local46, local65, super.anIntArray504[arg0], super.anIntArray484[arg0], super.anIntArray485[arg0], super.anIntArray488[local333], super.anIntArray488[local338], super.anIntArray488[local343], super.anIntArray492[local333], super.anIntArray492[local338], super.anIntArray492[local343], super.anIntArray511[local333], super.anIntArray511[local338], super.anIntArray511[local343], super.aShortArray86[arg0]);
						}
					} else if (super.anIntArray485[arg0] == -1) {
						this.aClass77_2.method1814(super.anIntArray512[local8], super.anIntArray512[local13], super.anIntArray512[local18], super.anIntArray494[local8], super.anIntArray494[local13], super.anIntArray494[local18], super.anIntArray479[local8], super.anIntArray479[local13], super.anIntArray479[local18], Static162.method2505(local27 << 24 | super.aClass122_Sub1_11.anInt8846, Static488.anIntArray759[super.anIntArray504[arg0] & 0xFFFF]), Static162.method2505(local46 << 24 | super.aClass122_Sub1_11.anInt8846, Static488.anIntArray759[super.anIntArray504[arg0] & 0xFFFF]), Static162.method2505(local65 << 24 | super.aClass122_Sub1_11.anInt8846, Static488.anIntArray759[super.anIntArray504[arg0] & 0xFFFF]));
					} else {
						this.aClass77_2.method1814(super.anIntArray512[local8], super.anIntArray512[local13], super.anIntArray512[local18], super.anIntArray494[local8], super.anIntArray494[local13], super.anIntArray494[local18], super.anIntArray479[local8], super.anIntArray479[local13], super.anIntArray479[local18], Static162.method2505(local27 << 24 | super.aClass122_Sub1_11.anInt8846, Static488.anIntArray759[super.anIntArray504[arg0] & 0xFFFF]), Static162.method2505(local46 << 24 | super.aClass122_Sub1_11.anInt8846, Static488.anIntArray759[super.anIntArray484[arg0] & 0xFFFF]), Static162.method2505(local65 << 24 | super.aClass122_Sub1_11.anInt8846, Static488.anIntArray759[super.anIntArray485[arg0] & 0xFFFF]));
					}
				}
			}
		} else if (!super.aBooleanArray31[arg0]) {
			local8 = super.aShortArray88[arg0];
			local13 = super.aShortArray89[arg0];
			local18 = super.aShortArray91[arg0];
			local27 = 0;
			local46 = 0;
			local65 = 0;
			if (super.anIntArray497[local8] > super.aClass122_Sub1_11.anInt8828) {
				local27 = 255;
			} else if (super.anIntArray497[local8] > super.aClass122_Sub1_11.anInt8827) {
				local27 = (super.aClass122_Sub1_11.anInt8827 - super.anIntArray497[local8]) * 255 / (super.aClass122_Sub1_11.anInt8827 - super.aClass122_Sub1_11.anInt8828);
			}
			if (super.anIntArray497[local13] > super.aClass122_Sub1_11.anInt8828) {
				local46 = 255;
			} else if (super.anIntArray497[local13] > super.aClass122_Sub1_11.anInt8827) {
				local46 = (super.aClass122_Sub1_11.anInt8827 - super.anIntArray497[local13]) * 255 / (super.aClass122_Sub1_11.anInt8827 - super.aClass122_Sub1_11.anInt8828);
			}
			if (super.anIntArray497[local18] > super.aClass122_Sub1_11.anInt8828) {
				local65 = 255;
			} else if (super.anIntArray497[local18] > super.aClass122_Sub1_11.anInt8827) {
				local65 = (super.aClass122_Sub1_11.anInt8827 - super.anIntArray497[local18]) * 255 / (super.aClass122_Sub1_11.anInt8827 - super.aClass122_Sub1_11.anInt8828);
			}
			if (super.aByteArray74 == null) {
				this.aClass77_2.anInt2141 = 0;
			} else {
				this.aClass77_2.anInt2141 = super.aByteArray74[arg0] & 0xFF;
			}
			this.aClass77_2.aBoolean133 = super.aBooleanArray32[arg0];
			if (super.aShortArray86 != null && super.aShortArray86[arg0] != -1) {
				if (super.aByteArray75 == null || super.aByteArray75[arg0] == -1) {
					local81 = local8;
					local333 = local13;
					local338 = local18;
				} else {
					local343 = super.aByteArray75[arg0] & 0xFF;
					local81 = super.anIntArray493[local343];
					local333 = super.anIntArray503[local343];
					local338 = super.anIntArray508[local343];
				}
				if (super.anIntArray485[arg0] == -1) {
					this.aClass77_2.method1800(super.anIntArray512[local8], super.anIntArray512[local13], super.anIntArray512[local18], super.anIntArray494[local8], super.anIntArray494[local13], super.anIntArray494[local18], super.anIntArray479[local8], super.anIntArray479[local13], super.anIntArray479[local18], super.aClass122_Sub1_11.anInt8846, local27, local46, local65, super.anIntArray504[arg0], super.anIntArray504[arg0], super.anIntArray504[arg0], super.anIntArray488[local81], super.anIntArray488[local333], super.anIntArray488[local338], super.anIntArray492[local81], super.anIntArray492[local333], super.anIntArray492[local338], super.anIntArray511[local81], super.anIntArray511[local333], super.anIntArray511[local338], super.aShortArray86[arg0]);
				} else {
					this.aClass77_2.method1800(super.anIntArray512[local8], super.anIntArray512[local13], super.anIntArray512[local18], super.anIntArray494[local8], super.anIntArray494[local13], super.anIntArray494[local18], super.anIntArray479[local8], super.anIntArray479[local13], super.anIntArray479[local18], super.aClass122_Sub1_11.anInt8846, local27, local46, local65, super.anIntArray504[arg0], super.anIntArray484[arg0], super.anIntArray485[arg0], super.anIntArray488[local81], super.anIntArray488[local333], super.anIntArray488[local338], super.anIntArray492[local81], super.anIntArray492[local333], super.anIntArray492[local338], super.anIntArray511[local81], super.anIntArray511[local333], super.anIntArray511[local338], super.aShortArray86[arg0]);
				}
			} else if (super.anIntArray485[arg0] == -1) {
				this.aClass77_2.method1814(super.anIntArray512[local8], super.anIntArray512[local13], super.anIntArray512[local18], super.anIntArray494[local8], super.anIntArray494[local13], super.anIntArray494[local18], super.anIntArray479[local8], super.anIntArray479[local13], super.anIntArray479[local18], Static162.method2505(local27 << 24 | super.aClass122_Sub1_11.anInt8846, Static488.anIntArray759[super.anIntArray504[arg0] & 0xFFFF]), Static162.method2505(local46 << 24 | super.aClass122_Sub1_11.anInt8846, Static488.anIntArray759[super.anIntArray504[arg0] & 0xFFFF]), Static162.method2505(local65 << 24 | super.aClass122_Sub1_11.anInt8846, Static488.anIntArray759[super.anIntArray504[arg0] & 0xFFFF]));
			} else {
				this.aClass77_2.method1814(super.anIntArray512[local8], super.anIntArray512[local13], super.anIntArray512[local18], super.anIntArray494[local8], super.anIntArray494[local13], super.anIntArray494[local18], super.anIntArray479[local8], super.anIntArray479[local13], super.anIntArray479[local18], Static162.method2505(local27 << 24 | super.aClass122_Sub1_11.anInt8846, Static488.anIntArray759[super.anIntArray504[arg0] & 0xFFFF]), Static162.method2505(local46 << 24 | super.aClass122_Sub1_11.anInt8846, Static488.anIntArray759[super.anIntArray484[arg0] & 0xFFFF]), Static162.method2505(local65 << 24 | super.aClass122_Sub1_11.anInt8846, Static488.anIntArray759[super.anIntArray485[arg0] & 0xFFFF]));
			}
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(Ljava/lang/Thread;)V")
	@Override
	protected void method4278(@OriginalArg(0) Thread arg0) {
		super.method4278(arg0);
		@Pc(8) Class16_Sub1 local8 = (Class16_Sub1) super.aClass122_Sub1_11.method7289(arg0);
		this.aClass77_2 = local8.aClass77_1;
	}

	@OriginalMember(owner = "client!iu", name = "e", descriptor = "(I)V")
	@Override
	protected void method4276(@OriginalArg(0) int arg0) {
		this.aClass77_2.aBoolean132 = (arg0 & 0x1) == 0;
		this.aClass77_2.aBoolean130 = false;
	}

	@OriginalMember(owner = "client!iu", name = "h", descriptor = "(I)V")
	private void method3729(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = super.aClass122_Sub1_11.anInt8841;
		@Pc(10) short local10 = super.aShortArray88[arg0];
		@Pc(15) short local15 = super.aShortArray89[arg0];
		@Pc(20) short local20 = super.aShortArray91[arg0];
		@Pc(25) int local25 = super.anIntArray511[local10];
		@Pc(30) int local30 = super.anIntArray511[local15];
		@Pc(35) int local35 = super.anIntArray511[local20];
		if (super.aByteArray74 == null) {
			this.aClass77_2.anInt2141 = 0;
		} else {
			this.aClass77_2.anInt2141 = super.aByteArray74[arg0] & 0xFF;
		}
		@Pc(88) int local88;
		@Pc(93) int local93;
		@Pc(100) int local100;
		@Pc(113) int local113;
		if (local25 >= local5) {
			super.anIntArray509[0] = super.anIntArray494[local10];
			super.anIntArray491[0] = super.anIntArray512[local10];
			local1++;
			super.anIntArray487[0] = super.anIntArray504[arg0] & 0xFFFF;
		} else {
			local88 = super.anIntArray488[local10];
			local93 = super.anIntArray492[local10];
			local100 = super.anIntArray504[arg0] & 0xFFFF;
			if (local35 >= local5) {
				local113 = (local5 - local25) * Class145_Sub1.anIntArray510[local35 - local25];
				super.anIntArray509[0] = super.aClass16_6.anInt8747 + (local88 + ((super.anIntArray488[local20] - local88) * local113 >> 16)) * super.aClass122_Sub1_11.anInt8837 / local5;
				super.anIntArray491[0] = super.aClass16_6.anInt8746 + (local93 + ((super.anIntArray492[local20] - local93) * local113 >> 16)) * super.aClass122_Sub1_11.anInt8855 / local5;
				local1++;
				super.anIntArray487[0] = local100 + (((super.anIntArray485[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
			if (local30 >= local5) {
				local113 = (local5 - local25) * Class145_Sub1.anIntArray510[local30 - local25];
				super.anIntArray509[local1] = super.aClass16_6.anInt8747 + (local88 + ((super.anIntArray488[local15] - local88) * local113 >> 16)) * super.aClass122_Sub1_11.anInt8837 / local5;
				super.anIntArray491[local1] = super.aClass16_6.anInt8746 + (local93 + ((super.anIntArray492[local15] - local93) * local113 >> 16)) * super.aClass122_Sub1_11.anInt8855 / local5;
				super.anIntArray487[local1++] = local100 + (((super.anIntArray484[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
		}
		if (local30 >= local5) {
			super.anIntArray509[local1] = super.anIntArray494[local15];
			super.anIntArray491[local1] = super.anIntArray512[local15];
			super.anIntArray487[local1++] = super.anIntArray484[arg0] & 0xFFFF;
		} else {
			local88 = super.anIntArray488[local15];
			local93 = super.anIntArray492[local15];
			local100 = super.anIntArray484[arg0] & 0xFFFF;
			if (local25 >= local5) {
				local113 = (local5 - local30) * Class145_Sub1.anIntArray510[local25 - local30];
				super.anIntArray509[local1] = super.aClass16_6.anInt8747 + (local88 + ((super.anIntArray488[local10] - local88) * local113 >> 16)) * super.aClass122_Sub1_11.anInt8837 / local5;
				super.anIntArray491[local1] = super.aClass16_6.anInt8746 + (local93 + ((super.anIntArray492[local10] - local93) * local113 >> 16)) * super.aClass122_Sub1_11.anInt8855 / local5;
				super.anIntArray487[local1++] = local100 + (((super.anIntArray504[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
			if (local35 >= local5) {
				local113 = (local5 - local30) * Class145_Sub1.anIntArray510[local35 - local30];
				super.anIntArray509[local1] = super.aClass16_6.anInt8747 + (local88 + ((super.anIntArray488[local20] - local88) * local113 >> 16)) * super.aClass122_Sub1_11.anInt8837 / local5;
				super.anIntArray491[local1] = super.aClass16_6.anInt8746 + (local93 + ((super.anIntArray492[local20] - local93) * local113 >> 16)) * super.aClass122_Sub1_11.anInt8855 / local5;
				super.anIntArray487[local1++] = local100 + (((super.anIntArray485[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
		}
		if (local35 >= local5) {
			super.anIntArray509[local1] = super.anIntArray494[local20];
			super.anIntArray491[local1] = super.anIntArray512[local20];
			super.anIntArray487[local1++] = super.anIntArray485[arg0] & 0xFFFF;
		} else {
			local88 = super.anIntArray488[local20];
			local93 = super.anIntArray492[local20];
			local100 = super.anIntArray485[arg0] & 0xFFFF;
			if (local30 >= local5) {
				local113 = (local5 - local35) * Class145_Sub1.anIntArray510[local30 - local35];
				super.anIntArray509[local1] = super.aClass16_6.anInt8747 + (local88 + ((super.anIntArray488[local15] - local88) * local113 >> 16)) * super.aClass122_Sub1_11.anInt8837 / local5;
				super.anIntArray491[local1] = super.aClass16_6.anInt8746 + (local93 + ((super.anIntArray492[local15] - local93) * local113 >> 16)) * super.aClass122_Sub1_11.anInt8855 / local5;
				super.anIntArray487[local1++] = local100 + (((super.anIntArray484[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
			if (local25 >= local5) {
				local113 = (local5 - local35) * Class145_Sub1.anIntArray510[local25 - local35];
				super.anIntArray509[local1] = super.aClass16_6.anInt8747 + (local88 + ((super.anIntArray488[local10] - local88) * local113 >> 16)) * super.aClass122_Sub1_11.anInt8837 / local5;
				super.anIntArray491[local1] = super.aClass16_6.anInt8746 + (local93 + ((super.anIntArray492[local10] - local93) * local113 >> 16)) * super.aClass122_Sub1_11.anInt8855 / local5;
				super.anIntArray487[local1++] = local100 + (((super.anIntArray504[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
		}
		local88 = super.anIntArray509[0];
		local93 = super.anIntArray509[1];
		local100 = super.anIntArray509[2];
		this.aClass77_2.aBoolean133 = false;
		@Pc(766) boolean local766;
		if (local1 == 3) {
			if (local88 < 0 || local93 < 0 || local100 < 0 || local88 > super.aClass16_6.anInt8745 || local93 > super.aClass16_6.anInt8745 || local100 > super.aClass16_6.anInt8745) {
				this.aClass77_2.aBoolean133 = true;
			}
			if (super.aShortArray86 != null && super.aShortArray86[arg0] != -1) {
				if (super.aByteArray75 == null || super.aByteArray75[arg0] == -1) {
					local766 = false;
				} else {
					local766 = true;
				}
			}
		}
		if (local1 != 4) {
			return;
		}
		if (local88 < 0 || local93 < 0 || local100 < 0 || local88 > super.aClass16_6.anInt8745 || local93 > super.aClass16_6.anInt8745 || local100 > super.aClass16_6.anInt8745 || super.anIntArray509[3] < 0 || super.anIntArray509[3] > super.aClass16_6.anInt8745) {
			this.aClass77_2.aBoolean133 = true;
		}
		if (super.aShortArray86 == null || super.aShortArray86[arg0] == -1) {
			return;
		}
		if (super.aByteArray75 == null || super.aByteArray75[arg0] == -1) {
			local766 = false;
		} else {
			local766 = true;
		}
	}

	@OriginalMember(owner = "client!iu", name = "p", descriptor = "()V")
	@Override
	protected void method4279() {
		this.aClass77_2 = null;
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(BIZ)Lclient!r;")
	@Override
	public Class145 method6672(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.method4280(Thread.currentThread());
		@Pc(11) Class145_Sub1 local11;
		@Pc(8) Class145_Sub1 local8;
		if (arg0 == 1) {
			local8 = super.aClass145_Sub1_43;
			local11 = super.aClass145_Sub1_45;
		} else if (arg0 == 2) {
			local8 = super.aClass145_Sub1_50;
			local11 = super.aClass145_Sub1_42;
		} else if (arg0 == 3) {
			local8 = super.aClass145_Sub1_49;
			local11 = super.aClass145_Sub1_46;
		} else if (arg0 == 4) {
			local8 = super.aClass145_Sub1_44;
			local11 = super.aClass145_Sub1_41;
		} else if (arg0 == 5) {
			local8 = super.aClass145_Sub1_48;
			local11 = super.aClass145_Sub1_47;
		} else {
			local11 = local8 = new Class145_Sub1_Sub1(super.aClass122_Sub1_11);
		}
		return this.method4265(local11, local8, arg1, arg0 != 0, arg2);
	}

	@OriginalMember(owner = "client!iu", name = "c", descriptor = "(I)V")
	@Override
	protected void method4262(@OriginalArg(0) int arg0) {
		if (super.aBooleanArray31[arg0]) {
			this.method3729(arg0);
			return;
		}
		@Pc(13) short local13 = super.aShortArray88[arg0];
		@Pc(18) short local18 = super.aShortArray89[arg0];
		@Pc(23) short local23 = super.aShortArray91[arg0];
		this.aClass77_2.aBoolean133 = super.aBooleanArray32[arg0];
		if (super.aByteArray74 == null) {
			this.aClass77_2.anInt2141 = 0;
		} else {
			this.aClass77_2.anInt2141 = super.aByteArray74[arg0] & 0xFF;
		}
		if (super.aShortArray86 != null && super.aShortArray86[arg0] != -1) {
			@Pc(189) int local189;
			@Pc(194) int local194;
			@Pc(199) int local199;
			if (super.aByteArray75 == null || super.aByteArray75[arg0] == -1) {
				local189 = local13;
				local194 = local18;
				local199 = local23;
			} else {
				@Pc(184) int local184 = super.aByteArray75[arg0] & 0xFF;
				local189 = super.anIntArray493[local184];
				local194 = super.anIntArray503[local184];
				local199 = super.anIntArray508[local184];
			}
			if (super.anIntArray485[arg0] == -1) {
				this.aClass77_2.method1815(super.anIntArray512[local13], super.anIntArray512[local18], super.anIntArray512[local23], super.anIntArray494[local13], super.anIntArray494[local18], super.anIntArray494[local23], super.anIntArray479[local13], super.anIntArray479[local18], super.anIntArray479[local23], super.anIntArray504[arg0], super.anIntArray504[arg0], super.anIntArray504[arg0], super.anIntArray488[local189], super.anIntArray488[local194], super.anIntArray488[local199], super.anIntArray492[local189], super.anIntArray492[local194], super.anIntArray492[local199], super.anIntArray511[local189], super.anIntArray511[local194], super.anIntArray511[local199], super.aShortArray86[arg0]);
			} else {
				this.aClass77_2.method1815(super.anIntArray512[local13], super.anIntArray512[local18], super.anIntArray512[local23], super.anIntArray494[local13], super.anIntArray494[local18], super.anIntArray494[local23], super.anIntArray479[local13], super.anIntArray479[local18], super.anIntArray479[local23], super.anIntArray504[arg0], super.anIntArray484[arg0], super.anIntArray485[arg0], super.anIntArray488[local189], super.anIntArray488[local194], super.anIntArray488[local199], super.anIntArray492[local189], super.anIntArray492[local194], super.anIntArray492[local199], super.anIntArray511[local189], super.anIntArray511[local194], super.anIntArray511[local199], super.aShortArray86[arg0]);
			}
		} else if (super.anIntArray485[arg0] == -1) {
			this.aClass77_2.method1808(super.anIntArray512[local13], super.anIntArray512[local18], super.anIntArray512[local23], super.anIntArray494[local13], super.anIntArray494[local18], super.anIntArray494[local23], super.anIntArray479[local13], super.anIntArray479[local18], super.anIntArray479[local23], Static488.anIntArray759[super.anIntArray504[arg0] & 0xFFFF]);
		} else {
			this.aClass77_2.method1805(super.anIntArray512[local13], super.anIntArray512[local18], super.anIntArray512[local23], super.anIntArray494[local13], super.anIntArray494[local18], super.anIntArray494[local23], super.anIntArray479[local13], super.anIntArray479[local18], super.anIntArray479[local23], super.anIntArray504[arg0] & 0xFFFF, super.anIntArray484[arg0] & 0xFFFF, super.anIntArray485[arg0] & 0xFFFF);
		}
	}

	@OriginalMember(owner = "client!iu", name = "r", descriptor = "()V")
	@Override
	protected void method4285() {
		super.aClass16_6.anInt8745 = this.aClass77_2.anInt2144;
		super.aClass16_6.anInt8747 = this.aClass77_2.anInt2139;
		super.aClass16_6.anInt8746 = this.aClass77_2.anInt2143;
	}
}
