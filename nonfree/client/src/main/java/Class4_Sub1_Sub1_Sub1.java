import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class4_Sub1_Sub1_Sub1 extends Class4_Sub1_Sub1 {

	@OriginalMember(owner = "client!gj", name = "E", descriptor = "I")
	public int anInt3535;

	@OriginalMember(owner = "client!gj", name = "J", descriptor = "I")
	public int anInt3539;

	@OriginalMember(owner = "client!gj", name = "Q", descriptor = "I")
	public int anInt3545;

	@OriginalMember(owner = "client!gj", name = "V", descriptor = "I")
	public int anInt3550;

	@OriginalMember(owner = "client!gj", name = "N", descriptor = "I")
	public int anInt3543 = 0;

	@OriginalMember(owner = "client!gj", name = "I", descriptor = "Z")
	private boolean aBoolean226 = false;

	@OriginalMember(owner = "client!gj", name = "T", descriptor = "I")
	private int anInt3548 = 0;

	@OriginalMember(owner = "client!gj", name = "H", descriptor = "I")
	public int anInt3538 = -1;

	@OriginalMember(owner = "client!gj", name = "U", descriptor = "I")
	public int anInt3549 = -1;

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(IIIII)V")
	public Class4_Sub1_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BLclient!ha;)Lclient!qs;")
	@Override
	public Class4_Sub8 method7692(@OriginalArg(1) Class5 arg0) {
		@Pc(17) Class128 local17 = Static502.method7419(super.aByte123, super.anInt8916 >> Static308.anInt5834, super.anInt8911 >> Static308.anInt5834);
		if (local17 != null && local17.aClass4_Sub1_Sub2_1.aBoolean639) {
			@Pc(28) int local28 = local17.aClass4_Sub1_Sub2_1.method7703();
			if (this.anInt3543 != local28) {
				super.anInt8915 -= this.anInt3543;
				super.anInt8915 += local28;
				this.anInt3543 = local28;
			}
		}
		@Pc(55) Class39 local55 = arg0.method7546();
		local55.method7246();
		if (local17 == null || !local17.aClass4_Sub1_Sub2_1.aBoolean639) {
			@Pc(74) Class51 local74 = Static364.aClass51Array3[super.aByte124];
			@Pc(79) int local79 = this.anInt3548 << 1;
			@Pc(86) int local86 = -local79 / 2;
			@Pc(91) int local91 = -local79 / 2;
			@Pc(103) int local103 = local74.method7839(local86 + super.anInt8916, local91 + super.anInt8911);
			@Pc(107) int local107 = local79 / 2;
			@Pc(112) int local112 = -local79 / 2;
			@Pc(125) int local125 = local74.method7839(super.anInt8916 + local107, super.anInt8911 - -local112);
			@Pc(130) int local130 = -local79 / 2;
			@Pc(134) int local134 = local79 / 2;
			@Pc(146) int local146 = local74.method7839(local130 + super.anInt8916, local134 + super.anInt8911);
			@Pc(150) int local150 = local79 / 2;
			@Pc(154) int local154 = local79 / 2;
			@Pc(167) int local167 = local74.method7839(local150 + super.anInt8916, super.anInt8911 - -local154);
			@Pc(178) int local178 = local125 > local103 ? local103 : local125;
			@Pc(185) int local185 = local146 >= local167 ? local167 : local146;
			@Pc(192) int local192 = local167 > local125 ? local125 : local167;
			if (local79 != 0) {
				@Pc(208) int local208 = (int) (Math.atan2((double) (local178 - local185), (double) local79) * 2607.5945876176133D) & 0x3FFF;
				if (local208 != 0) {
					local55.method7255(local208);
				}
			}
			@Pc(223) int local223 = local146 <= local103 ? local146 : local103;
			@Pc(228) int local228 = local103 + local167;
			if (local79 != 0) {
				@Pc(244) int local244 = (int) (Math.atan2((double) (local223 - local192), (double) local79) * 2607.5945876176133D) & 0x3FFF;
				if (local244 != 0) {
					local55.method7252(-local244);
				}
			}
			if (local228 > local125 + local146) {
				local228 = local146 + local125;
			}
			local228 = (local228 >> 1) - super.anInt8915;
			if (local228 != 0) {
				local55.method7244(0, local228, 0);
			}
		}
		local55.method7244(super.anInt8916, super.anInt8915 - 10, super.anInt8911);
		@Pc(298) Class4_Sub8 local298 = Static271.method4457(true, 3);
		this.aBoolean226 = false;
		this.anInt3548 = 0;
		@Pc(325) Class17 local325;
		if (this.anInt3549 != -1) {
			local325 = Static320.aClass53_2.method1770(this.anInt3549).method1484(null, 2048, 0, this.anInt3550, 0, arg0, -1, null);
			if (local325 != null) {
				if (Static279.aBoolean329) {
					local325.method5413(local55, local298.aClass4_Sub5Array1[2], Static401.anInt7417, 0);
				} else {
					local325.method5411(local55, local298.aClass4_Sub5Array1[2], 0);
				}
				this.aBoolean226 |= local325.F();
				this.anInt3548 = local325.ma();
			}
		}
		if (this.anInt3538 != -1) {
			local325 = Static320.aClass53_2.method1770(this.anInt3538).method1484(null, 2048, 0, this.anInt3535, 0, arg0, -1, null);
			if (local325 != null) {
				if (Static279.aBoolean329) {
					local325.method5413(local55, local298.aClass4_Sub5Array1[1], Static401.anInt7417, 0);
				} else {
					local325.method5411(local55, local298.aClass4_Sub5Array1[1], 0);
				}
				this.aBoolean226 |= local325.F();
				if (local325.ma() > this.anInt3548) {
					this.anInt3548 = local325.ma();
				}
			}
		}
		local325 = Static320.aClass53_2.method1770(this.anInt3545).method1484(null, 2048, 0, this.anInt3539, 0, arg0, -1, null);
		if (local325 != null) {
			if (Static279.aBoolean329) {
				local325.method5413(local55, local298.aClass4_Sub5Array1[0], Static401.anInt7417, 0);
			} else {
				local325.method5411(local55, local298.aClass4_Sub5Array1[0], 0);
			}
			this.aBoolean226 |= local325.F();
			if (local325.ma() > this.anInt3548) {
				this.anInt3548 = local325.ma();
			}
		}
		return local298;
	}

	@OriginalMember(owner = "client!gj", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method7702() {
		return this.aBoolean226;
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(Z)I")
	@Override
	public int method7695() {
		@Pc(9) Class38 local9 = Static320.aClass53_2.method1770(this.anInt3545);
		@Pc(12) int local12 = local9.anInt1494;
		@Pc(23) Class38 local23;
		if (this.anInt3538 != -1) {
			local23 = Static320.aClass53_2.method1770(this.anInt3538);
			if (local12 < local23.anInt1494) {
				local12 = local23.anInt1494;
			}
		}
		if (this.anInt3549 != -1) {
			local23 = Static320.aClass53_2.method1770(this.anInt3549);
			if (local23.anInt1494 > local12) {
				local12 = local23.anInt1494;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(BLclient!ha;)V")
	@Override
	public void method7699(@OriginalArg(1) Class5 arg0) {
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIILclient!ha;)Z")
	@Override
	public boolean method7704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class5 arg2) {
		@Pc(6) Class39 local6 = arg2.method7546();
		local6.method7240(super.anInt8916, super.anInt8915 - 10, super.anInt8911);
		@Pc(22) Class38 local22 = Static320.aClass53_2.method1770(this.anInt3545);
		@Pc(42) Class17 local42 = local22.method1484(null, 131072, 0, this.anInt3539, 0, arg2, -1, null);
		if (local42 != null && (Static279.aBoolean329 ? local42.method5420(arg1, arg0, local6, true, local22.anInt1494, Static401.anInt7417) : local42.method5433(arg1, arg0, local6, true, local22.anInt1494))) {
			return true;
		}
		@Pc(80) Class38 local80;
		if (this.anInt3538 != -1) {
			local80 = Static320.aClass53_2.method1770(this.anInt3538);
			local42 = local80.method1484(null, 131072, 0, this.anInt3535, 0, arg2, -1, null);
			if (local42 != null && (Static279.aBoolean329 ? local42.method5420(arg1, arg0, local6, true, local80.anInt1494, Static401.anInt7417) : local42.method5433(arg1, arg0, local6, true, local80.anInt1494))) {
				return true;
			}
		}
		if (this.anInt3549 != -1) {
			local80 = Static320.aClass53_2.method1770(this.anInt3549);
			local42 = local80.method1484(null, 131072, 0, this.anInt3550, 0, arg2, -1, null);
			if (local42 != null && (Static279.aBoolean329 ? local42.method5420(arg1, arg0, local6, true, local80.anInt1494, Static401.anInt7417) : local42.method5433(arg1, arg0, local6, true, local80.anInt1494))) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gj", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method7693() {
		return false;
	}

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "(BLclient!ha;)Lclient!ro;")
	@Override
	public Class297 method7700(@OriginalArg(1) Class5 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!gj", name = "g", descriptor = "(I)I")
	@Override
	public int method7703() {
		return -10;
	}

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "(B)I")
	@Override
	public int method7689(@OriginalArg(0) byte arg0) {
		if (arg0 >= -4) {
			this.method7695();
		}
		return this.anInt3548;
	}
}
