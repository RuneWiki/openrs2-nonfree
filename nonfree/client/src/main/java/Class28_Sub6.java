import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pl")
public final class Class28_Sub6 extends Class28 {

	@OriginalMember(owner = "client!pl", name = "j", descriptor = "I")
	public int anInt5661;

	@OriginalMember(owner = "client!pl", name = "m", descriptor = "I")
	private int anInt5664;

	@OriginalMember(owner = "client!pl", name = "o", descriptor = "I")
	private int anInt5666;

	@OriginalMember(owner = "client!pl", name = "r", descriptor = "I")
	private int anInt5668;

	@OriginalMember(owner = "client!pl", name = "t", descriptor = "I")
	private int anInt5669;

	@OriginalMember(owner = "client!pl", name = "u", descriptor = "I")
	private int anInt5670;

	@OriginalMember(owner = "client!pl", name = "w", descriptor = "I")
	private int anInt5672;

	@OriginalMember(owner = "client!pl", name = "y", descriptor = "I")
	private int anInt5673;

	@OriginalMember(owner = "client!pl", name = "z", descriptor = "I")
	private int anInt5674;

	@OriginalMember(owner = "client!pl", name = "B", descriptor = "I")
	private int anInt5676;

	@OriginalMember(owner = "client!pl", name = "C", descriptor = "I")
	public int anInt5677;

	@OriginalMember(owner = "client!pl", name = "F", descriptor = "I")
	private int anInt5678;

	@OriginalMember(owner = "client!pl", name = "I", descriptor = "I")
	private int anInt5680;

	@OriginalMember(owner = "client!pl", name = "J", descriptor = "I")
	private int anInt5681;

	@OriginalMember(owner = "client!pl", name = "L", descriptor = "I")
	private int anInt5683;

	@OriginalMember(owner = "client!pl", name = "M", descriptor = "I")
	private int anInt5684;

	@OriginalMember(owner = "client!pl", name = "O", descriptor = "I")
	private int anInt5686;

	@OriginalMember(owner = "client!pl", name = "P", descriptor = "I")
	public int anInt5687;

	@OriginalMember(owner = "client!pl", name = "Q", descriptor = "I")
	public int anInt5688;

	@OriginalMember(owner = "client!pl", name = "U", descriptor = "I")
	private int anInt5689;

	@OriginalMember(owner = "client!pl", name = "x", descriptor = "Z")
	public boolean aBoolean400 = false;

	@OriginalMember(owner = "client!pl", name = "n", descriptor = "I")
	private int anInt5665 = 0;

	@OriginalMember(owner = "client!pl", name = "S", descriptor = "Z")
	private boolean aBoolean401 = false;

	@OriginalMember(owner = "client!pl", name = "E", descriptor = "J")
	private final long aLong279;

	@OriginalMember(owner = "client!pl", name = "H", descriptor = "Lclient!ol;")
	public final Class191 aClass191_2;

	@OriginalMember(owner = "client!pl", name = "D", descriptor = "Lclient!bn;")
	public final Class28_Sub1 aClass28_Sub1_6;

	@OriginalMember(owner = "client!pl", name = "R", descriptor = "Lclient!ks;")
	public Class153 aClass153_1;

	@OriginalMember(owner = "client!pl", name = "V", descriptor = "Lclient!gn;")
	public final Class97 aClass97_6;

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lclient!za;Lclient!ol;Lclient!bn;J)V")
	public Class28_Sub6(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class191 arg1, @OriginalArg(2) Class28_Sub1 arg2, @OriginalArg(3) long arg3) {
		this.aLong279 = arg3;
		this.aClass191_2 = arg1;
		this.aClass28_Sub1_6 = arg2;
		this.aClass153_1 = this.aClass191_2.method4243();
		if (!arg0.method5948() && this.aClass153_1.anInt3769 != -1) {
			this.aClass153_1 = Static81.method1194(this.aClass153_1.anInt3769);
		}
		this.aClass97_6 = new Class97();
		this.anInt5665 = (int) ((double) this.anInt5665 + Math.random() * 64.0D);
		this.method4502();
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)V")
	public void method4502() {
		this.anInt5674 = this.aClass191_2.anInt5317;
		this.anInt5681 = this.aClass191_2.anInt5325;
		this.anInt5670 = this.aClass191_2.anInt5319;
		this.anInt5673 = this.aClass191_2.anInt5327;
		this.anInt5689 = this.aClass191_2.anInt5320;
		this.anInt5669 = this.aClass191_2.anInt5323;
		this.anInt5676 = this.aClass191_2.anInt5324;
		this.anInt5668 = this.aClass191_2.anInt5332;
		this.anInt5664 = this.aClass191_2.anInt5322;
		if (this.anInt5689 == this.anInt5668 && this.anInt5676 == this.anInt5668 && this.anInt5670 == this.anInt5673 && this.anInt5673 == this.anInt5681 && this.anInt5664 == this.anInt5674 && this.anInt5664 == this.anInt5669) {
			this.aBoolean401 = true;
			return;
		}
		this.aBoolean401 = false;
		@Pc(123) int local123 = (this.anInt5676 + this.anInt5668 + this.anInt5689) / 3;
		@Pc(134) int local134 = (this.anInt5681 + this.anInt5673 + this.anInt5670) / 3;
		@Pc(145) int local145 = (this.anInt5664 + this.anInt5674 + this.anInt5669) / 3;
		if (this.anInt5688 == local123 && this.anInt5661 == local134 && this.anInt5677 == local145) {
			return;
		}
		this.anInt5661 = local134;
		this.anInt5677 = local145;
		this.anInt5688 = local123;
		@Pc(178) int local178 = this.anInt5668 - this.anInt5689;
		@Pc(184) int local184 = this.anInt5673 - this.anInt5670;
		@Pc(190) int local190 = this.anInt5664 - this.anInt5674;
		@Pc(196) int local196 = this.anInt5676 - this.anInt5689;
		@Pc(203) int local203 = this.anInt5681 - this.anInt5670;
		@Pc(210) int local210 = this.anInt5669 - this.anInt5674;
		this.anInt5680 = local203 * local178 - local196 * local184;
		this.anInt5666 = local184 * local210 - local203 * local190;
		for (this.anInt5678 = local190 * local196 - local178 * local210; this.anInt5666 > 32767 || this.anInt5678 > 32767 || this.anInt5680 > 32767 || this.anInt5666 < -32767 || this.anInt5678 < -32767 || this.anInt5680 < -32767; this.anInt5678 >>= 0x1) {
			this.anInt5680 >>= 0x1;
			this.anInt5666 >>= 0x1;
		}
		@Pc(311) int local311 = (int) Math.sqrt((double) (this.anInt5678 * this.anInt5678 + this.anInt5666 * this.anInt5666 + this.anInt5680 * this.anInt5680));
		if (local311 <= 0) {
			local311 = 1;
		}
		this.anInt5680 = this.anInt5680 * 32767 / local311;
		this.anInt5666 = this.anInt5666 * 32767 / local311;
		this.anInt5678 = this.anInt5678 * 32767 / local311;
		if (this.aClass153_1.aShort59 <= 0 && this.aClass153_1.aShort61 <= 0) {
			return;
		}
		@Pc(367) int local367 = (int) (Math.atan2((double) this.anInt5680, (double) this.anInt5666) * 2607.5945876176133D);
		@Pc(388) int local388 = (int) (Math.atan2((double) this.anInt5678, Math.sqrt((double) (this.anInt5666 * this.anInt5666 + this.anInt5680 * this.anInt5680))) * 2607.5945876176133D);
		this.anInt5683 = this.aClass153_1.aShort59 - this.aClass153_1.aShort60;
		this.anInt5672 = this.aClass153_1.aShort61 - this.aClass153_1.aShort62;
		this.anInt5686 = local367 + this.aClass153_1.aShort60 - (this.anInt5683 >> 1);
		this.anInt5684 = this.aClass153_1.aShort62 + local388 - (this.anInt5672 >> 1);
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IJ)V")
	public void method4503(@OriginalArg(1) long arg0) {
		for (@Pc(7) Class28_Sub2_Sub1_Sub1 local7 = (Class28_Sub2_Sub1_Sub1) this.aClass97_6.method2145(); local7 != null; local7 = (Class28_Sub2_Sub1_Sub1) this.aClass97_6.method2148()) {
			local7.method3631(arg0);
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(JLclient!za;IBZ)V")
	public void method4506(@OriginalArg(0) long arg0, @OriginalArg(1) Class75 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(45) int local45;
		if (this.aBoolean400) {
			arg3 = false;
		} else if (this.aClass153_1.anInt3776 > Static39.anInt646) {
			arg3 = false;
		} else if (Static226.anInt3804 > Static287.anIntArray434[Static39.anInt646]) {
			arg3 = false;
		} else if (this.aBoolean401) {
			arg3 = false;
		} else if (this.aClass153_1.anInt3760 != -1) {
			local45 = (int) (arg0 - this.aLong279);
			if (this.aClass153_1.aBoolean248 || local45 <= this.aClass153_1.anInt3760) {
				local45 %= this.aClass153_1.anInt3760;
			} else {
				arg3 = false;
			}
			if (!this.aClass153_1.aBoolean251 && this.aClass153_1.anInt3753 > local45) {
				arg3 = false;
			}
			if (this.aClass153_1.aBoolean251 && local45 >= this.aClass153_1.anInt3753) {
				arg3 = false;
			}
		}
		if (arg3) {
			this.anInt5665 += (int) (((double) this.aClass153_1.anInt3749 + Math.random() * (double) (this.aClass153_1.anInt3768 - this.aClass153_1.anInt3749)) * (double) arg2);
			if (this.anInt5665 > 63) {
				local45 = this.anInt5665 >> 6;
				this.anInt5665 &= 0x3F;
				for (@Pc(142) int local142 = 0; local142 < local45; local142++) {
					@Pc(216) int local216;
					@Pc(210) int local210;
					@Pc(222) int local222;
					@Pc(168) int local168;
					@Pc(176) int local176;
					@Pc(180) int local180;
					@Pc(190) int local190;
					@Pc(198) int local198;
					@Pc(202) int local202;
					if (this.aClass153_1.aShort59 <= 0 && this.aClass153_1.aShort61 <= 0) {
						local210 = this.anInt5678;
						local216 = this.anInt5666;
						local222 = this.anInt5680;
					} else {
						local168 = this.anInt5686 + (int) (Math.random() * (double) this.anInt5683);
						@Pc(172) int local172 = local168 & 0x3FFF;
						local176 = Class229.anIntArray537[local172];
						local180 = Class229.anIntArray536[local172];
						local190 = this.anInt5684 + (int) (Math.random() * (double) this.anInt5672);
						@Pc(194) int local194 = local190 & 0x1FFF;
						local198 = Class229.anIntArray537[local194];
						local202 = Class229.anIntArray536[local194];
						local210 = (local202 << 0) * -1;
						local216 = local198 * local180 >> 15;
						local222 = local176 * local198 >> 15;
					}
					local168 = (int) (Math.random() * 65535.0D);
					local176 = (int) (Math.random() * 65535.0D);
					if (local168 + local176 > 65535) {
						local168 = 65535 - local168;
						local176 = 65535 - local176;
					}
					local180 = 65535 - local176 - local168;
					local190 = (int) ((long) this.anInt5676 * (long) local180 + (long) local176 * (long) this.anInt5668 + (long) this.anInt5689 * (long) local168 >> 16);
					local198 = (int) ((long) local176 * (long) this.anInt5673 + (long) local168 * (long) this.anInt5670 + (long) this.anInt5681 * (long) local180 >> 16);
					local202 = (int) ((long) this.anInt5664 * (long) local176 + (long) local168 * (long) this.anInt5674 + (long) this.anInt5669 * (long) local180 >> 16);
					@Pc(358) int local358 = this.aClass153_1.anInt3785 + (int) ((double) (this.aClass153_1.anInt3748 - this.aClass153_1.anInt3785) * Math.random());
					@Pc(375) int local375 = this.aClass153_1.anInt3767 + (int) ((double) (this.aClass153_1.anInt3765 - this.aClass153_1.anInt3767) * Math.random());
					@Pc(391) int local391 = (int) ((double) (this.aClass153_1.anInt3772 - this.aClass153_1.anInt3783) * Math.random()) + this.aClass153_1.anInt3783;
					@Pc(455) int local455;
					if (this.aClass153_1.aBoolean254) {
						@Pc(397) double local397 = Math.random();
						local455 = (int) ((double) this.aClass153_1.anInt3778 + local397 * (double) this.aClass153_1.anInt3764) | (int) ((double) this.aClass153_1.anInt3787 + local397 * (double) this.aClass153_1.anInt3746) << 8 | (int) ((double) this.aClass153_1.anInt3782 + (double) this.aClass153_1.anInt3781 * local397) << 16 | (int) (Math.random() * (double) this.aClass153_1.anInt3779 + (double) this.aClass153_1.anInt3738) << 24;
					} else {
						local455 = (int) (Math.random() * (double) this.aClass153_1.anInt3779 + (double) this.aClass153_1.anInt3738) << 24 | (int) ((double) this.aClass153_1.anInt3764 * Math.random() + (double) this.aClass153_1.anInt3778) | (int) (Math.random() * (double) this.aClass153_1.anInt3781 + (double) this.aClass153_1.anInt3782) << 16 | (int) (Math.random() * (double) this.aClass153_1.anInt3746 + (double) this.aClass153_1.anInt3787) << 8;
					}
					@Pc(519) int local519 = this.aClass153_1.anInt3755;
					if (!arg1.method5948() && !this.aClass153_1.aBoolean253) {
						local519 = -1;
					}
					if (Static357.anInt6321 == Static227.anInt3811) {
						new Class28_Sub2_Sub1_Sub1(this, local190, local198, local202, local216, local210, local222, local358, local375, local455, local391, local519, this.aClass153_1.aBoolean252, this.aClass153_1.aBoolean249);
					} else {
						@Pc(539) Class28_Sub2_Sub1_Sub1 local539 = Static407.aClass28_Sub2_Sub1_Sub1Array2[Static227.anInt3811];
						Static227.anInt3811 = Static227.anInt3811 + 1 & 0x3FF;
						local539.method3628(this, local190, local198, local202, local216, local210, local222, local358, local375, local455, local391, local519, this.aClass153_1.aBoolean252, this.aClass153_1.aBoolean249);
					}
				}
			}
		}
		this.anInt5687 = 0;
		for (@Pc(602) Class28_Sub2_Sub1_Sub1 local602 = (Class28_Sub2_Sub1_Sub1) this.aClass97_6.method2145(); local602 != null; local602 = (Class28_Sub2_Sub1_Sub1) this.aClass97_6.method2148()) {
			local602.method3629(arg0, arg2);
			this.anInt5687++;
		}
		Static313.anInt5629 += this.anInt5687;
	}
}
