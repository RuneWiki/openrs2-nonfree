import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class2_Sub1_Sub1_Sub1_Sub1 extends Class2_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!aa", name = "wd", descriptor = "I")
	public int anInt280;

	@OriginalMember(owner = "client!aa", name = "Ad", descriptor = "I")
	public int anInt283;

	@OriginalMember(owner = "client!aa", name = "Dd", descriptor = "Lclient!pa;")
	public Class2_Sub1_Sub1_Sub5 aClass2_Sub1_Sub1_Sub5_1;

	@OriginalMember(owner = "client!aa", name = "Jd", descriptor = "I")
	public int anInt289;

	@OriginalMember(owner = "client!aa", name = "Kd", descriptor = "I")
	public int anInt290;

	@OriginalMember(owner = "client!aa", name = "Od", descriptor = "I")
	public int anInt293;

	@OriginalMember(owner = "client!aa", name = "Qd", descriptor = "Lclient!a;")
	public Class1 aClass1_264;

	@OriginalMember(owner = "client!aa", name = "Td", descriptor = "I")
	public int anInt297;

	@OriginalMember(owner = "client!aa", name = "Ud", descriptor = "Lclient!la;")
	public Class33 aClass33_1;

	@OriginalMember(owner = "client!aa", name = "be", descriptor = "I")
	public int anInt300;

	@OriginalMember(owner = "client!aa", name = "de", descriptor = "I")
	public int anInt301;

	@OriginalMember(owner = "client!aa", name = "yd", descriptor = "I")
	public int anInt281 = 0;

	@OriginalMember(owner = "client!aa", name = "Ed", descriptor = "I")
	public int anInt286 = 0;

	@OriginalMember(owner = "client!aa", name = "vd", descriptor = "I")
	public int anInt279 = 0;

	@OriginalMember(owner = "client!aa", name = "Ld", descriptor = "I")
	public int anInt291 = -1;

	@OriginalMember(owner = "client!aa", name = "Gd", descriptor = "I")
	public int anInt288 = -1;

	@OriginalMember(owner = "client!aa", name = "Md", descriptor = "I")
	public int anInt292 = 0;

	@OriginalMember(owner = "client!aa", name = "Vd", descriptor = "I")
	public int anInt298 = 0;

	@OriginalMember(owner = "client!aa", name = "Zd", descriptor = "Z")
	public boolean aBoolean8 = false;

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "(I)Lclient!pa;")
	@Override
	public Class2_Sub1_Sub1_Sub5 method1778() {
		if (this.aClass33_1 == null) {
			return null;
		}
		@Pc(35) Class2_Sub1_Sub9 local35 = super.anInt2759 != -1 && super.anInt2744 == 0 ? Static4.method192(super.anInt2759) : null;
		@Pc(57) Class2_Sub1_Sub9 local57 = super.anInt2708 == -1 || this.aBoolean8 || super.anInt2747 == super.anInt2708 && local35 != null ? null : Static4.method192(super.anInt2708);
		@Pc(68) Class2_Sub1_Sub1_Sub5 local68 = this.aClass33_1.method1243(local35, local57, super.anInt2739, super.anInt2730);
		if (local68 == null) {
			return null;
		}
		local68.method1400();
		super.anInt2740 = local68.anInt2698;
		@Pc(99) Class2_Sub1_Sub1_Sub5 local99;
		@Pc(119) Class2_Sub1_Sub1_Sub5[] local119;
		if (!this.aBoolean8 && super.anInt2718 != -1 && super.anInt2758 != -1) {
			local99 = Static65.method1339(super.anInt2718).method715(super.anInt2758);
			if (local99 != null) {
				local99.method1429(0, -super.anInt2735, 0);
				local119 = new Class2_Sub1_Sub1_Sub5[] { local68, local99 };
				local68 = new Class2_Sub1_Sub1_Sub5(local119, 2, true);
			}
		}
		if (!this.aBoolean8 && this.aClass2_Sub1_Sub1_Sub5_1 != null) {
			if (Static69.anInt2806 >= this.anInt292) {
				this.aClass2_Sub1_Sub1_Sub5_1 = null;
			}
			if (this.anInt298 <= Static69.anInt2806 && this.anInt292 > Static69.anInt2806) {
				local99 = this.aClass2_Sub1_Sub1_Sub5_1;
				local99.method1429(this.anInt289 - super.anInt2724, -this.anInt293 + this.anInt290, this.anInt301 - super.anInt2717);
				if (super.anInt2711 == 512) {
					local99.method1414();
					local99.method1414();
					local99.method1414();
				} else if (super.anInt2711 == 1024) {
					local99.method1414();
					local99.method1414();
				} else if (super.anInt2711 == 1536) {
					local99.method1414();
				}
				local119 = new Class2_Sub1_Sub1_Sub5[] { local68, local99 };
				local68 = new Class2_Sub1_Sub1_Sub5(local119, 2, true);
				if (super.anInt2711 == 512) {
					local99.method1414();
				} else if (super.anInt2711 == 1024) {
					local99.method1414();
					local99.method1414();
				} else if (super.anInt2711 == 1536) {
					local99.method1414();
					local99.method1414();
					local99.method1414();
				}
				local99.method1429(super.anInt2724 - this.anInt289, -this.anInt290 + this.anInt293, super.anInt2717 - this.anInt301);
			}
		}
		local68.aBoolean111 = true;
		return local68;
	}

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method1783() {
		return this.aClass33_1 != null;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BLclient!ba;)V")
	public void method119(@OriginalArg(1) Class2_Sub3 arg0) {
		arg0.anInt1168 = 0;
		@Pc(12) int local12 = arg0.method791();
		this.anInt288 = arg0.method831();
		this.anInt291 = arg0.method831();
		@Pc(24) int local24 = -1;
		this.anInt286 = 0;
		@Pc(30) int[] local30 = new int[12];
		@Pc(58) int local58;
		@Pc(98) int local98;
		for (@Pc(37) int local37 = 0; local37 < 12; local37++) {
			@Pc(43) int local43 = arg0.method791();
			if (local43 == 0) {
				local30[local37] = 0;
			} else {
				local58 = arg0.method791();
				local30[local37] = (local43 << 8) + local58;
				if (local37 == 0 && local30[0] == 65535) {
					local24 = arg0.method792();
					break;
				}
				if (local30[local37] >= 512) {
					local98 = Static73.method1374(local30[local37] - 512).anInt2441;
					if (local98 != 0) {
						this.anInt286 = local98;
					}
				}
			}
		}
		@Pc(113) int[] local113 = new int[5];
		for (local58 = 0; local58 < 5; local58++) {
			local98 = arg0.method791();
			if (local98 < 0 || Static97.anIntArrayArray22[local58].length <= local98) {
				local98 = 0;
			}
			local113[local58] = local98;
		}
		super.anInt2747 = arg0.method792();
		if (super.anInt2747 == 65535) {
			super.anInt2747 = -1;
		}
		super.anInt2762 = arg0.method792();
		if (super.anInt2762 == 65535) {
			super.anInt2762 = -1;
		}
		super.anInt2714 = super.anInt2762;
		super.anInt2752 = arg0.method792();
		if (super.anInt2752 == 65535) {
			super.anInt2752 = -1;
		}
		super.anInt2710 = arg0.method792();
		if (super.anInt2710 == 65535) {
			super.anInt2710 = -1;
		}
		super.anInt2706 = arg0.method792();
		if (super.anInt2706 == 65535) {
			super.anInt2706 = -1;
		}
		super.anInt2753 = arg0.method792();
		if (super.anInt2753 == 65535) {
			super.anInt2753 = -1;
		}
		super.anInt2713 = arg0.method792();
		if (super.anInt2713 == 65535) {
			super.anInt2713 = -1;
		}
		this.aClass1_264 = Static99.method1668(arg0.method821()).method36();
		this.anInt281 = arg0.method791();
		this.anInt279 = arg0.method792();
		if (this.aClass33_1 == null) {
			this.aClass33_1 = new Class33();
		}
		this.aClass33_1.method1246(local30, local12 == 1, local113, local24);
	}
}
