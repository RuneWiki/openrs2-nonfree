import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hm")
public final class Class11_Sub1_Sub5_Sub1 extends Class11_Sub1_Sub5 {

	@OriginalMember(owner = "client!hm", name = "Q", descriptor = "I")
	public int anInt4488;

	@OriginalMember(owner = "client!hm", name = "V", descriptor = "I")
	public int anInt4493;

	@OriginalMember(owner = "client!hm", name = "X", descriptor = "I")
	public int anInt4495;

	@OriginalMember(owner = "client!hm", name = "lb", descriptor = "I")
	public int lb;

	@OriginalMember(owner = "client!hm", name = "T", descriptor = "I")
	public int anInt4491 = 0;

	@OriginalMember(owner = "client!hm", name = "db", descriptor = "Z")
	private boolean aBoolean373 = false;

	@OriginalMember(owner = "client!hm", name = "cb", descriptor = "I")
	private int anInt4498 = 0;

	@OriginalMember(owner = "client!hm", name = "eb", descriptor = "I")
	public int anInt4499 = -1;

	@OriginalMember(owner = "client!hm", name = "N", descriptor = "I")
	public int anInt4485 = -1;

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(IIIII)V")
	public Class11_Sub1_Sub5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lclient!ha;Z)Lclient!tb;")
	@Override
	public Class316 method8308(@OriginalArg(0) Class87 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!hm", name = "h", descriptor = "(I)I")
	@Override
	public int method8315() {
		return -10;
	}

	@OriginalMember(owner = "client!hm", name = "c", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8312(@OriginalArg(1) Class87 arg0) {
	}

	@OriginalMember(owner = "client!hm", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method8306() {
		return false;
	}

	@OriginalMember(owner = "client!hm", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method8310() {
		return this.aBoolean373;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lclient!ha;IZI)Z")
	@Override
	public boolean method8301(@OriginalArg(0) Class87 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class6 local6 = arg0.method7892();
		local6.method6701(super.anInt9925, super.anInt9930 - 10, super.anInt9929);
		@Pc(27) Class245 local27 = Static570.aClass267_2.method6597(this.anInt4495);
		@Pc(40) Class25 local40 = local27.method6281(null, null, -1, 131072, 0, this.anInt4493, 0, arg0);
		if (local40 != null && (Static172.aBoolean322 ? local40.method7730(arg2, arg1, local6, true, local27.anInt7446, Static388.anInt6979) : local40.method7721(arg2, arg1, local6, true, local27.anInt7446))) {
			return true;
		}
		@Pc(76) Class245 local76;
		if (this.anInt4485 != -1) {
			local76 = Static570.aClass267_2.method6597(this.anInt4485);
			local40 = local76.method6281(null, null, -1, 131072, 0, this.anInt4488, 0, arg0);
			if (local40 != null && (Static172.aBoolean322 ? local40.method7730(arg2, arg1, local6, true, local76.anInt7446, Static388.anInt6979) : local40.method7721(arg2, arg1, local6, true, local76.anInt7446))) {
				return true;
			}
		}
		if (this.anInt4499 != -1) {
			local76 = Static570.aClass267_2.method6597(this.anInt4499);
			local40 = local76.method6281(null, null, -1, 131072, 0, this.lb, 0, arg0);
			if (local40 != null && (Static172.aBoolean322 ? local40.method7730(arg2, arg1, local6, true, local76.anInt7446, Static388.anInt6979) : local40.method7721(arg2, arg1, local6, true, local76.anInt7446))) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hm", name = "d", descriptor = "(B)I")
	@Override
	public int method8304(@OriginalArg(0) byte arg0) {
		if (arg0 != -83) {
			this.anInt4495 = 62;
		}
		return this.anInt4498;
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(BLclient!ha;)Lclient!vw;")
	@Override
	public Class11_Sub10 method8307(@OriginalArg(1) Class87 arg0) {
		@Pc(17) Class61 local17 = Static225.method3814(super.aByte124, super.anInt9925 >> Static415.anInt7579, super.anInt9929 >> Static415.anInt7579);
		if (local17 != null && local17.aClass11_Sub1_Sub1_1.aBoolean497) {
			@Pc(28) int local28 = local17.aClass11_Sub1_Sub1_1.method8315();
			if (local28 != this.anInt4491) {
				super.anInt9930 -= this.anInt4491;
				this.anInt4491 = local28;
				super.anInt9930 += local28;
			}
		}
		@Pc(55) Class6 local55 = arg0.method7892();
		local55.method6706();
		if (local17 == null || !local17.aClass11_Sub1_Sub1_1.aBoolean497) {
			@Pc(74) Class112 local74 = Static331.aClass112Array3[super.aByte125];
			@Pc(79) int local79 = this.anInt4498 << 1;
			@Pc(86) int local86 = -local79 / 2;
			@Pc(91) int local91 = -local79 / 2;
			@Pc(105) int local105 = local74.method7826(super.anInt9925 + local86, super.anInt9929 - -local91);
			@Pc(109) int local109 = local79 / 2;
			@Pc(114) int local114 = -local79 / 2;
			@Pc(128) int local128 = local74.method7826(super.anInt9925 + local109, super.anInt9929 - -local114);
			@Pc(133) int local133 = -local79 / 2;
			@Pc(137) int local137 = local79 / 2;
			@Pc(150) int local150 = local74.method7826(super.anInt9925 + local133, local137 + super.anInt9929);
			@Pc(154) int local154 = local79 / 2;
			@Pc(158) int local158 = local79 / 2;
			@Pc(171) int local171 = local74.method7826(super.anInt9925 + local154, super.anInt9929 - -local158);
			@Pc(178) int local178 = local105 >= local128 ? local128 : local105;
			@Pc(185) int local185 = local171 <= local150 ? local171 : local150;
			@Pc(196) int local196 = local128 < local171 ? local128 : local171;
			@Pc(203) int local203 = local105 >= local150 ? local150 : local105;
			if (local79 != 0) {
				@Pc(218) int local218 = (int) (Math.atan2((double) (local178 - local185), (double) local79) * 2607.5945876176133D) & 0x3FFF;
				if (local218 != 0) {
					local55.method6705(local218);
				}
			}
			if (local79 != 0) {
				@Pc(244) int local244 = (int) (Math.atan2((double) (local203 - local196), (double) local79) * 2607.5945876176133D) & 0x3FFF;
				if (local244 != 0) {
					local55.method6711(-local244);
				}
			}
			@Pc(257) int local257 = local105 + local171;
			if (local128 + local150 < local257) {
				local257 = local128 + local150;
			}
			local257 = (local257 >> 1) - super.anInt9930;
			if (local257 != 0) {
				local55.method6694(0, local257, 0);
			}
		}
		local55.method6694(super.anInt9925, super.anInt9930 - 10, super.anInt9929);
		@Pc(296) Class11_Sub10 local296 = Static600.method8238(3, true);
		this.aBoolean373 = false;
		this.anInt4498 = 0;
		@Pc(329) Class25 local329;
		if (this.anInt4499 != -1) {
			local329 = Static570.aClass267_2.method6597(this.anInt4499).method6281(null, null, -1, 2048, 0, this.lb, 0, arg0);
			if (local329 != null) {
				if (Static172.aBoolean322) {
					local329.method7725(local55, local296.aClass11_Sub7Array1[2], Static388.anInt6979, 0);
				} else {
					local329.method7735(local55, local296.aClass11_Sub7Array1[2], 0);
				}
				this.aBoolean373 |= local329.F();
				this.anInt4498 = local329.ma();
			}
		}
		if (this.anInt4485 != -1) {
			local329 = Static570.aClass267_2.method6597(this.anInt4485).method6281(null, null, -1, 2048, 0, this.anInt4488, 0, arg0);
			if (local329 != null) {
				if (Static172.aBoolean322) {
					local329.method7725(local55, local296.aClass11_Sub7Array1[1], Static388.anInt6979, 0);
				} else {
					local329.method7735(local55, local296.aClass11_Sub7Array1[1], 0);
				}
				this.aBoolean373 |= local329.F();
				if (local329.ma() > this.anInt4498) {
					this.anInt4498 = local329.ma();
				}
			}
		}
		local329 = Static570.aClass267_2.method6597(this.anInt4495).method6281(null, null, -1, 2048, 0, this.anInt4493, 0, arg0);
		if (local329 != null) {
			if (Static172.aBoolean322) {
				local329.method7725(local55, local296.aClass11_Sub7Array1[0], Static388.anInt6979, 0);
			} else {
				local329.method7735(local55, local296.aClass11_Sub7Array1[0], 0);
			}
			this.aBoolean373 |= local329.F();
			if (local329.ma() > this.anInt4498) {
				this.anInt4498 = local329.ma();
			}
		}
		return local296;
	}

	@OriginalMember(owner = "client!hm", name = "e", descriptor = "(B)I")
	@Override
	public int method8305() {
		@Pc(15) Class245 local15 = Static570.aClass267_2.method6597(this.anInt4495);
		@Pc(18) int local18 = local15.anInt7446;
		@Pc(29) Class245 local29;
		if (this.anInt4485 != -1) {
			local29 = Static570.aClass267_2.method6597(this.anInt4485);
			if (local18 < local29.anInt7446) {
				local18 = local29.anInt7446;
			}
		}
		if (this.anInt4499 != -1) {
			local29 = Static570.aClass267_2.method6597(this.anInt4499);
			if (local18 < local29.anInt7446) {
				local18 = local29.anInt7446;
			}
		}
		return local18;
	}
}
