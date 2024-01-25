import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class66 {

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
	public int anInt1731;

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
	public int anInt1734;

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
	private int anInt1740;

	@OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
	public int anInt1742;

	@OriginalMember(owner = "client!fc", name = "u", descriptor = "I")
	public int anInt1747;

	@OriginalMember(owner = "client!fc", name = "y", descriptor = "I")
	private int anInt1750;

	@OriginalMember(owner = "client!fc", name = "z", descriptor = "I")
	private int anInt1751;

	@OriginalMember(owner = "client!fc", name = "A", descriptor = "Ljava/lang/String;")
	public String aString17;

	@OriginalMember(owner = "client!fc", name = "E", descriptor = "[I")
	public int[] anIntArray137;

	@OriginalMember(owner = "client!fc", name = "F", descriptor = "I")
	private int anInt1754;

	@OriginalMember(owner = "client!fc", name = "M", descriptor = "Lclient!cm;")
	private Class41 aClass41_10;

	@OriginalMember(owner = "client!fc", name = "Q", descriptor = "I")
	public int anInt1763;

	@OriginalMember(owner = "client!fc", name = "T", descriptor = "Ljava/lang/String;")
	public String aString18;

	@OriginalMember(owner = "client!fc", name = "W", descriptor = "I")
	public int anInt1767;

	@OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
	public int anInt1739 = -1;

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
	public int anInt1733 = -1;

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "Z")
	public boolean aBoolean154 = true;

	@OriginalMember(owner = "client!fc", name = "t", descriptor = "I")
	public int anInt1746 = 0;

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "Z")
	public boolean aBoolean155 = true;

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
	private int anInt1737 = -1;

	@OriginalMember(owner = "client!fc", name = "q", descriptor = "I")
	public int anInt1744 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!fc", name = "v", descriptor = "I")
	private int anInt1748 = -1;

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
	public int anInt1735 = -1;

	@OriginalMember(owner = "client!fc", name = "N", descriptor = "I")
	private int anInt1760 = -1;

	@OriginalMember(owner = "client!fc", name = "I", descriptor = "Z")
	public boolean aBoolean157 = false;

	@OriginalMember(owner = "client!fc", name = "O", descriptor = "I")
	public int anInt1761 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
	private int anInt1732 = -1;

	@OriginalMember(owner = "client!fc", name = "S", descriptor = "I")
	private int anInt1765 = -1;

	@OriginalMember(owner = "client!fc", name = "R", descriptor = "I")
	public int anInt1764 = -1;

	@OriginalMember(owner = "client!fc", name = "x", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray9 = new String[5];

	@OriginalMember(owner = "client!fc", name = "P", descriptor = "I")
	public int anInt1762 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "Z")
	public boolean aBoolean156 = true;

	@OriginalMember(owner = "client!fc", name = "G", descriptor = "I")
	public int anInt1755 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILclient!ef;)V")
	public void method1802(@OriginalArg(1) Class2_Sub12 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method3124();
			if (local12 == 0) {
				return;
			}
			this.method1803(local12, arg0);
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IBLclient!ef;)V")
	private void method1803(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub12 arg1) {
		if (arg0 == 1) {
			this.anInt1739 = arg1.method3104();
		} else if (arg0 == 2) {
			this.anInt1733 = arg1.method3104();
		} else if (arg0 == 3) {
			this.aString18 = arg1.method3113();
		} else if (arg0 == 4) {
			this.anInt1747 = arg1.method3163();
		} else if (arg0 == 5) {
			this.anInt1735 = arg1.method3163();
		} else if (arg0 == 6) {
			this.anInt1746 = arg1.method3124();
		} else {
			@Pc(61) int local61;
			if (arg0 == 7) {
				local61 = arg1.method3124();
				if ((local61 & 0x1) == 0) {
					this.aBoolean155 = false;
				}
				if ((local61 & 0x2) == 2) {
					this.aBoolean157 = true;
				}
			} else if (arg0 == 8) {
				this.aBoolean156 = arg1.method3124() == 1;
			} else if (arg0 == 9) {
				this.anInt1732 = arg1.method3104();
				if (this.anInt1732 == 65535) {
					this.anInt1732 = -1;
				}
				this.anInt1760 = arg1.method3104();
				if (this.anInt1760 == 65535) {
					this.anInt1760 = -1;
				}
				this.anInt1754 = arg1.method3135();
				this.anInt1750 = arg1.method3135();
			} else if (arg0 >= 10 && arg0 <= 14) {
				this.aStringArray9[arg0 - 10] = arg1.method3113();
			} else {
				@Pc(115) int local115;
				if (arg0 == 15) {
					local61 = arg1.method3124();
					this.anIntArray137 = new int[local61 * 2];
					for (local115 = 0; local115 < local61 * 2; local115++) {
						this.anIntArray137[local115] = arg1.method3108();
					}
					this.anInt1742 = arg1.method3135();
					this.anInt1763 = arg1.method3135();
				} else if (arg0 == 16) {
					this.aBoolean154 = false;
				} else if (arg0 == 17) {
					this.aString17 = arg1.method3113();
				} else if (arg0 == 18) {
					this.anInt1748 = arg1.method3104();
				} else if (arg0 == 19) {
					this.anInt1764 = arg1.method3104();
				} else if (arg0 == 20) {
					this.anInt1765 = arg1.method3104();
					if (this.anInt1765 == 65535) {
						this.anInt1765 = -1;
					}
					this.anInt1737 = arg1.method3104();
					if (this.anInt1737 == 65535) {
						this.anInt1737 = -1;
					}
					this.anInt1751 = arg1.method3135();
					this.anInt1740 = arg1.method3135();
				} else if (arg0 == 21) {
					this.anInt1731 = arg1.method3135();
				} else if (arg0 == 22) {
					this.anInt1767 = arg1.method3135();
				} else if (arg0 == 249) {
					local61 = arg1.method3124();
					if (this.aClass41_10 == null) {
						local115 = Static51.method1026(local61);
						this.aClass41_10 = new Class41(local115);
					}
					for (local115 = 0; local115 < local61; local115++) {
						@Pc(252) boolean local252 = arg1.method3124() == 1;
						@Pc(256) int local256 = arg1.method3163();
						@Pc(267) Class2 local267;
						if (local252) {
							local267 = new Class2_Sub14(arg1.method3113());
						} else {
							local267 = new Class2_Sub23(arg1.method3135());
						}
						this.aClass41_10.method901(local267, (long) local256);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!dr;ZI)Lclient!kr;")
	public Class46 method1805(@OriginalArg(0) Class37 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(11) int local11 = arg1 ? this.anInt1733 : this.anInt1739;
		@Pc(18) int local18 = arg0.anInt4312 << 29 | local11;
		@Pc(31) Class46 local31 = (Class46) Static84.aClass107_9.method3021((long) local18);
		if (local31 != null) {
			return local31;
		} else if (Static358.aClass104_192.method2755(local11)) {
			@Pc(49) Class40 local49 = Static368.method843(Static358.aClass104_192, local11, 0);
			if (local49 != null) {
				local31 = arg0.method3708(local49);
				Static84.aClass107_9.method3018((long) local18, local31);
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
	public void method1806() {
		if (this.anIntArray137 == null) {
			return;
		}
		for (@Pc(18) int local18 = 0; local18 < this.anIntArray137.length; local18 += 2) {
			if (this.anInt1744 > this.anIntArray137[local18]) {
				this.anInt1744 = this.anIntArray137[local18];
			} else if (this.anInt1761 < this.anIntArray137[local18]) {
				this.anInt1761 = this.anIntArray137[local18];
			}
			if (this.anIntArray137[local18 + 1] < this.anInt1762) {
				this.anInt1762 = this.anIntArray137[local18 + 1];
			} else if (this.anIntArray137[local18 + 1] > this.anInt1755) {
				this.anInt1755 = this.anIntArray137[local18 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)I")
	public int method1807(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass41_10 == null) {
			return arg1;
		} else {
			@Pc(22) Class2_Sub23 local22 = (Class2_Sub23) this.aClass41_10.method902((long) arg0);
			return local22 == null ? arg1 : local22.anInt3818;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
	public String method1808(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass41_10 == null) {
			return arg1;
		} else {
			@Pc(16) Class2_Sub14 local16 = (Class2_Sub14) this.aClass41_10.method902((long) arg0);
			return local16 == null ? arg1 : local16.aString15;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!dr;I)Lclient!kr;")
	public Class46 method1810(@OriginalArg(0) Class37 arg0) {
		@Pc(18) Class46 local18 = (Class46) Static84.aClass107_9.method3021((long) (arg0.anInt4312 << 29 | this.anInt1748 | 0x20000));
		if (local18 != null) {
			return local18;
		}
		Static358.aClass104_192.method2755(this.anInt1748);
		@Pc(39) Class40 local39 = Static368.method843(Static358.aClass104_192, this.anInt1748, 0);
		if (local39 != null) {
			local18 = arg0.method3708(local39);
			Static84.aClass107_9.method3018((long) (this.anInt1748 | 0x20000 | arg0.anInt4312 << 29), local18);
		}
		return local18;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)Z")
	public boolean method1811() {
		if (this.anInt1760 == -1 && this.anInt1732 == -1) {
			return true;
		}
		@Pc(32) int local32;
		if (this.anInt1760 == -1) {
			local32 = Static133.method2574(this.anInt1732);
		} else {
			local32 = Static181.anIntArray308[this.anInt1760];
		}
		if (this.anInt1754 > local32 || local32 > this.anInt1750) {
			return false;
		} else if (this.anInt1737 == -1 && this.anInt1765 == -1) {
			return true;
		} else {
			if (this.anInt1737 == -1) {
				local32 = Static133.method2574(this.anInt1765);
			} else {
				local32 = Static181.anIntArray308[this.anInt1737];
			}
			return local32 >= this.anInt1751 && local32 <= this.anInt1740;
		}
	}
}
