import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class21_Sub8 extends Class21 {

	@OriginalMember(owner = "client!lh", name = "p", descriptor = "I")
	public int anInt6000;

	@OriginalMember(owner = "client!lh", name = "y", descriptor = "I")
	private int anInt6004;

	@OriginalMember(owner = "client!lh", name = "z", descriptor = "I")
	private int anInt6005;

	@OriginalMember(owner = "client!lh", name = "B", descriptor = "I")
	private int anInt6006;

	@OriginalMember(owner = "client!lh", name = "C", descriptor = "I")
	private int anInt6007;

	@OriginalMember(owner = "client!lh", name = "D", descriptor = "I")
	private int anInt6008;

	@OriginalMember(owner = "client!lh", name = "E", descriptor = "I")
	private int anInt6009;

	@OriginalMember(owner = "client!lh", name = "F", descriptor = "I")
	private int anInt6010;

	@OriginalMember(owner = "client!lh", name = "o", descriptor = "Z")
	public boolean aBoolean423 = false;

	@OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
	private int anInt5997 = 0;

	@OriginalMember(owner = "client!lh", name = "w", descriptor = "Lclient!ak;")
	public Class14 aClass14_1 = new Class14();

	@OriginalMember(owner = "client!lh", name = "x", descriptor = "Lclient!ak;")
	private Class14 aClass14_2 = new Class14();

	@OriginalMember(owner = "client!lh", name = "A", descriptor = "Z")
	private boolean aBoolean424 = false;

	@OriginalMember(owner = "client!lh", name = "q", descriptor = "Lclient!kw;")
	public final Class190 aClass190_2;

	@OriginalMember(owner = "client!lh", name = "t", descriptor = "Lclient!hda;")
	public final Class21_Sub5 aClass21_Sub5_7;

	@OriginalMember(owner = "client!lh", name = "k", descriptor = "J")
	private final long aLong154;

	@OriginalMember(owner = "client!lh", name = "j", descriptor = "Lclient!gi;")
	public Class126 aClass126_1;

	@OriginalMember(owner = "client!lh", name = "n", descriptor = "Lclient!iv;")
	public final Class158 aClass158_11;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Lclient!r;Lclient!kw;Lclient!hda;J)V")
	public Class21_Sub8(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class190 arg1, @OriginalArg(2) Class21_Sub5 arg2, @OriginalArg(3) long arg3) {
		this.aClass190_2 = arg1;
		this.aClass21_Sub5_7 = arg2;
		this.aLong154 = arg3;
		this.aClass126_1 = this.aClass190_2.method4496();
		if (!arg0.method7845() && this.aClass126_1.anInt3537 != -1) {
			this.aClass126_1 = Static79.method1620(this.aClass126_1.anInt3537);
		}
		this.aClass158_11 = new Class158();
		this.anInt5997 = (int) ((double) this.anInt5997 + Math.random() * 64.0D);
		this.method4738();
		this.aClass14_2.anInt863 = this.aClass14_1.anInt863;
		this.aClass14_2.anInt859 = this.aClass14_1.anInt859;
		this.aClass14_2.anInt865 = this.aClass14_1.anInt865;
		this.aClass14_2.anInt858 = this.aClass14_1.anInt858;
		this.aClass14_2.anInt857 = this.aClass14_1.anInt857;
		this.aClass14_2.anInt862 = this.aClass14_1.anInt862;
		this.aClass14_2.anInt861 = this.aClass14_1.anInt861;
		this.aClass14_2.anInt856 = this.aClass14_1.anInt856;
		this.aClass14_2.anInt855 = this.aClass14_1.anInt855;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(JZLclient!r;II)V")
	public void method4736(@OriginalArg(0) long arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class7 arg2, @OriginalArg(3) int arg3) {
		@Pc(53) int local53;
		if (this.aBoolean423) {
			arg1 = false;
		} else if (this.aClass126_1.anInt3503 > Static204.anInt8817) {
			arg1 = false;
		} else if (Static343.anInt6620 > Static204.anIntArray515[Static204.anInt8817]) {
			arg1 = false;
		} else if (this.aBoolean424) {
			arg1 = false;
		} else if (this.aClass126_1.anInt3501 != -1) {
			local53 = (int) (arg0 - this.aLong154);
			if (this.aClass126_1.aBoolean258 || this.aClass126_1.anInt3501 >= local53) {
				local53 %= this.aClass126_1.anInt3501;
			} else {
				arg1 = false;
			}
			if (!this.aClass126_1.aBoolean254 && this.aClass126_1.anInt3488 > local53) {
				arg1 = false;
			}
			if (this.aClass126_1.aBoolean254 && this.aClass126_1.anInt3488 <= local53) {
				arg1 = false;
			}
		}
		if (arg1) {
			Static319.anInt6347++;
			local53 = (this.aClass14_1.anInt859 + this.aClass14_1.anInt855 + this.aClass14_1.anInt865) / 3;
			@Pc(136) int local136 = (this.aClass14_1.anInt858 + this.aClass14_1.anInt856 + this.aClass14_1.anInt862) / 3;
			@Pc(150) int local150 = (this.aClass14_1.anInt861 + this.aClass14_1.anInt863 + this.aClass14_1.anInt857) / 3;
			@Pc(193) int local193;
			@Pc(202) int local202;
			@Pc(211) int local211;
			@Pc(219) int local219;
			@Pc(227) int local227;
			@Pc(235) int local235;
			@Pc(339) int local339;
			@Pc(395) int local395;
			@Pc(416) int local416;
			if (this.aClass14_1.anInt867 != local53 || this.aClass14_1.anInt866 != local136 || local150 != this.aClass14_1.anInt860) {
				this.aClass14_1.anInt866 = local136;
				this.aClass14_1.anInt867 = local53;
				this.aClass14_1.anInt860 = local150;
				local193 = this.aClass14_1.anInt855 - this.aClass14_1.anInt865;
				local202 = this.aClass14_1.anInt856 - this.aClass14_1.anInt862;
				local211 = this.aClass14_1.anInt863 - this.aClass14_1.anInt857;
				local219 = this.aClass14_1.anInt859 - this.aClass14_1.anInt865;
				local227 = this.aClass14_1.anInt858 - this.aClass14_1.anInt862;
				local235 = this.aClass14_1.anInt861 - this.aClass14_1.anInt857;
				this.anInt6010 = local202 * local235 - local227 * local211;
				this.anInt6005 = local219 * local211 - local235 * local193;
				this.anInt6006 = local227 * local193 - local202 * local219;
				while (true) {
					if (this.anInt6010 <= 32767 && this.anInt6005 <= 32767 && this.anInt6006 <= 32767 && this.anInt6010 >= -32767 && this.anInt6005 >= -32767 && this.anInt6006 >= -32767) {
						local339 = (int) Math.sqrt((double) (this.anInt6005 * this.anInt6005 + this.anInt6010 * this.anInt6010 + this.anInt6006 * this.anInt6006));
						if (local339 <= 0) {
							local339 = 1;
						}
						this.anInt6005 = this.anInt6005 * 32767 / local339;
						this.anInt6006 = this.anInt6006 * 32767 / local339;
						this.anInt6010 = this.anInt6010 * 32767 / local339;
						if (this.aClass126_1.aShort32 > 0 || this.aClass126_1.aShort31 > 0) {
							local395 = (int) (Math.atan2((double) this.anInt6006, (double) this.anInt6010) * 2607.5945876176133D);
							local416 = (int) (Math.atan2((double) this.anInt6005, Math.sqrt((double) (this.anInt6010 * this.anInt6010 + this.anInt6006 * this.anInt6006))) * 2607.5945876176133D);
							this.anInt6004 = this.aClass126_1.aShort32 - this.aClass126_1.aShort30;
							this.anInt6009 = this.aClass126_1.aShort31 - this.aClass126_1.aShort33;
							this.anInt6008 = this.aClass126_1.aShort30 + local395 - (this.anInt6004 >> 1);
							this.anInt6007 = this.aClass126_1.aShort33 + local416 - (this.anInt6009 >> 1);
						}
						break;
					}
					this.anInt6010 >>= 0x1;
					this.anInt6006 >>= 0x1;
					this.anInt6005 >>= 0x1;
				}
			}
			this.anInt5997 += (int) ((double) arg3 * ((double) this.aClass126_1.anInt3506 + Math.random() * (double) (this.aClass126_1.anInt3536 - this.aClass126_1.anInt3506)));
			if (this.anInt5997 > 63) {
				local193 = this.anInt5997 >> 6;
				this.anInt5997 &= 0x3F;
				for (local227 = 0; local227 < local193; local227++) {
					@Pc(574) int local574;
					@Pc(578) int local578;
					if (this.aClass126_1.aShort32 <= 0 && this.aClass126_1.aShort31 <= 0) {
						local202 = this.anInt6010;
						local219 = this.anInt6006;
						local211 = this.anInt6005;
					} else {
						local235 = this.anInt6008 + (int) ((double) this.anInt6004 * Math.random());
						local235 &= 0x3FFF;
						local339 = Class262.anIntArray420[local235];
						local395 = Class262.anIntArray421[local235];
						local416 = (int) ((double) this.anInt6009 * Math.random()) + this.anInt6007;
						local416 &= 0x1FFF;
						local574 = Class262.anIntArray420[local416];
						local578 = Class262.anIntArray421[local416];
						local211 = (local578 << 1) * -1;
						local202 = local395 * local574 >> 13;
						local219 = local339 * local574 >> 13;
					}
					@Pc(601) float local601 = (float) Math.random();
					@Pc(604) float local604 = (float) Math.random();
					if (local604 + local601 > 1.0F) {
						local601 = 1.0F - local601;
						local604 = 1.0F - local604;
					}
					@Pc(625) float local625 = 1.0F - local601 - local604;
					local416 = (int) ((float) this.aClass14_1.anInt859 * local625 + local601 * (float) this.aClass14_1.anInt865 + local604 * (float) this.aClass14_1.anInt855);
					local574 = (int) (local625 * (float) this.aClass14_1.anInt858 + (float) this.aClass14_1.anInt856 * local604 + (float) this.aClass14_1.anInt862 * local601);
					local578 = (int) ((float) this.aClass14_1.anInt857 * local601 + (float) this.aClass14_1.anInt863 * local604 + local625 * (float) this.aClass14_1.anInt861);
					@Pc(713) int local713 = (int) (local625 * (float) this.aClass14_2.anInt859 + (float) this.aClass14_2.anInt855 * local604 + local601 * (float) this.aClass14_2.anInt865);
					@Pc(735) int local735 = (int) (local601 * (float) this.aClass14_2.anInt862 + (float) this.aClass14_2.anInt856 * local604 + (float) this.aClass14_2.anInt858 * local625);
					@Pc(757) int local757 = (int) ((float) this.aClass14_2.anInt863 * local604 + (float) this.aClass14_2.anInt857 * local601 + (float) this.aClass14_2.anInt861 * local625);
					@Pc(762) int local762 = local416 - local713;
					@Pc(767) int local767 = local574 - local735;
					@Pc(772) int local772 = local578 - local757;
					@Pc(781) int local781 = (int) (Math.random() * (double) local762 + (double) local713);
					@Pc(790) int local790 = (int) ((double) local735 + (double) local767 * Math.random());
					@Pc(799) int local799 = (int) ((double) local757 + (double) local772 * Math.random());
					@Pc(816) int local816 = (int) ((double) (this.aClass126_1.anInt3541 - this.aClass126_1.anInt3514) * Math.random()) + this.aClass126_1.anInt3514;
					@Pc(833) int local833 = (int) (Math.random() * (double) (this.aClass126_1.anInt3529 - this.aClass126_1.anInt3540)) + this.aClass126_1.anInt3540;
					@Pc(850) int local850 = (int) (Math.random() * (double) (this.aClass126_1.anInt3535 - this.aClass126_1.anInt3532)) + this.aClass126_1.anInt3532;
					@Pc(912) int local912;
					if (this.aClass126_1.aBoolean253) {
						@Pc(916) double local916 = Math.random();
						local912 = (int) ((double) this.aClass126_1.anInt3505 + (double) this.aClass126_1.anInt3493 * local916) << 16 | (int) ((double) this.aClass126_1.anInt3520 + local916 * (double) this.aClass126_1.anInt3530) << 8 | (int) (local916 * (double) this.aClass126_1.anInt3498 + (double) this.aClass126_1.anInt3534) | (int) (Math.random() * (double) this.aClass126_1.anInt3494 + (double) this.aClass126_1.anInt3527) << 24;
					} else {
						local912 = (int) ((double) this.aClass126_1.anInt3527 + Math.random() * (double) this.aClass126_1.anInt3494) << 24 | (int) ((double) this.aClass126_1.anInt3534 + (double) this.aClass126_1.anInt3498 * Math.random()) | (int) ((double) this.aClass126_1.anInt3530 * Math.random() + (double) this.aClass126_1.anInt3520) << 8 | (int) (Math.random() * (double) this.aClass126_1.anInt3493 + (double) this.aClass126_1.anInt3505) << 16;
					}
					@Pc(978) int local978 = this.aClass126_1.anInt3496;
					if (!arg2.method7845() && !this.aClass126_1.aBoolean257) {
						local978 = -1;
					}
					if (Static284.anInt5830 == Static37.anInt1238) {
						new Class21_Sub3_Sub1_Sub1(this, local781, local790, local799, local202, local211, local219, local816, local833, local912, local850, local978, this.aClass126_1.aBoolean260, this.aClass126_1.aBoolean256);
					} else {
						@Pc(1022) Class21_Sub3_Sub1_Sub1 local1022 = Static248.aClass21_Sub3_Sub1_Sub1Array2[Static37.anInt1238];
						Static37.anInt1238 = Static37.anInt1238 + 1 & 0x3FF;
						local1022.method6660(this, local781, local790, local799, local202, local211, local219, local816, local833, local912, local850, local978, this.aClass126_1.aBoolean260, this.aClass126_1.aBoolean256);
					}
				}
			}
		}
		if (!this.aClass14_1.method757(this.aClass14_2)) {
			@Pc(1066) Class14 local1066 = this.aClass14_2;
			this.aClass14_2 = this.aClass14_1;
			this.aClass14_1 = local1066;
			this.aClass14_1.anInt855 = this.aClass190_2.anInt5818;
			this.aClass14_1.anInt865 = this.aClass190_2.anInt5828;
			this.aClass14_1.anInt863 = this.aClass190_2.anInt5815;
			this.aClass14_1.anInt861 = this.aClass190_2.anInt5814;
			this.aClass14_1.anInt862 = this.aClass190_2.anInt5820;
			this.aClass14_1.anInt856 = this.aClass190_2.anInt5826;
			this.aClass14_1.anInt858 = this.aClass190_2.anInt5829;
			this.aClass14_1.anInt857 = this.aClass190_2.anInt5817;
			this.aClass14_1.anInt859 = this.aClass190_2.anInt5821;
		}
		this.anInt6000 = 0;
		for (@Pc(1142) Class21_Sub3_Sub1_Sub1 local1142 = (Class21_Sub3_Sub1_Sub1) this.aClass158_11.method3726(); local1142 != null; local1142 = (Class21_Sub3_Sub1_Sub1) this.aClass158_11.method3721()) {
			local1142.method6659(arg0, arg3);
			this.anInt6000++;
		}
		Static430.anInt8212 += this.anInt6000;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
	public void method4738() {
		this.aClass14_1.anInt862 = this.aClass190_2.anInt5820;
		this.aClass14_1.anInt865 = this.aClass190_2.anInt5828;
		this.aClass14_1.anInt857 = this.aClass190_2.anInt5817;
		this.aClass14_1.anInt855 = this.aClass190_2.anInt5818;
		this.aClass14_1.anInt861 = this.aClass190_2.anInt5814;
		this.aClass14_1.anInt863 = this.aClass190_2.anInt5815;
		this.aClass14_1.anInt859 = this.aClass190_2.anInt5821;
		this.aClass14_1.anInt858 = this.aClass190_2.anInt5829;
		this.aClass14_1.anInt856 = this.aClass190_2.anInt5826;
		if (this.aClass14_1.anInt855 == this.aClass14_1.anInt865 && this.aClass14_1.anInt859 == this.aClass14_1.anInt855 && this.aClass14_1.anInt862 == this.aClass14_1.anInt856 && this.aClass14_1.anInt856 == this.aClass14_1.anInt858 && this.aClass14_1.anInt863 == this.aClass14_1.anInt857 && this.aClass14_1.anInt863 == this.aClass14_1.anInt861) {
			this.aBoolean424 = true;
		} else if (this.aBoolean424) {
			this.aClass14_2.anInt855 = this.aClass14_1.anInt855;
			this.aClass14_2.anInt862 = this.aClass14_1.anInt862;
			this.aClass14_2.anInt863 = this.aClass14_1.anInt863;
			this.aClass14_2.anInt861 = this.aClass14_1.anInt861;
			this.aClass14_2.anInt857 = this.aClass14_1.anInt857;
			this.aClass14_2.anInt859 = this.aClass14_1.anInt859;
			this.aClass14_2.anInt865 = this.aClass14_1.anInt865;
			this.aBoolean424 = false;
			this.aClass14_2.anInt856 = this.aClass14_1.anInt856;
			this.aClass14_2.anInt858 = this.aClass14_1.anInt858;
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILclient!r;J)V")
	public void method4740(@OriginalArg(1) Class7 arg0, @OriginalArg(2) long arg1) {
		for (@Pc(7) Class21_Sub3_Sub1_Sub1 local7 = (Class21_Sub3_Sub1_Sub1) this.aClass158_11.method3726(); local7 != null; local7 = (Class21_Sub3_Sub1_Sub1) this.aClass158_11.method3721()) {
			local7.method6657(arg0, arg1);
		}
	}
}
