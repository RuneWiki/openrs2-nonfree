import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class1_Sub1_Sub2_Sub1_Sub2 extends Class1_Sub1_Sub2_Sub1 {

	@OriginalMember(owner = "client!td", name = "Yc", descriptor = "I")
	public int anInt2415;

	@OriginalMember(owner = "client!td", name = "Zc", descriptor = "I")
	public int anInt2416;

	@OriginalMember(owner = "client!td", name = "bd", descriptor = "I")
	public int anInt2418;

	@OriginalMember(owner = "client!td", name = "dd", descriptor = "I")
	public int anInt2419;

	@OriginalMember(owner = "client!td", name = "jd", descriptor = "Lclient!o;")
	public Class54 aClass54_2;

	@OriginalMember(owner = "client!td", name = "md", descriptor = "I")
	public int anInt2425;

	@OriginalMember(owner = "client!td", name = "nd", descriptor = "I")
	public int anInt2426;

	@OriginalMember(owner = "client!td", name = "rd", descriptor = "I")
	public int anInt2428;

	@OriginalMember(owner = "client!td", name = "Bd", descriptor = "I")
	public int anInt2436;

	@OriginalMember(owner = "client!td", name = "Gd", descriptor = "Lclient!rd;")
	public Class64 aClass64_1543;

	@OriginalMember(owner = "client!td", name = "Hd", descriptor = "Lclient!ue;")
	public Class1_Sub1_Sub2_Sub7 aClass1_Sub1_Sub2_Sub7_1;

	@OriginalMember(owner = "client!td", name = "Xc", descriptor = "I")
	public int anInt2414 = 0;

	@OriginalMember(owner = "client!td", name = "ed", descriptor = "Z")
	public boolean aBoolean148 = false;

	@OriginalMember(owner = "client!td", name = "fd", descriptor = "I")
	public int anInt2420 = -1;

	@OriginalMember(owner = "client!td", name = "xd", descriptor = "I")
	public int anInt2432 = -1;

	@OriginalMember(owner = "client!td", name = "Cd", descriptor = "I")
	public int anInt2437 = 0;

	@OriginalMember(owner = "client!td", name = "gd", descriptor = "I")
	public int anInt2421 = 0;

	@OriginalMember(owner = "client!td", name = "sd", descriptor = "I")
	public int anInt2429 = 0;

	@OriginalMember(owner = "client!td", name = "zd", descriptor = "I")
	public int anInt2434 = 0;

	@OriginalMember(owner = "client!td", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method1685() {
		return this.aClass54_2 != null;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!id;I)V")
	public void method1697(@OriginalArg(0) Class1_Sub6 arg0) {
		arg0.anInt2574 = 0;
		@Pc(12) int local12 = arg0.method1837();
		this.anInt2420 = arg0.method1824();
		@Pc(19) int local19 = -1;
		this.anInt2432 = arg0.method1824();
		@Pc(27) int[] local27 = new int[12];
		this.anInt2414 = 0;
		@Pc(50) int local50;
		@Pc(92) int local92;
		for (@Pc(32) int local32 = 0; local32 < 12; local32++) {
			@Pc(38) int local38 = arg0.method1837();
			if (local38 == 0) {
				local27[local32] = 0;
			} else {
				local50 = arg0.method1837();
				local27[local32] = local50 + (local38 << 8);
				if (local32 == 0 && local27[0] == 65535) {
					local19 = arg0.method1842();
					break;
				}
				if (local27[local32] >= 512) {
					local92 = Static106.method1739(local27[local32] - 512).anInt981;
					if (local92 != 0) {
						this.anInt2414 = local92;
					}
				}
			}
		}
		@Pc(106) int[] local106 = new int[5];
		for (local50 = 0; local50 < 5; local50++) {
			local92 = arg0.method1837();
			if (local92 < 0 || local92 >= Static83.aShortArrayArray1[local50].length) {
				local92 = 0;
			}
			local106[local50] = local92;
		}
		super.anInt2361 = arg0.method1842();
		if (super.anInt2361 == 65535) {
			super.anInt2361 = -1;
		}
		super.anInt2413 = arg0.method1842();
		if (super.anInt2413 == 65535) {
			super.anInt2413 = -1;
		}
		super.anInt2401 = super.anInt2413;
		super.anInt2360 = arg0.method1842();
		if (super.anInt2360 == 65535) {
			super.anInt2360 = -1;
		}
		super.anInt2398 = arg0.method1842();
		if (super.anInt2398 == 65535) {
			super.anInt2398 = -1;
		}
		super.anInt2390 = arg0.method1842();
		if (super.anInt2390 == 65535) {
			super.anInt2390 = -1;
		}
		super.anInt2378 = arg0.method1842();
		if (super.anInt2378 == 65535) {
			super.anInt2378 = -1;
		}
		super.anInt2409 = arg0.method1842();
		if (super.anInt2409 == 65535) {
			super.anInt2409 = -1;
		}
		this.aClass64_1543 = Static34.method565(arg0.method1865()).method1478();
		this.anInt2429 = arg0.method1837();
		this.anInt2421 = arg0.method1842();
		if (this.aClass54_2 == null) {
			this.aClass54_2 = new Class54();
		}
		this.aClass54_2.method1249(local12 == 1, local19, local106, local27);
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(B)Lclient!ue;")
	@Override
	public Class1_Sub1_Sub2_Sub7 method1910() {
		if (this.aClass54_2 == null) {
			return null;
		}
		@Pc(29) Class1_Sub1_Sub4 local29 = super.anInt2407 != -1 && super.anInt2368 == 0 ? Static10.method254(super.anInt2407) : null;
		@Pc(50) Class1_Sub1_Sub4 local50 = super.anInt2396 == -1 || this.aBoolean148 || super.anInt2361 == super.anInt2396 && local29 != null ? null : Static10.method254(super.anInt2396);
		@Pc(61) Class1_Sub1_Sub2_Sub7 local61 = this.aClass54_2.method1256(super.anInt2367, local29, super.anInt2357, local50);
		if (local61 == null) {
			return null;
		}
		local61.method1919();
		super.anInt2404 = local61.anInt2678;
		@Pc(92) Class1_Sub1_Sub2_Sub7 local92;
		@Pc(112) Class1_Sub1_Sub2_Sub7[] local112;
		if (!this.aBoolean148 && super.anInt2382 != -1 && super.anInt2402 != -1) {
			local92 = Static62.method1091(super.anInt2382).method915(super.anInt2402);
			if (local92 != null) {
				local92.method1934(0, -super.anInt2391, 0);
				local112 = new Class1_Sub1_Sub2_Sub7[] { local61, local92 };
				local61 = new Class1_Sub1_Sub2_Sub7(local112, 2);
			}
		}
		if (!this.aBoolean148 && this.aClass1_Sub1_Sub2_Sub7_1 != null) {
			if (Static15.anInt471 >= this.anInt2437) {
				this.aClass1_Sub1_Sub2_Sub7_1 = null;
			}
			if (Static15.anInt471 >= this.anInt2434 && this.anInt2437 > Static15.anInt471) {
				local92 = this.aClass1_Sub1_Sub2_Sub7_1;
				local92.method1934(this.anInt2428 - super.anInt2375, -this.anInt2426 + this.anInt2436, this.anInt2418 - super.anInt2412);
				if (super.anInt2386 == 512) {
					local92.method1915();
					local92.method1915();
					local92.method1915();
				} else if (super.anInt2386 == 1024) {
					local92.method1915();
					local92.method1915();
				} else if (super.anInt2386 == 1536) {
					local92.method1915();
				}
				local112 = new Class1_Sub1_Sub2_Sub7[] { local61, local92 };
				local61 = new Class1_Sub1_Sub2_Sub7(local112, 2);
				if (super.anInt2386 == 512) {
					local92.method1915();
				} else if (super.anInt2386 == 1024) {
					local92.method1915();
					local92.method1915();
				} else if (super.anInt2386 == 1536) {
					local92.method1915();
					local92.method1915();
					local92.method1915();
				}
				local92.method1934(super.anInt2375 - this.anInt2428, this.anInt2426 + -this.anInt2436, super.anInt2412 - this.anInt2418);
			}
		}
		local61.aBoolean157 = true;
		return local61;
	}
}
