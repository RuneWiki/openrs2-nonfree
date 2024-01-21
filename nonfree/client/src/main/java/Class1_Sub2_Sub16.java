import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class1_Sub2_Sub16 extends Class1_Sub2 {

	@OriginalMember(owner = "client!pe", name = "M", descriptor = "[I")
	public int[] anIntArray379;

	@OriginalMember(owner = "client!pe", name = "N", descriptor = "[I")
	public int[] anIntArray380;

	@OriginalMember(owner = "client!pe", name = "gb", descriptor = "I")
	private int anInt2128;

	@OriginalMember(owner = "client!pe", name = "hb", descriptor = "[S")
	private short[] aShortArray9;

	@OriginalMember(owner = "client!pe", name = "Eb", descriptor = "[S")
	private short[] aShortArray10;

	@OriginalMember(owner = "client!pe", name = "Kb", descriptor = "I")
	public int anInt2155;

	@OriginalMember(owner = "client!pe", name = "P", descriptor = "I")
	public int anInt2113 = 0;

	@OriginalMember(owner = "client!pe", name = "ab", descriptor = "I")
	private int anInt2123 = 128;

	@OriginalMember(owner = "client!pe", name = "Z", descriptor = "I")
	private int anInt2122 = -1;

	@OriginalMember(owner = "client!pe", name = "ib", descriptor = "I")
	private int anInt2129 = -1;

	@OriginalMember(owner = "client!pe", name = "Y", descriptor = "I")
	private int anInt2121 = -1;

	@OriginalMember(owner = "client!pe", name = "lb", descriptor = "I")
	public int anInt2132 = 0;

	@OriginalMember(owner = "client!pe", name = "db", descriptor = "[Lclient!fc;")
	public Class25[] aClass25Array18 = new Class25[] { null, null, Static22.aClass25_343, null, null };

	@OriginalMember(owner = "client!pe", name = "jb", descriptor = "I")
	private int anInt2130 = -1;

	@OriginalMember(owner = "client!pe", name = "pb", descriptor = "I")
	public int anInt2136 = 2000;

	@OriginalMember(owner = "client!pe", name = "sb", descriptor = "I")
	private int anInt2139 = -1;

	@OriginalMember(owner = "client!pe", name = "ub", descriptor = "I")
	private int anInt2140 = 128;

	@OriginalMember(owner = "client!pe", name = "fb", descriptor = "I")
	private int anInt2127 = 128;

	@OriginalMember(owner = "client!pe", name = "tb", descriptor = "[Lclient!fc;")
	public Class25[] aClass25Array19 = new Class25[] { null, null, null, null, Static23.aClass25_284 };

	@OriginalMember(owner = "client!pe", name = "Db", descriptor = "I")
	public int anInt2149 = 1;

	@OriginalMember(owner = "client!pe", name = "Bb", descriptor = "I")
	public int anInt2147 = -1;

	@OriginalMember(owner = "client!pe", name = "nb", descriptor = "I")
	private int anInt2134 = -1;

	@OriginalMember(owner = "client!pe", name = "Fb", descriptor = "I")
	public int anInt2150 = 0;

	@OriginalMember(owner = "client!pe", name = "Jb", descriptor = "I")
	private int anInt2154 = -1;

	@OriginalMember(owner = "client!pe", name = "U", descriptor = "Z")
	public boolean aBoolean104 = false;

	@OriginalMember(owner = "client!pe", name = "Nb", descriptor = "I")
	public int anInt2158 = 0;

	@OriginalMember(owner = "client!pe", name = "X", descriptor = "I")
	private int anInt2120 = -1;

	@OriginalMember(owner = "client!pe", name = "zb", descriptor = "I")
	private int anInt2145 = 0;

	@OriginalMember(owner = "client!pe", name = "eb", descriptor = "I")
	public int anInt2126 = 0;

	@OriginalMember(owner = "client!pe", name = "yb", descriptor = "I")
	public int anInt2144 = -1;

	@OriginalMember(owner = "client!pe", name = "S", descriptor = "I")
	public int anInt2116 = 0;

	@OriginalMember(owner = "client!pe", name = "Ib", descriptor = "I")
	private int anInt2153 = -1;

	@OriginalMember(owner = "client!pe", name = "Qb", descriptor = "Lclient!fc;")
	public Class25 aClass25_1018 = Static87.aClass25_798;

	@OriginalMember(owner = "client!pe", name = "Gb", descriptor = "I")
	public int anInt2151 = 0;

	@OriginalMember(owner = "client!pe", name = "bb", descriptor = "I")
	private int anInt2124 = -1;

	@OriginalMember(owner = "client!pe", name = "Rb", descriptor = "I")
	public int anInt2161 = 0;

	@OriginalMember(owner = "client!pe", name = "ec", descriptor = "I")
	private int anInt2165 = 0;

	@OriginalMember(owner = "client!pe", name = "Hb", descriptor = "I")
	public int anInt2152 = 0;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZ)Z")
	public boolean method1577(@OriginalArg(1) boolean arg0) {
		@Pc(6) int local6 = this.anInt2124;
		@Pc(9) int local9 = this.anInt2129;
		if (arg0) {
			local6 = this.anInt2154;
			local9 = this.anInt2134;
		}
		if (local9 == -1) {
			return true;
		}
		@Pc(30) boolean local30 = true;
		if (!Static34.aClass56_31.method1265(local9, 0)) {
			local30 = false;
		}
		if (local6 != -1 && !Static34.aClass56_31.method1265(local6, 0)) {
			local30 = false;
		}
		return local30;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZB)Z")
	public boolean method1581(@OriginalArg(0) boolean arg0) {
		@Pc(6) int local6 = this.anInt2153;
		@Pc(9) int local9 = this.anInt2121;
		@Pc(12) int local12 = this.anInt2130;
		if (arg0) {
			local9 = this.anInt2122;
			local12 = this.anInt2120;
			local6 = this.anInt2139;
		}
		if (local6 == -1) {
			return true;
		}
		@Pc(30) boolean local30 = true;
		if (!Static34.aClass56_31.method1265(local6, 0)) {
			local30 = false;
		}
		if (local9 != -1 && !Static34.aClass56_31.method1265(local9, 0)) {
			local30 = false;
		}
		if (local12 != -1 && !Static34.aClass56_31.method1265(local12, 0)) {
			local30 = false;
		}
		return local30;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILclient!pe;Lclient!pe;)V")
	public void method1583(@OriginalArg(1) Class1_Sub2_Sub16 arg0, @OriginalArg(2) Class1_Sub2_Sub16 arg1) {
		this.anInt2128 = arg1.anInt2128;
		this.anInt2136 = arg1.anInt2136;
		this.aBoolean104 = arg0.aBoolean104;
		this.aShortArray9 = arg1.aShortArray9;
		this.anInt2161 = arg1.anInt2161;
		this.anInt2113 = arg1.anInt2113;
		this.aClass25_1018 = arg0.aClass25_1018;
		this.anInt2150 = arg1.anInt2150;
		this.anInt2149 = arg0.anInt2149;
		this.anInt2126 = arg1.anInt2126;
		this.aShortArray10 = arg1.aShortArray10;
		this.anInt2151 = arg1.anInt2151;
		this.anInt2152 = 1;
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(IZ)Lclient!ub;")
	public Class1_Sub2_Sub3_Sub7 method1584(@OriginalArg(1) boolean arg0) {
		@Pc(8) int local8 = this.anInt2130;
		@Pc(11) int local11 = this.anInt2153;
		@Pc(14) int local14 = this.anInt2121;
		if (arg0) {
			local8 = this.anInt2120;
			local11 = this.anInt2139;
			local14 = this.anInt2122;
		}
		if (local11 == -1) {
			return null;
		}
		@Pc(35) Class1_Sub2_Sub3_Sub7 local35 = Static117.method1886(Static34.aClass56_31, local11);
		if (local14 != -1) {
			@Pc(43) Class1_Sub2_Sub3_Sub7 local43 = Static117.method1886(Static34.aClass56_31, local14);
			if (local8 == -1) {
				@Pc(86) Class1_Sub2_Sub3_Sub7[] local86 = new Class1_Sub2_Sub3_Sub7[] { local35, local43 };
				local35 = new Class1_Sub2_Sub3_Sub7(local86, 2);
			} else {
				@Pc(52) Class1_Sub2_Sub3_Sub7 local52 = Static117.method1886(Static34.aClass56_31, local8);
				@Pc(67) Class1_Sub2_Sub3_Sub7[] local67 = new Class1_Sub2_Sub3_Sub7[] { local35, local43, local52 };
				local35 = new Class1_Sub2_Sub3_Sub7(local67, 3);
			}
		}
		if (!arg0 && this.anInt2145 != 0) {
			local35.method1896(0, this.anInt2145, 0);
		}
		if (arg0 && this.anInt2165 != 0) {
			local35.method1896(0, this.anInt2165, 0);
		}
		if (this.aShortArray9 != null) {
			for (@Pc(125) int local125 = 0; local125 < this.aShortArray9.length; local125++) {
				local35.method1888(this.aShortArray9[local125], this.aShortArray10[local125]);
			}
		}
		return local35;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IILclient!dc;)V")
	private void method1585(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		if (arg0 == 1) {
			this.anInt2128 = arg1.method651();
		} else if (arg0 == 2) {
			this.aClass25_1018 = arg1.method654();
		} else if (arg0 == 4) {
			this.anInt2136 = arg1.method651();
		} else if (arg0 == 5) {
			this.anInt2151 = arg1.method651();
		} else if (arg0 == 6) {
			this.anInt2113 = arg1.method651();
		} else if (arg0 == 7) {
			this.anInt2150 = arg1.method651();
			if (this.anInt2150 > 32767) {
				this.anInt2150 -= 65536;
			}
		} else if (arg0 == 8) {
			this.anInt2126 = arg1.method651();
			if (this.anInt2126 > 32767) {
				this.anInt2126 -= 65536;
			}
		} else if (arg0 == 11) {
			this.anInt2152 = 1;
		} else if (arg0 == 12) {
			this.anInt2149 = arg1.method663();
		} else if (arg0 == 16) {
			this.aBoolean104 = true;
		} else if (arg0 == 23) {
			this.anInt2153 = arg1.method651();
			this.anInt2145 = arg1.method672();
		} else if (arg0 == 24) {
			this.anInt2121 = arg1.method651();
		} else if (arg0 == 25) {
			this.anInt2139 = arg1.method651();
			this.anInt2165 = arg1.method672();
		} else if (arg0 == 26) {
			this.anInt2122 = arg1.method651();
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass25Array18[arg0 - 30] = arg1.method654();
			if (this.aClass25Array18[arg0 - 30].method786(Static78.aClass25_818)) {
				this.aClass25Array18[arg0 - 30] = null;
			}
		} else if (arg0 >= 35 && arg0 < 40) {
			this.aClass25Array19[arg0 - 35] = arg1.method654();
		} else if (arg0 == 40) {
			@Pc(383) int local383 = arg1.method672();
			this.aShortArray9 = new short[local383];
			this.aShortArray10 = new short[local383];
			for (@Pc(393) int local393 = 0; local393 < local383; local393++) {
				this.aShortArray9[local393] = (short) arg1.method651();
				this.aShortArray10[local393] = (short) arg1.method651();
			}
		} else if (arg0 == 78) {
			this.anInt2130 = arg1.method651();
		} else if (arg0 == 79) {
			this.anInt2120 = arg1.method651();
		} else if (arg0 == 90) {
			this.anInt2129 = arg1.method651();
		} else if (arg0 == 91) {
			this.anInt2134 = arg1.method651();
		} else if (arg0 == 92) {
			this.anInt2124 = arg1.method651();
		} else if (arg0 == 93) {
			this.anInt2154 = arg1.method651();
		} else if (arg0 == 95) {
			this.anInt2161 = arg1.method651();
		} else if (arg0 == 97) {
			this.anInt2144 = arg1.method651();
		} else if (arg0 == 98) {
			this.anInt2147 = arg1.method651();
		} else if (arg0 >= 100 && arg0 < 110) {
			if (this.anIntArray380 == null) {
				this.anIntArray380 = new int[10];
				this.anIntArray379 = new int[10];
			}
			this.anIntArray380[arg0 - 100] = arg1.method651();
			this.anIntArray379[arg0 - 100] = arg1.method651();
		} else if (arg0 == 110) {
			this.anInt2140 = arg1.method651();
		} else if (arg0 == 111) {
			this.anInt2127 = arg1.method651();
		} else if (arg0 == 112) {
			this.anInt2123 = arg1.method651();
		} else if (arg0 == 113) {
			this.anInt2158 = arg1.method643();
		} else if (arg0 == 114) {
			this.anInt2116 = arg1.method643() * 5;
		} else if (arg0 == 115) {
			this.anInt2132 = arg1.method672();
		}
	}

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)V")
	public void method1586() {
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BI)Lclient!ub;")
	public Class1_Sub2_Sub3_Sub7 method1587(@OriginalArg(1) int arg0) {
		if (this.anIntArray380 != null && arg0 > 1) {
			@Pc(13) int local13 = -1;
			for (@Pc(15) int local15 = 0; local15 < 10; local15++) {
				if (this.anIntArray379[local15] <= arg0 && this.anIntArray379[local15] != 0) {
					local13 = this.anIntArray380[local15];
				}
			}
			if (local13 != -1) {
				return Static33.method736(local13).method1587(1);
			}
		}
		@Pc(63) Class1_Sub2_Sub3_Sub7 local63 = Static117.method1886(Static34.aClass56_31, this.anInt2128);
		if (local63 == null) {
			return null;
		}
		if (this.anInt2140 != 128 || this.anInt2127 != 128 || this.anInt2123 != 128) {
			local63.method1897(this.anInt2140, this.anInt2127, this.anInt2123);
		}
		if (this.aShortArray9 != null) {
			for (@Pc(104) int local104 = 0; local104 < this.aShortArray9.length; local104++) {
				local63.method1888(this.aShortArray9[local104], this.aShortArray10[local104]);
			}
		}
		return local63;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZI)Lclient!pe;")
	public Class1_Sub2_Sub16 method1589(@OriginalArg(1) int arg0) {
		if (this.anIntArray380 != null && arg0 > 1) {
			@Pc(13) int local13 = -1;
			for (@Pc(15) int local15 = 0; local15 < 10; local15++) {
				if (this.anIntArray379[local15] <= arg0 && this.anIntArray379[local15] != 0) {
					local13 = this.anIntArray380[local15];
				}
			}
			if (local13 != -1) {
				return Static33.method736(local13);
			}
		}
		return this;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BLclient!dc;)V")
	public void method1592(@OriginalArg(1) Class1_Sub5 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method672();
			if (local5 == 0) {
				return;
			}
			this.method1585(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(II)Lclient!da;")
	public Class1_Sub2_Sub3_Sub2 method1594(@OriginalArg(0) int arg0) {
		if (this.anIntArray380 != null && arg0 > 1) {
			@Pc(15) int local15 = -1;
			for (@Pc(17) int local17 = 0; local17 < 10; local17++) {
				if (arg0 >= this.anIntArray379[local17] && this.anIntArray379[local17] != 0) {
					local15 = this.anIntArray380[local17];
				}
			}
			if (local15 != -1) {
				return Static33.method736(local15).method1594(1);
			}
		}
		@Pc(62) Class1_Sub2_Sub3_Sub2 local62 = (Class1_Sub2_Sub3_Sub2) Static58.aClass63_8.method1517((long) this.anInt2155);
		if (local62 != null) {
			return local62;
		}
		@Pc(72) Class1_Sub2_Sub3_Sub7 local72 = Static117.method1886(Static34.aClass56_31, this.anInt2128);
		if (local72 == null) {
			return null;
		}
		if (this.anInt2140 != 128 || this.anInt2127 != 128 || this.anInt2123 != 128) {
			local72.method1897(this.anInt2140, this.anInt2127, this.anInt2123);
		}
		if (this.aShortArray9 != null) {
			for (@Pc(107) int local107 = 0; local107 < this.aShortArray9.length; local107++) {
				local72.method1888(this.aShortArray9[local107], this.aShortArray10[local107]);
			}
		}
		local62 = local72.method1893(this.anInt2158 + 64, this.anInt2116 + 768, -50, -10, -50);
		local62.aBoolean19 = true;
		Static58.aClass63_8.method1520(local62, (long) this.anInt2155);
		return local62;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZZ)Lclient!ub;")
	public Class1_Sub2_Sub3_Sub7 method1595(@OriginalArg(1) boolean arg0) {
		@Pc(8) int local8 = this.anInt2129;
		@Pc(11) int local11 = this.anInt2124;
		if (arg0) {
			local11 = this.anInt2154;
			local8 = this.anInt2134;
		}
		if (local8 == -1) {
			return null;
		}
		@Pc(30) Class1_Sub2_Sub3_Sub7 local30 = Static117.method1886(Static34.aClass56_31, local8);
		if (local11 != -1) {
			@Pc(39) Class1_Sub2_Sub3_Sub7 local39 = Static117.method1886(Static34.aClass56_31, local11);
			@Pc(50) Class1_Sub2_Sub3_Sub7[] local50 = new Class1_Sub2_Sub3_Sub7[] { local30, local39 };
			local30 = new Class1_Sub2_Sub3_Sub7(local50, 2);
		}
		if (this.aShortArray9 != null) {
			for (@Pc(61) int local61 = 0; local61 < this.aShortArray9.length; local61++) {
				local30.method1888(this.aShortArray9[local61], this.aShortArray10[local61]);
			}
		}
		return local30;
	}
}
