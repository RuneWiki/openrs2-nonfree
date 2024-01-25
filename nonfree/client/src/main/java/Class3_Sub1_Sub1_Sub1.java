import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hka")
public final class Class3_Sub1_Sub1_Sub1 extends Class3_Sub1_Sub1 {

	@OriginalMember(owner = "client!hka", name = "W", descriptor = "I")
	public int anInt3618;

	@OriginalMember(owner = "client!hka", name = "db", descriptor = "I")
	public int anInt3624;

	@OriginalMember(owner = "client!hka", name = "kb", descriptor = "I")
	public int anInt3630;

	@OriginalMember(owner = "client!hka", name = "mb", descriptor = "I")
	public int anInt3631;

	@OriginalMember(owner = "client!hka", name = "V", descriptor = "I")
	public int anInt3617 = -1;

	@OriginalMember(owner = "client!hka", name = "Y", descriptor = "I")
	public int anInt3620 = -1;

	@OriginalMember(owner = "client!hka", name = "eb", descriptor = "I")
	private int anInt3625 = 0;

	@OriginalMember(owner = "client!hka", name = "fb", descriptor = "Z")
	private boolean aBoolean267 = false;

	@OriginalMember(owner = "client!hka", name = "T", descriptor = "I")
	public int anInt3615 = 0;

	@OriginalMember(owner = "client!hka", name = "<init>", descriptor = "(IIIII)V")
	public Class3_Sub1_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!hka", name = "b", descriptor = "(Z)I")
	@Override
	public int method8493() {
		@Pc(9) Class110 local9 = Static532.aClass255_2.method5210(this.anInt3630);
		@Pc(12) int local12 = local9.anInt2779;
		@Pc(22) Class110 local22;
		if (this.anInt3620 != -1) {
			local22 = Static532.aClass255_2.method5210(this.anInt3620);
			if (local22.anInt2779 > local12) {
				local12 = local22.anInt2779;
			}
		}
		if (this.anInt3617 != -1) {
			local22 = Static532.aClass255_2.method5210(this.anInt3617);
			if (local22.anInt2779 > local12) {
				local12 = local22.anInt2779;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!hka", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8492(@OriginalArg(0) Class33 arg0) {
	}

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(IBILclient!ha;)Z")
	@Override
	public boolean method8488(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class33 arg2) {
		@Pc(11) Class92 local11 = arg2.method8078();
		local11.method3854(super.anInt9925, super.anInt9915 - 10, super.anInt9917);
		@Pc(27) Class110 local27 = Static532.aClass255_2.method5210(this.anInt3630);
		@Pc(40) Class62 local40 = local27.method2608(arg2, 0, this.anInt3624, (Class245) null, 0, -1, (Class124) null, 131072);
		if (local40 != null && (Static499.aBoolean608 ? local40.method7341(arg0, arg1, local11, true, local27.anInt2779, Static140.anInt8126) : local40.method7347(arg0, arg1, local11, true, local27.anInt2779))) {
			return true;
		}
		@Pc(76) Class110 local76;
		if (this.anInt3620 != -1) {
			local76 = Static532.aClass255_2.method5210(this.anInt3620);
			local40 = local76.method2608(arg2, 0, this.anInt3631, (Class245) null, 0, -1, (Class124) null, 131072);
			if (local40 != null && (Static499.aBoolean608 ? local40.method7341(arg0, arg1, local11, true, local76.anInt2779, Static140.anInt8126) : local40.method7347(arg0, arg1, local11, true, local76.anInt2779))) {
				return true;
			}
		}
		if (this.anInt3617 != -1) {
			local76 = Static532.aClass255_2.method5210(this.anInt3617);
			local40 = local76.method2608(arg2, 0, this.anInt3618, (Class245) null, 0, -1, (Class124) null, 131072);
			if (local40 != null && (Static499.aBoolean608 ? local40.method7341(arg0, arg1, local11, true, local76.anInt2779, Static140.anInt8126) : local40.method7347(arg0, arg1, local11, true, local76.anInt2779))) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hka", name = "b", descriptor = "(ILclient!ha;)Lclient!rk;")
	@Override
	public Class3_Sub6 method8502(@OriginalArg(1) Class33 arg0) {
		@Pc(17) Class144 local17 = Static432.method5964(super.aByte141, super.anInt9925 >> Static273.anInt4424, super.anInt9917 >> Static273.anInt4424);
		@Pc(29) Class3_Sub1_Sub5 local29 = Static191.method2972(super.aByte141, super.anInt9925 >> Static273.anInt4424, super.anInt9917 >> Static273.anInt4424);
		@Pc(31) int local31 = 0;
		if (local17 != null && local17.aClass3_Sub1_Sub2_1.aBoolean772) {
			local31 = local17.aClass3_Sub1_Sub2_1.method8499();
		}
		if (local29 != null && -local31 < local29.aShort105) {
			local31 = -local29.aShort105;
		}
		if (this.anInt3615 != local31) {
			super.anInt9915 -= this.anInt3615;
			this.anInt3615 = local31;
			super.anInt9915 += local31;
		}
		@Pc(80) Class92 local80 = arg0.method8078();
		local80.method3853();
		if (this.anInt3615 == 0) {
			@Pc(104) Class42 local104 = Static140.aClass42Array4[super.aByte142];
			@Pc(109) int local109 = this.anInt3625 << 1;
			@Pc(116) int local116 = -local109 / 2;
			@Pc(121) int local121 = -local109 / 2;
			@Pc(133) int local133 = local104.method7453(local116 + super.anInt9925, local121 + super.anInt9917);
			@Pc(137) int local137 = local109 / 2;
			@Pc(142) int local142 = -local109 / 2;
			@Pc(154) int local154 = local104.method7453(local137 + super.anInt9925, super.anInt9917 + local142);
			@Pc(159) int local159 = -local109 / 2;
			@Pc(163) int local163 = local109 / 2;
			@Pc(176) int local176 = local104.method7453(super.anInt9925 + local159, local163 + super.anInt9917);
			@Pc(180) int local180 = local109 / 2;
			@Pc(184) int local184 = local109 / 2;
			@Pc(197) int local197 = local104.method7453(super.anInt9925 + local180, local184 + super.anInt9917);
			@Pc(208) int local208 = local154 <= local133 ? local154 : local133;
			@Pc(219) int local219 = local197 <= local176 ? local197 : local176;
			@Pc(226) int local226 = local197 > local154 ? local154 : local197;
			@Pc(233) int local233 = local133 >= local176 ? local176 : local133;
			if (local109 != 0) {
				@Pc(252) int local252 = (int) (Math.atan2((double) (local208 - local219), (double) local109) * 2607.5945876176133D) & 0x3FFF;
				if (local252 != 0) {
					local80.method3866(local252);
				}
			}
			if (local109 != 0) {
				@Pc(273) int local273 = (int) (Math.atan2((double) (local233 - local226), (double) local109) * 2607.5945876176133D) & 0x3FFF;
				if (local273 != 0) {
					local80.method3860(-local273);
				}
			}
			@Pc(284) int local284 = local133 + local197;
			if (local284 > local176 + local154) {
				local284 = local154 + local176;
			}
			local284 = (local284 >> 1) - super.anInt9915;
			if (local284 != 0) {
				local80.method3851(0, local284, 0);
			}
		}
		local80.method3851(super.anInt9925, super.anInt9915 - 10, super.anInt9917);
		@Pc(326) Class3_Sub6 local326 = Static665.method8806(3, true);
		this.anInt3625 = 0;
		this.aBoolean267 = false;
		@Pc(353) Class62 local353;
		if (this.anInt3617 != -1) {
			local353 = Static532.aClass255_2.method5210(this.anInt3617).method2608(arg0, 0, this.anInt3618, (Class245) null, 0, -1, (Class124) null, 2048);
			if (local353 != null) {
				if (Static499.aBoolean608) {
					local353.method7332(local80, local326.aClass3_Sub4Array1[2], Static140.anInt8126, 0);
				} else {
					local353.method7335(local80, local326.aClass3_Sub4Array1[2], 0);
				}
				this.aBoolean267 |= local353.F();
				this.anInt3625 = local353.ma();
			}
		}
		if (this.anInt3620 != -1) {
			local353 = Static532.aClass255_2.method5210(this.anInt3620).method2608(arg0, 0, this.anInt3631, (Class245) null, 0, -1, (Class124) null, 2048);
			if (local353 != null) {
				if (Static499.aBoolean608) {
					local353.method7332(local80, local326.aClass3_Sub4Array1[1], Static140.anInt8126, 0);
				} else {
					local353.method7335(local80, local326.aClass3_Sub4Array1[1], 0);
				}
				this.aBoolean267 |= local353.F();
				if (local353.ma() > this.anInt3625) {
					this.anInt3625 = local353.ma();
				}
			}
		}
		local353 = Static532.aClass255_2.method5210(this.anInt3630).method2608(arg0, 0, this.anInt3624, (Class245) null, 0, -1, (Class124) null, 2048);
		if (local353 != null) {
			if (Static499.aBoolean608) {
				local353.method7332(local80, local326.aClass3_Sub4Array1[0], Static140.anInt8126, 0);
			} else {
				local353.method7335(local80, local326.aClass3_Sub4Array1[0], 0);
			}
			this.aBoolean267 |= local353.F();
			if (local353.ma() > this.anInt3625) {
				this.anInt3625 = local353.ma();
			}
		}
		return local326;
	}

	@OriginalMember(owner = "client!hka", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method8500() {
		return false;
	}

	@OriginalMember(owner = "client!hka", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8501() {
		return this.aBoolean267;
	}

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(ZLclient!ha;)Lclient!oba;")
	@Override
	public Class261 method8507(@OriginalArg(1) Class33 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!hka", name = "e", descriptor = "(I)I")
	@Override
	public int method8495(@OriginalArg(0) int arg0) {
		if (arg0 != -4798) {
			this.anInt3618 = 65;
		}
		return this.anInt3625;
	}

	@OriginalMember(owner = "client!hka", name = "f", descriptor = "(I)I")
	@Override
	public int method8499() {
		return -10;
	}
}
