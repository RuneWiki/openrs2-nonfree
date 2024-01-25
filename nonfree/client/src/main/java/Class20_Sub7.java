import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kl")
public final class Class20_Sub7 extends Class20 {

	@OriginalMember(owner = "client!kl", name = "s", descriptor = "I")
	public int anInt5764;

	@OriginalMember(owner = "client!kl", name = "C", descriptor = "I")
	private int anInt5768;

	@OriginalMember(owner = "client!kl", name = "D", descriptor = "I")
	private int anInt5769;

	@OriginalMember(owner = "client!kl", name = "E", descriptor = "I")
	private int anInt5770;

	@OriginalMember(owner = "client!kl", name = "F", descriptor = "I")
	private int anInt5771;

	@OriginalMember(owner = "client!kl", name = "H", descriptor = "I")
	private int anInt5772;

	@OriginalMember(owner = "client!kl", name = "I", descriptor = "I")
	private int anInt5773;

	@OriginalMember(owner = "client!kl", name = "J", descriptor = "I")
	private int anInt5774;

	@OriginalMember(owner = "client!kl", name = "u", descriptor = "I")
	private int anInt5765 = 0;

	@OriginalMember(owner = "client!kl", name = "y", descriptor = "Z")
	public boolean aBoolean387 = false;

	@OriginalMember(owner = "client!kl", name = "v", descriptor = "Lclient!kt;")
	public Class177 aClass177_1 = new Class177();

	@OriginalMember(owner = "client!kl", name = "B", descriptor = "Lclient!kt;")
	private Class177 aClass177_2 = new Class177();

	@OriginalMember(owner = "client!kl", name = "G", descriptor = "Z")
	private boolean aBoolean388 = false;

	@OriginalMember(owner = "client!kl", name = "m", descriptor = "Lclient!wr;")
	public final Class382 aClass382_1;

	@OriginalMember(owner = "client!kl", name = "z", descriptor = "J")
	private final long aLong149;

	@OriginalMember(owner = "client!kl", name = "o", descriptor = "Lclient!paa;")
	public final Class20_Sub8 aClass20_Sub8_5;

	@OriginalMember(owner = "client!kl", name = "k", descriptor = "Lclient!gq;")
	public Class120 aClass120_1;

	@OriginalMember(owner = "client!kl", name = "q", descriptor = "Lclient!eia;")
	public final Class81 aClass81_5;

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lclient!ha;Lclient!wr;Lclient!paa;J)V")
	public Class20_Sub7(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class382 arg1, @OriginalArg(2) Class20_Sub8 arg2, @OriginalArg(3) long arg3) {
		this.aClass382_1 = arg1;
		this.aLong149 = arg3;
		this.aClass20_Sub8_5 = arg2;
		this.aClass120_1 = this.aClass382_1.method8976();
		if (!arg0.method8856() && this.aClass120_1.anInt3869 != -1) {
			this.aClass120_1 = Static105.method1741(this.aClass120_1.anInt3869);
		}
		this.aClass81_5 = new Class81();
		this.anInt5765 = (int) ((double) this.anInt5765 + Math.random() * 64.0D);
		this.method5055();
		this.aClass177_2.anInt5850 = this.aClass177_1.anInt5850;
		this.aClass177_2.anInt5840 = this.aClass177_1.anInt5840;
		this.aClass177_2.anInt5851 = this.aClass177_1.anInt5851;
		this.aClass177_2.anInt5839 = this.aClass177_1.anInt5839;
		this.aClass177_2.anInt5847 = this.aClass177_1.anInt5847;
		this.aClass177_2.anInt5848 = this.aClass177_1.anInt5848;
		this.aClass177_2.anInt5843 = this.aClass177_1.anInt5843;
		this.aClass177_2.anInt5842 = this.aClass177_1.anInt5842;
		this.aClass177_2.anInt5846 = this.aClass177_1.anInt5846;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lclient!ha;IJ)V")
	public void method5054(@OriginalArg(0) Class100 arg0, @OriginalArg(2) long arg1) {
		for (@Pc(11) Class20_Sub6_Sub1_Sub1 local11 = (Class20_Sub6_Sub1_Sub1) this.aClass81_5.method2118(); local11 != null; local11 = (Class20_Sub6_Sub1_Sub1) this.aClass81_5.method2128()) {
			local11.method7462(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V")
	public void method5055() {
		this.aClass177_1.anInt5839 = this.aClass382_1.anInt10687;
		this.aClass177_1.anInt5842 = this.aClass382_1.anInt10689;
		this.aClass177_1.anInt5847 = this.aClass382_1.anInt10679;
		this.aClass177_1.anInt5843 = this.aClass382_1.anInt10674;
		this.aClass177_1.anInt5851 = this.aClass382_1.anInt10678;
		this.aClass177_1.anInt5848 = this.aClass382_1.anInt10675;
		this.aClass177_1.anInt5846 = this.aClass382_1.anInt10676;
		this.aClass177_1.anInt5840 = this.aClass382_1.anInt10681;
		this.aClass177_1.anInt5850 = this.aClass382_1.anInt10685;
		if (this.aClass177_1.anInt5842 == this.aClass177_1.anInt5848 && this.aClass177_1.anInt5850 == this.aClass177_1.anInt5848 && this.aClass177_1.anInt5851 == this.aClass177_1.anInt5847 && this.aClass177_1.anInt5843 == this.aClass177_1.anInt5847 && this.aClass177_1.anInt5839 == this.aClass177_1.anInt5840 && this.aClass177_1.anInt5840 == this.aClass177_1.anInt5846) {
			this.aBoolean388 = true;
		} else if (this.aBoolean388) {
			this.aBoolean388 = false;
			this.aClass177_2.anInt5850 = this.aClass177_1.anInt5850;
			this.aClass177_2.anInt5842 = this.aClass177_1.anInt5842;
			this.aClass177_2.anInt5848 = this.aClass177_1.anInt5848;
			this.aClass177_2.anInt5846 = this.aClass177_1.anInt5846;
			this.aClass177_2.anInt5839 = this.aClass177_1.anInt5839;
			this.aClass177_2.anInt5847 = this.aClass177_1.anInt5847;
			this.aClass177_2.anInt5851 = this.aClass177_1.anInt5851;
			this.aClass177_2.anInt5840 = this.aClass177_1.anInt5840;
			this.aClass177_2.anInt5843 = this.aClass177_1.anInt5843;
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZZILclient!ha;J)V")
	public void method5056(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class100 arg2, @OriginalArg(4) long arg3) {
		@Pc(41) int local41;
		if (this.aBoolean387) {
			arg0 = false;
		} else if (Static544.anInt9351 < this.aClass120_1.anInt3862) {
			arg0 = false;
		} else if (Static184.anInt3781 > Static583.anIntArray595[Static544.anInt9351]) {
			arg0 = false;
		} else if (this.aBoolean388) {
			arg0 = false;
		} else if (this.aClass120_1.anInt3836 != -1) {
			local41 = (int) (arg3 - this.aLong149);
			if (this.aClass120_1.aBoolean279 || local41 <= this.aClass120_1.anInt3836) {
				local41 %= this.aClass120_1.anInt3836;
			} else {
				arg0 = false;
			}
			if (!this.aClass120_1.aBoolean276 && this.aClass120_1.anInt3872 > local41) {
				arg0 = false;
			}
			if (this.aClass120_1.aBoolean276 && this.aClass120_1.anInt3872 <= local41) {
				arg0 = false;
			}
		}
		if (arg0) {
			Static626.anInt10301++;
			local41 = (this.aClass177_1.anInt5842 + this.aClass177_1.anInt5848 + this.aClass177_1.anInt5850) / 3;
			@Pc(135) int local135 = (this.aClass177_1.anInt5851 + this.aClass177_1.anInt5847 + this.aClass177_1.anInt5843) / 3;
			@Pc(149) int local149 = (this.aClass177_1.anInt5846 + this.aClass177_1.anInt5840 + this.aClass177_1.anInt5839) / 3;
			@Pc(189) int local189;
			@Pc(198) int local198;
			@Pc(207) int local207;
			@Pc(216) int local216;
			@Pc(225) int local225;
			@Pc(234) int local234;
			@Pc(339) int local339;
			@Pc(392) int local392;
			@Pc(413) int local413;
			if (local41 != this.aClass177_1.anInt5841 || local135 != this.aClass177_1.anInt5849 || local149 != this.aClass177_1.anInt5837) {
				this.aClass177_1.anInt5841 = local41;
				this.aClass177_1.anInt5837 = local149;
				this.aClass177_1.anInt5849 = local135;
				local189 = this.aClass177_1.anInt5848 - this.aClass177_1.anInt5842;
				local198 = this.aClass177_1.anInt5847 - this.aClass177_1.anInt5851;
				local207 = this.aClass177_1.anInt5840 - this.aClass177_1.anInt5839;
				local216 = this.aClass177_1.anInt5850 - this.aClass177_1.anInt5842;
				local225 = this.aClass177_1.anInt5843 - this.aClass177_1.anInt5851;
				local234 = this.aClass177_1.anInt5846 - this.aClass177_1.anInt5839;
				this.anInt5769 = local225 * local189 - local198 * local216;
				this.anInt5768 = local216 * local207 - local234 * local189;
				this.anInt5774 = local234 * local198 - local225 * local207;
				while (true) {
					if (this.anInt5774 <= 32767 && this.anInt5768 <= 32767 && this.anInt5769 <= 32767 && this.anInt5774 >= -32767 && this.anInt5768 >= -32767 && this.anInt5769 >= -32767) {
						local339 = (int) Math.sqrt((double) (this.anInt5769 * this.anInt5769 + this.anInt5774 * this.anInt5774 + this.anInt5768 * this.anInt5768));
						if (local339 <= 0) {
							local339 = 1;
						}
						this.anInt5768 = this.anInt5768 * 32767 / local339;
						this.anInt5774 = this.anInt5774 * 32767 / local339;
						this.anInt5769 = this.anInt5769 * 32767 / local339;
						if (this.aClass120_1.aShort46 > 0 || this.aClass120_1.aShort49 > 0) {
							local392 = (int) (Math.atan2((double) this.anInt5769, (double) this.anInt5774) * 2607.5945876176133D);
							local413 = (int) (Math.atan2((double) this.anInt5768, Math.sqrt((double) (this.anInt5769 * this.anInt5769 + this.anInt5774 * this.anInt5774))) * 2607.5945876176133D);
							this.anInt5773 = this.aClass120_1.aShort46 - this.aClass120_1.aShort48;
							this.anInt5770 = this.aClass120_1.aShort49 - this.aClass120_1.aShort47;
							this.anInt5772 = local392 + this.aClass120_1.aShort48 - (this.anInt5773 >> 1);
							this.anInt5771 = local413 + this.aClass120_1.aShort47 - (this.anInt5770 >> 1);
						}
						break;
					}
					this.anInt5769 >>= 0x1;
					this.anInt5774 >>= 0x1;
					this.anInt5768 >>= 0x1;
				}
			}
			this.anInt5765 += (int) ((double) arg1 * ((double) this.aClass120_1.anInt3849 + Math.random() * (double) (this.aClass120_1.anInt3879 - this.aClass120_1.anInt3849)));
			if (this.anInt5765 > 63) {
				local189 = this.anInt5765 >> 6;
				this.anInt5765 &= 0x3F;
				for (local225 = 0; local225 < local189; local225++) {
					@Pc(553) int local553;
					@Pc(557) int local557;
					if (this.aClass120_1.aShort46 <= 0 && this.aClass120_1.aShort49 <= 0) {
						local207 = this.anInt5768;
						local198 = this.anInt5774;
						local216 = this.anInt5769;
					} else {
						local234 = this.anInt5772 + (int) (Math.random() * (double) this.anInt5773);
						local234 &= 0x3FFF;
						local339 = Class100_Sub1.anIntArray428[local234];
						local392 = Class100_Sub1.anIntArray429[local234];
						local413 = (int) (Math.random() * (double) this.anInt5770) + this.anInt5771;
						local413 &= 0x1FFF;
						local553 = Class100_Sub1.anIntArray428[local413];
						local557 = Class100_Sub1.anIntArray429[local413];
						local198 = local553 * local392 >> 13;
						local207 = (local557 << 1) * -1;
						local216 = local339 * local553 >> 13;
					}
					@Pc(591) float local591 = (float) Math.random();
					@Pc(594) float local594 = (float) Math.random();
					if (local594 + local591 > 1.0F) {
						local594 = 1.0F - local594;
						local591 = 1.0F - local591;
					}
					@Pc(615) float local615 = 1.0F - local594 - local591;
					local413 = (int) (local615 * (float) this.aClass177_1.anInt5850 + local591 * (float) this.aClass177_1.anInt5842 + local594 * (float) this.aClass177_1.anInt5848);
					local553 = (int) (local615 * (float) this.aClass177_1.anInt5843 + (float) this.aClass177_1.anInt5847 * local594 + (float) this.aClass177_1.anInt5851 * local591);
					local557 = (int) ((float) this.aClass177_1.anInt5840 * local594 + (float) this.aClass177_1.anInt5839 * local591 + (float) this.aClass177_1.anInt5846 * local615);
					@Pc(703) int local703 = (int) (local591 * (float) this.aClass177_2.anInt5842 + (float) this.aClass177_2.anInt5848 * local594 + local615 * (float) this.aClass177_2.anInt5850);
					@Pc(725) int local725 = (int) (local615 * (float) this.aClass177_2.anInt5843 + local591 * (float) this.aClass177_2.anInt5851 + local594 * (float) this.aClass177_2.anInt5847);
					@Pc(747) int local747 = (int) ((float) this.aClass177_2.anInt5846 * local615 + local591 * (float) this.aClass177_2.anInt5839 + (float) this.aClass177_2.anInt5840 * local594);
					@Pc(752) int local752 = local413 - local703;
					@Pc(757) int local757 = local553 - local725;
					@Pc(762) int local762 = local557 - local747;
					@Pc(771) int local771 = (int) ((double) local752 * Math.random() + (double) local703);
					@Pc(780) int local780 = (int) ((double) local725 + (double) local757 * Math.random());
					@Pc(789) int local789 = (int) ((double) local747 + Math.random() * (double) local762);
					@Pc(806) int local806 = (int) ((double) (this.aClass120_1.anInt3840 - this.aClass120_1.anInt3867) * Math.random()) + this.aClass120_1.anInt3867;
					@Pc(824) int local824 = this.aClass120_1.anInt3878 + (int) (Math.random() * (double) (this.aClass120_1.anInt3880 - this.aClass120_1.anInt3878));
					@Pc(842) int local842 = this.aClass120_1.anInt3845 + (int) (Math.random() * (double) (this.aClass120_1.anInt3854 - this.aClass120_1.anInt3845));
					@Pc(904) int local904;
					if (this.aClass120_1.aBoolean277) {
						@Pc(908) double local908 = Math.random();
						local904 = (int) ((double) this.aClass120_1.anInt3831 + local908 * (double) this.aClass120_1.anInt3852) | (int) ((double) this.aClass120_1.anInt3860 * local908 + (double) this.aClass120_1.anInt3861) << 8 | (int) ((double) this.aClass120_1.anInt3846 * local908 + (double) this.aClass120_1.anInt3865) << 16 | (int) ((double) this.aClass120_1.anInt3838 + Math.random() * (double) this.aClass120_1.anInt3876) << 24;
					} else {
						local904 = (int) ((double) this.aClass120_1.anInt3838 + (double) this.aClass120_1.anInt3876 * Math.random()) << 24 | (int) ((double) this.aClass120_1.anInt3831 + (double) this.aClass120_1.anInt3852 * Math.random()) | (int) (Math.random() * (double) this.aClass120_1.anInt3860 + (double) this.aClass120_1.anInt3861) << 8 | (int) ((double) this.aClass120_1.anInt3846 * Math.random() + (double) this.aClass120_1.anInt3865) << 16;
					}
					@Pc(970) int local970 = this.aClass120_1.anInt3884;
					if (!arg2.method8856() && !this.aClass120_1.aBoolean281) {
						local970 = -1;
					}
					if (Static316.anInt6067 == Static215.anInt4208) {
						new Class20_Sub6_Sub1_Sub1(this, local771, local780, local789, local198, local207, local216, local806, local824, local904, local842, local970, this.aClass120_1.aBoolean274, this.aClass120_1.aBoolean278);
					} else {
						@Pc(1010) Class20_Sub6_Sub1_Sub1 local1010 = Static569.aClass20_Sub6_Sub1_Sub1Array2[Static215.anInt4208];
						Static215.anInt4208 = Static215.anInt4208 + 1 & 0x3FF;
						local1010.method7464(this, local771, local780, local789, local198, local207, local216, local806, local824, local904, local842, local970, this.aClass120_1.aBoolean274, this.aClass120_1.aBoolean278);
					}
				}
			}
		}
		if (!this.aClass177_1.method5124(this.aClass177_2)) {
			@Pc(1054) Class177 local1054 = this.aClass177_2;
			this.aClass177_2 = this.aClass177_1;
			this.aClass177_1 = local1054;
			this.aClass177_1.anInt5841 = this.aClass177_2.anInt5841;
			this.aClass177_1.anInt5842 = this.aClass382_1.anInt10689;
			this.aClass177_1.anInt5848 = this.aClass382_1.anInt10675;
			this.aClass177_1.anInt5837 = this.aClass177_2.anInt5837;
			this.aClass177_1.anInt5839 = this.aClass382_1.anInt10687;
			this.aClass177_1.anInt5850 = this.aClass382_1.anInt10685;
			this.aClass177_1.anInt5847 = this.aClass382_1.anInt10679;
			this.aClass177_1.anInt5840 = this.aClass382_1.anInt10681;
			this.aClass177_1.anInt5843 = this.aClass382_1.anInt10674;
			this.aClass177_1.anInt5846 = this.aClass382_1.anInt10676;
			this.aClass177_1.anInt5851 = this.aClass382_1.anInt10678;
			this.aClass177_1.anInt5849 = this.aClass177_2.anInt5849;
		}
		this.anInt5764 = 0;
		for (@Pc(1147) Class20_Sub6_Sub1_Sub1 local1147 = (Class20_Sub6_Sub1_Sub1) this.aClass81_5.method2118(); local1147 != null; local1147 = (Class20_Sub6_Sub1_Sub1) this.aClass81_5.method2128()) {
			local1147.method7465(arg3, arg1);
			this.anInt5764++;
		}
		Static373.anInt6851 += this.anInt5764;
	}
}
