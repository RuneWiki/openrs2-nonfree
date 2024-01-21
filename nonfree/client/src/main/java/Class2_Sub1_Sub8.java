import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class2_Sub1_Sub8 extends Class2_Sub1 {

	@OriginalMember(owner = "client!la", name = "ab", descriptor = "[I")
	private int[] anIntArray236;

	@OriginalMember(owner = "client!la", name = "fb", descriptor = "I")
	private int anInt1801;

	@OriginalMember(owner = "client!la", name = "hb", descriptor = "[I")
	private int[] anIntArray237;

	@OriginalMember(owner = "client!la", name = "Nb", descriptor = "I")
	public int anInt1822;

	@OriginalMember(owner = "client!la", name = "ac", descriptor = "[I")
	public int[] anIntArray242;

	@OriginalMember(owner = "client!la", name = "gc", descriptor = "[I")
	public int[] anIntArray243;

	@OriginalMember(owner = "client!la", name = "vb", descriptor = "I")
	private int anInt1811 = 0;

	@OriginalMember(owner = "client!la", name = "Ab", descriptor = "I")
	private int anInt1814 = 128;

	@OriginalMember(owner = "client!la", name = "bb", descriptor = "I")
	private int anInt1798 = 128;

	@OriginalMember(owner = "client!la", name = "nb", descriptor = "[Lclient!wb;")
	public Class65[] aClass65Array6 = new Class65[] { null, null, Static98.aClass65_1230, null, null };

	@OriginalMember(owner = "client!la", name = "Gb", descriptor = "I")
	private int anInt1818 = -1;

	@OriginalMember(owner = "client!la", name = "wb", descriptor = "I")
	public int anInt1812 = 0;

	@OriginalMember(owner = "client!la", name = "cb", descriptor = "I")
	private int anInt1799 = -1;

	@OriginalMember(owner = "client!la", name = "Tb", descriptor = "I")
	private int anInt1825 = -1;

	@OriginalMember(owner = "client!la", name = "kb", descriptor = "Lclient!wb;")
	public Class65 aClass65_820 = Static68.aClass65_946;

	@OriginalMember(owner = "client!la", name = "mb", descriptor = "I")
	private int anInt1806 = -1;

	@OriginalMember(owner = "client!la", name = "ib", descriptor = "I")
	public int anInt1803 = 0;

	@OriginalMember(owner = "client!la", name = "Lb", descriptor = "I")
	public int anInt1821 = 0;

	@OriginalMember(owner = "client!la", name = "gb", descriptor = "I")
	private int anInt1802 = -1;

	@OriginalMember(owner = "client!la", name = "Db", descriptor = "I")
	private int anInt1816 = -1;

	@OriginalMember(owner = "client!la", name = "ub", descriptor = "I")
	public int anInt1810 = 0;

	@OriginalMember(owner = "client!la", name = "cc", descriptor = "I")
	private int anInt1832 = -1;

	@OriginalMember(owner = "client!la", name = "sb", descriptor = "I")
	public int anInt1809 = -1;

	@OriginalMember(owner = "client!la", name = "Ob", descriptor = "Z")
	public boolean aBoolean97 = false;

	@OriginalMember(owner = "client!la", name = "rb", descriptor = "I")
	public int anInt1808 = 2000;

	@OriginalMember(owner = "client!la", name = "Rb", descriptor = "I")
	public int anInt1824 = 0;

	@OriginalMember(owner = "client!la", name = "qb", descriptor = "[Lclient!wb;")
	public Class65[] aClass65Array8 = new Class65[] { null, null, null, null, Static90.aClass65_626 };

	@OriginalMember(owner = "client!la", name = "Cb", descriptor = "I")
	public int anInt1815 = 0;

	@OriginalMember(owner = "client!la", name = "Kb", descriptor = "I")
	public int anInt1820 = 0;

	@OriginalMember(owner = "client!la", name = "bc", descriptor = "I")
	public int anInt1831 = 1;

	@OriginalMember(owner = "client!la", name = "Yb", descriptor = "I")
	private int anInt1829 = 0;

	@OriginalMember(owner = "client!la", name = "Pb", descriptor = "I")
	public int anInt1823 = 0;

	@OriginalMember(owner = "client!la", name = "hc", descriptor = "I")
	private int anInt1836 = -1;

	@OriginalMember(owner = "client!la", name = "nc", descriptor = "I")
	public int anInt1838 = -1;

	@OriginalMember(owner = "client!la", name = "Hb", descriptor = "I")
	private int anInt1819 = -1;

	@OriginalMember(owner = "client!la", name = "oc", descriptor = "I")
	public int anInt1839 = 0;

	@OriginalMember(owner = "client!la", name = "ec", descriptor = "I")
	private int anInt1834 = -1;

	@OriginalMember(owner = "client!la", name = "dc", descriptor = "I")
	private int anInt1833 = 128;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ZILclient!fe;)V")
	private void method1067(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt1801 = arg1.method1396();
		} else if (arg0 == 2) {
			this.aClass65_820 = arg1.method1400();
		} else if (arg0 == 4) {
			this.anInt1808 = arg1.method1396();
		} else if (arg0 == 5) {
			this.anInt1823 = arg1.method1396();
		} else if (arg0 == 6) {
			this.anInt1815 = arg1.method1396();
		} else if (arg0 == 7) {
			this.anInt1821 = arg1.method1396();
			if (this.anInt1821 > 32767) {
				this.anInt1821 -= 65536;
				return;
			}
		} else if (arg0 == 8) {
			this.anInt1839 = arg1.method1396();
			if (this.anInt1839 > 32767) {
				this.anInt1839 -= 65536;
				return;
			}
		} else if (arg0 == 10) {
			arg1.method1396();
			return;
		} else if (arg0 == 11) {
			this.anInt1820 = 1;
		} else if (arg0 == 12) {
			this.anInt1831 = arg1.method1406();
			return;
		} else if (arg0 == 16) {
			this.aBoolean97 = true;
			return;
		} else if (arg0 == 23) {
			this.anInt1836 = arg1.method1396();
			this.anInt1829 = arg1.method1410();
			return;
		} else {
			if (arg0 == 24) {
				this.anInt1832 = arg1.method1396();
			} else if (arg0 == 25) {
				this.anInt1799 = arg1.method1396();
				this.anInt1811 = arg1.method1410();
				return;
			} else if (arg0 == 26) {
				this.anInt1834 = arg1.method1396();
				return;
			} else if (arg0 >= 30 && arg0 < 35) {
				this.aClass65Array6[arg0 - 30] = arg1.method1400();
				if (this.aClass65Array6[arg0 - 30].method1788(Static102.aClass65_1261)) {
					this.aClass65Array6[arg0 - 30] = null;
					return;
				}
			} else if (arg0 < 35 || arg0 >= 40) {
				if (arg0 != 40) {
					if (arg0 == 78) {
						this.anInt1818 = arg1.method1396();
						return;
					}
					if (arg0 != 79) {
						if (arg0 == 90) {
							this.anInt1802 = arg1.method1396();
							return;
						}
						if (arg0 != 91) {
							if (arg0 != 92) {
								if (arg0 != 93) {
									if (arg0 == 95) {
										this.anInt1812 = arg1.method1396();
										return;
									}
									if (arg0 == 97) {
										this.anInt1838 = arg1.method1396();
										return;
									}
									if (arg0 != 98) {
										if (arg0 >= 100 && arg0 < 110) {
											if (this.anIntArray243 == null) {
												this.anIntArray243 = new int[10];
												this.anIntArray242 = new int[10];
											}
											this.anIntArray243[arg0 - 100] = arg1.method1396();
											this.anIntArray242[arg0 - 100] = arg1.method1396();
											return;
										}
										if (arg0 != 110) {
											if (arg0 == 111) {
												this.anInt1814 = arg1.method1396();
												return;
											}
											if (arg0 == 112) {
												this.anInt1833 = arg1.method1396();
											} else if (arg0 == 113) {
												this.anInt1810 = arg1.method1380();
												return;
											} else if (arg0 == 114) {
												this.anInt1803 = arg1.method1380() * 5;
												return;
											} else if (arg0 == 115) {
												this.anInt1824 = arg1.method1410();
												return;
											}
											return;
										}
										this.anInt1798 = arg1.method1396();
										return;
									}
									this.anInt1809 = arg1.method1396();
									return;
								}
								this.anInt1816 = arg1.method1396();
								return;
							}
							this.anInt1806 = arg1.method1396();
							return;
						}
						this.anInt1825 = arg1.method1396();
						return;
					}
					this.anInt1819 = arg1.method1396();
					return;
				}
				@Pc(178) int local178 = arg1.method1410();
				this.anIntArray236 = new int[local178];
				this.anIntArray237 = new int[local178];
				for (@Pc(188) int local188 = 0; local188 < local178; local188++) {
					this.anIntArray237[local188] = arg1.method1396();
					this.anIntArray236[local188] = arg1.method1396();
				}
				return;
			} else {
				this.aClass65Array8[arg0 - 35] = arg1.method1400();
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ZI)Z")
	public boolean method1068(@OriginalArg(0) boolean arg0) {
		@Pc(2) int local2 = this.anInt1806;
		@Pc(9) int local9 = this.anInt1802;
		if (arg0) {
			local9 = this.anInt1825;
			local2 = this.anInt1816;
		}
		if (local9 == -1) {
			return true;
		}
		@Pc(25) boolean local25 = true;
		if (!Static52.aClass33_27.method1140(0, local9)) {
			local25 = false;
		}
		if (local2 != -1 && !Static52.aClass33_27.method1140(0, local2)) {
			local25 = false;
		}
		return local25;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!fe;Z)V")
	public void method1071(@OriginalArg(0) Class2_Sub8 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method1410();
			if (local13 == 0) {
				return;
			}
			this.method1067(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ZII)Lclient!r;")
	public Class2_Sub1_Sub1_Sub6 method1073(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17;
		if (this.anIntArray243 != null && arg1 > 1) {
			@Pc(15) int local15 = -1;
			for (local17 = 0; local17 < 10; local17++) {
				if (arg1 >= this.anIntArray242[local17] && this.anIntArray242[local17] != 0) {
					local15 = this.anIntArray243[local17];
				}
			}
			if (local15 != -1) {
				return Static70.method1263(local15).method1073(arg0, 1);
			}
		}
		@Pc(63) Class2_Sub1_Sub1_Sub6 local63;
		if (arg0) {
			local63 = (Class2_Sub1_Sub1_Sub6) Static46.aClass21_16.method744((long) this.anInt1822);
			if (local63 != null) {
				return local63;
			}
		}
		local63 = Static86.method1543(Static52.aClass33_27, this.anInt1801);
		if (local63 == null) {
			return null;
		}
		if (this.anInt1798 != 128 || this.anInt1814 != 128 || this.anInt1833 != 128) {
			local63.method1517(this.anInt1798, this.anInt1814, this.anInt1833);
		}
		if (this.anIntArray237 != null) {
			for (local17 = 0; local17 < this.anIntArray237.length; local17++) {
				local63.method1515(this.anIntArray237[local17], this.anIntArray236[local17]);
			}
		}
		if (arg0) {
			local63.method1535(this.anInt1810 + 64, this.anInt1803 + 768, -50, -10, -50, true);
			local63.aBoolean127 = true;
			Static46.aClass21_16.method745((long) this.anInt1822, local63);
		}
		return local63;
	}

	@OriginalMember(owner = "client!la", name = "d", descriptor = "(B)V")
	public void method1074() {
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILclient!la;Lclient!la;)V")
	public void method1075(@OriginalArg(1) Class2_Sub1_Sub8 arg0, @OriginalArg(2) Class2_Sub1_Sub8 arg1) {
		this.anInt1823 = arg0.anInt1823;
		this.anInt1801 = arg0.anInt1801;
		this.anInt1815 = arg0.anInt1815;
		this.anInt1808 = arg0.anInt1808;
		this.aClass65_820 = arg1.aClass65_820;
		this.anInt1812 = arg0.anInt1812;
		this.anInt1839 = arg0.anInt1839;
		this.anInt1821 = arg0.anInt1821;
		this.anIntArray236 = arg0.anIntArray236;
		this.anInt1820 = 1;
		this.anIntArray237 = arg0.anIntArray237;
		this.aBoolean97 = arg1.aBoolean97;
		this.anInt1831 = arg1.anInt1831;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ZZ)Z")
	public boolean method1076(@OriginalArg(1) boolean arg0) {
		@Pc(6) int local6 = this.anInt1836;
		@Pc(14) int local14 = this.anInt1832;
		@Pc(17) int local17 = this.anInt1818;
		if (arg0) {
			local6 = this.anInt1799;
			local14 = this.anInt1834;
			local17 = this.anInt1819;
		}
		if (local6 == -1) {
			return true;
		}
		@Pc(36) boolean local36 = true;
		if (!Static52.aClass33_27.method1140(0, local6)) {
			local36 = false;
		}
		if (local14 != -1 && !Static52.aClass33_27.method1140(0, local14)) {
			local36 = false;
		}
		if (local17 != -1 && !Static52.aClass33_27.method1140(0, local17)) {
			local36 = false;
		}
		return local36;
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(ZI)Lclient!r;")
	public Class2_Sub1_Sub1_Sub6 method1077(@OriginalArg(0) boolean arg0) {
		@Pc(8) int local8 = this.anInt1836;
		@Pc(11) int local11 = this.anInt1818;
		@Pc(14) int local14 = this.anInt1832;
		if (arg0) {
			local8 = this.anInt1799;
			local11 = this.anInt1819;
			local14 = this.anInt1834;
		}
		if (local8 == -1) {
			return null;
		}
		@Pc(36) Class2_Sub1_Sub1_Sub6 local36 = Static86.method1543(Static52.aClass33_27, local8);
		if (local14 != -1) {
			@Pc(44) Class2_Sub1_Sub1_Sub6 local44 = Static86.method1543(Static52.aClass33_27, local14);
			if (local11 == -1) {
				@Pc(87) Class2_Sub1_Sub1_Sub6[] local87 = new Class2_Sub1_Sub1_Sub6[] { local36, local44 };
				local36 = new Class2_Sub1_Sub1_Sub6(local87, 2);
			} else {
				@Pc(53) Class2_Sub1_Sub1_Sub6 local53 = Static86.method1543(Static52.aClass33_27, local11);
				@Pc(68) Class2_Sub1_Sub1_Sub6[] local68 = new Class2_Sub1_Sub1_Sub6[] { local36, local44, local53 };
				local36 = new Class2_Sub1_Sub1_Sub6(local68, 3);
			}
		}
		if (!arg0 && this.anInt1829 != 0) {
			local36.method1528(0, this.anInt1829, 0);
		}
		if (arg0 && this.anInt1811 != 0) {
			local36.method1528(0, this.anInt1811, 0);
		}
		if (this.anIntArray237 != null) {
			for (@Pc(128) int local128 = 0; local128 < this.anIntArray237.length; local128++) {
				local36.method1515(this.anIntArray237[local128], this.anIntArray236[local128]);
			}
		}
		return local36;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BZ)Lclient!r;")
	public Class2_Sub1_Sub1_Sub6 method1078(@OriginalArg(1) boolean arg0) {
		@Pc(8) int local8 = this.anInt1802;
		@Pc(16) int local16 = this.anInt1806;
		if (arg0) {
			local8 = this.anInt1825;
			local16 = this.anInt1816;
		}
		if (local8 == -1) {
			return null;
		}
		@Pc(35) Class2_Sub1_Sub1_Sub6 local35 = Static86.method1543(Static52.aClass33_27, local8);
		if (local16 != -1) {
			@Pc(43) Class2_Sub1_Sub1_Sub6 local43 = Static86.method1543(Static52.aClass33_27, local16);
			@Pc(54) Class2_Sub1_Sub1_Sub6[] local54 = new Class2_Sub1_Sub1_Sub6[] { local35, local43 };
			local35 = new Class2_Sub1_Sub1_Sub6(local54, 2);
		}
		if (this.anIntArray237 != null) {
			for (@Pc(65) int local65 = 0; local65 < this.anIntArray237.length; local65++) {
				local35.method1515(this.anIntArray237[local65], this.anIntArray236[local65]);
			}
		}
		return local35;
	}
}
