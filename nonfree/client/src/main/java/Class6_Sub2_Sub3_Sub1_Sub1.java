import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class6_Sub2_Sub3_Sub1_Sub1 extends Class6_Sub2_Sub3_Sub1 {

	@OriginalMember(owner = "client!cb", name = "id", descriptor = "Lclient!jb;")
	public Class6_Sub2_Sub3_Sub3 aClass6_Sub2_Sub3_Sub3_1;

	@OriginalMember(owner = "client!cb", name = "od", descriptor = "I")
	public int anInt672;

	@OriginalMember(owner = "client!cb", name = "qd", descriptor = "Lclient!be;")
	public Class8 aClass8_1;

	@OriginalMember(owner = "client!cb", name = "rd", descriptor = "I")
	public int anInt674;

	@OriginalMember(owner = "client!cb", name = "ud", descriptor = "Lclient!rc;")
	public Class55 aClass55_245;

	@OriginalMember(owner = "client!cb", name = "wd", descriptor = "I")
	public int anInt676;

	@OriginalMember(owner = "client!cb", name = "Bd", descriptor = "I")
	public int anInt680;

	@OriginalMember(owner = "client!cb", name = "Fd", descriptor = "I")
	public int anInt684;

	@OriginalMember(owner = "client!cb", name = "Kd", descriptor = "I")
	public int anInt687;

	@OriginalMember(owner = "client!cb", name = "Ld", descriptor = "I")
	public int anInt688;

	@OriginalMember(owner = "client!cb", name = "Nd", descriptor = "I")
	public int anInt689;

	@OriginalMember(owner = "client!cb", name = "Hd", descriptor = "I")
	public int anInt685 = 0;

	@OriginalMember(owner = "client!cb", name = "Dd", descriptor = "I")
	public int anInt682 = -1;

	@OriginalMember(owner = "client!cb", name = "xd", descriptor = "I")
	public int anInt677 = 0;

	@OriginalMember(owner = "client!cb", name = "yd", descriptor = "I")
	public int anInt678 = 0;

	@OriginalMember(owner = "client!cb", name = "ld", descriptor = "I")
	public int anInt670 = -1;

	@OriginalMember(owner = "client!cb", name = "Ad", descriptor = "I")
	public int anInt679 = 0;

	@OriginalMember(owner = "client!cb", name = "md", descriptor = "I")
	public int anInt671 = 0;

	@OriginalMember(owner = "client!cb", name = "kd", descriptor = "Z")
	public boolean aBoolean28 = false;

	@OriginalMember(owner = "client!cb", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method1826() {
		return this.aClass8_1 != null;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BLclient!b;)V")
	public void method446(@OriginalArg(1) Class6_Sub1 arg0) {
		arg0.anInt2209 = 0;
		@Pc(8) int local8 = arg0.method1495();
		this.anInt682 = arg0.method1484();
		this.anInt670 = arg0.method1484();
		this.anInt677 = 0;
		@Pc(28) int[] local28 = new int[12];
		@Pc(30) int local30 = -1;
		@Pc(53) int local53;
		@Pc(91) int local91;
		for (@Pc(32) int local32 = 0; local32 < 12; local32++) {
			@Pc(38) int local38 = arg0.method1495();
			if (local38 == 0) {
				local28[local32] = 0;
			} else {
				local53 = arg0.method1495();
				local28[local32] = (local38 << 8) + local53;
				if (local32 == 0 && local28[0] == 65535) {
					local30 = arg0.method1500();
					break;
				}
				if (local28[local32] >= 512) {
					local91 = Static58.method1195(local28[local32] - 512).anInt1103;
					if (local91 != 0) {
						this.anInt677 = local91;
					}
				}
			}
		}
		@Pc(106) int[] local106 = new int[5];
		for (local53 = 0; local53 < 5; local53++) {
			local91 = arg0.method1495();
			if (local91 < 0 || local91 >= Static72.anIntArrayArray16[local53].length) {
				local91 = 0;
			}
			local106[local53] = local91;
		}
		super.anInt2756 = arg0.method1500();
		if (super.anInt2756 == 65535) {
			super.anInt2756 = -1;
		}
		super.anInt2701 = arg0.method1500();
		if (super.anInt2701 == 65535) {
			super.anInt2701 = -1;
		}
		super.anInt2709 = super.anInt2701;
		super.anInt2747 = arg0.method1500();
		if (super.anInt2747 == 65535) {
			super.anInt2747 = -1;
		}
		super.anInt2751 = arg0.method1500();
		if (super.anInt2751 == 65535) {
			super.anInt2751 = -1;
		}
		super.anInt2732 = arg0.method1500();
		if (super.anInt2732 == 65535) {
			super.anInt2732 = -1;
		}
		super.anInt2736 = arg0.method1500();
		if (super.anInt2736 == 65535) {
			super.anInt2736 = -1;
		}
		super.anInt2697 = arg0.method1500();
		if (super.anInt2697 == 65535) {
			super.anInt2697 = -1;
		}
		this.aClass55_245 = Static50.method2085(arg0.method1470()).method1655();
		this.anInt679 = arg0.method1495();
		this.anInt685 = arg0.method1500();
		if (this.aClass8_1 == null) {
			this.aClass8_1 = new Class8();
		}
		this.aClass8_1.method330(local8 == 1, local106, local28, local30);
	}

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "(I)Lclient!jb;")
	@Override
	public Class6_Sub2_Sub3_Sub3 method2063() {
		if (this.aClass8_1 == null) {
			return null;
		}
		@Pc(35) Class6_Sub2_Sub13 local35 = super.anInt2717 != -1 && super.anInt2711 == 0 ? Static4.method1608(super.anInt2717) : null;
		@Pc(60) Class6_Sub2_Sub13 local60 = super.anInt2741 == -1 || this.aBoolean28 || super.anInt2741 == super.anInt2756 && local35 != null ? null : Static4.method1608(super.anInt2741);
		@Pc(71) Class6_Sub2_Sub3_Sub3 local71 = this.aClass8_1.method331(super.anInt2738, super.anInt2734, local35, local60);
		if (local71 == null) {
			return null;
		}
		local71.method970();
		super.anInt2723 = local71.anInt3206;
		@Pc(103) Class6_Sub2_Sub3_Sub3 local103;
		@Pc(123) Class6_Sub2_Sub3_Sub3[] local123;
		if (!this.aBoolean28 && super.anInt2722 != -1 && super.anInt2699 != -1) {
			local103 = Static98.method1873(super.anInt2722).method1404(super.anInt2699);
			if (local103 != null) {
				local103.method971(0, -super.anInt2700, 0);
				local123 = new Class6_Sub2_Sub3_Sub3[] { local71, local103 };
				local71 = new Class6_Sub2_Sub3_Sub3(local123, 2, true);
			}
		}
		if (!this.aBoolean28 && this.aClass6_Sub2_Sub3_Sub3_1 != null) {
			if (this.anInt671 <= Static85.anInt2389) {
				this.aClass6_Sub2_Sub3_Sub3_1 = null;
			}
			if (Static85.anInt2389 >= this.anInt678 && Static85.anInt2389 < this.anInt671) {
				local103 = this.aClass6_Sub2_Sub3_Sub3_1;
				local103.method971(this.anInt680 - super.anInt2710, -this.anInt684 + this.anInt687, this.anInt672 - super.anInt2744);
				if (super.anInt2727 == 512) {
					local103.method968();
					local103.method968();
					local103.method968();
				} else if (super.anInt2727 == 1024) {
					local103.method968();
					local103.method968();
				} else if (super.anInt2727 == 1536) {
					local103.method968();
				}
				local123 = new Class6_Sub2_Sub3_Sub3[] { local71, local103 };
				local71 = new Class6_Sub2_Sub3_Sub3(local123, 2, true);
				if (super.anInt2727 == 512) {
					local103.method968();
				} else if (super.anInt2727 == 1024) {
					local103.method968();
					local103.method968();
				} else if (super.anInt2727 == 1536) {
					local103.method968();
					local103.method968();
					local103.method968();
				}
				local103.method971(super.anInt2710 - this.anInt680, -this.anInt687 + this.anInt684, super.anInt2744 - this.anInt672);
			}
		}
		local71.aBoolean66 = true;
		return local71;
	}
}
