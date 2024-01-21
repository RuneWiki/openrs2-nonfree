import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class1_Sub1_Sub1_Sub5_Sub2 extends Class1_Sub1_Sub1_Sub5 {

	@OriginalMember(owner = "client!hd", name = "Nc", descriptor = "I")
	public int anInt1298;

	@OriginalMember(owner = "client!hd", name = "Qc", descriptor = "I")
	public int anInt1300;

	@OriginalMember(owner = "client!hd", name = "Rc", descriptor = "Lclient!kb;")
	public Class38 aClass38_1;

	@OriginalMember(owner = "client!hd", name = "Uc", descriptor = "I")
	public int anInt1301;

	@OriginalMember(owner = "client!hd", name = "Xc", descriptor = "I")
	public int anInt1304;

	@OriginalMember(owner = "client!hd", name = "Yc", descriptor = "Lclient!sc;")
	public Class66 aClass66_707;

	@OriginalMember(owner = "client!hd", name = "cd", descriptor = "I")
	public int anInt1307;

	@OriginalMember(owner = "client!hd", name = "dd", descriptor = "I")
	public int anInt1308;

	@OriginalMember(owner = "client!hd", name = "fd", descriptor = "I")
	public int anInt1310;

	@OriginalMember(owner = "client!hd", name = "jd", descriptor = "Lclient!lb;")
	public Class1_Sub1_Sub1_Sub6 aClass1_Sub1_Sub1_Sub6_1;

	@OriginalMember(owner = "client!hd", name = "ud", descriptor = "I")
	public int anInt1320;

	@OriginalMember(owner = "client!hd", name = "Vc", descriptor = "I")
	public int anInt1302 = 0;

	@OriginalMember(owner = "client!hd", name = "Wc", descriptor = "I")
	public int anInt1303 = 0;

	@OriginalMember(owner = "client!hd", name = "id", descriptor = "I")
	public int anInt1312 = 0;

	@OriginalMember(owner = "client!hd", name = "qd", descriptor = "I")
	public int anInt1317 = -1;

	@OriginalMember(owner = "client!hd", name = "md", descriptor = "I")
	public int anInt1314 = 0;

	@OriginalMember(owner = "client!hd", name = "Pc", descriptor = "I")
	public int anInt1299 = -1;

	@OriginalMember(owner = "client!hd", name = "hd", descriptor = "Z")
	public boolean aBoolean45 = false;

	@OriginalMember(owner = "client!hd", name = "wd", descriptor = "I")
	public int anInt1322 = 0;

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "(I)Lclient!lb;")
	@Override
	public Class1_Sub1_Sub1_Sub6 method1897() {
		if (this.aClass38_1 == null) {
			return null;
		}
		@Pc(25) Class1_Sub1_Sub15 local25 = super.anInt1266 != -1 && super.anInt1257 == 0 ? Static56.method1247(super.anInt1266) : null;
		@Pc(46) Class1_Sub1_Sub15 local46 = super.anInt1247 == -1 || this.aBoolean45 || super.anInt1288 == super.anInt1247 && local25 != null ? null : Static56.method1247(super.anInt1247);
		@Pc(57) Class1_Sub1_Sub1_Sub6 local57 = this.aClass38_1.method1264(local25, local46, super.anInt1259, super.anInt1244);
		if (local57 == null) {
			return null;
		}
		local57.method1338();
		super.anInt1245 = local57.anInt2699;
		@Pc(90) Class1_Sub1_Sub1_Sub6 local90;
		@Pc(110) Class1_Sub1_Sub1_Sub6[] local110;
		if (!this.aBoolean45 && super.anInt1255 != -1 && super.anInt1279 != -1) {
			local90 = Static122.method1994(super.anInt1255).method1643(super.anInt1279);
			if (local90 != null) {
				local90.method1337(0, -super.anInt1249, 0);
				local110 = new Class1_Sub1_Sub1_Sub6[] { local57, local90 };
				local57 = new Class1_Sub1_Sub1_Sub6(local110, 2);
			}
		}
		if (!this.aBoolean45 && this.aClass1_Sub1_Sub1_Sub6_1 != null) {
			if (this.anInt1322 <= Static22.anInt636) {
				this.aClass1_Sub1_Sub1_Sub6_1 = null;
			}
			if (Static22.anInt636 >= this.anInt1302 && this.anInt1322 > Static22.anInt636) {
				local90 = this.aClass1_Sub1_Sub1_Sub6_1;
				local110 = new Class1_Sub1_Sub1_Sub6[] { local57, local90 };
				local90.method1337(this.anInt1320 - super.anInt1261, -this.anInt1308 + this.anInt1304, this.anInt1301 - super.anInt1271);
				if (super.anInt1269 == 512) {
					local90.method1340();
					local90.method1340();
					local90.method1340();
				} else if (super.anInt1269 == 1024) {
					local90.method1340();
					local90.method1340();
				} else if (super.anInt1269 == 1536) {
					local90.method1340();
				}
				local57 = new Class1_Sub1_Sub1_Sub6(local110, 2);
				if (super.anInt1269 == 512) {
					local90.method1340();
				} else if (super.anInt1269 == 1024) {
					local90.method1340();
					local90.method1340();
				} else if (super.anInt1269 == 1536) {
					local90.method1340();
					local90.method1340();
					local90.method1340();
				}
				local90.method1337(super.anInt1261 - this.anInt1320, this.anInt1308 + -this.anInt1304, super.anInt1271 - this.anInt1301);
			}
		}
		local57.aBoolean75 = true;
		return local57;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZLclient!mc;)V")
	public void method939(@OriginalArg(1) Class1_Sub12 arg0) {
		arg0.anInt1694 = 0;
		@Pc(8) int local8 = arg0.method1190();
		this.anInt1299 = arg0.method1211();
		this.anInt1317 = arg0.method1211();
		this.anInt1312 = 0;
		@Pc(28) int[] local28 = new int[12];
		@Pc(34) int local34 = -1;
		@Pc(54) int local54;
		@Pc(96) int local96;
		for (@Pc(36) int local36 = 0; local36 < 12; local36++) {
			@Pc(42) int local42 = arg0.method1190();
			if (local42 == 0) {
				local28[local36] = 0;
			} else {
				local54 = arg0.method1190();
				local28[local36] = local54 + (local42 << 8);
				if (local36 == 0 && local28[0] == 65535) {
					local34 = arg0.method1176();
					break;
				}
				if (local28[local36] >= 512) {
					local96 = Static20.method496(local28[local36] - 512).anInt1552;
					if (local96 != 0) {
						this.anInt1312 = local96;
					}
				}
			}
		}
		@Pc(113) int[] local113 = new int[5];
		for (local54 = 0; local54 < 5; local54++) {
			local96 = arg0.method1190();
			if (local96 < 0 || Static16.aShortArrayArray1[local54].length <= local96) {
				local96 = 0;
			}
			local113[local54] = local96;
		}
		super.anInt1288 = arg0.method1176();
		if (super.anInt1288 == 65535) {
			super.anInt1288 = -1;
		}
		super.anInt1289 = arg0.method1176();
		if (super.anInt1289 == 65535) {
			super.anInt1289 = -1;
		}
		super.anInt1276 = super.anInt1289;
		super.anInt1262 = arg0.method1176();
		if (super.anInt1262 == 65535) {
			super.anInt1262 = -1;
		}
		super.anInt1296 = arg0.method1176();
		if (super.anInt1296 == 65535) {
			super.anInt1296 = -1;
		}
		super.anInt1250 = arg0.method1176();
		if (super.anInt1250 == 65535) {
			super.anInt1250 = -1;
		}
		super.anInt1291 = arg0.method1176();
		if (super.anInt1291 == 65535) {
			super.anInt1291 = -1;
		}
		super.anInt1251 = arg0.method1176();
		if (super.anInt1251 == 65535) {
			super.anInt1251 = -1;
		}
		this.aClass66_707 = Static106.method1850(arg0.method1219()).method1820();
		this.anInt1314 = arg0.method1190();
		this.anInt1303 = arg0.method1176();
		if (this.aClass38_1 == null) {
			this.aClass38_1 = new Class38();
		}
		this.aClass38_1.method1248(local34, local28, local113, local8 == 1);
	}

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method931() {
		return this.aClass38_1 != null;
	}
}
