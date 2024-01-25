import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class90 {

	@OriginalMember(owner = "client!gj", name = "k", descriptor = "Ljava/lang/String;")
	public String aString18;

	@OriginalMember(owner = "client!gj", name = "q", descriptor = "[I")
	public int[] anIntArray162;

	@OriginalMember(owner = "client!gj", name = "t", descriptor = "Lclient!an;")
	private Class11 aClass11_13;

	@OriginalMember(owner = "client!gj", name = "u", descriptor = "I")
	public int anInt2706;

	@OriginalMember(owner = "client!gj", name = "y", descriptor = "I")
	private int anInt2709;

	@OriginalMember(owner = "client!gj", name = "A", descriptor = "Lclient!nv;")
	public Class171 aClass171_1;

	@OriginalMember(owner = "client!gj", name = "B", descriptor = "I")
	public int anInt2711;

	@OriginalMember(owner = "client!gj", name = "G", descriptor = "I")
	public int anInt2713;

	@OriginalMember(owner = "client!gj", name = "H", descriptor = "Ljava/lang/String;")
	public String aString19;

	@OriginalMember(owner = "client!gj", name = "J", descriptor = "I")
	public int anInt2715;

	@OriginalMember(owner = "client!gj", name = "K", descriptor = "I")
	private int anInt2716;

	@OriginalMember(owner = "client!gj", name = "L", descriptor = "I")
	private int anInt2717;

	@OriginalMember(owner = "client!gj", name = "P", descriptor = "I")
	private int anInt2719;

	@OriginalMember(owner = "client!gj", name = "R", descriptor = "I")
	public int anInt2721;

	@OriginalMember(owner = "client!gj", name = "cb", descriptor = "I")
	public int anInt2729;

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "Z")
	public boolean aBoolean239 = true;

	@OriginalMember(owner = "client!gj", name = "g", descriptor = "I")
	public int anInt2698 = -1;

	@OriginalMember(owner = "client!gj", name = "l", descriptor = "I")
	private int anInt2700 = -1;

	@OriginalMember(owner = "client!gj", name = "p", descriptor = "I")
	public int anInt2704 = -1;

	@OriginalMember(owner = "client!gj", name = "r", descriptor = "I")
	public int anInt2705 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!gj", name = "e", descriptor = "Z")
	public boolean aBoolean240 = true;

	@OriginalMember(owner = "client!gj", name = "x", descriptor = "I")
	public int anInt2708 = -1;

	@OriginalMember(owner = "client!gj", name = "w", descriptor = "I")
	private int anInt2707 = -1;

	@OriginalMember(owner = "client!gj", name = "z", descriptor = "I")
	public int anInt2710 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!gj", name = "v", descriptor = "Z")
	public boolean aBoolean242 = true;

	@OriginalMember(owner = "client!gj", name = "h", descriptor = "Z")
	public boolean aBoolean241 = false;

	@OriginalMember(owner = "client!gj", name = "E", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray25 = new String[5];

	@OriginalMember(owner = "client!gj", name = "I", descriptor = "I")
	private int anInt2714 = -1;

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
	private int anInt2696 = -1;

	@OriginalMember(owner = "client!gj", name = "Z", descriptor = "I")
	public int anInt2726 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!gj", name = "W", descriptor = "I")
	public int anInt2723 = -1;

	@OriginalMember(owner = "client!gj", name = "n", descriptor = "I")
	public int anInt2702 = 0;

	@OriginalMember(owner = "client!gj", name = "C", descriptor = "I")
	public int anInt2712 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!gj", name = "ab", descriptor = "I")
	private int anInt2727 = -1;

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!qa;ZI)Lclient!f;")
	public Class8 method2033(@OriginalArg(0) Class172 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(11) int local11 = arg1 ? this.anInt2708 : this.anInt2704;
		@Pc(18) int local18 = local11 | arg0.anInt6964 << 29;
		@Pc(27) Class8 local27 = (Class8) this.aClass171_1.aClass126_37.method3141((long) local18);
		if (local27 != null) {
			return local27;
		} else if (this.aClass171_1.aClass32_64.method800(local11)) {
			@Pc(53) Class264 local53 = Static464.method5847(this.aClass171_1.aClass32_64, local11, 0);
			if (local53 != null) {
				local27 = arg0.method5542(local53);
				this.aClass171_1.aClass126_37.method3132((long) local18, local27);
			}
			return local27;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILclient!tj;)Z")
	public boolean method2034(@OriginalArg(1) Interface9 arg0) {
		@Pc(21) int local21;
		if (this.anInt2696 == -1) {
			if (this.anInt2714 == -1) {
				return true;
			}
			local21 = arg0.method1310(this.anInt2714);
		} else {
			local21 = arg0.method1309(this.anInt2696);
		}
		if (this.anInt2719 > local21 || local21 > this.anInt2716) {
			return false;
		}
		@Pc(56) int local56;
		if (this.anInt2707 == -1) {
			if (this.anInt2700 == -1) {
				return true;
			}
			local56 = arg0.method1310(this.anInt2700);
		} else {
			local56 = arg0.method1309(this.anInt2707);
		}
		return local56 >= this.anInt2709 && this.anInt2717 >= local56;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!qa;I)Lclient!f;")
	public Class8 method2035(@OriginalArg(0) Class172 arg0) {
		@Pc(20) Class8 local20 = (Class8) this.aClass171_1.aClass126_37.method3141((long) (this.anInt2727 | 0x20000 | arg0.anInt6964 << 29));
		if (local20 != null) {
			return local20;
		}
		this.aClass171_1.aClass32_64.method800(this.anInt2727);
		@Pc(40) Class264 local40 = Static464.method5847(this.aClass171_1.aClass32_64, this.anInt2727, 0);
		if (local40 != null) {
			local20 = arg0.method5542(local40);
			this.aClass171_1.aClass126_37.method3132((long) (arg0.anInt6964 << 29 | 0x20000 | this.anInt2727), local20);
		}
		return local20;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!cu;II)V")
	private void method2036(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2704 = arg0.method2588();
		} else if (arg1 == 2) {
			this.anInt2708 = arg0.method2588();
		} else if (arg1 == 3) {
			this.aString18 = arg0.method2620();
		} else if (arg1 == 4) {
			this.anInt2715 = arg0.method2604();
		} else if (arg1 == 5) {
			this.anInt2723 = arg0.method2604();
		} else if (arg1 == 6) {
			this.anInt2702 = arg0.method2582();
			return;
		} else {
			@Pc(83) int local83;
			if (arg1 != 7) {
				if (arg1 == 8) {
					this.aBoolean242 = arg0.method2582() == 1;
					return;
				}
				if (arg1 == 9) {
					this.anInt2714 = arg0.method2588();
					if (this.anInt2714 == 65535) {
						this.anInt2714 = -1;
					}
					this.anInt2696 = arg0.method2588();
					if (this.anInt2696 == 65535) {
						this.anInt2696 = -1;
					}
					this.anInt2719 = arg0.method2589();
					this.anInt2716 = arg0.method2589();
					return;
				}
				if (arg1 >= 10 && arg1 <= 14) {
					this.aStringArray25[arg1 - 10] = arg0.method2620();
					return;
				}
				@Pc(91) int local91;
				if (arg1 != 15) {
					if (arg1 == 16) {
						this.aBoolean239 = false;
						return;
					}
					if (arg1 == 17) {
						this.aString19 = arg0.method2620();
						return;
					}
					if (arg1 == 18) {
						this.anInt2727 = arg0.method2588();
						return;
					}
					if (arg1 == 19) {
						this.anInt2698 = arg0.method2588();
						return;
					}
					if (arg1 == 20) {
						this.anInt2700 = arg0.method2588();
						if (this.anInt2700 == 65535) {
							this.anInt2700 = -1;
						}
						this.anInt2707 = arg0.method2588();
						if (this.anInt2707 == 65535) {
							this.anInt2707 = -1;
						}
						this.anInt2709 = arg0.method2589();
						this.anInt2717 = arg0.method2589();
						return;
					}
					if (arg1 != 21) {
						if (arg1 == 22) {
							this.anInt2721 = arg0.method2589();
						} else if (arg1 == 249) {
							local83 = arg0.method2582();
							if (this.aClass11_13 == null) {
								local91 = Static288.method4088(local83);
								this.aClass11_13 = new Class11(local91);
							}
							for (local91 = 0; local91 < local83; local91++) {
								@Pc(254) boolean local254 = arg0.method2582() == 1;
								@Pc(258) int local258 = arg0.method2604();
								@Pc(267) Class3 local267;
								if (local254) {
									local267 = new Class3_Sub35(arg0.method2620());
								} else {
									local267 = new Class3_Sub34(arg0.method2589());
								}
								this.aClass11_13.method319(local267, (long) local258);
							}
							return;
						}
						return;
					}
					this.anInt2711 = arg0.method2589();
					return;
				}
				local83 = arg0.method2582();
				this.anIntArray162 = new int[local83 * 2];
				for (local91 = 0; local91 < local83 * 2; local91++) {
					this.anIntArray162[local91] = arg0.method2641();
				}
				this.anInt2706 = arg0.method2589();
				this.anInt2729 = arg0.method2589();
				return;
			}
			local83 = arg0.method2582();
			if ((local83 & 0x1) == 0) {
				this.aBoolean240 = false;
			}
			if ((local83 & 0x2) == 2) {
				this.aBoolean241 = true;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)V")
	public void method2037() {
		if (this.anIntArray162 == null) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < this.anIntArray162.length; local16 += 2) {
			if (this.anIntArray162[local16] < this.anInt2705) {
				this.anInt2705 = this.anIntArray162[local16];
			} else if (this.anInt2710 < this.anIntArray162[local16]) {
				this.anInt2710 = this.anIntArray162[local16];
			}
			if (this.anInt2726 > this.anIntArray162[local16 + 1]) {
				this.anInt2726 = this.anIntArray162[local16 + 1];
			} else if (this.anIntArray162[local16 + 1] > this.anInt2712) {
				this.anInt2712 = this.anIntArray162[local16 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZLclient!cu;)V")
	public void method2039(@OriginalArg(1) Class3_Sub7 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method2582();
			if (local3 == 0) {
				return;
			}
			this.method2036(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IBI)I")
	public int method2040(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass11_13 == null) {
			return arg1;
		} else {
			@Pc(22) Class3_Sub34 local22 = (Class3_Sub34) this.aClass11_13.method324((long) arg0);
			return local22 == null ? arg1 : local22.anInt5289;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
	public String method2041(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass11_13 == null) {
			return arg1;
		} else {
			@Pc(16) Class3_Sub35 local16 = (Class3_Sub35) this.aClass11_13.method324((long) arg0);
			return local16 == null ? arg1 : local16.aString54;
		}
	}
}
