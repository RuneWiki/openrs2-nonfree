import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class2_Sub1_Sub1_Sub4_Sub2 extends Class2_Sub1_Sub1_Sub4 {

	@OriginalMember(owner = "client!qa", name = "Rc", descriptor = "I")
	public int anInt2385;

	@OriginalMember(owner = "client!qa", name = "Uc", descriptor = "I")
	public int anInt2388;

	@OriginalMember(owner = "client!qa", name = "Wc", descriptor = "I")
	public int anInt2390;

	@OriginalMember(owner = "client!qa", name = "gd", descriptor = "Lclient!be;")
	public Class2_Sub1_Sub1_Sub2 aClass2_Sub1_Sub1_Sub2_3;

	@OriginalMember(owner = "client!qa", name = "id", descriptor = "Lclient!wd;")
	public Class80 aClass80_924;

	@OriginalMember(owner = "client!qa", name = "nd", descriptor = "I")
	public int anInt2400;

	@OriginalMember(owner = "client!qa", name = "pd", descriptor = "Lclient!wc;")
	public Class79 aClass79_2;

	@OriginalMember(owner = "client!qa", name = "qd", descriptor = "I")
	public int anInt2402;

	@OriginalMember(owner = "client!qa", name = "ud", descriptor = "I")
	public int anInt2405;

	@OriginalMember(owner = "client!qa", name = "wd", descriptor = "I")
	public int anInt2407;

	@OriginalMember(owner = "client!qa", name = "yd", descriptor = "I")
	public int anInt2408;

	@OriginalMember(owner = "client!qa", name = "Tc", descriptor = "I")
	public int anInt2387 = 0;

	@OriginalMember(owner = "client!qa", name = "Xc", descriptor = "Z")
	public boolean aBoolean170 = false;

	@OriginalMember(owner = "client!qa", name = "Yc", descriptor = "I")
	public int anInt2391 = 0;

	@OriginalMember(owner = "client!qa", name = "ad", descriptor = "I")
	public int anInt2393 = 0;

	@OriginalMember(owner = "client!qa", name = "fd", descriptor = "I")
	public int anInt2395 = 0;

	@OriginalMember(owner = "client!qa", name = "jd", descriptor = "I")
	public int anInt2397 = 0;

	@OriginalMember(owner = "client!qa", name = "sd", descriptor = "I")
	public int anInt2403 = -1;

	@OriginalMember(owner = "client!qa", name = "ld", descriptor = "I")
	public int anInt2399 = -1;

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method1431() {
		return this.aClass79_2 != null;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILclient!wb;)V")
	public void method1445(@OriginalArg(1) Class2_Sub17 arg0) {
		arg0.anInt2799 = 0;
		@Pc(12) int local12 = arg0.method1780();
		this.anInt2403 = arg0.method1767();
		this.anInt2399 = arg0.method1767();
		this.anInt2397 = 0;
		@Pc(30) int[] local30 = new int[12];
		@Pc(32) int local32 = -1;
		@Pc(57) int local57;
		@Pc(92) int local92;
		for (@Pc(34) int local34 = 0; local34 < 12; local34++) {
			@Pc(40) int local40 = arg0.method1780();
			if (local40 == 0) {
				local30[local34] = 0;
			} else {
				local57 = arg0.method1780();
				local30[local34] = (local40 << 8) + local57;
				if (local34 == 0 && local30[0] == 65535) {
					local32 = arg0.method1783();
					break;
				}
				if (local30[local34] >= 512) {
					local92 = Static4.method95(local30[local34] - 512).anInt804;
					if (local92 != 0) {
						this.anInt2397 = local92;
					}
				}
			}
		}
		@Pc(106) int[] local106 = new int[5];
		for (local57 = 0; local57 < 5; local57++) {
			local92 = arg0.method1780();
			if (local92 < 0 || Static57.aShortArrayArray1[local57].length <= local92) {
				local92 = 0;
			}
			local106[local57] = local92;
		}
		super.anInt2352 = arg0.method1783();
		if (super.anInt2352 == 65535) {
			super.anInt2352 = -1;
		}
		super.anInt2330 = arg0.method1783();
		if (super.anInt2330 == 65535) {
			super.anInt2330 = -1;
		}
		super.anInt2329 = super.anInt2330;
		super.anInt2318 = arg0.method1783();
		if (super.anInt2318 == 65535) {
			super.anInt2318 = -1;
		}
		super.anInt2333 = arg0.method1783();
		if (super.anInt2333 == 65535) {
			super.anInt2333 = -1;
		}
		super.anInt2345 = arg0.method1783();
		if (super.anInt2345 == 65535) {
			super.anInt2345 = -1;
		}
		super.anInt2326 = arg0.method1783();
		if (super.anInt2326 == 65535) {
			super.anInt2326 = -1;
		}
		super.anInt2356 = arg0.method1783();
		if (super.anInt2356 == 65535) {
			super.anInt2356 = -1;
		}
		this.aClass80_924 = Static102.method1658(arg0.method1792()).method2000();
		this.anInt2387 = arg0.method1780();
		this.anInt2395 = arg0.method1783();
		if (this.aClass79_2 == null) {
			this.aClass79_2 = new Class79();
		}
		this.aClass79_2.method1988(local12 == 1, local30, local106, local32);
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)Lclient!be;")
	@Override
	public Class2_Sub1_Sub1_Sub2 method1423() {
		if (this.aClass79_2 == null) {
			return null;
		}
		@Pc(24) Class2_Sub1_Sub8 local24 = super.anInt2374 != -1 && super.anInt2353 == 0 ? Static93.method1443(super.anInt2374) : null;
		@Pc(50) Class2_Sub1_Sub8 local50 = super.anInt2351 == -1 || this.aBoolean170 || super.anInt2352 == super.anInt2351 && local24 != null ? null : Static93.method1443(super.anInt2351);
		@Pc(61) Class2_Sub1_Sub1_Sub2 local61 = this.aClass79_2.method1981(local24, super.anInt2350, local50, super.anInt2339);
		if (local61 == null) {
			return null;
		}
		local61.method221();
		super.anInt2327 = local61.anInt2306;
		@Pc(93) Class2_Sub1_Sub1_Sub2 local93;
		@Pc(113) Class2_Sub1_Sub1_Sub2[] local113;
		if (!this.aBoolean170 && super.anInt2362 != -1 && super.anInt2372 != -1) {
			local93 = Static106.method1805(super.anInt2362).method1343(super.anInt2372);
			if (local93 != null) {
				local93.method201(0, -super.anInt2331, 0);
				local113 = new Class2_Sub1_Sub1_Sub2[] { local61, local93 };
				local61 = new Class2_Sub1_Sub1_Sub2(local113, 2);
			}
		}
		if (!this.aBoolean170 && this.aClass2_Sub1_Sub1_Sub2_3 != null) {
			if (Static10.anInt300 >= this.anInt2393) {
				this.aClass2_Sub1_Sub1_Sub2_3 = null;
			}
			if (Static10.anInt300 >= this.anInt2391 && this.anInt2393 > Static10.anInt300) {
				local93 = this.aClass2_Sub1_Sub1_Sub2_3;
				local93.method201(this.anInt2405 - super.anInt2370, this.anInt2408 - this.anInt2402, this.anInt2385 - super.anInt2324);
				local113 = new Class2_Sub1_Sub1_Sub2[] { local61, local93 };
				if (super.anInt2375 == 512) {
					local93.method215();
					local93.method215();
					local93.method215();
				} else if (super.anInt2375 == 1024) {
					local93.method215();
					local93.method215();
				} else if (super.anInt2375 == 1536) {
					local93.method215();
				}
				local61 = new Class2_Sub1_Sub1_Sub2(local113, 2);
				if (super.anInt2375 == 512) {
					local93.method215();
				} else if (super.anInt2375 == 1024) {
					local93.method215();
					local93.method215();
				} else if (super.anInt2375 == 1536) {
					local93.method215();
					local93.method215();
					local93.method215();
				}
				local93.method201(super.anInt2370 - this.anInt2405, this.anInt2402 + -this.anInt2408, super.anInt2324 - this.anInt2385);
			}
		}
		local61.aBoolean30 = true;
		return local61;
	}
}
