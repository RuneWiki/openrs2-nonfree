import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ll")
public final class Class4_Sub3 extends Class4 {

	@OriginalMember(owner = "client!ll", name = "h", descriptor = "I")
	public int anInt4126;

	@OriginalMember(owner = "client!ll", name = "j", descriptor = "I")
	private int anInt4127;

	@OriginalMember(owner = "client!ll", name = "m", descriptor = "I")
	private int anInt4130;

	@OriginalMember(owner = "client!ll", name = "n", descriptor = "I")
	private int anInt4131;

	@OriginalMember(owner = "client!ll", name = "o", descriptor = "I")
	private int anInt4132;

	@OriginalMember(owner = "client!ll", name = "p", descriptor = "I")
	private int anInt4133;

	@OriginalMember(owner = "client!ll", name = "q", descriptor = "I")
	private int anInt4134;

	@OriginalMember(owner = "client!ll", name = "r", descriptor = "I")
	public int anInt4135;

	@OriginalMember(owner = "client!ll", name = "s", descriptor = "I")
	private int anInt4136;

	@OriginalMember(owner = "client!ll", name = "t", descriptor = "I")
	private int anInt4137;

	@OriginalMember(owner = "client!ll", name = "u", descriptor = "I")
	public int anInt4138;

	@OriginalMember(owner = "client!ll", name = "v", descriptor = "I")
	public int anInt4139;

	@OriginalMember(owner = "client!ll", name = "w", descriptor = "I")
	private int anInt4140;

	@OriginalMember(owner = "client!ll", name = "x", descriptor = "I")
	private int anInt4141;

	@OriginalMember(owner = "client!ll", name = "z", descriptor = "I")
	private int anInt4143;

	@OriginalMember(owner = "client!ll", name = "G", descriptor = "I")
	private int anInt4148;

	@OriginalMember(owner = "client!ll", name = "H", descriptor = "I")
	private int anInt4149;

	@OriginalMember(owner = "client!ll", name = "J", descriptor = "I")
	private int anInt4150;

	@OriginalMember(owner = "client!ll", name = "K", descriptor = "I")
	private int anInt4151;

	@OriginalMember(owner = "client!ll", name = "N", descriptor = "I")
	private int anInt4152;

	@OriginalMember(owner = "client!ll", name = "i", descriptor = "Z")
	public boolean aBoolean468 = false;

	@OriginalMember(owner = "client!ll", name = "y", descriptor = "I")
	private int anInt4142 = 0;

	@OriginalMember(owner = "client!ll", name = "L", descriptor = "Z")
	private boolean aBoolean469 = false;

	@OriginalMember(owner = "client!ll", name = "g", descriptor = "J")
	private final long aLong134;

	@OriginalMember(owner = "client!ll", name = "B", descriptor = "Lclient!su;")
	public final Class229 aClass229_1;

	@OriginalMember(owner = "client!ll", name = "M", descriptor = "Lclient!dl;")
	public final Class4_Sub2 aClass4_Sub2_4;

	@OriginalMember(owner = "client!ll", name = "I", descriptor = "Lclient!ew;")
	public Class73 aClass73_1;

	@OriginalMember(owner = "client!ll", name = "E", descriptor = "Lclient!wc;")
	public final Class262 aClass262_9;

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lclient!za;Lclient!su;Lclient!dl;J)V")
	public Class4_Sub3(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class229 arg1, @OriginalArg(2) Class4_Sub2 arg2, @OriginalArg(3) long arg3) {
		this.aLong134 = arg3;
		this.aClass229_1 = arg1;
		this.aClass4_Sub2_4 = arg2;
		this.aClass73_1 = this.aClass229_1.method4989();
		if (!arg0.method5766() && this.aClass73_1.anInt1911 != -1) {
			this.aClass73_1 = Static452.method5910(this.aClass73_1.anInt1911);
		}
		this.aClass262_9 = new Class262();
		this.anInt4142 = (int) ((double) this.anInt4142 + Math.random() * 64.0D);
		this.method3342();
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)V")
	public void method3342() {
		this.anInt4141 = this.aClass229_1.anInt6355;
		this.anInt4151 = this.aClass229_1.anInt6341;
		this.anInt4150 = this.aClass229_1.anInt6343;
		this.anInt4131 = this.aClass229_1.anInt6350;
		this.anInt4137 = this.aClass229_1.anInt6348;
		this.anInt4152 = this.aClass229_1.anInt6342;
		this.anInt4127 = this.aClass229_1.anInt6357;
		this.anInt4136 = this.aClass229_1.anInt6345;
		this.anInt4134 = this.aClass229_1.anInt6340;
		if (this.anInt4151 == this.anInt4150 && this.anInt4127 == this.anInt4151 && this.anInt4131 == this.anInt4141 && this.anInt4141 == this.anInt4136 && this.anInt4152 == this.anInt4134 && this.anInt4137 == this.anInt4152) {
			this.aBoolean469 = true;
			return;
		}
		this.aBoolean469 = false;
		@Pc(114) int local114 = (this.anInt4150 + this.anInt4151 + this.anInt4127) / 3;
		@Pc(126) int local126 = (this.anInt4131 + this.anInt4141 + this.anInt4136) / 3;
		@Pc(138) int local138 = (this.anInt4152 + this.anInt4134 + this.anInt4137) / 3;
		if (this.anInt4138 == local114 && local126 == this.anInt4135 && this.anInt4126 == local138) {
			return;
		}
		this.anInt4135 = local126;
		this.anInt4126 = local138;
		this.anInt4138 = local114;
		@Pc(173) int local173 = this.anInt4151 - this.anInt4150;
		@Pc(179) int local179 = this.anInt4141 - this.anInt4131;
		@Pc(186) int local186 = this.anInt4152 - this.anInt4134;
		@Pc(192) int local192 = this.anInt4127 - this.anInt4150;
		@Pc(199) int local199 = this.anInt4136 - this.anInt4131;
		@Pc(206) int local206 = this.anInt4137 - this.anInt4134;
		this.anInt4132 = local199 * local173 - local179 * local192;
		this.anInt4140 = local186 * local192 - local173 * local206;
		this.anInt4143 = local179 * local206 - local186 * local199;
		while (this.anInt4143 > 32767 || this.anInt4140 > 32767 || this.anInt4132 > 32767 || this.anInt4143 < -32767 || this.anInt4140 < -32767 || this.anInt4132 < -32767) {
			this.anInt4140 >>= 0x1;
			this.anInt4143 >>= 0x1;
			this.anInt4132 >>= 0x1;
		}
		@Pc(302) int local302 = (int) Math.sqrt((double) (this.anInt4132 * this.anInt4132 + this.anInt4143 * this.anInt4143 + this.anInt4140 * this.anInt4140));
		if (local302 <= 0) {
			local302 = 1;
		}
		this.anInt4140 = this.anInt4140 * 32767 / local302;
		this.anInt4143 = this.anInt4143 * 32767 / local302;
		this.anInt4132 = this.anInt4132 * 32767 / local302;
		if (this.aClass73_1.aShort29 <= 0 && this.aClass73_1.aShort27 <= 0) {
			return;
		}
		@Pc(349) int local349 = (int) (Math.atan2((double) this.anInt4132, (double) this.anInt4143) * 2607.5945876176133D);
		@Pc(371) int local371 = (int) (Math.atan2((double) this.anInt4140, Math.sqrt((double) (this.anInt4143 * this.anInt4143 + this.anInt4132 * this.anInt4132))) * 2607.5945876176133D);
		this.anInt4130 = this.aClass73_1.aShort29 - this.aClass73_1.aShort28;
		this.anInt4133 = local349 + this.aClass73_1.aShort28 - (this.anInt4130 >> 1);
		this.anInt4148 = this.aClass73_1.aShort27 - this.aClass73_1.aShort26;
		this.anInt4149 = this.aClass73_1.aShort26 + local371 - (this.anInt4148 >> 1);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZJ)V")
	public void method3343(@OriginalArg(1) long arg0) {
		for (@Pc(15) Class4_Sub1_Sub2_Sub1 local15 = (Class4_Sub1_Sub2_Sub1) this.aClass262_9.method5819(); local15 != null; local15 = (Class4_Sub1_Sub2_Sub1) this.aClass262_9.method5813()) {
			local15.method4562(arg0);
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(JIILclient!za;Z)V")
	public void method3345(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class34 arg2, @OriginalArg(4) boolean arg3) {
		@Pc(42) int local42;
		if (this.aBoolean468) {
			arg3 = false;
		} else if (Static323.anInt5519 < this.aClass73_1.anInt1880) {
			arg3 = false;
		} else if (Static284.anIntArray320[Static323.anInt5519] < Static246.anInt4465) {
			arg3 = false;
		} else if (this.aBoolean469) {
			arg3 = false;
		} else if (this.aClass73_1.anInt1887 != -1) {
			local42 = (int) (arg0 - this.aLong134);
			if (this.aClass73_1.aBoolean224 || this.aClass73_1.anInt1887 >= local42) {
				local42 %= this.aClass73_1.anInt1887;
			} else {
				arg3 = false;
			}
			if (!this.aClass73_1.aBoolean222 && this.aClass73_1.anInt1909 > local42) {
				arg3 = false;
			}
			if (this.aClass73_1.aBoolean222 && this.aClass73_1.anInt1909 <= local42) {
				arg3 = false;
			}
		}
		if (arg3) {
			this.anInt4142 += (int) ((double) arg1 * ((double) (this.aClass73_1.anInt1889 - this.aClass73_1.anInt1882) * Math.random() + (double) this.aClass73_1.anInt1882));
			if (this.anInt4142 > 63) {
				local42 = this.anInt4142 >> 6;
				this.anInt4142 &= 0x3F;
				for (@Pc(149) int local149 = 0; local149 < local42; local149++) {
					@Pc(220) int local220;
					@Pc(214) int local214;
					@Pc(226) int local226;
					@Pc(172) int local172;
					@Pc(180) int local180;
					@Pc(184) int local184;
					@Pc(194) int local194;
					@Pc(202) int local202;
					@Pc(206) int local206;
					if (this.aClass73_1.aShort29 <= 0 && this.aClass73_1.aShort27 <= 0) {
						local214 = this.anInt4140;
						local220 = this.anInt4143;
						local226 = this.anInt4132;
					} else {
						local172 = (int) (Math.random() * (double) this.anInt4130) + this.anInt4133;
						@Pc(176) int local176 = local172 & 0x3FFF;
						local180 = Class1_Sub4_Sub8_Sub1.anIntArray50[local176];
						local184 = Class1_Sub4_Sub8_Sub1.anIntArray49[local176];
						local194 = (int) ((double) this.anInt4148 * Math.random()) + this.anInt4149;
						@Pc(198) int local198 = local194 & 0x1FFF;
						local202 = Class1_Sub4_Sub8_Sub1.anIntArray50[local198];
						local206 = Class1_Sub4_Sub8_Sub1.anIntArray49[local198];
						local214 = (local206 << 0) * -1;
						local220 = local184 * local202 >> 15;
						local226 = local202 * local180 >> 15;
					}
					local172 = (int) (Math.random() * 65535.0D);
					local180 = (int) (Math.random() * 65535.0D);
					if (local180 + local172 > 65535) {
						local172 = 65535 - local172;
						local180 = 65535 - local180;
					}
					local184 = 65535 - local180 - local172;
					local194 = (int) ((long) this.anInt4151 * (long) local180 + (long) local172 * (long) this.anInt4150 + (long) local184 * (long) this.anInt4127 >> 16);
					local202 = (int) ((long) local184 * (long) this.anInt4136 + (long) this.anInt4131 * (long) local172 + (long) this.anInt4141 * (long) local180 >> 16);
					local206 = (int) ((long) this.anInt4152 * (long) local180 + (long) local172 * (long) this.anInt4134 + (long) this.anInt4137 * (long) local184 >> 16);
					@Pc(362) int local362 = (int) (Math.random() * (double) (this.aClass73_1.anInt1869 - this.aClass73_1.anInt1892)) + this.aClass73_1.anInt1892;
					@Pc(379) int local379 = (int) ((double) (this.aClass73_1.anInt1891 - this.aClass73_1.anInt1896) * Math.random()) + this.aClass73_1.anInt1896;
					@Pc(397) int local397 = this.aClass73_1.anInt1873 + (int) (Math.random() * (double) (this.aClass73_1.anInt1885 - this.aClass73_1.anInt1873));
					@Pc(461) int local461;
					if (this.aClass73_1.aBoolean223) {
						@Pc(403) double local403 = Math.random();
						local461 = (int) ((double) this.aClass73_1.anInt1883 + Math.random() * (double) this.aClass73_1.anInt1878) << 24 | (int) ((double) this.aClass73_1.anInt1894 * local403 + (double) this.aClass73_1.anInt1865) << 8 | (int) ((double) this.aClass73_1.anInt1879 + local403 * (double) this.aClass73_1.anInt1893) << 16 | (int) (local403 * (double) this.aClass73_1.anInt1902 + (double) this.aClass73_1.anInt1876);
					} else {
						local461 = (int) ((double) this.aClass73_1.anInt1894 * Math.random() + (double) this.aClass73_1.anInt1865) << 8 | (int) ((double) this.aClass73_1.anInt1879 + Math.random() * (double) this.aClass73_1.anInt1893) << 16 | (int) ((double) this.aClass73_1.anInt1902 * Math.random() + (double) this.aClass73_1.anInt1876) | (int) ((double) this.aClass73_1.anInt1883 + Math.random() * (double) this.aClass73_1.anInt1878) << 24;
					}
					@Pc(525) int local525 = this.aClass73_1.anInt1904;
					if (!arg2.method5766() && !this.aClass73_1.aBoolean219) {
						local525 = -1;
					}
					if (Static34.anInt596 == Static342.anInt5862) {
						new Class4_Sub1_Sub2_Sub1(this, local194, local202, local206, local220, local214, local226, local362, local379, local461, local397, local525, this.aClass73_1.aBoolean225, this.aClass73_1.aBoolean220);
					} else {
						@Pc(541) Class4_Sub1_Sub2_Sub1 local541 = Static392.aClass4_Sub1_Sub2_Sub1Array2[Static34.anInt596];
						Static34.anInt596 = Static34.anInt596 + 1 & 0x3FF;
						local541.method4566(this, local194, local202, local206, local220, local214, local226, local362, local379, local461, local397, local525, this.aClass73_1.aBoolean225, this.aClass73_1.aBoolean220);
					}
				}
			}
		}
		this.anInt4139 = 0;
		for (@Pc(608) Class4_Sub1_Sub2_Sub1 local608 = (Class4_Sub1_Sub2_Sub1) this.aClass262_9.method5819(); local608 != null; local608 = (Class4_Sub1_Sub2_Sub1) this.aClass262_9.method5813()) {
			local608.method4565(arg0, arg1);
			this.anInt4139++;
		}
		Static359.anInt6120 += this.anInt4139;
	}
}
