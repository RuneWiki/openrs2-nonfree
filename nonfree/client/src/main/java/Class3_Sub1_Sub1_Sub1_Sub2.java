import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class3_Sub1_Sub1_Sub1_Sub2 extends Class3_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!sd", name = "Uc", descriptor = "Lclient!hc;")
	public Class3_Sub1_Sub1_Sub4 aClass3_Sub1_Sub1_Sub4_3;

	@OriginalMember(owner = "client!sd", name = "Vc", descriptor = "I")
	public int anInt2349;

	@OriginalMember(owner = "client!sd", name = "Wc", descriptor = "Lclient!k;")
	public Class41 aClass41_2;

	@OriginalMember(owner = "client!sd", name = "Yc", descriptor = "I")
	public int anInt2350;

	@OriginalMember(owner = "client!sd", name = "cd", descriptor = "I")
	public int anInt2352;

	@OriginalMember(owner = "client!sd", name = "dd", descriptor = "I")
	public int anInt2353;

	@OriginalMember(owner = "client!sd", name = "jd", descriptor = "I")
	public int anInt2356;

	@OriginalMember(owner = "client!sd", name = "kd", descriptor = "I")
	public int anInt2357;

	@OriginalMember(owner = "client!sd", name = "ld", descriptor = "Lclient!ad;")
	public Class4 aClass4_1302;

	@OriginalMember(owner = "client!sd", name = "qd", descriptor = "I")
	public int anInt2360;

	@OriginalMember(owner = "client!sd", name = "Cd", descriptor = "I")
	public int anInt2370;

	@OriginalMember(owner = "client!sd", name = "Zc", descriptor = "Z")
	public boolean aBoolean194 = false;

	@OriginalMember(owner = "client!sd", name = "fd", descriptor = "I")
	public int anInt2354 = 0;

	@OriginalMember(owner = "client!sd", name = "ad", descriptor = "I")
	public int anInt2351 = 0;

	@OriginalMember(owner = "client!sd", name = "td", descriptor = "I")
	public int anInt2363 = 0;

	@OriginalMember(owner = "client!sd", name = "wd", descriptor = "I")
	public int anInt2366 = 0;

	@OriginalMember(owner = "client!sd", name = "xd", descriptor = "I")
	public int anInt2367 = 0;

	@OriginalMember(owner = "client!sd", name = "vd", descriptor = "I")
	public int anInt2365 = -1;

	@OriginalMember(owner = "client!sd", name = "pd", descriptor = "I")
	public int anInt2359 = -1;

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method1552() {
		return this.aClass41_2 != null;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!gb;I)V")
	public void method1554(@OriginalArg(0) Class3_Sub4 arg0) {
		arg0.anInt627 = 0;
		@Pc(12) int local12 = arg0.method446();
		@Pc(14) int local14 = -1;
		@Pc(17) int[] local17 = new int[12];
		this.anInt2359 = arg0.method434();
		this.anInt2365 = arg0.method434();
		this.anInt2367 = 0;
		@Pc(57) int local57;
		@Pc(95) int local95;
		for (@Pc(34) int local34 = 0; local34 < 12; local34++) {
			@Pc(42) int local42 = arg0.method446();
			if (local42 == 0) {
				local17[local34] = 0;
			} else {
				local57 = arg0.method446();
				local17[local34] = local57 + (local42 << 8);
				if (local34 == 0 && local17[0] == 65535) {
					local14 = arg0.method459();
					break;
				}
				if (local17[local34] >= 512) {
					local95 = Static3.method1550(local17[local34] - 512).anInt757;
					if (local95 != 0) {
						this.anInt2367 = local95;
					}
				}
			}
		}
		@Pc(109) int[] local109 = new int[5];
		for (local57 = 0; local57 < 5; local57++) {
			local95 = arg0.method446();
			if (local95 < 0 || Static45.anIntArrayArray14[local57].length <= local95) {
				local95 = 0;
			}
			local109[local57] = local95;
		}
		super.anInt2291 = arg0.method459();
		if (super.anInt2291 == 65535) {
			super.anInt2291 = -1;
		}
		super.anInt2306 = arg0.method459();
		if (super.anInt2306 == 65535) {
			super.anInt2306 = -1;
		}
		super.anInt2312 = super.anInt2306;
		super.anInt2305 = arg0.method459();
		if (super.anInt2305 == 65535) {
			super.anInt2305 = -1;
		}
		super.anInt2322 = arg0.method459();
		if (super.anInt2322 == 65535) {
			super.anInt2322 = -1;
		}
		super.anInt2307 = arg0.method459();
		if (super.anInt2307 == 65535) {
			super.anInt2307 = -1;
		}
		super.anInt2314 = arg0.method459();
		if (super.anInt2314 == 65535) {
			super.anInt2314 = -1;
		}
		super.anInt2332 = arg0.method459();
		if (super.anInt2332 == 65535) {
			super.anInt2332 = -1;
		}
		this.aClass4_1302 = Static96.method1165(arg0.method428()).method130();
		this.anInt2351 = arg0.method446();
		this.anInt2366 = arg0.method459();
		if (this.aClass41_2 == null) {
			this.aClass41_2 = new Class41();
		}
		this.aClass41_2.method898(local12 == 1, local109, local14, local17);
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(B)Lclient!hc;")
	@Override
	public Class3_Sub1_Sub1_Sub4 method1920() {
		if (this.aClass41_2 == null) {
			return null;
		}
		@Pc(27) Class3_Sub1_Sub6 local27 = super.anInt2320 != -1 && super.anInt2318 == 0 ? Static67.method1107(super.anInt2320) : null;
		@Pc(52) Class3_Sub1_Sub6 local52 = super.anInt2295 == -1 || this.aBoolean194 || super.anInt2291 == super.anInt2295 && local27 != null ? null : Static67.method1107(super.anInt2295);
		@Pc(63) Class3_Sub1_Sub1_Sub4 local63 = this.aClass41_2.method907(super.anInt2339, local27, local52, super.anInt2298);
		if (local63 == null) {
			return null;
		}
		local63.method776();
		super.anInt2296 = local63.anInt2808;
		@Pc(102) Class3_Sub1_Sub1_Sub4 local102;
		@Pc(122) Class3_Sub1_Sub1_Sub4[] local122;
		if (!this.aBoolean194 && super.anInt2335 != -1 && super.anInt2338 != -1) {
			local102 = Static47.method827(super.anInt2335).method1484(super.anInt2338);
			if (local102 != null) {
				local102.method786(0, -super.anInt2323, 0);
				local122 = new Class3_Sub1_Sub1_Sub4[] { local63, local102 };
				local63 = new Class3_Sub1_Sub1_Sub4(local122, 2, true);
			}
		}
		if (!this.aBoolean194 && this.aClass3_Sub1_Sub1_Sub4_3 != null) {
			if (this.anInt2354 <= Static60.anInt1489) {
				this.aClass3_Sub1_Sub1_Sub4_3 = null;
			}
			if (Static60.anInt1489 >= this.anInt2363 && this.anInt2354 > Static60.anInt1489) {
				local102 = this.aClass3_Sub1_Sub1_Sub4_3;
				local102.method786(this.anInt2352 - super.anInt2342, this.anInt2370 + -this.anInt2350, this.anInt2360 - super.anInt2348);
				if (super.anInt2290 == 512) {
					local102.method770();
					local102.method770();
					local102.method770();
				} else if (super.anInt2290 == 1024) {
					local102.method770();
					local102.method770();
				} else if (super.anInt2290 == 1536) {
					local102.method770();
				}
				local122 = new Class3_Sub1_Sub1_Sub4[] { local63, local102 };
				local63 = new Class3_Sub1_Sub1_Sub4(local122, 2, true);
				if (super.anInt2290 == 512) {
					local102.method770();
				} else if (super.anInt2290 == 1024) {
					local102.method770();
					local102.method770();
				} else if (super.anInt2290 == 1536) {
					local102.method770();
					local102.method770();
					local102.method770();
				}
				local102.method786(super.anInt2342 - this.anInt2352, -this.anInt2370 + this.anInt2350, super.anInt2348 - this.anInt2360);
			}
		}
		local63.aBoolean78 = true;
		return local63;
	}
}
