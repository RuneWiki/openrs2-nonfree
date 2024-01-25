import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tv")
public final class Class4_Sub3_Sub4_Sub1 extends Class4_Sub3_Sub4 {

	@OriginalMember(owner = "client!tv", name = "L", descriptor = "I")
	public int anInt9909;

	@OriginalMember(owner = "client!tv", name = "N", descriptor = "I")
	public int anInt9914;

	@OriginalMember(owner = "client!tv", name = "U", descriptor = "I")
	public int anInt9919;

	@OriginalMember(owner = "client!tv", name = "Q", descriptor = "I")
	public int anInt9926;

	@OriginalMember(owner = "client!tv", name = "V", descriptor = "I")
	public int anInt9913 = -1;

	@OriginalMember(owner = "client!tv", name = "M", descriptor = "I")
	public int anInt9915 = 0;

	@OriginalMember(owner = "client!tv", name = "E", descriptor = "I")
	public int anInt9910 = -1;

	@OriginalMember(owner = "client!tv", name = "O", descriptor = "I")
	private int anInt9911 = 0;

	@OriginalMember(owner = "client!tv", name = "J", descriptor = "Z")
	private boolean aBoolean685 = false;

	@OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(IIIII)V")
	public Class4_Sub3_Sub4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(Lclient!ha;I)Lclient!th;")
	@Override
	public Class348 method9492(@OriginalArg(0) Class144 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!tv", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method9489() {
		return false;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method9490(@OriginalArg(0) Class144 arg0) {
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IZILclient!ha;)Z")
	@Override
	public boolean method9478(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class144 arg2) {
		@Pc(6) Class263 local6 = arg2.method6907();
		local6.method8444(super.anInt11184, super.anInt11182 - 10, super.anInt11178);
		@Pc(31) Class284 local31 = Static252.aClass56_1.method1052(this.anInt9919);
		@Pc(41) Class129 local41 = local31.method6846(131072, (Class398) null, this.anInt9909, (Class181) null, arg2);
		if (local41 != null && (Static6.aBoolean9 ? local41.method5302(arg1, arg0, local6, true, local31.anInt7747, Static481.anInt10749) : local41.method5296(arg1, arg0, local6, true, local31.anInt7747))) {
			return true;
		}
		@Pc(81) Class284 local81;
		if (this.anInt9913 != -1) {
			local81 = Static252.aClass56_1.method1052(this.anInt9913);
			local41 = local81.method6846(131072, (Class398) null, this.anInt9926, (Class181) null, arg2);
			if (local41 != null && (Static6.aBoolean9 ? local41.method5302(arg1, arg0, local6, true, local81.anInt7747, Static481.anInt10749) : local41.method5296(arg1, arg0, local6, true, local81.anInt7747))) {
				return true;
			}
		}
		if (this.anInt9910 != -1) {
			local81 = Static252.aClass56_1.method1052(this.anInt9910);
			local41 = local81.method6846(131072, (Class398) null, this.anInt9914, (Class181) null, arg2);
			if (local41 != null && (Static6.aBoolean9 ? local41.method5302(arg1, arg0, local6, true, local81.anInt7747, Static481.anInt10749) : local41.method5296(arg1, arg0, local6, true, local81.anInt7747))) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tv", name = "e", descriptor = "(I)I")
	@Override
	public int method9477() {
		@Pc(9) Class284 local9 = Static252.aClass56_1.method1052(this.anInt9919);
		@Pc(12) int local12 = local9.anInt7747;
		@Pc(23) Class284 local23;
		if (this.anInt9913 != -1) {
			local23 = Static252.aClass56_1.method1052(this.anInt9913);
			if (local23.anInt7747 > local12) {
				local12 = local23.anInt7747;
			}
		}
		if (this.anInt9910 != -1) {
			local23 = Static252.aClass56_1.method1052(this.anInt9910);
			if (local12 < local23.anInt7747) {
				local12 = local23.anInt7747;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(ILclient!ha;)Lclient!w;")
	@Override
	public Class4_Sub9 method9491(@OriginalArg(1) Class144 arg0) {
		@Pc(17) Class58 local17 = Static609.method8606(super.aByte146, super.anInt11184 >> Static110.anInt1858, super.anInt11178 >> Static110.anInt1858);
		@Pc(29) Class4_Sub3_Sub2 local29 = Static447.method6640(super.aByte146, super.anInt11184 >> Static110.anInt1858, super.anInt11178 >> Static110.anInt1858);
		@Pc(31) int local31 = 0;
		if (local17 != null && local17.aClass4_Sub3_Sub3_1.aBoolean717) {
			local31 = local17.aClass4_Sub3_Sub3_1.method9479();
		}
		if (local29 != null && local29.aShort123 > -local31) {
			local31 = -local29.aShort123;
		}
		if (local31 != this.anInt9915) {
			super.anInt11182 -= this.anInt9915;
			this.anInt9915 = local31;
			super.anInt11182 += local31;
		}
		@Pc(82) Class263 local82 = arg0.method6907();
		local82.method8432();
		if (this.anInt9915 == 0) {
			@Pc(101) Class159 local101 = Static258.aClass159Array1[super.aByte147];
			@Pc(106) int local106 = this.anInt9911 << 1;
			@Pc(113) int local113 = -local106 / 2;
			@Pc(118) int local118 = -local106 / 2;
			@Pc(132) int local132 = local101.method8209(super.anInt11184 + local113, super.anInt11178 - -local118);
			@Pc(136) int local136 = local106 / 2;
			@Pc(141) int local141 = -local106 / 2;
			@Pc(153) int local153 = local101.method8209(local136 + super.anInt11184, local141 + super.anInt11178);
			@Pc(158) int local158 = -local106 / 2;
			@Pc(162) int local162 = local106 / 2;
			@Pc(174) int local174 = local101.method8209(super.anInt11184 + local158, super.anInt11178 + local162);
			@Pc(178) int local178 = local106 / 2;
			@Pc(182) int local182 = local106 / 2;
			@Pc(194) int local194 = local101.method8209(local178 + super.anInt11184, local182 + super.anInt11178);
			@Pc(202) int local202 = local153 <= local132 ? local153 : local132;
			@Pc(214) int local214 = local194 <= local174 ? local194 : local174;
			@Pc(226) int local226 = local194 <= local153 ? local194 : local153;
			@Pc(238) int local238 = local132 >= local174 ? local174 : local132;
			if (local106 != 0) {
				@Pc(256) int local256 = (int) (Math.atan2((double) (local202 - local214), (double) local106) * 2607.5945876176133D) & 0x3FFF;
				if (local256 != 0) {
					local82.method8439(local256);
				}
			}
			@Pc(267) int local267 = local194 + local132;
			if (local106 != 0) {
				@Pc(286) int local286 = (int) (Math.atan2((double) (local238 - local226), (double) local106) * 2607.5945876176133D) & 0x3FFF;
				if (local286 != 0) {
					local82.method8441(-local286);
				}
			}
			if (local174 + local153 < local267) {
				local267 = local174 + local153;
			}
			local267 = (local267 >> 1) - super.anInt11182;
			if (local267 != 0) {
				local82.method8442(0, local267, 0);
			}
		}
		local82.method8442(super.anInt11184, super.anInt11182 - 10, super.anInt11178);
		@Pc(340) Class4_Sub9 local340 = Static272.method7693(3, true);
		this.aBoolean685 = false;
		this.anInt9911 = 0;
		@Pc(364) Class129 local364;
		if (this.anInt9910 != -1) {
			local364 = Static252.aClass56_1.method1052(this.anInt9910).method6846(2048, (Class398) null, this.anInt9914, (Class181) null, arg0);
			if (local364 != null) {
				if (Static6.aBoolean9) {
					local364.method5289(local82, local340.aClass4_Sub1Array1[2], Static481.anInt10749, 0);
				} else {
					local364.method5307(local82, local340.aClass4_Sub1Array1[2], 0);
				}
				this.aBoolean685 |= local364.F();
				this.anInt9911 = local364.ma();
			}
		}
		if (this.anInt9913 != -1) {
			local364 = Static252.aClass56_1.method1052(this.anInt9913).method6846(2048, (Class398) null, this.anInt9926, (Class181) null, arg0);
			if (local364 != null) {
				if (Static6.aBoolean9) {
					local364.method5289(local82, local340.aClass4_Sub1Array1[1], Static481.anInt10749, 0);
				} else {
					local364.method5307(local82, local340.aClass4_Sub1Array1[1], 0);
				}
				this.aBoolean685 |= local364.F();
				if (local364.ma() > this.anInt9911) {
					this.anInt9911 = local364.ma();
				}
			}
		}
		local364 = Static252.aClass56_1.method1052(this.anInt9919).method6846(2048, (Class398) null, this.anInt9909, (Class181) null, arg0);
		if (local364 != null) {
			if (Static6.aBoolean9) {
				local364.method5289(local82, local340.aClass4_Sub1Array1[0], Static481.anInt10749, 0);
			} else {
				local364.method5307(local82, local340.aClass4_Sub1Array1[0], 0);
			}
			this.aBoolean685 |= local364.F();
			if (local364.ma() > this.anInt9911) {
				this.anInt9911 = local364.ma();
			}
		}
		return local340;
	}

	@OriginalMember(owner = "client!tv", name = "d", descriptor = "(I)I")
	@Override
	public int method9485(@OriginalArg(0) int arg0) {
		if (arg0 != 14603) {
			this.method9479();
		}
		return this.anInt9911;
	}

	@OriginalMember(owner = "client!tv", name = "i", descriptor = "(I)I")
	@Override
	public int method9479() {
		return -10;
	}

	@OriginalMember(owner = "client!tv", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method9476() {
		return this.aBoolean685;
	}
}
