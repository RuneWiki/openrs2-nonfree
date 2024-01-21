import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class2_Sub1_Sub4_Sub6_Sub1 extends Class2_Sub1_Sub4_Sub6 {

	@OriginalMember(owner = "client!k", name = "Ic", descriptor = "I")
	public int anInt1713;

	@OriginalMember(owner = "client!k", name = "Kc", descriptor = "I")
	public int anInt1714;

	@OriginalMember(owner = "client!k", name = "Mc", descriptor = "I")
	public int anInt1715;

	@OriginalMember(owner = "client!k", name = "Rc", descriptor = "I")
	public int anInt1719;

	@OriginalMember(owner = "client!k", name = "Tc", descriptor = "I")
	public int anInt1721;

	@OriginalMember(owner = "client!k", name = "Uc", descriptor = "Lclient!lc;")
	public Class31 aClass31_612;

	@OriginalMember(owner = "client!k", name = "Wc", descriptor = "Lclient!ac;")
	public Class4 aClass4_3;

	@OriginalMember(owner = "client!k", name = "Yc", descriptor = "I")
	public int anInt1724;

	@OriginalMember(owner = "client!k", name = "dd", descriptor = "I")
	public int anInt1728;

	@OriginalMember(owner = "client!k", name = "ed", descriptor = "Lclient!hb;")
	public Class2_Sub1_Sub4_Sub5 aClass2_Sub1_Sub4_Sub5_3;

	@OriginalMember(owner = "client!k", name = "fd", descriptor = "I")
	public int anInt1729;

	@OriginalMember(owner = "client!k", name = "Hc", descriptor = "I")
	public int anInt1712 = -1;

	@OriginalMember(owner = "client!k", name = "Lc", descriptor = "Z")
	public boolean aBoolean88 = false;

	@OriginalMember(owner = "client!k", name = "Xc", descriptor = "I")
	public int anInt1723 = -1;

	@OriginalMember(owner = "client!k", name = "id", descriptor = "I")
	public int anInt1732 = 0;

	@OriginalMember(owner = "client!k", name = "Sc", descriptor = "I")
	public int anInt1720 = 0;

	@OriginalMember(owner = "client!k", name = "ad", descriptor = "I")
	public int anInt1726 = 0;

	@OriginalMember(owner = "client!k", name = "bd", descriptor = "I")
	public int anInt1727 = 0;

	@OriginalMember(owner = "client!k", name = "hd", descriptor = "I")
	public int anInt1731 = 0;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ILclient!pd;)V")
	public void method1106(@OriginalArg(1) Class2_Sub6 arg0) {
		arg0.anInt952 = 0;
		@Pc(10) int local10 = -1;
		@Pc(14) int local14 = arg0.method665();
		this.anInt1712 = arg0.method673();
		@Pc(22) int[] local22 = new int[12];
		this.anInt1723 = arg0.method673();
		this.anInt1726 = 0;
		@Pc(50) int local50;
		@Pc(87) int local87;
		for (@Pc(32) int local32 = 0; local32 < 12; local32++) {
			@Pc(38) int local38 = arg0.method665();
			if (local38 == 0) {
				local22[local32] = 0;
			} else {
				local50 = arg0.method665();
				local22[local32] = (local38 << 8) + local50;
				if (local32 == 0 && local22[0] == 65535) {
					local10 = arg0.method627();
					break;
				}
				if (local22[local32] >= 512) {
					local87 = Static7.method178(local22[local32] - 512).anInt2476;
					if (local87 != 0) {
						this.anInt1726 = local87;
					}
				}
			}
		}
		@Pc(102) int[] local102 = new int[5];
		for (local50 = 0; local50 < 5; local50++) {
			local87 = arg0.method665();
			if (local87 < 0 || local87 >= Static57.anIntArrayArray68[local50].length) {
				local87 = 0;
			}
			local102[local50] = local87;
		}
		super.anInt2007 = arg0.method627();
		if (super.anInt2007 == 65535) {
			super.anInt2007 = -1;
		}
		super.anInt2001 = arg0.method627();
		if (super.anInt2001 == 65535) {
			super.anInt2001 = -1;
		}
		super.anInt2003 = arg0.method627();
		if (super.anInt2003 == 65535) {
			super.anInt2003 = -1;
		}
		super.anInt2022 = arg0.method627();
		if (super.anInt2022 == 65535) {
			super.anInt2022 = -1;
		}
		super.anInt2039 = arg0.method627();
		if (super.anInt2039 == 65535) {
			super.anInt2039 = -1;
		}
		super.anInt1984 = arg0.method627();
		if (super.anInt1984 == 65535) {
			super.anInt1984 = -1;
		}
		super.anInt2025 = arg0.method627();
		if (super.anInt2025 == 65535) {
			super.anInt2025 = -1;
		}
		this.aClass31_612 = Static39.method1010(arg0.method674()).method1196();
		this.anInt1732 = arg0.method665();
		this.anInt1727 = arg0.method627();
		if (this.aClass4_3 == null) {
			this.aClass4_3 = new Class4();
		}
		this.aClass4_3.method92(local102, local10, local22, local14 == 1);
	}

	@OriginalMember(owner = "client!k", name = "e", descriptor = "(Z)Z")
	@Override
	public boolean method1270() {
		return this.aClass4_3 != null;
	}

	@OriginalMember(owner = "client!k", name = "d", descriptor = "(Z)Lclient!hb;")
	@Override
	protected Class2_Sub1_Sub4_Sub5 method1264() {
		if (this.aClass4_3 == null) {
			return null;
		}
		@Pc(28) Class2_Sub1_Sub10 local28 = super.anInt2014 != -1 && super.anInt1986 == 0 ? Static54.method1158(super.anInt2014) : null;
		@Pc(50) Class2_Sub1_Sub10 local50 = super.anInt1988 == -1 || this.aBoolean88 || super.anInt2007 == super.anInt1988 && local28 != null ? null : Static54.method1158(super.anInt1988);
		@Pc(61) Class2_Sub1_Sub4_Sub5 local61 = this.aClass4_3.method96(super.anInt1987, local50, local28, super.anInt2005);
		if (local61 == null) {
			return null;
		}
		local61.method920();
		super.anInt2028 = local61.anInt1974;
		@Pc(93) Class2_Sub1_Sub4_Sub5 local93;
		@Pc(106) Class2_Sub1_Sub4_Sub5[] local106;
		if (!this.aBoolean88 && super.anInt1995 != -1 && super.anInt1983 != -1) {
			local93 = Static75.method1409(super.anInt1995).method1600(super.anInt1983);
			if (local93 != null) {
				local106 = new Class2_Sub1_Sub4_Sub5[] { local61, local93 };
				local93.method922(0, -super.anInt2033, 0);
				local61 = new Class2_Sub1_Sub4_Sub5(local106, 2, true);
			}
		}
		if (!this.aBoolean88 && this.aClass2_Sub1_Sub4_Sub5_3 != null) {
			if (this.anInt1720 <= Static49.anInt2694) {
				this.aClass2_Sub1_Sub4_Sub5_3 = null;
			}
			if (this.anInt1731 <= Static49.anInt2694 && this.anInt1720 > Static49.anInt2694) {
				local93 = this.aClass2_Sub1_Sub4_Sub5_3;
				local93.method922(this.anInt1728 - super.anInt2006, this.anInt1719 + -this.anInt1714, this.anInt1724 - super.anInt2011);
				if (super.anInt2023 == 512) {
					local93.method901();
					local93.method901();
					local93.method901();
				} else if (super.anInt2023 == 1024) {
					local93.method901();
					local93.method901();
				} else if (super.anInt2023 == 1536) {
					local93.method901();
				}
				local106 = new Class2_Sub1_Sub4_Sub5[] { local61, local93 };
				local61 = new Class2_Sub1_Sub4_Sub5(local106, 2, true);
				if (super.anInt2023 == 512) {
					local93.method901();
				} else if (super.anInt2023 == 1024) {
					local93.method901();
					local93.method901();
				} else if (super.anInt2023 == 1536) {
					local93.method901();
					local93.method901();
					local93.method901();
				}
				local93.method922(super.anInt2006 - this.anInt1728, this.anInt1714 + -this.anInt1719, super.anInt2011 - this.anInt1724);
			}
		}
		local61.aBoolean74 = true;
		return local61;
	}
}
