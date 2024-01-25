import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public final class Class9_Sub1_Sub2 extends Class9_Sub1 {

	@OriginalMember(owner = "client!cl", name = "qc", descriptor = "Lclient!ml;")
	private Class227 aClass227_1;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lclient!qe;)V")
	public Class9_Sub1_Sub2(@OriginalArg(0) Class66_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lclient!qe;[Lclient!cl;)V")
	public Class9_Sub1_Sub2(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) Class9_Sub1_Sub2[] arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lclient!qe;Lclient!pf;IIII)V")
	public Class9_Sub1_Sub2(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) Class266 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(Ljava/lang/Thread;)V")
	@Override
	protected void method1172(@OriginalArg(0) Thread arg0) {
		super.method1172(arg0);
		@Pc(8) Class94_Sub1 local8 = (Class94_Sub1) super.aClass66_Sub2_6.method2953(arg0);
		this.aClass227_1 = local8.aClass227_2;
		super.anIntArray187 = local8.anIntArray350;
		super.anIntArray157 = local8.anIntArray349;
		super.anIntArrayArray30 = local8.anIntArrayArray44;
		super.anIntArray167 = local8.anIntArray346;
		super.anIntArrayArray26 = local8.anIntArrayArray43;
		super.anIntArray177 = local8.anIntArray348;
		super.anIntArrayArray27 = local8.anIntArrayArray45;
		super.anIntArray165 = local8.anIntArray345;
		super.anIntArray170 = local8.anIntArray347;
		super.anIntArray158 = local8.anIntArray351;
	}

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "(I)V")
	private void method1177(@OriginalArg(0) int arg0) {
		if (super.aBooleanArray8[arg0]) {
			this.method1180(arg0);
			return;
		}
		@Pc(13) short local13 = super.aShortArray25[arg0];
		@Pc(18) short local18 = super.aShortArray26[arg0];
		@Pc(23) short local23 = super.aShortArray28[arg0];
		this.aClass227_1.aBoolean437 = super.aBooleanArray9[arg0];
		if (super.aByteArray20 == null) {
			this.aClass227_1.anInt5884 = 0;
		} else {
			this.aClass227_1.anInt5884 = super.aByteArray20[arg0] & 0xFF;
		}
		if (super.aShortArray29 != null && super.aShortArray29[arg0] != -1) {
			@Pc(165) int local165;
			@Pc(170) int local170;
			@Pc(175) int local175;
			if (super.aByteArray19 == null || super.aByteArray19[arg0] == -1) {
				local165 = local13;
				local170 = local18;
				local175 = local23;
			} else {
				@Pc(160) int local160 = super.aByteArray19[arg0] & 0xFF;
				local165 = super.anIntArray185[local160];
				local170 = super.anIntArray189[local160];
				local175 = super.anIntArray164[local160];
			}
			if (super.anIntArray188[arg0] == -1) {
				this.aClass227_1.method4987(super.anIntArray161[local13], super.anIntArray161[local18], super.anIntArray161[local23], super.anIntArray166[local13], super.anIntArray166[local18], super.anIntArray166[local23], super.anIntArray181[arg0], super.anIntArray181[arg0], super.anIntArray181[arg0], super.anIntArray159[local165], super.anIntArray159[local170], super.anIntArray159[local175], super.anIntArray176[local165], super.anIntArray176[local170], super.anIntArray176[local175], super.anIntArray173[local165], super.anIntArray173[local170], super.anIntArray173[local175], super.aShortArray29[arg0]);
			} else {
				this.aClass227_1.method4987(super.anIntArray161[local13], super.anIntArray161[local18], super.anIntArray161[local23], super.anIntArray166[local13], super.anIntArray166[local18], super.anIntArray166[local23], super.anIntArray181[arg0], super.anIntArray178[arg0], super.anIntArray188[arg0], super.anIntArray159[local165], super.anIntArray159[local170], super.anIntArray159[local175], super.anIntArray176[local165], super.anIntArray176[local170], super.anIntArray176[local175], super.anIntArray173[local165], super.anIntArray173[local170], super.anIntArray173[local175], super.aShortArray29[arg0]);
			}
		} else if (super.anIntArray188[arg0] == -1) {
			this.aClass227_1.method4975(super.anIntArray161[local13], super.anIntArray161[local18], super.anIntArray161[local23], super.anIntArray166[local13], super.anIntArray166[local18], super.anIntArray166[local23], Static18.anIntArray203[super.anIntArray181[arg0] & 0xFFFF]);
		} else {
			this.aClass227_1.method4977(super.anIntArray161[local13], super.anIntArray161[local18], super.anIntArray161[local23], super.anIntArray166[local13], super.anIntArray166[local18], super.anIntArray166[local23], super.anIntArray181[arg0] & 0xFFFF, super.anIntArray178[arg0] & 0xFFFF, super.anIntArray188[arg0] & 0xFFFF);
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(BIZ)Lclient!ba;")
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
			local11 = local8 = new Class9_Sub1_Sub2(super.aClass66_Sub2_6);
		}
		return this.method1154(local11, local8, arg1, arg0 != 0, arg2);
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)V")
	@Override
	protected void method1174(@OriginalArg(0) int arg0) {
		this.aClass227_1.aBoolean436 = (arg0 & 0x1) == 0;
		this.aClass227_1.aBoolean435 = false;
	}

	@OriginalMember(owner = "client!cl", name = "d", descriptor = "(I)V")
	private void method1179(@OriginalArg(0) int arg0) {
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
					this.method1177(arg0);
				} else {
					if (super.aByteArray20 == null) {
						this.aClass227_1.anInt5884 = 0;
					} else {
						this.aClass227_1.anInt5884 = super.aByteArray20[arg0] & 0xFF;
					}
					this.aClass227_1.aBoolean437 = super.aBooleanArray9[arg0];
					if (super.aShortArray29 != null && super.aShortArray29[arg0] != -1) {
						if (super.aByteArray19 == null || super.aByteArray19[arg0] == -1) {
							local309 = local8;
							local314 = local13;
							local319 = local18;
						} else {
							@Pc(304) int local304 = super.aByteArray19[arg0] & 0xFF;
							local309 = super.anIntArray185[local304];
							local314 = super.anIntArray189[local304];
							local319 = super.anIntArray164[local304];
						}
						if (super.anIntArray188[arg0] == -1) {
							this.aClass227_1.method4986(super.anIntArray161[local8], super.anIntArray161[local13], super.anIntArray161[local18], super.anIntArray166[local8], super.anIntArray166[local13], super.anIntArray166[local18], super.aClass66_Sub2_6.anInt3209, local27, local46, local65, super.anIntArray181[arg0], super.anIntArray181[arg0], super.anIntArray181[arg0], super.anIntArray159[local309], super.anIntArray159[local314], super.anIntArray159[local319], super.anIntArray176[local309], super.anIntArray176[local314], super.anIntArray176[local319], super.anIntArray173[local309], super.anIntArray173[local314], super.anIntArray173[local319], super.aShortArray29[arg0]);
						} else {
							this.aClass227_1.method4986(super.anIntArray161[local8], super.anIntArray161[local13], super.anIntArray161[local18], super.anIntArray166[local8], super.anIntArray166[local13], super.anIntArray166[local18], super.aClass66_Sub2_6.anInt3209, local27, local46, local65, super.anIntArray181[arg0], super.anIntArray178[arg0], super.anIntArray188[arg0], super.anIntArray159[local309], super.anIntArray159[local314], super.anIntArray159[local319], super.anIntArray176[local309], super.anIntArray176[local314], super.anIntArray176[local319], super.anIntArray173[local309], super.anIntArray173[local314], super.anIntArray173[local319], super.aShortArray29[arg0]);
						}
					} else if (super.anIntArray188[arg0] == -1) {
						this.aClass227_1.method4984(super.anIntArray161[local8], super.anIntArray161[local13], super.anIntArray161[local18], super.anIntArray166[local8], super.anIntArray166[local13], super.anIntArray166[local18], Static482.method6709(local27 << 24 | super.aClass66_Sub2_6.anInt3209, Static18.anIntArray203[super.anIntArray181[arg0] & 0xFFFF]), Static482.method6709(local46 << 24 | super.aClass66_Sub2_6.anInt3209, Static18.anIntArray203[super.anIntArray181[arg0] & 0xFFFF]), Static482.method6709(local65 << 24 | super.aClass66_Sub2_6.anInt3209, Static18.anIntArray203[super.anIntArray181[arg0] & 0xFFFF]));
					} else {
						this.aClass227_1.method4984(super.anIntArray161[local8], super.anIntArray161[local13], super.anIntArray161[local18], super.anIntArray166[local8], super.anIntArray166[local13], super.anIntArray166[local18], Static482.method6709(local27 << 24 | super.aClass66_Sub2_6.anInt3209, Static18.anIntArray203[super.anIntArray181[arg0] & 0xFFFF]), Static482.method6709(local46 << 24 | super.aClass66_Sub2_6.anInt3209, Static18.anIntArray203[super.anIntArray178[arg0] & 0xFFFF]), Static482.method6709(local65 << 24 | super.aClass66_Sub2_6.anInt3209, Static18.anIntArray203[super.anIntArray188[arg0] & 0xFFFF]));
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
				this.aClass227_1.anInt5884 = 0;
			} else {
				this.aClass227_1.anInt5884 = super.aByteArray20[arg0] & 0xFF;
			}
			this.aClass227_1.aBoolean437 = super.aBooleanArray9[arg0];
			if (super.aShortArray29 != null && super.aShortArray29[arg0] != -1) {
				if (super.aByteArray19 == null || super.aByteArray19[arg0] == -1) {
					local81 = local8;
					local309 = local13;
					local314 = local18;
				} else {
					local319 = super.aByteArray19[arg0] & 0xFF;
					local81 = super.anIntArray185[local319];
					local309 = super.anIntArray189[local319];
					local314 = super.anIntArray164[local319];
				}
				if (super.anIntArray188[arg0] == -1) {
					this.aClass227_1.method4986(super.anIntArray161[local8], super.anIntArray161[local13], super.anIntArray161[local18], super.anIntArray166[local8], super.anIntArray166[local13], super.anIntArray166[local18], super.aClass66_Sub2_6.anInt3209, local27, local46, local65, super.anIntArray181[arg0], super.anIntArray181[arg0], super.anIntArray181[arg0], super.anIntArray159[local81], super.anIntArray159[local309], super.anIntArray159[local314], super.anIntArray176[local81], super.anIntArray176[local309], super.anIntArray176[local314], super.anIntArray173[local81], super.anIntArray173[local309], super.anIntArray173[local314], super.aShortArray29[arg0]);
				} else {
					this.aClass227_1.method4986(super.anIntArray161[local8], super.anIntArray161[local13], super.anIntArray161[local18], super.anIntArray166[local8], super.anIntArray166[local13], super.anIntArray166[local18], super.aClass66_Sub2_6.anInt3209, local27, local46, local65, super.anIntArray181[arg0], super.anIntArray178[arg0], super.anIntArray188[arg0], super.anIntArray159[local81], super.anIntArray159[local309], super.anIntArray159[local314], super.anIntArray176[local81], super.anIntArray176[local309], super.anIntArray176[local314], super.anIntArray173[local81], super.anIntArray173[local309], super.anIntArray173[local314], super.aShortArray29[arg0]);
				}
			} else if (super.anIntArray188[arg0] == -1) {
				this.aClass227_1.method4984(super.anIntArray161[local8], super.anIntArray161[local13], super.anIntArray161[local18], super.anIntArray166[local8], super.anIntArray166[local13], super.anIntArray166[local18], Static482.method6709(local27 << 24 | super.aClass66_Sub2_6.anInt3209, Static18.anIntArray203[super.anIntArray181[arg0] & 0xFFFF]), Static482.method6709(local46 << 24 | super.aClass66_Sub2_6.anInt3209, Static18.anIntArray203[super.anIntArray181[arg0] & 0xFFFF]), Static482.method6709(local65 << 24 | super.aClass66_Sub2_6.anInt3209, Static18.anIntArray203[super.anIntArray181[arg0] & 0xFFFF]));
			} else {
				this.aClass227_1.method4984(super.anIntArray161[local8], super.anIntArray161[local13], super.anIntArray161[local18], super.anIntArray166[local8], super.anIntArray166[local13], super.anIntArray166[local18], Static482.method6709(local27 << 24 | super.aClass66_Sub2_6.anInt3209, Static18.anIntArray203[super.anIntArray181[arg0] & 0xFFFF]), Static482.method6709(local46 << 24 | super.aClass66_Sub2_6.anInt3209, Static18.anIntArray203[super.anIntArray178[arg0] & 0xFFFF]), Static482.method6709(local65 << 24 | super.aClass66_Sub2_6.anInt3209, Static18.anIntArray203[super.anIntArray188[arg0] & 0xFFFF]));
			}
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZZIIZI)V")
	@Override
	protected void method1176(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(12) int local12;
		if (arg3 + 2 > 2200) {
			local12 = Static415.method5946(arg3) + 1 - Static394.anInt1326;
			arg3 = (arg3 >> local12) + 2;
		} else {
			local12 = 0;
			arg3 += 2;
		}
		for (@Pc(24) int local24 = 0; local24 < 2200; local24++) {
			super.anIntArray157[local24] = 0;
		}
		@Pc(36) int local36 = 0;
		@Pc(41) int local41;
		if (super.lb != null) {
			local41 = 0;
			while (local41 < super.anInt1336) {
				@Pc(47) Class322 local47 = super.lb[local41];
				super.anIntArray174[local47.anInt8863] = local41++;
			}
		}
		@Pc(87) int local87;
		@Pc(92) int local92;
		@Pc(97) int local97;
		@Pc(113) int local113;
		@Pc(123) int local123;
		@Pc(128) int local128;
		@Pc(133) int local133;
		@Pc(138) int local138;
		@Pc(143) int local143;
		@Pc(148) int local148;
		@Pc(153) int local153;
		@Pc(193) int local193;
		for (local41 = 0; local41 < super.anInt1333; local41++) {
			if (super.anIntArray188[local41] != -2) {
				@Pc(72) short local72 = super.aShortArray25[local41];
				@Pc(77) short local77 = super.aShortArray26[local41];
				@Pc(82) short local82 = super.aShortArray28[local41];
				local87 = super.anIntArray166[local72];
				local92 = super.anIntArray166[local77];
				local97 = super.anIntArray166[local82];
				@Pc(118) int local118;
				if (arg0 && (local87 == -5000 || local92 == -5000 || local97 == -5000)) {
					local113 = super.anIntArray159[local72];
					local118 = super.anIntArray159[local77];
					local123 = super.anIntArray159[local82];
					local128 = super.anIntArray176[local72];
					local133 = super.anIntArray176[local77];
					local138 = super.anIntArray176[local82];
					local143 = super.anIntArray173[local72];
					local148 = super.anIntArray173[local77];
					local153 = super.anIntArray173[local82];
					@Pc(157) int local157 = local113 - local118;
					@Pc(161) int local161 = local123 - local118;
					@Pc(165) int local165 = local128 - local133;
					@Pc(169) int local169 = local138 - local133;
					@Pc(173) int local173 = local143 - local148;
					@Pc(177) int local177 = local153 - local148;
					@Pc(185) int local185 = local165 * local177 - local173 * local169;
					local193 = local173 * local161 - local157 * local177;
					@Pc(201) int local201 = local157 * local169 - local165 * local161;
					if (local118 * local185 + local133 * local193 + local148 * local201 > 0) {
						super.aBooleanArray8[local41] = true;
						@Pc(237) int local237 = (super.anIntArray187[local72] + super.anIntArray187[local77] + super.anIntArray187[local82]) / 3 >> local12;
						if (super.anIntArray157[local237] < 64) {
							super.anIntArrayArray30[local237][super.anIntArray157[local237]++] = local41;
						} else {
							@Pc(264) int local264 = super.anIntArray157[local237];
							if (local264 == 64) {
								if (local36 == 512) {
									continue;
								}
								super.anIntArray167[local36] = 0;
								super.anIntArray157[local237] = local264 = local36++ + 65;
							}
							local264 -= 65;
							super.anIntArrayArray26[local264][super.anIntArray167[local264]++] = local41;
						}
					}
				} else if (super.anIntArray174[local41] != -1 || (local87 - local92) * (super.anIntArray161[local82] - super.anIntArray161[local77]) - (super.anIntArray161[local72] - super.anIntArray161[local77]) * (local97 - local92) > 0) {
					super.aBooleanArray8[local41] = false;
					if (local87 >= 0 && local92 >= 0 && local97 >= 0 && local87 <= super.aClass94_5.anInt6901 && local92 <= super.aClass94_5.anInt6901 && local97 <= super.aClass94_5.anInt6901) {
						super.aBooleanArray9[local41] = false;
					} else {
						super.aBooleanArray9[local41] = true;
					}
					local113 = (super.anIntArray187[local72] + super.anIntArray187[local77] + super.anIntArray187[local82]) / 3 >> local12;
					if (super.anIntArray157[local113] < 64) {
						super.anIntArrayArray30[local113][super.anIntArray157[local113]++] = local41;
					} else {
						local118 = super.anIntArray157[local113];
						if (local118 == 64) {
							if (local36 == 512) {
								continue;
							}
							super.anIntArray167[local36] = 0;
							super.anIntArray157[local113] = local118 = local36++ + 65;
						}
						local118 -= 65;
						super.anIntArrayArray26[local118][super.anIntArray167[local118]++] = local41;
					}
				}
			}
		}
		@Pc(467) int local467;
		@Pc(477) int local477;
		@Pc(513) int local513;
		if (arg4) {
			for (local467 = 0; local467 < arg5; local467++) {
				local477 = super.anIntArray160[local467] - arg2 >> local12;
				if (local477 >= 0 && local477 < 2200) {
					if (super.anIntArray157[local477] < 64) {
						super.anIntArrayArray30[local477][super.anIntArray157[local477]++] = local467 + 1 << 16;
					} else {
						local513 = super.anIntArray157[local477];
						if (local513 == 64) {
							if (local36 == 512) {
								continue;
							}
							super.anIntArray167[local36] = 0;
							super.anIntArray157[local477] = local513 = local36++ + 65;
						}
						local513 -= 65;
						super.anIntArrayArray26[local513][super.anIntArray167[local513]++] = local467 + 1 << 16;
					}
				}
			}
		}
		if (super.aByteArray21 == null) {
			@Pc(593) int[] local593;
			if (!arg4 && super.lb == null) {
				if (arg1) {
					for (local467 = arg3 - 1; local467 >= 0; local467--) {
						local477 = super.anIntArray157[local467];
						if (local477 > 0) {
							local513 = local477 > 64 ? 64 : local477;
							local593 = super.anIntArrayArray30[local467];
							for (local92 = 0; local92 < local513; local92++) {
								this.method1179(local593[local92]);
							}
						}
						if (local477 > 64) {
							local513 = super.anIntArray157[local467] - 64 - 1;
							local593 = super.anIntArrayArray26[local513];
							for (local92 = 0; local92 < super.anIntArray167[local513]; local92++) {
								this.method1179(local593[local92]);
							}
						}
					}
				} else {
					for (local467 = arg3 - 1; local467 >= 0; local467--) {
						local477 = super.anIntArray157[local467];
						if (local477 > 0) {
							local513 = local477 > 64 ? 64 : local477;
							local593 = super.anIntArrayArray30[local467];
							for (local92 = 0; local92 < local513; local92++) {
								this.method1177(local593[local92]);
							}
						}
						if (local477 > 64) {
							local513 = super.anIntArray157[local467] - 64 - 1;
							local593 = super.anIntArrayArray26[local513];
							for (local92 = 0; local92 < super.anIntArray167[local513]; local92++) {
								this.method1177(local593[local92]);
							}
						}
					}
				}
			} else if (arg1) {
				for (local467 = arg3 - 1; local467 >= 0; local467--) {
					local477 = super.anIntArray157[local467];
					if (local477 > 0) {
						local513 = local477 > 64 ? 64 : local477;
						local593 = super.anIntArrayArray30[local467];
						for (local92 = 0; local92 < local513; local92++) {
							local97 = local593[local92];
							if (local97 < 65536) {
								local113 = super.anIntArray174[local97];
								if (local113 == -1 || !super.lb[local113].aBoolean612) {
									this.method1179(local97);
								}
							}
						}
					}
					if (local477 > 64) {
						local513 = super.anIntArray157[local467] - 64 - 1;
						local593 = super.anIntArrayArray26[local513];
						for (local92 = 0; local92 < super.anIntArray167[local513]; local92++) {
							local97 = local593[local92];
							if (local97 < 65536) {
								local113 = super.anIntArray174[local97];
								if (local113 == -1 || !super.lb[local113].aBoolean612) {
									this.method1179(local97);
								}
							}
						}
					}
				}
			} else {
				for (local467 = arg3 - 1; local467 >= 0; local467--) {
					local477 = super.anIntArray157[local467];
					@Pc(726) Class322 local726;
					@Pc(780) Class26_Sub1_Sub1 local780;
					@Pc(731) Class360 local731;
					if (local477 > 0) {
						local513 = local477 > 64 ? 64 : local477;
						local593 = super.anIntArrayArray30[local467];
						for (local92 = 0; local92 < local513; local92++) {
							local97 = local593[local92];
							if (local97 < 65536) {
								local113 = super.anIntArray174[local97];
								if (local113 == -1) {
									this.method1177(local593[local92]);
								} else {
									local726 = super.lb[local113];
									local731 = super.aClass360Array3[local113];
									if (!local726.aBoolean612) {
										this.method1177(local97);
									}
									super.aClass66_Sub2_6.method2964(local731.anInt9754, local731.anInt9765, local731.anInt9757, local731.anInt9769, local731.anInt9761, local731.anInt9768, local726.aShort109 & 0xFFFF, local731.anInt9758, local726.aByte99, local726.aByte100);
								}
							} else {
								local113 = (local97 >> 16) - 1;
								local780 = super.aClass26_Sub1_Sub1Array3[local113];
								local123 = super.anIntArray160[local113];
								if (local123 == 0) {
									local123 = 1;
								}
								super.aClass66_Sub2_6.method2956(local780, super.anIntArray162[local113], super.anIntArray183[local113], local123, (local780.anInt9222 * super.aClass66_Sub2_6.anInt3232 >> 12) / local123);
							}
						}
					}
					if (local477 > 64) {
						local513 = super.anIntArray157[local467] - 64 - 1;
						local593 = super.anIntArrayArray26[local513];
						for (local92 = 0; local92 < super.anIntArray167[local513]; local92++) {
							local97 = local593[local92];
							if (local97 < 65536) {
								local113 = super.anIntArray174[local97];
								if (local113 == -1) {
									this.method1177(local593[local92]);
								} else {
									local726 = super.lb[local113];
									local731 = super.aClass360Array3[local113];
									if (!local726.aBoolean612) {
										this.method1177(local97);
									}
									super.aClass66_Sub2_6.method2964(local731.anInt9754, local731.anInt9765, local731.anInt9757, local731.anInt9769, local731.anInt9761, local731.anInt9768, local726.aShort109 & 0xFFFF, local731.anInt9758, local726.aByte99, local726.aByte100);
								}
							} else {
								local113 = (local97 >> 16) - 1;
								local780 = super.aClass26_Sub1_Sub1Array3[local113];
								local123 = super.anIntArray160[local113];
								if (local123 == 0) {
									local123 = 1;
								}
								super.aClass66_Sub2_6.method2956(local780, super.anIntArray162[local113], super.anIntArray183[local113], local123, (local780.anInt9222 * super.aClass66_Sub2_6.anInt3232 >> 12) / local123);
							}
						}
					}
				}
			}
			return;
		}
		for (local467 = 0; local467 < 12; local467++) {
			super.anIntArray177[local467] = 0;
			super.anIntArray158[local467] = 0;
		}
		@Pc(1143) int[] local1143;
		@Pc(1158) byte local1158;
		if (arg4) {
			for (local477 = arg3 - 1; local477 >= 0; local477--) {
				local513 = super.anIntArray157[local477];
				if (local513 > 0) {
					if (local513 > 64) {
						local87 = 64;
					} else {
						local87 = local513;
					}
					local1143 = super.anIntArrayArray30[local477];
					for (local97 = 0; local97 < local87; local97++) {
						local113 = local1143[local97];
						if (local113 < 65536) {
							local1158 = super.aByteArray21[local113];
							local123 = super.anIntArray177[local1158]++;
							super.anIntArrayArray27[local1158][local123] = local113;
							if (local1158 < 10) {
								super.anIntArray158[local1158] += local477;
							} else if (local1158 == 10) {
								super.anIntArray165[local123] = local477;
							} else {
								super.anIntArray170[local123] = local477;
							}
						} else {
							local1158 = super.aClass26_Sub1_Sub1Array3[(local113 >> 16) - 1].aByte105;
							local123 = super.anIntArray177[local1158]++;
							super.anIntArrayArray27[local1158][local123] = local113;
							if (local1158 < 10) {
								super.anIntArray158[local1158] += local477;
							} else if (local1158 == 10) {
								super.anIntArray165[local123] = local477;
							} else {
								super.anIntArray170[local123] = local477;
							}
						}
					}
				}
				if (local513 > 64) {
					local87 = super.anIntArray157[local477] - 64 - 1;
					local1143 = super.anIntArrayArray26[local87];
					for (local97 = 0; local97 < super.anIntArray167[local87]; local97++) {
						local113 = local1143[local97];
						if (local113 < 65536) {
							local1158 = super.aByteArray21[local113];
							local123 = super.anIntArray177[local1158]++;
							super.anIntArrayArray27[local1158][local123] = local113;
							if (local1158 < 10) {
								super.anIntArray158[local1158] += local477;
							} else if (local1158 == 10) {
								super.anIntArray165[local123] = local477;
							} else {
								super.anIntArray170[local123] = local477;
							}
						} else {
							local1158 = super.aClass26_Sub1_Sub1Array3[(local113 >> 16) - 1].aByte105;
							local123 = super.anIntArray177[local1158]++;
							super.anIntArrayArray27[local1158][local123] = local113;
							if (local1158 < 10) {
								super.anIntArray158[local1158] += local477;
							} else if (local1158 == 10) {
								super.anIntArray165[local123] = local477;
							} else {
								super.anIntArray170[local123] = local477;
							}
						}
					}
				}
			}
		} else {
			for (local477 = arg3 - 1; local477 >= 0; local477--) {
				local513 = super.anIntArray157[local477];
				if (local513 > 0) {
					if (local513 > 64) {
						local87 = 64;
					} else {
						local87 = local513;
					}
					local1143 = super.anIntArrayArray30[local477];
					for (local97 = 0; local97 < local87; local97++) {
						local113 = local1143[local97];
						local1158 = super.aByteArray21[local113];
						local123 = super.anIntArray177[local1158]++;
						super.anIntArrayArray27[local1158][local123] = local113;
						if (local1158 < 10) {
							super.anIntArray158[local1158] += local477;
						} else if (local1158 == 10) {
							super.anIntArray165[local123] = local477;
						} else {
							super.anIntArray170[local123] = local477;
						}
					}
				}
				if (local513 > 64) {
					local87 = super.anIntArray157[local477] - 64 - 1;
					local1143 = super.anIntArrayArray26[local87];
					for (local97 = 0; local97 < super.anIntArray167[local87]; local97++) {
						local113 = local1143[local97];
						local1158 = super.aByteArray21[local113];
						local123 = super.anIntArray177[local1158]++;
						super.anIntArrayArray27[local1158][local123] = local113;
						if (local1158 < 10) {
							super.anIntArray158[local1158] += local477;
						} else if (local1158 == 10) {
							super.anIntArray165[local123] = local477;
						} else {
							super.anIntArray170[local123] = local477;
						}
					}
				}
			}
		}
		local477 = 0;
		if (super.anIntArray177[1] > 0 || super.anIntArray177[2] > 0) {
			local477 = (super.anIntArray158[1] + super.anIntArray158[2]) / (super.anIntArray177[1] + super.anIntArray177[2]);
		}
		local513 = 0;
		if (super.anIntArray177[3] > 0 || super.anIntArray177[4] > 0) {
			local513 = (super.anIntArray158[3] + super.anIntArray158[4]) / (super.anIntArray177[3] + super.anIntArray177[4]);
		}
		local87 = 0;
		if (super.anIntArray177[6] > 0 || super.anIntArray177[8] > 0) {
			local87 = (super.anIntArray158[6] + super.anIntArray158[8]) / (super.anIntArray177[6] + super.anIntArray177[8]);
		}
		local97 = 0;
		local113 = super.anIntArray177[10];
		@Pc(1673) int[] local1673 = super.anIntArrayArray27[10];
		@Pc(1676) int[] local1676 = super.anIntArray165;
		if (local113 == 0) {
			local97 = 0;
			local113 = super.anIntArray177[11];
			local1673 = super.anIntArrayArray27[11];
			local1676 = super.anIntArray170;
		}
		if (local113 > 0) {
			local92 = local1676[0];
		} else {
			local92 = -1000;
		}
		@Pc(1928) Class322 local1928;
		@Pc(1980) Class26_Sub1_Sub1 local1980;
		@Pc(1933) Class360 local1933;
		for (local128 = 0; local128 < 10; local128++) {
			if (arg1) {
				while (local128 == 0 && local92 > local477) {
					local133 = local1673[local97++];
					if (local133 < 65536) {
						local138 = super.anIntArray174[local133];
						if (local138 == -1 || !super.lb[local138].aBoolean612) {
							this.method1179(local133);
						}
					}
					if (local97 == local113 && local1673 != super.anIntArrayArray27[11]) {
						local97 = 0;
						local113 = super.anIntArray177[11];
						local1673 = super.anIntArrayArray27[11];
						local1676 = super.anIntArray170;
					}
					if (local97 < local113) {
						local92 = local1676[local97];
					} else {
						local92 = -1000;
					}
				}
				while (local128 == 3 && local92 > local513) {
					local133 = local1673[local97++];
					if (local133 < 65536) {
						local138 = super.anIntArray174[local133];
						if (local138 == -1 || !super.lb[local138].aBoolean612) {
							this.method1179(local133);
						}
					}
					if (local97 == local113 && local1673 != super.anIntArrayArray27[11]) {
						local97 = 0;
						local113 = super.anIntArray177[11];
						local1673 = super.anIntArrayArray27[11];
						local1676 = super.anIntArray170;
					}
					if (local97 < local113) {
						local92 = local1676[local97];
					} else {
						local92 = -1000;
					}
				}
				while (local128 == 5 && local92 > local87) {
					local133 = local1673[local97++];
					if (local133 < 65536) {
						local138 = super.anIntArray174[local133];
						if (local138 == -1 || !super.lb[local138].aBoolean612) {
							this.method1179(local133);
						}
					}
					if (local97 == local113 && local1673 != super.anIntArrayArray27[11]) {
						local97 = 0;
						local113 = super.anIntArray177[11];
						local1673 = super.anIntArrayArray27[11];
						local1676 = super.anIntArray170;
					}
					if (local97 < local113) {
						local92 = local1676[local97];
					} else {
						local92 = -1000;
					}
				}
			} else {
				while (local128 == 0 && local92 > local477) {
					local133 = local1673[local97++];
					if (local133 < 65536) {
						local138 = super.anIntArray174[local133];
						if (local138 == -1) {
							this.method1177(local133);
						} else {
							local1928 = super.lb[local138];
							local1933 = super.aClass360Array3[local138];
							if (!local1928.aBoolean612) {
								this.method1177(local133);
							}
							super.aClass66_Sub2_6.method2964(local1933.anInt9754, local1933.anInt9765, local1933.anInt9757, local1933.anInt9769, local1933.anInt9761, local1933.anInt9768, local1928.aShort109 & 0xFFFF, local1933.anInt9758, local1928.aByte99, local1928.aByte100);
						}
					} else {
						local138 = (local133 >> 16) - 1;
						local1980 = super.aClass26_Sub1_Sub1Array3[local138];
						local148 = super.anIntArray160[local138];
						if (local148 == 0) {
							local148 = 1;
						}
						super.aClass66_Sub2_6.method2956(local1980, super.anIntArray162[local138], super.anIntArray183[local138], local148, (local1980.anInt9222 * super.aClass66_Sub2_6.anInt3232 >> 12) / local148);
					}
					if (local97 == local113 && local1673 != super.anIntArrayArray27[11]) {
						local97 = 0;
						local113 = super.anIntArray177[11];
						local1673 = super.anIntArrayArray27[11];
						local1676 = super.anIntArray170;
					}
					if (local97 < local113) {
						local92 = local1676[local97];
					} else {
						local92 = -1000;
					}
				}
				while (local128 == 3 && local92 > local513) {
					local133 = local1673[local97++];
					if (local133 < 65536) {
						local138 = super.anIntArray174[local133];
						if (local138 == -1) {
							this.method1177(local133);
						} else {
							local1928 = super.lb[local138];
							local1933 = super.aClass360Array3[local138];
							if (!local1928.aBoolean612) {
								this.method1177(local133);
							}
							super.aClass66_Sub2_6.method2964(local1933.anInt9754, local1933.anInt9765, local1933.anInt9757, local1933.anInt9769, local1933.anInt9761, local1933.anInt9768, local1928.aShort109 & 0xFFFF, local1933.anInt9758, local1928.aByte99, local1928.aByte100);
						}
					} else {
						local138 = (local133 >> 16) - 1;
						local1980 = super.aClass26_Sub1_Sub1Array3[local138];
						local148 = super.anIntArray160[local138];
						if (local148 == 0) {
							local148 = 1;
						}
						super.aClass66_Sub2_6.method2956(local1980, super.anIntArray162[local138], super.anIntArray183[local138], local148, (local1980.anInt9222 * super.aClass66_Sub2_6.anInt3232 >> 12) / local148);
					}
					if (local97 == local113 && local1673 != super.anIntArrayArray27[11]) {
						local97 = 0;
						local113 = super.anIntArray177[11];
						local1673 = super.anIntArrayArray27[11];
						local1676 = super.anIntArray170;
					}
					if (local97 < local113) {
						local92 = local1676[local97];
					} else {
						local92 = -1000;
					}
				}
				while (local128 == 5 && local92 > local87) {
					local133 = local1673[local97++];
					if (local133 < 65536) {
						local138 = super.anIntArray174[local133];
						if (local138 == -1) {
							this.method1177(local133);
						} else {
							local1928 = super.lb[local138];
							local1933 = super.aClass360Array3[local138];
							if (!local1928.aBoolean612) {
								this.method1177(local133);
							}
							super.aClass66_Sub2_6.method2964(local1933.anInt9754, local1933.anInt9765, local1933.anInt9757, local1933.anInt9769, local1933.anInt9761, local1933.anInt9768, local1928.aShort109 & 0xFFFF, local1933.anInt9758, local1928.aByte99, local1928.aByte100);
						}
					} else {
						local138 = (local133 >> 16) - 1;
						local1980 = super.aClass26_Sub1_Sub1Array3[local138];
						local148 = super.anIntArray160[local138];
						if (local148 == 0) {
							local148 = 1;
						}
						super.aClass66_Sub2_6.method2956(local1980, super.anIntArray162[local138], super.anIntArray183[local138], local148, (local1980.anInt9222 * super.aClass66_Sub2_6.anInt3232 >> 12) / local148);
					}
					if (local97 == local113 && local1673 != super.anIntArrayArray27[11]) {
						local97 = 0;
						local113 = super.anIntArray177[11];
						local1673 = super.anIntArrayArray27[11];
						local1676 = super.anIntArray170;
					}
					if (local97 < local113) {
						local92 = local1676[local97];
					} else {
						local92 = -1000;
					}
				}
			}
			local133 = super.anIntArray177[local128];
			@Pc(2353) int[] local2353 = super.anIntArrayArray27[local128];
			if (!arg4 && super.lb == null) {
				if (arg1) {
					for (local143 = 0; local143 < local133; local143++) {
						this.method1179(local2353[local143]);
					}
				} else {
					for (local143 = 0; local143 < local133; local143++) {
						this.method1177(local2353[local143]);
					}
				}
			} else if (arg1) {
				for (local143 = 0; local143 < local133; local143++) {
					local148 = local2353[local143];
					if (local148 < 65536) {
						local153 = super.anIntArray174[local148];
						if (local153 == -1 || !super.lb[local153].aBoolean612) {
							this.method1179(local148);
						}
					}
				}
			} else {
				for (local143 = 0; local143 < local133; local143++) {
					local148 = local2353[local143];
					if (local148 < 65536) {
						local153 = super.anIntArray174[local148];
						if (local153 == -1) {
							this.method1177(local148);
						} else {
							@Pc(2415) Class322 local2415 = super.lb[local153];
							@Pc(2420) Class360 local2420 = super.aClass360Array3[local153];
							if (!local2415.aBoolean612) {
								this.method1177(local148);
							}
							super.aClass66_Sub2_6.method2964(local2420.anInt9754, local2420.anInt9765, local2420.anInt9757, local2420.anInt9769, local2420.anInt9761, local2420.anInt9768, local2415.aShort109 & 0xFFFF, local2420.anInt9758, local2415.aByte99, local2415.aByte100);
						}
					} else {
						local153 = (local148 >> 16) - 1;
						@Pc(2467) Class26_Sub1_Sub1 local2467 = super.aClass26_Sub1_Sub1Array3[local153];
						local193 = super.anIntArray160[local153];
						if (local193 == 0) {
							local193 = 1;
						}
						super.aClass66_Sub2_6.method2956(local2467, super.anIntArray162[local153], super.anIntArray183[local153], local193, (local2467.anInt9222 * super.aClass66_Sub2_6.anInt3232 >> 12) / local193);
					}
				}
			}
		}
		if (!arg4 && super.lb == null) {
			if (arg1) {
				while (local92 != -1000) {
					this.method1179(local1673[local97++]);
					if (local97 == local113 && local1673 != super.anIntArrayArray27[11]) {
						local97 = 0;
						local1673 = super.anIntArrayArray27[11];
						local113 = super.anIntArray177[11];
						local1676 = super.anIntArray170;
					}
					if (local97 < local113) {
						local92 = local1676[local97];
					} else {
						local92 = -1000;
					}
				}
			} else {
				while (local92 != -1000) {
					this.method1177(local1673[local97++]);
					if (local97 == local113 && local1673 != super.anIntArrayArray27[11]) {
						local97 = 0;
						local1673 = super.anIntArrayArray27[11];
						local113 = super.anIntArray177[11];
						local1676 = super.anIntArray170;
					}
					if (local97 < local113) {
						local92 = local1676[local97];
					} else {
						local92 = -1000;
					}
				}
			}
		} else if (arg1) {
			while (local92 != -1000) {
				local133 = local1673[local97++];
				if (local133 < 65536) {
					local138 = super.anIntArray174[local133];
					if (local138 == -1 || !super.lb[local138].aBoolean612) {
						this.method1179(local133);
					}
				}
				if (local97 == local113 && local1673 != super.anIntArrayArray27[11]) {
					local97 = 0;
					local1673 = super.anIntArrayArray27[11];
					local113 = super.anIntArray177[11];
					local1676 = super.anIntArray170;
				}
				if (local97 < local113) {
					local92 = local1676[local97];
				} else {
					local92 = -1000;
				}
			}
		} else {
			while (local92 != -1000) {
				local133 = local1673[local97++];
				if (local133 < 65536) {
					local138 = super.anIntArray174[local133];
					if (local138 == -1) {
						this.method1177(local133);
					} else {
						local1928 = super.lb[local138];
						local1933 = super.aClass360Array3[local138];
						if (!local1928.aBoolean612) {
							this.method1177(local133);
						}
						super.aClass66_Sub2_6.method2964(local1933.anInt9754, local1933.anInt9765, local1933.anInt9757, local1933.anInt9769, local1933.anInt9761, local1933.anInt9768, local1928.aShort109 & 0xFFFF, local1933.anInt9758, local1928.aByte99, local1928.aByte100);
					}
				} else {
					local138 = (local133 >> 16) - 1;
					local1980 = super.aClass26_Sub1_Sub1Array3[local138];
					local148 = super.anIntArray160[local138];
					if (local148 == 0) {
						local148 = 1;
					}
					super.aClass66_Sub2_6.method2956(local1980, super.anIntArray162[local138], super.anIntArray183[local138], local148, (local1980.anInt9222 * super.aClass66_Sub2_6.anInt3232 >> 12) / local148);
				}
				if (local97 == local113 && local1673 != super.anIntArrayArray27[11]) {
					local97 = 0;
					local1673 = super.anIntArrayArray27[11];
					local113 = super.anIntArray177[11];
					local1676 = super.anIntArray170;
				}
				if (local97 < local113) {
					local92 = local1676[local97];
				} else {
					local92 = -1000;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cl", name = "e", descriptor = "(I)V")
	private void method1180(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = super.aClass66_Sub2_6.anInt3206;
		@Pc(10) short local10 = super.aShortArray25[arg0];
		@Pc(15) short local15 = super.aShortArray26[arg0];
		@Pc(20) short local20 = super.aShortArray28[arg0];
		@Pc(25) int local25 = super.anIntArray173[local10];
		@Pc(30) int local30 = super.anIntArray173[local15];
		@Pc(35) int local35 = super.anIntArray173[local20];
		if (super.aByteArray20 == null) {
			this.aClass227_1.anInt5884 = 0;
		} else {
			this.aClass227_1.anInt5884 = super.aByteArray20[arg0] & 0xFF;
		}
		@Pc(88) int local88;
		@Pc(93) int local93;
		@Pc(100) int local100;
		@Pc(113) int local113;
		if (local25 >= local5) {
			super.anIntArray171[0] = super.anIntArray166[local10];
			super.anIntArray184[0] = super.anIntArray161[local10];
			local1++;
			super.anIntArray163[0] = super.anIntArray181[arg0] & 0xFFFF;
		} else {
			local88 = super.anIntArray159[local10];
			local93 = super.anIntArray176[local10];
			local100 = super.anIntArray181[arg0] & 0xFFFF;
			if (local35 >= local5) {
				local113 = (local5 - local25) * Class9_Sub1.anIntArray192[local35 - local25];
				super.anIntArray171[0] = super.aClass94_5.anInt6899 + (local88 + ((super.anIntArray159[local20] - local88) * local113 >> 16)) * super.aClass66_Sub2_6.anInt3232 / local5;
				super.anIntArray184[0] = super.aClass94_5.anInt6900 + (local93 + ((super.anIntArray176[local20] - local93) * local113 >> 16)) * super.aClass66_Sub2_6.anInt3226 / local5;
				local1++;
				super.anIntArray163[0] = local100 + (((super.anIntArray188[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
			if (local30 >= local5) {
				local113 = (local5 - local25) * Class9_Sub1.anIntArray192[local30 - local25];
				super.anIntArray171[local1] = super.aClass94_5.anInt6899 + (local88 + ((super.anIntArray159[local15] - local88) * local113 >> 16)) * super.aClass66_Sub2_6.anInt3232 / local5;
				super.anIntArray184[local1] = super.aClass94_5.anInt6900 + (local93 + ((super.anIntArray176[local15] - local93) * local113 >> 16)) * super.aClass66_Sub2_6.anInt3226 / local5;
				super.anIntArray163[local1++] = local100 + (((super.anIntArray178[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
		}
		if (local30 >= local5) {
			super.anIntArray171[local1] = super.anIntArray166[local15];
			super.anIntArray184[local1] = super.anIntArray161[local15];
			super.anIntArray163[local1++] = super.anIntArray178[arg0] & 0xFFFF;
		} else {
			local88 = super.anIntArray159[local15];
			local93 = super.anIntArray176[local15];
			local100 = super.anIntArray178[arg0] & 0xFFFF;
			if (local25 >= local5) {
				local113 = (local5 - local30) * Class9_Sub1.anIntArray192[local25 - local30];
				super.anIntArray171[local1] = super.aClass94_5.anInt6899 + (local88 + ((super.anIntArray159[local10] - local88) * local113 >> 16)) * super.aClass66_Sub2_6.anInt3232 / local5;
				super.anIntArray184[local1] = super.aClass94_5.anInt6900 + (local93 + ((super.anIntArray176[local10] - local93) * local113 >> 16)) * super.aClass66_Sub2_6.anInt3226 / local5;
				super.anIntArray163[local1++] = local100 + (((super.anIntArray181[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
			if (local35 >= local5) {
				local113 = (local5 - local30) * Class9_Sub1.anIntArray192[local35 - local30];
				super.anIntArray171[local1] = super.aClass94_5.anInt6899 + (local88 + ((super.anIntArray159[local20] - local88) * local113 >> 16)) * super.aClass66_Sub2_6.anInt3232 / local5;
				super.anIntArray184[local1] = super.aClass94_5.anInt6900 + (local93 + ((super.anIntArray176[local20] - local93) * local113 >> 16)) * super.aClass66_Sub2_6.anInt3226 / local5;
				super.anIntArray163[local1++] = local100 + (((super.anIntArray188[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
		}
		if (local35 >= local5) {
			super.anIntArray171[local1] = super.anIntArray166[local20];
			super.anIntArray184[local1] = super.anIntArray161[local20];
			super.anIntArray163[local1++] = super.anIntArray188[arg0] & 0xFFFF;
		} else {
			local88 = super.anIntArray159[local20];
			local93 = super.anIntArray176[local20];
			local100 = super.anIntArray188[arg0] & 0xFFFF;
			if (local30 >= local5) {
				local113 = (local5 - local35) * Class9_Sub1.anIntArray192[local30 - local35];
				super.anIntArray171[local1] = super.aClass94_5.anInt6899 + (local88 + ((super.anIntArray159[local15] - local88) * local113 >> 16)) * super.aClass66_Sub2_6.anInt3232 / local5;
				super.anIntArray184[local1] = super.aClass94_5.anInt6900 + (local93 + ((super.anIntArray176[local15] - local93) * local113 >> 16)) * super.aClass66_Sub2_6.anInt3226 / local5;
				super.anIntArray163[local1++] = local100 + (((super.anIntArray178[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
			if (local25 >= local5) {
				local113 = (local5 - local35) * Class9_Sub1.anIntArray192[local25 - local35];
				super.anIntArray171[local1] = super.aClass94_5.anInt6899 + (local88 + ((super.anIntArray159[local10] - local88) * local113 >> 16)) * super.aClass66_Sub2_6.anInt3232 / local5;
				super.anIntArray184[local1] = super.aClass94_5.anInt6900 + (local93 + ((super.anIntArray176[local10] - local93) * local113 >> 16)) * super.aClass66_Sub2_6.anInt3226 / local5;
				super.anIntArray163[local1++] = local100 + (((super.anIntArray181[arg0] & 0xFFFF) - local100) * local113 >> 16);
			}
		}
		local88 = super.anIntArray171[0];
		local93 = super.anIntArray171[1];
		local100 = super.anIntArray171[2];
		local113 = super.anIntArray184[0];
		@Pc(725) int local725 = super.anIntArray184[1];
		@Pc(730) int local730 = super.anIntArray184[2];
		this.aClass227_1.aBoolean437 = false;
		@Pc(838) int local838;
		@Pc(843) int local843;
		@Pc(848) int local848;
		@Pc(833) int local833;
		if (local1 == 3) {
			if (local88 < 0 || local93 < 0 || local100 < 0 || local88 > super.aClass94_5.anInt6901 || local93 > super.aClass94_5.anInt6901 || local100 > super.aClass94_5.anInt6901) {
				this.aClass227_1.aBoolean437 = true;
			}
			if (super.aShortArray29 != null && super.aShortArray29[arg0] != -1) {
				if (super.aByteArray19 == null || super.aByteArray19[arg0] == -1) {
					local838 = local10;
					local843 = local15;
					local848 = local20;
				} else {
					local833 = super.aByteArray19[arg0] & 0xFF;
					local838 = super.anIntArray185[local833];
					local843 = super.anIntArray189[local833];
					local848 = super.anIntArray164[local833];
				}
				if (super.anIntArray188[arg0] == -1) {
					this.aClass227_1.method4987(local113, local725, local730, local88, local93, local100, super.anIntArray181[arg0], super.anIntArray181[arg0], super.anIntArray181[arg0], super.anIntArray159[local838], super.anIntArray159[local843], super.anIntArray159[local848], super.anIntArray176[local838], super.anIntArray176[local843], super.anIntArray176[local848], super.anIntArray173[local838], super.anIntArray173[local843], super.anIntArray173[local848], super.aShortArray29[arg0]);
				} else {
					this.aClass227_1.method4987(local113, local725, local730, local88, local93, local100, super.anIntArray163[0], super.anIntArray163[1], super.anIntArray163[2], super.anIntArray159[local838], super.anIntArray159[local843], super.anIntArray159[local848], super.anIntArray176[local838], super.anIntArray176[local843], super.anIntArray176[local848], super.anIntArray173[local838], super.anIntArray173[local843], super.anIntArray173[local848], super.aShortArray29[arg0]);
				}
			} else if (super.anIntArray188[arg0] == -1) {
				this.aClass227_1.method4975(local113, local725, local730, local88, local93, local100, Static18.anIntArray203[super.anIntArray181[arg0] & 0xFFFF]);
			} else {
				this.aClass227_1.method4977(local113, local725, local730, local88, local93, local100, super.anIntArray163[0], super.anIntArray163[1], super.anIntArray163[2]);
			}
		}
		if (local1 != 4) {
			return;
		}
		if (local88 < 0 || local93 < 0 || local100 < 0 || local88 > super.aClass94_5.anInt6901 || local93 > super.aClass94_5.anInt6901 || local100 > super.aClass94_5.anInt6901 || super.anIntArray171[3] < 0 || super.anIntArray171[3] > super.aClass94_5.anInt6901) {
			this.aClass227_1.aBoolean437 = true;
		}
		if (super.aShortArray29 == null || super.aShortArray29[arg0] == -1) {
			if (super.anIntArray188[arg0] == -1) {
				local838 = Static18.anIntArray203[super.anIntArray181[arg0] & 0xFFFF];
				this.aClass227_1.method4975(local113, local725, local730, local88, local93, local100, local838);
				this.aClass227_1.method4975(local113, local730, super.anIntArray184[3], local88, local100, super.anIntArray171[3], local838);
				return;
			}
			this.aClass227_1.method4977(local113, local725, local730, local88, local93, local100, super.anIntArray163[0], super.anIntArray163[1], super.anIntArray163[2]);
			this.aClass227_1.method4977(local113, local730, super.anIntArray184[3], local88, local100, super.anIntArray171[3], super.anIntArray163[0], super.anIntArray163[2], super.anIntArray163[3]);
			return;
		}
		if (super.aByteArray19 == null || super.aByteArray19[arg0] == -1) {
			local838 = local10;
			local843 = local15;
			local848 = local20;
		} else {
			local833 = super.aByteArray19[arg0] & 0xFF;
			local838 = super.anIntArray185[local833];
			local843 = super.anIntArray189[local833];
			local848 = super.anIntArray164[local833];
		}
		@Pc(1168) short local1168 = super.aShortArray29[arg0];
		if (super.anIntArray188[arg0] == -1) {
			this.aClass227_1.method4987(local113, local725, local730, local88, local93, local100, super.anIntArray181[arg0], super.anIntArray181[arg0], super.anIntArray181[arg0], super.anIntArray159[local838], super.anIntArray159[local843], super.anIntArray159[local848], super.anIntArray176[local838], super.anIntArray176[local843], super.anIntArray176[local848], super.anIntArray173[local838], super.anIntArray173[local843], super.anIntArray173[local848], local1168);
			this.aClass227_1.method4987(local113, local730, super.anIntArray184[3], local88, local100, super.anIntArray171[3], super.anIntArray181[arg0], super.anIntArray181[arg0], super.anIntArray181[arg0], super.anIntArray159[local838], super.anIntArray159[local843], super.anIntArray159[local848], super.anIntArray176[local838], super.anIntArray176[local843], super.anIntArray176[local848], super.anIntArray173[local838], super.anIntArray173[local843], super.anIntArray173[local848], local1168);
			return;
		}
		this.aClass227_1.method4987(local113, local725, local730, local88, local93, local100, super.anIntArray163[0], super.anIntArray163[1], super.anIntArray163[2], super.anIntArray159[local838], super.anIntArray159[local843], super.anIntArray159[local848], super.anIntArray176[local838], super.anIntArray176[local843], super.anIntArray176[local848], super.anIntArray173[local838], super.anIntArray173[local843], super.anIntArray173[local848], local1168);
		this.aClass227_1.method4987(local113, local730, super.anIntArray184[3], local88, local100, super.anIntArray171[3], super.anIntArray163[0], super.anIntArray163[2], super.anIntArray163[3], super.anIntArray159[local838], super.anIntArray159[local843], super.anIntArray159[local848], super.anIntArray176[local838], super.anIntArray176[local843], super.anIntArray176[local848], super.anIntArray173[local838], super.anIntArray173[local843], super.anIntArray173[local848], local1168);
	}

	@OriginalMember(owner = "client!cl", name = "r", descriptor = "()V")
	@Override
	protected void method1175() {
		this.aClass227_1 = null;
	}

	@OriginalMember(owner = "client!cl", name = "j", descriptor = "()V")
	@Override
	protected void method1160() {
		super.aClass94_5.anInt6901 = this.aClass227_1.anInt5883;
		super.aClass94_5.anInt6899 = this.aClass227_1.anInt5887;
		super.aClass94_5.anInt6900 = this.aClass227_1.anInt5882;
	}
}
