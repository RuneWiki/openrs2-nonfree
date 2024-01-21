import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class8_Sub1_Sub1_Sub4_Sub1 extends Class8_Sub1_Sub1_Sub4 {

	@OriginalMember(owner = "client!h", name = "Lc", descriptor = "I")
	public int anInt1264;

	@OriginalMember(owner = "client!h", name = "Rc", descriptor = "Lclient!ic;")
	public Class34 aClass34_638;

	@OriginalMember(owner = "client!h", name = "Yc", descriptor = "I")
	public int anInt1271;

	@OriginalMember(owner = "client!h", name = "cd", descriptor = "I")
	public int anInt1273;

	@OriginalMember(owner = "client!h", name = "gd", descriptor = "Lclient!nb;")
	public Class8_Sub1_Sub1_Sub6 aClass8_Sub1_Sub1_Sub6_1;

	@OriginalMember(owner = "client!h", name = "jd", descriptor = "I")
	public int anInt1278;

	@OriginalMember(owner = "client!h", name = "nd", descriptor = "Lclient!mf;")
	public Class52 aClass52_1;

	@OriginalMember(owner = "client!h", name = "rd", descriptor = "I")
	public int anInt1283;

	@OriginalMember(owner = "client!h", name = "td", descriptor = "I")
	public int anInt1285;

	@OriginalMember(owner = "client!h", name = "vd", descriptor = "I")
	public int anInt1287;

	@OriginalMember(owner = "client!h", name = "wd", descriptor = "I")
	public int anInt1288;

	@OriginalMember(owner = "client!h", name = "Mc", descriptor = "Z")
	public boolean aBoolean51 = false;

	@OriginalMember(owner = "client!h", name = "Uc", descriptor = "I")
	public int anInt1269 = 0;

	@OriginalMember(owner = "client!h", name = "Ic", descriptor = "I")
	public int anInt1263 = -1;

	@OriginalMember(owner = "client!h", name = "Wc", descriptor = "I")
	public int anInt1270 = 0;

	@OriginalMember(owner = "client!h", name = "Zc", descriptor = "I")
	public int anInt1272 = 0;

	@OriginalMember(owner = "client!h", name = "Oc", descriptor = "I")
	public int anInt1265 = 0;

	@OriginalMember(owner = "client!h", name = "fd", descriptor = "I")
	public int anInt1275 = 0;

	@OriginalMember(owner = "client!h", name = "xd", descriptor = "I")
	public int anInt1289 = -1;

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method1221() {
		return this.aClass52_1 != null;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!wd;I)V")
	public void method736(@OriginalArg(0) Class8_Sub20 arg0) {
		arg0.anInt2853 = 0;
		@Pc(16) int local16 = arg0.method1872();
		@Pc(18) int local18 = -1;
		this.anInt1289 = arg0.method1847();
		@Pc(26) int[] local26 = new int[12];
		this.anInt1263 = arg0.method1847();
		this.anInt1265 = 0;
		@Pc(54) int local54;
		@Pc(91) int local91;
		for (@Pc(36) int local36 = 0; local36 < 12; local36++) {
			@Pc(42) int local42 = arg0.method1872();
			if (local42 == 0) {
				local26[local36] = 0;
			} else {
				local54 = arg0.method1872();
				local26[local36] = (local42 << 8) + local54;
				if (local36 == 0 && local26[0] == 65535) {
					local18 = arg0.method1839();
					break;
				}
				if (local26[local36] >= 512) {
					local91 = Static7.method49(local26[local36] - 512).anInt1763;
					if (local91 != 0) {
						this.anInt1265 = local91;
					}
				}
			}
		}
		@Pc(106) int[] local106 = new int[5];
		for (local54 = 0; local54 < 5; local54++) {
			local91 = arg0.method1872();
			if (local91 < 0 || local91 >= Static47.aShortArrayArray4[local54].length) {
				local91 = 0;
			}
			local106[local54] = local91;
		}
		super.anInt2063 = arg0.method1839();
		if (super.anInt2063 == 65535) {
			super.anInt2063 = -1;
		}
		super.anInt2048 = arg0.method1839();
		if (super.anInt2048 == 65535) {
			super.anInt2048 = -1;
		}
		super.anInt2033 = super.anInt2048;
		super.anInt2054 = arg0.method1839();
		if (super.anInt2054 == 65535) {
			super.anInt2054 = -1;
		}
		super.anInt2031 = arg0.method1839();
		if (super.anInt2031 == 65535) {
			super.anInt2031 = -1;
		}
		super.anInt2056 = arg0.method1839();
		if (super.anInt2056 == 65535) {
			super.anInt2056 = -1;
		}
		super.anInt2016 = arg0.method1839();
		if (super.anInt2016 == 65535) {
			super.anInt2016 = -1;
		}
		super.anInt2034 = arg0.method1839();
		if (super.anInt2034 == 65535) {
			super.anInt2034 = -1;
		}
		this.aClass34_638 = Static83.method1229(arg0.method1864()).method842();
		this.anInt1275 = arg0.method1872();
		this.anInt1272 = arg0.method1839();
		if (this.aClass52_1 == null) {
			this.aClass52_1 = new Class52();
		}
		this.aClass52_1.method1196(local26, local106, local16 == 1, local18);
	}

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(B)Lclient!nb;")
	@Override
	public Class8_Sub1_Sub1_Sub6 method1955() {
		if (this.aClass52_1 == null) {
			return null;
		}
		@Pc(24) Class8_Sub1_Sub6 local24 = super.anInt2009 != -1 && super.anInt2027 == 0 ? Static47.method733(super.anInt2009) : null;
		@Pc(45) Class8_Sub1_Sub6 local45 = super.anInt2010 == -1 || this.aBoolean51 || super.anInt2063 == super.anInt2010 && local24 != null ? null : Static47.method733(super.anInt2010);
		@Pc(56) Class8_Sub1_Sub1_Sub6 local56 = this.aClass52_1.method1203(super.anInt2025, super.anInt2015, local24, local45);
		if (local56 == null) {
			return null;
		}
		local56.method1269();
		super.anInt2046 = local56.anInt2957;
		@Pc(94) Class8_Sub1_Sub1_Sub6 local94;
		@Pc(114) Class8_Sub1_Sub1_Sub6[] local114;
		if (!this.aBoolean51 && super.anInt2006 != -1 && super.anInt2050 != -1) {
			local94 = Static14.method235(super.anInt2006).method381(super.anInt2050);
			if (local94 != null) {
				local94.method1286(0, -super.anInt2013, 0);
				local114 = new Class8_Sub1_Sub1_Sub6[] { local56, local94 };
				local56 = new Class8_Sub1_Sub1_Sub6(local114, 2);
			}
		}
		if (!this.aBoolean51 && this.aClass8_Sub1_Sub1_Sub6_1 != null) {
			if (this.anInt1270 <= Static21.anInt655) {
				this.aClass8_Sub1_Sub1_Sub6_1 = null;
			}
			if (this.anInt1269 <= Static21.anInt655 && Static21.anInt655 < this.anInt1270) {
				local94 = this.aClass8_Sub1_Sub1_Sub6_1;
				local114 = new Class8_Sub1_Sub1_Sub6[] { local56, local94 };
				local94.method1286(this.anInt1283 - super.anInt2043, -this.anInt1287 + this.anInt1288, this.anInt1278 - super.anInt2059);
				if (super.anInt2022 == 512) {
					local94.method1281();
					local94.method1281();
					local94.method1281();
				} else if (super.anInt2022 == 1024) {
					local94.method1281();
					local94.method1281();
				} else if (super.anInt2022 == 1536) {
					local94.method1281();
				}
				local56 = new Class8_Sub1_Sub1_Sub6(local114, 2);
				if (super.anInt2022 == 512) {
					local94.method1281();
				} else if (super.anInt2022 == 1024) {
					local94.method1281();
					local94.method1281();
				} else if (super.anInt2022 == 1536) {
					local94.method1281();
					local94.method1281();
					local94.method1281();
				}
				local94.method1286(super.anInt2043 - this.anInt1283, -this.anInt1288 + this.anInt1287, super.anInt2059 - this.anInt1278);
			}
		}
		local56.aBoolean81 = true;
		return local56;
	}
}
