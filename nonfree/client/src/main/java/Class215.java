import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wk")
public final class Class215 {

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "Ljava/lang/String;")
	public String aString65;

	@OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
	private int anInt6750;

	@OriginalMember(owner = "client!wk", name = "p", descriptor = "I")
	public int anInt6757;

	@OriginalMember(owner = "client!wk", name = "r", descriptor = "I")
	public int anInt6759;

	@OriginalMember(owner = "client!wk", name = "u", descriptor = "I")
	public int anInt6762;

	@OriginalMember(owner = "client!wk", name = "w", descriptor = "[I")
	public int[] anIntArray638;

	@OriginalMember(owner = "client!wk", name = "x", descriptor = "I")
	public int anInt6764;

	@OriginalMember(owner = "client!wk", name = "y", descriptor = "I")
	public int anInt6765;

	@OriginalMember(owner = "client!wk", name = "z", descriptor = "I")
	private int anInt6766;

	@OriginalMember(owner = "client!wk", name = "F", descriptor = "I")
	public int anInt6770;

	@OriginalMember(owner = "client!wk", name = "H", descriptor = "Ljava/lang/String;")
	public String aString66;

	@OriginalMember(owner = "client!wk", name = "P", descriptor = "I")
	private int anInt6777;

	@OriginalMember(owner = "client!wk", name = "S", descriptor = "I")
	private int anInt6780;

	@OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
	public int anInt6749 = -1;

	@OriginalMember(owner = "client!wk", name = "l", descriptor = "I")
	private int anInt6754 = -1;

	@OriginalMember(owner = "client!wk", name = "m", descriptor = "Z")
	public boolean aBoolean589 = false;

	@OriginalMember(owner = "client!wk", name = "k", descriptor = "I")
	public int anInt6753 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!wk", name = "v", descriptor = "I")
	public int anInt6763 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "Z")
	public boolean aBoolean587 = true;

	@OriginalMember(owner = "client!wk", name = "o", descriptor = "I")
	private int anInt6756 = -1;

	@OriginalMember(owner = "client!wk", name = "n", descriptor = "I")
	public int anInt6755 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!wk", name = "B", descriptor = "Z")
	public boolean aBoolean590 = true;

	@OriginalMember(owner = "client!wk", name = "j", descriptor = "I")
	public int anInt6752 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
	public int anInt6748 = -1;

	@OriginalMember(owner = "client!wk", name = "D", descriptor = "I")
	private int anInt6769 = -1;

	@OriginalMember(owner = "client!wk", name = "A", descriptor = "I")
	public int anInt6767 = -1;

	@OriginalMember(owner = "client!wk", name = "i", descriptor = "Z")
	public boolean aBoolean588 = true;

	@OriginalMember(owner = "client!wk", name = "N", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray68 = new String[5];

	@OriginalMember(owner = "client!wk", name = "T", descriptor = "I")
	public int anInt6781 = 0;

	@OriginalMember(owner = "client!wk", name = "Q", descriptor = "I")
	private int anInt6778 = -1;

	@OriginalMember(owner = "client!wk", name = "t", descriptor = "I")
	private int anInt6761 = -1;

	@OriginalMember(owner = "client!wk", name = "K", descriptor = "I")
	public int anInt6774 = -1;

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)V")
	public void method5991() {
		if (this.anIntArray638 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < this.anIntArray638.length; local4 += 2) {
			if (this.anIntArray638[local4] < this.anInt6755) {
				this.anInt6755 = this.anIntArray638[local4];
			} else if (this.anInt6752 < this.anIntArray638[local4]) {
				this.anInt6752 = this.anIntArray638[local4];
			}
			if (this.anInt6763 > this.anIntArray638[local4 + 1]) {
				this.anInt6763 = this.anIntArray638[local4 + 1];
			} else if (this.anIntArray638[local4 + 1] > this.anInt6753) {
				this.anInt6753 = this.anIntArray638[local4 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZLclient!ea;I)Lclient!wn;")
	public Class95 method5992(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class55 arg1) {
		@Pc(11) int local11 = arg0 ? this.anInt6767 : this.anInt6749;
		@Pc(23) int local23 = arg1.anInt5811 << 29 | local11;
		@Pc(30) Class95 local30 = (Class95) Static149.aClass109_34.method2857((long) local23);
		if (local30 != null) {
			return local30;
		} else if (Static34.aClass93_12.method2414(local11)) {
			@Pc(46) Class100 local46 = Static363.method2672(Static34.aClass93_12, local11, 0);
			if (local46 != null) {
				local30 = arg1.method5229(local46);
				Static149.aClass109_34.method2855((long) local23, local30);
			}
			return local30;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!rg;B)V")
	public void method5993(@OriginalArg(0) Class5_Sub12 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method5115();
			if (local14 == 0) {
				return;
			}
			this.method5997(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(B)Z")
	public boolean method5994() {
		if (this.anInt6756 == -1 && this.anInt6769 == -1) {
			return true;
		}
		@Pc(31) int local31;
		if (this.anInt6756 == -1) {
			local31 = Static104.method1878(this.anInt6769);
		} else {
			local31 = Static134.anIntArray205[this.anInt6756];
		}
		if (local31 < this.anInt6780 || local31 > this.anInt6766) {
			return false;
		} else if (this.anInt6778 == -1 && this.anInt6754 == -1) {
			return true;
		} else {
			if (this.anInt6778 == -1) {
				local31 = Static104.method1878(this.anInt6754);
			} else {
				local31 = Static134.anIntArray205[this.anInt6778];
			}
			return local31 >= this.anInt6777 && this.anInt6750 >= local31;
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILclient!ea;)Lclient!wn;")
	public Class95 method5996(@OriginalArg(1) Class55 arg0) {
		@Pc(23) Class95 local23 = (Class95) Static149.aClass109_34.method2857((long) (this.anInt6761 | 0x20000 | arg0.anInt5811 << 29));
		if (local23 != null) {
			return local23;
		}
		Static34.aClass93_12.method2414(this.anInt6761);
		@Pc(39) Class100 local39 = Static363.method2672(Static34.aClass93_12, this.anInt6761, 0);
		if (local39 != null) {
			local23 = arg0.method5229(local39);
			Static149.aClass109_34.method2855((long) (arg0.anInt5811 << 29 | this.anInt6761 | 0x20000), local23);
		}
		return local23;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IZLclient!rg;)V")
	private void method5997(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub12 arg1) {
		if (arg0 == 1) {
			this.anInt6749 = arg1.method5106();
		} else if (arg0 == 2) {
			this.anInt6767 = arg1.method5106();
		} else if (arg0 == 3) {
			this.aString66 = arg1.method5064();
		} else if (arg0 == 4) {
			this.anInt6757 = arg1.method5072();
		} else if (arg0 == 5) {
			this.anInt6748 = arg1.method5072();
		} else if (arg0 == 6) {
			this.anInt6781 = arg1.method5115();
			return;
		} else {
			@Pc(233) int local233;
			if (arg0 != 7) {
				if (arg0 == 8) {
					this.aBoolean587 = arg1.method5115() == 1;
					return;
				}
				if (arg0 == 9) {
					this.anInt6769 = arg1.method5106();
					if (this.anInt6769 == 65535) {
						this.anInt6769 = -1;
					}
					this.anInt6756 = arg1.method5106();
					if (this.anInt6756 == 65535) {
						this.anInt6756 = -1;
					}
					this.anInt6780 = arg1.method5067();
					this.anInt6766 = arg1.method5067();
					return;
				}
				if (arg0 >= 10 && arg0 <= 14) {
					this.aStringArray68[arg0 - 10] = arg1.method5064();
					return;
				}
				if (arg0 != 15) {
					if (arg0 != 16) {
						if (arg0 != 17) {
							if (arg0 != 18) {
								if (arg0 == 19) {
									this.anInt6774 = arg1.method5106();
									return;
								}
								if (arg0 == 20) {
									this.anInt6754 = arg1.method5106();
									if (this.anInt6754 == 65535) {
										this.anInt6754 = -1;
									}
									this.anInt6778 = arg1.method5106();
									if (this.anInt6778 == 65535) {
										this.anInt6778 = -1;
									}
									this.anInt6777 = arg1.method5067();
									this.anInt6750 = arg1.method5067();
								} else if (arg0 == 21) {
									this.anInt6764 = arg1.method5067();
									return;
								} else if (arg0 == 22) {
									this.anInt6759 = arg1.method5067();
									return;
								}
								return;
							}
							this.anInt6761 = arg1.method5106();
							return;
						}
						this.aString65 = arg1.method5064();
						return;
					}
					this.aBoolean588 = false;
					return;
				}
				local233 = arg1.method5115();
				this.anIntArray638 = new int[local233 * 2];
				for (@Pc(241) int local241 = 0; local241 < local233 * 2; local241++) {
					this.anIntArray638[local241] = arg1.method5066();
				}
				this.anInt6770 = arg1.method5067();
				this.anInt6762 = arg1.method5067();
				return;
			}
			local233 = arg1.method5115();
			if ((local233 & 0x2) == 2) {
				this.aBoolean589 = true;
			}
			if ((local233 & 0x1) == 0) {
				this.aBoolean590 = false;
				return;
			}
		}
	}
}
