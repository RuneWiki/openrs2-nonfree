import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public final class Class11_Sub1_Sub3_Sub1 extends Class11_Sub1_Sub3 {

	@OriginalMember(owner = "client!et", name = "Rc", descriptor = "Lclient!wr;")
	public Class272 aClass272_1;

	@OriginalMember(owner = "client!et", name = "Lc", descriptor = "I")
	public int anInt1603 = -1;

	@OriginalMember(owner = "client!et", name = "Tc", descriptor = "I")
	public int anInt1610 = -1;

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(I)I")
	@Override
	public int method2636() {
		if (this.aClass272_1.anIntArray543 != null) {
			@Pc(20) Class272 local20 = this.aClass272_1.method5900(Static32.aClass4_1);
			if (local20 != null && local20.anInt7308 != -1) {
				return local20.anInt7308;
			}
		}
		return this.aClass272_1.anInt7308;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(ILclient!za;I)Z")
	private boolean method1297(@OriginalArg(0) int arg0, @OriginalArg(1) Class117 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class164 local11 = this.method2640();
		@Pc(28) Class64 local28 = super.anInt3302 != -1 && super.anInt3337 == 0 ? Static402.aClass37_2.method665(super.anInt3302) : null;
		@Pc(48) Class64 local48 = super.anInt3317 == -1 || super.aBoolean322 && local28 != null ? null : Static402.aClass37_2.method665(super.anInt3317);
		@Pc(51) int local51 = local11.anInt4601;
		@Pc(54) int local54 = local11.anInt4623;
		if (local51 != 0 || local54 != 0 || local11.anInt4597 != 0 || local11.anInt4637 != 0) {
			arg0 |= 0x7;
		}
		@Pc(94) boolean local94 = super.aByte57 != 0 && Static98.anInt1304 >= super.anInt3326 && super.anInt3321 > Static98.anInt1304;
		if (local94) {
			arg0 |= 0x80000;
		}
		@Pc(133) Class8 local133 = super.aClass8Array3[0] = this.aClass272_1.method5908(arg0, Static32.aClass4_1, super.anInt3280, super.anInt3296, arg1, super.anInt3268, super.anInt3307, local28, super.anInt3298, super.anInt3275, local48, super.aClass9Array3, Static106.aClass199_131, Static402.aClass37_2);
		if (local133 == null) {
			return false;
		}
		super.anInt3319 = local133.B();
		this.method2643(local133);
		@Pc(150) int local150 = super.aClass41_7.method704();
		if (local51 == 0 && local54 == 0) {
			this.method2634(this.method2635() << 7, local150, 0, this.method2635() << 7, 0);
		} else {
			this.method2634(local51, local150, local11.anInt4639, local54, local11.anInt4615);
			if (super.anInt3290 != 0) {
				super.aClass8Array3[0].W(super.anInt3290);
			}
			if (super.anInt3331 != 0) {
				super.aClass8Array3[0].K(super.anInt3331);
			}
			if (super.anInt3286 != 0) {
				super.aClass8Array3[0].a(0, super.anInt3286, 0);
			}
		}
		if (local94) {
			local133.method5982(super.aByte56, super.aByte55, super.aByte54, super.aByte57 & 0xFF);
		}
		@Pc(261) Class121 local261;
		@Pc(281) boolean local281;
		@Pc(283) int local283;
		@Pc(323) Class8 local323;
		if (super.anInt3266 == -1 || super.anInt3338 == -1) {
			super.aClass8Array3[1] = null;
		} else {
			local261 = Static46.aClass123_5.method2677(super.anInt3266);
			local281 = local261.aByte51 == 3 && (local51 != 0 || local54 != 0);
			local283 = local7;
			if (local281) {
				local283 = local7 | 0x7;
			} else {
				if (super.anInt3271 != 0) {
					local283 = local7 | 0x5;
				}
				if (super.anInt3325 != 0) {
					local283 |= 0x2;
				}
			}
			local323 = super.aClass8Array3[1] = local261.method2598(super.anInt3267, arg1, super.anInt3338, local283, super.anInt3300, Static402.aClass37_2);
			if (local323 != null) {
				if (super.anInt3325 != 0) {
					local323.a(0, -super.anInt3325 << 0, 0);
				}
				if (super.anInt3271 != 0) {
					local323.ma(super.anInt3271 * 2048);
				}
				if (local281) {
					if (super.anInt3290 != 0) {
						local323.W(super.anInt3290);
					}
					if (super.anInt3331 != 0) {
						local323.K(super.anInt3331);
					}
					if (super.anInt3286 != 0) {
						local323.a(0, super.anInt3286, 0);
					}
				}
			}
		}
		if (super.anInt3328 == -1 || super.anInt3304 == -1) {
			super.aClass8Array3[3] = null;
		} else {
			local261 = Static46.aClass123_5.method2677(super.anInt3328);
			local281 = local261.aByte51 == 3 && (local51 != 0 || local54 != 0);
			local283 = local7;
			if (local281) {
				local283 = local7 | 0x7;
			} else {
				if (super.anInt3340 != 0) {
					local283 = local7 | 0x5;
				}
				if (super.anInt3270 != 0) {
					local283 |= 0x2;
				}
			}
			local323 = super.aClass8Array3[3] = local261.method2601(super.anInt3303, super.anInt3323, super.anInt3304, arg1, Static402.aClass37_2, local283);
			if (local323 != null) {
				if (super.anInt3270 != 0) {
					local323.a(0, -super.anInt3270 << 0, 0);
				}
				if (super.anInt3340 != 0) {
					local323.ma(super.anInt3340 * 2048);
				}
				if (local281) {
					if (super.anInt3290 != 0) {
						local323.W(super.anInt3290);
					}
					if (super.anInt3331 != 0) {
						local323.K(super.anInt3331);
					}
					if (super.anInt3286 != 0) {
						local323.a(0, super.anInt3286, 0);
					}
				}
			}
		}
		super.aClass8Array3[2] = null;
		if (super.aClass1_Sub24_3 != null) {
			if (Static98.anInt1304 >= super.aClass1_Sub24_3.anInt3675) {
				super.aClass1_Sub24_3 = null;
			} else if (Static98.anInt1304 >= super.aClass1_Sub24_3.anInt3674) {
				@Pc(553) Class8 local553 = super.aClass1_Sub24_3.method2870(local7 | 0x7, arg1);
				if (local553 != null) {
					local553.a(-super.anInt6428 + super.aClass1_Sub24_3.anInt3673, super.aClass1_Sub24_3.anInt3672 - super.anInt6437, -super.anInt6430 + super.aClass1_Sub24_3.anInt3679);
					if (local150 != 0) {
						local553.ma(local150);
					}
					super.aClass8Array3[2] = local553;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!et", name = "e", descriptor = "(Z)I")
	@Override
	public int method2638() {
		if (this.aClass272_1.anIntArray543 != null) {
			@Pc(18) Class272 local18 = this.aClass272_1.method5900(Static32.aClass4_1);
			if (local18 != null && local18.anInt7345 != -1) {
				return local18.anInt7345;
			}
		}
		return this.aClass272_1.anInt7345 == -1 ? super.method2638() : this.aClass272_1.anInt7345;
	}

	@OriginalMember(owner = "client!et", name = "c", descriptor = "(B)I")
	@Override
	public int method5184() {
		return super.anInt3319;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IILclient!za;I)Z")
	@Override
	public boolean method5180(@OriginalArg(1) int arg0, @OriginalArg(2) Class117 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass272_1 == null || !this.method1297(131072, arg1)) {
			return false;
		}
		@Pc(21) Class34 local21 = arg1.method5685();
		@Pc(26) int local26 = super.aClass41_7.method704();
		local21.ca(local26);
		local21.W(super.anInt6428, super.anInt6437, super.anInt6430);
		@Pc(39) boolean local39 = false;
		for (@Pc(41) int local41 = 0; super.aClass8Array3.length > local41; local41++) {
			if (super.aClass8Array3[local41] != null && super.aClass8Array3[local41].method5985(arg0, arg2, local21, this.aClass272_1.anInt7346 == 1)) {
				local39 = true;
				break;
			}
		}
		super.aClass8Array3[0] = super.aClass8Array3[1] = super.aClass8Array3[2] = super.aClass8Array3[3] = null;
		return local39;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IIZIII)V")
	public void method1299(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		super.aByte90 = (byte) arg2;
		if (super.anInt3302 != -1 && Static402.aClass37_2.method665(super.anInt3302).anInt1189 == 1) {
			super.anInt3302 = -1;
		}
		@Pc(48) Class121 local48;
		if (super.anInt3266 != -1) {
			local48 = Static46.aClass123_5.method2677(super.anInt3266);
			if (local48.aBoolean319 && local48.anInt3204 != -1 && Static402.aClass37_2.method665(local48.anInt3204).anInt1189 == 1) {
				super.anInt3266 = -1;
			}
		}
		if (super.anInt3328 != -1) {
			local48 = Static46.aClass123_5.method2677(super.anInt3328);
			if (local48.aBoolean319 && local48.anInt3204 != -1 && Static402.aClass37_2.method665(local48.anInt3204).anInt1189 == 1) {
				super.anInt3328 = -1;
			}
		}
		if (!arg1) {
			@Pc(108) int local108 = arg4 - super.anIntArray246[0];
			@Pc(116) int local116 = arg0 - super.anIntArray247[0];
			if (local108 >= -8 && local108 <= 8 && local116 >= -8 && local116 <= 8) {
				if (super.anInt3342 < 9) {
					super.anInt3342++;
				}
				for (@Pc(149) int local149 = super.anInt3342; local149 > 0; local149--) {
					super.anIntArray246[local149] = super.anIntArray246[local149 - 1];
					super.anIntArray247[local149] = super.anIntArray247[local149 - 1];
					super.aByteArray35[local149] = super.aByteArray35[local149 - 1];
				}
				super.anIntArray246[0] = arg4;
				super.aByteArray35[0] = 1;
				super.anIntArray247[0] = arg0;
				return;
			}
		}
		super.anInt3344 = 0;
		super.anIntArray246[0] = arg4;
		super.anInt3342 = 0;
		super.anInt3345 = 0;
		super.anIntArray247[0] = arg0;
		super.anInt6430 = (arg3 << 6) + (super.anIntArray247[0] << 7);
		super.anInt6428 = (arg3 << 6) + (super.anIntArray246[0] << 7);
		if (super.aClass111_Sub4_3 != null) {
			super.aClass111_Sub4_3.method3418();
		}
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(Lclient!za;B)Lclient!kf;")
	@Override
	public Class111_Sub3 method5181(@OriginalArg(0) Class117 arg0) {
		if (this.aClass272_1 == null || !this.method1297(2048, arg0)) {
			return null;
		}
		@Pc(17) Class34 local17 = arg0.method5685();
		@Pc(27) int local27 = super.aClass41_7.method704();
		local17.ca(local27);
		local17.W(super.anInt6428, super.anInt6437, super.anInt6430);
		@Pc(42) Class164 local42 = this.method2640();
		@Pc(55) Class272 local55 = this.aClass272_1.anIntArray543 == null ? this.aClass272_1 : this.aClass272_1.method5900(Static32.aClass4_1);
		if (Static126.aClass19_Sub1_1.aBoolean381 && local55.aBoolean634 && local42.aBoolean416) {
			@Pc(80) Class64 local80 = super.anInt3302 != -1 && super.anInt3337 == 0 ? Static402.aClass37_2.method665(super.anInt3302) : null;
			@Pc(97) Class64 local97 = super.anInt3317 == -1 || super.aBoolean322 && local80 != null ? null : Static402.aClass37_2.method665(super.anInt3317);
			@Pc(99) int local99 = 0;
			if (super.anInt3313 != 0) {
				local99 = this.method2628();
			}
			@Pc(160) Class8 local160 = Static92.method3331(this.aClass272_1.aByte103 & 0xFF, local27, super.anInt3290, local97 == null ? local80 : local97, this.aClass272_1.aByte104 & 0xFF, this.aClass272_1.aShort116 & 0xFFFF, arg0, local99, super.anInt3331, local97 == null ? super.anInt3296 : super.anInt3298, super.anInt3286, super.aClass8Array3[0], this.aClass272_1.anInt7346, this.aClass272_1.aShort115 & 0xFFFF);
			if (local160 != null) {
				@Pc(165) float local165 = arg0.T();
				@Pc(168) float local168 = arg0.aa();
				arg0.method5677(false);
				arg0.da(local165, local168 - 150.0F);
				local160.method5987(local17, null, 0);
				arg0.da(local165, local168);
				arg0.method5677(true);
			}
		}
		@Pc(191) Class111_Sub3 local191 = null;
		if (this.method1304()) {
			local191 = Static238.method3398(super.aClass8Array3.length);
		}
		if (super.aClass111_Sub4_3 == null) {
			arg0.method5723(super.aClass8Array3, local17, local191 == null ? null : local191.aClass111_Sub8Array1, 0);
		} else {
			@Pc(208) Class232 local208 = super.aClass111_Sub4_3.method3422();
			arg0.method5673(super.aClass8Array3, local208, local17, local191 == null ? null : local191.aClass111_Sub8Array1, 0);
		}
		this.method2629(super.aClass8Array3, arg0, false);
		if (super.aClass8Array3[2] != null) {
			if (local27 != 0) {
				super.aClass8Array3[2].ma(local27);
			}
			super.aClass8Array3[2].a(super.anInt6428 - super.aClass1_Sub24_3.anInt3673, super.anInt6437 - super.aClass1_Sub24_3.anInt3672, -super.aClass1_Sub24_3.anInt3679 + super.anInt6430);
		}
		super.aClass8Array3[0] = super.aClass8Array3[1] = super.aClass8Array3[2] = super.aClass8Array3[3] = null;
		super.anInt3276 = Static330.anInt5429;
		return local191;
	}

	@OriginalMember(owner = "client!et", name = "c", descriptor = "(I)Z")
	public boolean method1300() {
		return this.aClass272_1 != null;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!wr;Z)V")
	public void method1303(@OriginalArg(0) Class272 arg0) {
		this.aClass272_1 = arg0;
		if (super.aClass111_Sub4_3 != null) {
			super.aClass111_Sub4_3.method3418();
		}
	}

	@OriginalMember(owner = "client!et", name = "g", descriptor = "(I)Z")
	private boolean method1304() {
		return this.aClass272_1.aBoolean638;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5182(@OriginalArg(0) Class117 arg0) {
		if (this.aClass272_1 != null && (super.aBoolean325 || this.method1297(0, arg0))) {
			this.method2629(super.aClass8Array3, arg0, super.aBoolean325);
			super.aClass8Array3[0] = super.aClass8Array3[1] = super.aClass8Array3[2] = super.aClass8Array3[3] = null;
		}
	}

	@OriginalMember(owner = "client!et", name = "d", descriptor = "(B)I")
	@Override
	protected int method2639() {
		if (this.aClass272_1.anIntArray543 != null) {
			@Pc(21) Class272 local21 = this.aClass272_1.method5900(Static32.aClass4_1);
			if (local21 != null && local21.anInt7309 != -1) {
				return local21.anInt7309;
			}
		}
		return this.aClass272_1.anInt7309;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(ILclient!za;ILclient!ge;IZI)V")
	@Override
	public void method5179(@OriginalArg(1) Class117 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class11 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IIB)V")
	public void method1306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = super.anIntArray246[0];
		@Pc(15) int local15 = super.anIntArray247[0];
		if (arg0 == 0) {
			local15++;
		}
		if (arg0 == 1) {
			local10++;
			local15++;
		}
		if (arg0 == 2) {
			local10++;
		}
		if (arg0 == 3) {
			local15--;
			local10++;
		}
		if (arg0 == 4) {
			local15--;
		}
		if (arg0 == 5) {
			local10--;
			local15--;
		}
		if (arg0 == 6) {
			local10--;
		}
		if (super.anInt3302 != -1 && Static402.aClass37_2.method665(super.anInt3302).anInt1189 == 1) {
			super.anInt3302 = -1;
		}
		if (arg0 == 7) {
			local15++;
			local10--;
		}
		@Pc(88) Class121 local88;
		if (super.anInt3266 != -1) {
			local88 = Static46.aClass123_5.method2677(super.anInt3266);
			if (local88.aBoolean319 && local88.anInt3204 != -1 && Static402.aClass37_2.method665(local88.anInt3204).anInt1189 == 1) {
				super.anInt3266 = -1;
			}
		}
		if (super.anInt3328 != -1) {
			local88 = Static46.aClass123_5.method2677(super.anInt3328);
			if (local88.aBoolean319 && local88.anInt3204 != -1 && Static402.aClass37_2.method665(local88.anInt3204).anInt1189 == 1) {
				super.anInt3328 = -1;
			}
		}
		if (super.anInt3342 < 9) {
			super.anInt3342++;
		}
		for (@Pc(157) int local157 = super.anInt3342; local157 > 0; local157--) {
			super.anIntArray246[local157] = super.anIntArray246[local157 - 1];
			super.anIntArray247[local157] = super.anIntArray247[local157 - 1];
			super.aByteArray35[local157] = super.aByteArray35[local157 - 1];
		}
		super.anIntArray246[0] = local10;
		super.anIntArray247[0] = local15;
		super.aByteArray35[0] = (byte) arg1;
	}

	@OriginalMember(owner = "client!et", name = "e", descriptor = "(I)V")
	@Override
	public void method5177() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5183() {
		return false;
	}
}
