import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jia")
public final class Class4_Sub1_Sub4_Sub1 extends Class4_Sub1_Sub4 {

	@OriginalMember(owner = "client!jia", name = "N", descriptor = "I")
	public int anInt4884;

	@OriginalMember(owner = "client!jia", name = "K", descriptor = "I")
	public int anInt4886;

	@OriginalMember(owner = "client!jia", name = "T", descriptor = "I")
	public int anInt4893;

	@OriginalMember(owner = "client!jia", name = "S", descriptor = "I")
	public int anInt4899;

	@OriginalMember(owner = "client!jia", name = "X", descriptor = "I")
	public int anInt4890 = -1;

	@OriginalMember(owner = "client!jia", name = "J", descriptor = "I")
	public int anInt4883 = -1;

	@OriginalMember(owner = "client!jia", name = "db", descriptor = "Z")
	private boolean aBoolean322 = false;

	@OriginalMember(owner = "client!jia", name = "P", descriptor = "I")
	public int anInt4898 = 0;

	@OriginalMember(owner = "client!jia", name = "fb", descriptor = "I")
	private int anInt4903 = 0;

	@OriginalMember(owner = "client!jia", name = "<init>", descriptor = "(IIIII)V")
	public Class4_Sub1_Sub4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!jia", name = "e", descriptor = "(B)I")
	@Override
	public int method8341(@OriginalArg(0) byte arg0) {
		if (arg0 >= -112) {
			this.aBoolean322 = false;
		}
		return this.anInt4903;
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(Z)I")
	@Override
	public int method8357() {
		@Pc(15) Class246 local15 = Static82.aClass134_1.method3191(this.anInt4899);
		@Pc(18) int local18 = local15.anInt6517;
		@Pc(29) Class246 local29;
		if (this.anInt4883 != -1) {
			local29 = Static82.aClass134_1.method3191(this.anInt4883);
			if (local29.anInt6517 > local18) {
				local18 = local29.anInt6517;
			}
		}
		if (this.anInt4890 != -1) {
			local29 = Static82.aClass134_1.method3191(this.anInt4890);
			if (local18 < local29.anInt6517) {
				local18 = local29.anInt6517;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!jia", name = "g", descriptor = "(I)I")
	@Override
	public int method8347() {
		return -10;
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(Lclient!ha;B)Lclient!kv;")
	@Override
	public Class4_Sub6 method8355(@OriginalArg(0) Class100 arg0) {
		@Pc(17) Class299 local17 = Static187.method3193(super.aByte139, super.anInt9805 >> Static314.anInt5377, super.anInt9803 >> Static314.anInt5377);
		@Pc(29) Class4_Sub1_Sub3 local29 = Static254.method4181(super.aByte139, super.anInt9805 >> Static314.anInt5377, super.anInt9803 >> Static314.anInt5377);
		@Pc(31) int local31 = 0;
		if (local17 != null && local17.aClass4_Sub1_Sub1_1.aBoolean582) {
			local31 = local17.aClass4_Sub1_Sub1_1.method8347();
		}
		if (local29 != null && -local31 < local29.aShort48) {
			local31 = -local29.aShort48;
		}
		if (this.anInt4898 != local31) {
			super.anInt9797 -= this.anInt4898;
			this.anInt4898 = local31;
			super.anInt9797 += local31;
		}
		@Pc(90) Class10 local90 = arg0.method8610();
		local90.method4224();
		if (this.anInt4898 == 0) {
			@Pc(106) Class84 local106 = Static177.aClass84Array2[super.aByte138];
			@Pc(111) int local111 = this.anInt4903 << 1;
			@Pc(118) int local118 = -local111 / 2;
			@Pc(123) int local123 = -local111 / 2;
			@Pc(135) int local135 = local106.method7625(super.anInt9805 + local118, super.anInt9803 + local123);
			@Pc(139) int local139 = local111 / 2;
			@Pc(144) int local144 = -local111 / 2;
			@Pc(156) int local156 = local106.method7625(super.anInt9805 + local139, local144 + super.anInt9803);
			@Pc(161) int local161 = -local111 / 2;
			@Pc(165) int local165 = local111 / 2;
			@Pc(177) int local177 = local106.method7625(local161 + super.anInt9805, local165 + super.anInt9803);
			@Pc(181) int local181 = local111 / 2;
			@Pc(185) int local185 = local111 / 2;
			@Pc(197) int local197 = local106.method7625(local181 + super.anInt9805, super.anInt9803 + local185);
			@Pc(205) int local205 = local156 > local135 ? local135 : local156;
			@Pc(213) int local213 = local177 >= local197 ? local197 : local177;
			@Pc(221) int local221 = local197 > local156 ? local156 : local197;
			if (local111 != 0) {
				@Pc(237) int local237 = (int) (Math.atan2((double) (local205 - local213), (double) local111) * 2607.5945876176133D) & 0x3FFF;
				if (local237 != 0) {
					local90.method4213(local237);
				}
			}
			@Pc(255) int local255 = local177 > local135 ? local135 : local177;
			@Pc(259) int local259 = local197 + local135;
			if (local111 != 0) {
				@Pc(278) int local278 = (int) (Math.atan2((double) (local255 - local221), (double) local111) * 2607.5945876176133D) & 0x3FFF;
				if (local278 != 0) {
					local90.method4210(-local278);
				}
			}
			if (local177 + local156 < local259) {
				local259 = local156 + local177;
			}
			local259 = (local259 >> 1) - super.anInt9797;
			if (local259 != 0) {
				local90.method4225(0, local259, 0);
			}
		}
		local90.method4225(super.anInt9805, super.anInt9797 - 10, super.anInt9803);
		@Pc(335) Class4_Sub6 local335 = Static281.method4512(true, 3);
		this.anInt4903 = 0;
		this.aBoolean322 = false;
		@Pc(363) Class43 local363;
		if (this.anInt4890 != -1) {
			local363 = Static82.aClass134_1.method3191(this.anInt4890).method5688((Class359) null, this.anInt4886, 0, arg0, 0, 2048, -1, (Class264) null);
			if (local363 != null) {
				if (Static305.aBoolean339) {
					local363.method8846(local90, local335.aClass4_Sub8Array1[2], Static216.anInt1170, 0);
				} else {
					local363.method8849(local90, local335.aClass4_Sub8Array1[2], 0);
				}
				this.aBoolean322 |= local363.F();
				this.anInt4903 = local363.ma();
			}
		}
		if (this.anInt4883 != -1) {
			local363 = Static82.aClass134_1.method3191(this.anInt4883).method5688((Class359) null, this.anInt4893, 0, arg0, 0, 2048, -1, (Class264) null);
			if (local363 != null) {
				if (Static305.aBoolean339) {
					local363.method8846(local90, local335.aClass4_Sub8Array1[1], Static216.anInt1170, 0);
				} else {
					local363.method8849(local90, local335.aClass4_Sub8Array1[1], 0);
				}
				this.aBoolean322 |= local363.F();
				if (local363.ma() > this.anInt4903) {
					this.anInt4903 = local363.ma();
				}
			}
		}
		local363 = Static82.aClass134_1.method3191(this.anInt4899).method5688((Class359) null, this.anInt4884, 0, arg0, 0, 2048, -1, (Class264) null);
		if (local363 != null) {
			if (Static305.aBoolean339) {
				local363.method8846(local90, local335.aClass4_Sub8Array1[0], Static216.anInt1170, 0);
			} else {
				local363.method8849(local90, local335.aClass4_Sub8Array1[0], 0);
			}
			this.aBoolean322 |= local363.F();
			if (local363.ma() > this.anInt4903) {
				this.anInt4903 = local363.ma();
			}
		}
		return local335;
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(IIILclient!ha;)Z")
	@Override
	public boolean method8353(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class100 arg2) {
		@Pc(6) Class10 local6 = arg2.method8610();
		local6.method4214(super.anInt9805, super.anInt9797 - 10, super.anInt9803);
		@Pc(22) Class246 local22 = Static82.aClass134_1.method3191(this.anInt4899);
		@Pc(35) Class43 local35 = local22.method5688((Class359) null, this.anInt4884, 0, arg2, 0, 131072, -1, (Class264) null);
		if (local35 != null && (Static305.aBoolean339 ? local35.method8844(arg1, arg0, local6, true, local22.anInt6517, Static216.anInt1170) : local35.method8852(arg1, arg0, local6, true, local22.anInt6517))) {
			return true;
		}
		@Pc(75) Class246 local75;
		if (this.anInt4883 != -1) {
			local75 = Static82.aClass134_1.method3191(this.anInt4883);
			local35 = local75.method5688((Class359) null, this.anInt4893, 0, arg2, 0, 131072, -1, (Class264) null);
			if (local35 != null && (Static305.aBoolean339 ? local35.method8844(arg1, arg0, local6, true, local75.anInt6517, Static216.anInt1170) : local35.method8852(arg1, arg0, local6, true, local75.anInt6517))) {
				return true;
			}
		}
		if (this.anInt4890 != -1) {
			local75 = Static82.aClass134_1.method3191(this.anInt4890);
			local35 = local75.method5688((Class359) null, this.anInt4886, 0, arg2, 0, 131072, -1, (Class264) null);
			if (local35 != null && (Static305.aBoolean339 ? local35.method8844(arg1, arg0, local6, true, local75.anInt6517, Static216.anInt1170) : local35.method8852(arg1, arg0, local6, true, local75.anInt6517))) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jia", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method8344() {
		return this.aBoolean322;
	}

	@OriginalMember(owner = "client!jia", name = "b", descriptor = "(Lclient!ha;B)Lclient!rga;")
	@Override
	public Class315 method8350(@OriginalArg(0) Class100 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!jia", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method8356() {
		return false;
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8342(@OriginalArg(1) Class100 arg0) {
	}
}
