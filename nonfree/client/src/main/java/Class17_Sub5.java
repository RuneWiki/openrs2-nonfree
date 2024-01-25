import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class17_Sub5 extends Class17 {

	@OriginalMember(owner = "client!l", name = "k", descriptor = "I")
	private int anInt3704;

	@OriginalMember(owner = "client!l", name = "n", descriptor = "I")
	public int anInt3705;

	@OriginalMember(owner = "client!l", name = "q", descriptor = "I")
	private int anInt3708;

	@OriginalMember(owner = "client!l", name = "v", descriptor = "I")
	private int anInt3710;

	@OriginalMember(owner = "client!l", name = "x", descriptor = "I")
	private int anInt3712;

	@OriginalMember(owner = "client!l", name = "z", descriptor = "I")
	private int anInt3714;

	@OriginalMember(owner = "client!l", name = "A", descriptor = "I")
	private int anInt3715;

	@OriginalMember(owner = "client!l", name = "B", descriptor = "I")
	private int anInt3716;

	@OriginalMember(owner = "client!l", name = "C", descriptor = "I")
	private int anInt3717;

	@OriginalMember(owner = "client!l", name = "D", descriptor = "I")
	private int anInt3718;

	@OriginalMember(owner = "client!l", name = "E", descriptor = "I")
	private int anInt3719;

	@OriginalMember(owner = "client!l", name = "G", descriptor = "I")
	private int anInt3720;

	@OriginalMember(owner = "client!l", name = "H", descriptor = "I")
	public int anInt3721;

	@OriginalMember(owner = "client!l", name = "M", descriptor = "I")
	private int anInt3723;

	@OriginalMember(owner = "client!l", name = "O", descriptor = "I")
	public int anInt3725;

	@OriginalMember(owner = "client!l", name = "P", descriptor = "I")
	private int anInt3726;

	@OriginalMember(owner = "client!l", name = "Q", descriptor = "I")
	private int anInt3727;

	@OriginalMember(owner = "client!l", name = "S", descriptor = "I")
	public int anInt3729;

	@OriginalMember(owner = "client!l", name = "U", descriptor = "I")
	private int anInt3731;

	@OriginalMember(owner = "client!l", name = "V", descriptor = "I")
	private int anInt3732;

	@OriginalMember(owner = "client!l", name = "w", descriptor = "I")
	private int anInt3711 = 0;

	@OriginalMember(owner = "client!l", name = "J", descriptor = "Z")
	private boolean aBoolean309 = false;

	@OriginalMember(owner = "client!l", name = "t", descriptor = "Z")
	public boolean aBoolean308 = false;

	@OriginalMember(owner = "client!l", name = "u", descriptor = "Lclient!dp;")
	public final Class17_Sub3 aClass17_Sub3_5;

	@OriginalMember(owner = "client!l", name = "l", descriptor = "J")
	private final long aLong130;

	@OriginalMember(owner = "client!l", name = "m", descriptor = "Lclient!md;")
	public final Class125 aClass125_1;

	@OriginalMember(owner = "client!l", name = "W", descriptor = "Lclient!hi;")
	public Class91 aClass91_1;

	@OriginalMember(owner = "client!l", name = "K", descriptor = "Lclient!um;")
	public final Class204 aClass204_8;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lclient!vm;Lclient!md;Lclient!dp;J)V")
	public Class17_Sub5(@OriginalArg(0) Class92 arg0, @OriginalArg(1) Class125 arg1, @OriginalArg(2) Class17_Sub3 arg2, @OriginalArg(3) long arg3) {
		this.aClass17_Sub3_5 = arg2;
		this.aLong130 = arg3;
		this.aClass125_1 = arg1;
		this.aClass91_1 = Static69.method1296(this.aClass125_1.anInt4076);
		if (!arg0.method4516() && this.aClass91_1.anInt2511 != -1) {
			this.aClass91_1 = Static69.method1296(this.aClass91_1.anInt2511);
		}
		this.aClass204_8 = new Class204();
		this.anInt3711 = (int) ((double) this.anInt3711 + Math.random() * 64.0D);
		this.method3167();
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IJ)V")
	public void method3163(@OriginalArg(1) long arg0) {
		for (@Pc(7) Class17_Sub7_Sub1_Sub1 local7 = (Class17_Sub7_Sub1_Sub1) this.aClass204_8.method5359(); local7 != null; local7 = (Class17_Sub7_Sub1_Sub1) this.aClass204_8.method5357()) {
			local7.method5487(arg0);
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(BJIZLclient!vm;)V")
	public void method3166(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class92 arg3) {
		@Pc(50) int local50;
		if (this.aBoolean308) {
			arg2 = false;
		} else if (Static158.anInt3553 < this.aClass91_1.anInt2529) {
			arg2 = false;
		} else if (Static126.anIntArray261[Static158.anInt3553] < Static214.anInt4453) {
			arg2 = false;
		} else if (this.aBoolean309) {
			arg2 = false;
		} else if (this.aClass91_1.anInt2532 != -1) {
			local50 = (int) (arg0 - this.aLong130);
			if (this.aClass91_1.aBoolean218 || local50 <= this.aClass91_1.anInt2532) {
				local50 %= this.aClass91_1.anInt2532;
			} else {
				arg2 = false;
			}
			if (!this.aClass91_1.aBoolean217 && this.aClass91_1.anInt2520 > local50) {
				arg2 = false;
			}
			if (this.aClass91_1.aBoolean217 && local50 >= this.aClass91_1.anInt2520) {
				arg2 = false;
			}
		}
		if (arg2) {
			this.anInt3711 += (int) ((double) arg1 * ((double) this.aClass91_1.anInt2531 + Math.random() * (double) (this.aClass91_1.anInt2493 - this.aClass91_1.anInt2531)));
			if (this.anInt3711 > 63) {
				local50 = this.anInt3711 >> 6;
				this.anInt3711 &= 0x3F;
				for (@Pc(157) int local157 = 0; local157 < local50; local157++) {
					@Pc(176) int local176;
					@Pc(179) int local179;
					@Pc(173) int local173;
					@Pc(191) int local191;
					@Pc(199) int local199;
					@Pc(203) int local203;
					@Pc(214) int local214;
					@Pc(222) int local222;
					@Pc(226) int local226;
					if (this.aClass91_1.aShort43 <= 0 && this.aClass91_1.aShort40 <= 0) {
						local173 = this.anInt3704;
						local176 = this.anInt3708;
						local179 = this.anInt3720;
					} else {
						local191 = this.anInt3712 + (int) ((double) this.anInt3727 * Math.random());
						@Pc(195) int local195 = local191 & 0x3FFF;
						local199 = Class4_Sub4_Sub25.anIntArray384[local195];
						local203 = Class4_Sub4_Sub25.anIntArray383[local195];
						local214 = this.anInt3723 + (int) (Math.random() * (double) this.anInt3719);
						@Pc(218) int local218 = local214 & 0x1FFF;
						local222 = Class4_Sub4_Sub25.anIntArray384[local218];
						local226 = Class4_Sub4_Sub25.anIntArray383[local218];
						local176 = local203 * local222 >> 15;
						local173 = local222 * local199 >> 15;
						local179 = local226 * -1;
					}
					local191 = (int) (Math.random() * 65535.0D);
					local199 = (int) (Math.random() * 65535.0D);
					if (local191 + local199 > 65535) {
						local199 = 65535 - local199;
						local191 = 65535 - local191;
					}
					local203 = 65535 - local191 - local199;
					local214 = local199 * this.anInt3715 + local191 * this.anInt3731 + this.anInt3726 * local203 >> 16;
					local222 = this.anInt3717 * local203 + this.anInt3732 * local199 + local191 * this.anInt3710 >> 16;
					local226 = local203 * this.anInt3714 + local191 * this.anInt3716 + local199 * this.anInt3718 >> 16;
					@Pc(344) int local344 = (int) ((double) (this.aClass91_1.anInt2533 - this.aClass91_1.anInt2535) * Math.random()) + this.aClass91_1.anInt2535;
					@Pc(361) int local361 = (int) (Math.random() * (double) (this.aClass91_1.anInt2507 - this.aClass91_1.anInt2484)) + this.aClass91_1.anInt2484;
					@Pc(378) int local378 = (int) ((double) (this.aClass91_1.anInt2526 - this.aClass91_1.anInt2505) * Math.random()) + this.aClass91_1.anInt2505;
					@Pc(440) int local440;
					if (this.aClass91_1.aBoolean216) {
						@Pc(444) double local444 = Math.random();
						local440 = (int) ((double) this.aClass91_1.anInt2512 + local444 * (double) this.aClass91_1.anInt2485) << 24 | (int) (local444 * (double) this.aClass91_1.anInt2491 + (double) this.aClass91_1.anInt2494) << 8 | (int) ((double) this.aClass91_1.anInt2502 * local444 + (double) this.aClass91_1.anInt2504) << 16 | (int) ((double) this.aClass91_1.anInt2490 * local444 + (double) this.aClass91_1.anInt2518);
					} else {
						local440 = (int) (Math.random() * (double) this.aClass91_1.anInt2485 + (double) this.aClass91_1.anInt2512) << 24 | (int) (Math.random() * (double) this.aClass91_1.anInt2491 + (double) this.aClass91_1.anInt2494) << 8 | (int) ((double) this.aClass91_1.anInt2502 * Math.random() + (double) this.aClass91_1.anInt2504) << 16 | (int) ((double) this.aClass91_1.anInt2518 + Math.random() * (double) this.aClass91_1.anInt2490);
					}
					@Pc(506) int local506 = this.aClass91_1.anInt2489;
					if (!arg3.method4516() && !this.aClass91_1.aBoolean214) {
						local506 = -1;
					}
					if (Static191.anInt4123 == Static219.anInt4567) {
						new Class17_Sub7_Sub1_Sub1(this, local214, local222, local226, local176, local179, local173, local344, local361, local440, local378, local506, this.aClass91_1.aBoolean213);
					} else {
						@Pc(547) Class17_Sub7_Sub1_Sub1 local547 = Static219.aClass17_Sub7_Sub1_Sub1Array2[Static191.anInt4123];
						Static191.anInt4123 = Static191.anInt4123 + 1 & 0x3FF;
						local547.method5486(this, local214, local222, local226, local176, local179, local173, local344, local361, local440, local378, local506, this.aClass91_1.aBoolean213);
					}
				}
			}
		}
		this.anInt3705 = 0;
		for (@Pc(595) Class17_Sub7_Sub1_Sub1 local595 = (Class17_Sub7_Sub1_Sub1) this.aClass204_8.method5359(); local595 != null; local595 = (Class17_Sub7_Sub1_Sub1) this.aClass204_8.method5357()) {
			local595.method5485(arg0, arg1);
			this.anInt3705++;
		}
		Static167.anInt3706 += this.anInt3705;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(B)V")
	public void method3167() {
		this.anInt3731 = this.aClass125_1.anInt4071;
		this.anInt3716 = this.aClass125_1.anInt4060;
		this.anInt3732 = this.aClass125_1.anInt4067;
		this.anInt3717 = this.aClass125_1.anInt4070;
		this.anInt3718 = this.aClass125_1.anInt4068;
		this.anInt3714 = this.aClass125_1.anInt4063;
		this.anInt3726 = this.aClass125_1.anInt4062;
		this.anInt3715 = this.aClass125_1.anInt4075;
		this.anInt3710 = this.aClass125_1.anInt4064;
		if (this.anInt3731 == this.anInt3715 && this.anInt3726 == this.anInt3715 && this.anInt3710 == this.anInt3732 && this.anInt3732 == this.anInt3717 && this.anInt3718 == this.anInt3716 && this.anInt3714 == this.anInt3718) {
			this.aBoolean309 = true;
			return;
		}
		this.aBoolean309 = false;
		@Pc(114) int local114 = (this.anInt3726 + this.anInt3731 + this.anInt3715) / 3;
		@Pc(126) int local126 = (this.anInt3732 + this.anInt3710 + this.anInt3717) / 3;
		@Pc(137) int local137 = (this.anInt3718 + this.anInt3716 + this.anInt3714) / 3;
		if (local114 == this.anInt3721 && local126 == this.anInt3725 && local137 == this.anInt3729) {
			return;
		}
		this.anInt3729 = local137;
		this.anInt3725 = local126;
		this.anInt3721 = local114;
		@Pc(170) int local170 = this.anInt3715 - this.anInt3731;
		@Pc(177) int local177 = this.anInt3732 - this.anInt3710;
		@Pc(183) int local183 = this.anInt3718 - this.anInt3716;
		@Pc(189) int local189 = this.anInt3726 - this.anInt3731;
		@Pc(195) int local195 = this.anInt3717 - this.anInt3710;
		@Pc(202) int local202 = this.anInt3714 - this.anInt3716;
		this.anInt3708 = local202 * local177 - local195 * local183;
		this.anInt3704 = local170 * local195 - local177 * local189;
		this.anInt3720 = local183 * local189 - local202 * local170;
		while (this.anInt3708 > 32767 || this.anInt3720 > 32767 || this.anInt3704 > 32767 || this.anInt3708 < -32767 || this.anInt3720 < -32767 || this.anInt3704 < -32767) {
			this.anInt3720 >>= 0x1;
			this.anInt3704 >>= 0x1;
			this.anInt3708 >>= 0x1;
		}
		@Pc(297) int local297 = (int) Math.sqrt((double) (this.anInt3704 * this.anInt3704 + this.anInt3720 * this.anInt3720 + this.anInt3708 * this.anInt3708));
		if (local297 <= 0) {
			local297 = 1;
		}
		this.anInt3708 = this.anInt3708 * 32767 / local297;
		this.anInt3704 = this.anInt3704 * 32767 / local297;
		this.anInt3720 = this.anInt3720 * 32767 / local297;
		if (this.aClass91_1.aShort43 <= 0 && this.aClass91_1.aShort40 <= 0) {
			return;
		}
		@Pc(344) int local344 = (int) (Math.atan2((double) this.anInt3704, (double) this.anInt3708) * 2607.5945876176133D);
		@Pc(365) int local365 = (int) (Math.atan2((double) this.anInt3720, Math.sqrt((double) (this.anInt3704 * this.anInt3704 + this.anInt3708 * this.anInt3708))) * 2607.5945876176133D);
		this.anInt3727 = this.aClass91_1.aShort43 - this.aClass91_1.aShort41;
		this.anInt3719 = this.aClass91_1.aShort40 - this.aClass91_1.aShort42;
		this.anInt3712 = this.aClass91_1.aShort41 + local344 - (this.anInt3727 >> 1);
		this.anInt3723 = local365 + this.aClass91_1.aShort42 - (this.anInt3719 >> 1);
	}
}
