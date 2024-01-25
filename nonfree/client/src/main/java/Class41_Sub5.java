import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class41_Sub5 extends Class41 {

	@OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
	public int anInt4483;

	@OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
	private int anInt4484;

	@OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
	private int anInt4485;

	@OriginalMember(owner = "client!ld", name = "p", descriptor = "I")
	private int anInt4486;

	@OriginalMember(owner = "client!ld", name = "s", descriptor = "I")
	private int anInt4487;

	@OriginalMember(owner = "client!ld", name = "t", descriptor = "I")
	private int anInt4488;

	@OriginalMember(owner = "client!ld", name = "u", descriptor = "I")
	private int anInt4489;

	@OriginalMember(owner = "client!ld", name = "y", descriptor = "I")
	private int anInt4491;

	@OriginalMember(owner = "client!ld", name = "C", descriptor = "I")
	public int anInt4493;

	@OriginalMember(owner = "client!ld", name = "F", descriptor = "I")
	private int anInt4494;

	@OriginalMember(owner = "client!ld", name = "G", descriptor = "I")
	private int anInt4495;

	@OriginalMember(owner = "client!ld", name = "H", descriptor = "I")
	private int anInt4496;

	@OriginalMember(owner = "client!ld", name = "I", descriptor = "I")
	public int anInt4497;

	@OriginalMember(owner = "client!ld", name = "K", descriptor = "I")
	private int anInt4499;

	@OriginalMember(owner = "client!ld", name = "N", descriptor = "I")
	public int anInt4502;

	@OriginalMember(owner = "client!ld", name = "Q", descriptor = "I")
	private int anInt4504;

	@OriginalMember(owner = "client!ld", name = "R", descriptor = "I")
	private int anInt4505;

	@OriginalMember(owner = "client!ld", name = "S", descriptor = "I")
	private int anInt4506;

	@OriginalMember(owner = "client!ld", name = "T", descriptor = "I")
	private int anInt4507;

	@OriginalMember(owner = "client!ld", name = "U", descriptor = "I")
	private int anInt4508;

	@OriginalMember(owner = "client!ld", name = "z", descriptor = "Z")
	private boolean aBoolean282 = false;

	@OriginalMember(owner = "client!ld", name = "P", descriptor = "Z")
	public boolean aBoolean284 = false;

	@OriginalMember(owner = "client!ld", name = "L", descriptor = "I")
	private int anInt4500 = 0;

	@OriginalMember(owner = "client!ld", name = "x", descriptor = "Lclient!cc;")
	public final Class41_Sub1 aClass41_Sub1_5;

	@OriginalMember(owner = "client!ld", name = "w", descriptor = "Lclient!gh;")
	public final Class94 aClass94_2;

	@OriginalMember(owner = "client!ld", name = "E", descriptor = "J")
	private final long aLong124;

	@OriginalMember(owner = "client!ld", name = "B", descriptor = "Lclient!vj;")
	public Class257 aClass257_1;

	@OriginalMember(owner = "client!ld", name = "o", descriptor = "Lclient!ik;")
	public final Class117 aClass117_6;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lclient!za;Lclient!gh;Lclient!cc;J)V")
	public Class41_Sub5(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class94 arg1, @OriginalArg(2) Class41_Sub1 arg2, @OriginalArg(3) long arg3) {
		this.aClass41_Sub1_5 = arg2;
		this.aClass94_2 = arg1;
		this.aLong124 = arg3;
		this.aClass257_1 = this.aClass94_2.method2163();
		if (!arg0.method5912() && this.aClass257_1.anInt7597 != -1) {
			this.aClass257_1 = Static58.method1083(this.aClass257_1.anInt7597);
		}
		this.aClass117_6 = new Class117();
		this.anInt4500 = (int) ((double) this.anInt4500 + Math.random() * 64.0D);
		this.method3474();
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(BJ)V")
	public void method3473(@OriginalArg(1) long arg0) {
		for (@Pc(9) Class41_Sub3_Sub2_Sub1 local9 = (Class41_Sub3_Sub2_Sub1) this.aClass117_6.method2967(); local9 != null; local9 = (Class41_Sub3_Sub2_Sub1) this.aClass117_6.method2970()) {
			local9.method4332(arg0);
		}
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(Z)V")
	public void method3474() {
		this.anInt4507 = this.aClass94_2.anInt2949;
		this.anInt4489 = this.aClass94_2.anInt2947;
		this.anInt4491 = this.aClass94_2.anInt2939;
		this.anInt4499 = this.aClass94_2.anInt2934;
		this.anInt4508 = this.aClass94_2.anInt2940;
		this.anInt4484 = this.aClass94_2.anInt2951;
		this.anInt4487 = this.aClass94_2.anInt2938;
		this.anInt4494 = this.aClass94_2.anInt2950;
		this.anInt4495 = this.aClass94_2.anInt2943;
		if (this.anInt4491 == this.anInt4495 && this.anInt4495 == this.anInt4487 && this.anInt4494 == this.anInt4507 && this.anInt4507 == this.anInt4508 && this.anInt4489 == this.anInt4499 && this.anInt4489 == this.anInt4484) {
			this.aBoolean282 = true;
			return;
		}
		this.aBoolean282 = false;
		@Pc(120) int local120 = (this.anInt4487 + this.anInt4495 + this.anInt4491) / 3;
		@Pc(131) int local131 = (this.anInt4507 + this.anInt4494 + this.anInt4508) / 3;
		@Pc(142) int local142 = (this.anInt4484 + this.anInt4489 + this.anInt4499) / 3;
		if (local120 == this.anInt4493 && local131 == this.anInt4497 && this.anInt4502 == local142) {
			return;
		}
		this.anInt4497 = local131;
		this.anInt4493 = local120;
		this.anInt4502 = local142;
		@Pc(182) int local182 = this.anInt4495 - this.anInt4491;
		@Pc(188) int local188 = this.anInt4507 - this.anInt4494;
		@Pc(195) int local195 = this.anInt4489 - this.anInt4499;
		@Pc(202) int local202 = this.anInt4487 - this.anInt4491;
		@Pc(208) int local208 = this.anInt4508 - this.anInt4494;
		@Pc(214) int local214 = this.anInt4484 - this.anInt4499;
		this.anInt4486 = local202 * local195 - local214 * local182;
		this.anInt4505 = local182 * local208 - local188 * local202;
		this.anInt4504 = local214 * local188 - local208 * local195;
		while (this.anInt4504 > 32767 || this.anInt4486 > 32767 || this.anInt4505 > 32767 || this.anInt4504 < -32767 || this.anInt4486 < -32767 || this.anInt4505 < -32767) {
			this.anInt4486 >>= 0x1;
			this.anInt4504 >>= 0x1;
			this.anInt4505 >>= 0x1;
		}
		@Pc(315) int local315 = (int) Math.sqrt((double) (this.anInt4505 * this.anInt4505 + this.anInt4486 * this.anInt4486 + this.anInt4504 * this.anInt4504));
		if (local315 <= 0) {
			local315 = 1;
		}
		this.anInt4504 = this.anInt4504 * 32767 / local315;
		this.anInt4486 = this.anInt4486 * 32767 / local315;
		this.anInt4505 = this.anInt4505 * 32767 / local315;
		if (this.aClass257_1.aShort109 <= 0 && this.aClass257_1.aShort106 <= 0) {
			return;
		}
		@Pc(368) int local368 = (int) (Math.atan2((double) this.anInt4505, (double) this.anInt4504) * 2607.5945876176133D);
		@Pc(389) int local389 = (int) (Math.atan2((double) this.anInt4486, Math.sqrt((double) (this.anInt4505 * this.anInt4505 + this.anInt4504 * this.anInt4504))) * 2607.5945876176133D);
		this.anInt4488 = this.aClass257_1.aShort109 - this.aClass257_1.aShort108;
		this.anInt4506 = this.aClass257_1.aShort106 - this.aClass257_1.aShort107;
		this.anInt4485 = this.aClass257_1.aShort108 + local368 - (this.anInt4488 >> 1);
		this.anInt4496 = this.aClass257_1.aShort107 + local389 - (this.anInt4506 >> 1);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(JLclient!za;ZZI)V")
	public void method3476(@OriginalArg(0) long arg0, @OriginalArg(1) Class106 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(37) int local37;
		if (this.aBoolean284) {
			arg2 = false;
		} else if (Static270.anInt5249 < this.aClass257_1.anInt7573) {
			arg2 = false;
		} else if (Static235.anIntArray438[Static270.anInt5249] < Static35.anInt977) {
			arg2 = false;
		} else if (this.aBoolean282) {
			arg2 = false;
		} else if (this.aClass257_1.anInt7558 != -1) {
			local37 = (int) (arg0 - this.aLong124);
			if (this.aClass257_1.aBoolean492 || local37 <= this.aClass257_1.anInt7558) {
				local37 %= this.aClass257_1.anInt7558;
			} else {
				arg2 = false;
			}
			if (!this.aClass257_1.aBoolean493 && local37 < this.aClass257_1.anInt7602) {
				arg2 = false;
			}
			if (this.aClass257_1.aBoolean493 && local37 >= this.aClass257_1.anInt7602) {
				arg2 = false;
			}
		}
		if (arg2) {
			this.anInt4500 += (int) ((Math.random() * (double) (this.aClass257_1.anInt7557 - this.aClass257_1.anInt7595) + (double) this.aClass257_1.anInt7595) * (double) arg3);
			if (this.anInt4500 > 63) {
				local37 = this.anInt4500 >> 6;
				this.anInt4500 &= 0x3F;
				for (@Pc(144) int local144 = 0; local144 < local37; local144++) {
					@Pc(219) int local219;
					@Pc(213) int local213;
					@Pc(225) int local225;
					@Pc(170) int local170;
					@Pc(178) int local178;
					@Pc(182) int local182;
					@Pc(193) int local193;
					@Pc(201) int local201;
					@Pc(205) int local205;
					if (this.aClass257_1.aShort109 <= 0 && this.aClass257_1.aShort106 <= 0) {
						local219 = this.anInt4504;
						local225 = this.anInt4505;
						local213 = this.anInt4486;
					} else {
						local170 = this.anInt4485 + (int) (Math.random() * (double) this.anInt4488);
						@Pc(174) int local174 = local170 & 0x3FFF;
						local178 = Class90_Sub1.anIntArray304[local174];
						local182 = Class90_Sub1.anIntArray303[local174];
						local193 = this.anInt4496 + (int) (Math.random() * (double) this.anInt4506);
						@Pc(197) int local197 = local193 & 0x1FFF;
						local201 = Class90_Sub1.anIntArray304[local197];
						local205 = Class90_Sub1.anIntArray303[local197];
						local213 = (local205 << 0) * -1;
						local219 = local201 * local182 >> 15;
						local225 = local178 * local201 >> 15;
					}
					local170 = (int) (Math.random() * 65535.0D);
					local178 = (int) (Math.random() * 65535.0D);
					if (local170 + local178 > 65535) {
						local170 = 65535 - local170;
						local178 = 65535 - local178;
					}
					local182 = 65535 - local170 - local178;
					local193 = (int) ((long) this.anInt4495 * (long) local178 + (long) local170 * (long) this.anInt4491 + (long) local182 * (long) this.anInt4487 >> 16);
					local201 = (int) ((long) this.anInt4508 * (long) local182 + (long) local178 * (long) this.anInt4507 + (long) local170 * (long) this.anInt4494 >> 16);
					local205 = (int) ((long) this.anInt4499 * (long) local170 + (long) this.anInt4489 * (long) local178 + (long) local182 * (long) this.anInt4484 >> 16);
					@Pc(359) int local359 = (int) (Math.random() * (double) (this.aClass257_1.anInt7601 - this.aClass257_1.anInt7599)) + this.aClass257_1.anInt7599;
					@Pc(375) int local375 = this.aClass257_1.anInt7568 + (int) (Math.random() * (double) (this.aClass257_1.anInt7587 - this.aClass257_1.anInt7568));
					@Pc(393) int local393 = this.aClass257_1.anInt7585 + (int) ((double) (this.aClass257_1.anInt7563 - this.aClass257_1.anInt7585) * Math.random());
					@Pc(455) int local455;
					if (this.aClass257_1.aBoolean491) {
						@Pc(459) double local459 = Math.random();
						local455 = (int) (Math.random() * (double) this.aClass257_1.anInt7576 + (double) this.aClass257_1.anInt7593) << 24 | (int) ((double) this.aClass257_1.anInt7577 + local459 * (double) this.aClass257_1.anInt7560) << 8 | (int) ((double) this.aClass257_1.anInt7572 + local459 * (double) this.aClass257_1.anInt7571) << 16 | (int) (local459 * (double) this.aClass257_1.anInt7584 + (double) this.aClass257_1.anInt7605);
					} else {
						local455 = (int) ((double) this.aClass257_1.anInt7571 * Math.random() + (double) this.aClass257_1.anInt7572) << 16 | (int) ((double) this.aClass257_1.anInt7577 + Math.random() * (double) this.aClass257_1.anInt7560) << 8 | (int) ((double) this.aClass257_1.anInt7605 + (double) this.aClass257_1.anInt7584 * Math.random()) | (int) ((double) this.aClass257_1.anInt7593 + Math.random() * (double) this.aClass257_1.anInt7576) << 24;
					}
					@Pc(521) int local521 = this.aClass257_1.anInt7565;
					if (!arg1.method5912() && !this.aClass257_1.aBoolean494) {
						local521 = -1;
					}
					if (Static3.anInt53 == Static131.anInt2929) {
						new Class41_Sub3_Sub2_Sub1(this, local193, local201, local205, local219, local213, local225, local359, local375, local455, local393, local521, this.aClass257_1.aBoolean490, this.aClass257_1.aBoolean495);
					} else {
						@Pc(565) Class41_Sub3_Sub2_Sub1 local565 = Static124.aClass41_Sub3_Sub2_Sub1Array2[Static3.anInt53];
						Static3.anInt53 = Static3.anInt53 + 1 & 0x3FF;
						local565.method4334(this, local193, local201, local205, local219, local213, local225, local359, local375, local455, local393, local521, this.aClass257_1.aBoolean490, this.aClass257_1.aBoolean495);
					}
				}
			}
		}
		this.anInt4483 = 0;
		for (@Pc(610) Class41_Sub3_Sub2_Sub1 local610 = (Class41_Sub3_Sub2_Sub1) this.aClass117_6.method2967(); local610 != null; local610 = (Class41_Sub3_Sub2_Sub1) this.aClass117_6.method2970()) {
			local610.method4335(arg0, arg3);
			this.anInt4483++;
		}
		Static50.anInt1218 += this.anInt4483;
	}
}
