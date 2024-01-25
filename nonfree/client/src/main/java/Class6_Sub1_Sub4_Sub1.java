import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ip")
public final class Class6_Sub1_Sub4_Sub1 extends Class6_Sub1_Sub4 {

	@OriginalMember(owner = "client!ip", name = "H", descriptor = "I")
	public int anInt4290;

	@OriginalMember(owner = "client!ip", name = "O", descriptor = "I")
	public int anInt4295;

	@OriginalMember(owner = "client!ip", name = "ab", descriptor = "I")
	public int anInt4306;

	@OriginalMember(owner = "client!ip", name = "db", descriptor = "I")
	public int anInt4309;

	@OriginalMember(owner = "client!ip", name = "G", descriptor = "Z")
	private boolean aBoolean348 = false;

	@OriginalMember(owner = "client!ip", name = "U", descriptor = "I")
	private int anInt4300 = 0;

	@OriginalMember(owner = "client!ip", name = "X", descriptor = "I")
	public int anInt4303 = -1;

	@OriginalMember(owner = "client!ip", name = "W", descriptor = "I")
	public int anInt4302 = -1;

	@OriginalMember(owner = "client!ip", name = "J", descriptor = "I")
	public int anInt4292 = 0;

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(IIIII)V")
	public Class6_Sub1_Sub4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(ZLclient!r;)V")
	@Override
	public void method7323(@OriginalArg(1) Class100 arg0) {
	}

	@OriginalMember(owner = "client!ip", name = "g", descriptor = "(I)I")
	@Override
	public int method7328() {
		return -10;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lclient!r;I)Lclient!sd;")
	@Override
	public Class297 method7326(@OriginalArg(0) Class100 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ip", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method7318() {
		return this.aBoolean348;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZLclient!r;)Lclient!og;")
	@Override
	public Class6_Sub5 method7317(@OriginalArg(1) Class100 arg0) {
		@Pc(17) Class153 local17 = Static69.method1125(super.aByte112, super.anInt8761 >> Static134.anInt2822, super.anInt8764 >> Static134.anInt2822);
		if (local17 != null && local17.aClass6_Sub1_Sub1_1.aBoolean568) {
			@Pc(28) int local28 = local17.aClass6_Sub1_Sub1_1.method7328();
			if (local28 != this.anInt4292) {
				super.anInt8759 -= this.anInt4292;
				super.anInt8759 += local28;
				this.anInt4292 = local28;
			}
		}
		@Pc(51) Class68 local51 = arg0.method6222();
		local51.Y();
		if (local17 == null || !local17.aClass6_Sub1_Sub1_1.aBoolean568) {
			@Pc(70) Class67 local70 = Static421.aClass67Array7[super.aByte111];
			@Pc(75) int local75 = this.anInt4300 << 1;
			@Pc(82) int local82 = -local75 / 2;
			@Pc(87) int local87 = -local75 / 2;
			@Pc(99) int local99 = local70.method6711(super.anInt8764 + local87, local82 + super.anInt8761);
			@Pc(103) int local103 = local75 / 2;
			@Pc(108) int local108 = -local75 / 2;
			@Pc(124) int local124 = local70.method6711(local108 + super.anInt8764, local103 + super.anInt8761);
			@Pc(129) int local129 = -local75 / 2;
			@Pc(133) int local133 = local75 / 2;
			@Pc(149) int local149 = local70.method6711(local133 + super.anInt8764, local129 + super.anInt8761);
			@Pc(153) int local153 = local75 / 2;
			@Pc(157) int local157 = local75 / 2;
			@Pc(170) int local170 = local70.method6711(super.anInt8764 + local157, local153 + super.anInt8761);
			@Pc(177) int local177 = local124 <= local99 ? local124 : local99;
			@Pc(184) int local184 = local170 > local149 ? local149 : local170;
			@Pc(195) int local195 = local170 > local124 ? local124 : local170;
			if (local75 != 0) {
				@Pc(214) int local214 = (int) (Math.atan2((double) (local177 - local184), (double) local75) * 2607.5945876176133D) & 0x3FFF;
				if (local214 != 0) {
					local51.w(local214);
				}
			}
			@Pc(230) int local230 = local99 < local149 ? local99 : local149;
			if (local75 != 0) {
				@Pc(246) int local246 = (int) (Math.atan2((double) (local230 - local195), (double) local75) * 2607.5945876176133D) & 0x3FFF;
				if (local246 != 0) {
					local51.AA(-local246);
				}
			}
			@Pc(257) int local257 = local99 + local170;
			if (local149 + local124 < local257) {
				local257 = local124 + local149;
			}
			local257 = (local257 >> 1) - super.anInt8759;
			if (local257 != 0) {
				local51.U(0, local257, 0);
			}
		}
		local51.U(super.anInt8761, super.anInt8759 - 10, super.anInt8764);
		@Pc(295) Class6_Sub5 local295 = Static305.method4561(3);
		this.anInt4300 = 0;
		this.aBoolean348 = false;
		@Pc(323) Class66 local323;
		if (this.anInt4302 != -1) {
			local323 = Static296.aClass218_1.method5067(this.anInt4302).method7484(0, arg0, 2048, null, 0, null, this.anInt4295, -1);
			if (local323 != null) {
				if (Static338.aBoolean493) {
					local323.method7556(local51, local295.aClass6_Sub6Array1[2], Static401.anInt6991, 0);
				} else {
					local323.method7558(local51, local295.aClass6_Sub6Array1[2], 0);
				}
				this.aBoolean348 |= local323.LA();
				this.anInt4300 = local323.RA();
			}
		}
		if (this.anInt4303 != -1) {
			local323 = Static296.aClass218_1.method5067(this.anInt4303).method7484(0, arg0, 2048, null, 0, null, this.anInt4309, -1);
			if (local323 != null) {
				if (Static338.aBoolean493) {
					local323.method7556(local51, local295.aClass6_Sub6Array1[1], Static401.anInt6991, 0);
				} else {
					local323.method7558(local51, local295.aClass6_Sub6Array1[1], 0);
				}
				this.aBoolean348 |= local323.LA();
				if (local323.RA() > this.anInt4300) {
					this.anInt4300 = local323.RA();
				}
			}
		}
		local323 = Static296.aClass218_1.method5067(this.anInt4290).method7484(0, arg0, 2048, null, 0, null, this.anInt4306, -1);
		if (local323 != null) {
			if (Static338.aBoolean493) {
				local323.method7556(local51, local295.aClass6_Sub6Array1[0], Static401.anInt6991, 0);
			} else {
				local323.method7558(local51, local295.aClass6_Sub6Array1[0], 0);
			}
			this.aBoolean348 |= local323.LA();
			if (local323.RA() > this.anInt4300) {
				this.anInt4300 = local323.RA();
			}
		}
		return local295;
	}

	@OriginalMember(owner = "client!ip", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method7329() {
		return false;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IILclient!r;I)Z")
	@Override
	public boolean method7331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2) {
		@Pc(6) Class68 local6 = arg2.method6222();
		local6.NA(super.anInt8761, super.anInt8759 - 10, super.anInt8764);
		@Pc(35) Class66 local35 = Static296.aClass218_1.method5067(this.anInt4290).method7484(0, arg2, 131072, null, 0, null, this.anInt4306, -1);
		if (local35 != null && (Static338.aBoolean493 ? local35.method7547(arg0, arg1, local6, true, Static401.anInt6991) : local35.method7541(arg0, arg1, local6, true))) {
			return true;
		}
		if (this.anInt4303 != -1) {
			local35 = Static296.aClass218_1.method5067(this.anInt4303).method7484(0, arg2, 131072, null, 0, null, this.anInt4309, -1);
			if (local35 != null && (Static338.aBoolean493 ? local35.method7547(arg0, arg1, local6, true, Static401.anInt6991) : local35.method7541(arg0, arg1, local6, true))) {
				return true;
			}
		}
		if (this.anInt4302 != -1) {
			local35 = Static296.aClass218_1.method5067(this.anInt4302).method7484(0, arg2, 131072, null, 0, null, this.anInt4295, -1);
			if (local35 != null && (Static338.aBoolean493 ? local35.method7547(arg0, arg1, local6, true, Static401.anInt6991) : local35.method7541(arg0, arg1, local6, true))) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "(I)I")
	@Override
	public int method7319(@OriginalArg(0) int arg0) {
		if (arg0 != -22496) {
			this.anInt4292 = -45;
		}
		return this.anInt4300;
	}
}
