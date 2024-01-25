import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class12_Sub2_Sub3_Sub1 extends Class12_Sub2_Sub3 {

	@OriginalMember(owner = "client!fd", name = "F", descriptor = "I")
	public int anInt2213;

	@OriginalMember(owner = "client!fd", name = "G", descriptor = "I")
	public int anInt2214;

	@OriginalMember(owner = "client!fd", name = "S", descriptor = "I")
	public int anInt2225;

	@OriginalMember(owner = "client!fd", name = "X", descriptor = "I")
	public int anInt2230;

	@OriginalMember(owner = "client!fd", name = "K", descriptor = "I")
	public int anInt2217 = -1;

	@OriginalMember(owner = "client!fd", name = "Q", descriptor = "I")
	private int anInt2223 = 0;

	@OriginalMember(owner = "client!fd", name = "P", descriptor = "I")
	public int anInt2222 = -1;

	@OriginalMember(owner = "client!fd", name = "Z", descriptor = "Z")
	private boolean aBoolean157 = false;

	@OriginalMember(owner = "client!fd", name = "ab", descriptor = "I")
	public int anInt2232 = 0;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(IIIII)V")
	public Class12_Sub2_Sub3_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "(I)I")
	@Override
	public int method7509(@OriginalArg(0) int arg0) {
		return arg0 == -1 ? this.anInt2223 : -84;
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(Lclient!r;I)V")
	@Override
	public void method7498(@OriginalArg(0) Class162 arg0) {
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!r;I)Lclient!hr;")
	@Override
	public Class12_Sub3 method7496(@OriginalArg(0) Class162 arg0) {
		@Pc(17) Class180 local17 = Static505.method6533(super.aByte128, super.anInt9374 >> Static562.anInt9207, super.anInt9375 >> Static562.anInt9207);
		if (local17 != null && local17.aClass12_Sub2_Sub1_1.aBoolean783) {
			@Pc(28) int local28 = local17.aClass12_Sub2_Sub1_1.method7501();
			if (local28 != this.anInt2232) {
				super.anInt9373 -= this.anInt2232;
				super.anInt9373 += local28;
				this.anInt2232 = local28;
			}
		}
		@Pc(55) Class25 local55 = arg0.method6862();
		local55.Y();
		if (local17 == null || !local17.aClass12_Sub2_Sub1_1.aBoolean783) {
			@Pc(74) Class151 local74 = Static114.aClass151Array1[super.aByte127];
			@Pc(79) int local79 = this.anInt2223 << 1;
			@Pc(86) int local86 = -local79 / 2;
			@Pc(91) int local91 = -local79 / 2;
			@Pc(103) int local103 = local74.method7680(super.anInt9374 + local86, local91 + super.anInt9375);
			@Pc(107) int local107 = local79 / 2;
			@Pc(112) int local112 = -local79 / 2;
			@Pc(124) int local124 = local74.method7680(super.anInt9374 + local107, local112 + super.anInt9375);
			@Pc(129) int local129 = -local79 / 2;
			@Pc(133) int local133 = local79 / 2;
			@Pc(146) int local146 = local74.method7680(super.anInt9374 + local129, super.anInt9375 + local133);
			@Pc(150) int local150 = local79 / 2;
			@Pc(154) int local154 = local79 / 2;
			@Pc(167) int local167 = local74.method7680(super.anInt9374 + local150, local154 + super.anInt9375);
			@Pc(178) int local178 = local124 > local103 ? local103 : local124;
			@Pc(189) int local189 = local167 > local146 ? local146 : local167;
			@Pc(196) int local196 = local167 > local124 ? local124 : local167;
			if (local79 != 0) {
				@Pc(215) int local215 = (int) (Math.atan2((double) (local178 - local189), (double) local79) * 2607.5945876176133D) & 0x3FFF;
				if (local215 != 0) {
					local55.w(local215);
				}
			}
			@Pc(230) int local230 = local103 >= local146 ? local146 : local103;
			if (local79 != 0) {
				@Pc(246) int local246 = (int) (Math.atan2((double) (local230 - local196), (double) local79) * 2607.5945876176133D) & 0x3FFF;
				if (local246 != 0) {
					local55.AA(-local246);
				}
			}
			@Pc(256) int local256 = local167 + local103;
			if (local124 + local146 < local256) {
				local256 = local124 + local146;
			}
			local256 = (local256 >> 1) - super.anInt9373;
			if (local256 != 0) {
				local55.U(0, local256, 0);
			}
		}
		local55.U(super.anInt9374, super.anInt9373 - 10, super.anInt9375);
		@Pc(298) Class12_Sub3 local298 = Static443.method5793(3);
		this.aBoolean157 = false;
		this.anInt2223 = 0;
		@Pc(327) Class33 local327;
		if (this.anInt2222 != -1) {
			local327 = Static466.aClass130_2.method2311(this.anInt2222).method3331(2048, this.anInt2225, 0, 0, -1, null, arg0, null);
			if (local327 != null) {
				if (Static286.aBoolean372) {
					local327.method7183(local55, local298.aClass12_Sub6Array1[2], Static578.anInt9366, 0);
				} else {
					local327.method7192(local55, local298.aClass12_Sub6Array1[2], 0);
				}
				this.aBoolean157 |= local327.LA();
				this.anInt2223 = local327.RA();
			}
		}
		if (this.anInt2217 != -1) {
			local327 = Static466.aClass130_2.method2311(this.anInt2217).method3331(2048, this.anInt2213, 0, 0, -1, null, arg0, null);
			if (local327 != null) {
				if (Static286.aBoolean372) {
					local327.method7183(local55, local298.aClass12_Sub6Array1[1], Static578.anInt9366, 0);
				} else {
					local327.method7192(local55, local298.aClass12_Sub6Array1[1], 0);
				}
				this.aBoolean157 |= local327.LA();
				if (local327.RA() > this.anInt2223) {
					this.anInt2223 = local327.RA();
				}
			}
		}
		local327 = Static466.aClass130_2.method2311(this.anInt2214).method3331(2048, this.anInt2230, 0, 0, -1, null, arg0, null);
		if (local327 != null) {
			if (Static286.aBoolean372) {
				local327.method7183(local55, local298.aClass12_Sub6Array1[0], Static578.anInt9366, 0);
			} else {
				local327.method7192(local55, local298.aClass12_Sub6Array1[0], 0);
			}
			this.aBoolean157 |= local327.LA();
			if (local327.RA() > this.anInt2223) {
				this.anInt2223 = local327.RA();
			}
		}
		return local298;
	}

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method7503() {
		return this.aBoolean157;
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(Lclient!r;I)Lclient!ifa;")
	@Override
	public Class157 method7502(@OriginalArg(0) Class162 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!fd", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method7513() {
		return false;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIZLclient!r;)Z")
	@Override
	public boolean method7500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class162 arg2) {
		@Pc(6) Class25 local6 = arg2.method6862();
		local6.NA(super.anInt9374, super.anInt9373 - 10, super.anInt9375);
		@Pc(38) Class33 local38 = Static466.aClass130_2.method2311(this.anInt2214).method3331(131072, this.anInt2230, 0, 0, -1, null, arg2, null);
		if (local38 != null && (Static286.aBoolean372 ? local38.method7201(arg0, arg1, local6, true, Static578.anInt9366) : local38.method7193(arg0, arg1, local6, true))) {
			return true;
		}
		if (this.anInt2217 != -1) {
			local38 = Static466.aClass130_2.method2311(this.anInt2217).method3331(131072, this.anInt2213, 0, 0, -1, null, arg2, null);
			if (local38 != null && (Static286.aBoolean372 ? local38.method7201(arg0, arg1, local6, true, Static578.anInt9366) : local38.method7193(arg0, arg1, local6, true))) {
				return true;
			}
		}
		if (this.anInt2222 != -1) {
			local38 = Static466.aClass130_2.method2311(this.anInt2222).method3331(131072, this.anInt2225, 0, 0, -1, null, arg2, null);
			if (local38 != null && (Static286.aBoolean372 ? local38.method7201(arg0, arg1, local6, true, Static578.anInt9366) : local38.method7193(arg0, arg1, local6, true))) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(Z)I")
	@Override
	public int method7501() {
		return -10;
	}
}
