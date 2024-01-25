import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lv")
public final class Class41_Sub2_Sub4_Sub1 extends Class41_Sub2_Sub4 {

	@OriginalMember(owner = "client!lv", name = "P", descriptor = "I")
	public int anInt5398;

	@OriginalMember(owner = "client!lv", name = "S", descriptor = "I")
	public int anInt5401;

	@OriginalMember(owner = "client!lv", name = "T", descriptor = "I")
	public int anInt5402;

	@OriginalMember(owner = "client!lv", name = "V", descriptor = "I")
	public int anInt5404;

	@OriginalMember(owner = "client!lv", name = "F", descriptor = "Z")
	private boolean aBoolean398 = false;

	@OriginalMember(owner = "client!lv", name = "I", descriptor = "I")
	private int anInt5392 = 0;

	@OriginalMember(owner = "client!lv", name = "H", descriptor = "I")
	public int anInt5391 = 0;

	@OriginalMember(owner = "client!lv", name = "K", descriptor = "I")
	public int anInt5394 = -1;

	@OriginalMember(owner = "client!lv", name = "U", descriptor = "I")
	public int anInt5403 = -1;

	@OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(IIIII)V")
	public Class41_Sub2_Sub4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!lv", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method7851() {
		return this.aBoolean398;
	}

	@OriginalMember(owner = "client!lv", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method7847() {
		return false;
	}

	@OriginalMember(owner = "client!lv", name = "g", descriptor = "(I)I")
	@Override
	public int method7844() {
		return -10;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lclient!r;III)Z")
	@Override
	public boolean method7838(@OriginalArg(0) Class45 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class11 local6 = arg0.method7397();
		local6.NA(super.anInt9444, super.anInt9443 - 10, super.anInt9442);
		@Pc(33) Class60 local33 = Static6.aClass92_1.method2673(this.anInt5398).method4530(131072, 0, null, null, 0, -1, this.anInt5402, arg0);
		if (local33 != null && (Static453.aBoolean599 ? local33.method7237(arg1, arg2, local6, true, Static340.anInt5962) : local33.method7246(arg1, arg2, local6, true))) {
			return true;
		}
		if (this.anInt5403 != -1) {
			local33 = Static6.aClass92_1.method2673(this.anInt5403).method4530(131072, 0, null, null, 0, -1, this.anInt5404, arg0);
			if (local33 != null && (Static453.aBoolean599 ? local33.method7237(arg1, arg2, local6, true, Static340.anInt5962) : local33.method7246(arg1, arg2, local6, true))) {
				return true;
			}
		}
		if (this.anInt5394 != -1) {
			local33 = Static6.aClass92_1.method2673(this.anInt5394).method4530(131072, 0, null, null, 0, -1, this.anInt5401, arg0);
			if (local33 != null && (Static453.aBoolean599 ? local33.method7237(arg1, arg2, local6, true, Static340.anInt5962) : local33.method7246(arg1, arg2, local6, true))) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!lv", name = "c", descriptor = "(Lclient!r;I)Lclient!wj;")
	@Override
	public Class41_Sub10 method7843(@OriginalArg(0) Class45 arg0) {
		@Pc(17) Class38 local17 = Static483.method6593(super.aByte117, super.anInt9444 >> Static315.anInt5369, super.anInt9442 >> Static315.anInt5369);
		if (local17 != null && local17.aClass41_Sub2_Sub1_1.aBoolean737) {
			@Pc(28) int local28 = local17.aClass41_Sub2_Sub1_1.method7844();
			if (this.anInt5391 != local28) {
				super.anInt9443 -= this.anInt5391;
				super.anInt9443 += local28;
				this.anInt5391 = local28;
			}
		}
		@Pc(55) Class11 local55 = arg0.method7397();
		local55.Y();
		if (local17 == null || !local17.aClass41_Sub2_Sub1_1.aBoolean737) {
			@Pc(74) Class34 local74 = Static68.aClass34Array1[super.aByte118];
			@Pc(79) int local79 = this.anInt5392 << 1;
			@Pc(86) int local86 = -local79 / 2;
			@Pc(91) int local91 = -local79 / 2;
			@Pc(103) int local103 = local74.method6530(local86 + super.anInt9444, local91 + super.anInt9442);
			@Pc(107) int local107 = local79 / 2;
			@Pc(112) int local112 = -local79 / 2;
			@Pc(124) int local124 = local74.method6530(local107 + super.anInt9444, local112 + super.anInt9442);
			@Pc(129) int local129 = -local79 / 2;
			@Pc(133) int local133 = local79 / 2;
			@Pc(148) int local148 = local74.method6530(super.anInt9444 + local129, super.anInt9442 - -local133);
			@Pc(152) int local152 = local79 / 2;
			@Pc(156) int local156 = local79 / 2;
			@Pc(168) int local168 = local74.method6530(super.anInt9444 + local152, local156 + super.anInt9442);
			@Pc(175) int local175 = local103 < local124 ? local103 : local124;
			@Pc(182) int local182 = local168 > local148 ? local148 : local168;
			@Pc(193) int local193 = local168 <= local124 ? local168 : local124;
			@Pc(200) int local200 = local148 > local103 ? local103 : local148;
			if (local79 != 0) {
				@Pc(215) int local215 = (int) (Math.atan2((double) (local175 - local182), (double) local79) * 2607.5945876176133D) & 0x3FFF;
				if (local215 != 0) {
					local55.w(local215);
				}
			}
			@Pc(225) int local225 = local103 + local168;
			if (local79 != 0) {
				@Pc(243) int local243 = (int) (Math.atan2((double) (local200 - local193), (double) local79) * 2607.5945876176133D) & 0x3FFF;
				if (local243 != 0) {
					local55.AA(-local243);
				}
			}
			if (local225 > local124 + local148) {
				local225 = local124 + local148;
			}
			local225 = (local225 >> 1) - super.anInt9443;
			if (local225 != 0) {
				local55.U(0, local225, 0);
			}
		}
		local55.U(super.anInt9444, super.anInt9443 - 10, super.anInt9442);
		@Pc(295) Class41_Sub10 local295 = Static458.method6411(3);
		this.anInt5392 = 0;
		this.aBoolean398 = false;
		@Pc(323) Class60 local323;
		if (this.anInt5394 != -1) {
			local323 = Static6.aClass92_1.method2673(this.anInt5394).method4530(2048, 0, null, null, 0, -1, this.anInt5401, arg0);
			if (local323 != null) {
				if (Static453.aBoolean599) {
					local323.method7224(local55, local295.aClass41_Sub8Array1[2], Static340.anInt5962, 0);
				} else {
					local323.method7230(local55, local295.aClass41_Sub8Array1[2], 0);
				}
				this.aBoolean398 |= local323.LA();
				this.anInt5392 = local323.RA();
			}
		}
		if (this.anInt5403 != -1) {
			local323 = Static6.aClass92_1.method2673(this.anInt5403).method4530(2048, 0, null, null, 0, -1, this.anInt5404, arg0);
			if (local323 != null) {
				if (Static453.aBoolean599) {
					local323.method7224(local55, local295.aClass41_Sub8Array1[1], Static340.anInt5962, 0);
				} else {
					local323.method7230(local55, local295.aClass41_Sub8Array1[1], 0);
				}
				this.aBoolean398 |= local323.LA();
				if (local323.RA() > this.anInt5392) {
					this.anInt5392 = local323.RA();
				}
			}
		}
		local323 = Static6.aClass92_1.method2673(this.anInt5398).method4530(2048, 0, null, null, 0, -1, this.anInt5402, arg0);
		if (local323 != null) {
			if (Static453.aBoolean599) {
				local323.method7224(local55, local295.aClass41_Sub8Array1[0], Static340.anInt5962, 0);
			} else {
				local323.method7230(local55, local295.aClass41_Sub8Array1[0], 0);
			}
			this.aBoolean398 |= local323.LA();
			if (local323.RA() > this.anInt5392) {
				this.anInt5392 = local323.RA();
			}
		}
		return local295;
	}

	@OriginalMember(owner = "client!lv", name = "e", descriptor = "(B)I")
	@Override
	public int method7842(@OriginalArg(0) byte arg0) {
		if (arg0 <= 119) {
			this.anInt5398 = -116;
		}
		return this.anInt5392;
	}

	@OriginalMember(owner = "client!lv", name = "d", descriptor = "(Lclient!r;I)Lclient!lf;")
	@Override
	public Class189 method7845(@OriginalArg(0) Class45 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7849(@OriginalArg(0) Class45 arg0) {
	}
}
