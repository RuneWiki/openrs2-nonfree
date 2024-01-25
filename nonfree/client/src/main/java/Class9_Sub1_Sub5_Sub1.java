import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class9_Sub1_Sub5_Sub1 extends Class9_Sub1_Sub5 {

	@OriginalMember(owner = "client!vi", name = "P", descriptor = "I")
	public int anInt8997;

	@OriginalMember(owner = "client!vi", name = "Q", descriptor = "I")
	public int anInt8998;

	@OriginalMember(owner = "client!vi", name = "W", descriptor = "I")
	public int anInt9003;

	@OriginalMember(owner = "client!vi", name = "ab", descriptor = "I")
	public int anInt9007;

	@OriginalMember(owner = "client!vi", name = "K", descriptor = "I")
	private int anInt8993 = 0;

	@OriginalMember(owner = "client!vi", name = "N", descriptor = "Z")
	private boolean aBoolean703 = false;

	@OriginalMember(owner = "client!vi", name = "L", descriptor = "I")
	public int anInt8994 = -1;

	@OriginalMember(owner = "client!vi", name = "Z", descriptor = "I")
	public int anInt9006 = -1;

	@OriginalMember(owner = "client!vi", name = "M", descriptor = "I")
	private int anInt8995 = 0;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(IIIII)V")
	public Class9_Sub1_Sub5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(ILclient!r;)Lclient!fe;")
	@Override
	public Class9_Sub2 method7480(@OriginalArg(1) Class43 arg0) {
		@Pc(17) Class16 local17 = Static65.method1514(super.aByte126, super.anInt8975 >> Static458.anInt7508, super.anInt8980 >> Static458.anInt7508);
		if (local17 != null && local17.aClass9_Sub1_Sub1_1.aBoolean655) {
			@Pc(28) int local28 = local17.aClass9_Sub1_Sub1_1.method7478();
			if (this.anInt8995 != local28) {
				super.anInt8977 -= this.anInt8995;
				this.anInt8995 = local28;
				super.anInt8977 += local28;
			}
		}
		@Pc(51) Class109 local51 = arg0.method7142();
		local51.Y();
		if (local17 == null || !local17.aClass9_Sub1_Sub1_1.aBoolean655) {
			@Pc(70) Class139 local70 = Static29.aClass139Array6[super.aByte125];
			@Pc(75) int local75 = this.anInt8993 << 1;
			@Pc(82) int local82 = -local75 / 2;
			@Pc(87) int local87 = -local75 / 2;
			@Pc(101) int local101 = local70.method6890(super.anInt8975 + local82, local87 + super.anInt8980);
			@Pc(105) int local105 = local75 / 2;
			@Pc(110) int local110 = -local75 / 2;
			@Pc(122) int local122 = local70.method6890(local105 + super.anInt8975, local110 + super.anInt8980);
			@Pc(127) int local127 = -local75 / 2;
			@Pc(131) int local131 = local75 / 2;
			@Pc(144) int local144 = local70.method6890(super.anInt8975 + local127, super.anInt8980 + local131);
			@Pc(148) int local148 = local75 / 2;
			@Pc(152) int local152 = local75 / 2;
			@Pc(167) int local167 = local70.method6890(super.anInt8975 + local148, local152 + super.anInt8980);
			@Pc(178) int local178 = local101 >= local122 ? local122 : local101;
			@Pc(185) int local185 = local167 <= local144 ? local167 : local144;
			@Pc(192) int local192 = local122 >= local167 ? local167 : local122;
			@Pc(203) int local203 = local101 < local144 ? local101 : local144;
			if (local75 != 0) {
				@Pc(222) int local222 = (int) (Math.atan2((double) (local178 - local185), (double) local75) * 2607.5945876176133D) & 0x3FFF;
				if (local222 != 0) {
					local51.w(local222);
				}
			}
			@Pc(235) int local235 = local101 + local167;
			if (local75 != 0) {
				@Pc(254) int local254 = (int) (Math.atan2((double) (local203 - local192), (double) local75) * 2607.5945876176133D) & 0x3FFF;
				if (local254 != 0) {
					local51.AA(-local254);
				}
			}
			if (local235 > local144 + local122) {
				local235 = local122 + local144;
			}
			local235 = (local235 >> 1) - super.anInt8977;
			if (local235 != 0) {
				local51.U(0, local235, 0);
			}
		}
		local51.U(super.anInt8975, super.anInt8977 - 10, super.anInt8980);
		@Pc(304) Class9_Sub2 local304 = Static88.method1977(3);
		this.aBoolean703 = false;
		this.anInt8993 = 0;
		@Pc(332) Class57 local332;
		if (this.anInt8994 != -1) {
			local332 = Static517.aClass145_1.method3798(this.anInt8994).method7316(null, 2048, -1, 0, arg0, 0, this.anInt9003, null);
			if (local332 != null) {
				if (Static225.aBoolean335) {
					local332.method7521(local51, local304.aClass9_Sub9Array1[2], Static354.anInt6136, 0);
				} else {
					local332.method7501(local51, local304.aClass9_Sub9Array1[2], 0);
				}
				this.aBoolean703 |= local332.LA();
				this.anInt8993 = local332.RA();
			}
		}
		if (this.anInt9006 != -1) {
			local332 = Static517.aClass145_1.method3798(this.anInt9006).method7316(null, 2048, -1, 0, arg0, 0, this.anInt8997, null);
			if (local332 != null) {
				if (Static225.aBoolean335) {
					local332.method7521(local51, local304.aClass9_Sub9Array1[1], Static354.anInt6136, 0);
				} else {
					local332.method7501(local51, local304.aClass9_Sub9Array1[1], 0);
				}
				this.aBoolean703 |= local332.LA();
				if (local332.RA() > this.anInt8993) {
					this.anInt8993 = local332.RA();
				}
			}
		}
		local332 = Static517.aClass145_1.method3798(this.anInt9007).method7316(null, 2048, -1, 0, arg0, 0, this.anInt8998, null);
		if (local332 != null) {
			if (Static225.aBoolean335) {
				local332.method7521(local51, local304.aClass9_Sub9Array1[0], Static354.anInt6136, 0);
			} else {
				local332.method7501(local51, local304.aClass9_Sub9Array1[0], 0);
			}
			this.aBoolean703 |= local332.LA();
			if (local332.RA() > this.anInt8993) {
				this.anInt8993 = local332.RA();
			}
		}
		return local304;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILclient!r;)Lclient!bm;")
	@Override
	public Class29 method7469(@OriginalArg(1) Class43 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lclient!r;BII)Z")
	@Override
	public boolean method7474(@OriginalArg(0) Class43 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class109 local6 = arg0.method7142();
		local6.NA(super.anInt8975, super.anInt8977 - 10, super.anInt8980);
		@Pc(33) Class57 local33 = Static517.aClass145_1.method3798(this.anInt9007).method7316(null, 131072, -1, 0, arg0, 0, this.anInt8998, null);
		if (local33 != null && (Static225.aBoolean335 ? local33.method7509(arg1, arg2, local6, true, Static354.anInt6136) : local33.method7507(arg1, arg2, local6, true))) {
			return true;
		}
		if (this.anInt9006 != -1) {
			local33 = Static517.aClass145_1.method3798(this.anInt9006).method7316(null, 131072, -1, 0, arg0, 0, this.anInt8997, null);
			if (local33 != null && (Static225.aBoolean335 ? local33.method7509(arg1, arg2, local6, true, Static354.anInt6136) : local33.method7507(arg1, arg2, local6, true))) {
				return true;
			}
		}
		if (this.anInt8994 != -1) {
			local33 = Static517.aClass145_1.method3798(this.anInt8994).method7316(null, 131072, -1, 0, arg0, 0, this.anInt9003, null);
			if (local33 != null && (Static225.aBoolean335 ? local33.method7509(arg1, arg2, local6, true, Static354.anInt6136) : local33.method7507(arg1, arg2, local6, true))) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vi", name = "f", descriptor = "(I)I")
	@Override
	public int method7478() {
		return -10;
	}

	@OriginalMember(owner = "client!vi", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7473() {
		return this.aBoolean703;
	}

	@OriginalMember(owner = "client!vi", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method7481() {
		return false;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZLclient!r;)V")
	@Override
	public void method7471(@OriginalArg(1) Class43 arg0) {
	}

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "(Z)I")
	@Override
	public int method7482(@OriginalArg(0) boolean arg0) {
		return arg0 ? this.anInt8993 : -69;
	}
}
