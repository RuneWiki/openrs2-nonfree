import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class34_Sub1_Sub4_Sub1 extends Class34_Sub1_Sub4 {

	@OriginalMember(owner = "client!mc", name = "K", descriptor = "I")
	public int anInt6144;

	@OriginalMember(owner = "client!mc", name = "L", descriptor = "I")
	public int anInt6145;

	@OriginalMember(owner = "client!mc", name = "W", descriptor = "I")
	public int anInt6155;

	@OriginalMember(owner = "client!mc", name = "db", descriptor = "I")
	public int anInt6161;

	@OriginalMember(owner = "client!mc", name = "Y", descriptor = "I")
	public int anInt6157 = -1;

	@OriginalMember(owner = "client!mc", name = "Q", descriptor = "I")
	public int anInt6150 = -1;

	@OriginalMember(owner = "client!mc", name = "V", descriptor = "I")
	private int anInt6154 = 0;

	@OriginalMember(owner = "client!mc", name = "X", descriptor = "I")
	public int anInt6156 = 0;

	@OriginalMember(owner = "client!mc", name = "S", descriptor = "Z")
	private boolean aBoolean425 = false;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(IIIII)V")
	public Class34_Sub1_Sub4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method7845() {
		return false;
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(Lclient!ha;B)Lclient!pia;")
	@Override
	public Class34_Sub8 method7835(@OriginalArg(0) Class95 arg0) {
		@Pc(17) Class205 local17 = Static436.method5968(super.aByte132, super.anInt9614 >> Static571.anInt9216, super.anInt9619 >> Static571.anInt9216);
		@Pc(29) Class34_Sub1_Sub2 local29 = Static609.method8264(super.aByte132, super.anInt9614 >> Static571.anInt9216, super.anInt9619 >> Static571.anInt9216);
		@Pc(31) int local31 = 0;
		if (local17 != null && local17.aClass34_Sub1_Sub1_1.aBoolean672) {
			local31 = local17.aClass34_Sub1_Sub1_1.method7847();
		}
		if (local29 != null && local29.aShort49 > -local31) {
			local31 = -local29.aShort49;
		}
		if (local31 != this.anInt6156) {
			super.anInt9622 -= this.anInt6156;
			this.anInt6156 = local31;
			super.anInt9622 += local31;
		}
		@Pc(80) Class17 local80 = arg0.method8013();
		local80.method6239();
		if (this.anInt6156 == 0) {
			@Pc(96) Class35 local96 = Static582.aClass35Array3[super.aByte131];
			@Pc(101) int local101 = this.anInt6154 << 1;
			@Pc(108) int local108 = -local101 / 2;
			@Pc(113) int local113 = -local101 / 2;
			@Pc(125) int local125 = local96.method7452(local108 + super.anInt9614, super.anInt9619 + local113);
			@Pc(129) int local129 = local101 / 2;
			@Pc(134) int local134 = -local101 / 2;
			@Pc(148) int local148 = local96.method7452(local129 + super.anInt9614, local134 + super.anInt9619);
			@Pc(153) int local153 = -local101 / 2;
			@Pc(157) int local157 = local101 / 2;
			@Pc(170) int local170 = local96.method7452(super.anInt9614 + local153, super.anInt9619 - -local157);
			@Pc(174) int local174 = local101 / 2;
			@Pc(178) int local178 = local101 / 2;
			@Pc(190) int local190 = local96.method7452(local174 + super.anInt9614, local178 + super.anInt9619);
			@Pc(201) int local201 = local125 < local148 ? local125 : local148;
			@Pc(212) int local212 = local190 > local170 ? local170 : local190;
			@Pc(223) int local223 = local190 <= local148 ? local190 : local148;
			if (local101 != 0) {
				@Pc(241) int local241 = (int) (Math.atan2((double) (local201 - local212), (double) local101) * 2607.5945876176133D) & 0x3FFF;
				if (local241 != 0) {
					local80.method6228(local241);
				}
			}
			@Pc(253) int local253 = local170 <= local125 ? local170 : local125;
			if (local101 != 0) {
				@Pc(268) int local268 = (int) (Math.atan2((double) (local253 - local223), (double) local101) * 2607.5945876176133D) & 0x3FFF;
				if (local268 != 0) {
					local80.method6241(-local268);
				}
			}
			@Pc(281) int local281 = local190 + local125;
			if (local148 + local170 < local281) {
				local281 = local148 + local170;
			}
			local281 = (local281 >> 1) - super.anInt9622;
			if (local281 != 0) {
				local80.method6235(0, local281, 0);
			}
		}
		local80.method6235(super.anInt9614, super.anInt9622 - 10, super.anInt9619);
		@Pc(326) Class34_Sub8 local326 = Static327.method4658(3, true);
		this.aBoolean425 = false;
		this.anInt6154 = 0;
		@Pc(354) Class149 local354;
		if (this.anInt6157 != -1) {
			local354 = Static117.aClass197_2.method4518(this.anInt6157).method458(arg0, (Class376) null, (Class239) null, -1, 0, this.anInt6161, 2048, 0);
			if (local354 != null) {
				if (Static375.aBoolean532) {
					local354.method8869(local80, local326.aClass34_Sub6Array1[2], Static501.anInt7929, 0);
				} else {
					local354.method8857(local80, local326.aClass34_Sub6Array1[2], 0);
				}
				this.aBoolean425 |= local354.F();
				this.anInt6154 = local354.ma();
			}
		}
		if (this.anInt6150 != -1) {
			local354 = Static117.aClass197_2.method4518(this.anInt6150).method458(arg0, (Class376) null, (Class239) null, -1, 0, this.anInt6155, 2048, 0);
			if (local354 != null) {
				if (Static375.aBoolean532) {
					local354.method8869(local80, local326.aClass34_Sub6Array1[1], Static501.anInt7929, 0);
				} else {
					local354.method8857(local80, local326.aClass34_Sub6Array1[1], 0);
				}
				this.aBoolean425 |= local354.F();
				if (local354.ma() > this.anInt6154) {
					this.anInt6154 = local354.ma();
				}
			}
		}
		local354 = Static117.aClass197_2.method4518(this.anInt6145).method458(arg0, (Class376) null, (Class239) null, -1, 0, this.anInt6144, 2048, 0);
		if (local354 != null) {
			if (Static375.aBoolean532) {
				local354.method8869(local80, local326.aClass34_Sub6Array1[0], Static501.anInt7929, 0);
			} else {
				local354.method8857(local80, local326.aClass34_Sub6Array1[0], 0);
			}
			this.aBoolean425 |= local354.F();
			if (local354.ma() > this.anInt6154) {
				this.anInt6154 = local354.ma();
			}
		}
		return local326;
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "(Lclient!ha;B)Lclient!ln;")
	@Override
	public Class214 method7846(@OriginalArg(0) Class95 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method7853() {
		return this.aBoolean425;
	}

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method7849(@OriginalArg(0) Class95 arg0) {
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(Z)I")
	@Override
	public int method7840(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method7840(false);
		}
		return this.anInt6154;
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(B)I")
	@Override
	public int method7844() {
		@Pc(9) Class15 local9 = Static117.aClass197_2.method4518(this.anInt6145);
		@Pc(18) int local18 = local9.anInt452;
		@Pc(28) Class15 local28;
		if (this.anInt6150 != -1) {
			local28 = Static117.aClass197_2.method4518(this.anInt6150);
			if (local28.anInt452 > local18) {
				local18 = local28.anInt452;
			}
		}
		if (this.anInt6157 != -1) {
			local28 = Static117.aClass197_2.method4518(this.anInt6157);
			if (local18 < local28.anInt452) {
				local18 = local28.anInt452;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "(B)I")
	@Override
	public int method7847() {
		return -10;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILclient!ha;II)Z")
	@Override
	public boolean method7850(@OriginalArg(0) int arg0, @OriginalArg(1) Class95 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class17 local6 = arg1.method8013();
		local6.method6231(super.anInt9614, super.anInt9622 - 10, super.anInt9619);
		@Pc(22) Class15 local22 = Static117.aClass197_2.method4518(this.anInt6145);
		@Pc(40) Class149 local40 = local22.method458(arg1, (Class376) null, (Class239) null, -1, 0, this.anInt6144, 131072, 0);
		if (local40 != null && (Static375.aBoolean532 ? local40.method8862(arg0, arg2, local6, true, local22.anInt452, Static501.anInt7929) : local40.method8866(arg0, arg2, local6, true, local22.anInt452))) {
			return true;
		}
		@Pc(75) Class15 local75;
		if (this.anInt6150 != -1) {
			local75 = Static117.aClass197_2.method4518(this.anInt6150);
			local40 = local75.method458(arg1, (Class376) null, (Class239) null, -1, 0, this.anInt6155, 131072, 0);
			if (local40 != null && (Static375.aBoolean532 ? local40.method8862(arg0, arg2, local6, true, local75.anInt452, Static501.anInt7929) : local40.method8866(arg0, arg2, local6, true, local75.anInt452))) {
				return true;
			}
		}
		if (this.anInt6157 != -1) {
			local75 = Static117.aClass197_2.method4518(this.anInt6157);
			local40 = local75.method458(arg1, (Class376) null, (Class239) null, -1, 0, this.anInt6161, 131072, 0);
			if (local40 != null && (Static375.aBoolean532 ? local40.method8862(arg0, arg2, local6, true, local75.anInt452, Static501.anInt7929) : local40.method8866(arg0, arg2, local6, true, local75.anInt452))) {
				return true;
			}
		}
		return false;
	}
}
