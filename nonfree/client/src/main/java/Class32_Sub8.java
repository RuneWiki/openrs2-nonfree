import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class32_Sub8 extends Class32 {

	@OriginalMember(owner = "client!vi", name = "m", descriptor = "I")
	private int anInt6479;

	@OriginalMember(owner = "client!vi", name = "n", descriptor = "I")
	public int anInt6480;

	@OriginalMember(owner = "client!vi", name = "q", descriptor = "I")
	private int anInt6482;

	@OriginalMember(owner = "client!vi", name = "t", descriptor = "I")
	public int anInt6483;

	@OriginalMember(owner = "client!vi", name = "v", descriptor = "I")
	private int anInt6485;

	@OriginalMember(owner = "client!vi", name = "z", descriptor = "I")
	private int anInt6487;

	@OriginalMember(owner = "client!vi", name = "B", descriptor = "I")
	private int anInt6488;

	@OriginalMember(owner = "client!vi", name = "D", descriptor = "I")
	public int anInt6489;

	@OriginalMember(owner = "client!vi", name = "E", descriptor = "I")
	private int anInt6490;

	@OriginalMember(owner = "client!vi", name = "F", descriptor = "I")
	private int anInt6491;

	@OriginalMember(owner = "client!vi", name = "I", descriptor = "I")
	private int anInt6493;

	@OriginalMember(owner = "client!vi", name = "J", descriptor = "I")
	private int anInt6494;

	@OriginalMember(owner = "client!vi", name = "K", descriptor = "I")
	private int anInt6495;

	@OriginalMember(owner = "client!vi", name = "L", descriptor = "I")
	private int anInt6496;

	@OriginalMember(owner = "client!vi", name = "M", descriptor = "I")
	private int anInt6497;

	@OriginalMember(owner = "client!vi", name = "N", descriptor = "I")
	private int anInt6498;

	@OriginalMember(owner = "client!vi", name = "P", descriptor = "I")
	public int anInt6500;

	@OriginalMember(owner = "client!vi", name = "R", descriptor = "I")
	private int anInt6502;

	@OriginalMember(owner = "client!vi", name = "U", descriptor = "I")
	private int anInt6504;

	@OriginalMember(owner = "client!vi", name = "V", descriptor = "I")
	private int anInt6505;

	@OriginalMember(owner = "client!vi", name = "o", descriptor = "Z")
	public boolean aBoolean485 = false;

	@OriginalMember(owner = "client!vi", name = "p", descriptor = "I")
	private int anInt6481 = 0;

	@OriginalMember(owner = "client!vi", name = "A", descriptor = "Z")
	private boolean aBoolean486 = false;

	@OriginalMember(owner = "client!vi", name = "s", descriptor = "Lclient!ai;")
	public final Class6 aClass6_2;

	@OriginalMember(owner = "client!vi", name = "H", descriptor = "Lclient!dj;")
	public final Class32_Sub2 aClass32_Sub2_5;

	@OriginalMember(owner = "client!vi", name = "x", descriptor = "J")
	private final long aLong212;

	@OriginalMember(owner = "client!vi", name = "y", descriptor = "Lclient!md;")
	public Class132 aClass132_1;

	@OriginalMember(owner = "client!vi", name = "C", descriptor = "Lclient!tg;")
	public final Class195 aClass195_9;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lclient!fp;Lclient!ai;Lclient!dj;J)V")
	public Class32_Sub8(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class6 arg1, @OriginalArg(2) Class32_Sub2 arg2, @OriginalArg(3) long arg3) {
		this.aClass6_2 = arg1;
		this.aClass32_Sub2_5 = arg2;
		this.aLong212 = arg3;
		this.aClass132_1 = Static346.method5759(this.aClass6_2.anInt224);
		if (!arg0.method4654() && this.aClass132_1.anInt3935 != -1) {
			this.aClass132_1 = Static346.method5759(this.aClass132_1.anInt3935);
		}
		this.aClass195_9 = new Class195();
		this.anInt6481 = (int) ((double) this.anInt6481 + Math.random() * 64.0D);
		this.method5731();
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IJLclient!fp;IZ)V")
	public void method5730(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class63 arg2, @OriginalArg(4) boolean arg3) {
		@Pc(46) int local46;
		if (this.aBoolean485) {
			arg3 = false;
		} else if (Static85.anInt1913 < this.aClass132_1.anInt3893) {
			arg3 = false;
		} else if (Static131.anInt2837 > Static362.anIntArray513[Static85.anInt1913]) {
			arg3 = false;
		} else if (this.aBoolean486) {
			arg3 = false;
		} else if (this.aClass132_1.anInt3928 != -1) {
			local46 = (int) (arg1 - this.aLong212);
			if (this.aClass132_1.aBoolean290 || this.aClass132_1.anInt3928 >= local46) {
				local46 %= this.aClass132_1.anInt3928;
			} else {
				arg3 = false;
			}
			if (!this.aClass132_1.aBoolean289 && local46 < this.aClass132_1.anInt3889) {
				arg3 = false;
			}
			if (this.aClass132_1.aBoolean289 && local46 >= this.aClass132_1.anInt3889) {
				arg3 = false;
			}
		}
		if (arg3) {
			this.anInt6481 += (int) (((double) (this.aClass132_1.anInt3899 - this.aClass132_1.anInt3914) * Math.random() + (double) this.aClass132_1.anInt3914) * (double) arg0);
			if (this.anInt6481 > 63) {
				local46 = this.anInt6481 >> 6;
				this.anInt6481 &= 0x3F;
				for (@Pc(144) int local144 = 0; local144 < local46; local144++) {
					@Pc(203) int local203;
					@Pc(211) int local211;
					@Pc(217) int local217;
					@Pc(167) int local167;
					@Pc(175) int local175;
					@Pc(179) int local179;
					@Pc(189) int local189;
					@Pc(197) int local197;
					@Pc(207) int local207;
					if (this.aClass132_1.aShort50 <= 0 && this.aClass132_1.aShort53 <= 0) {
						local203 = this.anInt6497;
						local211 = this.anInt6495;
						local217 = this.anInt6479;
					} else {
						local167 = this.anInt6502 + (int) (Math.random() * (double) this.anInt6485);
						@Pc(171) int local171 = local167 & 0x3FFF;
						local175 = Class208.anIntArray479[local171];
						local179 = Class208.anIntArray478[local171];
						local189 = this.anInt6490 + (int) (Math.random() * (double) this.anInt6488);
						@Pc(193) int local193 = local189 & 0x1FFF;
						local197 = Class208.anIntArray479[local193];
						local203 = local179 * local197 >> 15;
						local207 = Class208.anIntArray478[local193];
						local211 = local207 * -1;
						local217 = local175 * local197 >> 15;
					}
					local167 = (int) (Math.random() * 65535.0D);
					local175 = (int) (Math.random() * 65535.0D);
					if (local175 + local167 > 65535) {
						local167 = 65535 - local167;
						local175 = 65535 - local175;
					}
					local179 = 65535 - local167 - local175;
					local189 = this.anInt6496 * local179 + this.anInt6491 * local167 + local175 * this.anInt6494 >> 16;
					local197 = this.anInt6493 * local167 + local175 * this.anInt6482 + this.anInt6487 * local179 >> 16;
					local207 = this.anInt6504 * local167 + this.anInt6505 * local175 + this.anInt6498 * local179 >> 16;
					@Pc(331) int local331 = (int) ((double) (this.aClass132_1.anInt3895 - this.aClass132_1.anInt3901) * Math.random()) + this.aClass132_1.anInt3901;
					@Pc(348) int local348 = (int) ((double) (this.aClass132_1.anInt3891 - this.aClass132_1.anInt3922) * Math.random()) + this.aClass132_1.anInt3922;
					@Pc(365) int local365 = this.aClass132_1.anInt3940 + (int) ((double) (this.aClass132_1.anInt3925 - this.aClass132_1.anInt3940) * Math.random());
					@Pc(427) int local427;
					if (this.aClass132_1.aBoolean292) {
						@Pc(431) double local431 = Math.random();
						local427 = (int) ((double) this.aClass132_1.anInt3894 * local431 + (double) this.aClass132_1.anInt3924) << 24 | (int) (local431 * (double) this.aClass132_1.anInt3908 + (double) this.aClass132_1.anInt3910) << 16 | (int) ((double) this.aClass132_1.anInt3939 + local431 * (double) this.aClass132_1.anInt3918) << 8 | (int) ((double) this.aClass132_1.anInt3917 + local431 * (double) this.aClass132_1.anInt3938);
					} else {
						local427 = (int) ((double) this.aClass132_1.anInt3894 * Math.random() + (double) this.aClass132_1.anInt3924) << 24 | (int) ((double) this.aClass132_1.anInt3938 * Math.random() + (double) this.aClass132_1.anInt3917) | (int) ((double) this.aClass132_1.anInt3939 + (double) this.aClass132_1.anInt3918 * Math.random()) << 8 | (int) ((double) this.aClass132_1.anInt3908 * Math.random() + (double) this.aClass132_1.anInt3910) << 16;
					}
					@Pc(493) int local493 = this.aClass132_1.anInt3898;
					if (!arg2.method4654() && !this.aClass132_1.aBoolean291) {
						local493 = -1;
					}
					if (Static139.anInt3008 == Static263.anInt5202) {
						new Class32_Sub3_Sub1_Sub1(this, local189, local197, local207, local203, local211, local217, local331, local348, local427, local365, local493, this.aClass132_1.aBoolean293);
					} else {
						@Pc(509) Class32_Sub3_Sub1_Sub1 local509 = Static324.aClass32_Sub3_Sub1_Sub1Array2[Static263.anInt5202];
						Static263.anInt5202 = Static263.anInt5202 + 1 & 0x3FF;
						local509.method2585(this, local189, local197, local207, local203, local211, local217, local331, local348, local427, local365, local493, this.aClass132_1.aBoolean293);
					}
				}
			}
		}
		this.anInt6489 = 0;
		for (@Pc(576) Class32_Sub3_Sub1_Sub1 local576 = (Class32_Sub3_Sub1_Sub1) this.aClass195_9.method5302(); local576 != null; local576 = (Class32_Sub3_Sub1_Sub1) this.aClass195_9.method5298()) {
			local576.method2586(arg1, arg0);
			this.anInt6489++;
		}
		Static240.anInt4900 += this.anInt6489;
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)V")
	public void method5731() {
		this.anInt6482 = this.aClass6_2.anInt222;
		this.anInt6504 = this.aClass6_2.anInt218;
		this.anInt6487 = this.aClass6_2.anInt226;
		this.anInt6491 = this.aClass6_2.anInt231;
		this.anInt6498 = this.aClass6_2.anInt230;
		this.anInt6493 = this.aClass6_2.anInt228;
		this.anInt6496 = this.aClass6_2.anInt229;
		this.anInt6505 = this.aClass6_2.anInt220;
		this.anInt6494 = this.aClass6_2.anInt232;
		if (this.anInt6491 == this.anInt6494 && this.anInt6494 == this.anInt6496 && this.anInt6482 == this.anInt6493 && this.anInt6487 == this.anInt6482 && this.anInt6505 == this.anInt6504 && this.anInt6498 == this.anInt6505) {
			this.aBoolean486 = true;
			return;
		}
		this.aBoolean486 = false;
		@Pc(106) int local106 = (this.anInt6496 + this.anInt6494 + this.anInt6491) / 3;
		@Pc(117) int local117 = (this.anInt6487 + this.anInt6482 + this.anInt6493) / 3;
		@Pc(136) int local136 = (this.anInt6504 + this.anInt6505 + this.anInt6498) / 3;
		if (local106 == this.anInt6500 && local117 == this.anInt6480 && this.anInt6483 == local136) {
			return;
		}
		this.anInt6480 = local117;
		this.anInt6500 = local106;
		this.anInt6483 = local136;
		@Pc(167) int local167 = this.anInt6494 - this.anInt6491;
		@Pc(174) int local174 = this.anInt6482 - this.anInt6493;
		@Pc(181) int local181 = this.anInt6505 - this.anInt6504;
		@Pc(188) int local188 = this.anInt6496 - this.anInt6491;
		@Pc(195) int local195 = this.anInt6487 - this.anInt6493;
		@Pc(202) int local202 = this.anInt6498 - this.anInt6504;
		this.anInt6479 = local195 * local167 - local174 * local188;
		this.anInt6497 = local202 * local174 - local181 * local195;
		this.anInt6495 = local188 * local181 - local202 * local167;
		while (this.anInt6497 > 32767 || this.anInt6495 > 32767 || this.anInt6479 > 32767 || this.anInt6497 < -32767 || this.anInt6495 < -32767 || this.anInt6479 < -32767) {
			this.anInt6495 >>= 0x1;
			this.anInt6479 >>= 0x1;
			this.anInt6497 >>= 0x1;
		}
		@Pc(305) int local305 = (int) Math.sqrt((double) (this.anInt6495 * this.anInt6495 + this.anInt6497 * this.anInt6497 + this.anInt6479 * this.anInt6479));
		if (local305 <= 0) {
			local305 = 1;
		}
		this.anInt6497 = this.anInt6497 * 32767 / local305;
		this.anInt6479 = this.anInt6479 * 32767 / local305;
		this.anInt6495 = this.anInt6495 * 32767 / local305;
		if (this.aClass132_1.aShort50 <= 0 && this.aClass132_1.aShort53 <= 0) {
			return;
		}
		@Pc(358) int local358 = (int) (Math.atan2((double) this.anInt6479, (double) this.anInt6497) * 2607.5945876176133D);
		@Pc(379) int local379 = (int) (Math.atan2((double) this.anInt6495, Math.sqrt((double) (this.anInt6497 * this.anInt6497 + this.anInt6479 * this.anInt6479))) * 2607.5945876176133D);
		this.anInt6485 = this.aClass132_1.aShort50 - this.aClass132_1.aShort52;
		this.anInt6502 = local358 + this.aClass132_1.aShort52 - (this.anInt6485 >> 1);
		this.anInt6488 = this.aClass132_1.aShort53 - this.aClass132_1.aShort51;
		this.anInt6490 = this.aClass132_1.aShort51 + local379 - (this.anInt6488 >> 1);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(JI)V")
	public void method5733(@OriginalArg(0) long arg0) {
		for (@Pc(11) Class32_Sub3_Sub1_Sub1 local11 = (Class32_Sub3_Sub1_Sub1) this.aClass195_9.method5302(); local11 != null; local11 = (Class32_Sub3_Sub1_Sub1) this.aClass195_9.method5298()) {
			local11.method2583(arg0);
		}
	}
}
