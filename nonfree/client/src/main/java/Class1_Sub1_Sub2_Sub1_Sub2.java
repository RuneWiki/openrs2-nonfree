import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class1_Sub1_Sub2_Sub1_Sub2 extends Class1_Sub1_Sub2_Sub1 {

	@OriginalMember(owner = "client!qa", name = "ad", descriptor = "I")
	public int anInt2235;

	@OriginalMember(owner = "client!qa", name = "cd", descriptor = "I")
	public int anInt2237;

	@OriginalMember(owner = "client!qa", name = "ed", descriptor = "Lclient!gd;")
	public Class23 aClass23_1260;

	@OriginalMember(owner = "client!qa", name = "gd", descriptor = "I")
	public int anInt2240;

	@OriginalMember(owner = "client!qa", name = "jd", descriptor = "I")
	public int anInt2243;

	@OriginalMember(owner = "client!qa", name = "ld", descriptor = "Lclient!sd;")
	public Class58 aClass58_2;

	@OriginalMember(owner = "client!qa", name = "nd", descriptor = "I")
	public int anInt2246;

	@OriginalMember(owner = "client!qa", name = "qd", descriptor = "I")
	public int anInt2249;

	@OriginalMember(owner = "client!qa", name = "Cd", descriptor = "I")
	public int anInt2257;

	@OriginalMember(owner = "client!qa", name = "Dd", descriptor = "Lclient!qb;")
	public Class1_Sub1_Sub2_Sub6 aClass1_Sub1_Sub2_Sub6_1;

	@OriginalMember(owner = "client!qa", name = "Fd", descriptor = "I")
	public int anInt2259;

	@OriginalMember(owner = "client!qa", name = "od", descriptor = "I")
	public int anInt2247 = 0;

	@OriginalMember(owner = "client!qa", name = "td", descriptor = "I")
	public int anInt2252 = 0;

	@OriginalMember(owner = "client!qa", name = "Yc", descriptor = "I")
	public int anInt2233 = 0;

	@OriginalMember(owner = "client!qa", name = "hd", descriptor = "I")
	public int anInt2241 = -1;

	@OriginalMember(owner = "client!qa", name = "kd", descriptor = "I")
	public int anInt2244 = 0;

	@OriginalMember(owner = "client!qa", name = "Bd", descriptor = "I")
	public int anInt2256 = -1;

	@OriginalMember(owner = "client!qa", name = "id", descriptor = "I")
	public int anInt2242 = 0;

	@OriginalMember(owner = "client!qa", name = "zd", descriptor = "Z")
	public boolean aBoolean105 = false;

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method1387() {
		return this.aClass58_2 != null;
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(B)Lclient!qb;")
	@Override
	public Class1_Sub1_Sub2_Sub6 method1415() {
		if (this.aClass58_2 == null) {
			return null;
		}
		@Pc(22) Class1_Sub1_Sub8 local22 = super.anInt2213 != -1 && super.anInt2205 == 0 ? Static18.method249(super.anInt2213) : null;
		@Pc(48) Class1_Sub1_Sub8 local48 = super.anInt2184 == -1 || this.aBoolean105 || super.anInt2225 == super.anInt2184 && local22 != null ? null : Static18.method249(super.anInt2184);
		@Pc(59) Class1_Sub1_Sub2_Sub6 local59 = this.aClass58_2.method1612(super.anInt2201, local22, local48, super.anInt2200);
		if (local59 == null) {
			return null;
		}
		local59.method1443();
		super.anInt2217 = local59.anInt2285;
		@Pc(90) Class1_Sub1_Sub2_Sub6 local90;
		@Pc(103) Class1_Sub1_Sub2_Sub6[] local103;
		if (!this.aBoolean105 && super.anInt2222 != -1 && super.anInt2206 != -1) {
			local90 = Static48.method985(super.anInt2222).method889(super.anInt2206);
			if (local90 != null) {
				local103 = new Class1_Sub1_Sub2_Sub6[] { local59, local90 };
				local90.method1424(0, -super.anInt2198, 0);
				local59 = new Class1_Sub1_Sub2_Sub6(local103, 2, true);
			}
		}
		if (!this.aBoolean105 && this.aClass1_Sub1_Sub2_Sub6_1 != null) {
			if (this.anInt2244 <= Static7.anInt176) {
				this.aClass1_Sub1_Sub2_Sub6_1 = null;
			}
			if (Static7.anInt176 >= this.anInt2247 && this.anInt2244 > Static7.anInt176) {
				local90 = this.aClass1_Sub1_Sub2_Sub6_1;
				local90.method1424(this.anInt2246 - super.anInt2196, -this.anInt2235 + this.anInt2240, this.anInt2249 - super.anInt2232);
				if (super.anInt2187 == 512) {
					local90.method1450();
					local90.method1450();
					local90.method1450();
				} else if (super.anInt2187 == 1024) {
					local90.method1450();
					local90.method1450();
				} else if (super.anInt2187 == 1536) {
					local90.method1450();
				}
				local103 = new Class1_Sub1_Sub2_Sub6[] { local59, local90 };
				local59 = new Class1_Sub1_Sub2_Sub6(local103, 2, true);
				if (super.anInt2187 == 512) {
					local90.method1450();
				} else if (super.anInt2187 == 1024) {
					local90.method1450();
					local90.method1450();
				} else if (super.anInt2187 == 1536) {
					local90.method1450();
					local90.method1450();
					local90.method1450();
				}
				local90.method1424(super.anInt2196 - this.anInt2246, -this.anInt2240 + this.anInt2235, super.anInt2232 - this.anInt2249);
			}
		}
		local59.aBoolean107 = true;
		return local59;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILclient!rc;)V")
	public void method1402(@OriginalArg(1) Class1_Sub5 arg0) {
		arg0.anInt1266 = 0;
		@Pc(6) int local6 = arg0.method716();
		this.anInt2256 = arg0.method699();
		this.anInt2241 = arg0.method699();
		@Pc(23) int[] local23 = new int[12];
		@Pc(25) int local25 = -1;
		this.anInt2252 = 0;
		@Pc(46) int local46;
		@Pc(88) int local88;
		for (@Pc(30) int local30 = 0; local30 < 12; local30++) {
			@Pc(35) int local35 = arg0.method716();
			if (local35 == 0) {
				local23[local30] = 0;
			} else {
				local46 = arg0.method716();
				local23[local30] = (local35 << 8) + local46;
				if (local30 == 0 && local23[0] == 65535) {
					local25 = arg0.method715();
					break;
				}
				if (local23[local30] >= 512) {
					local88 = Static111.method1907(local23[local30] - 512).anInt87;
					if (local88 != 0) {
						this.anInt2252 = local88;
					}
				}
			}
		}
		@Pc(103) int[] local103 = new int[5];
		for (local46 = 0; local46 < 5; local46++) {
			local88 = arg0.method716();
			if (local88 < 0 || local88 >= Static104.anIntArrayArray64[local46].length) {
				local88 = 0;
			}
			local103[local46] = local88;
		}
		super.anInt2225 = arg0.method715();
		if (super.anInt2225 == 65535) {
			super.anInt2225 = -1;
		}
		super.anInt2211 = arg0.method715();
		if (super.anInt2211 == 65535) {
			super.anInt2211 = -1;
		}
		super.anInt2220 = super.anInt2211;
		super.anInt2208 = arg0.method715();
		if (super.anInt2208 == 65535) {
			super.anInt2208 = -1;
		}
		super.anInt2214 = arg0.method715();
		if (super.anInt2214 == 65535) {
			super.anInt2214 = -1;
		}
		super.anInt2199 = arg0.method715();
		if (super.anInt2199 == 65535) {
			super.anInt2199 = -1;
		}
		super.anInt2190 = arg0.method715();
		if (super.anInt2190 == 65535) {
			super.anInt2190 = -1;
		}
		super.anInt2207 = arg0.method715();
		if (super.anInt2207 == 65535) {
			super.anInt2207 = -1;
		}
		this.aClass23_1260 = Static54.method1049(arg0.method726()).method514();
		this.anInt2242 = arg0.method716();
		this.anInt2233 = arg0.method715();
		if (this.aClass58_2 == null) {
			this.aClass58_2 = new Class58();
		}
		this.aClass58_2.method1614(local25, local23, local6 == 1, local103);
	}
}
