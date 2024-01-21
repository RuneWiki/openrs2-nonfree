import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class2_Sub2_Sub9 extends Class2_Sub2 {

	@OriginalMember(owner = "client!i", name = "Q", descriptor = "[S")
	private short[] aShortArray57;

	@OriginalMember(owner = "client!i", name = "U", descriptor = "[S")
	private short[] aShortArray58;

	@OriginalMember(owner = "client!i", name = "bb", descriptor = "[I")
	public int[] anIntArray284;

	@OriginalMember(owner = "client!i", name = "jb", descriptor = "I")
	public int anInt1783;

	@OriginalMember(owner = "client!i", name = "qb", descriptor = "[S")
	private short[] aShortArray59;

	@OriginalMember(owner = "client!i", name = "Db", descriptor = "[S")
	private short[] aShortArray60;

	@OriginalMember(owner = "client!i", name = "Nb", descriptor = "[I")
	public int[] anIntArray285;

	@OriginalMember(owner = "client!i", name = "Rb", descriptor = "I")
	private int anInt1803;

	@OriginalMember(owner = "client!i", name = "cb", descriptor = "I")
	public int anInt1776 = 0;

	@OriginalMember(owner = "client!i", name = "fb", descriptor = "I")
	public int anInt1779 = -1;

	@OriginalMember(owner = "client!i", name = "V", descriptor = "I")
	private int anInt1771 = 0;

	@OriginalMember(owner = "client!i", name = "mb", descriptor = "I")
	public int anInt1785 = 0;

	@OriginalMember(owner = "client!i", name = "hb", descriptor = "I")
	private int anInt1781 = 128;

	@OriginalMember(owner = "client!i", name = "vb", descriptor = "I")
	private int anInt1791 = -1;

	@OriginalMember(owner = "client!i", name = "yb", descriptor = "I")
	private int anInt1793 = 0;

	@OriginalMember(owner = "client!i", name = "kb", descriptor = "I")
	private int anInt1784 = -1;

	@OriginalMember(owner = "client!i", name = "ib", descriptor = "I")
	public int anInt1782 = 0;

	@OriginalMember(owner = "client!i", name = "wb", descriptor = "I")
	private int anInt1792 = -1;

	@OriginalMember(owner = "client!i", name = "Bb", descriptor = "I")
	public int anInt1794 = 1;

	@OriginalMember(owner = "client!i", name = "Kb", descriptor = "I")
	private int anInt1798 = -1;

	@OriginalMember(owner = "client!i", name = "X", descriptor = "[Lclient!sg;")
	public Class77[] aClass77Array14 = new Class77[] { null, null, Static54.aClass77_579, null, null };

	@OriginalMember(owner = "client!i", name = "tb", descriptor = "I")
	private int anInt1789 = 128;

	@OriginalMember(owner = "client!i", name = "Cb", descriptor = "I")
	public int anInt1795 = 0;

	@OriginalMember(owner = "client!i", name = "db", descriptor = "I")
	private int anInt1777 = -1;

	@OriginalMember(owner = "client!i", name = "Mb", descriptor = "I")
	public int anInt1799 = -1;

	@OriginalMember(owner = "client!i", name = "Vb", descriptor = "Lclient!sg;")
	public Class77 aClass77_717 = Static179.aClass77_1554;

	@OriginalMember(owner = "client!i", name = "gb", descriptor = "I")
	private int anInt1780 = 0;

	@OriginalMember(owner = "client!i", name = "sb", descriptor = "I")
	private int anInt1788 = 0;

	@OriginalMember(owner = "client!i", name = "Qb", descriptor = "I")
	private int anInt1802 = -1;

	@OriginalMember(owner = "client!i", name = "Ub", descriptor = "I")
	public int anInt1806 = 0;

	@OriginalMember(owner = "client!i", name = "T", descriptor = "I")
	private int anInt1770 = 128;

	@OriginalMember(owner = "client!i", name = "ob", descriptor = "I")
	private int anInt1787 = -1;

	@OriginalMember(owner = "client!i", name = "Yb", descriptor = "I")
	public int anInt1809 = 0;

	@OriginalMember(owner = "client!i", name = "Eb", descriptor = "Z")
	public boolean aBoolean82 = false;

	@OriginalMember(owner = "client!i", name = "Fb", descriptor = "[Lclient!sg;")
	public Class77[] aClass77Array15 = new Class77[] { null, null, null, null, Static118.aClass77_1092 };

	@OriginalMember(owner = "client!i", name = "Sb", descriptor = "I")
	private int anInt1804 = -1;

	@OriginalMember(owner = "client!i", name = "Ob", descriptor = "I")
	public int anInt1800 = 2000;

	@OriginalMember(owner = "client!i", name = "Wb", descriptor = "I")
	private int anInt1807 = -1;

	@OriginalMember(owner = "client!i", name = "ub", descriptor = "I")
	public int anInt1790 = 0;

	@OriginalMember(owner = "client!i", name = "Zb", descriptor = "I")
	private int anInt1810 = -1;

	@OriginalMember(owner = "client!i", name = "lb", descriptor = "Z")
	public boolean aBoolean81 = false;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!oa;BI)V")
	private void method1298(@OriginalArg(0) Class2_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1803 = arg0.method2353();
		} else if (arg1 == 2) {
			this.aClass77_717 = arg0.method2361();
		} else if (arg1 == 4) {
			this.anInt1800 = arg0.method2353();
		} else if (arg1 == 5) {
			this.anInt1790 = arg0.method2353();
		} else if (arg1 == 6) {
			this.anInt1785 = arg0.method2353();
			return;
		} else if (arg1 == 7) {
			this.anInt1782 = arg0.method2353();
			if (this.anInt1782 > 32767) {
				this.anInt1782 -= 65536;
				return;
			}
		} else if (arg1 == 8) {
			this.anInt1776 = arg0.method2353();
			if (this.anInt1776 > 32767) {
				this.anInt1776 -= 65536;
				return;
			}
			return;
		} else if (arg1 == 11) {
			this.anInt1795 = 1;
			return;
		} else if (arg1 == 12) {
			this.anInt1794 = arg0.method2382();
			return;
		} else if (arg1 == 16) {
			this.aBoolean81 = true;
			return;
		} else if (arg1 == 23) {
			this.anInt1784 = arg0.method2353();
			this.anInt1780 = arg0.method2387();
			return;
		} else if (arg1 == 24) {
			this.anInt1798 = arg0.method2353();
			return;
		} else if (arg1 == 25) {
			this.anInt1791 = arg0.method2353();
			this.anInt1793 = arg0.method2387();
			return;
		} else {
			if (arg1 == 26) {
				this.anInt1802 = arg0.method2353();
			} else if (arg1 >= 30 && arg1 < 35) {
				this.aClass77Array14[arg1 - 30] = arg0.method2361();
				if (this.aClass77Array14[arg1 - 30].method2508(Static119.aClass77_1104)) {
					this.aClass77Array14[arg1 - 30] = null;
					return;
				}
			} else if (arg1 < 35 || arg1 >= 40) {
				@Pc(132) int local132;
				@Pc(142) int local142;
				if (arg1 != 40) {
					if (arg1 != 41) {
						if (arg1 == 65) {
							this.aBoolean82 = true;
							return;
						}
						if (arg1 != 78) {
							if (arg1 == 79) {
								this.anInt1807 = arg0.method2353();
								return;
							}
							if (arg1 != 90) {
								if (arg1 == 91) {
									this.anInt1777 = arg0.method2353();
									return;
								}
								if (arg1 != 92) {
									if (arg1 != 93) {
										if (arg1 == 95) {
											this.anInt1809 = arg0.method2353();
											return;
										}
										if (arg1 == 97) {
											this.anInt1779 = arg0.method2353();
											return;
										}
										if (arg1 == 98) {
											this.anInt1799 = arg0.method2353();
										} else if (arg1 < 100 || arg1 >= 110) {
											if (arg1 == 110) {
												this.anInt1770 = arg0.method2353();
												return;
											}
											if (arg1 == 111) {
												this.anInt1789 = arg0.method2353();
												return;
											}
											if (arg1 == 112) {
												this.anInt1781 = arg0.method2353();
												return;
											}
											if (arg1 == 113) {
												this.anInt1771 = arg0.method2392();
												return;
											}
											if (arg1 == 114) {
												this.anInt1788 = arg0.method2392() * 5;
												return;
											}
											if (arg1 == 115) {
												this.anInt1806 = arg0.method2387();
												return;
											}
										} else {
											if (this.anIntArray285 == null) {
												this.anIntArray285 = new int[10];
												this.anIntArray284 = new int[10];
											}
											this.anIntArray285[arg1 - 100] = arg0.method2353();
											this.anIntArray284[arg1 - 100] = arg0.method2353();
											return;
										}
										return;
									}
									this.anInt1787 = arg0.method2353();
									return;
								}
								this.anInt1792 = arg0.method2353();
								return;
							}
							this.anInt1810 = arg0.method2353();
							return;
						}
						this.anInt1804 = arg0.method2353();
						return;
					}
					local132 = arg0.method2387();
					this.aShortArray60 = new short[local132];
					this.aShortArray57 = new short[local132];
					for (local142 = 0; local142 < local132; local142++) {
						this.aShortArray57[local142] = (short) arg0.method2353();
						this.aShortArray60[local142] = (short) arg0.method2353();
					}
					return;
				}
				local132 = arg0.method2387();
				this.aShortArray58 = new short[local132];
				this.aShortArray59 = new short[local132];
				for (local142 = 0; local142 < local132; local142++) {
					this.aShortArray58[local142] = (short) arg0.method2353();
					this.aShortArray59[local142] = (short) arg0.method2353();
				}
				return;
			} else {
				this.aClass77Array15[arg1 - 35] = arg0.method2361();
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!tc;I)Lclient!cd;")
	public Class2_Sub2_Sub1_Sub2 method1299(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2_Sub15 arg1, @OriginalArg(3) int arg2) {
		if (this.anIntArray285 != null && arg0 > 1) {
			@Pc(13) int local13 = -1;
			for (@Pc(15) int local15 = 0; local15 < 10; local15++) {
				if (arg0 >= this.anIntArray284[local15] && this.anIntArray284[local15] != 0) {
					local13 = this.anIntArray285[local15];
				}
			}
			if (local13 != -1) {
				return Static158.method2689(local13).method1299(1, arg1, arg2);
			}
		}
		@Pc(61) Class2_Sub2_Sub1_Sub2 local61 = (Class2_Sub2_Sub1_Sub2) Static9.aClass82_6.method2699((long) this.anInt1783);
		if (local61 == null) {
			@Pc(69) Class2_Sub2_Sub1_Sub3 local69 = Static47.method877(Static46.aClass43_12, this.anInt1803);
			if (local69 == null) {
				return null;
			}
			@Pc(78) int local78;
			if (this.aShortArray58 != null) {
				for (local78 = 0; local78 < this.aShortArray58.length; local78++) {
					local69.method864(this.aShortArray58[local78], this.aShortArray59[local78]);
				}
			}
			if (this.aShortArray57 != null) {
				for (local78 = 0; local78 < this.aShortArray57.length; local78++) {
					local69.method880(this.aShortArray57[local78], this.aShortArray60[local78]);
				}
			}
			local61 = local69.method865(this.anInt1771 + 64, this.anInt1788 + 768, -50, -10, -50, false);
			if (this.anInt1770 != 128 || this.anInt1789 != 128 || this.anInt1781 != 128) {
				local61.method597(this.anInt1770, this.anInt1789, this.anInt1781);
			}
			Static9.aClass82_6.method2701((long) this.anInt1783, local61);
		}
		if (arg1 != null) {
			local61 = arg1.method2587(arg2, local61);
		}
		return local61;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!i;BLclient!i;)V")
	public void method1300(@OriginalArg(0) Class2_Sub2_Sub9 arg0, @OriginalArg(2) Class2_Sub2_Sub9 arg1) {
		this.anInt1794 = arg1.anInt1794;
		this.anInt1795 = 1;
		this.aBoolean81 = arg1.aBoolean81;
		this.aShortArray60 = arg0.aShortArray60;
		this.anInt1776 = arg0.anInt1776;
		this.aShortArray57 = arg0.aShortArray57;
		this.aShortArray59 = arg0.aShortArray59;
		this.aClass77_717 = arg1.aClass77_717;
		this.anInt1782 = arg0.anInt1782;
		this.anInt1785 = arg0.anInt1785;
		this.anInt1809 = arg0.anInt1809;
		this.anInt1790 = arg0.anInt1790;
		this.aShortArray58 = arg0.aShortArray58;
		this.anInt1800 = arg0.anInt1800;
		this.anInt1803 = arg0.anInt1803;
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(ZI)Lclient!fe;")
	public Class2_Sub2_Sub1_Sub3 method1301(@OriginalArg(0) boolean arg0) {
		@Pc(4) int local4 = this.anInt1810;
		@Pc(11) int local11 = this.anInt1792;
		if (arg0) {
			local4 = this.anInt1777;
			local11 = this.anInt1787;
		}
		if (local4 == -1) {
			return null;
		}
		@Pc(38) Class2_Sub2_Sub1_Sub3 local38 = Static47.method877(Static46.aClass43_12, local4);
		if (local11 != -1) {
			@Pc(47) Class2_Sub2_Sub1_Sub3 local47 = Static47.method877(Static46.aClass43_12, local11);
			@Pc(58) Class2_Sub2_Sub1_Sub3[] local58 = new Class2_Sub2_Sub1_Sub3[] { local38, local47 };
			local38 = new Class2_Sub2_Sub1_Sub3(local58, 2);
		}
		@Pc(69) int local69;
		if (this.aShortArray58 != null) {
			for (local69 = 0; local69 < this.aShortArray58.length; local69++) {
				local38.method864(this.aShortArray58[local69], this.aShortArray59[local69]);
			}
		}
		if (this.aShortArray57 != null) {
			for (local69 = 0; local69 < this.aShortArray57.length; local69++) {
				local38.method880(this.aShortArray57[local69], this.aShortArray60[local69]);
			}
		}
		return local38;
	}

	@OriginalMember(owner = "client!i", name = "f", descriptor = "(I)V")
	public void method1302() {
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IZ)Lclient!fe;")
	public Class2_Sub2_Sub1_Sub3 method1303(@OriginalArg(1) boolean arg0) {
		@Pc(6) int local6 = this.anInt1798;
		@Pc(9) int local9 = this.anInt1784;
		@Pc(12) int local12 = this.anInt1804;
		if (arg0) {
			local12 = this.anInt1807;
			local9 = this.anInt1791;
			local6 = this.anInt1802;
		}
		if (local9 == -1) {
			return null;
		}
		@Pc(34) Class2_Sub2_Sub1_Sub3 local34 = Static47.method877(Static46.aClass43_12, local9);
		if (local6 != -1) {
			@Pc(43) Class2_Sub2_Sub1_Sub3 local43 = Static47.method877(Static46.aClass43_12, local6);
			if (local12 == -1) {
				@Pc(85) Class2_Sub2_Sub1_Sub3[] local85 = new Class2_Sub2_Sub1_Sub3[] { local34, local43 };
				local34 = new Class2_Sub2_Sub1_Sub3(local85, 2);
			} else {
				@Pc(52) Class2_Sub2_Sub1_Sub3 local52 = Static47.method877(Static46.aClass43_12, local12);
				@Pc(67) Class2_Sub2_Sub1_Sub3[] local67 = new Class2_Sub2_Sub1_Sub3[] { local34, local43, local52 };
				local34 = new Class2_Sub2_Sub1_Sub3(local67, 3);
			}
		}
		if (!arg0 && this.anInt1780 != 0) {
			local34.method871(0, this.anInt1780, 0);
		}
		if (arg0 && this.anInt1793 != 0) {
			local34.method871(0, this.anInt1793, 0);
		}
		@Pc(129) int local129;
		if (this.aShortArray58 != null) {
			for (local129 = 0; local129 < this.aShortArray58.length; local129++) {
				local34.method864(this.aShortArray58[local129], this.aShortArray59[local129]);
			}
		}
		if (this.aShortArray57 != null) {
			for (local129 = 0; local129 < this.aShortArray57.length; local129++) {
				local34.method880(this.aShortArray57[local129], this.aShortArray60[local129]);
			}
		}
		return local34;
	}

	@OriginalMember(owner = "client!i", name = "c", descriptor = "(ZI)Z")
	public boolean method1304(@OriginalArg(0) boolean arg0) {
		@Pc(6) int local6 = this.anInt1784;
		@Pc(9) int local9 = this.anInt1798;
		@Pc(12) int local12 = this.anInt1804;
		if (arg0) {
			local9 = this.anInt1802;
			local6 = this.anInt1791;
			local12 = this.anInt1807;
		}
		if (local6 == -1) {
			return true;
		}
		@Pc(39) boolean local39 = true;
		if (!Static46.aClass43_12.method2220(0, local6)) {
			local39 = false;
		}
		if (local9 != -1 && !Static46.aClass43_12.method2220(0, local9)) {
			local39 = false;
		}
		if (local12 != -1 && !Static46.aClass43_12.method2220(0, local12)) {
			local39 = false;
		}
		return local39;
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(IZ)Z")
	public boolean method1305(@OriginalArg(1) boolean arg0) {
		@Pc(2) int local2 = this.anInt1810;
		@Pc(9) int local9 = this.anInt1792;
		if (arg0) {
			local9 = this.anInt1787;
			local2 = this.anInt1777;
		}
		if (local2 == -1) {
			return true;
		}
		@Pc(35) boolean local35 = true;
		if (!Static46.aClass43_12.method2220(0, local2)) {
			local35 = false;
		}
		if (local9 != -1 && !Static46.aClass43_12.method2220(0, local9)) {
			local35 = false;
		}
		return local35;
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(B)Lclient!da;")
	public Class2_Sub2_Sub1_Sub2_Sub1 method1306() {
		@Pc(11) Class2_Sub2_Sub1_Sub3 local11 = Static47.method877(Static46.aClass43_12, this.anInt1803);
		if (local11 == null) {
			return null;
		}
		if (this.aShortArray58 != null) {
			for (@Pc(20) int local20 = 0; local20 < this.aShortArray58.length; local20++) {
				local11.method864(this.aShortArray58[local20], this.aShortArray59[local20]);
			}
		}
		if (this.aShortArray57 != null) {
			for (@Pc(51) int local51 = 0; local51 < this.aShortArray57.length; local51++) {
				local11.method880(this.aShortArray57[local51], this.aShortArray60[local51]);
			}
		}
		@Pc(88) Class2_Sub2_Sub1_Sub2_Sub1 local88 = local11.method867(this.anInt1771 + 64, 768 - -this.anInt1788);
		local88.aBoolean47 = true;
		if (this.anInt1770 != 128 || this.anInt1789 != 128 || this.anInt1781 != 128) {
			local88.method597(this.anInt1770, this.anInt1789, this.anInt1781);
		}
		return local88;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ZLclient!oa;)V")
	public void method1307(@OriginalArg(1) Class2_Sub18 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method2387();
			if (local3 == 0) {
				return;
			}
			this.method1298(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!i", name = "c", descriptor = "(IZ)Lclient!i;")
	public Class2_Sub2_Sub9 method1309(@OriginalArg(0) int arg0) {
		if (this.anIntArray285 != null && arg0 > 1) {
			@Pc(18) int local18 = -1;
			for (@Pc(20) int local20 = 0; local20 < 10; local20++) {
				if (arg0 >= this.anIntArray284[local20] && this.anIntArray284[local20] != 0) {
					local18 = this.anIntArray285[local20];
				}
			}
			if (local18 != -1) {
				return Static158.method2689(local18);
			}
		}
		return this;
	}
}
