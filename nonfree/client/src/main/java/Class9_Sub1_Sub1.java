import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afa")
public final class Class9_Sub1_Sub1 extends Class9_Sub1 {

	@OriginalMember(owner = "client!afa", name = "qc", descriptor = "Lclient!gh;")
	private Class123 aClass123_1;

	@OriginalMember(owner = "client!afa", name = "<init>", descriptor = "(Lclient!qe;Lclient!pf;IIII)V")
	public Class9_Sub1_Sub1(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) Class266 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!afa", name = "<init>", descriptor = "(Lclient!qe;)V")
	public Class9_Sub1_Sub1(@OriginalArg(0) Class66_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(ZZIIZI)V")
	@Override
	protected void method1176(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(4) int local4;
		if (super.lb != null) {
			local4 = 0;
			while (local4 < super.anInt1336) {
				@Pc(10) Class322 local10 = super.lb[local4];
				super.anIntArray174[local10.anInt8863] = local4++;
			}
		}
		for (local4 = 0; local4 < super.anInt1333; local4++) {
			if (super.aByteArray20 == null || super.aByteArray20[local4] == 0) {
				this.method239(local4, arg0, arg1);
			}
		}
		@Pc(50) int local50;
		if (super.aBoolean102) {
			if (super.aByteArray21 == null) {
				for (local50 = 0; local50 < super.anInt1333; local50++) {
					if (super.aByteArray20 == null || super.aByteArray20[local50] != 0) {
						this.method239(local50, arg0, arg1);
					}
				}
			} else {
				for (local50 = 0; local50 < 12; local50++) {
					for (@Pc(75) int local75 = 0; local75 < super.anInt1333; local75++) {
						if ((super.aByteArray20 == null || super.aByteArray20[local75] != 0) && super.aByteArray21[local75] == local50) {
							this.method239(local75, arg0, arg1);
						}
					}
				}
			}
		}
		if (!arg4) {
			return;
		}
		for (local50 = 0; local50 < arg5; local50++) {
			@Pc(114) Class26_Sub1_Sub1 local114 = super.aClass26_Sub1_Sub1Array3[local50];
			@Pc(119) int local119 = super.anIntArray160[local50];
			if (local119 == 0) {
				local119 = 1;
			}
			super.aClass66_Sub2_6.method2956(local114, super.anIntArray162[local50], super.anIntArray183[local50], local119, (local114.anInt9222 * super.aClass66_Sub2_6.anInt3232 >> 12) / local119);
		}
	}

	@OriginalMember(owner = "client!afa", name = "c", descriptor = "(I)V")
	private void method237(@OriginalArg(0) int arg0) {
		@Pc(4) short local4 = super.aShortArray25[arg0];
		@Pc(9) short local9 = super.aShortArray26[arg0];
		@Pc(14) short local14 = super.aShortArray28[arg0];
		this.aClass123_1.aBoolean289 = super.aBooleanArray9[arg0];
		if (super.aByteArray20 == null) {
			this.aClass123_1.anInt3618 = 0;
		} else {
			this.aClass123_1.anInt3618 = super.aByteArray20[arg0] & 0xFF;
		}
		if (super.aShortArray29 != null && super.aShortArray29[arg0] != -1) {
			@Pc(180) int local180;
			@Pc(185) int local185;
			@Pc(190) int local190;
			if (super.aByteArray19 == null || super.aByteArray19[arg0] == -1) {
				local180 = local4;
				local185 = local9;
				local190 = local14;
			} else {
				@Pc(175) int local175 = super.aByteArray19[arg0] & 0xFF;
				local180 = super.anIntArray185[local175];
				local185 = super.anIntArray189[local175];
				local190 = super.anIntArray164[local175];
			}
			if (super.anIntArray188[arg0] == -1) {
				this.aClass123_1.method3224(super.anIntArray161[local4], super.anIntArray161[local9], super.anIntArray161[local14], super.anIntArray166[local4], super.anIntArray166[local9], super.anIntArray166[local14], super.anIntArray169[local4], super.anIntArray169[local9], super.anIntArray169[local14], super.anIntArray181[arg0], super.anIntArray181[arg0], super.anIntArray181[arg0], super.anIntArray159[local180], super.anIntArray159[local185], super.anIntArray159[local190], super.anIntArray176[local180], super.anIntArray176[local185], super.anIntArray176[local190], super.anIntArray173[local180], super.anIntArray173[local185], super.anIntArray173[local190], super.aShortArray29[arg0]);
			} else {
				this.aClass123_1.method3224(super.anIntArray161[local4], super.anIntArray161[local9], super.anIntArray161[local14], super.anIntArray166[local4], super.anIntArray166[local9], super.anIntArray166[local14], super.anIntArray169[local4], super.anIntArray169[local9], super.anIntArray169[local14], super.anIntArray181[arg0], super.anIntArray178[arg0], super.anIntArray188[arg0], super.anIntArray159[local180], super.anIntArray159[local185], super.anIntArray159[local190], super.anIntArray176[local180], super.anIntArray176[local185], super.anIntArray176[local190], super.anIntArray173[local180], super.anIntArray173[local185], super.anIntArray173[local190], super.aShortArray29[arg0]);
			}
		} else if (super.anIntArray188[arg0] == -1) {
			this.aClass123_1.method3221(super.anIntArray161[local4], super.anIntArray161[local9], super.anIntArray161[local14], super.anIntArray166[local4], super.anIntArray166[local9], super.anIntArray166[local14], super.anIntArray169[local4], super.anIntArray169[local9], super.anIntArray169[local14], Static18.anIntArray203[super.anIntArray181[arg0] & 0xFFFF]);
		} else {
			this.aClass123_1.method3218(super.anIntArray161[local4], super.anIntArray161[local9], super.anIntArray161[local14], super.anIntArray166[local4], super.anIntArray166[local9], super.anIntArray166[local14], super.anIntArray169[local4], super.anIntArray169[local9], super.anIntArray169[local14], super.anIntArray181[arg0] & 0xFFFF, super.anIntArray178[arg0] & 0xFFFF, super.anIntArray188[arg0] & 0xFFFF);
		}
	}

	@OriginalMember(owner = "client!afa", name = "d", descriptor = "(I)V")
	private void method238(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = super.aClass66_Sub2_6.anInt3206;
		@Pc(10) short local10 = super.aShortArray25[arg0];
		@Pc(15) short local15 = super.aShortArray26[arg0];
		@Pc(20) short local20 = super.aShortArray28[arg0];
		@Pc(25) int local25 = super.anIntArray173[local10];
		@Pc(30) int local30 = super.anIntArray173[local15];
		@Pc(35) int local35 = super.anIntArray173[local20];
		if (super.aByteArray20 == null) {
			this.aClass123_1.anInt3618 = 0;
		} else {
			this.aClass123_1.anInt3618 = super.aByteArray20[arg0] & 0xFF;
		}
		@Pc(96) int local96;
		@Pc(101) int local101;
		@Pc(108) int local108;
		@Pc(121) int local121;
		if (local25 >= local5) {
			super.anIntArray171[0] = super.anIntArray166[local10];
			super.anIntArray184[0] = super.anIntArray161[local10];
			super.anIntArray168[0] = super.anIntArray169[local10];
			local1++;
			super.anIntArray163[0] = super.anIntArray181[arg0] & 0xFFFF;
		} else {
			local96 = super.anIntArray159[local10];
			local101 = super.anIntArray176[local10];
			local108 = super.anIntArray181[arg0] & 0xFFFF;
			if (local35 >= local5) {
				local121 = (local5 - local25) * Class9_Sub1.anIntArray192[local35 - local25];
				super.anIntArray171[0] = super.aClass94_5.anInt6899 + (local96 + ((super.anIntArray159[local20] - local96) * local121 >> 16)) * super.aClass66_Sub2_6.anInt3232 / local5;
				super.anIntArray184[0] = super.aClass94_5.anInt6900 + (local101 + ((super.anIntArray176[local20] - local101) * local121 >> 16)) * super.aClass66_Sub2_6.anInt3226 / local5;
				super.anIntArray168[0] = local5;
				local1++;
				super.anIntArray163[0] = local108 + (((super.anIntArray188[arg0] & 0xFFFF) - local108) * local121 >> 16);
			}
			if (local30 >= local5) {
				local121 = (local5 - local25) * Class9_Sub1.anIntArray192[local30 - local25];
				super.anIntArray171[local1] = super.aClass94_5.anInt6899 + (local96 + ((super.anIntArray159[local15] - local96) * local121 >> 16)) * super.aClass66_Sub2_6.anInt3232 / local5;
				super.anIntArray184[local1] = super.aClass94_5.anInt6900 + (local101 + ((super.anIntArray176[local15] - local101) * local121 >> 16)) * super.aClass66_Sub2_6.anInt3226 / local5;
				super.anIntArray168[local1] = local5;
				super.anIntArray163[local1++] = local108 + (((super.anIntArray178[arg0] & 0xFFFF) - local108) * local121 >> 16);
			}
		}
		if (local30 >= local5) {
			super.anIntArray171[local1] = super.anIntArray166[local15];
			super.anIntArray184[local1] = super.anIntArray161[local15];
			super.anIntArray168[local1] = super.anIntArray169[local15];
			super.anIntArray163[local1++] = super.anIntArray178[arg0] & 0xFFFF;
		} else {
			local96 = super.anIntArray159[local15];
			local101 = super.anIntArray176[local15];
			local108 = super.anIntArray178[arg0] & 0xFFFF;
			if (local25 >= local5) {
				local121 = (local5 - local30) * Class9_Sub1.anIntArray192[local25 - local30];
				super.anIntArray171[local1] = super.aClass94_5.anInt6899 + (local96 + ((super.anIntArray159[local10] - local96) * local121 >> 16)) * super.aClass66_Sub2_6.anInt3232 / local5;
				super.anIntArray184[local1] = super.aClass94_5.anInt6900 + (local101 + ((super.anIntArray176[local10] - local101) * local121 >> 16)) * super.aClass66_Sub2_6.anInt3226 / local5;
				super.anIntArray168[local1] = local5;
				super.anIntArray163[local1++] = local108 + (((super.anIntArray181[arg0] & 0xFFFF) - local108) * local121 >> 16);
			}
			if (local35 >= local5) {
				local121 = (local5 - local30) * Class9_Sub1.anIntArray192[local35 - local30];
				super.anIntArray171[local1] = super.aClass94_5.anInt6899 + (local96 + ((super.anIntArray159[local20] - local96) * local121 >> 16)) * super.aClass66_Sub2_6.anInt3232 / local5;
				super.anIntArray184[local1] = super.aClass94_5.anInt6900 + (local101 + ((super.anIntArray176[local20] - local101) * local121 >> 16)) * super.aClass66_Sub2_6.anInt3226 / local5;
				super.anIntArray168[local1] = local5;
				super.anIntArray163[local1++] = local108 + (((super.anIntArray188[arg0] & 0xFFFF) - local108) * local121 >> 16);
			}
		}
		if (local35 >= local5) {
			super.anIntArray171[local1] = super.anIntArray166[local20];
			super.anIntArray184[local1] = super.anIntArray161[local20];
			super.anIntArray168[local1] = super.anIntArray169[local20];
			super.anIntArray163[local1++] = super.anIntArray188[arg0] & 0xFFFF;
		} else {
			local96 = super.anIntArray159[local20];
			local101 = super.anIntArray176[local20];
			local108 = super.anIntArray188[arg0] & 0xFFFF;
			if (local30 >= local5) {
				local121 = (local5 - local35) * Class9_Sub1.anIntArray192[local30 - local35];
				super.anIntArray171[local1] = super.aClass94_5.anInt6899 + (local96 + ((super.anIntArray159[local15] - local96) * local121 >> 16)) * super.aClass66_Sub2_6.anInt3232 / local5;
				super.anIntArray184[local1] = super.aClass94_5.anInt6900 + (local101 + ((super.anIntArray176[local15] - local101) * local121 >> 16)) * super.aClass66_Sub2_6.anInt3226 / local5;
				super.anIntArray168[local1] = local5;
				super.anIntArray163[local1++] = local108 + (((super.anIntArray178[arg0] & 0xFFFF) - local108) * local121 >> 16);
			}
			if (local25 >= local5) {
				local121 = (local5 - local35) * Class9_Sub1.anIntArray192[local25 - local35];
				super.anIntArray171[local1] = super.aClass94_5.anInt6899 + (local96 + ((super.anIntArray159[local10] - local96) * local121 >> 16)) * super.aClass66_Sub2_6.anInt3232 / local5;
				super.anIntArray184[local1] = super.aClass94_5.anInt6900 + (local101 + ((super.anIntArray176[local10] - local101) * local121 >> 16)) * super.aClass66_Sub2_6.anInt3226 / local5;
				super.anIntArray168[local1] = local5;
				super.anIntArray163[local1++] = local108 + (((super.anIntArray181[arg0] & 0xFFFF) - local108) * local121 >> 16);
			}
		}
		local96 = super.anIntArray171[0];
		local101 = super.anIntArray171[1];
		local108 = super.anIntArray171[2];
		local121 = super.anIntArray184[0];
		@Pc(779) int local779 = super.anIntArray184[1];
		@Pc(784) int local784 = super.anIntArray184[2];
		local25 = super.anIntArray168[0];
		local30 = super.anIntArray168[1];
		local35 = super.anIntArray168[2];
		this.aClass123_1.aBoolean289 = false;
		@Pc(913) int local913;
		@Pc(918) int local918;
		@Pc(923) int local923;
		@Pc(908) int local908;
		if (local1 == 3) {
			if (local96 < 0 || local101 < 0 || local108 < 0 || local96 > super.aClass94_5.anInt6901 || local101 > super.aClass94_5.anInt6901 || local108 > super.aClass94_5.anInt6901) {
				this.aClass123_1.aBoolean289 = true;
			}
			if (super.aShortArray29 != null && super.aShortArray29[arg0] != -1) {
				if (super.aByteArray19 == null || super.aByteArray19[arg0] == -1) {
					local913 = local10;
					local918 = local15;
					local923 = local20;
				} else {
					local908 = super.aByteArray19[arg0] & 0xFF;
					local913 = super.anIntArray185[local908];
					local918 = super.anIntArray189[local908];
					local923 = super.anIntArray164[local908];
				}
				if (super.anIntArray188[arg0] == -1) {
					this.aClass123_1.method3224(local121, local779, local784, local96, local101, local108, local25, local30, local35, super.anIntArray181[arg0], super.anIntArray181[arg0], super.anIntArray181[arg0], super.anIntArray159[local913], super.anIntArray159[local918], super.anIntArray159[local923], super.anIntArray176[local913], super.anIntArray176[local918], super.anIntArray176[local923], super.anIntArray173[local913], super.anIntArray173[local918], super.anIntArray173[local923], super.aShortArray29[arg0]);
				} else {
					this.aClass123_1.method3224(local121, local779, local784, local96, local101, local108, local25, local30, local35, super.anIntArray163[0], super.anIntArray163[1], super.anIntArray163[2], super.anIntArray159[local913], super.anIntArray159[local918], super.anIntArray159[local923], super.anIntArray176[local913], super.anIntArray176[local918], super.anIntArray176[local923], super.anIntArray173[local913], super.anIntArray173[local918], super.anIntArray173[local923], super.aShortArray29[arg0]);
				}
			} else if (super.anIntArray188[arg0] == -1) {
				this.aClass123_1.method3221(local121, local779, local784, local96, local101, local108, local25, local30, local35, Static18.anIntArray203[super.anIntArray181[arg0] & 0xFFFF]);
			} else {
				this.aClass123_1.method3218(local121, local779, local784, local96, local101, local108, local25, local30, local35, super.anIntArray163[0], super.anIntArray163[1], super.anIntArray163[2]);
			}
		}
		if (local1 != 4) {
			return;
		}
		if (local96 < 0 || local101 < 0 || local108 < 0 || local96 > super.aClass94_5.anInt6901 || local101 > super.aClass94_5.anInt6901 || local108 > super.aClass94_5.anInt6901 || super.anIntArray171[3] < 0 || super.anIntArray171[3] > super.aClass94_5.anInt6901) {
			this.aClass123_1.aBoolean289 = true;
		}
		if (super.aShortArray29 == null || super.aShortArray29[arg0] == -1) {
			if (super.anIntArray188[arg0] == -1) {
				local913 = Static18.anIntArray203[super.anIntArray181[arg0] & 0xFFFF];
				this.aClass123_1.method3221(local121, local779, local784, local96, local101, local108, local25, local30, local35, local913);
				this.aClass123_1.method3221(local121, local784, super.anIntArray184[3], local96, local108, super.anIntArray171[3], local25, local30, super.anIntArray168[3], local913);
				return;
			}
			this.aClass123_1.method3218(local121, local779, local784, local96, local101, local108, local25, local30, local35, super.anIntArray163[0], super.anIntArray163[1], super.anIntArray163[2]);
			this.aClass123_1.method3218(local121, local784, super.anIntArray184[3], local96, local108, super.anIntArray171[3], local25, local30, super.anIntArray168[3], super.anIntArray163[0], super.anIntArray163[2], super.anIntArray163[3]);
			return;
		}
		if (super.aByteArray19 == null || super.aByteArray19[arg0] == -1) {
			local913 = local10;
			local918 = local15;
			local923 = local20;
		} else {
			local908 = super.aByteArray19[arg0] & 0xFF;
			local913 = super.anIntArray185[local908];
			local918 = super.anIntArray189[local908];
			local923 = super.anIntArray164[local908];
		}
		@Pc(1267) short local1267 = super.aShortArray29[arg0];
		if (super.anIntArray188[arg0] == -1) {
			this.aClass123_1.method3224(local121, local779, local784, local96, local101, local108, local25, local30, local35, super.anIntArray181[arg0], super.anIntArray181[arg0], super.anIntArray181[arg0], super.anIntArray159[local913], super.anIntArray159[local918], super.anIntArray159[local923], super.anIntArray176[local913], super.anIntArray176[local918], super.anIntArray176[local923], super.anIntArray173[local913], super.anIntArray173[local918], super.anIntArray173[local923], local1267);
			this.aClass123_1.method3224(local121, local784, super.anIntArray184[3], local96, local108, super.anIntArray171[3], local25, local30, super.anIntArray168[3], super.anIntArray181[arg0], super.anIntArray181[arg0], super.anIntArray181[arg0], super.anIntArray159[local913], super.anIntArray159[local918], super.anIntArray159[local923], super.anIntArray176[local913], super.anIntArray176[local918], super.anIntArray176[local923], super.anIntArray173[local913], super.anIntArray173[local918], super.anIntArray173[local923], local1267);
			return;
		}
		this.aClass123_1.method3224(local121, local779, local784, local96, local101, local108, local25, local30, local35, super.anIntArray163[0], super.anIntArray163[1], super.anIntArray163[2], super.anIntArray159[local913], super.anIntArray159[local918], super.anIntArray159[local923], super.anIntArray176[local913], super.anIntArray176[local918], super.anIntArray176[local923], super.anIntArray173[local913], super.anIntArray173[local918], super.anIntArray173[local923], local1267);
		this.aClass123_1.method3224(local121, local784, super.anIntArray184[3], local96, local108, super.anIntArray171[3], local25, local30, super.anIntArray168[3], super.anIntArray163[0], super.anIntArray163[2], super.anIntArray163[3], super.anIntArray159[local913], super.anIntArray159[local918], super.anIntArray159[local923], super.anIntArray176[local913], super.anIntArray176[local918], super.anIntArray176[local923], super.anIntArray173[local913], super.anIntArray173[local918], super.anIntArray173[local923], local1267);
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(IZZ)V")
	private void method239(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (super.anIntArray188[arg0] == -2) {
			return;
		}
		@Pc(11) short local11 = super.aShortArray25[arg0];
		@Pc(16) short local16 = super.aShortArray26[arg0];
		@Pc(21) short local21 = super.aShortArray28[arg0];
		@Pc(26) int local26 = super.anIntArray166[local11];
		@Pc(31) int local31 = super.anIntArray166[local16];
		@Pc(36) int local36 = super.anIntArray166[local21];
		@Pc(52) int local52;
		if (arg1 && (local26 == -5000 || local31 == -5000 || local36 == -5000)) {
			local52 = super.anIntArray159[local11];
			@Pc(57) int local57 = super.anIntArray159[local16];
			@Pc(62) int local62 = super.anIntArray159[local21];
			@Pc(67) int local67 = super.anIntArray176[local11];
			@Pc(72) int local72 = super.anIntArray176[local16];
			@Pc(77) int local77 = super.anIntArray176[local21];
			@Pc(82) int local82 = super.anIntArray173[local11];
			@Pc(87) int local87 = super.anIntArray173[local16];
			@Pc(92) int local92 = super.anIntArray173[local21];
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
				this.method238(arg0);
				return;
			}
		} else if (super.anIntArray174[arg0] != -1 || (local26 - local31) * (super.anIntArray161[local21] - super.anIntArray161[local16]) - (super.anIntArray161[local11] - super.anIntArray161[local16]) * (local36 - local31) > 0) {
			if (local26 >= 0 && local31 >= 0 && local36 >= 0 && local26 <= super.aClass94_5.anInt6901 && local31 <= super.aClass94_5.anInt6901 && local36 <= super.aClass94_5.anInt6901) {
				super.aBooleanArray9[arg0] = false;
			} else {
				super.aBooleanArray9[arg0] = true;
			}
			if (arg2) {
				local52 = super.anIntArray174[arg0];
				if (local52 == -1 || !super.lb[local52].aBoolean612) {
					this.method240(arg0);
				}
				return;
			}
			local52 = super.anIntArray174[arg0];
			if (local52 != -1) {
				@Pc(255) Class322 local255 = super.lb[local52];
				@Pc(260) Class360 local260 = super.aClass360Array3[local52];
				if (!local255.aBoolean612) {
					this.method237(arg0);
				}
				super.aClass66_Sub2_6.method2964(local260.anInt9754, local260.anInt9765, local260.anInt9757, local260.anInt9769, local260.anInt9761, local260.anInt9768, local255.aShort109 & 0xFFFF, local260.anInt9758, local255.aByte99, local255.aByte100);
				return;
			}
			this.method237(arg0);
		}
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(BIZ)Lclient!ba;")
	@Override
	public Class9 method4006(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.method1169(Thread.currentThread());
		@Pc(11) Class9_Sub1 local11;
		@Pc(8) Class9_Sub1 local8;
		if (arg0 == 1) {
			local8 = super.aClass9_Sub1_24;
			local11 = super.aClass9_Sub1_30;
		} else if (arg0 == 2) {
			local8 = super.aClass9_Sub1_28;
			local11 = super.aClass9_Sub1_26;
		} else if (arg0 == 3) {
			local8 = super.aClass9_Sub1_21;
			local11 = super.aClass9_Sub1_27;
		} else if (arg0 == 4) {
			local8 = super.aClass9_Sub1_25;
			local11 = super.aClass9_Sub1_22;
		} else if (arg0 == 5) {
			local8 = super.aClass9_Sub1_29;
			local11 = super.aClass9_Sub1_23;
		} else {
			local11 = local8 = new Class9_Sub1_Sub1(super.aClass66_Sub2_6);
		}
		return this.method1154(local11, local8, arg1, arg0 != 0, arg2);
	}

	@OriginalMember(owner = "client!afa", name = "b", descriptor = "(Ljava/lang/Thread;)V")
	@Override
	protected void method1172(@OriginalArg(0) Thread arg0) {
		super.method1172(arg0);
		@Pc(8) Class94_Sub2 local8 = (Class94_Sub2) super.aClass66_Sub2_6.method2953(arg0);
		this.aClass123_1 = local8.aClass123_2;
	}

	@OriginalMember(owner = "client!afa", name = "b", descriptor = "(I)V")
	@Override
	protected void method1174(@OriginalArg(0) int arg0) {
		this.aClass123_1.aBoolean287 = (arg0 & 0x1) == 0;
		this.aClass123_1.aBoolean290 = false;
	}

	@OriginalMember(owner = "client!afa", name = "e", descriptor = "(I)V")
	private void method240(@OriginalArg(0) int arg0) {
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
		if (!super.aClass66_Sub2_6.aBoolean253) {
			local8 = super.aShortArray25[arg0];
			local13 = super.aShortArray26[arg0];
			local18 = super.aShortArray28[arg0];
			local27 = super.anIntArray169[local8] - super.aClass66_Sub2_6.anInt3223;
			if (local27 > 255) {
				local27 = 255;
			} else if (local27 < 0) {
				local27 = 0;
			}
			local46 = super.anIntArray169[local13] - super.aClass66_Sub2_6.anInt3223;
			if (local46 > 255) {
				local46 = 255;
			} else if (local46 < 0) {
				local46 = 0;
			}
			local65 = super.anIntArray169[local18] - super.aClass66_Sub2_6.anInt3223;
			if (local65 > 255) {
				local65 = 255;
			} else if (local65 < 0) {
				local65 = 0;
			}
			local81 = local27 + local46 + local65;
			if (local81 != 765) {
				if (local81 == 0) {
					this.method237(arg0);
				} else {
					if (super.aByteArray20 == null) {
						this.aClass123_1.anInt3618 = 0;
					} else {
						this.aClass123_1.anInt3618 = super.aByteArray20[arg0] & 0xFF;
					}
					this.aClass123_1.aBoolean289 = super.aBooleanArray9[arg0];
					if (super.aShortArray29 != null && super.aShortArray29[arg0] != -1) {
						if (super.aByteArray19 == null || super.aByteArray19[arg0] == -1) {
							local333 = local8;
							local338 = local13;
							local343 = local18;
						} else {
							@Pc(328) int local328 = super.aByteArray19[arg0] & 0xFF;
							local333 = super.anIntArray185[local328];
							local338 = super.anIntArray189[local328];
							local343 = super.anIntArray164[local328];
						}
						if (super.anIntArray188[arg0] == -1) {
							this.aClass123_1.method3213(super.anIntArray161[local8], super.anIntArray161[local13], super.anIntArray161[local18], super.anIntArray166[local8], super.anIntArray166[local13], super.anIntArray166[local18], super.anIntArray169[local8], super.anIntArray169[local13], super.anIntArray169[local18], super.aClass66_Sub2_6.anInt3209, local27, local46, local65, super.anIntArray181[arg0], super.anIntArray181[arg0], super.anIntArray181[arg0], super.anIntArray159[local333], super.anIntArray159[local338], super.anIntArray159[local343], super.anIntArray176[local333], super.anIntArray176[local338], super.anIntArray176[local343], super.anIntArray173[local333], super.anIntArray173[local338], super.anIntArray173[local343], super.aShortArray29[arg0]);
						} else {
							this.aClass123_1.method3213(super.anIntArray161[local8], super.anIntArray161[local13], super.anIntArray161[local18], super.anIntArray166[local8], super.anIntArray166[local13], super.anIntArray166[local18], super.anIntArray169[local8], super.anIntArray169[local13], super.anIntArray169[local18], super.aClass66_Sub2_6.anInt3209, local27, local46, local65, super.anIntArray181[arg0], super.anIntArray178[arg0], super.anIntArray188[arg0], super.anIntArray159[local333], super.anIntArray159[local338], super.anIntArray159[local343], super.anIntArray176[local333], super.anIntArray176[local338], super.anIntArray176[local343], super.anIntArray173[local333], super.anIntArray173[local338], super.anIntArray173[local343], super.aShortArray29[arg0]);
						}
					} else if (super.anIntArray188[arg0] == -1) {
						this.aClass123_1.method3215(super.anIntArray161[local8], super.anIntArray161[local13], super.anIntArray161[local18], super.anIntArray166[local8], super.anIntArray166[local13], super.anIntArray166[local18], super.anIntArray169[local8], super.anIntArray169[local13], super.anIntArray169[local18], Static482.method6709(local27 << 24 | super.aClass66_Sub2_6.anInt3209, Static18.anIntArray203[super.anIntArray181[arg0] & 0xFFFF]), Static482.method6709(local46 << 24 | super.aClass66_Sub2_6.anInt3209, Static18.anIntArray203[super.anIntArray181[arg0] & 0xFFFF]), Static482.method6709(local65 << 24 | super.aClass66_Sub2_6.anInt3209, Static18.anIntArray203[super.anIntArray181[arg0] & 0xFFFF]));
					} else {
						this.aClass123_1.method3215(super.anIntArray161[local8], super.anIntArray161[local13], super.anIntArray161[local18], super.anIntArray166[local8], super.anIntArray166[local13], super.anIntArray166[local18], super.anIntArray169[local8], super.anIntArray169[local13], super.anIntArray169[local18], Static482.method6709(local27 << 24 | super.aClass66_Sub2_6.anInt3209, Static18.anIntArray203[super.anIntArray181[arg0] & 0xFFFF]), Static482.method6709(local46 << 24 | super.aClass66_Sub2_6.anInt3209, Static18.anIntArray203[super.anIntArray178[arg0] & 0xFFFF]), Static482.method6709(local65 << 24 | super.aClass66_Sub2_6.anInt3209, Static18.anIntArray203[super.anIntArray188[arg0] & 0xFFFF]));
					}
				}
			}
		} else if (!super.aBooleanArray8[arg0]) {
			local8 = super.aShortArray25[arg0];
			local13 = super.aShortArray26[arg0];
			local18 = super.aShortArray28[arg0];
			local27 = 0;
			local46 = 0;
			local65 = 0;
			if (super.anIntArray175[local8] > super.aClass66_Sub2_6.anInt3234) {
				local27 = 255;
			} else if (super.anIntArray175[local8] > super.aClass66_Sub2_6.anInt3212) {
				local27 = (super.aClass66_Sub2_6.anInt3212 - super.anIntArray175[local8]) * 255 / (super.aClass66_Sub2_6.anInt3212 - super.aClass66_Sub2_6.anInt3234);
			}
			if (super.anIntArray175[local13] > super.aClass66_Sub2_6.anInt3234) {
				local46 = 255;
			} else if (super.anIntArray175[local13] > super.aClass66_Sub2_6.anInt3212) {
				local46 = (super.aClass66_Sub2_6.anInt3212 - super.anIntArray175[local13]) * 255 / (super.aClass66_Sub2_6.anInt3212 - super.aClass66_Sub2_6.anInt3234);
			}
			if (super.anIntArray175[local18] > super.aClass66_Sub2_6.anInt3234) {
				local65 = 255;
			} else if (super.anIntArray175[local18] > super.aClass66_Sub2_6.anInt3212) {
				local65 = (super.aClass66_Sub2_6.anInt3212 - super.anIntArray175[local18]) * 255 / (super.aClass66_Sub2_6.anInt3212 - super.aClass66_Sub2_6.anInt3234);
			}
			if (super.aByteArray20 == null) {
				this.aClass123_1.anInt3618 = 0;
			} else {
				this.aClass123_1.anInt3618 = super.aByteArray20[arg0] & 0xFF;
			}
			this.aClass123_1.aBoolean289 = super.aBooleanArray9[arg0];
			if (super.aShortArray29 != null && super.aShortArray29[arg0] != -1) {
				if (super.aByteArray19 == null || super.aByteArray19[arg0] == -1) {
					local81 = local8;
					local333 = local13;
					local338 = local18;
				} else {
					local343 = super.aByteArray19[arg0] & 0xFF;
					local81 = super.anIntArray185[local343];
					local333 = super.anIntArray189[local343];
					local338 = super.anIntArray164[local343];
				}
				if (super.anIntArray188[arg0] == -1) {
					this.aClass123_1.method3213(super.anIntArray161[local8], super.anIntArray161[local13], super.anIntArray161[local18], super.anIntArray166[local8], super.anIntArray166[local13], super.anIntArray166[local18], super.anIntArray169[local8], super.anIntArray169[local13], super.anIntArray169[local18], super.aClass66_Sub2_6.anInt3209, local27, local46, local65, super.anIntArray181[arg0], super.anIntArray181[arg0], super.anIntArray181[arg0], super.anIntArray159[local81], super.anIntArray159[local333], super.anIntArray159[local338], super.anIntArray176[local81], super.anIntArray176[local333], super.anIntArray176[local338], super.anIntArray173[local81], super.anIntArray173[local333], super.anIntArray173[local338], super.aShortArray29[arg0]);
				} else {
					this.aClass123_1.method3213(super.anIntArray161[local8], super.anIntArray161[local13], super.anIntArray161[local18], super.anIntArray166[local8], super.anIntArray166[local13], super.anIntArray166[local18], super.anIntArray169[local8], super.anIntArray169[local13], super.anIntArray169[local18], super.aClass66_Sub2_6.anInt3209, local27, local46, local65, super.anIntArray181[arg0], super.anIntArray178[arg0], super.anIntArray188[arg0], super.anIntArray159[local81], super.anIntArray159[local333], super.anIntArray159[local338], super.anIntArray176[local81], super.anIntArray176[local333], super.anIntArray176[local338], super.anIntArray173[local81], super.anIntArray173[local333], super.anIntArray173[local338], super.aShortArray29[arg0]);
				}
			} else if (super.anIntArray188[arg0] == -1) {
				this.aClass123_1.method3215(super.anIntArray161[local8], super.anIntArray161[local13], super.anIntArray161[local18], super.anIntArray166[local8], super.anIntArray166[local13], super.anIntArray166[local18], super.anIntArray169[local8], super.anIntArray169[local13], super.anIntArray169[local18], Static482.method6709(local27 << 24 | super.aClass66_Sub2_6.anInt3209, Static18.anIntArray203[super.anIntArray181[arg0] & 0xFFFF]), Static482.method6709(local46 << 24 | super.aClass66_Sub2_6.anInt3209, Static18.anIntArray203[super.anIntArray181[arg0] & 0xFFFF]), Static482.method6709(local65 << 24 | super.aClass66_Sub2_6.anInt3209, Static18.anIntArray203[super.anIntArray181[arg0] & 0xFFFF]));
			} else {
				this.aClass123_1.method3215(super.anIntArray161[local8], super.anIntArray161[local13], super.anIntArray161[local18], super.anIntArray166[local8], super.anIntArray166[local13], super.anIntArray166[local18], super.anIntArray169[local8], super.anIntArray169[local13], super.anIntArray169[local18], Static482.method6709(local27 << 24 | super.aClass66_Sub2_6.anInt3209, Static18.anIntArray203[super.anIntArray181[arg0] & 0xFFFF]), Static482.method6709(local46 << 24 | super.aClass66_Sub2_6.anInt3209, Static18.anIntArray203[super.anIntArray178[arg0] & 0xFFFF]), Static482.method6709(local65 << 24 | super.aClass66_Sub2_6.anInt3209, Static18.anIntArray203[super.anIntArray188[arg0] & 0xFFFF]));
			}
		}
	}

	@OriginalMember(owner = "client!afa", name = "r", descriptor = "()V")
	@Override
	protected void method1175() {
		this.aClass123_1 = null;
	}

	@OriginalMember(owner = "client!afa", name = "j", descriptor = "()V")
	@Override
	protected void method1160() {
		super.aClass94_5.anInt6901 = this.aClass123_1.anInt3619;
		super.aClass94_5.anInt6899 = this.aClass123_1.anInt3616;
		super.aClass94_5.anInt6900 = this.aClass123_1.anInt3614;
	}
}
