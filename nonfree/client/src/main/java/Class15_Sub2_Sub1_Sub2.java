import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jk")
public final class Class15_Sub2_Sub1_Sub2 extends Class15_Sub2_Sub1 {

	@OriginalMember(owner = "client!jk", name = "Wc", descriptor = "Lclient!vq;")
	public Class305 aClass305_1;

	@OriginalMember(owner = "client!jk", name = "Rc", descriptor = "I")
	public int anInt4775 = -1;

	@OriginalMember(owner = "client!jk", name = "zc", descriptor = "I")
	public int anInt4760 = -1;

	@OriginalMember(owner = "client!jk", name = "e", descriptor = "(B)I")
	@Override
	public int method4038() {
		if (this.aClass305_1.anIntArray679 != null) {
			@Pc(20) Class305 local20 = this.aClass305_1.method7150(Static540.aClass242_1);
			if (local20 != null && local20.anInt8794 != -1) {
				return local20.anInt8794;
			}
		}
		return this.aClass305_1.anInt8794 == -1 ? super.method4038() : this.aClass305_1.anInt8794;
	}

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "(Z)I")
	@Override
	public int method6864() {
		return super.anInt4736;
	}

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "(Z)I")
	@Override
	protected int method4034() {
		if (this.aClass305_1.anIntArray679 != null) {
			@Pc(19) Class305 local19 = this.aClass305_1.method7150(Static540.aClass242_1);
			if (local19 != null && local19.anInt8814 != -1) {
				return local19.anInt8814;
			}
		}
		return this.aClass305_1.anInt8814;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(BLclient!qa;II)Z")
	@Override
	public boolean method6857(@OriginalArg(1) Class62 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass305_1 == null || !this.method4046(arg0, 131072)) {
			return false;
		}
		@Pc(19) Class78 local19 = arg0.method6994();
		@Pc(26) int local26 = super.aClass257_7.method6126();
		local19.ma(local26);
		local19.TA(super.anInt8492, super.anInt8494, super.anInt8493);
		@Pc(39) boolean local39 = false;
		for (@Pc(41) int local41 = 0; local41 < super.aClass36Array3.length; local41++) {
			if (super.aClass36Array3[local41] != null && super.aClass36Array3[local41].method7359(arg1, arg2, local19, this.aClass305_1.anInt8815 == 1)) {
				local39 = true;
				break;
			}
		}
		super.aClass36Array3[0] = super.aClass36Array3[1] = super.aClass36Array3[2] = super.aClass36Array3[3] = null;
		return local39;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method6862(@OriginalArg(0) Class62 arg0) {
		if (this.aClass305_1 != null && (super.aBoolean302 || this.method4046(arg0, 0))) {
			this.method4029(super.aBoolean302, arg0, super.aClass36Array3);
			super.aClass36Array3[0] = super.aClass36Array3[1] = super.aClass36Array3[2] = super.aClass36Array3[3] = null;
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lclient!vq;B)V")
	public void method4045(@OriginalArg(0) Class305 arg0) {
		this.aClass305_1 = arg0;
		if (super.aClass30_Sub7_4 != null) {
			super.aClass30_Sub7_4.method5910();
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZLclient!qa;I)Z")
	private boolean method4046(@OriginalArg(1) Class62 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class281 local11 = this.method4026();
		@Pc(27) Class31 local27 = super.anInt4711 != -1 && super.anInt4714 == 0 ? Static155.aClass76_2.method2152(super.anInt4711) : null;
		@Pc(45) Class31 local45 = super.anInt4725 == -1 || super.aBoolean299 && local27 != null ? null : Static155.aClass76_2.method2152(super.anInt4725);
		@Pc(48) int local48 = local11.anInt8108;
		@Pc(51) int local51 = local11.anInt8128;
		if (local48 != 0 || local51 != 0 || local11.anInt8095 != 0 || local11.anInt8115 != 0) {
			arg1 |= 0x7;
		}
		@Pc(90) boolean local90 = super.aByte48 != 0 && Static481.anInt8318 >= super.lb && Static481.anInt8318 < super.anInt4717;
		if (local90) {
			arg1 |= 0x80000;
		}
		@Pc(127) Class36 local127 = super.aClass36Array3[0] = this.aClass305_1.method7142(Static201.aClass85_1, super.aClass170Array3, super.anInt4709, super.anInt4730, arg1, local27, Static155.aClass76_2, local45, Static540.aClass242_1, super.anInt4677, arg0, super.anInt4682, super.anInt4703, super.anInt4704);
		if (local127 == null) {
			return false;
		}
		super.anInt4736 = local127.TA();
		this.method4037(local127);
		@Pc(144) int local144 = super.aClass257_7.method6126();
		if (local48 == 0 && local51 == 0) {
			this.method4042(local144, this.method4035() << 7, 0, 0, this.method4035() << 7);
		} else {
			this.method4042(local144, local48, local11.anInt8125, local11.anInt8104, local51);
			if (super.anInt4688 != 0) {
				super.aClass36Array3[0].D(super.anInt4688);
			}
			if (super.anInt4678 != 0) {
				super.aClass36Array3[0].b(super.anInt4678);
			}
			if (super.anInt4748 != 0) {
				super.aClass36Array3[0].ca(0, super.anInt4748, 0);
			}
		}
		if (local90) {
			local127.method7352(super.aByte50, super.aByte49, super.aByte47, super.aByte48 & 0xFF);
		}
		@Pc(254) Class48 local254;
		@Pc(266) boolean local266;
		@Pc(268) int local268;
		@Pc(311) Class36 local311;
		if (super.anInt4689 == -1 || super.anInt4744 == -1) {
			super.aClass36Array3[1] = null;
		} else {
			local254 = Static501.aClass41_2.method1068(super.anInt4689);
			local266 = local254.aByte31 == 3 && (local48 != 0 || local51 != 0);
			local268 = local7;
			if (local266) {
				local268 = local7 | 0x7;
			} else {
				if (super.anInt4702 != 0) {
					local268 = local7 | 0x5;
				}
				if (super.anInt4699 != 0) {
					local268 |= 0x2;
				}
			}
			local311 = super.aClass36Array3[1] = local254.method1167(local268, super.anInt4726, super.anInt4744, super.anInt4694, arg0, Static155.aClass76_2);
			if (local311 != null) {
				if (super.anInt4699 != 0) {
					local311.ca(0, -super.anInt4699 << 0, 0);
				}
				if (super.anInt4702 != 0) {
					local311.OA(super.anInt4702 * 2048);
				}
				if (local266) {
					if (super.anInt4688 != 0) {
						local311.D(super.anInt4688);
					}
					if (super.anInt4678 != 0) {
						local311.b(super.anInt4678);
					}
					if (super.anInt4748 != 0) {
						local311.ca(0, super.anInt4748, 0);
					}
				}
			}
		}
		if (super.anInt4715 == -1 || super.anInt4728 == -1) {
			super.aClass36Array3[3] = null;
		} else {
			local254 = Static501.aClass41_2.method1068(super.anInt4715);
			local266 = local254.aByte31 == 3 && (local48 != 0 || local51 != 0);
			local268 = local7;
			if (local266) {
				local268 = local7 | 0x7;
			} else {
				if (super.anInt4727 != 0) {
					local268 = local7 | 0x5;
				}
				if (super.anInt4706 != 0) {
					local268 |= 0x2;
				}
			}
			local311 = super.aClass36Array3[3] = local254.method1173(arg0, super.anInt4728, Static155.aClass76_2, local268, super.anInt4750, super.anInt4710);
			if (local311 != null) {
				if (super.anInt4706 != 0) {
					local311.ca(0, -super.anInt4706 << 0, 0);
				}
				if (super.anInt4727 != 0) {
					local311.OA(super.anInt4727 * 2048);
				}
				if (local266) {
					if (super.anInt4688 != 0) {
						local311.D(super.anInt4688);
					}
					if (super.anInt4678 != 0) {
						local311.b(super.anInt4678);
					}
					if (super.anInt4748 != 0) {
						local311.ca(0, super.anInt4748, 0);
					}
				}
			}
		}
		super.aClass36Array3[2] = null;
		if (super.aClass5_Sub32_3 != null) {
			if (super.aClass5_Sub32_3.anInt6217 <= Static481.anInt8318) {
				super.aClass5_Sub32_3 = null;
			} else if (super.aClass5_Sub32_3.anInt6221 <= Static481.anInt8318) {
				@Pc(539) Class36 local539 = super.aClass5_Sub32_3.method5177(arg0, local7 | 0x7);
				if (local539 != null) {
					local539.ca(-super.anInt8492 + super.aClass5_Sub32_3.anInt6220, super.aClass5_Sub32_3.anInt6222 - super.anInt8494, -super.anInt8493 + super.aClass5_Sub32_3.anInt6225);
					if (local144 != 0) {
						local539.OA(local144);
					}
					super.aClass36Array3[2] = local539;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "(ILclient!qa;)Lclient!km;")
	@Override
	public Class175 method6854(@OriginalArg(1) Class62 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(BZILclient!qa;IILclient!cea;)V")
	@Override
	public void method6859(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class62 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class15 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(BII)V")
	public void method4048(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray306[0];
		@Pc(15) int local15 = super.anIntArray307[0];
		if (arg1 == 0) {
			local15++;
		}
		if (arg1 == 1) {
			local15++;
			local10++;
		}
		if (arg1 == 2) {
			local10++;
		}
		if (arg1 == 3) {
			local15--;
			local10++;
		}
		if (arg1 == 4) {
			local15--;
		}
		if (arg1 == 5) {
			local15--;
			local10--;
		}
		if (arg1 == 6) {
			local10--;
		}
		if (arg1 == 7) {
			local15++;
			local10--;
		}
		if (super.anInt4711 != -1 && Static155.aClass76_2.method2152(super.anInt4711).anInt932 == 1) {
			super.anInt4711 = -1;
		}
		@Pc(97) Class48 local97;
		if (super.anInt4689 != -1) {
			local97 = Static501.aClass41_2.method1068(super.anInt4689);
			if (local97.aBoolean68 && local97.anInt1218 != -1 && Static155.aClass76_2.method2152(local97.anInt1218).anInt932 == 1) {
				super.anInt4689 = -1;
			}
		}
		if (super.anInt4715 != -1) {
			local97 = Static501.aClass41_2.method1068(super.anInt4715);
			if (local97.aBoolean68 && local97.anInt1218 != -1 && Static155.aClass76_2.method2152(local97.anInt1218).anInt932 == 1) {
				super.anInt4715 = -1;
			}
		}
		if (super.anInt4753 < 9) {
			super.anInt4753++;
		}
		for (@Pc(160) int local160 = super.anInt4753; local160 > 0; local160--) {
			super.anIntArray306[local160] = super.anIntArray306[local160 - 1];
			super.anIntArray307[local160] = super.anIntArray307[local160 - 1];
			super.aByteArray59[local160] = super.aByteArray59[local160 - 1];
		}
		super.anIntArray306[0] = local10;
		super.anIntArray307[0] = local15;
		super.aByteArray59[0] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jk", name = "g", descriptor = "(B)Z")
	private boolean method4049() {
		return this.aClass305_1.lb;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZIIIII)V")
	public void method4050(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super.aByte91 = (byte) arg1;
		if (super.anInt4711 != -1 && Static155.aClass76_2.method2152(super.anInt4711).anInt932 == 1) {
			super.anInt4711 = -1;
		}
		@Pc(40) Class48 local40;
		if (super.anInt4689 != -1) {
			local40 = Static501.aClass41_2.method1068(super.anInt4689);
			if (local40.aBoolean68 && local40.anInt1218 != -1 && Static155.aClass76_2.method2152(local40.anInt1218).anInt932 == 1) {
				super.anInt4689 = -1;
			}
		}
		if (super.anInt4715 != -1) {
			local40 = Static501.aClass41_2.method1068(super.anInt4715);
			if (local40.aBoolean68 && local40.anInt1218 != -1 && Static155.aClass76_2.method2152(local40.anInt1218).anInt932 == 1) {
				super.anInt4715 = -1;
			}
		}
		if (!arg0) {
			@Pc(97) int local97 = arg2 - super.anIntArray306[0];
			@Pc(105) int local105 = arg3 - super.anIntArray307[0];
			if (local97 >= -8 && local97 <= 8 && local105 >= -8 && local105 <= 8) {
				if (super.anInt4753 < 9) {
					super.anInt4753++;
				}
				for (@Pc(136) int local136 = super.anInt4753; local136 > 0; local136--) {
					super.anIntArray306[local136] = super.anIntArray306[local136 - 1];
					super.anIntArray307[local136] = super.anIntArray307[local136 - 1];
					super.aByteArray59[local136] = super.aByteArray59[local136 - 1];
				}
				super.anIntArray306[0] = arg2;
				super.anIntArray307[0] = arg3;
				super.aByteArray59[0] = 1;
				return;
			}
		}
		super.anInt4753 = 0;
		super.anIntArray306[0] = arg2;
		super.anInt4755 = 0;
		super.anInt4756 = 0;
		super.anIntArray307[0] = arg3;
		super.anInt8492 = (super.anIntArray306[0] << 7) + (arg4 << 6);
		super.anInt8493 = (arg4 << 6) + (super.anIntArray307[0] << 7);
		if (super.aClass30_Sub7_4 != null) {
			super.aClass30_Sub7_4.method5910();
		}
	}

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "(I)I")
	@Override
	public int method4032() {
		if (this.aClass305_1.anIntArray679 != null) {
			@Pc(18) Class305 local18 = this.aClass305_1.method7150(Static540.aClass242_1);
			if (local18 != null && local18.anInt8819 != -1) {
				return local18.anInt8819;
			}
		}
		return this.aClass305_1.anInt8819;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lclient!qa;I)Lclient!bi;")
	@Override
	public Class30_Sub1 method6858(@OriginalArg(0) Class62 arg0) {
		if (this.aClass305_1 == null || !this.method4046(arg0, 2048)) {
			return null;
		}
		@Pc(17) Class78 local17 = arg0.method6994();
		@Pc(22) int local22 = super.aClass257_7.method6126();
		local17.ma(local22);
		local17.TA(super.anInt8492, super.anInt8494, super.anInt8493);
		@Pc(37) Class281 local37 = this.method4026();
		@Pc(50) Class305 local50 = this.aClass305_1.anIntArray679 == null ? this.aClass305_1 : this.aClass305_1.method7150(Static540.aClass242_1);
		if (Static300.aClass5_Sub28_Sub1_1.aBoolean340 && local50.aBoolean639 && local37.aBoolean576) {
			@Pc(75) Class31 local75 = super.anInt4711 != -1 && super.anInt4714 == 0 ? Static155.aClass76_2.method2152(super.anInt4711) : null;
			@Pc(92) Class31 local92 = super.anInt4725 == -1 || super.aBoolean299 && local75 != null ? null : Static155.aClass76_2.method2152(super.anInt4725);
			@Pc(94) int local94 = 0;
			if (super.anInt4738 != 0) {
				local94 = this.method4033();
			}
			@Pc(155) Class36 local155 = Static491.method6811(local94, local92 == null ? local75 : local92, local22, super.anInt4678, super.anInt4748, this.aClass305_1.aByte95 & 0xFF, this.aClass305_1.aShort116 & 0xFFFF, super.anInt4688, this.aClass305_1.anInt8815, this.aClass305_1.aByte102 & 0xFF, local92 == null ? super.anInt4709 : super.anInt4682, this.aClass305_1.aShort115 & 0xFFFF, arg0, super.aClass36Array3[0]);
			if (local155 != null) {
				@Pc(160) float local160 = arg0.P();
				@Pc(163) float local163 = arg0.ra();
				arg0.method7022(false);
				arg0.la(local160, local163 - 150.0F);
				local155.method7360(local17, null, 0);
				arg0.la(local160, local163);
				arg0.method7022(true);
			}
		}
		@Pc(186) Class30_Sub1 local186 = null;
		if (this.method4049()) {
			local186 = Static363.method5549(super.aClass36Array3.length);
		}
		if (super.aClass30_Sub7_4 == null) {
			arg0.method7019(super.aClass36Array3, local17, local186 == null ? null : local186.aClass30_Sub6Array1, 0);
		} else {
			@Pc(217) Class267 local217 = super.aClass30_Sub7_4.method5906();
			arg0.method7008(super.aClass36Array3, local217, local17, local186 == null ? null : local186.aClass30_Sub6Array1, 0);
		}
		this.method4029(false, arg0, super.aClass36Array3);
		super.aClass36Array3[0] = super.aClass36Array3[1] = super.aClass36Array3[2] = super.aClass36Array3[3] = null;
		super.anInt4701 = Static314.anInt4188;
		return local186;
	}

	@OriginalMember(owner = "client!jk", name = "e", descriptor = "(I)V")
	@Override
	public void method6860() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6861() {
		return false;
	}

	@OriginalMember(owner = "client!jk", name = "g", descriptor = "(I)Z")
	public boolean method4052() {
		return this.aClass305_1 != null;
	}
}
