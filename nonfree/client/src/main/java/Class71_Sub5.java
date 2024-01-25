import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pu")
public final class Class71_Sub5 extends Class71 {

	@OriginalMember(owner = "client!pu", name = "g", descriptor = "I")
	public int anInt5755;

	@OriginalMember(owner = "client!pu", name = "h", descriptor = "I")
	public int anInt5756;

	@OriginalMember(owner = "client!pu", name = "i", descriptor = "I")
	private int anInt5757;

	@OriginalMember(owner = "client!pu", name = "j", descriptor = "I")
	private int anInt5758;

	@OriginalMember(owner = "client!pu", name = "l", descriptor = "I")
	private int anInt5759;

	@OriginalMember(owner = "client!pu", name = "m", descriptor = "I")
	public int anInt5760;

	@OriginalMember(owner = "client!pu", name = "n", descriptor = "I")
	private int anInt5761;

	@OriginalMember(owner = "client!pu", name = "r", descriptor = "I")
	private int anInt5764;

	@OriginalMember(owner = "client!pu", name = "s", descriptor = "I")
	public int anInt5765;

	@OriginalMember(owner = "client!pu", name = "t", descriptor = "I")
	private int anInt5766;

	@OriginalMember(owner = "client!pu", name = "v", descriptor = "I")
	private int anInt5767;

	@OriginalMember(owner = "client!pu", name = "z", descriptor = "I")
	private int anInt5770;

	@OriginalMember(owner = "client!pu", name = "D", descriptor = "I")
	private int anInt5772;

	@OriginalMember(owner = "client!pu", name = "E", descriptor = "I")
	private int anInt5773;

	@OriginalMember(owner = "client!pu", name = "F", descriptor = "I")
	private int anInt5774;

	@OriginalMember(owner = "client!pu", name = "G", descriptor = "I")
	private int anInt5775;

	@OriginalMember(owner = "client!pu", name = "H", descriptor = "I")
	private int anInt5776;

	@OriginalMember(owner = "client!pu", name = "I", descriptor = "I")
	private int anInt5777;

	@OriginalMember(owner = "client!pu", name = "L", descriptor = "I")
	private int anInt5778;

	@OriginalMember(owner = "client!pu", name = "M", descriptor = "I")
	private int anInt5779;

	@OriginalMember(owner = "client!pu", name = "k", descriptor = "Z")
	private boolean aBoolean429 = false;

	@OriginalMember(owner = "client!pu", name = "x", descriptor = "I")
	private int anInt5769 = 0;

	@OriginalMember(owner = "client!pu", name = "C", descriptor = "Z")
	public boolean aBoolean430 = false;

	@OriginalMember(owner = "client!pu", name = "u", descriptor = "J")
	private final long aLong173;

	@OriginalMember(owner = "client!pu", name = "y", descriptor = "Lclient!uh;")
	public final Class71_Sub6 aClass71_Sub6_5;

	@OriginalMember(owner = "client!pu", name = "K", descriptor = "Lclient!eh;")
	public final Class61 aClass61_2;

	@OriginalMember(owner = "client!pu", name = "J", descriptor = "Lclient!ob;")
	public Class179 aClass179_1;

	@OriginalMember(owner = "client!pu", name = "q", descriptor = "Lclient!wp;")
	public final Class273 aClass273_3;

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Lclient!qa;Lclient!eh;Lclient!uh;J)V")
	public Class71_Sub5(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class61 arg1, @OriginalArg(2) Class71_Sub6 arg2, @OriginalArg(3) long arg3) {
		this.aLong173 = arg3;
		this.aClass71_Sub6_5 = arg2;
		this.aClass61_2 = arg1;
		this.aClass179_1 = this.aClass61_2.method1769();
		if (!arg0.method2100() && this.aClass179_1.anInt5208 != -1) {
			this.aClass179_1 = Static236.method3984(this.aClass179_1.anInt5208);
		}
		this.aClass273_3 = new Class273();
		this.anInt5769 = (int) ((double) this.anInt5769 + Math.random() * 64.0D);
		this.method4785();
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(BLclient!qa;J)V")
	public void method4784(@OriginalArg(1) Class30 arg0, @OriginalArg(2) long arg1) {
		for (@Pc(15) Class71_Sub1_Sub2_Sub1 local15 = (Class71_Sub1_Sub2_Sub1) this.aClass273_3.method6246(); local15 != null; local15 = (Class71_Sub1_Sub2_Sub1) this.aClass273_3.method6249()) {
			local15.method3046(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(I)V")
	public void method4785() {
		this.anInt5767 = this.aClass61_2.anInt1975;
		this.anInt5779 = this.aClass61_2.anInt1982;
		this.anInt5761 = this.aClass61_2.anInt1978;
		this.anInt5770 = this.aClass61_2.anInt1976;
		this.anInt5773 = this.aClass61_2.anInt1981;
		this.anInt5764 = this.aClass61_2.anInt1980;
		this.anInt5774 = this.aClass61_2.anInt1984;
		this.anInt5776 = this.aClass61_2.anInt1989;
		this.anInt5759 = this.aClass61_2.anInt1977;
		if (this.anInt5764 == this.anInt5770 && this.anInt5776 == this.anInt5764 && this.anInt5773 == this.anInt5761 && this.anInt5759 == this.anInt5773 && this.anInt5767 == this.anInt5774 && this.anInt5779 == this.anInt5767) {
			this.aBoolean429 = true;
			return;
		}
		this.aBoolean429 = false;
		@Pc(114) int local114 = (this.anInt5776 + this.anInt5770 + this.anInt5764) / 3;
		@Pc(126) int local126 = (this.anInt5761 + this.anInt5773 + this.anInt5759) / 3;
		@Pc(137) int local137 = (this.anInt5779 + this.anInt5774 + this.anInt5767) / 3;
		if (this.anInt5755 == local114 && this.anInt5760 == local126 && local137 == this.anInt5756) {
			return;
		}
		this.anInt5756 = local137;
		this.anInt5755 = local114;
		this.anInt5760 = local126;
		@Pc(173) int local173 = this.anInt5764 - this.anInt5770;
		@Pc(179) int local179 = this.anInt5773 - this.anInt5761;
		@Pc(186) int local186 = this.anInt5767 - this.anInt5774;
		@Pc(193) int local193 = this.anInt5776 - this.anInt5770;
		@Pc(200) int local200 = this.anInt5759 - this.anInt5761;
		@Pc(207) int local207 = this.anInt5779 - this.anInt5774;
		this.anInt5766 = local179 * local207 - local186 * local200;
		this.anInt5777 = local173 * local200 - local193 * local179;
		for (this.anInt5778 = local186 * local193 - local173 * local207; this.anInt5766 > 32767 || this.anInt5778 > 32767 || this.anInt5777 > 32767 || this.anInt5766 < -32767 || this.anInt5778 < -32767 || this.anInt5777 < -32767; this.anInt5778 >>= 0x1) {
			this.anInt5777 >>= 0x1;
			this.anInt5766 >>= 0x1;
		}
		@Pc(310) int local310 = (int) Math.sqrt((double) (this.anInt5778 * this.anInt5778 + this.anInt5766 * this.anInt5766 + this.anInt5777 * this.anInt5777));
		if (local310 <= 0) {
			local310 = 1;
		}
		this.anInt5766 = this.anInt5766 * 32767 / local310;
		this.anInt5778 = this.anInt5778 * 32767 / local310;
		this.anInt5777 = this.anInt5777 * 32767 / local310;
		if (this.aClass179_1.aShort64 <= 0 && this.aClass179_1.aShort65 <= 0) {
			return;
		}
		@Pc(360) int local360 = (int) (Math.atan2((double) this.anInt5777, (double) this.anInt5766) * 2607.5945876176133D);
		@Pc(381) int local381 = (int) (Math.atan2((double) this.anInt5778, Math.sqrt((double) (this.anInt5766 * this.anInt5766 + this.anInt5777 * this.anInt5777))) * 2607.5945876176133D);
		this.anInt5772 = this.aClass179_1.aShort64 - this.aClass179_1.aShort63;
		this.anInt5758 = this.aClass179_1.aShort65 - this.aClass179_1.aShort62;
		this.anInt5775 = this.aClass179_1.aShort63 + local360 - (this.anInt5772 >> 1);
		this.anInt5757 = local381 + this.aClass179_1.aShort62 - (this.anInt5758 >> 1);
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(JZILclient!qa;I)V")
	public void method4786(@OriginalArg(0) long arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class30 arg3) {
		@Pc(36) int local36;
		if (this.aBoolean430) {
			arg1 = false;
		} else if (this.aClass179_1.anInt5240 > Static87.anInt1986) {
			arg1 = false;
		} else if (Static321.anInt5400 > Static282.anIntArray410[Static87.anInt1986]) {
			arg1 = false;
		} else if (this.aBoolean429) {
			arg1 = false;
		} else if (this.aClass179_1.anInt5255 != -1) {
			local36 = (int) (arg0 - this.aLong173);
			if (this.aClass179_1.aBoolean360 || this.aClass179_1.anInt5255 >= local36) {
				local36 %= this.aClass179_1.anInt5255;
			} else {
				arg1 = false;
			}
			if (!this.aClass179_1.aBoolean358 && local36 < this.aClass179_1.anInt5215) {
				arg1 = false;
			}
			if (this.aClass179_1.aBoolean358 && local36 >= this.aClass179_1.anInt5215) {
				arg1 = false;
			}
		}
		if (arg1) {
			this.anInt5769 += (int) (((double) this.aClass179_1.anInt5253 + Math.random() * (double) (this.aClass179_1.anInt5217 - this.aClass179_1.anInt5253)) * (double) arg2);
			if (this.anInt5769 > 63) {
				local36 = this.anInt5769 >> 6;
				this.anInt5769 &= 0x3F;
				for (@Pc(137) int local137 = 0; local137 < local36; local137++) {
					@Pc(159) int local159;
					@Pc(153) int local153;
					@Pc(156) int local156;
					@Pc(171) int local171;
					@Pc(179) int local179;
					@Pc(183) int local183;
					@Pc(194) int local194;
					@Pc(202) int local202;
					@Pc(206) int local206;
					if (this.aClass179_1.aShort64 <= 0 && this.aClass179_1.aShort65 <= 0) {
						local153 = this.anInt5778;
						local156 = this.anInt5777;
						local159 = this.anInt5766;
					} else {
						local171 = (int) (Math.random() * (double) this.anInt5772) + this.anInt5775;
						@Pc(175) int local175 = local171 & 0x3FFF;
						local179 = Class4_Sub13.anIntArray497[local175];
						local183 = Class4_Sub13.anIntArray496[local175];
						local194 = this.anInt5757 + (int) (Math.random() * (double) this.anInt5758);
						@Pc(198) int local198 = local194 & 0x1FFF;
						local202 = Class4_Sub13.anIntArray497[local198];
						local206 = Class4_Sub13.anIntArray496[local198];
						local153 = (local206 << 0) * -1;
						local159 = local183 * local202 >> 15;
						local156 = local179 * local202 >> 15;
					}
					local171 = (int) (Math.random() * 65535.0D);
					local179 = (int) (Math.random() * 65535.0D);
					if (local171 + local179 > 65535) {
						local179 = 65535 - local179;
						local171 = 65535 - local171;
					}
					local183 = 65535 - local179 - local171;
					local194 = (int) ((long) local183 * (long) this.anInt5776 + (long) this.anInt5764 * (long) local179 + (long) this.anInt5770 * (long) local171 >> 16);
					local202 = (int) ((long) local183 * (long) this.anInt5759 + (long) local179 * (long) this.anInt5773 + (long) this.anInt5761 * (long) local171 >> 16);
					local206 = (int) ((long) local183 * (long) this.anInt5779 + (long) local179 * (long) this.anInt5767 + (long) local171 * (long) this.anInt5774 >> 16);
					@Pc(347) int local347 = (int) ((double) (this.aClass179_1.anInt5248 - this.aClass179_1.anInt5241) * Math.random()) + this.aClass179_1.anInt5241;
					@Pc(364) int local364 = (int) ((double) (this.aClass179_1.anInt5251 - this.aClass179_1.anInt5239) * Math.random()) + this.aClass179_1.anInt5239;
					@Pc(382) int local382 = this.aClass179_1.anInt5238 + (int) ((double) (this.aClass179_1.anInt5210 - this.aClass179_1.anInt5238) * Math.random());
					@Pc(446) int local446;
					if (this.aClass179_1.aBoolean359) {
						@Pc(388) double local388 = Math.random();
						local446 = (int) ((double) this.aClass179_1.anInt5247 * Math.random() + (double) this.aClass179_1.anInt5231) << 24 | (int) ((double) this.aClass179_1.anInt5237 + local388 * (double) this.aClass179_1.anInt5222) << 8 | (int) (local388 * (double) this.aClass179_1.anInt5234 + (double) this.aClass179_1.anInt5218) << 16 | (int) ((double) this.aClass179_1.anInt5228 * local388 + (double) this.aClass179_1.anInt5223);
					} else {
						local446 = (int) ((double) this.aClass179_1.anInt5231 + Math.random() * (double) this.aClass179_1.anInt5247) << 24 | (int) ((double) this.aClass179_1.anInt5237 + Math.random() * (double) this.aClass179_1.anInt5222) << 8 | (int) ((double) this.aClass179_1.anInt5234 * Math.random() + (double) this.aClass179_1.anInt5218) << 16 | (int) ((double) this.aClass179_1.anInt5223 + (double) this.aClass179_1.anInt5228 * Math.random());
					}
					@Pc(510) int local510 = this.aClass179_1.anInt5226;
					if (!arg3.method2100() && !this.aClass179_1.aBoolean361) {
						local510 = -1;
					}
					if (Static229.anInt4568 == Static402.anInt7092) {
						new Class71_Sub1_Sub2_Sub1(this, local194, local202, local206, local159, local153, local156, local347, local364, local446, local382, local510, this.aClass179_1.aBoolean363, this.aClass179_1.aBoolean356);
					} else {
						@Pc(554) Class71_Sub1_Sub2_Sub1 local554 = Static119.aClass71_Sub1_Sub2_Sub1Array1[Static402.anInt7092];
						Static402.anInt7092 = Static402.anInt7092 + 1 & 0x3FF;
						local554.method3042(this, local194, local202, local206, local159, local153, local156, local347, local364, local446, local382, local510, this.aClass179_1.aBoolean363, this.aClass179_1.aBoolean356);
					}
				}
			}
		}
		this.anInt5765 = 0;
		for (@Pc(601) Class71_Sub1_Sub2_Sub1 local601 = (Class71_Sub1_Sub2_Sub1) this.aClass273_3.method6246(); local601 != null; local601 = (Class71_Sub1_Sub2_Sub1) this.aClass273_3.method6249()) {
			local601.method3045(arg0, arg2);
			this.anInt5765++;
		}
		Static368.anInt6382 += this.anInt5765;
	}
}
