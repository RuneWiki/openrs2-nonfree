import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class10_Sub1_Sub5_Sub2_Sub2 extends Class10_Sub1_Sub5_Sub2 {

	@OriginalMember(owner = "client!me", name = "yc", descriptor = "I")
	public int anInt1689;

	@OriginalMember(owner = "client!me", name = "Ac", descriptor = "I")
	public int anInt1691;

	@OriginalMember(owner = "client!me", name = "Bc", descriptor = "I")
	public int anInt1692;

	@OriginalMember(owner = "client!me", name = "Dc", descriptor = "I")
	public int anInt1694;

	@OriginalMember(owner = "client!me", name = "Ic", descriptor = "I")
	public int anInt1699;

	@OriginalMember(owner = "client!me", name = "Jc", descriptor = "Lclient!va;")
	public Class61 aClass61_699;

	@OriginalMember(owner = "client!me", name = "Kc", descriptor = "I")
	public int anInt1700;

	@OriginalMember(owner = "client!me", name = "Mc", descriptor = "Lclient!nd;")
	public Class44 aClass44_1;

	@OriginalMember(owner = "client!me", name = "Qc", descriptor = "I")
	public int anInt1705;

	@OriginalMember(owner = "client!me", name = "Vc", descriptor = "Lclient!rb;")
	public Class10_Sub1_Sub5_Sub4 aClass10_Sub1_Sub5_Sub4_1;

	@OriginalMember(owner = "client!me", name = "Wc", descriptor = "I")
	public int anInt1708;

	@OriginalMember(owner = "client!me", name = "zc", descriptor = "I")
	public int anInt1690 = -1;

	@OriginalMember(owner = "client!me", name = "Fc", descriptor = "I")
	public int anInt1696 = 0;

	@OriginalMember(owner = "client!me", name = "Ec", descriptor = "I")
	public int anInt1695 = 0;

	@OriginalMember(owner = "client!me", name = "Nc", descriptor = "I")
	public int anInt1702 = 0;

	@OriginalMember(owner = "client!me", name = "Pc", descriptor = "I")
	public int anInt1704 = -1;

	@OriginalMember(owner = "client!me", name = "Sc", descriptor = "Z")
	public boolean aBoolean81 = false;

	@OriginalMember(owner = "client!me", name = "Uc", descriptor = "I")
	public int anInt1707 = 0;

	@OriginalMember(owner = "client!me", name = "Rc", descriptor = "I")
	public int anInt1706 = 0;

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(I)Lclient!rb;")
	@Override
	protected Class10_Sub1_Sub5_Sub4 method1663() {
		if (this.aClass44_1 == null) {
			return null;
		}
		@Pc(25) Class10_Sub1_Sub6 local25 = super.anInt1688 != -1 && super.anInt1675 == 0 ? Static5.method33(super.anInt1688) : null;
		@Pc(51) Class10_Sub1_Sub6 local51 = super.anInt1674 == -1 || this.aBoolean81 || super.anInt1647 == super.anInt1674 && local25 != null ? null : Static5.method33(super.anInt1674);
		@Pc(62) Class10_Sub1_Sub5_Sub4 local62 = this.aClass44_1.method960(super.anInt1641, local51, local25, super.anInt1680);
		if (local62 == null) {
			return null;
		}
		local62.method1338();
		super.anInt1679 = local62.anInt2674;
		@Pc(98) Class10_Sub1_Sub5_Sub4 local98;
		@Pc(118) Class10_Sub1_Sub5_Sub4[] local118;
		if (!this.aBoolean81 && super.anInt1655 != -1 && super.anInt1640 != -1) {
			local98 = Static51.method789(super.anInt1655).method1273(super.anInt1640);
			if (local98 != null) {
				local98.method1315(0, -super.anInt1670, 0);
				local118 = new Class10_Sub1_Sub5_Sub4[] { local62, local98 };
				local62 = new Class10_Sub1_Sub5_Sub4(local118, 2, true);
			}
		}
		if (!this.aBoolean81 && this.aClass10_Sub1_Sub5_Sub4_1 != null) {
			if (this.anInt1706 <= Static95.anInt2442) {
				this.aClass10_Sub1_Sub5_Sub4_1 = null;
			}
			if (this.anInt1695 <= Static95.anInt2442 && this.anInt1706 > Static95.anInt2442) {
				local98 = this.aClass10_Sub1_Sub5_Sub4_1;
				local98.method1315(this.anInt1700 - super.anInt1654, this.anInt1708 + -this.anInt1692, this.anInt1694 - super.anInt1649);
				local118 = new Class10_Sub1_Sub5_Sub4[] { local62, local98 };
				if (super.anInt1634 == 512) {
					local98.method1312();
					local98.method1312();
					local98.method1312();
				} else if (super.anInt1634 == 1024) {
					local98.method1312();
					local98.method1312();
				} else if (super.anInt1634 == 1536) {
					local98.method1312();
				}
				local62 = new Class10_Sub1_Sub5_Sub4(local118, 2, true);
				if (super.anInt1634 == 512) {
					local98.method1312();
				} else if (super.anInt1634 == 1024) {
					local98.method1312();
					local98.method1312();
				} else if (super.anInt1634 == 1536) {
					local98.method1312();
					local98.method1312();
					local98.method1312();
				}
				local98.method1315(super.anInt1654 - this.anInt1700, -this.anInt1708 + this.anInt1692, super.anInt1649 - this.anInt1694);
			}
		}
		local62.aBoolean98 = true;
		return local62;
	}

	@OriginalMember(owner = "client!me", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method927() {
		return this.aClass44_1 != null;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!tc;Z)V")
	public void method930(@OriginalArg(0) Class10_Sub10 arg0) {
		arg0.anInt1957 = 0;
		@Pc(12) int local12 = arg0.method1111();
		this.anInt1704 = arg0.method1131();
		@Pc(20) int[] local20 = new int[12];
		@Pc(22) int local22 = -1;
		this.anInt1690 = arg0.method1131();
		this.anInt1707 = 0;
		@Pc(63) int local63;
		@Pc(103) int local103;
		for (@Pc(41) int local41 = 0; local41 < 12; local41++) {
			@Pc(51) int local51 = arg0.method1111();
			if (local51 == 0) {
				local20[local41] = 0;
			} else {
				local63 = arg0.method1111();
				local20[local41] = (local51 << 8) + local63;
				if (local41 == 0 && local20[0] == 65535) {
					local22 = arg0.method1160();
					break;
				}
				if (local20[local41] >= 512) {
					local103 = Static94.method1491(local20[local41] - 512).anInt2544;
					if (local103 != 0) {
						this.anInt1707 = local103;
					}
				}
			}
		}
		@Pc(115) int[] local115 = new int[5];
		for (local63 = 0; local63 < 5; local63++) {
			local103 = arg0.method1111();
			if (local103 < 0 || Static33.anIntArrayArray9[local63].length <= local103) {
				local103 = 0;
			}
			local115[local63] = local103;
		}
		super.anInt1647 = arg0.method1160();
		if (super.anInt1647 == 65535) {
			super.anInt1647 = -1;
		}
		super.anInt1645 = arg0.method1160();
		if (super.anInt1645 == 65535) {
			super.anInt1645 = -1;
		}
		super.anInt1668 = arg0.method1160();
		if (super.anInt1668 == 65535) {
			super.anInt1668 = -1;
		}
		super.anInt1662 = arg0.method1160();
		if (super.anInt1662 == 65535) {
			super.anInt1662 = -1;
		}
		super.anInt1630 = arg0.method1160();
		if (super.anInt1630 == 65535) {
			super.anInt1630 = -1;
		}
		super.anInt1665 = arg0.method1160();
		if (super.anInt1665 == 65535) {
			super.anInt1665 = -1;
		}
		super.anInt1644 = arg0.method1160();
		if (super.anInt1644 == 65535) {
			super.anInt1644 = -1;
		}
		this.aClass61_699 = Static78.method1234(arg0.method1144()).method1617();
		this.anInt1702 = arg0.method1111();
		this.anInt1696 = arg0.method1160();
		if (this.aClass44_1 == null) {
			this.aClass44_1 = new Class44();
		}
		this.aClass44_1.method969(local115, local22, local12 == 1, local20);
	}
}
