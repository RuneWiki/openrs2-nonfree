import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qba")
public final class Class9_Sub9 extends Class9 {

	@OriginalMember(owner = "client!qba", name = "p", descriptor = "I")
	public int anInt8175;

	@OriginalMember(owner = "client!qba", name = "A", descriptor = "I")
	private int anInt8180;

	@OriginalMember(owner = "client!qba", name = "B", descriptor = "I")
	private int anInt8181;

	@OriginalMember(owner = "client!qba", name = "C", descriptor = "I")
	private int anInt8182;

	@OriginalMember(owner = "client!qba", name = "E", descriptor = "I")
	private int anInt8183;

	@OriginalMember(owner = "client!qba", name = "F", descriptor = "I")
	private int anInt8184;

	@OriginalMember(owner = "client!qba", name = "G", descriptor = "I")
	private int anInt8185;

	@OriginalMember(owner = "client!qba", name = "H", descriptor = "I")
	private int anInt8186;

	@OriginalMember(owner = "client!qba", name = "v", descriptor = "Z")
	public boolean aBoolean656 = false;

	@OriginalMember(owner = "client!qba", name = "r", descriptor = "I")
	private int anInt8176 = 0;

	@OriginalMember(owner = "client!qba", name = "q", descriptor = "Lclient!nt;")
	public Class232 aClass232_1 = new Class232();

	@OriginalMember(owner = "client!qba", name = "z", descriptor = "Lclient!nt;")
	private Class232 aClass232_2 = new Class232();

	@OriginalMember(owner = "client!qba", name = "I", descriptor = "Z")
	private boolean aBoolean657 = false;

	@OriginalMember(owner = "client!qba", name = "m", descriptor = "Lclient!lba;")
	public final Class9_Sub5 aClass9_Sub5_5;

	@OriginalMember(owner = "client!qba", name = "j", descriptor = "Lclient!fk;")
	public final Class103 aClass103_2;

	@OriginalMember(owner = "client!qba", name = "o", descriptor = "J")
	private final long aLong221;

	@OriginalMember(owner = "client!qba", name = "k", descriptor = "Lclient!fp;")
	public Class108 aClass108_1;

	@OriginalMember(owner = "client!qba", name = "w", descriptor = "Lclient!o;")
	public final Class234 aClass234_10;

	@OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(Lclient!ha;Lclient!fk;Lclient!lba;J)V")
	public Class9_Sub9(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class103 arg1, @OriginalArg(2) Class9_Sub5 arg2, @OriginalArg(3) long arg3) {
		this.aClass9_Sub5_5 = arg2;
		this.aClass103_2 = arg1;
		this.aLong221 = arg3;
		this.aClass108_1 = this.aClass103_2.method3125();
		if (!arg0.method6143() && this.aClass108_1.anInt3714 != -1) {
			this.aClass108_1 = Static548.method7724(this.aClass108_1.anInt3714);
		}
		this.aClass234_10 = new Class234();
		this.anInt8176 = (int) ((double) this.anInt8176 + Math.random() * 64.0D);
		this.method6883();
		this.aClass232_2.anInt7243 = this.aClass232_1.anInt7243;
		this.aClass232_2.anInt7241 = this.aClass232_1.anInt7241;
		this.aClass232_2.anInt7253 = this.aClass232_1.anInt7253;
		this.aClass232_2.anInt7249 = this.aClass232_1.anInt7249;
		this.aClass232_2.anInt7251 = this.aClass232_1.anInt7251;
		this.aClass232_2.anInt7246 = this.aClass232_1.anInt7246;
		this.aClass232_2.anInt7248 = this.aClass232_1.anInt7248;
		this.aClass232_2.anInt7250 = this.aClass232_1.anInt7250;
		this.aClass232_2.anInt7252 = this.aClass232_1.anInt7252;
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(JLclient!ha;B)V")
	public void method6879(@OriginalArg(0) long arg0, @OriginalArg(1) Class5 arg1) {
		for (@Pc(19) Class9_Sub1_Sub1_Sub1 local19 = (Class9_Sub1_Sub1_Sub1) this.aClass234_10.method6092(); local19 != null; local19 = (Class9_Sub1_Sub1_Sub1) this.aClass234_10.method6098()) {
			local19.method482(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(Lclient!ha;ZJII)V")
	public void method6880(@OriginalArg(0) Class5 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) long arg2, @OriginalArg(4) int arg3) {
		@Pc(42) int local42;
		if (this.aBoolean656) {
			arg1 = false;
		} else if (this.aClass108_1.anInt3703 > Static114.anInt2971) {
			arg1 = false;
		} else if (Static575.anIntArray110[Static114.anInt2971] < Static100.anInt2853) {
			arg1 = false;
		} else if (this.aBoolean657) {
			arg1 = false;
		} else if (this.aClass108_1.anInt3713 != -1) {
			local42 = (int) (arg2 - this.aLong221);
			if (this.aClass108_1.aBoolean298 || local42 <= this.aClass108_1.anInt3713) {
				local42 %= this.aClass108_1.anInt3713;
			} else {
				arg1 = false;
			}
			if (!this.aClass108_1.aBoolean292 && local42 < this.aClass108_1.anInt3697) {
				arg1 = false;
			}
			if (this.aClass108_1.aBoolean292 && this.aClass108_1.anInt3697 <= local42) {
				arg1 = false;
			}
		}
		if (arg1) {
			Static445.anInt8087++;
			local42 = (this.aClass232_1.anInt7241 + this.aClass232_1.anInt7248 + this.aClass232_1.anInt7246) / 3;
			@Pc(135) int local135 = (this.aClass232_1.anInt7243 + this.aClass232_1.anInt7251 + this.aClass232_1.anInt7249) / 3;
			@Pc(150) int local150 = (this.aClass232_1.anInt7250 + this.aClass232_1.anInt7253 + this.aClass232_1.anInt7252) / 3;
			@Pc(189) int local189;
			@Pc(198) int local198;
			@Pc(207) int local207;
			@Pc(216) int local216;
			@Pc(225) int local225;
			@Pc(234) int local234;
			@Pc(337) int local337;
			@Pc(387) int local387;
			@Pc(408) int local408;
			if (local42 != this.aClass232_1.anInt7238 || local135 != this.aClass232_1.anInt7240 || this.aClass232_1.anInt7244 != local150) {
				this.aClass232_1.anInt7238 = local42;
				this.aClass232_1.anInt7240 = local135;
				this.aClass232_1.anInt7244 = local150;
				local189 = this.aClass232_1.anInt7248 - this.aClass232_1.anInt7241;
				local198 = this.aClass232_1.anInt7251 - this.aClass232_1.anInt7243;
				local207 = this.aClass232_1.anInt7252 - this.aClass232_1.anInt7253;
				local216 = this.aClass232_1.anInt7246 - this.aClass232_1.anInt7241;
				local225 = this.aClass232_1.anInt7249 - this.aClass232_1.anInt7243;
				local234 = this.aClass232_1.anInt7250 - this.aClass232_1.anInt7253;
				this.anInt8181 = local225 * local189 - local216 * local198;
				this.anInt8183 = local198 * local234 - local207 * local225;
				this.anInt8180 = local207 * local216 - local189 * local234;
				while (true) {
					if (this.anInt8183 <= 32767 && this.anInt8180 <= 32767 && this.anInt8181 <= 32767 && this.anInt8183 >= -32767 && this.anInt8180 >= -32767 && this.anInt8181 >= -32767) {
						local337 = (int) Math.sqrt((double) (this.anInt8181 * this.anInt8181 + this.anInt8183 * this.anInt8183 + this.anInt8180 * this.anInt8180));
						if (local337 <= 0) {
							local337 = 1;
						}
						this.anInt8181 = this.anInt8181 * 32767 / local337;
						this.anInt8180 = this.anInt8180 * 32767 / local337;
						this.anInt8183 = this.anInt8183 * 32767 / local337;
						if (this.aClass108_1.aShort36 > 0 || this.aClass108_1.aShort34 > 0) {
							local387 = (int) (Math.atan2((double) this.anInt8181, (double) this.anInt8183) * 2607.5945876176133D);
							local408 = (int) (Math.atan2((double) this.anInt8180, Math.sqrt((double) (this.anInt8181 * this.anInt8181 + this.anInt8183 * this.anInt8183))) * 2607.5945876176133D);
							this.anInt8185 = this.aClass108_1.aShort36 - this.aClass108_1.aShort33;
							this.anInt8186 = local387 + this.aClass108_1.aShort33 - (this.anInt8185 >> 1);
							this.anInt8182 = this.aClass108_1.aShort34 - this.aClass108_1.aShort35;
							this.anInt8184 = this.aClass108_1.aShort35 + local408 - (this.anInt8182 >> 1);
						}
						break;
					}
					this.anInt8181 >>= 0x1;
					this.anInt8183 >>= 0x1;
					this.anInt8180 >>= 0x1;
				}
			}
			this.anInt8176 += (int) ((double) arg3 * (Math.random() * (double) (this.aClass108_1.anInt3735 - this.aClass108_1.anInt3700) + (double) this.aClass108_1.anInt3700));
			if (this.anInt8176 > 63) {
				local189 = this.anInt8176 >> 6;
				this.anInt8176 &= 0x3F;
				for (local225 = 0; local225 < local189; local225++) {
					@Pc(548) int local548;
					@Pc(552) int local552;
					if (this.aClass108_1.aShort36 <= 0 && this.aClass108_1.aShort34 <= 0) {
						local198 = this.anInt8183;
						local207 = this.anInt8180;
						local216 = this.anInt8181;
					} else {
						local234 = (int) (Math.random() * (double) this.anInt8185) + this.anInt8186;
						local234 &= 0x3FFF;
						local337 = Class78_Sub2_Sub2.anIntArray270[local234];
						local387 = Class78_Sub2_Sub2.anIntArray271[local234];
						local408 = (int) ((double) this.anInt8182 * Math.random()) + this.anInt8184;
						local408 &= 0x1FFF;
						local548 = Class78_Sub2_Sub2.anIntArray270[local408];
						local552 = Class78_Sub2_Sub2.anIntArray271[local408];
						local198 = local387 * local548 >> 13;
						local207 = (local552 << 1) * -1;
						local216 = local337 * local548 >> 13;
					}
					@Pc(586) float local586 = (float) Math.random();
					@Pc(589) float local589 = (float) Math.random();
					if (local586 + local589 > 1.0F) {
						local586 = 1.0F - local586;
						local589 = 1.0F - local589;
					}
					@Pc(610) float local610 = 1.0F - local589 - local586;
					local408 = (int) ((float) this.aClass232_1.anInt7248 * local589 + (float) this.aClass232_1.anInt7241 * local586 + (float) this.aClass232_1.anInt7246 * local610);
					local548 = (int) (local610 * (float) this.aClass232_1.anInt7249 + (float) this.aClass232_1.anInt7243 * local586 + local589 * (float) this.aClass232_1.anInt7251);
					local552 = (int) ((float) this.aClass232_1.anInt7250 * local610 + (float) this.aClass232_1.anInt7253 * local586 + (float) this.aClass232_1.anInt7252 * local589);
					@Pc(698) int local698 = (int) ((float) this.aClass232_2.anInt7241 * local586 + local589 * (float) this.aClass232_2.anInt7248 + local610 * (float) this.aClass232_2.anInt7246);
					@Pc(720) int local720 = (int) (local610 * (float) this.aClass232_2.anInt7249 + (float) this.aClass232_2.anInt7251 * local589 + (float) this.aClass232_2.anInt7243 * local586);
					@Pc(742) int local742 = (int) (local589 * (float) this.aClass232_2.anInt7252 + local586 * (float) this.aClass232_2.anInt7253 + (float) this.aClass232_2.anInt7250 * local610);
					@Pc(747) int local747 = local408 - local698;
					@Pc(752) int local752 = local548 - local720;
					@Pc(757) int local757 = local552 - local742;
					@Pc(766) int local766 = (int) ((double) local747 * Math.random() + (double) local698);
					@Pc(775) int local775 = (int) ((double) local720 + (double) local752 * Math.random());
					@Pc(784) int local784 = (int) ((double) local742 + Math.random() * (double) local757);
					@Pc(801) int local801 = (int) (Math.random() * (double) (this.aClass108_1.anInt3686 - this.aClass108_1.anInt3719)) + this.aClass108_1.anInt3719;
					@Pc(817) int local817 = (int) (Math.random() * (double) (this.aClass108_1.anInt3732 - this.aClass108_1.anInt3716)) + this.aClass108_1.anInt3716;
					@Pc(834) int local834 = this.aClass108_1.anInt3727 + (int) (Math.random() * (double) (this.aClass108_1.anInt3733 - this.aClass108_1.anInt3727));
					@Pc(896) int local896;
					if (this.aClass108_1.aBoolean295) {
						@Pc(900) double local900 = Math.random();
						local896 = (int) ((double) this.aClass108_1.anInt3692 + local900 * (double) this.aClass108_1.anInt3685) << 16 | (int) ((double) this.aClass108_1.anInt3688 * local900 + (double) this.aClass108_1.anInt3708) << 8 | (int) (local900 * (double) this.aClass108_1.anInt3689 + (double) this.aClass108_1.anInt3720) | (int) (Math.random() * (double) this.aClass108_1.anInt3715 + (double) this.aClass108_1.anInt3707) << 24;
					} else {
						local896 = (int) (Math.random() * (double) this.aClass108_1.anInt3715 + (double) this.aClass108_1.anInt3707) << 24 | (int) ((double) this.aClass108_1.anInt3692 + Math.random() * (double) this.aClass108_1.anInt3685) << 16 | (int) (Math.random() * (double) this.aClass108_1.anInt3688 + (double) this.aClass108_1.anInt3708) << 8 | (int) ((double) this.aClass108_1.anInt3720 + (double) this.aClass108_1.anInt3689 * Math.random());
					}
					@Pc(962) int local962 = this.aClass108_1.anInt3684;
					if (!arg0.method6143() && !this.aClass108_1.aBoolean300) {
						local962 = -1;
					}
					if (Static602.anInt10200 == Static615.anInt10411) {
						new Class9_Sub1_Sub1_Sub1(this, local766, local775, local784, local198, local207, local216, local801, local817, local896, local834, local962, this.aClass108_1.aBoolean294, this.aClass108_1.aBoolean297);
					} else {
						@Pc(982) Class9_Sub1_Sub1_Sub1 local982 = Static348.aClass9_Sub1_Sub1_Sub1Array2[Static602.anInt10200];
						Static602.anInt10200 = Static602.anInt10200 + 1 & 0x3FF;
						local982.method483(this, local766, local775, local784, local198, local207, local216, local801, local817, local896, local834, local962, this.aClass108_1.aBoolean294, this.aClass108_1.aBoolean297);
					}
				}
			}
		}
		if (!this.aClass232_1.method6058(this.aClass232_2)) {
			@Pc(1050) Class232 local1050 = this.aClass232_2;
			this.aClass232_2 = this.aClass232_1;
			this.aClass232_1 = local1050;
			this.aClass232_1.anInt7243 = this.aClass103_2.anInt3653;
			this.aClass232_1.anInt7250 = this.aClass103_2.anInt3648;
			this.aClass232_1.anInt7244 = this.aClass232_2.anInt7244;
			this.aClass232_1.anInt7246 = this.aClass103_2.anInt3645;
			this.aClass232_1.anInt7241 = this.aClass103_2.anInt3656;
			this.aClass232_1.anInt7252 = this.aClass103_2.anInt3643;
			this.aClass232_1.anInt7253 = this.aClass103_2.anInt3657;
			this.aClass232_1.anInt7251 = this.aClass103_2.anInt3650;
			this.aClass232_1.anInt7238 = this.aClass232_2.anInt7238;
			this.aClass232_1.anInt7249 = this.aClass103_2.anInt3655;
			this.aClass232_1.anInt7240 = this.aClass232_2.anInt7240;
			this.aClass232_1.anInt7248 = this.aClass103_2.anInt3649;
		}
		this.anInt8175 = 0;
		for (@Pc(1142) Class9_Sub1_Sub1_Sub1 local1142 = (Class9_Sub1_Sub1_Sub1) this.aClass234_10.method6092(); local1142 != null; local1142 = (Class9_Sub1_Sub1_Sub1) this.aClass234_10.method6098()) {
			local1142.method480(arg2, arg3);
			this.anInt8175++;
		}
		Static208.anInt4504 += this.anInt8175;
	}

	@OriginalMember(owner = "client!qba", name = "b", descriptor = "(I)V")
	public void method6883() {
		this.aClass232_1.anInt7253 = this.aClass103_2.anInt3657;
		this.aClass232_1.anInt7248 = this.aClass103_2.anInt3649;
		this.aClass232_1.anInt7250 = this.aClass103_2.anInt3648;
		this.aClass232_1.anInt7243 = this.aClass103_2.anInt3653;
		this.aClass232_1.anInt7241 = this.aClass103_2.anInt3656;
		this.aClass232_1.anInt7251 = this.aClass103_2.anInt3650;
		this.aClass232_1.anInt7249 = this.aClass103_2.anInt3655;
		this.aClass232_1.anInt7246 = this.aClass103_2.anInt3645;
		this.aClass232_1.anInt7252 = this.aClass103_2.anInt3643;
		if (this.aClass232_1.anInt7248 == this.aClass232_1.anInt7241 && this.aClass232_1.anInt7246 == this.aClass232_1.anInt7248 && this.aClass232_1.anInt7251 == this.aClass232_1.anInt7243 && this.aClass232_1.anInt7251 == this.aClass232_1.anInt7249 && this.aClass232_1.anInt7252 == this.aClass232_1.anInt7253 && this.aClass232_1.anInt7250 == this.aClass232_1.anInt7252) {
			this.aBoolean657 = true;
		} else if (this.aBoolean657) {
			this.aClass232_2.anInt7246 = this.aClass232_1.anInt7246;
			this.aClass232_2.anInt7249 = this.aClass232_1.anInt7249;
			this.aClass232_2.anInt7248 = this.aClass232_1.anInt7248;
			this.aClass232_2.anInt7243 = this.aClass232_1.anInt7243;
			this.aClass232_2.anInt7253 = this.aClass232_1.anInt7253;
			this.aClass232_2.anInt7251 = this.aClass232_1.anInt7251;
			this.aClass232_2.anInt7250 = this.aClass232_1.anInt7250;
			this.aClass232_2.anInt7241 = this.aClass232_1.anInt7241;
			this.aClass232_2.anInt7252 = this.aClass232_1.anInt7252;
			this.aBoolean657 = false;
		}
	}
}
