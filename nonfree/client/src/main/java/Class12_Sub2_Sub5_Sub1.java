import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nca")
public final class Class12_Sub2_Sub5_Sub1 extends Class12_Sub2_Sub5 {

	@OriginalMember(owner = "client!nca", name = "E", descriptor = "I")
	public int anInt7111;

	@OriginalMember(owner = "client!nca", name = "I", descriptor = "I")
	public int anInt7112;

	@OriginalMember(owner = "client!nca", name = "O", descriptor = "I")
	public int anInt7113;

	@OriginalMember(owner = "client!nca", name = "Z", descriptor = "I")
	public int anInt7123;

	@OriginalMember(owner = "client!nca", name = "C", descriptor = "I")
	private int anInt7110 = 0;

	@OriginalMember(owner = "client!nca", name = "X", descriptor = "I")
	public int anInt7121 = -1;

	@OriginalMember(owner = "client!nca", name = "Q", descriptor = "I")
	public int anInt7115 = -1;

	@OriginalMember(owner = "client!nca", name = "S", descriptor = "Z")
	private boolean aBoolean504 = false;

	@OriginalMember(owner = "client!nca", name = "eb", descriptor = "I")
	public int anInt7127 = 0;

	@OriginalMember(owner = "client!nca", name = "<init>", descriptor = "(IIIII)V")
	public Class12_Sub2_Sub5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!nca", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method9161() {
		return false;
	}

	@OriginalMember(owner = "client!nca", name = "b", descriptor = "(Lclient!ha;I)Lclient!rn;")
	@Override
	public Class305 method9156(@OriginalArg(0) Class137 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!nca", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method9150() {
		return this.aBoolean504;
	}

	@OriginalMember(owner = "client!nca", name = "c", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9164(@OriginalArg(1) Class137 arg0) {
	}

	@OriginalMember(owner = "client!nca", name = "e", descriptor = "(I)I")
	@Override
	public int method9149(@OriginalArg(0) int arg0) {
		if (arg0 != -1760267218) {
			this.anInt7112 = -46;
		}
		return this.anInt7110;
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIILclient!ha;)Z")
	@Override
	public boolean method9154(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class137 arg2) {
		@Pc(11) Class26 local11 = arg2.method7923();
		local11.method6457(super.anInt10998, super.anInt10997 - 10, super.anInt11002);
		@Pc(27) Class27 local27 = Static175.aClass247_2.method5962(this.anInt7113);
		@Pc(40) Class80 local40 = local27.method816(-1, (Class325) null, (Class275) null, arg2, 131072, 0, 0, this.anInt7123);
		if (local40 != null && (Static401.aBoolean511 ? local40.method6386(arg0, arg1, local11, true, local27.anInt951, Static331.anInt6277) : local40.method6380(arg0, arg1, local11, true, local27.anInt951))) {
			return true;
		}
		@Pc(75) Class27 local75;
		if (this.anInt7115 != -1) {
			local75 = Static175.aClass247_2.method5962(this.anInt7115);
			local40 = local75.method816(-1, (Class325) null, (Class275) null, arg2, 131072, 0, 0, this.anInt7111);
			if (local40 != null && (Static401.aBoolean511 ? local40.method6386(arg0, arg1, local11, true, local75.anInt951, Static331.anInt6277) : local40.method6380(arg0, arg1, local11, true, local75.anInt951))) {
				return true;
			}
		}
		if (this.anInt7121 != -1) {
			local75 = Static175.aClass247_2.method5962(this.anInt7121);
			local40 = local75.method816(-1, (Class325) null, (Class275) null, arg2, 131072, 0, 0, this.anInt7112);
			if (local40 != null && (Static401.aBoolean511 ? local40.method6386(arg0, arg1, local11, true, local75.anInt951, Static331.anInt6277) : local40.method6380(arg0, arg1, local11, true, local75.anInt951))) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nca", name = "f", descriptor = "(B)I")
	@Override
	public int method9153() {
		@Pc(9) Class27 local9 = Static175.aClass247_2.method5962(this.anInt7113);
		@Pc(20) int local20 = local9.anInt951;
		@Pc(31) Class27 local31;
		if (this.anInt7115 != -1) {
			local31 = Static175.aClass247_2.method5962(this.anInt7115);
			if (local20 < local31.anInt951) {
				local20 = local31.anInt951;
			}
		}
		if (this.anInt7121 != -1) {
			local31 = Static175.aClass247_2.method5962(this.anInt7121);
			if (local31.anInt951 > local20) {
				local20 = local31.anInt951;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(Lclient!ha;I)Lclient!maa;")
	@Override
	public Class12_Sub8 method9151(@OriginalArg(0) Class137 arg0) {
		@Pc(17) Class43 local17 = Static296.method5213(super.aByte146, super.anInt10998 >> Static579.anInt9935, super.anInt11002 >> Static579.anInt9935);
		@Pc(29) Class12_Sub2_Sub4 local29 = Static430.method6312(super.aByte146, super.anInt10998 >> Static579.anInt9935, super.anInt11002 >> Static579.anInt9935);
		@Pc(31) int local31 = 0;
		if (local17 != null && local17.aClass12_Sub2_Sub2_1.aBoolean738) {
			local31 = local17.aClass12_Sub2_Sub2_1.method9159();
		}
		if (local29 != null && -local31 < local29.aShort87) {
			local31 = -local29.aShort87;
		}
		if (local31 != this.anInt7127) {
			super.anInt10997 -= this.anInt7127;
			this.anInt7127 = local31;
			super.anInt10997 += local31;
		}
		@Pc(85) Class26 local85 = arg0.method7923();
		local85.method6459();
		if (this.anInt7127 == 0) {
			@Pc(104) Class51 local104 = Static576.aClass51Array3[super.aByte145];
			@Pc(109) int local109 = this.anInt7110 << 1;
			@Pc(116) int local116 = -local109 / 2;
			@Pc(121) int local121 = -local109 / 2;
			@Pc(133) int local133 = local104.method7866(super.anInt10998 + local116, super.anInt11002 + local121);
			@Pc(137) int local137 = local109 / 2;
			@Pc(142) int local142 = -local109 / 2;
			@Pc(154) int local154 = local104.method7866(local137 + super.anInt10998, local142 + super.anInt11002);
			@Pc(159) int local159 = -local109 / 2;
			@Pc(163) int local163 = local109 / 2;
			@Pc(175) int local175 = local104.method7866(super.anInt10998 + local159, local163 + super.anInt11002);
			@Pc(179) int local179 = local109 / 2;
			@Pc(183) int local183 = local109 / 2;
			@Pc(195) int local195 = local104.method7866(local179 + super.anInt10998, local183 + super.anInt11002);
			@Pc(202) int local202 = local133 < local154 ? local133 : local154;
			@Pc(209) int local209 = local195 > local175 ? local175 : local195;
			@Pc(216) int local216 = local195 <= local154 ? local195 : local154;
			@Pc(223) int local223 = local133 >= local175 ? local175 : local133;
			if (local109 != 0) {
				@Pc(242) int local242 = (int) (Math.atan2((double) (local202 - local209), (double) local109) * 2607.5945876176133D) & 0x3FFF;
				if (local242 != 0) {
					local85.method6458(local242);
				}
			}
			if (local109 != 0) {
				@Pc(266) int local266 = (int) (Math.atan2((double) (local223 - local216), (double) local109) * 2607.5945876176133D) & 0x3FFF;
				if (local266 != 0) {
					local85.method6446(-local266);
				}
			}
			@Pc(276) int local276 = local133 + local195;
			if (local276 > local154 + local175) {
				local276 = local154 + local175;
			}
			local276 = (local276 >> 1) - super.anInt10997;
			if (local276 != 0) {
				local85.method6443(0, local276, 0);
			}
		}
		local85.method6443(super.anInt10998, super.anInt10997 - 10, super.anInt11002);
		@Pc(319) Class12_Sub8 local319 = Static291.method4323(true, 3);
		this.anInt7110 = 0;
		this.aBoolean504 = false;
		@Pc(351) Class80 local351;
		if (this.anInt7121 != -1) {
			local351 = Static175.aClass247_2.method5962(this.anInt7121).method816(-1, (Class325) null, (Class275) null, arg0, 2048, 0, 0, this.anInt7112);
			if (local351 != null) {
				if (Static401.aBoolean511) {
					local351.method6375(local85, local319.aClass12_Sub1Array1[2], Static331.anInt6277, 0);
				} else {
					local351.method6391(local85, local319.aClass12_Sub1Array1[2], 0);
				}
				this.aBoolean504 |= local351.F();
				this.anInt7110 = local351.ma();
			}
		}
		if (this.anInt7115 != -1) {
			local351 = Static175.aClass247_2.method5962(this.anInt7115).method816(-1, (Class325) null, (Class275) null, arg0, 2048, 0, 0, this.anInt7111);
			if (local351 != null) {
				if (Static401.aBoolean511) {
					local351.method6375(local85, local319.aClass12_Sub1Array1[1], Static331.anInt6277, 0);
				} else {
					local351.method6391(local85, local319.aClass12_Sub1Array1[1], 0);
				}
				this.aBoolean504 |= local351.F();
				if (local351.ma() > this.anInt7110) {
					this.anInt7110 = local351.ma();
				}
			}
		}
		local351 = Static175.aClass247_2.method5962(this.anInt7113).method816(-1, (Class325) null, (Class275) null, arg0, 2048, 0, 0, this.anInt7123);
		if (local351 != null) {
			if (Static401.aBoolean511) {
				local351.method6375(local85, local319.aClass12_Sub1Array1[0], Static331.anInt6277, 0);
			} else {
				local351.method6391(local85, local319.aClass12_Sub1Array1[0], 0);
			}
			this.aBoolean504 |= local351.F();
			if (local351.ma() > this.anInt7110) {
				this.anInt7110 = local351.ma();
			}
		}
		return local319;
	}

	@OriginalMember(owner = "client!nca", name = "b", descriptor = "(Z)I")
	@Override
	public int method9159() {
		return -10;
	}
}
