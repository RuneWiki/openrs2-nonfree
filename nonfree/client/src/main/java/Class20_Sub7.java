import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class20_Sub7 extends Class20 {

	@OriginalMember(owner = "client!od", name = "p", descriptor = "I")
	public int anInt6611;

	@OriginalMember(owner = "client!od", name = "A", descriptor = "I")
	private int anInt6616;

	@OriginalMember(owner = "client!od", name = "B", descriptor = "I")
	private int anInt6617;

	@OriginalMember(owner = "client!od", name = "C", descriptor = "I")
	private int anInt6618;

	@OriginalMember(owner = "client!od", name = "D", descriptor = "I")
	private int anInt6619;

	@OriginalMember(owner = "client!od", name = "E", descriptor = "I")
	private int anInt6620;

	@OriginalMember(owner = "client!od", name = "F", descriptor = "I")
	private int anInt6621;

	@OriginalMember(owner = "client!od", name = "G", descriptor = "I")
	private int anInt6622;

	@OriginalMember(owner = "client!od", name = "r", descriptor = "I")
	private int anInt6612 = 0;

	@OriginalMember(owner = "client!od", name = "o", descriptor = "Z")
	public boolean aBoolean468 = false;

	@OriginalMember(owner = "client!od", name = "v", descriptor = "Lclient!gi;")
	public Class121 aClass121_1 = new Class121();

	@OriginalMember(owner = "client!od", name = "z", descriptor = "Lclient!gi;")
	private Class121 aClass121_2 = new Class121();

	@OriginalMember(owner = "client!od", name = "H", descriptor = "Z")
	private boolean aBoolean469 = false;

	@OriginalMember(owner = "client!od", name = "q", descriptor = "Lclient!mp;")
	public final Class219 aClass219_2;

	@OriginalMember(owner = "client!od", name = "m", descriptor = "J")
	private final long aLong288;

	@OriginalMember(owner = "client!od", name = "j", descriptor = "Lclient!ii;")
	public final Class20_Sub5 aClass20_Sub5_5;

	@OriginalMember(owner = "client!od", name = "n", descriptor = "Lclient!efa;")
	public Class86 aClass86_1;

	@OriginalMember(owner = "client!od", name = "k", descriptor = "Lclient!vu;")
	public final Class349 aClass349_10;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lclient!r;Lclient!mp;Lclient!ii;J)V")
	public Class20_Sub7(@OriginalArg(0) Class12 arg0, @OriginalArg(1) Class219 arg1, @OriginalArg(2) Class20_Sub5 arg2, @OriginalArg(3) long arg3) {
		this.aClass219_2 = arg1;
		this.aLong288 = arg3;
		this.aClass20_Sub5_5 = arg2;
		this.aClass86_1 = this.aClass219_2.method4982();
		if (!arg0.method6463() && this.aClass86_1.anInt2356 != -1) {
			this.aClass86_1 = Static396.method5612(this.aClass86_1.anInt2356);
		}
		this.aClass349_10 = new Class349();
		this.anInt6612 = (int) ((double) this.anInt6612 + Math.random() * 64.0D);
		this.method5455();
		this.aClass121_2.anInt3045 = this.aClass121_1.anInt3045;
		this.aClass121_2.anInt3042 = this.aClass121_1.anInt3042;
		this.aClass121_2.anInt3051 = this.aClass121_1.anInt3051;
		this.aClass121_2.anInt3056 = this.aClass121_1.anInt3056;
		this.aClass121_2.anInt3054 = this.aClass121_1.anInt3054;
		this.aClass121_2.anInt3053 = this.aClass121_1.anInt3053;
		this.aClass121_2.anInt3052 = this.aClass121_1.anInt3052;
		this.aClass121_2.anInt3043 = this.aClass121_1.anInt3043;
		this.aClass121_2.anInt3049 = this.aClass121_1.anInt3049;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZIJILclient!r;)V")
	public void method5452(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(4) Class12 arg3) {
		@Pc(42) int local42;
		if (this.aBoolean468) {
			arg0 = false;
		} else if (Static341.anInt6056 < this.aClass86_1.anInt2364) {
			arg0 = false;
		} else if (Static450.anInt7748 > Static338.anIntArray407[Static341.anInt6056]) {
			arg0 = false;
		} else if (this.aBoolean469) {
			arg0 = false;
		} else if (this.aClass86_1.anInt2371 != -1) {
			local42 = (int) (arg2 - this.aLong288);
			if (this.aClass86_1.aBoolean185 || this.aClass86_1.anInt2371 >= local42) {
				local42 %= this.aClass86_1.anInt2371;
			} else {
				arg0 = false;
			}
			if (!this.aClass86_1.aBoolean181 && this.aClass86_1.anInt2373 > local42) {
				arg0 = false;
			}
			if (this.aClass86_1.aBoolean181 && local42 >= this.aClass86_1.anInt2373) {
				arg0 = false;
			}
		}
		if (arg0) {
			Static215.anInt4171++;
			local42 = (this.aClass121_1.anInt3049 + this.aClass121_1.anInt3045 + this.aClass121_1.anInt3054) / 3;
			@Pc(138) int local138 = (this.aClass121_1.anInt3056 + this.aClass121_1.anInt3051 + this.aClass121_1.anInt3042) / 3;
			@Pc(153) int local153 = (this.aClass121_1.anInt3053 + this.aClass121_1.anInt3043 + this.aClass121_1.anInt3052) / 3;
			@Pc(197) int local197;
			@Pc(206) int local206;
			@Pc(215) int local215;
			@Pc(223) int local223;
			@Pc(231) int local231;
			@Pc(240) int local240;
			@Pc(341) int local341;
			@Pc(397) int local397;
			@Pc(418) int local418;
			if (local42 != this.aClass121_1.anInt3044 || this.aClass121_1.anInt3050 != local138 || this.aClass121_1.anInt3047 != local153) {
				this.aClass121_1.anInt3044 = local42;
				this.aClass121_1.anInt3047 = local153;
				this.aClass121_1.anInt3050 = local138;
				local197 = this.aClass121_1.anInt3049 - this.aClass121_1.anInt3045;
				local206 = this.aClass121_1.anInt3051 - this.aClass121_1.anInt3042;
				local215 = this.aClass121_1.anInt3052 - this.aClass121_1.anInt3043;
				local223 = this.aClass121_1.anInt3054 - this.aClass121_1.anInt3045;
				local231 = this.aClass121_1.anInt3056 - this.aClass121_1.anInt3042;
				local240 = this.aClass121_1.anInt3053 - this.aClass121_1.anInt3043;
				this.anInt6620 = local231 * local197 - local223 * local206;
				this.anInt6616 = local223 * local215 - local197 * local240;
				this.anInt6618 = local240 * local206 - local231 * local215;
				while (true) {
					if (this.anInt6618 <= 32767 && this.anInt6616 <= 32767 && this.anInt6620 <= 32767 && this.anInt6618 >= -32767 && this.anInt6616 >= -32767 && this.anInt6620 >= -32767) {
						local341 = (int) Math.sqrt((double) (this.anInt6616 * this.anInt6616 + this.anInt6618 * this.anInt6618 + this.anInt6620 * this.anInt6620));
						if (local341 <= 0) {
							local341 = 1;
						}
						this.anInt6616 = this.anInt6616 * 32767 / local341;
						this.anInt6620 = this.anInt6620 * 32767 / local341;
						this.anInt6618 = this.anInt6618 * 32767 / local341;
						if (this.aClass86_1.aShort28 > 0 || this.aClass86_1.aShort30 > 0) {
							local397 = (int) (Math.atan2((double) this.anInt6620, (double) this.anInt6618) * 2607.5945876176133D);
							local418 = (int) (Math.atan2((double) this.anInt6616, Math.sqrt((double) (this.anInt6620 * this.anInt6620 + this.anInt6618 * this.anInt6618))) * 2607.5945876176133D);
							this.anInt6621 = this.aClass86_1.aShort28 - this.aClass86_1.aShort29;
							this.anInt6619 = local397 + this.aClass86_1.aShort29 - (this.anInt6621 >> 1);
							this.anInt6617 = this.aClass86_1.aShort30 - this.aClass86_1.aShort27;
							this.anInt6622 = local418 + this.aClass86_1.aShort27 - (this.anInt6617 >> 1);
						}
						break;
					}
					this.anInt6620 >>= 0x1;
					this.anInt6618 >>= 0x1;
					this.anInt6616 >>= 0x1;
				}
			}
			this.anInt6612 += (int) ((Math.random() * (double) (this.aClass86_1.anInt2361 - this.aClass86_1.anInt2360) + (double) this.aClass86_1.anInt2360) * (double) arg1);
			if (this.anInt6612 > 63) {
				local197 = this.anInt6612 >> 6;
				this.anInt6612 &= 0x3F;
				for (local231 = 0; local231 < local197; local231++) {
					@Pc(566) int local566;
					@Pc(570) int local570;
					if (this.aClass86_1.aShort28 <= 0 && this.aClass86_1.aShort30 <= 0) {
						local206 = this.anInt6618;
						local223 = this.anInt6620;
						local215 = this.anInt6616;
					} else {
						local240 = (int) (Math.random() * (double) this.anInt6621) + this.anInt6619;
						local240 &= 0x3FFF;
						local341 = Class151.anIntArray244[local240];
						local397 = Class151.anIntArray245[local240];
						local418 = this.anInt6622 + (int) (Math.random() * (double) this.anInt6617);
						local418 &= 0x1FFF;
						local566 = Class151.anIntArray244[local418];
						local570 = Class151.anIntArray245[local418];
						local215 = (local570 << 1) * -1;
						local206 = local566 * local397 >> 13;
						local223 = local566 * local341 >> 13;
					}
					@Pc(593) float local593 = (float) Math.random();
					@Pc(596) float local596 = (float) Math.random();
					if (local593 + local596 > 1.0F) {
						local593 = 1.0F - local593;
						local596 = 1.0F - local596;
					}
					@Pc(618) float local618 = 1.0F - local593 - local596;
					local418 = (int) (local618 * (float) this.aClass121_1.anInt3054 + local596 * (float) this.aClass121_1.anInt3049 + local593 * (float) this.aClass121_1.anInt3045);
					local566 = (int) (local618 * (float) this.aClass121_1.anInt3056 + local596 * (float) this.aClass121_1.anInt3051 + local593 * (float) this.aClass121_1.anInt3042);
					local570 = (int) (local593 * (float) this.aClass121_1.anInt3043 + (float) this.aClass121_1.anInt3052 * local596 + (float) this.aClass121_1.anInt3053 * local618);
					@Pc(706) int local706 = (int) ((float) this.aClass121_2.anInt3045 * local593 + (float) this.aClass121_2.anInt3049 * local596 + (float) this.aClass121_2.anInt3054 * local618);
					@Pc(728) int local728 = (int) (local596 * (float) this.aClass121_2.anInt3051 + local593 * (float) this.aClass121_2.anInt3042 + (float) this.aClass121_2.anInt3056 * local618);
					@Pc(750) int local750 = (int) (local618 * (float) this.aClass121_2.anInt3053 + (float) this.aClass121_2.anInt3043 * local593 + local596 * (float) this.aClass121_2.anInt3052);
					@Pc(755) int local755 = local418 - local706;
					@Pc(760) int local760 = local566 - local728;
					@Pc(765) int local765 = local570 - local750;
					@Pc(774) int local774 = (int) ((double) local755 * Math.random() + (double) local706);
					@Pc(783) int local783 = (int) (Math.random() * (double) local760 + (double) local728);
					@Pc(792) int local792 = (int) ((double) local765 * Math.random() + (double) local750);
					@Pc(809) int local809 = (int) (Math.random() * (double) (this.aClass86_1.anInt2387 - this.aClass86_1.lb)) + this.aClass86_1.lb;
					@Pc(826) int local826 = (int) ((double) (this.aClass86_1.anInt2345 - this.aClass86_1.anInt2384) * Math.random()) + this.aClass86_1.anInt2384;
					@Pc(842) int local842 = (int) (Math.random() * (double) (this.aClass86_1.anInt2374 - this.aClass86_1.anInt2379)) + this.aClass86_1.anInt2379;
					@Pc(904) int local904;
					if (this.aClass86_1.aBoolean184) {
						@Pc(908) double local908 = Math.random();
						local904 = (int) ((double) this.aClass86_1.anInt2382 + (double) this.aClass86_1.anInt2366 * Math.random()) << 24 | (int) ((double) this.aClass86_1.anInt2381 + (double) this.aClass86_1.anInt2355 * local908) << 16 | (int) ((double) this.aClass86_1.anInt2386 + (double) this.aClass86_1.anInt2369 * local908) << 8 | (int) (local908 * (double) this.aClass86_1.anInt2389 + (double) this.aClass86_1.anInt2383);
					} else {
						local904 = (int) ((double) this.aClass86_1.anInt2389 * Math.random() + (double) this.aClass86_1.anInt2383) | (int) ((double) this.aClass86_1.anInt2369 * Math.random() + (double) this.aClass86_1.anInt2386) << 8 | (int) (Math.random() * (double) this.aClass86_1.anInt2355 + (double) this.aClass86_1.anInt2381) << 16 | (int) (Math.random() * (double) this.aClass86_1.anInt2366 + (double) this.aClass86_1.anInt2382) << 24;
					}
					@Pc(970) int local970 = this.aClass86_1.anInt2363;
					if (!arg3.method6463() && !this.aClass86_1.aBoolean179) {
						local970 = -1;
					}
					if (Static571.anInt9322 == Static436.anInt7677) {
						new Class20_Sub1_Sub1_Sub1(this, local774, local783, local792, local206, local215, local223, local809, local826, local904, local842, local970, this.aClass86_1.aBoolean182, this.aClass86_1.aBoolean186);
					} else {
						@Pc(986) Class20_Sub1_Sub1_Sub1 local986 = Static293.aClass20_Sub1_Sub1_Sub1Array2[Static571.anInt9322];
						Static571.anInt9322 = Static571.anInt9322 + 1 & 0x3FF;
						local986.method5282(this, local774, local783, local792, local206, local215, local223, local809, local826, local904, local842, local970, this.aClass86_1.aBoolean182, this.aClass86_1.aBoolean186);
					}
				}
			}
		}
		if (!this.aClass121_1.method2582(this.aClass121_2)) {
			@Pc(1056) Class121 local1056 = this.aClass121_2;
			this.aClass121_2 = this.aClass121_1;
			this.aClass121_1 = local1056;
			this.aClass121_1.anInt3053 = this.aClass219_2.anInt5925;
			this.aClass121_1.anInt3043 = this.aClass219_2.anInt5926;
			this.aClass121_1.anInt3056 = this.aClass219_2.anInt5914;
			this.aClass121_1.anInt3052 = this.aClass219_2.anInt5918;
			this.aClass121_1.anInt3051 = this.aClass219_2.anInt5919;
			this.aClass121_1.anInt3042 = this.aClass219_2.anInt5910;
			this.aClass121_1.anInt3045 = this.aClass219_2.anInt5917;
			this.aClass121_1.anInt3054 = this.aClass219_2.anInt5915;
			this.aClass121_1.anInt3049 = this.aClass219_2.anInt5912;
		}
		this.anInt6611 = 0;
		for (@Pc(1126) Class20_Sub1_Sub1_Sub1 local1126 = (Class20_Sub1_Sub1_Sub1) this.aClass349_10.method7653(); local1126 != null; local1126 = (Class20_Sub1_Sub1_Sub1) this.aClass349_10.method7660()) {
			local1126.method5281(arg2, arg1);
			this.anInt6611++;
		}
		Static376.anInt6636 += this.anInt6611;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(JBLclient!r;)V")
	public void method5454(@OriginalArg(0) long arg0, @OriginalArg(2) Class12 arg1) {
		for (@Pc(15) Class20_Sub1_Sub1_Sub1 local15 = (Class20_Sub1_Sub1_Sub1) this.aClass349_10.method7653(); local15 != null; local15 = (Class20_Sub1_Sub1_Sub1) this.aClass349_10.method7660()) {
			local15.method5280(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
	public void method5455() {
		this.aClass121_1.anInt3053 = this.aClass219_2.anInt5925;
		this.aClass121_1.anInt3052 = this.aClass219_2.anInt5918;
		this.aClass121_1.anInt3049 = this.aClass219_2.anInt5912;
		this.aClass121_1.anInt3054 = this.aClass219_2.anInt5915;
		this.aClass121_1.anInt3043 = this.aClass219_2.anInt5926;
		this.aClass121_1.anInt3045 = this.aClass219_2.anInt5917;
		this.aClass121_1.anInt3042 = this.aClass219_2.anInt5910;
		this.aClass121_1.anInt3056 = this.aClass219_2.anInt5914;
		this.aClass121_1.anInt3051 = this.aClass219_2.anInt5919;
		if (this.aClass121_1.anInt3045 == this.aClass121_1.anInt3049 && this.aClass121_1.anInt3049 == this.aClass121_1.anInt3054 && this.aClass121_1.anInt3051 == this.aClass121_1.anInt3042 && this.aClass121_1.anInt3051 == this.aClass121_1.anInt3056 && this.aClass121_1.anInt3043 == this.aClass121_1.anInt3052 && this.aClass121_1.anInt3052 == this.aClass121_1.anInt3053) {
			this.aBoolean469 = true;
		} else if (this.aBoolean469) {
			this.aClass121_2.anInt3043 = this.aClass121_1.anInt3043;
			this.aClass121_2.anInt3052 = this.aClass121_1.anInt3052;
			this.aClass121_2.anInt3054 = this.aClass121_1.anInt3054;
			this.aClass121_2.anInt3056 = this.aClass121_1.anInt3056;
			this.aClass121_2.anInt3045 = this.aClass121_1.anInt3045;
			this.aClass121_2.anInt3051 = this.aClass121_1.anInt3051;
			this.aClass121_2.anInt3049 = this.aClass121_1.anInt3049;
			this.aClass121_2.anInt3042 = this.aClass121_1.anInt3042;
			this.aClass121_2.anInt3053 = this.aClass121_1.anInt3053;
			this.aBoolean469 = false;
		}
	}
}
