import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class4_Sub3_Sub1_Sub2_Sub1 extends Class4_Sub3_Sub1_Sub2 {

	@OriginalMember(owner = "client!be", name = "vc", descriptor = "Lclient!lf;")
	public Class49 aClass49_1;

	@OriginalMember(owner = "client!be", name = "yc", descriptor = "I")
	public int anInt407;

	@OriginalMember(owner = "client!be", name = "zc", descriptor = "I")
	public int anInt408;

	@OriginalMember(owner = "client!be", name = "Bc", descriptor = "I")
	public int anInt409;

	@OriginalMember(owner = "client!be", name = "Ec", descriptor = "I")
	public int anInt412;

	@OriginalMember(owner = "client!be", name = "Jc", descriptor = "Lclient!qb;")
	public Class4_Sub3_Sub1_Sub7 aClass4_Sub3_Sub1_Sub7_1;

	@OriginalMember(owner = "client!be", name = "Lc", descriptor = "I")
	public int anInt418;

	@OriginalMember(owner = "client!be", name = "Qc", descriptor = "Lclient!od;")
	public Class60 aClass60_139;

	@OriginalMember(owner = "client!be", name = "Sc", descriptor = "I")
	public int anInt422;

	@OriginalMember(owner = "client!be", name = "Uc", descriptor = "I")
	public int anInt424;

	@OriginalMember(owner = "client!be", name = "Vc", descriptor = "I")
	public int anInt425;

	@OriginalMember(owner = "client!be", name = "Gc", descriptor = "I")
	public int anInt414 = -1;

	@OriginalMember(owner = "client!be", name = "Cc", descriptor = "I")
	public int anInt410 = -1;

	@OriginalMember(owner = "client!be", name = "Hc", descriptor = "I")
	public int anInt415 = 0;

	@OriginalMember(owner = "client!be", name = "Pc", descriptor = "I")
	public int anInt421 = 0;

	@OriginalMember(owner = "client!be", name = "Fc", descriptor = "I")
	public int anInt413 = 0;

	@OriginalMember(owner = "client!be", name = "Ac", descriptor = "Z")
	public boolean aBoolean12 = false;

	@OriginalMember(owner = "client!be", name = "Mc", descriptor = "I")
	public int anInt419 = 0;

	@OriginalMember(owner = "client!be", name = "Zc", descriptor = "I")
	public int anInt426 = 0;

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(B)Lclient!qb;")
	@Override
	public Class4_Sub3_Sub1_Sub7 method1484() {
		if (this.aClass49_1 == null) {
			return null;
		}
		@Pc(27) Class4_Sub3_Sub10 local27 = super.anInt1408 != -1 && super.anInt1411 == 0 ? Static7.method63(super.anInt1408) : null;
		@Pc(49) Class4_Sub3_Sub10 local49 = super.anInt1389 == -1 || this.aBoolean12 || super.anInt1399 == super.anInt1389 && local27 != null ? null : Static7.method63(super.anInt1389);
		@Pc(60) Class4_Sub3_Sub1_Sub7 local60 = this.aClass49_1.method1065(super.anInt1409, local49, super.anInt1421, local27);
		if (local60 == null) {
			return null;
		}
		local60.method1493();
		super.anInt1419 = local60.anInt2166;
		@Pc(96) Class4_Sub3_Sub1_Sub7 local96;
		@Pc(109) Class4_Sub3_Sub1_Sub7[] local109;
		if (!this.aBoolean12 && super.anInt1416 != -1 && super.anInt1431 != -1) {
			local96 = Static46.method642(super.anInt1416).method417(super.anInt1431);
			if (local96 != null) {
				local109 = new Class4_Sub3_Sub1_Sub7[] { local60, local96 };
				local96.method1505(0, -super.anInt1432, 0);
				local60 = new Class4_Sub3_Sub1_Sub7(local109, 2);
			}
		}
		if (!this.aBoolean12 && this.aClass4_Sub3_Sub1_Sub7_1 != null) {
			if (Static118.anInt2741 >= this.anInt421) {
				this.aClass4_Sub3_Sub1_Sub7_1 = null;
			}
			if (Static118.anInt2741 >= this.anInt419 && this.anInt421 > Static118.anInt2741) {
				local96 = this.aClass4_Sub3_Sub1_Sub7_1;
				local109 = new Class4_Sub3_Sub1_Sub7[] { local60, local96 };
				local96.method1505(this.anInt408 - super.anInt1440, this.anInt424 + -this.anInt422, this.anInt407 - super.anInt1407);
				if (super.anInt1414 == 512) {
					local96.method1507();
					local96.method1507();
					local96.method1507();
				} else if (super.anInt1414 == 1024) {
					local96.method1507();
					local96.method1507();
				} else if (super.anInt1414 == 1536) {
					local96.method1507();
				}
				local60 = new Class4_Sub3_Sub1_Sub7(local109, 2);
				if (super.anInt1414 == 512) {
					local96.method1507();
				} else if (super.anInt1414 == 1024) {
					local96.method1507();
					local96.method1507();
				} else if (super.anInt1414 == 1536) {
					local96.method1507();
					local96.method1507();
					local96.method1507();
				}
				local96.method1505(super.anInt1440 - this.anInt408, -this.anInt424 + this.anInt422, super.anInt1407 - this.anInt407);
			}
		}
		local60.aBoolean76 = true;
		return local60;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!tf;Z)V")
	public void method218(@OriginalArg(0) Class4_Sub9 arg0) {
		arg0.anInt1312 = 0;
		@Pc(7) int[] local7 = new int[12];
		@Pc(11) int local11 = arg0.method773();
		@Pc(13) int local13 = -1;
		this.anInt414 = arg0.method797();
		this.anInt410 = arg0.method797();
		this.anInt426 = 0;
		@Pc(53) int local53;
		@Pc(91) int local91;
		for (@Pc(32) int local32 = 0; local32 < 12; local32++) {
			@Pc(38) int local38 = arg0.method773();
			if (local38 == 0) {
				local7[local32] = 0;
			} else {
				local53 = arg0.method773();
				local7[local32] = local53 + (local38 << 8);
				if (local32 == 0 && local7[0] == 65535) {
					local13 = arg0.method816();
					break;
				}
				if (local7[local32] >= 512) {
					local91 = Static112.method1854(local7[local32] - 512).anInt2865;
					if (local91 != 0) {
						this.anInt426 = local91;
					}
				}
			}
		}
		@Pc(105) int[] local105 = new int[5];
		for (local53 = 0; local53 < 5; local53++) {
			local91 = arg0.method773();
			if (local91 < 0 || Static109.aShortArrayArray34[local53].length <= local91) {
				local91 = 0;
			}
			local105[local53] = local91;
		}
		super.anInt1399 = arg0.method816();
		if (super.anInt1399 == 65535) {
			super.anInt1399 = -1;
		}
		super.anInt1401 = arg0.method816();
		if (super.anInt1401 == 65535) {
			super.anInt1401 = -1;
		}
		super.anInt1435 = super.anInt1401;
		super.anInt1410 = arg0.method816();
		if (super.anInt1410 == 65535) {
			super.anInt1410 = -1;
		}
		super.anInt1429 = arg0.method816();
		if (super.anInt1429 == 65535) {
			super.anInt1429 = -1;
		}
		super.anInt1384 = arg0.method816();
		if (super.anInt1384 == 65535) {
			super.anInt1384 = -1;
		}
		super.anInt1405 = arg0.method816();
		if (super.anInt1405 == 65535) {
			super.anInt1405 = -1;
		}
		super.anInt1406 = arg0.method816();
		if (super.anInt1406 == 65535) {
			super.anInt1406 = -1;
		}
		this.aClass60_139 = Static56.method885(arg0.method783()).method1322();
		this.anInt413 = arg0.method773();
		this.anInt415 = arg0.method816();
		if (this.aClass49_1 == null) {
			this.aClass49_1 = new Class49();
		}
		this.aClass49_1.method1057(local7, local105, local13, local11 == 1);
	}

	@OriginalMember(owner = "client!be", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method852() {
		return this.aClass49_1 != null;
	}
}
