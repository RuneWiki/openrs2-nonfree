import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class4_Sub1_Sub1_Sub1_Sub1 extends Class4_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!jc", name = "wc", descriptor = "I")
	public int anInt2099;

	@OriginalMember(owner = "client!jc", name = "zc", descriptor = "I")
	public int anInt2101;

	@OriginalMember(owner = "client!jc", name = "Ac", descriptor = "I")
	public int anInt2102;

	@OriginalMember(owner = "client!jc", name = "Ec", descriptor = "I")
	public int anInt2105;

	@OriginalMember(owner = "client!jc", name = "Hc", descriptor = "I")
	public int anInt2106;

	@OriginalMember(owner = "client!jc", name = "Lc", descriptor = "Lclient!ig;")
	public Class43 aClass43_1;

	@OriginalMember(owner = "client!jc", name = "Mc", descriptor = "Lclient!dg;")
	public Class4_Sub1_Sub1_Sub4 aClass4_Sub1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!jc", name = "Oc", descriptor = "I")
	public int anInt2111;

	@OriginalMember(owner = "client!jc", name = "Rc", descriptor = "Lclient!jd;")
	public Class46 aClass46_796;

	@OriginalMember(owner = "client!jc", name = "Sc", descriptor = "I")
	public int anInt2113;

	@OriginalMember(owner = "client!jc", name = "vc", descriptor = "S")
	private short aShort24 = 0;

	@OriginalMember(owner = "client!jc", name = "qc", descriptor = "Z")
	public boolean aBoolean94 = false;

	@OriginalMember(owner = "client!jc", name = "Cc", descriptor = "I")
	public int anInt2104 = 0;

	@OriginalMember(owner = "client!jc", name = "tc", descriptor = "I")
	public int anInt2097 = -1;

	@OriginalMember(owner = "client!jc", name = "Ic", descriptor = "I")
	public int anInt2107 = 0;

	@OriginalMember(owner = "client!jc", name = "xc", descriptor = "S")
	private short aShort25 = 0;

	@OriginalMember(owner = "client!jc", name = "Jc", descriptor = "I")
	public int anInt2108 = -1;

	@OriginalMember(owner = "client!jc", name = "Kc", descriptor = "I")
	public int anInt2109 = 0;

	@OriginalMember(owner = "client!jc", name = "Nc", descriptor = "I")
	public int anInt2110 = 0;

	@OriginalMember(owner = "client!jc", name = "uc", descriptor = "I")
	public int anInt2098 = 0;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (this.aClass43_1 == null) {
			return;
		}
		@Pc(23) Class4_Sub1_Sub4 local23 = super.anInt2808 != -1 && super.anInt2840 == 0 ? Static137.method2394(super.anInt2808) : null;
		@Pc(45) Class4_Sub1_Sub4 local45 = super.anInt2809 == -1 || this.aBoolean94 || super.anInt2809 == super.anInt2816 && local23 != null ? null : Static137.method2394(super.anInt2809);
		@Pc(56) Class4_Sub1_Sub1_Sub4 local56 = this.aClass43_1.method1571(super.anInt2844, local45, super.anInt2814, local23);
		if (local56 == null) {
			return;
		}
		local56.method2824();
		super.aShort29 = local56.aShort29;
		if (this.aShort24 != 0 && this.aShort25 != 0) {
			@Pc(78) int local78 = Class4_Sub1_Sub7_Sub4.anIntArray412[arg0];
			@Pc(82) int local82 = Class4_Sub1_Sub7_Sub4.anIntArray416[arg0];
			@Pc(85) short local85 = this.aShort25;
			@Pc(88) short local88 = this.aShort24;
			@Pc(93) int local93 = -local85 / 2;
			@Pc(98) int local98 = -local88 / 2;
			@Pc(108) int local108 = local78 * local93 + local98 * local82 >> 16;
			@Pc(119) int local119 = local82 * local93 - local98 * local78 >> 16;
			@Pc(131) int local131 = Static106.method1998(local108 + super.anInt2832, Static73.anInt1873, super.anInt2803 + local119);
			@Pc(135) int local135 = local88 / 2;
			@Pc(140) int local140 = -local85 / 2;
			@Pc(150) int local150 = local135 * local82 + local140 * local78 >> 16;
			@Pc(161) int local161 = local140 * local82 - local78 * local135 >> 16;
			@Pc(173) int local173 = Static106.method1998(local150 + super.anInt2832, Static73.anInt1873, super.anInt2803 + local161);
			@Pc(178) int local178 = -local88 / 2;
			@Pc(182) int local182 = local85 / 2;
			@Pc(193) int local193 = local182 * local82 - local78 * local178 >> 16;
			@Pc(203) int local203 = local182 * local78 + local82 * local178 >> 16;
			@Pc(215) int local215 = Static106.method1998(local203 + super.anInt2832, Static73.anInt1873, local193 + super.anInt2803);
			@Pc(219) int local219 = local88 / 2;
			@Pc(223) int local223 = local85 / 2;
			@Pc(234) int local234 = local223 * local78 + local219 * local82 >> 16;
			@Pc(245) int local245 = local82 * local223 - local78 * local219 >> 16;
			@Pc(252) int local252 = local173 > local131 ? local131 : local173;
			@Pc(265) int local265 = Static106.method1998(local234 + super.anInt2832, Static73.anInt1873, super.anInt2803 + local245);
			@Pc(272) int local272 = local265 > local215 ? local215 : local265;
			@Pc(283) int local283 = local265 <= local173 ? local265 : local173;
			@Pc(294) int local294 = local131 >= local215 ? local215 : local131;
			@Pc(308) int local308 = (int) (Math.atan2((double) (local252 - local272), (double) local85) * 320.0D) & 0x7FF;
			@Pc(318) int local318 = (local294 + local252 + local272 + local283) / 4;
			local56.method2831(local308);
			@Pc(334) int local334 = (int) (Math.atan2((double) (local294 - local283), (double) local88) * 320.0D) & 0x7FF;
			local56.method2835(local334);
			local56.method2829(0, local318 - super.anInt2834, 0);
		}
		@Pc(348) Class4_Sub1_Sub1_Sub4 local348 = null;
		@Pc(350) Class4_Sub1_Sub1_Sub4 local350 = null;
		if (!this.aBoolean94 && super.anInt2825 != -1 && super.anInt2827 != -1) {
			local348 = Static93.method1816(super.anInt2825).method1095(super.anInt2827);
			if (local348 != null) {
				local348.method2829(0, -super.anInt2807, 0);
			}
		}
		if (!this.aBoolean94 && this.aClass4_Sub1_Sub1_Sub4_1 != null) {
			if (Static142.anInt3325 >= this.anInt2104) {
				this.aClass4_Sub1_Sub1_Sub4_1 = null;
			}
			if (Static142.anInt3325 >= this.anInt2109 && this.anInt2104 > Static142.anInt3325) {
				local350 = this.aClass4_Sub1_Sub1_Sub4_1;
				local350.method2829(this.anInt2101 - super.anInt2832, -super.anInt2834 + this.anInt2106, this.anInt2113 - super.anInt2803);
				if (super.anInt2829 == 512) {
					local350.method2839();
					local350.method2839();
					local350.method2839();
				} else if (super.anInt2829 == 1024) {
					local350.method2839();
					local350.method2839();
				} else if (super.anInt2829 == 1536) {
					local350.method2839();
				}
			}
		}
		if (local348 != null) {
			local56 = ((Class4_Sub1_Sub1_Sub4_Sub1) local56).method2847(local348);
		}
		if (local350 != null) {
			local56 = ((Class4_Sub1_Sub1_Sub4_Sub1) local56).method2847(local350);
		}
		local56.aBoolean148 = true;
		local56.method2821(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		if (local350 == null) {
			return;
		}
		if (super.anInt2829 == 512) {
			local350.method2839();
		} else if (super.anInt2829 == 1024) {
			local350.method2839();
			local350.method2839();
		} else if (super.anInt2829 == 1536) {
			local350.method2839();
			local350.method2839();
			local350.method2839();
		}
		local350.method2829(super.anInt2832 - this.anInt2101, -this.anInt2106 + super.anInt2834, super.anInt2803 - this.anInt2113);
	}

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method2111() {
		return this.aClass43_1 != null;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILclient!h;)V")
	public void method1638(@OriginalArg(1) Class4_Sub11 arg0) {
		arg0.anInt1597 = 0;
		@Pc(12) int local12 = arg0.method1253();
		if ((local12 & 0x2) == 2) {
			this.aShort24 = (short) (arg0.method1253() << 2);
			this.aShort25 = (short) (arg0.method1253() << 2);
		} else {
			this.aShort24 = 0;
			this.aShort25 = 0;
		}
		super.anInt2805 = (local12 >> 3) + 1;
		this.anInt2108 = arg0.method1241();
		this.anInt2097 = arg0.method1241();
		@Pc(64) int local64 = local12 & 0x1;
		this.anInt2110 = 0;
		@Pc(69) int local69 = -1;
		@Pc(77) boolean local77 = (local12 & 0x4) != 0;
		@Pc(80) int[] local80 = new int[12];
		@Pc(100) int local100;
		@Pc(106) int local106;
		for (@Pc(82) int local82 = 0; local82 < 12; local82++) {
			@Pc(88) int local88 = arg0.method1253();
			if (local88 == 0) {
				local80[local82] = 0;
			} else {
				local100 = arg0.method1253();
				local106 = local100 + (local88 << 8);
				if (local82 == 0 && local106 == 65535) {
					local69 = arg0.method1252();
					break;
				}
				if (local106 >= 32768) {
					local106 = Static55.anIntArray143[local106 - 32768];
					local80[local82] = local106 | 0x40000000;
					@Pc(139) int local139 = Static83.method1663(local106).anInt2489;
					if (local139 != 0) {
						this.anInt2110 = local139;
					}
				} else {
					local80[local82] = local106 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(164) int[] local164 = new int[5];
		for (local100 = 0; local100 < 5; local100++) {
			local106 = arg0.method1253();
			if (local106 < 0 || local106 >= Static181.aShortArrayArray7[local100].length) {
				local106 = 0;
			}
			local164[local100] = local106;
		}
		super.anInt2816 = arg0.method1252();
		if (super.anInt2816 == 65535) {
			super.anInt2816 = -1;
		}
		super.anInt2796 = arg0.method1252();
		if (super.anInt2796 == 65535) {
			super.anInt2796 = -1;
		}
		super.anInt2789 = super.anInt2796;
		super.anInt2810 = arg0.method1252();
		if (super.anInt2810 == 65535) {
			super.anInt2810 = -1;
		}
		super.anInt2800 = arg0.method1252();
		if (super.anInt2800 == 65535) {
			super.anInt2800 = -1;
		}
		super.anInt2833 = arg0.method1252();
		if (super.anInt2833 == 65535) {
			super.anInt2833 = -1;
		}
		super.anInt2794 = arg0.method1252();
		if (super.anInt2794 == 65535) {
			super.anInt2794 = -1;
		}
		super.anInt2824 = arg0.method1252();
		if (super.anInt2824 == 65535) {
			super.anInt2824 = -1;
		}
		this.aClass46_796 = Static116.method2124(arg0.method1258()).method1654();
		this.anInt2107 = arg0.method1253();
		if (local77) {
			this.anInt2098 = arg0.method1252();
		}
		if (this.aClass43_1 == null) {
			this.aClass43_1 = new Class43();
		}
		this.aClass43_1.method1565(local64 == 1, local80, local164, local69);
	}
}
