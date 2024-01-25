import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class16_Sub1_Sub5_Sub1 extends Class16_Sub1_Sub5 {

	@OriginalMember(owner = "client!rb", name = "lb", descriptor = "I")
	public static int lb;

	@OriginalMember(owner = "client!rb", name = "U", descriptor = "I")
	public int anInt7832;

	@OriginalMember(owner = "client!rb", name = "bb", descriptor = "I")
	public int anInt7838;

	@OriginalMember(owner = "client!rb", name = "fb", descriptor = "I")
	public int anInt7842;

	@OriginalMember(owner = "client!rb", name = "ib", descriptor = "I")
	public int anInt7844;

	@OriginalMember(owner = "client!rb", name = "S", descriptor = "I")
	public int anInt7831 = -1;

	@OriginalMember(owner = "client!rb", name = "Y", descriptor = "I")
	private int anInt7836 = 0;

	@OriginalMember(owner = "client!rb", name = "T", descriptor = "Z")
	private boolean aBoolean558 = false;

	@OriginalMember(owner = "client!rb", name = "R", descriptor = "I")
	public int anInt7830 = -1;

	@OriginalMember(owner = "client!rb", name = "jb", descriptor = "I")
	public int anInt7845 = 0;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(IIIII)V")
	public Class16_Sub1_Sub5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(B)I")
	@Override
	public int method6975() {
		@Pc(16) Class327 local16 = Static470.aClass250_1.method5960(this.anInt7832);
		@Pc(19) int local19 = local16.anInt8727;
		@Pc(30) Class327 local30;
		if (this.anInt7831 != -1) {
			local30 = Static470.aClass250_1.method5960(this.anInt7831);
			if (local19 < local30.anInt8727) {
				local19 = local30.anInt8727;
			}
		}
		if (this.anInt7830 != -1) {
			local30 = Static470.aClass250_1.method5960(this.anInt7830);
			if (local30.anInt8727 > local19) {
				local19 = local30.anInt8727;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method6978(@OriginalArg(0) Class13 arg0) {
	}

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method6974() {
		return this.aBoolean558;
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(Lclient!ha;I)Lclient!jk;")
	@Override
	public Class16_Sub5 method6991(@OriginalArg(0) Class13 arg0) {
		@Pc(17) Class333 local17 = Static103.method1955(super.aByte109, super.anInt8037 >> Static326.anInt5713, super.anInt8034 >> Static326.anInt5713);
		if (local17 != null && local17.aClass16_Sub1_Sub1_1.aBoolean584) {
			@Pc(28) int local28 = local17.aClass16_Sub1_Sub1_1.method6980();
			if (this.anInt7845 != local28) {
				super.anInt8036 -= this.anInt7845;
				super.anInt8036 += local28;
				this.anInt7845 = local28;
			}
		}
		@Pc(63) Class51 local63 = arg0.method8154();
		local63.method6714();
		if (local17 == null || !local17.aClass16_Sub1_Sub1_1.aBoolean584) {
			@Pc(82) Class91 local82 = Static511.aClass91Array3[super.aByte108];
			@Pc(87) int local87 = this.anInt7836 << 1;
			@Pc(94) int local94 = -local87 / 2;
			@Pc(99) int local99 = -local87 / 2;
			@Pc(111) int local111 = local82.method7446(local94 + super.anInt8037, local99 + super.anInt8034);
			@Pc(115) int local115 = local87 / 2;
			@Pc(120) int local120 = -local87 / 2;
			@Pc(132) int local132 = local82.method7446(local115 + super.anInt8037, local120 + super.anInt8034);
			@Pc(137) int local137 = -local87 / 2;
			@Pc(141) int local141 = local87 / 2;
			@Pc(153) int local153 = local82.method7446(local137 + super.anInt8037, local141 + super.anInt8034);
			@Pc(157) int local157 = local87 / 2;
			@Pc(161) int local161 = local87 / 2;
			@Pc(173) int local173 = local82.method7446(local157 + super.anInt8037, super.anInt8034 + local161);
			@Pc(184) int local184 = local111 < local132 ? local111 : local132;
			@Pc(191) int local191 = local153 < local173 ? local153 : local173;
			@Pc(202) int local202 = local132 < local173 ? local132 : local173;
			@Pc(209) int local209 = local153 <= local111 ? local153 : local111;
			if (local87 != 0) {
				@Pc(228) int local228 = (int) (Math.atan2((double) (local184 - local191), (double) local87) * 2607.5945876176133D) & 0x3FFF;
				if (local228 != 0) {
					local63.method6707(local228);
				}
			}
			@Pc(240) int local240 = local173 + local111;
			if (local87 != 0) {
				@Pc(256) int local256 = (int) (Math.atan2((double) (local209 - local202), (double) local87) * 2607.5945876176133D) & 0x3FFF;
				if (local256 != 0) {
					local63.method6720(-local256);
				}
			}
			if (local240 > local132 + local153) {
				local240 = local132 + local153;
			}
			local240 = (local240 >> 1) - super.anInt8036;
			if (local240 != 0) {
				local63.method6711(0, local240, 0);
			}
		}
		local63.method6711(super.anInt8037, super.anInt8036 - 10, super.anInt8034);
		@Pc(305) Class16_Sub5 local305 = Static134.method8011(true, 3);
		this.anInt7836 = 0;
		this.aBoolean558 = false;
		@Pc(332) Class193 local332;
		if (this.anInt7830 != -1) {
			local332 = Static470.aClass250_1.method5960(this.anInt7830).method7500((Class228) null, arg0, (Class284) null, 0, -1, this.anInt7838, 2048, 0);
			if (local332 != null) {
				if (Static582.aBoolean678) {
					local332.method6622(local63, local305.aClass16_Sub10Array1[2], Static529.anInt8509, 0);
				} else {
					local332.method6612(local63, local305.aClass16_Sub10Array1[2], 0);
				}
				this.aBoolean558 |= local332.F();
				this.anInt7836 = local332.ma();
			}
		}
		if (this.anInt7831 != -1) {
			local332 = Static470.aClass250_1.method5960(this.anInt7831).method7500((Class228) null, arg0, (Class284) null, 0, -1, this.anInt7844, 2048, 0);
			if (local332 != null) {
				if (Static582.aBoolean678) {
					local332.method6622(local63, local305.aClass16_Sub10Array1[1], Static529.anInt8509, 0);
				} else {
					local332.method6612(local63, local305.aClass16_Sub10Array1[1], 0);
				}
				this.aBoolean558 |= local332.F();
				if (local332.ma() > this.anInt7836) {
					this.anInt7836 = local332.ma();
				}
			}
		}
		local332 = Static470.aClass250_1.method5960(this.anInt7832).method7500((Class228) null, arg0, (Class284) null, 0, -1, this.anInt7842, 2048, 0);
		if (local332 != null) {
			if (Static582.aBoolean678) {
				local332.method6622(local63, local305.aClass16_Sub10Array1[0], Static529.anInt8509, 0);
			} else {
				local332.method6612(local63, local305.aClass16_Sub10Array1[0], 0);
			}
			this.aBoolean558 |= local332.F();
			if (local332.ma() > this.anInt7836) {
				this.anInt7836 = local332.ma();
			}
		}
		return local305;
	}

	@OriginalMember(owner = "client!rb", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method6990() {
		return false;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(BILclient!ha;I)Z")
	@Override
	public boolean method6985(@OriginalArg(1) int arg0, @OriginalArg(2) Class13 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class51 local12 = arg1.method8154();
		local12.method6705(super.anInt8037, super.anInt8036 - 10, super.anInt8034);
		@Pc(28) Class327 local28 = Static470.aClass250_1.method5960(this.anInt7832);
		@Pc(41) Class193 local41 = local28.method7500((Class228) null, arg1, (Class284) null, 0, -1, this.anInt7842, 131072, 0);
		if (local41 != null && (Static582.aBoolean678 ? local41.method6617(arg0, arg2, local12, true, local28.anInt8727, Static529.anInt8509) : local41.method6623(arg0, arg2, local12, true, local28.anInt8727))) {
			return true;
		}
		@Pc(77) Class327 local77;
		if (this.anInt7831 != -1) {
			local77 = Static470.aClass250_1.method5960(this.anInt7831);
			local41 = local77.method7500((Class228) null, arg1, (Class284) null, 0, -1, this.anInt7844, 131072, 0);
			if (local41 != null && (Static582.aBoolean678 ? local41.method6617(arg0, arg2, local12, true, local77.anInt8727, Static529.anInt8509) : local41.method6623(arg0, arg2, local12, true, local77.anInt8727))) {
				return true;
			}
		}
		if (this.anInt7830 != -1) {
			local77 = Static470.aClass250_1.method5960(this.anInt7830);
			local41 = local77.method7500((Class228) null, arg1, (Class284) null, 0, -1, this.anInt7838, 131072, 0);
			if (local41 != null && (Static582.aBoolean678 ? local41.method6617(arg0, arg2, local12, true, local77.anInt8727, Static529.anInt8509) : local41.method6623(arg0, arg2, local12, true, local77.anInt8727))) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "(ILclient!ha;)Lclient!wg;")
	@Override
	public Class379 method6983(@OriginalArg(1) Class13 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!rb", name = "h", descriptor = "(I)I")
	@Override
	public int method6988(@OriginalArg(0) int arg0) {
		return arg0 == 1027 ? this.anInt7836 : -59;
	}

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "(B)I")
	@Override
	public int method6980() {
		return -10;
	}
}
