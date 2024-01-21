import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class2_Sub1_Sub3_Sub2_Sub1 extends Class2_Sub1_Sub3_Sub2 {

	@OriginalMember(owner = "client!gb", name = "oc", descriptor = "I")
	public int anInt1330;

	@OriginalMember(owner = "client!gb", name = "qc", descriptor = "I")
	public int anInt1332;

	@OriginalMember(owner = "client!gb", name = "zc", descriptor = "Lclient!sd;")
	public Class74 aClass74_2;

	@OriginalMember(owner = "client!gb", name = "Cc", descriptor = "I")
	public int anInt1340;

	@OriginalMember(owner = "client!gb", name = "Dc", descriptor = "I")
	public int anInt1341;

	@OriginalMember(owner = "client!gb", name = "Ec", descriptor = "I")
	public int anInt1342;

	@OriginalMember(owner = "client!gb", name = "Hc", descriptor = "I")
	public int anInt1345;

	@OriginalMember(owner = "client!gb", name = "Kc", descriptor = "Lclient!bh;")
	public Class2_Sub1_Sub3_Sub3 aClass2_Sub1_Sub3_Sub3_1;

	@OriginalMember(owner = "client!gb", name = "Lc", descriptor = "I")
	public int anInt1347;

	@OriginalMember(owner = "client!gb", name = "Qc", descriptor = "Lclient!cd;")
	public Class10 aClass10_598;

	@OriginalMember(owner = "client!gb", name = "Sc", descriptor = "I")
	public int anInt1353;

	@OriginalMember(owner = "client!gb", name = "pc", descriptor = "I")
	public int anInt1331 = -1;

	@OriginalMember(owner = "client!gb", name = "sc", descriptor = "Z")
	public boolean aBoolean54 = false;

	@OriginalMember(owner = "client!gb", name = "uc", descriptor = "I")
	public int anInt1335 = -1;

	@OriginalMember(owner = "client!gb", name = "nc", descriptor = "I")
	public int anInt1329 = 0;

	@OriginalMember(owner = "client!gb", name = "rc", descriptor = "I")
	public int anInt1333 = 0;

	@OriginalMember(owner = "client!gb", name = "Fc", descriptor = "I")
	public int anInt1343 = 0;

	@OriginalMember(owner = "client!gb", name = "Gc", descriptor = "I")
	public int anInt1344 = 0;

	@OriginalMember(owner = "client!gb", name = "Mc", descriptor = "I")
	public int anInt1348 = 0;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!va;I)V")
	public void method980(@OriginalArg(0) Class2_Sub11 arg0) {
		arg0.anInt2077 = 0;
		@Pc(8) int local8 = arg0.method1461();
		this.anInt1335 = arg0.method1463();
		this.anInt1331 = arg0.method1463();
		this.anInt1344 = 0;
		@Pc(27) int local27 = -1;
		@Pc(30) int[] local30 = new int[12];
		@Pc(50) int local50;
		@Pc(90) int local90;
		for (@Pc(32) int local32 = 0; local32 < 12; local32++) {
			@Pc(38) int local38 = arg0.method1461();
			if (local38 == 0) {
				local30[local32] = 0;
			} else {
				local50 = arg0.method1461();
				local30[local32] = (local38 << 8) + local50;
				if (local32 == 0 && local30[0] == 65535) {
					local27 = arg0.method1456();
					break;
				}
				if (local30[local32] >= 512) {
					local90 = Static78.method577(local30[local32] - 512).anInt1495;
					if (local90 != 0) {
						this.anInt1344 = local90;
					}
				}
			}
		}
		@Pc(107) int[] local107 = new int[5];
		for (local50 = 0; local50 < 5; local50++) {
			local90 = arg0.method1461();
			if (local90 < 0 || Static58.aShortArrayArray40[local50].length <= local90) {
				local90 = 0;
			}
			local107[local50] = local90;
		}
		super.anInt3487 = arg0.method1456();
		if (super.anInt3487 == 65535) {
			super.anInt3487 = -1;
		}
		super.anInt3480 = arg0.method1456();
		if (super.anInt3480 == 65535) {
			super.anInt3480 = -1;
		}
		super.anInt3464 = super.anInt3480;
		super.anInt3493 = arg0.method1456();
		if (super.anInt3493 == 65535) {
			super.anInt3493 = -1;
		}
		super.anInt3455 = arg0.method1456();
		if (super.anInt3455 == 65535) {
			super.anInt3455 = -1;
		}
		super.anInt3482 = arg0.method1456();
		if (super.anInt3482 == 65535) {
			super.anInt3482 = -1;
		}
		super.anInt3466 = arg0.method1456();
		if (super.anInt3466 == 65535) {
			super.anInt3466 = -1;
		}
		super.anInt3494 = arg0.method1456();
		if (super.anInt3494 == 65535) {
			super.anInt3494 = -1;
		}
		this.aClass10_598 = Static36.method764(arg0.method1476()).method361();
		this.anInt1348 = arg0.method1461();
		this.anInt1333 = arg0.method1456();
		if (this.aClass74_2 == null) {
			this.aClass74_2 = new Class74();
		}
		this.aClass74_2.method2277(local27, local8 == 1, local30, local107);
	}

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "(I)Lclient!bh;")
	@Override
	public Class2_Sub1_Sub3_Sub3 method2544() {
		if (this.aClass74_2 == null) {
			return null;
		}
		@Pc(34) Class2_Sub1_Sub9 local34 = super.anInt3509 != -1 && super.anInt3481 == 0 ? Static19.method325(super.anInt3509) : null;
		@Pc(59) Class2_Sub1_Sub9 local59 = super.anInt3479 == -1 || this.aBoolean54 || super.anInt3487 == super.anInt3479 && local34 != null ? null : Static19.method325(super.anInt3479);
		@Pc(70) Class2_Sub1_Sub3_Sub3 local70 = this.aClass74_2.method2276(super.anInt3458, local59, super.anInt3507, local34);
		if (local70 == null) {
			return null;
		}
		local70.method825();
		super.anInt3505 = local70.anInt3614;
		@Pc(102) Class2_Sub1_Sub3_Sub3 local102;
		if (!this.aBoolean54 && super.anInt3508 != -1 && super.anInt3500 != -1) {
			local102 = Static76.method1260(super.anInt3508).method612(super.anInt3500);
			if (local102 != null) {
				local102.method822(0, -super.anInt3478, 0);
				local70 = local70.method824(local102);
			}
		}
		if (!this.aBoolean54 && this.aClass2_Sub1_Sub3_Sub3_1 != null) {
			if (this.anInt1329 <= Static14.anInt386) {
				this.aClass2_Sub1_Sub3_Sub3_1 = null;
			}
			if (this.anInt1343 <= Static14.anInt386 && Static14.anInt386 < this.anInt1329) {
				local102 = this.aClass2_Sub1_Sub3_Sub3_1;
				local102.method822(this.anInt1345 - super.anInt3454, -this.anInt1332 + this.anInt1342, this.anInt1353 - super.anInt3499);
				if (super.anInt3465 == 512) {
					local102.method817();
					local102.method817();
					local102.method817();
				} else if (super.anInt3465 == 1024) {
					local102.method817();
					local102.method817();
				} else if (super.anInt3465 == 1536) {
					local102.method817();
				}
				local70 = local70.method824(local102);
				if (super.anInt3465 == 512) {
					local102.method817();
				} else if (super.anInt3465 == 1024) {
					local102.method817();
					local102.method817();
				} else if (super.anInt3465 == 1536) {
					local102.method817();
					local102.method817();
					local102.method817();
				}
				local102.method822(super.anInt3454 - this.anInt1345, this.anInt1332 - this.anInt1342, super.anInt3499 - this.anInt1353);
			}
		}
		local70.aBoolean34 = true;
		return local70;
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method2467() {
		return this.aClass74_2 != null;
	}
}
