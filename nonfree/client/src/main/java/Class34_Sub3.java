import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class34_Sub3 extends Class34 {

	@OriginalMember(owner = "client!ub", name = "t", descriptor = "I")
	private int anInt5523;

	@OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
	public int anInt5524;

	@OriginalMember(owner = "client!ub", name = "x", descriptor = "I")
	public int anInt5525;

	@OriginalMember(owner = "client!ub", name = "y", descriptor = "I")
	private int anInt5526;

	@OriginalMember(owner = "client!ub", name = "z", descriptor = "I")
	private int anInt5527;

	@OriginalMember(owner = "client!ub", name = "D", descriptor = "I")
	private int anInt5531;

	@OriginalMember(owner = "client!ub", name = "E", descriptor = "I")
	private int anInt5532;

	@OriginalMember(owner = "client!ub", name = "F", descriptor = "I")
	private int anInt5533;

	@OriginalMember(owner = "client!ub", name = "H", descriptor = "I")
	private int anInt5534;

	@OriginalMember(owner = "client!ub", name = "I", descriptor = "I")
	private int anInt5535;

	@OriginalMember(owner = "client!ub", name = "K", descriptor = "I")
	private int anInt5537;

	@OriginalMember(owner = "client!ub", name = "N", descriptor = "I")
	private int anInt5539;

	@OriginalMember(owner = "client!ub", name = "R", descriptor = "I")
	private int anInt5541;

	@OriginalMember(owner = "client!ub", name = "T", descriptor = "I")
	private int anInt5542;

	@OriginalMember(owner = "client!ub", name = "V", descriptor = "I")
	public int anInt5544;

	@OriginalMember(owner = "client!ub", name = "X", descriptor = "I")
	public int anInt5546;

	@OriginalMember(owner = "client!ub", name = "Y", descriptor = "I")
	private int anInt5547;

	@OriginalMember(owner = "client!ub", name = "Z", descriptor = "I")
	private int anInt5548;

	@OriginalMember(owner = "client!ub", name = "ab", descriptor = "I")
	private int anInt5549;

	@OriginalMember(owner = "client!ub", name = "bb", descriptor = "I")
	private int anInt5550;

	@OriginalMember(owner = "client!ub", name = "s", descriptor = "Z")
	public boolean aBoolean349 = true;

	@OriginalMember(owner = "client!ub", name = "r", descriptor = "Z")
	public boolean aBoolean348 = false;

	@OriginalMember(owner = "client!ub", name = "A", descriptor = "I")
	private int anInt5528 = 0;

	@OriginalMember(owner = "client!ub", name = "S", descriptor = "Lclient!q;")
	public Class135 aClass135_1;

	@OriginalMember(owner = "client!ub", name = "Q", descriptor = "Lclient!dc;")
	public Class34_Sub1 aClass34_Sub1_7;

	@OriginalMember(owner = "client!ub", name = "w", descriptor = "Lclient!qe;")
	public Class138 aClass138_3;

	@OriginalMember(owner = "client!ub", name = "db", descriptor = "J")
	private long aLong212;

	@OriginalMember(owner = "client!ub", name = "u", descriptor = "Lclient!bh;")
	public Class18 aClass18_2;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lclient!q;Lclient!dc;J)V")
	public Class34_Sub3(@OriginalArg(0) Class135 arg0, @OriginalArg(1) Class34_Sub1 arg1, @OriginalArg(2) long arg2) {
		this.aClass135_1 = arg0;
		this.aClass34_Sub1_7 = arg1;
		this.aClass138_3 = new Class138();
		this.aLong212 = arg2;
		this.aClass18_2 = this.aClass135_1.aClass18_1;
		this.anInt5528 = (int) ((double) this.anInt5528 + Math.random() * 64.0D);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIIIIIII)V")
	public void method4185(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		this.anInt5532 = arg8;
		this.anInt5547 = arg3;
		this.anInt5531 = arg5;
		this.anInt5542 = arg6;
		this.anInt5533 = arg1;
		this.anInt5535 = arg2;
		this.anInt5526 = arg0;
		@Pc(40) int local40 = (this.anInt5535 + this.anInt5526 + this.anInt5547) / 3 + this.aClass34_Sub1_7.anInt1047;
		this.anInt5523 = arg7;
		@Pc(63) int local63 = this.aClass34_Sub1_7.anInt1052 + (this.anInt5523 + this.anInt5531 + this.anInt5532) / 3;
		this.anInt5541 = arg4;
		@Pc(83) int local83 = (this.anInt5533 + this.anInt5541 + this.anInt5542) / 3 + this.aClass34_Sub1_7.anInt1046;
		if (local40 != this.anInt5524 || local83 != this.anInt5544 || this.anInt5546 != local63) {
			this.anInt5524 = local40;
			this.aBoolean349 = true;
			this.anInt5546 = local63;
			this.anInt5544 = local83;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(JIZIII)V")
	public void method4187(@OriginalArg(0) long arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(91) int local91;
		if (this.aBoolean348) {
			arg1 = false;
		} else if (this.aClass18_2.anInt527 > Static42.anInt1055) {
			arg1 = false;
		} else if (Static42.anInt1031 > Static166.anIntArray335[Static42.anInt1055]) {
			arg1 = false;
		} else if (this.anInt5526 == this.anInt5535 && this.anInt5547 == this.anInt5526 && this.anInt5533 == this.anInt5541 && this.anInt5542 == this.anInt5533 && this.anInt5531 == this.anInt5523 && this.anInt5532 == this.anInt5523) {
			arg1 = false;
		} else if (this.aClass18_2.anInt489 != -1) {
			local91 = (int) (arg0 - this.aLong212);
			if (this.aClass18_2.aBoolean26 || this.aClass18_2.anInt489 >= local91) {
				local91 %= this.aClass18_2.anInt489;
			} else {
				arg1 = false;
			}
			if (!this.aClass18_2.aBoolean29 && local91 < this.aClass18_2.anInt526) {
				arg1 = false;
			}
			if (this.aClass18_2.aBoolean29 && this.aClass18_2.anInt526 <= local91) {
				arg1 = false;
			}
		}
		if (arg1) {
			this.anInt5528 += (int) ((double) arg3 * (Math.random() * (double) (this.aClass18_2.anInt517 - this.aClass18_2.anInt520) + (double) this.aClass18_2.anInt520));
			if (this.anInt5528 > 63) {
				local91 = this.anInt5528 >> 6;
				this.anInt5528 &= 0x3F;
				@Pc(205) int local205;
				@Pc(219) int local219;
				@Pc(212) int local212;
				@Pc(226) int local226;
				@Pc(233) int local233;
				@Pc(240) int local240;
				@Pc(337) int local337;
				@Pc(392) int local392;
				@Pc(415) int local415;
				if (this.aBoolean349) {
					local205 = this.anInt5526 - this.anInt5535;
					local212 = this.anInt5523 - this.anInt5531;
					local219 = this.anInt5533 - this.anInt5541;
					local226 = this.anInt5547 - this.anInt5535;
					local233 = this.anInt5542 - this.anInt5541;
					local240 = this.anInt5532 - this.anInt5531;
					this.anInt5550 = local219 * local240 - local212 * local233;
					this.anInt5548 = local205 * local233 - local226 * local219;
					this.anInt5527 = local212 * local226 - local240 * local205;
					while (true) {
						if (this.anInt5550 <= 32767 && this.anInt5527 <= 32767 && this.anInt5548 <= 32767 && this.anInt5550 >= -32767 && this.anInt5527 >= -32767 && this.anInt5548 >= -32767) {
							local337 = (int) Math.sqrt((double) (this.anInt5550 * this.anInt5550 + this.anInt5527 * this.anInt5527 + this.anInt5548 * this.anInt5548));
							if (local337 <= 0) {
								local337 = 1;
							}
							this.anInt5550 = this.anInt5550 * 32767 / local337;
							this.anInt5527 = this.anInt5527 * 32767 / local337;
							this.anInt5548 = this.anInt5548 * 32767 / local337;
							if (this.aClass18_2.aShort7 > 0 || this.aClass18_2.aShort9 > 0) {
								local392 = (int) (Math.atan2((double) this.anInt5548, (double) this.anInt5550) * 2047.0D / 6.283185307179586D);
								local415 = (int) (Math.atan2((double) this.anInt5527, Math.sqrt((double) (this.anInt5550 * this.anInt5550 + this.anInt5548 * this.anInt5548))) * 2047.0D / 6.283185307179586D);
								this.anInt5539 = this.aClass18_2.aShort9 - this.aClass18_2.aShort8;
								@Pc(431) int local431 = local392 - this.aClass34_Sub1_7.anInt1050;
								this.anInt5537 = local415 + this.aClass18_2.aShort8 - this.anInt5539 / 2;
								this.anInt5549 = this.aClass18_2.aShort7 - this.aClass18_2.aShort10;
								this.anInt5534 = local431 + this.aClass18_2.aShort10 - this.anInt5549 / 2;
							} else if (this.aClass34_Sub1_7.anInt1050 != 0) {
								local392 = arg4 * this.anInt5550 + this.anInt5548 * arg2 >> 16;
								this.anInt5548 = this.anInt5548 * arg4 - this.anInt5550 * arg2 >> 16;
								this.anInt5550 = local392;
							}
							this.aBoolean349 = false;
							break;
						}
						this.anInt5550 >>= 0x1;
						this.anInt5548 >>= 0x1;
						this.anInt5527 >>= 0x1;
					}
				}
				for (local226 = 0; local226 < local91; local226++) {
					@Pc(596) int local596;
					if (this.aClass18_2.aShort7 <= 0 && this.aClass18_2.aShort9 <= 0) {
						local205 = this.anInt5550;
						local212 = this.anInt5548;
						local219 = this.anInt5527;
					} else {
						local233 = this.anInt5534 + (int) ((double) this.anInt5549 * Math.random());
						local392 = this.anInt5537 + (int) ((double) this.anInt5539 * Math.random());
						local233 &= 0x7FF;
						local240 = Class146.anIntArray461[local233] >> 1;
						local392 &= 0x3FF;
						local337 = Class146.anIntArray463[local233] >> 1;
						local415 = Class146.anIntArray461[local392] >> 1;
						local212 = local240 * local415 >> 15;
						local596 = Class146.anIntArray463[local392] >> 1;
						local205 = local337 * local415 >> 15;
						local219 = local596 * -1;
					}
					local240 = (int) (Math.random() * 255.0D);
					local233 = (int) (Math.random() * 255.0D);
					local337 = (255 - local233) * local240 >> 8;
					local392 = 255 - local337 - local233;
					local596 = local233 * this.anInt5541 + local337 * this.anInt5533 + local392 * this.anInt5542 >> 8;
					local415 = local392 * this.anInt5547 + this.anInt5526 * local337 + local233 * this.anInt5535 >> 8;
					@Pc(684) int local684 = this.anInt5531 * local233 + local337 * this.anInt5523 + local392 * this.anInt5532 >> 8;
					@Pc(699) int local699;
					if (this.aClass34_Sub1_7.anInt1050 != 0) {
						local699 = arg2 * local684 + local415 * arg4 >> 16;
						local684 = local684 * arg4 - local415 * arg2 >> 16;
						local415 = local699;
					}
					local699 = this.aClass18_2.anInt484 + (int) ((double) (this.aClass18_2.anInt498 - this.aClass18_2.anInt484) * Math.random());
					@Pc(747) int local747 = (int) ((double) (this.aClass18_2.anInt503 - this.aClass18_2.anInt530) * Math.random()) + this.aClass18_2.anInt530;
					@Pc(809) int local809;
					if (this.aClass18_2.aBoolean25) {
						@Pc(813) double local813 = Math.random();
						local809 = (int) ((double) this.aClass18_2.anInt500 + (double) this.aClass18_2.anInt522 * local813) | (int) ((double) this.aClass18_2.anInt494 + (double) this.aClass18_2.anInt502 * local813) << 16 | (int) ((double) this.aClass18_2.anInt481 + (double) this.aClass18_2.anInt512 * local813) << 8 | (int) ((double) this.aClass18_2.anInt515 + (double) this.aClass18_2.anInt483 * local813) << 24;
					} else {
						local809 = (int) ((double) this.aClass18_2.anInt483 * Math.random() + (double) this.aClass18_2.anInt515) << 24 | (int) (Math.random() * (double) this.aClass18_2.anInt522 + (double) this.aClass18_2.anInt500) | (int) ((double) this.aClass18_2.anInt512 * Math.random() + (double) this.aClass18_2.anInt481) << 8 | (int) ((double) this.aClass18_2.anInt494 + Math.random() * (double) this.aClass18_2.anInt502) << 16;
					}
					if (Static42.anInt1032 == Static42.anInt1037) {
						new Class34_Sub2_Sub1(this, local415 + this.aClass34_Sub1_7.anInt1047, local596 + this.aClass34_Sub1_7.anInt1046, this.aClass34_Sub1_7.anInt1052 + local684, local205, local219, local212, local699, local747, local809);
					} else {
						@Pc(910) Class34_Sub2_Sub1 local910 = Static42.aClass34_Sub2_Sub1Array2[Static42.anInt1037];
						Static42.anInt1037 = Static42.anInt1037 + 1 & 0x3FF;
						local910.method1575(this, this.aClass34_Sub1_7.anInt1047 + local415, this.aClass34_Sub1_7.anInt1046 - -local596, this.aClass34_Sub1_7.anInt1052 + local684, local205, local219, local212, local699, local747, local809);
					}
				}
			}
		}
		this.anInt5525 = 0;
		for (@Pc(955) Class34_Sub2_Sub1 local955 = (Class34_Sub2_Sub1) this.aClass138_3.method3540(); local955 != null; local955 = (Class34_Sub2_Sub1) this.aClass138_3.method3536()) {
			local955.method1572(arg0, arg3);
			this.anInt5525++;
		}
		Static42.anInt1034 += this.anInt5525;
	}
}
