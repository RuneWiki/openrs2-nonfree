import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class22_Sub1_Sub1 extends Class22_Sub1 {

	@OriginalMember(owner = "client!dc", name = "M", descriptor = "Lclient!gd;")
	private Class116 aClass116_1;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lclient!kb;)V")
	public Class22_Sub1_Sub1(@OriginalArg(0) Class121_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lclient!kb;Lclient!rf;IIII)V")
	public Class22_Sub1_Sub1(@OriginalArg(0) Class121_Sub1 arg0, @OriginalArg(1) Class274 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZZ)V")
	private void method1286(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (super.anIntArray498[arg0] == -2) {
			return;
		}
		@Pc(11) short local11 = super.aShortArray84[arg0];
		@Pc(16) short local16 = super.aShortArray86[arg0];
		@Pc(21) short local21 = super.aShortArray88[arg0];
		@Pc(26) int local26 = super.anIntArray495[local11];
		@Pc(31) int local31 = super.anIntArray495[local16];
		@Pc(36) int local36 = super.anIntArray495[local21];
		@Pc(52) int local52;
		if (arg1 && (local26 == -5000 || local31 == -5000 || local36 == -5000)) {
			local52 = super.anIntArray483[local11];
			@Pc(57) int local57 = super.anIntArray483[local16];
			@Pc(62) int local62 = super.anIntArray483[local21];
			@Pc(67) int local67 = super.anIntArray488[local11];
			@Pc(72) int local72 = super.anIntArray488[local16];
			@Pc(77) int local77 = super.anIntArray488[local21];
			@Pc(82) int local82 = super.anIntArray497[local11];
			@Pc(87) int local87 = super.anIntArray497[local16];
			@Pc(92) int local92 = super.anIntArray497[local21];
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
				this.method1289(arg0);
				return;
			}
		} else if (super.anIntArray492[arg0] != -1 || (local26 - local31) * (super.anIntArray507[local21] - super.anIntArray507[local16]) - (super.anIntArray507[local11] - super.anIntArray507[local16]) * (local36 - local31) > 0) {
			if (local26 >= 0 && local31 >= 0 && local36 >= 0 && local26 <= super.aClass77_6.anInt3163 && local31 <= super.aClass77_6.anInt3163 && local36 <= super.aClass77_6.anInt3163) {
				super.aBooleanArray30[arg0] = false;
			} else {
				super.aBooleanArray30[arg0] = true;
			}
			if (arg2) {
				local52 = super.anIntArray492[arg0];
				if (local52 == -1 || !super.aClass28Array3[local52].aBoolean20) {
					this.method1287(arg0);
				}
				return;
			}
			local52 = super.anIntArray492[arg0];
			if (local52 != -1) {
				@Pc(255) Class28 local255 = super.aClass28Array3[local52];
				@Pc(260) Class273 local260 = super.aClass273Array3[local52];
				if (!local255.aBoolean20) {
					this.method1288(arg0);
				}
				super.aClass121_Sub1_14.method3925(local260.anInt7643, local260.anInt7641, local260.anInt7640, local260.anInt7648, local260.anInt7638, local260.anInt7649, local255.aShort6 & 0xFFFF, local260.anInt7646, local255.aByte10, local255.aByte11);
				return;
			}
			this.method1288(arg0);
		}
	}

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "()V")
	@Override
	protected void method4715() {
		this.aClass116_1 = null;
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)V")
	private void method1287(@OriginalArg(0) int arg0) {
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
		if (!super.aClass121_Sub1_14.aBoolean279) {
			local8 = super.aShortArray84[arg0];
			local13 = super.aShortArray86[arg0];
			local18 = super.aShortArray88[arg0];
			local27 = super.anIntArray486[local8] - super.aClass121_Sub1_14.anInt4527;
			if (local27 > 255) {
				local27 = 255;
			} else if (local27 < 0) {
				local27 = 0;
			}
			local46 = super.anIntArray486[local13] - super.aClass121_Sub1_14.anInt4527;
			if (local46 > 255) {
				local46 = 255;
			} else if (local46 < 0) {
				local46 = 0;
			}
			local65 = super.anIntArray486[local18] - super.aClass121_Sub1_14.anInt4527;
			if (local65 > 255) {
				local65 = 255;
			} else if (local65 < 0) {
				local65 = 0;
			}
			local81 = local27 + local46 + local65;
			if (local81 != 765) {
				if (local81 == 0) {
					this.method1288(arg0);
				} else {
					if (super.aByteArray63 == null) {
						this.aClass116_1.anInt2773 = 0;
					} else {
						this.aClass116_1.anInt2773 = super.aByteArray63[arg0] & 0xFF;
					}
					this.aClass116_1.aBoolean186 = super.aBooleanArray30[arg0];
					if (super.aShortArray85 != null && super.aShortArray85[arg0] != -1) {
						if (super.aByteArray64 == null || super.aByteArray64[arg0] == -1) {
							local333 = local8;
							local338 = local13;
							local343 = local18;
						} else {
							@Pc(328) int local328 = super.aByteArray64[arg0] & 0xFF;
							local333 = super.anIntArray481[local328];
							local338 = super.anIntArray490[local328];
							local343 = super.anIntArray478[local328];
						}
						if (super.anIntArray498[arg0] == -1) {
							this.aClass116_1.method2302(super.anIntArray507[local8], super.anIntArray507[local13], super.anIntArray507[local18], super.anIntArray495[local8], super.anIntArray495[local13], super.anIntArray495[local18], super.anIntArray486[local8], super.anIntArray486[local13], super.anIntArray486[local18], super.aClass121_Sub1_14.anInt4509, local27, local46, local65, super.anIntArray493[arg0], super.anIntArray493[arg0], super.anIntArray493[arg0], super.anIntArray483[local333], super.anIntArray483[local338], super.anIntArray483[local343], super.anIntArray488[local333], super.anIntArray488[local338], super.anIntArray488[local343], super.anIntArray497[local333], super.anIntArray497[local338], super.anIntArray497[local343], super.aShortArray85[arg0]);
						} else {
							this.aClass116_1.method2302(super.anIntArray507[local8], super.anIntArray507[local13], super.anIntArray507[local18], super.anIntArray495[local8], super.anIntArray495[local13], super.anIntArray495[local18], super.anIntArray486[local8], super.anIntArray486[local13], super.anIntArray486[local18], super.aClass121_Sub1_14.anInt4509, local27, local46, local65, super.anIntArray493[arg0], super.anIntArray501[arg0], super.anIntArray498[arg0], super.anIntArray483[local333], super.anIntArray483[local338], super.anIntArray483[local343], super.anIntArray488[local333], super.anIntArray488[local338], super.anIntArray488[local343], super.anIntArray497[local333], super.anIntArray497[local338], super.anIntArray497[local343], super.aShortArray85[arg0]);
						}
					} else if (super.anIntArray498[arg0] == -1) {
						this.aClass116_1.method2298(super.anIntArray507[local8], super.anIntArray507[local13], super.anIntArray507[local18], super.anIntArray495[local8], super.anIntArray495[local13], super.anIntArray495[local18], super.anIntArray486[local8], super.anIntArray486[local13], super.anIntArray486[local18], Static462.method6488(local27 << 24 | super.aClass121_Sub1_14.anInt4509, Static6.anIntArray272[super.anIntArray493[arg0] & 0xFFFF]), Static462.method6488(local46 << 24 | super.aClass121_Sub1_14.anInt4509, Static6.anIntArray272[super.anIntArray493[arg0] & 0xFFFF]), Static462.method6488(local65 << 24 | super.aClass121_Sub1_14.anInt4509, Static6.anIntArray272[super.anIntArray493[arg0] & 0xFFFF]));
					} else {
						this.aClass116_1.method2298(super.anIntArray507[local8], super.anIntArray507[local13], super.anIntArray507[local18], super.anIntArray495[local8], super.anIntArray495[local13], super.anIntArray495[local18], super.anIntArray486[local8], super.anIntArray486[local13], super.anIntArray486[local18], Static462.method6488(local27 << 24 | super.aClass121_Sub1_14.anInt4509, Static6.anIntArray272[super.anIntArray493[arg0] & 0xFFFF]), Static462.method6488(local46 << 24 | super.aClass121_Sub1_14.anInt4509, Static6.anIntArray272[super.anIntArray501[arg0] & 0xFFFF]), Static462.method6488(local65 << 24 | super.aClass121_Sub1_14.anInt4509, Static6.anIntArray272[super.anIntArray498[arg0] & 0xFFFF]));
					}
				}
			}
		} else if (!super.aBooleanArray29[arg0]) {
			local8 = super.aShortArray84[arg0];
			local13 = super.aShortArray86[arg0];
			local18 = super.aShortArray88[arg0];
			local27 = 0;
			local46 = 0;
			local65 = 0;
			if (super.anIntArray499[local8] > super.aClass121_Sub1_14.anInt4522) {
				local27 = 255;
			} else if (super.anIntArray499[local8] > super.aClass121_Sub1_14.anInt4524) {
				local27 = (super.aClass121_Sub1_14.anInt4524 - super.anIntArray499[local8]) * 255 / (super.aClass121_Sub1_14.anInt4524 - super.aClass121_Sub1_14.anInt4522);
			}
			if (super.anIntArray499[local13] > super.aClass121_Sub1_14.anInt4522) {
				local46 = 255;
			} else if (super.anIntArray499[local13] > super.aClass121_Sub1_14.anInt4524) {
				local46 = (super.aClass121_Sub1_14.anInt4524 - super.anIntArray499[local13]) * 255 / (super.aClass121_Sub1_14.anInt4524 - super.aClass121_Sub1_14.anInt4522);
			}
			if (super.anIntArray499[local18] > super.aClass121_Sub1_14.anInt4522) {
				local65 = 255;
			} else if (super.anIntArray499[local18] > super.aClass121_Sub1_14.anInt4524) {
				local65 = (super.aClass121_Sub1_14.anInt4524 - super.anIntArray499[local18]) * 255 / (super.aClass121_Sub1_14.anInt4524 - super.aClass121_Sub1_14.anInt4522);
			}
			if (super.aByteArray63 == null) {
				this.aClass116_1.anInt2773 = 0;
			} else {
				this.aClass116_1.anInt2773 = super.aByteArray63[arg0] & 0xFF;
			}
			this.aClass116_1.aBoolean186 = super.aBooleanArray30[arg0];
			if (super.aShortArray85 != null && super.aShortArray85[arg0] != -1) {
				if (super.aByteArray64 == null || super.aByteArray64[arg0] == -1) {
					local81 = local8;
					local333 = local13;
					local338 = local18;
				} else {
					local343 = super.aByteArray64[arg0] & 0xFF;
					local81 = super.anIntArray481[local343];
					local333 = super.anIntArray490[local343];
					local338 = super.anIntArray478[local343];
				}
				if (super.anIntArray498[arg0] == -1) {
					this.aClass116_1.method2302(super.anIntArray507[local8], super.anIntArray507[local13], super.anIntArray507[local18], super.anIntArray495[local8], super.anIntArray495[local13], super.anIntArray495[local18], super.anIntArray486[local8], super.anIntArray486[local13], super.anIntArray486[local18], super.aClass121_Sub1_14.anInt4509, local27, local46, local65, super.anIntArray493[arg0], super.anIntArray493[arg0], super.anIntArray493[arg0], super.anIntArray483[local81], super.anIntArray483[local333], super.anIntArray483[local338], super.anIntArray488[local81], super.anIntArray488[local333], super.anIntArray488[local338], super.anIntArray497[local81], super.anIntArray497[local333], super.anIntArray497[local338], super.aShortArray85[arg0]);
				} else {
					this.aClass116_1.method2302(super.anIntArray507[local8], super.anIntArray507[local13], super.anIntArray507[local18], super.anIntArray495[local8], super.anIntArray495[local13], super.anIntArray495[local18], super.anIntArray486[local8], super.anIntArray486[local13], super.anIntArray486[local18], super.aClass121_Sub1_14.anInt4509, local27, local46, local65, super.anIntArray493[arg0], super.anIntArray501[arg0], super.anIntArray498[arg0], super.anIntArray483[local81], super.anIntArray483[local333], super.anIntArray483[local338], super.anIntArray488[local81], super.anIntArray488[local333], super.anIntArray488[local338], super.anIntArray497[local81], super.anIntArray497[local333], super.anIntArray497[local338], super.aShortArray85[arg0]);
				}
			} else if (super.anIntArray498[arg0] == -1) {
				this.aClass116_1.method2298(super.anIntArray507[local8], super.anIntArray507[local13], super.anIntArray507[local18], super.anIntArray495[local8], super.anIntArray495[local13], super.anIntArray495[local18], super.anIntArray486[local8], super.anIntArray486[local13], super.anIntArray486[local18], Static462.method6488(local27 << 24 | super.aClass121_Sub1_14.anInt4509, Static6.anIntArray272[super.anIntArray493[arg0] & 0xFFFF]), Static462.method6488(local46 << 24 | super.aClass121_Sub1_14.anInt4509, Static6.anIntArray272[super.anIntArray493[arg0] & 0xFFFF]), Static462.method6488(local65 << 24 | super.aClass121_Sub1_14.anInt4509, Static6.anIntArray272[super.anIntArray493[arg0] & 0xFFFF]));
			} else {
				this.aClass116_1.method2298(super.anIntArray507[local8], super.anIntArray507[local13], super.anIntArray507[local18], super.anIntArray495[local8], super.anIntArray495[local13], super.anIntArray495[local18], super.anIntArray486[local8], super.anIntArray486[local13], super.anIntArray486[local18], Static462.method6488(local27 << 24 | super.aClass121_Sub1_14.anInt4509, Static6.anIntArray272[super.anIntArray493[arg0] & 0xFFFF]), Static462.method6488(local46 << 24 | super.aClass121_Sub1_14.anInt4509, Static6.anIntArray272[super.anIntArray501[arg0] & 0xFFFF]), Static462.method6488(local65 << 24 | super.aClass121_Sub1_14.anInt4509, Static6.anIntArray272[super.anIntArray498[arg0] & 0xFFFF]));
			}
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BIZ)Lclient!ba;")
	@Override
	public Class22 method4699(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.method4718(Thread.currentThread());
		@Pc(11) Class22_Sub1 local11;
		@Pc(8) Class22_Sub1 local8;
		if (arg0 == 1) {
			local8 = super.aClass22_Sub1_51;
			local11 = super.aClass22_Sub1_56;
		} else if (arg0 == 2) {
			local8 = super.aClass22_Sub1_52;
			local11 = super.aClass22_Sub1_54;
		} else if (arg0 == 3) {
			local8 = super.aClass22_Sub1_59;
			local11 = super.aClass22_Sub1_55;
		} else if (arg0 == 4) {
			local8 = super.aClass22_Sub1_58;
			local11 = super.aClass22_Sub1_53;
		} else if (arg0 == 5) {
			local8 = super.aClass22_Sub1_60;
			local11 = super.aClass22_Sub1_57;
		} else {
			local11 = local8 = new Class22_Sub1_Sub1(super.aClass121_Sub1_14);
		}
		return this.method4728(local11, local8, arg1, arg0 != 0, arg2);
	}

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "(I)V")
	private void method1288(@OriginalArg(0) int arg0) {
		@Pc(4) short local4 = super.aShortArray84[arg0];
		@Pc(9) short local9 = super.aShortArray86[arg0];
		@Pc(14) short local14 = super.aShortArray88[arg0];
		this.aClass116_1.aBoolean186 = super.aBooleanArray30[arg0];
		if (super.aByteArray63 == null) {
			this.aClass116_1.anInt2773 = 0;
		} else {
			this.aClass116_1.anInt2773 = super.aByteArray63[arg0] & 0xFF;
		}
		if (super.aShortArray85 != null && super.aShortArray85[arg0] != -1) {
			@Pc(180) int local180;
			@Pc(185) int local185;
			@Pc(190) int local190;
			if (super.aByteArray64 == null || super.aByteArray64[arg0] == -1) {
				local180 = local4;
				local185 = local9;
				local190 = local14;
			} else {
				@Pc(175) int local175 = super.aByteArray64[arg0] & 0xFF;
				local180 = super.anIntArray481[local175];
				local185 = super.anIntArray490[local175];
				local190 = super.anIntArray478[local175];
			}
			if (super.anIntArray498[arg0] == -1) {
				this.aClass116_1.method2304(super.anIntArray507[local4], super.anIntArray507[local9], super.anIntArray507[local14], super.anIntArray495[local4], super.anIntArray495[local9], super.anIntArray495[local14], super.anIntArray486[local4], super.anIntArray486[local9], super.anIntArray486[local14], super.anIntArray493[arg0], super.anIntArray493[arg0], super.anIntArray493[arg0], super.anIntArray483[local180], super.anIntArray483[local185], super.anIntArray483[local190], super.anIntArray488[local180], super.anIntArray488[local185], super.anIntArray488[local190], super.anIntArray497[local180], super.anIntArray497[local185], super.anIntArray497[local190], super.aShortArray85[arg0]);
			} else {
				this.aClass116_1.method2304(super.anIntArray507[local4], super.anIntArray507[local9], super.anIntArray507[local14], super.anIntArray495[local4], super.anIntArray495[local9], super.anIntArray495[local14], super.anIntArray486[local4], super.anIntArray486[local9], super.anIntArray486[local14], super.anIntArray493[arg0], super.anIntArray501[arg0], super.anIntArray498[arg0], super.anIntArray483[local180], super.anIntArray483[local185], super.anIntArray483[local190], super.anIntArray488[local180], super.anIntArray488[local185], super.anIntArray488[local190], super.anIntArray497[local180], super.anIntArray497[local185], super.anIntArray497[local190], super.aShortArray85[arg0]);
			}
		} else if (super.anIntArray498[arg0] == -1) {
			this.aClass116_1.method2312(super.anIntArray507[local4], super.anIntArray507[local9], super.anIntArray507[local14], super.anIntArray495[local4], super.anIntArray495[local9], super.anIntArray495[local14], super.anIntArray486[local4], super.anIntArray486[local9], super.anIntArray486[local14], Static6.anIntArray272[super.anIntArray493[arg0] & 0xFFFF]);
		} else {
			this.aClass116_1.method2299(super.anIntArray507[local4], super.anIntArray507[local9], super.anIntArray507[local14], super.anIntArray495[local4], super.anIntArray495[local9], super.anIntArray495[local14], super.anIntArray486[local4], super.anIntArray486[local9], super.anIntArray486[local14], super.anIntArray493[arg0] & 0xFFFF, super.anIntArray501[arg0] & 0xFFFF, super.anIntArray498[arg0] & 0xFFFF);
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
	@Override
	protected void method4720(@OriginalArg(0) int arg0) {
		this.aClass116_1.aBoolean187 = (arg0 & 0x1) == 0;
		this.aClass116_1.aBoolean184 = false;
	}

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "(I)V")
	private void method1289(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = super.aClass121_Sub1_14.anInt4511;
		@Pc(10) short local10 = super.aShortArray84[arg0];
		@Pc(15) short local15 = super.aShortArray86[arg0];
		@Pc(20) short local20 = super.aShortArray88[arg0];
		@Pc(25) int local25 = super.anIntArray497[local10];
		@Pc(30) int local30 = super.anIntArray497[local15];
		@Pc(35) int local35 = super.anIntArray497[local20];
		if (super.aByteArray63 == null) {
			this.aClass116_1.anInt2773 = 0;
		} else {
			this.aClass116_1.anInt2773 = super.aByteArray63[arg0] & 0xFF;
		}
		@Pc(96) int local96;
		@Pc(101) int local101;
		@Pc(108) int local108;
		@Pc(121) int local121;
		if (local25 >= local5) {
			super.anIntArray475[0] = super.anIntArray495[local10];
			super.anIntArray500[0] = super.anIntArray507[local10];
			super.anIntArray494[0] = super.anIntArray486[local10];
			local1++;
			super.anIntArray485[0] = super.anIntArray493[arg0] & 0xFFFF;
		} else {
			local96 = super.anIntArray483[local10];
			local101 = super.anIntArray488[local10];
			local108 = super.anIntArray493[arg0] & 0xFFFF;
			if (local35 >= local5) {
				local121 = (local5 - local25) * Class22_Sub1.anIntArray508[local35 - local25];
				super.anIntArray475[0] = super.aClass77_6.anInt3164 + (local96 + ((super.anIntArray483[local20] - local96) * local121 >> 16)) * super.aClass121_Sub1_14.anInt4513 / local5;
				super.anIntArray500[0] = super.aClass77_6.anInt3162 + (local101 + ((super.anIntArray488[local20] - local101) * local121 >> 16)) * super.aClass121_Sub1_14.anInt4526 / local5;
				super.anIntArray494[0] = local5;
				local1++;
				super.anIntArray485[0] = local108 + (((super.anIntArray498[arg0] & 0xFFFF) - local108) * local121 >> 16);
			}
			if (local30 >= local5) {
				local121 = (local5 - local25) * Class22_Sub1.anIntArray508[local30 - local25];
				super.anIntArray475[local1] = super.aClass77_6.anInt3164 + (local96 + ((super.anIntArray483[local15] - local96) * local121 >> 16)) * super.aClass121_Sub1_14.anInt4513 / local5;
				super.anIntArray500[local1] = super.aClass77_6.anInt3162 + (local101 + ((super.anIntArray488[local15] - local101) * local121 >> 16)) * super.aClass121_Sub1_14.anInt4526 / local5;
				super.anIntArray494[local1] = local5;
				super.anIntArray485[local1++] = local108 + (((super.anIntArray501[arg0] & 0xFFFF) - local108) * local121 >> 16);
			}
		}
		if (local30 >= local5) {
			super.anIntArray475[local1] = super.anIntArray495[local15];
			super.anIntArray500[local1] = super.anIntArray507[local15];
			super.anIntArray494[local1] = super.anIntArray486[local15];
			super.anIntArray485[local1++] = super.anIntArray501[arg0] & 0xFFFF;
		} else {
			local96 = super.anIntArray483[local15];
			local101 = super.anIntArray488[local15];
			local108 = super.anIntArray501[arg0] & 0xFFFF;
			if (local25 >= local5) {
				local121 = (local5 - local30) * Class22_Sub1.anIntArray508[local25 - local30];
				super.anIntArray475[local1] = super.aClass77_6.anInt3164 + (local96 + ((super.anIntArray483[local10] - local96) * local121 >> 16)) * super.aClass121_Sub1_14.anInt4513 / local5;
				super.anIntArray500[local1] = super.aClass77_6.anInt3162 + (local101 + ((super.anIntArray488[local10] - local101) * local121 >> 16)) * super.aClass121_Sub1_14.anInt4526 / local5;
				super.anIntArray494[local1] = local5;
				super.anIntArray485[local1++] = local108 + (((super.anIntArray493[arg0] & 0xFFFF) - local108) * local121 >> 16);
			}
			if (local35 >= local5) {
				local121 = (local5 - local30) * Class22_Sub1.anIntArray508[local35 - local30];
				super.anIntArray475[local1] = super.aClass77_6.anInt3164 + (local96 + ((super.anIntArray483[local20] - local96) * local121 >> 16)) * super.aClass121_Sub1_14.anInt4513 / local5;
				super.anIntArray500[local1] = super.aClass77_6.anInt3162 + (local101 + ((super.anIntArray488[local20] - local101) * local121 >> 16)) * super.aClass121_Sub1_14.anInt4526 / local5;
				super.anIntArray494[local1] = local5;
				super.anIntArray485[local1++] = local108 + (((super.anIntArray498[arg0] & 0xFFFF) - local108) * local121 >> 16);
			}
		}
		if (local35 >= local5) {
			super.anIntArray475[local1] = super.anIntArray495[local20];
			super.anIntArray500[local1] = super.anIntArray507[local20];
			super.anIntArray494[local1] = super.anIntArray486[local20];
			super.anIntArray485[local1++] = super.anIntArray498[arg0] & 0xFFFF;
		} else {
			local96 = super.anIntArray483[local20];
			local101 = super.anIntArray488[local20];
			local108 = super.anIntArray498[arg0] & 0xFFFF;
			if (local30 >= local5) {
				local121 = (local5 - local35) * Class22_Sub1.anIntArray508[local30 - local35];
				super.anIntArray475[local1] = super.aClass77_6.anInt3164 + (local96 + ((super.anIntArray483[local15] - local96) * local121 >> 16)) * super.aClass121_Sub1_14.anInt4513 / local5;
				super.anIntArray500[local1] = super.aClass77_6.anInt3162 + (local101 + ((super.anIntArray488[local15] - local101) * local121 >> 16)) * super.aClass121_Sub1_14.anInt4526 / local5;
				super.anIntArray494[local1] = local5;
				super.anIntArray485[local1++] = local108 + (((super.anIntArray501[arg0] & 0xFFFF) - local108) * local121 >> 16);
			}
			if (local25 >= local5) {
				local121 = (local5 - local35) * Class22_Sub1.anIntArray508[local25 - local35];
				super.anIntArray475[local1] = super.aClass77_6.anInt3164 + (local96 + ((super.anIntArray483[local10] - local96) * local121 >> 16)) * super.aClass121_Sub1_14.anInt4513 / local5;
				super.anIntArray500[local1] = super.aClass77_6.anInt3162 + (local101 + ((super.anIntArray488[local10] - local101) * local121 >> 16)) * super.aClass121_Sub1_14.anInt4526 / local5;
				super.anIntArray494[local1] = local5;
				super.anIntArray485[local1++] = local108 + (((super.anIntArray493[arg0] & 0xFFFF) - local108) * local121 >> 16);
			}
		}
		local96 = super.anIntArray475[0];
		local101 = super.anIntArray475[1];
		local108 = super.anIntArray475[2];
		local121 = super.anIntArray500[0];
		@Pc(779) int local779 = super.anIntArray500[1];
		@Pc(784) int local784 = super.anIntArray500[2];
		local25 = super.anIntArray494[0];
		local30 = super.anIntArray494[1];
		local35 = super.anIntArray494[2];
		this.aClass116_1.aBoolean186 = false;
		@Pc(913) int local913;
		@Pc(918) int local918;
		@Pc(923) int local923;
		@Pc(908) int local908;
		if (local1 == 3) {
			if (local96 < 0 || local101 < 0 || local108 < 0 || local96 > super.aClass77_6.anInt3163 || local101 > super.aClass77_6.anInt3163 || local108 > super.aClass77_6.anInt3163) {
				this.aClass116_1.aBoolean186 = true;
			}
			if (super.aShortArray85 != null && super.aShortArray85[arg0] != -1) {
				if (super.aByteArray64 == null || super.aByteArray64[arg0] == -1) {
					local913 = local10;
					local918 = local15;
					local923 = local20;
				} else {
					local908 = super.aByteArray64[arg0] & 0xFF;
					local913 = super.anIntArray481[local908];
					local918 = super.anIntArray490[local908];
					local923 = super.anIntArray478[local908];
				}
				if (super.anIntArray498[arg0] == -1) {
					this.aClass116_1.method2304(local121, local779, local784, local96, local101, local108, local25, local30, local35, super.anIntArray493[arg0], super.anIntArray493[arg0], super.anIntArray493[arg0], super.anIntArray483[local913], super.anIntArray483[local918], super.anIntArray483[local923], super.anIntArray488[local913], super.anIntArray488[local918], super.anIntArray488[local923], super.anIntArray497[local913], super.anIntArray497[local918], super.anIntArray497[local923], super.aShortArray85[arg0]);
				} else {
					this.aClass116_1.method2304(local121, local779, local784, local96, local101, local108, local25, local30, local35, super.anIntArray485[0], super.anIntArray485[1], super.anIntArray485[2], super.anIntArray483[local913], super.anIntArray483[local918], super.anIntArray483[local923], super.anIntArray488[local913], super.anIntArray488[local918], super.anIntArray488[local923], super.anIntArray497[local913], super.anIntArray497[local918], super.anIntArray497[local923], super.aShortArray85[arg0]);
				}
			} else if (super.anIntArray498[arg0] == -1) {
				this.aClass116_1.method2312(local121, local779, local784, local96, local101, local108, local25, local30, local35, Static6.anIntArray272[super.anIntArray493[arg0] & 0xFFFF]);
			} else {
				this.aClass116_1.method2299(local121, local779, local784, local96, local101, local108, local25, local30, local35, super.anIntArray485[0], super.anIntArray485[1], super.anIntArray485[2]);
			}
		}
		if (local1 != 4) {
			return;
		}
		if (local96 < 0 || local101 < 0 || local108 < 0 || local96 > super.aClass77_6.anInt3163 || local101 > super.aClass77_6.anInt3163 || local108 > super.aClass77_6.anInt3163 || super.anIntArray475[3] < 0 || super.anIntArray475[3] > super.aClass77_6.anInt3163) {
			this.aClass116_1.aBoolean186 = true;
		}
		if (super.aShortArray85 == null || super.aShortArray85[arg0] == -1) {
			if (super.anIntArray498[arg0] == -1) {
				local913 = Static6.anIntArray272[super.anIntArray493[arg0] & 0xFFFF];
				this.aClass116_1.method2312(local121, local779, local784, local96, local101, local108, local25, local30, local35, local913);
				this.aClass116_1.method2312(local121, local784, super.anIntArray500[3], local96, local108, super.anIntArray475[3], local25, local30, super.anIntArray494[3], local913);
				return;
			}
			this.aClass116_1.method2299(local121, local779, local784, local96, local101, local108, local25, local30, local35, super.anIntArray485[0], super.anIntArray485[1], super.anIntArray485[2]);
			this.aClass116_1.method2299(local121, local784, super.anIntArray500[3], local96, local108, super.anIntArray475[3], local25, local30, super.anIntArray494[3], super.anIntArray485[0], super.anIntArray485[2], super.anIntArray485[3]);
			return;
		}
		if (super.aByteArray64 == null || super.aByteArray64[arg0] == -1) {
			local913 = local10;
			local918 = local15;
			local923 = local20;
		} else {
			local908 = super.aByteArray64[arg0] & 0xFF;
			local913 = super.anIntArray481[local908];
			local918 = super.anIntArray490[local908];
			local923 = super.anIntArray478[local908];
		}
		@Pc(1267) short local1267 = super.aShortArray85[arg0];
		if (super.anIntArray498[arg0] == -1) {
			this.aClass116_1.method2304(local121, local779, local784, local96, local101, local108, local25, local30, local35, super.anIntArray493[arg0], super.anIntArray493[arg0], super.anIntArray493[arg0], super.anIntArray483[local913], super.anIntArray483[local918], super.anIntArray483[local923], super.anIntArray488[local913], super.anIntArray488[local918], super.anIntArray488[local923], super.anIntArray497[local913], super.anIntArray497[local918], super.anIntArray497[local923], local1267);
			this.aClass116_1.method2304(local121, local784, super.anIntArray500[3], local96, local108, super.anIntArray475[3], local25, local30, super.anIntArray494[3], super.anIntArray493[arg0], super.anIntArray493[arg0], super.anIntArray493[arg0], super.anIntArray483[local913], super.anIntArray483[local918], super.anIntArray483[local923], super.anIntArray488[local913], super.anIntArray488[local918], super.anIntArray488[local923], super.anIntArray497[local913], super.anIntArray497[local918], super.anIntArray497[local923], local1267);
			return;
		}
		this.aClass116_1.method2304(local121, local779, local784, local96, local101, local108, local25, local30, local35, super.anIntArray485[0], super.anIntArray485[1], super.anIntArray485[2], super.anIntArray483[local913], super.anIntArray483[local918], super.anIntArray483[local923], super.anIntArray488[local913], super.anIntArray488[local918], super.anIntArray488[local923], super.anIntArray497[local913], super.anIntArray497[local918], super.anIntArray497[local923], local1267);
		this.aClass116_1.method2304(local121, local784, super.anIntArray500[3], local96, local108, super.anIntArray475[3], local25, local30, super.anIntArray494[3], super.anIntArray485[0], super.anIntArray485[2], super.anIntArray485[3], super.anIntArray483[local913], super.anIntArray483[local918], super.anIntArray483[local923], super.anIntArray488[local913], super.anIntArray488[local918], super.anIntArray488[local923], super.anIntArray497[local913], super.anIntArray497[local918], super.anIntArray497[local923], local1267);
	}

	@OriginalMember(owner = "client!dc", name = "n", descriptor = "()V")
	@Override
	protected void method4723() {
		super.aClass77_6.anInt3163 = this.aClass116_1.anInt2776;
		super.aClass77_6.anInt3164 = this.aClass116_1.anInt2775;
		super.aClass77_6.anInt3162 = this.aClass116_1.anInt2774;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZZIIZI)V")
	@Override
	protected void method4731(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(4) int local4;
		if (super.aClass28Array3 != null) {
			local4 = 0;
			while (local4 < super.anInt5501) {
				@Pc(10) Class28 local10 = super.aClass28Array3[local4];
				super.anIntArray492[local10.anInt563] = local4++;
			}
		}
		for (local4 = 0; local4 < super.anInt5490; local4++) {
			if (super.aByteArray63 == null || super.aByteArray63[local4] == 0) {
				this.method1286(local4, arg0, arg1);
			}
		}
		@Pc(50) int local50;
		if (super.aBoolean349) {
			if (super.aByteArray62 == null) {
				for (local50 = 0; local50 < super.anInt5490; local50++) {
					if (super.aByteArray63 == null || super.aByteArray63[local50] != 0) {
						this.method1286(local50, arg0, arg1);
					}
				}
			} else {
				for (local50 = 0; local50 < 12; local50++) {
					for (@Pc(75) int local75 = 0; local75 < super.anInt5490; local75++) {
						if ((super.aByteArray63 == null || super.aByteArray63[local75] != 0) && super.aByteArray62[local75] == local50) {
							this.method1286(local75, arg0, arg1);
						}
					}
				}
			}
		}
		if (!arg4) {
			return;
		}
		for (local50 = 0; local50 < arg5; local50++) {
			@Pc(114) Class102_Sub1_Sub1 local114 = super.lb[local50];
			@Pc(119) int local119 = super.anIntArray484[local50];
			if (local119 == 0) {
				local119 = 1;
			}
			super.aClass121_Sub1_14.method3927(local114, super.anIntArray477[local50], super.anIntArray496[local50], local119, (local114.anInt2520 * super.aClass121_Sub1_14.anInt4513 >> 12) / local119);
		}
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(Ljava/lang/Thread;)V")
	@Override
	protected void method4729(@OriginalArg(0) Thread arg0) {
		super.method4729(arg0);
		@Pc(8) Class77_Sub1 local8 = (Class77_Sub1) super.aClass121_Sub1_14.method3922(arg0);
		this.aClass116_1 = local8.aClass116_2;
	}
}
