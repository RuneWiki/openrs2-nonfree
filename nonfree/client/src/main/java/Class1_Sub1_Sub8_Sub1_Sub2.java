import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class1_Sub1_Sub8_Sub1_Sub2 extends Class1_Sub1_Sub8_Sub1 {

	@OriginalMember(owner = "client!v", name = "Uc", descriptor = "I")
	public int anInt2611;

	@OriginalMember(owner = "client!v", name = "Wc", descriptor = "I")
	public int anInt2613;

	@OriginalMember(owner = "client!v", name = "Zc", descriptor = "Lclient!hb;")
	public Class29 aClass29_2;

	@OriginalMember(owner = "client!v", name = "ad", descriptor = "I")
	public int anInt2616;

	@OriginalMember(owner = "client!v", name = "dd", descriptor = "I")
	public int anInt2619;

	@OriginalMember(owner = "client!v", name = "jd", descriptor = "I")
	public int anInt2624;

	@OriginalMember(owner = "client!v", name = "nd", descriptor = "I")
	public int anInt2626;

	@OriginalMember(owner = "client!v", name = "qd", descriptor = "Lclient!pc;")
	public Class1_Sub1_Sub8_Sub3 aClass1_Sub1_Sub8_Sub3_3;

	@OriginalMember(owner = "client!v", name = "rd", descriptor = "I")
	public int anInt2627;

	@OriginalMember(owner = "client!v", name = "Dd", descriptor = "Lclient!mc;")
	public Class42 aClass42_1396;

	@OriginalMember(owner = "client!v", name = "Gd", descriptor = "I")
	public int anInt2640;

	@OriginalMember(owner = "client!v", name = "gd", descriptor = "I")
	public int anInt2622 = 0;

	@OriginalMember(owner = "client!v", name = "cd", descriptor = "I")
	public int anInt2618 = 0;

	@OriginalMember(owner = "client!v", name = "ld", descriptor = "Z")
	public boolean aBoolean142 = false;

	@OriginalMember(owner = "client!v", name = "ed", descriptor = "I")
	public int anInt2620 = -1;

	@OriginalMember(owner = "client!v", name = "sd", descriptor = "I")
	public int anInt2628 = 0;

	@OriginalMember(owner = "client!v", name = "Cd", descriptor = "I")
	public int anInt2638 = 0;

	@OriginalMember(owner = "client!v", name = "yd", descriptor = "I")
	public int anInt2634 = 0;

	@OriginalMember(owner = "client!v", name = "kd", descriptor = "I")
	public int anInt2625 = -1;

	@OriginalMember(owner = "client!v", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method1763() {
		return this.aClass29_2 != null;
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(Z)Lclient!pc;")
	@Override
	protected Class1_Sub1_Sub8_Sub3 method1835() {
		if (this.aClass29_2 == null) {
			return null;
		}
		@Pc(28) Class1_Sub1_Sub14 local28 = super.anInt2601 != -1 && super.anInt2570 == 0 ? Static30.method574(super.anInt2601) : null;
		@Pc(54) Class1_Sub1_Sub14 local54 = super.anInt2563 == -1 || this.aBoolean142 || super.anInt2567 == super.anInt2563 && local28 != null ? null : Static30.method574(super.anInt2563);
		@Pc(65) Class1_Sub1_Sub8_Sub3 local65 = this.aClass29_2.method632(super.anInt2607, super.anInt2600, local54, local28);
		if (local65 == null) {
			return null;
		}
		local65.method1392();
		super.anInt2573 = local65.anInt2716;
		@Pc(97) Class1_Sub1_Sub8_Sub3 local97;
		@Pc(117) Class1_Sub1_Sub8_Sub3[] local117;
		if (!this.aBoolean142 && super.anInt2560 != -1 && super.anInt2593 != -1) {
			local97 = Static53.method1838(super.anInt2560).method1256(super.anInt2593);
			if (local97 != null) {
				local97.method1375(0, -super.anInt2605, 0);
				local117 = new Class1_Sub1_Sub8_Sub3[] { local65, local97 };
				local65 = new Class1_Sub1_Sub8_Sub3(local117, 2, true);
			}
		}
		if (!this.aBoolean142 && this.aClass1_Sub1_Sub8_Sub3_3 != null) {
			if (this.anInt2634 <= Static27.anInt768) {
				this.aClass1_Sub1_Sub8_Sub3_3 = null;
			}
			if (Static27.anInt768 >= this.anInt2638 && this.anInt2634 > Static27.anInt768) {
				local97 = this.aClass1_Sub1_Sub8_Sub3_3;
				local117 = new Class1_Sub1_Sub8_Sub3[] { local65, local97 };
				local97.method1375(this.anInt2613 - super.anInt2576, this.anInt2624 - this.anInt2616, this.anInt2619 - super.anInt2583);
				if (super.anInt2606 == 512) {
					local97.method1390();
					local97.method1390();
					local97.method1390();
				} else if (super.anInt2606 == 1024) {
					local97.method1390();
					local97.method1390();
				} else if (super.anInt2606 == 1536) {
					local97.method1390();
				}
				local65 = new Class1_Sub1_Sub8_Sub3(local117, 2, true);
				if (super.anInt2606 == 512) {
					local97.method1390();
				} else if (super.anInt2606 == 1024) {
					local97.method1390();
					local97.method1390();
				} else if (super.anInt2606 == 1536) {
					local97.method1390();
					local97.method1390();
					local97.method1390();
				}
				local97.method1375(super.anInt2576 - this.anInt2613, this.anInt2616 + -this.anInt2624, super.anInt2583 - this.anInt2619);
			}
		}
		local65.aBoolean108 = true;
		return local65;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(BLclient!ka;)V")
	public void method1771(@OriginalArg(1) Class1_Sub8 arg0) {
		arg0.anInt1692 = 0;
		@Pc(9) int[] local9 = new int[12];
		@Pc(11) int local11 = -1;
		@Pc(15) int local15 = arg0.method1186();
		this.anInt2620 = arg0.method1209();
		this.anInt2625 = arg0.method1209();
		this.anInt2618 = 0;
		@Pc(49) int local49;
		@Pc(88) int local88;
		for (@Pc(30) int local30 = 0; local30 < 12; local30++) {
			@Pc(35) int local35 = arg0.method1186();
			if (local35 == 0) {
				local9[local30] = 0;
			} else {
				local49 = arg0.method1186();
				local9[local30] = (local35 << 8) + local49;
				if (local30 == 0 && local9[0] == 65535) {
					local11 = arg0.method1199();
					break;
				}
				if (local9[local30] >= 512) {
					local88 = Static36.method617(local9[local30] - 512).anInt228;
					if (local88 != 0) {
						this.anInt2618 = local88;
					}
				}
			}
		}
		@Pc(103) int[] local103 = new int[5];
		for (local49 = 0; local49 < 5; local49++) {
			local88 = arg0.method1186();
			if (local88 < 0 || Static45.anIntArrayArray18[local49].length <= local88) {
				local88 = 0;
			}
			local103[local49] = local88;
		}
		super.anInt2567 = arg0.method1199();
		if (super.anInt2567 == 65535) {
			super.anInt2567 = -1;
		}
		super.anInt2579 = arg0.method1199();
		if (super.anInt2579 == 65535) {
			super.anInt2579 = -1;
		}
		super.anInt2585 = super.anInt2579;
		super.anInt2578 = arg0.method1199();
		if (super.anInt2578 == 65535) {
			super.anInt2578 = -1;
		}
		super.anInt2556 = arg0.method1199();
		if (super.anInt2556 == 65535) {
			super.anInt2556 = -1;
		}
		super.anInt2561 = arg0.method1199();
		if (super.anInt2561 == 65535) {
			super.anInt2561 = -1;
		}
		super.anInt2552 = arg0.method1199();
		if (super.anInt2552 == 65535) {
			super.anInt2552 = -1;
		}
		super.anInt2592 = arg0.method1199();
		if (super.anInt2592 == 65535) {
			super.anInt2592 = -1;
		}
		this.aClass42_1396 = Static64.method1096(arg0.method1224()).method1058();
		this.anInt2622 = arg0.method1186();
		this.anInt2628 = arg0.method1199();
		if (this.aClass29_2 == null) {
			this.aClass29_2 = new Class29();
		}
		this.aClass29_2.method634(local15 == 1, local103, local9, local11);
	}
}
