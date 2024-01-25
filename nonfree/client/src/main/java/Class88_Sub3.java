import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class88_Sub3 extends Class88 {

	@OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
	private int anInt4976;

	@OriginalMember(owner = "client!pj", name = "l", descriptor = "I")
	private int anInt4978;

	@OriginalMember(owner = "client!pj", name = "m", descriptor = "I")
	private int anInt4979;

	@OriginalMember(owner = "client!pj", name = "o", descriptor = "I")
	public int anInt4980;

	@OriginalMember(owner = "client!pj", name = "p", descriptor = "I")
	private int anInt4981;

	@OriginalMember(owner = "client!pj", name = "q", descriptor = "I")
	private int anInt4982;

	@OriginalMember(owner = "client!pj", name = "s", descriptor = "I")
	private int anInt4983;

	@OriginalMember(owner = "client!pj", name = "t", descriptor = "I")
	public int anInt4984;

	@OriginalMember(owner = "client!pj", name = "u", descriptor = "I")
	private int anInt4985;

	@OriginalMember(owner = "client!pj", name = "x", descriptor = "I")
	public int anInt4987;

	@OriginalMember(owner = "client!pj", name = "y", descriptor = "I")
	public int anInt4988;

	@OriginalMember(owner = "client!pj", name = "z", descriptor = "I")
	private int anInt4989;

	@OriginalMember(owner = "client!pj", name = "A", descriptor = "I")
	private int anInt4990;

	@OriginalMember(owner = "client!pj", name = "B", descriptor = "I")
	private int anInt4991;

	@OriginalMember(owner = "client!pj", name = "D", descriptor = "I")
	private int anInt4992;

	@OriginalMember(owner = "client!pj", name = "F", descriptor = "I")
	private int anInt4994;

	@OriginalMember(owner = "client!pj", name = "I", descriptor = "I")
	private int anInt4996;

	@OriginalMember(owner = "client!pj", name = "L", descriptor = "I")
	private int anInt4998;

	@OriginalMember(owner = "client!pj", name = "M", descriptor = "I")
	private int anInt4999;

	@OriginalMember(owner = "client!pj", name = "N", descriptor = "I")
	private int anInt5000;

	@OriginalMember(owner = "client!pj", name = "J", descriptor = "Z")
	private boolean aBoolean346 = false;

	@OriginalMember(owner = "client!pj", name = "v", descriptor = "I")
	private int anInt4986 = 0;

	@OriginalMember(owner = "client!pj", name = "r", descriptor = "Z")
	public boolean aBoolean345 = false;

	@OriginalMember(owner = "client!pj", name = "R", descriptor = "Lclient!od;")
	public final Class179 aClass179_2;

	@OriginalMember(owner = "client!pj", name = "j", descriptor = "J")
	private final long aLong161;

	@OriginalMember(owner = "client!pj", name = "Q", descriptor = "Lclient!td;")
	public final Class88_Sub6 aClass88_Sub6_4;

	@OriginalMember(owner = "client!pj", name = "H", descriptor = "Lclient!lv;")
	public Class156 aClass156_1;

	@OriginalMember(owner = "client!pj", name = "w", descriptor = "Lclient!hv;")
	public final Class107 aClass107_9;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Lclient!za;Lclient!od;Lclient!td;J)V")
	public Class88_Sub3(@OriginalArg(0) Class200 arg0, @OriginalArg(1) Class179 arg1, @OriginalArg(2) Class88_Sub6 arg2, @OriginalArg(3) long arg3) {
		this.aClass179_2 = arg1;
		this.aLong161 = arg3;
		this.aClass88_Sub6_4 = arg2;
		this.aClass156_1 = this.aClass179_2.method3676();
		if (!arg0.method5850() && this.aClass156_1.anInt4031 != -1) {
			this.aClass156_1 = Static216.method2865(this.aClass156_1.anInt4031);
		}
		this.aClass107_9 = new Class107();
		this.anInt4986 = (int) ((double) this.anInt4986 + Math.random() * 64.0D);
		this.method3949();
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(JB)V")
	public void method3943(@OriginalArg(0) long arg0) {
		for (@Pc(19) Class88_Sub1_Sub1_Sub1 local19 = (Class88_Sub1_Sub1_Sub1) this.aClass107_9.method2326(); local19 != null; local19 = (Class88_Sub1_Sub1_Sub1) this.aClass107_9.method2327()) {
			local19.method1919(arg0);
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IJLclient!za;ZB)V")
	public void method3945(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class200 arg2, @OriginalArg(3) boolean arg3) {
		if (this.aBoolean345) {
			arg3 = false;
		} else if (this.aClass156_1.anInt4036 > Static369.anInt6043) {
			arg3 = false;
		} else if (Static418.anIntArray476[Static369.anInt6043] < Static287.anInt4471) {
			arg3 = false;
		} else if (this.aBoolean346) {
			arg3 = false;
		} else if (this.aClass156_1.anInt4016 != -1) {
			@Pc(48) int local48 = (int) (arg1 - this.aLong161);
			if (this.aClass156_1.aBoolean262 || local48 <= this.aClass156_1.anInt4016) {
				local48 %= this.aClass156_1.anInt4016;
			} else {
				arg3 = false;
			}
			if (!this.aClass156_1.aBoolean258 && this.aClass156_1.anInt4013 > local48) {
				arg3 = false;
			}
			if (this.aClass156_1.aBoolean258 && this.aClass156_1.anInt4013 <= local48) {
				arg3 = false;
			}
		}
		if (arg3) {
			this.anInt4986 += (int) ((double) arg0 * ((double) (this.aClass156_1.anInt4015 - this.aClass156_1.anInt4037) * Math.random() + (double) this.aClass156_1.anInt4037));
			if (this.anInt4986 > 63) {
				@Pc(141) int local141 = this.anInt4986 >> 6;
				this.anInt4986 &= 0x3F;
				for (@Pc(149) int local149 = 0; local149 < local141; local149++) {
					@Pc(165) int local165;
					@Pc(162) int local162;
					@Pc(168) int local168;
					@Pc(180) int local180;
					@Pc(188) int local188;
					@Pc(192) int local192;
					@Pc(202) int local202;
					@Pc(210) int local210;
					@Pc(214) int local214;
					if (this.aClass156_1.aShort46 <= 0 && this.aClass156_1.aShort45 <= 0) {
						local162 = this.anInt4985;
						local165 = this.anInt4999;
						local168 = this.anInt4989;
					} else {
						local180 = (int) (Math.random() * (double) this.anInt4978) + this.anInt4994;
						@Pc(184) int local184 = local180 & 0x3FFF;
						local188 = Class30.anIntArray38[local184];
						local192 = Class30.anIntArray37[local184];
						local202 = (int) (Math.random() * (double) this.anInt4996) + this.anInt4982;
						@Pc(206) int local206 = local202 & 0x1FFF;
						local210 = Class30.anIntArray38[local206];
						local214 = Class30.anIntArray37[local206];
						local165 = local210 * local192 >> 15;
						local162 = (local214 << 0) * -1;
						local168 = local210 * local188 >> 15;
					}
					local180 = (int) (Math.random() * 65535.0D);
					local188 = (int) (Math.random() * 65535.0D);
					if (local180 + local188 > 65535) {
						local188 = 65535 - local188;
						local180 = 65535 - local180;
					}
					local192 = 65535 - local188 - local180;
					local202 = (int) ((long) local180 * (long) this.anInt4983 + (long) local188 * (long) this.anInt5000 + (long) this.anInt4991 * (long) local192 >> 16);
					local210 = (int) ((long) this.anInt4992 * (long) local180 + (long) this.anInt4976 * (long) local188 + (long) local192 * (long) this.anInt4998 >> 16);
					local214 = (int) ((long) local188 * (long) this.anInt4981 + (long) local180 * (long) this.anInt4979 + (long) local192 * (long) this.anInt4990 >> 16);
					@Pc(355) int local355 = (int) ((double) (this.aClass156_1.anInt4011 - this.aClass156_1.anInt4045) * Math.random()) + this.aClass156_1.anInt4045;
					@Pc(372) int local372 = this.aClass156_1.anInt4038 + (int) (Math.random() * (double) (this.aClass156_1.anInt4047 - this.aClass156_1.anInt4038));
					@Pc(389) int local389 = this.aClass156_1.anInt4001 + (int) ((double) (this.aClass156_1.anInt4026 - this.aClass156_1.anInt4001) * Math.random());
					@Pc(451) int local451;
					if (this.aClass156_1.aBoolean263) {
						@Pc(455) double local455 = Math.random();
						local451 = (int) ((double) this.aClass156_1.anInt4040 * Math.random() + (double) this.aClass156_1.anInt4019) << 24 | (int) ((double) this.aClass156_1.anInt4029 + (double) this.aClass156_1.anInt4051 * local455) | (int) ((double) this.aClass156_1.anInt4042 + local455 * (double) this.aClass156_1.anInt4018) << 16 | (int) ((double) this.aClass156_1.anInt4012 + (double) this.aClass156_1.anInt4050 * local455) << 8;
					} else {
						local451 = (int) (Math.random() * (double) this.aClass156_1.anInt4051 + (double) this.aClass156_1.anInt4029) | (int) ((double) this.aClass156_1.anInt4042 + Math.random() * (double) this.aClass156_1.anInt4018) << 16 | (int) (Math.random() * (double) this.aClass156_1.anInt4050 + (double) this.aClass156_1.anInt4012) << 8 | (int) ((double) this.aClass156_1.anInt4019 + Math.random() * (double) this.aClass156_1.anInt4040) << 24;
					}
					@Pc(517) int local517 = this.aClass156_1.anInt4024;
					if (!arg2.method5850() && !this.aClass156_1.aBoolean260) {
						local517 = -1;
					}
					if (Static243.anInt3933 == Static81.anInt1470) {
						new Class88_Sub1_Sub1_Sub1(this, local202, local210, local214, local165, local162, local168, local355, local372, local451, local389, local517, this.aClass156_1.aBoolean264, this.aClass156_1.aBoolean261);
					} else {
						@Pc(537) Class88_Sub1_Sub1_Sub1 local537 = Static459.aClass88_Sub1_Sub1_Sub1Array2[Static243.anInt3933];
						Static243.anInt3933 = Static243.anInt3933 + 1 & 0x3FF;
						local537.method1921(this, local202, local210, local214, local165, local162, local168, local355, local372, local451, local389, local517, this.aClass156_1.aBoolean264, this.aClass156_1.aBoolean261);
					}
				}
			}
		}
		this.anInt4984 = 0;
		for (@Pc(600) Class88_Sub1_Sub1_Sub1 local600 = (Class88_Sub1_Sub1_Sub1) this.aClass107_9.method2326(); local600 != null; local600 = (Class88_Sub1_Sub1_Sub1) this.aClass107_9.method2327()) {
			local600.method1920(arg1, arg0);
			this.anInt4984++;
		}
		Static48.anInt889 += this.anInt4984;
	}

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "(I)V")
	public void method3949() {
		this.anInt4998 = this.aClass179_2.anInt4633;
		this.anInt4981 = this.aClass179_2.anInt4626;
		this.anInt4983 = this.aClass179_2.anInt4621;
		this.anInt4979 = this.aClass179_2.anInt4622;
		this.anInt4976 = this.aClass179_2.anInt4637;
		this.anInt4992 = this.aClass179_2.anInt4634;
		this.anInt4990 = this.aClass179_2.anInt4636;
		this.anInt5000 = this.aClass179_2.anInt4632;
		this.anInt4991 = this.aClass179_2.anInt4627;
		if (this.anInt4983 == this.anInt5000 && this.anInt4991 == this.anInt5000 && this.anInt4976 == this.anInt4992 && this.anInt4976 == this.anInt4998 && this.anInt4979 == this.anInt4981 && this.anInt4981 == this.anInt4990) {
			this.aBoolean346 = true;
			return;
		}
		this.aBoolean346 = false;
		@Pc(114) int local114 = (this.anInt5000 + this.anInt4983 + this.anInt4991) / 3;
		@Pc(126) int local126 = (this.anInt4992 + this.anInt4976 + this.anInt4998) / 3;
		@Pc(138) int local138 = (this.anInt4990 + this.anInt4979 + this.anInt4981) / 3;
		if (local114 == this.anInt4980 && local126 == this.anInt4987 && this.anInt4988 == local138) {
			return;
		}
		this.anInt4988 = local138;
		this.anInt4980 = local114;
		this.anInt4987 = local126;
		@Pc(174) int local174 = this.anInt5000 - this.anInt4983;
		@Pc(181) int local181 = this.anInt4976 - this.anInt4992;
		@Pc(188) int local188 = this.anInt4981 - this.anInt4979;
		@Pc(195) int local195 = this.anInt4991 - this.anInt4983;
		@Pc(202) int local202 = this.anInt4998 - this.anInt4992;
		@Pc(209) int local209 = this.anInt4990 - this.anInt4979;
		this.anInt4989 = local202 * local174 - local181 * local195;
		this.anInt4985 = local188 * local195 - local174 * local209;
		for (this.anInt4999 = local181 * local209 - local188 * local202; this.anInt4999 > 32767 || this.anInt4985 > 32767 || this.anInt4989 > 32767 || this.anInt4999 < -32767 || this.anInt4985 < -32767 || this.anInt4989 < -32767; this.anInt4999 >>= 0x1) {
			this.anInt4989 >>= 0x1;
			this.anInt4985 >>= 0x1;
		}
		@Pc(307) int local307 = (int) Math.sqrt((double) (this.anInt4989 * this.anInt4989 + this.anInt4985 * this.anInt4985 + this.anInt4999 * this.anInt4999));
		if (local307 <= 0) {
			local307 = 1;
		}
		this.anInt4989 = this.anInt4989 * 32767 / local307;
		this.anInt4999 = this.anInt4999 * 32767 / local307;
		this.anInt4985 = this.anInt4985 * 32767 / local307;
		if (this.aClass156_1.aShort46 <= 0 && this.aClass156_1.aShort45 <= 0) {
			return;
		}
		@Pc(360) int local360 = (int) (Math.atan2((double) this.anInt4989, (double) this.anInt4999) * 2607.5945876176133D);
		@Pc(381) int local381 = (int) (Math.atan2((double) this.anInt4985, Math.sqrt((double) (this.anInt4999 * this.anInt4999 + this.anInt4989 * this.anInt4989))) * 2607.5945876176133D);
		this.anInt4978 = this.aClass156_1.aShort46 - this.aClass156_1.aShort44;
		this.anInt4994 = this.aClass156_1.aShort44 + local360 - (this.anInt4978 >> 1);
		this.anInt4996 = this.aClass156_1.aShort45 - this.aClass156_1.aShort43;
		this.anInt4982 = this.aClass156_1.aShort43 + local381 - (this.anInt4996 >> 1);
	}
}
