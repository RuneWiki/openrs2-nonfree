import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class11_Sub1_Sub1_Sub1 extends Class11_Sub1_Sub1 {

	@OriginalMember(owner = "client!ag", name = "Qc", descriptor = "Lclient!nc;")
	public Class222 aClass222_1;

	@OriginalMember(owner = "client!ag", name = "Pc", descriptor = "I")
	public int anInt515 = -1;

	@OriginalMember(owner = "client!ag", name = "Jc", descriptor = "I")
	public int anInt509 = -1;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILclient!oa;)Lclient!gr;")
	@Override
	public Class122 method8106(@OriginalArg(1) Class9 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IZIIII)V")
	public void method607(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		super.aByte77 = (byte) arg0;
		if (super.anInt7387 != -1 && Static114.aClass156_2.method4101(super.anInt7387).anInt583 == 1) {
			super.anInt7387 = -1;
		}
		@Pc(41) Class212 local41;
		if (super.anInt7384 != -1) {
			local41 = Static355.aClass278_2.method6826(super.anInt7384);
			if (local41.aBoolean450 && local41.anInt6056 != -1 && Static114.aClass156_2.method4101(local41.anInt6056).anInt583 == 1) {
				super.anInt7384 = -1;
			}
		}
		if (super.anInt7393 != -1) {
			local41 = Static355.aClass278_2.method6826(super.anInt7393);
			if (local41.aBoolean450 && local41.anInt6056 != -1 && Static114.aClass156_2.method4101(local41.anInt6056).anInt583 == 1) {
				super.anInt7393 = -1;
			}
		}
		if (!arg1) {
			@Pc(100) int local100 = arg2 - super.anIntArray526[0];
			@Pc(108) int local108 = arg4 - super.anIntArray527[0];
			if (local100 >= -8 && local100 <= 8 && local108 >= -8 && local108 <= 8) {
				if (super.anInt7432 < 9) {
					super.anInt7432++;
				}
				for (@Pc(135) int local135 = super.anInt7432; local135 > 0; local135--) {
					super.anIntArray526[local135] = super.anIntArray526[local135 - 1];
					super.anIntArray527[local135] = super.anIntArray527[local135 - 1];
					super.aByteArray84[local135] = super.aByteArray84[local135 - 1];
				}
				super.anIntArray526[0] = arg2;
				super.anIntArray527[0] = arg4;
				super.aByteArray84[0] = 1;
				return;
			}
		}
		super.anInt7433 = 0;
		super.anInt7435 = 0;
		super.anIntArray526[0] = arg2;
		super.anInt7432 = 0;
		super.anIntArray527[0] = arg4;
		super.anInt7351 = (super.anIntArray527[0] << 9) + (arg3 << 8);
		super.anInt7347 = (super.anIntArray526[0] << 9) + (arg3 << 8);
		if (super.aClass5_Sub2_6 != null) {
			super.aClass5_Sub2_6.method3780();
		}
	}

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "(I)V")
	@Override
	public void method8107() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(Lclient!oa;I)Lclient!ok;")
	@Override
	public Class5_Sub5 method8109(@OriginalArg(0) Class9 arg0) {
		if (this.aClass222_1 == null || !this.method610(2048, arg0)) {
			return null;
		}
		@Pc(17) Class8 local17 = arg0.method5417();
		@Pc(24) int local24 = super.aClass134_7.method3705();
		local17.a(local24);
		local17.G(super.anInt7347, super.anInt7350 - 20, super.anInt7351);
		@Pc(41) Class169 local41 = this.method6209();
		@Pc(54) Class222 local54 = this.aClass222_1.anIntArray464 == null ? this.aClass222_1 : this.aClass222_1.method5329(Static435.aClass234_1);
		if (Static104.aClass6_Sub6_Sub1_4.aBoolean138 && local54.aBoolean462 && local41.aBoolean389) {
			@Pc(81) Class16 local81 = super.anInt7387 != -1 && super.anInt7401 == 0 ? Static114.aClass156_2.method4101(super.anInt7387) : null;
			@Pc(99) Class16 local99 = super.anInt7390 == -1 || super.aBoolean545 && local81 != null ? null : Static114.aClass156_2.method4101(super.anInt7390);
			@Pc(101) int local101 = 0;
			if (super.anInt7396 != 0) {
				local101 = this.method6211();
			}
			@Pc(162) Class23 local162 = Static73.method1562(super.lb, this.aClass222_1.aShort63 & 0xFFFF, super.anInt7427, this.aClass222_1.anInt6248, this.aClass222_1.aByte59 & 0xFF, arg0, local99 == null ? super.anInt7361 : super.anInt7383, super.aClass23Array3[0], this.aClass222_1.aShort64 & 0xFFFF, local24, local99 == null ? local81 : local99, super.anInt7415, this.aClass222_1.aByte61 & 0xFF, local101);
			if (local162 != null) {
				arg0.method5455(false);
				local162.method7077(local17, null, 0);
				arg0.method5455(true);
			}
		}
		local17.a(local24);
		local17.G(super.anInt7347, super.anInt7350 - 5, super.anInt7351);
		@Pc(190) Class5_Sub5 local190 = null;
		if (this.method609()) {
			local190 = Static342.method5386(super.aClass23Array3.length);
		}
		this.method6215(arg0, super.aClass23Array3, false, local17);
		if (super.aClass5_Sub2_6 == null) {
			arg0.method5408(super.aClass23Array3, local17, local190 == null ? null : local190.aClass5_Sub4Array1, 0);
		} else {
			@Pc(219) Class299 local219 = super.aClass5_Sub2_6.method3789();
			arg0.method5445(super.aClass23Array3, local219, local17, local190 == null ? null : local190.aClass5_Sub4Array1, 0);
		}
		super.anInt7363 = Static555.anInt9478;
		super.aClass23Array3[0] = super.aClass23Array3[1] = super.aClass23Array3[2] = super.aClass23Array3[3] = null;
		return local190;
	}

	@OriginalMember(owner = "client!ag", name = "j", descriptor = "(I)Z")
	private boolean method609() {
		return this.aClass222_1.aBoolean460;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZIZIILclient!fl;Lclient!oa;)V")
	@Override
	public void method8103(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class11 arg4, @OriginalArg(6) Class9 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILclient!oa;Z)Z")
	private boolean method610(@OriginalArg(0) int arg0, @OriginalArg(1) Class9 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class169 local11 = this.method6209();
		@Pc(27) Class16 local27 = super.anInt7387 != -1 && super.anInt7401 == 0 ? Static114.aClass156_2.method4101(super.anInt7387) : null;
		@Pc(45) Class16 local45 = super.anInt7390 == -1 || super.aBoolean545 && local27 != null ? null : Static114.aClass156_2.method4101(super.anInt7390);
		@Pc(48) int local48 = local11.anInt5183;
		@Pc(51) int local51 = local11.anInt5165;
		if (local48 != 0 || local51 != 0 || local11.anInt5167 != 0 || local11.anInt5176 != 0) {
			arg0 |= 0x7;
		}
		@Pc(93) boolean local93 = super.aByte82 != 0 && Static508.anInt8998 >= super.anInt7413 && super.anInt7359 > Static508.anInt8998;
		if (local93) {
			arg0 |= 0x80000;
		}
		@Pc(130) Class23 local130 = super.aClass23Array3[0] = this.aClass222_1.method5324(super.anInt7414, super.anInt7383, super.anInt7361, super.anInt7371, Static416.aClass250_1, super.anInt7422, arg1, Static435.aClass234_1, local27, super.anInt7356, local45, arg0, Static114.aClass156_2, super.aClass324Array3);
		if (local130 == null) {
			return false;
		}
		super.anInt7380 = local130.DA();
		this.method6207(local130);
		@Pc(152) int local152 = super.aClass134_7.method3705();
		if (local48 == 0 && local51 == 0) {
			this.method6210(0, local152, this.method6212() << 9, 0, this.method6212() << 9);
		} else {
			this.method6210(local11.anInt5189, local152, local48, local11.anInt5180, local51);
			if (super.anInt7427 != 0) {
				super.aClass23Array3[0].AA(super.anInt7427);
			}
			if (super.anInt7415 != 0) {
				super.aClass23Array3[0].v(super.anInt7415);
			}
			if (super.lb != 0) {
				super.aClass23Array3[0].m(0, super.lb, 0);
			}
		}
		if (local93) {
			local130.method7070(super.aByte81, super.aByte80, super.aByte79, super.aByte82 & 0xFF);
		}
		@Pc(255) Class212 local255;
		@Pc(270) boolean local270;
		@Pc(272) int local272;
		@Pc(315) Class23 local315;
		if (super.anInt7384 == -1 || super.anInt7417 == -1) {
			super.aClass23Array3[1] = null;
		} else {
			local255 = Static355.aClass278_2.method6826(super.anInt7384);
			local270 = local255.aByte56 == 3 && (local48 != 0 || local51 != 0);
			local272 = local7;
			if (local270) {
				local272 = local7 | 0x7;
			} else {
				if (super.anInt7430 != 0) {
					local272 = local7 | 0x5;
				}
				if (super.anInt7418 != 0) {
					local272 |= 0x2;
				}
			}
			local315 = super.aClass23Array3[1] = local255.method5191(super.anInt7417, arg1, super.anInt7408, Static114.aClass156_2, local272, super.anInt7398);
			if (local315 != null) {
				if (super.anInt7418 != 0) {
					local315.m(0, -super.anInt7418 << 2, 0);
				}
				if (super.anInt7430 != 0) {
					local315.I(super.anInt7430 * 2048);
				}
				if (local270) {
					if (super.anInt7427 != 0) {
						local315.AA(super.anInt7427);
					}
					if (super.anInt7415 != 0) {
						local315.v(super.anInt7415);
					}
					if (super.lb != 0) {
						local315.m(0, super.lb, 0);
					}
				}
			}
		}
		if (super.anInt7393 == -1 || super.anInt7360 == -1) {
			super.aClass23Array3[3] = null;
		} else {
			local255 = Static355.aClass278_2.method6826(super.anInt7393);
			local270 = local255.aByte56 == 3 && (local48 != 0 || local51 != 0);
			local272 = local7;
			if (local270) {
				local272 = local7 | 0x7;
			} else {
				if (super.anInt7409 != 0) {
					local272 = local7 | 0x5;
				}
				if (super.anInt7402 != 0) {
					local272 |= 0x2;
				}
			}
			local315 = super.aClass23Array3[3] = local255.method5192(Static114.aClass156_2, super.anInt7425, super.anInt7423, arg1, local272, super.anInt7360);
			if (local315 != null) {
				if (super.anInt7402 != 0) {
					local315.m(0, -super.anInt7402 << 2, 0);
				}
				if (super.anInt7409 != 0) {
					local315.I(super.anInt7409 * 2048);
				}
				if (local270) {
					if (super.anInt7427 != 0) {
						local315.AA(super.anInt7427);
					}
					if (super.anInt7415 != 0) {
						local315.v(super.anInt7415);
					}
					if (super.lb != 0) {
						local315.m(0, super.lb, 0);
					}
				}
			}
		}
		super.aClass23Array3[2] = null;
		if (super.aClass6_Sub14_3 != null) {
			if (super.aClass6_Sub14_3.anInt1910 <= Static508.anInt8998) {
				super.aClass6_Sub14_3 = null;
			} else if (Static508.anInt8998 >= super.aClass6_Sub14_3.anInt1911) {
				@Pc(534) Class23 local534 = super.aClass6_Sub14_3.method1703(arg1, local7 | 0x7);
				if (local534 != null) {
					local534.m(-super.anInt7347 + super.aClass6_Sub14_3.anInt1902, super.aClass6_Sub14_3.anInt1904 - (super.anInt7350 - 5), super.aClass6_Sub14_3.anInt1908 - super.anInt7351);
					if (local152 != 0) {
						local534.I(local152);
					}
					super.aClass23Array3[2] = local534;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(B)I")
	@Override
	public int method6214() {
		if (this.aClass222_1.anIntArray464 != null) {
			@Pc(15) Class222 local15 = this.aClass222_1.method5329(Static435.aClass234_1);
			if (local15 != null && local15.lb != -1) {
				return local15.lb;
			}
		}
		return this.aClass222_1.lb == -1 ? super.method6214() : this.aClass222_1.lb;
	}

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "(I)I")
	@Override
	public int method6199() {
		return super.anInt7380;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method8104(@OriginalArg(0) int arg0, @OriginalArg(2) Class9 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass222_1 == null || !this.method610(131072, arg1)) {
			return false;
		}
		@Pc(19) Class8 local19 = arg1.method5417();
		@Pc(24) int local24 = super.aClass134_7.method3705();
		local19.a(local24);
		local19.G(super.anInt7347, super.anInt7350, super.anInt7351);
		@Pc(37) boolean local37 = false;
		for (@Pc(39) int local39 = 0; super.aClass23Array3.length > local39; local39++) {
			if (super.aClass23Array3[local39] != null && super.aClass23Array3[local39].method7073(arg2, arg0, local19, this.aClass222_1.anInt6248 == 1)) {
				local37 = true;
				break;
			}
		}
		super.aClass23Array3[0] = super.aClass23Array3[1] = super.aClass23Array3[2] = super.aClass23Array3[3] = null;
		return local37;
	}

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8105() {
		return false;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!nc;I)V")
	public void method611(@OriginalArg(0) Class222 arg0) {
		this.aClass222_1 = arg0;
		if (super.aClass5_Sub2_6 != null) {
			super.aClass5_Sub2_6.method3780();
		}
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)I")
	@Override
	protected int method6208() {
		if (this.aClass222_1.anIntArray464 != null) {
			@Pc(13) Class222 local13 = this.aClass222_1.method5329(Static435.aClass234_1);
			if (local13 != null && local13.anInt6234 != -1) {
				return local13.anInt6234;
			}
		}
		return this.aClass222_1.anInt6234;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)I")
	@Override
	public int method6205() {
		if (this.aClass222_1.anIntArray464 != null) {
			@Pc(18) Class222 local18 = this.aClass222_1.method5329(Static435.aClass234_1);
			if (local18 != null && local18.anInt6252 != -1) {
				return local18.anInt6252;
			}
		}
		return this.aClass222_1.anInt6252;
	}

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "(Z)Z")
	public boolean method613() {
		return this.aClass222_1 != null;
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(III)V")
	public void method615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = super.anIntArray526[0];
		@Pc(15) int local15 = super.anIntArray527[0];
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
		if (super.anInt7387 != -1 && Static114.aClass156_2.method4101(super.anInt7387).anInt583 == 1) {
			super.anInt7387 = -1;
		}
		@Pc(83) Class212 local83;
		if (super.anInt7384 != -1) {
			local83 = Static355.aClass278_2.method6826(super.anInt7384);
			if (local83.aBoolean450 && local83.anInt6056 != -1 && Static114.aClass156_2.method4101(local83.anInt6056).anInt583 == 1) {
				super.anInt7384 = -1;
			}
		}
		if (super.anInt7393 != -1) {
			local83 = Static355.aClass278_2.method6826(super.anInt7393);
			if (local83.aBoolean450 && local83.anInt6056 != -1 && Static114.aClass156_2.method4101(local83.anInt6056).anInt583 == 1) {
				super.anInt7393 = -1;
			}
		}
		if (super.anInt7432 < 9) {
			super.anInt7432++;
		}
		for (@Pc(163) int local163 = super.anInt7432; local163 > 0; local163--) {
			super.anIntArray526[local163] = super.anIntArray526[local163 - 1];
			super.anIntArray527[local163] = super.anIntArray527[local163 - 1];
			super.aByteArray84[local163] = super.aByteArray84[local163 - 1];
		}
		super.anIntArray526[0] = local10;
		super.anIntArray527[0] = local15;
		super.aByteArray84[0] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8110(@OriginalArg(0) Class9 arg0) {
		if (this.aClass222_1 == null || !super.aBoolean546 && !this.method610(0, arg0)) {
			return;
		}
		@Pc(25) Class8 local25 = arg0.method5417();
		local25.a(super.aClass134_7.method3705());
		local25.G(super.anInt7347, super.anInt7350 - 20, super.anInt7351);
		this.method6215(arg0, super.aClass23Array3, super.aBoolean546, local25);
		super.aClass23Array3[0] = super.aClass23Array3[1] = super.aClass23Array3[2] = super.aClass23Array3[3] = null;
	}
}
