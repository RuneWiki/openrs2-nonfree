import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qba")
public final class Class28_Sub1_Sub5_Sub1 extends Class28_Sub1_Sub5 {

	@OriginalMember(owner = "client!qba", name = "S", descriptor = "I")
	public int anInt7916;

	@OriginalMember(owner = "client!qba", name = "W", descriptor = "I")
	public int anInt7920;

	@OriginalMember(owner = "client!qba", name = "Y", descriptor = "I")
	public int anInt7922;

	@OriginalMember(owner = "client!qba", name = "ab", descriptor = "I")
	public int anInt7924;

	@OriginalMember(owner = "client!qba", name = "U", descriptor = "I")
	public int anInt7918 = -1;

	@OriginalMember(owner = "client!qba", name = "db", descriptor = "I")
	public int anInt7927 = -1;

	@OriginalMember(owner = "client!qba", name = "X", descriptor = "I")
	private int anInt7921 = 0;

	@OriginalMember(owner = "client!qba", name = "hb", descriptor = "I")
	public int anInt7929 = 0;

	@OriginalMember(owner = "client!qba", name = "gb", descriptor = "Z")
	private boolean aBoolean604 = false;

	@OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(IIIII)V")
	public Class28_Sub1_Sub5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(ILclient!ha;)Lclient!dfa;")
	@Override
	public Class28_Sub3 method9291(@OriginalArg(1) Class13 arg0) {
		@Pc(17) Class125 local17 = Static647.method8984(super.aByte174, super.anInt10729 >> Static391.anInt10262, super.anInt10731 >> Static391.anInt10262);
		@Pc(29) Class28_Sub1_Sub3 local29 = Static280.method4469(super.aByte174, super.anInt10729 >> Static391.anInt10262, super.anInt10731 >> Static391.anInt10262);
		@Pc(31) int local31 = 0;
		if (local17 != null && local17.aClass28_Sub1_Sub1_1.aBoolean818) {
			local31 = local17.aClass28_Sub1_Sub1_1.method9296();
		}
		if (local29 != null && -local31 < local29.aShort92) {
			local31 = -local29.aShort92;
		}
		if (local31 != this.anInt7929) {
			super.anInt10722 -= this.anInt7929;
			super.anInt10722 += local31;
			this.anInt7929 = local31;
		}
		@Pc(80) Class239 local80 = arg0.method8447();
		local80.method9249();
		if (this.anInt7929 == 0) {
			@Pc(96) Class21 local96 = Static121.aClass21Array2[super.aByte173];
			@Pc(101) int local101 = this.anInt7921 << 1;
			@Pc(108) int local108 = -local101 / 2;
			@Pc(113) int local113 = -local101 / 2;
			@Pc(126) int local126 = local96.method7980(local113 + super.anInt10731, super.anInt10729 - -local108);
			@Pc(130) int local130 = local101 / 2;
			@Pc(135) int local135 = -local101 / 2;
			@Pc(148) int local148 = local96.method7980(local135 + super.anInt10731, super.anInt10729 - -local130);
			@Pc(153) int local153 = -local101 / 2;
			@Pc(157) int local157 = local101 / 2;
			@Pc(169) int local169 = local96.method7980(local157 + super.anInt10731, local153 + super.anInt10729);
			@Pc(173) int local173 = local101 / 2;
			@Pc(177) int local177 = local101 / 2;
			@Pc(189) int local189 = local96.method7980(local177 + super.anInt10731, super.anInt10729 + local173);
			@Pc(200) int local200 = local126 >= local148 ? local148 : local126;
			@Pc(211) int local211 = local189 > local169 ? local169 : local189;
			@Pc(222) int local222 = local189 > local148 ? local148 : local189;
			if (local101 != 0) {
				@Pc(238) int local238 = (int) (Math.atan2((double) (local200 - local211), (double) local101) * 2607.5945876176133D) & 0x3FFF;
				if (local238 != 0) {
					local80.method9242(local238);
				}
			}
			@Pc(254) int local254 = local169 > local126 ? local126 : local169;
			@Pc(258) int local258 = local126 + local189;
			if (local101 != 0) {
				@Pc(274) int local274 = (int) (Math.atan2((double) (local254 - local222), (double) local101) * 2607.5945876176133D) & 0x3FFF;
				if (local274 != 0) {
					local80.method9246(-local274);
				}
			}
			if (local258 > local148 + local169) {
				local258 = local148 + local169;
			}
			local258 = (local258 >> 1) - super.anInt10722;
			if (local258 != 0) {
				local80.method9244(0, local258, 0);
			}
		}
		local80.method9244(super.anInt10729, super.anInt10722 - 10, super.anInt10731);
		@Pc(322) Class28_Sub3 local322 = Static4.method120(true, 3);
		this.anInt7921 = 0;
		this.aBoolean604 = false;
		@Pc(350) Class95 local350;
		if (this.anInt7927 != -1) {
			local350 = Static170.aClass370_1.method8900(this.anInt7927).method9001(2048, -1, (Class372) null, 0, 0, arg0, (Class30) null, this.anInt7924);
			if (local350 != null) {
				if (Static443.aBoolean515) {
					local350.method5659(local80, local322.aClass28_Sub8Array1[2], Static675.anInt10880, 0);
				} else {
					local350.method5653(local80, local322.aClass28_Sub8Array1[2], 0);
				}
				this.aBoolean604 |= local350.F();
				this.anInt7921 = local350.ma();
			}
		}
		if (this.anInt7918 != -1) {
			local350 = Static170.aClass370_1.method8900(this.anInt7918).method9001(2048, -1, (Class372) null, 0, 0, arg0, (Class30) null, this.anInt7922);
			if (local350 != null) {
				if (Static443.aBoolean515) {
					local350.method5659(local80, local322.aClass28_Sub8Array1[1], Static675.anInt10880, 0);
				} else {
					local350.method5653(local80, local322.aClass28_Sub8Array1[1], 0);
				}
				this.aBoolean604 |= local350.F();
				if (local350.ma() > this.anInt7921) {
					this.anInt7921 = local350.ma();
				}
			}
		}
		local350 = Static170.aClass370_1.method8900(this.anInt7920).method9001(2048, -1, (Class372) null, 0, 0, arg0, (Class30) null, this.anInt7916);
		if (local350 != null) {
			if (Static443.aBoolean515) {
				local350.method5659(local80, local322.aClass28_Sub8Array1[0], Static675.anInt10880, 0);
			} else {
				local350.method5653(local80, local322.aClass28_Sub8Array1[0], 0);
			}
			this.aBoolean604 |= local350.F();
			if (local350.ma() > this.anInt7921) {
				this.anInt7921 = local350.ma();
			}
		}
		return local322;
	}

	@OriginalMember(owner = "client!qba", name = "l", descriptor = "(I)I")
	@Override
	public int method9289(@OriginalArg(0) int arg0) {
		if (arg0 != -13878) {
			this.anInt7916 = -32;
		}
		return this.anInt7921;
	}

	@OriginalMember(owner = "client!qba", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method9281() {
		return false;
	}

	@OriginalMember(owner = "client!qba", name = "k", descriptor = "(I)Z")
	@Override
	public boolean method9287() {
		return this.aBoolean604;
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(IIILclient!ha;)Z")
	@Override
	public boolean method9286(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class13 arg2) {
		@Pc(6) Class239 local6 = arg2.method8447();
		local6.method9234(super.anInt10729, super.anInt10722 - 10, super.anInt10731);
		@Pc(29) Class374 local29 = Static170.aClass370_1.method8900(this.anInt7920);
		@Pc(42) Class95 local42 = local29.method9001(131072, -1, (Class372) null, 0, 0, arg2, (Class30) null, this.anInt7916);
		if (local42 != null && (Static443.aBoolean515 ? local42.method5650(arg1, arg0, local6, true, local29.anInt10275, Static675.anInt10880) : local42.method5658(arg1, arg0, local6, true, local29.anInt10275))) {
			return true;
		}
		@Pc(77) Class374 local77;
		if (this.anInt7918 != -1) {
			local77 = Static170.aClass370_1.method8900(this.anInt7918);
			local42 = local77.method9001(131072, -1, (Class372) null, 0, 0, arg2, (Class30) null, this.anInt7922);
			if (local42 != null && (Static443.aBoolean515 ? local42.method5650(arg1, arg0, local6, true, local77.anInt10275, Static675.anInt10880) : local42.method5658(arg1, arg0, local6, true, local77.anInt10275))) {
				return true;
			}
		}
		if (this.anInt7927 != -1) {
			local77 = Static170.aClass370_1.method8900(this.anInt7927);
			local42 = local77.method9001(131072, -1, (Class372) null, 0, 0, arg2, (Class30) null, this.anInt7924);
			if (local42 != null && (Static443.aBoolean515 ? local42.method5650(arg1, arg0, local6, true, local77.anInt10275, Static675.anInt10880) : local42.method5658(arg1, arg0, local6, true, local77.anInt10275))) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method9288(@OriginalArg(1) Class13 arg0) {
	}

	@OriginalMember(owner = "client!qba", name = "m", descriptor = "(I)I")
	@Override
	public int method9296() {
		return -10;
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(Lclient!ha;B)Lclient!el;")
	@Override
	public Class92 method9284(@OriginalArg(0) Class13 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!qba", name = "b", descriptor = "(Z)I")
	@Override
	public int method9294() {
		@Pc(9) Class374 local9 = Static170.aClass370_1.method8900(this.anInt7920);
		@Pc(12) int local12 = local9.anInt10275;
		@Pc(23) Class374 local23;
		if (this.anInt7918 != -1) {
			local23 = Static170.aClass370_1.method8900(this.anInt7918);
			if (local23.anInt10275 > local12) {
				local12 = local23.anInt10275;
			}
		}
		if (this.anInt7927 != -1) {
			local23 = Static170.aClass370_1.method8900(this.anInt7927);
			if (local23.anInt10275 > local12) {
				local12 = local23.anInt10275;
			}
		}
		return local12;
	}
}
