import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class2_Sub1_Sub1_Sub3_Sub2 extends Class2_Sub1_Sub1_Sub3 {

	@OriginalMember(owner = "client!m", name = "Kc", descriptor = "Lclient!ad;")
	public Class2_Sub1_Sub1_Sub2 aClass2_Sub1_Sub1_Sub2_3;

	@OriginalMember(owner = "client!m", name = "Nc", descriptor = "I")
	public int anInt1833;

	@OriginalMember(owner = "client!m", name = "Qc", descriptor = "I")
	public int anInt1835;

	@OriginalMember(owner = "client!m", name = "Zc", descriptor = "I")
	public int anInt1839;

	@OriginalMember(owner = "client!m", name = "bd", descriptor = "Lclient!jf;")
	public Class41 aClass41_1;

	@OriginalMember(owner = "client!m", name = "cd", descriptor = "I")
	public int anInt1840;

	@OriginalMember(owner = "client!m", name = "ed", descriptor = "I")
	public int anInt1842;

	@OriginalMember(owner = "client!m", name = "fd", descriptor = "I")
	public int anInt1843;

	@OriginalMember(owner = "client!m", name = "gd", descriptor = "I")
	public int anInt1844;

	@OriginalMember(owner = "client!m", name = "id", descriptor = "I")
	public int anInt1845;

	@OriginalMember(owner = "client!m", name = "md", descriptor = "Lclient!je;")
	public Class40 aClass40_892;

	@OriginalMember(owner = "client!m", name = "Vc", descriptor = "I")
	public int anInt1837 = 0;

	@OriginalMember(owner = "client!m", name = "Ic", descriptor = "I")
	public int anInt1829 = 0;

	@OriginalMember(owner = "client!m", name = "dd", descriptor = "I")
	public int anInt1841 = -1;

	@OriginalMember(owner = "client!m", name = "Pc", descriptor = "I")
	public int anInt1834 = -1;

	@OriginalMember(owner = "client!m", name = "Gc", descriptor = "I")
	public int anInt1827 = 0;

	@OriginalMember(owner = "client!m", name = "Jc", descriptor = "I")
	public int anInt1830 = 0;

	@OriginalMember(owner = "client!m", name = "Lc", descriptor = "I")
	public int anInt1831 = 0;

	@OriginalMember(owner = "client!m", name = "hd", descriptor = "Z")
	public boolean aBoolean135 = false;

	@OriginalMember(owner = "client!m", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method1174() {
		return this.aClass41_1 != null;
	}

	@OriginalMember(owner = "client!m", name = "e", descriptor = "(I)Lclient!ad;")
	@Override
	public Class2_Sub1_Sub1_Sub2 method2168() {
		if (this.aClass41_1 == null) {
			return null;
		}
		@Pc(25) Class2_Sub1_Sub7 local25 = super.anInt1817 != -1 && super.anInt1814 == 0 ? Static40.method724(super.anInt1817) : null;
		@Pc(52) Class2_Sub1_Sub7 local52 = super.anInt1790 == -1 || this.aBoolean135 || super.anInt1790 == super.anInt1786 && local25 != null ? null : Static40.method724(super.anInt1790);
		@Pc(63) Class2_Sub1_Sub1_Sub2 local63 = this.aClass41_1.method995(local52, super.anInt1802, local25, super.anInt1804);
		if (local63 == null) {
			return null;
		}
		local63.method117();
		super.anInt1773 = local63.anInt3029;
		@Pc(94) Class2_Sub1_Sub1_Sub2 local94;
		@Pc(114) Class2_Sub1_Sub1_Sub2[] local114;
		if (!this.aBoolean135 && super.anInt1816 != -1 && super.anInt1774 != -1) {
			local94 = Static63.method291(super.anInt1816).method2026(super.anInt1774);
			if (local94 != null) {
				local94.method126(0, -super.anInt1791, 0);
				local114 = new Class2_Sub1_Sub1_Sub2[] { local63, local94 };
				local63 = new Class2_Sub1_Sub1_Sub2(local114, 2);
			}
		}
		if (!this.aBoolean135 && this.aClass2_Sub1_Sub1_Sub2_3 != null) {
			if (Static28.anInt704 >= this.anInt1837) {
				this.aClass2_Sub1_Sub1_Sub2_3 = null;
			}
			if (this.anInt1830 <= Static28.anInt704 && this.anInt1837 > Static28.anInt704) {
				local94 = this.aClass2_Sub1_Sub1_Sub2_3;
				local94.method126(this.anInt1842 - super.anInt1788, -this.anInt1839 + this.anInt1840, this.anInt1835 - super.anInt1792);
				if (super.anInt1801 == 512) {
					local94.method111();
					local94.method111();
					local94.method111();
				} else if (super.anInt1801 == 1024) {
					local94.method111();
					local94.method111();
				} else if (super.anInt1801 == 1536) {
					local94.method111();
				}
				local114 = new Class2_Sub1_Sub1_Sub2[] { local63, local94 };
				local63 = new Class2_Sub1_Sub1_Sub2(local114, 2);
				if (super.anInt1801 == 512) {
					local94.method111();
				} else if (super.anInt1801 == 1024) {
					local94.method111();
					local94.method111();
				} else if (super.anInt1801 == 1536) {
					local94.method111();
					local94.method111();
					local94.method111();
				}
				local94.method126(super.anInt1788 - this.anInt1842, -this.anInt1840 + this.anInt1839, super.anInt1792 - this.anInt1835);
			}
		}
		local63.aBoolean14 = true;
		return local63;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ILclient!na;)V")
	public void method1182(@OriginalArg(1) Class2_Sub9 arg0) {
		arg0.anInt976 = 0;
		@Pc(12) int local12 = arg0.method640();
		this.anInt1834 = arg0.method658();
		this.anInt1841 = arg0.method658();
		@Pc(24) int local24 = -1;
		this.anInt1831 = 0;
		@Pc(30) int[] local30 = new int[12];
		@Pc(50) int local50;
		@Pc(92) int local92;
		for (@Pc(32) int local32 = 0; local32 < 12; local32++) {
			@Pc(38) int local38 = arg0.method640();
			if (local38 == 0) {
				local30[local32] = 0;
			} else {
				local50 = arg0.method640();
				local30[local32] = (local38 << 8) + local50;
				if (local32 == 0 && local30[0] == 65535) {
					local24 = arg0.method632();
					break;
				}
				if (local30[local32] >= 512) {
					local92 = Static102.method1800(local30[local32] - 512).anInt2225;
					if (local92 != 0) {
						this.anInt1831 = local92;
					}
				}
			}
		}
		@Pc(109) int[] local109 = new int[5];
		for (local50 = 0; local50 < 5; local50++) {
			local92 = arg0.method640();
			if (local92 < 0 || local92 >= Static126.aShortArrayArray14[local50].length) {
				local92 = 0;
			}
			local109[local50] = local92;
		}
		super.anInt1786 = arg0.method632();
		if (super.anInt1786 == 65535) {
			super.anInt1786 = -1;
		}
		super.anInt1812 = arg0.method632();
		if (super.anInt1812 == 65535) {
			super.anInt1812 = -1;
		}
		super.anInt1822 = super.anInt1812;
		super.anInt1771 = arg0.method632();
		if (super.anInt1771 == 65535) {
			super.anInt1771 = -1;
		}
		super.anInt1813 = arg0.method632();
		if (super.anInt1813 == 65535) {
			super.anInt1813 = -1;
		}
		super.anInt1777 = arg0.method632();
		if (super.anInt1777 == 65535) {
			super.anInt1777 = -1;
		}
		super.anInt1823 = arg0.method632();
		if (super.anInt1823 == 65535) {
			super.anInt1823 = -1;
		}
		super.anInt1778 = arg0.method632();
		if (super.anInt1778 == 65535) {
			super.anInt1778 = -1;
		}
		this.aClass40_892 = Static74.method665(arg0.method626()).method965();
		this.anInt1827 = arg0.method640();
		this.anInt1829 = arg0.method632();
		if (this.aClass41_1 == null) {
			this.aClass41_1 = new Class41();
		}
		this.aClass41_1.method1006(local24, local30, local109, local12 == 1);
	}
}
