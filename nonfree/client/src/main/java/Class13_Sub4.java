import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pp")
public final class Class13_Sub4 extends Class13 {

	@OriginalMember(owner = "client!pp", name = "i", descriptor = "I")
	private int anInt5661;

	@OriginalMember(owner = "client!pp", name = "j", descriptor = "I")
	public int anInt5662;

	@OriginalMember(owner = "client!pp", name = "l", descriptor = "I")
	private int anInt5664;

	@OriginalMember(owner = "client!pp", name = "o", descriptor = "I")
	private int anInt5666;

	@OriginalMember(owner = "client!pp", name = "p", descriptor = "I")
	private int anInt5667;

	@OriginalMember(owner = "client!pp", name = "q", descriptor = "I")
	public int anInt5668;

	@OriginalMember(owner = "client!pp", name = "r", descriptor = "I")
	private int anInt5669;

	@OriginalMember(owner = "client!pp", name = "t", descriptor = "I")
	private int anInt5670;

	@OriginalMember(owner = "client!pp", name = "v", descriptor = "I")
	private int anInt5671;

	@OriginalMember(owner = "client!pp", name = "x", descriptor = "I")
	public int anInt5672;

	@OriginalMember(owner = "client!pp", name = "y", descriptor = "I")
	private int anInt5673;

	@OriginalMember(owner = "client!pp", name = "z", descriptor = "I")
	private int anInt5674;

	@OriginalMember(owner = "client!pp", name = "A", descriptor = "I")
	public int anInt5675;

	@OriginalMember(owner = "client!pp", name = "C", descriptor = "I")
	private int anInt5676;

	@OriginalMember(owner = "client!pp", name = "I", descriptor = "I")
	private int anInt5679;

	@OriginalMember(owner = "client!pp", name = "J", descriptor = "I")
	private int anInt5680;

	@OriginalMember(owner = "client!pp", name = "M", descriptor = "I")
	private int anInt5682;

	@OriginalMember(owner = "client!pp", name = "N", descriptor = "I")
	private int anInt5683;

	@OriginalMember(owner = "client!pp", name = "O", descriptor = "I")
	private int anInt5684;

	@OriginalMember(owner = "client!pp", name = "R", descriptor = "I")
	private int anInt5685;

	@OriginalMember(owner = "client!pp", name = "m", descriptor = "I")
	private int anInt5665 = 0;

	@OriginalMember(owner = "client!pp", name = "B", descriptor = "Z")
	private boolean aBoolean408 = false;

	@OriginalMember(owner = "client!pp", name = "u", descriptor = "Z")
	public boolean aBoolean407 = false;

	@OriginalMember(owner = "client!pp", name = "n", descriptor = "Lclient!sm;")
	public final Class209 aClass209_1;

	@OriginalMember(owner = "client!pp", name = "s", descriptor = "Lclient!wp;")
	public final Class13_Sub8 aClass13_Sub8_5;

	@OriginalMember(owner = "client!pp", name = "Q", descriptor = "J")
	private final long aLong171;

	@OriginalMember(owner = "client!pp", name = "w", descriptor = "Lclient!tv;")
	public Class230 aClass230_1;

	@OriginalMember(owner = "client!pp", name = "F", descriptor = "Lclient!cr;")
	public final Class40 aClass40_5;

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lclient!qa;Lclient!sm;Lclient!wp;J)V")
	public Class13_Sub4(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class209 arg1, @OriginalArg(2) Class13_Sub8 arg2, @OriginalArg(3) long arg3) {
		this.aClass209_1 = arg1;
		this.aClass13_Sub8_5 = arg2;
		this.aLong171 = arg3;
		this.aClass230_1 = this.aClass209_1.method5149();
		if (!arg0.method2613() && this.aClass230_1.anInt6820 != -1) {
			this.aClass230_1 = Static117.method2134(this.aClass230_1.anInt6820);
		}
		this.aClass40_5 = new Class40();
		this.anInt5665 = (int) ((double) this.anInt5665 + Math.random() * 64.0D);
		this.method4567();
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(JB)V")
	public void method4566(@OriginalArg(0) long arg0) {
		for (@Pc(7) Class13_Sub3_Sub1_Sub1 local7 = (Class13_Sub3_Sub1_Sub1) this.aClass40_5.method1188(); local7 != null; local7 = (Class13_Sub3_Sub1_Sub1) this.aClass40_5.method1195()) {
			local7.method5350(arg0);
		}
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(I)V")
	public void method4567() {
		this.anInt5670 = this.aClass209_1.anInt6543;
		this.anInt5674 = this.aClass209_1.anInt6549;
		this.anInt5683 = this.aClass209_1.anInt6554;
		this.anInt5671 = this.aClass209_1.anInt6547;
		this.anInt5666 = this.aClass209_1.anInt6546;
		this.anInt5679 = this.aClass209_1.anInt6559;
		this.anInt5669 = this.aClass209_1.anInt6551;
		this.anInt5685 = this.aClass209_1.anInt6548;
		this.anInt5680 = this.aClass209_1.anInt6552;
		if (this.anInt5683 == this.anInt5674 && this.anInt5683 == this.anInt5680 && this.anInt5670 == this.anInt5669 && this.anInt5670 == this.anInt5679 && this.anInt5685 == this.anInt5671 && this.anInt5666 == this.anInt5671) {
			this.aBoolean408 = true;
			return;
		}
		this.aBoolean408 = false;
		@Pc(101) int local101 = (this.anInt5674 + this.anInt5683 + this.anInt5680) / 3;
		@Pc(112) int local112 = (this.anInt5679 + this.anInt5670 + this.anInt5669) / 3;
		@Pc(127) int local127 = (this.anInt5685 + this.anInt5671 + this.anInt5666) / 3;
		if (local101 == this.anInt5668 && local112 == this.anInt5662 && this.anInt5675 == local127) {
			return;
		}
		this.anInt5675 = local127;
		this.anInt5668 = local101;
		this.anInt5662 = local112;
		@Pc(168) int local168 = this.anInt5683 - this.anInt5674;
		@Pc(175) int local175 = this.anInt5670 - this.anInt5669;
		@Pc(182) int local182 = this.anInt5671 - this.anInt5685;
		@Pc(189) int local189 = this.anInt5680 - this.anInt5674;
		@Pc(196) int local196 = this.anInt5679 - this.anInt5669;
		@Pc(203) int local203 = this.anInt5666 - this.anInt5685;
		this.anInt5664 = local196 * local168 - local189 * local175;
		this.anInt5661 = local175 * local203 - local196 * local182;
		this.anInt5684 = local189 * local182 - local203 * local168;
		while (this.anInt5661 > 32767 || this.anInt5684 > 32767 || this.anInt5664 > 32767 || this.anInt5661 < -32767 || this.anInt5684 < -32767 || this.anInt5664 < -32767) {
			this.anInt5684 >>= 0x1;
			this.anInt5661 >>= 0x1;
			this.anInt5664 >>= 0x1;
		}
		@Pc(300) int local300 = (int) Math.sqrt((double) (this.anInt5664 * this.anInt5664 + this.anInt5684 * this.anInt5684 + this.anInt5661 * this.anInt5661));
		if (local300 <= 0) {
			local300 = 1;
		}
		this.anInt5661 = this.anInt5661 * 32767 / local300;
		this.anInt5684 = this.anInt5684 * 32767 / local300;
		this.anInt5664 = this.anInt5664 * 32767 / local300;
		if (this.aClass230_1.aShort202 <= 0 && this.aClass230_1.aShort203 <= 0) {
			return;
		}
		@Pc(356) int local356 = (int) (Math.atan2((double) this.anInt5664, (double) this.anInt5661) * 2607.5945876176133D);
		@Pc(377) int local377 = (int) (Math.atan2((double) this.anInt5684, Math.sqrt((double) (this.anInt5661 * this.anInt5661 + this.anInt5664 * this.anInt5664))) * 2607.5945876176133D);
		this.anInt5676 = this.aClass230_1.aShort202 - this.aClass230_1.aShort204;
		this.anInt5667 = this.aClass230_1.aShort203 - this.aClass230_1.aShort201;
		this.anInt5673 = local356 + this.aClass230_1.aShort204 - (this.anInt5676 >> 1);
		this.anInt5682 = this.aClass230_1.aShort201 + local377 - (this.anInt5667 >> 1);
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(ILclient!qa;ZIJ)V")
	public void method4568(@OriginalArg(1) Class75 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) long arg3) {
		@Pc(37) int local37;
		if (this.aBoolean407) {
			arg1 = false;
		} else if (this.aClass230_1.anInt6807 > Static305.anInt5572) {
			arg1 = false;
		} else if (Static186.anIntArray292[Static305.anInt5572] < Static437.anInt7470) {
			arg1 = false;
		} else if (this.aBoolean408) {
			arg1 = false;
		} else if (this.aClass230_1.anInt6814 != -1) {
			local37 = (int) (arg3 - this.aLong171);
			if (this.aClass230_1.aBoolean474 || local37 <= this.aClass230_1.anInt6814) {
				local37 %= this.aClass230_1.anInt6814;
			} else {
				arg1 = false;
			}
			if (!this.aClass230_1.aBoolean473 && local37 < this.aClass230_1.anInt6832) {
				arg1 = false;
			}
			if (this.aClass230_1.aBoolean473 && local37 >= this.aClass230_1.anInt6832) {
				arg1 = false;
			}
		}
		if (arg1) {
			this.anInt5665 += (int) ((double) arg2 * ((double) this.aClass230_1.anInt6841 + (double) (this.aClass230_1.anInt6845 - this.aClass230_1.anInt6841) * Math.random()));
			if (this.anInt5665 > 63) {
				local37 = this.anInt5665 >> 6;
				this.anInt5665 &= 0x3F;
				for (@Pc(150) int local150 = 0; local150 < local37; local150++) {
					@Pc(172) int local172;
					@Pc(175) int local175;
					@Pc(169) int local169;
					@Pc(187) int local187;
					@Pc(195) int local195;
					@Pc(199) int local199;
					@Pc(209) int local209;
					@Pc(217) int local217;
					@Pc(221) int local221;
					if (this.aClass230_1.aShort202 <= 0 && this.aClass230_1.aShort203 <= 0) {
						local169 = this.anInt5664;
						local172 = this.anInt5661;
						local175 = this.anInt5684;
					} else {
						local187 = (int) (Math.random() * (double) this.anInt5676) + this.anInt5673;
						@Pc(191) int local191 = local187 & 0x3FFF;
						local195 = Applet_Sub1.anIntArray85[local191];
						local199 = Applet_Sub1.anIntArray87[local191];
						local209 = (int) ((double) this.anInt5667 * Math.random()) + this.anInt5682;
						@Pc(213) int local213 = local209 & 0x1FFF;
						local217 = Applet_Sub1.anIntArray85[local213];
						local221 = Applet_Sub1.anIntArray87[local213];
						local172 = local217 * local199 >> 15;
						local175 = (local221 << 0) * -1;
						local169 = local195 * local217 >> 15;
					}
					local187 = (int) (Math.random() * 65535.0D);
					local195 = (int) (Math.random() * 65535.0D);
					if (local187 + local195 > 65535) {
						local195 = 65535 - local195;
						local187 = 65535 - local187;
					}
					local199 = 65535 - local187 - local195;
					local209 = this.anInt5683 * local195 + local187 * this.anInt5674 + local199 * this.anInt5680 >> 16;
					local217 = local199 * this.anInt5679 + local195 * this.anInt5670 + this.anInt5669 * local187 >> 16;
					local221 = this.anInt5666 * local199 + this.anInt5671 * local195 + this.anInt5685 * local187 >> 16;
					@Pc(342) int local342 = (int) (Math.random() * (double) (this.aClass230_1.anInt6849 - this.aClass230_1.anInt6829)) + this.aClass230_1.anInt6829;
					@Pc(359) int local359 = (int) ((double) (this.aClass230_1.anInt6844 - this.aClass230_1.anInt6842) * Math.random()) + this.aClass230_1.anInt6842;
					@Pc(377) int local377 = this.aClass230_1.anInt6806 + (int) ((double) (this.aClass230_1.anInt6813 - this.aClass230_1.anInt6806) * Math.random());
					@Pc(441) int local441;
					if (this.aClass230_1.aBoolean479) {
						@Pc(383) double local383 = Math.random();
						local441 = (int) ((double) this.aClass230_1.lb * Math.random() + (double) this.aClass230_1.anInt6853) << 24 | (int) ((double) this.aClass230_1.anInt6833 + local383 * (double) this.aClass230_1.anInt6837) | (int) ((double) this.aClass230_1.anInt6850 * local383 + (double) this.aClass230_1.anInt6848) << 8 | (int) ((double) this.aClass230_1.anInt6846 + (double) this.aClass230_1.anInt6835 * local383) << 16;
					} else {
						local441 = (int) ((double) this.aClass230_1.anInt6833 + (double) this.aClass230_1.anInt6837 * Math.random()) | (int) ((double) this.aClass230_1.anInt6846 + Math.random() * (double) this.aClass230_1.anInt6835) << 16 | (int) (Math.random() * (double) this.aClass230_1.anInt6850 + (double) this.aClass230_1.anInt6848) << 8 | (int) ((double) this.aClass230_1.anInt6853 + Math.random() * (double) this.aClass230_1.lb) << 24;
					}
					@Pc(505) int local505 = this.aClass230_1.anInt6822;
					if (!arg0.method2613() && !this.aClass230_1.aBoolean475) {
						local505 = -1;
					}
					if (Static124.anInt2682 == Static118.anInt2604) {
						new Class13_Sub3_Sub1_Sub1(this, local209, local217, local221, local172, local175, local169, local342, local359, local441, local377, local505, this.aClass230_1.aBoolean478, this.aClass230_1.aBoolean476);
					} else {
						@Pc(549) Class13_Sub3_Sub1_Sub1 local549 = Static263.aClass13_Sub3_Sub1_Sub1Array1[Static124.anInt2682];
						Static124.anInt2682 = Static124.anInt2682 + 1 & 0x3FF;
						local549.method5346(this, local209, local217, local221, local172, local175, local169, local342, local359, local441, local377, local505, this.aClass230_1.aBoolean478, this.aClass230_1.aBoolean476);
					}
				}
			}
		}
		this.anInt5672 = 0;
		for (@Pc(588) Class13_Sub3_Sub1_Sub1 local588 = (Class13_Sub3_Sub1_Sub1) this.aClass40_5.method1188(); local588 != null; local588 = (Class13_Sub3_Sub1_Sub1) this.aClass40_5.method1195()) {
			local588.method5349(arg3, arg2);
			this.anInt5672++;
		}
		Static217.anInt4262 += this.anInt5672;
	}
}
