import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public final class Class7_Sub2_Sub3_Sub2 extends Class7_Sub2_Sub3 {

	@OriginalMember(owner = "client!ln", name = "Cc", descriptor = "I")
	private int anInt4409;

	@OriginalMember(owner = "client!ln", name = "Fc", descriptor = "Ljava/lang/String;")
	public String aString36;

	@OriginalMember(owner = "client!ln", name = "Zc", descriptor = "I")
	public int anInt4425;

	@OriginalMember(owner = "client!ln", name = "md", descriptor = "Lclient!qo;")
	public Class206 aClass206_1;

	@OriginalMember(owner = "client!ln", name = "qd", descriptor = "Ljava/lang/String;")
	public String aString37;

	@OriginalMember(owner = "client!ln", name = "td", descriptor = "I")
	public int anInt4441;

	@OriginalMember(owner = "client!ln", name = "Gc", descriptor = "Z")
	public boolean aBoolean380 = false;

	@OriginalMember(owner = "client!ln", name = "Mc", descriptor = "Z")
	public boolean aBoolean381 = false;

	@OriginalMember(owner = "client!ln", name = "Bc", descriptor = "I")
	public int anInt4408 = 0;

	@OriginalMember(owner = "client!ln", name = "Nc", descriptor = "Z")
	public boolean aBoolean382 = false;

	@OriginalMember(owner = "client!ln", name = "Kc", descriptor = "I")
	public int anInt4413 = -1;

	@OriginalMember(owner = "client!ln", name = "Lc", descriptor = "I")
	public int anInt4414 = 0;

	@OriginalMember(owner = "client!ln", name = "Jc", descriptor = "B")
	private byte aByte82 = 0;

	@OriginalMember(owner = "client!ln", name = "Vc", descriptor = "I")
	public int anInt4421 = -1;

	@OriginalMember(owner = "client!ln", name = "Uc", descriptor = "I")
	public int anInt4420 = 255;

	@OriginalMember(owner = "client!ln", name = "bd", descriptor = "I")
	public int anInt4427 = -1;

	@OriginalMember(owner = "client!ln", name = "Dc", descriptor = "I")
	public int anInt4410 = 0;

	@OriginalMember(owner = "client!ln", name = "fd", descriptor = "I")
	public int anInt4431 = -1;

	@OriginalMember(owner = "client!ln", name = "Hc", descriptor = "I")
	public int anInt4412 = -1;

	@OriginalMember(owner = "client!ln", name = "hd", descriptor = "B")
	private byte aByte83 = 0;

	@OriginalMember(owner = "client!ln", name = "rd", descriptor = "I")
	public int anInt4439 = 0;

	@OriginalMember(owner = "client!ln", name = "pd", descriptor = "I")
	public int anInt4438 = -1;

	@OriginalMember(owner = "client!ln", name = "ed", descriptor = "I")
	public int anInt4430 = 0;

	@OriginalMember(owner = "client!ln", name = "od", descriptor = "B")
	private byte aByte84 = 0;

	@OriginalMember(owner = "client!ln", name = "vd", descriptor = "I")
	public int anInt4443 = -1;

	@OriginalMember(owner = "client!ln", name = "sd", descriptor = "I")
	public int anInt4440 = -1;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5267(@OriginalArg(1) Class172 arg0) {
		if (this.aClass206_1 != null && (super.aBoolean379 || this.method3521(0, arg0))) {
			this.method3501(super.aBoolean379, arg0, super.aClass9Array3);
			super.aClass9Array3[0] = super.aClass9Array3[1] = super.aClass9Array3[2] = super.aClass9Array3[3] = null;
		}
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(I)I")
	@Override
	public int method3499() {
		return this.aClass206_1 == null || this.aClass206_1.anInt5707 == -1 ? super.method3499() : Static364.aClass96_2.method2199(this.aClass206_1.anInt5707).anInt1616;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(III)V")
	public void method3517(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.anIntArray287[0] = arg0;
		super.anInt4403 = 0;
		super.anInt4405 = 0;
		super.anInt4404 = 0;
		super.anIntArray288[0] = arg1;
		@Pc(26) int local26 = this.method3499();
		super.anInt4318 = super.anIntArray287[0] * 128 + local26 * 64;
		super.anInt4321 = super.anIntArray288[0] * 128 + local26 * 64;
		if (Static379.aClass7_Sub2_Sub3_Sub2_2 == this) {
			Static214.method3288();
		}
		if (super.aClass6_Sub8_7 != null) {
			super.aClass6_Sub8_7.method5916();
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILclient!qa;II)Z")
	@Override
	public boolean method5270(@OriginalArg(1) Class172 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass206_1 == null || !this.method3521(131072, arg0)) {
			return false;
		}
		@Pc(19) Class107 local19 = arg0.method5495();
		@Pc(30) int local30 = super.aClass91_7.method2048();
		local19.O(local30);
		local19.ZA(super.anInt4318, super.anInt4320, super.anInt4321);
		@Pc(43) boolean local43 = false;
		for (@Pc(45) int local45 = 0; super.aClass9Array3.length > local45; local45++) {
			if (super.aClass9Array3[local45] != null && super.aClass9Array3[local45].method5693(arg2, arg1, local19, true)) {
				local43 = true;
				break;
			}
		}
		super.aClass9Array3[0] = super.aClass9Array3[1] = super.aClass9Array3[2] = super.aClass9Array3[3] = null;
		return local43;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)I")
	@Override
	protected int method3498() {
		return this.anInt4409;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIBB)V")
	public void method3518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (super.anInt4366 != -1 && Static301.aClass170_3.method3936(super.anInt4366).anInt3975 == 1) {
			super.anInt4366 = -1;
		}
		@Pc(37) Class13 local37;
		if (super.anInt4345 != -1) {
			local37 = Static96.aClass41_2.method1134(super.anInt4345);
			if (local37.aBoolean32 && local37.anInt466 != -1 && Static301.aClass170_3.method3936(local37.anInt466).anInt3975 == 1) {
				super.anInt4345 = -1;
			}
		}
		if (super.anInt4349 != -1) {
			local37 = Static96.aClass41_2.method1134(super.anInt4349);
			if (local37.aBoolean32 && local37.anInt466 != -1 && Static301.aClass170_3.method3936(local37.anInt466).anInt3975 == 1) {
				super.anInt4349 = -1;
			}
		}
		this.anInt4443 = -1;
		if (arg1 < 0 || Static40.anInt1089 <= arg1 || arg0 < 0 || arg0 >= Static44.anInt7276) {
			this.method3517(arg1, arg0);
		} else if (super.anIntArray287[0] >= 0 && Static40.anInt1089 > super.anIntArray287[0] && super.anIntArray288[0] >= 0 && Static44.anInt7276 > super.anIntArray288[0]) {
			if (arg2 == 2) {
				Static45.method848(this, arg1, arg0);
			}
			this.method3520(arg0, arg2, arg1);
		} else {
			this.method3517(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "(B)V")
	@Override
	public void method5268() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ln", name = "f", descriptor = "(B)I")
	@Override
	public int method3510() {
		return -1;
	}

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "(I)I")
	@Override
	public int method3494() {
		return super.anInt4371;
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method5276() {
		return false;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IILclient!qa;ILclient!ia;IILclient!c;)V")
	private void method3519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class172 arg2, @OriginalArg(4) Class107 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class9 arg6) {
		@Pc(11) int local11 = arg5 * arg5 + arg4 * arg4;
		if (local11 < 16384 || arg1 < local11) {
			return;
		}
		@Pc(33) int local33 = (int) (Math.atan2((double) arg4, (double) arg5) * 2607.5945876176133D) & 0x3FFF;
		@Pc(54) Class9 local54 = Static239.method1379(super.anInt4382, super.anInt4381, super.anInt4353, local33, arg2, arg0);
		if (local54 != null) {
			arg2.method5527(false);
			local54.method5695(arg3, null, 0);
			arg2.method5527(true);
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IBBI)V")
	public void method3520(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2) {
		if (super.anInt4404 < 9) {
			super.anInt4404++;
		}
		for (@Pc(24) int local24 = super.anInt4404; local24 > 0; local24--) {
			super.anIntArray287[local24] = super.anIntArray287[local24 - 1];
			super.anIntArray288[local24] = super.anIntArray288[local24 - 1];
			super.aByteArray52[local24] = super.aByteArray52[local24 - 1];
		}
		super.anIntArray287[0] = arg2;
		super.anIntArray288[0] = arg0;
		super.aByteArray52[0] = arg1;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IILclient!qa;)Z")
	private boolean method3521(@OriginalArg(0) int arg0, @OriginalArg(2) Class172 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(13) Class1 local13 = this.method3514();
		@Pc(36) Class128 local36 = super.anInt4366 != -1 && super.anInt4387 == 0 ? Static301.aClass170_3.method3936(super.anInt4366) : null;
		@Pc(57) Class128 local57 = super.anInt4389 == -1 || this.aBoolean382 || super.aBoolean378 && local36 != null ? null : Static301.aClass170_3.method3936(super.anInt4389);
		@Pc(60) int local60 = local13.anInt35;
		@Pc(63) int local63 = local13.anInt3;
		if (local60 != 0 || local63 != 0 || local13.anInt38 != 0 || local13.anInt26 != 0) {
			arg0 |= 0x7;
		}
		@Pc(101) boolean local101 = super.aByte79 != 0 && super.anInt4361 <= Static253.anInt4787 && super.anInt4365 > Static253.anInt4787;
		if (local101) {
			arg0 |= 0x80000;
		}
		@Pc(142) Class9 local142 = super.aClass9Array3[0] = this.aClass206_1.method4459(Static314.aClass12_2, super.anInt4355, super.anInt4327, Static85.aClass49_1, local36, super.aClass17Array3, super.anInt4397, Static24.aClass69_1, super.anInt4336, Static432.aClass73_1, arg1, Static301.aClass170_3, arg0, local57, super.anInt4328, super.anInt4350, Static364.aClass96_2);
		@Pc(145) int local145 = Static280.method3939();
		if (Static286.anInt1448 < 96 && local145 > 50) {
			Static201.method4112();
		}
		@Pc(170) int local170;
		if (Static191.aClass182_6 != Static10.aClass182_1 && local145 < 50) {
			local170 = 50 - local145;
			while (local170 > Static273.anInt5070) {
				Static257.aByteArrayArray10[Static273.anInt5070] = new byte[102400];
				Static273.anInt5070++;
			}
			while (local170 < Static273.anInt5070) {
				Static273.anInt5070--;
				Static257.aByteArrayArray10[Static273.anInt5070] = null;
			}
		} else if (Static191.aClass182_6 != Static10.aClass182_1) {
			Static273.anInt5070 = 0;
			Static257.aByteArrayArray10 = new byte[50][];
		}
		if (local142 == null) {
			return false;
		}
		super.anInt4371 = local142.b();
		this.method3509(local142);
		local170 = super.aClass91_7.method2048();
		if (local60 == 0 && local63 == 0) {
			this.method3505(0, this.method3499() << 7, this.method3499() << 7, local170, 0);
		} else {
			this.method3505(local13.anInt47, local63, local60, local170, local13.anInt41);
			if (super.anInt4353 != 0) {
				local142.WA(super.anInt4353);
			}
			if (super.anInt4381 != 0) {
				local142.o(super.anInt4381);
			}
			if (super.anInt4382 != 0) {
				local142.ja(0, super.anInt4382, 0);
			}
		}
		if (local101) {
			local142.method5700(super.aByte80, super.aByte81, super.aByte78, super.aByte79 & 0xFF);
		}
		@Pc(341) Class13 local341;
		@Pc(361) boolean local361;
		@Pc(363) int local363;
		@Pc(411) Class9 local411;
		if (this.aBoolean382 || super.anInt4345 == -1 || super.anInt4380 == -1) {
			super.aClass9Array3[1] = null;
		} else {
			local341 = Static96.aClass41_2.method1134(super.anInt4345);
			local361 = local341.aByte11 == 3 && (local60 != 0 || local63 != 0);
			local363 = local7;
			if (local361) {
				local363 = local7 | 0x7;
			} else {
				if (super.anInt4326 != 0) {
					local363 = local7 | 0x5;
				}
				if (super.anInt4351 != 0) {
					local363 |= 0x2;
				}
			}
			local411 = super.aClass9Array3[1] = local341.method373(arg1, super.anInt4380, super.anInt4390, super.anInt4342, local363, Static301.aClass170_3);
			if (local411 != null) {
				if (super.anInt4351 != 0) {
					local411.ja(0, -super.anInt4351 << 0, 0);
				}
				if (super.anInt4326 != 0) {
					local411.k(super.anInt4326 * 2048);
				}
				if (local361) {
					if (super.anInt4353 != 0) {
						local411.WA(super.anInt4353);
					}
					if (super.anInt4381 != 0) {
						local411.o(super.anInt4381);
					}
					if (super.anInt4382 != 0) {
						local411.ja(0, super.anInt4382, 0);
					}
				}
			}
		}
		if (this.aBoolean382 || super.anInt4349 == -1 || super.anInt4346 == -1) {
			super.aClass9Array3[3] = null;
		} else {
			local341 = Static96.aClass41_2.method1134(super.anInt4349);
			local361 = local341.aByte11 == 3 && (local60 != 0 || local63 != 0);
			local363 = local7;
			if (local361) {
				local363 = local7 | 0x7;
			} else {
				if (super.anInt4341 != 0) {
					local363 = local7 | 0x5;
				}
				if (super.anInt4360 != 0) {
					local363 |= 0x2;
				}
			}
			local411 = super.aClass9Array3[3] = local341.method374(Static301.aClass170_3, super.anInt4346, arg1, local363, super.anInt4329, super.anInt4368);
			if (local411 != null) {
				if (super.anInt4360 != 0) {
					local411.ja(0, -super.anInt4360 << 0, 0);
				}
				if (super.anInt4341 != 0) {
					local411.k(super.anInt4341 * 2048);
				}
				if (local361) {
					if (super.anInt4353 != 0) {
						local411.WA(super.anInt4353);
					}
					if (super.anInt4381 != 0) {
						local411.o(super.anInt4381);
					}
					if (super.anInt4382 != 0) {
						local411.ja(0, super.anInt4382, 0);
					}
				}
			}
		}
		super.aClass9Array3[2] = null;
		if (!this.aBoolean382 && super.aClass3_Sub15_3 != null) {
			if (Static253.anInt4787 >= super.aClass3_Sub15_3.anInt2340) {
				super.aClass3_Sub15_3 = null;
			} else if (super.aClass3_Sub15_3.anInt2333 <= Static253.anInt4787) {
				@Pc(657) Class9 local657 = super.aClass3_Sub15_3.method1800(local7 | 0x7, arg1);
				if (local657 != null) {
					local657.ja(-super.anInt4318 + super.aClass3_Sub15_3.anInt2336, -super.anInt4320 + super.aClass3_Sub15_3.anInt2339, super.aClass3_Sub15_3.anInt2323 - super.anInt4321);
					if (local170 != 0) {
						local657.k(-local170 & 0x3FFF);
					}
					super.aClass9Array3[2] = local657;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(BZ)Ljava/lang/String;")
	public String method3522() {
		return this.aString36;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZLclient!qa;)Lclient!ae;")
	@Override
	public Class6_Sub1 method5274(@OriginalArg(1) Class172 arg0) {
		if (this.aClass206_1 == null || !this.method3521(2048, arg0)) {
			return null;
		}
		@Pc(19) Class107 local19 = arg0.method5495();
		@Pc(24) int local24 = super.aClass91_7.method2048();
		local19.O(local24);
		local19.ZA(super.anInt4318, super.anInt4320, super.anInt4321);
		@Pc(38) float local38 = arg0.la();
		@Pc(41) float local41 = arg0.w();
		if (Static374.aClass20_Sub1_1.aBoolean191) {
			@Pc(48) Class1 local48 = this.method3514();
			if (local48.aBoolean1 && (this.aClass206_1.anInt5707 == -1 || Static364.aClass96_2.method2199(this.aClass206_1.anInt5707).aBoolean131)) {
				@Pc(82) Class128 local82 = super.anInt4366 != -1 && super.anInt4387 == 0 ? Static301.aClass170_3.method3936(super.anInt4366) : null;
				@Pc(103) Class128 local103 = super.anInt4389 == -1 || this.aBoolean382 || super.aBoolean378 && local82 != null ? null : Static301.aClass170_3.method3936(super.anInt4389);
				@Pc(137) Class9 local137 = Static9.method113(arg0, local24, 1, 160, 0, super.anInt4353, super.aBoolean376, super.aClass9Array3[0], local103 == null ? super.anInt4327 : super.anInt4350, 0, super.anInt4381, local103 == null ? local82 : local103, super.anInt4382, 240);
				if (local137 != null) {
					arg0.o(local38, local41 - 128.0F);
					arg0.method5527(false);
					local137.method5695(local19, null, 0);
					arg0.method5527(true);
				}
			}
		}
		if (Static379.aClass7_Sub2_Sub3_Sub2_2 == this) {
			arg0.o(local38, local41 - 144.0F);
			local19.R(super.anInt4318, super.anInt4320, super.anInt4321);
			for (@Pc(178) int local178 = Static331.aClass196Array41.length - 1; local178 >= 0; local178--) {
				@Pc(184) Class196 local184 = Static331.aClass196Array41[local178];
				if (local184 != null && local184.anInt5510 != -1) {
					@Pc(233) int local233;
					@Pc(226) int local226;
					if (local184.anInt5507 == 1 && local184.anInt5501 >= 0 && local184.anInt5501 < Static139.aClass7_Sub2_Sub3_Sub1Array11.length) {
						@Pc(217) Class7_Sub2_Sub3_Sub1 local217 = Static139.aClass7_Sub2_Sub3_Sub1Array11[local184.anInt5501];
						if (local217 != null) {
							local226 = local217.anInt4318 - Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4318;
							local233 = local217.anInt4321 - Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4321;
							this.method3519(local184.anInt5510, 5760000, arg0, local19, local226, local233, super.aClass9Array3[0]);
						}
					}
					if (local184.anInt5507 == 2) {
						@Pc(259) int local259 = local184.anInt5500 + 64 - Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4318;
						local226 = local184.anInt5508 + 64 - Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4321;
						local233 = local184.anInt5503 << 7;
						local233 *= local233;
						this.method3519(local184.anInt5510, local233, arg0, local19, local259, local226, super.aClass9Array3[0]);
					}
					if (local184.anInt5507 == 10 && local184.anInt5501 >= 0 && Static361.aClass7_Sub2_Sub3_Sub2Array1.length > local184.anInt5501) {
						@Pc(314) Class7_Sub2_Sub3_Sub2 local314 = Static361.aClass7_Sub2_Sub3_Sub2Array1[local184.anInt5501];
						if (local314 != null) {
							local226 = local314.anInt4318 - Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4318;
							local233 = local314.anInt4321 - Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4321;
							this.method3519(local184.anInt5510, 5760000, arg0, local19, local226, local233, super.aClass9Array3[0]);
						}
					}
				}
			}
			local19.O(local24);
			local19.ZA(super.anInt4318, super.anInt4320, super.anInt4321);
		}
		arg0.o(local38, local41);
		@Pc(371) Class6_Sub1 local371 = Static43.method829(super.aClass9Array3.length);
		if (super.aClass6_Sub8_7 == null) {
			arg0.method5509(super.aClass9Array3, local19, local371.aClass6_Sub5Array1, Static379.aClass7_Sub2_Sub3_Sub2_2 == this ? 1 : 0);
		} else {
			@Pc(393) Class227 local393 = super.aClass6_Sub8_7.method5923();
			arg0.method5522(super.aClass9Array3, local393, local19, local371.aClass6_Sub5Array1, Static379.aClass7_Sub2_Sub3_Sub2_2 == this ? 1 : 0);
		}
		this.method3501(false, arg0, super.aClass9Array3);
		if (super.aClass9Array3[2] != null) {
			if (local24 != 0) {
				super.aClass9Array3[2].k(local24);
			}
			super.aClass9Array3[2].ja(-super.aClass3_Sub15_3.anInt2336 + super.anInt4318, -super.aClass3_Sub15_3.anInt2339 + super.anInt4320, -super.aClass3_Sub15_3.anInt2323 + super.anInt4321);
		}
		super.anInt4375 = Static52.anInt1374;
		super.aClass9Array3[0] = super.aClass9Array3[1] = super.aClass9Array3[2] = super.aClass9Array3[3] = null;
		return local371;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(BLclient!cu;)V")
	public void method3523(@OriginalArg(1) Class3_Sub7 arg0) {
		arg0.anInt3235 = 0;
		@Pc(10) int local10 = arg0.method2582();
		this.aByte83 = (byte) (local10 & 0x1);
		@Pc(27) boolean local27 = (local10 & 0x2) != 0;
		@Pc(35) boolean local35 = (local10 & 0x4) != 0;
		@Pc(39) int local39 = super.method3499();
		this.method3515((local10 >> 3 & 0x7) + 1);
		this.aByte82 = (byte) (local10 >> 6 & 0x3);
		super.anInt4318 += this.method3499() - local39 << 6;
		super.anInt4321 += this.method3499() - local39 << 6;
		this.aByte84 = arg0.method2612();
		this.anInt4413 = arg0.method2612();
		this.anInt4431 = arg0.method2612();
		this.anInt4439 = 0;
		@Pc(107) int local107 = -1;
		@Pc(110) int[] local110 = new int[12];
		@Pc(131) int local131;
		@Pc(137) int local137;
		@Pc(176) int local176;
		for (@Pc(112) int local112 = 0; local112 < 12; local112++) {
			@Pc(117) int local117 = arg0.method2582();
			if (local117 == 0) {
				local110[local112] = 0;
			} else {
				local131 = arg0.method2582();
				local137 = (local117 << 8) + local131;
				if (local112 == 0 && local137 == 65535) {
					local107 = arg0.method2588();
					this.anInt4439 = arg0.method2582();
					break;
				}
				if (local137 >= 32768) {
					local137 = Static378.anIntArray405[local137 - 32768];
					local110[local112] = local137 | 0x40000000;
					local176 = Static314.aClass12_2.method327(local137).anInt2563;
					if (local176 != 0) {
						this.anInt4439 = local176;
					}
				} else {
					local110[local112] = Integer.MIN_VALUE | local137 - 256;
				}
			}
		}
		@Pc(202) int[] local202 = new int[5];
		for (local131 = 0; local131 < 5; local131++) {
			local137 = arg0.method2582();
			if (local137 < 0 || Static109.aShortArrayArray1[local131].length <= local137) {
				local137 = 0;
			}
			local202[local131] = local137;
		}
		this.anInt4409 = arg0.method2588();
		this.aString37 = arg0.method2620();
		if (local27) {
			this.aString36 = arg0.method2620();
		} else {
			this.aString36 = this.aString37;
		}
		this.anInt4414 = arg0.method2582();
		if (local35) {
			this.anInt4408 = arg0.method2588();
			this.anInt4410 = this.anInt4414;
			this.anInt4440 = -1;
		} else {
			this.anInt4408 = 0;
			this.anInt4410 = arg0.method2582();
			this.anInt4440 = arg0.method2582();
			if (this.anInt4440 == 255) {
				this.anInt4440 = -1;
			}
		}
		local137 = this.anInt4430;
		this.anInt4430 = arg0.method2582();
		@Pc(317) int local317;
		if (this.anInt4430 == 0) {
			Static295.method4136(this);
		} else {
			local176 = this.anInt4427;
			@Pc(314) int local314 = this.anInt4438;
			local317 = this.anInt4412;
			@Pc(320) int local320 = this.anInt4421;
			@Pc(323) int local323 = this.anInt4420;
			this.anInt4427 = arg0.method2588();
			this.anInt4438 = arg0.method2588();
			this.anInt4412 = arg0.method2588();
			this.anInt4421 = arg0.method2588();
			this.anInt4420 = arg0.method2582();
			if (this.anInt4430 != local137 || local176 != this.anInt4427 || this.anInt4438 != local314 || local317 != this.anInt4412 || this.anInt4421 != local320 || this.anInt4420 != local323) {
				Static393.method5079(this);
			}
		}
		if (this.aClass206_1 == null) {
			this.aClass206_1 = new Class206();
		}
		local176 = this.aClass206_1.anInt5707;
		@Pc(399) int[] local399 = this.aClass206_1.anIntArray378;
		this.aClass206_1.method4454(this.aByte83 == 1, this.method3498(), local202, local107, local110);
		if (local176 != local107) {
			super.anInt4318 = (super.anIntArray287[0] << 7) + (this.method3499() << 6);
			super.anInt4321 = (super.anIntArray288[0] << 7) + (this.method3499() << 6);
		}
		if (super.anInt4391 == Static319.anInt1936 && local399 != null) {
			for (local317 = 0; local317 < local202.length; local317++) {
				if (local399[local317] != local202[local317]) {
					Static314.aClass12_2.method330();
					break;
				}
			}
		}
		if (super.aClass6_Sub8_7 != null) {
			super.aClass6_Sub8_7.method5916();
		}
		if (super.anInt4389 == -1 || !super.aBoolean378) {
			return;
		}
		@Pc(509) Class1 local509 = this.method3514();
		if (!local509.method8(super.anInt4389)) {
			super.anInt4389 = -1;
			super.aBoolean378 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!ln", name = "g", descriptor = "(I)Z")
	public boolean method3524() {
		return this.aClass206_1 != null;
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(BZ)Ljava/lang/String;")
	public String method3525() {
		@Pc(5) String local5 = "";
		if (Static95.aStringArray20 != null) {
			local5 = local5 + Static95.aStringArray20[this.aByte82];
		}
		@Pc(32) int[] local32;
		if (this.aByte83 == 1 && Static217.anIntArray274 != null) {
			local32 = Static217.anIntArray274;
		} else {
			local32 = Static416.anIntArray497;
		}
		if (local32 != null && local32[this.aByte82] != -1) {
			@Pc(51) Class197 local51 = Static106.aClass211_1.method4512(local32[this.aByte82]);
			if (local51.aChar4 == 's') {
				local5 = local5 + local51.method4325(this.aByte84 & 0xFF);
			} else {
				Static324.method5974(new Throwable(), "gdn1");
				local32[this.aByte82] = -1;
			}
		}
		local5 = local5 + this.aString37;
		if (Static433.aStringArray50 != null) {
			local5 = local5 + Static433.aStringArray50[this.aByte82];
		}
		return local5;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILclient!qa;ZLclient!to;III)V")
	@Override
	public void method5273(@OriginalArg(0) int arg0, @OriginalArg(1) Class172 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class7 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}
}
