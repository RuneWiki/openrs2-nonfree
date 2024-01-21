import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class2_Sub1_Sub1_Sub4_Sub1 extends Class2_Sub1_Sub1_Sub4 {

	@OriginalMember(owner = "client!ha", name = "zc", descriptor = "Lclient!bf;")
	public Class9 aClass9_2;

	@OriginalMember(owner = "client!ha", name = "Fc", descriptor = "Lclient!wb;")
	public Class2_Sub1_Sub1_Sub7 aClass2_Sub1_Sub1_Sub7_1;

	@OriginalMember(owner = "client!ha", name = "Hc", descriptor = "I")
	public int anInt1015;

	@OriginalMember(owner = "client!ha", name = "Jc", descriptor = "I")
	public int anInt1017;

	@OriginalMember(owner = "client!ha", name = "Qc", descriptor = "I")
	public int anInt1021;

	@OriginalMember(owner = "client!ha", name = "Xc", descriptor = "I")
	public int anInt1025;

	@OriginalMember(owner = "client!ha", name = "Zc", descriptor = "Lclient!pe;")
	public Class65 aClass65_457;

	@OriginalMember(owner = "client!ha", name = "cd", descriptor = "I")
	public int anInt1028;

	@OriginalMember(owner = "client!ha", name = "gd", descriptor = "I")
	public int anInt1032;

	@OriginalMember(owner = "client!ha", name = "hd", descriptor = "I")
	public int anInt1033;

	@OriginalMember(owner = "client!ha", name = "id", descriptor = "I")
	public int anInt1034;

	@OriginalMember(owner = "client!ha", name = "Vc", descriptor = "I")
	public int anInt1024 = 0;

	@OriginalMember(owner = "client!ha", name = "Pc", descriptor = "I")
	public int anInt1020 = -1;

	@OriginalMember(owner = "client!ha", name = "Sc", descriptor = "I")
	public int anInt1023 = 0;

	@OriginalMember(owner = "client!ha", name = "bd", descriptor = "I")
	public int anInt1027 = -1;

	@OriginalMember(owner = "client!ha", name = "dd", descriptor = "I")
	public int anInt1029 = 0;

	@OriginalMember(owner = "client!ha", name = "Wc", descriptor = "Z")
	public boolean aBoolean42 = false;

	@OriginalMember(owner = "client!ha", name = "fd", descriptor = "I")
	public int anInt1031 = 0;

	@OriginalMember(owner = "client!ha", name = "Lc", descriptor = "I")
	public int anInt1018 = 0;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method1466() {
		return this.aClass9_2 != null;
	}

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(I)Lclient!wb;")
	@Override
	public Class2_Sub1_Sub1_Sub7 method1996() {
		if (this.aClass9_2 == null) {
			return null;
		}
		@Pc(34) Class2_Sub1_Sub2 local34 = super.anInt1972 != -1 && super.anInt1936 == 0 ? Static23.method1313(super.anInt1972) : null;
		@Pc(59) Class2_Sub1_Sub2 local59 = super.anInt1920 == -1 || this.aBoolean42 || super.anInt1964 == super.anInt1920 && local34 != null ? null : Static23.method1313(super.anInt1920);
		@Pc(70) Class2_Sub1_Sub1_Sub7 local70 = this.aClass9_2.method239(super.anInt1970, super.anInt1926, local59, local34);
		if (local70 == null) {
			return null;
		}
		local70.method2006();
		super.anInt1942 = local70.anInt2855;
		@Pc(100) Class2_Sub1_Sub1_Sub7 local100;
		@Pc(120) Class2_Sub1_Sub1_Sub7[] local120;
		if (!this.aBoolean42 && super.anInt1975 != -1 && super.anInt1924 != -1) {
			local100 = Static69.method1228(super.anInt1975).method1224(super.anInt1924);
			if (local100 != null) {
				local100.method1998(0, -super.anInt1921, 0);
				local120 = new Class2_Sub1_Sub1_Sub7[] { local70, local100 };
				local70 = new Class2_Sub1_Sub1_Sub7(local120, 2);
			}
		}
		if (!this.aBoolean42 && this.aClass2_Sub1_Sub1_Sub7_1 != null) {
			if (this.anInt1029 <= Static10.anInt2951) {
				this.aClass2_Sub1_Sub1_Sub7_1 = null;
			}
			if (this.anInt1023 <= Static10.anInt2951 && this.anInt1029 > Static10.anInt2951) {
				local100 = this.aClass2_Sub1_Sub1_Sub7_1;
				local100.method1998(this.anInt1034 - super.anInt1948, -this.anInt1028 + this.anInt1025, this.anInt1017 - super.anInt1958);
				if (super.anInt1962 == 512) {
					local100.method2008();
					local100.method2008();
					local100.method2008();
				} else if (super.anInt1962 == 1024) {
					local100.method2008();
					local100.method2008();
				} else if (super.anInt1962 == 1536) {
					local100.method2008();
				}
				local120 = new Class2_Sub1_Sub1_Sub7[] { local70, local100 };
				local70 = new Class2_Sub1_Sub1_Sub7(local120, 2);
				if (super.anInt1962 == 512) {
					local100.method2008();
				} else if (super.anInt1962 == 1024) {
					local100.method2008();
					local100.method2008();
				} else if (super.anInt1962 == 1536) {
					local100.method2008();
					local100.method2008();
					local100.method2008();
				}
				local100.method1998(super.anInt1948 - this.anInt1034, this.anInt1028 - this.anInt1025, super.anInt1958 - this.anInt1017);
			}
		}
		local70.aBoolean130 = true;
		return local70;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(BLclient!be;)V")
	public void method731(@OriginalArg(1) Class2_Sub4 arg0) {
		arg0.anInt1298 = 0;
		@Pc(10) int local10 = arg0.method933();
		@Pc(12) int local12 = -1;
		this.anInt1027 = arg0.method922();
		this.anInt1020 = arg0.method922();
		this.anInt1031 = 0;
		@Pc(28) int[] local28 = new int[12];
		@Pc(46) int local46;
		@Pc(86) int local86;
		for (@Pc(30) int local30 = 0; local30 < 12; local30++) {
			@Pc(35) int local35 = arg0.method933();
			if (local35 == 0) {
				local28[local30] = 0;
			} else {
				local46 = arg0.method933();
				local28[local30] = local46 + (local35 << 8);
				if (local30 == 0 && local28[0] == 65535) {
					local12 = arg0.method896();
					break;
				}
				if (local28[local30] >= 512) {
					local86 = Static4.method872(local28[local30] - 512).anInt2092;
					if (local86 != 0) {
						this.anInt1031 = local86;
					}
				}
			}
		}
		@Pc(103) int[] local103 = new int[5];
		for (local46 = 0; local46 < 5; local46++) {
			local86 = arg0.method933();
			if (local86 < 0 || local86 >= Static108.aShortArrayArray5[local46].length) {
				local86 = 0;
			}
			local103[local46] = local86;
		}
		super.anInt1964 = arg0.method896();
		if (super.anInt1964 == 65535) {
			super.anInt1964 = -1;
		}
		super.anInt1917 = arg0.method896();
		if (super.anInt1917 == 65535) {
			super.anInt1917 = -1;
		}
		super.anInt1931 = super.anInt1917;
		super.anInt1959 = arg0.method896();
		if (super.anInt1959 == 65535) {
			super.anInt1959 = -1;
		}
		super.anInt1923 = arg0.method896();
		if (super.anInt1923 == 65535) {
			super.anInt1923 = -1;
		}
		super.anInt1960 = arg0.method896();
		if (super.anInt1960 == 65535) {
			super.anInt1960 = -1;
		}
		super.anInt1932 = arg0.method896();
		if (super.anInt1932 == 65535) {
			super.anInt1932 = -1;
		}
		super.anInt1945 = arg0.method896();
		if (super.anInt1945 == 65535) {
			super.anInt1945 = -1;
		}
		this.aClass65_457 = Static57.method1080(arg0.method907()).method1506();
		this.anInt1024 = arg0.method933();
		this.anInt1018 = arg0.method896();
		if (this.aClass9_2 == null) {
			this.aClass9_2 = new Class9();
		}
		this.aClass9_2.method243(local103, local12, local28, local10 == 1);
	}
}
