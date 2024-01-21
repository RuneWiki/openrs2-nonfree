import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class5_Sub2_Sub2_Sub3_Sub2 extends Class5_Sub2_Sub2_Sub3 {

	@OriginalMember(owner = "client!t", name = "wc", descriptor = "Lclient!ie;")
	public Class37 aClass37_2;

	@OriginalMember(owner = "client!t", name = "zc", descriptor = "Lclient!r;")
	public Class61 aClass61_877;

	@OriginalMember(owner = "client!t", name = "Ac", descriptor = "I")
	public int anInt2935;

	@OriginalMember(owner = "client!t", name = "Bc", descriptor = "I")
	public int anInt2936;

	@OriginalMember(owner = "client!t", name = "Ec", descriptor = "I")
	public int anInt2939;

	@OriginalMember(owner = "client!t", name = "Lc", descriptor = "I")
	public int anInt2946;

	@OriginalMember(owner = "client!t", name = "Nc", descriptor = "I")
	public int anInt2948;

	@OriginalMember(owner = "client!t", name = "Qc", descriptor = "Lclient!wb;")
	public Class5_Sub2_Sub2_Sub6 aClass5_Sub2_Sub2_Sub6_1;

	@OriginalMember(owner = "client!t", name = "Sc", descriptor = "I")
	public int anInt2951;

	@OriginalMember(owner = "client!t", name = "Uc", descriptor = "I")
	public int anInt2952;

	@OriginalMember(owner = "client!t", name = "Xc", descriptor = "I")
	public int anInt2953;

	@OriginalMember(owner = "client!t", name = "Dc", descriptor = "I")
	public int anInt2938 = 0;

	@OriginalMember(owner = "client!t", name = "yc", descriptor = "I")
	public int anInt2934 = 0;

	@OriginalMember(owner = "client!t", name = "Fc", descriptor = "I")
	public int anInt2940 = 0;

	@OriginalMember(owner = "client!t", name = "Hc", descriptor = "I")
	public int anInt2942 = 0;

	@OriginalMember(owner = "client!t", name = "Mc", descriptor = "I")
	public int anInt2947 = -1;

	@OriginalMember(owner = "client!t", name = "Ic", descriptor = "I")
	public int anInt2943 = 0;

	@OriginalMember(owner = "client!t", name = "Tc", descriptor = "Z")
	public boolean aBoolean102 = false;

	@OriginalMember(owner = "client!t", name = "Pc", descriptor = "I")
	public int anInt2949 = -1;

	@OriginalMember(owner = "client!t", name = "e", descriptor = "(I)Lclient!wb;")
	@Override
	public Class5_Sub2_Sub2_Sub6 method2178() {
		if (this.aClass37_2 == null) {
			return null;
		}
		@Pc(27) Class5_Sub2_Sub17 local27 = super.anInt2903 != -1 && super.anInt2904 == 0 ? Static106.method1769(super.anInt2903) : null;
		@Pc(49) Class5_Sub2_Sub17 local49 = super.anInt2916 == -1 || this.aBoolean102 || super.anInt2916 == super.anInt2917 && local27 != null ? null : Static106.method1769(super.anInt2916);
		@Pc(60) Class5_Sub2_Sub2_Sub6 local60 = this.aClass37_2.method997(super.anInt2882, local27, super.anInt2880, local49);
		if (local60 == null) {
			return null;
		}
		local60.method2141();
		super.anInt2910 = local60.anInt3358;
		@Pc(90) Class5_Sub2_Sub2_Sub6 local90;
		@Pc(110) Class5_Sub2_Sub2_Sub6[] local110;
		if (!this.aBoolean102 && super.anInt2893 != -1 && super.anInt2932 != -1) {
			local90 = Static1.method2(super.anInt2893).method850(super.anInt2932);
			if (local90 != null) {
				local90.method2159(0, -super.anInt2921, 0);
				local110 = new Class5_Sub2_Sub2_Sub6[] { local60, local90 };
				local60 = new Class5_Sub2_Sub2_Sub6(local110, 2);
			}
		}
		if (!this.aBoolean102 && this.aClass5_Sub2_Sub2_Sub6_1 != null) {
			if (this.anInt2940 <= Static58.anInt1422) {
				this.aClass5_Sub2_Sub2_Sub6_1 = null;
			}
			if (Static58.anInt1422 >= this.anInt2942 && this.anInt2940 > Static58.anInt1422) {
				local90 = this.aClass5_Sub2_Sub2_Sub6_1;
				local90.method2159(this.anInt2936 - super.anInt2912, this.anInt2952 + -this.anInt2948, this.anInt2946 - super.anInt2875);
				local110 = new Class5_Sub2_Sub2_Sub6[] { local60, local90 };
				if (super.anInt2909 == 512) {
					local90.method2140();
					local90.method2140();
					local90.method2140();
				} else if (super.anInt2909 == 1024) {
					local90.method2140();
					local90.method2140();
				} else if (super.anInt2909 == 1536) {
					local90.method2140();
				}
				local60 = new Class5_Sub2_Sub2_Sub6(local110, 2);
				if (super.anInt2909 == 512) {
					local90.method2140();
				} else if (super.anInt2909 == 1024) {
					local90.method2140();
					local90.method2140();
				} else if (super.anInt2909 == 1536) {
					local90.method2140();
					local90.method2140();
					local90.method2140();
				}
				local90.method2159(super.anInt2912 - this.anInt2936, this.anInt2948 + -this.anInt2952, super.anInt2875 - this.anInt2946);
			}
		}
		local60.aBoolean120 = true;
		return local60;
	}

	@OriginalMember(owner = "client!t", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method1855() {
		return this.aClass37_2 != null;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ILclient!pa;)V")
	public void method1866(@OriginalArg(1) Class5_Sub14 arg0) {
		arg0.anInt2199 = 0;
		@Pc(12) int local12 = arg0.method1471();
		this.anInt2947 = arg0.method1447();
		this.anInt2949 = arg0.method1447();
		@Pc(25) int[] local25 = new int[12];
		@Pc(27) int local27 = -1;
		this.anInt2938 = 0;
		@Pc(53) int local53;
		@Pc(93) int local93;
		for (@Pc(32) int local32 = 0; local32 < 12; local32++) {
			@Pc(38) int local38 = arg0.method1471();
			if (local38 == 0) {
				local25[local32] = 0;
			} else {
				local53 = arg0.method1471();
				local25[local32] = (local38 << 8) + local53;
				if (local32 == 0 && local25[0] == 65535) {
					local27 = arg0.method1478();
					break;
				}
				if (local25[local32] >= 512) {
					local93 = Static111.method1830(local25[local32] - 512).anInt1984;
					if (local93 != 0) {
						this.anInt2938 = local93;
					}
				}
			}
		}
		@Pc(107) int[] local107 = new int[5];
		for (local53 = 0; local53 < 5; local53++) {
			local93 = arg0.method1471();
			if (local93 < 0 || local93 >= Static116.aShortArrayArray6[local53].length) {
				local93 = 0;
			}
			local107[local53] = local93;
		}
		super.anInt2917 = arg0.method1478();
		if (super.anInt2917 == 65535) {
			super.anInt2917 = -1;
		}
		super.anInt2877 = arg0.method1478();
		if (super.anInt2877 == 65535) {
			super.anInt2877 = -1;
		}
		super.anInt2878 = super.anInt2877;
		super.anInt2915 = arg0.method1478();
		if (super.anInt2915 == 65535) {
			super.anInt2915 = -1;
		}
		super.anInt2914 = arg0.method1478();
		if (super.anInt2914 == 65535) {
			super.anInt2914 = -1;
		}
		super.anInt2913 = arg0.method1478();
		if (super.anInt2913 == 65535) {
			super.anInt2913 = -1;
		}
		super.anInt2918 = arg0.method1478();
		if (super.anInt2918 == 65535) {
			super.anInt2918 = -1;
		}
		super.anInt2906 = arg0.method1478();
		if (super.anInt2906 == 65535) {
			super.anInt2906 = -1;
		}
		this.aClass61_877 = Static111.method1831(arg0.method1432()).method1701();
		this.anInt2934 = arg0.method1471();
		this.anInt2943 = arg0.method1478();
		if (this.aClass37_2 == null) {
			this.aClass37_2 = new Class37();
		}
		this.aClass37_2.method999(local25, local107, local27, local12 == 1);
	}
}
