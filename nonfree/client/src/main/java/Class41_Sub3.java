import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lu")
public final class Class41_Sub3 extends Class41 {

	@OriginalMember(owner = "client!lu", name = "g", descriptor = "I")
	private int anInt4364;

	@OriginalMember(owner = "client!lu", name = "h", descriptor = "I")
	private int anInt4365;

	@OriginalMember(owner = "client!lu", name = "i", descriptor = "I")
	public int anInt4366;

	@OriginalMember(owner = "client!lu", name = "m", descriptor = "I")
	private int anInt4369;

	@OriginalMember(owner = "client!lu", name = "n", descriptor = "I")
	private int anInt4370;

	@OriginalMember(owner = "client!lu", name = "p", descriptor = "I")
	private int anInt4371;

	@OriginalMember(owner = "client!lu", name = "q", descriptor = "I")
	private int anInt4372;

	@OriginalMember(owner = "client!lu", name = "r", descriptor = "I")
	public int anInt4373;

	@OriginalMember(owner = "client!lu", name = "s", descriptor = "I")
	public int anInt4374;

	@OriginalMember(owner = "client!lu", name = "t", descriptor = "I")
	private int anInt4375;

	@OriginalMember(owner = "client!lu", name = "v", descriptor = "I")
	private int anInt4377;

	@OriginalMember(owner = "client!lu", name = "w", descriptor = "I")
	private int anInt4378;

	@OriginalMember(owner = "client!lu", name = "y", descriptor = "I")
	private int anInt4380;

	@OriginalMember(owner = "client!lu", name = "z", descriptor = "I")
	private int anInt4381;

	@OriginalMember(owner = "client!lu", name = "B", descriptor = "I")
	public int anInt4382;

	@OriginalMember(owner = "client!lu", name = "C", descriptor = "I")
	private int anInt4383;

	@OriginalMember(owner = "client!lu", name = "G", descriptor = "I")
	private int anInt4386;

	@OriginalMember(owner = "client!lu", name = "J", descriptor = "I")
	private int anInt4389;

	@OriginalMember(owner = "client!lu", name = "O", descriptor = "I")
	private int anInt4391;

	@OriginalMember(owner = "client!lu", name = "P", descriptor = "I")
	private int anInt4392;

	@OriginalMember(owner = "client!lu", name = "k", descriptor = "I")
	private int anInt4367 = 0;

	@OriginalMember(owner = "client!lu", name = "K", descriptor = "Z")
	public boolean aBoolean325 = false;

	@OriginalMember(owner = "client!lu", name = "N", descriptor = "Z")
	private boolean aBoolean326 = false;

	@OriginalMember(owner = "client!lu", name = "o", descriptor = "Lclient!e;")
	public final Class56 aClass56_2;

	@OriginalMember(owner = "client!lu", name = "A", descriptor = "J")
	private final long aLong116;

	@OriginalMember(owner = "client!lu", name = "E", descriptor = "Lclient!li;")
	public final Class41_Sub1 aClass41_Sub1_5;

	@OriginalMember(owner = "client!lu", name = "M", descriptor = "Lclient!jl;")
	public Class130 aClass130_1;

	@OriginalMember(owner = "client!lu", name = "j", descriptor = "Lclient!br;")
	public final Class27 aClass27_5;

	@OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(Lclient!qa;Lclient!e;Lclient!li;J)V")
	public Class41_Sub3(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(2) Class41_Sub1 arg2, @OriginalArg(3) long arg3) {
		this.aClass56_2 = arg1;
		this.aLong116 = arg3;
		this.aClass41_Sub1_5 = arg2;
		this.aClass130_1 = this.aClass56_2.method1455();
		if (!arg0.method4651() && this.aClass130_1.anInt3656 != -1) {
			this.aClass130_1 = Static38.method708(this.aClass130_1.anInt3656);
		}
		this.aClass27_5 = new Class27();
		this.anInt4367 = (int) ((double) this.anInt4367 + Math.random() * 64.0D);
		this.method3305();
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(B)V")
	public void method3305() {
		this.anInt4383 = this.aClass56_2.anInt1939;
		this.anInt4391 = this.aClass56_2.anInt1931;
		this.anInt4371 = this.aClass56_2.anInt1937;
		this.anInt4386 = this.aClass56_2.anInt1942;
		this.anInt4389 = this.aClass56_2.anInt1941;
		this.anInt4378 = this.aClass56_2.anInt1934;
		this.anInt4369 = this.aClass56_2.anInt1930;
		this.anInt4364 = this.aClass56_2.anInt1932;
		this.anInt4381 = this.aClass56_2.anInt1928;
		if (this.anInt4371 == this.anInt4391 && this.anInt4371 == this.anInt4381 && this.anInt4369 == this.anInt4386 && this.anInt4383 == this.anInt4386 && this.anInt4378 == this.anInt4389 && this.anInt4378 == this.anInt4364) {
			this.aBoolean326 = true;
			return;
		}
		this.aBoolean326 = false;
		@Pc(106) int local106 = (this.anInt4381 + this.anInt4371 + this.anInt4391) / 3;
		@Pc(117) int local117 = (this.anInt4383 + this.anInt4386 + this.anInt4369) / 3;
		@Pc(135) int local135 = (this.anInt4378 + this.anInt4389 + this.anInt4364) / 3;
		if (this.anInt4366 == local106 && local117 == this.anInt4373 && local135 == this.anInt4382) {
			return;
		}
		this.anInt4373 = local117;
		this.anInt4382 = local135;
		this.anInt4366 = local106;
		@Pc(167) int local167 = this.anInt4371 - this.anInt4391;
		@Pc(173) int local173 = this.anInt4386 - this.anInt4369;
		@Pc(180) int local180 = this.anInt4378 - this.anInt4389;
		@Pc(187) int local187 = this.anInt4381 - this.anInt4391;
		@Pc(194) int local194 = this.anInt4383 - this.anInt4369;
		@Pc(201) int local201 = this.anInt4364 - this.anInt4389;
		this.anInt4377 = local180 * local187 - local201 * local167;
		this.anInt4365 = local201 * local173 - local194 * local180;
		for (this.anInt4370 = local194 * local167 - local173 * local187; this.anInt4365 > 32767 || this.anInt4377 > 32767 || this.anInt4370 > 32767 || this.anInt4365 < -32767 || this.anInt4377 < -32767 || this.anInt4370 < -32767; this.anInt4370 >>= 0x1) {
			this.anInt4365 >>= 0x1;
			this.anInt4377 >>= 0x1;
		}
		@Pc(300) int local300 = (int) Math.sqrt((double) (this.anInt4365 * this.anInt4365 + this.anInt4377 * this.anInt4377 + this.anInt4370 * this.anInt4370));
		if (local300 <= 0) {
			local300 = 1;
		}
		this.anInt4370 = this.anInt4370 * 32767 / local300;
		this.anInt4377 = this.anInt4377 * 32767 / local300;
		this.anInt4365 = this.anInt4365 * 32767 / local300;
		if (this.aClass130_1.aShort66 <= 0 && this.aClass130_1.lb <= 0) {
			return;
		}
		@Pc(350) int local350 = (int) (Math.atan2((double) this.anInt4370, (double) this.anInt4365) * 2607.5945876176133D);
		@Pc(371) int local371 = (int) (Math.atan2((double) this.anInt4377, Math.sqrt((double) (this.anInt4365 * this.anInt4365 + this.anInt4370 * this.anInt4370))) * 2607.5945876176133D);
		this.anInt4380 = this.aClass130_1.aShort66 - this.aClass130_1.aShort65;
		this.anInt4392 = local350 + this.aClass130_1.aShort65 - (this.anInt4380 >> 1);
		this.anInt4372 = this.aClass130_1.lb - this.aClass130_1.aShort64;
		this.anInt4375 = local371 + this.aClass130_1.aShort64 - (this.anInt4372 >> 1);
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(JI)V")
	public void method3309(@OriginalArg(0) long arg0) {
		for (@Pc(13) Class41_Sub7_Sub1_Sub1 local13 = (Class41_Sub7_Sub1_Sub1) this.aClass27_5.method730(); local13 != null; local13 = (Class41_Sub7_Sub1_Sub1) this.aClass27_5.method735()) {
			local13.method5829(arg0);
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(ZIJLclient!qa;I)V")
	public void method3310(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Class30 arg3) {
		@Pc(41) int local41;
		if (this.aBoolean325) {
			arg0 = false;
		} else if (Static13.anInt399 < this.aClass130_1.anInt3692) {
			arg0 = false;
		} else if (Static356.anInt6386 > Static52.anIntArray87[Static13.anInt399]) {
			arg0 = false;
		} else if (this.aBoolean326) {
			arg0 = false;
		} else if (this.aClass130_1.anInt3650 != -1) {
			local41 = (int) (arg2 - this.aLong116);
			if (this.aClass130_1.aBoolean275 || local41 <= this.aClass130_1.anInt3650) {
				local41 %= this.aClass130_1.anInt3650;
			} else {
				arg0 = false;
			}
			if (!this.aClass130_1.aBoolean276 && local41 < this.aClass130_1.anInt3669) {
				arg0 = false;
			}
			if (this.aClass130_1.aBoolean276 && local41 >= this.aClass130_1.anInt3669) {
				arg0 = false;
			}
		}
		if (arg0) {
			this.anInt4367 += (int) (((double) (this.aClass130_1.anInt3686 - this.aClass130_1.anInt3668) * Math.random() + (double) this.aClass130_1.anInt3668) * (double) arg1);
			if (this.anInt4367 > 63) {
				local41 = this.anInt4367 >> 6;
				this.anInt4367 &= 0x3F;
				for (@Pc(145) int local145 = 0; local145 < local41; local145++) {
					@Pc(217) int local217;
					@Pc(211) int local211;
					@Pc(223) int local223;
					@Pc(168) int local168;
					@Pc(176) int local176;
					@Pc(180) int local180;
					@Pc(191) int local191;
					@Pc(199) int local199;
					@Pc(203) int local203;
					if (this.aClass130_1.aShort66 <= 0 && this.aClass130_1.lb <= 0) {
						local217 = this.anInt4365;
						local211 = this.anInt4377;
						local223 = this.anInt4370;
					} else {
						local168 = (int) (Math.random() * (double) this.anInt4380) + this.anInt4392;
						@Pc(172) int local172 = local168 & 0x3FFF;
						local176 = Class56.anIntArray119[local172];
						local180 = Class56.anIntArray120[local172];
						local191 = this.anInt4375 + (int) ((double) this.anInt4372 * Math.random());
						@Pc(195) int local195 = local191 & 0x1FFF;
						local199 = Class56.anIntArray119[local195];
						local203 = Class56.anIntArray120[local195];
						local211 = (local203 << 0) * -1;
						local217 = local180 * local199 >> 15;
						local223 = local176 * local199 >> 15;
					}
					local168 = (int) (Math.random() * 65535.0D);
					local176 = (int) (Math.random() * 65535.0D);
					if (local176 + local168 > 65535) {
						local176 = 65535 - local176;
						local168 = 65535 - local168;
					}
					local180 = 65535 - local176 - local168;
					local191 = local180 * this.anInt4381 + this.anInt4391 * local168 + local176 * this.anInt4371 >> 16;
					local199 = local180 * this.anInt4383 + local168 * this.anInt4369 + this.anInt4386 * local176 >> 16;
					local203 = local168 * this.anInt4389 + local176 * this.anInt4378 + this.anInt4364 * local180 >> 16;
					@Pc(337) int local337 = this.aClass130_1.anInt3644 + (int) ((double) (this.aClass130_1.anInt3688 - this.aClass130_1.anInt3644) * Math.random());
					@Pc(354) int local354 = (int) ((double) (this.aClass130_1.anInt3700 - this.aClass130_1.anInt3699) * Math.random()) + this.aClass130_1.anInt3699;
					@Pc(372) int local372 = this.aClass130_1.anInt3662 + (int) (Math.random() * (double) (this.aClass130_1.anInt3648 - this.aClass130_1.anInt3662));
					@Pc(436) int local436;
					if (this.aClass130_1.aBoolean279) {
						@Pc(378) double local378 = Math.random();
						local436 = (int) ((double) this.aClass130_1.anInt3657 * local378 + (double) this.aClass130_1.anInt3678) << 16 | (int) (local378 * (double) this.aClass130_1.anInt3673 + (double) this.aClass130_1.anInt3654) << 8 | (int) ((double) this.aClass130_1.anInt3663 + (double) this.aClass130_1.anInt3646 * local378) | (int) ((double) this.aClass130_1.anInt3675 * Math.random() + (double) this.aClass130_1.anInt3683) << 24;
					} else {
						local436 = (int) ((double) this.aClass130_1.anInt3646 * Math.random() + (double) this.aClass130_1.anInt3663) | (int) ((double) this.aClass130_1.anInt3654 + (double) this.aClass130_1.anInt3673 * Math.random()) << 8 | (int) (Math.random() * (double) this.aClass130_1.anInt3657 + (double) this.aClass130_1.anInt3678) << 16 | (int) ((double) this.aClass130_1.anInt3683 + Math.random() * (double) this.aClass130_1.anInt3675) << 24;
					}
					@Pc(500) int local500 = this.aClass130_1.anInt3682;
					if (!arg3.method4651() && !this.aClass130_1.aBoolean277) {
						local500 = -1;
					}
					if (Static136.anInt2639 == Static233.anInt4246) {
						new Class41_Sub7_Sub1_Sub1(this, local191, local199, local203, local217, local211, local223, local337, local354, local436, local372, local500, this.aClass130_1.aBoolean274, this.aClass130_1.aBoolean278);
					} else {
						@Pc(544) Class41_Sub7_Sub1_Sub1 local544 = Static298.aClass41_Sub7_Sub1_Sub1Array2[Static233.anInt4246];
						Static233.anInt4246 = Static233.anInt4246 + 1 & 0x3FF;
						local544.method5828(this, local191, local199, local203, local217, local211, local223, local337, local354, local436, local372, local500, this.aClass130_1.aBoolean274, this.aClass130_1.aBoolean278);
					}
				}
			}
		}
		this.anInt4374 = 0;
		for (@Pc(583) Class41_Sub7_Sub1_Sub1 local583 = (Class41_Sub7_Sub1_Sub1) this.aClass27_5.method730(); local583 != null; local583 = (Class41_Sub7_Sub1_Sub1) this.aClass27_5.method735()) {
			local583.method5830(arg2, arg1);
			this.anInt4374++;
		}
		Static375.anInt5262 += this.anInt4374;
	}
}
