import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class3_Sub2_Sub1_Sub1_Sub1 extends Class3_Sub2_Sub1_Sub1 {

	@OriginalMember(owner = "client!dd", name = "mc", descriptor = "I")
	public int anInt891;

	@OriginalMember(owner = "client!dd", name = "rc", descriptor = "Lclient!fd;")
	public Class3_Sub2_Sub1_Sub2 aClass3_Sub2_Sub1_Sub2_1;

	@OriginalMember(owner = "client!dd", name = "uc", descriptor = "I")
	public int anInt895;

	@OriginalMember(owner = "client!dd", name = "xc", descriptor = "I")
	public int anInt896;

	@OriginalMember(owner = "client!dd", name = "yc", descriptor = "I")
	public int anInt897;

	@OriginalMember(owner = "client!dd", name = "zc", descriptor = "I")
	public int anInt898;

	@OriginalMember(owner = "client!dd", name = "Ac", descriptor = "I")
	public int anInt899;

	@OriginalMember(owner = "client!dd", name = "Bc", descriptor = "Lclient!kb;")
	public Class46 aClass46_233;

	@OriginalMember(owner = "client!dd", name = "Dc", descriptor = "I")
	public int anInt900;

	@OriginalMember(owner = "client!dd", name = "Lc", descriptor = "Lclient!pe;")
	public Class64 aClass64_1;

	@OriginalMember(owner = "client!dd", name = "kc", descriptor = "I")
	public int anInt889 = 0;

	@OriginalMember(owner = "client!dd", name = "lc", descriptor = "I")
	public int anInt890 = -1;

	@OriginalMember(owner = "client!dd", name = "oc", descriptor = "I")
	public int anInt892 = 0;

	@OriginalMember(owner = "client!dd", name = "Fc", descriptor = "I")
	public int anInt902 = -1;

	@OriginalMember(owner = "client!dd", name = "pc", descriptor = "S")
	private short aShort4 = 0;

	@OriginalMember(owner = "client!dd", name = "Gc", descriptor = "I")
	public int anInt903 = 0;

	@OriginalMember(owner = "client!dd", name = "Nc", descriptor = "Z")
	public boolean aBoolean29 = false;

	@OriginalMember(owner = "client!dd", name = "wc", descriptor = "S")
	private short aShort5 = 0;

	@OriginalMember(owner = "client!dd", name = "Hc", descriptor = "I")
	public int anInt904 = 0;

	@OriginalMember(owner = "client!dd", name = "Pc", descriptor = "I")
	public int anInt907 = 0;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLclient!rd;)V")
	public void method572(@OriginalArg(1) Class3_Sub4 arg0) {
		arg0.anInt232 = 0;
		@Pc(15) int local15 = arg0.method191();
		if ((local15 & 0x2) == 2) {
			this.aShort4 = (short) (arg0.method191() << 2);
			this.aShort5 = (short) (arg0.method191() << 2);
		} else {
			this.aShort5 = 0;
			this.aShort4 = 0;
		}
		@Pc(54) int local54 = -1;
		@Pc(58) int local58 = local15 & 0x1;
		super.anInt1712 = (local15 >> 3) + 1;
		@Pc(76) boolean local76 = (local15 & 0x4) != 0;
		@Pc(79) int[] local79 = new int[12];
		this.anInt890 = arg0.method203();
		this.anInt902 = arg0.method203();
		this.anInt892 = 0;
		@Pc(112) int local112;
		@Pc(150) int local150;
		for (@Pc(94) int local94 = 0; local94 < 12; local94++) {
			@Pc(100) int local100 = arg0.method191();
			if (local100 == 0) {
				local79[local94] = 0;
			} else {
				local112 = arg0.method191();
				local79[local94] = (local100 << 8) + local112;
				if (local94 == 0 && local79[0] == 65535) {
					local54 = arg0.method208();
					break;
				}
				if (local79[local94] >= 512) {
					local150 = Static146.method2432(local79[local94] - 512).anInt3331;
					if (local150 != 0) {
						this.anInt892 = local150;
					}
				}
			}
		}
		@Pc(165) int[] local165 = new int[5];
		for (local112 = 0; local112 < 5; local112++) {
			local150 = arg0.method191();
			if (local150 < 0 || Static22.aShortArrayArray3[local112].length <= local150) {
				local150 = 0;
			}
			local165[local112] = local150;
		}
		super.anInt1683 = arg0.method208();
		if (super.anInt1683 == 65535) {
			super.anInt1683 = -1;
		}
		super.anInt1699 = arg0.method208();
		if (super.anInt1699 == 65535) {
			super.anInt1699 = -1;
		}
		super.anInt1714 = super.anInt1699;
		super.anInt1713 = arg0.method208();
		if (super.anInt1713 == 65535) {
			super.anInt1713 = -1;
		}
		super.anInt1737 = arg0.method208();
		if (super.anInt1737 == 65535) {
			super.anInt1737 = -1;
		}
		super.anInt1697 = arg0.method208();
		if (super.anInt1697 == 65535) {
			super.anInt1697 = -1;
		}
		super.anInt1710 = arg0.method208();
		if (super.anInt1710 == 65535) {
			super.anInt1710 = -1;
		}
		super.anInt1688 = arg0.method208();
		if (super.anInt1688 == 65535) {
			super.anInt1688 = -1;
		}
		this.aClass46_233 = Static116.method1961(arg0.method185()).method1371();
		this.anInt889 = arg0.method191();
		if (local76) {
			this.anInt907 = arg0.method208();
		}
		if (this.aClass64_1 == null) {
			this.aClass64_1 = new Class64();
		}
		this.aClass64_1.method2121(local165, local54, local79, local58 == 1);
	}

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method1161() {
		return this.aClass64_1 != null;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method2685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass64_1 == null) {
			return;
		}
		@Pc(23) Class3_Sub2_Sub2 local23 = super.anInt1738 != -1 && super.anInt1726 == 0 ? Static35.method628(super.anInt1738) : null;
		@Pc(45) Class3_Sub2_Sub2 local45 = super.anInt1719 == -1 || this.aBoolean29 || super.anInt1719 == super.anInt1683 && local23 != null ? null : Static35.method628(super.anInt1719);
		@Pc(56) Class3_Sub2_Sub1_Sub2 local56 = this.aClass64_1.method2116(super.anInt1681, super.anInt1686, local45, local23);
		if (local56 == null) {
			return;
		}
		local56.method1785();
		super.aShort34 = local56.aShort34;
		if (this.aShort4 != 0 && this.aShort5 != 0) {
			@Pc(81) int local81 = Class3_Sub2_Sub3_Sub4.anIntArray346[arg0];
			@Pc(85) int local85 = Class3_Sub2_Sub3_Sub4.anIntArray347[arg0];
			@Pc(88) short local88 = this.aShort5;
			@Pc(93) int local93 = -local88 / 2;
			@Pc(96) short local96 = this.aShort4;
			@Pc(101) int local101 = -local96 / 2;
			@Pc(111) int local111 = local101 * local81 + local93 * local85 >> 16;
			@Pc(121) int local121 = local81 * local93 - local101 * local85 >> 16;
			@Pc(133) int local133 = Static168.method2689(super.anInt1711 + local121, super.anInt1700 + local111, Static99.anInt2422);
			@Pc(137) int local137 = local96 / 2;
			@Pc(142) int local142 = -local88 / 2;
			@Pc(147) int local147 = -local96 / 2;
			@Pc(151) int local151 = local88 / 2;
			@Pc(161) int local161 = local147 * local81 + local151 * local85 >> 16;
			@Pc(172) int local172 = local81 * local142 - local85 * local137 >> 16;
			@Pc(182) int local182 = local142 * local85 + local81 * local137 >> 16;
			@Pc(195) int local195 = Static168.method2689(local172 + super.anInt1711, super.anInt1700 - -local182, Static99.anInt2422);
			@Pc(206) int local206 = local151 * local81 - local85 * local147 >> 16;
			@Pc(218) int local218 = Static168.method2689(local206 + super.anInt1711, local161 + super.anInt1700, Static99.anInt2422);
			@Pc(222) int local222 = local96 / 2;
			@Pc(226) int local226 = local88 / 2;
			@Pc(237) int local237 = local133 >= local195 ? local195 : local133;
			@Pc(247) int local247 = local81 * local222 + local226 * local85 >> 16;
			@Pc(258) int local258 = local226 * local81 - local222 * local85 >> 16;
			@Pc(272) int local272 = Static168.method2689(super.anInt1711 + local258, super.anInt1700 - -local247, Static99.anInt2422);
			@Pc(283) int local283 = local272 > local195 ? local195 : local272;
			@Pc(290) int local290 = local218 < local272 ? local218 : local272;
			@Pc(297) int local297 = local218 > local133 ? local133 : local218;
			@Pc(310) int local310 = (int) (Math.atan2((double) (local237 - local290), (double) local88) * 320.0D) & 0x7FF;
			local56.method1792(local310);
			@Pc(326) int local326 = (int) (Math.atan2((double) (local297 - local283), (double) local96) * 320.0D) & 0x7FF;
			local56.method1800(local326);
			@Pc(339) int local339 = (local297 + local290 + local237 + local283) / 4;
			local56.method1801(0, local339 - super.anInt1696, 0);
		}
		@Pc(350) Class3_Sub2_Sub1_Sub2 local350 = null;
		if (!this.aBoolean29 && super.anInt1707 != -1 && super.anInt1687 != -1) {
			local350 = Static155.method2522(super.anInt1707).method933(super.anInt1687);
			if (local350 != null) {
				local350.method1801(0, -super.anInt1717, 0);
			}
		}
		@Pc(382) Class3_Sub2_Sub1_Sub2 local382 = null;
		if (!this.aBoolean29 && this.aClass3_Sub2_Sub1_Sub2_1 != null) {
			if (Static20.anInt512 >= this.anInt904) {
				this.aClass3_Sub2_Sub1_Sub2_1 = null;
			}
			if (Static20.anInt512 >= this.anInt903 && Static20.anInt512 < this.anInt904) {
				local382 = this.aClass3_Sub2_Sub1_Sub2_1;
				local382.method1801(this.anInt896 - super.anInt1700, this.anInt895 - super.anInt1696, this.anInt891 - super.anInt1711);
				if (super.anInt1732 == 512) {
					local382.method1786();
					local382.method1786();
					local382.method1786();
				} else if (super.anInt1732 == 1024) {
					local382.method1786();
					local382.method1786();
				} else if (super.anInt1732 == 1536) {
					local382.method1786();
				}
			}
		}
		if (local350 != null) {
			local56 = ((Class3_Sub2_Sub1_Sub2_Sub1) local56).method1805(local350);
		}
		if (local382 != null) {
			local56 = ((Class3_Sub2_Sub1_Sub2_Sub1) local56).method1805(local382);
		}
		local56.aBoolean110 = true;
		local56.method2685(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		if (local382 == null) {
			return;
		}
		if (super.anInt1732 == 512) {
			local382.method1786();
		} else if (super.anInt1732 == 1024) {
			local382.method1786();
			local382.method1786();
		} else if (super.anInt1732 == 1536) {
			local382.method1786();
			local382.method1786();
			local382.method1786();
		}
		local382.method1801(super.anInt1700 - this.anInt896, super.anInt1696 - this.anInt895, super.anInt1711 - this.anInt891);
	}
}
