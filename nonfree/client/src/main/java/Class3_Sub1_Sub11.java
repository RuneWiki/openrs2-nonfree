import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class3_Sub1_Sub11 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ne", name = "Y", descriptor = "[I")
	public int[] anIntArray219;

	@OriginalMember(owner = "client!ne", name = "bb", descriptor = "[I")
	private int[] anIntArray220;

	@OriginalMember(owner = "client!ne", name = "eb", descriptor = "[I")
	public int[] anIntArray221;

	@OriginalMember(owner = "client!ne", name = "hb", descriptor = "[I")
	private int[] anIntArray222;

	@OriginalMember(owner = "client!ne", name = "W", descriptor = "I")
	public int anInt1923 = 99;

	@OriginalMember(owner = "client!ne", name = "R", descriptor = "I")
	public int anInt1918 = 5;

	@OriginalMember(owner = "client!ne", name = "mb", descriptor = "I")
	public int anInt1933 = -1;

	@OriginalMember(owner = "client!ne", name = "lb", descriptor = "I")
	public int anInt1932 = -1;

	@OriginalMember(owner = "client!ne", name = "ib", descriptor = "I")
	public int anInt1930 = -1;

	@OriginalMember(owner = "client!ne", name = "jb", descriptor = "I")
	public int anInt1931 = -1;

	@OriginalMember(owner = "client!ne", name = "X", descriptor = "I")
	public int anInt1924 = 2;

	@OriginalMember(owner = "client!ne", name = "kb", descriptor = "Z")
	public boolean aBoolean93 = false;

	@OriginalMember(owner = "client!ne", name = "O", descriptor = "I")
	public int anInt1915 = -1;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!m;I)V")
	public void method1251(@OriginalArg(0) Class3_Sub6 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1587();
			if (local9 == 0) {
				return;
			}
			this.method1253(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!m;II)V")
	private void method1253(@OriginalArg(0) Class3_Sub6 arg0, @OriginalArg(1) int arg1) {
		@Pc(17) int local17;
		@Pc(23) int local23;
		@Pc(42) int local42;
		if (arg1 == 1) {
			local17 = arg0.method1587();
			this.anIntArray219 = new int[local17];
			for (local23 = 0; local23 < local17; local23++) {
				this.anIntArray219[local23] = arg0.method1603();
			}
			this.anIntArray221 = new int[local17];
			for (local42 = 0; local42 < local17; local42++) {
				this.anIntArray221[local42] = arg0.method1603();
			}
			for (@Pc(59) int local59 = 0; local59 < local17; local59++) {
				this.anIntArray221[local59] += arg0.method1603() << 16;
			}
		} else if (arg1 == 2) {
			this.anInt1932 = arg0.method1603();
		} else if (arg1 == 3) {
			local17 = arg0.method1587();
			this.anIntArray222 = new int[local17 + 1];
			for (local23 = 0; local23 < local17; local23++) {
				this.anIntArray222[local23] = arg0.method1587();
			}
			this.anIntArray222[local17] = 9999999;
		} else if (arg1 == 4) {
			this.aBoolean93 = true;
		} else if (arg1 == 5) {
			this.anInt1918 = arg0.method1587();
		} else if (arg1 == 6) {
			this.anInt1915 = arg0.method1603();
		} else if (arg1 == 7) {
			this.anInt1930 = arg0.method1603();
		} else if (arg1 == 8) {
			this.anInt1923 = arg0.method1587();
		} else if (arg1 == 9) {
			this.anInt1933 = arg0.method1587();
		} else if (arg1 == 10) {
			this.anInt1931 = arg0.method1587();
		} else if (arg1 == 11) {
			this.anInt1924 = arg0.method1587();
		} else if (arg1 == 12) {
			local17 = arg0.method1587();
			this.anIntArray220 = new int[local17];
			for (local23 = 0; local23 < local17; local23++) {
				this.anIntArray220[local23] = arg0.method1603();
			}
			for (local42 = 0; local42 < local17; local42++) {
				this.anIntArray220[local42] += arg0.method1603() << 16;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILclient!v;Lclient!ne;II)Lclient!v;")
	public Class3_Sub1_Sub1_Sub6 method1254(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub1_Sub6 arg1, @OriginalArg(2) Class3_Sub1_Sub11 arg2, @OriginalArg(4) int arg3) {
		@Pc(4) int local4 = this.anIntArray221[arg0];
		@Pc(14) Class3_Sub1_Sub12 local14 = Static93.method1559(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg2.method1256(arg1, arg3);
		}
		@Pc(31) int local31 = arg2.anIntArray221[arg3];
		@Pc(37) Class3_Sub1_Sub12 local37 = Static93.method1559(local31 >> -249009456);
		@Pc(41) int local41 = local31 & 0xFFFF;
		@Pc(54) Class3_Sub1_Sub1_Sub6 local54;
		if (local37 == null) {
			local54 = arg1.method1825(!local14.method1293(local18));
			local54.method1815(local14, local18);
			return local54;
		} else {
			local54 = arg1.method1825(!local14.method1293(local18) & !local37.method1293(local41));
			local54.method1796(local14, local18, local37, local41, this.anIntArray222);
			return local54;
		}
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)V")
	public void method1255() {
		if (this.anInt1931 == -1) {
			if (this.anIntArray222 == null) {
				this.anInt1931 = 0;
			} else {
				this.anInt1931 = 2;
			}
		}
		if (this.anInt1933 != -1) {
			return;
		}
		if (this.anIntArray222 == null) {
			this.anInt1933 = 0;
		} else {
			this.anInt1933 = 2;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!v;IZ)Lclient!v;")
	public Class3_Sub1_Sub1_Sub6 method1256(@OriginalArg(0) Class3_Sub1_Sub1_Sub6 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = this.anIntArray221[arg1];
		@Pc(10) Class3_Sub1_Sub12 local10 = Static93.method1559(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local10 == null) {
			return arg0.method1825(true);
		} else {
			@Pc(46) Class3_Sub1_Sub1_Sub6 local46 = arg0.method1825(!local10.method1293(local18));
			local46.method1815(local10, local18);
			return local46;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!v;II)Lclient!v;")
	public Class3_Sub1_Sub1_Sub6 method1258(@OriginalArg(0) Class3_Sub1_Sub1_Sub6 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = this.anIntArray221[arg1];
		@Pc(14) Class3_Sub1_Sub12 local14 = Static93.method1559(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg0.method1805(true);
		} else {
			@Pc(35) Class3_Sub1_Sub1_Sub6 local35 = arg0.method1805(!local14.method1293(local18));
			local35.method1815(local14, local18);
			return local35;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILclient!v;I)Lclient!v;")
	public Class3_Sub1_Sub1_Sub6 method1259(@OriginalArg(1) Class3_Sub1_Sub1_Sub6 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anIntArray221[arg1];
		@Pc(14) Class3_Sub1_Sub12 local14 = Static93.method1559(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg0.method1825(true);
		}
		@Pc(26) Class3_Sub1_Sub12 local26 = null;
		@Pc(33) int local33 = 0;
		if (this.anIntArray220 != null && arg1 < this.anIntArray220.length) {
			local33 = this.anIntArray220[arg1];
			local26 = Static93.method1559(local33 >> 16);
			local33 &= 0xFFFF;
		}
		@Pc(74) Class3_Sub1_Sub1_Sub6 local74;
		if (local26 == null || local33 == 65535) {
			local74 = arg0.method1825(!local14.method1293(local18));
			local74.method1815(local14, local18);
			return local74;
		} else {
			local74 = arg0.method1825(!local14.method1293(local18) & !local26.method1293(local33));
			local74.method1815(local14, local18);
			local74.method1815(local26, local33);
			return local74;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!v;III)Lclient!v;")
	public Class3_Sub1_Sub1_Sub6 method1260(@OriginalArg(0) Class3_Sub1_Sub1_Sub6 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = this.anIntArray221[arg1];
		@Pc(21) Class3_Sub1_Sub12 local21 = Static93.method1559(local15 >> 16);
		@Pc(25) int local25 = local15 & 0xFFFF;
		if (local21 == null) {
			return arg0.method1825(true);
		}
		@Pc(42) Class3_Sub1_Sub1_Sub6 local42 = arg0.method1825(!local21.method1293(local25));
		@Pc(46) int local46 = arg2 & 0x3;
		if (local46 == 1) {
			local42.method1809();
		} else if (local46 == 2) {
			local42.method1820();
		} else if (local46 == 3) {
			local42.method1813();
		}
		local42.method1815(local21, local25);
		if (local46 == 1) {
			local42.method1813();
		} else if (local46 == 2) {
			local42.method1820();
		} else if (local46 == 3) {
			local42.method1809();
		}
		return local42;
	}
}
