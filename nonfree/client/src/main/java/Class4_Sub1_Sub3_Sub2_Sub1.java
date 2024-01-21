import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class4_Sub1_Sub3_Sub2_Sub1 extends Class4_Sub1_Sub3_Sub2 {

	@OriginalMember(owner = "client!ka", name = "Fc", descriptor = "I")
	public int anInt1727;

	@OriginalMember(owner = "client!ka", name = "Jc", descriptor = "Lclient!eb;")
	public Class21 aClass21_2;

	@OriginalMember(owner = "client!ka", name = "Kc", descriptor = "I")
	public int anInt1730;

	@OriginalMember(owner = "client!ka", name = "Oc", descriptor = "I")
	public int anInt1733;

	@OriginalMember(owner = "client!ka", name = "Uc", descriptor = "I")
	public int anInt1737;

	@OriginalMember(owner = "client!ka", name = "Vc", descriptor = "I")
	public int anInt1738;

	@OriginalMember(owner = "client!ka", name = "Wc", descriptor = "I")
	public int anInt1739;

	@OriginalMember(owner = "client!ka", name = "Xc", descriptor = "I")
	public int anInt1740;

	@OriginalMember(owner = "client!ka", name = "ad", descriptor = "I")
	public int anInt1743;

	@OriginalMember(owner = "client!ka", name = "gd", descriptor = "Lclient!od;")
	public Class4_Sub1_Sub3_Sub3 aClass4_Sub1_Sub3_Sub3_1;

	@OriginalMember(owner = "client!ka", name = "ld", descriptor = "Lclient!ec;")
	public Class22 aClass22_444;

	@OriginalMember(owner = "client!ka", name = "Rc", descriptor = "I")
	public int anInt1735 = 0;

	@OriginalMember(owner = "client!ka", name = "Pc", descriptor = "I")
	public int anInt1734 = 0;

	@OriginalMember(owner = "client!ka", name = "fd", descriptor = "I")
	public int anInt1747 = 0;

	@OriginalMember(owner = "client!ka", name = "Nc", descriptor = "I")
	public int anInt1732 = 0;

	@OriginalMember(owner = "client!ka", name = "Tc", descriptor = "Z")
	public boolean aBoolean157 = false;

	@OriginalMember(owner = "client!ka", name = "ed", descriptor = "I")
	public int anInt1746 = 0;

	@OriginalMember(owner = "client!ka", name = "md", descriptor = "I")
	public int anInt1751 = -1;

	@OriginalMember(owner = "client!ka", name = "bd", descriptor = "I")
	public int anInt1744 = -1;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BLclient!jd;)V")
	public void method1092(@OriginalArg(1) Class4_Sub11 arg0) {
		arg0.anInt1099 = 0;
		@Pc(11) int[] local11 = new int[12];
		@Pc(13) int local13 = -1;
		@Pc(17) int local17 = arg0.method719();
		this.anInt1744 = arg0.method731();
		this.anInt1751 = arg0.method731();
		this.anInt1734 = 0;
		@Pc(53) int local53;
		@Pc(88) int local88;
		for (@Pc(32) int local32 = 0; local32 < 12; local32++) {
			@Pc(38) int local38 = arg0.method719();
			if (local38 == 0) {
				local11[local32] = 0;
			} else {
				local53 = arg0.method719();
				local11[local32] = local53 + (local38 << 8);
				if (local32 == 0 && local11[0] == 65535) {
					local13 = arg0.method718();
					break;
				}
				if (local11[local32] >= 512) {
					local88 = Static123.method2000(local11[local32] - 512).anInt1476;
					if (local88 != 0) {
						this.anInt1734 = local88;
					}
				}
			}
		}
		@Pc(105) int[] local105 = new int[5];
		for (local53 = 0; local53 < 5; local53++) {
			local88 = arg0.method719();
			if (local88 < 0 || Static117.aShortArrayArray4[local53].length <= local88) {
				local88 = 0;
			}
			local105[local53] = local88;
		}
		super.anInt2452 = arg0.method718();
		if (super.anInt2452 == 65535) {
			super.anInt2452 = -1;
		}
		super.anInt2498 = arg0.method718();
		if (super.anInt2498 == 65535) {
			super.anInt2498 = -1;
		}
		super.anInt2478 = super.anInt2498;
		super.anInt2471 = arg0.method718();
		if (super.anInt2471 == 65535) {
			super.anInt2471 = -1;
		}
		super.anInt2491 = arg0.method718();
		if (super.anInt2491 == 65535) {
			super.anInt2491 = -1;
		}
		super.anInt2481 = arg0.method718();
		if (super.anInt2481 == 65535) {
			super.anInt2481 = -1;
		}
		super.anInt2487 = arg0.method718();
		if (super.anInt2487 == 65535) {
			super.anInt2487 = -1;
		}
		super.anInt2467 = arg0.method718();
		if (super.anInt2467 == 65535) {
			super.anInt2467 = -1;
		}
		this.aClass22_444 = Static8.method1575(arg0.method714()).method473();
		this.anInt1732 = arg0.method719();
		this.anInt1746 = arg0.method718();
		if (this.aClass21_2 == null) {
			this.aClass21_2 = new Class21();
		}
		this.aClass21_2.method441(local105, local13, local11, local17 == 1);
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(B)Lclient!od;")
	@Override
	public Class4_Sub1_Sub3_Sub3 method1816() {
		if (this.aClass21_2 == null) {
			return null;
		}
		@Pc(28) Class4_Sub1_Sub17 local28 = super.anInt2474 != -1 && super.anInt2477 == 0 ? Static79.method1437(super.anInt2474) : null;
		@Pc(54) Class4_Sub1_Sub17 local54 = super.anInt2470 == -1 || this.aBoolean157 || super.anInt2470 == super.anInt2452 && local28 != null ? null : Static79.method1437(super.anInt2470);
		@Pc(70) Class4_Sub1_Sub3_Sub3 local70 = this.aClass21_2.method442(local28, super.anInt2486, local54, super.anInt2483);
		if (local70 == null) {
			return null;
		}
		local70.method1474();
		super.anInt2453 = local70.anInt2808;
		@Pc(100) Class4_Sub1_Sub3_Sub3 local100;
		@Pc(113) Class4_Sub1_Sub3_Sub3[] local113;
		if (!this.aBoolean157 && super.anInt2489 != -1 && super.anInt2507 != -1) {
			local100 = Static33.method549(super.anInt2489).method1790(super.anInt2507);
			if (local100 != null) {
				local113 = new Class4_Sub1_Sub3_Sub3[] { local70, local100 };
				local100.method1487(0, -super.anInt2485, 0);
				local70 = new Class4_Sub1_Sub3_Sub3(local113, 2);
			}
		}
		if (!this.aBoolean157 && this.aClass4_Sub1_Sub3_Sub3_1 != null) {
			if (this.anInt1747 <= Static117.anInt2877) {
				this.aClass4_Sub1_Sub3_Sub3_1 = null;
			}
			if (this.anInt1735 <= Static117.anInt2877 && this.anInt1747 > Static117.anInt2877) {
				local100 = this.aClass4_Sub1_Sub3_Sub3_1;
				local100.method1487(this.anInt1727 - super.anInt2500, this.anInt1739 + -this.anInt1738, this.anInt1743 - super.anInt2462);
				if (super.anInt2496 == 512) {
					local100.method1471();
					local100.method1471();
					local100.method1471();
				} else if (super.anInt2496 == 1024) {
					local100.method1471();
					local100.method1471();
				} else if (super.anInt2496 == 1536) {
					local100.method1471();
				}
				local113 = new Class4_Sub1_Sub3_Sub3[] { local70, local100 };
				local70 = new Class4_Sub1_Sub3_Sub3(local113, 2);
				if (super.anInt2496 == 512) {
					local100.method1471();
				} else if (super.anInt2496 == 1024) {
					local100.method1471();
					local100.method1471();
				} else if (super.anInt2496 == 1536) {
					local100.method1471();
					local100.method1471();
					local100.method1471();
				}
				local100.method1487(super.anInt2500 - this.anInt1727, this.anInt1738 - this.anInt1739, super.anInt2462 - this.anInt1743);
			}
		}
		local70.aBoolean199 = true;
		return local70;
	}

	@OriginalMember(owner = "client!ka", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method1614() {
		return this.aClass21_2 != null;
	}
}
