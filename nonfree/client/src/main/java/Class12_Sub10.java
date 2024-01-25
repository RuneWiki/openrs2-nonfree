import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pga")
public final class Class12_Sub10 extends Class12 {

	@OriginalMember(owner = "client!pga", name = "n", descriptor = "I")
	public int anInt7951;

	@OriginalMember(owner = "client!pga", name = "B", descriptor = "I")
	private int anInt7956;

	@OriginalMember(owner = "client!pga", name = "C", descriptor = "I")
	private int anInt7957;

	@OriginalMember(owner = "client!pga", name = "D", descriptor = "I")
	private int anInt7958;

	@OriginalMember(owner = "client!pga", name = "E", descriptor = "I")
	private int anInt7959;

	@OriginalMember(owner = "client!pga", name = "F", descriptor = "I")
	private int anInt7960;

	@OriginalMember(owner = "client!pga", name = "G", descriptor = "I")
	private int anInt7961;

	@OriginalMember(owner = "client!pga", name = "H", descriptor = "I")
	private int anInt7962;

	@OriginalMember(owner = "client!pga", name = "w", descriptor = "Z")
	public boolean aBoolean548 = false;

	@OriginalMember(owner = "client!pga", name = "t", descriptor = "I")
	private int anInt7953 = 0;

	@OriginalMember(owner = "client!pga", name = "z", descriptor = "Lclient!hr;")
	public Class149 aClass149_1 = new Class149();

	@OriginalMember(owner = "client!pga", name = "A", descriptor = "Lclient!hr;")
	private Class149 aClass149_2 = new Class149();

	@OriginalMember(owner = "client!pga", name = "I", descriptor = "Z")
	private boolean aBoolean549 = false;

	@OriginalMember(owner = "client!pga", name = "q", descriptor = "Lclient!cv;")
	public final Class12_Sub4 aClass12_Sub4_7;

	@OriginalMember(owner = "client!pga", name = "x", descriptor = "J")
	private final long aLong215;

	@OriginalMember(owner = "client!pga", name = "r", descriptor = "Lclient!gv;")
	public final Class136 aClass136_2;

	@OriginalMember(owner = "client!pga", name = "k", descriptor = "Lclient!lu;")
	public Class223 aClass223_1;

	@OriginalMember(owner = "client!pga", name = "v", descriptor = "Lclient!vv;")
	public final Class376 aClass376_7;

	@OriginalMember(owner = "client!pga", name = "<init>", descriptor = "(Lclient!ha;Lclient!gv;Lclient!cv;J)V")
	public Class12_Sub10(@OriginalArg(0) Class137 arg0, @OriginalArg(1) Class136 arg1, @OriginalArg(2) Class12_Sub4 arg2, @OriginalArg(3) long arg3) {
		this.aClass12_Sub4_7 = arg2;
		this.aLong215 = arg3;
		this.aClass136_2 = arg1;
		this.aClass223_1 = this.aClass136_2.method3078();
		if (!arg0.method7881() && this.aClass223_1.anInt6459 != -1) {
			this.aClass223_1 = Static35.method825(this.aClass223_1.anInt6459);
		}
		this.aClass376_7 = new Class376();
		this.anInt7953 = (int) ((double) this.anInt7953 + Math.random() * 64.0D);
		this.method6575();
		this.aClass149_2.anInt4193 = this.aClass149_1.anInt4193;
		this.aClass149_2.anInt4199 = this.aClass149_1.anInt4199;
		this.aClass149_2.anInt4205 = this.aClass149_1.anInt4205;
		this.aClass149_2.anInt4201 = this.aClass149_1.anInt4201;
		this.aClass149_2.anInt4203 = this.aClass149_1.anInt4203;
		this.aClass149_2.anInt4190 = this.aClass149_1.anInt4190;
		this.aClass149_2.anInt4197 = this.aClass149_1.anInt4197;
		this.aClass149_2.anInt4202 = this.aClass149_1.anInt4202;
		this.aClass149_2.anInt4192 = this.aClass149_1.anInt4192;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(IJLclient!ha;)V")
	public void method6570(@OriginalArg(1) long arg0, @OriginalArg(2) Class137 arg1) {
		for (@Pc(17) Class12_Sub7_Sub2_Sub1 local17 = (Class12_Sub7_Sub2_Sub1) this.aClass376_7.method9008(); local17 != null; local17 = (Class12_Sub7_Sub2_Sub1) this.aClass376_7.method9014()) {
			local17.method8538(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lclient!ha;JIZZ)V")
	public void method6573(@OriginalArg(0) Class137 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(44) int local44;
		if (this.aBoolean548) {
			arg3 = false;
		} else if (Class12_Sub2_Sub3_Sub1.lb < this.aClass223_1.anInt6457) {
			arg3 = false;
		} else if (Static599.anInt6158 > Static37.anIntArray75[Class12_Sub2_Sub3_Sub1.lb]) {
			arg3 = false;
		} else if (this.aBoolean549) {
			arg3 = false;
		} else if (this.aClass223_1.anInt6483 != -1) {
			local44 = (int) (arg1 - this.aLong215);
			if (this.aClass223_1.aBoolean441 || local44 <= this.aClass223_1.anInt6483) {
				local44 %= this.aClass223_1.anInt6483;
			} else {
				arg3 = false;
			}
			if (!this.aClass223_1.aBoolean448 && this.aClass223_1.anInt6456 > local44) {
				arg3 = false;
			}
			if (this.aClass223_1.aBoolean448 && local44 >= this.aClass223_1.anInt6456) {
				arg3 = false;
			}
		}
		if (arg3) {
			Static391.anInt7193++;
			local44 = (this.aClass149_1.anInt4199 + this.aClass149_1.anInt4205 + this.aClass149_1.anInt4197) / 3;
			@Pc(136) int local136 = (this.aClass149_1.anInt4202 + this.aClass149_1.anInt4203 + this.aClass149_1.anInt4201) / 3;
			@Pc(150) int local150 = (this.aClass149_1.anInt4192 + this.aClass149_1.anInt4193 + this.aClass149_1.anInt4190) / 3;
			@Pc(194) int local194;
			@Pc(203) int local203;
			@Pc(212) int local212;
			@Pc(221) int local221;
			@Pc(229) int local229;
			@Pc(238) int local238;
			@Pc(339) int local339;
			@Pc(389) int local389;
			@Pc(410) int local410;
			if (local44 != this.aClass149_1.anInt4200 || local136 != this.aClass149_1.anInt4198 || this.aClass149_1.anInt4204 != local150) {
				this.aClass149_1.anInt4204 = local150;
				this.aClass149_1.anInt4200 = local44;
				this.aClass149_1.anInt4198 = local136;
				local194 = this.aClass149_1.anInt4199 - this.aClass149_1.anInt4205;
				local203 = this.aClass149_1.anInt4203 - this.aClass149_1.anInt4201;
				local212 = this.aClass149_1.anInt4192 - this.aClass149_1.anInt4193;
				local221 = this.aClass149_1.anInt4197 - this.aClass149_1.anInt4205;
				local229 = this.aClass149_1.anInt4202 - this.aClass149_1.anInt4201;
				local238 = this.aClass149_1.anInt4190 - this.aClass149_1.anInt4193;
				this.anInt7957 = local194 * local229 - local203 * local221;
				this.anInt7961 = local238 * local203 - local212 * local229;
				this.anInt7960 = local221 * local212 - local238 * local194;
				while (true) {
					if (this.anInt7961 <= 32767 && this.anInt7960 <= 32767 && this.anInt7957 <= 32767 && this.anInt7961 >= -32767 && this.anInt7960 >= -32767 && this.anInt7957 >= -32767) {
						local339 = (int) Math.sqrt((double) (this.anInt7960 * this.anInt7960 + this.anInt7961 * this.anInt7961 + this.anInt7957 * this.anInt7957));
						if (local339 <= 0) {
							local339 = 1;
						}
						this.anInt7960 = this.anInt7960 * 32767 / local339;
						this.anInt7957 = this.anInt7957 * 32767 / local339;
						this.anInt7961 = this.anInt7961 * 32767 / local339;
						if (this.aClass223_1.aShort73 > 0 || this.aClass223_1.aShort70 > 0) {
							local389 = (int) (Math.atan2((double) this.anInt7957, (double) this.anInt7961) * 2607.5945876176133D);
							local410 = (int) (Math.atan2((double) this.anInt7960, Math.sqrt((double) (this.anInt7957 * this.anInt7957 + this.anInt7961 * this.anInt7961))) * 2607.5945876176133D);
							this.anInt7962 = this.aClass223_1.aShort73 - this.aClass223_1.aShort72;
							this.anInt7959 = local389 + this.aClass223_1.aShort72 - (this.anInt7962 >> 1);
							this.anInt7956 = this.aClass223_1.aShort70 - this.aClass223_1.aShort71;
							this.anInt7958 = local410 + this.aClass223_1.aShort71 - (this.anInt7956 >> 1);
						}
						break;
					}
					this.anInt7957 >>= 0x1;
					this.anInt7961 >>= 0x1;
					this.anInt7960 >>= 0x1;
				}
			}
			this.anInt7953 += (int) ((Math.random() * (double) (this.aClass223_1.anInt6464 - this.aClass223_1.anInt6458) + (double) this.aClass223_1.anInt6458) * (double) arg2);
			if (this.anInt7953 > 63) {
				local194 = this.anInt7953 >> 6;
				this.anInt7953 &= 0x3F;
				for (local229 = 0; local229 < local194; local229++) {
					@Pc(561) int local561;
					@Pc(565) int local565;
					if (this.aClass223_1.aShort73 <= 0 && this.aClass223_1.aShort70 <= 0) {
						local212 = this.anInt7960;
						local203 = this.anInt7961;
						local221 = this.anInt7957;
					} else {
						local238 = (int) ((double) this.anInt7962 * Math.random()) + this.anInt7959;
						local238 &= 0x3FFF;
						local339 = Class32.anIntArray76[local238];
						local389 = Class32.anIntArray77[local238];
						local410 = (int) (Math.random() * (double) this.anInt7956) + this.anInt7958;
						local410 &= 0x1FFF;
						local561 = Class32.anIntArray76[local410];
						local565 = Class32.anIntArray77[local410];
						local203 = local389 * local561 >> 13;
						local212 = (local565 << 1) * -1;
						local221 = local339 * local561 >> 13;
					}
					@Pc(588) float local588 = (float) Math.random();
					@Pc(591) float local591 = (float) Math.random();
					if (local588 + local591 > 1.0F) {
						local588 = 1.0F - local588;
						local591 = 1.0F - local591;
					}
					@Pc(612) float local612 = 1.0F - local591 - local588;
					local410 = (int) (local591 * (float) this.aClass149_1.anInt4199 + (float) this.aClass149_1.anInt4205 * local588 + (float) this.aClass149_1.anInt4197 * local612);
					local561 = (int) ((float) this.aClass149_1.anInt4202 * local612 + local591 * (float) this.aClass149_1.anInt4203 + local588 * (float) this.aClass149_1.anInt4201);
					local565 = (int) ((float) this.aClass149_1.anInt4190 * local612 + (float) this.aClass149_1.anInt4192 * local591 + local588 * (float) this.aClass149_1.anInt4193);
					@Pc(700) int local700 = (int) (local591 * (float) this.aClass149_2.anInt4199 + local588 * (float) this.aClass149_2.anInt4205 + local612 * (float) this.aClass149_2.anInt4197);
					@Pc(722) int local722 = (int) (local591 * (float) this.aClass149_2.anInt4203 + (float) this.aClass149_2.anInt4201 * local588 + (float) this.aClass149_2.anInt4202 * local612);
					@Pc(744) int local744 = (int) ((float) this.aClass149_2.anInt4190 * local612 + (float) this.aClass149_2.anInt4192 * local591 + (float) this.aClass149_2.anInt4193 * local588);
					@Pc(749) int local749 = local410 - local700;
					@Pc(754) int local754 = local561 - local722;
					@Pc(758) int local758 = local565 - local744;
					@Pc(767) int local767 = (int) ((double) local749 * Math.random() + (double) local700);
					@Pc(776) int local776 = (int) ((double) local754 * Math.random() + (double) local722);
					@Pc(785) int local785 = (int) ((double) local744 + (double) local758 * Math.random());
					@Pc(802) int local802 = this.aClass223_1.anInt6478 + (int) ((double) (this.aClass223_1.anInt6463 - this.aClass223_1.anInt6478) * Math.random());
					@Pc(819) int local819 = (int) (Math.random() * (double) (this.aClass223_1.anInt6443 - this.aClass223_1.anInt6449)) + this.aClass223_1.anInt6449;
					@Pc(836) int local836 = (int) (Math.random() * (double) (this.aClass223_1.anInt6433 - this.aClass223_1.anInt6448)) + this.aClass223_1.anInt6448;
					@Pc(898) int local898;
					if (this.aClass223_1.aBoolean444) {
						@Pc(902) double local902 = Math.random();
						local898 = (int) (local902 * (double) this.aClass223_1.anInt6485 + (double) this.aClass223_1.anInt6432) | (int) (local902 * (double) this.aClass223_1.anInt6453 + (double) this.aClass223_1.anInt6462) << 8 | (int) ((double) this.aClass223_1.anInt6440 * local902 + (double) this.aClass223_1.anInt6454) << 16 | (int) ((double) this.aClass223_1.anInt6455 + Math.random() * (double) this.aClass223_1.anInt6441) << 24;
					} else {
						local898 = (int) ((double) this.aClass223_1.anInt6441 * Math.random() + (double) this.aClass223_1.anInt6455) << 24 | (int) ((double) this.aClass223_1.anInt6453 * Math.random() + (double) this.aClass223_1.anInt6462) << 8 | (int) (Math.random() * (double) this.aClass223_1.anInt6440 + (double) this.aClass223_1.anInt6454) << 16 | (int) ((double) this.aClass223_1.anInt6432 + Math.random() * (double) this.aClass223_1.anInt6485);
					}
					@Pc(964) int local964 = this.aClass223_1.anInt6460;
					if (!arg0.method7881() && !this.aClass223_1.aBoolean445) {
						local964 = -1;
					}
					if (Static620.anInt10428 == Static273.anInt4736) {
						new Class12_Sub7_Sub2_Sub1(this, local767, local776, local785, local203, local212, local221, local802, local819, local898, local836, local964, this.aClass223_1.aBoolean446, this.aClass223_1.aBoolean447);
					} else {
						@Pc(1004) Class12_Sub7_Sub2_Sub1 local1004 = Static602.aClass12_Sub7_Sub2_Sub1Array2[Static273.anInt4736];
						Static273.anInt4736 = Static273.anInt4736 + 1 & 0x3FF;
						local1004.method8537(this, local767, local776, local785, local203, local212, local221, local802, local819, local898, local836, local964, this.aClass223_1.aBoolean446, this.aClass223_1.aBoolean447);
					}
				}
			}
		}
		if (!this.aClass149_1.method3479(this.aClass149_2)) {
			@Pc(1048) Class149 local1048 = this.aClass149_2;
			this.aClass149_2 = this.aClass149_1;
			this.aClass149_1 = local1048;
			this.aClass149_1.anInt4202 = this.aClass136_2.anInt3743;
			this.aClass149_1.anInt4199 = this.aClass136_2.anInt3746;
			this.aClass149_1.anInt4198 = this.aClass149_2.anInt4198;
			this.aClass149_1.anInt4197 = this.aClass136_2.anInt3744;
			this.aClass149_1.anInt4203 = this.aClass136_2.anInt3737;
			this.aClass149_1.anInt4200 = this.aClass149_2.anInt4200;
			this.aClass149_1.anInt4205 = this.aClass136_2.anInt3747;
			this.aClass149_1.anInt4190 = this.aClass136_2.anInt3736;
			this.aClass149_1.anInt4201 = this.aClass136_2.anInt3738;
			this.aClass149_1.anInt4204 = this.aClass149_2.anInt4204;
			this.aClass149_1.anInt4192 = this.aClass136_2.anInt3749;
			this.aClass149_1.anInt4193 = this.aClass136_2.anInt3753;
		}
		this.anInt7951 = 0;
		for (@Pc(1136) Class12_Sub7_Sub2_Sub1 local1136 = (Class12_Sub7_Sub2_Sub1) this.aClass376_7.method9008(); local1136 != null; local1136 = (Class12_Sub7_Sub2_Sub1) this.aClass376_7.method9014()) {
			local1136.method8539(arg1, arg2);
			this.anInt7951++;
		}
		Static132.anInt2539 += this.anInt7951;
	}

	@OriginalMember(owner = "client!pga", name = "b", descriptor = "(I)V")
	public void method6575() {
		this.aClass149_1.anInt4199 = this.aClass136_2.anInt3746;
		this.aClass149_1.anInt4205 = this.aClass136_2.anInt3747;
		this.aClass149_1.anInt4190 = this.aClass136_2.anInt3736;
		this.aClass149_1.anInt4197 = this.aClass136_2.anInt3744;
		this.aClass149_1.anInt4202 = this.aClass136_2.anInt3743;
		this.aClass149_1.anInt4201 = this.aClass136_2.anInt3738;
		this.aClass149_1.anInt4192 = this.aClass136_2.anInt3749;
		this.aClass149_1.anInt4203 = this.aClass136_2.anInt3737;
		this.aClass149_1.anInt4193 = this.aClass136_2.anInt3753;
		if (this.aClass149_1.anInt4205 == this.aClass149_1.anInt4199 && this.aClass149_1.anInt4199 == this.aClass149_1.anInt4197 && this.aClass149_1.anInt4203 == this.aClass149_1.anInt4201 && this.aClass149_1.anInt4203 == this.aClass149_1.anInt4202 && this.aClass149_1.anInt4193 == this.aClass149_1.anInt4192 && this.aClass149_1.anInt4190 == this.aClass149_1.anInt4192) {
			this.aBoolean549 = true;
		} else if (this.aBoolean549) {
			this.aClass149_2.anInt4199 = this.aClass149_1.anInt4199;
			this.aClass149_2.anInt4190 = this.aClass149_1.anInt4190;
			this.aClass149_2.anInt4192 = this.aClass149_1.anInt4192;
			this.aClass149_2.anInt4201 = this.aClass149_1.anInt4201;
			this.aClass149_2.anInt4202 = this.aClass149_1.anInt4202;
			this.aClass149_2.anInt4197 = this.aClass149_1.anInt4197;
			this.aClass149_2.anInt4203 = this.aClass149_1.anInt4203;
			this.aBoolean549 = false;
			this.aClass149_2.anInt4205 = this.aClass149_1.anInt4205;
			this.aClass149_2.anInt4193 = this.aClass149_1.anInt4193;
		}
	}
}
