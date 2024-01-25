import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fp")
public final class Class6_Sub4 extends Class6 {

	@OriginalMember(owner = "client!fp", name = "s", descriptor = "I")
	public int anInt3038;

	@OriginalMember(owner = "client!fp", name = "y", descriptor = "I")
	private int anInt3041;

	@OriginalMember(owner = "client!fp", name = "A", descriptor = "I")
	private int anInt3042;

	@OriginalMember(owner = "client!fp", name = "C", descriptor = "I")
	private int anInt3044;

	@OriginalMember(owner = "client!fp", name = "D", descriptor = "I")
	private int anInt3045;

	@OriginalMember(owner = "client!fp", name = "E", descriptor = "I")
	private int anInt3046;

	@OriginalMember(owner = "client!fp", name = "F", descriptor = "I")
	private int anInt3047;

	@OriginalMember(owner = "client!fp", name = "G", descriptor = "I")
	private int anInt3048;

	@OriginalMember(owner = "client!fp", name = "r", descriptor = "Z")
	public boolean aBoolean248 = false;

	@OriginalMember(owner = "client!fp", name = "w", descriptor = "I")
	private int anInt3040 = 0;

	@OriginalMember(owner = "client!fp", name = "l", descriptor = "Lclient!hs;")
	public Class146 aClass146_1 = new Class146();

	@OriginalMember(owner = "client!fp", name = "x", descriptor = "Lclient!hs;")
	private Class146 aClass146_2 = new Class146();

	@OriginalMember(owner = "client!fp", name = "z", descriptor = "Z")
	private boolean aBoolean249 = false;

	@OriginalMember(owner = "client!fp", name = "t", descriptor = "Lclient!tq;")
	public final Class6_Sub8 aClass6_Sub8_4;

	@OriginalMember(owner = "client!fp", name = "h", descriptor = "Lclient!hi;")
	public final Class139 aClass139_1;

	@OriginalMember(owner = "client!fp", name = "m", descriptor = "J")
	private final long aLong86;

	@OriginalMember(owner = "client!fp", name = "o", descriptor = "Lclient!ce;")
	public Class51 aClass51_1;

	@OriginalMember(owner = "client!fp", name = "v", descriptor = "Lclient!fca;")
	public final Class109 aClass109_4;

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(Lclient!r;Lclient!hi;Lclient!tq;J)V")
	public Class6_Sub4(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class139 arg1, @OriginalArg(2) Class6_Sub8 arg2, @OriginalArg(3) long arg3) {
		this.aClass6_Sub8_4 = arg2;
		this.aClass139_1 = arg1;
		this.aLong86 = arg3;
		this.aClass51_1 = this.aClass139_1.method3253();
		if (!arg0.method6206() && this.aClass51_1.anInt1343 != -1) {
			this.aClass51_1 = Static496.method6943(this.aClass51_1.anInt1343);
		}
		this.aClass109_4 = new Class109();
		this.anInt3040 = (int) ((double) this.anInt3040 + Math.random() * 64.0D);
		this.method2468();
		this.aClass146_2.anInt4012 = this.aClass146_1.anInt4012;
		this.aClass146_2.anInt4005 = this.aClass146_1.anInt4005;
		this.aClass146_2.anInt4009 = this.aClass146_1.anInt4009;
		this.aClass146_2.anInt4008 = this.aClass146_1.anInt4008;
		this.aClass146_2.anInt4010 = this.aClass146_1.anInt4010;
		this.aClass146_2.anInt4017 = this.aClass146_1.anInt4017;
		this.aClass146_2.anInt4016 = this.aClass146_1.anInt4016;
		this.aClass146_2.anInt4015 = this.aClass146_1.anInt4015;
		this.aClass146_2.anInt4007 = this.aClass146_1.anInt4007;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(ZLclient!r;IJI)V")
	public void method2466(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class100 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(34) int local34;
		if (this.aBoolean248) {
			arg0 = false;
		} else if (Static206.anInt3999 < this.aClass51_1.anInt1310) {
			arg0 = false;
		} else if (Static116.anIntArray142[Static206.anInt3999] < Static220.anInt4155) {
			arg0 = false;
		} else if (this.aBoolean249) {
			arg0 = false;
		} else if (this.aClass51_1.anInt1350 != -1) {
			local34 = (int) (arg3 - this.aLong86);
			if (this.aClass51_1.aBoolean94 || this.aClass51_1.anInt1350 >= local34) {
				local34 %= this.aClass51_1.anInt1350;
			} else {
				arg0 = false;
			}
			if (!this.aClass51_1.aBoolean102 && local34 < this.aClass51_1.anInt1317) {
				arg0 = false;
			}
			if (this.aClass51_1.aBoolean102 && local34 >= this.aClass51_1.anInt1317) {
				arg0 = false;
			}
		}
		if (arg0) {
			Static564.anInt9223++;
			local34 = (this.aClass146_1.anInt4007 + this.aClass146_1.anInt4010 + this.aClass146_1.anInt4017) / 3;
			@Pc(130) int local130 = (this.aClass146_1.anInt4008 + this.aClass146_1.anInt4009 + this.aClass146_1.anInt4012) / 3;
			@Pc(144) int local144 = (this.aClass146_1.anInt4005 + this.aClass146_1.anInt4015 + this.aClass146_1.anInt4016) / 3;
			@Pc(188) int local188;
			@Pc(196) int local196;
			@Pc(205) int local205;
			@Pc(214) int local214;
			@Pc(222) int local222;
			@Pc(231) int local231;
			@Pc(335) int local335;
			@Pc(388) int local388;
			@Pc(410) int local410;
			if (this.aClass146_1.anInt4004 != local34 || this.aClass146_1.anInt4018 != local130 || local144 != this.aClass146_1.anInt4011) {
				this.aClass146_1.anInt4004 = local34;
				this.aClass146_1.anInt4018 = local130;
				this.aClass146_1.anInt4011 = local144;
				local188 = this.aClass146_1.anInt4017 - this.aClass146_1.anInt4010;
				local196 = this.aClass146_1.anInt4009 - this.aClass146_1.anInt4008;
				local205 = this.aClass146_1.anInt4015 - this.aClass146_1.anInt4016;
				local214 = this.aClass146_1.anInt4007 - this.aClass146_1.anInt4010;
				local222 = this.aClass146_1.anInt4012 - this.aClass146_1.anInt4008;
				local231 = this.aClass146_1.anInt4005 - this.aClass146_1.anInt4016;
				this.anInt3047 = local205 * local214 - local231 * local188;
				this.anInt3041 = local188 * local222 - local196 * local214;
				this.anInt3045 = local196 * local231 - local205 * local222;
				while (true) {
					if (this.anInt3045 <= 32767 && this.anInt3047 <= 32767 && this.anInt3041 <= 32767 && this.anInt3045 >= -32767 && this.anInt3047 >= -32767 && this.anInt3041 >= -32767) {
						local335 = (int) Math.sqrt((double) (this.anInt3045 * this.anInt3045 + this.anInt3047 * this.anInt3047 + this.anInt3041 * this.anInt3041));
						if (local335 <= 0) {
							local335 = 1;
						}
						this.anInt3045 = this.anInt3045 * 32767 / local335;
						this.anInt3041 = this.anInt3041 * 32767 / local335;
						this.anInt3047 = this.anInt3047 * 32767 / local335;
						if (this.aClass51_1.aShort22 > 0 || this.aClass51_1.aShort23 > 0) {
							local388 = (int) (Math.atan2((double) this.anInt3041, (double) this.anInt3045) * 2607.5945876176133D);
							local410 = (int) (Math.atan2((double) this.anInt3047, Math.sqrt((double) (this.anInt3045 * this.anInt3045 + this.anInt3041 * this.anInt3041))) * 2607.5945876176133D);
							this.anInt3048 = this.aClass51_1.aShort22 - this.aClass51_1.aShort21;
							this.anInt3042 = this.aClass51_1.aShort23 - this.aClass51_1.aShort24;
							this.anInt3046 = this.aClass51_1.aShort21 + local388 - (this.anInt3048 >> 1);
							this.anInt3044 = this.aClass51_1.aShort24 + local410 - (this.anInt3042 >> 1);
						}
						break;
					}
					this.anInt3041 >>= 0x1;
					this.anInt3045 >>= 0x1;
					this.anInt3047 >>= 0x1;
				}
			}
			this.anInt3040 += (int) ((double) arg2 * ((double) (this.aClass51_1.anInt1319 - this.aClass51_1.anInt1351) * Math.random() + (double) this.aClass51_1.anInt1351));
			if (this.anInt3040 > 63) {
				local188 = this.anInt3040 >> 6;
				this.anInt3040 &= 0x3F;
				for (local222 = 0; local222 < local188; local222++) {
					@Pc(562) int local562;
					@Pc(566) int local566;
					if (this.aClass51_1.aShort22 <= 0 && this.aClass51_1.aShort23 <= 0) {
						local205 = this.anInt3047;
						local196 = this.anInt3045;
						local214 = this.anInt3041;
					} else {
						local231 = (int) ((double) this.anInt3048 * Math.random()) + this.anInt3046;
						local231 &= 0x3FFF;
						local335 = Class363.anIntArray697[local231];
						local388 = Class363.anIntArray698[local231];
						local410 = this.anInt3044 + (int) (Math.random() * (double) this.anInt3042);
						local410 &= 0x1FFF;
						local562 = Class363.anIntArray697[local410];
						local566 = Class363.anIntArray698[local410];
						local196 = local562 * local388 >> 13;
						local205 = (local566 << 1) * -1;
						local214 = local562 * local335 >> 13;
					}
					@Pc(589) float local589 = (float) Math.random();
					@Pc(592) float local592 = (float) Math.random();
					if (local589 + local592 > 1.0F) {
						local589 = 1.0F - local589;
						local592 = 1.0F - local592;
					}
					@Pc(614) float local614 = 1.0F - local589 - local592;
					local410 = (int) (local589 * (float) this.aClass146_1.anInt4010 + local592 * (float) this.aClass146_1.anInt4017 + (float) this.aClass146_1.anInt4007 * local614);
					local562 = (int) ((float) this.aClass146_1.anInt4012 * local614 + local592 * (float) this.aClass146_1.anInt4009 + local589 * (float) this.aClass146_1.anInt4008);
					local566 = (int) (local614 * (float) this.aClass146_1.anInt4005 + (float) this.aClass146_1.anInt4016 * local589 + local592 * (float) this.aClass146_1.anInt4015);
					@Pc(702) int local702 = (int) ((float) this.aClass146_2.anInt4017 * local592 + (float) this.aClass146_2.anInt4010 * local589 + local614 * (float) this.aClass146_2.anInt4007);
					@Pc(724) int local724 = (int) (local614 * (float) this.aClass146_2.anInt4012 + local592 * (float) this.aClass146_2.anInt4009 + (float) this.aClass146_2.anInt4008 * local589);
					@Pc(746) int local746 = (int) (local589 * (float) this.aClass146_2.anInt4016 + (float) this.aClass146_2.anInt4015 * local592 + (float) this.aClass146_2.anInt4005 * local614);
					@Pc(751) int local751 = local410 - local702;
					@Pc(756) int local756 = local562 - local724;
					@Pc(760) int local760 = local566 - local746;
					@Pc(769) int local769 = (int) ((double) local702 + (double) local751 * Math.random());
					@Pc(778) int local778 = (int) ((double) local756 * Math.random() + (double) local724);
					@Pc(787) int local787 = (int) ((double) local746 + Math.random() * (double) local760);
					@Pc(804) int local804 = this.aClass51_1.anInt1326 + (int) ((double) (this.aClass51_1.anInt1321 - this.aClass51_1.anInt1326) * Math.random());
					@Pc(820) int local820 = (int) ((double) (this.aClass51_1.anInt1338 - this.aClass51_1.anInt1327) * Math.random()) + this.aClass51_1.anInt1327;
					@Pc(836) int local836 = this.aClass51_1.anInt1325 + (int) (Math.random() * (double) (this.aClass51_1.anInt1309 - this.aClass51_1.anInt1325));
					@Pc(900) int local900;
					if (this.aClass51_1.aBoolean97) {
						@Pc(842) double local842 = Math.random();
						local900 = (int) ((double) this.aClass51_1.anInt1330 + local842 * (double) this.aClass51_1.anInt1324) | (int) ((double) this.aClass51_1.anInt1339 * local842 + (double) this.aClass51_1.anInt1320) << 16 | (int) (local842 * (double) this.aClass51_1.anInt1344 + (double) this.aClass51_1.anInt1342) << 8 | (int) (Math.random() * (double) this.aClass51_1.anInt1348 + (double) this.aClass51_1.anInt1333) << 24;
					} else {
						local900 = (int) ((double) this.aClass51_1.anInt1348 * Math.random() + (double) this.aClass51_1.anInt1333) << 24 | (int) ((double) this.aClass51_1.anInt1324 * Math.random() + (double) this.aClass51_1.anInt1330) | (int) ((double) this.aClass51_1.anInt1320 + Math.random() * (double) this.aClass51_1.anInt1339) << 16 | (int) ((double) this.aClass51_1.anInt1342 + (double) this.aClass51_1.anInt1344 * Math.random()) << 8;
					}
					@Pc(964) int local964 = this.aClass51_1.anInt1336;
					if (!arg1.method6206() && !this.aClass51_1.aBoolean100) {
						local964 = -1;
					}
					if (Static538.anInt8797 == Static497.anInt8371) {
						new Class6_Sub3_Sub1_Sub1(this, local769, local778, local787, local196, local205, local214, local804, local820, local900, local836, local964, this.aClass51_1.aBoolean96, this.aClass51_1.aBoolean101);
					} else {
						@Pc(1008) Class6_Sub3_Sub1_Sub1 local1008 = Static414.aClass6_Sub3_Sub1_Sub1Array30[Static538.anInt8797];
						Static538.anInt8797 = Static538.anInt8797 + 1 & 0x3FF;
						local1008.method2378(this, local769, local778, local787, local196, local205, local214, local804, local820, local900, local836, local964, this.aClass51_1.aBoolean96, this.aClass51_1.aBoolean101);
					}
				}
			}
		}
		if (!this.aClass146_1.method3326(this.aClass146_2)) {
			@Pc(1048) Class146 local1048 = this.aClass146_2;
			this.aClass146_2 = this.aClass146_1;
			this.aClass146_1 = local1048;
			this.aClass146_1.anInt4016 = this.aClass139_1.anInt3917;
			this.aClass146_1.anInt4017 = this.aClass139_1.anInt3909;
			this.aClass146_1.anInt4008 = this.aClass139_1.anInt3908;
			this.aClass146_1.anInt4007 = this.aClass139_1.anInt3923;
			this.aClass146_1.anInt4010 = this.aClass139_1.anInt3916;
			this.aClass146_1.anInt4012 = this.aClass139_1.anInt3920;
			this.aClass146_1.anInt4009 = this.aClass139_1.anInt3910;
			this.aClass146_1.anInt4005 = this.aClass139_1.anInt3919;
			this.aClass146_1.anInt4015 = this.aClass139_1.anInt3918;
		}
		this.anInt3038 = 0;
		for (@Pc(1126) Class6_Sub3_Sub1_Sub1 local1126 = (Class6_Sub3_Sub1_Sub1) this.aClass109_4.method2314(); local1126 != null; local1126 = (Class6_Sub3_Sub1_Sub1) this.aClass109_4.method2312()) {
			local1126.method2375(arg3, arg2);
			this.anInt3038++;
		}
		Static79.anInt1726 += this.anInt3038;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(ILclient!r;J)V")
	public void method2467(@OriginalArg(1) Class100 arg0, @OriginalArg(2) long arg1) {
		for (@Pc(15) Class6_Sub3_Sub1_Sub1 local15 = (Class6_Sub3_Sub1_Sub1) this.aClass109_4.method2314(); local15 != null; local15 = (Class6_Sub3_Sub1_Sub1) this.aClass109_4.method2312()) {
			local15.method2374(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V")
	public void method2468() {
		this.aClass146_1.anInt4015 = this.aClass139_1.anInt3918;
		this.aClass146_1.anInt4005 = this.aClass139_1.anInt3919;
		this.aClass146_1.anInt4008 = this.aClass139_1.anInt3908;
		this.aClass146_1.anInt4017 = this.aClass139_1.anInt3909;
		this.aClass146_1.anInt4016 = this.aClass139_1.anInt3917;
		this.aClass146_1.anInt4010 = this.aClass139_1.anInt3916;
		this.aClass146_1.anInt4012 = this.aClass139_1.anInt3920;
		this.aClass146_1.anInt4007 = this.aClass139_1.anInt3923;
		this.aClass146_1.anInt4009 = this.aClass139_1.anInt3910;
		if (this.aClass146_1.anInt4010 == this.aClass146_1.anInt4017 && this.aClass146_1.anInt4007 == this.aClass146_1.anInt4017 && this.aClass146_1.anInt4009 == this.aClass146_1.anInt4008 && this.aClass146_1.anInt4009 == this.aClass146_1.anInt4012 && this.aClass146_1.anInt4016 == this.aClass146_1.anInt4015 && this.aClass146_1.anInt4015 == this.aClass146_1.anInt4005) {
			this.aBoolean249 = true;
		} else if (this.aBoolean249) {
			this.aClass146_2.anInt4008 = this.aClass146_1.anInt4008;
			this.aClass146_2.anInt4007 = this.aClass146_1.anInt4007;
			this.aClass146_2.anInt4009 = this.aClass146_1.anInt4009;
			this.aClass146_2.anInt4015 = this.aClass146_1.anInt4015;
			this.aClass146_2.anInt4005 = this.aClass146_1.anInt4005;
			this.aClass146_2.anInt4010 = this.aClass146_1.anInt4010;
			this.aClass146_2.anInt4017 = this.aClass146_1.anInt4017;
			this.aBoolean249 = false;
			this.aClass146_2.anInt4012 = this.aClass146_1.anInt4012;
			this.aClass146_2.anInt4016 = this.aClass146_1.anInt4016;
		}
	}
}
