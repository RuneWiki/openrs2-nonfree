import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class23_Sub2_Sub4_Sub1 extends Class23_Sub2_Sub4 {

	@OriginalMember(owner = "client!m", name = "J", descriptor = "I")
	public int anInt6377;

	@OriginalMember(owner = "client!m", name = "Q", descriptor = "I")
	public int anInt6383;

	@OriginalMember(owner = "client!m", name = "S", descriptor = "I")
	public int anInt6384;

	@OriginalMember(owner = "client!m", name = "Y", descriptor = "I")
	public int anInt6389;

	@OriginalMember(owner = "client!m", name = "E", descriptor = "I")
	public int anInt6373 = -1;

	@OriginalMember(owner = "client!m", name = "N", descriptor = "I")
	public int anInt6381 = 0;

	@OriginalMember(owner = "client!m", name = "K", descriptor = "I")
	private int anInt6378 = 0;

	@OriginalMember(owner = "client!m", name = "U", descriptor = "Z")
	private boolean aBoolean491 = false;

	@OriginalMember(owner = "client!m", name = "X", descriptor = "I")
	public int anInt6388 = -1;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(IIIII)V")
	public Class23_Sub2_Sub4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method8594() {
		return this.aBoolean491;
	}

	@OriginalMember(owner = "client!m", name = "d", descriptor = "(B)I")
	@Override
	public int method8605() {
		@Pc(9) Class146 local9 = Static237.aClass371_2.method8305(this.anInt6377);
		@Pc(20) int local20 = local9.anInt3711;
		@Pc(31) Class146 local31;
		if (this.anInt6373 != -1) {
			local31 = Static237.aClass371_2.method8305(this.anInt6373);
			if (local31.anInt3711 > local20) {
				local20 = local31.anInt3711;
			}
		}
		if (this.anInt6388 != -1) {
			local31 = Static237.aClass371_2.method8305(this.anInt6388);
			if (local31.anInt3711 > local20) {
				local20 = local31.anInt3711;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!m", name = "h", descriptor = "(I)I")
	@Override
	public int method8606(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.anInt6389 = 74;
		}
		return this.anInt6378;
	}

	@OriginalMember(owner = "client!m", name = "g", descriptor = "(I)I")
	@Override
	public int method8601() {
		return -10;
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(BLclient!ha;)Lclient!hga;")
	@Override
	public Class23_Sub6 method8603(@OriginalArg(1) Class16 arg0) {
		@Pc(17) Class85 local17 = Static502.method7146(super.aByte142, super.anInt10108 >> Static436.anInt7634, super.anInt10109 >> Static436.anInt7634);
		@Pc(29) Class23_Sub2_Sub3 local29 = Static306.method4709(super.aByte142, super.anInt10108 >> Static436.anInt7634, super.anInt10109 >> Static436.anInt7634);
		@Pc(31) int local31 = 0;
		if (local17 != null && local17.aClass23_Sub2_Sub1_1.aBoolean745) {
			local31 = local17.aClass23_Sub2_Sub1_1.method8601();
		}
		if (local29 != null && local29.aShort116 > -local31) {
			local31 = -local29.aShort116;
		}
		if (local31 != this.anInt6381) {
			super.anInt10114 -= this.anInt6381;
			this.anInt6381 = local31;
			super.anInt10114 += local31;
		}
		@Pc(80) Class25 local80 = arg0.method8156();
		local80.method4291();
		if (this.anInt6381 == 0) {
			@Pc(96) Class104 local96 = Static343.aClass104Array2[super.aByte143];
			@Pc(101) int local101 = this.anInt6378 << 1;
			@Pc(108) int local108 = -local101 / 2;
			@Pc(113) int local113 = -local101 / 2;
			@Pc(126) int local126 = local96.method8286(local108 + super.anInt10108, super.anInt10109 - -local113);
			@Pc(130) int local130 = local101 / 2;
			@Pc(135) int local135 = -local101 / 2;
			@Pc(147) int local147 = local96.method8286(local130 + super.anInt10108, local135 + super.anInt10109);
			@Pc(152) int local152 = -local101 / 2;
			@Pc(156) int local156 = local101 / 2;
			@Pc(169) int local169 = local96.method8286(super.anInt10108 + local152, super.anInt10109 - -local156);
			@Pc(173) int local173 = local101 / 2;
			@Pc(177) int local177 = local101 / 2;
			@Pc(190) int local190 = local96.method8286(super.anInt10108 + local173, local177 + super.anInt10109);
			@Pc(197) int local197 = local126 >= local147 ? local147 : local126;
			@Pc(204) int local204 = local190 > local169 ? local169 : local190;
			@Pc(211) int local211 = local190 > local147 ? local147 : local190;
			@Pc(218) int local218 = local169 > local126 ? local126 : local169;
			if (local101 != 0) {
				@Pc(237) int local237 = (int) (Math.atan2((double) (local197 - local204), (double) local101) * 2607.5945876176133D) & 0x3FFF;
				if (local237 != 0) {
					local80.method4284(local237);
				}
			}
			if (local101 != 0) {
				@Pc(264) int local264 = (int) (Math.atan2((double) (local218 - local211), (double) local101) * 2607.5945876176133D) & 0x3FFF;
				if (local264 != 0) {
					local80.method4293(-local264);
				}
			}
			@Pc(274) int local274 = local190 + local126;
			if (local169 + local147 < local274) {
				local274 = local147 + local169;
			}
			local274 = (local274 >> 1) - super.anInt10114;
			if (local274 != 0) {
				local80.method4301(0, local274, 0);
			}
		}
		local80.method4301(super.anInt10108, super.anInt10114 - 10, super.anInt10109);
		@Pc(321) Class23_Sub6 local321 = Static564.method8406(3, true);
		this.anInt6378 = 0;
		this.aBoolean491 = false;
		@Pc(354) Class28 local354;
		if (this.anInt6388 != -1) {
			local354 = Static237.aClass371_2.method8305(this.anInt6388).method3197(arg0, 2048, 0, (Class293) null, this.anInt6389, (Class48) null, 0, -1);
			if (local354 != null) {
				if (Static148.aBoolean221) {
					local354.method6894(local80, local321.aClass23_Sub4Array1[2], Static209.anInt10104, 0);
				} else {
					local354.method6908(local80, local321.aClass23_Sub4Array1[2], 0);
				}
				this.aBoolean491 |= local354.F();
				this.anInt6378 = local354.ma();
			}
		}
		if (this.anInt6373 != -1) {
			local354 = Static237.aClass371_2.method8305(this.anInt6373).method3197(arg0, 2048, 0, (Class293) null, this.anInt6384, (Class48) null, 0, -1);
			if (local354 != null) {
				if (Static148.aBoolean221) {
					local354.method6894(local80, local321.aClass23_Sub4Array1[1], Static209.anInt10104, 0);
				} else {
					local354.method6908(local80, local321.aClass23_Sub4Array1[1], 0);
				}
				this.aBoolean491 |= local354.F();
				if (local354.ma() > this.anInt6378) {
					this.anInt6378 = local354.ma();
				}
			}
		}
		local354 = Static237.aClass371_2.method8305(this.anInt6377).method3197(arg0, 2048, 0, (Class293) null, this.anInt6383, (Class48) null, 0, -1);
		if (local354 != null) {
			if (Static148.aBoolean221) {
				local354.method6894(local80, local321.aClass23_Sub4Array1[0], Static209.anInt10104, 0);
			} else {
				local354.method6908(local80, local321.aClass23_Sub4Array1[0], 0);
			}
			this.aBoolean491 |= local354.F();
			if (local354.ma() > this.anInt6378) {
				this.anInt6378 = local354.ma();
			}
		}
		return local321;
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(Lclient!ha;B)Lclient!dg;")
	@Override
	public Class77 method8595(@OriginalArg(0) Class16 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!m", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method8608() {
		return false;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method8600(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class25 local6 = arg0.method8156();
		local6.method4303(super.anInt10108, super.anInt10114 - 10, super.anInt10109);
		@Pc(22) Class146 local22 = Static237.aClass371_2.method8305(this.anInt6377);
		@Pc(35) Class28 local35 = local22.method3197(arg0, 131072, 0, (Class293) null, this.anInt6383, (Class48) null, 0, -1);
		if (local35 != null && (Static148.aBoolean221 ? local35.method6904(arg1, arg2, local6, true, local22.anInt3711, Static209.anInt10104) : local35.method6887(arg1, arg2, local6, true, local22.anInt3711))) {
			return true;
		}
		@Pc(71) Class146 local71;
		if (this.anInt6373 != -1) {
			local71 = Static237.aClass371_2.method8305(this.anInt6373);
			local35 = local71.method3197(arg0, 131072, 0, (Class293) null, this.anInt6384, (Class48) null, 0, -1);
			if (local35 != null && (Static148.aBoolean221 ? local35.method6904(arg1, arg2, local6, true, local71.anInt3711, Static209.anInt10104) : local35.method6887(arg1, arg2, local6, true, local71.anInt3711))) {
				return true;
			}
		}
		if (this.anInt6388 != -1) {
			local71 = Static237.aClass371_2.method8305(this.anInt6388);
			local35 = local71.method3197(arg0, 131072, 0, (Class293) null, this.anInt6389, (Class48) null, 0, -1);
			if (local35 != null && (Static148.aBoolean221 ? local35.method6904(arg1, arg2, local6, true, local71.anInt3711, Static209.anInt10104) : local35.method6887(arg1, arg2, local6, true, local71.anInt3711))) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8590(@OriginalArg(1) Class16 arg0) {
	}
}
