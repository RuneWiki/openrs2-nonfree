import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class2_Sub4_Sub1_Sub1_Sub2 extends Class2_Sub4_Sub1_Sub1 {

	@OriginalMember(owner = "client!gf", name = "ad", descriptor = "I")
	public int anInt1655;

	@OriginalMember(owner = "client!gf", name = "gd", descriptor = "Lclient!gg;")
	public Class28 aClass28_953;

	@OriginalMember(owner = "client!gf", name = "kd", descriptor = "I")
	public int anInt1661;

	@OriginalMember(owner = "client!gf", name = "nd", descriptor = "Lclient!be;")
	public Class6 aClass6_2;

	@OriginalMember(owner = "client!gf", name = "qd", descriptor = "I")
	public int anInt1664;

	@OriginalMember(owner = "client!gf", name = "Bd", descriptor = "I")
	public int anInt1672;

	@OriginalMember(owner = "client!gf", name = "Ed", descriptor = "I")
	public int anInt1674;

	@OriginalMember(owner = "client!gf", name = "Fd", descriptor = "Lclient!df;")
	public Class2_Sub4_Sub1_Sub3 aClass2_Sub4_Sub1_Sub3_1;

	@OriginalMember(owner = "client!gf", name = "Hd", descriptor = "I")
	public int anInt1675;

	@OriginalMember(owner = "client!gf", name = "Id", descriptor = "I")
	public int anInt1676;

	@OriginalMember(owner = "client!gf", name = "fd", descriptor = "I")
	public int anInt1658 = -1;

	@OriginalMember(owner = "client!gf", name = "bd", descriptor = "S")
	private short aShort17 = 0;

	@OriginalMember(owner = "client!gf", name = "ld", descriptor = "I")
	public int anInt1662 = 0;

	@OriginalMember(owner = "client!gf", name = "jd", descriptor = "I")
	public int anInt1660 = 0;

	@OriginalMember(owner = "client!gf", name = "pd", descriptor = "I")
	public int anInt1663 = 0;

	@OriginalMember(owner = "client!gf", name = "dd", descriptor = "I")
	public int anInt1656 = 0;

	@OriginalMember(owner = "client!gf", name = "xd", descriptor = "I")
	public int anInt1669 = 0;

	@OriginalMember(owner = "client!gf", name = "zd", descriptor = "Z")
	public boolean aBoolean83 = false;

	@OriginalMember(owner = "client!gf", name = "Dd", descriptor = "I")
	public int anInt1673 = -1;

	@OriginalMember(owner = "client!gf", name = "Cd", descriptor = "S")
	private short aShort18 = 0;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!ab;I)V")
	public void method1103(@OriginalArg(0) Class2_Sub2 arg0) {
		arg0.anInt2385 = 0;
		@Pc(12) int local12 = arg0.method1698();
		if ((local12 & 0x2) == 2) {
			this.aShort18 = (short) (arg0.method1698() << 2);
			this.aShort17 = (short) (arg0.method1698() << 2);
		} else {
			this.aShort18 = 0;
			this.aShort17 = 0;
		}
		super.anInt1618 = (local12 >> 3) + 1;
		this.anInt1658 = arg0.method1707();
		@Pc(66) boolean local66 = (local12 & 0x4) != 0;
		this.anInt1673 = arg0.method1707();
		this.anInt1660 = 0;
		@Pc(84) int local84 = -1;
		@Pc(87) int[] local87 = new int[12];
		@Pc(110) int local110;
		@Pc(117) int local117;
		for (@Pc(89) int local89 = 0; local89 < 12; local89++) {
			@Pc(95) int local95 = arg0.method1698();
			if (local95 == 0) {
				local87[local89] = 0;
			} else {
				local110 = arg0.method1698();
				local117 = (local95 << 8) + local110;
				if (local89 == 0 && local117 == 65535) {
					local84 = arg0.method1680();
					break;
				}
				if (local117 >= 32768) {
					local117 = Static168.anIntArray354[local117 - 32768];
					local87[local89] = local117 | 0x40000000;
					@Pc(153) int local153 = Static58.method1034(local117).anInt2228;
					if (local153 != 0) {
						this.anInt1660 = local153;
					}
				} else {
					local87[local89] = Integer.MIN_VALUE | local117 - 256;
				}
			}
		}
		@Pc(181) int local181 = local12 & 0x1;
		@Pc(184) int[] local184 = new int[5];
		for (local110 = 0; local110 < 5; local110++) {
			local117 = arg0.method1698();
			if (local117 < 0 || local117 >= Static69.aShortArrayArray5[local110].length) {
				local117 = 0;
			}
			local184[local110] = local117;
		}
		super.anInt1608 = arg0.method1680();
		if (super.anInt1608 == 65535) {
			super.anInt1608 = -1;
		}
		super.anInt1649 = arg0.method1680();
		if (super.anInt1649 == 65535) {
			super.anInt1649 = -1;
		}
		super.anInt1628 = super.anInt1649;
		super.anInt1610 = arg0.method1680();
		if (super.anInt1610 == 65535) {
			super.anInt1610 = -1;
		}
		super.anInt1639 = arg0.method1680();
		if (super.anInt1639 == 65535) {
			super.anInt1639 = -1;
		}
		super.anInt1646 = arg0.method1680();
		if (super.anInt1646 == 65535) {
			super.anInt1646 = -1;
		}
		super.anInt1619 = arg0.method1680();
		if (super.anInt1619 == 65535) {
			super.anInt1619 = -1;
		}
		super.anInt1648 = arg0.method1680();
		if (super.anInt1648 == 65535) {
			super.anInt1648 = -1;
		}
		this.aClass28_953 = Static83.method1479(arg0.method1655()).method1115();
		this.anInt1669 = arg0.method1698();
		if (local66) {
			this.anInt1663 = arg0.method1680();
		}
		if (this.aClass6_2 == null) {
			this.aClass6_2 = new Class6();
		}
		this.aClass6_2.method412(local87, local181 == 1, local184, local84);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (this.aClass6_2 == null) {
			return;
		}
		@Pc(27) Class2_Sub4_Sub2 local27 = super.anInt1653 != -1 && super.anInt1641 == 0 ? Static49.method926(super.anInt1653) : null;
		@Pc(53) Class2_Sub4_Sub2 local53 = super.anInt1606 == -1 || this.aBoolean83 || super.anInt1608 == super.anInt1606 && local27 != null ? null : Static49.method926(super.anInt1606);
		@Pc(64) Class2_Sub4_Sub1_Sub3 local64 = this.aClass6_2.method419(local53, super.anInt1597, local27, super.anInt1614);
		if (local64 == null) {
			return;
		}
		local64.method1193();
		super.aShort36 = local64.aShort36;
		if (this.aShort18 != 0 && this.aShort17 != 0) {
			@Pc(89) int local89 = Class2_Sub4_Sub3_Sub1.anIntArray58[arg0];
			@Pc(93) int local93 = Class2_Sub4_Sub3_Sub1.anIntArray60[arg0];
			@Pc(96) short local96 = this.aShort18;
			@Pc(99) short local99 = this.aShort17;
			@Pc(104) int local104 = -local96 / 2;
			@Pc(109) int local109 = -local99 / 2;
			@Pc(119) int local119 = local104 * local93 + local109 * local89 >> 16;
			@Pc(130) int local130 = local109 * local93 - local89 * local104 >> 16;
			@Pc(134) int local134 = local96 / 2;
			@Pc(146) int local146 = Static103.method1808(Static103.anInt2568, local119 + super.anInt1633, super.anInt1635 + local130);
			@Pc(151) int local151 = -local99 / 2;
			@Pc(162) int local162 = local89 * local151 + local93 * local134 >> 16;
			@Pc(173) int local173 = local151 * local93 - local134 * local89 >> 16;
			@Pc(178) int local178 = -local96 / 2;
			@Pc(190) int local190 = Static103.method1808(Static103.anInt2568, super.anInt1633 + local162, local173 + super.anInt1635);
			@Pc(194) int local194 = local99 / 2;
			@Pc(205) int local205 = local194 * local93 - local178 * local89 >> 16;
			@Pc(209) int local209 = local96 / 2;
			@Pc(213) int local213 = local99 / 2;
			@Pc(223) int local223 = local178 * local93 + local89 * local194 >> 16;
			@Pc(234) int local234 = local93 * local213 - local209 * local89 >> 16;
			@Pc(244) int local244 = local209 * local93 + local213 * local89 >> 16;
			@Pc(251) int local251 = local190 > local146 ? local146 : local190;
			@Pc(263) int local263 = Static103.method1808(Static103.anInt2568, super.anInt1633 + local223, local205 + super.anInt1635);
			@Pc(276) int local276 = Static103.method1808(Static103.anInt2568, super.anInt1633 + local244, super.anInt1635 + local234);
			@Pc(287) int local287 = local146 < local263 ? local146 : local263;
			@Pc(294) int local294 = local263 < local276 ? local263 : local276;
			@Pc(307) int local307 = (int) (Math.atan2((double) (local251 - local294), (double) local99) * 320.0D) & 0x7FF;
			@Pc(314) int local314 = local190 < local276 ? local190 : local276;
			@Pc(325) int local325 = (local287 + local251 + local294 + local314) / 4;
			local64.method1191(local307);
			@Pc(342) int local342 = (int) (Math.atan2((double) (local287 - local314), (double) local96) * 320.0D) & 0x7FF;
			local64.method1199(local342);
			local64.method1200(0, local325 - super.anInt1634, 0);
		}
		@Pc(356) Class2_Sub4_Sub1_Sub3 local356 = null;
		if (!this.aBoolean83 && super.anInt1627 != -1 && super.anInt1611 != -1) {
			local356 = Static19.method611(super.anInt1627).method892(super.anInt1611);
			if (local356 != null) {
				local356.method1200(0, -super.anInt1613, 0);
			}
		}
		@Pc(387) Class2_Sub4_Sub1_Sub3 local387 = null;
		if (!this.aBoolean83 && this.aClass2_Sub4_Sub1_Sub3_1 != null) {
			if (this.anInt1656 <= Static156.anInt3491) {
				this.aClass2_Sub4_Sub1_Sub3_1 = null;
			}
			if (this.anInt1662 <= Static156.anInt3491 && Static156.anInt3491 < this.anInt1656) {
				local387 = this.aClass2_Sub4_Sub1_Sub3_1;
				local387.method1200(this.anInt1674 - super.anInt1633, -super.anInt1634 + this.anInt1676, this.anInt1655 - super.anInt1635);
				if (super.anInt1623 == 512) {
					local387.method1195();
					local387.method1195();
					local387.method1195();
				} else if (super.anInt1623 == 1024) {
					local387.method1195();
					local387.method1195();
				} else if (super.anInt1623 == 1536) {
					local387.method1195();
				}
			}
		}
		if (local356 != null) {
			local64 = ((Class2_Sub4_Sub1_Sub3_Sub1) local64).method1210(local356);
		}
		if (local387 != null) {
			local64 = ((Class2_Sub4_Sub1_Sub3_Sub1) local64).method1210(local387);
		}
		local64.aBoolean90 = true;
		local64.method2856(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		if (local387 == null) {
			return;
		}
		if (super.anInt1623 == 512) {
			local387.method1195();
		} else if (super.anInt1623 == 1024) {
			local387.method1195();
			local387.method1195();
		} else if (super.anInt1623 == 1536) {
			local387.method1195();
			local387.method1195();
			local387.method1195();
		}
		local387.method1200(super.anInt1633 - this.anInt1674, -this.anInt1676 + super.anInt1634, super.anInt1635 - this.anInt1655);
	}

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method1093() {
		return this.aClass6_2 != null;
	}
}
