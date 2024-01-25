import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cu")
public final class Class3_Sub2_Sub1_Sub1 extends Class3_Sub2_Sub1 {

	@OriginalMember(owner = "client!cu", name = "Tc", descriptor = "Lclient!dg;")
	public Class48 aClass48_1;

	@OriginalMember(owner = "client!cu", name = "Xc", descriptor = "I")
	public int anInt1665 = -1;

	@OriginalMember(owner = "client!cu", name = "Zc", descriptor = "I")
	public int anInt1667 = -1;

	@OriginalMember(owner = "client!cu", name = "d", descriptor = "(B)I")
	@Override
	public int method5528() {
		if (this.aClass48_1.anIntArray103 != null) {
			@Pc(18) Class48 local18 = this.aClass48_1.method1378(Static393.aClass207_1);
			if (local18 != null && local18.anInt1755 != -1) {
				return local18.anInt1755;
			}
		}
		return this.aClass48_1.anInt1755 == -1 ? super.method5528() : this.aClass48_1.anInt1755;
	}

	@OriginalMember(owner = "client!cu", name = "c", descriptor = "(I)V")
	@Override
	public void method5938() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Z)I")
	@Override
	protected int method5519() {
		if (this.aClass48_1.anIntArray103 != null) {
			@Pc(18) Class48 local18 = this.aClass48_1.method1378(Static393.aClass207_1);
			if (local18 != null && local18.anInt1759 != -1) {
				return local18.anInt1759;
			}
		}
		return this.aClass48_1.anInt1759;
	}

	@OriginalMember(owner = "client!cu", name = "i", descriptor = "(I)Z")
	private boolean method1317() {
		return this.aClass48_1.aBoolean128;
	}

	@OriginalMember(owner = "client!cu", name = "c", descriptor = "(B)I")
	@Override
	public int method5947() {
		return super.anInt6607;
	}

	@OriginalMember(owner = "client!cu", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5942() {
		return false;
	}

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "(Lclient!eq;Z)Lclient!gl;")
	@Override
	public Class57_Sub2 method5936(@OriginalArg(0) Class66 arg0) {
		if (this.aClass48_1 == null || !this.method1324(arg0, 2048)) {
			return null;
		}
		@Pc(17) Class5 local17 = arg0.method5064();
		@Pc(22) int local22 = super.aClass214_7.method4965();
		local17.method3844(local22);
		local17.method3843(super.anInt7202, super.anInt7208, super.anInt7207);
		@Pc(37) Class246 local37 = this.method5513();
		@Pc(50) Class48 local50 = this.aClass48_1.anIntArray103 == null ? this.aClass48_1 : this.aClass48_1.method1378(Static393.aClass207_1);
		if (Static291.aClass28_Sub1_1.aBoolean77 && local50.aBoolean133 && local37.aBoolean464) {
			@Pc(78) Class131 local78 = super.lb != -1 && super.anInt6557 == 0 ? Static5.aClass217_1.method5234(super.lb) : null;
			@Pc(95) Class131 local95 = super.anInt6597 == -1 || super.aBoolean418 && local78 != null ? null : Static5.aClass217_1.method5234(super.anInt6597);
			@Pc(147) Class224 local147 = Static160.method2663(super.anInt6553, super.anInt6562, this.aClass48_1.aByte29 & 0xFF, this.aClass48_1.aByte31 & 0xFF, super.anInt6546, super.aBoolean420, super.aClass224Array3[0], local95 == null ? super.anInt6563 : super.anInt6594, this.aClass48_1.aShort30 & 0xFFFF, this.aClass48_1.aShort31 & 0xFFFF, arg0, local95 == null ? local78 : local95, local22, this.aClass48_1.anInt1752);
			if (local147 != null) {
				@Pc(152) float local152 = arg0.method5024();
				@Pc(155) float local155 = arg0.method5015();
				arg0.method5007(false);
				arg0.method5055(local152, local155 - 150.0F);
				local147.method5798(local17, null, 0);
				arg0.method5055(local152, local155);
				arg0.method5007(true);
			}
		}
		@Pc(178) Class57_Sub2 local178 = null;
		if (this.method1317()) {
			local178 = Static291.method4377(super.aClass224Array3.length);
		}
		if (super.aClass57_Sub4_6 == null) {
			arg0.method5046(super.aClass224Array3, local17, local178 == null ? null : local178.aClass57_Sub5Array1, 0);
		} else {
			@Pc(195) Class32 local195 = super.aClass57_Sub4_6.method3250();
			arg0.method4979(super.aClass224Array3, local195, local17, local178 == null ? null : local178.aClass57_Sub5Array1, 0);
		}
		this.method5527(false, super.aClass224Array3, arg0);
		if (super.aClass224Array3[2] != null) {
			if (local22 != 0) {
				super.aClass224Array3[2].method5839(local22);
			}
			super.aClass224Array3[2].method5806(-super.aClass6_Sub34_3.anInt6213 + super.anInt7202, -super.aClass6_Sub34_3.anInt6223 + super.anInt7208, -super.aClass6_Sub34_3.anInt6211 + super.anInt7207);
		}
		super.anInt6549 = Static347.anInt6264;
		return local178;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(ILclient!dg;)V")
	public void method1318(@OriginalArg(1) Class48 arg0) {
		this.aClass48_1 = arg0;
		if (super.aClass57_Sub4_6 != null) {
			super.aClass57_Sub4_6.method3249();
		}
	}

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "(Z)I")
	@Override
	public int method5520() {
		if (this.aClass48_1.anIntArray103 != null) {
			@Pc(21) Class48 local21 = this.aClass48_1.method1378(Static393.aClass207_1);
			if (local21 != null && local21.anInt1766 != -1) {
				return local21.anInt1766;
			}
		}
		return this.aClass48_1.anInt1766;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lclient!eq;I)V")
	@Override
	public void method5937(@OriginalArg(0) Class66 arg0) {
		if (this.aClass48_1 != null && (super.aBoolean421 || this.method1324(arg0, 0))) {
			this.method5527(super.aBoolean421, super.aClass224Array3, arg0);
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIZIIB)V")
	public void method1322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super.aByte103 = (byte) arg1;
		if (super.lb != -1 && Static5.aClass217_1.method5234(super.lb).anInt3706 == 1) {
			super.lb = -1;
		}
		@Pc(42) Class58 local42;
		if (super.anInt6609 != -1) {
			local42 = Static141.aClass141_2.method3177(super.anInt6609);
			if (local42.aBoolean141 && local42.anInt2019 != -1 && Static5.aClass217_1.method5234(local42.anInt2019).anInt3706 == 1) {
				super.anInt6609 = -1;
			}
		}
		if (super.anInt6603 != -1) {
			local42 = Static141.aClass141_2.method3177(super.anInt6603);
			if (local42.aBoolean141 && local42.anInt2019 != -1 && Static5.aClass217_1.method5234(local42.anInt2019).anInt3706 == 1) {
				super.anInt6603 = -1;
			}
		}
		if (!arg2) {
			@Pc(99) int local99 = arg0 - super.anIntArray458[0];
			@Pc(106) int local106 = arg3 - super.anIntArray459[0];
			if (local99 >= -8 && local99 <= 8 && local106 >= -8 && local106 <= 8) {
				if (super.anInt6613 < 9) {
					super.anInt6613++;
				}
				for (@Pc(137) int local137 = super.anInt6613; local137 > 0; local137--) {
					super.anIntArray458[local137] = super.anIntArray458[local137 - 1];
					super.anIntArray459[local137] = super.anIntArray459[local137 - 1];
					super.aByteArray85[local137] = super.aByteArray85[local137 - 1];
				}
				super.anIntArray458[0] = arg0;
				super.anIntArray459[0] = arg3;
				super.aByteArray85[0] = 1;
				return;
			}
		}
		super.anIntArray458[0] = arg0;
		super.anInt6611 = 0;
		super.anInt6612 = 0;
		super.anInt6613 = 0;
		super.anIntArray459[0] = arg3;
		super.anInt7202 = (arg4 << 6) + (super.anIntArray458[0] << 7);
		super.anInt7207 = (super.anIntArray459[0] << 7) + (arg4 << 6);
		if (super.aClass57_Sub4_6 != null) {
			super.aClass57_Sub4_6.method3249();
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(III)V")
	public void method1323(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray458[0];
		@Pc(15) int local15 = super.anIntArray459[0];
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
			local10++;
			local15--;
		}
		if (arg1 == 4) {
			local15--;
		}
		if (arg1 == 5) {
			local10--;
			local15--;
		}
		if (arg1 == 6) {
			local10--;
		}
		if (super.lb != -1 && Static5.aClass217_1.method5234(super.lb).anInt3706 == 1) {
			super.lb = -1;
		}
		if (arg1 == 7) {
			local15++;
			local10--;
		}
		@Pc(91) Class58 local91;
		if (super.anInt6609 != -1) {
			local91 = Static141.aClass141_2.method3177(super.anInt6609);
			if (local91.aBoolean141 && local91.anInt2019 != -1 && Static5.aClass217_1.method5234(local91.anInt2019).anInt3706 == 1) {
				super.anInt6609 = -1;
			}
		}
		if (super.anInt6603 != -1) {
			local91 = Static141.aClass141_2.method3177(super.anInt6603);
			if (local91.aBoolean141 && local91.anInt2019 != -1 && Static5.aClass217_1.method5234(local91.anInt2019).anInt3706 == 1) {
				super.anInt6603 = -1;
			}
		}
		if (super.anInt6613 < 9) {
			super.anInt6613++;
		}
		for (@Pc(156) int local156 = super.anInt6613; local156 > 0; local156--) {
			super.anIntArray458[local156] = super.anIntArray458[local156 - 1];
			super.anIntArray459[local156] = super.anIntArray459[local156 - 1];
			super.aByteArray85[local156] = super.aByteArray85[local156 - 1];
		}
		super.anIntArray458[0] = local10;
		super.aByteArray85[0] = (byte) arg0;
		super.anIntArray459[0] = local15;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(ILclient!eq;BI)Z")
	@Override
	public boolean method5939(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass48_1 == null || !this.method1324(arg1, 131072)) {
			return false;
		}
		@Pc(19) Class5 local19 = arg1.method5064();
		@Pc(24) int local24 = super.aClass214_7.method4965();
		local19.method3844(local24);
		local19.method3843(super.anInt7202, super.anInt7208, super.anInt7207);
		for (@Pc(45) int local45 = 0; local45 < super.aClass224Array3.length; local45++) {
			if (super.aClass224Array3[local45] != null && super.aClass224Array3[local45].method5836(arg0, arg2, local19, this.aClass48_1.anInt1752 == 1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lclient!eq;II)Z")
	private boolean method1324(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(13) Class246 local13 = this.method5513();
		@Pc(29) Class131 local29 = super.lb != -1 && super.anInt6557 == 0 ? Static5.aClass217_1.method5234(super.lb) : null;
		@Pc(46) Class131 local46 = super.anInt6597 == -1 || super.aBoolean418 && local29 != null ? null : Static5.aClass217_1.method5234(super.anInt6597);
		@Pc(49) int local49 = local13.anInt7335;
		@Pc(52) int local52 = local13.anInt7320;
		if (local49 != 0 || local52 != 0 || local13.anInt7301 != 0 || local13.anInt7326 != 0) {
			arg1 |= 0x7;
		}
		@Pc(97) boolean local97 = super.aByte90 != 0 && Static66.anInt1741 >= super.anInt6582 && Static66.anInt1741 < super.anInt6600;
		if (local97) {
			arg1 |= 0x80000;
		}
		@Pc(134) Class224 local134 = super.aClass224Array3[0] = this.aClass48_1.method1382(local29, Static5.aClass217_1, Static393.aClass207_1, arg1, super.anInt6568, arg0, super.anInt6594, super.anInt6563, super.aClass235Array3, super.anInt6576, local46, Static145.aClass27_1, super.anInt6601, super.anInt6581);
		if (local134 == null) {
			return false;
		}
		super.anInt6607 = local134.method5812();
		this.method5514(local134);
		@Pc(153) int local153 = super.aClass214_7.method4965();
		if (local49 == 0 && local52 == 0) {
			this.method5518(this.method5521() << 7, 0, 0, this.method5521() << 7, local153);
		} else {
			this.method5518(local52, local13.anInt7321, local13.anInt7299, local49, local153);
			if (super.anInt6553 != 0) {
				super.aClass224Array3[0].method5817(super.anInt6553);
			}
			if (super.anInt6562 != 0) {
				super.aClass224Array3[0].method5840(super.anInt6562);
			}
			if (super.anInt6546 != 0) {
				super.aClass224Array3[0].method5806(0, super.anInt6546, 0);
			}
		}
		if (local97) {
			local134.method5814(super.aByte91, super.aByte92, super.aByte89, super.aByte90 & 0xFF);
		}
		@Pc(256) Class58 local256;
		@Pc(271) boolean local271;
		@Pc(273) int local273;
		@Pc(316) Class224 local316;
		if (super.anInt6609 == -1 || super.anInt6538 == -1) {
			super.aClass224Array3[1] = null;
		} else {
			local256 = Static141.aClass141_2.method3177(super.anInt6609);
			local271 = local256.aByte36 == 3 && (local49 != 0 || local52 != 0);
			local273 = local7;
			if (local271) {
				local273 = local7 | 0x7;
			} else {
				if (super.anInt6544 != 0) {
					local273 = local7 | 0x5;
				}
				if (super.anInt6543 != 0) {
					local273 |= 0x2;
				}
			}
			local316 = super.aClass224Array3[1] = local256.method1571(Static5.aClass217_1, super.anInt6538, super.anInt6541, arg0, local273, super.anInt6599);
			if (local316 != null) {
				if (super.anInt6543 != 0) {
					local316.method5806(0, -super.anInt6543 << 0, 0);
				}
				if (super.anInt6544 != 0) {
					local316.method5839(super.anInt6544 * 2048);
				}
				if (local271) {
					if (super.anInt6553 != 0) {
						local316.method5817(super.anInt6553);
					}
					if (super.anInt6562 != 0) {
						local316.method5840(super.anInt6562);
					}
					if (super.anInt6546 != 0) {
						local316.method5806(0, super.anInt6546, 0);
					}
				}
			}
		}
		if (super.anInt6603 == -1 || super.anInt6550 == -1) {
			super.aClass224Array3[3] = null;
		} else {
			local256 = Static141.aClass141_2.method3177(super.anInt6603);
			local271 = local256.aByte36 == 3 && (local49 != 0 || local52 != 0);
			local273 = local7;
			if (local271) {
				local273 = local7 | 0x7;
			} else {
				if (super.anInt6547 != 0) {
					local273 = local7 | 0x5;
				}
				if (super.anInt6606 != 0) {
					local273 |= 0x2;
				}
			}
			local316 = super.aClass224Array3[3] = local256.method1572(super.anInt6550, local273, super.anInt6565, Static5.aClass217_1, super.anInt6567, arg0);
			if (local316 != null) {
				if (super.anInt6606 != 0) {
					local316.method5806(0, -super.anInt6606 << 0, 0);
				}
				if (super.anInt6547 != 0) {
					local316.method5839(super.anInt6547 * 2048);
				}
				if (local271) {
					if (super.anInt6553 != 0) {
						local316.method5817(super.anInt6553);
					}
					if (super.anInt6562 != 0) {
						local316.method5840(super.anInt6562);
					}
					if (super.anInt6546 != 0) {
						local316.method5806(0, super.anInt6546, 0);
					}
				}
			}
		}
		super.aClass224Array3[2] = null;
		if (super.aClass6_Sub34_3 != null) {
			if (super.aClass6_Sub34_3.anInt6215 <= Static66.anInt1741) {
				super.aClass6_Sub34_3 = null;
			} else if (Static66.anInt1741 >= super.aClass6_Sub34_3.anInt6222) {
				@Pc(540) Class224 local540 = super.aClass6_Sub34_3.method5183(arg0, local7 | 0x7);
				if (local540 != null) {
					local540.method5806(-super.anInt7202 + super.aClass6_Sub34_3.anInt6213, super.aClass6_Sub34_3.anInt6223 - super.anInt7208, -super.anInt7207 + super.aClass6_Sub34_3.anInt6211);
					if (local153 != 0) {
						local540.method5839(local153);
					}
					super.aClass224Array3[2] = local540;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!cu", name = "d", descriptor = "(Z)Z")
	public boolean method1325() {
		return this.aClass48_1 != null;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIILclient!bp;IZLclient!eq;)V")
	@Override
	public void method5941(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class3 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class66 arg5) {
		throw new IllegalStateException();
	}
}
