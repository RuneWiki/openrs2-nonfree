import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class8_Sub1_Sub13 extends Class8_Sub1 {

	@OriginalMember(owner = "client!lc", name = "lb", descriptor = "[S")
	private short[] aShortArray28;

	@OriginalMember(owner = "client!lc", name = "mb", descriptor = "I")
	public int anInt1741;

	@OriginalMember(owner = "client!lc", name = "sb", descriptor = "I")
	private int anInt1747;

	@OriginalMember(owner = "client!lc", name = "Bb", descriptor = "[I")
	public int[] anIntArray224;

	@OriginalMember(owner = "client!lc", name = "Fb", descriptor = "[S")
	private short[] aShortArray29;

	@OriginalMember(owner = "client!lc", name = "Kb", descriptor = "[I")
	public int[] anIntArray225;

	@OriginalMember(owner = "client!lc", name = "Lb", descriptor = "[S")
	private short[] aShortArray30;

	@OriginalMember(owner = "client!lc", name = "Pb", descriptor = "[S")
	private short[] aShortArray31;

	@OriginalMember(owner = "client!lc", name = "T", descriptor = "I")
	public int anInt1726 = 1;

	@OriginalMember(owner = "client!lc", name = "cb", descriptor = "I")
	private int anInt1734 = 128;

	@OriginalMember(owner = "client!lc", name = "bb", descriptor = "I")
	public int anInt1733 = 0;

	@OriginalMember(owner = "client!lc", name = "Z", descriptor = "I")
	private int anInt1732 = 0;

	@OriginalMember(owner = "client!lc", name = "V", descriptor = "I")
	private int anInt1728 = 128;

	@OriginalMember(owner = "client!lc", name = "jb", descriptor = "I")
	public int anInt1740 = -1;

	@OriginalMember(owner = "client!lc", name = "db", descriptor = "I")
	private int anInt1735 = -1;

	@OriginalMember(owner = "client!lc", name = "ib", descriptor = "I")
	public int anInt1739 = -1;

	@OriginalMember(owner = "client!lc", name = "yb", descriptor = "I")
	private int anInt1751 = -1;

	@OriginalMember(owner = "client!lc", name = "U", descriptor = "I")
	public int anInt1727 = 2000;

	@OriginalMember(owner = "client!lc", name = "vb", descriptor = "I")
	private int anInt1749 = -1;

	@OriginalMember(owner = "client!lc", name = "Ab", descriptor = "I")
	private int anInt1753 = -1;

	@OriginalMember(owner = "client!lc", name = "xb", descriptor = "I")
	private int anInt1750 = -1;

	@OriginalMember(owner = "client!lc", name = "Jb", descriptor = "I")
	private int anInt1760 = -1;

	@OriginalMember(owner = "client!lc", name = "rb", descriptor = "I")
	private int anInt1746 = -1;

	@OriginalMember(owner = "client!lc", name = "fb", descriptor = "I")
	private int anInt1736 = 128;

	@OriginalMember(owner = "client!lc", name = "nb", descriptor = "I")
	private int anInt1742 = -1;

	@OriginalMember(owner = "client!lc", name = "Eb", descriptor = "I")
	private int anInt1756 = -1;

	@OriginalMember(owner = "client!lc", name = "kb", descriptor = "Lclient!ic;")
	public Class34 aClass34_812 = Static83.aClass34_926;

	@OriginalMember(owner = "client!lc", name = "zb", descriptor = "I")
	public int anInt1752 = 0;

	@OriginalMember(owner = "client!lc", name = "ab", descriptor = "Z")
	public boolean aBoolean68 = false;

	@OriginalMember(owner = "client!lc", name = "Hb", descriptor = "I")
	public int anInt1758 = 0;

	@OriginalMember(owner = "client!lc", name = "Ob", descriptor = "[Lclient!ic;")
	public Class34[] aClass34Array13 = new Class34[] { null, null, Static115.aClass34_1223, null, null };

	@OriginalMember(owner = "client!lc", name = "Sb", descriptor = "I")
	public int anInt1765 = 0;

	@OriginalMember(owner = "client!lc", name = "Gb", descriptor = "I")
	public int anInt1757 = 0;

	@OriginalMember(owner = "client!lc", name = "Ub", descriptor = "I")
	public int anInt1767 = 0;

	@OriginalMember(owner = "client!lc", name = "Qb", descriptor = "I")
	public int anInt1763 = 0;

	@OriginalMember(owner = "client!lc", name = "Xb", descriptor = "I")
	private int anInt1770 = -1;

	@OriginalMember(owner = "client!lc", name = "Vb", descriptor = "I")
	private int anInt1768 = 0;

	@OriginalMember(owner = "client!lc", name = "Wb", descriptor = "I")
	public int anInt1769 = 0;

	@OriginalMember(owner = "client!lc", name = "Tb", descriptor = "I")
	public int anInt1766 = 0;

	@OriginalMember(owner = "client!lc", name = "eb", descriptor = "[Lclient!ic;")
	public Class34[] aClass34Array12 = new Class34[] { null, null, null, null, Static132.aClass34_1320 };

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(BI)Lclient!df;")
	public Class8_Sub1_Sub1_Sub3 method1068(@OriginalArg(1) int arg0) {
		@Pc(15) int local15;
		if (this.anIntArray225 != null && arg0 > 1) {
			@Pc(13) int local13 = -1;
			for (local15 = 0; local15 < 10; local15++) {
				if (arg0 >= this.anIntArray224[local15] && this.anIntArray224[local15] != 0) {
					local13 = this.anIntArray225[local15];
				}
			}
			if (local13 != -1) {
				return Static7.method49(local13).method1068(1);
			}
		}
		@Pc(62) Class8_Sub1_Sub1_Sub3 local62 = Static26.method472(Static52.aClass14_17, this.anInt1747);
		if (local62 == null) {
			return null;
		}
		if (this.anInt1734 != 128 || this.anInt1736 != 128 || this.anInt1728 != 128) {
			local62.method484(this.anInt1734, this.anInt1736, this.anInt1728);
		}
		if (this.aShortArray30 != null) {
			for (local15 = 0; local15 < this.aShortArray30.length; local15++) {
				local62.method490(this.aShortArray30[local15], this.aShortArray28[local15]);
			}
		}
		if (this.aShortArray31 != null) {
			for (local15 = 0; local15 < this.aShortArray31.length; local15++) {
				local62.method485(this.aShortArray31[local15], this.aShortArray29[local15]);
			}
		}
		return local62;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(BZ)Z")
	public boolean method1069(@OriginalArg(1) boolean arg0) {
		@Pc(14) int local14 = this.anInt1749;
		@Pc(17) int local17 = this.anInt1735;
		if (arg0) {
			local14 = this.anInt1742;
			local17 = this.anInt1756;
		}
		if (local14 == -1) {
			return true;
		}
		@Pc(32) boolean local32 = true;
		if (!Static52.aClass14_17.method1145(local14, 0)) {
			local32 = false;
		}
		if (local17 != -1 && !Static52.aClass14_17.method1145(local17, 0)) {
			local32 = false;
		}
		return local32;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZI)Lclient!df;")
	public Class8_Sub1_Sub1_Sub3 method1071(@OriginalArg(0) boolean arg0) {
		@Pc(11) int local11 = this.anInt1749;
		@Pc(14) int local14 = this.anInt1735;
		if (arg0) {
			local11 = this.anInt1742;
			local14 = this.anInt1756;
		}
		if (local11 == -1) {
			return null;
		}
		@Pc(33) Class8_Sub1_Sub1_Sub3 local33 = Static26.method472(Static52.aClass14_17, local11);
		if (local14 != -1) {
			@Pc(41) Class8_Sub1_Sub1_Sub3 local41 = Static26.method472(Static52.aClass14_17, local14);
			@Pc(52) Class8_Sub1_Sub1_Sub3[] local52 = new Class8_Sub1_Sub1_Sub3[] { local33, local41 };
			local33 = new Class8_Sub1_Sub1_Sub3(local52, 2);
		}
		@Pc(63) int local63;
		if (this.aShortArray30 != null) {
			for (local63 = 0; local63 < this.aShortArray30.length; local63++) {
				local33.method490(this.aShortArray30[local63], this.aShortArray28[local63]);
			}
		}
		if (this.aShortArray31 != null) {
			for (local63 = 0; local63 < this.aShortArray31.length; local63++) {
				local33.method485(this.aShortArray31[local63], this.aShortArray29[local63]);
			}
		}
		return local33;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)Lclient!nb;")
	public Class8_Sub1_Sub1_Sub6 method1072(@OriginalArg(0) int arg0) {
		if (this.anIntArray225 != null && arg0 > 1) {
			@Pc(13) int local13 = -1;
			for (@Pc(15) int local15 = 0; local15 < 10; local15++) {
				if (arg0 >= this.anIntArray224[local15] && this.anIntArray224[local15] != 0) {
					local13 = this.anIntArray225[local15];
				}
			}
			if (local13 != -1) {
				return Static7.method49(local13).method1072(1);
			}
		}
		@Pc(60) Class8_Sub1_Sub1_Sub6 local60 = (Class8_Sub1_Sub1_Sub6) Static93.aClass48_42.method1100((long) this.anInt1741);
		if (local60 != null) {
			return local60;
		}
		@Pc(70) Class8_Sub1_Sub1_Sub3 local70 = Static26.method472(Static52.aClass14_17, this.anInt1747);
		if (local70 == null) {
			return null;
		}
		if (this.anInt1734 != 128 || this.anInt1736 != 128 || this.anInt1728 != 128) {
			local70.method484(this.anInt1734, this.anInt1736, this.anInt1728);
		}
		@Pc(103) int local103;
		if (this.aShortArray30 != null) {
			for (local103 = 0; local103 < this.aShortArray30.length; local103++) {
				local70.method490(this.aShortArray30[local103], this.aShortArray28[local103]);
			}
		}
		if (this.aShortArray31 != null) {
			for (local103 = 0; local103 < this.aShortArray31.length; local103++) {
				local70.method485(this.aShortArray31[local103], this.aShortArray29[local103]);
			}
		}
		local60 = local70.method479(this.anInt1769 + 64, this.anInt1765 + 768, -50, -10, -50);
		local60.aBoolean81 = true;
		Static93.aClass48_42.method1097(local60, (long) this.anInt1741);
		return local60;
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(BZ)Z")
	public boolean method1073(@OriginalArg(1) boolean arg0) {
		@Pc(6) int local6 = this.anInt1770;
		@Pc(9) int local9 = this.anInt1750;
		@Pc(18) int local18 = this.anInt1760;
		if (arg0) {
			local9 = this.anInt1753;
			local18 = this.anInt1751;
			local6 = this.anInt1746;
		}
		if (local6 == -1) {
			return true;
		}
		@Pc(36) boolean local36 = true;
		if (!Static52.aClass14_17.method1145(local6, 0)) {
			local36 = false;
		}
		if (local18 != -1 && !Static52.aClass14_17.method1145(local18, 0)) {
			local36 = false;
		}
		if (local9 != -1 && !Static52.aClass14_17.method1145(local9, 0)) {
			local36 = false;
		}
		return local36;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!lc;Lclient!lc;I)V")
	public void method1075(@OriginalArg(0) Class8_Sub1_Sub13 arg0, @OriginalArg(1) Class8_Sub1_Sub13 arg1) {
		this.anInt1747 = arg0.anInt1747;
		this.aBoolean68 = arg1.aBoolean68;
		this.anInt1752 = 1;
		this.anInt1726 = arg1.anInt1726;
		this.anInt1727 = arg0.anInt1727;
		this.anInt1733 = arg0.anInt1733;
		this.aShortArray30 = arg0.aShortArray30;
		this.aShortArray29 = arg0.aShortArray29;
		this.anInt1757 = arg0.anInt1757;
		this.aShortArray28 = arg0.aShortArray28;
		this.aShortArray31 = arg0.aShortArray31;
		this.anInt1758 = arg0.anInt1758;
		this.aClass34_812 = arg1.aClass34_812;
		this.anInt1766 = arg0.anInt1766;
		this.anInt1767 = arg0.anInt1767;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!wd;B)V")
	public void method1078(@OriginalArg(0) Class8_Sub20 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method1872();
			if (local3 == 0) {
				return;
			}
			this.method1081(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IB)Lclient!lc;")
	public Class8_Sub1_Sub13 method1079(@OriginalArg(0) int arg0) {
		if (this.anIntArray225 != null && arg0 > 1) {
			@Pc(13) int local13 = -1;
			for (@Pc(15) int local15 = 0; local15 < 10; local15++) {
				if (this.anIntArray224[local15] <= arg0 && this.anIntArray224[local15] != 0) {
					local13 = this.anIntArray225[local15];
				}
			}
			if (local13 != -1) {
				return Static7.method49(local13);
			}
		}
		return this;
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(BZ)Lclient!df;")
	public Class8_Sub1_Sub1_Sub3 method1080(@OriginalArg(1) boolean arg0) {
		@Pc(8) int local8 = this.anInt1760;
		@Pc(11) int local11 = this.anInt1770;
		@Pc(14) int local14 = this.anInt1750;
		if (arg0) {
			local14 = this.anInt1753;
			local8 = this.anInt1751;
			local11 = this.anInt1746;
		}
		if (local11 == -1) {
			return null;
		}
		@Pc(36) Class8_Sub1_Sub1_Sub3 local36 = Static26.method472(Static52.aClass14_17, local11);
		if (local8 != -1) {
			@Pc(45) Class8_Sub1_Sub1_Sub3 local45 = Static26.method472(Static52.aClass14_17, local8);
			if (local14 == -1) {
				@Pc(59) Class8_Sub1_Sub1_Sub3[] local59 = new Class8_Sub1_Sub1_Sub3[] { local36, local45 };
				local36 = new Class8_Sub1_Sub1_Sub3(local59, 2);
			} else {
				@Pc(72) Class8_Sub1_Sub1_Sub3 local72 = Static26.method472(Static52.aClass14_17, local14);
				@Pc(87) Class8_Sub1_Sub1_Sub3[] local87 = new Class8_Sub1_Sub1_Sub3[] { local36, local45, local72 };
				local36 = new Class8_Sub1_Sub1_Sub3(local87, 3);
			}
		}
		if (!arg0 && this.anInt1732 != 0) {
			local36.method476(0, this.anInt1732, 0);
		}
		if (arg0 && this.anInt1768 != 0) {
			local36.method476(0, this.anInt1768, 0);
		}
		@Pc(126) int local126;
		if (this.aShortArray30 != null) {
			for (local126 = 0; local126 < this.aShortArray30.length; local126++) {
				local36.method490(this.aShortArray30[local126], this.aShortArray28[local126]);
			}
		}
		if (this.aShortArray31 != null) {
			for (local126 = 0; local126 < this.aShortArray31.length; local126++) {
				local36.method485(this.aShortArray31[local126], this.aShortArray29[local126]);
			}
		}
		return local36;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IILclient!wd;)V")
	private void method1081(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub20 arg1) {
		if (arg0 == 1) {
			this.anInt1747 = arg1.method1839();
		} else if (arg0 == 2) {
			this.aClass34_812 = arg1.method1892();
		} else if (arg0 == 4) {
			this.anInt1727 = arg1.method1839();
		} else if (arg0 == 5) {
			this.anInt1733 = arg1.method1839();
		} else if (arg0 == 6) {
			this.anInt1766 = arg1.method1839();
		} else if (arg0 == 7) {
			this.anInt1758 = arg1.method1839();
			if (this.anInt1758 > 32767) {
				this.anInt1758 -= 65536;
				return;
			}
			return;
		} else if (arg0 == 8) {
			this.anInt1757 = arg1.method1839();
			if (this.anInt1757 > 32767) {
				this.anInt1757 -= 65536;
				return;
			}
		} else if (arg0 == 11) {
			this.anInt1752 = 1;
			return;
		} else {
			if (arg0 == 12) {
				this.anInt1726 = arg1.method1853();
			} else if (arg0 == 16) {
				this.aBoolean68 = true;
				return;
			} else if (arg0 == 23) {
				this.anInt1770 = arg1.method1839();
				this.anInt1732 = arg1.method1872();
				return;
			} else if (arg0 == 24) {
				this.anInt1760 = arg1.method1839();
				return;
			} else if (arg0 == 25) {
				this.anInt1746 = arg1.method1839();
				this.anInt1768 = arg1.method1872();
				return;
			} else if (arg0 == 26) {
				this.anInt1751 = arg1.method1839();
				return;
			} else if (arg0 >= 30 && arg0 < 35) {
				this.aClass34Array13[arg0 - 30] = arg1.method1892();
				if (this.aClass34Array13[arg0 - 30].method806(Static97.aClass34_1059)) {
					this.aClass34Array13[arg0 - 30] = null;
					return;
				}
			} else if (arg0 < 35 || arg0 >= 40) {
				@Pc(375) int local375;
				@Pc(385) int local385;
				if (arg0 != 40) {
					if (arg0 == 41) {
						local375 = arg1.method1872();
						this.aShortArray31 = new short[local375];
						this.aShortArray29 = new short[local375];
						for (local385 = 0; local385 < local375; local385++) {
							this.aShortArray31[local385] = (short) arg1.method1839();
							this.aShortArray29[local385] = (short) arg1.method1839();
						}
					} else if (arg0 != 65) {
						if (arg0 != 78) {
							if (arg0 != 79) {
								if (arg0 != 90) {
									if (arg0 == 91) {
										this.anInt1742 = arg1.method1839();
										return;
									}
									if (arg0 != 92) {
										if (arg0 != 93) {
											if (arg0 == 95) {
												this.anInt1767 = arg1.method1839();
												return;
											}
											if (arg0 != 97) {
												if (arg0 == 98) {
													this.anInt1739 = arg1.method1839();
													return;
												}
												if (arg0 >= 100 && arg0 < 110) {
													if (this.anIntArray225 == null) {
														this.anIntArray225 = new int[10];
														this.anIntArray224 = new int[10];
													}
													this.anIntArray225[arg0 - 100] = arg1.method1839();
													this.anIntArray224[arg0 - 100] = arg1.method1839();
													return;
												}
												if (arg0 != 110) {
													if (arg0 == 111) {
														this.anInt1736 = arg1.method1839();
														return;
													}
													if (arg0 == 112) {
														this.anInt1728 = arg1.method1839();
													} else if (arg0 == 113) {
														this.anInt1769 = arg1.method1847();
														return;
													} else if (arg0 == 114) {
														this.anInt1765 = arg1.method1847() * 5;
														return;
													} else if (arg0 == 115) {
														this.anInt1763 = arg1.method1872();
														return;
													}
													return;
												}
												this.anInt1734 = arg1.method1839();
												return;
											}
											this.anInt1740 = arg1.method1839();
											return;
										}
										this.anInt1756 = arg1.method1839();
										return;
									}
									this.anInt1735 = arg1.method1839();
									return;
								}
								this.anInt1749 = arg1.method1839();
								return;
							}
							this.anInt1753 = arg1.method1839();
							return;
						}
						this.anInt1750 = arg1.method1839();
						return;
					}
					return;
				}
				local375 = arg1.method1872();
				this.aShortArray30 = new short[local375];
				this.aShortArray28 = new short[local375];
				for (local385 = 0; local385 < local375; local385++) {
					this.aShortArray30[local385] = (short) arg1.method1839();
					this.aShortArray28[local385] = (short) arg1.method1839();
				}
				return;
			} else {
				this.aClass34Array12[arg0 - 35] = arg1.method1892();
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "(I)V")
	public void method1082() {
	}
}
