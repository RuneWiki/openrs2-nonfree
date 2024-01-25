import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iv")
public final class Class38_Sub5 extends Class38 {

	@OriginalMember(owner = "client!iv", name = "i", descriptor = "I")
	public int anInt3537;

	@OriginalMember(owner = "client!iv", name = "l", descriptor = "I")
	public int anInt3539;

	@OriginalMember(owner = "client!iv", name = "o", descriptor = "I")
	public int anInt3541;

	@OriginalMember(owner = "client!iv", name = "p", descriptor = "I")
	private int anInt3542;

	@OriginalMember(owner = "client!iv", name = "q", descriptor = "I")
	private int anInt3543;

	@OriginalMember(owner = "client!iv", name = "r", descriptor = "I")
	private int anInt3544;

	@OriginalMember(owner = "client!iv", name = "s", descriptor = "I")
	private int anInt3545;

	@OriginalMember(owner = "client!iv", name = "t", descriptor = "I")
	private int anInt3546;

	@OriginalMember(owner = "client!iv", name = "u", descriptor = "I")
	private int anInt3547;

	@OriginalMember(owner = "client!iv", name = "v", descriptor = "I")
	private int anInt3548;

	@OriginalMember(owner = "client!iv", name = "w", descriptor = "I")
	private int anInt3549;

	@OriginalMember(owner = "client!iv", name = "x", descriptor = "I")
	private int anInt3550;

	@OriginalMember(owner = "client!iv", name = "z", descriptor = "I")
	private int anInt3552;

	@OriginalMember(owner = "client!iv", name = "C", descriptor = "I")
	public int anInt3554;

	@OriginalMember(owner = "client!iv", name = "D", descriptor = "I")
	private int anInt3555;

	@OriginalMember(owner = "client!iv", name = "E", descriptor = "I")
	private int anInt3556;

	@OriginalMember(owner = "client!iv", name = "H", descriptor = "I")
	private int anInt3557;

	@OriginalMember(owner = "client!iv", name = "K", descriptor = "I")
	private int anInt3558;

	@OriginalMember(owner = "client!iv", name = "N", descriptor = "I")
	private int anInt3560;

	@OriginalMember(owner = "client!iv", name = "O", descriptor = "I")
	private int anInt3561;

	@OriginalMember(owner = "client!iv", name = "n", descriptor = "Z")
	public boolean aBoolean300 = false;

	@OriginalMember(owner = "client!iv", name = "j", descriptor = "Z")
	private boolean aBoolean299 = false;

	@OriginalMember(owner = "client!iv", name = "L", descriptor = "I")
	private int anInt3559 = 0;

	@OriginalMember(owner = "client!iv", name = "G", descriptor = "Lclient!lr;")
	public final Class38_Sub6 aClass38_Sub6_3;

	@OriginalMember(owner = "client!iv", name = "F", descriptor = "Lclient!qm;")
	public final Class202 aClass202_1;

	@OriginalMember(owner = "client!iv", name = "M", descriptor = "J")
	private final long aLong86;

	@OriginalMember(owner = "client!iv", name = "A", descriptor = "Lclient!af;")
	public Class6 aClass6_1;

	@OriginalMember(owner = "client!iv", name = "J", descriptor = "Lclient!os;")
	public final Class184 aClass184_2;

	static {
		new Class256("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
	}

	@OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Lclient!qa;Lclient!qm;Lclient!lr;J)V")
	public Class38_Sub5(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class202 arg1, @OriginalArg(2) Class38_Sub6 arg2, @OriginalArg(3) long arg3) {
		this.aClass38_Sub6_3 = arg2;
		this.aClass202_1 = arg1;
		this.aLong86 = arg3;
		this.aClass6_1 = this.aClass202_1.method4612();
		if (!arg0.method2246() && this.aClass6_1.anInt180 != -1) {
			this.aClass6_1 = Static103.method1622(this.aClass6_1.anInt180);
		}
		this.aClass184_2 = new Class184();
		this.anInt3559 = (int) ((double) this.anInt3559 + Math.random() * 64.0D);
		this.method2831();
	}

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(I)V")
	public void method2831() {
		this.anInt3548 = this.aClass202_1.anInt5768;
		this.anInt3549 = this.aClass202_1.anInt5778;
		this.anInt3547 = this.aClass202_1.anInt5773;
		this.anInt3555 = this.aClass202_1.anInt5769;
		this.anInt3542 = this.aClass202_1.anInt5761;
		this.anInt3561 = this.aClass202_1.anInt5763;
		this.anInt3560 = this.aClass202_1.anInt5779;
		this.anInt3546 = this.aClass202_1.anInt5772;
		this.anInt3558 = this.aClass202_1.anInt5758;
		if (this.anInt3555 == this.anInt3548 && this.anInt3555 == this.anInt3546 && this.anInt3560 == this.anInt3542 && this.anInt3558 == this.anInt3560 && this.anInt3549 == this.anInt3547 && this.anInt3547 == this.anInt3561) {
			this.aBoolean299 = true;
			return;
		}
		this.aBoolean299 = false;
		@Pc(115) int local115 = (this.anInt3546 + this.anInt3548 + this.anInt3555) / 3;
		@Pc(127) int local127 = (this.anInt3558 + this.anInt3542 + this.anInt3560) / 3;
		@Pc(138) int local138 = (this.anInt3547 + this.anInt3549 + this.anInt3561) / 3;
		if (this.anInt3554 == local115 && local127 == this.anInt3537 && this.anInt3539 == local138) {
			return;
		}
		this.anInt3539 = local138;
		this.anInt3537 = local127;
		this.anInt3554 = local115;
		@Pc(170) int local170 = this.anInt3555 - this.anInt3548;
		@Pc(177) int local177 = this.anInt3560 - this.anInt3542;
		@Pc(184) int local184 = this.anInt3547 - this.anInt3549;
		@Pc(190) int local190 = this.anInt3546 - this.anInt3548;
		@Pc(197) int local197 = this.anInt3558 - this.anInt3542;
		@Pc(204) int local204 = this.anInt3561 - this.anInt3549;
		this.anInt3544 = local190 * local184 - local170 * local204;
		this.anInt3550 = local197 * local170 - local190 * local177;
		this.anInt3556 = local177 * local204 - local197 * local184;
		while (this.anInt3556 > 32767 || this.anInt3544 > 32767 || this.anInt3550 > 32767 || this.anInt3556 < -32767 || this.anInt3544 < -32767 || this.anInt3550 < -32767) {
			this.anInt3556 >>= 0x1;
			this.anInt3550 >>= 0x1;
			this.anInt3544 >>= 0x1;
		}
		@Pc(301) int local301 = (int) Math.sqrt((double) (this.anInt3550 * this.anInt3550 + this.anInt3556 * this.anInt3556 + this.anInt3544 * this.anInt3544));
		if (local301 <= 0) {
			local301 = 1;
		}
		this.anInt3544 = this.anInt3544 * 32767 / local301;
		this.anInt3556 = this.anInt3556 * 32767 / local301;
		this.anInt3550 = this.anInt3550 * 32767 / local301;
		if (this.aClass6_1.aShort2 <= 0 && this.aClass6_1.aShort3 <= 0) {
			return;
		}
		@Pc(354) int local354 = (int) (Math.atan2((double) this.anInt3550, (double) this.anInt3556) * 2607.5945876176133D);
		@Pc(375) int local375 = (int) (Math.atan2((double) this.anInt3544, Math.sqrt((double) (this.anInt3550 * this.anInt3550 + this.anInt3556 * this.anInt3556))) * 2607.5945876176133D);
		this.anInt3543 = this.aClass6_1.aShort2 - this.aClass6_1.aShort1;
		this.anInt3552 = this.aClass6_1.aShort3 - this.aClass6_1.lb;
		this.anInt3545 = local354 + this.aClass6_1.aShort1 - (this.anInt3543 >> 1);
		this.anInt3557 = local375 + this.aClass6_1.lb - (this.anInt3552 >> 1);
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(BJ)V")
	public void method2832(@OriginalArg(1) long arg0) {
		for (@Pc(19) Class38_Sub2_Sub1_Sub1 local19 = (Class38_Sub2_Sub1_Sub1) this.aClass184_2.method4212(); local19 != null; local19 = (Class38_Sub2_Sub1_Sub1) this.aClass184_2.method4215()) {
			local19.method1241(arg0);
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(Lclient!qa;ZIIJ)V")
	public void method2833(@OriginalArg(0) Class26 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) long arg3) {
		@Pc(38) int local38;
		if (this.aBoolean300) {
			arg1 = false;
		} else if (this.aClass6_1.anInt188 > Static275.anInt7554) {
			arg1 = false;
		} else if (Static239.anIntArray312[Static275.anInt7554] < Static419.anInt7352) {
			arg1 = false;
		} else if (this.aBoolean299) {
			arg1 = false;
		} else if (this.aClass6_1.anInt175 != -1) {
			local38 = (int) (arg3 - this.aLong86);
			if (this.aClass6_1.aBoolean22 || this.aClass6_1.anInt175 >= local38) {
				local38 %= this.aClass6_1.anInt175;
			} else {
				arg1 = false;
			}
			if (!this.aClass6_1.aBoolean23 && local38 < this.aClass6_1.anInt221) {
				arg1 = false;
			}
			if (this.aClass6_1.aBoolean23 && local38 >= this.aClass6_1.anInt221) {
				arg1 = false;
			}
		}
		if (arg1) {
			this.anInt3559 += (int) ((double) arg2 * (Math.random() * (double) (this.aClass6_1.anInt214 - this.aClass6_1.anInt184) + (double) this.aClass6_1.anInt184));
			if (this.anInt3559 > 63) {
				local38 = this.anInt3559 >> 6;
				this.anInt3559 &= 0x3F;
				for (@Pc(139) int local139 = 0; local139 < local38; local139++) {
					@Pc(158) int local158;
					@Pc(161) int local161;
					@Pc(155) int local155;
					@Pc(173) int local173;
					@Pc(181) int local181;
					@Pc(185) int local185;
					@Pc(196) int local196;
					@Pc(204) int local204;
					@Pc(208) int local208;
					if (this.aClass6_1.aShort2 <= 0 && this.aClass6_1.aShort3 <= 0) {
						local155 = this.anInt3550;
						local158 = this.anInt3556;
						local161 = this.anInt3544;
					} else {
						local173 = (int) ((double) this.anInt3543 * Math.random()) + this.anInt3545;
						@Pc(177) int local177 = local173 & 0x3FFF;
						local181 = Class184.anIntArray349[local177];
						local185 = Class184.anIntArray350[local177];
						local196 = this.anInt3557 + (int) (Math.random() * (double) this.anInt3552);
						@Pc(200) int local200 = local196 & 0x1FFF;
						local204 = Class184.anIntArray349[local200];
						local208 = Class184.anIntArray350[local200];
						local158 = local204 * local185 >> 15;
						local161 = (local208 << 0) * -1;
						local155 = local181 * local204 >> 15;
					}
					local173 = (int) (Math.random() * 65535.0D);
					local181 = (int) (Math.random() * 65535.0D);
					if (local173 + local181 > 65535) {
						local173 = 65535 - local173;
						local181 = 65535 - local181;
					}
					local185 = 65535 - local181 - local173;
					local196 = this.anInt3546 * local185 + local181 * this.anInt3555 + local173 * this.anInt3548 >> 16;
					local204 = local173 * this.anInt3542 + local181 * this.anInt3560 + local185 * this.anInt3558 >> 16;
					local208 = this.anInt3549 * local173 + this.anInt3547 * local181 + this.anInt3561 * local185 >> 16;
					@Pc(328) int local328 = this.aClass6_1.anInt197 + (int) (Math.random() * (double) (this.aClass6_1.anInt212 - this.aClass6_1.anInt197));
					@Pc(345) int local345 = this.aClass6_1.anInt169 + (int) ((double) (this.aClass6_1.anInt182 - this.aClass6_1.anInt169) * Math.random());
					@Pc(362) int local362 = (int) (Math.random() * (double) (this.aClass6_1.anInt208 - this.aClass6_1.anInt217)) + this.aClass6_1.anInt217;
					@Pc(424) int local424;
					if (this.aClass6_1.aBoolean20) {
						@Pc(428) double local428 = Math.random();
						local424 = (int) (local428 * (double) this.aClass6_1.anInt179 + (double) this.aClass6_1.anInt219) << 16 | (int) ((double) this.aClass6_1.anInt205 * local428 + (double) this.aClass6_1.anInt213) << 8 | (int) ((double) this.aClass6_1.anInt220 + (double) this.aClass6_1.anInt173 * local428) | (int) ((double) this.aClass6_1.anInt194 + Math.random() * (double) this.aClass6_1.anInt189) << 24;
					} else {
						local424 = (int) ((double) this.aClass6_1.anInt213 + (double) this.aClass6_1.anInt205 * Math.random()) << 8 | (int) ((double) this.aClass6_1.anInt179 * Math.random() + (double) this.aClass6_1.anInt219) << 16 | (int) (Math.random() * (double) this.aClass6_1.anInt173 + (double) this.aClass6_1.anInt220) | (int) ((double) this.aClass6_1.anInt194 + Math.random() * (double) this.aClass6_1.anInt189) << 24;
					}
					@Pc(490) int local490 = this.aClass6_1.anInt174;
					if (!arg0.method2246() && !this.aClass6_1.aBoolean18) {
						local490 = -1;
					}
					if (Static352.anInt7236 == Static36.anInt846) {
						new Class38_Sub2_Sub1_Sub1(this, local196, local204, local208, local158, local161, local155, local328, local345, local424, local362, local490, this.aClass6_1.aBoolean17, this.aClass6_1.aBoolean21);
					} else {
						@Pc(530) Class38_Sub2_Sub1_Sub1 local530 = Static347.aClass38_Sub2_Sub1_Sub1Array2[Static36.anInt846];
						Static36.anInt846 = Static36.anInt846 + 1 & 0x3FF;
						local530.method1243(this, local196, local204, local208, local158, local161, local155, local328, local345, local424, local362, local490, this.aClass6_1.aBoolean17, this.aClass6_1.aBoolean21);
					}
				}
			}
		}
		this.anInt3541 = 0;
		for (@Pc(571) Class38_Sub2_Sub1_Sub1 local571 = (Class38_Sub2_Sub1_Sub1) this.aClass184_2.method4212(); local571 != null; local571 = (Class38_Sub2_Sub1_Sub1) this.aClass184_2.method4215()) {
			local571.method1244(arg3, arg2);
			this.anInt3541++;
		}
		Static346.anInt6105 += this.anInt3541;
	}
}
