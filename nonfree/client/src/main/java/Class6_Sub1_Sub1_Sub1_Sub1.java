import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class6_Sub1_Sub1_Sub1_Sub1 extends Class6_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!ac", name = "Uc", descriptor = "Lclient!du;")
	public Class86 aClass86_1;

	@OriginalMember(owner = "client!ac", name = "Rc", descriptor = "I")
	public int anInt269 = -1;

	@OriginalMember(owner = "client!ac", name = "bd", descriptor = "I")
	public int anInt277 = -1;

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(ZLclient!r;)V")
	@Override
	public void method7323(@OriginalArg(1) Class100 arg0) {
		if (this.aClass86_1 == null || !super.aBoolean572 && !this.method158(arg0, 0)) {
			return;
		}
		@Pc(20) Class68 local20 = arg0.method6222();
		local20.o(super.aClass186_7.method4106());
		local20.U(super.anInt8761, super.anInt8759 - 20, super.anInt8764);
		this.method6162(local20, super.aBoolean572, arg0, super.aClass66Array3);
		super.aClass66Array3[0] = super.aClass66Array3[1] = super.aClass66Array3[2] = null;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)I")
	@Override
	protected int method6155() {
		if (this.aClass86_1.anIntArray136 != null) {
			@Pc(18) Class86 local18 = this.aClass86_1.method1567(Static70.aClass78_1);
			if (local18 != null && local18.anInt2141 != -1) {
				return local18.anInt2141;
			}
		}
		return this.aClass86_1.anInt2141;
	}

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "(B)Z")
	private boolean method151() {
		return this.aClass86_1.aBoolean192;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!r;I)Lclient!sd;")
	@Override
	public Class297 method7326(@OriginalArg(0) Class100 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZIBLclient!r;Lclient!lo;II)V")
	@Override
	public void method7325(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class100 arg2, @OriginalArg(4) Class6_Sub1 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "(B)Z")
	@Override
	public boolean method7330() {
		return false;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZIBIII)V")
	public void method152(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		super.aByte112 = super.aByte111 = (byte) arg3;
		if (Static551.method7475(arg1, arg4)) {
			super.aByte111++;
		}
		if (super.anInt7370 != -1 && Static116.aClass140_2.method3287(super.anInt7370).anInt2059 == 1) {
			super.anInt7370 = -1;
			super.anIntArray507 = null;
		}
		@Pc(52) Class167 local52;
		if (super.anInt7368 != -1) {
			local52 = Static215.aClass33_1.method587(super.anInt7368);
			if (local52.aBoolean352 && local52.anInt4374 != -1 && Static116.aClass140_2.method3287(local52.anInt4374).anInt2059 == 1) {
				super.anInt7368 = -1;
			}
		}
		if (super.anInt7356 != -1) {
			local52 = Static215.aClass33_1.method587(super.anInt7356);
			if (local52.aBoolean352 && local52.anInt4374 != -1 && Static116.aClass140_2.method3287(local52.anInt4374).anInt2059 == 1) {
				super.anInt7356 = -1;
			}
		}
		if (!arg0) {
			@Pc(109) int local109 = arg4 - super.anIntArray510[0];
			@Pc(117) int local117 = arg1 - super.anIntArray509[0];
			if (local109 >= -8 && local109 <= 8 && local117 >= -8 && local117 <= 8) {
				if (super.anInt7424 < 9) {
					super.anInt7424++;
				}
				for (@Pc(146) int local146 = super.anInt7424; local146 > 0; local146--) {
					super.anIntArray510[local146] = super.anIntArray510[local146 - 1];
					super.anIntArray509[local146] = super.anIntArray509[local146 - 1];
					super.aByteArray73[local146] = super.aByteArray73[local146 - 1];
				}
				super.anIntArray510[0] = arg4;
				super.anIntArray509[0] = arg1;
				super.aByteArray73[0] = 1;
				return;
			}
		}
		super.anInt7423 = 0;
		super.anInt7424 = 0;
		super.anIntArray510[0] = arg4;
		super.anInt7421 = 0;
		super.anIntArray509[0] = arg1;
		super.anInt8761 = (arg2 << 8) + (super.anIntArray510[0] << 9);
		super.anInt8764 = (super.anIntArray509[0] << 9) + (arg2 << 8);
		if (super.aClass6_Sub8_7 != null) {
			super.aClass6_Sub8_7.method7152();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)I")
	@Override
	public int method6158() {
		if (this.aClass86_1.anIntArray136 != null) {
			@Pc(22) Class86 local22 = this.aClass86_1.method1567(Static70.aClass78_1);
			if (local22 != null && local22.anInt2132 != -1) {
				return local22.anInt2132;
			}
		}
		return this.aClass86_1.anInt2132;
	}

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "(I)Z")
	public boolean method155() {
		return this.aClass86_1 != null;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIB)V")
	public void method156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = super.anIntArray510[0];
		@Pc(21) int local21 = super.anIntArray509[0];
		if (arg0 == 0) {
			local21++;
		}
		if (arg0 == 1) {
			local21++;
			local16++;
		}
		if (arg0 == 2) {
			local16++;
		}
		if (arg0 == 3) {
			local16++;
			local21--;
		}
		if (arg0 == 4) {
			local21--;
		}
		if (arg0 == 5) {
			local16--;
			local21--;
		}
		if (arg0 == 6) {
			local16--;
		}
		if (super.anInt7370 != -1 && Static116.aClass140_2.method3287(super.anInt7370).anInt2059 == 1) {
			super.anInt7370 = -1;
			super.anIntArray507 = null;
		}
		if (arg0 == 7) {
			local16--;
			local21++;
		}
		@Pc(97) Class167 local97;
		if (super.anInt7368 != -1) {
			local97 = Static215.aClass33_1.method587(super.anInt7368);
			if (local97.aBoolean352 && local97.anInt4374 != -1 && Static116.aClass140_2.method3287(local97.anInt4374).anInt2059 == 1) {
				super.anInt7368 = -1;
			}
		}
		if (super.anInt7356 != -1) {
			local97 = Static215.aClass33_1.method587(super.anInt7356);
			if (local97.aBoolean352 && local97.anInt4374 != -1 && Static116.aClass140_2.method3287(local97.anInt4374).anInt2059 == 1) {
				super.anInt7356 = -1;
			}
		}
		if (super.anInt7424 < 9) {
			super.anInt7424++;
		}
		for (@Pc(162) int local162 = super.anInt7424; local162 > 0; local162--) {
			super.anIntArray510[local162] = super.anIntArray510[local162 - 1];
			super.anIntArray509[local162] = super.anIntArray509[local162 - 1];
			super.aByteArray73[local162] = super.aByteArray73[local162 - 1];
		}
		super.anIntArray510[0] = local16;
		super.anIntArray509[0] = local21;
		super.aByteArray73[0] = (byte) arg1;
	}

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "(I)I")
	@Override
	public int method6167() {
		if (this.aClass86_1.anIntArray136 != null) {
			@Pc(19) Class86 local19 = this.aClass86_1.method1567(Static70.aClass78_1);
			if (local19 != null && local19.anInt2168 != -1) {
				return local19.anInt2168;
			}
		}
		return this.aClass86_1.anInt2168 == -1 ? super.method6167() : this.aClass86_1.anInt2168;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILclient!r;I)Z")
	private boolean method158(@OriginalArg(1) Class100 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class54 local11 = this.method6168();
		@Pc(30) Class84 local30 = super.anInt7370 != -1 && super.anInt7406 == 0 ? Static116.aClass140_2.method3287(super.anInt7370) : null;
		@Pc(50) Class84 local50 = super.anInt7419 == -1 || super.aBoolean569 && local30 != null ? null : Static116.aClass140_2.method3287(super.anInt7419);
		@Pc(53) int local53 = local11.anInt1388;
		@Pc(56) int local56 = local11.anInt1422;
		if (local53 != 0 || local56 != 0 || local11.anInt1414 != 0 || local11.anInt1403 != 0) {
			arg1 |= 0x7;
		}
		@Pc(98) boolean local98 = super.aByte101 != 0 && Static412.anInt575 >= super.anInt7417 && Static412.anInt575 < super.anInt7373;
		if (local98) {
			arg1 |= 0x80000;
		}
		@Pc(141) Class66 local141 = super.aClass66Array3[0] = this.aClass86_1.method1574(super.anInt7416, super.anInt7409, super.anInt7349, Static207.aClass354_1, super.anInt7399, super.anInt7400, local50, super.anInt7379, local30, Static116.aClass140_2, arg1, super.aClass19Array3, arg0, Static70.aClass78_1);
		if (local141 == null) {
			return false;
		}
		super.anInt7418 = local141.J();
		super.anInt7394 = local141.RA();
		this.method6170(local141);
		@Pc(162) int local162 = super.aClass186_7.method4106();
		if (local53 == 0 && local56 == 0) {
			this.method6161(local162, this.method6165() << 9, 0, this.method6165() << 9, 0);
		} else {
			this.method6161(local162, local53, local11.anInt1404, local56, local11.anInt1420);
			if (super.anInt7396 != 0) {
				super.aClass66Array3[0].MA(super.anInt7396);
			}
			if (super.anInt7345 != 0) {
				super.aClass66Array3[0].W(super.anInt7345);
			}
			if (super.anInt7363 != 0) {
				super.aClass66Array3[0].oa(0, super.anInt7363, 0);
			}
		}
		if (local98) {
			local141.method7548(super.aByte98, super.aByte99, super.aByte100, super.aByte101 & 0xFF);
		}
		@Pc(269) Class167 local269;
		@Pc(287) boolean local287;
		@Pc(289) int local289;
		@Pc(331) Class66 local331;
		if (super.anInt7368 == -1 || super.anInt7402 == -1) {
			super.aClass66Array3[1] = null;
		} else {
			local269 = Static215.aClass33_1.method587(super.anInt7368);
			local287 = local269.aByte59 == 3 && (local53 != 0 || local56 != 0);
			local289 = local7;
			if (local287) {
				local289 = local7 | 0x7;
			} else {
				if (super.anInt7354 != 0) {
					local289 = local7 | 0x5;
				}
				if (super.anInt7384 != 0) {
					local289 |= 0x2;
				}
			}
			local331 = super.aClass66Array3[1] = local269.method3642(super.anInt7383, arg0, Static116.aClass140_2, super.anInt7402, local289, super.anInt7364);
			if (local331 != null) {
				if (super.anInt7384 != 0) {
					local331.oa(0, -super.anInt7384 << 2, 0);
				}
				if (super.anInt7354 != 0) {
					local331.M(super.anInt7354 * 2048);
				}
				if (local287) {
					if (super.anInt7396 != 0) {
						local331.MA(super.anInt7396);
					}
					if (super.anInt7345 != 0) {
						local331.W(super.anInt7345);
					}
					if (super.anInt7363 != 0) {
						local331.oa(0, super.anInt7363, 0);
					}
				}
			}
		}
		if (super.anInt7356 == -1 || super.anInt7360 == -1) {
			super.aClass66Array3[2] = null;
		} else {
			local269 = Static215.aClass33_1.method587(super.anInt7356);
			local287 = local269.aByte59 == 3 && (local53 != 0 || local56 != 0);
			local289 = local7;
			if (local287) {
				local289 = local7 | 0x7;
			} else {
				if (super.anInt7393 != 0) {
					local289 = local7 | 0x5;
				}
				if (super.anInt7341 != 0) {
					local289 |= 0x2;
				}
			}
			local331 = super.aClass66Array3[2] = local269.method3643(Static116.aClass140_2, arg0, super.anInt7343, local289, super.anInt7360, super.anInt7407);
			if (local331 != null) {
				if (super.anInt7341 != 0) {
					local331.oa(0, -super.anInt7341 << 2, 0);
				}
				if (super.anInt7393 != 0) {
					local331.M(super.anInt7393 * 2048);
				}
				if (local287) {
					if (super.anInt7396 != 0) {
						local331.MA(super.anInt7396);
					}
					if (super.anInt7345 != 0) {
						local331.W(super.anInt7345);
					}
					if (super.anInt7363 != 0) {
						local331.oa(0, super.anInt7363, 0);
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)V")
	@Override
	public void method7322() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZLclient!r;)Lclient!og;")
	@Override
	public Class6_Sub5 method7317(@OriginalArg(1) Class100 arg0) {
		if (this.aClass86_1 == null || !this.method158(arg0, 2048)) {
			return null;
		}
		@Pc(19) Class68 local19 = arg0.method6222();
		@Pc(24) int local24 = super.aClass186_7.method4106();
		local19.o(local24);
		@Pc(42) Class346 local42 = Static389.aClass346ArrayArrayArray2[super.aByte112][super.anInt8761 >> Static134.anInt2822][super.anInt8764 >> Static134.anInt2822];
		if (local42 == null || local42.aClass6_Sub1_Sub2_1 == null) {
			super.anInt7355 = (int) ((float) super.anInt7355 - (float) super.anInt7355 / 10.0F);
		} else {
			@Pc(55) int local55 = super.anInt7355 - local42.aClass6_Sub1_Sub2_1.aShort96;
			super.anInt7355 = (int) ((float) super.anInt7355 - (float) local55 / 10.0F);
		}
		local19.U(super.anInt8761, -super.anInt7355 + super.anInt8759 - 20, super.anInt8764);
		@Pc(98) Class54 local98 = this.method6168();
		@Pc(111) Class86 local111 = this.aClass86_1.anIntArray136 == null ? this.aClass86_1 : this.aClass86_1.method1567(Static70.aClass78_1);
		super.aBoolean573 = false;
		if (Static72.aClass2_Sub12_Sub1_1.aBoolean155 && local111.aBoolean191 && local98.aBoolean104) {
			@Pc(141) Class84 local141 = super.anInt7370 != -1 && super.anInt7406 == 0 ? Static116.aClass140_2.method3287(super.anInt7370) : null;
			@Pc(158) Class84 local158 = super.anInt7419 == -1 || super.aBoolean569 && local141 != null ? null : Static116.aClass140_2.method3287(super.anInt7419);
			@Pc(208) Class66 local208 = Static61.method964(this.aClass86_1.aByte40 & 0xFF, local24, super.aClass66Array3[0], this.aClass86_1.aByte34 & 0xFF, this.aClass86_1.aShort27 & 0xFFFF, this.aClass86_1.anInt2152, super.anInt7345, arg0, this.aClass86_1.aShort26 & 0xFFFF, super.anInt7396, super.anInt7363, local158 == null ? super.anInt7416 : super.anInt7379, local158 == null ? local141 : local158);
			if (local208 != null) {
				super.aBoolean573 = true;
				arg0.ZA(false);
				if (Static338.aBoolean493) {
					local208.method7556(local19, null, Static401.anInt6991, 0);
				} else {
					local208.method7558(local19, null, 0);
				}
				arg0.ZA(true);
			}
		}
		local19.o(local24);
		local19.U(super.anInt8761, -super.anInt7355 + super.anInt8759 - 5, super.anInt8764);
		@Pc(253) Class6_Sub5 local253 = null;
		if (this.method151()) {
			local253 = Static305.method4561(super.aClass66Array3.length);
		}
		this.method6162(local19, false, arg0, super.aClass66Array3);
		@Pc(275) int local275;
		if (Static338.aBoolean493) {
			for (local275 = 0; local275 < super.aClass66Array3.length; local275++) {
				if (super.aClass66Array3[local275] != null) {
					super.aClass66Array3[local275].method7556(local19, local253 == null ? null : local253.aClass6_Sub6Array1[local275], Static401.anInt6991, 0);
				}
			}
		} else {
			for (local275 = 0; local275 < super.aClass66Array3.length; local275++) {
				if (super.aClass66Array3[local275] != null) {
					super.aClass66Array3[local275].method7558(local19, local253 == null ? null : local253.aClass6_Sub6Array1[local275], 0);
				}
			}
		}
		if (super.aClass6_Sub8_7 != null) {
			@Pc(343) Class164 local343 = super.aClass6_Sub8_7.method7161();
			if (Static338.aBoolean493) {
				arg0.method6257(local343, Static401.anInt6991);
			} else {
				arg0.method6193(local343);
			}
		}
		for (local275 = 0; local275 < super.aClass66Array3.length; local275++) {
			if (super.aClass66Array3[local275] != null) {
				super.aBoolean573 |= super.aClass66Array3[local275].LA();
			}
		}
		super.anInt7389 = Static485.anInt8225;
		super.aClass66Array3[0] = super.aClass66Array3[1] = super.aClass66Array3[2] = null;
		return local253;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!du;I)V")
	public void method159(@OriginalArg(0) Class86 arg0) {
		this.aClass86_1 = arg0;
		if (super.aClass6_Sub8_7 != null) {
			super.aClass6_Sub8_7.method7152();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILclient!r;I)Z")
	@Override
	public boolean method7331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2) {
		if (this.aClass86_1 == null || !this.method158(arg2, 131072)) {
			return false;
		}
		@Pc(19) Class68 local19 = arg2.method6222();
		@Pc(24) int local24 = super.aClass186_7.method4106();
		local19.o(local24);
		local19.U(super.anInt8761, super.anInt8759, super.anInt8764);
		@Pc(37) boolean local37 = false;
		for (@Pc(44) int local44 = 0; local44 < super.aClass66Array3.length; local44++) {
			if (super.aClass66Array3[local44] != null) {
				@Pc(75) boolean local75 = this.aClass86_1.anInt2150 == -1 ? this.aClass86_1.anInt2152 == 1 : this.aClass86_1.anInt2150 == 1;
				@Pc(88) boolean local88;
				if (Static338.aBoolean493) {
					local88 = super.aClass66Array3[local44].method7547(arg0, arg1, local19, local75, Static401.anInt6991);
				} else {
					local88 = super.aClass66Array3[local44].method7541(arg0, arg1, local19, local75);
				}
				if (local88) {
					local37 = true;
					break;
				}
			}
		}
		super.aClass66Array3[0] = super.aClass66Array3[1] = super.aClass66Array3[2] = null;
		return local37;
	}
}
