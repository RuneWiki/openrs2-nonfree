import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class20_Sub1 extends Class20 {

	@OriginalMember(owner = "client!bi", name = "k", descriptor = "I")
	private int anInt307;

	@OriginalMember(owner = "client!bi", name = "m", descriptor = "I")
	public int anInt309;

	@OriginalMember(owner = "client!bi", name = "n", descriptor = "I")
	private int anInt310;

	@OriginalMember(owner = "client!bi", name = "o", descriptor = "I")
	private int anInt311;

	@OriginalMember(owner = "client!bi", name = "p", descriptor = "I")
	public int anInt312;

	@OriginalMember(owner = "client!bi", name = "t", descriptor = "I")
	public int anInt316;

	@OriginalMember(owner = "client!bi", name = "w", descriptor = "I")
	private int anInt317;

	@OriginalMember(owner = "client!bi", name = "x", descriptor = "I")
	private int anInt318;

	@OriginalMember(owner = "client!bi", name = "y", descriptor = "I")
	private int anInt319;

	@OriginalMember(owner = "client!bi", name = "z", descriptor = "I")
	private int anInt320;

	@OriginalMember(owner = "client!bi", name = "E", descriptor = "I")
	private int anInt323;

	@OriginalMember(owner = "client!bi", name = "F", descriptor = "I")
	private int anInt324;

	@OriginalMember(owner = "client!bi", name = "G", descriptor = "I")
	public int anInt325;

	@OriginalMember(owner = "client!bi", name = "L", descriptor = "I")
	private int anInt330;

	@OriginalMember(owner = "client!bi", name = "O", descriptor = "I")
	private int anInt332;

	@OriginalMember(owner = "client!bi", name = "S", descriptor = "I")
	private int anInt334;

	@OriginalMember(owner = "client!bi", name = "U", descriptor = "I")
	private int anInt336;

	@OriginalMember(owner = "client!bi", name = "W", descriptor = "I")
	private int anInt338;

	@OriginalMember(owner = "client!bi", name = "X", descriptor = "I")
	private int anInt339;

	@OriginalMember(owner = "client!bi", name = "Y", descriptor = "I")
	private int anInt340;

	@OriginalMember(owner = "client!bi", name = "H", descriptor = "I")
	private int anInt326 = 0;

	@OriginalMember(owner = "client!bi", name = "P", descriptor = "Z")
	public boolean aBoolean20 = false;

	@OriginalMember(owner = "client!bi", name = "C", descriptor = "Z")
	public boolean aBoolean19 = true;

	@OriginalMember(owner = "client!bi", name = "u", descriptor = "Lclient!sk;")
	public Class161 aClass161_1;

	@OriginalMember(owner = "client!bi", name = "R", descriptor = "Lclient!ne;")
	public Class20_Sub3 aClass20_Sub3_1;

	@OriginalMember(owner = "client!bi", name = "N", descriptor = "Lclient!ug;")
	public Class175 aClass175_1;

	@OriginalMember(owner = "client!bi", name = "v", descriptor = "Lclient!ik;")
	public Class90 aClass90_1;

	@OriginalMember(owner = "client!bi", name = "D", descriptor = "J")
	private long aLong18;

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Lclient!sk;Lclient!ne;J)V")
	public Class20_Sub1(@OriginalArg(0) Class161 arg0, @OriginalArg(1) Class20_Sub3 arg1, @OriginalArg(2) long arg2) {
		this.aClass161_1 = arg0;
		this.aClass20_Sub3_1 = arg1;
		this.aClass175_1 = new Class175();
		this.aClass90_1 = this.aClass161_1.aClass90_2;
		this.aLong18 = arg2;
		this.anInt326 = (int) ((double) this.anInt326 + Math.random() * 64.0D);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIZIJI)V")
	public void method307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) long arg4) {
		@Pc(79) int local79;
		if (this.aBoolean20) {
			arg2 = false;
		} else if (Static184.anInt3523 < this.aClass90_1.anInt2422) {
			arg2 = false;
		} else if (Static243.anIntArray494[Static184.anInt3523] < Static184.anInt3500) {
			arg2 = false;
		} else if (this.anInt334 == this.anInt336 && this.anInt336 == this.anInt318 && this.anInt324 == this.anInt319 && this.anInt324 == this.anInt310 && this.anInt332 == this.anInt311 && this.anInt339 == this.anInt311) {
			arg2 = false;
		} else if (this.aClass90_1.anInt2441 != -1) {
			local79 = (int) (arg4 - this.aLong18);
			if (this.aClass90_1.aBoolean169 || local79 <= this.aClass90_1.anInt2441) {
				local79 %= this.aClass90_1.anInt2441;
			} else {
				arg2 = false;
			}
			if (!this.aClass90_1.aBoolean164 && this.aClass90_1.anInt2428 > local79) {
				arg2 = false;
			}
			if (this.aClass90_1.aBoolean164 && local79 >= this.aClass90_1.anInt2428) {
				arg2 = false;
			}
		}
		if (arg2) {
			this.anInt326 += (int) (((double) this.aClass90_1.anInt2437 + (double) (this.aClass90_1.anInt2413 - this.aClass90_1.anInt2437) * Math.random()) * (double) arg0);
			if (this.anInt326 > 63) {
				local79 = this.anInt326 >> 6;
				this.anInt326 &= 0x3F;
				@Pc(196) int local196;
				@Pc(202) int local202;
				@Pc(222) int local222;
				@Pc(209) int local209;
				@Pc(216) int local216;
				@Pc(237) int local237;
				@Pc(325) int local325;
				@Pc(387) int local387;
				@Pc(442) int local442;
				if (this.aBoolean19) {
					local196 = this.anInt336 - this.anInt334;
					local202 = this.anInt324 - this.anInt319;
					local209 = this.anInt318 - this.anInt334;
					local216 = this.anInt310 - this.anInt319;
					local222 = this.anInt311 - this.anInt332;
					this.anInt330 = local216 * local196 - local209 * local202;
					local237 = this.anInt339 - this.anInt332;
					this.anInt320 = local222 * local209 - local196 * local237;
					this.anInt307 = local202 * local237 - local216 * local222;
					while (true) {
						if (this.anInt307 <= 32767 && this.anInt320 <= 32767 && this.anInt330 <= 32767 && this.anInt307 >= -32767 && this.anInt320 >= -32767 && this.anInt330 >= -32767) {
							local325 = (int) Math.sqrt((double) (this.anInt330 * this.anInt330 + this.anInt320 * this.anInt320 + this.anInt307 * this.anInt307));
							if (local325 <= 0) {
								local325 = 1;
							}
							this.anInt307 = this.anInt307 * 32767 / local325;
							this.anInt320 = this.anInt320 * 32767 / local325;
							this.anInt330 = this.anInt330 * 32767 / local325;
							if (this.aClass90_1.aShort15 > 0 || this.aClass90_1.aShort17 > 0) {
								local387 = (int) (Math.atan2((double) this.anInt330, (double) this.anInt307) * 2047.0D / 6.283185307179586D);
								local442 = (int) (Math.atan2((double) this.anInt320, Math.sqrt((double) (this.anInt330 * this.anInt330 + this.anInt307 * this.anInt307))) * 2047.0D / 6.283185307179586D);
								this.anInt338 = this.aClass90_1.aShort15 - this.aClass90_1.aShort14;
								this.anInt317 = this.aClass90_1.aShort17 - this.aClass90_1.aShort16;
								this.anInt340 = this.aClass90_1.aShort16 + local442 - this.anInt317 / 2;
								@Pc(481) int local481 = local387 - this.aClass20_Sub3_1.anInt3517;
								this.anInt323 = this.aClass90_1.aShort14 + local481 - this.anInt338 / 2;
							} else if (this.aClass20_Sub3_1.anInt3517 != 0) {
								local387 = this.anInt330 * arg1 + this.anInt307 * arg3 >> 16;
								this.anInt330 = arg3 * this.anInt330 - this.anInt307 * arg1 >> 16;
								this.anInt307 = local387;
							}
							this.aBoolean19 = false;
							break;
						}
						this.anInt320 >>= 0x1;
						this.anInt330 >>= 0x1;
						this.anInt307 >>= 0x1;
					}
				}
				for (local209 = 0; local209 < local79; local209++) {
					@Pc(589) int local589;
					if (this.aClass90_1.aShort15 <= 0 && this.aClass90_1.aShort17 <= 0) {
						local202 = this.anInt320;
						local196 = this.anInt307;
						local222 = this.anInt330;
					} else {
						local216 = (int) (Math.random() * (double) this.anInt338) + this.anInt323;
						local387 = (int) (Math.random() * (double) this.anInt317) + this.anInt340;
						local387 &= 0x3FF;
						local216 &= 0x7FF;
						local442 = Class111.anIntArray299[local387] >> 1;
						local325 = Class111.anIntArray298[local216] >> 1;
						local196 = local325 * local442 >> 15;
						local237 = Class111.anIntArray299[local216] >> 1;
						local222 = local237 * local442 >> 15;
						local589 = Class111.anIntArray298[local387] >> 1;
						local202 = local589 * -1;
					}
					local237 = (int) (Math.random() * 255.0D);
					local216 = (int) (Math.random() * 255.0D);
					local325 = local237 * (255 - local216) >> 8;
					local387 = 255 - local216 - local325;
					@Pc(636) int local636 = local387 * this.anInt339 + local325 * this.anInt311 + this.anInt332 * local216 >> 8;
					local589 = local387 * this.anInt310 + this.anInt324 * local325 + this.anInt319 * local216 >> 8;
					local442 = local216 * this.anInt334 + local325 * this.anInt336 + local387 * this.anInt318 >> 8;
					@Pc(686) int local686;
					if (this.aClass20_Sub3_1.anInt3517 != 0) {
						local686 = arg1 * local636 + local442 * arg3 >> 16;
						local636 = arg3 * local636 - local442 * arg1 >> 16;
						local442 = local686;
					}
					local686 = (int) (Math.random() * (double) (this.aClass90_1.anInt2445 - this.aClass90_1.anInt2417)) + this.aClass90_1.anInt2417;
					@Pc(733) int local733 = (int) ((double) (this.aClass90_1.anInt2416 - this.aClass90_1.anInt2429) * Math.random()) + this.aClass90_1.anInt2429;
					@Pc(795) int local795;
					if (this.aClass90_1.aBoolean165) {
						@Pc(799) double local799 = Math.random();
						local795 = (int) ((double) this.aClass90_1.anInt2443 * local799 + (double) this.aClass90_1.anInt2402) << 24 | (int) ((double) this.aClass90_1.anInt2415 + local799 * (double) this.aClass90_1.anInt2397) << 16 | (int) (local799 * (double) this.aClass90_1.anInt2436 + (double) this.aClass90_1.anInt2404) << 8 | (int) ((double) this.aClass90_1.anInt2401 * local799 + (double) this.aClass90_1.anInt2430);
					} else {
						local795 = (int) (Math.random() * (double) this.aClass90_1.anInt2443 + (double) this.aClass90_1.anInt2402) << 24 | (int) (Math.random() * (double) this.aClass90_1.anInt2401 + (double) this.aClass90_1.anInt2430) | (int) ((double) this.aClass90_1.anInt2436 * Math.random() + (double) this.aClass90_1.anInt2404) << 8 | (int) ((double) this.aClass90_1.anInt2415 + Math.random() * (double) this.aClass90_1.anInt2397) << 16;
					}
					if (Static184.anInt3502 == Static184.anInt3501) {
						new Class20_Sub2_Sub1(this, this.aClass20_Sub3_1.anInt3518 + local442, this.aClass20_Sub3_1.anInt3512 - -local589, this.aClass20_Sub3_1.anInt3509 + local636, local196, local202, local222, local686, local733, local795);
					} else {
						@Pc(898) Class20_Sub2_Sub1 local898 = Static184.aClass20_Sub2_Sub1Array1[Static184.anInt3501];
						Static184.anInt3501 = Static184.anInt3501 + 1 & 0x3FF;
						local898.method2645(this, this.aClass20_Sub3_1.anInt3518 + local442, this.aClass20_Sub3_1.anInt3512 + local589, local636 + this.aClass20_Sub3_1.anInt3509, local196, local202, local222, local686, local733, local795);
					}
				}
			}
		}
		this.anInt325 = 0;
		for (@Pc(941) Class20_Sub2_Sub1 local941 = (Class20_Sub2_Sub1) this.aClass175_1.method4357(); local941 != null; local941 = (Class20_Sub2_Sub1) this.aClass175_1.method4352()) {
			local941.method2642(arg4, arg0);
			this.anInt325++;
		}
		Static184.anInt3504 += this.anInt325;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIIIIIII)V")
	public void method309(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		this.anInt339 = arg8;
		this.anInt324 = arg4;
		this.anInt334 = arg2;
		this.anInt332 = arg7;
		this.anInt311 = arg6;
		this.anInt318 = arg0;
		this.anInt336 = arg5;
		this.anInt310 = arg3;
		this.anInt319 = arg1;
		@Pc(54) int local54 = this.aClass20_Sub3_1.anInt3512 + (this.anInt319 + this.anInt324 + this.anInt310) / 3;
		@Pc(70) int local70 = this.aClass20_Sub3_1.anInt3518 + (this.anInt336 + this.anInt334 + this.anInt318) / 3;
		@Pc(86) int local86 = (this.anInt339 + this.anInt311 + this.anInt332) / 3 + this.aClass20_Sub3_1.anInt3509;
		if (this.anInt309 != local70 || local54 != this.anInt312 || local86 != this.anInt316) {
			this.anInt316 = local86;
			this.aBoolean19 = true;
			this.anInt312 = local54;
			this.anInt309 = local70;
		}
	}
}
