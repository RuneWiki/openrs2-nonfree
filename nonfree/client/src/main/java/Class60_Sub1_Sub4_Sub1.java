import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class60_Sub1_Sub4_Sub1 extends Class60_Sub1_Sub4 {

	@OriginalMember(owner = "client!gg", name = "db", descriptor = "I")
	public int anInt3861;

	@OriginalMember(owner = "client!gg", name = "X", descriptor = "I")
	public int anInt3862;

	@OriginalMember(owner = "client!gg", name = "M", descriptor = "I")
	public int anInt3870;

	@OriginalMember(owner = "client!gg", name = "N", descriptor = "I")
	public int anInt3878;

	@OriginalMember(owner = "client!gg", name = "Q", descriptor = "I")
	private int anInt3869 = 0;

	@OriginalMember(owner = "client!gg", name = "O", descriptor = "I")
	public int anInt3874 = 0;

	@OriginalMember(owner = "client!gg", name = "W", descriptor = "I")
	public int anInt3875 = -1;

	@OriginalMember(owner = "client!gg", name = "U", descriptor = "Z")
	private boolean aBoolean322 = false;

	@OriginalMember(owner = "client!gg", name = "Y", descriptor = "I")
	public int anInt3879 = -1;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(IIIII)V")
	public Class60_Sub1_Sub4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(B)I")
	@Override
	public int method7921(@OriginalArg(0) byte arg0) {
		return arg0 == 114 ? this.anInt3869 : 13;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!ha;B)Lclient!sba;")
	@Override
	public Class323 method7924(@OriginalArg(0) Class75 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(Z)I")
	@Override
	public int method7922() {
		return -10;
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(ZLclient!ha;)Lclient!rs;")
	@Override
	public Class60_Sub9 method7911(@OriginalArg(1) Class75 arg0) {
		@Pc(17) Class123 local17 = Static664.method8832(super.aByte135, super.anInt9048 >> Static594.anInt9440, super.anInt9057 >> Static594.anInt9440);
		@Pc(29) Class60_Sub1_Sub2 local29 = Static64.method787(super.aByte135, super.anInt9048 >> Static594.anInt9440, super.anInt9057 >> Static594.anInt9440);
		@Pc(31) int local31 = 0;
		if (local17 != null && local17.aClass60_Sub1_Sub1_1.aBoolean637) {
			local31 = local17.aClass60_Sub1_Sub1_1.method7922();
		}
		if (local29 != null && local29.aShort45 > -local31) {
			local31 = -local29.aShort45;
		}
		if (this.anInt3874 != local31) {
			super.anInt9051 -= this.anInt3874;
			super.anInt9051 += local31;
			this.anInt3874 = local31;
		}
		@Pc(82) Class109 local82 = arg0.method6643();
		local82.method4612();
		if (this.anInt3874 == 0) {
			@Pc(101) Class96 local101 = Static555.aClass96Array3[super.aByte134];
			@Pc(106) int local106 = this.anInt3869 << 1;
			@Pc(113) int local113 = -local106 / 2;
			@Pc(118) int local118 = -local106 / 2;
			@Pc(131) int local131 = local101.method8077(super.anInt9048 + local113, super.anInt9057 - -local118);
			@Pc(135) int local135 = local106 / 2;
			@Pc(140) int local140 = -local106 / 2;
			@Pc(152) int local152 = local101.method8077(local135 + super.anInt9048, local140 + super.anInt9057);
			@Pc(157) int local157 = -local106 / 2;
			@Pc(161) int local161 = local106 / 2;
			@Pc(174) int local174 = local101.method8077(local157 + super.anInt9048, super.anInt9057 - -local161);
			@Pc(178) int local178 = local106 / 2;
			@Pc(182) int local182 = local106 / 2;
			@Pc(195) int local195 = local101.method8077(local178 + super.anInt9048, super.anInt9057 - -local182);
			@Pc(203) int local203 = local131 < local152 ? local131 : local152;
			@Pc(211) int local211 = local195 <= local174 ? local195 : local174;
			@Pc(219) int local219 = local152 >= local195 ? local195 : local152;
			@Pc(227) int local227 = local174 <= local131 ? local174 : local131;
			if (local106 != 0) {
				@Pc(245) int local245 = (int) (Math.atan2((double) (local203 - local211), (double) local106) * 2607.5945876176133D) & 0x3FFF;
				if (local245 != 0) {
					local82.method4602(local245);
				}
			}
			if (local106 != 0) {
				@Pc(273) int local273 = (int) (Math.atan2((double) (local227 - local219), (double) local106) * 2607.5945876176133D) & 0x3FFF;
				if (local273 != 0) {
					local82.method4611(-local273);
				}
			}
			@Pc(285) int local285 = local131 + local195;
			if (local285 > local174 + local152) {
				local285 = local152 + local174;
			}
			local285 = (local285 >> 1) - super.anInt9051;
			if (local285 != 0) {
				local82.method4604(0, local285, 0);
			}
		}
		local82.method4604(super.anInt9048, super.anInt9051 - 10, super.anInt9057);
		@Pc(330) Class60_Sub9 local330 = Static511.method7383(true, 3);
		this.aBoolean322 = false;
		this.anInt3869 = 0;
		@Pc(354) Class54 local354;
		if (this.anInt3875 != -1) {
			local354 = Static149.aClass244_1.method5958(this.anInt3875).method6985(2048, this.anInt3861, (Class73) null, arg0, (Class104) null);
			if (local354 != null) {
				if (Static490.aBoolean634) {
					local354.method7407(local82, local330.aClass60_Sub10Array1[2], Static377.anInt6468, 0);
				} else {
					local354.method7401(local82, local330.aClass60_Sub10Array1[2], 0);
				}
				this.aBoolean322 |= local354.F();
				this.anInt3869 = local354.ma();
			}
		}
		if (this.anInt3879 != -1) {
			local354 = Static149.aClass244_1.method5958(this.anInt3879).method6985(2048, this.anInt3878, (Class73) null, arg0, (Class104) null);
			if (local354 != null) {
				if (Static490.aBoolean634) {
					local354.method7407(local82, local330.aClass60_Sub10Array1[1], Static377.anInt6468, 0);
				} else {
					local354.method7401(local82, local330.aClass60_Sub10Array1[1], 0);
				}
				this.aBoolean322 |= local354.F();
				if (local354.ma() > this.anInt3869) {
					this.anInt3869 = local354.ma();
				}
			}
		}
		local354 = Static149.aClass244_1.method5958(this.anInt3862).method6985(2048, this.anInt3870, (Class73) null, arg0, (Class104) null);
		if (local354 != null) {
			if (Static490.aBoolean634) {
				local354.method7407(local82, local330.aClass60_Sub10Array1[0], Static377.anInt6468, 0);
			} else {
				local354.method7401(local82, local330.aClass60_Sub10Array1[0], 0);
			}
			this.aBoolean322 |= local354.F();
			if (local354.ma() > this.anInt3869) {
				this.anInt3869 = local354.ma();
			}
		}
		return local330;
	}

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method7918() {
		return this.aBoolean322;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method7909(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			;
		}
	}

	@OriginalMember(owner = "client!gg", name = "e", descriptor = "(Z)Z")
	@Override
	public boolean method7919() {
		return false;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method7927(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class109 local6 = arg0.method6643();
		local6.method4606(super.anInt9048, super.anInt9051 - 10, super.anInt9057);
		@Pc(24) Class282 local24 = Static149.aClass244_1.method5958(this.anInt3862);
		@Pc(34) Class54 local34 = local24.method6985(131072, this.anInt3870, (Class73) null, arg0, (Class104) null);
		if (local34 != null && (Static490.aBoolean634 ? local34.method7399(arg2, arg1, local6, true, local24.anInt7902, Static377.anInt6468) : local34.method7417(arg2, arg1, local6, true, local24.anInt7902))) {
			return true;
		}
		@Pc(73) Class282 local73;
		if (this.anInt3879 != -1) {
			local73 = Static149.aClass244_1.method5958(this.anInt3879);
			local34 = local73.method6985(131072, this.anInt3878, (Class73) null, arg0, (Class104) null);
			if (local34 != null && (Static490.aBoolean634 ? local34.method7399(arg2, arg1, local6, true, local73.anInt7902, Static377.anInt6468) : local34.method7417(arg2, arg1, local6, true, local73.anInt7902))) {
				return true;
			}
		}
		if (this.anInt3875 != -1) {
			local73 = Static149.aClass244_1.method5958(this.anInt3875);
			local34 = local73.method6985(131072, this.anInt3861, (Class73) null, arg0, (Class104) null);
			if (local34 != null && (Static490.aBoolean634 ? local34.method7399(arg2, arg1, local6, true, local73.anInt7902, Static377.anInt6468) : local34.method7417(arg2, arg1, local6, true, local73.anInt7902))) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gg", name = "f", descriptor = "(I)I")
	@Override
	public int method7916() {
		@Pc(9) Class282 local9 = Static149.aClass244_1.method5958(this.anInt3862);
		@Pc(12) int local12 = local9.anInt7902;
		@Pc(30) Class282 local30;
		if (this.anInt3879 != -1) {
			local30 = Static149.aClass244_1.method5958(this.anInt3879);
			if (local12 < local30.anInt7902) {
				local12 = local30.anInt7902;
			}
		}
		if (this.anInt3875 != -1) {
			local30 = Static149.aClass244_1.method5958(this.anInt3875);
			if (local12 < local30.anInt7902) {
				local12 = local30.anInt7902;
			}
		}
		return local12;
	}
}
