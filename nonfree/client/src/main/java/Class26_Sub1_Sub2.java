import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gaa")
public final class Class26_Sub1_Sub2 extends Class26_Sub1 {

	@OriginalMember(owner = "client!gaa", name = "pc", descriptor = "Lclient!vba;")
	private Class300 aClass300_1;

	@OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(Lclient!et;[Lclient!gaa;)V")
	public Class26_Sub1_Sub2(@OriginalArg(0) Class42_Sub2 arg0, @OriginalArg(1) Class26_Sub1_Sub2[] arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(Lclient!et;)V")
	public Class26_Sub1_Sub2(@OriginalArg(0) Class42_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(Lclient!et;Lclient!ln;IIII)V")
	public Class26_Sub1_Sub2(@OriginalArg(0) Class42_Sub2 arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!gaa", name = "j", descriptor = "()V")
	@Override
	protected void method2975() {
		this.aClass300_1 = null;
	}

	@OriginalMember(owner = "client!gaa", name = "e", descriptor = "(I)V")
	@Override
	protected void method2992(@OriginalArg(0) int arg0) {
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
		if (!super.aClass42_Sub2_7.aBoolean413) {
			local8 = super.aShortArray45[arg0];
			local13 = super.aShortArray51[arg0];
			local18 = super.aShortArray48[arg0];
			local27 = super.anIntArray261[local8] - super.aClass42_Sub2_7.anInt5349;
			if (local27 > 255) {
				local27 = 255;
			} else if (local27 < 0) {
				local27 = 0;
			}
			local46 = super.anIntArray261[local13] - super.aClass42_Sub2_7.anInt5349;
			if (local46 > 255) {
				local46 = 255;
			} else if (local46 < 0) {
				local46 = 0;
			}
			local65 = super.anIntArray261[local18] - super.aClass42_Sub2_7.anInt5349;
			if (local65 > 255) {
				local65 = 255;
			} else if (local65 < 0) {
				local65 = 0;
			}
			local81 = local27 + local46 + local65;
			if (local81 != 765) {
				if (local81 == 0) {
					this.method2987(arg0);
				} else {
					if (super.aByteArray31 == null) {
						this.aClass300_1.anInt9116 = 0;
					} else {
						this.aClass300_1.anInt9116 = super.aByteArray31[arg0] & 0xFF;
					}
					this.aClass300_1.aBoolean648 = super.aBooleanArray28[arg0];
					if (super.aShortArray50 != null && super.aShortArray50[arg0] != -1) {
						if (super.aByteArray34 == null || super.aByteArray34[arg0] == -1) {
							local309 = local8;
							local314 = local13;
							local319 = local18;
						} else {
							@Pc(304) int local304 = super.aByteArray34[arg0] & 0xFF;
							local309 = super.anIntArray246[local304];
							local314 = super.anIntArray255[local304];
							local319 = super.anIntArray264[local304];
						}
						if (super.anIntArray275[arg0] == -1) {
							this.aClass300_1.method7516(super.anIntArray248[local8], super.anIntArray248[local13], super.anIntArray248[local18], super.anIntArray263[local8], super.anIntArray263[local13], super.anIntArray263[local18], super.aClass42_Sub2_7.anInt5358, local27, local46, local65, super.anIntArray253[arg0], super.anIntArray253[arg0], super.anIntArray253[arg0], super.anIntArray250[local309], super.anIntArray250[local314], super.anIntArray250[local319], super.anIntArray273[local309], super.anIntArray273[local314], super.anIntArray273[local319], super.anIntArray247[local309], super.anIntArray247[local314], super.anIntArray247[local319], super.aShortArray50[arg0]);
						} else {
							this.aClass300_1.method7516(super.anIntArray248[local8], super.anIntArray248[local13], super.anIntArray248[local18], super.anIntArray263[local8], super.anIntArray263[local13], super.anIntArray263[local18], super.aClass42_Sub2_7.anInt5358, local27, local46, local65, super.anIntArray253[arg0], super.anIntArray267[arg0], super.anIntArray275[arg0], super.anIntArray250[local309], super.anIntArray250[local314], super.anIntArray250[local319], super.anIntArray273[local309], super.anIntArray273[local314], super.anIntArray273[local319], super.anIntArray247[local309], super.anIntArray247[local314], super.anIntArray247[local319], super.aShortArray50[arg0]);
						}
					} else if (super.anIntArray275[arg0] == -1) {
						this.aClass300_1.method7511(super.anIntArray248[local8], super.anIntArray248[local13], super.anIntArray248[local18], super.anIntArray263[local8], super.anIntArray263[local13], super.anIntArray263[local18], Static456.method6870(local27 << 24 | super.aClass42_Sub2_7.anInt5358, Static69.anIntArray673[super.anIntArray253[arg0] & 0xFFFF]), Static456.method6870(local46 << 24 | super.aClass42_Sub2_7.anInt5358, Static69.anIntArray673[super.anIntArray253[arg0] & 0xFFFF]), Static456.method6870(local65 << 24 | super.aClass42_Sub2_7.anInt5358, Static69.anIntArray673[super.anIntArray253[arg0] & 0xFFFF]));
					} else {
						this.aClass300_1.method7511(super.anIntArray248[local8], super.anIntArray248[local13], super.anIntArray248[local18], super.anIntArray263[local8], super.anIntArray263[local13], super.anIntArray263[local18], Static456.method6870(local27 << 24 | super.aClass42_Sub2_7.anInt5358, Static69.anIntArray673[super.anIntArray253[arg0] & 0xFFFF]), Static456.method6870(local46 << 24 | super.aClass42_Sub2_7.anInt5358, Static69.anIntArray673[super.anIntArray267[arg0] & 0xFFFF]), Static456.method6870(local65 << 24 | super.aClass42_Sub2_7.anInt5358, Static69.anIntArray673[super.anIntArray275[arg0] & 0xFFFF]));
					}
				}
			}
		} else if (!super.aBooleanArray27[arg0]) {
			local8 = super.aShortArray45[arg0];
			local13 = super.aShortArray51[arg0];
			local18 = super.aShortArray48[arg0];
			local27 = 0;
			local46 = 0;
			local65 = 0;
			if (super.anIntArray276[local8] > super.aClass42_Sub2_7.anInt5355) {
				local27 = 255;
			} else if (super.anIntArray276[local8] > super.aClass42_Sub2_7.anInt5364) {
				local27 = (super.aClass42_Sub2_7.anInt5364 - super.anIntArray276[local8]) * 255 / (super.aClass42_Sub2_7.anInt5364 - super.aClass42_Sub2_7.anInt5355);
			}
			if (super.anIntArray276[local13] > super.aClass42_Sub2_7.anInt5355) {
				local46 = 255;
			} else if (super.anIntArray276[local13] > super.aClass42_Sub2_7.anInt5364) {
				local46 = (super.aClass42_Sub2_7.anInt5364 - super.anIntArray276[local13]) * 255 / (super.aClass42_Sub2_7.anInt5364 - super.aClass42_Sub2_7.anInt5355);
			}
			if (super.anIntArray276[local18] > super.aClass42_Sub2_7.anInt5355) {
				local65 = 255;
			} else if (super.anIntArray276[local18] > super.aClass42_Sub2_7.anInt5364) {
				local65 = (super.aClass42_Sub2_7.anInt5364 - super.anIntArray276[local18]) * 255 / (super.aClass42_Sub2_7.anInt5364 - super.aClass42_Sub2_7.anInt5355);
			}
			if (super.aByteArray31 == null) {
				this.aClass300_1.anInt9116 = 0;
			} else {
				this.aClass300_1.anInt9116 = super.aByteArray31[arg0] & 0xFF;
			}
			this.aClass300_1.aBoolean648 = super.aBooleanArray28[arg0];
			if (super.aShortArray50 != null && super.aShortArray50[arg0] != -1) {
				if (super.aByteArray34 == null || super.aByteArray34[arg0] == -1) {
					local81 = local8;
					local309 = local13;
					local314 = local18;
				} else {
					local319 = super.aByteArray34[arg0] & 0xFF;
					local81 = super.anIntArray246[local319];
					local309 = super.anIntArray255[local319];
					local314 = super.anIntArray264[local319];
				}
				if (super.anIntArray275[arg0] == -1) {
					this.aClass300_1.method7516(super.anIntArray248[local8], super.anIntArray248[local13], super.anIntArray248[local18], super.anIntArray263[local8], super.anIntArray263[local13], super.anIntArray263[local18], super.aClass42_Sub2_7.anInt5358, local27, local46, local65, super.anIntArray253[arg0], super.anIntArray253[arg0], super.anIntArray253[arg0], super.anIntArray250[local81], super.anIntArray250[local309], super.anIntArray250[local314], super.anIntArray273[local81], super.anIntArray273[local309], super.anIntArray273[local314], super.anIntArray247[local81], super.anIntArray247[local309], super.anIntArray247[local314], super.aShortArray50[arg0]);
				} else {
					this.aClass300_1.method7516(super.anIntArray248[local8], super.anIntArray248[local13], super.anIntArray248[local18], super.anIntArray263[local8], super.anIntArray263[local13], super.anIntArray263[local18], super.aClass42_Sub2_7.anInt5358, local27, local46, local65, super.anIntArray253[arg0], super.anIntArray267[arg0], super.anIntArray275[arg0], super.anIntArray250[local81], super.anIntArray250[local309], super.anIntArray250[local314], super.anIntArray273[local81], super.anIntArray273[local309], super.anIntArray273[local314], super.anIntArray247[local81], super.anIntArray247[local309], super.anIntArray247[local314], super.aShortArray50[arg0]);
				}
			} else if (super.anIntArray275[arg0] == -1) {
				this.aClass300_1.method7511(super.anIntArray248[local8], super.anIntArray248[local13], super.anIntArray248[local18], super.anIntArray263[local8], super.anIntArray263[local13], super.anIntArray263[local18], Static456.method6870(local27 << 24 | super.aClass42_Sub2_7.anInt5358, Static69.anIntArray673[super.anIntArray253[arg0] & 0xFFFF]), Static456.method6870(local46 << 24 | super.aClass42_Sub2_7.anInt5358, Static69.anIntArray673[super.anIntArray253[arg0] & 0xFFFF]), Static456.method6870(local65 << 24 | super.aClass42_Sub2_7.anInt5358, Static69.anIntArray673[super.anIntArray253[arg0] & 0xFFFF]));
			} else {
				this.aClass300_1.method7511(super.anIntArray248[local8], super.anIntArray248[local13], super.anIntArray248[local18], super.anIntArray263[local8], super.anIntArray263[local13], super.anIntArray263[local18], Static456.method6870(local27 << 24 | super.aClass42_Sub2_7.anInt5358, Static69.anIntArray673[super.anIntArray253[arg0] & 0xFFFF]), Static456.method6870(local46 << 24 | super.aClass42_Sub2_7.anInt5358, Static69.anIntArray673[super.anIntArray267[arg0] & 0xFFFF]), Static456.method6870(local65 << 24 | super.aClass42_Sub2_7.anInt5358, Static69.anIntArray673[super.anIntArray275[arg0] & 0xFFFF]));
			}
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BIZ)Lclient!r;")
	@Override
	public Class26 method7992(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.method2969(Thread.currentThread());
		@Pc(11) Class26_Sub1 local11;
		@Pc(8) Class26_Sub1 local8;
		if (arg0 == 1) {
			local8 = super.aClass26_Sub1_31;
			local11 = super.aClass26_Sub1_32;
		} else if (arg0 == 2) {
			local8 = super.aClass26_Sub1_33;
			local11 = super.aClass26_Sub1_34;
		} else if (arg0 == 3) {
			local8 = super.aClass26_Sub1_36;
			local11 = super.aClass26_Sub1_39;
		} else if (arg0 == 4) {
			local8 = super.aClass26_Sub1_38;
			local11 = super.aClass26_Sub1_35;
		} else if (arg0 == 5) {
			local8 = super.aClass26_Sub1_40;
			local11 = super.aClass26_Sub1_37;
		} else {
			local11 = local8 = new Class26_Sub1_Sub2(super.aClass42_Sub2_7);
		}
		return this.method2988(local11, local8, arg1, arg0 != 0, arg2);
	}

	@OriginalMember(owner = "client!gaa", name = "d", descriptor = "(I)V")
	@Override
	protected void method2987(@OriginalArg(0) int arg0) {
		if (super.aBooleanArray27[arg0]) {
			this.method2995(arg0);
			return;
		}
		@Pc(13) short local13 = super.aShortArray45[arg0];
		@Pc(18) short local18 = super.aShortArray51[arg0];
		@Pc(23) short local23 = super.aShortArray48[arg0];
		this.aClass300_1.aBoolean648 = super.aBooleanArray28[arg0];
		if (super.aByteArray31 == null) {
			this.aClass300_1.anInt9116 = 0;
		} else {
			this.aClass300_1.anInt9116 = super.aByteArray31[arg0] & 0xFF;
		}
		if (super.aShortArray50 != null && super.aShortArray50[arg0] != -1) {
			@Pc(165) int local165;
			@Pc(170) int local170;
			@Pc(175) int local175;
			if (super.aByteArray34 == null || super.aByteArray34[arg0] == -1) {
				local165 = local13;
				local170 = local18;
				local175 = local23;
			} else {
				@Pc(160) int local160 = super.aByteArray34[arg0] & 0xFF;
				local165 = super.anIntArray246[local160];
				local170 = super.anIntArray255[local160];
				local175 = super.anIntArray264[local160];
			}
			if (super.anIntArray275[arg0] == -1) {
				this.aClass300_1.method7520(super.anIntArray248[local13], super.anIntArray248[local18], super.anIntArray248[local23], super.anIntArray263[local13], super.anIntArray263[local18], super.anIntArray263[local23], super.anIntArray253[arg0], super.anIntArray253[arg0], super.anIntArray253[arg0], super.anIntArray250[local165], super.anIntArray250[local170], super.anIntArray250[local175], super.anIntArray273[local165], super.anIntArray273[local170], super.anIntArray273[local175], super.anIntArray247[local165], super.anIntArray247[local170], super.anIntArray247[local175], super.aShortArray50[arg0]);
			} else {
				this.aClass300_1.method7520(super.anIntArray248[local13], super.anIntArray248[local18], super.anIntArray248[local23], super.anIntArray263[local13], super.anIntArray263[local18], super.anIntArray263[local23], super.anIntArray253[arg0], super.anIntArray267[arg0], super.anIntArray275[arg0], super.anIntArray250[local165], super.anIntArray250[local170], super.anIntArray250[local175], super.anIntArray273[local165], super.anIntArray273[local170], super.anIntArray273[local175], super.anIntArray247[local165], super.anIntArray247[local170], super.anIntArray247[local175], super.aShortArray50[arg0]);
			}
		} else if (super.anIntArray275[arg0] == -1) {
			this.aClass300_1.method7512(super.anIntArray248[local13], super.anIntArray248[local18], super.anIntArray248[local23], super.anIntArray263[local13], super.anIntArray263[local18], super.anIntArray263[local23], Static69.anIntArray673[super.anIntArray253[arg0] & 0xFFFF]);
		} else {
			this.aClass300_1.method7523(super.anIntArray248[local13], super.anIntArray248[local18], super.anIntArray248[local23], super.anIntArray263[local13], super.anIntArray263[local18], super.anIntArray263[local23], super.anIntArray253[arg0] & 0xFFFF, super.anIntArray267[arg0] & 0xFFFF, super.anIntArray275[arg0] & 0xFFFF);
		}
	}

	@OriginalMember(owner = "client!gaa", name = "f", descriptor = "(I)V")
	private void method2995(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = super.aClass42_Sub2_7.anInt5338;
		@Pc(10) short local10 = super.aShortArray45[arg0];
		@Pc(15) short local15 = super.aShortArray51[arg0];
		@Pc(20) short local20 = super.aShortArray48[arg0];
		@Pc(25) int local25 = super.anIntArray247[local10];
		@Pc(30) int local30 = super.anIntArray247[local15];
		@Pc(35) int local35 = super.anIntArray247[local20];
		if (super.aByteArray31 == null) {
			this.aClass300_1.anInt9116 = 0;
		} else {
			this.aClass300_1.anInt9116 = super.aByteArray31[arg0] & 0xFF;
		}
		@Pc(88) int local88;
		@Pc(93) int local93;
		@Pc(100) int local100;
		@Pc(113) int local113;
		if (local25 >= local5) {
			super.anIntArray268[0] = super.anIntArray263[local10];
			super.anIntArray277[0] = super.anIntArray248[local10];
			local1++;
			super.anIntArray274[0] = super.anIntArray253[arg0] & 0xFFFF;
		} else {
			local88 = super.anIntArray250[local10];
			local93 = super.anIntArray273[local10];
			local100 = super.anIntArray253[arg0] & 0xFFFF;
			if (local35 >= local5) {
				local113 = (local5 - local25) * Class26_Sub1.anIntArray281[local35 - local25];
				super.anIntArray268[0] = super.aClass54_6.anInt7880 + (local88 + ((super.anIntArray250[local20] - local88) * local113 >> 16)) * super.aClass42_Sub2_7.anInt5356 / local5;
				super.anIntArray277[0] = super.aClass54_6.anInt7882 + (local93 + ((super.anIntArray273[local20] - local93) * local113 >> 16)) * super.aClass42_Sub2_7.anInt5350 / local5;
				local1++;
				super.anIntArray274[0] = local100 + (((super.anIntArray275[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
			if (local30 >= local5) {
				local113 = (local5 - local25) * Class26_Sub1.anIntArray281[local30 - local25];
				super.anIntArray268[local1] = super.aClass54_6.anInt7880 + (local88 + ((super.anIntArray250[local15] - local88) * local113 >> 16)) * super.aClass42_Sub2_7.anInt5356 / local5;
				super.anIntArray277[local1] = super.aClass54_6.anInt7882 + (local93 + ((super.anIntArray273[local15] - local93) * local113 >> 16)) * super.aClass42_Sub2_7.anInt5350 / local5;
				super.anIntArray274[local1++] = local100 + (((super.anIntArray267[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
		}
		if (local30 >= local5) {
			super.anIntArray268[local1] = super.anIntArray263[local15];
			super.anIntArray277[local1] = super.anIntArray248[local15];
			super.anIntArray274[local1++] = super.anIntArray267[arg0] & 0xFFFF;
		} else {
			local88 = super.anIntArray250[local15];
			local93 = super.anIntArray273[local15];
			local100 = super.anIntArray267[arg0] & 0xFFFF;
			if (local25 >= local5) {
				local113 = (local5 - local30) * Class26_Sub1.anIntArray281[local25 - local30];
				super.anIntArray268[local1] = super.aClass54_6.anInt7880 + (local88 + ((super.anIntArray250[local10] - local88) * local113 >> 16)) * super.aClass42_Sub2_7.anInt5356 / local5;
				super.anIntArray277[local1] = super.aClass54_6.anInt7882 + (local93 + ((super.anIntArray273[local10] - local93) * local113 >> 16)) * super.aClass42_Sub2_7.anInt5350 / local5;
				super.anIntArray274[local1++] = local100 + (((super.anIntArray253[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
			if (local35 >= local5) {
				local113 = (local5 - local30) * Class26_Sub1.anIntArray281[local35 - local30];
				super.anIntArray268[local1] = super.aClass54_6.anInt7880 + (local88 + ((super.anIntArray250[local20] - local88) * local113 >> 16)) * super.aClass42_Sub2_7.anInt5356 / local5;
				super.anIntArray277[local1] = super.aClass54_6.anInt7882 + (local93 + ((super.anIntArray273[local20] - local93) * local113 >> 16)) * super.aClass42_Sub2_7.anInt5350 / local5;
				super.anIntArray274[local1++] = local100 + (((super.anIntArray275[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
		}
		if (local35 >= local5) {
			super.anIntArray268[local1] = super.anIntArray263[local20];
			super.anIntArray277[local1] = super.anIntArray248[local20];
			super.anIntArray274[local1++] = super.anIntArray275[arg0] & 0xFFFF;
		} else {
			local88 = super.anIntArray250[local20];
			local93 = super.anIntArray273[local20];
			local100 = super.anIntArray275[arg0] & 0xFFFF;
			if (local30 >= local5) {
				local113 = (local5 - local35) * Class26_Sub1.anIntArray281[local30 - local35];
				super.anIntArray268[local1] = super.aClass54_6.anInt7880 + (local88 + ((super.anIntArray250[local15] - local88) * local113 >> 16)) * super.aClass42_Sub2_7.anInt5356 / local5;
				super.anIntArray277[local1] = super.aClass54_6.anInt7882 + (local93 + ((super.anIntArray273[local15] - local93) * local113 >> 16)) * super.aClass42_Sub2_7.anInt5350 / local5;
				super.anIntArray274[local1++] = local100 + (((super.anIntArray267[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
			if (local25 >= local5) {
				local113 = (local5 - local35) * Class26_Sub1.anIntArray281[local25 - local35];
				super.anIntArray268[local1] = super.aClass54_6.anInt7880 + (local88 + ((super.anIntArray250[local10] - local88) * local113 >> 16)) * super.aClass42_Sub2_7.anInt5356 / local5;
				super.anIntArray277[local1] = super.aClass54_6.anInt7882 + (local93 + ((super.anIntArray273[local10] - local93) * local113 >> 16)) * super.aClass42_Sub2_7.anInt5350 / local5;
				super.anIntArray274[local1++] = local100 + (((super.anIntArray253[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
		}
		local88 = super.anIntArray268[0];
		local93 = super.anIntArray268[1];
		local100 = super.anIntArray268[2];
		local113 = super.anIntArray277[0];
		@Pc(725) int local725 = super.anIntArray277[1];
		@Pc(730) int local730 = super.anIntArray277[2];
		this.aClass300_1.aBoolean648 = false;
		@Pc(838) int local838;
		@Pc(843) int local843;
		@Pc(848) int local848;
		@Pc(833) int local833;
		if (local1 == 3) {
			if (local88 < 0 || local93 < 0 || local100 < 0 || local88 > super.aClass54_6.anInt7881 || local93 > super.aClass54_6.anInt7881 || local100 > super.aClass54_6.anInt7881) {
				this.aClass300_1.aBoolean648 = true;
			}
			if (super.aShortArray50 != null && super.aShortArray50[arg0] != -1) {
				if (super.aByteArray34 == null || super.aByteArray34[arg0] == -1) {
					local838 = local10;
					local843 = local15;
					local848 = local20;
				} else {
					local833 = super.aByteArray34[arg0] & 0xFF;
					local838 = super.anIntArray246[local833];
					local843 = super.anIntArray255[local833];
					local848 = super.anIntArray264[local833];
				}
				if (super.anIntArray275[arg0] == -1) {
					this.aClass300_1.method7520(local113, local725, local730, local88, local93, local100, super.anIntArray253[arg0], super.anIntArray253[arg0], super.anIntArray253[arg0], super.anIntArray250[local838], super.anIntArray250[local843], super.anIntArray250[local848], super.anIntArray273[local838], super.anIntArray273[local843], super.anIntArray273[local848], super.anIntArray247[local838], super.anIntArray247[local843], super.anIntArray247[local848], super.aShortArray50[arg0]);
				} else {
					this.aClass300_1.method7520(local113, local725, local730, local88, local93, local100, super.anIntArray274[0], super.anIntArray274[1], super.anIntArray274[2], super.anIntArray250[local838], super.anIntArray250[local843], super.anIntArray250[local848], super.anIntArray273[local838], super.anIntArray273[local843], super.anIntArray273[local848], super.anIntArray247[local838], super.anIntArray247[local843], super.anIntArray247[local848], super.aShortArray50[arg0]);
				}
			} else if (super.anIntArray275[arg0] == -1) {
				this.aClass300_1.method7512(local113, local725, local730, local88, local93, local100, Static69.anIntArray673[super.anIntArray253[arg0] & 0xFFFF]);
			} else {
				this.aClass300_1.method7523(local113, local725, local730, local88, local93, local100, super.anIntArray274[0], super.anIntArray274[1], super.anIntArray274[2]);
			}
		}
		if (local1 != 4) {
			return;
		}
		if (local88 < 0 || local93 < 0 || local100 < 0 || local88 > super.aClass54_6.anInt7881 || local93 > super.aClass54_6.anInt7881 || local100 > super.aClass54_6.anInt7881 || super.anIntArray268[3] < 0 || super.anIntArray268[3] > super.aClass54_6.anInt7881) {
			this.aClass300_1.aBoolean648 = true;
		}
		if (super.aShortArray50 == null || super.aShortArray50[arg0] == -1) {
			if (super.anIntArray275[arg0] == -1) {
				local838 = Static69.anIntArray673[super.anIntArray253[arg0] & 0xFFFF];
				this.aClass300_1.method7512(local113, local725, local730, local88, local93, local100, local838);
				this.aClass300_1.method7512(local113, local730, super.anIntArray277[3], local88, local100, super.anIntArray268[3], local838);
				return;
			}
			this.aClass300_1.method7523(local113, local725, local730, local88, local93, local100, super.anIntArray274[0], super.anIntArray274[1], super.anIntArray274[2]);
			this.aClass300_1.method7523(local113, local730, super.anIntArray277[3], local88, local100, super.anIntArray268[3], super.anIntArray274[0], super.anIntArray274[2], super.anIntArray274[3]);
			return;
		}
		if (super.aByteArray34 == null || super.aByteArray34[arg0] == -1) {
			local838 = local10;
			local843 = local15;
			local848 = local20;
		} else {
			local833 = super.aByteArray34[arg0] & 0xFF;
			local838 = super.anIntArray246[local833];
			local843 = super.anIntArray255[local833];
			local848 = super.anIntArray264[local833];
		}
		@Pc(1168) short local1168 = super.aShortArray50[arg0];
		if (super.anIntArray275[arg0] == -1) {
			this.aClass300_1.method7520(local113, local725, local730, local88, local93, local100, super.anIntArray253[arg0], super.anIntArray253[arg0], super.anIntArray253[arg0], super.anIntArray250[local838], super.anIntArray250[local843], super.anIntArray250[local848], super.anIntArray273[local838], super.anIntArray273[local843], super.anIntArray273[local848], super.anIntArray247[local838], super.anIntArray247[local843], super.anIntArray247[local848], local1168);
			this.aClass300_1.method7520(local113, local730, super.anIntArray277[3], local88, local100, super.anIntArray268[3], super.anIntArray253[arg0], super.anIntArray253[arg0], super.anIntArray253[arg0], super.anIntArray250[local838], super.anIntArray250[local843], super.anIntArray250[local848], super.anIntArray273[local838], super.anIntArray273[local843], super.anIntArray273[local848], super.anIntArray247[local838], super.anIntArray247[local843], super.anIntArray247[local848], local1168);
			return;
		}
		this.aClass300_1.method7520(local113, local725, local730, local88, local93, local100, super.anIntArray274[0], super.anIntArray274[1], super.anIntArray274[2], super.anIntArray250[local838], super.anIntArray250[local843], super.anIntArray250[local848], super.anIntArray273[local838], super.anIntArray273[local843], super.anIntArray273[local848], super.anIntArray247[local838], super.anIntArray247[local843], super.anIntArray247[local848], local1168);
		this.aClass300_1.method7520(local113, local730, super.anIntArray277[3], local88, local100, super.anIntArray268[3], super.anIntArray274[0], super.anIntArray274[2], super.anIntArray274[3], super.anIntArray250[local838], super.anIntArray250[local843], super.anIntArray250[local848], super.anIntArray273[local838], super.anIntArray273[local843], super.anIntArray273[local848], super.anIntArray247[local838], super.anIntArray247[local843], super.anIntArray247[local848], local1168);
	}

	@OriginalMember(owner = "client!gaa", name = "b", descriptor = "(Ljava/lang/Thread;)V")
	@Override
	protected void method2986(@OriginalArg(0) Thread arg0) {
		super.method2986(arg0);
		@Pc(8) Class54_Sub1 local8 = (Class54_Sub1) super.aClass42_Sub2_7.method4545(arg0);
		this.aClass300_1 = local8.aClass300_2;
	}

	@OriginalMember(owner = "client!gaa", name = "c", descriptor = "(I)V")
	@Override
	protected void method2977(@OriginalArg(0) int arg0) {
		this.aClass300_1.aBoolean650 = (arg0 & 0x1) == 0;
		this.aClass300_1.aBoolean646 = false;
	}

	@OriginalMember(owner = "client!gaa", name = "l", descriptor = "()V")
	@Override
	protected void method2978() {
		super.aClass54_6.anInt7881 = this.aClass300_1.anInt9119;
		super.aClass54_6.anInt7880 = this.aClass300_1.anInt9120;
		super.aClass54_6.anInt7882 = this.aClass300_1.anInt9117;
	}
}
