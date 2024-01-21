import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class4_Sub4_Sub1_Sub2_Sub2 extends Class4_Sub4_Sub1_Sub2 {

	@OriginalMember(owner = "client!sd", name = "Dc", descriptor = "I")
	public int anInt2652;

	@OriginalMember(owner = "client!sd", name = "Fc", descriptor = "I")
	public int anInt2654;

	@OriginalMember(owner = "client!sd", name = "Lc", descriptor = "I")
	public int anInt2659;

	@OriginalMember(owner = "client!sd", name = "Pc", descriptor = "Lclient!qc;")
	public Class60 aClass60_1066;

	@OriginalMember(owner = "client!sd", name = "Rc", descriptor = "I")
	public int anInt2662;

	@OriginalMember(owner = "client!sd", name = "Sc", descriptor = "I")
	public int anInt2663;

	@OriginalMember(owner = "client!sd", name = "Vc", descriptor = "Lclient!je;")
	public Class36 aClass36_1;

	@OriginalMember(owner = "client!sd", name = "Xc", descriptor = "I")
	public int anInt2666;

	@OriginalMember(owner = "client!sd", name = "Yc", descriptor = "I")
	public int anInt2667;

	@OriginalMember(owner = "client!sd", name = "ad", descriptor = "Lclient!rb;")
	public Class4_Sub4_Sub1_Sub6 aClass4_Sub4_Sub1_Sub6_3;

	@OriginalMember(owner = "client!sd", name = "dd", descriptor = "I")
	public int anInt2670;

	@OriginalMember(owner = "client!sd", name = "Ec", descriptor = "I")
	public int anInt2653 = -1;

	@OriginalMember(owner = "client!sd", name = "Bc", descriptor = "I")
	public int anInt2650 = 0;

	@OriginalMember(owner = "client!sd", name = "Mc", descriptor = "Z")
	public boolean aBoolean114 = false;

	@OriginalMember(owner = "client!sd", name = "Cc", descriptor = "I")
	public int anInt2651 = 0;

	@OriginalMember(owner = "client!sd", name = "Qc", descriptor = "I")
	public int anInt2661 = 0;

	@OriginalMember(owner = "client!sd", name = "ed", descriptor = "I")
	public int anInt2671 = -1;

	@OriginalMember(owner = "client!sd", name = "Hc", descriptor = "I")
	public int anInt2656 = 0;

	@OriginalMember(owner = "client!sd", name = "Kc", descriptor = "I")
	public int anInt2658 = 0;

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "(B)Lclient!rb;")
	@Override
	public Class4_Sub4_Sub1_Sub6 method1976() {
		if (this.aClass36_1 == null) {
			return null;
		}
		@Pc(27) Class4_Sub4_Sub14 local27 = super.anInt2633 != -1 && super.anInt2645 == 0 ? Static127.method2102(super.anInt2633) : null;
		@Pc(48) Class4_Sub4_Sub14 local48 = super.anInt2632 == -1 || this.aBoolean114 || super.anInt2632 == super.anInt2594 && local27 != null ? null : Static127.method2102(super.anInt2632);
		@Pc(59) Class4_Sub4_Sub1_Sub6 local59 = this.aClass36_1.method1036(super.anInt2595, local27, super.anInt2629, local48);
		if (local59 == null) {
			return null;
		}
		local59.method1799();
		super.anInt2605 = local59.anInt2816;
		@Pc(93) Class4_Sub4_Sub1_Sub6 local93;
		@Pc(113) Class4_Sub4_Sub1_Sub6[] local113;
		if (!this.aBoolean114 && super.anInt2630 != -1 && super.anInt2617 != -1) {
			local93 = Static92.method1610(super.anInt2630).method853(super.anInt2617);
			if (local93 != null) {
				local93.method1783(0, -super.anInt2642, 0);
				local113 = new Class4_Sub4_Sub1_Sub6[] { local59, local93 };
				local59 = new Class4_Sub4_Sub1_Sub6(local113, 2);
			}
		}
		if (!this.aBoolean114 && this.aClass4_Sub4_Sub1_Sub6_3 != null) {
			if (Static81.anInt1944 >= this.anInt2661) {
				this.aClass4_Sub4_Sub1_Sub6_3 = null;
			}
			if (Static81.anInt1944 >= this.anInt2656 && this.anInt2661 > Static81.anInt1944) {
				local93 = this.aClass4_Sub4_Sub1_Sub6_3;
				local113 = new Class4_Sub4_Sub1_Sub6[] { local59, local93 };
				local93.method1783(this.anInt2652 - super.anInt2620, this.anInt2663 + -this.anInt2670, this.anInt2666 - super.anInt2601);
				if (super.anInt2634 == 512) {
					local93.method1786();
					local93.method1786();
					local93.method1786();
				} else if (super.anInt2634 == 1024) {
					local93.method1786();
					local93.method1786();
				} else if (super.anInt2634 == 1536) {
					local93.method1786();
				}
				local59 = new Class4_Sub4_Sub1_Sub6(local113, 2);
				if (super.anInt2634 == 512) {
					local93.method1786();
				} else if (super.anInt2634 == 1024) {
					local93.method1786();
					local93.method1786();
				} else if (super.anInt2634 == 1536) {
					local93.method1786();
					local93.method1786();
					local93.method1786();
				}
				local93.method1783(super.anInt2620 - this.anInt2652, -this.anInt2663 + this.anInt2670, super.anInt2601 - this.anInt2666);
			}
		}
		local59.aBoolean110 = true;
		return local59;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!re;I)V")
	public void method1886(@OriginalArg(0) Class4_Sub13 arg0) {
		arg0.anInt1643 = 0;
		@Pc(11) int[] local11 = new int[12];
		@Pc(15) int local15 = arg0.method1223();
		this.anInt2671 = arg0.method1224();
		@Pc(24) int local24 = -1;
		this.anInt2653 = arg0.method1224();
		this.anInt2651 = 0;
		@Pc(63) int local63;
		@Pc(101) int local101;
		for (@Pc(40) int local40 = 0; local40 < 12; local40++) {
			@Pc(46) int local46 = arg0.method1223();
			if (local46 == 0) {
				local11[local40] = 0;
			} else {
				local63 = arg0.method1223();
				local11[local40] = local63 + (local46 << 8);
				if (local40 == 0 && local11[0] == 65535) {
					local24 = arg0.method1244();
					break;
				}
				if (local11[local40] >= 512) {
					local101 = Static24.method475(local11[local40] - 512).anInt2096;
					if (local101 != 0) {
						this.anInt2651 = local101;
					}
				}
			}
		}
		@Pc(116) int[] local116 = new int[5];
		for (local63 = 0; local63 < 5; local63++) {
			local101 = arg0.method1223();
			if (local101 < 0 || local101 >= Static108.aShortArrayArray1[local63].length) {
				local101 = 0;
			}
			local116[local63] = local101;
		}
		super.anInt2594 = arg0.method1244();
		if (super.anInt2594 == 65535) {
			super.anInt2594 = -1;
		}
		super.anInt2590 = arg0.method1244();
		if (super.anInt2590 == 65535) {
			super.anInt2590 = -1;
		}
		super.anInt2603 = super.anInt2590;
		super.anInt2637 = arg0.method1244();
		if (super.anInt2637 == 65535) {
			super.anInt2637 = -1;
		}
		super.anInt2606 = arg0.method1244();
		if (super.anInt2606 == 65535) {
			super.anInt2606 = -1;
		}
		super.anInt2613 = arg0.method1244();
		if (super.anInt2613 == 65535) {
			super.anInt2613 = -1;
		}
		super.anInt2647 = arg0.method1244();
		if (super.anInt2647 == 65535) {
			super.anInt2647 = -1;
		}
		super.anInt2640 = arg0.method1244();
		if (super.anInt2640 == 65535) {
			super.anInt2640 = -1;
		}
		this.aClass60_1066 = Static87.method1501(arg0.method1250()).method1651();
		this.anInt2658 = arg0.method1223();
		this.anInt2650 = arg0.method1244();
		if (this.aClass36_1 == null) {
			this.aClass36_1 = new Class36();
		}
		this.aClass36_1.method1041(local24, local15 == 1, local116, local11);
	}

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method1877() {
		return this.aClass36_1 != null;
	}
}
