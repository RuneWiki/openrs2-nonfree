import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!os")
public final class Class20_Sub6 extends Class20 {

	@OriginalMember(owner = "client!os", name = "k", descriptor = "I")
	public int anInt4810;

	@OriginalMember(owner = "client!os", name = "m", descriptor = "I")
	private int anInt4811;

	@OriginalMember(owner = "client!os", name = "o", descriptor = "I")
	private int anInt4813;

	@OriginalMember(owner = "client!os", name = "p", descriptor = "I")
	private int anInt4814;

	@OriginalMember(owner = "client!os", name = "q", descriptor = "I")
	private int anInt4815;

	@OriginalMember(owner = "client!os", name = "r", descriptor = "I")
	private int anInt4816;

	@OriginalMember(owner = "client!os", name = "s", descriptor = "I")
	private int anInt4817;

	@OriginalMember(owner = "client!os", name = "t", descriptor = "I")
	private int anInt4818;

	@OriginalMember(owner = "client!os", name = "u", descriptor = "I")
	public int anInt4819;

	@OriginalMember(owner = "client!os", name = "w", descriptor = "I")
	public int anInt4820;

	@OriginalMember(owner = "client!os", name = "z", descriptor = "I")
	private int anInt4821;

	@OriginalMember(owner = "client!os", name = "B", descriptor = "I")
	private int anInt4823;

	@OriginalMember(owner = "client!os", name = "F", descriptor = "I")
	private int anInt4826;

	@OriginalMember(owner = "client!os", name = "K", descriptor = "I")
	private int anInt4830;

	@OriginalMember(owner = "client!os", name = "L", descriptor = "I")
	private int anInt4831;

	@OriginalMember(owner = "client!os", name = "O", descriptor = "I")
	private int anInt4832;

	@OriginalMember(owner = "client!os", name = "P", descriptor = "I")
	private int anInt4833;

	@OriginalMember(owner = "client!os", name = "R", descriptor = "I")
	private int anInt4835;

	@OriginalMember(owner = "client!os", name = "S", descriptor = "I")
	private int anInt4836;

	@OriginalMember(owner = "client!os", name = "T", descriptor = "I")
	public int anInt4837;

	@OriginalMember(owner = "client!os", name = "v", descriptor = "Z")
	public boolean aBoolean351 = false;

	@OriginalMember(owner = "client!os", name = "n", descriptor = "I")
	private int anInt4812 = 0;

	@OriginalMember(owner = "client!os", name = "C", descriptor = "Z")
	private boolean aBoolean352 = false;

	@OriginalMember(owner = "client!os", name = "y", descriptor = "Lclient!hk;")
	public final Class20_Sub3 aClass20_Sub3_2;

	@OriginalMember(owner = "client!os", name = "J", descriptor = "J")
	private final long aLong148;

	@OriginalMember(owner = "client!os", name = "N", descriptor = "Lclient!ew;")
	public final Class76 aClass76_2;

	@OriginalMember(owner = "client!os", name = "x", descriptor = "Lclient!jb;")
	public Class132 aClass132_1;

	@OriginalMember(owner = "client!os", name = "l", descriptor = "Lclient!um;")
	public final Class248 aClass248_5;

	static {
		new Class15(null, "der Spieler ist momentan nicht verfügbar.", null, null);
	}

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "(Lclient!ya;Lclient!ew;Lclient!hk;J)V")
	public Class20_Sub6(@OriginalArg(0) Class135 arg0, @OriginalArg(1) Class76 arg1, @OriginalArg(2) Class20_Sub3 arg2, @OriginalArg(3) long arg3) {
		this.aClass20_Sub3_2 = arg2;
		this.aLong148 = arg3;
		this.aClass76_2 = arg1;
		this.aClass132_1 = this.aClass76_2.method1515();
		if (!arg0.method5386() && this.aClass132_1.anInt3265 != -1) {
			this.aClass132_1 = Static126.method1762(this.aClass132_1.anInt3265);
		}
		this.aClass248_5 = new Class248();
		this.anInt4812 = (int) ((double) this.anInt4812 + Math.random() * 64.0D);
		this.method3839();
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(JB)V")
	public void method3838(@OriginalArg(0) long arg0) {
		for (@Pc(5) Class20_Sub1_Sub1_Sub1 local5 = (Class20_Sub1_Sub1_Sub1) this.aClass248_5.method5583(); local5 != null; local5 = (Class20_Sub1_Sub1_Sub1) this.aClass248_5.method5577()) {
			local5.method518(arg0);
		}
	}

	@OriginalMember(owner = "client!os", name = "e", descriptor = "(I)V")
	public void method3839() {
		this.anInt4831 = this.aClass76_2.anInt1841;
		this.anInt4823 = this.aClass76_2.anInt1837;
		this.anInt4830 = this.aClass76_2.anInt1836;
		this.anInt4826 = this.aClass76_2.anInt1843;
		this.anInt4835 = this.aClass76_2.anInt1839;
		this.anInt4813 = this.aClass76_2.anInt1850;
		this.anInt4836 = this.aClass76_2.anInt1847;
		this.anInt4818 = this.aClass76_2.anInt1835;
		this.anInt4821 = this.aClass76_2.anInt1848;
		if (this.anInt4818 == this.anInt4826 && this.anInt4818 == this.anInt4830 && this.anInt4813 == this.anInt4836 && this.anInt4836 == this.anInt4821 && this.anInt4835 == this.anInt4831 && this.anInt4835 == this.anInt4823) {
			this.aBoolean352 = true;
			return;
		}
		this.aBoolean352 = false;
		@Pc(116) int local116 = (this.anInt4830 + this.anInt4826 + this.anInt4818) / 3;
		@Pc(128) int local128 = (this.anInt4813 + this.anInt4836 + this.anInt4821) / 3;
		@Pc(140) int local140 = (this.anInt4835 + this.anInt4831 + this.anInt4823) / 3;
		if (local116 == this.anInt4819 && this.anInt4820 == local128 && local140 == this.anInt4837) {
			return;
		}
		this.anInt4820 = local128;
		this.anInt4837 = local140;
		this.anInt4819 = local116;
		@Pc(173) int local173 = this.anInt4818 - this.anInt4826;
		@Pc(180) int local180 = this.anInt4836 - this.anInt4813;
		@Pc(186) int local186 = this.anInt4835 - this.anInt4831;
		@Pc(192) int local192 = this.anInt4830 - this.anInt4826;
		@Pc(199) int local199 = this.anInt4821 - this.anInt4813;
		@Pc(206) int local206 = this.anInt4823 - this.anInt4831;
		this.anInt4816 = local180 * local206 - local186 * local199;
		this.anInt4833 = local192 * local186 - local206 * local173;
		this.anInt4817 = local173 * local199 - local180 * local192;
		while (this.anInt4816 > 32767 || this.anInt4833 > 32767 || this.anInt4817 > 32767 || this.anInt4816 < -32767 || this.anInt4833 < -32767 || this.anInt4817 < -32767) {
			this.anInt4833 >>= 0x1;
			this.anInt4817 >>= 0x1;
			this.anInt4816 >>= 0x1;
		}
		@Pc(305) int local305 = (int) Math.sqrt((double) (this.anInt4816 * this.anInt4816 + this.anInt4833 * this.anInt4833 + this.anInt4817 * this.anInt4817));
		if (local305 <= 0) {
			local305 = 1;
		}
		this.anInt4817 = this.anInt4817 * 32767 / local305;
		this.anInt4816 = this.anInt4816 * 32767 / local305;
		this.anInt4833 = this.anInt4833 * 32767 / local305;
		if (this.aClass132_1.aShort52 <= 0 && this.aClass132_1.aShort54 <= 0) {
			return;
		}
		@Pc(358) int local358 = (int) (Math.atan2((double) this.anInt4817, (double) this.anInt4816) * 2607.5945876176133D);
		@Pc(379) int local379 = (int) (Math.atan2((double) this.anInt4833, Math.sqrt((double) (this.anInt4817 * this.anInt4817 + this.anInt4816 * this.anInt4816))) * 2607.5945876176133D);
		this.anInt4811 = this.aClass132_1.aShort52 - this.aClass132_1.aShort53;
		this.anInt4815 = this.aClass132_1.aShort54 - this.aClass132_1.aShort55;
		this.anInt4832 = this.aClass132_1.aShort53 + local358 - (this.anInt4811 >> 1);
		this.anInt4814 = local379 + this.aClass132_1.aShort55 - (this.anInt4815 >> 1);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ZIJZLclient!ya;)V")
	public void method3840(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(4) Class135 arg3) {
		@Pc(53) int local53;
		if (this.aBoolean351) {
			arg0 = false;
		} else if (Static258.anInt4313 < this.aClass132_1.anInt3257) {
			arg0 = false;
		} else if (Static240.anIntArray338[Static258.anInt4313] < Static82.anInt1612) {
			arg0 = false;
		} else if (this.aBoolean352) {
			arg0 = false;
		} else if (this.aClass132_1.anInt3239 != -1) {
			local53 = (int) (arg2 - this.aLong148);
			if (this.aClass132_1.aBoolean255 || this.aClass132_1.anInt3239 >= local53) {
				local53 %= this.aClass132_1.anInt3239;
			} else {
				arg0 = false;
			}
			if (!this.aClass132_1.aBoolean250 && local53 < this.aClass132_1.anInt3256) {
				arg0 = false;
			}
			if (this.aClass132_1.aBoolean250 && local53 >= this.aClass132_1.anInt3256) {
				arg0 = false;
			}
		}
		if (arg0) {
			this.anInt4812 += (int) ((double) arg1 * ((double) this.aClass132_1.anInt3260 + Math.random() * (double) (this.aClass132_1.anInt3279 - this.aClass132_1.anInt3260)));
			if (this.anInt4812 > 63) {
				local53 = this.anInt4812 >> 6;
				this.anInt4812 &= 0x3F;
				for (@Pc(150) int local150 = 0; local150 < local53; local150++) {
					@Pc(217) int local217;
					@Pc(223) int local223;
					@Pc(229) int local229;
					@Pc(174) int local174;
					@Pc(182) int local182;
					@Pc(186) int local186;
					@Pc(197) int local197;
					@Pc(205) int local205;
					@Pc(209) int local209;
					if (this.aClass132_1.aShort52 <= 0 && this.aClass132_1.aShort54 <= 0) {
						local217 = this.anInt4816;
						local223 = this.anInt4833;
						local229 = this.anInt4817;
					} else {
						local174 = this.anInt4832 + (int) ((double) this.anInt4811 * Math.random());
						@Pc(178) int local178 = local174 & 0x3FFF;
						local182 = Class100.anIntArray206[local178];
						local186 = Class100.anIntArray208[local178];
						local197 = this.anInt4814 + (int) ((double) this.anInt4815 * Math.random());
						@Pc(201) int local201 = local197 & 0x1FFF;
						local205 = Class100.anIntArray206[local201];
						local209 = Class100.anIntArray208[local201];
						local217 = local186 * local205 >> 15;
						local223 = (local209 << 0) * -1;
						local229 = local205 * local182 >> 15;
					}
					local174 = (int) (Math.random() * 65535.0D);
					local182 = (int) (Math.random() * 65535.0D);
					if (local182 + local174 > 65535) {
						local182 = 65535 - local182;
						local174 = 65535 - local174;
					}
					local186 = 65535 - local174 - local182;
					local197 = local186 * this.anInt4830 + local174 * this.anInt4826 + local182 * this.anInt4818 >> 16;
					local205 = local186 * this.anInt4821 + this.anInt4813 * local174 + this.anInt4836 * local182 >> 16;
					local209 = this.anInt4835 * local182 + this.anInt4831 * local174 + this.anInt4823 * local186 >> 16;
					@Pc(344) int local344 = this.aClass132_1.anInt3263 + (int) ((double) (this.aClass132_1.anInt3282 - this.aClass132_1.anInt3263) * Math.random());
					@Pc(361) int local361 = this.aClass132_1.anInt3246 + (int) ((double) (this.aClass132_1.anInt3240 - this.aClass132_1.anInt3246) * Math.random());
					@Pc(378) int local378 = this.aClass132_1.anInt3268 + (int) (Math.random() * (double) (this.aClass132_1.anInt3274 - this.aClass132_1.anInt3268));
					@Pc(440) int local440;
					if (this.aClass132_1.aBoolean256) {
						@Pc(444) double local444 = Math.random();
						local440 = (int) ((double) this.aClass132_1.anInt3281 * local444 + (double) this.aClass132_1.anInt3280) | (int) ((double) this.aClass132_1.anInt3269 + local444 * (double) this.aClass132_1.anInt3264) << 16 | (int) ((double) this.aClass132_1.anInt3258 + (double) this.aClass132_1.anInt3275 * local444) << 8 | (int) (Math.random() * (double) this.aClass132_1.anInt3261 + (double) this.aClass132_1.anInt3276) << 24;
					} else {
						local440 = (int) (Math.random() * (double) this.aClass132_1.anInt3261 + (double) this.aClass132_1.anInt3276) << 24 | (int) ((double) this.aClass132_1.anInt3280 + Math.random() * (double) this.aClass132_1.anInt3281) | (int) ((double) this.aClass132_1.anInt3258 + (double) this.aClass132_1.anInt3275 * Math.random()) << 8 | (int) ((double) this.aClass132_1.anInt3264 * Math.random() + (double) this.aClass132_1.anInt3269) << 16;
					}
					@Pc(506) int local506 = this.aClass132_1.anInt3252;
					if (!arg3.method5386() && !this.aClass132_1.aBoolean252) {
						local506 = -1;
					}
					if (Static126.anInt2199 == Static94.anInt5461) {
						new Class20_Sub1_Sub1_Sub1(this, local197, local205, local209, local217, local223, local229, local344, local361, local440, local378, local506, this.aClass132_1.aBoolean254, this.aClass132_1.aBoolean251);
					} else {
						@Pc(526) Class20_Sub1_Sub1_Sub1 local526 = Static331.aClass20_Sub1_Sub1_Sub1Array2[Static126.anInt2199];
						Static126.anInt2199 = Static126.anInt2199 + 1 & 0x3FF;
						local526.method520(this, local197, local205, local209, local217, local223, local229, local344, local361, local440, local378, local506, this.aClass132_1.aBoolean254, this.aClass132_1.aBoolean251);
					}
				}
			}
		}
		this.anInt4810 = 0;
		for (@Pc(589) Class20_Sub1_Sub1_Sub1 local589 = (Class20_Sub1_Sub1_Sub1) this.aClass248_5.method5583(); local589 != null; local589 = (Class20_Sub1_Sub1_Sub1) this.aClass248_5.method5577()) {
			local589.method519(arg2, arg1);
			this.anInt4810++;
		}
		Static226.anInt3895 += this.anInt4810;
	}
}
