import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fo")
public final class Class32_Sub2 extends Class32 {

	@OriginalMember(owner = "client!fo", name = "h", descriptor = "I")
	private int anInt1804;

	@OriginalMember(owner = "client!fo", name = "j", descriptor = "I")
	public int anInt1805;

	@OriginalMember(owner = "client!fo", name = "l", descriptor = "I")
	public int anInt1807;

	@OriginalMember(owner = "client!fo", name = "m", descriptor = "I")
	private int anInt1808;

	@OriginalMember(owner = "client!fo", name = "o", descriptor = "I")
	private int anInt1809;

	@OriginalMember(owner = "client!fo", name = "p", descriptor = "I")
	public int anInt1810;

	@OriginalMember(owner = "client!fo", name = "q", descriptor = "I")
	private int anInt1811;

	@OriginalMember(owner = "client!fo", name = "r", descriptor = "I")
	private int anInt1812;

	@OriginalMember(owner = "client!fo", name = "u", descriptor = "I")
	private int anInt1813;

	@OriginalMember(owner = "client!fo", name = "w", descriptor = "I")
	private int anInt1815;

	@OriginalMember(owner = "client!fo", name = "z", descriptor = "I")
	private int anInt1817;

	@OriginalMember(owner = "client!fo", name = "B", descriptor = "I")
	private int anInt1818;

	@OriginalMember(owner = "client!fo", name = "C", descriptor = "I")
	private int anInt1819;

	@OriginalMember(owner = "client!fo", name = "E", descriptor = "I")
	private int anInt1821;

	@OriginalMember(owner = "client!fo", name = "F", descriptor = "I")
	private int anInt1822;

	@OriginalMember(owner = "client!fo", name = "G", descriptor = "I")
	public int anInt1823;

	@OriginalMember(owner = "client!fo", name = "H", descriptor = "I")
	private int anInt1824;

	@OriginalMember(owner = "client!fo", name = "K", descriptor = "I")
	private int anInt1827;

	@OriginalMember(owner = "client!fo", name = "R", descriptor = "I")
	private int anInt1831;

	@OriginalMember(owner = "client!fo", name = "S", descriptor = "I")
	private int anInt1832;

	@OriginalMember(owner = "client!fo", name = "n", descriptor = "Z")
	public boolean aBoolean129 = false;

	@OriginalMember(owner = "client!fo", name = "t", descriptor = "Z")
	private boolean aBoolean130 = false;

	@OriginalMember(owner = "client!fo", name = "I", descriptor = "I")
	private int anInt1825 = 0;

	@OriginalMember(owner = "client!fo", name = "L", descriptor = "Lclient!kg;")
	public final Class113 aClass113_1;

	@OriginalMember(owner = "client!fo", name = "Q", descriptor = "J")
	private final long aLong60;

	@OriginalMember(owner = "client!fo", name = "s", descriptor = "Lclient!rs;")
	public final Class32_Sub7 aClass32_Sub7_1;

	@OriginalMember(owner = "client!fo", name = "i", descriptor = "Lclient!oh;")
	public Class150 aClass150_1;

	@OriginalMember(owner = "client!fo", name = "y", descriptor = "Lclient!cp;")
	public final Class39 aClass39_3;

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Lclient!ea;Lclient!kg;Lclient!rs;J)V")
	public Class32_Sub2(@OriginalArg(0) Class55 arg0, @OriginalArg(1) Class113 arg1, @OriginalArg(2) Class32_Sub7 arg2, @OriginalArg(3) long arg3) {
		this.aClass113_1 = arg1;
		this.aLong60 = arg3;
		this.aClass32_Sub7_1 = arg2;
		this.aClass150_1 = Static280.method4872(this.aClass113_1.anInt3310);
		if (!arg0.method5182() && this.aClass150_1.anInt4594 != -1) {
			this.aClass150_1 = Static280.method4872(this.aClass150_1.anInt4594);
		}
		this.aClass39_3 = new Class39();
		this.anInt1825 = (int) ((double) this.anInt1825 + Math.random() * 64.0D);
		this.method1734();
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(JILclient!ea;ZI)V")
	public void method1727(@OriginalArg(0) long arg0, @OriginalArg(2) Class55 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(46) int local46;
		if (this.aBoolean129) {
			arg2 = false;
		} else if (this.aClass150_1.anInt4598 > Static74.anInt1431) {
			arg2 = false;
		} else if (Static283.anIntArray542[Static74.anInt1431] < Static130.anInt5553) {
			arg2 = false;
		} else if (this.aBoolean130) {
			arg2 = false;
		} else if (this.aClass150_1.anInt4600 != -1) {
			local46 = (int) (arg0 - this.aLong60);
			if (this.aClass150_1.aBoolean375 || local46 <= this.aClass150_1.anInt4600) {
				local46 %= this.aClass150_1.anInt4600;
			} else {
				arg2 = false;
			}
			if (!this.aClass150_1.aBoolean371 && local46 < this.aClass150_1.anInt4581) {
				arg2 = false;
			}
			if (this.aClass150_1.aBoolean371 && local46 >= this.aClass150_1.anInt4581) {
				arg2 = false;
			}
		}
		if (arg2) {
			this.anInt1825 += (int) ((double) arg3 * ((double) this.aClass150_1.anInt4601 + Math.random() * (double) (this.aClass150_1.anInt4585 - this.aClass150_1.anInt4601)));
			if (this.anInt1825 > 63) {
				local46 = this.anInt1825 >> 6;
				this.anInt1825 &= 0x3F;
				for (@Pc(158) int local158 = 0; local158 < local46; local158++) {
					@Pc(217) int local217;
					@Pc(231) int local231;
					@Pc(227) int local227;
					@Pc(181) int local181;
					@Pc(189) int local189;
					@Pc(193) int local193;
					@Pc(203) int local203;
					@Pc(211) int local211;
					@Pc(221) int local221;
					if (this.aClass150_1.aShort53 <= 0 && this.aClass150_1.aShort51 <= 0) {
						local217 = this.anInt1812;
						local231 = this.anInt1821;
						local227 = this.anInt1827;
					} else {
						local181 = (int) ((double) this.anInt1824 * Math.random()) + this.anInt1815;
						@Pc(185) int local185 = local181 & 0x3FFF;
						local189 = Class187.anIntArray571[local185];
						local193 = Class187.anIntArray570[local185];
						local203 = (int) ((double) this.anInt1832 * Math.random()) + this.anInt1818;
						@Pc(207) int local207 = local203 & 0x1FFF;
						local211 = Class187.anIntArray571[local207];
						local217 = local211 * local193 >> 15;
						local221 = Class187.anIntArray570[local207];
						local227 = local189 * local211 >> 15;
						local231 = local221 * -1;
					}
					local181 = (int) (Math.random() * 65535.0D);
					local189 = (int) (Math.random() * 65535.0D);
					if (local181 + local189 > 65535) {
						local189 = 65535 - local189;
						local181 = 65535 - local181;
					}
					local193 = 65535 - local181 - local189;
					local203 = local189 * this.anInt1822 + local181 * this.anInt1831 + this.anInt1811 * local193 >> 16;
					local211 = this.anInt1809 * local193 + local181 * this.anInt1804 + this.anInt1808 * local189 >> 16;
					local221 = this.anInt1813 * local189 + this.anInt1819 * local181 + this.anInt1817 * local193 >> 16;
					@Pc(343) int local343 = (int) (Math.random() * (double) (this.aClass150_1.anInt4625 - this.aClass150_1.anInt4602)) + this.aClass150_1.anInt4602;
					@Pc(360) int local360 = (int) (Math.random() * (double) (this.aClass150_1.anInt4604 - this.aClass150_1.anInt4590)) + this.aClass150_1.anInt4590;
					@Pc(377) int local377 = (int) ((double) (this.aClass150_1.anInt4606 - this.aClass150_1.anInt4605) * Math.random()) + this.aClass150_1.anInt4605;
					@Pc(439) int local439;
					if (this.aClass150_1.aBoolean373) {
						@Pc(443) double local443 = Math.random();
						local439 = (int) ((double) this.aClass150_1.anInt4628 + (double) this.aClass150_1.anInt4588 * local443) | (int) ((double) this.aClass150_1.anInt4631 + (double) this.aClass150_1.anInt4583 * local443) << 16 | (int) (local443 * (double) this.aClass150_1.anInt4592 + (double) this.aClass150_1.anInt4620) << 8 | (int) ((double) this.aClass150_1.anInt4615 + local443 * (double) this.aClass150_1.anInt4591) << 24;
					} else {
						local439 = (int) ((double) this.aClass150_1.anInt4631 + (double) this.aClass150_1.anInt4583 * Math.random()) << 16 | (int) ((double) this.aClass150_1.anInt4620 + (double) this.aClass150_1.anInt4592 * Math.random()) << 8 | (int) (Math.random() * (double) this.aClass150_1.anInt4588 + (double) this.aClass150_1.anInt4628) | (int) ((double) this.aClass150_1.anInt4615 + (double) this.aClass150_1.anInt4591 * Math.random()) << 24;
					}
					@Pc(505) int local505 = this.aClass150_1.anInt4622;
					if (!arg1.method5182() && !this.aClass150_1.aBoolean374) {
						local505 = -1;
					}
					if (Static203.anInt5015 == Static87.anInt1616) {
						new Class32_Sub3_Sub1_Sub1(this, local203, local211, local221, local217, local231, local227, local343, local360, local439, local377, local505, this.aClass150_1.aBoolean372);
					} else {
						@Pc(546) Class32_Sub3_Sub1_Sub1 local546 = Static331.aClass32_Sub3_Sub1_Sub1Array2[Static203.anInt5015];
						Static203.anInt5015 = Static203.anInt5015 + 1 & 0x3FF;
						local546.method3400(this, local203, local211, local221, local217, local231, local227, local343, local360, local439, local377, local505, this.aClass150_1.aBoolean372);
					}
				}
			}
		}
		this.anInt1805 = 0;
		for (@Pc(582) Class32_Sub3_Sub1_Sub1 local582 = (Class32_Sub3_Sub1_Sub1) this.aClass39_3.method806(); local582 != null; local582 = (Class32_Sub3_Sub1_Sub1) this.aClass39_3.method808()) {
			local582.method3401(arg0, arg3);
			this.anInt1805++;
		}
		Static236.anInt4221 += this.anInt1805;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(JZ)V")
	public void method1731(@OriginalArg(0) long arg0) {
		for (@Pc(17) Class32_Sub3_Sub1_Sub1 local17 = (Class32_Sub3_Sub1_Sub1) this.aClass39_3.method806(); local17 != null; local17 = (Class32_Sub3_Sub1_Sub1) this.aClass39_3.method808()) {
			local17.method3402(arg0);
		}
	}

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(B)V")
	public void method1734() {
		this.anInt1808 = this.aClass113_1.anInt3321;
		this.anInt1804 = this.aClass113_1.anInt3303;
		this.anInt1809 = this.aClass113_1.anInt3319;
		this.anInt1822 = this.aClass113_1.anInt3316;
		this.anInt1811 = this.aClass113_1.anInt3314;
		this.anInt1819 = this.aClass113_1.anInt3306;
		this.anInt1817 = this.aClass113_1.anInt3308;
		this.anInt1831 = this.aClass113_1.anInt3317;
		this.anInt1813 = this.aClass113_1.anInt3315;
		if (this.anInt1831 == this.anInt1822 && this.anInt1822 == this.anInt1811 && this.anInt1804 == this.anInt1808 && this.anInt1809 == this.anInt1808 && this.anInt1813 == this.anInt1819 && this.anInt1817 == this.anInt1813) {
			this.aBoolean130 = true;
			return;
		}
		this.aBoolean130 = false;
		@Pc(115) int local115 = (this.anInt1811 + this.anInt1831 + this.anInt1822) / 3;
		@Pc(126) int local126 = (this.anInt1808 + this.anInt1804 + this.anInt1809) / 3;
		@Pc(137) int local137 = (this.anInt1817 + this.anInt1819 + this.anInt1813) / 3;
		if (this.anInt1823 == local115 && this.anInt1807 == local126 && local137 == this.anInt1810) {
			return;
		}
		this.anInt1810 = local137;
		this.anInt1807 = local126;
		this.anInt1823 = local115;
		@Pc(169) int local169 = this.anInt1822 - this.anInt1831;
		@Pc(176) int local176 = this.anInt1808 - this.anInt1804;
		@Pc(183) int local183 = this.anInt1813 - this.anInt1819;
		@Pc(189) int local189 = this.anInt1811 - this.anInt1831;
		@Pc(195) int local195 = this.anInt1809 - this.anInt1804;
		@Pc(202) int local202 = this.anInt1817 - this.anInt1819;
		this.anInt1812 = local202 * local176 - local195 * local183;
		this.anInt1821 = local189 * local183 - local169 * local202;
		this.anInt1827 = local195 * local169 - local189 * local176;
		while (this.anInt1812 > 32767 || this.anInt1821 > 32767 || this.anInt1827 > 32767 || this.anInt1812 < -32767 || this.anInt1821 < -32767 || this.anInt1827 < -32767) {
			this.anInt1827 >>= 0x1;
			this.anInt1812 >>= 0x1;
			this.anInt1821 >>= 0x1;
		}
		@Pc(304) int local304 = (int) Math.sqrt((double) (this.anInt1827 * this.anInt1827 + this.anInt1821 * this.anInt1821 + this.anInt1812 * this.anInt1812));
		if (local304 <= 0) {
			local304 = 1;
		}
		this.anInt1812 = this.anInt1812 * 32767 / local304;
		this.anInt1827 = this.anInt1827 * 32767 / local304;
		this.anInt1821 = this.anInt1821 * 32767 / local304;
		if (this.aClass150_1.aShort53 <= 0 && this.aClass150_1.aShort51 <= 0) {
			return;
		}
		@Pc(357) int local357 = (int) (Math.atan2((double) this.anInt1827, (double) this.anInt1812) * 2607.5945876176133D);
		@Pc(378) int local378 = (int) (Math.atan2((double) this.anInt1821, Math.sqrt((double) (this.anInt1812 * this.anInt1812 + this.anInt1827 * this.anInt1827))) * 2607.5945876176133D);
		this.anInt1824 = this.aClass150_1.aShort53 - this.aClass150_1.aShort52;
		this.anInt1832 = this.aClass150_1.aShort51 - this.aClass150_1.lb;
		this.anInt1815 = local357 + this.aClass150_1.aShort52 - (this.anInt1824 >> 1);
		this.anInt1818 = local378 + this.aClass150_1.lb - (this.anInt1832 >> 1);
	}
}
