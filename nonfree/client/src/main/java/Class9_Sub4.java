import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public final class Class9_Sub4 extends Class9 {

	@OriginalMember(owner = "client!ig", name = "x", descriptor = "I")
	public int anInt4705;

	@OriginalMember(owner = "client!ig", name = "A", descriptor = "I")
	private int anInt4706;

	@OriginalMember(owner = "client!ig", name = "B", descriptor = "I")
	private int anInt4707;

	@OriginalMember(owner = "client!ig", name = "C", descriptor = "I")
	private int anInt4708;

	@OriginalMember(owner = "client!ig", name = "D", descriptor = "I")
	private int anInt4709;

	@OriginalMember(owner = "client!ig", name = "E", descriptor = "I")
	private int anInt4710;

	@OriginalMember(owner = "client!ig", name = "G", descriptor = "I")
	private int anInt4711;

	@OriginalMember(owner = "client!ig", name = "H", descriptor = "I")
	private int anInt4712;

	@OriginalMember(owner = "client!ig", name = "l", descriptor = "I")
	private int anInt4699 = 0;

	@OriginalMember(owner = "client!ig", name = "r", descriptor = "Z")
	public boolean aBoolean344 = false;

	@OriginalMember(owner = "client!ig", name = "q", descriptor = "Lclient!an;")
	public Class17 aClass17_1 = new Class17();

	@OriginalMember(owner = "client!ig", name = "z", descriptor = "Lclient!an;")
	private Class17 aClass17_2 = new Class17();

	@OriginalMember(owner = "client!ig", name = "F", descriptor = "Z")
	private boolean aBoolean346 = false;

	@OriginalMember(owner = "client!ig", name = "s", descriptor = "Lclient!nha;")
	public final Class9_Sub8 aClass9_Sub8_4;

	@OriginalMember(owner = "client!ig", name = "w", descriptor = "J")
	private final long aLong121;

	@OriginalMember(owner = "client!ig", name = "v", descriptor = "Lclient!mv;")
	public final Class228 aClass228_1;

	@OriginalMember(owner = "client!ig", name = "i", descriptor = "Lclient!df;")
	public Class68 aClass68_1;

	@OriginalMember(owner = "client!ig", name = "j", descriptor = "Lclient!hca;")
	public final Class139 aClass139_5;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lclient!ha;Lclient!mv;Lclient!nha;J)V")
	public Class9_Sub4(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class228 arg1, @OriginalArg(2) Class9_Sub8 arg2, @OriginalArg(3) long arg3) {
		this.aClass9_Sub8_4 = arg2;
		this.aLong121 = arg3;
		this.aClass228_1 = arg1;
		this.aClass68_1 = this.aClass228_1.method5815();
		if (!arg0.method6129() && this.aClass68_1.anInt1881 != -1) {
			this.aClass68_1 = Static237.method4043(this.aClass68_1.anInt1881);
		}
		this.aClass139_5 = new Class139();
		this.anInt4699 = (int) ((double) this.anInt4699 + Math.random() * 64.0D);
		this.method4025();
		this.aClass17_2.anInt266 = this.aClass17_1.anInt266;
		this.aClass17_2.anInt257 = this.aClass17_1.anInt257;
		this.aClass17_2.anInt268 = this.aClass17_1.anInt268;
		this.aClass17_2.anInt267 = this.aClass17_1.anInt267;
		this.aClass17_2.anInt258 = this.aClass17_1.anInt258;
		this.aClass17_2.anInt265 = this.aClass17_1.anInt265;
		this.aClass17_2.anInt262 = this.aClass17_1.anInt262;
		this.aClass17_2.anInt260 = this.aClass17_1.anInt260;
		this.aClass17_2.anInt261 = this.aClass17_1.anInt261;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(JLclient!ha;Z)V")
	public void method4023(@OriginalArg(0) long arg0, @OriginalArg(1) Class82 arg1) {
		for (@Pc(11) Class9_Sub3_Sub2_Sub1 local11 = (Class9_Sub3_Sub2_Sub1) this.aClass139_5.method3198(); local11 != null; local11 = (Class9_Sub3_Sub2_Sub1) this.aClass139_5.method3205()) {
			local11.method5875(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
	public void method4025() {
		this.aClass17_1.anInt260 = this.aClass228_1.anInt6686;
		this.aClass17_1.anInt266 = this.aClass228_1.anInt6699;
		this.aClass17_1.anInt267 = this.aClass228_1.anInt6690;
		this.aClass17_1.anInt262 = this.aClass228_1.anInt6694;
		this.aClass17_1.anInt258 = this.aClass228_1.anInt6700;
		this.aClass17_1.anInt261 = this.aClass228_1.anInt6684;
		this.aClass17_1.anInt265 = this.aClass228_1.anInt6687;
		this.aClass17_1.anInt268 = this.aClass228_1.anInt6696;
		this.aClass17_1.anInt257 = this.aClass228_1.anInt6693;
		if (this.aClass17_1.anInt267 == this.aClass17_1.anInt261 && this.aClass17_1.anInt257 == this.aClass17_1.anInt267 && this.aClass17_1.anInt268 == this.aClass17_1.anInt262 && this.aClass17_1.anInt262 == this.aClass17_1.anInt266 && this.aClass17_1.anInt260 == this.aClass17_1.anInt258 && this.aClass17_1.anInt258 == this.aClass17_1.anInt265) {
			this.aBoolean346 = true;
		} else if (this.aBoolean346) {
			this.aClass17_2.anInt265 = this.aClass17_1.anInt265;
			this.aClass17_2.anInt267 = this.aClass17_1.anInt267;
			this.aClass17_2.anInt266 = this.aClass17_1.anInt266;
			this.aBoolean346 = false;
			this.aClass17_2.anInt257 = this.aClass17_1.anInt257;
			this.aClass17_2.anInt260 = this.aClass17_1.anInt260;
			this.aClass17_2.anInt268 = this.aClass17_1.anInt268;
			this.aClass17_2.anInt258 = this.aClass17_1.anInt258;
			this.aClass17_2.anInt261 = this.aClass17_1.anInt261;
			this.aClass17_2.anInt262 = this.aClass17_1.anInt262;
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IJZLclient!ha;I)V")
	public void method4026(@OriginalArg(1) long arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class82 arg2, @OriginalArg(4) int arg3) {
		@Pc(61) int local61;
		if (this.aBoolean344) {
			arg1 = false;
		} else if (this.aClass68_1.anInt1891 > Static479.anInt7495) {
			arg1 = false;
		} else if (Static121.anIntArray167[Static479.anInt7495] < Static306.anInt5977) {
			arg1 = false;
		} else if (this.aBoolean346) {
			arg1 = false;
		} else if (this.aClass68_1.anInt1887 != -1) {
			local61 = (int) (arg0 - this.aLong121);
			if (this.aClass68_1.aBoolean139 || this.aClass68_1.anInt1887 >= local61) {
				local61 %= this.aClass68_1.anInt1887;
			} else {
				arg1 = false;
			}
			if (!this.aClass68_1.aBoolean137 && this.aClass68_1.anInt1871 > local61) {
				arg1 = false;
			}
			if (this.aClass68_1.aBoolean137 && local61 >= this.aClass68_1.anInt1871) {
				arg1 = false;
			}
		}
		if (arg1) {
			Static342.anInt6328++;
			local61 = (this.aClass17_1.anInt257 + this.aClass17_1.anInt261 + this.aClass17_1.anInt267) / 3;
			@Pc(144) int local144 = (this.aClass17_1.anInt266 + this.aClass17_1.anInt262 + this.aClass17_1.anInt268) / 3;
			@Pc(158) int local158 = (this.aClass17_1.anInt265 + this.aClass17_1.anInt258 + this.aClass17_1.anInt260) / 3;
			@Pc(202) int local202;
			@Pc(210) int local210;
			@Pc(218) int local218;
			@Pc(227) int local227;
			@Pc(236) int local236;
			@Pc(245) int local245;
			@Pc(346) int local346;
			@Pc(396) int local396;
			@Pc(417) int local417;
			if (this.aClass17_1.anInt264 != local61 || this.aClass17_1.anInt271 != local144 || local158 != this.aClass17_1.anInt263) {
				this.aClass17_1.anInt264 = local61;
				this.aClass17_1.anInt263 = local158;
				this.aClass17_1.anInt271 = local144;
				local202 = this.aClass17_1.anInt267 - this.aClass17_1.anInt261;
				local210 = this.aClass17_1.anInt262 - this.aClass17_1.anInt268;
				local218 = this.aClass17_1.anInt258 - this.aClass17_1.anInt260;
				local227 = this.aClass17_1.anInt257 - this.aClass17_1.anInt261;
				local236 = this.aClass17_1.anInt266 - this.aClass17_1.anInt268;
				local245 = this.aClass17_1.anInt265 - this.aClass17_1.anInt260;
				this.anInt4710 = local202 * local236 - local210 * local227;
				this.anInt4709 = local210 * local245 - local236 * local218;
				this.anInt4706 = local227 * local218 - local202 * local245;
				while (true) {
					if (this.anInt4709 <= 32767 && this.anInt4706 <= 32767 && this.anInt4710 <= 32767 && this.anInt4709 >= -32767 && this.anInt4706 >= -32767 && this.anInt4710 >= -32767) {
						local346 = (int) Math.sqrt((double) (this.anInt4709 * this.anInt4709 + this.anInt4706 * this.anInt4706 + this.anInt4710 * this.anInt4710));
						if (local346 <= 0) {
							local346 = 1;
						}
						this.anInt4710 = this.anInt4710 * 32767 / local346;
						this.anInt4709 = this.anInt4709 * 32767 / local346;
						this.anInt4706 = this.anInt4706 * 32767 / local346;
						if (this.aClass68_1.aShort26 > 0 || this.aClass68_1.aShort27 > 0) {
							local396 = (int) (Math.atan2((double) this.anInt4710, (double) this.anInt4709) * 2607.5945876176133D);
							local417 = (int) (Math.atan2((double) this.anInt4706, Math.sqrt((double) (this.anInt4710 * this.anInt4710 + this.anInt4709 * this.anInt4709))) * 2607.5945876176133D);
							this.anInt4712 = this.aClass68_1.aShort26 - this.aClass68_1.aShort25;
							this.anInt4707 = this.aClass68_1.aShort27 - this.aClass68_1.aShort24;
							this.anInt4708 = this.aClass68_1.aShort25 + local396 - (this.anInt4712 >> 1);
							this.anInt4711 = this.aClass68_1.aShort24 + local417 - (this.anInt4707 >> 1);
						}
						break;
					}
					this.anInt4709 >>= 0x1;
					this.anInt4710 >>= 0x1;
					this.anInt4706 >>= 0x1;
				}
			}
			this.anInt4699 += (int) (((double) this.aClass68_1.anInt1894 + (double) (this.aClass68_1.anInt1902 - this.aClass68_1.anInt1894) * Math.random()) * (double) arg3);
			if (this.anInt4699 > 63) {
				local202 = this.anInt4699 >> 6;
				this.anInt4699 &= 0x3F;
				for (local236 = 0; local236 < local202; local236++) {
					@Pc(557) int local557;
					@Pc(561) int local561;
					if (this.aClass68_1.aShort26 <= 0 && this.aClass68_1.aShort27 <= 0) {
						local210 = this.anInt4709;
						local218 = this.anInt4706;
						local227 = this.anInt4710;
					} else {
						local245 = (int) (Math.random() * (double) this.anInt4712) + this.anInt4708;
						local245 &= 0x3FFF;
						local346 = Class3_Sub13.anIntArray147[local245];
						local396 = Class3_Sub13.anIntArray146[local245];
						local417 = (int) (Math.random() * (double) this.anInt4707) + this.anInt4711;
						local417 &= 0x1FFF;
						local557 = Class3_Sub13.anIntArray147[local417];
						local561 = Class3_Sub13.anIntArray146[local417];
						local218 = (local561 << 1) * -1;
						local210 = local557 * local396 >> 13;
						local227 = local346 * local557 >> 13;
					}
					@Pc(595) float local595 = (float) Math.random();
					@Pc(598) float local598 = (float) Math.random();
					if (local598 + local595 > 1.0F) {
						local595 = 1.0F - local595;
						local598 = 1.0F - local598;
					}
					@Pc(618) float local618 = 1.0F - local598 - local595;
					local417 = (int) (local595 * (float) this.aClass17_1.anInt261 + (float) this.aClass17_1.anInt267 * local598 + (float) this.aClass17_1.anInt257 * local618);
					local557 = (int) ((float) this.aClass17_1.anInt266 * local618 + local595 * (float) this.aClass17_1.anInt268 + (float) this.aClass17_1.anInt262 * local598);
					local561 = (int) ((float) this.aClass17_1.anInt260 * local595 + (float) this.aClass17_1.anInt258 * local598 + local618 * (float) this.aClass17_1.anInt265);
					@Pc(706) int local706 = (int) ((float) this.aClass17_2.anInt267 * local598 + local595 * (float) this.aClass17_2.anInt261 + local618 * (float) this.aClass17_2.anInt257);
					@Pc(728) int local728 = (int) ((float) this.aClass17_2.anInt268 * local595 + (float) this.aClass17_2.anInt262 * local598 + (float) this.aClass17_2.anInt266 * local618);
					@Pc(750) int local750 = (int) ((float) this.aClass17_2.anInt265 * local618 + (float) this.aClass17_2.anInt260 * local595 + (float) this.aClass17_2.anInt258 * local598);
					@Pc(755) int local755 = local417 - local706;
					@Pc(760) int local760 = local557 - local728;
					@Pc(765) int local765 = local561 - local750;
					@Pc(774) int local774 = (int) ((double) local706 + (double) local755 * Math.random());
					@Pc(783) int local783 = (int) ((double) local728 + Math.random() * (double) local760);
					@Pc(792) int local792 = (int) (Math.random() * (double) local765 + (double) local750);
					@Pc(809) int local809 = this.aClass68_1.anInt1861 + (int) ((double) (this.aClass68_1.anInt1876 - this.aClass68_1.anInt1861) * Math.random());
					@Pc(825) int local825 = (int) (Math.random() * (double) (this.aClass68_1.anInt1893 - this.aClass68_1.anInt1878)) + this.aClass68_1.anInt1878;
					@Pc(841) int local841 = this.aClass68_1.anInt1870 + (int) (Math.random() * (double) (this.aClass68_1.anInt1885 - this.aClass68_1.anInt1870));
					@Pc(903) int local903;
					if (this.aClass68_1.aBoolean143) {
						@Pc(907) double local907 = Math.random();
						local903 = (int) ((double) this.aClass68_1.anInt1888 + Math.random() * (double) this.aClass68_1.anInt1872) << 24 | (int) (local907 * (double) this.aClass68_1.anInt1860 + (double) this.aClass68_1.anInt1889) << 16 | (int) ((double) this.aClass68_1.anInt1900 + (double) this.aClass68_1.anInt1868 * local907) << 8 | (int) ((double) this.aClass68_1.anInt1874 + local907 * (double) this.aClass68_1.anInt1857);
					} else {
						local903 = (int) ((double) this.aClass68_1.anInt1857 * Math.random() + (double) this.aClass68_1.anInt1874) | (int) ((double) this.aClass68_1.anInt1889 + (double) this.aClass68_1.anInt1860 * Math.random()) << 16 | (int) ((double) this.aClass68_1.anInt1900 + Math.random() * (double) this.aClass68_1.anInt1868) << 8 | (int) ((double) this.aClass68_1.anInt1888 + (double) this.aClass68_1.anInt1872 * Math.random()) << 24;
					}
					@Pc(969) int local969 = this.aClass68_1.anInt1901;
					if (!arg2.method6129() && !this.aClass68_1.aBoolean140) {
						local969 = -1;
					}
					if (Static332.anInt6265 == Static502.anInt8458) {
						new Class9_Sub3_Sub2_Sub1(this, local774, local783, local792, local210, local218, local227, local809, local825, local903, local841, local969, this.aClass68_1.aBoolean141, this.aClass68_1.aBoolean142);
					} else {
						@Pc(1009) Class9_Sub3_Sub2_Sub1 local1009 = Static342.aClass9_Sub3_Sub2_Sub1Array1[Static502.anInt8458];
						Static502.anInt8458 = Static502.anInt8458 + 1 & 0x3FF;
						local1009.method5873(this, local774, local783, local792, local210, local218, local227, local809, local825, local903, local841, local969, this.aClass68_1.aBoolean141, this.aClass68_1.aBoolean142);
					}
				}
			}
		}
		if (!this.aClass17_1.method263(this.aClass17_2)) {
			@Pc(1049) Class17 local1049 = this.aClass17_2;
			this.aClass17_2 = this.aClass17_1;
			this.aClass17_1 = local1049;
			this.aClass17_1.anInt263 = this.aClass17_2.anInt263;
			this.aClass17_1.anInt267 = this.aClass228_1.anInt6690;
			this.aClass17_1.anInt257 = this.aClass228_1.anInt6693;
			this.aClass17_1.anInt264 = this.aClass17_2.anInt264;
			this.aClass17_1.anInt265 = this.aClass228_1.anInt6687;
			this.aClass17_1.anInt261 = this.aClass228_1.anInt6684;
			this.aClass17_1.anInt268 = this.aClass228_1.anInt6696;
			this.aClass17_1.anInt260 = this.aClass228_1.anInt6686;
			this.aClass17_1.anInt271 = this.aClass17_2.anInt271;
			this.aClass17_1.anInt262 = this.aClass228_1.anInt6694;
			this.aClass17_1.anInt266 = this.aClass228_1.anInt6699;
			this.aClass17_1.anInt258 = this.aClass228_1.anInt6700;
		}
		this.anInt4705 = 0;
		for (@Pc(1137) Class9_Sub3_Sub2_Sub1 local1137 = (Class9_Sub3_Sub2_Sub1) this.aClass139_5.method3198(); local1137 != null; local1137 = (Class9_Sub3_Sub2_Sub1) this.aClass139_5.method3205()) {
			local1137.method5874(arg0, arg3);
			this.anInt4705++;
		}
		Static119.anInt2612 += this.anInt4705;
	}
}
