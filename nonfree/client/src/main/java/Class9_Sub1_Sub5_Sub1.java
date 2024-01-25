import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nga")
public final class Class9_Sub1_Sub5_Sub1 extends Class9_Sub1_Sub5 {

	@OriginalMember(owner = "client!nga", name = "db", descriptor = "I")
	public int anInt6727;

	@OriginalMember(owner = "client!nga", name = "kb", descriptor = "I")
	public int anInt6731;

	@OriginalMember(owner = "client!nga", name = "Z", descriptor = "I")
	public int anInt6738;

	@OriginalMember(owner = "client!nga", name = "U", descriptor = "I")
	public int anInt6743;

	@OriginalMember(owner = "client!nga", name = "bb", descriptor = "Z")
	private boolean aBoolean447 = false;

	@OriginalMember(owner = "client!nga", name = "hb", descriptor = "I")
	private int anInt6736 = 0;

	@OriginalMember(owner = "client!nga", name = "R", descriptor = "I")
	public int anInt6741 = 0;

	@OriginalMember(owner = "client!nga", name = "eb", descriptor = "I")
	public int anInt6742 = -1;

	@OriginalMember(owner = "client!nga", name = "V", descriptor = "I")
	public int anInt6740 = -1;

	@OriginalMember(owner = "client!nga", name = "<init>", descriptor = "(IIIII)V")
	public Class9_Sub1_Sub5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9085(@OriginalArg(1) Class22 arg0) {
	}

	@OriginalMember(owner = "client!nga", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method9084() {
		return this.aBoolean447;
	}

	@OriginalMember(owner = "client!nga", name = "c", descriptor = "(Z)I")
	@Override
	public int method9081() {
		return -10;
	}

	@OriginalMember(owner = "client!nga", name = "b", descriptor = "(ILclient!ha;)Lclient!tc;")
	@Override
	public Class354 method9080(@OriginalArg(1) Class22 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!nga", name = "g", descriptor = "(B)I")
	@Override
	public int method9095(@OriginalArg(0) byte arg0) {
		return arg0 > -5 ? 80 : this.anInt6736;
	}

	@OriginalMember(owner = "client!nga", name = "g", descriptor = "(I)I")
	@Override
	public int method9088() {
		@Pc(15) Class275 local15 = Static606.aClass62_2.method1887(this.anInt6738);
		@Pc(18) int local18 = local15.anInt7238;
		@Pc(29) Class275 local29;
		if (this.anInt6742 != -1) {
			local29 = Static606.aClass62_2.method1887(this.anInt6742);
			if (local29.anInt7238 > local18) {
				local18 = local29.anInt7238;
			}
		}
		if (this.anInt6740 != -1) {
			local29 = Static606.aClass62_2.method1887(this.anInt6740);
			if (local29.anInt7238 > local18) {
				local18 = local29.anInt7238;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(ZLclient!ha;)Lclient!nk;")
	@Override
	public Class9_Sub6 method9092(@OriginalArg(1) Class22 arg0) {
		@Pc(17) Class181 local17 = Static84.method1819(super.aByte139, super.anInt10694 >> Static626.anInt9669, super.anInt10695 >> Static626.anInt9669);
		@Pc(29) Class9_Sub1_Sub4 local29 = Static198.method3049(super.aByte139, super.anInt10694 >> Static626.anInt9669, super.anInt10695 >> Static626.anInt9669);
		@Pc(31) int local31 = 0;
		if (local17 != null && local17.aClass9_Sub1_Sub1_1.aBoolean725) {
			local31 = local17.aClass9_Sub1_Sub1_1.method9081();
		}
		if (local29 != null && local29.aShort97 > -local31) {
			local31 = -local29.aShort97;
		}
		if (local31 != this.anInt6741) {
			super.anInt10690 -= this.anInt6741;
			this.anInt6741 = local31;
			super.anInt10690 += local31;
		}
		@Pc(93) Class58 local93 = arg0.method9354();
		local93.method9508();
		if (this.anInt6741 == 0) {
			@Pc(112) Class259 local112 = Static477.aClass259Array3[super.aByte140];
			@Pc(117) int local117 = this.anInt6736 << 1;
			@Pc(124) int local124 = -local117 / 2;
			@Pc(129) int local129 = -local117 / 2;
			@Pc(141) int local141 = local112.method9294(local129 + super.anInt10695, local124 + super.anInt10694);
			@Pc(145) int local145 = local117 / 2;
			@Pc(150) int local150 = -local117 / 2;
			@Pc(162) int local162 = local112.method9294(super.anInt10695 + local150, super.anInt10694 + local145);
			@Pc(167) int local167 = -local117 / 2;
			@Pc(171) int local171 = local117 / 2;
			@Pc(183) int local183 = local112.method9294(local171 + super.anInt10695, local167 + super.anInt10694);
			@Pc(187) int local187 = local117 / 2;
			@Pc(191) int local191 = local117 / 2;
			@Pc(203) int local203 = local112.method9294(local191 + super.anInt10695, local187 + super.anInt10694);
			@Pc(211) int local211 = local141 < local162 ? local141 : local162;
			@Pc(223) int local223 = local183 >= local203 ? local203 : local183;
			@Pc(235) int local235 = local203 > local162 ? local162 : local203;
			if (local117 != 0) {
				@Pc(254) int local254 = (int) (Math.atan2((double) (local211 - local223), (double) local117) * 2607.5945876176133D) & 0x3FFF;
				if (local254 != 0) {
					local93.method9518(local254);
				}
			}
			@Pc(273) int local273 = local183 <= local141 ? local183 : local141;
			@Pc(278) int local278 = local141 + local203;
			if (local117 != 0) {
				@Pc(297) int local297 = (int) (Math.atan2((double) (local273 - local235), (double) local117) * 2607.5945876176133D) & 0x3FFF;
				if (local297 != 0) {
					local93.method9517(-local297);
				}
			}
			if (local183 + local162 < local278) {
				local278 = local162 + local183;
			}
			local278 = (local278 >> 1) - super.anInt10690;
			if (local278 != 0) {
				local93.method9509(0, local278, 0);
			}
		}
		local93.method9509(super.anInt10694, super.anInt10690 - 10, super.anInt10695);
		@Pc(351) Class9_Sub6 local351 = Static135.method9083(3, true);
		this.anInt6736 = 0;
		this.aBoolean447 = false;
		@Pc(375) Class170 local375;
		if (this.anInt6740 != -1) {
			local375 = Static606.aClass62_2.method1887(this.anInt6740).method6287(this.anInt6731, 2048, arg0, (Class34) null, (Class45) null);
			if (local375 != null) {
				if (Static444.aBoolean451) {
					local375.method8350(local93, local351.aClass9_Sub9Array1[2], Static668.anInt10260, 0);
				} else {
					local375.method8360(local93, local351.aClass9_Sub9Array1[2], 0);
				}
				this.aBoolean447 |= local375.F();
				this.anInt6736 = local375.ma();
			}
		}
		if (this.anInt6742 != -1) {
			local375 = Static606.aClass62_2.method1887(this.anInt6742).method6287(this.anInt6727, 2048, arg0, (Class34) null, (Class45) null);
			if (local375 != null) {
				if (Static444.aBoolean451) {
					local375.method8350(local93, local351.aClass9_Sub9Array1[1], Static668.anInt10260, 0);
				} else {
					local375.method8360(local93, local351.aClass9_Sub9Array1[1], 0);
				}
				this.aBoolean447 |= local375.F();
				if (local375.ma() > this.anInt6736) {
					this.anInt6736 = local375.ma();
				}
			}
		}
		local375 = Static606.aClass62_2.method1887(this.anInt6738).method6287(this.anInt6743, 2048, arg0, (Class34) null, (Class45) null);
		if (local375 != null) {
			if (Static444.aBoolean451) {
				local375.method8350(local93, local351.aClass9_Sub9Array1[0], Static668.anInt10260, 0);
			} else {
				local375.method8360(local93, local351.aClass9_Sub9Array1[0], 0);
			}
			this.aBoolean447 |= local375.F();
			if (local375.ma() > this.anInt6736) {
				this.anInt6736 = local375.ma();
			}
		}
		return local351;
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(Lclient!ha;IZI)Z")
	@Override
	public boolean method9089(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class58 local6 = arg0.method9354();
		local6.method9524(super.anInt10694, super.anInt10690 - 10, super.anInt10695);
		@Pc(22) Class275 local22 = Static606.aClass62_2.method1887(this.anInt6738);
		@Pc(32) Class170 local32 = local22.method6287(this.anInt6743, 131072, arg0, (Class34) null, (Class45) null);
		if (local32 != null && (Static444.aBoolean451 ? local32.method8351(arg1, arg2, local6, true, local22.anInt7238, Static668.anInt10260) : local32.method8349(arg1, arg2, local6, true, local22.anInt7238))) {
			return true;
		}
		@Pc(81) Class275 local81;
		if (this.anInt6742 != -1) {
			local81 = Static606.aClass62_2.method1887(this.anInt6742);
			local32 = local81.method6287(this.anInt6727, 131072, arg0, (Class34) null, (Class45) null);
			if (local32 != null && (Static444.aBoolean451 ? local32.method8351(arg1, arg2, local6, true, local81.anInt7238, Static668.anInt10260) : local32.method8349(arg1, arg2, local6, true, local81.anInt7238))) {
				return true;
			}
		}
		if (this.anInt6740 != -1) {
			local81 = Static606.aClass62_2.method1887(this.anInt6740);
			local32 = local81.method6287(this.anInt6731, 131072, arg0, (Class34) null, (Class45) null);
			if (local32 != null && (Static444.aBoolean451 ? local32.method8351(arg1, arg2, local6, true, local81.anInt7238, Static668.anInt10260) : local32.method8349(arg1, arg2, local6, true, local81.anInt7238))) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nga", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method9093() {
		return false;
	}
}
