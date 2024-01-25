import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vu")
public final class Class336 {

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "Lclient!ug;")
	public Class320 aClass320_4;

	@OriginalMember(owner = "client!vu", name = "e", descriptor = "I")
	public int anInt9743;

	@OriginalMember(owner = "client!vu", name = "f", descriptor = "Lclient!oj;")
	private Class234 aClass234_49;

	@OriginalMember(owner = "client!vu", name = "m", descriptor = "Ljava/lang/String;")
	public String aString89;

	@OriginalMember(owner = "client!vu", name = "o", descriptor = "[I")
	public int[] anIntArray708;

	@OriginalMember(owner = "client!vu", name = "p", descriptor = "I")
	public int anInt9750;

	@OriginalMember(owner = "client!vu", name = "r", descriptor = "I")
	private int anInt9751;

	@OriginalMember(owner = "client!vu", name = "v", descriptor = "I")
	private int anInt9755;

	@OriginalMember(owner = "client!vu", name = "B", descriptor = "I")
	public int anInt9761;

	@OriginalMember(owner = "client!vu", name = "D", descriptor = "Ljava/lang/String;")
	public String aString90;

	@OriginalMember(owner = "client!vu", name = "E", descriptor = "I")
	public int anInt9763;

	@OriginalMember(owner = "client!vu", name = "P", descriptor = "I")
	public int anInt9771;

	@OriginalMember(owner = "client!vu", name = "Q", descriptor = "I")
	private int anInt9772;

	@OriginalMember(owner = "client!vu", name = "T", descriptor = "I")
	private int anInt9775;

	@OriginalMember(owner = "client!vu", name = "U", descriptor = "I")
	public int anInt9776;

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "Z")
	public boolean aBoolean659 = true;

	@OriginalMember(owner = "client!vu", name = "h", descriptor = "I")
	public int anInt9745 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!vu", name = "q", descriptor = "Z")
	public boolean aBoolean660 = false;

	@OriginalMember(owner = "client!vu", name = "w", descriptor = "I")
	public int anInt9756 = -1;

	@OriginalMember(owner = "client!vu", name = "t", descriptor = "I")
	public int anInt9753 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!vu", name = "x", descriptor = "I")
	public int anInt9757 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!vu", name = "C", descriptor = "I")
	public int anInt9762 = 0;

	@OriginalMember(owner = "client!vu", name = "i", descriptor = "I")
	private int anInt9746 = -1;

	@OriginalMember(owner = "client!vu", name = "c", descriptor = "I")
	private int anInt9742 = -1;

	@OriginalMember(owner = "client!vu", name = "G", descriptor = "I")
	private int anInt9765 = -1;

	@OriginalMember(owner = "client!vu", name = "j", descriptor = "I")
	public int anInt9747 = -1;

	@OriginalMember(owner = "client!vu", name = "u", descriptor = "I")
	public int anInt9754 = -1;

	@OriginalMember(owner = "client!vu", name = "y", descriptor = "I")
	private int anInt9758 = -1;

	@OriginalMember(owner = "client!vu", name = "H", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray40 = new String[5];

	@OriginalMember(owner = "client!vu", name = "O", descriptor = "Z")
	public boolean aBoolean662 = true;

	@OriginalMember(owner = "client!vu", name = "M", descriptor = "Z")
	public boolean aBoolean661 = true;

	@OriginalMember(owner = "client!vu", name = "I", descriptor = "I")
	public int anInt9766 = -1;

	@OriginalMember(owner = "client!vu", name = "J", descriptor = "I")
	public int anInt9767 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!vu", name = "S", descriptor = "I")
	private int anInt9774 = -1;

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(B)V")
	public void method7780() {
		if (this.anIntArray708 == null) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anIntArray708.length; local6 += 2) {
			if (this.anInt9757 > this.anIntArray708[local6]) {
				this.anInt9757 = this.anIntArray708[local6];
			} else if (this.anInt9753 < this.anIntArray708[local6]) {
				this.anInt9753 = this.anIntArray708[local6];
			}
			if (this.anIntArray708[local6 + 1] < this.anInt9767) {
				this.anInt9767 = this.anIntArray708[local6 + 1];
			} else if (this.anIntArray708[local6 + 1] > this.anInt9745) {
				this.anInt9745 = this.anIntArray708[local6 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(ZLclient!jr;)V")
	public void method7782(@OriginalArg(1) Class6_Sub12 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method6019();
			if (local9 == 0) {
				return;
			}
			this.method7786(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(ILclient!qh;)Z")
	public boolean method7783(@OriginalArg(1) Interface17 arg0) {
		@Pc(15) int local15;
		if (this.anInt9746 == -1) {
			if (this.anInt9758 == -1) {
				return true;
			}
			local15 = arg0.method958(this.anInt9758);
		} else {
			local15 = arg0.method957(this.anInt9746);
		}
		if (this.anInt9751 > local15 || local15 > this.anInt9775) {
			return false;
		}
		@Pc(61) int local61;
		if (this.anInt9774 == -1) {
			if (this.anInt9765 == -1) {
				return true;
			}
			local61 = arg0.method958(this.anInt9765);
		} else {
			local61 = arg0.method957(this.anInt9774);
		}
		return this.anInt9755 <= local61 && this.anInt9772 >= local61;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(ILclient!jr;I)V")
	private void method7786(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub12 arg1) {
		if (arg0 == 1) {
			this.anInt9766 = arg1.method6044();
		} else if (arg0 == 2) {
			this.anInt9754 = arg1.method6044();
		} else if (arg0 == 3) {
			this.aString89 = arg1.method6040();
		} else if (arg0 == 4) {
			this.anInt9743 = arg1.method6037();
		} else if (arg0 == 5) {
			this.anInt9747 = arg1.method6037();
		} else if (arg0 == 6) {
			this.anInt9762 = arg1.method6019();
		} else {
			@Pc(146) int local146;
			if (arg0 != 7) {
				if (arg0 == 8) {
					this.aBoolean659 = arg1.method6019() == 1;
					return;
				}
				if (arg0 == 9) {
					this.anInt9758 = arg1.method6044();
					if (this.anInt9758 == 65535) {
						this.anInt9758 = -1;
					}
					this.anInt9746 = arg1.method6044();
					if (this.anInt9746 == 65535) {
						this.anInt9746 = -1;
					}
					this.anInt9751 = arg1.method6015();
					this.anInt9775 = arg1.method6015();
					return;
				}
				if (arg0 >= 10 && arg0 <= 14) {
					this.aStringArray40[arg0 - 10] = arg1.method6040();
					return;
				}
				@Pc(153) int local153;
				if (arg0 != 15) {
					if (arg0 == 16) {
						this.aBoolean662 = false;
						return;
					}
					if (arg0 != 17) {
						if (arg0 != 18) {
							if (arg0 == 19) {
								this.anInt9756 = arg1.method6044();
								return;
							}
							if (arg0 != 20) {
								if (arg0 == 21) {
									this.anInt9750 = arg1.method6015();
								} else if (arg0 == 22) {
									this.anInt9761 = arg1.method6015();
									return;
								} else if (arg0 == 249) {
									local146 = arg1.method6019();
									if (this.aClass234_49 == null) {
										local153 = Static14.method5936(local146);
										this.aClass234_49 = new Class234(local153);
									}
									for (local153 = 0; local153 < local146; local153++) {
										@Pc(174) boolean local174 = arg1.method6019() == 1;
										@Pc(178) int local178 = arg1.method6037();
										@Pc(187) Class6 local187;
										if (local174) {
											local187 = new Class6_Sub36(arg1.method6040());
										} else {
											local187 = new Class6_Sub14(arg1.method6015());
										}
										this.aClass234_49.method5466((long) local178, local187);
									}
									return;
								}
								return;
							}
							this.anInt9765 = arg1.method6044();
							if (this.anInt9765 == 65535) {
								this.anInt9765 = -1;
							}
							this.anInt9774 = arg1.method6044();
							if (this.anInt9774 == 65535) {
								this.anInt9774 = -1;
							}
							this.anInt9755 = arg1.method6015();
							this.anInt9772 = arg1.method6015();
							return;
						}
						this.anInt9742 = arg1.method6044();
						return;
					}
					this.aString90 = arg1.method6040();
					return;
				}
				local146 = arg1.method6019();
				this.anIntArray708 = new int[local146 * 2];
				for (local153 = 0; local153 < local146 * 2; local153++) {
					this.anIntArray708[local153] = arg1.method6023();
				}
				this.anInt9776 = arg1.method6015();
				this.anInt9771 = arg1.method6015();
				return;
			}
			local146 = arg1.method6019();
			if ((local146 & 0x2) == 2) {
				this.aBoolean660 = true;
			}
			if ((local146 & 0x1) == 0) {
				this.aBoolean661 = false;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(Ljava/lang/String;ZI)Ljava/lang/String;")
	public String method7787(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass234_49 == null) {
			return arg0;
		} else {
			@Pc(16) Class6_Sub36 local16 = (Class6_Sub36) this.aClass234_49.method5464((long) arg1);
			return local16 == null ? arg0 : local16.aString54;
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(ZILclient!oa;)Lclient!xa;")
	public Class71 method7788(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class90 arg1) {
		@Pc(11) int local11 = arg0 ? this.anInt9754 : this.anInt9766;
		@Pc(18) int local18 = arg1.anInt9369 << 29 | local11;
		@Pc(27) Class71 local27 = (Class71) this.aClass320_4.aClass330_65.method7677((long) local18);
		if (local27 != null) {
			return local27;
		} else if (this.aClass320_4.aClass248_101.method5804(local11)) {
			@Pc(47) Class177 local47 = Static593.method4148(this.aClass320_4.aClass248_101, local11, 0);
			if (local47 != null) {
				local27 = arg1.method7522(local47);
				this.aClass320_4.aClass330_65.method7676(local27, (long) local18);
			}
			return local27;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(III)I")
	public int method7789(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass234_49 == null) {
			return arg0;
		} else {
			@Pc(16) Class6_Sub14 local16 = (Class6_Sub14) this.aClass234_49.method5464((long) arg1);
			return local16 == null ? arg0 : local16.anInt2188;
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(Lclient!oa;I)Lclient!xa;")
	public Class71 method7790(@OriginalArg(0) Class90 arg0) {
		@Pc(26) Class71 local26 = (Class71) this.aClass320_4.aClass330_65.method7677((long) (this.anInt9742 | 0x20000 | arg0.anInt9369 << 29));
		if (local26 != null) {
			return local26;
		}
		this.aClass320_4.aClass248_101.method5804(this.anInt9742);
		@Pc(46) Class177 local46 = Static593.method4148(this.aClass320_4.aClass248_101, this.anInt9742, 0);
		if (local46 != null) {
			local26 = arg0.method7522(local46);
			this.aClass320_4.aClass330_65.method7676(local26, (long) (arg0.anInt9369 << 29 | this.anInt9742 | 0x20000));
		}
		return local26;
	}
}
