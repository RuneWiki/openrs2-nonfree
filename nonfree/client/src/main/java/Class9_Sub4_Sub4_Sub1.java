import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iha")
public final class Class9_Sub4_Sub4_Sub1 extends Class9_Sub4_Sub4 {

	@OriginalMember(owner = "client!iha", name = "S", descriptor = "I")
	public int anInt5308;

	@OriginalMember(owner = "client!iha", name = "W", descriptor = "I")
	public int anInt5312;

	@OriginalMember(owner = "client!iha", name = "Z", descriptor = "I")
	public int anInt5315;

	@OriginalMember(owner = "client!iha", name = "jb", descriptor = "I")
	public int anInt5324;

	@OriginalMember(owner = "client!iha", name = "P", descriptor = "Z")
	private boolean aBoolean431 = false;

	@OriginalMember(owner = "client!iha", name = "Y", descriptor = "I")
	public int anInt5314 = 0;

	@OriginalMember(owner = "client!iha", name = "fb", descriptor = "I")
	public int anInt5320 = -1;

	@OriginalMember(owner = "client!iha", name = "gb", descriptor = "I")
	private int anInt5321 = 0;

	@OriginalMember(owner = "client!iha", name = "ab", descriptor = "I")
	public int anInt5316 = -1;

	@OriginalMember(owner = "client!iha", name = "<init>", descriptor = "(IIIII)V")
	public Class9_Sub4_Sub4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!iha", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method8413() {
		return false;
	}

	@OriginalMember(owner = "client!iha", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8422() {
		return this.aBoolean431;
	}

	@OriginalMember(owner = "client!iha", name = "b", descriptor = "(Lclient!ha;I)Lclient!bd;")
	@Override
	public Class9_Sub2 method8410(@OriginalArg(0) Class5 arg0) {
		@Pc(17) Class168 local17 = Static167.method3171(super.aByte135, super.anInt10360 >> Static606.anInt10280, super.anInt10357 >> Static606.anInt10280);
		if (local17 != null && local17.aClass9_Sub4_Sub2_1.aBoolean756) {
			@Pc(28) int local28 = local17.aClass9_Sub4_Sub2_1.method8425();
			if (this.anInt5314 != local28) {
				super.anInt10365 -= this.anInt5314;
				super.anInt10365 += local28;
				this.anInt5314 = local28;
			}
		}
		@Pc(51) Class115 local51 = arg0.method6156();
		local51.method6281();
		if (local17 == null || !local17.aClass9_Sub4_Sub2_1.aBoolean756) {
			@Pc(75) Class245 local75 = Static148.aClass245Array1[super.aByte134];
			@Pc(80) int local80 = this.anInt5321 << 1;
			@Pc(87) int local87 = -local80 / 2;
			@Pc(92) int local92 = -local80 / 2;
			@Pc(106) int local106 = local75.method7580(super.anInt10360 + local87, super.anInt10357 - -local92);
			@Pc(110) int local110 = local80 / 2;
			@Pc(115) int local115 = -local80 / 2;
			@Pc(128) int local128 = local75.method7580(super.anInt10360 + local110, super.anInt10357 - -local115);
			@Pc(133) int local133 = -local80 / 2;
			@Pc(137) int local137 = local80 / 2;
			@Pc(151) int local151 = local75.method7580(super.anInt10360 + local133, super.anInt10357 - -local137);
			@Pc(155) int local155 = local80 / 2;
			@Pc(159) int local159 = local80 / 2;
			@Pc(171) int local171 = local75.method7580(local155 + super.anInt10360, local159 + super.anInt10357);
			@Pc(178) int local178 = local128 <= local106 ? local128 : local106;
			@Pc(189) int local189 = local171 <= local151 ? local171 : local151;
			@Pc(200) int local200 = local128 < local171 ? local128 : local171;
			@Pc(211) int local211 = local106 < local151 ? local106 : local151;
			if (local80 != 0) {
				@Pc(226) int local226 = (int) (Math.atan2((double) (local178 - local189), (double) local80) * 2607.5945876176133D) & 0x3FFF;
				if (local226 != 0) {
					local51.method6295(local226);
				}
			}
			if (local80 != 0) {
				@Pc(253) int local253 = (int) (Math.atan2((double) (local211 - local200), (double) local80) * 2607.5945876176133D) & 0x3FFF;
				if (local253 != 0) {
					local51.method6280(-local253);
				}
			}
			@Pc(263) int local263 = local171 + local106;
			if (local263 > local128 + local151) {
				local263 = local151 + local128;
			}
			local263 = (local263 >> 1) - super.anInt10365;
			if (local263 != 0) {
				local51.method6296(0, local263, 0);
			}
		}
		local51.method6296(super.anInt10360, super.anInt10365 - 10, super.anInt10357);
		@Pc(308) Class9_Sub2 local308 = Static167.method3172(3, true);
		this.aBoolean431 = false;
		this.anInt5321 = 0;
		@Pc(336) Class92 local336;
		if (this.anInt5320 != -1) {
			local336 = Static356.aClass221_1.method5923(this.anInt5320).method7415(0, 2048, 0, (Class113) null, -1, arg0, this.anInt5308, (Class320) null);
			if (local336 != null) {
				if (Static423.aBoolean622) {
					local336.method7057(local51, local308.aClass9_Sub6Array1[2], Static32.anInt849, 0);
				} else {
					local336.method7053(local51, local308.aClass9_Sub6Array1[2], 0);
				}
				this.aBoolean431 |= local336.F();
				this.anInt5321 = local336.ma();
			}
		}
		if (this.anInt5316 != -1) {
			local336 = Static356.aClass221_1.method5923(this.anInt5316).method7415(0, 2048, 0, (Class113) null, -1, arg0, this.anInt5324, (Class320) null);
			if (local336 != null) {
				if (Static423.aBoolean622) {
					local336.method7057(local51, local308.aClass9_Sub6Array1[1], Static32.anInt849, 0);
				} else {
					local336.method7053(local51, local308.aClass9_Sub6Array1[1], 0);
				}
				this.aBoolean431 |= local336.F();
				if (local336.ma() > this.anInt5321) {
					this.anInt5321 = local336.ma();
				}
			}
		}
		local336 = Static356.aClass221_1.method5923(this.anInt5315).method7415(0, 2048, 0, (Class113) null, -1, arg0, this.anInt5312, (Class320) null);
		if (local336 != null) {
			if (Static423.aBoolean622) {
				local336.method7057(local51, local308.aClass9_Sub6Array1[0], Static32.anInt849, 0);
			} else {
				local336.method7053(local51, local308.aClass9_Sub6Array1[0], 0);
			}
			this.aBoolean431 |= local336.F();
			if (local336.ma() > this.anInt5321) {
				this.anInt5321 = local336.ma();
			}
		}
		return local308;
	}

	@OriginalMember(owner = "client!iha", name = "c", descriptor = "(Z)I")
	@Override
	public int method8420(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static240.aClass185_54 = null;
		}
		return this.anInt5321;
	}

	@OriginalMember(owner = "client!iha", name = "f", descriptor = "(I)I")
	@Override
	public int method8421() {
		@Pc(14) Class306 local14 = Static356.aClass221_1.method5923(this.anInt5315);
		@Pc(17) int local17 = local14.anInt9061;
		@Pc(27) Class306 local27;
		if (this.anInt5316 != -1) {
			local27 = Static356.aClass221_1.method5923(this.anInt5316);
			if (local27.anInt9061 > local17) {
				local17 = local27.anInt9061;
			}
		}
		if (this.anInt5320 != -1) {
			local27 = Static356.aClass221_1.method5923(this.anInt5320);
			if (local17 < local27.anInt9061) {
				local17 = local27.anInt9061;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(ILclient!ha;BI)Z")
	@Override
	public boolean method8411(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class115 local13 = arg1.method6156();
		local13.method6290(super.anInt10360, super.anInt10365 - 10, super.anInt10357);
		@Pc(29) Class306 local29 = Static356.aClass221_1.method5923(this.anInt5315);
		@Pc(42) Class92 local42 = local29.method7415(0, 131072, 0, (Class113) null, -1, arg1, this.anInt5312, (Class320) null);
		if (local42 != null && (Static423.aBoolean622 ? local42.method7061(arg0, arg2, local13, true, local29.anInt9061, Static32.anInt849) : local42.method7067(arg0, arg2, local13, true, local29.anInt9061))) {
			return true;
		}
		@Pc(78) Class306 local78;
		if (this.anInt5316 != -1) {
			local78 = Static356.aClass221_1.method5923(this.anInt5316);
			local42 = local78.method7415(0, 131072, 0, (Class113) null, -1, arg1, this.anInt5324, (Class320) null);
			if (local42 != null && (Static423.aBoolean622 ? local42.method7061(arg0, arg2, local13, true, local78.anInt9061, Static32.anInt849) : local42.method7067(arg0, arg2, local13, true, local78.anInt9061))) {
				return true;
			}
		}
		if (this.anInt5320 != -1) {
			local78 = Static356.aClass221_1.method5923(this.anInt5320);
			local42 = local78.method7415(0, 131072, 0, (Class113) null, -1, arg1, this.anInt5308, (Class320) null);
			if (local42 != null && (Static423.aBoolean622 ? local42.method7061(arg0, arg2, local13, true, local78.anInt9061, Static32.anInt849) : local42.method7067(arg0, arg2, local13, true, local78.anInt9061))) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!iha", name = "h", descriptor = "(I)I")
	@Override
	public int method8425() {
		return -10;
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(BLclient!ha;)Lclient!oia;")
	@Override
	public Class243 method8409(@OriginalArg(1) Class5 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!iha", name = "c", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8423(@OriginalArg(0) Class5 arg0) {
	}
}
