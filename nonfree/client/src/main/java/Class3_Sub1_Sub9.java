import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class3_Sub1_Sub9 extends Class3_Sub1 {

	@OriginalMember(owner = "client!je", name = "ab", descriptor = "I")
	public int anInt1674;

	@OriginalMember(owner = "client!je", name = "hb", descriptor = "[I")
	public int[] anIntArray167;

	@OriginalMember(owner = "client!je", name = "Nb", descriptor = "[S")
	private short[] aShortArray13;

	@OriginalMember(owner = "client!je", name = "Rb", descriptor = "[I")
	public int[] anIntArray168;

	@OriginalMember(owner = "client!je", name = "bc", descriptor = "I")
	private int anInt1712;

	@OriginalMember(owner = "client!je", name = "dc", descriptor = "[S")
	private short[] aShortArray14;

	@OriginalMember(owner = "client!je", name = "jb", descriptor = "I")
	public int anInt1680 = 0;

	@OriginalMember(owner = "client!je", name = "vb", descriptor = "I")
	private int anInt1690 = -1;

	@OriginalMember(owner = "client!je", name = "zb", descriptor = "I")
	private int anInt1694 = -1;

	@OriginalMember(owner = "client!je", name = "mb", descriptor = "I")
	private int anInt1683 = 128;

	@OriginalMember(owner = "client!je", name = "rb", descriptor = "I")
	private int anInt1687 = -1;

	@OriginalMember(owner = "client!je", name = "ub", descriptor = "I")
	private int anInt1689 = -1;

	@OriginalMember(owner = "client!je", name = "Wb", descriptor = "Z")
	public boolean aBoolean90 = false;

	@OriginalMember(owner = "client!je", name = "lb", descriptor = "I")
	public int anInt1682 = 0;

	@OriginalMember(owner = "client!je", name = "Lb", descriptor = "Lclient!he;")
	public Class26 aClass26_857 = Static114.aClass26_1624;

	@OriginalMember(owner = "client!je", name = "Xb", descriptor = "I")
	public int anInt1708 = 0;

	@OriginalMember(owner = "client!je", name = "ac", descriptor = "I")
	private int anInt1711 = -1;

	@OriginalMember(owner = "client!je", name = "Ib", descriptor = "[Lclient!he;")
	public Class26[] aClass26Array14 = new Class26[] { null, null, null, null, Static39.aClass26_642 };

	@OriginalMember(owner = "client!je", name = "cc", descriptor = "[Lclient!he;")
	public Class26[] aClass26Array15 = new Class26[] { null, null, Static32.aClass26_516, null, null };

	@OriginalMember(owner = "client!je", name = "Gb", descriptor = "I")
	public int anInt1699 = -1;

	@OriginalMember(owner = "client!je", name = "Zb", descriptor = "I")
	private int anInt1710 = 128;

	@OriginalMember(owner = "client!je", name = "Pb", descriptor = "I")
	public int anInt1704 = 0;

	@OriginalMember(owner = "client!je", name = "wb", descriptor = "I")
	public int anInt1691 = 0;

	@OriginalMember(owner = "client!je", name = "kb", descriptor = "I")
	private int anInt1681 = -1;

	@OriginalMember(owner = "client!je", name = "Ub", descriptor = "I")
	public int anInt1706 = 0;

	@OriginalMember(owner = "client!je", name = "Db", descriptor = "I")
	public int anInt1696 = 2000;

	@OriginalMember(owner = "client!je", name = "qb", descriptor = "I")
	public int anInt1686 = 0;

	@OriginalMember(owner = "client!je", name = "sb", descriptor = "I")
	private int anInt1688 = -1;

	@OriginalMember(owner = "client!je", name = "Fb", descriptor = "I")
	private int anInt1698 = 0;

	@OriginalMember(owner = "client!je", name = "Tb", descriptor = "I")
	private int anInt1705 = -1;

	@OriginalMember(owner = "client!je", name = "fc", descriptor = "I")
	private int anInt1714 = -1;

	@OriginalMember(owner = "client!je", name = "ec", descriptor = "I")
	public int anInt1713 = 0;

	@OriginalMember(owner = "client!je", name = "Jb", descriptor = "I")
	private int anInt1701 = -1;

	@OriginalMember(owner = "client!je", name = "Eb", descriptor = "I")
	private int anInt1697 = 0;

	@OriginalMember(owner = "client!je", name = "X", descriptor = "I")
	private int anInt1671 = 128;

	@OriginalMember(owner = "client!je", name = "gc", descriptor = "I")
	public int anInt1715 = 0;

	@OriginalMember(owner = "client!je", name = "xb", descriptor = "I")
	public int anInt1692 = -1;

	@OriginalMember(owner = "client!je", name = "lc", descriptor = "I")
	public int anInt1717 = 1;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BZ)Z")
	public boolean method1123(@OriginalArg(1) boolean arg0) {
		@Pc(6) int local6 = this.anInt1690;
		@Pc(9) int local9 = this.anInt1688;
		if (arg0) {
			local9 = this.anInt1687;
			local6 = this.anInt1694;
		}
		if (local6 == -1) {
			return true;
		}
		@Pc(30) boolean local30 = true;
		if (!Static5.aClass16_150.method559(local6, 0)) {
			local30 = false;
		}
		if (local9 != -1 && !Static5.aClass16_150.method559(local9, 0)) {
			local30 = false;
		}
		return local30;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IZ)Z")
	public boolean method1124(@OriginalArg(1) boolean arg0) {
		@Pc(6) int local6 = this.anInt1701;
		@Pc(9) int local9 = this.anInt1681;
		@Pc(12) int local12 = this.anInt1711;
		if (arg0) {
			local12 = this.anInt1689;
			local6 = this.anInt1705;
			local9 = this.anInt1714;
		}
		if (local9 == -1) {
			return true;
		}
		@Pc(30) boolean local30 = true;
		if (!Static5.aClass16_150.method559(local9, 0)) {
			local30 = false;
		}
		if (local12 != -1 && !Static5.aClass16_150.method559(local12, 0)) {
			local30 = false;
		}
		if (local6 != -1 && !Static5.aClass16_150.method559(local6, 0)) {
			local30 = false;
		}
		return local30;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(II)Lclient!oa;")
	public Class3_Sub1_Sub5_Sub7 method1125(@OriginalArg(1) int arg0) {
		if (this.anIntArray167 != null && arg0 > 1) {
			@Pc(15) int local15 = -1;
			for (@Pc(17) int local17 = 0; local17 < 10; local17++) {
				if (this.anIntArray168[local17] <= arg0 && this.anIntArray168[local17] != 0) {
					local15 = this.anIntArray167[local17];
				}
			}
			if (local15 != -1) {
				return Static117.method2099(local15).method1125(1);
			}
		}
		@Pc(60) Class3_Sub1_Sub5_Sub7 local60 = (Class3_Sub1_Sub5_Sub7) Static40.aClass66_12.method1970((long) this.anInt1674);
		if (local60 != null) {
			return local60;
		}
		@Pc(70) Class3_Sub1_Sub5_Sub2 local70 = Static34.method676(Static5.aClass16_150, this.anInt1712);
		if (local70 == null) {
			return null;
		}
		if (this.anInt1710 != 128 || this.anInt1683 != 128 || this.anInt1671 != 128) {
			local70.method683(this.anInt1710, this.anInt1683, this.anInt1671);
		}
		if (this.aShortArray13 != null) {
			for (@Pc(107) int local107 = 0; local107 < this.aShortArray13.length; local107++) {
				local70.method693(this.aShortArray13[local107], this.aShortArray14[local107]);
			}
		}
		local60 = local70.method688(this.anInt1686 + 64, this.anInt1680 + 768, -50, -10, -50);
		local60.aBoolean130 = true;
		Static40.aClass66_12.method1969((long) this.anInt1674, local60);
		return local60;
	}

	@OriginalMember(owner = "client!je", name = "e", descriptor = "(I)V")
	public void method1127() {
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BLclient!m;I)V")
	private void method1129(@OriginalArg(1) Class3_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1712 = arg0.method974();
		} else if (arg1 == 2) {
			this.aClass26_857 = arg0.method977();
		} else if (arg1 == 4) {
			this.anInt1696 = arg0.method974();
		} else if (arg1 == 5) {
			this.anInt1708 = arg0.method974();
		} else if (arg1 == 6) {
			this.anInt1704 = arg0.method974();
		} else if (arg1 == 7) {
			this.anInt1682 = arg0.method974();
			if (this.anInt1682 > 32767) {
				this.anInt1682 -= 65536;
				return;
			}
		} else if (arg1 == 8) {
			this.anInt1713 = arg0.method974();
			if (this.anInt1713 > 32767) {
				this.anInt1713 -= 65536;
				return;
			}
		} else if (arg1 == 11) {
			this.anInt1715 = 1;
			return;
		} else if (arg1 == 12) {
			this.anInt1717 = arg0.method984();
		} else if (arg1 == 16) {
			this.aBoolean90 = true;
			return;
		} else if (arg1 == 23) {
			this.anInt1681 = arg0.method974();
			this.anInt1698 = arg0.method981();
			return;
		} else if (arg1 == 24) {
			this.anInt1711 = arg0.method974();
			return;
		} else {
			if (arg1 == 25) {
				this.anInt1714 = arg0.method974();
				this.anInt1697 = arg0.method981();
			} else if (arg1 == 26) {
				this.anInt1689 = arg0.method974();
				return;
			} else if (arg1 >= 30 && arg1 < 35) {
				this.aClass26Array15[arg1 - 30] = arg0.method977();
				if (this.aClass26Array15[arg1 - 30].method832(Static49.aClass26_787)) {
					this.aClass26Array15[arg1 - 30] = null;
					return;
				}
			} else if (arg1 < 35 || arg1 >= 40) {
				if (arg1 != 40) {
					if (arg1 != 78) {
						if (arg1 == 79) {
							this.anInt1705 = arg0.method974();
							return;
						}
						if (arg1 == 90) {
							this.anInt1690 = arg0.method974();
							return;
						}
						if (arg1 == 91) {
							this.anInt1694 = arg0.method974();
							return;
						}
						if (arg1 != 92) {
							if (arg1 != 93) {
								if (arg1 == 95) {
									this.anInt1691 = arg0.method974();
									return;
								}
								if (arg1 == 97) {
									this.anInt1692 = arg0.method974();
									return;
								}
								if (arg1 != 98) {
									if (arg1 >= 100 && arg1 < 110) {
										if (this.anIntArray167 == null) {
											this.anIntArray167 = new int[10];
											this.anIntArray168 = new int[10];
										}
										this.anIntArray167[arg1 - 100] = arg0.method974();
										this.anIntArray168[arg1 - 100] = arg0.method974();
										return;
									}
									if (arg1 != 110) {
										if (arg1 == 111) {
											this.anInt1683 = arg0.method974();
											return;
										}
										if (arg1 != 112) {
											if (arg1 == 113) {
												this.anInt1686 = arg0.method994();
												return;
											}
											if (arg1 == 114) {
												this.anInt1680 = arg0.method994() * 5;
											} else if (arg1 == 115) {
												this.anInt1706 = arg0.method981();
												return;
											}
											return;
										}
										this.anInt1671 = arg0.method974();
										return;
									}
									this.anInt1710 = arg0.method974();
									return;
								}
								this.anInt1699 = arg0.method974();
								return;
							}
							this.anInt1687 = arg0.method974();
							return;
						}
						this.anInt1688 = arg0.method974();
						return;
					}
					this.anInt1701 = arg0.method974();
					return;
				}
				@Pc(362) int local362 = arg0.method981();
				this.aShortArray13 = new short[local362];
				this.aShortArray14 = new short[local362];
				for (@Pc(372) int local372 = 0; local372 < local362; local372++) {
					this.aShortArray13[local372] = (short) arg0.method974();
					this.aShortArray14[local372] = (short) arg0.method974();
				}
				return;
			} else {
				this.aClass26Array14[arg1 - 35] = arg0.method977();
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ILclient!m;)V")
	public void method1130(@OriginalArg(1) Class3_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method981();
			if (local5 == 0) {
				return;
			}
			this.method1129(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(ZI)Lclient!fe;")
	public Class3_Sub1_Sub5_Sub2 method1132(@OriginalArg(0) boolean arg0) {
		@Pc(8) int local8 = this.anInt1690;
		@Pc(11) int local11 = this.anInt1688;
		if (arg0) {
			local11 = this.anInt1687;
			local8 = this.anInt1694;
		}
		if (local8 == -1) {
			return null;
		}
		@Pc(31) Class3_Sub1_Sub5_Sub2 local31 = Static34.method676(Static5.aClass16_150, local8);
		if (local11 != -1) {
			@Pc(39) Class3_Sub1_Sub5_Sub2 local39 = Static34.method676(Static5.aClass16_150, local11);
			@Pc(50) Class3_Sub1_Sub5_Sub2[] local50 = new Class3_Sub1_Sub5_Sub2[] { local31, local39 };
			local31 = new Class3_Sub1_Sub5_Sub2(local50, 2);
		}
		if (this.aShortArray13 != null) {
			for (@Pc(61) int local61 = 0; local61 < this.aShortArray13.length; local61++) {
				local31.method693(this.aShortArray13[local61], this.aShortArray14[local61]);
			}
		}
		return local31;
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(II)Lclient!je;")
	public Class3_Sub1_Sub9 method1133(@OriginalArg(1) int arg0) {
		if (this.anIntArray167 != null && arg0 > 1) {
			@Pc(18) int local18 = -1;
			for (@Pc(20) int local20 = 0; local20 < 10; local20++) {
				if (this.anIntArray168[local20] <= arg0 && this.anIntArray168[local20] != 0) {
					local18 = this.anIntArray167[local20];
				}
			}
			if (local18 != -1) {
				return Static117.method2099(local18);
			}
		}
		return this;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ILclient!je;Lclient!je;)V")
	public void method1136(@OriginalArg(1) Class3_Sub1_Sub9 arg0, @OriginalArg(2) Class3_Sub1_Sub9 arg1) {
		this.aBoolean90 = arg0.aBoolean90;
		this.anInt1691 = arg1.anInt1691;
		this.anInt1717 = arg0.anInt1717;
		this.anInt1696 = arg1.anInt1696;
		this.aShortArray14 = arg1.aShortArray14;
		this.anInt1712 = arg1.anInt1712;
		this.anInt1682 = arg1.anInt1682;
		this.anInt1715 = 1;
		this.anInt1708 = arg1.anInt1708;
		this.anInt1713 = arg1.anInt1713;
		this.aClass26_857 = arg0.aClass26_857;
		this.aShortArray13 = arg1.aShortArray13;
		this.anInt1704 = arg1.anInt1704;
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(ZI)Lclient!fe;")
	public Class3_Sub1_Sub5_Sub2 method1137(@OriginalArg(0) boolean arg0) {
		@Pc(4) int local4 = this.anInt1681;
		@Pc(7) int local7 = this.anInt1711;
		@Pc(10) int local10 = this.anInt1701;
		if (arg0) {
			local10 = this.anInt1705;
			local7 = this.anInt1689;
			local4 = this.anInt1714;
		}
		if (local4 == -1) {
			return null;
		}
		@Pc(36) Class3_Sub1_Sub5_Sub2 local36 = Static34.method676(Static5.aClass16_150, local4);
		if (local7 != -1) {
			@Pc(45) Class3_Sub1_Sub5_Sub2 local45 = Static34.method676(Static5.aClass16_150, local7);
			if (local10 == -1) {
				@Pc(88) Class3_Sub1_Sub5_Sub2[] local88 = new Class3_Sub1_Sub5_Sub2[] { local36, local45 };
				local36 = new Class3_Sub1_Sub5_Sub2(local88, 2);
			} else {
				@Pc(54) Class3_Sub1_Sub5_Sub2 local54 = Static34.method676(Static5.aClass16_150, local10);
				@Pc(69) Class3_Sub1_Sub5_Sub2[] local69 = new Class3_Sub1_Sub5_Sub2[] { local36, local45, local54 };
				local36 = new Class3_Sub1_Sub5_Sub2(local69, 3);
			}
		}
		if (!arg0 && this.anInt1698 != 0) {
			local36.method687(0, this.anInt1698, 0);
		}
		if (arg0 && this.anInt1697 != 0) {
			local36.method687(0, this.anInt1697, 0);
		}
		if (this.aShortArray13 != null) {
			for (@Pc(124) int local124 = 0; local124 < this.aShortArray13.length; local124++) {
				local36.method693(this.aShortArray13[local124], this.aShortArray14[local124]);
			}
		}
		return local36;
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(II)Lclient!fe;")
	public Class3_Sub1_Sub5_Sub2 method1138(@OriginalArg(1) int arg0) {
		@Pc(21) int local21;
		if (this.anIntArray167 != null && arg0 > 1) {
			@Pc(19) int local19 = -1;
			for (local21 = 0; local21 < 10; local21++) {
				if (this.anIntArray168[local21] <= arg0 && this.anIntArray168[local21] != 0) {
					local19 = this.anIntArray167[local21];
				}
			}
			if (local19 != -1) {
				return Static117.method2099(local19).method1138(1);
			}
		}
		@Pc(67) Class3_Sub1_Sub5_Sub2 local67 = Static34.method676(Static5.aClass16_150, this.anInt1712);
		if (local67 == null) {
			return null;
		}
		if (this.anInt1710 != 128 || this.anInt1683 != 128 || this.anInt1671 != 128) {
			local67.method683(this.anInt1710, this.anInt1683, this.anInt1671);
		}
		if (this.aShortArray13 != null) {
			for (local21 = 0; local21 < this.aShortArray13.length; local21++) {
				local67.method693(this.aShortArray13[local21], this.aShortArray14[local21]);
			}
		}
		return local67;
	}
}
