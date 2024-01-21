import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class3_Sub1_Sub1_Sub1_Sub2 extends Class3_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!kd", name = "Lc", descriptor = "I")
	public int anInt1585;

	@OriginalMember(owner = "client!kd", name = "Nc", descriptor = "I")
	public int anInt1587;

	@OriginalMember(owner = "client!kd", name = "Rc", descriptor = "I")
	public int anInt1591;

	@OriginalMember(owner = "client!kd", name = "Tc", descriptor = "I")
	public int anInt1593;

	@OriginalMember(owner = "client!kd", name = "Wc", descriptor = "Lclient!nc;")
	public Class48 aClass48_2;

	@OriginalMember(owner = "client!kd", name = "Yc", descriptor = "I")
	public int anInt1595;

	@OriginalMember(owner = "client!kd", name = "Zc", descriptor = "I")
	public int anInt1596;

	@OriginalMember(owner = "client!kd", name = "ad", descriptor = "Lclient!v;")
	public Class3_Sub1_Sub1_Sub6 aClass3_Sub1_Sub1_Sub6_1;

	@OriginalMember(owner = "client!kd", name = "bd", descriptor = "Lclient!ae;")
	public Class5 aClass5_765;

	@OriginalMember(owner = "client!kd", name = "cd", descriptor = "I")
	public int anInt1597;

	@OriginalMember(owner = "client!kd", name = "ed", descriptor = "I")
	public int anInt1599;

	@OriginalMember(owner = "client!kd", name = "Kc", descriptor = "I")
	public int anInt1584 = -1;

	@OriginalMember(owner = "client!kd", name = "Ic", descriptor = "I")
	public int anInt1582 = -1;

	@OriginalMember(owner = "client!kd", name = "Qc", descriptor = "I")
	public int anInt1590 = 0;

	@OriginalMember(owner = "client!kd", name = "Gc", descriptor = "Z")
	public boolean aBoolean73 = false;

	@OriginalMember(owner = "client!kd", name = "dd", descriptor = "I")
	public int anInt1598 = 0;

	@OriginalMember(owner = "client!kd", name = "Hc", descriptor = "I")
	public int anInt1581 = 0;

	@OriginalMember(owner = "client!kd", name = "Jc", descriptor = "I")
	public int anInt1583 = 0;

	@OriginalMember(owner = "client!kd", name = "id", descriptor = "I")
	public int anInt1602 = 0;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BLclient!m;)V")
	public void method1002(@OriginalArg(1) Class3_Sub6 arg0) {
		arg0.anInt2416 = 0;
		@Pc(12) int local12 = arg0.method1587();
		this.anInt1584 = arg0.method1605();
		@Pc(20) int[] local20 = new int[12];
		this.anInt1582 = arg0.method1605();
		this.anInt1602 = 0;
		@Pc(34) int local34 = -1;
		@Pc(54) int local54;
		@Pc(94) int local94;
		for (@Pc(36) int local36 = 0; local36 < 12; local36++) {
			@Pc(42) int local42 = arg0.method1587();
			if (local42 == 0) {
				local20[local36] = 0;
			} else {
				local54 = arg0.method1587();
				local20[local36] = local54 + (local42 << 8);
				if (local36 == 0 && local20[0] == 65535) {
					local34 = arg0.method1603();
					break;
				}
				if (local20[local36] >= 512) {
					local94 = Static37.method694(local20[local36] - 512).anInt665;
					if (local94 != 0) {
						this.anInt1602 = local94;
					}
				}
			}
		}
		@Pc(108) int[] local108 = new int[5];
		for (local54 = 0; local54 < 5; local54++) {
			local94 = arg0.method1587();
			if (local94 < 0 || Static42.anIntArrayArray10[local54].length <= local94) {
				local94 = 0;
			}
			local108[local54] = local94;
		}
		super.anInt1579 = arg0.method1603();
		if (super.anInt1579 == 65535) {
			super.anInt1579 = -1;
		}
		super.anInt1530 = arg0.method1603();
		if (super.anInt1530 == 65535) {
			super.anInt1530 = -1;
		}
		super.anInt1549 = super.anInt1530;
		super.anInt1531 = arg0.method1603();
		if (super.anInt1531 == 65535) {
			super.anInt1531 = -1;
		}
		super.anInt1529 = arg0.method1603();
		if (super.anInt1529 == 65535) {
			super.anInt1529 = -1;
		}
		super.anInt1521 = arg0.method1603();
		if (super.anInt1521 == 65535) {
			super.anInt1521 = -1;
		}
		super.anInt1550 = arg0.method1603();
		if (super.anInt1550 == 65535) {
			super.anInt1550 = -1;
		}
		super.anInt1559 = arg0.method1603();
		if (super.anInt1559 == 65535) {
			super.anInt1559 = -1;
		}
		this.aClass5_765 = Static82.method1301(arg0.method1598()).method147();
		this.anInt1581 = arg0.method1587();
		this.anInt1583 = arg0.method1603();
		if (this.aClass48_2 == null) {
			this.aClass48_2 = new Class48();
		}
		this.aClass48_2.method1228(local20, local12 == 1, local108, local34);
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(Z)Lclient!v;")
	@Override
	public Class3_Sub1_Sub1_Sub6 method1792() {
		if (this.aClass48_2 == null) {
			return null;
		}
		@Pc(27) Class3_Sub1_Sub11 local27 = super.anInt1536 != -1 && super.anInt1570 == 0 ? Static31.method778(super.anInt1536) : null;
		@Pc(53) Class3_Sub1_Sub11 local53 = super.anInt1568 == -1 || this.aBoolean73 || super.anInt1579 == super.anInt1568 && local27 != null ? null : Static31.method778(super.anInt1568);
		@Pc(64) Class3_Sub1_Sub1_Sub6 local64 = this.aClass48_2.method1225(local53, local27, super.anInt1532, super.anInt1571);
		if (local64 == null) {
			return null;
		}
		local64.method1800();
		super.anInt1572 = local64.anInt2758;
		@Pc(94) Class3_Sub1_Sub1_Sub6 local94;
		@Pc(114) Class3_Sub1_Sub1_Sub6[] local114;
		if (!this.aBoolean73 && super.anInt1538 != -1 && super.anInt1545 != -1) {
			local94 = Static61.method1063(super.anInt1538).method1935(super.anInt1545);
			if (local94 != null) {
				local94.method1812(0, -super.anInt1555, 0);
				local114 = new Class3_Sub1_Sub1_Sub6[] { local64, local94 };
				local64 = new Class3_Sub1_Sub1_Sub6(local114, 2, true);
			}
		}
		if (!this.aBoolean73 && this.aClass3_Sub1_Sub1_Sub6_1 != null) {
			if (this.anInt1598 <= Static3.anInt289) {
				this.aClass3_Sub1_Sub1_Sub6_1 = null;
			}
			if (Static3.anInt289 >= this.anInt1590 && Static3.anInt289 < this.anInt1598) {
				local94 = this.aClass3_Sub1_Sub1_Sub6_1;
				local94.method1812(this.anInt1593 - super.anInt1567, -this.anInt1599 + this.anInt1596, this.anInt1595 - super.anInt1543);
				local114 = new Class3_Sub1_Sub1_Sub6[] { local64, local94 };
				if (super.anInt1560 == 512) {
					local94.method1813();
					local94.method1813();
					local94.method1813();
				} else if (super.anInt1560 == 1024) {
					local94.method1813();
					local94.method1813();
				} else if (super.anInt1560 == 1536) {
					local94.method1813();
				}
				local64 = new Class3_Sub1_Sub1_Sub6(local114, 2, true);
				if (super.anInt1560 == 512) {
					local94.method1813();
				} else if (super.anInt1560 == 1024) {
					local94.method1813();
					local94.method1813();
				} else if (super.anInt1560 == 1536) {
					local94.method1813();
					local94.method1813();
					local94.method1813();
				}
				local94.method1812(super.anInt1567 - this.anInt1593, -this.anInt1596 + this.anInt1599, super.anInt1543 - this.anInt1595);
			}
		}
		local64.aBoolean149 = true;
		return local64;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method993() {
		return this.aClass48_2 != null;
	}
}
