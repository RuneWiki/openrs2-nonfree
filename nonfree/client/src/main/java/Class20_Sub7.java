import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public final class Class20_Sub7 extends Class20 {

	@OriginalMember(owner = "client!lm", name = "o", descriptor = "I")
	private int anInt3341;

	@OriginalMember(owner = "client!lm", name = "p", descriptor = "I")
	private int anInt3342;

	@OriginalMember(owner = "client!lm", name = "q", descriptor = "I")
	public int anInt3343;

	@OriginalMember(owner = "client!lm", name = "u", descriptor = "I")
	private int anInt3345;

	@OriginalMember(owner = "client!lm", name = "v", descriptor = "I")
	private int anInt3346;

	@OriginalMember(owner = "client!lm", name = "x", descriptor = "I")
	public int anInt3348;

	@OriginalMember(owner = "client!lm", name = "y", descriptor = "I")
	private int anInt3349;

	@OriginalMember(owner = "client!lm", name = "z", descriptor = "I")
	private int anInt3350;

	@OriginalMember(owner = "client!lm", name = "A", descriptor = "I")
	public int anInt3351;

	@OriginalMember(owner = "client!lm", name = "F", descriptor = "I")
	private int anInt3354;

	@OriginalMember(owner = "client!lm", name = "G", descriptor = "I")
	private int anInt3355;

	@OriginalMember(owner = "client!lm", name = "J", descriptor = "I")
	private int anInt3356;

	@OriginalMember(owner = "client!lm", name = "L", descriptor = "I")
	private int anInt3357;

	@OriginalMember(owner = "client!lm", name = "N", descriptor = "I")
	private int anInt3358;

	@OriginalMember(owner = "client!lm", name = "P", descriptor = "I")
	private int anInt3360;

	@OriginalMember(owner = "client!lm", name = "S", descriptor = "I")
	private int anInt3362;

	@OriginalMember(owner = "client!lm", name = "U", descriptor = "I")
	private int anInt3364;

	@OriginalMember(owner = "client!lm", name = "V", descriptor = "I")
	private int anInt3365;

	@OriginalMember(owner = "client!lm", name = "X", descriptor = "I")
	private int anInt3366;

	@OriginalMember(owner = "client!lm", name = "Y", descriptor = "I")
	public int anInt3367;

	@OriginalMember(owner = "client!lm", name = "w", descriptor = "I")
	private int anInt3347 = 0;

	@OriginalMember(owner = "client!lm", name = "r", descriptor = "Z")
	public boolean aBoolean243 = false;

	@OriginalMember(owner = "client!lm", name = "t", descriptor = "Z")
	private boolean aBoolean244 = false;

	@OriginalMember(owner = "client!lm", name = "K", descriptor = "Lclient!bl;")
	public final Class20_Sub2 aClass20_Sub2_3;

	@OriginalMember(owner = "client!lm", name = "H", descriptor = "J")
	private final long aLong116;

	@OriginalMember(owner = "client!lm", name = "W", descriptor = "Lclient!oo;")
	public final Class157 aClass157_1;

	@OriginalMember(owner = "client!lm", name = "D", descriptor = "Lclient!pn;")
	public Class162 aClass162_1;

	@OriginalMember(owner = "client!lm", name = "I", descriptor = "Lclient!jl;")
	public final Class109 aClass109_4;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lclient!ja;Lclient!oo;Lclient!bl;J)V")
	public Class20_Sub7(@OriginalArg(0) Class81 arg0, @OriginalArg(1) Class157 arg1, @OriginalArg(2) Class20_Sub2 arg2, @OriginalArg(3) long arg3) {
		this.aClass20_Sub2_3 = arg2;
		this.aLong116 = arg3;
		this.aClass157_1 = arg1;
		this.aClass162_1 = Static187.method3520(this.aClass157_1.anInt4290);
		if (!arg0.method3041() && this.aClass162_1.anInt4619 != -1) {
			this.aClass162_1 = Static187.method3520(this.aClass162_1.anInt4619);
		}
		this.aClass109_4 = new Class109();
		this.anInt3347 = (int) ((double) this.anInt3347 + Math.random() * 64.0D);
		this.method3446();
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIJLclient!ja;Z)V")
	public void method3445(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) Class81 arg2, @OriginalArg(4) boolean arg3) {
		@Pc(45) int local45;
		if (this.aBoolean243) {
			arg3 = false;
		} else if (Static6.anInt117 < this.aClass162_1.anInt4646) {
			arg3 = false;
		} else if (Static213.anIntArray459[Static6.anInt117] < Static41.anInt6381) {
			arg3 = false;
		} else if (this.aBoolean244) {
			arg3 = false;
		} else if (this.aClass162_1.anInt4613 != -1) {
			local45 = (int) (arg1 - this.aLong116);
			if (this.aClass162_1.aBoolean325 || this.aClass162_1.anInt4613 >= local45) {
				local45 %= this.aClass162_1.anInt4613;
			} else {
				arg3 = false;
			}
			if (!this.aClass162_1.aBoolean322 && local45 < this.aClass162_1.anInt4598) {
				arg3 = false;
			}
			if (this.aClass162_1.aBoolean322 && this.aClass162_1.anInt4598 <= local45) {
				arg3 = false;
			}
		}
		if (arg3) {
			this.anInt3347 += (int) ((double) arg0 * (Math.random() * (double) (this.aClass162_1.anInt4631 - this.aClass162_1.anInt4632) + (double) this.aClass162_1.anInt4632));
			if (this.anInt3347 > 63) {
				local45 = this.anInt3347 >> 6;
				this.anInt3347 &= 0x3F;
				for (@Pc(144) int local144 = 0; local144 < local45; local144++) {
					@Pc(207) int local207;
					@Pc(217) int local217;
					@Pc(213) int local213;
					@Pc(167) int local167;
					@Pc(175) int local175;
					@Pc(179) int local179;
					@Pc(189) int local189;
					@Pc(197) int local197;
					@Pc(201) int local201;
					if (this.aClass162_1.aShort59 <= 0 && this.aClass162_1.aShort62 <= 0) {
						local217 = this.anInt3345;
						local207 = this.anInt3342;
						local213 = this.anInt3364;
					} else {
						local167 = (int) ((double) this.anInt3356 * Math.random()) + this.anInt3365;
						@Pc(171) int local171 = local167 & 0x3FFF;
						local175 = Class207.anIntArray697[local171];
						local179 = Class207.anIntArray698[local171];
						local189 = (int) ((double) this.anInt3360 * Math.random()) + this.anInt3349;
						@Pc(193) int local193 = local189 & 0x1FFF;
						local197 = Class207.anIntArray697[local193];
						local201 = Class207.anIntArray698[local193];
						local207 = local179 * local197 >> 15;
						local213 = local197 * local175 >> 15;
						local217 = local201 * -1;
					}
					local167 = (int) (Math.random() * 65535.0D);
					local175 = (int) (Math.random() * 65535.0D);
					if (local175 + local167 > 65535) {
						local175 = 65535 - local175;
						local167 = 65535 - local167;
					}
					local179 = 65535 - local167 - local175;
					local189 = this.anInt3346 * local179 + this.anInt3366 * local175 + this.anInt3354 * local167 >> 16;
					local197 = this.anInt3350 * local179 + local167 * this.anInt3362 + this.anInt3341 * local175 >> 16;
					local201 = this.anInt3358 * local167 + this.anInt3355 * local175 + local179 * this.anInt3357 >> 16;
					@Pc(330) int local330 = (int) (Math.random() * (double) (this.aClass162_1.anInt4603 - this.aClass162_1.anInt4650)) + this.aClass162_1.anInt4650;
					@Pc(347) int local347 = this.aClass162_1.anInt4651 + (int) (Math.random() * (double) (this.aClass162_1.anInt4648 - this.aClass162_1.anInt4651));
					@Pc(365) int local365 = this.aClass162_1.anInt4627 + (int) ((double) (this.aClass162_1.anInt4641 - this.aClass162_1.anInt4627) * Math.random());
					@Pc(429) int local429;
					if (this.aClass162_1.aBoolean324) {
						@Pc(371) double local371 = Math.random();
						local429 = (int) ((double) this.aClass162_1.anInt4601 + local371 * (double) this.aClass162_1.anInt4602) << 24 | (int) ((double) this.aClass162_1.anInt4624 + (double) this.aClass162_1.anInt4608 * local371) << 16 | (int) ((double) this.aClass162_1.anInt4634 + (double) this.aClass162_1.anInt4644 * local371) << 8 | (int) (local371 * (double) this.aClass162_1.anInt4636 + (double) this.aClass162_1.anInt4618);
					} else {
						local429 = (int) (Math.random() * (double) this.aClass162_1.anInt4602 + (double) this.aClass162_1.anInt4601) << 24 | (int) ((double) this.aClass162_1.anInt4608 * Math.random() + (double) this.aClass162_1.anInt4624) << 16 | (int) ((double) this.aClass162_1.anInt4634 + (double) this.aClass162_1.anInt4644 * Math.random()) << 8 | (int) ((double) this.aClass162_1.anInt4618 + Math.random() * (double) this.aClass162_1.anInt4636);
					}
					@Pc(493) int local493 = this.aClass162_1.anInt4610;
					if (!arg2.method3041() && !this.aClass162_1.aBoolean321) {
						local493 = -1;
					}
					if (Static311.anInt5835 == Static258.anInt4657) {
						new Class20_Sub1_Sub1_Sub1(this, local189, local197, local201, local207, local217, local213, local330, local347, local429, local365, local493, this.aClass162_1.aBoolean323);
					} else {
						@Pc(513) Class20_Sub1_Sub1_Sub1 local513 = Static263.aClass20_Sub1_Sub1_Sub1Array2[Static258.anInt4657];
						Static258.anInt4657 = Static258.anInt4657 + 1 & 0x3FF;
						local513.method427(this, local189, local197, local201, local207, local217, local213, local330, local347, local429, local365, local493, this.aClass162_1.aBoolean323);
					}
				}
			}
		}
		this.anInt3348 = 0;
		for (@Pc(574) Class20_Sub1_Sub1_Sub1 local574 = (Class20_Sub1_Sub1_Sub1) this.aClass109_4.method2948(); local574 != null; local574 = (Class20_Sub1_Sub1_Sub1) this.aClass109_4.method2939()) {
			local574.method425(arg1, arg0);
			this.anInt3348++;
		}
		Static281.anInt5315 += this.anInt3348;
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(B)V")
	public void method3446() {
		this.anInt3358 = this.aClass157_1.anInt4305;
		this.anInt3366 = this.aClass157_1.anInt4301;
		this.anInt3357 = this.aClass157_1.anInt4300;
		this.anInt3346 = this.aClass157_1.anInt4288;
		this.anInt3354 = this.aClass157_1.anInt4292;
		this.anInt3355 = this.aClass157_1.anInt4289;
		this.anInt3362 = this.aClass157_1.anInt4293;
		this.anInt3350 = this.aClass157_1.anInt4307;
		this.anInt3341 = this.aClass157_1.anInt4291;
		if (this.anInt3354 == this.anInt3366 && this.anInt3366 == this.anInt3346 && this.anInt3341 == this.anInt3362 && this.anInt3350 == this.anInt3341 && this.anInt3355 == this.anInt3358 && this.anInt3357 == this.anInt3355) {
			this.aBoolean244 = true;
			return;
		}
		this.aBoolean244 = false;
		@Pc(118) int local118 = (this.anInt3346 + this.anInt3354 + this.anInt3366) / 3;
		@Pc(129) int local129 = (this.anInt3350 + this.anInt3362 + this.anInt3341) / 3;
		@Pc(140) int local140 = (this.anInt3357 + this.anInt3358 + this.anInt3355) / 3;
		if (this.anInt3351 == local118 && local129 == this.anInt3367 && this.anInt3343 == local140) {
			return;
		}
		this.anInt3367 = local129;
		this.anInt3343 = local140;
		this.anInt3351 = local118;
		@Pc(176) int local176 = this.anInt3366 - this.anInt3354;
		@Pc(182) int local182 = this.anInt3341 - this.anInt3362;
		@Pc(189) int local189 = this.anInt3355 - this.anInt3358;
		@Pc(196) int local196 = this.anInt3346 - this.anInt3354;
		@Pc(203) int local203 = this.anInt3350 - this.anInt3362;
		@Pc(210) int local210 = this.anInt3357 - this.anInt3358;
		this.anInt3342 = local210 * local182 - local189 * local203;
		this.anInt3345 = local189 * local196 - local210 * local176;
		this.anInt3364 = local176 * local203 - local182 * local196;
		while (this.anInt3342 > 32767 || this.anInt3345 > 32767 || this.anInt3364 > 32767 || this.anInt3342 < -32767 || this.anInt3345 < -32767 || this.anInt3364 < -32767) {
			this.anInt3342 >>= 0x1;
			this.anInt3364 >>= 0x1;
			this.anInt3345 >>= 0x1;
		}
		@Pc(314) int local314 = (int) Math.sqrt((double) (this.anInt3364 * this.anInt3364 + this.anInt3342 * this.anInt3342 + this.anInt3345 * this.anInt3345));
		if (local314 <= 0) {
			local314 = 1;
		}
		this.anInt3342 = this.anInt3342 * 32767 / local314;
		this.anInt3345 = this.anInt3345 * 32767 / local314;
		this.anInt3364 = this.anInt3364 * 32767 / local314;
		if (this.aClass162_1.aShort59 <= 0 && this.aClass162_1.aShort62 <= 0) {
			return;
		}
		@Pc(367) int local367 = (int) (Math.atan2((double) this.anInt3364, (double) this.anInt3342) * 2607.5945876176133D);
		@Pc(388) int local388 = (int) (Math.atan2((double) this.anInt3345, Math.sqrt((double) (this.anInt3342 * this.anInt3342 + this.anInt3364 * this.anInt3364))) * 2607.5945876176133D);
		this.anInt3356 = this.aClass162_1.aShort59 - this.aClass162_1.aShort61;
		this.anInt3360 = this.aClass162_1.aShort62 - this.aClass162_1.aShort60;
		this.anInt3365 = this.aClass162_1.aShort61 + local367 - (this.anInt3356 >> 1);
		this.anInt3349 = local388 + this.aClass162_1.aShort60 - (this.anInt3360 >> 1);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IJ)V")
	public void method3447(@OriginalArg(1) long arg0) {
		for (@Pc(19) Class20_Sub1_Sub1_Sub1 local19 = (Class20_Sub1_Sub1_Sub1) this.aClass109_4.method2948(); local19 != null; local19 = (Class20_Sub1_Sub1_Sub1) this.aClass109_4.method2939()) {
			local19.method429(arg0);
		}
	}
}
