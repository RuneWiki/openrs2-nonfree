import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aw")
public final class Class28_Sub1_Sub1_Sub1 extends Class28_Sub1_Sub1 {

	@OriginalMember(owner = "client!aw", name = "J", descriptor = "I")
	public int anInt480;

	@OriginalMember(owner = "client!aw", name = "V", descriptor = "I")
	public int anInt490;

	@OriginalMember(owner = "client!aw", name = "W", descriptor = "I")
	public int anInt491;

	@OriginalMember(owner = "client!aw", name = "bb", descriptor = "I")
	public int anInt496;

	@OriginalMember(owner = "client!aw", name = "S", descriptor = "I")
	public int anInt487 = -1;

	@OriginalMember(owner = "client!aw", name = "N", descriptor = "Z")
	private boolean aBoolean31 = false;

	@OriginalMember(owner = "client!aw", name = "T", descriptor = "I")
	private int anInt488 = 0;

	@OriginalMember(owner = "client!aw", name = "cb", descriptor = "I")
	public int anInt497 = -1;

	@OriginalMember(owner = "client!aw", name = "Z", descriptor = "I")
	public int anInt494 = 0;

	@OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(IIIII)V")
	public Class28_Sub1_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!aw", name = "e", descriptor = "(I)I")
	@Override
	public int method8976() {
		return -10;
	}

	@OriginalMember(owner = "client!aw", name = "e", descriptor = "(B)I")
	@Override
	public int method8964(@OriginalArg(0) byte arg0) {
		if (arg0 > -85) {
			this.method8963();
		}
		return this.anInt488;
	}

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "(ILclient!ha;)Lclient!pi;")
	@Override
	public Class28_Sub7 method8972(@OriginalArg(1) Class65 arg0) {
		@Pc(17) Class41 local17 = Static300.method8603(super.aByte145, super.anInt10781 >> Static588.anInt9672, super.anInt10784 >> Static588.anInt9672);
		@Pc(29) Class28_Sub1_Sub2 local29 = Static570.method7867(super.aByte145, super.anInt10781 >> Static588.anInt9672, super.anInt10784 >> Static588.anInt9672);
		@Pc(31) int local31 = 0;
		if (local17 != null && local17.aClass28_Sub1_Sub4_1.aBoolean914) {
			local31 = local17.aClass28_Sub1_Sub4_1.method8976();
		}
		if (local29 != null && local29.aShort106 > -local31) {
			local31 = -local29.aShort106;
		}
		if (local31 != this.anInt494) {
			super.anInt10779 -= this.anInt494;
			super.anInt10779 += local31;
			this.anInt494 = local31;
		}
		@Pc(85) Class254 local85 = arg0.method6903();
		local85.method7357();
		if (this.anInt494 == 0) {
			@Pc(104) Class109 local104 = Static495.aClass109Array4[super.aByte144];
			@Pc(109) int local109 = this.anInt488 << 1;
			@Pc(116) int local116 = -local109 / 2;
			@Pc(121) int local121 = -local109 / 2;
			@Pc(134) int local134 = local104.method7702(super.anInt10781 + local116, local121 + super.anInt10784);
			@Pc(138) int local138 = local109 / 2;
			@Pc(143) int local143 = -local109 / 2;
			@Pc(155) int local155 = local104.method7702(local138 + super.anInt10781, super.anInt10784 + local143);
			@Pc(160) int local160 = -local109 / 2;
			@Pc(164) int local164 = local109 / 2;
			@Pc(177) int local177 = local104.method7702(local160 + super.anInt10781, super.anInt10784 - -local164);
			@Pc(181) int local181 = local109 / 2;
			@Pc(185) int local185 = local109 / 2;
			@Pc(199) int local199 = local104.method7702(super.anInt10781 + local181, super.anInt10784 - -local185);
			@Pc(210) int local210 = local134 >= local155 ? local155 : local134;
			@Pc(217) int local217 = local177 < local199 ? local177 : local199;
			@Pc(224) int local224 = local155 >= local199 ? local199 : local155;
			if (local109 != 0) {
				@Pc(239) int local239 = (int) (Math.atan2((double) (local210 - local217), (double) local109) * 2607.5945876176133D) & 0x3FFF;
				if (local239 != 0) {
					local85.method7352(local239);
				}
			}
			@Pc(254) int local254 = local134 < local177 ? local134 : local177;
			if (local109 != 0) {
				@Pc(270) int local270 = (int) (Math.atan2((double) (local254 - local224), (double) local109) * 2607.5945876176133D) & 0x3FFF;
				if (local270 != 0) {
					local85.method7347(-local270);
				}
			}
			@Pc(283) int local283 = local199 + local134;
			if (local283 > local155 + local177) {
				local283 = local155 + local177;
			}
			local283 = (local283 >> 1) - super.anInt10779;
			if (local283 != 0) {
				local85.method7358(0, local283, 0);
			}
		}
		local85.method7358(super.anInt10781, super.anInt10779 - 10, super.anInt10784);
		@Pc(324) Class28_Sub7 local324 = Static375.method5607(true, 3);
		this.aBoolean31 = false;
		this.anInt488 = 0;
		@Pc(355) Class153 local355;
		if (this.anInt497 != -1) {
			local355 = Static110.aClass105_1.method2659(this.anInt497).method5700(arg0, -1, this.anInt480, 0, 0, 2048, (Class213) null, (Class175) null);
			if (local355 != null) {
				if (Static632.aBoolean877) {
					local355.method8594(local85, local324.aClass28_Sub9Array1[2], Static483.anInt8094, 0);
				} else {
					local355.method8585(local85, local324.aClass28_Sub9Array1[2], 0);
				}
				this.aBoolean31 |= local355.F();
				this.anInt488 = local355.ma();
			}
		}
		if (this.anInt487 != -1) {
			local355 = Static110.aClass105_1.method2659(this.anInt487).method5700(arg0, -1, this.anInt490, 0, 0, 2048, (Class213) null, (Class175) null);
			if (local355 != null) {
				if (Static632.aBoolean877) {
					local355.method8594(local85, local324.aClass28_Sub9Array1[1], Static483.anInt8094, 0);
				} else {
					local355.method8585(local85, local324.aClass28_Sub9Array1[1], 0);
				}
				this.aBoolean31 |= local355.F();
				if (local355.ma() > this.anInt488) {
					this.anInt488 = local355.ma();
				}
			}
		}
		local355 = Static110.aClass105_1.method2659(this.anInt491).method5700(arg0, -1, this.anInt496, 0, 0, 2048, (Class213) null, (Class175) null);
		if (local355 != null) {
			if (Static632.aBoolean877) {
				local355.method8594(local85, local324.aClass28_Sub9Array1[0], Static483.anInt8094, 0);
			} else {
				local355.method8585(local85, local324.aClass28_Sub9Array1[0], 0);
			}
			this.aBoolean31 |= local355.F();
			if (local355.ma() > this.anInt488) {
				this.anInt488 = local355.ma();
			}
		}
		return local324;
	}

	@OriginalMember(owner = "client!aw", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method8965() {
		return this.aBoolean31;
	}

	@OriginalMember(owner = "client!aw", name = "c", descriptor = "(ILclient!ha;)Lclient!id;")
	@Override
	public Class160 method8978(@OriginalArg(1) Class65 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8962(@OriginalArg(0) Class65 arg0) {
	}

	@OriginalMember(owner = "client!aw", name = "f", descriptor = "(B)I")
	@Override
	public int method8966() {
		@Pc(9) Class238 local9 = Static110.aClass105_1.method2659(this.anInt491);
		@Pc(12) int local12 = local9.anInt6887;
		@Pc(22) Class238 local22;
		if (this.anInt487 != -1) {
			local22 = Static110.aClass105_1.method2659(this.anInt487);
			if (local12 < local22.anInt6887) {
				local12 = local22.anInt6887;
			}
		}
		if (this.anInt497 != -1) {
			local22 = Static110.aClass105_1.method2659(this.anInt497);
			if (local12 < local22.anInt6887) {
				local12 = local22.anInt6887;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!aw", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8963() {
		return false;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(IILclient!ha;I)Z")
	@Override
	public boolean method8959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class65 arg2) {
		@Pc(6) Class254 local6 = arg2.method6903();
		local6.method7361(super.anInt10781, super.anInt10779 - 10, super.anInt10784);
		@Pc(22) Class238 local22 = Static110.aClass105_1.method2659(this.anInt491);
		@Pc(35) Class153 local35 = local22.method5700(arg2, -1, this.anInt496, 0, 0, 131072, (Class213) null, (Class175) null);
		if (local35 != null && (Static632.aBoolean877 ? local35.method8590(arg0, arg1, local6, true, local22.anInt6887, Static483.anInt8094) : local35.method8593(arg0, arg1, local6, true, local22.anInt6887))) {
			return true;
		}
		@Pc(79) Class238 local79;
		if (this.anInt487 != -1) {
			local79 = Static110.aClass105_1.method2659(this.anInt487);
			local35 = local79.method5700(arg2, -1, this.anInt490, 0, 0, 131072, (Class213) null, (Class175) null);
			if (local35 != null && (Static632.aBoolean877 ? local35.method8590(arg0, arg1, local6, true, local79.anInt6887, Static483.anInt8094) : local35.method8593(arg0, arg1, local6, true, local79.anInt6887))) {
				return true;
			}
		}
		if (this.anInt497 != -1) {
			local79 = Static110.aClass105_1.method2659(this.anInt497);
			local35 = local79.method5700(arg2, -1, this.anInt480, 0, 0, 131072, (Class213) null, (Class175) null);
			if (local35 != null && (Static632.aBoolean877 ? local35.method8590(arg0, arg1, local6, true, local79.anInt6887, Static483.anInt8094) : local35.method8593(arg0, arg1, local6, true, local79.anInt6887))) {
				return true;
			}
		}
		return false;
	}
}
