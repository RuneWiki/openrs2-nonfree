import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class13_Sub7 extends Class13 {

	@OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
	private int anInt6556;

	@OriginalMember(owner = "client!ug", name = "n", descriptor = "I")
	private int anInt6557;

	@OriginalMember(owner = "client!ug", name = "p", descriptor = "I")
	private int anInt6558;

	@OriginalMember(owner = "client!ug", name = "q", descriptor = "I")
	private int anInt6559;

	@OriginalMember(owner = "client!ug", name = "r", descriptor = "I")
	private int anInt6560;

	@OriginalMember(owner = "client!ug", name = "s", descriptor = "I")
	public int anInt6561;

	@OriginalMember(owner = "client!ug", name = "t", descriptor = "I")
	private int anInt6562;

	@OriginalMember(owner = "client!ug", name = "u", descriptor = "I")
	private int anInt6563;

	@OriginalMember(owner = "client!ug", name = "v", descriptor = "I")
	private int anInt6564;

	@OriginalMember(owner = "client!ug", name = "w", descriptor = "I")
	private int anInt6565;

	@OriginalMember(owner = "client!ug", name = "z", descriptor = "I")
	public int anInt6567;

	@OriginalMember(owner = "client!ug", name = "F", descriptor = "I")
	private int anInt6572;

	@OriginalMember(owner = "client!ug", name = "H", descriptor = "I")
	private int anInt6574;

	@OriginalMember(owner = "client!ug", name = "I", descriptor = "I")
	private int anInt6575;

	@OriginalMember(owner = "client!ug", name = "J", descriptor = "I")
	private int anInt6576;

	@OriginalMember(owner = "client!ug", name = "L", descriptor = "I")
	private int anInt6577;

	@OriginalMember(owner = "client!ug", name = "M", descriptor = "I")
	private int anInt6578;

	@OriginalMember(owner = "client!ug", name = "N", descriptor = "I")
	public int anInt6579;

	@OriginalMember(owner = "client!ug", name = "Q", descriptor = "I")
	private int anInt6581;

	@OriginalMember(owner = "client!ug", name = "S", descriptor = "I")
	public int anInt6582;

	@OriginalMember(owner = "client!ug", name = "K", descriptor = "Z")
	public boolean aBoolean537 = false;

	@OriginalMember(owner = "client!ug", name = "m", descriptor = "Z")
	private boolean aBoolean536 = false;

	@OriginalMember(owner = "client!ug", name = "O", descriptor = "I")
	private int anInt6580 = 0;

	@OriginalMember(owner = "client!ug", name = "P", descriptor = "Lclient!u;")
	public final Class239 aClass239_2;

	@OriginalMember(owner = "client!ug", name = "y", descriptor = "J")
	private final long aLong206;

	@OriginalMember(owner = "client!ug", name = "l", descriptor = "Lclient!ce;")
	public final Class13_Sub2 aClass13_Sub2_7;

	@OriginalMember(owner = "client!ug", name = "T", descriptor = "Lclient!kb;")
	public Class131 aClass131_1;

	@OriginalMember(owner = "client!ug", name = "R", descriptor = "Lclient!st;")
	public final Class227 aClass227_7;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Lclient!qa;Lclient!u;Lclient!ce;J)V")
	public Class13_Sub7(@OriginalArg(0) Class128 arg0, @OriginalArg(1) Class239 arg1, @OriginalArg(2) Class13_Sub2 arg2, @OriginalArg(3) long arg3) {
		this.aClass239_2 = arg1;
		this.aLong206 = arg3;
		this.aClass13_Sub2_7 = arg2;
		this.aClass131_1 = this.aClass239_2.method5013();
		if (!arg0.method3604() && this.aClass131_1.anInt3307 != -1) {
			this.aClass131_1 = Static217.method2877(this.aClass131_1.anInt3307);
		}
		this.aClass227_7 = new Class227();
		this.anInt6580 = (int) ((double) this.anInt6580 + Math.random() * 64.0D);
		this.method5043();
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(JI)V")
	public void method5039(@OriginalArg(0) long arg0) {
		for (@Pc(11) Class13_Sub1_Sub1_Sub1 local11 = (Class13_Sub1_Sub1_Sub1) this.aClass227_7.method4827(); local11 != null; local11 = (Class13_Sub1_Sub1_Sub1) this.aClass227_7.method4834()) {
			local11.method2737(arg0);
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IJZLclient!qa;B)V")
	public void method5042(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class128 arg3) {
		@Pc(36) int local36;
		if (this.aBoolean537) {
			arg2 = false;
		} else if (this.aClass131_1.anInt3285 > Static130.anInt2246) {
			arg2 = false;
		} else if (Static302.anInt5058 > Static157.anIntArray136[Static130.anInt2246]) {
			arg2 = false;
		} else if (this.aBoolean536) {
			arg2 = false;
		} else if (this.aClass131_1.anInt3292 != -1) {
			local36 = (int) (arg1 - this.aLong206);
			if (this.aClass131_1.aBoolean252 || this.aClass131_1.anInt3292 >= local36) {
				local36 %= this.aClass131_1.anInt3292;
			} else {
				arg2 = false;
			}
			if (!this.aClass131_1.aBoolean249 && local36 < this.aClass131_1.anInt3262) {
				arg2 = false;
			}
			if (this.aClass131_1.aBoolean249 && this.aClass131_1.anInt3262 <= local36) {
				arg2 = false;
			}
		}
		if (arg2) {
			this.anInt6580 += (int) ((double) arg0 * ((double) (this.aClass131_1.anInt3282 - this.aClass131_1.anInt3264) * Math.random() + (double) this.aClass131_1.anInt3264));
			if (this.anInt6580 > 63) {
				local36 = this.anInt6580 >> 6;
				this.anInt6580 &= 0x3F;
				for (@Pc(140) int local140 = 0; local140 < local36; local140++) {
					@Pc(214) int local214;
					@Pc(208) int local208;
					@Pc(220) int local220;
					@Pc(166) int local166;
					@Pc(174) int local174;
					@Pc(178) int local178;
					@Pc(188) int local188;
					@Pc(196) int local196;
					@Pc(200) int local200;
					if (this.aClass131_1.aShort43 <= 0 && this.aClass131_1.aShort40 <= 0) {
						local208 = this.anInt6558;
						local214 = this.anInt6559;
						local220 = this.anInt6576;
					} else {
						local166 = this.anInt6560 + (int) (Math.random() * (double) this.anInt6564);
						@Pc(170) int local170 = local166 & 0x3FFF;
						local174 = Class1_Sub1_Sub25.anIntArray249[local170];
						local178 = Class1_Sub1_Sub25.anIntArray248[local170];
						local188 = (int) ((double) this.anInt6574 * Math.random()) + this.anInt6575;
						@Pc(192) int local192 = local188 & 0x1FFF;
						local196 = Class1_Sub1_Sub25.anIntArray249[local192];
						local200 = Class1_Sub1_Sub25.anIntArray248[local192];
						local208 = (local200 << 0) * -1;
						local214 = local196 * local178 >> 15;
						local220 = local174 * local196 >> 15;
					}
					local166 = (int) (Math.random() * 65535.0D);
					local174 = (int) (Math.random() * 65535.0D);
					if (local174 + local166 > 65535) {
						local174 = 65535 - local174;
						local166 = 65535 - local166;
					}
					local178 = 65535 - local166 - local174;
					local188 = local178 * this.anInt6563 + local166 * this.anInt6581 + this.anInt6556 * local174 >> 16;
					local196 = this.anInt6577 * local174 + this.anInt6572 * local166 + this.anInt6557 * local178 >> 16;
					local200 = this.anInt6565 * local166 + local174 * this.anInt6562 + this.anInt6578 * local178 >> 16;
					@Pc(336) int local336 = this.aClass131_1.anInt3311 + (int) ((double) (this.aClass131_1.anInt3291 - this.aClass131_1.anInt3311) * Math.random());
					@Pc(353) int local353 = (int) ((double) (this.aClass131_1.anInt3301 - this.aClass131_1.anInt3278) * Math.random()) + this.aClass131_1.anInt3278;
					@Pc(370) int local370 = (int) (Math.random() * (double) (this.aClass131_1.anInt3265 - this.aClass131_1.anInt3293)) + this.aClass131_1.anInt3293;
					@Pc(432) int local432;
					if (this.aClass131_1.aBoolean251) {
						@Pc(436) double local436 = Math.random();
						local432 = (int) (Math.random() * (double) this.aClass131_1.anInt3274 + (double) this.aClass131_1.anInt3281) << 24 | (int) ((double) this.aClass131_1.anInt3316 * local436 + (double) this.aClass131_1.anInt3296) << 16 | (int) (local436 * (double) this.aClass131_1.anInt3275 + (double) this.aClass131_1.anInt3305) << 8 | (int) ((double) this.aClass131_1.anInt3290 + (double) this.aClass131_1.anInt3297 * local436);
					} else {
						local432 = (int) (Math.random() * (double) this.aClass131_1.anInt3297 + (double) this.aClass131_1.anInt3290) | (int) (Math.random() * (double) this.aClass131_1.anInt3316 + (double) this.aClass131_1.anInt3296) << 16 | (int) ((double) this.aClass131_1.anInt3305 + Math.random() * (double) this.aClass131_1.anInt3275) << 8 | (int) ((double) this.aClass131_1.anInt3281 + Math.random() * (double) this.aClass131_1.anInt3274) << 24;
					}
					@Pc(498) int local498 = this.aClass131_1.anInt3284;
					if (!arg3.method3604() && !this.aClass131_1.aBoolean248) {
						local498 = -1;
					}
					if (Static14.anInt274 == Static88.anInt1562) {
						new Class13_Sub1_Sub1_Sub1(this, local188, local196, local200, local214, local208, local220, local336, local353, local432, local370, local498, this.aClass131_1.aBoolean246, this.aClass131_1.aBoolean250);
					} else {
						@Pc(514) Class13_Sub1_Sub1_Sub1 local514 = Static341.aClass13_Sub1_Sub1_Sub1Array2[Static14.anInt274];
						Static14.anInt274 = Static14.anInt274 + 1 & 0x3FF;
						local514.method2734(this, local188, local196, local200, local214, local208, local220, local336, local353, local432, local370, local498, this.aClass131_1.aBoolean246, this.aClass131_1.aBoolean250);
					}
				}
			}
		}
		this.anInt6567 = 0;
		for (@Pc(581) Class13_Sub1_Sub1_Sub1 local581 = (Class13_Sub1_Sub1_Sub1) this.aClass227_7.method4827(); local581 != null; local581 = (Class13_Sub1_Sub1_Sub1) this.aClass227_7.method4834()) {
			local581.method2736(arg1, arg0);
			this.anInt6567++;
		}
		Static10.anInt225 += this.anInt6567;
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(Z)V")
	public void method5043() {
		this.anInt6572 = this.aClass239_2.anInt6503;
		this.anInt6581 = this.aClass239_2.anInt6507;
		this.anInt6557 = this.aClass239_2.anInt6520;
		this.anInt6556 = this.aClass239_2.anInt6506;
		this.anInt6562 = this.aClass239_2.anInt6519;
		this.anInt6565 = this.aClass239_2.anInt6511;
		this.anInt6578 = this.aClass239_2.anInt6509;
		this.anInt6577 = this.aClass239_2.anInt6518;
		this.anInt6563 = this.aClass239_2.anInt6517;
		if (this.anInt6581 == this.anInt6556 && this.anInt6563 == this.anInt6556 && this.anInt6577 == this.anInt6572 && this.anInt6557 == this.anInt6577 && this.anInt6565 == this.anInt6562 && this.anInt6578 == this.anInt6562) {
			this.aBoolean536 = true;
			return;
		}
		this.aBoolean536 = false;
		@Pc(113) int local113 = (this.anInt6563 + this.anInt6556 + this.anInt6581) / 3;
		@Pc(124) int local124 = (this.anInt6577 + this.anInt6572 + this.anInt6557) / 3;
		@Pc(135) int local135 = (this.anInt6578 + this.anInt6562 + this.anInt6565) / 3;
		if (local113 == this.anInt6561 && local124 == this.anInt6582 && local135 == this.anInt6579) {
			return;
		}
		this.anInt6582 = local124;
		this.anInt6561 = local113;
		this.anInt6579 = local135;
		@Pc(170) int local170 = this.anInt6556 - this.anInt6581;
		@Pc(177) int local177 = this.anInt6577 - this.anInt6572;
		@Pc(184) int local184 = this.anInt6562 - this.anInt6565;
		@Pc(191) int local191 = this.anInt6563 - this.anInt6581;
		@Pc(198) int local198 = this.anInt6557 - this.anInt6572;
		@Pc(205) int local205 = this.anInt6578 - this.anInt6565;
		this.anInt6559 = local177 * local205 - local198 * local184;
		this.anInt6576 = local198 * local170 - local191 * local177;
		this.anInt6558 = local191 * local184 - local205 * local170;
		while (this.anInt6559 > 32767 || this.anInt6558 > 32767 || this.anInt6576 > 32767 || this.anInt6559 < -32767 || this.anInt6558 < -32767 || this.anInt6576 < -32767) {
			this.anInt6558 >>= 0x1;
			this.anInt6559 >>= 0x1;
			this.anInt6576 >>= 0x1;
		}
		@Pc(310) int local310 = (int) Math.sqrt((double) (this.anInt6558 * this.anInt6558 + this.anInt6559 * this.anInt6559 + this.anInt6576 * this.anInt6576));
		if (local310 <= 0) {
			local310 = 1;
		}
		this.anInt6558 = this.anInt6558 * 32767 / local310;
		this.anInt6576 = this.anInt6576 * 32767 / local310;
		this.anInt6559 = this.anInt6559 * 32767 / local310;
		if (this.aClass131_1.aShort43 <= 0 && this.aClass131_1.aShort40 <= 0) {
			return;
		}
		@Pc(366) int local366 = (int) (Math.atan2((double) this.anInt6576, (double) this.anInt6559) * 2607.5945876176133D);
		@Pc(387) int local387 = (int) (Math.atan2((double) this.anInt6558, Math.sqrt((double) (this.anInt6559 * this.anInt6559 + this.anInt6576 * this.anInt6576))) * 2607.5945876176133D);
		this.anInt6564 = this.aClass131_1.aShort43 - this.aClass131_1.aShort41;
		this.anInt6574 = this.aClass131_1.aShort40 - this.aClass131_1.aShort42;
		this.anInt6560 = this.aClass131_1.aShort41 + local366 - (this.anInt6564 >> 1);
		this.anInt6575 = this.aClass131_1.aShort42 + local387 - (this.anInt6574 >> 1);
	}
}
