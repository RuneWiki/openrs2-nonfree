import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class25_Sub2_Sub4_Sub1 extends Class25_Sub2_Sub4 {

	@OriginalMember(owner = "client!jd", name = "E", descriptor = "I")
	public int anInt4842;

	@OriginalMember(owner = "client!jd", name = "R", descriptor = "I")
	public int anInt4852;

	@OriginalMember(owner = "client!jd", name = "T", descriptor = "I")
	public int anInt4854;

	@OriginalMember(owner = "client!jd", name = "Y", descriptor = "I")
	public int anInt4859;

	@OriginalMember(owner = "client!jd", name = "M", descriptor = "I")
	public int anInt4848 = -1;

	@OriginalMember(owner = "client!jd", name = "F", descriptor = "Z")
	private boolean aBoolean317 = false;

	@OriginalMember(owner = "client!jd", name = "W", descriptor = "I")
	private int anInt4857 = 0;

	@OriginalMember(owner = "client!jd", name = "ab", descriptor = "I")
	public int anInt4861 = -1;

	@OriginalMember(owner = "client!jd", name = "cb", descriptor = "I")
	public int anInt4863 = 0;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(IIIII)V")
	public Class25_Sub2_Sub4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "(B)I")
	@Override
	public int method6650(@OriginalArg(0) byte arg0) {
		if (arg0 <= 108) {
			this.anInt4859 = -124;
		}
		return this.anInt4857;
	}

	@OriginalMember(owner = "client!jd", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method6653() {
		return false;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(BLclient!r;)Lclient!ll;")
	@Override
	public Class190 method6648(@OriginalArg(1) Class31 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(ILclient!r;)Lclient!od;")
	@Override
	public Class25_Sub10 method6647(@OriginalArg(1) Class31 arg0) {
		@Pc(17) Class147 local17 = Static199.method3474(super.aByte117, super.anInt8476 >> Static385.anInt6657, super.anInt8482 >> Static385.anInt6657);
		if (local17 != null && local17.aClass25_Sub2_Sub2_1.aBoolean576) {
			@Pc(28) int local28 = local17.aClass25_Sub2_Sub2_1.method6652();
			if (this.anInt4863 != local28) {
				super.anInt8480 -= this.anInt4863;
				this.anInt4863 = local28;
				super.anInt8480 += local28;
			}
		}
		@Pc(55) Class42 local55 = arg0.method8052();
		local55.Y();
		if (local17 == null || !local17.aClass25_Sub2_Sub2_1.aBoolean576) {
			@Pc(74) Class127 local74 = Static256.aClass127Array3[super.aByte118];
			@Pc(79) int local79 = this.anInt4857 << 1;
			@Pc(86) int local86 = -local79 / 2;
			@Pc(91) int local91 = -local79 / 2;
			@Pc(104) int local104 = local74.method7860(super.anInt8482 + local91, super.anInt8476 + local86);
			@Pc(108) int local108 = local79 / 2;
			@Pc(113) int local113 = -local79 / 2;
			@Pc(125) int local125 = local74.method7860(super.anInt8482 + local113, local108 + super.anInt8476);
			@Pc(130) int local130 = -local79 / 2;
			@Pc(134) int local134 = local79 / 2;
			@Pc(147) int local147 = local74.method7860(local134 + super.anInt8482, super.anInt8476 - -local130);
			@Pc(151) int local151 = local79 / 2;
			@Pc(155) int local155 = local79 / 2;
			@Pc(168) int local168 = local74.method7860(super.anInt8482 + local155, super.anInt8476 - -local151);
			@Pc(175) int local175 = local104 < local125 ? local104 : local125;
			@Pc(186) int local186 = local147 >= local168 ? local168 : local147;
			@Pc(197) int local197 = local168 > local125 ? local125 : local168;
			if (local79 != 0) {
				@Pc(216) int local216 = (int) (Math.atan2((double) (local175 - local186), (double) local79) * 2607.5945876176133D) & 0x3FFF;
				if (local216 != 0) {
					local55.w(local216);
				}
			}
			@Pc(228) int local228 = local147 > local104 ? local104 : local147;
			@Pc(232) int local232 = local168 + local104;
			if (local79 != 0) {
				@Pc(251) int local251 = (int) (Math.atan2((double) (local228 - local197), (double) local79) * 2607.5945876176133D) & 0x3FFF;
				if (local251 != 0) {
					local55.AA(-local251);
				}
			}
			if (local147 + local125 < local232) {
				local232 = local125 + local147;
			}
			local232 = (local232 >> 1) - super.anInt8480;
			if (local232 != 0) {
				local55.U(0, local232, 0);
			}
		}
		local55.U(super.anInt8476, super.anInt8480 - 10, super.anInt8482);
		@Pc(302) Class25_Sub10 local302 = Static65.method1625(3);
		this.anInt4857 = 0;
		this.aBoolean317 = false;
		@Pc(329) Class52 local329;
		if (this.anInt4848 != -1) {
			local329 = Static272.aClass121_2.method3327(this.anInt4848).method3545(null, this.anInt4852, 2048, 0, 0, -1, arg0, null);
			if (local329 != null) {
				if (Static547.aBoolean631) {
					local329.method7619(local55, local302.aClass25_Sub1Array1[2], Static150.anInt3469, 0);
				} else {
					local329.method7617(local55, local302.aClass25_Sub1Array1[2], 0);
				}
				this.aBoolean317 |= local329.LA();
				this.anInt4857 = local329.RA();
			}
		}
		if (this.anInt4861 != -1) {
			local329 = Static272.aClass121_2.method3327(this.anInt4861).method3545(null, this.anInt4859, 2048, 0, 0, -1, arg0, null);
			if (local329 != null) {
				if (Static547.aBoolean631) {
					local329.method7619(local55, local302.aClass25_Sub1Array1[1], Static150.anInt3469, 0);
				} else {
					local329.method7617(local55, local302.aClass25_Sub1Array1[1], 0);
				}
				this.aBoolean317 |= local329.LA();
				if (local329.RA() > this.anInt4857) {
					this.anInt4857 = local329.RA();
				}
			}
		}
		local329 = Static272.aClass121_2.method3327(this.anInt4854).method3545(null, this.anInt4842, 2048, 0, 0, -1, arg0, null);
		if (local329 != null) {
			if (Static547.aBoolean631) {
				local329.method7619(local55, local302.aClass25_Sub1Array1[0], Static150.anInt3469, 0);
			} else {
				local329.method7617(local55, local302.aClass25_Sub1Array1[0], 0);
			}
			this.aBoolean317 |= local329.LA();
			if (local329.RA() > this.anInt4857) {
				this.anInt4857 = local329.RA();
			}
		}
		return local302;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method6656(@OriginalArg(0) Class31 arg0) {
	}

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "(I)I")
	@Override
	public int method6652() {
		return -10;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZILclient!r;I)Z")
	@Override
	public boolean method6657(@OriginalArg(1) int arg0, @OriginalArg(2) Class31 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class42 local6 = arg1.method8052();
		local6.NA(super.anInt8476, super.anInt8480 - 10, super.anInt8482);
		@Pc(38) Class52 local38 = Static272.aClass121_2.method3327(this.anInt4854).method3545(null, this.anInt4842, 131072, 0, 0, -1, arg1, null);
		if (local38 != null && (Static547.aBoolean631 ? local38.method7612(arg2, arg0, local6, true, Static150.anInt3469) : local38.method7635(arg2, arg0, local6, true))) {
			return true;
		}
		if (this.anInt4861 != -1) {
			local38 = Static272.aClass121_2.method3327(this.anInt4861).method3545(null, this.anInt4859, 131072, 0, 0, -1, arg1, null);
			if (local38 != null && (Static547.aBoolean631 ? local38.method7612(arg2, arg0, local6, true, Static150.anInt3469) : local38.method7635(arg2, arg0, local6, true))) {
				return true;
			}
		}
		if (this.anInt4848 != -1) {
			local38 = Static272.aClass121_2.method3327(this.anInt4848).method3545(null, this.anInt4852, 131072, 0, 0, -1, arg1, null);
			if (local38 != null && (Static547.aBoolean631 ? local38.method7612(arg2, arg0, local6, true, Static150.anInt3469) : local38.method7635(arg2, arg0, local6, true))) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jd", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method6655() {
		return this.aBoolean317;
	}
}
