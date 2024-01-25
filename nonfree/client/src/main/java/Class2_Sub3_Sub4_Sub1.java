import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public final class Class2_Sub3_Sub4_Sub1 extends Class2_Sub3_Sub4 {

	@OriginalMember(owner = "client!ik", name = "S", descriptor = "I")
	public int anInt5427;

	@OriginalMember(owner = "client!ik", name = "U", descriptor = "I")
	public int anInt5429;

	@OriginalMember(owner = "client!ik", name = "W", descriptor = "I")
	public int anInt5431;

	@OriginalMember(owner = "client!ik", name = "db", descriptor = "I")
	public int anInt5437;

	@OriginalMember(owner = "client!ik", name = "V", descriptor = "I")
	public int anInt5430 = -1;

	@OriginalMember(owner = "client!ik", name = "Z", descriptor = "I")
	public int anInt5434 = 0;

	@OriginalMember(owner = "client!ik", name = "fb", descriptor = "Z")
	private boolean aBoolean478 = false;

	@OriginalMember(owner = "client!ik", name = "gb", descriptor = "I")
	public int anInt5439 = -1;

	@OriginalMember(owner = "client!ik", name = "bb", descriptor = "I")
	private int anInt5436 = 0;

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(IIIII)V")
	public Class2_Sub3_Sub4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(Lclient!ha;B)Lclient!ufa;")
	@Override
	public Class332 method8572(@OriginalArg(0) Class33 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZLclient!ha;)V")
	@Override
	public void method8565(@OriginalArg(1) Class33 arg0) {
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIBLclient!ha;)Z")
	@Override
	public boolean method8573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class33 arg2) {
		@Pc(6) Class47 local6 = arg2.method6225();
		local6.method7863(super.anInt10428, super.anInt10429 - 10, super.anInt10424);
		@Pc(24) Class237 local24 = Static367.aClass281_1.method6975(this.anInt5437);
		@Pc(37) Class128 local37 = local24.method6070(this.anInt5427, null, null, 0, arg2, -1, 131072, 0);
		if (local37 != null && (Static216.aBoolean440 ? local37.method6283(arg0, arg1, local6, true, local24.anInt7317, Static467.anInt8440) : local37.method6296(arg0, arg1, local6, true, local24.anInt7317))) {
			return true;
		}
		@Pc(72) Class237 local72;
		if (this.anInt5430 != -1) {
			local72 = Static367.aClass281_1.method6975(this.anInt5430);
			local37 = local72.method6070(this.anInt5431, null, null, 0, arg2, -1, 131072, 0);
			if (local37 != null && (Static216.aBoolean440 ? local37.method6283(arg0, arg1, local6, true, local72.anInt7317, Static467.anInt8440) : local37.method6296(arg0, arg1, local6, true, local72.anInt7317))) {
				return true;
			}
		}
		if (this.anInt5439 != -1) {
			local72 = Static367.aClass281_1.method6975(this.anInt5439);
			local37 = local72.method6070(this.anInt5429, null, null, 0, arg2, -1, 131072, 0);
			if (local37 != null && (Static216.aBoolean440 ? local37.method6283(arg0, arg1, local6, true, local72.anInt7317, Static467.anInt8440) : local37.method6296(arg0, arg1, local6, true, local72.anInt7317))) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ik", name = "f", descriptor = "(I)I")
	@Override
	public int method8574() {
		return -10;
	}

	@OriginalMember(owner = "client!ik", name = "e", descriptor = "(B)I")
	@Override
	public int method8575(@OriginalArg(0) byte arg0) {
		if (arg0 != 30) {
			this.method8575((byte) -100);
		}
		return this.anInt5436;
	}

	@OriginalMember(owner = "client!ik", name = "h", descriptor = "(I)I")
	@Override
	public int method8578() {
		@Pc(9) Class237 local9 = Static367.aClass281_1.method6975(this.anInt5437);
		@Pc(12) int local12 = local9.anInt7317;
		@Pc(31) Class237 local31;
		if (this.anInt5430 != -1) {
			local31 = Static367.aClass281_1.method6975(this.anInt5430);
			if (local12 < local31.anInt7317) {
				local12 = local31.anInt7317;
			}
		}
		if (this.anInt5439 != -1) {
			local31 = Static367.aClass281_1.method6975(this.anInt5439);
			if (local12 < local31.anInt7317) {
				local12 = local31.anInt7317;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lclient!ha;I)Lclient!ie;")
	@Override
	public Class2_Sub6 method8566(@OriginalArg(0) Class33 arg0) {
		@Pc(17) Class243 local17 = Static189.method3781(super.aByte128, super.anInt10428 >> Static276.anInt5846, super.anInt10424 >> Static276.anInt5846);
		if (local17 != null && local17.aClass2_Sub3_Sub1_1.aBoolean874) {
			@Pc(30) int local30 = local17.aClass2_Sub3_Sub1_1.method8574();
			if (local30 != this.anInt5434) {
				super.anInt10429 -= this.anInt5434;
				super.anInt10429 += local30;
				this.anInt5434 = local30;
			}
		}
		@Pc(57) Class47 local57 = arg0.method6225();
		local57.method7878();
		if (local17 == null || !local17.aClass2_Sub3_Sub1_1.aBoolean874) {
			@Pc(76) Class274 local76 = Static500.aClass274Array2[super.aByte129];
			@Pc(81) int local81 = this.anInt5436 << 1;
			@Pc(88) int local88 = -local81 / 2;
			@Pc(93) int local93 = -local81 / 2;
			@Pc(106) int local106 = local76.method8043(local93 + super.anInt10424, super.anInt10428 - -local88);
			@Pc(110) int local110 = local81 / 2;
			@Pc(115) int local115 = -local81 / 2;
			@Pc(127) int local127 = local76.method8043(super.anInt10424 + local115, local110 + super.anInt10428);
			@Pc(132) int local132 = -local81 / 2;
			@Pc(136) int local136 = local81 / 2;
			@Pc(149) int local149 = local76.method8043(local136 + super.anInt10424, super.anInt10428 - -local132);
			@Pc(153) int local153 = local81 / 2;
			@Pc(157) int local157 = local81 / 2;
			@Pc(169) int local169 = local76.method8043(local157 + super.anInt10424, super.anInt10428 + local153);
			@Pc(176) int local176 = local127 > local106 ? local106 : local127;
			@Pc(183) int local183 = local169 <= local149 ? local169 : local149;
			@Pc(194) int local194 = local169 <= local127 ? local169 : local127;
			@Pc(205) int local205 = local106 < local149 ? local106 : local149;
			if (local81 != 0) {
				@Pc(223) int local223 = (int) (Math.atan2((double) (local176 - local183), (double) local81) * 2607.5945876176133D) & 0x3FFF;
				if (local223 != 0) {
					local57.method7858(local223);
				}
			}
			@Pc(232) int local232 = local106 + local169;
			if (local81 != 0) {
				@Pc(248) int local248 = (int) (Math.atan2((double) (local205 - local194), (double) local81) * 2607.5945876176133D) & 0x3FFF;
				if (local248 != 0) {
					local57.method7861(-local248);
				}
			}
			if (local127 + local149 < local232) {
				local232 = local149 + local127;
			}
			local232 = (local232 >> 1) - super.anInt10429;
			if (local232 != 0) {
				local57.method7876(0, local232, 0);
			}
		}
		local57.method7876(super.anInt10428, super.anInt10429 - 10, super.anInt10424);
		@Pc(305) Class2_Sub6 local305 = Static481.method2823(3, true);
		this.anInt5436 = 0;
		this.aBoolean478 = false;
		@Pc(335) Class128 local335;
		if (this.anInt5439 != -1) {
			local335 = Static367.aClass281_1.method6975(this.anInt5439).method6070(this.anInt5429, null, null, 0, arg0, -1, 2048, 0);
			if (local335 != null) {
				if (Static216.aBoolean440) {
					local335.method6294(local57, local305.aClass2_Sub5Array1[2], Static467.anInt8440, 0);
				} else {
					local335.method6281(local57, local305.aClass2_Sub5Array1[2], 0);
				}
				this.aBoolean478 |= local335.F();
				this.anInt5436 = local335.ma();
			}
		}
		if (this.anInt5430 != -1) {
			local335 = Static367.aClass281_1.method6975(this.anInt5430).method6070(this.anInt5431, null, null, 0, arg0, -1, 2048, 0);
			if (local335 != null) {
				if (Static216.aBoolean440) {
					local335.method6294(local57, local305.aClass2_Sub5Array1[1], Static467.anInt8440, 0);
				} else {
					local335.method6281(local57, local305.aClass2_Sub5Array1[1], 0);
				}
				this.aBoolean478 |= local335.F();
				if (local335.ma() > this.anInt5436) {
					this.anInt5436 = local335.ma();
				}
			}
		}
		local335 = Static367.aClass281_1.method6975(this.anInt5437).method6070(this.anInt5427, null, null, 0, arg0, -1, 2048, 0);
		if (local335 != null) {
			if (Static216.aBoolean440) {
				local335.method6294(local57, local305.aClass2_Sub5Array1[0], Static467.anInt8440, 0);
			} else {
				local335.method6281(local57, local305.aClass2_Sub5Array1[0], 0);
			}
			this.aBoolean478 |= local335.F();
			if (local335.ma() > this.anInt5436) {
				this.anInt5436 = local335.ma();
			}
		}
		return local305;
	}

	@OriginalMember(owner = "client!ik", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method8579() {
		return this.aBoolean478;
	}

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8570() {
		return false;
	}
}
