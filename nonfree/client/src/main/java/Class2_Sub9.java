import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class2_Sub9 extends Class2 {

	@OriginalMember(owner = "client!ta", name = "u", descriptor = "I")
	public int anInt9139;

	@OriginalMember(owner = "client!ta", name = "E", descriptor = "I")
	private int anInt9145;

	@OriginalMember(owner = "client!ta", name = "G", descriptor = "I")
	private int anInt9146;

	@OriginalMember(owner = "client!ta", name = "H", descriptor = "I")
	private int anInt9147;

	@OriginalMember(owner = "client!ta", name = "I", descriptor = "I")
	private int anInt9148;

	@OriginalMember(owner = "client!ta", name = "J", descriptor = "I")
	private int anInt9149;

	@OriginalMember(owner = "client!ta", name = "K", descriptor = "I")
	private int anInt9150;

	@OriginalMember(owner = "client!ta", name = "L", descriptor = "I")
	private int anInt9151;

	@OriginalMember(owner = "client!ta", name = "s", descriptor = "Z")
	public boolean aBoolean768 = false;

	@OriginalMember(owner = "client!ta", name = "k", descriptor = "I")
	private int anInt9134 = 0;

	@OriginalMember(owner = "client!ta", name = "x", descriptor = "Lclient!l;")
	public Class191 aClass191_1 = new Class191();

	@OriginalMember(owner = "client!ta", name = "D", descriptor = "Lclient!l;")
	private Class191 aClass191_2 = new Class191();

	@OriginalMember(owner = "client!ta", name = "F", descriptor = "Z")
	private boolean aBoolean769 = false;

	@OriginalMember(owner = "client!ta", name = "o", descriptor = "Lclient!aj;")
	public final Class2_Sub2 aClass2_Sub2_7;

	@OriginalMember(owner = "client!ta", name = "r", descriptor = "J")
	private final long aLong234;

	@OriginalMember(owner = "client!ta", name = "m", descriptor = "Lclient!al;")
	public final Class18 aClass18_2;

	@OriginalMember(owner = "client!ta", name = "C", descriptor = "Lclient!hd;")
	public Class125 aClass125_1;

	@OriginalMember(owner = "client!ta", name = "B", descriptor = "Lclient!wo;")
	public final Class375 aClass375_9;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lclient!ha;Lclient!al;Lclient!aj;J)V")
	public Class2_Sub9(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(2) Class2_Sub2 arg2, @OriginalArg(3) long arg3) {
		this.aClass2_Sub2_7 = arg2;
		this.aLong234 = arg3;
		this.aClass18_2 = arg1;
		this.aClass125_1 = this.aClass18_2.method261();
		if (!arg0.method6221() && this.aClass125_1.anInt4703 != -1) {
			this.aClass125_1 = Static528.method4109(this.aClass125_1.anInt4703);
		}
		this.aClass375_9 = new Class375();
		this.anInt9134 = (int) ((double) this.anInt9134 + Math.random() * 64.0D);
		this.method7545();
		this.aClass191_2.anInt6119 = this.aClass191_1.anInt6119;
		this.aClass191_2.anInt6124 = this.aClass191_1.anInt6124;
		this.aClass191_2.anInt6120 = this.aClass191_1.anInt6120;
		this.aClass191_2.anInt6118 = this.aClass191_1.anInt6118;
		this.aClass191_2.anInt6128 = this.aClass191_1.anInt6128;
		this.aClass191_2.anInt6127 = this.aClass191_1.anInt6127;
		this.aClass191_2.anInt6131 = this.aClass191_1.anInt6131;
		this.aClass191_2.anInt6125 = this.aClass191_1.anInt6125;
		this.aClass191_2.anInt6122 = this.aClass191_1.anInt6122;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!ha;IJ)V")
	public void method7541(@OriginalArg(0) Class33 arg0, @OriginalArg(2) long arg1) {
		for (@Pc(15) Class2_Sub4_Sub1_Sub1 local15 = (Class2_Sub4_Sub1_Sub1) this.aClass375_9.method8638(); local15 != null; local15 = (Class2_Sub4_Sub1_Sub1) this.aClass375_9.method8635()) {
			local15.method4332(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IZJLclient!ha;I)V")
	public void method7544(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Class33 arg3) {
		@Pc(49) int local49;
		if (this.aBoolean768) {
			arg1 = false;
		} else if (Static251.anInt5581 < this.aClass125_1.anInt4663) {
			arg1 = false;
		} else if (Static493.anInt8770 > Static398.anIntArray474[Static251.anInt5581]) {
			arg1 = false;
		} else if (this.aBoolean769) {
			arg1 = false;
		} else if (this.aClass125_1.anInt4694 != -1) {
			local49 = (int) (arg2 - this.aLong234);
			if (this.aClass125_1.aBoolean405 || local49 <= this.aClass125_1.anInt4694) {
				local49 %= this.aClass125_1.anInt4694;
			} else {
				arg1 = false;
			}
			if (!this.aClass125_1.aBoolean404 && this.aClass125_1.anInt4690 > local49) {
				arg1 = false;
			}
			if (this.aClass125_1.aBoolean404 && this.aClass125_1.anInt4690 <= local49) {
				arg1 = false;
			}
		}
		if (arg1) {
			Static396.anInt7579++;
			local49 = (this.aClass191_1.anInt6119 + this.aClass191_1.anInt6127 + this.aClass191_1.anInt6120) / 3;
			@Pc(133) int local133 = (this.aClass191_1.anInt6131 + this.aClass191_1.anInt6128 + this.aClass191_1.anInt6124) / 3;
			@Pc(148) int local148 = (this.aClass191_1.anInt6122 + this.aClass191_1.anInt6125 + this.aClass191_1.anInt6118) / 3;
			@Pc(192) int local192;
			@Pc(200) int local200;
			@Pc(209) int local209;
			@Pc(217) int local217;
			@Pc(226) int local226;
			@Pc(235) int local235;
			@Pc(339) int local339;
			@Pc(389) int local389;
			@Pc(410) int local410;
			if (this.aClass191_1.anInt6123 != local49 || local133 != this.aClass191_1.anInt6129 || local148 != this.aClass191_1.anInt6130) {
				this.aClass191_1.anInt6129 = local133;
				this.aClass191_1.anInt6130 = local148;
				this.aClass191_1.anInt6123 = local49;
				local192 = this.aClass191_1.anInt6119 - this.aClass191_1.anInt6127;
				local200 = this.aClass191_1.anInt6128 - this.aClass191_1.anInt6124;
				local209 = this.aClass191_1.anInt6125 - this.aClass191_1.anInt6122;
				local217 = this.aClass191_1.anInt6120 - this.aClass191_1.anInt6127;
				local226 = this.aClass191_1.anInt6131 - this.aClass191_1.anInt6124;
				local235 = this.aClass191_1.anInt6118 - this.aClass191_1.anInt6122;
				this.anInt9150 = local209 * local217 - local235 * local192;
				this.anInt9147 = local235 * local200 - local226 * local209;
				this.anInt9145 = local192 * local226 - local217 * local200;
				while (true) {
					if (this.anInt9147 <= 32767 && this.anInt9150 <= 32767 && this.anInt9145 <= 32767 && this.anInt9147 >= -32767 && this.anInt9150 >= -32767 && this.anInt9145 >= -32767) {
						local339 = (int) Math.sqrt((double) (this.anInt9145 * this.anInt9145 + this.anInt9150 * this.anInt9150 + this.anInt9147 * this.anInt9147));
						if (local339 <= 0) {
							local339 = 1;
						}
						this.anInt9145 = this.anInt9145 * 32767 / local339;
						this.anInt9147 = this.anInt9147 * 32767 / local339;
						this.anInt9150 = this.anInt9150 * 32767 / local339;
						if (this.aClass125_1.aShort44 > 0 || this.aClass125_1.aShort45 > 0) {
							local389 = (int) (Math.atan2((double) this.anInt9145, (double) this.anInt9147) * 2607.5945876176133D);
							local410 = (int) (Math.atan2((double) this.anInt9150, Math.sqrt((double) (this.anInt9145 * this.anInt9145 + this.anInt9147 * this.anInt9147))) * 2607.5945876176133D);
							this.anInt9151 = this.aClass125_1.aShort44 - this.aClass125_1.aShort42;
							this.anInt9146 = this.aClass125_1.aShort42 + local389 - (this.anInt9151 >> 1);
							this.anInt9148 = this.aClass125_1.aShort45 - this.aClass125_1.aShort43;
							this.anInt9149 = this.aClass125_1.aShort43 + local410 - (this.anInt9148 >> 1);
						}
						break;
					}
					this.anInt9145 >>= 0x1;
					this.anInt9150 >>= 0x1;
					this.anInt9147 >>= 0x1;
				}
			}
			this.anInt9134 += (int) ((Math.random() * (double) (this.aClass125_1.anInt4669 - this.aClass125_1.anInt4706) + (double) this.aClass125_1.anInt4706) * (double) arg0);
			if (this.anInt9134 > 63) {
				local192 = this.anInt9134 >> 6;
				this.anInt9134 &= 0x3F;
				for (local226 = 0; local226 < local192; local226++) {
					@Pc(551) int local551;
					@Pc(555) int local555;
					if (this.aClass125_1.aShort44 <= 0 && this.aClass125_1.aShort45 <= 0) {
						local200 = this.anInt9147;
						local217 = this.anInt9145;
						local209 = this.anInt9150;
					} else {
						local235 = (int) ((double) this.anInt9151 * Math.random()) + this.anInt9146;
						local235 &= 0x3FFF;
						local339 = Class3_Sub1_Sub2.anIntArray84[local235];
						local389 = Class3_Sub1_Sub2.anIntArray85[local235];
						local410 = (int) ((double) this.anInt9148 * Math.random()) + this.anInt9149;
						local410 &= 0x1FFF;
						local551 = Class3_Sub1_Sub2.anIntArray84[local410];
						local555 = Class3_Sub1_Sub2.anIntArray85[local410];
						local209 = (local555 << 1) * -1;
						local200 = local551 * local389 >> 13;
						local217 = local339 * local551 >> 13;
					}
					@Pc(589) float local589 = (float) Math.random();
					@Pc(592) float local592 = (float) Math.random();
					if (local589 + local592 > 1.0F) {
						local589 = 1.0F - local589;
						local592 = 1.0F - local592;
					}
					@Pc(614) float local614 = 1.0F - local589 - local592;
					local410 = (int) ((float) this.aClass191_1.anInt6119 * local592 + local589 * (float) this.aClass191_1.anInt6127 + (float) this.aClass191_1.anInt6120 * local614);
					local551 = (int) (local589 * (float) this.aClass191_1.anInt6124 + local592 * (float) this.aClass191_1.anInt6128 + (float) this.aClass191_1.anInt6131 * local614);
					local555 = (int) (local592 * (float) this.aClass191_1.anInt6125 + local589 * (float) this.aClass191_1.anInt6122 + (float) this.aClass191_1.anInt6118 * local614);
					@Pc(702) int local702 = (int) (local589 * (float) this.aClass191_2.anInt6127 + local592 * (float) this.aClass191_2.anInt6119 + (float) this.aClass191_2.anInt6120 * local614);
					@Pc(724) int local724 = (int) (local589 * (float) this.aClass191_2.anInt6124 + (float) this.aClass191_2.anInt6128 * local592 + local614 * (float) this.aClass191_2.anInt6131);
					@Pc(746) int local746 = (int) ((float) this.aClass191_2.anInt6125 * local592 + local589 * (float) this.aClass191_2.anInt6122 + (float) this.aClass191_2.anInt6118 * local614);
					@Pc(751) int local751 = local410 - local702;
					@Pc(756) int local756 = local551 - local724;
					@Pc(761) int local761 = local555 - local746;
					@Pc(770) int local770 = (int) ((double) local702 + (double) local751 * Math.random());
					@Pc(779) int local779 = (int) ((double) local724 + (double) local756 * Math.random());
					@Pc(788) int local788 = (int) ((double) local746 + Math.random() * (double) local761);
					@Pc(806) int local806 = this.aClass125_1.anInt4692 + (int) ((double) (this.aClass125_1.anInt4687 - this.aClass125_1.anInt4692) * Math.random());
					@Pc(822) int local822 = (int) ((double) (this.aClass125_1.anInt4712 - this.aClass125_1.anInt4673) * Math.random()) + this.aClass125_1.anInt4673;
					@Pc(838) int local838 = (int) (Math.random() * (double) (this.aClass125_1.anInt4662 - this.aClass125_1.anInt4689)) + this.aClass125_1.anInt4689;
					@Pc(902) int local902;
					if (this.aClass125_1.aBoolean407) {
						@Pc(844) double local844 = Math.random();
						local902 = (int) ((double) this.aClass125_1.anInt4666 * Math.random() + (double) this.aClass125_1.anInt4688) << 24 | (int) ((double) this.aClass125_1.anInt4671 * local844 + (double) this.aClass125_1.anInt4675) << 16 | (int) ((double) this.aClass125_1.anInt4680 * local844 + (double) this.aClass125_1.lb) << 8 | (int) (local844 * (double) this.aClass125_1.anInt4678 + (double) this.aClass125_1.anInt4683);
					} else {
						local902 = (int) (Math.random() * (double) this.aClass125_1.anInt4666 + (double) this.aClass125_1.anInt4688) << 24 | (int) ((double) this.aClass125_1.anInt4675 + (double) this.aClass125_1.anInt4671 * Math.random()) << 16 | (int) ((double) this.aClass125_1.lb + (double) this.aClass125_1.anInt4680 * Math.random()) << 8 | (int) ((double) this.aClass125_1.anInt4683 + (double) this.aClass125_1.anInt4678 * Math.random());
					}
					@Pc(966) int local966 = this.aClass125_1.anInt4684;
					if (!arg3.method6221() && !this.aClass125_1.aBoolean411) {
						local966 = -1;
					}
					if (Static483.anInt8591 == Static330.anInt6599) {
						new Class2_Sub4_Sub1_Sub1(this, local770, local779, local788, local200, local209, local217, local806, local822, local902, local838, local966, this.aClass125_1.aBoolean408, this.aClass125_1.aBoolean406);
					} else {
						@Pc(1006) Class2_Sub4_Sub1_Sub1 local1006 = Static267.aClass2_Sub4_Sub1_Sub1Array2[Static483.anInt8591];
						Static483.anInt8591 = Static483.anInt8591 + 1 & 0x3FF;
						local1006.method4334(this, local770, local779, local788, local200, local209, local217, local806, local822, local902, local838, local966, this.aClass125_1.aBoolean408, this.aClass125_1.aBoolean406);
					}
				}
			}
		}
		if (!this.aClass191_1.method5199(this.aClass191_2)) {
			@Pc(1050) Class191 local1050 = this.aClass191_2;
			this.aClass191_2 = this.aClass191_1;
			this.aClass191_1 = local1050;
			this.aClass191_1.anInt6119 = this.aClass18_2.anInt194;
			this.aClass191_1.anInt6122 = this.aClass18_2.anInt204;
			this.aClass191_1.anInt6128 = this.aClass18_2.anInt201;
			this.aClass191_1.anInt6127 = this.aClass18_2.anInt198;
			this.aClass191_1.anInt6118 = this.aClass18_2.anInt206;
			this.aClass191_1.anInt6124 = this.aClass18_2.anInt199;
			this.aClass191_1.anInt6129 = this.aClass191_2.anInt6129;
			this.aClass191_1.anInt6120 = this.aClass18_2.anInt208;
			this.aClass191_1.anInt6123 = this.aClass191_2.anInt6123;
			this.aClass191_1.anInt6130 = this.aClass191_2.anInt6130;
			this.aClass191_1.anInt6125 = this.aClass18_2.anInt200;
			this.aClass191_1.anInt6131 = this.aClass18_2.anInt207;
		}
		this.anInt9139 = 0;
		for (@Pc(1142) Class2_Sub4_Sub1_Sub1 local1142 = (Class2_Sub4_Sub1_Sub1) this.aClass375_9.method8638(); local1142 != null; local1142 = (Class2_Sub4_Sub1_Sub1) this.aClass375_9.method8635()) {
			local1142.method4331(arg2, arg0);
			this.anInt9139++;
		}
		Static342.anInt6740 += this.anInt9139;
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V")
	public void method7545() {
		this.aClass191_1.anInt6131 = this.aClass18_2.anInt207;
		this.aClass191_1.anInt6118 = this.aClass18_2.anInt206;
		this.aClass191_1.anInt6128 = this.aClass18_2.anInt201;
		this.aClass191_1.anInt6119 = this.aClass18_2.anInt194;
		this.aClass191_1.anInt6125 = this.aClass18_2.anInt200;
		this.aClass191_1.anInt6122 = this.aClass18_2.anInt204;
		this.aClass191_1.anInt6127 = this.aClass18_2.anInt198;
		this.aClass191_1.anInt6124 = this.aClass18_2.anInt199;
		this.aClass191_1.anInt6120 = this.aClass18_2.anInt208;
		if (this.aClass191_1.anInt6127 == this.aClass191_1.anInt6119 && this.aClass191_1.anInt6119 == this.aClass191_1.anInt6120 && this.aClass191_1.anInt6128 == this.aClass191_1.anInt6124 && this.aClass191_1.anInt6131 == this.aClass191_1.anInt6128 && this.aClass191_1.anInt6125 == this.aClass191_1.anInt6122 && this.aClass191_1.anInt6118 == this.aClass191_1.anInt6125) {
			this.aBoolean769 = true;
		} else if (this.aBoolean769) {
			this.aClass191_2.anInt6118 = this.aClass191_1.anInt6118;
			this.aClass191_2.anInt6125 = this.aClass191_1.anInt6125;
			this.aClass191_2.anInt6120 = this.aClass191_1.anInt6120;
			this.aClass191_2.anInt6119 = this.aClass191_1.anInt6119;
			this.aClass191_2.anInt6131 = this.aClass191_1.anInt6131;
			this.aClass191_2.anInt6122 = this.aClass191_1.anInt6122;
			this.aClass191_2.anInt6128 = this.aClass191_1.anInt6128;
			this.aBoolean769 = false;
			this.aClass191_2.anInt6124 = this.aClass191_1.anInt6124;
			this.aClass191_2.anInt6127 = this.aClass191_1.anInt6127;
		}
	}
}
