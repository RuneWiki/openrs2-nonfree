import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class2_Sub1_Sub2_Sub3_Sub1 extends Class2_Sub1_Sub2_Sub3 {

	@OriginalMember(owner = "client!tc", name = "Pc", descriptor = "I")
	public int anInt2615;

	@OriginalMember(owner = "client!tc", name = "Uc", descriptor = "I")
	public int anInt2617;

	@OriginalMember(owner = "client!tc", name = "Wc", descriptor = "I")
	public int anInt2619;

	@OriginalMember(owner = "client!tc", name = "Xc", descriptor = "I")
	public int anInt2620;

	@OriginalMember(owner = "client!tc", name = "Yc", descriptor = "I")
	public int anInt2621;

	@OriginalMember(owner = "client!tc", name = "jd", descriptor = "I")
	public int anInt2627;

	@OriginalMember(owner = "client!tc", name = "qd", descriptor = "Lclient!ja;")
	public Class35 aClass35_2;

	@OriginalMember(owner = "client!tc", name = "rd", descriptor = "I")
	public int anInt2633;

	@OriginalMember(owner = "client!tc", name = "ud", descriptor = "Lclient!ke;")
	public Class39 aClass39_1182;

	@OriginalMember(owner = "client!tc", name = "wd", descriptor = "I")
	public int anInt2635;

	@OriginalMember(owner = "client!tc", name = "xd", descriptor = "Lclient!ga;")
	public Class2_Sub1_Sub2_Sub2 aClass2_Sub1_Sub2_Sub2_3;

	@OriginalMember(owner = "client!tc", name = "kd", descriptor = "I")
	public int anInt2628 = 0;

	@OriginalMember(owner = "client!tc", name = "Vc", descriptor = "I")
	public int anInt2618 = 0;

	@OriginalMember(owner = "client!tc", name = "Sc", descriptor = "I")
	public int anInt2616 = -1;

	@OriginalMember(owner = "client!tc", name = "md", descriptor = "I")
	public int anInt2630 = 0;

	@OriginalMember(owner = "client!tc", name = "yd", descriptor = "I")
	public int anInt2636 = 0;

	@OriginalMember(owner = "client!tc", name = "ld", descriptor = "I")
	public int anInt2629 = -1;

	@OriginalMember(owner = "client!tc", name = "Qc", descriptor = "Z")
	public boolean aBoolean118 = false;

	@OriginalMember(owner = "client!tc", name = "Hd", descriptor = "I")
	public int anInt2641 = 0;

	@OriginalMember(owner = "client!tc", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method2067() {
		return this.aClass35_2 != null;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!g;Z)V")
	public void method1847(@OriginalArg(0) Class2_Sub5 arg0) {
		arg0.anInt1772 = 0;
		@Pc(20) int local20 = -1;
		@Pc(23) int[] local23 = new int[12];
		@Pc(27) int local27 = arg0.method1281();
		this.anInt2629 = arg0.method1254();
		this.anInt2616 = arg0.method1254();
		this.anInt2636 = 0;
		@Pc(65) int local65;
		@Pc(104) int local104;
		for (@Pc(46) int local46 = 0; local46 < 12; local46++) {
			@Pc(51) int local51 = arg0.method1281();
			if (local51 == 0) {
				local23[local46] = 0;
			} else {
				local65 = arg0.method1281();
				local23[local46] = (local51 << 8) + local65;
				if (local46 == 0 && local23[0] == 65535) {
					local20 = arg0.method1273();
					break;
				}
				if (local23[local46] >= 512) {
					local104 = Static66.method1384(local23[local46] - 512).anInt1299;
					if (local104 != 0) {
						this.anInt2636 = local104;
					}
				}
			}
		}
		@Pc(116) int[] local116 = new int[5];
		for (local65 = 0; local65 < 5; local65++) {
			local104 = arg0.method1281();
			if (local104 < 0 || local104 >= Static61.anIntArrayArray18[local65].length) {
				local104 = 0;
			}
			local116[local65] = local104;
		}
		super.anInt2895 = arg0.method1273();
		if (super.anInt2895 == 65535) {
			super.anInt2895 = -1;
		}
		super.anInt2883 = arg0.method1273();
		if (super.anInt2883 == 65535) {
			super.anInt2883 = -1;
		}
		super.anInt2906 = super.anInt2883;
		super.anInt2891 = arg0.method1273();
		if (super.anInt2891 == 65535) {
			super.anInt2891 = -1;
		}
		super.anInt2939 = arg0.method1273();
		if (super.anInt2939 == 65535) {
			super.anInt2939 = -1;
		}
		super.anInt2897 = arg0.method1273();
		if (super.anInt2897 == 65535) {
			super.anInt2897 = -1;
		}
		super.anInt2935 = arg0.method1273();
		if (super.anInt2935 == 65535) {
			super.anInt2935 = -1;
		}
		super.anInt2923 = arg0.method1273();
		if (super.anInt2923 == 65535) {
			super.anInt2923 = -1;
		}
		this.aClass39_1182 = Static24.method488(arg0.method1291()).method1120();
		this.anInt2628 = arg0.method1281();
		this.anInt2641 = arg0.method1273();
		if (this.aClass35_2 == null) {
			this.aClass35_2 = new Class35();
		}
		this.aClass35_2.method912(local20, local23, local116, local27 == 1);
	}

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "(I)Lclient!ga;")
	@Override
	protected Class2_Sub1_Sub2_Sub2 method2061() {
		if (this.aClass35_2 == null) {
			return null;
		}
		@Pc(25) Class2_Sub1_Sub1 local25 = super.anInt2901 != -1 && super.anInt2937 == 0 ? Static69.method1439(super.anInt2901) : null;
		@Pc(51) Class2_Sub1_Sub1 local51 = super.anInt2894 == -1 || this.aBoolean118 || super.anInt2894 == super.anInt2895 && local25 != null ? null : Static69.method1439(super.anInt2894);
		@Pc(62) Class2_Sub1_Sub2_Sub2 local62 = this.aClass35_2.method915(local25, super.anInt2885, local51, super.anInt2928);
		if (local62 == null) {
			return null;
		}
		local62.method697();
		super.anInt2911 = local62.anInt2876;
		if (!this.aBoolean118 && super.anInt2904 != -1 && super.anInt2912 != -1) {
			@Pc(93) Class2_Sub1_Sub2_Sub2 local93 = Static5.method79(super.anInt2904).method1433(super.anInt2912);
			if (local93 != null) {
				local93.method692(0, -super.anInt2934, 0);
				@Pc(113) Class2_Sub1_Sub2_Sub2[] local113 = new Class2_Sub1_Sub2_Sub2[] { local62, local93 };
				local62 = new Class2_Sub1_Sub2_Sub2(local113, 2, true);
			}
		}
		if (!this.aBoolean118 && this.aClass2_Sub1_Sub2_Sub2_3 != null) {
			if (Static64.anInt1889 >= this.anInt2618) {
				this.aClass2_Sub1_Sub2_Sub2_3 = null;
			}
			if (this.anInt2630 <= Static64.anInt1889 && Static64.anInt1889 < this.anInt2618) {
				@Pc(160) Class2_Sub1_Sub2_Sub2 local160 = this.aClass2_Sub1_Sub2_Sub2_3;
				@Pc(171) Class2_Sub1_Sub2_Sub2[] local171 = new Class2_Sub1_Sub2_Sub2[] { local62, local160 };
				local160.method692(this.anInt2619 - super.anInt2896, this.anInt2615 + -this.anInt2633, this.anInt2627 - super.anInt2899);
				if (super.anInt2887 == 512) {
					local160.method694();
					local160.method694();
					local160.method694();
				} else if (super.anInt2887 == 1024) {
					local160.method694();
					local160.method694();
				} else if (super.anInt2887 == 1536) {
					local160.method694();
				}
				local62 = new Class2_Sub1_Sub2_Sub2(local171, 2, true);
				if (super.anInt2887 == 512) {
					local160.method694();
				} else if (super.anInt2887 == 1024) {
					local160.method694();
					local160.method694();
				} else if (super.anInt2887 == 1536) {
					local160.method694();
					local160.method694();
					local160.method694();
				}
				local160.method692(super.anInt2896 - this.anInt2619, this.anInt2633 - this.anInt2615, super.anInt2899 - this.anInt2627);
			}
		}
		local62.aBoolean56 = true;
		return local62;
	}
}
