import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class4_Sub2_Sub5_Sub1 extends Class4_Sub2_Sub5 {

	@OriginalMember(owner = "client!ph", name = "F", descriptor = "I")
	public int anInt7813;

	@OriginalMember(owner = "client!ph", name = "R", descriptor = "I")
	public int anInt7817;

	@OriginalMember(owner = "client!ph", name = "K", descriptor = "I")
	public int anInt7821;

	@OriginalMember(owner = "client!ph", name = "O", descriptor = "I")
	public int anInt7826;

	@OriginalMember(owner = "client!ph", name = "H", descriptor = "I")
	public int anInt7812 = 0;

	@OriginalMember(owner = "client!ph", name = "J", descriptor = "Z")
	private boolean aBoolean684 = false;

	@OriginalMember(owner = "client!ph", name = "Q", descriptor = "I")
	public int anInt7810 = -1;

	@OriginalMember(owner = "client!ph", name = "T", descriptor = "I")
	private int anInt7818 = 0;

	@OriginalMember(owner = "client!ph", name = "L", descriptor = "I")
	public int anInt7825 = -1;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(IIIII)V")
	public Class4_Sub2_Sub5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method8970() {
		return false;
	}

	@OriginalMember(owner = "client!ph", name = "g", descriptor = "(I)I")
	@Override
	protected int method8978() {
		return 87;
	}

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8976() {
		return this.aBoolean684;
	}

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "(I)I")
	@Override
	public int method8977(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.method8979(-109);
		}
		return -10;
	}

	@OriginalMember(owner = "client!ph", name = "f", descriptor = "(I)I")
	@Override
	public int method8979(@OriginalArg(0) int arg0) {
		@Pc(9) Class203 local9 = Static543.aClass37_2.method605(this.anInt7817);
		@Pc(12) int local12 = local9.anInt4847;
		@Pc(23) Class203 local23;
		if (this.anInt7810 != -1) {
			local23 = Static543.aClass37_2.method605(this.anInt7810);
			if (local12 < local23.anInt4847) {
				local12 = local23.anInt4847;
			}
		}
		if (this.anInt7825 != -1) {
			local23 = Static543.aClass37_2.method605(this.anInt7825);
			if (local23.anInt4847 > local12) {
				local12 = local23.anInt4847;
			}
		}
		if (arg0 != 65535) {
			this.method8970();
		}
		return local12;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method8980(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 != -11191) {
			return true;
		}
		@Pc(12) Class86 local12 = arg0.method9699();
		local12.method7026(super.anInt10229, super.anInt10234 - 10, super.anInt10228);
		@Pc(28) Class203 local28 = Static543.aClass37_2.method605(this.anInt7817);
		@Pc(38) Class45 local38 = local28.method4410(arg0, (Class116) null, (Class53) null, this.anInt7813, 131072);
		if (local38 != null && (Static591.aBoolean812 ? local38.method5743(arg1, arg3, local12, true, local28.anInt4847, Static96.anInt1733) : local38.method5770(arg1, arg3, local12, true, local28.anInt4847))) {
			return true;
		}
		@Pc(78) Class203 local78;
		if (this.anInt7810 != -1) {
			local78 = Static543.aClass37_2.method605(this.anInt7810);
			local38 = local78.method4410(arg0, (Class116) null, (Class53) null, this.anInt7826, 131072);
			if (local38 != null && (Static591.aBoolean812 ? local38.method5743(arg1, arg3, local12, true, local78.anInt4847, Static96.anInt1733) : local38.method5770(arg1, arg3, local12, true, local78.anInt4847))) {
				return true;
			}
		}
		if (this.anInt7825 != -1) {
			local78 = Static543.aClass37_2.method605(this.anInt7825);
			local38 = local78.method4410(arg0, (Class116) null, (Class53) null, this.anInt7821, 131072);
			if (local38 != null && (Static591.aBoolean812 ? local38.method5743(arg1, arg3, local12, true, local78.anInt4847, Static96.anInt1733) : local38.method5770(arg1, arg3, local12, true, local78.anInt4847))) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!ha;B)Lclient!iaa;")
	@Override
	public Class4_Sub8 method8966(@OriginalArg(0) Class145 arg0) {
		@Pc(25) Class142 local25 = Static64.method961(super.aByte133, super.anInt10229 >> Static260.anInt4053, super.anInt10228 >> Static260.anInt4053);
		@Pc(37) Class4_Sub2_Sub2 local37 = Static441.method6382(super.aByte133, super.anInt10229 >> Static260.anInt4053, super.anInt10228 >> Static260.anInt4053);
		@Pc(39) int local39 = 0;
		if (local25 != null && local25.aClass4_Sub2_Sub1_1.aBoolean888) {
			local39 = local25.aClass4_Sub2_Sub1_1.method8977(0);
		}
		if (local37 != null && local37.aShort86 > -local39) {
			local39 = -local37.aShort86;
		}
		if (this.anInt7812 != local39) {
			super.anInt10234 -= this.anInt7812;
			this.anInt7812 = local39;
			super.anInt10234 += local39;
		}
		@Pc(90) Class86 local90 = arg0.method9699();
		local90.method7024();
		if (this.anInt7812 == 0) {
			@Pc(106) Class133 local106 = Static158.aClass133Array4[super.aByte134];
			@Pc(111) int local111 = this.anInt7818 << 1;
			@Pc(118) int local118 = -local111 / 2;
			@Pc(123) int local123 = -local111 / 2;
			@Pc(135) int local135 = local106.method8214(super.anInt10229 + local118, super.anInt10228 + local123);
			@Pc(139) int local139 = local111 / 2;
			@Pc(144) int local144 = -local111 / 2;
			@Pc(156) int local156 = local106.method8214(local139 + super.anInt10229, local144 + super.anInt10228);
			@Pc(161) int local161 = -local111 / 2;
			@Pc(165) int local165 = local111 / 2;
			@Pc(178) int local178 = local106.method8214(super.anInt10229 + local161, super.anInt10228 - -local165);
			@Pc(182) int local182 = local111 / 2;
			@Pc(186) int local186 = local111 / 2;
			@Pc(198) int local198 = local106.method8214(super.anInt10229 + local182, super.anInt10228 + local186);
			@Pc(206) int local206 = local156 <= local135 ? local156 : local135;
			@Pc(218) int local218 = local198 <= local178 ? local198 : local178;
			@Pc(226) int local226 = local198 <= local156 ? local198 : local156;
			if (local111 != 0) {
				@Pc(241) int local241 = (int) (Math.atan2((double) (local206 - local218), (double) local111) * 2607.5945876176133D) & 0x3FFF;
				if (local241 != 0) {
					local90.method7027(local241);
				}
			}
			@Pc(259) int local259 = local135 < local178 ? local135 : local178;
			@Pc(264) int local264 = local135 + local198;
			if (local111 != 0) {
				@Pc(283) int local283 = (int) (Math.atan2((double) (local259 - local226), (double) local111) * 2607.5945876176133D) & 0x3FFF;
				if (local283 != 0) {
					local90.method7022(-local283);
				}
			}
			if (local178 + local156 < local264) {
				local264 = local178 + local156;
			}
			local264 = (local264 >> 1) - super.anInt10234;
			if (local264 != 0) {
				local90.method7020(0, local264, 0);
			}
		}
		local90.method7020(super.anInt10229, super.anInt10234 - 10, super.anInt10228);
		@Pc(339) Class4_Sub8 local339 = Static118.method1730(3, true);
		this.aBoolean684 = false;
		this.anInt7818 = 0;
		@Pc(364) Class45 local364;
		if (this.anInt7825 != -1) {
			local364 = Static543.aClass37_2.method605(this.anInt7825).method4410(arg0, (Class116) null, (Class53) null, this.anInt7821, 2048);
			if (local364 != null) {
				if (Static591.aBoolean812) {
					local364.method5759(local90, local339.aClass4_Sub6Array1[2], Static96.anInt1733, 0);
				} else {
					local364.method5769(local90, local339.aClass4_Sub6Array1[2], 0);
				}
				this.aBoolean684 |= local364.F();
				this.anInt7818 = local364.ma();
			}
		}
		if (this.anInt7810 != -1) {
			local364 = Static543.aClass37_2.method605(this.anInt7810).method4410(arg0, (Class116) null, (Class53) null, this.anInt7826, 2048);
			if (local364 != null) {
				if (Static591.aBoolean812) {
					local364.method5759(local90, local339.aClass4_Sub6Array1[1], Static96.anInt1733, 0);
				} else {
					local364.method5769(local90, local339.aClass4_Sub6Array1[1], 0);
				}
				this.aBoolean684 |= local364.F();
				if (local364.ma() > this.anInt7818) {
					this.anInt7818 = local364.ma();
				}
			}
		}
		local364 = Static543.aClass37_2.method605(this.anInt7817).method4410(arg0, (Class116) null, (Class53) null, this.anInt7813, 2048);
		if (local364 != null) {
			if (Static591.aBoolean812) {
				local364.method5759(local90, local339.aClass4_Sub6Array1[0], Static96.anInt1733, 0);
			} else {
				local364.method5769(local90, local339.aClass4_Sub6Array1[0], 0);
			}
			this.aBoolean684 |= local364.F();
			if (local364.ma() > this.anInt7818) {
				this.anInt7818 = local364.ma();
			}
		}
		return local339;
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(Lclient!ha;Z)Lclient!it;")
	@Override
	public Class187 method8971(@OriginalArg(0) Class145 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8975(@OriginalArg(1) Class145 arg0) {
	}
}
