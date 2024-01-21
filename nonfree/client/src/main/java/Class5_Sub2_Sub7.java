import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class5_Sub2_Sub7 extends Class5_Sub2 {

	@OriginalMember(owner = "client!f", name = "db", descriptor = "I")
	public int anInt836;

	@OriginalMember(owner = "client!f", name = "ib", descriptor = "[I")
	public int[] anIntArray141;

	@OriginalMember(owner = "client!f", name = "rb", descriptor = "[I")
	private int[] anIntArray142;

	@OriginalMember(owner = "client!f", name = "ub", descriptor = "[S")
	private short[] aShortArray4;

	@OriginalMember(owner = "client!f", name = "yb", descriptor = "[S")
	private short[] aShortArray5;

	@OriginalMember(owner = "client!f", name = "Qb", descriptor = "[I")
	public int[] anIntArray143;

	@OriginalMember(owner = "client!f", name = "Vb", descriptor = "[I")
	private int[] anIntArray144;

	@OriginalMember(owner = "client!f", name = "T", descriptor = "I")
	private int anInt826 = -1;

	@OriginalMember(owner = "client!f", name = "W", descriptor = "I")
	public int anInt829 = 1;

	@OriginalMember(owner = "client!f", name = "jb", descriptor = "I")
	private int anInt840 = 0;

	@OriginalMember(owner = "client!f", name = "nb", descriptor = "Z")
	public boolean aBoolean35 = true;

	@OriginalMember(owner = "client!f", name = "kb", descriptor = "I")
	public int anInt841 = -1;

	@OriginalMember(owner = "client!f", name = "fb", descriptor = "I")
	public int anInt837 = 16;

	@OriginalMember(owner = "client!f", name = "zb", descriptor = "I")
	private int anInt851 = -1;

	@OriginalMember(owner = "client!f", name = "ab", descriptor = "I")
	public int anInt833 = 0;

	@OriginalMember(owner = "client!f", name = "Bb", descriptor = "Z")
	public boolean aBoolean37 = false;

	@OriginalMember(owner = "client!f", name = "bb", descriptor = "I")
	private int anInt834 = 0;

	@OriginalMember(owner = "client!f", name = "lb", descriptor = "I")
	private int anInt842 = 128;

	@OriginalMember(owner = "client!f", name = "U", descriptor = "I")
	public int anInt827 = -1;

	@OriginalMember(owner = "client!f", name = "Eb", descriptor = "Z")
	public boolean aBoolean38 = false;

	@OriginalMember(owner = "client!f", name = "Fb", descriptor = "Z")
	public boolean aBoolean39 = false;

	@OriginalMember(owner = "client!f", name = "Gb", descriptor = "I")
	public int anInt855 = -1;

	@OriginalMember(owner = "client!f", name = "Y", descriptor = "I")
	public int anInt831 = -1;

	@OriginalMember(owner = "client!f", name = "hb", descriptor = "I")
	public int anInt839 = 1;

	@OriginalMember(owner = "client!f", name = "Z", descriptor = "I")
	public int anInt832 = -1;

	@OriginalMember(owner = "client!f", name = "Wb", descriptor = "I")
	private int anInt863 = 0;

	@OriginalMember(owner = "client!f", name = "eb", descriptor = "[Lclient!mb;")
	public final Class45[] aClass45Array9 = new Class45[5];

	@OriginalMember(owner = "client!f", name = "S", descriptor = "I")
	private int anInt825 = 0;

	@OriginalMember(owner = "client!f", name = "Tb", descriptor = "Z")
	public boolean aBoolean40 = false;

	@OriginalMember(owner = "client!f", name = "Yb", descriptor = "Lclient!mb;")
	public Class45 aClass45_418 = Static12.aClass45_1358;

	@OriginalMember(owner = "client!f", name = "tb", descriptor = "Z")
	private boolean aBoolean36 = false;

	@OriginalMember(owner = "client!f", name = "Zb", descriptor = "I")
	private int anInt865 = 128;

	@OriginalMember(owner = "client!f", name = "Ob", descriptor = "I")
	public int anInt860 = 0;

	@OriginalMember(owner = "client!f", name = "xb", descriptor = "I")
	public int anInt850 = 0;

	@OriginalMember(owner = "client!f", name = "ec", descriptor = "Z")
	public boolean aBoolean43 = true;

	@OriginalMember(owner = "client!f", name = "gc", descriptor = "I")
	private int anInt867 = 0;

	@OriginalMember(owner = "client!f", name = "cc", descriptor = "Z")
	private boolean aBoolean41 = false;

	@OriginalMember(owner = "client!f", name = "pb", descriptor = "I")
	private int anInt845 = 128;

	@OriginalMember(owner = "client!f", name = "Nb", descriptor = "I")
	public int anInt859 = 0;

	@OriginalMember(owner = "client!f", name = "V", descriptor = "I")
	public int anInt828 = -1;

	@OriginalMember(owner = "client!f", name = "dc", descriptor = "Z")
	public boolean aBoolean42 = true;

	@OriginalMember(owner = "client!f", name = "e", descriptor = "(I)Z")
	public boolean method600() {
		if (this.anIntArray143 == null) {
			return this.anInt855 != -1 || this.anIntArray141 != null;
		}
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray143.length; local20++) {
			if (this.anIntArray143[local20] != -1) {
				@Pc(35) Class5_Sub2_Sub7 local35 = Static62.method1232(this.anIntArray143[local20]);
				if (local35.anInt855 != -1 || local35.anIntArray141 != null) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!ka;IIIIIIII)Lclient!dd;")
	public Class5_Sub2_Sub4_Sub2 method601(@OriginalArg(0) Class5_Sub2_Sub9 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(30) long local30;
		if (this.anIntArray144 == null) {
			local30 = (this.anInt836 << 10) + arg2;
		} else {
			local30 = (this.anInt836 << 10) - (-(arg3 << 3) - arg2);
		}
		@Pc(46) Class5_Sub2_Sub4_Sub2 local46 = (Class5_Sub2_Sub4_Sub2) Static38.aClass67_10.method1823(local30);
		if (local46 == null) {
			@Pc(54) Class5_Sub2_Sub4_Sub7 local54 = this.method602(arg3, arg2);
			if (local54 == null) {
				return null;
			}
			local46 = local54.method1579(this.anInt867 + 64, this.anInt825 * 5 + 768, -50, -10, -50);
			Static38.aClass67_10.method1818(local46, local30);
		}
		if (arg0 == null && !this.aBoolean40) {
			return local46;
		}
		if (arg0 == null) {
			local46 = local46.method436(true);
		} else {
			local46 = arg0.method1157(local46, arg5, arg2);
		}
		if (this.aBoolean40) {
			local46.method427(arg1, arg4, arg7, arg6, false);
		}
		return local46;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIB)Lclient!pa;")
	private Class5_Sub2_Sub4_Sub7 method602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class5_Sub2_Sub4_Sub7 local5 = null;
		@Pc(12) int local12;
		@Pc(38) int local38;
		@Pc(109) boolean local109;
		if (this.anIntArray144 == null) {
			if (arg0 != 10) {
				return null;
			}
			if (this.anIntArray142 == null) {
				return null;
			}
			local109 = arg1 > 3 ^ this.aBoolean36;
			local12 = this.anIntArray142.length;
			for (local38 = 0; local38 < local12; local38++) {
				@Pc(121) int local121 = this.anIntArray142[local38];
				if (local109) {
					local121 += 65536;
				}
				local5 = (Class5_Sub2_Sub4_Sub7) Static120.aClass67_26.method1823((long) local121);
				if (local5 == null) {
					local5 = Static83.method1570(Static102.aClass29_65, local121 & 0xFFFF);
					if (local5 == null) {
						return null;
					}
					if (local109) {
						local5.method1585();
					}
					Static120.aClass67_26.method1818(local5, (long) local121);
				}
				if (local12 > 1) {
					Static3.aClass5_Sub2_Sub4_Sub7Array1[local38] = local5;
				}
			}
			if (local12 > 1) {
				local5 = new Class5_Sub2_Sub4_Sub7(Static3.aClass5_Sub2_Sub4_Sub7Array1, local12);
			}
		} else {
			@Pc(10) int local10 = -1;
			for (local12 = 0; local12 < this.anIntArray144.length; local12++) {
				if (arg0 == this.anIntArray144[local12]) {
					local10 = local12;
					break;
				}
			}
			if (local10 == -1) {
				return null;
			}
			local38 = this.anIntArray142[local10];
			@Pc(50) boolean local50 = this.aBoolean36 ^ arg1 > 3;
			if (local50) {
				local38 += 65536;
			}
			local5 = (Class5_Sub2_Sub4_Sub7) Static120.aClass67_26.method1823((long) local38);
			if (local5 == null) {
				local5 = Static83.method1570(Static102.aClass29_65, local38 & 0xFFFF);
				if (local5 == null) {
					return null;
				}
				if (local50) {
					local5.method1585();
				}
				Static120.aClass67_26.method1818(local5, (long) local38);
			}
		}
		if (this.anInt845 == 128 && this.anInt842 == 128 && this.anInt865 == 128) {
			local109 = false;
		} else {
			local109 = true;
		}
		@Pc(226) boolean local226;
		if (this.anInt840 == 0 && this.anInt863 == 0 && this.anInt834 == 0) {
			local226 = false;
		} else {
			local226 = true;
		}
		@Pc(253) Class5_Sub2_Sub4_Sub7 local253 = new Class5_Sub2_Sub4_Sub7(local5, arg1 == 0 && !local109 && !local226, this.aShortArray5 == null, true);
		@Pc(257) int local257 = arg1 & 0x3;
		if (local257 == 1) {
			local253.method1581();
		} else if (local257 == 2) {
			local253.method1580();
		} else if (local257 == 3) {
			local253.method1577();
		}
		if (this.aShortArray5 != null) {
			for (@Pc(289) int local289 = 0; local289 < this.aShortArray5.length; local289++) {
				local253.method1575(this.aShortArray5[local289], this.aShortArray4[local289]);
			}
		}
		if (local109) {
			local253.method1587(this.anInt845, this.anInt842, this.anInt865);
		}
		if (local226) {
			local253.method1582(this.anInt840, this.anInt863, this.anInt834);
		}
		return local253;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIIII)Lclient!dd;")
	public Class5_Sub2_Sub4_Sub2 method603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(14) long local14;
		if (this.anIntArray144 == null) {
			local14 = (this.anInt836 << 10) + arg5;
		} else {
			local14 = (arg0 << 3) + (this.anInt836 << 10) + arg5;
		}
		@Pc(34) Class5_Sub2_Sub4_Sub2 local34 = (Class5_Sub2_Sub4_Sub2) Static38.aClass67_10.method1823(local14);
		if (local34 == null) {
			@Pc(42) Class5_Sub2_Sub4_Sub7 local42 = this.method602(arg0, arg5);
			if (local42 == null) {
				return null;
			}
			local34 = local42.method1579(this.anInt867 + 64, 768 - -(this.anInt825 * 5), -50, -10, -50);
			Static38.aClass67_10.method1818(local34, local14);
		}
		if (this.aBoolean40) {
			local34 = local34.method427(arg1, arg2, arg3, arg4, true);
		}
		return local34;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!hb;I)V")
	public void method604(@OriginalArg(0) Class5_Sub9 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method1408();
			if (local3 == 0) {
				return;
			}
			this.method611(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!f", name = "f", descriptor = "(I)Lclient!f;")
	public Class5_Sub2_Sub7 method606() {
		@Pc(5) int local5 = -1;
		if (this.anInt851 != -1) {
			local5 = Static112.method2047(this.anInt851);
		} else if (this.anInt826 != -1) {
			local5 = Static117.anIntArray483[this.anInt826];
		}
		return local5 < 0 || this.anIntArray143.length <= local5 || this.anIntArray143[local5] == -1 ? null : Static62.method1232(this.anIntArray143[local5]);
	}

	@OriginalMember(owner = "client!f", name = "d", descriptor = "(B)Z")
	public boolean method607() {
		if (this.anIntArray142 == null) {
			return true;
		}
		@Pc(18) boolean local18 = true;
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray142.length; local20++) {
			local18 &= Static102.aClass29_65.method739(this.anIntArray142[local20] & 0xFFFF, 0);
		}
		return local18;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(BI)Z")
	public boolean method608(@OriginalArg(1) int arg0) {
		if (this.anIntArray144 != null) {
			for (@Pc(55) int local55 = 0; local55 < this.anIntArray144.length; local55++) {
				if (arg0 == this.anIntArray144[local55]) {
					return Static102.aClass29_65.method739(this.anIntArray142[local55] & 0xFFFF, 0);
				}
			}
			return true;
		} else if (this.anIntArray142 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(25) boolean local25 = true;
			for (@Pc(27) int local27 = 0; local27 < this.anIntArray142.length; local27++) {
				local25 &= Static102.aClass29_65.method739(this.anIntArray142[local27] & 0xFFFF, 0);
			}
			return local25;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IILclient!hb;)V")
	private void method611(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub9 arg1) {
		@Pc(17) int local17;
		@Pc(33) int local33;
		if (arg0 == 1) {
			local17 = arg1.method1408();
			if (local17 > 0) {
				if (this.anIntArray142 == null || Static29.aBoolean44) {
					this.anIntArray144 = new int[local17];
					this.anIntArray142 = new int[local17];
					for (local33 = 0; local33 < local17; local33++) {
						this.anIntArray142[local33] = arg1.method1418();
						this.anIntArray144[local33] = arg1.method1408();
					}
				} else {
					arg1.anInt2140 += local17 * 3;
				}
			}
		} else if (arg0 == 2) {
			this.aClass45_418 = arg1.method1448();
		} else if (arg0 == 5) {
			local17 = arg1.method1408();
			if (local17 > 0) {
				if (this.anIntArray142 == null || Static29.aBoolean44) {
					this.anIntArray142 = new int[local17];
					this.anIntArray144 = null;
					for (local33 = 0; local33 < local17; local33++) {
						this.anIntArray142[local33] = arg1.method1418();
					}
				} else {
					arg1.anInt2140 += local17 * 2;
				}
			}
		} else if (arg0 == 14) {
			this.anInt839 = arg1.method1408();
		} else if (arg0 == 15) {
			this.anInt829 = arg1.method1408();
		} else if (arg0 == 17) {
			this.aBoolean35 = false;
			this.aBoolean43 = false;
		} else if (arg0 == 18) {
			this.aBoolean35 = false;
		} else if (arg0 == 19) {
			this.anInt828 = arg1.method1408();
		} else if (arg0 == 21) {
			this.aBoolean40 = true;
		} else if (arg0 == 22) {
			this.aBoolean41 = true;
		} else if (arg0 == 23) {
			this.aBoolean38 = true;
		} else if (arg0 == 24) {
			this.anInt831 = arg1.method1418();
			if (this.anInt831 == 65535) {
				this.anInt831 = -1;
			}
		} else if (arg0 == 28) {
			this.anInt837 = arg1.method1408();
		} else if (arg0 == 29) {
			this.anInt867 = arg1.method1447();
		} else if (arg0 == 39) {
			this.anInt825 = arg1.method1447() * 5;
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass45Array9[arg0 - 30] = arg1.method1448();
			if (this.aClass45Array9[arg0 - 30].method1330(Static50.aClass45_642)) {
				this.aClass45Array9[arg0 - 30] = null;
			}
		} else if (arg0 == 40) {
			local17 = arg1.method1408();
			this.aShortArray5 = new short[local17];
			this.aShortArray4 = new short[local17];
			for (local33 = 0; local33 < local17; local33++) {
				this.aShortArray5[local33] = (short) arg1.method1418();
				this.aShortArray4[local33] = (short) arg1.method1418();
			}
		} else if (arg0 == 60) {
			this.anInt841 = arg1.method1418();
		} else if (arg0 == 62) {
			this.aBoolean36 = true;
		} else if (arg0 == 64) {
			this.aBoolean42 = false;
		} else if (arg0 == 65) {
			this.anInt845 = arg1.method1418();
		} else if (arg0 == 66) {
			this.anInt842 = arg1.method1418();
		} else if (arg0 == 67) {
			this.anInt865 = arg1.method1418();
		} else if (arg0 == 68) {
			this.anInt827 = arg1.method1418();
		} else if (arg0 == 69) {
			this.anInt859 = arg1.method1408();
		} else if (arg0 == 70) {
			this.anInt840 = arg1.method1410();
		} else if (arg0 == 71) {
			this.anInt863 = arg1.method1410();
		} else if (arg0 == 72) {
			this.anInt834 = arg1.method1410();
		} else if (arg0 == 73) {
			this.aBoolean39 = true;
		} else if (arg0 == 74) {
			this.aBoolean37 = true;
		} else if (arg0 == 75) {
			this.anInt832 = arg1.method1408();
		} else if (arg0 == 77) {
			this.anInt851 = arg1.method1418();
			if (this.anInt851 == 65535) {
				this.anInt851 = -1;
			}
			this.anInt826 = arg1.method1418();
			if (this.anInt826 == 65535) {
				this.anInt826 = -1;
			}
			local17 = arg1.method1408();
			this.anIntArray143 = new int[local17 + 1];
			for (local33 = 0; local33 <= local17; local33++) {
				this.anIntArray143[local33] = arg1.method1418();
				if (this.anIntArray143[local33] == 65535) {
					this.anIntArray143[local33] = -1;
				}
			}
		} else if (arg0 == 78) {
			this.anInt855 = arg1.method1418();
			this.anInt860 = arg1.method1408();
		} else if (arg0 == 79) {
			this.anInt833 = arg1.method1418();
			this.anInt850 = arg1.method1418();
			this.anInt860 = arg1.method1408();
			local17 = arg1.method1408();
			this.anIntArray141 = new int[local17];
			for (local33 = 0; local33 < local17; local33++) {
				this.anIntArray141[local33] = arg1.method1418();
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IBIIIII)Lclient!jf;")
	public Class5_Sub2_Sub4 method612(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(20) long local20;
		if (this.anIntArray144 == null) {
			local20 = arg0 + (this.anInt836 << 10);
		} else {
			local20 = arg0 + (arg3 << 3) + (this.anInt836 << 10);
		}
		@Pc(39) Class5_Sub2_Sub4 local39 = (Class5_Sub2_Sub4) Static23.aClass67_7.method1823(local20);
		if (local39 == null) {
			@Pc(47) Class5_Sub2_Sub4_Sub7 local47 = this.method602(arg3, arg0);
			if (local47 == null) {
				return null;
			}
			if (this.aBoolean41) {
				local39 = local47;
				local47.aShort2 = (short) (this.anInt825 * 5 + 768);
				local47.aShort1 = (short) (this.anInt867 + 64);
				local47.method1583();
			} else {
				local39 = local47.method1579(this.anInt867 + 64, 768 - -(this.anInt825 * 5), -50, -10, -50);
			}
			Static23.aClass67_7.method1818(local39, local20);
		}
		if (this.aBoolean41) {
			local39 = ((Class5_Sub2_Sub4_Sub7) local39).method1572();
		}
		if (this.aBoolean40) {
			if (local39 instanceof Class5_Sub2_Sub4_Sub2) {
				local39 = ((Class5_Sub2_Sub4_Sub2) local39).method427(arg5, arg1, arg4, arg2, true);
			} else if (local39 instanceof Class5_Sub2_Sub4_Sub7) {
				local39 = ((Class5_Sub2_Sub4_Sub7) local39).method1584(arg5, arg1, arg4, arg2);
			}
		}
		return local39;
	}

	@OriginalMember(owner = "client!f", name = "f", descriptor = "(B)V")
	public void method614() {
		if (this.anInt828 == -1) {
			this.anInt828 = 0;
			if (this.anIntArray142 != null && (this.anIntArray144 == null || this.anIntArray144[0] == 10)) {
				this.anInt828 = 1;
			}
			for (@Pc(31) int local31 = 0; local31 < 5; local31++) {
				if (this.aClass45Array9[local31] != null) {
					this.anInt828 = 1;
				}
			}
		}
		if (this.anInt832 == -1) {
			this.anInt832 = this.aBoolean43 ? 1 : 0;
		}
	}
}
