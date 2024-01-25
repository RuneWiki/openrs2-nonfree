import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!os")
public final class Class15_Sub1_Sub1_Sub1 extends Class15_Sub1_Sub1 {

	@OriginalMember(owner = "client!os", name = "U", descriptor = "I")
	public int anInt7774;

	@OriginalMember(owner = "client!os", name = "Y", descriptor = "I")
	public int anInt7777;

	@OriginalMember(owner = "client!os", name = "cb", descriptor = "I")
	public int anInt7780;

	@OriginalMember(owner = "client!os", name = "gb", descriptor = "I")
	public int anInt7784;

	@OriginalMember(owner = "client!os", name = "K", descriptor = "I")
	public int anInt7765 = -1;

	@OriginalMember(owner = "client!os", name = "Q", descriptor = "I")
	public int anInt7771 = 0;

	@OriginalMember(owner = "client!os", name = "bb", descriptor = "Z")
	private boolean aBoolean562 = false;

	@OriginalMember(owner = "client!os", name = "X", descriptor = "I")
	private int anInt7776 = 0;

	@OriginalMember(owner = "client!os", name = "O", descriptor = "I")
	public int anInt7769 = -1;

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "(IIIII)V")
	public Class15_Sub1_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!os", name = "f", descriptor = "(I)I")
	@Override
	public int method8326() {
		return -10;
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(ILclient!ha;)Lclient!lca;")
	@Override
	public Class191 method8319(@OriginalArg(1) Class16 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8327(@OriginalArg(0) Class16 arg0) {
	}

	@OriginalMember(owner = "client!os", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8328() {
		return this.aBoolean562;
	}

	@OriginalMember(owner = "client!os", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method8320() {
		return false;
	}

	@OriginalMember(owner = "client!os", name = "e", descriptor = "(Z)I")
	@Override
	public int method8333(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.aBoolean562 = false;
		}
		return this.anInt7776;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(BLclient!ha;)Lclient!lba;")
	@Override
	public Class15_Sub7 method8331(@OriginalArg(1) Class16 arg0) {
		@Pc(17) Class152 local17 = Static114.method2593(super.aByte124, super.anInt10301 >> Static172.anInt4156, super.anInt10298 >> Static172.anInt4156);
		if (local17 != null && local17.aClass15_Sub1_Sub2_1.aBoolean652) {
			@Pc(30) int local30 = local17.aClass15_Sub1_Sub2_1.method8326();
			if (local30 != this.anInt7771) {
				super.anInt10297 -= this.anInt7771;
				super.anInt10297 += local30;
				this.anInt7771 = local30;
			}
		}
		@Pc(57) Class54 local57 = arg0.method6124();
		local57.method5135();
		if (local17 == null || !local17.aClass15_Sub1_Sub2_1.aBoolean652) {
			@Pc(76) Class86 local76 = Static34.aClass86Array5[super.aByte125];
			@Pc(81) int local81 = this.anInt7776 << 1;
			@Pc(88) int local88 = -local81 / 2;
			@Pc(93) int local93 = -local81 / 2;
			@Pc(105) int local105 = local76.method8088(local93 + super.anInt10298, local88 + super.anInt10301);
			@Pc(109) int local109 = local81 / 2;
			@Pc(114) int local114 = -local81 / 2;
			@Pc(126) int local126 = local76.method8088(super.anInt10298 + local114, super.anInt10301 + local109);
			@Pc(131) int local131 = -local81 / 2;
			@Pc(135) int local135 = local81 / 2;
			@Pc(147) int local147 = local76.method8088(local135 + super.anInt10298, local131 + super.anInt10301);
			@Pc(151) int local151 = local81 / 2;
			@Pc(155) int local155 = local81 / 2;
			@Pc(169) int local169 = local76.method8088(local155 + super.anInt10298, local151 + super.anInt10301);
			@Pc(180) int local180 = local105 < local126 ? local105 : local126;
			@Pc(191) int local191 = local147 >= local169 ? local169 : local147;
			@Pc(202) int local202 = local126 >= local169 ? local169 : local126;
			if (local81 != 0) {
				@Pc(218) int local218 = (int) (Math.atan2((double) (local180 - local191), (double) local81) * 2607.5945876176133D) & 0x3FFF;
				if (local218 != 0) {
					local57.method5134(local218);
				}
			}
			@Pc(233) int local233 = local147 > local105 ? local105 : local147;
			@Pc(237) int local237 = local169 + local105;
			if (local81 != 0) {
				@Pc(256) int local256 = (int) (Math.atan2((double) (local233 - local202), (double) local81) * 2607.5945876176133D) & 0x3FFF;
				if (local256 != 0) {
					local57.method5141(-local256);
				}
			}
			if (local237 > local126 + local147) {
				local237 = local126 + local147;
			}
			local237 = (local237 >> 1) - super.anInt10297;
			if (local237 != 0) {
				local57.method5142(0, local237, 0);
			}
		}
		local57.method5142(super.anInt10301, super.anInt10297 - 10, super.anInt10298);
		@Pc(309) Class15_Sub7 local309 = Static342.method5465(true, 3);
		this.anInt7776 = 0;
		this.aBoolean562 = false;
		@Pc(342) Class83 local342;
		if (this.anInt7769 != -1) {
			local342 = Static497.aClass258_21.method6652(this.anInt7769).method7044(0, -1, this.anInt7774, null, arg0, null, 0, 2048);
			if (local342 != null) {
				if (Static183.aBoolean308) {
					local342.method8009(local57, local309.aClass15_Sub6Array1[2], Static115.anInt3009, 0);
				} else {
					local342.method8003(local57, local309.aClass15_Sub6Array1[2], 0);
				}
				this.aBoolean562 |= local342.F();
				this.anInt7776 = local342.ma();
			}
		}
		if (this.anInt7765 != -1) {
			local342 = Static497.aClass258_21.method6652(this.anInt7765).method7044(0, -1, this.anInt7777, null, arg0, null, 0, 2048);
			if (local342 != null) {
				if (Static183.aBoolean308) {
					local342.method8009(local57, local309.aClass15_Sub6Array1[1], Static115.anInt3009, 0);
				} else {
					local342.method8003(local57, local309.aClass15_Sub6Array1[1], 0);
				}
				this.aBoolean562 |= local342.F();
				if (local342.ma() > this.anInt7776) {
					this.anInt7776 = local342.ma();
				}
			}
		}
		local342 = Static497.aClass258_21.method6652(this.anInt7780).method7044(0, -1, this.anInt7784, null, arg0, null, 0, 2048);
		if (local342 != null) {
			if (Static183.aBoolean308) {
				local342.method8009(local57, local309.aClass15_Sub6Array1[0], Static115.anInt3009, 0);
			} else {
				local342.method8003(local57, local309.aClass15_Sub6Array1[0], 0);
			}
			this.aBoolean562 |= local342.F();
			if (local342.ma() > this.anInt7776) {
				this.anInt7776 = local342.ma();
			}
		}
		return local309;
	}

	@OriginalMember(owner = "client!os", name = "d", descriptor = "(Z)I")
	@Override
	public int method8321() {
		@Pc(9) Class284 local9 = Static497.aClass258_21.method6652(this.anInt7780);
		@Pc(12) int local12 = local9.anInt8573;
		@Pc(22) Class284 local22;
		if (this.anInt7765 != -1) {
			local22 = Static497.aClass258_21.method6652(this.anInt7765);
			if (local22.anInt8573 > local12) {
				local12 = local22.anInt8573;
			}
		}
		if (this.anInt7769 != -1) {
			local22 = Static497.aClass258_21.method6652(this.anInt7769);
			if (local12 < local22.anInt8573) {
				local12 = local22.anInt8573;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IILclient!ha;I)Z")
	@Override
	public boolean method8316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2) {
		@Pc(6) Class54 local6 = arg2.method6124();
		local6.method5128(super.anInt10301, super.anInt10297 - 10, super.anInt10298);
		@Pc(22) Class284 local22 = Static497.aClass258_21.method6652(this.anInt7780);
		@Pc(35) Class83 local35 = local22.method7044(0, -1, this.anInt7784, null, arg2, null, 0, 131072);
		if (local35 != null && (Static183.aBoolean308 ? local35.method7994(arg0, arg1, local6, true, local22.anInt8573, Static115.anInt3009) : local35.method8007(arg0, arg1, local6, true, local22.anInt8573))) {
			return true;
		}
		@Pc(70) Class284 local70;
		if (this.anInt7765 != -1) {
			local70 = Static497.aClass258_21.method6652(this.anInt7765);
			local35 = local70.method7044(0, -1, this.anInt7777, null, arg2, null, 0, 131072);
			if (local35 != null && (Static183.aBoolean308 ? local35.method7994(arg0, arg1, local6, true, local70.anInt8573, Static115.anInt3009) : local35.method8007(arg0, arg1, local6, true, local70.anInt8573))) {
				return true;
			}
		}
		if (this.anInt7769 != -1) {
			local70 = Static497.aClass258_21.method6652(this.anInt7769);
			local35 = local70.method7044(0, -1, this.anInt7774, null, arg2, null, 0, 131072);
			if (local35 != null && (Static183.aBoolean308 ? local35.method7994(arg0, arg1, local6, true, local70.anInt8573, Static115.anInt3009) : local35.method8007(arg0, arg1, local6, true, local70.anInt8573))) {
				return true;
			}
		}
		return false;
	}
}
