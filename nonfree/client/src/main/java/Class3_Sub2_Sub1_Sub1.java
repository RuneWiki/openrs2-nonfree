import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dw")
public final class Class3_Sub2_Sub1_Sub1 extends Class3_Sub2_Sub1 {

	@OriginalMember(owner = "client!dw", name = "Jc", descriptor = "[I")
	public static final int[] anIntArray146 = new int[32];

	@OriginalMember(owner = "client!dw", name = "zc", descriptor = "Lclient!ej;")
	public Class65 aClass65_1;

	@OriginalMember(owner = "client!dw", name = "Bc", descriptor = "I")
	public int anInt1720 = -1;

	@OriginalMember(owner = "client!dw", name = "Pc", descriptor = "I")
	public int anInt1733 = -1;

	static {
		@Pc(7) int local7 = 2;
		for (@Pc(9) int local9 = 0; local9 < 32; local9++) {
			anIntArray146[local9] = local7 - 1;
			local7 += local7;
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lclient!ya;B)Lclient!mf;")
	@Override
	public Class8_Sub5 method5141(@OriginalArg(0) Class49 arg0) {
		if (this.aClass65_1 == null || !this.method1430(arg0, 2048)) {
			return null;
		}
		@Pc(23) Class35 local23 = arg0.method4445();
		@Pc(28) int local28 = super.aClass266_7.method5718();
		local23.ra(local28);
		local23.o(super.anInt6119, super.anInt6120, super.anInt6121);
		@Pc(43) Class156 local43 = this.method4925();
		@Pc(56) Class65 local56 = this.aClass65_1.anIntArray155 == null ? this.aClass65_1 : this.aClass65_1.method1710(Static344.aClass108_1);
		if (Static12.aClass79_Sub1_1.aBoolean366 && local56.aBoolean138 && local43.aBoolean324) {
			@Pc(83) Class250 local83 = super.anInt6163 != -1 && super.anInt6139 == 0 ? Static338.aClass12_2.method255(super.anInt6163) : null;
			@Pc(100) Class250 local100 = super.anInt6177 == -1 || super.aBoolean429 && local83 != null ? null : Static338.aClass12_2.method255(super.anInt6177);
			@Pc(152) Class91 local152 = Static236.method3661(this.aClass65_1.aShort21 & 0xFFFF, local100 == null ? local83 : local100, this.aClass65_1.aByte27 & 0xFF, super.aClass91Array3[0], local100 == null ? super.anInt6149 : super.anInt6190, arg0, this.aClass65_1.aShort22 & 0xFFFF, this.aClass65_1.aByte29 & 0xFF, super.aBoolean427, super.anInt6191, super.anInt6200, local28, this.aClass65_1.anInt2128, super.anInt6165);
			if (local152 != null) {
				@Pc(157) float local157 = arg0.W();
				@Pc(160) float local160 = arg0.xa();
				arg0.method4416(false);
				arg0.g(local157, local160 - 150.0F);
				local152.method3276(local23, null, 0);
				arg0.g(local157, local160);
				arg0.method4416(true);
			}
		}
		@Pc(183) Class8_Sub5 local183 = null;
		if (this.method1427()) {
			local183 = Static367.method4998(super.aClass91Array3.length);
		}
		if (super.aClass8_Sub3_7 == null) {
			arg0.method4409(super.aClass91Array3, local23, local183 == null ? null : local183.aClass8_Sub4Array1, 0);
		} else {
			@Pc(214) Class194 local214 = super.aClass8_Sub3_7.method561();
			arg0.method4421(super.aClass91Array3, local214, local23, local183 == null ? null : local183.aClass8_Sub4Array1, 0);
		}
		this.method4919(super.aClass91Array3, false, arg0);
		if (super.aClass91Array3[2] != null) {
			if (local28 != 0) {
				super.aClass91Array3[2].Q(local28);
			}
			super.aClass91Array3[2].JA(super.anInt6119 - super.aClass2_Sub13_3.anInt2348, -super.aClass2_Sub13_3.anInt2344 + super.anInt6120, super.anInt6121 - super.aClass2_Sub13_3.anInt2346);
		}
		super.aClass91Array3[0] = super.aClass91Array3[1] = super.aClass91Array3[2] = super.aClass91Array3[3] = null;
		super.anInt6188 = Static356.anInt6044;
		return local183;
	}

	@OriginalMember(owner = "client!dw", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method5135() {
		return false;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(ILclient!ej;)V")
	public void method1426(@OriginalArg(1) Class65 arg0) {
		this.aClass65_1 = arg0;
		if (super.aClass8_Sub3_7 != null) {
			super.aClass8_Sub3_7.method560();
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(ZILclient!ya;I)Z")
	@Override
	public boolean method5140(@OriginalArg(1) int arg0, @OriginalArg(2) Class49 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass65_1 == null || !this.method1430(arg1, 131072)) {
			return false;
		}
		@Pc(19) Class35 local19 = arg1.method4445();
		@Pc(29) int local29 = super.aClass266_7.method5718();
		local19.ra(local29);
		local19.o(super.anInt6119, super.anInt6120, super.anInt6121);
		@Pc(42) boolean local42 = false;
		for (@Pc(44) int local44 = 0; local44 < super.aClass91Array3.length; local44++) {
			if (super.aClass91Array3[local44] != null && super.aClass91Array3[local44].method3288(arg2, arg0, local19, this.aClass65_1.anInt2128 == 1)) {
				local42 = true;
				break;
			}
		}
		super.aClass91Array3[0] = super.aClass91Array3[1] = super.aClass91Array3[2] = super.aClass91Array3[3] = null;
		return local42;
	}

	@OriginalMember(owner = "client!dw", name = "d", descriptor = "(I)Z")
	private boolean method1427() {
		return this.aClass65_1.aBoolean137;
	}

	@OriginalMember(owner = "client!dw", name = "h", descriptor = "(B)Z")
	public boolean method1429() {
		return this.aClass65_1 != null;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(ZLclient!ya;I)Z")
	private boolean method1430(@OriginalArg(1) Class49 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class156 local11 = this.method4925();
		@Pc(26) Class250 local26 = super.anInt6163 != -1 && super.anInt6139 == 0 ? Static338.aClass12_2.method255(super.anInt6163) : null;
		@Pc(44) Class250 local44 = super.anInt6177 == -1 || super.aBoolean429 && local26 != null ? null : Static338.aClass12_2.method255(super.anInt6177);
		@Pc(47) int local47 = local11.anInt4463;
		@Pc(50) int local50 = local11.anInt4442;
		if (local47 != 0 || local50 != 0 || local11.anInt4467 != 0 || local11.anInt4462 != 0) {
			arg1 |= 0x7;
		}
		@Pc(90) boolean local90 = super.aByte92 != 0 && Static131.anInt2821 >= super.anInt6148 && Static131.anInt2821 < super.anInt6132;
		if (local90) {
			arg1 |= 0x80000;
		}
		@Pc(127) Class91 local127 = super.aClass91Array3[0] = this.aClass65_1.method1700(Static344.aClass108_1, super.anInt6180, super.anInt6192, super.aClass190Array3, Static262.aClass51_3, super.anInt6178, arg0, arg1, Static338.aClass12_2, super.anInt6149, super.anInt6190, local44, super.anInt6169, local26);
		if (local127 == null) {
			return false;
		}
		super.anInt6194 = local127.MA();
		this.method4927(local127);
		@Pc(144) int local144 = super.aClass266_7.method5718();
		if (local47 == 0 && local50 == 0) {
			this.method4923(local144, 0, 0, this.method4935() << 7, this.method4935() << 7);
		} else {
			this.method4923(local144, local11.anInt4436, local11.anInt4451, local50, local47);
			if (super.anInt6200 != 0) {
				super.aClass91Array3[0].Z(super.anInt6200);
			}
			if (super.anInt6191 != 0) {
				super.aClass91Array3[0].R(super.anInt6191);
			}
			if (super.anInt6165 != 0) {
				super.aClass91Array3[0].JA(0, super.anInt6165, 0);
			}
		}
		if (local90) {
			local127.method3291(super.lb, super.aByte91, super.aByte90, super.aByte92 & 0xFF);
		}
		@Pc(257) Class203 local257;
		@Pc(275) boolean local275;
		@Pc(277) int local277;
		@Pc(317) Class91 local317;
		if (super.anInt6150 == -1 || super.anInt6164 == -1) {
			super.aClass91Array3[1] = null;
		} else {
			local257 = Static395.aClass247_2.method5407(super.anInt6150);
			local275 = local257.aByte86 == 3 && (local47 != 0 || local50 != 0);
			local277 = local7;
			if (local275) {
				local277 = local7 | 0x7;
			} else {
				if (super.anInt6158 != 0) {
					local277 = local7 | 0x5;
				}
				if (super.anInt6199 != 0) {
					local277 |= 0x2;
				}
			}
			local317 = super.aClass91Array3[1] = local257.method4517(super.anInt6171, Static338.aClass12_2, local277, super.anInt6164, super.anInt6176, arg0);
			if (local317 != null) {
				if (super.anInt6199 != 0) {
					local317.JA(0, -super.anInt6199 << 0, 0);
				}
				if (super.anInt6158 != 0) {
					local317.Q(super.anInt6158 * 2048);
				}
				if (local275) {
					if (super.anInt6200 != 0) {
						local317.Z(super.anInt6200);
					}
					if (super.anInt6191 != 0) {
						local317.R(super.anInt6191);
					}
					if (super.anInt6165 != 0) {
						local317.JA(0, super.anInt6165, 0);
					}
				}
			}
		}
		if (super.anInt6126 == -1 || super.anInt6185 == -1) {
			super.aClass91Array3[3] = null;
		} else {
			local257 = Static395.aClass247_2.method5407(super.anInt6126);
			local275 = local257.aByte86 == 3 && (local47 != 0 || local50 != 0);
			local277 = local7;
			if (local275) {
				local277 = local7 | 0x7;
			} else {
				if (super.anInt6152 != 0) {
					local277 = local7 | 0x5;
				}
				if (super.anInt6133 != 0) {
					local277 |= 0x2;
				}
			}
			local317 = super.aClass91Array3[3] = local257.method4518(arg0, super.anInt6185, local277, super.anInt6166, super.anInt6136, Static338.aClass12_2);
			if (local317 != null) {
				if (super.anInt6133 != 0) {
					local317.JA(0, -super.anInt6133 << 0, 0);
				}
				if (super.anInt6152 != 0) {
					local317.Q(super.anInt6152 * 2048);
				}
				if (local275) {
					if (super.anInt6200 != 0) {
						local317.Z(super.anInt6200);
					}
					if (super.anInt6191 != 0) {
						local317.R(super.anInt6191);
					}
					if (super.anInt6165 != 0) {
						local317.JA(0, super.anInt6165, 0);
					}
				}
			}
		}
		super.aClass91Array3[2] = null;
		if (super.aClass2_Sub13_3 != null) {
			if (Static131.anInt2821 >= super.aClass2_Sub13_3.anInt2350) {
				super.aClass2_Sub13_3 = null;
			} else if (Static131.anInt2821 >= super.aClass2_Sub13_3.anInt2347) {
				@Pc(540) Class91 local540 = super.aClass2_Sub13_3.method1840(arg0, local7 | 0x7);
				if (local540 != null) {
					local540.JA(super.aClass2_Sub13_3.anInt2348 - super.anInt6119, -super.anInt6120 + super.aClass2_Sub13_3.anInt2344, super.aClass2_Sub13_3.anInt2346 - super.anInt6121);
					if (local144 != 0) {
						local540.Q(local144);
					}
					super.aClass91Array3[2] = local540;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "(III)V")
	public void method1431(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray525[0];
		@Pc(15) int local15 = super.anIntArray524[0];
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
		if (super.anInt6163 != -1 && Static338.aClass12_2.method255(super.anInt6163).anInt7021 == 1) {
			super.anInt6163 = -1;
		}
		@Pc(84) Class203 local84;
		if (super.anInt6150 != -1) {
			local84 = Static395.aClass247_2.method5407(super.anInt6150);
			if (local84.aBoolean398 && local84.anInt5615 != -1 && Static338.aClass12_2.method255(local84.anInt5615).anInt7021 == 1) {
				super.anInt6150 = -1;
			}
		}
		if (super.anInt6126 != -1) {
			local84 = Static395.aClass247_2.method5407(super.anInt6126);
			if (local84.aBoolean398 && local84.anInt5615 != -1 && Static338.aClass12_2.method255(local84.anInt5615).anInt7021 == 1) {
				super.anInt6126 = -1;
			}
		}
		if (super.anInt6206 < 9) {
			super.anInt6206++;
		}
		for (@Pc(154) int local154 = super.anInt6206; local154 > 0; local154--) {
			super.anIntArray525[local154] = super.anIntArray525[local154 - 1];
			super.anIntArray524[local154] = super.anIntArray524[local154 - 1];
			super.aByteArray119[local154] = super.aByteArray119[local154 - 1];
		}
		super.anIntArray525[0] = local10;
		super.anIntArray524[0] = local15;
		super.aByteArray119[0] = (byte) arg0;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIZIII)V")
	public void method1433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super.aByte89 = (byte) arg3;
		if (super.anInt6163 != -1 && Static338.aClass12_2.method255(super.anInt6163).anInt7021 == 1) {
			super.anInt6163 = -1;
		}
		@Pc(35) Class203 local35;
		if (super.anInt6150 != -1) {
			local35 = Static395.aClass247_2.method5407(super.anInt6150);
			if (local35.aBoolean398 && local35.anInt5615 != -1 && Static338.aClass12_2.method255(local35.anInt5615).anInt7021 == 1) {
				super.anInt6150 = -1;
			}
		}
		if (super.anInt6126 != -1) {
			local35 = Static395.aClass247_2.method5407(super.anInt6126);
			if (local35.aBoolean398 && local35.anInt5615 != -1 && Static338.aClass12_2.method255(local35.anInt5615).anInt7021 == 1) {
				super.anInt6126 = -1;
			}
		}
		if (!arg2) {
			@Pc(94) int local94 = arg0 - super.anIntArray525[0];
			@Pc(102) int local102 = arg1 - super.anIntArray524[0];
			if (local94 >= -8 && local94 <= 8 && local102 >= -8 && local102 <= 8) {
				if (super.anInt6206 < 9) {
					super.anInt6206++;
				}
				for (@Pc(129) int local129 = super.anInt6206; local129 > 0; local129--) {
					super.anIntArray525[local129] = super.anIntArray525[local129 - 1];
					super.anIntArray524[local129] = super.anIntArray524[local129 - 1];
					super.aByteArray119[local129] = super.aByteArray119[local129 - 1];
				}
				super.anIntArray525[0] = arg0;
				super.anIntArray524[0] = arg1;
				super.aByteArray119[0] = 1;
				return;
			}
		}
		super.anIntArray525[0] = arg0;
		super.anInt6203 = 0;
		super.anInt6204 = 0;
		super.anInt6206 = 0;
		super.anIntArray524[0] = arg1;
		super.anInt6121 = (arg4 << 6) + (super.anIntArray524[0] << 7);
		super.anInt6119 = (arg4 << 6) + (super.anIntArray525[0] << 7);
		if (super.aClass8_Sub3_7 != null) {
			super.aClass8_Sub3_7.method560();
		}
	}

	@OriginalMember(owner = "client!dw", name = "h", descriptor = "(I)V")
	@Override
	public void method5144() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!dw", name = "e", descriptor = "(B)I")
	@Override
	public int method4932() {
		if (this.aClass65_1.anIntArray155 != null) {
			@Pc(19) Class65 local19 = this.aClass65_1.method1710(Static344.aClass108_1);
			if (local19 != null && local19.anInt2116 != -1) {
				return local19.anInt2116;
			}
		}
		return this.aClass65_1.anInt2116;
	}

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "(I)I")
	@Override
	public int method4930() {
		if (this.aClass65_1.anIntArray155 != null) {
			@Pc(25) Class65 local25 = this.aClass65_1.method1710(Static344.aClass108_1);
			if (local25 != null && local25.anInt2118 != -1) {
				return local25.anInt2118;
			}
		}
		return this.aClass65_1.anInt2118 == -1 ? super.method4930() : this.aClass65_1.anInt2118;
	}

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5143(@OriginalArg(1) Class49 arg0) {
		if (this.aClass65_1 != null && (super.aBoolean430 || this.method1430(arg0, 0))) {
			this.method4919(super.aClass91Array3, super.aBoolean430, arg0);
			super.aClass91Array3[0] = super.aClass91Array3[1] = super.aClass91Array3[2] = super.aClass91Array3[3] = null;
		}
	}

	@OriginalMember(owner = "client!dw", name = "d", descriptor = "(B)I")
	@Override
	protected int method4926() {
		if (this.aClass65_1.anIntArray155 != null) {
			@Pc(21) Class65 local21 = this.aClass65_1.method1710(Static344.aClass108_1);
			if (local21 != null && local21.anInt2115 != -1) {
				return local21.anInt2115;
			}
		}
		return this.aClass65_1.anInt2115;
	}

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "(Z)I")
	@Override
	public int method4916() {
		return super.anInt6194;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lclient!ya;IZLclient!ij;III)V")
	@Override
	public void method5136(@OriginalArg(0) Class49 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class3 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}
}
