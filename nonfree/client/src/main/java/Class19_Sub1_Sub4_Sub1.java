import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class19_Sub1_Sub4_Sub1 extends Class19_Sub1_Sub4 {

	@OriginalMember(owner = "client!mc", name = "T", descriptor = "[F")
	public static final float[] aFloatArray66 = new float[16384];

	@OriginalMember(owner = "client!mc", name = "M", descriptor = "[F")
	public static final float[] aFloatArray67 = new float[16384];

	@OriginalMember(owner = "client!mc", name = "Q", descriptor = "I")
	public int anInt6896;

	@OriginalMember(owner = "client!mc", name = "F", descriptor = "I")
	public int anInt6899;

	@OriginalMember(owner = "client!mc", name = "L", descriptor = "I")
	public int anInt6902;

	@OriginalMember(owner = "client!mc", name = "K", descriptor = "I")
	public int anInt6905;

	@OriginalMember(owner = "client!mc", name = "N", descriptor = "I")
	public int anInt6897 = -1;

	@OriginalMember(owner = "client!mc", name = "H", descriptor = "I")
	private int anInt6893 = 0;

	@OriginalMember(owner = "client!mc", name = "Y", descriptor = "I")
	public int anInt6890 = -1;

	@OriginalMember(owner = "client!mc", name = "P", descriptor = "I")
	public int anInt6904 = 0;

	@OriginalMember(owner = "client!mc", name = "O", descriptor = "Z")
	private boolean aBoolean541 = false;

	static {
		@Pc(82) double local82 = 3.834951969714103E-4D;
		for (@Pc(84) int local84 = 0; local84 < 16384; local84++) {
			aFloatArray66[local84] = (float) Math.sin((double) local84 * local82);
			aFloatArray67[local84] = (float) Math.cos(local82 * (double) local84);
		}
	}

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(IIIII)V")
	public Class19_Sub1_Sub4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method9374(@OriginalArg(0) Class67 arg0) {
	}

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "(I)I")
	@Override
	public int method9361(@OriginalArg(0) int arg0) {
		if (arg0 != 4) {
			this.method9371((Class67) null);
		}
		return this.anInt6893;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!ha;B)Lclient!dfa;")
	@Override
	public Class68 method9371(@OriginalArg(0) Class67 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BILclient!ha;I)Z")
	@Override
	public boolean method9369(@OriginalArg(1) int arg0, @OriginalArg(2) Class67 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class181 local6 = arg1.method7693();
		local6.method6356(super.anInt11204, super.anInt11208 - 10, super.anInt11211);
		@Pc(34) Class91 local34 = Static243.aClass406_2.method9394(this.anInt6905);
		@Pc(44) Class157 local44 = local34.method2365((Class100) null, arg1, 131072, this.anInt6899, (Class236) null);
		if (local44 != null && (Static568.aBoolean784 ? local44.method5221(arg2, arg0, local6, true, local34.anInt2669, Static705.anInt11029) : local44.method5218(arg2, arg0, local6, true, local34.anInt2669))) {
			return true;
		}
		@Pc(83) Class91 local83;
		if (this.anInt6890 != -1) {
			local83 = Static243.aClass406_2.method9394(this.anInt6890);
			local44 = local83.method2365((Class100) null, arg1, 131072, this.anInt6896, (Class236) null);
			if (local44 != null && (Static568.aBoolean784 ? local44.method5221(arg2, arg0, local6, true, local83.anInt2669, Static705.anInt11029) : local44.method5218(arg2, arg0, local6, true, local83.anInt2669))) {
				return true;
			}
		}
		if (this.anInt6897 != -1) {
			local83 = Static243.aClass406_2.method9394(this.anInt6897);
			local44 = local83.method2365((Class100) null, arg1, 131072, this.anInt6902, (Class236) null);
			if (local44 != null && (Static568.aBoolean784 ? local44.method5221(arg2, arg0, local6, true, local83.anInt2669, Static705.anInt11029) : local44.method5218(arg2, arg0, local6, true, local83.anInt2669))) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method9360() {
		return this.aBoolean541;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!ha;I)Lclient!mla;")
	@Override
	public Class19_Sub8 method9377(@OriginalArg(0) Class67 arg0) {
		@Pc(17) Class343 local17 = Static303.method4639(super.aByte146, super.anInt11204 >> Static394.anInt7067, super.anInt11211 >> Static394.anInt7067);
		@Pc(29) Class19_Sub1_Sub5 local29 = Static724.method9433(super.aByte146, super.anInt11204 >> Static394.anInt7067, super.anInt11211 >> Static394.anInt7067);
		@Pc(31) int local31 = 0;
		if (local17 != null && local17.aClass19_Sub1_Sub3_1.aBoolean697) {
			local31 = local17.aClass19_Sub1_Sub3_1.method9364();
		}
		if (local29 != null && -local31 < local29.aShort128) {
			local31 = -local29.aShort128;
		}
		if (this.anInt6904 != local31) {
			super.anInt11208 -= this.anInt6904;
			super.anInt11208 += local31;
			this.anInt6904 = local31;
		}
		@Pc(82) Class181 local82 = arg0.method7693();
		local82.method6349();
		if (this.anInt6904 == 0) {
			@Pc(108) Class313 local108 = Static639.aClass313Array2[super.aByte145];
			@Pc(113) int local113 = this.anInt6893 << 1;
			@Pc(120) int local120 = -local113 / 2;
			@Pc(125) int local125 = -local113 / 2;
			@Pc(138) int local138 = local108.method9096(super.anInt11204 + local120, super.anInt11211 + local125);
			@Pc(142) int local142 = local113 / 2;
			@Pc(147) int local147 = -local113 / 2;
			@Pc(159) int local159 = local108.method9096(local142 + super.anInt11204, local147 + super.anInt11211);
			@Pc(164) int local164 = -local113 / 2;
			@Pc(168) int local168 = local113 / 2;
			@Pc(181) int local181 = local108.method9096(super.anInt11204 + local164, local168 + super.anInt11211);
			@Pc(185) int local185 = local113 / 2;
			@Pc(189) int local189 = local113 / 2;
			@Pc(202) int local202 = local108.method9096(super.anInt11204 + local185, local189 + super.anInt11211);
			@Pc(210) int local210 = local138 < local159 ? local138 : local159;
			@Pc(218) int local218 = local202 <= local181 ? local202 : local181;
			@Pc(226) int local226 = local159 < local202 ? local159 : local202;
			if (local113 != 0) {
				@Pc(245) int local245 = (int) (Math.atan2((double) (local210 - local218), (double) local113) * 2607.5945876176133D) & 0x3FFF;
				if (local245 != 0) {
					local82.method6343(local245);
				}
			}
			@Pc(263) int local263 = local138 < local181 ? local138 : local181;
			if (local113 != 0) {
				@Pc(279) int local279 = (int) (Math.atan2((double) (local263 - local226), (double) local113) * 2607.5945876176133D) & 0x3FFF;
				if (local279 != 0) {
					local82.method6357(-local279);
				}
			}
			@Pc(294) int local294 = local202 + local138;
			if (local294 > local181 + local159) {
				local294 = local181 + local159;
			}
			local294 = (local294 >> 1) - super.anInt11208;
			if (local294 != 0) {
				local82.method6354(0, local294, 0);
			}
		}
		local82.method6354(super.anInt11204, super.anInt11208 - 10, super.anInt11211);
		@Pc(335) Class19_Sub8 local335 = Static58.method727(3, true);
		this.anInt6893 = 0;
		this.aBoolean541 = false;
		@Pc(360) Class157 local360;
		if (this.anInt6897 != -1) {
			local360 = Static243.aClass406_2.method9394(this.anInt6897).method2365((Class100) null, arg0, 2048, this.anInt6902, (Class236) null);
			if (local360 != null) {
				if (Static568.aBoolean784) {
					local360.method5227(local82, local335.aClass19_Sub6Array1[2], Static705.anInt11029, 0);
				} else {
					local360.method5232(local82, local335.aClass19_Sub6Array1[2], 0);
				}
				this.aBoolean541 |= local360.F();
				this.anInt6893 = local360.ma();
			}
		}
		if (this.anInt6890 != -1) {
			local360 = Static243.aClass406_2.method9394(this.anInt6890).method2365((Class100) null, arg0, 2048, this.anInt6896, (Class236) null);
			if (local360 != null) {
				if (Static568.aBoolean784) {
					local360.method5227(local82, local335.aClass19_Sub6Array1[1], Static705.anInt11029, 0);
				} else {
					local360.method5232(local82, local335.aClass19_Sub6Array1[1], 0);
				}
				this.aBoolean541 |= local360.F();
				if (local360.ma() > this.anInt6893) {
					this.anInt6893 = local360.ma();
				}
			}
		}
		local360 = Static243.aClass406_2.method9394(this.anInt6905).method2365((Class100) null, arg0, 2048, this.anInt6899, (Class236) null);
		if (local360 != null) {
			if (Static568.aBoolean784) {
				local360.method5227(local82, local335.aClass19_Sub6Array1[0], Static705.anInt11029, 0);
			} else {
				local360.method5232(local82, local335.aClass19_Sub6Array1[0], 0);
			}
			this.aBoolean541 |= local360.F();
			if (local360.ma() > this.anInt6893) {
				this.anInt6893 = local360.ma();
			}
		}
		return local335;
	}

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "(B)I")
	@Override
	public int method9364() {
		return -10;
	}

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method9366() {
		return false;
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)I")
	@Override
	public int method9362() {
		@Pc(9) Class91 local9 = Static243.aClass406_2.method9394(this.anInt6905);
		@Pc(12) int local12 = local9.anInt2669;
		@Pc(29) Class91 local29;
		if (this.anInt6890 != -1) {
			local29 = Static243.aClass406_2.method9394(this.anInt6890);
			if (local12 < local29.anInt2669) {
				local12 = local29.anInt2669;
			}
		}
		if (this.anInt6897 != -1) {
			local29 = Static243.aClass406_2.method9394(this.anInt6897);
			if (local29.anInt2669 > local12) {
				local12 = local29.anInt2669;
			}
		}
		return local12;
	}
}
