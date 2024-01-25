import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class Class9_Sub3 extends Class9 {

	@OriginalMember(owner = "client!ji", name = "t", descriptor = "I")
	public int anInt4985;

	@OriginalMember(owner = "client!ji", name = "v", descriptor = "I")
	private int anInt4986;

	@OriginalMember(owner = "client!ji", name = "x", descriptor = "I")
	private int anInt4987;

	@OriginalMember(owner = "client!ji", name = "k", descriptor = "I")
	private int anInt4988;

	@OriginalMember(owner = "client!ji", name = "I", descriptor = "I")
	private int anInt4989;

	@OriginalMember(owner = "client!ji", name = "l", descriptor = "I")
	private int anInt4990;

	@OriginalMember(owner = "client!ji", name = "w", descriptor = "I")
	private int anInt4992;

	@OriginalMember(owner = "client!ji", name = "q", descriptor = "I")
	private int anInt4993;

	@OriginalMember(owner = "client!ji", name = "n", descriptor = "I")
	private int anInt4980 = 0;

	@OriginalMember(owner = "client!ji", name = "C", descriptor = "Z")
	public boolean aBoolean324 = false;

	@OriginalMember(owner = "client!ji", name = "s", descriptor = "Lclient!kj;")
	public Class211 aClass211_1 = new Class211();

	@OriginalMember(owner = "client!ji", name = "o", descriptor = "Lclient!kj;")
	private Class211 aClass211_2 = new Class211();

	@OriginalMember(owner = "client!ji", name = "D", descriptor = "Z")
	private boolean aBoolean325 = false;

	@OriginalMember(owner = "client!ji", name = "u", descriptor = "Lclient!ms;")
	public final Class9_Sub5 aClass9_Sub5_5;

	@OriginalMember(owner = "client!ji", name = "F", descriptor = "Lclient!ip;")
	public final Class184 aClass184_2;

	@OriginalMember(owner = "client!ji", name = "z", descriptor = "J")
	private final long aLong170;

	@OriginalMember(owner = "client!ji", name = "E", descriptor = "Lclient!js;")
	public Class201 aClass201_1;

	@OriginalMember(owner = "client!ji", name = "B", descriptor = "Lclient!qw;")
	public final Class319 aClass319_7;

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Lclient!ha;Lclient!ip;Lclient!ms;J)V")
	public Class9_Sub3(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class184 arg1, @OriginalArg(2) Class9_Sub5 arg2, @OriginalArg(3) long arg3) {
		this.aClass9_Sub5_5 = arg2;
		this.aClass184_2 = arg1;
		this.aLong170 = arg3;
		this.aClass201_1 = this.aClass184_2.method4042();
		if (!arg0.method9388() && this.aClass201_1.anInt5252 != -1) {
			this.aClass201_1 = Static181.method2882(this.aClass201_1.anInt5252);
		}
		this.aClass319_7 = new Class319();
		this.anInt4980 = (int) ((double) this.anInt4980 + Math.random() * 64.0D);
		this.method4581();
		this.aClass211_2.anInt5531 = this.aClass211_1.anInt5531;
		this.aClass211_2.anInt5543 = this.aClass211_1.anInt5543;
		this.aClass211_2.anInt5539 = this.aClass211_1.anInt5539;
		this.aClass211_2.anInt5529 = this.aClass211_1.anInt5529;
		this.aClass211_2.anInt5530 = this.aClass211_1.anInt5530;
		this.aClass211_2.anInt5532 = this.aClass211_1.anInt5532;
		this.aClass211_2.anInt5540 = this.aClass211_1.anInt5540;
		this.aClass211_2.anInt5536 = this.aClass211_1.anInt5536;
		this.aClass211_2.anInt5542 = this.aClass211_1.anInt5542;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(JLclient!ha;Z)V")
	public void method4577(@OriginalArg(0) long arg0, @OriginalArg(1) Class22 arg1) {
		for (@Pc(7) Class9_Sub2_Sub1_Sub1 local7 = (Class9_Sub2_Sub1_Sub1) this.aClass319_7.method7195(); local7 != null; local7 = (Class9_Sub2_Sub1_Sub1) this.aClass319_7.method7188()) {
			local7.method1663(arg1, arg0);
		}
		if (false) {
			this.method4577(120L, (Class22) null);
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZLclient!ha;IJI)V")
	public void method4580(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(3) long arg2, @OriginalArg(4) int arg3) {
		@Pc(49) int local49;
		if (this.aBoolean324) {
			arg0 = false;
		} else if (this.aClass201_1.anInt5232 > Static233.anInt3759) {
			arg0 = false;
		} else if (Static688.anIntArray766[Static233.anInt3759] < Static389.anInt6051) {
			arg0 = false;
		} else if (this.aBoolean325) {
			arg0 = false;
		} else if (this.aClass201_1.anInt5242 != -1) {
			local49 = (int) (arg2 - this.aLong170);
			if (this.aClass201_1.aBoolean342 || this.aClass201_1.anInt5242 >= local49) {
				local49 %= this.aClass201_1.anInt5242;
			} else {
				arg0 = false;
			}
			if (!this.aClass201_1.aBoolean345 && this.aClass201_1.anInt5211 > local49) {
				arg0 = false;
			}
			if (this.aClass201_1.aBoolean345 && this.aClass201_1.anInt5211 <= local49) {
				arg0 = false;
			}
		}
		if (arg0) {
			Static37.anInt1200++;
			local49 = (this.aClass211_1.anInt5540 + this.aClass211_1.anInt5542 + this.aClass211_1.anInt5529) / 3;
			@Pc(157) int local157 = (this.aClass211_1.anInt5532 + this.aClass211_1.anInt5531 + this.aClass211_1.anInt5536) / 3;
			@Pc(172) int local172 = (this.aClass211_1.anInt5539 + this.aClass211_1.anInt5530 + this.aClass211_1.anInt5543) / 3;
			@Pc(216) int local216;
			@Pc(224) int local224;
			@Pc(233) int local233;
			@Pc(242) int local242;
			@Pc(250) int local250;
			@Pc(259) int local259;
			@Pc(362) int local362;
			@Pc(414) int local414;
			@Pc(436) int local436;
			if (this.aClass211_1.anInt5541 != local49 || local157 != this.aClass211_1.anInt5534 || this.aClass211_1.anInt5538 != local172) {
				this.aClass211_1.anInt5541 = local49;
				this.aClass211_1.anInt5538 = local172;
				this.aClass211_1.anInt5534 = local157;
				local216 = this.aClass211_1.anInt5540 - this.aClass211_1.anInt5542;
				local224 = this.aClass211_1.anInt5532 - this.aClass211_1.anInt5531;
				local233 = this.aClass211_1.anInt5543 - this.aClass211_1.anInt5530;
				local242 = this.aClass211_1.anInt5529 - this.aClass211_1.anInt5542;
				local250 = this.aClass211_1.anInt5536 - this.aClass211_1.anInt5531;
				local259 = this.aClass211_1.anInt5539 - this.aClass211_1.anInt5530;
				this.anInt4987 = local233 * local242 - local259 * local216;
				this.anInt4986 = local224 * local259 - local233 * local250;
				this.anInt4989 = local250 * local216 - local224 * local242;
				while (true) {
					if (this.anInt4986 <= 32767 && this.anInt4987 <= 32767 && this.anInt4989 <= 32767 && this.anInt4986 >= -32767 && this.anInt4987 >= -32767 && this.anInt4989 >= -32767) {
						local362 = (int) Math.sqrt((double) (this.anInt4989 * this.anInt4989 + this.anInt4987 * this.anInt4987 + this.anInt4986 * this.anInt4986));
						if (local362 <= 0) {
							local362 = 1;
						}
						this.anInt4987 = this.anInt4987 * 32767 / local362;
						this.anInt4986 = this.anInt4986 * 32767 / local362;
						this.anInt4989 = this.anInt4989 * 32767 / local362;
						if (this.aClass201_1.aShort71 > 0 || this.aClass201_1.aShort72 > 0) {
							local414 = (int) (Math.atan2((double) this.anInt4989, (double) this.anInt4986) * 2607.5945876176133D);
							local436 = (int) (Math.atan2((double) this.anInt4987, Math.sqrt((double) (this.anInt4986 * this.anInt4986 + this.anInt4989 * this.anInt4989))) * 2607.5945876176133D);
							this.anInt4992 = this.aClass201_1.aShort71 - this.aClass201_1.aShort69;
							this.anInt4990 = this.aClass201_1.aShort72 - this.aClass201_1.aShort70;
							this.anInt4993 = this.aClass201_1.aShort69 + local414 - (this.anInt4992 >> 1);
							this.anInt4988 = local436 + this.aClass201_1.aShort70 - (this.anInt4990 >> 1);
						}
						break;
					}
					this.anInt4987 >>= 0x1;
					this.anInt4989 >>= 0x1;
					this.anInt4986 >>= 0x1;
				}
			}
			this.anInt4980 += (int) ((double) arg3 * (Math.random() * (double) (this.aClass201_1.anInt5218 - this.aClass201_1.anInt5215) + (double) this.aClass201_1.anInt5215));
			if (this.anInt4980 > 63) {
				local216 = this.anInt4980 >> 6;
				this.anInt4980 &= 0x3F;
				for (local250 = 0; local250 < local216; local250++) {
					@Pc(594) int local594;
					@Pc(598) int local598;
					if (this.aClass201_1.aShort71 <= 0 && this.aClass201_1.aShort72 <= 0) {
						local242 = this.anInt4989;
						local224 = this.anInt4986;
						local233 = this.anInt4987;
					} else {
						local259 = this.anInt4993 + (int) (Math.random() * (double) this.anInt4992);
						local259 &= 0x3FFF;
						local362 = Class3_Sub7_Sub17_Sub1.anIntArray549[local259];
						local414 = Class3_Sub7_Sub17_Sub1.anIntArray548[local259];
						local436 = (int) ((double) this.anInt4990 * Math.random()) + this.anInt4988;
						local436 &= 0x1FFF;
						local594 = Class3_Sub7_Sub17_Sub1.anIntArray549[local436];
						local598 = Class3_Sub7_Sub17_Sub1.anIntArray548[local436];
						local224 = local414 * local594 >> 13;
						local233 = (local598 << 1) * -1;
						local242 = local362 * local594 >> 13;
					}
					@Pc(621) float local621 = (float) Math.random();
					@Pc(624) float local624 = (float) Math.random();
					if (local621 + local624 > 1.0F) {
						local624 = 1.0F - local624;
						local621 = 1.0F - local621;
					}
					@Pc(644) float local644 = 1.0F - local624 - local621;
					local436 = (int) ((float) this.aClass211_1.anInt5529 * local644 + local624 * (float) this.aClass211_1.anInt5540 + local621 * (float) this.aClass211_1.anInt5542);
					local594 = (int) (local621 * (float) this.aClass211_1.anInt5531 + (float) this.aClass211_1.anInt5532 * local624 + (float) this.aClass211_1.anInt5536 * local644);
					local598 = (int) ((float) this.aClass211_1.anInt5530 * local621 + local624 * (float) this.aClass211_1.anInt5543 + local644 * (float) this.aClass211_1.anInt5539);
					@Pc(732) int local732 = (int) (local624 * (float) this.aClass211_2.anInt5540 + local621 * (float) this.aClass211_2.anInt5542 + local644 * (float) this.aClass211_2.anInt5529);
					@Pc(754) int local754 = (int) ((float) this.aClass211_2.anInt5531 * local621 + (float) this.aClass211_2.anInt5532 * local624 + local644 * (float) this.aClass211_2.anInt5536);
					@Pc(776) int local776 = (int) ((float) this.aClass211_2.anInt5543 * local624 + (float) this.aClass211_2.anInt5530 * local621 + (float) this.aClass211_2.anInt5539 * local644);
					@Pc(781) int local781 = local436 - local732;
					@Pc(786) int local786 = local594 - local754;
					@Pc(790) int local790 = local598 - local776;
					@Pc(799) int local799 = (int) ((double) local732 + (double) local781 * Math.random());
					@Pc(808) int local808 = (int) ((double) local754 + (double) local786 * Math.random());
					@Pc(817) int local817 = (int) ((double) local790 * Math.random() + (double) local776);
					@Pc(835) int local835 = this.aClass201_1.anInt5240 + (int) ((double) (this.aClass201_1.anInt5231 - this.aClass201_1.anInt5240) * Math.random());
					@Pc(852) int local852 = this.aClass201_1.anInt5207 + (int) (Math.random() * (double) (this.aClass201_1.anInt5225 - this.aClass201_1.anInt5207));
					@Pc(868) int local868 = this.aClass201_1.anInt5217 + (int) ((double) (this.aClass201_1.anInt5233 - this.aClass201_1.anInt5217) * Math.random());
					@Pc(930) int local930;
					if (this.aClass201_1.aBoolean349) {
						@Pc(934) double local934 = Math.random();
						local930 = (int) ((double) this.aClass201_1.anInt5224 + (double) this.aClass201_1.anInt5214 * Math.random()) << 24 | (int) ((double) this.aClass201_1.anInt5219 + (double) this.aClass201_1.anInt5227 * local934) << 16 | (int) ((double) this.aClass201_1.anInt5210 + (double) this.aClass201_1.anInt5221 * local934) << 8 | (int) ((double) this.aClass201_1.anInt5247 * local934 + (double) this.aClass201_1.anInt5208);
					} else {
						local930 = (int) ((double) this.aClass201_1.anInt5224 + Math.random() * (double) this.aClass201_1.anInt5214) << 24 | (int) (Math.random() * (double) this.aClass201_1.anInt5247 + (double) this.aClass201_1.anInt5208) | (int) ((double) this.aClass201_1.anInt5210 + (double) this.aClass201_1.anInt5221 * Math.random()) << 8 | (int) (Math.random() * (double) this.aClass201_1.anInt5227 + (double) this.aClass201_1.anInt5219) << 16;
					}
					@Pc(996) int local996 = this.aClass201_1.anInt5256;
					if (!arg1.method9388() && !this.aClass201_1.aBoolean347) {
						local996 = -1;
					}
					if (Static22.anInt715 == Static207.anInt3411) {
						new Class9_Sub2_Sub1_Sub1(this, local799, local808, local817, local224, local233, local242, local835, local852, local930, local868, local996, this.aClass201_1.aBoolean343, this.aClass201_1.aBoolean350);
					} else {
						@Pc(1042) Class9_Sub2_Sub1_Sub1 local1042 = Static452.aClass9_Sub2_Sub1_Sub1Array2[Static207.anInt3411];
						Static207.anInt3411 = Static207.anInt3411 + 1 & 0x3FF;
						local1042.method1661(this, local799, local808, local817, local224, local233, local242, local835, local852, local930, local868, local996, this.aClass201_1.aBoolean343, this.aClass201_1.aBoolean350);
					}
				}
			}
		}
		if (!this.aClass211_1.method4909(this.aClass211_2)) {
			@Pc(1084) Class211 local1084 = this.aClass211_2;
			this.aClass211_2 = this.aClass211_1;
			this.aClass211_1 = local1084;
			this.aClass211_1.anInt5539 = this.aClass184_2.anInt4431;
			this.aClass211_1.anInt5543 = this.aClass184_2.anInt4434;
			this.aClass211_1.anInt5538 = this.aClass211_2.anInt5538;
			this.aClass211_1.anInt5532 = this.aClass184_2.anInt4440;
			this.aClass211_1.anInt5542 = this.aClass184_2.anInt4429;
			this.aClass211_1.anInt5530 = this.aClass184_2.anInt4424;
			this.aClass211_1.anInt5540 = this.aClass184_2.anInt4435;
			this.aClass211_1.anInt5536 = this.aClass184_2.anInt4438;
			this.aClass211_1.anInt5534 = this.aClass211_2.anInt5534;
			this.aClass211_1.anInt5531 = this.aClass184_2.anInt4427;
			this.aClass211_1.anInt5541 = this.aClass211_2.anInt5541;
			this.aClass211_1.anInt5529 = this.aClass184_2.anInt4430;
		}
		this.anInt4985 = 0;
		for (@Pc(1174) Class9_Sub2_Sub1_Sub1 local1174 = (Class9_Sub2_Sub1_Sub1) this.aClass319_7.method7195(); local1174 != null; local1174 = (Class9_Sub2_Sub1_Sub1) this.aClass319_7.method7188()) {
			local1174.method1665(arg2, arg3);
			this.anInt4985++;
		}
		Static397.anInt6167 += this.anInt4985;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)V")
	public void method4581() {
		this.aClass211_1.anInt5536 = this.aClass184_2.anInt4438;
		this.aClass211_1.anInt5543 = this.aClass184_2.anInt4434;
		this.aClass211_1.anInt5529 = this.aClass184_2.anInt4430;
		this.aClass211_1.anInt5540 = this.aClass184_2.anInt4435;
		this.aClass211_1.anInt5532 = this.aClass184_2.anInt4440;
		this.aClass211_1.anInt5530 = this.aClass184_2.anInt4424;
		this.aClass211_1.anInt5539 = this.aClass184_2.anInt4431;
		this.aClass211_1.anInt5542 = this.aClass184_2.anInt4429;
		this.aClass211_1.anInt5531 = this.aClass184_2.anInt4427;
		if (this.aClass211_1.anInt5540 == this.aClass211_1.anInt5542 && this.aClass211_1.anInt5540 == this.aClass211_1.anInt5529 && this.aClass211_1.anInt5531 == this.aClass211_1.anInt5532 && this.aClass211_1.anInt5532 == this.aClass211_1.anInt5536 && this.aClass211_1.anInt5530 == this.aClass211_1.anInt5543 && this.aClass211_1.anInt5543 == this.aClass211_1.anInt5539) {
			this.aBoolean325 = true;
		} else if (this.aBoolean325) {
			this.aBoolean325 = false;
			this.aClass211_2.anInt5539 = this.aClass211_1.anInt5539;
			this.aClass211_2.anInt5530 = this.aClass211_1.anInt5530;
			this.aClass211_2.anInt5531 = this.aClass211_1.anInt5531;
			this.aClass211_2.anInt5543 = this.aClass211_1.anInt5543;
			this.aClass211_2.anInt5529 = this.aClass211_1.anInt5529;
			this.aClass211_2.anInt5540 = this.aClass211_1.anInt5540;
			this.aClass211_2.anInt5542 = this.aClass211_1.anInt5542;
			this.aClass211_2.anInt5536 = this.aClass211_1.anInt5536;
			this.aClass211_2.anInt5532 = this.aClass211_1.anInt5532;
		}
	}
}
