import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class45_Sub1 extends Class45 {

	@OriginalMember(owner = "client!ii", name = "k", descriptor = "I")
	public int anInt2276;

	@OriginalMember(owner = "client!ii", name = "l", descriptor = "I")
	public int anInt2277;

	@OriginalMember(owner = "client!ii", name = "m", descriptor = "I")
	private int anInt2278;

	@OriginalMember(owner = "client!ii", name = "o", descriptor = "I")
	private int anInt2280;

	@OriginalMember(owner = "client!ii", name = "q", descriptor = "I")
	public int anInt2281;

	@OriginalMember(owner = "client!ii", name = "r", descriptor = "I")
	private int anInt2282;

	@OriginalMember(owner = "client!ii", name = "s", descriptor = "I")
	private int anInt2283;

	@OriginalMember(owner = "client!ii", name = "w", descriptor = "I")
	private int anInt2286;

	@OriginalMember(owner = "client!ii", name = "B", descriptor = "I")
	private int anInt2290;

	@OriginalMember(owner = "client!ii", name = "D", descriptor = "I")
	private int anInt2291;

	@OriginalMember(owner = "client!ii", name = "E", descriptor = "I")
	private int anInt2292;

	@OriginalMember(owner = "client!ii", name = "F", descriptor = "I")
	private int anInt2293;

	@OriginalMember(owner = "client!ii", name = "G", descriptor = "I")
	private int anInt2294;

	@OriginalMember(owner = "client!ii", name = "H", descriptor = "I")
	private int anInt2295;

	@OriginalMember(owner = "client!ii", name = "I", descriptor = "I")
	private int anInt2296;

	@OriginalMember(owner = "client!ii", name = "J", descriptor = "I")
	private int anInt2297;

	@OriginalMember(owner = "client!ii", name = "K", descriptor = "I")
	private int anInt2298;

	@OriginalMember(owner = "client!ii", name = "L", descriptor = "I")
	public int anInt2299;

	@OriginalMember(owner = "client!ii", name = "O", descriptor = "I")
	private int anInt2301;

	@OriginalMember(owner = "client!ii", name = "P", descriptor = "I")
	private int anInt2302;

	@OriginalMember(owner = "client!ii", name = "N", descriptor = "Z")
	public boolean aBoolean174 = false;

	@OriginalMember(owner = "client!ii", name = "R", descriptor = "Z")
	public boolean aBoolean175 = true;

	@OriginalMember(owner = "client!ii", name = "T", descriptor = "I")
	private int anInt2303 = 0;

	@OriginalMember(owner = "client!ii", name = "x", descriptor = "Lclient!fd;")
	public Class49 aClass49_1;

	@OriginalMember(owner = "client!ii", name = "v", descriptor = "Lclient!ko;")
	public Class45_Sub2 aClass45_Sub2_4;

	@OriginalMember(owner = "client!ii", name = "C", descriptor = "Lclient!tf;")
	public Class168 aClass168_1;

	@OriginalMember(owner = "client!ii", name = "Q", descriptor = "Lclient!qk;")
	public Class148 aClass148_2;

	@OriginalMember(owner = "client!ii", name = "S", descriptor = "J")
	private long aLong82;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Lclient!fd;Lclient!ko;J)V")
	public Class45_Sub1(@OriginalArg(0) Class49 arg0, @OriginalArg(1) Class45_Sub2 arg1, @OriginalArg(2) long arg2) {
		this.aClass49_1 = arg0;
		this.aClass45_Sub2_4 = arg1;
		this.aClass168_1 = new Class168();
		this.aClass148_2 = this.aClass49_1.aClass148_1;
		this.aLong82 = arg2;
		this.anInt2303 = (int) ((double) this.anInt2303 + Math.random() * 64.0D);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(BIIZJI)V")
	public void method1840(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) long arg3, @OriginalArg(5) int arg4) {
		@Pc(87) int local87;
		if (this.aBoolean174) {
			arg2 = false;
		} else if (Static149.anInt3013 < this.aClass148_2.anInt4489) {
			arg2 = false;
		} else if (Static9.anIntArray245[Static149.anInt3013] < Static149.anInt2990) {
			arg2 = false;
		} else if (this.anInt2298 == this.anInt2295 && this.anInt2295 == this.anInt2290 && this.anInt2278 == this.anInt2282 && this.anInt2291 == this.anInt2278 && this.anInt2301 == this.anInt2296 && this.anInt2292 == this.anInt2301) {
			arg2 = false;
		} else if (this.aClass148_2.anInt4501 != -1) {
			local87 = (int) (arg3 - this.aLong82);
			if (this.aClass148_2.aBoolean322 || this.aClass148_2.anInt4501 >= local87) {
				local87 %= this.aClass148_2.anInt4501;
			} else {
				arg2 = false;
			}
			if (!this.aClass148_2.aBoolean324 && this.aClass148_2.anInt4471 > local87) {
				arg2 = false;
			}
			if (this.aClass148_2.aBoolean324 && local87 >= this.aClass148_2.anInt4471) {
				arg2 = false;
			}
		}
		if (arg2) {
			this.anInt2303 += (int) (((double) (this.aClass148_2.anInt4506 - this.aClass148_2.anInt4503) * Math.random() + (double) this.aClass148_2.anInt4503) * (double) arg4);
			if (this.anInt2303 > 63) {
				local87 = this.anInt2303 >> 6;
				this.anInt2303 &= 0x3F;
				@Pc(202) int local202;
				@Pc(216) int local216;
				@Pc(209) int local209;
				@Pc(223) int local223;
				@Pc(230) int local230;
				@Pc(247) int local247;
				@Pc(340) int local340;
				@Pc(393) int local393;
				@Pc(448) int local448;
				if (this.aBoolean175) {
					local202 = this.anInt2295 - this.anInt2298;
					local209 = this.anInt2301 - this.anInt2296;
					local216 = this.anInt2278 - this.anInt2282;
					local223 = this.anInt2290 - this.anInt2298;
					local230 = this.anInt2291 - this.anInt2282;
					this.anInt2286 = local230 * local202 - local216 * local223;
					local247 = this.anInt2292 - this.anInt2296;
					this.anInt2302 = local216 * local247 - local230 * local209;
					this.anInt2283 = local223 * local209 - local247 * local202;
					while (true) {
						if (this.anInt2302 <= 32767 && this.anInt2283 <= 32767 && this.anInt2286 <= 32767 && this.anInt2302 >= -32767 && this.anInt2283 >= -32767 && this.anInt2286 >= -32767) {
							local340 = (int) Math.sqrt((double) (this.anInt2286 * this.anInt2286 + this.anInt2302 * this.anInt2302 + this.anInt2283 * this.anInt2283));
							if (local340 <= 0) {
								local340 = 1;
							}
							this.anInt2283 = this.anInt2283 * 32767 / local340;
							this.anInt2286 = this.anInt2286 * 32767 / local340;
							this.anInt2302 = this.anInt2302 * 32767 / local340;
							if (this.aClass148_2.aShort36 > 0 || this.aClass148_2.aShort34 > 0) {
								local393 = (int) (Math.atan2((double) this.anInt2286, (double) this.anInt2302) * 2047.0D / 6.283185307179586D);
								local448 = (int) (Math.atan2((double) this.anInt2283, Math.sqrt((double) (this.anInt2286 * this.anInt2286 + this.anInt2302 * this.anInt2302))) * 2047.0D / 6.283185307179586D);
								this.anInt2294 = this.aClass148_2.aShort34 - this.aClass148_2.aShort35;
								@Pc(463) int local463 = local393 - this.aClass45_Sub2_4.anInt3014;
								this.anInt2280 = this.aClass148_2.aShort36 - this.aClass148_2.aShort37;
								this.anInt2297 = this.aClass148_2.aShort35 + local448 - this.anInt2294 / 2;
								this.anInt2293 = local463 + this.aClass148_2.aShort37 - this.anInt2280 / 2;
							} else if (this.aClass45_Sub2_4.anInt3014 != 0) {
								local393 = arg1 * this.anInt2286 + arg0 * this.anInt2302 >> 16;
								this.anInt2286 = this.anInt2286 * arg0 - arg1 * this.anInt2302 >> 16;
								this.anInt2302 = local393;
							}
							this.aBoolean175 = false;
							break;
						}
						this.anInt2286 >>= 0x1;
						this.anInt2283 >>= 0x1;
						this.anInt2302 >>= 0x1;
					}
				}
				for (local223 = 0; local223 < local87; local223++) {
					@Pc(587) int local587;
					if (this.aClass148_2.aShort36 <= 0 && this.aClass148_2.aShort34 <= 0) {
						local216 = this.anInt2283;
						local209 = this.anInt2286;
						local202 = this.anInt2302;
					} else {
						local393 = this.anInt2297 + (int) (Math.random() * (double) this.anInt2294);
						local230 = this.anInt2293 + (int) ((double) this.anInt2280 * Math.random());
						local393 &= 0x3FF;
						local230 &= 0x7FF;
						local247 = Class17.anIntArray22[local230] >> 1;
						local448 = Class17.anIntArray22[local393] >> 1;
						local209 = local247 * local448 >> 15;
						local340 = Class17.anIntArray24[local230] >> 1;
						local587 = Class17.anIntArray24[local393] >> 1;
						local216 = local587 * -1;
						local202 = local448 * local340 >> 15;
					}
					local230 = (int) (Math.random() * 255.0D);
					local247 = (int) (Math.random() * 255.0D);
					local340 = (255 - local230) * local247 >> 8;
					local393 = 255 - local340 - local230;
					local587 = local393 * this.anInt2291 + this.anInt2278 * local340 + this.anInt2282 * local230 >> 8;
					@Pc(657) int local657 = local393 * this.anInt2292 + local230 * this.anInt2296 + local340 * this.anInt2301 >> 8;
					local448 = this.anInt2290 * local393 + this.anInt2295 * local340 + local230 * this.anInt2298 >> 8;
					@Pc(691) int local691;
					if (this.aClass45_Sub2_4.anInt3014 != 0) {
						local691 = local657 * arg1 + local448 * arg0 >> 16;
						local657 = local657 * arg0 - local448 * arg1 >> 16;
						local448 = local691;
					}
					@Pc(721) int local721 = (int) ((double) (this.aClass148_2.anInt4481 - this.aClass148_2.anInt4484) * Math.random()) + this.aClass148_2.anInt4484;
					@Pc(783) int local783;
					if (this.aClass148_2.aBoolean320) {
						@Pc(787) double local787 = Math.random();
						local783 = (int) ((double) this.aClass148_2.anInt4518 + (double) this.aClass148_2.anInt4516 * local787) << 24 | (int) ((double) this.aClass148_2.anInt4467 * local787 + (double) this.aClass148_2.anInt4475) | (int) ((double) this.aClass148_2.anInt4500 * local787 + (double) this.aClass148_2.anInt4487) << 16 | (int) (local787 * (double) this.aClass148_2.anInt4479 + (double) this.aClass148_2.anInt4486) << 8;
					} else {
						local783 = (int) (Math.random() * (double) this.aClass148_2.anInt4500 + (double) this.aClass148_2.anInt4487) << 16 | (int) ((double) this.aClass148_2.anInt4486 + (double) this.aClass148_2.anInt4479 * Math.random()) << 8 | (int) ((double) this.aClass148_2.anInt4475 + (double) this.aClass148_2.anInt4467 * Math.random()) | (int) ((double) this.aClass148_2.anInt4518 + (double) this.aClass148_2.anInt4516 * Math.random()) << 24;
					}
					local691 = this.aClass148_2.anInt4492 + (int) (Math.random() * (double) (this.aClass148_2.anInt4477 - this.aClass148_2.anInt4492));
					if (Static149.anInt2991 == Static149.anInt2997) {
						new Class45_Sub3_Sub1(this, local448 + this.aClass45_Sub2_4.anInt3012, local587 + this.aClass45_Sub2_4.anInt3007, this.aClass45_Sub2_4.anInt3010 + local657, local202, local216, local209, local691, local721, local783);
					} else {
						@Pc(870) Class45_Sub3_Sub1 local870 = Static149.aClass45_Sub3_Sub1Array1[Static149.anInt2991];
						Static149.anInt2991 = Static149.anInt2991 + 1 & 0x3FF;
						local870.method2456(this, local448 + this.aClass45_Sub2_4.anInt3012, local587 + this.aClass45_Sub2_4.anInt3007, this.aClass45_Sub2_4.anInt3010 + local657, local202, local216, local209, local691, local721, local783);
					}
				}
			}
		}
		this.anInt2299 = 0;
		for (@Pc(941) Class45_Sub3_Sub1 local941 = (Class45_Sub3_Sub1) this.aClass168_1.method3985(); local941 != null; local941 = (Class45_Sub3_Sub1) this.aClass168_1.method3988()) {
			local941.method2455(arg3, arg4);
			this.anInt2299++;
		}
		Static149.anInt2996 += this.anInt2299;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIIIIII)V")
	public void method1843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		this.anInt2298 = arg6;
		this.anInt2278 = arg3;
		this.anInt2292 = arg7;
		this.anInt2290 = arg1;
		this.anInt2295 = arg8;
		this.anInt2291 = arg5;
		this.anInt2282 = arg4;
		this.anInt2301 = arg0;
		this.anInt2296 = arg2;
		@Pc(50) int local50 = this.aClass45_Sub2_4.anInt3012 + (this.anInt2295 + this.anInt2298 + this.anInt2290) / 3;
		@Pc(67) int local67 = (this.anInt2292 + this.anInt2296 + this.anInt2301) / 3 + this.aClass45_Sub2_4.anInt3010;
		@Pc(82) int local82 = this.aClass45_Sub2_4.anInt3007 + (this.anInt2291 + this.anInt2282 + this.anInt2278) / 3;
		if (this.anInt2277 != local50 || this.anInt2276 != local82 || this.anInt2281 != local67) {
			this.aBoolean175 = true;
			this.anInt2276 = local82;
			this.anInt2277 = local50;
			this.anInt2281 = local67;
		}
	}
}
