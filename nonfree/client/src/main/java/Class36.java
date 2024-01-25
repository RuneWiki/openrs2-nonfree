import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bq")
public final class Class36 {

	@OriginalMember(owner = "client!bq", name = "g", descriptor = "I")
	public int anInt1740;

	@OriginalMember(owner = "client!bq", name = "h", descriptor = "I")
	private int anInt1741;

	@OriginalMember(owner = "client!bq", name = "i", descriptor = "I")
	public int anInt1742;

	@OriginalMember(owner = "client!bq", name = "j", descriptor = "[B")
	public byte[] aByteArray8;

	@OriginalMember(owner = "client!bq", name = "m", descriptor = "Ljava/lang/String;")
	public String aString8;

	@OriginalMember(owner = "client!bq", name = "n", descriptor = "Lclient!up;")
	public Class345 aClass345_1;

	@OriginalMember(owner = "client!bq", name = "o", descriptor = "[I")
	public int[] anIntArray48;

	@OriginalMember(owner = "client!bq", name = "p", descriptor = "I")
	public int anInt1744;

	@OriginalMember(owner = "client!bq", name = "q", descriptor = "I")
	private int anInt1745;

	@OriginalMember(owner = "client!bq", name = "t", descriptor = "I")
	public int anInt1747;

	@OriginalMember(owner = "client!bq", name = "F", descriptor = "I")
	public int anInt1758;

	@OriginalMember(owner = "client!bq", name = "H", descriptor = "I")
	private int anInt1760;

	@OriginalMember(owner = "client!bq", name = "I", descriptor = "I")
	public int anInt1761;

	@OriginalMember(owner = "client!bq", name = "L", descriptor = "I")
	private int anInt1764;

	@OriginalMember(owner = "client!bq", name = "O", descriptor = "Lclient!wr;")
	private Class380 aClass380_1;

	@OriginalMember(owner = "client!bq", name = "P", descriptor = "I")
	public int anInt1767;

	@OriginalMember(owner = "client!bq", name = "W", descriptor = "Ljava/lang/String;")
	public String aString9;

	@OriginalMember(owner = "client!bq", name = "Y", descriptor = "[I")
	public int[] anIntArray49;

	@OriginalMember(owner = "client!bq", name = "u", descriptor = "I")
	private int anInt1748 = -1;

	@OriginalMember(owner = "client!bq", name = "z", descriptor = "I")
	public int anInt1752 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!bq", name = "B", descriptor = "I")
	public int anInt1754 = -1;

	@OriginalMember(owner = "client!bq", name = "A", descriptor = "I")
	public int anInt1753 = -1;

	@OriginalMember(owner = "client!bq", name = "e", descriptor = "I")
	public int anInt1738 = -1;

	@OriginalMember(owner = "client!bq", name = "E", descriptor = "I")
	public int anInt1757 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!bq", name = "y", descriptor = "I")
	private int anInt1751 = -1;

	@OriginalMember(owner = "client!bq", name = "l", descriptor = "I")
	private int anInt1743 = -1;

	@OriginalMember(owner = "client!bq", name = "C", descriptor = "I")
	public int anInt1755 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!bq", name = "s", descriptor = "I")
	public int anInt1746 = -1;

	@OriginalMember(owner = "client!bq", name = "f", descriptor = "I")
	public int anInt1739 = -1;

	@OriginalMember(owner = "client!bq", name = "k", descriptor = "Z")
	public boolean aBoolean139 = false;

	@OriginalMember(owner = "client!bq", name = "U", descriptor = "Z")
	public boolean aBoolean142 = true;

	@OriginalMember(owner = "client!bq", name = "R", descriptor = "Z")
	public boolean aBoolean141 = true;

	@OriginalMember(owner = "client!bq", name = "K", descriptor = "I")
	public int anInt1763 = -1;

	@OriginalMember(owner = "client!bq", name = "S", descriptor = "I")
	private int anInt1769 = -1;

	@OriginalMember(owner = "client!bq", name = "w", descriptor = "Z")
	public boolean aBoolean140 = true;

	@OriginalMember(owner = "client!bq", name = "T", descriptor = "I")
	private int anInt1770 = -1;

	@OriginalMember(owner = "client!bq", name = "V", descriptor = "I")
	public int anInt1771 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!bq", name = "X", descriptor = "I")
	public int anInt1772 = 0;

	@OriginalMember(owner = "client!bq", name = "G", descriptor = "I")
	public int anInt1759 = -1;

	@OriginalMember(owner = "client!bq", name = "r", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray4 = new String[5];

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(ILclient!cj;)Z")
	public boolean method1623(@OriginalArg(1) Interface6 arg0) {
		@Pc(22) int local22;
		if (this.anInt1770 == -1) {
			if (this.anInt1769 == -1) {
				return true;
			}
			local22 = arg0.method4851(this.anInt1769);
		} else {
			local22 = arg0.method4850(this.anInt1770);
		}
		if (local22 < this.anInt1760 || this.anInt1741 < local22) {
			return false;
		}
		@Pc(66) int local66;
		if (this.anInt1751 == -1) {
			if (this.anInt1748 == -1) {
				return true;
			}
			local66 = arg0.method4851(this.anInt1748);
		} else {
			local66 = arg0.method4850(this.anInt1751);
		}
		return local66 >= this.anInt1764 && local66 <= this.anInt1745;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(III)I")
	public int method1624(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass380_1 == null) {
			return arg1;
		} else {
			@Pc(25) Class6_Sub37 local25 = (Class6_Sub37) this.aClass380_1.method8747((long) arg0);
			return local25 == null ? arg1 : local25.anInt7833;
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!ha;B)Lclient!ufa;")
	public Class4 method1625(@OriginalArg(0) Class5 arg0) {
		@Pc(20) Class4 local20 = (Class4) this.aClass345_1.aClass94_64.method2960((long) (this.anInt1743 | 0x20000 | arg0.anInt7303 << 29));
		if (local20 != null) {
			return local20;
		}
		this.aClass345_1.aClass223_136.method5951(this.anInt1743);
		@Pc(40) Class331 local40 = Static655.method7892(this.aClass345_1.aClass223_136, this.anInt1743, 0);
		if (local40 != null) {
			local20 = arg0.method6121(local40, true);
			this.aClass345_1.aClass94_64.method2963((long) (this.anInt1743 | 0x20000 | arg0.anInt7303 << 29), local20);
		}
		return local20;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(BLclient!ha;Z)Lclient!ufa;")
	public Class4 method1626(@OriginalArg(1) Class5 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(11) int local11 = arg1 ? this.anInt1739 : this.anInt1753;
		@Pc(18) int local18 = arg0.anInt7303 << 29 | local11;
		@Pc(35) Class4 local35 = (Class4) this.aClass345_1.aClass94_64.method2960((long) local18);
		if (local35 != null) {
			return local35;
		} else if (this.aClass345_1.aClass223_136.method5951(local11)) {
			@Pc(55) Class331 local55 = Static655.method7892(this.aClass345_1.aClass223_136, local11, 0);
			if (local55 != null) {
				local35 = arg0.method6121(local55, true);
				this.aClass345_1.aClass94_64.method2963((long) local18, local35);
			}
			return local35;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IILclient!ji;)V")
	private void method1627(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt1753 = arg1.method8220();
		} else if (arg0 == 2) {
			this.anInt1739 = arg1.method8220();
		} else if (arg0 == 3) {
			this.aString9 = arg1.method8221();
		} else if (arg0 == 4) {
			this.anInt1767 = arg1.method8203();
		} else if (arg0 == 5) {
			this.anInt1746 = arg1.method8203();
		} else if (arg0 == 6) {
			this.anInt1772 = arg1.method8246();
		} else {
			@Pc(217) int local217;
			if (arg0 != 7) {
				if (arg0 == 8) {
					this.aBoolean142 = arg1.method8246() == 1;
					return;
				}
				if (arg0 == 9) {
					this.anInt1769 = arg1.method8220();
					if (this.anInt1769 == 65535) {
						this.anInt1769 = -1;
					}
					this.anInt1770 = arg1.method8220();
					if (this.anInt1770 == 65535) {
						this.anInt1770 = -1;
					}
					this.anInt1760 = arg1.method8236();
					this.anInt1741 = arg1.method8236();
					return;
				}
				if (arg0 >= 10 && arg0 <= 14) {
					this.aStringArray4[arg0 - 10] = arg1.method8221();
					return;
				}
				@Pc(224) int local224;
				@Pc(249) int local249;
				if (arg0 != 15) {
					if (arg0 == 16) {
						this.aBoolean140 = false;
						return;
					}
					if (arg0 != 17) {
						if (arg0 == 18) {
							this.anInt1743 = arg1.method8220();
							return;
						}
						if (arg0 != 19) {
							if (arg0 == 20) {
								this.anInt1748 = arg1.method8220();
								if (this.anInt1748 == 65535) {
									this.anInt1748 = -1;
								}
								this.anInt1751 = arg1.method8220();
								if (this.anInt1751 == 65535) {
									this.anInt1751 = -1;
								}
								this.anInt1764 = arg1.method8236();
								this.anInt1745 = arg1.method8236();
								return;
							}
							if (arg0 != 21) {
								if (arg0 != 22) {
									if (arg0 == 23) {
										this.anInt1759 = arg1.method8246();
										this.anInt1763 = arg1.method8246();
										this.anInt1738 = arg1.method8246();
									} else if (arg0 == 24) {
										this.anInt1744 = arg1.method8231();
										this.anInt1761 = arg1.method8231();
										return;
									} else if (arg0 == 249) {
										local217 = arg1.method8246();
										if (this.aClass380_1 == null) {
											local224 = Static101.method2622(local217);
											this.aClass380_1 = new Class380(local224);
										}
										for (local224 = 0; local224 < local217; local224++) {
											@Pc(243) boolean local243 = arg1.method8246() == 1;
											local249 = arg1.method8203();
											@Pc(258) Class6 local258;
											if (local243) {
												local258 = new Class6_Sub23(arg1.method8221());
											} else {
												local258 = new Class6_Sub37(arg1.method8236());
											}
											this.aClass380_1.method8753(local258, (long) local249);
										}
										return;
									}
									return;
								}
								this.anInt1740 = arg1.method8236();
								return;
							}
							this.anInt1747 = arg1.method8236();
							return;
						}
						this.anInt1754 = arg1.method8220();
						return;
					}
					this.aString8 = arg1.method8221();
					return;
				}
				local217 = arg1.method8246();
				this.anIntArray49 = new int[local217 * 2];
				for (local224 = 0; local224 < local217 * 2; local224++) {
					this.anIntArray49[local224] = arg1.method8231();
				}
				this.anInt1758 = arg1.method8236();
				@Pc(359) int local359 = arg1.method8246();
				this.anIntArray48 = new int[local359];
				for (local249 = 0; local249 < this.anIntArray48.length; local249++) {
					this.anIntArray48[local249] = arg1.method8236();
				}
				this.aByteArray8 = new byte[local217];
				for (@Pc(392) int local392 = 0; local392 < local217; local392++) {
					this.aByteArray8[local392] = arg1.method8208();
				}
				return;
			}
			local217 = arg1.method8246();
			if ((local217 & 0x2) == 2) {
				this.aBoolean139 = true;
			}
			if ((local217 & 0x1) == 0) {
				this.aBoolean141 = false;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
	public String method1628(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass380_1 == null) {
			return arg0;
		} else {
			@Pc(16) Class6_Sub23 local16 = (Class6_Sub23) this.aClass380_1.method8747((long) arg1);
			return local16 == null ? arg0 : local16.aString42;
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!ji;I)V")
	public void method1629(@OriginalArg(0) Class6_Sub8 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8246();
			if (local5 == 0) {
				return;
			}
			this.method1627(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)V")
	public void method1630() {
		if (this.anIntArray49 == null) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anIntArray49.length; local6 += 2) {
			if (this.anIntArray49[local6] < this.anInt1752) {
				this.anInt1752 = this.anIntArray49[local6];
			} else if (this.anIntArray49[local6] > this.anInt1755) {
				this.anInt1755 = this.anIntArray49[local6];
			}
			if (this.anIntArray49[local6 + 1] < this.anInt1757) {
				this.anInt1757 = this.anIntArray49[local6 + 1];
			} else if (this.anInt1771 < this.anIntArray49[local6 + 1]) {
				this.anInt1771 = this.anIntArray49[local6 + 1];
			}
		}
	}
}
