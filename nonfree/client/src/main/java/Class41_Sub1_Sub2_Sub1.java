import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rha")
public final class Class41_Sub1_Sub2_Sub1 extends Class41_Sub1_Sub2 {

	@OriginalMember(owner = "client!rha", name = "K", descriptor = "I")
	public int anInt8567;

	@OriginalMember(owner = "client!rha", name = "R", descriptor = "I")
	public int anInt8569;

	@OriginalMember(owner = "client!rha", name = "ab", descriptor = "I")
	public int anInt8577;

	@OriginalMember(owner = "client!rha", name = "ib", descriptor = "I")
	public int anInt8584;

	@OriginalMember(owner = "client!rha", name = "V", descriptor = "I")
	public int anInt8572 = 0;

	@OriginalMember(owner = "client!rha", name = "fb", descriptor = "I")
	public int anInt8582 = -1;

	@OriginalMember(owner = "client!rha", name = "cb", descriptor = "I")
	public int anInt8579 = -1;

	@OriginalMember(owner = "client!rha", name = "bb", descriptor = "I")
	private int anInt8578 = 0;

	@OriginalMember(owner = "client!rha", name = "U", descriptor = "Z")
	private boolean aBoolean619 = false;

	@OriginalMember(owner = "client!rha", name = "<init>", descriptor = "(IIIII)V")
	public Class41_Sub1_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!rha", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8647() {
		return this.aBoolean619;
	}

	@OriginalMember(owner = "client!rha", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method8650() {
		return false;
	}

	@OriginalMember(owner = "client!rha", name = "j", descriptor = "(I)I")
	@Override
	public int method8660(@OriginalArg(0) int arg0) {
		if (arg0 >= -9) {
			Static505.anInt8570 = -75;
		}
		return this.anInt8578;
	}

	@OriginalMember(owner = "client!rha", name = "g", descriptor = "(I)I")
	@Override
	public int method8652() {
		return -10;
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(IZLclient!ha;I)Z")
	@Override
	public boolean method8661(@OriginalArg(0) int arg0, @OriginalArg(2) Class143 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class56 local6 = arg1.method6212();
		local6.method8395(super.anInt10366, super.anInt10370 - 10, super.anInt10367);
		@Pc(22) Class219 local22 = Static259.aClass135_1.method2776(this.anInt8567);
		@Pc(35) Class114 local35 = local22.method5173(131072, 0, this.anInt8577, 0, -1, arg1, (Class65) null, (Class239) null);
		if (local35 != null && (Static426.aBoolean555 ? local35.method8798(arg2, arg0, local6, true, local22.anInt6152, Static663.anInt10391) : local35.method8795(arg2, arg0, local6, true, local22.anInt6152))) {
			return true;
		}
		@Pc(71) Class219 local71;
		if (this.anInt8579 != -1) {
			local71 = Static259.aClass135_1.method2776(this.anInt8579);
			local35 = local71.method5173(131072, 0, this.anInt8569, 0, -1, arg1, (Class65) null, (Class239) null);
			if (local35 != null && (Static426.aBoolean555 ? local35.method8798(arg2, arg0, local6, true, local71.anInt6152, Static663.anInt10391) : local35.method8795(arg2, arg0, local6, true, local71.anInt6152))) {
				return true;
			}
		}
		if (this.anInt8582 != -1) {
			local71 = Static259.aClass135_1.method2776(this.anInt8582);
			local35 = local71.method5173(131072, 0, this.anInt8584, 0, -1, arg1, (Class65) null, (Class239) null);
			if (local35 != null && (Static426.aBoolean555 ? local35.method8798(arg2, arg0, local6, true, local71.anInt6152, Static663.anInt10391) : local35.method8795(arg2, arg0, local6, true, local71.anInt6152))) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rha", name = "k", descriptor = "(I)I")
	@Override
	public int method8663() {
		@Pc(9) Class219 local9 = Static259.aClass135_1.method2776(this.anInt8567);
		@Pc(12) int local12 = local9.anInt6152;
		@Pc(22) Class219 local22;
		if (this.anInt8579 != -1) {
			local22 = Static259.aClass135_1.method2776(this.anInt8579);
			if (local12 < local22.anInt6152) {
				local12 = local22.anInt6152;
			}
		}
		if (this.anInt8582 != -1) {
			local22 = Static259.aClass135_1.method2776(this.anInt8582);
			if (local12 < local22.anInt6152) {
				local12 = local22.anInt6152;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(Lclient!ha;B)Lclient!hq;")
	@Override
	public Class41_Sub3 method8648(@OriginalArg(0) Class143 arg0) {
		@Pc(17) Class40 local17 = Static395.method5735(super.aByte149, super.anInt10366 >> Static138.anInt2287, super.anInt10367 >> Static138.anInt2287);
		@Pc(29) Class41_Sub1_Sub4 local29 = Static198.method2808(super.aByte149, super.anInt10366 >> Static138.anInt2287, super.anInt10367 >> Static138.anInt2287);
		@Pc(31) int local31 = 0;
		if (local17 != null && local17.aClass41_Sub1_Sub1_1.aBoolean689) {
			local31 = local17.aClass41_Sub1_Sub1_1.method8652();
		}
		if (local29 != null && -local31 < local29.aShort86) {
			local31 = -local29.aShort86;
		}
		if (this.anInt8572 != local31) {
			super.anInt10370 -= this.anInt8572;
			this.anInt8572 = local31;
			super.anInt10370 += local31;
		}
		@Pc(80) Class56 local80 = arg0.method6212();
		local80.method8400();
		if (this.anInt8572 == 0) {
			@Pc(96) Class88 local96 = Static298.aClass88Array3[super.aByte150];
			@Pc(101) int local101 = this.anInt8578 << 1;
			@Pc(108) int local108 = -local101 / 2;
			@Pc(113) int local113 = -local101 / 2;
			@Pc(125) int local125 = local96.method8753(super.anInt10366 + local108, super.anInt10367 + local113);
			@Pc(129) int local129 = local101 / 2;
			@Pc(134) int local134 = -local101 / 2;
			@Pc(147) int local147 = local96.method8753(super.anInt10366 + local129, local134 + super.anInt10367);
			@Pc(152) int local152 = -local101 / 2;
			@Pc(156) int local156 = local101 / 2;
			@Pc(168) int local168 = local96.method8753(super.anInt10366 + local152, super.anInt10367 + local156);
			@Pc(172) int local172 = local101 / 2;
			@Pc(176) int local176 = local101 / 2;
			@Pc(189) int local189 = local96.method8753(super.anInt10366 + local172, super.anInt10367 - -local176);
			@Pc(196) int local196 = local125 < local147 ? local125 : local147;
			@Pc(203) int local203 = local189 <= local168 ? local189 : local168;
			@Pc(214) int local214 = local189 > local147 ? local147 : local189;
			@Pc(221) int local221 = local125 >= local168 ? local168 : local125;
			if (local101 != 0) {
				@Pc(237) int local237 = (int) (Math.atan2((double) (local196 - local203), (double) local101) * 2607.5945876176133D) & 0x3FFF;
				if (local237 != 0) {
					local80.method8387(local237);
				}
			}
			if (local101 != 0) {
				@Pc(258) int local258 = (int) (Math.atan2((double) (local221 - local214), (double) local101) * 2607.5945876176133D) & 0x3FFF;
				if (local258 != 0) {
					local80.method8385(-local258);
				}
			}
			@Pc(272) int local272 = local125 + local189;
			if (local147 + local168 < local272) {
				local272 = local147 + local168;
			}
			local272 = (local272 >> 1) - super.anInt10370;
			if (local272 != 0) {
				local80.method8390(0, local272, 0);
			}
		}
		local80.method8390(super.anInt10366, super.anInt10370 - 10, super.anInt10367);
		@Pc(312) Class41_Sub3 local312 = Static578.method7877(3, true);
		this.anInt8578 = 0;
		this.aBoolean619 = false;
		@Pc(339) Class114 local339;
		if (this.anInt8582 != -1) {
			local339 = Static259.aClass135_1.method2776(this.anInt8582).method5173(2048, 0, this.anInt8584, 0, -1, arg0, (Class65) null, (Class239) null);
			if (local339 != null) {
				if (Static426.aBoolean555) {
					local339.method8807(local80, local312.aClass41_Sub9Array1[2], Static663.anInt10391, 0);
				} else {
					local339.method8801(local80, local312.aClass41_Sub9Array1[2], 0);
				}
				this.aBoolean619 |= local339.F();
				this.anInt8578 = local339.ma();
			}
		}
		if (this.anInt8579 != -1) {
			local339 = Static259.aClass135_1.method2776(this.anInt8579).method5173(2048, 0, this.anInt8569, 0, -1, arg0, (Class65) null, (Class239) null);
			if (local339 != null) {
				if (Static426.aBoolean555) {
					local339.method8807(local80, local312.aClass41_Sub9Array1[1], Static663.anInt10391, 0);
				} else {
					local339.method8801(local80, local312.aClass41_Sub9Array1[1], 0);
				}
				this.aBoolean619 |= local339.F();
				if (local339.ma() > this.anInt8578) {
					this.anInt8578 = local339.ma();
				}
			}
		}
		local339 = Static259.aClass135_1.method2776(this.anInt8567).method5173(2048, 0, this.anInt8577, 0, -1, arg0, (Class65) null, (Class239) null);
		if (local339 != null) {
			if (Static426.aBoolean555) {
				local339.method8807(local80, local312.aClass41_Sub9Array1[0], Static663.anInt10391, 0);
			} else {
				local339.method8801(local80, local312.aClass41_Sub9Array1[0], 0);
			}
			this.aBoolean619 |= local339.F();
			if (local339.ma() > this.anInt8578) {
				this.anInt8578 = local339.ma();
			}
		}
		return local312;
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8662(@OriginalArg(0) Class143 arg0) {
	}

	@OriginalMember(owner = "client!rha", name = "b", descriptor = "(Lclient!ha;B)Lclient!pw;")
	@Override
	public Class280 method8656(@OriginalArg(0) Class143 arg0) {
		return null;
	}
}
