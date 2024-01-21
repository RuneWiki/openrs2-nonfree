import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class3_Sub1_Sub3_Sub1_Sub1 extends Class3_Sub1_Sub3_Sub1 {

	@OriginalMember(owner = "client!ja", name = "Mc", descriptor = "I")
	public int anInt1336;

	@OriginalMember(owner = "client!ja", name = "Oc", descriptor = "I")
	public int anInt1338;

	@OriginalMember(owner = "client!ja", name = "Qc", descriptor = "I")
	public int anInt1340;

	@OriginalMember(owner = "client!ja", name = "Sc", descriptor = "I")
	public int anInt1342;

	@OriginalMember(owner = "client!ja", name = "Wc", descriptor = "I")
	public int anInt1344;

	@OriginalMember(owner = "client!ja", name = "Xc", descriptor = "Lclient!pb;")
	public Class53 aClass53_1;

	@OriginalMember(owner = "client!ja", name = "fd", descriptor = "I")
	public int anInt1350;

	@OriginalMember(owner = "client!ja", name = "nd", descriptor = "Lclient!v;")
	public Class62 aClass62_570;

	@OriginalMember(owner = "client!ja", name = "od", descriptor = "I")
	public int anInt1355;

	@OriginalMember(owner = "client!ja", name = "rd", descriptor = "I")
	public int anInt1358;

	@OriginalMember(owner = "client!ja", name = "sd", descriptor = "Lclient!lb;")
	public Class3_Sub1_Sub3_Sub3 aClass3_Sub1_Sub3_Sub3_1;

	@OriginalMember(owner = "client!ja", name = "Lc", descriptor = "Z")
	public boolean aBoolean74 = false;

	@OriginalMember(owner = "client!ja", name = "bd", descriptor = "I")
	public int anInt1347 = -1;

	@OriginalMember(owner = "client!ja", name = "Yc", descriptor = "I")
	public int anInt1345 = -1;

	@OriginalMember(owner = "client!ja", name = "kd", descriptor = "I")
	public int anInt1352 = 0;

	@OriginalMember(owner = "client!ja", name = "Nc", descriptor = "I")
	public int anInt1337 = 0;

	@OriginalMember(owner = "client!ja", name = "ld", descriptor = "I")
	public int anInt1353 = 0;

	@OriginalMember(owner = "client!ja", name = "ud", descriptor = "I")
	public int anInt1359 = 0;

	@OriginalMember(owner = "client!ja", name = "pd", descriptor = "I")
	public int anInt1356 = 0;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)Lclient!lb;")
	@Override
	protected Class3_Sub1_Sub3_Sub3 method1843() {
		if (this.aClass53_1 == null) {
			return null;
		}
		@Pc(28) Class3_Sub1_Sub11 local28 = super.anInt1868 != -1 && super.anInt1843 == 0 ? Static41.method705(super.anInt1868) : null;
		@Pc(53) Class3_Sub1_Sub11 local53 = super.anInt1854 == -1 || this.aBoolean74 || super.anInt1847 == super.anInt1854 && local28 != null ? null : Static41.method705(super.anInt1854);
		@Pc(64) Class3_Sub1_Sub3_Sub3 local64 = this.aClass53_1.method1262(local53, local28, super.anInt1832, super.anInt1851);
		if (local64 == null) {
			return null;
		}
		local64.method970();
		super.anInt1850 = local64.anInt2799;
		@Pc(94) Class3_Sub1_Sub3_Sub3 local94;
		@Pc(114) Class3_Sub1_Sub3_Sub3[] local114;
		if (!this.aBoolean74 && super.anInt1859 != -1 && super.anInt1870 != -1) {
			local94 = Static105.method1827(super.anInt1859).method1608(super.anInt1870);
			if (local94 != null) {
				local94.method964(0, -super.anInt1839, 0);
				local114 = new Class3_Sub1_Sub3_Sub3[] { local64, local94 };
				local64 = new Class3_Sub1_Sub3_Sub3(local114, 2, true);
			}
		}
		if (!this.aBoolean74 && this.aClass3_Sub1_Sub3_Sub3_1 != null) {
			if (Static12.anInt451 >= this.anInt1337) {
				this.aClass3_Sub1_Sub3_Sub3_1 = null;
			}
			if (this.anInt1353 <= Static12.anInt451 && Static12.anInt451 < this.anInt1337) {
				local94 = this.aClass3_Sub1_Sub3_Sub3_1;
				local94.method964(this.anInt1344 - super.anInt1882, -this.anInt1340 + this.anInt1355, this.anInt1338 - super.anInt1887);
				local114 = new Class3_Sub1_Sub3_Sub3[] { local64, local94 };
				if (super.anInt1834 == 512) {
					local94.method960();
					local94.method960();
					local94.method960();
				} else if (super.anInt1834 == 1024) {
					local94.method960();
					local94.method960();
				} else if (super.anInt1834 == 1536) {
					local94.method960();
				}
				local64 = new Class3_Sub1_Sub3_Sub3(local114, 2, true);
				if (super.anInt1834 == 512) {
					local94.method960();
				} else if (super.anInt1834 == 1024) {
					local94.method960();
					local94.method960();
				} else if (super.anInt1834 == 1536) {
					local94.method960();
					local94.method960();
					local94.method960();
				}
				local94.method964(super.anInt1882 - this.anInt1344, this.anInt1340 + -this.anInt1355, super.anInt1887 - this.anInt1338);
			}
		}
		local64.aBoolean85 = true;
		return local64;
	}

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method1153() {
		return this.aClass53_1 != null;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!kd;B)V")
	public void method756(@OriginalArg(0) Class3_Sub8 arg0) {
		arg0.anInt2704 = 0;
		@Pc(6) int local6 = -1;
		@Pc(13) int[] local13 = new int[12];
		@Pc(17) int local17 = arg0.method1803();
		this.anInt1345 = arg0.method1765();
		this.anInt1347 = arg0.method1765();
		this.anInt1352 = 0;
		@Pc(58) int local58;
		@Pc(98) int local98;
		for (@Pc(40) int local40 = 0; local40 < 12; local40++) {
			@Pc(46) int local46 = arg0.method1803();
			if (local46 == 0) {
				local13[local40] = 0;
			} else {
				local58 = arg0.method1803();
				local13[local40] = local58 + (local46 << 8);
				if (local40 == 0 && local13[0] == 65535) {
					local6 = arg0.method1789();
					break;
				}
				if (local13[local40] >= 512) {
					local98 = Static4.method160(local13[local40] - 512).anInt304;
					if (local98 != 0) {
						this.anInt1352 = local98;
					}
				}
			}
		}
		@Pc(110) int[] local110 = new int[5];
		for (local58 = 0; local58 < 5; local58++) {
			local98 = arg0.method1803();
			if (local98 < 0 || Static21.anIntArrayArray5[local58].length <= local98) {
				local98 = 0;
			}
			local110[local58] = local98;
		}
		super.anInt1847 = arg0.method1789();
		if (super.anInt1847 == 65535) {
			super.anInt1847 = -1;
		}
		super.anInt1884 = arg0.method1789();
		if (super.anInt1884 == 65535) {
			super.anInt1884 = -1;
		}
		super.anInt1833 = arg0.method1789();
		if (super.anInt1833 == 65535) {
			super.anInt1833 = -1;
		}
		super.anInt1836 = arg0.method1789();
		if (super.anInt1836 == 65535) {
			super.anInt1836 = -1;
		}
		super.anInt1879 = arg0.method1789();
		if (super.anInt1879 == 65535) {
			super.anInt1879 = -1;
		}
		super.anInt1846 = arg0.method1789();
		if (super.anInt1846 == 65535) {
			super.anInt1846 = -1;
		}
		super.anInt1869 = arg0.method1789();
		if (super.anInt1869 == 65535) {
			super.anInt1869 = -1;
		}
		this.aClass62_570 = Static19.method1855(arg0.method1793()).method1681();
		this.anInt1359 = arg0.method1803();
		this.anInt1356 = arg0.method1789();
		if (this.aClass53_1 == null) {
			this.aClass53_1 = new Class53();
		}
		this.aClass53_1.method1265(local110, local13, local17 == 1, local6);
	}
}
