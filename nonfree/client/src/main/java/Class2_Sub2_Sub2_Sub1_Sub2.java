import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class2_Sub2_Sub2_Sub1_Sub2 extends Class2_Sub2_Sub2_Sub1 {

	@OriginalMember(owner = "client!vd", name = "Pc", descriptor = "I")
	public int anInt2724;

	@OriginalMember(owner = "client!vd", name = "Uc", descriptor = "I")
	public int anInt2728;

	@OriginalMember(owner = "client!vd", name = "Vc", descriptor = "Lclient!na;")
	public Class2_Sub2_Sub2_Sub5 aClass2_Sub2_Sub2_Sub5_3;

	@OriginalMember(owner = "client!vd", name = "Wc", descriptor = "Lclient!u;")
	public Class74 aClass74_1661;

	@OriginalMember(owner = "client!vd", name = "Yc", descriptor = "I")
	public int anInt2730;

	@OriginalMember(owner = "client!vd", name = "Zc", descriptor = "I")
	public int anInt2731;

	@OriginalMember(owner = "client!vd", name = "gd", descriptor = "Lclient!dc;")
	public Class14 aClass14_2;

	@OriginalMember(owner = "client!vd", name = "od", descriptor = "I")
	public int anInt2743;

	@OriginalMember(owner = "client!vd", name = "qd", descriptor = "I")
	public int anInt2744;

	@OriginalMember(owner = "client!vd", name = "rd", descriptor = "I")
	public int anInt2745;

	@OriginalMember(owner = "client!vd", name = "td", descriptor = "I")
	public int anInt2746;

	@OriginalMember(owner = "client!vd", name = "Tc", descriptor = "I")
	public int anInt2727 = 0;

	@OriginalMember(owner = "client!vd", name = "bd", descriptor = "I")
	public int anInt2732 = 0;

	@OriginalMember(owner = "client!vd", name = "Rc", descriptor = "I")
	public int anInt2726 = -1;

	@OriginalMember(owner = "client!vd", name = "Oc", descriptor = "Z")
	public boolean aBoolean117 = false;

	@OriginalMember(owner = "client!vd", name = "cd", descriptor = "I")
	public int anInt2733 = 0;

	@OriginalMember(owner = "client!vd", name = "dd", descriptor = "I")
	public int anInt2734 = 0;

	@OriginalMember(owner = "client!vd", name = "Bd", descriptor = "I")
	public int anInt2752 = 0;

	@OriginalMember(owner = "client!vd", name = "zd", descriptor = "I")
	public int anInt2750 = -1;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZLclient!ic;)V")
	public void method1868(@OriginalArg(1) Class2_Sub10 arg0) {
		arg0.anInt2187 = 0;
		@Pc(12) int local12 = arg0.method1514();
		this.anInt2726 = arg0.method1509();
		@Pc(19) int local19 = -1;
		this.anInt2750 = arg0.method1509();
		this.anInt2752 = 0;
		@Pc(30) int[] local30 = new int[12];
		@Pc(53) int local53;
		@Pc(93) int local93;
		for (@Pc(32) int local32 = 0; local32 < 12; local32++) {
			@Pc(38) int local38 = arg0.method1514();
			if (local38 == 0) {
				local30[local32] = 0;
			} else {
				local53 = arg0.method1514();
				local30[local32] = local53 + (local38 << 8);
				if (local32 == 0 && local30[0] == 65535) {
					local19 = arg0.method1517();
					break;
				}
				if (local30[local32] >= 512) {
					local93 = Static35.method1934(local30[local32] - 512).anInt1693;
					if (local93 != 0) {
						this.anInt2752 = local93;
					}
				}
			}
		}
		@Pc(113) int[] local113 = new int[5];
		for (local53 = 0; local53 < 5; local53++) {
			local93 = arg0.method1514();
			if (local93 < 0 || local93 >= Static106.aShortArrayArray1[local53].length) {
				local93 = 0;
			}
			local113[local53] = local93;
		}
		super.anInt2722 = arg0.method1517();
		if (super.anInt2722 == 65535) {
			super.anInt2722 = -1;
		}
		super.anInt2708 = arg0.method1517();
		if (super.anInt2708 == 65535) {
			super.anInt2708 = -1;
		}
		super.anInt2682 = super.anInt2708;
		super.anInt2693 = arg0.method1517();
		if (super.anInt2693 == 65535) {
			super.anInt2693 = -1;
		}
		super.anInt2688 = arg0.method1517();
		if (super.anInt2688 == 65535) {
			super.anInt2688 = -1;
		}
		super.anInt2697 = arg0.method1517();
		if (super.anInt2697 == 65535) {
			super.anInt2697 = -1;
		}
		super.anInt2692 = arg0.method1517();
		if (super.anInt2692 == 65535) {
			super.anInt2692 = -1;
		}
		super.anInt2676 = arg0.method1517();
		if (super.anInt2676 == 65535) {
			super.anInt2676 = -1;
		}
		this.aClass74_1661 = Static112.method1686(arg0.method1478()).method1720();
		this.anInt2734 = arg0.method1514();
		this.anInt2727 = arg0.method1517();
		if (this.aClass14_2 == null) {
			this.aClass14_2 = new Class14();
		}
		this.aClass14_2.method438(local19, local12 == 1, local113, local30);
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)Lclient!na;")
	@Override
	public Class2_Sub2_Sub2_Sub5 method1855() {
		if (this.aClass14_2 == null) {
			return null;
		}
		@Pc(28) Class2_Sub2_Sub11 local28 = super.anInt2670 != -1 && super.anInt2675 == 0 ? Static12.method270(super.anInt2670) : null;
		@Pc(50) Class2_Sub2_Sub11 local50 = super.anInt2663 == -1 || this.aBoolean117 || super.anInt2722 == super.anInt2663 && local28 != null ? null : Static12.method270(super.anInt2663);
		@Pc(61) Class2_Sub2_Sub2_Sub5 local61 = this.aClass14_2.method447(super.anInt2666, local50, local28, super.anInt2690);
		if (local61 == null) {
			return null;
		}
		local61.method1133();
		super.anInt2668 = local61.anInt2656;
		@Pc(100) Class2_Sub2_Sub2_Sub5 local100;
		@Pc(113) Class2_Sub2_Sub2_Sub5[] local113;
		if (!this.aBoolean117 && super.anInt2660 != -1 && super.anInt2696 != -1) {
			local100 = Static38.method653(super.anInt2660).method341(super.anInt2696);
			if (local100 != null) {
				local113 = new Class2_Sub2_Sub2_Sub5[] { local61, local100 };
				local100.method1138(0, -super.anInt2685, 0);
				local61 = new Class2_Sub2_Sub2_Sub5(local113, 2);
			}
		}
		if (!this.aBoolean117 && this.aClass2_Sub2_Sub2_Sub5_3 != null) {
			if (Static107.anInt2338 >= this.anInt2732) {
				this.aClass2_Sub2_Sub2_Sub5_3 = null;
			}
			if (Static107.anInt2338 >= this.anInt2733 && this.anInt2732 > Static107.anInt2338) {
				local100 = this.aClass2_Sub2_Sub2_Sub5_3;
				local100.method1138(this.anInt2728 - super.anInt2673, this.anInt2744 - this.anInt2724, this.anInt2746 - super.anInt2672);
				if (super.anInt2705 == 512) {
					local100.method1123();
					local100.method1123();
					local100.method1123();
				} else if (super.anInt2705 == 1024) {
					local100.method1123();
					local100.method1123();
				} else if (super.anInt2705 == 1536) {
					local100.method1123();
				}
				local113 = new Class2_Sub2_Sub2_Sub5[] { local61, local100 };
				local61 = new Class2_Sub2_Sub2_Sub5(local113, 2);
				if (super.anInt2705 == 512) {
					local100.method1123();
				} else if (super.anInt2705 == 1024) {
					local100.method1123();
					local100.method1123();
				} else if (super.anInt2705 == 1536) {
					local100.method1123();
					local100.method1123();
					local100.method1123();
				}
				local100.method1138(super.anInt2673 - this.anInt2728, this.anInt2724 + -this.anInt2744, super.anInt2672 - this.anInt2746);
			}
		}
		local61.aBoolean63 = true;
		return local61;
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method1861() {
		return this.aClass14_2 != null;
	}
}
