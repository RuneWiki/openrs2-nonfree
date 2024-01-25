import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jm")
public final class Class3_Sub4_Sub1_Sub1 extends Class3_Sub4_Sub1 {

	@OriginalMember(owner = "client!jm", name = "Mc", descriptor = "Lclient!um;")
	public Class245 aClass245_1;

	@OriginalMember(owner = "client!jm", name = "Pc", descriptor = "I")
	public int anInt3304 = -1;

	@OriginalMember(owner = "client!jm", name = "Tc", descriptor = "I")
	public int anInt3308 = -1;

	static {
		new Class134("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5277() {
		return false;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(BLclient!za;)Lclient!ql;")
	@Override
	public Class21_Sub6 method5280(@OriginalArg(1) Class163 arg0) {
		if (this.aClass245_1 == null || !this.method2627(2048, arg0)) {
			return null;
		}
		@Pc(26) Class31 local26 = arg0.method5539();
		@Pc(31) int local31 = super.aClass12_7.method177();
		local26.ca(local31);
		local26.W(super.anInt6833, super.anInt6832, super.anInt6835);
		@Pc(46) Class173 local46 = this.method4001();
		@Pc(59) Class245 local59 = this.aClass245_1.anIntArray560 == null ? this.aClass245_1 : this.aClass245_1.method5205(Static138.aClass268_1);
		if (Static2.aClass148_Sub1_1.aBoolean255 && local59.aBoolean472 && local46.aBoolean318) {
			@Pc(87) Class128 local87 = super.anInt4903 != -1 && super.anInt4954 == 0 ? Static334.aClass62_2.method1418(super.anInt4903) : null;
			@Pc(105) Class128 local105 = super.anInt4922 == -1 || super.aBoolean353 && local87 != null ? null : Static334.aClass62_2.method1418(super.anInt4922);
			@Pc(107) int local107 = 0;
			if (super.anInt4909 != 0) {
				local107 = this.method3997();
			}
			@Pc(168) Class59 local168 = Static301.method2672(this.aClass245_1.aByte87 & 0xFF, this.aClass245_1.aShort83 & 0xFFFF, super.anInt4962, local105 == null ? super.anInt4929 : super.anInt4967, arg0, local107, this.aClass245_1.aByte84 & 0xFF, this.aClass245_1.aShort84 & 0xFFFF, local31, super.aClass59Array3[0], super.anInt4957, this.aClass245_1.anInt6704, local105 == null ? local87 : local105, super.anInt4973);
			if (local168 != null) {
				@Pc(173) float local173 = arg0.T();
				@Pc(176) float local176 = arg0.aa();
				arg0.method5534(false);
				arg0.da(local173, local176 - 150.0F);
				local168.method5736(local26, null, 0);
				arg0.da(local173, local176);
				arg0.method5534(true);
			}
		}
		@Pc(199) Class21_Sub6 local199 = null;
		if (this.method2634()) {
			local199 = Static209.method2805(super.aClass59Array3.length);
		}
		if (super.aClass21_Sub2_6 == null) {
			arg0.method5509(super.aClass59Array3, local26, local199 == null ? null : local199.aClass21_Sub7Array1, 0);
		} else {
			@Pc(230) Class256 local230 = super.aClass21_Sub2_6.method634();
			arg0.method5556(super.aClass59Array3, local230, local26, local199 == null ? null : local199.aClass21_Sub7Array1, 0);
		}
		this.method4006(arg0, super.aClass59Array3, false);
		if (super.aClass59Array3[2] != null) {
			if (local31 != 0) {
				super.aClass59Array3[2].ma(local31);
			}
			super.aClass59Array3[2].a(-super.aClass2_Sub41_3.anInt6962 + super.anInt6833, super.anInt6832 - super.aClass2_Sub41_3.anInt6959, -super.aClass2_Sub41_3.anInt6973 + super.anInt6835);
		}
		super.anInt4935 = Static197.anInt3347;
		super.aClass59Array3[0] = super.aClass59Array3[1] = super.aClass59Array3[2] = super.aClass59Array3[3] = null;
		return local199;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIIZ)V")
	public void method2626(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		super.aByte91 = (byte) arg0;
		if (super.anInt4903 != -1 && Static334.aClass62_2.method1418(super.anInt4903).anInt3341 == 1) {
			super.anInt4903 = -1;
		}
		@Pc(36) Class229 local36;
		if (super.anInt4964 != -1) {
			local36 = Static431.aClass36_2.method696(super.anInt4964);
			if (local36.aBoolean449 && local36.anInt6240 != -1 && Static334.aClass62_2.method1418(local36.anInt6240).anInt3341 == 1) {
				super.anInt4964 = -1;
			}
		}
		if (super.anInt4912 != -1) {
			local36 = Static431.aClass36_2.method696(super.anInt4912);
			if (local36.aBoolean449 && local36.anInt6240 != -1 && Static334.aClass62_2.method1418(local36.anInt6240).anInt3341 == 1) {
				super.anInt4912 = -1;
			}
		}
		if (!arg4) {
			@Pc(95) int local95 = arg3 - super.anIntArray425[0];
			@Pc(103) int local103 = arg1 - super.anIntArray424[0];
			if (local95 >= -8 && local95 <= 8 && local103 >= -8 && local103 <= 8) {
				if (super.anInt4977 < 9) {
					super.anInt4977++;
				}
				for (@Pc(134) int local134 = super.anInt4977; local134 > 0; local134--) {
					super.anIntArray425[local134] = super.anIntArray425[local134 - 1];
					super.anIntArray424[local134] = super.anIntArray424[local134 - 1];
					super.aByteArray64[local134] = super.aByteArray64[local134 - 1];
				}
				super.anIntArray425[0] = arg3;
				super.aByteArray64[0] = 1;
				super.anIntArray424[0] = arg1;
				return;
			}
		}
		super.anIntArray425[0] = arg3;
		super.anInt4976 = 0;
		super.anInt4977 = 0;
		super.anInt4978 = 0;
		super.anIntArray424[0] = arg1;
		super.anInt6835 = (super.anIntArray424[0] << 7) + (arg2 << 6);
		super.anInt6833 = (arg2 << 6) + (super.anIntArray425[0] << 7);
		if (super.aClass21_Sub2_6 != null) {
			super.aClass21_Sub2_6.method638();
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IBILclient!za;)Z")
	@Override
	public boolean method5282(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class163 arg2) {
		if (this.aClass245_1 == null || !this.method2627(131072, arg2)) {
			return false;
		}
		@Pc(19) Class31 local19 = arg2.method5539();
		@Pc(24) int local24 = super.aClass12_7.method177();
		local19.ca(local24);
		local19.W(super.anInt6833, super.anInt6832, super.anInt6835);
		@Pc(42) boolean local42 = false;
		for (@Pc(44) int local44 = 0; super.aClass59Array3.length > local44; local44++) {
			if (super.aClass59Array3[local44] != null && super.aClass59Array3[local44].method5748(arg1, arg0, local19, this.aClass245_1.anInt6704 == 1)) {
				local42 = true;
				break;
			}
		}
		super.aClass59Array3[0] = super.aClass59Array3[1] = super.aClass59Array3[2] = super.aClass59Array3[3] = null;
		return local42;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(BILclient!za;)Z")
	private boolean method2627(@OriginalArg(1) int arg0, @OriginalArg(2) Class163 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class173 local11 = this.method4001();
		@Pc(30) Class128 local30 = super.anInt4903 != -1 && super.anInt4954 == 0 ? Static334.aClass62_2.method1418(super.anInt4903) : null;
		@Pc(48) Class128 local48 = super.anInt4922 == -1 || super.aBoolean353 && local30 != null ? null : Static334.aClass62_2.method1418(super.anInt4922);
		@Pc(51) int local51 = local11.anInt4461;
		@Pc(54) int local54 = local11.anInt4451;
		if (local51 != 0 || local54 != 0 || local11.anInt4466 != 0 || local11.anInt4453 != 0) {
			arg0 |= 0x7;
		}
		@Pc(100) boolean local100 = super.aByte60 != 0 && Static266.anInt4392 >= super.anInt4968 && Static266.anInt4392 < super.anInt4921;
		if (local100) {
			arg0 |= 0x80000;
		}
		@Pc(137) Class59 local137 = super.aClass59Array3[0] = this.aClass245_1.method5198(local48, Static56.aClass150_1, super.anInt4943, super.anInt4945, Static138.aClass268_1, super.anInt4963, Static334.aClass62_2, super.lb, local30, super.aClass194Array3, super.anInt4929, arg1, super.anInt4967, arg0);
		if (local137 == null) {
			return false;
		}
		super.anInt4902 = local137.B();
		this.method3995(local137);
		@Pc(154) int local154 = super.aClass12_7.method177();
		if (local51 == 0 && local54 == 0) {
			this.method4007(0, this.method4009() << 7, local154, this.method4009() << 7, 0);
		} else {
			this.method4007(local11.anInt4469, local54, local154, local51, local11.anInt4474);
			if (super.anInt4962 != 0) {
				super.aClass59Array3[0].W(super.anInt4962);
			}
			if (super.anInt4957 != 0) {
				super.aClass59Array3[0].K(super.anInt4957);
			}
			if (super.anInt4973 != 0) {
				super.aClass59Array3[0].a(0, super.anInt4973, 0);
			}
		}
		if (local100) {
			local137.method5746(super.aByte62, super.aByte61, super.aByte63, super.aByte60 & 0xFF);
		}
		@Pc(269) Class229 local269;
		@Pc(284) boolean local284;
		@Pc(286) int local286;
		@Pc(332) Class59 local332;
		if (super.anInt4964 == -1 || super.anInt4950 == -1) {
			super.aClass59Array3[1] = null;
		} else {
			local269 = Static431.aClass36_2.method696(super.anInt4964);
			local284 = local269.aByte78 == 3 && (local51 != 0 || local54 != 0);
			local286 = local7;
			if (local284) {
				local286 = local7 | 0x7;
			} else {
				if (super.anInt4924 != 0) {
					local286 = local7 | 0x5;
				}
				if (super.anInt4897 != 0) {
					local286 |= 0x2;
				}
			}
			local332 = super.aClass59Array3[1] = local269.method4862(super.anInt4938, super.anInt4950, local286, arg1, Static334.aClass62_2, super.anInt4955);
			if (local332 != null) {
				if (super.anInt4897 != 0) {
					local332.a(0, -super.anInt4897 << 0, 0);
				}
				if (super.anInt4924 != 0) {
					local332.ma(super.anInt4924 * 2048);
				}
				if (local284) {
					if (super.anInt4962 != 0) {
						local332.W(super.anInt4962);
					}
					if (super.anInt4957 != 0) {
						local332.K(super.anInt4957);
					}
					if (super.anInt4973 != 0) {
						local332.a(0, super.anInt4973, 0);
					}
				}
			}
		}
		if (super.anInt4912 == -1 || super.anInt4969 == -1) {
			super.aClass59Array3[3] = null;
		} else {
			local269 = Static431.aClass36_2.method696(super.anInt4912);
			local284 = local269.aByte78 == 3 && (local51 != 0 || local54 != 0);
			local286 = local7;
			if (local284) {
				local286 = local7 | 0x7;
			} else {
				if (super.anInt4913 != 0) {
					local286 = local7 | 0x5;
				}
				if (super.anInt4911 != 0) {
					local286 |= 0x2;
				}
			}
			local332 = super.aClass59Array3[3] = local269.method4856(Static334.aClass62_2, arg1, super.anInt4923, super.anInt4937, super.anInt4969, local286);
			if (local332 != null) {
				if (super.anInt4911 != 0) {
					local332.a(0, -super.anInt4911 << 0, 0);
				}
				if (super.anInt4913 != 0) {
					local332.ma(super.anInt4913 * 2048);
				}
				if (local284) {
					if (super.anInt4962 != 0) {
						local332.W(super.anInt4962);
					}
					if (super.anInt4957 != 0) {
						local332.K(super.anInt4957);
					}
					if (super.anInt4973 != 0) {
						local332.a(0, super.anInt4973, 0);
					}
				}
			}
		}
		super.aClass59Array3[2] = null;
		if (super.aClass2_Sub41_3 != null) {
			if (Static266.anInt4392 >= super.aClass2_Sub41_3.anInt6956) {
				super.aClass2_Sub41_3 = null;
			} else if (Static266.anInt4392 >= super.aClass2_Sub41_3.anInt6970) {
				@Pc(549) Class59 local549 = super.aClass2_Sub41_3.method5393(local7 | 0x7, arg1);
				if (local549 != null) {
					local549.a(super.aClass2_Sub41_3.anInt6962 - super.anInt6833, -super.anInt6832 + super.aClass2_Sub41_3.anInt6959, -super.anInt6835 + super.aClass2_Sub41_3.anInt6973);
					if (local154 != 0) {
						local549.ma(local154);
					}
					super.aClass59Array3[2] = local549;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!lb;IZIBILclient!za;)V")
	@Override
	public void method5281(@OriginalArg(0) Class3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class163 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!um;Z)V")
	public void method2629(@OriginalArg(0) Class245 arg0) {
		this.aClass245_1 = arg0;
		if (super.aClass21_Sub2_6 != null) {
			super.aClass21_Sub2_6.method638();
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)I")
	@Override
	protected int method3994() {
		if (this.aClass245_1.anIntArray560 != null) {
			@Pc(13) Class245 local13 = this.aClass245_1.method5205(Static138.aClass268_1);
			if (local13 != null && local13.anInt6733 != -1) {
				return local13.anInt6733;
			}
		}
		return this.aClass245_1.anInt6733;
	}

	@OriginalMember(owner = "client!jm", name = "f", descriptor = "(I)I")
	@Override
	public int method5286() {
		return super.anInt4902;
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(Z)I")
	@Override
	public int method3998() {
		if (this.aClass245_1.anIntArray560 != null) {
			@Pc(20) Class245 local20 = this.aClass245_1.method5205(Static138.aClass268_1);
			if (local20 != null && local20.anInt6701 != -1) {
				return local20.anInt6701;
			}
		}
		return this.aClass245_1.anInt6701;
	}

	@OriginalMember(owner = "client!jm", name = "k", descriptor = "(I)I")
	@Override
	public int method4012() {
		if (this.aClass245_1.anIntArray560 != null) {
			@Pc(19) Class245 local19 = this.aClass245_1.method5205(Static138.aClass268_1);
			if (local19 != null && local19.anInt6727 != -1) {
				return local19.anInt6727;
			}
		}
		return this.aClass245_1.anInt6727 == -1 ? super.method4012() : this.aClass245_1.anInt6727;
	}

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5285(@OriginalArg(0) Class163 arg0) {
		if (this.aClass245_1 != null && (super.aBoolean355 || this.method2627(0, arg0))) {
			this.method4006(arg0, super.aClass59Array3, super.aBoolean355);
			super.aClass59Array3[0] = super.aClass59Array3[1] = super.aClass59Array3[2] = super.aClass59Array3[3] = null;
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(III)V")
	public void method2632(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray425[0];
		@Pc(15) int local15 = super.anIntArray424[0];
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
		if (super.anInt4903 != -1 && Static334.aClass62_2.method1418(super.anInt4903).anInt3341 == 1) {
			super.anInt4903 = -1;
		}
		if (arg0 == 7) {
			local15++;
			local10--;
		}
		@Pc(87) Class229 local87;
		if (super.anInt4964 != -1) {
			local87 = Static431.aClass36_2.method696(super.anInt4964);
			if (local87.aBoolean449 && local87.anInt6240 != -1 && Static334.aClass62_2.method1418(local87.anInt6240).anInt3341 == 1) {
				super.anInt4964 = -1;
			}
		}
		if (super.anInt4912 != -1) {
			local87 = Static431.aClass36_2.method696(super.anInt4912);
			if (local87.aBoolean449 && local87.anInt6240 != -1 && Static334.aClass62_2.method1418(local87.anInt6240).anInt3341 == 1) {
				super.anInt4912 = -1;
			}
		}
		if (super.anInt4977 < 9) {
			super.anInt4977++;
		}
		for (@Pc(152) int local152 = super.anInt4977; local152 > 0; local152--) {
			super.anIntArray425[local152] = super.anIntArray425[local152 - 1];
			super.anIntArray424[local152] = super.anIntArray424[local152 - 1];
			super.aByteArray64[local152] = super.aByteArray64[local152 - 1];
		}
		super.anIntArray425[0] = local10;
		super.aByteArray64[0] = (byte) arg1;
		super.anIntArray424[0] = local15;
	}

	@OriginalMember(owner = "client!jm", name = "e", descriptor = "(I)V")
	@Override
	public void method5284() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jm", name = "e", descriptor = "(B)Z")
	public boolean method2633() {
		return this.aClass245_1 != null;
	}

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "(Z)Z")
	private boolean method2634() {
		return this.aClass245_1.aBoolean476;
	}
}
