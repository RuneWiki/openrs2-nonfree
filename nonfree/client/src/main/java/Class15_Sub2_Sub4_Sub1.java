import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kw")
public final class Class15_Sub2_Sub4_Sub1 extends Class15_Sub2_Sub4 {

	@OriginalMember(owner = "client!kw", name = "Uc", descriptor = "Lclient!ei;")
	public Class88 aClass88_1;

	@OriginalMember(owner = "client!kw", name = "Cc", descriptor = "I")
	public int anInt5186 = -1;

	@OriginalMember(owner = "client!kw", name = "zc", descriptor = "I")
	public int anInt5183 = -1;

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(Z)I")
	@Override
	public int method7133() {
		if (this.aClass88_1.anIntArray182 != null) {
			@Pc(20) Class88 local20 = this.aClass88_1.method1940(Static65.aClass51_1);
			if (local20 != null && local20.anInt2150 != -1) {
				return local20.anInt2150;
			}
		}
		return this.aClass88_1.anInt2150 == -1 ? super.method7133() : this.aClass88_1.anInt2150;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IZI)V")
	public void method4291(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray638[0];
		@Pc(15) int local15 = super.anIntArray637[0];
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
		if (arg1 == 7) {
			local10--;
			local15++;
		}
		if (super.anInt8932 != -1 && Static388.aClass324_2.method7265(super.anInt8932).anInt1384 == 1) {
			super.anInt8932 = -1;
		}
		@Pc(86) Class239 local86;
		if (super.anInt8947 != -1) {
			local86 = Static475.aClass291_2.method6548(super.anInt8947);
			if (local86.aBoolean477 && local86.anInt6960 != -1 && Static388.aClass324_2.method7265(local86.anInt6960).anInt1384 == 1) {
				super.anInt8947 = -1;
			}
		}
		if (super.anInt8968 != -1) {
			local86 = Static475.aClass291_2.method6548(super.anInt8968);
			if (local86.aBoolean477 && local86.anInt6960 != -1 && Static388.aClass324_2.method7265(local86.anInt6960).anInt1384 == 1) {
				super.anInt8968 = -1;
			}
		}
		if (super.anInt8998 < 9) {
			super.anInt8998++;
		}
		for (@Pc(151) int local151 = super.anInt8998; local151 > 0; local151--) {
			super.anIntArray638[local151] = super.anIntArray638[local151 - 1];
			super.anIntArray637[local151] = super.anIntArray637[local151 - 1];
			super.aByteArray106[local151] = super.aByteArray106[local151 - 1];
		}
		super.anIntArray638[0] = local10;
		super.aByteArray106[0] = (byte) arg0;
		super.anIntArray637[0] = local15;
	}

	@OriginalMember(owner = "client!kw", name = "d", descriptor = "(I)Z")
	private boolean method4292() {
		return this.aClass88_1.aBoolean142;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method7164(@OriginalArg(0) int arg0, @OriginalArg(2) Class90 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass88_1 == null || !this.method4296(131072, arg1)) {
			return false;
		}
		@Pc(19) Class93 local19 = arg1.method7455();
		@Pc(31) int local31 = super.aClass218_7.method5310();
		local19.a(local31);
		local19.G(super.anInt8911, super.anInt8915, super.anInt8913);
		@Pc(44) boolean local44 = false;
		for (@Pc(46) int local46 = 0; local46 < super.aClass24Array3.length; local46++) {
			if (super.aClass24Array3[local46] != null && super.aClass24Array3[local46].method7386(arg0, arg2, local19, this.aClass88_1.anInt2171 == 1)) {
				local44 = true;
				break;
			}
		}
		super.aClass24Array3[0] = super.aClass24Array3[1] = super.aClass24Array3[2] = super.aClass24Array3[3] = null;
		return local44;
	}

	@OriginalMember(owner = "client!kw", name = "e", descriptor = "(I)Z")
	public boolean method4293() {
		return this.aClass88_1 != null;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(ZLclient!oa;)V")
	@Override
	public void method7160(@OriginalArg(1) Class90 arg0) {
		if (this.aClass88_1 == null || !super.aBoolean582 && !this.method4296(0, arg0)) {
			return;
		}
		@Pc(20) Class93 local20 = arg0.method7455();
		local20.a(super.aClass218_7.method5310());
		local20.G(super.anInt8911, super.anInt8915 - 20, super.anInt8913);
		this.method7138(super.aBoolean582, local20, arg0, super.aClass24Array3);
		super.aClass24Array3[0] = super.aClass24Array3[1] = super.aClass24Array3[2] = super.aClass24Array3[3] = null;
	}

	@OriginalMember(owner = "client!kw", name = "e", descriptor = "(B)I")
	@Override
	public int method7137() {
		if (this.aClass88_1.anIntArray182 != null) {
			@Pc(18) Class88 local18 = this.aClass88_1.method1940(Static65.aClass51_1);
			if (local18 != null && local18.anInt2156 != -1) {
				return local18.anInt2156;
			}
		}
		return this.aClass88_1.anInt2156;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIIZI)V")
	public void method4294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		super.aByte98 = (byte) arg1;
		if (super.anInt8932 != -1 && Static388.aClass324_2.method7265(super.anInt8932).anInt1384 == 1) {
			super.anInt8932 = -1;
		}
		@Pc(36) Class239 local36;
		if (super.anInt8947 != -1) {
			local36 = Static475.aClass291_2.method6548(super.anInt8947);
			if (local36.aBoolean477 && local36.anInt6960 != -1 && Static388.aClass324_2.method7265(local36.anInt6960).anInt1384 == 1) {
				super.anInt8947 = -1;
			}
		}
		if (super.anInt8968 != -1) {
			local36 = Static475.aClass291_2.method6548(super.anInt8968);
			if (local36.aBoolean477 && local36.anInt6960 != -1 && Static388.aClass324_2.method7265(local36.anInt6960).anInt1384 == 1) {
				super.anInt8968 = -1;
			}
		}
		if (!arg3) {
			@Pc(95) int local95 = arg2 - super.anIntArray638[0];
			@Pc(103) int local103 = arg4 - super.anIntArray637[0];
			if (local95 >= -8 && local95 <= 8 && local103 >= -8 && local103 <= 8) {
				if (super.anInt8998 < 9) {
					super.anInt8998++;
				}
				for (@Pc(132) int local132 = super.anInt8998; local132 > 0; local132--) {
					super.anIntArray638[local132] = super.anIntArray638[local132 - 1];
					super.anIntArray637[local132] = super.anIntArray637[local132 - 1];
					super.aByteArray106[local132] = super.aByteArray106[local132 - 1];
				}
				super.anIntArray638[0] = arg2;
				super.anIntArray637[0] = arg4;
				super.aByteArray106[0] = 1;
				return;
			}
		}
		super.anInt8997 = 0;
		super.anInt8995 = 0;
		super.anIntArray638[0] = arg2;
		super.anInt8998 = 0;
		super.anIntArray637[0] = arg4;
		super.anInt8911 = (super.anIntArray638[0] << 9) + (arg0 << 8);
		super.anInt8913 = (super.anIntArray637[0] << 9) + (arg0 << 8);
		if (super.aClass60_Sub4_8 != null) {
			super.aClass60_Sub4_8.method3588();
		}
	}

	@OriginalMember(owner = "client!kw", name = "i", descriptor = "(I)I")
	@Override
	public int method7123() {
		return super.anInt8956;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(ILclient!oa;)Lclient!wc;")
	@Override
	public Class60_Sub8 method7155(@OriginalArg(1) Class90 arg0) {
		if (this.aClass88_1 == null || !this.method4296(2048, arg0)) {
			return null;
		}
		@Pc(17) Class93 local17 = arg0.method7455();
		@Pc(22) int local22 = super.aClass218_7.method5310();
		local17.a(local22);
		local17.G(super.anInt8911, super.anInt8915 - 20, super.anInt8913);
		@Pc(39) Class154 local39 = this.method7131();
		@Pc(52) Class88 local52 = this.aClass88_1.anIntArray182 == null ? this.aClass88_1 : this.aClass88_1.method1940(Static65.aClass51_1);
		if (Static58.aClass6_Sub17_Sub1_1.aBoolean602 && local52.aBoolean145 && local39.aBoolean333) {
			@Pc(77) Class63 local77 = super.anInt8932 != -1 && super.anInt8955 == 0 ? Static388.aClass324_2.method7265(super.anInt8932) : null;
			@Pc(97) Class63 local97 = super.anInt8985 == -1 || super.aBoolean579 && local77 != null ? null : Static388.aClass324_2.method7265(super.anInt8985);
			@Pc(99) int local99 = 0;
			if (super.anInt8971 != 0) {
				local99 = this.method7130();
			}
			@Pc(157) Class24 local157 = Static68.method963(this.aClass88_1.aByte21 & 0xFF, this.aClass88_1.aShort25 & 0xFFFF, super.anInt8916, super.aClass24Array3[0], local97 == null ? super.anInt8975 : super.anInt8954, local22, arg0, super.anInt8979, local99, this.aClass88_1.anInt2171, this.aClass88_1.aShort26 & 0xFFFF, super.anInt8967, this.aClass88_1.aByte23 & 0xFF, local97 == null ? local77 : local97);
			if (local157 != null) {
				arg0.method7500(false);
				local157.method7393(local17, null, 0);
				arg0.method7500(true);
			}
		}
		local17.a(local22);
		local17.G(super.anInt8911, super.anInt8915 - 5, super.anInt8913);
		@Pc(185) Class60_Sub8 local185 = null;
		if (this.method4292()) {
			local185 = Static191.method3243(super.aClass24Array3.length);
		}
		this.method7138(false, local17, arg0, super.aClass24Array3);
		if (super.aClass60_Sub4_8 == null) {
			arg0.method7476(super.aClass24Array3, local17, local185 == null ? null : local185.aClass60_Sub6Array1, 0);
		} else {
			@Pc(214) Class127 local214 = super.aClass60_Sub4_8.method3587();
			arg0.method7524(super.aClass24Array3, local214, local17, local185 == null ? null : local185.aClass60_Sub6Array1, 0);
		}
		super.anInt8957 = Static114.anInt1963;
		super.aClass24Array3[0] = super.aClass24Array3[1] = super.aClass24Array3[2] = super.aClass24Array3[3] = null;
		return local185;
	}

	@OriginalMember(owner = "client!kw", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method7162() {
		return false;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IILclient!gfa;IIZLclient!oa;)V")
	@Override
	public void method7163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class90 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(BILclient!oa;)Z")
	private boolean method4296(@OriginalArg(1) int arg0, @OriginalArg(2) Class90 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class154 local11 = this.method7131();
		@Pc(29) Class63 local29 = super.anInt8932 != -1 && super.anInt8955 == 0 ? Static388.aClass324_2.method7265(super.anInt8932) : null;
		@Pc(46) Class63 local46 = super.anInt8985 == -1 || super.aBoolean579 && local29 != null ? null : Static388.aClass324_2.method7265(super.anInt8985);
		@Pc(49) int local49 = local11.anInt4508;
		@Pc(52) int local52 = local11.anInt4530;
		if (local49 != 0 || local52 != 0 || local11.anInt4537 != 0 || local11.anInt4504 != 0) {
			arg0 |= 0x7;
		}
		@Pc(97) boolean local97 = super.aByte100 != 0 && super.anInt8963 <= Static363.anInt6671 && Static363.anInt6671 < super.anInt8988;
		if (local97) {
			arg0 |= 0x80000;
		}
		@Pc(134) Class24 local134 = super.aClass24Array3[0] = this.aClass88_1.method1939(Static388.aClass324_2, local29, super.anInt8929, arg1, local46, super.aClass140Array3, super.anInt8934, super.anInt8944, arg0, super.anInt8954, super.anInt8975, Static65.aClass51_1, Static81.aClass12_1, super.anInt8993);
		if (local134 == null) {
			return false;
		}
		super.anInt8956 = local134.DA();
		this.method7142(local134);
		@Pc(151) int local151 = super.aClass218_7.method5310();
		if (local49 == 0 && local52 == 0) {
			this.method7129(local151, this.method7135() << 9, 0, 0, this.method7135() << 9);
		} else {
			this.method7129(local151, local52, local11.anInt4510, local11.anInt4522, local49);
			if (super.anInt8979 != 0) {
				super.aClass24Array3[0].AA(super.anInt8979);
			}
			if (super.anInt8967 != 0) {
				super.aClass24Array3[0].v(super.anInt8967);
			}
			if (super.anInt8916 != 0) {
				super.aClass24Array3[0].m(0, super.anInt8916, 0);
			}
		}
		if (local97) {
			local134.method7384(super.aByte99, super.aByte102, super.aByte101, super.aByte100 & 0xFF);
		}
		@Pc(261) Class239 local261;
		@Pc(276) boolean local276;
		@Pc(278) int local278;
		@Pc(324) Class24 local324;
		if (super.anInt8947 == -1 || super.anInt8951 == -1) {
			super.aClass24Array3[1] = null;
		} else {
			local261 = Static475.aClass291_2.method6548(super.anInt8947);
			local276 = local261.aByte77 == 3 && (local49 != 0 || local52 != 0);
			local278 = local7;
			if (local276) {
				local278 = local7 | 0x7;
			} else {
				if (super.anInt8946 != 0) {
					local278 = local7 | 0x5;
				}
				if (super.anInt8936 != 0) {
					local278 |= 0x2;
				}
			}
			local324 = super.aClass24Array3[1] = local261.method5575(super.anInt8972, super.anInt8928, local278, Static388.aClass324_2, arg1, super.anInt8951);
			if (local324 != null) {
				if (super.anInt8936 != 0) {
					local324.m(0, -super.anInt8936 << 2, 0);
				}
				if (super.anInt8946 != 0) {
					local324.I(super.anInt8946 * 2048);
				}
				if (local276) {
					if (super.anInt8979 != 0) {
						local324.AA(super.anInt8979);
					}
					if (super.anInt8967 != 0) {
						local324.v(super.anInt8967);
					}
					if (super.anInt8916 != 0) {
						local324.m(0, super.anInt8916, 0);
					}
				}
			}
		}
		if (super.anInt8968 == -1 || super.anInt8970 == -1) {
			super.aClass24Array3[3] = null;
		} else {
			local261 = Static475.aClass291_2.method6548(super.anInt8968);
			local276 = local261.aByte77 == 3 && (local49 != 0 || local52 != 0);
			local278 = local7;
			if (local276) {
				local278 = local7 | 0x7;
			} else {
				if (super.anInt8922 != 0) {
					local278 = local7 | 0x5;
				}
				if (super.anInt8921 != 0) {
					local278 |= 0x2;
				}
			}
			local324 = super.aClass24Array3[3] = local261.method5578(super.anInt8970, arg1, super.anInt8959, Static388.aClass324_2, super.anInt8973, local278);
			if (local324 != null) {
				if (super.anInt8921 != 0) {
					local324.m(0, -super.anInt8921 << 2, 0);
				}
				if (super.anInt8922 != 0) {
					local324.I(super.anInt8922 * 2048);
				}
				if (local276) {
					if (super.anInt8979 != 0) {
						local324.AA(super.anInt8979);
					}
					if (super.anInt8967 != 0) {
						local324.v(super.anInt8967);
					}
					if (super.anInt8916 != 0) {
						local324.m(0, super.anInt8916, 0);
					}
				}
			}
		}
		super.aClass24Array3[2] = null;
		if (super.aClass6_Sub42_3 != null) {
			if (Static363.anInt6671 >= super.aClass6_Sub42_3.anInt8165) {
				super.aClass6_Sub42_3 = null;
			} else if (super.aClass6_Sub42_3.anInt8154 <= Static363.anInt6671) {
				@Pc(571) Class24 local571 = super.aClass6_Sub42_3.method6473(local7 | 0x7, arg1);
				if (local571 != null) {
					local571.m(super.aClass6_Sub42_3.anInt8157 - super.anInt8911, super.aClass6_Sub42_3.anInt8163 - super.anInt8915 + 5, super.aClass6_Sub42_3.anInt8159 - super.anInt8913);
					if (local151 != 0) {
						local571.I(local151);
					}
					super.aClass24Array3[2] = local571;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kw", name = "g", descriptor = "(B)I")
	@Override
	protected int method7141() {
		if (this.aClass88_1.anIntArray182 != null) {
			@Pc(13) Class88 local13 = this.aClass88_1.method1940(Static65.aClass51_1);
			if (local13 != null && local13.anInt2147 != -1) {
				return local13.anInt2147;
			}
		}
		return this.aClass88_1.anInt2147;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Z)V")
	@Override
	public void method7165() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(ILclient!ei;)V")
	public void method4297(@OriginalArg(1) Class88 arg0) {
		this.aClass88_1 = arg0;
		if (super.aClass60_Sub4_8 != null) {
			super.aClass60_Sub4_8.method3588();
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lclient!oa;B)Lclient!ac;")
	@Override
	public Class4 method7156(@OriginalArg(0) Class90 arg0) {
		return null;
	}
}
