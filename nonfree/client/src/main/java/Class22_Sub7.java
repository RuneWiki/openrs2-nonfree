import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class22_Sub7 extends Class22 {

	@OriginalMember(owner = "client!me", name = "l", descriptor = "I")
	private int anInt3958;

	@OriginalMember(owner = "client!me", name = "m", descriptor = "I")
	private int anInt3959;

	@OriginalMember(owner = "client!me", name = "n", descriptor = "I")
	public int anInt3960;

	@OriginalMember(owner = "client!me", name = "p", descriptor = "I")
	public int anInt3961;

	@OriginalMember(owner = "client!me", name = "q", descriptor = "I")
	public int anInt3962;

	@OriginalMember(owner = "client!me", name = "s", descriptor = "I")
	private int anInt3964;

	@OriginalMember(owner = "client!me", name = "t", descriptor = "I")
	private int anInt3965;

	@OriginalMember(owner = "client!me", name = "A", descriptor = "I")
	private int anInt3972;

	@OriginalMember(owner = "client!me", name = "B", descriptor = "I")
	private int anInt3973;

	@OriginalMember(owner = "client!me", name = "C", descriptor = "I")
	private int anInt3974;

	@OriginalMember(owner = "client!me", name = "F", descriptor = "I")
	private int anInt3976;

	@OriginalMember(owner = "client!me", name = "H", descriptor = "I")
	private int anInt3977;

	@OriginalMember(owner = "client!me", name = "K", descriptor = "I")
	private int anInt3978;

	@OriginalMember(owner = "client!me", name = "L", descriptor = "I")
	private int anInt3979;

	@OriginalMember(owner = "client!me", name = "M", descriptor = "I")
	private int anInt3980;

	@OriginalMember(owner = "client!me", name = "O", descriptor = "I")
	private int anInt3981;

	@OriginalMember(owner = "client!me", name = "R", descriptor = "I")
	private int anInt3983;

	@OriginalMember(owner = "client!me", name = "T", descriptor = "I")
	private int anInt3984;

	@OriginalMember(owner = "client!me", name = "U", descriptor = "I")
	private int anInt3985;

	@OriginalMember(owner = "client!me", name = "W", descriptor = "I")
	public int anInt3986;

	@OriginalMember(owner = "client!me", name = "i", descriptor = "Z")
	private boolean aBoolean297 = false;

	@OriginalMember(owner = "client!me", name = "x", descriptor = "I")
	private int anInt3969 = 0;

	@OriginalMember(owner = "client!me", name = "D", descriptor = "Z")
	public boolean aBoolean298 = false;

	@OriginalMember(owner = "client!me", name = "o", descriptor = "J")
	private final long aLong134;

	@OriginalMember(owner = "client!me", name = "I", descriptor = "Lclient!m;")
	public final Class22_Sub6 aClass22_Sub6_5;

	@OriginalMember(owner = "client!me", name = "N", descriptor = "Lclient!qm;")
	public final Class191 aClass191_1;

	@OriginalMember(owner = "client!me", name = "V", descriptor = "Lclient!q;")
	public Class183 aClass183_1;

	@OriginalMember(owner = "client!me", name = "J", descriptor = "Lclient!du;")
	public final Class56 aClass56_6;

	static {
		new Class221("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
	}

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!km;Lclient!qm;Lclient!m;J)V")
	public Class22_Sub7(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class191 arg1, @OriginalArg(2) Class22_Sub6 arg2, @OriginalArg(3) long arg3) {
		this.aLong134 = arg3;
		this.aClass22_Sub6_5 = arg2;
		this.aClass191_1 = arg1;
		this.aClass183_1 = Static200.method3345(this.aClass191_1.anInt5268);
		if (!arg0.method4502() && this.aClass183_1.anInt5069 != -1) {
			this.aClass183_1 = Static200.method3345(this.aClass183_1.anInt5069);
		}
		this.aClass56_6 = new Class56();
		this.anInt3969 = (int) ((double) this.anInt3969 + Math.random() * 64.0D);
		this.method3633();
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Z)V")
	public void method3633() {
		this.anInt3965 = this.aClass191_1.anInt5279;
		this.anInt3973 = this.aClass191_1.anInt5283;
		this.anInt3964 = this.aClass191_1.anInt5284;
		this.anInt3958 = this.aClass191_1.anInt5280;
		this.anInt3972 = this.aClass191_1.anInt5276;
		this.anInt3974 = this.aClass191_1.anInt5282;
		this.anInt3984 = this.aClass191_1.anInt5277;
		this.anInt3978 = this.aClass191_1.anInt5269;
		this.anInt3977 = this.aClass191_1.anInt5274;
		if (this.anInt3972 == this.anInt3958 && this.anInt3977 == this.anInt3972 && this.anInt3978 == this.anInt3973 && this.anInt3965 == this.anInt3978 && this.anInt3984 == this.anInt3974 && this.anInt3964 == this.anInt3984) {
			this.aBoolean297 = true;
			return;
		}
		this.aBoolean297 = false;
		@Pc(111) int local111 = (this.anInt3958 + this.anInt3972 + this.anInt3977) / 3;
		@Pc(122) int local122 = (this.anInt3965 + this.anInt3978 + this.anInt3973) / 3;
		@Pc(142) int local142 = (this.anInt3964 + this.anInt3984 + this.anInt3974) / 3;
		if (this.anInt3986 == local111 && this.anInt3961 == local122 && local142 == this.anInt3960) {
			return;
		}
		this.anInt3960 = local142;
		this.anInt3961 = local122;
		this.anInt3986 = local111;
		@Pc(174) int local174 = this.anInt3972 - this.anInt3958;
		@Pc(181) int local181 = this.anInt3978 - this.anInt3973;
		@Pc(188) int local188 = this.anInt3984 - this.anInt3974;
		@Pc(195) int local195 = this.anInt3977 - this.anInt3958;
		@Pc(202) int local202 = this.anInt3965 - this.anInt3973;
		@Pc(209) int local209 = this.anInt3964 - this.anInt3974;
		this.anInt3981 = local195 * local188 - local174 * local209;
		this.anInt3959 = local181 * local209 - local202 * local188;
		this.anInt3979 = local202 * local174 - local181 * local195;
		while (this.anInt3959 > 32767 || this.anInt3981 > 32767 || this.anInt3979 > 32767 || this.anInt3959 < -32767 || this.anInt3981 < -32767 || this.anInt3979 < -32767) {
			this.anInt3979 >>= 0x1;
			this.anInt3981 >>= 0x1;
			this.anInt3959 >>= 0x1;
		}
		@Pc(313) int local313 = (int) Math.sqrt((double) (this.anInt3979 * this.anInt3979 + this.anInt3959 * this.anInt3959 + this.anInt3981 * this.anInt3981));
		if (local313 <= 0) {
			local313 = 1;
		}
		this.anInt3979 = this.anInt3979 * 32767 / local313;
		this.anInt3981 = this.anInt3981 * 32767 / local313;
		this.anInt3959 = this.anInt3959 * 32767 / local313;
		if (this.aClass183_1.aShort74 <= 0 && this.aClass183_1.aShort73 <= 0) {
			return;
		}
		@Pc(363) int local363 = (int) (Math.atan2((double) this.anInt3979, (double) this.anInt3959) * 2607.5945876176133D);
		@Pc(385) int local385 = (int) (Math.atan2((double) this.anInt3981, Math.sqrt((double) (this.anInt3959 * this.anInt3959 + this.anInt3979 * this.anInt3979))) * 2607.5945876176133D);
		this.anInt3983 = this.aClass183_1.aShort74 - this.aClass183_1.aShort71;
		this.anInt3976 = this.aClass183_1.aShort73 - this.aClass183_1.aShort72;
		this.anInt3985 = this.aClass183_1.aShort71 + local363 - (this.anInt3983 >> 1);
		this.anInt3980 = local385 + this.aClass183_1.aShort72 - (this.anInt3976 >> 1);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ZJ)V")
	public void method3634(@OriginalArg(1) long arg0) {
		for (@Pc(16) Class22_Sub4_Sub1_Sub1 local16 = (Class22_Sub4_Sub1_Sub1) this.aClass56_6.method1259(); local16 != null; local16 = (Class22_Sub4_Sub1_Sub1) this.aClass56_6.method1254()) {
			local16.method3666(arg0);
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!km;JIZI)V")
	public void method3637(@OriginalArg(0) Class82 arg0, @OriginalArg(1) long arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(50) int local50;
		if (this.aBoolean298) {
			arg2 = false;
		} else if (Static344.anInt6324 < this.aClass183_1.anInt5053) {
			arg2 = false;
		} else if (Static84.anIntArray215[Static344.anInt6324] < Static110.anInt2200) {
			arg2 = false;
		} else if (this.aBoolean297) {
			arg2 = false;
		} else if (this.aClass183_1.anInt5074 != -1) {
			local50 = (int) (arg1 - this.aLong134);
			if (this.aClass183_1.aBoolean374 || local50 <= this.aClass183_1.anInt5074) {
				local50 %= this.aClass183_1.anInt5074;
			} else {
				arg2 = false;
			}
			if (!this.aClass183_1.aBoolean370 && this.aClass183_1.anInt5071 > local50) {
				arg2 = false;
			}
			if (this.aClass183_1.aBoolean370 && local50 >= this.aClass183_1.anInt5071) {
				arg2 = false;
			}
		}
		if (arg2) {
			this.anInt3969 += (int) ((double) arg3 * ((double) this.aClass183_1.anInt5046 + Math.random() * (double) (this.aClass183_1.anInt5077 - this.aClass183_1.anInt5046)));
			if (this.anInt3969 > 63) {
				local50 = this.anInt3969 >> 6;
				this.anInt3969 &= 0x3F;
				for (@Pc(154) int local154 = 0; local154 < local50; local154++) {
					@Pc(210) int local210;
					@Pc(224) int local224;
					@Pc(220) int local220;
					@Pc(174) int local174;
					@Pc(182) int local182;
					@Pc(186) int local186;
					@Pc(196) int local196;
					@Pc(204) int local204;
					@Pc(214) int local214;
					if (this.aClass183_1.aShort74 <= 0 && this.aClass183_1.aShort73 <= 0) {
						local220 = this.anInt3979;
						local210 = this.anInt3959;
						local224 = this.anInt3981;
					} else {
						local174 = (int) (Math.random() * (double) this.anInt3983) + this.anInt3985;
						@Pc(178) int local178 = local174 & 0x3FFF;
						local182 = Class104.anIntArray705[local178];
						local186 = Class104.anIntArray706[local178];
						local196 = this.anInt3980 + (int) ((double) this.anInt3976 * Math.random());
						@Pc(200) int local200 = local196 & 0x1FFF;
						local204 = Class104.anIntArray705[local200];
						local210 = local186 * local204 >> 15;
						local214 = Class104.anIntArray706[local200];
						local220 = local204 * local182 >> 15;
						local224 = local214 * -1;
					}
					local174 = (int) (Math.random() * 65535.0D);
					local182 = (int) (Math.random() * 65535.0D);
					if (local174 + local182 > 65535) {
						local182 = 65535 - local182;
						local174 = 65535 - local174;
					}
					local186 = 65535 - local174 - local182;
					local196 = local174 * this.anInt3958 + local182 * this.anInt3972 + local186 * this.anInt3977 >> 16;
					local204 = local186 * this.anInt3965 + local182 * this.anInt3978 + this.anInt3973 * local174 >> 16;
					local214 = local186 * this.anInt3964 + local182 * this.anInt3984 + this.anInt3974 * local174 >> 16;
					@Pc(336) int local336 = this.aClass183_1.anInt5070 + (int) (Math.random() * (double) (this.aClass183_1.anInt5060 - this.aClass183_1.anInt5070));
					@Pc(354) int local354 = this.aClass183_1.anInt5088 + (int) ((double) (this.aClass183_1.anInt5080 - this.aClass183_1.anInt5088) * Math.random());
					@Pc(371) int local371 = this.aClass183_1.anInt5075 + (int) ((double) (this.aClass183_1.anInt5082 - this.aClass183_1.anInt5075) * Math.random());
					@Pc(433) int local433;
					if (this.aClass183_1.aBoolean372) {
						@Pc(437) double local437 = Math.random();
						local433 = (int) ((double) this.aClass183_1.anInt5092 + local437 * (double) this.aClass183_1.anInt5057) | (int) ((double) this.aClass183_1.anInt5086 * local437 + (double) this.aClass183_1.anInt5049) << 8 | (int) ((double) this.aClass183_1.anInt5050 * local437 + (double) this.aClass183_1.anInt5072) << 16 | (int) ((double) this.aClass183_1.anInt5094 + (double) this.aClass183_1.anInt5081 * Math.random()) << 24;
					} else {
						local433 = (int) ((double) this.aClass183_1.anInt5094 + Math.random() * (double) this.aClass183_1.anInt5081) << 24 | (int) ((double) this.aClass183_1.anInt5092 + Math.random() * (double) this.aClass183_1.anInt5057) | (int) ((double) this.aClass183_1.anInt5050 * Math.random() + (double) this.aClass183_1.anInt5072) << 16 | (int) (Math.random() * (double) this.aClass183_1.anInt5086 + (double) this.aClass183_1.anInt5049) << 8;
					}
					@Pc(499) int local499 = this.aClass183_1.anInt5095;
					if (!arg0.method4502() && !this.aClass183_1.lb) {
						local499 = -1;
					}
					if (Static110.anInt2197 == Static55.anInt1143) {
						new Class22_Sub4_Sub1_Sub1(this, local196, local204, local214, local210, local224, local220, local336, local354, local433, local371, local499, this.aClass183_1.aBoolean373);
					} else {
						@Pc(519) Class22_Sub4_Sub1_Sub1 local519 = Static48.aClass22_Sub4_Sub1_Sub1Array1[Static110.anInt2197];
						Static110.anInt2197 = Static110.anInt2197 + 1 & 0x3FF;
						local519.method3663(this, local196, local204, local214, local210, local224, local220, local336, local354, local433, local371, local499, this.aClass183_1.aBoolean373);
					}
				}
			}
		}
		this.anInt3962 = 0;
		for (@Pc(580) Class22_Sub4_Sub1_Sub1 local580 = (Class22_Sub4_Sub1_Sub1) this.aClass56_6.method1259(); local580 != null; local580 = (Class22_Sub4_Sub1_Sub1) this.aClass56_6.method1254()) {
			local580.method3665(arg1, arg3);
			this.anInt3962++;
		}
		Class12_Sub1_Sub4.lb += this.anInt3962;
	}
}
