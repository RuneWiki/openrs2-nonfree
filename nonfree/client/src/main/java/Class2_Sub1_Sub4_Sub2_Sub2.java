import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class2_Sub1_Sub4_Sub2_Sub2 extends Class2_Sub1_Sub4_Sub2 {

	@OriginalMember(owner = "client!qc", name = "Sc", descriptor = "I")
	public int anInt2211;

	@OriginalMember(owner = "client!qc", name = "Uc", descriptor = "I")
	public int anInt2213;

	@OriginalMember(owner = "client!qc", name = "Vc", descriptor = "I")
	public int anInt2214;

	@OriginalMember(owner = "client!qc", name = "Wc", descriptor = "Lclient!fd;")
	public Class2_Sub1_Sub4_Sub1 aClass2_Sub1_Sub4_Sub1_3;

	@OriginalMember(owner = "client!qc", name = "cd", descriptor = "I")
	public int anInt2220;

	@OriginalMember(owner = "client!qc", name = "id", descriptor = "I")
	public int anInt2224;

	@OriginalMember(owner = "client!qc", name = "nd", descriptor = "I")
	public int anInt2228;

	@OriginalMember(owner = "client!qc", name = "pd", descriptor = "Lclient!kc;")
	public Class36 aClass36_1027;

	@OriginalMember(owner = "client!qc", name = "td", descriptor = "I")
	public int anInt2230;

	@OriginalMember(owner = "client!qc", name = "ud", descriptor = "Lclient!vc;")
	public Class67 aClass67_2;

	@OriginalMember(owner = "client!qc", name = "wd", descriptor = "I")
	public int anInt2231;

	@OriginalMember(owner = "client!qc", name = "Pc", descriptor = "I")
	public int anInt2208 = 0;

	@OriginalMember(owner = "client!qc", name = "Qc", descriptor = "I")
	public int anInt2209 = 0;

	@OriginalMember(owner = "client!qc", name = "gd", descriptor = "I")
	public int anInt2222 = 0;

	@OriginalMember(owner = "client!qc", name = "Zc", descriptor = "I")
	public int anInt2217 = 0;

	@OriginalMember(owner = "client!qc", name = "fd", descriptor = "I")
	public int anInt2221 = -1;

	@OriginalMember(owner = "client!qc", name = "ld", descriptor = "I")
	public int anInt2226 = 0;

	@OriginalMember(owner = "client!qc", name = "od", descriptor = "Z")
	public boolean aBoolean89 = false;

	@OriginalMember(owner = "client!qc", name = "jd", descriptor = "I")
	public int anInt2225 = -1;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!wd;I)V")
	public void method1555(@OriginalArg(0) Class2_Sub12 arg0) {
		arg0.anInt1939 = 0;
		@Pc(10) int local10 = -1;
		@Pc(14) int local14 = arg0.method1399();
		@Pc(17) int[] local17 = new int[12];
		this.anInt2221 = arg0.method1406();
		this.anInt2225 = arg0.method1406();
		this.anInt2208 = 0;
		@Pc(50) int local50;
		@Pc(87) int local87;
		for (@Pc(32) int local32 = 0; local32 < 12; local32++) {
			@Pc(38) int local38 = arg0.method1399();
			if (local38 == 0) {
				local17[local32] = 0;
			} else {
				local50 = arg0.method1399();
				local17[local32] = local50 + (local38 << 8);
				if (local32 == 0 && local17[0] == 65535) {
					local10 = arg0.method1366();
					break;
				}
				if (local17[local32] >= 512) {
					local87 = Static43.method832(local17[local32] - 512).anInt2817;
					if (local87 != 0) {
						this.anInt2208 = local87;
					}
				}
			}
		}
		@Pc(99) int[] local99 = new int[5];
		for (local50 = 0; local50 < 5; local50++) {
			local87 = arg0.method1399();
			if (local87 < 0 || local87 >= Static63.anIntArrayArray19[local50].length) {
				local87 = 0;
			}
			local99[local50] = local87;
		}
		super.anInt2200 = arg0.method1366();
		if (super.anInt2200 == 65535) {
			super.anInt2200 = -1;
		}
		super.anInt2171 = arg0.method1366();
		if (super.anInt2171 == 65535) {
			super.anInt2171 = -1;
		}
		super.anInt2155 = super.anInt2171;
		super.anInt2185 = arg0.method1366();
		if (super.anInt2185 == 65535) {
			super.anInt2185 = -1;
		}
		super.anInt2161 = arg0.method1366();
		if (super.anInt2161 == 65535) {
			super.anInt2161 = -1;
		}
		super.anInt2179 = arg0.method1366();
		if (super.anInt2179 == 65535) {
			super.anInt2179 = -1;
		}
		super.anInt2172 = arg0.method1366();
		if (super.anInt2172 == 65535) {
			super.anInt2172 = -1;
		}
		super.anInt2154 = arg0.method1366();
		if (super.anInt2154 == 65535) {
			super.anInt2154 = -1;
		}
		this.aClass36_1027 = Static114.method2077(arg0.method1389()).method1017();
		this.anInt2222 = arg0.method1399();
		this.anInt2209 = arg0.method1366();
		if (this.aClass67_2 == null) {
			this.aClass67_2 = new Class67();
		}
		this.aClass67_2.method1996(local10, local14 == 1, local17, local99);
	}

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method1554() {
		return this.aClass67_2 != null;
	}

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "(B)Lclient!fd;")
	@Override
	public Class2_Sub1_Sub4_Sub1 method2031() {
		if (this.aClass67_2 == null) {
			return null;
		}
		@Pc(27) Class2_Sub1_Sub14 local27 = super.anInt2168 != -1 && super.anInt2162 == 0 ? Static56.method1045(super.anInt2168) : null;
		@Pc(54) Class2_Sub1_Sub14 local54 = super.anInt2181 == -1 || this.aBoolean89 || super.anInt2200 == super.anInt2181 && local27 != null ? null : Static56.method1045(super.anInt2181);
		@Pc(65) Class2_Sub1_Sub4_Sub1 local65 = this.aClass67_2.method1997(local27, local54, super.anInt2147, super.anInt2174);
		if (local65 == null) {
			return null;
		}
		local65.method662();
		super.anInt2166 = local65.anInt2916;
		@Pc(96) Class2_Sub1_Sub4_Sub1 local96;
		@Pc(116) Class2_Sub1_Sub4_Sub1[] local116;
		if (!this.aBoolean89 && super.anInt2152 != -1 && super.anInt2151 != -1) {
			local96 = Static99.method1476(super.anInt2152).method1152(super.anInt2151);
			if (local96 != null) {
				local96.method677(0, -super.anInt2178, 0);
				local116 = new Class2_Sub1_Sub4_Sub1[] { local65, local96 };
				local65 = new Class2_Sub1_Sub4_Sub1(local116, 2, true);
			}
		}
		if (!this.aBoolean89 && this.aClass2_Sub1_Sub4_Sub1_3 != null) {
			if (this.anInt2226 <= Static113.anInt2952) {
				this.aClass2_Sub1_Sub4_Sub1_3 = null;
			}
			if (this.anInt2217 <= Static113.anInt2952 && this.anInt2226 > Static113.anInt2952) {
				local96 = this.aClass2_Sub1_Sub4_Sub1_3;
				local116 = new Class2_Sub1_Sub4_Sub1[] { local65, local96 };
				local96.method677(this.anInt2230 - super.anInt2204, -this.anInt2214 + this.anInt2224, this.anInt2220 - super.anInt2149);
				if (super.anInt2170 == 512) {
					local96.method684();
					local96.method684();
					local96.method684();
				} else if (super.anInt2170 == 1024) {
					local96.method684();
					local96.method684();
				} else if (super.anInt2170 == 1536) {
					local96.method684();
				}
				local65 = new Class2_Sub1_Sub4_Sub1(local116, 2, true);
				if (super.anInt2170 == 512) {
					local96.method684();
				} else if (super.anInt2170 == 1024) {
					local96.method684();
					local96.method684();
				} else if (super.anInt2170 == 1536) {
					local96.method684();
					local96.method684();
					local96.method684();
				}
				local96.method677(super.anInt2204 - this.anInt2230, this.anInt2214 + -this.anInt2224, super.anInt2149 - this.anInt2220);
			}
		}
		local65.aBoolean45 = true;
		return local65;
	}
}
