import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class4_Sub4_Sub13 extends Class4_Sub4 {

	@OriginalMember(owner = "client!pe", name = "T", descriptor = "[I")
	public int[] anIntArray209;

	@OriginalMember(owner = "client!pe", name = "lb", descriptor = "[S")
	private short[] aShortArray11;

	@OriginalMember(owner = "client!pe", name = "yb", descriptor = "[S")
	private short[] aShortArray12;

	@OriginalMember(owner = "client!pe", name = "Bb", descriptor = "I")
	public int anInt2128;

	@OriginalMember(owner = "client!pe", name = "Hb", descriptor = "I")
	private int anInt2133;

	@OriginalMember(owner = "client!pe", name = "Vb", descriptor = "[I")
	public int[] anIntArray210;

	@OriginalMember(owner = "client!pe", name = "J", descriptor = "I")
	private int anInt2095 = -1;

	@OriginalMember(owner = "client!pe", name = "I", descriptor = "I")
	private int anInt2094 = -1;

	@OriginalMember(owner = "client!pe", name = "W", descriptor = "I")
	private int anInt2107 = -1;

	@OriginalMember(owner = "client!pe", name = "X", descriptor = "I")
	private int anInt2108 = -1;

	@OriginalMember(owner = "client!pe", name = "L", descriptor = "I")
	private int anInt2097 = 128;

	@OriginalMember(owner = "client!pe", name = "O", descriptor = "I")
	public int anInt2100 = 1;

	@OriginalMember(owner = "client!pe", name = "cb", descriptor = "I")
	private int anInt2111 = -1;

	@OriginalMember(owner = "client!pe", name = "K", descriptor = "I")
	public int anInt2096 = 0;

	@OriginalMember(owner = "client!pe", name = "gb", descriptor = "I")
	private int anInt2115 = 0;

	@OriginalMember(owner = "client!pe", name = "Z", descriptor = "[Lclient!qc;")
	public Class60[] aClass60Array17 = new Class60[] { null, null, null, null, Static75.aClass60_733 };

	@OriginalMember(owner = "client!pe", name = "kb", descriptor = "I")
	public int anInt2117 = 2000;

	@OriginalMember(owner = "client!pe", name = "db", descriptor = "I")
	public int anInt2112 = -1;

	@OriginalMember(owner = "client!pe", name = "mb", descriptor = "I")
	private int anInt2118 = -1;

	@OriginalMember(owner = "client!pe", name = "fb", descriptor = "I")
	public int anInt2114 = 0;

	@OriginalMember(owner = "client!pe", name = "U", descriptor = "I")
	public int anInt2105 = 0;

	@OriginalMember(owner = "client!pe", name = "S", descriptor = "I")
	private int anInt2104 = -1;

	@OriginalMember(owner = "client!pe", name = "ub", descriptor = "I")
	public int anInt2124 = 0;

	@OriginalMember(owner = "client!pe", name = "zb", descriptor = "I")
	private int anInt2126 = -1;

	@OriginalMember(owner = "client!pe", name = "Cb", descriptor = "I")
	private int anInt2129 = 128;

	@OriginalMember(owner = "client!pe", name = "Fb", descriptor = "I")
	private int anInt2131 = -1;

	@OriginalMember(owner = "client!pe", name = "Lb", descriptor = "I")
	private int anInt2135 = 0;

	@OriginalMember(owner = "client!pe", name = "tb", descriptor = "I")
	public int anInt2123 = 0;

	@OriginalMember(owner = "client!pe", name = "Y", descriptor = "I")
	public int anInt2109 = -1;

	@OriginalMember(owner = "client!pe", name = "Nb", descriptor = "I")
	public int anInt2136 = 0;

	@OriginalMember(owner = "client!pe", name = "Pb", descriptor = "I")
	private int anInt2137 = 128;

	@OriginalMember(owner = "client!pe", name = "Jb", descriptor = "[Lclient!qc;")
	public Class60[] aClass60Array18 = new Class60[] { null, null, Static59.aClass60_549, null, null };

	@OriginalMember(owner = "client!pe", name = "P", descriptor = "I")
	public int anInt2101 = 0;

	@OriginalMember(owner = "client!pe", name = "Eb", descriptor = "I")
	public int anInt2130 = 0;

	@OriginalMember(owner = "client!pe", name = "Kb", descriptor = "I")
	private int anInt2134 = -1;

	@OriginalMember(owner = "client!pe", name = "qb", descriptor = "Z")
	public boolean aBoolean87 = false;

	@OriginalMember(owner = "client!pe", name = "wb", descriptor = "Lclient!qc;")
	public Class60 aClass60_870 = Static117.aClass60_1118;

	@OriginalMember(owner = "client!pe", name = "Gb", descriptor = "I")
	public int anInt2132 = 0;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZZ)Z")
	public boolean method1540(@OriginalArg(0) boolean arg0) {
		@Pc(6) int local6 = this.anInt2131;
		@Pc(9) int local9 = this.anInt2095;
		@Pc(12) int local12 = this.anInt2108;
		if (arg0) {
			local9 = this.anInt2111;
			local12 = this.anInt2118;
			local6 = this.anInt2126;
		}
		if (local6 == -1) {
			return true;
		}
		@Pc(30) boolean local30 = true;
		if (!Static94.aClass40_67.method1120(local6, 0)) {
			local30 = false;
		}
		if (local9 != -1 && !Static94.aClass40_67.method1120(local9, 0)) {
			local30 = false;
		}
		if (local12 != -1 && !Static94.aClass40_67.method1120(local12, 0)) {
			local30 = false;
		}
		return local30;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILclient!re;I)V")
	private void method1542(@OriginalArg(1) Class4_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2133 = arg0.method1244();
		} else if (arg1 == 2) {
			this.aClass60_870 = arg0.method1249();
		} else if (arg1 == 4) {
			this.anInt2117 = arg0.method1244();
		} else if (arg1 == 5) {
			this.anInt2101 = arg0.method1244();
		} else if (arg1 == 6) {
			this.anInt2136 = arg0.method1244();
		} else if (arg1 == 7) {
			this.anInt2114 = arg0.method1244();
			if (this.anInt2114 > 32767) {
				this.anInt2114 -= 65536;
			}
		} else if (arg1 == 8) {
			this.anInt2132 = arg0.method1244();
			if (this.anInt2132 > 32767) {
				this.anInt2132 -= 65536;
			}
		} else if (arg1 == 11) {
			this.anInt2130 = 1;
		} else if (arg1 == 12) {
			this.anInt2100 = arg0.method1215();
		} else if (arg1 == 16) {
			this.aBoolean87 = true;
		} else if (arg1 == 23) {
			this.anInt2131 = arg0.method1244();
			this.anInt2135 = arg0.method1223();
		} else if (arg1 == 24) {
			this.anInt2095 = arg0.method1244();
		} else if (arg1 == 25) {
			this.anInt2126 = arg0.method1244();
			this.anInt2115 = arg0.method1223();
		} else if (arg1 == 26) {
			this.anInt2111 = arg0.method1244();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass60Array18[arg1 - 30] = arg0.method1249();
			if (this.aClass60Array18[arg1 - 30].method1661(Static95.aClass60_924)) {
				this.aClass60Array18[arg1 - 30] = null;
			}
		} else if (arg1 >= 35 && arg1 < 40) {
			this.aClass60Array17[arg1 - 35] = arg0.method1249();
		} else if (arg1 == 40) {
			@Pc(380) int local380 = arg0.method1223();
			this.aShortArray12 = new short[local380];
			this.aShortArray11 = new short[local380];
			for (@Pc(390) int local390 = 0; local390 < local380; local390++) {
				this.aShortArray12[local390] = (short) arg0.method1244();
				this.aShortArray11[local390] = (short) arg0.method1244();
			}
		} else if (arg1 == 78) {
			this.anInt2108 = arg0.method1244();
		} else if (arg1 == 79) {
			this.anInt2118 = arg0.method1244();
		} else if (arg1 == 90) {
			this.anInt2094 = arg0.method1244();
		} else if (arg1 == 91) {
			this.anInt2104 = arg0.method1244();
		} else if (arg1 == 92) {
			this.anInt2134 = arg0.method1244();
		} else if (arg1 == 93) {
			this.anInt2107 = arg0.method1244();
		} else if (arg1 == 95) {
			this.anInt2105 = arg0.method1244();
		} else if (arg1 == 97) {
			this.anInt2109 = arg0.method1244();
		} else if (arg1 == 98) {
			this.anInt2112 = arg0.method1244();
		} else if (arg1 >= 100 && arg1 < 110) {
			if (this.anIntArray209 == null) {
				this.anIntArray210 = new int[10];
				this.anIntArray209 = new int[10];
			}
			this.anIntArray209[arg1 - 100] = arg0.method1244();
			this.anIntArray210[arg1 - 100] = arg0.method1244();
		} else if (arg1 == 110) {
			this.anInt2129 = arg0.method1244();
		} else if (arg1 == 111) {
			this.anInt2137 = arg0.method1244();
		} else if (arg1 == 112) {
			this.anInt2097 = arg0.method1244();
		} else if (arg1 == 113) {
			this.anInt2124 = arg0.method1224();
		} else if (arg1 == 114) {
			this.anInt2123 = arg0.method1224() * 5;
		} else if (arg1 == 115) {
			this.anInt2096 = arg0.method1223();
		}
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(II)Lclient!pe;")
	public Class4_Sub4_Sub13 method1543(@OriginalArg(0) int arg0) {
		if (this.anIntArray209 != null && arg0 > 1) {
			@Pc(15) int local15 = -1;
			for (@Pc(17) int local17 = 0; local17 < 10; local17++) {
				if (this.anIntArray210[local17] <= arg0 && this.anIntArray210[local17] != 0) {
					local15 = this.anIntArray209[local17];
				}
			}
			if (local15 != -1) {
				return Static24.method475(local15);
			}
		}
		return this;
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(II)Lclient!rb;")
	public Class4_Sub4_Sub1_Sub6 method1545(@OriginalArg(0) int arg0) {
		if (this.anIntArray209 != null && arg0 > 1) {
			@Pc(19) int local19 = -1;
			for (@Pc(21) int local21 = 0; local21 < 10; local21++) {
				if (this.anIntArray210[local21] <= arg0 && this.anIntArray210[local21] != 0) {
					local19 = this.anIntArray209[local21];
				}
			}
			if (local19 != -1) {
				return Static24.method475(local19).method1545(1);
			}
		}
		@Pc(70) Class4_Sub4_Sub1_Sub6 local70 = (Class4_Sub4_Sub1_Sub6) Static92.aClass48_51.method1390((long) this.anInt2128);
		if (local70 != null) {
			return local70;
		}
		@Pc(80) Class4_Sub4_Sub1_Sub7 local80 = Static118.method2001(Static94.aClass40_67, this.anInt2133);
		if (local80 == null) {
			return null;
		}
		if (this.anInt2129 != 128 || this.anInt2137 != 128 || this.anInt2097 != 128) {
			local80.method1990(this.anInt2129, this.anInt2137, this.anInt2097);
		}
		if (this.aShortArray12 != null) {
			for (@Pc(115) int local115 = 0; local115 < this.aShortArray12.length; local115++) {
				local80.method1998(this.aShortArray12[local115], this.aShortArray11[local115]);
			}
		}
		local70 = local80.method2003(this.anInt2124 + 64, 768 - -this.anInt2123, -50, -10, -50);
		local70.aBoolean110 = true;
		Static92.aClass48_51.method1392(local70, (long) this.anInt2128);
		return local70;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZB)Lclient!u;")
	public Class4_Sub4_Sub1_Sub7 method1546(@OriginalArg(0) boolean arg0) {
		@Pc(12) int local12 = this.anInt2134;
		@Pc(15) int local15 = this.anInt2094;
		if (arg0) {
			local12 = this.anInt2107;
			local15 = this.anInt2104;
		}
		if (local15 == -1) {
			return null;
		}
		@Pc(37) Class4_Sub4_Sub1_Sub7 local37 = Static118.method2001(Static94.aClass40_67, local15);
		if (local12 != -1) {
			@Pc(45) Class4_Sub4_Sub1_Sub7 local45 = Static118.method2001(Static94.aClass40_67, local12);
			@Pc(56) Class4_Sub4_Sub1_Sub7[] local56 = new Class4_Sub4_Sub1_Sub7[] { local37, local45 };
			local37 = new Class4_Sub4_Sub1_Sub7(local56, 2);
		}
		if (this.aShortArray12 != null) {
			for (@Pc(67) int local67 = 0; local67 < this.aShortArray12.length; local67++) {
				local37.method1998(this.aShortArray12[local67], this.aShortArray11[local67]);
			}
		}
		return local37;
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(ZB)Z")
	public boolean method1548(@OriginalArg(0) boolean arg0) {
		@Pc(6) int local6 = this.anInt2094;
		@Pc(9) int local9 = this.anInt2134;
		if (arg0) {
			local9 = this.anInt2107;
			local6 = this.anInt2104;
		}
		if (local6 == -1) {
			return true;
		}
		@Pc(24) boolean local24 = true;
		if (!Static94.aClass40_67.method1120(local6, 0)) {
			local24 = false;
		}
		if (local9 != -1 && !Static94.aClass40_67.method1120(local9, 0)) {
			local24 = false;
		}
		return local24;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!pe;Lclient!pe;B)V")
	public void method1549(@OriginalArg(0) Class4_Sub4_Sub13 arg0, @OriginalArg(1) Class4_Sub4_Sub13 arg1) {
		this.aShortArray12 = arg1.aShortArray12;
		this.anInt2114 = arg1.anInt2114;
		this.anInt2105 = arg1.anInt2105;
		this.anInt2101 = arg1.anInt2101;
		this.anInt2136 = arg1.anInt2136;
		this.aBoolean87 = arg0.aBoolean87;
		this.aClass60_870 = arg0.aClass60_870;
		this.anInt2132 = arg1.anInt2132;
		this.aShortArray11 = arg1.aShortArray11;
		this.anInt2130 = 1;
		this.anInt2100 = arg0.anInt2100;
		this.anInt2117 = arg1.anInt2117;
		this.anInt2133 = arg1.anInt2133;
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(ZB)Lclient!u;")
	public Class4_Sub4_Sub1_Sub7 method1550(@OriginalArg(0) boolean arg0) {
		@Pc(4) int local4 = this.anInt2131;
		@Pc(7) int local7 = this.anInt2095;
		@Pc(15) int local15 = this.anInt2108;
		if (arg0) {
			local7 = this.anInt2111;
			local4 = this.anInt2126;
			local15 = this.anInt2118;
		}
		if (local4 == -1) {
			return null;
		}
		@Pc(40) Class4_Sub4_Sub1_Sub7 local40 = Static118.method2001(Static94.aClass40_67, local4);
		if (local7 != -1) {
			@Pc(49) Class4_Sub4_Sub1_Sub7 local49 = Static118.method2001(Static94.aClass40_67, local7);
			if (local15 == -1) {
				@Pc(64) Class4_Sub4_Sub1_Sub7[] local64 = new Class4_Sub4_Sub1_Sub7[] { local40, local49 };
				local40 = new Class4_Sub4_Sub1_Sub7(local64, 2);
			} else {
				@Pc(77) Class4_Sub4_Sub1_Sub7 local77 = Static118.method2001(Static94.aClass40_67, local15);
				@Pc(92) Class4_Sub4_Sub1_Sub7[] local92 = new Class4_Sub4_Sub1_Sub7[] { local40, local49, local77 };
				local40 = new Class4_Sub4_Sub1_Sub7(local92, 3);
			}
		}
		if (!arg0 && this.anInt2135 != 0) {
			local40.method2000(0, this.anInt2135, 0);
		}
		if (arg0 && this.anInt2115 != 0) {
			local40.method2000(0, this.anInt2115, 0);
		}
		if (this.aShortArray12 != null) {
			for (@Pc(128) int local128 = 0; local128 < this.aShortArray12.length; local128++) {
				local40.method1998(this.aShortArray12[local128], this.aShortArray11[local128]);
			}
		}
		return local40;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILclient!re;)V")
	public void method1551(@OriginalArg(1) Class4_Sub13 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1223();
			if (local9 == 0) {
				return;
			}
			this.method1542(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "(B)V")
	public void method1552() {
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZI)Lclient!u;")
	public Class4_Sub4_Sub1_Sub7 method1553(@OriginalArg(1) int arg0) {
		@Pc(25) int local25;
		if (this.anIntArray209 != null && arg0 > 1) {
			@Pc(23) int local23 = -1;
			for (local25 = 0; local25 < 10; local25++) {
				if (arg0 >= this.anIntArray210[local25] && this.anIntArray210[local25] != 0) {
					local23 = this.anIntArray209[local25];
				}
			}
			if (local23 != -1) {
				return Static24.method475(local23).method1553(1);
			}
		}
		@Pc(68) Class4_Sub4_Sub1_Sub7 local68 = Static118.method2001(Static94.aClass40_67, this.anInt2133);
		if (local68 == null) {
			return null;
		}
		if (this.anInt2129 != 128 || this.anInt2137 != 128 || this.anInt2097 != 128) {
			local68.method1990(this.anInt2129, this.anInt2137, this.anInt2097);
		}
		if (this.aShortArray12 != null) {
			for (local25 = 0; local25 < this.aShortArray12.length; local25++) {
				local68.method1998(this.aShortArray12[local25], this.aShortArray11[local25]);
			}
		}
		return local68;
	}
}
