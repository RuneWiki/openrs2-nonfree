import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class260 {

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
	public int anInt7729;

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "Lclient!fe;")
	private Class74 aClass74_34;

	@OriginalMember(owner = "client!wd", name = "i", descriptor = "Lclient!na;")
	public Class169 aClass169_28;

	@OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
	private int anInt7735;

	@OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
	public int anInt7736;

	@OriginalMember(owner = "client!wd", name = "q", descriptor = "I")
	public int anInt7740;

	@OriginalMember(owner = "client!wd", name = "s", descriptor = "[I")
	public int[] anIntArray531;

	@OriginalMember(owner = "client!wd", name = "w", descriptor = "I")
	private int anInt7744;

	@OriginalMember(owner = "client!wd", name = "z", descriptor = "I")
	public int anInt7747;

	@OriginalMember(owner = "client!wd", name = "C", descriptor = "Ljava/lang/String;")
	public String aString69;

	@OriginalMember(owner = "client!wd", name = "E", descriptor = "I")
	public int anInt7750;

	@OriginalMember(owner = "client!wd", name = "M", descriptor = "Ljava/lang/String;")
	public String aString70;

	@OriginalMember(owner = "client!wd", name = "N", descriptor = "I")
	private int anInt7756;

	@OriginalMember(owner = "client!wd", name = "P", descriptor = "I")
	private int anInt7757;

	@OriginalMember(owner = "client!wd", name = "T", descriptor = "I")
	public int anInt7759;

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
	private int anInt7728 = -1;

	@OriginalMember(owner = "client!wd", name = "m", descriptor = "Z")
	public boolean aBoolean484 = true;

	@OriginalMember(owner = "client!wd", name = "t", descriptor = "I")
	public int anInt7742 = -1;

	@OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
	public int anInt7734 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
	public int anInt7727 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!wd", name = "F", descriptor = "I")
	public int anInt7751 = 0;

	@OriginalMember(owner = "client!wd", name = "J", descriptor = "I")
	public int anInt7753 = -1;

	@OriginalMember(owner = "client!wd", name = "r", descriptor = "I")
	private int anInt7741 = -1;

	@OriginalMember(owner = "client!wd", name = "H", descriptor = "Z")
	public boolean aBoolean486 = true;

	@OriginalMember(owner = "client!wd", name = "p", descriptor = "I")
	private int anInt7739 = -1;

	@OriginalMember(owner = "client!wd", name = "O", descriptor = "Z")
	public boolean aBoolean487 = false;

	@OriginalMember(owner = "client!wd", name = "L", descriptor = "I")
	private int anInt7755 = -1;

	@OriginalMember(owner = "client!wd", name = "B", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray48 = new String[5];

	@OriginalMember(owner = "client!wd", name = "n", descriptor = "I")
	public int anInt7737 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!wd", name = "x", descriptor = "I")
	public int anInt7745 = -1;

	@OriginalMember(owner = "client!wd", name = "v", descriptor = "Z")
	public boolean aBoolean485 = true;

	@OriginalMember(owner = "client!wd", name = "A", descriptor = "I")
	public int anInt7748 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
	public int anInt7733 = -1;

	@OriginalMember(owner = "client!wd", name = "G", descriptor = "I")
	private int anInt7752 = -1;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/String;IB)Ljava/lang/String;")
	public String method6327(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.aClass74_34 == null) {
			return arg0;
		} else {
			@Pc(22) Class6_Sub13 local22 = (Class6_Sub13) this.aClass74_34.method1883((long) arg1);
			return local22 == null ? arg0 : local22.aString13;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)I")
	public int method6329(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass74_34 == null) {
			return arg1;
		} else {
			@Pc(16) Class6_Sub39 local16 = (Class6_Sub39) this.aClass74_34.method1883((long) arg0);
			return local16 == null ? arg1 : local16.anInt6429;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
	public void method6330() {
		if (this.anIntArray531 == null) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray531.length; local14 += 2) {
			if (this.anInt7734 > this.anIntArray531[local14]) {
				this.anInt7734 = this.anIntArray531[local14];
			} else if (this.anIntArray531[local14] > this.anInt7748) {
				this.anInt7748 = this.anIntArray531[local14];
			}
			if (this.anInt7737 > this.anIntArray531[local14 + 1]) {
				this.anInt7737 = this.anIntArray531[local14 + 1];
			} else if (this.anInt7727 < this.anIntArray531[local14 + 1]) {
				this.anInt7727 = this.anIntArray531[local14 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!ae;Z)V")
	public void method6331(@OriginalArg(0) Class6_Sub1 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method6433();
			if (local15 == 0) {
				return;
			}
			this.method6332(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IILclient!ae;)V")
	private void method6332(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub1 arg1) {
		if (arg0 == 1) {
			this.anInt7745 = arg1.method6485();
		} else if (arg0 == 2) {
			this.anInt7753 = arg1.method6485();
		} else if (arg0 == 3) {
			this.aString70 = arg1.method6473();
		} else if (arg0 == 4) {
			this.anInt7729 = arg1.method6435();
		} else if (arg0 == 5) {
			this.anInt7742 = arg1.method6435();
		} else if (arg0 == 6) {
			this.anInt7751 = arg1.method6433();
		} else {
			@Pc(169) int local169;
			if (arg0 != 7) {
				if (arg0 == 8) {
					this.aBoolean484 = arg1.method6433() == 1;
					return;
				}
				if (arg0 == 9) {
					this.anInt7752 = arg1.method6485();
					if (this.anInt7752 == 65535) {
						this.anInt7752 = -1;
					}
					this.anInt7755 = arg1.method6485();
					if (this.anInt7755 == 65535) {
						this.anInt7755 = -1;
					}
					this.anInt7757 = arg1.method6442();
					this.anInt7744 = arg1.method6442();
					return;
				}
				if (arg0 >= 10 && arg0 <= 14) {
					this.aStringArray48[arg0 - 10] = arg1.method6473();
					return;
				}
				@Pc(178) int local178;
				if (arg0 != 15) {
					if (arg0 == 16) {
						this.aBoolean485 = false;
						return;
					}
					if (arg0 != 17) {
						if (arg0 != 18) {
							if (arg0 != 19) {
								if (arg0 == 20) {
									this.anInt7741 = arg1.method6485();
									if (this.anInt7741 == 65535) {
										this.anInt7741 = -1;
									}
									this.anInt7728 = arg1.method6485();
									if (this.anInt7728 == 65535) {
										this.anInt7728 = -1;
									}
									this.anInt7735 = arg1.method6442();
									this.anInt7756 = arg1.method6442();
								} else if (arg0 == 21) {
									this.anInt7759 = arg1.method6442();
									return;
								} else if (arg0 == 22) {
									this.anInt7750 = arg1.method6442();
									return;
								} else if (arg0 == 249) {
									local169 = arg1.method6433();
									if (this.aClass74_34 == null) {
										local178 = Static52.method1203(local169);
										this.aClass74_34 = new Class74(local178);
									}
									for (local178 = 0; local178 < local169; local178++) {
										@Pc(199) boolean local199 = arg1.method6433() == 1;
										@Pc(205) int local205 = arg1.method6435();
										@Pc(214) Class6 local214;
										if (local199) {
											local214 = new Class6_Sub13(arg1.method6473());
										} else {
											local214 = new Class6_Sub39(arg1.method6442());
										}
										this.aClass74_34.method1890((long) local205, local214);
									}
									return;
								}
								return;
							}
							this.anInt7733 = arg1.method6485();
							return;
						}
						this.anInt7739 = arg1.method6485();
						return;
					}
					this.aString69 = arg1.method6473();
					return;
				}
				local169 = arg1.method6433();
				this.anIntArray531 = new int[local169 * 2];
				for (local178 = 0; local178 < local169 * 2; local178++) {
					this.anIntArray531[local178] = arg1.method6428();
				}
				this.anInt7740 = arg1.method6442();
				this.anInt7747 = arg1.method6442();
				return;
			}
			local169 = arg1.method6433();
			if ((local169 & 0x2) == 2) {
				this.aBoolean487 = true;
			}
			if ((local169 & 0x1) == 0) {
				this.aBoolean486 = false;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILclient!eq;)Lclient!qg;")
	public Class87 method6333(@OriginalArg(1) Class66 arg0) {
		@Pc(20) Class87 local20 = (Class87) this.aClass169_28.aClass44_37.method1353((long) (arg0.anInt5948 << 29 | 0x20000 | this.anInt7739));
		if (local20 != null) {
			return local20;
		}
		this.aClass169_28.aClass100_49.method2492(this.anInt7739);
		@Pc(45) Class194 local45 = Static458.method4494(this.aClass169_28.aClass100_49, this.anInt7739, 0);
		if (local45 != null) {
			local20 = arg0.method5038(local45);
			this.aClass169_28.aClass44_37.method1349(local20, (long) (arg0.anInt5948 << 29 | 0x20000 | this.anInt7739));
		}
		return local20;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILclient!eq;Z)Lclient!qg;")
	public Class87 method6335(@OriginalArg(1) Class66 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(11) int local11 = arg1 ? this.anInt7753 : this.anInt7745;
		@Pc(18) int local18 = arg0.anInt5948 << 29 | local11;
		@Pc(27) Class87 local27 = (Class87) this.aClass169_28.aClass44_37.method1353((long) local18);
		if (local27 != null) {
			return local27;
		} else if (this.aClass169_28.aClass100_49.method2492(local11)) {
			@Pc(47) Class194 local47 = Static458.method4494(this.aClass169_28.aClass100_49, local11, 0);
			if (local47 != null) {
				local27 = arg0.method5038(local47);
				this.aClass169_28.aClass44_37.method1349(local27, (long) local18);
			}
			return local27;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILclient!no;)Z")
	public boolean method6336(@OriginalArg(1) Interface6 arg0) {
		@Pc(22) int local22;
		if (this.anInt7755 == -1) {
			if (this.anInt7752 == -1) {
				return true;
			}
			local22 = arg0.method4635(this.anInt7752);
		} else {
			local22 = arg0.method4634(this.anInt7755);
		}
		if (local22 < this.anInt7757 || this.anInt7744 < local22) {
			return false;
		}
		@Pc(61) int local61;
		if (this.anInt7728 == -1) {
			if (this.anInt7741 == -1) {
				return true;
			}
			local61 = arg0.method4635(this.anInt7741);
		} else {
			local61 = arg0.method4634(this.anInt7728);
		}
		return this.anInt7735 <= local61 && this.anInt7756 >= local61;
	}
}
