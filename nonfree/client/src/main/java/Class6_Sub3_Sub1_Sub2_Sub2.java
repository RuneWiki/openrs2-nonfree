import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Class6_Sub3_Sub1_Sub2_Sub2 extends Class6_Sub3_Sub1_Sub2 {

	@OriginalMember(owner = "client!p", name = "Qc", descriptor = "Lclient!ec;")
	public Class21 aClass21_1;

	@OriginalMember(owner = "client!p", name = "Sc", descriptor = "I")
	public int anInt2355;

	@OriginalMember(owner = "client!p", name = "Uc", descriptor = "I")
	public int anInt2357;

	@OriginalMember(owner = "client!p", name = "Yc", descriptor = "Lclient!df;")
	public Class6_Sub3_Sub1_Sub3 aClass6_Sub3_Sub1_Sub3_3;

	@OriginalMember(owner = "client!p", name = "bd", descriptor = "I")
	public int anInt2362;

	@OriginalMember(owner = "client!p", name = "fd", descriptor = "I")
	public int anInt2365;

	@OriginalMember(owner = "client!p", name = "hd", descriptor = "I")
	public int anInt2367;

	@OriginalMember(owner = "client!p", name = "kd", descriptor = "I")
	public int anInt2370;

	@OriginalMember(owner = "client!p", name = "qd", descriptor = "Lclient!rd;")
	public Class63 aClass63_1237;

	@OriginalMember(owner = "client!p", name = "sd", descriptor = "I")
	public int anInt2373;

	@OriginalMember(owner = "client!p", name = "vd", descriptor = "I")
	public int anInt2374;

	@OriginalMember(owner = "client!p", name = "jd", descriptor = "I")
	public int anInt2369 = 0;

	@OriginalMember(owner = "client!p", name = "pd", descriptor = "I")
	public int anInt2372 = -1;

	@OriginalMember(owner = "client!p", name = "od", descriptor = "Z")
	public boolean aBoolean120 = false;

	@OriginalMember(owner = "client!p", name = "Zc", descriptor = "I")
	public int anInt2361 = -1;

	@OriginalMember(owner = "client!p", name = "id", descriptor = "I")
	public int anInt2368 = 0;

	@OriginalMember(owner = "client!p", name = "ld", descriptor = "I")
	public int anInt2371 = 0;

	@OriginalMember(owner = "client!p", name = "Xc", descriptor = "I")
	public int anInt2360 = 0;

	@OriginalMember(owner = "client!p", name = "wd", descriptor = "I")
	public int anInt2375 = 0;

	@OriginalMember(owner = "client!p", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method1545() {
		return this.aClass21_1 != null;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(BLclient!bf;)V")
	public void method1553(@OriginalArg(1) Class6_Sub4 arg0) {
		@Pc(7) int local7 = -1;
		arg0.anInt1949 = 0;
		@Pc(13) int[] local13 = new int[12];
		@Pc(17) int local17 = arg0.method1321();
		this.anInt2361 = arg0.method1297();
		this.anInt2372 = arg0.method1297();
		this.anInt2369 = 0;
		@Pc(53) int local53;
		@Pc(94) int local94;
		for (@Pc(32) int local32 = 0; local32 < 12; local32++) {
			@Pc(38) int local38 = arg0.method1321();
			if (local38 == 0) {
				local13[local32] = 0;
			} else {
				local53 = arg0.method1321();
				local13[local32] = (local38 << 8) + local53;
				if (local32 == 0 && local13[0] == 65535) {
					local7 = arg0.method1306();
					break;
				}
				if (local13[local32] >= 512) {
					local94 = Static91.method1664(local13[local32] - 512).anInt1385;
					if (local94 != 0) {
						this.anInt2369 = local94;
					}
				}
			}
		}
		@Pc(111) int[] local111 = new int[5];
		for (local53 = 0; local53 < 5; local53++) {
			local94 = arg0.method1321();
			if (local94 < 0 || Static86.aShortArrayArray1[local53].length <= local94) {
				local94 = 0;
			}
			local111[local53] = local94;
		}
		super.anInt2328 = arg0.method1306();
		if (super.anInt2328 == 65535) {
			super.anInt2328 = -1;
		}
		super.anInt2323 = arg0.method1306();
		if (super.anInt2323 == 65535) {
			super.anInt2323 = -1;
		}
		super.anInt2346 = super.anInt2323;
		super.anInt2330 = arg0.method1306();
		if (super.anInt2330 == 65535) {
			super.anInt2330 = -1;
		}
		super.anInt2317 = arg0.method1306();
		if (super.anInt2317 == 65535) {
			super.anInt2317 = -1;
		}
		super.anInt2293 = arg0.method1306();
		if (super.anInt2293 == 65535) {
			super.anInt2293 = -1;
		}
		super.anInt2321 = arg0.method1306();
		if (super.anInt2321 == 65535) {
			super.anInt2321 = -1;
		}
		super.anInt2351 = arg0.method1306();
		if (super.anInt2351 == 65535) {
			super.anInt2351 = -1;
		}
		this.aClass63_1237 = Static24.method578(arg0.method1301()).method1814();
		this.anInt2375 = arg0.method1321();
		this.anInt2360 = arg0.method1306();
		if (this.aClass21_1 == null) {
			this.aClass21_1 = new Class21();
		}
		this.aClass21_1.method707(local13, local111, local17 == 1, local7);
	}

	@OriginalMember(owner = "client!p", name = "g", descriptor = "(I)Lclient!df;")
	@Override
	public Class6_Sub3_Sub1_Sub3 method2062() {
		if (this.aClass21_1 == null) {
			return null;
		}
		@Pc(27) Class6_Sub3_Sub7 local27 = super.anInt2307 != -1 && super.anInt2314 == 0 ? Static30.method721(super.anInt2307) : null;
		@Pc(49) Class6_Sub3_Sub7 local49 = super.anInt2308 == -1 || this.aBoolean120 || super.anInt2308 == super.anInt2328 && local27 != null ? null : Static30.method721(super.anInt2308);
		@Pc(60) Class6_Sub3_Sub1_Sub3 local60 = this.aClass21_1.method704(super.anInt2298, local27, local49, super.anInt2329);
		if (local60 == null) {
			return null;
		}
		local60.method632();
		super.anInt2349 = local60.anInt3082;
		@Pc(97) Class6_Sub3_Sub1_Sub3 local97;
		@Pc(117) Class6_Sub3_Sub1_Sub3[] local117;
		if (!this.aBoolean120 && super.anInt2334 != -1 && super.anInt2342 != -1) {
			local97 = Static55.method1124(super.anInt2334).method1417(super.anInt2342);
			if (local97 != null) {
				local97.method637(0, -super.anInt2327, 0);
				local117 = new Class6_Sub3_Sub1_Sub3[] { local60, local97 };
				local60 = new Class6_Sub3_Sub1_Sub3(local117, 2);
			}
		}
		if (!this.aBoolean120 && this.aClass6_Sub3_Sub1_Sub3_3 != null) {
			if (Static73.anInt2064 >= this.anInt2371) {
				this.aClass6_Sub3_Sub1_Sub3_3 = null;
			}
			if (Static73.anInt2064 >= this.anInt2368 && this.anInt2371 > Static73.anInt2064) {
				local97 = this.aClass6_Sub3_Sub1_Sub3_3;
				local97.method637(this.anInt2373 - super.anInt2319, this.anInt2357 - this.anInt2367, this.anInt2365 - super.anInt2347);
				local117 = new Class6_Sub3_Sub1_Sub3[] { local60, local97 };
				if (super.anInt2309 == 512) {
					local97.method640();
					local97.method640();
					local97.method640();
				} else if (super.anInt2309 == 1024) {
					local97.method640();
					local97.method640();
				} else if (super.anInt2309 == 1536) {
					local97.method640();
				}
				local60 = new Class6_Sub3_Sub1_Sub3(local117, 2);
				if (super.anInt2309 == 512) {
					local97.method640();
				} else if (super.anInt2309 == 1024) {
					local97.method640();
					local97.method640();
				} else if (super.anInt2309 == 1536) {
					local97.method640();
					local97.method640();
					local97.method640();
				}
				local97.method637(super.anInt2319 - this.anInt2373, this.anInt2367 + -this.anInt2357, super.anInt2347 - this.anInt2365);
			}
		}
		local60.aBoolean43 = true;
		return local60;
	}
}
