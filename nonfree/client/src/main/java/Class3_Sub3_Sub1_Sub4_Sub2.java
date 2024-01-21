import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class3_Sub3_Sub1_Sub4_Sub2 extends Class3_Sub3_Sub1_Sub4 {

	@OriginalMember(owner = "client!ra", name = "gd", descriptor = "I")
	public int anInt2440;

	@OriginalMember(owner = "client!ra", name = "nd", descriptor = "I")
	public int anInt2445;

	@OriginalMember(owner = "client!ra", name = "rd", descriptor = "I")
	public int anInt2446;

	@OriginalMember(owner = "client!ra", name = "wd", descriptor = "I")
	public int anInt2449;

	@OriginalMember(owner = "client!ra", name = "xd", descriptor = "I")
	public int anInt2450;

	@OriginalMember(owner = "client!ra", name = "yd", descriptor = "Lclient!de;")
	public Class3_Sub3_Sub1_Sub1 aClass3_Sub3_Sub1_Sub1_3;

	@OriginalMember(owner = "client!ra", name = "zd", descriptor = "I")
	public int anInt2451;

	@OriginalMember(owner = "client!ra", name = "Cd", descriptor = "I")
	public int anInt2453;

	@OriginalMember(owner = "client!ra", name = "Dd", descriptor = "I")
	public int anInt2454;

	@OriginalMember(owner = "client!ra", name = "Hd", descriptor = "Lclient!dd;")
	public Class15 aClass15_2;

	@OriginalMember(owner = "client!ra", name = "Kd", descriptor = "Lclient!hb;")
	public Class27 aClass27_1150;

	@OriginalMember(owner = "client!ra", name = "md", descriptor = "I")
	public int anInt2444 = 0;

	@OriginalMember(owner = "client!ra", name = "cd", descriptor = "I")
	public int anInt2437 = -1;

	@OriginalMember(owner = "client!ra", name = "td", descriptor = "I")
	public int anInt2448 = 0;

	@OriginalMember(owner = "client!ra", name = "dd", descriptor = "I")
	public int anInt2438 = 0;

	@OriginalMember(owner = "client!ra", name = "kd", descriptor = "I")
	public int anInt2443 = 0;

	@OriginalMember(owner = "client!ra", name = "bd", descriptor = "I")
	public int anInt2436 = -1;

	@OriginalMember(owner = "client!ra", name = "vd", descriptor = "Z")
	public boolean aBoolean119 = false;

	@OriginalMember(owner = "client!ra", name = "Gd", descriptor = "I")
	public int anInt2457 = 0;

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method1679() {
		return this.aClass15_2 != null;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BLclient!wd;)V")
	public void method1683(@OriginalArg(1) Class3_Sub11 arg0) {
		arg0.anInt2060 = 0;
		@Pc(16) int local16 = arg0.method1421();
		@Pc(18) int local18 = -1;
		this.anInt2437 = arg0.method1432();
		this.anInt2436 = arg0.method1432();
		this.anInt2448 = 0;
		@Pc(34) int[] local34 = new int[12];
		@Pc(57) int local57;
		@Pc(98) int local98;
		for (@Pc(36) int local36 = 0; local36 < 12; local36++) {
			@Pc(42) int local42 = arg0.method1421();
			if (local42 == 0) {
				local34[local36] = 0;
			} else {
				local57 = arg0.method1421();
				local34[local36] = (local42 << 8) + local57;
				if (local36 == 0 && local34[0] == 65535) {
					local18 = arg0.method1451();
					break;
				}
				if (local34[local36] >= 512) {
					local98 = Static37.method696(local34[local36] - 512).anInt1807;
					if (local98 != 0) {
						this.anInt2448 = local98;
					}
				}
			}
		}
		@Pc(115) int[] local115 = new int[5];
		for (local57 = 0; local57 < 5; local57++) {
			local98 = arg0.method1421();
			if (local98 < 0 || Static102.anIntArrayArray70[local57].length <= local98) {
				local98 = 0;
			}
			local115[local57] = local98;
		}
		super.anInt2410 = arg0.method1451();
		if (super.anInt2410 == 65535) {
			super.anInt2410 = -1;
		}
		super.anInt2412 = arg0.method1451();
		if (super.anInt2412 == 65535) {
			super.anInt2412 = -1;
		}
		super.anInt2386 = super.anInt2412;
		super.anInt2411 = arg0.method1451();
		if (super.anInt2411 == 65535) {
			super.anInt2411 = -1;
		}
		super.anInt2398 = arg0.method1451();
		if (super.anInt2398 == 65535) {
			super.anInt2398 = -1;
		}
		super.anInt2431 = arg0.method1451();
		if (super.anInt2431 == 65535) {
			super.anInt2431 = -1;
		}
		super.anInt2375 = arg0.method1451();
		if (super.anInt2375 == 65535) {
			super.anInt2375 = -1;
		}
		super.anInt2418 = arg0.method1451();
		if (super.anInt2418 == 65535) {
			super.anInt2418 = -1;
		}
		this.aClass27_1150 = Static38.method712(arg0.method1450()).method746();
		this.anInt2438 = arg0.method1421();
		this.anInt2443 = arg0.method1451();
		if (this.aClass15_2 == null) {
			this.aClass15_2 = new Class15();
		}
		this.aClass15_2.method347(local34, local115, local18, local16 == 1);
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(B)Lclient!de;")
	@Override
	protected Class3_Sub3_Sub1_Sub1 method1667() {
		if (this.aClass15_2 == null) {
			return null;
		}
		@Pc(35) Class3_Sub3_Sub14 local35 = super.anInt2430 != -1 && super.anInt2388 == 0 ? Static16.method298(super.anInt2430) : null;
		@Pc(61) Class3_Sub3_Sub14 local61 = super.anInt2390 == -1 || this.aBoolean119 || super.anInt2390 == super.anInt2410 && local35 != null ? null : Static16.method298(super.anInt2390);
		@Pc(72) Class3_Sub3_Sub1_Sub1 local72 = this.aClass15_2.method343(local35, super.anInt2397, super.anInt2376, local61);
		if (local72 == null) {
			return null;
		}
		local72.method419();
		super.anInt2384 = local72.anInt2368;
		@Pc(103) Class3_Sub3_Sub1_Sub1 local103;
		@Pc(123) Class3_Sub3_Sub1_Sub1[] local123;
		if (!this.aBoolean119 && super.anInt2385 != -1 && super.anInt2404 != -1) {
			local103 = Static84.method1557(super.anInt2385).method1710(super.anInt2404);
			if (local103 != null) {
				local103.method412(0, -super.anInt2392, 0);
				local123 = new Class3_Sub3_Sub1_Sub1[] { local72, local103 };
				local72 = new Class3_Sub3_Sub1_Sub1(local123, 2, true);
			}
		}
		if (!this.aBoolean119 && this.aClass3_Sub3_Sub1_Sub1_3 != null) {
			if (this.anInt2457 <= Static2.anInt38) {
				this.aClass3_Sub3_Sub1_Sub1_3 = null;
			}
			if (this.anInt2444 <= Static2.anInt38 && Static2.anInt38 < this.anInt2457) {
				local103 = this.aClass3_Sub3_Sub1_Sub1_3;
				local123 = new Class3_Sub3_Sub1_Sub1[] { local72, local103 };
				local103.method412(this.anInt2451 - super.anInt2408, -this.anInt2454 + this.anInt2445, this.anInt2446 - super.anInt2399);
				if (super.anInt2422 == 512) {
					local103.method408();
					local103.method408();
					local103.method408();
				} else if (super.anInt2422 == 1024) {
					local103.method408();
					local103.method408();
				} else if (super.anInt2422 == 1536) {
					local103.method408();
				}
				local72 = new Class3_Sub3_Sub1_Sub1(local123, 2, true);
				if (super.anInt2422 == 512) {
					local103.method408();
				} else if (super.anInt2422 == 1024) {
					local103.method408();
					local103.method408();
				} else if (super.anInt2422 == 1536) {
					local103.method408();
					local103.method408();
					local103.method408();
				}
				local103.method412(super.anInt2408 - this.anInt2451, this.anInt2454 - this.anInt2445, super.anInt2399 - this.anInt2446);
			}
		}
		local72.aBoolean31 = true;
		return local72;
	}
}
