import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public final class Class3_Sub6 extends Class3 {

	@OriginalMember(owner = "client!mo", name = "j", descriptor = "I")
	private int anInt4628;

	@OriginalMember(owner = "client!mo", name = "l", descriptor = "I")
	private int anInt4630;

	@OriginalMember(owner = "client!mo", name = "m", descriptor = "I")
	public int anInt4631;

	@OriginalMember(owner = "client!mo", name = "n", descriptor = "I")
	private int anInt4632;

	@OriginalMember(owner = "client!mo", name = "o", descriptor = "I")
	private int anInt4633;

	@OriginalMember(owner = "client!mo", name = "p", descriptor = "I")
	private int anInt4634;

	@OriginalMember(owner = "client!mo", name = "q", descriptor = "I")
	private int anInt4635;

	@OriginalMember(owner = "client!mo", name = "t", descriptor = "I")
	private int anInt4637;

	@OriginalMember(owner = "client!mo", name = "u", descriptor = "I")
	private int anInt4638;

	@OriginalMember(owner = "client!mo", name = "x", descriptor = "I")
	private int anInt4641;

	@OriginalMember(owner = "client!mo", name = "B", descriptor = "I")
	private int anInt4643;

	@OriginalMember(owner = "client!mo", name = "C", descriptor = "I")
	private int anInt4644;

	@OriginalMember(owner = "client!mo", name = "D", descriptor = "I")
	private int anInt4645;

	@OriginalMember(owner = "client!mo", name = "F", descriptor = "I")
	private int anInt4647;

	@OriginalMember(owner = "client!mo", name = "H", descriptor = "I")
	private int anInt4648;

	@OriginalMember(owner = "client!mo", name = "J", descriptor = "I")
	public int anInt4650;

	@OriginalMember(owner = "client!mo", name = "L", descriptor = "I")
	private int anInt4651;

	@OriginalMember(owner = "client!mo", name = "M", descriptor = "I")
	public int anInt4652;

	@OriginalMember(owner = "client!mo", name = "O", descriptor = "I")
	public int anInt4653;

	@OriginalMember(owner = "client!mo", name = "S", descriptor = "I")
	private int anInt4655;

	@OriginalMember(owner = "client!mo", name = "A", descriptor = "I")
	private int anInt4642 = 0;

	@OriginalMember(owner = "client!mo", name = "z", descriptor = "Z")
	private boolean aBoolean426 = false;

	@OriginalMember(owner = "client!mo", name = "Q", descriptor = "Z")
	public boolean aBoolean427 = false;

	@OriginalMember(owner = "client!mo", name = "N", descriptor = "Lclient!ao;")
	public final Class3_Sub2 aClass3_Sub2_6;

	@OriginalMember(owner = "client!mo", name = "P", descriptor = "J")
	private final long aLong154;

	@OriginalMember(owner = "client!mo", name = "G", descriptor = "Lclient!bu;")
	public final Class29 aClass29_2;

	@OriginalMember(owner = "client!mo", name = "K", descriptor = "Lclient!jv;")
	public Class123 aClass123_1;

	@OriginalMember(owner = "client!mo", name = "s", descriptor = "Lclient!gn;")
	public final Class84 aClass84_6;

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(Lclient!ya;Lclient!bu;Lclient!ao;J)V")
	public Class3_Sub6(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class29 arg1, @OriginalArg(2) Class3_Sub2 arg2, @OriginalArg(3) long arg3) {
		this.aClass3_Sub2_6 = arg2;
		this.aLong154 = arg3;
		this.aClass29_2 = arg1;
		this.aClass123_1 = this.aClass29_2.method695();
		if (!arg0.method4279() && this.aClass123_1.anInt3807 != -1) {
			this.aClass123_1 = Static274.method3927(this.aClass123_1.anInt3807);
		}
		this.aClass84_6 = new Class84();
		this.anInt4642 = (int) ((double) this.anInt4642 + Math.random() * 64.0D);
		this.method3630();
	}

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "(I)V")
	public void method3630() {
		this.anInt4635 = this.aClass29_2.anInt711;
		this.anInt4633 = this.aClass29_2.anInt700;
		this.anInt4651 = this.aClass29_2.anInt707;
		this.anInt4630 = this.aClass29_2.anInt708;
		this.anInt4634 = this.aClass29_2.anInt701;
		this.anInt4638 = this.aClass29_2.anInt699;
		this.anInt4637 = this.aClass29_2.anInt702;
		this.anInt4645 = this.aClass29_2.anInt709;
		this.anInt4644 = this.aClass29_2.anInt703;
		if (this.anInt4638 == this.anInt4634 && this.anInt4634 == this.anInt4630 && this.anInt4637 == this.anInt4633 && this.anInt4637 == this.anInt4644 && this.anInt4651 == this.anInt4635 && this.anInt4645 == this.anInt4651) {
			this.aBoolean426 = true;
			return;
		}
		this.aBoolean426 = false;
		@Pc(122) int local122 = (this.anInt4630 + this.anInt4634 + this.anInt4638) / 3;
		@Pc(134) int local134 = (this.anInt4644 + this.anInt4633 + this.anInt4637) / 3;
		@Pc(146) int local146 = (this.anInt4645 + this.anInt4635 + this.anInt4651) / 3;
		if (this.anInt4631 == local122 && this.anInt4652 == local134 && local146 == this.anInt4653) {
			return;
		}
		this.anInt4652 = local134;
		this.anInt4653 = local146;
		this.anInt4631 = local122;
		@Pc(182) int local182 = this.anInt4634 - this.anInt4638;
		@Pc(189) int local189 = this.anInt4637 - this.anInt4633;
		@Pc(196) int local196 = this.anInt4651 - this.anInt4635;
		@Pc(202) int local202 = this.anInt4630 - this.anInt4638;
		@Pc(208) int local208 = this.anInt4644 - this.anInt4633;
		@Pc(215) int local215 = this.anInt4645 - this.anInt4635;
		this.anInt4655 = local208 * local182 - local189 * local202;
		this.anInt4648 = local215 * local189 - local196 * local208;
		this.anInt4628 = local202 * local196 - local182 * local215;
		while (this.anInt4648 > 32767 || this.anInt4628 > 32767 || this.anInt4655 > 32767 || this.anInt4648 < -32767 || this.anInt4628 < -32767 || this.anInt4655 < -32767) {
			this.anInt4648 >>= 0x1;
			this.anInt4628 >>= 0x1;
			this.anInt4655 >>= 0x1;
		}
		@Pc(317) int local317 = (int) Math.sqrt((double) (this.anInt4655 * this.anInt4655 + this.anInt4648 * this.anInt4648 + this.anInt4628 * this.anInt4628));
		if (local317 <= 0) {
			local317 = 1;
		}
		this.anInt4628 = this.anInt4628 * 32767 / local317;
		this.anInt4655 = this.anInt4655 * 32767 / local317;
		this.anInt4648 = this.anInt4648 * 32767 / local317;
		if (this.aClass123_1.aShort41 <= 0 && this.aClass123_1.aShort44 <= 0) {
			return;
		}
		@Pc(370) int local370 = (int) (Math.atan2((double) this.anInt4655, (double) this.anInt4648) * 2607.5945876176133D);
		@Pc(392) int local392 = (int) (Math.atan2((double) this.anInt4628, Math.sqrt((double) (this.anInt4648 * this.anInt4648 + this.anInt4655 * this.anInt4655))) * 2607.5945876176133D);
		this.anInt4643 = this.aClass123_1.aShort41 - this.aClass123_1.aShort42;
		this.anInt4641 = this.aClass123_1.aShort44 - this.aClass123_1.aShort43;
		this.anInt4632 = local370 + this.aClass123_1.aShort42 - (this.anInt4643 >> 1);
		this.anInt4647 = local392 + this.aClass123_1.aShort43 - (this.anInt4641 >> 1);
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIJZLclient!ya;)V")
	public void method3632(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class19 arg3) {
		@Pc(40) int local40;
		if (this.aBoolean427) {
			arg2 = false;
		} else if (this.aClass123_1.anInt3798 > Static216.anInt4008) {
			arg2 = false;
		} else if (Static272.anInt5116 > Static70.anIntArray113[Static216.anInt4008]) {
			arg2 = false;
		} else if (this.aBoolean426) {
			arg2 = false;
		} else if (this.aClass123_1.anInt3810 != -1) {
			local40 = (int) (arg1 - this.aLong154);
			if (this.aClass123_1.aBoolean353 || local40 <= this.aClass123_1.anInt3810) {
				local40 %= this.aClass123_1.anInt3810;
			} else {
				arg2 = false;
			}
			if (!this.aClass123_1.aBoolean355 && this.aClass123_1.lb > local40) {
				arg2 = false;
			}
			if (this.aClass123_1.aBoolean355 && this.aClass123_1.lb <= local40) {
				arg2 = false;
			}
		}
		if (arg2) {
			this.anInt4642 += (int) (((double) this.aClass123_1.anInt3818 + Math.random() * (double) (this.aClass123_1.anInt3773 - this.aClass123_1.anInt3818)) * (double) arg0);
			if (this.anInt4642 > 63) {
				local40 = this.anInt4642 >> 6;
				this.anInt4642 &= 0x3F;
				for (@Pc(151) int local151 = 0; local151 < local40; local151++) {
					@Pc(173) int local173;
					@Pc(170) int local170;
					@Pc(176) int local176;
					@Pc(188) int local188;
					@Pc(196) int local196;
					@Pc(200) int local200;
					@Pc(210) int local210;
					@Pc(218) int local218;
					@Pc(222) int local222;
					if (this.aClass123_1.aShort41 <= 0 && this.aClass123_1.aShort44 <= 0) {
						local170 = this.anInt4628;
						local173 = this.anInt4648;
						local176 = this.anInt4655;
					} else {
						local188 = (int) (Math.random() * (double) this.anInt4643) + this.anInt4632;
						@Pc(192) int local192 = local188 & 0x3FFF;
						local196 = Class50_Sub1.anIntArray225[local192];
						local200 = Class50_Sub1.anIntArray224[local192];
						local210 = this.anInt4647 + (int) (Math.random() * (double) this.anInt4641);
						@Pc(214) int local214 = local210 & 0x1FFF;
						local218 = Class50_Sub1.anIntArray225[local214];
						local222 = Class50_Sub1.anIntArray224[local214];
						local170 = (local222 << 0) * -1;
						local173 = local200 * local218 >> 15;
						local176 = local218 * local196 >> 15;
					}
					local188 = (int) (Math.random() * 65535.0D);
					local196 = (int) (Math.random() * 65535.0D);
					if (local188 + local196 > 65535) {
						local196 = 65535 - local196;
						local188 = 65535 - local188;
					}
					local200 = 65535 - local188 - local196;
					local210 = this.anInt4634 * local196 + this.anInt4638 * local188 + local200 * this.anInt4630 >> 16;
					local218 = local200 * this.anInt4644 + this.anInt4637 * local196 + local188 * this.anInt4633 >> 16;
					local222 = this.anInt4651 * local196 + this.anInt4635 * local188 + this.anInt4645 * local200 >> 16;
					@Pc(344) int local344 = (int) ((double) (this.aClass123_1.anInt3800 - this.aClass123_1.anInt3804) * Math.random()) + this.aClass123_1.anInt3804;
					@Pc(362) int local362 = this.aClass123_1.anInt3775 + (int) ((double) (this.aClass123_1.anInt3780 - this.aClass123_1.anInt3775) * Math.random());
					@Pc(379) int local379 = (int) (Math.random() * (double) (this.aClass123_1.anInt3816 - this.aClass123_1.anInt3788)) + this.aClass123_1.anInt3788;
					@Pc(441) int local441;
					if (this.aClass123_1.aBoolean360) {
						@Pc(445) double local445 = Math.random();
						local441 = (int) (Math.random() * (double) this.aClass123_1.anInt3820 + (double) this.aClass123_1.anInt3801) << 24 | (int) ((double) this.aClass123_1.anInt3783 + local445 * (double) this.aClass123_1.anInt3799) << 16 | (int) (local445 * (double) this.aClass123_1.anInt3774 + (double) this.aClass123_1.anInt3786) << 8 | (int) (local445 * (double) this.aClass123_1.anInt3785 + (double) this.aClass123_1.anInt3821);
					} else {
						local441 = (int) ((double) this.aClass123_1.anInt3801 + Math.random() * (double) this.aClass123_1.anInt3820) << 24 | (int) (Math.random() * (double) this.aClass123_1.anInt3799 + (double) this.aClass123_1.anInt3783) << 16 | (int) ((double) this.aClass123_1.anInt3786 + Math.random() * (double) this.aClass123_1.anInt3774) << 8 | (int) (Math.random() * (double) this.aClass123_1.anInt3785 + (double) this.aClass123_1.anInt3821);
					}
					@Pc(507) int local507 = this.aClass123_1.anInt3777;
					if (!arg3.method4279() && !this.aClass123_1.aBoolean358) {
						local507 = -1;
					}
					if (Static305.anInt5385 == Static357.anInt6240) {
						new Class3_Sub1_Sub1_Sub1(this, local210, local218, local222, local173, local170, local176, local344, local362, local441, local379, local507, this.aClass123_1.aBoolean357, this.aClass123_1.aBoolean354);
					} else {
						@Pc(547) Class3_Sub1_Sub1_Sub1 local547 = Static452.aClass3_Sub1_Sub1_Sub1Array2[Static357.anInt6240];
						Static357.anInt6240 = Static357.anInt6240 + 1 & 0x3FF;
						local547.method3305(this, local210, local218, local222, local173, local170, local176, local344, local362, local441, local379, local507, this.aClass123_1.aBoolean357, this.aClass123_1.aBoolean354);
					}
				}
			}
		}
		this.anInt4650 = 0;
		for (@Pc(586) Class3_Sub1_Sub1_Sub1 local586 = (Class3_Sub1_Sub1_Sub1) this.aClass84_6.method2312(); local586 != null; local586 = (Class3_Sub1_Sub1_Sub1) this.aClass84_6.method2309()) {
			local586.method3307(arg1, arg0);
			this.anInt4650++;
		}
		Static435.anInt7099 += this.anInt4650;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(ZJ)V")
	public void method3635(@OriginalArg(1) long arg0) {
		for (@Pc(21) Class3_Sub1_Sub1_Sub1 local21 = (Class3_Sub1_Sub1_Sub1) this.aClass84_6.method2312(); local21 != null; local21 = (Class3_Sub1_Sub1_Sub1) this.aClass84_6.method2309()) {
			local21.method3304(arg0);
		}
	}
}
