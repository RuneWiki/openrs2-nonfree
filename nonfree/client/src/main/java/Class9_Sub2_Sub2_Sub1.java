import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dda")
public final class Class9_Sub2_Sub2_Sub1 extends Class9_Sub2_Sub2 {

	@OriginalMember(owner = "client!dda", name = "T", descriptor = "I")
	public int anInt1812;

	@OriginalMember(owner = "client!dda", name = "W", descriptor = "I")
	public int anInt1815;

	@OriginalMember(owner = "client!dda", name = "fb", descriptor = "I")
	public int anInt1823;

	@OriginalMember(owner = "client!dda", name = "hb", descriptor = "I")
	public int anInt1825;

	@OriginalMember(owner = "client!dda", name = "L", descriptor = "I")
	public int anInt1804 = -1;

	@OriginalMember(owner = "client!dda", name = "db", descriptor = "I")
	public int anInt1821 = 0;

	@OriginalMember(owner = "client!dda", name = "Y", descriptor = "I")
	private int anInt1817 = 0;

	@OriginalMember(owner = "client!dda", name = "Z", descriptor = "I")
	public int anInt1818 = -1;

	@OriginalMember(owner = "client!dda", name = "bb", descriptor = "Z")
	private boolean aBoolean134 = false;

	@OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(IIIII)V")
	public Class9_Sub2_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(ZLclient!ha;)V")
	@Override
	public void method8600(@OriginalArg(1) Class82 arg0) {
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(ILclient!ha;IB)Z")
	@Override
	public boolean method8605(@OriginalArg(0) int arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class31 local6 = arg1.method6125();
		local6.method7921(super.anInt10152, super.anInt10154 - 10, super.anInt10158);
		@Pc(22) Class259 local22 = Static298.aClass132_1.method3062(this.anInt1825);
		@Pc(35) Class75 local35 = local22.method6464((Class267) null, -1, this.anInt1823, arg1, (Class375) null, 131072, 0, 0);
		if (local35 != null && (Static40.aBoolean34 ? local35.method6800(arg0, arg2, local6, true, local22.anInt7373, Static562.anInt9327) : local35.method6804(arg0, arg2, local6, true, local22.anInt7373))) {
			return true;
		}
		@Pc(77) Class259 local77;
		if (this.anInt1818 != -1) {
			local77 = Static298.aClass132_1.method3062(this.anInt1818);
			local35 = local77.method6464((Class267) null, -1, this.anInt1815, arg1, (Class375) null, 131072, 0, 0);
			if (local35 != null && (Static40.aBoolean34 ? local35.method6800(arg0, arg2, local6, true, local77.anInt7373, Static562.anInt9327) : local35.method6804(arg0, arg2, local6, true, local77.anInt7373))) {
				return true;
			}
		}
		if (this.anInt1804 != -1) {
			local77 = Static298.aClass132_1.method3062(this.anInt1804);
			local35 = local77.method6464((Class267) null, -1, this.anInt1812, arg1, (Class375) null, 131072, 0, 0);
			if (local35 != null && (Static40.aBoolean34 ? local35.method6800(arg0, arg2, local6, true, local77.anInt7373, Static562.anInt9327) : local35.method6804(arg0, arg2, local6, true, local77.anInt7373))) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dda", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method8597() {
		return false;
	}

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "(Lclient!ha;B)Lclient!iha;")
	@Override
	public Class160 method8604(@OriginalArg(0) Class82 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!dda", name = "j", descriptor = "(I)I")
	@Override
	public int method8599() {
		@Pc(13) Class259 local13 = Static298.aClass132_1.method3062(this.anInt1825);
		@Pc(16) int local16 = local13.anInt7373;
		@Pc(26) Class259 local26;
		if (this.anInt1818 != -1) {
			local26 = Static298.aClass132_1.method3062(this.anInt1818);
			if (local26.anInt7373 > local16) {
				local16 = local26.anInt7373;
			}
		}
		if (this.anInt1804 != -1) {
			local26 = Static298.aClass132_1.method3062(this.anInt1804);
			if (local26.anInt7373 > local16) {
				local16 = local26.anInt7373;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lclient!ha;I)Lclient!ua;")
	@Override
	public Class9_Sub10 method8603(@OriginalArg(0) Class82 arg0) {
		@Pc(17) Class105 local17 = Static290.method4746(super.aByte127, super.anInt10152 >> Static485.anInt8241, super.anInt10158 >> Static485.anInt8241);
		@Pc(29) Class9_Sub2_Sub4 local29 = Static279.method4563(super.aByte127, super.anInt10152 >> Static485.anInt8241, super.anInt10158 >> Static485.anInt8241);
		@Pc(31) int local31 = 0;
		if (local17 != null && local17.aClass9_Sub2_Sub1_1.aBoolean771) {
			local31 = local17.aClass9_Sub2_Sub1_1.method8613();
		}
		if (local29 != null && -local31 < local29.aShort93) {
			local31 = -local29.aShort93;
		}
		if (local31 != this.anInt1821) {
			super.anInt10154 -= this.anInt1821;
			super.anInt10154 += local31;
			this.anInt1821 = local31;
		}
		@Pc(82) Class31 local82 = arg0.method6125();
		local82.method7926();
		if (this.anInt1821 == 0) {
			@Pc(98) Class91 local98 = Static637.aClass91Array4[super.aByte128];
			@Pc(103) int local103 = this.anInt1817 << 1;
			@Pc(110) int local110 = -local103 / 2;
			@Pc(115) int local115 = -local103 / 2;
			@Pc(128) int local128 = local98.method7725(super.anInt10152 + local110, local115 + super.anInt10158);
			@Pc(132) int local132 = local103 / 2;
			@Pc(137) int local137 = -local103 / 2;
			@Pc(149) int local149 = local98.method7725(local132 + super.anInt10152, local137 + super.anInt10158);
			@Pc(154) int local154 = -local103 / 2;
			@Pc(158) int local158 = local103 / 2;
			@Pc(170) int local170 = local98.method7725(local154 + super.anInt10152, local158 + super.anInt10158);
			@Pc(174) int local174 = local103 / 2;
			@Pc(178) int local178 = local103 / 2;
			@Pc(190) int local190 = local98.method7725(super.anInt10152 + local174, local178 + super.anInt10158);
			@Pc(197) int local197 = local149 <= local128 ? local149 : local128;
			@Pc(208) int local208 = local170 >= local190 ? local190 : local170;
			@Pc(215) int local215 = local190 > local149 ? local149 : local190;
			@Pc(222) int local222 = local170 > local128 ? local128 : local170;
			if (local103 != 0) {
				@Pc(238) int local238 = (int) (Math.atan2((double) (local197 - local208), (double) local103) * 2607.5945876176133D) & 0x3FFF;
				if (local238 != 0) {
					local82.method7936(local238);
				}
			}
			if (local103 != 0) {
				@Pc(262) int local262 = (int) (Math.atan2((double) (local222 - local215), (double) local103) * 2607.5945876176133D) & 0x3FFF;
				if (local262 != 0) {
					local82.method7927(-local262);
				}
			}
			@Pc(272) int local272 = local190 + local128;
			if (local272 > local170 + local149) {
				local272 = local149 + local170;
			}
			local272 = (local272 >> 1) - super.anInt10154;
			if (local272 != 0) {
				local82.method7930(0, local272, 0);
			}
		}
		local82.method7930(super.anInt10152, super.anInt10154 - 10, super.anInt10158);
		@Pc(317) Class9_Sub10 local317 = Static635.method8548(3, true);
		this.aBoolean134 = false;
		this.anInt1817 = 0;
		@Pc(344) Class75 local344;
		if (this.anInt1804 != -1) {
			local344 = Static298.aClass132_1.method3062(this.anInt1804).method6464((Class267) null, -1, this.anInt1812, arg0, (Class375) null, 2048, 0, 0);
			if (local344 != null) {
				if (Static40.aBoolean34) {
					local344.method6788(local82, local317.aClass9_Sub5Array1[2], Static562.anInt9327, 0);
				} else {
					local344.method6799(local82, local317.aClass9_Sub5Array1[2], 0);
				}
				this.aBoolean134 |= local344.F();
				this.anInt1817 = local344.ma();
			}
		}
		if (this.anInt1818 != -1) {
			local344 = Static298.aClass132_1.method3062(this.anInt1818).method6464((Class267) null, -1, this.anInt1815, arg0, (Class375) null, 2048, 0, 0);
			if (local344 != null) {
				if (Static40.aBoolean34) {
					local344.method6788(local82, local317.aClass9_Sub5Array1[1], Static562.anInt9327, 0);
				} else {
					local344.method6799(local82, local317.aClass9_Sub5Array1[1], 0);
				}
				this.aBoolean134 |= local344.F();
				if (local344.ma() > this.anInt1817) {
					this.anInt1817 = local344.ma();
				}
			}
		}
		local344 = Static298.aClass132_1.method3062(this.anInt1825).method6464((Class267) null, -1, this.anInt1823, arg0, (Class375) null, 2048, 0, 0);
		if (local344 != null) {
			if (Static40.aBoolean34) {
				local344.method6788(local82, local317.aClass9_Sub5Array1[0], Static562.anInt9327, 0);
			} else {
				local344.method6799(local82, local317.aClass9_Sub5Array1[0], 0);
			}
			this.aBoolean134 |= local344.F();
			if (local344.ma() > this.anInt1817) {
				this.anInt1817 = local344.ma();
			}
		}
		return local317;
	}

	@OriginalMember(owner = "client!dda", name = "c", descriptor = "(B)I")
	@Override
	public int method8611(@OriginalArg(0) byte arg0) {
		if (arg0 != -86) {
			Static92.method1553(-78L);
		}
		return this.anInt1817;
	}

	@OriginalMember(owner = "client!dda", name = "n", descriptor = "(I)I")
	@Override
	public int method8613() {
		return -10;
	}

	@OriginalMember(owner = "client!dda", name = "l", descriptor = "(I)Z")
	@Override
	public boolean method8607() {
		return this.aBoolean134;
	}
}
