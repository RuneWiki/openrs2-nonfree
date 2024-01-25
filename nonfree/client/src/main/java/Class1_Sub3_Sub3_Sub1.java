import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mv")
public final class Class1_Sub3_Sub3_Sub1 extends Class1_Sub3_Sub3 {

	@OriginalMember(owner = "client!mv", name = "Mc", descriptor = "Ljava/lang/String;")
	public String aString47;

	@OriginalMember(owner = "client!mv", name = "Oc", descriptor = "I")
	private int anInt4881;

	@OriginalMember(owner = "client!mv", name = "Qc", descriptor = "Ljava/lang/String;")
	public String aString48;

	@OriginalMember(owner = "client!mv", name = "Tc", descriptor = "I")
	public int anInt4885;

	@OriginalMember(owner = "client!mv", name = "ld", descriptor = "Lclient!ai;")
	public Class8 aClass8_1;

	@OriginalMember(owner = "client!mv", name = "md", descriptor = "I")
	public int anInt4899;

	@OriginalMember(owner = "client!mv", name = "Jc", descriptor = "B")
	private byte aByte64 = 0;

	@OriginalMember(owner = "client!mv", name = "Pc", descriptor = "I")
	public int anInt4882 = 0;

	@OriginalMember(owner = "client!mv", name = "ad", descriptor = "B")
	private byte aByte66 = 0;

	@OriginalMember(owner = "client!mv", name = "Gc", descriptor = "I")
	public int anInt4876 = 0;

	@OriginalMember(owner = "client!mv", name = "Zc", descriptor = "I")
	public int anInt4890 = -1;

	@OriginalMember(owner = "client!mv", name = "Lc", descriptor = "I")
	public int anInt4880 = 0;

	@OriginalMember(owner = "client!mv", name = "Nc", descriptor = "B")
	private byte aByte65 = 0;

	@OriginalMember(owner = "client!mv", name = "Ic", descriptor = "I")
	public int anInt4878 = -1;

	@OriginalMember(owner = "client!mv", name = "td", descriptor = "I")
	public int anInt4905 = 0;

	@OriginalMember(owner = "client!mv", name = "sd", descriptor = "I")
	public int anInt4904 = 0;

	@OriginalMember(owner = "client!mv", name = "hd", descriptor = "Z")
	public boolean aBoolean365 = false;

	@OriginalMember(owner = "client!mv", name = "dd", descriptor = "I")
	public int anInt4893 = -1;

	@OriginalMember(owner = "client!mv", name = "od", descriptor = "Z")
	public boolean aBoolean366 = false;

	@OriginalMember(owner = "client!mv", name = "ed", descriptor = "I")
	public int anInt4894 = -1;

	@OriginalMember(owner = "client!mv", name = "id", descriptor = "I")
	public int anInt4896 = 255;

	@OriginalMember(owner = "client!mv", name = "pd", descriptor = "I")
	public int anInt4901 = -1;

	@OriginalMember(owner = "client!mv", name = "vd", descriptor = "I")
	public int anInt4907 = -1;

	@OriginalMember(owner = "client!mv", name = "yd", descriptor = "I")
	public int anInt4909 = -1;

	@OriginalMember(owner = "client!mv", name = "Vc", descriptor = "I")
	public int anInt4887 = -1;

	@OriginalMember(owner = "client!mv", name = "fd", descriptor = "Z")
	public boolean aBoolean364 = false;

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(B)V")
	@Override
	public void method5838() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "(Lclient!qa;B)Lclient!vs;")
	@Override
	public Class13_Sub7 method5837(@OriginalArg(0) Class75 arg0) {
		if (this.aClass8_1 == null || !this.method3931(arg0, 2048)) {
			return null;
		}
		@Pc(19) Class106 local19 = arg0.method2587();
		@Pc(24) int local24 = super.aClass160_7.method3877();
		local19.O(local24);
		local19.ZA(super.anInt6053, super.anInt6045, super.anInt6055);
		@Pc(38) float local38 = arg0.la();
		@Pc(41) float local41 = arg0.w();
		if (Static123.aClass21_Sub1_1.aBoolean78) {
			@Pc(48) Class137 local48 = this.method4837();
			if (local48.aBoolean329 && (this.aClass8_1.anInt274 == -1 || Static154.aClass251_2.method5684(this.aClass8_1.anInt274).aBoolean128)) {
				@Pc(81) Class96 local81 = super.anInt6092 != -1 && super.anInt6083 == 0 ? Static196.aClass30_2.method942(super.anInt6092) : null;
				@Pc(101) Class96 local101 = super.anInt6080 == -1 || this.aBoolean366 || super.aBoolean429 && local81 != null ? null : Static196.aClass30_2.method942(super.anInt6080);
				@Pc(135) Class31 local135 = Static111.method5933(arg0, 1, super.aBoolean426, super.aClass31Array3[0], 160, 240, super.anInt6057, super.anInt6118, 0, 0, local101 == null ? super.anInt6082 : super.anInt6056, local101 == null ? local81 : local101, local24, super.anInt6114);
				if (local135 != null) {
					arg0.o(local38, local41 - 128.0F);
					arg0.method2572(false);
					local135.method5704(local19, null, 0);
					arg0.method2572(true);
				}
			}
		}
		if (Static113.aClass1_Sub3_Sub3_Sub1_4 == this) {
			arg0.o(local38, local41 - 144.0F);
			local19.R(super.anInt6053, super.anInt6045, super.anInt6055);
			for (@Pc(176) int local176 = Static370.aClass125Array1.length - 1; local176 >= 0; local176--) {
				@Pc(182) Class125 local182 = Static370.aClass125Array1[local176];
				if (local182 != null && local182.anInt3868 != -1) {
					@Pc(228) int local228;
					@Pc(221) int local221;
					if (local182.anInt3865 == 1 && local182.anInt3862 >= 0 && Static451.aClass1_Sub3_Sub3_Sub2Array1.length > local182.anInt3862) {
						@Pc(213) Class1_Sub3_Sub3_Sub2 local213 = Static451.aClass1_Sub3_Sub3_Sub2Array1[local182.anInt3862];
						if (local213 != null) {
							local221 = local213.anInt6053 - Static113.aClass1_Sub3_Sub3_Sub1_4.anInt6053;
							local228 = local213.anInt6055 - Static113.aClass1_Sub3_Sub3_Sub1_4.anInt6055;
							this.method3929(super.aClass31Array3[0], local228, 5760000, arg0, local19, local182.anInt3868, local221);
						}
					}
					if (local182.anInt3865 == 2) {
						@Pc(255) int local255 = local182.anInt3866 + 64 - Static113.aClass1_Sub3_Sub3_Sub1_4.anInt6053;
						local221 = local182.anInt3864 + 64 - Static113.aClass1_Sub3_Sub3_Sub1_4.anInt6055;
						local228 = local182.anInt3863 << 7;
						local228 *= local228;
						this.method3929(super.aClass31Array3[0], local221, local228, arg0, local19, local182.anInt3868, local255);
					}
					if (local182.anInt3865 == 10 && local182.anInt3862 >= 0 && local182.anInt3862 < Static308.aClass1_Sub3_Sub3_Sub1Array1.length) {
						@Pc(313) Class1_Sub3_Sub3_Sub1 local313 = Static308.aClass1_Sub3_Sub3_Sub1Array1[local182.anInt3862];
						if (local313 != null) {
							local221 = local313.anInt6053 - Static113.aClass1_Sub3_Sub3_Sub1_4.anInt6053;
							local228 = local313.anInt6055 - Static113.aClass1_Sub3_Sub3_Sub1_4.anInt6055;
							this.method3929(super.aClass31Array3[0], local228, 5760000, arg0, local19, local182.anInt3868, local221);
						}
					}
				}
			}
			local19.O(local24);
			local19.ZA(super.anInt6053, super.anInt6045, super.anInt6055);
		}
		arg0.o(local38, local41);
		@Pc(378) Class13_Sub7 local378 = Static120.method2160(super.aClass31Array3.length);
		if (super.aClass13_Sub8_6 == null) {
			arg0.method2605(super.aClass31Array3, local19, local378.aClass13_Sub1Array1, Static113.aClass1_Sub3_Sub3_Sub1_4 == this ? 1 : 0);
		} else {
			@Pc(400) Class116 local400 = super.aClass13_Sub8_6.method5943();
			arg0.method2602(super.aClass31Array3, local400, local19, local378.aClass13_Sub1Array1, Static113.aClass1_Sub3_Sub3_Sub1_4 == this ? 1 : 0);
		}
		this.method4840(false, arg0, super.aClass31Array3);
		if (super.aClass31Array3[2] != null) {
			if (local24 != 0) {
				super.aClass31Array3[2].k(local24);
			}
			super.aClass31Array3[2].ja(super.anInt6053 - super.aClass3_Sub11_3.anInt1455, super.anInt6045 - super.aClass3_Sub11_3.anInt1454, -super.aClass3_Sub11_3.anInt1463 + super.anInt6055);
		}
		super.anInt6090 = Static164.anInt3507;
		return local378;
	}

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "(I)I")
	@Override
	public int method4835() {
		return -1;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IZILclient!qa;)Z")
	@Override
	public boolean method5835(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class75 arg2) {
		if (this.aClass8_1 == null || !this.method3931(arg2, 131072)) {
			return true;
		}
		@Pc(19) Class106 local19 = arg2.method2587();
		@Pc(24) int local24 = super.aClass160_7.method3877();
		local19.O(local24);
		local19.ZA(super.anInt6053, super.anInt6045, super.anInt6055);
		for (@Pc(37) int local37 = 0; local37 < super.aClass31Array3.length; local37++) {
			if (super.aClass31Array3[local37] != null && super.aClass31Array3[local37].method5702(arg0, arg1, local19, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(BLclient!rn;ZIILclient!qa;I)V")
	@Override
	public void method5836(@OriginalArg(1) Class1 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class75 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mv", name = "i", descriptor = "(I)I")
	@Override
	public int method4828() {
		return super.anInt6075;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(BIII)V")
	public void method3927(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (super.anInt6092 != -1 && Static196.aClass30_2.method942(super.anInt6092).anInt3324 == 1) {
			super.anInt6092 = -1;
		}
		@Pc(30) Class186 local30;
		if (super.anInt6104 != -1) {
			local30 = Static102.aClass91_2.method2560(super.anInt6104);
			if (local30.aBoolean406 && local30.anInt5611 != -1 && Static196.aClass30_2.method942(local30.anInt5611).anInt3324 == 1) {
				super.anInt6104 = -1;
			}
		}
		if (super.anInt6079 != -1) {
			local30 = Static102.aClass91_2.method2560(super.anInt6079);
			if (local30.aBoolean406 && local30.anInt5611 != -1 && Static196.aClass30_2.method942(local30.anInt5611).anInt3324 == 1) {
				super.anInt6079 = -1;
			}
		}
		this.anInt4909 = -1;
		if (arg2 < 0 || Static399.anInt6923 <= arg2 || arg1 < 0 || Static127.anInt2696 <= arg1) {
			this.method3933(arg2, arg1);
		} else if (super.anIntArray453[0] >= 0 && super.anIntArray453[0] < Static399.anInt6923 && super.anIntArray454[0] >= 0 && Static127.anInt2696 > super.anIntArray454[0]) {
			if (arg0 == 2) {
				Static300.method4441(this, arg2, arg1);
			}
			this.method3932(arg2, arg1, arg0);
		} else {
			this.method3933(arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!mv", name = "m", descriptor = "(I)Z")
	public boolean method3928() {
		return this.aClass8_1 != null;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(Lclient!c;IZILclient!qa;Lclient!ia;II)V")
	private void method3929(@OriginalArg(0) Class31 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class75 arg3, @OriginalArg(5) Class106 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = arg1 * arg1 + arg6 * arg6;
		if (local11 < 16384 || local11 > arg2) {
			return;
		}
		@Pc(39) int local39 = (int) (Math.atan2((double) arg6, (double) arg1) * 2607.5945876176133D) & 0x3FFF;
		@Pc(51) Class31 local51 = Static76.method1359(super.anInt6118, local39, arg5, super.anInt6114, arg3, super.anInt6057);
		if (local51 != null) {
			arg3.method2572(false);
			local51.method5704(arg4, null, 0);
			arg3.method2572(true);
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public String method3930() {
		@Pc(14) String local14 = "";
		if (Static182.aStringArray84 != null) {
			local14 = local14 + Static182.aStringArray84[this.aByte65];
		}
		@Pc(36) int[] local36;
		if (this.aByte66 == 1 && Static222.anIntArray326 != null) {
			local36 = Static222.anIntArray326;
		} else {
			local36 = Static253.anIntArray366;
		}
		if (local36 != null && local36[this.aByte65] != -1) {
			@Pc(58) Class58 local58 = Static58.aClass192_1.method4696(local36[this.aByte65]);
			if (local58.aChar3 == 's') {
				local14 = local14 + local58.method1409(this.aByte64 & 0xFF);
			} else {
				Static379.method1671(new Throwable(), "gdn1");
				local36[this.aByte65] = -1;
			}
		}
		local14 = local14 + this.aString48;
		if (Static180.aStringArray82 != null) {
			local14 = local14 + Static180.aStringArray82[this.aByte65];
		}
		return local14;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5840(@OriginalArg(1) Class75 arg0) {
		if (this.aClass8_1 != null && (super.aBoolean430 || this.method3931(arg0, 0))) {
			this.method4840(super.aBoolean430, arg0, super.aClass31Array3);
		}
	}

	@OriginalMember(owner = "client!mv", name = "d", descriptor = "(I)I")
	@Override
	protected int method4842() {
		return this.anInt4881;
	}

	@OriginalMember(owner = "client!mv", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5839() {
		return false;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)I")
	@Override
	public int method4831() {
		return this.aClass8_1 == null || this.aClass8_1.anInt274 == -1 ? super.method4831() : Static154.aClass251_2.method5684(this.aClass8_1.anInt274).anInt1578;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(BLclient!qa;I)Z")
	private boolean method3931(@OriginalArg(1) Class75 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class137 local11 = this.method4837();
		@Pc(30) Class96 local30 = super.anInt6092 != -1 && super.anInt6083 == 0 ? Static196.aClass30_2.method942(super.anInt6092) : null;
		@Pc(51) Class96 local51 = super.anInt6080 == -1 || this.aBoolean366 || super.aBoolean429 && local30 != null ? null : Static196.aClass30_2.method942(super.anInt6080);
		@Pc(54) int local54 = local11.anInt4218;
		@Pc(57) int local57 = local11.anInt4199;
		if (local54 != 0 || local57 != 0 || local11.anInt4219 != 0 || local11.anInt4221 != 0) {
			arg1 |= 0x7;
		}
		@Pc(103) boolean local103 = super.aByte81 != 0 && super.anInt6116 <= Static290.anInt5325 && Static290.anInt5325 < super.anInt6103;
		if (local103) {
			arg1 |= 0x80000;
		}
		@Pc(144) Class31 local144 = super.aClass31Array3[0] = this.aClass8_1.method244(arg1, local30, Static154.aClass251_2, Static427.aClass237_1, super.lb, Static196.aClass30_2, super.anInt6086, super.anInt6082, local51, super.anInt6127, Static369.aClass11_1, arg0, super.anInt6056, super.aClass34Array3, super.anInt6117, Static279.aClass109_8, Static89.aClass157_1);
		@Pc(155) int local155 = Static125.method777();
		if (Static102.anInt619 < 96 && local155 > 50) {
			Static265.method3994();
		}
		@Pc(178) int local178;
		if (Static356.aClass238_6 != Static411.aClass238_7 && local155 < 50) {
			local178 = 50 - local155;
			while (local178 > Static421.anInt4505) {
				Static438.aByteArrayArray23[Static421.anInt4505] = new byte[102400];
				Static421.anInt4505++;
			}
			while (local178 < Static421.anInt4505) {
				Static421.anInt4505--;
				Static438.aByteArrayArray23[Static421.anInt4505] = null;
			}
		} else if (Static356.aClass238_6 != Static411.aClass238_7) {
			Static421.anInt4505 = 0;
			Static438.aByteArrayArray23 = new byte[50][];
		}
		if (local144 == null) {
			return false;
		}
		super.anInt6075 = local144.b();
		this.method4839(local144);
		local178 = super.aClass160_7.method3877();
		if (local54 == 0 && local57 == 0) {
			this.method4836(this.method4831() << 7, this.method4831() << 7, local178, 0, 0);
		} else {
			this.method4836(local54, local57, local178, local11.anInt4202, local11.anInt4198);
			if (super.anInt6114 != 0) {
				local144.WA(super.anInt6114);
			}
			if (super.anInt6057 != 0) {
				local144.o(super.anInt6057);
			}
			if (super.anInt6118 != 0) {
				local144.ja(0, super.anInt6118, 0);
			}
		}
		if (local103) {
			local144.method5714(super.aByte79, super.aByte82, super.aByte80, super.aByte81 & 0xFF);
		}
		@Pc(335) Class186 local335;
		@Pc(350) boolean local350;
		@Pc(352) int local352;
		@Pc(395) Class31 local395;
		if (this.aBoolean366 || super.anInt6104 == -1 || super.anInt6074 == -1) {
			super.aClass31Array3[1] = null;
		} else {
			local335 = Static102.aClass91_2.method2560(super.anInt6104);
			local350 = local335.aByte73 == 3 && (local54 != 0 || local57 != 0);
			local352 = local7;
			if (local350) {
				local352 = local7 | 0x7;
			} else {
				if (super.anInt6091 != 0) {
					local352 = local7 | 0x5;
				}
				if (super.anInt6063 != 0) {
					local352 |= 0x2;
				}
			}
			local395 = super.aClass31Array3[1] = local335.method4526(super.anInt6095, local352, arg0, super.anInt6074, Static196.aClass30_2, super.anInt6070);
			if (local395 != null) {
				if (super.anInt6063 != 0) {
					local395.ja(0, -super.anInt6063 << 0, 0);
				}
				if (super.anInt6091 != 0) {
					local395.k(super.anInt6091 * 2048);
				}
				if (local350) {
					if (super.anInt6114 != 0) {
						local395.WA(super.anInt6114);
					}
					if (super.anInt6057 != 0) {
						local395.o(super.anInt6057);
					}
					if (super.anInt6118 != 0) {
						local395.ja(0, super.anInt6118, 0);
					}
				}
			}
		}
		if (this.aBoolean366 || super.anInt6079 == -1 || super.anInt6106 == -1) {
			super.aClass31Array3[3] = null;
		} else {
			local335 = Static102.aClass91_2.method2560(super.anInt6079);
			local350 = local335.aByte73 == 3 && (local54 != 0 || local57 != 0);
			local352 = local7;
			if (local350) {
				local352 = local7 | 0x7;
			} else {
				if (super.anInt6130 != 0) {
					local352 = local7 | 0x5;
				}
				if (super.anInt6113 != 0) {
					local352 |= 0x2;
				}
			}
			local395 = super.aClass31Array3[3] = local335.method4521(super.anInt6131, super.anInt6088, super.anInt6106, Static196.aClass30_2, local352, arg0);
			if (local395 != null) {
				if (super.anInt6113 != 0) {
					local395.ja(0, -super.anInt6113 << 0, 0);
				}
				if (super.anInt6130 != 0) {
					local395.k(super.anInt6130 * 2048);
				}
				if (local350) {
					if (super.anInt6114 != 0) {
						local395.WA(super.anInt6114);
					}
					if (super.anInt6057 != 0) {
						local395.o(super.anInt6057);
					}
					if (super.anInt6118 != 0) {
						local395.ja(0, super.anInt6118, 0);
					}
				}
			}
		}
		super.aClass31Array3[2] = null;
		if (!this.aBoolean366 && super.aClass3_Sub11_3 != null) {
			if (Static290.anInt5325 >= super.aClass3_Sub11_3.anInt1451) {
				super.aClass3_Sub11_3 = null;
			} else if (super.aClass3_Sub11_3.anInt1467 <= Static290.anInt5325) {
				@Pc(632) Class31 local632 = super.aClass3_Sub11_3.method1210(local7 | 0x7, arg0);
				if (local632 != null) {
					local632.ja(super.aClass3_Sub11_3.anInt1455 - super.anInt6053, super.aClass3_Sub11_3.anInt1454 - super.anInt6045, super.aClass3_Sub11_3.anInt1463 - super.anInt6055);
					if (local178 != 0) {
						local632.k(-local178 & 0x3FFF);
					}
					super.aClass31Array3[2] = local632;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IIBI)V")
	public void method3932(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (super.anInt6133 < 9) {
			super.anInt6133++;
		}
		for (@Pc(23) int local23 = super.anInt6133; local23 > 0; local23--) {
			super.anIntArray453[local23] = super.anIntArray453[local23 - 1];
			super.anIntArray454[local23] = super.anIntArray454[local23 - 1];
			super.aByteArray69[local23] = super.aByteArray69[local23 - 1];
		}
		super.anIntArray453[0] = arg0;
		super.anIntArray454[0] = arg1;
		super.aByteArray69[0] = arg2;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(III)V")
	public void method3933(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.anInt6134 = 0;
		super.anInt6136 = 0;
		super.anInt6133 = 0;
		super.anIntArray453[0] = arg0;
		super.anIntArray454[0] = arg1;
		@Pc(26) int local26 = this.method4831();
		super.anInt6055 = super.anIntArray454[0] * 128 + local26 * 64;
		super.anInt6053 = local26 * 64 + super.anIntArray453[0] * 128;
		if (Static113.aClass1_Sub3_Sub3_Sub1_4 == this) {
			Static373.method5169();
		}
		if (super.aClass13_Sub8_6 != null) {
			super.aClass13_Sub8_6.method5942();
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(Lclient!bt;I)V")
	public void method3934(@OriginalArg(0) Class3_Sub2 arg0) {
		arg0.anInt7620 = 0;
		@Pc(10) int local10 = arg0.method6053();
		this.aByte66 = (byte) (local10 & 0x1);
		@Pc(24) boolean local24 = (local10 & 0x2) != 0;
		@Pc(32) boolean local32 = (local10 & 0x4) != 0;
		@Pc(36) int local36 = super.method4831();
		this.method4844((local10 >> 3 & 0x7) + 1);
		this.aByte65 = (byte) (local10 >> 6 & 0x3);
		super.anInt6053 += this.method4831() - local36 << 6;
		super.anInt6055 += this.method4831() - local36 << 6;
		this.aByte64 = arg0.method6011();
		this.anInt4887 = arg0.method6011();
		this.anInt4890 = arg0.method6011();
		this.anInt4876 = 0;
		@Pc(101) int local101 = -1;
		@Pc(104) int[] local104 = new int[12];
		@Pc(122) int local122;
		@Pc(129) int local129;
		@Pc(174) int local174;
		for (@Pc(106) int local106 = 0; local106 < 12; local106++) {
			@Pc(111) int local111 = arg0.method6053();
			if (local111 == 0) {
				local104[local106] = 0;
			} else {
				local122 = arg0.method6053();
				local129 = (local111 << 8) + local122;
				if (local106 == 0 && local129 == 65535) {
					local101 = arg0.method6004();
					this.anInt4876 = arg0.method6053();
					break;
				}
				if (local129 >= 32768) {
					local129 = Static10.anIntArray25[local129 - 32768];
					local104[local106] = local129 | 0x40000000;
					local174 = Static89.aClass157_1.method3832(local129).anInt5838;
					if (local174 != 0) {
						this.anInt4876 = local174;
					}
				} else {
					local104[local106] = local129 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(198) int[] local198 = new int[5];
		for (local122 = 0; local122 < 5; local122++) {
			local129 = arg0.method6053();
			if (local129 < 0 || local129 >= Static427.aShortArrayArray7[local122].length) {
				local129 = 0;
			}
			local198[local122] = local129;
		}
		this.anInt4881 = arg0.method6004();
		this.aString48 = arg0.method6027();
		if (local24) {
			this.aString47 = arg0.method6027();
		} else {
			this.aString47 = this.aString48;
		}
		this.anInt4882 = arg0.method6053();
		if (local32) {
			this.anInt4880 = arg0.method6004();
			this.anInt4893 = -1;
			this.anInt4905 = this.anInt4882;
		} else {
			this.anInt4880 = 0;
			this.anInt4905 = arg0.method6053();
			this.anInt4893 = arg0.method6053();
			if (this.anInt4893 == 255) {
				this.anInt4893 = -1;
			}
		}
		local129 = this.anInt4904;
		this.anInt4904 = arg0.method6053();
		@Pc(312) int local312;
		if (this.anInt4904 == 0) {
			Static290.method4264(this);
		} else {
			local174 = this.anInt4894;
			@Pc(309) int local309 = this.anInt4878;
			local312 = this.anInt4907;
			@Pc(315) int local315 = this.anInt4901;
			@Pc(318) int local318 = this.anInt4896;
			this.anInt4894 = arg0.method6004();
			this.anInt4878 = arg0.method6004();
			this.anInt4907 = arg0.method6004();
			this.anInt4901 = arg0.method6004();
			this.anInt4896 = arg0.method6053();
			if (this.anInt4904 != local129 || local174 != this.anInt4894 || this.anInt4878 != local309 || local312 != this.anInt4907 || this.anInt4901 != local315 || this.anInt4896 != local318) {
				Static4.method748(this);
			}
		}
		if (this.aClass8_1 == null) {
			this.aClass8_1 = new Class8();
		}
		local174 = this.aClass8_1.anInt274;
		@Pc(406) int[] local406 = this.aClass8_1.anIntArray26;
		this.aClass8_1.method248(local198, local101, this.aByte66 == 1, local104, this.method4842());
		if (local174 != local101) {
			super.anInt6053 = (super.anIntArray453[0] << 7) + (this.method4831() << 6);
			super.anInt6055 = (super.anIntArray454[0] << 7) + (this.method4831() << 6);
		}
		if (Static177.anInt3617 == super.anInt6066 && local406 != null) {
			for (local312 = 0; local312 < local198.length; local312++) {
				if (local406[local312] != local198[local312]) {
					Static89.aClass157_1.method3843();
					break;
				}
			}
		}
		if (super.aClass13_Sub8_6 != null) {
			super.aClass13_Sub8_6.method5942();
		}
		if (super.anInt6080 == -1 || !super.aBoolean429) {
			return;
		}
		@Pc(509) Class137 local509 = this.method4837();
		if (!local509.method3444(super.anInt6080)) {
			super.anInt6080 = -1;
			super.aBoolean429 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "(IZ)Ljava/lang/String;")
	public String method3935() {
		return this.aString47;
	}
}
