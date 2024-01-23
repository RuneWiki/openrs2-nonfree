import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class5_Sub2_Sub2 extends Class5_Sub2 {

	@OriginalMember(owner = "client!hh", name = "Ub", descriptor = "I")
	public int anInt1889;

	@OriginalMember(owner = "client!hh", name = "Xb", descriptor = "I")
	public int anInt1891;

	@OriginalMember(owner = "client!hh", name = "dc", descriptor = "I")
	public int anInt1897;

	@OriginalMember(owner = "client!hh", name = "gc", descriptor = "I")
	public int anInt1900;

	@OriginalMember(owner = "client!hh", name = "ic", descriptor = "I")
	public int anInt1902;

	@OriginalMember(owner = "client!hh", name = "jc", descriptor = "I")
	public int anInt1903;

	@OriginalMember(owner = "client!hh", name = "lc", descriptor = "Lclient!qe;")
	public Class78 aClass78_423;

	@OriginalMember(owner = "client!hh", name = "mc", descriptor = "Lclient!wf;")
	public Class112 aClass112_1;

	@OriginalMember(owner = "client!hh", name = "sc", descriptor = "Lclient!qc;")
	public Class5_Sub3 aClass5_Sub3_1;

	@OriginalMember(owner = "client!hh", name = "yc", descriptor = "I")
	public int anInt1910;

	@OriginalMember(owner = "client!hh", name = "Vb", descriptor = "S")
	private short aShort15 = 0;

	@OriginalMember(owner = "client!hh", name = "hc", descriptor = "I")
	public int anInt1901 = 0;

	@OriginalMember(owner = "client!hh", name = "Wb", descriptor = "I")
	public int anInt1890 = 0;

	@OriginalMember(owner = "client!hh", name = "ec", descriptor = "I")
	public int anInt1898 = 0;

	@OriginalMember(owner = "client!hh", name = "oc", descriptor = "S")
	private short aShort16 = 0;

	@OriginalMember(owner = "client!hh", name = "qc", descriptor = "I")
	public int anInt1906 = -1;

	@OriginalMember(owner = "client!hh", name = "cc", descriptor = "I")
	public int anInt1896 = 0;

	@OriginalMember(owner = "client!hh", name = "Nb", descriptor = "Z")
	public boolean aBoolean72 = false;

	@OriginalMember(owner = "client!hh", name = "Pb", descriptor = "I")
	public int anInt1884 = 0;

	@OriginalMember(owner = "client!hh", name = "bc", descriptor = "I")
	public int anInt1895 = -1;

	@OriginalMember(owner = "client!hh", name = "tc", descriptor = "I")
	public int anInt1908 = -1;

	@OriginalMember(owner = "client!hh", name = "Sb", descriptor = "I")
	public int anInt1887 = -1;

	@OriginalMember(owner = "client!hh", name = "fc", descriptor = "I")
	public int anInt1899 = -1;

	@OriginalMember(owner = "client!hh", name = "ac", descriptor = "I")
	public int anInt1894 = 0;

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method1479() {
		return this.aClass112_1 != null;
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "()I")
	@Override
	public int method3773() {
		return super.anInt1844;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method3779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (this.aClass112_1 == null) {
			return;
		}
		@Pc(26) Class2_Sub3_Sub3 local26 = super.anInt1873 != -1 && super.anInt1831 == 0 ? Static187.method3447(super.anInt1873) : null;
		@Pc(51) Class2_Sub3_Sub3 local51 = super.anInt1878 == -1 || this.aBoolean72 || super.anInt1879 == super.anInt1878 && local26 != null ? null : Static187.method3447(super.anInt1878);
		@Pc(62) Class5_Sub3 local62 = this.aClass112_1.method3940(super.anInt1830, super.anInt1848, local26, local51);
		if (local62 == null) {
			return;
		}
		super.anInt1844 = local62.method3773();
		if (Static64.aBoolean42) {
			@Pc(101) Class5_Sub3 local101 = Static149.method1481(super.aBoolean71, 1, super.anInt1827, 0, super.anInt1849, arg0, 160, super.anInt1861, local51 == null ? local26 : local51, 240, local51 == null ? super.anInt1848 : super.anInt1830, local62, 0);
			local101.method3779(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
		}
		@Pc(179) int local179;
		@Pc(169) int local169;
		@Pc(120) int local120;
		@Pc(214) int local214;
		if (Static31.aClass5_Sub2_Sub2_1 == this) {
			for (local120 = Static216.aClass19Array1.length - 1; local120 >= 0; local120--) {
				@Pc(126) Class19 local126 = Static216.aClass19Array1[local120];
				if (local126 != null && local126.anInt507 != -1) {
					if (local126.anInt504 == 1 && local126.anInt496 >= 0 && Static95.aClass5_Sub2_Sub1Array1.length > local126.anInt496) {
						@Pc(156) Class5_Sub2_Sub1 local156 = Static95.aClass5_Sub2_Sub1Array1[local126.anInt496];
						if (local156 != null) {
							local169 = local156.anInt1827 / 32 - Static31.aClass5_Sub2_Sub2_1.anInt1827 / 32;
							local179 = local156.anInt1849 / 32 - Static31.aClass5_Sub2_Sub2_1.anInt1849 / 32;
							this.method1495(arg7, arg0, arg5, arg3, local126.anInt507, local169, arg4, arg6, arg1, arg2, local179, local62);
						}
					}
					if (local126.anInt504 == 2) {
						local214 = (local126.anInt500 - Static28.anInt497) * 4 + 2 - Static31.aClass5_Sub2_Sub2_1.anInt1849 / 32;
						local179 = (local126.anInt498 - Static57.anInt628) * 4 + 2 - Static31.aClass5_Sub2_Sub2_1.anInt1827 / 32;
						this.method1495(arg7, arg0, arg5, arg3, local126.anInt507, local179, arg4, arg6, arg1, arg2, local214, local62);
					}
					if (local126.anInt504 == 10 && local126.anInt496 >= 0 && Static213.aClass5_Sub2_Sub2Array3.length > local126.anInt496) {
						@Pc(266) Class5_Sub2_Sub2 local266 = Static213.aClass5_Sub2_Sub2Array3[local126.anInt496];
						if (local266 != null) {
							local179 = local266.anInt1849 / 32 - Static31.aClass5_Sub2_Sub2_1.anInt1849 / 32;
							local169 = local266.anInt1827 / 32 - Static31.aClass5_Sub2_Sub2_1.anInt1827 / 32;
							this.method1495(arg7, arg0, arg5, arg3, local126.anInt507, local169, arg4, arg6, arg1, arg2, local179, local62);
						}
					}
				}
			}
		}
		local120 = 0;
		@Pc(316) int local316 = 0;
		local214 = 0;
		if (this.aShort16 != 0 && this.aShort15 != 0) {
			@Pc(333) short local333 = this.aShort15;
			local179 = Class77.anIntArray631[arg0];
			@Pc(340) short local340 = this.aShort16;
			@Pc(345) int local345 = -local340 / 2;
			@Pc(350) int local350 = -local333 / 2;
			local169 = Class77.anIntArray632[arg0];
			@Pc(364) int local364 = local169 * local345 + local179 * local350 >> 16;
			@Pc(375) int local375 = local169 * local350 - local179 * local345 >> 16;
			@Pc(388) int local388 = Static208.method3667(super.anInt1849 + local364, Static137.anInt3136, super.anInt1827 + local375);
			@Pc(393) int local393 = -local333 / 2;
			@Pc(397) int local397 = local340 / 2;
			@Pc(408) int local408 = local393 * local179 + local169 * local397 >> 16;
			@Pc(418) int local418 = local393 * local169 - local179 * local397 >> 16;
			@Pc(430) int local430 = Static208.method3667(local408 + super.anInt1849, Static137.anInt3136, local418 + super.anInt1827);
			@Pc(435) int local435 = -local340 / 2;
			@Pc(439) int local439 = local333 / 2;
			@Pc(449) int local449 = local179 * local439 + local435 * local169 >> 16;
			@Pc(460) int local460 = local439 * local169 - local179 * local435 >> 16;
			@Pc(464) int local464 = local333 / 2;
			@Pc(476) int local476 = Static208.method3667(super.anInt1849 + local449, Static137.anInt3136, super.anInt1827 + local460);
			@Pc(480) int local480 = local340 / 2;
			@Pc(491) int local491 = local169 * local464 - local480 * local179 >> 16;
			@Pc(501) int local501 = local169 * local480 + local464 * local179 >> 16;
			@Pc(513) int local513 = Static208.method3667(super.anInt1849 + local501, Static137.anInt3136, local491 + super.anInt1827);
			@Pc(524) int local524 = local513 <= local476 ? local513 : local476;
			@Pc(535) int local535 = local388 < local430 ? local388 : local430;
			local214 = local388 + local513;
			local120 = (int) (Math.atan2((double) (local535 - local524), (double) local333) * 325.95D) & 0x7FF;
			if (local476 + local430 < local214) {
				local214 = local476 + local430;
			}
			if (local120 != 0) {
				local62.method1418(local120);
			}
			@Pc(583) int local583 = local430 < local513 ? local430 : local513;
			@Pc(594) int local594 = local388 < local476 ? local388 : local476;
			local316 = (int) (Math.atan2((double) (local594 - local583), (double) local340) * 325.95D) & 0x7FF;
			if (local316 != 0) {
				local62.method1419(local316);
			}
			local214 = (local214 >> 1) - super.anInt1861;
			if (local214 != 0) {
				local62.method1432(0, local214, 0);
			}
		}
		@Pc(635) Class5_Sub3 local635 = null;
		if (!this.aBoolean72 && super.anInt1857 != -1 && super.anInt1843 != -1) {
			@Pc(653) Class2_Sub3_Sub27 local653 = Static19.method266(super.anInt1857);
			local635 = local653.method3452(super.anInt1843);
			if (local635 != null) {
				local635.method1432(0, -super.anInt1875, 0);
				if (local653.aBoolean188) {
					if (local120 != 0) {
						local635.method1418(local120);
					}
					if (local316 != 0) {
						local635.method1419(local316);
					}
					if (local214 != 0) {
						local635.method1432(0, local214, 0);
					}
				}
			}
		}
		@Pc(696) Class5_Sub3 local696 = null;
		if (!this.aBoolean72 && this.aClass5_Sub3_1 != null) {
			if (Static123.anInt2808 >= this.anInt1896) {
				this.aClass5_Sub3_1 = null;
			}
			if (Static123.anInt2808 >= this.anInt1890 && this.anInt1896 > Static123.anInt2808) {
				local696 = this.aClass5_Sub3_1;
				local696.method1432(this.anInt1889 - super.anInt1849, this.anInt1910 - super.anInt1861, this.anInt1900 - super.anInt1827);
				if (super.anInt1852 == 512) {
					local696.method1424();
				} else if (super.anInt1852 == 1024) {
					local696.method1427();
				} else if (super.anInt1852 == 1536) {
					local696.method1429();
				}
			}
		}
		if (local635 != null) {
			local62 = ((Class5_Sub3_Sub1) local62).method1444(local635);
		}
		if (local696 != null) {
			local62 = ((Class5_Sub3_Sub1) local62).method1444(local696);
		}
		local62.aBoolean65 = true;
		local62.method3779(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		if (local696 == null) {
			return;
		}
		if (super.anInt1852 == 512) {
			local696.method1429();
		} else if (super.anInt1852 == 1024) {
			local696.method1427();
		} else if (super.anInt1852 == 1536) {
			local696.method1424();
		}
		local696.method1432(super.anInt1849 - this.anInt1889, -this.anInt1910 + super.anInt1861, super.anInt1827 - this.anInt1900);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIIIIIIIIILclient!qc;)V")
	private void method1495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class5_Sub3 arg11) {
		@Pc(12) int local12 = arg10 * arg10 + arg5 * arg5;
		if (local12 < 16 || local12 > 360000) {
			return;
		}
		@Pc(30) int local30 = (int) (Math.atan2((double) arg10, (double) arg5) * 325.949D) & 0x7FF;
		@Pc(42) Class5_Sub3 local42 = Static25.method332(super.anInt1827, super.anInt1849, arg11, super.anInt1861, arg4, local30);
		if (local42 != null) {
			local42.method3779(0, arg8, arg9, arg3, arg6, arg2, arg7, arg0, -1L);
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!nh;I)V")
	public void method1496(@OriginalArg(0) Class2_Sub23 arg0) {
		arg0.anInt2703 = 0;
		@Pc(12) int local12 = arg0.method2122();
		@Pc(14) int local14 = -1;
		@Pc(22) boolean local22 = (local12 & 0x4) != 0;
		@Pc(26) int local26 = local12 & 0x1;
		@Pc(29) int[] local29 = new int[12];
		if ((local12 & 0x2) == 2) {
			this.aShort16 = (short) (arg0.method2122() << 2);
			this.aShort15 = (short) (arg0.method2122() << 2);
		} else {
			this.aShort15 = 0;
			this.aShort16 = 0;
		}
		super.anInt1832 = (local12 >> 3) + 1;
		this.anInt1895 = arg0.method2114();
		this.anInt1908 = arg0.method2114();
		this.anInt1884 = 0;
		@Pc(100) int local100;
		@Pc(106) int local106;
		@Pc(139) int local139;
		for (@Pc(82) int local82 = 0; local82 < 12; local82++) {
			@Pc(88) int local88 = arg0.method2122();
			if (local88 == 0) {
				local29[local82] = 0;
			} else {
				local100 = arg0.method2122();
				local106 = (local88 << 8) + local100;
				if (local82 == 0 && local106 == 65535) {
					local14 = arg0.method2095();
					break;
				}
				if (local106 >= 32768) {
					local106 = Static82.anIntArray294[local106 - 32768];
					local29[local82] = local106 | 0x40000000;
					local139 = Static32.method3209(local106).anInt3486;
					if (local139 != 0) {
						this.anInt1884 = local139;
					}
				} else {
					local29[local82] = local106 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(166) int[] local166 = new int[5];
		for (local100 = 0; local100 < 5; local100++) {
			local106 = arg0.method2122();
			if (local106 < 0 || Static60.aShortArrayArray30[local100].length <= local106) {
				local106 = 0;
			}
			local166[local100] = local106;
		}
		super.anInt1879 = arg0.method2095();
		if (super.anInt1879 == 65535) {
			super.anInt1879 = -1;
		}
		super.anInt1866 = arg0.method2095();
		if (super.anInt1866 == 65535) {
			super.anInt1866 = -1;
		}
		super.anInt1847 = super.anInt1866;
		super.anInt1880 = arg0.method2095();
		if (super.anInt1880 == 65535) {
			super.anInt1880 = -1;
		}
		super.anInt1855 = arg0.method2095();
		if (super.anInt1855 == 65535) {
			super.anInt1855 = -1;
		}
		super.anInt1863 = arg0.method2095();
		if (super.anInt1863 == 65535) {
			super.anInt1863 = -1;
		}
		super.anInt1851 = arg0.method2095();
		if (super.anInt1851 == 65535) {
			super.anInt1851 = -1;
		}
		super.anInt1824 = arg0.method2095();
		if (super.anInt1824 == 65535) {
			super.anInt1824 = -1;
		}
		this.aClass78_423 = Static103.method1785(arg0.method2123()).method3048();
		this.anInt1898 = arg0.method2122();
		if (local22) {
			this.anInt1894 = arg0.method2095();
		} else {
			this.anInt1894 = 0;
		}
		local106 = this.anInt1901;
		this.anInt1901 = arg0.method2122();
		if (this.anInt1901 == 0) {
			Static188.method3488(this);
		} else {
			local139 = this.anInt1899;
			@Pc(350) int local350 = this.anInt1887;
			@Pc(353) int local353 = this.anInt1906;
			this.anInt1899 = arg0.method2095();
			this.anInt1887 = arg0.method2095();
			this.anInt1906 = arg0.method2095();
			if (local106 != this.anInt1901 || local139 != this.anInt1899 || local350 != this.anInt1887 || this.anInt1906 != local353) {
				Static121.method3981(this);
			}
		}
		if (this.aClass112_1 == null) {
			this.aClass112_1 = new Class112();
		}
		this.aClass112_1.method3941(local26 == 1, local14, local166, local29);
	}
}
