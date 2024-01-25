import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!co")
public final class Class15_Sub2 extends Class15 {

	@OriginalMember(owner = "client!co", name = "r", descriptor = "I")
	public int anInt2329;

	@OriginalMember(owner = "client!co", name = "D", descriptor = "I")
	private int anInt2332;

	@OriginalMember(owner = "client!co", name = "E", descriptor = "I")
	private int anInt2333;

	@OriginalMember(owner = "client!co", name = "F", descriptor = "I")
	private int anInt2334;

	@OriginalMember(owner = "client!co", name = "G", descriptor = "I")
	private int anInt2335;

	@OriginalMember(owner = "client!co", name = "H", descriptor = "I")
	private int anInt2336;

	@OriginalMember(owner = "client!co", name = "I", descriptor = "I")
	private int anInt2337;

	@OriginalMember(owner = "client!co", name = "J", descriptor = "I")
	private int anInt2338;

	@OriginalMember(owner = "client!co", name = "q", descriptor = "Z")
	public boolean aBoolean168 = false;

	@OriginalMember(owner = "client!co", name = "p", descriptor = "I")
	private int anInt2328 = 0;

	@OriginalMember(owner = "client!co", name = "s", descriptor = "Lclient!qda;")
	public Class271 aClass271_1 = new Class271();

	@OriginalMember(owner = "client!co", name = "B", descriptor = "Lclient!qda;")
	private Class271 aClass271_2 = new Class271();

	@OriginalMember(owner = "client!co", name = "C", descriptor = "Z")
	private boolean aBoolean170 = false;

	@OriginalMember(owner = "client!co", name = "l", descriptor = "Lclient!pd;")
	public final Class15_Sub8 aClass15_Sub8_3;

	@OriginalMember(owner = "client!co", name = "x", descriptor = "Lclient!nda;")
	public final Class219 aClass219_1;

	@OriginalMember(owner = "client!co", name = "w", descriptor = "J")
	private final long aLong50;

	@OriginalMember(owner = "client!co", name = "y", descriptor = "Lclient!gw;")
	public Class125 aClass125_1;

	@OriginalMember(owner = "client!co", name = "n", descriptor = "Lclient!gt;")
	public final Class123 aClass123_3;

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Lclient!ha;Lclient!nda;Lclient!pd;J)V")
	public Class15_Sub2(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class219 arg1, @OriginalArg(2) Class15_Sub8 arg2, @OriginalArg(3) long arg3) {
		this.aClass15_Sub8_3 = arg2;
		this.aClass219_1 = arg1;
		this.aLong50 = arg3;
		this.aClass125_1 = this.aClass219_1.method5657();
		if (!arg0.method6122() && this.aClass125_1.anInt4451 != -1) {
			this.aClass125_1 = Static443.method6815(this.aClass125_1.anInt4451);
		}
		this.aClass123_3 = new Class123();
		this.anInt2328 = (int) ((double) this.anInt2328 + Math.random() * 64.0D);
		this.method1966();
		this.aClass271_2.anInt8271 = this.aClass271_1.anInt8271;
		this.aClass271_2.anInt8269 = this.aClass271_1.anInt8269;
		this.aClass271_2.anInt8280 = this.aClass271_1.anInt8280;
		this.aClass271_2.anInt8278 = this.aClass271_1.anInt8278;
		this.aClass271_2.anInt8279 = this.aClass271_1.anInt8279;
		this.aClass271_2.anInt8276 = this.aClass271_1.anInt8276;
		this.aClass271_2.anInt8272 = this.aClass271_1.anInt8272;
		this.aClass271_2.anInt8273 = this.aClass271_1.anInt8273;
		this.aClass271_2.anInt8277 = this.aClass271_1.anInt8277;
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(I)V")
	public void method1966() {
		this.aClass271_1.anInt8269 = this.aClass219_1.anInt6911;
		this.aClass271_1.anInt8278 = this.aClass219_1.anInt6908;
		this.aClass271_1.anInt8273 = this.aClass219_1.anInt6916;
		this.aClass271_1.anInt8277 = this.aClass219_1.anInt6902;
		this.aClass271_1.anInt8280 = this.aClass219_1.anInt6904;
		this.aClass271_1.anInt8272 = this.aClass219_1.anInt6905;
		this.aClass271_1.anInt8276 = this.aClass219_1.anInt6900;
		this.aClass271_1.anInt8279 = this.aClass219_1.anInt6913;
		this.aClass271_1.anInt8271 = this.aClass219_1.anInt6903;
		if (this.aClass271_1.anInt8278 == this.aClass271_1.anInt8279 && this.aClass271_1.anInt8279 == this.aClass271_1.anInt8280 && this.aClass271_1.anInt8269 == this.aClass271_1.anInt8277 && this.aClass271_1.anInt8271 == this.aClass271_1.anInt8269 && this.aClass271_1.anInt8276 == this.aClass271_1.anInt8273 && this.aClass271_1.anInt8272 == this.aClass271_1.anInt8273) {
			this.aBoolean170 = true;
		} else if (this.aBoolean170) {
			this.aClass271_2.anInt8280 = this.aClass271_1.anInt8280;
			this.aClass271_2.anInt8273 = this.aClass271_1.anInt8273;
			this.aClass271_2.anInt8272 = this.aClass271_1.anInt8272;
			this.aClass271_2.anInt8276 = this.aClass271_1.anInt8276;
			this.aClass271_2.anInt8278 = this.aClass271_1.anInt8278;
			this.aClass271_2.anInt8271 = this.aClass271_1.anInt8271;
			this.aBoolean170 = false;
			this.aClass271_2.anInt8279 = this.aClass271_1.anInt8279;
			this.aClass271_2.anInt8277 = this.aClass271_1.anInt8277;
			this.aClass271_2.anInt8269 = this.aClass271_1.anInt8269;
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ZIJLclient!ha;B)V")
	public void method1970(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) Class16 arg3) {
		@Pc(49) int local49;
		if (this.aBoolean168) {
			arg0 = false;
		} else if (this.aClass125_1.anInt4468 > Static203.anInt4658) {
			arg0 = false;
		} else if (Static613.anInt10349 > Static254.anIntArray234[Static203.anInt4658]) {
			arg0 = false;
		} else if (this.aBoolean170) {
			arg0 = false;
		} else if (this.aClass125_1.anInt4444 != -1) {
			local49 = (int) (arg2 - this.aLong50);
			if (this.aClass125_1.aBoolean328 || local49 <= this.aClass125_1.anInt4444) {
				local49 %= this.aClass125_1.anInt4444;
			} else {
				arg0 = false;
			}
			if (!this.aClass125_1.aBoolean323 && local49 < this.aClass125_1.anInt4452) {
				arg0 = false;
			}
			if (this.aClass125_1.aBoolean323 && this.aClass125_1.anInt4452 <= local49) {
				arg0 = false;
			}
		}
		if (arg0) {
			Static233.anInt5269++;
			local49 = (this.aClass271_1.anInt8279 + this.aClass271_1.anInt8278 + this.aClass271_1.anInt8280) / 3;
			@Pc(141) int local141 = (this.aClass271_1.anInt8271 + this.aClass271_1.anInt8277 + this.aClass271_1.anInt8269) / 3;
			@Pc(155) int local155 = (this.aClass271_1.anInt8272 + this.aClass271_1.anInt8273 + this.aClass271_1.anInt8276) / 3;
			@Pc(199) int local199;
			@Pc(207) int local207;
			@Pc(215) int local215;
			@Pc(224) int local224;
			@Pc(233) int local233;
			@Pc(242) int local242;
			@Pc(339) int local339;
			@Pc(395) int local395;
			@Pc(416) int local416;
			if (this.aClass271_1.anInt8274 != local49 || local141 != this.aClass271_1.anInt8270 || local155 != this.aClass271_1.anInt8275) {
				this.aClass271_1.anInt8270 = local141;
				this.aClass271_1.anInt8275 = local155;
				this.aClass271_1.anInt8274 = local49;
				local199 = this.aClass271_1.anInt8279 - this.aClass271_1.anInt8278;
				local207 = this.aClass271_1.anInt8269 - this.aClass271_1.anInt8277;
				local215 = this.aClass271_1.anInt8273 - this.aClass271_1.anInt8276;
				local224 = this.aClass271_1.anInt8280 - this.aClass271_1.anInt8278;
				local233 = this.aClass271_1.anInt8271 - this.aClass271_1.anInt8277;
				local242 = this.aClass271_1.anInt8272 - this.aClass271_1.anInt8276;
				this.anInt2335 = local215 * local224 - local242 * local199;
				this.anInt2336 = local233 * local199 - local224 * local207;
				this.anInt2337 = local207 * local242 - local233 * local215;
				while (true) {
					if (this.anInt2337 <= 32767 && this.anInt2335 <= 32767 && this.anInt2336 <= 32767 && this.anInt2337 >= -32767 && this.anInt2335 >= -32767 && this.anInt2336 >= -32767) {
						local339 = (int) Math.sqrt((double) (this.anInt2336 * this.anInt2336 + this.anInt2335 * this.anInt2335 + this.anInt2337 * this.anInt2337));
						if (local339 <= 0) {
							local339 = 1;
						}
						this.anInt2336 = this.anInt2336 * 32767 / local339;
						this.anInt2335 = this.anInt2335 * 32767 / local339;
						this.anInt2337 = this.anInt2337 * 32767 / local339;
						if (this.aClass125_1.aShort51 > 0 || this.aClass125_1.aShort53 > 0) {
							local395 = (int) (Math.atan2((double) this.anInt2336, (double) this.anInt2337) * 2607.5945876176133D);
							local416 = (int) (Math.atan2((double) this.anInt2335, Math.sqrt((double) (this.anInt2336 * this.anInt2336 + this.anInt2337 * this.anInt2337))) * 2607.5945876176133D);
							this.anInt2333 = this.aClass125_1.aShort51 - this.aClass125_1.aShort50;
							this.anInt2334 = this.aClass125_1.aShort53 - this.aClass125_1.aShort52;
							this.anInt2338 = local395 + this.aClass125_1.aShort50 - (this.anInt2333 >> 1);
							this.anInt2332 = this.aClass125_1.aShort52 + local416 - (this.anInt2334 >> 1);
						}
						break;
					}
					this.anInt2336 >>= 0x1;
					this.anInt2337 >>= 0x1;
					this.anInt2335 >>= 0x1;
				}
			}
			this.anInt2328 += (int) ((double) arg1 * ((double) this.aClass125_1.anInt4430 + Math.random() * (double) (this.aClass125_1.anInt4426 - this.aClass125_1.anInt4430)));
			if (this.anInt2328 > 63) {
				local199 = this.anInt2328 >> 6;
				this.anInt2328 &= 0x3F;
				for (local233 = 0; local233 < local199; local233++) {
					@Pc(559) int local559;
					@Pc(563) int local563;
					if (this.aClass125_1.aShort51 <= 0 && this.aClass125_1.aShort53 <= 0) {
						local207 = this.anInt2337;
						local215 = this.anInt2335;
						local224 = this.anInt2336;
					} else {
						local242 = (int) ((double) this.anInt2333 * Math.random()) + this.anInt2338;
						local242 &= 0x3FFF;
						local339 = Class344.anIntArray579[local242];
						local395 = Class344.anIntArray578[local242];
						local416 = this.anInt2332 + (int) ((double) this.anInt2334 * Math.random());
						local416 &= 0x1FFF;
						local559 = Class344.anIntArray579[local416];
						local563 = Class344.anIntArray578[local416];
						local207 = local395 * local559 >> 13;
						local215 = (local563 << 1) * -1;
						local224 = local559 * local339 >> 13;
					}
					@Pc(597) float local597 = (float) Math.random();
					@Pc(600) float local600 = (float) Math.random();
					if (local597 + local600 > 1.0F) {
						local600 = 1.0F - local600;
						local597 = 1.0F - local597;
					}
					@Pc(623) float local623 = 1.0F - local597 - local600;
					local416 = (int) (local623 * (float) this.aClass271_1.anInt8280 + local600 * (float) this.aClass271_1.anInt8279 + (float) this.aClass271_1.anInt8278 * local597);
					local559 = (int) ((float) this.aClass271_1.anInt8271 * local623 + (float) this.aClass271_1.anInt8277 * local597 + local600 * (float) this.aClass271_1.anInt8269);
					local563 = (int) (local623 * (float) this.aClass271_1.anInt8272 + (float) this.aClass271_1.anInt8273 * local600 + local597 * (float) this.aClass271_1.anInt8276);
					@Pc(711) int local711 = (int) (local597 * (float) this.aClass271_2.anInt8278 + (float) this.aClass271_2.anInt8279 * local600 + (float) this.aClass271_2.anInt8280 * local623);
					@Pc(733) int local733 = (int) (local597 * (float) this.aClass271_2.anInt8277 + local600 * (float) this.aClass271_2.anInt8269 + (float) this.aClass271_2.anInt8271 * local623);
					@Pc(755) int local755 = (int) (local623 * (float) this.aClass271_2.anInt8272 + local597 * (float) this.aClass271_2.anInt8276 + local600 * (float) this.aClass271_2.anInt8273);
					@Pc(760) int local760 = local416 - local711;
					@Pc(765) int local765 = local559 - local733;
					@Pc(770) int local770 = local563 - local755;
					@Pc(779) int local779 = (int) ((double) local760 * Math.random() + (double) local711);
					@Pc(788) int local788 = (int) ((double) local733 + (double) local765 * Math.random());
					@Pc(797) int local797 = (int) ((double) local755 + Math.random() * (double) local770);
					@Pc(814) int local814 = this.aClass125_1.anInt4459 + (int) ((double) (this.aClass125_1.anInt4455 - this.aClass125_1.anInt4459) * Math.random());
					@Pc(831) int local831 = (int) (Math.random() * (double) (this.aClass125_1.anInt4449 - this.aClass125_1.anInt4458)) + this.aClass125_1.anInt4458;
					@Pc(848) int local848 = (int) ((double) (this.aClass125_1.anInt4425 - this.aClass125_1.anInt4463) * Math.random()) + this.aClass125_1.anInt4463;
					@Pc(910) int local910;
					if (this.aClass125_1.aBoolean330) {
						@Pc(914) double local914 = Math.random();
						local910 = (int) (Math.random() * (double) this.aClass125_1.anInt4470 + (double) this.aClass125_1.anInt4433) << 24 | (int) ((double) this.aClass125_1.anInt4464 + (double) this.aClass125_1.anInt4421 * local914) | (int) ((double) this.aClass125_1.anInt4454 + (double) this.aClass125_1.anInt4439 * local914) << 8 | (int) (local914 * (double) this.aClass125_1.anInt4427 + (double) this.aClass125_1.anInt4419) << 16;
					} else {
						local910 = (int) (Math.random() * (double) this.aClass125_1.anInt4470 + (double) this.aClass125_1.anInt4433) << 24 | (int) ((double) this.aClass125_1.anInt4419 + Math.random() * (double) this.aClass125_1.anInt4427) << 16 | (int) ((double) this.aClass125_1.anInt4454 + Math.random() * (double) this.aClass125_1.anInt4439) << 8 | (int) ((double) this.aClass125_1.anInt4464 + (double) this.aClass125_1.anInt4421 * Math.random());
					}
					@Pc(976) int local976 = this.aClass125_1.lb;
					if (!arg3.method6122() && !this.aClass125_1.aBoolean324) {
						local976 = -1;
					}
					if (Static126.anInt3374 == Static177.anInt3831) {
						new Class15_Sub5_Sub1_Sub1(this, local779, local788, local797, local207, local215, local224, local814, local831, local910, local848, local976, this.aClass125_1.aBoolean329, this.aClass125_1.aBoolean331);
					} else {
						@Pc(996) Class15_Sub5_Sub1_Sub1 local996 = Static78.aClass15_Sub5_Sub1_Sub1Array1[Static177.anInt3831];
						Static177.anInt3831 = Static177.anInt3831 + 1 & 0x3FF;
						local996.method3101(this, local779, local788, local797, local207, local215, local224, local814, local831, local910, local848, local976, this.aClass125_1.aBoolean329, this.aClass125_1.aBoolean331);
					}
				}
			}
		}
		if (!this.aClass271_1.method6842(this.aClass271_2)) {
			@Pc(1060) Class271 local1060 = this.aClass271_2;
			this.aClass271_2 = this.aClass271_1;
			this.aClass271_1 = local1060;
			this.aClass271_1.anInt8277 = this.aClass219_1.anInt6902;
			this.aClass271_1.anInt8275 = this.aClass271_2.anInt8275;
			this.aClass271_1.anInt8280 = this.aClass219_1.anInt6904;
			this.aClass271_1.anInt8274 = this.aClass271_2.anInt8274;
			this.aClass271_1.anInt8272 = this.aClass219_1.anInt6905;
			this.aClass271_1.anInt8276 = this.aClass219_1.anInt6900;
			this.aClass271_1.anInt8279 = this.aClass219_1.anInt6913;
			this.aClass271_1.anInt8271 = this.aClass219_1.anInt6903;
			this.aClass271_1.anInt8269 = this.aClass219_1.anInt6911;
			this.aClass271_1.anInt8278 = this.aClass219_1.anInt6908;
			this.aClass271_1.anInt8270 = this.aClass271_2.anInt8270;
			this.aClass271_1.anInt8273 = this.aClass219_1.anInt6916;
		}
		this.anInt2329 = 0;
		for (@Pc(1148) Class15_Sub5_Sub1_Sub1 local1148 = (Class15_Sub5_Sub1_Sub1) this.aClass123_3.method3537(); local1148 != null; local1148 = (Class15_Sub5_Sub1_Sub1) this.aClass123_3.method3541()) {
			local1148.method3103(arg2, arg1);
			this.anInt2329++;
		}
		Static63.anInt1976 += this.anInt2329;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!ha;IJ)V")
	public void method1971(@OriginalArg(0) Class16 arg0, @OriginalArg(2) long arg1) {
		for (@Pc(7) Class15_Sub5_Sub1_Sub1 local7 = (Class15_Sub5_Sub1_Sub1) this.aClass123_3.method3537(); local7 != null; local7 = (Class15_Sub5_Sub1_Sub1) this.aClass123_3.method3541()) {
			local7.method3100(arg0, arg1);
		}
	}
}
