import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class Class1_Sub1_Sub1_Sub1_Sub1 extends Class1_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!a", name = "Rc", descriptor = "Lclient!cb;")
	public Class10 aClass10_1;

	@OriginalMember(owner = "client!a", name = "Uc", descriptor = "I")
	public int anInt249;

	@OriginalMember(owner = "client!a", name = "Xc", descriptor = "I")
	public int anInt250;

	@OriginalMember(owner = "client!a", name = "Zc", descriptor = "I")
	public int anInt251;

	@OriginalMember(owner = "client!a", name = "ed", descriptor = "I")
	public int anInt255;

	@OriginalMember(owner = "client!a", name = "id", descriptor = "I")
	public int anInt257;

	@OriginalMember(owner = "client!a", name = "jd", descriptor = "I")
	public int anInt258;

	@OriginalMember(owner = "client!a", name = "kd", descriptor = "Lclient!id;")
	public Class34 aClass34_97;

	@OriginalMember(owner = "client!a", name = "pd", descriptor = "Lclient!ka;")
	public Class1_Sub1_Sub1_Sub2 aClass1_Sub1_Sub1_Sub2_1;

	@OriginalMember(owner = "client!a", name = "sd", descriptor = "I")
	public int anInt262;

	@OriginalMember(owner = "client!a", name = "vd", descriptor = "I")
	public int anInt265;

	@OriginalMember(owner = "client!a", name = "Yc", descriptor = "Z")
	public boolean aBoolean13 = false;

	@OriginalMember(owner = "client!a", name = "cd", descriptor = "I")
	public int anInt253 = 0;

	@OriginalMember(owner = "client!a", name = "od", descriptor = "I")
	public int anInt261 = 0;

	@OriginalMember(owner = "client!a", name = "nd", descriptor = "I")
	public int anInt260 = -1;

	@OriginalMember(owner = "client!a", name = "Tc", descriptor = "I")
	public int anInt248 = 0;

	@OriginalMember(owner = "client!a", name = "md", descriptor = "I")
	public int anInt259 = 0;

	@OriginalMember(owner = "client!a", name = "ud", descriptor = "I")
	public int anInt264 = 0;

	@OriginalMember(owner = "client!a", name = "bd", descriptor = "I")
	public int anInt252 = -1;

	@OriginalMember(owner = "client!a", name = "e", descriptor = "(I)Lclient!ka;")
	@Override
	public Class1_Sub1_Sub1_Sub2 method1842() {
		if (this.aClass10_1 == null) {
			return null;
		}
		@Pc(35) Class1_Sub1_Sub6 local35 = super.anInt1388 != -1 && super.anInt1416 == 0 ? Static40.method687(super.anInt1388) : null;
		@Pc(57) Class1_Sub1_Sub6 local57 = super.anInt1446 == -1 || this.aBoolean13 || super.anInt1446 == super.anInt1409 && local35 != null ? null : Static40.method687(super.anInt1446);
		@Pc(68) Class1_Sub1_Sub1_Sub2 local68 = this.aClass10_1.method355(local57, super.anInt1431, local35, super.anInt1401);
		if (local68 == null) {
			return null;
		}
		local68.method1103();
		super.anInt1451 = local68.anInt2759;
		@Pc(99) Class1_Sub1_Sub1_Sub2 local99;
		@Pc(119) Class1_Sub1_Sub1_Sub2[] local119;
		if (!this.aBoolean13 && super.anInt1414 != -1 && super.anInt1424 != -1) {
			local99 = Static11.method279(super.anInt1414).method1707(super.anInt1424);
			if (local99 != null) {
				local99.method1087(0, -super.anInt1407, 0);
				local119 = new Class1_Sub1_Sub1_Sub2[] { local68, local99 };
				local68 = new Class1_Sub1_Sub1_Sub2(local119, 2);
			}
		}
		if (!this.aBoolean13 && this.aClass1_Sub1_Sub1_Sub2_1 != null) {
			if (this.anInt259 <= Static73.anInt1947) {
				this.aClass1_Sub1_Sub1_Sub2_1 = null;
			}
			if (Static73.anInt1947 >= this.anInt261 && Static73.anInt1947 < this.anInt259) {
				local99 = this.aClass1_Sub1_Sub1_Sub2_1;
				local119 = new Class1_Sub1_Sub1_Sub2[] { local68, local99 };
				local99.method1087(this.anInt265 - super.anInt1428, this.anInt250 + -this.anInt255, this.anInt251 - super.anInt1405);
				if (super.anInt1402 == 512) {
					local99.method1081();
					local99.method1081();
					local99.method1081();
				} else if (super.anInt1402 == 1024) {
					local99.method1081();
					local99.method1081();
				} else if (super.anInt1402 == 1536) {
					local99.method1081();
				}
				local68 = new Class1_Sub1_Sub1_Sub2(local119, 2);
				if (super.anInt1402 == 512) {
					local99.method1081();
				} else if (super.anInt1402 == 1024) {
					local99.method1081();
					local99.method1081();
				} else if (super.anInt1402 == 1536) {
					local99.method1081();
					local99.method1081();
					local99.method1081();
				}
				local99.method1087(super.anInt1428 - this.anInt265, this.anInt255 + -this.anInt250, super.anInt1405 - this.anInt251);
			}
		}
		local68.aBoolean92 = true;
		return local68;
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method901() {
		return this.aClass10_1 != null;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ILclient!of;)V")
	public void method95(@OriginalArg(1) Class1_Sub19 arg0) {
		arg0.anInt3111 = 0;
		@Pc(12) int local12 = arg0.method2072();
		@Pc(15) int[] local15 = new int[12];
		@Pc(17) int local17 = -1;
		this.anInt260 = arg0.method2086();
		this.anInt252 = arg0.method2086();
		this.anInt248 = 0;
		@Pc(50) int local50;
		@Pc(89) int local89;
		for (@Pc(32) int local32 = 0; local32 < 12; local32++) {
			@Pc(38) int local38 = arg0.method2072();
			if (local38 == 0) {
				local15[local32] = 0;
			} else {
				local50 = arg0.method2072();
				local15[local32] = (local38 << 8) + local50;
				if (local32 == 0 && local15[0] == 65535) {
					local17 = arg0.method2051();
					break;
				}
				if (local15[local32] >= 512) {
					local89 = Static74.method1334(local15[local32] - 512).anInt2003;
					if (local89 != 0) {
						this.anInt248 = local89;
					}
				}
			}
		}
		@Pc(103) int[] local103 = new int[5];
		for (local50 = 0; local50 < 5; local50++) {
			local89 = arg0.method2072();
			if (local89 < 0 || Static127.aShortArrayArray7[local50].length <= local89) {
				local89 = 0;
			}
			local103[local50] = local89;
		}
		super.anInt1409 = arg0.method2051();
		if (super.anInt1409 == 65535) {
			super.anInt1409 = -1;
		}
		super.anInt1398 = arg0.method2051();
		if (super.anInt1398 == 65535) {
			super.anInt1398 = -1;
		}
		super.anInt1392 = super.anInt1398;
		super.anInt1442 = arg0.method2051();
		if (super.anInt1442 == 65535) {
			super.anInt1442 = -1;
		}
		super.anInt1404 = arg0.method2051();
		if (super.anInt1404 == 65535) {
			super.anInt1404 = -1;
		}
		super.anInt1395 = arg0.method2051();
		if (super.anInt1395 == 65535) {
			super.anInt1395 = -1;
		}
		super.anInt1447 = arg0.method2051();
		if (super.anInt1447 == 65535) {
			super.anInt1447 = -1;
		}
		super.anInt1439 = arg0.method2051();
		if (super.anInt1439 == 65535) {
			super.anInt1439 = -1;
		}
		this.aClass34_97 = Static77.method1358(arg0.method2089()).method969();
		this.anInt253 = arg0.method2072();
		this.anInt264 = arg0.method2051();
		if (this.aClass10_1 == null) {
			this.aClass10_1 = new Class10();
		}
		this.aClass10_1.method362(local17, local15, local103, local12 == 1);
	}
}
