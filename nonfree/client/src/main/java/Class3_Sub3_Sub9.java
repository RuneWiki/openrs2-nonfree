import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class3_Sub3_Sub9 extends Class3_Sub3 {

	@OriginalMember(owner = "client!nb", name = "T", descriptor = "[I")
	private int[] anIntArray303;

	@OriginalMember(owner = "client!nb", name = "gb", descriptor = "I")
	public int anInt1778;

	@OriginalMember(owner = "client!nb", name = "lb", descriptor = "I")
	private int anInt1780;

	@OriginalMember(owner = "client!nb", name = "ob", descriptor = "[I")
	public int[] anIntArray304;

	@OriginalMember(owner = "client!nb", name = "Cb", descriptor = "[I")
	private int[] anIntArray305;

	@OriginalMember(owner = "client!nb", name = "Fb", descriptor = "[I")
	public int[] anIntArray306;

	@OriginalMember(owner = "client!nb", name = "bb", descriptor = "I")
	private int anInt1773 = 128;

	@OriginalMember(owner = "client!nb", name = "X", descriptor = "I")
	private int anInt1770 = -1;

	@OriginalMember(owner = "client!nb", name = "cb", descriptor = "I")
	private int anInt1774 = -1;

	@OriginalMember(owner = "client!nb", name = "nb", descriptor = "I")
	private int anInt1782 = 128;

	@OriginalMember(owner = "client!nb", name = "kb", descriptor = "[Lclient!hb;")
	public Class27[] aClass27Array11 = new Class27[] { null, null, null, null, Static66.aClass27_835 };

	@OriginalMember(owner = "client!nb", name = "Y", descriptor = "I")
	public int anInt1771 = 0;

	@OriginalMember(owner = "client!nb", name = "xb", descriptor = "I")
	public int anInt1789 = 0;

	@OriginalMember(owner = "client!nb", name = "sb", descriptor = "I")
	private int anInt1785 = -1;

	@OriginalMember(owner = "client!nb", name = "hb", descriptor = "I")
	private int anInt1779 = -1;

	@OriginalMember(owner = "client!nb", name = "W", descriptor = "I")
	private int anInt1769 = -1;

	@OriginalMember(owner = "client!nb", name = "qb", descriptor = "I")
	public int anInt1783 = 0;

	@OriginalMember(owner = "client!nb", name = "fb", descriptor = "I")
	private int anInt1777 = -1;

	@OriginalMember(owner = "client!nb", name = "Eb", descriptor = "I")
	private int anInt1795 = 128;

	@OriginalMember(owner = "client!nb", name = "tb", descriptor = "I")
	public int anInt1786 = 0;

	@OriginalMember(owner = "client!nb", name = "Z", descriptor = "Lclient!hb;")
	public Class27 aClass27_869 = Static53.aClass27_695;

	@OriginalMember(owner = "client!nb", name = "Db", descriptor = "I")
	private int anInt1794 = -1;

	@OriginalMember(owner = "client!nb", name = "Gb", descriptor = "I")
	public int anInt1796 = -1;

	@OriginalMember(owner = "client!nb", name = "Bb", descriptor = "I")
	private int anInt1793 = 0;

	@OriginalMember(owner = "client!nb", name = "ab", descriptor = "I")
	private int anInt1772 = 0;

	@OriginalMember(owner = "client!nb", name = "Lb", descriptor = "I")
	private int anInt1800 = -1;

	@OriginalMember(owner = "client!nb", name = "Rb", descriptor = "I")
	public int anInt1804 = 0;

	@OriginalMember(owner = "client!nb", name = "Ib", descriptor = "I")
	public int anInt1798 = 0;

	@OriginalMember(owner = "client!nb", name = "zb", descriptor = "I")
	public int anInt1791 = -1;

	@OriginalMember(owner = "client!nb", name = "Yb", descriptor = "[Lclient!hb;")
	public Class27[] aClass27Array12 = new Class27[] { null, null, Static1.aClass27_3, null, null };

	@OriginalMember(owner = "client!nb", name = "yb", descriptor = "I")
	public int anInt1790 = 0;

	@OriginalMember(owner = "client!nb", name = "Ub", descriptor = "I")
	public int anInt1807 = 0;

	@OriginalMember(owner = "client!nb", name = "Tb", descriptor = "I")
	public int anInt1806 = 0;

	@OriginalMember(owner = "client!nb", name = "Zb", descriptor = "I")
	public int anInt1811 = 1;

	@OriginalMember(owner = "client!nb", name = "Xb", descriptor = "I")
	public int anInt1810 = 2000;

	@OriginalMember(owner = "client!nb", name = "ac", descriptor = "I")
	private int anInt1812 = -1;

	@OriginalMember(owner = "client!nb", name = "Mb", descriptor = "I")
	private int anInt1801 = -1;

	@OriginalMember(owner = "client!nb", name = "Ob", descriptor = "Z")
	public boolean aBoolean93 = false;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZI)Z")
	public boolean method1261(@OriginalArg(0) boolean arg0) {
		@Pc(2) int local2 = this.anInt1794;
		@Pc(9) int local9 = this.anInt1777;
		if (arg0) {
			local2 = this.anInt1774;
			local9 = this.anInt1812;
		}
		if (local2 == -1) {
			return true;
		}
		@Pc(26) boolean local26 = true;
		if (!Static45.aClass54_8.method1598(local2, 0)) {
			local26 = false;
		}
		if (local9 != -1 && !Static45.aClass54_8.method1598(local9, 0)) {
			local26 = false;
		}
		return local26;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILclient!wd;I)V")
	private void method1262(@OriginalArg(1) Class3_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1780 = arg0.method1451();
		} else if (arg1 == 2) {
			this.aClass27_869 = arg0.method1426();
		} else if (arg1 == 4) {
			this.anInt1810 = arg0.method1451();
		} else if (arg1 == 5) {
			this.anInt1806 = arg0.method1451();
		} else if (arg1 == 6) {
			this.anInt1804 = arg0.method1451();
		} else if (arg1 == 7) {
			this.anInt1783 = arg0.method1451();
			if (this.anInt1783 > 32767) {
				this.anInt1783 -= 65536;
				return;
			}
		} else if (arg1 == 8) {
			this.anInt1798 = arg0.method1451();
			if (this.anInt1798 > 32767) {
				this.anInt1798 -= 65536;
				return;
			}
		} else if (arg1 == 10) {
			arg0.method1451();
		} else if (arg1 == 11) {
			this.anInt1786 = 1;
			return;
		} else if (arg1 == 12) {
			this.anInt1811 = arg0.method1444();
			return;
		} else if (arg1 == 16) {
			this.aBoolean93 = true;
			return;
		} else if (arg1 == 23) {
			this.anInt1769 = arg0.method1451();
			this.anInt1772 = arg0.method1421();
			return;
		} else if (arg1 == 24) {
			this.anInt1800 = arg0.method1451();
			return;
		} else {
			if (arg1 == 25) {
				this.anInt1801 = arg0.method1451();
				this.anInt1793 = arg0.method1421();
			} else if (arg1 == 26) {
				this.anInt1779 = arg0.method1451();
				return;
			} else if (arg1 >= 30 && arg1 < 35) {
				this.aClass27Array12[arg1 - 30] = arg0.method1426();
				if (this.aClass27Array12[arg1 - 30].method763(Static107.aClass27_1339)) {
					this.aClass27Array12[arg1 - 30] = null;
					return;
				}
			} else if (arg1 < 35 || arg1 >= 40) {
				if (arg1 != 40) {
					if (arg1 == 78) {
						this.anInt1785 = arg0.method1451();
						return;
					}
					if (arg1 != 79) {
						if (arg1 == 90) {
							this.anInt1794 = arg0.method1451();
							return;
						}
						if (arg1 != 91) {
							if (arg1 == 92) {
								this.anInt1777 = arg0.method1451();
								return;
							}
							if (arg1 != 93) {
								if (arg1 != 95) {
									if (arg1 != 97) {
										if (arg1 == 98) {
											this.anInt1796 = arg0.method1451();
											return;
										}
										if (arg1 >= 100 && arg1 < 110) {
											if (this.anIntArray306 == null) {
												this.anIntArray306 = new int[10];
												this.anIntArray304 = new int[10];
											}
											this.anIntArray306[arg1 - 100] = arg0.method1451();
											this.anIntArray304[arg1 - 100] = arg0.method1451();
											return;
										}
										if (arg1 == 110) {
											this.anInt1782 = arg0.method1451();
											return;
										}
										if (arg1 != 111) {
											if (arg1 != 112) {
												if (arg1 == 113) {
													this.anInt1790 = arg0.method1432();
												} else if (arg1 == 114) {
													this.anInt1771 = arg0.method1432() * 5;
													return;
												} else if (arg1 == 115) {
													this.anInt1807 = arg0.method1421();
													return;
												}
												return;
											}
											this.anInt1795 = arg0.method1451();
											return;
										}
										this.anInt1773 = arg0.method1451();
										return;
									}
									this.anInt1791 = arg0.method1451();
									return;
								}
								this.anInt1789 = arg0.method1451();
								return;
							}
							this.anInt1812 = arg0.method1451();
							return;
						}
						this.anInt1774 = arg0.method1451();
						return;
					}
					this.anInt1770 = arg0.method1451();
					return;
				}
				@Pc(164) int local164 = arg0.method1421();
				this.anIntArray303 = new int[local164];
				this.anIntArray305 = new int[local164];
				for (@Pc(174) int local174 = 0; local174 < local164; local174++) {
					this.anIntArray303[local174] = arg0.method1451();
					this.anIntArray305[local174] = arg0.method1451();
				}
				return;
			} else {
				this.aClass27Array11[arg1 - 35] = arg0.method1426();
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(ZI)Lclient!de;")
	public Class3_Sub3_Sub1_Sub1 method1263(@OriginalArg(0) boolean arg0) {
		@Pc(8) int local8 = this.anInt1794;
		@Pc(11) int local11 = this.anInt1777;
		if (arg0) {
			local11 = this.anInt1812;
			local8 = this.anInt1774;
		}
		if (local8 == -1) {
			return null;
		}
		@Pc(36) Class3_Sub3_Sub1_Sub1 local36 = Static21.method398(Static45.aClass54_8, local8);
		if (local11 != -1) {
			@Pc(45) Class3_Sub3_Sub1_Sub1 local45 = Static21.method398(Static45.aClass54_8, local11);
			@Pc(56) Class3_Sub3_Sub1_Sub1[] local56 = new Class3_Sub3_Sub1_Sub1[] { local36, local45 };
			local36 = new Class3_Sub3_Sub1_Sub1(local56, 2);
		}
		if (this.anIntArray303 != null) {
			for (@Pc(67) int local67 = 0; local67 < this.anIntArray303.length; local67++) {
				local36.method406(this.anIntArray303[local67], this.anIntArray305[local67]);
			}
		}
		return local36;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZII)Lclient!de;")
	public Class3_Sub3_Sub1_Sub1 method1264(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray306 != null && arg1 > 1) {
			@Pc(15) int local15 = -1;
			for (@Pc(17) int local17 = 0; local17 < 10; local17++) {
				if (arg1 >= this.anIntArray304[local17] && this.anIntArray304[local17] != 0) {
					local15 = this.anIntArray306[local17];
				}
			}
			if (local15 != -1) {
				return Static37.method696(local15).method1264(arg0, 1);
			}
		}
		@Pc(63) Class3_Sub3_Sub1_Sub1 local63;
		if (arg0) {
			local63 = (Class3_Sub3_Sub1_Sub1) Static80.aClass21_25.method658((long) this.anInt1778);
			if (local63 != null) {
				return local63;
			}
		}
		local63 = Static21.method398(Static45.aClass54_8, this.anInt1780);
		if (local63 == null) {
			return null;
		}
		if (this.anInt1782 != 128 || this.anInt1773 != 128 || this.anInt1795 != 128) {
			local63.method418(this.anInt1782, this.anInt1773, this.anInt1795);
		}
		if (this.anIntArray303 != null) {
			for (@Pc(112) int local112 = 0; local112 < this.anIntArray303.length; local112++) {
				local63.method406(this.anIntArray303[local112], this.anIntArray305[local112]);
			}
		}
		if (arg0) {
			local63.method407(this.anInt1790 + 64, this.anInt1771 + 768, -50, -10, -50, true);
			local63.aBoolean31 = true;
			Static80.aClass21_25.method660(local63, (long) this.anInt1778);
		}
		return local63;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!nb;Lclient!nb;I)V")
	public void method1267(@OriginalArg(0) Class3_Sub3_Sub9 arg0, @OriginalArg(1) Class3_Sub3_Sub9 arg1) {
		this.anInt1811 = arg0.anInt1811;
		this.anIntArray303 = arg1.anIntArray303;
		this.aBoolean93 = arg0.aBoolean93;
		this.anInt1783 = arg1.anInt1783;
		this.anInt1804 = arg1.anInt1804;
		this.anInt1810 = arg1.anInt1810;
		this.anInt1780 = arg1.anInt1780;
		this.anInt1806 = arg1.anInt1806;
		this.anInt1786 = 1;
		this.aClass27_869 = arg0.aClass27_869;
		this.anInt1789 = arg1.anInt1789;
		this.anInt1798 = arg1.anInt1798;
		this.anIntArray305 = arg1.anIntArray305;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IZ)Z")
	public boolean method1268(@OriginalArg(1) boolean arg0) {
		@Pc(6) int local6 = this.anInt1800;
		@Pc(9) int local9 = this.anInt1769;
		@Pc(18) int local18 = this.anInt1785;
		if (arg0) {
			local9 = this.anInt1801;
			local18 = this.anInt1770;
			local6 = this.anInt1779;
		}
		if (local9 == -1) {
			return true;
		}
		@Pc(36) boolean local36 = true;
		if (!Static45.aClass54_8.method1598(local9, 0)) {
			local36 = false;
		}
		if (local6 != -1 && !Static45.aClass54_8.method1598(local6, 0)) {
			local36 = false;
		}
		if (local18 != -1 && !Static45.aClass54_8.method1598(local18, 0)) {
			local36 = false;
		}
		return local36;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZZ)Lclient!de;")
	public Class3_Sub3_Sub1_Sub1 method1270(@OriginalArg(0) boolean arg0) {
		@Pc(4) int local4 = this.anInt1769;
		@Pc(11) int local11 = this.anInt1800;
		@Pc(14) int local14 = this.anInt1785;
		if (arg0) {
			local11 = this.anInt1779;
			local14 = this.anInt1770;
			local4 = this.anInt1801;
		}
		if (local4 == -1) {
			return null;
		}
		@Pc(35) Class3_Sub3_Sub1_Sub1 local35 = Static21.method398(Static45.aClass54_8, local4);
		if (local11 != -1) {
			@Pc(48) Class3_Sub3_Sub1_Sub1 local48 = Static21.method398(Static45.aClass54_8, local11);
			if (local14 == -1) {
				@Pc(62) Class3_Sub3_Sub1_Sub1[] local62 = new Class3_Sub3_Sub1_Sub1[] { local35, local48 };
				local35 = new Class3_Sub3_Sub1_Sub1(local62, 2);
			} else {
				@Pc(75) Class3_Sub3_Sub1_Sub1 local75 = Static21.method398(Static45.aClass54_8, local14);
				@Pc(90) Class3_Sub3_Sub1_Sub1[] local90 = new Class3_Sub3_Sub1_Sub1[] { local35, local48, local75 };
				local35 = new Class3_Sub3_Sub1_Sub1(local90, 3);
			}
		}
		if (!arg0 && this.anInt1772 != 0) {
			local35.method412(0, this.anInt1772, 0);
		}
		if (arg0 && this.anInt1793 != 0) {
			local35.method412(0, this.anInt1793, 0);
		}
		if (this.anIntArray303 != null) {
			for (@Pc(126) int local126 = 0; local126 < this.anIntArray303.length; local126++) {
				local35.method406(this.anIntArray303[local126], this.anIntArray305[local126]);
			}
		}
		return local35;
	}

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "(I)V")
	public void method1271() {
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BLclient!wd;)V")
	public void method1272(@OriginalArg(1) Class3_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1421();
			if (local5 == 0) {
				return;
			}
			this.method1262(arg0, local5);
		}
	}
}
