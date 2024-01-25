import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ika")
public final class Class15_Sub3_Sub2_Sub1 extends Class15_Sub3_Sub2 {

	@OriginalMember(owner = "client!ika", name = "R", descriptor = "I")
	public int anInt4954;

	@OriginalMember(owner = "client!ika", name = "Y", descriptor = "I")
	public int anInt4961;

	@OriginalMember(owner = "client!ika", name = "ab", descriptor = "I")
	public int anInt4963;

	@OriginalMember(owner = "client!ika", name = "eb", descriptor = "I")
	public int anInt4965;

	@OriginalMember(owner = "client!ika", name = "O", descriptor = "I")
	public int anInt4952 = -1;

	@OriginalMember(owner = "client!ika", name = "db", descriptor = "I")
	public int anInt4964 = -1;

	@OriginalMember(owner = "client!ika", name = "bb", descriptor = "Z")
	private boolean aBoolean376 = false;

	@OriginalMember(owner = "client!ika", name = "gb", descriptor = "I")
	private int anInt4967 = 0;

	@OriginalMember(owner = "client!ika", name = "fb", descriptor = "I")
	public int anInt4966 = 0;

	@OriginalMember(owner = "client!ika", name = "<init>", descriptor = "(IIIII)V")
	public Class15_Sub3_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "(Lclient!ha;I)Lclient!uh;")
	@Override
	public Class15_Sub9 method9427(@OriginalArg(0) Class101 arg0) {
		@Pc(17) Class27 local17 = Static48.method983(super.aByte142, super.anInt11022 >> Static170.anInt3602, super.anInt11024 >> Static170.anInt3602);
		@Pc(29) Class15_Sub3_Sub5 local29 = Static428.method7017(super.aByte142, super.anInt11022 >> Static170.anInt3602, super.anInt11024 >> Static170.anInt3602);
		@Pc(31) int local31 = 0;
		if (local17 != null && local17.aClass15_Sub3_Sub3_1.aBoolean432) {
			local31 = local17.aClass15_Sub3_Sub3_1.method9430();
		}
		if (local29 != null && -local31 < local29.aShort74) {
			local31 = -local29.aShort74;
		}
		if (local31 != this.anInt4966) {
			super.anInt11029 -= this.anInt4966;
			super.anInt11029 += local31;
			this.anInt4966 = local31;
		}
		@Pc(84) Class76 local84 = arg0.method8085();
		local84.method9631();
		if (this.anInt4966 == 0) {
			@Pc(100) Class18 local100 = Static245.aClass18Array14[super.aByte141];
			@Pc(105) int local105 = this.anInt4967 << 1;
			@Pc(112) int local112 = -local105 / 2;
			@Pc(117) int local117 = -local105 / 2;
			@Pc(129) int local129 = local100.method8542(super.anInt11024 + local117, super.anInt11022 + local112);
			@Pc(133) int local133 = local105 / 2;
			@Pc(138) int local138 = -local105 / 2;
			@Pc(150) int local150 = local100.method8542(super.anInt11024 + local138, super.anInt11022 + local133);
			@Pc(155) int local155 = -local105 / 2;
			@Pc(159) int local159 = local105 / 2;
			@Pc(171) int local171 = local100.method8542(super.anInt11024 + local159, local155 + super.anInt11022);
			@Pc(175) int local175 = local105 / 2;
			@Pc(179) int local179 = local105 / 2;
			@Pc(193) int local193 = local100.method8542(super.anInt11024 + local179, super.anInt11022 - -local175);
			@Pc(204) int local204 = local129 >= local150 ? local150 : local129;
			@Pc(211) int local211 = local171 < local193 ? local171 : local193;
			@Pc(218) int local218 = local150 < local193 ? local150 : local193;
			@Pc(225) int local225 = local171 <= local129 ? local171 : local129;
			if (local105 != 0) {
				@Pc(240) int local240 = (int) (Math.atan2((double) (local204 - local211), (double) local105) * 2607.5945876176133D) & 0x3FFF;
				if (local240 != 0) {
					local84.method9630(local240);
				}
			}
			if (local105 != 0) {
				@Pc(261) int local261 = (int) (Math.atan2((double) (local225 - local218), (double) local105) * 2607.5945876176133D) & 0x3FFF;
				if (local261 != 0) {
					local84.method9627(-local261);
				}
			}
			@Pc(275) int local275 = local129 + local193;
			if (local275 > local150 + local171) {
				local275 = local150 + local171;
			}
			local275 = (local275 >> 1) - super.anInt11029;
			if (local275 != 0) {
				local84.method9640(0, local275, 0);
			}
		}
		local84.method9640(super.anInt11022, super.anInt11029 - 10, super.anInt11024);
		@Pc(321) Class15_Sub9 local321 = Static401.method6614(3, true);
		this.anInt4967 = 0;
		this.aBoolean376 = false;
		@Pc(349) Class14 local349;
		if (this.anInt4964 != -1) {
			local349 = Static372.aClass343_1.method8549(this.anInt4964).method8831((Class178) null, 0, this.anInt4954, -1, 2048, (Class9) null, 0, arg0);
			if (local349 != null) {
				if (Static110.aBoolean800) {
					local349.method8623(local84, local321.aClass15_Sub6Array1[2], Static165.anInt3552, 0);
				} else {
					local349.method8641(local84, local321.aClass15_Sub6Array1[2], 0);
				}
				this.aBoolean376 |= local349.F();
				this.anInt4967 = local349.ma();
			}
		}
		if (this.anInt4952 != -1) {
			local349 = Static372.aClass343_1.method8549(this.anInt4952).method8831((Class178) null, 0, this.anInt4963, -1, 2048, (Class9) null, 0, arg0);
			if (local349 != null) {
				if (Static110.aBoolean800) {
					local349.method8623(local84, local321.aClass15_Sub6Array1[1], Static165.anInt3552, 0);
				} else {
					local349.method8641(local84, local321.aClass15_Sub6Array1[1], 0);
				}
				this.aBoolean376 |= local349.F();
				if (local349.ma() > this.anInt4967) {
					this.anInt4967 = local349.ma();
				}
			}
		}
		local349 = Static372.aClass343_1.method8549(this.anInt4961).method8831((Class178) null, 0, this.anInt4965, -1, 2048, (Class9) null, 0, arg0);
		if (local349 != null) {
			if (Static110.aBoolean800) {
				local349.method8623(local84, local321.aClass15_Sub6Array1[0], Static165.anInt3552, 0);
			} else {
				local349.method8641(local84, local321.aClass15_Sub6Array1[0], 0);
			}
			this.aBoolean376 |= local349.F();
			if (local349.ma() > this.anInt4967) {
				this.anInt4967 = local349.ma();
			}
		}
		return local321;
	}

	@OriginalMember(owner = "client!ika", name = "g", descriptor = "(I)I")
	@Override
	public int method9432() {
		@Pc(16) Class351 local16 = Static372.aClass343_1.method8549(this.anInt4961);
		@Pc(19) int local19 = local16.lb;
		@Pc(30) Class351 local30;
		if (this.anInt4952 != -1) {
			local30 = Static372.aClass343_1.method8549(this.anInt4952);
			if (local19 < local30.lb) {
				local19 = local30.lb;
			}
		}
		if (this.anInt4964 != -1) {
			local30 = Static372.aClass343_1.method8549(this.anInt4964);
			if (local30.lb > local19) {
				local19 = local30.lb;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ika", name = "f", descriptor = "(I)I")
	@Override
	public int method9430() {
		return -10;
	}

	@OriginalMember(owner = "client!ika", name = "b", descriptor = "(Z)I")
	@Override
	public int method9436(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.method9425();
		}
		return this.anInt4967;
	}

	@OriginalMember(owner = "client!ika", name = "b", descriptor = "(BLclient!ha;)Lclient!mg;")
	@Override
	public Class232 method9442(@OriginalArg(1) Class101 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ika", name = "c", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9438(@OriginalArg(1) Class101 arg0) {
	}

	@OriginalMember(owner = "client!ika", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method9425() {
		return false;
	}

	@OriginalMember(owner = "client!ika", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method9434() {
		return this.aBoolean376;
	}

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "(BIILclient!ha;)Z")
	@Override
	public boolean method9431(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class101 arg2) {
		@Pc(6) Class76 local6 = arg2.method8085();
		local6.method9639(super.anInt11022, super.anInt11029 - 10, super.anInt11024);
		@Pc(22) Class351 local22 = Static372.aClass343_1.method8549(this.anInt4961);
		@Pc(35) Class14 local35 = local22.method8831((Class178) null, 0, this.anInt4965, -1, 131072, (Class9) null, 0, arg2);
		if (local35 != null && (Static110.aBoolean800 ? local35.method8625(arg0, arg1, local6, true, local22.lb, Static165.anInt3552) : local35.method8624(arg0, arg1, local6, true, local22.lb))) {
			return true;
		}
		@Pc(71) Class351 local71;
		if (this.anInt4952 != -1) {
			local71 = Static372.aClass343_1.method8549(this.anInt4952);
			local35 = local71.method8831((Class178) null, 0, this.anInt4963, -1, 131072, (Class9) null, 0, arg2);
			if (local35 != null && (Static110.aBoolean800 ? local35.method8625(arg0, arg1, local6, true, local71.lb, Static165.anInt3552) : local35.method8624(arg0, arg1, local6, true, local71.lb))) {
				return true;
			}
		}
		if (this.anInt4964 != -1) {
			local71 = Static372.aClass343_1.method8549(this.anInt4964);
			local35 = local71.method8831((Class178) null, 0, this.anInt4954, -1, 131072, (Class9) null, 0, arg2);
			if (local35 != null && (Static110.aBoolean800 ? local35.method8625(arg0, arg1, local6, true, local71.lb, Static165.anInt3552) : local35.method8624(arg0, arg1, local6, true, local71.lb))) {
				return true;
			}
		}
		return false;
	}
}
