import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class Class1_Sub1_Sub1_Sub1_Sub1 extends Class1_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!a", name = "zc", descriptor = "I")
	public int anInt202;

	@OriginalMember(owner = "client!a", name = "Ac", descriptor = "Lclient!w;")
	public Class1_Sub1_Sub1_Sub2 aClass1_Sub1_Sub1_Sub2_1;

	@OriginalMember(owner = "client!a", name = "Fc", descriptor = "I")
	public int anInt207;

	@OriginalMember(owner = "client!a", name = "Gc", descriptor = "I")
	public int anInt208;

	@OriginalMember(owner = "client!a", name = "Lc", descriptor = "I")
	public int anInt212;

	@OriginalMember(owner = "client!a", name = "Nc", descriptor = "I")
	public int anInt214;

	@OriginalMember(owner = "client!a", name = "Qc", descriptor = "I")
	public int anInt216;

	@OriginalMember(owner = "client!a", name = "Rc", descriptor = "Lclient!ed;")
	public Class23 aClass23_68;

	@OriginalMember(owner = "client!a", name = "Sc", descriptor = "Lclient!ia;")
	public Class41 aClass41_5;

	@OriginalMember(owner = "client!a", name = "Vc", descriptor = "I")
	public int anInt218;

	@OriginalMember(owner = "client!a", name = "Ic", descriptor = "I")
	public int anInt210 = 0;

	@OriginalMember(owner = "client!a", name = "xc", descriptor = "I")
	public int anInt200 = 0;

	@OriginalMember(owner = "client!a", name = "Hc", descriptor = "I")
	public int anInt209 = -1;

	@OriginalMember(owner = "client!a", name = "Jc", descriptor = "S")
	private short aShort4 = 0;

	@OriginalMember(owner = "client!a", name = "Oc", descriptor = "S")
	private short aShort5 = 0;

	@OriginalMember(owner = "client!a", name = "Ec", descriptor = "I")
	public int anInt206 = 0;

	@OriginalMember(owner = "client!a", name = "wc", descriptor = "Z")
	public boolean aBoolean12 = false;

	@OriginalMember(owner = "client!a", name = "Bc", descriptor = "I")
	public int anInt203 = 0;

	@OriginalMember(owner = "client!a", name = "Tc", descriptor = "I")
	public int anInt217 = -1;

	@OriginalMember(owner = "client!a", name = "Pc", descriptor = "I")
	public int anInt215 = 0;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method3156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass41_5 == null) {
			return;
		}
		@Pc(27) Class1_Sub1_Sub18 local27 = super.anInt1842 != -1 && super.anInt1846 == 0 ? Static157.method2652(super.anInt1842) : null;
		@Pc(49) Class1_Sub1_Sub18 local49 = super.anInt1835 == -1 || this.aBoolean12 || super.anInt1835 == super.anInt1823 && local27 != null ? null : Static157.method2652(super.anInt1835);
		@Pc(60) Class1_Sub1_Sub1_Sub2 local60 = this.aClass41_5.method1188(super.anInt1849, local49, super.anInt1837, local27);
		if (local60 == null) {
			return;
		}
		local60.method1085();
		super.aShort36 = local60.aShort36;
		if (this.aShort4 != 0 && this.aShort5 != 0) {
			@Pc(82) int local82 = Class1_Sub1_Sub12_Sub2.anIntArray416[arg0];
			@Pc(86) int local86 = Class1_Sub1_Sub12_Sub2.anIntArray417[arg0];
			@Pc(89) short local89 = this.aShort4;
			@Pc(94) int local94 = -local89 / 2;
			@Pc(97) short local97 = this.aShort5;
			@Pc(102) int local102 = -local97 / 2;
			@Pc(113) int local113 = local82 * local102 + local86 * local94 >> 16;
			@Pc(124) int local124 = local86 * local102 - local82 * local94 >> 16;
			@Pc(128) int local128 = local89 / 2;
			@Pc(133) int local133 = -local97 / 2;
			@Pc(145) int local145 = Static99.method1680(local124 + super.anInt1825, local113 + super.anInt1838, Static85.anInt2267);
			@Pc(155) int local155 = local86 * local128 + local82 * local133 >> 16;
			@Pc(166) int local166 = local133 * local86 - local82 * local128 >> 16;
			@Pc(178) int local178 = Static99.method1680(local166 + super.anInt1825, local155 + super.anInt1838, Static85.anInt2267);
			@Pc(183) int local183 = -local89 / 2;
			@Pc(187) int local187 = local97 / 2;
			@Pc(197) int local197 = local86 * local183 + local82 * local187 >> 16;
			@Pc(208) int local208 = local187 * local86 - local183 * local82 >> 16;
			@Pc(220) int local220 = Static99.method1680(local208 + super.anInt1825, local197 + super.anInt1838, Static85.anInt2267);
			@Pc(224) int local224 = local89 / 2;
			@Pc(228) int local228 = local97 / 2;
			@Pc(239) int local239 = local228 * local82 + local224 * local86 >> 16;
			@Pc(250) int local250 = local178 > local145 ? local145 : local178;
			@Pc(261) int local261 = local86 * local228 - local224 * local82 >> 16;
			@Pc(273) int local273 = Static99.method1680(super.anInt1825 + local261, super.anInt1838 + local239, Static85.anInt2267);
			@Pc(280) int local280 = local220 >= local273 ? local273 : local220;
			@Pc(291) int local291 = local178 >= local273 ? local273 : local178;
			@Pc(298) int local298 = local145 >= local220 ? local220 : local145;
			@Pc(308) int local308 = (local298 + local280 + local250 + local291) / 4;
			@Pc(321) int local321 = (int) (Math.atan2((double) (local250 - local280), (double) local97) * 320.0D) & 0x7FF;
			local60.method1079(local321);
			@Pc(337) int local337 = (int) (Math.atan2((double) (local298 - local291), (double) local89) * 320.0D) & 0x7FF;
			local60.method1084(local337);
			local60.method1073(0, local308 - super.anInt1832, 0);
		}
		@Pc(350) Class1_Sub1_Sub1_Sub2 local350 = null;
		if (!this.aBoolean12 && super.anInt1853 != -1 && super.anInt1822 != -1) {
			local350 = Static13.method251(super.anInt1853).method2919(super.anInt1822);
			if (local350 != null) {
				local350.method1073(0, -super.anInt1855, 0);
			}
		}
		@Pc(382) Class1_Sub1_Sub1_Sub2 local382 = null;
		if (!this.aBoolean12 && this.aClass1_Sub1_Sub1_Sub2_1 != null) {
			if (this.anInt200 <= Static26.anInt845) {
				this.aClass1_Sub1_Sub1_Sub2_1 = null;
			}
			if (this.anInt203 <= Static26.anInt845 && this.anInt200 > Static26.anInt845) {
				local382 = this.aClass1_Sub1_Sub1_Sub2_1;
				local382.method1073(this.anInt202 - super.anInt1838, -super.anInt1832 + this.anInt212, this.anInt207 - super.anInt1825);
				if (super.anInt1860 == 512) {
					local382.method1074();
					local382.method1074();
					local382.method1074();
				} else if (super.anInt1860 == 1024) {
					local382.method1074();
					local382.method1074();
				} else if (super.anInt1860 == 1536) {
					local382.method1074();
				}
			}
		}
		if (local350 != null) {
			local60 = ((Class1_Sub1_Sub1_Sub2_Sub1) local60).method1088(local350);
		}
		if (local382 != null) {
			local60 = ((Class1_Sub1_Sub1_Sub2_Sub1) local60).method1088(local382);
		}
		local60.aBoolean79 = true;
		local60.method3156(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		if (local382 == null) {
			return;
		}
		if (super.anInt1860 == 512) {
			local382.method1074();
		} else if (super.anInt1860 == 1024) {
			local382.method1074();
			local382.method1074();
		} else if (super.anInt1860 == 1536) {
			local382.method1074();
			local382.method1074();
			local382.method1074();
		}
		local382.method1073(super.anInt1838 - this.anInt202, super.anInt1832 - this.anInt212, super.anInt1825 - this.anInt207);
	}

	@OriginalMember(owner = "client!a", name = "k", descriptor = "(I)Z")
	@Override
	public boolean method1222() {
		return this.aClass41_5 != null;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!jg;B)V")
	public void method95(@OriginalArg(0) Class1_Sub8 arg0) {
		arg0.anInt1357 = 0;
		@Pc(6) int local6 = -1;
		@Pc(10) int local10 = arg0.method861();
		@Pc(22) boolean local22 = (local10 & 0x4) != 0;
		@Pc(26) int local26 = local10 & 0x1;
		if ((local10 & 0x2) == 2) {
			this.aShort4 = (short) (arg0.method861() << 2);
			this.aShort5 = (short) (arg0.method861() << 2);
		} else {
			this.aShort4 = 0;
			this.aShort5 = 0;
		}
		super.anInt1824 = (local10 >> 3) + 1;
		@Pc(67) int[] local67 = new int[12];
		this.anInt209 = arg0.method900();
		this.anInt217 = arg0.method900();
		this.anInt206 = 0;
		@Pc(100) int local100;
		@Pc(140) int local140;
		for (@Pc(82) int local82 = 0; local82 < 12; local82++) {
			@Pc(88) int local88 = arg0.method861();
			if (local88 == 0) {
				local67[local82] = 0;
			} else {
				local100 = arg0.method861();
				local67[local82] = local100 + (local88 << 8);
				if (local82 == 0 && local67[0] == 65535) {
					local6 = arg0.method878();
					break;
				}
				if (local67[local82] >= 512) {
					local140 = Static2.method118(local67[local82] - 512).anInt1135;
					if (local140 != 0) {
						this.anInt206 = local140;
					}
				}
			}
		}
		@Pc(152) int[] local152 = new int[5];
		for (local100 = 0; local100 < 5; local100++) {
			local140 = arg0.method861();
			if (local140 < 0 || local140 >= Static40.aShortArrayArray3[local100].length) {
				local140 = 0;
			}
			local152[local100] = local140;
		}
		super.anInt1823 = arg0.method878();
		if (super.anInt1823 == 65535) {
			super.anInt1823 = -1;
		}
		super.anInt1859 = arg0.method878();
		if (super.anInt1859 == 65535) {
			super.anInt1859 = -1;
		}
		super.anInt1817 = super.anInt1859;
		super.anInt1820 = arg0.method878();
		if (super.anInt1820 == 65535) {
			super.anInt1820 = -1;
		}
		super.anInt1864 = arg0.method878();
		if (super.anInt1864 == 65535) {
			super.anInt1864 = -1;
		}
		super.anInt1850 = arg0.method878();
		if (super.anInt1850 == 65535) {
			super.anInt1850 = -1;
		}
		super.anInt1829 = arg0.method878();
		if (super.anInt1829 == 65535) {
			super.anInt1829 = -1;
		}
		super.anInt1830 = arg0.method878();
		if (super.anInt1830 == 65535) {
			super.anInt1830 = -1;
		}
		this.aClass23_68 = Static8.method183(arg0.method884()).method667();
		this.anInt215 = arg0.method861();
		if (local22) {
			this.anInt210 = arg0.method878();
		}
		if (this.aClass41_5 == null) {
			this.aClass41_5 = new Class41();
		}
		this.aClass41_5.method1182(local152, local26 == 1, local6, local67);
	}
}
