import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!paa")
public final class Class8_Sub3_Sub3_Sub1_Sub2 extends Class8_Sub3_Sub3_Sub1 {

	@OriginalMember(owner = "client!paa", name = "Vc", descriptor = "Lclient!av;")
	public Class20 aClass20_1;

	@OriginalMember(owner = "client!paa", name = "Qc", descriptor = "I")
	public int anInt6868 = -1;

	@OriginalMember(owner = "client!paa", name = "ad", descriptor = "I")
	public int anInt6877 = -1;

	@OriginalMember(owner = "client!paa", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method7629() {
		return false;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(BII)V")
	public void method5442(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray534[0];
		@Pc(15) int local15 = super.anIntArray533[0];
		if (arg1 == 0) {
			local15++;
		}
		if (arg1 == 1) {
			local10++;
			local15++;
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
			local10--;
			local15--;
		}
		if (arg1 == 6) {
			local10--;
		}
		if (arg1 == 7) {
			local15++;
			local10--;
		}
		if (super.anInt6822 != -1 && Static192.aClass211_1.method4277(super.anInt6822).anInt7796 == 1) {
			super.anInt6822 = -1;
			super.anIntArray532 = null;
		}
		@Pc(92) Class60 local92;
		if (super.anInt6830 != -1) {
			local92 = Static107.aClass200_3.method3956(super.anInt6830);
			if (local92.aBoolean111 && local92.anInt1383 != -1 && Static192.aClass211_1.method4277(local92.anInt1383).anInt7796 == 1) {
				super.anInt6830 = -1;
			}
		}
		if (super.anInt6782 != -1) {
			local92 = Static107.aClass200_3.method3956(super.anInt6782);
			if (local92.aBoolean111 && local92.anInt1383 != -1 && Static192.aClass211_1.method4277(local92.anInt1383).anInt7796 == 1) {
				super.anInt6782 = -1;
			}
		}
		if (super.anInt6859 < 9) {
			super.anInt6859++;
		}
		for (@Pc(154) int local154 = super.anInt6859; local154 > 0; local154--) {
			super.anIntArray534[local154] = super.anIntArray534[local154 - 1];
			super.anIntArray533[local154] = super.anIntArray533[local154 - 1];
			super.aByteArray82[local154] = super.aByteArray82[local154 - 1];
		}
		super.anIntArray534[0] = local10;
		super.aByteArray82[0] = (byte) arg0;
		super.anIntArray533[0] = local15;
	}

	@OriginalMember(owner = "client!paa", name = "p", descriptor = "(I)I")
	@Override
	public int method5440() {
		if (this.aClass20_1.anIntArray40 != null) {
			@Pc(18) Class20 local18 = this.aClass20_1.method284(Static430.aClass321_1);
			if (local18 != null && local18.anInt343 != -1) {
				return local18.anInt343;
			}
		}
		return this.aClass20_1.anInt343;
	}

	@OriginalMember(owner = "client!paa", name = "b", descriptor = "(ILclient!r;)Lclient!nu;")
	@Override
	public Class242 method7627(@OriginalArg(1) Class134 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!paa", name = "f", descriptor = "(B)Z")
	public boolean method5443() {
		return this.aClass20_1 != null;
	}

	@OriginalMember(owner = "client!paa", name = "q", descriptor = "(I)Z")
	private boolean method5444() {
		return this.aClass20_1.aBoolean36;
	}

	@OriginalMember(owner = "client!paa", name = "b", descriptor = "(Lclient!r;Z)Lclient!kq;")
	@Override
	public Class8_Sub5 method7630(@OriginalArg(0) Class134 arg0) {
		if (this.aClass20_1 == null || !this.method5445(2048, arg0)) {
			return null;
		}
		@Pc(23) Class113 local23 = arg0.method6963();
		@Pc(28) int local28 = super.aClass108_7.method2164();
		local23.o(local28);
		@Pc(46) Class39 local46 = Static292.aClass39ArrayArrayArray2[super.aByte123][super.anInt9365 >> Static351.anInt5832][super.anInt9370 >> Static351.anInt5832];
		if (local46 == null || local46.aClass8_Sub3_Sub1_1 == null) {
			super.anInt6818 = (int) ((float) super.anInt6818 - (float) super.anInt6818 / 10.0F);
		} else {
			@Pc(59) int local59 = super.anInt6818 - local46.aClass8_Sub3_Sub1_1.aShort37;
			super.anInt6818 = (int) ((float) super.anInt6818 - (float) local59 / 10.0F);
		}
		local23.U(super.anInt9365, super.anInt9361 - super.anInt6818 - 20, super.anInt9370);
		@Pc(102) Class140 local102 = this.method5425();
		@Pc(115) Class20 local115 = this.aClass20_1.anIntArray40 == null ? this.aClass20_1 : this.aClass20_1.method284(Static430.aClass321_1);
		super.aBoolean554 = false;
		if (Static348.aClass1_Sub30_Sub1_1.aBoolean395 && local115.aBoolean32 && local102.aBoolean271) {
			@Pc(143) Class290 local143 = super.anInt6822 != -1 && super.anInt6785 == 0 ? Static192.aClass211_1.method4277(super.anInt6822) : null;
			@Pc(161) Class290 local161 = super.anInt6829 == -1 || super.aBoolean553 && local143 != null ? null : Static192.aClass211_1.method4277(super.anInt6829);
			@Pc(211) Class63 local211 = Static161.method2367(super.aClass63Array3[0], super.anInt6817, this.aClass20_1.anInt350, local161 == null ? local143 : local161, this.aClass20_1.aShort2 & 0xFFFF, this.aClass20_1.aByte13 & 0xFF, this.aClass20_1.aShort3 & 0xFFFF, this.aClass20_1.aByte18 & 0xFF, local161 == null ? super.anInt6803 : super.anInt6800, local28, arg0, super.anInt6854, super.anInt6809);
			if (local211 != null) {
				super.aBoolean554 = true;
				arg0.ZA(false);
				if (Static181.aBoolean242) {
					local211.method7420(local23, null, Static40.anInt631, 0);
				} else {
					local211.method7429(local23, null, 0);
				}
				arg0.ZA(true);
			}
		}
		local23.o(local28);
		local23.U(super.anInt9365, super.anInt9361 - super.anInt6818 - 5, super.anInt9370);
		@Pc(263) Class8_Sub5 local263 = null;
		if (this.method5444()) {
			local263 = Static418.method5818(super.aClass63Array3.length);
		}
		this.method5430(false, arg0, super.aClass63Array3, local23);
		@Pc(285) int local285;
		if (Static181.aBoolean242) {
			for (local285 = 0; local285 < super.aClass63Array3.length; local285++) {
				if (super.aClass63Array3[local285] != null) {
					super.aClass63Array3[local285].method7420(local23, local263 == null ? null : local263.aClass8_Sub4Array1[local285], Static40.anInt631, 0);
				}
			}
		} else {
			for (local285 = 0; super.aClass63Array3.length > local285; local285++) {
				if (super.aClass63Array3[local285] != null) {
					super.aClass63Array3[local285].method7429(local23, local263 == null ? null : local263.aClass8_Sub4Array1[local285], 0);
				}
			}
		}
		if (super.aClass8_Sub7_7 != null) {
			@Pc(361) Class343 local361 = super.aClass8_Sub7_7.method4402();
			if (Static181.aBoolean242) {
				arg0.method6947(local361, Static40.anInt631);
			} else {
				arg0.method6940(local361);
			}
		}
		for (local285 = 0; local285 < super.aClass63Array3.length; local285++) {
			if (super.aClass63Array3[local285] != null) {
				super.aBoolean554 |= super.aClass63Array3[local285].LA();
			}
		}
		super.anInt6834 = Static350.anInt5818;
		super.aClass63Array3[0] = super.aClass63Array3[1] = super.aClass63Array3[2] = null;
		return local263;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(ZILclient!r;)Z")
	private boolean method5445(@OriginalArg(1) int arg0, @OriginalArg(2) Class134 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class140 local11 = this.method5425();
		@Pc(26) Class290 local26 = super.anInt6822 != -1 && super.anInt6785 == 0 ? Static192.aClass211_1.method4277(super.anInt6822) : null;
		@Pc(51) Class290 local51 = super.anInt6829 == -1 || super.aBoolean553 && local26 != null ? null : Static192.aClass211_1.method4277(super.anInt6829);
		@Pc(54) int local54 = local11.anInt3607;
		@Pc(57) int local57 = local11.anInt3611;
		if (local54 != 0 || local57 != 0 || local11.anInt3624 != 0 || local11.anInt3599 != 0) {
			arg0 |= 0x7;
		}
		@Pc(96) boolean local96 = super.aByte94 != 0 && Static301.anInt5197 >= super.anInt6831 && Static301.anInt5197 < super.anInt6795;
		if (local96) {
			arg0 |= 0x80000;
		}
		@Pc(133) Class63 local133 = super.aClass63Array3[0] = this.aClass20_1.method280(arg1, super.aClass255Array3, local26, Static384.aClass305_1, local51, super.anInt6814, super.anInt6826, Static430.aClass321_1, super.anInt6849, super.anInt6803, Static192.aClass211_1, super.anInt6825, super.anInt6800, arg0);
		if (local133 == null) {
			return false;
		}
		super.anInt6813 = local133.J();
		super.anInt6844 = local133.RA();
		this.method5438(local133);
		@Pc(154) int local154 = super.aClass108_7.method2164();
		if (local54 == 0 && local57 == 0) {
			this.method5426(this.method5434() << 9, 0, this.method5434() << 9, 0, local154);
		} else {
			this.method5426(local54, local11.anInt3617, local57, local11.anInt3627, local154);
			if (super.anInt6817 != 0) {
				super.aClass63Array3[0].MA(super.anInt6817);
			}
			if (super.anInt6809 != 0) {
				super.aClass63Array3[0].W(super.anInt6809);
			}
			if (super.anInt6854 != 0) {
				super.aClass63Array3[0].oa(0, super.anInt6854, 0);
			}
		}
		if (local96) {
			local133.method7418(super.lb, super.aByte92, super.aByte93, super.aByte94 & 0xFF);
		}
		@Pc(258) Class60 local258;
		@Pc(275) boolean local275;
		@Pc(277) int local277;
		@Pc(320) Class63 local320;
		if (super.anInt6830 == -1 || super.anInt6801 == -1) {
			super.aClass63Array3[1] = null;
		} else {
			local258 = Static107.aClass200_3.method3956(super.anInt6830);
			local275 = local258.aByte33 == 3 && (local54 != 0 || local57 != 0);
			local277 = local7;
			if (local275) {
				local277 = local7 | 0x7;
			} else {
				if (super.anInt6786 != 0) {
					local277 = local7 | 0x5;
				}
				if (super.anInt6787 != 0) {
					local277 |= 0x2;
				}
			}
			local320 = super.aClass63Array3[1] = local258.method1219(super.anInt6802, Static192.aClass211_1, super.anInt6801, arg1, local277, super.anInt6775);
			if (local320 != null) {
				if (super.anInt6787 != 0) {
					local320.oa(0, -super.anInt6787 << 2, 0);
				}
				if (super.anInt6786 != 0) {
					local320.M(super.anInt6786 * 2048);
				}
				if (local275) {
					if (super.anInt6817 != 0) {
						local320.MA(super.anInt6817);
					}
					if (super.anInt6809 != 0) {
						local320.W(super.anInt6809);
					}
					if (super.anInt6854 != 0) {
						local320.oa(0, super.anInt6854, 0);
					}
				}
			}
		}
		if (super.anInt6782 == -1 || super.anInt6807 == -1) {
			super.aClass63Array3[2] = null;
		} else {
			local258 = Static107.aClass200_3.method3956(super.anInt6782);
			local275 = local258.aByte33 == 3 && (local54 != 0 || local57 != 0);
			local277 = local7;
			if (local275) {
				local277 = local7 | 0x7;
			} else {
				if (super.anInt6833 != 0) {
					local277 = local7 | 0x5;
				}
				if (super.anInt6855 != 0) {
					local277 |= 0x2;
				}
			}
			local320 = super.aClass63Array3[2] = local258.method1216(super.anInt6848, Static192.aClass211_1, local277, super.anInt6807, arg1, super.anInt6838);
			if (local320 != null) {
				if (super.anInt6855 != 0) {
					local320.oa(0, -super.anInt6855 << 2, 0);
				}
				if (super.anInt6833 != 0) {
					local320.M(super.anInt6833 * 2048);
				}
				if (local275) {
					if (super.anInt6817 != 0) {
						local320.MA(super.anInt6817);
					}
					if (super.anInt6809 != 0) {
						local320.W(super.anInt6809);
					}
					if (super.anInt6854 != 0) {
						local320.oa(0, super.anInt6854, 0);
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!paa", name = "c", descriptor = "(I)I")
	@Override
	protected int method5431() {
		if (this.aClass20_1.anIntArray40 != null) {
			@Pc(18) Class20 local18 = this.aClass20_1.method284(Static430.aClass321_1);
			if (local18 != null && local18.anInt335 != -1) {
				return local18.anInt335;
			}
		}
		return this.aClass20_1.anInt335;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(IILclient!r;I)Z")
	@Override
	public boolean method7626(@OriginalArg(1) int arg0, @OriginalArg(2) Class134 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass20_1 == null || !this.method5445(131072, arg1)) {
			return false;
		}
		@Pc(19) Class113 local19 = arg1.method6963();
		@Pc(24) int local24 = super.aClass108_7.method2164();
		local19.o(local24);
		local19.U(super.anInt9365, super.anInt9361, super.anInt9370);
		@Pc(43) boolean local43 = false;
		for (@Pc(45) int local45 = 0; super.aClass63Array3.length > local45; local45++) {
			if (super.aClass63Array3[local45] != null) {
				@Pc(79) boolean local79 = this.aClass20_1.anInt320 == -1 ? this.aClass20_1.anInt350 == 1 : this.aClass20_1.anInt320 == 1;
				@Pc(91) boolean local91;
				if (Static181.aBoolean242) {
					local91 = super.aClass63Array3[local45].method7419(arg2, arg0, local19, local79, Static40.anInt631);
				} else {
					local91 = super.aClass63Array3[local45].method7415(arg2, arg0, local19, local79);
				}
				if (local91) {
					local43 = true;
					break;
				}
			}
		}
		super.aClass63Array3[0] = super.aClass63Array3[1] = super.aClass63Array3[2] = null;
		return local43;
	}

	@OriginalMember(owner = "client!paa", name = "f", descriptor = "(I)V")
	@Override
	public void method7617() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!paa", name = "d", descriptor = "(I)I")
	@Override
	public int method5432() {
		if (this.aClass20_1.anIntArray40 != null) {
			@Pc(13) Class20 local13 = this.aClass20_1.method284(Static430.aClass321_1);
			if (local13 != null && local13.anInt317 != -1) {
				return local13.anInt317;
			}
		}
		return this.aClass20_1.anInt317 == -1 ? super.method5432() : this.aClass20_1.anInt317;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(IIZIIZ)V")
	public void method5448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super.aByte123 = super.aByte124 = (byte) arg4;
		if (Static466.method6426(arg3, arg0)) {
			super.aByte124++;
		}
		if (super.anInt6822 != -1 && Static192.aClass211_1.method4277(super.anInt6822).anInt7796 == 1) {
			super.anIntArray532 = null;
			super.anInt6822 = -1;
		}
		@Pc(64) Class60 local64;
		if (super.anInt6830 != -1) {
			local64 = Static107.aClass200_3.method3956(super.anInt6830);
			if (local64.aBoolean111 && local64.anInt1383 != -1 && Static192.aClass211_1.method4277(local64.anInt1383).anInt7796 == 1) {
				super.anInt6830 = -1;
			}
		}
		if (super.anInt6782 != -1) {
			local64 = Static107.aClass200_3.method3956(super.anInt6782);
			if (local64.aBoolean111 && local64.anInt1383 != -1 && Static192.aClass211_1.method4277(local64.anInt1383).anInt7796 == 1) {
				super.anInt6782 = -1;
			}
		}
		if (!arg2) {
			@Pc(126) int local126 = arg0 - super.anIntArray534[0];
			@Pc(133) int local133 = arg3 - super.anIntArray533[0];
			if (local126 >= -8 && local126 <= 8 && local133 >= -8 && local133 <= 8) {
				if (super.anInt6859 < 9) {
					super.anInt6859++;
				}
				for (@Pc(166) int local166 = super.anInt6859; local166 > 0; local166--) {
					super.anIntArray534[local166] = super.anIntArray534[local166 - 1];
					super.anIntArray533[local166] = super.anIntArray533[local166 - 1];
					super.aByteArray82[local166] = super.aByteArray82[local166 - 1];
				}
				super.anIntArray534[0] = arg0;
				super.anIntArray533[0] = arg3;
				super.aByteArray82[0] = 1;
				return;
			}
		}
		super.anInt6858 = 0;
		super.anIntArray534[0] = arg0;
		super.anInt6856 = 0;
		super.anInt6859 = 0;
		super.anIntArray533[0] = arg3;
		super.anInt9370 = (arg1 << 8) + (super.anIntArray533[0] << 9);
		super.anInt9365 = (arg1 << 8) + (super.anIntArray534[0] << 9);
		if (super.aClass8_Sub7_7 != null) {
			super.aClass8_Sub7_7.method4401();
		}
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(IZLclient!r;Lclient!rga;IIZ)V")
	@Override
	public void method7623(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class134 arg2, @OriginalArg(3) Class8_Sub3 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(ILclient!r;)V")
	@Override
	public void method7625(@OriginalArg(1) Class134 arg0) {
		if (this.aClass20_1 == null || !super.aBoolean555 && !this.method5445(0, arg0)) {
			return;
		}
		@Pc(20) Class113 local20 = arg0.method6963();
		local20.o(super.aClass108_7.method2164());
		local20.U(super.anInt9365, super.anInt9361 - 20, super.anInt9370);
		this.method5430(super.aBoolean555, arg0, super.aClass63Array3, local20);
		super.aClass63Array3[0] = super.aClass63Array3[1] = super.aClass63Array3[2] = null;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lclient!av;B)V")
	public void method5450(@OriginalArg(0) Class20 arg0) {
		this.aClass20_1 = arg0;
		if (super.aClass8_Sub7_7 != null) {
			super.aClass8_Sub7_7.method4401();
		}
	}
}
