import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class4_Sub3_Sub16 extends Class4_Sub3 {

	@OriginalMember(owner = "client!wb", name = "K", descriptor = "[S")
	private short[] aShortArray36;

	@OriginalMember(owner = "client!wb", name = "U", descriptor = "[I")
	public int[] anIntArray343;

	@OriginalMember(owner = "client!wb", name = "V", descriptor = "I")
	public int anInt2871;

	@OriginalMember(owner = "client!wb", name = "cb", descriptor = "[S")
	private short[] aShortArray37;

	@OriginalMember(owner = "client!wb", name = "ib", descriptor = "[I")
	public int[] anIntArray344;

	@OriginalMember(owner = "client!wb", name = "ob", descriptor = "[S")
	private short[] aShortArray38;

	@OriginalMember(owner = "client!wb", name = "Ab", descriptor = "[S")
	private short[] aShortArray39;

	@OriginalMember(owner = "client!wb", name = "Hb", descriptor = "I")
	private int anInt2899;

	@OriginalMember(owner = "client!wb", name = "J", descriptor = "I")
	public int anInt2863 = -1;

	@OriginalMember(owner = "client!wb", name = "H", descriptor = "I")
	private int anInt2862 = -1;

	@OriginalMember(owner = "client!wb", name = "Q", descriptor = "I")
	public int anInt2868 = 1;

	@OriginalMember(owner = "client!wb", name = "P", descriptor = "[Lclient!od;")
	public Class60[] aClass60Array21 = new Class60[] { null, null, Static4.aClass60_26, null, null };

	@OriginalMember(owner = "client!wb", name = "gb", descriptor = "[Lclient!od;")
	public Class60[] aClass60Array22 = new Class60[] { null, null, null, null, Static76.aClass60_768 };

	@OriginalMember(owner = "client!wb", name = "X", descriptor = "I")
	private int anInt2873 = -1;

	@OriginalMember(owner = "client!wb", name = "lb", descriptor = "I")
	private int anInt2882 = -1;

	@OriginalMember(owner = "client!wb", name = "N", descriptor = "I")
	public int anInt2866 = 0;

	@OriginalMember(owner = "client!wb", name = "bb", descriptor = "I")
	private int anInt2876 = 128;

	@OriginalMember(owner = "client!wb", name = "T", descriptor = "I")
	private int anInt2870 = 128;

	@OriginalMember(owner = "client!wb", name = "ub", descriptor = "I")
	private int anInt2890 = -1;

	@OriginalMember(owner = "client!wb", name = "Z", descriptor = "I")
	public int anInt2875 = 2000;

	@OriginalMember(owner = "client!wb", name = "fb", descriptor = "I")
	private int anInt2878 = -1;

	@OriginalMember(owner = "client!wb", name = "pb", descriptor = "I")
	private int anInt2885 = -1;

	@OriginalMember(owner = "client!wb", name = "qb", descriptor = "I")
	private int anInt2886 = 128;

	@OriginalMember(owner = "client!wb", name = "M", descriptor = "I")
	public int anInt2865 = 0;

	@OriginalMember(owner = "client!wb", name = "sb", descriptor = "I")
	public int anInt2888 = 0;

	@OriginalMember(owner = "client!wb", name = "Eb", descriptor = "I")
	private int anInt2897 = 0;

	@OriginalMember(owner = "client!wb", name = "mb", descriptor = "I")
	public int anInt2883 = 0;

	@OriginalMember(owner = "client!wb", name = "Mb", descriptor = "I")
	public int anInt2902 = -1;

	@OriginalMember(owner = "client!wb", name = "Ib", descriptor = "I")
	public int anInt2900 = 0;

	@OriginalMember(owner = "client!wb", name = "Kb", descriptor = "Lclient!od;")
	public Class60 aClass60_1128 = Static42.aClass60_409;

	@OriginalMember(owner = "client!wb", name = "Cb", descriptor = "I")
	private int anInt2895 = -1;

	@OriginalMember(owner = "client!wb", name = "yb", descriptor = "Z")
	public boolean aBoolean125 = false;

	@OriginalMember(owner = "client!wb", name = "Ob", descriptor = "I")
	private int anInt2904 = -1;

	@OriginalMember(owner = "client!wb", name = "wb", descriptor = "I")
	public int anInt2891 = 0;

	@OriginalMember(owner = "client!wb", name = "tb", descriptor = "I")
	private int anInt2889 = 0;

	@OriginalMember(owner = "client!wb", name = "jb", descriptor = "I")
	private int anInt2880 = -1;

	@OriginalMember(owner = "client!wb", name = "eb", descriptor = "I")
	public int anInt2877 = 0;

	@OriginalMember(owner = "client!wb", name = "Rb", descriptor = "I")
	public int anInt2907 = 0;

	@OriginalMember(owner = "client!wb", name = "Sb", descriptor = "I")
	public int anInt2908 = 0;

	@OriginalMember(owner = "client!wb", name = "Tb", descriptor = "I")
	private int anInt2909 = -1;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)Lclient!pf;")
	public Class4_Sub3_Sub1_Sub5 method1957(@OriginalArg(0) int arg0) {
		@Pc(17) int local17;
		if (this.anIntArray344 != null && arg0 > 1) {
			@Pc(15) int local15 = -1;
			for (local17 = 0; local17 < 10; local17++) {
				if (this.anIntArray343[local17] <= arg0 && this.anIntArray343[local17] != 0) {
					local15 = this.anIntArray344[local17];
				}
			}
			if (local15 != -1) {
				return Static112.method1854(local15).method1957(1);
			}
		}
		@Pc(58) Class4_Sub3_Sub1_Sub5 local58 = Static89.method1445(Static29.aClass10_11, this.anInt2899);
		if (local58 == null) {
			return null;
		}
		if (this.anInt2886 != 128 || this.anInt2876 != 128 || this.anInt2870 != 128) {
			local58.method1442(this.anInt2886, this.anInt2876, this.anInt2870);
		}
		if (this.aShortArray36 != null) {
			for (local17 = 0; local17 < this.aShortArray36.length; local17++) {
				local58.method1433(this.aShortArray36[local17], this.aShortArray37[local17]);
			}
		}
		if (this.aShortArray39 != null) {
			for (local17 = 0; local17 < this.aShortArray39.length; local17++) {
				local58.method1439(this.aShortArray39[local17], this.aShortArray38[local17]);
			}
		}
		return local58;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!tf;I)V")
	public void method1959(@OriginalArg(0) Class4_Sub9 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method773();
			if (local9 == 0) {
				return;
			}
			this.method1960(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZILclient!tf;)V")
	private void method1960(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 1) {
			this.anInt2899 = arg1.method816();
		} else if (arg0 == 2) {
			this.aClass60_1128 = arg1.method776();
		} else if (arg0 == 4) {
			this.anInt2875 = arg1.method816();
		} else if (arg0 == 5) {
			this.anInt2907 = arg1.method816();
		} else if (arg0 == 6) {
			this.anInt2883 = arg1.method816();
		} else if (arg0 == 7) {
			this.anInt2888 = arg1.method816();
			if (this.anInt2888 > 32767) {
				this.anInt2888 -= 65536;
				return;
			}
		} else if (arg0 == 8) {
			this.anInt2891 = arg1.method816();
			if (this.anInt2891 > 32767) {
				this.anInt2891 -= 65536;
				return;
			}
		} else if (arg0 == 11) {
			this.anInt2866 = 1;
			return;
		} else if (arg0 == 12) {
			this.anInt2868 = arg1.method780();
		} else if (arg0 == 16) {
			this.aBoolean125 = true;
			return;
		} else {
			if (arg0 == 23) {
				this.anInt2909 = arg1.method816();
				this.anInt2897 = arg1.method773();
			} else if (arg0 == 24) {
				this.anInt2904 = arg1.method816();
				return;
			} else if (arg0 == 25) {
				this.anInt2878 = arg1.method816();
				this.anInt2889 = arg1.method773();
				return;
			} else if (arg0 == 26) {
				this.anInt2895 = arg1.method816();
				return;
			} else if (arg0 >= 30 && arg0 < 35) {
				this.aClass60Array21[arg0 - 30] = arg1.method776();
				if (this.aClass60Array21[arg0 - 30].method1318(Static98.aClass60_929)) {
					this.aClass60Array21[arg0 - 30] = null;
					return;
				}
			} else if (arg0 < 35 || arg0 >= 40) {
				@Pc(184) int local184;
				@Pc(194) int local194;
				if (arg0 == 40) {
					local184 = arg1.method773();
					this.aShortArray36 = new short[local184];
					this.aShortArray37 = new short[local184];
					for (local194 = 0; local194 < local184; local194++) {
						this.aShortArray36[local194] = (short) arg1.method816();
						this.aShortArray37[local194] = (short) arg1.method816();
					}
					return;
				}
				if (arg0 != 41) {
					if (arg0 == 78) {
						this.anInt2882 = arg1.method816();
						return;
					}
					if (arg0 == 79) {
						this.anInt2862 = arg1.method816();
						return;
					}
					if (arg0 == 90) {
						this.anInt2890 = arg1.method816();
						return;
					}
					if (arg0 == 91) {
						this.anInt2880 = arg1.method816();
						return;
					}
					if (arg0 == 92) {
						this.anInt2885 = arg1.method816();
						return;
					}
					if (arg0 == 93) {
						this.anInt2873 = arg1.method816();
						return;
					}
					if (arg0 != 95) {
						if (arg0 != 97) {
							if (arg0 != 98) {
								if (arg0 >= 100 && arg0 < 110) {
									if (this.anIntArray344 == null) {
										this.anIntArray343 = new int[10];
										this.anIntArray344 = new int[10];
									}
									this.anIntArray344[arg0 - 100] = arg1.method816();
									this.anIntArray343[arg0 - 100] = arg1.method816();
									return;
								}
								if (arg0 != 110) {
									if (arg0 != 111) {
										if (arg0 == 112) {
											this.anInt2870 = arg1.method816();
										} else if (arg0 == 113) {
											this.anInt2908 = arg1.method797();
											return;
										} else if (arg0 == 114) {
											this.anInt2900 = arg1.method797() * 5;
											return;
										} else if (arg0 == 115) {
											this.anInt2865 = arg1.method773();
											return;
										}
										return;
									}
									this.anInt2876 = arg1.method816();
									return;
								}
								this.anInt2886 = arg1.method816();
								return;
							}
							this.anInt2863 = arg1.method816();
							return;
						}
						this.anInt2902 = arg1.method816();
						return;
					}
					this.anInt2877 = arg1.method816();
					return;
				}
				local184 = arg1.method773();
				this.aShortArray38 = new short[local184];
				this.aShortArray39 = new short[local184];
				for (local194 = 0; local194 < local184; local194++) {
					this.aShortArray39[local194] = (short) arg1.method816();
					this.aShortArray38[local194] = (short) arg1.method816();
				}
				return;
			} else {
				this.aClass60Array22[arg0 - 35] = arg1.method776();
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(BI)Lclient!wb;")
	public Class4_Sub3_Sub16 method1962(@OriginalArg(1) int arg0) {
		if (this.anIntArray344 != null && arg0 > 1) {
			@Pc(15) int local15 = -1;
			for (@Pc(17) int local17 = 0; local17 < 10; local17++) {
				if (arg0 >= this.anIntArray343[local17] && this.anIntArray343[local17] != 0) {
					local15 = this.anIntArray344[local17];
				}
			}
			if (local15 != -1) {
				return Static112.method1854(local15);
			}
		}
		return this;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(BZ)Z")
	public boolean method1963(@OriginalArg(1) boolean arg0) {
		@Pc(6) int local6 = this.anInt2909;
		@Pc(9) int local9 = this.anInt2904;
		@Pc(12) int local12 = this.anInt2882;
		if (arg0) {
			local6 = this.anInt2878;
			local9 = this.anInt2895;
			local12 = this.anInt2862;
		}
		if (local6 == -1) {
			return true;
		}
		@Pc(38) boolean local38 = true;
		if (!Static29.aClass10_11.method1778(local6, 0)) {
			local38 = false;
		}
		if (local9 != -1 && !Static29.aClass10_11.method1778(local9, 0)) {
			local38 = false;
		}
		if (local12 != -1 && !Static29.aClass10_11.method1778(local12, 0)) {
			local38 = false;
		}
		return local38;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IB)Lclient!qb;")
	public Class4_Sub3_Sub1_Sub7 method1964(@OriginalArg(0) int arg0) {
		if (this.anIntArray344 != null && arg0 > 1) {
			@Pc(13) int local13 = -1;
			for (@Pc(15) int local15 = 0; local15 < 10; local15++) {
				if (this.anIntArray343[local15] <= arg0 && this.anIntArray343[local15] != 0) {
					local13 = this.anIntArray344[local15];
				}
			}
			if (local13 != -1) {
				return Static112.method1854(local13).method1964(1);
			}
		}
		@Pc(62) Class4_Sub3_Sub1_Sub7 local62 = (Class4_Sub3_Sub1_Sub7) Static91.aClass12_19.method289((long) this.anInt2871);
		if (local62 != null) {
			return local62;
		}
		@Pc(80) Class4_Sub3_Sub1_Sub5 local80 = Static89.method1445(Static29.aClass10_11, this.anInt2899);
		if (local80 == null) {
			return null;
		}
		if (this.anInt2886 != 128 || this.anInt2876 != 128 || this.anInt2870 != 128) {
			local80.method1442(this.anInt2886, this.anInt2876, this.anInt2870);
		}
		@Pc(109) int local109;
		if (this.aShortArray36 != null) {
			for (local109 = 0; local109 < this.aShortArray36.length; local109++) {
				local80.method1433(this.aShortArray36[local109], this.aShortArray37[local109]);
			}
		}
		if (this.aShortArray39 != null) {
			for (local109 = 0; local109 < this.aShortArray39.length; local109++) {
				local80.method1439(this.aShortArray39[local109], this.aShortArray38[local109]);
			}
		}
		local62 = local80.method1444(this.anInt2908 + 64, this.anInt2900 + 768, -50, -10, -50);
		local62.aBoolean76 = true;
		Static91.aClass12_19.method290(local62, (long) this.anInt2871);
		return local62;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZI)Lclient!pf;")
	public Class4_Sub3_Sub1_Sub5 method1965(@OriginalArg(0) boolean arg0) {
		@Pc(8) int local8 = this.anInt2890;
		@Pc(11) int local11 = this.anInt2885;
		if (arg0) {
			local11 = this.anInt2873;
			local8 = this.anInt2880;
		}
		if (local8 == -1) {
			return null;
		}
		@Pc(31) Class4_Sub3_Sub1_Sub5 local31 = Static89.method1445(Static29.aClass10_11, local8);
		if (local11 != -1) {
			@Pc(39) Class4_Sub3_Sub1_Sub5 local39 = Static89.method1445(Static29.aClass10_11, local11);
			@Pc(50) Class4_Sub3_Sub1_Sub5[] local50 = new Class4_Sub3_Sub1_Sub5[] { local31, local39 };
			local31 = new Class4_Sub3_Sub1_Sub5(local50, 2);
		}
		@Pc(61) int local61;
		if (this.aShortArray36 != null) {
			for (local61 = 0; local61 < this.aShortArray36.length; local61++) {
				local31.method1433(this.aShortArray36[local61], this.aShortArray37[local61]);
			}
		}
		if (this.aShortArray39 != null) {
			for (local61 = 0; local61 < this.aShortArray39.length; local61++) {
				local31.method1439(this.aShortArray39[local61], this.aShortArray38[local61]);
			}
		}
		return local31;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!wb;ZLclient!wb;)V")
	public void method1966(@OriginalArg(0) Class4_Sub3_Sub16 arg0, @OriginalArg(2) Class4_Sub3_Sub16 arg1) {
		this.aBoolean125 = arg0.aBoolean125;
		this.anInt2877 = arg1.anInt2877;
		this.aClass60_1128 = arg0.aClass60_1128;
		this.aShortArray36 = arg1.aShortArray36;
		this.aShortArray39 = arg1.aShortArray39;
		this.anInt2883 = arg1.anInt2883;
		this.aShortArray37 = arg1.aShortArray37;
		this.anInt2875 = arg1.anInt2875;
		this.aShortArray38 = arg1.aShortArray38;
		this.anInt2899 = arg1.anInt2899;
		this.anInt2891 = arg1.anInt2891;
		this.anInt2907 = arg1.anInt2907;
		this.anInt2866 = 1;
		this.anInt2868 = arg0.anInt2868;
		this.anInt2888 = arg1.anInt2888;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(ZI)Lclient!pf;")
	public Class4_Sub3_Sub1_Sub5 method1967(@OriginalArg(0) boolean arg0) {
		@Pc(8) int local8 = this.anInt2909;
		@Pc(11) int local11 = this.anInt2904;
		@Pc(20) int local20 = this.anInt2882;
		if (arg0) {
			local20 = this.anInt2862;
			local8 = this.anInt2878;
			local11 = this.anInt2895;
		}
		if (local8 == -1) {
			return null;
		}
		@Pc(42) Class4_Sub3_Sub1_Sub5 local42 = Static89.method1445(Static29.aClass10_11, local8);
		if (local11 != -1) {
			@Pc(50) Class4_Sub3_Sub1_Sub5 local50 = Static89.method1445(Static29.aClass10_11, local11);
			if (local20 == -1) {
				@Pc(64) Class4_Sub3_Sub1_Sub5[] local64 = new Class4_Sub3_Sub1_Sub5[] { local42, local50 };
				local42 = new Class4_Sub3_Sub1_Sub5(local64, 2);
			} else {
				@Pc(77) Class4_Sub3_Sub1_Sub5 local77 = Static89.method1445(Static29.aClass10_11, local20);
				@Pc(92) Class4_Sub3_Sub1_Sub5[] local92 = new Class4_Sub3_Sub1_Sub5[] { local42, local50, local77 };
				local42 = new Class4_Sub3_Sub1_Sub5(local92, 3);
			}
		}
		if (!arg0 && this.anInt2897 != 0) {
			local42.method1438(0, this.anInt2897, 0);
		}
		if (arg0 && this.anInt2889 != 0) {
			local42.method1438(0, this.anInt2889, 0);
		}
		@Pc(131) int local131;
		if (this.aShortArray36 != null) {
			for (local131 = 0; local131 < this.aShortArray36.length; local131++) {
				local42.method1433(this.aShortArray36[local131], this.aShortArray37[local131]);
			}
		}
		if (this.aShortArray39 != null) {
			for (local131 = 0; local131 < this.aShortArray39.length; local131++) {
				local42.method1439(this.aShortArray39[local131], this.aShortArray38[local131]);
			}
		}
		return local42;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(B)V")
	public void method1970() {
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(BZ)Z")
	public boolean method1972(@OriginalArg(1) boolean arg0) {
		@Pc(6) int local6 = this.anInt2890;
		@Pc(9) int local9 = this.anInt2885;
		if (arg0) {
			local6 = this.anInt2880;
			local9 = this.anInt2873;
		}
		if (local6 == -1) {
			return true;
		}
		@Pc(30) boolean local30 = true;
		if (!Static29.aClass10_11.method1778(local6, 0)) {
			local30 = false;
		}
		if (local9 != -1 && !Static29.aClass10_11.method1778(local9, 0)) {
			local30 = false;
		}
		return local30;
	}
}
