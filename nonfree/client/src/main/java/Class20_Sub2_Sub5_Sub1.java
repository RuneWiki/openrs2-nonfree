import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class20_Sub2_Sub5_Sub1 extends Class20_Sub2_Sub5 {

	@OriginalMember(owner = "client!hg", name = "O", descriptor = "I")
	public int anInt3934;

	@OriginalMember(owner = "client!hg", name = "P", descriptor = "I")
	public int anInt3935;

	@OriginalMember(owner = "client!hg", name = "Q", descriptor = "I")
	public int anInt3936;

	@OriginalMember(owner = "client!hg", name = "X", descriptor = "I")
	public int anInt3941;

	@OriginalMember(owner = "client!hg", name = "S", descriptor = "I")
	public int anInt3938 = -1;

	@OriginalMember(owner = "client!hg", name = "V", descriptor = "Z")
	private boolean aBoolean326 = false;

	@OriginalMember(owner = "client!hg", name = "eb", descriptor = "I")
	private int anInt3948 = 0;

	@OriginalMember(owner = "client!hg", name = "hb", descriptor = "I")
	public int anInt3951 = -1;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(IIIII)V")
	public Class20_Sub2_Sub5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!hg", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method7249() {
		return false;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZLclient!r;II)Z")
	@Override
	public boolean method7255(@OriginalArg(1) Class12 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class209 local6 = arg0.method6441();
		local6.NA(super.anInt8796, super.anInt8790 - 10, super.anInt8795);
		@Pc(38) Class285 local38 = Static114.method1985(super.aByte116, super.anInt8796 >> Static378.anInt6665, super.anInt8795 >> Static378.anInt6665);
		if (local38 != null && local38.aClass20_Sub2_Sub4_1.aBoolean638) {
			local6.U(0, local38.aClass20_Sub2_Sub4_1.method7264(), 0);
		}
		@Pc(69) Class61 local69 = Static46.aClass234_1.method5390(this.anInt3934).method7117(0, null, this.anInt3936, 131072, null, -1, 0, arg0);
		if (local69 != null && (Static188.aBoolean320 ? local69.method7606(arg2, arg1, local6, true, Static33.anInt894) : local69.method7590(arg2, arg1, local6, true))) {
			return true;
		}
		if (this.anInt3938 != -1) {
			local69 = Static46.aClass234_1.method5390(this.anInt3938).method7117(0, null, this.anInt3941, 131072, null, -1, 0, arg0);
			if (local69 != null && (Static188.aBoolean320 ? local69.method7606(arg2, arg1, local6, true, Static33.anInt894) : local69.method7590(arg2, arg1, local6, true))) {
				return true;
			}
		}
		if (this.anInt3951 != -1) {
			local69 = Static46.aClass234_1.method5390(this.anInt3951).method7117(0, null, this.anInt3935, 131072, null, -1, 0, arg0);
			if (local69 != null && (Static188.aBoolean320 ? local69.method7606(arg2, arg1, local6, true, Static33.anInt894) : local69.method7590(arg2, arg1, local6, true))) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hg", name = "l", descriptor = "(I)I")
	@Override
	public int method7261(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			Static191.method3385();
		}
		return this.anInt3948;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(BLclient!r;)Lclient!qw;")
	@Override
	public Class20_Sub8 method7253(@OriginalArg(1) Class12 arg0) {
		@Pc(17) Class285 local17 = Static114.method1985(super.aByte116, super.anInt8796 >> Static378.anInt6665, super.anInt8795 >> Static378.anInt6665);
		@Pc(20) Class209 local20 = arg0.method6441();
		local20.Y();
		if (local17 == null || !local17.aClass20_Sub2_Sub4_1.aBoolean638) {
			@Pc(39) Class17 local39 = Static20.aClass17Array1[super.aByte117];
			@Pc(44) int local44 = this.anInt3948 << 1;
			@Pc(51) int local51 = -local44 / 2;
			@Pc(56) int local56 = -local44 / 2;
			@Pc(68) int local68 = local39.method6637(local51 + super.anInt8796, super.anInt8795 + local56);
			@Pc(72) int local72 = local44 / 2;
			@Pc(77) int local77 = -local44 / 2;
			@Pc(89) int local89 = local39.method6637(super.anInt8796 + local72, local77 + super.anInt8795);
			@Pc(94) int local94 = -local44 / 2;
			@Pc(98) int local98 = local44 / 2;
			@Pc(110) int local110 = local39.method6637(local94 + super.anInt8796, super.anInt8795 + local98);
			@Pc(114) int local114 = local44 / 2;
			@Pc(118) int local118 = local44 / 2;
			@Pc(130) int local130 = local39.method6637(local114 + super.anInt8796, local118 + super.anInt8795);
			@Pc(141) int local141 = local89 <= local68 ? local89 : local68;
			@Pc(148) int local148 = local110 >= local130 ? local130 : local110;
			@Pc(155) int local155 = local130 > local89 ? local89 : local130;
			@Pc(162) int local162 = local68 >= local110 ? local110 : local68;
			if (local44 != 0) {
				@Pc(181) int local181 = (int) (Math.atan2((double) (local141 - local148), (double) local44) * 2607.5945876176133D) & 0x3FFF;
				if (local181 != 0) {
					local20.w(local181);
				}
			}
			@Pc(190) int local190 = local68 + local130;
			if (local44 != 0) {
				@Pc(206) int local206 = (int) (Math.atan2((double) (local162 - local155), (double) local44) * 2607.5945876176133D) & 0x3FFF;
				if (local206 != 0) {
					local20.AA(-local206);
				}
			}
			if (local110 + local89 < local190) {
				local190 = local110 + local89;
			}
			local190 = (local190 >> 1) - super.anInt8790;
			if (local190 != 0) {
				local20.U(0, local190, 0);
			}
		}
		local20.U(super.anInt8796, super.anInt8790 - 10, super.anInt8795);
		if (local17 != null && local17.aClass20_Sub2_Sub4_1.aBoolean638) {
			local20.U(0, local17.aClass20_Sub2_Sub4_1.method7264(), 0);
		}
		@Pc(267) Class20_Sub8 local267 = Static593.method7897(3);
		this.aBoolean326 = false;
		this.anInt3948 = 0;
		@Pc(299) Class61 local299;
		if (this.anInt3951 != -1) {
			local299 = Static46.aClass234_1.method5390(this.anInt3951).method7117(0, null, this.anInt3935, 2048, null, -1, 0, arg0);
			if (local299 != null) {
				if (Static188.aBoolean320) {
					local299.method7592(local20, local267.aClass20_Sub3Array1[2], Static33.anInt894, 0);
				} else {
					local299.method7587(local20, local267.aClass20_Sub3Array1[2], 0);
				}
				this.aBoolean326 |= local299.LA();
				this.anInt3948 = local299.RA();
			}
		}
		if (this.anInt3938 != -1) {
			local299 = Static46.aClass234_1.method5390(this.anInt3938).method7117(0, null, this.anInt3941, 2048, null, -1, 0, arg0);
			if (local299 != null) {
				if (Static188.aBoolean320) {
					local299.method7592(local20, local267.aClass20_Sub3Array1[1], Static33.anInt894, 0);
				} else {
					local299.method7587(local20, local267.aClass20_Sub3Array1[1], 0);
				}
				this.aBoolean326 |= local299.LA();
				if (local299.RA() > this.anInt3948) {
					this.anInt3948 = local299.RA();
				}
			}
		}
		local299 = Static46.aClass234_1.method5390(this.anInt3934).method7117(0, null, this.anInt3936, 2048, null, -1, 0, arg0);
		if (local299 != null) {
			if (Static188.aBoolean320) {
				local299.method7592(local20, local267.aClass20_Sub3Array1[0], Static33.anInt894, 0);
			} else {
				local299.method7587(local20, local267.aClass20_Sub3Array1[0], 0);
			}
			this.aBoolean326 |= local299.LA();
			if (local299.RA() > this.anInt3948) {
				this.anInt3948 = local299.RA();
			}
		}
		return local267;
	}

	@OriginalMember(owner = "client!hg", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method7256() {
		return this.aBoolean326;
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(Lclient!r;I)Lclient!cu;")
	@Override
	public Class60 method7262(@OriginalArg(0) Class12 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7265(@OriginalArg(0) Class12 arg0) {
	}

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "(B)I")
	@Override
	public int method7264() {
		return -10;
	}
}
